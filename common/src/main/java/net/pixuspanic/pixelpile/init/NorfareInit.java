package net.pixuspanic.pixelpile.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.pixuspanic.pixelpile.block.TooltipBlock;

import static net.pixuspanic.pixelpile.PixelpileMod.*;
import static net.pixuspanic.pixelpile.list.SetList.*;

public class NorfareInit {

    String registryName;
    String registryNameCaps;
    String blockItemName;
    String[] prefixArray;
    public NorfareInit(String prefix, Material material, CreativeModeTab tabName) {
        LOG.info("prefix = "+prefix);
        for (String l : norfare){
            registryName = prefix.toLowerCase()+"_"+ l;
            registryNameCaps = registryName.toUpperCase();
            blockItemName = (registryName + "_item").toUpperCase();
            final RegistrySupplier<Block> registryNameCaps = BLOCKS.register(registryName, () -> new TooltipBlock(BlockBehaviour.Properties.of(material)));
            final RegistrySupplier<Item> blockItemName = ITEMS.register(registryName, () ->
                    new BlockItem(registryNameCaps.get(), new Item.Properties().tab(tabName)));
            LOG.info("RegistrySupplier<Block> = "+registryName);
        }
    }


    public static void init() {}
}
