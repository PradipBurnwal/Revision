package com.pe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.beans.Payslip;

public class PeTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pe/common/application-context.xml"));
		Payslip payslip = factory.getBean("payslip", Payslip.class);
		System.out.println(payslip);
	}

}
