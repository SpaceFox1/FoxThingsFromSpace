package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Foxthingsfromspace.MODID);

    public static final Supplier<BlockEntityType<ClayFilterBlockEntity>> CLAYFILTER_BE =
            BLOCK_ENTITIES.register("clayfilter_be", () -> BlockEntityType.Builder.of(ClayFilterBlockEntity::new, ModBlocks.CLAYFILTER_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
