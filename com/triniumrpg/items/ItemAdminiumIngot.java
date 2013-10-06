package com.triniumrpg.items;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.CreativeTab;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAdminiumIngot extends Item{

	public ItemAdminiumIngot(int par1) {
		super(par1);
		setCreativeTab(TriniumRPG.tabTrinium);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
}

