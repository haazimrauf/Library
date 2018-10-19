package com.infosys.Library;

public class Person {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Person(String name1) {
		this.Name = name1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of Person: " + Name;

	}

}