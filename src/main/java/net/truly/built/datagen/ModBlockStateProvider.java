package net.truly.built.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Built.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.OAK_COMPACT_PLANKS);
        blockWithItem(ModBlocks.OAK_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.OAK_SHAKES_STAIRS.get()), blockTexture(ModBlocks.OAK_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.OAK_SHAKES_SLAB.get()), blockTexture(ModBlocks.OAK_SHAKES.get()),
                blockTexture(ModBlocks.OAK_SHAKES.get()));

        blockWithItem(ModBlocks.SPRUCE_COMPACT_PLANKS);
        blockWithItem(ModBlocks.SPRUCE_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.SPRUCE_SHAKES_STAIRS.get()), blockTexture(ModBlocks.SPRUCE_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.SPRUCE_SHAKES_SLAB.get()), blockTexture(ModBlocks.SPRUCE_SHAKES.get()),
                blockTexture(ModBlocks.SPRUCE_SHAKES.get()));

        blockWithItem(ModBlocks.BIRCH_COMPACT_PLANKS);
        blockWithItem(ModBlocks.BIRCH_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.BIRCH_SHAKES_STAIRS.get()), blockTexture(ModBlocks.BIRCH_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.BIRCH_SHAKES_SLAB.get()), blockTexture(ModBlocks.BIRCH_SHAKES.get()),
                blockTexture(ModBlocks.BIRCH_SHAKES.get()));

        blockWithItem(ModBlocks.JUNGLE_COMPACT_PLANKS);
        blockWithItem(ModBlocks.JUNGLE_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.JUNGLE_SHAKES_STAIRS.get()), blockTexture(ModBlocks.JUNGLE_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.JUNGLE_SHAKES_SLAB.get()), blockTexture(ModBlocks.JUNGLE_SHAKES.get()),
                blockTexture(ModBlocks.JUNGLE_SHAKES.get()));

        blockWithItem(ModBlocks.ACACIA_COMPACT_PLANKS);
        blockWithItem(ModBlocks.ACACIA_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.ACACIA_SHAKES_STAIRS.get()), blockTexture(ModBlocks.ACACIA_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.ACACIA_SHAKES_SLAB.get()), blockTexture(ModBlocks.ACACIA_SHAKES.get()),
                blockTexture(ModBlocks.ACACIA_SHAKES.get()));

        blockWithItem(ModBlocks.DARK_OAK_COMPACT_PLANKS);
        blockWithItem(ModBlocks.DARK_OAK_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.DARK_OAK_SHAKES_STAIRS.get()), blockTexture(ModBlocks.DARK_OAK_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_OAK_SHAKES_SLAB.get()), blockTexture(ModBlocks.DARK_OAK_SHAKES.get()),
                blockTexture(ModBlocks.DARK_OAK_SHAKES.get()));

        blockWithItem(ModBlocks.MANGROVE_COMPACT_PLANKS);
        blockWithItem(ModBlocks.MANGROVE_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.MANGROVE_SHAKES_STAIRS.get()), blockTexture(ModBlocks.MANGROVE_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.MANGROVE_SHAKES_SLAB.get()), blockTexture(ModBlocks.MANGROVE_SHAKES.get()),
                blockTexture(ModBlocks.MANGROVE_SHAKES.get()));

        blockWithItem(ModBlocks.CHERRY_COMPACT_PLANKS);
        blockWithItem(ModBlocks.CHERRY_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.CHERRY_SHAKES_STAIRS.get()), blockTexture(ModBlocks.CHERRY_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.CHERRY_SHAKES_SLAB.get()), blockTexture(ModBlocks.CHERRY_SHAKES.get()),
                blockTexture(ModBlocks.CHERRY_SHAKES.get()));

        blockWithItem(ModBlocks.BAMBOO_COMPACT_PLANKS);
        blockWithItem(ModBlocks.BAMBOO_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.BAMBOO_SHAKES_STAIRS.get()), blockTexture(ModBlocks.BAMBOO_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.BAMBOO_SHAKES_SLAB.get()), blockTexture(ModBlocks.BAMBOO_SHAKES.get()),
                blockTexture(ModBlocks.BAMBOO_SHAKES.get()));

        blockWithItem(ModBlocks.CRIMSON_COMPACT_PLANKS);
        blockWithItem(ModBlocks.CRIMSON_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.CRIMSON_SHAKES_STAIRS.get()), blockTexture(ModBlocks.CRIMSON_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.CRIMSON_SHAKES_SLAB.get()), blockTexture(ModBlocks.CRIMSON_SHAKES.get()),
                blockTexture(ModBlocks.CRIMSON_SHAKES.get()));

        blockWithItem(ModBlocks.WARPED_COMPACT_PLANKS);
        blockWithItem(ModBlocks.WARPED_SHAKES);
        stairsBlock(((StairBlock) ModBlocks.WARPED_SHAKES_STAIRS.get()), blockTexture(ModBlocks.WARPED_SHAKES.get()));
        slabBlock(((SlabBlock) ModBlocks.WARPED_SHAKES_SLAB.get()), blockTexture(ModBlocks.WARPED_SHAKES.get()),
                blockTexture(ModBlocks.WARPED_SHAKES.get()));

        blockWithItem(ModBlocks.CHUNKY_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHUNKY_BRICK_STAIRS.get()), blockTexture(ModBlocks.CHUNKY_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHUNKY_BRICK_SLAB.get()), blockTexture(ModBlocks.CHUNKY_BRICKS.get()),
                blockTexture(ModBlocks.CHUNKY_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.CHUNKY_BRICK_WALL.get()), blockTexture(ModBlocks.CHUNKY_BRICKS.get()));

        blockWithItem(ModBlocks.TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.WHITE_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.GRAY_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.BLACK_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.BROWN_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.RED_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.ORANGE_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.YELLOW_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.LIME_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.GREEN_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.CYAN_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.BLUE_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.PURPLE_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.PINK_TERRACOTTA_TRIM);
        blockWithItem(ModBlocks.MAGENTA_TERRACOTTA_TRIM);

        blockWithItem(ModBlocks.CUT_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.CUT_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.CUT_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CUT_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.CUT_COBBLESTONE.get()),
                blockTexture(ModBlocks.CUT_COBBLESTONE.get()));
        wallBlock(((WallBlock) ModBlocks.CUT_COBBLESTONE_WALL.get()), blockTexture(ModBlocks.CUT_COBBLESTONE.get()));

        blockWithItem(ModBlocks.MOSSY_CUT_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.MOSSY_CUT_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.MOSSY_CUT_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.MOSSY_CUT_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.MOSSY_CUT_COBBLESTONE.get()),
                blockTexture(ModBlocks.MOSSY_CUT_COBBLESTONE.get()));
        wallBlock(((WallBlock) ModBlocks.MOSSY_CUT_COBBLESTONE_WALL.get()), blockTexture(ModBlocks.MOSSY_CUT_COBBLESTONE.get()));

        simpleBlock(ModBlocks.CARVED_STONE.get(), models().orientable("carved_stone",
                modLoc("block/carved_stone"), modLoc("block/carved_stone"), modLoc("block/carved_stone_top")));
        simpleBlock(ModBlocks.CARVED_GRANITE.get(), models().orientable("carved_granite",
                modLoc("block/carved_granite"), modLoc("block/carved_granite"), modLoc("block/carved_granite_top")));
        simpleBlock(ModBlocks.CARVED_DIORITE.get(), models().orientable("carved_diorite",
                modLoc("block/carved_diorite"), modLoc("block/carved_diorite"), modLoc("block/carved_diorite_top")));
        simpleBlock(ModBlocks.CARVED_ANDESITE.get(), models().orientable("carved_andesite",
                modLoc("block/carved_andesite"), modLoc("block/carved_andesite"), modLoc("block/carved_andesite_top")));

        blockWithItem(ModBlocks.SUGARCRETE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.SUGARCRETE_BRICK_STAIRS.get()), blockTexture(ModBlocks.SUGARCRETE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SUGARCRETE_BRICK_SLAB.get()), blockTexture(ModBlocks.SUGARCRETE_BRICKS.get()),
                blockTexture(ModBlocks.SUGARCRETE_BRICKS.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.FRESH_BAMBOO_BLOCK.get()), blockTexture(ModBlocks.FRESH_BAMBOO_BLOCK.get()),
                new ResourceLocation(Built.MOD_ID, "block/fresh_bamboo_block_top"));

        blockWithItem(ModBlocks.CUT_FRESH_BAMBOO);
        stairsBlock(((StairBlock) ModBlocks.CUT_FRESH_BAMBOO_STAIRS.get()), blockTexture(ModBlocks.CUT_FRESH_BAMBOO.get()));
        slabBlock(((SlabBlock) ModBlocks.CUT_FRESH_BAMBOO_SLAB.get()), blockTexture(ModBlocks.CUT_FRESH_BAMBOO.get()),
                blockTexture(ModBlocks.CUT_FRESH_BAMBOO.get()));

        blockWithItem(ModBlocks.CUT_BAMBOO);
        stairsBlock(((StairBlock) ModBlocks.CUT_BAMBOO_STAIRS.get()), blockTexture(ModBlocks.CUT_BAMBOO.get()));
        slabBlock(((SlabBlock) ModBlocks.CUT_BAMBOO_SLAB.get()), blockTexture(ModBlocks.CUT_BAMBOO.get()),
                blockTexture(ModBlocks.CUT_BAMBOO.get()));

        blockWithItem(ModBlocks.CUT_STRIPPED_BAMBOO);
        stairsBlock(((StairBlock) ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS.get()), blockTexture(ModBlocks.CUT_STRIPPED_BAMBOO.get()));
        slabBlock(((SlabBlock) ModBlocks.CUT_STRIPPED_BAMBOO_SLAB.get()), blockTexture(ModBlocks.CUT_STRIPPED_BAMBOO.get()),
                blockTexture(ModBlocks.CUT_STRIPPED_BAMBOO.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}