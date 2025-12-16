package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.spacefox.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.spacefox.SpacefoxPlushieBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SpacefoxPlushieBlockModel extends GeoModel<SpacefoxPlushieBlockEntity> {
    @Override
    public ResourceLocation getModelResource(SpacefoxPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/spacefox.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpacefoxPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/spacefox_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpacefoxPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/spacefox_plushie_block.animation.json");
    }
}
