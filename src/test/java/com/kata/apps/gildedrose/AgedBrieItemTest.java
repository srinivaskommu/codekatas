package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgedBrieItemTest {
	// "Aged Brie" actually increases in Quality the older it gets
	@Test
	public void increase_Quality_of_Aged_Brie_as_it_gets_older() {
		Item[] items = new Item[] { new AgedBrieItem("Aged Brie", 2, 1) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("Aged Brie", app.items.get(0).getName());
		assertEquals(1, app.items.get(0).getSellIn());
		assertEquals(2, app.items.get(0).getQuality());

	}

}
