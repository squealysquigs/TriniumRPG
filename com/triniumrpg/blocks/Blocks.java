package com.triniumrpg.blocks;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.items.Items;
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
        adminiumOre = new BlockAdminiumOre(1101, Material.rock).setUnlocalizedName("adminiumOre").setHardness(3);
        GameRegistry.registerBlock(adminiumOre, adminiumOre.getUnlocalizedName());
		runiumOre = new BlockRuniumOre(1102, Material.rock).setUnlocalizedName("runiumOre").setHardness(3);
		GameRegistry.registerBlock(runiumOre, runiumOre.getUnlocalizedName());
		relphiteOre = new BlockRelphiteOre(1107, Material.rock).setUnlocalizedName("relphiteOre").setHardness(3);
		GameRegistry.registerBlock(relphiteOre, relphiteOre.getUnlocalizedName());

		//Functional------------------------------------------------------------------------------------------------------------
		relphiteFrame = new BlockRelphiteFrame(1108, Material.rock).setUnlocalizedName("relphiteFrame").setHardness(1);				
		GameRegistry.registerBlock(relphiteFrame, relphiteFrame.getUnlocalizedName());
		relphitePortal = new BlockRelphitePortal(251).setUnlocalizedName("relphitePortal");
		GameRegistry.registerBlock(relphitePortal, relphitePortal.getUnlocalizedName());
		
		//Decoration------------------------------------------------------------------------------------------------------------
		relphitianSoil = new BlockRelphitianSoil(253, Material.grass).setUnlocalizedName("relphitianSoil");
		GameRegistry.registerBlock(relphitianSoil, relphitianSoil.getUnlocalizedName());
		relphiteStone = new BlockRelphiteStone(254, Material.rock).setUnlocalizedName("relphiteStone").setHardness(3);
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
		LanguageRegistry.addName(adminiumOre, "Adminium Ore");
		LanguageRegistry.addName(runiumOre, "Runium Ore");
		LanguageRegistry.addName(relphiteOre, "Relphite Ore");
		
		//Functional------------------------------------------------------------------------------------------------------------
		LanguageRegistry.addName(relphitePortal, "Relphite Portal");
		LanguageRegistry.addName(relphiteFrame, "Relphite Frame");
		
		//Decoration------------------------------------------------------------------------------------------------------------
		LanguageRegistry.addName(relphitianSoil, "Relphitian Soil");
		LanguageRegistry.addName(relphiteStone, "Relphite Stone");
		}
	
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(relphiteFrame), new Object[]{"xxx", "xxx",	"xxx", 'x', Items.relphiteDust			
			});
	}
}