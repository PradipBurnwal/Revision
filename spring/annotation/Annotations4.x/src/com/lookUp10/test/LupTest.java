package com.lookUp10.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LupTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.lookUp10.test");
		Container container = context.getBean("container", Container.class);
		container.receive("data1");
	}

}
