package com.conygre.jee.ejb.timer;

import java.util.Date;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;

@Stateless
public class TimerExampleEJB implements TimerExample {
	
	@Resource 
	private SessionContext ctx;
	 
	   public void scheduleTimer(long milliseconds)
	   {
	      ctx.getTimerService().createTimer(new Date(new Date().getTime() + milliseconds), "Hello World");
	   }
	 
	   @Timeout
	   public void timeoutHandler(Timer timer)
	   {
	      System.out.println("---------------------");
	      System.out.println("* Received Timer event: " + timer.getInfo());
	      System.out.println("---------------------");
	 
	      timer.cancel();
	   }
}
