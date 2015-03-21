package com.conygre.training.dao.fake;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

import com.conygre.training.dao.CompactDiscDAO;
import com.conygre.training.entities.CompactDisc;

@Alternative
public class FakeCompactDiscDAO implements CompactDiscDAO {
	
	private Set<CompactDisc> library;
		
	
	public FakeCompactDiscDAO() {
		library = new HashSet<CompactDisc>();
		library.add(new CompactDisc("Gold", 12.99, "Abba", 12));
		library.add(new CompactDisc("Spice World", 4.99, "Spice Girls", 9));
		library.add(new CompactDisc("Money for Nothing", 7.99, "Dire Straits", 13));
		library.add(new CompactDisc("True", 5.99, "Spandau Ballet", 10));
		library.add(new CompactDisc("Justin", 4.99, "Justin Bieber", 10));
	}
	
	
	
	
	
	public Set<CompactDisc> getLibrary() {
		return library;
	}

	public void setLibrary(Set<CompactDisc> library) {
		this.library = library;
	}

	public void addCompactDisc(CompactDisc disc) {
		// TODO Auto-generated method stub
		library.add(disc);

	}

	public CompactDisc getCompactDiscByTitle(String title) {
		// Assumes only 1 CD ever has a particular title
		for (CompactDisc compactDisc : library) {
			if (compactDisc.getTitle().equals(title)) {
				return compactDisc;
			}
		}
		// will only return if there are no matches
		return null;
	}

	public Collection<CompactDisc> getDiscsByArtist(String artist) {
		Set<CompactDisc> returnDiscs = new HashSet<CompactDisc>();
		for (CompactDisc compactDisc : library) {
			if (compactDisc.getArtist().equals(artist)) {
				returnDiscs.add(compactDisc);
			}
		}
		return returnDiscs;	}

	public Collection<CompactDisc> getAllDiscs() {
		// TODO Auto-generated method stub
		return library;
	}

}
