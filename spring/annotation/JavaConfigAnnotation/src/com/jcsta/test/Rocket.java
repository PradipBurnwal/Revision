package com.jcsta.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Named("rocket")
public class Rocket {
	public void launch(){
		System.out.println("launching...");
	}
	@PreDestroy
	public void shutdown(){
		System.out.println("clearing...");
	}
	@PostConstruct
	public void initialize(){
		System.out.println("verifying....");
	}
	
	
	
	
}
