//package com.kata.apps.gildedrose.ui;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.kata.apps.gildedrose.domain.ItemControl;
//
//public class ItemProcessorImpl 
//{
//	static List<ItemControl> items;
//	
//	public static void main(String[] args) 
//	{
//		int choice = 0;
//		Scanner input = new Scanner(System.in);
//		items = new ArrayList<ItemControl>();
//		System.out.println("***************GILDED ROSA********************");
//
//		do{
//			System.out.println("To ADD NEW ITEM, ENTER 1");
//			System.out.println("To GO TO NEXT DAY, ENTER 2");
//			System.out.println("To DISPLAY INVENTORY, ENTER 3");
//			System.out.println("To EXIT, ENTER 0");
//			choice = input.nextInt();
//		
//		switch(choice)
//		{
//			case 1: loadItemInInventory(input);
//			case 2 : //updateQuality();
//			case 3 : displayInventory();
//			default:
//				System.out.println("BYE");
//		
//		}
//		}
//		while(choice>0);
//		
//		
//		
//	}
//
//	private static void displayInventory() 
//	{
//		for(ItemControl item:items)
//		{
//			System.out.println("Item Name = "+item.getName());
//			System.out.println("Item sellIn = "+item.getSellIn());
//			System.out.println("Item quality = "+item.getQuality());
//		}
//		
//	}
//
//	private static void loadItemInInventory(Scanner input) 
//	{
//		System.out.println("Enter Item Name");
//		String name = input.next();
//		
//		System.out.println("Enter Item sellIn");
//		int sellIn = input.nextInt();
//		
//		System.out.println("Enter Item quality");
//		int quality = input.nextInt();
//		
//		items.add(new ItemControl(name,sellIn,quality));
//		
//	}
//}
