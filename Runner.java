package com.infosys.Library;

import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books newbooks = new Books(5, 6);
		Maps newmaps = new Maps(2, "Asia");
		Newspapers newnewspapers = new Newspapers(3, "Daily Mail");
		Newspapers newnewspapers1 = new Newspapers(2, "Mirror");
		Maps newmaps1 = new Maps(3, "Europe");

		Person Haazim = new Person("Haazim");
		Person Steven = new Person("Steven");
		Person Sam = new Person("Sam");

		PersonManager p1 = new PersonManager();
		p1.addNewPerson(Sam);
		System.out.println(p1.personFile);
		p1.updatePerson(Haazim, Steven);

		Library g1 = new Library();
		g1.addNewItem(newbooks);
		g1.addNewItem(newmaps);
		g1.addNewItem(newmaps1);
		g1.addNewItem(newnewspapers);
		g1.addNewItem(newnewspapers1);

		System.out.println(g1.file);
		g1.updateItem(newnewspapers, newnewspapers1);

		System.out.print(newnewspapers1.getID());
	}

}
