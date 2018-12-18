package com.corej.partI.generic;

import java.io.Serializable;
import java.util.Collection;

import com.corej.partI.Employee;
import com.corej.partI.Manager;

public class PairAlg {
	public static boolean hasNull(Pair<?, ?> p) {
		return p.getFirst() == null || p.getSecond() == null;
	}
	
	public static <T, U> Pair<T, U> makePair(Class<T> c1, Class<U> c2) 
			throws InstantiationException, IllegalAccessException {
		return new Pair<T, U>(c1.newInstance(), c2.newInstance());
	}
	
	@SafeVarargs	
	public static <T extends Comparable<T> & Serializable> T getMiddle(T... a) {
		return a[a.length / 2];
	}
	
	@SafeVarargs
	public static <T> void addAll(Collection<T> coll, T... ts) {
		for (T t : ts) {
			coll.add(t);
		}
	}
	
	public static void printBubbies(Pair<? extends Employee, ? extends Employee> p) {
		Employee e1 = p.getFirst();
		Employee e2 = p.getSecond();
		System.out.println(String.format("%s and %s are bubbies!", e1.getName(), e2.getName()));
	}
	
	public static void main(String[] args) 
			throws Exception {
		String str = "string";
		Number num = 1;
		makePair(str.getClass(), num.getClass());
		
//		Pair<String, Date> pair = new Pair<>();
//		String mid = Pair.getMiddle("John", "Q.", "Public");
//		Pair<String, Date>[] p = new Pair<String, Date>[10]; //error
		
//		ArrayList<Pair<String, Date>> p = new ArrayList<>(); //ok
//		p.add(new Pair<String, Date>("1", new Date()));
//		p.add(new Pair<String, Date>("2", new Date()));
//		Pair<String, Date>[] pArr = p.toArray(new Pair[0]);
//		System.out.println(pArr.getClass().getComponentType());
		
		Employee e1 = new Employee();
		e1.setName("Hazon");
		Manager m1 = new Manager();
		m1.setName("Jack");
		Pair<Employee, Manager> emp = new Pair<>(e1, m1);
		printBubbies(emp);
	}
}
