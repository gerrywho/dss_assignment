package ie.dit.rest;

import java.util.Collection;

import ie.dit.entities.Track;
import ie.dit.serviceInterface.TrackServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tracks")
public class TrackREST {
	
	@EJB 
	private TrackServiceLocal tsl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Track> getAllTracks(){
		return tsl.getAllTracks();
		
	}
	

}
