package com.abhishek.spring.springJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration							//creating configuration class
@Import(DaoConfig.class)
public class SpringConfig {
	
	
	@Bean(initMethod="init",destroyMethod="destroy")
	@Scope("prototype")
	public ServiceConfig service() {
		return new ServiceConfig();
	}
}


//we can use life cycle callback methods in bean 