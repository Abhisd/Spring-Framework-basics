package com.abhishek.spring.Springcore.lc.xmlConfig;

public class Patient {
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

	public void destroy() {
		System.out.println("inside destroy() method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
