package com.si.beans;

public class PdfMessageProducer implements IMessageProducer {

	@Override
	public String convertMessage(String message) {
		return "<pdf>"+message+"</pdf>";
	}

}