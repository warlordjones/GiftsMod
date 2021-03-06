package gifts.common.blocks;

import gifts.common.WeightedRandomGift;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPresent extends Block
{
	public BlockPresent(Material p_i45394_1_)
	{
		super(p_i45394_1_);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int meta)
	{
		player.inventory.addItemStackToInventory(WeightedRandomGift.getWeightedRandomItemStack());
		// super.harvestBlock(world, player, x, y, z, meta);
	}

	@Override
	public int quantityDropped(Random p_149745_1_)
	{
		return 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("giftsmod:blockPresent");
	}

}
