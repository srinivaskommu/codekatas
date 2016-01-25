package com.kata.apps.gildedrose.domain;

import com.kata.apps.gildedrose.Item;
import static com.kata.apps.gildedrose.domain.ItemTypes.*;

public class ItemControlFactory 
{
	public static ItemControl buildItemControl(Item item) 
	{
		if (BACKSTAGE_PASS.getValue().equals(item.getName()))
			return new BackStageItemControl();

		if (AGED_BRIE.getValue().equals(item.getName()))
			return new AgedBrieItemControl();

		if (CONJURED.getValue().equals(item.getName()))
			return new ConjuredItemControl();

		return new RegularItemControl();
	}

}
