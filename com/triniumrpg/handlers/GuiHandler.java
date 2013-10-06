package com.triniumrpg.handlers;

import com.triniumrpg.TriniumRPG;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {
	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(TriniumRPG.instance, this);
	}

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,	int x, int y, int z) {
			return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
	}
}