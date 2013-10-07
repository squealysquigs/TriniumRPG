package com.triniumrpg.handlers;

import java.io.File;

import com.triniumrpg.lib.IDs;
import com.triniumrpg.lib.Names;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);

		config.load();

		IDs.goldencoin_actual = config.getItem(Names.goldencoin_name, IDs.goldencoin_default).getInt() - 256;		
		IDs.pestle_actual = config.getItem(Names.pestle_name, IDs.pestle_default).getInt() - 256;
		IDs.pestleMortar_actual = config.getItem(Names.pestleMortar_name, IDs.pestleMortar_default).getInt() - 256;
		IDs.softClay_actual = config.getItem(Names.softClay_name, IDs.softClay_default).getInt() - 256;
		IDs.unfPot_actual = config.getItem(Names.unfPot_name, IDs.unfPot_default).getInt() - 256;
		IDs.pot_actual = config.getItem(Names.pot_name, IDs.pot_default).getInt() - 256;
		IDs.flourPot_actual = config.getItem(Names.flourPot_name, IDs.flourPot_default).getInt() - 256;
		IDs.breadDough_actual = config.getItem(Names.breadDough_name, IDs.breadDough_default).getInt() - 256;
		IDs.liquidStone_actual = config.getItem(Names.liquidStone_name, IDs.liquidStone_default).getInt() - 256;
		IDs.hellStone_actual = config.getItem(Names.hellStone_name, IDs.hellStone_default).getInt() - 256;
		IDs.holyStone_actual = config.getItem(Names.holyStone_name, IDs.holyStone_default).getInt() - 256;
		IDs.beefStew_actual = config.getItem(Names.beefStew_name, IDs.beefStew_default).getInt() - 256;
		IDs.adminiumIngot_actual = config.getItem(Names.adminiumIngot_name, IDs.adminiumIngot_default).getInt() - 256;
		IDs.runiumIngot_actual = config.getItem(Names.runiumIngot_name, IDs.runiumIngot_default).getInt() - 256;
		IDs.relphiteDust_actual = config.getItem(Names.relphiteDust_name, IDs.relphiteDust_default).getInt() - 256;
		IDs.adminiumSword_actual = config.getItem(Names.adminiumSword_name, IDs.adminiumSword_default).getInt() - 256;
		IDs.runiumSword_actual = config.getItem(Names.runiumSword_name, IDs.runiumSword_default).getInt() - 256;

		
		IDs.adminiumOre_actual = config.getBlock(Names.adminiumOre_name, IDs.adminiumOre_default).getInt();
		IDs.runiumOre_actual = config.getBlock(Names.runiumOre_name, IDs.runiumOre_default).getInt();
		IDs.relphiteOre_actual = config.getBlock(Names.relphiteOre_name, IDs.relphiteOre_default).getInt();
		IDs.relphiteFrame_actual = config.getBlock(Names.relphiteFrame_name, IDs.relphiteFrame_default).getInt();
		IDs.millStone_actual = config.getBlock(Names.millStone_name, IDs.millStone_default).getInt();
		IDs.flour_actual = config.getBlock(Names.flour_name, IDs.flour_default).getInt();
		config.save();
	}
}