package com.propertySource7.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PSTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.propertySource7.test");
		Astronaut astronaut = context.getBean("astronaut", Astronaut.class);
		astronaut.knowWhere();
		System.out.println(astronaut);
	}

}
