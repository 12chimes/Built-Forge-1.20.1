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
                        ModBlocks.OAK_SHAKES_STAIRS.get(),
                        ModBlocks.OAK_SHAKES_SLAB.get(),

                        ModBlocks.SPRUCE_COMPACT_PLANKS.get(),
                        ModBlocks.SPRUCE_SHAKES.get(),
                        ModBlocks.SPRUCE_SHAKES_STAIRS.get(),
                        ModBlocks.SPRUCE_SHAKES_SLAB.get(),

                        ModBlocks.BIRCH_COMPACT_PLANKS.get(),
                        ModBlocks.BIRCH_SHAKES.get(),
                        ModBlocks.BIRCH_SHAKES_STAIRS.get(),
                        ModBlocks.BIRCH_SHAKES_SLAB.get(),

                        ModBlocks.JUNGLE_COMPACT_PLANKS.get(),
                        ModBlocks.JUNGLE_SHAKES.get(),
                        ModBlocks.JUNGLE_SHAKES_STAIRS.get(),
                        ModBlocks.JUNGLE_SHAKES_SLAB.get(),

                        ModBlocks.ACACIA_COMPACT_PLANKS.get(),
                        ModBlocks.ACACIA_SHAKES.get(),
                        ModBlocks.ACACIA_SHAKES_STAIRS.get(),
                        ModBlocks.ACACIA_SHAKES_SLAB.get(),

                        ModBlocks.DARK_OAK_COMPACT_PLANKS.get(),
                        ModBlocks.DARK_OAK_SHAKES.get(),
                        ModBlocks.DARK_OAK_SHAKES_STAIRS.get(),
                        ModBlocks.DARK_OAK_SHAKES_SLAB.get(),

                        ModBlocks.MANGROVE_COMPACT_PLANKS.get(),
                        ModBlocks.MANGROVE_SHAKES.get(),
                        ModBlocks.MANGROVE_SHAKES_STAIRS.get(),
                        ModBlocks.MANGROVE_SHAKES_SLAB.get(),

                        ModBlocks.CHERRY_COMPACT_PLANKS.get(),
                        ModBlocks.CHERRY_SHAKES.get(),
                        ModBlocks.CHERRY_SHAKES_STAIRS.get(),
                        ModBlocks.CHERRY_SHAKES_SLAB.get(),

                        ModBlocks.BAMBOO_COMPACT_PLANKS.get(),
                        ModBlocks.BAMBOO_SHAKES.get(),
                        ModBlocks.BAMBOO_SHAKES_STAIRS.get(),
                        ModBlocks.BAMBOO_SHAKES_SLAB.get(),

                        ModBlocks.CRIMSON_COMPACT_PLANKS.get(),
                        ModBlocks.CRIMSON_SHAKES.get(),
                        ModBlocks.CRIMSON_SHAKES_STAIRS.get(),
                        ModBlocks.CRIMSON_SHAKES_SLAB.get(),

                        ModBlocks.WARPED_COMPACT_PLANKS.get(),
                        ModBlocks.WARPED_SHAKES.get(),
                        ModBlocks.WARPED_SHAKES_STAIRS.get(),
                        ModBlocks.WARPED_SHAKES_SLAB.get()


                        );


    }
}