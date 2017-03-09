//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class Modelkek extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public Modelkek()
	{
		bodyModel = new ModelRendererTurbo[6];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6

		bodyModel[0].addBox(0F, 0F, -35F, 10, 1, 35, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 1, 35, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(0F, 0F, 0F, 42, 1, 8, 0F); // Box 2
		bodyModel[2].setRotationPoint(-32F, 0F, -4F);

		bodyModel[3].addShape3D(0F, -2F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 10, 10, 10) }), 1, 10, 10, 35, 1, ModelRendererTurbo.MR_FRONT, new float[] {15 ,10 ,10}); // Shape 3
		bodyModel[3].setRotationPoint(0F, 1F, 37F);
		bodyModel[3].rotateAngleX = 4.71238898F;
		bodyModel[3].rotateAngleZ = 3.15904595F;

		bodyModel[4].addShape3D(0F, -2F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 10, 10, 10) }), 1, 10, 10, 35, 1, ModelRendererTurbo.MR_FRONT, new float[] {15 ,10 ,10}); // Shape 4
		bodyModel[4].setRotationPoint(0F, 0F, -37F);
		bodyModel[4].rotateAngleX = 1.57079633F;
		bodyModel[4].rotateAngleZ = 3.14159265F;

		bodyModel[5].addBox(0F, 0F, 0F, 41, 1, 7, 0F); // Box 6
		bodyModel[5].setRotationPoint(-31F, 1F, -3.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}


}
