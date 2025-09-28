package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.chibiazura.ChibiazuraPlushieBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ChibiazuraPlushieBlockRenderer extends GeoBlockRenderer<ChibiazuraPlushieBlockEntity> {
    public ChibiazuraPlushieBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ChibiazuraPlushieBlockModel());
    }
}
