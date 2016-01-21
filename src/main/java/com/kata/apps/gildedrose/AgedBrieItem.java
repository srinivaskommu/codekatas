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
