package com.fdp.util;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.fdp.beans.HtmlMessageProducer;
import com.fdp.beans.IMessageProducer;
import com.fdp.beans.PdfMessageProducer;

public class MessageProducerFactory {
	
	public static IMessageProducer createMessageProducer(String Type){
		IMessageProducer messageProducer = null;
		if(Type.equalsIgnoreCase("html")){
			messageProducer = new HtmlMessageProducer();
		}
		else if(Type.equalsIgnoreCase("pdf")){
			messageProducer = new PdfMessageProducer();
		}
		return messageProducer;
	}

}
