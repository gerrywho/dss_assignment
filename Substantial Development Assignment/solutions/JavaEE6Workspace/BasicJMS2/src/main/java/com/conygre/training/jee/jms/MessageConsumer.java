package com.conygre.training.jee.jms;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.NamingException;

import java.util.Properties;

public class MessageConsumer {

	static class MyListener implements MessageListener {
		public void onMessage(Message newMessage) {
			try {
			String content = newMessage.getBody(String.class);
				System.out.println("Message received ");
				System.out.println(content);
			} catch (JMSException e) {
				System.out.println("Exception occurred: " + e);
			}
		}
	}

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
			// lookup the JBoss connection factory
			factory = (QueueConnectionFactory) icontext.lookup("jms/RemoteConnectionFactory");
			// lookup the default testQueue
			queue = (Queue) icontext.lookup("jms/queue/test");
		}
		catch (NamingException e) {
			System.out.println("Lookup problem" + e);
		}
		JMSContext context = factory.createContext("sarah", "sarahsarah");
		JMSConsumer consumer = context.createConsumer(queue);
		consumer.setMessageListener(new MyListener());
		System.out.println("Now listening...");
		
		while(true); // crude way to suspend the main thread
	}
}
