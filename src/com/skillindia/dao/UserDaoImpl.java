package com.skillindia.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.skillindia.model.User;

public class UserDaoImpl implements UserDao {

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(User p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("User saved successfully, User Details= " + p);

	}

	@Override
	public void updateUser(User p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("User updated successfully, " + "User Details=" + p);

	}

	
	@Override
	public List<User> listUsers() {
	Session session = this.sessionFactory.getCurrentSession();
	List<User> UsersList = session.createQuery("from User").list();
	for (User p : UsersList) 
	{
	logger.info("User List::" + p);
	}
	return UsersList;
	}


	@Override
	public User getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = 
				(User) session.load(User.class, id);
		logger.info("User loaded successfully, User details=" + p);
		return p;

	}

	@Override
	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = 
		(User) session.load(User.class, id);
		if (null != p) {
		session.delete(p);
		}
		else {
		logger.error
		("User NOT deleted, with User Id=" +id);
		}
		logger.info("User deleted successfully, User details=" + p);
		}

	}

	

