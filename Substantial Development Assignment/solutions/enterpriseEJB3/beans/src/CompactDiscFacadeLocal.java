package com.conygre.cd;


import java.util.List;

import javax.ejb.Local;

@Local
public interface CompactDiscFacadeLocal {
	public List<CompactDiscProduct> getCompactDiscs();
	public int addCompactDisc(CompactDiscProduct disc);
	public boolean removeCompactDisc(int id);

}