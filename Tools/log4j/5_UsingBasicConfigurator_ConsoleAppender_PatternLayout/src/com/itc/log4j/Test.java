package com.itc.log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Test {
	static{
		Layout lay = new PatternLayout("'%d','%C','%p','%c','%M','%m','%l','%n'");
		Appender app = null;
		try{
			app = new ConsoleAppender(lay);
			BasicConfigurator.configure(app);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	static Logger log = Logger.getLogger("Test");
	public static void main(String[] args) {
		Logger root = Logger.getRootLogger();
		root.setLevel(Level.DEBUG);
		log.info("-Main Method Started-");
		log.debug("Value as CLA:"+args.length);
		for(int i=1; i<2; i++){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(args.length==0){
			log.warn("No cammand Line argument is Specifide");
		}
		log.debug("1st value in Main:"+args[0]);
		log.debug("2nd value in Main:"+args[1]);
		log.info("Creating ITCOperator Object");
		ITCOperator op = new ITCOperator();
		log.info("ITCOperator Object Created");
		log.info("Invoking the getReminder()method ferom ITCOperator");
		int rem = op.getReminder(args[0], args[1]);
		System.out.println("Reminder in main: "+rem);
		log.info("-Main Method Completeda");
	}

}
