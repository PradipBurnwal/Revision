package com.i18n.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/i18n/common/application-context.xml");
		String message = context.getMessage("home.tittle", null, Locale.getDefault());
		//String message = context.getMessage("field.blank", null, Locale.CANADA_FRENCH);
		System.out.println(message);
	}

}