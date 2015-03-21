package ie.dit.dao.jpa;

import java.util.Collection;

import ie.dit.dao.UserDAO;
import ie.dit.entities.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Local
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager em;
	public Collection<User> getAllUsers() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("from User");
		return q.getResultList();
	}
	
	public User addUser(String email,String password) {
	
		User u = new User(email,password);
		em.persist(u);
		//em.close();
		//em.flush();
		

		return u;
		
	}

}
