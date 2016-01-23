package com.kata.apps.gildedrose.domain;

public class SulfarItem extends ItemWrapper
{

  public SulfarItem(String name, int sellIn, int quality)
  {
    super(name, sellIn, quality);
 
  }
  	@Override
	public void decreaseQuality()
	  {}

  	@Override  
  	public void increaseQuality()
	  {}

  	@Override  
  	public void decreaseSellIn()
	  {}
  

}
