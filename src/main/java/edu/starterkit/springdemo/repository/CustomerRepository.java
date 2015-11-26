package edu.starterkit.springdemo.repository;

import java.util.List;

import edu.starterkit.springdemo.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();
}