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
import com.skillindia.model.Establishment;
import com.skillindia.service.EstablishmentService;

@Controller
public class EstablishmentController {

	public EstablishmentService establishmentService;

	@Autowired
	public EstablishmentService getEstablishmentService() {
		return establishmentService;
	}
	
	@RequestMapping(value="/establishment/add", method = RequestMethod.POST)
	@ExceptionHandler({CustomException.class})
	public void addEstablishment(@ModelAttribute("establishment") @Valid Establishment establishment,
			BindingResult result, Model model)
	{
		if(!result.hasErrors()) {
			if(establishment.getEstablishmentName()==null) {
				this.establishmentService.addEstablishment(establishment);
			}
			else {
				this.establishmentService.addEstablishment(establishment);
			}
		}
	}
	
	@RequestMapping(value="edit/{establishment_Name}")
	public void updateEstablishment(@PathVariable("establishment_Name") String name, Model model) 
	{
		Establishment establishmentUpdate = this.establishmentService.getEstablishmentByName(name);
		model.addAttribute("establishment", establishmentUpdate);
	}
	
	@RequestMapping("/remove/{establishment_Name}")
	public void removeEstablishment(@PathVariable("establishment_Name") String name,
			Model model) {
		if(name!=null) {
			this.establishmentService.removeEstablishmentByName(name);
		}
		else {
			throw new CustomException("Given Candidate Not Found", "404");
		}
	}
}
