package com.stereotypeAnno4.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfigTest {

	public static void main(String[] args) {
		/*Competelly Annotation Driven no use of xml file*/
		ApplicationContext context = new AnnotationConfigApplicationContext("com.stereotypeAnno4.test");
		Toy toy = context.getBean("toy", Toy.class);
		toy.play();
	}

}
