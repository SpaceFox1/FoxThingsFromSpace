package br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.chibiazura.client;

import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.chibiazura.ChibiazuraPlushieBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChibiazuraPlushieBlockItemRenderer extends GeoItemRenderer<ChibiazuraPlushieBlockItem> {
    public ChibiazuraPlushieBlockItemRenderer() {
        super(new ChibiazuraPlushieBlockItemModel());
    }
}
