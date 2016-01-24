package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.Item;

public class ConjuredItemTest 
{

	
	@Test
	public void conjured_Expect_Reduciton_In_Quaity() 
	{

		Item item=  new Item("Conjured Mana Cake", 3, 6) ;
		ItemControl itemControl = new ConjuredItemControl(); 
		
		itemControl.controlItemQuality(item);
		itemControl.controlItemSellIn(item);
	
		assertEquals("Conjured Mana Cake", item.getName());
		assertEquals(2, item.getSellIn());
		assertEquals(4, item.getQuality());

	}

}
