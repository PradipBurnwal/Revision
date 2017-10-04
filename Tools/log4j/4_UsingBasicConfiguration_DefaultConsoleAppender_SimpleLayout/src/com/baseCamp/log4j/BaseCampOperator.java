package com.baseCamp.log4j;

import org.apache.log4j.Logger;

public class BaseCampOperator {
	Logger log = Logger.getLogger(this.getClass());
	public int getReminder(String ab,String bc){
		log.info("-getReminder invoked-");
		log.debug("Value:"+ab+"\t"+bc);
		int rem = -1;
		try{
			int val1 = Integer.parseInt(ab);
			log.debug("1st int value: "+val1);
			int val2 = Integer.parseInt(bc);
			log.debug("2nd int values: "+val2);
			log.info("Calculating Reminder");
			rem = val1%val2;
			log.info("Reminder Calculated");
		}catch(Exception e){
			log.error("Exception Occured");
		}
		log.debug("Calculated Reminder: "+rem);
		log.info("Returning Reminger: ");
		return 0;
	}
}
