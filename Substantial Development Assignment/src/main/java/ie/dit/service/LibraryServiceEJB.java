package ie.dit.service;

import java.util.Collection;

import javax.ejb.EJB;

import ie.dit.dao.LibraryDAO;
import ie.dit.entities.Library;
import ie.dit.serviceInterface.LibraryServiceLocal;

public class LibraryServiceEJB implements LibraryServiceLocal{

	@EJB
	private LibraryDAO libraryinterface;
	public Collection<Library> getAllLibraries() {
		// TODO Auto-generated method stub
		return libraryinterface.getAllLibraries();
	}

}
