package com.kata.apps.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
	static List<ItemWrapper> items;

	public GildedRose(Item[] itemsList) {
		items = new ArrayList<ItemWrapper>();
		for (int i = 0; i < itemsList.length; i++) {
			items.add(new ItemWrapper(itemsList[i].name, itemsList[i].sellIn, itemsList[i].quality));
		}
	
	}

	public static void updateQuality() {
		for (ItemWrapper item : items) {
			item.decreaseQuality();
			item.decreaseSellIn();
		}
	}
	
	public static void main(String[] args) {
		items = new ArrayList<ItemWrapper>();


		updateQuality();
	}
}