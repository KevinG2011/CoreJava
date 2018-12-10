package com.corej.partI;

import com.corej.partI.abstractClasses.Person;

public class Student extends Person {
	private String major;
	
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return String.format("a student majoring in %s", this.major);
	}

}
