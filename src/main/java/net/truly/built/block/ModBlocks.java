package net.truly.built.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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



    public static final RegistryObject<Block> CHUNKY_BRICKS = registerBlock("chunky_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CHUNKY_BRICK_STAIRS = registerBlock("chunky_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CHUNKY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CHUNKY_BRICK_SLAB = registerBlock("chunky_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CHUNKY_BRICK_WALL = registerBlock("chunky_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));



    public static final RegistryObject<Block> TERRACOTTA_TRIM = registerBlock("terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_TRIM = registerBlock("white_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TRIM = registerBlock("light_gray_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_TRIM = registerBlock("gray_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_TRIM = registerBlock("black_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_TRIM = registerBlock("brown_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_TRIM = registerBlock("red_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_TRIM = registerBlock("orange_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_TRIM = registerBlock("yellow_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_TRIM = registerBlock("lime_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_TRIM = registerBlock("green_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TRIM = registerBlock("light_blue_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_TRIM = registerBlock("cyan_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_TRIM = registerBlock("blue_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_TRIM = registerBlock("purple_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_TRIM = registerBlock("pink_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TRIM = registerBlock("magenta_terracotta_trim",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));



    public static final RegistryObject<Block> CUT_COBBLESTONE = registerBlock("cut_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CUT_COBBLESTONE_STAIRS = registerBlock("cut_cobblestone_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CUT_COBBLESTONE_SLAB = registerBlock("cut_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CUT_COBBLESTONE_WALL = registerBlock("cut_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> MOSSY_CUT_COBBLESTONE = registerBlock("mossy_cut_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_CUT_COBBLESTONE_STAIRS = registerBlock("mossy_cut_cobblestone_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_CUT_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_CUT_COBBLESTONE_SLAB = registerBlock("mossy_cut_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_CUT_COBBLESTONE_WALL = registerBlock("mossy_cut_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final RegistryObject<Block> CARVED_STONE = registerBlock("carved_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CARVED_GRANITE = registerBlock("carved_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));
    public static final RegistryObject<Block> CARVED_DIORITE = registerBlock("carved_diorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<Block> CARVED_ANDESITE = registerBlock("carved_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));



    public static final RegistryObject<Block> SUGARCRETE_BRICKS = registerBlock("sugarcrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_WART)));
    public static final RegistryObject<Block> SUGARCRETE_BRICK_STAIRS = registerBlock("sugarcrete_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SUGARCRETE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_WART)));
    public static final RegistryObject<Block> SUGARCRETE_BRICK_SLAB = registerBlock("sugarcrete_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_WART)));








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
