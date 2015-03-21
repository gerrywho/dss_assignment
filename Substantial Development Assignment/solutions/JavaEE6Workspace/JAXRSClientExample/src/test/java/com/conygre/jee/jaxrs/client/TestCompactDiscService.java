package com.conygre.jee.jaxrs.client;

import com.conygre.training.entities.CompactDisc;
import com.conygre.training.entities.CompactDiscList;

import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by nicktodd on 08/09/2014.
 */
public class TestCompactDiscService {

	private WebTarget target;
	
	@Before
	public void init() {
		Client client = ClientBuilder.newClient();
		target = client
				//.target("http://localhost:8080/JAXRSExample/rest/compactdiscs");
				.target("http://www.conygre.com/compactdisc/rest/compactdiscs");
		
	}
	
	
	@Test
	public void testThatCollectionOfCDsCanBeRetrieved() {
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
				.get();
		CompactDiscList list = response
				.readEntity(new GenericType<CompactDiscList>() {
				});

		assertTrue(list.getDiscCollection().size() > 1);
		for (CompactDisc disc : list.getDiscCollection()) {
			System.out.println(disc.getTitle());
		}

	}

	@Test
	public void testThatANewCDCanBeAdded() {
		boolean foundMatch = false;
		CompactDisc disc = new CompactDisc("Another Brick in the Wall", 8.99,
				"Pink Floyd", 12, 6);
		target.request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.json(disc));
		// now check that the new item is in the list
		Response responseWithNewCD = target.request(
				MediaType.APPLICATION_JSON_TYPE).get();
		CompactDiscList list = responseWithNewCD
				.readEntity(new GenericType<CompactDiscList>() {
				});
		for (CompactDisc discItem : list.getDiscCollection()) {
			System.out.println(discItem.getTitle());
			if (discItem.getArtist().equals("Pink Floyd")) {
				foundMatch = true;
			}
		}
		assertTrue(foundMatch);
	}
	
	@Test
	public void testThatACDCanBeModified() {
		boolean foundMatch=false;
		CompactDisc disc = new CompactDisc("Gold", 12.99, "AbbaTribute", 12, 1);
		target.request(MediaType.APPLICATION_JSON_TYPE)
		.put(Entity.json(disc));
		Response responseWithChangedCD = target.request(
				MediaType.APPLICATION_JSON_TYPE).get();
		CompactDiscList list = responseWithChangedCD
				.readEntity(new GenericType<CompactDiscList>() {
				});
		for (CompactDisc discItem : list.getDiscCollection()) {
			System.out.println(discItem.getArtist());
			if (discItem.getArtist().equals("AbbaTribute")) {
				foundMatch = true;
			}
		}
		assertTrue(foundMatch);	
	}
	
	@Test
	public void testThatACDCanBeDeleted() {
		boolean discMissing=true;
		
		Client client = ClientBuilder.newClient();
		WebTarget deleteTarget = client
				.target("http://www.conygre.com/compactdisc/rest/compactdiscs/1");
				//.target("http:localhost:8080/JAXRSExample/rest/compactdiscs/1");
		
		deleteTarget.request().delete();
		
		Response responseWithRemovedCD = this.target.request(
				MediaType.APPLICATION_JSON_TYPE).get();
		CompactDiscList list = responseWithRemovedCD
				.readEntity(new GenericType<CompactDiscList>() {
				});
		for (CompactDisc discItem : list.getDiscCollection()) {
			System.out.println(discItem.getArtist());
			if (discItem.getTitle().equals("Gold")) {
				discMissing = false;
			}
		}
		assertTrue(discMissing);	
	}

}
