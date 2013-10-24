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
	    ADMINIUMSWORD = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMSWORD", 3, 2000, 8F, 4, 9);
				
		RUNIUMSWORD = net.minecraftforge.common.EnumHelper.addToolMaterial("RUNIUMSWORD", 5, 2500, 10F, 5, 12);
		
		ADMINIUMPICKAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMPICKAXE", 3, 2500, 10F, 5, 14);
		ADMINIUMAXE = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMAXE", 3, 2500, 10F, 5, 14);
		ADMINIUMSHOVEL = net.minecraftforge.common.EnumHelper.addToolMaterial("ADMINIUMSHOVEL", 3, 2500, 10F, 5, 14);
		
		
	    /*
	     * WOOD(0, 59, 2.0F, 0.0F, 15),
	     * STONE(1, 131, 4.0F, 1.0F, 5),
	     * IRON(2, 250, 6.0F, 2.0F, 14),
	     * EMERALD(3, 1561, 8.0F, 3.0F, 10),   
	     * GOLD(0, 32, 12.0F, 0.0F, 22);   
	     */
	}
}
