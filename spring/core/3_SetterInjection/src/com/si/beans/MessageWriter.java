package com.si.beans;

public class MessageWriter {

	IMessageProducer messageProducer;
	public void writeMessage(String message){
		String convertedMessage = null;
		convertedMessage = messageProducer.convertMessage(message);
		System.out.println(convertedMessage);		
	}
	
	public MessageWriter(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
	
	
	
	public void setMessageProducer(IMessageProducer messageProducer){
		this.messageProducer = messageProducer;
	}
}
