package com.flansmod.client.model.psf;

import net.minecraft.entity.Entity;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBlaster extends ModelBullet 
{
	public ModelRendererTurbo[] bodyModel;
	
	public ModelBlaster()
	{
		int textureX = 64;
		int textureY = 32;
		
		bodyModel = new ModelRendererTurbo[2];
		bodyModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Box 40

		bodyModel[0].addShapeBox(-0.5F, -60F, -0.5F, 1, 80, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, 20F, -0.5F, 1, 20, 1, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
		
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		//GL11.glScalef(0.5F, 0.5F, 0.5F);
		for(ModelRendererTurbo mrt : bodyModel)
			mrt.render(f5);
	}
}
