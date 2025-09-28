package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.spacefox.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.spacefox.SpacefoxPlushieBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SpacefoxPlushieBlockItemModel extends GeoModel<SpacefoxPlushieBlockItem> {
    @Override
    public ResourceLocation getModelResource(SpacefoxPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/spacefox.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpacefoxPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/spacefox_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpacefoxPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/spacefox_plushie_block.animation.json");
    }
}
