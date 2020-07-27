package com.abhishek.spring.springcoreAdvanced.Autowirng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/springcoreAdvanced/Autowirng/constructorconfig.xml");
		Employee e = (Employee) context.getBean("employee"); // typecasted because it returns an object
		System.out.println(e);
	}

}

//auto wiring by using byType in xml 
// byType and byName uses setter injections
