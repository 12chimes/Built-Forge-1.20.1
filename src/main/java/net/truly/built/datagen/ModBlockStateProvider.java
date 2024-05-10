package net.truly.built.datagen;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}