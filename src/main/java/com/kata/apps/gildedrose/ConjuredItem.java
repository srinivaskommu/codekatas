package com.kata.apps.gildedrose;

public class ConjuredItem extends Item
{
  public ConjuredItem(String name, int sellIn, int quality)
  {
    super(name, sellIn, quality);

  }



  @Override
  public void decreaseQuality()
  {
    if (super.getQuality() - 1 >= 0)
    {
      if (super.getSellIn() > 0)
      {
        super.setQuality(super.getQuality() - 2);
      }
      else
      {
        super.setQuality(super.getQuality() - 4);
      }

    }

  }

}
