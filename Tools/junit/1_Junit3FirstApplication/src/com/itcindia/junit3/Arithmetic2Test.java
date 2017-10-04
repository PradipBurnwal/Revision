package com.itcindia.junit3;

import com.itcindia.Arithmetic2;

import junit.framework.TestCase;

public class Arithmetic2Test extends TestCase{
	Arithmetic2 a2 = null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		a2 = new Arithmetic2();
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		a2 = null;
	}
	
	public void testMul2(){
		int x = a2.mul(10, 20);
		assertEquals(200, x);
		x = a2.mul(5, 7);
		assertEquals(35, x);
	}
	
	public void testMul3(){
		int x = a2.mul(10, 20, 10);
		assertEquals(2000, x);
		x = a2.mul(5, 70, 2);
		assertEquals(700, x);
	}
	
	public void testDiv(){
		int x = a2.div(20, 10);
		assertEquals(2, x);
		x = a2.div(49, 7);
		assertEquals(7, x);
	}
}
