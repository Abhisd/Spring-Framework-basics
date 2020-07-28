package com.abhishek.spring.springcoreAdvanced.Autowirng.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	//@Autowired						//@Autowired can  be used at field level also.
	
	//@Qualifier("address123")			
	private Address address;		
	
	//@Autowired						//@Autowired is also used at constructor also.
	Employee(Address address){
		this.address=address;
	}
	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	// byType will check for setters of address from xml file which is object type.
	//byName will check for name of the class ie Address.
	//to autowire using constructor we have to create parameterised constructor for dependee class.
	//annotations like @Autowired is used to autowire by simply adding <context:annotation-config/>
	//in the xml file.
	
}
