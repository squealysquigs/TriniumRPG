package com.triniumrpg.items;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.blocks.Blocks;
import com.triniumrpg.lib.IDs;
import com.triniumrpg.lib.ModInfo;
import com.triniumrpg.lib.Names;
import com.triniumrpg.lib.ToolMaterials;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	public static Item goldencoin;
	public static Item beefStew;
	public static Item adminiumIngot;
	public static Item runiumIngot;
	public static Item relphiteDust;
	public static Item adminiumSword;
	public static Item runiumSword;

	public static void init() {
		goldencoin = new TriniumItem(IDs.goldencoin_actual).setUnlocalizedName(Names.goldencoin_unlocalname).setTextureName(ModInfo.ID + ":" + Names.goldencoin_unlocalname);
		
		beefStew = new ItemBeefStew(IDs.beefStew_actual, 10, 8, false).setUnlocalizedName(Names.beefStew_unlocalname);
		GameRegistry.registerItem(beefStew, beefStew.getUnlocalizedName());

		adminiumIngot = new ItemAdminiumIngot(IDs.adminiumIngot_actual).setUnlocalizedName(Names.adminiumIngot_unlocalname);
		GameRegistry.registerItem(adminiumIngot, adminiumIngot.getUnlocalizedName());
		runiumIngot = new ItemRuniumIngot(IDs.runiumIngot_actual).setUnlocalizedName(Names.runiumIngot_unlocalname);
		GameRegistry.registerItem(runiumIngot, runiumIngot.getUnlocalizedName());
		relphiteDust = new ItemRelphiteDust(IDs.relphiteDust_actual).setUnlocalizedName(Names.relphiteDust_unlocalname);
		GameRegistry.registerItem(relphiteDust, relphiteDust.getUnlocalizedName());	
		
		adminiumSword = new ItemAdminiumSword(IDs.adminiumSword_actual, ToolMaterials.ADMINIUMSWORD).setUnlocalizedName(Names.adminiumSword_unlocalname);
		GameRegistry.registerItem(adminiumSword, adminiumSword.getUnlocalizedName());
		runiumSword = new ItemRuniumSword(IDs.runiumSword_actual, ToolMaterials.RUNIUMSWORD).setUnlocalizedName(Names.runiumSword_unlocalname);
		GameRegistry.registerItem(runiumSword, runiumSword.getUnlocalizedName());
	}

	public static void addNames() {
		LanguageRegistry.addName(goldencoin, Names.goldencoin_name);
		
		LanguageRegistry.addName(beefStew, Names.beefStew_name);	


		LanguageRegistry.addName(adminiumIngot, Names.adminiumIngot_name);
		LanguageRegistry.addName(runiumIngot, Names.runiumIngot_name);
		LanguageRegistry.addName(relphiteDust, Names.relphiteDust_name);
		
		LanguageRegistry.addName(adminiumSword, Names.adminiumSword_name);
		LanguageRegistry.addName(runiumSword, Names.runiumSword_name);
	}

	public static void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(beefStew), new Object[]{new ItemStack(Item.bowlEmpty), new ItemStack(Item.beefRaw), new ItemStack(Item.potato)
		
		});
		
		GameRegistry.addRecipe(new ItemStack(adminiumSword), new Object[]{"x", "x",	"s", 'x', adminiumIngot, 's', Item.stick			
			});		
		GameRegistry.addRecipe(new ItemStack(runiumSword), new Object[]{"x", "x", "s", 'x', runiumIngot, 's', Item.stick			
			});
		
		FurnaceRecipes.smelting().addSmelting(Blocks.runiumOre.blockID, 0, new ItemStack(runiumIngot), 0.4F);
		FurnaceRecipes.smelting().addSmelting(Blocks.adminiumOre.blockID, 0, new ItemStack(adminiumIngot), 0.3F);
		FurnaceRecipes.smelting().addSmelting(Blocks.relphiteOre.blockID, 0, new ItemStack(relphiteDust, 4), 0.4F);
	}
}