package com.kata.apps.gildedrose;

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
	       addQuality(1);
	      else
	        addQuality(2);
	    }
	  }

	  public void increaseQuality()
	  {
	    if (getQuality() < 50)
	    {
	      this.quality += 1;
	    }
	  }

	  public void decreaseSellIn()
	  {
	    setSellIn(getSellIn() - 1);
	  }

	  private void addQuality(int value)
	  {
	    this.quality -= value;
	  }
}
