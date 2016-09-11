//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelWarrior extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelWarrior()
	{
		bodyModel = new ModelRendererTurbo[166];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 135, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 555, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 605, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 605, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 612, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 645, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 645, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 662, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 662, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 662, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 686, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 662, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 662, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 662, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 686, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 715, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 0, 845, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 0, 845, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 0, 845, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 0, 865, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 0, 885, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 0, 885, textureX, textureY); // Box 1
		bodyModel[64] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Box 2
		bodyModel[65] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Box 3
		bodyModel[66] = new ModelRendererTurbo(this, 0, 895, textureX, textureY); // Box 4
		bodyModel[67] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 5
		bodyModel[68] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 6
		bodyModel[69] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 7
		bodyModel[70] = new ModelRendererTurbo(this, 0, 915, textureX, textureY); // Box 8
		bodyModel[71] = new ModelRendererTurbo(this, 0, 915, textureX, textureY); // Box 9
		bodyModel[72] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Box 10
		bodyModel[73] = new ModelRendererTurbo(this, 0, 925, textureX, textureY); // Box 11
		bodyModel[74] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 12
		bodyModel[75] = new ModelRendererTurbo(this, 0, 935, textureX, textureY); // Box 13
		bodyModel[76] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 14
		bodyModel[77] = new ModelRendererTurbo(this, 0, 945, textureX, textureY); // Box 16
		bodyModel[78] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Box 17
		bodyModel[79] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Box 18
		bodyModel[80] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 19
		bodyModel[81] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 20
		bodyModel[82] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 21
		bodyModel[83] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 22
		bodyModel[84] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 23
		bodyModel[85] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 24
		bodyModel[86] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 25
		bodyModel[87] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 26
		bodyModel[88] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 27
		bodyModel[89] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Box 28
		bodyModel[90] = new ModelRendererTurbo(this, 0, 990, textureX, textureY); // Box 29
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 30
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 31
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Box 32
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 33
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Box 34
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 35
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Box 36
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 37
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Box 38
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 39
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Box 40
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 41
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1089, textureX, textureY); // Box 42
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Box 43
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 44
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 45
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 46
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 47
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1212, textureX, textureY); // Box 48
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 49
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Box 50
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1315, textureX, textureY); // Box 51
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 52
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 53
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1352, textureX, textureY); // Box 54
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 55
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1430, textureX, textureY); // Box 56
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1470, textureX, textureY); // Box 57
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1515, textureX, textureY); // Box 58
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Box 59
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1555, textureX, textureY); // Box 60
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1555, textureX, textureY); // Box 61
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 62
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 63
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 64
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1585, textureX, textureY); // Box 65
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1585, textureX, textureY); // Box 66
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1585, textureX, textureY); // Box 67
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1585, textureX, textureY); // Box 68
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 69
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1585, textureX, textureY); // Box 70
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 71
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1585, textureX, textureY); // Box 72
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 73
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1612, textureX, textureY); // Box 74
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1612, textureX, textureY); // Box 75
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Box 76
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Box 77
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1630, textureX, textureY); // Box 78
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1635, textureX, textureY); // Box 79
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1660, textureX, textureY); // Box 80
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1675, textureX, textureY); // Box 81
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 82
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1710, textureX, textureY); // Box 83
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1717, textureX, textureY); // Box 84
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1717, textureX, textureY); // Box 85
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1717, textureX, textureY); // Box 86
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 87
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1710, textureX, textureY); // Box 88
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1717, textureX, textureY); // Box 89
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1725, textureX, textureY); // Box 90
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1725, textureX, textureY); // Box 91
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1725, textureX, textureY); // Box 92
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1725, textureX, textureY); // Box 93
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1735, textureX, textureY); // Box 94
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1755, textureX, textureY); // Box 95
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1780, textureX, textureY); // Box 96
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1735, textureX, textureY); // Box 97
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1755, textureX, textureY); // Box 98
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1780, textureX, textureY); // Box 99
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Box 100
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Box 101
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Box 102
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Box 103
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 175

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 5, 58, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(75F, -15F, -29F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 48, 9, 58, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(27F, -19F, -29F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 58, 0F,0F, 0F, -7.5F,0F, -8F, 0F,0F, -7.95F, 0F,0F, 0F, -7.5F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 2
		bodyModel[2].setRotationPoint(51F, -23F, -29F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 10, 58, 0F,0F, 0F, -11F,0F, -4F, -7.5F,0F, -4F, -7.5F,0F, 0F, -11F,0F, -1.16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.16F, 0F); // Box 3
		bodyModel[3].setRotationPoint(37F, -27F, -29F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 10, 58, 0F,0F, 0F, -11F,0F, 0F, -11F,0F, 0F, -11F,0F, 0F, -11F,0F, -2F, 0F,0F, -1.16F, 0F,0F, -1.16F, 0F,0F, -2F, 0F); // Box 4
		bodyModel[4].setRotationPoint(27F, -27F, -29F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 61, 8, 4, 0F,0F, 0F, -11F,0F, 0F, -11F,0F, 0F, 11F,0F, 0F, 11F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-34F, -27F, -29F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 61, 8, 4, 0F,0F, 0F, 11F,0F, 0F, 11F,0F, 0F, -11F,0F, 0F, -11F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-34F, -27F, 25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 61, 3, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 4.125F,0F, 0F, 4.125F,0F, 0F, 4.125F,0F, 0F, 4.125F); // Box 7
		bodyModel[7].setRotationPoint(-34F, -27F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 10, 11, 0F,0F, 0F, 0F,0F, 0F, 0F,-9.9F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -1.16F, 0F,-9.9F, -1.16F, 0F,0F, -2F, 0F); // Box 8
		bodyModel[8].setRotationPoint(27F, -27F, 18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 38, 8, 11, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -7F,0F, 0F, -7F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-11F, -27F, 18F);

		bodyModel[10].addBox(0F, 0F, 0F, 61, 9, 10, 0F); // Box 10
		bodyModel[10].setRotationPoint(-34F, -19F, -29F);

		bodyModel[11].addBox(0F, 0F, 0F, 61, 9, 10, 0F); // Box 11
		bodyModel[11].setRotationPoint(-34F, -19F, 19F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 12
		bodyModel[12].setRotationPoint(18F, -23F, 29F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 13
		bodyModel[13].setRotationPoint(18F, -16F, 29F);

		bodyModel[14].addBox(0F, 0F, 0F, 26, 10, 1, 0F); // Box 14
		bodyModel[14].setRotationPoint(-6F, -23F, 28.2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(20F, -25F, 28.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-8F, -25F, 28.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // Box 17
		bodyModel[17].setRotationPoint(-6F, -25F, 28.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // Box 18
		bodyModel[18].setRotationPoint(-6F, -13F, 28.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 19
		bodyModel[19].setRotationPoint(75F, -17F, -27F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(79.2F, -16.5F, -26.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 21
		bodyModel[21].setRotationPoint(79.2F, -15.5F, -26.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 22
		bodyModel[22].setRotationPoint(79.2F, -14.5F, -26.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(73F, -17F, -27F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(81F, -17F, -27F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 25
		bodyModel[25].setRotationPoint(81F, -16F, -27F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 26
		bodyModel[26].setRotationPoint(75F, -18F, -20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(72F, -19F, -20F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,3F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(72F, -18F, -20F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(73F, -17F, 23F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 30
		bodyModel[30].setRotationPoint(75F, -17F, 23F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(79.2F, -16.5F, 23.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 32
		bodyModel[32].setRotationPoint(79.2F, -15.5F, 23.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 33
		bodyModel[33].setRotationPoint(79.2F, -14.5F, 23.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 34
		bodyModel[34].setRotationPoint(81F, -16F, 23F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(81F, -17F, 23F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,3F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(72F, -18F, 19F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(72F, -19F, 19F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[38].setRotationPoint(75F, -18F, 19F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 11, 23, 0F,0F, 0F, 0F,0F, -9.5F, 0F,0F, -9.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(37F, -27.5F, -18F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, 0F,0F, -1.89F, 0F,0F, -1.89F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(60F, -20.5F, -16F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F,0F, -4.75F, 0F,0F, -4.75F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(41F, -26.5F, -16F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F,0F, -4.75F, 0F,0F, -4.75F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(41F, -26.5F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F,0F, -4.75F, 0F,0F, -4.75F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(41F, -26.5F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 15, 5, 4, 0F,0F, 0F, 0F,0F, -4.75F, 0F,0F, -4.75F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(41F, -26.5F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F,0F, -0.63F, 0F,0F, -0.63F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(56F, -21.75F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F,0F, -0.63F, 0F,0F, -0.63F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(56F, -21.75F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F,0F, -0.63F, 0F,0F, -0.63F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(56F, -21.75F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F,0F, -0.63F, 0F,0F, -0.63F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(56F, -21.75F, -15F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 49
		bodyModel[49].setRotationPoint(75F, -16F, 14F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 50
		bodyModel[50].setRotationPoint(75F, -16F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(75F, -17F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(77F, -16F, 9F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 53
		bodyModel[53].setRotationPoint(77F, -15F, 14F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 54
		bodyModel[54].setRotationPoint(77F, -15F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 11, 10, 0F,0F, 0F, 0F,0F, -3.16F, 0F,0F, -3.16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(37F, -27.5F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 56
		bodyModel[56].setRotationPoint(75F, -15.5F, -15F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 57
		bodyModel[57].setRotationPoint(77F, -14.7F, -15F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 58
		bodyModel[58].setRotationPoint(79F, -14.2F, -15F);

		bodyModel[59].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Box 59
		bodyModel[59].setRotationPoint(30F, -27.5F, 15F);
		bodyModel[59].rotateAngleY = 0.73303829F;

		bodyModel[60].addShapeBox(0F, 0F, -2F, 6, 1, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(30F, -27.5F, 15F);
		bodyModel[60].rotateAngleY = 0.73303829F;

		bodyModel[61].addShapeBox(0F, 0F, 10F, 6, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(30F, -27.5F, 15F);
		bodyModel[61].rotateAngleY = 0.73303829F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F,0F, -0.63F, 0F,0F, -0.63F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 0
		bodyModel[62].setRotationPoint(47F, -24.5F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F,0F, -0.63F, 0F,0F, -0.63F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[63].setRotationPoint(47F, -24.5F, 14F);

		bodyModel[64].addBox(2F, 11F, 0F, 1, 2, 1, 0F); // Box 2
		bodyModel[64].setRotationPoint(-34F, -27F, 18F);
		bodyModel[64].rotateAngleX = 0.9250245F;

		bodyModel[65].addBox(19F, 11F, 0F, 1, 2, 1, 0F); // Box 3
		bodyModel[65].setRotationPoint(-34F, -27F, 18F);
		bodyModel[65].rotateAngleX = 0.9250245F;

		bodyModel[66].addBox(1F, 11.5F, -0.5F, 20, 1, 1, 0F); // Box 4
		bodyModel[66].setRotationPoint(-34F, -27F, 18F);
		bodyModel[66].rotateAngleX = 0.9250245F;

		bodyModel[67].addBox(17F, 7F, 0F, 1, 2, 1, 0F); // Box 5
		bodyModel[67].setRotationPoint(-34F, -27F, 18F);
		bodyModel[67].rotateAngleX = 0.9250245F;

		bodyModel[68].addShapeBox(13F, 7F, 0F, 4, 1, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 6
		bodyModel[68].setRotationPoint(-34F, -27F, 18F);
		bodyModel[68].rotateAngleX = 0.9250245F;

		bodyModel[69].addShapeBox(18F, 7F, 0F, 4, 1, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 7
		bodyModel[69].setRotationPoint(-34F, -27F, 18F);
		bodyModel[69].rotateAngleX = 0.9250245F;

		bodyModel[70].addBox(8F, 6F, 0F, 1, 2, 1, 0F); // Box 8
		bodyModel[70].setRotationPoint(-34F, -27F, 18F);
		bodyModel[70].rotateAngleX = 0.9250245F;

		bodyModel[71].addBox(5F, 6F, 0F, 1, 2, 1, 0F); // Box 9
		bodyModel[71].setRotationPoint(-34F, -27F, 18F);
		bodyModel[71].rotateAngleX = 0.9250245F;

		bodyModel[72].addShapeBox(5F, 8F, 0F, 4, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Box 10
		bodyModel[72].setRotationPoint(-34F, -27F, 18F);
		bodyModel[72].rotateAngleX = 0.9250245F;

		bodyModel[73].addBox(5F, 2F, 0F, 1, 3, 1, 0F); // Box 11
		bodyModel[73].setRotationPoint(-34F, -27F, 18F);
		bodyModel[73].rotateAngleX = 0.9250245F;

		bodyModel[74].addBox(6F, 3F, 0F, 7, 1, 1, 0F); // Box 12
		bodyModel[74].setRotationPoint(-34F, -27F, 18F);
		bodyModel[74].rotateAngleX = 0.9250245F;

		bodyModel[75].addBox(13F, 2F, 0F, 3, 3, 1, 0F); // Box 13
		bodyModel[75].setRotationPoint(-34F, -27F, 18F);
		bodyModel[75].rotateAngleX = 0.9250245F;

		bodyModel[76].addShapeBox(16F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Box 14
		bodyModel[76].setRotationPoint(-34F, -27F, 18F);
		bodyModel[76].rotateAngleX = 0.9250245F;

		bodyModel[77].addBox(8F, 0F, 0F, 4, 2, 1, 0F); // Box 16
		bodyModel[77].setRotationPoint(-34F, -27F, 18F);
		bodyModel[77].rotateAngleX = 0.9250245F;

		bodyModel[78].addBox(5F, 5F, -3F, 1, 1, 3, 0F); // Box 17
		bodyModel[78].setRotationPoint(-34F, -27F, -18F);
		bodyModel[78].rotateAngleX = -0.9250245F;

		bodyModel[79].addShapeBox(9F, 5F, -3F, 1, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,-3F, 0F, 0F); // Box 18
		bodyModel[79].setRotationPoint(-34F, -27F, -18F);
		bodyModel[79].rotateAngleX = -0.9250245F;

		bodyModel[80].addShapeBox(5F, 5F, -4F, 5, 1, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 19
		bodyModel[80].setRotationPoint(-34F, -27F, -18F);
		bodyModel[80].rotateAngleX = -0.9250245F;

		bodyModel[81].addBox(-3F, 1F, -0.5F, 10, 1, 1, 0F); // Box 20
		bodyModel[81].setRotationPoint(29F, -27F, -18F);
		bodyModel[81].rotateAngleX = -0.9250245F;

		bodyModel[82].addBox(-3F, 2F, -0.5F, 1, 10, 1, 0F); // Box 21
		bodyModel[82].setRotationPoint(29F, -27F, -18F);
		bodyModel[82].rotateAngleX = -0.9250245F;

		bodyModel[83].addBox(6F, 2F, -0.5F, 1, 10, 1, 0F); // Box 22
		bodyModel[83].setRotationPoint(29F, -27F, -18F);
		bodyModel[83].rotateAngleX = -0.9250245F;

		bodyModel[84].addBox(-3F, 12F, -0.5F, 10, 1, 1, 0F); // Box 23
		bodyModel[84].setRotationPoint(29F, -27F, -18F);
		bodyModel[84].rotateAngleX = -0.9250245F;

		bodyModel[85].addBox(-2F, 3F, -0.3F, 8, 1, 1, 0F); // Box 24
		bodyModel[85].setRotationPoint(29F, -27F, -18F);
		bodyModel[85].rotateAngleX = -0.9250245F;

		bodyModel[86].addBox(-2F, 5F, -0.3F, 8, 1, 1, 0F); // Box 25
		bodyModel[86].setRotationPoint(29F, -27F, -18F);
		bodyModel[86].rotateAngleX = -0.9250245F;

		bodyModel[87].addBox(-2F, 7F, -0.3F, 8, 1, 1, 0F); // Box 26
		bodyModel[87].setRotationPoint(29F, -27F, -18F);
		bodyModel[87].rotateAngleX = -0.9250245F;

		bodyModel[88].addBox(-2F, 9F, -0.3F, 8, 1, 1, 0F); // Box 27
		bodyModel[88].setRotationPoint(29F, -27F, -18F);
		bodyModel[88].rotateAngleX = -0.9250245F;

		bodyModel[89].addBox(-2F, 11F, -0.3F, 8, 1, 1, 0F); // Box 28
		bodyModel[89].setRotationPoint(29F, -27F, -18F);
		bodyModel[89].rotateAngleX = -0.9250245F;

		bodyModel[90].addBox(-15F, 2F, -0.5F, 8, 7, 1, 0F); // Box 29
		bodyModel[90].setRotationPoint(29F, -27F, -18F);
		bodyModel[90].rotateAngleX = -0.9250245F;

		bodyModel[91].addBox(-14F, 9F, -0.5F, 1, 2, 1, 0F); // Box 30
		bodyModel[91].setRotationPoint(29F, -27F, -18F);
		bodyModel[91].rotateAngleX = -0.9250245F;

		bodyModel[92].addBox(-9F, 9F, -0.5F, 1, 2, 1, 0F); // Box 31
		bodyModel[92].setRotationPoint(29F, -27F, -18F);
		bodyModel[92].rotateAngleX = -0.9250245F;

		bodyModel[93].addShapeBox(-15F, 1F, -0.5F, 8, 1, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 32
		bodyModel[93].setRotationPoint(29F, -27F, -18F);
		bodyModel[93].rotateAngleX = -0.9250245F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 8, 15, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 33
		bodyModel[94].setRotationPoint(-42F, -27F, 14F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 8, 15, 0F); // Box 34
		bodyModel[95].setRotationPoint(-36F, -27F, 14F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 8, 15, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, -11F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -11F,0F, 0F, 0F); // Box 35
		bodyModel[96].setRotationPoint(-34F, -27F, 14F);

		bodyModel[97].addBox(0F, 0F, 0F, 8, 4, 15, 0F); // Box 36
		bodyModel[97].setRotationPoint(-42F, -19F, 14F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 1, 15, 0F); // Box 37
		bodyModel[98].setRotationPoint(-40F, -15F, 14F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 5, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Box 38
		bodyModel[99].setRotationPoint(-39F, -14F, 14F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 6, 11, 0F); // Box 39
		bodyModel[100].setRotationPoint(-42.5F, -23F, 16F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 5, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Box 40
		bodyModel[101].setRotationPoint(-39F, -14F, -29F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 1, 15, 0F); // Box 41
		bodyModel[102].setRotationPoint(-40F, -15F, -29F);

		bodyModel[103].addBox(0F, 0F, 0F, 8, 4, 15, 0F); // Box 42
		bodyModel[103].setRotationPoint(-42F, -19F, -29F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 8, 15, 0F); // Box 43
		bodyModel[104].setRotationPoint(-36F, -27F, -29F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 8, 15, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 44
		bodyModel[105].setRotationPoint(-42F, -27F, -29F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 6, 11, 0F); // Box 45
		bodyModel[106].setRotationPoint(-42.5F, -23F, -27F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 8, 15, 0F,0F, 0F, 0F,0F, -1F, -11F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -11F,0F, 0F, 0F,0F, 0F, 0F); // Box 46
		bodyModel[107].setRotationPoint(-34F, -27F, -29F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 22, 9, 0F); // Box 47
		bodyModel[108].setRotationPoint(-34F, -24F, -19F);

		bodyModel[109].addBox(0F, 0F, 0F, 103, 4, 38, 0F); // Box 48
		bodyModel[109].setRotationPoint(-34F, -2F, -19F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 22, 9, 0F); // Box 49
		bodyModel[110].setRotationPoint(-34F, -24F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 12, 38, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-13F, 0F, 0F,-13F, 0F, 0F,0F, 0F, 0F); // Box 50
		bodyModel[111].setRotationPoint(69F, -10F, -19F);

		bodyModel[112].addBox(0F, 0F, 0F, 58, 22, 1, 0F); // Box 51
		bodyModel[112].setRotationPoint(-31F, -24F, -19F);

		bodyModel[113].addBox(0F, 0F, 0F, 42, 8, 1, 0F); // Box 52
		bodyModel[113].setRotationPoint(27F, -10F, -19F);

		bodyModel[114].addBox(0F, 0F, 0F, 42, 8, 1, 0F); // Box 53
		bodyModel[114].setRotationPoint(27F, -10F, 18F);

		bodyModel[115].addBox(0F, 0F, 0F, 58, 22, 1, 0F); // Box 54
		bodyModel[115].setRotationPoint(-31F, -24F, 18F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 8, 36, 0F); // Box 55
		bodyModel[116].setRotationPoint(27F, -10F, -18F);

		bodyModel[117].addBox(0F, 0F, 0F, 16, 2, 36, 0F); // Box 56
		bodyModel[117].setRotationPoint(11F, -4F, -18F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 16, 2, 36, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 57
		bodyModel[118].setRotationPoint(11F, -6F, -18F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 16, 6, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 58
		bodyModel[119].setRotationPoint(11F, -12F, -18F);

		bodyModel[120].addTrapezoid(0F, 0F, 0F, 16, 10, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 59
		bodyModel[120].setRotationPoint(11F, -22F, -18F);

		bodyModel[121].addTrapezoid(0F, 0F, 0F, 16, 1, 3, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 60
		bodyModel[121].setRotationPoint(11F, -21F, -16F);

		bodyModel[122].addTrapezoid(0F, 0F, 0F, 16, 1, 3, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 61
		bodyModel[122].setRotationPoint(11F, -16F, -16F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 62
		bodyModel[123].setRotationPoint(8F, -5F, -12F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 63
		bodyModel[124].setRotationPoint(8F, -5F, 4F);

		bodyModel[125].addBox(0F, 0F, 0F, 18, 1, 6, 0F); // Box 64
		bodyModel[125].setRotationPoint(-11F, -8F, -18F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F); // Box 65
		bodyModel[126].setRotationPoint(-11F, -7F, -18F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F); // Box 66
		bodyModel[127].setRotationPoint(5F, -7F, -18F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Box 67
		bodyModel[128].setRotationPoint(5F, -7F, 14F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Box 68
		bodyModel[129].setRotationPoint(-11F, -7F, 14F);

		bodyModel[130].addBox(0F, 0F, 0F, 18, 1, 6, 0F); // Box 69
		bodyModel[130].setRotationPoint(-11F, -8F, 12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Box 70
		bodyModel[131].setRotationPoint(-15F, -7F, 14F);

		bodyModel[132].addBox(0F, 0F, 0F, 18, 1, 6, 0F); // Box 71
		bodyModel[132].setRotationPoint(-31F, -8F, 12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Box 72
		bodyModel[133].setRotationPoint(-31F, -7F, 14F);

		bodyModel[134].addBox(0F, 0F, 0F, 10, 4, 6, 0F); // Box 73
		bodyModel[134].setRotationPoint(-30F, -6F, -18F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 74
		bodyModel[135].setRotationPoint(-30F, -8F, -18F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 75
		bodyModel[136].setRotationPoint(-21F, -8F, -18F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 76
		bodyModel[137].setRotationPoint(-29F, -8F, -13F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 77
		bodyModel[138].setRotationPoint(-23F, -8F, -13F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 78
		bodyModel[139].setRotationPoint(-27F, -7F, -13F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 8, 8, 0F); // Box 79
		bodyModel[140].setRotationPoint(26F, -18F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 80
		bodyModel[141].setRotationPoint(26F, -18F, 4F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 16, 9, 0F); // Box 81
		bodyModel[142].setRotationPoint(26F, -23F, 8F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 82
		bodyModel[143].setRotationPoint(-39.5F, -13F, 15F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 83
		bodyModel[144].setRotationPoint(-39.5F, -13F, 18F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 84
		bodyModel[145].setRotationPoint(-39.5F, -13F, 21F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 85
		bodyModel[146].setRotationPoint(-39.5F, -13F, 24F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 86
		bodyModel[147].setRotationPoint(-39.5F, -13F, -26F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 87
		bodyModel[148].setRotationPoint(-39.5F, -13F, -17F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 88
		bodyModel[149].setRotationPoint(-39.5F, -13F, -20F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 89
		bodyModel[150].setRotationPoint(-39.5F, -13F, -23F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 90
		bodyModel[151].setRotationPoint(7F, -5F, 4F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 91
		bodyModel[152].setRotationPoint(7F, -5F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 92
		bodyModel[153].setRotationPoint(7F, -5F, -8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 93
		bodyModel[154].setRotationPoint(7F, -5F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 6, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, -1F, 0F); // Box 94
		bodyModel[155].setRotationPoint(76F, -10F, -29F);

		bodyModel[156].addBox(0F, 0F, 0F, 110, 5, 10, 0F); // Box 95
		bodyModel[156].setRotationPoint(-34F, -10F, -29F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, -1.4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.4F, 0F,0.3F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.3F, 1F, 0F); // Box 96
		bodyModel[157].setRotationPoint(-41F, -10F, -29F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 6, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, -1F, 0F); // Box 97
		bodyModel[158].setRotationPoint(76F, -10F, 19F);

		bodyModel[159].addBox(0F, 0F, 0F, 110, 5, 10, 0F); // Box 98
		bodyModel[159].setRotationPoint(-34F, -10F, 19F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, -1.4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.4F, 0F,0.3F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.3F, 1F, 0F); // Box 99
		bodyModel[160].setRotationPoint(-41F, -10F, 19F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.9F, 0F,0F, -1.9F, 0F); // Box 100
		bodyModel[161].setRotationPoint(-34F, -24F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.9F, 0F,0F, -1.9F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 101
		bodyModel[162].setRotationPoint(-34F, -4F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 102
		bodyModel[163].setRotationPoint(-34F, -4F, 8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 103
		bodyModel[164].setRotationPoint(-34F, -24F, 8F);

		bodyModel[165].addBox(0F, 0F, 0F, 45, 1, 28, 0F); // Box 175
		bodyModel[165].setRotationPoint(-11F, -28F, -14F);

		turretModel = new ModelRendererTurbo[49];
		turretModel[0] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 174
		turretModel[1] = new ModelRendererTurbo(this, 200, 45, textureX, textureY); // Box 176
		turretModel[2] = new ModelRendererTurbo(this, 200, 90, textureX, textureY); // Box 177
		turretModel[3] = new ModelRendererTurbo(this, 200, 135, textureX, textureY); // Box 178
		turretModel[4] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 179
		turretModel[5] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 180
		turretModel[6] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 181
		turretModel[7] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 182
		turretModel[8] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 183
		turretModel[9] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 184
		turretModel[10] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 185
		turretModel[11] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 186
		turretModel[12] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 187
		turretModel[13] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 188
		turretModel[14] = new ModelRendererTurbo(this, 200, 172, textureX, textureY); // Box 189
		turretModel[15] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 190
		turretModel[16] = new ModelRendererTurbo(this, 200, 205, textureX, textureY); // Box 191
		turretModel[17] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 192
		turretModel[18] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 193
		turretModel[19] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 194
		turretModel[20] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Box 195
		turretModel[21] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Box 196
		turretModel[22] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 197
		turretModel[23] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Box 198
		turretModel[24] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 199
		turretModel[25] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 200
		turretModel[26] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Box 201
		turretModel[27] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 202
		turretModel[28] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Box 203
		turretModel[29] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Box 204
		turretModel[30] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Box 205
		turretModel[31] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 206
		turretModel[32] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 207
		turretModel[33] = new ModelRendererTurbo(this, 200, 295, textureX, textureY); // Box 208
		turretModel[34] = new ModelRendererTurbo(this, 200, 310, textureX, textureY); // Box 209
		turretModel[35] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 210
		turretModel[36] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Box 211
		turretModel[37] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Box 212
		turretModel[38] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Box 213
		turretModel[39] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Box 214
		turretModel[40] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 215
		turretModel[41] = new ModelRendererTurbo(this, 200, 295, textureX, textureY); // Box 216
		turretModel[42] = new ModelRendererTurbo(this, 200, 310, textureX, textureY); // Box 217
		turretModel[43] = new ModelRendererTurbo(this, 200, 335, textureX, textureY); // Box 218
		turretModel[44] = new ModelRendererTurbo(this, 200, 335, textureX, textureY); // Box 219
		turretModel[45] = new ModelRendererTurbo(this, 200, 335, textureX, textureY); // Box 220
		turretModel[46] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 221
		turretModel[47] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 222
		turretModel[48] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 223

		turretModel[0].addShapeBox(0F, 0F, 0F, 14, 8, 34, 0F,-2F, 0F, -1F,-2F, 0F, -1F,-2F, 0F, -1F,-2F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 174
		turretModel[0].setRotationPoint(-9F, -36F, -17F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 34, 0F,2F, 0F, -1F,-2F, 0F, -9F,-2F, 0F, -9F,2F, 0F, -1F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F); // Box 176
		turretModel[1].setRotationPoint(5F, -36F, -17F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 9, 8, 34, 0F,-2F, 0F, -9F,2F, 0F, -1F,2F, 0F, -1F,-2F, 0F, -9F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F); // Box 177
		turretModel[2].setRotationPoint(-18F, -36F, -17F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F); // Box 178
		turretModel[3].setRotationPoint(6F, -40F, -6F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 179
		turretModel[4].setRotationPoint(-7F, -35F, -18F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 180
		turretModel[5].setRotationPoint(-7F, -36F, -18F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 181
		turretModel[6].setRotationPoint(-5F, -36F, -18F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 182
		turretModel[7].setRotationPoint(-3F, -36F, -18F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 183
		turretModel[8].setRotationPoint(0F, -36F, -18F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 184
		turretModel[9].setRotationPoint(2F, -36F, -18F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 185
		turretModel[10].setRotationPoint(2F, -36F, 16F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 186
		turretModel[11].setRotationPoint(0F, -36F, 16F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 187
		turretModel[12].setRotationPoint(-3F, -36F, 16F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 188
		turretModel[13].setRotationPoint(-5F, -36F, 16F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 189
		turretModel[14].setRotationPoint(-7F, -36F, 16F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 190
		turretModel[15].setRotationPoint(-7F, -35F, 16F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 5, 11, 12, 0F,0F, 0F, 0F,0F, -5F, -1F,0F, -5F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -1F,0F, -2F, -1F,0F, 0F, 0F); // Box 191
		turretModel[16].setRotationPoint(18F, -40F, -6F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 192
		turretModel[17].setRotationPoint(3F, -42F, -12F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 193
		turretModel[18].setRotationPoint(3F, -42F, -7F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 194
		turretModel[19].setRotationPoint(3F, -42F, -11F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 195
		turretModel[20].setRotationPoint(4F, -44F, -7F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 196
		turretModel[21].setRotationPoint(4F, -44F, -12F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 197
		turretModel[22].setRotationPoint(4F, -44F, -11F);

		turretModel[23].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 198
		turretModel[23].setRotationPoint(6F, -44F, -11F);

		turretModel[24].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 199
		turretModel[24].setRotationPoint(6F, -42F, -11F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 200
		turretModel[25].setRotationPoint(3F, -42F, 11F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 201
		turretModel[26].setRotationPoint(3F, -42F, 6F);

		turretModel[27].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 202
		turretModel[27].setRotationPoint(6F, -42F, 7F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 203
		turretModel[28].setRotationPoint(4F, -44F, 6F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 204
		turretModel[29].setRotationPoint(4F, -44F, 11F);

		turretModel[30].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 205
		turretModel[30].setRotationPoint(6F, -44F, 7F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 206
		turretModel[31].setRotationPoint(3F, -42F, 7F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 207
		turretModel[32].setRotationPoint(4F, -44F, 7F);

		turretModel[33].addBox(0F, 0F, 0F, 8, 2, 6, 0F); // Box 208
		turretModel[33].setRotationPoint(-10F, -38F, 5F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 209
		turretModel[34].setRotationPoint(-2F, -38F, 5F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 210
		turretModel[35].setRotationPoint(-11F, -38F, 5F);

		turretModel[36].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 211
		turretModel[36].setRotationPoint(-12F, -37F, 5F);

		turretModel[37].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 212
		turretModel[37].setRotationPoint(-12F, -37F, 9F);

		turretModel[38].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 213
		turretModel[38].setRotationPoint(-12F, -37F, -11F);

		turretModel[39].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 214
		turretModel[39].setRotationPoint(-12F, -37F, -7F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 215
		turretModel[40].setRotationPoint(-11F, -38F, -11F);

		turretModel[41].addBox(0F, 0F, 0F, 8, 2, 6, 0F); // Box 216
		turretModel[41].setRotationPoint(-10F, -38F, -11F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 217
		turretModel[42].setRotationPoint(-2F, -38F, -11F);

		turretModel[43].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 218
		turretModel[43].setRotationPoint(-15F, -37F, 5F);

		turretModel[44].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 219
		turretModel[44].setRotationPoint(-15F, -37F, -1F);

		turretModel[45].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 220
		turretModel[45].setRotationPoint(-15F, -37F, -7F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 221
		turretModel[46].setRotationPoint(-9F, -37F, -1.5F);

		turretModel[47].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 222
		turretModel[47].setRotationPoint(-8F, -37F, -1.5F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Box 223
		turretModel[48].setRotationPoint(-7F, -37F, -1.5F);


		barrelModel = new ModelRendererTurbo[6];
		barrelModel[0] = new ModelRendererTurbo(this, 200, 375, textureX, textureY); // Box 224
		barrelModel[1] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Box 225
		barrelModel[2] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 226
		barrelModel[3] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Box 227
		barrelModel[4] = new ModelRendererTurbo(this, 200, 425, textureX, textureY); // Box 228
		barrelModel[5] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Box 232

		barrelModel[0].addShapeBox(0F, -4F, 0F, 9, 11, 10, 0F,0F, 0F, 0F,0F, -7F, -2F,0F, -7F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F,0F, -2F, -2F,0F, 0F, 0F); // Box 224
		barrelModel[0].setRotationPoint(18F, -36F, -5F);

		barrelModel[1].addBox(7F, 2F, 4F, 3, 3, 2, 0F); // Box 225
		barrelModel[1].setRotationPoint(18F, -36F, -5F);

		barrelModel[2].addBox(10F, 3F, 4F, 16, 2, 2, 0F); // Box 226
		barrelModel[2].setRotationPoint(18F, -36F, -5F);

		barrelModel[3].addBox(26F, 3.5F, 4.5F, 21, 1, 1, 0F); // Box 227
		barrelModel[3].setRotationPoint(18F, -36F, -5F);

		barrelModel[4].addShapeBox(47F, 3.5F, 4.5F, 5, 1, 1, 0F,0F, 0F, 0F,0F, 0.5F, 0.5F,0F, 0.5F, 0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.5F, 0.5F,0F, 0.5F, 0.5F,0F, 0F, 0F); // Box 228
		barrelModel[4].setRotationPoint(18F, -36F, -5F);

		barrelModel[5].addShapeBox(-4F, -4F, 0F, 4, 11, 10, 0F,0F, -7F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -7F, -2F,0F, -2F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F); // Box 232
		barrelModel[5].setRotationPoint(18F, -36F, -5F);


		leftTrackModel = new ModelRendererTurbo[35];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 1845, textureX, textureY); // Box 104
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 1856, textureX, textureY); // Box 105
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 1868, textureX, textureY); // Box 106
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 107
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 108
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 109
		leftTrackModel[6] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 110
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 111
		leftTrackModel[8] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 112
		leftTrackModel[9] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 113
		leftTrackModel[10] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 114
		leftTrackModel[11] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 115
		leftTrackModel[12] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 116
		leftTrackModel[13] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 117
		leftTrackModel[14] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 118
		leftTrackModel[15] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 119
		leftTrackModel[16] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 120
		leftTrackModel[17] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 121
		leftTrackModel[18] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 122
		leftTrackModel[19] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 123
		leftTrackModel[20] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 124
		leftTrackModel[21] = new ModelRendererTurbo(this, 0, 1845, textureX, textureY); // Box 125
		leftTrackModel[22] = new ModelRendererTurbo(this, 0, 1856, textureX, textureY); // Box 126
		leftTrackModel[23] = new ModelRendererTurbo(this, 0, 1868, textureX, textureY); // Box 127
		leftTrackModel[24] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 128
		leftTrackModel[25] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 129
		leftTrackModel[26] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 130
		leftTrackModel[27] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 131
		leftTrackModel[28] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 132
		leftTrackModel[29] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 133
		leftTrackModel[30] = new ModelRendererTurbo(this, 0, 1925, textureX, textureY); // Box 134
		leftTrackModel[31] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 135
		leftTrackModel[32] = new ModelRendererTurbo(this, 0, 1942, textureX, textureY); // Box 136
		leftTrackModel[33] = new ModelRendererTurbo(this, 0, 2020, textureX, textureY); // Box 137
		leftTrackModel[34] = new ModelRendererTurbo(this, 0, 1942, textureX, textureY); // Box 138

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 104
		leftTrackModel[0].setRotationPoint(-35F, -6F, 21F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // Box 105
		leftTrackModel[1].setRotationPoint(-35F, -3F, 21F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 106
		leftTrackModel[2].setRotationPoint(-35F, 0F, 21F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 107
		leftTrackModel[3].setRotationPoint(-22F, -3F, 21F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 108
		leftTrackModel[4].setRotationPoint(-22F, 1F, 21F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 109
		leftTrackModel[5].setRotationPoint(-22F, 5F, 21F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 110
		leftTrackModel[6].setRotationPoint(-7F, 5F, 21F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 111
		leftTrackModel[7].setRotationPoint(-7F, 1F, 21F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 112
		leftTrackModel[8].setRotationPoint(-7F, -3F, 21F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 113
		leftTrackModel[9].setRotationPoint(8F, -3F, 21F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 114
		leftTrackModel[10].setRotationPoint(8F, 1F, 21F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 115
		leftTrackModel[11].setRotationPoint(8F, 5F, 21F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 116
		leftTrackModel[12].setRotationPoint(25F, -3F, 21F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 117
		leftTrackModel[13].setRotationPoint(25F, 1F, 21F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 118
		leftTrackModel[14].setRotationPoint(25F, 5F, 21F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 119
		leftTrackModel[15].setRotationPoint(40F, -3F, 21F);

		leftTrackModel[16].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 120
		leftTrackModel[16].setRotationPoint(40F, 1F, 21F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 121
		leftTrackModel[17].setRotationPoint(40F, 5F, 21F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 122
		leftTrackModel[18].setRotationPoint(55F, -3F, 21F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 123
		leftTrackModel[19].setRotationPoint(55F, 1F, 21F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 124
		leftTrackModel[20].setRotationPoint(55F, 5F, 21F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 125
		leftTrackModel[21].setRotationPoint(71F, -6F, 21F);

		leftTrackModel[22].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // Box 126
		leftTrackModel[22].setRotationPoint(71F, -3F, 21F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 127
		leftTrackModel[23].setRotationPoint(71F, 0F, 21F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 128
		leftTrackModel[24].setRotationPoint(59F, -5F, 23F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 129
		leftTrackModel[25].setRotationPoint(44F, -5F, 23F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 130
		leftTrackModel[26].setRotationPoint(29F, -5F, 23F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 131
		leftTrackModel[27].setRotationPoint(12F, -5F, 23F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 132
		leftTrackModel[28].setRotationPoint(-3F, -5F, 23F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 133
		leftTrackModel[29].setRotationPoint(-19F, -5F, 23F);

		leftTrackModel[30].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 134
		leftTrackModel[30].setRotationPoint(80F, -5F, 20F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 85, 1, 8, 0F,0F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,0F, 0F, 0F); // Box 135
		leftTrackModel[31].setRotationPoint(-20F, 9F, 20F);

		leftTrackModel[32].addShapeBox(-1F, 0F, 0F, 1, 19, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.3F, 0F,0F, -0.3F, 0F,0F, 0F, 0F); // Box 136
		leftTrackModel[32].setRotationPoint(81F, 1F, 20F);
		leftTrackModel[32].rotateAngleZ = -1.06465084F;

		leftTrackModel[33].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 137
		leftTrackModel[33].setRotationPoint(-36F, -5F, 20F);

		leftTrackModel[34].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Box 138
		leftTrackModel[34].setRotationPoint(-36F, 2F, 20F);
		leftTrackModel[34].rotateAngleZ = 1.10828408F;


		rightTrackModel = new ModelRendererTurbo[35];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 1845, textureX, textureY); // Box 139
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 1856, textureX, textureY); // Box 140
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 1868, textureX, textureY); // Box 141
		rightTrackModel[3] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 142
		rightTrackModel[4] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 143
		rightTrackModel[5] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 144
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 145
		rightTrackModel[7] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 146
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 147
		rightTrackModel[9] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 148
		rightTrackModel[10] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 149
		rightTrackModel[11] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 150
		rightTrackModel[12] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 151
		rightTrackModel[13] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 152
		rightTrackModel[14] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 153
		rightTrackModel[15] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 154
		rightTrackModel[16] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 155
		rightTrackModel[17] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 156
		rightTrackModel[18] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 157
		rightTrackModel[19] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 158
		rightTrackModel[20] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 159
		rightTrackModel[21] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 160
		rightTrackModel[22] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 161
		rightTrackModel[23] = new ModelRendererTurbo(this, 20, 1925, textureX, textureY); // Box 162
		rightTrackModel[24] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Box 163
		rightTrackModel[25] = new ModelRendererTurbo(this, 0, 1895, textureX, textureY); // Box 164
		rightTrackModel[26] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 165
		rightTrackModel[27] = new ModelRendererTurbo(this, 0, 1845, textureX, textureY); // Box 166
		rightTrackModel[28] = new ModelRendererTurbo(this, 0, 1856, textureX, textureY); // Box 167
		rightTrackModel[29] = new ModelRendererTurbo(this, 0, 1868, textureX, textureY); // Box 168
		rightTrackModel[30] = new ModelRendererTurbo(this, 0, 1925, textureX, textureY); // Box 169
		rightTrackModel[31] = new ModelRendererTurbo(this, 0, 1942, textureX, textureY); // Box 170
		rightTrackModel[32] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 171
		rightTrackModel[33] = new ModelRendererTurbo(this, 0, 1942, textureX, textureY); // Box 172
		rightTrackModel[34] = new ModelRendererTurbo(this, 0, 2020, textureX, textureY); // Box 173

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 139
		rightTrackModel[0].setRotationPoint(-35F, -6F, -27F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // Box 140
		rightTrackModel[1].setRotationPoint(-35F, -3F, -27F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 141
		rightTrackModel[2].setRotationPoint(-35F, 0F, -27F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 142
		rightTrackModel[3].setRotationPoint(-19F, -5F, -25F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 143
		rightTrackModel[4].setRotationPoint(-22F, -3F, -27F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 144
		rightTrackModel[5].setRotationPoint(-22F, 1F, -27F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 145
		rightTrackModel[6].setRotationPoint(-22F, 5F, -27F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 146
		rightTrackModel[7].setRotationPoint(-3F, -5F, -25F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 147
		rightTrackModel[8].setRotationPoint(-7F, -3F, -27F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 148
		rightTrackModel[9].setRotationPoint(-7F, 1F, -27F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 149
		rightTrackModel[10].setRotationPoint(-7F, 5F, -27F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 150
		rightTrackModel[11].setRotationPoint(12F, -5F, -25F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 151
		rightTrackModel[12].setRotationPoint(8F, -3F, -27F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 152
		rightTrackModel[13].setRotationPoint(8F, 1F, -27F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 153
		rightTrackModel[14].setRotationPoint(8F, 5F, -27F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 154
		rightTrackModel[15].setRotationPoint(29F, -5F, -25F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 155
		rightTrackModel[16].setRotationPoint(25F, -3F, -27F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 156
		rightTrackModel[17].setRotationPoint(25F, 1F, -27F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 157
		rightTrackModel[18].setRotationPoint(25F, 5F, -27F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 158
		rightTrackModel[19].setRotationPoint(44F, -5F, -25F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 159
		rightTrackModel[20].setRotationPoint(40F, -3F, -27F);

		rightTrackModel[21].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 160
		rightTrackModel[21].setRotationPoint(40F, 1F, -27F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 161
		rightTrackModel[22].setRotationPoint(40F, 5F, -27F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 162
		rightTrackModel[23].setRotationPoint(59F, -5F, -25F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 163
		rightTrackModel[24].setRotationPoint(55F, -3F, -27F);

		rightTrackModel[25].addBox(0F, 0F, 0F, 12, 4, 6, 0F); // Box 164
		rightTrackModel[25].setRotationPoint(55F, 1F, -27F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 165
		rightTrackModel[26].setRotationPoint(55F, 5F, -27F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 166
		rightTrackModel[27].setRotationPoint(71F, -6F, -27F);

		rightTrackModel[28].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // Box 167
		rightTrackModel[28].setRotationPoint(71F, -3F, -27F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 168
		rightTrackModel[29].setRotationPoint(71F, 0F, -27F);

		rightTrackModel[30].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 169
		rightTrackModel[30].setRotationPoint(80F, -5F, -28F);

		rightTrackModel[31].addShapeBox(-1F, 0F, 0F, 1, 19, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.3F, 0F,0F, -0.3F, 0F,0F, 0F, 0F); // Box 170
		rightTrackModel[31].setRotationPoint(81F, 1F, -28F);
		rightTrackModel[31].rotateAngleZ = -1.06465084F;

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 85, 1, 8, 0F,0F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.2F, 0F, 0F,-0.2F, 0F, 0F,0F, 0F, 0F); // Box 171
		rightTrackModel[32].setRotationPoint(-20F, 9F, -28F);

		rightTrackModel[33].addBox(0F, 0F, 0F, 1, 18, 8, 0F); // Box 172
		rightTrackModel[33].setRotationPoint(-36F, 2F, -28F);
		rightTrackModel[33].rotateAngleZ = 1.10828408F;

		rightTrackModel[34].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 173
		rightTrackModel[34].setRotationPoint(-36F, -5F, -28F);
		
		doorAnimModel = new ModelRendererTurbo[3];
		doorAnimModel[0] = new ModelRendererTurbo(this, 200, 465, textureX, textureY); // Box 229
		doorAnimModel[1] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Box 230
		doorAnimModel[2] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Box 231

		doorAnimModel[0].addBox(0F, 0F, 0F, 2, 18, 20, 0F); // Box 229
		doorAnimModel[0].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[1].addShapeBox(0F, -2F, 0F, 2, 2, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		doorAnimModel[1].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[2].addShapeBox(0F, 18F, 0F, 2, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 231
		doorAnimModel[2].setRotationPoint(0F, 0F, 0F);
		
		doorAttach = new Vector3f(-33F/16F, 22F/16F, -10F/16F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
