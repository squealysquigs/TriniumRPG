package com.triniumrpg.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TriniumStaff extends Item{

	public TriniumStaff(int par1, EnumToolMaterial RUNIUMSWORD) {
		super(par1);
		setCreativeTab(TriniumRPG.tabTrinium);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}		

	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
	if(target.worldObj.isRemote) {
	if(target instanceof EntityMob) {
	target.motionY = 1;
	} else {
	player.addChatMessage("This item only works on monsters!");
	}
	return false;
	}
	return bFull3D;
	}
}


