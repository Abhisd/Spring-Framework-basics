package com.abhishek.spring.springcoreAdvanced.stereotypes.annotations;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // used to give the scope without using configuration file
public class Instructor {

	@Value("#{T(java.lang.Math).abs(-11)}") // invoking static methods
	private int id;
	@Value("#{'abhishek'.toUpperCase()}") // string type expression
	private String name;
	
	@Value("#{2+4>8?true:false}")						//boolean types with ternary opera	tions
	private boolean active;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + "]";
	}

	

}
