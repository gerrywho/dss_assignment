package com.conygre.cd;


import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface MathInterface {

	public int add(int a, int b);
	public double average(int a, int b);
}