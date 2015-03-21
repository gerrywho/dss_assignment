package com.conygre.logging.example;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface="com.conygre.logging.example.LoggingExample")
public class LoggingExampleEJB implements LoggingExample {
	
	private static Logger logger = Logger.getLogger(LoggingExampleEJB.class.getName());
	 
	@PostConstruct
	public void init() {
		logger.info("********This is a logged message from postConstruct");
	}

	@Override
	public String testMethod() {
		logger.info("********web service called");
		return "You triggered the method";
	}
}
