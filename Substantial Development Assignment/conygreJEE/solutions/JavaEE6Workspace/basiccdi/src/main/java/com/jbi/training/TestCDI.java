package com.jbi.training;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class TestCDI {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WeldContainer weld = new Weld().initialize();
		 Customer c = weld.instance().select(Customer.class).get();
		 c.getBroadcaster().broadcast();
		 
	}

}
