package com.abhishek.spring.Springcore.constructorInjection.ambiguity;

public class Addition {
	
	Addition(int a,int b){
		System.out.println("inside int");
	}
	Addition(double a,double b){
		System.out.println("inside double");
	}
	
}
// to avoid ambiguity of the constructors we can use type,index and name in the <constructor-arg> 
//where type can be any data type  and index is 0,1... and name is name of parameter
