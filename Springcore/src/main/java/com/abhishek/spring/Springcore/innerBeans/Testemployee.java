package com.abhishek.spring.Springcore.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.spring.Springcore.innerBeans.Employee;

public class Testemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/abhishek/spring/Springcore/innerBeans/configBean.xml");
		Employee c = (Employee) ctx.getBean("employee");
		System.out.println(c);
		System.out.println(c.hashCode());
		
		Employee c2 = (Employee) ctx.getBean("employee");
		System.out.println(c2);
		System.out.println(c2.hashCode());
		
		
	}

}

//innerBean used only when dependent bean has "has-a" relation with dependee bean
//value as attribute,value as a element, p:namespace and innerbean are four ways of injecting an object
//hashcode() method is used to check memory address of the particular object
//by changing scope to prototype in xml address of objects get changed
//default scope for any object is singleton which may give same address for two addresses. 
