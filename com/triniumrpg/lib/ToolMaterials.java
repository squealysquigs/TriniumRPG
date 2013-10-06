package com.triniumrpg.lib;

import net.minecraft.item.EnumToolMaterial;

public class ToolMaterials {

	public static EnumToolMaterial ADMINIUMSWORD;
	public static EnumToolMaterial ADMINIUMPICKAXE;
	public static EnumToolMaterial RUNIUMSWORD;
	public static EnumToolMaterial RUNIUMPICKAXE;
	public static EnumToolMaterial ADMINIUMAXE;
	public static EnumToolMaterial ADMINIUMSHOVEL;
	public static EnumToolMaterial ADMINIUMHOE;
	public static EnumToolMaterial RUNIUMAXE;
	public static EnumToolMaterial RUNIUMSHOVEL;

	public static void init() {
	    ADMINIUMSWORD = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMSWORD", 2, 2000, 2F, 8, 14);
		
		ADMINIUMPICKAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMPICKAXE", 5, 2000, 5F, 4, 14);
		
		RUNIUMSWORD = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMSWORD", 2, 2500, 2F, 10, 14);
		
		RUNIUMPICKAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMPICKAXE", 7, 2500, 6F, 4, 14);
		
		ADMINIUMAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMAXE", 5, 2000, 6F, 4, 14);
		
		ADMINIUMSHOVEL = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMSHOVEL", 5, 2000, 5F, 5, 14);
		
		ADMINIUMHOE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMHOE", 5, 2000, 5F, 5, 14);
		
		RUNIUMAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMAXE", 5, 2500, 6F, 5, 14);
		
		RUNIUMSHOVEL = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMSHOVEL", 5, 2500, 6F, 3, 14);
		
	    /*
	     * WOOD(0, 59, 2.0F, 0.0F, 15),
	     * STONE(1, 131, 4.0F, 1.0F, 5),
	     * IRON(2, 250, 6.0F, 2.0F, 14),
	     * EMERALD(3, 1561, 8.0F, 3.0F, 10),   
	     * GOLD(0, 32, 12.0F, 0.0F, 22);   
	     */
	}
}
