import javax.jms.*;
import java.util.Enumeration;


public class MessageProducer {

  public static void main(String[] args)
  {

	  // here are the variables you will need to send a message
	  QueueConnectionFactory factory = null;
	  QueueConnection connection = null;
	  QueueSession session = null;
	  Queue queue = null;
	  QueueSender sender = null;
	  TextMessage message = null;

  	try
  	{
			// create the initial context
			javax.naming.InitialContext context= new javax.naming.InitialContext();
			// lookup the JBoss connection factory
			Object tmp = context.lookup("ConnectionFactory");
			factory = (QueueConnectionFactory) tmp;

			// create a QueueConnection
			connection = factory.createQueueConnection();

			// lookup the default testQueue
			queue = (Queue) context.lookup("queue/testQueue");

			// create a session
			session = connection.createQueueSession(false,
			QueueSession.AUTO_ACKNOWLEDGE);




			// now on the session, create a QueueSender to send your message
			// using the sender variable
      sender = session.createSender(queue);

			// start the connection
			System.out.println ("Starting Connection");
			connection.start();


		  System.out.println ("Producing a message");

			// create a TextMessage called message
			// create the object using the createTextMessage()
			// on the session object
			message = session.createTextMessage();
			message.setText("Hello from the Conygre producer ");

			System.out.println ("Sending message ");

			// finally, send your message
			// on the QueueSender you created earlier
			sender.send (message);

			// close the session, all finished
			session.close();
			connection.close();

			System.exit(0);
	}

    catch (JMSException e)
    {
			System.out.println(e.getMessage());
    	e.printStackTrace();
    }
    catch (javax.naming.NamingException e)
    {
			System.out.println(e.getMessage());
		 	e.printStackTrace();
    }
  }
}
