package com.abhishek.spring.springcoreAdvanced.stereotypes.annotations;

import javax.management.modelmbean.XMLParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhishek/spring/springcoreAdvanced/stereotypes/annotations/stereotypeConfig.xml");
		Instructor i=(Instructor)ctx.getBean("instructor");
		System.out.println(i);
		
		
	}

}
//by using @component no need to create the  bean 
//in test class bean name  is derived from class name in camelcase ie 
//here class name  is Insrtuctor so bean name is instructor.
//we can also mention bean name @Component(bean name).