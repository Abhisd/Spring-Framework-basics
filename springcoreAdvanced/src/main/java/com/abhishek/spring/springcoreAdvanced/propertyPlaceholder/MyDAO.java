package com.abhishek.spring.springcoreAdvanced.propertyPlaceholder;

public class MyDAO {
	private String dbServer,dbUser,dbPass;
	
	MyDAO(String dbServer,String dbUser,String dbPass){
		this.dbServer=dbServer;
		this.dbUser=dbUser;
		this.dbPass=dbPass;
		
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}
	
}
