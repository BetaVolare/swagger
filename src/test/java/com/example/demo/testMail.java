package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class testMail {

    @Autowired
    private JavaMailSender mailSender;


    //纯文本邮件
   // @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("935339656@qq.com");
        message.setTo("375047125@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
        System.out.print("发送成功");
    }

    //有附件邮件
    @Test
    public void sendAttachmentsMail() throws Exception {
       for (int i=0;i<4;i++){
           MimeMessage mimeMailMessage = mailSender.createMimeMessage();
           MimeMessageHelper helper = new MimeMessageHelper(mimeMailMessage,true);
           helper.setFrom("935339656@qq.com");
           helper.setTo("347954141@qq.com");
           helper.setSubject("主题：有附件");
           helper.setText("有附件的邮件");
           FileSystemResource file = new FileSystemResource(new File("C:\\Users\\Administrator\\Desktop\\lp.png"));
           helper.addAttachment("1.png", file);
           mailSender.send(mimeMailMessage);
           System.out.print("已发送第"+i+"封");
       }
    }




}
