package br.com.talesgardem.spacefox.foxthingsfromspace.entities;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.custom.LionEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Foxthingsfromspace.MODID);

    public static final Supplier<EntityType<LionEntity>> LION =
            ENTITY_TYPES.register("lion", () -> EntityType.Builder.of(LionEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 1.69f).eyeHeight(1.25f).build("lion"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
