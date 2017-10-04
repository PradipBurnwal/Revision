package com.import12.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootAppConfig.class);
		Game gm = context.getBean("game", Game.class);
		gm.start();
	}

}
