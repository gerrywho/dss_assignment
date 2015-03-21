package ie.dit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tracks")
public class Track implements Serializable {

	// Instance variables
	@Id
	@Column(name = "t_id")
	private int trackid;
	@Column(name = "t_name")
	private String trackname;
	@Column(name = "t_artist")
	private String trackartist;
	@Column(name = "t_album")
	private String trackalbum;
	@Column(name = "t_kind")
	private String trackkind;
	@Column(name = "t_size")
	private int tracksize;
	@Column(name = "t_total_time")
	private int tracktime;
	@Column(name = "t_number")
	private int tracknumber;
	@Column(name = "t_count")
	private int trackcount;
	@Column(name = "t_modified")
	private Date trackmodified;
	@Column(name = "t_added")
	private Date trackadded;
	@Column(name = "t_bitrate")
	private int trackbitrate;
	@Column(name = "t_samplerate")
	private int tracksamplerate;
	@Column(name = "t_volume")
	private int trackvolume;
	@Column(name = "t_playcount")
	private int trackplaycount;
	@Column(name = "t_playdate")
	private int trackplaydate;
	@Column(name = "t_playdateUTC")
	private Date trackplaydateUTC;
	@Column(name = "t_skipdate")
	private Date trackskipdate;
	@Column(name = "t_sortalbum")
	private String tracksortalbum;
	@Column(name = "t_sortartist")
	private String tracksortartist;
	@Column(name = "t_sortname")
	private String tracksortname;
	@Column(name = "t_persistID")
	private String trackpersistID;
	@Column(name = "t_type")
	private String tracktype;
	@Column(name = "t_location")
	private String tracklocation;
	@Column(name = "t_filefoldercount")
	private int trackfilefoldercount;
	@Column(name = "t_libfoldercount")
	private int tracklibfoldercount;

	
	  
	@ManyToOne
	//@JoinColumn(name="p_id")
	private Playlist playlist;
	
	@ManyToOne
	private User userTracks;
	
	
	
	//Constructors
	public Track() {
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	public Track(int trackid, String trackname, String trackartist,
			String trackalbum) {

	}

	//Methods
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

	public String getTrackkind() {
		return trackkind;
	}

	public void setTrackkind(String trackkind) {
		this.trackkind = trackkind;
	}

	public int getTracksize() {
		return tracksize;
	}

	public void setTracksize(int tracksize) {
		this.tracksize = tracksize;
	}

	public int getTracktime() {
		return tracktime;
	}

	public void setTracktime(int tracktime) {
		this.tracktime = tracktime;
	}

	public int getTracknumber() {
		return tracknumber;
	}

	public void setTracknumber(int tracknumber) {
		this.tracknumber = tracknumber;
	}

	public int getTrackcount() {
		return trackcount;
	}

	public void setTrackcount(int trackcount) {
		this.trackcount = trackcount;
	}

	public Date getTrackmodified() {
		return trackmodified;
	}

	public void setTrackmodified(Date trackmodified) {
		this.trackmodified = trackmodified;
	}

	public Date getTrackadded() {
		return trackadded;
	}

	public void setTrackadded(Date trackadded) {
		this.trackadded = trackadded;
	}

	public int getTrackbitrate() {
		return trackbitrate;
	}

	public void setTrackbitrate(int trackbitrate) {
		this.trackbitrate = trackbitrate;
	}

	public int getTracksamplerate() {
		return tracksamplerate;
	}

	public void setTracksamplerate(int tracksamplerate) {
		this.tracksamplerate = tracksamplerate;
	}

	public int getTrackvolume() {
		return trackvolume;
	}

	public void setTrackvolume(int trackvolume) {
		this.trackvolume = trackvolume;
	}

	public int getTrackplaycount() {
		return trackplaycount;
	}

	public void setTrackplaycount(int trackplaycount) {
		this.trackplaycount = trackplaycount;
	}

	public int getTrackplaydate() {
		return trackplaydate;
	}

	public void setTrackplaydate(int trackplaydate) {
		this.trackplaydate = trackplaydate;
	}

	public Date getTrackplaydateUTC() {
		return trackplaydateUTC;
	}

	public void setTrackplaydateUTC(Date trackplaydateUTC) {
		this.trackplaydateUTC = trackplaydateUTC;
	}

	public Date getTrackskipdate() {
		return trackskipdate;
	}

	public void setTrackskipdate(Date trackskipdate) {
		this.trackskipdate = trackskipdate;
	}

	public String getTracksortalbum() {
		return tracksortalbum;
	}

	public void setTracksortalbum(String tracksortalbum) {
		this.tracksortalbum = tracksortalbum;
	}

	public String getTracksortartist() {
		return tracksortartist;
	}

	public void setTracksortartist(String tracksortartist) {
		this.tracksortartist = tracksortartist;
	}

	public String getTracksortname() {
		return tracksortname;
	}

	public void setTracksortname(String tracksortname) {
		this.tracksortname = tracksortname;
	}

	public String getTrackpersistID() {
		return trackpersistID;
	}

	public void setTrackpersistID(String trackpersistID) {
		this.trackpersistID = trackpersistID;
	}

	public String getTracktype() {
		return tracktype;
	}

	public void setTracktype(String tracktype) {
		this.tracktype = tracktype;
	}

	public String getTracklocation() {
		return tracklocation;
	}

	public void setTracklocation(String tracklocation) {
		this.tracklocation = tracklocation;
	}

	public int getTrackfilefoldercount() {
		return trackfilefoldercount;
	}

	public void setTrackfilefoldercount(int trackfilefoldercount) {
		this.trackfilefoldercount = trackfilefoldercount;
	}

	public int getTracklibfoldercount() {
		return tracklibfoldercount;
	}

	public void setTracklibfoldercount(int tracklibfoldercount) {
		this.tracklibfoldercount = tracklibfoldercount;
	}

}
