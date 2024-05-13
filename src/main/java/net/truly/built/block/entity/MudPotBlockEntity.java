package net.truly.built.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MudPotBlockEntity extends BlockEntity {

    public MudPotBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.MUD_POT_BE.get(), pPos, pBlockState);
    }
}
