package com.flansmod.client.model.fc;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelLazor extends ModelBase 
{
	public ModelRendererTurbo[] bodyModel;
	public float brightness = 0.3F;
	public boolean light = true;

	public ModelLazor()
	{
		int textureX = 32;
		int textureY = 64;
		bodyModel = new ModelRendererTurbo[3];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 4, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 8, 0, textureX, textureY); // Box 1

		bodyModel[0].addBox(-0.5F, 0F, -0.5F, 1, 48, 1, 0F); // Box 0
		bodyModel[0].glow = true;

		bodyModel[1].addShapeBox(-0.5F, 0F, -0.5F, 1, 48, 1, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 1
		bodyModel[1].glow = true;
		
		bodyModel[2].addShapeBox(-0.5F, 0F, -0.5F, 1, 48, 1, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 1		bodyModel[2].setRotationPoint(0F, 0F, 0F);
		bodyModel[2].glow = true;

	}
	

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		if(brightness<0.3F) light = true;
		if(brightness>=1) light = false;
		if(light) brightness+=0.01;
		else brightness-=0.01;
		for(ModelRendererTurbo part: bodyModel){
			GL11.glPushMatrix();
			double b = Math.random();
			GL11.glColor3d(brightness,brightness,brightness);
			GL11.glRotatef((float)(360*Math.random()), 0,1,0);
			part.render(f5);
			GL11.glPopMatrix();
		}
	}
}
