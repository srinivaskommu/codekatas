package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.Item;
import static com.kata.apps.gildedrose.ItemBuilder.anItem;

public class BackStageItemTest 
{
	ItemControl backStageControl = new BackStageItemControl();
	String BACKSTAGE = ItemTypes.BACKSTAGE_PASS.name();
	
	@Test
	public void increaseQualityByOneIfConcertIsMoreThan10DaysAway() 
	{
		Item item = anItem().
				withName(BACKSTAGE).
				withQuality(2).
				withSellIn(11).
				build();
		backStageControl.controlItemQuality(item);
		backStageControl.controlItemSellIn(item);
		
		assertEquals(10, item.getSellIn());
		assertEquals(3, item.getQuality());
	}
	
	@Test
	public void increaseQualityByTwoIfConcertIsBetween5And10DaysAway() 
	{
		Item item = anItem().
				withName(BACKSTAGE).
				withQuality(2).
				withSellIn(6).
				build();
		backStageControl.controlItemQuality(item);
		backStageControl.controlItemSellIn(item);
		
		assertEquals(5, item.getSellIn());
		assertEquals(4, item.getQuality());
	}
	
	@Test
	public void increaseQualityByThreeIfConcertIsBetween1And5DaysAway() 
	{
		Item item = anItem().
				withName(BACKSTAGE).
				withQuality(2).
				withSellIn(4).
				build();
		backStageControl.controlItemQuality(item);
		backStageControl.controlItemSellIn(item);
		
		assertEquals(3, item.getSellIn());
		assertEquals(5, item.getQuality());
	}
	

	@Test
	public void qualityDropsZeroWhenConcertHasPassed() 
	{

		Item item = anItem().
				withName(BACKSTAGE).
				withQuality(10).
				withSellIn(-1).
				build();
		
		backStageControl.controlItemQuality(item);
		backStageControl.controlItemSellIn(item);
		
		assertEquals(-2, item.getSellIn());
		assertEquals(0, item.getQuality());

	}
	
	  @Test
	  public void should_not_increase_for_above_quality_of_50() throws Exception
	  {
	    Item more10DaysAway = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
		backStageControl.controlItemQuality(more10DaysAway);
		backStageControl.controlItemSellIn(more10DaysAway);
	    assertEquals(50, more10DaysAway.getQuality());
	  
	  }

}
