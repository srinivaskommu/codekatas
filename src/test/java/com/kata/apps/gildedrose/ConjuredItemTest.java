package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConjuredItemTest {
	@Test
	public void conjured_Expect_Reduciton_In_Quaity() {

		Item[] items = new Item[] { new ConjuredItem("Conjured Mana Cake", 3, 6) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("Conjured Mana Cake", app.items.get(0).getName());
		assertEquals(2, app.items.get(0).getSellIn());
		assertEquals(4, app.items.get(0).getQuality());

	}

}
