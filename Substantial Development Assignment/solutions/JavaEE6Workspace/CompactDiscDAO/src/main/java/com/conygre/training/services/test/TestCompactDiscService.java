package com.conygre.training.services.test;


import static org.junit.Assert.*;

import java.util.Collection;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Before;
import org.junit.Test;


import com.conygre.training.entities.CompactDisc;
import com.conygre.training.services.CompactDiscService;

public class TestCompactDiscService {

	private CompactDiscService service;
	
	@Before
	public void setUp() throws Exception {
		 WeldContainer weld = new Weld().initialize();
		 service = weld.instance().select(CompactDiscService.class).get();
	}
	
	@Test
	public void testCanGetAllCds() {
		Collection<CompactDisc> allCds = service.getCatalog();
		assertTrue(allCds.size() > 1);	
		for (CompactDisc compactDisc : allCds) {
			System.out.println(compactDisc.getTitle());
		}
	}
}