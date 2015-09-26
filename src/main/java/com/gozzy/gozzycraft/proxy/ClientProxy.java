package com.gozzy.gozzycraft.proxy;

import com.gozzy.gozzycraft.init.ModBlocks;
import com.gozzy.gozzycraft.init.ModItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
