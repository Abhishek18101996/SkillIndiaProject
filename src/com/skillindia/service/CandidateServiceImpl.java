package com.skillindia.service;

import java.util.List;

import com.skillindia.dao.CandidateDao;
import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;

public class CandidateServiceImpl implements  CandidateService {

private 	CandidateDao cdDao;
	@Override
	public void addCandidate(Candidate p) {
		cdDao.addCandidate(p);
		
	}

	@Override
	public void updateCandidate(Candidate p) {
		cdDao.updateCandidate(p);
		
	}

	@Override
	public void removeCandidate(String name) {
		cdDao.removeCandidate(name);
		
	}

	@Override
	public List<Courses> browseCourse(String searchQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void applyForCourse(String courseName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Candidate getCandidateByName(String candidateName) {
		// TODO Auto-generated method stub
		return null;
	}

}
