package com.infosys.Library;

public class Newspapers extends Item {

	private String Date;

	public Newspapers(int numberofpages2, String date) {
		super(numberofpages2);
		this.Date = date;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Newspapers: " + "Number of Pages= " + getNumberOfPages() + " " + "Date= " + Date;
	}
}
