package com.citi.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class TestCDI {
	
	public static void main(String[] args) {
		WeldContainer weld = new Weld().initialize();
		Car car = weld.instance().select(Car.class).get();
		
		car.getEngine().run();
		
	}

}
