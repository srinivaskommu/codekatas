package com.kata.apps.gildedrose;

public class AgedBrieItem extends ItemWrapper
{

  public AgedBrieItem(String name, int sellIn, int quality)
  {
    super(name, sellIn, quality);
  }

  @Override
  public void increaseQuality()
  {
    if (getQuality() < 50) 
    {
        setQuality(getQuality() + 1);
    }

  }

  @Override
  public void decreaseQuality()
  {
    increaseQuality();
 
  }


}
