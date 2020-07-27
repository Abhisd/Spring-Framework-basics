package com.abhishek.spring.Springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.Springcore.set.CarDealer;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhishek/spring/Springcore/set/configset.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("car");
		System.out.println(" Name: " + carDealer.getName());
		System.out.println("Models: " + carDealer.getModels());

	}

}
