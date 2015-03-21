import javax.jms.*;
import java.util.Enumeration;


public class MessageConsumer
{

	static class MyListener implements MessageListener {
		public void onMessage(Message newMessage)
		{
			try
			{
				// declare a text message to be a reference to
				// the message passed in
				TextMessage message = (TextMessage) newMessage;

				// print out the message
				System.out.println("Message received ");
				System.out.println(message.getText());
			//message.acknowledge ();
			//System.out.println("acknowledgement sent");
		}
		catch (Exception e)
		{
			System.out.println ("Exception occurred: " + e);
		}
	}

}


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


				// create a receiver on the session object using the
				// createReceiver(queue) method
      			receiver = session.createReceiver(queue);
				connection.start();
				// set the message listener to be an inner class with
				// the onMessage method

				receiver.setMessageListener (new MyListener());



      	System.out.println ("Starting Connection");


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
