package com.sdp.beans;

public class MessageWriter {
	private IMessageProducer messageProducer;
	public void writeMessage(String message){
		String cMessage = null;
		messageProducer = new HtmlMessageProducerImpl();
		cMessage = messageProducer.convertMessage(message);
		System.out.println(cMessage);
	}

}
