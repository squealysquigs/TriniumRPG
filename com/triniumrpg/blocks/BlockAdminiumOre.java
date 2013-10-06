package com.triniumrpg.blocks;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;
import com.triniumrpg.lib.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAdminiumOre extends Block{

	public BlockAdminiumOre(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(TriniumRPG.tabTrinium);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + getUnlocalizedName());
	}
}


