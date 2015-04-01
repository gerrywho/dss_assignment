package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "playlists")
public class Playlist {

	//Instance variables
	@Id
	@Column(name = "p_id") 
	private Integer playid;
	private String playlistname;
	
	@ManyToOne
	@JoinTable(name="library_playlists")
	@JsonBackReference(value="library-playlists")
	private Library library;
	
	public Collection<Track> getTracks() {
		return tracks;
	}

	public void setTracks(Collection<Track> tracks) {
		this.tracks = tracks;
	}






	private String playlistpersist_ID;

	@ManyToMany
	@JoinTable(name = "playlist_track")
	@JsonManagedReference(value="playlist-tracks")
	private Collection<Track> tracks=new ArrayList();
	
	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public void setTracks(Set<Track> tracks) {
		this.tracks = tracks;
	}

	public Playlist(){}
	
	public Playlist(Integer playid, String playlistname, String playlistpersist_id){
		this.playid=playid;
		this.playlistname=playlistname;
		this.playlistpersist_ID=playlistpersist_ID;
	}
	
	//Methods
	public String getPlaylistname() {
		return playlistname;
	}
	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}
	public Integer getPlayid() {
		return playid;
	}
	public void setPlayid(Integer playid) {
		this.playid = playid;
	}
	public String getPlaylistpersist_ID() {
		return playlistpersist_ID;
	}
	public void setPlaylistpersist_ID(String playlistpersist_ID) {
		this.playlistpersist_ID = playlistpersist_ID;
	}
	
	
	

	

	public void addTrack(Track t ){
		tracks.add(t);
	}

		
	
}
