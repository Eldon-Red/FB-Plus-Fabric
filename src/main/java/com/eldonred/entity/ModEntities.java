package com.eldonred.entity;

import com.eldonred.Liminality;
import com.eldonred.entity.custom.FiresaltProjectile;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FiresaltProjectile> FIRESALTPROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Liminality.MOD_ID, "firesalt"),
            FabricEntityTypeBuilder.<FiresaltProjectile>create(SpawnGroup.MISC, FiresaltProjectile::new).dimensions(EntityDimensions.fixed(.25f, .25f)).build());

}
