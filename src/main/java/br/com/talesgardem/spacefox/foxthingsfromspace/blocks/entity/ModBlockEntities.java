package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.ChibiazuraPlushieBlockEntity;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.leobrine.LeobrinePlushieBlockEntity;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.lobo.LoboPlushieBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Foxthingsfromspace.MODID);

    public static final Supplier<BlockEntityType<ClayFilterBlockEntity>> CLAYFILTER_BE =
            BLOCK_ENTITIES.register("clayfilter_be", () -> BlockEntityType.Builder.of(ClayFilterBlockEntity::new, ModBlocks.CLAYFILTER_BLOCK.get()).build(null));

    public static final Supplier<BlockEntityType<ChibiazuraPlushieBlockEntity>> CHIBIAZURA_PLUSHIE_BE =
            BLOCK_ENTITIES.register("chibiazura_plushie_be", () -> BlockEntityType.Builder.of(ChibiazuraPlushieBlockEntity::new, ModBlocks.CHIBIAZURA_PLUSHIE_BLOCK.get()).build(null));

    public static final Supplier<BlockEntityType<LeobrinePlushieBlockEntity>> LEOBRINE_PLUSHIE_BE =
            BLOCK_ENTITIES.register("leobrine_plushie_be", () -> BlockEntityType.Builder.of(LeobrinePlushieBlockEntity::new, ModBlocks.LEOBRINE_PLUSHIE_BLOCK.get()).build(null));

    public static final Supplier<BlockEntityType<LoboPlushieBlockEntity>> LOBO_PLUSHIE_BE =
            BLOCK_ENTITIES.register("lobo_plushie_be", () -> BlockEntityType.Builder.of(LoboPlushieBlockEntity::new, ModBlocks.LOBO_PLUSHIE_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
