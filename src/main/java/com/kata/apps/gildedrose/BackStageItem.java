package com.kata.apps.gildedrose;

public class BackStageItem extends Item
{

  public BackStageItem(String name, int sellIn, int quality)
  {
    super(name, sellIn, quality);
  }

  @Override
  public void increaseQuality()
  {
    if (super.getQuality() < 50)
    {
    if ((super.getQuality() + 2) <= 50)
    {
      if (!(super.getSellIn() > 10))
        super.setQuality(super.getQuality()+ 2);
      else
        super.setQuality(super.getQuality()+ 1);
    }
    else
    {
      super.setQuality(super.getQuality()+ 1);
    }
    }

  }
  
  @Override
  public void decreaseQuality()
  {
    increaseQuality();
 
  }


  


}
