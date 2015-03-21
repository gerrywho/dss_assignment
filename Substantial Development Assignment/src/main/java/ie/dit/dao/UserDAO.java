package ie.dit.dao;

import ie.dit.entities.Track;
import ie.dit.entities.User;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface UserDAO {
	Collection<User> getAllUsers();

	User addUser(String email, String password);
}
