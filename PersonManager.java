package com.infosys.Library;

import java.util.ArrayList;

import java.util.List;

public class PersonManager {
	List<Person> personFile = new ArrayList<Person>();

	public void addNewPerson(Person newPerson) {
		personFile.add(newPerson);
	}

	public void removePerson(Person newPerson) {
		personFile.remove(newPerson);
	}

	public void updatePerson(Person oldPerson, final Person newPerson) {

		personFile.stream().filter(p -> p.equals(oldPerson)).map(p -> newPerson).forEach(System.out::println);

	}
}