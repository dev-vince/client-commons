package dev.vince.commons.util;

import net.minecraft.client.Minecraft;

/**
 * The MinecraftInterface is a class that allows you to access multiple Minecraft variables/methods without having to use the Minecraft class.
 * It is recommended to use this class instead of the Minecraft class.
 * It is also recommended to use this class instead of creating instance fields extending Minecraft.
 *
 * @author dev-vince
 */
public interface MinecraftInterface {
    Minecraft mc = Minecraft.getMinecraft();

}
