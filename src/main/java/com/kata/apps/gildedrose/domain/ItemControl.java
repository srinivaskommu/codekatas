package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public interface ItemControl 
{
	int MAX_QUALITY = 50;
	int DEFAULT_QUALITY_INCREASE = 1;
	int DEFAULT_QUALITY_DECREASE = 1;
	int EXTRA_QUALITY_INCREASE = 2;
	int NO_QUALITY_INCREASE = 0;
	
	public default void controlItemSellIn(Item item)
	{
		item.sellIn = item.sellIn - DEFAULT_QUALITY_DECREASE;
	}
	
	public void controlItemQuality(Item item);
	

}
