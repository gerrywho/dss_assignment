package com.conygre.cd;

import java.util.List;

import javax.persistence.*;
import javax.ejb.*;

@Remote
@Stateless
public class CompactDiscFacadeBean implements CompactDiscFacade {

	@PersistenceContext
	private EntityManager em;

	public List<CompactDiscProduct> getCompactDiscs()
	{
		Query query = em.createQuery("from CompactDiscProduct");
		List results = query.getResultList();
		return  results;
	}

	public int addCompactDisc(CompactDiscProduct disc)
	{
		em.persist(disc);
		return disc.getId();
	}

	public boolean removeCompactDisc(int id)
	{
		boolean result = false;
		CompactDiscProduct prod = em.find(CompactDiscProduct.class, id);
		if (prod != null)
		{
			em.remove(prod);
			result = true;
		}
		return result;

	}



}
