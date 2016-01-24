package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SulfarItemTest 
{
	  // "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
	  @Test
	  public void sulfuras_No_ChangeQuality_No_Sellin()
	  {
		ItemControl item =  new ItemControl("Sulfuras, Hand of Ragnaros", 0, 80) ;
		item.increaseQuality();
		
	    assertEquals("Sulfuras, Hand of Ragnaros", item.getName());
	    assertEquals(0, item.getSellIn());
	    assertEquals(80, item.getQuality());

	  }

}