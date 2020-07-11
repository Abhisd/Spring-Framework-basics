package com.abhishek.spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.project.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/project/shopping.xml");
		ShoppingCart c = (ShoppingCart) ctx.getBean("shoppingCart");
		System.out.println(c);


	}

}
