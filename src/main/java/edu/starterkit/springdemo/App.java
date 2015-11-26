package edu.starterkit.springdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.starterkit.springdemo.service.CustomerService;
import edu.starterkit.springdemo.service.CustomerServiceImpl;

public class App {
	
	private static final Log LOG = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = (CustomerService) appContext.getBean("customerService");
		LOG.info(service);
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		LOG.info(service2);
		
		LOG.info(service.findAll().get(0).getFirstName());
	}
}
