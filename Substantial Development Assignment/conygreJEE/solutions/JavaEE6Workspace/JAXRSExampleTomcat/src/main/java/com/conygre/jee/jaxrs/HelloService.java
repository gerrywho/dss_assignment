package com.conygre.jee.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloService {

	@GET
	public String sayHello() {
		return "hello world";
	}
	@GET
	@Path("/{name}")
	public String sayHello(@PathParam("name") String name) {
		return "hello "  + name;
	}
}
