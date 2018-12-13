package com.corej.partI.test;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.Timer;

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
		
		ArrayList<Employee> list = new ArrayList<>(3);
		list.add(new Employee("Sam", 30));
		list.add(new Employee("Jerry", 20));
		list.add(new Employee("Leo", 10));
//		list.removeIf(e -> e.getSalary() == 20);
//		out.println(list.toString());
//		
		Employee[] employees = list.toArray(new Employee[list.size()]);
//		
//		EmployeeComparator c = new EmployeeComparator();
//		Arrays.sort(employees, c);
//		out.println(Arrays.toString(employees));
//		
//		Arrays.sort(employees, (e1, e2) -> {
//			return e1.getName().compareTo(e2.getName());
//		});
		
		Arrays.sort(employees, Comparator.comparing(Employee::getName).reversed().thenComparingDouble(Employee::getSalary));
		out.println(Arrays.toString(employees));		
	}
}
