//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.05.2016 - 15:26:41
// Last changed on: 13.05.2016 - 15:26:41

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelLightning extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelLightning() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[156];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box1
		bodyModel[1] = new ModelRendererTurbo(this, 60, 110, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 120, 110, textureX, textureY); // Import Box3
		bodyModel[3] = new ModelRendererTurbo(this, 180, 110, textureX, textureY); // Import Box4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Import Box5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Box6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Import Box7
		bodyModel[7] = new ModelRendererTurbo(this, 26, 208, textureX, textureY); // Import Box8
		bodyModel[8] = new ModelRendererTurbo(this, 24, 226, textureX, textureY); // Import Box9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Import Box10
		bodyModel[10] = new ModelRendererTurbo(this, 48, 226, textureX, textureY); // Import Box11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Import Box12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 226, textureX, textureY); // Import Box13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 226, textureX, textureY); // Import Box14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Import Box15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Import Box20
		bodyModel[16] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Import Box21
		bodyModel[17] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Import Box22
		bodyModel[18] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Import Box23
		bodyModel[19] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import Box24
		bodyModel[20] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import Box25
		bodyModel[21] = new ModelRendererTurbo(this, 0, 334, textureX, textureY); // Import Box26
		bodyModel[22] = new ModelRendererTurbo(this, 0, 371, textureX, textureY); // Import Box27
		bodyModel[23] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Import Box28
		bodyModel[24] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Box29
		bodyModel[25] = new ModelRendererTurbo(this, 0, 394, textureX, textureY); // Import Box30
		bodyModel[26] = new ModelRendererTurbo(this, 0, 412, textureX, textureY); // Import Box31
		bodyModel[27] = new ModelRendererTurbo(this, 0, 429, textureX, textureY); // Import Box32
		bodyModel[28] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Import Box33
		bodyModel[29] = new ModelRendererTurbo(this, 0, 454, textureX, textureY); // Import Box34
		bodyModel[30] = new ModelRendererTurbo(this, 0, 471, textureX, textureY); // Import Box35
		bodyModel[31] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Import Box36
		bodyModel[32] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Import Box37
		bodyModel[33] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Box38
		bodyModel[34] = new ModelRendererTurbo(this, 0, 519, textureX, textureY); // Import Box39
		bodyModel[35] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Box40
		bodyModel[36] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box41
		bodyModel[37] = new ModelRendererTurbo(this, 0, 566, textureX, textureY); // Import Box43
		bodyModel[38] = new ModelRendererTurbo(this, 0, 394, textureX, textureY); // Import Box44
		bodyModel[39] = new ModelRendererTurbo(this, 0, 412, textureX, textureY); // Import Box45
		bodyModel[40] = new ModelRendererTurbo(this, 0, 429, textureX, textureY); // Import Box46
		bodyModel[41] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Import Box47
		bodyModel[42] = new ModelRendererTurbo(this, 0, 454, textureX, textureY); // Import Box48
		bodyModel[43] = new ModelRendererTurbo(this, 0, 471, textureX, textureY); // Import Box49
		bodyModel[44] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Import Box50
		bodyModel[45] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Import Box51
		bodyModel[46] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Box52
		bodyModel[47] = new ModelRendererTurbo(this, 0, 519, textureX, textureY); // Import Box53
		bodyModel[48] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Box54
		bodyModel[49] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box55
		bodyModel[50] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Import Box56
		bodyModel[51] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Import Box57
		bodyModel[52] = new ModelRendererTurbo(this, 0, 664, textureX, textureY); // Import Box58
		bodyModel[53] = new ModelRendererTurbo(this, 0, 686, textureX, textureY); // Import Box59
		bodyModel[54] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import Box60
		bodyModel[55] = new ModelRendererTurbo(this, 0, 763, textureX, textureY); // Import Box61
		bodyModel[56] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Import Box62
		bodyModel[57] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import Box63
		bodyModel[58] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Box64
		bodyModel[59] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box65
		bodyModel[60] = new ModelRendererTurbo(this, 0, 867, textureX, textureY); // Import Box66
		bodyModel[61] = new ModelRendererTurbo(this, 0, 887, textureX, textureY); // Import Box67
		bodyModel[62] = new ModelRendererTurbo(this, 0, 922, textureX, textureY); // Import Box68
		bodyModel[63] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Import Box69
		bodyModel[64] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box70
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1006, textureX, textureY); // Import Box71
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1019, textureX, textureY); // Import Box72
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box73
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box74
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1105, textureX, textureY); // Import Box75
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Import Box76
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Import Box77
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1123, textureX, textureY); // Import Box78
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box79
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box80
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box81
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box82
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box83
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box84
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box85
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box86
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box87
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box88
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box89
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box90
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box91
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box92
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box112
		bodyModel[88] = new ModelRendererTurbo(this, 0, 1105, textureX, textureY); // Import Box113
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Import Box114
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1123, textureX, textureY); // Import Box115
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box116
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box117
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box118
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box119
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box120
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box121
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box122
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box123
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box124
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box125
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box126
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box127
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box128
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1156, textureX, textureY); // Import Box129
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Import Box130
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Import Box131
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1164, textureX, textureY); // Import Box132
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Import Box133
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Import Box134
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1205, textureX, textureY); // Import Box135
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1205, textureX, textureY); // Import Box136
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Box137
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Box138
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Import Box139
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Import Box140
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box141
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box142
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1313, textureX, textureY); // Import Box145
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1345, textureX, textureY); // Import Box146
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1377, textureX, textureY); // Import Box147
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1394, textureX, textureY); // Import Box148
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1409, textureX, textureY); // Box 54
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1426, textureX, textureY); // Box 55
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1426, textureX, textureY); // Box 56
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1409, textureX, textureY); // Box 57
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1443, textureX, textureY); // Box 58
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Box 60
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1511, textureX, textureY); // Box 61
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1536, textureX, textureY); // Box 62
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 63
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1580, textureX, textureY); // Box 64
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1601, textureX, textureY); // Box 65
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Box 66
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1642, textureX, textureY); // Box 67
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1660, textureX, textureY); // Box 68
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1673, textureX, textureY); // Box 69
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1687, textureX, textureY); // Box 70
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1703, textureX, textureY); // Box 71
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 72
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1742, textureX, textureY); // Box 73
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1751, textureX, textureY); // Box 74
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1759, textureX, textureY); // Box 75
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1751, textureX, textureY); // Box 76
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1742, textureX, textureY); // Box 77
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1766, textureX, textureY); // Box 78
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1779, textureX, textureY); // Box 79
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1776, textureX, textureY); // Box 80
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1814, textureX, textureY); // Box 81
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1854, textureX, textureY); // Box 82
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Box 83
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1926, textureX, textureY); // Box 84
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1963, textureX, textureY); // Box 96
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1985, textureX, textureY); // Box 97
		bodyModel[154] = new ModelRendererTurbo(this, 0, 2002, textureX, textureY); // Box 98
		bodyModel[155] = new ModelRendererTurbo(this, 0, 2020, textureX, textureY); // Box 99

		bodyModel[0].addShapeBox(-3F, 0F, 0F, 17, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -5F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -10F, -5F, -5F); // Import Box1
		bodyModel[0].setRotationPoint(-135F, -34F, 0F);

		bodyModel[1].addShapeBox(-3F, 0F, 0F, 17, 9, 9, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -10F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -5F); // Import Box2
		bodyModel[1].setRotationPoint(-135F, -43F, 0F);

		bodyModel[2].addShapeBox(-3F, 0F, 0F, 17, 9, 9, 0F, -10F, -5F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, -7F, -5F, 0F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[2].setRotationPoint(-135F, -43F, -9F);

		bodyModel[3].addShapeBox(-3F, 0F, 0F, 17, 9, 9, 0F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, -7F, -5F, 0F); // Import Box4
		bodyModel[3].setRotationPoint(-135F, -34F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[4].setRotationPoint(-119F, -39F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 11, 0F, 0F, 0F, -7F, 0F, 4F, -7F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[5].setRotationPoint(-119F, -47F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 8, 22, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 4F, -7F, 0F, 4F, -7F, 0F, 0F, -7F); // Import Box7
		bodyModel[6].setRotationPoint(-119F, -29F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Import Box8
		bodyModel[7].setRotationPoint(-124F, -47F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, -8F, -1.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 6F, -3.5F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 2F, 1F); // Import Box9
		bodyModel[8].setRotationPoint(-124F, -47F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Import Box10
		bodyModel[9].setRotationPoint(-124F, -39F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -1.5F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -3.5F); // Import Box11
		bodyModel[10].setRotationPoint(-124F, -47F, 4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box12
		bodyModel[11].setRotationPoint(-124F, -39F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -3.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -1.5F); // Import Box13
		bodyModel[12].setRotationPoint(-124F, -23F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 6F, -3.5F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -8F, -1.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F); // Import Box14
		bodyModel[13].setRotationPoint(-124F, -23F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F); // Import Box15
		bodyModel[14].setRotationPoint(-124F, -23F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[15].setRotationPoint(-121F, -43F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[16].setRotationPoint(-121F, -43F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Import Box22
		bodyModel[17].setRotationPoint(-121F, -34F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[18].setRotationPoint(-121F, -34F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[19].setRotationPoint(-119F, -39F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 47, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[20].setRotationPoint(-103F, -42F, -12F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 29, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 4F, -8F, 0F, 4F, -8F, 0F, 0F, -8F); // Import Box26
		bodyModel[21].setRotationPoint(-103F, -26F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 47, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[22].setRotationPoint(-103F, -42F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F); // Import Box28
		bodyModel[23].setRotationPoint(-119F, -39F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 8, 11, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 0F); // Import Box29
		bodyModel[24].setRotationPoint(-119F, -47F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 9, 4, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[25].setRotationPoint(-103F, -51F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[26].setRotationPoint(-93F, -51F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -3F, -3F, 0F, 0F, -1F, 0F); // Import Box32
		bodyModel[27].setRotationPoint(-103F, -51F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[28].setRotationPoint(-81F, -51F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 9, 4, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -5F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, -5F, 0F); // Import Box34
		bodyModel[29].setRotationPoint(-79F, -51F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.001F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.001F, 0F); // Import Box35
		bodyModel[30].setRotationPoint(-93F, -47F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[31].setRotationPoint(-81F, -47F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[32].setRotationPoint(-79F, -47F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, 0F, -3F, 0F, 2F, -4F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[33].setRotationPoint(-69F, -51F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[34].setRotationPoint(-69F, -48F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, -4F, 0F, 3F, -6F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box40
		bodyModel[35].setRotationPoint(-64F, -53F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box41
		bodyModel[36].setRotationPoint(-59F, -53F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		bodyModel[37].setRotationPoint(-59F, -61F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 9, 4, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[38].setRotationPoint(-103F, -51F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, 0F, 0F); // Import Box45
		bodyModel[39].setRotationPoint(-93F, -51F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, 0F, 1F, 0F, -4F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, 0F, -1F, 1F, 0F, 0F, 0F); // Import Box46
		bodyModel[40].setRotationPoint(-103F, -51F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box47
		bodyModel[41].setRotationPoint(-81F, -51F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 9, 4, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, -5F, -1F); // Import Box48
		bodyModel[42].setRotationPoint(-79F, -51F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0.001F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.001F, 0F); // Import Box49
		bodyModel[43].setRotationPoint(-93F, -47F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[44].setRotationPoint(-81F, -47F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[45].setRotationPoint(-79F, -47F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, 0F, 1F, 0F, 2F, 2F, 0F, 2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[46].setRotationPoint(-69F, -51F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[47].setRotationPoint(-69F, -48F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -6F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[48].setRotationPoint(-64F, -53F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[49].setRotationPoint(-59F, -53F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 13, 24, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F); // Import Box56
		bodyModel[50].setRotationPoint(-74F, -26F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 8, 22, 0F, 0F, 0F, -6F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[51].setRotationPoint(-56F, -56F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 0F); // Import Box58
		bodyModel[52].setRotationPoint(-56F, -60F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 6, 24, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[53].setRotationPoint(-56F, -48F, -12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 136, 16, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[54].setRotationPoint(-56F, -42F, -12F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 142, 5, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Import Box61
		bodyModel[55].setRotationPoint(-56F, -18F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[56].setRotationPoint(-132F, -23F, -0.5F);

		bodyModel[57].addTrapezoid(0F, 0F, 0F, 33, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Import Box63
		bodyModel[57].setRotationPoint(-165F, -23F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 4, 22, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[58].setRotationPoint(-52F, -52F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F, 0F, 0F, -2.285714F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.285714F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box65
		bodyModel[59].setRotationPoint(-52F, -56F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 3, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2.285714F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.285714F); // Import Box66
		bodyModel[60].setRotationPoint(-52F, -59F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 6, 24, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[61].setRotationPoint(-52F, -48F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 124, 5, 24, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[62].setRotationPoint(-44F, -47F, -12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 124, 5, 22, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[63].setRotationPoint(-44F, -52F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 124, 4, 10, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[64].setRotationPoint(-44F, -56F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 124, 3, 8, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box71
		bodyModel[65].setRotationPoint(-44F, -59F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 8, 24, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -8F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, 0F); // Import Box72
		bodyModel[66].setRotationPoint(-74F, -26F, -12F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 142, 8, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box73
		bodyModel[67].setRotationPoint(-56F, -26F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 26, 1, 9, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[68].setRotationPoint(-68F, -21F, -17F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 57, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[69].setRotationPoint(-76F, -21F, -20.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 57, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[70].setRotationPoint(-76F, -22F, -20.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 57, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box77
		bodyModel[71].setRotationPoint(-76F, -19F, -20.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, 0F, -0.833333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.833333F, -1.5F, 0F, -0.833333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.833333F, -1.5F); // Import Box78
		bodyModel[72].setRotationPoint(-83F, -21F, -20.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, -1.5F, -1.833333F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.833333F, 0F, 0.833333333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833333333F, -1.5F); // Import Box79
		bodyModel[73].setRotationPoint(-83F, -22F, -20.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0.833333333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833333333F, -1.5F, 0F, -1.5F, -1.833333F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.833333F); // Import Box80
		bodyModel[74].setRotationPoint(-83F, -19F, -20.5F);

		bodyModel[75].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box81
		bodyModel[75].setRotationPoint(-48F, -20F, -18.5F);
		bodyModel[75].rotateAngleX = -0.78539816F;

		bodyModel[76].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[76].setRotationPoint(-57F, -20F, -18.5F);

		bodyModel[77].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		bodyModel[77].setRotationPoint(-57F, -20F, -18.5F);
		bodyModel[77].rotateAngleX = 1.57079633F;

		bodyModel[78].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box84
		bodyModel[78].setRotationPoint(-48F, -20F, -18.5F);
		bodyModel[78].rotateAngleX = 0.78539816F;

		bodyModel[79].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[79].setRotationPoint(-57F, -20F, -18.5F);
		bodyModel[79].rotateAngleX = 3.14159265F;

		bodyModel[80].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box86
		bodyModel[80].setRotationPoint(-48F, -20F, -18.5F);
		bodyModel[80].rotateAngleX = 2.35619449F;

		bodyModel[81].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		bodyModel[81].setRotationPoint(-57F, -20F, -18.5F);
		bodyModel[81].rotateAngleX = 4.71238898F;

		bodyModel[82].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box88
		bodyModel[82].setRotationPoint(-48F, -20F, -18.5F);
		bodyModel[82].rotateAngleX = 3.92699082F;

		bodyModel[83].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[83].setRotationPoint(-26F, -20F, -18.5F);
		bodyModel[83].rotateAngleX = 2.35619449F;

		bodyModel[84].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[84].setRotationPoint(-26F, -20F, -18.5F);
		bodyModel[84].rotateAngleX = 3.92699082F;

		bodyModel[85].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		bodyModel[85].setRotationPoint(-26F, -20F, -18.5F);
		bodyModel[85].rotateAngleX = -0.78539816F;

		bodyModel[86].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[86].setRotationPoint(-26F, -20F, -18.5F);
		bodyModel[86].rotateAngleX = 0.78539816F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 26, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F); // Import Box112
		bodyModel[87].setRotationPoint(-68F, -21F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 57, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		bodyModel[88].setRotationPoint(-76F, -21F, 16.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 57, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box114
		bodyModel[89].setRotationPoint(-76F, -19F, 16.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, 0F, -0.833333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.833333F, -1.5F, 0F, -0.833333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.833333F, -1.5F); // Import Box115
		bodyModel[90].setRotationPoint(-83F, -21F, 16.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, -1.5F, -1.833333F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.833333F, 0F, 0.833333333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833333333F, -1.5F); // Import Box116
		bodyModel[91].setRotationPoint(-83F, -22F, 16.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0.833333333F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833333333F, -1.5F, 0F, -1.5F, -1.833333F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.833333F); // Import Box117
		bodyModel[92].setRotationPoint(-83F, -19F, 16.5F);

		bodyModel[93].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[93].setRotationPoint(-57F, -20F, 18.5F);
		bodyModel[93].rotateAngleX = 4.71238898F;

		bodyModel[94].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyModel[94].setRotationPoint(-57F, -20F, 18.5F);
		bodyModel[94].rotateAngleX = 3.14159265F;

		bodyModel[95].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		bodyModel[95].setRotationPoint(-57F, -20F, 18.5F);
		bodyModel[95].rotateAngleX = 1.57079633F;

		bodyModel[96].addShapeBox(-4F, -0.5F, 0.5F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[96].setRotationPoint(-57F, -20F, 18.5F);

		bodyModel[97].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box122
		bodyModel[97].setRotationPoint(-48F, -20F, 18.5F);
		bodyModel[97].rotateAngleX = 3.92699082F;

		bodyModel[98].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box123
		bodyModel[98].setRotationPoint(-48F, -20F, 18.5F);
		bodyModel[98].rotateAngleX = -0.78539816F;

		bodyModel[99].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box124
		bodyModel[99].setRotationPoint(-48F, -20F, 18.5F);
		bodyModel[99].rotateAngleX = 2.35619449F;

		bodyModel[100].addShapeBox(0F, -0.5F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box125
		bodyModel[100].setRotationPoint(-48F, -20F, 18.5F);
		bodyModel[100].rotateAngleX = 0.78539816F;

		bodyModel[101].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		bodyModel[101].setRotationPoint(-26F, -20F, 18.5F);
		bodyModel[101].rotateAngleX = 2.35619449F;

		bodyModel[102].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box127
		bodyModel[102].setRotationPoint(-26F, -20F, 18.5F);
		bodyModel[102].rotateAngleX = 3.92699082F;

		bodyModel[103].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[103].setRotationPoint(-26F, -20F, 18.5F);
		bodyModel[103].rotateAngleX = 0.78539816F;

		bodyModel[104].addShapeBox(0F, -0.5F, 0.5F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[104].setRotationPoint(-26F, -20F, 18.5F);
		bodyModel[104].rotateAngleX = -0.78539816F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 57, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		bodyModel[105].setRotationPoint(-76F, -22F, 16.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 2F, -2F, 0F, -1F, -6F); // Import Box131
		bodyModel[106].setRotationPoint(-4F, -17F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 2F, -2F, 0F, 5F, 0F, 0F, -1F, 0F); // Import Box132
		bodyModel[107].setRotationPoint(-4F, -17F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 16, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, -2F, 0F, -3F, -2F); // Import Box133
		bodyModel[108].setRotationPoint(12F, -17F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 16, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[109].setRotationPoint(12F, -17F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 23, 12, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Import Box135
		bodyModel[110].setRotationPoint(28F, -17F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 23, 12, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box136
		bodyModel[111].setRotationPoint(28F, -17F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 23, 10, 7, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Import Box137
		bodyModel[112].setRotationPoint(51F, -17F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 23, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F); // Import Box138
		bodyModel[113].setRotationPoint(51F, -17F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 19, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 2F, -2F); // Import Box139
		bodyModel[114].setRotationPoint(74F, -17F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 19, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 5F, 0F); // Import Box140
		bodyModel[115].setRotationPoint(74F, -17F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box141
		bodyModel[116].setRotationPoint(80F, -42F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[117].setRotationPoint(80F, -34F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[118].setRotationPoint(80F, -47F, -12F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 5, 22, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[119].setRotationPoint(80F, -52F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[120].setRotationPoint(80F, -55F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[121].setRotationPoint(80F, -57F, -4F);

		bodyModel[122].addShapeBox(0F, 5F, -0.5F, 26, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[122].setRotationPoint(61F, -17F, 0F);
		bodyModel[122].rotateAngleX = -0.2268928F;

		bodyModel[123].addShapeBox(0F, 5F, -0.5F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 55
		bodyModel[123].setRotationPoint(50F, -17F, 0F);
		bodyModel[123].rotateAngleX = -0.2268928F;

		bodyModel[124].addShapeBox(0F, 5F, -0.5F, 11, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 56
		bodyModel[124].setRotationPoint(50F, -17F, 0F);
		bodyModel[124].rotateAngleX = 0.2268928F;

		bodyModel[125].addShapeBox(0F, 5F, -0.5F, 26, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[125].setRotationPoint(61F, -17F, 0F);
		bodyModel[125].rotateAngleX = 0.2268928F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 21, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[126].setRotationPoint(-81F, -47F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[127].setRotationPoint(-81F, -51F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 4, 16, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[128].setRotationPoint(-93F, -51F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 62
		bodyModel[129].setRotationPoint(-103F, -51F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 63
		bodyModel[130].setRotationPoint(-67F, -52.5F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 64
		bodyModel[131].setRotationPoint(-70F, -48.5F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[132].setRotationPoint(-70F, -44.5F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 17, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[133].setRotationPoint(-79F, -39.5F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[134].setRotationPoint(-67F, -54.5F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[135].setRotationPoint(-67F, -58.5F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[136].setRotationPoint(-67.5F, -54.5F, -4.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 70
		bodyModel[137].setRotationPoint(-67.5F, -52.5F, -4.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		bodyModel[138].setRotationPoint(-70.5F, -48.5F, -4.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 72
		bodyModel[139].setRotationPoint(-70.5F, -44.5F, -4.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[140].setRotationPoint(-78.5F, -40.5F, -4.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 74
		bodyModel[141].setRotationPoint(-78.5F, -40.5F, -2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[142].setRotationPoint(-76.5F, -40.5F, -1.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[143].setRotationPoint(-78.5F, -40.5F, 1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[144].setRotationPoint(-78.5F, -40.5F, 2.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[145].setRotationPoint(-79.5F, -43.5F, -1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[146].setRotationPoint(-76.5F, -46.5F, -0.5F);
		bodyModel[146].rotateAngleZ = -0.41887902F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 80
		bodyModel[147].setRotationPoint(-79.5F, -50.5F, 2.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 81
		bodyModel[148].setRotationPoint(-79.5F, -50.5F, -2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 82
		bodyModel[149].setRotationPoint(-79.5F, -50.5F, -18.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 83
		bodyModel[150].setRotationPoint(-79.5F, -45.5F, 2.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 84
		bodyModel[151].setRotationPoint(-79.5F, -45.5F, -18.5F);

		bodyModel[152].addShapeBox(-34F, 2F, -5.5F, 12, 7, 11, 0F, 0F, -4F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 96
		bodyModel[152].setRotationPoint(-59F, -60F, 0F);

		bodyModel[153].addShapeBox(-34F, -3F, -4.5F, 12, 5, 9, 0F, 0F, -7F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -7F, -3F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F); // Box 97
		bodyModel[153].setRotationPoint(-59F, -60F, 0F);

		bodyModel[154].addShapeBox(-44F, 6F, -5.5F, 10, 3, 11, 0F, 0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 98
		bodyModel[154].setRotationPoint(-59F, -60F, 0F);

		bodyModel[155].addShapeBox(-44F, 4F, -3.5F, 10, 2, 7, 0F, 0F, -4.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4.5F, -3F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 99
		bodyModel[155].setRotationPoint(-59F, -60F, 0F);


		tailModel = new ModelRendererTurbo[41];
		tailModel[0] = new ModelRendererTurbo(this, 150, 140, textureX, textureY); // Import Box143
		tailModel[1] = new ModelRendererTurbo(this, 150, 175, textureX, textureY); // Import Box144
		tailModel[2] = new ModelRendererTurbo(this, 150, 207, textureX, textureY); // Import Box149
		tailModel[3] = new ModelRendererTurbo(this, 150, 207, textureX, textureY); // Import Box150
		tailModel[4] = new ModelRendererTurbo(this, 150, 248, textureX, textureY); // Import Box151
		tailModel[5] = new ModelRendererTurbo(this, 150, 276, textureX, textureY); // Import Box152
		tailModel[6] = new ModelRendererTurbo(this, 150, 314, textureX, textureY); // Import Box153
		tailModel[7] = new ModelRendererTurbo(this, 150, 345, textureX, textureY); // Import Box154
		tailModel[8] = new ModelRendererTurbo(this, 150, 365, textureX, textureY); // Import Box155
		tailModel[9] = new ModelRendererTurbo(this, 150, 365, textureX, textureY); // Import Box156
		tailModel[10] = new ModelRendererTurbo(this, 150, 402, textureX, textureY); // Import Box157
		tailModel[11] = new ModelRendererTurbo(this, 150, 433, textureX, textureY); // Import Box158
		tailModel[12] = new ModelRendererTurbo(this, 150, 470, textureX, textureY); // Import Box159
		tailModel[13] = new ModelRendererTurbo(this, 150, 501, textureX, textureY); // Import Box160
		tailModel[14] = new ModelRendererTurbo(this, 150, 523, textureX, textureY); // Import Box161
		tailModel[15] = new ModelRendererTurbo(this, 150, 545, textureX, textureY); // Import Box162
		tailModel[16] = new ModelRendererTurbo(this, 150, 566, textureX, textureY); // Import Box163
		tailModel[17] = new ModelRendererTurbo(this, 150, 605, textureX, textureY); // Import Box164
		tailModel[18] = new ModelRendererTurbo(this, 150, 638, textureX, textureY); // Import Box165
		tailModel[19] = new ModelRendererTurbo(this, 150, 667, textureX, textureY); // Import Box166
		tailModel[20] = new ModelRendererTurbo(this, 150, 796, textureX, textureY); // Import Box167
		tailModel[21] = new ModelRendererTurbo(this, 150, 831, textureX, textureY); // Import Box168
		tailModel[22] = new ModelRendererTurbo(this, 150, 863, textureX, textureY); // Import Box169
		tailModel[23] = new ModelRendererTurbo(this, 150, 885, textureX, textureY); // Import Box170
		tailModel[24] = new ModelRendererTurbo(this, 150, 1102, textureX, textureY); // Import Box171
		tailModel[25] = new ModelRendererTurbo(this, 150, 1137, textureX, textureY); // Import Box172
		tailModel[26] = new ModelRendererTurbo(this, 150, 1173, textureX, textureY); // Import Box173
		tailModel[27] = new ModelRendererTurbo(this, 150, 1206, textureX, textureY); // Import Box174
		tailModel[28] = new ModelRendererTurbo(this, 150, 1235, textureX, textureY); // Import Box175
		tailModel[29] = new ModelRendererTurbo(this, 150, 1260, textureX, textureY); // Import Box176
		tailModel[30] = new ModelRendererTurbo(this, 150, 1260, textureX, textureY); // Import Box177
		tailModel[31] = new ModelRendererTurbo(this, 150, 1206, textureX, textureY); // Import Box178
		tailModel[32] = new ModelRendererTurbo(this, 150, 1235, textureX, textureY); // Import Box179
		tailModel[33] = new ModelRendererTurbo(this, 150, 1286, textureX, textureY); // Box 47
		tailModel[34] = new ModelRendererTurbo(this, 150, 1329, textureX, textureY); // Box 48
		tailModel[35] = new ModelRendererTurbo(this, 150, 1286, textureX, textureY); // Box 49
		tailModel[36] = new ModelRendererTurbo(this, 150, 1329, textureX, textureY); // Box 50
		tailModel[37] = new ModelRendererTurbo(this, 150, 1371, textureX, textureY); // Box 51
		tailModel[38] = new ModelRendererTurbo(this, 150, 1440, textureX, textureY); // Box 52
		tailModel[39] = new ModelRendererTurbo(this, 150, 1511, textureX, textureY); // Box 53
		tailModel[40] = new ModelRendererTurbo(this, 300, 373, textureX, textureY); // Box 279

		tailModel[0].addShapeBox(0F, 0F, 0F, 23, 5, 24, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box143
		tailModel[0].setRotationPoint(86F, -47F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 23, 5, 22, 0F, 0F, 0F, -6F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box144
		tailModel[1].setRotationPoint(86F, -52F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 23, 8, 24, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -0.5F); // Import Box149
		tailModel[2].setRotationPoint(86F, -42F, -12F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 23, 8, 24, 0F, 0F, 0F, -0.5F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box150
		tailModel[3].setRotationPoint(86F, -34F, -12F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 23, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box151
		tailModel[4].setRotationPoint(86F, -35F, -11.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 23, 8, 24, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F); // Import Box152
		tailModel[5].setRotationPoint(86F, -26F, -12F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 23, 5, 20, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F); // Import Box153
		tailModel[6].setRotationPoint(86F, -18F, -10F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 23, 2, 14, 0F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F); // Import Box154
		tailModel[7].setRotationPoint(86F, -54F, -7F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 29, 8, 24, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, -2.5F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, -1F, -2.5F); // Import Box155
		tailModel[8].setRotationPoint(109F, -42F, -12F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 29, 8, 24, 0F, 0F, -1F, -2.5F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, -1F, -2.5F, 0F, -1F, -1F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, -1F, -1F); // Import Box156
		tailModel[9].setRotationPoint(109F, -34F, -12F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 29, 2, 23, 0F, 0F, 0F, -2F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -2F); // Import Box157
		tailModel[10].setRotationPoint(109F, -35F, -11.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 29, 5, 24, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F); // Import Box158
		tailModel[11].setRotationPoint(109F, -47F, -12F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 29, 5, 22, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -1F); // Import Box159
		tailModel[12].setRotationPoint(109F, -52F, -11F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 23, 2, 14, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -3F); // Import Box160
		tailModel[13].setRotationPoint(86F, -56F, -7F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 29, 2, 14, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Import Box161
		tailModel[14].setRotationPoint(109F, -54F, -7F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 29, 2, 14, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, -2F); // Import Box162
		tailModel[15].setRotationPoint(109F, -56F, -7F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 29, 8, 24, 0F, 0F, 1F, -1F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 1F, -1F, 0F, -2F, -3F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -2F, -3F); // Import Box163
		tailModel[16].setRotationPoint(109F, -26F, -12F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 29, 5, 20, 0F, 0F, 2F, -1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, -1F, 0F, -2F, -6F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, -2F, -6F); // Import Box164
		tailModel[17].setRotationPoint(109F, -18F, -10F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 10, 6, 17, 0F, 0F, 0F, 0F, 0.3F, -1F, -0.5F, 0.3F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F); // Import Box165
		tailModel[18].setRotationPoint(138F, -37F, -8.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 10, 8, 24, 0F, 0F, 0F, -3F, 1.05F, -1F, -3F, 1.05F, -1F, -3F, 0F, 0F, -3F, 0F, -3F, -3.5F, 0.3F, -2F, -4F, 0.3F, -2F, -4F, 0F, -3F, -3.5F); // Import Box166
		tailModel[19].setRotationPoint(138F, -42F, -12F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 10, 5, 24, 0F, 0F, -1F, -3F, 1.8F, -1F, -3F, 1.8F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 1.05F, 1F, -3F, 1.05F, 1F, -3F, 0F, 0F, -3F); // Import Box167
		tailModel[20].setRotationPoint(138F, -47F, -12F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F, 0F, -2F, -4F, 2.25F, -3F, -3F, 2.25F, -3F, -3F, 0F, -2F, -4F, 0F, 1F, -2F, 1.8F, 1F, -2F, 1.8F, 1F, -2F, 0F, 1F, -2F); // Import Box168
		tailModel[21].setRotationPoint(138F, -52F, -11F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F, 0F, -2F, -2F, 2.7F, -2F, -2F, 2.7F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 0F, 2.25F, 3F, 1F, 2.25F, 3F, 1F, 0F, 2F, 0F); // Import Box169
		tailModel[22].setRotationPoint(138F, -54F, -7F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F, 0F, -3F, -5F, 2.85F, -3F, -5F, 2.85F, -3F, -5F, 0F, -3F, -5F, 0F, 2F, -2F, 2.7F, 2F, -2F, 2.7F, 2F, -2F, 0F, 2F, -2F); // Import Box170
		tailModel[23].setRotationPoint(138F, -56F, -7F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 8, 24, 0F, 0F, -3F, -3.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -3.5F, 0F, -4F, -3F, -0.6F, -4F, -3F, -0.6F, -4F, -3F, 0F, -4F, -3F); // Import Box171
		tailModel[24].setRotationPoint(138F, -34F, -12F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 10, 8, 24, 0F, 0F, 4F, -3F, -0.6F, 4F, -3F, -0.6F, 4F, -3F, 0F, 4F, -3F, 0F, -6F, -2F, -1.2F, -8F, -2F, -1.2F, -8F, -2F, 0F, -6F, -2F); // Import Box172
		tailModel[25].setRotationPoint(138F, -26F, -12F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 10, 5, 20, 0F, 0F, 6F, 0F, -1.2F, 8F, 0F, -1.2F, 8F, 0F, 0F, 6F, 0F, 0F, -2F, -5F, -2.55F, -4F, -6F, -2.55F, -4F, -6F, 0F, -2F, -5F); // Import Box173
		tailModel[26].setRotationPoint(138F, -18F, -10F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		tailModel[27].setRotationPoint(145F, -29F, -8F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		tailModel[28].setRotationPoint(145F, -34F, -8F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box176
		tailModel[29].setRotationPoint(145F, -23F, -8F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box177
		tailModel[30].setRotationPoint(145F, -41F, -8F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		tailModel[31].setRotationPoint(145F, -47F, -8F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		tailModel[32].setRotationPoint(145F, -52F, -8F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 43, 2, 35, 0F, -49F, -1F, 0F, 0F, -1F, -24F, -14F, -1F, 0F, 0F, 0F, 0F, -49F, 0F, 0F, 0F, 0F, -24F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 47
		tailModel[33].setRotationPoint(109F, -22F, -44F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 14, 2, 35, 0F, -57F, -1F, 0F, 49F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -57F, 0F, 0F, 49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[34].setRotationPoint(95F, -22F, -44F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 43, 2, 35, 0F, 0F, 0F, 0F, -14F, -1F, 0F, 0F, -1F, -24F, -49F, -1F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, -24F, -49F, 0F, 0F); // Box 49
		tailModel[35].setRotationPoint(109F, -22F, 9F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 14, 2, 35, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 49F, -1F, 0F, -57F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 49F, 0F, 0F, -57F, 0F, 0F); // Box 50
		tailModel[36].setRotationPoint(95F, -22F, 9F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 60, 59, 4, 0F, -59F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -59F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[37].setRotationPoint(89F, -111F, -2F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 6, 59, 4, 0F, -61F, 0F, -0.5F, 59F, 0F, 0F, 59F, 0F, 0F, -61F, 0F, -0.5F, 6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -0.5F); // Box 52
		tailModel[38].setRotationPoint(83F, -111F, -2F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 3, 59, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 9F, 0F, 0F); // Box 53
		tailModel[39].setRotationPoint(149F, -111F, -2F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 39, 59, 4, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 279
		tailModel[40].setRotationPoint(108F, -111F, -2F);


		leftWingModel = new ModelRendererTurbo[27];
		leftWingModel[0] = new ModelRendererTurbo(this, 150, 1578, textureX, textureY); // Import Box180
		leftWingModel[1] = new ModelRendererTurbo(this, 150, 1684, textureX, textureY); // Import Box181
		leftWingModel[2] = new ModelRendererTurbo(this, 150, 1790, textureX, textureY); // Import Box182
		leftWingModel[3] = new ModelRendererTurbo(this, 150, 1894, textureX, textureY); // Box 0
		leftWingModel[4] = new ModelRendererTurbo(this, 150, 1913, textureX, textureY); // Box 1
		leftWingModel[5] = new ModelRendererTurbo(this, 150, 1913, textureX, textureY); // Box 3
		leftWingModel[6] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 4
		leftWingModel[7] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 5
		leftWingModel[8] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 6
		leftWingModel[9] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 7
		leftWingModel[10] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 8
		leftWingModel[11] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 9
		leftWingModel[12] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 10
		leftWingModel[13] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 11
		leftWingModel[14] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 12
		leftWingModel[15] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 13
		leftWingModel[16] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 14
		leftWingModel[17] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 15
		leftWingModel[18] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 16
		leftWingModel[19] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 17
		leftWingModel[20] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 18
		leftWingModel[21] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 19
		leftWingModel[22] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 20
		leftWingModel[23] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 21
		leftWingModel[24] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 22
		leftWingModel[25] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 23
		leftWingModel[26] = new ModelRendererTurbo(this, 300, 344, textureX, textureY); // Box 277

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 133, 8, 91, 0F, -138F, -14F, 0F, 9F, -11F, -43F, -49F, -6F, 0F, 0F, 0F, 0F, -138F, 7F, 0F, 9F, 4F, -43F, -49F, -1F, 0F, 0F, 0F, 0F); // Import Box180
		leftWingModel[0].setRotationPoint(-39F, -42F, -102F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 21, 8, 91, 0F, -148F, -14F, 0F, 136F, -14F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -148F, 7F, 0F, 136F, 7F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Import Box181
		leftWingModel[1].setRotationPoint(-58F, -42F, -102F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 91, 0F, -156F, -14.5F, 0F, 147F, -14F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, -156F, 7F, 0F, 147F, 7F, 0F, -1F, -1F, 0F, 0F, -3F, 0F); // Import Box182
		leftWingModel[2].setRotationPoint(-69F, -42F, -102F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 50, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[3].setRotationPoint(-19F, -46F, -19F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 12, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		leftWingModel[4].setRotationPoint(-31F, -46F, -19F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 12, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 3
		leftWingModel[5].setRotationPoint(31F, -46F, -19F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F); // Box 4
		leftWingModel[6].setRotationPoint(-50F, -50.5F, -18F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F, 0F, 0F, 0F, -8F, -2F, 0F); // Box 5
		leftWingModel[7].setRotationPoint(-50F, -50.5F, -23F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F, 0F, 0F, 0F, -8F, -2F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingModel[8].setRotationPoint(-50F, -55.5F, -23F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F); // Box 7
		leftWingModel[9].setRotationPoint(-50F, -55.5F, -18F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[10].setRotationPoint(-33F, -56.5F, -25F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9
		leftWingModel[11].setRotationPoint(-33F, -50.5F, -25F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F); // Box 10
		leftWingModel[12].setRotationPoint(-33F, -50.5F, -18F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 11
		leftWingModel[13].setRotationPoint(-33F, -56.5F, -18F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftWingModel[14].setRotationPoint(-10F, -56.5F, -25F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftWingModel[15].setRotationPoint(-10F, -50.5F, -25F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 14
		leftWingModel[16].setRotationPoint(-10F, -50.5F, -18F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftWingModel[17].setRotationPoint(-10F, -56.5F, -18F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftWingModel[18].setRotationPoint(13F, -56.5F, -25F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		leftWingModel[19].setRotationPoint(13F, -50.5F, -25F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 18
		leftWingModel[20].setRotationPoint(13F, -56.5F, -18F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F); // Box 19
		leftWingModel[21].setRotationPoint(13F, -50.5F, -18F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftWingModel[22].setRotationPoint(41F, -55.5F, -23F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F, -8F, -2F, 0F, 0F, 0F, 0F); // Box 21
		leftWingModel[23].setRotationPoint(41F, -50.5F, -23F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F); // Box 22
		leftWingModel[24].setRotationPoint(41F, -50.5F, -18F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F); // Box 23
		leftWingModel[25].setRotationPoint(41F, -55.5F, -18F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 24, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		leftWingModel[26].setRotationPoint(62F, -31.85F, -77F);
		leftWingModel[26].rotateAngleX = 0.07853982F;
		leftWingModel[26].rotateAngleZ = -0.05235988F;


		rightWingModel = new ModelRendererTurbo[27];
		rightWingModel[0] = new ModelRendererTurbo(this, 150, 1578, textureX, textureY); // Import Box183
		rightWingModel[1] = new ModelRendererTurbo(this, 150, 1684, textureX, textureY); // Import Box184
		rightWingModel[2] = new ModelRendererTurbo(this, 150, 1790, textureX, textureY); // Import Box185
		rightWingModel[3] = new ModelRendererTurbo(this, 150, 1894, textureX, textureY); // Box 24
		rightWingModel[4] = new ModelRendererTurbo(this, 150, 1913, textureX, textureY); // Box 25
		rightWingModel[5] = new ModelRendererTurbo(this, 150, 1913, textureX, textureY); // Box 26
		rightWingModel[6] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 27
		rightWingModel[7] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 28
		rightWingModel[8] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 29
		rightWingModel[9] = new ModelRendererTurbo(this, 150, 1931, textureX, textureY); // Box 30
		rightWingModel[10] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 31
		rightWingModel[11] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 32
		rightWingModel[12] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 33
		rightWingModel[13] = new ModelRendererTurbo(this, 150, 1948, textureX, textureY); // Box 34
		rightWingModel[14] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 35
		rightWingModel[15] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 36
		rightWingModel[16] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 37
		rightWingModel[17] = new ModelRendererTurbo(this, 150, 1967, textureX, textureY); // Box 38
		rightWingModel[18] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 39
		rightWingModel[19] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 40
		rightWingModel[20] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 41
		rightWingModel[21] = new ModelRendererTurbo(this, 150, 1984, textureX, textureY); // Box 42
		rightWingModel[22] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 43
		rightWingModel[23] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 44
		rightWingModel[24] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 45
		rightWingModel[25] = new ModelRendererTurbo(this, 150, 2000, textureX, textureY); // Box 46
		rightWingModel[26] = new ModelRendererTurbo(this, 300, 344, textureX, textureY); // Box 278

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 133, 8, 91, 0F, 0F, 0F, 0F, -49F, -6F, 0F, 9F, -11F, -43F, -138F, -14F, 0F, 0F, 0F, 0F, -49F, -1F, 0F, 9F, 4F, -43F, -138F, 7F, 0F); // Import Box183
		rightWingModel[0].setRotationPoint(-39F, -42F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 21, 8, 91, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 136F, -14F, 0F, -148F, -14F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 136F, 7F, 0F, -148F, 7F, 0F); // Import Box184
		rightWingModel[1].setRotationPoint(-58F, -42F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 91, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 147F, -14F, 0F, -156F, -14.5F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 147F, 7F, 0F, -156F, 7F, 0F); // Import Box185
		rightWingModel[2].setRotationPoint(-69F, -42F, 11F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 50, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[3].setRotationPoint(-19F, -46F, 16F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 12, 10, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 25
		rightWingModel[4].setRotationPoint(-31F, -46F, 16F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 12, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 26
		rightWingModel[5].setRotationPoint(31F, -46F, 16F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F, 0F, 0F, 0F, -8F, -2F, 0F); // Box 27
		rightWingModel[6].setRotationPoint(-50F, -50.5F, 13F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F); // Box 28
		rightWingModel[7].setRotationPoint(-50F, -50.5F, 18F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F); // Box 29
		rightWingModel[8].setRotationPoint(-50F, -55.5F, 18F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 5, 5, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F, 0F, 0F, 0F, -8F, -2F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightWingModel[9].setRotationPoint(-50F, -55.5F, 13F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 31
		rightWingModel[10].setRotationPoint(-33F, -56.5F, 18F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F); // Box 32
		rightWingModel[11].setRotationPoint(-33F, -50.5F, 18F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 33
		rightWingModel[12].setRotationPoint(-33F, -50.5F, 11F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightWingModel[13].setRotationPoint(-33F, -56.5F, 11F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightWingModel[14].setRotationPoint(-10F, -56.5F, 18F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 36
		rightWingModel[15].setRotationPoint(-10F, -50.5F, 18F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightWingModel[16].setRotationPoint(-10F, -50.5F, 11F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 23, 6, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightWingModel[17].setRotationPoint(-10F, -56.5F, 11F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		rightWingModel[18].setRotationPoint(13F, -56.5F, 18F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.6F, -3.6F, 0F, -2F, -2F); // Box 40
		rightWingModel[19].setRotationPoint(13F, -50.5F, 18F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		rightWingModel[20].setRotationPoint(13F, -56.5F, 11F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 28, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.6F, -3.6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 42
		rightWingModel[21].setRotationPoint(13F, -50.5F, 11F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F); // Box 43
		rightWingModel[22].setRotationPoint(41F, -55.5F, 18F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -10F, -2F, -2F, 0F, -1.6F, -1.6F); // Box 44
		rightWingModel[23].setRotationPoint(41F, -50.5F, 18F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F, -8F, -2F, 0F, 0F, 0F, 0F); // Box 45
		rightWingModel[24].setRotationPoint(41F, -50.5F, 13F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F, 0F, -1.6F, -1.6F, -10F, -2F, -2F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightWingModel[25].setRotationPoint(41F, -55.5F, 13F);
		
		rightWingModel[26].addShapeBox(0F, 0F, -24F, 24, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightWingModel[26].setRotationPoint(62F, -32F, 77F);
		rightWingModel[26].rotateAngleX = -0.07853982F;
		rightWingModel[26].rotateAngleZ = -0.06108652F;


		doorAnimModel = new ModelRendererTurbo[11];
		doorAnimModel[0] = new ModelRendererTurbo(this, 300, 167, textureX, textureY); // Box 85
		doorAnimModel[1] = new ModelRendererTurbo(this, 300, 188, textureX, textureY); // Box 86
		doorAnimModel[2] = new ModelRendererTurbo(this, 300, 216, textureX, textureY); // Box 87
		doorAnimModel[3] = new ModelRendererTurbo(this, 300, 235, textureX, textureY); // Box 88
		doorAnimModel[4] = new ModelRendererTurbo(this, 300, 259, textureX, textureY); // Box 89
		doorAnimModel[5] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Box 90
		doorAnimModel[6] = new ModelRendererTurbo(this, 300, 309, textureX, textureY); // Box 91
		doorAnimModel[7] = new ModelRendererTurbo(this, 300, 322, textureX, textureY); // Box 92
		doorAnimModel[8] = new ModelRendererTurbo(this, 300, 332, textureX, textureY); // Box 93
		doorAnimModel[9] = new ModelRendererTurbo(this, 300, 322, textureX, textureY); // Box 94
		doorAnimModel[10] = new ModelRendererTurbo(this, 300, 309, textureX, textureY); // Box 95

		doorAnimModel[0].addShapeBox(-5F, -1F, -5F, 5, 5, 10, 0F, 0F, 2F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 2F, -3F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F); // Box 85
		doorAnimModel[0].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[1].addShapeBox(-10F, -3F, -6.5F, 5, 10, 13, 0F, 0F, 1F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1F, -4.5F, 0F, -5F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -5F, -1F); // Box 86
		doorAnimModel[1].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[2].addShapeBox(-5F, 4F, -4.5F, 5, 3, 9, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 87
		doorAnimModel[2].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[3].addShapeBox(-10F, 3F, -6.5F, 5, 4, 13, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 88
		doorAnimModel[3].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[4].addShapeBox(-20F, 2F, -6.5F, 10, 7, 13, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 89
		doorAnimModel[4].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[5].addShapeBox(-20F, -4F, -5.5F, 10, 6, 11, 0F, 0F, -1F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 90
		doorAnimModel[5].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[6].addShapeBox(-22F, 2F, -7F, 2, 7, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		doorAnimModel[6].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[7].addShapeBox(-22F, -3F, -5F, 2, 5, 1, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		doorAnimModel[7].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[8].addShapeBox(-22F, -4F, -2.5F, 2, 1, 5, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		doorAnimModel[8].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[9].addShapeBox(-22F, -3F, 4F, 2, 5, 1, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		doorAnimModel[9].setRotationPoint(0F, 0F, 0F);

		doorAnimModel[10].addShapeBox(-22F, 2F, 6F, 2, 7, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		doorAnimModel[10].setRotationPoint(0F, 0F, 0F);
		
		doorAttach = new Vector3f(-59F/16F, 60F/16F, 0F);



		bodyAnimWheelModel = new ModelRendererTurbo[8];
		bodyAnimWheelModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Box 100
		bodyAnimWheelModel[1] = new ModelRendererTurbo(this, 300, 18, textureX, textureY); // Box 101
		bodyAnimWheelModel[2] = new ModelRendererTurbo(this, 300, 28, textureX, textureY); // Box 102
		bodyAnimWheelModel[3] = new ModelRendererTurbo(this, 300, 37, textureX, textureY); // Box 103
		bodyAnimWheelModel[4] = new ModelRendererTurbo(this, 300, 46, textureX, textureY); // Box 104
		bodyAnimWheelModel[5] = new ModelRendererTurbo(this, 300, 58, textureX, textureY); // Box 105
		bodyAnimWheelModel[6] = new ModelRendererTurbo(this, 300, 58, textureX, textureY); // Box 106
		bodyAnimWheelModel[7] = new ModelRendererTurbo(this, 300, 65, textureX, textureY); // Box 107

		bodyAnimWheelModel[0].addShapeBox(-2F, 0F, -1F, 2, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyAnimWheelModel[0].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[1].addShapeBox(-2F, 13F, -1F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyAnimWheelModel[1].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[2].addShapeBox(-2F, 17F, -1F, 12, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyAnimWheelModel[2].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[3].addShapeBox(-2F, 21F, -1F, 12, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 103
		bodyAnimWheelModel[3].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[4].addShapeBox(-2F, 13F, -1F, 12, 4, 2, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyAnimWheelModel[4].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[5].addShapeBox(-1F, 13F, -3F, 5, 2, 2, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 105
		bodyAnimWheelModel[5].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[6].addShapeBox(-1F, 13F, 1F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -0.5F, 0F, 0F, -0.5F); // Box 106
		bodyAnimWheelModel[6].setRotationPoint(0F, 0F, 0F);

		bodyAnimWheelModel[7].addShapeBox(-2.5F, 6F, -1.5F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyAnimWheelModel[7].setRotationPoint(0F, 0F, 0F);

		bodyWheelAttach = new Vector3f(-85F/16F, 15F/16F, 0F);

		leftAnimWingWheelModel = new ModelRendererTurbo[5];
		leftAnimWingWheelModel[0] = new ModelRendererTurbo(this, 300, 77, textureX, textureY); // Box 108
		leftAnimWingWheelModel[1] = new ModelRendererTurbo(this, 300, 108, textureX, textureY); // Box 109
		leftAnimWingWheelModel[2] = new ModelRendererTurbo(this, 300, 129, textureX, textureY); // Box 110
		leftAnimWingWheelModel[3] = new ModelRendererTurbo(this, 300, 141, textureX, textureY); // Box 111
		leftAnimWingWheelModel[4] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Box 112


		leftAnimWingWheelModel[0].addShapeBox(1F, 0F, 0F, 2, 23, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftAnimWingWheelModel[0].setRotationPoint(0F, 0F, 0F);

		leftAnimWingWheelModel[1].addShapeBox(1F, 20F, 2F, 2, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftAnimWingWheelModel[1].setRotationPoint(0F, 0F, 0F);

		leftAnimWingWheelModel[2].addShapeBox(-7F, 24F, -1F, 18, 6, 3, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftAnimWingWheelModel[2].setRotationPoint(0F, 0F, 0F);

		leftAnimWingWheelModel[3].addShapeBox(-7F, 30F, -1F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftAnimWingWheelModel[3].setRotationPoint(0F, 0F, 0F);

		leftAnimWingWheelModel[4].addShapeBox(-7F, 36F, -1F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 112
		leftAnimWingWheelModel[4].setRotationPoint(0F, 0F, 0F);
		
		leftWingWheelAttach = new Vector3f(27F/16F, 32.5F/16F, -38F/16F);


		rightAnimWingWheelModel = new ModelRendererTurbo[5];
		rightAnimWingWheelModel[0] = new ModelRendererTurbo(this, 300, 129, textureX, textureY); // Box 113
		rightAnimWingWheelModel[1] = new ModelRendererTurbo(this, 300, 77, textureX, textureY); // Box 114
		rightAnimWingWheelModel[2] = new ModelRendererTurbo(this, 300, 108, textureX, textureY); // Box 115
		rightAnimWingWheelModel[3] = new ModelRendererTurbo(this, 300, 141, textureX, textureY); // Box 116
		rightAnimWingWheelModel[4] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Box 117


		rightAnimWingWheelModel[0].addShapeBox(-11F, 24F, -1F, 18, 6, 3, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		rightAnimWingWheelModel[0].setRotationPoint(0F, 0F, 0F);
		rightAnimWingWheelModel[0].rotateAngleY = -3.14159265F;

		rightAnimWingWheelModel[1].addShapeBox(-3F, 0F, 0F, 2, 23, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		rightAnimWingWheelModel[1].setRotationPoint(0F, 0F, 0F);
		rightAnimWingWheelModel[1].rotateAngleY = -3.14159265F;

		rightAnimWingWheelModel[2].addShapeBox(-3F, 20F, 2F, 2, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		rightAnimWingWheelModel[2].setRotationPoint(0F, 0F, 0F);
		rightAnimWingWheelModel[2].rotateAngleY = -3.14159265F;

		rightAnimWingWheelModel[3].addShapeBox(-11F, 30F, -1F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		rightAnimWingWheelModel[3].setRotationPoint(0F, 0F, 0F);
		rightAnimWingWheelModel[3].rotateAngleY = -3.14159265F;

		rightAnimWingWheelModel[4].addShapeBox(-11F, 36F, -1F, 18, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 117
		rightAnimWingWheelModel[4].setRotationPoint(0F, 0F, 0F);
		rightAnimWingWheelModel[4].rotateAngleY = -3.14159265F; 	

		rightWingWheelAttach = new Vector3f(27F/16F, 32.5F/16F, 38F/16F);



		
		
		
		
		
		
		
		translateAll(0F, 0F, 0F);


		flipAll();
	}
}