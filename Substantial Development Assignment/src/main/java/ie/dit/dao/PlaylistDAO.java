package ie.dit.dao;

import ie.dit.entities.Playlist;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface PlaylistDAO {
	Collection<Playlist> getAllPlaylists();
}
