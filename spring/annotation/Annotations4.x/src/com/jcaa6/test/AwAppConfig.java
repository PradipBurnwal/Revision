package com.jcaa6.test;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AwAppConfig {
	@Primary
	@Bean(name="sand-machine")
	public Machine newSandMachine(){
		System.out.println("sand");
		Machine m =  new Machine();
		System.out.println(m.hashCode());
		return m;
	}
	
	@Bean(name="rock-machine")
	public Machine newRockMachine(){
		System.out.println("rocks");
		Machine m =  new Machine();
		System.out.println(m.hashCode());
		return m;
	}
	
	@Bean(name="controlBoard", autowire=Autowire.BY_TYPE)
	public ControlBoard newControlBoard(){
		return new ControlBoard();
	}
}
