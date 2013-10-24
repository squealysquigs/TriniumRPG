package com.triniumrpg.lib;

import com.triniumrpg.blocks.Blocks;
import com.triniumrpg.items.Items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTab extends CreativeTabs {
	public CreativeTab(int id, String name) {
		super(id, name);
	}

	@Override
	public int getTabIconItemIndex() {
		return Blocks.relphiteFrame.blockID;
	}
}