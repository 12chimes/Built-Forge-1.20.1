package net.truly.built.datagen;

import net.truly.built.Built;
import net.truly.built.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Built.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.OAK_COMPACT_PLANKS.get(),
                        ModBlocks.OAK_SHAKES.get(),
                        ModBlocks.SPRUCE_COMPACT_PLANKS.get(),
                        ModBlocks.SPRUCE_SHAKES.get(),
                        ModBlocks.BIRCH_COMPACT_PLANKS.get(),
                        ModBlocks.BIRCH_SHAKES.get(),
                        ModBlocks.JUNGLE_COMPACT_PLANKS.get(),
                        ModBlocks.JUNGLE_SHAKES.get(),
                        ModBlocks.ACACIA_COMPACT_PLANKS.get(),
                        ModBlocks.ACACIA_SHAKES.get(),
                        ModBlocks.DARK_OAK_COMPACT_PLANKS.get(),
                        ModBlocks.DARK_OAK_SHAKES.get(),
                        ModBlocks.MANGROVE_COMPACT_PLANKS.get(),
                        ModBlocks.MANGROVE_SHAKES.get(),
                        ModBlocks.CHERRY_COMPACT_PLANKS.get(),
                        ModBlocks.CHERRY_SHAKES.get(),
                        ModBlocks.BAMBOO_COMPACT_PLANKS.get(),
                        ModBlocks.BAMBOO_SHAKES.get(),
                        ModBlocks.CRIMSON_COMPACT_PLANKS.get(),
                        ModBlocks.CRIMSON_SHAKES.get(),
                        ModBlocks.WARPED_COMPACT_PLANKS.get(),
                        ModBlocks.WARPED_SHAKES.get(),

                        ModBlocks.FRESH_BAMBOO_BLOCK.get(),
                        ModBlocks.CUT_FRESH_BAMBOO.get(),
                        ModBlocks.CUT_BAMBOO.get(),
                        ModBlocks.CUT_STRIPPED_BAMBOO.get()




                        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CHUNKY_BRICKS.get(),
                        ModBlocks.CHUNKY_BRICK_STAIRS.get(),
                        ModBlocks.CHUNKY_BRICK_SLAB.get(),
                        ModBlocks.CUT_COBBLESTONE.get(),
                        ModBlocks.CUT_COBBLESTONE_STAIRS.get(),
                        ModBlocks.CUT_COBBLESTONE_SLAB.get(),
                        ModBlocks.MOSSY_CUT_COBBLESTONE.get(),
                        ModBlocks.MOSSY_CUT_COBBLESTONE_STAIRS.get(),
                        ModBlocks.MOSSY_CUT_COBBLESTONE_SLAB.get(),
                        ModBlocks.CARVED_STONE.get(),
                        ModBlocks.CARVED_GRANITE.get(),
                        ModBlocks.CARVED_DIORITE.get(),
                        ModBlocks.CARVED_ANDESITE.get(),
                        ModBlocks.SUGARCRETE_BRICKS.get(),
                        ModBlocks.SUGARCRETE_BRICK_STAIRS.get(),
                        ModBlocks.SUGARCRETE_BRICK_SLAB.get()
                );

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.OAK_SHAKES_STAIRS.get(),
                        ModBlocks.SPRUCE_SHAKES_STAIRS.get(),
                        ModBlocks.BIRCH_SHAKES_STAIRS.get(),
                        ModBlocks.JUNGLE_SHAKES_STAIRS.get(),
                        ModBlocks.ACACIA_SHAKES_STAIRS.get(),
                        ModBlocks.DARK_OAK_SHAKES_STAIRS.get(),
                        ModBlocks.MANGROVE_SHAKES_STAIRS.get(),
                        ModBlocks.CHERRY_SHAKES_STAIRS.get(),
                        ModBlocks.BAMBOO_SHAKES_STAIRS.get(),
                        ModBlocks.CRIMSON_SHAKES_STAIRS.get(),
                        ModBlocks.WARPED_SHAKES_STAIRS.get(),
                        ModBlocks.CUT_FRESH_BAMBOO_STAIRS.get(),
                        ModBlocks.CUT_BAMBOO_STAIRS.get(),
                        ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS.get()
                );

        this.tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.OAK_SHAKES_SLAB.get(),
                        ModBlocks.SPRUCE_SHAKES_SLAB.get(),
                        ModBlocks.BIRCH_SHAKES_SLAB.get(),
                        ModBlocks.JUNGLE_SHAKES_SLAB.get(),
                        ModBlocks.ACACIA_SHAKES_SLAB.get(),
                        ModBlocks.DARK_OAK_SHAKES_SLAB.get(),
                        ModBlocks.MANGROVE_SHAKES_SLAB.get(),
                        ModBlocks.CHERRY_SHAKES_SLAB.get(),
                        ModBlocks.BAMBOO_SHAKES_SLAB.get(),
                        ModBlocks.CRIMSON_SHAKES_SLAB.get(),
                        ModBlocks.WARPED_SHAKES_SLAB.get(),
                        ModBlocks.CUT_FRESH_BAMBOO_SLAB.get(),
                        ModBlocks.CUT_BAMBOO_SLAB.get(),
                        ModBlocks.CUT_STRIPPED_BAMBOO_SLAB.get()
                );

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.CHUNKY_BRICK_WALL.get(),
                        ModBlocks.CUT_COBBLESTONE_WALL.get(),
                        ModBlocks.MOSSY_CUT_COBBLESTONE_WALL.get()


                );


    }
}