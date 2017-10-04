package com.cc.beans;

public class Person {
	private int id;
	private String name;
	
	public Person(int id) {
		super();
		this.id = id;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
