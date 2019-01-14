package com.skillindia.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MyCandidate")
//Candidate is a user of the organisation
public class Candidate implements Serializable{

	//declarations
	private static final long serialVersionUID = 1L;

	private String candiadteUsername;
	
	private String candidatePassword;
	
	@OneToOne(cascade=CascadeType.ALL)
	User userCandidate = new User(candiadteUsername, candidatePassword);//Candidate is a user who will register itself with the organisation
	
	@Id
	@Column(name="Candidate_Name")
	private String candidateName;//Name of the Candidate
	private String Gender;//gender of the user
	private String contact;//contact number of the user
	private String aadhaarNumber;//Aadhaar reference of the candidate
	private String EducationalDetails;//Qualification of the candidate
	//Address details of candidate
	private String cHouse_no,cStreet,cCity,cDistrict,cState,cCountry;
	private int cPincode;
	//Bank Details of candidate
	private String CbankName;//Candidate's Bank-Name
	private String CbankBranch;//Candidate's Bank-Branch
	private String CbankIFSC;//Candidate's bank IFSC code
	private String CaccountNumber;//Candidate's Account Number
	
	@OneToOne(cascade=CascadeType.ALL)
	BankDetails candidateBankDetails = new BankDetails(CbankName, CbankBranch, CbankIFSC, CaccountNumber);
	
	@OneToOne(cascade=CascadeType.ALL)
	Address candidateAddress = new Address(cHouse_no, cStreet, cCity, cDistrict, cState, cCountry, cPincode);
	
	@OneToOne(cascade=CascadeType.ALL)
	Courses candidateCourse = new Courses();
	
	//parameterized constructor
	public Candidate(String candidateName, String gender, String contact, String aadhaarNumber,
			String educationalDetails, BankDetails candidateBankDetails, Address candidateAddress) {
		super();
		this.candidateName = candidateName;
		Gender = gender;
		this.contact = contact;
		this.aadhaarNumber = aadhaarNumber;
		EducationalDetails = educationalDetails;
		this.candidateBankDetails = candidateBankDetails;
		this.candidateAddress = candidateAddress;
	}

	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + ", Gender=" + Gender + ", contact=" + contact
				+ ", aadhaarNumber=" + aadhaarNumber + ", EducationalDetails=" + EducationalDetails
				+ ", candidateBankDetails=" + candidateBankDetails + ", candidateAddress=" + candidateAddress + "]";
	}

	public String getCandiadteUsername() {
		return candiadteUsername;
	}

	public void setCandiadteUsername(String candiadteUsername) {
		this.candiadteUsername = candiadteUsername;
	}

	public String getCandidatePassword() {
		return candidatePassword;
	}

	public void setCandidatePassword(String candidatePassword) {
		this.candidatePassword = candidatePassword;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getEducationalDetails() {
		return EducationalDetails;
	}

	public void setEducationalDetails(String educationalDetails) {
		EducationalDetails = educationalDetails;
	}

	public String getcHouse_no() {
		return cHouse_no;
	}

	public void setcHouse_no(String cHouse_no) {
		this.cHouse_no = cHouse_no;
	}

	public String getcStreet() {
		return cStreet;
	}

	public void setcStreet(String cStreet) {
		this.cStreet = cStreet;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public String getcDistrict() {
		return cDistrict;
	}

	public void setcDistrict(String cDistrict) {
		this.cDistrict = cDistrict;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcCountry() {
		return cCountry;
	}

	public void setcCountry(String cCountry) {
		this.cCountry = cCountry;
	}

	public int getcPincode() {
		return cPincode;
	}

	public void setcPincode(int cPincode) {
		this.cPincode = cPincode;
	}

	public String getCbankName() {
		return CbankName;
	}

	public void setCbankName(String cbankName) {
		CbankName = cbankName;
	}

	public String getCbankBranch() {
		return CbankBranch;
	}

	public void setCbankBranch(String cbankBranch) {
		CbankBranch = cbankBranch;
	}

	public String getCbankIFSC() {
		return CbankIFSC;
	}

	public void setCbankIFSC(String cbankIFSC) {
		CbankIFSC = cbankIFSC;
	}

	public String getCaccountNumber() {
		return CaccountNumber;
	}

	public void setCaccountNumber(String caccountNumber) {
		CaccountNumber = caccountNumber;
	}
	
}
