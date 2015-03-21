package com.conygre.training.services;

import java.util.Collection;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.jws.WebService;

import com.conygre.training.dao.CompactDiscDAO;

import com.conygre.training.entities.CompactDisc;
@Stateless
@WebService(endpointInterface="com.conygre.training.services.CompactDiscService")
@Remote(CompactDiscService.class)
@TransactionAttribute (TransactionAttributeType.REQUIRED)
public class CompactDiscServiceEJB implements CompactDiscService {
	
		
	@Inject // uses reflection
	private CompactDiscDAO dao;
	
//	@Resource
//	private SessionContext context;

	public void setDao(CompactDiscDAO dao) {
		// do something really important on injection
		this.dao = dao;
	}

	
	public void addToCatalog(CompactDisc disc) {
		if (!dao.getAllDiscs().contains(disc))
			dao.addCompactDisc(disc);
		else {
			//context.setRollbackOnly();
		}
	}
	
	public Collection<CompactDisc> getCatalog() {
		return dao.getAllDiscs();
	}
}
