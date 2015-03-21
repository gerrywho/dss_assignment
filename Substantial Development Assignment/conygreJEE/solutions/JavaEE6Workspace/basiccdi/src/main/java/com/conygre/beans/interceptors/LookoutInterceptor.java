package com.conygre.beans.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

//@Interceptor
//@LookOut
public class LookoutInterceptor {

	//@AroundInvoke
	public void lookout(InvocationContext ic) throws Exception {
		System.out.println("Look out first");
		ic.proceed();
		System.out.println("Look out some more");
	}
	
}
