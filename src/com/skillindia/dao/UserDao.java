package com.skillindia.dao;

import java.util.List;

import com.skillindia.model.User;

public interface UserDao {
	
	public void addUser(User p);//insert
	public void updateUser(User p);//update/modify
	public List<User> listUsers();//retrieve/listAll
	public void removeUser(int id);//delete/remove
	public User getUserById(int id);
}
