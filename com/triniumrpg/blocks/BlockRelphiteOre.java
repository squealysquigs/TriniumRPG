package com.triniumrpg.blocks;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRelphiteOre extends Block{

	public BlockRelphiteOre(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(TriniumRPG.tabTrinium);
	}


	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
}


