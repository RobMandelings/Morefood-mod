package net.morefood.mod.food;

import net.minecraft.item.ItemFood;

public class Speed extends ItemFood {
	public Speed(int i, float f, boolean b) {
		super(i, b);
		
		this.setPotionEffect(1, 5, 0, 1f);
	}
}
