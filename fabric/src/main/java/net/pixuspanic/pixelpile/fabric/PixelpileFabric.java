package net.pixuspanic.pixelpile.fabric;

import net.pixuspanic.pixelpile.PixelpileMod;
import net.fabricmc.api.ModInitializer;

public class PixelpileFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PixelpileMod.init();
    }
}
