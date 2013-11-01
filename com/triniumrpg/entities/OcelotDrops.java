package com.triniumrpg.entities;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class OcelotDrops {

@ForgeSubscribe
public void dropEvent(LivingDeathEvent e){
if(e.entityLiving instanceof EntityOcelot){
e.entityLiving.dropItem(Item.fishRaw.itemID, 10);
}
}
}