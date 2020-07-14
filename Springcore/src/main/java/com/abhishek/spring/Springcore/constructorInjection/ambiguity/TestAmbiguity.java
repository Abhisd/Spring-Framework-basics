package com.abhishek.spring.Springcore.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/abhishek/spring/Springcore/constructorInjection/ambiguity/configAbiguity.xml");
		Addition addition = (Addition)ctx.getBean("addition");
		System.out.println(addition);
	}

}
