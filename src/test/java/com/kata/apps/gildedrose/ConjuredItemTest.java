package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.domain.ConjuredItem;
import com.kata.apps.gildedrose.domain.ItemWrapper;

public class ConjuredItemTest 
{
	// increases quality by 1 when concert is more than 10 days away
	// increases q by 2 when concert is between 5 and 10 days away
	// increases q by 3 when concert is between 1 and 5 days away
	// quality drops to zero when concert has passed
	// sellIn decreases by 1 after each day
	
	@Test
	public void conjured_Expect_Reduciton_In_Quaity() 
	{

		ItemWrapper item=  new ConjuredItem("Conjured Mana Cake", 3, 6) ;
	
		assertEquals("Conjured Mana Cake", item.getName());
		assertEquals(2, item.getSellIn());
		assertEquals(4, item.getQuality());

	}

}
