package ie.dit.serviceInterface;

import ie.dit.entities.User;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface UserServiceLocal {
	Collection<User> getAllUsers();

	User addUser(String username, String password);
}
