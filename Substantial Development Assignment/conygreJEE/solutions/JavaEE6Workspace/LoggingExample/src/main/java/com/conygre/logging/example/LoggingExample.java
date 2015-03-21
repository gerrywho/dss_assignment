package com.conygre.logging.example;

import javax.ejb.Remote;

import javax.jws.WebService;

@WebService
@Remote
public interface LoggingExample {

	String testMethod();
	
	
}
