package com.kata.apps.gildedrose.domain;

public enum ItemTypes 
{
	BACKSTAGE_PASS("Backstage passes to a TAFKAL80ETC concert"),
	SULFURAS("Sulfuras, Hand of Ragnaros"),
	AGED_BRIE("Aged Brie"),
	CONJURED("Conjured Mana Cake");
	
	private String value;
	
	ItemTypes(String itemType)
	{
		this.value = itemType;
	}

	public String getValue() 
	{
		return value;
	}

	
}
