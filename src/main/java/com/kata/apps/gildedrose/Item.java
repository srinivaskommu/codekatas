package com.kata.apps.gildedrose;

public class Item
{
  private String name;

  private int sellIn;

  private int quality;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getSellIn()
  {
    return sellIn;
  }

  public void setSellIn(int sellIn)
  {
    this.sellIn = sellIn;
  }

  public int getQuality()
  {
    return quality;
  }

  public void setQuality(int quality)
  {
    this.quality = quality;
  }

  public Item(String name, int sellIn, int quality)
  {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  @Override
  public String toString()
  {
    return this.name + ", " + this.sellIn + ", " + this.quality;
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
