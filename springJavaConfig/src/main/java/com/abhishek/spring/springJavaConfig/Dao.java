package com.abhishek.spring.springJavaConfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {

	public void create() {
		System.out.println("hello!! working as a bean");
	}
}


//this is a bean class which is configured in SpringConfig class by using 
//annotation @Bean to the constructor method of the class