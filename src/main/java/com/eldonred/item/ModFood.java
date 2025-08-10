package com.eldonred.item;

import com.eldonred.entity.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFood {
    public static final FoodComponent LIQUID_PAIN = new FoodComponent.Builder().hunger(-100).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100000000, 3), 1f).build();
    public static final FoodComponent SMILER_STEAK = new FoodComponent.Builder().hunger(8).saturationModifier(0.5f)
            .meat().build();
    public static final FoodComponent SMILER_STEAK_FRITES = new FoodComponent.Builder().hunger(20).saturationModifier(1f)
            .meat().build();
    public static final FoodComponent SMILER_SANDWICH = new FoodComponent.Builder().hunger(12).saturationModifier(0.6f)
            .meat().build();
    public static final FoodComponent MOTH_JELLY = new FoodComponent.Builder().hunger(20).saturationModifier(10f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5000, 1), 1f).build();
    public static final FoodComponent FIRESALT_COCKTAIL = new FoodComponent.Builder().hunger(4).saturationModifier(0f).alwaysEdible().build();
    public static final FoodComponent MEMORY_SCRAMBLER_COCKTAIL = new FoodComponent.Builder().hunger(4).saturationModifier(0f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(ModEffects.CONFUSED, 100000000, 3), 1f).build();
}