package com.infosys.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	public static int count = 0;

	List<Item> file = new ArrayList<Item>();

	public void addNewItem(Item newItem) {
		file.add(newItem);
		count++;
		newItem.ID = count;
	}

	public void updateItem(Item oldItem, Item item) {
		List<Item> NewItemList = file.stream().filter(p -> p.equals(oldItem)).map(p -> item)
				.collect((Collectors.toList()));
		System.out.println(NewItemList);

	}
}
