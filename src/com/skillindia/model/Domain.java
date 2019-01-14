package com.skillindia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Domain")
public class Domain implements Serializable{

	private static final long serialVersionUID = 1L;
	//Declarations
	@Id
	@Column(name="Domain_Id",unique=true,nullable=false)
	private int domainId;//Primary Key reference for a particular domain
	@Column(name="Domain_Name")
	private String domainName;//Domain-Name
	
	//SuperClass Constructor
	public Domain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domain(String domainName) {
		super();
		this.domainName = domainName;
	}
	
	
	
}
