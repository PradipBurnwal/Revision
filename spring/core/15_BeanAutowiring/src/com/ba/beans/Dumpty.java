package com.ba.beans;

public class Dumpty {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dumpty [name=" + name + "]";
	}
	
}