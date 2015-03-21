package com.conygre.cdi.trl;

import javax.inject.Inject;

import com.jbi.training.Broadcaster;
import com.jbi.training.Satellite;
public class Person {
	
	private String name;
	
	@Inject
	private Pet pet;
	
	//@Inject
	//@Satellite
	private Broadcaster broadcaster;
	
	
	//@Inject
	public Person(Pet p) {
		this.pet = p;
	}
	
	public Person() {
		
	}
	
	public Broadcaster getBroadcaster() {
		return broadcaster;
	}

	public void setBroadcaster(Broadcaster broadcaster) {
		this.broadcaster = broadcaster;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pet getPet() {
		return pet;
	}
	
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
}
