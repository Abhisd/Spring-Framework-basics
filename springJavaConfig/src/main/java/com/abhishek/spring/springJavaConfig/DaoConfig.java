package com.abhishek.spring.springJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DaoConfig {

	@Bean								// bean for class Dao
	public Dao dao() {
		return new Dao();
	}
	
}


//we can create separate classes for different service classes and configure
//their beans using @Import annotation 