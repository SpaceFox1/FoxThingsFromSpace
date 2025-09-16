package br.com.talesgardem.spacefox.foxthingsfromspace.events;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.ModBlockEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.ModEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.client.lion.LionModel;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.custom.LionEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = Foxthingsfromspace.MODID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(LionModel.LAYER_LOCATION, LionModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void onRegisterAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.LION.get(), LionEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
    }
}
