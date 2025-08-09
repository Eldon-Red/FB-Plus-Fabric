package com.eldonred.entity.custom;

import com.eldonred.entity.ModEntities;
import com.eldonred.item.ModItems;
import com.eldonred.item.custom.FiresaltItem;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class FiresaltProjectile extends ThrownItemEntity {
    public FiresaltProjectile(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public FiresaltProjectile(LivingEntity livingEntity, World world) {
        super(ModEntities.FIRESALTPROJECTILE, livingEntity, world);
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {

        if (!this.getWorld().isClient) {
            this.getWorld().createExplosion(
            this, this.getX(), this.getY(), this.getZ(), 4.0F, World.ExplosionSourceType.TNT
            );
            this.discard();
        }

        super.onBlockHit(blockHitResult);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.FIRESALT;
    }
}
