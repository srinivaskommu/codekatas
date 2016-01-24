package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.domain.AgedBrieItem;
import com.kata.apps.gildedrose.domain.ItemControl;

public class AgedBrieItemTest 
{
	int quality;
	int sellIn;

	// "Aged Brie" actually increases in Quality the older it gets
	@Test
	public void increaseQualityByOneForAgedBrieAsitgetsOlder() 
	{
		quality=1;	sellIn = 2;
		ItemControl item = new AgedBrieItem("Aged Brie", sellIn, quality);

		item.decreaseQuality();
		item.decreaseSellIn();

		assertEquals("Aged Brie", item.getName());
		assertEquals(2, item.getQuality());

	}
	
	@Test
	public void decreaseSellInByOneForAgedBrieAsitgetsOlder() 
	{
		quality=1;	sellIn = 2;
		ItemControl item = new AgedBrieItem("Aged Brie", sellIn, quality);

		item.decreaseSellIn();
		
		assertEquals(1, item.getSellIn());
	}

}
