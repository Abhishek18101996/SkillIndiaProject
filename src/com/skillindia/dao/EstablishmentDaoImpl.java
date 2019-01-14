package com.skillindia.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;
import com.skillindia.model.Establishment;

public class EstablishmentDaoImpl implements EstablishmentDao{

	private static final Logger logger = 
			LoggerFactory.getLogger(EstablishmentDaoImpl.class);

			private SessionFactory sessionFactory;

			@Autowired
			public void setSessionFactory(SessionFactory sf) {
			this.sessionFactory = sf;
			}

			@Override
			public void addEstablishment(Establishment p) {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(p);
			logger.info("Establishment saved successfully, Establishment Details= " + p);
			}

			@Override
			public void updateEstablishment(Establishment p) {
			Session session = 
			this.sessionFactory
			.getCurrentSession();
			session.update(p);
			logger.info("Establishment updated successfully, " + "Establishment Details=" + p);
			}

			@Override
			public void removeEstablishmentByName(String name) {
			Session session = this.sessionFactory.getCurrentSession();
			Establishment p = 
			(Establishment) session.load(Establishment.class, new String(name));
			if (null != p) {
			session.delete(p);
			}
			else {
			logger.error
			("Establishment NOT deleted, with Establishment Id=" +name);
			}
			logger.info("Establishment deleted successfully, Establishment details=" + p);
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
