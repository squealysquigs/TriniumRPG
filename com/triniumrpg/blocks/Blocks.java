package com.triniumrpg.blocks;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.items.Items;
import com.triniumrpg.lib.IDs;
import com.triniumrpg.lib.Names;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class Blocks {
	public static Block adminiumOre;
	public static Block runiumOre;
	public static Block relphiteOre;
	public static Block relphiteFrame;
	public static Block relphitePortal;
	public static Block relphitianSoil;
	public static Block relphiteStone;

	public static void init() {
		//Ores------------------------------------------------------------------------------------------------------------
        adminiumOre = new TriniumBlock(IDs.adminiumOre_actual, Material.rock).setUnlocalizedName(Names.adminiumOre_unlocalname).setHardness(3).setStepSound(Block.soundStoneFootstep);
        GameRegistry.registerBlock(adminiumOre, adminiumOre.getUnlocalizedName());
		runiumOre = new TriniumBlock(IDs.runiumOre_actual, Material.rock).setUnlocalizedName(Names.runiumOre_unlocalname).setHardness(3).setStepSound(Block.soundStoneFootstep);
		GameRegistry.registerBlock(runiumOre, runiumOre.getUnlocalizedName());
		relphiteOre = new TriniumBlock(IDs.relphiteOre_actual, Material.rock).setUnlocalizedName(Names.relphiteOre_unlocalname).setHardness(3).setStepSound(Block.soundStoneFootstep);
		GameRegistry.registerBlock(relphiteOre, relphiteOre.getUnlocalizedName());

		//Functional------------------------------------------------------------------------------------------------------------
		relphiteFrame = new TriniumBlock(IDs.relphiteFrame_actual, Material.rock).setUnlocalizedName(Names.relphiteFrame_unlocalname).setHardness(1).setStepSound(Block.soundStoneFootstep);				
		GameRegistry.registerBlock(relphiteFrame, relphiteFrame.getUnlocalizedName());
		relphitePortal = new BlockRelphitePortal(252).setUnlocalizedName(Names.relphitePortal_unlocalname);
		GameRegistry.registerBlock(relphitePortal, relphitePortal.getUnlocalizedName());
		
		//Decoration------------------------------------------------------------------------------------------------------------
		relphitianSoil = new TriniumBlock(253, Material.grass).setUnlocalizedName(Names.relphitianSoil_unlocalname);
		GameRegistry.registerBlock(relphitianSoil, relphitianSoil.getUnlocalizedName());
		relphiteStone = new TriniumBlock(254, Material.rock).setUnlocalizedName(Names.relphiteStone_unlocalname).setHardness(30).setStepSound(Block.soundStoneFootstep);
		GameRegistry.registerBlock(relphiteStone, relphiteStone.getUnlocalizedName()); 
	}
	
	public static void harvestLevels() {		
		MinecraftForge.setBlockHarvestLevel(adminiumOre, "pickaxe", 2);
	    MinecraftForge.setBlockHarvestLevel(runiumOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(relphiteOre, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(relphiteStone, "pickaxe", 4);
	}
	
	public static void registerTileEntities() {
	}

	public static void addNames() {
		//Ores------------------------------------------------------------------------------------------------------------
		LanguageRegistry.addName(adminiumOre, Names.adminiumOre_name);
		LanguageRegistry.addName(runiumOre, Names.runiumOre_name);
		LanguageRegistry.addName(relphiteOre, Names.relphiteOre_name);
		
		//Functional------------------------------------------------------------------------------------------------------------
		LanguageRegistry.addName(relphitePortal, Names.relphitePortal_name);
		LanguageRegistry.addName(relphiteFrame, Names.relphiteFrame_name);
		
		//Decoration------------------------------------------------------------------------------------------------------------
		LanguageRegistry.addName(relphitianSoil, Names.relphitianSoil_name);
		LanguageRegistry.addName(relphiteStone, Names.relphiteStone_name);
		}
	
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(relphiteFrame), new Object[]{"xxx", "xxx",	"xxx", 'x', Items.relphiteDust			
			});
	}
}