package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.Item;

public class RegularItemTest 
{
	  @Test
	  public void regular_Item_Expect_Reduciton_In_Selln_And_Quaity()
	  {
	    Item items =  new Item("reguler", 10, 5);
	    ItemControl itemControl = ItemControlFactory.buildItemControl(items);
	    itemControl.controlItemQuality(items);
	    
	    assertEquals("reguler", items.getName());   
	    assertEquals(4, items.getQuality());
	    assertEquals(9, items.getSellIn());
	  }
	  
	  @Test
	  public void regular2_Item_Expect_Reduciton_In_Selln_And_Quaity()
	  {

	    Item items =  new Item("Elixir of the Mongoose", 5, 52);
	    ItemControl itemControl = ItemControlFactory.buildItemControl(items);
	    itemControl.controlItemQuality(items);
	    
	    assertEquals("Elixir of the Mongoose", items.getName());
	    assertEquals(4, items.getSellIn());
	    assertEquals(51, items.getQuality());

	  }



	  @Test
	  public void should_not_lower_the_quality_below_zero()
	  {
	    Item items =  new Item("+5 Dexterity Vest", 10, 0);
	    ItemControl itemControl = ItemControlFactory.buildItemControl(items);
	    itemControl.controlItemQuality(items);

	    assertEquals(0, items.getQuality());
	  }

	  @Test
	  public void should_lower_the_quality_twice_as_fast_when_sell_in_date_has_passed() 
	  {
	    Item items =  new Item("+5 Dexterity Vest", -1, 25);
	    ItemControl itemControl = ItemControlFactory.buildItemControl(items);
	    itemControl.controlItemQuality(items);
		assertEquals(23, items.getQuality());
		
	  }
	

}
