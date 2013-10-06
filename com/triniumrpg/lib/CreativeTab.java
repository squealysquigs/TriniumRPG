package com.triniumrpg.lib;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTab extends CreativeTabs {
	public CreativeTab(int id, String name) {
		super(id, name);
	}

	@Override
	public int getTabIconItemIndex() {
		return Block.sapling.blockID;
	}
}