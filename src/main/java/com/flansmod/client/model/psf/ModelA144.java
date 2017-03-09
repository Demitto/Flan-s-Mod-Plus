//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelA144 extends ModelPlane
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelA144()
	{
		bodyModel = new ModelRendererTurbo[158];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 765, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 765, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 20, 910, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1031, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1076, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1076, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 30, 1120, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 30, 1120, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 13, 1120, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 50, 1120, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1320, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1520, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1660, textureX, textureY); // Box 62
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1748, textureX, textureY); // Box 63
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1820, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1660, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1748, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1820, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 400, 670, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Box 81
		bodyModel[61] = new ModelRendererTurbo(this, 400, 1000, textureX, textureY); // Box 7
		bodyModel[62] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Box 8
		bodyModel[63] = new ModelRendererTurbo(this, 400, 1190, textureX, textureY); // Box 9
		bodyModel[64] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Box 10
		bodyModel[65] = new ModelRendererTurbo(this, 400, 1190, textureX, textureY); // Box 11
		bodyModel[66] = new ModelRendererTurbo(this, 400, 1270, textureX, textureY); // Box 14
		bodyModel[67] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // Box 15
		bodyModel[68] = new ModelRendererTurbo(this, 400, 1355, textureX, textureY); // Box 16
		bodyModel[69] = new ModelRendererTurbo(this, 400, 1355, textureX, textureY); // Box 17
		bodyModel[70] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // Box 18
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[72] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Box 25
		bodyModel[73] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 26
		bodyModel[74] = new ModelRendererTurbo(this, 400, 1445, textureX, textureY); // Box 27
		bodyModel[75] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 30
		bodyModel[76] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Box 31
		bodyModel[77] = new ModelRendererTurbo(this, 400, 1480, textureX, textureY); // Box 32
		bodyModel[78] = new ModelRendererTurbo(this, 400, 1505, textureX, textureY); // Box 33
		bodyModel[79] = new ModelRendererTurbo(this, 400, 1525, textureX, textureY); // Box 34
		bodyModel[80] = new ModelRendererTurbo(this, 400, 1540, textureX, textureY); // Box 35
		bodyModel[81] = new ModelRendererTurbo(this, 400, 1555, textureX, textureY); // Box 37
		bodyModel[82] = new ModelRendererTurbo(this, 400, 1190, textureX, textureY); // Box 38
		bodyModel[83] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Box 39
		bodyModel[84] = new ModelRendererTurbo(this, 400, 1000, textureX, textureY); // Box 40
		bodyModel[85] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Box 41
		bodyModel[86] = new ModelRendererTurbo(this, 400, 1190, textureX, textureY); // Box 42
		bodyModel[87] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // Box 43
		bodyModel[88] = new ModelRendererTurbo(this, 400, 1355, textureX, textureY); // Box 44
		bodyModel[89] = new ModelRendererTurbo(this, 400, 1270, textureX, textureY); // Box 45
		bodyModel[90] = new ModelRendererTurbo(this, 400, 1355, textureX, textureY); // Box 46
		bodyModel[91] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // Box 47
		bodyModel[92] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Box 48
		bodyModel[93] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 49
		bodyModel[94] = new ModelRendererTurbo(this, 400, 1445, textureX, textureY); // Box 50
		bodyModel[95] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 51
		bodyModel[96] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Box 52
		bodyModel[97] = new ModelRendererTurbo(this, 400, 1525, textureX, textureY); // Box 53
		bodyModel[98] = new ModelRendererTurbo(this, 400, 1505, textureX, textureY); // Box 54
		bodyModel[99] = new ModelRendererTurbo(this, 400, 1480, textureX, textureY); // Box 55
		bodyModel[100] = new ModelRendererTurbo(this, 400, 1540, textureX, textureY); // Box 56
		bodyModel[101] = new ModelRendererTurbo(this, 400, 1555, textureX, textureY); // Box 57
		bodyModel[102] = new ModelRendererTurbo(this, 400, 1570, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 400, 1570, textureX, textureY); // Box 1
		bodyModel[104] = new ModelRendererTurbo(this, 400, 1650, textureX, textureY); // Box 2
		bodyModel[105] = new ModelRendererTurbo(this, 400, 1730, textureX, textureY); // Box 5
		bodyModel[106] = new ModelRendererTurbo(this, 400, 1730, textureX, textureY); // Box 6
		bodyModel[107] = new ModelRendererTurbo(this, 400, 1810, textureX, textureY); // Box 7
		bodyModel[108] = new ModelRendererTurbo(this, 400, 1840, textureX, textureY); // Box 8
		bodyModel[109] = new ModelRendererTurbo(this, 400, 1865, textureX, textureY); // Box 9
		bodyModel[110] = new ModelRendererTurbo(this, 400, 1865, textureX, textureY); // Box 10
		bodyModel[111] = new ModelRendererTurbo(this, 400, 1840, textureX, textureY); // Box 11
		bodyModel[112] = new ModelRendererTurbo(this, 400, 1885, textureX, textureY); // Box 13
		bodyModel[113] = new ModelRendererTurbo(this, 400, 1920, textureX, textureY); // Box 14
		bodyModel[114] = new ModelRendererTurbo(this, 400, 1950, textureX, textureY); // Box 15
		bodyModel[115] = new ModelRendererTurbo(this, 400, 1920, textureX, textureY); // Box 16
		bodyModel[116] = new ModelRendererTurbo(this, 400, 1950, textureX, textureY); // Box 17
		bodyModel[117] = new ModelRendererTurbo(this, 1000, 200, textureX, textureY); // Box 18
		bodyModel[118] = new ModelRendererTurbo(this, 1000, 390, textureX, textureY); // Box 19
		bodyModel[119] = new ModelRendererTurbo(this, 1000, 590, textureX, textureY); // Box 20
		bodyModel[120] = new ModelRendererTurbo(this, 1000, 770, textureX, textureY); // Box 22
		bodyModel[121] = new ModelRendererTurbo(this, 1000, 850, textureX, textureY); // Box 23
		bodyModel[122] = new ModelRendererTurbo(this, 1000, 950, textureX, textureY); // Box 24
		bodyModel[123] = new ModelRendererTurbo(this, 1000, 1030, textureX, textureY); // Box 25
		bodyModel[124] = new ModelRendererTurbo(this, 1000, 1110, textureX, textureY); // Box 26
		bodyModel[125] = new ModelRendererTurbo(this, 1000, 1140, textureX, textureY); // Box 27
		bodyModel[126] = new ModelRendererTurbo(this, 1000, 1200, textureX, textureY); // Box 28
		bodyModel[127] = new ModelRendererTurbo(this, 1000, 1200, textureX, textureY); // Box 29
		bodyModel[128] = new ModelRendererTurbo(this, 1000, 1240, textureX, textureY); // Box 30
		bodyModel[129] = new ModelRendererTurbo(this, 1000, 1310, textureX, textureY); // Box 31
		bodyModel[130] = new ModelRendererTurbo(this, 1000, 1310, textureX, textureY); // Box 32
		bodyModel[131] = new ModelRendererTurbo(this, 1000, 1310, textureX, textureY); // Box 33
		bodyModel[132] = new ModelRendererTurbo(this, 1000, 1240, textureX, textureY); // Box 34
		bodyModel[133] = new ModelRendererTurbo(this, 1000, 1310, textureX, textureY); // Box 35
		bodyModel[134] = new ModelRendererTurbo(this, 1000, 1200, textureX, textureY); // Box 36
		bodyModel[135] = new ModelRendererTurbo(this, 1000, 1140, textureX, textureY); // Box 37
		bodyModel[136] = new ModelRendererTurbo(this, 1000, 1200, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 1000, 1350, textureX, textureY); // Box 39
		bodyModel[138] = new ModelRendererTurbo(this, 1000, 1400, textureX, textureY); // Box 40
		bodyModel[139] = new ModelRendererTurbo(this, 1000, 1440, textureX, textureY); // Box 41
		bodyModel[140] = new ModelRendererTurbo(this, 1000, 1520, textureX, textureY); // Box 42
		bodyModel[141] = new ModelRendererTurbo(this, 1000, 1580, textureX, textureY); // Box 43
		bodyModel[142] = new ModelRendererTurbo(this, 1000, 1640, textureX, textureY); // Box 44
		bodyModel[143] = new ModelRendererTurbo(this, 1000, 1820, textureX, textureY); // Box 45
		bodyModel[144] = new ModelRendererTurbo(this, 1400, 200, textureX, textureY); // Box 46
		bodyModel[145] = new ModelRendererTurbo(this, 1400, 200, textureX, textureY); // Box 47
		bodyModel[146] = new ModelRendererTurbo(this, 1400, 320, textureX, textureY); // Box 59
		bodyModel[147] = new ModelRendererTurbo(this, 1400, 340, textureX, textureY); // Box 60
		bodyModel[148] = new ModelRendererTurbo(this, 1400, 350, textureX, textureY); // Box 61
		bodyModel[149] = new ModelRendererTurbo(this, 1400, 360, textureX, textureY); // Box 62
		bodyModel[150] = new ModelRendererTurbo(this, 1400, 350, textureX, textureY); // Box 63
		bodyModel[151] = new ModelRendererTurbo(this, 1400, 340, textureX, textureY); // Box 64
		bodyModel[152] = new ModelRendererTurbo(this, 1400, 320, textureX, textureY); // Box 65
		bodyModel[153] = new ModelRendererTurbo(this, 1400, 340, textureX, textureY); // Box 66
		bodyModel[154] = new ModelRendererTurbo(this, 1400, 340, textureX, textureY); // Box 67
		bodyModel[155] = new ModelRendererTurbo(this, 1400, 350, textureX, textureY); // Box 68
		bodyModel[156] = new ModelRendererTurbo(this, 1400, 360, textureX, textureY); // Box 69
		bodyModel[157] = new ModelRendererTurbo(this, 1400, 350, textureX, textureY); // Box 70

		bodyModel[0].addBox(0F, 0F, 0F, 4, 6, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-172F, -50F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 101, 6, 4, 0F, 0F, 0F, -2F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-172F, -50F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 66, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-71F, -50F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 66, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-71F, -50F, 18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 101, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, -2F); // Box 5
		bodyModel[4].setRotationPoint(-172F, -50F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 77, 20, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-5F, -50F, -22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 40, 20, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-1F, -70F, -22F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 40, 20, 44, 0F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-1F, -90F, -22F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 81, 10, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 2F, 0F, -8F); // Box 9
		bodyModel[8].setRotationPoint(-9F, -30F, -22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 50, 20, 34, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-51F, -70F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 54, 15, 34, 0F, 0F, -2F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-51F, -85F, -17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 54, 23, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 12
		bodyModel[11].setRotationPoint(-51F, -50F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 91, 8, 22, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F); // Box 13
		bodyModel[12].setRotationPoint(-142F, -50F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 91, 8, 22, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F); // Box 14
		bodyModel[13].setRotationPoint(-142F, -42F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 16, 4, 22, 0F); // Box 15
		bodyModel[14].setRotationPoint(-75F, -54F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-75F, -58F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 17
		bodyModel[16].setRotationPoint(-69F, -58F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-63F, -58F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-63F, -58F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 20
		bodyModel[19].setRotationPoint(-69F, -58F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-75F, -58F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 24, 22, 0F); // Box 22
		bodyModel[21].setRotationPoint(-59F, -74F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-61F, -74F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-61F, -74F, 9F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 11, 14, 0F); // Box 25
		bodyModel[24].setRotationPoint(-60F, -83F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 11, 14, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 26
		bodyModel[25].setRotationPoint(-61F, -83F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-57F, -80F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 20, 10, 0F); // Box 28
		bodyModel[27].setRotationPoint(-55F, -70F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 55, 15, 22, 0F, 0F, -12F, -7F, 0F, 0F, -2.17F, 0F, 0F, -2.17F, 0F, -12F, -7F, 0F, 0F, -4F, 0F, 0F, 0.83F, 0F, 0F, 0.83F, 0F, 0F, -4F); // Box 30
		bodyModel[28].setRotationPoint(-142F, -65F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-66F, -80F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[30].setRotationPoint(-66F, -80F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 33, 15, 4, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(-80F, -62F, -15F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 34
		bodyModel[32].setRotationPoint(-75F, -63F, -15F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 35
		bodyModel[33].setRotationPoint(-74F, -62.5F, -14.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 36
		bodyModel[34].setRotationPoint(-74F, -62.5F, -12.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 33, 15, 4, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-80F, -59F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-74F, -61F, 11F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 39
		bodyModel[37].setRotationPoint(-72.5F, -65F, 12.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 74, 15, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-70F, -46F, -20F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 61, 10, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 41
		bodyModel[39].setRotationPoint(-70F, -31F, -20F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 100, 13, 40, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -12F); // Box 42
		bodyModel[40].setRotationPoint(-170F, -44F, -20F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 95, 10, 40, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -10F, -12F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -10F, -12F); // Box 43
		bodyModel[41].setRotationPoint(-165F, -31F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 25, 20, 44, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 55
		bodyModel[42].setRotationPoint(39F, -70F, -22F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 25, 20, 44, 0F, 0F, 0F, -6F, 0F, -8F, -14F, 0F, -8F, -14F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 8F, -8F, 0F, 8F, -8F, 0F, 0F, 0F); // Box 56
		bodyModel[43].setRotationPoint(39F, -90F, -22F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 20, 28, 0F, 0F, 0F, -6F, 0F, -12F, -8F, 0F, -12F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(64F, -82F, -14F);

		bodyModel[45].addBox(0F, 0F, 0F, 67, 12, 28, 0F); // Box 59
		bodyModel[45].setRotationPoint(64F, -62F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 82, 8, 28, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(74F, -70F, -14F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 67, 21, 61, 0F, -18F, -8F, -20F, 0F, 0F, -18F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 62
		bodyModel[47].setRotationPoint(-3F, -62F, -90F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 67, 8, 61, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 63
		bodyModel[48].setRotationPoint(-3F, -41F, -90F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 60, 8, 54, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 64
		bodyModel[49].setRotationPoint(4F, -33F, -83F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 67, 6, 61, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 65
		bodyModel[50].setRotationPoint(-3F, -25F, -90F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 67, 16, 61, 0F, -8F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -18F, -4F, -20F, 0F, 0F, -10F, 0F, 0F, 0F, -8F, -4F, 0F); // Box 66
		bodyModel[51].setRotationPoint(-3F, -19F, -90F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 67, 21, 61, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -18F, -8F, -20F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F); // Box 72
		bodyModel[52].setRotationPoint(-3F, -62F, 29F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 67, 8, 61, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F); // Box 73
		bodyModel[53].setRotationPoint(-3F, -41F, 29F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 60, 8, 54, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F); // Box 74
		bodyModel[54].setRotationPoint(4F, -33F, 29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 67, 6, 61, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F); // Box 75
		bodyModel[55].setRotationPoint(-3F, -25F, 29F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 67, 16, 61, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -18F, -4F, -20F); // Box 76
		bodyModel[56].setRotationPoint(-3F, -19F, 29F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 127, 21, 180, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[57].setRotationPoint(64F, -62F, -90F);

		bodyModel[58].addBox(0F, 0F, 0F, 127, 22, 180, 0F); // Box 79
		bodyModel[58].setRotationPoint(64F, -41F, -90F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 123, 16, 180, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 80
		bodyModel[59].setRotationPoint(64F, -19F, -90F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 36, 59, 58, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F); // Box 81
		bodyModel[60].setRotationPoint(28F, -62F, -29F);

		bodyModel[61].addBox(0F, 0F, 0F, 72, 24, 64, 0F); // Box 7
		bodyModel[61].setRotationPoint(131F, -46F, -98F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 72, 16, 64, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[62].setRotationPoint(131F, -62F, -98F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 56, 8, 64, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[63].setRotationPoint(139F, -70F, -98F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 72, 16, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 10
		bodyModel[64].setRotationPoint(131F, -22F, -98F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 56, 7, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 11
		bodyModel[65].setRotationPoint(139F, -6F, -98F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 72, 24, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -8F, 0F, -16F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -8F, 0F, -16F, -8F, 0F); // Box 14
		bodyModel[66].setRotationPoint(131F, -46F, -34F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 56, 8, 20, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -24F, -20F, 0F, -24F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 16F, 0F, -16F, 16F, 0F); // Box 15
		bodyModel[67].setRotationPoint(139F, -70F, -34F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 72, 16, 20, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -24F, -16F, 0F, -24F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 8F, 0F, -16F, 8F, 0F); // Box 16
		bodyModel[68].setRotationPoint(131F, -62F, -34F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 72, 16, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 8F, 0F, -16F, 8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -24F, -16F, 0F, -24F, -16F, 0F); // Box 17
		bodyModel[69].setRotationPoint(131F, -22F, -34F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 56, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 16F, 0F, -16F, 16F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -24F, -20F, 0F, -24F, -20F, 0F); // Box 18
		bodyModel[70].setRotationPoint(139F, -6F, -34F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 56, 8, 0, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[71].setRotationPoint(139F, -70F, -98F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 56, 7, 4, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -3F, 0F, -20F, -3F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 25
		bodyModel[72].setRotationPoint(139F, -6F, -102F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 72, 16, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 26
		bodyModel[73].setRotationPoint(131F, -22F, -102F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 72, 24, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[74].setRotationPoint(131F, -46F, -102F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 72, 16, 4, 0F, -12F, -2F, 0F, -12F, -2F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[75].setRotationPoint(131F, -62F, -102F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 56, 7, 4, 0F, -20F, -3F, 0F, -20F, -3F, 0F, -16F, 1F, 0F, -16F, 1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[76].setRotationPoint(139F, -69F, -102F);

		bodyModel[77].addBox(0F, 0F, 0F, 54, 18, 2, 0F); // Box 32
		bodyModel[77].setRotationPoint(140F, -43F, -104F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 54, 12, 2, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[78].setRotationPoint(140F, -55F, -104F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 42, 6, 2, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[79].setRotationPoint(146F, -61F, -104F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 54, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 35
		bodyModel[80].setRotationPoint(140F, -25F, -104F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 42, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 37
		bodyModel[81].setRotationPoint(146F, -13F, -104F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 56, 8, 64, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[82].setRotationPoint(139F, -70F, 34F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 72, 16, 64, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[83].setRotationPoint(131F, -62F, 34F);

		bodyModel[84].addBox(0F, 0F, 0F, 72, 24, 64, 0F); // Box 40
		bodyModel[84].setRotationPoint(131F, -46F, 34F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 72, 16, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 41
		bodyModel[85].setRotationPoint(131F, -22F, 34F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 56, 7, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 42
		bodyModel[86].setRotationPoint(139F, -6F, 34F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 56, 7, 20, 0F, -16F, 16F, 0F, -16F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -20F, 0F, -24F, -20F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 43
		bodyModel[87].setRotationPoint(139F, -6F, 14F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 72, 16, 20, 0F, -16F, 8F, 0F, -16F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -16F, 0F, -24F, -16F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 44
		bodyModel[88].setRotationPoint(131F, -22F, 14F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 72, 24, 20, 0F, -16F, -8F, 0F, -16F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -8F, 0F, -16F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[89].setRotationPoint(131F, -46F, 14F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 72, 16, 20, 0F, -24F, -16F, 0F, -24F, -16F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -16F, 8F, 0F, -16F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[90].setRotationPoint(131F, -62F, 14F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 56, 8, 20, 0F, -24F, -20F, 0F, -24F, -20F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 16F, 0F, -16F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[91].setRotationPoint(139F, -70F, 14F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 56, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -20F, -3F, 0F, -20F, -3F, 0F); // Box 48
		bodyModel[92].setRotationPoint(139F, -6F, 98F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 72, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Box 49
		bodyModel[93].setRotationPoint(131F, -22F, 98F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 72, 24, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 50
		bodyModel[94].setRotationPoint(131F, -46F, 98F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 72, 16, 4, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 51
		bodyModel[95].setRotationPoint(131F, -62F, 98F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 56, 7, 4, 0F, -16F, 1F, 0F, -16F, 1F, 0F, -20F, -3F, 0F, -20F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F); // Box 52
		bodyModel[96].setRotationPoint(139F, -69F, 98F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 42, 6, 2, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[97].setRotationPoint(146F, -61F, 102F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 54, 12, 2, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[98].setRotationPoint(140F, -55F, 102F);

		bodyModel[99].addBox(0F, 0F, 0F, 54, 18, 2, 0F); // Box 55
		bodyModel[99].setRotationPoint(140F, -43F, 102F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 54, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 56
		bodyModel[100].setRotationPoint(140F, -25F, 102F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 42, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 57
		bodyModel[101].setRotationPoint(146F, -13F, 102F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 94, 16, 58, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(33F, -17F, -29F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 94, 16, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -4F, -16F, 0F, -4F, -16F, 0F, 0F, -16F); // Box 1
		bodyModel[103].setRotationPoint(33F, -1F, -29F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 16, 16, 58, 0F, 0F, 0F, -16F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F); // Box 2
		bodyModel[104].setRotationPoint(127F, -17F, -29F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 32, 16, 58, 0F, 0F, -4F, -24F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -4F, -24F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 5
		bodyModel[105].setRotationPoint(1F, -17F, -29F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 32, 16, 58, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, -24F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -4F, -24F); // Box 6
		bodyModel[106].setRotationPoint(1F, -1F, -29F);

		bodyModel[107].addBox(0F, 0F, 0F, 25, 5, 15, 0F); // Box 7
		bodyModel[107].setRotationPoint(-39F, -4.5F, -7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 25, 3, 15, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[108].setRotationPoint(-39F, -7.5F, -7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 25, 2, 11, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[109].setRotationPoint(-39F, -9.5F, -5.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 25, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 10
		bodyModel[110].setRotationPoint(-39F, 3.5F, -5.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 25, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 11
		bodyModel[111].setRotationPoint(-39F, 0.5F, -7.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 16, 7, 21, 0F); // Box 13
		bodyModel[112].setRotationPoint(-16F, -5.5F, -10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 16, 4, 21, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[113].setRotationPoint(-16F, -9.5F, -10.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 16, 3, 15, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[114].setRotationPoint(-16F, -12.5F, -7.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 16, 4, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 16
		bodyModel[115].setRotationPoint(-16F, 1.5F, -10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 16, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 17
		bodyModel[116].setRotationPoint(-16F, 5.5F, -7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 32, 26, 160, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 18
		bodyModel[117].setRotationPoint(189F, -62F, -80F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 32, 28, 160, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F); // Box 19
		bodyModel[118].setRotationPoint(189F, -30F, -80F);

		bodyModel[119].addBox(0F, 0F, 0F, 32, 6, 164, 0F); // Box 20
		bodyModel[119].setRotationPoint(189F, -36F, -82F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 94, 12, 58, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 22
		bodyModel[120].setRotationPoint(128F, -1F, -29F);

		bodyModel[121].addBox(0F, 0F, 0F, 7, 61, 26, 0F); // Box 23
		bodyModel[121].setRotationPoint(221F, -62F, -13F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 12, 58, 0F, 0F, 0F, -10F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -10F, 0F, 0F, -16F, 0F, -8F, -16F, 0F, -8F, -16F, 0F, 0F, -16F); // Box 24
		bodyModel[122].setRotationPoint(222F, -1F, -29F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 61, 14, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 25
		bodyModel[123].setRotationPoint(228F, -62F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 30, 8, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 26
		bodyModel[124].setRotationPoint(235F, -41F, -4F);

		bodyModel[125].addBox(0F, 0F, 0F, 32, 22, 32, 0F); // Box 27
		bodyModel[125].setRotationPoint(208F, -43F, -78F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[126].setRotationPoint(208F, -48F, -78F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 29
		bodyModel[127].setRotationPoint(208F, -21F, -78F);

		bodyModel[128].addBox(0F, 0F, 0F, 32, 34, 32, 0F); // Box 30
		bodyModel[128].setRotationPoint(208F, -49F, -43F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[129].setRotationPoint(208F, -54F, -43F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 32
		bodyModel[130].setRotationPoint(208F, -15F, -43F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[131].setRotationPoint(208F, -54F, 11F);

		bodyModel[132].addBox(0F, 0F, 0F, 32, 34, 32, 0F); // Box 34
		bodyModel[132].setRotationPoint(208F, -49F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 35
		bodyModel[133].setRotationPoint(208F, -15F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 36
		bodyModel[134].setRotationPoint(208F, -21F, 46F);

		bodyModel[135].addBox(0F, 0F, 0F, 32, 22, 32, 0F); // Box 37
		bodyModel[135].setRotationPoint(208F, -43F, 46F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 32, 5, 32, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[136].setRotationPoint(208F, -48F, 46F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 8, 28, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[137].setRotationPoint(156F, -70F, -14F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 68, 8, 28, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[138].setRotationPoint(160F, -70F, -14F);

		bodyModel[139].addBox(0F, 0F, 0F, 26, 53, 12, 0F); // Box 41
		bodyModel[139].setRotationPoint(203F, -115F, -6F);
		bodyModel[139].rotateAngleZ = -0.2443461F;

		bodyModel[140].addShapeBox(-11F, 13F, 0F, 10, 41, 12, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[140].setRotationPoint(204F, -115F, -6F);
		bodyModel[140].rotateAngleZ = -0.2443461F;

		bodyModel[141].addShapeBox(-25F, 29F, 0F, 14, 41, 12, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[141].setRotationPoint(204F, -115F, -6F);
		bodyModel[141].rotateAngleZ = -0.2443461F;

		bodyModel[142].addShapeBox(-3F, -132F, 0F, 26, 169, 10, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F); // Box 44
		bodyModel[142].setRotationPoint(203F, -115F, -5F);
		bodyModel[142].rotateAngleZ = -0.2443461F;

		bodyModel[143].addBox(19F, -74F, 0F, 2, 74, 6, 0F); // Box 45
		bodyModel[143].setRotationPoint(207F, -115F, -3F);
		bodyModel[143].rotateAngleZ = -0.2443461F;

		bodyModel[144].addShapeBox(0F, -6F, 0F, 50, 100, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F); // Box 46
		bodyModel[144].setRotationPoint(168F, -1F, -63F);
		bodyModel[144].rotateAngleX = -0.48869219F;

		bodyModel[145].addShapeBox(0F, -6F, 0F, 50, 100, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F); // Box 47
		bodyModel[145].setRotationPoint(168F, -1F, 55F);
		bodyModel[145].rotateAngleX = 0.48869219F;

		bodyModel[146].addBox(0F, 0F, 0F, 19, 2, 5, 0F); // Box 59
		bodyModel[146].setRotationPoint(-58F, -9.5F, -2.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[147].setRotationPoint(-58F, -9.5F, -5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[148].setRotationPoint(-58F, -7.5F, -7.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 19, 5, 2, 0F); // Box 62
		bodyModel[149].setRotationPoint(-58F, -4.5F, -7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[150].setRotationPoint(-58F, 1.5F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[151].setRotationPoint(-58F, 3.5F, -5.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 19, 2, 5, 0F); // Box 65
		bodyModel[152].setRotationPoint(-58F, 3.5F, -2.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 66
		bodyModel[153].setRotationPoint(-58F, -9.5F, 2.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 67
		bodyModel[154].setRotationPoint(-58F, 3.5F, 2.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 68
		bodyModel[155].setRotationPoint(-58F, 1.5F, 5.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 19, 5, 2, 0F); // Box 69
		bodyModel[156].setRotationPoint(-58F, -4.5F, 5.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 70
		bodyModel[157].setRotationPoint(-58F, -7.5F, 5.5F);


		bodyDoorOpenModel = new ModelRendererTurbo[11];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1400, 380, textureX, textureY); // Box 48
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1400, 410, textureX, textureY); // Box 49
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1400, 440, textureX, textureY); // Box 50
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 1400, 470, textureX, textureY); // Box 51
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 1400, 500, textureX, textureY); // Box 52
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 1400, 525, textureX, textureY); // Box 53
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 1400, 438, textureX, textureY); // Box 54
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 1400, 470, textureX, textureY); // Box 55
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 1400, 380, textureX, textureY); // Box 56
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 1400, 410, textureX, textureY); // Box 57
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 1400, 560, textureX, textureY); // Box 58

		bodyDoorOpenModel[0].addShapeBox(-66F, 0F, 16F, 74, 18, 4, 0F, 0F, -2F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 48
		bodyDoorOpenModel[0].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[1].addShapeBox(-66F, 18F, 16F, 74, 20, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyDoorOpenModel[1].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[2].addShapeBox(-158F, 2F, 16F, 92, 18, 4, 0F, 0F, -20F, 10F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -20F, -12F, 0F, 2F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -12F); // Box 50
		bodyDoorOpenModel[2].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[3].addShapeBox(-166F, 20F, 16F, 100, 18, 4, 0F, -8F, -2F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, -12F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 51
		bodyDoorOpenModel[3].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[3].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[4].addShapeBox(-158F, 2F, -6F, 92, 4, 12, 0F, 0F, -20F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 20F, 0F); // Box 52
		bodyDoorOpenModel[4].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[4].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[5].addShapeBox(-166F, 20F, -6F, 4, 18, 12, 0F, -8F, -2F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyDoorOpenModel[5].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[5].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[6].addShapeBox(-158F, 2F, -20F, 92, 18, 4, 0F, 0F, -20F, -12F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -20F, 10F, -2F, 2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 10F); // Box 54
		bodyDoorOpenModel[6].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[6].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[7].addShapeBox(-166F, 20F, -20F, 100, 18, 4, 0F, -8F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 10F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 55
		bodyDoorOpenModel[7].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[7].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[8].addShapeBox(-66F, 0F, -20F, 74, 18, 4, 0F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -2F, 6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 56
		bodyDoorOpenModel[8].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[8].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[9].addShapeBox(-66F, 18F, -20F, 74, 20, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyDoorOpenModel[9].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[9].rotateAngleZ = -0.34906585F;

		bodyDoorOpenModel[10].addShapeBox(-66F, 0F, -10F, 74, 4, 20, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 2F, 1.3F); // Box 58
		bodyDoorOpenModel[10].setRotationPoint(2F, -88F, 0F);
		bodyDoorOpenModel[10].rotateAngleZ = -0.34906585F;


		bodyDoorCloseModel = new ModelRendererTurbo[11];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1700, 600, textureX, textureY); // Box 44
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1700, 630, textureX, textureY); // Box 45
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1700, 660, textureX, textureY); // Box 46
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1700, 690, textureX, textureY); // Box 47
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 1400, 600, textureX, textureY); // Box 0
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 1400, 630, textureX, textureY); // Box 1
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 1400, 660, textureX, textureY); // Box 2
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 1400, 690, textureX, textureY); // Box 3
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 1400, 720, textureX, textureY); // Box 4
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 1400, 750, textureX, textureY); // Box 5
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 1400, 780, textureX, textureY); // Box 6

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 74, 20, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyDoorCloseModel[0].setRotationPoint(-70F, -70F, -20F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 74, 18, 4, 0F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -2F, 6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 45
		bodyDoorCloseModel[1].setRotationPoint(-70F, -88F, -20F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 100, 18, 4, 0F, -8F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 10F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 46
		bodyDoorCloseModel[2].setRotationPoint(-170F, -68F, -20F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 92, 18, 4, 0F, 0F, -20F, -12F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, -20F, 10F, -2F, 2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 10F); // Box 47
		bodyDoorCloseModel[3].setRotationPoint(-162F, -86F, -20F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 74, 20, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyDoorCloseModel[4].setRotationPoint(-70F, -70F, 16F);

		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 74, 18, 4, 0F, 0F, -2F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1
		bodyDoorCloseModel[5].setRotationPoint(-70F, -88F, 16F);

		bodyDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 100, 18, 4, 0F, -8F, -2F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, -12F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 2
		bodyDoorCloseModel[6].setRotationPoint(-170F, -68F, 16F);

		bodyDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 92, 18, 4, 0F, 0F, -20F, 10F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -20F, -12F, 0F, 2F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -12F); // Box 3
		bodyDoorCloseModel[7].setRotationPoint(-162F, -86F, 16F);

		bodyDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 74, 4, 20, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 2F, 1.3F); // Box 4
		bodyDoorCloseModel[8].setRotationPoint(-70F, -88F, -10F);

		bodyDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 92, 4, 12, 0F, 0F, -20F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 20F, 0F); // Box 5
		bodyDoorCloseModel[9].setRotationPoint(-162F, -86F, -6F);

		bodyDoorCloseModel[10].addShapeBox(0F, 0F, 0F, 4, 18, 12, 0F, -8F, -2F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyDoorCloseModel[10].setRotationPoint(-170F, -68F, -6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
