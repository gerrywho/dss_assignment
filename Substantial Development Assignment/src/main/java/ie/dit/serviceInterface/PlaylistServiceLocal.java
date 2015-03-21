package ie.dit.serviceInterface;

import ie.dit.entities.Playlist;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface PlaylistServiceLocal {
	Collection<Playlist> getAllPlaylists();
}
