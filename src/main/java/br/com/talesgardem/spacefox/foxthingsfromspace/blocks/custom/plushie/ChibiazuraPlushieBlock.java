package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.custom.plushie;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.ChibiazuraPlushieBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ChibiazuraPlushieBlock extends BaseEntityBlock {
    public static final MapCodec<ChibiazuraPlushieBlock> CODEC = simpleCodec(ChibiazuraPlushieBlock::new);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public ChibiazuraPlushieBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        switch (state.getValue(FACING).getOpposite()) {
            case NORTH -> {
                return Block.box(1, 0, 0, 15, 20, 12);
            }
            case EAST -> {
                return Block.box(4, 0, 1, 16, 20, 15);
            }
            case WEST -> {
                return Block.box(0, 0, 1, 12, 20, 15);
            }
            default -> { // SOUTH
                return Block.box(1, 0, 4, 15, 20, 16);
            }
        }
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    protected @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new ChibiazuraPlushieBlockEntity(blockPos, blockState);
    }
}
