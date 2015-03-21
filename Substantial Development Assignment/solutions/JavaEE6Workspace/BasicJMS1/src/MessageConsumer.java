import javax.jms.*;
import javax.naming.Context;

import java.util.Properties;

public class MessageConsumer {

	static class MyListener implements MessageListener {
		public void onMessage(Message newMessage) {
			try {
				// declare a text message to be a reference to
				// the message passed in
				TextMessage message = (TextMessage) newMessage;

				// print out the message
				System.out.println("Message received ");
				System.out.println(message.getText());
				// message.acknowledge ();
				// System.out.println("acknowledgement sent");
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e);
			}
		}

	}

	public final static String JNDI_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
	public final static String JMS_FACTORY = "jms/RemoteConnectionFactory";

	public static void main(String[] args) {
		// here are the variables you will need to send a message
		QueueConnectionFactory factory = null;
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueReceiver receiver = null;

		Properties env = new Properties();
		env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
		env.put(Context.PROVIDER_URL, "remote://localhost:4447");
		env.put(Context.SECURITY_PRINCIPAL, "sarah");
		env.put(Context.SECURITY_CREDENTIALS, "sarahsarah");

		try {
			// create the initial context
			javax.naming.InitialContext context = new javax.naming.InitialContext(
					env);
			// lookup the JBoss connection factory
			Object tmp = context.lookup("jms/RemoteConnectionFactory");
			factory = (QueueConnectionFactory) tmp;

			// create a QueueConnection
			connection = factory.createQueueConnection("sarah", "sarahsarah");

			// lookup the default testQueue
			queue = (Queue) context.lookup("jms/queue/test");

			// create a session
			session = connection.createQueueSession(false,
					QueueSession.AUTO_ACKNOWLEDGE);

			// create a receiver on the session object using the
			// createReceiver(queue) method
			receiver = session.createReceiver(queue);
			receiver.setMessageListener(new MyListener());
			connection.start();

			synchronized (receiver) {
				while (true) {
					try {
						receiver.wait();
					}
					catch (InterruptedException ie) {
					}
				}
			}
		}

		catch (JMSException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (javax.naming.NamingException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
