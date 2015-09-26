package com.gozzy.gozzycraft.blocks;

import com.gozzy.gozzycraft.GozzyCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class BlockCoordTransporter extends Block {

	public BlockCoordTransporter(Material material) {
		super(material);
		this.setLightLevel(5.0f);
		this.setHardness(3.0f);
		this.setResistance(3.0f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeGlass);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean isFullCube() {
		return true;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}
}
