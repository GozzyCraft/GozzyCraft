package com.gozzy.gozzycraft.init;

import com.gozzy.gozzycraft.GozzyCraft;
import com.gozzy.gozzycraft.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
	public static Item gozzy_head;
	
	public static void init()
	{
		gozzy_head = new Item().setUnlocalizedName("gozzy_head").setCreativeTab(GozzyCraft.GozzyCraft);
	}

	public static void register()
	{
		GameRegistry.registerItem(gozzy_head, gozzy_head.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(gozzy_head);
	}
		
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
