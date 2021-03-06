package com.triniumrpg.items;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.blocks.Blocks;
import com.triniumrpg.lib.IDs;
import com.triniumrpg.lib.ModInfo;
import com.triniumrpg.lib.Names;
import com.triniumrpg.lib.ToolMaterials;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	public static Item goldencoin;
	public static Item pestle;
	public static Item pestleMortar;
	public static Item softClay;
	public static Item unfPot;
	public static Item pot;
	public static Item flourPot;
	public static Item breadDough;
	public static Item beefStew;
	public static Item adminiumIngot;
	public static Item runiumIngot;
	public static Item relphiteDust;
	public static Item adminiumSword;
	public static Item adminiumPickaxe;
	public static Item adminiumAxe;
	public static Item adminiumShovel;
	public static Item runiumSword;
	public static Item runiumPickaxe;
	public static Item runiumAxe;
	public static Item runiumShovel;
	public static Item liquidStone;
	public static Item holyStone;
	public static Item hellStone;
	public static Item relphiteLighter;
	public static Item shadowBar;
	public static Item shadowShickaxe;
	public static Item blazeCharge;
	public static Item flingerStaff;
	public static Item witherStaff;
	
	
	

	public static void init() {
		goldencoin = new TriniumItem(IDs.goldencoin_actual).setUnlocalizedName(Names.goldencoin_unlocalname);
		GameRegistry.registerItem(goldencoin, goldencoin.getUnlocalizedName());

		pestle = new TriniumItem(IDs.pestle_actual).setUnlocalizedName(Names.pestle_unlocalname).setFull3D();
		GameRegistry.registerItem(pestle, pestle.getUnlocalizedName());
		pestleMortar = new TriniumReusableItem(IDs.pestleMortar_actual).setUnlocalizedName(Names.pestleMortar_unlocalname);
		GameRegistry.registerItem(pestleMortar, pestleMortar.getUnlocalizedName());
		
		softClay = new TriniumItem(IDs.softClay_actual).setUnlocalizedName(Names.softClay_unlocalname);
		GameRegistry.registerItem(softClay, softClay.getUnlocalizedName());
		unfPot = new TriniumItem(IDs.unfPot_actual).setUnlocalizedName(Names.unfPot_unlocalname);
		GameRegistry.registerItem(unfPot, unfPot.getUnlocalizedName());
		pot = new TriniumItem(IDs.pot_actual).setUnlocalizedName(Names.pot_unlocalname);
		GameRegistry.registerItem(pot, pot.getUnlocalizedName());
		flourPot = new FlourPot(IDs.flourPot_actual).setUnlocalizedName(Names.flourPot_unlocalname).setContainerItem(pot);
		GameRegistry.registerItem(flourPot, flourPot.getUnlocalizedName());
		breadDough = new TriniumItem(IDs.breadDough_actual).setUnlocalizedName(Names.breadDough_unlocalname);
		GameRegistry.registerItem(breadDough, breadDough.getUnlocalizedName());
		
		blazeCharge = new TriniumItem(IDs.blazeCharge_default).setUnlocalizedName(Names.blazeCharge_unlocalname);
		GameRegistry.registerItem(blazeCharge, blazeCharge.getUnlocalizedName());
		
		liquidStone = (new LiquidStone(IDs.liquidStone_actual, 0)).setUnlocalizedName(Names.liquidStone_unlocalname).setMaxStackSize(16).setTextureName("bucket_empty");
		GameRegistry.registerItem(liquidStone, liquidStone.getUnlocalizedName());
		holyStone = (new LiquidStone(IDs.holyStone_actual, Block.waterMoving.blockID)).setUnlocalizedName(Names.holyStone_unlocalname).setContainerItem(liquidStone).setTextureName("stick");
		GameRegistry.registerItem(holyStone, holyStone.getUnlocalizedName());
		hellStone = (new LiquidStone(IDs.hellStone_actual, Block.lavaMoving.blockID)).setUnlocalizedName(Names.hellStone_unlocalname).setContainerItem(liquidStone).setTextureName("flint");
		GameRegistry.registerItem(hellStone, hellStone.getUnlocalizedName());
		
		beefStew = new TriniumBowlFood(IDs.beefStew_actual, 10, 8, false).setUnlocalizedName(Names.beefStew_unlocalname);
		GameRegistry.registerItem(beefStew, beefStew.getUnlocalizedName());

		adminiumIngot = new TriniumItem(IDs.adminiumIngot_actual).setUnlocalizedName(Names.adminiumIngot_unlocalname);
		GameRegistry.registerItem(adminiumIngot, adminiumIngot.getUnlocalizedName());
		runiumIngot = new TriniumItem(IDs.runiumIngot_actual).setUnlocalizedName(Names.runiumIngot_unlocalname);
		GameRegistry.registerItem(runiumIngot, runiumIngot.getUnlocalizedName());
		relphiteDust = new TriniumItem(IDs.relphiteDust_actual).setUnlocalizedName(Names.relphiteDust_unlocalname);
		GameRegistry.registerItem(relphiteDust, relphiteDust.getUnlocalizedName());	
		shadowBar = new TriniumItem(IDs.shadowBar_default).setUnlocalizedName(Names.shadowBar_unlocalname);
		GameRegistry.registerItem(shadowBar, shadowBar.getUnlocalizedName());
		
		
		adminiumSword = new TriniumSword(IDs.adminiumSword_actual, ToolMaterials.ADMINIUMSWORD).setUnlocalizedName(Names.adminiumSword_unlocalname);
		GameRegistry.registerItem(adminiumSword, adminiumSword.getUnlocalizedName());
		runiumSword = new TriniumSword(IDs.runiumSword_actual, ToolMaterials.RUNIUMSWORD).setUnlocalizedName(Names.runiumSword_unlocalname);
		GameRegistry.registerItem(runiumSword, runiumSword.getUnlocalizedName());
		flingerStaff = new TriniumFireballStaff(IDs.flingerStaff_default, ToolMaterials.USELESS).setUnlocalizedName(Names.flingerStaff_unlocalname);
		GameRegistry.registerItem(flingerStaff, flingerStaff.getUnlocalizedName());
		witherStaff = new TriniumWitherStaff(IDs.witherStaff_default, ToolMaterials.USELESS).setUnlocalizedName(Names.witherStaff_unlocalname);
		GameRegistry.registerItem(witherStaff, witherStaff.getUnlocalizedName());
		
		adminiumPickaxe = new TriniumPickaxe(IDs.adminiumPickaxe_default, ToolMaterials.ADMINIUMPICKAXE).setUnlocalizedName(Names.adminiumPickaxe_unlocalname);
		GameRegistry.registerItem(adminiumPickaxe, adminiumPickaxe.getUnlocalizedName());
		runiumPickaxe = new TriniumPickaxe(IDs.runiumPickaxe_default, ToolMaterials.ADMINIUMPICKAXE).setUnlocalizedName(Names.runiumPickaxe_unlocalname);
		GameRegistry.registerItem(runiumPickaxe, runiumPickaxe.getUnlocalizedName());
		adminiumAxe = new TriniumAxe(IDs.adminiumAxe_default, ToolMaterials.ADMINIUMAXE).setUnlocalizedName(Names.adminiumAxe_unlocalname);
		GameRegistry.registerItem(adminiumAxe, adminiumAxe.getUnlocalizedName());
		runiumAxe = new TriniumAxe(IDs.runiumAxe_default, ToolMaterials.ADMINIUMAXE).setUnlocalizedName(Names.runiumAxe_unlocalname);
		GameRegistry.registerItem(runiumAxe, runiumAxe.getUnlocalizedName());
		adminiumShovel = new TriniumShovel(IDs.adminiumShovel_default, ToolMaterials.ADMINIUMSHOVEL).setUnlocalizedName(Names.adminiumShovel_unlocalname);
		GameRegistry.registerItem(adminiumShovel, adminiumShovel.getUnlocalizedName());
		runiumShovel = new TriniumShovel(IDs.runiumShovel_default, ToolMaterials.ADMINIUMSHOVEL).setUnlocalizedName(Names.runiumShovel_unlocalname);
		GameRegistry.registerItem(runiumShovel, runiumShovel.getUnlocalizedName());
		
		shadowShickaxe = new TriniumShickaxe(IDs.shadowShickaxe_default, ToolMaterials.SHICKAXE).setUnlocalizedName(Names.shadowShickaxe_unlocalname);
		GameRegistry.registerItem(shadowShickaxe, shadowShickaxe.getUnlocalizedName());
		
		
		relphiteLighter = new RelphiteLighter(IDs.relphiteLighter_default).setUnlocalizedName(Names.relphiteLighter_unlocalname);
		
		
		
		
	}

	public static void addNames() {
		LanguageRegistry.addName(goldencoin, Names.goldencoin_name);
		
		LanguageRegistry.addName(pestle, Names.pestle_name);
		LanguageRegistry.addName(pestleMortar, Names.pestleMortar_name);

		LanguageRegistry.addName(softClay, Names.softClay_name);
		LanguageRegistry.addName(unfPot, Names.unfPot_name);
		LanguageRegistry.addName(pot, Names.pot_name);
		LanguageRegistry.addName(flourPot, Names.flourPot_name);
		LanguageRegistry.addName(breadDough, Names.breadDough_name);

		LanguageRegistry.addName(beefStew, Names.beefStew_name);	
		
		LanguageRegistry.addName(blazeCharge, Names.blazeCharge_name);

		LanguageRegistry.addName(adminiumIngot, Names.adminiumIngot_name);
		LanguageRegistry.addName(runiumIngot, Names.runiumIngot_name);
		LanguageRegistry.addName(relphiteDust, Names.relphiteDust_name);
		LanguageRegistry.addName(shadowBar, Names.shadowBar_name);
		LanguageRegistry.addName(shadowShickaxe, Names.shadowShickaxe_name);
		
		LanguageRegistry.addName(relphiteLighter, Names.relphiteLighter_name);
		
		LanguageRegistry.addName(adminiumSword, Names.adminiumSword_name);
		LanguageRegistry.addName(runiumSword, Names.runiumSword_name);
		LanguageRegistry.addName(flingerStaff, Names.flingerStaff_name);
		LanguageRegistry.addName(witherStaff, Names.witherStaff_name);
		
		LanguageRegistry.addName(adminiumPickaxe, Names.adminiumPickaxe_name);
		LanguageRegistry.addName(runiumPickaxe, Names.runiumPickaxe_name);
		LanguageRegistry.addName(adminiumAxe, Names.adminiumAxe_name);
		LanguageRegistry.addName(runiumAxe, Names.runiumAxe_name);
		LanguageRegistry.addName(adminiumShovel, Names.adminiumShovel_name);
		LanguageRegistry.addName(runiumShovel, Names.runiumShovel_name);
		
		
		
	}

	public static void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(beefStew), new Object[]{new ItemStack(Item.bowlEmpty), new ItemStack(Item.beefCooked), new ItemStack(Item.potato)});
		GameRegistry.addShapelessRecipe(new ItemStack(flourPot), new Object[]{new ItemStack(pot), new ItemStack(pestleMortar), new ItemStack(Item.wheat)});
		GameRegistry.addShapelessRecipe(new ItemStack(pestleMortar), new Object[]{new ItemStack(Item.bowlEmpty), new ItemStack(pestle)});
		GameRegistry.addShapelessRecipe(new ItemStack(breadDough), new Object[]{new ItemStack(flourPot), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 2), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 3), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 4), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 5), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 6), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 7), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(softClay, 8), new Object[]{new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.clay), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(shadowBar), new Object[]{new ItemStack(adminiumIngot), new ItemStack(runiumIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(blazeCharge), new Object[]{new ItemStack(Item.blazeRod), new ItemStack(Item.blazeRod), new ItemStack(Item.blazeRod), new ItemStack(Item.blazeRod)});
		
		GameRegistry.addRecipe(new ItemStack(pestle), new Object[]{"II", 'I', Item.stick});
		GameRegistry.addRecipe(new ItemStack(unfPot), new Object[]{"x x", " x ", 'x', softClay});	
		
		GameRegistry.addRecipe(new ItemStack(adminiumSword), new Object[]{"x", "x",	"s", 'x', adminiumIngot, 's', Item.stick});		
		GameRegistry.addRecipe(new ItemStack(runiumSword), new Object[]{"x", "x", "s", 'x', runiumIngot, 's', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(runiumPickaxe), new Object[]{"xxx", " s ", " s ", 'x', runiumIngot, 's', Item.stick});
		GameRegistry.addRecipe(new ItemStack(adminiumPickaxe), new Object[]{"xxx", " s ", " s ", 'x', adminiumIngot, 's', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(runiumAxe), new Object[]{"xx ", "xs ", " s ", 'x', runiumIngot, 's', Item.stick});
		GameRegistry.addRecipe(new ItemStack(adminiumAxe), new Object[]{"xx ", "xs ", " s ", 'x', adminiumIngot, 's', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(runiumShovel), new Object[]{" x ", " s ", " s ", 'x', runiumIngot, 's', Item.stick});
		GameRegistry.addRecipe(new ItemStack(adminiumShovel), new Object[]{" x ", " s ", " s ", 'x', adminiumIngot, 's', Item.stick});

		GameRegistry.addRecipe(new ItemStack(relphiteLighter), new Object[]{" x ", "xsx", " x ", 'x', Blocks.relphiteFrame, 's', Item.flintAndSteel});
		
		GameRegistry.addRecipe(new ItemStack(shadowShickaxe), new Object[]{"xxx", "csv", "dsz", 'x', shadowBar, 'c', runiumPickaxe, 's', Item.stick, 'v', adminiumPickaxe, 'd', runiumAxe, 'z', adminiumShovel});
		
		GameRegistry.addRecipe(new ItemStack(flingerStaff), new Object[]{" x ", " bx", "b  ", 'x', blazeCharge, 'b', Item.blazeRod});
		
		FurnaceRecipes.smelting().addSmelting(softClay.itemID, 0, new ItemStack(Item.brick), 0.4F);
		FurnaceRecipes.smelting().addSmelting(unfPot.itemID, 0, new ItemStack(pot), 0.4F);
		FurnaceRecipes.smelting().addSmelting(breadDough.itemID, 0, new ItemStack(Item.bread, 2), 0.4F);
		
		FurnaceRecipes.smelting().addSmelting(Blocks.runiumOre.blockID, 0, new ItemStack(runiumIngot), 0.4F);
		FurnaceRecipes.smelting().addSmelting(Blocks.adminiumOre.blockID, 0, new ItemStack(adminiumIngot), 0.3F);
		FurnaceRecipes.smelting().addSmelting(Blocks.relphiteOre.blockID, 0, new ItemStack(relphiteDust, 4), 0.4F);
	}
}