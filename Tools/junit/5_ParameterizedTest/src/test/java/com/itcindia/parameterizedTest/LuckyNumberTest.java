package com.itcindia.parameterizedTest;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LuckyNumberTest {
	private int no;
	private int expectedLuckyNumber;
	private LuckyNumber luckyNumber = null;
	public LuckyNumberTest(int no, int expectedLuckyNumber) {
		super();
		this.no = no;
		this.expectedLuckyNumber = expectedLuckyNumber;
	}
	@Parameters
	public static List<Integer[]> getParameters(){
		return Arrays.asList(new Integer[][]{{121,4},{234,9},{8,8}});
	}
	
	@Before
	public void init(){
		luckyNumber = new LuckyNumber();
	}
	
	@Test
	public void testLuckyNumber(){
		int actualLuckyNumber = 0;
		actualLuckyNumber = luckyNumber.getLuckyNumber(no);
		Assert.assertEquals(expectedLuckyNumber, actualLuckyNumber);
	}
}
