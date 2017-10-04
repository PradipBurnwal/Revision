package com.doa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doa.beans.LoanService;

public class DOATest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/doa/common/application-context.xml");
		LoanService loanService = context.getBean("loanService", LoanService.class);
		
		double intAmt = loanService.calIntAmt(1000000L, 2, "Business Loan", "SelfEmploy", "hyd");
		System.out.println("Interest Amount : "+intAmt);
	}

}
