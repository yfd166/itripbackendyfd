package cn.itrip.auth.service;

import cn.itrip.beans.pojo.User;

public interface TokenService {
    /**
     * 按指定的格式生成Token
     * @Param userAgent 用户的唯一标识
     */
    public String generateToken(String userAgent, User user);
    /**
     * 将Token保存至Redis缓存数据库中
     * @Param token Token对象，
     */
    public void save(String token, User user);

}
