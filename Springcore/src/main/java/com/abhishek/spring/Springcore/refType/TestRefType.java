package com.abhishek.spring.Springcore.refType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.Springcore.refType.Student;

public class TestRefType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/refType/configrefType.xml");
		Student c = (Student) ctx.getBean("student");
		System.out.println(c);

	}

}
