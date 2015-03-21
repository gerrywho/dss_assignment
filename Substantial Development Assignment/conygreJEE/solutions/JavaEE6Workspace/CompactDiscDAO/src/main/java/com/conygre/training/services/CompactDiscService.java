package com.conygre.training.services;

import java.util.Collection;

import javax.inject.Inject;



import com.conygre.training.dao.CompactDiscDAO;
import com.conygre.training.dao.jpa.MyJPA;
import com.conygre.training.entities.CompactDisc;

public class CompactDiscService {
	
	@MyJPA 
	@Inject
	private CompactDiscDAO dao;
	
	public void setDao(CompactDiscDAO dao) {
		this.dao = dao;
	}

	public void addToCatalog(CompactDisc disc) {
		if (!dao.getAllDiscs().contains(disc))
			dao.addCompactDisc(disc);
	}
	
	public Collection<CompactDisc> getCatalog() {
		return dao.getAllDiscs();
	}
}
