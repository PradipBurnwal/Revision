package com.import12.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({@PropertySource("classpath:com/import12/test/players.properties")})
@Import({PlayerConfig.class})
@ComponentScan("com.import12.test")
public class RootAppConfig {
	
}
