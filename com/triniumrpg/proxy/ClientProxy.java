package com.triniumrpg.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;

import com.triniumrpg.entities.EntitySoundEvents;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initRenderers() {
	}

	@Override
	public void initSounds(){
	}
	
	@ForgeSubscribe
	public void registerSounds()
	{
	MinecraftForge.EVENT_BUS.register(new EntitySoundEvents());
	}
	
	

	}


	