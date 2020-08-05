package com.abhishek.spring.springJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceConfig {

		@Autowired
		Dao dao;
		
		public void init() {
			System.out.println("init() method");
		}
		
		public void destroy() {
			System.out.println("destroy() method");
		}
		
		public void save() {
			dao.create();
		}
}
