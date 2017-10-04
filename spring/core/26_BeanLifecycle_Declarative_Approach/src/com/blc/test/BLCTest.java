package com.blc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blc.beans.Robot;

public class BLCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/blc/common/application-context.xml"));
		Robot rbt = factory.getBean("robot", Robot.class);
		((ConfigurableListableBeanFactory)factory).destroySingletons();
		//((ConfigurableListableBeanFactory)factory).destroyScopedBean("beanscope");
		//System.out.println(rbt);
	}
}