package com.aviva.cdi;

import javax.inject.Inject;

public class Traveller {
	
	@Inject
	private Steerable steerable;
	
	public void travelSomewhereWithBends() {
		steerable.turnLeft();
	}

}
