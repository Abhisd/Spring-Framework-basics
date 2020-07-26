package com.abhishek.spring.Springcore.refType;

public class Score {
	private double math;
	private double chemistry;
	private double physics;
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	@Override
	public String toString() {
		return "Score [math=" + math + ", chemistry=" + chemistry + ", physics=" + physics + "]";
	}
	
	
}
