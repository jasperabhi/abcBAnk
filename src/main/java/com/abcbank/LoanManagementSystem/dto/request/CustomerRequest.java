package com.abcbank.LoanManagementSystem.dto.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
	
	@NotBlank(message = "First name is required")
    @Size(max = 255, message = "First name must be less than 255 characters")
	public String firstName;
	
	@Size(max = 255, message = "Middle name must be less than 255 characters")
	public String middleName;
	
	@NotBlank(message = "Last name is required")
    @Size(max = 255, message = "Last name must be less than 255 characters")
	public String lastName;
	
	@NotBlank(message = "Date of birth is required")
	public String dateOfBirth;
	
	@NotBlank(message = "Marital status is required")
    @Pattern(regexp = "Single|Married|Separated|Divorced|Widowed", message = "Invalid marital status")
	public String maritalStatus;
	
	@NotBlank(message = "SSN number is required")
	public String ssnNumber;
	
	@NotNull(message = "Loan amount is required")
	@Min(value = 0, message = "Loan amount must be numeric")
	public int loanAmmount;
	 
	@NotBlank(message = "Loan purpose is required")
	@Pattern(regexp = "Debt|Educational Loan|Personal Loan|Home Loan", message = "Invalid loan purpose")
	public String loanPurpose;
	
	
	public String description;
	
	@NotBlank(message = "Address line 1 is required")
    @Size(max = 255, message = "Address line 1 must be less than 255 characters")
	public String addressLine1;
	
	@Size(max = 255, message = "Address line 2 must be less than 255 characters")
	public String addressLine2;
	
	@NotBlank(message = "City is required")
    @Size(max = 255, message = "City must be less than 255 characters")
	public String city;
	
	@NotBlank(message = "State is required")
    @Size(max = 255, message = "State must be less than 255 characters")
	public String state;
	
	@NotNull(message = "Postal code is required")
    @Digits(integer = 5, fraction = 0, message = "Postal code must be exactly 5 digits")
	public int postalCode;
	
	@NotNull(message = "Mobile number is required")
    @Digits(integer = 10, fraction = 0, message = "Mobile number must be exactly 10 digits")
	public long mobileNumber;
	
	@NotBlank(message = "Email address is required")
    @Email(message = "Email address must be valid")
	public String emailAddress;
	
	@NotBlank(message = "Employer name is required")
    @Size(max = 255, message = "Employer name must be less than 255 characters")
	public String employerName;
	
	@NotNull(message = "Annual salary is required")
    @Min(value = 0, message = "Annual salary must be numeric")
	public long annualSalary;
	
	@Size(max = 255, message = "Designation must be less than 255 characters")
	public String designation;
	 
	@NotBlank(message = "Employer address line 1 is required")
    @Size(max = 255, message = "Employer address line 1 must be less than 255 characters")
	public String employerAddressLine1;
	
	@Size(max = 255, message = "Employer address line 2 must be less than 255 characters")
	public String employerAddressLine2;
	
	@NotBlank(message = "Employer city is required")
    @Size(max = 255, message = "Employer city must be less than 255 characters")
	public String employerCity;
	
	@NotBlank(message = "Employer state is required")
    @Size(max = 255, message = "Employer state must be less than 255 characters")
	public String employerState;
	
	@NotNull(message = "Employer postal code is required")
	@Digits(integer = 5, fraction = 0, message = "Employer postal code must be exactly 5 digits")
	public int employerPostalCode;

}
