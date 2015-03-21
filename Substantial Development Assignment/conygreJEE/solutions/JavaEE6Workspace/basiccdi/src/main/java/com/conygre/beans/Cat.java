package com.conygre.beans;

import javax.enterprise.inject.Default;

@Default
public class Cat implements Pet {

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println("cat purrrrrrs");
	}

}
