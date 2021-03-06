package com.skillindia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;
import com.skillindia.model.Establishment;

@Service
public interface EstablishmentService {
	public void addEstablishment(Establishment p);//insert
	public void updateEstablishment(Establishment p);//update/modify
	public void removeEstablishmentByName(String name);//delete/remove
	public void addCourse(Courses establishmentCourse);//Establishment adds courses available with its organisation
	public void evaluateCandidate(Candidate candidateProgress);//Establishment evaluates candidate based on its behaviour and performance during course
	public Establishment getEstablishmentByName(String establishmentName);
}
