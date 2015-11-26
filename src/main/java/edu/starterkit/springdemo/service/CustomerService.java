package edu.starterkit.springdemo.service;

import java.util.List;

import edu.starterkit.springdemo.model.Customer;

public interface CustomerService {

	List<Customer> findAll();
}