package com.emc.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class Cat implements Pet {

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println("stroke cat");
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("feed cat");
	}

}
