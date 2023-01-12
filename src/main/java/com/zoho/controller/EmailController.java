package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/composeEmail")
public String composeEmail(@RequestParam("email") String email,Model model) {
		System.out.println(email);
		model.addAttribute("email",email);
		return "compose_email" ;
	}
	@RequestMapping("/sendEmailNow")
	public String sendEmail(@RequestParam("to")String to,@RequestParam("subject")String sub,@RequestParam("msg")String msg,Model model) {
		emailService.sendEmail(to, sub, msg);
		model.addAttribute("msg","Email sent");
		
		return "compose_email";
	}
}
