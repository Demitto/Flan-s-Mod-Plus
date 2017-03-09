package com.flansmod.client.model.psf;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTorpedo extends ModelBullet 
{
	public ModelRendererTurbo[] bodyModel;

	public ModelTorpedo() //Same as Filename
	{
		
		int textureX = 1024;
		int textureY = 1024;
		
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 589, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 39, 589, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 784, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 841, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 893, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 841, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 893, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 962, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 962, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 48, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 20, 113, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 20, 113, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 20, 159, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 20, 159, textureX, textureY); // Box 25

		bodyModel[0].addBox(-3F, 0F, -9F, 6, 175, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 175, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(3F, 0F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 175, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(7F, 0F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 175, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 3
		bodyModel[3].setRotationPoint(-7F, 0F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 175, 14, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 4
		bodyModel[4].setRotationPoint(-9F, 0F, -7F);

		bodyModel[5].addShapeBox(-3F, 0F, -9F, 6, 30, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F); // Box 5
		bodyModel[5].setRotationPoint(0F, 175F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 30, 18, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1.5F, 0F, -4.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, 1.5F, 0F, -4.5F); // Box 6
		bodyModel[6].setRotationPoint(3F, 175F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 30, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 3.5F, 0F, -3.5F, -4.5F, 0F, -5.5F, -4.5F, 0F, -5.5F, 3.5F, 0F, -3.5F); // Box 7
		bodyModel[7].setRotationPoint(7F, 175F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 30, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3.5F, 0F, -5.5F, 1.5F, 0F, -4.5F, 1.5F, 0F, -4.5F, -3.5F, 0F, -5.5F); // Box 8
		bodyModel[8].setRotationPoint(-7F, 175F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 30, 14, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4.5F, 0F, -5.5F, 3.5F, 0F, -3.5F, 3.5F, 0F, -3.5F, -4.5F, 0F, -5.5F); // Box 9
		bodyModel[9].setRotationPoint(-9F, 175F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F); // Box 10
		bodyModel[10].setRotationPoint(-1.5F, 205F, -4.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 10, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.3F, 0F, -3.3F, 1F, 0F, -3F, 1F, 0F, -3F, -2.3F, 0F, -3.3F); // Box 11
		bodyModel[11].setRotationPoint(-3.5F, 205F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2.9F, 2.3F, 0F, -2.3F, 2.3F, 0F, -2.3F, -3F, 0F, -2.9F); // Box 12
		bodyModel[12].setRotationPoint(-4.5F, 205F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -3F, -2.3F, 0F, -3.3F, -2.3F, 0F, -3.3F, 1F, 0F, -3F); // Box 13
		bodyModel[13].setRotationPoint(1.5F, 205F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2.3F, 0F, -2.3F, -3F, 0F, -2.9F, -3F, 0F, -2.9F, 2.3F, 0F, -2.3F); // Box 14
		bodyModel[14].setRotationPoint(3.5F, 205F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 15
		bodyModel[15].setRotationPoint(-2F, -6F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, -4.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -1.5F, 0F, -4.5F); // Box 16
		bodyModel[16].setRotationPoint(-6F, -6F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, 0.5F, 0F, -1.5F); // Box 17
		bodyModel[17].setRotationPoint(2F, -6F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 40, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-1F, 0F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 40, 3, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-1F, 0F, -12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 40, 2, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(9F, 0F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 40, 2, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-12F, 0F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 32, 2, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-12F, 143F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 32, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-1F, 143F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 32, 2, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(9F, 143F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 32, 3, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-1F, 143F, -12F);

	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bodyModel)
			mrt.render(f5);
	}
}