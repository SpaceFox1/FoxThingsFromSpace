package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.chibiazura.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.chibiazura.ChibiazuraPlushieBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChibiazuraPlushieBlockItemModel extends GeoModel<ChibiazuraPlushieBlockItem> {
    @Override
    public ResourceLocation getModelResource(ChibiazuraPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/chibiazura.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiazuraPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/chibiazura_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiazuraPlushieBlockItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/chibiazura_plushie_block.animation.json");
    }
}
