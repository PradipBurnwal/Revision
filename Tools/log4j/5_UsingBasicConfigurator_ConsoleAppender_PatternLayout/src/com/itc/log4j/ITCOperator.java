package com.itc.log4j;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class ITCOperator {
	Logger log = Logger.getLogger(this.getClass());
	public int getReminder(String ab, String bc){
		log.info("-getReminder Invoked-");
		log.debug("Value: "+ab+"\t"+bc);
		int rem = -1;
		try{
			int val1 = Integer.parseInt(ab);
			log.debug("1st int value is:"+val1);
			int val2 = Integer.parseInt(bc);
			log.debug("2nd int value is:"+val2);
			log.info("Calculating Reminder");
			rem = val1 % val2;
			log.info("Reminded Calculated");
		}catch(Exception e){
			log.error("Exception Occured");
		}
		log.debug("Calculated Reminder is: "+rem);
		log.info("Returning Reminder: ");
		return rem;
	}
}
