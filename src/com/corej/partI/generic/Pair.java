package com.corej.partI.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.corej.partI.Employee;
import com.corej.partI.Manager;

public class Pair <T extends Employee, U extends Employee> {
	private T first;
	private U second;
	public Pair() {
		super();
		this.first = null;
		this.second = null;
	}
	public Pair(T first, U second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() { 
		return this.first; 
	}
	public U getSecond() {
		return this.second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setSecond(U second) {
		this.second = second;
	}
	
	public static <T extends Serializable & Comparable> T getMiddle(T... a) {
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
	
	public static void main(String[] args) {
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
