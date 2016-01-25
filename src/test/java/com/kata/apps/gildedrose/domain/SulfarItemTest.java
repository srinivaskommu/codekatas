package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.GildedRose;
import com.kata.apps.gildedrose.Item;

public class SulfarItemTest 
{
	  // "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
	  @Test
	  public void noChangeInQualityAndSellinForSulfuras()
	  {
		Item item =  new Item("Sulfuras, Hand of Ragnaros", 0, 80) ;
		
		GildedRose store = new GildedRose(new Item[]{item});
		store.updateQuality();

		assertEquals(0, item.getSellIn());
	    assertEquals(80, item.getQuality());

	  }

}
