package com.conygre.ejb.test;

import static org.junit.Assert.*;


import javax.ejb.EJB;


import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.conygre.ejb.Book;
import com.conygre.ejb.BookRetriever;
import com.conygre.ejb.BookRetrieverEJB;


@RunWith(Arquillian.class)
public class BookRetrieverTest {

	@EJB
	BookRetriever retriever;
	
	@Deployment
	public static JavaArchive createDeployment() {
	    return ShrinkWrap.create(JavaArchive.class, "test.jar")
	        .addClasses(BookRetrieverEJB.class, Book.class, BookRetriever.class)
	        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	       
	}
	
	
	//@Ignore
	@Test
	public void testThatTheEJBReturnsTheRightBooks() {
		assertEquals(retriever.getBookByID(2).getTitle(), "Linux Desk Reference");
	}

}
