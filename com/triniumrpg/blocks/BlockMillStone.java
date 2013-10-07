package com.triniumrpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import com.triniumrpg.lib.ModInfo;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.dispenser.IRegistry;
import net.minecraft.dispenser.PositionImpl;
import net.minecraft.dispenser.RegistryDefaulted;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockMillStone extends BlockContainer
{
    /** Registry for all dispense behaviors. */
    public static final IRegistry dispenseBehaviorRegistry = new RegistryDefaulted(new BehaviorDefaultDispenseItem());
    protected Random random = new Random();
    @SideOnly(Side.CLIENT)
    protected Icon furnaceTopIcon;
    @SideOnly(Side.CLIENT)
    protected Icon furnaceFrontIcon;
    @SideOnly(Side.CLIENT)
    protected Icon field_96473_e;

    protected BlockMillStone(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(World par1World)
    {
        return 4;
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModInfo.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityDispenser tileentitydispenser = (TileEntityDispenser)par1World.getBlockTileEntity(par2, par3, par4);

            if (tileentitydispenser != null)
            {
                par5EntityPlayer.displayGUIDispenser(tileentitydispenser);
            }

            return true;
        }
    }

    protected void dispense(World par1World, int par2, int par3, int par4)
    {
        BlockSourceImpl blocksourceimpl = new BlockSourceImpl(par1World, par2, par3, par4);
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)blocksourceimpl.getBlockTileEntity();

        if (tileentitydispenser != null)
        {
            int l = tileentitydispenser.getRandomStackFromInventory();

            if (l < 0)
            {
                par1World.playAuxSFX(1001, par2, par3, par4, 0);
            }
            else
            {
                ItemStack itemstack = tileentitydispenser.getStackInSlot(l);

                if (itemstack.isItemEqual(new ItemStack(Item.wheat)))
                {
                    tileentitydispenser.setInventorySlotContents(l, new ItemStack(Item.wheat, itemstack.stackSize - 1));
                    par1World.setBlock(par2, par3 - 1, par4, Blocks.flour.blockID);
                }
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        boolean flag = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4) || par1World.isBlockIndirectlyGettingPowered(par2, par3 + 1, par4);
        int i1 = par1World.getBlockMetadata(par2, par3, par4);
        boolean flag1 = (i1 & 8) != 0;

        if (flag && !flag1)
        {
            par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
            par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 | 8, 4);
        }
        else if (!flag && flag1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 & -9, 4);
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            this.dispense(par1World, par2, par3, par4);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityDispenser();
    }

    /**
     * Called on server worlds only when the block has been replaced by a different block ID, or the same block with a
     * different metadata value, but before the new metadata value is set. Args: World, x, y, z, old block ID, old
     * metadata
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)par1World.getBlockTileEntity(par2, par3, par4);

        if (tileentitydispenser != null)
        {
            for (int j1 = 0; j1 < tileentitydispenser.getSizeInventory(); ++j1)
            {
                ItemStack itemstack = tileentitydispenser.getStackInSlot(j1);

                if (itemstack != null)
                {
                    float f = this.random.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                    float f2 = this.random.nextFloat() * 0.8F + 0.1F;

                    while (itemstack.stackSize > 0)
                    {
                        int k1 = this.random.nextInt(21) + 10;

                        if (k1 > itemstack.stackSize)
                        {
                            k1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= k1;
                        EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.itemID, k1, itemstack.getItemDamage()));

                        if (itemstack.hasTagCompound())
                        {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }

                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
                        par1World.spawnEntityInWorld(entityitem);
                    }
                }
            }

            par1World.func_96440_m(par2, par3, par4, par5);
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory((IInventory)par1World.getBlockTileEntity(par2, par3, par4));
    }
}
