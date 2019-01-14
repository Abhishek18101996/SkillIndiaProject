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
import com.skillindia.model.Candidate;
import com.skillindia.service.CandidateService;

@Controller
public class CandidateController {

	public CandidateService candidateService;
	
	@Autowired
	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}
	
	@RequestMapping(value = "/candidate/add",method = RequestMethod.POST)
	@ExceptionHandler({CustomException.class})
	public void addCandidate(@ModelAttribute("candidate") @Valid Candidate candidate,
			BindingResult result, Model model) {
		if(!result.hasErrors()) {
			if(candidate.getCandidateName()==null) {
				this.candidateService.addCandidate(candidate);
			}
			else {
				this.candidateService.addCandidate(candidate);
			}
		}
	}
	
	@RequestMapping("edit/{candidate_Name}")
	public void updateCandidate(@PathVariable("candidate_Name") String name, Model model) {
		Candidate candidateUpdate = this.candidateService.getCandidateByName(name);
		model.addAttribute("candidate", candidateUpdate);
		
	}
	
	@RequestMapping("/remove/{candidate_name}")
	public void removeCandidate(@PathVariable("candidate_name") String name,
			Model model) {
		if(name!=null) {
			this.candidateService.removeCandidate(name);
		}
		else {
			throw new CustomException("Given Candidate Not Found", "404");
		}
	}
}
