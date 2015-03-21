package com.conygre.cdi.trl;

public class Cat implements Pet {

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println("stroke cat");
	}

	@Override
	public void bathe() {
		// TODO Auto-generated method stub
		System.out.println("bathe cat");
	}

}
