package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.SmsService;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SmsServiceImpl implements SmsService {
    @Override
    public void sendMsg(String to, String templateId, String[] datas) throws Exception {
        CCPRestSmsSDK sdk = new CCPRestSmsSDK();
        //1、初始【开发者账号】信息中的URL。
        sdk.init("app.cloopen.com","8883");
        //ACCOUNT SID和AUTH TOKEN
        sdk.setAccount("8aaf0708697b6beb0169c37e3c723337","717a89a405ee4c79940d00685a444840");
        sdk.setAppId("8aaf0708697b6beb0169c37e3cc4333d"); //AppID
        HashMap result = sdk.sendTemplateSMS(to,templateId, datas);
        //查看短信是否发送成功。就通过查看statusCoe的值是否为000000
        if ("000000".equals(result.get("statusCode"))) {
            System.out.println("短信发送成功");
        } else {
            throw new Exception(result.get("statusCode").toString() + ":" + result.get("statusMsg").toString());
        }
    }
}
