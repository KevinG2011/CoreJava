package com.corej.partI;

public abstract class Person {
	public abstract String getDescription();
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
