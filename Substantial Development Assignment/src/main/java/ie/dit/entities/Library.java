package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "libraries")
public class Library implements Serializable{
	
	@Id
	@Column(name = "persistenceID")
	private String persistence_id;
	
	 
	
	@OneToMany(mappedBy = "userTracks")
	private List<Track> listOfUserTracks = new ArrayList<Track>();

	@OneToMany(mappedBy = "userPlaylists")
	private List<Playlist> listOfUsersPlaylists = new ArrayList<Playlist>();
	
	public Library(){
		
	}
	
	public Library(String persistence_id, List<Playlist> listOfUsersPlaylists, List<Track> listOfUserTracks){
		this.persistence_id = persistence_id;
		this.listOfUsersPlaylists = listOfUsersPlaylists;
		this.listOfUserTracks=listOfUserTracks;
	}

	

	public String getPersistence_id() {
		return persistence_id;
	}

	public void setPersistence_id(String persistence_id) {
		this.persistence_id = persistence_id;
	}

	public List<Track> getListOfUserTracks() {
		return listOfUserTracks;
	}

	public void setListOfUserTracks(List<Track> listOfUserTracks) {
		this.listOfUserTracks = listOfUserTracks;
	}

	public List<Playlist> getListOfUsersPlaylists() {
		return listOfUsersPlaylists;
	}

	public void setListOfUsersPlaylists(List<Playlist> listOfUsersPlaylists) {
		this.listOfUsersPlaylists = listOfUsersPlaylists;
	}

}
