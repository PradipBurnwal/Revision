package com.blcp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Robot implements InitializingBean, DisposableBean {
	private String name;
	private Chip chip;
	
	public Robot(Chip chip) {
		this.chip = chip;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("From Destroy()");
		System.out.println("Destroy dependents..");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From afterPropertiesSet()");
		System.out.println("Name : "+name);
		System.out.println("Driver Id : "+chip.getId());
		System.out.println("Driver Type : "+chip.getCapacity());
	}
	

}
