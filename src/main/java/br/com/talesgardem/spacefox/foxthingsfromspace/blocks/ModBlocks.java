package br.com.talesgardem.spacefox.foxthingsfromspace.blocks;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.custom.ClayFilterBlock;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.custom.plushie.ChibiazuraPlushieBlock;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.custom.plushie.LeobrinePlushieBlock;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.custom.plushie.LoboPlushieBlock;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Foxthingsfromspace.MODID);

    public static final DeferredBlock<Block> CLAYFILTER_BLOCK = registerBlock("clayfilter_block",
            () -> new ClayFilterBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .strength(0.6F)
                    .explosionResistance(0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DECORATED_POT)
            ));

    public static final DeferredBlock<Block> CHIBIAZURA_PLUSHIE_BLOCK = BLOCKS.register("chibiazura_plushie_block",
            () -> new ChibiazuraPlushieBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noLootTable() // FIXME: Add recipe
                    .sound(SoundType.WOOL)
            ));

    public static final DeferredBlock<Block> LEOBRINE_PLUSHIE_BLOCK = BLOCKS.register("leobrine_plushie_block",
            () -> new LeobrinePlushieBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noLootTable() // FIXME: Add recipe
                    .sound(SoundType.WOOL)
            ));

    public static final DeferredBlock<Block> LOBO_PLUSHIE_BLOCK = BLOCKS.register("lobo_plushie_block",
            () -> new LoboPlushieBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noLootTable() // FIXME: Add recipe
                    .sound(SoundType.WOOL)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
