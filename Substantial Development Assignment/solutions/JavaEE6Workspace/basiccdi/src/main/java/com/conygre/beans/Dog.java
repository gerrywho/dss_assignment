package com.conygre.beans;

import javax.enterprise.inject.Alternative;

@Alternative
public class Dog implements Pet {

	@Override
	public void stroke() {
		// TODO Auto-generated method stub
		System.out.println("dog wag tail");
	}

}
