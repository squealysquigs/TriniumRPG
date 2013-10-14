package com.triniumrpg.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderFox extends RenderLiving {

	public RenderFox(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((ModelFox) mainModel);
	}
    private static final ResourceLocation pigTextures = new ResourceLocation("triniumrpg:textures/entity/Fox.png");

	protected ModelFox model;

	public void renderThisMob(EntityFox par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		super.doRenderLiving(par1Entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2,
			double par4, double par6, float par8, float par9) {
		renderThisMob((EntityFox) par1EntityLiving, par2, par4, par6, par8,
				par9);
		
		
		
	}

	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		renderThisMob((EntityFox) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return getFoxTextures((EntityFox)par1Entity);
    }

	private ResourceLocation getFoxTextures(EntityFox par1Entity) {
        return pigTextures;
	}
}