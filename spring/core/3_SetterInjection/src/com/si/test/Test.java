package com.si.test;

import com.si.beans.HtmlMessageProducer;
import com.si.beans.IMessageProducer;
import com.si.beans.MessageWriter;
import com.si.beans.PdfMessageProducer;

public class Test {
	public static void main(String[] args) {
		MessageWriter messageWriter = null;
		IMessageProducer messageProducer = null;
		
		messageProducer = new PdfMessageProducer();
		//Using Construction Injection
		messageWriter = new MessageWriter(messageProducer);
		//Using setter Injecvtion
		/*messageWriter = new MessageWriter();
		messageWriter.setMessageProducer(messageProducer);*/
		
		messageWriter.writeMessage("As weare injecting dependent via Setter or Constructor by this -MessageWriter is Loosely Coupled, but still our MessageTest class is HardCoded, so we need to use the Spring IOC");
	}
}
