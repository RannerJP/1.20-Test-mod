package com.RannerJP.rannerstestmod.init;

import java.util.ArrayList;
import java.util.List;

import com.RannerJP.rannerstestmod.TestMod;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final List<Supplier<? extends ItemLike>> EXAMPLE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab", 
    () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.example_tab"))
        .icon(ItemInit.TEST_BLOCK_ITEM.get()::getDefaultInstance)
        .displayItems((displayParams, output) -> {
            EXAMPLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
        })
        .build()    
    );

    public static <T extends Item> RegistryObject<T> addToTab(List<Supplier<? extends ItemLike>> tabName, RegistryObject<T> itemLike) {
        tabName.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ItemInit.TEST_ITEM);
        }
    }
}
