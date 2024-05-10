package net.truly.built.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.truly.built.Built;
import net.truly.built.block.custom.ModFlammableWoodBlock;
import net.truly.built.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Built.MOD_ID);


    public static final RegistryObject<Block> OAK_COMPACT_PLANKS = registerBlock("oak_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_SHAKES = registerBlock("oak_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_SHAKES_STAIRS = registerBlock("oak_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.OAK_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_SHAKES_SLAB = registerBlock("oak_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_COMPACT_PLANKS = registerBlock("spruce_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_SHAKES = registerBlock("spruce_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_SHAKES_STAIRS = registerBlock("spruce_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.SPRUCE_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_SHAKES_SLAB = registerBlock("spruce_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> BIRCH_COMPACT_PLANKS = registerBlock("birch_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_SHAKES = registerBlock("birch_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_SHAKES_STAIRS = registerBlock("birch_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.BIRCH_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_SHAKES_SLAB = registerBlock("birch_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_COMPACT_PLANKS = registerBlock("jungle_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_SHAKES = registerBlock("jungle_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_SHAKES_STAIRS = registerBlock("jungle_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.JUNGLE_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_SHAKES_SLAB = registerBlock("jungle_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> ACACIA_COMPACT_PLANKS = registerBlock("acacia_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_SHAKES = registerBlock("acacia_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_SHAKES_STAIRS = registerBlock("acacia_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.ACACIA_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_SHAKES_SLAB = registerBlock("acacia_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_COMPACT_PLANKS = registerBlock("dark_oak_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_SHAKES = registerBlock("dark_oak_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_SHAKES_STAIRS = registerBlock("dark_oak_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_OAK_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_SHAKES_SLAB = registerBlock("dark_oak_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_COMPACT_PLANKS = registerBlock("mangrove_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_SHAKES = registerBlock("mangrove_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_SHAKES_STAIRS = registerBlock("mangrove_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.MANGROVE_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_SHAKES_SLAB = registerBlock("mangrove_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> CHERRY_COMPACT_PLANKS = registerBlock("cherry_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_SHAKES = registerBlock("cherry_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_SHAKES_STAIRS = registerBlock("cherry_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.CHERRY_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_SHAKES_SLAB = registerBlock("cherry_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> BAMBOO_COMPACT_PLANKS = registerBlock("bamboo_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_SHAKES = registerBlock("bamboo_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_SHAKES_STAIRS = registerBlock("bamboo_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.BAMBOO_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_SHAKES_SLAB = registerBlock("bamboo_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_COMPACT_PLANKS = registerBlock("crimson_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_SHAKES = registerBlock("crimson_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_SHAKES_STAIRS = registerBlock("crimson_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.CRIMSON_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_SHAKES_SLAB = registerBlock("crimson_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_COMPACT_PLANKS = registerBlock("warped_compact_planks",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_SHAKES = registerBlock("warped_shakes",
            () -> new ModFlammableWoodBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_SHAKES_STAIRS = registerBlock("warped_shakes_stairs",
            () -> new StairBlock(() -> ModBlocks.WARPED_SHAKES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_SHAKES_SLAB = registerBlock("warped_shakes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
