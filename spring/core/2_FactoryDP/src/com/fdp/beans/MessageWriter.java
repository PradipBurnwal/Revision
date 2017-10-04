package com.fdp.beans;

import com.fdp.util.MessageProducerFactory;

public class MessageWriter {
	
	public void writeMessage(String message){
		IMessageProducer messageProducer;
		String convertedMessage = null;
		messageProducer = MessageProducerFactory.createMessageProducer("pdf");
		convertedMessage = messageProducer.convertMessage(message);
		System.out.println(convertedMessage);
		
		
	}

}
