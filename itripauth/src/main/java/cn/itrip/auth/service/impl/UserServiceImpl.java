package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.MailService;
import cn.itrip.auth.service.SmsService;
import cn.itrip.auth.service.UserService;
import cn.itrip.beans.pojo.User;
import cn.itrip.common.MD5;
import cn.itrip.common.RedisAPI;
import cn.itrip.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private MailService mailService;

    @Resource
    private RedisAPI redisAPI;

    @Resource
    private SmsService smsService;

    @Override
    public void insertUser(User user) throws Exception {
        //1、添加用户
        userMapper.insert(user);

        //2、生成激活码， new Date().toLocaleString()生成日期和时间，
        //格式如：2019-1-25 22:56:32，然后进行32位的MD5加密
        String activationCode = MD5.getMd5(new Date().toLocaleString(), 32);
        System.out.println(activationCode);
        //3、发送邮件
        mailService.sendActivationMail(user.getUsercode(),activationCode);
        //4、激活码存入Redis中
        redisAPI.set("activation:" + user.getUsercode(),30 * 60, activationCode);

    }

    public User findByUsername(String username){
        Map<String, Object> param=new HashMap();
        param.put("userCode", username);
        List<User> list= userMapper.getItripUserListByMap(param);
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }


    @Override
    public User login(String userCode, String password) throws Exception {
        User user = this.findByUsername(userCode);
        if(null !=user && user.getUserpassword().equals(password)) {
            if(user.getActivated() != 1){
                throw new Exception("账号尚未激活！");
            }
            return user;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean activate(String mail, String code) throws Exception {
        //1、验证激活码
        String value = redisAPI.get("activation:" + mail);
        if (value.equals(code)) {
            User user = findByUsername(mail);
            //2、更新用户
            user.setActivated(1);  //激活账户
            user.setUsertype(0); //自注册用户
            user.setFlatid(user.getId());
            userMapper.updateByPrimaryKey(user);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void insertUserByPhone(User user) throws Exception {
        //1、创建用户
        userMapper.insert(user);
        //2、生成验证码(1111-9999)
        int code = MD5.getRandomCode();
        //3、发送验证码，  “1”为默认模板id的值。
        smsService.sendMsg(user.getUsercode(), "1", new String[] {String.valueOf(code), "1"});
        //4、缓存验证码到Redis数据库中， 有效期为60秒，测试时可以设置大一点。
        redisAPI.set("activation:" + user.getUsercode(), 60, String.valueOf(code));

    }

    @Override
    public boolean validatePhone(String phoneNum, String code) throws Exception {
        //1、对比验证码
        String key = "activation:" + phoneNum;
        String value = redisAPI.get(key);
        if (value != null && value.equals(code)) {
            User user = findByUsername(phoneNum);
            if (user != null) {
                //2、更新用户激活状态
                user.setActivated(1);  //表示激活
                user.setFlatid(user.getId()); //设置平台ID
                user.setUsertype(0);
                userMapper.updateByPrimaryKey(user);
                return true;
            }
        }
        return false;

    }
}
