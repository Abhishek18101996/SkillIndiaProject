package com.skillindia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//The base class user defines the login operations of various user in the organisation
@Entity
@Table(name="user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Username", unique=true, nullable=false)
	private String username;
	@Column(name="PassWord", unique=false, nullable=false)
	private String password;		//type to be determined later
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
