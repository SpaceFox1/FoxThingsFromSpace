package br.com.talesgardem.spacefox.foxthingsfromspace;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.ModBlockEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.ModEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.client.lion.LionRenderer;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.ModCreativeModeTabs;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.ModItems;
import br.com.talesgardem.spacefox.foxthingsfromspace.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Foxthingsfromspace.MODID)
public class Foxthingsfromspace {
    public static final String MODID = "foxthingsfromspace";
    private static final Logger LOGGER = LogUtils.getLogger();


    public Foxthingsfromspace(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (Foxthingsfromspace) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.LION_SPAWN_EGG);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.LION.get(), LionRenderer::new);
        }
    }
}
