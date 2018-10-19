package com.infosys.Library;

public class Books extends Item {
	private int Rating;

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public Books(int numberofpages, int rating1) {
		super(numberofpages);
		this.Rating = rating1;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Books: " + "Number of Pages= " + getNumberOfPages() + " " + "Rating= " + Rating;
	}
}
