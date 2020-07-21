package com.abhishek.spring.Springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/lc/annotations/lifeCyclexml.xml");
		Patient c = (Patient) ctx.getBean("patient");
		System.out.println(c);
		ctx.registerShutdownHook(); //this method is used to enable the destroy method from Patient class 
									//which is invoked from the SpringFramework package AbstractApplicationContext

	}
		
}
