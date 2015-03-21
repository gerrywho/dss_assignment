package ie.dit.service;

import java.util.Collection;

import ie.dit.dao.TrackDAO;
import ie.dit.entities.Track;
import ie.dit.serviceInterface.TrackServiceLocal;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local
public class TrackServiceEJB implements TrackServiceLocal{

	@EJB
	private TrackDAO trackinterface;
	public Collection<Track> getAllTracks() {
		// TODO Auto-generated method stub
		return trackinterface.getAllTracks();
	}

}
