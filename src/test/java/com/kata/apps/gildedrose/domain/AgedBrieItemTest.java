package com.kata.apps.gildedrose.domain;

import static com.kata.apps.gildedrose.ItemBuilder.anItem;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.kata.apps.gildedrose.Item;

public class AgedBrieItemTest 
{
	ItemControl agedBrieControl = new AgedBrieItemControl();
	String AGED_BRIE = ItemTypes.AGED_BRIE.name();

	@Test
	public void increaseQualityByOneForAgedBrieAsItgetsOlder() 
	{
		
		Item agedBrie = anItem().
					withName(AGED_BRIE).
					withQuality(1).
					withSellIn(1).
					build();
		

		agedBrieControl.controlItemQuality(agedBrie);
		assertThat(agedBrie.getQuality(), is(2));

	}
	
	@Test
	public void decreaseSellInByOneForAgedBrieAsitgetsOlder() 
	{
		Item agedBrie = anItem().
				withName(AGED_BRIE).
				withQuality(1).
				withSellIn(5).
				build();
		
		
		agedBrieControl.controlItemSellIn(agedBrie);
		assertThat(agedBrie.getSellIn(), is(4));
	}
	
	
}
