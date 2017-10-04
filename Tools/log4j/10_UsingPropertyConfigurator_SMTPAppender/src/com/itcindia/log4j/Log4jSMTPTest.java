package com.itcindia.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jSMTPTest {
	static{
		PropertyConfigurator.configure("src/itc-log4j.properties");
	}
	static Logger log = Logger.getLogger("Log4jSMTPTest");
	public static void main(String[] args) {
		System.out.println("Started");
		log.error("This is TEST MAIL");
		System.out.println("Main Completed");
	}

}