package com.triniumrpg.entities;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.common.MinecraftForge;

public class EntitySoundEvents { 
	
	@ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
                    event.manager.addSound("triniumrpg:sound/foxdeath.ogg");  
                    event.manager.addSound("triniumrpg:foxhurt.ogg");
                    event.manager.addSound("triniumrpg:foxangry.ogg");  
                    
                    
    }
	
	
	
	
	
	

}
	
