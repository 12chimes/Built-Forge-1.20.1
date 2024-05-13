package net.truly.built.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;
import net.truly.built.item.custom.FuelBlockItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Built.MOD_ID);

    public static final RegistryObject<Item> BUILT = ITEMS.register("built",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OAK_COMPACT_PLANKS = ITEMS.register("oak_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.OAK_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> OAK_SHAKES = ITEMS.register("oak_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.OAK_SHAKES.get()));
    public static final RegistryObject<Item> OAK_SHAKES_STAIRS = ITEMS.register("oak_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.OAK_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> OAK_SHAKES_SLAB = ITEMS.register("oak_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.OAK_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> SPRUCE_COMPACT_PLANKS = ITEMS.register("spruce_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.SPRUCE_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> SPRUCE_SHAKES = ITEMS.register("spruce_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.SPRUCE_SHAKES.get()));
    public static final RegistryObject<Item> SPRUCE_SHAKES_STAIRS = ITEMS.register("spruce_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.SPRUCE_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> SPRUCE_SHAKES_SLAB = ITEMS.register("spruce_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.SPRUCE_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> BIRCH_COMPACT_PLANKS = ITEMS.register("birch_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.BIRCH_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> BIRCH_SHAKES = ITEMS.register("birch_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.BIRCH_SHAKES.get()));
    public static final RegistryObject<Item> BIRCH_SHAKES_STAIRS = ITEMS.register("birch_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.BIRCH_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> BIRCH_SHAKES_SLAB = ITEMS.register("birch_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.BIRCH_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> JUNGLE_COMPACT_PLANKS = ITEMS.register("jungle_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.JUNGLE_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> JUNGLE_SHAKES = ITEMS.register("jungle_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.JUNGLE_SHAKES.get()));
    public static final RegistryObject<Item> JUNGLE_SHAKES_STAIRS = ITEMS.register("jungle_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.JUNGLE_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> JUNGLE_SHAKES_SLAB = ITEMS.register("jungle_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.JUNGLE_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> ACACIA_COMPACT_PLANKS = ITEMS.register("acacia_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.ACACIA_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> ACACIA_SHAKES = ITEMS.register("acacia_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.ACACIA_SHAKES.get()));
    public static final RegistryObject<Item> ACACIA_SHAKES_STAIRS = ITEMS.register("acacia_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.ACACIA_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> ACACIA_SHAKES_SLAB = ITEMS.register("acacia_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.ACACIA_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> DARK_OAK_COMPACT_PLANKS = ITEMS.register("dark_oak_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.DARK_OAK_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> DARK_OAK_SHAKES = ITEMS.register("dark_oak_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.DARK_OAK_SHAKES.get()));
    public static final RegistryObject<Item> DARK_OAK_SHAKES_STAIRS = ITEMS.register("dark_oak_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.DARK_OAK_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> DARK_OAK_SHAKES_SLAB = ITEMS.register("dark_oak_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.DARK_OAK_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> MANGROVE_COMPACT_PLANKS = ITEMS.register("mangrove_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.MANGROVE_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> MANGROVE_SHAKES = ITEMS.register("mangrove_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.MANGROVE_SHAKES.get()));
    public static final RegistryObject<Item> MANGROVE_SHAKES_STAIRS = ITEMS.register("mangrove_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.MANGROVE_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> MANGROVE_SHAKES_SLAB = ITEMS.register("mangrove_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.MANGROVE_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> CHERRY_COMPACT_PLANKS = ITEMS.register("cherry_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CHERRY_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> CHERRY_SHAKES = ITEMS.register("cherry_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CHERRY_SHAKES.get()));
    public static final RegistryObject<Item> CHERRY_SHAKES_STAIRS = ITEMS.register("cherry_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CHERRY_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> CHERRY_SHAKES_SLAB = ITEMS.register("cherry_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.CHERRY_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> BAMBOO_COMPACT_PLANKS = ITEMS.register("bamboo_compact_planks",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.BAMBOO_COMPACT_PLANKS.get()));
    public static final RegistryObject<Item> BAMBOO_SHAKES = ITEMS.register("bamboo_shakes",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.BAMBOO_SHAKES.get()));
    public static final RegistryObject<Item> BAMBOO_SHAKES_STAIRS = ITEMS.register("bamboo_shakes_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.BAMBOO_SHAKES_STAIRS.get()));
    public static final RegistryObject<Item> BAMBOO_SHAKES_SLAB = ITEMS.register("bamboo_shakes_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.BAMBOO_SHAKES_SLAB.get()));

    public static final RegistryObject<Item> FRESH_BAMBOO_BLOCK = ITEMS.register("fresh_bamboo_block",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.FRESH_BAMBOO_BLOCK.get()));

    public static final RegistryObject<Item> CUT_FRESH_BAMBOO_BLOCK = ITEMS.register("cut_fresh_bamboo_block",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get()));
    public static final RegistryObject<Item> CUT_FRESH_BAMBOO_STAIRS = ITEMS.register("cut_fresh_bamboo_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CUT_FRESH_BAMBOO_STAIRS.get()));
    public static final RegistryObject<Item> CUT_FRESH_BAMBOO_SLAB = ITEMS.register("cut_fresh_bamboo_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.CUT_FRESH_BAMBOO_SLAB.get()));

    public static final RegistryObject<Item> CUT_BAMBOO_BLOCK = ITEMS.register("cut_bamboo_block",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CUT_BAMBOO_BLOCK.get()));
    public static final RegistryObject<Item> CUT_BAMBOO_STAIRS = ITEMS.register("cut_bamboo_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CUT_BAMBOO_STAIRS.get()));
    public static final RegistryObject<Item> CUT_BAMBOO_SLAB = ITEMS.register("cut_bamboo_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.CUT_BAMBOO_SLAB.get()));

    public static final RegistryObject<Item> CUT_STRIPPED_BAMBOO_BLOCK = ITEMS.register("cut_stripped_bamboo_block",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get()));
    public static final RegistryObject<Item> CUT_STRIPPED_BAMBOO_STAIRS = ITEMS.register("cut_stripped_bamboo_stairs",
            () -> new FuelBlockItem(new Item.Properties(), 300, ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS.get()));
    public static final RegistryObject<Item> CUT_STRIPPED_BAMBOO_SLAB = ITEMS.register("cut_stripped_bamboo_slab",
            () -> new FuelBlockItem(new Item.Properties(), 150, ModBlocks.CUT_STRIPPED_BAMBOO_SLAB.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}