package com.abcbank.LoanManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String firstName;
	public String middleName;
	public String lastName;
	public String dateOfBirth;
	public String maritalStatus;
	public String ssnNumber;
	public int loanAmmount;
	public String loanPurpose;
	public String description;
	public String addressLine1;
	public String addressLine2;
	public String city;
	public String state;
	public int postalCode;
	public long mobileNumber;
	public String emailAddress;
	public String employerName;
	public long annualSalary;
	public String designation;
	public String employerAddressLine1;
	public String employerAddressLine2;
	public String employerCity;
	public String employerState;
	public int employerPostalCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	public int getLoanAmmount() {
		return loanAmmount;
	}
	public void setLoanAmmount(int loanAmmount) {
		this.loanAmmount = loanAmmount;
	}
	public String getLoanPurpose() {
		return loanPurpose;
	}
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public long getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployerAddressLine1() {
		return employerAddressLine1;
	}
	public void setEmployerAddressLine1(String employerAddressLine1) {
		this.employerAddressLine1 = employerAddressLine1;
	}
	public String getEmployerAddressLine2() {
		return employerAddressLine2;
	}
	public void setEmployerAddressLine2(String employerAddressLine2) {
		this.employerAddressLine2 = employerAddressLine2;
	}
	public String getEmployerCity() {
		return employerCity;
	}
	public void setEmployerCity(String employerCity) {
		this.employerCity = employerCity;
	}
	public String getEmployerState() {
		return employerState;
	}
	public void setEmployerState(String employerState) {
		this.employerState = employerState;
	}
	public int getEmployerPostalCode() {
		return employerPostalCode;
	}
	public void setEmployerPostalCode(int employerPostalCode) {
		this.employerPostalCode = employerPostalCode;
	}
	public Customer(String firstName, String middleName, String lastName, String dateOfBirth, String maritalStatus,
			String ssnNumber, int loanAmmount, String loanPurpose, String description, String addressLine1,
			String addressLine2, String city, String state, int postalCode, long mobileNumber, String emailAddress,
			String employerName, long annualSalary, String designation, String employerAddressLine1,
			String employerAddressLine2, String employerCity, String employerState, int employerPostalCode) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.ssnNumber = ssnNumber;
		this.loanAmmount = loanAmmount;
		this.loanPurpose = loanPurpose;
		this.description = description;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.employerName = employerName;
		this.annualSalary = annualSalary;
		this.designation = designation;
		this.employerAddressLine1 = employerAddressLine1;
		this.employerAddressLine2 = employerAddressLine2;
		this.employerCity = employerCity;
		this.employerState = employerState;
		this.employerPostalCode = employerPostalCode;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
