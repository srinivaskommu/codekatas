package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.Item;
import com.kata.apps.gildedrose.domain.AgedBrieItemControl;
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
		Item item = new Item("Aged Brie", sellIn, quality);
		
		ItemControl itemControl = new AgedBrieItemControl();
		itemControl.controlItemQuality(item);
		itemControl.controlItemSellIn(item);
		
		assertEquals("Aged Brie", item.getName());
		assertEquals(2, item.getQuality());
		assertEquals(1, item.getSellIn());

	}
	
	@Test
	public void decreaseSellInByOneForAgedBrieAsitgetsOlder() 
	{
		quality=1;	sellIn = 5;
		Item item = new Item("Aged Brie", sellIn, quality);
		
		ItemControl itemControl = new AgedBrieItemControl();
		itemControl.controlItemSellIn(item);
		
		assertEquals("Aged Brie", item.getName());
		assertEquals(4, item.getSellIn());
	}
	
	
}
