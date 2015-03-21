package com.conygre.beans;

import javax.enterprise.inject.Default;

@Default
public class Car implements Vehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car drives");
	}

}
