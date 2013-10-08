package com.triniumrpg.entities;

import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityJackO extends EntitySlime {

	private String texture;
	private float moveSpeed;

	public EntityJackO(World world) {
		super(world);
		this.moveSpeed = 1.0F;
		this.setSize(1.0F, 0.5F);
		// AI
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIWatchClosest(this,
				EntityPlayer.class, 6.0F));
		this.tasks.addTask(2, new EntityAILookIdle(this));

		this.texture = "/mods/YOURMODID/textures/mobs/YOURMOBTEXTURE.png";
	}

	public boolean isAIEnabled() {
		return true;
	}

	public String getTexture() {
		return texture;
	}

	// protected String getLivingSound() { return "mob.cow.say"; }
	// protected String getHurtSound() { return "mob.cow.hurt"; }
	protected String getDeathSound() {
		return "mob.cow.hurt";
	}
}