package TriniumRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRelphitianSoil extends Block{

	@SideOnly(Side.CLIENT)
	private Icon topTexture;
	

	public BlockRelphitianSoil(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public Icon field_94393_a; //Top
	public Icon field_94392_b; //Bottom
	

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(TriniumRPG.modid + ":" + this.getUnlocalizedName().substring(5));
		field_94393_a = par1IconRegister.registerIcon("TriniumRPG:relphitianSoil_Top");
	}	
	
	
	public Icon getIcon(int par1, int
			par2) {
			        return par1 == 0 ?
			this.field_94392_b : (par1 == 1 ?
			this.field_94393_a: this.blockIcon);
			}
	}
	
