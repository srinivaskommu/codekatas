package com.kata.apps.gildedrose.domain;

import static com.kata.apps.gildedrose.ItemBuilder.anItem;
import static com.kata.apps.gildedrose.domain.ItemTypes.*;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.kata.apps.gildedrose.Item;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class ItemControlFactoryTest 
{

	private ItemControlFactory factory = new ItemControlFactory();

	@Test 
	@UseDataProvider(value="regularItems")
	public void	controlBasedOnItemType(Item item, Class<?> expectedInstance) 
	{
		ItemControl itemControl = factory.buildItemControl(item);
		assertThat(itemControl, is(instanceOf(expectedInstance)));
	}
	
	@DataProvider
	public static Object[][] regularItems() 
	{
		return new Object[][] { { anItem().withName(AGED_BRIE.getValue()).build(), AgedBrieItemControl.class },
								{ anItem().withName(CONJURED.getValue()).build(), ConjuredItemControl.class },
								{ anItem().build(), RegularItemControl.class },
								{ anItem().withName(BACKSTAGE_PASS.getValue()).build(), BackStageItemControl.class }
							  };
	}
	
	

}
