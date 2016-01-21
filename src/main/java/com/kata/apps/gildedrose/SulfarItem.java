package com.kata.apps.gildedrose;

public class SulfarItem extends ItemWrapper
{

  public SulfarItem(String name, int sellIn, int quality)
  {
    super(name, sellIn, quality);
 
  }

  @Override
  public void increaseQuality()
  {
    //No change
    
  }

  @Override
  public void decreaseQuality()
  {
    //No change    
    
  }

  @Override
  public void decreaseSellIn()
  {
    //No change
    
  }
  

}
