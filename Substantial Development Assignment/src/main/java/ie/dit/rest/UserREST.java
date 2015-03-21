package ie.dit.rest;

import ie.dit.entities.User;
import ie.dit.serviceInterface.UserServiceLocal;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserREST {
	
	@EJB
	private UserServiceLocal usl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<User> getAllUsers(){
		return usl.getAllUsers();
		
	}
	

	@POST
	@Path("/addUser")
	@Consumes(MediaType.APPLICATION_JSON)
	public User addUser(User user){
		//User user = new User(email, password,position);
		
		return usl.addUser(user.getUsername(), user.getPassword());
	}
}
