package edu.starterkit.springdemo.repository;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.starterkit.springdemo.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContextTest.xml"})
public class CustomerRepositoryImplSpringTest extends TestCase {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testSpring() throws Exception {
		// given
		
		// when
		List<Customer> result = customerRepository.findAll();
		
		// then
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("TestName", result.get(0).getFirstName());
		
	}

}
