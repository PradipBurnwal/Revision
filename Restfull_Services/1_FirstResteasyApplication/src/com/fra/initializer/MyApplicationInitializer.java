                                              package com.fra.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServlet;

@HandlesTypes(HttpServlet.class)
public class MyApplicationInitializer implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> classes, ServletContext context) throws ServletException {
		for(Class<?> clazz:classes){
			System.out.println(clazz.getName());
			ServletRegistration servletRegistration = context.addServlet("MyServlet", "com.fra.servlet.MyServlet");
			servletRegistration.addMapping("/myServlet");
		}
		
	}

}
