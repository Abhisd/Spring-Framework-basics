package com.abhishek.spring.springcoreAdvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {
	
	private OrderDAO dao;

	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside Order BO");
		dao.createOrder();

	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}