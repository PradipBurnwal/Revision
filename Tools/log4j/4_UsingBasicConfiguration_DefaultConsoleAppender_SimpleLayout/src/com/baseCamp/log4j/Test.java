package com.baseCamp.log4j;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Test {
	static{
		BasicConfigurator.configure();
	}
	static Logger log = Logger.getLogger("Test");
	public static void main(String[] args) {
		Logger root = Logger.getRootLogger();
		root.setLevel(Level.DEBUG);
		log.info("-Main()_Method_Started-");
		log.debug(" Value as CLA:"+args.length);
		for(int i = 0; i<2; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(args.length==0){
			log.warn("No cammand line argument Specified");
		}
		log.debug("1st Value in main: "+args[0]);
		log.debug("2nd Value in main: "+args[1]);
		log.info("Create BaseCamp Operator Object");
		BaseCampOperator op = new BaseCampOperator();
		log.info("BaseCamp Object created");
		log.info("Invoking the getReminder() from BaseCampOperator");
		int rem = op.getReminder(args[0], args[1]);
		System.out.println("Reminder in main:"+rem);
		log.info("-Main Method Completed--");
	}

}
