package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SulfarItemTest 
{
	  // "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
	  @Test
	  public void sulfuras_No_ChangeQuality_No_Sellin()
	  {
	    Item[] items = new Item[] { new SulfarItem("Sulfuras, Hand of Ragnaros", 0, 80) };
	    GildedRose app = new GildedRose(items);
	    app.updateQuality();
	    assertEquals("Sulfuras, Hand of Ragnaros", app.items.get(0).getName());
	    assertEquals(0, app.items.get(0).getSellIn());
	    assertEquals(80, app.items.get(0).getQuality());

	  }

}
