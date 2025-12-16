package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.lobo.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.lobo.LoboPlushieBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LoboPlushieBlockItemModel extends GeoModel<LoboPlushieBlockItem> {
    @Override
    public ResourceLocation getModelResource(LoboPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/lobo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LoboPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/lobo_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LoboPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/lobo_plushie_block.animation.json");
    }
}
