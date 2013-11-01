package com.triniumrpg.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.triniumrpg.TriniumRPG;
import com.triniumrpg.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TriniumFireballStaff extends ItemSword{
	public TriniumFireballStaff(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(TriniumRPG.tabTrinium);
		this.setMaxDamage(10000);
		
		
		}
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
		}
		{
  }
 
		public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
        {
                {
                        var1.getMaxDamage();
                        var1.damageItem(damageItem(1), var3);
                }
				Vec3 vec3 = var3.getLook(1.0F);
                double d8 = 4.0D;
                EntityLargeFireball entitylargefireball = new EntityLargeFireball(var2, var3.posX + vec3.xCoord * d8, var3.posY, var3.posZ + vec3.zCoord * d8, vec3.xCoord, vec3.yCoord, vec3.zCoord);
                var2.spawnEntityInWorld(entitylargefireball);
				return var1;
                
        }
						

		
		
						
private int damageItem(int i) {
			// TODO Auto-generated method stub
			return 1;
		}
{
		}
}


