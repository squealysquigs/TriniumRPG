package com.triniumrpg.handlers;

import java.util.Random;

import com.triniumrpg.TriniumRPG;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator
{
       public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
       {
             switch(world.provider.dimensionId)
             {
                    case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
                    case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
                    case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
             }
       }
      
       private void generateEnd(World world, Random random, int x, int z)
       {
            
       }

       private void generateSurface(World world, Random random, int i, int j) {
           for (int a = 0; a < 6; a++) {
               int randPosX = i + random.nextInt(16);
               int randPosY = random.nextInt(16);
               int randPosZ = j + random.nextInt(16);
               
               new WorldGenMinable(TriniumRPG.adminiumOre.blockID, 4)
               .generate(world, random, randPosX, randPosY, randPosZ);
               
               new WorldGenMinable(TriniumRPG.runiumOre.blockID, 4)
               .generate(world, random, randPosX, randPosY, randPosZ);
               
               new WorldGenMinable(TriniumRPG.relphiteOre.blockID, 1)
               .generate(world, random, randPosX, randPosY, randPosZ);
               
           }
		
		
	}

	private void generateNether(World world, Random random, int x, int z)
       {
            
       }
	
	private void generateRelphite(World world, Random random, int i, int j)
	{
		int randPosX = i + random.nextInt(16);
        int randPosY = random.nextInt(16);
        int randPosZ = j + random.nextInt(16);
        
		new WorldGenMinable(TriniumRPG.adminiumOre.blockID, 7)
		.generate(world, random, randPosX, randPosY, randPosZ);
		
		new WorldGenMinable(TriniumRPG.runiumOre.blockID, 8)
		.generate(world, random, randPosX, randPosY, randPosZ);
	}
	
	

}
