package com.fdp.test;

import com.fdp.beans.HtmlMessageProducer;
import com.fdp.beans.MessageWriter;

public class Test {

	public static void main(String[] args) {
		MessageWriter messageWriter = null;
		messageWriter = new MessageWriter();
		messageWriter.writeMessage("Follow Factory Design Pattern");
	}

}
