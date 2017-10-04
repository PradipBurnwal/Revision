package com.ifmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifmi.beans.StockAnalyzer;

public class IfmiTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ifmi/common/application-context.xml"));
		StockAnalyzer analyzer = factory.getBean("stockAnalyzer", StockAnalyzer.class);
		analyzer.analyse("fg");
	}

}
