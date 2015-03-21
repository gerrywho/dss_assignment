package com.conygre;

import javax.ejb.*;
import javax.annotation.Resource;

@Stateless
@Remote
public class HelloWorldBean implements HelloWorld
{
	@Resource
	SessionContext context;

	public String sayHello(String name)
	{
		return "hello " + name + context.isCallerInRole("guest");
	}


}