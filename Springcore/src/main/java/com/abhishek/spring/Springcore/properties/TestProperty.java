package com.abhishek.spring.Springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.Springcore.properties.CountryLanguage;

public class TestProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/properties/cofigprop.xml");
		CountryLanguage c = (CountryLanguage) ctx.getBean("property");
		System.out.println(c);

	}

}
