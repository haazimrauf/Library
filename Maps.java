package com.infosys.Library;

public class Maps extends Item {

	private String Title;

	public Maps(int numberofpages2, String title) {
		super(numberofpages2);
		this.Title = title;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Maps: " + "Number of Pages= " + getNumberOfPages() + " " + "Title= " + Title;
	}

}
