package com.jbi.training;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Qualifier;

public class Customer {
	
	@Inject
	@Satellite
	private Broadcaster broadcaster;
	
	
	public Broadcaster getBroadcaster() {
		return broadcaster;
	}
	@Produces
	public void setBroadcaster(Broadcaster broadcaster) {
		this.broadcaster = broadcaster;
	}
}
