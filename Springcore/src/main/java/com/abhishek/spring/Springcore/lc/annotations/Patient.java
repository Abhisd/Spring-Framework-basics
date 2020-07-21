package com.abhishek.spring.Springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setters ");
		this.id = id;
	}

	// method name need not to be init() we can use any name for the method

	@PostConstruct // this will mark hii() method as a init() method
	public void hii() {
		System.out.println("Inside hii() method");
	}

	@PreDestroy // this will mark bye() method as a destroy() method
	public void bye() {
		System.out.println("inside bye() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}

//by default all spring annotations are disbaled to enablethem we to add Predestroy and postConstruct in xml file
//by using org.springframework.context.annotation.CommonAnnotationBeanPostProcessor in the class field of bean.
//another way is adding <context:annotation-config/> in xml file,this is the ideal  way to add annotations.



