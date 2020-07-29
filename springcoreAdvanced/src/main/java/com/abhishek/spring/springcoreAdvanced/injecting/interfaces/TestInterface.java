package com.abhishek.spring.springcoreAdvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.springcoreAdvanced.injecting.interfaces.*;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/springcoreAdvanced/injecting/interfaces/configInterface.xml");
		OrderBO bo = (OrderBO) context.getBean("bo"); // typecasted because it returns an object
		bo.placeOrder();
		

	}

}
