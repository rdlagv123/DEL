package com.zoho.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailServiceImpl implements EmailService {
@Autowired
JavaMailSender mailSender;
	@Override
	public void sendEmail(String to, String sub, String msg) {
		SimpleMailMessage mailMessage= new SimpleMailMessage();
		 mailMessage.setTo(to);
		 mailMessage.setSubject(sub);
		 mailMessage.setText(msg);
		 mailSender.send(mailMessage);

	}

}
