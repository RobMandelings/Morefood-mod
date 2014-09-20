package com.morefood.mod.food;

import net.minecraft.item.ItemFood;

public class GrapeSpeed extends ItemFood {
	public GrapeSpeed(int i, float f, boolean b) {
		super(i, b);
		
		this.setPotionEffect(1, 3, 0, 1f);
	}
}
