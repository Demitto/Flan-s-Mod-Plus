package com.flansmod.client.model.bmp;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAIM4 extends ModelBullet 
{
	public ModelRendererTurbo[] bodyModel;
	
	public ModelAIM4()
	{
		int textureX = 512;
		int textureY = 512;
		
		bodyModel = new ModelRendererTurbo[23];
		bodyModel[0] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 83, 0, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 39, 0, textureX, textureY); // Box 22

		bodyModel[0].addBox(-3F, 0F, -1.5F, 18, 3, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
		bodyModel[0].rotateAngleZ = 1.57079633F;

		bodyModel[1].addShapeBox(-16F, 0.5F, -1F, 2, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
		bodyModel[1].rotateAngleZ = 1.57079633F;

		bodyModel[2].addBox(-14F, 0F, -1.5F, 11, 3, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		bodyModel[2].rotateAngleZ = 1.57079633F;

		bodyModel[3].addBox(15F, 0.5F, -1F, 1, 2, 2, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
		bodyModel[3].rotateAngleZ = 1.57079633F;

		bodyModel[4].addShapeBox(-2F, -3F, -0.5F, 11, 3, 1, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleZ = 1.57079633F;

		bodyModel[5].addBox(9F, -3F, -0.5F, 2, 3, 1, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		bodyModel[5].rotateAngleZ = 1.57079633F;

		bodyModel[6].addBox(12F, -3F, -0.5F, 2, 3, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		bodyModel[6].rotateAngleZ = 1.57079633F;

		bodyModel[7].addShapeBox(-13F, -1F, -0.5F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		bodyModel[7].rotateAngleZ = 1.57079633F;

		bodyModel[8].addBox(9F, 3F, -0.5F, 2, 3, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleZ = 1.57079633F;

		bodyModel[9].addBox(12F, 3F, -0.5F, 2, 3, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		bodyModel[9].rotateAngleZ = 1.57079633F;

		bodyModel[10].addShapeBox(-13F, 3F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
		bodyModel[10].rotateAngleZ = 1.57079633F;

		bodyModel[11].addShapeBox(-2F, 3F, -0.5F, 11, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 11
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		bodyModel[11].rotateAngleZ = 1.57079633F;

		bodyModel[12].addShapeBox(-2F, 0.5F, 1F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 12
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
		bodyModel[12].rotateAngleZ = 1.57079633F;

		bodyModel[13].addShapeBox(9F, 0.5F, 1F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
		bodyModel[13].rotateAngleZ = 1.57079633F;

		bodyModel[14].addShapeBox(12F, 0.5F, 1F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		bodyModel[14].rotateAngleZ = 1.57079633F;

		bodyModel[15].addBox(11F, -2F, -0.5F, 1, 1, 1, 0F); // Box 15
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		bodyModel[15].rotateAngleZ = 1.57079633F;

		bodyModel[16].addBox(11F, 0.5F, 2F, 1, 1, 1, 0F); // Box 16
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleZ = 1.57079633F;

		bodyModel[17].addShapeBox(-13F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
		bodyModel[17].rotateAngleZ = 1.57079633F;

		bodyModel[18].addShapeBox(-13F, 1F, -2.5F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
		bodyModel[18].rotateAngleZ = 1.57079633F;

		bodyModel[19].addShapeBox(-2F, 0.5F, -4F, 11, 1, 3, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
		bodyModel[19].rotateAngleZ = 1.57079633F;

		bodyModel[20].addShapeBox(9F, 0.5F, -4F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
		bodyModel[20].rotateAngleZ = 1.57079633F;

		bodyModel[21].addBox(11F, 0.5F, -3F, 1, 1, 1, 0F); // Box 21
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
		bodyModel[21].rotateAngleZ = 1.57079633F;

		bodyModel[22].addShapeBox(12F, 0.5F, -4F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
		bodyModel[22].rotateAngleZ = 1.57079633F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bodyModel)
			mrt.render(f5);
	}
}
