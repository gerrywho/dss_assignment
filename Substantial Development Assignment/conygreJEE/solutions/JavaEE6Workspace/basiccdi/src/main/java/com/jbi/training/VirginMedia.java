package com.jbi.training;

import javax.enterprise.inject.Alternative;

@Alternative
public class VirginMedia implements Broadcaster {

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("Virgin broadast");
	}

}
