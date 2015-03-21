package ie.dit.dao.jpa;

import ie.dit.dao.PlaylistDAO;
import ie.dit.entities.Playlist;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless
@Local
public class PlaylistDAOImpl implements PlaylistDAO{
	@PersistenceContext
	private EntityManager em;
	public Collection<Playlist> getAllPlaylists() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("from Playlist");
		return q.getResultList();
	}

}
