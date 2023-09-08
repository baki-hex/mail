package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Serv {
    
    @Autowired
    JavaMailSender jmail;
    
    public void sett(String to,String text){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(to);
    message.setText(text);

    jmail.send(message);
}
    
}
