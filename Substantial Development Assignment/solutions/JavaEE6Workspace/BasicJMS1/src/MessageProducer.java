import javax.jms.*;
import javax.naming.Context;

import java.awt.print.Book;
import java.util.Properties;

public class MessageProducer {

	public final static String JNDI_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
	public final static String JMS_FACTORY = "jms/RemoteConnectionFactory";

	public static void main(String[] args) {

		// here are the variables you will need to send a message
		QueueConnectionFactory factory = null;
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		TextMessage message = null;

		try {
			Properties env = new Properties();
			env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
			env.put(Context.PROVIDER_URL, "remote://localhost:4447");
			env.put(Context.SECURITY_PRINCIPAL, "sarah");
			env.put(Context.SECURITY_CREDENTIALS, "sarahsarah");

			// create the initial context
			javax.naming.InitialContext context = 
					new javax.naming.InitialContext(env);
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

			// now on the session, create a QueueSender to send your message
			// using the sender variable
			sender = session.createSender(queue);

			// start the connection
			System.out.println("Starting Connection");
			connection.start();
			System.out.println("Producing a message");

			// create a TextMessage called message
			// create the object using the createTextMessage()
			// on the session object
			message = session.createTextMessage();
			message.setText("Hello from the Citi producer ");
			
			
			System.out.println("Sending message ");

			// finally, send your message
			// on the QueueSender you created earlier			
			sender.send(message);

			// close the session, all finished
			session.close();
			connection.close();

		
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
