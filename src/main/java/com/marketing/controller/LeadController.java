package com.marketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketing.entity.Lead;
import com.marketing.services.A;

@Controller
public class LeadController {
	
	@Autowired
	private A a;
	
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_lead";
		}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		a.saveLead(lead);
		model.addAttribute("msg", "Lead saved!!");
		return "create_lead";
	}
}
