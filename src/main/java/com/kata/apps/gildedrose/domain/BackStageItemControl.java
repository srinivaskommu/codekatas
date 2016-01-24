package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public class BackStageItemControl implements ItemControl 
{
	private void increaseQuality(Item item) 
	{
		if (item.getQuality() < MAX_QUALITY) 
		{
			if ((item.getQuality() + 2) <= MAX_QUALITY) 
			{
				if (!(item.getSellIn() > 10))
					item.setQuality(item.getQuality() + 2);
				else
					item.setQuality(item.getQuality() + 1);
			} 
			else 
			{
				item.setQuality(item.getQuality() + DEFAULT_QUALITY_INCREASE);
			}
		}

	}

@Override
public void controlItemQuality(Item item) 
{
	increaseQuality(item);
}

}
