package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "playlists")
public class Playlist implements Serializable{

	//Instance variables
	@Column(name = "p_name") private String playlistname;
	@Id
	@Column(name = "p_id") private int playid;
	@Column(name = "p_persistID") private String playlistpersist_ID;
	@Column(name = "p_distinkind") private String playlistdistinkind;
	@Column(name = "p_allitem") private boolean playlistallitem;
	
	
	
	public List<Track> getListOfTracks() {
		return listOfTracks;
	}
	public void setListOfTracks(List<Track> listOfTracks) {
		this.listOfTracks = listOfTracks;
	}
	@OneToMany(mappedBy="playlist")
	//@JoinColumn(name="t_id")
	private List<Track> listOfTracks = new ArrayList<Track>();
	
	@ManyToOne
	private User userPlaylists;
	
	//Methods
	public String getPlaylistname() {
		return playlistname;
	}
	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}
	public int getPlayid() {
		return playid;
	}
	public void setPlayid(int playid) {
		this.playid = playid;
	}
	public String getPlaylistpersist_ID() {
		return playlistpersist_ID;
	}
	public void setPlaylistpersist_ID(String playlistpersist_ID) {
		this.playlistpersist_ID = playlistpersist_ID;
	}
	public String getPlaylistdistinkind() {
		return playlistdistinkind;
	}
	public void setPlaylistdistinkind(String playlistdistinkind) {
		this.playlistdistinkind = playlistdistinkind;
	}
	public boolean isPlaylistallitem() {
		return playlistallitem;
	}
	public void setPlaylistallitem(boolean playlistallitem) {
		this.playlistallitem = playlistallitem;
	}
	
	

		
	
}
