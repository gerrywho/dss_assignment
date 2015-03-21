package com.conygre;

import javax.ejb.Remote;

@Remote
public interface HelloWorld
{
	public abstract String sayHello(String name);

}