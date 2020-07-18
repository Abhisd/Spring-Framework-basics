package com.abhishek.spring.Springcore.dependencyCheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	

	private int id;
	private String name;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medicines=" + medicines + "]";
	}
}
// @Required is enabled by using org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor
//we can use @Required to setters only .
// if not enabled it will show BeanInitializationException



