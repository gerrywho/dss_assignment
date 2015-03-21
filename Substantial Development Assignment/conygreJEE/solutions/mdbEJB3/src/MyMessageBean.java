package com.conygre.message;

import javax.jms.*;
import javax.ejb.*;


@MessageDriven(activationConfig= {
@ActivationConfigProperty(propertyName="acknowledgeMode", propertyValue="Auto-acknowledge"),
@ActivationConfigProperty(propertyName="destinationType", propertyValue="javax.jms.Queue"),
@ActivationConfigProperty(propertyName="destination", propertyValue="queue/testQueue")})


public class MyMessageBean implements MessageListener {


    public void onMessage(Message message) {
        for (int i=0; i<10; i++)
            System.out.println("Got a message");
        TextMessage text = (TextMessage)message;
        try
        {
            System.out.println("Message was " + text.getText());
        }
        catch (JMSException e) {
            System.out.println("MyMessageEJB threw an exception " + e);
         }

    }
}


