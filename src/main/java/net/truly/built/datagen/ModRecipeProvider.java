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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.OAK_PLANKS)
                .define('S', Items.STRIPPED_OAK_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_OAK_LOG), has(Items.STRIPPED_OAK_LOG))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_COMPACT_PLANKS.get())
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .define('#', Items.ACACIA_PLANKS)
                .define('S', Items.STRIPPED_ACACIA_LOG)
                .unlockedBy(getHasName(Items.STRIPPED_ACACIA_LOG), has(Items.STRIPPED_ACACIA_LOG))
                .save(pWriter);

    }
}