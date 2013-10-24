package com.triniumrpg;

import java.util.logging.Level;

import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;

import com.triniumrpg.blocks.Blocks;
import com.triniumrpg.entities.EntityFox;
import com.triniumrpg.entities.EntityJackO;
import com.triniumrpg.entities.ModelFox;
import com.triniumrpg.entities.ModelJackO;
import com.triniumrpg.entities.RenderFox;
import com.triniumrpg.entities.RenderJackO;
import com.triniumrpg.handlers.ConfigHandler;
import com.triniumrpg.handlers.EventManager;
import com.triniumrpg.handlers.GuiHandler;
import com.triniumrpg.handlers.RecipeRemover;
import com.triniumrpg.items.Items;
import com.triniumrpg.lib.ArmorMaterials;
import com.triniumrpg.lib.CreativeTab;
import com.triniumrpg.lib.LogHelper;
import com.triniumrpg.lib.ModInfo;
import com.triniumrpg.lib.ToolMaterials;
import com.triniumrpg.provider.WorldProviderTriniumRPG;
import com.triniumrpg.proxy.CommonProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
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
			RecipeRemover.removeRecipe(new ItemStack(Item.bread));
			LogHelper.log(Level.INFO, "Loading Config");
			proxy.initRenderers();
			proxy.initSounds();
			ConfigHandler.init(event.getSuggestedConfigurationFile());
		}

		public static int startEntityId = 300;
		public static int mobID = 0;
		public static int primaryColor = 0x047A14;
		
		
		
		@EventHandler
		public static void init(FMLInitializationEvent event) {
			
			EntityRegistry.registerGlobalEntityID(EntityJackO.class, "JackO", ++mobID);
			EntityRegistry.addSpawn(EntityJackO.class, /*how common*/1, /*entity per group min*/1, /*max*/4, EnumCreatureType.creature);
			EntityRegistry.findGlobalUniqueEntityId();
			registerEntityEgg(EntityJackO.class, primaryColor, 0xBD6100);
			RenderingRegistry.registerEntityRenderingHandler(EntityJackO.class, new RenderJackO(new ModelJackO(), 0.3F));
			LanguageRegistry.instance().addStringLocalization("entity.JackO.name", "Jack O' Lantern");
		
			EntityRegistry.registerGlobalEntityID(EntityFox.class, "Fox", 1);
			EntityRegistry.addSpawn(EntityFox.class, 2, 2, 5, EnumCreatureType.creature);
			EntityRegistry.findGlobalUniqueEntityId();
			RenderingRegistry.registerEntityRenderingHandler(EntityFox.class, new RenderFox(new ModelFox(), 0.3F));
			LanguageRegistry.instance().addStringLocalization("entity.Fox.name", "Fox");
			registerEntityEgg(EntityFox.class, mobID, mobID);
			
			
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
		
		public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor) {
			int id = getUniqueEntityId();
			EntityList.IDtoClassMapping.put(id, entity);
			EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
			}

			public static int getUniqueEntityId() {
			do {
			startEntityId++;
			}
			while (EntityList.getStringFromID(startEntityId) != null);
			return startEntityId;
			}
			
			
			

		@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + "ClientProxy", serverSide = ModInfo.PROXY_LOCATION + "CommonProxy")
		public static CommonProxy proxy;
	}
