//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.10
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMechLRAC extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechLRAC()
	{
		gunModel = new ModelRendererTurbo[76];
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
		gunModel[23] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 35
		gunModel[36] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 36
		gunModel[37] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 37
		gunModel[38] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 38
		gunModel[39] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 39
		gunModel[40] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 40
		gunModel[41] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 41
		gunModel[42] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 42
		gunModel[43] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 43
		gunModel[44] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 44
		gunModel[45] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 45
		gunModel[46] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 46
		gunModel[47] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 47
		gunModel[48] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 48
		gunModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 49
		gunModel[50] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 50
		gunModel[51] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 51
		gunModel[52] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 52
		gunModel[53] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 53
		gunModel[54] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 54
		gunModel[55] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 55
		gunModel[56] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 56
		gunModel[57] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 57
		gunModel[58] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 58
		gunModel[59] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 59
		gunModel[60] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 60
		gunModel[61] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 61
		gunModel[62] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 62
		gunModel[63] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 63
		gunModel[64] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 64
		gunModel[65] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 65
		gunModel[66] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 66
		gunModel[67] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 67
		gunModel[68] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 68
		gunModel[69] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 69
		gunModel[70] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 70
		gunModel[71] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 71
		gunModel[72] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 73
		gunModel[73] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 74
		gunModel[74] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 75
		gunModel[75] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 76

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Import Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 14, 28, 24, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(19F, -16F, -12F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 20, 28, 18, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(33F, -16F, -9F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 14, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(19F, 12F, -12F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 30, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 4
		gunModel[4].setRotationPoint(33F, 12F, -9F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(48F, -8F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(48F, -10F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 7
		gunModel[7].setRotationPoint(48F, -6F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 8
		gunModel[8].setRotationPoint(48F, 2F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(48F, -2F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 140, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(48F, 0F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 16, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(82F, -8F, -4.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(82F, -11F, -4.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 13
		gunModel[13].setRotationPoint(82F, 2F, -4.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 14
		gunModel[14].setRotationPoint(150F, 2F, -4.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 16, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[15].setRotationPoint(150F, -8F, -4.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(150F, -11F, -4.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 46, 24, 14, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(45F, -12F, -7F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 32, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 18
		gunModel[18].setRotationPoint(45F, 0F, 7F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 32, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(45F, 0F, -11F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 32, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(45F, -11F, -11F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 32, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 21
		gunModel[21].setRotationPoint(45F, -11F, 7F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 62, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[22].setRotationPoint(45F, 12F, -4F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 54, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[23].setRotationPoint(107F, 12F, -4F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 54, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[24].setRotationPoint(107F, 12F, 1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[25].setRotationPoint(158F, 2F, 1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[26].setRotationPoint(151F, 2F, 1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[27].setRotationPoint(151F, 2F, -4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[28].setRotationPoint(158F, 2F, -4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 32, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[29].setRotationPoint(45F, -21F, -2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 32, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[30].setRotationPoint(45F, -25F, -2F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[31].setRotationPoint(47F, -21F, -6F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[32].setRotationPoint(55F, -21F, -6F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[33].setRotationPoint(63F, -21F, -6F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[34].setRotationPoint(71F, -21F, -6F);

		gunModel[35].addBox(-22F, -16F, -12F, 41, 32, 16, 0F); // Box 35
		gunModel[35].setRotationPoint(0F, 32F, 4F);

		gunModel[36].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 36
		gunModel[36].setRotationPoint(-24F, 43F, 1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 37
		gunModel[37].setRotationPoint(-24F, 45F, 1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[38].setRotationPoint(-24F, 41F, 1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[39].setRotationPoint(-24F, 33F, 1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 40
		gunModel[40].setRotationPoint(-24F, 37F, 1F);

		gunModel[41].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 41
		gunModel[41].setRotationPoint(-24F, 35F, 1F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[42].setRotationPoint(-24F, 25F, 1F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 43
		gunModel[43].setRotationPoint(-24F, 29F, 1F);

		gunModel[44].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 44
		gunModel[44].setRotationPoint(-24F, 27F, 1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[45].setRotationPoint(-24F, 17F, 1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 46
		gunModel[46].setRotationPoint(-24F, 21F, 1F);

		gunModel[47].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 47
		gunModel[47].setRotationPoint(-24F, 19F, 1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[48].setRotationPoint(-24F, 17F, -7F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 49
		gunModel[49].setRotationPoint(-24F, 21F, -7F);

		gunModel[50].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 50
		gunModel[50].setRotationPoint(-24F, 19F, -7F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[51].setRotationPoint(-24F, 25F, -7F);

		gunModel[52].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 52
		gunModel[52].setRotationPoint(-24F, 27F, -7F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 53
		gunModel[53].setRotationPoint(-24F, 29F, -7F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[54].setRotationPoint(-24F, 33F, -7F);

		gunModel[55].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 55
		gunModel[55].setRotationPoint(-24F, 35F, -7F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 56
		gunModel[56].setRotationPoint(-24F, 37F, -7F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[57].setRotationPoint(-24F, 41F, -7F);

		gunModel[58].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 58
		gunModel[58].setRotationPoint(-24F, 43F, -7F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 59
		gunModel[59].setRotationPoint(-24F, 45F, -7F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 14, 28, 24, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -3F); // Box 60
		gunModel[60].setRotationPoint(-36F, -16F, -12F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[61].setRotationPoint(-43F, -14F, -7.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[62].setRotationPoint(-43F, -9F, -7.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 7, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 63
		gunModel[63].setRotationPoint(-43F, -4F, -7.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[64].setRotationPoint(-52F, -8F, -4.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[65].setRotationPoint(-52F, -11F, -4.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 66
		gunModel[66].setRotationPoint(-52F, -5F, -4.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 21, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 67
		gunModel[67].setRotationPoint(-57F, 6F, -5.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[68].setRotationPoint(-57F, 4F, -5.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[69].setRotationPoint(-57F, 4F, 3.5F);

		gunModel[70].addBox(-22F, -16F, -12F, 8, 28, 20, 0F); // Box 70
		gunModel[70].setRotationPoint(0.5F, 32F, 2F);

		gunModel[71].addShapeBox(-22F, -16F, -12F, 8, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71
		gunModel[71].setRotationPoint(0.5F, 60F, 2F);

		gunModel[72].addShapeBox(-22F, -16F, -12F, 8, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 73
		gunModel[72].setRotationPoint(16.5F, 60F, 2F);

		gunModel[73].addBox(-22F, -16F, -12F, 8, 28, 20, 0F); // Box 74
		gunModel[73].setRotationPoint(16.5F, 32F, 2F);

		gunModel[74].addShapeBox(-22F, -16F, -12F, 8, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 75
		gunModel[74].setRotationPoint(32.5F, 60F, 2F);

		gunModel[75].addBox(-22F, -16F, -12F, 8, 28, 20, 0F); // Box 76
		gunModel[75].setRotationPoint(32.5F, 32F, 2F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}