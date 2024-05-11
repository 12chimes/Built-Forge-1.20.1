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
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
                .save(pWriter);

        //SHAKES

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES.get(), 4)
                .pattern("#S")
                .pattern("S#")
                .define('#', Items.OAK_PLANKS)
                .define('S', Items.STRIPPED_OAK_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
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

        //TERRACOTTA TRIM

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_TRIM.get(), 2)
                .pattern("##")
                .define('#', Items.TERRACOTTA)
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .save(pWriter);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.TERRACOTTA),
                        RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_TRIM.get())
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .save(pWriter,"cut_terracotta_trim");

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
                .unlockedBy(getHasName(Items.VINE), has(Items.VINE))
                .save(pWriter, "vine_mossy_cut_cobblestone");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOSSY_CUT_COBBLESTONE.get())
                .pattern("#S")
                .define('#', ModBlocks.CUT_COBBLESTONE.get())
                .define('S', Items.MOSS_BLOCK)
                .unlockedBy(getHasName(Items.MOSS_BLOCK), has(Items.MOSS_BLOCK))
                .save(pWriter, "moss_mossy_cut_cobblestone");

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



    }
}