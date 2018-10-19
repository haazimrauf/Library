package com.infosys.Library;

public class Item {

	private int numberOfPages;
	int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Item(int numberofpages2) {
		this.numberOfPages = numberofpages2;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void addNewspaper(int numberofpages1) {
		this.numberOfPages = numberofpages1;
	}

}
