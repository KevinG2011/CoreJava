package com.corej.partI.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

public class StackTraceTest {

	public static void main(String[] args) {
		Throwable throwa = new Throwable();
		StringWriter out = new StringWriter();
		throwa.printStackTrace(new PrintWriter(out));
//		System.out.println(out.toString());
		
//		StackTraceElement[] frames = throwa.getStackTrace();
//		for (StackTraceElement frame : frames) {
//			System.out.println(frame.toString());
//		}
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		for (Thread t : map.keySet()) {
			StackTraceElement[] elements = map.get(t);
			for (StackTraceElement frame : elements) {
				System.out.println(frame.toString());
			}
		}
	}

}
