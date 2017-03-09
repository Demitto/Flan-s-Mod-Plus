//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNSCDLegs extends ModelCustomArmour
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelNSCDLegs()
	{



		leftLegModel = new ModelRendererTurbo[10];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Box 10
		leftLegModel[1] = new ModelRendererTurbo(this, 0, 1375, textureX, textureY); // Box 11
		leftLegModel[2] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 12
		leftLegModel[3] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 13
		leftLegModel[4] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Box 14
		leftLegModel[5] = new ModelRendererTurbo(this, 0, 1375, textureX, textureY); // Box 15
		leftLegModel[6] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 16
		leftLegModel[7] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 17
		leftLegModel[8] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Box 18
		leftLegModel[9] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 19

		leftLegModel[0].addShapeBox(-8.5F, 0.5F, -9F, 17, 48, 18, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F); // Box 10
		leftLegModel[0].setRotationPoint(8F, 49F, 0F);

		leftLegModel[1].addShapeBox(-8.5F, -0.5F, -11F, 17, 22, 2, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		leftLegModel[1].setRotationPoint(8F, 49F, 0F);

		leftLegModel[2].addShapeBox(-5.5F, 18.5F, -10F, 5, 30, 1, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 12
		leftLegModel[2].setRotationPoint(8F, 49F, 0F);

		leftLegModel[3].addShapeBox(0.5F, 18.5F, -10F, 5, 30, 1, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 13
		leftLegModel[3].setRotationPoint(8F, 49F, 0F);

		leftLegModel[4].addShapeBox(-8.5F, 27F, -12F, 17, 22, 3, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		leftLegModel[4].setRotationPoint(8F, 49F, 0F);

		leftLegModel[5].addShapeBox(-8.5F, -0.5F, 9F, 17, 22, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F); // Box 15
		leftLegModel[5].setRotationPoint(8F, 49F, 0F);

		leftLegModel[6].addShapeBox(0.5F, 18.5F, 9F, 5, 30, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 16
		leftLegModel[6].setRotationPoint(8F, 49F, 0F);

		leftLegModel[7].addShapeBox(-5.5F, 18.5F, 9F, 5, 30, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 17
		leftLegModel[7].setRotationPoint(8F, 49F, 0F);

		leftLegModel[8].addShapeBox(-8.5F, 27F, 9F, 17, 22, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 18
		leftLegModel[8].setRotationPoint(8F, 49F, 0F);

		leftLegModel[9].addShapeBox(8.5F, 27F, -9F, 2, 22, 18, 0F,0F, 0F, 0F,0F, -4F, -4F,0F, -4F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -4F,0F, -4F, -4F,0F, 0F, 0F); // Box 19
		leftLegModel[9].setRotationPoint(8F, 49F, 0F);


		rightLegModel = new ModelRendererTurbo[10];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Box 0
		rightLegModel[1] = new ModelRendererTurbo(this, 0, 1375, textureX, textureY); // Box 1
		rightLegModel[2] = new ModelRendererTurbo(this, 0, 1375, textureX, textureY); // Box 2
		rightLegModel[3] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 3
		rightLegModel[4] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 4
		rightLegModel[5] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 5
		rightLegModel[6] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 6
		rightLegModel[7] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Box 7
		rightLegModel[8] = new ModelRendererTurbo(this, 0, 1445, textureX, textureY); // Box 8
		rightLegModel[9] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 9

		rightLegModel[0].addShapeBox(-8.5F, 0.5F, -9F, 17, 48, 18, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F); // Box 0
		rightLegModel[0].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[1].addShapeBox(-8.5F, -0.5F, -11F, 17, 22, 2, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		rightLegModel[1].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[2].addShapeBox(-8.5F, -0.5F, 9F, 17, 22, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F); // Box 2
		rightLegModel[2].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[3].addShapeBox(-5.5F, 18.5F, -10F, 5, 30, 1, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		rightLegModel[3].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[4].addShapeBox(0.5F, 18.5F, -10F, 5, 30, 1, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 4
		rightLegModel[4].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[5].addShapeBox(0.5F, 18.5F, 9F, 5, 30, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 5
		rightLegModel[5].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[6].addShapeBox(-5.5F, 18.5F, 9F, 5, 30, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 6
		rightLegModel[6].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[7].addShapeBox(-8.5F, 27F, -12F, 17, 22, 3, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 7
		rightLegModel[7].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[8].addShapeBox(-8.5F, 27F, 9F, 17, 22, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 8
		rightLegModel[8].setRotationPoint(-8F, 49F, 0F);

		rightLegModel[9].addShapeBox(-10.5F, 27F, -9F, 2, 22, 18, 0F,0F, -4F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -4F,0F, -4F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -4F); // Box 9
		rightLegModel[9].setRotationPoint(-8F, 49F, 0F);



	}
}
