package com.emailWithSpringboot.emailWithSpringboot.Gradle.service;

import com.emailWithSpringboot.emailWithSpringboot.Gradle.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    public void sendEmail(User user) throws MailException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(user.getEmail());
        mailMessage.setFrom("ExcellentHealth");
        mailMessage.setSubject(" Test Email");
        mailMessage.setText("Email send Succesfully");

        javaMailSender.send(mailMessage);

    }
}
