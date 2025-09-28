package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.lobo.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.lobo.LoboPlushieBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LoboPlushieBlockModel extends GeoModel<LoboPlushieBlockEntity> {
    @Override
    public ResourceLocation getModelResource(LoboPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/lobo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LoboPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/lobo_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LoboPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/lobo_plushie_block.animation.json");
    }
}
