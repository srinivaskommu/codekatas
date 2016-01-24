package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public class ConjuredItemControl implements ItemControl 
{
	@Override
	public void controlItemQuality(Item item) 
	{
		decreaseQuality(item);
	}


	private void decreaseQuality(Item item) 
	{
		if (item.getQuality() - 1 >= 0) 
		{
			if (item.getSellIn() > 0) 
			{
				item.setQuality(item.getQuality() - 2);
			} 
			else 
			{
				item.setQuality(item.getQuality() - 4);
			}
		}

	}


}
