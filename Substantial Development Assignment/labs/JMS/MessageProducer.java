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

			// lookup the JBoss connection factory

			// create a QueueConnection

			// lookup the default testQueue

			// create a session




			// now on the session, create a QueueSender to send your message
			// using the sender variable


			// start the connection


		  System.out.println ("Producing a message");

			// create a TextMessage called message
			// create the object using the createTextMessage()
			// on the session object


			System.out.println ("Sending message ");

			// finally, send your message
			// on the QueueSender you created earlier


			// close the session, all finished
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
