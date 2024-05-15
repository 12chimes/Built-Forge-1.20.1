package net.truly.built.datagen;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
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

        //COMPACT PLANKS

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.OAK_PLANKS)
                .define('S', Items.STRIPPED_OAK_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.SPRUCE_PLANKS)
                .define('S', Items.STRIPPED_SPRUCE_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_SPRUCE_LOG), has(Items.STRIPPED_SPRUCE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.BIRCH_PLANKS)
                .define('S', Items.STRIPPED_BIRCH_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_BIRCH_LOG), has(Items.STRIPPED_BIRCH_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.JUNGLE_PLANKS)
                .define('S', Items.STRIPPED_JUNGLE_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_JUNGLE_LOG), has(Items.STRIPPED_JUNGLE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.ACACIA_PLANKS)
                .define('S', Items.STRIPPED_ACACIA_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_ACACIA_LOG), has(Items.STRIPPED_ACACIA_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.DARK_OAK_PLANKS)
                .define('S', Items.STRIPPED_DARK_OAK_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_DARK_OAK_LOG), has(Items.STRIPPED_DARK_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.MANGROVE_PLANKS)
                .define('S', Items.STRIPPED_MANGROVE_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_MANGROVE_LOG), has(Items.STRIPPED_MANGROVE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.CHERRY_PLANKS)
                .define('S', Items.STRIPPED_CHERRY_LOG)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_CHERRY_LOG), has(Items.STRIPPED_CHERRY_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.BAMBOO_PLANKS)
                .define('S', Items.STRIPPED_BAMBOO_BLOCK)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_BAMBOO_BLOCK), has(Items.STRIPPED_BAMBOO_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.CRIMSON_PLANKS)
                .define('S', Items.STRIPPED_CRIMSON_STEM)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_CRIMSON_STEM), has(Items.STRIPPED_CRIMSON_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_COMPACT_PLANKS.get(), 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.WARPED_PLANKS)
                .define('S', Items.STRIPPED_WARPED_STEM)
                .group("compact_planks")
                .unlockedBy(getHasName(Items.STRIPPED_WARPED_STEM), has(Items.STRIPPED_WARPED_STEM))
                .save(pWriter);

        //SHAKES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.OAK_PLANKS)
                .define('S', Items.STRIPPED_OAK_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.SPRUCE_PLANKS)
                .define('S', Items.STRIPPED_SPRUCE_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_SPRUCE_LOG), has(Items.STRIPPED_SPRUCE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.BIRCH_PLANKS)
                .define('S', Items.STRIPPED_BIRCH_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_BIRCH_LOG), has(Items.STRIPPED_BIRCH_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.JUNGLE_PLANKS)
                .define('S', Items.STRIPPED_JUNGLE_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_JUNGLE_LOG), has(Items.STRIPPED_JUNGLE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.ACACIA_PLANKS)
                .define('S', Items.STRIPPED_ACACIA_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_ACACIA_LOG), has(Items.STRIPPED_ACACIA_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.DARK_OAK_PLANKS)
                .define('S', Items.STRIPPED_DARK_OAK_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_DARK_OAK_LOG), has(Items.STRIPPED_DARK_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.MANGROVE_PLANKS)
                .define('S', Items.STRIPPED_MANGROVE_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_MANGROVE_LOG), has(Items.STRIPPED_MANGROVE_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.CHERRY_PLANKS)
                .define('S', Items.STRIPPED_CHERRY_LOG)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_CHERRY_LOG), has(Items.STRIPPED_CHERRY_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.BAMBOO_PLANKS)
                .define('S', Items.STRIPPED_BAMBOO_BLOCK)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_BAMBOO_BLOCK), has(Items.STRIPPED_BAMBOO_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.CRIMSON_PLANKS)
                .define('S', Items.STRIPPED_CRIMSON_STEM)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_CRIMSON_STEM), has(Items.STRIPPED_CRIMSON_STEM))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.WARPED_PLANKS)
                .define('S', Items.STRIPPED_WARPED_STEM)
                .group("wood_shakes")
                .unlockedBy(getHasName(Items.STRIPPED_WARPED_STEM), has(Items.STRIPPED_WARPED_STEM))
                .save(pWriter);

        //CHUNKY BRICKS

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.BRICKS)
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICKS.get())
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(pWriter, "cut_chunky_bricks");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CHUNKY_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CHUNKY_BRICKS.get()), has(ModBlocks.CHUNKY_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CHUNKY_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CHUNKY_BRICKS.get()), has(ModBlocks.CHUNKY_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.CHUNKY_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CHUNKY_BRICKS.get()), has(ModBlocks.CHUNKY_BRICKS.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CHUNKY_BRICKS.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.CHUNKY_BRICKS.get()), has(ModBlocks.CHUNKY_BRICKS.get()))
                .save(pWriter, "cut_chunky_brick_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_STAIRS.get())
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(pWriter, "cut2_chunky_brick_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CHUNKY_BRICKS.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.CHUNKY_BRICKS.get()), has(ModBlocks.CHUNKY_BRICKS.get()))
                .save(pWriter, "cut_chunky_brick_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(pWriter, "cut2_chunky_brick_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CHUNKY_BRICKS.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_WALL.get())
                .unlockedBy(getHasName(ModBlocks.CHUNKY_BRICKS.get()), has(ModBlocks.CHUNKY_BRICKS.get()))
                .save(pWriter, "cut_chunky_brick_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_WALL.get())
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(pWriter, "cut2_chunky_brick_wall");

        //TERRACOTTA TRIM

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .save(pWriter,"cut_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.WHITE_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.WHITE_TERRACOTTA), has(Items.WHITE_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.WHITE_TERRACOTTA), has(Items.WHITE_TERRACOTTA))
                .save(pWriter,"cut_white_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.LIGHT_GRAY_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.LIGHT_GRAY_TERRACOTTA), has(Items.LIGHT_GRAY_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.LIGHT_GRAY_TERRACOTTA), has(Items.LIGHT_GRAY_TERRACOTTA))
                .save(pWriter,"cut_light_gray_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.GRAY_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.GRAY_TERRACOTTA), has(Items.GRAY_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.GRAY_TERRACOTTA), has(Items.GRAY_TERRACOTTA))
                .save(pWriter,"cut_gray_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.BLACK_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.BLACK_TERRACOTTA), has(Items.BLACK_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.BLACK_TERRACOTTA), has(Items.BLACK_TERRACOTTA))
                .save(pWriter,"cut_black_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.BROWN_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.BROWN_TERRACOTTA), has(Items.BROWN_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.BROWN_TERRACOTTA), has(Items.BROWN_TERRACOTTA))
                .save(pWriter,"cut_brown_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.RED_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.RED_TERRACOTTA), has(Items.RED_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.RED_TERRACOTTA), has(Items.RED_TERRACOTTA))
                .save(pWriter,"cut_red_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.ORANGE_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.ORANGE_TERRACOTTA), has(Items.ORANGE_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.ORANGE_TERRACOTTA), has(Items.ORANGE_TERRACOTTA))
                .save(pWriter,"cut_orange_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.YELLOW_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.YELLOW_TERRACOTTA), has(Items.YELLOW_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.YELLOW_TERRACOTTA), has(Items.YELLOW_TERRACOTTA))
                .save(pWriter,"cut_yellow_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.LIME_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.LIME_TERRACOTTA), has(Items.LIME_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.LIME_TERRACOTTA), has(Items.LIME_TERRACOTTA))
                .save(pWriter,"cut_lime_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.GREEN_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.GREEN_TERRACOTTA), has(Items.GREEN_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.GREEN_TERRACOTTA), has(Items.GREEN_TERRACOTTA))
                .save(pWriter,"cut_green_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.LIGHT_BLUE_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.LIGHT_BLUE_TERRACOTTA), has(Items.LIGHT_BLUE_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.LIGHT_BLUE_TERRACOTTA), has(Items.LIGHT_BLUE_TERRACOTTA))
                .save(pWriter,"cut_light_blue_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.CYAN_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.CYAN_TERRACOTTA), has(Items.CYAN_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.CYAN_TERRACOTTA), has(Items.CYAN_TERRACOTTA))
                .save(pWriter,"cut_cyan_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.BLUE_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.BLUE_TERRACOTTA), has(Items.BLUE_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.BLUE_TERRACOTTA), has(Items.BLUE_TERRACOTTA))
                .save(pWriter,"cut_blue_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.PURPLE_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.PURPLE_TERRACOTTA), has(Items.PURPLE_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.PURPLE_TERRACOTTA), has(Items.PURPLE_TERRACOTTA))
                .save(pWriter,"cut_purple_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.PINK_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.PINK_TERRACOTTA), has(Items.PINK_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.PINK_TERRACOTTA), has(Items.PINK_TERRACOTTA))
                .save(pWriter,"cut_pink_terracotta_trim");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.MAGENTA_TERRACOTTA)
                .group("terracotta_trim")
                .unlockedBy(getHasName(Items.MAGENTA_TERRACOTTA), has(Items.MAGENTA_TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.MAGENTA_TERRACOTTA), has(Items.MAGENTA_TERRACOTTA))
                .save(pWriter,"cut_magenta_terracotta_trim");

        //CUT COBBLESTONE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.COBBLESTONE)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                .save(pWriter,"cut_cut_cobblestone");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(ModBlocks.CUT_COBBLESTONE.get()), has(ModBlocks.CUT_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(ModBlocks.CUT_COBBLESTONE.get()), has(ModBlocks.CUT_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(ModBlocks.CUT_COBBLESTONE.get()), has(ModBlocks.CUT_COBBLESTONE.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_COBBLESTONE.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.CUT_COBBLESTONE.get()), has(ModBlocks.CUT_COBBLESTONE.get()))
                .save(pWriter, "cut_cut_cobblestone_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_STAIRS.get())
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                .save(pWriter, "cut2_cut_cobblestone_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_COBBLESTONE.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.CUT_COBBLESTONE.get()), has(ModBlocks.CUT_COBBLESTONE.get()))
                .save(pWriter, "cut_cut_cobblestone_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                .save(pWriter, "cut2_cut_cobblestone_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_COBBLESTONE.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_WALL.get())
                .unlockedBy(getHasName(ModBlocks.CUT_COBBLESTONE.get()), has(ModBlocks.CUT_COBBLESTONE.get()))
                .save(pWriter, "cut_cut_cobblestone_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_WALL.get())
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                .save(pWriter, "cut2_cut_cobblestone_wall");

        //MOSSY CUT COBBLESTONE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.MOSSY_COBBLESTONE)
                .unlockedBy(getHasName(Items.MOSSY_COBBLESTONE), has(Items.MOSSY_COBBLESTONE))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MOSSY_COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(Items.MOSSY_COBBLESTONE), has(Items.MOSSY_COBBLESTONE))
                .save(pWriter,"cut_mossy_cut_cobblestone");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .pattern("#S")
                .define('#', ModBlocks.CUT_COBBLESTONE.get())
                .define('S', Items.VINE)
                .group("mossy_cut_cobblestone")
                .unlockedBy(getHasName(Items.VINE), has(Items.VINE))
                .save(pWriter, "vine_mossy_cut_cobblestone");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .pattern("#S")
                .define('#', ModBlocks.CUT_COBBLESTONE.get())
                .define('S', Items.MOSS_BLOCK)
                .group("mossy_cut_cobblestone")
                .unlockedBy(getHasName(Items.MOSS_BLOCK), has(Items.MOSS_BLOCK))
                .save(pWriter, "moss_mossy_cut_cobblestone");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_CUT_COBBLESTONE.get()), has(ModBlocks.MOSSY_CUT_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_CUT_COBBLESTONE.get()), has(ModBlocks.MOSSY_CUT_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_CUT_COBBLESTONE.get()), has(ModBlocks.MOSSY_CUT_COBBLESTONE.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_CUT_COBBLESTONE.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_CUT_COBBLESTONE.get()), has(ModBlocks.MOSSY_CUT_COBBLESTONE.get()))
                .save(pWriter, "cut_mossy_cut_cobblestone_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MOSSY_COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_STAIRS.get())
                .unlockedBy(getHasName(Items.MOSSY_COBBLESTONE), has(Items.MOSSY_COBBLESTONE))
                .save(pWriter, "cut2_mossy_cut_cobblestone_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_CUT_COBBLESTONE.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.MOSSY_CUT_COBBLESTONE.get()), has(ModBlocks.MOSSY_CUT_COBBLESTONE.get()))
                .save(pWriter, "cut_mossy_cut_cobblestone_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MOSSY_COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.MOSSY_COBBLESTONE), has(Items.MOSSY_COBBLESTONE))
                .save(pWriter, "cut2_mossy_cut_cobblestone_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_CUT_COBBLESTONE.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_WALL.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_CUT_COBBLESTONE.get()), has(ModBlocks.MOSSY_CUT_COBBLESTONE.get()))
                .save(pWriter, "cut_mossy_cut_cobblestone_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MOSSY_COBBLESTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CUT_COBBLESTONE_WALL.get())
                .unlockedBy(getHasName(Items.MOSSY_COBBLESTONE), has(Items.MOSSY_COBBLESTONE))
                .save(pWriter, "cut2_mossy_cut_cobblestone_wall");

        //CARVED STONE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_STONE.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.STONE)
                .define('S', Items.STONE_BRICKS)
                .unlockedBy(getHasName(Items.STONE_BRICKS), has(Items.STONE_BRICKS))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_STONE.get())
                .unlockedBy(getHasName(Items.STONE), has(Items.STONE))
                .save(pWriter,"cut_stone_carved_stone");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_STONE.get())
                .unlockedBy(getHasName(Items.STONE_BRICKS), has(Items.STONE_BRICKS))
                .save(pWriter,"cut_stone_bricks_carved_stone");

        //CARVED GRANITE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_GRANITE.get(), 4)
                .pattern("SS")
                .pattern("##")
                .define('#', Items.GRANITE)
                .define('S', Items.POLISHED_GRANITE)
                .unlockedBy(getHasName(Items.POLISHED_GRANITE), has(Items.POLISHED_GRANITE))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_GRANITE.get())
                .unlockedBy(getHasName(Items.GRANITE), has(Items.GRANITE))
                .save(pWriter,"cut_granite_carved_granite");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_GRANITE.get())
                .unlockedBy(getHasName(Items.POLISHED_GRANITE), has(Items.POLISHED_GRANITE))
                .save(pWriter,"cut_polished_granite_carved_granite");

        //CARVED DIORITE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_DIORITE.get(), 4)
                .pattern("SS")
                .pattern("##")
                .define('#', Items.DIORITE)
                .define('S', Items.POLISHED_DIORITE)
                .unlockedBy(getHasName(Items.POLISHED_DIORITE), has(Items.POLISHED_DIORITE))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_DIORITE.get())
                .unlockedBy(getHasName(Items.DIORITE), has(Items.DIORITE))
                .save(pWriter,"cut_diorite_carved_diorite");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_DIORITE.get())
                .unlockedBy(getHasName(Items.POLISHED_DIORITE), has(Items.POLISHED_DIORITE))
                .save(pWriter,"cut_polished_diorite_carved_diorite");

        //CARVED ANDESITE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_ANDESITE.get(), 4)
                .pattern("SS")
                .pattern("##")
                .define('#', Items.ANDESITE)
                .define('S', Items.POLISHED_ANDESITE)
                .unlockedBy(getHasName(Items.POLISHED_ANDESITE), has(Items.POLISHED_ANDESITE))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_ANDESITE.get())
                .unlockedBy(getHasName(Items.ANDESITE), has(Items.ANDESITE))
                .save(pWriter,"cut_andesite_carved_andesite");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_ANDESITE.get())
                .unlockedBy(getHasName(Items.POLISHED_ANDESITE), has(Items.POLISHED_ANDESITE))
                .save(pWriter,"cut_polished_andesite_carved_andesite");

        //SUGARCRETE BRICKS

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("#S")
                .define('#', Items.SUGAR_CANE)
                .define('S', Items.WHEAT)
                .unlockedBy(getHasName(Items.SUGAR_CANE), has(Items.SUGAR_CANE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.SUGARCRETE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SUGARCRETE_BRICKS.get()), has(ModBlocks.SUGARCRETE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.SUGARCRETE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SUGARCRETE_BRICKS.get()), has(ModBlocks.SUGARCRETE_BRICKS.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SUGARCRETE_BRICKS.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.SUGARCRETE_BRICKS.get()), has(ModBlocks.SUGARCRETE_BRICKS.get()))
                .save(pWriter, "cut_sugarcrete_brick_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SUGARCRETE_BRICKS.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.SUGARCRETE_BRICKS.get()), has(ModBlocks.SUGARCRETE_BRICKS.get()))
                .save(pWriter, "cut_sugarcrete_brick_slab");

        //FRESH BAMBOO

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRESH_BAMBOO_BLOCK.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.BAMBOO)
                .unlockedBy(getHasName(Items.BAMBOO), has(Items.BAMBOO))
                .save(pWriter);

        //CUT FRESH BAMBOO

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.FRESH_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.FRESH_BAMBOO_BLOCK.get()), has(ModBlocks.FRESH_BAMBOO_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_FRESH_BAMBOO_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get()), has(ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_FRESH_BAMBOO_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get()), has(ModBlocks.CUT_FRESH_BAMBOO_BLOCK.get()))
                .save(pWriter);

        //CUT BAMBOO

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BAMBOO_BLOCK.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.BAMBOO_BLOCK)
                .unlockedBy(getHasName(Items.BAMBOO_BLOCK), has(Items.BAMBOO_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BAMBOO_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CUT_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CUT_BAMBOO_BLOCK.get()), has(ModBlocks.CUT_BAMBOO_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BAMBOO_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CUT_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CUT_BAMBOO_BLOCK.get()), has(ModBlocks.CUT_BAMBOO_BLOCK.get()))
                .save(pWriter);

        //CUT STRIPPED BAMBOO

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.STRIPPED_BAMBOO_BLOCK)
                .unlockedBy(getHasName(Items.STRIPPED_BAMBOO_BLOCK), has(Items.STRIPPED_BAMBOO_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get()), has(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STRIPPED_BAMBOO_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get()), has(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.get()))
                .save(pWriter);

        //POLISHED MUD

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PACKED_MUD.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.MUD_BRICKS)
                .unlockedBy(getHasName(Items.MUD_BRICKS), has(Items.MUD_BRICKS))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PACKED_MUD.get())
                .unlockedBy(getHasName(Items.PACKED_MUD), has(Items.PACKED_MUD))
                .save(pWriter,"cut_packed_mud_polished_mud");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MUD_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PACKED_MUD.get())
                .unlockedBy(getHasName(Items.MUD_BRICKS), has(Items.MUD_BRICKS))
                .save(pWriter,"cut_mud_bricks_polished_mud");

        //this should be vanilla tbh
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD),
                        RecipeCategory.BUILDING_BLOCKS, Items.MUD_BRICKS)
                .unlockedBy(getHasName(Items.PACKED_MUD), has(Items.PACKED_MUD))
                .save(pWriter,"mud_bricks_from_packed_mud_stonecutting");

        //MUD SHINGLES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', Items.MUD_BRICK_SLAB)
                .unlockedBy(getHasName(Items.MUD_BRICK_SLAB), has(Items.MUD_BRICK_SLAB))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PACKED_MUD),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES.get())
                .unlockedBy(getHasName(Items.PACKED_MUD), has(Items.PACKED_MUD))
                .save(pWriter,"cut_packed_mud_mud_shingles");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MUD_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES.get())
                .unlockedBy(getHasName(Items.MUD_BRICKS), has(Items.MUD_BRICKS))
                .save(pWriter,"cut_mud_bricks_mud_shingles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_STAIRS.get())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.MUD_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.MUD_SHINGLES.get()), has(ModBlocks.MUD_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.MUD_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.MUD_SHINGLES.get()), has(ModBlocks.MUD_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.MUD_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.MUD_SHINGLES.get()), has(ModBlocks.MUD_SHINGLES.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MUD_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.MUD_SHINGLES.get()), has(ModBlocks.MUD_SHINGLES.get()))
                .save(pWriter, "cut_mud_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MUD_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(Items.MUD_BRICKS), has(Items.MUD_BRICKS))
                .save(pWriter, "cut2_mud_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MUD_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.MUD_SHINGLES.get()), has(ModBlocks.MUD_SHINGLES.get()))
                .save(pWriter, "cut_mud_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MUD_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.MUD_BRICKS), has(Items.MUD_BRICKS))
                .save(pWriter, "cut2_mud_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MUD_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_WALL.get())
                .unlockedBy(getHasName(ModBlocks.MUD_SHINGLES.get()), has(ModBlocks.MUD_SHINGLES.get()))
                .save(pWriter, "cut_mud_shingles_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MUD_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_WALL.get())
                .unlockedBy(getHasName(Items.MUD_BRICKS), has(Items.MUD_BRICKS))
                .save(pWriter, "cut2_mud_shingles_wall");

        //STONE SHINGLES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', Items.STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.STONE_BRICK_SLAB), has(Items.STONE_BRICK_SLAB))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES.get())
                .unlockedBy(getHasName(Items.STONE), has(Items.STONE))
                .save(pWriter,"cut_stone_stone_shingles");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES.get())
                .unlockedBy(getHasName(Items.STONE_BRICKS), has(Items.STONE_BRICKS))
                .save(pWriter,"cut_stone_bricks_stone_shingles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_STAIRS.get())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.STONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.STONE_SHINGLES.get()), has(ModBlocks.STONE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.STONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.STONE_SHINGLES.get()), has(ModBlocks.STONE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.STONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.STONE_SHINGLES.get()), has(ModBlocks.STONE_SHINGLES.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.STONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.STONE_SHINGLES.get()), has(ModBlocks.STONE_SHINGLES.get()))
                .save(pWriter, "cut_stone_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(Items.STONE_BRICKS), has(Items.STONE_BRICKS))
                .save(pWriter, "cut2_stone_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.STONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.STONE_SHINGLES.get()), has(ModBlocks.STONE_SHINGLES.get()))
                .save(pWriter, "cut_stone_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.STONE_BRICKS), has(Items.STONE_BRICKS))
                .save(pWriter, "cut2_stone_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.STONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(ModBlocks.STONE_SHINGLES.get()), has(ModBlocks.STONE_SHINGLES.get()))
                .save(pWriter, "cut_stone_shingles_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(Items.STONE_BRICKS), has(Items.STONE_BRICKS))
                .save(pWriter, "cut2_stone_shingles_wall");

        //MOSSY STONE SHINGLES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', Items.MOSSY_STONE_BRICK_SLAB)
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICK_SLAB), has(Items.MOSSY_STONE_BRICK_SLAB))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOSSY_STONE_SHINGLES.get())
                .pattern("#S")
                .define('#', ModBlocks.STONE_SHINGLES.get())
                .define('S', Items.VINE)
                .group("mossy_stone_shingles")
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICK_SLAB), has(Items.MOSSY_STONE_BRICK_SLAB))
                .save(pWriter, "vine_mossy_stone_shingles");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOSSY_STONE_SHINGLES.get())
                .pattern("#S")
                .define('#', ModBlocks.STONE_SHINGLES.get())
                .define('S', Items.MOSS_BLOCK)
                .group("mossy_stone_shingles")
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICK_SLAB), has(Items.MOSSY_STONE_BRICK_SLAB))
                .save(pWriter, "moss_mossy_stone_shingles");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MOSSY_STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES.get())
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICKS), has(Items.MOSSY_STONE_BRICKS))
                .save(pWriter,"cut_mossy_stone_bricks_mossy_stone_shingles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_STAIRS.get())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.MOSSY_STONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_STONE_SHINGLES.get()), has(ModBlocks.MOSSY_STONE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.MOSSY_STONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_STONE_SHINGLES.get()), has(ModBlocks.MOSSY_STONE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.MOSSY_STONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_STONE_SHINGLES.get()), has(ModBlocks.MOSSY_STONE_SHINGLES.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_STONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_STONE_SHINGLES.get()), has(ModBlocks.MOSSY_STONE_SHINGLES.get()))
                .save(pWriter, "cut_mossy_stone_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MOSSY_STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICKS), has(Items.MOSSY_STONE_BRICKS))
                .save(pWriter, "cut2_mossy_stone_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_STONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.MOSSY_STONE_SHINGLES.get()), has(ModBlocks.MOSSY_STONE_SHINGLES.get()))
                .save(pWriter, "cut_mossy_stone_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MOSSY_STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICKS), has(Items.MOSSY_STONE_BRICKS))
                .save(pWriter, "cut2_mossy_stone_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.MOSSY_STONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_STONE_SHINGLES.get()), has(ModBlocks.MOSSY_STONE_SHINGLES.get()))
                .save(pWriter, "cut_mossy_stone_shingles_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.MOSSY_STONE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(Items.MOSSY_STONE_BRICKS), has(Items.MOSSY_STONE_BRICKS))
                .save(pWriter, "cut2_mossy_stone_shingles_wall");

        //SANDSTONE SHINGLES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', Items.CUT_STANDSTONE_SLAB)
                .unlockedBy(getHasName(Items.CUT_SANDSTONE), has(Items.CUT_STANDSTONE_SLAB))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SANDSTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES.get())
                .unlockedBy(getHasName(Items.SANDSTONE), has(Items.SANDSTONE))
                .save(pWriter,"cut_sandstone_sandstone_shingles");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CUT_SANDSTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES.get())
                .unlockedBy(getHasName(Items.CUT_SANDSTONE), has(Items.CUT_SANDSTONE))
                .save(pWriter,"cut_sandstone_bricks_sandstone_shingles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_STAIRS.get())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.SANDSTONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_SHINGLES.get()), has(ModBlocks.SANDSTONE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.SANDSTONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_SHINGLES.get()), has(ModBlocks.SANDSTONE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.SANDSTONE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_SHINGLES.get()), has(ModBlocks.SANDSTONE_SHINGLES.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_SHINGLES.get()), has(ModBlocks.SANDSTONE_SHINGLES.get()))
                .save(pWriter, "cut_sandstone_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.CUT_SANDSTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(Items.CUT_SANDSTONE), has(Items.CUT_SANDSTONE))
                .save(pWriter, "cut2_sandstone_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_SHINGLES.get()), has(ModBlocks.SANDSTONE_SHINGLES.get()))
                .save(pWriter, "cut_sandstone_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.CUT_SANDSTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.CUT_SANDSTONE), has(Items.CUT_SANDSTONE))
                .save(pWriter, "cut2_sandstone_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SANDSTONE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_SHINGLES.get()), has(ModBlocks.SANDSTONE_SHINGLES.get()))
                .save(pWriter, "cut_sandstone_shingles_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.CUT_SANDSTONE),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(Items.CUT_SANDSTONE), has(Items.CUT_SANDSTONE))
                .save(pWriter, "cut2_sandstone_shingles_wall");

        //DEEPSLATE SHINGLES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES.get(), 2)
                .pattern("##")
                .pattern("##")
                .define('#', Items.DEEPSLATE_TILES)
                .unlockedBy(getHasName(Items.DEEPSLATE_TILES), has(Items.DEEPSLATE_TILES))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_TILES),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES.get())
                .unlockedBy(getHasName(Items.DEEPSLATE_TILES), has(Items.DEEPSLATE_TILES))
                .save(pWriter,"cut_deepslate_deepslate_shingles");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DEEPSLATE_BRICKS),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES.get())
                .unlockedBy(getHasName(Items.DEEPSLATE_BRICKS), has(Items.DEEPSLATE_BRICKS))
                .save(pWriter,"cut_deepslate_bricks_deepslate_shingles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_STAIRS.get())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.DEEPSLATE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.DEEPSLATE_SHINGLES.get()), has(ModBlocks.DEEPSLATE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.DEEPSLATE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.DEEPSLATE_SHINGLES.get()), has(ModBlocks.DEEPSLATE_SHINGLES.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.DEEPSLATE_SHINGLES.get())
                .unlockedBy(getHasName(ModBlocks.DEEPSLATE_SHINGLES.get()), has(ModBlocks.DEEPSLATE_SHINGLES.get()))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.DEEPSLATE_SHINGLES.get()), has(ModBlocks.DEEPSLATE_SHINGLES.get()))
                .save(pWriter, "cut_deepslate_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.DEEPSLATE_TILES),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_STAIRS.get())
                .unlockedBy(getHasName(Items.DEEPSLATE_BRICKS), has(Items.DEEPSLATE_BRICKS))
                .save(pWriter, "cut2_deepslate_shingles_stairs");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.DEEPSLATE_SHINGLES.get()), has(ModBlocks.DEEPSLATE_SHINGLES.get()))
                .save(pWriter, "cut_deepslate_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.DEEPSLATE_TILES),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_SLAB.get(), 2)
                .unlockedBy(getHasName(Items.DEEPSLATE_TILES), has(Items.DEEPSLATE_TILES))
                .save(pWriter, "cut2_deepslate_shingles_slab");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.DEEPSLATE_SHINGLES.get()),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(ModBlocks.DEEPSLATE_SHINGLES.get()), has(ModBlocks.DEEPSLATE_SHINGLES.get()))
                .save(pWriter, "cut_deepslate_shingles_wall");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.DEEPSLATE_TILES),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_WALL.get())
                .unlockedBy(getHasName(Items.DEEPSLATE_TILES), has(Items.DEEPSLATE_TILES))
                .save(pWriter, "cut2_deepslate_shingles_wall");

        //IRON GRATE

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_GRATE.get())
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        //FRAMED GLASS

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_GLASS.get())
                .pattern(" S ")
                .pattern("S#S")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('#', Items.GLASS)
                .unlockedBy(getHasName(Items.GLASS), has(Items.GLASS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FRAMED_GLASS_PANE.get(), 16)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.FRAMED_GLASS.get())
                .unlockedBy(getHasName(ModBlocks.FRAMED_GLASS.get()), has(ModBlocks.FRAMED_GLASS_PANE.get()))
                .save(pWriter);

    }
}