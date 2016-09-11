//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHeatray extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHeatray() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[71];
		gunModel[0] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Import Body1
		gunModel[1] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 31
		gunModel[31] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 32
		gunModel[32] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 33
		gunModel[33] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 34
		gunModel[34] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 35
		gunModel[35] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 36
		gunModel[36] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 61
		gunModel[60] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 62
		gunModel[61] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 63
		gunModel[62] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 64
		gunModel[63] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 65
		gunModel[64] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 66
		gunModel[65] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 67
		gunModel[66] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 68
		gunModel[67] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 69
		gunModel[68] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 70
		gunModel[69] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 71
		gunModel[70] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 72

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Import Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addTrapezoid(0F, 0F, 0F, 4, 32, 24, 0F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 1
		gunModel[1].setRotationPoint(19F, -16F, -12F);

		gunModel[2].addTrapezoid(0F, 0F, 0F, 2, 28, 20, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 2
		gunModel[2].setRotationPoint(23F, -14F, -10F);

		gunModel[3].addTrapezoid(0F, 0F, 0F, 1, 28, 20, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 3
		gunModel[3].setRotationPoint(25F, -14F, -10F);

		gunModel[4].addTrapezoid(0F, 0F, 0F, 1, 26, 18, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 4
		gunModel[4].setRotationPoint(26F, -13F, -9F);

		gunModel[5].addTrapezoid(0F, 0F, 0F, 1, 28, 20, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 5
		gunModel[5].setRotationPoint(27F, -14F, -10F);

		gunModel[6].addTrapezoid(0F, 0F, 0F, 1, 28, 20, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 6
		gunModel[6].setRotationPoint(28F, -14F, -10F);

		gunModel[7].addTrapezoid(0F, 0F, 0F, 1, 28, 20, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 7
		gunModel[7].setRotationPoint(29F, -14F, -10F);

		gunModel[8].addTrapezoid(0F, 0F, 0F, 1, 26, 18, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 8
		gunModel[8].setRotationPoint(30F, -13F, -9F);

		gunModel[9].addTrapezoid(0F, 0F, 0F, 1, 28, 20, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 9
		gunModel[9].setRotationPoint(31F, -14F, -10F);

		gunModel[10].addTrapezoid(0F, 0F, 0F, 1, 28, 20, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 10
		gunModel[10].setRotationPoint(32F, -14F, -10F);

		gunModel[11].addTrapezoid(0F, 0F, 0F, 8, 32, 24, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 11
		gunModel[11].setRotationPoint(33F, -16F, -12F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 24, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(33F, -17F, -12F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 8, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		gunModel[13].setRotationPoint(33F, 16F, -12F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 13, 28, 24, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(41F, -14F, -12F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 40, 28, 22, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[15].setRotationPoint(41F, -14F, -11F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 40, 2, 22, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(41F, -16F, -11F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 40, 2, 22, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 17
		gunModel[17].setRotationPoint(41F, 14F, -11F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 8, 22, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(81F, -12F, -11F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 22, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(81F, -14F, -11F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 8, 22, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(81F, 4F, -11F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 22, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, -2F); // Box 21
		gunModel[21].setRotationPoint(81F, 12F, -11F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 9, 22, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[22].setRotationPoint(81F, -11F, -7F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 9, 22, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[23].setRotationPoint(81F, -11F, -9F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 9, 22, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 25
		gunModel[24].setRotationPoint(81F, -11F, 7F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 9, 22, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 26
		gunModel[25].setRotationPoint(90F, -11F, 7F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 9, 22, 2, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[26].setRotationPoint(90F, -11F, -9F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[27].setRotationPoint(90F, -11F, -7F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[28].setRotationPoint(90F, 9F, -7F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 13, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[29].setRotationPoint(54F, -8F, -12F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 13, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[30].setRotationPoint(54F, 6F, -12F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[31].setRotationPoint(98F, -6.5F, -7F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[32].setRotationPoint(98F, -4.5F, -7F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[33].setRotationPoint(98F, -2.5F, -7F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[34].setRotationPoint(98F, -0.5F, -7F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[35].setRotationPoint(98F, 1.5F, -7F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[36].setRotationPoint(98F, 3.5F, -7F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[37].setRotationPoint(98F, 5.5F, -7F);

		gunModel[38].addTrapezoid(0F, 0F, 0F, 32, 6, 20, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 40
		gunModel[38].setRotationPoint(-18F, 16F, -10F);

		gunModel[39].addTrapezoid(0F, 0F, 0F, 32, 2, 20, 0F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 41
		gunModel[39].setRotationPoint(-18F, 22F, -10F);

		gunModel[40].addTrapezoid(0F, 0F, 0F, 26, 9, 12, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 42
		gunModel[40].setRotationPoint(-15F, 24F, -6F);

		gunModel[41].addTrapezoid(0F, 0F, 0F, 26, 1, 12, 0F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 43
		gunModel[41].setRotationPoint(-15F, 33F, -6F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[42].setRotationPoint(-13F, 28F, -6.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[43].setRotationPoint(-13F, 27F, -6.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		gunModel[44].setRotationPoint(-13F, 29F, -6.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		gunModel[45].setRotationPoint(-9F, 29F, -6.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[46].setRotationPoint(-9F, 27F, -6.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[47].setRotationPoint(-9F, 28F, -6.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 50
		gunModel[48].setRotationPoint(7F, 29F, -6.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[49].setRotationPoint(7F, 27F, -6.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[50].setRotationPoint(7F, 28F, -6.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 53
		gunModel[51].setRotationPoint(-1F, 29F, -6.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[52].setRotationPoint(-1F, 27F, -6.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[53].setRotationPoint(-1F, 28F, -6.5F);

		gunModel[54].addTrapezoid(0F, 0F, 0F, 4, 30, 22, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 56
		gunModel[54].setRotationPoint(-30F, -15F, -11F);

		gunModel[55].addTrapezoid(0F, 0F, 0F, 4, 30, 22, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 57
		gunModel[55].setRotationPoint(-26F, -15F, -11F);

		gunModel[56].addTrapezoid(0F, 0F, 0F, 2, 4, 18, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 58
		gunModel[56].setRotationPoint(-32F, -13F, -9F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 59
		gunModel[57].setRotationPoint(-34F, -13F, -9F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 6, 33, 18, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 60
		gunModel[58].setRotationPoint(-37F, -18F, -9F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 6, 33, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[59].setRotationPoint(-43F, -18F, -9F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 6, 33, 18, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 62
		gunModel[60].setRotationPoint(-49F, -18F, -9F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[61].setRotationPoint(-43F, -24F, -9F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, 2F, 0F, -6F, -6F, 0F, -8F, -6F, 0F, -8F, 2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 64
		gunModel[62].setRotationPoint(-37F, -24F, -9F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, -6F, 0F, -8F, 2F, 0F, -6F, 2F, 0F, -6F, -6F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 65
		gunModel[63].setRotationPoint(-49F, -24F, -9F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -8F, 2F, 0F, -6F, 2F, 0F, -6F, -6F, 0F, -8F); // Box 66
		gunModel[64].setRotationPoint(-49F, 15F, -9F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 2F, 0F, -6F, -6F, 0F, -8F, -6F, 0F, -8F, 2F, 0F, -6F); // Box 67
		gunModel[65].setRotationPoint(-37F, 15F, -9F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F); // Box 68
		gunModel[66].setRotationPoint(-43F, 15F, -9F);

		gunModel[67].addTrapezoid(0F, 0F, 0F, 2, 4, 18, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 69
		gunModel[67].setRotationPoint(-32F, 9F, -9F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 70
		gunModel[68].setRotationPoint(-34F, 9F, -9F);

		gunModel[69].addTrapezoid(0F, 0F, 0F, 2, 4, 18, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 71
		gunModel[69].setRotationPoint(-32F, -2F, -9F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 72
		gunModel[70].setRotationPoint(-34F, -2F, -9F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}