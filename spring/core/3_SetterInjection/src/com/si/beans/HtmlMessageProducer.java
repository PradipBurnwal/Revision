package com.si.beans;

public class HtmlMessageProducer implements IMessageProducer {

	@Override
	public String convertMessage(String message) {
		return "<html><body>"+message+"</body></html>";
	}

}
