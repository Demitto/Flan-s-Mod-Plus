//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAlphaHead extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelAlphaHead()
	{
		headModel = new ModelRendererTurbo[32];
		headModel[0] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Box 5
		headModel[5] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 9
		headModel[9] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 10
		headModel[10] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Box 11
		headModel[11] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 12
		headModel[12] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Box 13
		headModel[13] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 14
		headModel[14] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 15
		headModel[15] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 16
		headModel[16] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 17
		headModel[17] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Box 18
		headModel[18] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 20
		headModel[19] = new ModelRendererTurbo(this, 100, 40, textureX, textureY); // Box 21
		headModel[20] = new ModelRendererTurbo(this, 100, 60, textureX, textureY); // Box 22
		headModel[21] = new ModelRendererTurbo(this, 100, 80, textureX, textureY); // Box 23
		headModel[22] = new ModelRendererTurbo(this, 100, 40, textureX, textureY); // Box 24
		headModel[23] = new ModelRendererTurbo(this, 100, 60, textureX, textureY); // Box 25
		headModel[24] = new ModelRendererTurbo(this, 100, 80, textureX, textureY); // Box 26
		headModel[25] = new ModelRendererTurbo(this, 100, 100, textureX, textureY); // Box 29
		headModel[26] = new ModelRendererTurbo(this, 100, 140, textureX, textureY); // Box 30
		headModel[27] = new ModelRendererTurbo(this, 100, 160, textureX, textureY); // Box 31
		headModel[28] = new ModelRendererTurbo(this, 100, 180, textureX, textureY); // Box 32
		headModel[29] = new ModelRendererTurbo(this, 120, 200, textureX, textureY); // Box 33
		headModel[30] = new ModelRendererTurbo(this, 100, 380, textureX, textureY); // Box 34
		headModel[31] = new ModelRendererTurbo(this, 120, 200, textureX, textureY); // Box 35

		headModel[0].addShapeBox(-16F, -12F, 7F, 32, 4, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-16F, -20F, 14F, 32, 8, 5, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -5F, 0F,-1F, -5F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-14F, -28F, 14F, 28, 8, 5, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, -1F,-2F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-16F, -28F, 12F, 32, 16, 2, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addBox(-16F, -6F, 7F, 32, 7, 9, 0F); // Box 5
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-16F, -6F, 16F, 4, 7, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(12F, -6F, 16F, 4, 7, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-16F, -2F, 1F, 32, 3, 6, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, -3F,-1F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-16F, -6F, -11F, 32, 4, 18, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, -3F,-5F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addBox(-16F, -8F, 7F, 32, 2, 7, 0F); // Box 10
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-12F, -12F, -17F, 24, 6, 12, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-2F, 0F, -6F,-2F, 0F, -6F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-8F, -12F, -23F, 16, 6, 6, 0F,-2F, -3F, 0F,-2F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, -3F,-1F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F); // Box 12
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-7F, -14F, -23F, 14, 2, 3, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 3F, 0F,-1F, 3F, 0F,1F, 0F, 3F,1F, 0F, 3F); // Box 13
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-13F, -8F, -20F, 26, 8, 23, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, -9F,-5F, 0F, -9F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-15F, -25F, 7F, 30, 13, 5, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 15
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-10F, -21F, -20F, 20, 9, 12, 0F,-4F, -8F, 0F,-4F, -8F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 16
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-7F, -15F, -23F, 14, 1, 3, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-15F, -12F, -20F, 30, 6, 27, 0F,-9F, 0F, 0F,-9F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F,-9F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-12F, -17F, 14F, 24, 17, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 20
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-12F, -15F, 14F, 6, 10, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 2F,-1F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,-1F, -4F, 0F,-1F, -4F, 0F); // Box 21
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addBox(-10F, -30F, 20F, 2, 15, 2, 0F); // Box 22
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-11F, -32F, 19F, 4, 5, 4, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F); // Box 23
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(6F, -15F, 14F, 6, 10, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 2F,-1F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,-1F, -4F, 0F,-1F, -4F, 0F); // Box 24
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addBox(8F, -30F, 20F, 2, 15, 2, 0F); // Box 25
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(7F, -32F, 19F, 4, 5, 4, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F); // Box 26
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-15F, -25F, -8F, 30, 13, 15, 0F,-7F, -4F, 0F,-7F, -4F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 29
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-11F, -27F, 7F, 22, 2, 5, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 30
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-11F, -27F, -8F, 22, 2, 15, 0F,-7F, -4F, 0F,-7F, -4F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-3F, 4F, 0F,-3F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-8F, -23F, -20F, 16, 2, 12, 0F,-5F, -8F, 0F,-5F, -8F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-2F, 8F, 0F,-2F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 32
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-15.35F, -20F, -8F, 26, 8, 15, 0F,-5.5F, -6F, 0F,-5.5F, -6F, 0F,-2.46F, 0F, 0F,-2.46F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 33
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addBox(-15F, -12F, 7F, 30, 4, 5, 0F); // Box 34
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-10.65F, -20F, -8F, 26, 8, 15, 0F,-5.5F, -6F, 0F,-5.5F, -6F, 0F,-2.46F, 0F, 0F,-2.46F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 35
		headModel[31].setRotationPoint(0F, 0F, 0F);


	}
}
