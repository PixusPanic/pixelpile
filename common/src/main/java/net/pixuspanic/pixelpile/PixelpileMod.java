package net.pixuspanic.pixelpile;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.config.ModConfig;
import net.pixuspanic.pixelpile.config.CommonConfigs;
import net.pixuspanic.pixelpile.init.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

import net.minecraftforge.api.ModLoadingContext;

public class PixelpileMod {
    public static final String MOD_ID = "pixelpile";
    public static final Logger LOG = LogManager.getLogger(MOD_ID);

    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final CreativeModeTab EXAMPLE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "example_tab"), () ->
            new ItemStack(ExampleInit.EXAMPLE_ITEM.get()));
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);

    public void onInitializeClient()
    {
        ModLoadingContext.registerConfig(PixelpileMod.MOD_ID, ModConfig.Type.COMMON, CommonConfigs.SPEC);
    }

    public static void init() {
        new ExampleInit();
        new NorfareInit("Norfare", Material.HEAVY_METAL, EXAMPLE_TAB);
        BLOCKS.register();
        ITEMS.register();
        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
