package com.skillindia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillindia.exception.CustomException;
import com.skillindia.model.Institution;
import com.skillindia.service.InstitutionService;

@Controller
public class InstitutionController {

	public InstitutionService institutionService;

	@Autowired
	public InstitutionService getInstitutionService() {
		return institutionService;
	}

	@RequestMapping(value="/institution/add", method = RequestMethod.POST)
	@ExceptionHandler({CustomException.class})
	public void addEstablishment(@ModelAttribute("institution") @Valid Institution institution,
			BindingResult result, Model model)
	{
		if(!result.hasErrors()) {
			if(institution.getInstituteName()==null) {
				this.institutionService.addInstitution(institution);
			}
			else {
				this.institutionService.addInstitution(institution);
			}
		}
	}
	
	@RequestMapping(value="edit/{institution_Name}")
	public void updateEstablishment(@PathVariable("institution_Name") String name, Model model) 
	{
		Institution institutionUpdate = this.institutionService.getInstitutionByName(name);
		model.addAttribute("institution", institutionUpdate);
	}
	
	@RequestMapping("/remove/{institution_Name}")
	public void removeEstablishment(@PathVariable("institution_Name") String name,
			Model model) {
		if(name!=null) {
			this.institutionService.removeInstitutionByName(name);
		}
		else {
			throw new CustomException("Given Candidate Not Found", "404");
		}
	}
}
