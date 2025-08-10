package com.eldonred.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFood {
    public static final FoodComponent LIQUID_PAIN = new FoodComponent.Builder().hunger(-100).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100000000, 3), 1f).build();
    public static final FoodComponent SMILER_STEAK = new FoodComponent.Builder().hunger(4).saturationModifier(0.27f)
            .meat().build();
    public static final FoodComponent SMILER_SANDWICH = new FoodComponent.Builder().hunger(12).saturationModifier(0.6f)
            .meat().build();
    public static final FoodComponent MOTH_JELLY = new FoodComponent.Builder().hunger(20).saturationModifier(10f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5000, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5000, 1), 1f).build();
}