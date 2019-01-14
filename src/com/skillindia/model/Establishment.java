package com.skillindia.model;

import java.io.File;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.skillindia.model.User;

//The particular establishment will be the entity that will provide courses to candidate entity

@Entity
@Table(name = "Establishment")
public class Establishment implements Serializable{

	private static final long serialVersionUID = 1L;
	// Declarations..
	private String establishmentUsername;
	private String establishmentPassword;

	@OneToMany(cascade = CascadeType.ALL)
	User establishmentUser = new User(establishmentUsername, establishmentPassword);// Establishment is a User since it
		// will register with its own
		// identity in the organisation

	@Id
	@Column(name = "EstablishmentName")
	private String establishmentName;// The name of the establishment

	private String EstablishmentType;// determine the type whether engineering or pharmacy
	private int contact, workingDaysPerWeek;// Contact details and working days of the establishment during course
	File Contract = new File(EstablishmentType);// The legal signed contract of the establishment entrusted by governing
												// body

	
	
	// Address details of candidate
	private String eHouse_no, eStreet, eCity, eDistrict, eState, eCountry;
	private int ePincode;
	
	// Bank Details of candidate
	private String EbankName;// Candidate's Bank-Name
	private String EbankBranch;// Candidate's Bank-Branch
	private String EbankIFSC;// Candidate's bank IFSC code
	private String EaccountNumber;// Candidate's Account Number

	@OneToOne(cascade = CascadeType.ALL)
	BankDetails establishmentBankDetails = new BankDetails(EbankName, EbankBranch, EbankIFSC, EaccountNumber);

	@OneToOne(cascade = CascadeType.ALL)
	Address establishmentAddress = new Address(eHouse_no, eStreet, eCity, eDistrict, eState, eCountry, ePincode);

	@OneToMany(cascade=CascadeType.ALL)
	Institution institute = new Institution();
	
	@OneToMany(cascade=CascadeType.ALL)
	Courses course = new Courses();

	@ManyToOne(cascade=CascadeType.ALL)
	Domain domain = new Domain();
	
	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}


	public BankDetails getEstablishmentBankDetails() {
		return establishmentBankDetails;
	}

	public void setEstablishmentBankDetails(BankDetails establishmentBankDetails) {
		this.establishmentBankDetails = establishmentBankDetails;
	}

	public Address getEstablishmentAddress() {
		return establishmentAddress;
	}

	public void setEstablishmentAddress(Address establishmentAddress) {
		this.establishmentAddress = establishmentAddress;
	}

	public Institution getInstitute() {
		return institute;
	}

	public void setInstitute(Institution institute) {
		this.institute = institute;
	}
	
	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	
	public String geteHouse_no() {
		return eHouse_no;
	}

	public void seteHouse_no(String eHouse_no) {
		this.eHouse_no = eHouse_no;
	}

	public String geteStreet() {
		return eStreet;
	}

	public void seteStreet(String eStreet) {
		this.eStreet = eStreet;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public String geteDistrict() {
		return eDistrict;
	}

	public void seteDistrict(String eDistrict) {
		this.eDistrict = eDistrict;
	}

	public String geteState() {
		return eState;
	}

	public void seteState(String eState) {
		this.eState = eState;
	}

	public String geteCountry() {
		return eCountry;
	}

	public void seteCountry(String eCountry) {
		this.eCountry = eCountry;
	}

	public int getePincode() {
		return ePincode;
	}

	public void setePincode(int ePincode) {
		this.ePincode = ePincode;
	}

	public String getEbankName() {
		return EbankName;
	}

	public void setEbankName(String ebankName) {
		EbankName = ebankName;
	}

	public String getEbankBranch() {
		return EbankBranch;
	}

	public void setEbankBranch(String ebankBranch) {
		EbankBranch = ebankBranch;
	}

	public String getEbankIFSC() {
		return EbankIFSC;
	}

	public void setEbankIFSC(String ebankIFSC) {
		EbankIFSC = ebankIFSC;
	}

	public String getEaccountNumber() {
		return EaccountNumber;
	}

	public void setEaccountNumber(String eaccountNumber) {
		EaccountNumber = eaccountNumber;
	}

	
	public String getEstablishmentUsername() {
		return establishmentUsername;
	}

	public void setEstablishmentUsername(String establishmentUsername) {
		this.establishmentUsername = establishmentUsername;
	}

	public User getEstablishmentUser() {
		return establishmentUser;
	}

	public String getEstablishmentPassword() {
		return establishmentPassword;
	}

	public void setEstablishmentPassword(String establishmentPassword) {
		this.establishmentPassword = establishmentPassword;
	}

	public void setEstablishmentUser(User establishmentUser) {
		this.establishmentUser = establishmentUser;
	}

	public String getEstablishmentName() {
		return establishmentName;
	}

	public void setEstablishmentName(String establishmentName) {
		this.establishmentName = establishmentName;
	}

	public String getEstablishmentType() {
		return EstablishmentType;
	}

	public void setEstablishmentType(String establishmentType) {
		EstablishmentType = establishmentType;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getWorkingDaysPerWeek() {
		return workingDaysPerWeek;
	}

	public void setWorkingDaysPerWeek(int workingDaysPerWeek) {
		this.workingDaysPerWeek = workingDaysPerWeek;
	}

	public File getContract() {
		return Contract;
	}

	public void setContract(File contract) {
		Contract = contract;
	}


	// SuperClass Constructor
		public Establishment() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	// parameterized constructor for registration
	public Establishment(String establishmentUsername, String establishmentPassword, String establishmentName,
			String establishmentType, int contact, int workingDaysPerWeek, File contract, String eHouse_no,
			String eStreet, String eCity, String eDistrict, String eState, String eCountry, int ePincode,
			String ebankName, String ebankBranch, String ebankIFSC, String eaccountNumber) {
		super();
		this.establishmentUsername = establishmentUsername;
		this.establishmentPassword = establishmentPassword;
		this.establishmentName = establishmentName;
		EstablishmentType = establishmentType;
		this.contact = contact;
		this.workingDaysPerWeek = workingDaysPerWeek;
		Contract = contract;
		this.eHouse_no = eHouse_no;
		this.eStreet = eStreet;
		this.eCity = eCity;
		this.eDistrict = eDistrict;
		this.eState = eState;
		this.eCountry = eCountry;
		this.ePincode = ePincode;
		EbankName = ebankName;
		EbankBranch = ebankBranch;
		EbankIFSC = ebankIFSC;
		EaccountNumber = eaccountNumber;
	}

}
