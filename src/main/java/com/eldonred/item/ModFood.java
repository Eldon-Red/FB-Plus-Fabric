package com.eldonred.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFood {
    public static final FoodComponent LIQUID_PAIN = new FoodComponent.Builder().hunger(-100).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100000000, 3), 1f).build();

}