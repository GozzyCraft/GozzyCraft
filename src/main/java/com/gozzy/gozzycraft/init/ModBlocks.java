package com.gozzy.gozzycraft.init;

import com.gozzy.gozzycraft.GozzyCraft;
import com.gozzy.gozzycraft.blocks.BlockCoordTransporter;
import com.gozzy.gozzycraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{

	public static Block BlockCoordTransporter;
	public static Block BlockTest;

	
	public static void init()
	{
		BlockCoordTransporter = new BlockCoordTransporter(Material.iron).setUnlocalizedName("BlockCoordTransporter").setCreativeTab(GozzyCraft.GozzyCraft);
		BlockTest = new BlockCoordTransporter(Material.iron).setUnlocalizedName("BlockTest").setCreativeTab(GozzyCraft.GozzyCraft);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(BlockCoordTransporter, BlockCoordTransporter.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockTest, BlockTest.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(BlockCoordTransporter);
		registerRender(BlockTest);
	}
	
	public static void registerRender(Block block)
	{
		Item item1 = Item.getItemFromBlock(BlockCoordTransporter);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item1, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item1.getUnlocalizedName().substring(5), "inventory"));
		Item item2 = Item.getItemFromBlock(BlockTest);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item2, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item2.getUnlocalizedName().substring(5), "inventory"));
	}
}
