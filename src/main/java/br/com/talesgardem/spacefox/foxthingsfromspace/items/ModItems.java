package br.com.talesgardem.spacefox.foxthingsfromspace.items;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.ModEntities;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Foxthingsfromspace.MODID);

    public static final DeferredItem<Item> FOXTHINGS = ITEMS.register("fox_things",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LION_SPAWN_EGG = ITEMS.register("lion_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LION, 0x8c1a2d, 0xffa852, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
