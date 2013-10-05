package TriniumRPG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemAdminiumSword extends ItemSword{

	public ItemAdminiumSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
		}
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon(TriniumRPG.modid + ":" + this.getUnlocalizedName().substring(5));
		}
		
}
