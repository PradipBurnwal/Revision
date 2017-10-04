package com.stjc8.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.stjc8.test"})
public class STJCAppConfig {
	@Bean(name="microphone")
	public Microphone newMicrophone(){
		return new Microphone();
	}

}
