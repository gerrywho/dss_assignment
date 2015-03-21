package com.conygre.cd;
import javax.ejb.*;
@Remote
@Stateless
public class MathBean implements MathInterface {
	public int add(int a, int b) {
		return a + b;
	}
	public double average(int a, int b) {
		return (a/b)/2;
	}
}
