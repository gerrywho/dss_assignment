// This entity class uses annotations instead of the mapping XML file

package com.conygre.cd;

import java.io.Serializable;
import javax.persistence.*;

@Entity @Table(name="compact_discs")
public class CompactDiscProduct implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(name="title") private String title;
	@Column(name="artist") private String artist;
	@Column(name="price") private double price;
	@Column(name="tracks") private int tracks;

	public CompactDiscProduct() {}

	public CompactDiscProduct(String t, double p,String a, int tr, int i){
	    title=t;
	    price=p;
	    artist=a;
	    tracks=tr;
	    id = i;
	  }

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTracks() {
		return tracks;
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	public int getId() {
		return id;
	}


}
