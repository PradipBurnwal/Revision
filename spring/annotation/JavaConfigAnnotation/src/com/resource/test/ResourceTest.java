package com.resource.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ResourceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.resource.test");
		Robot rb = context.getBean("robot", Robot.class);
		System.out.println(rb);
	}

}
