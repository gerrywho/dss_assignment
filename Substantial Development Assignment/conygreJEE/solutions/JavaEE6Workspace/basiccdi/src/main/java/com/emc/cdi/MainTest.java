package com.emc.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


public class MainTest {
	
	public static void main(String[] args) {
	
		WeldContainer weld = new Weld().initialize();
		Person p =weld.instance().select(Person.class).get();
		
		p.getPet().feed();
		
	}

}
