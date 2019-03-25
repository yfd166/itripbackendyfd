package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.UserService;
import cn.itrip.beans.pojo.User;
import cn.itrip.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

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
}
