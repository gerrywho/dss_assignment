package com.citi.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class DieselEngine implements Engine {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Diesel running");
	}

}
