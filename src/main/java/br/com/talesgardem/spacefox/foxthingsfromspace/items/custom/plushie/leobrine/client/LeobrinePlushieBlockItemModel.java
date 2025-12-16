package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.leobrine.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.leobrine.LeobrinePlushieBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LeobrinePlushieBlockItemModel extends GeoModel<LeobrinePlushieBlockItem> {
    @Override
    public ResourceLocation getModelResource(LeobrinePlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/leobrine.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LeobrinePlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/leobrine_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LeobrinePlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/leobrine_plushie_block.animation.json");
    }
}
