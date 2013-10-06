package com.triniumrpg.blocks;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRelphitianSoil extends Block{

	@SideOnly(Side.CLIENT)
	private Icon topTexture;
	

	public BlockRelphitianSoil(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(TriniumRPG.tabTrinium);
	}
	
	public Icon top; //Top
	public Icon bottom; //Bottom
	

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
		top = par1IconRegister.registerIcon("TriniumRPG:relphitianSoil_Top");
	}	
	
	
	public Icon getIcon(int par1, int
			par2) {
			        return par1 == 0 ?
			this.bottom : (par1 == 1 ?
			this.top: this.blockIcon);
			}
	}
	
