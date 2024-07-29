package com.abcbank.LoanManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.abcbank.LoanManagementSystem.dto.request.CustomerRequest;
import com.abcbank.LoanManagementSystem.dto.response.CustomerResponse;
import com.abcbank.LoanManagementSystem.exception.InvalidCustomerRequestException;
import com.abcbank.LoanManagementSystem.model.Customer;
import com.abcbank.LoanManagementSystem.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerResponse customerApplication(CustomerRequest customerRequest) {
		
		//Fetch model function
		if(customerRequest==null || customerRequest.firstName==null) {
			throw new InvalidCustomerRequestException("Invalid customer data");
		}
		Customer customer = returnCustomer(customerRequest);
		customerRepository.save(customer);
		String message ="success";
		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setMessage(message);
		return customerResponse;
	}
	
	public List<Customer> viewAllApplication(){
		return customerRepository.findAll();
	}

	private Customer returnCustomer(CustomerRequest customerRequest) {
		Customer customer = new Customer(
				customerRequest.firstName,
				customerRequest.middleName,
				customerRequest.lastName,
				customerRequest.dateOfBirth,
				customerRequest.maritalStatus,
				customerRequest.ssnNumber,
				customerRequest.loanAmmount,
				customerRequest.loanPurpose,
				customerRequest.description,
				customerRequest.addressLine1,
				customerRequest.addressLine2,
				customerRequest.city,
				customerRequest.state,
				customerRequest.postalCode,
				customerRequest.mobileNumber,
				customerRequest.emailAddress,
				customerRequest.employerName,
				customerRequest.annualSalary,
				customerRequest.designation,
				customerRequest.employerAddressLine1,
				customerRequest.employerAddressLine2,
				customerRequest.employerCity,
				customerRequest.employerState,
				customerRequest.employerPostalCode
				);
		return customer;
	}
}
