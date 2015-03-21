package com.conygre.training.jee.jms;
import javax.jms.*;
import javax.naming.Context;
import javax.naming.NamingException;

import java.awt.print.Book;
import java.util.Properties;

public class MessageProducer {

	public final static String JNDI_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
	
	public static void main(String[] args) {

		Properties env = new Properties();
		env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
		env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		env.put(Context.SECURITY_PRINCIPAL, "sarah");
		env.put(Context.SECURITY_CREDENTIALS, "sarahsarah");
		
		QueueConnectionFactory factory = null;
		Queue queue = null;
		
		try {
			
			// create the initial context
			javax.naming.InitialContext icontext = 
					new javax.naming.InitialContext(env);
			factory = (QueueConnectionFactory) icontext.lookup("jms/RemoteConnectionFactory");

			queue = (Queue) icontext.lookup("jms/queue/test");
			
			
		}
		catch (NamingException e) {
			System.out.println("Either the queue or connection factory don't exist" + e);
		}
		try (JMSContext context = factory.createContext("sarah", "sarahsarah", JMSContext.DUPS_OK_ACKNOWLEDGE);) {
			//TextMessage message = context.createTextMessage("Hello from the producer");
			System.out.println("Sending the message");
			context.createProducer().send(queue, "Hello from the producer");
					
		}
	}
}
