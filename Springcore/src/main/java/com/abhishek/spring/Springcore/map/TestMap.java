package com.abhishek.spring.Springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.Springcore.map.Customer;

public class TestMap {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhishek/spring/Springcore/map/configmap.xml");
		Customer cust = (Customer) ctx.getBean("map");
		System.out.println(cust);
		


	}

}
