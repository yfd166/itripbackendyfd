package cn.itrip.auth.service;

import cn.itrip.beans.pojo.User;

public interface UserService {

    User login(String userCode,String password) throws Exception;

    void insertUser(User user) throws Exception;

    User findByUsername(String userCode) throws Exception;

    /**
     * 邮箱激活
     * @param mail 邮箱地址
     * @param code 为存入到Redis的激活码所对应的key。格式是：activation: + 验证码
     * @return true/false，true表示验证成功
     */
    public boolean activate(String mail,String code) throws Exception ;

}
