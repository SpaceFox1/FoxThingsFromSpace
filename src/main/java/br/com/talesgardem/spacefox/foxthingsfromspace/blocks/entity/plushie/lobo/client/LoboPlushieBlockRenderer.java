package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.lobo.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.lobo.LoboPlushieBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class LoboPlushieBlockRenderer extends GeoBlockRenderer<LoboPlushieBlockEntity> {
    public LoboPlushieBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new LoboPlushieBlockModel());
    }
}
