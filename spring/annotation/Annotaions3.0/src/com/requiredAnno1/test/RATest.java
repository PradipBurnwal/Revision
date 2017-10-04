package com.requiredAnno1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RATest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/requiredAnno1/test/req-anno-beans.xml");
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}

}