package com.triniumrpg.blocks;

import java.util.Random;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.BlockSand;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class BlockFlour extends BlockSand
{
    public BlockFlour(int par1)
    {
        super(par1);
		setCreativeTab(TriniumRPG.tabTrinium);
    }
    
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
}
