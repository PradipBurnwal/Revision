package com.itc.log4j;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Calculator {
	static{
		Layout lay = new PatternLayout("'%d','%C','%p','%c','%M','%m','%l','%n'");
		Appender app = null;
		try {
			app = new FileAppender(lay, "itc.log");
			BasicConfigurator.configure(app);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static Logger log = Logger.getLogger("Test");
	public static void main(String[] args) {
		Logger root = Logger.getRootLogger();
		root.setLevel(Level.INFO);
		log.info("-Main() method Started-");
		log.info("Creating Scanner Object");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Numerber :");
		int val1 = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int val2 = sc.nextInt();
		log.info("Creating Addition Object");
		Addition addition = new Addition();
		log.info("Addition Object Created");
		log.info(" invoking Add method from Addition");
		int res = addition.add(val1, val2);
		log.info("Addition in main:"+res);
		System.out.println(res);
		log.info("-Main()method Completed-");
	}

}
