package net.morefood.mod.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Stew extends ItemFood {

	public Stew(int i, float f, boolean b) {
		super(i, b);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setTextureName("Morefood:Vegetablesoup");
		this.setUnlocalizedName("Vegetable_Soup");
	}
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Items.bowl);

    }
}
