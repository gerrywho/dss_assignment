package com.conygre.jee.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.conygre.jee.service.CompactDiscService;
import com.conygre.jee.service.CompactDiscServiceFake;
import com.conygre.training.entities.CompactDiscList;

@Path("compactiscsenterprise")
public class CompactDiscEnterpriseRS {

	// somehow get it initialised for us
	
	private CompactDiscService service;
	
	@GET
	public CompactDiscList  getAllCDs() {
		return service.getAllProducts();
	}
	
	
}
