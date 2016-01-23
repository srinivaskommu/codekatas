package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public class ItemWrapperFactory 
{
	public static final String BACKSTAGE_PASS_NAME = "Backstage passes to a TAFKAL80ETC concert";
	public static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";
	public static final String AGED_BRIE_NAME = "Aged Brie";
	public static final String CONJURED_NAME = "Conjured Mana Cake";
	
	public static ItemWrapper buildItemWrapper(Item item) 
	{

		if(BACKSTAGE_PASS_NAME.equalsIgnoreCase(item.getName()))
			return new BackStageItem(BACKSTAGE_PASS_NAME, item.sellIn, item.quality);

		if(SULFURAS_NAME.equalsIgnoreCase(item.getName()))
			return new SulfarItem(SULFURAS_NAME, item.sellIn, item.quality);

		if(AGED_BRIE_NAME.equalsIgnoreCase(item.getName()))
			return new AgedBrieItem(AGED_BRIE_NAME, item.sellIn, item.quality);

		if(CONJURED_NAME.equalsIgnoreCase(item.getName()))
			return new ConjuredItem(CONJURED_NAME, item.sellIn, item.quality);

		
		return new ItemWrapper(item.name, item.sellIn, item.quality);
	}
	
	

}
