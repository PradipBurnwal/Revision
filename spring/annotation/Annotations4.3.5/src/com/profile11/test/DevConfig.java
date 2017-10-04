package com.profile11.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profile11/test/dev-db.properties")
@Profile("dev")
public class DevConfig {

}
