package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.MailService;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("mailService")
public class MailServiceImpl implements MailService {

    @Resource
    private SimpleMailMessage activationMailMessage;

    @Resource
    private MailSender mailSender;

    @Override
    public void sendActivationMail(String mailTo, String activationCode) {
        activationMailMessage.setTo(mailTo);
        activationMailMessage.setText("您的激活码是：" + activationCode);
        mailSender.send(activationMailMessage);
    }
}
