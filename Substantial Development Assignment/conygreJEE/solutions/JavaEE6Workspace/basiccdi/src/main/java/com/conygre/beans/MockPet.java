package com.conygre.beans;

import javax.enterprise.inject.Alternative;

@Alternative
public class MockPet implements Pet {

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println("Mock stroke");
	}

	
	
}
