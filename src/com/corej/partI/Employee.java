package com.corej.partI;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

import com.corej.partI.abstractClasses.Person;

public class Employee extends Person implements Comparable<Employee> {
	private static int nextId;
	
	private int id;
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
		super(name);
		this.salary = salary;
		this.hireDate = LocalDate.now();
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", this.salary);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, this.getName(), salary, hireDate);
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.id, o.id);
	}
}
