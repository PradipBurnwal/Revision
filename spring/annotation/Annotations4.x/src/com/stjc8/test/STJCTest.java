package com.stjc8.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class STJCTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(STJCAppConfig.class);
		Walky walky = context.getBean("walky", Walky.class);
		walky.speak("success");
	}

}
