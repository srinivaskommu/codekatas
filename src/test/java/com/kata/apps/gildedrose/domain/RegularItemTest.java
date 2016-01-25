package com.kata.apps.gildedrose.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.kata.apps.gildedrose.Item;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import static com.kata.apps.gildedrose.ItemBuilder.anItem;

@RunWith(DataProviderRunner.class)
public class RegularItemTest 
{
	ItemControl itemControl = new RegularItemControl();

	@Test
	@UseDataProvider(value = "regularItems")
	public void itemQualityReducedByOneForRegularItem(String itemName, int currentQuality, int currentSellIn,
			int upadtedQuality, int upadtedSellIn) 
	{
		Item item = anItem().withName(itemName).withQuality(currentQuality).withSellIn(currentSellIn).build();

		itemControl.controlItemQuality(item);
		assertEquals(upadtedQuality, item.getQuality());

		itemControl.controlItemSellIn(item);
		assertEquals(upadtedSellIn, item.getSellIn());
	}

	@DataProvider
	public static Object[][] regularItems() 
	{
		return new Object[][] { { "Elixir of the Mongoose", 5, 52, 4, 51 },
								{ "+5 Dexterity Vest", 0, 10, 0, 9 },
								{ "+5 Dexterity Vest", 5, -1, 3, -2 } 
							  };
	}

}
