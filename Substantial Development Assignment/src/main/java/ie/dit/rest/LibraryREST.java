package ie.dit.rest;

import java.util.Collection;

import ie.dit.entities.Library;
import ie.dit.entities.Track;
import ie.dit.serviceInterface.LibraryServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/libraries")
public class LibraryREST {
	
	@EJB
	private LibraryServiceLocal lsl;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Library> getAllLibraries(){
		return lsl.getAllLibraries();
		
	}
}
