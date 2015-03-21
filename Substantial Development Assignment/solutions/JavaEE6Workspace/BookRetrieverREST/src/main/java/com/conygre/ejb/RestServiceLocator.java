package com.conygre.ejb;

import javax.ejb.Local;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
@Local
@ApplicationPath("/rest")
public class RestServiceLocator extends Application {

}
