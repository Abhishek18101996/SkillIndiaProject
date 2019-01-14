package com.skillindia.service;

import com.skillindia.dao.EstablishmentDao;
import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;
import com.skillindia.model.Establishment;

public class EstablishmentServiceImpl implements EstablishmentService {

	private EstablishmentDao establishmentdao;

	@Override
	public void addEstablishment(Establishment p) {
		establishmentdao.addEstablishment(p);
	}

	@Override
	public void updateEstablishment(Establishment p) {
		establishmentdao.updateEstablishment(p);
	}

	@Override
	public void removeEstablishmentByName(String name ) {
		establishmentdao.removeEstablishmentByName(name);
	}

	@Override
	public void addCourse(Courses establishmentCourse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evaluateCandidate(Candidate candidateProgress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Establishment getEstablishmentByName(String establishmentName) {
		// TODO Auto-generated method stub
		return null;
	}

}
