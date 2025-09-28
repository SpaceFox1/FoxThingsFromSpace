package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.lobo.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.lobo.LoboPlushieBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class LoboPlushieBlockItemRenderer extends GeoItemRenderer<LoboPlushieBlockItem> {
    public LoboPlushieBlockItemRenderer() {
        super(new LoboPlushieBlockItemModel());
    }
}
