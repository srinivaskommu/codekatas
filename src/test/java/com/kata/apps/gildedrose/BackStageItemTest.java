package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackStageItemTest {
	@Test
	public void concert_is_more_than_10_days_away() {
		Item[] items = new Item[] { new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items.get(0).getName());
		assertEquals(14, app.items.get(0).getSellIn());
		assertEquals(21, app.items.get(0).getQuality());

	}

	@Test
	public void concert_is_less_than_10_days_away_increase_quality_by_2() {

		Item[] items = new Item[] { new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items.get(0).getName());
		assertEquals(9, app.items.get(0).getSellIn());
		assertEquals(22, app.items.get(0).getQuality());

	}

}
