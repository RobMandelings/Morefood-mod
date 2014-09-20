package net.morefood.mod.mobdrop;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraft.entity.EntityLiving;
import net.morefood.mod.Morefood;

public class SquidDrops {

          public static double rand;
          public Random r = new Random();

          @SubscribeEvent
          public void onEntityDrop(LivingDropsEvent event) {
        	  if(event.entityLiving instanceof EntitySquid) {
        		  event.entityLiving.dropItem(Morefood.foodRawSquid, 1+r.nextInt(3));
        	  }
          }
                  
}