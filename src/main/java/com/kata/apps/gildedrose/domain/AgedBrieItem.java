package com.kata.apps.gildedrose.domain;

public class AgedBrieItem extends ItemControl
{

  public AgedBrieItem(String name, int sellIn, int quality)
  {
    super(name, sellIn, quality);
  }

  @Override
  public void increaseQuality()
  {
    if (getQuality() < MAX_QUALITY) 
    {
        setQuality(getQuality() + DEFAULT_QUALITY_INCREASE);
    }

  }

  @Override
  public void decreaseQuality()
  {
    increaseQuality();
 
  }


}
