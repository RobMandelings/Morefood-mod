package com.morefood.mod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import com.morefood.mod.cakes.AppleCake;
import com.morefood.mod.cakes.BlueberryCake;
import com.morefood.mod.cakes.CaramelCake;
import com.morefood.mod.cakes.ChocolateCake;
import com.morefood.mod.cakes.StrawberryCake;
import com.morefood.mod.crops.AspCrop;
import com.morefood.mod.crops.BlueCrop;
import com.morefood.mod.crops.PapCrop;
import com.morefood.mod.crops.StrawCrop;
import com.morefood.mod.crops.TomCrop;
import com.morefood.mod.crops.UniCrop;
import com.morefood.mod.food.Drink;
import com.morefood.mod.food.GrapeSpeed;
import com.morefood.mod.food.GrapeSpeed2;
import com.morefood.mod.food.Soup;
import com.morefood.mod.food.Speed;
import com.morefood.mod.food.Stew;
import com.morefood.mod.mobdrop.SheepDrops;
import com.morefood.mod.mobdrop.SquidDrops;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@Mod(modid = Morefood.modid, version = Morefood.version)
public class Morefood {
	
	public static final String modid = "Morefood";
	public static final String version = "Alpha v4.0";
	
	public static CreativeTabs morefoodTab;
	
	@Instance(modid)
	public static Morefood instance;
	//Cakes
	public static Block blockChocolateCake;
	public static Block blockStrawberryCake;
	public static Block blockBlueberryCake;
	public static Block blockAppleCake;
	public static Block blockCaramelCake;
	
	public static Item itemChocolateCake;
	public static Item itemStrawberryCake;
	public static Item itemBlueberryCake;
	public static Item itemAppleCake;
	public static Item itemCaramelCake;
	//Items
	public static Item itemSushiCone;
	public static Item itemNoriLeave;
	//Food
	public static Item foodBreadslice;
	public static Item foodToast;
	public static Item foodCheeseToast;
	public static Item foodCroqueMadame;
	public static Item foodBruschetta;
	public static Item foodStrawberryToast;
	public static Item foodBlueberryToast;
	public static Item foodButterToast;
	public static Item foodCandy;
	public static Item foodApplePie;
	public static Item foodStrawberryPie;
	public static Item foodBlueberryPie;
	public static Item foodChocolatePie;
	public static Item foodDarkChocolate;
	public static Item foodChocolate;
	public static Item foodChocolateBar;
	public static Item foodChocolateMilk;
	public static Item foodHotChocolate;
	public static Item foodMilkBowl;
	public static Item foodHotMilk;
	public static Item foodIceCreamCone;
	public static Item foodIceCream;
	public static Item foodAppleIceCream;
	public static Item foodMelonIceCream;
	public static Item foodStrawberryIceCream;
	public static Item foodBlueberryIceCream;
	public static Item foodChocolateIceCream;
	public static Item foodCaramelIceCream;
    public static Item foodAppleIceCreamWithChocolateSauce;
    public static Item foodMelonIceCreamWithChocolateSauce;
    public static Item foodStrawberryIceCreamWithChocolateSauce;
    public static Item foodBlueberryIceCreamWithChocolateSauce;
	public static Item foodCheese;
	public static Item foodFriedEgg;
	public static Item foodSushi;
	public static Item foodVegetableSoup;
	public static Item foodHotVegetableSoup;
	public static Item foodCarrotSoup;
	public static Item foodHotCarrotSoup;
	public static Item foodTomatoSoup;
	public static Item foodHotTomatoSoup;
	public static Item foodPaprikaSoup;
	public static Item foodHotPaprikaSoup;
	public static Item foodOnionSoup;
	public static Item foodHotOnionSoup;
    public static Item foodAsparagusSoup;
    public static Item foodHotAsparagusSoup;
	public static Item foodBeefStew;
	public static Item foodPorkStew;
	public static Item foodStuffedFish;
	public static Item foodStuffedSalmon;
	public static Item foodChocolateCookie;
	public static Item foodStrawberryCookie;
	public static Item foodBlueberryCookie;
	public static Item foodCaramelCookie;
	public static Item foodAppleCookie;
	public static Item foodSugarCookie;
	public static Item foodButterCookie;
	public static Item foodDriedTomato;
	public static Item foodBakedPaprika;
	public static Item foodBakedOnionSlice;
	public static Item foodBakedAsparagus;
	public static Item foodButteredAsparagus;
	public static Item foodPaprikaSlice;
	public static Item foodPaprikaEggSlice;
	public static Item foodTomatoSlice;
	public static Item foodOnionSlice;
	public static Item foodGrapeSugar;
	public static Item foodStrongGrapeSugar;
	public static Item foodCaramel;
	public static Item foodCaramelizedApple;
	public static Item foodRawMutton;
	public static Item foodCookedMutton;
	public static Item foodRawSquid;
	public static Item foodFriedCalamari;
	public static Item foodButter;
	//Crops
	    //Strawberry
	public static Item cropStrawberrySeeds;
	public static Item cropStrawberry;
	public static Block cropStrawberryPlant;
	    //Tomato
	public static Item cropTomato;
	public static Block cropTomatoPlant;
	    //BlueBerry
	public static Item cropBlueberrySeeds;
	public static Item cropBlueberry;
	public static Block cropBlueberryPlant;
        //Asparagus
	public static Item cropRawAsparagusSeeds;
	public static Item cropRawAsparagus;
	public static Block cropAsparagusPlant;
	    //Paprika
	public static Item cropPaprika;
	public static Block cropPaprikaPlant;
	    //Onion
	public static Item cropRawOnion;
	public static Block cropOnionPlant;
	//Tree's
		//Orange
	public static Item leafOrange;
	public static Item foodOrange;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		morefoodTab = new CreativeTabs("morefood") {
			@Override
		    @SideOnly(Side.CLIENT)
		    public Item getTabIconItem() {
		        return Morefood.foodTomatoSoup;
		    }
		};
		
	//Cake's
		blockChocolateCake = new ChocolateCake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("ChocolateCake");
		blockStrawberryCake = new StrawberryCake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("StrawberryCake");
		blockBlueberryCake = new BlueberryCake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("BlueberryCake");
		blockAppleCake = new AppleCake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("AppleCake");
		blockCaramelCake = new CaramelCake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("CaramelCake");
		
		itemChocolateCake = new ItemReed(Morefood.blockChocolateCake).setUnlocalizedName("itemChocolateCake").setTextureName(modid + ":ChocolateCake").setCreativeTab(Morefood.morefoodTab);
		itemStrawberryCake = new ItemReed(Morefood.blockStrawberryCake).setUnlocalizedName("itemStrawberryCake").setTextureName(modid + ":StrawberryCake").setCreativeTab(Morefood.morefoodTab);
		itemBlueberryCake = new ItemReed(Morefood.blockBlueberryCake).setUnlocalizedName("itemBlueberryCake").setTextureName(modid + ":BlueberryCake").setCreativeTab(Morefood.morefoodTab);
		itemAppleCake = new ItemReed(Morefood.blockAppleCake).setUnlocalizedName("itemAppleCake").setTextureName(modid + ":AppleCake").setCreativeTab(Morefood.morefoodTab);
		itemCaramelCake = new ItemReed(Morefood.blockCaramelCake).setUnlocalizedName("itemCaramelCake").setTextureName(modid + ":CaramelCake").setCreativeTab(Morefood.morefoodTab);
	//Items
		itemSushiCone = new Item().setUnlocalizedName("SushiCone").setTextureName(modid + ":SushiCone").setCreativeTab(Morefood.morefoodTab);
		itemNoriLeave = new Item().setUnlocalizedName("NoriLeave").setTextureName(modid + ":NoriLeave").setCreativeTab(Morefood.morefoodTab);
	//Food
		foodDarkChocolate = new ItemFood(1, 0.2F, false).setUnlocalizedName("DarkChocolate").setTextureName(modid + ":DarkChocolate").setCreativeTab(Morefood.morefoodTab);
		foodChocolate = new ItemFood(4, 0.3F, false).setUnlocalizedName("Chocolate").setTextureName(modid + ":Chocolate").setCreativeTab(Morefood.morefoodTab);
		foodChocolateBar = new Speed(10, 1.0F, false).setUnlocalizedName("ChocolateBar").setTextureName(modid + ":ChocolateBar").setCreativeTab(Morefood.morefoodTab);		
		foodChocolateCookie = new ItemFood(3, 0.2F, false).setUnlocalizedName("ChocolateCookie").setTextureName(modid + ":ChocolateCookie").setCreativeTab(Morefood.morefoodTab);
		foodBreadslice = new ItemFood(1, 1.2F, false).setUnlocalizedName("Breadslice").setTextureName(modid + ":Breadslice").setCreativeTab(Morefood.morefoodTab);
		foodToast = new ItemFood(4, 1.0F, false).setUnlocalizedName("Toast").setTextureName(modid + ":Toast").setCreativeTab(Morefood.morefoodTab);
		foodCheeseToast = new ItemFood(7, 1.3F, false).setUnlocalizedName("CheeseToast").setTextureName(modid + ":CheeseToast").setCreativeTab(Morefood.morefoodTab);
		foodBruschetta = new ItemFood(7, 1.3F, false).setUnlocalizedName("Bruschetta").setTextureName(modid + ":Bruschetta").setCreativeTab(Morefood.morefoodTab);   
		foodCroqueMadame = new ItemFood(10, 1.5F, false).setUnlocalizedName("CroqueMadame").setTextureName(modid + ":CroqueMadame").setCreativeTab(Morefood.morefoodTab);
		foodStrawberryToast = new ItemFood(7, 1.0F, false).setUnlocalizedName("StrawberryToast").setTextureName(modid + ":StrawberryToast").setCreativeTab(Morefood.morefoodTab);
		foodBlueberryToast = new ItemFood(7, 1.0F, false).setUnlocalizedName("BlueberryToast").setTextureName(modid + ":BlueberryToast").setCreativeTab(Morefood.morefoodTab);
		foodButterToast = new ItemFood(7, 1.0F, false).setUnlocalizedName("ButterToast").setTextureName(modid + ":ButterToast").setCreativeTab(Morefood.morefoodTab);
		foodApplePie = new ItemFood(8, 0.6F, false).setUnlocalizedName("ApplePie").setTextureName(modid + ":ApplePie").setCreativeTab(Morefood.morefoodTab);
		foodStrawberryPie = new ItemFood(8, 0.6F, false).setUnlocalizedName("StrawberryPie").setTextureName(modid + ":StrawberryPie").setCreativeTab(Morefood.morefoodTab);
		foodFriedEgg = new ItemFood(4, 0.4F, false).setUnlocalizedName("FriedEgg").setTextureName(modid + ":FriedEgg").setCreativeTab(Morefood.morefoodTab);
		foodCheese = new ItemFood(2, 0.1F, false).setUnlocalizedName("Cheese").setTextureName(modid + ":Cheese").setCreativeTab(Morefood.morefoodTab);
		foodCandy = new ItemFood(2, 0.8F, false).setUnlocalizedName("Candy").setTextureName(modid + ":Candy").setCreativeTab(Morefood.morefoodTab);
		foodSushi = new ItemFood(4, 0.6F, false).setUnlocalizedName("Sushi").setTextureName(modid + ":Sushi").setCreativeTab(Morefood.morefoodTab);
		foodIceCreamCone = new ItemFood(1, 0.1F, false).setUnlocalizedName("IceCreamCone").setTextureName(modid + ":IceCreamCone").setCreativeTab(Morefood.morefoodTab);
        foodIceCream = new Drink(2, 0.1F, false).setUnlocalizedName("IceCream").setTextureName(modid + ":IceCream").setCreativeTab(Morefood.morefoodTab);
		foodAppleIceCream = new Drink(6, 0.2F, false).setUnlocalizedName("AppleIceCream").setTextureName(modid + ":AppleIceCream").setCreativeTab(Morefood.morefoodTab);
        foodMelonIceCream = new Drink(6, 0.2F, false).setUnlocalizedName("MelonIceCream").setTextureName(modid + ":MelonIceCream").setCreativeTab(Morefood.morefoodTab);
		foodStrawberryIceCream = new Drink(6, 0.2F, false).setUnlocalizedName("StrawberryIceCream").setTextureName(modid + ":StrawberryIceCream").setCreativeTab(Morefood.morefoodTab);
		foodChocolateIceCream = new Drink(6, 0.2F, false).setUnlocalizedName("ChocolateIceCream").setTextureName(modid + ":ChocolateIceCream").setCreativeTab(Morefood.morefoodTab);
        foodBlueberryIceCream = new Drink(6, 0.2F, false).setUnlocalizedName("BlueberryIceCream").setTextureName(modid + ":BlueberryIceCream").setCreativeTab(Morefood.morefoodTab);
        foodCaramelIceCream = new Drink(6, 0.2F, false).setUnlocalizedName("CaramelIceCream").setTextureName(modid + ":CaramelIceCream").setCreativeTab(Morefood.morefoodTab);
        foodAppleIceCreamWithChocolateSauce = new Drink(12, 0.3F, false).setUnlocalizedName("AppleIceCreamWithChocolateSauce").setTextureName(modid + ":AppleIceCreamWithChocolateSauce").setCreativeTab(Morefood.morefoodTab);
        foodMelonIceCreamWithChocolateSauce = new Drink(12, 0.3F, false).setUnlocalizedName("MelonIceCreamWithChocolateSauce").setTextureName(modid + ":MelonIceCreamWithChocolateSauce").setCreativeTab(Morefood.morefoodTab);
        foodStrawberryIceCreamWithChocolateSauce = new Drink(12, 0.3F, false).setUnlocalizedName("StrawberryIceCreamWithChocolateSauce").setTextureName(modid + ":StrawberryIceCreamWithChocolateSauce").setCreativeTab(Morefood.morefoodTab);
        foodBlueberryIceCreamWithChocolateSauce = new Drink(12, 0.3F, false).setUnlocalizedName("BlueberryIceCreamWithChocolateSauce").setTextureName(modid + ":BlueberryIceCreamWithChocolateSauce").setCreativeTab(Morefood.morefoodTab);
        foodVegetableSoup = new Soup(8, 0.6F, false).setUnlocalizedName("VegetableSoup").setTextureName(modid + ":VegetableSoup").setCreativeTab(Morefood.morefoodTab);
		foodHotVegetableSoup = new Soup(14, 1.2F, false).setUnlocalizedName("HotVegetableSoup").setTextureName(modid + ":HotVegetableSoup").setCreativeTab(Morefood.morefoodTab);
		foodCarrotSoup = new Soup(6, 0.6F, false).setUnlocalizedName("CarrotSoup").setTextureName(modid + ":CarrotSoup").setCreativeTab(Morefood.morefoodTab);
		foodHotCarrotSoup = new Soup(12, 1.0F, false).setUnlocalizedName("HotCarrotSoup").setTextureName(modid + ":HotCarrotSoup").setCreativeTab(Morefood.morefoodTab);
		foodTomatoSoup = new Soup(6, 0.6F, false).setUnlocalizedName("TomatoSoup").setTextureName(modid + ":TomatoSoup").setCreativeTab(Morefood.morefoodTab);
		foodHotTomatoSoup = new Soup(12, 1.0F, false).setUnlocalizedName("HotTomatoSoup").setTextureName(modid + ":HotTomatoSoup").setCreativeTab(Morefood.morefoodTab);
		foodPaprikaSoup = new Soup(6, 0.6F, false).setUnlocalizedName("PaprikaSoup").setTextureName(modid + ":PaprikaSoup").setCreativeTab(Morefood.morefoodTab);
		foodHotPaprikaSoup = new Soup(12, 1.0F, false).setUnlocalizedName("HotPaprikaSoup").setTextureName(modid + ":HotPaprikaSoup").setCreativeTab(Morefood.morefoodTab);
		foodOnionSoup = new Soup(6, 0.6F, false).setUnlocalizedName("OnionSoup").setTextureName(modid + ":OnionSoup").setCreativeTab(Morefood.morefoodTab);
		foodHotOnionSoup = new Soup(12, 1.0F, false).setUnlocalizedName("HotOnionSoup").setTextureName(modid + ":HotOnionSoup").setCreativeTab(Morefood.morefoodTab);
		foodAsparagusSoup = new Soup(4, 0.5F, false).setUnlocalizedName("AsparagusSoup").setTextureName(modid + ":AsparagusSoup").setCreativeTab(Morefood.morefoodTab);
		foodHotAsparagusSoup = new Soup(12, 1.0F, false).setUnlocalizedName("HotAsparagusSoup").setTextureName(modid + ":HotAsparagusSoup").setCreativeTab(Morefood.morefoodTab);
		foodBeefStew = new Stew(10, 1.8F, false).setUnlocalizedName("BeefStew").setTextureName(modid + ":BeefStew").setCreativeTab(Morefood.morefoodTab);
		foodPorkStew = new Stew(10, 1.8F, false).setUnlocalizedName("PorkStew").setTextureName(modid + ":PorkStew").setCreativeTab(Morefood.morefoodTab);
		foodStuffedFish = new ItemFood(8, 1.2F, false).setUnlocalizedName("StuffedFish").setTextureName(modid + ":StuffedFish").setCreativeTab(Morefood.morefoodTab);
		foodStuffedSalmon = new ItemFood(8, 1.2F, false).setUnlocalizedName("StuffedSalmon").setTextureName(modid + ":StuffedSalmon").setCreativeTab(Morefood.morefoodTab);
		foodChocolateMilk = new Soup(6, 1.0F, false).setUnlocalizedName("ChocolateMilk").setTextureName(modid + ":ChocolateMilk").setCreativeTab(Morefood.morefoodTab);
		foodHotChocolate = new Soup(10, 1.5F, false).setUnlocalizedName("HotChocolate").setTextureName(modid + ":WarmedChocolateMilk").setCreativeTab(Morefood.morefoodTab);
		foodMilkBowl = new Soup(4, 0.6F, false).setUnlocalizedName("MilkBowl").setTextureName(modid + ":MilkBowl").setCreativeTab(Morefood.morefoodTab);
		foodHotMilk = new Soup(8, 1.0F, false).setUnlocalizedName("HotMilk").setTextureName(modid + ":HotMilk").setCreativeTab(Morefood.morefoodTab);
		foodStrawberryCookie = new ItemFood(2, 0.2F, false).setUnlocalizedName("StrawberryCookie").setTextureName(modid + ":StrawberryCookie").setCreativeTab(Morefood.morefoodTab);
		foodBlueberryCookie = new ItemFood(2, 0.2F, false).setUnlocalizedName("BlueberryCookie").setTextureName(modid + ":BlueberryCookie").setCreativeTab(Morefood.morefoodTab);
        foodAppleCookie = new ItemFood(2, 0.2F, false).setUnlocalizedName("AppleCookie").setTextureName(modid + ":AppleCookie").setCreativeTab(Morefood.morefoodTab);
		foodSugarCookie = new ItemFood(1, 0.4F, false).setUnlocalizedName("SugarCookie").setTextureName(modid + ":SugarCookie").setCreativeTab(Morefood.morefoodTab);
        foodButterCookie = new ItemFood(1, 0.2F, false).setUnlocalizedName("ButterCookie").setTextureName(modid + ":ButterCookie").setCreativeTab(Morefood.morefoodTab);
		foodBlueberryPie = new ItemFood(8, 0.6F, false).setUnlocalizedName("BlueberryPie").setTextureName(modid + ":BlueberryPie").setCreativeTab(Morefood.morefoodTab);
		foodDriedTomato = new ItemFood(6, 0.5F, false).setUnlocalizedName("DriedTomato").setTextureName(modid + ":DriedTomato").setCreativeTab(Morefood.morefoodTab);
		foodBakedPaprika = new ItemFood(6, 0.7F, false).setUnlocalizedName("BakedPaprika").setTextureName(modid + ":BakedPaprika").setCreativeTab(Morefood.morefoodTab);
		foodBakedOnionSlice = new ItemFood(5, 0.7F, false).setUnlocalizedName("BakedOnionSlice").setTextureName(modid + ":BakedOnionSlice").setCreativeTab(Morefood.morefoodTab);
		foodBakedAsparagus = new ItemFood(5, 0.7F, false).setUnlocalizedName("BakedAsparagus").setTextureName(modid + ":BakedAsparagus").setCreativeTab(Morefood.morefoodTab);
		foodButteredAsparagus = new ItemFood(10, 1.0F, false).setUnlocalizedName("ButteredAsparagus").setTextureName(modid + ":ButteredAsparagus").setCreativeTab(Morefood.morefoodTab);
		foodTomatoSlice = new ItemFood(1, 0.8F, false).setUnlocalizedName("TomatoSlice").setTextureName(modid + ":TomatoSlice").setCreativeTab(Morefood.morefoodTab);
		foodOnionSlice = new ItemFood(1, 0.8F, false).setUnlocalizedName("OnionSlice").setTextureName(modid + ":OnionSlice").setCreativeTab(Morefood.morefoodTab);
		foodCaramel = new ItemFood(2, 0.2F, false).setUnlocalizedName("Caramel").setTextureName(modid + ":Caramel").setCreativeTab(Morefood.morefoodTab);
		foodCaramelizedApple = new ItemFood(8, 0.6F, false).setUnlocalizedName("CaramelizedApple").setTextureName(modid + ":CaramelizedApple").setCreativeTab(Morefood.morefoodTab);
		foodGrapeSugar = new GrapeSpeed(0, 0.0F, false).setUnlocalizedName("GrapeSugar").setTextureName(modid + ":GrapeSugar").setCreativeTab(Morefood.morefoodTab);
		foodStrongGrapeSugar = new GrapeSpeed2(0, 0.0F, false).setUnlocalizedName("StrongGrapeSugar").setTextureName(modid + ":GrapeSugar").setCreativeTab(Morefood.morefoodTab);
		foodPaprikaSlice = new ItemFood(2, 0.8F, false).setUnlocalizedName("PaprikaSlice").setTextureName(modid + ":PaprikaSlice").setCreativeTab(Morefood.morefoodTab);
		foodPaprikaEggSlice = new ItemFood(8, 1.0F, false).setUnlocalizedName("PaprikaEggSlice").setTextureName(modid + ":PaprikaEggSlice").setCreativeTab(Morefood.morefoodTab);
		foodCaramelCookie = new ItemFood(2, 0.2F, false).setUnlocalizedName("CaramelCookie").setTextureName(modid + ":CaramelCookie").setCreativeTab(Morefood.morefoodTab);
        foodChocolatePie = new ItemFood(8, 0.6F, false).setUnlocalizedName("ChocolatePie").setTextureName(modid + ":ChocolatePie").setCreativeTab(Morefood.morefoodTab);
		foodRawMutton = new ItemFood(3, 0.6F, false).setUnlocalizedName("RawMutton").setTextureName(modid + ":RawMutton").setCreativeTab(Morefood.morefoodTab);
		foodCookedMutton = new ItemFood(8, 1.6F, false).setUnlocalizedName("CookedMutton").setTextureName(modid + ":CookedMutton").setCreativeTab(Morefood.morefoodTab);
		foodRawSquid = new ItemFood(2, 0.6F, false).setUnlocalizedName("RawSquid").setTextureName(modid + ":RawSquid").setCreativeTab(Morefood.morefoodTab);
		foodFriedCalamari = new ItemFood(8, 1.6F, false).setUnlocalizedName("FriedCalamari").setTextureName(modid + ":FriedCalamari").setCreativeTab(Morefood.morefoodTab);
		foodButter = new ItemFood(1, 0.5F, false).setUnlocalizedName("Butter").setTextureName(modid + ":Butter").setCreativeTab(Morefood.morefoodTab);
    //Cakes
        GameRegistry.registerBlock(blockChocolateCake, "blockChocolateCake");
        GameRegistry.registerBlock(blockStrawberryCake, "blockStrawberryCake");
        GameRegistry.registerBlock(blockBlueberryCake, "blockBlueberryCake");
        GameRegistry.registerBlock(blockAppleCake, "blockAppleCake");
        GameRegistry.registerBlock(blockCaramelCake, "blockCaramelCake");
        
		GameRegistry.registerItem(itemChocolateCake, "itemChocolateCake");
		GameRegistry.registerItem(itemStrawberryCake, "itemStrawberryCake");
		GameRegistry.registerItem(itemBlueberryCake, "itemBlueberryCake");
		GameRegistry.registerItem(itemAppleCake, "itemAppleCake");
		GameRegistry.registerItem(itemCaramelCake, "itemCaramelCake");
    //Items
		GameRegistry.registerItem(itemNoriLeave, "NoriLeave");
		GameRegistry.registerItem(itemSushiCone, "SushiCone");
	//Food
		GameRegistry.registerItem(foodBreadslice, "Breadslice");
		GameRegistry.registerItem(foodToast, "Toast");
		GameRegistry.registerItem(foodCheeseToast, "CheeseToast");
		GameRegistry.registerItem(foodCroqueMadame, "CroqueMadame");
		GameRegistry.registerItem(foodBruschetta, "Bruschetta");
		GameRegistry.registerItem(foodStrawberryToast, "StrawberryToast");
		GameRegistry.registerItem(foodBlueberryToast, "BlueberryToast");
		GameRegistry.registerItem(foodButterToast, "ButterToast");
		GameRegistry.registerItem(foodCandy, "Candy");
		GameRegistry.registerItem(foodApplePie, "ApplePie");
		GameRegistry.registerItem(foodStrawberryPie, "StrawberryPie");
		GameRegistry.registerItem(foodBlueberryPie, "BlueberryPie");
		GameRegistry.registerItem(foodChocolatePie, "ChocolatePie");
		GameRegistry.registerItem(foodDarkChocolate, "DarkChocolate");
		GameRegistry.registerItem(foodChocolate, "Chocolate");
		GameRegistry.registerItem(foodChocolateBar, "ChocolateBar");
		GameRegistry.registerItem(foodChocolateMilk, "ChocolateMilk");
		GameRegistry.registerItem(foodHotChocolate, "HotChocolate");
		GameRegistry.registerItem(foodMilkBowl, "MilkBowl");
		GameRegistry.registerItem(foodHotMilk, "HotMilk");
		GameRegistry.registerItem(foodIceCreamCone, "IceCreamCone");
		GameRegistry.registerItem(foodIceCream, "IceCream");
		GameRegistry.registerItem(foodAppleIceCream, "AppleIceCream");
		GameRegistry.registerItem(foodMelonIceCream, "MelonIceCream");
		GameRegistry.registerItem(foodStrawberryIceCream, "StrawberryIceCream");
		GameRegistry.registerItem(foodBlueberryIceCream, "BlueberryIceCream");
		GameRegistry.registerItem(foodChocolateIceCream, "ChocolateIceCream");
		GameRegistry.registerItem(foodCaramelIceCream, "CaramelIceCream");
        GameRegistry.registerItem(foodAppleIceCreamWithChocolateSauce, "AppleIceCreamWithChocolateSauce");
        GameRegistry.registerItem(foodMelonIceCreamWithChocolateSauce, "MelonIceCreamWithChocolateSauce");
        GameRegistry.registerItem(foodStrawberryIceCreamWithChocolateSauce, "StrawberryIceCreamWithChocolateSauce");
        GameRegistry.registerItem(foodBlueberryIceCreamWithChocolateSauce, "BlueberryIceCreamWithChocolateSauce");
		GameRegistry.registerItem(foodCheese, "Cheese");
		GameRegistry.registerItem(foodFriedEgg, "FriedEgg");
		GameRegistry.registerItem(foodSushi, "Sushi");
		GameRegistry.registerItem(foodVegetableSoup, "VegetableSoup");
		GameRegistry.registerItem(foodHotVegetableSoup, "HotVegetableSoup");
		GameRegistry.registerItem(foodCarrotSoup, "CarrotSoup");
		GameRegistry.registerItem(foodHotCarrotSoup, "HotCarrotSoup");
		GameRegistry.registerItem(foodTomatoSoup, "TomatoSoup");
		GameRegistry.registerItem(foodHotTomatoSoup, "HotTomatoSoup");
		GameRegistry.registerItem(foodPaprikaSoup, "PaprikaSoup");
		GameRegistry.registerItem(foodHotPaprikaSoup, "HotPaprikaSoup");
		GameRegistry.registerItem(foodOnionSoup, "OnionSoup");
		GameRegistry.registerItem(foodHotOnionSoup, "HotOnionSoup");
	    GameRegistry.registerItem(foodAsparagusSoup, "AsparagusSoup");
	    GameRegistry.registerItem(foodHotAsparagusSoup, "HotAsparagusSoup");
		GameRegistry.registerItem(foodOnionSoup, "OnionSoup");
		GameRegistry.registerItem(foodBeefStew, "BeefStew");
		GameRegistry.registerItem(foodPorkStew, "PorkStew");
		GameRegistry.registerItem(foodStuffedFish, "StuffedFish");
		GameRegistry.registerItem(foodStuffedSalmon, "StuffedSalmon");
		GameRegistry.registerItem(foodChocolateCookie, "ChocolateCookie");
		GameRegistry.registerItem(foodStrawberryCookie, "StrawberryCookie");
		GameRegistry.registerItem(foodBlueberryCookie, "BlueberryCookie");
		GameRegistry.registerItem(foodAppleCookie, "AppleCookie");
		GameRegistry.registerItem(foodSugarCookie, "SugarCookie");
		GameRegistry.registerItem(foodCaramelCookie, "CaramelCookie");
		GameRegistry.registerItem(foodButterCookie, "ButterCookie");
		GameRegistry.registerItem(foodDriedTomato, "DriedTomato");
		GameRegistry.registerItem(foodBakedPaprika, "BakedPaprika");
		GameRegistry.registerItem(foodBakedOnionSlice, "BakedOnionSlice");
		GameRegistry.registerItem(foodBakedAsparagus, "BakedAsparagus");
		GameRegistry.registerItem(foodButteredAsparagus, "ButteredAsparagus");
		GameRegistry.registerItem(foodPaprikaSlice, "PaprikaSlice");
		GameRegistry.registerItem(foodTomatoSlice, "TomatoSlice");
		GameRegistry.registerItem(foodOnionSlice, "OnionSlice");
		GameRegistry.registerItem(foodPaprikaEggSlice, "PaprikaEggSlice");
		GameRegistry.registerItem(foodCaramel, "Caramel");
		GameRegistry.registerItem(foodCaramelizedApple, "CaramelizedApple");
		GameRegistry.registerItem(foodGrapeSugar, "GrapeSugar");
		GameRegistry.registerItem(foodStrongGrapeSugar, "StrongGrapeSugar");
		GameRegistry.registerItem(foodRawMutton, "RawMutton");
		GameRegistry.registerItem(foodCookedMutton, "CookedMutton");
		GameRegistry.registerItem(foodRawSquid, "RawSquid");
		GameRegistry.registerItem(foodFriedCalamari, "FriedCalamari");
		GameRegistry.registerItem(foodButter, "Butter");
		
//Crops
	//Strawberry
		cropStrawberryPlant = new StrawCrop().setBlockName("StrawberryPlant");
		cropStrawberrySeeds = new ItemSeeds(Morefood.cropStrawberryPlant, Blocks.farmland).setUnlocalizedName("StrawberrySeeds").setTextureName(modid + ":StrawberrySeeds").setCreativeTab(Morefood.morefoodTab);       
		cropStrawberry = new ItemFood(2, 0.5F, false).setUnlocalizedName("Strawberry").setTextureName(modid + ":Strawberry").setCreativeTab(Morefood.morefoodTab);
	//Blueberry
		cropBlueberryPlant = new BlueCrop().setBlockName("BlueberryPlant");
		cropBlueberrySeeds = new ItemSeeds(cropBlueberryPlant, Blocks.farmland).setUnlocalizedName("BlueberrySeeds").setTextureName(modid + ":BlueberrySeeds").setCreativeTab(Morefood.morefoodTab);
		cropBlueberry = new ItemFood(2, 0.5F, false).setUnlocalizedName("Blueberry").setTextureName(modid + ":Blueberry").setCreativeTab(Morefood.morefoodTab);
	//Asparagus
		cropAsparagusPlant = new AspCrop().setBlockName("AsparagusPlant");
		cropRawAsparagusSeeds = new ItemSeeds(cropAsparagusPlant, Blocks.farmland).setUnlocalizedName("AsparagusSeeds").setTextureName(modid + ":AsparagusSeeds").setCreativeTab(Morefood.morefoodTab);
		cropRawAsparagus = new ItemFood(2, 0.5F, false).setUnlocalizedName("RawAsparagus").setTextureName(modid + ":RawAsparagus").setCreativeTab(Morefood.morefoodTab);
	//Paprika
		cropPaprikaPlant = new PapCrop().setBlockName("PaprikaPlant");
		cropPaprika = new ItemSeedFood(4, 0.5F, cropPaprikaPlant, Blocks.farmland).setUnlocalizedName("Paprika").setTextureName(modid + ":Paprika").setCreativeTab(Morefood.morefoodTab);
	//Tomato
		cropTomatoPlant = new TomCrop().setBlockName("TomatoPlant");
		cropTomato = new ItemSeedFood(4, 0.5F, cropTomatoPlant, Blocks.farmland).setUnlocalizedName("Tomato").setTextureName(modid + ":Tomato").setCreativeTab(Morefood.morefoodTab);
	//Onion
		cropOnionPlant = new UniCrop().setBlockName("OnionPlant");
		cropRawOnion = new ItemSeedFood(2, 0.5F, cropOnionPlant, Blocks.farmland).setUnlocalizedName("RawOnion").setTextureName(modid + ":RawOnion").setCreativeTab(Morefood.morefoodTab);
//Crop Registry
	//Strawberry
		GameRegistry.registerItem(cropStrawberrySeeds, "StrawberrySeeds");
		GameRegistry.registerItem(cropStrawberry, "Strawberry");
		GameRegistry.registerBlock(cropStrawberryPlant, "StrawberryPlant");
	//Blueberry
		GameRegistry.registerItem(cropBlueberrySeeds, "BlueberrySeeds");
		GameRegistry.registerItem(cropBlueberry, "Blueberry");
		GameRegistry.registerBlock(cropBlueberryPlant, "BlueberryPlant");
	//Asparagus
		GameRegistry.registerItem(cropRawAsparagusSeeds, "AsparagusSeeds");
		GameRegistry.registerItem(cropRawAsparagus, "RawAsparagus");
		GameRegistry.registerBlock(cropAsparagusPlant, "AsparagusPlant");
	//Tomato
		GameRegistry.registerItem(cropTomato, "Tomato");
		GameRegistry.registerBlock(cropTomatoPlant, "TomatoPlant");
	//Paprika	
		GameRegistry.registerItem(cropPaprika, "Paprika");
		GameRegistry.registerBlock(cropPaprikaPlant, "PaprikaPlant");
	//Onion
		GameRegistry.registerItem(cropRawOnion, "Onion");
		GameRegistry.registerBlock(cropOnionPlant, "OnionPlant");
//Tree's
	//Orange
		foodOrange = new ItemFood(4, 0.5F, false).setUnlocalizedName("Orange").setTextureName(modid + ":Orange").setCreativeTab(Morefood.morefoodTab);
//Tree's Registry
	//Orange
		GameRegistry.registerItem(foodOrange,"Orange");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){		
//ItemStacks
		ItemStack Cocoastack = new ItemStack(Items.dye, 1, 3);
    	ItemStack DarkChocolatestack = new ItemStack(Morefood.foodDarkChocolate);
    	ItemStack Chocolatestack = new ItemStack(Morefood.foodChocolate);
    	ItemStack ChocolateMilkstack = new ItemStack(Morefood.foodChocolateMilk, 1);
    	ItemStack HotChocolatestack = new ItemStack(Morefood.foodHotChocolate);
    	ItemStack MilkBowlstack = new ItemStack(Morefood.foodMilkBowl);
    	ItemStack HotMilkstack = new ItemStack(Morefood.foodHotMilk);
    	ItemStack Milkstack = new ItemStack(Items.milk_bucket);
    	ItemStack Bowlstack = new ItemStack(Items.bowl);
    	ItemStack Eggstack = new ItemStack(Items.egg);
    	ItemStack Friedeggstack = new ItemStack(Morefood.foodFriedEgg);
    	ItemStack Breadslicestack = new ItemStack(Morefood.foodBreadslice);
    	ItemStack Toaststack = new ItemStack(Morefood.foodToast);
    	ItemStack Noristack = new ItemStack(Morefood.itemNoriLeave, 3);
    	ItemStack Cactusstack = new ItemStack(Items.dye, 1, 2);
    	ItemStack DriedTomatostack = new ItemStack(Morefood.foodDriedTomato);
    	ItemStack Tomatostack = new ItemStack(Morefood.cropTomato);
    	ItemStack Sugarstack = new ItemStack(Items.sugar);
    	ItemStack Caramelstack = new ItemStack(Morefood.foodCaramel);
    	ItemStack Salmonstack = new ItemStack(Items.fish, 1, 1);
    	ItemStack StuffedSalmonstack = new ItemStack(Morefood.foodStuffedSalmon);
    	ItemStack Cheesestack = new ItemStack(Morefood.foodCheese);
    	ItemStack Potatostack = new ItemStack(Items.potato);
    	ItemStack Sushistack = new ItemStack(Morefood.foodSushi, 1);
    	ItemStack Sushiconestack = new ItemStack(Morefood.itemSushiCone, 1);
    	ItemStack Paprikastack = new ItemStack(Morefood.cropPaprika, 1);
    	ItemStack BakedPaprikastack = new ItemStack(Morefood.foodBakedPaprika);
    	ItemStack OnionSlicestack = new ItemStack(Morefood.foodOnionSlice);
    	ItemStack BakedOnionSlicestack = new ItemStack(Morefood.foodBakedOnionSlice);
    	ItemStack VegetableSoupstack = new ItemStack(Morefood.foodVegetableSoup);
    	ItemStack HotVegetableSoupstack = new ItemStack(Morefood.foodHotVegetableSoup);
    	ItemStack CarrotSoupstack = new ItemStack(Morefood.foodCarrotSoup);
    	ItemStack HotCarrotSoupstack = new ItemStack(Morefood.foodHotCarrotSoup);
    	ItemStack TomatoSoupstack = new ItemStack(Morefood.foodTomatoSoup);
    	ItemStack HotTomatoSoupstack = new ItemStack(Morefood.foodHotTomatoSoup);
    	ItemStack PaprikaSoupstack = new ItemStack(Morefood.foodPaprikaSoup);
    	ItemStack HotPaprikaSoupstack = new ItemStack(Morefood.foodHotPaprikaSoup);
    	ItemStack OnionSoupstack = new ItemStack(Morefood.foodOnionSoup);
    	ItemStack HotOnionSoupstack = new ItemStack(Morefood.foodHotOnionSoup);
    	ItemStack AsparagusSoupstack = new ItemStack(Morefood.foodAsparagusSoup);
    	ItemStack HotAsparagusSoupstack = new ItemStack(Morefood.foodHotAsparagusSoup);
    	ItemStack RawMuttonstack = new ItemStack(Morefood.foodRawMutton);
    	ItemStack CookedMuttonstack = new ItemStack(Morefood.foodCookedMutton);
    	ItemStack RawSquidstack = new ItemStack(Morefood.foodRawSquid);
    	ItemStack FriedCalamaristack = new ItemStack(Morefood.foodFriedCalamari);
    	ItemStack Asparagusstack = new ItemStack(Morefood.cropRawAsparagus);
    	ItemStack BakedAsparagusstack = new ItemStack(Morefood.foodBakedAsparagus);
//ItemStacks size
    //Cake's
    	Morefood.itemChocolateCake.setMaxStackSize(1);
    	Morefood.itemStrawberryCake.setMaxStackSize(1);
    	Morefood.itemBlueberryCake.setMaxStackSize(1);
    	Morefood.itemAppleCake.setMaxStackSize(1);
    	Morefood.itemCaramelCake.setMaxStackSize(1);
    //Items
    	Morefood.itemSushiCone.setMaxStackSize(16);
    //Food
    	Morefood.foodIceCreamCone.setMaxStackSize(16);
    	Morefood.foodSushi.setMaxStackSize(16);
    	Morefood.foodIceCream.setMaxStackSize(1);
    	Morefood.foodMelonIceCream.setMaxStackSize(1);
    	Morefood.foodStrawberryIceCream.setMaxStackSize(1);
    	Morefood.foodChocolateIceCream.setMaxStackSize(1);
    	Morefood.foodBlueberryIceCream.setMaxStackSize(1);
    	Morefood.foodVegetableSoup.setMaxStackSize(1);
    	Morefood.foodHotVegetableSoup.setMaxStackSize(1);
    	Morefood.foodTomatoSoup.setMaxStackSize(1);
    	Morefood.foodHotTomatoSoup.setMaxStackSize(1);
    	Morefood.foodCroqueMadame.setMaxStackSize(1);
    	Morefood.foodBruschetta.setMaxStackSize(1);
    	Morefood.foodCarrotSoup.setMaxStackSize(1);
    	Morefood.foodHotCarrotSoup.setMaxStackSize(1);
    	Morefood.foodPaprikaSoup.setMaxStackSize(1);
    	Morefood.foodHotPaprikaSoup.setMaxStackSize(1);
    	Morefood.foodOnionSoup.setMaxStackSize(1);
    	Morefood.foodHotOnionSoup.setMaxStackSize(1);
    	Morefood.foodAsparagusSoup.setMaxStackSize(1);
    	Morefood.foodHotAsparagusSoup.setMaxStackSize(1);
    	Morefood.foodChocolateMilk.setMaxStackSize(1);
    	Morefood.foodHotChocolate.setMaxStackSize(1);
    	Morefood.foodMilkBowl.setMaxStackSize(1);
    	Morefood.foodHotMilk.setMaxStackSize(1);
//Recipe's Registry
    //Crafting Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.cropStrawberrySeeds, 1), Morefood.cropStrawberry);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.cropRawAsparagusSeeds, 1), Morefood.cropRawAsparagus);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodCheese, 3), Items.milk_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodApplePie, 1), Items.apple, Items.sugar, Items.egg);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodStrawberryPie, 1), Morefood.cropStrawberry, Items.sugar, Items.egg);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodBlueberryPie, 1), Morefood.cropBlueberry, Items.sugar, Items.egg);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodChocolatePie, 1), Morefood.foodChocolate, Items.sugar, Items.egg);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodVegetableSoup, 1), Items.carrot, Blocks.pumpkin, Items.potato, Items.bowl);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodBreadslice, 3), Items.bread);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodTomatoSlice, 3), Morefood.cropTomato);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodOnionSlice, 2), Morefood.cropRawOnion);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.cropBlueberrySeeds, 1), Morefood.cropBlueberry);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodChocolate, 1), Morefood.foodDarkChocolate, Items.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodGrapeSugar, 1), Morefood.cropBlueberry, Items.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodStrongGrapeSugar, 1), Morefood.cropBlueberry, Items.sugar , Items.sugar , Items.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodPaprikaSlice, 2), Morefood.cropPaprika);
		GameRegistry.addShapelessRecipe(new ItemStack(Morefood.foodStuffedFish, 1), Morefood.foodCheese, Items.fish, Items.potato);
		GameRegistry.addShapelessRecipe(StuffedSalmonstack, Cheesestack, Potatostack, Salmonstack);
		GameRegistry.addShapelessRecipe(Noristack, Cactusstack);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodChocolateBar, 1),"XX", "XX", "XX", 'X', Morefood.foodChocolate);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCandy, 1),"XYX", 'X', Items.paper, 'Y', Items.sugar);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodChocolateCookie, 8),"XYX", 'X', Items.wheat, 'Y', Morefood.foodChocolate);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodBlueberryCookie, 8),"XYX", 'X', Items.wheat, 'Y', Morefood.cropBlueberry);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodStrawberryCookie, 8),"XYX", 'X', Items.wheat, 'Y', Morefood.cropStrawberry);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCaramelCookie, 8),"XYX", 'X', Items.wheat, 'Y', Morefood.foodCaramel);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodAppleCookie, 8),"XYX", 'X', Items.wheat, 'Y', Items.apple);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodSugarCookie, 8),"XYX", 'X', Items.wheat, 'Y', Items.sugar);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodButterCookie, 8),"XYX", 'X', Items.wheat, 'Y', Morefood.foodButter);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodIceCreamCone, 3),"XYX", " X ", 'X', Items.wheat, 'Y', Items.sugar);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodIceCream, 1),"X", "Y", 'X', Items.snowball, 'Y', Morefood.foodIceCreamCone);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodAppleIceCream, 1), "X", "Y", 'X', Items.apple, 'Y', Morefood.foodIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodMelonIceCream, 1),"X", "Y", 'X', Items.melon, 'Y', Morefood.foodIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodStrawberryIceCream, 1),"X", "Y", 'X', Morefood.cropStrawberry, 'Y', Morefood.foodIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodChocolateIceCream, 1), "X", "Y", 'X', Morefood.foodChocolate, 'Y', Morefood.foodIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodBlueberryIceCream, 1), "X", "Y", 'X', Morefood.cropBlueberry, 'Y', Morefood.foodIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCaramelIceCream, 1), "X", "Y", 'X', Morefood.foodCaramel, 'Y', Morefood.foodIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodAppleIceCreamWithChocolateSauce, 1), "X", "Y", 'X', Morefood.foodChocolate, 'Y', Morefood.foodAppleIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodMelonIceCreamWithChocolateSauce, 1), "X", "Y", 'X', Morefood.foodChocolate, 'Y', Morefood.foodMelonIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodStrawberryIceCreamWithChocolateSauce, 1), "X", "Y", 'X', Morefood.foodChocolate, 'Y', Morefood.foodStrawberryIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodBlueberryIceCreamWithChocolateSauce, 1), "X", "Y", 'X', Morefood.foodChocolate, 'Y', Morefood.foodBlueberryIceCream);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCheeseToast, 1),"X", "Y", 'X', Morefood.foodCheese, 'Y', Morefood.foodToast);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCroqueMadame, 1),"X", "Y", 'X', Morefood.foodFriedEgg, 'Y', Morefood.foodCheeseToast);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodBruschetta, 1),"XXX", " Y ", 'X',Morefood.foodTomatoSlice, 'Y', Morefood.foodToast);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodStrawberryToast, 1),"X", "Y", 'X', Morefood.cropStrawberry, 'Y', Morefood.foodToast);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodBlueberryToast, 1),"X", "Y", 'X',Morefood.cropBlueberry, 'Y', Morefood.foodToast);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodButterToast, 1),"X", "Y", 'X',Morefood.foodButter, 'Y', Morefood.foodToast);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodTomatoSoup, 1),"X", "Y", 'X',Morefood.cropTomato, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodBeefStew, 1), "X", "Y", 'X', Items.cooked_beef, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodPorkStew, 1), "X", "Y", 'X', Items.cooked_porkchop, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodChocolateMilk, 1), "X", "Y", 'X', Morefood.foodChocolate, 'Y', Morefood.foodMilkBowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodMilkBowl, 1), "X", "Y", 'X', Items.milk_bucket, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.itemSushiCone, 1),"X X", "XXX", 'X', Morefood.itemNoriLeave);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodSushi, 1),"X", "Y", 'X', Items.fish, 'Y', Morefood.itemSushiCone);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCaramelizedApple, 1), "  X", " Y ", "Z  ", 'X', Morefood.foodCaramel, 'Y', Items.apple, 'Z', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodPaprikaEggSlice, 1), "X", "Y", 'X', Morefood.foodFriedEgg, 'Y', Morefood.foodPaprikaSlice);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodPaprikaSoup, 1), "X", "Y", 'X', Morefood.cropPaprika, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodOnionSoup, 1), "X", "Y", 'X', Morefood.cropRawOnion, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodAsparagusSoup, 1), "X", "Y", 'X', Morefood.cropRawAsparagus, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodCarrotSoup, 1), "X", "Y", 'X', Items.carrot, 'Y', Items.bowl);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodButter, 1), " X ", "XYX", " X ", 'X', Items.sugar, 'Y', Items.milk_bucket);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.foodButteredAsparagus, 1), "X", "Y", 'X', Morefood.foodButter, 'Y', Morefood.foodBakedAsparagus);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.itemChocolateCake, 1), "XXX", "YZY", "AAA", 'X', Items.milk_bucket, 'Y', Items.sugar, 'Z', Morefood.foodChocolate, 'A', Items.wheat);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.itemStrawberryCake, 1), "XXX", "YZY", "AAA", 'X', Items.milk_bucket, 'Y', Items.sugar, 'Z', Morefood.cropStrawberry, 'A', Items.wheat);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.itemBlueberryCake, 1), "XXX", "YZY", "AAA", 'X', Items.milk_bucket, 'Y', Items.sugar, 'Z', Morefood.cropBlueberry, 'A', Items.wheat);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.itemAppleCake, 1), "XXX", "YZY", "AAA", 'X', Items.milk_bucket, 'Y', Items.sugar, 'Z', Items.apple, 'A', Items.wheat);
		GameRegistry.addShapedRecipe(new ItemStack(Morefood.itemCaramelCake, 1), "XXX", "YYY", "AAA", 'X', Items.milk_bucket, 'Y', Morefood.foodCaramel, 'A', Items.wheat);
		GameRegistry.addShapedRecipe((Sushistack),"X", "Y", 'X', Salmonstack, 'Y', Sushiconestack);
	//Melting
		GameRegistry.addSmelting(Cocoastack, DarkChocolatestack, (float) 0.35);
    	GameRegistry.addSmelting(Eggstack, Friedeggstack, (float) 0.35);
    	GameRegistry.addSmelting(Breadslicestack, Toaststack, (float) 0.35);
    	GameRegistry.addSmelting(Tomatostack, DriedTomatostack, (float) 0.35);
    	GameRegistry.addSmelting(Sugarstack, Caramelstack, (float) 0.35);
    	GameRegistry.addSmelting(ChocolateMilkstack, HotChocolatestack, (float) 0.35);
    	GameRegistry.addSmelting(MilkBowlstack, HotMilkstack, (float) 0.35);
    	GameRegistry.addSmelting(Paprikastack, BakedPaprikastack, (float) 0.35);
    	GameRegistry.addSmelting(OnionSlicestack, BakedOnionSlicestack, (float) 0.35);
    	GameRegistry.addSmelting(VegetableSoupstack, HotVegetableSoupstack, (float) 0.35);
    	GameRegistry.addSmelting(CarrotSoupstack, HotCarrotSoupstack, (float) 0.35);
    	GameRegistry.addSmelting(TomatoSoupstack, HotTomatoSoupstack, (float) 0.35);
    	GameRegistry.addSmelting(PaprikaSoupstack, HotPaprikaSoupstack, (float) 0.35);
    	GameRegistry.addSmelting(OnionSoupstack, HotOnionSoupstack, (float) 0.35);
    	GameRegistry.addSmelting(AsparagusSoupstack, HotAsparagusSoupstack, (float) 0.35);
    	GameRegistry.addSmelting(RawMuttonstack, CookedMuttonstack, (float) 0.35);
    	GameRegistry.addSmelting(RawSquidstack, FriedCalamaristack, (float) 0.35);
    	GameRegistry.addSmelting(Asparagusstack, BakedAsparagusstack, (float) 0.35);
    	
    	MinecraftForge.EVENT_BUS.register(new SheepDrops());
    	MinecraftForge.EVENT_BUS.register(new SquidDrops());
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	@EventHandler
	public void Load(FMLInitializationEvent event) {
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropStrawberrySeeds),1,2,02));	
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropStrawberrySeeds),1,2,02));	
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropStrawberrySeeds),1,2,02));	
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropStrawberrySeeds),1,2,02));	
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropBlueberrySeeds),1,2,03));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropBlueberrySeeds),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropBlueberrySeeds),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropBlueberrySeeds),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropTomato),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropTomato),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropTomato),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropTomato),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropPaprika),1,2,03));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropPaprika),1,2,03));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropPaprika),1,2,03));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropPaprika),1,2,03));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawOnion),1,2,01));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawOnion),1,2,01));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawOnion),1,2,01));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawOnion),1,2,01));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawAsparagus),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawAsparagus),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawAsparagus),1,2,02));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Morefood.cropRawAsparagus),1,2,02));
	}

	public static Morefood getItem(Morefood item) {
		return null;
	}
	

}
