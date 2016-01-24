package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.GildedRose;
import com.kata.apps.gildedrose.Item;

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
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) ;
		
		ItemControl itemControl = new BackStageItemControl();
		itemControl.controlItemQuality(item);
		itemControl.controlItemSellIn(item);
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
		assertEquals(14, item.getSellIn());
		assertEquals(21, item.getQuality());
	}

	@Test
	public void concert_is_less_than_10_days_away_increase_quality_by_2() 
	{

		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) ;
		ItemControl itemControl = new BackStageItemControl();
		itemControl.controlItemQuality(item);
		itemControl.controlItemSellIn(item);
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
		assertEquals(9, item.getSellIn());
		assertEquals(22, item.getQuality());

	}
	
	  @Test
	  public void should_not_increase_for_above_quality_of_50() throws Exception
	  {

	    Item more10DaysAway = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
		ItemControl itemControl = new BackStageItemControl();
		itemControl.controlItemQuality(more10DaysAway);
		itemControl.controlItemSellIn(more10DaysAway);
	    assertEquals(50, more10DaysAway.getQuality());

	    Item correct10DaysAway = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
		itemControl.controlItemQuality(more10DaysAway);
		itemControl.controlItemSellIn(more10DaysAway);
	    assertEquals(50,correct10DaysAway.getQuality());

	    Item correct5DaysAway = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
		itemControl.controlItemQuality(more10DaysAway);
		itemControl.controlItemSellIn(more10DaysAway);
	    assertEquals(50, correct5DaysAway.getQuality());
	  }

}
