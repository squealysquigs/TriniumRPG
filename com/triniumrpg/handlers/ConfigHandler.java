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

		//IDs.smithinganvil_actual = config.getBlock(Names.smithinganvil_name, IDs.smithinganvil_default).getInt();

		config.save();
	}
}