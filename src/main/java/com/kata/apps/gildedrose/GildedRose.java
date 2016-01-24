package com.kata.apps.gildedrose;

import java.util.ArrayList;
import java.util.List;

import com.kata.apps.gildedrose.domain.ItemControl;
import com.kata.apps.gildedrose.domain.ItemWrapperFactory;

public class GildedRose 
{
	static List<ItemControl> items;

	public GildedRose(Item[] itemsList) 
	{
		items = new ArrayList<ItemControl>();
		for (int i = 0; i < itemsList.length; i++) 
		{
			items.add(ItemWrapperFactory.buildItemWrapper(itemsList[i]));
		}

	}

	public static void updateQuality() 
	{
		for (ItemControl item : items) 
		{
			item.decreaseQuality();
			item.decreaseSellIn();
		}
	}


}