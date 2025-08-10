package com.eldonred.entity.effect;

import com.eldonred.FBplus;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;


public class ModEffects extends StatusEffect {

    public ModEffects() {
        super(StatusEffectCategory.NEUTRAL, 0x102FFF); // color = light blue
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            Vec3d vel = player.getVelocity();


            double reversedX = -vel.x;
            double reversedZ = -vel.z;


            player.setVelocity(reversedX, vel.y, reversedZ);
            player.velocityModified = true;
        }
    }


    public static final StatusEffect CONFUSED = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(FBplus.MOD_ID + "confused"),
            new ModEffects()
    );

    public static void registerEffects() {

    }


}