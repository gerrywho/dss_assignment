package com.jbi.training;

import javax.enterprise.inject.Alternative;

@Satellite
public class Sky  implements Broadcaster{

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("Sky broadcast");
	}

}
