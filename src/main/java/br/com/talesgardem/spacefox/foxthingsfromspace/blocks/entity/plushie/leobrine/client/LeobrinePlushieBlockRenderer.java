package br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.leobrine.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.entity.plushie.leobrine.LeobrinePlushieBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class LeobrinePlushieBlockRenderer extends GeoBlockRenderer<LeobrinePlushieBlockEntity> {
    public LeobrinePlushieBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new LeobrinePlushieBlockModel());
    }
}
