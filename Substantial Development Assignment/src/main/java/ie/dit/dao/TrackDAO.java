package ie.dit.dao;

import ie.dit.entities.Track;

import java.util.Collection;

import javax.ejb.Local;


@Local
public interface TrackDAO {
	Collection<Track> getAllTracks();
}
