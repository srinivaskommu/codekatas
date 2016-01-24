package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;

public class RegularItemControl implements ItemControl
{

	@Override
	public void controlItemQuality(Item item) 
	{
		decreaseQuality(item);
	}
	
	private void decreaseQuality(Item item)
	{
	    if (item.getQuality() > 0)
	    {
	      if (item.sellIn>=0)
	       addQuality(item,DEFAULT_QUALITY_INCREASE);
	      else
	        addQuality(item,2);
	    }
	}


	  private void addQuality(Item item,int value)
	  {
		  item.quality -= value;
	  }



	
	
	

}
