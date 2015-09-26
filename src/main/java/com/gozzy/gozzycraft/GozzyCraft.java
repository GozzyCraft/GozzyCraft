package com.gozzy.gozzycraft;

import com.gozzy.gozzycraft.creativetabs.GozzyTab;
import com.gozzy.gozzycraft.init.ModBlocks;
import com.gozzy.gozzycraft.init.ModItems;
import com.gozzy.gozzycraft.proxy.IProxy;
import com.gozzy.gozzycraft.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class GozzyCraft
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	public static final GozzyTab GozzyCraft = new GozzyTab("GozzyCraft");
	
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModItems.init();
    	ModBlocks.init();
    	ModItems.register();
    	ModBlocks.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
