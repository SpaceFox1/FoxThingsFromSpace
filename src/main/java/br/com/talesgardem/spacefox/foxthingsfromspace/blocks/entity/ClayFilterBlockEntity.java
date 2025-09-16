package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ClayFilterBlockEntity extends BlockEntity {
    public ClayFilterBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CLAYFILTER_BE.get(), pos, state);
    }
}
