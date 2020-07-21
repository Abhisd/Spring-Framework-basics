package com.abhishek.spring.Springcore.lc.annotations.project;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketResv {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("inside Initialize() method");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("inside cleanUp() method");
	}

	@Override
	public String toString() {
		return "TicketResv [id=" + id + "]";
	}
}
