package com.corej.partI.abstractClasses;

public abstract class Person {
	public abstract String getDescription();
	private String name;
	
	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%s [name=%s]", getClass().getName(), name);
	}
}
