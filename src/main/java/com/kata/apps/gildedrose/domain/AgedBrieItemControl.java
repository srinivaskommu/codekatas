package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public class AgedBrieItemControl implements ItemControl 
{

	@Override
	public void controlItemQuality(Item item) 
	{
		increaseQuality(item);
	}

	private void increaseQuality(Item item) 
	{
		if (item.getQuality() < MAX_QUALITY) 
		{
			item.setQuality(item.getQuality() + DEFAULT_QUALITY_INCREASE);
		}

	}

}
