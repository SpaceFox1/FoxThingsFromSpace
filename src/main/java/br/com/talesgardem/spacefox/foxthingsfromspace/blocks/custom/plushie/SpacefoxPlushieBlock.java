package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.custom.plushie;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.spacefox.SpacefoxPlushieBlockEntity;
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

public class SpacefoxPlushieBlock extends BaseEntityBlock {
    public static final MapCodec<SpacefoxPlushieBlock> CODEC = simpleCodec(SpacefoxPlushieBlock::new);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public SpacefoxPlushieBlock(Properties properties) {
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
                return Block.box(4, 0, 0, 12, 13, 14);
            }
            case EAST -> {
                return Block.box(2, 0, 4, 16, 13, 12);
            }
            case WEST -> {
                return Block.box(0, 0, 4, 14, 13, 12);
            }
            default -> { // SOUTH
                return Block.box(4, 0, 2, 12, 13, 16);
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
        return new SpacefoxPlushieBlockEntity(blockPos, blockState);
    }
}
