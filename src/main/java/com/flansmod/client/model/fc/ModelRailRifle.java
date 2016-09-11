//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRailRifle extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelRailRifle()
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 27
		gunModel[25] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 28
		gunModel[26] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 29
		gunModel[27] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 38

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,2F, 0F, 0F); // Box 2
		gunModel[0].setRotationPoint(3F, -6F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,2F, 0F, -1F,-2F, 0F, 0F,-2F, 0F, 0F,2F, 0F, -1F); // Box 3
		gunModel[1].setRotationPoint(2F, -6F, -2F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,2F, 0F, 0F,-2F, 0F, -1F,-2F, 0F, -1F,2F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(5F, -6F, -2F);

		gunModel[3].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 5
		gunModel[3].setRotationPoint(-4F, 2F, -2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 6
		gunModel[4].setRotationPoint(5F, -5.5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,0F, 0F, 0F); // Box 7
		gunModel[5].setRotationPoint(7F, 2F, -2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,2F, 0F, 0F); // Box 8
		gunModel[6].setRotationPoint(9F, -6F, -2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F); // Box 9
		gunModel[7].setRotationPoint(0F, -12F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 10
		gunModel[8].setRotationPoint(2F, -12F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		gunModel[9].setRotationPoint(3F, -12F, -2F);

		gunModel[10].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 12
		gunModel[10].setRotationPoint(5F, -10F, -2F);

		gunModel[11].addBox(0F, 0F, 0F, 22, 4, 3, 0F); // Box 13
		gunModel[11].setRotationPoint(3F, -12F, -1.5F);

		gunModel[12].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 14
		gunModel[12].setRotationPoint(-9F, -10F, -1F);

		gunModel[13].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 15
		gunModel[13].setRotationPoint(-11F, -11F, -1.5F);

		gunModel[14].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 16
		gunModel[14].setRotationPoint(25F, -12F, -1.5F);

		gunModel[15].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 17
		gunModel[15].setRotationPoint(25F, -11F, -1.5F);

		gunModel[16].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // Box 18
		gunModel[16].setRotationPoint(25F, -11F, 0.5F);

		gunModel[17].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // Box 19
		gunModel[17].setRotationPoint(14F, -10F, -2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, -0.5F,-1F, 0F, -0.5F,-1F, 0F, -0.5F,-1F, 0F, -0.5F); // Box 20
		gunModel[18].setRotationPoint(14F, -5F, -2F);

		gunModel[19].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 22
		gunModel[19].setRotationPoint(21F, -8F, -1.5F);

		gunModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 23
		gunModel[20].setRotationPoint(25F, -9F, 0.5F);

		gunModel[21].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 24
		gunModel[21].setRotationPoint(25F, -9F, -1.5F);

		gunModel[22].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 25
		gunModel[22].setRotationPoint(27F, -9F, -1.5F);

		gunModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 26
		gunModel[23].setRotationPoint(27F, -9F, 0.5F);

		gunModel[24].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 27
		gunModel[24].setRotationPoint(29F, -9F, -1.5F);

		gunModel[25].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 28
		gunModel[25].setRotationPoint(29F, -9F, 0.5F);

		gunModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 29
		gunModel[26].setRotationPoint(31F, -9F, -1.5F);

		gunModel[27].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 30
		gunModel[27].setRotationPoint(31F, -9F, 0.5F);

		gunModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 31
		gunModel[28].setRotationPoint(33F, -9F, -1.5F);

		gunModel[29].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 32
		gunModel[29].setRotationPoint(33F, -9F, 0.5F);

		gunModel[30].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 33
		gunModel[30].setRotationPoint(25F, -8F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F); // Box 34
		gunModel[31].setRotationPoint(9F, -4F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F); // Box 35
		gunModel[32].setRotationPoint(3F, -13F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F); // Box 36
		gunModel[33].setRotationPoint(3F, -13F, 0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F); // Box 37
		gunModel[34].setRotationPoint(3F, -12.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,-1F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F,0F, 0F, -0.4F); // Box 38
		gunModel[35].setRotationPoint(32F, -13F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 21

		ammoModel[0].addBox(0F, 0F, 0F, 7, 8, 2, 0F); // Box 21
		ammoModel[0].setRotationPoint(15.5F, -7F, -1F);


		pumpModel = new ModelRendererTurbo[1];
		pumpModel[0] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 39

		pumpModel[0].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 39
		pumpModel[0].setRotationPoint(14F, -11F, -2F);


		barrelAttachPoint = new Vector3f(0F, 0F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(0F, 0F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);

		pumpDelayAfterReload = 115;
		pumpDelay = 6;
		pumpTime = 9;
		gripIsOnPump = true;
		gunSlideDistance = 2.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
