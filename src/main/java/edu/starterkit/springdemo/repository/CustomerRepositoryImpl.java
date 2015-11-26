package edu.starterkit.springdemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import edu.starterkit.springdemo.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private static final Log log = LogFactory.getLog(CustomerRepositoryImpl.class);
	
	@Value("${defaultLastName}")
	private String lastName;
	
	@Value("${defaultFirstName}")
	private String firstName;

	
	public CustomerRepositoryImpl() {
		log.info("Creating " + this.getClass().getSimpleName());
	}

	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customers.add(customer);
		return customers;
	}
	
	@PostConstruct
	private void sayHello() {
		log.info("Hello");
	}
	
	@PreDestroy
	private void sayBye() {
		log.info("Bye");
	}
}
