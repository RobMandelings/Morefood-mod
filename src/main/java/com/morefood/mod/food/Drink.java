package com.morefood.mod.food;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Drink extends ItemFood {

	public Drink(int i, float f, boolean b) {
		super(i, b);
	}
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
    return EnumAction.drink;
    }
}
