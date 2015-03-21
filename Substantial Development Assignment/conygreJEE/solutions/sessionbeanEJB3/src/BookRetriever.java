package com.conygre.ejb;

import javax.ejb.Remote;

@Remote
public interface BookRetriever
{
	public Book getBookByID(int id);

}