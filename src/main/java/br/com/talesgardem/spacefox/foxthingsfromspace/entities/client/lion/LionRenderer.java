package br.com.talesgardem.spacefox.foxthingsfromspace.entities.client.lion;

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.custom.LionEntity;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.custom.LionVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class LionRenderer extends MobRenderer<LionEntity, LionModel<LionEntity>> {
    private static final Map<LionVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(LionVariant.class), map -> {
                map.put(LionVariant.RED, ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/entity/lion/lion_red.png"));
                map.put(LionVariant.BROWN, ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "textures/entity/lion/lion_brown.png"));
            });

    public LionRenderer(EntityRendererProvider.Context context) {
        super(context, new LionModel<>(context.bakeLayer(LionModel.LAYER_LOCATION)), 1f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull LionEntity lionEntity) {
        return LOCATION_BY_VARIANT.get(lionEntity.getVariant());
    }

    @Override
    public void render(@NotNull LionEntity entity, float entityYaw, float partialTicks, @NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
