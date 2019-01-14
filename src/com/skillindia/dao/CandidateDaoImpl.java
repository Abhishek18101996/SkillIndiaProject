package com.skillindia.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;

public class CandidateDaoImpl implements CandidateDao {

	private static final Logger logger = LoggerFactory.getLogger(CandidateDaoImpl.class);

	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addCandidate(Candidate p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.persist(p);
	logger.info("Candidate saved successfully, Candidate Details= " + p);
	}

	@Override
	public void updateCandidate(Candidate p) {
	Session session = 
	this.sessionFactory
	.getCurrentSession();
	session.update(p);
	logger.info("Candidate updated successfully, " + "Candidate Details=" + p);
	}

	@Override
	public void removeCandidate(String name) {
	Session session = this.sessionFactory.getCurrentSession();
	Candidate p = 
	(Candidate) session.load(Candidate.class, new String(name));
	if (null != p) {
	session.delete(p);
	}
	else {
	logger.error
	("Candidate NOT deleted, with Candidate Id=" +name);
	}
	logger.info("Candidate deleted successfully, Candidate details=" + p);
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
