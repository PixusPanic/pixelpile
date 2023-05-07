package net.pixuspanic.pixelpile.config;

import net.minecraftforge.api.fml.event.config.ModConfigEvents;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;
import net.pixuspanic.pixelpile.PixelpileMod;

import static net.pixuspanic.pixelpile.PixelpileMod.MOD_ID;

public class CommonConfigs {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.Builder BUILD = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue exampleBoolean;

    public CommonConfigs(){
        ModConfigEvents.reloading(PixelpileMod.MOD_ID).register(CommonConfigs::onReload);
    }

    public static void onReload(ModConfig config)
    {
        if (config.getModId().equals(MOD_ID))
        {}
    }

    static {
        BUILD.push("Configs for Pixelpile");

        exampleBoolean = BUILD.comment("Toggles between putting blocks in Example Tab or regular blocks tab.").define("tabLocation", true);

        BUILD.pop();
        SPEC = BUILD.build();
    }
}
