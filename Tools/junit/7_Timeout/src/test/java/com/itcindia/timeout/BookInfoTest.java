package com.itcindia.timeout;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookInfoTest {
	private static BookInfo bookInfo;
	private String timeOutIsbn;
	private String anyIsbn;
	
	@BeforeClass
	public static void lookUp(){
		bookInfo = new BookInfo();
	}
	
	@Before
	public void init(){
		timeOutIsbn = "isbn1001";
		anyIsbn = "isbn1028";
	}
	@Test
	public void testTimeOutIsbn() throws InterruptedException{
		float expectedPrice = 303;
		float actualPrice = 0;
		
		actualPrice = bookInfo.getBookPrice(timeOutIsbn);
		assertEquals(expectedPrice,actualPrice,0);
	}
	
	@Test
	public void testAnyIsbn() throws InterruptedException{
		float expectedPrice = 35.34f;
		float actualPrice = 0;
		
		actualPrice = bookInfo.getBookPrice(anyIsbn);
		assertEquals(expectedPrice, actualPrice,0);
	}
	
	@After
	public void cleanUp(){
		timeOutIsbn = null;
		anyIsbn = null;
	}
	
	@AfterClass
	public static void shutdown(){
		bookInfo = null;
	}
}
