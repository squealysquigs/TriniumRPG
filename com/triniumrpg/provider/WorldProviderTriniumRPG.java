package com.triniumrpg.provider;

import com.triniumrpg.TriniumRPG;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTriniumRPG extends WorldProvider{

	
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.forestHills, 0.4F, 0.5F);
        this.dimensionId = TriniumRPG.dimensionId;
        
	}
	
	
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderRelphite(worldObj, worldObj.getSeed(), true);
	}
	
	
	
	
	@Override
	public String getDimensionName() 
	{
			
	return "Relphite";

	}
	
}
