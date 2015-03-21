package com.jbi.training;

import javax.enterprise.inject.Default;

@Default
public class BBC implements Broadcaster {

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("BBC Broadcast");
	}

}
