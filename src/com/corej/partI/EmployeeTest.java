package com.corej.partI;
import static java.lang.System.*;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Executive();
		if (staff[1] instanceof Executive) {
			Executive boss = (Executive)staff[0];
			out.print(boss.getSalary());
		}
		ArrayList<Employee> staff1 = new ArrayList<>();
		staff1.ensureCapacity(10);
		staff1.add(new Employee(200));
		staff1.trimToSize();
		
	}
}
