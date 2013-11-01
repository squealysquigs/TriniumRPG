package com.triniumrpg.items;

import javax.xml.transform.Result;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TriniumShickaxe extends ItemTool{
	
	public TriniumShickaxe(int id, EnumToolMaterial material) {
		super(id, 8F, material, blocksEffectiveAgainst);
		setCreativeTab(TriniumRPG.tabTrinium);
		}
	
	 @SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
		}		
		
	public static final Block[] blocksEffectiveAgainst = {Block.cobblestone, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockIron, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail, Block.railDetector, Block.railPowered, Block.railActivator, Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern, Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

	

	
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
	if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
	return false;
	} else {
	if ( par3World.getBlockId(par4, par5, par6) == Block.dirt.blockID ||
	par3World.getBlockId(par4, par5, par6) == Block.grass.blockID) {
	UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);

	if (MinecraftForge.EVENT_BUS.post(event)) {
	return false;

	}

	int i1 = par3World.getBlockId(par4, par5, par6);
	boolean air = par3World.isAirBlock(par4, par5 + 1, par6);

	if (par7 != 0 && air && (i1 == Block.grass.blockID || i1 == Block.dirt.blockID)) {
	Block block = Block.tilledField;
	par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);

	if (par3World.isRemote) {
	return true;
	} else {
	par3World.setBlock(par4, par5, par6, block.blockID);
	par1ItemStack.damageItem(1, par2EntityPlayer);
	return true;
	}
	} else {
	return false;
	}
	}
	}
	return false;
	
	}
	
	
	
	public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
		  if (itemStack.itemID == this.itemID) {
		   return this.canHarvestBlockA(par1Block);
		  } else {
		   return canHarvestBlock(par1Block, itemStack);
		  }
		 }
		 public boolean canHarvestBlockA(Block par1Block) {
		  return true;
		 }
		 public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		  float dmg = 1.0F;
		  for (int i = 0; i < this.blocksEffectiveAgainst.length; ++i) {
		   if (this.blocksEffectiveAgainst[i] == par2Block) {
		        return this.efficiencyOnProperMaterial;
		   }
		  }
		  if (par1ItemStack.itemID == this.itemID)
		   dmg = 8.0F;
		  return dmg;
		 }
		}


	