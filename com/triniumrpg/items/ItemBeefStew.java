package com.triniumrpg.items;

import com.triniumrpg.TriniumRPG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemBeefStew extends ItemFood{

	public ItemBeefStew(int id, int hunger, float saturation, boolean Food) {
		super(id, hunger, saturation, Food);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(TriniumRPG.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}

