package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.leobrine.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.leobrine.LeobrinePlushieBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class LeobrinePlushieBlockItemRenderer extends GeoItemRenderer<LeobrinePlushieBlockItem> {
    public LeobrinePlushieBlockItemRenderer() {
        super(new LeobrinePlushieBlockItemModel());
    }
}
