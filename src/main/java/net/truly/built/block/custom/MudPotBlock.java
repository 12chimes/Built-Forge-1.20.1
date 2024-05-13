package net.truly.built.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.truly.built.block.entity.MudPotBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class MudPotBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Stream.of(
            Block.box(1, 0, 1, 15, 12, 15),
            Block.box(4, 12, 4, 12, 13, 12),
            Block.box(3, 13, 3, 13, 16, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();


    public MudPotBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MudPotBlockEntity(pPos, pState);
    }
}
