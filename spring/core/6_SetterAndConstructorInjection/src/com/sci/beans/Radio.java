package com.sci.beans;

public class Radio {
	private IReceiver receiver;
	
	//when we want to inject Dependent Via CONSTRUCTOR INJECTION (Alt+shift+s,o)
	/*public Radio(IReceiver receiver) {
		System.out.println("radio");
		this.receiver = receiver;
	}*/

	public void listen(){
		receiver.tuneup();
		System.out.println("listening...");
	}
	
	//when we want to inject Dependent Via SETTER INJECTION no need of getter
	public void setReceiver(IReceiver receiver) {
		this.receiver = receiver;
	}
	
}
