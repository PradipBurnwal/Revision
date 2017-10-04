package com.autoWiredAnno2.test;

public class Senser {
	private int id;
	private int range;
	public void setId(int id) {
		this.id = id;
	}
	public void setRange(int range) {
		this.range = range;
	}
	@Override
	public String toString() {
		return "Senser [id=" + id + ", range=" + range + "]";
	}
	

}
