package org.softwaresquare.orms.controller;

import java.util.Locale;

import org.softwaresquare.orms.service.RequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequirementsController {
	@Autowired
	private RequirementsService requirementsService;
	
	@RequestMapping(value = "/requirements/list", method = RequestMethod.GET)
	public String requirementsList(Locale locale, Model model) {
		model.addAttribute("requirementsList", this.requirementsService.getRequirementsList(1, 1));
		
		return "requirements";
	}
}
