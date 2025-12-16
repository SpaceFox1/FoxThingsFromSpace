package br.com.talesgardem.spacefox.foxthingsfromspace.items;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.ModEntities;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.chibiazura.ChibiazuraPlushieBlockItem;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.leobrine.LeobrinePlushieBlockItem;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.lobo.LoboPlushieBlockItem;
import br.com.talesgardem.spacefox.foxthingsfromspace.items.custom.plushie.spacefox.SpacefoxPlushieBlockItem;
import br.com.talesgardem.spacefox.foxthingsfromspace.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Foxthingsfromspace.MODID);

    public static final DeferredItem<Item> CHIBIAZURA_PLUSHIE_BLOCK_ITEM = ITEMS.register("chibiazura_plushie_block",
            () -> new ChibiazuraPlushieBlockItem(ModBlocks.CHIBIAZURA_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> FOXTHINGS = ITEMS.register("fox_things",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LEOBRINE_PLUSHIE_BLOCK_ITEM = ITEMS.register("leobrine_plushie_block",
            () -> new LeobrinePlushieBlockItem(ModBlocks.LEOBRINE_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> LION_SPAWN_EGG = ITEMS.register("lion_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LION, 0x8c1a2d, 0xffa852, new Item.Properties()));

    public static final DeferredItem<Item> LOBO_PLUSHIE_BLOCK_ITEM = ITEMS.register("lobo_plushie_block",
            () -> new LoboPlushieBlockItem(ModBlocks.LOBO_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> SPACEFOX_PLUSHIE_BLOCK_ITEM = ITEMS.register("spacefox_plushie_block",
            () -> new SpacefoxPlushieBlockItem(ModBlocks.SPACEFOX_PLUSHIE_BLOCK.get(), new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> RHADAMANTUS_MUSIC_DISC = ITEMS.register("rhadamantus_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.RHADAMANTUS_KEY).stacksTo(1)));

    public static final DeferredItem<Item> MAXING_TANZE_MUSIC_DISC = ITEMS.register("maxing_tanze_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MAXING_TANZE_KEY).stacksTo(1)));

    public static final DeferredItem<Item> FRUHLINGSSTIMMEN_MUSIC_DISC = ITEMS.register("fruhlingsstimmen_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.FRUHLINGSSTIMMEN_KEY).stacksTo(1)));

    public static final DeferredItem<Item> AN_DER_SCHONEN_BLAUEN_DONAU_MUSIC_DISC = ITEMS.register("an_der_schonen_blauen_donau_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.AN_DER_SCHONEN_BLAUEN_DONAU_KEY).stacksTo(1)));

    public static final DeferredItem<Item> GSCHICHTEN_AUS_DEM_WIENERWALD_MUSIC_DISC = ITEMS.register("gschichten_aus_dem_wienerwald_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.GSCHICHTEN_AUS_DEM_WIENERWALD_KEY).stacksTo(1)));

    public static final DeferredItem<Item> KAISERWALZER_MUSIC_DISC = ITEMS.register("kaiserwalzer_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.KAISERWALZER_KEY).stacksTo(1)));

    public static final DeferredItem<Item> FEUILLETON_MUSIC_DISC = ITEMS.register("feuilleton_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.FEUILLETON_KEY).stacksTo(1)));

    public static final DeferredItem<Item> MOONLIGHT_SONATA_EINS_MUSIC_DISC = ITEMS.register("moonlight_sonata_eins_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOONLIGHT_SONATA_EINS_KEY).stacksTo(1)));

    public static final DeferredItem<Item> MOONLIGHT_SONATA_ZWEI_MUSIC_DISC = ITEMS.register("moonlight_sonata_zwei_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOONLIGHT_SONATA_ZWEI_KEY).stacksTo(1)));

    public static final DeferredItem<Item> MOONLIGHT_SONATA_DREI_MUSIC_DISC = ITEMS.register("moonlight_sonata_drei_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOONLIGHT_SONATA_DREI_KEY).stacksTo(1)));

    public static final DeferredItem<Item> VAI_DAR_M_MUSIC_DISC = ITEMS.register("vai_dar_m_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.VAI_DAR_M_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
