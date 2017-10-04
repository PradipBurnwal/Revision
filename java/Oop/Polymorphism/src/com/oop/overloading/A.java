package com.oop.overloading;

public class A {
	public void foo(Object obj){
		System.out.println("Obj Args");
	}
	public void foo(String str){
		System.out.println("String Args");
	}
	public void foo(Integer i){
		System.out.println("Integer Args");
	}

}
