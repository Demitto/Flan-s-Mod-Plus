//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBork extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBork()
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 256, 256, 256, 0F); // Box 0
		bodyModel[0].setRotationPoint(-128F, -246F, -128F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
