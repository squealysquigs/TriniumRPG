package com.triniumrpg.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderJackO extends RenderLiving {

	public RenderJackO(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((ModelJackO) mainModel);
	}
    private static final ResourceLocation pigTextures = new ResourceLocation("triniumrpg:textures/entity/JackO.png");

	protected ModelJackO model;

	public void renderThisMob(EntityJackO entity, double par2, double par4,
			double par6, float par8, float par9) {
		super.doRenderLiving(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2,
			double par4, double par6, float par8, float par9) {
		renderThisMob((EntityJackO) par1EntityLiving, par2, par4, par6, par8,
				par9);
	}

	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		renderThisMob((EntityJackO) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return getJackOTextures((EntityJackO)par1Entity);
    }

	private ResourceLocation getJackOTextures(EntityJackO par1Entity) {
        return pigTextures;
	}
}