package com.abhishek.spring.springcoreAdvanced.propertyPlaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/abhishek/spring/Springcore/propertyPlaceholder/config.xml");
		MyDAO d=(MyDAO)ctx.getBean("myDAO");
		System.out.println(d);
		

	}
}
