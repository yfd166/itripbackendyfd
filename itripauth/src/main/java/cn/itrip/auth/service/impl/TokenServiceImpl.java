package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.TokenService;
import cn.itrip.beans.pojo.User;
import cn.itrip.common.MD5;
import cn.itrip.common.RedisAPI;
import com.alibaba.fastjson.JSON;
import nl.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("tokenService")
public class TokenServiceImpl implements TokenService {

    @Resource
    private RedisAPI redisAPI;

    @Override
    public String generateToken(String userAgent, User user) {
        StringBuilder str = new StringBuilder("token:");
        //1. User Agent中文名为用户代理，简称 UA，它是一个特殊字符串头。 注：在浏览器中按F12->Headers可以看到User-Agent
        //   Java中通过浏览器请求头（User-Agent）获取 浏览器类型，操作系统类型，手机机型。
        //2. UserAgent agent = UserAgent.parseUserAgentString(userAgent);   得到用户代理对象。
        //3. Browser browser = userAgent.getBrowser();  获取浏览器。
        //4. OperatingSystem os = userAgent.getOperatingSystem();  获取操作系统。
        UserAgent agent = UserAgent.parseUserAgentString(userAgent);
        if (agent.getOperatingSystem().isMobileDevice()) {
            //当前用户的操作系统是移动端。
            str.append("MOBILE-");
        } else {
            str.append("PC-");
        }
        str.append(MD5.getMd5(user.getUsercode(),32) + "-");
        str.append(user.getId().toString() + "-");
        str.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "-");
        str.append(MD5.getMd5(userAgent, 6));
        return str.toString();

    }

    @Override
    public void save(String token, User user) {
        if (token.startsWith("token:PC-")) {  //PC端, 有效期是以【秒】为单位。
            redisAPI.set(token, 2 * 60 * 60, JSON.toJSONString(user));
        } else {  //移动端, 当不设置有效期，默认是一直有效.
            redisAPI.set(token, JSON.toJSONString(user));
        }

    }
}
