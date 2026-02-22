package br.com.talesgardem.spacefox.foxthingsfromspace.datagen;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Foxthingsfromspace.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FOXTHINGS.get());

        withExistingParent(ModItems.LION_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        basicItem(ModItems.VAI_DAR_M_MUSIC_DISC.get());
        basicItem(ModItems.FEUILLETON_MUSIC_DISC.get());
        basicItem(ModItems.RHADAMANTUS_MUSIC_DISC.get());
        basicItem(ModItems.MAXING_TANZE_MUSIC_DISC.get());
        basicItem(ModItems.KAISERWALZER_MUSIC_DISC.get());
        basicItem(ModItems.OVERTURE_1812_MUSIC_DISC.get());
        basicItem(ModItems.FRUHLINGSSTIMMEN_MUSIC_DISC.get());
        basicItem(ModItems.OVERTURE_THE_WASPS_MUSIC_DISC.get());
        basicItem(ModItems.MOONLIGHT_SONATA_EINS_MUSIC_DISC.get());
        basicItem(ModItems.MOONLIGHT_SONATA_ZWEI_MUSIC_DISC.get());
        basicItem(ModItems.MOONLIGHT_SONATA_DREI_MUSIC_DISC.get());
        basicItem(ModItems.AN_DER_SCHONEN_BLAUEN_DONAU_MUSIC_DISC.get());
        basicItem(ModItems.GSCHICHTEN_AUS_DEM_WIENERWALD_MUSIC_DISC.get());
    }
}
