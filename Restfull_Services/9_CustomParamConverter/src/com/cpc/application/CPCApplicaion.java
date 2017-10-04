package com.cpc.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.cpc.converter.CPCParamConverterProvider;
import com.cpc.resource.Amazon;

@ApplicationPath("/rest")
public class CPCApplicaion extends Application{
	private Set<Object> singletons;
	private Set<Class<?>> classes;
	
	public CPCApplicaion() {
		singletons = new HashSet<Object>();
		classes = new HashSet<Class<?>>();
		
		classes.add(CPCParamConverterProvider.class);
		singletons.add(new Amazon());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
