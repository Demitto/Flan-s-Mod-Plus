//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelHarrier extends ModelPlane
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelHarrier()
	{
		bodyModel = new ModelRendererTurbo[237];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Box32
		bodyModel[1] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import Box33
		bodyModel[2] = new ModelRendererTurbo(this, 0, 275, textureX, textureY); // Import Box35
		bodyModel[3] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box36
		bodyModel[4] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Import Box39
		bodyModel[5] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Import Box40
		bodyModel[6] = new ModelRendererTurbo(this, 0, 322, textureX, textureY); // Import Box41
		bodyModel[7] = new ModelRendererTurbo(this, 0, 336, textureX, textureY); // Import Box42
		bodyModel[8] = new ModelRendererTurbo(this, 0, 336, textureX, textureY); // Import Box43
		bodyModel[9] = new ModelRendererTurbo(this, 0, 322, textureX, textureY); // Import Box44
		bodyModel[10] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Import Box45
		bodyModel[11] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Box46
		bodyModel[12] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Box48
		bodyModel[13] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Box49
		bodyModel[14] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Box50
		bodyModel[15] = new ModelRendererTurbo(this, 0, 366, textureX, textureY); // Import Box51
		bodyModel[16] = new ModelRendererTurbo(this, 0, 366, textureX, textureY); // Import Box52
		bodyModel[17] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Import Box53
		bodyModel[18] = new ModelRendererTurbo(this, 0, 375, textureX, textureY); // Import Box54
		bodyModel[19] = new ModelRendererTurbo(this, 0, 384, textureX, textureY); // Import Box55
		bodyModel[20] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Import Box56
		bodyModel[21] = new ModelRendererTurbo(this, 0, 418, textureX, textureY); // Import Box57
		bodyModel[22] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import Box58
		bodyModel[23] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Import Box59
		bodyModel[24] = new ModelRendererTurbo(this, 0, 466, textureX, textureY); // Import Box60
		bodyModel[25] = new ModelRendererTurbo(this, 0, 476, textureX, textureY); // Import Box61
		bodyModel[26] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Box62
		bodyModel[27] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Box63
		bodyModel[28] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Box64
		bodyModel[29] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box65
		bodyModel[30] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import Box66
		bodyModel[31] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Box67
		bodyModel[32] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Box68
		bodyModel[33] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box69
		bodyModel[34] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box70
		bodyModel[35] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Import Box71
		bodyModel[36] = new ModelRendererTurbo(this, 0, 553, textureX, textureY); // Import Box73
		bodyModel[37] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Import Box74
		bodyModel[38] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box75
		bodyModel[39] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box76
		bodyModel[40] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box77
		bodyModel[41] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box78
		bodyModel[42] = new ModelRendererTurbo(this, 0, 594, textureX, textureY); // Import Box79
		bodyModel[43] = new ModelRendererTurbo(this, 0, 603, textureX, textureY); // Import Box80
		bodyModel[44] = new ModelRendererTurbo(this, 0, 594, textureX, textureY); // Import Box81
		bodyModel[45] = new ModelRendererTurbo(this, 0, 614, textureX, textureY); // Import Box82
		bodyModel[46] = new ModelRendererTurbo(this, 0, 614, textureX, textureY); // Import Box84
		bodyModel[47] = new ModelRendererTurbo(this, 0, 624, textureX, textureY); // Import Box85
		bodyModel[48] = new ModelRendererTurbo(this, 0, 642, textureX, textureY); // Import Box86
		bodyModel[49] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Import Box87
		bodyModel[50] = new ModelRendererTurbo(this, 0, 712, textureX, textureY); // Import Box88
		bodyModel[51] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box89
		bodyModel[52] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box90
		bodyModel[53] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Box91
		bodyModel[54] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box92
		bodyModel[55] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box93
		bodyModel[56] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Box94
		bodyModel[57] = new ModelRendererTurbo(this, 0, 757, textureX, textureY); // Import Box95
		bodyModel[58] = new ModelRendererTurbo(this, 0, 757, textureX, textureY); // Import Box96
		bodyModel[59] = new ModelRendererTurbo(this, 0, 754, textureX, textureY); // Import Box97
		bodyModel[60] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Box99
		bodyModel[61] = new ModelRendererTurbo(this, 0, 782, textureX, textureY); // Import Box100
		bodyModel[62] = new ModelRendererTurbo(this, 0, 815, textureX, textureY); // Import Box101
		bodyModel[63] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Import Box102
		bodyModel[64] = new ModelRendererTurbo(this, 0, 845, textureX, textureY); // Import Box103
		bodyModel[65] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Import Box104
		bodyModel[66] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import Box105
		bodyModel[67] = new ModelRendererTurbo(this, 0, 895, textureX, textureY); // Import Box106
		bodyModel[68] = new ModelRendererTurbo(this, 0, 895, textureX, textureY); // Import Box107
		bodyModel[69] = new ModelRendererTurbo(this, 0, 911, textureX, textureY); // Import Box108
		bodyModel[70] = new ModelRendererTurbo(this, 0, 942, textureX, textureY); // Import Box109
		bodyModel[71] = new ModelRendererTurbo(this, 0, 966, textureX, textureY); // Import Box111
		bodyModel[72] = new ModelRendererTurbo(this, 0, 974, textureX, textureY); // Import Box112
		bodyModel[73] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Box113
		bodyModel[74] = new ModelRendererTurbo(this, 0, 986, textureX, textureY); // Import Box114
		bodyModel[75] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box115
		bodyModel[76] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box116
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box117
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1012, textureX, textureY); // Import Box118
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1018, textureX, textureY); // Import Box119
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1025, textureX, textureY); // Import Box120
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1033, textureX, textureY); // Import Box121
		bodyModel[82] = new ModelRendererTurbo(this, 0, 966, textureX, textureY); // Import Box123
		bodyModel[83] = new ModelRendererTurbo(this, 0, 974, textureX, textureY); // Import Box124
		bodyModel[84] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Box125
		bodyModel[85] = new ModelRendererTurbo(this, 0, 986, textureX, textureY); // Import Box126
		bodyModel[86] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box127
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box128
		bodyModel[88] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box129
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1025, textureX, textureY); // Import Box130
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1033, textureX, textureY); // Import Box131
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1018, textureX, textureY); // Import Box132
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1012, textureX, textureY); // Import Box133
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1045, textureX, textureY); // Import Box134
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Import Box135
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1077, textureX, textureY); // Import Box136
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Import Box137
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box138
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1097, textureX, textureY); // Import Box139
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1097, textureX, textureY); // Import Box140
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1105, textureX, textureY); // Import Box141
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box142
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1117, textureX, textureY); // Import Box143
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box144
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import Box145
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Import Box0
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Import Box1
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1077, textureX, textureY); // Import Box2
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box3
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1097, textureX, textureY); // Import Box4
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1097, textureX, textureY); // Import Box5
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1105, textureX, textureY); // Import Box6
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1117, textureX, textureY); // Import Box7
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1111, textureX, textureY); // Import Box8
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box9
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Import Box10
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1162, textureX, textureY); // Import Box11
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Import Box12
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Import Box13
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box14
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1218, textureX, textureY); // Import Box16
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1248, textureX, textureY); // Import Box17
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1283, textureX, textureY); // Import Box18
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1320, textureX, textureY); // Import Box19
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1360, textureX, textureY); // Import Box20
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import Box21
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1432, textureX, textureY); // Import Box22
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1460, textureX, textureY); // Import Box23
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Import Box0
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1154, textureX, textureY); // Import Box1
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Import Box2
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1162, textureX, textureY); // Import Box3
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1482, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1487, textureX, textureY); // Box 1
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1487, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1482, textureX, textureY); // Box 3
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1492, textureX, textureY); // Box 4
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1503, textureX, textureY); // Box 5
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1515, textureX, textureY); // Box 6
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1524, textureX, textureY); // Box 7
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1535, textureX, textureY); // Box 8
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 9
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1568, textureX, textureY); // Box 10
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 11
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1592, textureX, textureY); // Box 12
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1602, textureX, textureY); // Box 13
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Box 21
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1524, textureX, textureY); // Box 22
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1535, textureX, textureY); // Box 23
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 24
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1602, textureX, textureY); // Box 25
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1592, textureX, textureY); // Box 26
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1618, textureX, textureY); // Box 27
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1635, textureX, textureY); // Box 28
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1652, textureX, textureY); // Box 29
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 30
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 31
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1692, textureX, textureY); // Box 32
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 33
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 34
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 35
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 36
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 37
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 38
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1635, textureX, textureY); // Box 39
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1652, textureX, textureY); // Box 40
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1692, textureX, textureY); // Box 41
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 42
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1618, textureX, textureY); // Box 43
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 44
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 45
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 46
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 47
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 48
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1702, textureX, textureY); // Box 49
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 50
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1733, textureX, textureY); // Box 51
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1748, textureX, textureY); // Box 52
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1757, textureX, textureY); // Box 53
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1764, textureX, textureY); // Box 54
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Box 55
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1764, textureX, textureY); // Box 56
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 57
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1795, textureX, textureY); // Box 58
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1802, textureX, textureY); // Box 59
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1813, textureX, textureY); // Box 60
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1733, textureX, textureY); // Box 61
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1757, textureX, textureY); // Box 62
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1748, textureX, textureY); // Box 63
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1777, textureX, textureY); // Box 64
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1795, textureX, textureY); // Box 65
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1802, textureX, textureY); // Box 66
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1813, textureX, textureY); // Box 67
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1764, textureX, textureY); // Box 68
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Box 69
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1764, textureX, textureY); // Box 70
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1820, textureX, textureY); // Box 71
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1835, textureX, textureY); // Box 72
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1847, textureX, textureY); // Box 74
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1887, textureX, textureY); // Box 75
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1924, textureX, textureY); // Box 76
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1961, textureX, textureY); // Box 77
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1995, textureX, textureY); // Box 78
		bodyModel[203] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 79
		bodyModel[204] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 80
		bodyModel[205] = new ModelRendererTurbo(this, 200, 6, textureX, textureY); // Box 81
		bodyModel[206] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 82
		bodyModel[207] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 83
		bodyModel[208] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 85
		bodyModel[209] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 86
		bodyModel[210] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 87
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1820, textureX, textureY); // Box 88
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1835, textureX, textureY); // Box 89
		bodyModel[213] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 90
		bodyModel[214] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 91
		bodyModel[215] = new ModelRendererTurbo(this, 200, 6, textureX, textureY); // Box 92
		bodyModel[216] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 93
		bodyModel[217] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 94
		bodyModel[218] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 95
		bodyModel[219] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 96
		bodyModel[220] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 97
		bodyModel[221] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 98
		bodyModel[222] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 99
		bodyModel[223] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 100
		bodyModel[224] = new ModelRendererTurbo(this, 200, 26, textureX, textureY); // Box 101
		bodyModel[225] = new ModelRendererTurbo(this, 200, 36, textureX, textureY); // Box 102
		bodyModel[226] = new ModelRendererTurbo(this, 200, 42, textureX, textureY); // Box 103
		bodyModel[227] = new ModelRendererTurbo(this, 200, 49, textureX, textureY); // Box 200
		bodyModel[228] = new ModelRendererTurbo(this, 200, 102, textureX, textureY); // Box 201
		bodyModel[229] = new ModelRendererTurbo(this, 200, 138, textureX, textureY); // Box 202
		bodyModel[230] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 203
		bodyModel[231] = new ModelRendererTurbo(this, 200, 194, textureX, textureY); // Box 204
		bodyModel[232] = new ModelRendererTurbo(this, 200, 102, textureX, textureY); // Box 205
		bodyModel[233] = new ModelRendererTurbo(this, 200, 138, textureX, textureY); // Box 206
		bodyModel[234] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 207
		bodyModel[235] = new ModelRendererTurbo(this, 200, 194, textureX, textureY); // Box 208
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1568, textureX, textureY); // Box 389

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 17, 7, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[0].setRotationPoint(-105F, -29F, -3.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 17, 5, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[1].setRotationPoint(-105F, -29F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 17, 5, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import Box35
		bodyModel[2].setRotationPoint(-105F, -29F, 3.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 11, 0F, 0F, -3.5F, -4F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, -3.5F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box36
		bodyModel[3].setRotationPoint(-105F, -33F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, -3F, 3, 1, 3, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box39
		bodyModel[4].setRotationPoint(-99F, -19F, -8.5F);
		bodyModel[4].rotateAngleX = 0.6981317F;

		bodyModel[5].addShapeBox(0F, -1F, 3F, 3, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box40
		bodyModel[5].setRotationPoint(-99F, -20F, 5.5F);
		bodyModel[5].rotateAngleX = -0.6981317F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import Box41
		bodyModel[6].setRotationPoint(-96F, -29F, -7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 3F, 0F, -2F, 3F); // Import Box42
		bodyModel[7].setRotationPoint(-96F, -17F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box43
		bodyModel[8].setRotationPoint(-96F, -17F, 6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 12, 1, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[9].setRotationPoint(-96F, -29F, 6.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 17, 2, 7, 0F); // Import Box45
		bodyModel[10].setRotationPoint(-96F, -14F, -3.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 1F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box46
		bodyModel[11].setRotationPoint(-96F, -31F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 1F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -4.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box48
		bodyModel[12].setRotationPoint(-96F, -31F, 6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[13].setRotationPoint(-81F, -31F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[14].setRotationPoint(-81F, -31F, 6.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Import Box51
		bodyModel[15].setRotationPoint(-81F, -37F, -7.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Import Box52
		bodyModel[16].setRotationPoint(-81F, -37F, 6.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 2F, 0F, -5F, -2F, 0F, -5F, -2F, -1F, 4F, 2F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[17].setRotationPoint(-81F, -43F, -7.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 2F, -1F, 4F, -2F, -1F, 4F, -2F, 0F, -5F, 2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[18].setRotationPoint(-81F, -43F, 6.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Import Box55
		bodyModel[19].setRotationPoint(-83F, -43F, -2.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 12, 13, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box56
		bodyModel[20].setRotationPoint(-96F, -29F, -6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 15, 2, 13, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box57
		bodyModel[21].setRotationPoint(-96F, -31F, -6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box58
		bodyModel[22].setRotationPoint(-83F, -17F, -6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 2, 9, 0F, -3F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box59
		bodyModel[23].setRotationPoint(-96F, -33F, -4.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Import Box60
		bodyModel[24].setRotationPoint(-81F, -33F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box61
		bodyModel[25].setRotationPoint(-79F, -33F, -3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[26].setRotationPoint(-82F, -37F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[27].setRotationPoint(-82F, -37F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[28].setRotationPoint(-81.5F, -37F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 12, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		bodyModel[29].setRotationPoint(-96F, -29F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[30].setRotationPoint(-96F, -29F, 7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Import Box67
		bodyModel[31].setRotationPoint(-81F, -29F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Import Box68
		bodyModel[32].setRotationPoint(-81F, -29F, 7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 19, 12, 2, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[33].setRotationPoint(-79F, -29F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 19, 12, 2, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[34].setRotationPoint(-79F, -29F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 19, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F, -1F, 3F, 0F, -2F, 3F); // Import Box71
		bodyModel[35].setRotationPoint(-79F, -17F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 19, 2, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[36].setRotationPoint(-79F, -14F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 19, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -1F, 3F, 0F, 1F, -5F, 0F, 0F, -5F); // Import Box74
		bodyModel[37].setRotationPoint(-79F, -17F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 0F, -1F, 0F, 7F, -1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[38].setRotationPoint(-79F, -31F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[39].setRotationPoint(-79F, -31F, 6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 19, 2, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[40].setRotationPoint(-60F, -36F, -8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 14, 19, 2, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[41].setRotationPoint(-60F, -36F, 6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F, -1F, 3F, 0F, -2F, 3F); // Import Box79
		bodyModel[42].setRotationPoint(-60F, -17F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box80
		bodyModel[43].setRotationPoint(-60F, -13F, -3.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -1F, 3F, 0F, 1F, -5F, 0F, 0F, -5F); // Import Box81
		bodyModel[44].setRotationPoint(-60F, -17F, 6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, -1F, 0F, 12F, -5F, 0F, 12F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, -4F); // Import Box82
		bodyModel[45].setRotationPoint(-60F, -38F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F, 0F, 0F, -4F, 0F, 12F, 0F, 0F, 12F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[46].setRotationPoint(-60F, -38F, 2.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box85
		bodyModel[47].setRotationPoint(-46F, -50F, -3.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 13, 23, 17, 0F); // Import Box86
		bodyModel[48].setRotationPoint(-46F, -40F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 7, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box87
		bodyModel[49].setRotationPoint(-46F, -17F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 10, 7, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box88
		bodyModel[50].setRotationPoint(-44F, -50F, -3.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 15, 6, 2, 0F); // Import Box89
		bodyModel[51].setRotationPoint(-72F, -23F, 5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box90
		bodyModel[52].setRotationPoint(-74F, -23F, 5.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box91
		bodyModel[53].setRotationPoint(-72F, -21F, 2.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 15, 6, 2, 0F); // Import Box92
		bodyModel[54].setRotationPoint(-72F, -23F, -7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box93
		bodyModel[55].setRotationPoint(-74F, -23F, -7.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box94
		bodyModel[56].setRotationPoint(-72F, -21F, -5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[57].setRotationPoint(-70F, -21F, 2.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box96
		bodyModel[58].setRotationPoint(-70F, -21F, -5.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 9, 3, 11, 0F); // Import Box97
		bodyModel[59].setRotationPoint(-69F, -21F, -5.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[60].setRotationPoint(-68F, -22F, -4.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 19, 11, 0F); // Import Box100
		bodyModel[61].setRotationPoint(-60F, -38F, -5.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box101
		bodyModel[62].setRotationPoint(-60F, -44F, -3.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		bodyModel[63].setRotationPoint(-59F, -44F, -3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box103
		bodyModel[64].setRotationPoint(-61F, -37F, -4.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box104
		bodyModel[65].setRotationPoint(-61F, -32F, -4.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box105
		bodyModel[66].setRotationPoint(-61F, -44F, -3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[67].setRotationPoint(-64F, -37F, 5.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		bodyModel[68].setRotationPoint(-64F, -37F, -6.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 11, 19, 11, 0F); // Import Box108
		bodyModel[69].setRotationPoint(-57F, -38F, -5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 21, 3, 19, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import Box109
		bodyModel[70].setRotationPoint(-54F, -48F, -9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -0.2F, 8F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import Box111
		bodyModel[71].setRotationPoint(-54F, -48F, -12.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -0.2F, -2F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -0.4F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.2F, 0F, 0F); // Import Box112
		bodyModel[72].setRotationPoint(-54F, -40F, -14.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -0.4F, -2F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, -0.2F, 0F, 0F, -0.6F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.4F, 0F, 0F); // Import Box113
		bodyModel[73].setRotationPoint(-54F, -38F, -16.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -0.6F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -0.4F, 0F, 0F, -0.9F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, -0.6F, 0F, 0F); // Import Box114
		bodyModel[74].setRotationPoint(-54F, -36F, -18.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 21, 6, 2, 0F, -1.0F, -4F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, -0.6F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F); // Import Box115
		bodyModel[75].setRotationPoint(-54F, -33F, -20.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 21, 6, 2, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.4F, -4F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, -1.8F, 0F, 0F); // Import Box116
		bodyModel[76].setRotationPoint(-54F, -27F, -20.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.7F, -3F, 0F, -1.8F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, -2.1F, 3F, 0F); // Import Box117
		bodyModel[77].setRotationPoint(-54F, -24F, -18.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.9F, -2F, 0F, -2.1F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, -2.3F, 2F, 0F); // Import Box118
		bodyModel[78].setRotationPoint(-54F, -21F, -16.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.1F, -2F, 0F, -2.3F, 0F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, -2.5F, 2F, 0F); // Import Box119
		bodyModel[79].setRotationPoint(-54F, -19F, -14.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F, -2.1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.3F, -2F, 0F, -2.5F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, -2.7F, 2F, 0F); // Import Box120
		bodyModel[80].setRotationPoint(-54F, -17F, -12.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 21, 3, 7, 0F, -2.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.3F, -1F, 0F, -2.7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2.7F, 1F, 0F); // Import Box121
		bodyModel[81].setRotationPoint(-54F, -15F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -0.2F, 8F, 0F); // Import Box123
		bodyModel[82].setRotationPoint(-54F, -48F, 9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.4F, 2F, 0F); // Import Box124
		bodyModel[83].setRotationPoint(-54F, -40F, 12.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -0.2F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.6F, 2F, 0F); // Import Box125
		bodyModel[84].setRotationPoint(-54F, -38F, 14.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -0.4F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.6F, -3F, 0F, -0.6F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, -0.9F, 3F, 0F); // Import Box126
		bodyModel[85].setRotationPoint(-54F, -36F, 16.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 21, 6, 2, 0F, -0.6F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, -1.0F, -4F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F); // Import Box127
		bodyModel[86].setRotationPoint(-54F, -33F, 18.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -1.7F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.1F, 3F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, -1.8F, 0F, 0F); // Import Box128
		bodyModel[87].setRotationPoint(-54F, -24F, 16.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 21, 6, 2, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.8F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, -1.4F, -4F, 0F); // Import Box129
		bodyModel[88].setRotationPoint(-54F, -27F, 18.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F, -2.3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2.1F, 0F, 0F, -2.7F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, -2.5F, 0F, 0F); // Import Box130
		bodyModel[89].setRotationPoint(-54F, -17F, 9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 21, 3, 7, 0F, -2.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, -2.7F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2.7F, 0F, 0F); // Import Box131
		bodyModel[90].setRotationPoint(-54F, -15F, 2.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -2.1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -2.5F, 2F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, -2.3F, 0F, 0F); // Import Box132
		bodyModel[91].setRotationPoint(-54F, -19F, 12.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, -1.9F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -2.3F, 2F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, -2.1F, 0F, 0F); // Import Box133
		bodyModel[92].setRotationPoint(-54F, -21F, 14.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 21, 3, 19, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box134
		bodyModel[93].setRotationPoint(-33F, -48F, -9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 3F, -5F, 0F, 0F, 3F, 0F, 0F, 0F); // Import Box135
		bodyModel[94].setRotationPoint(-33F, -48F, -12.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, -5F, 0F, 0F, 5F, 0F, 3F, 0F); // Import Box136
		bodyModel[95].setRotationPoint(-33F, -45F, -14.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, -5F, 0F, -1F, 5F, 0F, 2F, 0F); // Import Box137
		bodyModel[96].setRotationPoint(-33F, -42F, -16.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, -5F, 0F, -2F, 5F, 0F, 1F, 0F); // Import Box138
		bodyModel[97].setRotationPoint(-33F, -39F, -18.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -5F, 0F, -2F, 5F, 0F, 1F, 0F); // Import Box139
		bodyModel[98].setRotationPoint(-33F, -36F, -20.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F, 0F, 5F, 0F, 0F, 5F, -5F, 0F, -2F, 5F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import Box140
		bodyModel[99].setRotationPoint(-33F, -22F, -20.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 5F, 0F, 0F, 2F, -5F, 0F, -2F, 5F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import Box141
		bodyModel[100].setRotationPoint(-33F, -18F, -18.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 4F, 0F, 0F, 1F, -5F, 0F, -1F, 5F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import Box142
		bodyModel[101].setRotationPoint(-33F, -15F, -16.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 5F, 0F, 0F, 2F, -5F, 0F, 0F, 5F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -1F, 5F, 0F, -2F, 0F); // Import Box143
		bodyModel[102].setRotationPoint(-33F, -12F, -14.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F, 0F, 5F, 0F, 0F, 2F, -5F, 0F, 2F, 5F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -2F, 0F); // Import Box144
		bodyModel[103].setRotationPoint(-33F, -10F, -12.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 21, 3, 19, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box145
		bodyModel[104].setRotationPoint(-33F, -13F, -9.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 3F, -5F, 0F, 6F, 0F); // Import Box0
		bodyModel[105].setRotationPoint(-33F, -48F, 9.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 0F, 0F, 0F, 3F, 5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 5F, 0F, 1F, -5F, 0F, 4F, 0F); // Import Box1
		bodyModel[106].setRotationPoint(-33F, -42F, 14.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 0F, 0F, 0F, 3F, 5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 5F, 0F, 2F, -5F, 0F, 5F, 0F); // Import Box2
		bodyModel[107].setRotationPoint(-33F, -45F, 12.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 0F, 0F, 0F, 3F, 5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 5F, 0F, 2F, -5F, 0F, 5F, 0F); // Import Box3
		bodyModel[108].setRotationPoint(-33F, -39F, 16.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -2F, 5F, 0F, 5F, -5F, 0F, 5F, 0F); // Import Box4
		bodyModel[109].setRotationPoint(-33F, -36F, 18.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F, 0F, 1F, 0F, 0F, -2F, 5F, 0F, 5F, -5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -5F, -5F, 0F, -5F, 0F); // Import Box5
		bodyModel[110].setRotationPoint(-33F, -22F, 18.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 1F, 0F, 0F, -2F, 5F, 0F, 2F, -5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, -5F, 0F, -3F, 0F); // Import Box6
		bodyModel[111].setRotationPoint(-33F, -18F, 16.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 3F, 0F, 0F, 0F, 5F, 0F, 2F, -5F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -1F, 5F, 0F, -3F, -5F, 0F, -3F, 0F); // Import Box7
		bodyModel[112].setRotationPoint(-33F, -12F, 12.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, 2F, 0F, 0F, -1F, 5F, 0F, 1F, -5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, -5F, 0F, -3F, 0F); // Import Box8
		bodyModel[113].setRotationPoint(-33F, -15F, 14.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F, 0F, 3F, 0F, 0F, 2F, 5F, 0F, 2F, -5F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -3F, 0F); // Import Box9
		bodyModel[114].setRotationPoint(-33F, -10F, 9.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[115].setRotationPoint(-31F, -32F, -19F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[116].setRotationPoint(-31F, -32F, -20F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 17, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[117].setRotationPoint(-24F, -36F, -19F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 10, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[118].setRotationPoint(-24F, -36F, -20F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 68, 1, 15, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[119].setRotationPoint(-12F, -49F, -7.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 68, 6, 23, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[120].setRotationPoint(-12F, -48F, -11.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 26, 6, 27, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[121].setRotationPoint(-16F, -42F, -13.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 26, 5, 31, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[122].setRotationPoint(-16F, -36F, -15.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 26, 8, 31, 0F); // Import Box19
		bodyModel[123].setRotationPoint(-16F, -31F, -15.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 26, 5, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box20
		bodyModel[124].setRotationPoint(-16F, -23F, -15.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 68, 3, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box21
		bodyModel[125].setRotationPoint(-12F, -18F, -13.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 68, 3, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box22
		bodyModel[126].setRotationPoint(-12F, -15F, -11.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 68, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box23
		bodyModel[127].setRotationPoint(-12F, -12F, -9.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 17, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[128].setRotationPoint(-24F, -36F, 13F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[129].setRotationPoint(-31F, -32F, 16F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 17, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -3F, -1F, 0F, 0F, -2F, 0F); // Import Box2
		bodyModel[130].setRotationPoint(-24F, -36F, 19F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, -1F, -1F, 0F); // Import Box3
		bodyModel[131].setRotationPoint(-31F, -32F, 19F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[132].setRotationPoint(-37F, -48F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[133].setRotationPoint(-36F, -48F, -10.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[134].setRotationPoint(-36F, -48F, 9.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 3
		bodyModel[135].setRotationPoint(-37F, -48F, 9.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 11, 3, 7, 0F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 4
		bodyModel[136].setRotationPoint(-33F, -50F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 5
		bodyModel[137].setRotationPoint(-22F, -50F, -3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 68, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 6
		bodyModel[138].setRotationPoint(-12F, -50F, -3.5F);

		bodyModel[139].addShapeBox(0F, 0F, -8F, 10, 2, 8, 0F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[139].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[139].rotateAngleX = 0.2443461F;

		bodyModel[140].addShapeBox(0F, -1F, -8F, 10, 1, 14, 0F, -2F, 0F, -9F, 0F, -1F, -2F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -8F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 8
		bodyModel[140].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[140].rotateAngleX = 0.2443461F;

		bodyModel[141].addShapeBox(0F, 2F, -8F, 10, 1, 13, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 9
		bodyModel[141].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[141].rotateAngleX = 0.2443461F;

		bodyModel[142].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 10
		bodyModel[142].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[142].rotateAngleX = 0.2443461F;

		bodyModel[143].addShapeBox(10F, -1F, -8F, 20, 1, 14, 0F, 0F, -1F, -2F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[143].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[143].rotateAngleX = 0.2443461F;

		bodyModel[144].addShapeBox(10F, 1F, -8F, 20, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[144].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[144].rotateAngleX = 0.2443461F;

		bodyModel[145].addShapeBox(10F, 2F, -8F, 20, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[145].setRotationPoint(-31F, -46F, -12.5F);
		bodyModel[145].rotateAngleX = 0.2443461F;

		bodyModel[146].addShapeBox(0F, 2F, -5F, 10, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -9F); // Box 21
		bodyModel[146].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[146].rotateAngleX = -0.2443461F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 22
		bodyModel[147].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[147].rotateAngleX = -0.2443461F;

		bodyModel[148].addShapeBox(0F, -1F, -6F, 10, 1, 14, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, -2F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -8F); // Box 23
		bodyModel[148].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[148].rotateAngleX = -0.2443461F;

		bodyModel[149].addShapeBox(10F, -1F, -6F, 20, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, 0F); // Box 24
		bodyModel[149].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[149].rotateAngleX = -0.2443461F;

		bodyModel[150].addShapeBox(10F, 2F, -5F, 20, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F); // Box 25
		bodyModel[150].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[150].rotateAngleX = -0.2443461F;

		bodyModel[151].addShapeBox(10F, 1F, 0F, 20, 1, 8, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 26
		bodyModel[151].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[151].rotateAngleX = -0.2443461F;

		bodyModel[152].addBox(0F, 0F, 0F, 9, 10, 6, 0F); // Box 27
		bodyModel[152].setRotationPoint(-3F, -36F, -19F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 28
		bodyModel[153].setRotationPoint(-6F, -36F, -19F);

		bodyModel[154].addShapeBox(0F, 2F, 0F, 2, 8, 6, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 29
		bodyModel[154].setRotationPoint(-8F, -37F, -19F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[155].setRotationPoint(-3F, -36F, -20F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[156].setRotationPoint(-6F, -36F, -20F);

		bodyModel[157].addShapeBox(0F, 2F, 0F, 2, 8, 1, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 32
		bodyModel[157].setRotationPoint(-8F, -37F, -20F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 33
		bodyModel[158].setRotationPoint(-3F, -36.5F, -19F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[159].setRotationPoint(-3F, -36.5F, -20F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[160].setRotationPoint(2F, -36.5F, -20F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 36
		bodyModel[161].setRotationPoint(2F, -36.5F, -19F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[162].setRotationPoint(4.9F, -36.5F, -20F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 38
		bodyModel[163].setRotationPoint(4.9F, -36.5F, -19F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 39
		bodyModel[164].setRotationPoint(-6F, -36F, 13F);

		bodyModel[165].addShapeBox(0F, 2F, 0F, 2, 8, 6, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 40
		bodyModel[165].setRotationPoint(-8F, -37F, 13F);

		bodyModel[166].addShapeBox(0F, 2F, 0F, 2, 8, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F); // Box 41
		bodyModel[166].setRotationPoint(-8F, -37F, 19F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 42
		bodyModel[167].setRotationPoint(-6F, -36F, 19F);

		bodyModel[168].addBox(0F, 0F, 0F, 9, 10, 6, 0F); // Box 43
		bodyModel[168].setRotationPoint(-3F, -36F, 13F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[169].setRotationPoint(-3F, -36F, 19F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 45
		bodyModel[170].setRotationPoint(-3F, -36.5F, 13F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 46
		bodyModel[171].setRotationPoint(-3F, -36.5F, 19F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 47
		bodyModel[172].setRotationPoint(2F, -36.5F, 13F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 48
		bodyModel[173].setRotationPoint(2F, -36.5F, 19F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 49
		bodyModel[174].setRotationPoint(4.9F, -36.5F, 13F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 50
		bodyModel[175].setRotationPoint(4.9F, -36.5F, 19F);

		bodyModel[176].addShapeBox(0F, -5F, 0F, 9, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F); // Box 51
		bodyModel[176].setRotationPoint(-22F, -11F, -12F);
		bodyModel[176].rotateAngleX = -0.15707963F;

		bodyModel[177].addShapeBox(4F, 3F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[177].setRotationPoint(-22F, -11F, -12F);
		bodyModel[177].rotateAngleX = -0.15707963F;

		bodyModel[178].addShapeBox(4F, 6F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[178].setRotationPoint(-22F, -11F, -12F);
		bodyModel[178].rotateAngleX = -0.15707963F;

		bodyModel[179].addShapeBox(0F, 3F, 0.5F, 4, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[179].setRotationPoint(-22F, -11F, -12F);
		bodyModel[179].rotateAngleX = -0.15707963F;

		bodyModel[180].addBox(0F, 4F, 0.5F, 4, 2, 4, 0F); // Box 55
		bodyModel[180].setRotationPoint(-22F, -11F, -12F);
		bodyModel[180].rotateAngleX = -0.15707963F;

		bodyModel[181].addShapeBox(0F, 6F, 0.5F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 56
		bodyModel[181].setRotationPoint(-22F, -11F, -12F);
		bodyModel[181].rotateAngleX = -0.15707963F;

		bodyModel[182].addShapeBox(9F, -6F, 0F, 36, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[182].setRotationPoint(-22F, -11F, -12F);
		bodyModel[182].rotateAngleX = -0.15707963F;

		bodyModel[183].addShapeBox(9F, 6F, 0F, 36, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 58
		bodyModel[183].setRotationPoint(-22F, -11F, -12F);
		bodyModel[183].rotateAngleX = -0.15707963F;

		bodyModel[184].addShapeBox(45F, -6F, 0F, 18, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 59
		bodyModel[184].setRotationPoint(-22F, -11F, -12F);
		bodyModel[184].rotateAngleX = -0.15707963F;

		bodyModel[185].addShapeBox(45F, 6F, 0F, 18, 1, 5, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, -1F); // Box 60
		bodyModel[185].setRotationPoint(-22F, -11F, -12F);
		bodyModel[185].rotateAngleX = -0.15707963F;

		bodyModel[186].addShapeBox(0F, -5F, -7F, 9, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 61
		bodyModel[186].setRotationPoint(-22F, -11F, 13F);
		bodyModel[186].rotateAngleX = 0.15707963F;

		bodyModel[187].addShapeBox(4F, 6F, -6F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 62
		bodyModel[187].setRotationPoint(-22F, -11F, 13F);
		bodyModel[187].rotateAngleX = 0.15707963F;

		bodyModel[188].addShapeBox(4F, 3F, -6F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[188].setRotationPoint(-22F, -11F, 13F);
		bodyModel[188].rotateAngleX = 0.15707963F;

		bodyModel[189].addShapeBox(9F, -6F, -6F, 36, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[189].setRotationPoint(-22F, -11F, 13F);
		bodyModel[189].rotateAngleX = 0.15707963F;

		bodyModel[190].addShapeBox(9F, 6F, -6F, 36, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 65
		bodyModel[190].setRotationPoint(-22F, -11F, 13F);
		bodyModel[190].rotateAngleX = 0.15707963F;

		bodyModel[191].addShapeBox(45F, -6F, -6F, 18, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 66
		bodyModel[191].setRotationPoint(-22F, -11F, 13F);
		bodyModel[191].rotateAngleX = 0.15707963F;

		bodyModel[192].addShapeBox(45F, 6F, -6F, 18, 1, 5, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, -1F); // Box 67
		bodyModel[192].setRotationPoint(-22F, -11F, 13F);
		bodyModel[192].rotateAngleX = 0.15707963F;

		bodyModel[193].addShapeBox(0F, 3F, -5.5F, 4, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[193].setRotationPoint(-22F, -11F, 13F);
		bodyModel[193].rotateAngleX = 0.15707963F;

		bodyModel[194].addBox(0F, 4F, -5.5F, 4, 2, 4, 0F); // Box 69
		bodyModel[194].setRotationPoint(-22F, -11F, 13F);
		bodyModel[194].rotateAngleX = 0.15707963F;

		bodyModel[195].addShapeBox(0F, 6F, -5.5F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 70
		bodyModel[195].setRotationPoint(-22F, -11F, 13F);
		bodyModel[195].rotateAngleX = 0.15707963F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 23, 10, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[196].setRotationPoint(7F, -36F, -16F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 23, 10, 1, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 72
		bodyModel[197].setRotationPoint(7F, -36F, -17F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 26, 8, 31, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 74
		bodyModel[198].setRotationPoint(10F, -31F, -15.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 26, 5, 31, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 75
		bodyModel[199].setRotationPoint(10F, -23F, -15.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 26, 5, 31, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 76
		bodyModel[200].setRotationPoint(10F, -36F, -15.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 46, 6, 27, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[201].setRotationPoint(10F, -42F, -13.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 20, 18, 27, 0F); // Box 78
		bodyModel[202].setRotationPoint(36F, -36F, -13.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[203].setRotationPoint(30F, -36F, -16F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[204].setRotationPoint(30F, -27F, -16F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[205].setRotationPoint(31F, -34F, -16F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[206].setRotationPoint(31F, -35F, -16F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 83
		bodyModel[207].setRotationPoint(31F, -28F, -16F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, -5F, 0F, 0F, 1F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[208].setRotationPoint(32F, -35F, -16F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[209].setRotationPoint(32F, -28F, -16F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, -4F, 0F, -2F, 0F, 1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[210].setRotationPoint(36F, -34F, -16F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 23, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 88
		bodyModel[211].setRotationPoint(7F, -36F, 12F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 23, 10, 1, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F); // Box 89
		bodyModel[212].setRotationPoint(7F, -36F, 16F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 90
		bodyModel[213].setRotationPoint(30F, -36F, 12F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 91
		bodyModel[214].setRotationPoint(30F, -27F, 12F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 92
		bodyModel[215].setRotationPoint(31F, -34F, 13F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -2F, -4F, 0F, -2F); // Box 93
		bodyModel[216].setRotationPoint(36F, -34F, 13F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 94
		bodyModel[217].setRotationPoint(32F, -35F, 13F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -2F, -5F, 0F, 0F); // Box 95
		bodyModel[218].setRotationPoint(32F, -28F, 13F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Box 96
		bodyModel[219].setRotationPoint(31F, -28F, 13F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 97
		bodyModel[220].setRotationPoint(31F, -35F, 13F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, -4F, 0F, -2F, 0F, 1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[221].setRotationPoint(34F, -34F, -16F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -2F, -4F, 0F, -2F); // Box 99
		bodyModel[222].setRotationPoint(34F, -34F, 13F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, -4F, 0F, -2F, 0F, 1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[223].setRotationPoint(31F, -34F, -16F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -2F, -4F, 0F, -2F); // Box 101
		bodyModel[224].setRotationPoint(31F, -34F, 13F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -2.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -2.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 102
		bodyModel[225].setRotationPoint(14F, -54F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[226].setRotationPoint(18F, -51F, -0.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 32, 19, 0F); // Box 200
		bodyModel[227].setRotationPoint(-34F, -45F, -9.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 32, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[228].setRotationPoint(-34F, -45F, -12.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 28, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[229].setRotationPoint(-34F, -43F, -14.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[230].setRotationPoint(-34F, -40F, -16.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[231].setRotationPoint(-34F, -38F, -18.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 32, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[232].setRotationPoint(-34F, -45F, 9.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 28, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 206
		bodyModel[233].setRotationPoint(-34F, -43F, 12.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 207
		bodyModel[234].setRotationPoint(-34F, -40F, 14.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 208
		bodyModel[235].setRotationPoint(-34F, -38F, 16.5F);

		bodyModel[236].addBox(0F, 0F, -4F, 10, 2, 4, 0F); // Box 389
		bodyModel[236].setRotationPoint(-31F, -46F, 12.5F);
		bodyModel[236].rotateAngleX = -0.2443461F;


		noseModel = new ModelRendererTurbo[33];
		noseModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Box0
		noseModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box1
		noseModel[2] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box2
		noseModel[3] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Box3
		noseModel[4] = new ModelRendererTurbo(this, 0, 135, textureX, textureY); // Import Box4
		noseModel[5] = new ModelRendererTurbo(this, 0, 135, textureX, textureY); // Import Box5
		noseModel[6] = new ModelRendererTurbo(this, 0, 147, textureX, textureY); // Import Box6
		noseModel[7] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Import Box7
		noseModel[8] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Import Box8
		noseModel[9] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Import Box9
		noseModel[10] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Import Box10
		noseModel[11] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Import Box11
		noseModel[12] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Import Box12
		noseModel[13] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Import Box13
		noseModel[14] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Import Box14
		noseModel[15] = new ModelRendererTurbo(this, 0, 216, textureX, textureY); // Import Box15
		noseModel[16] = new ModelRendererTurbo(this, 0, 216, textureX, textureY); // Import Box16
		noseModel[17] = new ModelRendererTurbo(this, 0, 216, textureX, textureY); // Import Box18
		noseModel[18] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import Box19
		noseModel[19] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import Box20
		noseModel[20] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import Box21
		noseModel[21] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box22
		noseModel[22] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box23
		noseModel[23] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box24
		noseModel[24] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box25
		noseModel[25] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box26
		noseModel[26] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box27
		noseModel[27] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import Box28
		noseModel[28] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import Box29
		noseModel[29] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Import Box30
		noseModel[30] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import Box31
		noseModel[31] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box37
		noseModel[32] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Import Box38

		noseModel[0].addShapeBox(0F, 0F, -1F, 2, 4, 2, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Import Box0
		noseModel[0].setRotationPoint(-134F, -20F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F); // Import Box1
		noseModel[1].setRotationPoint(-134F, -20F, -2F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F); // Import Box2
		noseModel[2].setRotationPoint(-134F, -20F, 1F);

		noseModel[3].addShapeBox(0F, 0F, -1F, 4, 8, 4, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Import Box3
		noseModel[3].setRotationPoint(-132F, -22F, -1F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Import Box4
		noseModel[4].setRotationPoint(-132F, -22F, -4F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F); // Import Box5
		noseModel[5].setRotationPoint(-132F, -22F, 2F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 23, 17, 7, 0F, 0F, -7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F); // Import Box6
		noseModel[6].setRotationPoint(-128F, -29F, -3.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 23, 17, 5, 0F, 0F, -9F, -4.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 1.5F, 0F, -4F, -4.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F); // Import Box7
		noseModel[7].setRotationPoint(-128F, -29F, -8.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 23, 17, 5, 0F, 0F, -7F, 1.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, -4.5F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, -4.5F); // Import Box8
		noseModel[8].setRotationPoint(-128F, -29F, 3.5F);

		noseModel[9].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Import Box9
		noseModel[9].setRotationPoint(-115F, -28F, -0.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		noseModel[10].setRotationPoint(-115F, -28F, -1.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		noseModel[11].setRotationPoint(-115F, -28F, 0.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		noseModel[12].setRotationPoint(-123F, -28F, -0.5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		noseModel[13].setRotationPoint(-123F, -28F, -1.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		noseModel[14].setRotationPoint(-123F, -28F, 0.5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		noseModel[15].setRotationPoint(-127F, -26F, -0.5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		noseModel[16].setRotationPoint(-127F, -26F, -1.5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		noseModel[17].setRotationPoint(-127F, -26F, 0.5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box19
		noseModel[18].setRotationPoint(-130F, -15.5F, -2F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box20
		noseModel[19].setRotationPoint(-130F, -15.5F, -2.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box21
		noseModel[20].setRotationPoint(-130F, -15.5F, -1.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Import Box22
		noseModel[21].setRotationPoint(-132F, -15.5F, -2F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Import Box23
		noseModel[22].setRotationPoint(-132F, -15.5F, -2.5F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.25F, -0.5F); // Import Box24
		noseModel[23].setRotationPoint(-132F, -15.5F, -1.5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Import Box25
		noseModel[24].setRotationPoint(-132F, -15.5F, 0.5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Import Box26
		noseModel[25].setRotationPoint(-132F, -15.5F, 1F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.25F, -0.5F); // Import Box27
		noseModel[26].setRotationPoint(-132F, -15.5F, 1.5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box28
		noseModel[27].setRotationPoint(-130F, -15.5F, 1.5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box29
		noseModel[28].setRotationPoint(-130F, -15.5F, 1F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box30
		noseModel[29].setRotationPoint(-130F, -15.5F, 0.5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		noseModel[30].setRotationPoint(-111F, -30F, -0.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box37
		noseModel[31].setRotationPoint(-107F, -31F, -0.5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box38
		noseModel[32].setRotationPoint(-107.5F, -32F, -0.5F);


		tailModel = new ModelRendererTurbo[58];
		tailModel[0] = new ModelRendererTurbo(this, 200, 215, textureX, textureY); // Box 104
		tailModel[1] = new ModelRendererTurbo(this, 200, 225, textureX, textureY); // Box 105
		tailModel[2] = new ModelRendererTurbo(this, 200, 242, textureX, textureY); // Box 106
		tailModel[3] = new ModelRendererTurbo(this, 200, 272, textureX, textureY); // Box 107
		tailModel[4] = new ModelRendererTurbo(this, 200, 306, textureX, textureY); // Box 108
		tailModel[5] = new ModelRendererTurbo(this, 200, 352, textureX, textureY); // Box 109
		tailModel[6] = new ModelRendererTurbo(this, 200, 383, textureX, textureY); // Box 110
		tailModel[7] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 111
		tailModel[8] = new ModelRendererTurbo(this, 200, 432, textureX, textureY); // Box 124
		tailModel[9] = new ModelRendererTurbo(this, 200, 437, textureX, textureY); // Box 125
		tailModel[10] = new ModelRendererTurbo(this, 200, 444, textureX, textureY); // Box 126
		tailModel[11] = new ModelRendererTurbo(this, 200, 464, textureX, textureY); // Box 127
		tailModel[12] = new ModelRendererTurbo(this, 200, 491, textureX, textureY); // Box 128
		tailModel[13] = new ModelRendererTurbo(this, 200, 515, textureX, textureY); // Box 129
		tailModel[14] = new ModelRendererTurbo(this, 200, 527, textureX, textureY); // Box 130
		tailModel[15] = new ModelRendererTurbo(this, 200, 527, textureX, textureY); // Box 131
		tailModel[16] = new ModelRendererTurbo(this, 200, 527, textureX, textureY); // Box 132
		tailModel[17] = new ModelRendererTurbo(this, 200, 536, textureX, textureY); // Box 133
		tailModel[18] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Box 134
		tailModel[19] = new ModelRendererTurbo(this, 200, 555, textureX, textureY); // Box 135
		tailModel[20] = new ModelRendererTurbo(this, 200, 571, textureX, textureY); // Box 136
		tailModel[21] = new ModelRendererTurbo(this, 200, 554, textureX, textureY); // Box 137
		tailModel[22] = new ModelRendererTurbo(this, 200, 591, textureX, textureY); // Box 138
		tailModel[23] = new ModelRendererTurbo(this, 200, 628, textureX, textureY); // Box 139
		tailModel[24] = new ModelRendererTurbo(this, 200, 665, textureX, textureY); // Box 140
		tailModel[25] = new ModelRendererTurbo(this, 200, 671, textureX, textureY); // Box 141
		tailModel[26] = new ModelRendererTurbo(this, 200, 677, textureX, textureY); // Box 142
		tailModel[27] = new ModelRendererTurbo(this, 200, 554, textureX, textureY); // Box 143
		tailModel[28] = new ModelRendererTurbo(this, 200, 591, textureX, textureY); // Box 144
		tailModel[29] = new ModelRendererTurbo(this, 200, 628, textureX, textureY); // Box 145
		tailModel[30] = new ModelRendererTurbo(this, 200, 665, textureX, textureY); // Box 146
		tailModel[31] = new ModelRendererTurbo(this, 200, 671, textureX, textureY); // Box 147
		tailModel[32] = new ModelRendererTurbo(this, 200, 677, textureX, textureY); // Box 148
		tailModel[33] = new ModelRendererTurbo(this, 200, 683, textureX, textureY); // Box 149
		tailModel[34] = new ModelRendererTurbo(this, 200, 683, textureX, textureY); // Box 150
		tailModel[35] = new ModelRendererTurbo(this, 200, 683, textureX, textureY); // Box 152
		tailModel[36] = new ModelRendererTurbo(this, 200, 692, textureX, textureY); // Box 153
		tailModel[37] = new ModelRendererTurbo(this, 200, 696, textureX, textureY); // Box 154
		tailModel[38] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Box 155
		tailModel[39] = new ModelRendererTurbo(this, 200, 696, textureX, textureY); // Box 156
		tailModel[40] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Box 157
		tailModel[41] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Box 159
		tailModel[42] = new ModelRendererTurbo(this, 200, 696, textureX, textureY); // Box 160
		tailModel[43] = new ModelRendererTurbo(this, 200, 704, textureX, textureY); // Box 161
		tailModel[44] = new ModelRendererTurbo(this, 200, 704, textureX, textureY); // Box 162
		tailModel[45] = new ModelRendererTurbo(this, 200, 704, textureX, textureY); // Box 163
		tailModel[46] = new ModelRendererTurbo(this, 200, 712, textureX, textureY); // Box 164
		tailModel[47] = new ModelRendererTurbo(this, 200, 712, textureX, textureY); // Box 165
		tailModel[48] = new ModelRendererTurbo(this, 200, 712, textureX, textureY); // Box 166
		tailModel[49] = new ModelRendererTurbo(this, 200, 724, textureX, textureY); // Box 167
		tailModel[50] = new ModelRendererTurbo(this, 200, 724, textureX, textureY); // Box 168
		tailModel[51] = new ModelRendererTurbo(this, 200, 724, textureX, textureY); // Box 169
		tailModel[52] = new ModelRendererTurbo(this, 200, 748, textureX, textureY); // Box 170
		tailModel[53] = new ModelRendererTurbo(this, 200, 748, textureX, textureY); // Box 172
		tailModel[54] = new ModelRendererTurbo(this, 200, 757, textureX, textureY); // Box 174
		tailModel[55] = new ModelRendererTurbo(this, 200, 748, textureX, textureY); // Box 175
		tailModel[56] = new ModelRendererTurbo(this, 200, 757, textureX, textureY); // Box 176
		tailModel[57] = new ModelRendererTurbo(this, 200, 757, textureX, textureY); // Box 177

		tailModel[0].addShapeBox(0F, 0F, 0F, 60, 1, 7, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 1F); // Box 104
		tailModel[0].setRotationPoint(56F, -50F, -3.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 60, 1, 15, 0F, 0F, 0F, -1F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F); // Box 105
		tailModel[1].setRotationPoint(56F, -49F, -7.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 60, 6, 23, 0F, 0F, 0F, -4F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 0F, 0F); // Box 106
		tailModel[2].setRotationPoint(56F, -48F, -11.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 60, 6, 27, 0F, 0F, 0F, -2F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F); // Box 107
		tailModel[3].setRotationPoint(56F, -42F, -13.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 60, 18, 27, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, -6F, -5F, 0F, 0F, 0F); // Box 108
		tailModel[4].setRotationPoint(56F, -36F, -13.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 60, 3, 27, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, -2F); // Box 109
		tailModel[5].setRotationPoint(56F, -18F, -13.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 60, 3, 23, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, -2F); // Box 110
		tailModel[6].setRotationPoint(56F, -15F, -11.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 60, 2, 19, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, -2F); // Box 111
		tailModel[7].setRotationPoint(56F, -12F, -9.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, -2F, -1F, -1F, -2F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 2F, -1F, -2F, 2F, -1F, 0F, 0F, 0F); // Box 124
		tailModel[8].setRotationPoint(116F, -47F, -1.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		tailModel[9].setRotationPoint(116F, -46F, -2.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 26, 12, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 5F); // Box 126
		tailModel[10].setRotationPoint(116F, -45F, -3.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 26, 9, 17, 0F, 0F, 0F, 0F, 0F, 8F, -5F, 0F, 8F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -5F, 0F, -15F, -5F, 0F, 0F, 0F); // Box 127
		tailModel[11].setRotationPoint(116F, -33F, -8.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 26, 6, 17, 0F, 0F, 0F, 0F, 0F, 15F, -5F, 0F, 15F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -15F, -5F, 0F, -15F, -5F, 0F, 0F, -4F); // Box 128
		tailModel[12].setRotationPoint(116F, -24F, -8.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 26, 2, 9, 0F, 0F, 0F, 0F, 0F, 15F, -1F, 0F, 15F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, -2F); // Box 129
		tailModel[13].setRotationPoint(116F, -18F, -4.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		tailModel[14].setRotationPoint(142F, -45F, -3F);

		tailModel[15].addBox(0F, 0F, 0F, 13, 2, 6, 0F); // Box 131
		tailModel[15].setRotationPoint(142F, -43F, -3F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 132
		tailModel[16].setRotationPoint(142F, -41F, -3F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 133
		tailModel[17].setRotationPoint(142F, -46F, -2.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
		tailModel[18].setRotationPoint(142F, -45F, -3.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 2, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 135
		tailModel[19].setRotationPoint(142F, -41F, -3.5F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Box 136
		tailModel[20].setRotationPoint(142F, -33F, -3.5F);

		tailModel[21].addShapeBox(0F, 0F, -33F, 18, 3, 33, 0F, -22F, -2F, 0F, 10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		tailModel[21].setRotationPoint(124F, -45F, -2.5F);
		tailModel[21].rotateAngleX = 0.2443461F;

		tailModel[22].addShapeBox(0F, 0F, -33F, 1, 3, 33, 0F, -22F, -2.25F, 0F, 22F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -22F, -0.25F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 138
		tailModel[22].setRotationPoint(123F, -45F, -2.5F);
		tailModel[22].rotateAngleX = 0.2443461F;

		tailModel[23].addShapeBox(0F, 0F, -33F, 9, 3, 33, 0F, -10F, -2F, 0F, 5F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		tailModel[23].setRotationPoint(142F, -45F, -2.5F);
		tailModel[23].rotateAngleX = 0.2443461F;

		tailModel[24].addShapeBox(0F, 2F, -37F, 1, 1, 4, 0F, -3F, -0.25F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 140
		tailModel[24].setRotationPoint(145F, -45F, -2.5F);
		tailModel[24].rotateAngleX = 0.2443461F;

		tailModel[25].addShapeBox(0F, 2F, -37F, 6, 1, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		tailModel[25].setRotationPoint(146F, -45F, -2.5F);
		tailModel[25].rotateAngleX = 0.2443461F;

		tailModel[26].addShapeBox(0F, 2F, -37F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		tailModel[26].setRotationPoint(152F, -45F, -2.5F);
		tailModel[26].rotateAngleX = 0.2443461F;

		tailModel[27].addShapeBox(0F, 0F, 0F, 18, 3, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -2F, 0F, -22F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -22F, 0F, 0F); // Box 143
		tailModel[27].setRotationPoint(124F, -45F, 2.5F);
		tailModel[27].rotateAngleX = -0.2443461F;

		tailModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 33, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 22F, -2F, 0F, -22F, -2.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, -22F, -0.25F, 0F); // Box 144
		tailModel[28].setRotationPoint(123F, -45F, 2.5F);
		tailModel[28].rotateAngleX = -0.2443461F;

		tailModel[29].addShapeBox(0F, 0F, 0F, 9, 3, 33, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 5F, -2.75F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -10F, 0F, 0F); // Box 145
		tailModel[29].setRotationPoint(142F, -45F, 2.5F);
		tailModel[29].rotateAngleX = -0.2443461F;

		tailModel[30].addShapeBox(0F, 2F, 33F, 1, 1, 4, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, -0.25F, 0F); // Box 146
		tailModel[30].setRotationPoint(145F, -45F, 2.5F);
		tailModel[30].rotateAngleX = -0.2443461F;

		tailModel[31].addShapeBox(0F, 2F, 33F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 147
		tailModel[31].setRotationPoint(146F, -45F, 2.5F);
		tailModel[31].rotateAngleX = -0.2443461F;

		tailModel[32].addShapeBox(0F, 2F, 33F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailModel[32].setRotationPoint(152F, -45F, 2.5F);
		tailModel[32].rotateAngleX = -0.2443461F;

		tailModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F); // Box 149
		tailModel[33].setRotationPoint(155F, -45F, -3F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F); // Box 150
		tailModel[34].setRotationPoint(155F, -43F, -3F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F); // Box 152
		tailModel[35].setRotationPoint(155F, -41F, -3F);

		tailModel[36].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 153
		tailModel[36].setRotationPoint(94F, -49F, -1F);

		tailModel[37].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 154
		tailModel[37].setRotationPoint(93F, -51F, -0.5F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		tailModel[38].setRotationPoint(98F, -51F, -0.5F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tailModel[39].setRotationPoint(93F, -51F, -1.5F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[40].setRotationPoint(98F, -51F, -1.5F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[41].setRotationPoint(98F, -51F, 0.5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		tailModel[42].setRotationPoint(93F, -51F, 0.5F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		tailModel[43].setRotationPoint(106F, -52F, -0.5F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		tailModel[44].setRotationPoint(106F, -52F, -1.5F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		tailModel[45].setRotationPoint(106F, -52F, 0.5F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 14, 10, 1, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[46].setRotationPoint(113F, -56F, -0.5F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 14, 10, 1, 0F, 0F, -1F, 0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		tailModel[47].setRotationPoint(113F, -56F, -1.5F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 14, 10, 1, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 10F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tailModel[48].setRotationPoint(113F, -56F, 0.5F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 15, 21, 1, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[49].setRotationPoint(127F, -67F, -0.5F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 15, 21, 1, 0F, 0F, -1F, 0F, 0F, 11F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[50].setRotationPoint(127F, -67F, -1.5F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 15, 21, 1, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 11F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 169
		tailModel[51].setRotationPoint(127F, -67F, 0.5F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.48F, 0F, 0F); // Box 170
		tailModel[52].setRotationPoint(142F, -80F, -0.5F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.48F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.48F, 0F, 0F); // Box 172
		tailModel[53].setRotationPoint(142F, -80F, -1.5F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 10, 28, 1, 0F, 0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.48F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 174
		tailModel[54].setRotationPoint(142F, -74F, -0.5F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0.48F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.48F, 0F, 0F); // Box 175
		tailModel[55].setRotationPoint(142F, -80F, 0.5F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 10, 28, 1, 0F, 0.48F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.48F, 0F, 0F, 2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 176
		tailModel[56].setRotationPoint(142F, -74F, -1.5F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 10, 28, 1, 0F, 0.48F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.48F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F); // Box 177
		tailModel[57].setRotationPoint(142F, -74F, 0.5F);


		leftWingModel = new ModelRendererTurbo[82];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 787, textureX, textureY); // Box 178
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 810, textureX, textureY); // Box 179
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 810, textureX, textureY); // Box 180
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 810, textureX, textureY); // Box 181
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 877, textureX, textureY); // Box 182
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 877, textureX, textureY); // Box 183
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 898, textureX, textureY); // Box 184
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 936, textureX, textureY); // Box 185
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 945, textureX, textureY); // Box 186
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 952, textureX, textureY); // Box 187
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 188
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 1008, textureX, textureY); // Box 209
		leftWingModel[12] = new ModelRendererTurbo(this, 200, 1013, textureX, textureY); // Box 210
		leftWingModel[13] = new ModelRendererTurbo(this, 200, 1008, textureX, textureY); // Box 211
		leftWingModel[14] = new ModelRendererTurbo(this, 200, 1018, textureX, textureY); // Box 215
		leftWingModel[15] = new ModelRendererTurbo(this, 200, 1018, textureX, textureY); // Box 216
		leftWingModel[16] = new ModelRendererTurbo(this, 200, 1018, textureX, textureY); // Box 218
		leftWingModel[17] = new ModelRendererTurbo(this, 200, 1033, textureX, textureY); // Box 219
		leftWingModel[18] = new ModelRendererTurbo(this, 200, 1042, textureX, textureY); // Box 220
		leftWingModel[19] = new ModelRendererTurbo(this, 200, 1049, textureX, textureY); // Box 221
		leftWingModel[20] = new ModelRendererTurbo(this, 200, 1049, textureX, textureY); // Box 222
		leftWingModel[21] = new ModelRendererTurbo(this, 200, 1056, textureX, textureY); // Box 223
		leftWingModel[22] = new ModelRendererTurbo(this, 200, 1068, textureX, textureY); // Box 224
		leftWingModel[23] = new ModelRendererTurbo(this, 200, 1078, textureX, textureY); // Box 225
		leftWingModel[24] = new ModelRendererTurbo(this, 200, 1078, textureX, textureY); // Box 226
		leftWingModel[25] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 227
		leftWingModel[26] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 228
		leftWingModel[27] = new ModelRendererTurbo(this, 200, 1114, textureX, textureY); // Box 229
		leftWingModel[28] = new ModelRendererTurbo(this, 200, 1114, textureX, textureY); // Box 230
		leftWingModel[29] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 231
		leftWingModel[30] = new ModelRendererTurbo(this, 200, 1078, textureX, textureY); // Box 232
		leftWingModel[31] = new ModelRendererTurbo(this, 200, 1114, textureX, textureY); // Box 233
		leftWingModel[32] = new ModelRendererTurbo(this, 200, 1131, textureX, textureY); // Box 234
		leftWingModel[33] = new ModelRendererTurbo(this, 200, 1131, textureX, textureY); // Box 235
		leftWingModel[34] = new ModelRendererTurbo(this, 200, 1131, textureX, textureY); // Box 236
		leftWingModel[35] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Box 237
		leftWingModel[36] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Box 238
		leftWingModel[37] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Box 239
		leftWingModel[38] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 240
		leftWingModel[39] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 241
		leftWingModel[40] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 242
		leftWingModel[41] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 243
		leftWingModel[42] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 244
		leftWingModel[43] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 245
		leftWingModel[44] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 246
		leftWingModel[45] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 247
		leftWingModel[46] = new ModelRendererTurbo(this, 200, 1163, textureX, textureY); // Box 248
		leftWingModel[47] = new ModelRendererTurbo(this, 200, 1163, textureX, textureY); // Box 249
		leftWingModel[48] = new ModelRendererTurbo(this, 200, 1163, textureX, textureY); // Box 250
		leftWingModel[49] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 251
		leftWingModel[50] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 252
		leftWingModel[51] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 253
		leftWingModel[52] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 254
		leftWingModel[53] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 255
		leftWingModel[54] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 256
		leftWingModel[55] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 257
		leftWingModel[56] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 258
		leftWingModel[57] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 259
		leftWingModel[58] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 260
		leftWingModel[59] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 261
		leftWingModel[60] = new ModelRendererTurbo(this, 200, 1184, textureX, textureY); // Box 345
		leftWingModel[61] = new ModelRendererTurbo(this, 200, 1184, textureX, textureY); // Box 346
		leftWingModel[62] = new ModelRendererTurbo(this, 200, 1184, textureX, textureY); // Box 347
		leftWingModel[63] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 348
		leftWingModel[64] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 349
		leftWingModel[65] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 350
		leftWingModel[66] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 351
		leftWingModel[67] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 352
		leftWingModel[68] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 353
		leftWingModel[69] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 354
		leftWingModel[70] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 355
		leftWingModel[71] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 356
		leftWingModel[72] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 357
		leftWingModel[73] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 358
		leftWingModel[74] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 359
		leftWingModel[75] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 360
		leftWingModel[76] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 361
		leftWingModel[77] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 362
		leftWingModel[78] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 363
		leftWingModel[79] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 364
		leftWingModel[80] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 365
		leftWingModel[81] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 366

		leftWingModel[0].addShapeBox(10F, 0F, -13F, 43, 3, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftWingModel[0].setRotationPoint(-10F, -46F, -12.5F);
		leftWingModel[0].rotateAngleX = 0.2443461F;

		leftWingModel[1].addShapeBox(10F, 1F, -78F, 44, 1, 65, 0F, -46F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -46F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftWingModel[1].setRotationPoint(-11F, -46F, -12.5F);
		leftWingModel[1].rotateAngleX = 0.2443461F;

		leftWingModel[2].addShapeBox(10F, 0F, -78F, 44, 1, 65, 0F, -47F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -46F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		leftWingModel[2].setRotationPoint(-11F, -46F, -12.5F);
		leftWingModel[2].rotateAngleX = 0.2443461F;

		leftWingModel[3].addShapeBox(10F, 2F, -78F, 44, 1, 65, 0F, -46F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -47F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 181
		leftWingModel[3].setRotationPoint(-11F, -46F, -12.5F);
		leftWingModel[3].rotateAngleX = 0.2443461F;

		leftWingModel[4].addShapeBox(8F, 0F, -13F, 1, 1, 19, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftWingModel[4].setRotationPoint(-9F, -46F, -12.5F);
		leftWingModel[4].rotateAngleX = 0.2443461F;

		leftWingModel[5].addShapeBox(8F, 2F, -13F, 1, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftWingModel[5].setRotationPoint(-9F, -46F, -12.5F);
		leftWingModel[5].rotateAngleX = 0.2443461F;

		leftWingModel[6].addShapeBox(77F, 0F, -78F, 7, 3, 34, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 12F, 0F, 0F); // Box 184
		leftWingModel[6].setRotationPoint(-11F, -46F, -12.5F);
		leftWingModel[6].rotateAngleX = 0.2443461F;

		leftWingModel[7].addShapeBox(65F, 0F, -44F, 27, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F); // Box 185
		leftWingModel[7].setRotationPoint(-11F, -46F, -12.5F);
		leftWingModel[7].rotateAngleX = 0.2443461F;

		leftWingModel[8].addShapeBox(65F, 3F, -44F, 27, 2, 4, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftWingModel[8].setRotationPoint(-11F, -46F, -12.5F);
		leftWingModel[8].rotateAngleX = 0.2443461F;

		leftWingModel[9].addShapeBox(64F, 0F, -40F, 12, 3, 27, 0F, 1.4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 11F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 187
		leftWingModel[9].setRotationPoint(-10F, -46F, -12.5F);
		leftWingModel[9].rotateAngleX = 0.2443461F;

		leftWingModel[10].addShapeBox(53F, 0F, -13F, 23, 3, 19, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftWingModel[10].setRotationPoint(-10F, -46F, -12.5F);
		leftWingModel[10].rotateAngleX = 0.2443461F;

		leftWingModel[11].addShapeBox(93F, 0F, -43F, 4, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingModel[11].setRotationPoint(-12F, -46F, -12.5F);
		leftWingModel[11].rotateAngleX = 0.2443461F;

		leftWingModel[12].addBox(93F, 1F, -43F, 4, 2, 2, 0F); // Box 210
		leftWingModel[12].setRotationPoint(-12F, -46F, -12.5F);
		leftWingModel[12].rotateAngleX = 0.2443461F;

		leftWingModel[13].addShapeBox(93F, 3F, -43F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 211
		leftWingModel[13].setRotationPoint(-12F, -46F, -12.5F);
		leftWingModel[13].rotateAngleX = 0.2443461F;

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 42, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 215
		leftWingModel[14].setRotationPoint(13F, -38F, -34.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 42, 13, 1, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 216
		leftWingModel[15].setRotationPoint(13F, -38F, -35.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 42, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 10F, 0F, 0F); // Box 218
		leftWingModel[16].setRotationPoint(13F, -38F, -33.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 27, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 219
		leftWingModel[17].setRotationPoint(22F, -34F, -53.5F);

		leftWingModel[18].addBox(0F, 0F, 0F, 33, 3, 3, 0F); // Box 220
		leftWingModel[18].setRotationPoint(16F, -28F, -54F);

		leftWingModel[19].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 221
		leftWingModel[19].setRotationPoint(13F, -28F, -54F);

		leftWingModel[20].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 222
		leftWingModel[20].setRotationPoint(49F, -28F, -54F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 25, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 223
		leftWingModel[21].setRotationPoint(32F, -30F, -66.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 25, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 224
		leftWingModel[22].setRotationPoint(41F, -27F, -80.5F);

		leftWingModel[23].addBox(0F, 0F, 0F, 47, 12, 4, 0F); // Box 225
		leftWingModel[23].setRotationPoint(3F, -25F, -36F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		leftWingModel[24].setRotationPoint(3F, -25F, -40F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 227
		leftWingModel[25].setRotationPoint(-9F, -25F, -36F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 228
		leftWingModel[26].setRotationPoint(-9F, -25F, -40F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 229
		leftWingModel[27].setRotationPoint(50F, -25F, -36F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 230
		leftWingModel[28].setRotationPoint(50F, -25F, -40F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 231
		leftWingModel[29].setRotationPoint(-9F, -25F, -32F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 232
		leftWingModel[30].setRotationPoint(3F, -25F, -32F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 233
		leftWingModel[31].setRotationPoint(50F, -25F, -32F);

		leftWingModel[32].addBox(0F, 0F, 0F, 45, 6, 2, 0F); // Box 234
		leftWingModel[32].setRotationPoint(25F, -21F, -80.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 45, 6, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftWingModel[33].setRotationPoint(25F, -21F, -82.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 45, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 236
		leftWingModel[34].setRotationPoint(25F, -21F, -78.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F); // Box 237
		leftWingModel[35].setRotationPoint(20F, -21F, -80.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -2.5F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2.5F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F); // Box 238
		leftWingModel[36].setRotationPoint(20F, -21F, -82.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, -2F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, -2F); // Box 239
		leftWingModel[37].setRotationPoint(20F, -21F, -78.5F);

		leftWingModel[38].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 240
		leftWingModel[38].setRotationPoint(66F, -18F, -79.5F);
		leftWingModel[38].rotateAngleX = 0.78539816F;

		leftWingModel[39].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 241
		leftWingModel[39].setRotationPoint(28F, -18F, -79.5F);
		leftWingModel[39].rotateAngleX = 0.78539816F;

		leftWingModel[40].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 242
		leftWingModel[40].setRotationPoint(28F, -18F, -79.5F);
		leftWingModel[40].rotateAngleX = -0.78539816F;

		leftWingModel[41].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 243
		leftWingModel[41].setRotationPoint(66F, -18F, -79.5F);
		leftWingModel[41].rotateAngleX = -0.78539816F;

		leftWingModel[42].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 244
		leftWingModel[42].setRotationPoint(28F, -18F, -79.5F);
		leftWingModel[42].rotateAngleX = -2.35619449F;

		leftWingModel[43].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 245
		leftWingModel[43].setRotationPoint(66F, -18F, -79.5F);
		leftWingModel[43].rotateAngleX = -2.35619449F;

		leftWingModel[44].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 246
		leftWingModel[44].setRotationPoint(28F, -18F, -79.5F);
		leftWingModel[44].rotateAngleX = 2.35619449F;

		leftWingModel[45].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 247
		leftWingModel[45].setRotationPoint(66F, -18F, -79.5F);
		leftWingModel[45].rotateAngleX = 2.35619449F;

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingModel[46].setRotationPoint(21F, -21F, -66F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingModel[47].setRotationPoint(21F, -21F, -67F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 250
		leftWingModel[48].setRotationPoint(21F, -21F, -65F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 251
		leftWingModel[49].setRotationPoint(11F, -21F, -66F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 252
		leftWingModel[50].setRotationPoint(11F, -21F, -67F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 253
		leftWingModel[51].setRotationPoint(11F, -21F, -65F);

		leftWingModel[52].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 254
		leftWingModel[52].setRotationPoint(21F, -19.5F, -65.5F);
		leftWingModel[52].rotateAngleX = 0.78539816F;

		leftWingModel[53].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 255
		leftWingModel[53].setRotationPoint(21F, -19.5F, -65.5F);
		leftWingModel[53].rotateAngleX = -0.78539816F;

		leftWingModel[54].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 256
		leftWingModel[54].setRotationPoint(21F, -19.5F, -65.5F);
		leftWingModel[54].rotateAngleX = -2.35619449F;

		leftWingModel[55].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 257
		leftWingModel[55].setRotationPoint(21F, -19.5F, -65.5F);
		leftWingModel[55].rotateAngleX = 2.35619449F;

		leftWingModel[56].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 258
		leftWingModel[56].setRotationPoint(58F, -19.5F, -65.5F);
		leftWingModel[56].rotateAngleX = -2.35619449F;

		leftWingModel[57].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 259
		leftWingModel[57].setRotationPoint(58F, -19.5F, -65.5F);
		leftWingModel[57].rotateAngleX = -0.78539816F;

		leftWingModel[58].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 260
		leftWingModel[58].setRotationPoint(58F, -19.5F, -65.5F);
		leftWingModel[58].rotateAngleX = 2.35619449F;

		leftWingModel[59].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 261
		leftWingModel[59].setRotationPoint(58F, -19.5F, -65.5F);
		leftWingModel[59].rotateAngleX = 0.78539816F;

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 30, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftWingModel[60].setRotationPoint(16F, -25F, -57F);

		leftWingModel[61].addBox(0F, 0F, 0F, 30, 3, 9, 0F); // Box 346
		leftWingModel[61].setRotationPoint(16F, -22F, -57F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 30, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 347
		leftWingModel[62].setRotationPoint(16F, -19F, -57F);

		leftWingModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 348
		leftWingModel[63].setRotationPoint(15.8F, -24F, -53F);

		leftWingModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 349
		leftWingModel[64].setRotationPoint(15.8F, -24F, -55F);

		leftWingModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 350
		leftWingModel[65].setRotationPoint(15.8F, -24F, -51F);

		leftWingModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 351
		leftWingModel[66].setRotationPoint(15.8F, -22.5F, -54F);

		leftWingModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 352
		leftWingModel[67].setRotationPoint(15.8F, -22.5F, -52F);

		leftWingModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 353
		leftWingModel[68].setRotationPoint(15.8F, -22.5F, -50F);

		leftWingModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 354
		leftWingModel[69].setRotationPoint(15.8F, -22.5F, -56F);

		leftWingModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		leftWingModel[70].setRotationPoint(15.8F, -21F, -55F);

		leftWingModel[71].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		leftWingModel[71].setRotationPoint(15.8F, -21F, -51F);

		leftWingModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		leftWingModel[72].setRotationPoint(15.8F, -21F, -53F);

		leftWingModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 358
		leftWingModel[73].setRotationPoint(15.8F, -21F, -56.9F);

		leftWingModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 359
		leftWingModel[74].setRotationPoint(15.8F, -21F, -49.11F);

		leftWingModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 360
		leftWingModel[75].setRotationPoint(15.8F, -19.5F, -56F);

		leftWingModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 361
		leftWingModel[76].setRotationPoint(15.8F, -19.5F, -54F);

		leftWingModel[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 362
		leftWingModel[77].setRotationPoint(15.8F, -19.5F, -52F);

		leftWingModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		leftWingModel[78].setRotationPoint(15.8F, -19.5F, -50F);

		leftWingModel[79].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364
		leftWingModel[79].setRotationPoint(15.8F, -18F, -55F);

		leftWingModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 365
		leftWingModel[80].setRotationPoint(15.8F, -18F, -53F);

		leftWingModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 366
		leftWingModel[81].setRotationPoint(15.8F, -18F, -51F);


		rightWingModel = new ModelRendererTurbo[82];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 877, textureX, textureY); // Box 189
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 877, textureX, textureY); // Box 190
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 787, textureX, textureY); // Box 191
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 810, textureX, textureY); // Box 192
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 810, textureX, textureY); // Box 193
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 810, textureX, textureY); // Box 194
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 898, textureX, textureY); // Box 195
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 936, textureX, textureY); // Box 196
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 945, textureX, textureY); // Box 197
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 952, textureX, textureY); // Box 198
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 199
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 1008, textureX, textureY); // Box 212
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 1013, textureX, textureY); // Box 213
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 1008, textureX, textureY); // Box 214
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 1018, textureX, textureY); // Box 262
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 1018, textureX, textureY); // Box 263
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 1018, textureX, textureY); // Box 264
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 1033, textureX, textureY); // Box 265
		rightWingModel[18] = new ModelRendererTurbo(this, 200, 1056, textureX, textureY); // Box 266
		rightWingModel[19] = new ModelRendererTurbo(this, 200, 1042, textureX, textureY); // Box 267
		rightWingModel[20] = new ModelRendererTurbo(this, 200, 1049, textureX, textureY); // Box 268
		rightWingModel[21] = new ModelRendererTurbo(this, 200, 1049, textureX, textureY); // Box 269
		rightWingModel[22] = new ModelRendererTurbo(this, 200, 1068, textureX, textureY); // Box 270
		rightWingModel[23] = new ModelRendererTurbo(this, 200, 1078, textureX, textureY); // Box 271
		rightWingModel[24] = new ModelRendererTurbo(this, 200, 1078, textureX, textureY); // Box 272
		rightWingModel[25] = new ModelRendererTurbo(this, 200, 1078, textureX, textureY); // Box 273
		rightWingModel[26] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 274
		rightWingModel[27] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 275
		rightWingModel[28] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 276
		rightWingModel[29] = new ModelRendererTurbo(this, 200, 1114, textureX, textureY); // Box 277
		rightWingModel[30] = new ModelRendererTurbo(this, 200, 1114, textureX, textureY); // Box 278
		rightWingModel[31] = new ModelRendererTurbo(this, 200, 1114, textureX, textureY); // Box 279
		rightWingModel[32] = new ModelRendererTurbo(this, 200, 1163, textureX, textureY); // Box 280
		rightWingModel[33] = new ModelRendererTurbo(this, 200, 1163, textureX, textureY); // Box 281
		rightWingModel[34] = new ModelRendererTurbo(this, 200, 1163, textureX, textureY); // Box 282
		rightWingModel[35] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 283
		rightWingModel[36] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 284
		rightWingModel[37] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 285
		rightWingModel[38] = new ModelRendererTurbo(this, 200, 1178, textureX, textureY); // Box 286
		rightWingModel[39] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 287
		rightWingModel[40] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 288
		rightWingModel[41] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 289
		rightWingModel[42] = new ModelRendererTurbo(this, 200, 1173, textureX, textureY); // Box 290
		rightWingModel[43] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 291
		rightWingModel[44] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 292
		rightWingModel[45] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 293
		rightWingModel[46] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Box 294
		rightWingModel[47] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Box 295
		rightWingModel[48] = new ModelRendererTurbo(this, 200, 1140, textureX, textureY); // Box 296
		rightWingModel[49] = new ModelRendererTurbo(this, 200, 1131, textureX, textureY); // Box 297
		rightWingModel[50] = new ModelRendererTurbo(this, 200, 1131, textureX, textureY); // Box 298
		rightWingModel[51] = new ModelRendererTurbo(this, 200, 1131, textureX, textureY); // Box 299
		rightWingModel[52] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 300
		rightWingModel[53] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 301
		rightWingModel[54] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 302
		rightWingModel[55] = new ModelRendererTurbo(this, 200, 1156, textureX, textureY); // Box 303
		rightWingModel[56] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 304
		rightWingModel[57] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 305
		rightWingModel[58] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 306
		rightWingModel[59] = new ModelRendererTurbo(this, 200, 1149, textureX, textureY); // Box 307
		rightWingModel[60] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 367
		rightWingModel[61] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 368
		rightWingModel[62] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 369
		rightWingModel[63] = new ModelRendererTurbo(this, 200, 1184, textureX, textureY); // Box 370
		rightWingModel[64] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 371
		rightWingModel[65] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 372
		rightWingModel[66] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 373
		rightWingModel[67] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 374
		rightWingModel[68] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 375
		rightWingModel[69] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 376
		rightWingModel[70] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 377
		rightWingModel[71] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 378
		rightWingModel[72] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 379
		rightWingModel[73] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 380
		rightWingModel[74] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 381
		rightWingModel[75] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 382
		rightWingModel[76] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 383
		rightWingModel[77] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 384
		rightWingModel[78] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 385
		rightWingModel[79] = new ModelRendererTurbo(this, 200, 1184, textureX, textureY); // Box 386
		rightWingModel[80] = new ModelRendererTurbo(this, 200, 1197, textureX, textureY); // Box 387
		rightWingModel[81] = new ModelRendererTurbo(this, 200, 1184, textureX, textureY); // Box 388

		rightWingModel[0].addShapeBox(8F, 0F, -6F, 1, 1, 19, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightWingModel[0].setRotationPoint(-9F, -46F, 12.5F);
		rightWingModel[0].rotateAngleX = -0.2443461F;

		rightWingModel[1].addShapeBox(8F, 2F, -6F, 1, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 190
		rightWingModel[1].setRotationPoint(-9F, -46F, 12.5F);
		rightWingModel[1].rotateAngleX = -0.2443461F;

		rightWingModel[2].addShapeBox(10F, 0F, -6F, 43, 3, 19, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		rightWingModel[2].setRotationPoint(-10F, -46F, 12.5F);
		rightWingModel[2].rotateAngleX = -0.2443461F;

		rightWingModel[3].addShapeBox(10F, 1F, 13F, 44, 1, 65, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -46F, 0F, 0F); // Box 192
		rightWingModel[3].setRotationPoint(-11F, -46F, 12.5F);
		rightWingModel[3].rotateAngleX = -0.2443461F;

		rightWingModel[4].addShapeBox(10F, 0F, 13F, 44, 1, 65, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -46F, 0F, 0F); // Box 193
		rightWingModel[4].setRotationPoint(-11F, -46F, 12.5F);
		rightWingModel[4].rotateAngleX = -0.2443461F;

		rightWingModel[5].addShapeBox(10F, 2F, 13F, 44, 1, 65, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -46F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -47F, 0F, 0F); // Box 194
		rightWingModel[5].setRotationPoint(-11F, -46F, 12.5F);
		rightWingModel[5].rotateAngleX = -0.2443461F;

		rightWingModel[6].addShapeBox(77F, 0F, 44F, 7, 3, 34, 0F, 12F, 0F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rightWingModel[6].setRotationPoint(-11F, -46F, 12.5F);
		rightWingModel[6].rotateAngleX = -0.2443461F;

		rightWingModel[7].addShapeBox(65F, 0F, 40F, 27, 3, 4, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightWingModel[7].setRotationPoint(-11F, -46F, 12.5F);
		rightWingModel[7].rotateAngleX = -0.2443461F;

		rightWingModel[8].addShapeBox(65F, 3F, 40F, 27, 2, 4, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightWingModel[8].setRotationPoint(-11F, -46F, 12.5F);
		rightWingModel[8].rotateAngleX = -0.2443461F;

		rightWingModel[9].addShapeBox(64F, 0F, 13F, 12, 3, 27, 0F, 11F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1.4F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F); // Box 198
		rightWingModel[9].setRotationPoint(-10F, -46F, 12.5F);
		rightWingModel[9].rotateAngleX = -0.2443461F;

		rightWingModel[10].addShapeBox(53F, 0F, -6F, 23, 3, 19, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightWingModel[10].setRotationPoint(-10F, -46F, 12.5F);
		rightWingModel[10].rotateAngleX = -0.2443461F;

		rightWingModel[11].addShapeBox(93F, 0F, 41F, 4, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightWingModel[11].setRotationPoint(-12F, -46F, 12.5F);
		rightWingModel[11].rotateAngleX = -0.2443461F;

		rightWingModel[12].addBox(93F, 1F, 41F, 4, 2, 2, 0F); // Box 213
		rightWingModel[12].setRotationPoint(-12F, -46F, 12.5F);
		rightWingModel[12].rotateAngleX = -0.2443461F;

		rightWingModel[13].addShapeBox(93F, 3F, 41F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 214
		rightWingModel[13].setRotationPoint(-12F, -46F, 12.5F);
		rightWingModel[13].rotateAngleX = -0.2443461F;

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 42, 13, 1, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 262
		rightWingModel[14].setRotationPoint(13F, -38F, 32.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 42, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 10F, 0F, 0F); // Box 263
		rightWingModel[15].setRotationPoint(13F, -38F, 34.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 42, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 264
		rightWingModel[16].setRotationPoint(13F, -38F, 33.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 27, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 265
		rightWingModel[17].setRotationPoint(22F, -34F, 51.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 25, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 266
		rightWingModel[18].setRotationPoint(32F, -30F, 64.5F);

		rightWingModel[19].addBox(0F, 0F, 0F, 33, 3, 3, 0F); // Box 267
		rightWingModel[19].setRotationPoint(16F, -28F, 51F);

		rightWingModel[20].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 268
		rightWingModel[20].setRotationPoint(13F, -28F, 51F);

		rightWingModel[21].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 269
		rightWingModel[21].setRotationPoint(49F, -28F, 51F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 25, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 270
		rightWingModel[22].setRotationPoint(41F, -27F, 78.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 271
		rightWingModel[23].setRotationPoint(3F, -25F, 36F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightWingModel[24].setRotationPoint(3F, -25F, 28F);

		rightWingModel[25].addBox(0F, 0F, 0F, 47, 12, 4, 0F); // Box 273
		rightWingModel[25].setRotationPoint(3F, -25F, 32F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 274
		rightWingModel[26].setRotationPoint(-9F, -25F, 28F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 275
		rightWingModel[27].setRotationPoint(-9F, -25F, 32F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 12, 12, 4, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 276
		rightWingModel[28].setRotationPoint(-9F, -25F, 36F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 277
		rightWingModel[29].setRotationPoint(50F, -25F, 28F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 278
		rightWingModel[30].setRotationPoint(50F, -25F, 32F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 279
		rightWingModel[31].setRotationPoint(50F, -25F, 36F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingModel[32].setRotationPoint(21F, -21F, 64F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[33].setRotationPoint(21F, -21F, 65F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282
		rightWingModel[34].setRotationPoint(21F, -21F, 66F);

		rightWingModel[35].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 283
		rightWingModel[35].setRotationPoint(58F, -19.5F, 65.5F);
		rightWingModel[35].rotateAngleX = 2.35619449F;

		rightWingModel[36].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 284
		rightWingModel[36].setRotationPoint(58F, -19.5F, 65.5F);
		rightWingModel[36].rotateAngleX = -2.35619449F;

		rightWingModel[37].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 285
		rightWingModel[37].setRotationPoint(58F, -19.5F, 65.5F);
		rightWingModel[37].rotateAngleX = -0.78539816F;

		rightWingModel[38].addShapeBox(0F, 1F, -0.5F, 12, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 286
		rightWingModel[38].setRotationPoint(58F, -19.5F, 65.5F);
		rightWingModel[38].rotateAngleX = 0.78539816F;

		rightWingModel[39].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 287
		rightWingModel[39].setRotationPoint(21F, -19.5F, 65.5F);
		rightWingModel[39].rotateAngleX = -2.35619449F;

		rightWingModel[40].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 288
		rightWingModel[40].setRotationPoint(21F, -19.5F, 65.5F);
		rightWingModel[40].rotateAngleX = -0.78539816F;

		rightWingModel[41].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 289
		rightWingModel[41].setRotationPoint(21F, -19.5F, 65.5F);
		rightWingModel[41].rotateAngleX = 2.35619449F;

		rightWingModel[42].addShapeBox(0F, 1F, -0.5F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 290
		rightWingModel[42].setRotationPoint(21F, -19.5F, 65.5F);
		rightWingModel[42].rotateAngleX = 0.78539816F;

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 291
		rightWingModel[43].setRotationPoint(11F, -21F, 66F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 292
		rightWingModel[44].setRotationPoint(11F, -21F, 64F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 293
		rightWingModel[45].setRotationPoint(11F, -21F, 65F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -2.5F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2.5F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F); // Box 294
		rightWingModel[46].setRotationPoint(20F, -21F, 76.5F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F); // Box 295
		rightWingModel[47].setRotationPoint(20F, -21F, 78.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, -2F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, -2F); // Box 296
		rightWingModel[48].setRotationPoint(20F, -21F, 80.5F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 45, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 297
		rightWingModel[49].setRotationPoint(25F, -21F, 80.5F);

		rightWingModel[50].addBox(0F, 0F, 0F, 45, 6, 2, 0F); // Box 298
		rightWingModel[50].setRotationPoint(25F, -21F, 78.5F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 45, 6, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[51].setRotationPoint(25F, -21F, 76.5F);

		rightWingModel[52].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 300
		rightWingModel[52].setRotationPoint(28F, -18F, 79.5F);
		rightWingModel[52].rotateAngleX = 0.78539816F;

		rightWingModel[53].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 301
		rightWingModel[53].setRotationPoint(28F, -18F, 79.5F);
		rightWingModel[53].rotateAngleX = 2.35619449F;

		rightWingModel[54].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 302
		rightWingModel[54].setRotationPoint(28F, -18F, 79.5F);
		rightWingModel[54].rotateAngleX = -2.35619449F;

		rightWingModel[55].addShapeBox(0F, 2F, -0.5F, 35, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 303
		rightWingModel[55].setRotationPoint(28F, -18F, 79.5F);
		rightWingModel[55].rotateAngleX = -0.78539816F;

		rightWingModel[56].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 304
		rightWingModel[56].setRotationPoint(66F, -18F, 79.5F);
		rightWingModel[56].rotateAngleX = -2.35619449F;

		rightWingModel[57].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 305
		rightWingModel[57].setRotationPoint(66F, -18F, 79.5F);
		rightWingModel[57].rotateAngleX = -0.78539816F;

		rightWingModel[58].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 306
		rightWingModel[58].setRotationPoint(66F, -18F, 79.5F);
		rightWingModel[58].rotateAngleX = 2.35619449F;

		rightWingModel[59].addBox(0F, 2F, -0.5F, 3, 4, 1, 0F); // Box 307
		rightWingModel[59].setRotationPoint(66F, -18F, 79.5F);
		rightWingModel[59].rotateAngleX = 0.78539816F;

		rightWingModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 367
		rightWingModel[60].setRotationPoint(15.8F, -18F, 54F);

		rightWingModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 368
		rightWingModel[61].setRotationPoint(15.8F, -18F, 52F);

		rightWingModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 369
		rightWingModel[62].setRotationPoint(15.8F, -18F, 50F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 30, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 370
		rightWingModel[63].setRotationPoint(16F, -19F, 48F);

		rightWingModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 371
		rightWingModel[64].setRotationPoint(15.8F, -19.5F, 55F);

		rightWingModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 372
		rightWingModel[65].setRotationPoint(15.8F, -19.5F, 53F);

		rightWingModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 373
		rightWingModel[66].setRotationPoint(15.8F, -19.5F, 51F);

		rightWingModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 374
		rightWingModel[67].setRotationPoint(15.8F, -19.5F, 49F);

		rightWingModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 375
		rightWingModel[68].setRotationPoint(15.8F, -21F, 48.11F);

		rightWingModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 376
		rightWingModel[69].setRotationPoint(15.8F, -21F, 50F);

		rightWingModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 377
		rightWingModel[70].setRotationPoint(15.8F, -21F, 52F);

		rightWingModel[71].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 378
		rightWingModel[71].setRotationPoint(15.8F, -21F, 54F);

		rightWingModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 379
		rightWingModel[72].setRotationPoint(15.8F, -21F, 55.9F);

		rightWingModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 380
		rightWingModel[73].setRotationPoint(15.8F, -22.5F, 55F);

		rightWingModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 381
		rightWingModel[74].setRotationPoint(15.8F, -22.5F, 53F);

		rightWingModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 382
		rightWingModel[75].setRotationPoint(15.8F, -22.5F, 51F);

		rightWingModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		rightWingModel[76].setRotationPoint(15.8F, -22.5F, 49F);

		rightWingModel[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384
		rightWingModel[77].setRotationPoint(15.8F, -24F, 50F);

		rightWingModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 385
		rightWingModel[78].setRotationPoint(15.8F, -24F, 52F);

		rightWingModel[79].addBox(0F, 0F, 0F, 30, 3, 9, 0F); // Box 386
		rightWingModel[79].setRotationPoint(16F, -22F, 48F);

		rightWingModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		rightWingModel[80].setRotationPoint(15.8F, -24F, 54F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 30, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		rightWingModel[81].setRotationPoint(16F, -25F, 48F);


		bodyWheelModel = new ModelRendererTurbo[10];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Box 308
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Box 309
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 1209, textureX, textureY); // Box 310
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 1223, textureX, textureY); // Box 311
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 1229, textureX, textureY); // Box 312
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 1237, textureX, textureY); // Box 313
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 1237, textureX, textureY); // Box 314
		bodyWheelModel[7] = new ModelRendererTurbo(this, 200, 1245, textureX, textureY); // Box 315
		bodyWheelModel[8] = new ModelRendererTurbo(this, 200, 1258, textureX, textureY); // Box 316
		bodyWheelModel[9] = new ModelRendererTurbo(this, 200, 1258, textureX, textureY); // Box 317

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 308
		bodyWheelModel[0].setRotationPoint(-62F, -13F, -3.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 309
		bodyWheelModel[1].setRotationPoint(-62F, -13F, 2.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyWheelModel[2].setRotationPoint(-47F, -13F, -1.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyWheelModel[3].setRotationPoint(-46.5F, -3F, -1F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyWheelModel[4].setRotationPoint(-47F, -2F, -3F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 313
		bodyWheelModel[5].setRotationPoint(-47F, -1F, -3F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 314
		bodyWheelModel[6].setRotationPoint(-47F, -1F, 2F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 12, 8, 4, 0F); // Box 315
		bodyWheelModel[7].setRotationPoint(-46F, -1F, -2F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyWheelModel[8].setRotationPoint(-46F, -3F, -2F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 317
		bodyWheelModel[9].setRotationPoint(-46F, 7F, -2F);


		tailWheelModel = new ModelRendererTurbo[13];
		tailWheelModel[0] = new ModelRendererTurbo(this, 200, 1266, textureX, textureY); // Box 332
		tailWheelModel[1] = new ModelRendererTurbo(this, 200, 1274, textureX, textureY); // Box 333
		tailWheelModel[2] = new ModelRendererTurbo(this, 200, 1274, textureX, textureY); // Box 334
		tailWheelModel[3] = new ModelRendererTurbo(this, 200, 1295, textureX, textureY); // Box 335
		tailWheelModel[4] = new ModelRendererTurbo(this, 200, 1295, textureX, textureY); // Box 336
		tailWheelModel[5] = new ModelRendererTurbo(this, 200, 1304, textureX, textureY); // Box 337
		tailWheelModel[6] = new ModelRendererTurbo(this, 200, 1258, textureX, textureY); // Box 338
		tailWheelModel[7] = new ModelRendererTurbo(this, 200, 1245, textureX, textureY); // Box 339
		tailWheelModel[8] = new ModelRendererTurbo(this, 200, 1258, textureX, textureY); // Box 340
		tailWheelModel[9] = new ModelRendererTurbo(this, 200, 1258, textureX, textureY); // Box 341
		tailWheelModel[10] = new ModelRendererTurbo(this, 200, 1245, textureX, textureY); // Box 342
		tailWheelModel[11] = new ModelRendererTurbo(this, 200, 1258, textureX, textureY); // Box 343
		tailWheelModel[12] = new ModelRendererTurbo(this, 200, 1321, textureX, textureY); // Box 344

		tailWheelModel[0].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 332
		tailWheelModel[0].setRotationPoint(52F, -10F, -2F);

		tailWheelModel[1].addBox(0F, 0F, 0F, 2, 10, 10, 0F); // Box 333
		tailWheelModel[1].setRotationPoint(52F, -7F, -5F);

		tailWheelModel[2].addBox(0F, 6F, 0F, 2, 10, 10, 0F); // Box 334
		tailWheelModel[2].setRotationPoint(72F, -13F, -5F);
		tailWheelModel[2].rotateAngleZ = 0.89011792F;

		tailWheelModel[3].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 335
		tailWheelModel[3].setRotationPoint(72F, -13F, 3F);
		tailWheelModel[3].rotateAngleZ = 0.89011792F;

		tailWheelModel[4].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 336
		tailWheelModel[4].setRotationPoint(72F, -13F, -5F);
		tailWheelModel[4].rotateAngleZ = 0.89011792F;

		tailWheelModel[5].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 337
		tailWheelModel[5].setRotationPoint(61F, -11F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		tailWheelModel[6].setRotationPoint(56F, -2F, 1F);

		tailWheelModel[7].addBox(0F, 0F, 0F, 12, 8, 4, 0F); // Box 339
		tailWheelModel[7].setRotationPoint(56F, 0F, 1F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 340
		tailWheelModel[8].setRotationPoint(56F, 8F, 1F);

		tailWheelModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		tailWheelModel[9].setRotationPoint(56F, -2F, -5F);

		tailWheelModel[10].addBox(0F, 0F, 0F, 12, 8, 4, 0F); // Box 342
		tailWheelModel[10].setRotationPoint(56F, 0F, -5F);

		tailWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 343
		tailWheelModel[11].setRotationPoint(56F, 8F, -5F);

		tailWheelModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 344
		tailWheelModel[12].setRotationPoint(64F, -7F, -1F);


		leftWingWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1328, textureX, textureY); // Box 318
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1349, textureX, textureY); // Box 319
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1366, textureX, textureY); // Box 320
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1371, textureX, textureY); // Box 321
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1366, textureX, textureY); // Box 322
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1377, textureX, textureY); // Box 323
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 324

		leftWingWheelModel[0].addBox(0F, 3F, 0F, 3, 17, 3, 0F); // Box 318
		leftWingWheelModel[0].setRotationPoint(61F, -36F, -53.5F);

		leftWingWheelModel[1].addBox(0F, 3F, 0F, 2, 14, 2, 0F); // Box 319
		leftWingWheelModel[1].setRotationPoint(61.5F, -19F, -53F);

		leftWingWheelModel[2].addShapeBox(0F, 3F, 0F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftWingWheelModel[2].setRotationPoint(59.5F, 1F, -53F);

		leftWingWheelModel[3].addBox(0F, 3F, 0F, 6, 2, 2, 0F); // Box 321
		leftWingWheelModel[3].setRotationPoint(59.5F, 3F, -53F);

		leftWingWheelModel[4].addShapeBox(0F, 3F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 322
		leftWingWheelModel[4].setRotationPoint(59.5F, 5F, -53F);

		leftWingWheelModel[5].addBox(0F, 3F, 0F, 1, 6, 1, 0F); // Box 323
		leftWingWheelModel[5].setRotationPoint(62F, -5F, -52.5F);

		leftWingWheelModel[6].addBox(0F, 3F, 0F, 2, 6, 3, 0F); // Box 324
		leftWingWheelModel[6].setRotationPoint(61.5F, -2F, -53.5F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1328, textureX, textureY); // Box 325
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1349, textureX, textureY); // Box 326
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1377, textureX, textureY); // Box 327
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 328
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1366, textureX, textureY); // Box 329
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1371, textureX, textureY); // Box 330
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1366, textureX, textureY); // Box 331

		rightWingWheelModel[0].addBox(0F, 3F, 0F, 3, 17, 3, 0F); // Box 325
		rightWingWheelModel[0].setRotationPoint(61F, -36F, 50.5F);

		rightWingWheelModel[1].addBox(0F, 3F, 0F, 2, 14, 2, 0F); // Box 326
		rightWingWheelModel[1].setRotationPoint(61.5F, -19F, 51F);

		rightWingWheelModel[2].addBox(0F, 3F, 0F, 1, 6, 1, 0F); // Box 327
		rightWingWheelModel[2].setRotationPoint(62F, -5F, 51.5F);

		rightWingWheelModel[3].addBox(0F, 3F, 0F, 2, 6, 3, 0F); // Box 328
		rightWingWheelModel[3].setRotationPoint(61.5F, -2F, 50.5F);

		rightWingWheelModel[4].addShapeBox(0F, 3F, 0F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightWingWheelModel[4].setRotationPoint(59.5F, 1F, 51F);

		rightWingWheelModel[5].addBox(0F, 3F, 0F, 6, 2, 2, 0F); // Box 330
		rightWingWheelModel[5].setRotationPoint(59.5F, 3F, 51F);

		rightWingWheelModel[6].addShapeBox(0F, 3F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 331
		rightWingWheelModel[6].setRotationPoint(59.5F, 5F, 51F);
		
		
		propellerModels = new ModelRendererTurbo[1][24];
		propellerModels[0] = makeProp1(-35F, -27F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[24];
		prop[0] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[8] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[9] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[10] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[11] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[12] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[13] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[14] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[15] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[16] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[17] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[18] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[19] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[20] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[21] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[22] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[23] = new ModelRendererTurbo(this, 206, 70, textureX, textureY);
		prop[0].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[1].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[2].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[3].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[4].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[5].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[6].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[7].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[8].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[9].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[10].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[11].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[12].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[13].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[14].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[15].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[16].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[17].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[18].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[19].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[20].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[21].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[22].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[23].addBox(-0.5F, -17F, -0.5F, 1, 17, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		prop[8].setRotationPoint(i, j, k);
		prop[9].setRotationPoint(i, j, k);
		prop[10].setRotationPoint(i, j, k);
		prop[11].setRotationPoint(i, j, k);
		prop[12].setRotationPoint(i, j, k);
		prop[13].setRotationPoint(i, j, k);
		prop[14].setRotationPoint(i, j, k);
		prop[15].setRotationPoint(i, j, k);
		prop[16].setRotationPoint(i, j, k);
		prop[17].setRotationPoint(i, j, k);
		prop[18].setRotationPoint(i, j, k);
		prop[19].setRotationPoint(i, j, k);
		prop[20].setRotationPoint(i, j, k);
		prop[21].setRotationPoint(i, j, k);
		prop[22].setRotationPoint(i, j, k);
		prop[23].setRotationPoint(i, j, k);
		return prop;
	}
}
