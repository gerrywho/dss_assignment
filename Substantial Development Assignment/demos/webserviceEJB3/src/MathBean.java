package com.conygre.cd;
import javax.ejb.*;
import javax.jws.WebService;

@Remote(MathInterface.class)
@Stateless
@WebService(endpointInterface = "com.conygre.cd.MathInterface")
public class MathBean implements MathInterface {
	public int add(int a, int b) {
		return a + b;
	}
	public double average(int a, int b) {
		return (a/b)/2;
	}
}
