package net.pixuspanic.pixelpile.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.pixuspanic.pixelpile.PixelpileMod;
import net.pixuspanic.pixelpile.block.ModStairsBlock;

import static net.minecraft.world.level.block.Blocks.BARRIER;
import static net.minecraft.world.level.block.Blocks.STONE;
import static net.pixuspanic.pixelpile.PixelpileMod.BLOCKS;
import static net.pixuspanic.pixelpile.PixelpileMod.ITEMS;

public class ExampleInit {

    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));

    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.BARRIER)));
    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () ->
            new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));

    public static final RegistrySupplier<Block> EXAMPLE_BLOCK_SLAB = BLOCKS.register("example_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.BARRIER)));
    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_SLAB_ITEM = ITEMS.register("example_block_slab", () ->
            new BlockItem(EXAMPLE_BLOCK_SLAB.get(), new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));
    public static final RegistrySupplier<Block> EXAMPLE_BLOCK_STAIRS = BLOCKS.register("example_block_stairs", () -> new ModStairsBlock(BARRIER.defaultBlockState(), BlockBehaviour.Properties.copy(BARRIER)));
    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_STAIRS_ITEM = ITEMS.register("example_block_stairs", () ->
            new BlockItem(EXAMPLE_BLOCK_STAIRS.get(), new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));
    public static final RegistrySupplier<Block> TOAD_BLOCK = BLOCKS.register("toad_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGSPAWN)));
    public static final RegistrySupplier<Item> TOAD_BLOCK_ITEM = ITEMS.register("toad_block", () ->
            new BlockItem(TOAD_BLOCK.get(), new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));

    public static final RegistrySupplier<Block> FLINT_BLOCK = BLOCKS.register("flint_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistrySupplier<Item> FLINT_BLOCK_ITEM = ITEMS.register("flint_block", () ->
            new BlockItem(FLINT_BLOCK.get(), new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));

    public static final RegistrySupplier<Block> SMOOTH_FLINT_BLOCK = BLOCKS.register("smooth_flint_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistrySupplier<Item> SMOOTH_FLINT_BLOCK_ITEM = ITEMS.register("smooth_flint_block", () ->
            new BlockItem(SMOOTH_FLINT_BLOCK.get(), new Item.Properties().tab(PixelpileMod.EXAMPLE_TAB)));

    public static void init() {}
}
