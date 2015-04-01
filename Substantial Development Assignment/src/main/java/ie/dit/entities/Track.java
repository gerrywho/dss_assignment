package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name = "tracks")
public class Track  {

	// Instance variables
	@Id
	@Column(name = "t_id")
	private int trackid;
	private String trackname;
	private String trackartist;
	private String trackalbum;
	private String trackpersistID;
	

	@ManyToMany(mappedBy="tracks")
	@JsonBackReference(value="playlist-tracks")
	private Collection<Playlist> playlists=new ArrayList();
	
	
	
	@ManyToMany(mappedBy="tracks")
	@JsonBackReference(value="library-tracks")
	private Collection<Library> libraries=new ArrayList();
	

	



	



	public Collection<Playlist> getPlaylists() {
		return playlists;
	}



	public void setPlaylists(Collection<Playlist> playlists) {
		this.playlists = playlists;
	}



	public Collection<Library> getLibraries() {
		return libraries;
	}



	public void setLibraries(Collection<Library> libraries) {
		this.libraries = libraries;
	}



	// Constructors
	public Track() {
	}



	public Track(int trackid, String trackname, String trackartist,
			String trackalbum, String trackpersistID) {
		this.trackid=trackid;
		this.trackname=trackname;
		this.trackartist=trackartist;
		this.trackalbum=trackalbum;
		this.trackpersistID=this.trackpersistID;
	}

	// Methods
	public int getTrackid() {
		return trackid;
	}

	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}

	public String getTrackname() {
		return trackname;
	}

	public void setTrackname(String trackname) {
		this.trackname = trackname;
	}

	public String getTrackartist() {
		return trackartist;
	}

	public void setTrackartist(String trackartist) {
		this.trackartist = trackartist;
	}

	public String getTrackalbum() {
		return trackalbum;
	}

	public void setTrackalbum(String trackalbum) {
		this.trackalbum = trackalbum;
	}

	
	

	public String getTrackpersistID() {
		return trackpersistID;
	}

	public void setTrackpersistID(String trackpersistID) {
		this.trackpersistID = trackpersistID;
	}

	

	
}
