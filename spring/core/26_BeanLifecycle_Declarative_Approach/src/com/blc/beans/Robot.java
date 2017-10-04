package com.blc.beans;

public class Robot {
	private String name;
	private SenserDriver driver;
	
	public Robot(SenserDriver driver) {
		this.driver = driver;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void startUp(){
		System.out.println("Name : "+name);
		System.out.println("Driver Type : "+driver.getType());
	}
	public void release(){
		System.out.println("releasing resources.....");
	}

	/*@Override
	public String toString() {
		return "Robot [name=" + name + ", driver=" + driver + "]";
	}*/
	
	
}
