package com.abhishek.spring.Springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// method name need not to be init() we can use any name for the method
	public void init() {
		System.out.println("Inside init() method");
	}

	public void bye() {
		System.out.println("inside bye() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy()");
	}
}

//to use interface in lifecycle we need to add two interfaces from spring InitializingBean,DisposableBean
//which automatically invokes init and destroy methods, no need to  add these methods in xml file .




