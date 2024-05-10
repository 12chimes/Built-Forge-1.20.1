package net.truly.built.datagen;

import net.minecraft.world.item.Items;
import net.truly.built.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //OAK

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.OAK_PLANKS)
                .define('S', Items.STRIPPED_OAK_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.OAK_PLANKS)
                .define('S', Items.STRIPPED_OAK_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.OAK_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.OAK_SHAKES.get()), has(ModBlocks.OAK_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.OAK_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.OAK_SHAKES.get()), has(ModBlocks.OAK_SHAKES.get()))
                .save(pWriter);

        //SPRUCE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.SPRUCE_PLANKS)
                .define('S', Items.STRIPPED_SPRUCE_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_SPRUCE_LOG), has(Items.STRIPPED_SPRUCE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.SPRUCE_PLANKS)
                .define('S', Items.STRIPPED_SPRUCE_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_SPRUCE_LOG), has(Items.STRIPPED_SPRUCE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.SPRUCE_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.SPRUCE_SHAKES.get()), has(ModBlocks.SPRUCE_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.SPRUCE_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.SPRUCE_SHAKES.get()), has(ModBlocks.SPRUCE_SHAKES.get()))
                .save(pWriter);

        //BIRCH

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.BIRCH_PLANKS)
                .define('S', Items.STRIPPED_BIRCH_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_BIRCH_LOG), has(Items.STRIPPED_BIRCH_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.BIRCH_PLANKS)
                .define('S', Items.STRIPPED_BIRCH_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_BIRCH_LOG), has(Items.STRIPPED_BIRCH_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.BIRCH_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.BIRCH_SHAKES.get()), has(ModBlocks.BIRCH_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.BIRCH_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.BIRCH_SHAKES.get()), has(ModBlocks.BIRCH_SHAKES.get()))
                .save(pWriter);

        //JUNGLE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.JUNGLE_PLANKS)
                .define('S', Items.STRIPPED_JUNGLE_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_JUNGLE_LOG), has(Items.STRIPPED_JUNGLE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.JUNGLE_PLANKS)
                .define('S', Items.STRIPPED_JUNGLE_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_JUNGLE_LOG), has(Items.STRIPPED_JUNGLE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.JUNGLE_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.JUNGLE_SHAKES.get()), has(ModBlocks.JUNGLE_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.JUNGLE_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.JUNGLE_SHAKES.get()), has(ModBlocks.JUNGLE_SHAKES.get()))
                .save(pWriter);

        //ACACIA

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.ACACIA_PLANKS)
                .define('S', Items.STRIPPED_ACACIA_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_ACACIA_LOG), has(Items.STRIPPED_ACACIA_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.ACACIA_PLANKS)
                .define('S', Items.STRIPPED_ACACIA_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_ACACIA_LOG), has(Items.STRIPPED_ACACIA_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.ACACIA_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.ACACIA_SHAKES.get()), has(ModBlocks.ACACIA_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.ACACIA_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.ACACIA_SHAKES.get()), has(ModBlocks.ACACIA_SHAKES.get()))
                .save(pWriter);

        //DARK OAK

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.DARK_OAK_PLANKS)
                .define('S', Items.STRIPPED_DARK_OAK_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_DARK_OAK_LOG), has(Items.STRIPPED_DARK_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.DARK_OAK_PLANKS)
                .define('S', Items.STRIPPED_DARK_OAK_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_DARK_OAK_LOG), has(Items.STRIPPED_DARK_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.DARK_OAK_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.DARK_OAK_SHAKES.get()), has(ModBlocks.DARK_OAK_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.DARK_OAK_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.DARK_OAK_SHAKES.get()), has(ModBlocks.DARK_OAK_SHAKES.get()))
                .save(pWriter);

        //MANGROVE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.MANGROVE_PLANKS)
                .define('S', Items.STRIPPED_MANGROVE_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_MANGROVE_LOG), has(Items.STRIPPED_MANGROVE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.MANGROVE_PLANKS)
                .define('S', Items.STRIPPED_MANGROVE_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_MANGROVE_LOG), has(Items.STRIPPED_MANGROVE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.MANGROVE_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.MANGROVE_SHAKES.get()), has(ModBlocks.MANGROVE_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.MANGROVE_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.MANGROVE_SHAKES.get()), has(ModBlocks.MANGROVE_SHAKES.get()))
                .save(pWriter);

        //CHERRY

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.CHERRY_PLANKS)
                .define('S', Items.STRIPPED_CHERRY_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_CHERRY_LOG), has(Items.STRIPPED_CHERRY_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.CHERRY_PLANKS)
                .define('S', Items.STRIPPED_CHERRY_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_CHERRY_LOG), has(Items.STRIPPED_CHERRY_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CHERRY_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.CHERRY_SHAKES.get()), has(ModBlocks.CHERRY_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CHERRY_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.CHERRY_SHAKES.get()), has(ModBlocks.CHERRY_SHAKES.get()))
                .save(pWriter);

        //BAMBOO

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.BAMBOO_PLANKS)
                .define('S', Items.STRIPPED_BAMBOO_BLOCK)
                .unlockedBy(getHasName(Items.STRIPPED_BAMBOO_BLOCK), has(Items.STRIPPED_BAMBOO_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.BAMBOO_PLANKS)
                .define('S', Items.STRIPPED_BAMBOO_BLOCK)
                .unlockedBy(getHasName(Items.STRIPPED_BAMBOO_BLOCK), has(Items.STRIPPED_BAMBOO_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.BAMBOO_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.BAMBOO_SHAKES.get()), has(ModBlocks.BAMBOO_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.BAMBOO_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.BAMBOO_SHAKES.get()), has(ModBlocks.BAMBOO_SHAKES.get()))
                .save(pWriter);

        //CRIMSON

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.CRIMSON_PLANKS)
                .define('S', Items.STRIPPED_CRIMSON_STEM)
                .unlockedBy(getHasName(Items.STRIPPED_CRIMSON_STEM), has(Items.STRIPPED_CRIMSON_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.CRIMSON_PLANKS)
                .define('S', Items.STRIPPED_CRIMSON_STEM)
                .unlockedBy(getHasName(Items.STRIPPED_CRIMSON_STEM), has(Items.STRIPPED_CRIMSON_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CRIMSON_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.CRIMSON_SHAKES.get()), has(ModBlocks.CRIMSON_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CRIMSON_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.CRIMSON_SHAKES.get()), has(ModBlocks.CRIMSON_SHAKES.get()))
                .save(pWriter);

        //WARPED

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.WARPED_PLANKS)
                .define('S', Items.STRIPPED_WARPED_STEM)
                .unlockedBy(getHasName(Items.STRIPPED_WARPED_STEM), has(Items.STRIPPED_WARPED_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SHAKES.get(), 4)
                .pattern("S#")
                .pattern("#S")
                .define('#', Items.WARPED_PLANKS)
                .define('S', Items.STRIPPED_WARPED_STEM)
                .unlockedBy(getHasName(Items.STRIPPED_WARPED_STEM), has(Items.STRIPPED_WARPED_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SHAKES_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.WARPED_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_SHAKES.get()), has(ModBlocks.WARPED_SHAKES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SHAKES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.WARPED_SHAKES.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_SHAKES.get()), has(ModBlocks.WARPED_SHAKES.get()))
                .save(pWriter);

    }
}