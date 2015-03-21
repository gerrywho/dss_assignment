package com.conygre.ejb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("/library/")
public interface BookRetrieverLocal {

	
	// http://localhost:8080/BookRetrieverREST-0.0.1-SNAPSHOT/rest/library/book/2
	@GET
	@Path("/book/{id}")
	public abstract Book getBookByID(@PathParam("id") int id);

	// http://localhost:8080/BookRetrieverREST-0.0.1-SNAPSHOT/rest/library/date
	@GET
	@Path("/date")
	public abstract String getDate();

}