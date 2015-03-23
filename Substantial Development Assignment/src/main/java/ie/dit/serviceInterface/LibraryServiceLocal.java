package ie.dit.serviceInterface;

import ie.dit.entities.Library;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface LibraryServiceLocal {
	Collection<Library> getAllLibraries();
}
