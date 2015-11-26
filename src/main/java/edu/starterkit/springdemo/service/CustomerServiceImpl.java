package edu.starterkit.springdemo.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.starterkit.springdemo.model.Customer;
import edu.starterkit.springdemo.repository.CustomerRepository;

@Component("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private static final Log log = LogFactory.getLog(CustomerServiceImpl.class);

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		log.info("Creating " + this.getClass().getSimpleName());
	}
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		log.info("Creating and autowiring " + this.getClass().getSimpleName());
		this.customerRepository = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		log.info("Setting and autowiring " + this.getClass().getSimpleName());
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
