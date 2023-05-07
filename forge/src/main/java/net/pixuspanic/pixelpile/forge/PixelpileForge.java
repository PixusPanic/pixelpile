package net.pixuspanic.pixelpile.forge;

import dev.architectury.platform.forge.EventBuses;
import net.pixuspanic.pixelpile.PixelpileMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PixelpileMod.MOD_ID)
public class PixelpileForge {
    public PixelpileForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PixelpileMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PixelpileMod.init();
    }
}
