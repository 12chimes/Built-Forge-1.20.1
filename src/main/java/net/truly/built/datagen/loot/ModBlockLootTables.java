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


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}