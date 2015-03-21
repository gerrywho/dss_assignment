package com.conygre.beans.decorators;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import com.conygre.beans.DecoratorQualifier;
import com.conygre.beans.Printable;

@Decorator
public class UpperCasePrintDecorator implements Printable {

	@Inject
	@Delegate 
	//@DecoratorQualifier
	private Printable printable;
	
	
	public void printText(String s) {
		// TODO Auto-generated method stub
		String upper = s.toUpperCase();
		printable.printText(upper);
	}

}
