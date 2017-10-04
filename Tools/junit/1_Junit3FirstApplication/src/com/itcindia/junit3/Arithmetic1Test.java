package com.itcindia.junit3;

import com.itcindia.Arithmetic1;

import junit.framework.TestCase;

public class Arithmetic1Test extends TestCase{
	Arithmetic1 a1= null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		a1 = new Arithmetic1();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		a1 = null;
	}
	
	public void testSum2(){
		int x=a1.sum(10, 20);
		assertEquals(30, x);
		x =a1.sum(100, 200);
		assertEquals(300, x);
		x = a1.sum(25, 37);
		assertEquals(62, x);
	}
	
	public void testSum3(){
		int x = a1.sum(10, 20, 30);
		assertEquals(60, x);
		x = a1.sum(15, 25, 100);
		assertEquals(140, x);
		x = a1.sum(100, 200, 300);
	}
	
	public void testSub(){
		int x = a1.sub(20, 10);
		assertEquals(10, x);
		x = a1.sub(250, 101);
		assertEquals(149, x);
		x = a1.sub(50, 100);
		assertEquals(-50, x);
	}
	
}
