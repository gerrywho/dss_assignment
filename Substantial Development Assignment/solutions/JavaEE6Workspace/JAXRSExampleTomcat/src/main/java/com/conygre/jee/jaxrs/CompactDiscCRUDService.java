package com.conygre.jee.jaxrs;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.conygre.training.entities.CompactDisc;
import com.conygre.training.entities.CompactDiscList;

@Path("/compactdiscs")
public class CompactDiscCRUDService {
	
private static Map<Integer, CompactDisc> library;
		
	static {
		library = new HashMap<Integer, CompactDisc>();
		library.put(1, new CompactDisc("Gold", 12.99, "Abba", 12, 1));
		library.put(2, new CompactDisc("Spice World", 4.99, "Spice Girls", 9, 2));
		library.put(3, new CompactDisc("Money for Nothing", 7.99, "Dire Straits", 13, 3));
		library.put(4, new CompactDisc("True", 5.99, "Spandau Ballet", 10, 4));
		library.put(5, new CompactDisc("Justin", 4.99, "Justin Bieber", 10, 5));
	}

/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCompactDiscs() {
        GenericEntity entity = new GenericEntity<Collection<CompactDisc>>(library.values()) {};
        return Response.ok(entity).build();
	}
*/

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CompactDiscList getCompactDiscs() {
        CompactDiscList discs = new CompactDiscList();
        discs.setDiscCollection(library.values());
        return discs;
    }



    @GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public CompactDisc getCompactDisc(@PathParam("id") int id) {
		return library.get(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addCompactDisc(CompactDisc disc) {
		library.put(disc.getId(), disc);
	}
	
	@PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateCompactDisc(CompactDisc updatedDisc) {
		library.put(updatedDisc.getId(), updatedDisc);
	}
	@DELETE
    @Path("/{id}")
	public void deleteCompactDisc(@PathParam("id") int id) {
		library.remove(id);
	}
}