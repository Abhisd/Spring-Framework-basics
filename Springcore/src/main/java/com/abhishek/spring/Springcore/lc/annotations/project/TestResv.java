package com.abhishek.spring.Springcore.lc.annotations.project;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.Springcore.lc.annotations.project.TicketResv;

public class TestResv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/lc/annotations/project/configRailway.xml");
		TicketResv c = (TicketResv) ctx.getBean("tourist");
		System.out.println(c);
		ctx.registerShutdownHook(); 

	}

}
