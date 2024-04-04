package com.RannerJP.rannerstestmod.init;


import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TiersInit {
    public static final ForgeTier LIME = new ForgeTier(4, 1500, 1.5f, 4, 16, TagInit.NEEDS_LIME_TOOL, 
    () -> Ingredient.of(ItemInit.LIME::get
    ));
}
