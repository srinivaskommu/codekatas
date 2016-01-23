package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackStageItemTest 
{
	@Test
	public void concert_is_more_than_10_days_away() 
	{
		ItemWrapper item = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20) ;
		item.decreaseQuality();
		item.decreaseSellIn();

		assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
		assertEquals(14, item.getSellIn());
		assertEquals(21, item.getQuality());
	}

	@Test
	public void concert_is_less_than_10_days_away_increase_quality_by_2() 
	{

		ItemWrapper item = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 10, 20) ;
		item.decreaseQuality();
		item.decreaseSellIn();
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
		assertEquals(9, item.getSellIn());
		assertEquals(22, item.getQuality());

	}

}
