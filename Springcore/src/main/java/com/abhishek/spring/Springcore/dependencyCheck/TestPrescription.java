package com.abhishek.spring.Springcore.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrescription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/dependencyCheck/configPrescription.xml");
		Prescription c = (Prescription) ctx.getBean("medicine");
		System.out.println(c);
		
	}

		
}