package com.corej.partI.comparator;

import java.util.Comparator;

import com.corej.partI.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.getSalary() - o2.getSalary());
	}

}
