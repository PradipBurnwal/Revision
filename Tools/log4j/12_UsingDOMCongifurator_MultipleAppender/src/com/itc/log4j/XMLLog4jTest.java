package com.itc.log4j;

import org.apache.log4j.xml.DOMConfigurator;

public class XMLLog4jTest {
	static{
		DOMConfigurator.configure("src/log4j.xml");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
