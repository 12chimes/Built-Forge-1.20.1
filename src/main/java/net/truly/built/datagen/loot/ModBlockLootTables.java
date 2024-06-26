package net.truly.built.datagen.loot;

import net.truly.built.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.OAK_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.OAK_SHAKES.get());
        this.dropSelf(ModBlocks.OAK_SHAKES_STAIRS.get());
        this.add(ModBlocks.OAK_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.SPRUCE_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.SPRUCE_SHAKES.get());
        this.dropSelf(ModBlocks.SPRUCE_SHAKES_STAIRS.get());
        this.add(ModBlocks.SPRUCE_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.BIRCH_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.BIRCH_SHAKES.get());
        this.dropSelf(ModBlocks.BIRCH_SHAKES_STAIRS.get());
        this.add(ModBlocks.BIRCH_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.JUNGLE_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.JUNGLE_SHAKES.get());
        this.dropSelf(ModBlocks.JUNGLE_SHAKES_STAIRS.get());
        this.add(ModBlocks.JUNGLE_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.ACACIA_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.ACACIA_SHAKES.get());
        this.dropSelf(ModBlocks.ACACIA_SHAKES_STAIRS.get());
        this.add(ModBlocks.ACACIA_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.DARK_OAK_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.DARK_OAK_SHAKES.get());
        this.dropSelf(ModBlocks.DARK_OAK_SHAKES_STAIRS.get());
        this.add(ModBlocks.DARK_OAK_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.MANGROVE_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.MANGROVE_SHAKES.get());
        this.dropSelf(ModBlocks.MANGROVE_SHAKES_STAIRS.get());
        this.add(ModBlocks.MANGROVE_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.CHERRY_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.CHERRY_SHAKES.get());
        this.dropSelf(ModBlocks.CHERRY_SHAKES_STAIRS.get());
        this.add(ModBlocks.CHERRY_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.BAMBOO_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.BAMBOO_SHAKES.get());
        this.dropSelf(ModBlocks.BAMBOO_SHAKES_STAIRS.get());
        this.add(ModBlocks.BAMBOO_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BAMBOO_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.CRIMSON_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.CRIMSON_SHAKES.get());
        this.dropSelf(ModBlocks.CRIMSON_SHAKES_STAIRS.get());
        this.add(ModBlocks.CRIMSON_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_SHAKES_SLAB.get()));

        this.dropSelf(ModBlocks.WARPED_COMPACT_PLANKS.get());
        this.dropSelf(ModBlocks.WARPED_SHAKES.get());
        this.dropSelf(ModBlocks.WARPED_SHAKES_STAIRS.get());
        this.add(ModBlocks.WARPED_SHAKES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_SHAKES_SLAB.get()));



        this.dropSelf(ModBlocks.CHUNKY_BRICKS.get());
        this.dropSelf(ModBlocks.CHUNKY_BRICK_STAIRS.get());
        this.add(ModBlocks.CHUNKY_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHUNKY_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CHUNKY_BRICK_WALL.get());



        this.dropSelf(ModBlocks.TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.LIME_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.PINK_TERRACOTTA_TRIM.get());
        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_TRIM.get());



        this.dropSelf(ModBlocks.CUT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CUT_COBBLESTONE_STAIRS.get());
        this.add(ModBlocks.CUT_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_COBBLESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.CUT_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.CUT_MOSSY_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS.get());
        this.add(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.CUT_MOSSY_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.CARVED_STONE.get());
        this.dropSelf(ModBlocks.CARVED_GRANITE.get());
        this.dropSelf(ModBlocks.CARVED_DIORITE.get());
        this.dropSelf(ModBlocks.CARVED_ANDESITE.get());

        this.dropSelf(ModBlocks.SUGARCRETE_BRICKS.get());
        this.dropSelf(ModBlocks.SUGARCRETE_BRICK_STAIRS.get());
        this.add(ModBlocks.SUGARCRETE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SUGARCRETE_BRICK_SLAB.get()));

        this.dropSelf(ModBlocks.FRESH_BAMBOO_BLOCK.get());

        this.dropSelf(ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get());
        this.dropSelf(ModBlocks.CUT_FRESH_BAMBOO_STAIRS.get());
        this.add(ModBlocks.CUT_FRESH_BAMBOO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_FRESH_BAMBOO_SLAB.get()));

        this.dropSelf(ModBlocks.CUT_BAMBOO_BLOCK.get());
        this.dropSelf(ModBlocks.CUT_BAMBOO_STAIRS.get());
        this.add(ModBlocks.CUT_BAMBOO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_BAMBOO_SLAB.get()));

        this.dropSelf(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get());
        this.dropSelf(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS.get());
        this.add(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB.get()));

        this.dropSelf(ModBlocks.MUD_POT.get());

        this.dropSelf(ModBlocks.POLISHED_PACKED_MUD.get());

        this.dropSelf(ModBlocks.MUD_SHINGLES.get());
        this.dropSelf(ModBlocks.MUD_SHINGLES_STAIRS.get());
        this.add(ModBlocks.MUD_SHINGLES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MUD_SHINGLES_SLAB.get()));
        this.dropSelf(ModBlocks.MUD_SHINGLES_WALL.get());

        this.dropSelf(ModBlocks.STONE_SHINGLES.get());
        this.dropSelf(ModBlocks.STONE_SHINGLES_STAIRS.get());
        this.add(ModBlocks.STONE_SHINGLES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.STONE_SHINGLES_SLAB.get()));
        this.dropSelf(ModBlocks.STONE_SHINGLES_WALL.get());

        this.dropSelf(ModBlocks.MOSSY_STONE_SHINGLES.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS.get());
        this.add(ModBlocks.MOSSY_STONE_SHINGLES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_STONE_SHINGLES_SLAB.get()));
        this.dropSelf(ModBlocks.MOSSY_STONE_SHINGLES_WALL.get());

        this.dropSelf(ModBlocks.SANDSTONE_SHINGLES.get());
        this.dropSelf(ModBlocks.SANDSTONE_SHINGLES_STAIRS.get());
        this.add(ModBlocks.SANDSTONE_SHINGLES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SANDSTONE_SHINGLES_SLAB.get()));
        this.dropSelf(ModBlocks.SANDSTONE_SHINGLES_WALL.get());

        this.dropSelf(ModBlocks.DEEPSLATE_SHINGLES.get());
        this.dropSelf(ModBlocks.DEEPSLATE_SHINGLES_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_SHINGLES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEEPSLATE_SHINGLES_SLAB.get()));
        this.dropSelf(ModBlocks.DEEPSLATE_SHINGLES_WALL.get());

        this.dropSelf(ModBlocks.IRON_GRATE.get());

        this.add(ModBlocks.FRAMED_GLASS.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.FRAMED_GLASS.get()));

        this.add(ModBlocks.FRAMED_GLASS_PANE.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.FRAMED_GLASS_PANE.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}