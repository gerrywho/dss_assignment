package com.conygre.beans;

import javax.enterprise.inject.Alternative;

@Alternative
public class Motorcycle implements Vehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("bike drives");
	}

}
