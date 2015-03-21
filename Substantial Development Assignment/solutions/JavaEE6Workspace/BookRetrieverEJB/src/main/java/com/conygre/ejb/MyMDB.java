package com.conygre.ejb;

import javax.ejb.MessageDriven;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.*;


@MessageDriven(activationConfig= {
@ActivationConfigProperty(propertyName="acknowledgeMode", propertyValue="Auto-acknowledge"),
@ActivationConfigProperty(propertyName="destinationType", propertyValue="javax.jms.Queue"),
@ActivationConfigProperty(propertyName="destination", propertyValue="queue/test")})
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class MyMDB implements MessageListener {

		
	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		TextMessage message = (TextMessage) arg0;
		try {			
			System.out.println(message.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
