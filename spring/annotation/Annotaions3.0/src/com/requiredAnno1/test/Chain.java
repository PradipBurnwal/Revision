package com.requiredAnno1.test;

public class Chain {
	private int id;
	private String name;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Chain [id=" + id + ", name=" + name + "]";
	}
	
}