package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "libraries")
public class Library {
	
	@Id
	@Column(name = "persistenceID")
	private String persistence_id;
	
	 @OneToOne()
	 private User user;
	 
	 @OneToMany(mappedBy="library" )
		private Collection<Playlist> playlists=new ArrayList();
		
	 public void setPlaylists(Collection<Playlist> playlists) {
		this.playlists = playlists;
	}

	public void setTracks(Collection<Track> tracks) {
		this.tracks = tracks;
	}

	@ManyToMany
		@JoinTable(name="library_tracks")
	 @JsonManagedReference(value="library-tracks")
		private Collection<Track> tracks=new ArrayList();
		
	 public Library(){
			
		}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
	public Library(String persistence_id, Set<Playlist> playlists,
			Set<Track> tracks){
		this.persistence_id = persistence_id;
		this.playlists = playlists;
		this.tracks = tracks;
	}

	


	public void setPlaylists(Set<Playlist> playlists) {
		this.playlists = playlists;
	}

	
	public Collection<Playlist> getPlaylists() {
		return playlists;
	}

	

	public Collection<Track> getTracks() {
		return tracks;
	}

	

	public void addTrack(Track track){
		tracks.add(track);
	}

	public void setTracks(Set<Track> tracks) {
		this.tracks = tracks;
	}

	public String getPersistence_id() {
		return persistence_id;
	}

	public void setPersistence_id(String persistence_id) {
		this.persistence_id = persistence_id;
	}

	


}
