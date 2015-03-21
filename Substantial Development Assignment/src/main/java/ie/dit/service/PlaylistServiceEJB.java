package ie.dit.service;

import java.util.Collection;

import ie.dit.dao.PlaylistDAO;
import ie.dit.entities.Playlist;
import ie.dit.serviceInterface.PlaylistServiceLocal;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local
public class PlaylistServiceEJB implements PlaylistServiceLocal{

	@EJB
	private PlaylistDAO playlistinterface;
	public Collection<Playlist> getAllPlaylists() {
		// TODO Auto-generated method stub
		return playlistinterface.getAllPlaylists();
	}

}
