package com.conygre.ejb;

import javax.ejb.*;
import javax.jws.WebService;

// TO DO add annotations to make this remote and stateless.
@Stateless
@WebService(endpointInterface="com.conygre.ejb.BookRetriever")
@Remote
// TO DO implement your remote interface here

public class BookRetrieverEJB implements BookRetriever{
	Book[] bookshelf;
	
	public BookRetrieverEJB() {
      // set up an array of books using an array initializer
      Book[] bookArray = {
        new Book("The Voyage of the Dawn Treader",4.99,"C.S. Lewis",1),
        new Book("Linux Desk Reference",29.99,"Scott Hawkins",2),
        new Book("Let the Nations Be Glad",5.99,"John Piper",3),
        new Book("Treasure Island",3.99,"Robert Louis Stephenson",4),
        new Book("How to be a Great Guitarist",17.99,"Paul Hunnisett",5),
        new Book("Heart of a Hooligan",4.99,"Muthena Paul Alkazraj",6),
        new Book("Shogun",12.99,"James Clavell",7),
        new Book("The Art of War",4.99,"Sun Tzu",8)
      };
      // assign the instance variable be the array of books
      bookshelf = bookArray;
  }

  public Book getBookByID(int id) {
	  // we will keep this simple
	  if (id<=8)
	    return bookshelf[id-1];
	  else return null;

  }

  // other methods could go here for book retrieval as well
}