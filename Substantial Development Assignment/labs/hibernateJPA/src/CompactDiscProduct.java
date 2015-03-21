// This entity class uses annotations instead of the mapping XML file

package com.conygre.cd;

import java.io.Serializable;
import javax.persistence.*;


// add an annotations specifying the table that this will map to

// ensure that the class implements Serializable
public class CompactDiscProduct {


	// add an attribute specifying a column for the id property
	// add attributes to ensure that the id column is automantically generated




	private int id;

	// add attributes for all the remaining properties
	private String title;
	private String artist;
	private double price;
	private int tracks;

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
