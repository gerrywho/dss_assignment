package ie.dit.dao.jpa;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ie.dit.dao.TrackDAO;
import ie.dit.entities.Track;
@Stateless
@Local
public class TrackDAOImpl implements TrackDAO{

	@PersistenceContext
	private EntityManager em;
	public Collection<Track> getAllTracks() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("from Track");
		return q.getResultList();
	}

}
