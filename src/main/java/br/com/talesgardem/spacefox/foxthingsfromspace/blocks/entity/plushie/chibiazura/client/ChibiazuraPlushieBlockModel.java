package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.ChibiazuraPlushieBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChibiazuraPlushieBlockModel extends GeoModel<ChibiazuraPlushieBlockEntity> {
    @Override
    public ResourceLocation getModelResource(ChibiazuraPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "geo/plushies/chibiazura.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiazuraPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/block/chibiazura_plushie_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiazuraPlushieBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "animations/plushies/chibiazura_plushie_block.animation.json");
    }
}
