package com.conygre.beans;

import javax.inject.Inject;
import javax.inject.Named;

import com.conygre.beans.interceptors.LookOut;

//@Named("person")
public class Person {
	
	@Inject
	private Vehicle vehicle;
	
	private String name;
	private int age;
	
	@Inject
	private Pet pet;
	
	public Pet getPet() {
		return pet;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Inject
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@LookOut
	public void crossTheRoad() {
		System.out.println("Crossing the road");
	}

}
