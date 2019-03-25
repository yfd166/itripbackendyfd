package cn.itrip.auth.service;

import cn.itrip.beans.pojo.User;

public interface UserService {
    User login(String userCode,String password) throws Exception;
}
