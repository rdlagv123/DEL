package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Contacts;
import com.zoho.entities.Lead;
import com.zoho.services.ContactService;
import com.zoho.services.LeadService;
@Controller
public class LeadController {
	@Autowired LeadService leadService;
	@Autowired ContactService contactService;
	@RequestMapping(value="/createLeadNow",method=RequestMethod.GET)
public String viewcreateLeadForm() {
	return "create_Lead";
}
	@RequestMapping(value="/saveLeadNow", method=RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveLead( lead);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	@RequestMapping(value="/convertLeadNow", method=RequestMethod.POST)
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		
		Contacts contact = new Contacts();
		
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.SaveContact(contact);
		leadService.deleteLeadById(id);
		
		List<Contacts> contacts =contactService.getContacts();
		model.addAttribute("contacts", contacts);
		
		return "list_contacts";
	}
	@RequestMapping("/listLeads")
	public String listLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	@RequestMapping("/updateLead")
	public String updateLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead",lead);
		return "update_Lead";
	}
	@RequestMapping("/last")
	public String UpdateLeadDetails(@ModelAttribute("lead")Lead lead,Model model) {
		
		leadService.saveOneLead(lead);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	@RequestMapping("/deleteLead")
	public String deleteLead(@RequestParam("id") long id,Model model) {
		leadService.deleteLeadById(id);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		model.addAttribute("msg","Record is successfully deleted");
		return "list_leads";
	}
}
