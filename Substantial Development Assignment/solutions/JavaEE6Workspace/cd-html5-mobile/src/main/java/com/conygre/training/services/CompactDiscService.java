package com.conygre.training.services;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.jws.WebService;

import com.conygre.training.entities.CompactDisc;
//@WebService
@Local
public interface CompactDiscService {

	public List<CompactDisc> getCatalog() ;
	public void addToCatalog(CompactDisc disc);
	
}
