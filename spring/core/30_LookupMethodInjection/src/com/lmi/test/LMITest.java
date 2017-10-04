package com.lmi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmi.beans.Container;

public class LMITest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lmi/common/application-context.xml");
		Container container = context.getBean("container", Container.class);
		container.receive("data1");
		container.receive("data2");
		container.receive("data3");
	}

}
