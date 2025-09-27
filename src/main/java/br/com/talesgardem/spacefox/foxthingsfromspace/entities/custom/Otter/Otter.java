// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Otter<T extends Otter> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "otter"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart LeftLeg;
	private final ModelPart LeftBLeg;
	private final ModelPart LeftPaw;
	private final ModelPart LeftLegBack;
	private final ModelPart LeftBLeg2;
	private final ModelPart LeftPaw2;
	private final ModelPart RightLeg;
	private final ModelPart LeftBLeg3;
	private final ModelPart LeftPaw3;
	private final ModelPart RightLegBack;
	private final ModelPart LeftBLeg4;
	private final ModelPart LeftPaw4;
	private final ModelPart tail;

	public Otter(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.LeftLeg = this.Body.getChild("LeftLeg");
		this.LeftBLeg = this.LeftLeg.getChild("LeftBLeg");
		this.LeftPaw = this.LeftBLeg.getChild("LeftPaw");
		this.LeftLegBack = this.Body.getChild("LeftLegBack");
		this.LeftBLeg2 = this.LeftLegBack.getChild("LeftBLeg2");
		this.LeftPaw2 = this.LeftBLeg2.getChild("LeftPaw2");
		this.RightLeg = this.Body.getChild("RightLeg");
		this.LeftBLeg3 = this.RightLeg.getChild("LeftBLeg3");
		this.LeftPaw3 = this.LeftBLeg3.getChild("LeftPaw3");
		this.RightLegBack = this.Body.getChild("RightLegBack");
		this.LeftBLeg4 = this.RightLegBack.getChild("LeftBLeg4");
		this.LeftPaw4 = this.LeftBLeg4.getChild("LeftPaw4");
		this.tail = this.Body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, -7.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(30, 27).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 1.0F));

		PartDefinition LeftEar_r1 = Head.addOrReplaceChild("LeftEar_r1", CubeListBuilder.create().texOffs(50, 3).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.975F, -3.475F, -3.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition RightEar_r1 = Head.addOrReplaceChild("RightEar_r1", CubeListBuilder.create().texOffs(41, 3).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.85F, -3.55F, -3.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition WiskerRight_r1 = Head.addOrReplaceChild("WiskerRight_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.85F, 0.5F, -6.55F, 0.0F, 0.48F, 0.0F));

		PartDefinition WiskersLeft_r1 = Head.addOrReplaceChild("WiskersLeft_r1", CubeListBuilder.create().texOffs(28, 10).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.775F, 0.5F, -6.425F, 0.0F, -0.6545F, 0.0F));

		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(30, 30).addBox(2.0F, 1.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftBLeg = LeftLeg.addOrReplaceChild("LeftBLeg", CubeListBuilder.create().texOffs(0, 31).addBox(-1.1F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 3.0F, 3.0F));

		PartDefinition LeftPaw = LeftBLeg.addOrReplaceChild("LeftPaw", CubeListBuilder.create().texOffs(24, 23).addBox(-1.4F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 1.0F, 1.0F));

		PartDefinition LeftLegBack = Body.addOrReplaceChild("LeftLegBack", CubeListBuilder.create().texOffs(6, 31).addBox(2.0F, 1.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 9.0F));

		PartDefinition LeftBLeg2 = LeftLegBack.addOrReplaceChild("LeftBLeg2", CubeListBuilder.create().texOffs(12, 31).addBox(-1.1F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 3.0F, 3.0F));

		PartDefinition LeftPaw2 = LeftBLeg2.addOrReplaceChild("LeftPaw2", CubeListBuilder.create().texOffs(0, 27).addBox(-1.4F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 1.0F, 1.0F));

		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(18, 31).addBox(2.0F, 1.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 9.0F));

		PartDefinition LeftBLeg3 = RightLeg.addOrReplaceChild("LeftBLeg3", CubeListBuilder.create().texOffs(24, 31).addBox(-0.875F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 3.0F, 3.0F));

		PartDefinition LeftPaw3 = LeftBLeg3.addOrReplaceChild("LeftPaw3", CubeListBuilder.create().texOffs(10, 27).addBox(-1.25F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 1.0F, 1.0F));

		PartDefinition RightLegBack = Body.addOrReplaceChild("RightLegBack", CubeListBuilder.create().texOffs(34, 0).addBox(2.0F, 1.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition LeftBLeg4 = RightLegBack.addOrReplaceChild("LeftBLeg4", CubeListBuilder.create().texOffs(34, 5).addBox(-0.875F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 3.0F, 3.0F));

		PartDefinition LeftPaw4 = LeftBLeg4.addOrReplaceChild("LeftPaw4", CubeListBuilder.create().texOffs(20, 27).addBox(-1.175F, 1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 1.0F, 1.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 9.3F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Otter entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}