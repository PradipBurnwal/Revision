package com.blcp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blcp.beans.Robot;

public class BLCPTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/blcp/common/application-context.xml"));
		Robot rbt = factory.getBean("robot", Robot.class);
		((ConfigurableListableBeanFactory)factory).destroySingletons();
	}

}
