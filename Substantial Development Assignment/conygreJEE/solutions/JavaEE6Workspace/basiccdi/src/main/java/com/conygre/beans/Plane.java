package com.conygre.beans;

import com.conygre.beans.interceptors.LookOut;

@LookOut
public class Plane {

	public void takeOff() {
		System.out.println("Take off");
		//takeOffAgain();
	}

	public  void takeOffAgain() {
		System.out.println("Take off again");
	}

}
