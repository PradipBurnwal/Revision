package com.itcindia.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jUtil implements ServletContextListener{
	Logger log = Logger.getLogger(Log4jUtil.class);
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		PropertyConfigurator.configure("itc-log4j.properties");
		log.info("Log4j System is Initialized at Container StartUp");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//no code
	}

}
