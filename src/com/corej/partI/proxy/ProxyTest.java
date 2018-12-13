package com.corej.partI.proxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {

	public static void main(String[] args) {
		Object[] elements = new Object[1000];
		
		for (int i = 0; i < elements.length; i++) {
			Integer target = i + 1;
			Class[] interfaces = new Class[] { Comparable.class };
			TraceHandler h = new TraceHandler(target);
			Object proxy = Proxy.newProxyInstance(null, interfaces, h);
			elements[i] = proxy;
		}
		
		Integer key = new Random().nextInt(elements.length) + 1;
		int result = Arrays.binarySearch(elements, key);
		if (result >= 0) {
			System.out.println(elements[result]);
		}
	}
}
