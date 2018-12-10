package com.corej.partI;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
	private static int nextId;
	
	private int id;
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		this.id = nextId;
		nextId++;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	public Employee() {
		this("Employee #" + nextId, 0);
	}
	
	public Employee(double salary) {
		this("Employee #" + nextId, salary);
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.now();
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
}
