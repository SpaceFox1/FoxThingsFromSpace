package br.com.talesgardem.spacefox.foxthingsfromspace.entities.client.crow;
// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import br.com.talesgardem.spacefox.foxthingsfromspace.Foxthingsfromspace;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class CrowModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Foxthingsfromspace.MODID, "crow"), "main");
	private final ModelPart body;
	private final ModelPart head;

	public CrowModel(ModelPart root) {
		this.body = root.getChild("Body");
		this.head = this.body.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Tail_r1 = Body.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, -1.55F, -0.5672F, 0.0F, 0.0F));

		PartDefinition RightWing = Body.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 0.0F, -1.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftWing = Body.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(10, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition LeftFeet = Body.addOrReplaceChild("LeftFeet", CubeListBuilder.create(), PartPose.offset(-1.05F, 7.0F, 2.0F));

		PartDefinition LeftFoot_r1 = LeftFeet.addOrReplaceChild("LeftFoot_r1", CubeListBuilder.create().texOffs(20, 24).addBox(-2.0F, 4.0F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.225F, 0.675F, 0.781F, 0.0F, 0.0F));

		PartDefinition LeftFeet_r1 = LeftFeet.addOrReplaceChild("LeftFeet_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.15F, -0.325F, 0.8727F, 0.0F, 0.0F));

		PartDefinition RightFeet = Body.addOrReplaceChild("RightFeet", CubeListBuilder.create(), PartPose.offset(1.05F, 7.0F, 2.0F));

		PartDefinition LeftFoot_r2 = RightFeet.addOrReplaceChild("LeftFoot_r2", CubeListBuilder.create().texOffs(20, 24).addBox(-2.0F, 4.0F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.225F, 0.675F, 0.781F, 0.0F, 0.0F));

		PartDefinition LeftFeet_r2 = RightFeet.addOrReplaceChild("LeftFeet_r2", CubeListBuilder.create().texOffs(2, 26).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.15F, -0.325F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Beak_r1 = Head.addOrReplaceChild("Beak_r1", CubeListBuilder.create().texOffs(20, 16).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.425F, 2.3F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(20, 8).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.625F, 0.075F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public @NotNull ModelPart root() {
        return body;
    }
}