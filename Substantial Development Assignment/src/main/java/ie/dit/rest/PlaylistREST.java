package ie.dit.rest;

import ie.dit.entities.Playlist;
import ie.dit.serviceInterface.PlaylistServiceLocal;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/playlists")
public class PlaylistREST {

	@EJB
	private PlaylistServiceLocal psl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Playlist> getAllPlaylists(){
		return psl.getAllPlaylists();
		
	}
}
