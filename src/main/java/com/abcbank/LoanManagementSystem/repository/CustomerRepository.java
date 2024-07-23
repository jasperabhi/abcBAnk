package com.abcbank.LoanManagementSystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abcbank.LoanManagementSystem.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
