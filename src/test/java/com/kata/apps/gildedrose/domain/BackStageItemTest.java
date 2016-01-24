package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.domain.BackStageItem;
import com.kata.apps.gildedrose.domain.ItemControl;

public class BackStageItemTest 
{
	// increases quality by 1 when concert is more than 10 days away
	// increases q by 2 when concert is between 5 and 10 days away
	// increases q by 3 when concert is between 1 and 5 days away
	// quality drops to zero when concert has passed
	// sellIn decreases by 1 after each day

	@Test
	public void concert_is_more_than_10_days_away_increase_quality_by_1() 
	{
		ItemControl item = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20) ;
		item.decreaseQuality();
		item.decreaseSellIn();

		assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
		assertEquals(14, item.getSellIn());
		assertEquals(21, item.getQuality());
	}

	@Test
	public void concert_is_less_than_10_days_away_increase_quality_by_2() 
	{

		ItemControl item = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 10, 20) ;
		item.decreaseQuality();
		item.decreaseSellIn();
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
		assertEquals(9, item.getSellIn());
		assertEquals(22, item.getQuality());

	}

}
