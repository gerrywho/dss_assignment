package com.conygre.cd;
import javax.ejb.Remote;

@Remote
public interface MathInterface {

	public int add(int a, int b);
	public double average(int a, int b);
}