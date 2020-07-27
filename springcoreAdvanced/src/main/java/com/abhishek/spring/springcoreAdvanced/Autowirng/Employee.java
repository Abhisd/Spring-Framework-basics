package com.abhishek.spring.springcoreAdvanced.Autowirng;

public class Employee {

	private Address address;
	Employee(Address address){
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

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
}
