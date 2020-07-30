package com.abhishek.spring.springcoreAdvanced.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.springcoreAdvanced.StandaloneCollection.ProductList;

public class TestStandAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/springcoreAdvanced/StandaloneCollection/standAloneConfig.xml");
		ProductList e = (ProductList) context.getBean("productsList"); // typecasted because it returns an object
		System.out.println(e);
	}

}
