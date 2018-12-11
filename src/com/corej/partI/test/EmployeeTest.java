package com.corej.partI.test;
import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;

import com.corej.partI.Employee;
import com.corej.partI.comparator.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
//		Employee[] staff = new Employee[3];
//		staff[0] = new Executive();
//		if (staff[1] instanceof Executive) {
//			Executive boss = (Executive)staff[0];
//			out.print(boss.getSalary());
//		}
//		ArrayList<Employee> staff1 = new ArrayList<>();
//		staff1.ensureCapacity(10);
//		staff1.add(new Employee(200));
//		staff1.trimToSize();
		Employee[] employees = {new Employee("Sam", 30), new Employee("Jack", 20), new Employee("Tom", 10)};
		EmployeeComparator c = new EmployeeComparator();
		Arrays.sort(employees, c);
		out.println(Arrays.toString(employees));
	}
}
