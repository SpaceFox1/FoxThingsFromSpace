package br.com.talesgardem.spacefox.foxthingsfromspace.items;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Foxthingsfromspace.MODID);

    public static final Supplier<CreativeModeTab> FOXTHINGS_ITEM_TAB = CREATIVE_MODE_TAB.register("foxthings_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOXTHINGS.get()))
                    .title(Component.translatable("itemGroup.foxthingsfromspace"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LION_SPAWN_EGG);
                        output.accept(ModBlocks.CLAYFILTER_BLOCK);
                        output.accept(ModBlocks.LOBO_PLUSHIE_BLOCK);
                        output.accept(ModBlocks.LEOBRINE_PLUSHIE_BLOCK);
                        output.accept(ModBlocks.SPACEFOX_PLUSHIE_BLOCK);
                        output.accept(ModBlocks.CHIBIAZURA_PLUSHIE_BLOCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
