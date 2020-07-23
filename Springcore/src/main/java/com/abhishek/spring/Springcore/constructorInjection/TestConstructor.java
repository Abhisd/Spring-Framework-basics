package com.abhishek.spring.Springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/constructorInjection/constructorconfig.xml");
		Employee e = (Employee) context.getBean("employee"); // typecasted because it returns an object
		System.out.println(e);
	}

}
