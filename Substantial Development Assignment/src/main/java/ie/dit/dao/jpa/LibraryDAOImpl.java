package ie.dit.dao.jpa;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ie.dit.dao.LibraryDAO;
import ie.dit.entities.Library;

@Stateless
@Local
public class LibraryDAOImpl implements LibraryDAO{

	@PersistenceContext
	private EntityManager em;
	public Collection<Library> getAllLibraries() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("from Library");
		return q.getResultList();
	}

}
