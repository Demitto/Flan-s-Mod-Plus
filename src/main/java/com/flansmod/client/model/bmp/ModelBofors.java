//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBofors extends ModelAAGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBofors() //Same as Filename
	{
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		baseModel[0].addObj("/British Military Pack/assets/flansmod/models/BoforsBase2.obj");
		baseModel[0].setRotationPoint(0F, 0F, 0F);


		seatModel = new ModelRendererTurbo[1];
		seatModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2

		seatModel[0].addObj("/British Military Pack/assets/flansmod/models/BoforsTurret2.obj");
		seatModel[0].setRotationPoint(0F, 0F, 0F);


		gunsightModel = new ModelRendererTurbo[1];
		gunsightModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1

		gunsightModel[0].addObj("/British Military Pack/assets/flansmod/models/BoforsBarrel2.obj");
		gunsightModel[0].setRotationPoint(0F, 29F, 0F);



		barrelX = 0;
		barrelY = 0;
		barrelZ = 0;



	}
}