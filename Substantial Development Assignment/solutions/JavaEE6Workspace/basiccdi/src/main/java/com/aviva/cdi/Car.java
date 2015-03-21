package com.aviva.cdi;

import javax.enterprise.inject.Default;

@Default
public class Car implements Steerable {

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("car Turn left");
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("car turn right");
	}

}
