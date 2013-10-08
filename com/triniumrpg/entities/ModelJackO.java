package com.triniumrpg.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJackO extends ModelBase
{
    ModelRenderer Base;
  
  public ModelJackO()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 16, 16, 16);
      Base.setRotationPoint(-8F, 8F, -8F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
  }
  
  /**
   * Sets the models various rotation angles then renders the model.
   */
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
      this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
      this.Base.render(par7);
  }

}
