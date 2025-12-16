package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.handlers;

import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import org.jetbrains.annotations.NotNull;

public class InfiniteWaterHandler implements IFluidHandler {
    @Override
    public int getTanks() {
        return 1;
    }

    @Override
    public @NotNull FluidStack getFluidInTank(int tank) {
        return new FluidStack(Fluids.WATER, Integer.MAX_VALUE);
    }

    @Override
    public int getTankCapacity(int tank) {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isFluidValid(int tank, @NotNull FluidStack stack) {
        return stack.getFluid().isSame(Fluids.WATER);
    }

    @Override
    public int fill(FluidStack resource, @NotNull FluidAction action) {
        if (resource.isEmpty()|| !isFluidValid(getTanks(), resource)) return 0;

        return resource.getAmount();
    }

    @Override
    public @NotNull FluidStack drain(FluidStack resource, @NotNull FluidAction action) {
        if (resource.isEmpty() || !isFluidValid(getTanks(), resource)) return FluidStack.EMPTY;

        return new FluidStack(Fluids.WATER, resource.getAmount());
    }

    @Override
    public @NotNull FluidStack drain(int maxDrain, @NotNull FluidAction action) {
        return new FluidStack(Fluids.WATER, maxDrain);
    }
}

