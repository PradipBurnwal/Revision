package com.sdp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.sdp.beans.IMessageProducer;
import com.sdp.beans.MessageWriter;
import com.sdp.util.AppFactory;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException, IOException {
		MessageWriter messageWriter = null;
		IMessageProducer messageProducer = null;
		
		messageWriter = (MessageWriter) AppFactory.createObject("messageWriter.class");
		messageProducer = (IMessageProducer) AppFactory.createObject("messageProducer.class");
		
		messageWriter.setMessageProducer(messageProducer);
		
		messageWriter.writeMessage("Stategy design Pattern Working!!!");
	}

}
