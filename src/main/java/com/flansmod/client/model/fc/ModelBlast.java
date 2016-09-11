package com.flansmod.client.model.fc;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBlast extends ModelBullet 
{
	public ModelRendererTurbo[] bodyModel;
	
	public ModelBlast()
	{
		int textureX = 512;
		int textureY = 512;
		
		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Box 10

		bodyModel[0].addShapeBox(-4.5F, -6F, -1.5F, 9, 9, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, -6F, 1.5F, 9, 9, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 3F, 1.5F, 9, 35, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-4.5F, 3F, -1.5F, 9, 35, 3, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3F, -4.5F, 9, 35, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 38F, 1.5F, 9, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 6
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 38F, -1.5F, 9, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, -6F, -4.5F, 9, 9, 3, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 38F, -4.5F, 9, 9, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bodyModel)
			mrt.render(f5);
	}
}
