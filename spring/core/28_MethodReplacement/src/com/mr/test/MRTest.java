package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		PlanFinder pFinder = factory.getBean("planFinder", PlanFinder.class);
		String[] plans = pFinder.findPlans(40, 713346, 2000, 1, 2);
		//String[] plans = pFinder.findPlans(32, 560070);
		System.out.println("Marketing Plan");
		for(String plan: plans){
			System.out.println(plan);
		}
	}

}