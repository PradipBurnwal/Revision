package com.profile11.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class ProfileTest {
	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
		ApplicationContext context = new AnnotationConfigApplicationContext(RootAppConfig.class);
		ConnectionManager cm = context.getBean("connectionManager", ConnectionManager.class);
		System.out.println(cm);
	}

}