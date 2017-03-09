package com.flansmod.client.model.bmp;

import org.lwjgl.opengl.GL11;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSwingfire extends ModelBullet 
{
public ModelRendererTurbo[] tailModel;

	
	
	public ModelSwingfire()
	{
		int textureX = 32;
		int textureY = 32;
		
		tailModel = new ModelRendererTurbo[28];
		tailModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		tailModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 270
		tailModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 271
		tailModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 272
		tailModel[4] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 273
		tailModel[5] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 11
		tailModel[6] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 12
		tailModel[7] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 13
		tailModel[8] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 14
		tailModel[9] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 15
		tailModel[10] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 16
		tailModel[11] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 17
		tailModel[12] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 18
		tailModel[13] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 19
		tailModel[14] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 20
		tailModel[15] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 21
		tailModel[16] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 22
		tailModel[17] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 23
		tailModel[18] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 24
		tailModel[19] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 25
		tailModel[20] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 26
		tailModel[21] = new ModelRendererTurbo(this, 13, 0, textureX, textureY); // Box 27
		tailModel[22] = new ModelRendererTurbo(this, 13, 0, textureX, textureY); // Box 28
		tailModel[23] = new ModelRendererTurbo(this, 13, 0, textureX, textureY); // Box 29
		tailModel[24] = new ModelRendererTurbo(this, 13, 0, textureX, textureY); // Box 30
		tailModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		tailModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		tailModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33

		tailModel[0].addShapeBox(18F, -2F, -2F, 2, 2, 2, 0F, 0F, -0.625F, -0.625F, -1F, -0.7F, -0.7F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 269
		tailModel[0].setRotationPoint(0F, 0F, 0F);

		tailModel[1].addShapeBox(0F, -2F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		tailModel[1].setRotationPoint(0F, 0F, 0F);

		tailModel[2].addShapeBox(0F, -2F, -2F, 14, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		tailModel[2].setRotationPoint(0F, 0F, 0F);

		tailModel[3].addShapeBox(0F, 0F, -2F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		tailModel[3].setRotationPoint(0F, 0F, 0F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 273
		tailModel[4].setRotationPoint(0F, 0F, 0F);

		tailModel[5].addShapeBox(14F, -2F, -2F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		tailModel[5].setRotationPoint(0F, 0F, 0F);

		tailModel[6].addShapeBox(14F, -2F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 12
		tailModel[6].setRotationPoint(0F, 0F, 0F);

		tailModel[7].addShapeBox(14F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 13
		tailModel[7].setRotationPoint(0F, 0F, 0F);

		tailModel[8].addShapeBox(14F, 0F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 14
		tailModel[8].setRotationPoint(0F, 0F, 0F);

		tailModel[9].addShapeBox(-0.5F, -2F, 0F, 1, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 15
		tailModel[9].setRotationPoint(0F, 0F, 0F);

		tailModel[10].addShapeBox(-0.5F, -2F, -2F, 1, 2, 2, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[10].setRotationPoint(0F, 0F, 0F);

		tailModel[11].addShapeBox(-0.5F, 0F, -2F, 1, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 17
		tailModel[11].setRotationPoint(0F, 0F, 0F);

		tailModel[12].addShapeBox(-0.5F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 18
		tailModel[12].setRotationPoint(0F, 0F, 0F);

		tailModel[13].addShapeBox(0.5F, -2.5F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 19
		tailModel[13].setRotationPoint(0F, 0F, 0F);
		tailModel[13].rotateAngleX = 0.78539816F;

		tailModel[14].addShapeBox(0.5F, -2.5F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 20
		tailModel[14].setRotationPoint(0F, 0F, 0F);
		tailModel[14].rotateAngleX = 2.35619449F;

		tailModel[15].addShapeBox(0.5F, -2.5F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 21
		tailModel[15].setRotationPoint(0F, 0F, 0F);
		tailModel[15].rotateAngleX = 3.92699082F;

		tailModel[16].addShapeBox(0.5F, -2.5F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 22
		tailModel[16].setRotationPoint(0F, 0F, 0F);
		tailModel[16].rotateAngleX = 5.49778714F;

		tailModel[17].addShapeBox(2.5F, -4.5F, -0.5F, 3, 3, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 23
		tailModel[17].setRotationPoint(0F, 0F, 0F);
		tailModel[17].rotateAngleX = 0.78539816F;

		tailModel[18].addShapeBox(2.5F, -4.5F, -0.5F, 3, 3, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 24
		tailModel[18].setRotationPoint(0F, 0F, 0F);
		tailModel[18].rotateAngleX = 2.35619449F;

		tailModel[19].addShapeBox(2.5F, -4.5F, -0.5F, 3, 3, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 25
		tailModel[19].setRotationPoint(0F, 0F, 0F);
		tailModel[19].rotateAngleX = 3.92699082F;

		tailModel[20].addShapeBox(2.5F, -4.5F, -0.5F, 3, 3, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 26
		tailModel[20].setRotationPoint(0F, 0F, 0F);
		tailModel[20].rotateAngleX = 5.49778714F;

		tailModel[21].addShapeBox(15F, -2F, 0F, 3, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		tailModel[21].setRotationPoint(0F, 0F, 0F);

		tailModel[22].addShapeBox(15F, -2F, -2F, 3, 2, 2, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[22].setRotationPoint(0F, 0F, 0F);

		tailModel[23].addShapeBox(15F, 0F, -2F, 3, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 29
		tailModel[23].setRotationPoint(0F, 0F, 0F);

		tailModel[24].addShapeBox(15F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Box 30
		tailModel[24].setRotationPoint(0F, 0F, 0F);

		tailModel[25].addShapeBox(18F, -2F, 0F, 2, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -1F, -0.7F, -0.7F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 31
		tailModel[25].setRotationPoint(0F, 0F, 0F);

		tailModel[26].addShapeBox(18F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -1F, -0.7F, -0.7F, 0F, -0.625F, -0.625F); // Box 32
		tailModel[26].setRotationPoint(0F, 0F, 0F);

		tailModel[27].addShapeBox(18F, 0F, -2F, 2, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, -1F, -0.7F, -0.7F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 33
		tailModel[27].setRotationPoint(0F, 0F, 0F);

		for(int i = 0; i < 28; i++)
			tailModel[i].rotateAngleZ = (float)Math.PI / 2F;
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 1, 0);
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : tailModel)
			mrt.render(f5);
		GL11.glPopMatrix();
	}
}
