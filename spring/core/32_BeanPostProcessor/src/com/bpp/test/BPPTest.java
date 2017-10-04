package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Engine;
import com.bpp.beans.Motor;
import com.bpp.util.BeanStatistics;

public class BPPTest {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/bpp/common/application-context.xml");
		BeanFactory context =new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));
		BeanPostProcessor bpp = context.getBean("instanceTrackerBeanPostProcessor", BeanPostProcessor.class);
		((ConfigurableListableBeanFactory)context).addBeanPostProcessor(bpp);
		Motor moter = context.getBean("motor", Motor.class);
		Engine engine = context.getBean("engine", Engine.class);
		System.out.println("Object : "+BeanStatistics.getInstance());
	}

}
