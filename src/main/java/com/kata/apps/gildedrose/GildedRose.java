package com.kata.apps.gildedrose;

import com.kata.apps.gildedrose.domain.ItemControl;
import com.kata.apps.gildedrose.domain.ItemControlFactory;
import static com.kata.apps.gildedrose.domain.ItemTypes.*;

public class GildedRose 
{
	static Item[] itemsList;

	public GildedRose(Item[] itemsList) 
	{
		this.itemsList = itemsList;
	}

	public static void updateQuality() 
	{
		for (Item item : itemsList) 
		{
			if(SULFURAS.getValue().equalsIgnoreCase(item.getName()))
			{
				ItemControl control = ItemControlFactory.buildItemControl(item);
				control.controlItemQuality(item);
			}

		}
	}


}