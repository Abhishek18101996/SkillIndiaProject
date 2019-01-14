package com.skillindia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillindia.model.Institution;

@Service
public interface InstitutionService {
	public void addInstitution(Institution p);//insert
	public void updateInstitution(Institution p);//update/modify
	public void removeInstitutionByName(String name);//delete/remove
	public Institution getInstitutionByName(String institutionName);
}
