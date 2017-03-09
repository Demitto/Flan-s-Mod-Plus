//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelShark extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelShark()
	{
		bodyModel = new ModelRendererTurbo[27];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import COCockpit2
		bodyModel[1] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Import COCockpit3
		bodyModel[2] = new ModelRendererTurbo(this, 13, 140, textureX, textureY); // Import COCockpit4
		bodyModel[3] = new ModelRendererTurbo(this, 40, 92, textureX, textureY); // Import COCockpit5
		bodyModel[4] = new ModelRendererTurbo(this, 12, 170, textureX, textureY); // Import COCockpit6
		bodyModel[5] = new ModelRendererTurbo(this, 12, 170, textureX, textureY); // Import COCockpit7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Import COCockpit8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 239, textureX, textureY); // Import COCockpit9
		bodyModel[8] = new ModelRendererTurbo(this, 18, 239, textureX, textureY); // Import COCockpit10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import COCockpit11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import COCockpit12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import COCockpit13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import COCockpit14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import COCockpit15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import COCockpit16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import COCockpit17
		bodyModel[16] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import COCockpit18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import COCockpit19
		bodyModel[18] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import COCockpit20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import COCockpit21
		bodyModel[20] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import COCockpit22
		bodyModel[21] = new ModelRendererTurbo(this, 74, 195, textureX, textureY); // Import COCockpit23
		bodyModel[22] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Import COCockpit24
		bodyModel[23] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Import COBody1
		bodyModel[24] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import COBody18
		bodyModel[25] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import COBody19
		bodyModel[26] = new ModelRendererTurbo(this, 400, 800, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 16, 3, 16, 0F); // Import COCockpit2
		bodyModel[0].setRotationPoint(-57F, -20F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 20, 16, 0F); // Import COCockpit3
		bodyModel[1].setRotationPoint(-41F, -37F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 16, 10, 16, 0F); // Import COCockpit4
		bodyModel[2].setRotationPoint(-35F, -27F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 29, 16, 0F); // Import COCockpit5
		bodyModel[3].setRotationPoint(-19F, -46F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 64, 22, 2, 0F); // Import COCockpit6
		bodyModel[4].setRotationPoint(-80F, -37F, -12F);

		bodyModel[5].addBox(0F, 0F, 0F, 64, 22, 2, 0F); // Import COCockpit7
		bodyModel[5].setRotationPoint(-80F, -37F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 12, 20, 20, 0F); // Import COCockpit8
		bodyModel[6].setRotationPoint(-80F, -37F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Import COCockpit9
		bodyModel[7].setRotationPoint(-67F, -27F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import COCockpit10
		bodyModel[8].setRotationPoint(-66F, -32F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 40, 24, 0F); // Import COCockpit11
		bodyModel[9].setRotationPoint(-16F, -55F, -12F);

		bodyModel[10].addBox(0F, 0F, 0F, 32, 3, 3, 0F); // Import COCockpit12
		bodyModel[10].setRotationPoint(-48F, -55F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 29, 18, 3, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Import COCockpit13
		bodyModel[11].setRotationPoint(-77F, -55F, -12F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // Import COCockpit14
		bodyModel[12].setRotationPoint(-48F, -52F, -12F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // Import COCockpit15
		bodyModel[13].setRotationPoint(-29F, -52F, -12F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 3, 3, 0F); // Import COCockpit16
		bodyModel[14].setRotationPoint(-48F, -55F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 29, 18, 3, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Import COCockpit17
		bodyModel[15].setRotationPoint(-77F, -55F, 9F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // Import COCockpit18
		bodyModel[16].setRotationPoint(-48F, -52F, 9F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // Import COCockpit19
		bodyModel[17].setRotationPoint(-29F, -52F, 9F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 3, 24, 0F); // Import COCockpit20
		bodyModel[18].setRotationPoint(-80F, -40F, -12F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 3, 18, 0F); // Import COCockpit21
		bodyModel[19].setRotationPoint(-48F, -55F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 18, 0F); // Import COCockpit22
		bodyModel[20].setRotationPoint(-29F, -55F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 24, 23, 24, 0F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F); // Import COCockpit23
		bodyModel[21].setRotationPoint(-104F, -38F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 35, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F); // Import COCockpit24
		bodyModel[22].setRotationPoint(-48F, -15F, -12F);

		bodyModel[23].addBox(0F, 0F, 0F, 64, 49, 24, 0F); // Import COBody1
		bodyModel[23].setRotationPoint(-13F, -55F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 51, 49, 16, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import COBody18
		bodyModel[24].setRotationPoint(0F, -55F, -28F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 51, 49, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Import COBody19
		bodyModel[25].setRotationPoint(0F, -55F, 12F);

		bodyModel[26].addBox(0F, 0F, 0F, 62, 2, 20, 0F); // Box 0
		bodyModel[26].setRotationPoint(-80F, -17F, -10F);


		tailModel = new ModelRendererTurbo[19];
		tailModel[0] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import TAconnect1
		tailModel[1] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import TAconnect2
		tailModel[2] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import TAconnect3
		tailModel[3] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import TAmain1
		tailModel[4] = new ModelRendererTurbo(this, 200, 500, textureX, textureY); // Import TAmain2
		tailModel[5] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Import TAmain3
		tailModel[6] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Import TAmain4
		tailModel[7] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import TATF1
		tailModel[8] = new ModelRendererTurbo(this, 260, 370, textureX, textureY); // Import TAHATS
		tailModel[9] = new ModelRendererTurbo(this, 260, 370, textureX, textureY); // Import TATF3
		tailModel[10] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import TABF1
		tailModel[11] = new ModelRendererTurbo(this, 260, 370, textureX, textureY); // Import TABF2
		tailModel[12] = new ModelRendererTurbo(this, 260, 370, textureX, textureY); // Import TABF3
		tailModel[13] = new ModelRendererTurbo(this, 200, 415, textureX, textureY); // Import TALF1
		tailModel[14] = new ModelRendererTurbo(this, 260, 395, textureX, textureY); // Import TALF2
		tailModel[15] = new ModelRendererTurbo(this, 260, 395, textureX, textureY); // Import TALF3
		tailModel[16] = new ModelRendererTurbo(this, 200, 415, textureX, textureY); // Import TARF1
		tailModel[17] = new ModelRendererTurbo(this, 260, 395, textureX, textureY); // Import TARF2
		tailModel[18] = new ModelRendererTurbo(this, 260, 395, textureX, textureY); // Import TARF3

		tailModel[0].addShapeBox(0F, 0F, 0F, 16, 49, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -15F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, -15F, 0F, -6F, 0F); // Import TAconnect1
		tailModel[0].setRotationPoint(51F, -55F, 12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 16, 49, 16, 0F, 0F, -8F, 0F, 0F, -8F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -14F, -15F, 0F, -14F, 0F, 0F, 0F, 0F); // Import TAconnect2
		tailModel[1].setRotationPoint(51F, -55F, -28F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 16, 35, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F); // Import TAconnect3
		tailModel[2].setRotationPoint(51F, -55F, -12F);

		tailModel[3].addBox(0F, 0F, 0F, 32, 35, 24, 0F); // Import TAmain1
		tailModel[3].setRotationPoint(67F, -55F, -12F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 48, 20, 16, 0F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 14F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 4F); // Import TAmain2
		tailModel[4].setRotationPoint(99F, -54F, -8F);

		tailModel[5].addBox(0F, 0F, 0F, 32, 20, 16, 0F); // Import TAmain3
		tailModel[5].setRotationPoint(147F, -54F, -8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 8, 20, 16, 0F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, 0F); // Import TAmain4
		tailModel[6].setRotationPoint(179F, -54F, -8F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 24, 32, 4, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TATF1
		tailModel[7].setRotationPoint(163F, -86F, -2F);

		tailModel[8].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // Import TAHATS
		tailModel[8].setRotationPoint(187F, -86F, -2F);

		tailModel[9].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // Import TATF3
		tailModel[9].setRotationPoint(187F, -62F, -2F);

		tailModel[10].addShapeBox(0F, 0F, -2F, 24, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Import TABF1
		tailModel[10].setRotationPoint(163F, -34F, 0F);

		tailModel[11].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // Import TABF2
		tailModel[11].setRotationPoint(187F, -10F, -2F);

		tailModel[12].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // Import TABF3
		tailModel[12].setRotationPoint(187F, -34F, -2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 24, 4, 32, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TALF1
		tailModel[13].setRotationPoint(163F, -46F, -40F);

		tailModel[14].addBox(0F, 0F, 0F, 8, 4, 8, 0F); // Import TALF2
		tailModel[14].setRotationPoint(187F, -46F, -40F);

		tailModel[15].addBox(0F, -2F, 0F, 8, 4, 8, 0F); // Import TALF3
		tailModel[15].setRotationPoint(187F, -44F, -16F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 24, 4, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Import TARF1
		tailModel[16].setRotationPoint(163F, -46F, 8F);

		tailModel[17].addBox(0F, 0F, 0F, 8, 4, 8, 0F); // Import TARF2
		tailModel[17].setRotationPoint(187F, -46F, 32F);

		tailModel[18].addBox(0F, 0F, 0F, 8, 4, 8, 0F); // Import TARF3
		tailModel[18].setRotationPoint(187F, -46F, 8F);


		bayModel = new ModelRendererTurbo[14];
		bayModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 19
		bayModel[1] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 20
		bayModel[2] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 21
		bayModel[3] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 22
		bayModel[4] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 23
		bayModel[5] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 24
		bayModel[6] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 25
		bayModel[7] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 26
		bayModel[8] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 27
		bayModel[9] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 28
		bayModel[10] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 29
		bayModel[11] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 30
		bayModel[12] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 31
		bayModel[13] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 32

		bayModel[0].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 19
		bayModel[0].setRotationPoint(-80F, -11F, 0F);

		bayModel[1].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 20
		bayModel[1].setRotationPoint(-80F, -11F, 0F);
		bayModel[1].rotateAngleX = 0.78539816F;

		bayModel[2].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 21
		bayModel[2].setRotationPoint(-80F, -11F, 0F);
		bayModel[2].rotateAngleX = 1.57079633F;

		bayModel[3].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 22
		bayModel[3].setRotationPoint(-80F, -11F, 0F);
		bayModel[3].rotateAngleX = 2.35619449F;

		bayModel[4].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 23
		bayModel[4].setRotationPoint(-80F, -11F, 0F);
		bayModel[4].rotateAngleX = 3.14159265F;

		bayModel[5].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 24
		bayModel[5].setRotationPoint(-80F, -11F, 0F);
		bayModel[5].rotateAngleX = -0.78539816F;

		bayModel[6].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 25
		bayModel[6].setRotationPoint(-80F, -11F, 0F);
		bayModel[6].rotateAngleX = -1.57079633F;

		bayModel[7].addBox(0F, 1.5F, -0.5F, 32, 1, 1, 0F); // Box 26
		bayModel[7].setRotationPoint(-80F, -11F, 0F);
		bayModel[7].rotateAngleX = -2.35619449F;

		bayModel[8].addShapeBox(0F, 1F, -3F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bayModel[8].setRotationPoint(-78F, -11F, 0F);
		bayModel[8].rotateAngleX = 3.14159265F;

		bayModel[9].addBox(0F, -1F, -3F, 8, 2, 6, 0F); // Box 28
		bayModel[9].setRotationPoint(-78F, -11F, 0F);
		bayModel[9].rotateAngleX = 3.14159265F;

		bayModel[10].addShapeBox(0F, -3F, -3F, 8, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bayModel[10].setRotationPoint(-78F, -11F, 0F);
		bayModel[10].rotateAngleX = 3.14159265F;

		bayModel[11].addShapeBox(0F, -3F, -3F, 8, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bayModel[11].setRotationPoint(-52F, -11F, 0F);
		bayModel[11].rotateAngleX = 3.14159265F;

		bayModel[12].addShapeBox(0F, 1F, -3F, 8, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 31
		bayModel[12].setRotationPoint(-52F, -11F, 0F);
		bayModel[12].rotateAngleX = 3.14159265F;

		bayModel[13].addBox(0F, -1F, -3F, 8, 2, 6, 0F); // Box 32
		bayModel[13].setRotationPoint(-52F, -11F, 0F);
		bayModel[13].rotateAngleX = 3.14159265F;


		leftWingModel = new ModelRendererTurbo[31];
		leftWingModel[0] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 54
		leftWingModel[1] = new ModelRendererTurbo(this, 400, 110, textureX, textureY); // Box 55
		leftWingModel[2] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Box 56
		leftWingModel[3] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 57
		leftWingModel[4] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 58
		leftWingModel[5] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 61
		leftWingModel[6] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 62
		leftWingModel[7] = new ModelRendererTurbo(this, 400, 215, textureX, textureY); // Box 63
		leftWingModel[8] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Box 64
		leftWingModel[9] = new ModelRendererTurbo(this, 400, 625, textureX, textureY); // Box 65
		leftWingModel[10] = new ModelRendererTurbo(this, 400, 485, textureX, textureY); // Box 66
		leftWingModel[11] = new ModelRendererTurbo(this, 400, 530, textureX, textureY); // Box 67
		leftWingModel[12] = new ModelRendererTurbo(this, 400, 575, textureX, textureY); // Box 68
		leftWingModel[13] = new ModelRendererTurbo(this, 400, 710, textureX, textureY); // Box 69
		leftWingModel[14] = new ModelRendererTurbo(this, 400, 710, textureX, textureY); // Box 70
		leftWingModel[15] = new ModelRendererTurbo(this, 400, 710, textureX, textureY); // Box 71
		leftWingModel[16] = new ModelRendererTurbo(this, 400, 750, textureX, textureY); // Box 72
		leftWingModel[17] = new ModelRendererTurbo(this, 800, 915, textureX, textureY); // Box 73
		leftWingModel[18] = new ModelRendererTurbo(this, 400, 765, textureX, textureY); // Box 74
		leftWingModel[19] = new ModelRendererTurbo(this, 400, 765, textureX, textureY); // Box 75
		leftWingModel[20] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 76
		leftWingModel[21] = new ModelRendererTurbo(this, 400, 750, textureX, textureY); // Box 77
		leftWingModel[22] = new ModelRendererTurbo(this, 400, 750, textureX, textureY); // Box 78
		leftWingModel[23] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 79
		leftWingModel[24] = new ModelRendererTurbo(this, 400, 765, textureX, textureY); // Box 80
		leftWingModel[25] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 81
		leftWingModel[26] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 82
		leftWingModel[27] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 83
		leftWingModel[28] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 84
		leftWingModel[29] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 85
		leftWingModel[30] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 86

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[0].setRotationPoint(10F, -37F, -51F);

		leftWingModel[1].addBox(0F, 0F, 0F, 47, 12, 15, 0F); // Box 55
		leftWingModel[1].setRotationPoint(10F, -37F, -36F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 26, 12, 77, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		leftWingModel[2].setRotationPoint(-16F, -37F, -89F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 16, 12, 67, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 57
		leftWingModel[3].setRotationPoint(57F, -37F, -89F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[4].setRotationPoint(41F, -37F, -51F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftWingModel[5].setRotationPoint(10F, -37F, -81F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 62
		leftWingModel[6].setRotationPoint(41F, -37F, -81F);

		leftWingModel[7].addBox(0F, 0F, 0F, 47, 12, 8, 0F); // Box 63
		leftWingModel[7].setRotationPoint(10F, -37F, -89F);

		leftWingModel[8].addBox(0F, 0F, 0F, 4, 2, 46, 0F); // Box 64
		leftWingModel[8].setRotationPoint(31.5F, -34F, -82F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 48, 12, 64, 0F, -22F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftWingModel[9].setRotationPoint(9F, -37F, -153F);

		leftWingModel[10].addBox(0F, 0F, 0F, 32, 12, 27, 0F); // Box 66
		leftWingModel[10].setRotationPoint(73F, -37F, -49F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 37, 12, 27, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 0F); // Box 67
		leftWingModel[11].setRotationPoint(105F, -37F, -49F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 8, 12, 27, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftWingModel[12].setRotationPoint(142F, -37F, -27F);

		leftWingModel[13].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 69
		leftWingModel[13].setRotationPoint(28F, -25F, -116F);

		leftWingModel[14].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 70
		leftWingModel[14].setRotationPoint(28F, -25F, -136F);

		leftWingModel[15].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 71
		leftWingModel[15].setRotationPoint(28F, -25F, -96F);

		leftWingModel[16].addTrapezoid(0F, 0F, 0F, 11, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 72
		leftWingModel[16].setRotationPoint(9F, -21F, -97F);

		leftWingModel[17].addBox(0F, 0F, 0F, 33, 5, 5, 0F); // Box 73
		leftWingModel[17].setRotationPoint(20F, -21F, -97F);

		leftWingModel[18].addTrapezoid(0F, 0F, 0F, 4, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 74
		leftWingModel[18].setRotationPoint(53F, -21F, -97F);

		leftWingModel[19].addTrapezoid(0F, 0F, 0F, 4, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 75
		leftWingModel[19].setRotationPoint(53F, -21F, -117F);

		leftWingModel[20].addBox(0F, 0F, 0F, 33, 5, 5, 0F); // Box 76
		leftWingModel[20].setRotationPoint(20F, -21F, -117F);

		leftWingModel[21].addTrapezoid(0F, 0F, 0F, 11, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 77
		leftWingModel[21].setRotationPoint(9F, -21F, -117F);

		leftWingModel[22].addTrapezoid(0F, 0F, 0F, 11, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 78
		leftWingModel[22].setRotationPoint(9F, -21F, -137F);

		leftWingModel[23].addBox(0F, 0F, 0F, 33, 5, 5, 0F); // Box 79
		leftWingModel[23].setRotationPoint(20F, -21F, -137F);

		leftWingModel[24].addTrapezoid(0F, 0F, 0F, 4, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 80
		leftWingModel[24].setRotationPoint(53F, -21F, -137F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		leftWingModel[25].setRotationPoint(32F, -19F, -142F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 82
		leftWingModel[26].setRotationPoint(32F, -19F, -132F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		leftWingModel[27].setRotationPoint(32F, -19F, -122F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 84
		leftWingModel[28].setRotationPoint(32F, -19F, -112F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingModel[29].setRotationPoint(32F, -19F, -102F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 86
		leftWingModel[30].setRotationPoint(32F, -19F, -92F);


		rightWingModel = new ModelRendererTurbo[35];
		rightWingModel[0] = new ModelRendererTurbo(this, 400, 110, textureX, textureY); // Box 1
		rightWingModel[1] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 2
		rightWingModel[2] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 3
		rightWingModel[3] = new ModelRendererTurbo(this, 400, 180, textureX, textureY); // Box 4
		rightWingModel[4] = new ModelRendererTurbo(this, 400, 180, textureX, textureY); // Box 5
		rightWingModel[5] = new ModelRendererTurbo(this, 400, 215, textureX, textureY); // Box 6
		rightWingModel[6] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 7
		rightWingModel[7] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 8
		rightWingModel[8] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Box 9
		rightWingModel[9] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Box 13
		rightWingModel[10] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 14
		rightWingModel[11] = new ModelRendererTurbo(this, 400, 485, textureX, textureY); // Box 15
		rightWingModel[12] = new ModelRendererTurbo(this, 400, 530, textureX, textureY); // Box 16
		rightWingModel[13] = new ModelRendererTurbo(this, 400, 575, textureX, textureY); // Box 17
		rightWingModel[14] = new ModelRendererTurbo(this, 400, 625, textureX, textureY); // Box 18
		rightWingModel[15] = new ModelRendererTurbo(this, 400, 710, textureX, textureY); // Box 33
		rightWingModel[16] = new ModelRendererTurbo(this, 400, 710, textureX, textureY); // Box 34
		rightWingModel[17] = new ModelRendererTurbo(this, 400, 710, textureX, textureY); // Box 35
		rightWingModel[18] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 36
		rightWingModel[19] = new ModelRendererTurbo(this, 400, 750, textureX, textureY); // Box 37
		rightWingModel[20] = new ModelRendererTurbo(this, 400, 765, textureX, textureY); // Box 38
		rightWingModel[21] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 39
		rightWingModel[22] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 40
		rightWingModel[23] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 41
		rightWingModel[24] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 42
		rightWingModel[25] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 43
		rightWingModel[26] = new ModelRendererTurbo(this, 400, 765, textureX, textureY); // Box 44
		rightWingModel[27] = new ModelRendererTurbo(this, 400, 750, textureX, textureY); // Box 45
		rightWingModel[28] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 46
		rightWingModel[29] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 47
		rightWingModel[30] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 48
		rightWingModel[31] = new ModelRendererTurbo(this, 400, 765, textureX, textureY); // Box 49
		rightWingModel[32] = new ModelRendererTurbo(this, 400, 750, textureX, textureY); // Box 50
		rightWingModel[33] = new ModelRendererTurbo(this, 400, 180, textureX, textureY); // Box 59
		rightWingModel[34] = new ModelRendererTurbo(this, 400, 180, textureX, textureY); // Box 60

		rightWingModel[0].addBox(0F, 0F, 0F, 47, 12, 15, 0F); // Box 1
		rightWingModel[0].setRotationPoint(10F, -37F, 21F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightWingModel[1].setRotationPoint(10F, -37F, 36F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 3
		rightWingModel[2].setRotationPoint(41F, -37F, 36F);

		rightWingModel[3].addBox(0F, 0F, 0F, 1, 12, 15, 0F); // Box 4
		rightWingModel[3].setRotationPoint(10F, -37F, 51F);

		rightWingModel[4].addBox(0F, 0F, 0F, 1, 12, 15, 0F); // Box 5
		rightWingModel[4].setRotationPoint(56F, -37F, 51F);

		rightWingModel[5].addBox(0F, 0F, 0F, 47, 12, 8, 0F); // Box 6
		rightWingModel[5].setRotationPoint(10F, -37F, 81F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightWingModel[6].setRotationPoint(10F, -37F, 66F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 16, 12, 15, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingModel[7].setRotationPoint(41F, -37F, 66F);

		rightWingModel[8].addBox(0F, 0F, 0F, 4, 2, 46, 0F); // Box 9
		rightWingModel[8].setRotationPoint(31.5F, -34F, 36F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 26, 12, 77, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Box 13
		rightWingModel[9].setRotationPoint(-16F, -37F, 12F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 16, 12, 67, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F); // Box 14
		rightWingModel[10].setRotationPoint(57F, -37F, 22F);

		rightWingModel[11].addBox(0F, 0F, 0F, 32, 12, 27, 0F); // Box 15
		rightWingModel[11].setRotationPoint(73F, -37F, 22F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 37, 12, 27, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F, 0F); // Box 16
		rightWingModel[12].setRotationPoint(105F, -37F, 22F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 8, 12, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 17
		rightWingModel[13].setRotationPoint(142F, -37F, 0F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 48, 12, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -22F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 18
		rightWingModel[14].setRotationPoint(9F, -37F, 89F);

		rightWingModel[15].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 33
		rightWingModel[15].setRotationPoint(28F, -25F, 93F);

		rightWingModel[16].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 34
		rightWingModel[16].setRotationPoint(28F, -25F, 113F);

		rightWingModel[17].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 35
		rightWingModel[17].setRotationPoint(28F, -25F, 133F);

		rightWingModel[18].addBox(0F, 0F, 0F, 33, 5, 5, 0F); // Box 36
		rightWingModel[18].setRotationPoint(20F, -21F, 92F);

		rightWingModel[19].addTrapezoid(0F, 0F, 0F, 11, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 37
		rightWingModel[19].setRotationPoint(9F, -21F, 92F);

		rightWingModel[20].addTrapezoid(0F, 0F, 0F, 4, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 38
		rightWingModel[20].setRotationPoint(53F, -21F, 92F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 39
		rightWingModel[21].setRotationPoint(32F, -19F, 97F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightWingModel[22].setRotationPoint(32F, -19F, 87F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 41
		rightWingModel[23].setRotationPoint(32F, -19F, 117F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		rightWingModel[24].setRotationPoint(32F, -19F, 107F);

		rightWingModel[25].addBox(0F, 0F, 0F, 33, 5, 5, 0F); // Box 43
		rightWingModel[25].setRotationPoint(20F, -21F, 112F);

		rightWingModel[26].addTrapezoid(0F, 0F, 0F, 4, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 44
		rightWingModel[26].setRotationPoint(53F, -21F, 112F);

		rightWingModel[27].addTrapezoid(0F, 0F, 0F, 11, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 45
		rightWingModel[27].setRotationPoint(9F, -21F, 112F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 46
		rightWingModel[28].setRotationPoint(32F, -19F, 137F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightWingModel[29].setRotationPoint(32F, -19F, 127F);

		rightWingModel[30].addBox(0F, 0F, 0F, 33, 5, 5, 0F); // Box 48
		rightWingModel[30].setRotationPoint(20F, -21F, 132F);

		rightWingModel[31].addTrapezoid(0F, 0F, 0F, 4, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 49
		rightWingModel[31].setRotationPoint(53F, -21F, 132F);

		rightWingModel[32].addTrapezoid(0F, 0F, 0F, 11, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 50
		rightWingModel[32].setRotationPoint(9F, -21F, 132F);

		rightWingModel[33].addBox(0F, 0F, 0F, 1, 12, 15, 0F); // Box 59
		rightWingModel[33].setRotationPoint(56F, -37F, -66F);

		rightWingModel[34].addBox(0F, 0F, 0F, 1, 12, 15, 0F); // Box 60
		rightWingModel[34].setRotationPoint(10F, -37F, -66F);


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 260, 800, textureX, textureY); // Import YF1
		yawFlapModel[1] = new ModelRendererTurbo(this, 260, 800, textureX, textureY); // Import YF2

		yawFlapModel[0].addBox(0F, -16F, -2F, 8, 16, 4, 0F); // Import YF1
		yawFlapModel[0].setRotationPoint(187F, -62F, 0F);

		yawFlapModel[1].addBox(0F, -16F, -2F, 8, 16, 4, 0F); // Import YF2
		yawFlapModel[1].setRotationPoint(187F, -10F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 260, 830, textureX, textureY); // Import PFL1

		pitchFlapLeftModel[0].addBox(0F, -2F, 0F, 8, 4, 16, 0F); // Import PFL1
		pitchFlapLeftModel[0].setRotationPoint(187F, -44F, -32F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 260, 830, textureX, textureY); // Import PFR1

		pitchFlapRightModel[0].addBox(0F, -2F, 0F, 8, 4, 16, 0F); // Import PFR1
		pitchFlapRightModel[0].setRotationPoint(187F, -44F, 16F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[3];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 51
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 400, 55, textureX, textureY); // Box 52
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 400, 80, textureX, textureY); // Box 53

		pitchFlapLeftWingModel[0].addShapeBox(-21F, -1F, -44F, 42, 4, 14, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		pitchFlapLeftWingModel[0].setRotationPoint(33.5F, -34F, -36F);

		pitchFlapLeftWingModel[1].addBox(-21F, -1F, -30F, 42, 4, 14, 0F); // Box 52
		pitchFlapLeftWingModel[1].setRotationPoint(33.5F, -34F, -36F);

		pitchFlapLeftWingModel[2].addShapeBox(-21F, -1F, -16F, 42, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 53
		pitchFlapLeftWingModel[2].setRotationPoint(33.5F, -34F, -36F);


		pitchFlapRightWingModel = new ModelRendererTurbo[3];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 10
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 400, 55, textureX, textureY); // Box 11
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 400, 80, textureX, textureY); // Box 12

		pitchFlapRightWingModel[0].addShapeBox(-21F, -1F, 2F, 42, 4, 14, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		pitchFlapRightWingModel[0].setRotationPoint(33.5F, -34F, 36F);

		pitchFlapRightWingModel[1].addBox(-21F, -1F, 16F, 42, 4, 14, 0F); // Box 11
		pitchFlapRightWingModel[1].setRotationPoint(33.5F, -34F, 36F);

		pitchFlapRightWingModel[2].addShapeBox(-21F, -1F, 30F, 42, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 12
		pitchFlapRightWingModel[2].setRotationPoint(33.5F, -34F, 36F);


		tailWheelModel = new ModelRendererTurbo[2];
		tailWheelModel[0] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import TAW1
		tailWheelModel[1] = new ModelRendererTurbo(this, 300, 950, textureX, textureY); // Import TAW2

		tailWheelModel[0].addBox(0F, 30F, -8F, 16, 8, 16, 0F); // Import TAW1
		tailWheelModel[0].setRotationPoint(88F, -15F, 0F);

		tailWheelModel[1].addShapeBox(-4F, -4F, -4F, 28, 34, 8, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -20F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -20F, 1F, 0F); // Import TAW2
		tailWheelModel[1].setRotationPoint(76F, -16F, 0F);


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import LWW1
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import LWW2

		leftWingWheelModel[0].addBox(0F, 30F, -31F, 16, 8, 16, 0F); // Import LWW1
		leftWingWheelModel[0].setRotationPoint(-16F, -15F, 0F);

		leftWingWheelModel[1].addShapeBox(0F, 22F, -27F, 8, 26, 26, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F); // Import LWW2
		leftWingWheelModel[1].setRotationPoint(-12F, -33F, 0F);


		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import RWW1
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import RWW2

		rightWingWheelModel[0].addBox(0F, 30F, 15F, 16, 8, 16, 0F); // Import RWW1
		rightWingWheelModel[0].setRotationPoint(-16F, -15F, 0F);

		rightWingWheelModel[1].addShapeBox(0F, 22F, 1F, 8, 26, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWW2
		rightWingWheelModel[1].setRotationPoint(-12F, -33F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
