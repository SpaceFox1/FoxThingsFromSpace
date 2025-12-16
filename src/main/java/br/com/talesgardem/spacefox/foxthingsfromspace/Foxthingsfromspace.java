package br.com.talesgardem.spacefox.foxthingsfromspace;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.ModBlockEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.client.ChibiazuraPlushieBlockRenderer;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.leobrine.client.LeobrinePlushieBlockRenderer;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.lobo.client.LoboPlushieBlockRenderer;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.spacefox.client.SpacefoxPlushieBlockRenderer;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.ModEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.client.lion.LionRenderer;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.ModCreativeModeTabs;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.ModItems;
import br.com.talesgardem.spacefox.foxthingsfromspace.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
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
import net.neoforged.neoforgespi.language.IModInfo;
import org.slf4j.Logger;

@Mod(Foxthingsfromspace.MODID)
public class Foxthingsfromspace {
    public static final String MODID = "foxthingsfromspace";
    private static final Logger LOGGER = LogUtils.getLogger();
    private final ModContainer container;


    public Foxthingsfromspace(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        this.container = modContainer;
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        IModInfo modInfo = this.container.getModInfo();
        LOGGER.info("Initializing ${MODNAME} version ${VERSION} from ${AUTHORS}");
        LOGGER.warn("Errr... something appears to be wrong... Let's try this again");
        LOGGER.info("lang.internal.logs.init {} lang.internal.logs.version {} lang.internal.logs.authorsBy SpaceFox & LoboMetalurgico", modInfo.getDisplayName(), modInfo.getVersion().toString());
        LOGGER.warn("Still wrong... maybe the third time's the charm?");
        LOGGER.info("[Object object]");
        LOGGER.error("I give up.");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.LION_SPAWN_EGG);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Maybe try System32 SpongeForge?");
    }

    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.LION.get(), LionRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.LOBO_PLUSHIE_BE.get(), LoboPlushieBlockRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.LEOBRINE_PLUSHIE_BE.get(), LeobrinePlushieBlockRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.SPACEFOX_PLUSHIE_BE.get(), SpacefoxPlushieBlockRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.CHIBIAZURA_PLUSHIE_BE.get(), ChibiazuraPlushieBlockRenderer::new);
        }
    }
}
