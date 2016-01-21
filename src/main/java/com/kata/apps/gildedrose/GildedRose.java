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
		items.add(new ItemWrapper("+5 Dexterity Vest", 10, 20));
		items.add(new ItemWrapper("Aged Brie", 2, 0));
		items.add(new ItemWrapper("Elixir of the Mongoose", 5, 7));
		items.add(new ItemWrapper("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new ItemWrapper("Conjured Mana Cake", 3, 6));

		updateQuality();
	}
}