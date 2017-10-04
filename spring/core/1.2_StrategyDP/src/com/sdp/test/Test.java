package com.sdp.test;

import com.sdp.beans.MessageWriter;

public class Test {
	public static void main(String[] args) {
		MessageWriter messageWriter = null;
		messageWriter = new MessageWriter();
		messageWriter.writeMessage("As we are following SDP but still MessageWriter is TIGHTLY COUPLED and Faceing 2 problem, So FACTORY CLASS come into picture");
	}

}
