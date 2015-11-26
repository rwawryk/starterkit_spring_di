package edu.starterkit.springdemo.repository;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import edu.starterkit.springdemo.model.Customer;

public class CustomerRepositoryImplTest extends TestCase {
	
	private CustomerRepository customerRepository = new CustomerRepositoryImpl();
	
	@Test
	public void testSimple() throws Exception {
		// given
		
		// when
		List<Customer> result = customerRepository.findAll();
		
		// then
		Assert.assertEquals(1, result.size());
		Assert.assertEquals(null, result.get(0).getFirstName());
	}
}
