package com.kata.apps.gildedrose.domain;

import static java.lang.Math.min;

import com.kata.apps.gildedrose.Item;


public class BackStageItemControl implements ItemControl 
{
	private static final int ELEVEN_DAYS = 11;
	private static final int FIVE_DAYS = 5;
	
	
	@Override
	public void controlItemQuality(Item item) 
	{
		int quality =  item.getSellIn() > 0	? min(item.getQuality() + updateQualityForBackStageItem(item), MAX_QUALITY): 0;
		item.quality = 	quality;		
	}
	
	private int updateQualityForBackStageItem(Item backstagePass) 
	{
		int extraQuality;		
		if (backstagePass.getSellIn() > FIVE_DAYS && backstagePass.getSellIn() < ELEVEN_DAYS) 
		{
			extraQuality =  DEFAULT_QUALITY_INCREASE;
		} 
		else if ( backstagePass.getSellIn() <= FIVE_DAYS) 
		{
			extraQuality =  EXTRA_QUALITY_INCREASE;
		}
		else
		{
			extraQuality = NO_QUALITY_INCREASE;
		}
	
		return DEFAULT_QUALITY_DECREASE + (extraQuality);
	}

	





}
