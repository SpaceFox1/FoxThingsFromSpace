package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.spacefox.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.spacefox.SpacefoxPlushieBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SpacefoxPlushieBlockItemRenderer extends GeoItemRenderer<SpacefoxPlushieBlockItem> {
    public SpacefoxPlushieBlockItemRenderer() {
        super(new SpacefoxPlushieBlockItemModel());
    }
}
