package com.conygre.jee.ejb.timer;

import javax.ejb.Remote;

@Remote 
public interface TimerExample {	
	    void scheduleTimer(long milliseconds);
}
