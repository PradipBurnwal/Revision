package com.fra.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.fra.resource.BankResource;

/*Approach-6*/
//@ApplicationPath("/rest")
public class MyRestEasyApplication extends Application {
	private Set<Object> singleton;
	private Set<Class<?>> classes;
	
	
	public MyRestEasyApplication() {
		singleton = new HashSet<Object>();
		classes = new HashSet<Class<?>>();
		singleton.add(new BankResource());
	}

	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("getClasses()");
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		System.out.println("getSingleton()");
		return singleton;
	}
}
