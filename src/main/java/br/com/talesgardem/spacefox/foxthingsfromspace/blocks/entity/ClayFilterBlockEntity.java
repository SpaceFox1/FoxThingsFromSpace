package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.handlers.InfiniteWaterHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.WaterFluid;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ClayFilterBlockEntity extends BlockEntity {
    public ClayFilterBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CLAYFILTER_BE.get(), pos, state);
    }

    private final InfiniteWaterHandler waterHandler = new InfiniteWaterHandler();

    public IFluidHandler getFluidHandler(@Nullable Direction side) {
        return waterHandler;
    }
}
