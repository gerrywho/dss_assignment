package ie.dit.service;

import ie.dit.dao.UserDAO;
import ie.dit.entities.User;
import ie.dit.serviceInterface.UserServiceLocal;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local
public class UserServiceEJB implements UserServiceLocal{

	@EJB
	private UserDAO userinterface;

	public Collection<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userinterface.getAllUsers();
	}
	
	public User addUser(String email,String password){
		//System.out.println(user.getEmail());
	
		return userinterface.addUser(email,password);
	}
}
