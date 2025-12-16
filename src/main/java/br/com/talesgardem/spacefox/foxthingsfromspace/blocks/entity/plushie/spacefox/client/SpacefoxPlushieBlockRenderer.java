package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.spacefox.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.spacefox.SpacefoxPlushieBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SpacefoxPlushieBlockRenderer extends GeoBlockRenderer<SpacefoxPlushieBlockEntity> {
    public SpacefoxPlushieBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new SpacefoxPlushieBlockModel());
    }
}
