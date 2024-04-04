package com.RannerJP.rannerstestmod.init;

import com.RannerJP.rannerstestmod.TestMod;

import static com.RannerJP.rannerstestmod.init.CreativeTabInit.EXAMPLE_TAB_ITEMS;
import static com.RannerJP.rannerstestmod.init.CreativeTabInit.addToTab;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> TEST_ITEM = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("example_item", 
    () -> new Item(new Item.Properties()
    .stacksTo(16)
    .food(new FoodProperties.Builder()
        .nutrition(6)
        .saturationMod(.3f)
        .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
        .build())
    )));

    //Block Items
    public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = addToTab(EXAMPLE_TAB_ITEMS, ITEMS.register("test_block", 
        () -> new BlockItem(BlockInit.TEST_BLOCK.get(),
                new Item.Properties()
                    .rarity(Rarity.COMMON)
    )));
}
