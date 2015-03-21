import javax.jms.*;
import java.util.Enumeration;


public class MessageConsumer
{

  public static void main(String[] args)
  {
	  // here are the variables you will need to send a message
	  QueueConnectionFactory factory = null;
	  QueueConnection connection = null;
	  QueueSession session = null;
	  Queue queue = null;
	  QueueReceiver receiver = null;


  	  try
  	  {
				// create the initial context

				// lookup the JBoss connection factory

				// create a QueueConnection

				// lookup the default testQueue

				// create a session


				// create a receiver on the session object using the
				// createReceiver(queue) method


				// set the message listener to be an inner class with
				// the onMessage method


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
