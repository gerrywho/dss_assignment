package com.conygre.cdi.trl;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.jbi.training.Customer;

public class TestCDI {
	
	public static void main(String[] args) {
		
		 WeldContainer weld = new Weld().initialize();
		 
		 
		 Person p  = weld.instance().select(Person.class).get();
		
		 
		 
		 
		p.getPet().stroke();
		//p.getBroadcaster().broadcast();
		
	}

}
