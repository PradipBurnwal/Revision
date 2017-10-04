package com.blc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blc.beans.Calculator;
import com.blc.handler.ShutdownCallbackHandler;

public class BLcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/blc/common/application-context.xml"));
		ShutdownCallbackHandler handler = factory.getBean("shutdownCallbackHandler", ShutdownCallbackHandler.class);
		
		//Registor this with the JVM
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(handler));
		
		Calculator cal = factory.getBean("calc", Calculator.class);
		System.out.println(cal);
		
	}

}