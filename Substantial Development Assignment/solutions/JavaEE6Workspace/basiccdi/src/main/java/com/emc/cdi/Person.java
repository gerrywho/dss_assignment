package com.emc.cdi;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

public class Person {
	

	@Inject
	private Pet pet;

	public Pet getPet() {
		return pet;
	}


	
	
	
	
	

}
