//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZsaber extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelZsaber()
	{
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 6

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0.5F,0F, 0F, 0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0.5F,0F, 0F, 0.5F); // Box 0
		gunModel[0].setRotationPoint(0F, -2F, -0.75F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(-0.5F, -3F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-0.5F, -5F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-0.5F, 3F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F,-0.5F, 0F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(-0.5F, 4F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 25, 1, 0F,0F, 0F, -0.5F,-4F, 0F, -0.5F,-4F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 2F, -0.5F,0F, 2F, -0.5F,0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(1F, -29F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 25, 1, 0F,0F, 0F, -0.5F,-4F, 0F, -0.5F,-4F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 2F, -0.5F,0F, 2F, -0.5F,0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(1F, -29F, 0.5F);
		gunModel[6].rotateAngleY = -3.14159265F;



		barrelAttachPoint = new Vector3f(0F, 0F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(0F, 0F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
