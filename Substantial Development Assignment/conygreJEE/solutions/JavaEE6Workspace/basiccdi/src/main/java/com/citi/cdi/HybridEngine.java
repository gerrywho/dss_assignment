package com.citi.cdi;

import javax.enterprise.inject.Default;

@Default
public class HybridEngine implements Engine {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hybrid running");
	}

}
