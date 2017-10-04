package com.dopf.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dopf.beans.LoanCalculator;

public class DOTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dopf/common/application-context.xml");
		LoanCalculator lCalc = context.getBean("loanCalculator", LoanCalculator.class);
		
		System.out.println(lCalc.calInt((long) 100000, 5, "hyd"));
	}

}
