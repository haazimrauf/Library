package com.infosys.Library;

import static org.junit.Assert.*;

import org.junit.Test;

public class Runnertest {

	@Test
	public void AddingPerson() {
		Person lib = new Person("Haazim");
		assertNotNull(lib.getName());
		assertNotNull(lib.toString());
	}

	@Test
	public void ItemTest() {
		Item Ite = new Item(5);
		assertNotNull(Ite.getID());
		assertEquals(5, Ite.getNumberOfPages());
	}

	@Test
	public void BooksTest() {
		Books Ite = new Books(5, 6);
		assertEquals(6, Ite.getRating());
		assertEquals(5, Ite.getNumberOfPages());
	}

	@Test
	public void NewspapersTest() {
		Newspapers Ite = new Newspapers(5, "6/10/12");
		assertEquals("6/10/12", Ite.getDate());

	}

}
