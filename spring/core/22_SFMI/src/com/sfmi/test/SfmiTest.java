package com.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.CurrencyConvertor;


public class SfmiTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sfmi/common/application-context.xml"));
		CurrencyConvertor cConvertor = factory.getBean("currencyConvertor", CurrencyConvertor.class);
		CurrencyConvertor cConvertor1 = factory.getBean("currencyConvertor", CurrencyConvertor.class);
		CurrencyConvertor cConvertor2 = factory.getBean("currencyConvertor", CurrencyConvertor.class);
		System.out.println(cConvertor==cConvertor1);
		System.out.println(cConvertor==cConvertor2);
		System.out.println(cConvertor2==cConvertor1);
	}

}
