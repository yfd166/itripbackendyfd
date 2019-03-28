package cn.itrip.auth.controller;

import cn.itrip.auth.service.UserService;
import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.User;
import cn.itrip.beans.vo.userinfo.ItripUserVO;
import cn.itrip.common.DtoUtil;
import cn.itrip.common.ErrorCode;
import cn.itrip.common.MD5;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/api")
public class UserController {
    @Resource
    private UserService userService;
    /**
     * 使用邮箱注册
     * @param userVO
     */
    @ApiOperation(value="使用邮箱注册",httpMethod = "POST",
            protocols = "HTTP",  response = Dto.class,notes="使用邮箱注册 ")
    @RequestMapping(value="/doregister",method= RequestMethod.POST)
    @ResponseBody
    public  Dto doRegister(@RequestBody ItripUserVO userVO) {
        if(!validEmail(userVO.getUserCode())) {
            return DtoUtil.returnFail("请使用正确的邮箱地址注册", ErrorCode.AUTH_ILLEGAL_USERCODE);
        }
        try {
            User user=new User();
            user.setUsercode(userVO.getUserCode());
            user.setUserpassword(userVO.getUserPassword());
            user.setUsertype(0);
            user.setUsername(userVO.getUserName());
            //用户唯一性验证
            if (null == userService.findByUsername(user.getUsercode())) {
                user.setUserpassword(MD5.getMd5(user.getUserpassword(), 32));
                userService.insertUser(user);
                return DtoUtil.returnSuccess();
            } else {
                return DtoUtil.returnFail("用户已存在，注册失败", ErrorCode.AUTH_USER_ALREADY_EXISTS);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail(e.getMessage(), ErrorCode.AUTH_UNKNOWN);
        }
    }


    /**           *
     * 合法E-mail地址：
     * 1. 必须包含一个并且只有一个符号“@”
     * 2. 第一个字符不得是“@”或者“.”
     * 3. 不允许出现“@.”或者.@
     * 4. 结尾不得是字符“@”或者“.”
     * 5. 允许“@”前的字符中出现“＋”
     * 6. 不允许“＋”在最前面，或者“＋@”
     */
    private boolean validEmail(String email){
        String regex="^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$"  ;
        return Pattern.compile(regex).matcher(email).find();
    }


    @ApiOperation(value="邮箱注册用户激活",httpMethod = "PUT",
            protocols = "HTTP",  response = Dto.class,notes="邮箱激活")
    @RequestMapping(value="/activate",method=RequestMethod.PUT)
    @ResponseBody
    public Dto activate( @RequestParam String user,
                         @ApiParam(name="code",value="激活码",defaultValue="018f9a8b2381839ee6f40ab2207c0cfe")
                         @RequestParam String code){
        try {
            if(userService.activate(user, code)) {
                return DtoUtil.returnSuccess("激活成功");
            }else{
                return DtoUtil.returnSuccess("激活失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("激活失败", ErrorCode.AUTH_ACTIVATE_FAILED);
        }
    }

}
