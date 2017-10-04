package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.IMessageProducer;
import com.fs.beans.MessageWriter;

public class CbyIocMbyProgrammerTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fs/common/application-context.xml"));
		MessageWriter messageWriter = factory.getBean("messageWriter", MessageWriter.class);
		IMessageProducer messageProducer = factory.getBean("pdf", IMessageProducer.class);
		messageWriter.setMessageProducer(messageProducer);
		messageWriter.writeMessage("Spring creating the object of our class, and programmer managing the Dependency");
	}

}
