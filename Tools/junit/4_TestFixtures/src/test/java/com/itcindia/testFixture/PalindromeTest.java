package com.itcindia.testFixture;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
	private Palindrome palindrome;
	private String palindromeIn;
	private String nonPalindromeIn;
	
	@BeforeClass
	public static void load(){
		System.out.println("load()");
	}
	@Before
	public void init(){
		System.out.println("init()");
		palindrome = new Palindrome();
		palindromeIn = "malayalam";
		nonPalindromeIn = "india";
	}
	@Test
	public void testPalindrome(){
		boolean actual = false;
		actual = palindrome.check(palindromeIn);
		assertTrue(actual);
	}
	@Test
	public void testNonPalindrome(){
		boolean actual = false;
		actual = palindrome.check(nonPalindromeIn);
		assertTrue(actual);
	}
	@After
	public void cleanUp(){
		System.out.println("cleanUp()");
		palindrome = null;
	}
	@AfterClass
	public static void shutdown(){
		System.out.println("shutdown()");
	}
}