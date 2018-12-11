package com.corej.partI.reflect;
import static java.lang.System.out;

import java.lang.reflect.Method;

public class MethodTableTest {

	public static double square(double x) {
		return x * x;
	}
	
	public static void printResultTable(double from, double to, int n, Method f) {
		out.println(f);
		double dt = (to - from) / n;
		for (double i = from; i <= to; i += dt) {
			try {
				double y = (Double) f.invoke(null, i);
				out.printf("%10.4f | %10.4f%n", i, y);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	public static void main(String[] args) 
			throws Exception {
		Method square = MethodTableTest.class.getMethod("square", double.class);
		Method sqrt = Math.class.getMethod("sqrt", double.class);
		printResultTable(1, 10, 10, square);
		printResultTable(1, 10, 10, sqrt);
	}
}
