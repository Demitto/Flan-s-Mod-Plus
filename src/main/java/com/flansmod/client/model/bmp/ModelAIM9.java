package com.flansmod.client.model.bmp;

import org.lwjgl.opengl.GL11;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAIM9 extends ModelBullet 
{
	public ModelRendererTurbo[] bodyModel;
	
	public ModelAIM9()
	{
		int textureX = 64;
		int textureY = 64;
		
		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 0, 31, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 12

		bodyModel[0].addBox(-1F, 0F, -1F, 2, 19, 2, 0F); // Box 3
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addTrapezoid(-1F, 19F, -1F, 2, 5, 2, 0F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 4
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 15F, -3F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 15F, -3F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
		bodyModel[3].rotateAngleY = -1.57079633F;

		bodyModel[4].addShapeBox(-0.5F, 15F, -3F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleY = -3.14159265F;

		bodyModel[5].addShapeBox(-0.5F, 15F, -3F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		bodyModel[5].rotateAngleY = 1.57079633F;

		bodyModel[6].addShapeBox(-0.5F, 1F, -3F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
		bodyModel[6].rotateAngleY = 1.57079633F;

		bodyModel[7].addShapeBox(-0.5F, 1F, -3F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 1F, -3F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleY = -1.57079633F;

		bodyModel[9].addShapeBox(-0.5F, 1F, -3F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
		bodyModel[9].rotateAngleY = -3.14159265F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 2, 0);
		for(ModelRendererTurbo mrt : bodyModel)
			mrt.render(f5);
		GL11.glPopMatrix();
	}
}
