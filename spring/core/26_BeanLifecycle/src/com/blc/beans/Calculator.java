package com.blc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Calculator{
	private int a;
	private int b;
	private int sum;
	public Calculator(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void init(){
		System.out.println("init() called..");
		this.sum = this.a+this.b;
	}
	public void destroy(){
		System.out.println("destroy() called..");
	}
	
	/*@Override
	public void destroy() throws Exception {
		System.out.println("destroyed...");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		this.sum=a+b;
	}*/
	
	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
	
	
}