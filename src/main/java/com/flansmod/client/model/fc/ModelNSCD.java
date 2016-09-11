//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNSCD extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelNSCD()
	{
		headModel = new ModelRendererTurbo[22];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		headModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		headModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		headModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		headModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		headModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		headModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		headModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		headModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		headModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		headModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		headModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		headModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		headModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22

		headModel[0].addShapeBox(-18F, -30F, -24F, 36, 30, 8, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-18F, -35F, -24F, 36, 5, 8, 0F,-4F, 0F, -7F,-4F, 0F, -7F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 4F, 0F,-4F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-18F, -35F, -16F, 36, 5, 17, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-10F, -25F, -29F, 20, 2, 5, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-10F, -23F, -29F, 2, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addBox(-10F, -23F, -26F, 2, 16, 2, 0F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addBox(8F, -23F, -26F, 2, 16, 2, 0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(8F, -23F, -29F, 2, 16, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addBox(-8F, -9F, -26F, 16, 2, 2, 0F); // Box 9
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-18F, -30F, -16F, 2, 30, 17, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -9F,0F, 0F, -9F); // Box 10
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(16F, -30F, -16F, 2, 30, 17, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -9F,0F, 0F, -9F); // Box 11
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-16F, -32F, -16F, 32, 32, 32, 0F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F,0.1F, 0.1F, 0.1F); // Box 12
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(16F, -29F, -7F, 1, 6, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 13
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(16F, -18F, -7F, 1, 6, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(16F, -9F, -8F, 1, 6, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 15
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-17F, -9F, -8F, 1, 6, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 16
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-17F, -18F, -7F, 1, 6, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-17F, -29F, -7F, 1, 6, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-18F, -35F, 1F, 36, 3, 15, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-14F, 0F, 0F,-14F, 0F, 0F,-2.4F, 0F, 0F,-2.4F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F); // Box 19
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-17F, -32F, 16F, 34, 32, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F); // Box 20
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-3F, -42F, -13F, 6, 8, 6, 0F,-0.5F, 0F, -4.5F,-0.5F, 0F, -4.5F,-0.5F, 0F, 3.0F,-0.5F, 0F, 3.0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 4F,0F, 0F, 4F); // Box 21
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-1.5F, -63F, -7.5F, 3, 21, 3, 0F,-1.2F, 0F, -12.2F,-1.2F, 0F, -12.2F,-1.2F, 0F, 10.2F,-1.2F, 0F, 10.2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 22
		headModel[21].setRotationPoint(0F, 0F, 0F);




	}
}
