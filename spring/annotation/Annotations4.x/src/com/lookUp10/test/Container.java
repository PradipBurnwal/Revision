package com.lookUp10.test;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Container {
	public void receive(String data){
	RequestHandler requestHandler = null;
	
	requestHandler = lookupRequestHandler();
	requestHandler.setData(data);
	requestHandler.process();
	}

	@Lookup
	protected RequestHandler lookupRequestHandler() {
		return null;
	}
}