package com.itcindia.testFixture;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(PalindromeTest.class);
		List<Failure> failures = result.getFailures();
		for(Failure failure:failures){
			System.out.println(failure.getMessage());
		}
		System.out.println("Success:"+(result.getRunCount()-result.getFailureCount()));
	}

}
