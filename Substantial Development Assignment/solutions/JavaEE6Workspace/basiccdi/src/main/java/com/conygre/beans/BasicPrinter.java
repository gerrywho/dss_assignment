package com.conygre.beans;

@DecoratorQualifier
public class BasicPrinter implements Printable{

	public void printText(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
	}

}
