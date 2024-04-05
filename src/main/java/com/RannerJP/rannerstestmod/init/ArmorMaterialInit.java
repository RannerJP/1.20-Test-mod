package com.RannerJP.rannerstestmod.init;

import com.RannerJP.rannerstestmod.init.tiers.ModArmorMaterial;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial LIME = new ModArmorMaterial(new int[] {100, 175, 150, 125},
        new int[] {2,5,4,1}, 
        21, 
        SoundEvents.ARMOR_EQUIP_LEATHER, 
        () -> Ingredient.of(ItemInit.LIME::get), 
        "lime", 
        0, 
        0);
}
