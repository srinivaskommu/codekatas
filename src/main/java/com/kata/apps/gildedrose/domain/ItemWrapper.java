package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public class ItemWrapper extends Item
{
	int MAX_QUALITY = 50;
	int DEFAULT_QUALITY_INCREASE = 1;
	int DEFAULT_QUALITY_DECREASE = 1;
	

	public ItemWrapper(String name, int sellIn, int quality) 
	{
		super(name, sellIn, quality);
	}
	
	public void decreaseQuality()
	  {
	    if (this.quality > 0)
	    {
	      if (this.sellIn>=0)
	       addQuality(DEFAULT_QUALITY_INCREASE);
	      else
	        addQuality(2);
	    }
	  }

	  public void increaseQuality()
	  {
	    if (getQuality() < MAX_QUALITY)
	    {
	      this.quality += DEFAULT_QUALITY_INCREASE;
	    }
	  }

	  public void decreaseSellIn()
	  {
	    setSellIn(getSellIn() - DEFAULT_QUALITY_DECREASE);
	  }

	  private void addQuality(int value)
	  {
	    this.quality -= value;
	  }
}
