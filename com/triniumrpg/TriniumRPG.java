package com.triniumrpg;

import java.util.logging.Level;

import com.triniumrpg.blocks.BlockAdminiumOre;
import com.triniumrpg.blocks.BlockRelphiteFrame;
import com.triniumrpg.blocks.BlockRelphiteOre;
import com.triniumrpg.blocks.BlockRelphitePortal;
import com.triniumrpg.blocks.BlockRelphiteStone;
import com.triniumrpg.blocks.BlockRelphitianSoil;
import com.triniumrpg.blocks.BlockRuniumOre;
import com.triniumrpg.blocks.Blocks;
import com.triniumrpg.handlers.ConfigHandler;
import com.triniumrpg.handlers.EventManager;
import com.triniumrpg.handlers.GuiHandler;
import com.triniumrpg.items.ItemAdminiumIngot;
import com.triniumrpg.items.ItemAdminiumSword;
import com.triniumrpg.items.ItemBeefStew;
import com.triniumrpg.items.ItemRelphiteDust;
import com.triniumrpg.items.ItemRuniumIngot;
import com.triniumrpg.items.ItemRuniumSword;
import com.triniumrpg.items.Items;
import com.triniumrpg.lib.ArmorMaterials;
import com.triniumrpg.lib.CreativeTab;
import com.triniumrpg.lib.LogHelper;
import com.triniumrpg.lib.ModInfo;
import com.triniumrpg.lib.ToolMaterials;
import com.triniumrpg.provider.WorldProviderTriniumRPG;
import com.triniumrpg.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TriniumRPG {		
	
		static EventManager eventmanager = new EventManager();	
		public static final int dimensionId = 16;			
		
		@Instance(ModInfo.ID)
		public static TriniumRPG instance;
		
		public static CreativeTab tabTrinium = new CreativeTab(CreativeTabs.getNextID(), ModInfo.NAME);
		
		@EventHandler
		public static void preInit(FMLPreInitializationEvent event) {
			LogHelper.log(Level.INFO, "Loading Config");
			proxy.initRenderers();
			proxy.initSounds();
			ConfigHandler.init(event.getSuggestedConfigurationFile());
		}

		@EventHandler
		public static void init(FMLInitializationEvent event) {
			
			DimensionManager.registerProviderType(TriniumRPG.dimensionId, WorldProviderTriniumRPG.class, false);
			DimensionManager.registerDimension(TriniumRPG.dimensionId, TriniumRPG.dimensionId);
			{
			GameRegistry.registerWorldGenerator(eventmanager);
			}
	
			new GuiHandler();
			LanguageRegistry.instance().addStringLocalization("itemGroup." + ModInfo.NAME, "en_US", ModInfo.NAME);
			
			ToolMaterials.init();
			ArmorMaterials.init();
			
			LogHelper.log(Level.INFO, "Preparing items");
			Items.init();
			Items.addNames();
			LogHelper.log(Level.INFO, "Items loaded");
			

			
			LogHelper.log(Level.INFO, "Preparing blocks");
			Blocks.init();
			Blocks.addNames();
			Blocks.harvestLevels();
			LogHelper.log(Level.INFO, "Blocks loaded");
			
			LogHelper.log(Level.INFO, "Preparing recipes");
			Items.addRecipes();
			Blocks.addRecipes();
			LogHelper.log(Level.INFO, "Recipes loaded");
		}

		@EventHandler
		public static void postInit(FMLPostInitializationEvent event) {
		}

		@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + "ClientProxy", serverSide = ModInfo.PROXY_LOCATION + "CommonProxy")
		public static CommonProxy proxy;
	}
