package br.com.talesgardem.spacefox.foxthingsfromspace.items;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.ModEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.chibiazura.ChibiazuraPlushieBlockItem;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.leobrine.LeobrinePlushieBlockItem;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.lobo.LoboPlushieBlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Foxthingsfromspace.MODID);

    public static final DeferredItem<Item> CHIBIAZURA_PLUSHIE_BLOCK_ITEM = ITEMS.register("chibiazura_plushie_block",
            () -> new ChibiazuraPlushieBlockItem(ModBlocks.CHIBIAZURA_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> FOXTHINGS = ITEMS.register("fox_things",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LEOBRINE_PLUSHIE_BLOCK_ITEM = ITEMS.register("leobrine_plushie_block",
            () -> new LeobrinePlushieBlockItem(ModBlocks.LEOBRINE_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> LION_SPAWN_EGG = ITEMS.register("lion_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LION, 0x8c1a2d, 0xffa852, new Item.Properties()));

    public static final DeferredItem<Item> LOBO_PLUSHIE_BLOCK_ITEM = ITEMS.register("lobo_plushie_block",
            () -> new LoboPlushieBlockItem(ModBlocks.LOBO_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
