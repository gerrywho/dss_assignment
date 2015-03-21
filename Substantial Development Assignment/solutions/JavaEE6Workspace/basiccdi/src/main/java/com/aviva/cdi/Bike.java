package com.aviva.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class Bike implements Steerable {

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Bike turn left");
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("bike turn right");
	}

}
