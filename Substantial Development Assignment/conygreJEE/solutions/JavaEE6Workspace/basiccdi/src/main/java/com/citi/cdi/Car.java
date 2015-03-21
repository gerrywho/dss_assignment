package com.citi.cdi;

import javax.inject.Inject;

public class Car {
	private String make = "BMW";
	private String model = "123D";
	
	@Inject
	private Engine engine;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	

}
