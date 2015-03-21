package com.conygre.cd;

import java.util.List;


import javax.ejb.*;


@Remote
public interface CompactDiscFacade
{

	public List<CompactDiscProduct> getCompactDiscs();
	public int addCompactDisc(CompactDiscProduct disc);
	public boolean removeCompactDisc(int id);

}