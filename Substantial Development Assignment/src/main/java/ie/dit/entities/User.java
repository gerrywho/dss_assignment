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
@Table(name = "users")
public class User implements Serializable {

	// Instance variables
	@Id
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "userTracks")
	private List<Track> listOfUserTracks = new ArrayList<Track>();

	@OneToMany(mappedBy = "userPlaylists")
	private List<Playlist> listOfUsersPlaylists = new ArrayList<Playlist>();

	public User() {
	}

	public User(String email, String password2) {
		// TODO Auto-generated constructor stub
		username = email;
		password = password2;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
