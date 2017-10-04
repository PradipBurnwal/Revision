package com.jcaa6.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jcaa6Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AwAppConfig.class);
		ControlBoard cb = context.getBean("controlBoard", ControlBoard.class);
		cb.powerOn();
		System.out.println(cb.getMachine().hashCode());
	}

}
