package com.conygre.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.jws.WebService;


@Remote
@WebService
public interface BookRetriever {

	Book getBookByID(int id);
}
