package br.com.talesgardem.spacefox.foxthingsfromspace.entities.client.lion;
// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import br.com.talesgardem.spacefox.foxthingsfromspace.entities.custom.LionEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
        import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

public class LionModel<T extends LionEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "lion"), "main");
    private final ModelPart body;
    private final ModelPart head;

    public LionModel(ModelPart root) {
        this.body = root.getChild("Body");
        this.head = this.body.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

        PartDefinition mainBody = Body.addOrReplaceChild("mainBody", CubeListBuilder.create().texOffs(0, 49).addBox(-16.0F, -6.0F, 4.0F, 16.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-15.0F, -4.0F, 6.0F, 14.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -11.0F, -22.0F));

        PartDefinition bodyLower = mainBody.addOrReplaceChild("bodyLower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bodyLower_r1 = bodyLower.addOrReplaceChild("bodyLower_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-14.0F, -5.0F, 20.0F, 12.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition FrontalLegs = Body.addOrReplaceChild("FrontalLegs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -8.0F));

        PartDefinition LeftFLeg = FrontalLegs.addOrReplaceChild("LeftFLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Top = LeftFLeg.addOrReplaceChild("Top", CubeListBuilder.create().texOffs(38, 49).addBox(-5.0F, -3.0F, -6.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -9.0F, 0.0F));

        PartDefinition Bottom = LeftFLeg.addOrReplaceChild("Bottom", CubeListBuilder.create(), PartPose.offset(9.0F, 0.0F, 2.0F));

        PartDefinition Bottom_r1 = Bottom.addOrReplaceChild("Bottom_r1", CubeListBuilder.create().texOffs(0, 80).addBox(-5.0F, -2.0F, -5.0F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition Feet = LeftFLeg.addOrReplaceChild("Feet", CubeListBuilder.create(), PartPose.offset(7.0F, 9.0F, 2.0F));

        PartDefinition Feet_r1 = Feet.addOrReplaceChild("Feet_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-4.0F, -2.0F, -7.0F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition RightFLeg = FrontalLegs.addOrReplaceChild("RightFLeg", CubeListBuilder.create(), PartPose.offset(-14.0F, 0.0F, 0.0F));

        PartDefinition Top2 = RightFLeg.addOrReplaceChild("Top2", CubeListBuilder.create().texOffs(52, 26).addBox(-5.0F, -3.0F, -6.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -9.0F, 0.0F));

        PartDefinition Bottom2 = RightFLeg.addOrReplaceChild("Bottom2", CubeListBuilder.create(), PartPose.offset(9.0F, 0.0F, 2.0F));

        PartDefinition Bottom_r2 = Bottom2.addOrReplaceChild("Bottom_r2", CubeListBuilder.create().texOffs(26, 82).addBox(-5.0F, -2.0F, -5.0F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition Feet2 = RightFLeg.addOrReplaceChild("Feet2", CubeListBuilder.create(), PartPose.offset(7.0F, 9.0F, 2.0F));

        PartDefinition Feet_r2 = Feet2.addOrReplaceChild("Feet_r2", CubeListBuilder.create().texOffs(36, 69).addBox(-4.0F, -2.0F, -7.0F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition BackLegs = Body.addOrReplaceChild("BackLegs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -8.0F));

        PartDefinition LeftBLeg = BackLegs.addOrReplaceChild("LeftBLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 18.0F));

        PartDefinition Top3 = LeftBLeg.addOrReplaceChild("Top3", CubeListBuilder.create().texOffs(70, 46).addBox(-5.0F, -3.0F, -5.0F, 6.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -9.0F, 0.0F));

        PartDefinition Bottom3 = LeftBLeg.addOrReplaceChild("Bottom3", CubeListBuilder.create(), PartPose.offset(9.0F, 0.0F, 2.0F));

        PartDefinition Bottom_r3 = Bottom3.addOrReplaceChild("Bottom_r3", CubeListBuilder.create().texOffs(82, 84).addBox(-5.0F, -2.0F, -4.0F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition Feet3 = LeftBLeg.addOrReplaceChild("Feet3", CubeListBuilder.create(), PartPose.offset(7.0F, 9.0F, 2.0F));

        PartDefinition Feet_r3 = Feet3.addOrReplaceChild("Feet_r3", CubeListBuilder.create().texOffs(84, 29).addBox(-4.0F, -2.0F, -6.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition RightBLeg = BackLegs.addOrReplaceChild("RightBLeg", CubeListBuilder.create(), PartPose.offset(-12.0F, 0.0F, 18.0F));

        PartDefinition Top4 = RightBLeg.addOrReplaceChild("Top4", CubeListBuilder.create().texOffs(72, 65).addBox(-5.0F, -3.0F, -5.0F, 6.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -9.0F, 0.0F));

        PartDefinition Bottom4 = RightBLeg.addOrReplaceChild("Bottom4", CubeListBuilder.create(), PartPose.offset(9.0F, 0.0F, 2.0F));

        PartDefinition Bottom_r4 = Bottom4.addOrReplaceChild("Bottom_r4", CubeListBuilder.create().texOffs(92, 0).addBox(-5.0F, -2.0F, -4.0F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition Feet4 = RightBLeg.addOrReplaceChild("Feet4", CubeListBuilder.create(), PartPose.offset(7.0F, 9.0F, 2.0F));

        PartDefinition Feet_r4 = Feet4.addOrReplaceChild("Feet_r4", CubeListBuilder.create().texOffs(52, 84).addBox(-4.0F, -2.0F, -6.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(58, 0).addBox(-7.0F, -6.0F, -2.0F, 14.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(84, 16).addBox(-5.0F, -4.0F, -6.0F, 10.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(58, 16).addBox(-3.0F, 1.0F, -10.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, -18.0F));

        PartDefinition Teeth1_r1 = Head.addOrReplaceChild("Teeth1_r1", CubeListBuilder.create().texOffs(2, 1).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, 3.45F, -8.875F, 0.5817F, 0.1589F, -0.3132F));

        PartDefinition Teeth2_r1 = Head.addOrReplaceChild("Teeth2_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 3.45F, -8.875F, 0.5817F, -0.1589F, 0.3132F));

        PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offset(-3.425F, -4.525F, -4.0F));

        PartDefinition RightEar_r1 = RightEar.addOrReplaceChild("RightEar_r1", CubeListBuilder.create().texOffs(45, 2).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offset(3.425F, -4.525F, -4.0F));

        PartDefinition LeftEar_r1 = LeftEar.addOrReplaceChild("LeftEar_r1", CubeListBuilder.create().texOffs(45, 2).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition SnoutBottom = Head.addOrReplaceChild("SnoutBottom", CubeListBuilder.create().texOffs(84, 40).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition Teeth1_r2 = SnoutBottom.addOrReplaceChild("Teeth1_r2", CubeListBuilder.create().texOffs(2, 1).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.825F, 0.55F, -2.875F, -0.0436F, 0.0F, -0.5236F));

        PartDefinition Teeth2_r2 = SnoutBottom.addOrReplaceChild("Teeth2_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.825F, 0.55F, -2.875F, -0.0436F, 0.0F, 0.5236F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 12.0F));

        PartDefinition TailTop = Tail.addOrReplaceChild("TailTop", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition TailTop_r1 = TailTop.addOrReplaceChild("TailTop_r1", CubeListBuilder.create().texOffs(52, 95).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.0F, 0.0F));

        PartDefinition TailBottom = TailTop.addOrReplaceChild("TailBottom", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 4.0F));

        PartDefinition TailBottom_r1 = TailBottom.addOrReplaceChild("TailBottom_r1", CubeListBuilder.create().texOffs(66, 95).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

        PartDefinition TailTip = TailBottom.addOrReplaceChild("TailTip", CubeListBuilder.create(), PartPose.offset(0.0F, 8.5F, 6.0F));

        PartDefinition TailTip_r1 = TailTip.addOrReplaceChild("TailTip_r1", CubeListBuilder.create().texOffs(78, 16).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(@NotNull LionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(LionAnimation.ANIM_LION_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, LionAnimation.ANIM_LION_IDLE, ageInTicks, 1f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public @NotNull ModelPart root() {
        return body;
    }
}