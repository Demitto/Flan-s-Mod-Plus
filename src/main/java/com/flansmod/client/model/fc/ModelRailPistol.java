//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.04.2016 - 13:40:38
// Last changed on: 25.04.2016 - 13:40:38

package com.flansmod.client.model.fc; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRailPistol extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRailPistol() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[102];
		gunModel[0] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 77, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 94, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 0, 129, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 0, 148, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 0, 165, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 0, 188, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 0, 216, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 0, 236, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 0, 271, textureX, textureY); // Box 21
		gunModel[18] = new ModelRendererTurbo(this, 0, 296, textureX, textureY); // Box 28
		gunModel[19] = new ModelRendererTurbo(this, 0, 296, textureX, textureY); // Box 29
		gunModel[20] = new ModelRendererTurbo(this, 0, 307, textureX, textureY); // Box 30
		gunModel[21] = new ModelRendererTurbo(this, 0, 307, textureX, textureY); // Box 31
		gunModel[22] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 32
		gunModel[23] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 33
		gunModel[24] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Box 34
		gunModel[25] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Box 35
		gunModel[26] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Box 36
		gunModel[27] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Box 37
		gunModel[28] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 38
		gunModel[29] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 39
		gunModel[30] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 40
		gunModel[31] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 41
		gunModel[32] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 42
		gunModel[33] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 43
		gunModel[34] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 44
		gunModel[35] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 45
		gunModel[36] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 46
		gunModel[37] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 47
		gunModel[38] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 48
		gunModel[39] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 49
		gunModel[40] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 50
		gunModel[41] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 51
		gunModel[42] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 52
		gunModel[43] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 53
		gunModel[44] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 54
		gunModel[45] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 55
		gunModel[46] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 56
		gunModel[47] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 57
		gunModel[48] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 58
		gunModel[49] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 59
		gunModel[50] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 60
		gunModel[51] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 61
		gunModel[52] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 62
		gunModel[53] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 63
		gunModel[54] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 64
		gunModel[55] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 65
		gunModel[56] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 66
		gunModel[57] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 67
		gunModel[58] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 68
		gunModel[59] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 69
		gunModel[60] = new ModelRendererTurbo(this, 0, 359, textureX, textureY); // Box 70
		gunModel[61] = new ModelRendererTurbo(this, 0, 392, textureX, textureY); // Box 72
		gunModel[62] = new ModelRendererTurbo(this, 0, 404, textureX, textureY); // Box 73
		gunModel[63] = new ModelRendererTurbo(this, 75, 0, textureX, textureY); // Box 76
		gunModel[64] = new ModelRendererTurbo(this, 75, 8, textureX, textureY); // Box 78
		gunModel[65] = new ModelRendererTurbo(this, 75, 0, textureX, textureY); // Box 81
		gunModel[66] = new ModelRendererTurbo(this, 75, 8, textureX, textureY); // Box 82
		gunModel[67] = new ModelRendererTurbo(this, 75, 18, textureX, textureY); // Box 83
		gunModel[68] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Box 84
		gunModel[69] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Box 85
		gunModel[70] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 86
		gunModel[71] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 87
		gunModel[72] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 88
		gunModel[73] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 89
		gunModel[74] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 90
		gunModel[75] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 91
		gunModel[76] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 92
		gunModel[77] = new ModelRendererTurbo(this, 0, 337, textureX, textureY); // Box 93
		gunModel[78] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 94
		gunModel[79] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 95
		gunModel[80] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 96
		gunModel[81] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 97
		gunModel[82] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 98
		gunModel[83] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 99
		gunModel[84] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 100
		gunModel[85] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 101
		gunModel[86] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 102
		gunModel[87] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 103
		gunModel[88] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 104
		gunModel[89] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 105
		gunModel[90] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 106
		gunModel[91] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 107
		gunModel[92] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 108
		gunModel[93] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 109
		gunModel[94] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 110
		gunModel[95] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 111
		gunModel[96] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 112
		gunModel[97] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 113
		gunModel[98] = new ModelRendererTurbo(this, 0, 343, textureX, textureY); // Box 114
		gunModel[99] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 115
		gunModel[100] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 116
		gunModel[101] = new ModelRendererTurbo(this, 0, 353, textureX, textureY); // Box 117

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 20, 6, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, -2F, 0F); // Box 0
		gunModel[0].setRotationPoint(-3F, -14F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 1
		gunModel[1].setRotationPoint(-5F, 6F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-3F, -19F, -4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 9, 7, 8, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-4F, -26F, -4F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 23, 6, 8, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(1F, -19F, -4F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(1F, -13F, -4F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -2F); // Box 6
		gunModel[6].setRotationPoint(18F, -13F, -4F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 12, 6, 8, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(14F, -25F, -4F);

		gunModel[8].addShapeBox(-2F, 0F, 0F, 2, 15, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(23F, -6F, -2F);
		gunModel[8].rotateAngleZ = -1.34390352F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(13F, -13F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 10
		gunModel[10].setRotationPoint(13F, -10F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, 3F, 0F, 0.5F); // Box 13
		gunModel[11].setRotationPoint(27F, -19F, -4.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 13, 8, 9, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Box 14
		gunModel[12].setRotationPoint(27F, -13F, -4.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 29, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[13].setRotationPoint(23F, -24F, -3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[14].setRotationPoint(23F, -23F, -3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[15].setRotationPoint(23F, -23F, 2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0F, 3F, 0F, 0F); // Box 19
		gunModel[16].setRotationPoint(27F, -19F, 3.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 29, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[17].setRotationPoint(23F, -16F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 28
		gunModel[18].setRotationPoint(5F, -23F, -6F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 29
		gunModel[19].setRotationPoint(14F, -23F, -6F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[20].setRotationPoint(5F, -27F, -6F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[21].setRotationPoint(14F, -27F, -6F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[22].setRotationPoint(5F, -27F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[23].setRotationPoint(14F, -27F, -2F);

		gunModel[24].addTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.50F, ModelRendererTurbo.MR_BACK); // Box 34
		gunModel[24].setRotationPoint(5F, -27F, 2F);

		gunModel[25].addTrapezoid(0F, 0F, 0F, 2, 2, 1, 0F, -0.50F, ModelRendererTurbo.MR_BACK); // Box 35
		gunModel[25].setRotationPoint(14F, -27F, 2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[26].setRotationPoint(3F, -28F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[27].setRotationPoint(3F, -28F, 1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		gunModel[28].setRotationPoint(3F, -28F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[29].setRotationPoint(3F, -29F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		gunModel[30].setRotationPoint(3F, -29F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 41
		gunModel[31].setRotationPoint(3F, -29F, 0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 42
		gunModel[32].setRotationPoint(5F, -29F, 0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[33].setRotationPoint(5F, -29F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		gunModel[34].setRotationPoint(5F, -29F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		gunModel[35].setRotationPoint(5F, -28F, -1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 46
		gunModel[36].setRotationPoint(7F, -29F, 0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[37].setRotationPoint(7F, -29F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48
		gunModel[38].setRotationPoint(7F, -29F, -1.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		gunModel[39].setRotationPoint(7F, -28F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 50
		gunModel[40].setRotationPoint(9F, -29F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[41].setRotationPoint(9F, -29F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		gunModel[42].setRotationPoint(9F, -29F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		gunModel[43].setRotationPoint(9F, -28F, -1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 54
		gunModel[44].setRotationPoint(11F, -29F, 0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[45].setRotationPoint(11F, -29F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		gunModel[46].setRotationPoint(11F, -29F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		gunModel[47].setRotationPoint(11F, -28F, -1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 58
		gunModel[48].setRotationPoint(13F, -29F, 0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[49].setRotationPoint(13F, -29F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		gunModel[50].setRotationPoint(13F, -29F, -1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 61
		gunModel[51].setRotationPoint(13F, -28F, -1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 62
		gunModel[52].setRotationPoint(15F, -29F, 0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[53].setRotationPoint(15F, -29F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		gunModel[54].setRotationPoint(15F, -29F, -1.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		gunModel[55].setRotationPoint(15F, -28F, -1F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 66
		gunModel[56].setRotationPoint(17F, -29F, 0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[57].setRotationPoint(17F, -29F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		gunModel[58].setRotationPoint(17F, -29F, -1.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		gunModel[59].setRotationPoint(17F, -28F, -1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[60].setRotationPoint(22F, -25F, -2F);

		gunModel[61].addShapeBox(-1F, 0F, 0F, 12, 3, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[61].setRotationPoint(-4F, -19F, -3F);

		gunModel[62].addShapeBox(-1F, 0F, 0F, 13, 5, 6, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[62].setRotationPoint(-5F, -24F, -3F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 7F, 0F, 2F, 6F, 0F, 2F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 76
		gunModel[63].setRotationPoint(30F, -24F, -4.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 7F, 0F, 0F, 6F, 0F, 0F); // Box 78
		gunModel[64].setRotationPoint(30F, -27F, -4.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 6F, 0F, 2F, 7F, 0F, 2F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 81
		gunModel[65].setRotationPoint(30F, -24F, 3.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 6F, 0F, 0F, 7F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F); // Box 82
		gunModel[66].setRotationPoint(30F, -27F, 1.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F); // Box 83
		gunModel[67].setRotationPoint(29F, -27F, -1.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[68].setRotationPoint(30F, -28F, -2F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[69].setRotationPoint(30F, -28F, 1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86
		gunModel[70].setRotationPoint(30F, -28F, -1F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		gunModel[71].setRotationPoint(44F, -28F, -1F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		gunModel[72].setRotationPoint(42F, -28F, -1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89
		gunModel[73].setRotationPoint(40F, -28F, -1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		gunModel[74].setRotationPoint(38F, -28F, -1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		gunModel[75].setRotationPoint(36F, -28F, -1F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		gunModel[76].setRotationPoint(34F, -28F, -1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		gunModel[77].setRotationPoint(32F, -28F, -1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[78].setRotationPoint(30F, -29F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[79].setRotationPoint(34F, -29F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[80].setRotationPoint(36F, -29F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[81].setRotationPoint(39F, -29F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[82].setRotationPoint(40F, -29F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[83].setRotationPoint(42F, -29F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[84].setRotationPoint(44F, -29F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		gunModel[85].setRotationPoint(44F, -29F, -1.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 102
		gunModel[86].setRotationPoint(44F, -29F, 0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 103
		gunModel[87].setRotationPoint(42F, -29F, 0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 104
		gunModel[88].setRotationPoint(42F, -29F, -1.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		gunModel[89].setRotationPoint(40F, -29F, -1.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 106
		gunModel[90].setRotationPoint(40F, -29F, 0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 107
		gunModel[91].setRotationPoint(39F, -29F, 0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 108
		gunModel[92].setRotationPoint(39F, -29F, -1.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		gunModel[93].setRotationPoint(36F, -29F, -1.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 110
		gunModel[94].setRotationPoint(36F, -29F, 0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 111
		gunModel[95].setRotationPoint(34F, -29F, 0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		gunModel[96].setRotationPoint(34F, -29F, -1.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		gunModel[97].setRotationPoint(32F, -29F, -1.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[98].setRotationPoint(32F, -29F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 115
		gunModel[99].setRotationPoint(32F, -29F, 0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		gunModel[100].setRotationPoint(30F, -29F, -1.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 117
		gunModel[101].setRotationPoint(30F, -29F, 0.5F);


		defaultScopeModel = new ModelRendererTurbo[35];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 75, 28, textureX, textureY); // Box 118
		defaultScopeModel[1] = new ModelRendererTurbo(this, 75, 34, textureX, textureY); // Box 119
		defaultScopeModel[2] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 120
		defaultScopeModel[3] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 121
		defaultScopeModel[4] = new ModelRendererTurbo(this, 75, 28, textureX, textureY); // Box 122
		defaultScopeModel[5] = new ModelRendererTurbo(this, 75, 34, textureX, textureY); // Box 123
		defaultScopeModel[6] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 124
		defaultScopeModel[7] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 125
		defaultScopeModel[8] = new ModelRendererTurbo(this, 75, 44, textureX, textureY); // Box 126
		defaultScopeModel[9] = new ModelRendererTurbo(this, 75, 44, textureX, textureY); // Box 127
		defaultScopeModel[10] = new ModelRendererTurbo(this, 75, 52, textureX, textureY); // Box 128
		defaultScopeModel[11] = new ModelRendererTurbo(this, 75, 58, textureX, textureY); // Box 129
		defaultScopeModel[12] = new ModelRendererTurbo(this, 75, 58, textureX, textureY); // Box 131
		defaultScopeModel[13] = new ModelRendererTurbo(this, 75, 52, textureX, textureY); // Box 133
		defaultScopeModel[14] = new ModelRendererTurbo(this, 75, 64, textureX, textureY); // Box 134
		defaultScopeModel[15] = new ModelRendererTurbo(this, 75, 64, textureX, textureY); // Box 135
		defaultScopeModel[16] = new ModelRendererTurbo(this, 75, 28, textureX, textureY); // Box 136
		defaultScopeModel[17] = new ModelRendererTurbo(this, 75, 34, textureX, textureY); // Box 137
		defaultScopeModel[18] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 138
		defaultScopeModel[19] = new ModelRendererTurbo(this, 75, 44, textureX, textureY); // Box 139
		defaultScopeModel[20] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 140
		defaultScopeModel[21] = new ModelRendererTurbo(this, 75, 34, textureX, textureY); // Box 141
		defaultScopeModel[22] = new ModelRendererTurbo(this, 75, 44, textureX, textureY); // Box 142
		defaultScopeModel[23] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 143
		defaultScopeModel[24] = new ModelRendererTurbo(this, 75, 39, textureX, textureY); // Box 144
		defaultScopeModel[25] = new ModelRendererTurbo(this, 75, 28, textureX, textureY); // Box 145
		defaultScopeModel[26] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 147
		defaultScopeModel[27] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 148
		defaultScopeModel[28] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 149
		defaultScopeModel[29] = new ModelRendererTurbo(this, 75, 73, textureX, textureY); // Box 150
		defaultScopeModel[30] = new ModelRendererTurbo(this, 75, 73, textureX, textureY); // Box 151
		defaultScopeModel[31] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 152
		defaultScopeModel[32] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 153
		defaultScopeModel[33] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 154
		defaultScopeModel[34] = new ModelRendererTurbo(this, 75, 79, textureX, textureY); // Box 155

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		defaultScopeModel[0].setRotationPoint(5F, -28.5F, -2F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		defaultScopeModel[1].setRotationPoint(5F, -29.5F, -3F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		defaultScopeModel[2].setRotationPoint(5F, -30.5F, -3F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		defaultScopeModel[3].setRotationPoint(8F, -30.5F, -3F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 122
		defaultScopeModel[4].setRotationPoint(5F, -28.5F, 1F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 123
		defaultScopeModel[5].setRotationPoint(5F, -29.5F, 2F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 124
		defaultScopeModel[6].setRotationPoint(5F, -30.5F, 2F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		defaultScopeModel[7].setRotationPoint(8F, -30.5F, 2F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
		defaultScopeModel[8].setRotationPoint(5F, -30.5F, -1.5F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		defaultScopeModel[9].setRotationPoint(8F, -30.5F, -1.5F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 128
		defaultScopeModel[10].setRotationPoint(5F, -31.5F, -1.5F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 129
		defaultScopeModel[11].setRotationPoint(5F, -31.5F, -1.5F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		defaultScopeModel[12].setRotationPoint(5F, -31.5F, 0.5F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 133
		defaultScopeModel[13].setRotationPoint(5F, -31.5F, 0.5F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 134
		defaultScopeModel[14].setRotationPoint(8F, -31.5F, -1.5F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		defaultScopeModel[15].setRotationPoint(8F, -31.5F, 0.5F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		defaultScopeModel[16].setRotationPoint(38F, -28.5F, -2F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		defaultScopeModel[17].setRotationPoint(38F, -29.5F, -3F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		defaultScopeModel[18].setRotationPoint(38F, -30.5F, -3F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		defaultScopeModel[19].setRotationPoint(38F, -30.5F, -1.5F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		defaultScopeModel[20].setRotationPoint(38F, -30.5F, 2F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 141
		defaultScopeModel[21].setRotationPoint(38F, -29.5F, 2F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 142
		defaultScopeModel[22].setRotationPoint(41F, -30.5F, -1.5F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		defaultScopeModel[23].setRotationPoint(41F, -30.5F, -3F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		defaultScopeModel[24].setRotationPoint(41F, -30.5F, 2F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 145
		defaultScopeModel[25].setRotationPoint(38F, -28.5F, 1F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		defaultScopeModel[26].setRotationPoint(38F, -31.5F, -0.5F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		defaultScopeModel[27].setRotationPoint(38F, -31.5F, -1.5F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 149
		defaultScopeModel[28].setRotationPoint(38F, -31.5F, 0.5F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 150
		defaultScopeModel[29].setRotationPoint(38F, -32.5F, -1.5F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		defaultScopeModel[30].setRotationPoint(38F, -32.5F, 0.5F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 152
		defaultScopeModel[31].setRotationPoint(38F, -33.5F, 0.5F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		defaultScopeModel[32].setRotationPoint(38F, -33.5F, -1.5F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		defaultScopeModel[33].setRotationPoint(38F, -33.5F, -0.5F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 155
		defaultScopeModel[34].setRotationPoint(41F, -32.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 418, textureX, textureY); // Box 74
		ammoModel[1] = new ModelRendererTurbo(this, 0, 429, textureX, textureY); // Box 75
		ammoModel[2] = new ModelRendererTurbo(this, 0, 441, textureX, textureY); // Box 76

		ammoModel[0].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		ammoModel[0].setRotationPoint(30F, -10F, -3F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		ammoModel[1].setRotationPoint(30F, -12F, -3F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 76
		ammoModel[2].setRotationPoint(30F, -8F, -3F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 11
		slideModel[1] = new ModelRendererTurbo(this, 0, 468, textureX, textureY); // Box 12

		slideModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 11
		slideModel[0].setRotationPoint(3F, -24F, -3F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		slideModel[1].setRotationPoint(12F, -24F, -3.5F);


		pumpModel = new ModelRendererTurbo[8];
		pumpModel[0] = new ModelRendererTurbo(this, 0, 251, textureX, textureY); // Box 18
		pumpModel[1] = new ModelRendererTurbo(this, 0, 251, textureX, textureY); // Box 20
		pumpModel[2] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 22
		pumpModel[3] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 23
		pumpModel[4] = new ModelRendererTurbo(this, 0, 283, textureX, textureY); // Box 24
		pumpModel[5] = new ModelRendererTurbo(this, 0, 283, textureX, textureY); // Box 25
		pumpModel[6] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Box 26
		pumpModel[7] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Box 27

		pumpModel[0].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 18
		pumpModel[0].setRotationPoint(30F, -22F, 2F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 20
		pumpModel[1].setRotationPoint(30F, -22F, -3F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		pumpModel[2].setRotationPoint(23F, -17F, 2F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		pumpModel[3].setRotationPoint(23F, -17F, -3F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 24
		pumpModel[4].setRotationPoint(43F, -22F, 2F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 25
		pumpModel[5].setRotationPoint(43F, -22F, -3F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		pumpModel[6].setRotationPoint(43F, -19F, -3F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		pumpModel[7].setRotationPoint(43F, -19F, 2F);



		stockAttachPoint = new Vector3f(-5F /16F, 19F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(10F /16F, 28F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(34 /16F, 5F /16F, 0F /16F);


		animationType = EnumAnimationType.END_LOADED;


		pumpDelay = 6;


		pumpTime = 3;


		pumpHandleDistance = 1F;
		gunSlideDistance = 0.5F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}