package com.emailWithSpringboot.emailWithSpringboot.Gradle.controller;

import com.emailWithSpringboot.emailWithSpringboot.Gradle.entity.User;
import com.emailWithSpringboot.emailWithSpringboot.Gradle.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMailController {
// this is for check error when program will run
    private Logger logger = LoggerFactory.getLogger(TestMailController.class);

    private final EmailService emailService;

    @Autowired
    public TestMailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping("/emailTest")
    public String EmailSend(){
     User user = new User();
     user.setFName("Asanka");
     user.setLName("Lalith");
     user.setEmail("asakahatapitiya@gmail.com");
     //send email
     try {
         emailService.sendEmail(user);
     }catch (MailException e){
        logger.info("Error has happned: "+ e.getMessage());
     }
            return "Good Job";
 }
}
