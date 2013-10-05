package TriniumRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = TriniumRPG.modid, name = "TriniumRPG", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TriniumRPG {
	
	public static final String modid = "squealy_TriniumRPG";	
	
	public static Block adminiumOre;
	
	public static Block runiumOre;
	
	public static Item runiumIngot;
	
	public static Item adminiumIngot;
	
    public static Item adminiumSword;
	
	public static Item runiumSword; 
	
	public static Item adminiumPickaxe;
	
	public static Item runiumPickaxe;
	
	public static Item relphiteDust;
	
	public static Block relphitianSoil;
	
	public static Item adminiumAxe;
	
	public static Block relphiteOre;
	
	public static Block relphiteFrame;
	
	public static Block relphitePortal;
	
	public static Item adminiumShovel;
	
	public static Item adminiumHoe;
	
	public static Item runiumAxe;
	
	public static Item runiumShovel;
	
	public static Block relphiteStone;
	
	public static Item beefStew;
	
	public static Block relphiteFurnace;
	
	
	
	//Define Material
    static EnumToolMaterial ADMINIUMSWORD = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMSWORD", 2, 2000, 2F, 8, 14);
	
	static EnumToolMaterial ADMINIUMPICKAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMPICKAXE", 5, 2000, 5F, 4, 14);
	
	static EnumToolMaterial RUNIUMSWORD = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMSWORD", 2, 2500, 2F, 10, 14);
	
	static EnumToolMaterial RUNIUMPICKAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMPICKAXE", 7, 2500, 6F, 4, 14);
	
	static EnumToolMaterial ADMINIUMAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMAXE", 5, 2000, 6F, 4, 14);
	
	static EnumToolMaterial ADMINIUMSHOVEL = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMSHOVEL", 5, 2000, 5F, 5, 14);
	
	static EnumToolMaterial ADMINIUMHOE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMHOE", 5, 2000, 5F, 5, 14);
	
	static EnumToolMaterial RUNIUMAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMAXE", 5, 2500, 6F, 5, 14);
	
	static EnumToolMaterial RUNIUMSHOVEL = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMSHOVEL", 5, 2500, 6F, 3, 14);

	
	EventManager eventmanager = new EventManager();
	
	
	public static final int dimensionId = 16;

	
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		
		
        adminiumOre = new BlockAdminiumOre(1101, Material.rock).setUnlocalizedName("adminiumOre").setHardness(3);
		runiumOre = new BlockRuniumOre(1102, Material.rock).setUnlocalizedName("runiumOre").setHardness(3);
		relphitianSoil = new BlockRelphitianSoil(253, Material.grass).setUnlocalizedName("relphitianSoil");
		relphiteStone = new BlockRelphiteStone(254, Material.rock).setUnlocalizedName("relphiteStone").setHardness(3);
		relphiteOre = new BlockRelphiteOre(1107, Material.rock).setUnlocalizedName("relphiteOre").setHardness(3);
		relphiteFrame = new BlockRelphiteFrame(1108, Material.rock).setUnlocalizedName("relphiteFrame").setHardness(1);
		
		beefStew = new ItemBeefStew(7000, 10, 8, false).setUnlocalizedName("beefStew");
		
		
		adminiumIngot = new ItemAdminiumIngot(5101).setUnlocalizedName("adminiumIngot");
		runiumIngot = new ItemRuniumIngot(5102).setUnlocalizedName("runiumIngot");
		relphiteDust = new ItemRelphiteDust(5103).setUnlocalizedName("relphiteDust");
		
		adminiumSword = new ItemAdminiumSword(6002, ADMINIUMSWORD).setUnlocalizedName("adminiumSword");
		runiumSword = new ItemRuniumSword(6003, RUNIUMSWORD).setUnlocalizedName("runiumSword");
		
		
		relphitePortal = new BlockRelphitePortal(251).setUnlocalizedName("relphitePortal");
		
		//Settings for Biomes
	
		
		
		
		
		MinecraftForge.setBlockHarvestLevel(adminiumOre, "pickaxe", 2);
	    MinecraftForge.setBlockHarvestLevel(runiumOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(relphiteOre, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(relphiteStone, "pickaxe", 4);
		
		
		DimensionManager.registerProviderType(TriniumRPG.dimensionId, WorldProviderTriniumRPG.class, false);
		DimensionManager.registerDimension(TriniumRPG.dimensionId, TriniumRPG.dimensionId);
		
		GameRegistry.registerBlock(adminiumOre, modid + adminiumOre.getUnlocalizedName());
		GameRegistry.registerBlock(runiumOre, modid + runiumOre.getUnlocalizedName());
		GameRegistry.registerBlock(relphitianSoil, modid + relphitianSoil.getUnlocalizedName());
		GameRegistry.registerBlock(relphiteStone, modid + relphiteStone.getUnlocalizedName()); 
		GameRegistry.registerBlock(relphiteOre, modid + relphiteOre.getUnlocalizedName());
		GameRegistry.registerBlock(relphiteFrame, modid + relphiteFrame.getUnlocalizedName());
		
		
		
		GameRegistry.registerBlock(relphitePortal, modid + relphitePortal.getUnlocalizedName());
		
		
		
		GameRegistry.registerItem(beefStew, modid + beefStew.getUnlocalizedName());
		
		
		GameRegistry.registerItem(adminiumIngot, modid + adminiumIngot.getUnlocalizedName());
		GameRegistry.registerItem(runiumIngot, modid + runiumIngot.getUnlocalizedName());
		GameRegistry.registerItem(adminiumSword, modid + adminiumSword.getUnlocalizedName());
		GameRegistry.registerItem(runiumSword, modid + runiumSword.getUnlocalizedName());
		GameRegistry.registerItem(relphiteDust, modid + relphiteDust.getUnlocalizedName());
		
		GameRegistry.addRecipe(new ItemStack(TriniumRPG.adminiumSword), new Object[]
				{ 
			" x ",
			" x ",
			" s ",

			'x', TriniumRPG.adminiumIngot, 's', Item.stick
			
			});
		
		GameRegistry.addRecipe(new ItemStack(TriniumRPG.runiumSword), new Object[]
				{ 
			" x ",
			" x ",
			" s ",

			'x', TriniumRPG.runiumIngot, 's', Item.stick
			
			});
		
		GameRegistry.addRecipe(new ItemStack(TriniumRPG.relphiteFrame), new Object[]
				{ 
			"xxx",
			"xxx",
			"xxx",

			'x', TriniumRPG.relphiteDust
			
			});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(beefStew), new Object[]{
			
		new ItemStack(Item.bowlEmpty), new ItemStack(Item.beefRaw), new ItemStack(Item.potato)
		
		
		});
		
		FurnaceRecipes.smelting().addSmelting(TriniumRPG.runiumOre.blockID, 0, new ItemStack(runiumIngot), 0.4F);
		FurnaceRecipes.smelting().addSmelting(TriniumRPG.adminiumOre.blockID, 0, new ItemStack(adminiumIngot), 0.3F);
		FurnaceRecipes.smelting().addSmelting(TriniumRPG.relphiteOre.blockID, 0, new ItemStack(relphiteDust, 4), 0.4F);
		
		
		LanguageRegistry.addName(adminiumOre, "Adminium Ore");
		LanguageRegistry.addName(runiumOre, "Runium Ore");
		LanguageRegistry.addName(relphitianSoil, "Relphitian Soil");
		LanguageRegistry.addName(relphiteStone, "Relphite Stone");
		LanguageRegistry.addName(relphiteOre, "Relphite Ore");
		LanguageRegistry.addName(relphitePortal, "Relphite Portal");
		LanguageRegistry.addName(relphiteFrame, "Relphite Frame");
		
		
		
		LanguageRegistry.addName(beefStew, "Beef Stew");
	
		LanguageRegistry.addName(adminiumIngot, "Adminium Ingot");
		LanguageRegistry.addName(runiumIngot, "Runium Ingot");
		LanguageRegistry.addName(adminiumSword, "Adminium Sword");
		LanguageRegistry.addName(runiumSword, "Runium Sword");
		LanguageRegistry.addName(relphiteDust, "Relphite Dust");
		}

	{
		GameRegistry.registerWorldGenerator(eventmanager);
	
	}
}
