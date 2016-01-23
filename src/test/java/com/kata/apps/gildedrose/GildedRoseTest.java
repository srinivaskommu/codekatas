package com.kata.apps.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.apps.gildedrose.domain.BackStageItem;

public class GildedRoseTest
{

  @Test
  public void regular_Item_Expect_Reduciton_In_Selln_And_Quaity()
  {
    Item[] items = new Item[] { new Item("reguler", 10, 5) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    
    assertEquals("reguler", app.items.get(0).getName());   
    assertEquals(4, app.items.get(0).getQuality());
    assertEquals(9, app.items.get(0).getSellIn());
  }
  
  @Test
  public void regular2_Item_Expect_Reduciton_In_Selln_And_Quaity()
  {

    Item[] items = new Item[] { new Item("Elixir of the Mongoose", 5, 52) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertEquals("Elixir of the Mongoose", app.items.get(0).getName());
    assertEquals(4, app.items.get(0).getSellIn());
    assertEquals(51, app.items.get(0).getQuality());

  }



  @Test
  public void should_not_lower_the_quality_below_zero()
  {
    Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 0) };

    GildedRose app = new GildedRose(items);
    app.updateQuality();

    assertEquals(0, app.items.get(0).getQuality());

  }

  @Test
  public void should_lower_the_quality_twice_as_fast_when_sell_in_date_has_passed() throws Exception {
    Item[] items = new Item[] { new Item("+5 Dexterity Vest", -1, 25)};
    
    GildedRose app = new GildedRose(items);
    app.updateQuality();;
    assertEquals(23, app.items.get(0).getQuality());
  }

  @Test
  public void should_not_increase_for_above_quality_of_50() throws Exception
  {

    Item more10DaysAway = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 15, 50);
    Item correct10DaysAway = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 10, 49);
    Item correct5DaysAway = new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 5, 48);

    Item[] items = new Item[] { more10DaysAway, correct10DaysAway, correct5DaysAway };
    GildedRose app = new GildedRose(items);
    app.updateQuality();

    assertEquals(50, app.items.get(0).getQuality());
    assertEquals(50, app.items.get(1).getQuality());
    assertEquals(50, app.items.get(2).getQuality());
  }
  


}