package com.abhishek.spring.springJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);    
		//ctx.register(SpringConfig.class);
		ServiceConfig dao = ctx.getBean(ServiceConfig.class);
		dao.save();
		dao.hashCode();
		ctx.close();		// to work destroy() method properly
	}

}


//we can configure classes in new AnnotationConfigApplicationContext("Classname.class") but
//for multiple configurations we can use register() method.