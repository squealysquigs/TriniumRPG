package com.triniumrpg.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TriniumAxe extends ItemAxe{

	public TriniumAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(TriniumRPG.tabTrinium);
		}
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
		}		
}
