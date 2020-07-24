package com.abhishek.spring.Springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhishek/spring/Springcore/list/configxml.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name: " + hospital.getName());
		System.out.println("Departments: " + hospital.getDepartment());

	}

}
