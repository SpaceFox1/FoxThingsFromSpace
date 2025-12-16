package br.com.talesgardem.spacefox.foxthingsfromspace.sound;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, Foxthingsfromspace.MODID);

    /*
    Vai dar merda espetacular - Lixeira do Caio
    VAI_DAR_M
    */
    public static final Supplier<SoundEvent> RHADAMANTUS = registerSoundEvent("rhadamantus");
    public static final ResourceKey<JukeboxSong> RHADAMANTUS_KEY = createSong("rhadamantus");

    public static final Supplier<SoundEvent> MAXING_TANZE = registerSoundEvent("maxing_tanze");
    public static final ResourceKey<JukeboxSong>  MAXING_TANZE_KEY = createSong("maxing_tanze");

    public static final Supplier<SoundEvent> FRUHLINGSSTIMMEN = registerSoundEvent("fruhlingsstimmen");
    public static final ResourceKey<JukeboxSong>  FRUHLINGSSTIMMEN_KEY = createSong("fruhlingsstimmen");

    public static final Supplier<SoundEvent> AN_DER_SCHONEN_BLAUEN_DONAU = registerSoundEvent("an_der_schonen_blauen_donau");
    public static final ResourceKey<JukeboxSong>  AN_DER_SCHONEN_BLAUEN_DONAU_KEY = createSong("an_der_schonen_blauen_donau");

    public static final Supplier<SoundEvent> GSCHICHTEN_AUS_DEM_WIENERWALD = registerSoundEvent("gschichten_aus_dem_wienerwald");
    public static final ResourceKey<JukeboxSong>  GSCHICHTEN_AUS_DEM_WIENERWALD_KEY = createSong("gschichten_aus_dem_wienerwald");

    public static final Supplier<SoundEvent> KAISERWALZER = registerSoundEvent("kaiserwalzer");
    public static final ResourceKey<JukeboxSong>  KAISERWALZER_KEY = createSong("kaiserwalzer");

    public static final Supplier<SoundEvent> FEUILLETON = registerSoundEvent("feuilleton");
    public static final ResourceKey<JukeboxSong>  FEUILLETON_KEY = createSong("feuilleton");

    public static final Supplier<SoundEvent> MOONLIGHT_SONATA_EINS = registerSoundEvent("moonlight_sonata_eins");
    public static final ResourceKey<JukeboxSong>  MOONLIGHT_SONATA_EINS_KEY = createSong("moonlight_sonata_eins");

    public static final Supplier<SoundEvent> MOONLIGHT_SONATA_ZWEI = registerSoundEvent("moonlight_sonata_zwei");
    public static final ResourceKey<JukeboxSong>  MOONLIGHT_SONATA_ZWEI_KEY = createSong("moonlight_sonata_zwei");

    public static final Supplier<SoundEvent> MOONLIGHT_SONATA_DREI = registerSoundEvent("moonlight_sonata_drei");
    public static final ResourceKey<JukeboxSong>  MOONLIGHT_SONATA_DREI_KEY = createSong("moonlight_sonata_drei");

    public static final Supplier<SoundEvent> VAI_DAR_M = registerSoundEvent("vai_dar_m");
    public static final ResourceKey<JukeboxSong>  VAI_DAR_M_KEY = createSong("vai_dar_m");

    public static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
