package com.conygre.training.services.test;



import java.util.Collection;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.conygre.training.entities.CompactDisc;
import com.conygre.training.services.CompactDiscService;

public class MainTest {
	public static void main(String[] args) {
		
		 WeldContainer weld = new Weld().initialize();
		 CompactDiscService service = weld.instance().select(CompactDiscService.class).get();
		
		Collection<CompactDisc> allCds = service.getCatalog();	
		for (CompactDisc compactDisc : allCds) {
			System.out.println(compactDisc.getTitle());
			
			
			
		}
	}
	
	
}
