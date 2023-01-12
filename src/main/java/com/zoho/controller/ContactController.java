package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Billing;
import com.zoho.entities.Contacts;
import com.zoho.services.BillingService;
import com.zoho.services.ContactService;

@Controller
public class ContactController {
@Autowired
ContactService contactService;
@Autowired
BillingService billService;
@RequestMapping("/listContacts")
public String getAllContacts(Model model) {
	List<Contacts> contacts = contactService.getContacts();
	model.addAttribute("contacts",contacts);
	return "list_contacts";
}

@RequestMapping("/createBill")
public String getContactById(@RequestParam("id") long id,Model model) {
	Contacts contactById = contactService.getContactById(id);
	model.addAttribute("contactById",contactById);
	return "generate_bill";
}
@RequestMapping("/saveBill")
	public String saveBill(Billing bill,Model model) {
		billService.generateBill(bill);
		return "show_Bill";
}
@RequestMapping("/showBill")
public String showBill(@RequestParam("id") long id,Model model) {		
		 Billing bills = billService.getBill( id);
		 
		model.addAttribute("bills",bills);
		return "show_Bill";
}
	
	
}

