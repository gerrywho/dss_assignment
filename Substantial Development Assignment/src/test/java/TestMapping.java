import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ie.dit.entities.Playlist;
import ie.dit.entities.Track;

@Stateless
@Local
public class TestMapping {
	@PersistenceContext
	private EntityManager em;
	public static void main(String[] args) {
		Playlist playlist1 = new Playlist();
		playlist1.setPlayid(1);
		playlist1.setPlaylistallitem(true);
		playlist1.setPlaylistdistinkind("PANIC");
		playlist1.setPlaylistname("Panic at the Disco");
		playlist1.setPlaylistpersist_ID("dedede");
		
		Track track1 = new Track();
		track1.setTrackid(1);
		track1.setTrackartist("Panic At The Disco");
		track1.setTracksize(1);
		track1.setTracktime(1);
		track1.setTracknumber(1);
		track1.setTrackcount(1);
		track1.setTrackbitrate(1);
		track1.setTracksamplerate(1);
		track1.setTrackvolume(10);
		track1.setTrackplaycount(1);
		track1.setTrackplaydate(1);
		track1.setTracklibfoldercount(1);
		track1.setTrackfilefoldercount(1);
		
		track1.setPlaylist(playlist1);
		playlist1.getListOfTracks().add(track1);
		
		
	}
}
