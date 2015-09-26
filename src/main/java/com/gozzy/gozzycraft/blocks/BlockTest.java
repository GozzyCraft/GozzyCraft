package com.gozzy.gozzycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTest extends Block 
{

	protected BlockTest(Material material) {
		super(material);
		this.setLightLevel(5.0f);
		this.setHardness(3.0f);
		this.setResistance(3.0f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
