//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.10
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelTyphoon extends ModelPlane
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelTyphoon()
	{
		bodyModel = new ModelRendererTurbo[195];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 209, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 0, 218, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 0, 223, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 0, 229, textureX, textureY); // Box 17
		bodyModel[4] = new ModelRendererTurbo(this, 0, 229, textureX, textureY); // Box 18
		bodyModel[5] = new ModelRendererTurbo(this, 0, 223, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 0, 218, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 0, 279, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 0, 288, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 0, 288, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 0, 347, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 0, 377, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 0, 377, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 0, 347, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 0, 392, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 0, 438, textureX, textureY); // Box 46
		bodyModel[29] = new ModelRendererTurbo(this, 0, 448, textureX, textureY); // Box 47
		bodyModel[30] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 0, 459, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 0, 466, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 0, 476, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 0, 476, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Box 54
		bodyModel[37] = new ModelRendererTurbo(this, 0, 466, textureX, textureY); // Box 55
		bodyModel[38] = new ModelRendererTurbo(this, 0, 459, textureX, textureY); // Box 56
		bodyModel[39] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 57
		bodyModel[40] = new ModelRendererTurbo(this, 0, 448, textureX, textureY); // Box 58
		bodyModel[41] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 0, 506, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 0, 511, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 0, 516, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 0, 521, textureX, textureY); // Box 64
		bodyModel[46] = new ModelRendererTurbo(this, 0, 516, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 0, 511, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 0, 506, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 0, 521, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 0, 549, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 0, 578, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 0, 578, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 0, 596, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 0, 634, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 0, 651, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 0, 668, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 0, 703, textureX, textureY); // Box 86
		bodyModel[67] = new ModelRendererTurbo(this, 0, 714, textureX, textureY); // Box 87
		bodyModel[68] = new ModelRendererTurbo(this, 0, 736, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 0, 758, textureX, textureY); // Box 90
		bodyModel[70] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 91
		bodyModel[71] = new ModelRendererTurbo(this, 0, 804, textureX, textureY); // Box 92
		bodyModel[72] = new ModelRendererTurbo(this, 0, 825, textureX, textureY); // Box 93
		bodyModel[73] = new ModelRendererTurbo(this, 0, 846, textureX, textureY); // Box 95
		bodyModel[74] = new ModelRendererTurbo(this, 0, 863, textureX, textureY); // Box 96
		bodyModel[75] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 98
		bodyModel[76] = new ModelRendererTurbo(this, 0, 896, textureX, textureY); // Box 99
		bodyModel[77] = new ModelRendererTurbo(this, 0, 863, textureX, textureY); // Box 100
		bodyModel[78] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Box 101
		bodyModel[79] = new ModelRendererTurbo(this, 0, 714, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 0, 736, textureX, textureY); // Box 105
		bodyModel[81] = new ModelRendererTurbo(this, 0, 758, textureX, textureY); // Box 106
		bodyModel[82] = new ModelRendererTurbo(this, 0, 912, textureX, textureY); // Box 114
		bodyModel[83] = new ModelRendererTurbo(this, 0, 924, textureX, textureY); // Box 115
		bodyModel[84] = new ModelRendererTurbo(this, 0, 938, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 0, 943, textureX, textureY); // Box 107
		bodyModel[86] = new ModelRendererTurbo(this, 0, 947, textureX, textureY); // Box 108
		bodyModel[87] = new ModelRendererTurbo(this, 0, 951, textureX, textureY); // Box 109
		bodyModel[88] = new ModelRendererTurbo(this, 0, 956, textureX, textureY); // Box 110
		bodyModel[89] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 111
		bodyModel[90] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 112
		bodyModel[91] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 113
		bodyModel[92] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 114
		bodyModel[93] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 115
		bodyModel[94] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Box 116
		bodyModel[95] = new ModelRendererTurbo(this, 0, 969, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 0, 969, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 0, 969, textureX, textureY); // Box 121
		bodyModel[98] = new ModelRendererTurbo(this, 0, 973, textureX, textureY); // Box 122
		bodyModel[99] = new ModelRendererTurbo(this, 0, 979, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 0, 979, textureX, textureY); // Box 129
		bodyModel[101] = new ModelRendererTurbo(this, 0, 986, textureX, textureY); // Box 130
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1007, textureX, textureY); // Box 131
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Box 132
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1038, textureX, textureY); // Box 133
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1050, textureX, textureY); // Box 135
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Box 136
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1086, textureX, textureY); // Box 137
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1099, textureX, textureY); // Box 138
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 139
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1149, textureX, textureY); // Box 140
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 142
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1198, textureX, textureY); // Box 143
		bodyModel[113] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 144
		bodyModel[114] = new ModelRendererTurbo(this, 0, 896, textureX, textureY); // Box 145
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1214, textureX, textureY); // Box 146
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1221, textureX, textureY); // Box 147
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Box 148
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1232, textureX, textureY); // Box 149
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1214, textureX, textureY); // Box 150
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1221, textureX, textureY); // Box 151
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Box 152
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1232, textureX, textureY); // Box 153
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY); // Box 145
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Box 146
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Box 147
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 148
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Box 149
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1260, textureX, textureY); // Box 150
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 151
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1237, textureX, textureY); // Box 152
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 153
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 154
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Box 155
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1299, textureX, textureY); // Box 156
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1335, textureX, textureY); // Box 157
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1379, textureX, textureY); // Box 158
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1422, textureX, textureY); // Box 159
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1454, textureX, textureY); // Box 160
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1491, textureX, textureY); // Box 161
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1534, textureX, textureY); // Box 162
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1577, textureX, textureY); // Box 163
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1609, textureX, textureY); // Box 164
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1664, textureX, textureY); // Box 165
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1709, textureX, textureY); // Box 166
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1724, textureX, textureY); // Box 167
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1743, textureX, textureY); // Box 168
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1755, textureX, textureY); // Box 169
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1765, textureX, textureY); // Box 170
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1822, textureX, textureY); // Box 171
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1872, textureX, textureY); // Box 172
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1915, textureX, textureY); // Box 173
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1958, textureX, textureY); // Box 174
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1990, textureX, textureY); // Box 175
		bodyModel[154] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 176
		bodyModel[155] = new ModelRendererTurbo(this, 200, 175, textureX, textureY); // Box 178
		bodyModel[156] = new ModelRendererTurbo(this, 200, 185, textureX, textureY); // Box 179
		bodyModel[157] = new ModelRendererTurbo(this, 200, 197, textureX, textureY); // Box 180
		bodyModel[158] = new ModelRendererTurbo(this, 205, 240, textureX, textureY); // Box 181
		bodyModel[159] = new ModelRendererTurbo(this, 200, 283, textureX, textureY); // Box 182
		bodyModel[160] = new ModelRendererTurbo(this, 200, 315, textureX, textureY); // Box 184
		bodyModel[161] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Box 185
		bodyModel[162] = new ModelRendererTurbo(this, 200, 411, textureX, textureY); // Box 186
		bodyModel[163] = new ModelRendererTurbo(this, 200, 454, textureX, textureY); // Box 187
		bodyModel[164] = new ModelRendererTurbo(this, 200, 486, textureX, textureY); // Box 188
		bodyModel[165] = new ModelRendererTurbo(this, 200, 486, textureX, textureY); // Box 189
		bodyModel[166] = new ModelRendererTurbo(this, 200, 505, textureX, textureY); // Box 243
		bodyModel[167] = new ModelRendererTurbo(this, 200, 518, textureX, textureY); // Box 244
		bodyModel[168] = new ModelRendererTurbo(this, 200, 528, textureX, textureY); // Box 245
		bodyModel[169] = new ModelRendererTurbo(this, 200, 537, textureX, textureY); // Box 246
		bodyModel[170] = new ModelRendererTurbo(this, 200, 546, textureX, textureY); // Box 247
		bodyModel[171] = new ModelRendererTurbo(this, 200, 557, textureX, textureY); // Box 248
		bodyModel[172] = new ModelRendererTurbo(this, 200, 569, textureX, textureY); // Box 249
		bodyModel[173] = new ModelRendererTurbo(this, 200, 579, textureX, textureY); // Box 250
		bodyModel[174] = new ModelRendererTurbo(this, 200, 588, textureX, textureY); // Box 251
		bodyModel[175] = new ModelRendererTurbo(this, 200, 596, textureX, textureY); // Box 236
		bodyModel[176] = new ModelRendererTurbo(this, 200, 607, textureX, textureY); // Box 237
		bodyModel[177] = new ModelRendererTurbo(this, 200, 618, textureX, textureY); // Box 238
		bodyModel[178] = new ModelRendererTurbo(this, 200, 626, textureX, textureY); // Box 239
		bodyModel[179] = new ModelRendererTurbo(this, 200, 626, textureX, textureY); // Box 240
		bodyModel[180] = new ModelRendererTurbo(this, 200, 626, textureX, textureY); // Box 241
		bodyModel[181] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Box 242
		bodyModel[182] = new ModelRendererTurbo(this, 200, 649, textureX, textureY); // Box 243
		bodyModel[183] = new ModelRendererTurbo(this, 200, 658, textureX, textureY); // Box 244
		bodyModel[184] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 245
		bodyModel[185] = new ModelRendererTurbo(this, 200, 677, textureX, textureY); // Box 246
		bodyModel[186] = new ModelRendererTurbo(this, 200, 677, textureX, textureY); // Box 247
		bodyModel[187] = new ModelRendererTurbo(this, 200, 677, textureX, textureY); // Box 248
		bodyModel[188] = new ModelRendererTurbo(this, 200, 735, textureX, textureY); // Box 249
		bodyModel[189] = new ModelRendererTurbo(this, 200, 735, textureX, textureY); // Box 250
		bodyModel[190] = new ModelRendererTurbo(this, 200, 745, textureX, textureY); // Box 252
		bodyModel[191] = new ModelRendererTurbo(this, 200, 745, textureX, textureY); // Box 253
		bodyModel[192] = new ModelRendererTurbo(this, 200, 735, textureX, textureY); // Box 254
		bodyModel[193] = new ModelRendererTurbo(this, 200, 745, textureX, textureY); // Box 255
		bodyModel[194] = new ModelRendererTurbo(this, 205, 801, textureX, textureY); // Box 561

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[0].setRotationPoint(-115F, -48.5F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 1F, 0F, -4F, 1F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[1].setRotationPoint(-115F, -48.5F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -5F, 0.5F, 0F, -4F, 0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[2].setRotationPoint(-112F, -48.5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 4F, 0.5F, 0F); // Box 17
		bodyModel[3].setRotationPoint(-103F, -48.5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -12F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -8F, 0.5F, 0F); // Box 18
		bodyModel[4].setRotationPoint(-103F, -48.5F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -4F, 0.5F, 0F, -5F, 0.5F, 0F); // Box 19
		bodyModel[5].setRotationPoint(-112F, -48.5F, 5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 1F, 0F, -3F, 1F, 0F); // Box 20
		bodyModel[6].setRotationPoint(-115F, -48.5F, 3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F, 0F, -7F, 0F, 0F, -7F, 0.5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 21
		bodyModel[7].setRotationPoint(-115F, -46.5F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 14, 7, 0F, 0F, -7F, 0.5F, 0F, -7F, 1F, 0F, -1.5F, -4F, 0F, -1F, -3F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 22
		bodyModel[8].setRotationPoint(-108F, -46.5F, -10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F); // Box 23
		bodyModel[9].setRotationPoint(-115F, -46.5F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 14, 7, 0F, 0F, -7F, 1F, 0F, -7F, 1.5F, 0F, -1.5F, -5.5F, 0F, -1.5F, -4F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 24
		bodyModel[10].setRotationPoint(-103F, -46.5F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 14, 7, 0F, 0F, -7F, 1.5F, 0F, -7F, 2.5F, 0F, -1.5F, -5.5F, 0F, -1.5F, -5.5F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 25
		bodyModel[11].setRotationPoint(-95F, -46.5F, -10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 14, 7, 0F, 0F, -1.5F, -5.5F, 0F, -1.5F, -5.5F, 0F, -7F, 2.5F, 0F, -7F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 1.5F); // Box 30
		bodyModel[12].setRotationPoint(-95F, -46.5F, 3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 31
		bodyModel[13].setRotationPoint(-115F, -46.5F, 3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 14, 7, 0F, 0F, -1F, -3F, 0F, -1.5F, -4F, 0F, -7F, 1F, 0F, -7F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 32
		bodyModel[14].setRotationPoint(-108F, -46.5F, 3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 14, 7, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -5.5F, 0F, -7F, 1.5F, 0F, -7F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 33
		bodyModel[15].setRotationPoint(-103F, -46.5F, 3.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 34
		bodyModel[16].setRotationPoint(-115F, -32.5F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 35
		bodyModel[17].setRotationPoint(-108F, -32.5F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 36
		bodyModel[18].setRotationPoint(-103F, -32.5F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 7, 7, 0F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 37
		bodyModel[19].setRotationPoint(-95F, -32.5F, -10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -5F, 0F, 0F, -6F); // Box 38
		bodyModel[20].setRotationPoint(-95F, -32.5F, 3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -6.5F, 0F, 0F, -7F); // Box 39
		bodyModel[21].setRotationPoint(-115F, -32.5F, 3.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -6F, 0F, 0F, -6.5F); // Box 40
		bodyModel[22].setRotationPoint(-108F, -32.5F, 3.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 41
		bodyModel[23].setRotationPoint(-103F, -32.5F, 3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 7, 16, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -8F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[24].setRotationPoint(-97F, -53F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 22, 7, 10, 0F, 0F, -6F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, -4F, 0F, 0F, 0F, -8F, 0F, 3F, -8F, 0F, 3F, 0F, 0F, 0F); // Box 43
		bodyModel[25].setRotationPoint(-111F, -53F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[26].setRotationPoint(-89F, -56F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[27].setRotationPoint(-89F, -56F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[28].setRotationPoint(-89.5F, -58F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[29].setRotationPoint(-83F, -48.5F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 48
		bodyModel[30].setRotationPoint(-51F, -52.5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 49
		bodyModel[31].setRotationPoint(-43F, -53.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 50
		bodyModel[32].setRotationPoint(-37F, -54.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[33].setRotationPoint(-34F, -56.5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[34].setRotationPoint(-34F, -57.5F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[35].setRotationPoint(-34F, -57.5F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F); // Box 54
		bodyModel[36].setRotationPoint(-34F, -56.5F, 3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 55
		bodyModel[37].setRotationPoint(-37F, -54.5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[38].setRotationPoint(-43F, -53.5F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 57
		bodyModel[39].setRotationPoint(-51F, -52.5F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 32, 3, 1, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F); // Box 58
		bodyModel[40].setRotationPoint(-83F, -48.5F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 32, 14, 7, 0F, 0F, -7F, 2.5F, 0F, -4F, 4F, 0F, 2F, -5.5F, 0F, -1.5F, -5.5F, 0F, 0F, 2.5F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 59
		bodyModel[41].setRotationPoint(-83F, -46.5F, -10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[42].setRotationPoint(-84.5F, -51.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[43].setRotationPoint(-85.5F, -54.5F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[44].setRotationPoint(-86.5F, -57.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 2F, 0.5F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[45].setRotationPoint(-87.5F, -59.5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[46].setRotationPoint(-86.5F, -57.5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[47].setRotationPoint(-85.5F, -54.5F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[48].setRotationPoint(-84.5F, -51.5F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, -0.5F, 2F, -0.5F, -0.5F, 2F, -0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[49].setRotationPoint(-87.5F, -59.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[50].setRotationPoint(-88F, -60F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[51].setRotationPoint(-83F, -35.5F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[52].setRotationPoint(-91F, -46F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(-83F, -38.5F, -7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[54].setRotationPoint(-79F, -38.5F, -7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[55].setRotationPoint(-77F, -38.5F, -7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[56].setRotationPoint(-77F, -38.5F, 5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[57].setRotationPoint(-79F, -38.5F, 5.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[58].setRotationPoint(-83F, -38.5F, 5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 22, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[59].setRotationPoint(-70F, -54.5F, -7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[60].setRotationPoint(-71F, -59.5F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[61].setRotationPoint(-69F, -59.5F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 82
		bodyModel[62].setRotationPoint(-72F, -59.5F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 83
		bodyModel[63].setRotationPoint(-71F, -51.5F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 84
		bodyModel[64].setRotationPoint(-71F, -46.5F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 85
		bodyModel[65].setRotationPoint(-71F, -41.5F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[66].setRotationPoint(-82F, -36.5F, -4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 14, 7, 0F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 2F, -4.5F, 0F, 2F, -5.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 87
		bodyModel[67].setRotationPoint(-51F, -46.5F, -10.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 0F, -4F, 4F, 0F, -4F, 5F, 0F, 3F, -4.5F, 0F, 2F, -4.5F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 88
		bodyModel[68].setRotationPoint(-43F, -46.5F, -10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 3F, -4.5F, 0F, 3F, -4.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 90
		bodyModel[69].setRotationPoint(-37F, -46.5F, -10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 7, 16, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[70].setRotationPoint(-43F, -52.5F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[71].setRotationPoint(-37F, -53.5F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[72].setRotationPoint(-34F, -53.5F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[73].setRotationPoint(-34F, -55.5F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 32, 7, 8, 0F, 0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 96
		bodyModel[74].setRotationPoint(-83F, -32.5F, -11.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 2.7F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 98
		bodyModel[75].setRotationPoint(-43F, -32.5F, -11.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.7F, 0F, 0F, 4F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 99
		bodyModel[76].setRotationPoint(-37F, -32.5F, -11.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 32, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -5F, 0F, 0F, -6F); // Box 100
		bodyModel[77].setRotationPoint(-83F, -32.5F, 3.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 32, 14, 7, 0F, 0F, -1.5F, -5.5F, 0F, 2F, -5.5F, 0F, -4F, 4F, 0F, -7F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 2.5F); // Box 101
		bodyModel[78].setRotationPoint(-83F, -46.5F, 3.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 14, 7, 0F, 0F, 2F, -5.5F, 0F, 2F, -4.5F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 102
		bodyModel[79].setRotationPoint(-51F, -46.5F, 3.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 0F, 2F, -4.5F, 0F, 3F, -4.5F, 0F, -4F, 5F, 0F, -4F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 4F); // Box 105
		bodyModel[80].setRotationPoint(-43F, -46.5F, 3.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 0F, 3F, -4.5F, 0F, 3F, -4.5F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 106
		bodyModel[81].setRotationPoint(-37F, -46.5F, 3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 6F, 0F, 2F, 6F, 0F, 2F, 0F, 0F, 2F); // Box 114
		bodyModel[82].setRotationPoint(-67F, -57.5F, -3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 25, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 6F, 0F, 2F, 6F, 0F, 2F, 0F, 0F, 2F); // Box 115
		bodyModel[83].setRotationPoint(-66F, -53.5F, -5.5F);

		bodyModel[84].addShapeBox(-4F, 0.5F, 0F, 16, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[84].setRotationPoint(-103F, -43.5F, -10.5F);
		bodyModel[84].rotateAngleX = 0.78539816F;

		bodyModel[85].addShapeBox(-4F, -0.5F, 0F, 12, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[85].setRotationPoint(-103F, -43.5F, -10.5F);
		bodyModel[85].rotateAngleX = 0.78539816F;

		bodyModel[86].addShapeBox(-4F, -0.5F, 0F, 4, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[86].setRotationPoint(-91F, -43.5F, -10.5F);
		bodyModel[86].rotateAngleX = 0.78539816F;

		bodyModel[87].addShapeBox(-11F, 0.5F, 0F, 7, 2, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 109
		bodyModel[87].setRotationPoint(-103F, -43.5F, -10.5F);
		bodyModel[87].rotateAngleX = 0.78539816F;

		bodyModel[88].addShapeBox(-11F, -0.5F, 0F, 7, 1, 2, 0F, 0F, -3.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 110
		bodyModel[88].setRotationPoint(-103F, -43.5F, -10.5F);
		bodyModel[88].rotateAngleX = 0.78539816F;

		bodyModel[89].addShapeBox(0F, -1.5F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[89].setRotationPoint(-104F, -43.5F, 10F);
		bodyModel[89].rotateAngleX = -0.78539816F;

		bodyModel[90].addShapeBox(0F, -2.5F, 0F, 7, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[90].setRotationPoint(-104F, -43.5F, 10F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addShapeBox(0F, -0.5F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 113
		bodyModel[91].setRotationPoint(-104F, -43.5F, 10F);
		bodyModel[91].rotateAngleX = -0.78539816F;

		bodyModel[92].addShapeBox(0F, -1.5F, 0F, 2, 1, 2, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 114
		bodyModel[92].setRotationPoint(-106F, -43.5F, 10F);
		bodyModel[92].rotateAngleX = -0.78539816F;

		bodyModel[93].addShapeBox(0F, -2.5F, 0F, 2, 1, 2, 0F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 115
		bodyModel[93].setRotationPoint(-106F, -43.5F, 10F);
		bodyModel[93].rotateAngleX = -0.78539816F;

		bodyModel[94].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F); // Box 116
		bodyModel[94].setRotationPoint(-106F, -43.5F, 10F);
		bodyModel[94].rotateAngleX = -0.78539816F;

		bodyModel[95].addShapeBox(0F, -1.5F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F); // Box 118
		bodyModel[95].setRotationPoint(-97F, -43.5F, 10F);
		bodyModel[95].rotateAngleX = -0.78539816F;

		bodyModel[96].addShapeBox(0F, -2.5F, 0F, 13, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -3F, -0.75F, 0F, -3F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2.25F, -0.5F, 0F, 2.25F, -0.5F, 0F, 0F, 0F); // Box 119
		bodyModel[96].setRotationPoint(-97F, -43.5F, 10F);
		bodyModel[96].rotateAngleX = -0.78539816F;

		bodyModel[97].addShapeBox(0F, -0.5F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -0.5F, -0.5F); // Box 121
		bodyModel[97].setRotationPoint(-97F, -43.5F, 10F);
		bodyModel[97].rotateAngleX = -0.78539816F;

		bodyModel[98].addShapeBox(0F, -0.5F, 0.5F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[98].setRotationPoint(-104F, -43.5F, 10F);
		bodyModel[98].rotateAngleX = -0.78539816F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-64F, -39.5F, -18.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F); // Box 129
		bodyModel[100].setRotationPoint(-64F, -39.5F, 13.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 4, 16, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 130
		bodyModel[101].setRotationPoint(-31F, -53.5F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 2, 14, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 131
		bodyModel[102].setRotationPoint(-31F, -55.5F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 132
		bodyModel[103].setRotationPoint(-31F, -56.5F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 133
		bodyModel[104].setRotationPoint(-31F, -57.5F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 40, 4, 15, 0F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Box 135
		bodyModel[105].setRotationPoint(-23F, -53F, -7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 40, 2, 13, 0F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Box 136
		bodyModel[106].setRotationPoint(-23F, -55F, -6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 40, 1, 11, 0F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Box 137
		bodyModel[107].setRotationPoint(-23F, -56F, -5.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 40, 1, 9, 0F, 0F, 0F, -2F, 0F, -3.5F, -2.5F, 0F, -3.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Box 138
		bodyModel[108].setRotationPoint(-23F, -57F, -4.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 32, 7, 31, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 139
		bodyModel[109].setRotationPoint(-31F, -49.5F, -15.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 32, 17, 31, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 140
		bodyModel[110].setRotationPoint(-31F, -42.5F, -15.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -0.6F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 142
		bodyModel[111].setRotationPoint(-51F, -32.5F, -11.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.6F, 0F, 0F, -5F); // Box 143
		bodyModel[112].setRotationPoint(-51F, -32.5F, 3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 2.7F, 0F, 0F, -0.6F); // Box 144
		bodyModel[113].setRotationPoint(-43F, -32.5F, 3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 7, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 4F, 0F, 0F, 2.7F); // Box 145
		bodyModel[114].setRotationPoint(-37F, -32.5F, 3.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, 0F, -0.5F, 0F); // Box 146
		bodyModel[115].setRotationPoint(-73F, -24.5F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F); // Box 147
		bodyModel[116].setRotationPoint(-73F, -25F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 0.25F, 0F); // Box 148
		bodyModel[117].setRotationPoint(-73F, -26F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 1.5F, 0F, 3F, 0F, 0F, 0.75F, 0F); // Box 149
		bodyModel[118].setRotationPoint(-73F, -27.5F, -15F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F); // Box 150
		bodyModel[119].setRotationPoint(-73F, -24.5F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F); // Box 151
		bodyModel[120].setRotationPoint(-73F, -25F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F); // Box 152
		bodyModel[121].setRotationPoint(-73F, -26F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 3F, 0F, 0F, 1.5F, 1.5F, 0F, -0.75F, 0F); // Box 153
		bodyModel[122].setRotationPoint(-73F, -27.5F, 12F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 13, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 145
		bodyModel[123].setRotationPoint(-56F, -26.5F, -16F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[124].setRotationPoint(-55.9F, -16.5F, -19F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[125].setRotationPoint(-55.9F, -15.5F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[126].setRotationPoint(-55.9F, -15F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 149
		bodyModel[127].setRotationPoint(-55.9F, -16.5F, 12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 150
		bodyModel[128].setRotationPoint(-55.9F, -15.5F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[129].setRotationPoint(-55.9F, -15F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 13, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 152
		bodyModel[130].setRotationPoint(-56F, -26.5F, 15F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[131].setRotationPoint(-55.9F, -14.5F, -2.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 17, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 154
		bodyModel[132].setRotationPoint(-60.9F, -24F, -0.5F);

		bodyModel[133].addShapeBox(-2F, 0F, 0F, 2, 11, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -7F, 0F, -0.25F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -0.25F); // Box 155
		bodyModel[133].setRotationPoint(-60.9F, -24F, -0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 29, 2, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 156
		bodyModel[134].setRotationPoint(-48F, -27.5F, -16.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 44, 11, 32, 0F, 0F, 0F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 157
		bodyModel[135].setRotationPoint(-43F, -26.5F, -16F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 44, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 158
		bodyModel[136].setRotationPoint(-43F, -15.5F, -20F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 44, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 159
		bodyModel[137].setRotationPoint(-43F, -13.5F, -15F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 3, 33, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 160
		bodyModel[138].setRotationPoint(-56F, -27.5F, -16.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 33, 10, 32, 0F, 0F, 0F, 2.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.5F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 4F); // Box 161
		bodyModel[139].setRotationPoint(1F, -25.5F, -16F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 33, 2, 40, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 162
		bodyModel[140].setRotationPoint(1F, -15.5F, -20F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 33, 1, 30, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -7F); // Box 163
		bodyModel[141].setRotationPoint(1F, -13.5F, -15F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 33, 17, 37, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 164
		bodyModel[142].setRotationPoint(1F, -42.5F, -18.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 33, 7, 37, 0F, 0F, 0F, -10.5F, 0F, -1F, -8.5F, 0F, -1F, -8.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 165
		bodyModel[143].setRotationPoint(1F, -49.5F, -18.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 52, 2, 12, 0F, 0F, 0F, -1F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, 0F, 0F); // Box 166
		bodyModel[144].setRotationPoint(17F, -51.5F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 52, 4, 14, 0F, 0F, 0F, -1F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Box 167
		bodyModel[145].setRotationPoint(17F, -49.5F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 52, 1, 10, 0F, 0F, 0F, -1F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, 0F, 0F); // Box 168
		bodyModel[146].setRotationPoint(17F, -52.5F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 52, 1, 8, 0F, 0F, 0F, -2F, 0F, -5F, -2.5F, 0F, -5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, 0F, 0F); // Box 169
		bodyModel[147].setRotationPoint(17F, -53.5F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 35, 15, 41, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 170
		bodyModel[148].setRotationPoint(34F, -40.5F, -20.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 35, 8, 41, 0F, 0F, 0F, -10.5F, 0F, -2F, -8.5F, 0F, -2F, -8.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 0F, 0F); // Box 171
		bodyModel[149].setRotationPoint(34F, -48.5F, -20.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 35, 9, 32, 0F, 0F, 0F, 4.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 4.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 172
		bodyModel[150].setRotationPoint(34F, -25.5F, -16F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 35, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 173
		bodyModel[151].setRotationPoint(34F, -16.5F, -20F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 35, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 174
		bodyModel[152].setRotationPoint(34F, -14.5F, -15F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 29, 12, 45, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[153].setRotationPoint(69F, -37.5F, -22.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 29, 9, 45, 0F, 0F, 0F, -10.5F, 0F, -2F, -10.5F, 0F, -2F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[154].setRotationPoint(69F, -46.5F, -22.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F, 0F, 0F, -2.5F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 178
		bodyModel[155].setRotationPoint(69F, -48.5F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 29, 1, 10, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 179
		bodyModel[156].setRotationPoint(69F, -47.5F, -5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 29, 9, 32, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 4F); // Box 180
		bodyModel[157].setRotationPoint(69F, -25.5F, -16F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 29, 2, 40, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 181
		bodyModel[158].setRotationPoint(69F, -16.5F, -20F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 29, 1, 30, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -7F); // Box 182
		bodyModel[159].setRotationPoint(69F, -14.5F, -15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 29, 7, 45, 0F, 0F, 0F, -10.5F, 0F, -2F, -10.5F, 0F, -2F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[160].setRotationPoint(98F, -44.5F, -22.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 29, 8, 32, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F); // Box 185
		bodyModel[161].setRotationPoint(98F, -25.5F, -16F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 17, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -8F, -5F, 0F, -8F, 0F, 0F, -5F); // Box 186
		bodyModel[162].setRotationPoint(98F, -17.5F, -20F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -12F, -5F, 0F, -12F, 0F, 0F, -7F); // Box 187
		bodyModel[163].setRotationPoint(98F, -15.5F, -15F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -8F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 188
		bodyModel[164].setRotationPoint(110F, -17.5F, -17F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -8F, 0F, 0F, -5F); // Box 189
		bodyModel[165].setRotationPoint(110F, -17.5F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 30, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 243
		bodyModel[166].setRotationPoint(127F, -42.5F, -3.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 30, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 244
		bodyModel[167].setRotationPoint(127F, -37.5F, -3.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 30, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 245
		bodyModel[168].setRotationPoint(127F, -35.5F, -3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 29, 1, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 246
		bodyModel[169].setRotationPoint(98F, -46.5F, -3.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 29, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 247
		bodyModel[170].setRotationPoint(98F, -45.5F, -4.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 29, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 248
		bodyModel[171].setRotationPoint(98F, -44.5F, -4.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 30, 2, 7, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 249
		bodyModel[172].setRotationPoint(127F, -44.5F, -3.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F, 0F, 0F, -0.5F, 0F, -1.75F, -1F, 0F, -1.75F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F); // Box 250
		bodyModel[173].setRotationPoint(127F, -45.5F, -3.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, -2F, 0F, -1.75F, -2.5F, 0F, -1.75F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F); // Box 251
		bodyModel[174].setRotationPoint(127F, -46.5F, -3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 28, 4, 6, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[175].setRotationPoint(79F, -49.5F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 26, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[176].setRotationPoint(81F, -53.5F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[177].setRotationPoint(81F, -54.5F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[178].setRotationPoint(77F, -54.5F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[179].setRotationPoint(77F, -52.5F, -3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 241
		bodyModel[180].setRotationPoint(77F, -50.5F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 242
		bodyModel[181].setRotationPoint(107F, -52.5F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 243
		bodyModel[182].setRotationPoint(107F, -54.5F, -3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 26, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[183].setRotationPoint(108F, -52.5F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[184].setRotationPoint(108F, -53.5F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 80, 55, 1, 0F, -64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, 0F, -9F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -9F, 0F); // Box 246
		bodyModel[185].setRotationPoint(88F, -100.5F, -0.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 80, 55, 1, 0F, -66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -64F, 0F, 0F, -2F, -9F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 0F, -9F, 0F); // Box 247
		bodyModel[186].setRotationPoint(88F, -100.5F, -1.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 80, 55, 1, 0F, -64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -66F, 0F, 0F, 0F, -9F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, -2F, -9F, 0F); // Box 248
		bodyModel[187].setRotationPoint(88F, -100.5F, 0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 29, 8, 1, 0F, -10F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[188].setRotationPoint(152F, -108.5F, -0.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 29, 8, 1, 0F, -12F, -2F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[189].setRotationPoint(152F, -108.5F, -1.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 11, 54, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 33.381F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 33.381F, 0F, 0F); // Box 252
		bodyModel[190].setRotationPoint(168F, -100.5F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 11, 54, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 33.381F, 0F, 0F, -28F, 0F, 0F, -26F, 0F, 0F, 33.381F, 0F, 0F); // Box 253
		bodyModel[191].setRotationPoint(168F, -100.5F, -1.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 29, 8, 1, 0F, -10F, 0F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F); // Box 254
		bodyModel[192].setRotationPoint(152F, -108.5F, 0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 11, 54, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 33.381F, 0F, 0F, -26F, 0F, 0F, -28F, 0F, 0F, 33.381F, 0F, 0F); // Box 255
		bodyModel[193].setRotationPoint(168F, -100.5F, 0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 25, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[194].setRotationPoint(-66F, -51.5F, -7.5F);


		noseModel = new ModelRendererTurbo[16];
		noseModel[0] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Box 3
		noseModel[2] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Box 4
		noseModel[3] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // Box 5
		noseModel[4] = new ModelRendererTurbo(this, 0, 91, textureX, textureY); // Box 6
		noseModel[5] = new ModelRendererTurbo(this, 0, 91, textureX, textureY); // Box 7
		noseModel[6] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); // Box 8
		noseModel[7] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 9
		noseModel[8] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 10
		noseModel[9] = new ModelRendererTurbo(this, 0, 146, textureX, textureY); // Box 11
		noseModel[10] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Box 12
		noseModel[11] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Box 13
		noseModel[12] = new ModelRendererTurbo(this, 0, 204, textureX, textureY); // Box 123
		noseModel[13] = new ModelRendererTurbo(this, 0, 204, textureX, textureY); // Box 124
		noseModel[14] = new ModelRendererTurbo(this, 0, 204, textureX, textureY); // Box 126
		noseModel[15] = new ModelRendererTurbo(this, 0, 204, textureX, textureY); // Box 127

		noseModel[0].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, -3F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.25F, 0F, -2F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.25F); // Box 0
		noseModel[0].setRotationPoint(-161F, -35.5F, -1.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, -3.25F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 1.25F, 0F, -2.25F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1.25F); // Box 3
		noseModel[1].setRotationPoint(-161F, -35.5F, -2.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, -3F, 1.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.25F, -2F, 0F, -2F, 1.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.25F, -2F); // Box 4
		noseModel[2].setRotationPoint(-161F, -35.5F, 1.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 5
		noseModel[3].setRotationPoint(-155F, -37.5F, -1.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		noseModel[4].setRotationPoint(-155F, -37.5F, -4.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F); // Box 7
		noseModel[5].setRotationPoint(-155F, -37.5F, 1.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 13, 15, 5, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 8
		noseModel[6].setRotationPoint(-149F, -41.5F, -2.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 13, 15, 5, 0F, 0F, -6F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 9
		noseModel[7].setRotationPoint(-149F, -41.5F, -7.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 13, 15, 5, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -3F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F); // Box 10
		noseModel[8].setRotationPoint(-149F, -41.5F, 2.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 21, 21, 7, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 11
		noseModel[9].setRotationPoint(-136F, -46.5F, -3.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 21, 21, 7, 0F, 0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -6F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 12
		noseModel[10].setRotationPoint(-136F, -46.5F, -10.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 21, 21, 7, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F, -3F); // Box 13
		noseModel[11].setRotationPoint(-136F, -46.5F, 3.5F);

		noseModel[12].addShapeBox(0F, 0.5F, -0.5F, 3, 3, 1, 0F, -2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		noseModel[12].setRotationPoint(-119F, -46.5F, -6.5F);
		noseModel[12].rotateAngleX = 0.43633231F;

		noseModel[13].addShapeBox(0F, 0.5F, -0.5F, 3, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		noseModel[13].setRotationPoint(-119F, -46.5F, 6.5F);
		noseModel[13].rotateAngleX = -0.43633231F;

		noseModel[14].addShapeBox(0F, 0.5F, -0.5F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 126
		noseModel[14].setRotationPoint(-116F, -28.5F, -4.5F);
		noseModel[14].rotateAngleX = -0.43633231F;

		noseModel[15].addShapeBox(0F, 0.5F, -0.5F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F); // Box 127
		noseModel[15].setRotationPoint(-116F, -28.5F, 4.5F);
		noseModel[15].rotateAngleX = 0.43633231F;


		tailModel = new ModelRendererTurbo[39];
		tailModel[0] = new ModelRendererTurbo(this, 200, 821, textureX, textureY); // Box 183
		tailModel[1] = new ModelRendererTurbo(this, 200, 879, textureX, textureY); // Box 190
		tailModel[2] = new ModelRendererTurbo(this, 200, 907, textureX, textureY); // Box 191
		tailModel[3] = new ModelRendererTurbo(this, 200, 907, textureX, textureY); // Box 192
		tailModel[4] = new ModelRendererTurbo(this, 200, 932, textureX, textureY); // Box 193
		tailModel[5] = new ModelRendererTurbo(this, 200, 932, textureX, textureY); // Box 194
		tailModel[6] = new ModelRendererTurbo(this, 200, 952, textureX, textureY); // Box 195
		tailModel[7] = new ModelRendererTurbo(this, 200, 952, textureX, textureY); // Box 196
		tailModel[8] = new ModelRendererTurbo(this, 200, 968, textureX, textureY); // Box 211
		tailModel[9] = new ModelRendererTurbo(this, 200, 968, textureX, textureY); // Box 212
		tailModel[10] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 213
		tailModel[11] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 215
		tailModel[12] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 216
		tailModel[13] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 217
		tailModel[14] = new ModelRendererTurbo(this, 200, 989, textureX, textureY); // Box 218
		tailModel[15] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 219
		tailModel[16] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 220
		tailModel[17] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 221
		tailModel[18] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 222
		tailModel[19] = new ModelRendererTurbo(this, 200, 989, textureX, textureY); // Box 223
		tailModel[20] = new ModelRendererTurbo(this, 200, 952, textureX, textureY); // Box 224
		tailModel[21] = new ModelRendererTurbo(this, 200, 932, textureX, textureY); // Box 225
		tailModel[22] = new ModelRendererTurbo(this, 200, 907, textureX, textureY); // Box 226
		tailModel[23] = new ModelRendererTurbo(this, 200, 879, textureX, textureY); // Box 227
		tailModel[24] = new ModelRendererTurbo(this, 200, 907, textureX, textureY); // Box 228
		tailModel[25] = new ModelRendererTurbo(this, 200, 932, textureX, textureY); // Box 229
		tailModel[26] = new ModelRendererTurbo(this, 200, 952, textureX, textureY); // Box 230
		tailModel[27] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 546
		tailModel[28] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 547
		tailModel[29] = new ModelRendererTurbo(this, 200, 968, textureX, textureY); // Box 548
		tailModel[30] = new ModelRendererTurbo(this, 200, 968, textureX, textureY); // Box 549
		tailModel[31] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 550
		tailModel[32] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 551
		tailModel[33] = new ModelRendererTurbo(this, 200, 989, textureX, textureY); // Box 552
		tailModel[34] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 553
		tailModel[35] = new ModelRendererTurbo(this, 200, 978, textureX, textureY); // Box 554
		tailModel[36] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 555
		tailModel[37] = new ModelRendererTurbo(this, 200, 989, textureX, textureY); // Box 556
		tailModel[38] = new ModelRendererTurbo(this, 200, 984, textureX, textureY); // Box 557

		tailModel[0].addShapeBox(0F, 0F, 0F, 29, 12, 45, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		tailModel[0].setRotationPoint(98F, -37.5F, -22.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 18, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		tailModel[1].setRotationPoint(127F, -33F, -22.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 191
		tailModel[2].setRotationPoint(127F, -26F, -22.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 18, 4, 20, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		tailModel[3].setRotationPoint(127F, -37F, -22.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 193
		tailModel[4].setRotationPoint(127F, -22F, -20.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 2F); // Box 194
		tailModel[5].setRotationPoint(127F, -40F, -20.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, -5F, 0F, 0F, -3F); // Box 195
		tailModel[6].setRotationPoint(127F, -19F, -18.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 196
		tailModel[7].setRotationPoint(127F, -41F, -18.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 211
		tailModel[8].setRotationPoint(145F, -33F, -20.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 212
		tailModel[9].setRotationPoint(145F, -33F, -4.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 213
		tailModel[10].setRotationPoint(145F, -36F, -20.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 215
		tailModel[11].setRotationPoint(145F, -38F, -18.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 2F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 216
		tailModel[12].setRotationPoint(145F, -36F, -4.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 3F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 217
		tailModel[13].setRotationPoint(145F, -38F, -6.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F, 0F, 0F, -3F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 218
		tailModel[14].setRotationPoint(145F, -39F, -15.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 219
		tailModel[15].setRotationPoint(145F, -26F, -4.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 2F); // Box 220
		tailModel[16].setRotationPoint(145F, -26F, -20.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, -3F); // Box 221
		tailModel[17].setRotationPoint(145F, -23F, -6.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 3F); // Box 222
		tailModel[18].setRotationPoint(145F, -23F, -18.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, 0F, -2F); // Box 223
		tailModel[19].setRotationPoint(145F, -21F, -15.5F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -3F); // Box 224
		tailModel[20].setRotationPoint(127F, -41F, 4.5F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 225
		tailModel[21].setRotationPoint(127F, -40F, 4.5F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 18, 4, 20, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 226
		tailModel[22].setRotationPoint(127F, -37F, 2.5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 18, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 227
		tailModel[23].setRotationPoint(127F, -33F, 2.5F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 18, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, -2F); // Box 228
		tailModel[24].setRotationPoint(127F, -26F, 2.5F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -5F, 0F, 0F, -2F); // Box 229
		tailModel[25].setRotationPoint(127F, -22F, 4.5F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -6F, 0F, 0F, -3F); // Box 230
		tailModel[26].setRotationPoint(127F, -19F, 4.5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 546
		tailModel[27].setRotationPoint(145F, -26F, 18.5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 2F); // Box 547
		tailModel[28].setRotationPoint(145F, -26F, 2.5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 548
		tailModel[29].setRotationPoint(145F, -33F, 2.5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 549
		tailModel[30].setRotationPoint(145F, -33F, 18.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 2F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 550
		tailModel[31].setRotationPoint(145F, -36F, 18.5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 3F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 551
		tailModel[32].setRotationPoint(145F, -38F, 16.5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F, 0F, 0F, -3F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 552
		tailModel[33].setRotationPoint(145F, -39F, 7.5F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 553
		tailModel[34].setRotationPoint(145F, -38F, 4.5F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 554
		tailModel[35].setRotationPoint(145F, -36F, 2.5F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 3F); // Box 555
		tailModel[36].setRotationPoint(145F, -23F, 4.5F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, 0F, -3F); // Box 556
		tailModel[37].setRotationPoint(145F, -21F, 7.5F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, -3F); // Box 557
		tailModel[38].setRotationPoint(145F, -23F, 16.5F);


		leftWingModel = new ModelRendererTurbo[143];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 902, textureX, textureY); // Box 256
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 1003, textureX, textureY); // Box 257
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 1104, textureX, textureY); // Box 259
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 1204, textureX, textureY); // Box 260
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 1204, textureX, textureY); // Box 261
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 1204, textureX, textureY); // Box 262
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 263
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 265
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 267
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 268
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 270
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 271
		leftWingModel[12] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 272
		leftWingModel[13] = new ModelRendererTurbo(this, 200, 1273, textureX, textureY); // Box 273
		leftWingModel[14] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 274
		leftWingModel[15] = new ModelRendererTurbo(this, 200, 1288, textureX, textureY); // Box 275
		leftWingModel[16] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 276
		leftWingModel[17] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 277
		leftWingModel[18] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 278
		leftWingModel[19] = new ModelRendererTurbo(this, 200, 1305, textureX, textureY); // Box 279
		leftWingModel[20] = new ModelRendererTurbo(this, 200, 1273, textureX, textureY); // Box 280
		leftWingModel[21] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 281
		leftWingModel[22] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 282
		leftWingModel[23] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 283
		leftWingModel[24] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 284
		leftWingModel[25] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 285
		leftWingModel[26] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 286
		leftWingModel[27] = new ModelRendererTurbo(this, 200, 1311, textureX, textureY); // Box 287
		leftWingModel[28] = new ModelRendererTurbo(this, 200, 1273, textureX, textureY); // Box 288
		leftWingModel[29] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 289
		leftWingModel[30] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 290
		leftWingModel[31] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 291
		leftWingModel[32] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 292
		leftWingModel[33] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 293
		leftWingModel[34] = new ModelRendererTurbo(this, 200, 1317, textureX, textureY); // Box 294
		leftWingModel[35] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 295
		leftWingModel[36] = new ModelRendererTurbo(this, 200, 1323, textureX, textureY); // Box 296
		leftWingModel[37] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 297
		leftWingModel[38] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 298
		leftWingModel[39] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 299
		leftWingModel[40] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 300
		leftWingModel[41] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 301
		leftWingModel[42] = new ModelRendererTurbo(this, 200, 1331, textureX, textureY); // Box 302
		leftWingModel[43] = new ModelRendererTurbo(this, 200, 1340, textureX, textureY); // Box 303
		leftWingModel[44] = new ModelRendererTurbo(this, 200, 1349, textureX, textureY); // Box 304
		leftWingModel[45] = new ModelRendererTurbo(this, 200, 1358, textureX, textureY); // Box 378
		leftWingModel[46] = new ModelRendererTurbo(this, 200, 1358, textureX, textureY); // Box 379
		leftWingModel[47] = new ModelRendererTurbo(this, 200, 1358, textureX, textureY); // Box 380
		leftWingModel[48] = new ModelRendererTurbo(this, 200, 1363, textureX, textureY); // Box 381
		leftWingModel[49] = new ModelRendererTurbo(this, 200, 1363, textureX, textureY); // Box 382
		leftWingModel[50] = new ModelRendererTurbo(this, 200, 1363, textureX, textureY); // Box 383
		leftWingModel[51] = new ModelRendererTurbo(this, 200, 1379, textureX, textureY); // Box 384
		leftWingModel[52] = new ModelRendererTurbo(this, 200, 1368, textureX, textureY); // Box 385
		leftWingModel[53] = new ModelRendererTurbo(this, 200, 1374, textureX, textureY); // Box 386
		leftWingModel[54] = new ModelRendererTurbo(this, 200, 1379, textureX, textureY); // Box 387
		leftWingModel[55] = new ModelRendererTurbo(this, 200, 1368, textureX, textureY); // Box 388
		leftWingModel[56] = new ModelRendererTurbo(this, 200, 1374, textureX, textureY); // Box 389
		leftWingModel[57] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 390
		leftWingModel[58] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 391
		leftWingModel[59] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 392
		leftWingModel[60] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 393
		leftWingModel[61] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 460
		leftWingModel[62] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 461
		leftWingModel[63] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 462
		leftWingModel[64] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 463
		leftWingModel[65] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 464
		leftWingModel[66] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 465
		leftWingModel[67] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 466
		leftWingModel[68] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 467
		leftWingModel[69] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 468
		leftWingModel[70] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 469
		leftWingModel[71] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 470
		leftWingModel[72] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 471
		leftWingModel[73] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 472
		leftWingModel[74] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 473
		leftWingModel[75] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 474
		leftWingModel[76] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 475
		leftWingModel[77] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 476
		leftWingModel[78] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 477
		leftWingModel[79] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 478
		leftWingModel[80] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 479
		leftWingModel[81] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 480
		leftWingModel[82] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 481
		leftWingModel[83] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 482
		leftWingModel[84] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 483
		leftWingModel[85] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 484
		leftWingModel[86] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 485
		leftWingModel[87] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 486
		leftWingModel[88] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 487
		leftWingModel[89] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 488
		leftWingModel[90] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 489
		leftWingModel[91] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 490
		leftWingModel[92] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 491
		leftWingModel[93] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 492
		leftWingModel[94] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 493
		leftWingModel[95] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 494
		leftWingModel[96] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 495
		leftWingModel[97] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 496
		leftWingModel[98] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 497
		leftWingModel[99] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 498
		leftWingModel[100] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 499
		leftWingModel[101] = new ModelRendererTurbo(this, 200, 1402, textureX, textureY); // Box 500
		leftWingModel[102] = new ModelRendererTurbo(this, 200, 1415, textureX, textureY); // Box 501
		leftWingModel[103] = new ModelRendererTurbo(this, 200, 1415, textureX, textureY); // Box 502
		leftWingModel[104] = new ModelRendererTurbo(this, 200, 1430, textureX, textureY); // Box 503
		leftWingModel[105] = new ModelRendererTurbo(this, 200, 1433, textureX, textureY); // Box 504
		leftWingModel[106] = new ModelRendererTurbo(this, 200, 1430, textureX, textureY); // Box 505
		leftWingModel[107] = new ModelRendererTurbo(this, 200, 1430, textureX, textureY); // Box 506
		leftWingModel[108] = new ModelRendererTurbo(this, 200, 1436, textureX, textureY); // Box 507
		leftWingModel[109] = new ModelRendererTurbo(this, 200, 1455, textureX, textureY); // Box 508
		leftWingModel[110] = new ModelRendererTurbo(this, 200, 1474, textureX, textureY); // Box 509
		leftWingModel[111] = new ModelRendererTurbo(this, 200, 1486, textureX, textureY); // Box 510
		leftWingModel[112] = new ModelRendererTurbo(this, 200, 1474, textureX, textureY); // Box 511
		leftWingModel[113] = new ModelRendererTurbo(this, 200, 1486, textureX, textureY); // Box 512
		leftWingModel[114] = new ModelRendererTurbo(this, 200, 1498, textureX, textureY); // Box 513
		leftWingModel[115] = new ModelRendererTurbo(this, 200, 1498, textureX, textureY); // Box 514
		leftWingModel[116] = new ModelRendererTurbo(this, 200, 1502, textureX, textureY); // Box 515
		leftWingModel[117] = new ModelRendererTurbo(this, 200, 1508, textureX, textureY); // Box 516
		leftWingModel[118] = new ModelRendererTurbo(this, 200, 1520, textureX, textureY); // Box 517
		leftWingModel[119] = new ModelRendererTurbo(this, 200, 1540, textureX, textureY); // Box 518
		leftWingModel[120] = new ModelRendererTurbo(this, 200, 1540, textureX, textureY); // Box 519
		leftWingModel[121] = new ModelRendererTurbo(this, 200, 1552, textureX, textureY); // Box 520
		leftWingModel[122] = new ModelRendererTurbo(this, 200, 1552, textureX, textureY); // Box 521
		leftWingModel[123] = new ModelRendererTurbo(this, 200, 1564, textureX, textureY); // Box 522
		leftWingModel[124] = new ModelRendererTurbo(this, 200, 1564, textureX, textureY); // Box 523
		leftWingModel[125] = new ModelRendererTurbo(this, 200, 1572, textureX, textureY); // Box 524
		leftWingModel[126] = new ModelRendererTurbo(this, 200, 1585, textureX, textureY); // Box 525
		leftWingModel[127] = new ModelRendererTurbo(this, 200, 1598, textureX, textureY); // Box 512
		leftWingModel[128] = new ModelRendererTurbo(this, 200, 1598, textureX, textureY); // Box 513
		leftWingModel[129] = new ModelRendererTurbo(this, 200, 1598, textureX, textureY); // Box 514
		leftWingModel[130] = new ModelRendererTurbo(this, 200, 1602, textureX, textureY); // Box 515
		leftWingModel[131] = new ModelRendererTurbo(this, 200, 1602, textureX, textureY); // Box 516
		leftWingModel[132] = new ModelRendererTurbo(this, 200, 1602, textureX, textureY); // Box 517
		leftWingModel[133] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 518
		leftWingModel[134] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 519
		leftWingModel[135] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 520
		leftWingModel[136] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 521
		leftWingModel[137] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 522
		leftWingModel[138] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 523
		leftWingModel[139] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 524
		leftWingModel[140] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 525
		leftWingModel[141] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 563
		leftWingModel[142] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 564

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 138, 2, 98, 0F, -126F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -126F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftWingModel[0].setRotationPoint(-37F, -26.5F, -114.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 138, 2, 98, 0F, -136F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -126F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftWingModel[1].setRotationPoint(-37F, -28.5F, -114.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 138, 1, 98, 0F, -126F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -136F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 259
		leftWingModel[2].setRotationPoint(-37F, -24.5F, -114.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 44, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftWingModel[3].setRotationPoint(79F, -26F, -118.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftWingModel[4].setRotationPoint(79F, -27F, -118.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 262
		leftWingModel[5].setRotationPoint(79F, -24F, -118.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 263
		leftWingModel[6].setRotationPoint(74F, -26F, -118.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 265
		leftWingModel[7].setRotationPoint(74F, -27F, -118.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F); // Box 267
		leftWingModel[8].setRotationPoint(74F, -24F, -118.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 16, 2, 49, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2091F, 0F, 0F, -0.2091F, 0F); // Box 268
		leftWingModel[9].setRotationPoint(101F, -25.5F, -114.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftWingModel[10].setRotationPoint(79F, -24F, -99.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 271
		leftWingModel[11].setRotationPoint(74F, -24F, -99.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 272
		leftWingModel[12].setRotationPoint(99F, -24F, -99.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftWingModel[13].setRotationPoint(75F, -22F, -99.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 274
		leftWingModel[14].setRotationPoint(95F, -22F, -99.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[15].setRotationPoint(47F, -20F, -99.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		leftWingModel[16].setRotationPoint(60F, -22F, -99.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 277
		leftWingModel[17].setRotationPoint(42F, -20F, -99.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 278
		leftWingModel[18].setRotationPoint(27F, -20F, -81.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		leftWingModel[19].setRotationPoint(32F, -20F, -81.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		leftWingModel[20].setRotationPoint(49F, -22F, -81.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftWingModel[21].setRotationPoint(34F, -22F, -81.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 282
		leftWingModel[22].setRotationPoint(69F, -22F, -81.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 283
		leftWingModel[23].setRotationPoint(48F, -24F, -81.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		leftWingModel[24].setRotationPoint(53F, -24F, -81.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 285
		leftWingModel[25].setRotationPoint(73F, -24F, -81.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 286
		leftWingModel[26].setRotationPoint(11F, -19F, -61.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		leftWingModel[27].setRotationPoint(16F, -19F, -61.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		leftWingModel[28].setRotationPoint(32F, -21F, -61.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		leftWingModel[29].setRotationPoint(17F, -21F, -61.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 290
		leftWingModel[30].setRotationPoint(52F, -21F, -61.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 291
		leftWingModel[31].setRotationPoint(31F, -23F, -61.5F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		leftWingModel[32].setRotationPoint(36F, -23F, -61.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 293
		leftWingModel[33].setRotationPoint(56F, -23F, -61.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		leftWingModel[34].setRotationPoint(-6F, -19F, -39.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 295
		leftWingModel[35].setRotationPoint(-11F, -19F, -39.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		leftWingModel[36].setRotationPoint(10F, -21F, -39.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 297
		leftWingModel[37].setRotationPoint(42F, -21F, -39.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 298
		leftWingModel[38].setRotationPoint(34F, -23F, -39.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftWingModel[39].setRotationPoint(14F, -23F, -39.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 300
		leftWingModel[40].setRotationPoint(9F, -23F, -39.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		leftWingModel[41].setRotationPoint(-5F, -21F, -39.5F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 302
		leftWingModel[42].setRotationPoint(90F, -23F, -46.5F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftWingModel[43].setRotationPoint(60F, -23F, -46.5F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 304
		leftWingModel[44].setRotationPoint(55F, -23F, -46.5F);

		leftWingModel[45].addShapeBox(0F, 0F, -1.5F, 67, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftWingModel[45].setRotationPoint(0F, -16F, -60.5F);

		leftWingModel[46].addShapeBox(0F, 0F, -0.5F, 67, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		leftWingModel[46].setRotationPoint(0F, -16F, -60.5F);

		leftWingModel[47].addShapeBox(0F, 0F, 0.5F, 67, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 380
		leftWingModel[47].setRotationPoint(0F, -16F, -60.5F);

		leftWingModel[48].addShapeBox(0F, 0F, -1.5F, 6, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 381
		leftWingModel[48].setRotationPoint(-6F, -16F, -60.5F);

		leftWingModel[49].addShapeBox(0F, 0F, -0.5F, 6, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 382
		leftWingModel[49].setRotationPoint(-6F, -16F, -60.5F);

		leftWingModel[50].addShapeBox(0F, 0F, 0.5F, 6, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 383
		leftWingModel[50].setRotationPoint(-6F, -16F, -60.5F);

		leftWingModel[51].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		leftWingModel[51].setRotationPoint(31F, -14.5F, -60.5F);
		leftWingModel[51].rotateAngleX = -0.78539816F;

		leftWingModel[52].addShapeBox(0F, 0F, -1F, 18, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 385
		leftWingModel[52].setRotationPoint(40F, -14.5F, -60.5F);
		leftWingModel[52].rotateAngleX = -0.78539816F;

		leftWingModel[53].addShapeBox(0F, 0F, -1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftWingModel[53].setRotationPoint(58F, -14.5F, -60.5F);
		leftWingModel[53].rotateAngleX = -0.78539816F;

		leftWingModel[54].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftWingModel[54].setRotationPoint(31F, -14.5F, -60.5F);
		leftWingModel[54].rotateAngleX = 0.78539816F;

		leftWingModel[55].addShapeBox(0F, 0F, -1F, 18, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 388
		leftWingModel[55].setRotationPoint(40F, -14.5F, -60.5F);
		leftWingModel[55].rotateAngleX = 0.78539816F;

		leftWingModel[56].addShapeBox(0F, 0F, -1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftWingModel[56].setRotationPoint(58F, -14.5F, -60.5F);
		leftWingModel[56].rotateAngleX = 0.78539816F;

		leftWingModel[57].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 390
		leftWingModel[57].setRotationPoint(61.5F, -14.5F, -60.5F);
		leftWingModel[57].rotateAngleX = 0.78539816F;

		leftWingModel[58].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 391
		leftWingModel[58].setRotationPoint(61.5F, -14.5F, -60.5F);
		leftWingModel[58].rotateAngleX = 2.35619449F;

		leftWingModel[59].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 392
		leftWingModel[59].setRotationPoint(61.5F, -14.5F, -60.5F);
		leftWingModel[59].rotateAngleX = -2.35619449F;

		leftWingModel[60].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 393
		leftWingModel[60].setRotationPoint(61.5F, -14.5F, -60.5F);
		leftWingModel[60].rotateAngleX = -0.78539816F;

		leftWingModel[61].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 460
		leftWingModel[61].setRotationPoint(62F, -12.5F, -76.5F);
		leftWingModel[61].rotateAngleX = 2.35619449F;

		leftWingModel[62].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 461
		leftWingModel[62].setRotationPoint(62F, -12.5F, -76.5F);
		leftWingModel[62].rotateAngleX = -2.35619449F;

		leftWingModel[63].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 462
		leftWingModel[63].setRotationPoint(62F, -12.5F, -76.5F);
		leftWingModel[63].rotateAngleX = 0.78539816F;

		leftWingModel[64].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 463
		leftWingModel[64].setRotationPoint(62F, -12.5F, -76.5F);
		leftWingModel[64].rotateAngleX = -0.78539816F;

		leftWingModel[65].addShapeBox(0F, -1.5F, 0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 464
		leftWingModel[65].setRotationPoint(37F, -12.5F, -76.5F);

		leftWingModel[66].addShapeBox(0F, -1.5F, -0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		leftWingModel[66].setRotationPoint(37F, -12.5F, -76.5F);

		leftWingModel[67].addShapeBox(0F, -1.5F, -1.5F, 34, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		leftWingModel[67].setRotationPoint(37F, -12.5F, -76.5F);

		leftWingModel[68].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 467
		leftWingModel[68].setRotationPoint(44F, -12.5F, -76.5F);
		leftWingModel[68].rotateAngleX = 0.78539816F;

		leftWingModel[69].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 468
		leftWingModel[69].setRotationPoint(44F, -12.5F, -76.5F);
		leftWingModel[69].rotateAngleX = -0.78539816F;

		leftWingModel[70].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 469
		leftWingModel[70].setRotationPoint(44F, -12.5F, -76.5F);
		leftWingModel[70].rotateAngleX = 2.35619449F;

		leftWingModel[71].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 470
		leftWingModel[71].setRotationPoint(44F, -12.5F, -76.5F);
		leftWingModel[71].rotateAngleX = -2.35619449F;

		leftWingModel[72].addShapeBox(0F, -1.5F, 0.5F, 2, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 471
		leftWingModel[72].setRotationPoint(35F, -12.5F, -76.5F);

		leftWingModel[73].addShapeBox(0F, -1.5F, -0.5F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 472
		leftWingModel[73].setRotationPoint(35F, -12.5F, -76.5F);

		leftWingModel[74].addShapeBox(0F, -1.5F, -1.5F, 2, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 473
		leftWingModel[74].setRotationPoint(35F, -12.5F, -76.5F);

		leftWingModel[75].addShapeBox(0F, -1.5F, -1.5F, 34, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		leftWingModel[75].setRotationPoint(37F, -11.5F, -80.5F);

		leftWingModel[76].addShapeBox(0F, -1.5F, -0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		leftWingModel[76].setRotationPoint(37F, -11.5F, -80.5F);

		leftWingModel[77].addShapeBox(0F, -1.5F, 0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 476
		leftWingModel[77].setRotationPoint(37F, -11.5F, -80.5F);

		leftWingModel[78].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 477
		leftWingModel[78].setRotationPoint(62F, -11.5F, -80.5F);
		leftWingModel[78].rotateAngleX = 2.35619449F;

		leftWingModel[79].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 478
		leftWingModel[79].setRotationPoint(62F, -11.5F, -80.5F);
		leftWingModel[79].rotateAngleX = -2.35619449F;

		leftWingModel[80].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 479
		leftWingModel[80].setRotationPoint(62F, -11.5F, -80.5F);
		leftWingModel[80].rotateAngleX = -0.78539816F;

		leftWingModel[81].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 480
		leftWingModel[81].setRotationPoint(62F, -11.5F, -80.5F);
		leftWingModel[81].rotateAngleX = 0.78539816F;

		leftWingModel[82].addShapeBox(0F, -1.5F, 0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 481
		leftWingModel[82].setRotationPoint(37F, -12.5F, -84.5F);

		leftWingModel[83].addShapeBox(0F, -1.5F, -0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		leftWingModel[83].setRotationPoint(37F, -12.5F, -84.5F);

		leftWingModel[84].addShapeBox(0F, -1.5F, -1.5F, 34, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		leftWingModel[84].setRotationPoint(37F, -12.5F, -84.5F);

		leftWingModel[85].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 484
		leftWingModel[85].setRotationPoint(62F, -12.5F, -84.5F);
		leftWingModel[85].rotateAngleX = 0.78539816F;

		leftWingModel[86].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 485
		leftWingModel[86].setRotationPoint(62F, -12.5F, -84.5F);
		leftWingModel[86].rotateAngleX = 2.35619449F;

		leftWingModel[87].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 486
		leftWingModel[87].setRotationPoint(62F, -12.5F, -84.5F);
		leftWingModel[87].rotateAngleX = -2.35619449F;

		leftWingModel[88].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 487
		leftWingModel[88].setRotationPoint(62F, -12.5F, -84.5F);
		leftWingModel[88].rotateAngleX = -0.78539816F;

		leftWingModel[89].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 488
		leftWingModel[89].setRotationPoint(44F, -11.5F, -80.5F);
		leftWingModel[89].rotateAngleX = -2.35619449F;

		leftWingModel[90].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 489
		leftWingModel[90].setRotationPoint(44F, -11.5F, -80.5F);
		leftWingModel[90].rotateAngleX = -0.78539816F;

		leftWingModel[91].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 490
		leftWingModel[91].setRotationPoint(44F, -11.5F, -80.5F);
		leftWingModel[91].rotateAngleX = 0.78539816F;

		leftWingModel[92].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 491
		leftWingModel[92].setRotationPoint(44F, -11.5F, -80.5F);
		leftWingModel[92].rotateAngleX = 2.35619449F;

		leftWingModel[93].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 492
		leftWingModel[93].setRotationPoint(44F, -12.5F, -84.5F);
		leftWingModel[93].rotateAngleX = 2.35619449F;

		leftWingModel[94].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 493
		leftWingModel[94].setRotationPoint(44F, -12.5F, -84.5F);
		leftWingModel[94].rotateAngleX = 0.78539816F;

		leftWingModel[95].addShapeBox(0F, -1.5F, 0.5F, 2, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 494
		leftWingModel[95].setRotationPoint(35F, -11.5F, -80.5F);

		leftWingModel[96].addShapeBox(0F, -1.5F, -0.5F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 495
		leftWingModel[96].setRotationPoint(35F, -11.5F, -80.5F);

		leftWingModel[97].addShapeBox(0F, -1.5F, -1.5F, 2, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 496
		leftWingModel[97].setRotationPoint(35F, -11.5F, -80.5F);

		leftWingModel[98].addShapeBox(0F, -1.5F, 0.5F, 2, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 497
		leftWingModel[98].setRotationPoint(35F, -12.5F, -84.5F);

		leftWingModel[99].addShapeBox(0F, -1.5F, -0.5F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 498
		leftWingModel[99].setRotationPoint(35F, -12.5F, -84.5F);

		leftWingModel[100].addShapeBox(0F, -1.5F, -1.5F, 2, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 499
		leftWingModel[100].setRotationPoint(35F, -12.5F, -84.5F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		leftWingModel[101].setRotationPoint(45F, -17F, -85.5F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 501
		leftWingModel[102].setRotationPoint(41F, -17F, -85.5F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, -2F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 502
		leftWingModel[103].setRotationPoint(67F, -17F, -85.5F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 503
		leftWingModel[104].setRotationPoint(45F, -14F, -81F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		leftWingModel[105].setRotationPoint(45F, -15F, -81F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 505
		leftWingModel[106].setRotationPoint(45F, -15F, -85F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 506
		leftWingModel[107].setRotationPoint(45F, -15F, -77F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 57, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		leftWingModel[108].setRotationPoint(-13F, -16F, -42.5F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 25, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 508
		leftWingModel[109].setRotationPoint(44F, -16F, -42.5F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 509
		leftWingModel[110].setRotationPoint(44F, -16F, -43.5F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 57, 10, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		leftWingModel[111].setRotationPoint(-13F, -16F, -43.5F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 511
		leftWingModel[112].setRotationPoint(44F, -16F, -34.5F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 57, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 512
		leftWingModel[113].setRotationPoint(-13F, -16F, -34.5F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 513
		leftWingModel[114].setRotationPoint(4F, -6F, -42.5F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 514
		leftWingModel[115].setRotationPoint(4F, -6F, -35.5F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 515
		leftWingModel[116].setRotationPoint(4F, -4F, -40.5F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 516
		leftWingModel[117].setRotationPoint(34F, -6F, -42.5F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 15, 10, 8, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 517
		leftWingModel[118].setRotationPoint(-28F, -16F, -42.5F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 3F); // Box 518
		leftWingModel[119].setRotationPoint(-28F, -16F, -43.5F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F); // Box 519
		leftWingModel[120].setRotationPoint(-28F, -16F, -34.5F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 520
		leftWingModel[121].setRotationPoint(59F, -12F, -42.5F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 521
		leftWingModel[122].setRotationPoint(59F, -12F, -35.5F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		leftWingModel[123].setRotationPoint(59F, -19F, -35.5F);

		leftWingModel[124].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		leftWingModel[124].setRotationPoint(59F, -19F, -42.5F);

		leftWingModel[125].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		leftWingModel[125].setRotationPoint(44F, -15.9F, -44.5F);

		leftWingModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 525
		leftWingModel[126].setRotationPoint(41F, -15.9F, -44.5F);

		leftWingModel[127].addShapeBox(0F, 0F, -1.5F, 55, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		leftWingModel[127].setRotationPoint(39F, -17F, -98.5F);

		leftWingModel[128].addShapeBox(0F, 0F, -0.5F, 55, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		leftWingModel[128].setRotationPoint(39F, -17F, -98.5F);

		leftWingModel[129].addShapeBox(0F, 0F, 0.5F, 55, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 514
		leftWingModel[129].setRotationPoint(39F, -17F, -98.5F);

		leftWingModel[130].addShapeBox(0F, 0F, -1.5F, 6, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 515
		leftWingModel[130].setRotationPoint(33F, -17F, -98.5F);

		leftWingModel[131].addShapeBox(0F, 0F, -0.5F, 6, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 516
		leftWingModel[131].setRotationPoint(33F, -17F, -98.5F);

		leftWingModel[132].addShapeBox(0F, 0F, 0.5F, 6, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 517
		leftWingModel[132].setRotationPoint(33F, -17F, -98.5F);

		leftWingModel[133].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 518
		leftWingModel[133].setRotationPoint(77.5F, -15.5F, -98.5F);
		leftWingModel[133].rotateAngleX = 0.78539816F;

		leftWingModel[134].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 519
		leftWingModel[134].setRotationPoint(77.5F, -15.5F, -98.5F);
		leftWingModel[134].rotateAngleX = 2.35619449F;

		leftWingModel[135].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 520
		leftWingModel[135].setRotationPoint(77.5F, -15.5F, -98.5F);
		leftWingModel[135].rotateAngleX = -2.35619449F;

		leftWingModel[136].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 521
		leftWingModel[136].setRotationPoint(77.5F, -15.5F, -98.5F);
		leftWingModel[136].rotateAngleX = -0.78539816F;

		leftWingModel[137].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 522
		leftWingModel[137].setRotationPoint(41.5F, -15.5F, -98.5F);
		leftWingModel[137].rotateAngleX = 0.78539816F;

		leftWingModel[138].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 523
		leftWingModel[138].setRotationPoint(41.5F, -15.5F, -98.5F);
		leftWingModel[138].rotateAngleX = 2.35619449F;

		leftWingModel[139].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 524
		leftWingModel[139].setRotationPoint(41.5F, -15.5F, -98.5F);
		leftWingModel[139].rotateAngleX = -2.35619449F;

		leftWingModel[140].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 525
		leftWingModel[140].setRotationPoint(41.5F, -15.5F, -98.5F);
		leftWingModel[140].rotateAngleX = -0.78539816F;

		leftWingModel[141].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 563
		leftWingModel[141].setRotationPoint(44F, -12.5F, -84.5F);
		leftWingModel[141].rotateAngleX = -0.78539816F;

		leftWingModel[142].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 564
		leftWingModel[142].setRotationPoint(44F, -12.5F, -84.5F);
		leftWingModel[142].rotateAngleX = -2.35619449F;


		rightWingModel = new ModelRendererTurbo[143];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 1323, textureX, textureY); // Box 305
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 306
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 307
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 308
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 1317, textureX, textureY); // Box 309
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 310
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 311
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 312
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 1311, textureX, textureY); // Box 313
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 1273, textureX, textureY); // Box 314
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 315
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 316
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 317
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 318
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 319
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 320
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 1305, textureX, textureY); // Box 321
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 322
		rightWingModel[18] = new ModelRendererTurbo(this, 200, 1273, textureX, textureY); // Box 323
		rightWingModel[19] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 324
		rightWingModel[20] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 325
		rightWingModel[21] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 326
		rightWingModel[22] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 327
		rightWingModel[23] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 328
		rightWingModel[24] = new ModelRendererTurbo(this, 200, 1273, textureX, textureY); // Box 329
		rightWingModel[25] = new ModelRendererTurbo(this, 200, 1263, textureX, textureY); // Box 330
		rightWingModel[26] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 331
		rightWingModel[27] = new ModelRendererTurbo(this, 200, 1281, textureX, textureY); // Box 332
		rightWingModel[28] = new ModelRendererTurbo(this, 200, 1294, textureX, textureY); // Box 333
		rightWingModel[29] = new ModelRendererTurbo(this, 200, 1288, textureX, textureY); // Box 334
		rightWingModel[30] = new ModelRendererTurbo(this, 200, 1299, textureX, textureY); // Box 335
		rightWingModel[31] = new ModelRendererTurbo(this, 200, 1349, textureX, textureY); // Box 336
		rightWingModel[32] = new ModelRendererTurbo(this, 200, 1340, textureX, textureY); // Box 337
		rightWingModel[33] = new ModelRendererTurbo(this, 200, 1331, textureX, textureY); // Box 338
		rightWingModel[34] = new ModelRendererTurbo(this, 200, 1204, textureX, textureY); // Box 339
		rightWingModel[35] = new ModelRendererTurbo(this, 200, 1204, textureX, textureY); // Box 340
		rightWingModel[36] = new ModelRendererTurbo(this, 200, 1204, textureX, textureY); // Box 341
		rightWingModel[37] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 342
		rightWingModel[38] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 343
		rightWingModel[39] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 344
		rightWingModel[40] = new ModelRendererTurbo(this, 200, 1211, textureX, textureY); // Box 345
		rightWingModel[41] = new ModelRendererTurbo(this, 200, 1003, textureX, textureY); // Box 347
		rightWingModel[42] = new ModelRendererTurbo(this, 200, 902, textureX, textureY); // Box 348
		rightWingModel[43] = new ModelRendererTurbo(this, 200, 1104, textureX, textureY); // Box 349
		rightWingModel[44] = new ModelRendererTurbo(this, 200, 1363, textureX, textureY); // Box 394
		rightWingModel[45] = new ModelRendererTurbo(this, 200, 1363, textureX, textureY); // Box 395
		rightWingModel[46] = new ModelRendererTurbo(this, 200, 1363, textureX, textureY); // Box 396
		rightWingModel[47] = new ModelRendererTurbo(this, 200, 1358, textureX, textureY); // Box 397
		rightWingModel[48] = new ModelRendererTurbo(this, 200, 1358, textureX, textureY); // Box 398
		rightWingModel[49] = new ModelRendererTurbo(this, 200, 1358, textureX, textureY); // Box 399
		rightWingModel[50] = new ModelRendererTurbo(this, 200, 1379, textureX, textureY); // Box 400
		rightWingModel[51] = new ModelRendererTurbo(this, 200, 1379, textureX, textureY); // Box 401
		rightWingModel[52] = new ModelRendererTurbo(this, 200, 1368, textureX, textureY); // Box 402
		rightWingModel[53] = new ModelRendererTurbo(this, 200, 1368, textureX, textureY); // Box 403
		rightWingModel[54] = new ModelRendererTurbo(this, 200, 1374, textureX, textureY); // Box 404
		rightWingModel[55] = new ModelRendererTurbo(this, 200, 1374, textureX, textureY); // Box 405
		rightWingModel[56] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 406
		rightWingModel[57] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 407
		rightWingModel[58] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 408
		rightWingModel[59] = new ModelRendererTurbo(this, 200, 1385, textureX, textureY); // Box 409
		rightWingModel[60] = new ModelRendererTurbo(this, 200, 1402, textureX, textureY); // Box 410
		rightWingModel[61] = new ModelRendererTurbo(this, 200, 1415, textureX, textureY); // Box 411
		rightWingModel[62] = new ModelRendererTurbo(this, 200, 1415, textureX, textureY); // Box 412
		rightWingModel[63] = new ModelRendererTurbo(this, 200, 1433, textureX, textureY); // Box 413
		rightWingModel[64] = new ModelRendererTurbo(this, 200, 1430, textureX, textureY); // Box 414
		rightWingModel[65] = new ModelRendererTurbo(this, 200, 1430, textureX, textureY); // Box 415
		rightWingModel[66] = new ModelRendererTurbo(this, 200, 1430, textureX, textureY); // Box 416
		rightWingModel[67] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 417
		rightWingModel[68] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 419
		rightWingModel[69] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 420
		rightWingModel[70] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 421
		rightWingModel[71] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 422
		rightWingModel[72] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 423
		rightWingModel[73] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 424
		rightWingModel[74] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 425
		rightWingModel[75] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 426
		rightWingModel[76] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 427
		rightWingModel[77] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 428
		rightWingModel[78] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 429
		rightWingModel[79] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 430
		rightWingModel[80] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 431
		rightWingModel[81] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 432
		rightWingModel[82] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 433
		rightWingModel[83] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 434
		rightWingModel[84] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 435
		rightWingModel[85] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 436
		rightWingModel[86] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 437
		rightWingModel[87] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 438
		rightWingModel[88] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 439
		rightWingModel[89] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 440
		rightWingModel[90] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 441
		rightWingModel[91] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 442
		rightWingModel[92] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 443
		rightWingModel[93] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 444
		rightWingModel[94] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 445
		rightWingModel[95] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 446
		rightWingModel[96] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 447
		rightWingModel[97] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 448
		rightWingModel[98] = new ModelRendererTurbo(this, 200, 1391, textureX, textureY); // Box 449
		rightWingModel[99] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 450
		rightWingModel[100] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 451
		rightWingModel[101] = new ModelRendererTurbo(this, 200, 1395, textureX, textureY); // Box 452
		rightWingModel[102] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 453
		rightWingModel[103] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 454
		rightWingModel[104] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 455
		rightWingModel[105] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Box 456
		rightWingModel[106] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 457
		rightWingModel[107] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 458
		rightWingModel[108] = new ModelRendererTurbo(this, 200, 1405, textureX, textureY); // Box 459
		rightWingModel[109] = new ModelRendererTurbo(this, 200, 1585, textureX, textureY); // Box 526
		rightWingModel[110] = new ModelRendererTurbo(this, 200, 1572, textureX, textureY); // Box 527
		rightWingModel[111] = new ModelRendererTurbo(this, 200, 1455, textureX, textureY); // Box 528
		rightWingModel[112] = new ModelRendererTurbo(this, 200, 1474, textureX, textureY); // Box 529
		rightWingModel[113] = new ModelRendererTurbo(this, 200, 1474, textureX, textureY); // Box 530
		rightWingModel[114] = new ModelRendererTurbo(this, 200, 1552, textureX, textureY); // Box 531
		rightWingModel[115] = new ModelRendererTurbo(this, 200, 1552, textureX, textureY); // Box 532
		rightWingModel[116] = new ModelRendererTurbo(this, 200, 1564, textureX, textureY); // Box 533
		rightWingModel[117] = new ModelRendererTurbo(this, 200, 1564, textureX, textureY); // Box 534
		rightWingModel[118] = new ModelRendererTurbo(this, 200, 1436, textureX, textureY); // Box 535
		rightWingModel[119] = new ModelRendererTurbo(this, 200, 1486, textureX, textureY); // Box 536
		rightWingModel[120] = new ModelRendererTurbo(this, 200, 1486, textureX, textureY); // Box 537
		rightWingModel[121] = new ModelRendererTurbo(this, 200, 1508, textureX, textureY); // Box 538
		rightWingModel[122] = new ModelRendererTurbo(this, 200, 1498, textureX, textureY); // Box 539
		rightWingModel[123] = new ModelRendererTurbo(this, 200, 1502, textureX, textureY); // Box 540
		rightWingModel[124] = new ModelRendererTurbo(this, 200, 1498, textureX, textureY); // Box 541
		rightWingModel[125] = new ModelRendererTurbo(this, 200, 1520, textureX, textureY); // Box 542
		rightWingModel[126] = new ModelRendererTurbo(this, 200, 1540, textureX, textureY); // Box 543
		rightWingModel[127] = new ModelRendererTurbo(this, 200, 1540, textureX, textureY); // Box 544
		rightWingModel[128] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 526
		rightWingModel[129] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 527
		rightWingModel[130] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 528
		rightWingModel[131] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 529
		rightWingModel[132] = new ModelRendererTurbo(this, 200, 1598, textureX, textureY); // Box 530
		rightWingModel[133] = new ModelRendererTurbo(this, 200, 1598, textureX, textureY); // Box 531
		rightWingModel[134] = new ModelRendererTurbo(this, 200, 1598, textureX, textureY); // Box 532
		rightWingModel[135] = new ModelRendererTurbo(this, 200, 1602, textureX, textureY); // Box 533
		rightWingModel[136] = new ModelRendererTurbo(this, 200, 1602, textureX, textureY); // Box 534
		rightWingModel[137] = new ModelRendererTurbo(this, 200, 1602, textureX, textureY); // Box 535
		rightWingModel[138] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 536
		rightWingModel[139] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 537
		rightWingModel[140] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 538
		rightWingModel[141] = new ModelRendererTurbo(this, 200, 1608, textureX, textureY); // Box 539
		rightWingModel[142] = new ModelRendererTurbo(this, 200, 1268, textureX, textureY); // Box 562

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingModel[0].setRotationPoint(10F, -21F, 37.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightWingModel[1].setRotationPoint(14F, -23F, 37.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 307
		rightWingModel[2].setRotationPoint(34F, -23F, 37.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 308
		rightWingModel[3].setRotationPoint(42F, -21F, 37.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightWingModel[4].setRotationPoint(-6F, -19F, 37.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightWingModel[5].setRotationPoint(-5F, -21F, 37.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 311
		rightWingModel[6].setRotationPoint(-11F, -19F, 37.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 312
		rightWingModel[7].setRotationPoint(11F, -19F, 59.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightWingModel[8].setRotationPoint(16F, -19F, 59.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightWingModel[9].setRotationPoint(32F, -21F, 59.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 315
		rightWingModel[10].setRotationPoint(52F, -21F, 59.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 316
		rightWingModel[11].setRotationPoint(56F, -23F, 59.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[12].setRotationPoint(36F, -23F, 59.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 318
		rightWingModel[13].setRotationPoint(31F, -23F, 59.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightWingModel[14].setRotationPoint(17F, -21F, 59.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 320
		rightWingModel[15].setRotationPoint(27F, -20F, 79.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightWingModel[16].setRotationPoint(32F, -20F, 79.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightWingModel[17].setRotationPoint(34F, -22F, 79.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		rightWingModel[18].setRotationPoint(49F, -22F, 79.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 324
		rightWingModel[19].setRotationPoint(69F, -22F, 79.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 325
		rightWingModel[20].setRotationPoint(48F, -24F, 79.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightWingModel[21].setRotationPoint(53F, -24F, 79.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 327
		rightWingModel[22].setRotationPoint(73F, -24F, 79.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 328
		rightWingModel[23].setRotationPoint(74F, -24F, 97.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightWingModel[24].setRotationPoint(75F, -22F, 97.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[25].setRotationPoint(79F, -24F, 97.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 331
		rightWingModel[26].setRotationPoint(99F, -24F, 97.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 332
		rightWingModel[27].setRotationPoint(95F, -22F, 97.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		rightWingModel[28].setRotationPoint(60F, -22F, 97.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightWingModel[29].setRotationPoint(47F, -20F, 97.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 335
		rightWingModel[30].setRotationPoint(42F, -20F, 97.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 336
		rightWingModel[31].setRotationPoint(55F, -23F, 42.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[32].setRotationPoint(60F, -23F, 42.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 338
		rightWingModel[33].setRotationPoint(90F, -23F, 42.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[34].setRotationPoint(79F, -27F, 114.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 44, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightWingModel[35].setRotationPoint(79F, -26F, 114.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 341
		rightWingModel[36].setRotationPoint(79F, -24F, 114.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 342
		rightWingModel[37].setRotationPoint(74F, -27F, 114.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 343
		rightWingModel[38].setRotationPoint(74F, -26F, 114.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F); // Box 344
		rightWingModel[39].setRotationPoint(74F, -24F, 114.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 16, 2, 49, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.2091F, 0F, 0F, -0.2091F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345
		rightWingModel[40].setRotationPoint(101F, -25.5F, 65.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 138, 2, 98, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -136F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -126F, 1.5F, 0F); // Box 347
		rightWingModel[41].setRotationPoint(-37F, -28.5F, 16.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 138, 2, 98, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -126F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -126F, 0F, 0F); // Box 348
		rightWingModel[42].setRotationPoint(-37F, -26.5F, 16.5F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 138, 1, 98, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -126F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -136F, -0.5F, 0F); // Box 349
		rightWingModel[43].setRotationPoint(-37F, -24.5F, 16.5F);

		rightWingModel[44].addShapeBox(0F, 0F, -1.5F, 6, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 394
		rightWingModel[44].setRotationPoint(-6F, -16F, 60.5F);

		rightWingModel[45].addShapeBox(0F, 0F, -0.5F, 6, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 395
		rightWingModel[45].setRotationPoint(-6F, -16F, 60.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0.5F, 6, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 396
		rightWingModel[46].setRotationPoint(-6F, -16F, 60.5F);

		rightWingModel[47].addShapeBox(0F, 0F, 0.5F, 67, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 397
		rightWingModel[47].setRotationPoint(0F, -16F, 60.5F);

		rightWingModel[48].addShapeBox(0F, 0F, -0.5F, 67, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		rightWingModel[48].setRotationPoint(0F, -16F, 60.5F);

		rightWingModel[49].addShapeBox(0F, 0F, -1.5F, 67, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		rightWingModel[49].setRotationPoint(0F, -16F, 60.5F);

		rightWingModel[50].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		rightWingModel[50].setRotationPoint(31F, -14.5F, 60.5F);
		rightWingModel[50].rotateAngleX = 0.78539816F;

		rightWingModel[51].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightWingModel[51].setRotationPoint(31F, -14.5F, 60.5F);
		rightWingModel[51].rotateAngleX = -0.78539816F;

		rightWingModel[52].addShapeBox(0F, 0F, -1F, 18, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 402
		rightWingModel[52].setRotationPoint(40F, -14.5F, 60.5F);
		rightWingModel[52].rotateAngleX = -0.78539816F;

		rightWingModel[53].addShapeBox(0F, 0F, -1F, 18, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 403
		rightWingModel[53].setRotationPoint(40F, -14.5F, 60.5F);
		rightWingModel[53].rotateAngleX = 0.78539816F;

		rightWingModel[54].addShapeBox(0F, 0F, -1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		rightWingModel[54].setRotationPoint(58F, -14.5F, 60.5F);
		rightWingModel[54].rotateAngleX = 0.78539816F;

		rightWingModel[55].addShapeBox(0F, 0F, -1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		rightWingModel[55].setRotationPoint(58F, -14.5F, 60.5F);
		rightWingModel[55].rotateAngleX = -0.78539816F;

		rightWingModel[56].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 406
		rightWingModel[56].setRotationPoint(61.5F, -14.5F, 60.5F);
		rightWingModel[56].rotateAngleX = -0.78539816F;

		rightWingModel[57].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 407
		rightWingModel[57].setRotationPoint(61.5F, -14.5F, 60.5F);
		rightWingModel[57].rotateAngleX = -2.35619449F;

		rightWingModel[58].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 408
		rightWingModel[58].setRotationPoint(61.5F, -14.5F, 60.5F);
		rightWingModel[58].rotateAngleX = 2.35619449F;

		rightWingModel[59].addShapeBox(0F, 0F, -0.5F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 409
		rightWingModel[59].setRotationPoint(61.5F, -14.5F, 60.5F);
		rightWingModel[59].rotateAngleX = 0.78539816F;

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightWingModel[60].setRotationPoint(45F, -17F, 75.5F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 411
		rightWingModel[61].setRotationPoint(41F, -17F, 75.5F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F, 0F, 0F, -2F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 412
		rightWingModel[62].setRotationPoint(67F, -17F, 75.5F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		rightWingModel[63].setRotationPoint(45F, -15F, 80F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 414
		rightWingModel[64].setRotationPoint(45F, -14F, 80F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 415
		rightWingModel[65].setRotationPoint(45F, -15F, 76F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 416
		rightWingModel[66].setRotationPoint(45F, -15F, 84F);

		rightWingModel[67].addShapeBox(0F, -1.5F, -0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		rightWingModel[67].setRotationPoint(37F, -11.5F, 80.5F);

		rightWingModel[68].addShapeBox(0F, -1.5F, -1.5F, 34, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		rightWingModel[68].setRotationPoint(37F, -11.5F, 80.5F);

		rightWingModel[69].addShapeBox(0F, -1.5F, 0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420
		rightWingModel[69].setRotationPoint(37F, -11.5F, 80.5F);

		rightWingModel[70].addShapeBox(0F, -1.5F, -0.5F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 421
		rightWingModel[70].setRotationPoint(35F, -11.5F, 80.5F);

		rightWingModel[71].addShapeBox(0F, -1.5F, -1.5F, 2, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 422
		rightWingModel[71].setRotationPoint(35F, -11.5F, 80.5F);

		rightWingModel[72].addShapeBox(0F, -1.5F, 0.5F, 2, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 423
		rightWingModel[72].setRotationPoint(35F, -11.5F, 80.5F);

		rightWingModel[73].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 424
		rightWingModel[73].setRotationPoint(44F, -11.5F, 80.5F);
		rightWingModel[73].rotateAngleX = 0.78539816F;

		rightWingModel[74].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 425
		rightWingModel[74].setRotationPoint(44F, -11.5F, 80.5F);
		rightWingModel[74].rotateAngleX = -0.78539816F;

		rightWingModel[75].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 426
		rightWingModel[75].setRotationPoint(44F, -11.5F, 80.5F);
		rightWingModel[75].rotateAngleX = -2.35619449F;

		rightWingModel[76].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 427
		rightWingModel[76].setRotationPoint(44F, -11.5F, 80.5F);
		rightWingModel[76].rotateAngleX = 2.35619449F;

		rightWingModel[77].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 428
		rightWingModel[77].setRotationPoint(62F, -11.5F, 80.5F);
		rightWingModel[77].rotateAngleX = 2.35619449F;

		rightWingModel[78].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 429
		rightWingModel[78].setRotationPoint(62F, -11.5F, 80.5F);
		rightWingModel[78].rotateAngleX = -2.35619449F;

		rightWingModel[79].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 430
		rightWingModel[79].setRotationPoint(62F, -11.5F, 80.5F);
		rightWingModel[79].rotateAngleX = 0.78539816F;

		rightWingModel[80].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 431
		rightWingModel[80].setRotationPoint(62F, -11.5F, 80.5F);
		rightWingModel[80].rotateAngleX = -0.78539816F;

		rightWingModel[81].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 432
		rightWingModel[81].setRotationPoint(62F, -12.5F, 76.5F);
		rightWingModel[81].rotateAngleX = 2.35619449F;

		rightWingModel[82].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 433
		rightWingModel[82].setRotationPoint(62F, -12.5F, 76.5F);
		rightWingModel[82].rotateAngleX = -2.35619449F;

		rightWingModel[83].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 434
		rightWingModel[83].setRotationPoint(62F, -12.5F, 76.5F);
		rightWingModel[83].rotateAngleX = 0.78539816F;

		rightWingModel[84].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 435
		rightWingModel[84].setRotationPoint(62F, -12.5F, 76.5F);
		rightWingModel[84].rotateAngleX = -0.78539816F;

		rightWingModel[85].addShapeBox(0F, -1.5F, 0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 436
		rightWingModel[85].setRotationPoint(37F, -12.5F, 76.5F);

		rightWingModel[86].addShapeBox(0F, -1.5F, -0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		rightWingModel[86].setRotationPoint(37F, -12.5F, 76.5F);

		rightWingModel[87].addShapeBox(0F, -1.5F, -1.5F, 34, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		rightWingModel[87].setRotationPoint(37F, -12.5F, 76.5F);

		rightWingModel[88].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 439
		rightWingModel[88].setRotationPoint(44F, -12.5F, 76.5F);
		rightWingModel[88].rotateAngleX = 0.78539816F;

		rightWingModel[89].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 440
		rightWingModel[89].setRotationPoint(44F, -12.5F, 76.5F);
		rightWingModel[89].rotateAngleX = -0.78539816F;

		rightWingModel[90].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 441
		rightWingModel[90].setRotationPoint(44F, -12.5F, 76.5F);
		rightWingModel[90].rotateAngleX = 2.35619449F;

		rightWingModel[91].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 442
		rightWingModel[91].setRotationPoint(44F, -12.5F, 76.5F);
		rightWingModel[91].rotateAngleX = -2.35619449F;

		rightWingModel[92].addShapeBox(0F, -1.5F, 0.5F, 2, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 443
		rightWingModel[92].setRotationPoint(35F, -12.5F, 76.5F);

		rightWingModel[93].addShapeBox(0F, -1.5F, -0.5F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 444
		rightWingModel[93].setRotationPoint(35F, -12.5F, 76.5F);

		rightWingModel[94].addShapeBox(0F, -1.5F, -1.5F, 2, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 445
		rightWingModel[94].setRotationPoint(35F, -12.5F, 76.5F);

		rightWingModel[95].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 446
		rightWingModel[95].setRotationPoint(62F, -12.5F, 84.5F);
		rightWingModel[95].rotateAngleX = 2.35619449F;

		rightWingModel[96].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 447
		rightWingModel[96].setRotationPoint(62F, -12.5F, 84.5F);
		rightWingModel[96].rotateAngleX = -2.35619449F;

		rightWingModel[97].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 448
		rightWingModel[97].setRotationPoint(62F, -12.5F, 84.5F);
		rightWingModel[97].rotateAngleX = 0.78539816F;

		rightWingModel[98].addShapeBox(0F, -0.5F, -2.5F, 8, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 449
		rightWingModel[98].setRotationPoint(62F, -12.5F, 84.5F);
		rightWingModel[98].rotateAngleX = -0.78539816F;

		rightWingModel[99].addShapeBox(0F, -1.5F, 0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 450
		rightWingModel[99].setRotationPoint(37F, -12.5F, 84.5F);

		rightWingModel[100].addShapeBox(0F, -1.5F, -0.5F, 34, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightWingModel[100].setRotationPoint(37F, -12.5F, 84.5F);

		rightWingModel[101].addShapeBox(0F, -1.5F, -1.5F, 34, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightWingModel[101].setRotationPoint(37F, -12.5F, 84.5F);

		rightWingModel[102].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 453
		rightWingModel[102].setRotationPoint(44F, -12.5F, 84.5F);
		rightWingModel[102].rotateAngleX = 0.78539816F;

		rightWingModel[103].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 454
		rightWingModel[103].setRotationPoint(44F, -12.5F, 84.5F);
		rightWingModel[103].rotateAngleX = -0.78539816F;

		rightWingModel[104].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 455
		rightWingModel[104].setRotationPoint(44F, -12.5F, 84.5F);
		rightWingModel[104].rotateAngleX = 2.35619449F;

		rightWingModel[105].addShapeBox(0F, -0.5F, -2.5F, 2, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 456
		rightWingModel[105].setRotationPoint(44F, -12.5F, 84.5F);
		rightWingModel[105].rotateAngleX = -2.35619449F;

		rightWingModel[106].addShapeBox(0F, -1.5F, 0.5F, 2, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 457
		rightWingModel[106].setRotationPoint(35F, -12.5F, 84.5F);

		rightWingModel[107].addShapeBox(0F, -1.5F, -0.5F, 2, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 458
		rightWingModel[107].setRotationPoint(35F, -12.5F, 84.5F);

		rightWingModel[108].addShapeBox(0F, -1.5F, -1.5F, 2, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 459
		rightWingModel[108].setRotationPoint(35F, -12.5F, 84.5F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 526
		rightWingModel[109].setRotationPoint(41F, -15.9F, 33.5F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightWingModel[110].setRotationPoint(44F, -15.9F, 33.5F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 25, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 528
		rightWingModel[111].setRotationPoint(44F, -16F, 34.5F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 529
		rightWingModel[112].setRotationPoint(44F, -16F, 42.5F);

		rightWingModel[113].addShapeBox(0F, 0F, 0F, 25, 10, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 530
		rightWingModel[113].setRotationPoint(44F, -16F, 33.5F);

		rightWingModel[114].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 531
		rightWingModel[114].setRotationPoint(59F, -12F, 34.5F);

		rightWingModel[115].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 532
		rightWingModel[115].setRotationPoint(59F, -12F, 41.5F);

		rightWingModel[116].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightWingModel[116].setRotationPoint(59F, -19F, 41.5F);

		rightWingModel[117].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		rightWingModel[117].setRotationPoint(59F, -19F, 34.5F);

		rightWingModel[118].addShapeBox(0F, 0F, 0F, 57, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		rightWingModel[118].setRotationPoint(-13F, -16F, 34.5F);

		rightWingModel[119].addShapeBox(0F, 0F, 0F, 57, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 536
		rightWingModel[119].setRotationPoint(-13F, -16F, 42.5F);

		rightWingModel[120].addShapeBox(0F, 0F, 0F, 57, 10, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		rightWingModel[120].setRotationPoint(-13F, -16F, 33.5F);

		rightWingModel[121].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 538
		rightWingModel[121].setRotationPoint(34F, -6F, 34.5F);

		rightWingModel[122].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 539
		rightWingModel[122].setRotationPoint(4F, -6F, 34.5F);

		rightWingModel[123].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 540
		rightWingModel[123].setRotationPoint(4F, -4F, 36.5F);

		rightWingModel[124].addShapeBox(0F, 0F, 0F, 30, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 541
		rightWingModel[124].setRotationPoint(4F, -6F, 41.5F);

		rightWingModel[125].addShapeBox(0F, 0F, 0F, 15, 10, 8, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 542
		rightWingModel[125].setRotationPoint(-28F, -16F, 34.5F);

		rightWingModel[126].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F); // Box 543
		rightWingModel[126].setRotationPoint(-28F, -16F, 42.5F);

		rightWingModel[127].addShapeBox(0F, 0F, 0F, 15, 10, 1, 0F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 3F); // Box 544
		rightWingModel[127].setRotationPoint(-28F, -16F, 33.5F);

		rightWingModel[128].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 526
		rightWingModel[128].setRotationPoint(41.5F, -15.5F, 98.5F);
		rightWingModel[128].rotateAngleX = 0.78539816F;

		rightWingModel[129].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 527
		rightWingModel[129].setRotationPoint(41.5F, -15.5F, 98.5F);
		rightWingModel[129].rotateAngleX = 2.35619449F;

		rightWingModel[130].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 528
		rightWingModel[130].setRotationPoint(41.5F, -15.5F, 98.5F);
		rightWingModel[130].rotateAngleX = -2.35619449F;

		rightWingModel[131].addShapeBox(0F, 0F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 529
		rightWingModel[131].setRotationPoint(41.5F, -15.5F, 98.5F);
		rightWingModel[131].rotateAngleX = -0.78539816F;

		rightWingModel[132].addShapeBox(0F, 0F, -1.5F, 55, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		rightWingModel[132].setRotationPoint(39F, -17F, 98.5F);

		rightWingModel[133].addShapeBox(0F, 0F, -0.5F, 55, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		rightWingModel[133].setRotationPoint(39F, -17F, 98.5F);

		rightWingModel[134].addShapeBox(0F, 0F, 0.5F, 55, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 532
		rightWingModel[134].setRotationPoint(39F, -17F, 98.5F);

		rightWingModel[135].addShapeBox(0F, 0F, 0.5F, 6, 3, 1, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1F); // Box 533
		rightWingModel[135].setRotationPoint(33F, -17F, 98.5F);

		rightWingModel[136].addShapeBox(0F, 0F, -0.5F, 6, 3, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 534
		rightWingModel[136].setRotationPoint(33F, -17F, 98.5F);

		rightWingModel[137].addShapeBox(0F, 0F, -1.5F, 6, 3, 1, 0F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1.25F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 535
		rightWingModel[137].setRotationPoint(33F, -17F, 98.5F);

		rightWingModel[138].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 536
		rightWingModel[138].setRotationPoint(77.5F, -15.5F, 98.5F);
		rightWingModel[138].rotateAngleX = 2.35619449F;

		rightWingModel[139].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 537
		rightWingModel[139].setRotationPoint(77.5F, -15.5F, 98.5F);
		rightWingModel[139].rotateAngleX = 0.78539816F;

		rightWingModel[140].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 538
		rightWingModel[140].setRotationPoint(77.5F, -15.5F, 98.5F);
		rightWingModel[140].rotateAngleX = -0.78539816F;

		rightWingModel[141].addShapeBox(0F, 0F, -0.5F, 16, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 539
		rightWingModel[141].setRotationPoint(77.5F, -15.5F, 98.5F);
		rightWingModel[141].rotateAngleX = -2.35619449F;

		rightWingModel[142].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 562
		rightWingModel[142].setRotationPoint(9F, -23F, 37.5F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 200, 1614, textureX, textureY); // Box 108
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 200, 1614, textureX, textureY); // Box 109
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 200, 1614, textureX, textureY); // Box 110
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 200, 1647, textureX, textureY); // Box 269

		pitchFlapLeftWingModel[0].addShapeBox(-15F, -0.5F, -29F, 38, 1, 31, 0F, -27F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -27F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 108
		pitchFlapLeftWingModel[0].setRotationPoint(-91.5F, -35F, -12.5F);

		pitchFlapLeftWingModel[1].addShapeBox(-15F, -1F, -29F, 38, 1, 31, 0F, -30F, 0F, 0F, -7F, 0F, 0F, -14F, 0F, 0F, -3F, 0F, 0F, -27F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		pitchFlapLeftWingModel[1].setRotationPoint(-91.5F, -35F, -12.5F);

		pitchFlapLeftWingModel[2].addShapeBox(-15F, -0.5F, -29F, 38, 1, 31, 0F, -27F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, -30F, 0F, 0F, -7F, 0F, 0F, -14F, 0F, 0F, -3F, 0F, 0F); // Box 110
		pitchFlapLeftWingModel[2].setRotationPoint(-91.5F, -35F, -12.5F);

		pitchFlapLeftWingModel[3].addShapeBox(0F, 0F, 0F, 16, 2, 49, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 3F, 0F, 0F, -0.2091F, 0F, 0F, -0.2091F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		pitchFlapLeftWingModel[3].setRotationPoint(101F, -25.5F, -65.5F);


		pitchFlapRightWingModel = new ModelRendererTurbo[4];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 200, 1614, textureX, textureY); // Box 111
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 200, 1614, textureX, textureY); // Box 112
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 200, 1614, textureX, textureY); // Box 113
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 200, 1647, textureX, textureY); // Box 346

		pitchFlapRightWingModel[0].addShapeBox(-15F, -1F, -29F, 38, 1, 31, 0F, -3F, 0F, 0F, -14F, 0F, 0F, -7F, 0F, 0F, -30F, 0F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, -27F, -0.5F, 0F); // Box 111
		pitchFlapRightWingModel[0].setRotationPoint(-91.5F, -35F, 39.5F);

		pitchFlapRightWingModel[1].addShapeBox(-15F, -0.5F, -29F, 38, 1, 31, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, -27F, -0.5F, 0F); // Box 112
		pitchFlapRightWingModel[1].setRotationPoint(-91.5F, -35F, 39.5F);

		pitchFlapRightWingModel[2].addShapeBox(-15F, -0.5F, -29F, 38, 1, 31, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, -27F, -0.5F, 0F, -3F, 0F, 0F, -14F, 0F, 0F, -7F, 0F, 0F, -30F, 0F, 0F); // Box 113
		pitchFlapRightWingModel[2].setRotationPoint(-91.5F, -35F, 39.5F);

		pitchFlapRightWingModel[3].addShapeBox(0F, 0F, 0F, 16, 2, 49, 0F, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2091F, 0F, 0F, -0.2091F, 0F); // Box 346
		pitchFlapRightWingModel[3].setRotationPoint(101F, -25.5F, 16.5F);


		bodyWheelModel = new ModelRendererTurbo[7];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Box 540
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 1712, textureX, textureY); // Box 541
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 1724, textureX, textureY); // Box 542
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 1739, textureX, textureY); // Box 543
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 1747, textureX, textureY); // Box 544
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 1753, textureX, textureY); // Box 545
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 1753, textureX, textureY); // Box 546

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 32, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyWheelModel[0].setRotationPoint(-36F, -12.5F, -5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyWheelModel[1].setRotationPoint(-36F, -12.5F, -2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyWheelModel[2].setRotationPoint(-35F, -5.5F, -1F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 543
		bodyWheelModel[3].setRotationPoint(-37F, 1.5F, -1F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyWheelModel[4].setRotationPoint(-39F, 3F, -3F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 545
		bodyWheelModel[5].setRotationPoint(-39F, 6F, -3F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyWheelModel[6].setRotationPoint(-39F, 0F, -3F);


		leftWingWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1760, textureX, textureY); // Box 547
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1776, textureX, textureY); // Box 548
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1799, textureX, textureY); // Box 549
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1814, textureX, textureY); // Box 550
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1822, textureX, textureY); // Box 551
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1814, textureX, textureY); // Box 552
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1830, textureX, textureY); // Box 553

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 20, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 547
		leftWingWheelModel[0].setRotationPoint(57F, -23.5F, -32F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		leftWingWheelModel[1].setRotationPoint(63F, -23.5F, -31F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		leftWingWheelModel[2].setRotationPoint(64F, -5.5F, -30F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 550
		leftWingWheelModel[3].setRotationPoint(59F, 6F, -33F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftWingWheelModel[4].setRotationPoint(59F, 2F, -33F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftWingWheelModel[5].setRotationPoint(59F, -2F, -33F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 4, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 553
		leftWingWheelModel[6].setRotationPoint(63F, -12.5F, -27F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1830, textureX, textureY); // Box 554
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1776, textureX, textureY); // Box 555
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1760, textureX, textureY); // Box 556
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1799, textureX, textureY); // Box 557
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1814, textureX, textureY); // Box 558
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1822, textureX, textureY); // Box 559
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1814, textureX, textureY); // Box 560

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 15, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		rightWingWheelModel[0].setRotationPoint(63F, -12.5F, 12F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		rightWingWheelModel[1].setRotationPoint(63F, -23.5F, 27F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 20, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 556
		rightWingWheelModel[2].setRotationPoint(57F, -23.5F, 31F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		rightWingWheelModel[3].setRotationPoint(64F, -5.5F, 28F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		rightWingWheelModel[4].setRotationPoint(59F, -2F, 30F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightWingWheelModel[5].setRotationPoint(59F, 2F, 30F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 560
		rightWingWheelModel[6].setRotationPoint(59F, 6F, 30F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}