package ie.dit.serviceInterface;

import ie.dit.entities.Track;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface TrackServiceLocal {
	Collection<Track> getAllTracks();
}
