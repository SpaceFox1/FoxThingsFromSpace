package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.leobrine.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.leobrine.LeobrinePlushieBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LeobrinePlushieBlockModel extends GeoModel<LeobrinePlushieBlockEntity> {
    @Override
    public ResourceLocation getModelResource(LeobrinePlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/leobrine.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LeobrinePlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/leobrine_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LeobrinePlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/leobrine_plushie_block.animation.json");
    }
}
