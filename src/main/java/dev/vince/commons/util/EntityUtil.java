package dev.vince.commons.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import java.util.concurrent.atomic.AtomicReference;

public final class EntityUtil implements MinecraftInterface {
    public static EntityLivingBase getClosestEntity(final double range) {
        AtomicReference<EntityLivingBase> target = new AtomicReference<>();
        mc.theWorld.getLoadedEntityList().forEach(entity -> {
            if (entity instanceof EntityLivingBase) {
                if (mc.thePlayer.getDistanceToEntity(entity) <= range) {
                    target.set((EntityLivingBase) entity);
                }
            }
        });
        return target.get();
    }

    public static EntityPlayer getClosestPlayer(final double range) {
        AtomicReference<EntityPlayer> target = new AtomicReference<>();
        mc.theWorld.getLoadedEntityList().forEach(entity -> {
            if (entity != mc.thePlayer) {
                if (entity instanceof EntityPlayer) {
                    if (mc.thePlayer.getDistanceToEntity(entity) <= range) {
                        target.set((EntityPlayer) entity);
                    }
                }
            }
        });
        return target.get();
    }
}
