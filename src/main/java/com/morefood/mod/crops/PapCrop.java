package com.morefood.mod.crops;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import com.morefood.mod.Morefood;

public class PapCrop extends BlockCrops {
	
	public static double rand;
	public Random r = new Random();
	
	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.iconArray = new IIcon[6];
		
		for(int i = 0; i < this.iconArray.length; i++) {
			this.iconArray[i] = iconRegister.registerIcon(Morefood.modid + ":" + this.getUnlocalizedName().substring(5) + (i + 1));
		}
	}
	
	public IIcon getIcon(int side, int metadata) {
		if (metadata < 7){
			if (metadata == 6 ) {
				metadata = 5;
			}
			
			return this.iconArray[metadata >> 1];
		}
		
		return this.iconArray[5];
	}
	
	public int quantityDropped (Random random) {
		return 2+r.nextInt(3);
	}
	
	protected Item func_149866_i() {
		return null;
	}
	
	protected Item func_149865_P() {
		return Morefood.cropPaprika;
	}
}
