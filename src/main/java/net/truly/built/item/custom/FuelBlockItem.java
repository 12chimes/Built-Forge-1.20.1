package net.truly.built.item.custom;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class FuelBlockItem extends BlockItem {
    private int burnTime = 0;

    public FuelBlockItem(Properties pProperties, int burnTime, Block pBlock) {
        super(pBlock, pProperties);
        this.burnTime = burnTime;
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}