package com.augur.dogOdyssey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class emailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(contactForm cForm){
        SimpleMailMessage userMessage = new SimpleMailMessage();
        userMessage.setFrom(cForm.email);
        userMessage.setSubject("New message from" + cForm.email);
        userMessage.setText(cForm.messageBody);

        emailSender.send(userMessage);
    }
}
