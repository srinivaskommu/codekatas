package com.kata.apps.gildedrose;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GildedRose 
{
	static List<ItemWrapper> items;

	public GildedRose(Item[] itemsList) 
	{
		items = new ArrayList<ItemWrapper>();
		for (int i = 0; i < itemsList.length; i++) 
		{
			items.add(new ItemWrapper(itemsList[i].name, itemsList[i].sellIn, itemsList[i].quality));
		}

	}

	public static void updateQuality() 
	{
		for (ItemWrapper item : items) 
		{
			item.decreaseQuality();
			item.decreaseSellIn();
		}
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		items = new ArrayList<ItemWrapper>();
		System.out.println("***************GILDED ROSA********************");
		System.out.println("To ADD NEW ITEM, ENTER 1");
		System.out.println("To GO TO NEXT DAY, ENTER 2");
		System.out.println("To DISPLAY INVENTORY, ENTER 3");
		int choice = input.nextInt();
		
		
		
		updateQuality();
	}
}