package com.RannerJP.rannerstestmod;

import com.RannerJP.rannerstestmod.init.BlockInit;
import com.RannerJP.rannerstestmod.init.CreativeTabInit;
import com.RannerJP.rannerstestmod.init.ItemInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestMod.MODID)
public class TestMod {
    public static final String MODID = "rannerstestmod";

    public TestMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
