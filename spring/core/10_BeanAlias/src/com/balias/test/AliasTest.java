package com.balias.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.balias.beans.Address;

public class AliasTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/balias/common/application-context.xml"));
		/*Address addr = factory.getBean("adr", Address.class);
		System.out.println(addr);*/
		String[] aliases = factory.getAliases("address");
		for(String alias:aliases){
			System.out.println(alias);
		}
	}

}
