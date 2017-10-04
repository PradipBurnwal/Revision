package com.pi.beans;

public class Person {
	private int id;
	private String name;
	
	/*public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}*/
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
