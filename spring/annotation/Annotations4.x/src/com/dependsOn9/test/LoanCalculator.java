package com.dependsOn9.test;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn
public class LoanCalculator {

	public LoanCalculator() {
		System.out.println("LoanCalculator initialized...");
	}
	

}
