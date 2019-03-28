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

    /**
     * 通过手机注册完成用户的新增操作
     * @param user 用户对象
     */
    public void insertUserByPhone(User user) throws Exception;

    /**
     * 短信验证
     * @param phoneNum 手机号码
     * @param code 验证码
     * @return true表示验证成功，false表示验证失败。
     */
    public boolean validatePhone(String phoneNum,String code) throws Exception;

}
