package com.corej.partI;

public class Manager extends Employee {
	private double bonus;
	
	public Manager() {
		
	}
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus = 0;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + this.bonus;
	}
}
