package com.emc.cdi;

import javax.enterprise.inject.Default;

@Default
public class Dog implements Pet {

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println("stroke dog");
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("feed dog");
	}

}
