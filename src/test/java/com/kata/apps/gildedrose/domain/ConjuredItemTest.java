package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.domain.ConjuredItem;
import com.kata.apps.gildedrose.domain.ItemControl;

public class ConjuredItemTest 
{

	
	@Test
	public void conjured_Expect_Reduciton_In_Quaity() 
	{

		ItemControl item=  new ConjuredItem("Conjured Mana Cake", 3, 6) ;
	
		assertEquals("Conjured Mana Cake", item.getName());
		assertEquals(2, item.getSellIn());
		assertEquals(4, item.getQuality());

	}

}
