package com.abcbank.LoanManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.LoanManagementSystem.dto.request.CustomerRequest;
import com.abcbank.LoanManagementSystem.dto.response.CustomerResponse;
import com.abcbank.LoanManagementSystem.service.CustomerService;


@RestController
@RequestMapping("/abcbank")
public class LoanController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/applyLoan")
	public CustomerResponse applyLoan(@jakarta.validation.Valid @RequestBody CustomerRequest customerRequest) {
		return customerService.customerApplication(customerRequest);
	}

}
