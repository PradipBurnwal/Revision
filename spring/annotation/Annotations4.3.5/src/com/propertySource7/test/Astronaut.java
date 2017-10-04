package com.propertySource7.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/propertySource7/test/aeroeng.properties")
public class Astronaut {
	@Autowired
	private Environment environment;
	
	@Value("${hours}")
	private int houresOfStay;
	
	public void knowWhere(){
		String place = null;
		
		place = environment.getProperty("astronautPlace");
		System.out.println("Remote testing at : "+place);
	}

	@Override
	public String toString() {
		return "Astronaut [environment=" + environment + ", houresOfStay="
				+ houresOfStay + "]";
	}
	
}