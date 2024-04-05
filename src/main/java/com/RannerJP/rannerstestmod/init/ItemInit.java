package com.RannerJP.rannerstestmod.init;

import com.RannerJP.rannerstestmod.TestMod;

import static com.RannerJP.rannerstestmod.init.CreativeTabInit.EXAMPLE_TAB_ITEMS;
import static com.RannerJP.rannerstestmod.init.CreativeTabInit.addToTab;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> LIME = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime", 
    () -> new Item(new Item.Properties()
    .stacksTo(16)
    .food(new FoodProperties.Builder()
        .nutrition(6)
        .saturationMod(.3f)
        .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
        .build())
    )));

    //Block Items
    public static final RegistryObject<BlockItem> LIME_BLOCK_ITEM = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_block", 
        () -> new BlockItem(BlockInit.LIME_BLOCK.get(),
                new Item.Properties()
                    .rarity(Rarity.COMMON)
    )));

    public static final RegistryObject<SwordItem> LIME_SWORD = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_sword", 
        () -> new SwordItem(
            TiersInit.LIME, 
            7, 
            1.1f,
            new Item.Properties()
        )));

    public static final RegistryObject<PickaxeItem> LIME_PICKAXE = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_pickaxe", 
        () -> new PickaxeItem(
            TiersInit.LIME, 
            7, 
            1.1f,
            new Item.Properties()
        )));
    public static final RegistryObject<ShovelItem> LIME_SHOVEL = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_shovel", 
        () -> new ShovelItem(
            TiersInit.LIME, 
            7, 
            1.1f,
            new Item.Properties()
        )));
        
    public static final RegistryObject<AxeItem> LIME_AXE = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_axe", 
        () -> new AxeItem(
            TiersInit.LIME, 
            7, 
            1.1f,
            new Item.Properties()
        )));
    public static final RegistryObject<HoeItem> LIME_HOE = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_hoe", 
        () -> new HoeItem(
            TiersInit.LIME, 
            7, 
            1.1f,
            new Item.Properties()
        )));
    public static final RegistryObject<ArmorItem> LIME_HELMET = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_helmet", 
        () -> new ArmorItem(
            null,
            ArmorItem.Type.HELMET,
            new Item.Properties()
        )));
    public static final RegistryObject<ArmorItem> LIME_CHESTPLATE = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_chestplate", 
        () -> new ArmorItem(
            null,
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties()
        )));
    public static final RegistryObject<ArmorItem> LIME_LEGGINGS = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_leggings", 
        () -> new ArmorItem(
            null,
            ArmorItem.Type.LEGGINGS,
            new Item.Properties()
        )));
    public static final RegistryObject<ArmorItem> LIME_BOOTS = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("lime_boots", 
        () -> new ArmorItem(
            null,
            ArmorItem.Type.BOOTS,
            new Item.Properties()
        )));
}
