//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCentAVRE extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 4096;

	public ModelCentAVRE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[732];
		turretModel = new ModelRendererTurbo[278];
		barrelModel = new ModelRendererTurbo[24];
		leftTrackWheelModels = new ModelRendererTurbo[110];
		rightTrackWheelModels = new ModelRendererTurbo[110];
		leftTrackModel = new ModelRendererTurbo[632];
		rightTrackModel = new ModelRendererTurbo[632];

		initbodyModel_1();
		initbodyModel_2();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initleftTrackModel_2();
		initrightTrackModel_1();
		initrightTrackModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 177, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 291, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 326, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 336, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 366, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 386, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 291, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 336, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 366, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 386, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 399, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 433, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 399, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 0, 433, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 0, 514, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 0, 514, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 0, 614, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Box 93
		bodyModel[67] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Box 94
		bodyModel[68] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 97
		bodyModel[71] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 98
		bodyModel[72] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 99
		bodyModel[73] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 0, 667, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 0, 684, textureX, textureY); // Box 103
		bodyModel[77] = new ModelRendererTurbo(this, 0, 684, textureX, textureY); // Box 104
		bodyModel[78] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 105
		bodyModel[79] = new ModelRendererTurbo(this, 0, 697, textureX, textureY); // Box 106
		bodyModel[80] = new ModelRendererTurbo(this, 0, 697, textureX, textureY); // Box 107
		bodyModel[81] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 108
		bodyModel[82] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 109
		bodyModel[83] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Box 110
		bodyModel[84] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Box 111
		bodyModel[85] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Box 112
		bodyModel[86] = new ModelRendererTurbo(this, 0, 718, textureX, textureY); // Box 113
		bodyModel[87] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Box 114
		bodyModel[88] = new ModelRendererTurbo(this, 0, 732, textureX, textureY); // Box 115
		bodyModel[89] = new ModelRendererTurbo(this, 0, 732, textureX, textureY); // Box 116
		bodyModel[90] = new ModelRendererTurbo(this, 0, 736, textureX, textureY); // Box 117
		bodyModel[91] = new ModelRendererTurbo(this, 0, 736, textureX, textureY); // Box 118
		bodyModel[92] = new ModelRendererTurbo(this, 0, 718, textureX, textureY); // Box 119
		bodyModel[93] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 126
		bodyModel[94] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 127
		bodyModel[95] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Box 129
		bodyModel[96] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Box 130
		bodyModel[97] = new ModelRendererTurbo(this, 0, 837, textureX, textureY); // Box 131
		bodyModel[98] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 132
		bodyModel[99] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 133
		bodyModel[100] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 134
		bodyModel[101] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Box 135
		bodyModel[102] = new ModelRendererTurbo(this, 20, 838, textureX, textureY); // Box 136
		bodyModel[103] = new ModelRendererTurbo(this, 0, 891, textureX, textureY); // Box 137
		bodyModel[104] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 138
		bodyModel[105] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 139
		bodyModel[106] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 140
		bodyModel[107] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 141
		bodyModel[108] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Box 142
		bodyModel[109] = new ModelRendererTurbo(this, 0, 837, textureX, textureY); // Box 143
		bodyModel[110] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 144
		bodyModel[111] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 145
		bodyModel[112] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 146
		bodyModel[113] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Box 147
		bodyModel[114] = new ModelRendererTurbo(this, 20, 838, textureX, textureY); // Box 148
		bodyModel[115] = new ModelRendererTurbo(this, 0, 891, textureX, textureY); // Box 149
		bodyModel[116] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 150
		bodyModel[117] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Box 151
		bodyModel[118] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 152
		bodyModel[119] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Box 153
		bodyModel[120] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Box 154
		bodyModel[121] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 154
		bodyModel[122] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Box 155
		bodyModel[123] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 156
		bodyModel[124] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Box 157
		bodyModel[125] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 158
		bodyModel[126] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 159
		bodyModel[127] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 160
		bodyModel[128] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 161
		bodyModel[129] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 162
		bodyModel[130] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 163
		bodyModel[131] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 164
		bodyModel[132] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 165
		bodyModel[133] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 166
		bodyModel[134] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 167
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1072, textureX, textureY); // Box 168
		bodyModel[136] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Box 169
		bodyModel[137] = new ModelRendererTurbo(this, 0, 987, textureX, textureY); // Box 171
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 172
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 173
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 174
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 176
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 177
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 178
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 179
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 180
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 181
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 182
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 183
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 184
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 185
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 186
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 187
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 188
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 189
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 190
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 191
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 192
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 193
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 194
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 195
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 196
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 197
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 198
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 199
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 200
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Box 201
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1032, textureX, textureY); // Box 202
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Box 203
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Box 204
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1116, textureX, textureY); // Box 205
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Box 206
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Box 207
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 209
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 210
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 211
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 212
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 213
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 214
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 215
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 216
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 217
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1225, textureX, textureY); // Box 218
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Box 219
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Box 220
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Box 221
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Box 222
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Box 223
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1312, textureX, textureY); // Box 224
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Box 225
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1336, textureX, textureY); // Box 226
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Box 227
		bodyModel[193] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 228
		bodyModel[194] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 229
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 230
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 231
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 232
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 233
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Box 234
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1366, textureX, textureY); // Box 235
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Box 236
		bodyModel[202] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 237
		bodyModel[203] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 238
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 239
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 240
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 241
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 242
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1383, textureX, textureY); // Box 261
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1395, textureX, textureY); // Box 262
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 263
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1408, textureX, textureY); // Box 264
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1414, textureX, textureY); // Box 265
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1419, textureX, textureY); // Box 266
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1428, textureX, textureY); // Box 267
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1435, textureX, textureY); // Box 266
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1419, textureX, textureY); // Box 272
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1428, textureX, textureY); // Box 273
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1435, textureX, textureY); // Box 274
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1443, textureX, textureY); // Box 275
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1383, textureX, textureY); // Box 276
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1395, textureX, textureY); // Box 277
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Box 278
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1408, textureX, textureY); // Box 279
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1414, textureX, textureY); // Box 280
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1449, textureX, textureY); // Box 281
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1453, textureX, textureY); // Box 282
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Box 283
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1462, textureX, textureY); // Box 284
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1468, textureX, textureY); // Box 285
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1443, textureX, textureY); // Box 286
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1449, textureX, textureY); // Box 287
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1453, textureX, textureY); // Box 288
		bodyModel[233] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Box 289
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1462, textureX, textureY); // Box 290
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1468, textureX, textureY); // Box 291
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1473, textureX, textureY); // Box 292
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1473, textureX, textureY); // Box 293
		bodyModel[238] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Box 294
		bodyModel[239] = new ModelRendererTurbo(this, 0, 1496, textureX, textureY); // Box 295
		bodyModel[240] = new ModelRendererTurbo(this, 0, 1504, textureX, textureY); // Box 296
		bodyModel[241] = new ModelRendererTurbo(this, 0, 1514, textureX, textureY); // Box 297
		bodyModel[242] = new ModelRendererTurbo(this, 0, 1521, textureX, textureY); // Box 298
		bodyModel[243] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Box 299
		bodyModel[244] = new ModelRendererTurbo(this, 0, 1548, textureX, textureY); // Box 300
		bodyModel[245] = new ModelRendererTurbo(this, 0, 1569, textureX, textureY); // Box 301
		bodyModel[246] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 302
		bodyModel[247] = new ModelRendererTurbo(this, 0, 1610, textureX, textureY); // Box 303
		bodyModel[248] = new ModelRendererTurbo(this, 0, 1610, textureX, textureY); // Box 304
		bodyModel[249] = new ModelRendererTurbo(this, 0, 1615, textureX, textureY); // Box 305
		bodyModel[250] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Box 306
		bodyModel[251] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Box 307
		bodyModel[252] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Box 308
		bodyModel[253] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Box 309
		bodyModel[254] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Box 310
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Box 311
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1638, textureX, textureY); // Box 312
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Box 313
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1638, textureX, textureY); // Box 314
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Box 315
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Box 316
		bodyModel[261] = new ModelRendererTurbo(this, 0, 1656, textureX, textureY); // Box 317
		bodyModel[262] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Box 416
		bodyModel[263] = new ModelRendererTurbo(this, 0, 1366, textureX, textureY); // Box 417
		bodyModel[264] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Box 418
		bodyModel[265] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 419
		bodyModel[266] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 420
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 421
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 422
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 423
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 424
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Box 425
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1336, textureX, textureY); // Box 426
		bodyModel[273] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Box 427
		bodyModel[274] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 428
		bodyModel[275] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 429
		bodyModel[276] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 430
		bodyModel[277] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 431
		bodyModel[278] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 432
		bodyModel[279] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Box 433
		bodyModel[280] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Box 434
		bodyModel[281] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Box 435
		bodyModel[282] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Box 436
		bodyModel[283] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 437
		bodyModel[284] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 438
		bodyModel[285] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 439
		bodyModel[286] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 440
		bodyModel[287] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Box 443
		bodyModel[288] = new ModelRendererTurbo(this, 0, 1656, textureX, textureY); // Box 444
		bodyModel[289] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 0
		bodyModel[290] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 1
		bodyModel[291] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 2
		bodyModel[292] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 3
		bodyModel[293] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 4
		bodyModel[294] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 5
		bodyModel[295] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 6
		bodyModel[296] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 7
		bodyModel[297] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 8
		bodyModel[298] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 9
		bodyModel[299] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 10
		bodyModel[300] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 11
		bodyModel[301] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 12
		bodyModel[302] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 13
		bodyModel[303] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 14
		bodyModel[304] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 15
		bodyModel[305] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 16
		bodyModel[306] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 17
		bodyModel[307] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 18
		bodyModel[308] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 19
		bodyModel[309] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 20
		bodyModel[310] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 21
		bodyModel[311] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 22
		bodyModel[312] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 23
		bodyModel[313] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 24
		bodyModel[314] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 25
		bodyModel[315] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 26
		bodyModel[316] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 27
		bodyModel[317] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 28
		bodyModel[318] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 29
		bodyModel[319] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 30
		bodyModel[320] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 31
		bodyModel[321] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 32
		bodyModel[322] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Box 33
		bodyModel[323] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 34
		bodyModel[324] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Box 35
		bodyModel[325] = new ModelRendererTurbo(this, 0, 326, textureX, textureY); // Box 1933
		bodyModel[326] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Box 1934
		bodyModel[327] = new ModelRendererTurbo(this, 0, 3499, textureX, textureY); // Box 2168
		bodyModel[328] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2169
		bodyModel[329] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2170
		bodyModel[330] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2171
		bodyModel[331] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2172
		bodyModel[332] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2173
		bodyModel[333] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2174
		bodyModel[334] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2175
		bodyModel[335] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2176
		bodyModel[336] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2177
		bodyModel[337] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2178
		bodyModel[338] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2179
		bodyModel[339] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2180
		bodyModel[340] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2181
		bodyModel[341] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2182
		bodyModel[342] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2183
		bodyModel[343] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2184
		bodyModel[344] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2185
		bodyModel[345] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2186
		bodyModel[346] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2187
		bodyModel[347] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2188
		bodyModel[348] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2189
		bodyModel[349] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2190
		bodyModel[350] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2191
		bodyModel[351] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2192
		bodyModel[352] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2193
		bodyModel[353] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2194
		bodyModel[354] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2195
		bodyModel[355] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2196
		bodyModel[356] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2197
		bodyModel[357] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2198
		bodyModel[358] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2199
		bodyModel[359] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2200
		bodyModel[360] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2201
		bodyModel[361] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2202
		bodyModel[362] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2203
		bodyModel[363] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2204
		bodyModel[364] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2205
		bodyModel[365] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2206
		bodyModel[366] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2207
		bodyModel[367] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2208
		bodyModel[368] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2209
		bodyModel[369] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2210
		bodyModel[370] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2211
		bodyModel[371] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2212
		bodyModel[372] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2213
		bodyModel[373] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2214
		bodyModel[374] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2215
		bodyModel[375] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2216
		bodyModel[376] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2217
		bodyModel[377] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2218
		bodyModel[378] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2219
		bodyModel[379] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2220
		bodyModel[380] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2221
		bodyModel[381] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2222
		bodyModel[382] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2223
		bodyModel[383] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2224
		bodyModel[384] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2225
		bodyModel[385] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2226
		bodyModel[386] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2227
		bodyModel[387] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2228
		bodyModel[388] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2229
		bodyModel[389] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2230
		bodyModel[390] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2231
		bodyModel[391] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2232
		bodyModel[392] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2233
		bodyModel[393] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2234
		bodyModel[394] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2235
		bodyModel[395] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2236
		bodyModel[396] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2237
		bodyModel[397] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2238
		bodyModel[398] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2239
		bodyModel[399] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2240
		bodyModel[400] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2241
		bodyModel[401] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2242
		bodyModel[402] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2243
		bodyModel[403] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2244
		bodyModel[404] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2245
		bodyModel[405] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2246
		bodyModel[406] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2247
		bodyModel[407] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2248
		bodyModel[408] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2249
		bodyModel[409] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2250
		bodyModel[410] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2251
		bodyModel[411] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2252
		bodyModel[412] = new ModelRendererTurbo(this, 0, 3499, textureX, textureY); // Box 2253
		bodyModel[413] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2254
		bodyModel[414] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2255
		bodyModel[415] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2256
		bodyModel[416] = new ModelRendererTurbo(this, 0, 3524, textureX, textureY); // Box 2257
		bodyModel[417] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2258
		bodyModel[418] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2259
		bodyModel[419] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2260
		bodyModel[420] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2261
		bodyModel[421] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2262
		bodyModel[422] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2263
		bodyModel[423] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2264
		bodyModel[424] = new ModelRendererTurbo(this, 0, 3550, textureX, textureY); // Box 2265
		bodyModel[425] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2266
		bodyModel[426] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2267
		bodyModel[427] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2268
		bodyModel[428] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2269
		bodyModel[429] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2270
		bodyModel[430] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2271
		bodyModel[431] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2272
		bodyModel[432] = new ModelRendererTurbo(this, 0, 3554, textureX, textureY); // Box 2273
		bodyModel[433] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2274
		bodyModel[434] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2275
		bodyModel[435] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2276
		bodyModel[436] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2277
		bodyModel[437] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2278
		bodyModel[438] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2279
		bodyModel[439] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2280
		bodyModel[440] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2281
		bodyModel[441] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2282
		bodyModel[442] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2283
		bodyModel[443] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2284
		bodyModel[444] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2285
		bodyModel[445] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2286
		bodyModel[446] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2287
		bodyModel[447] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2288
		bodyModel[448] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2289
		bodyModel[449] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2290
		bodyModel[450] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2291
		bodyModel[451] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2292
		bodyModel[452] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2293
		bodyModel[453] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2294
		bodyModel[454] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2295
		bodyModel[455] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2296
		bodyModel[456] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2297
		bodyModel[457] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2298
		bodyModel[458] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2299
		bodyModel[459] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2300
		bodyModel[460] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2301
		bodyModel[461] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2302
		bodyModel[462] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2303
		bodyModel[463] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2304
		bodyModel[464] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2305
		bodyModel[465] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2306
		bodyModel[466] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2307
		bodyModel[467] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2308
		bodyModel[468] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2309
		bodyModel[469] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2310
		bodyModel[470] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2311
		bodyModel[471] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2312
		bodyModel[472] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2313
		bodyModel[473] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2314
		bodyModel[474] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2315
		bodyModel[475] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2316
		bodyModel[476] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2317
		bodyModel[477] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2318
		bodyModel[478] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2319
		bodyModel[479] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2320
		bodyModel[480] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2321
		bodyModel[481] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2322
		bodyModel[482] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2323
		bodyModel[483] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2324
		bodyModel[484] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2325
		bodyModel[485] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2326
		bodyModel[486] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2327
		bodyModel[487] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2328
		bodyModel[488] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2329
		bodyModel[489] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2330
		bodyModel[490] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2331
		bodyModel[491] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2332
		bodyModel[492] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2333
		bodyModel[493] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2334
		bodyModel[494] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2335
		bodyModel[495] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2336
		bodyModel[496] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2337
		bodyModel[497] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 2338
		bodyModel[498] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 2339
		bodyModel[499] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 2340

		bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 11, 42, 0F,0F, 0F, 0F, -19F, 0F, -0.2F, -19F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(41F, -21F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 100, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-73F, -21F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -19F, 0F, -4F, -19F, 0F, -4F, 0F, 0F, -4F); // Box 2
		bodyModel[2].setRotationPoint(41F, -10F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 114, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 3
		bodyModel[3].setRotationPoint(-73F, -10F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 124, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-72F, -21F, -34F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.78947F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.78947F, 1.2F, 0F, 0F, -0.8F); // Box 5
		bodyModel[5].setRotationPoint(42F, -21F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(41F, -21F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(52F, -21F, -34F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -11F, 3F, 0F, -6F, 1.2F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, 7.01F, 3F, 0F, 6F, 1.2F); // Box 8
		bodyModel[8].setRotationPoint(52F, -21F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(63F, -19.5F, -34F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2.9F, 2F, -9.5F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2.9F, 2F, 5.501F, 1F); // Box 10
		bodyModel[10].setRotationPoint(63F, -19.5F, -21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 124, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-72F, -21F, 21F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.8F, 0F, -5.78947F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 5.78947F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(42F, -21F, 20F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(52F, -21F, 21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, -6F, 1.2F, -2F, -11F, 3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 6F, 1.2F, -2F, 7.01F, 3F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(52F, -21F, 20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(63F, -19.5F, 21F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,2F, -9.5F, 1F, 0F, -6F, -2.9F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 5.501F, 1F, 0F, 3F, -2.9F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(63F, -19.5F, 18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 38, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(14F, -21F, -35F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(52F, -21F, -35F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(52F, -15F, -35F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(50F, -21.5F, -35.2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(15F, -21.5F, -35.2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(20F, -17.5F, -35.2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(49F, -17.5F, -35.2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(35F, -7.5F, -35.2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(63.8F, -16F, -35.2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 38, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(14F, -21F, 34F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(52F, -21F, 34F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(52F, -15F, 34F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(50F, -21.5F, 34.2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(15F, -21.5F, 34.2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(20F, -17.5F, 34.2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(49F, -17.5F, 34.2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(31F, -9.5F, 34.2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(63.8F, -16F, 34.2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(54F, -13F, -16F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(61F, -13F, -16F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(61F, -13F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(61F, -10F, -17F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(61F, -9F, -17F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(61F, -9F, -13F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 41
		bodyModel[41].setRotationPoint(61F, -6F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(61F, -11.2F, -15.5F);

		bodyModel[43].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 43
		bodyModel[43].setRotationPoint(64F, -11.2F, -15.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(54F, -13F, 13F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(61F, -13F, 15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(61F, -13F, 13F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(61F, -10F, 12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(61F, -9F, 16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(61F, -9F, 12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		bodyModel[50].setRotationPoint(61F, -6F, 12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(61F, -11.2F, 13.5F);

		bodyModel[52].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 52
		bodyModel[52].setRotationPoint(64F, -11.2F, 13.5F);

		bodyModel[53].addShapeBox(4F, -0.5F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[53].setRotationPoint(42F, -21F, -12F);
		bodyModel[53].rotateAngleZ = -0.5422738F;

		bodyModel[54].addShapeBox(4F, -0.5F, 8F, 13, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(42F, -21F, -21F);
		bodyModel[54].rotateAngleZ = -0.5422738F;

		bodyModel[55].addShapeBox(4F, -0.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(42F, -21F, -2F);
		bodyModel[55].rotateAngleZ = -0.5422738F;

		bodyModel[56].addShapeBox(4F, -0.5F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(42F, -21F, 2F);
		bodyModel[56].rotateAngleZ = -0.5422738F;

		bodyModel[57].addShapeBox(4F, -0.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(42F, -21F, 12F);
		bodyModel[57].rotateAngleZ = -0.5422738F;

		bodyModel[58].addShapeBox(4F, -0.5F, 0F, 13, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(42F, -21F, 1F);
		bodyModel[58].rotateAngleZ = -0.5422738F;

		bodyModel[59].addShapeBox(6F, -1.5F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(42F, -21F, -2F);
		bodyModel[59].rotateAngleZ = -0.5422738F;

		bodyModel[60].addShapeBox(14F, -1.5F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(42F, -21F, -2F);
		bodyModel[60].rotateAngleZ = -0.5422738F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 83
		bodyModel[61].setRotationPoint(42F, -22F, -30F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[62].setRotationPoint(42F, -23F, -30F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[63].setRotationPoint(42F, -24F, -30F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 86
		bodyModel[64].setRotationPoint(41F, -24F, -30F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 87
		bodyModel[65].setRotationPoint(41F, -23F, -30F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[66].setRotationPoint(19.5F, -22F, 23F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 94
		bodyModel[67].setRotationPoint(19.5F, -22.9F, 23F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 95
		bodyModel[68].setRotationPoint(19.5F, -23F, 23F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[69].setRotationPoint(19.5F, -24F, 24F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[70].setRotationPoint(19.5F, -24F, 27F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[71].setRotationPoint(19.5F, -24F, 32F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[72].setRotationPoint(19.5F, -24F, 29F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 100
		bodyModel[73].setRotationPoint(20.5F, -23F, 34F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 101
		bodyModel[74].setRotationPoint(37.5F, -23F, 34F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 13, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[75].setRotationPoint(27F, -21.5F, -17F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,-1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 103
		bodyModel[76].setRotationPoint(27F, -21.5F, -18F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 104
		bodyModel[77].setRotationPoint(27F, -21.5F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 105
		bodyModel[78].setRotationPoint(32F, -23.5F, -14F);
		bodyModel[78].rotateAngleY = -0.29670597F;

		bodyModel[79].addShapeBox(5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[79].setRotationPoint(32F, -23.5F, -14F);
		bodyModel[79].rotateAngleY = -0.29670597F;

		bodyModel[80].addShapeBox(5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[80].setRotationPoint(32F, -23.5F, -10F);
		bodyModel[80].rotateAngleY = -0.05235988F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 108
		bodyModel[81].setRotationPoint(32F, -23.5F, -10F);
		bodyModel[81].rotateAngleY = -0.05235988F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[82].setRotationPoint(28F, -22F, -20F);
		bodyModel[82].rotateAngleY = -0.34906585F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[83].setRotationPoint(32F, -22F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[84].setRotationPoint(37F, -22F, 13F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[85].setRotationPoint(37F, -22F, 16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[86].setRotationPoint(37.5F, -22F, 14F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[87].setRotationPoint(35F, -22F, -21F);

		bodyModel[88].addShapeBox(4F, -0.5F, 3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[88].setRotationPoint(42F, -21F, -21F);
		bodyModel[88].rotateAngleZ = -0.5422738F;

		bodyModel[89].addShapeBox(4F, -0.5F, 7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[89].setRotationPoint(42F, -21F, -21F);
		bodyModel[89].rotateAngleZ = -0.5422738F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[90].setRotationPoint(27F, -21F, -21F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[91].setRotationPoint(27F, -21F, 19F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 11, 38, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[92].setRotationPoint(27F, -21F, -19F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 126
		bodyModel[93].setRotationPoint(20.5F, -23F, -35F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 127
		bodyModel[94].setRotationPoint(37.5F, -23F, -35F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 57, 3, 42, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[95].setRotationPoint(-73F, -24F, -21F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 37, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[96].setRotationPoint(-24F, -21F, 34F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[97].setRotationPoint(13F, -21F, 34F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[98].setRotationPoint(-23F, -21.5F, 34.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[99].setRotationPoint(11F, -21.5F, 34.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[100].setRotationPoint(-7F, -9.5F, 34.2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[101].setRotationPoint(-28F, -21F, 34F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 136
		bodyModel[102].setRotationPoint(-25F, -21F, 34F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 44, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); // Box 137
		bodyModel[103].setRotationPoint(-72F, -21F, 34F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[104].setRotationPoint(-27F, -21.5F, 34.2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[105].setRotationPoint(-71F, -21.5F, 34.2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[106].setRotationPoint(-31F, -8.5F, 34.2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[107].setRotationPoint(-49F, -18.5F, 34.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 37, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[108].setRotationPoint(-24F, -21F, -35F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[109].setRotationPoint(13F, -21F, -35F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[110].setRotationPoint(-23F, -21.5F, -35.2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[111].setRotationPoint(11F, -21.5F, -35.2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[112].setRotationPoint(-7F, -9.5F, -35.2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[113].setRotationPoint(-28F, -21F, -35F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 148
		bodyModel[114].setRotationPoint(-25F, -21F, -35F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 44, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); // Box 149
		bodyModel[115].setRotationPoint(-72F, -21F, -35F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[116].setRotationPoint(-27F, -21.5F, -35.2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[117].setRotationPoint(-71F, -21.5F, -35.2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[118].setRotationPoint(-31F, -8.5F, -35.2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[119].setRotationPoint(-49F, -18.5F, -35.2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 154
		bodyModel[120].setRotationPoint(-79F, -21F, 21F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[121].setRotationPoint(-73F, -26F, -21F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[122].setRotationPoint(-73F, -27F, -21F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[123].setRotationPoint(-73F, -26F, 19F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[124].setRotationPoint(-73F, -27F, 19F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[125].setRotationPoint(-72F, -27F, -19F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[126].setRotationPoint(-48F, -25F, 17F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[127].setRotationPoint(-48F, -25F, 13F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[128].setRotationPoint(-48F, -25F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[129].setRotationPoint(-48F, -25F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[130].setRotationPoint(-48F, -25F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[131].setRotationPoint(-48F, -25F, -3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[132].setRotationPoint(-48F, -25F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[133].setRotationPoint(-48F, -25F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[134].setRotationPoint(-48F, -25F, -15F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[135].setRotationPoint(-38F, -24.5F, -17F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[136].setRotationPoint(-48F, -25F, -19F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 22, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[137].setRotationPoint(-70F, -25F, -19F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[138].setRotationPoint(-52F, -26F, -18.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[139].setRotationPoint(-52F, -26F, -14.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[140].setRotationPoint(-52F, -26F, -10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[141].setRotationPoint(-52F, -26F, -6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[142].setRotationPoint(-52F, -26F, -2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[143].setRotationPoint(-52F, -26F, 1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[144].setRotationPoint(-52F, -26F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[145].setRotationPoint(-52F, -26F, 9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[146].setRotationPoint(-52F, -26F, 13.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[147].setRotationPoint(-52F, -26F, 17.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[148].setRotationPoint(-51F, -26F, 16.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[149].setRotationPoint(-51F, -26F, 12.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[150].setRotationPoint(-51F, -26F, 8.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[151].setRotationPoint(-51F, -26F, 4.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[152].setRotationPoint(-51F, -26F, 0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[153].setRotationPoint(-51F, -26F, -3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[154].setRotationPoint(-51F, -26F, -7.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[155].setRotationPoint(-51F, -26F, -11.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[156].setRotationPoint(-51F, -26F, -15.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[157].setRotationPoint(-51F, -26F, -19.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[158].setRotationPoint(-51F, -26F, 18.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[159].setRotationPoint(-51F, -26F, 14.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[160].setRotationPoint(-51F, -26F, 10.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[161].setRotationPoint(-51F, -26F, 6.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[162].setRotationPoint(-51F, -26F, 2.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[163].setRotationPoint(-51F, -26F, -1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[164].setRotationPoint(-51F, -26F, -5.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[165].setRotationPoint(-51F, -26F, -9.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[166].setRotationPoint(-51F, -26F, -13.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[167].setRotationPoint(-51F, -26F, -17.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[168].setRotationPoint(-54F, -25.5F, -19F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[169].setRotationPoint(-69.5F, -25.5F, -18.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[170].setRotationPoint(-69.5F, -25.5F, -11.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[171].setRotationPoint(-69.5F, -25.5F, -4.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[172].setRotationPoint(-69.5F, -25.5F, 12.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[173].setRotationPoint(-69.5F, -25.5F, 5.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[174].setRotationPoint(-56F, -26F, -16.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[175].setRotationPoint(-56F, -26F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[176].setRotationPoint(-56F, -26F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[177].setRotationPoint(-56F, -26F, 14.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[178].setRotationPoint(-56F, -26F, 7.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 214
		bodyModel[179].setRotationPoint(-80F, -24F, -21F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 215
		bodyModel[180].setRotationPoint(-80F, -24F, 19F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 8, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 216
		bodyModel[181].setRotationPoint(-80F, -24F, -19F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[182].setRotationPoint(-81F, -16F, -21F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 6, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[183].setRotationPoint(-79F, -22F, -19F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[184].setRotationPoint(-78F, -23.8F, -19F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[185].setRotationPoint(-77F, -23.8F, -19F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[186].setRotationPoint(-76F, -23.8F, -19F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[187].setRotationPoint(-75F, -23.8F, -19F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[188].setRotationPoint(-74F, -23.8F, -19F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[189].setRotationPoint(-79F, -24F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 225
		bodyModel[190].setRotationPoint(-13F, -23F, 23F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 226
		bodyModel[191].setRotationPoint(-13F, -22.9F, 23F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[192].setRotationPoint(-13F, -22F, 23F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 228
		bodyModel[193].setRotationPoint(16.5F, -23F, 34F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 229
		bodyModel[194].setRotationPoint(-11.5F, -23F, 34F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[195].setRotationPoint(-13F, -24F, 32F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[196].setRotationPoint(-13F, -24F, 29F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[197].setRotationPoint(-13F, -24F, 27F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[198].setRotationPoint(-13F, -24F, 24F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[199].setRotationPoint(-23.5F, -22F, 23F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 235
		bodyModel[200].setRotationPoint(-23.5F, -22.9F, 23F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 236
		bodyModel[201].setRotationPoint(-23.5F, -23F, 23F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 237
		bodyModel[202].setRotationPoint(-15.5F, -23F, 34F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 238
		bodyModel[203].setRotationPoint(-22.5F, -23F, 34F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[204].setRotationPoint(-23.5F, -24F, 24F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[205].setRotationPoint(-23.5F, -24F, 27F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[206].setRotationPoint(-23.5F, -24F, 29F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[207].setRotationPoint(-23.5F, -24F, 32F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[208].setRotationPoint(-68F, -26F, -26F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 21, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[209].setRotationPoint(-68F, -26F, -28F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[210].setRotationPoint(-68.5F, -25F, -26F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 264
		bodyModel[211].setRotationPoint(-69.5F, -25F, -26F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F); // Box 265
		bodyModel[212].setRotationPoint(-72.5F, -25F, -26F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[213].setRotationPoint(-47F, -25F, -24F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[214].setRotationPoint(-47F, -25F, -26F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[215].setRotationPoint(-32F, -24F, -24F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[216].setRotationPoint(-47F, -25F, 21F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[217].setRotationPoint(-47F, -25F, 24F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[218].setRotationPoint(-32F, -24F, 21F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[219].setRotationPoint(-46F, -22F, -30F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[220].setRotationPoint(-68F, -26F, 21F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 21, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[221].setRotationPoint(-68F, -26F, 26F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[222].setRotationPoint(-68.5F, -25F, 24F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 279
		bodyModel[223].setRotationPoint(-69.5F, -25F, 24F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F); // Box 280
		bodyModel[224].setRotationPoint(-72.5F, -25F, 24F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[225].setRotationPoint(-54F, -22F, -32F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[226].setRotationPoint(-39F, -22F, -29F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[227].setRotationPoint(-41F, -22F, -30F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 284
		bodyModel[228].setRotationPoint(-42F, -22F, -30F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[229].setRotationPoint(-29F, -22F, -30F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[230].setRotationPoint(-46F, -22F, 26F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[231].setRotationPoint(-54F, -22F, 31F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[232].setRotationPoint(-39F, -22F, 28F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[233].setRotationPoint(-41F, -22F, 27F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 290
		bodyModel[234].setRotationPoint(-42F, -22F, 27F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[235].setRotationPoint(-29F, -22F, 27F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 292
		bodyModel[236].setRotationPoint(-84F, -24F, 18F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 293
		bodyModel[237].setRotationPoint(-84F, -24F, -20F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[238].setRotationPoint(-82F, -23F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[239].setRotationPoint(-83F, -23F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[240].setRotationPoint(-82F, -23F, -2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[241].setRotationPoint(-82F, -19F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[242].setRotationPoint(-81F, -24F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 299
		bodyModel[243].setRotationPoint(-74F, -13F, -9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 300
		bodyModel[244].setRotationPoint(-75F, -9F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 301
		bodyModel[245].setRotationPoint(-76F, -7F, -9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[246].setRotationPoint(-77F, -6F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 303
		bodyModel[247].setRotationPoint(-77F, -5F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 304
		bodyModel[248].setRotationPoint(-77F, -5F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[249].setRotationPoint(-74F, -4.5F, -7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[250].setRotationPoint(-74.5F, -5F, -6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[251].setRotationPoint(-74.5F, -5F, -4F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[252].setRotationPoint(-74.5F, -5F, -2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[253].setRotationPoint(-74.5F, -5F, 5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[254].setRotationPoint(-74.5F, -5F, 3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[255].setRotationPoint(-74.5F, -5F, 1F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[256].setRotationPoint(-75F, -9F, -15F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[257].setRotationPoint(-76F, -6F, -15F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[258].setRotationPoint(-75F, -9F, 12F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[259].setRotationPoint(-76F, -6F, 12F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 316
		bodyModel[260].setRotationPoint(39F, -23F, 31F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 317
		bodyModel[261].setRotationPoint(39F, -23F, 24F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[262].setRotationPoint(-23.5F, -22F, -34F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 417
		bodyModel[263].setRotationPoint(-23.5F, -22.9F, -34F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 418
		bodyModel[264].setRotationPoint(-23.5F, -23F, -34F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 419
		bodyModel[265].setRotationPoint(-15.5F, -23F, -35F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 420
		bodyModel[266].setRotationPoint(-22.5F, -23F, -35F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[267].setRotationPoint(-23.5F, -24F, -25F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[268].setRotationPoint(-23.5F, -24F, -28F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[269].setRotationPoint(-23.5F, -24F, -30F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[270].setRotationPoint(-23.5F, -24F, -33F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 425
		bodyModel[271].setRotationPoint(-13F, -23F, -34F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 426
		bodyModel[272].setRotationPoint(-13F, -22.9F, -34F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[273].setRotationPoint(-13F, -22F, -34F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 428
		bodyModel[274].setRotationPoint(16.5F, -23F, -35F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 429
		bodyModel[275].setRotationPoint(-11.5F, -23F, -35F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[276].setRotationPoint(-13F, -24F, -33F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[277].setRotationPoint(-13F, -24F, -30F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[278].setRotationPoint(-13F, -24F, -28F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[279].setRotationPoint(-13F, -24F, -25F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[280].setRotationPoint(19.5F, -22F, -34F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 435
		bodyModel[281].setRotationPoint(19.5F, -22.9F, -34F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 436
		bodyModel[282].setRotationPoint(19.5F, -23F, -34F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[283].setRotationPoint(19.5F, -24F, -25F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[284].setRotationPoint(19.5F, -24F, -28F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[285].setRotationPoint(19.5F, -24F, -33F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[286].setRotationPoint(19.5F, -24F, -30F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 443
		bodyModel[287].setRotationPoint(39F, -23F, -34F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 444
		bodyModel[288].setRotationPoint(39F, -23F, -25F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[289].setRotationPoint(41F, -3F, 16.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.1F, 0F, -5F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[290].setRotationPoint(41F, 0F, 16.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[291].setRotationPoint(41F, -4F, 16.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 3
		bodyModel[292].setRotationPoint(41F, -3F, -23.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -0.1F, 0F, 3F, -0.1F, 0F); // Box 4
		bodyModel[293].setRotationPoint(41F, 0F, -23.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 5
		bodyModel[294].setRotationPoint(41F, -4F, -23.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[295].setRotationPoint(23F, -3F, 16.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyModel[296].setRotationPoint(23F, 0F, 16.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[297].setRotationPoint(23F, -4F, 16.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[298].setRotationPoint(2F, -4F, 16.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[299].setRotationPoint(2F, -3F, 16.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[300].setRotationPoint(2F, 0F, 16.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[301].setRotationPoint(23F, -3F, -23.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 13
		bodyModel[302].setRotationPoint(23F, 0F, -23.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[303].setRotationPoint(23F, -4F, -23.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[304].setRotationPoint(2F, -4F, -23.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[305].setRotationPoint(2F, -3F, -23.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 17
		bodyModel[306].setRotationPoint(2F, 0F, -23.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[307].setRotationPoint(-17F, -3F, -23.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[308].setRotationPoint(-17F, -3F, 16.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[309].setRotationPoint(-17F, 0F, 16.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 21
		bodyModel[310].setRotationPoint(-17F, 0F, -23.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[311].setRotationPoint(-17F, -4F, -23.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[312].setRotationPoint(-17F, -4F, 16.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[313].setRotationPoint(-34F, -3F, -23.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[314].setRotationPoint(-34F, -3F, 16.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		bodyModel[315].setRotationPoint(-34F, 0F, 16.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 27
		bodyModel[316].setRotationPoint(-34F, 0F, -23.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[317].setRotationPoint(-34F, -4F, -23.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[318].setRotationPoint(-34F, -4F, 16.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[319].setRotationPoint(-53F, -3F, -23.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[320].setRotationPoint(-53F, -3F, 16.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[321].setRotationPoint(-53F, 0F, 16.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 33
		bodyModel[322].setRotationPoint(-53F, 0F, -23.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[323].setRotationPoint(-53F, -4F, -23.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[324].setRotationPoint(-53F, -4F, 16.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1933
		bodyModel[325].setRotationPoint(41F, -21F, 20F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1934
		bodyModel[326].setRotationPoint(-79F, -21F, -34F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 53, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2168
		bodyModel[327].setRotationPoint(-2F, -23F, 35F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 12, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2169
		bodyModel[328].setRotationPoint(-2F, -23F, 36F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2170
		bodyModel[329].setRotationPoint(11.3F, -23F, 36F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2171
		bodyModel[330].setRotationPoint(24.6F, -23F, 36F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2172
		bodyModel[331].setRotationPoint(38F, -23F, 36F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2173
		bodyModel[332].setRotationPoint(-2F, -23F, 37F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2174
		bodyModel[333].setRotationPoint(11.3F, -23F, 37F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2175
		bodyModel[334].setRotationPoint(24.6F, -23F, 37F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2176
		bodyModel[335].setRotationPoint(38F, -23F, 37F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2177
		bodyModel[336].setRotationPoint(-2F, -2F, 37F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2178
		bodyModel[337].setRotationPoint(11.3F, -2F, 37F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2179
		bodyModel[338].setRotationPoint(24.6F, -2F, 37F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2180
		bodyModel[339].setRotationPoint(38F, -2F, 37F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2181
		bodyModel[340].setRotationPoint(-2F, -22F, 37F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2182
		bodyModel[341].setRotationPoint(11.3F, -22F, 37F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2183
		bodyModel[342].setRotationPoint(24.6F, -22F, 37F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2184
		bodyModel[343].setRotationPoint(38F, -22F, 37F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2185
		bodyModel[344].setRotationPoint(10F, -22F, 37F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2186
		bodyModel[345].setRotationPoint(23.3F, -22F, 37F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2187
		bodyModel[346].setRotationPoint(36.6F, -22F, 37F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2188
		bodyModel[347].setRotationPoint(50F, -22F, 37F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2189
		bodyModel[348].setRotationPoint(6F, -21F, 36.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2190
		bodyModel[349].setRotationPoint(19.3F, -21F, 36.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2191
		bodyModel[350].setRotationPoint(32.6F, -21F, 36.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2192
		bodyModel[351].setRotationPoint(46F, -21F, 36.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2193
		bodyModel[352].setRotationPoint(2F, -21F, 36.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2194
		bodyModel[353].setRotationPoint(15.3F, -21F, 36.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2195
		bodyModel[354].setRotationPoint(28.6F, -21F, 36.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2196
		bodyModel[355].setRotationPoint(42F, -21F, 36.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2197
		bodyModel[356].setRotationPoint(0F, -21F, 36.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2198
		bodyModel[357].setRotationPoint(13.3F, -21F, 36.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2199
		bodyModel[358].setRotationPoint(26.6F, -21F, 36.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2200
		bodyModel[359].setRotationPoint(40F, -21F, 36.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2201
		bodyModel[360].setRotationPoint(8F, -21F, 36.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2202
		bodyModel[361].setRotationPoint(21.3F, -21F, 36.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2203
		bodyModel[362].setRotationPoint(34.6F, -21F, 36.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2204
		bodyModel[363].setRotationPoint(48F, -21F, 36.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2205
		bodyModel[364].setRotationPoint(2F, -4F, 36.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2206
		bodyModel[365].setRotationPoint(15.3F, -4F, 36.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2207
		bodyModel[366].setRotationPoint(28.6F, -4F, 36.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2208
		bodyModel[367].setRotationPoint(42F, -4F, 36.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2209
		bodyModel[368].setRotationPoint(46F, -4F, 36.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2210
		bodyModel[369].setRotationPoint(48F, -4F, 36.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2211
		bodyModel[370].setRotationPoint(40F, -4F, 36.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2212
		bodyModel[371].setRotationPoint(32.6F, -4F, 36.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2213
		bodyModel[372].setRotationPoint(34.6F, -4F, 36.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2214
		bodyModel[373].setRotationPoint(26.6F, -4F, 36.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2215
		bodyModel[374].setRotationPoint(19.3F, -4F, 36.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2216
		bodyModel[375].setRotationPoint(21.3F, -4F, 36.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2217
		bodyModel[376].setRotationPoint(13.3F, -4F, 36.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2218
		bodyModel[377].setRotationPoint(8F, -4F, 36.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2219
		bodyModel[378].setRotationPoint(6F, -4F, 36.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2220
		bodyModel[379].setRotationPoint(0F, -4F, 36.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2221
		bodyModel[380].setRotationPoint(2F, -10F, 36.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2222
		bodyModel[381].setRotationPoint(15.3F, -10F, 36.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2223
		bodyModel[382].setRotationPoint(28.6F, -10F, 36.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2224
		bodyModel[383].setRotationPoint(42F, -10F, 36.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2225
		bodyModel[384].setRotationPoint(46F, -10F, 36.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2226
		bodyModel[385].setRotationPoint(48F, -10F, 36.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2227
		bodyModel[386].setRotationPoint(40F, -10F, 36.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2228
		bodyModel[387].setRotationPoint(32.6F, -10F, 36.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2229
		bodyModel[388].setRotationPoint(34.6F, -10F, 36.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2230
		bodyModel[389].setRotationPoint(26.6F, -10F, 36.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2231
		bodyModel[390].setRotationPoint(19.3F, -10F, 36.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2232
		bodyModel[391].setRotationPoint(21.3F, -10F, 36.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2233
		bodyModel[392].setRotationPoint(13.3F, -10F, 36.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2234
		bodyModel[393].setRotationPoint(8F, -10F, 36.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2235
		bodyModel[394].setRotationPoint(6F, -10F, 36.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2236
		bodyModel[395].setRotationPoint(0F, -10F, 36.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2237
		bodyModel[396].setRotationPoint(2F, -15F, 36.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2238
		bodyModel[397].setRotationPoint(15.3F, -15F, 36.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2239
		bodyModel[398].setRotationPoint(28.6F, -15F, 36.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2240
		bodyModel[399].setRotationPoint(42F, -15F, 36.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2241
		bodyModel[400].setRotationPoint(46F, -15F, 36.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2242
		bodyModel[401].setRotationPoint(48F, -15F, 36.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2243
		bodyModel[402].setRotationPoint(40F, -15F, 36.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2244
		bodyModel[403].setRotationPoint(32.6F, -15F, 36.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2245
		bodyModel[404].setRotationPoint(34.6F, -15F, 36.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2246
		bodyModel[405].setRotationPoint(26.6F, -15F, 36.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2247
		bodyModel[406].setRotationPoint(19.3F, -15F, 36.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2248
		bodyModel[407].setRotationPoint(21.3F, -15F, 36.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2249
		bodyModel[408].setRotationPoint(13.3F, -15F, 36.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2250
		bodyModel[409].setRotationPoint(8F, -15F, 36.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2251
		bodyModel[410].setRotationPoint(6F, -15F, 36.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2252
		bodyModel[411].setRotationPoint(0F, -15F, 36.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 53, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2253
		bodyModel[412].setRotationPoint(-2F, -23F, -36F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2254
		bodyModel[413].setRotationPoint(-2F, -23F, -37F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2255
		bodyModel[414].setRotationPoint(11.3F, -23F, -37F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2256
		bodyModel[415].setRotationPoint(24.6F, -23F, -37F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 13, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2257
		bodyModel[416].setRotationPoint(38F, -23F, -37F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2258
		bodyModel[417].setRotationPoint(-2F, -23F, -38F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2259
		bodyModel[418].setRotationPoint(11.3F, -23F, -38F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2260
		bodyModel[419].setRotationPoint(24.6F, -23F, -38F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2261
		bodyModel[420].setRotationPoint(38F, -23F, -38F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2262
		bodyModel[421].setRotationPoint(-2F, -2F, -38F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2263
		bodyModel[422].setRotationPoint(11.3F, -2F, -38F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2264
		bodyModel[423].setRotationPoint(24.6F, -2F, -38F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2265
		bodyModel[424].setRotationPoint(38F, -2F, -38F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2266
		bodyModel[425].setRotationPoint(-2F, -22F, -38F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2267
		bodyModel[426].setRotationPoint(11.3F, -22F, -38F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2268
		bodyModel[427].setRotationPoint(24.6F, -22F, -38F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2269
		bodyModel[428].setRotationPoint(38F, -22F, -38F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2270
		bodyModel[429].setRotationPoint(10F, -22F, -38F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2271
		bodyModel[430].setRotationPoint(23.3F, -22F, -38F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2272
		bodyModel[431].setRotationPoint(36.6F, -22F, -38F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2273
		bodyModel[432].setRotationPoint(50F, -22F, -38F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2274
		bodyModel[433].setRotationPoint(6F, -21F, -37.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2275
		bodyModel[434].setRotationPoint(19.3F, -21F, -37.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2276
		bodyModel[435].setRotationPoint(32.6F, -21F, -37.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2277
		bodyModel[436].setRotationPoint(46F, -21F, -37.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2278
		bodyModel[437].setRotationPoint(2F, -21F, -37.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2279
		bodyModel[438].setRotationPoint(15.3F, -21F, -37.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2280
		bodyModel[439].setRotationPoint(28.6F, -21F, -37.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2281
		bodyModel[440].setRotationPoint(42F, -21F, -37.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2282
		bodyModel[441].setRotationPoint(0F, -21F, -37.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2283
		bodyModel[442].setRotationPoint(13.3F, -21F, -37.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2284
		bodyModel[443].setRotationPoint(26.6F, -21F, -37.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2285
		bodyModel[444].setRotationPoint(40F, -21F, -37.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2286
		bodyModel[445].setRotationPoint(8F, -21F, -37.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2287
		bodyModel[446].setRotationPoint(21.3F, -21F, -37.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2288
		bodyModel[447].setRotationPoint(34.6F, -21F, -37.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2289
		bodyModel[448].setRotationPoint(48F, -21F, -37.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2290
		bodyModel[449].setRotationPoint(2F, -4F, -37.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2291
		bodyModel[450].setRotationPoint(15.3F, -4F, -37.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2292
		bodyModel[451].setRotationPoint(28.6F, -4F, -37.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2293
		bodyModel[452].setRotationPoint(42F, -4F, -37.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2294
		bodyModel[453].setRotationPoint(46F, -4F, -37.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2295
		bodyModel[454].setRotationPoint(48F, -4F, -37.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2296
		bodyModel[455].setRotationPoint(40F, -4F, -37.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2297
		bodyModel[456].setRotationPoint(32.6F, -4F, -37.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2298
		bodyModel[457].setRotationPoint(34.6F, -4F, -37.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2299
		bodyModel[458].setRotationPoint(26.6F, -4F, -37.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2300
		bodyModel[459].setRotationPoint(19.3F, -4F, -37.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2301
		bodyModel[460].setRotationPoint(21.3F, -4F, -37.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2302
		bodyModel[461].setRotationPoint(13.3F, -4F, -37.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2303
		bodyModel[462].setRotationPoint(8F, -4F, -37.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2304
		bodyModel[463].setRotationPoint(6F, -4F, -37.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2305
		bodyModel[464].setRotationPoint(0F, -4F, -37.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2306
		bodyModel[465].setRotationPoint(2F, -10F, -37.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2307
		bodyModel[466].setRotationPoint(15.3F, -10F, -37.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2308
		bodyModel[467].setRotationPoint(28.6F, -10F, -37.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2309
		bodyModel[468].setRotationPoint(42F, -10F, -37.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2310
		bodyModel[469].setRotationPoint(46F, -10F, -37.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2311
		bodyModel[470].setRotationPoint(48F, -10F, -37.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2312
		bodyModel[471].setRotationPoint(40F, -10F, -37.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2313
		bodyModel[472].setRotationPoint(32.6F, -10F, -37.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2314
		bodyModel[473].setRotationPoint(34.6F, -10F, -37.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2315
		bodyModel[474].setRotationPoint(26.6F, -10F, -37.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2316
		bodyModel[475].setRotationPoint(19.3F, -10F, -37.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2317
		bodyModel[476].setRotationPoint(21.3F, -10F, -37.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2318
		bodyModel[477].setRotationPoint(13.3F, -10F, -37.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2319
		bodyModel[478].setRotationPoint(8F, -10F, -37.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2320
		bodyModel[479].setRotationPoint(6F, -10F, -37.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2321
		bodyModel[480].setRotationPoint(0F, -10F, -37.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2322
		bodyModel[481].setRotationPoint(2F, -15F, -37.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2323
		bodyModel[482].setRotationPoint(15.3F, -15F, -37.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2324
		bodyModel[483].setRotationPoint(28.6F, -15F, -37.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2325
		bodyModel[484].setRotationPoint(42F, -15F, -37.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2326
		bodyModel[485].setRotationPoint(46F, -15F, -37.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2327
		bodyModel[486].setRotationPoint(48F, -15F, -37.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2328
		bodyModel[487].setRotationPoint(40F, -15F, -37.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2329
		bodyModel[488].setRotationPoint(32.6F, -15F, -37.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2330
		bodyModel[489].setRotationPoint(34.6F, -15F, -37.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2331
		bodyModel[490].setRotationPoint(26.6F, -15F, -37.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2332
		bodyModel[491].setRotationPoint(19.3F, -15F, -37.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2333
		bodyModel[492].setRotationPoint(21.3F, -15F, -37.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2334
		bodyModel[493].setRotationPoint(13.3F, -15F, -37.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2335
		bodyModel[494].setRotationPoint(8F, -15F, -37.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2336
		bodyModel[495].setRotationPoint(6F, -15F, -37.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2337
		bodyModel[496].setRotationPoint(0F, -15F, -37.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F); // Box 2338
		bodyModel[497].setRotationPoint(41F, -22F, -30F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2339
		bodyModel[498].setRotationPoint(42F, -22F, 27F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2340
		bodyModel[499].setRotationPoint(42F, -23F, 27F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 2341
		bodyModel[501] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 2342
		bodyModel[502] = new ModelRendererTurbo(this, 0, 614, textureX, textureY); // Box 2343
		bodyModel[503] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 2344
		bodyModel[504] = new ModelRendererTurbo(this, 0, 3585, textureX, textureY); // Box 2345
		bodyModel[505] = new ModelRendererTurbo(this, 0, 3585, textureX, textureY); // Box 2346
		bodyModel[506] = new ModelRendererTurbo(this, 0, 3595, textureX, textureY); // Box 2347
		bodyModel[507] = new ModelRendererTurbo(this, 0, 3595, textureX, textureY); // Box 2348
		bodyModel[508] = new ModelRendererTurbo(this, 0, 3626, textureX, textureY); // Box 2349
		bodyModel[509] = new ModelRendererTurbo(this, 0, 3626, textureX, textureY); // Box 2350
		bodyModel[510] = new ModelRendererTurbo(this, 0, 3626, textureX, textureY); // Box 2351
		bodyModel[511] = new ModelRendererTurbo(this, 0, 3626, textureX, textureY); // Box 2352
		bodyModel[512] = new ModelRendererTurbo(this, 0, 3633, textureX, textureY); // Box 2353
		bodyModel[513] = new ModelRendererTurbo(this, 0, 3642, textureX, textureY); // Box 2354
		bodyModel[514] = new ModelRendererTurbo(this, 0, 3633, textureX, textureY); // Box 2355
		bodyModel[515] = new ModelRendererTurbo(this, 0, 3642, textureX, textureY); // Box 2356
		bodyModel[516] = new ModelRendererTurbo(this, 0, 3652, textureX, textureY); // Box 2357
		bodyModel[517] = new ModelRendererTurbo(this, 0, 3705, textureX, textureY); // Box 2358
		bodyModel[518] = new ModelRendererTurbo(this, 0, 3785, textureX, textureY); // Box 2359
		bodyModel[519] = new ModelRendererTurbo(this, 0, 3860, textureX, textureY); // Box 2360
		bodyModel[520] = new ModelRendererTurbo(this, 0, 3860, textureX, textureY); // Box 2361
		bodyModel[521] = new ModelRendererTurbo(this, 0, 3861, textureX, textureY); // Box 2362
		bodyModel[522] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 2363
		bodyModel[523] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 2364
		bodyModel[524] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 2365
		bodyModel[525] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 2366
		bodyModel[526] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 2367
		bodyModel[527] = new ModelRendererTurbo(this, 0, 3932, textureX, textureY); // Box 2368
		bodyModel[528] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2369
		bodyModel[529] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2370
		bodyModel[530] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2371
		bodyModel[531] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2372
		bodyModel[532] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2373
		bodyModel[533] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2374
		bodyModel[534] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2375
		bodyModel[535] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2376
		bodyModel[536] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2377
		bodyModel[537] = new ModelRendererTurbo(this, 0, 3941, textureX, textureY); // Box 2378
		bodyModel[538] = new ModelRendererTurbo(this, 0, 3946, textureX, textureY); // Box 2379
		bodyModel[539] = new ModelRendererTurbo(this, 0, 4007, textureX, textureY); // Box 2380
		bodyModel[540] = new ModelRendererTurbo(this, 0, 4044, textureX, textureY); // Box 2381
		bodyModel[541] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2382
		bodyModel[542] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2383
		bodyModel[543] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2384
		bodyModel[544] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2385
		bodyModel[545] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2386
		bodyModel[546] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2387
		bodyModel[547] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2388
		bodyModel[548] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2389
		bodyModel[549] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2390
		bodyModel[550] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2391
		bodyModel[551] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2392
		bodyModel[552] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2393
		bodyModel[553] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2394
		bodyModel[554] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2395
		bodyModel[555] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2396
		bodyModel[556] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2397
		bodyModel[557] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2398
		bodyModel[558] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2399
		bodyModel[559] = new ModelRendererTurbo(this, 0, 4075, textureX, textureY); // Box 2400
		bodyModel[560] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2401
		bodyModel[561] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2402
		bodyModel[562] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2403
		bodyModel[563] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2404
		bodyModel[564] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2405
		bodyModel[565] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2406
		bodyModel[566] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2407
		bodyModel[567] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2408
		bodyModel[568] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2409
		bodyModel[569] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2410
		bodyModel[570] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2411
		bodyModel[571] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2412
		bodyModel[572] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2413
		bodyModel[573] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2414
		bodyModel[574] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2415
		bodyModel[575] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2416
		bodyModel[576] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2417
		bodyModel[577] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2418
		bodyModel[578] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2419
		bodyModel[579] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2420
		bodyModel[580] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2421
		bodyModel[581] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2422
		bodyModel[582] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2423
		bodyModel[583] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2424
		bodyModel[584] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2425
		bodyModel[585] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2426
		bodyModel[586] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2427
		bodyModel[587] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2428
		bodyModel[588] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2429
		bodyModel[589] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2430
		bodyModel[590] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2431
		bodyModel[591] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2432
		bodyModel[592] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2433
		bodyModel[593] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2434
		bodyModel[594] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2435
		bodyModel[595] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2436
		bodyModel[596] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2437
		bodyModel[597] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2438
		bodyModel[598] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2439
		bodyModel[599] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2440
		bodyModel[600] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2441
		bodyModel[601] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2442
		bodyModel[602] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2443
		bodyModel[603] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2444
		bodyModel[604] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2445
		bodyModel[605] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2446
		bodyModel[606] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2447
		bodyModel[607] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2448
		bodyModel[608] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2449
		bodyModel[609] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2450
		bodyModel[610] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2451
		bodyModel[611] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2452
		bodyModel[612] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2453
		bodyModel[613] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2454
		bodyModel[614] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2455
		bodyModel[615] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2456
		bodyModel[616] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2457
		bodyModel[617] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2458
		bodyModel[618] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2459
		bodyModel[619] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2460
		bodyModel[620] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2461
		bodyModel[621] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2462
		bodyModel[622] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2463
		bodyModel[623] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2464
		bodyModel[624] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2465
		bodyModel[625] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2466
		bodyModel[626] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2467
		bodyModel[627] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2468
		bodyModel[628] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2469
		bodyModel[629] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2470
		bodyModel[630] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2471
		bodyModel[631] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2472
		bodyModel[632] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2473
		bodyModel[633] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2474
		bodyModel[634] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2475
		bodyModel[635] = new ModelRendererTurbo(this, 0, 4081, textureX, textureY); // Box 2476
		bodyModel[636] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2422
		bodyModel[637] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2423
		bodyModel[638] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2424
		bodyModel[639] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2425
		bodyModel[640] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2426
		bodyModel[641] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2427
		bodyModel[642] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2428
		bodyModel[643] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2429
		bodyModel[644] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2430
		bodyModel[645] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2431
		bodyModel[646] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2432
		bodyModel[647] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2433
		bodyModel[648] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2434
		bodyModel[649] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2435
		bodyModel[650] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2436
		bodyModel[651] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2437
		bodyModel[652] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2438
		bodyModel[653] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2439
		bodyModel[654] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2440
		bodyModel[655] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2441
		bodyModel[656] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2442
		bodyModel[657] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2443
		bodyModel[658] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2444
		bodyModel[659] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2445
		bodyModel[660] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2446
		bodyModel[661] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2447
		bodyModel[662] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2448
		bodyModel[663] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2449
		bodyModel[664] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2450
		bodyModel[665] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2451
		bodyModel[666] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2452
		bodyModel[667] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2453
		bodyModel[668] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2454
		bodyModel[669] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2455
		bodyModel[670] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2456
		bodyModel[671] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2457
		bodyModel[672] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2458
		bodyModel[673] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2459
		bodyModel[674] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2460
		bodyModel[675] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2461
		bodyModel[676] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2462
		bodyModel[677] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2463
		bodyModel[678] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2464
		bodyModel[679] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2465
		bodyModel[680] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2466
		bodyModel[681] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2467
		bodyModel[682] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2468
		bodyModel[683] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2469
		bodyModel[684] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2470
		bodyModel[685] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2471
		bodyModel[686] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2472
		bodyModel[687] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2473
		bodyModel[688] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2474
		bodyModel[689] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2475
		bodyModel[690] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2476
		bodyModel[691] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2477
		bodyModel[692] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2478
		bodyModel[693] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2479
		bodyModel[694] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2480
		bodyModel[695] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2481
		bodyModel[696] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2482
		bodyModel[697] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2483
		bodyModel[698] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2484
		bodyModel[699] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2485
		bodyModel[700] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2486
		bodyModel[701] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2487
		bodyModel[702] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2488
		bodyModel[703] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2489
		bodyModel[704] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2490
		bodyModel[705] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2491
		bodyModel[706] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2492
		bodyModel[707] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2493
		bodyModel[708] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2494
		bodyModel[709] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2495
		bodyModel[710] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2496
		bodyModel[711] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2497
		bodyModel[712] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2498
		bodyModel[713] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2499
		bodyModel[714] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2500
		bodyModel[715] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2501
		bodyModel[716] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2502
		bodyModel[717] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2503
		bodyModel[718] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2504
		bodyModel[719] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2505
		bodyModel[720] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2506
		bodyModel[721] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2507
		bodyModel[722] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2508
		bodyModel[723] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2509
		bodyModel[724] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2510
		bodyModel[725] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2511
		bodyModel[726] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2512
		bodyModel[727] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2513
		bodyModel[728] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2514
		bodyModel[729] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2515
		bodyModel[730] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2516
		bodyModel[731] = new ModelRendererTurbo(this, 0, 3580, textureX, textureY); // Box 2517

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2341
		bodyModel[500].setRotationPoint(42F, -24F, 27F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2342
		bodyModel[501].setRotationPoint(41F, -24F, 27F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2343
		bodyModel[502].setRotationPoint(41F, -23F, 27F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F); // Box 2344
		bodyModel[503].setRotationPoint(41F, -22F, 27F);

		bodyModel[504].addShapeBox(1F, -3.5F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2345
		bodyModel[504].setRotationPoint(42F, -21F, 10F);
		bodyModel[504].rotateAngleZ = -0.5422738F;

		bodyModel[505].addShapeBox(1F, -3.5F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2346
		bodyModel[505].setRotationPoint(42F, -21F, -13F);
		bodyModel[505].rotateAngleZ = -0.5422738F;

		bodyModel[506].addShapeBox(-2F, -3.5F, 0F, 3, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 2347
		bodyModel[506].setRotationPoint(42F, -21F, -13F);
		bodyModel[506].rotateAngleZ = -0.5422738F;

		bodyModel[507].addShapeBox(22F, -3.5F, 0F, 3, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 2348
		bodyModel[507].setRotationPoint(42F, -21F, -13F);
		bodyModel[507].rotateAngleZ = -0.5422738F;

		bodyModel[508].addShapeBox(1F, -3F, 0F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2349
		bodyModel[508].setRotationPoint(42F, -21F, -15F);
		bodyModel[508].rotateAngleZ = -0.5422738F;

		bodyModel[509].addShapeBox(12F, -3F, 0F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2350
		bodyModel[509].setRotationPoint(42F, -21F, -15F);
		bodyModel[509].rotateAngleZ = -0.5422738F;

		bodyModel[510].addShapeBox(1F, -3F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2351
		bodyModel[510].setRotationPoint(42F, -21F, 13F);
		bodyModel[510].rotateAngleZ = -0.5422738F;

		bodyModel[511].addShapeBox(12F, -3F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2352
		bodyModel[511].setRotationPoint(42F, -21F, 13F);
		bodyModel[511].rotateAngleZ = -0.5422738F;

		bodyModel[512].addShapeBox(1F, -3.5F, 0F, 25, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2353
		bodyModel[512].setRotationPoint(42F, -5F, 10F);

		bodyModel[513].addShapeBox(0F, -3.5F, 0F, 26, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 2354
		bodyModel[513].setRotationPoint(42F, -2F, 10F);

		bodyModel[514].addShapeBox(1F, -3.5F, 0F, 25, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2355
		bodyModel[514].setRotationPoint(42F, -5F, -13F);

		bodyModel[515].addShapeBox(0F, -3.5F, 0F, 26, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 2356
		bodyModel[515].setRotationPoint(42F, -2F, -13F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 11, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2357
		bodyModel[516].setRotationPoint(68F, -11F, -18F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 11, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2358
		bodyModel[517].setRotationPoint(70F, -11F, -33F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 7, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 2359
		bodyModel[518].setRotationPoint(70F, 0F, -33F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 2360
		bodyModel[519].setRotationPoint(72F, -11F, -33F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 2361
		bodyModel[520].setRotationPoint(72F, -11F, 31F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 7, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2362
		bodyModel[521].setRotationPoint(72F, -11F, -31F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2363
		bodyModel[522].setRotationPoint(73F, -11F, -30F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2364
		bodyModel[523].setRotationPoint(73F, -11F, -19F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2365
		bodyModel[524].setRotationPoint(73F, -11F, -8F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2366
		bodyModel[525].setRotationPoint(73F, -11F, 29F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2367
		bodyModel[526].setRotationPoint(73F, -11F, 18F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2368
		bodyModel[527].setRotationPoint(73F, -11F, 7F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2369
		bodyModel[528].setRotationPoint(72.5F, -10F, -27F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2370
		bodyModel[529].setRotationPoint(72.5F, -10F, -16F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2371
		bodyModel[530].setRotationPoint(72.5F, -10F, -5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2372
		bodyModel[531].setRotationPoint(72.5F, -10F, 10F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2373
		bodyModel[532].setRotationPoint(72.5F, -10F, 21F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2374
		bodyModel[533].setRotationPoint(72.5F, -10F, 26F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2375
		bodyModel[534].setRotationPoint(72.5F, -10F, 15F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2376
		bodyModel[535].setRotationPoint(72.5F, -10F, 4F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2377
		bodyModel[536].setRotationPoint(72.5F, -10F, -11F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2378
		bodyModel[537].setRotationPoint(72.5F, -10F, -22F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2379
		bodyModel[538].setRotationPoint(73.9F, -10F, -29F);

		bodyModel[539].addShapeBox(9F, -4.5F, 0F, 17, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2380
		bodyModel[539].setRotationPoint(42F, -21F, -17F);
		bodyModel[539].rotateAngleZ = -0.5422738F;

		bodyModel[540].addShapeBox(1F, -4.5F, 0F, 8, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2381
		bodyModel[540].setRotationPoint(42F, -21F, -8F);
		bodyModel[540].rotateAngleZ = -0.5422738F;

		bodyModel[541].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2382
		bodyModel[541].setRotationPoint(42F, -21F, -16.5F);
		bodyModel[541].rotateAngleZ = -0.5422738F;

		bodyModel[542].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2383
		bodyModel[542].setRotationPoint(42F, -21F, -16.5F);
		bodyModel[542].rotateAngleZ = -0.5422738F;

		bodyModel[543].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2384
		bodyModel[543].setRotationPoint(42F, -21F, -11.5F);
		bodyModel[543].rotateAngleZ = -0.5422738F;

		bodyModel[544].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2385
		bodyModel[544].setRotationPoint(42F, -21F, -11.5F);
		bodyModel[544].rotateAngleZ = -0.5422738F;

		bodyModel[545].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2386
		bodyModel[545].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[545].rotateAngleZ = -0.5422738F;

		bodyModel[546].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2387
		bodyModel[546].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[546].rotateAngleZ = -0.5422738F;

		bodyModel[547].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2388
		bodyModel[547].setRotationPoint(42F, -21F, -2F);
		bodyModel[547].rotateAngleZ = -0.5422738F;

		bodyModel[548].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2389
		bodyModel[548].setRotationPoint(42F, -21F, -2F);
		bodyModel[548].rotateAngleZ = -0.5422738F;

		bodyModel[549].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2390
		bodyModel[549].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[549].rotateAngleZ = -0.5422738F;

		bodyModel[550].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2391
		bodyModel[550].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[550].rotateAngleZ = -0.5422738F;

		bodyModel[551].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2392
		bodyModel[551].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[551].rotateAngleZ = -0.5422738F;

		bodyModel[552].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2393
		bodyModel[552].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[552].rotateAngleZ = -0.5422738F;

		bodyModel[553].addShapeBox(10F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2394
		bodyModel[553].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[553].rotateAngleZ = -0.5422738F;

		bodyModel[554].addShapeBox(18.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2395
		bodyModel[554].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[554].rotateAngleZ = -0.5422738F;

		bodyModel[555].addShapeBox(1.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2396
		bodyModel[555].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[555].rotateAngleZ = -0.5422738F;

		bodyModel[556].addShapeBox(1.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2397
		bodyModel[556].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[556].rotateAngleZ = -0.5422738F;

		bodyModel[557].addShapeBox(1.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2398
		bodyModel[557].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[557].rotateAngleZ = -0.5422738F;

		bodyModel[558].addShapeBox(1.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2399
		bodyModel[558].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[558].rotateAngleZ = -0.5422738F;

		bodyModel[559].addShapeBox(1.5F, -5F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2400
		bodyModel[559].setRotationPoint(42F, -21F, -2F);
		bodyModel[559].rotateAngleZ = -0.5422738F;

		bodyModel[560].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2401
		bodyModel[560].setRotationPoint(42F, -21F, -16.5F);
		bodyModel[560].rotateAngleZ = -0.5422738F;

		bodyModel[561].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2402
		bodyModel[561].setRotationPoint(42F, -21F, -13.5F);
		bodyModel[561].rotateAngleZ = -0.5422738F;

		bodyModel[562].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2403
		bodyModel[562].setRotationPoint(42F, -21F, -8.5F);
		bodyModel[562].rotateAngleZ = -0.5422738F;

		bodyModel[563].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2404
		bodyModel[563].setRotationPoint(42F, -21F, -11.5F);
		bodyModel[563].rotateAngleZ = -0.5422738F;

		bodyModel[564].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2405
		bodyModel[564].setRotationPoint(42F, -21F, -3.5F);
		bodyModel[564].rotateAngleZ = -0.5422738F;

		bodyModel[565].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2406
		bodyModel[565].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[565].rotateAngleZ = -0.5422738F;

		bodyModel[566].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2407
		bodyModel[566].setRotationPoint(42F, -21F, 1F);
		bodyModel[566].rotateAngleZ = -0.5422738F;

		bodyModel[567].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2408
		bodyModel[567].setRotationPoint(42F, -21F, -2F);
		bodyModel[567].rotateAngleZ = -0.5422738F;

		bodyModel[568].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2409
		bodyModel[568].setRotationPoint(42F, -21F, 15.5F);
		bodyModel[568].rotateAngleZ = -0.5422738F;

		bodyModel[569].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2410
		bodyModel[569].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[569].rotateAngleZ = -0.5422738F;

		bodyModel[570].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2411
		bodyModel[570].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[570].rotateAngleZ = -0.5422738F;

		bodyModel[571].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2412
		bodyModel[571].setRotationPoint(42F, -21F, 10.5F);
		bodyModel[571].rotateAngleZ = -0.5422738F;

		bodyModel[572].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2413
		bodyModel[572].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[572].rotateAngleZ = -0.5422738F;

		bodyModel[573].addShapeBox(10F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2414
		bodyModel[573].setRotationPoint(42F, -21F, 5.5F);
		bodyModel[573].rotateAngleZ = -0.5422738F;

		bodyModel[574].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2415
		bodyModel[574].setRotationPoint(42F, -21F, 15.5F);
		bodyModel[574].rotateAngleZ = -0.5422738F;

		bodyModel[575].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2416
		bodyModel[575].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[575].rotateAngleZ = -0.5422738F;

		bodyModel[576].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2417
		bodyModel[576].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[576].rotateAngleZ = -0.5422738F;

		bodyModel[577].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2418
		bodyModel[577].setRotationPoint(42F, -21F, 10.5F);
		bodyModel[577].rotateAngleZ = -0.5422738F;

		bodyModel[578].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2419
		bodyModel[578].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[578].rotateAngleZ = -0.5422738F;

		bodyModel[579].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2420
		bodyModel[579].setRotationPoint(42F, -21F, 5.5F);
		bodyModel[579].rotateAngleZ = -0.5422738F;

		bodyModel[580].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2421
		bodyModel[580].setRotationPoint(42F, -21F, 1F);
		bodyModel[580].rotateAngleZ = -0.5422738F;

		bodyModel[581].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2422
		bodyModel[581].setRotationPoint(42F, -21F, -2F);
		bodyModel[581].rotateAngleZ = -0.5422738F;

		bodyModel[582].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2423
		bodyModel[582].setRotationPoint(42F, -21F, -3.5F);
		bodyModel[582].rotateAngleZ = -0.5422738F;

		bodyModel[583].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2424
		bodyModel[583].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[583].rotateAngleZ = -0.5422738F;

		bodyModel[584].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2425
		bodyModel[584].setRotationPoint(42F, -21F, -8.5F);
		bodyModel[584].rotateAngleZ = -0.5422738F;

		bodyModel[585].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2426
		bodyModel[585].setRotationPoint(42F, -21F, -11.5F);
		bodyModel[585].rotateAngleZ = -0.5422738F;

		bodyModel[586].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2427
		bodyModel[586].setRotationPoint(42F, -21F, -13.5F);
		bodyModel[586].rotateAngleZ = -0.5422738F;

		bodyModel[587].addShapeBox(16F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2428
		bodyModel[587].setRotationPoint(42F, -21F, -16.5F);
		bodyModel[587].rotateAngleZ = -0.5422738F;

		bodyModel[588].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2429
		bodyModel[588].setRotationPoint(42F, -21F, 15.5F);
		bodyModel[588].rotateAngleZ = -0.5422738F;

		bodyModel[589].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2430
		bodyModel[589].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[589].rotateAngleZ = -0.5422738F;

		bodyModel[590].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2431
		bodyModel[590].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[590].rotateAngleZ = -0.5422738F;

		bodyModel[591].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2432
		bodyModel[591].setRotationPoint(42F, -21F, 10.5F);
		bodyModel[591].rotateAngleZ = -0.5422738F;

		bodyModel[592].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2433
		bodyModel[592].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[592].rotateAngleZ = -0.5422738F;

		bodyModel[593].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2434
		bodyModel[593].setRotationPoint(42F, -21F, 5.5F);
		bodyModel[593].rotateAngleZ = -0.5422738F;

		bodyModel[594].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2435
		bodyModel[594].setRotationPoint(42F, -21F, 1F);
		bodyModel[594].rotateAngleZ = -0.5422738F;

		bodyModel[595].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2436
		bodyModel[595].setRotationPoint(42F, -21F, -2F);
		bodyModel[595].rotateAngleZ = -0.5422738F;

		bodyModel[596].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2437
		bodyModel[596].setRotationPoint(42F, -21F, -3.5F);
		bodyModel[596].rotateAngleZ = -0.5422738F;

		bodyModel[597].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2438
		bodyModel[597].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[597].rotateAngleZ = -0.5422738F;

		bodyModel[598].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2439
		bodyModel[598].setRotationPoint(42F, -21F, -8.5F);
		bodyModel[598].rotateAngleZ = -0.5422738F;

		bodyModel[599].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2440
		bodyModel[599].setRotationPoint(42F, -21F, -11.5F);
		bodyModel[599].rotateAngleZ = -0.5422738F;

		bodyModel[600].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2441
		bodyModel[600].setRotationPoint(42F, -21F, -13.5F);
		bodyModel[600].rotateAngleZ = -0.5422738F;

		bodyModel[601].addShapeBox(18.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2442
		bodyModel[601].setRotationPoint(42F, -21F, -16.5F);
		bodyModel[601].rotateAngleZ = -0.5422738F;

		bodyModel[602].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2443
		bodyModel[602].setRotationPoint(42F, -21F, 15.5F);
		bodyModel[602].rotateAngleZ = -0.5422738F;

		bodyModel[603].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2444
		bodyModel[603].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[603].rotateAngleZ = -0.5422738F;

		bodyModel[604].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2445
		bodyModel[604].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[604].rotateAngleZ = -0.5422738F;

		bodyModel[605].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2446
		bodyModel[605].setRotationPoint(42F, -21F, 10.5F);
		bodyModel[605].rotateAngleZ = -0.5422738F;

		bodyModel[606].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2447
		bodyModel[606].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[606].rotateAngleZ = -0.5422738F;

		bodyModel[607].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2448
		bodyModel[607].setRotationPoint(42F, -21F, 5.5F);
		bodyModel[607].rotateAngleZ = -0.5422738F;

		bodyModel[608].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2449
		bodyModel[608].setRotationPoint(42F, -21F, 1F);
		bodyModel[608].rotateAngleZ = -0.5422738F;

		bodyModel[609].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2450
		bodyModel[609].setRotationPoint(42F, -21F, -2F);
		bodyModel[609].rotateAngleZ = -0.5422738F;

		bodyModel[610].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2451
		bodyModel[610].setRotationPoint(42F, -21F, -3.5F);
		bodyModel[610].rotateAngleZ = -0.5422738F;

		bodyModel[611].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2452
		bodyModel[611].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[611].rotateAngleZ = -0.5422738F;

		bodyModel[612].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2453
		bodyModel[612].setRotationPoint(42F, -21F, -8.5F);
		bodyModel[612].rotateAngleZ = -0.5422738F;

		bodyModel[613].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2454
		bodyModel[613].setRotationPoint(42F, -21F, -11.5F);
		bodyModel[613].rotateAngleZ = -0.5422738F;

		bodyModel[614].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2455
		bodyModel[614].setRotationPoint(42F, -21F, -13.5F);
		bodyModel[614].rotateAngleZ = -0.5422738F;

		bodyModel[615].addShapeBox(24.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2456
		bodyModel[615].setRotationPoint(42F, -21F, -16.5F);
		bodyModel[615].rotateAngleZ = -0.5422738F;

		bodyModel[616].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2457
		bodyModel[616].setRotationPoint(42F, -21F, 15.5F);
		bodyModel[616].rotateAngleZ = -0.5422738F;

		bodyModel[617].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2458
		bodyModel[617].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[617].rotateAngleZ = -0.5422738F;

		bodyModel[618].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2459
		bodyModel[618].setRotationPoint(42F, -21F, 10.5F);
		bodyModel[618].rotateAngleZ = -0.5422738F;

		bodyModel[619].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2460
		bodyModel[619].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[619].rotateAngleZ = -0.5422738F;

		bodyModel[620].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2461
		bodyModel[620].setRotationPoint(42F, -21F, 5.5F);
		bodyModel[620].rotateAngleZ = -0.5422738F;

		bodyModel[621].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2462
		bodyModel[621].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[621].rotateAngleZ = -0.5422738F;

		bodyModel[622].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2463
		bodyModel[622].setRotationPoint(42F, -21F, 1F);
		bodyModel[622].rotateAngleZ = -0.5422738F;

		bodyModel[623].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2464
		bodyModel[623].setRotationPoint(42F, -21F, -2F);
		bodyModel[623].rotateAngleZ = -0.5422738F;

		bodyModel[624].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2465
		bodyModel[624].setRotationPoint(42F, -21F, -3.5F);
		bodyModel[624].rotateAngleZ = -0.5422738F;

		bodyModel[625].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2466
		bodyModel[625].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[625].rotateAngleZ = -0.5422738F;

		bodyModel[626].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2467
		bodyModel[626].setRotationPoint(42F, -21F, 15.5F);
		bodyModel[626].rotateAngleZ = -0.5422738F;

		bodyModel[627].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2468
		bodyModel[627].setRotationPoint(42F, -21F, 12.5F);
		bodyModel[627].rotateAngleZ = -0.5422738F;

		bodyModel[628].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2469
		bodyModel[628].setRotationPoint(42F, -21F, 10.5F);
		bodyModel[628].rotateAngleZ = -0.5422738F;

		bodyModel[629].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2470
		bodyModel[629].setRotationPoint(42F, -21F, 7.5F);
		bodyModel[629].rotateAngleZ = -0.5422738F;

		bodyModel[630].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2471
		bodyModel[630].setRotationPoint(42F, -21F, 5.5F);
		bodyModel[630].rotateAngleZ = -0.5422738F;

		bodyModel[631].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2472
		bodyModel[631].setRotationPoint(42F, -21F, 2.5F);
		bodyModel[631].rotateAngleZ = -0.5422738F;

		bodyModel[632].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2473
		bodyModel[632].setRotationPoint(42F, -21F, 1F);
		bodyModel[632].rotateAngleZ = -0.5422738F;

		bodyModel[633].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2474
		bodyModel[633].setRotationPoint(42F, -21F, -2F);
		bodyModel[633].rotateAngleZ = -0.5422738F;

		bodyModel[634].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2475
		bodyModel[634].setRotationPoint(42F, -21F, -3.5F);
		bodyModel[634].rotateAngleZ = -0.5422738F;

		bodyModel[635].addShapeBox(1.5F, -6F, 0F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2476
		bodyModel[635].setRotationPoint(42F, -21F, -6.5F);
		bodyModel[635].rotateAngleZ = -0.5422738F;

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2422
		bodyModel[636].setRotationPoint(0F, -18F, 36.5F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2423
		bodyModel[637].setRotationPoint(2F, -18F, 36.5F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2424
		bodyModel[638].setRotationPoint(6F, -18F, 36.5F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2425
		bodyModel[639].setRotationPoint(8F, -18F, 36.5F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2426
		bodyModel[640].setRotationPoint(13.3F, -18F, 36.5F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2427
		bodyModel[641].setRotationPoint(15.3F, -18F, 36.5F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2428
		bodyModel[642].setRotationPoint(19.3F, -18F, 36.5F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2429
		bodyModel[643].setRotationPoint(21.3F, -18F, 36.5F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2430
		bodyModel[644].setRotationPoint(26.6F, -18F, 36.5F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2431
		bodyModel[645].setRotationPoint(28.6F, -18F, 36.5F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2432
		bodyModel[646].setRotationPoint(32.6F, -18F, 36.5F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2433
		bodyModel[647].setRotationPoint(34.6F, -18F, 36.5F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2434
		bodyModel[648].setRotationPoint(40F, -18F, 36.5F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2435
		bodyModel[649].setRotationPoint(42F, -18F, 36.5F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2436
		bodyModel[650].setRotationPoint(46F, -18F, 36.5F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2437
		bodyModel[651].setRotationPoint(48F, -18F, 36.5F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2438
		bodyModel[652].setRotationPoint(0F, -18F, -37.5F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2439
		bodyModel[653].setRotationPoint(2F, -18F, -37.5F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2440
		bodyModel[654].setRotationPoint(6F, -18F, -37.5F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2441
		bodyModel[655].setRotationPoint(8F, -18F, -37.5F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2442
		bodyModel[656].setRotationPoint(13.3F, -18F, -37.5F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2443
		bodyModel[657].setRotationPoint(15.3F, -18F, -37.5F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2444
		bodyModel[658].setRotationPoint(19.3F, -18F, -37.5F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2445
		bodyModel[659].setRotationPoint(21.3F, -18F, -37.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2446
		bodyModel[660].setRotationPoint(26.6F, -18F, -37.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2447
		bodyModel[661].setRotationPoint(28.6F, -18F, -37.5F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2448
		bodyModel[662].setRotationPoint(32.6F, -18F, -37.5F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2449
		bodyModel[663].setRotationPoint(34.6F, -18F, -37.5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2450
		bodyModel[664].setRotationPoint(40F, -18F, -37.5F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2451
		bodyModel[665].setRotationPoint(42F, -18F, -37.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2452
		bodyModel[666].setRotationPoint(46F, -18F, -37.5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2453
		bodyModel[667].setRotationPoint(48F, -18F, -37.5F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2454
		bodyModel[668].setRotationPoint(0F, -7F, -37.5F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2455
		bodyModel[669].setRotationPoint(2F, -7F, -37.5F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2456
		bodyModel[670].setRotationPoint(6F, -7F, -37.5F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2457
		bodyModel[671].setRotationPoint(8F, -7F, -37.5F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2458
		bodyModel[672].setRotationPoint(15.3F, -7F, -37.5F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2459
		bodyModel[673].setRotationPoint(13.3F, -7F, -37.5F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2460
		bodyModel[674].setRotationPoint(19.3F, -7F, -37.5F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2461
		bodyModel[675].setRotationPoint(21.3F, -7F, -37.5F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2462
		bodyModel[676].setRotationPoint(26.6F, -7F, -37.5F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2463
		bodyModel[677].setRotationPoint(28.6F, -7F, -37.5F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2464
		bodyModel[678].setRotationPoint(32.6F, -7F, -37.5F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2465
		bodyModel[679].setRotationPoint(34.6F, -7F, -37.5F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2466
		bodyModel[680].setRotationPoint(40F, -7F, -37.5F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2467
		bodyModel[681].setRotationPoint(42F, -7F, -37.5F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2468
		bodyModel[682].setRotationPoint(46F, -7F, -37.5F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2469
		bodyModel[683].setRotationPoint(48F, -7F, -37.5F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2470
		bodyModel[684].setRotationPoint(0F, -7F, 36.5F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2471
		bodyModel[685].setRotationPoint(2F, -7F, 36.5F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2472
		bodyModel[686].setRotationPoint(6F, -7F, 36.5F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2473
		bodyModel[687].setRotationPoint(8F, -7F, 36.5F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2474
		bodyModel[688].setRotationPoint(13.3F, -7F, 36.5F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2475
		bodyModel[689].setRotationPoint(15.3F, -7F, 36.5F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2476
		bodyModel[690].setRotationPoint(19.3F, -7F, 36.5F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2477
		bodyModel[691].setRotationPoint(21.3F, -7F, 36.5F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2478
		bodyModel[692].setRotationPoint(26.6F, -7F, 36.5F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2479
		bodyModel[693].setRotationPoint(28.6F, -7F, 36.5F);

		bodyModel[694].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2480
		bodyModel[694].setRotationPoint(32.6F, -7F, 36.5F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2481
		bodyModel[695].setRotationPoint(34.6F, -7F, 36.5F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2482
		bodyModel[696].setRotationPoint(40F, -7F, 36.5F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2483
		bodyModel[697].setRotationPoint(42F, -7F, 36.5F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2484
		bodyModel[698].setRotationPoint(46F, -7F, 36.5F);

		bodyModel[699].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2485
		bodyModel[699].setRotationPoint(48F, -7F, 36.5F);

		bodyModel[700].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2486
		bodyModel[700].setRotationPoint(0F, -12.5F, 36.5F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2487
		bodyModel[701].setRotationPoint(2F, -12.5F, 36.5F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2488
		bodyModel[702].setRotationPoint(6F, -12.5F, 36.5F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2489
		bodyModel[703].setRotationPoint(8F, -12.5F, 36.5F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2490
		bodyModel[704].setRotationPoint(13.3F, -12.5F, 36.5F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2491
		bodyModel[705].setRotationPoint(15.3F, -12.5F, 36.5F);

		bodyModel[706].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2492
		bodyModel[706].setRotationPoint(19.3F, -12.5F, 36.5F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2493
		bodyModel[707].setRotationPoint(21.3F, -12.5F, 36.5F);

		bodyModel[708].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2494
		bodyModel[708].setRotationPoint(26.6F, -12.5F, 36.5F);

		bodyModel[709].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2495
		bodyModel[709].setRotationPoint(28.6F, -12.5F, 36.5F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2496
		bodyModel[710].setRotationPoint(32.6F, -12.5F, 36.5F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2497
		bodyModel[711].setRotationPoint(34.6F, -12.5F, 36.5F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2498
		bodyModel[712].setRotationPoint(40F, -12.5F, 36.5F);

		bodyModel[713].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2499
		bodyModel[713].setRotationPoint(42F, -12.5F, 36.5F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2500
		bodyModel[714].setRotationPoint(46F, -12.5F, 36.5F);

		bodyModel[715].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2501
		bodyModel[715].setRotationPoint(48F, -12.5F, 36.5F);

		bodyModel[716].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2502
		bodyModel[716].setRotationPoint(0F, -12.5F, -37.5F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2503
		bodyModel[717].setRotationPoint(2F, -12.5F, -37.5F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2504
		bodyModel[718].setRotationPoint(6F, -12.5F, -37.5F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2505
		bodyModel[719].setRotationPoint(8F, -12.5F, -37.5F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2506
		bodyModel[720].setRotationPoint(13.3F, -12.5F, -37.5F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2507
		bodyModel[721].setRotationPoint(15.3F, -12.5F, -37.5F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2508
		bodyModel[722].setRotationPoint(19.3F, -12.5F, -37.5F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2509
		bodyModel[723].setRotationPoint(21.3F, -12.5F, -37.5F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2510
		bodyModel[724].setRotationPoint(26.6F, -12.5F, -37.5F);

		bodyModel[725].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2511
		bodyModel[725].setRotationPoint(28.6F, -12.5F, -37.5F);

		bodyModel[726].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2512
		bodyModel[726].setRotationPoint(32.6F, -12.5F, -37.5F);

		bodyModel[727].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2513
		bodyModel[727].setRotationPoint(34.6F, -12.5F, -37.5F);

		bodyModel[728].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2514
		bodyModel[728].setRotationPoint(40F, -12.5F, -37.5F);

		bodyModel[729].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2515
		bodyModel[729].setRotationPoint(42F, -12.5F, -37.5F);

		bodyModel[730].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2516
		bodyModel[730].setRotationPoint(46F, -12.5F, -37.5F);

		bodyModel[731].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2517
		bodyModel[731].setRotationPoint(48F, -12.5F, -37.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 1690, textureX, textureY); // Box 315
		turretModel[1] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 316
		turretModel[2] = new ModelRendererTurbo(this, 0, 1747, textureX, textureY); // Box 317
		turretModel[3] = new ModelRendererTurbo(this, 0, 1773, textureX, textureY); // Box 318
		turretModel[4] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Box 319
		turretModel[5] = new ModelRendererTurbo(this, 0, 1855, textureX, textureY); // Box 321
		turretModel[6] = new ModelRendererTurbo(this, 0, 1883, textureX, textureY); // Box 322
		turretModel[7] = new ModelRendererTurbo(this, 0, 1914, textureX, textureY); // Box 323
		turretModel[8] = new ModelRendererTurbo(this, 0, 1944, textureX, textureY); // Box 324
		turretModel[9] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 325
		turretModel[10] = new ModelRendererTurbo(this, 0, 2007, textureX, textureY); // Box 326
		turretModel[11] = new ModelRendererTurbo(this, 0, 2034, textureX, textureY); // Box 327
		turretModel[12] = new ModelRendererTurbo(this, 0, 2067, textureX, textureY); // Box 328
		turretModel[13] = new ModelRendererTurbo(this, 0, 2094, textureX, textureY); // Box 329
		turretModel[14] = new ModelRendererTurbo(this, 0, 2129, textureX, textureY); // Box 330
		turretModel[15] = new ModelRendererTurbo(this, 0, 2157, textureX, textureY); // Box 331
		turretModel[16] = new ModelRendererTurbo(this, 0, 2192, textureX, textureY); // Box 332
		turretModel[17] = new ModelRendererTurbo(this, 0, 2220, textureX, textureY); // Box 333
		turretModel[18] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Box 334
		turretModel[19] = new ModelRendererTurbo(this, 0, 2274, textureX, textureY); // Box 335
		turretModel[20] = new ModelRendererTurbo(this, 0, 2297, textureX, textureY); // Box 336
		turretModel[21] = new ModelRendererTurbo(this, 0, 2319, textureX, textureY); // Box 337
		turretModel[22] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Box 338
		turretModel[23] = new ModelRendererTurbo(this, 0, 2358, textureX, textureY); // Box 339
		turretModel[24] = new ModelRendererTurbo(this, 0, 2374, textureX, textureY); // Box 340
		turretModel[25] = new ModelRendererTurbo(this, 0, 2389, textureX, textureY); // Box 341
		turretModel[26] = new ModelRendererTurbo(this, 0, 2413, textureX, textureY); // Box 342
		turretModel[27] = new ModelRendererTurbo(this, 0, 2440, textureX, textureY); // Box 343
		turretModel[28] = new ModelRendererTurbo(this, 0, 2457, textureX, textureY); // Box 344
		turretModel[29] = new ModelRendererTurbo(this, 0, 2494, textureX, textureY); // Box 345
		turretModel[30] = new ModelRendererTurbo(this, 0, 2531, textureX, textureY); // Box 346
		turretModel[31] = new ModelRendererTurbo(this, 0, 2564, textureX, textureY); // Box 347
		turretModel[32] = new ModelRendererTurbo(this, 0, 2599, textureX, textureY); // Box 348
		turretModel[33] = new ModelRendererTurbo(this, 0, 2635, textureX, textureY); // Box 349
		turretModel[34] = new ModelRendererTurbo(this, 0, 2672, textureX, textureY); // Box 350
		turretModel[35] = new ModelRendererTurbo(this, 0, 2672, textureX, textureY); // Box 351
		turretModel[36] = new ModelRendererTurbo(this, 0, 2708, textureX, textureY); // Box 352
		turretModel[37] = new ModelRendererTurbo(this, 0, 2732, textureX, textureY); // Box 353
		turretModel[38] = new ModelRendererTurbo(this, 0, 2757, textureX, textureY); // Box 354
		turretModel[39] = new ModelRendererTurbo(this, 0, 2766, textureX, textureY); // Box 355
		turretModel[40] = new ModelRendererTurbo(this, 0, 2773, textureX, textureY); // Box 356
		turretModel[41] = new ModelRendererTurbo(this, 0, 2766, textureX, textureY); // Box 357
		turretModel[42] = new ModelRendererTurbo(this, 0, 2778, textureX, textureY); // Box 358
		turretModel[43] = new ModelRendererTurbo(this, 0, 2783, textureX, textureY); // Box 359
		turretModel[44] = new ModelRendererTurbo(this, 0, 2792, textureX, textureY); // Box 360
		turretModel[45] = new ModelRendererTurbo(this, 0, 2801, textureX, textureY); // Box 361
		turretModel[46] = new ModelRendererTurbo(this, 0, 2809, textureX, textureY); // Box 362
		turretModel[47] = new ModelRendererTurbo(this, 0, 2809, textureX, textureY); // Box 363
		turretModel[48] = new ModelRendererTurbo(this, 0, 2815, textureX, textureY); // Box 364
		turretModel[49] = new ModelRendererTurbo(this, 0, 2824, textureX, textureY); // Box 365
		turretModel[50] = new ModelRendererTurbo(this, 0, 2824, textureX, textureY); // Box 366
		turretModel[51] = new ModelRendererTurbo(this, 0, 2830, textureX, textureY); // Box 367
		turretModel[52] = new ModelRendererTurbo(this, 0, 2835, textureX, textureY); // Box 368
		turretModel[53] = new ModelRendererTurbo(this, 0, 2838, textureX, textureY); // Box 369
		turretModel[54] = new ModelRendererTurbo(this, 0, 2835, textureX, textureY); // Box 370
		turretModel[55] = new ModelRendererTurbo(this, 0, 2848, textureX, textureY); // Box 371
		turretModel[56] = new ModelRendererTurbo(this, 0, 2856, textureX, textureY); // Box 372
		turretModel[57] = new ModelRendererTurbo(this, 0, 2864, textureX, textureY); // Box 373
		turretModel[58] = new ModelRendererTurbo(this, 0, 2872, textureX, textureY); // Box 374
		turretModel[59] = new ModelRendererTurbo(this, 0, 2884, textureX, textureY); // Box 375
		turretModel[60] = new ModelRendererTurbo(this, 0, 2884, textureX, textureY); // Box 376
		turretModel[61] = new ModelRendererTurbo(this, 0, 2872, textureX, textureY); // Box 377
		turretModel[62] = new ModelRendererTurbo(this, 0, 2864, textureX, textureY); // Box 378
		turretModel[63] = new ModelRendererTurbo(this, 0, 2856, textureX, textureY); // Box 379
		turretModel[64] = new ModelRendererTurbo(this, 0, 2887, textureX, textureY); // Box 381
		turretModel[65] = new ModelRendererTurbo(this, 0, 2890, textureX, textureY); // Box 382
		turretModel[66] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 383
		turretModel[67] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 384
		turretModel[68] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Box 385
		turretModel[69] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Box 386
		turretModel[70] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Box 387
		turretModel[71] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Box 388
		turretModel[72] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Box 389
		turretModel[73] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Box 390
		turretModel[74] = new ModelRendererTurbo(this, 0, 2923, textureX, textureY); // Box 391
		turretModel[75] = new ModelRendererTurbo(this, 0, 2966, textureX, textureY); // Box 392
		turretModel[76] = new ModelRendererTurbo(this, 0, 3001, textureX, textureY); // Box 393
		turretModel[77] = new ModelRendererTurbo(this, 0, 3037, textureX, textureY); // Box 394
		turretModel[78] = new ModelRendererTurbo(this, 0, 3079, textureX, textureY); // Box 395
		turretModel[79] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Box 396
		turretModel[80] = new ModelRendererTurbo(this, 0, 3151, textureX, textureY); // Box 397
		turretModel[81] = new ModelRendererTurbo(this, 0, 3151, textureX, textureY); // Box 1932
		turretModel[82] = new ModelRendererTurbo(this, 0, 3151, textureX, textureY); // Box 1933
		turretModel[83] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 1960
		turretModel[84] = new ModelRendererTurbo(this, 400, 25, textureX, textureY); // Box 1961
		turretModel[85] = new ModelRendererTurbo(this, 400, 51, textureX, textureY); // Box 1962
		turretModel[86] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Box 1963
		turretModel[87] = new ModelRendererTurbo(this, 400, 88, textureX, textureY); // Box 1964
		turretModel[88] = new ModelRendererTurbo(this, 400, 88, textureX, textureY); // Box 1965
		turretModel[89] = new ModelRendererTurbo(this, 400, 88, textureX, textureY); // Box 1966
		turretModel[90] = new ModelRendererTurbo(this, 400, 88, textureX, textureY); // Box 1967
		turretModel[91] = new ModelRendererTurbo(this, 400, 88, textureX, textureY); // Box 1968
		turretModel[92] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1969
		turretModel[93] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1970
		turretModel[94] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1971
		turretModel[95] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1972
		turretModel[96] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1977
		turretModel[97] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1978
		turretModel[98] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1979
		turretModel[99] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1980
		turretModel[100] = new ModelRendererTurbo(this, 400, 96, textureX, textureY); // Box 1981
		turretModel[101] = new ModelRendererTurbo(this, 400, 119, textureX, textureY); // Box 1982
		turretModel[102] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1983
		turretModel[103] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1984
		turretModel[104] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1985
		turretModel[105] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1986
		turretModel[106] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1987
		turretModel[107] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1988
		turretModel[108] = new ModelRendererTurbo(this, 400, 141, textureX, textureY); // Box 1989
		turretModel[109] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1990
		turretModel[110] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1991
		turretModel[111] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 1992
		turretModel[112] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 1993
		turretModel[113] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2001
		turretModel[114] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2002
		turretModel[115] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2003
		turretModel[116] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2004
		turretModel[117] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2005
		turretModel[118] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2006
		turretModel[119] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2007
		turretModel[120] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2008
		turretModel[121] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2009
		turretModel[122] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2010
		turretModel[123] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2011
		turretModel[124] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2012
		turretModel[125] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2013
		turretModel[126] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2014
		turretModel[127] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2015
		turretModel[128] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2016
		turretModel[129] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2017
		turretModel[130] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2018
		turretModel[131] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2019
		turretModel[132] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2020
		turretModel[133] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2021
		turretModel[134] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2022
		turretModel[135] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2023
		turretModel[136] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2024
		turretModel[137] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2025
		turretModel[138] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2026
		turretModel[139] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2027
		turretModel[140] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2028
		turretModel[141] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2029
		turretModel[142] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2030
		turretModel[143] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2031
		turretModel[144] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2032
		turretModel[145] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2033
		turretModel[146] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2034
		turretModel[147] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2035
		turretModel[148] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2036
		turretModel[149] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2037
		turretModel[150] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2038
		turretModel[151] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2039
		turretModel[152] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2040
		turretModel[153] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2041
		turretModel[154] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2042
		turretModel[155] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2043
		turretModel[156] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2044
		turretModel[157] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2045
		turretModel[158] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2046
		turretModel[159] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2047
		turretModel[160] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2048
		turretModel[161] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2049
		turretModel[162] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2050
		turretModel[163] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2051
		turretModel[164] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2052
		turretModel[165] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2053
		turretModel[166] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2054
		turretModel[167] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2055
		turretModel[168] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2056
		turretModel[169] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2057
		turretModel[170] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2058
		turretModel[171] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2059
		turretModel[172] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2060
		turretModel[173] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2061
		turretModel[174] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2062
		turretModel[175] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2063
		turretModel[176] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2064
		turretModel[177] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2065
		turretModel[178] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2066
		turretModel[179] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2067
		turretModel[180] = new ModelRendererTurbo(this, 400, 168, textureX, textureY); // Box 2068
		turretModel[181] = new ModelRendererTurbo(this, 400, 179, textureX, textureY); // Box 2069
		turretModel[182] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2070
		turretModel[183] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2071
		turretModel[184] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2072
		turretModel[185] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2073
		turretModel[186] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2074
		turretModel[187] = new ModelRendererTurbo(this, 400, 194, textureX, textureY); // Box 2075
		turretModel[188] = new ModelRendererTurbo(this, 400, 222, textureX, textureY); // Box 2076
		turretModel[189] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2077
		turretModel[190] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2078
		turretModel[191] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2079
		turretModel[192] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2080
		turretModel[193] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2081
		turretModel[194] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2082
		turretModel[195] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2083
		turretModel[196] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2084
		turretModel[197] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2085
		turretModel[198] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2086
		turretModel[199] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2087
		turretModel[200] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2088
		turretModel[201] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2089
		turretModel[202] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2090
		turretModel[203] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2091
		turretModel[204] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2092
		turretModel[205] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2093
		turretModel[206] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2094
		turretModel[207] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2095
		turretModel[208] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2096
		turretModel[209] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2097
		turretModel[210] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2098
		turretModel[211] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2099
		turretModel[212] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2100
		turretModel[213] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2101
		turretModel[214] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2102
		turretModel[215] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2103
		turretModel[216] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2104
		turretModel[217] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2105
		turretModel[218] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2106
		turretModel[219] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2107
		turretModel[220] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2108
		turretModel[221] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2109
		turretModel[222] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2110
		turretModel[223] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2111
		turretModel[224] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2112
		turretModel[225] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2113
		turretModel[226] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2114
		turretModel[227] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2115
		turretModel[228] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2116
		turretModel[229] = new ModelRendererTurbo(this, 400, 249, textureX, textureY); // Box 2117
		turretModel[230] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2118
		turretModel[231] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2119
		turretModel[232] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2120
		turretModel[233] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2121
		turretModel[234] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2122
		turretModel[235] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2123
		turretModel[236] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2124
		turretModel[237] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2125
		turretModel[238] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2126
		turretModel[239] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2127
		turretModel[240] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2128
		turretModel[241] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2129
		turretModel[242] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2130
		turretModel[243] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2131
		turretModel[244] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2132
		turretModel[245] = new ModelRendererTurbo(this, 400, 91, textureX, textureY); // Box 2133
		turretModel[246] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2134
		turretModel[247] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2135
		turretModel[248] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2136
		turretModel[249] = new ModelRendererTurbo(this, 400, 165, textureX, textureY); // Box 2137
		turretModel[250] = new ModelRendererTurbo(this, 400, 168, textureX, textureY); // Box 2138
		turretModel[251] = new ModelRendererTurbo(this, 400, 179, textureX, textureY); // Box 2139
		turretModel[252] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2140
		turretModel[253] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2141
		turretModel[254] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2142
		turretModel[255] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2143
		turretModel[256] = new ModelRendererTurbo(this, 400, 189, textureX, textureY); // Box 2144
		turretModel[257] = new ModelRendererTurbo(this, 400, 275, textureX, textureY); // Box 2145
		turretModel[258] = new ModelRendererTurbo(this, 400, 275, textureX, textureY); // Box 2146
		turretModel[259] = new ModelRendererTurbo(this, 400, 286, textureX, textureY); // Box 2148
		turretModel[260] = new ModelRendererTurbo(this, 400, 286, textureX, textureY); // Box 2149
		turretModel[261] = new ModelRendererTurbo(this, 400, 297, textureX, textureY); // Box 2150
		turretModel[262] = new ModelRendererTurbo(this, 400, 297, textureX, textureY); // Box 2152
		turretModel[263] = new ModelRendererTurbo(this, 400, 313, textureX, textureY); // Box 2153
		turretModel[264] = new ModelRendererTurbo(this, 400, 338, textureX, textureY); // Box 2154
		turretModel[265] = new ModelRendererTurbo(this, 400, 371, textureX, textureY); // Box 2155
		turretModel[266] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 2156
		turretModel[267] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 2157
		turretModel[268] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 2158
		turretModel[269] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 2159
		turretModel[270] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 2160
		turretModel[271] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 2161
		turretModel[272] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 2162
		turretModel[273] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 2163
		turretModel[274] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 2164
		turretModel[275] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 2165
		turretModel[276] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Box 2166
		turretModel[277] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Box 2167

		turretModel[0].addShapeBox(0F, 0F, 0F, 31, 6, 22, 0F,0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		turretModel[0].setRotationPoint(-26F, -40F, -22F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 10, 6, 19, 0F,0F, 0F, -15F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 316
		turretModel[1].setRotationPoint(-36F, -40F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 8, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -15F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F); // Box 317
		turretModel[2].setRotationPoint(-36F, -40F, 0F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 28, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 318
		turretModel[3].setRotationPoint(-28F, -40F, 0F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 8, 7, 18, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 319
		turretModel[4].setRotationPoint(-36F, -34F, 0F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 10, 7, 19, 0F,0F, 3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		turretModel[5].setRotationPoint(-36F, -34F, -19F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 5, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		turretModel[6].setRotationPoint(0F, -40F, 0F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F,0F, 0F, -6F, 0F, -5F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		turretModel[7].setRotationPoint(5F, -40F, -22F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 14, 6, 24, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 324
		turretModel[8].setRotationPoint(5F, -40F, 0F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 31, 7, 22, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		turretModel[9].setRotationPoint(-26F, -34F, -22F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 28, 3, 22, 0F,0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		turretModel[10].setRotationPoint(-23F, -27F, -22F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 14, 10, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 327
		turretModel[11].setRotationPoint(5F, -34F, -22F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 328
		turretModel[12].setRotationPoint(5F, -24F, -22F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 14, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -6F, 0F, 0F, 0F); // Box 329
		turretModel[13].setRotationPoint(5F, -34F, 0F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 2F); // Box 330
		turretModel[14].setRotationPoint(5F, -24F, 0F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 5, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		turretModel[15].setRotationPoint(0F, -34F, 0F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 332
		turretModel[16].setRotationPoint(0F, -24F, 0F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 28, 3, 22, 0F,0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.709F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		turretModel[17].setRotationPoint(-23F, -24F, -22F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 28, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 334
		turretModel[18].setRotationPoint(-28F, -34F, 0F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 23, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F); // Box 335
		turretModel[19].setRotationPoint(-23F, -27F, 0F);

		turretModel[20].addShapeBox(-17F, 0F, 0F, 17, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		turretModel[20].setRotationPoint(15F, -34F, 19F);
		turretModel[20].rotateAngleY = 0.3429572F;

		turretModel[21].addShapeBox(-17F, 0F, 11F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F); // Box 337
		turretModel[21].setRotationPoint(15F, -34F, 19F);
		turretModel[21].rotateAngleY = 0.3429572F;

		turretModel[22].addShapeBox(0F, 0F, 0F, 18, 7, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 338
		turretModel[22].setRotationPoint(-28F, -34F, 18F);
		turretModel[22].rotateAngleY = 0.20943951F;

		turretModel[23].addShapeBox(0F, 0F, -1F, 39, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		turretModel[23].setRotationPoint(-26F, -34F, -19F);
		turretModel[23].rotateAngleY = -0.15376351F;

		turretModel[24].addShapeBox(0F, 0F, -8F, 39, 7, 7, 0F,-6F, -4F, 0F, -9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		turretModel[24].setRotationPoint(-26F, -34F, -19F);
		turretModel[24].rotateAngleY = -0.15376351F;

		turretModel[25].addShapeBox(0F, 0F, 0F, 23, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 3.0714F); // Box 341
		turretModel[25].setRotationPoint(-23F, -24F, 0F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F,0F, 0F, -9F, 0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		turretModel[26].setRotationPoint(-26F, -27F, -22F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F); // Box 343
		turretModel[27].setRotationPoint(-26F, -27F, 0F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 344
		turretModel[28].setRotationPoint(6F, -41F, -16F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 345
		turretModel[29].setRotationPoint(-2F, -41F, -16F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 29, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 346
		turretModel[30].setRotationPoint(-8F, -41F, -15F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 6, 5, 29, 0F,0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 347
		turretModel[31].setRotationPoint(-8F, -38F, -15F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 5, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 348
		turretModel[32].setRotationPoint(-13F, -41F, -18F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 30, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 349
		turretModel[33].setRotationPoint(-13F, -38F, -18F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 28, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 350
		turretModel[34].setRotationPoint(-21F, -41F, -18F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 8, 5, 28, 0F,0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 351
		turretModel[35].setRotationPoint(-21F, -38F, -18F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 5, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 352
		turretModel[36].setRotationPoint(-26F, -41F, -11F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 353
		turretModel[37].setRotationPoint(-28F, -41F, -9F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[38].setRotationPoint(-18F, -42F, -10F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		turretModel[39].setRotationPoint(-18F, -42F, -14F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		turretModel[40].setRotationPoint(-16F, -42F, -16F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 357
		turretModel[41].setRotationPoint(-18F, -42F, -4F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 358
		turretModel[42].setRotationPoint(-16F, -42F, 0F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		turretModel[43].setRotationPoint(-15F, -44F, -9F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		turretModel[44].setRotationPoint(-15F, -44F, -13F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 361
		turretModel[45].setRotationPoint(-15F, -44F, -5F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		turretModel[46].setRotationPoint(-3F, -45F, -10F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[47].setRotationPoint(-3F, -45F, -5F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		turretModel[48].setRotationPoint(-3F, -46F, -10F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[49].setRotationPoint(-12F, -45F, -13F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[50].setRotationPoint(-7F, -45F, -13F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[51].setRotationPoint(-12F, -45F, -14F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		turretModel[52].setRotationPoint(5F, -42F, -12F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		turretModel[53].setRotationPoint(5F, -43F, -12F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		turretModel[54].setRotationPoint(5F, -42F, -7F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		turretModel[55].setRotationPoint(7F, -41.5F, -4F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[56].setRotationPoint(3F, -41.5F, 4F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 373
		turretModel[57].setRotationPoint(1F, -41.5F, 4F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		turretModel[58].setRotationPoint(-3F, -41.5F, 2F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		turretModel[59].setRotationPoint(3F, -41.5F, 2F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		turretModel[60].setRotationPoint(3F, -41.5F, 10F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		turretModel[61].setRotationPoint(-8F, -41.5F, 2F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 378
		turretModel[62].setRotationPoint(-10F, -41.5F, 4F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[63].setRotationPoint(-11F, -41.5F, 4F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[64].setRotationPoint(-12F, -41.5F, 2F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[65].setRotationPoint(6F, -41.5F, 8F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		turretModel[66].setRotationPoint(-38F, -37F, -3F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		turretModel[67].setRotationPoint(-38F, -39F, -3F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		turretModel[68].setRotationPoint(-19F, -41.5F, 3F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 386
		turretModel[69].setRotationPoint(-20F, -41.5F, 3F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 387
		turretModel[70].setRotationPoint(-18F, -41.5F, 3F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[71].setRotationPoint(-21F, -41.5F, -8F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 389
		turretModel[72].setRotationPoint(-22F, -41.5F, -8F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 390
		turretModel[73].setRotationPoint(-20F, -41.5F, -8F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 4, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		turretModel[74].setRotationPoint(19F, -33F, -15F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		turretModel[75].setRotationPoint(19F, -35F, -15F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 393
		turretModel[76].setRotationPoint(19F, -24F, -15F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 4, 9, 32, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 394
		turretModel[77].setRotationPoint(23F, -33F, -15F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F); // Box 395
		turretModel[78].setRotationPoint(23F, -35F, -15F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -2F); // Box 396
		turretModel[79].setRotationPoint(23F, -24F, -15F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		turretModel[80].setRotationPoint(25F, -29.5F, -3F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1932
		turretModel[81].setRotationPoint(25F, -31.5F, -3F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1933
		turretModel[82].setRotationPoint(25F, -27.5F, -3F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 16, 7, 16, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1960
		turretModel[83].setRotationPoint(12F, -42F, -6F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 2, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1961
		turretModel[84].setRotationPoint(10F, -42F, -6F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1962
		turretModel[85].setRotationPoint(12F, -35F, -6F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1963
		turretModel[86].setRotationPoint(12F, -34F, -6F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1964
		turretModel[87].setRotationPoint(27F, -35F, -6F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1965
		turretModel[88].setRotationPoint(27F, -35F, -2F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1966
		turretModel[89].setRotationPoint(27F, -35F, 1.5F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1967
		turretModel[90].setRotationPoint(27F, -35F, 5F);

		turretModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1968
		turretModel[91].setRotationPoint(27F, -35F, 9F);

		turretModel[92].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1969
		turretModel[92].setRotationPoint(12F, -42F, -5.5F);
		turretModel[92].rotateAngleZ = -0.35876988F;

		turretModel[93].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1970
		turretModel[93].setRotationPoint(12F, -42F, -5.5F);
		turretModel[93].rotateAngleZ = -0.35876988F;

		turretModel[94].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1971
		turretModel[94].setRotationPoint(12F, -42F, -1.5F);
		turretModel[94].rotateAngleZ = -0.35876988F;

		turretModel[95].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1972
		turretModel[95].setRotationPoint(12F, -42F, -1.5F);
		turretModel[95].rotateAngleZ = -0.35876988F;

		turretModel[96].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1977
		turretModel[96].setRotationPoint(12F, -42F, 2.5F);
		turretModel[96].rotateAngleZ = -0.35876988F;

		turretModel[97].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1978
		turretModel[97].setRotationPoint(12F, -42F, 2.5F);
		turretModel[97].rotateAngleZ = -0.35876988F;

		turretModel[98].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1979
		turretModel[98].setRotationPoint(12F, -42F, 6.5F);
		turretModel[98].rotateAngleZ = -0.35876988F;

		turretModel[99].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1980
		turretModel[99].setRotationPoint(12F, -42F, 6.5F);
		turretModel[99].rotateAngleZ = -0.35876988F;

		turretModel[100].addShapeBox(0F, 0F, 0F, 16, 9, 12, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1981
		turretModel[100].setRotationPoint(12F, -40F, 10F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1982
		turretModel[101].setRotationPoint(10F, -40F, 10F);

		turretModel[102].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1983
		turretModel[102].setRotationPoint(12F, -40F, 18.5F);
		turretModel[102].rotateAngleZ = -0.35876988F;

		turretModel[103].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1984
		turretModel[103].setRotationPoint(12F, -40F, 18.5F);
		turretModel[103].rotateAngleZ = -0.35876988F;

		turretModel[104].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1985
		turretModel[104].setRotationPoint(12F, -40F, 14.5F);
		turretModel[104].rotateAngleZ = -0.35876988F;

		turretModel[105].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1986
		turretModel[105].setRotationPoint(12F, -40F, 10.5F);
		turretModel[105].rotateAngleZ = -0.35876988F;

		turretModel[106].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1987
		turretModel[106].setRotationPoint(12F, -40F, 10.5F);
		turretModel[106].rotateAngleZ = -0.35876988F;

		turretModel[107].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1988
		turretModel[107].setRotationPoint(12F, -40F, 14.5F);
		turretModel[107].rotateAngleZ = -0.35876988F;

		turretModel[108].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1989
		turretModel[108].setRotationPoint(28F, -34F, 10F);

		turretModel[109].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1990
		turretModel[109].setRotationPoint(28F, -34F, 10.5F);
		turretModel[109].rotateAngleZ = -0.71113091F;

		turretModel[110].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1991
		turretModel[110].setRotationPoint(28F, -34F, 14.5F);
		turretModel[110].rotateAngleZ = -0.71113091F;

		turretModel[111].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1992
		turretModel[111].setRotationPoint(28F, -34F, 18.5F);
		turretModel[111].rotateAngleZ = -0.71113091F;

		turretModel[112].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1993
		turretModel[112].setRotationPoint(12F, -42F, -5.5F);
		turretModel[112].rotateAngleZ = -0.35876988F;

		turretModel[113].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2001
		turretModel[113].setRotationPoint(12F, -42F, -3.5F);
		turretModel[113].rotateAngleZ = -0.35876988F;

		turretModel[114].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2002
		turretModel[114].setRotationPoint(12F, -42F, 0.5F);
		turretModel[114].rotateAngleZ = -0.35876988F;

		turretModel[115].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2003
		turretModel[115].setRotationPoint(12F, -42F, -1.5F);
		turretModel[115].rotateAngleZ = -0.35876988F;

		turretModel[116].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2004
		turretModel[116].setRotationPoint(12F, -42F, 4.5F);
		turretModel[116].rotateAngleZ = -0.35876988F;

		turretModel[117].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2005
		turretModel[117].setRotationPoint(12F, -42F, 2.5F);
		turretModel[117].rotateAngleZ = -0.35876988F;

		turretModel[118].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2006
		turretModel[118].setRotationPoint(12F, -42F, 8.5F);
		turretModel[118].rotateAngleZ = -0.35876988F;

		turretModel[119].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2007
		turretModel[119].setRotationPoint(12F, -42F, 6.5F);
		turretModel[119].rotateAngleZ = -0.35876988F;

		turretModel[120].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2008
		turretModel[120].setRotationPoint(12F, -42F, 8.5F);
		turretModel[120].rotateAngleZ = -0.35876988F;

		turretModel[121].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2009
		turretModel[121].setRotationPoint(12F, -42F, 6.5F);
		turretModel[121].rotateAngleZ = -0.35876988F;

		turretModel[122].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2010
		turretModel[122].setRotationPoint(12F, -42F, 4.5F);
		turretModel[122].rotateAngleZ = -0.35876988F;

		turretModel[123].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2011
		turretModel[123].setRotationPoint(12F, -42F, 2.5F);
		turretModel[123].rotateAngleZ = -0.35876988F;

		turretModel[124].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2012
		turretModel[124].setRotationPoint(12F, -42F, 0.5F);
		turretModel[124].rotateAngleZ = -0.35876988F;

		turretModel[125].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2013
		turretModel[125].setRotationPoint(12F, -42F, -1.5F);
		turretModel[125].rotateAngleZ = -0.35876988F;

		turretModel[126].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2014
		turretModel[126].setRotationPoint(12F, -42F, -3.5F);
		turretModel[126].rotateAngleZ = -0.35876988F;

		turretModel[127].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2015
		turretModel[127].setRotationPoint(12F, -42F, -5.5F);
		turretModel[127].rotateAngleZ = -0.35876988F;

		turretModel[128].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2016
		turretModel[128].setRotationPoint(12F, -42F, 8.5F);
		turretModel[128].rotateAngleZ = -0.35876988F;

		turretModel[129].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2017
		turretModel[129].setRotationPoint(12F, -42F, 6.5F);
		turretModel[129].rotateAngleZ = -0.35876988F;

		turretModel[130].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2018
		turretModel[130].setRotationPoint(12F, -42F, 4.5F);
		turretModel[130].rotateAngleZ = -0.35876988F;

		turretModel[131].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2019
		turretModel[131].setRotationPoint(12F, -42F, 2.5F);
		turretModel[131].rotateAngleZ = -0.35876988F;

		turretModel[132].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2020
		turretModel[132].setRotationPoint(12F, -42F, 0.5F);
		turretModel[132].rotateAngleZ = -0.35876988F;

		turretModel[133].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2021
		turretModel[133].setRotationPoint(12F, -42F, -1.5F);
		turretModel[133].rotateAngleZ = -0.35876988F;

		turretModel[134].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2022
		turretModel[134].setRotationPoint(12F, -42F, -3.5F);
		turretModel[134].rotateAngleZ = -0.35876988F;

		turretModel[135].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2023
		turretModel[135].setRotationPoint(12F, -42F, -5.5F);
		turretModel[135].rotateAngleZ = -0.35876988F;

		turretModel[136].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2024
		turretModel[136].setRotationPoint(12F, -42F, 8.5F);
		turretModel[136].rotateAngleZ = -0.35876988F;

		turretModel[137].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2025
		turretModel[137].setRotationPoint(12F, -42F, 6.5F);
		turretModel[137].rotateAngleZ = -0.35876988F;

		turretModel[138].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2026
		turretModel[138].setRotationPoint(12F, -42F, 4.5F);
		turretModel[138].rotateAngleZ = -0.35876988F;

		turretModel[139].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2027
		turretModel[139].setRotationPoint(12F, -42F, 2.5F);
		turretModel[139].rotateAngleZ = -0.35876988F;

		turretModel[140].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2028
		turretModel[140].setRotationPoint(12F, -42F, 0.5F);
		turretModel[140].rotateAngleZ = -0.35876988F;

		turretModel[141].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2029
		turretModel[141].setRotationPoint(12F, -42F, -1.5F);
		turretModel[141].rotateAngleZ = -0.35876988F;

		turretModel[142].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2030
		turretModel[142].setRotationPoint(12F, -42F, -3.5F);
		turretModel[142].rotateAngleZ = -0.35876988F;

		turretModel[143].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2031
		turretModel[143].setRotationPoint(12F, -42F, -5.5F);
		turretModel[143].rotateAngleZ = -0.35876988F;

		turretModel[144].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2032
		turretModel[144].setRotationPoint(12F, -40F, 20.5F);
		turretModel[144].rotateAngleZ = -0.35876988F;

		turretModel[145].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2033
		turretModel[145].setRotationPoint(12F, -40F, 18.5F);
		turretModel[145].rotateAngleZ = -0.35876988F;

		turretModel[146].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2034
		turretModel[146].setRotationPoint(12F, -40F, 16.5F);
		turretModel[146].rotateAngleZ = -0.35876988F;

		turretModel[147].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2035
		turretModel[147].setRotationPoint(12F, -40F, 14.5F);
		turretModel[147].rotateAngleZ = -0.35876988F;

		turretModel[148].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2036
		turretModel[148].setRotationPoint(12F, -40F, 12.5F);
		turretModel[148].rotateAngleZ = -0.35876988F;

		turretModel[149].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2037
		turretModel[149].setRotationPoint(12F, -40F, 10.5F);
		turretModel[149].rotateAngleZ = -0.35876988F;

		turretModel[150].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2038
		turretModel[150].setRotationPoint(12F, -40F, 18.5F);
		turretModel[150].rotateAngleZ = -0.35876988F;

		turretModel[151].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2039
		turretModel[151].setRotationPoint(12F, -40F, 20.5F);
		turretModel[151].rotateAngleZ = -0.35876988F;

		turretModel[152].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2040
		turretModel[152].setRotationPoint(12F, -40F, 16.5F);
		turretModel[152].rotateAngleZ = -0.35876988F;

		turretModel[153].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2041
		turretModel[153].setRotationPoint(12F, -40F, 14.5F);
		turretModel[153].rotateAngleZ = -0.35876988F;

		turretModel[154].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2042
		turretModel[154].setRotationPoint(12F, -40F, 12.5F);
		turretModel[154].rotateAngleZ = -0.35876988F;

		turretModel[155].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2043
		turretModel[155].setRotationPoint(12F, -40F, 10.5F);
		turretModel[155].rotateAngleZ = -0.35876988F;

		turretModel[156].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2044
		turretModel[156].setRotationPoint(12F, -40F, 10.5F);
		turretModel[156].rotateAngleZ = -0.35876988F;

		turretModel[157].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2045
		turretModel[157].setRotationPoint(12F, -40F, 12.5F);
		turretModel[157].rotateAngleZ = -0.35876988F;

		turretModel[158].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2046
		turretModel[158].setRotationPoint(12F, -40F, 12.5F);
		turretModel[158].rotateAngleZ = -0.35876988F;

		turretModel[159].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2047
		turretModel[159].setRotationPoint(12F, -40F, 10.5F);
		turretModel[159].rotateAngleZ = -0.35876988F;

		turretModel[160].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2048
		turretModel[160].setRotationPoint(12F, -40F, 14.5F);
		turretModel[160].rotateAngleZ = -0.35876988F;

		turretModel[161].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2049
		turretModel[161].setRotationPoint(12F, -40F, 16.5F);
		turretModel[161].rotateAngleZ = -0.35876988F;

		turretModel[162].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2050
		turretModel[162].setRotationPoint(12F, -40F, 18.5F);
		turretModel[162].rotateAngleZ = -0.35876988F;

		turretModel[163].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2051
		turretModel[163].setRotationPoint(12F, -40F, 20.5F);
		turretModel[163].rotateAngleZ = -0.35876988F;

		turretModel[164].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2052
		turretModel[164].setRotationPoint(12F, -40F, 20.5F);
		turretModel[164].rotateAngleZ = -0.35876988F;

		turretModel[165].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2053
		turretModel[165].setRotationPoint(12F, -40F, 18.5F);
		turretModel[165].rotateAngleZ = -0.35876988F;

		turretModel[166].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2054
		turretModel[166].setRotationPoint(12F, -40F, 16.5F);
		turretModel[166].rotateAngleZ = -0.35876988F;

		turretModel[167].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2055
		turretModel[167].setRotationPoint(12F, -40F, 14.5F);
		turretModel[167].rotateAngleZ = -0.35876988F;

		turretModel[168].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2056
		turretModel[168].setRotationPoint(28F, -34F, 20.5F);
		turretModel[168].rotateAngleZ = -0.71113091F;

		turretModel[169].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2057
		turretModel[169].setRotationPoint(28F, -34F, 18.5F);
		turretModel[169].rotateAngleZ = -0.71113091F;

		turretModel[170].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2058
		turretModel[170].setRotationPoint(28F, -34F, 16.5F);
		turretModel[170].rotateAngleZ = -0.71113091F;

		turretModel[171].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2059
		turretModel[171].setRotationPoint(28F, -34F, 14.5F);
		turretModel[171].rotateAngleZ = -0.71113091F;

		turretModel[172].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2060
		turretModel[172].setRotationPoint(28F, -34F, 12.5F);
		turretModel[172].rotateAngleZ = -0.71113091F;

		turretModel[173].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2061
		turretModel[173].setRotationPoint(28F, -34F, 10.5F);
		turretModel[173].rotateAngleZ = -0.71113091F;

		turretModel[174].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2062
		turretModel[174].setRotationPoint(28F, -34F, 20.5F);
		turretModel[174].rotateAngleZ = -0.71113091F;

		turretModel[175].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2063
		turretModel[175].setRotationPoint(28F, -34F, 18.5F);
		turretModel[175].rotateAngleZ = -0.71113091F;

		turretModel[176].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2064
		turretModel[176].setRotationPoint(28F, -34F, 16.5F);
		turretModel[176].rotateAngleZ = -0.71113091F;

		turretModel[177].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2065
		turretModel[177].setRotationPoint(28F, -34F, 14.5F);
		turretModel[177].rotateAngleZ = -0.71113091F;

		turretModel[178].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2066
		turretModel[178].setRotationPoint(28F, -34F, 12.5F);
		turretModel[178].rotateAngleZ = -0.71113091F;

		turretModel[179].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2067
		turretModel[179].setRotationPoint(28F, -34F, 10.5F);
		turretModel[179].rotateAngleZ = -0.71113091F;

		turretModel[180].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2068
		turretModel[180].setRotationPoint(15F, -36F, 22F);

		turretModel[181].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2069
		turretModel[181].setRotationPoint(25F, -33F, 22F);

		turretModel[182].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2070
		turretModel[182].setRotationPoint(15.5F, -35.5F, 22.5F);

		turretModel[183].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2071
		turretModel[183].setRotationPoint(15.5F, -32.5F, 22.5F);

		turretModel[184].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2072
		turretModel[184].setRotationPoint(15.5F, -29.5F, 22.5F);

		turretModel[185].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2073
		turretModel[185].setRotationPoint(25.5F, -29.5F, 22.5F);

		turretModel[186].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2074
		turretModel[186].setRotationPoint(25.5F, -32.5F, 22.5F);

		turretModel[187].addShapeBox(0F, 0F, 0F, 16, 9, 16, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 2075
		turretModel[187].setRotationPoint(12F, -40F, -22F);

		turretModel[188].addShapeBox(0F, 0F, 0F, 2, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2076
		turretModel[188].setRotationPoint(10F, -40F, -22F);

		turretModel[189].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2077
		turretModel[189].setRotationPoint(12F, -40F, -21.5F);
		turretModel[189].rotateAngleZ = -0.35876988F;

		turretModel[190].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2078
		turretModel[190].setRotationPoint(12F, -40F, -13.5F);
		turretModel[190].rotateAngleZ = -0.35876988F;

		turretModel[191].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2079
		turretModel[191].setRotationPoint(12F, -40F, -9.5F);
		turretModel[191].rotateAngleZ = -0.35876988F;

		turretModel[192].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2080
		turretModel[192].setRotationPoint(12F, -40F, -9.5F);
		turretModel[192].rotateAngleZ = -0.35876988F;

		turretModel[193].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2081
		turretModel[193].setRotationPoint(12F, -40F, -17.5F);
		turretModel[193].rotateAngleZ = -0.35876988F;

		turretModel[194].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2082
		turretModel[194].setRotationPoint(12F, -40F, -21.5F);
		turretModel[194].rotateAngleZ = -0.35876988F;

		turretModel[195].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2083
		turretModel[195].setRotationPoint(12F, -40F, -21.5F);
		turretModel[195].rotateAngleZ = -0.35876988F;

		turretModel[196].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2084
		turretModel[196].setRotationPoint(12F, -40F, -19.5F);
		turretModel[196].rotateAngleZ = -0.35876988F;

		turretModel[197].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2085
		turretModel[197].setRotationPoint(12F, -40F, -17.5F);
		turretModel[197].rotateAngleZ = -0.35876988F;

		turretModel[198].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2086
		turretModel[198].setRotationPoint(12F, -40F, -15.5F);
		turretModel[198].rotateAngleZ = -0.35876988F;

		turretModel[199].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2087
		turretModel[199].setRotationPoint(12F, -40F, -13.5F);
		turretModel[199].rotateAngleZ = -0.35876988F;

		turretModel[200].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2088
		turretModel[200].setRotationPoint(12F, -40F, -13.5F);
		turretModel[200].rotateAngleZ = -0.35876988F;

		turretModel[201].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2089
		turretModel[201].setRotationPoint(12F, -40F, -11.5F);
		turretModel[201].rotateAngleZ = -0.35876988F;

		turretModel[202].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2090
		turretModel[202].setRotationPoint(12F, -40F, -9.5F);
		turretModel[202].rotateAngleZ = -0.35876988F;

		turretModel[203].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2091
		turretModel[203].setRotationPoint(12F, -40F, -7.5F);
		turretModel[203].rotateAngleZ = -0.35876988F;

		turretModel[204].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2092
		turretModel[204].setRotationPoint(12F, -40F, -7.5F);
		turretModel[204].rotateAngleZ = -0.35876988F;

		turretModel[205].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2093
		turretModel[205].setRotationPoint(12F, -40F, -9.5F);
		turretModel[205].rotateAngleZ = -0.35876988F;

		turretModel[206].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2094
		turretModel[206].setRotationPoint(12F, -40F, -11.5F);
		turretModel[206].rotateAngleZ = -0.35876988F;

		turretModel[207].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2095
		turretModel[207].setRotationPoint(12F, -40F, -13.5F);
		turretModel[207].rotateAngleZ = -0.35876988F;

		turretModel[208].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2096
		turretModel[208].setRotationPoint(12F, -40F, -15.5F);
		turretModel[208].rotateAngleZ = -0.35876988F;

		turretModel[209].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2097
		turretModel[209].setRotationPoint(12F, -40F, -17.5F);
		turretModel[209].rotateAngleZ = -0.35876988F;

		turretModel[210].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2098
		turretModel[210].setRotationPoint(12F, -40F, -19.5F);
		turretModel[210].rotateAngleZ = -0.35876988F;

		turretModel[211].addShapeBox(9F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2099
		turretModel[211].setRotationPoint(12F, -40F, -21.5F);
		turretModel[211].rotateAngleZ = -0.35876988F;

		turretModel[212].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2100
		turretModel[212].setRotationPoint(12F, -40F, -21.5F);
		turretModel[212].rotateAngleZ = -0.35876988F;

		turretModel[213].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2101
		turretModel[213].setRotationPoint(12F, -40F, -19.5F);
		turretModel[213].rotateAngleZ = -0.35876988F;

		turretModel[214].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2102
		turretModel[214].setRotationPoint(12F, -40F, -17.5F);
		turretModel[214].rotateAngleZ = -0.35876988F;

		turretModel[215].addShapeBox(9F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2103
		turretModel[215].setRotationPoint(12F, -40F, -17.5F);
		turretModel[215].rotateAngleZ = -0.35876988F;

		turretModel[216].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2104
		turretModel[216].setRotationPoint(12F, -40F, -15.5F);
		turretModel[216].rotateAngleZ = -0.35876988F;

		turretModel[217].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2105
		turretModel[217].setRotationPoint(12F, -40F, -13.5F);
		turretModel[217].rotateAngleZ = -0.35876988F;

		turretModel[218].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2106
		turretModel[218].setRotationPoint(12F, -40F, -11.5F);
		turretModel[218].rotateAngleZ = -0.35876988F;

		turretModel[219].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2107
		turretModel[219].setRotationPoint(12F, -40F, -9.5F);
		turretModel[219].rotateAngleZ = -0.35876988F;

		turretModel[220].addShapeBox(16F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2108
		turretModel[220].setRotationPoint(12F, -40F, -7.5F);
		turretModel[220].rotateAngleZ = -0.35876988F;

		turretModel[221].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2109
		turretModel[221].setRotationPoint(12F, -40F, -7.5F);
		turretModel[221].rotateAngleZ = -0.35876988F;

		turretModel[222].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2110
		turretModel[222].setRotationPoint(12F, -40F, -9.5F);
		turretModel[222].rotateAngleZ = -0.35876988F;

		turretModel[223].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2111
		turretModel[223].setRotationPoint(12F, -40F, -11.5F);
		turretModel[223].rotateAngleZ = -0.35876988F;

		turretModel[224].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2112
		turretModel[224].setRotationPoint(12F, -40F, -13.5F);
		turretModel[224].rotateAngleZ = -0.35876988F;

		turretModel[225].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2113
		turretModel[225].setRotationPoint(12F, -40F, -15.5F);
		turretModel[225].rotateAngleZ = -0.35876988F;

		turretModel[226].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2114
		turretModel[226].setRotationPoint(12F, -40F, -17.5F);
		turretModel[226].rotateAngleZ = -0.35876988F;

		turretModel[227].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2115
		turretModel[227].setRotationPoint(12F, -40F, -19.5F);
		turretModel[227].rotateAngleZ = -0.35876988F;

		turretModel[228].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2116
		turretModel[228].setRotationPoint(12F, -40F, -21.5F);
		turretModel[228].rotateAngleZ = -0.35876988F;

		turretModel[229].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2117
		turretModel[229].setRotationPoint(28F, -34F, -22F);

		turretModel[230].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2118
		turretModel[230].setRotationPoint(28F, -34F, -13.5F);
		turretModel[230].rotateAngleZ = -0.71113091F;

		turretModel[231].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2119
		turretModel[231].setRotationPoint(28F, -34F, -21.5F);
		turretModel[231].rotateAngleZ = -0.71113091F;

		turretModel[232].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2120
		turretModel[232].setRotationPoint(28F, -34F, -21.5F);
		turretModel[232].rotateAngleZ = -0.71113091F;

		turretModel[233].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2121
		turretModel[233].setRotationPoint(28F, -34F, -19.5F);
		turretModel[233].rotateAngleZ = -0.71113091F;

		turretModel[234].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2122
		turretModel[234].setRotationPoint(28F, -34F, -19.5F);
		turretModel[234].rotateAngleZ = -0.71113091F;

		turretModel[235].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2123
		turretModel[235].setRotationPoint(28F, -34F, -21.5F);
		turretModel[235].rotateAngleZ = -0.71113091F;

		turretModel[236].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2124
		turretModel[236].setRotationPoint(28F, -34F, -17.5F);
		turretModel[236].rotateAngleZ = -0.71113091F;

		turretModel[237].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2125
		turretModel[237].setRotationPoint(28F, -34F, -15.5F);
		turretModel[237].rotateAngleZ = -0.71113091F;

		turretModel[238].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2126
		turretModel[238].setRotationPoint(28F, -34F, -17.5F);
		turretModel[238].rotateAngleZ = -0.71113091F;

		turretModel[239].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2127
		turretModel[239].setRotationPoint(28F, -34F, -13.5F);
		turretModel[239].rotateAngleZ = -0.71113091F;

		turretModel[240].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2128
		turretModel[240].setRotationPoint(28F, -34F, -11.5F);
		turretModel[240].rotateAngleZ = -0.71113091F;

		turretModel[241].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2129
		turretModel[241].setRotationPoint(28F, -34F, -11.5F);
		turretModel[241].rotateAngleZ = -0.71113091F;

		turretModel[242].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2130
		turretModel[242].setRotationPoint(28F, -34F, -13.5F);
		turretModel[242].rotateAngleZ = -0.71113091F;

		turretModel[243].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2131
		turretModel[243].setRotationPoint(28F, -34F, -15.5F);
		turretModel[243].rotateAngleZ = -0.71113091F;

		turretModel[244].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2132
		turretModel[244].setRotationPoint(28F, -34F, -17.5F);
		turretModel[244].rotateAngleZ = -0.71113091F;

		turretModel[245].addShapeBox(0.5F, -0.5F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2133
		turretModel[245].setRotationPoint(28F, -34F, -9.5F);
		turretModel[245].rotateAngleZ = -0.71113091F;

		turretModel[246].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2134
		turretModel[246].setRotationPoint(28F, -34F, -7.5F);
		turretModel[246].rotateAngleZ = -0.71113091F;

		turretModel[247].addShapeBox(0.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2135
		turretModel[247].setRotationPoint(28F, -34F, -9.5F);
		turretModel[247].rotateAngleZ = -0.71113091F;

		turretModel[248].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2136
		turretModel[248].setRotationPoint(28F, -34F, -9.5F);
		turretModel[248].rotateAngleZ = -0.71113091F;

		turretModel[249].addShapeBox(7.5F, -1.5F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 2137
		turretModel[249].setRotationPoint(28F, -34F, -7.5F);
		turretModel[249].rotateAngleZ = -0.71113091F;

		turretModel[250].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2138
		turretModel[250].setRotationPoint(15F, -36F, -23F);

		turretModel[251].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2139
		turretModel[251].setRotationPoint(25F, -33F, -23F);

		turretModel[252].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2140
		turretModel[252].setRotationPoint(15.5F, -35.5F, -23.5F);

		turretModel[253].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2141
		turretModel[253].setRotationPoint(15.5F, -32.5F, -23.5F);

		turretModel[254].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2142
		turretModel[254].setRotationPoint(15.5F, -29.5F, -23.5F);

		turretModel[255].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2143
		turretModel[255].setRotationPoint(25.5F, -29.5F, -23.5F);

		turretModel[256].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2144
		turretModel[256].setRotationPoint(25.5F, -32.5F, -23.5F);

		turretModel[257].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F,0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 2145
		turretModel[257].setRotationPoint(-40F, -37F, -8F);

		turretModel[258].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F); // Box 2146
		turretModel[258].setRotationPoint(-40F, -37F, 6F);

		turretModel[259].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 2148
		turretModel[259].setRotationPoint(-44F, -37F, 15F);

		turretModel[260].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 2149
		turretModel[260].setRotationPoint(-44F, -37F, -17F);

		turretModel[261].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2150
		turretModel[261].setRotationPoint(-45F, -37F, -11F);

		turretModel[262].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2152
		turretModel[262].setRotationPoint(-45F, -37F, 1F);

		turretModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2153
		turretModel[263].setRotationPoint(-45F, -32F, -11F);

		turretModel[264].addShapeBox(0F, 0F, 0F, 4, 1, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 2154
		turretModel[264].setRotationPoint(-44F, -31F, -15F);

		turretModel[265].addShapeBox(0F, 0F, 0F, 6, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 2155
		turretModel[265].setRotationPoint(-40F, -31F, -15F);

		turretModel[266].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2156
		turretModel[266].setRotationPoint(-40F, -37F, 5F);

		turretModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2157
		turretModel[267].setRotationPoint(-40F, -39F, 5F);

		turretModel[268].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2158
		turretModel[268].setRotationPoint(-43F, -37F, 5F);

		turretModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2159
		turretModel[269].setRotationPoint(-43F, -39F, 5F);

		turretModel[270].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2160
		turretModel[270].setRotationPoint(-40F, -37F, -11F);

		turretModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2161
		turretModel[271].setRotationPoint(-40F, -39F, -11F);

		turretModel[272].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2162
		turretModel[272].setRotationPoint(-43F, -37F, -11F);

		turretModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2163
		turretModel[273].setRotationPoint(-43F, -39F, -11F);

		turretModel[274].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2164
		turretModel[274].setRotationPoint(-44F, -37F, -3F);

		turretModel[275].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2165
		turretModel[275].setRotationPoint(-44F, -39F, -3F);

		turretModel[276].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2166
		turretModel[276].setRotationPoint(-41F, -37F, -3F);

		turretModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2167
		turretModel[277].setRotationPoint(-41F, -39F, -3F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 3192, textureX, textureY); // Box 409
		barrelModel[1] = new ModelRendererTurbo(this, 0, 3436, textureX, textureY); // Box 1934
		barrelModel[2] = new ModelRendererTurbo(this, 0, 3436, textureX, textureY); // Box 1935
		barrelModel[3] = new ModelRendererTurbo(this, 0, 3436, textureX, textureY); // Box 1936
		barrelModel[4] = new ModelRendererTurbo(this, 0, 3459, textureX, textureY); // Box 1937
		barrelModel[5] = new ModelRendererTurbo(this, 0, 3459, textureX, textureY); // Box 1938
		barrelModel[6] = new ModelRendererTurbo(this, 0, 3459, textureX, textureY); // Box 1940
		barrelModel[7] = new ModelRendererTurbo(this, 0, 3447, textureX, textureY); // Box 1941
		barrelModel[8] = new ModelRendererTurbo(this, 0, 3447, textureX, textureY); // Box 1942
		barrelModel[9] = new ModelRendererTurbo(this, 0, 3447, textureX, textureY); // Box 1943
		barrelModel[10] = new ModelRendererTurbo(this, 0, 3447, textureX, textureY); // Box 1944
		barrelModel[11] = new ModelRendererTurbo(this, 0, 3447, textureX, textureY); // Box 1945
		barrelModel[12] = new ModelRendererTurbo(this, 0, 3447, textureX, textureY); // Box 1946
		barrelModel[13] = new ModelRendererTurbo(this, 0, 3471, textureX, textureY); // Box 1947
		barrelModel[14] = new ModelRendererTurbo(this, 0, 3471, textureX, textureY); // Box 1948
		barrelModel[15] = new ModelRendererTurbo(this, 0, 3471, textureX, textureY); // Box 1949
		barrelModel[16] = new ModelRendererTurbo(this, 0, 3490, textureX, textureY); // Box 1950
		barrelModel[17] = new ModelRendererTurbo(this, 0, 3494, textureX, textureY); // Box 1953
		barrelModel[18] = new ModelRendererTurbo(this, 0, 3481, textureX, textureY); // Box 1954
		barrelModel[19] = new ModelRendererTurbo(this, 0, 3485, textureX, textureY); // Box 1955
		barrelModel[20] = new ModelRendererTurbo(this, 0, 3485, textureX, textureY); // Box 1956
		barrelModel[21] = new ModelRendererTurbo(this, 0, 3481, textureX, textureY); // Box 1957
		barrelModel[22] = new ModelRendererTurbo(this, 0, 3481, textureX, textureY); // Box 1958
		barrelModel[23] = new ModelRendererTurbo(this, 0, 3485, textureX, textureY); // Box 1959

		barrelModel[0].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		barrelModel[0].setRotationPoint(26F, -30.5F, 6.5F);

		barrelModel[1].addShapeBox(0F, -1F, 0F, 7, 2, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 1934
		barrelModel[1].setRotationPoint(31F, -28.5F, -2.5F);

		barrelModel[2].addShapeBox(0F, -3F, 0F, 7, 2, 5, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 1935
		barrelModel[2].setRotationPoint(31F, -28.5F, -2.5F);

		barrelModel[3].addShapeBox(0F, 1F, 0F, 7, 2, 5, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 1936
		barrelModel[3].setRotationPoint(31F, -28.5F, -2.5F);

		barrelModel[4].addShapeBox(7F, -3F, 0F, 11, 2, 7, 0F,0F, 0.15F, -2.3F, 0F, 0.15F, -2.3F, 0F, 0.15F, -2.3F, 0F, 0.15F, -2.3F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 1937
		barrelModel[4].setRotationPoint(31F, -28.5F, -3.5F);

		barrelModel[5].addShapeBox(7F, -1F, 0F, 11, 2, 7, 0F,0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 1938
		barrelModel[5].setRotationPoint(31F, -28.5F, -3.5F);

		barrelModel[6].addShapeBox(7F, 1F, 0F, 11, 2, 7, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, -2.3F, 0F, 0.15F, -2.3F, 0F, 0.15F, -2.3F, 0F, 0.15F, -2.3F); // Box 1940
		barrelModel[6].setRotationPoint(31F, -28.5F, -3.5F);

		barrelModel[7].addShapeBox(6F, -1F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1941
		barrelModel[7].setRotationPoint(31F, -28.5F, -3F);

		barrelModel[8].addShapeBox(6F, 1F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1942
		barrelModel[8].setRotationPoint(31F, -28.5F, -3F);

		barrelModel[9].addShapeBox(6F, -3F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1943
		barrelModel[9].setRotationPoint(31F, -28.5F, -3F);

		barrelModel[10].addShapeBox(18F, 1F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1944
		barrelModel[10].setRotationPoint(31F, -28.5F, -3F);

		barrelModel[11].addShapeBox(18F, -1F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1945
		barrelModel[11].setRotationPoint(31F, -28.5F, -3F);

		barrelModel[12].addShapeBox(18F, -3F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1946
		barrelModel[12].setRotationPoint(31F, -28.5F, -3F);

		barrelModel[13].addShapeBox(19F, -3F, 0F, 7, 2, 5, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 1947
		barrelModel[13].setRotationPoint(31F, -28.5F, -2.5F);

		barrelModel[14].addShapeBox(19F, -1F, 0F, 7, 2, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 1948
		barrelModel[14].setRotationPoint(31F, -28.5F, -2.5F);

		barrelModel[15].addShapeBox(19F, 1F, 0F, 7, 2, 5, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 1949
		barrelModel[15].setRotationPoint(31F, -28.5F, -2.5F);

		barrelModel[16].addShapeBox(26F, -3F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1950
		barrelModel[16].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[17].addShapeBox(26F, 2F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1953
		barrelModel[17].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[18].addShapeBox(26F, -1F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1954
		barrelModel[18].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[19].addShapeBox(26F, -1F, 3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1955
		barrelModel[19].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[20].addShapeBox(26F, -3F, 3F, 1, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1956
		barrelModel[20].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[21].addShapeBox(26F, -3F, -2F, 1, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1957
		barrelModel[21].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[22].addShapeBox(26F, 1F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 1958
		barrelModel[22].setRotationPoint(31F, -28.5F, -1F);

		barrelModel[23].addShapeBox(26F, 1F, 3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1959
		barrelModel[23].setRotationPoint(31F, -28.5F, -1F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 3244, textureX, textureY); // Box 413
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3255, textureX, textureY); // Box 414
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3265, textureX, textureY); // Box 415
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Box 419
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Box 420
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 421
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 422
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 423
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 424
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 425
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 426
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3302, textureX, textureY); // Box 427
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 440
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 441
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 442
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 443
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 444
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 445
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 446
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 447
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 448
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 449
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 450
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 451
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 452
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 453
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 482
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 483
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 484
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 485
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 486
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 487
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 488
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 489
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 490
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 491
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 492
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 493
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 494
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 495
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 510
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 511
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 512
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 513
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 514
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 515
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 516
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 517
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 518
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 519
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 520
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 521
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 522
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 523
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 538
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 539
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 540
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 541
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 542
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 543
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 544
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 545
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 546
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 547
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 548
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 549
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 550
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 551
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 566
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 567
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 568
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 569
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 570
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 571
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 572
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 573
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 574
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 575
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 576
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 577
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 578
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 579
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 594
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 595
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 596
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 597
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 598
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 599
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 600
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 601
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 602
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 603
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 604
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 605
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 606
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 607
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 622
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 623
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 624
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 625
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 626
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 627
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 628
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 629
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 630
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 631
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 632
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 633
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 634
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 635

		leftTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		leftTrackWheelModels[0].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[1].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		leftTrackWheelModels[1].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[2].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 415
		leftTrackWheelModels[2].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[3].addShapeBox(-6F, -2F, -1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		leftTrackWheelModels[3].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[4].addShapeBox(5F, -2F, -1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		leftTrackWheelModels[4].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[5].addShapeBox(-2F, -6F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		leftTrackWheelModels[5].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[6].addShapeBox(-2F, 5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		leftTrackWheelModels[6].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[7].addShapeBox(-6F, 5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 423
		leftTrackWheelModels[7].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 424
		leftTrackWheelModels[8].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[9].addShapeBox(2F, -6F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 425
		leftTrackWheelModels[9].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[10].addShapeBox(2F, 5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 426
		leftTrackWheelModels[10].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[11].addShapeBox(-1F, -1F, -0.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		leftTrackWheelModels[11].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[12].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftTrackWheelModels[12].setRotationPoint(43F, 0F, 24F);

		leftTrackWheelModels[13].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		leftTrackWheelModels[13].setRotationPoint(43F, 0F, 24F);

		leftTrackWheelModels[14].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 442
		leftTrackWheelModels[14].setRotationPoint(43F, 0F, 24F);

		leftTrackWheelModels[15].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		leftTrackWheelModels[15].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[16].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		leftTrackWheelModels[16].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		leftTrackWheelModels[17].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[18].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		leftTrackWheelModels[18].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[19].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 447
		leftTrackWheelModels[19].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[20].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftTrackWheelModels[20].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[21].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		leftTrackWheelModels[21].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[22].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 450
		leftTrackWheelModels[22].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[23].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		leftTrackWheelModels[23].setRotationPoint(43F, 0F, 23.5F);

		leftTrackWheelModels[24].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		leftTrackWheelModels[24].setRotationPoint(43F, 0F, 23.5F);

		leftTrackWheelModels[25].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 453
		leftTrackWheelModels[25].setRotationPoint(43F, 0F, 23.5F);

		leftTrackWheelModels[26].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		leftTrackWheelModels[26].setRotationPoint(25F, 0F, 24F);

		leftTrackWheelModels[27].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		leftTrackWheelModels[27].setRotationPoint(25F, 0F, 24F);

		leftTrackWheelModels[28].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 484
		leftTrackWheelModels[28].setRotationPoint(25F, 0F, 24F);

		leftTrackWheelModels[29].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		leftTrackWheelModels[29].setRotationPoint(25F, 0F, 23.5F);

		leftTrackWheelModels[30].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		leftTrackWheelModels[30].setRotationPoint(25F, 0F, 23.5F);

		leftTrackWheelModels[31].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 487
		leftTrackWheelModels[31].setRotationPoint(25F, 0F, 23.5F);

		leftTrackWheelModels[32].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		leftTrackWheelModels[32].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[33].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 489
		leftTrackWheelModels[33].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[34].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		leftTrackWheelModels[34].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[35].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		leftTrackWheelModels[35].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[36].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		leftTrackWheelModels[36].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[37].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		leftTrackWheelModels[37].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[38].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		leftTrackWheelModels[38].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[39].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 495
		leftTrackWheelModels[39].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[40].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		leftTrackWheelModels[40].setRotationPoint(4F, 0F, 23.5F);

		leftTrackWheelModels[41].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		leftTrackWheelModels[41].setRotationPoint(4F, 0F, 23.5F);

		leftTrackWheelModels[42].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 512
		leftTrackWheelModels[42].setRotationPoint(4F, 0F, 23.5F);

		leftTrackWheelModels[43].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		leftTrackWheelModels[43].setRotationPoint(4F, 0F, 24F);

		leftTrackWheelModels[44].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		leftTrackWheelModels[44].setRotationPoint(4F, 0F, 24F);

		leftTrackWheelModels[45].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 515
		leftTrackWheelModels[45].setRotationPoint(4F, 0F, 24F);

		leftTrackWheelModels[46].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		leftTrackWheelModels[46].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[47].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 517
		leftTrackWheelModels[47].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[48].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		leftTrackWheelModels[48].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[49].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 519
		leftTrackWheelModels[49].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[50].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		leftTrackWheelModels[50].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[51].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		leftTrackWheelModels[51].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[52].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		leftTrackWheelModels[52].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[53].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		leftTrackWheelModels[53].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[54].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		leftTrackWheelModels[54].setRotationPoint(-14F, 0F, 23.5F);

		leftTrackWheelModels[55].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		leftTrackWheelModels[55].setRotationPoint(-14F, 0F, 23.5F);

		leftTrackWheelModels[56].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 540
		leftTrackWheelModels[56].setRotationPoint(-14F, 0F, 23.5F);

		leftTrackWheelModels[57].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		leftTrackWheelModels[57].setRotationPoint(-14F, 0F, 24F);

		leftTrackWheelModels[58].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		leftTrackWheelModels[58].setRotationPoint(-14F, 0F, 24F);

		leftTrackWheelModels[59].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 543
		leftTrackWheelModels[59].setRotationPoint(-14F, 0F, 24F);

		leftTrackWheelModels[60].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		leftTrackWheelModels[60].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[61].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 545
		leftTrackWheelModels[61].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[62].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		leftTrackWheelModels[62].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[63].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 547
		leftTrackWheelModels[63].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[64].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		leftTrackWheelModels[64].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[65].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		leftTrackWheelModels[65].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[66].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		leftTrackWheelModels[66].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[67].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftTrackWheelModels[67].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[68].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		leftTrackWheelModels[68].setRotationPoint(-32F, 0F, 23.5F);

		leftTrackWheelModels[69].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		leftTrackWheelModels[69].setRotationPoint(-32F, 0F, 23.5F);

		leftTrackWheelModels[70].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 568
		leftTrackWheelModels[70].setRotationPoint(-32F, 0F, 23.5F);

		leftTrackWheelModels[71].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		leftTrackWheelModels[71].setRotationPoint(-32F, 0F, 24F);

		leftTrackWheelModels[72].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		leftTrackWheelModels[72].setRotationPoint(-32F, 0F, 24F);

		leftTrackWheelModels[73].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 571
		leftTrackWheelModels[73].setRotationPoint(-32F, 0F, 24F);

		leftTrackWheelModels[74].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		leftTrackWheelModels[74].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[75].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 573
		leftTrackWheelModels[75].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[76].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		leftTrackWheelModels[76].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[77].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 575
		leftTrackWheelModels[77].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[78].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		leftTrackWheelModels[78].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[79].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		leftTrackWheelModels[79].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[80].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		leftTrackWheelModels[80].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[81].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		leftTrackWheelModels[81].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[82].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		leftTrackWheelModels[82].setRotationPoint(-50F, 0F, 23.5F);

		leftTrackWheelModels[83].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		leftTrackWheelModels[83].setRotationPoint(-50F, 0F, 23.5F);

		leftTrackWheelModels[84].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 596
		leftTrackWheelModels[84].setRotationPoint(-50F, 0F, 23.5F);

		leftTrackWheelModels[85].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		leftTrackWheelModels[85].setRotationPoint(-50F, 0F, 24F);

		leftTrackWheelModels[86].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		leftTrackWheelModels[86].setRotationPoint(-50F, 0F, 24F);

		leftTrackWheelModels[87].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 599
		leftTrackWheelModels[87].setRotationPoint(-50F, 0F, 24F);

		leftTrackWheelModels[88].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		leftTrackWheelModels[88].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[89].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 601
		leftTrackWheelModels[89].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[90].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		leftTrackWheelModels[90].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[91].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 603
		leftTrackWheelModels[91].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[92].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		leftTrackWheelModels[92].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[93].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		leftTrackWheelModels[93].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[94].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		leftTrackWheelModels[94].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[95].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		leftTrackWheelModels[95].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[96].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		leftTrackWheelModels[96].setRotationPoint(-68F, -7F, 23.5F);

		leftTrackWheelModels[97].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		leftTrackWheelModels[97].setRotationPoint(-68F, -7F, 23.5F);

		leftTrackWheelModels[98].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 624
		leftTrackWheelModels[98].setRotationPoint(-68F, -7F, 23.5F);

		leftTrackWheelModels[99].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		leftTrackWheelModels[99].setRotationPoint(-68F, -7F, 24F);

		leftTrackWheelModels[100].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		leftTrackWheelModels[100].setRotationPoint(-68F, -7F, 24F);

		leftTrackWheelModels[101].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 627
		leftTrackWheelModels[101].setRotationPoint(-68F, -7F, 24F);

		leftTrackWheelModels[102].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		leftTrackWheelModels[102].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[103].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 629
		leftTrackWheelModels[103].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[104].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		leftTrackWheelModels[104].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[105].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 631
		leftTrackWheelModels[105].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[106].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		leftTrackWheelModels[106].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[107].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		leftTrackWheelModels[107].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[108].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		leftTrackWheelModels[108].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[109].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		leftTrackWheelModels[109].setRotationPoint(-68F, -7F, 23F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 3244, textureX, textureY); // Box 428
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3255, textureX, textureY); // Box 429
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3265, textureX, textureY); // Box 430
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Box 431
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Box 432
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 433
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 434
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 435
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 436
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 437
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Box 438
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3302, textureX, textureY); // Box 439
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 454
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 455
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 456
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 457
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 458
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 459
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 460
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 461
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 462
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 463
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 464
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 465
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 466
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 467
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 468
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 469
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 470
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 471
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 472
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 473
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 474
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 475
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 476
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 477
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 478
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 479
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 480
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 481
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 496
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 497
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 498
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 499
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 500
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 501
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 502
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 503
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 504
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 505
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 506
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 507
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 508
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 509
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 524
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 525
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 526
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 527
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 528
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 529
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 530
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 531
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 532
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 533
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 534
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 535
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 536
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 537
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 552
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 553
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 554
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 555
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 556
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 557
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 558
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 559
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 560
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 561
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 562
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 563
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 564
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 565
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 580
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 581
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 582
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 583
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 584
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 585
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 586
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 587
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 588
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 589
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 590
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 591
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 592
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 593
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Box 608
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 609
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 610
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Box 611
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Box 612
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Box 613
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 614
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 615
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 616
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 617
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Box 618
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 619
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Box 620
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Box 621

		rightTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		rightTrackWheelModels[0].setRotationPoint(61F, -9F, -30F);

		rightTrackWheelModels[1].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightTrackWheelModels[1].setRotationPoint(61F, -9F, -30F);

		rightTrackWheelModels[2].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 430
		rightTrackWheelModels[2].setRotationPoint(61F, -9F, -30F);

		rightTrackWheelModels[3].addShapeBox(-6F, -2F, 1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightTrackWheelModels[3].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[4].addShapeBox(5F, -2F, 1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		rightTrackWheelModels[4].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[5].addShapeBox(-2F, -6F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightTrackWheelModels[5].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[6].addShapeBox(-2F, 5F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightTrackWheelModels[6].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[7].addShapeBox(-6F, 5F, 1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 435
		rightTrackWheelModels[7].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[8].addShapeBox(-6F, -6F, 1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 436
		rightTrackWheelModels[8].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[9].addShapeBox(2F, -6F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 437
		rightTrackWheelModels[9].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[10].addShapeBox(2F, 5F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 438
		rightTrackWheelModels[10].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[11].addShapeBox(-1F, -1F, 0.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		rightTrackWheelModels[11].setRotationPoint(61F, -9F, -31F);

		rightTrackWheelModels[12].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		rightTrackWheelModels[12].setRotationPoint(43F, 0F, -30F);

		rightTrackWheelModels[13].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightTrackWheelModels[13].setRotationPoint(43F, 0F, -30F);

		rightTrackWheelModels[14].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 456
		rightTrackWheelModels[14].setRotationPoint(43F, 0F, -30F);

		rightTrackWheelModels[15].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		rightTrackWheelModels[15].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[16].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		rightTrackWheelModels[16].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		rightTrackWheelModels[17].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[18].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		rightTrackWheelModels[18].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[19].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 461
		rightTrackWheelModels[19].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[20].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightTrackWheelModels[20].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[21].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightTrackWheelModels[21].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[22].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 464
		rightTrackWheelModels[22].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[23].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightTrackWheelModels[23].setRotationPoint(43F, 0F, -30.5F);

		rightTrackWheelModels[24].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackWheelModels[24].setRotationPoint(43F, 0F, -30.5F);

		rightTrackWheelModels[25].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 467
		rightTrackWheelModels[25].setRotationPoint(43F, 0F, -30.5F);

		rightTrackWheelModels[26].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightTrackWheelModels[26].setRotationPoint(25F, 0F, -30.5F);

		rightTrackWheelModels[27].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightTrackWheelModels[27].setRotationPoint(25F, 0F, -30.5F);

		rightTrackWheelModels[28].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 470
		rightTrackWheelModels[28].setRotationPoint(25F, 0F, -30.5F);

		rightTrackWheelModels[29].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightTrackWheelModels[29].setRotationPoint(25F, 0F, -30F);

		rightTrackWheelModels[30].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		rightTrackWheelModels[30].setRotationPoint(25F, 0F, -30F);

		rightTrackWheelModels[31].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 473
		rightTrackWheelModels[31].setRotationPoint(25F, 0F, -30F);

		rightTrackWheelModels[32].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightTrackWheelModels[32].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[33].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 475
		rightTrackWheelModels[33].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[34].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		rightTrackWheelModels[34].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[35].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightTrackWheelModels[35].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[36].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		rightTrackWheelModels[36].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[37].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		rightTrackWheelModels[37].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[38].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightTrackWheelModels[38].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[39].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 481
		rightTrackWheelModels[39].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[40].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		rightTrackWheelModels[40].setRotationPoint(4F, 0F, -30F);

		rightTrackWheelModels[41].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		rightTrackWheelModels[41].setRotationPoint(4F, 0F, -30.5F);

		rightTrackWheelModels[42].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightTrackWheelModels[42].setRotationPoint(4F, 0F, -30.5F);

		rightTrackWheelModels[43].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 499
		rightTrackWheelModels[43].setRotationPoint(4F, 0F, -30.5F);

		rightTrackWheelModels[44].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 500
		rightTrackWheelModels[44].setRotationPoint(4F, 0F, -30F);

		rightTrackWheelModels[45].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightTrackWheelModels[45].setRotationPoint(4F, 0F, -30F);

		rightTrackWheelModels[46].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		rightTrackWheelModels[46].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[47].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightTrackWheelModels[47].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[48].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		rightTrackWheelModels[48].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[49].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 505
		rightTrackWheelModels[49].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[50].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightTrackWheelModels[50].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[51].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 507
		rightTrackWheelModels[51].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[52].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		rightTrackWheelModels[52].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[53].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightTrackWheelModels[53].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[54].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		rightTrackWheelModels[54].setRotationPoint(-14F, 0F, -30F);

		rightTrackWheelModels[55].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackWheelModels[55].setRotationPoint(-14F, 0F, -30.5F);

		rightTrackWheelModels[56].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		rightTrackWheelModels[56].setRotationPoint(-14F, 0F, -30.5F);

		rightTrackWheelModels[57].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 527
		rightTrackWheelModels[57].setRotationPoint(-14F, 0F, -30.5F);

		rightTrackWheelModels[58].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 528
		rightTrackWheelModels[58].setRotationPoint(-14F, 0F, -30F);

		rightTrackWheelModels[59].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		rightTrackWheelModels[59].setRotationPoint(-14F, 0F, -30F);

		rightTrackWheelModels[60].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		rightTrackWheelModels[60].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[61].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		rightTrackWheelModels[61].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[62].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		rightTrackWheelModels[62].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[63].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 533
		rightTrackWheelModels[63].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[64].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		rightTrackWheelModels[64].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[65].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 535
		rightTrackWheelModels[65].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[66].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		rightTrackWheelModels[66].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[67].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		rightTrackWheelModels[67].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[68].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		rightTrackWheelModels[68].setRotationPoint(-32F, 0F, -30F);

		rightTrackWheelModels[69].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightTrackWheelModels[69].setRotationPoint(-32F, 0F, -30.5F);

		rightTrackWheelModels[70].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		rightTrackWheelModels[70].setRotationPoint(-32F, 0F, -30.5F);

		rightTrackWheelModels[71].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 555
		rightTrackWheelModels[71].setRotationPoint(-32F, 0F, -30.5F);

		rightTrackWheelModels[72].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 556
		rightTrackWheelModels[72].setRotationPoint(-32F, 0F, -30F);

		rightTrackWheelModels[73].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		rightTrackWheelModels[73].setRotationPoint(-32F, 0F, -30F);

		rightTrackWheelModels[74].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		rightTrackWheelModels[74].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[75].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightTrackWheelModels[75].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[76].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		rightTrackWheelModels[76].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[77].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 561
		rightTrackWheelModels[77].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[78].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		rightTrackWheelModels[78].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[79].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 563
		rightTrackWheelModels[79].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[80].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		rightTrackWheelModels[80].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[81].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		rightTrackWheelModels[81].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[82].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		rightTrackWheelModels[82].setRotationPoint(-50F, 0F, -30F);

		rightTrackWheelModels[83].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		rightTrackWheelModels[83].setRotationPoint(-50F, 0F, -30.5F);

		rightTrackWheelModels[84].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		rightTrackWheelModels[84].setRotationPoint(-50F, 0F, -30.5F);

		rightTrackWheelModels[85].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 583
		rightTrackWheelModels[85].setRotationPoint(-50F, 0F, -30.5F);

		rightTrackWheelModels[86].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 584
		rightTrackWheelModels[86].setRotationPoint(-50F, 0F, -30F);

		rightTrackWheelModels[87].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		rightTrackWheelModels[87].setRotationPoint(-50F, 0F, -30F);

		rightTrackWheelModels[88].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		rightTrackWheelModels[88].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[89].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightTrackWheelModels[89].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[90].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackWheelModels[90].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[91].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 589
		rightTrackWheelModels[91].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[92].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		rightTrackWheelModels[92].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[93].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 591
		rightTrackWheelModels[93].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[94].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		rightTrackWheelModels[94].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[95].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackWheelModels[95].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[96].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		rightTrackWheelModels[96].setRotationPoint(-68F, -7F, -30F);

		rightTrackWheelModels[97].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		rightTrackWheelModels[97].setRotationPoint(-68F, -7F, -30.5F);

		rightTrackWheelModels[98].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		rightTrackWheelModels[98].setRotationPoint(-68F, -7F, -30.5F);

		rightTrackWheelModels[99].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 611
		rightTrackWheelModels[99].setRotationPoint(-68F, -7F, -30.5F);

		rightTrackWheelModels[100].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 612
		rightTrackWheelModels[100].setRotationPoint(-68F, -7F, -30F);

		rightTrackWheelModels[101].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		rightTrackWheelModels[101].setRotationPoint(-68F, -7F, -30F);

		rightTrackWheelModels[102].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		rightTrackWheelModels[102].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[103].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		rightTrackWheelModels[103].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[104].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		rightTrackWheelModels[104].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[105].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 617
		rightTrackWheelModels[105].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[106].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		rightTrackWheelModels[106].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[107].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 619
		rightTrackWheelModels[107].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[108].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		rightTrackWheelModels[108].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[109].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		rightTrackWheelModels[109].setRotationPoint(-68F, -7F, -31F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box6
		leftTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box7
		leftTrackModel[2] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box8
		leftTrackModel[3] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box9
		leftTrackModel[4] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box10
		leftTrackModel[5] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box11
		leftTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box12
		leftTrackModel[7] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box13
		leftTrackModel[8] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box14
		leftTrackModel[9] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box15
		leftTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box16
		leftTrackModel[11] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box17
		leftTrackModel[12] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box24
		leftTrackModel[13] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box25
		leftTrackModel[14] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box26
		leftTrackModel[15] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box27
		leftTrackModel[16] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box28
		leftTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box29
		leftTrackModel[18] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box36
		leftTrackModel[19] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box37
		leftTrackModel[20] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box38
		leftTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box39
		leftTrackModel[22] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box40
		leftTrackModel[23] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box41
		leftTrackModel[24] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box48
		leftTrackModel[25] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box49
		leftTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box50
		leftTrackModel[27] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box51
		leftTrackModel[28] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box52
		leftTrackModel[29] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box53
		leftTrackModel[30] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box60
		leftTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box61
		leftTrackModel[32] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box62
		leftTrackModel[33] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box63
		leftTrackModel[34] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box64
		leftTrackModel[35] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box65
		leftTrackModel[36] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box72
		leftTrackModel[37] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box73
		leftTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box74
		leftTrackModel[39] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box75
		leftTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box76
		leftTrackModel[41] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box77
		leftTrackModel[42] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box84
		leftTrackModel[43] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box85
		leftTrackModel[44] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box86
		leftTrackModel[45] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box87
		leftTrackModel[46] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box88
		leftTrackModel[47] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box89
		leftTrackModel[48] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box96
		leftTrackModel[49] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box97
		leftTrackModel[50] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box98
		leftTrackModel[51] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box99
		leftTrackModel[52] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box100
		leftTrackModel[53] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box101
		leftTrackModel[54] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box108
		leftTrackModel[55] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box109
		leftTrackModel[56] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box110
		leftTrackModel[57] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box111
		leftTrackModel[58] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box112
		leftTrackModel[59] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box113
		leftTrackModel[60] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box120
		leftTrackModel[61] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box121
		leftTrackModel[62] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box122
		leftTrackModel[63] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box123
		leftTrackModel[64] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box124
		leftTrackModel[65] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box125
		leftTrackModel[66] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box132
		leftTrackModel[67] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box133
		leftTrackModel[68] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box134
		leftTrackModel[69] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box135
		leftTrackModel[70] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box136
		leftTrackModel[71] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box137
		leftTrackModel[72] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box144
		leftTrackModel[73] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box145
		leftTrackModel[74] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box146
		leftTrackModel[75] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box147
		leftTrackModel[76] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box148
		leftTrackModel[77] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box149
		leftTrackModel[78] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box156
		leftTrackModel[79] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box157
		leftTrackModel[80] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box158
		leftTrackModel[81] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box159
		leftTrackModel[82] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box160
		leftTrackModel[83] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box161
		leftTrackModel[84] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box168
		leftTrackModel[85] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box169
		leftTrackModel[86] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box170
		leftTrackModel[87] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box171
		leftTrackModel[88] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box172
		leftTrackModel[89] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box173
		leftTrackModel[90] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box180
		leftTrackModel[91] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box181
		leftTrackModel[92] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box182
		leftTrackModel[93] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box183
		leftTrackModel[94] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box184
		leftTrackModel[95] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box185
		leftTrackModel[96] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box192
		leftTrackModel[97] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box193
		leftTrackModel[98] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box194
		leftTrackModel[99] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box195
		leftTrackModel[100] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box196
		leftTrackModel[101] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box197
		leftTrackModel[102] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box204
		leftTrackModel[103] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box205
		leftTrackModel[104] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box206
		leftTrackModel[105] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box207
		leftTrackModel[106] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box208
		leftTrackModel[107] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box209
		leftTrackModel[108] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box216
		leftTrackModel[109] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box217
		leftTrackModel[110] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box218
		leftTrackModel[111] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box219
		leftTrackModel[112] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box220
		leftTrackModel[113] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box221
		leftTrackModel[114] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box228
		leftTrackModel[115] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box229
		leftTrackModel[116] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box230
		leftTrackModel[117] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box231
		leftTrackModel[118] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box232
		leftTrackModel[119] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box233
		leftTrackModel[120] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box240
		leftTrackModel[121] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box241
		leftTrackModel[122] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box242
		leftTrackModel[123] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box243
		leftTrackModel[124] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box244
		leftTrackModel[125] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box245
		leftTrackModel[126] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box252
		leftTrackModel[127] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box253
		leftTrackModel[128] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box254
		leftTrackModel[129] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box255
		leftTrackModel[130] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box256
		leftTrackModel[131] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box257
		leftTrackModel[132] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box264
		leftTrackModel[133] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box265
		leftTrackModel[134] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box266
		leftTrackModel[135] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box267
		leftTrackModel[136] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box268
		leftTrackModel[137] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box269
		leftTrackModel[138] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box276
		leftTrackModel[139] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box277
		leftTrackModel[140] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box278
		leftTrackModel[141] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box279
		leftTrackModel[142] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box280
		leftTrackModel[143] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box281
		leftTrackModel[144] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box288
		leftTrackModel[145] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box289
		leftTrackModel[146] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box290
		leftTrackModel[147] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box291
		leftTrackModel[148] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box292
		leftTrackModel[149] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box293
		leftTrackModel[150] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box300
		leftTrackModel[151] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box301
		leftTrackModel[152] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box302
		leftTrackModel[153] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box303
		leftTrackModel[154] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box304
		leftTrackModel[155] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box305
		leftTrackModel[156] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box312
		leftTrackModel[157] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box313
		leftTrackModel[158] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box314
		leftTrackModel[159] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box315
		leftTrackModel[160] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box316
		leftTrackModel[161] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box317
		leftTrackModel[162] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box324
		leftTrackModel[163] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box325
		leftTrackModel[164] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box326
		leftTrackModel[165] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box327
		leftTrackModel[166] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box328
		leftTrackModel[167] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box329
		leftTrackModel[168] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box336
		leftTrackModel[169] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box337
		leftTrackModel[170] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box338
		leftTrackModel[171] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box339
		leftTrackModel[172] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box340
		leftTrackModel[173] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box341
		leftTrackModel[174] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box354
		leftTrackModel[175] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box355
		leftTrackModel[176] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box356
		leftTrackModel[177] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box357
		leftTrackModel[178] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box358
		leftTrackModel[179] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box359
		leftTrackModel[180] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box366
		leftTrackModel[181] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box367
		leftTrackModel[182] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box368
		leftTrackModel[183] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box369
		leftTrackModel[184] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box370
		leftTrackModel[185] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box371
		leftTrackModel[186] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box378
		leftTrackModel[187] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box379
		leftTrackModel[188] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box380
		leftTrackModel[189] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box381
		leftTrackModel[190] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box382
		leftTrackModel[191] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box383
		leftTrackModel[192] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box390
		leftTrackModel[193] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box391
		leftTrackModel[194] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box392
		leftTrackModel[195] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box393
		leftTrackModel[196] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box394
		leftTrackModel[197] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box395
		leftTrackModel[198] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box402
		leftTrackModel[199] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box403
		leftTrackModel[200] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box404
		leftTrackModel[201] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box405
		leftTrackModel[202] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box406
		leftTrackModel[203] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box407
		leftTrackModel[204] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box414
		leftTrackModel[205] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box415
		leftTrackModel[206] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box416
		leftTrackModel[207] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box417
		leftTrackModel[208] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box418
		leftTrackModel[209] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box419
		leftTrackModel[210] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box426
		leftTrackModel[211] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box427
		leftTrackModel[212] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box428
		leftTrackModel[213] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box429
		leftTrackModel[214] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box430
		leftTrackModel[215] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box431
		leftTrackModel[216] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box438
		leftTrackModel[217] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box439
		leftTrackModel[218] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box440
		leftTrackModel[219] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box441
		leftTrackModel[220] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box442
		leftTrackModel[221] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box443
		leftTrackModel[222] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box450
		leftTrackModel[223] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box451
		leftTrackModel[224] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box452
		leftTrackModel[225] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box453
		leftTrackModel[226] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box454
		leftTrackModel[227] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box455
		leftTrackModel[228] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box462
		leftTrackModel[229] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box463
		leftTrackModel[230] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box464
		leftTrackModel[231] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box465
		leftTrackModel[232] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box466
		leftTrackModel[233] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box467
		leftTrackModel[234] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box474
		leftTrackModel[235] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box475
		leftTrackModel[236] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box476
		leftTrackModel[237] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box477
		leftTrackModel[238] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box478
		leftTrackModel[239] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box479
		leftTrackModel[240] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box486
		leftTrackModel[241] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box487
		leftTrackModel[242] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box488
		leftTrackModel[243] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box489
		leftTrackModel[244] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box490
		leftTrackModel[245] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box491
		leftTrackModel[246] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box498
		leftTrackModel[247] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box499
		leftTrackModel[248] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box500
		leftTrackModel[249] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box501
		leftTrackModel[250] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box502
		leftTrackModel[251] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box503
		leftTrackModel[252] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box510
		leftTrackModel[253] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box511
		leftTrackModel[254] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box512
		leftTrackModel[255] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box513
		leftTrackModel[256] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box514
		leftTrackModel[257] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box515
		leftTrackModel[258] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box522
		leftTrackModel[259] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box523
		leftTrackModel[260] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box524
		leftTrackModel[261] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box525
		leftTrackModel[262] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box526
		leftTrackModel[263] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box527
		leftTrackModel[264] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box534
		leftTrackModel[265] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box535
		leftTrackModel[266] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box536
		leftTrackModel[267] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box537
		leftTrackModel[268] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box538
		leftTrackModel[269] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box539
		leftTrackModel[270] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box546
		leftTrackModel[271] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box547
		leftTrackModel[272] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box548
		leftTrackModel[273] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box549
		leftTrackModel[274] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box550
		leftTrackModel[275] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box551
		leftTrackModel[276] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box558
		leftTrackModel[277] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box559
		leftTrackModel[278] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box560
		leftTrackModel[279] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box561
		leftTrackModel[280] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box562
		leftTrackModel[281] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box563
		leftTrackModel[282] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box570
		leftTrackModel[283] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box571
		leftTrackModel[284] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box572
		leftTrackModel[285] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box573
		leftTrackModel[286] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box574
		leftTrackModel[287] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box575
		leftTrackModel[288] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box582
		leftTrackModel[289] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box583
		leftTrackModel[290] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box584
		leftTrackModel[291] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box585
		leftTrackModel[292] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box586
		leftTrackModel[293] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box587
		leftTrackModel[294] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box594
		leftTrackModel[295] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box595
		leftTrackModel[296] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box596
		leftTrackModel[297] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box597
		leftTrackModel[298] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box598
		leftTrackModel[299] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box599
		leftTrackModel[300] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box606
		leftTrackModel[301] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box607
		leftTrackModel[302] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box608
		leftTrackModel[303] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box609
		leftTrackModel[304] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box610
		leftTrackModel[305] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box611
		leftTrackModel[306] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box618
		leftTrackModel[307] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box619
		leftTrackModel[308] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box620
		leftTrackModel[309] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box621
		leftTrackModel[310] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box622
		leftTrackModel[311] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box623
		leftTrackModel[312] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box630
		leftTrackModel[313] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box631
		leftTrackModel[314] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box632
		leftTrackModel[315] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box633
		leftTrackModel[316] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box634
		leftTrackModel[317] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box635
		leftTrackModel[318] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box642
		leftTrackModel[319] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box643
		leftTrackModel[320] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box644
		leftTrackModel[321] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box645
		leftTrackModel[322] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box646
		leftTrackModel[323] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box647
		leftTrackModel[324] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box654
		leftTrackModel[325] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box655
		leftTrackModel[326] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box656
		leftTrackModel[327] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box657
		leftTrackModel[328] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box658
		leftTrackModel[329] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box659
		leftTrackModel[330] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box666
		leftTrackModel[331] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box667
		leftTrackModel[332] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box668
		leftTrackModel[333] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box669
		leftTrackModel[334] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box670
		leftTrackModel[335] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box671
		leftTrackModel[336] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box678
		leftTrackModel[337] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box679
		leftTrackModel[338] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box680
		leftTrackModel[339] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box681
		leftTrackModel[340] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box682
		leftTrackModel[341] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box683
		leftTrackModel[342] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box690
		leftTrackModel[343] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box691
		leftTrackModel[344] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box692
		leftTrackModel[345] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box693
		leftTrackModel[346] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box694
		leftTrackModel[347] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box695
		leftTrackModel[348] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box702
		leftTrackModel[349] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box703
		leftTrackModel[350] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box704
		leftTrackModel[351] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box705
		leftTrackModel[352] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box706
		leftTrackModel[353] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box707
		leftTrackModel[354] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box714
		leftTrackModel[355] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box715
		leftTrackModel[356] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box716
		leftTrackModel[357] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box717
		leftTrackModel[358] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box718
		leftTrackModel[359] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box719
		leftTrackModel[360] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box726
		leftTrackModel[361] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box727
		leftTrackModel[362] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box728
		leftTrackModel[363] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box729
		leftTrackModel[364] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box730
		leftTrackModel[365] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box731
		leftTrackModel[366] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box738
		leftTrackModel[367] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box739
		leftTrackModel[368] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box740
		leftTrackModel[369] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box741
		leftTrackModel[370] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box742
		leftTrackModel[371] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box743
		leftTrackModel[372] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box750
		leftTrackModel[373] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box751
		leftTrackModel[374] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box752
		leftTrackModel[375] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box753
		leftTrackModel[376] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box754
		leftTrackModel[377] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box755
		leftTrackModel[378] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box762
		leftTrackModel[379] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box763
		leftTrackModel[380] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box764
		leftTrackModel[381] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box765
		leftTrackModel[382] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box766
		leftTrackModel[383] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box767
		leftTrackModel[384] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box774
		leftTrackModel[385] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box775
		leftTrackModel[386] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box776
		leftTrackModel[387] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box777
		leftTrackModel[388] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box778
		leftTrackModel[389] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box779
		leftTrackModel[390] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box786
		leftTrackModel[391] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box787
		leftTrackModel[392] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box788
		leftTrackModel[393] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box789
		leftTrackModel[394] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box790
		leftTrackModel[395] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box791
		leftTrackModel[396] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box798
		leftTrackModel[397] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box799
		leftTrackModel[398] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box800
		leftTrackModel[399] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box801
		leftTrackModel[400] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box802
		leftTrackModel[401] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box803
		leftTrackModel[402] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box810
		leftTrackModel[403] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box811
		leftTrackModel[404] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box812
		leftTrackModel[405] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box813
		leftTrackModel[406] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box814
		leftTrackModel[407] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box815
		leftTrackModel[408] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box822
		leftTrackModel[409] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box823
		leftTrackModel[410] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box824
		leftTrackModel[411] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box825
		leftTrackModel[412] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box826
		leftTrackModel[413] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box827
		leftTrackModel[414] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box834
		leftTrackModel[415] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box835
		leftTrackModel[416] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box836
		leftTrackModel[417] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box837
		leftTrackModel[418] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box838
		leftTrackModel[419] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box839
		leftTrackModel[420] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box846
		leftTrackModel[421] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box847
		leftTrackModel[422] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box848
		leftTrackModel[423] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box849
		leftTrackModel[424] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box850
		leftTrackModel[425] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box851
		leftTrackModel[426] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box858
		leftTrackModel[427] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box859
		leftTrackModel[428] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box860
		leftTrackModel[429] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box861
		leftTrackModel[430] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box862
		leftTrackModel[431] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box863
		leftTrackModel[432] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box870
		leftTrackModel[433] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box871
		leftTrackModel[434] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box872
		leftTrackModel[435] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box873
		leftTrackModel[436] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box874
		leftTrackModel[437] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box875
		leftTrackModel[438] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box882
		leftTrackModel[439] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box883
		leftTrackModel[440] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box884
		leftTrackModel[441] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box885
		leftTrackModel[442] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box886
		leftTrackModel[443] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box887
		leftTrackModel[444] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box894
		leftTrackModel[445] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box895
		leftTrackModel[446] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box896
		leftTrackModel[447] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box897
		leftTrackModel[448] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box898
		leftTrackModel[449] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box899
		leftTrackModel[450] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box906
		leftTrackModel[451] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box907
		leftTrackModel[452] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box908
		leftTrackModel[453] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box909
		leftTrackModel[454] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box910
		leftTrackModel[455] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box911
		leftTrackModel[456] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box918
		leftTrackModel[457] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box919
		leftTrackModel[458] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box920
		leftTrackModel[459] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box921
		leftTrackModel[460] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box922
		leftTrackModel[461] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box923
		leftTrackModel[462] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box930
		leftTrackModel[463] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box931
		leftTrackModel[464] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box932
		leftTrackModel[465] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box933
		leftTrackModel[466] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box934
		leftTrackModel[467] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box935
		leftTrackModel[468] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box942
		leftTrackModel[469] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box943
		leftTrackModel[470] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box944
		leftTrackModel[471] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box945
		leftTrackModel[472] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box946
		leftTrackModel[473] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box947
		leftTrackModel[474] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box954
		leftTrackModel[475] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box955
		leftTrackModel[476] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box956
		leftTrackModel[477] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box957
		leftTrackModel[478] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box958
		leftTrackModel[479] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box959
		leftTrackModel[480] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box966
		leftTrackModel[481] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box967
		leftTrackModel[482] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box968
		leftTrackModel[483] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box969
		leftTrackModel[484] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box970
		leftTrackModel[485] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box971
		leftTrackModel[486] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box978
		leftTrackModel[487] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box979
		leftTrackModel[488] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box980
		leftTrackModel[489] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box981
		leftTrackModel[490] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box982
		leftTrackModel[491] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box983
		leftTrackModel[492] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box990
		leftTrackModel[493] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box991
		leftTrackModel[494] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box992
		leftTrackModel[495] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box993
		leftTrackModel[496] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box994
		leftTrackModel[497] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box995
		leftTrackModel[498] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1002
		leftTrackModel[499] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1003

		leftTrackModel[0].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		leftTrackModel[0].setRotationPoint(-68F, -15.5F, 30F);

		leftTrackModel[1].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box7
		leftTrackModel[1].setRotationPoint(-68F, -15.5F, 30F);

		leftTrackModel[2].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		leftTrackModel[2].setRotationPoint(-68F, -15.5F, 22F);

		leftTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		leftTrackModel[3].setRotationPoint(-68F, -15.5F, 22F);

		leftTrackModel[4].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		leftTrackModel[4].setRotationPoint(-68F, -15.5F, 26F);

		leftTrackModel[5].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		leftTrackModel[5].setRotationPoint(-68F, -15.5F, 21F);

		leftTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		leftTrackModel[6].setRotationPoint(-71F, -15.5F, 30F);
		leftTrackModel[6].rotateAngleZ = 0.64577182F;

		leftTrackModel[7].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box13
		leftTrackModel[7].setRotationPoint(-71F, -15.5F, 30F);
		leftTrackModel[7].rotateAngleZ = 0.64577182F;

		leftTrackModel[8].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		leftTrackModel[8].setRotationPoint(-71F, -15.5F, 22F);
		leftTrackModel[8].rotateAngleZ = 0.64577182F;

		leftTrackModel[9].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		leftTrackModel[9].setRotationPoint(-71F, -15.5F, 22F);
		leftTrackModel[9].rotateAngleZ = 0.64577182F;

		leftTrackModel[10].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		leftTrackModel[10].setRotationPoint(-71F, -15.5F, 26F);
		leftTrackModel[10].rotateAngleZ = 0.64577182F;

		leftTrackModel[11].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		leftTrackModel[11].setRotationPoint(-71F, -15.5F, 21F);
		leftTrackModel[11].rotateAngleZ = 0.64577182F;

		leftTrackModel[12].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		leftTrackModel[12].setRotationPoint(-73.4F, -13.7F, 30F);
		leftTrackModel[12].rotateAngleZ = 0.78539816F;

		leftTrackModel[13].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box25
		leftTrackModel[13].setRotationPoint(-73.4F, -13.7F, 30F);
		leftTrackModel[13].rotateAngleZ = 0.78539816F;

		leftTrackModel[14].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		leftTrackModel[14].setRotationPoint(-73.4F, -13.7F, 22F);
		leftTrackModel[14].rotateAngleZ = 0.78539816F;

		leftTrackModel[15].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		leftTrackModel[15].setRotationPoint(-73.4F, -13.7F, 22F);
		leftTrackModel[15].rotateAngleZ = 0.78539816F;

		leftTrackModel[16].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		leftTrackModel[16].setRotationPoint(-73.4F, -13.7F, 26F);
		leftTrackModel[16].rotateAngleZ = 0.78539816F;

		leftTrackModel[17].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		leftTrackModel[17].setRotationPoint(-73.4F, -13.7F, 21F);
		leftTrackModel[17].rotateAngleZ = 0.78539816F;

		leftTrackModel[18].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		leftTrackModel[18].setRotationPoint(-75.5F, -11.7F, 30F);
		leftTrackModel[18].rotateAngleZ = 1.11701072F;

		leftTrackModel[19].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box37
		leftTrackModel[19].setRotationPoint(-75.5F, -11.7F, 30F);
		leftTrackModel[19].rotateAngleZ = 1.11701072F;

		leftTrackModel[20].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		leftTrackModel[20].setRotationPoint(-75.5F, -11.7F, 22F);
		leftTrackModel[20].rotateAngleZ = 1.11701072F;

		leftTrackModel[21].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		leftTrackModel[21].setRotationPoint(-75.5F, -11.7F, 22F);
		leftTrackModel[21].rotateAngleZ = 1.11701072F;

		leftTrackModel[22].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		leftTrackModel[22].setRotationPoint(-75.5F, -11.7F, 26F);
		leftTrackModel[22].rotateAngleZ = 1.11701072F;

		leftTrackModel[23].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		leftTrackModel[23].setRotationPoint(-75.5F, -11.7F, 21F);
		leftTrackModel[23].rotateAngleZ = 1.11701072F;

		leftTrackModel[24].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		leftTrackModel[24].setRotationPoint(-76.8F, -9F, 30F);
		leftTrackModel[24].rotateAngleZ = 1.57079633F;

		leftTrackModel[25].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box49
		leftTrackModel[25].setRotationPoint(-76.8F, -9F, 30F);
		leftTrackModel[25].rotateAngleZ = 1.57079633F;

		leftTrackModel[26].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		leftTrackModel[26].setRotationPoint(-76.8F, -9F, 22F);
		leftTrackModel[26].rotateAngleZ = 1.57079633F;

		leftTrackModel[27].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		leftTrackModel[27].setRotationPoint(-76.8F, -9F, 22F);
		leftTrackModel[27].rotateAngleZ = 1.57079633F;

		leftTrackModel[28].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		leftTrackModel[28].setRotationPoint(-76.8F, -9F, 26F);
		leftTrackModel[28].rotateAngleZ = 1.57079633F;

		leftTrackModel[29].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		leftTrackModel[29].setRotationPoint(-76.8F, -9F, 21F);
		leftTrackModel[29].rotateAngleZ = 1.57079633F;

		leftTrackModel[30].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		leftTrackModel[30].setRotationPoint(-76.8F, -6F, 30F);
		leftTrackModel[30].rotateAngleZ = 1.71042267F;

		leftTrackModel[31].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box61
		leftTrackModel[31].setRotationPoint(-76.8F, -6F, 30F);
		leftTrackModel[31].rotateAngleZ = 1.71042267F;

		leftTrackModel[32].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		leftTrackModel[32].setRotationPoint(-76.8F, -6F, 22F);
		leftTrackModel[32].rotateAngleZ = 1.71042267F;

		leftTrackModel[33].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		leftTrackModel[33].setRotationPoint(-76.8F, -6F, 22F);
		leftTrackModel[33].rotateAngleZ = 1.71042267F;

		leftTrackModel[34].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		leftTrackModel[34].setRotationPoint(-76.8F, -6F, 26F);
		leftTrackModel[34].rotateAngleZ = 1.71042267F;

		leftTrackModel[35].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		leftTrackModel[35].setRotationPoint(-76.8F, -6F, 21F);
		leftTrackModel[35].rotateAngleZ = 1.71042267F;

		leftTrackModel[36].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		leftTrackModel[36].setRotationPoint(-76.4F, -3F, 30F);
		leftTrackModel[36].rotateAngleZ = 2.37364778F;

		leftTrackModel[37].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box73
		leftTrackModel[37].setRotationPoint(-76.4F, -3F, 30F);
		leftTrackModel[37].rotateAngleZ = 2.37364778F;

		leftTrackModel[38].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		leftTrackModel[38].setRotationPoint(-76.4F, -3F, 22F);
		leftTrackModel[38].rotateAngleZ = 2.37364778F;

		leftTrackModel[39].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		leftTrackModel[39].setRotationPoint(-76.4F, -3F, 22F);
		leftTrackModel[39].rotateAngleZ = 2.37364778F;

		leftTrackModel[40].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		leftTrackModel[40].setRotationPoint(-76.4F, -3F, 26F);
		leftTrackModel[40].rotateAngleZ = 2.37364778F;

		leftTrackModel[41].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		leftTrackModel[41].setRotationPoint(-76.4F, -3F, 21F);
		leftTrackModel[41].rotateAngleZ = 2.37364778F;

		leftTrackModel[42].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftTrackModel[42].setRotationPoint(-74.4F, -1F, 30F);
		leftTrackModel[42].rotateAngleZ = 2.37364778F;

		leftTrackModel[43].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box85
		leftTrackModel[43].setRotationPoint(-74.4F, -1F, 30F);
		leftTrackModel[43].rotateAngleZ = 2.37364778F;

		leftTrackModel[44].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		leftTrackModel[44].setRotationPoint(-74.4F, -1F, 22F);
		leftTrackModel[44].rotateAngleZ = 2.37364778F;

		leftTrackModel[45].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		leftTrackModel[45].setRotationPoint(-74.4F, -1F, 22F);
		leftTrackModel[45].rotateAngleZ = 2.37364778F;

		leftTrackModel[46].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		leftTrackModel[46].setRotationPoint(-74.4F, -1F, 26F);
		leftTrackModel[46].rotateAngleZ = 2.37364778F;

		leftTrackModel[47].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		leftTrackModel[47].setRotationPoint(-74.4F, -1F, 21F);
		leftTrackModel[47].rotateAngleZ = 2.37364778F;

		leftTrackModel[48].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		leftTrackModel[48].setRotationPoint(-72.4F, 1F, 30F);
		leftTrackModel[48].rotateAngleZ = 2.67035376F;

		leftTrackModel[49].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box97
		leftTrackModel[49].setRotationPoint(-72.4F, 1F, 30F);
		leftTrackModel[49].rotateAngleZ = 2.67035376F;

		leftTrackModel[50].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		leftTrackModel[50].setRotationPoint(-72.4F, 1F, 22F);
		leftTrackModel[50].rotateAngleZ = 2.67035376F;

		leftTrackModel[51].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		leftTrackModel[51].setRotationPoint(-72.4F, 1F, 22F);
		leftTrackModel[51].rotateAngleZ = 2.67035376F;

		leftTrackModel[52].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		leftTrackModel[52].setRotationPoint(-72.4F, 1F, 26F);
		leftTrackModel[52].rotateAngleZ = 2.67035376F;

		leftTrackModel[53].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		leftTrackModel[53].setRotationPoint(-72.4F, 1F, 21F);
		leftTrackModel[53].rotateAngleZ = 2.67035376F;

		leftTrackModel[54].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		leftTrackModel[54].setRotationPoint(-69.8F, 2.3F, 30F);
		leftTrackModel[54].rotateAngleZ = 2.74016693F;

		leftTrackModel[55].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box109
		leftTrackModel[55].setRotationPoint(-69.8F, 2.3F, 30F);
		leftTrackModel[55].rotateAngleZ = 2.74016693F;

		leftTrackModel[56].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		leftTrackModel[56].setRotationPoint(-69.8F, 2.3F, 22F);
		leftTrackModel[56].rotateAngleZ = 2.74016693F;

		leftTrackModel[57].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		leftTrackModel[57].setRotationPoint(-69.8F, 2.3F, 22F);
		leftTrackModel[57].rotateAngleZ = 2.74016693F;

		leftTrackModel[58].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		leftTrackModel[58].setRotationPoint(-69.8F, 2.3F, 26F);
		leftTrackModel[58].rotateAngleZ = 2.74016693F;

		leftTrackModel[59].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		leftTrackModel[59].setRotationPoint(-69.8F, 2.3F, 21F);
		leftTrackModel[59].rotateAngleZ = 2.74016693F;

		leftTrackModel[60].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		leftTrackModel[60].setRotationPoint(-67.1F, 3.5F, 30F);
		leftTrackModel[60].rotateAngleZ = 2.74016693F;

		leftTrackModel[61].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box121
		leftTrackModel[61].setRotationPoint(-67.1F, 3.5F, 30F);
		leftTrackModel[61].rotateAngleZ = 2.74016693F;

		leftTrackModel[62].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		leftTrackModel[62].setRotationPoint(-67.1F, 3.5F, 22F);
		leftTrackModel[62].rotateAngleZ = 2.74016693F;

		leftTrackModel[63].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		leftTrackModel[63].setRotationPoint(-67.1F, 3.5F, 22F);
		leftTrackModel[63].rotateAngleZ = 2.74016693F;

		leftTrackModel[64].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		leftTrackModel[64].setRotationPoint(-67.1F, 3.5F, 26F);
		leftTrackModel[64].rotateAngleZ = 2.74016693F;

		leftTrackModel[65].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		leftTrackModel[65].setRotationPoint(-67.1F, 3.5F, 21F);
		leftTrackModel[65].rotateAngleZ = 2.74016693F;

		leftTrackModel[66].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		leftTrackModel[66].setRotationPoint(-64.4F, 4.7F, 30F);
		leftTrackModel[66].rotateAngleZ = 2.74016693F;

		leftTrackModel[67].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box133
		leftTrackModel[67].setRotationPoint(-64.4F, 4.7F, 30F);
		leftTrackModel[67].rotateAngleZ = 2.74016693F;

		leftTrackModel[68].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		leftTrackModel[68].setRotationPoint(-64.4F, 4.7F, 22F);
		leftTrackModel[68].rotateAngleZ = 2.74016693F;

		leftTrackModel[69].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		leftTrackModel[69].setRotationPoint(-64.4F, 4.7F, 22F);
		leftTrackModel[69].rotateAngleZ = 2.74016693F;

		leftTrackModel[70].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		leftTrackModel[70].setRotationPoint(-64.4F, 4.7F, 26F);
		leftTrackModel[70].rotateAngleZ = 2.74016693F;

		leftTrackModel[71].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		leftTrackModel[71].setRotationPoint(-64.4F, 4.7F, 21F);
		leftTrackModel[71].rotateAngleZ = 2.74016693F;

		leftTrackModel[72].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		leftTrackModel[72].setRotationPoint(-61.7F, 5.9F, 30F);
		leftTrackModel[72].rotateAngleZ = 2.7925268F;

		leftTrackModel[73].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box145
		leftTrackModel[73].setRotationPoint(-61.7F, 5.9F, 30F);
		leftTrackModel[73].rotateAngleZ = 2.7925268F;

		leftTrackModel[74].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		leftTrackModel[74].setRotationPoint(-61.7F, 5.9F, 22F);
		leftTrackModel[74].rotateAngleZ = 2.7925268F;

		leftTrackModel[75].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		leftTrackModel[75].setRotationPoint(-61.7F, 5.9F, 22F);
		leftTrackModel[75].rotateAngleZ = 2.7925268F;

		leftTrackModel[76].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		leftTrackModel[76].setRotationPoint(-61.7F, 5.9F, 26F);
		leftTrackModel[76].rotateAngleZ = 2.7925268F;

		leftTrackModel[77].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		leftTrackModel[77].setRotationPoint(-61.7F, 5.9F, 21F);
		leftTrackModel[77].rotateAngleZ = 2.7925268F;

		leftTrackModel[78].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		leftTrackModel[78].setRotationPoint(-58.9F, 7F, 30F);
		leftTrackModel[78].rotateAngleZ = 2.7925268F;

		leftTrackModel[79].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box157
		leftTrackModel[79].setRotationPoint(-58.9F, 7F, 30F);
		leftTrackModel[79].rotateAngleZ = 2.7925268F;

		leftTrackModel[80].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		leftTrackModel[80].setRotationPoint(-58.9F, 7F, 22F);
		leftTrackModel[80].rotateAngleZ = 2.7925268F;

		leftTrackModel[81].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		leftTrackModel[81].setRotationPoint(-58.9F, 7F, 22F);
		leftTrackModel[81].rotateAngleZ = 2.7925268F;

		leftTrackModel[82].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		leftTrackModel[82].setRotationPoint(-58.9F, 7F, 26F);
		leftTrackModel[82].rotateAngleZ = 2.7925268F;

		leftTrackModel[83].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		leftTrackModel[83].setRotationPoint(-58.9F, 7F, 21F);
		leftTrackModel[83].rotateAngleZ = 2.7925268F;

		leftTrackModel[84].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		leftTrackModel[84].setRotationPoint(-56.1F, 8F, 30F);
		leftTrackModel[84].rotateAngleZ = 2.96705973F;

		leftTrackModel[85].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box169
		leftTrackModel[85].setRotationPoint(-56.1F, 8F, 30F);
		leftTrackModel[85].rotateAngleZ = 2.96705973F;

		leftTrackModel[86].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		leftTrackModel[86].setRotationPoint(-56.1F, 8F, 22F);
		leftTrackModel[86].rotateAngleZ = 2.96705973F;

		leftTrackModel[87].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		leftTrackModel[87].setRotationPoint(-56.1F, 8F, 22F);
		leftTrackModel[87].rotateAngleZ = 2.96705973F;

		leftTrackModel[88].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		leftTrackModel[88].setRotationPoint(-56.1F, 8F, 26F);
		leftTrackModel[88].rotateAngleZ = 2.96705973F;

		leftTrackModel[89].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		leftTrackModel[89].setRotationPoint(-56.1F, 8F, 21F);
		leftTrackModel[89].rotateAngleZ = 2.96705973F;

		leftTrackModel[90].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		leftTrackModel[90].setRotationPoint(-53.1F, 8.5F, 30F);
		leftTrackModel[90].rotateAngleZ = 3.14159265F;

		leftTrackModel[91].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box181
		leftTrackModel[91].setRotationPoint(-53.1F, 8.5F, 30F);
		leftTrackModel[91].rotateAngleZ = 3.14159265F;

		leftTrackModel[92].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		leftTrackModel[92].setRotationPoint(-53.1F, 8.5F, 22F);
		leftTrackModel[92].rotateAngleZ = 3.14159265F;

		leftTrackModel[93].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		leftTrackModel[93].setRotationPoint(-53.1F, 8.5F, 22F);
		leftTrackModel[93].rotateAngleZ = 3.14159265F;

		leftTrackModel[94].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		leftTrackModel[94].setRotationPoint(-53.1F, 8.5F, 26F);
		leftTrackModel[94].rotateAngleZ = 3.14159265F;

		leftTrackModel[95].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		leftTrackModel[95].setRotationPoint(-53.1F, 8.5F, 21F);
		leftTrackModel[95].rotateAngleZ = 3.14159265F;

		leftTrackModel[96].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		leftTrackModel[96].setRotationPoint(-50.1F, 8.5F, 30F);
		leftTrackModel[96].rotateAngleZ = 3.14159265F;

		leftTrackModel[97].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box193
		leftTrackModel[97].setRotationPoint(-50.1F, 8.5F, 30F);
		leftTrackModel[97].rotateAngleZ = 3.14159265F;

		leftTrackModel[98].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		leftTrackModel[98].setRotationPoint(-50.1F, 8.5F, 22F);
		leftTrackModel[98].rotateAngleZ = 3.14159265F;

		leftTrackModel[99].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		leftTrackModel[99].setRotationPoint(-50.1F, 8.5F, 22F);
		leftTrackModel[99].rotateAngleZ = 3.14159265F;

		leftTrackModel[100].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		leftTrackModel[100].setRotationPoint(-50.1F, 8.5F, 26F);
		leftTrackModel[100].rotateAngleZ = 3.14159265F;

		leftTrackModel[101].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		leftTrackModel[101].setRotationPoint(-50.1F, 8.5F, 21F);
		leftTrackModel[101].rotateAngleZ = 3.14159265F;

		leftTrackModel[102].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		leftTrackModel[102].setRotationPoint(-47.1F, 8.5F, 30F);
		leftTrackModel[102].rotateAngleZ = 3.14159265F;

		leftTrackModel[103].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box205
		leftTrackModel[103].setRotationPoint(-47.1F, 8.5F, 30F);
		leftTrackModel[103].rotateAngleZ = 3.14159265F;

		leftTrackModel[104].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		leftTrackModel[104].setRotationPoint(-47.1F, 8.5F, 22F);
		leftTrackModel[104].rotateAngleZ = 3.14159265F;

		leftTrackModel[105].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		leftTrackModel[105].setRotationPoint(-47.1F, 8.5F, 22F);
		leftTrackModel[105].rotateAngleZ = 3.14159265F;

		leftTrackModel[106].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		leftTrackModel[106].setRotationPoint(-47.1F, 8.5F, 26F);
		leftTrackModel[106].rotateAngleZ = 3.14159265F;

		leftTrackModel[107].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		leftTrackModel[107].setRotationPoint(-47.1F, 8.5F, 21F);
		leftTrackModel[107].rotateAngleZ = 3.14159265F;

		leftTrackModel[108].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		leftTrackModel[108].setRotationPoint(-44.1F, 8.5F, 30F);
		leftTrackModel[108].rotateAngleZ = 3.14159265F;

		leftTrackModel[109].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box217
		leftTrackModel[109].setRotationPoint(-44.1F, 8.5F, 30F);
		leftTrackModel[109].rotateAngleZ = 3.14159265F;

		leftTrackModel[110].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		leftTrackModel[110].setRotationPoint(-44.1F, 8.5F, 22F);
		leftTrackModel[110].rotateAngleZ = 3.14159265F;

		leftTrackModel[111].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box219
		leftTrackModel[111].setRotationPoint(-44.1F, 8.5F, 22F);
		leftTrackModel[111].rotateAngleZ = 3.14159265F;

		leftTrackModel[112].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		leftTrackModel[112].setRotationPoint(-44.1F, 8.5F, 26F);
		leftTrackModel[112].rotateAngleZ = 3.14159265F;

		leftTrackModel[113].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		leftTrackModel[113].setRotationPoint(-44.1F, 8.5F, 21F);
		leftTrackModel[113].rotateAngleZ = 3.14159265F;

		leftTrackModel[114].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box228
		leftTrackModel[114].setRotationPoint(-41.1F, 8.5F, 30F);
		leftTrackModel[114].rotateAngleZ = 3.14159265F;

		leftTrackModel[115].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box229
		leftTrackModel[115].setRotationPoint(-41.1F, 8.5F, 30F);
		leftTrackModel[115].rotateAngleZ = 3.14159265F;

		leftTrackModel[116].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box230
		leftTrackModel[116].setRotationPoint(-41.1F, 8.5F, 22F);
		leftTrackModel[116].rotateAngleZ = 3.14159265F;

		leftTrackModel[117].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box231
		leftTrackModel[117].setRotationPoint(-41.1F, 8.5F, 22F);
		leftTrackModel[117].rotateAngleZ = 3.14159265F;

		leftTrackModel[118].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		leftTrackModel[118].setRotationPoint(-41.1F, 8.5F, 26F);
		leftTrackModel[118].rotateAngleZ = 3.14159265F;

		leftTrackModel[119].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		leftTrackModel[119].setRotationPoint(-41.1F, 8.5F, 21F);
		leftTrackModel[119].rotateAngleZ = 3.14159265F;

		leftTrackModel[120].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box240
		leftTrackModel[120].setRotationPoint(-38.1F, 8.5F, 30F);
		leftTrackModel[120].rotateAngleZ = 3.14159265F;

		leftTrackModel[121].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box241
		leftTrackModel[121].setRotationPoint(-38.1F, 8.5F, 30F);
		leftTrackModel[121].rotateAngleZ = 3.14159265F;

		leftTrackModel[122].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box242
		leftTrackModel[122].setRotationPoint(-38.1F, 8.5F, 22F);
		leftTrackModel[122].rotateAngleZ = 3.14159265F;

		leftTrackModel[123].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box243
		leftTrackModel[123].setRotationPoint(-38.1F, 8.5F, 22F);
		leftTrackModel[123].rotateAngleZ = 3.14159265F;

		leftTrackModel[124].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box244
		leftTrackModel[124].setRotationPoint(-38.1F, 8.5F, 26F);
		leftTrackModel[124].rotateAngleZ = 3.14159265F;

		leftTrackModel[125].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box245
		leftTrackModel[125].setRotationPoint(-38.1F, 8.5F, 21F);
		leftTrackModel[125].rotateAngleZ = 3.14159265F;

		leftTrackModel[126].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box252
		leftTrackModel[126].setRotationPoint(-35.1F, 8.5F, 30F);
		leftTrackModel[126].rotateAngleZ = 3.14159265F;

		leftTrackModel[127].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box253
		leftTrackModel[127].setRotationPoint(-35.1F, 8.5F, 30F);
		leftTrackModel[127].rotateAngleZ = 3.14159265F;

		leftTrackModel[128].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box254
		leftTrackModel[128].setRotationPoint(-35.1F, 8.5F, 22F);
		leftTrackModel[128].rotateAngleZ = 3.14159265F;

		leftTrackModel[129].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box255
		leftTrackModel[129].setRotationPoint(-35.1F, 8.5F, 22F);
		leftTrackModel[129].rotateAngleZ = 3.14159265F;

		leftTrackModel[130].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box256
		leftTrackModel[130].setRotationPoint(-35.1F, 8.5F, 26F);
		leftTrackModel[130].rotateAngleZ = 3.14159265F;

		leftTrackModel[131].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box257
		leftTrackModel[131].setRotationPoint(-35.1F, 8.5F, 21F);
		leftTrackModel[131].rotateAngleZ = 3.14159265F;

		leftTrackModel[132].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box264
		leftTrackModel[132].setRotationPoint(-32.1F, 8.5F, 30F);
		leftTrackModel[132].rotateAngleZ = 3.14159265F;

		leftTrackModel[133].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box265
		leftTrackModel[133].setRotationPoint(-32.1F, 8.5F, 30F);
		leftTrackModel[133].rotateAngleZ = 3.14159265F;

		leftTrackModel[134].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box266
		leftTrackModel[134].setRotationPoint(-32.1F, 8.5F, 22F);
		leftTrackModel[134].rotateAngleZ = 3.14159265F;

		leftTrackModel[135].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		leftTrackModel[135].setRotationPoint(-32.1F, 8.5F, 22F);
		leftTrackModel[135].rotateAngleZ = 3.14159265F;

		leftTrackModel[136].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box268
		leftTrackModel[136].setRotationPoint(-32.1F, 8.5F, 26F);
		leftTrackModel[136].rotateAngleZ = 3.14159265F;

		leftTrackModel[137].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box269
		leftTrackModel[137].setRotationPoint(-32.1F, 8.5F, 21F);
		leftTrackModel[137].rotateAngleZ = 3.14159265F;

		leftTrackModel[138].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box276
		leftTrackModel[138].setRotationPoint(-29.1F, 8.5F, 30F);
		leftTrackModel[138].rotateAngleZ = 3.14159265F;

		leftTrackModel[139].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box277
		leftTrackModel[139].setRotationPoint(-29.1F, 8.5F, 30F);
		leftTrackModel[139].rotateAngleZ = 3.14159265F;

		leftTrackModel[140].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box278
		leftTrackModel[140].setRotationPoint(-29.1F, 8.5F, 22F);
		leftTrackModel[140].rotateAngleZ = 3.14159265F;

		leftTrackModel[141].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box279
		leftTrackModel[141].setRotationPoint(-29.1F, 8.5F, 22F);
		leftTrackModel[141].rotateAngleZ = 3.14159265F;

		leftTrackModel[142].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box280
		leftTrackModel[142].setRotationPoint(-29.1F, 8.5F, 26F);
		leftTrackModel[142].rotateAngleZ = 3.14159265F;

		leftTrackModel[143].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box281
		leftTrackModel[143].setRotationPoint(-29.1F, 8.5F, 21F);
		leftTrackModel[143].rotateAngleZ = 3.14159265F;

		leftTrackModel[144].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		leftTrackModel[144].setRotationPoint(-26.1F, 8.5F, 30F);
		leftTrackModel[144].rotateAngleZ = 3.14159265F;

		leftTrackModel[145].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box289
		leftTrackModel[145].setRotationPoint(-26.1F, 8.5F, 30F);
		leftTrackModel[145].rotateAngleZ = 3.14159265F;

		leftTrackModel[146].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		leftTrackModel[146].setRotationPoint(-26.1F, 8.5F, 22F);
		leftTrackModel[146].rotateAngleZ = 3.14159265F;

		leftTrackModel[147].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		leftTrackModel[147].setRotationPoint(-26.1F, 8.5F, 22F);
		leftTrackModel[147].rotateAngleZ = 3.14159265F;

		leftTrackModel[148].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		leftTrackModel[148].setRotationPoint(-26.1F, 8.5F, 26F);
		leftTrackModel[148].rotateAngleZ = 3.14159265F;

		leftTrackModel[149].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		leftTrackModel[149].setRotationPoint(-26.1F, 8.5F, 21F);
		leftTrackModel[149].rotateAngleZ = 3.14159265F;

		leftTrackModel[150].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box300
		leftTrackModel[150].setRotationPoint(-23.1F, 8.5F, 30F);
		leftTrackModel[150].rotateAngleZ = 3.14159265F;

		leftTrackModel[151].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box301
		leftTrackModel[151].setRotationPoint(-23.1F, 8.5F, 30F);
		leftTrackModel[151].rotateAngleZ = 3.14159265F;

		leftTrackModel[152].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box302
		leftTrackModel[152].setRotationPoint(-23.1F, 8.5F, 22F);
		leftTrackModel[152].rotateAngleZ = 3.14159265F;

		leftTrackModel[153].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box303
		leftTrackModel[153].setRotationPoint(-23.1F, 8.5F, 22F);
		leftTrackModel[153].rotateAngleZ = 3.14159265F;

		leftTrackModel[154].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box304
		leftTrackModel[154].setRotationPoint(-23.1F, 8.5F, 26F);
		leftTrackModel[154].rotateAngleZ = 3.14159265F;

		leftTrackModel[155].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box305
		leftTrackModel[155].setRotationPoint(-23.1F, 8.5F, 21F);
		leftTrackModel[155].rotateAngleZ = 3.14159265F;

		leftTrackModel[156].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box312
		leftTrackModel[156].setRotationPoint(-20.1F, 8.5F, 30F);
		leftTrackModel[156].rotateAngleZ = 3.14159265F;

		leftTrackModel[157].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box313
		leftTrackModel[157].setRotationPoint(-20.1F, 8.5F, 30F);
		leftTrackModel[157].rotateAngleZ = 3.14159265F;

		leftTrackModel[158].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		leftTrackModel[158].setRotationPoint(-20.1F, 8.5F, 22F);
		leftTrackModel[158].rotateAngleZ = 3.14159265F;

		leftTrackModel[159].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		leftTrackModel[159].setRotationPoint(-20.1F, 8.5F, 22F);
		leftTrackModel[159].rotateAngleZ = 3.14159265F;

		leftTrackModel[160].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		leftTrackModel[160].setRotationPoint(-20.1F, 8.5F, 26F);
		leftTrackModel[160].rotateAngleZ = 3.14159265F;

		leftTrackModel[161].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box317
		leftTrackModel[161].setRotationPoint(-20.1F, 8.5F, 21F);
		leftTrackModel[161].rotateAngleZ = 3.14159265F;

		leftTrackModel[162].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		leftTrackModel[162].setRotationPoint(-17.1F, 8.5F, 30F);
		leftTrackModel[162].rotateAngleZ = 3.14159265F;

		leftTrackModel[163].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box325
		leftTrackModel[163].setRotationPoint(-17.1F, 8.5F, 30F);
		leftTrackModel[163].rotateAngleZ = 3.14159265F;

		leftTrackModel[164].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		leftTrackModel[164].setRotationPoint(-17.1F, 8.5F, 22F);
		leftTrackModel[164].rotateAngleZ = 3.14159265F;

		leftTrackModel[165].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		leftTrackModel[165].setRotationPoint(-17.1F, 8.5F, 22F);
		leftTrackModel[165].rotateAngleZ = 3.14159265F;

		leftTrackModel[166].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box328
		leftTrackModel[166].setRotationPoint(-17.1F, 8.5F, 26F);
		leftTrackModel[166].rotateAngleZ = 3.14159265F;

		leftTrackModel[167].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box329
		leftTrackModel[167].setRotationPoint(-17.1F, 8.5F, 21F);
		leftTrackModel[167].rotateAngleZ = 3.14159265F;

		leftTrackModel[168].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box336
		leftTrackModel[168].setRotationPoint(-14.1F, 8.5F, 30F);
		leftTrackModel[168].rotateAngleZ = 3.14159265F;

		leftTrackModel[169].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box337
		leftTrackModel[169].setRotationPoint(-14.1F, 8.5F, 30F);
		leftTrackModel[169].rotateAngleZ = 3.14159265F;

		leftTrackModel[170].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box338
		leftTrackModel[170].setRotationPoint(-14.1F, 8.5F, 22F);
		leftTrackModel[170].rotateAngleZ = 3.14159265F;

		leftTrackModel[171].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box339
		leftTrackModel[171].setRotationPoint(-14.1F, 8.5F, 22F);
		leftTrackModel[171].rotateAngleZ = 3.14159265F;

		leftTrackModel[172].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box340
		leftTrackModel[172].setRotationPoint(-14.1F, 8.5F, 26F);
		leftTrackModel[172].rotateAngleZ = 3.14159265F;

		leftTrackModel[173].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box341
		leftTrackModel[173].setRotationPoint(-14.1F, 8.5F, 21F);
		leftTrackModel[173].rotateAngleZ = 3.14159265F;

		leftTrackModel[174].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		leftTrackModel[174].setRotationPoint(-11.1F, 8.5F, 22F);
		leftTrackModel[174].rotateAngleZ = 3.14159265F;

		leftTrackModel[175].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box355
		leftTrackModel[175].setRotationPoint(-11.1F, 8.5F, 22F);
		leftTrackModel[175].rotateAngleZ = 3.14159265F;

		leftTrackModel[176].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box356
		leftTrackModel[176].setRotationPoint(-11.1F, 8.5F, 26F);
		leftTrackModel[176].rotateAngleZ = 3.14159265F;

		leftTrackModel[177].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box357
		leftTrackModel[177].setRotationPoint(-11.1F, 8.5F, 30F);
		leftTrackModel[177].rotateAngleZ = 3.14159265F;

		leftTrackModel[178].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box358
		leftTrackModel[178].setRotationPoint(-11.1F, 8.5F, 30F);
		leftTrackModel[178].rotateAngleZ = 3.14159265F;

		leftTrackModel[179].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box359
		leftTrackModel[179].setRotationPoint(-11.1F, 8.5F, 21F);
		leftTrackModel[179].rotateAngleZ = 3.14159265F;

		leftTrackModel[180].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box366
		leftTrackModel[180].setRotationPoint(-8.1F, 8.5F, 22F);
		leftTrackModel[180].rotateAngleZ = 3.14159265F;

		leftTrackModel[181].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box367
		leftTrackModel[181].setRotationPoint(-8.1F, 8.5F, 22F);
		leftTrackModel[181].rotateAngleZ = 3.14159265F;

		leftTrackModel[182].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box368
		leftTrackModel[182].setRotationPoint(-8.1F, 8.5F, 26F);
		leftTrackModel[182].rotateAngleZ = 3.14159265F;

		leftTrackModel[183].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box369
		leftTrackModel[183].setRotationPoint(-8.1F, 8.5F, 30F);
		leftTrackModel[183].rotateAngleZ = 3.14159265F;

		leftTrackModel[184].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box370
		leftTrackModel[184].setRotationPoint(-8.1F, 8.5F, 30F);
		leftTrackModel[184].rotateAngleZ = 3.14159265F;

		leftTrackModel[185].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box371
		leftTrackModel[185].setRotationPoint(-8.1F, 8.5F, 21F);
		leftTrackModel[185].rotateAngleZ = 3.14159265F;

		leftTrackModel[186].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box378
		leftTrackModel[186].setRotationPoint(-5.1F, 8.5F, 22F);
		leftTrackModel[186].rotateAngleZ = 3.14159265F;

		leftTrackModel[187].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box379
		leftTrackModel[187].setRotationPoint(-5.1F, 8.5F, 22F);
		leftTrackModel[187].rotateAngleZ = 3.14159265F;

		leftTrackModel[188].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box380
		leftTrackModel[188].setRotationPoint(-5.1F, 8.5F, 26F);
		leftTrackModel[188].rotateAngleZ = 3.14159265F;

		leftTrackModel[189].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box381
		leftTrackModel[189].setRotationPoint(-5.1F, 8.5F, 30F);
		leftTrackModel[189].rotateAngleZ = 3.14159265F;

		leftTrackModel[190].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box382
		leftTrackModel[190].setRotationPoint(-5.1F, 8.5F, 30F);
		leftTrackModel[190].rotateAngleZ = 3.14159265F;

		leftTrackModel[191].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box383
		leftTrackModel[191].setRotationPoint(-5.1F, 8.5F, 21F);
		leftTrackModel[191].rotateAngleZ = 3.14159265F;

		leftTrackModel[192].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box390
		leftTrackModel[192].setRotationPoint(-2.1F, 8.5F, 22F);
		leftTrackModel[192].rotateAngleZ = 3.14159265F;

		leftTrackModel[193].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box391
		leftTrackModel[193].setRotationPoint(-2.1F, 8.5F, 22F);
		leftTrackModel[193].rotateAngleZ = 3.14159265F;

		leftTrackModel[194].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box392
		leftTrackModel[194].setRotationPoint(-2.1F, 8.5F, 26F);
		leftTrackModel[194].rotateAngleZ = 3.14159265F;

		leftTrackModel[195].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box393
		leftTrackModel[195].setRotationPoint(-2.1F, 8.5F, 30F);
		leftTrackModel[195].rotateAngleZ = 3.14159265F;

		leftTrackModel[196].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box394
		leftTrackModel[196].setRotationPoint(-2.1F, 8.5F, 30F);
		leftTrackModel[196].rotateAngleZ = 3.14159265F;

		leftTrackModel[197].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box395
		leftTrackModel[197].setRotationPoint(-2.1F, 8.5F, 21F);
		leftTrackModel[197].rotateAngleZ = 3.14159265F;

		leftTrackModel[198].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box402
		leftTrackModel[198].setRotationPoint(0.9F, 8.5F, 22F);
		leftTrackModel[198].rotateAngleZ = 3.14159265F;

		leftTrackModel[199].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box403
		leftTrackModel[199].setRotationPoint(0.9F, 8.5F, 22F);
		leftTrackModel[199].rotateAngleZ = 3.14159265F;

		leftTrackModel[200].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box404
		leftTrackModel[200].setRotationPoint(0.9F, 8.5F, 26F);
		leftTrackModel[200].rotateAngleZ = 3.14159265F;

		leftTrackModel[201].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		leftTrackModel[201].setRotationPoint(0.9F, 8.5F, 30F);
		leftTrackModel[201].rotateAngleZ = 3.14159265F;

		leftTrackModel[202].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box406
		leftTrackModel[202].setRotationPoint(0.9F, 8.5F, 30F);
		leftTrackModel[202].rotateAngleZ = 3.14159265F;

		leftTrackModel[203].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		leftTrackModel[203].setRotationPoint(0.9F, 8.5F, 21F);
		leftTrackModel[203].rotateAngleZ = 3.14159265F;

		leftTrackModel[204].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		leftTrackModel[204].setRotationPoint(3.9F, 8.5F, 22F);
		leftTrackModel[204].rotateAngleZ = 3.14159265F;

		leftTrackModel[205].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
		leftTrackModel[205].setRotationPoint(3.9F, 8.5F, 22F);
		leftTrackModel[205].rotateAngleZ = 3.14159265F;

		leftTrackModel[206].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		leftTrackModel[206].setRotationPoint(3.9F, 8.5F, 26F);
		leftTrackModel[206].rotateAngleZ = 3.14159265F;

		leftTrackModel[207].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box417
		leftTrackModel[207].setRotationPoint(3.9F, 8.5F, 30F);
		leftTrackModel[207].rotateAngleZ = 3.14159265F;

		leftTrackModel[208].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box418
		leftTrackModel[208].setRotationPoint(3.9F, 8.5F, 30F);
		leftTrackModel[208].rotateAngleZ = 3.14159265F;

		leftTrackModel[209].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		leftTrackModel[209].setRotationPoint(3.9F, 8.5F, 21F);
		leftTrackModel[209].rotateAngleZ = 3.14159265F;

		leftTrackModel[210].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box426
		leftTrackModel[210].setRotationPoint(6.9F, 8.5F, 22F);
		leftTrackModel[210].rotateAngleZ = 3.14159265F;

		leftTrackModel[211].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box427
		leftTrackModel[211].setRotationPoint(6.9F, 8.5F, 22F);
		leftTrackModel[211].rotateAngleZ = 3.14159265F;

		leftTrackModel[212].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box428
		leftTrackModel[212].setRotationPoint(6.9F, 8.5F, 26F);
		leftTrackModel[212].rotateAngleZ = 3.14159265F;

		leftTrackModel[213].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box429
		leftTrackModel[213].setRotationPoint(6.9F, 8.5F, 30F);
		leftTrackModel[213].rotateAngleZ = 3.14159265F;

		leftTrackModel[214].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box430
		leftTrackModel[214].setRotationPoint(6.9F, 8.5F, 30F);
		leftTrackModel[214].rotateAngleZ = 3.14159265F;

		leftTrackModel[215].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box431
		leftTrackModel[215].setRotationPoint(6.9F, 8.5F, 21F);
		leftTrackModel[215].rotateAngleZ = 3.14159265F;

		leftTrackModel[216].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box438
		leftTrackModel[216].setRotationPoint(9.9F, 8.5F, 22F);
		leftTrackModel[216].rotateAngleZ = 3.14159265F;

		leftTrackModel[217].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box439
		leftTrackModel[217].setRotationPoint(9.9F, 8.5F, 22F);
		leftTrackModel[217].rotateAngleZ = 3.14159265F;

		leftTrackModel[218].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box440
		leftTrackModel[218].setRotationPoint(9.9F, 8.5F, 26F);
		leftTrackModel[218].rotateAngleZ = 3.14159265F;

		leftTrackModel[219].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
		leftTrackModel[219].setRotationPoint(9.9F, 8.5F, 30F);
		leftTrackModel[219].rotateAngleZ = 3.14159265F;

		leftTrackModel[220].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box442
		leftTrackModel[220].setRotationPoint(9.9F, 8.5F, 30F);
		leftTrackModel[220].rotateAngleZ = 3.14159265F;

		leftTrackModel[221].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box443
		leftTrackModel[221].setRotationPoint(9.9F, 8.5F, 21F);
		leftTrackModel[221].rotateAngleZ = 3.14159265F;

		leftTrackModel[222].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box450
		leftTrackModel[222].setRotationPoint(12.9F, 8.5F, 22F);
		leftTrackModel[222].rotateAngleZ = 3.14159265F;

		leftTrackModel[223].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box451
		leftTrackModel[223].setRotationPoint(12.9F, 8.5F, 22F);
		leftTrackModel[223].rotateAngleZ = 3.14159265F;

		leftTrackModel[224].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		leftTrackModel[224].setRotationPoint(12.9F, 8.5F, 26F);
		leftTrackModel[224].rotateAngleZ = 3.14159265F;

		leftTrackModel[225].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box453
		leftTrackModel[225].setRotationPoint(12.9F, 8.5F, 30F);
		leftTrackModel[225].rotateAngleZ = 3.14159265F;

		leftTrackModel[226].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box454
		leftTrackModel[226].setRotationPoint(12.9F, 8.5F, 30F);
		leftTrackModel[226].rotateAngleZ = 3.14159265F;

		leftTrackModel[227].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box455
		leftTrackModel[227].setRotationPoint(12.9F, 8.5F, 21F);
		leftTrackModel[227].rotateAngleZ = 3.14159265F;

		leftTrackModel[228].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box462
		leftTrackModel[228].setRotationPoint(15.9F, 8.5F, 22F);
		leftTrackModel[228].rotateAngleZ = 3.14159265F;

		leftTrackModel[229].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box463
		leftTrackModel[229].setRotationPoint(15.9F, 8.5F, 22F);
		leftTrackModel[229].rotateAngleZ = 3.14159265F;

		leftTrackModel[230].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box464
		leftTrackModel[230].setRotationPoint(15.9F, 8.5F, 26F);
		leftTrackModel[230].rotateAngleZ = 3.14159265F;

		leftTrackModel[231].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box465
		leftTrackModel[231].setRotationPoint(15.9F, 8.5F, 30F);
		leftTrackModel[231].rotateAngleZ = 3.14159265F;

		leftTrackModel[232].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box466
		leftTrackModel[232].setRotationPoint(15.9F, 8.5F, 30F);
		leftTrackModel[232].rotateAngleZ = 3.14159265F;

		leftTrackModel[233].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box467
		leftTrackModel[233].setRotationPoint(15.9F, 8.5F, 21F);
		leftTrackModel[233].rotateAngleZ = 3.14159265F;

		leftTrackModel[234].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box474
		leftTrackModel[234].setRotationPoint(18.9F, 8.5F, 22F);
		leftTrackModel[234].rotateAngleZ = 3.14159265F;

		leftTrackModel[235].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box475
		leftTrackModel[235].setRotationPoint(18.9F, 8.5F, 22F);
		leftTrackModel[235].rotateAngleZ = 3.14159265F;

		leftTrackModel[236].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box476
		leftTrackModel[236].setRotationPoint(18.9F, 8.5F, 26F);
		leftTrackModel[236].rotateAngleZ = 3.14159265F;

		leftTrackModel[237].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box477
		leftTrackModel[237].setRotationPoint(18.9F, 8.5F, 30F);
		leftTrackModel[237].rotateAngleZ = 3.14159265F;

		leftTrackModel[238].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box478
		leftTrackModel[238].setRotationPoint(18.9F, 8.5F, 30F);
		leftTrackModel[238].rotateAngleZ = 3.14159265F;

		leftTrackModel[239].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box479
		leftTrackModel[239].setRotationPoint(18.9F, 8.5F, 21F);
		leftTrackModel[239].rotateAngleZ = 3.14159265F;

		leftTrackModel[240].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box486
		leftTrackModel[240].setRotationPoint(21.9F, 8.5F, 22F);
		leftTrackModel[240].rotateAngleZ = 3.14159265F;

		leftTrackModel[241].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box487
		leftTrackModel[241].setRotationPoint(21.9F, 8.5F, 22F);
		leftTrackModel[241].rotateAngleZ = 3.14159265F;

		leftTrackModel[242].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box488
		leftTrackModel[242].setRotationPoint(21.9F, 8.5F, 26F);
		leftTrackModel[242].rotateAngleZ = 3.14159265F;

		leftTrackModel[243].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box489
		leftTrackModel[243].setRotationPoint(21.9F, 8.5F, 30F);
		leftTrackModel[243].rotateAngleZ = 3.14159265F;

		leftTrackModel[244].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box490
		leftTrackModel[244].setRotationPoint(21.9F, 8.5F, 30F);
		leftTrackModel[244].rotateAngleZ = 3.14159265F;

		leftTrackModel[245].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box491
		leftTrackModel[245].setRotationPoint(21.9F, 8.5F, 21F);
		leftTrackModel[245].rotateAngleZ = 3.14159265F;

		leftTrackModel[246].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box498
		leftTrackModel[246].setRotationPoint(24.9F, 8.5F, 22F);
		leftTrackModel[246].rotateAngleZ = 3.14159265F;

		leftTrackModel[247].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box499
		leftTrackModel[247].setRotationPoint(24.9F, 8.5F, 22F);
		leftTrackModel[247].rotateAngleZ = 3.14159265F;

		leftTrackModel[248].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box500
		leftTrackModel[248].setRotationPoint(24.9F, 8.5F, 26F);
		leftTrackModel[248].rotateAngleZ = 3.14159265F;

		leftTrackModel[249].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box501
		leftTrackModel[249].setRotationPoint(24.9F, 8.5F, 30F);
		leftTrackModel[249].rotateAngleZ = 3.14159265F;

		leftTrackModel[250].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box502
		leftTrackModel[250].setRotationPoint(24.9F, 8.5F, 30F);
		leftTrackModel[250].rotateAngleZ = 3.14159265F;

		leftTrackModel[251].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box503
		leftTrackModel[251].setRotationPoint(24.9F, 8.5F, 21F);
		leftTrackModel[251].rotateAngleZ = 3.14159265F;

		leftTrackModel[252].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box510
		leftTrackModel[252].setRotationPoint(27.9F, 8.5F, 22F);
		leftTrackModel[252].rotateAngleZ = 3.14159265F;

		leftTrackModel[253].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box511
		leftTrackModel[253].setRotationPoint(27.9F, 8.5F, 22F);
		leftTrackModel[253].rotateAngleZ = 3.14159265F;

		leftTrackModel[254].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box512
		leftTrackModel[254].setRotationPoint(27.9F, 8.5F, 26F);
		leftTrackModel[254].rotateAngleZ = 3.14159265F;

		leftTrackModel[255].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		leftTrackModel[255].setRotationPoint(27.9F, 8.5F, 30F);
		leftTrackModel[255].rotateAngleZ = 3.14159265F;

		leftTrackModel[256].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box514
		leftTrackModel[256].setRotationPoint(27.9F, 8.5F, 30F);
		leftTrackModel[256].rotateAngleZ = 3.14159265F;

		leftTrackModel[257].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box515
		leftTrackModel[257].setRotationPoint(27.9F, 8.5F, 21F);
		leftTrackModel[257].rotateAngleZ = 3.14159265F;

		leftTrackModel[258].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box522
		leftTrackModel[258].setRotationPoint(30.9F, 8.5F, 22F);
		leftTrackModel[258].rotateAngleZ = 3.14159265F;

		leftTrackModel[259].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box523
		leftTrackModel[259].setRotationPoint(30.9F, 8.5F, 22F);
		leftTrackModel[259].rotateAngleZ = 3.14159265F;

		leftTrackModel[260].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box524
		leftTrackModel[260].setRotationPoint(30.9F, 8.5F, 26F);
		leftTrackModel[260].rotateAngleZ = 3.14159265F;

		leftTrackModel[261].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box525
		leftTrackModel[261].setRotationPoint(30.9F, 8.5F, 30F);
		leftTrackModel[261].rotateAngleZ = 3.14159265F;

		leftTrackModel[262].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box526
		leftTrackModel[262].setRotationPoint(30.9F, 8.5F, 30F);
		leftTrackModel[262].rotateAngleZ = 3.14159265F;

		leftTrackModel[263].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box527
		leftTrackModel[263].setRotationPoint(30.9F, 8.5F, 21F);
		leftTrackModel[263].rotateAngleZ = 3.14159265F;

		leftTrackModel[264].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box534
		leftTrackModel[264].setRotationPoint(33.9F, 8.5F, 22F);
		leftTrackModel[264].rotateAngleZ = 3.14159265F;

		leftTrackModel[265].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box535
		leftTrackModel[265].setRotationPoint(33.9F, 8.5F, 22F);
		leftTrackModel[265].rotateAngleZ = 3.14159265F;

		leftTrackModel[266].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box536
		leftTrackModel[266].setRotationPoint(33.9F, 8.5F, 26F);
		leftTrackModel[266].rotateAngleZ = 3.14159265F;

		leftTrackModel[267].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box537
		leftTrackModel[267].setRotationPoint(33.9F, 8.5F, 30F);
		leftTrackModel[267].rotateAngleZ = 3.14159265F;

		leftTrackModel[268].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box538
		leftTrackModel[268].setRotationPoint(33.9F, 8.5F, 30F);
		leftTrackModel[268].rotateAngleZ = 3.14159265F;

		leftTrackModel[269].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box539
		leftTrackModel[269].setRotationPoint(33.9F, 8.5F, 21F);
		leftTrackModel[269].rotateAngleZ = 3.14159265F;

		leftTrackModel[270].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box546
		leftTrackModel[270].setRotationPoint(36.9F, 8.5F, 22F);
		leftTrackModel[270].rotateAngleZ = 3.14159265F;

		leftTrackModel[271].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box547
		leftTrackModel[271].setRotationPoint(36.9F, 8.5F, 22F);
		leftTrackModel[271].rotateAngleZ = 3.14159265F;

		leftTrackModel[272].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box548
		leftTrackModel[272].setRotationPoint(36.9F, 8.5F, 26F);
		leftTrackModel[272].rotateAngleZ = 3.14159265F;

		leftTrackModel[273].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box549
		leftTrackModel[273].setRotationPoint(36.9F, 8.5F, 30F);
		leftTrackModel[273].rotateAngleZ = 3.14159265F;

		leftTrackModel[274].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box550
		leftTrackModel[274].setRotationPoint(36.9F, 8.5F, 30F);
		leftTrackModel[274].rotateAngleZ = 3.14159265F;

		leftTrackModel[275].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box551
		leftTrackModel[275].setRotationPoint(36.9F, 8.5F, 21F);
		leftTrackModel[275].rotateAngleZ = 3.14159265F;

		leftTrackModel[276].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box558
		leftTrackModel[276].setRotationPoint(39.9F, 8.5F, 22F);
		leftTrackModel[276].rotateAngleZ = 3.14159265F;

		leftTrackModel[277].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box559
		leftTrackModel[277].setRotationPoint(39.9F, 8.5F, 22F);
		leftTrackModel[277].rotateAngleZ = 3.14159265F;

		leftTrackModel[278].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box560
		leftTrackModel[278].setRotationPoint(39.9F, 8.5F, 26F);
		leftTrackModel[278].rotateAngleZ = 3.14159265F;

		leftTrackModel[279].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box561
		leftTrackModel[279].setRotationPoint(39.9F, 8.5F, 30F);
		leftTrackModel[279].rotateAngleZ = 3.14159265F;

		leftTrackModel[280].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box562
		leftTrackModel[280].setRotationPoint(39.9F, 8.5F, 30F);
		leftTrackModel[280].rotateAngleZ = 3.14159265F;

		leftTrackModel[281].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box563
		leftTrackModel[281].setRotationPoint(39.9F, 8.5F, 21F);
		leftTrackModel[281].rotateAngleZ = 3.14159265F;

		leftTrackModel[282].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box570
		leftTrackModel[282].setRotationPoint(42.9F, 8.5F, 22F);
		leftTrackModel[282].rotateAngleZ = 3.14159265F;

		leftTrackModel[283].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box571
		leftTrackModel[283].setRotationPoint(42.9F, 8.5F, 22F);
		leftTrackModel[283].rotateAngleZ = 3.14159265F;

		leftTrackModel[284].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box572
		leftTrackModel[284].setRotationPoint(42.9F, 8.5F, 26F);
		leftTrackModel[284].rotateAngleZ = 3.14159265F;

		leftTrackModel[285].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box573
		leftTrackModel[285].setRotationPoint(42.9F, 8.5F, 30F);
		leftTrackModel[285].rotateAngleZ = 3.14159265F;

		leftTrackModel[286].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box574
		leftTrackModel[286].setRotationPoint(42.9F, 8.5F, 30F);
		leftTrackModel[286].rotateAngleZ = 3.14159265F;

		leftTrackModel[287].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box575
		leftTrackModel[287].setRotationPoint(42.9F, 8.5F, 21F);
		leftTrackModel[287].rotateAngleZ = 3.14159265F;

		leftTrackModel[288].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box582
		leftTrackModel[288].setRotationPoint(45.9F, 8.5F, 22F);
		leftTrackModel[288].rotateAngleZ = 3.54301838F;

		leftTrackModel[289].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box583
		leftTrackModel[289].setRotationPoint(45.9F, 8.5F, 22F);
		leftTrackModel[289].rotateAngleZ = 3.54301838F;

		leftTrackModel[290].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box584
		leftTrackModel[290].setRotationPoint(45.9F, 8.5F, 26F);
		leftTrackModel[290].rotateAngleZ = 3.54301838F;

		leftTrackModel[291].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box585
		leftTrackModel[291].setRotationPoint(45.9F, 8.5F, 30F);
		leftTrackModel[291].rotateAngleZ = 3.54301838F;

		leftTrackModel[292].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box586
		leftTrackModel[292].setRotationPoint(45.9F, 8.5F, 30F);
		leftTrackModel[292].rotateAngleZ = 3.54301838F;

		leftTrackModel[293].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box587
		leftTrackModel[293].setRotationPoint(45.9F, 8.5F, 21F);
		leftTrackModel[293].rotateAngleZ = 3.54301838F;

		leftTrackModel[294].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box594
		leftTrackModel[294].setRotationPoint(48.6F, 7.4F, 22F);
		leftTrackModel[294].rotateAngleZ = 3.54301838F;

		leftTrackModel[295].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box595
		leftTrackModel[295].setRotationPoint(48.6F, 7.4F, 22F);
		leftTrackModel[295].rotateAngleZ = 3.54301838F;

		leftTrackModel[296].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box596
		leftTrackModel[296].setRotationPoint(48.6F, 7.4F, 26F);
		leftTrackModel[296].rotateAngleZ = 3.54301838F;

		leftTrackModel[297].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box597
		leftTrackModel[297].setRotationPoint(48.6F, 7.4F, 30F);
		leftTrackModel[297].rotateAngleZ = 3.54301838F;

		leftTrackModel[298].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box598
		leftTrackModel[298].setRotationPoint(48.6F, 7.4F, 30F);
		leftTrackModel[298].rotateAngleZ = 3.54301838F;

		leftTrackModel[299].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box599
		leftTrackModel[299].setRotationPoint(48.6F, 7.4F, 21F);
		leftTrackModel[299].rotateAngleZ = 3.54301838F;

		leftTrackModel[300].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box606
		leftTrackModel[300].setRotationPoint(51.4F, 6.3F, 22F);
		leftTrackModel[300].rotateAngleZ = 3.64773814F;

		leftTrackModel[301].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box607
		leftTrackModel[301].setRotationPoint(51.4F, 6.3F, 22F);
		leftTrackModel[301].rotateAngleZ = 3.64773814F;

		leftTrackModel[302].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box608
		leftTrackModel[302].setRotationPoint(51.4F, 6.3F, 26F);
		leftTrackModel[302].rotateAngleZ = 3.64773814F;

		leftTrackModel[303].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box609
		leftTrackModel[303].setRotationPoint(51.4F, 6.3F, 30F);
		leftTrackModel[303].rotateAngleZ = 3.64773814F;

		leftTrackModel[304].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box610
		leftTrackModel[304].setRotationPoint(51.4F, 6.3F, 30F);
		leftTrackModel[304].rotateAngleZ = 3.64773814F;

		leftTrackModel[305].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box611
		leftTrackModel[305].setRotationPoint(51.4F, 6.3F, 21F);
		leftTrackModel[305].rotateAngleZ = 3.64773814F;

		leftTrackModel[306].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box618
		leftTrackModel[306].setRotationPoint(53.9F, 5F, 22F);
		leftTrackModel[306].rotateAngleZ = 3.64773814F;

		leftTrackModel[307].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box619
		leftTrackModel[307].setRotationPoint(53.9F, 5F, 22F);
		leftTrackModel[307].rotateAngleZ = 3.64773814F;

		leftTrackModel[308].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box620
		leftTrackModel[308].setRotationPoint(53.9F, 5F, 26F);
		leftTrackModel[308].rotateAngleZ = 3.64773814F;

		leftTrackModel[309].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box621
		leftTrackModel[309].setRotationPoint(53.9F, 5F, 30F);
		leftTrackModel[309].rotateAngleZ = 3.64773814F;

		leftTrackModel[310].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box622
		leftTrackModel[310].setRotationPoint(53.9F, 5F, 30F);
		leftTrackModel[310].rotateAngleZ = 3.64773814F;

		leftTrackModel[311].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box623
		leftTrackModel[311].setRotationPoint(53.9F, 5F, 21F);
		leftTrackModel[311].rotateAngleZ = 3.64773814F;

		leftTrackModel[312].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box630
		leftTrackModel[312].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[312].rotateAngleZ = 3.64773814F;

		leftTrackModel[313].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box631
		leftTrackModel[313].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[313].rotateAngleZ = 3.64773814F;

		leftTrackModel[314].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box632
		leftTrackModel[314].setRotationPoint(56.5F, 3.6F, 26F);
		leftTrackModel[314].rotateAngleZ = 3.64773814F;

		leftTrackModel[315].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box633
		leftTrackModel[315].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[315].rotateAngleZ = 3.64773814F;

		leftTrackModel[316].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box634
		leftTrackModel[316].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[316].rotateAngleZ = 3.64773814F;

		leftTrackModel[317].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box635
		leftTrackModel[317].setRotationPoint(56.5F, 3.6F, 21F);
		leftTrackModel[317].rotateAngleZ = 3.64773814F;

		leftTrackModel[318].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box642
		leftTrackModel[318].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[318].rotateAngleZ = 3.64773814F;

		leftTrackModel[319].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box643
		leftTrackModel[319].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[319].rotateAngleZ = 3.64773814F;

		leftTrackModel[320].addShapeBox(-5F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box644
		leftTrackModel[320].setRotationPoint(56.5F, 3.6F, 26F);
		leftTrackModel[320].rotateAngleZ = 3.64773814F;

		leftTrackModel[321].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box645
		leftTrackModel[321].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[321].rotateAngleZ = 3.64773814F;

		leftTrackModel[322].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box646
		leftTrackModel[322].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[322].rotateAngleZ = 3.64773814F;

		leftTrackModel[323].addShapeBox(-6F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box647
		leftTrackModel[323].setRotationPoint(56.5F, 3.6F, 21F);
		leftTrackModel[323].rotateAngleZ = 3.64773814F;

		leftTrackModel[324].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box654
		leftTrackModel[324].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[324].rotateAngleZ = 3.64773814F;

		leftTrackModel[325].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box655
		leftTrackModel[325].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[325].rotateAngleZ = 3.64773814F;

		leftTrackModel[326].addShapeBox(-8F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box656
		leftTrackModel[326].setRotationPoint(56.5F, 3.6F, 26F);
		leftTrackModel[326].rotateAngleZ = 3.64773814F;

		leftTrackModel[327].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box657
		leftTrackModel[327].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[327].rotateAngleZ = 3.64773814F;

		leftTrackModel[328].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box658
		leftTrackModel[328].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[328].rotateAngleZ = 3.64773814F;

		leftTrackModel[329].addShapeBox(-9F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box659
		leftTrackModel[329].setRotationPoint(56.5F, 3.6F, 21F);
		leftTrackModel[329].rotateAngleZ = 3.64773814F;

		leftTrackModel[330].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box666
		leftTrackModel[330].setRotationPoint(64.3F, -0.7F, 22F);
		leftTrackModel[330].rotateAngleZ = 3.92699082F;

		leftTrackModel[331].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box667
		leftTrackModel[331].setRotationPoint(64.3F, -0.7F, 22F);
		leftTrackModel[331].rotateAngleZ = 3.92699082F;

		leftTrackModel[332].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box668
		leftTrackModel[332].setRotationPoint(64.3F, -0.7F, 26F);
		leftTrackModel[332].rotateAngleZ = 3.92699082F;

		leftTrackModel[333].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box669
		leftTrackModel[333].setRotationPoint(64.3F, -0.7F, 30F);
		leftTrackModel[333].rotateAngleZ = 3.92699082F;

		leftTrackModel[334].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box670
		leftTrackModel[334].setRotationPoint(64.3F, -0.7F, 30F);
		leftTrackModel[334].rotateAngleZ = 3.92699082F;

		leftTrackModel[335].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box671
		leftTrackModel[335].setRotationPoint(64.3F, -0.7F, 21F);
		leftTrackModel[335].rotateAngleZ = 3.92699082F;

		leftTrackModel[336].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box678
		leftTrackModel[336].setRotationPoint(66.3F, -2.7F, 22F);
		leftTrackModel[336].rotateAngleZ = 4.13643033F;

		leftTrackModel[337].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box679
		leftTrackModel[337].setRotationPoint(66.3F, -2.7F, 22F);
		leftTrackModel[337].rotateAngleZ = 4.13643033F;

		leftTrackModel[338].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box680
		leftTrackModel[338].setRotationPoint(66.3F, -2.7F, 26F);
		leftTrackModel[338].rotateAngleZ = 4.13643033F;

		leftTrackModel[339].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box681
		leftTrackModel[339].setRotationPoint(66.3F, -2.7F, 30F);
		leftTrackModel[339].rotateAngleZ = 4.13643033F;

		leftTrackModel[340].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box682
		leftTrackModel[340].setRotationPoint(66.3F, -2.7F, 30F);
		leftTrackModel[340].rotateAngleZ = 4.13643033F;

		leftTrackModel[341].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box683
		leftTrackModel[341].setRotationPoint(66.3F, -2.7F, 21F);
		leftTrackModel[341].rotateAngleZ = 4.13643033F;

		leftTrackModel[342].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box690
		leftTrackModel[342].setRotationPoint(68F, -5.1F, 22F);
		leftTrackModel[342].rotateAngleZ = 4.69493569F;

		leftTrackModel[343].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box691
		leftTrackModel[343].setRotationPoint(68F, -5.1F, 22F);
		leftTrackModel[343].rotateAngleZ = 4.69493569F;

		leftTrackModel[344].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box692
		leftTrackModel[344].setRotationPoint(68F, -5.1F, 26F);
		leftTrackModel[344].rotateAngleZ = 4.69493569F;

		leftTrackModel[345].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box693
		leftTrackModel[345].setRotationPoint(68F, -5.1F, 30F);
		leftTrackModel[345].rotateAngleZ = 4.69493569F;

		leftTrackModel[346].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box694
		leftTrackModel[346].setRotationPoint(68F, -5.1F, 30F);
		leftTrackModel[346].rotateAngleZ = 4.69493569F;

		leftTrackModel[347].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box695
		leftTrackModel[347].setRotationPoint(68F, -5.1F, 21F);
		leftTrackModel[347].rotateAngleZ = 4.69493569F;

		leftTrackModel[348].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box702
		leftTrackModel[348].setRotationPoint(68F, -8.1F, 22F);
		leftTrackModel[348].rotateAngleZ = 4.69493569F;

		leftTrackModel[349].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box703
		leftTrackModel[349].setRotationPoint(68F, -8.1F, 22F);
		leftTrackModel[349].rotateAngleZ = 4.69493569F;

		leftTrackModel[350].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box704
		leftTrackModel[350].setRotationPoint(68F, -8.1F, 26F);
		leftTrackModel[350].rotateAngleZ = 4.69493569F;

		leftTrackModel[351].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box705
		leftTrackModel[351].setRotationPoint(68F, -8.1F, 30F);
		leftTrackModel[351].rotateAngleZ = 4.69493569F;

		leftTrackModel[352].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box706
		leftTrackModel[352].setRotationPoint(68F, -8.1F, 30F);
		leftTrackModel[352].rotateAngleZ = 4.69493569F;

		leftTrackModel[353].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box707
		leftTrackModel[353].setRotationPoint(68F, -8.1F, 21F);
		leftTrackModel[353].rotateAngleZ = 4.69493569F;

		leftTrackModel[354].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box714
		leftTrackModel[354].setRotationPoint(68F, -11.1F, 22F);
		leftTrackModel[354].rotateAngleZ = 5.21853446F;

		leftTrackModel[355].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box715
		leftTrackModel[355].setRotationPoint(68F, -11.1F, 22F);
		leftTrackModel[355].rotateAngleZ = 5.21853446F;

		leftTrackModel[356].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box716
		leftTrackModel[356].setRotationPoint(68F, -11.1F, 26F);
		leftTrackModel[356].rotateAngleZ = 5.21853446F;

		leftTrackModel[357].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box717
		leftTrackModel[357].setRotationPoint(68F, -11.1F, 30F);
		leftTrackModel[357].rotateAngleZ = 5.21853446F;

		leftTrackModel[358].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box718
		leftTrackModel[358].setRotationPoint(68F, -11.1F, 30F);
		leftTrackModel[358].rotateAngleZ = 5.21853446F;

		leftTrackModel[359].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box719
		leftTrackModel[359].setRotationPoint(68F, -11.1F, 21F);
		leftTrackModel[359].rotateAngleZ = 5.21853446F;

		leftTrackModel[360].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box726
		leftTrackModel[360].setRotationPoint(66.5F, -13.7F, 22F);
		leftTrackModel[360].rotateAngleZ = 5.56760031F;

		leftTrackModel[361].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box727
		leftTrackModel[361].setRotationPoint(66.5F, -13.7F, 22F);
		leftTrackModel[361].rotateAngleZ = 5.56760031F;

		leftTrackModel[362].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box728
		leftTrackModel[362].setRotationPoint(66.5F, -13.7F, 26F);
		leftTrackModel[362].rotateAngleZ = 5.56760031F;

		leftTrackModel[363].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box729
		leftTrackModel[363].setRotationPoint(66.5F, -13.7F, 30F);
		leftTrackModel[363].rotateAngleZ = 5.56760031F;

		leftTrackModel[364].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box730
		leftTrackModel[364].setRotationPoint(66.5F, -13.7F, 30F);
		leftTrackModel[364].rotateAngleZ = 5.56760031F;

		leftTrackModel[365].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box731
		leftTrackModel[365].setRotationPoint(66.5F, -13.7F, 21F);
		leftTrackModel[365].rotateAngleZ = 5.56760031F;

		leftTrackModel[366].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box738
		leftTrackModel[366].setRotationPoint(65F, -16F, 22F);

		leftTrackModel[367].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box739
		leftTrackModel[367].setRotationPoint(65F, -16F, 22F);

		leftTrackModel[368].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box740
		leftTrackModel[368].setRotationPoint(65F, -16F, 26F);

		leftTrackModel[369].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box741
		leftTrackModel[369].setRotationPoint(65F, -16F, 30F);

		leftTrackModel[370].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box742
		leftTrackModel[370].setRotationPoint(65F, -16F, 30F);

		leftTrackModel[371].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box743
		leftTrackModel[371].setRotationPoint(65F, -16F, 21F);

		leftTrackModel[372].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box750
		leftTrackModel[372].setRotationPoint(62F, -16F, 22F);

		leftTrackModel[373].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box751
		leftTrackModel[373].setRotationPoint(62F, -16F, 22F);

		leftTrackModel[374].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box752
		leftTrackModel[374].setRotationPoint(62F, -16F, 26F);

		leftTrackModel[375].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box753
		leftTrackModel[375].setRotationPoint(62F, -16F, 30F);

		leftTrackModel[376].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box754
		leftTrackModel[376].setRotationPoint(62F, -16F, 30F);

		leftTrackModel[377].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box755
		leftTrackModel[377].setRotationPoint(62F, -16F, 21F);

		leftTrackModel[378].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box762
		leftTrackModel[378].setRotationPoint(59F, -16F, 22F);

		leftTrackModel[379].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box763
		leftTrackModel[379].setRotationPoint(59F, -16F, 22F);

		leftTrackModel[380].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box764
		leftTrackModel[380].setRotationPoint(59F, -16F, 26F);

		leftTrackModel[381].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box765
		leftTrackModel[381].setRotationPoint(59F, -16F, 30F);

		leftTrackModel[382].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box766
		leftTrackModel[382].setRotationPoint(59F, -16F, 30F);

		leftTrackModel[383].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box767
		leftTrackModel[383].setRotationPoint(59F, -16F, 21F);

		leftTrackModel[384].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box774
		leftTrackModel[384].setRotationPoint(56F, -16F, 22F);

		leftTrackModel[385].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box775
		leftTrackModel[385].setRotationPoint(56F, -16F, 22F);

		leftTrackModel[386].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box776
		leftTrackModel[386].setRotationPoint(56F, -16F, 26F);

		leftTrackModel[387].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box777
		leftTrackModel[387].setRotationPoint(56F, -16F, 30F);

		leftTrackModel[388].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box778
		leftTrackModel[388].setRotationPoint(56F, -16F, 30F);

		leftTrackModel[389].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box779
		leftTrackModel[389].setRotationPoint(56F, -16F, 21F);

		leftTrackModel[390].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box786
		leftTrackModel[390].setRotationPoint(53F, -16F, 22F);

		leftTrackModel[391].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box787
		leftTrackModel[391].setRotationPoint(53F, -16F, 22F);

		leftTrackModel[392].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box788
		leftTrackModel[392].setRotationPoint(53F, -16F, 26F);

		leftTrackModel[393].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box789
		leftTrackModel[393].setRotationPoint(53F, -16F, 30F);

		leftTrackModel[394].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box790
		leftTrackModel[394].setRotationPoint(53F, -16F, 30F);

		leftTrackModel[395].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box791
		leftTrackModel[395].setRotationPoint(53F, -16F, 21F);

		leftTrackModel[396].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box798
		leftTrackModel[396].setRotationPoint(50F, -16F, 22F);

		leftTrackModel[397].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box799
		leftTrackModel[397].setRotationPoint(50F, -16F, 22F);

		leftTrackModel[398].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box800
		leftTrackModel[398].setRotationPoint(50F, -16F, 26F);

		leftTrackModel[399].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box801
		leftTrackModel[399].setRotationPoint(50F, -16F, 30F);

		leftTrackModel[400].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box802
		leftTrackModel[400].setRotationPoint(50F, -16F, 30F);

		leftTrackModel[401].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box803
		leftTrackModel[401].setRotationPoint(50F, -16F, 21F);

		leftTrackModel[402].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box810
		leftTrackModel[402].setRotationPoint(47F, -16F, 22F);

		leftTrackModel[403].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box811
		leftTrackModel[403].setRotationPoint(47F, -16F, 22F);

		leftTrackModel[404].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box812
		leftTrackModel[404].setRotationPoint(47F, -16F, 26F);

		leftTrackModel[405].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box813
		leftTrackModel[405].setRotationPoint(47F, -16F, 30F);

		leftTrackModel[406].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box814
		leftTrackModel[406].setRotationPoint(47F, -16F, 30F);

		leftTrackModel[407].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box815
		leftTrackModel[407].setRotationPoint(47F, -16F, 21F);

		leftTrackModel[408].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box822
		leftTrackModel[408].setRotationPoint(44F, -16F, 22F);

		leftTrackModel[409].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box823
		leftTrackModel[409].setRotationPoint(44F, -16F, 22F);

		leftTrackModel[410].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box824
		leftTrackModel[410].setRotationPoint(44F, -16F, 26F);

		leftTrackModel[411].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box825
		leftTrackModel[411].setRotationPoint(44F, -16F, 30F);

		leftTrackModel[412].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box826
		leftTrackModel[412].setRotationPoint(44F, -16F, 30F);

		leftTrackModel[413].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box827
		leftTrackModel[413].setRotationPoint(44F, -16F, 21F);

		leftTrackModel[414].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box834
		leftTrackModel[414].setRotationPoint(41F, -16F, 22F);

		leftTrackModel[415].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box835
		leftTrackModel[415].setRotationPoint(41F, -16F, 22F);

		leftTrackModel[416].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box836
		leftTrackModel[416].setRotationPoint(41F, -16F, 26F);

		leftTrackModel[417].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box837
		leftTrackModel[417].setRotationPoint(41F, -16F, 30F);

		leftTrackModel[418].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box838
		leftTrackModel[418].setRotationPoint(41F, -16F, 30F);

		leftTrackModel[419].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box839
		leftTrackModel[419].setRotationPoint(41F, -16F, 21F);

		leftTrackModel[420].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box846
		leftTrackModel[420].setRotationPoint(38F, -16F, 22F);

		leftTrackModel[421].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box847
		leftTrackModel[421].setRotationPoint(38F, -16F, 22F);

		leftTrackModel[422].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box848
		leftTrackModel[422].setRotationPoint(38F, -16F, 26F);

		leftTrackModel[423].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box849
		leftTrackModel[423].setRotationPoint(38F, -16F, 30F);

		leftTrackModel[424].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box850
		leftTrackModel[424].setRotationPoint(38F, -16F, 30F);

		leftTrackModel[425].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box851
		leftTrackModel[425].setRotationPoint(38F, -16F, 21F);

		leftTrackModel[426].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box858
		leftTrackModel[426].setRotationPoint(35F, -16F, 22F);

		leftTrackModel[427].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box859
		leftTrackModel[427].setRotationPoint(35F, -16F, 22F);

		leftTrackModel[428].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box860
		leftTrackModel[428].setRotationPoint(35F, -16F, 26F);

		leftTrackModel[429].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box861
		leftTrackModel[429].setRotationPoint(35F, -16F, 30F);

		leftTrackModel[430].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box862
		leftTrackModel[430].setRotationPoint(35F, -16F, 30F);

		leftTrackModel[431].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box863
		leftTrackModel[431].setRotationPoint(35F, -16F, 21F);

		leftTrackModel[432].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box870
		leftTrackModel[432].setRotationPoint(32F, -16F, 22F);

		leftTrackModel[433].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box871
		leftTrackModel[433].setRotationPoint(32F, -16F, 22F);

		leftTrackModel[434].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box872
		leftTrackModel[434].setRotationPoint(32F, -16F, 26F);

		leftTrackModel[435].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box873
		leftTrackModel[435].setRotationPoint(32F, -16F, 30F);

		leftTrackModel[436].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box874
		leftTrackModel[436].setRotationPoint(32F, -16F, 30F);

		leftTrackModel[437].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box875
		leftTrackModel[437].setRotationPoint(32F, -16F, 21F);

		leftTrackModel[438].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box882
		leftTrackModel[438].setRotationPoint(29F, -16F, 22F);

		leftTrackModel[439].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box883
		leftTrackModel[439].setRotationPoint(29F, -16F, 22F);

		leftTrackModel[440].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box884
		leftTrackModel[440].setRotationPoint(29F, -16F, 26F);

		leftTrackModel[441].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box885
		leftTrackModel[441].setRotationPoint(29F, -16F, 30F);

		leftTrackModel[442].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box886
		leftTrackModel[442].setRotationPoint(29F, -16F, 30F);

		leftTrackModel[443].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box887
		leftTrackModel[443].setRotationPoint(29F, -16F, 21F);

		leftTrackModel[444].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box894
		leftTrackModel[444].setRotationPoint(26F, -16F, 22F);

		leftTrackModel[445].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box895
		leftTrackModel[445].setRotationPoint(26F, -16F, 22F);

		leftTrackModel[446].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box896
		leftTrackModel[446].setRotationPoint(26F, -16F, 26F);

		leftTrackModel[447].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box897
		leftTrackModel[447].setRotationPoint(26F, -16F, 30F);

		leftTrackModel[448].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box898
		leftTrackModel[448].setRotationPoint(26F, -16F, 30F);

		leftTrackModel[449].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box899
		leftTrackModel[449].setRotationPoint(26F, -16F, 21F);

		leftTrackModel[450].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box906
		leftTrackModel[450].setRotationPoint(23F, -16F, 22F);

		leftTrackModel[451].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box907
		leftTrackModel[451].setRotationPoint(23F, -16F, 22F);

		leftTrackModel[452].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box908
		leftTrackModel[452].setRotationPoint(23F, -16F, 26F);

		leftTrackModel[453].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box909
		leftTrackModel[453].setRotationPoint(23F, -16F, 30F);

		leftTrackModel[454].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box910
		leftTrackModel[454].setRotationPoint(23F, -16F, 30F);

		leftTrackModel[455].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box911
		leftTrackModel[455].setRotationPoint(23F, -16F, 21F);

		leftTrackModel[456].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box918
		leftTrackModel[456].setRotationPoint(20F, -16F, 22F);

		leftTrackModel[457].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box919
		leftTrackModel[457].setRotationPoint(20F, -16F, 22F);

		leftTrackModel[458].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box920
		leftTrackModel[458].setRotationPoint(20F, -16F, 26F);

		leftTrackModel[459].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box921
		leftTrackModel[459].setRotationPoint(20F, -16F, 30F);

		leftTrackModel[460].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box922
		leftTrackModel[460].setRotationPoint(20F, -16F, 30F);

		leftTrackModel[461].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box923
		leftTrackModel[461].setRotationPoint(20F, -16F, 21F);

		leftTrackModel[462].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box930
		leftTrackModel[462].setRotationPoint(17F, -16F, 22F);

		leftTrackModel[463].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box931
		leftTrackModel[463].setRotationPoint(17F, -16F, 22F);

		leftTrackModel[464].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box932
		leftTrackModel[464].setRotationPoint(17F, -16F, 26F);

		leftTrackModel[465].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box933
		leftTrackModel[465].setRotationPoint(17F, -16F, 30F);

		leftTrackModel[466].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box934
		leftTrackModel[466].setRotationPoint(17F, -16F, 30F);

		leftTrackModel[467].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box935
		leftTrackModel[467].setRotationPoint(17F, -16F, 21F);

		leftTrackModel[468].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box942
		leftTrackModel[468].setRotationPoint(14F, -16F, 22F);

		leftTrackModel[469].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box943
		leftTrackModel[469].setRotationPoint(14F, -16F, 22F);

		leftTrackModel[470].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box944
		leftTrackModel[470].setRotationPoint(14F, -16F, 26F);

		leftTrackModel[471].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box945
		leftTrackModel[471].setRotationPoint(14F, -16F, 30F);

		leftTrackModel[472].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box946
		leftTrackModel[472].setRotationPoint(14F, -16F, 30F);

		leftTrackModel[473].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box947
		leftTrackModel[473].setRotationPoint(14F, -16F, 21F);

		leftTrackModel[474].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box954
		leftTrackModel[474].setRotationPoint(11F, -16F, 22F);

		leftTrackModel[475].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box955
		leftTrackModel[475].setRotationPoint(11F, -16F, 22F);

		leftTrackModel[476].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box956
		leftTrackModel[476].setRotationPoint(11F, -16F, 26F);

		leftTrackModel[477].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box957
		leftTrackModel[477].setRotationPoint(11F, -16F, 30F);

		leftTrackModel[478].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box958
		leftTrackModel[478].setRotationPoint(11F, -16F, 30F);

		leftTrackModel[479].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box959
		leftTrackModel[479].setRotationPoint(11F, -16F, 21F);

		leftTrackModel[480].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box966
		leftTrackModel[480].setRotationPoint(8F, -16F, 22F);

		leftTrackModel[481].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box967
		leftTrackModel[481].setRotationPoint(8F, -16F, 22F);

		leftTrackModel[482].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box968
		leftTrackModel[482].setRotationPoint(8F, -16F, 26F);

		leftTrackModel[483].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box969
		leftTrackModel[483].setRotationPoint(8F, -16F, 30F);

		leftTrackModel[484].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box970
		leftTrackModel[484].setRotationPoint(8F, -16F, 30F);

		leftTrackModel[485].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box971
		leftTrackModel[485].setRotationPoint(8F, -16F, 21F);

		leftTrackModel[486].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box978
		leftTrackModel[486].setRotationPoint(5F, -16F, 22F);

		leftTrackModel[487].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box979
		leftTrackModel[487].setRotationPoint(5F, -16F, 22F);

		leftTrackModel[488].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box980
		leftTrackModel[488].setRotationPoint(5F, -16F, 26F);

		leftTrackModel[489].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box981
		leftTrackModel[489].setRotationPoint(5F, -16F, 30F);

		leftTrackModel[490].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box982
		leftTrackModel[490].setRotationPoint(5F, -16F, 30F);

		leftTrackModel[491].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box983
		leftTrackModel[491].setRotationPoint(5F, -16F, 21F);

		leftTrackModel[492].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box990
		leftTrackModel[492].setRotationPoint(2F, -16F, 22F);

		leftTrackModel[493].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box991
		leftTrackModel[493].setRotationPoint(2F, -16F, 22F);

		leftTrackModel[494].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box992
		leftTrackModel[494].setRotationPoint(2F, -16F, 26F);

		leftTrackModel[495].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box993
		leftTrackModel[495].setRotationPoint(2F, -16F, 30F);

		leftTrackModel[496].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box994
		leftTrackModel[496].setRotationPoint(2F, -16F, 30F);

		leftTrackModel[497].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box995
		leftTrackModel[497].setRotationPoint(2F, -16F, 21F);

		leftTrackModel[498].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1002
		leftTrackModel[498].setRotationPoint(-1F, -16F, 22F);

		leftTrackModel[499].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1003
		leftTrackModel[499].setRotationPoint(-1F, -16F, 22F);
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1004
		leftTrackModel[501] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1005
		leftTrackModel[502] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1006
		leftTrackModel[503] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1007
		leftTrackModel[504] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1014
		leftTrackModel[505] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1015
		leftTrackModel[506] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1016
		leftTrackModel[507] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1017
		leftTrackModel[508] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1018
		leftTrackModel[509] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1019
		leftTrackModel[510] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1026
		leftTrackModel[511] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1027
		leftTrackModel[512] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1028
		leftTrackModel[513] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1029
		leftTrackModel[514] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1030
		leftTrackModel[515] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1031
		leftTrackModel[516] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1038
		leftTrackModel[517] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1039
		leftTrackModel[518] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1040
		leftTrackModel[519] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1041
		leftTrackModel[520] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1042
		leftTrackModel[521] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1043
		leftTrackModel[522] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1050
		leftTrackModel[523] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1051
		leftTrackModel[524] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1052
		leftTrackModel[525] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1053
		leftTrackModel[526] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1054
		leftTrackModel[527] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1055
		leftTrackModel[528] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1062
		leftTrackModel[529] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1063
		leftTrackModel[530] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1064
		leftTrackModel[531] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1065
		leftTrackModel[532] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1066
		leftTrackModel[533] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1067
		leftTrackModel[534] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1074
		leftTrackModel[535] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1075
		leftTrackModel[536] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1076
		leftTrackModel[537] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1077
		leftTrackModel[538] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1078
		leftTrackModel[539] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1079
		leftTrackModel[540] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1086
		leftTrackModel[541] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1087
		leftTrackModel[542] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1088
		leftTrackModel[543] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1089
		leftTrackModel[544] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1090
		leftTrackModel[545] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1091
		leftTrackModel[546] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1098
		leftTrackModel[547] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1099
		leftTrackModel[548] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1100
		leftTrackModel[549] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1101
		leftTrackModel[550] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1102
		leftTrackModel[551] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1103
		leftTrackModel[552] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1110
		leftTrackModel[553] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1111
		leftTrackModel[554] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1112
		leftTrackModel[555] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1113
		leftTrackModel[556] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1114
		leftTrackModel[557] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1115
		leftTrackModel[558] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1122
		leftTrackModel[559] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1123
		leftTrackModel[560] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1124
		leftTrackModel[561] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1125
		leftTrackModel[562] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1126
		leftTrackModel[563] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1127
		leftTrackModel[564] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1134
		leftTrackModel[565] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1135
		leftTrackModel[566] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1136
		leftTrackModel[567] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1137
		leftTrackModel[568] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1138
		leftTrackModel[569] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1139
		leftTrackModel[570] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1146
		leftTrackModel[571] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1147
		leftTrackModel[572] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1148
		leftTrackModel[573] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1149
		leftTrackModel[574] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1150
		leftTrackModel[575] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1151
		leftTrackModel[576] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1158
		leftTrackModel[577] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1159
		leftTrackModel[578] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1160
		leftTrackModel[579] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1161
		leftTrackModel[580] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1162
		leftTrackModel[581] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1163
		leftTrackModel[582] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1170
		leftTrackModel[583] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1171
		leftTrackModel[584] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1172
		leftTrackModel[585] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1173
		leftTrackModel[586] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1174
		leftTrackModel[587] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1175
		leftTrackModel[588] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1182
		leftTrackModel[589] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1183
		leftTrackModel[590] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1184
		leftTrackModel[591] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1185
		leftTrackModel[592] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1186
		leftTrackModel[593] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1187
		leftTrackModel[594] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1194
		leftTrackModel[595] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1195
		leftTrackModel[596] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1196
		leftTrackModel[597] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1197
		leftTrackModel[598] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1198
		leftTrackModel[599] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1199
		leftTrackModel[600] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1206
		leftTrackModel[601] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1207
		leftTrackModel[602] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1208
		leftTrackModel[603] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1209
		leftTrackModel[604] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1210
		leftTrackModel[605] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1211
		leftTrackModel[606] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1218
		leftTrackModel[607] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1219
		leftTrackModel[608] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1220
		leftTrackModel[609] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1221
		leftTrackModel[610] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1222
		leftTrackModel[611] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1223
		leftTrackModel[612] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1230
		leftTrackModel[613] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1231
		leftTrackModel[614] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1232
		leftTrackModel[615] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1233
		leftTrackModel[616] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1234
		leftTrackModel[617] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1235
		leftTrackModel[618] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1242
		leftTrackModel[619] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1243
		leftTrackModel[620] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1244
		leftTrackModel[621] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1245
		leftTrackModel[622] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1246
		leftTrackModel[623] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1247
		leftTrackModel[624] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1254
		leftTrackModel[625] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1255
		leftTrackModel[626] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1256
		leftTrackModel[627] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1257
		leftTrackModel[628] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1258
		leftTrackModel[629] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1259
		leftTrackModel[630] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1264
		leftTrackModel[631] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1265

		leftTrackModel[500].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1004
		leftTrackModel[500].setRotationPoint(-1F, -16F, 26F);

		leftTrackModel[501].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1005
		leftTrackModel[501].setRotationPoint(-1F, -16F, 30F);

		leftTrackModel[502].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1006
		leftTrackModel[502].setRotationPoint(-1F, -16F, 30F);

		leftTrackModel[503].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1007
		leftTrackModel[503].setRotationPoint(-1F, -16F, 21F);

		leftTrackModel[504].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1014
		leftTrackModel[504].setRotationPoint(-4F, -16F, 22F);

		leftTrackModel[505].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1015
		leftTrackModel[505].setRotationPoint(-4F, -16F, 22F);

		leftTrackModel[506].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1016
		leftTrackModel[506].setRotationPoint(-4F, -16F, 26F);

		leftTrackModel[507].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1017
		leftTrackModel[507].setRotationPoint(-4F, -16F, 30F);

		leftTrackModel[508].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1018
		leftTrackModel[508].setRotationPoint(-4F, -16F, 30F);

		leftTrackModel[509].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1019
		leftTrackModel[509].setRotationPoint(-4F, -16F, 21F);

		leftTrackModel[510].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1026
		leftTrackModel[510].setRotationPoint(-7F, -16F, 22F);

		leftTrackModel[511].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1027
		leftTrackModel[511].setRotationPoint(-7F, -16F, 22F);

		leftTrackModel[512].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1028
		leftTrackModel[512].setRotationPoint(-7F, -16F, 26F);

		leftTrackModel[513].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1029
		leftTrackModel[513].setRotationPoint(-7F, -16F, 30F);

		leftTrackModel[514].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1030
		leftTrackModel[514].setRotationPoint(-7F, -16F, 30F);

		leftTrackModel[515].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1031
		leftTrackModel[515].setRotationPoint(-7F, -16F, 21F);

		leftTrackModel[516].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1038
		leftTrackModel[516].setRotationPoint(-10F, -16F, 22F);

		leftTrackModel[517].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1039
		leftTrackModel[517].setRotationPoint(-10F, -16F, 22F);

		leftTrackModel[518].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1040
		leftTrackModel[518].setRotationPoint(-10F, -16F, 26F);

		leftTrackModel[519].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1041
		leftTrackModel[519].setRotationPoint(-10F, -16F, 30F);

		leftTrackModel[520].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1042
		leftTrackModel[520].setRotationPoint(-10F, -16F, 30F);

		leftTrackModel[521].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1043
		leftTrackModel[521].setRotationPoint(-10F, -16F, 21F);

		leftTrackModel[522].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1050
		leftTrackModel[522].setRotationPoint(-13F, -16F, 22F);

		leftTrackModel[523].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1051
		leftTrackModel[523].setRotationPoint(-13F, -16F, 22F);

		leftTrackModel[524].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1052
		leftTrackModel[524].setRotationPoint(-13F, -16F, 26F);

		leftTrackModel[525].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1053
		leftTrackModel[525].setRotationPoint(-13F, -16F, 30F);

		leftTrackModel[526].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1054
		leftTrackModel[526].setRotationPoint(-13F, -16F, 30F);

		leftTrackModel[527].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1055
		leftTrackModel[527].setRotationPoint(-13F, -16F, 21F);

		leftTrackModel[528].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1062
		leftTrackModel[528].setRotationPoint(-16F, -16F, 22F);

		leftTrackModel[529].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1063
		leftTrackModel[529].setRotationPoint(-16F, -16F, 22F);

		leftTrackModel[530].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1064
		leftTrackModel[530].setRotationPoint(-16F, -16F, 26F);

		leftTrackModel[531].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1065
		leftTrackModel[531].setRotationPoint(-16F, -16F, 30F);

		leftTrackModel[532].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1066
		leftTrackModel[532].setRotationPoint(-16F, -16F, 30F);

		leftTrackModel[533].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1067
		leftTrackModel[533].setRotationPoint(-16F, -16F, 21F);

		leftTrackModel[534].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1074
		leftTrackModel[534].setRotationPoint(-19F, -16F, 22F);

		leftTrackModel[535].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1075
		leftTrackModel[535].setRotationPoint(-19F, -16F, 22F);

		leftTrackModel[536].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1076
		leftTrackModel[536].setRotationPoint(-19F, -16F, 26F);

		leftTrackModel[537].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1077
		leftTrackModel[537].setRotationPoint(-19F, -16F, 30F);

		leftTrackModel[538].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1078
		leftTrackModel[538].setRotationPoint(-19F, -16F, 30F);

		leftTrackModel[539].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1079
		leftTrackModel[539].setRotationPoint(-19F, -16F, 21F);

		leftTrackModel[540].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1086
		leftTrackModel[540].setRotationPoint(-22F, -16F, 22F);

		leftTrackModel[541].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1087
		leftTrackModel[541].setRotationPoint(-22F, -16F, 22F);

		leftTrackModel[542].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1088
		leftTrackModel[542].setRotationPoint(-22F, -16F, 26F);

		leftTrackModel[543].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1089
		leftTrackModel[543].setRotationPoint(-22F, -16F, 30F);

		leftTrackModel[544].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1090
		leftTrackModel[544].setRotationPoint(-22F, -16F, 30F);

		leftTrackModel[545].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1091
		leftTrackModel[545].setRotationPoint(-22F, -16F, 21F);

		leftTrackModel[546].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1098
		leftTrackModel[546].setRotationPoint(-25F, -16F, 22F);

		leftTrackModel[547].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1099
		leftTrackModel[547].setRotationPoint(-25F, -16F, 22F);

		leftTrackModel[548].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1100
		leftTrackModel[548].setRotationPoint(-25F, -16F, 26F);

		leftTrackModel[549].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1101
		leftTrackModel[549].setRotationPoint(-25F, -16F, 30F);

		leftTrackModel[550].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1102
		leftTrackModel[550].setRotationPoint(-25F, -16F, 30F);

		leftTrackModel[551].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1103
		leftTrackModel[551].setRotationPoint(-25F, -16F, 21F);

		leftTrackModel[552].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1110
		leftTrackModel[552].setRotationPoint(-28F, -16F, 22F);

		leftTrackModel[553].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1111
		leftTrackModel[553].setRotationPoint(-28F, -16F, 22F);

		leftTrackModel[554].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1112
		leftTrackModel[554].setRotationPoint(-28F, -16F, 26F);

		leftTrackModel[555].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1113
		leftTrackModel[555].setRotationPoint(-28F, -16F, 30F);

		leftTrackModel[556].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1114
		leftTrackModel[556].setRotationPoint(-28F, -16F, 30F);

		leftTrackModel[557].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1115
		leftTrackModel[557].setRotationPoint(-28F, -16F, 21F);

		leftTrackModel[558].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1122
		leftTrackModel[558].setRotationPoint(-31F, -16F, 22F);

		leftTrackModel[559].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1123
		leftTrackModel[559].setRotationPoint(-31F, -16F, 22F);

		leftTrackModel[560].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1124
		leftTrackModel[560].setRotationPoint(-31F, -16F, 26F);

		leftTrackModel[561].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1125
		leftTrackModel[561].setRotationPoint(-31F, -16F, 30F);

		leftTrackModel[562].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1126
		leftTrackModel[562].setRotationPoint(-31F, -16F, 30F);

		leftTrackModel[563].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1127
		leftTrackModel[563].setRotationPoint(-31F, -16F, 21F);

		leftTrackModel[564].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1134
		leftTrackModel[564].setRotationPoint(-34F, -16F, 22F);

		leftTrackModel[565].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1135
		leftTrackModel[565].setRotationPoint(-34F, -16F, 22F);

		leftTrackModel[566].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1136
		leftTrackModel[566].setRotationPoint(-34F, -16F, 26F);

		leftTrackModel[567].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1137
		leftTrackModel[567].setRotationPoint(-34F, -16F, 30F);

		leftTrackModel[568].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1138
		leftTrackModel[568].setRotationPoint(-34F, -16F, 30F);

		leftTrackModel[569].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1139
		leftTrackModel[569].setRotationPoint(-34F, -16F, 21F);

		leftTrackModel[570].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1146
		leftTrackModel[570].setRotationPoint(-37F, -16F, 22F);

		leftTrackModel[571].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1147
		leftTrackModel[571].setRotationPoint(-37F, -16F, 22F);

		leftTrackModel[572].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1148
		leftTrackModel[572].setRotationPoint(-37F, -16F, 26F);

		leftTrackModel[573].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1149
		leftTrackModel[573].setRotationPoint(-37F, -16F, 30F);

		leftTrackModel[574].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1150
		leftTrackModel[574].setRotationPoint(-37F, -16F, 30F);

		leftTrackModel[575].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1151
		leftTrackModel[575].setRotationPoint(-37F, -16F, 21F);

		leftTrackModel[576].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1158
		leftTrackModel[576].setRotationPoint(-40F, -16F, 22F);

		leftTrackModel[577].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1159
		leftTrackModel[577].setRotationPoint(-40F, -16F, 22F);

		leftTrackModel[578].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1160
		leftTrackModel[578].setRotationPoint(-40F, -16F, 26F);

		leftTrackModel[579].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1161
		leftTrackModel[579].setRotationPoint(-40F, -16F, 30F);

		leftTrackModel[580].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1162
		leftTrackModel[580].setRotationPoint(-40F, -16F, 30F);

		leftTrackModel[581].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1163
		leftTrackModel[581].setRotationPoint(-40F, -16F, 21F);

		leftTrackModel[582].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1170
		leftTrackModel[582].setRotationPoint(-43F, -16F, 22F);

		leftTrackModel[583].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1171
		leftTrackModel[583].setRotationPoint(-43F, -16F, 22F);

		leftTrackModel[584].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1172
		leftTrackModel[584].setRotationPoint(-43F, -16F, 26F);

		leftTrackModel[585].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1173
		leftTrackModel[585].setRotationPoint(-43F, -16F, 30F);

		leftTrackModel[586].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1174
		leftTrackModel[586].setRotationPoint(-43F, -16F, 30F);

		leftTrackModel[587].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1175
		leftTrackModel[587].setRotationPoint(-43F, -16F, 21F);

		leftTrackModel[588].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1182
		leftTrackModel[588].setRotationPoint(-46F, -16F, 22F);

		leftTrackModel[589].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1183
		leftTrackModel[589].setRotationPoint(-46F, -16F, 22F);

		leftTrackModel[590].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1184
		leftTrackModel[590].setRotationPoint(-46F, -16F, 26F);

		leftTrackModel[591].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1185
		leftTrackModel[591].setRotationPoint(-46F, -16F, 30F);

		leftTrackModel[592].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1186
		leftTrackModel[592].setRotationPoint(-46F, -16F, 30F);

		leftTrackModel[593].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1187
		leftTrackModel[593].setRotationPoint(-46F, -16F, 21F);

		leftTrackModel[594].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1194
		leftTrackModel[594].setRotationPoint(-49F, -16F, 22F);

		leftTrackModel[595].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1195
		leftTrackModel[595].setRotationPoint(-49F, -16F, 22F);

		leftTrackModel[596].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1196
		leftTrackModel[596].setRotationPoint(-49F, -16F, 26F);

		leftTrackModel[597].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1197
		leftTrackModel[597].setRotationPoint(-49F, -16F, 30F);

		leftTrackModel[598].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1198
		leftTrackModel[598].setRotationPoint(-49F, -16F, 30F);

		leftTrackModel[599].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1199
		leftTrackModel[599].setRotationPoint(-49F, -16F, 21F);

		leftTrackModel[600].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1206
		leftTrackModel[600].setRotationPoint(-52F, -16F, 22F);

		leftTrackModel[601].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1207
		leftTrackModel[601].setRotationPoint(-52F, -16F, 22F);

		leftTrackModel[602].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1208
		leftTrackModel[602].setRotationPoint(-52F, -16F, 26F);

		leftTrackModel[603].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1209
		leftTrackModel[603].setRotationPoint(-52F, -16F, 30F);

		leftTrackModel[604].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1210
		leftTrackModel[604].setRotationPoint(-52F, -16F, 30F);

		leftTrackModel[605].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1211
		leftTrackModel[605].setRotationPoint(-52F, -16F, 21F);

		leftTrackModel[606].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1218
		leftTrackModel[606].setRotationPoint(-55F, -16F, 22F);

		leftTrackModel[607].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1219
		leftTrackModel[607].setRotationPoint(-55F, -16F, 22F);

		leftTrackModel[608].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1220
		leftTrackModel[608].setRotationPoint(-55F, -16F, 26F);

		leftTrackModel[609].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1221
		leftTrackModel[609].setRotationPoint(-55F, -16F, 30F);

		leftTrackModel[610].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1222
		leftTrackModel[610].setRotationPoint(-55F, -16F, 30F);

		leftTrackModel[611].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1223
		leftTrackModel[611].setRotationPoint(-55F, -16F, 21F);

		leftTrackModel[612].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1230
		leftTrackModel[612].setRotationPoint(-58F, -16F, 22F);

		leftTrackModel[613].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1231
		leftTrackModel[613].setRotationPoint(-58F, -16F, 22F);

		leftTrackModel[614].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1232
		leftTrackModel[614].setRotationPoint(-58F, -16F, 26F);

		leftTrackModel[615].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1233
		leftTrackModel[615].setRotationPoint(-58F, -16F, 30F);

		leftTrackModel[616].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1234
		leftTrackModel[616].setRotationPoint(-58F, -16F, 30F);

		leftTrackModel[617].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1235
		leftTrackModel[617].setRotationPoint(-58F, -16F, 21F);

		leftTrackModel[618].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1242
		leftTrackModel[618].setRotationPoint(-61F, -16F, 22F);

		leftTrackModel[619].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1243
		leftTrackModel[619].setRotationPoint(-61F, -16F, 22F);

		leftTrackModel[620].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1244
		leftTrackModel[620].setRotationPoint(-61F, -16F, 26F);

		leftTrackModel[621].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1245
		leftTrackModel[621].setRotationPoint(-61F, -16F, 30F);

		leftTrackModel[622].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1246
		leftTrackModel[622].setRotationPoint(-61F, -16F, 30F);

		leftTrackModel[623].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1247
		leftTrackModel[623].setRotationPoint(-61F, -16F, 21F);

		leftTrackModel[624].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1254
		leftTrackModel[624].setRotationPoint(-64F, -16F, 22F);
		leftTrackModel[624].rotateAngleZ = 0.13962634F;

		leftTrackModel[625].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1255
		leftTrackModel[625].setRotationPoint(-64F, -16F, 22F);
		leftTrackModel[625].rotateAngleZ = 0.13962634F;

		leftTrackModel[626].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1256
		leftTrackModel[626].setRotationPoint(-64F, -16F, 26F);
		leftTrackModel[626].rotateAngleZ = 0.13962634F;

		leftTrackModel[627].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1257
		leftTrackModel[627].setRotationPoint(-64F, -16F, 30F);
		leftTrackModel[627].rotateAngleZ = 0.13962634F;

		leftTrackModel[628].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1258
		leftTrackModel[628].setRotationPoint(-64F, -16F, 30F);
		leftTrackModel[628].rotateAngleZ = 0.13962634F;

		leftTrackModel[629].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1259
		leftTrackModel[629].setRotationPoint(-64F, -16F, 21F);
		leftTrackModel[629].rotateAngleZ = 0.13962634F;

		leftTrackModel[630].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1264
		leftTrackModel[630].setRotationPoint(-67F, -15.5F, 22F);

		leftTrackModel[631].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1265
		leftTrackModel[631].setRotationPoint(-67F, -15.5F, 30F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box0
		rightTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1
		rightTrackModel[2] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box2
		rightTrackModel[3] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box3
		rightTrackModel[4] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box4
		rightTrackModel[5] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box5
		rightTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box18
		rightTrackModel[7] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box19
		rightTrackModel[8] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box20
		rightTrackModel[9] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box21
		rightTrackModel[10] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box22
		rightTrackModel[11] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box23
		rightTrackModel[12] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box30
		rightTrackModel[13] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box31
		rightTrackModel[14] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box32
		rightTrackModel[15] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box33
		rightTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box34
		rightTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box35
		rightTrackModel[18] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box42
		rightTrackModel[19] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box43
		rightTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box44
		rightTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box45
		rightTrackModel[22] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box46
		rightTrackModel[23] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box47
		rightTrackModel[24] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box54
		rightTrackModel[25] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box55
		rightTrackModel[26] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box56
		rightTrackModel[27] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box57
		rightTrackModel[28] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box58
		rightTrackModel[29] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box59
		rightTrackModel[30] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box66
		rightTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box67
		rightTrackModel[32] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box68
		rightTrackModel[33] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box69
		rightTrackModel[34] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box70
		rightTrackModel[35] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box71
		rightTrackModel[36] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box78
		rightTrackModel[37] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box79
		rightTrackModel[38] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box80
		rightTrackModel[39] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box81
		rightTrackModel[40] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box82
		rightTrackModel[41] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box83
		rightTrackModel[42] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box90
		rightTrackModel[43] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box91
		rightTrackModel[44] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box92
		rightTrackModel[45] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box93
		rightTrackModel[46] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box94
		rightTrackModel[47] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box95
		rightTrackModel[48] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box102
		rightTrackModel[49] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box103
		rightTrackModel[50] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box104
		rightTrackModel[51] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box105
		rightTrackModel[52] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box106
		rightTrackModel[53] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box107
		rightTrackModel[54] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box114
		rightTrackModel[55] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box115
		rightTrackModel[56] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box116
		rightTrackModel[57] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box117
		rightTrackModel[58] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box118
		rightTrackModel[59] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box119
		rightTrackModel[60] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box126
		rightTrackModel[61] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box127
		rightTrackModel[62] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box128
		rightTrackModel[63] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box129
		rightTrackModel[64] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box130
		rightTrackModel[65] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box131
		rightTrackModel[66] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box138
		rightTrackModel[67] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box139
		rightTrackModel[68] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box140
		rightTrackModel[69] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box141
		rightTrackModel[70] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box142
		rightTrackModel[71] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box143
		rightTrackModel[72] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box150
		rightTrackModel[73] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box151
		rightTrackModel[74] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box152
		rightTrackModel[75] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box153
		rightTrackModel[76] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box154
		rightTrackModel[77] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box155
		rightTrackModel[78] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box162
		rightTrackModel[79] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box163
		rightTrackModel[80] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box164
		rightTrackModel[81] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box165
		rightTrackModel[82] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box166
		rightTrackModel[83] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box167
		rightTrackModel[84] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box174
		rightTrackModel[85] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box175
		rightTrackModel[86] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box176
		rightTrackModel[87] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box177
		rightTrackModel[88] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box178
		rightTrackModel[89] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box179
		rightTrackModel[90] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box186
		rightTrackModel[91] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box187
		rightTrackModel[92] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box188
		rightTrackModel[93] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box189
		rightTrackModel[94] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box190
		rightTrackModel[95] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box191
		rightTrackModel[96] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box198
		rightTrackModel[97] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box199
		rightTrackModel[98] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box200
		rightTrackModel[99] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box201
		rightTrackModel[100] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box202
		rightTrackModel[101] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box203
		rightTrackModel[102] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box210
		rightTrackModel[103] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box211
		rightTrackModel[104] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box212
		rightTrackModel[105] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box213
		rightTrackModel[106] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box214
		rightTrackModel[107] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box215
		rightTrackModel[108] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box222
		rightTrackModel[109] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box223
		rightTrackModel[110] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box224
		rightTrackModel[111] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box225
		rightTrackModel[112] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box226
		rightTrackModel[113] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box227
		rightTrackModel[114] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box234
		rightTrackModel[115] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box235
		rightTrackModel[116] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box236
		rightTrackModel[117] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box237
		rightTrackModel[118] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box238
		rightTrackModel[119] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box239
		rightTrackModel[120] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box246
		rightTrackModel[121] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box247
		rightTrackModel[122] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box248
		rightTrackModel[123] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box249
		rightTrackModel[124] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box250
		rightTrackModel[125] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box251
		rightTrackModel[126] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box258
		rightTrackModel[127] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box259
		rightTrackModel[128] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box260
		rightTrackModel[129] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box261
		rightTrackModel[130] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box262
		rightTrackModel[131] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box263
		rightTrackModel[132] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box270
		rightTrackModel[133] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box271
		rightTrackModel[134] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box272
		rightTrackModel[135] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box273
		rightTrackModel[136] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box274
		rightTrackModel[137] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box275
		rightTrackModel[138] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box282
		rightTrackModel[139] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box283
		rightTrackModel[140] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box284
		rightTrackModel[141] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box285
		rightTrackModel[142] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box286
		rightTrackModel[143] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box287
		rightTrackModel[144] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box294
		rightTrackModel[145] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box295
		rightTrackModel[146] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box296
		rightTrackModel[147] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box297
		rightTrackModel[148] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box298
		rightTrackModel[149] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box299
		rightTrackModel[150] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box306
		rightTrackModel[151] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box307
		rightTrackModel[152] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box308
		rightTrackModel[153] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box309
		rightTrackModel[154] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box310
		rightTrackModel[155] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box311
		rightTrackModel[156] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box318
		rightTrackModel[157] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box319
		rightTrackModel[158] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box320
		rightTrackModel[159] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box321
		rightTrackModel[160] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box322
		rightTrackModel[161] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box323
		rightTrackModel[162] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box330
		rightTrackModel[163] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box331
		rightTrackModel[164] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box332
		rightTrackModel[165] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box333
		rightTrackModel[166] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box334
		rightTrackModel[167] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box335
		rightTrackModel[168] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box342
		rightTrackModel[169] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box343
		rightTrackModel[170] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box344
		rightTrackModel[171] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box345
		rightTrackModel[172] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box346
		rightTrackModel[173] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box347
		rightTrackModel[174] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box348
		rightTrackModel[175] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box349
		rightTrackModel[176] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box350
		rightTrackModel[177] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box351
		rightTrackModel[178] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box352
		rightTrackModel[179] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box353
		rightTrackModel[180] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box360
		rightTrackModel[181] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box361
		rightTrackModel[182] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box362
		rightTrackModel[183] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box363
		rightTrackModel[184] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box364
		rightTrackModel[185] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box365
		rightTrackModel[186] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box372
		rightTrackModel[187] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box373
		rightTrackModel[188] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box374
		rightTrackModel[189] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box375
		rightTrackModel[190] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box376
		rightTrackModel[191] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box377
		rightTrackModel[192] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box384
		rightTrackModel[193] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box385
		rightTrackModel[194] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box386
		rightTrackModel[195] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box387
		rightTrackModel[196] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box388
		rightTrackModel[197] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box389
		rightTrackModel[198] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box396
		rightTrackModel[199] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box397
		rightTrackModel[200] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box398
		rightTrackModel[201] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box399
		rightTrackModel[202] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box400
		rightTrackModel[203] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box401
		rightTrackModel[204] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box408
		rightTrackModel[205] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box409
		rightTrackModel[206] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box410
		rightTrackModel[207] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box411
		rightTrackModel[208] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box412
		rightTrackModel[209] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box413
		rightTrackModel[210] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box420
		rightTrackModel[211] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box421
		rightTrackModel[212] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box422
		rightTrackModel[213] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box423
		rightTrackModel[214] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box424
		rightTrackModel[215] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box425
		rightTrackModel[216] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box432
		rightTrackModel[217] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box433
		rightTrackModel[218] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box434
		rightTrackModel[219] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box435
		rightTrackModel[220] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box436
		rightTrackModel[221] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box437
		rightTrackModel[222] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box444
		rightTrackModel[223] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box445
		rightTrackModel[224] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box446
		rightTrackModel[225] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box447
		rightTrackModel[226] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box448
		rightTrackModel[227] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box449
		rightTrackModel[228] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box456
		rightTrackModel[229] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box457
		rightTrackModel[230] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box458
		rightTrackModel[231] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box459
		rightTrackModel[232] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box460
		rightTrackModel[233] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box461
		rightTrackModel[234] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box468
		rightTrackModel[235] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box469
		rightTrackModel[236] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box470
		rightTrackModel[237] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box471
		rightTrackModel[238] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box472
		rightTrackModel[239] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box473
		rightTrackModel[240] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box480
		rightTrackModel[241] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box481
		rightTrackModel[242] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box482
		rightTrackModel[243] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box483
		rightTrackModel[244] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box484
		rightTrackModel[245] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box485
		rightTrackModel[246] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box492
		rightTrackModel[247] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box493
		rightTrackModel[248] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box494
		rightTrackModel[249] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box495
		rightTrackModel[250] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box496
		rightTrackModel[251] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box497
		rightTrackModel[252] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box504
		rightTrackModel[253] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box505
		rightTrackModel[254] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box506
		rightTrackModel[255] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box507
		rightTrackModel[256] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box508
		rightTrackModel[257] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box509
		rightTrackModel[258] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box516
		rightTrackModel[259] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box517
		rightTrackModel[260] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box518
		rightTrackModel[261] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box519
		rightTrackModel[262] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box520
		rightTrackModel[263] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box521
		rightTrackModel[264] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box528
		rightTrackModel[265] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box529
		rightTrackModel[266] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box530
		rightTrackModel[267] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box531
		rightTrackModel[268] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box532
		rightTrackModel[269] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box533
		rightTrackModel[270] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box540
		rightTrackModel[271] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box541
		rightTrackModel[272] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box542
		rightTrackModel[273] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box543
		rightTrackModel[274] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box544
		rightTrackModel[275] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box545
		rightTrackModel[276] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box552
		rightTrackModel[277] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box553
		rightTrackModel[278] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box554
		rightTrackModel[279] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box555
		rightTrackModel[280] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box556
		rightTrackModel[281] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box557
		rightTrackModel[282] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box564
		rightTrackModel[283] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box565
		rightTrackModel[284] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box566
		rightTrackModel[285] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box567
		rightTrackModel[286] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box568
		rightTrackModel[287] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box569
		rightTrackModel[288] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box576
		rightTrackModel[289] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box577
		rightTrackModel[290] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box578
		rightTrackModel[291] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box579
		rightTrackModel[292] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box580
		rightTrackModel[293] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box581
		rightTrackModel[294] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box588
		rightTrackModel[295] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box589
		rightTrackModel[296] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box590
		rightTrackModel[297] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box591
		rightTrackModel[298] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box592
		rightTrackModel[299] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box593
		rightTrackModel[300] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box600
		rightTrackModel[301] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box601
		rightTrackModel[302] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box602
		rightTrackModel[303] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box603
		rightTrackModel[304] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box604
		rightTrackModel[305] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box605
		rightTrackModel[306] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box612
		rightTrackModel[307] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box613
		rightTrackModel[308] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box614
		rightTrackModel[309] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box615
		rightTrackModel[310] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box616
		rightTrackModel[311] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box617
		rightTrackModel[312] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box624
		rightTrackModel[313] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box625
		rightTrackModel[314] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box626
		rightTrackModel[315] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box627
		rightTrackModel[316] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box628
		rightTrackModel[317] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box629
		rightTrackModel[318] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box636
		rightTrackModel[319] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box637
		rightTrackModel[320] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box638
		rightTrackModel[321] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box639
		rightTrackModel[322] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box640
		rightTrackModel[323] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box641
		rightTrackModel[324] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box648
		rightTrackModel[325] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box649
		rightTrackModel[326] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box650
		rightTrackModel[327] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box651
		rightTrackModel[328] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box652
		rightTrackModel[329] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box653
		rightTrackModel[330] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box660
		rightTrackModel[331] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box661
		rightTrackModel[332] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box662
		rightTrackModel[333] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box663
		rightTrackModel[334] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box664
		rightTrackModel[335] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box665
		rightTrackModel[336] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box672
		rightTrackModel[337] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box673
		rightTrackModel[338] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box674
		rightTrackModel[339] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box675
		rightTrackModel[340] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box676
		rightTrackModel[341] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box677
		rightTrackModel[342] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box684
		rightTrackModel[343] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box685
		rightTrackModel[344] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box686
		rightTrackModel[345] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box687
		rightTrackModel[346] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box688
		rightTrackModel[347] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box689
		rightTrackModel[348] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box696
		rightTrackModel[349] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box697
		rightTrackModel[350] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box698
		rightTrackModel[351] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box699
		rightTrackModel[352] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box700
		rightTrackModel[353] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box701
		rightTrackModel[354] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box708
		rightTrackModel[355] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box709
		rightTrackModel[356] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box710
		rightTrackModel[357] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box711
		rightTrackModel[358] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box712
		rightTrackModel[359] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box713
		rightTrackModel[360] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box720
		rightTrackModel[361] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box721
		rightTrackModel[362] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box722
		rightTrackModel[363] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box723
		rightTrackModel[364] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box724
		rightTrackModel[365] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box725
		rightTrackModel[366] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box732
		rightTrackModel[367] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box733
		rightTrackModel[368] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box734
		rightTrackModel[369] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box735
		rightTrackModel[370] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box736
		rightTrackModel[371] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box737
		rightTrackModel[372] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box744
		rightTrackModel[373] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box745
		rightTrackModel[374] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box746
		rightTrackModel[375] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box747
		rightTrackModel[376] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box748
		rightTrackModel[377] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box749
		rightTrackModel[378] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box756
		rightTrackModel[379] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box757
		rightTrackModel[380] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box758
		rightTrackModel[381] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box759
		rightTrackModel[382] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box760
		rightTrackModel[383] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box761
		rightTrackModel[384] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box768
		rightTrackModel[385] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box769
		rightTrackModel[386] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box770
		rightTrackModel[387] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box771
		rightTrackModel[388] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box772
		rightTrackModel[389] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box773
		rightTrackModel[390] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box780
		rightTrackModel[391] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box781
		rightTrackModel[392] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box782
		rightTrackModel[393] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box783
		rightTrackModel[394] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box784
		rightTrackModel[395] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box785
		rightTrackModel[396] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box792
		rightTrackModel[397] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box793
		rightTrackModel[398] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box794
		rightTrackModel[399] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box795
		rightTrackModel[400] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box796
		rightTrackModel[401] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box797
		rightTrackModel[402] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box804
		rightTrackModel[403] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box805
		rightTrackModel[404] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box806
		rightTrackModel[405] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box807
		rightTrackModel[406] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box808
		rightTrackModel[407] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box809
		rightTrackModel[408] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box816
		rightTrackModel[409] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box817
		rightTrackModel[410] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box818
		rightTrackModel[411] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box819
		rightTrackModel[412] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box820
		rightTrackModel[413] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box821
		rightTrackModel[414] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box828
		rightTrackModel[415] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box829
		rightTrackModel[416] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box830
		rightTrackModel[417] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box831
		rightTrackModel[418] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box832
		rightTrackModel[419] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box833
		rightTrackModel[420] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box840
		rightTrackModel[421] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box841
		rightTrackModel[422] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box842
		rightTrackModel[423] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box843
		rightTrackModel[424] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box844
		rightTrackModel[425] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box845
		rightTrackModel[426] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box852
		rightTrackModel[427] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box853
		rightTrackModel[428] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box854
		rightTrackModel[429] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box855
		rightTrackModel[430] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box856
		rightTrackModel[431] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box857
		rightTrackModel[432] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box864
		rightTrackModel[433] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box865
		rightTrackModel[434] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box866
		rightTrackModel[435] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box867
		rightTrackModel[436] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box868
		rightTrackModel[437] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box869
		rightTrackModel[438] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box876
		rightTrackModel[439] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box877
		rightTrackModel[440] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box878
		rightTrackModel[441] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box879
		rightTrackModel[442] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box880
		rightTrackModel[443] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box881
		rightTrackModel[444] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box888
		rightTrackModel[445] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box889
		rightTrackModel[446] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box890
		rightTrackModel[447] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box891
		rightTrackModel[448] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box892
		rightTrackModel[449] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box893
		rightTrackModel[450] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box900
		rightTrackModel[451] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box901
		rightTrackModel[452] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box902
		rightTrackModel[453] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box903
		rightTrackModel[454] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box904
		rightTrackModel[455] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box905
		rightTrackModel[456] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box912
		rightTrackModel[457] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box913
		rightTrackModel[458] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box914
		rightTrackModel[459] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box915
		rightTrackModel[460] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box916
		rightTrackModel[461] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box917
		rightTrackModel[462] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box924
		rightTrackModel[463] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box925
		rightTrackModel[464] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box926
		rightTrackModel[465] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box927
		rightTrackModel[466] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box928
		rightTrackModel[467] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box929
		rightTrackModel[468] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box936
		rightTrackModel[469] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box937
		rightTrackModel[470] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box938
		rightTrackModel[471] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box939
		rightTrackModel[472] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box940
		rightTrackModel[473] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box941
		rightTrackModel[474] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box948
		rightTrackModel[475] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box949
		rightTrackModel[476] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box950
		rightTrackModel[477] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box951
		rightTrackModel[478] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box952
		rightTrackModel[479] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box953
		rightTrackModel[480] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box960
		rightTrackModel[481] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box961
		rightTrackModel[482] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box962
		rightTrackModel[483] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box963
		rightTrackModel[484] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box964
		rightTrackModel[485] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box965
		rightTrackModel[486] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box972
		rightTrackModel[487] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box973
		rightTrackModel[488] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box974
		rightTrackModel[489] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box975
		rightTrackModel[490] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box976
		rightTrackModel[491] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box977
		rightTrackModel[492] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box984
		rightTrackModel[493] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box985
		rightTrackModel[494] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box986
		rightTrackModel[495] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box987
		rightTrackModel[496] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box988
		rightTrackModel[497] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box989
		rightTrackModel[498] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box996
		rightTrackModel[499] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box997

		rightTrackModel[0].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		rightTrackModel[0].setRotationPoint(-68F, -15.5F, -32F);

		rightTrackModel[1].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		rightTrackModel[1].setRotationPoint(-68F, -15.5F, -32F);

		rightTrackModel[2].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box2
		rightTrackModel[2].setRotationPoint(-68F, -15.5F, -24F);

		rightTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		rightTrackModel[3].setRotationPoint(-68F, -15.5F, -24F);

		rightTrackModel[4].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		rightTrackModel[4].setRotationPoint(-68F, -15.5F, -28F);

		rightTrackModel[5].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		rightTrackModel[5].setRotationPoint(-68F, -15.5F, -33F);

		rightTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		rightTrackModel[6].setRotationPoint(-71F, -15.5F, -24F);
		rightTrackModel[6].rotateAngleZ = 0.64577182F;

		rightTrackModel[7].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box19
		rightTrackModel[7].setRotationPoint(-71F, -15.5F, -24F);
		rightTrackModel[7].rotateAngleZ = 0.64577182F;

		rightTrackModel[8].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		rightTrackModel[8].setRotationPoint(-71F, -15.5F, -28F);
		rightTrackModel[8].rotateAngleZ = 0.64577182F;

		rightTrackModel[9].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		rightTrackModel[9].setRotationPoint(-71F, -15.5F, -32F);
		rightTrackModel[9].rotateAngleZ = 0.64577182F;

		rightTrackModel[10].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		rightTrackModel[10].setRotationPoint(-71F, -15.5F, -32F);
		rightTrackModel[10].rotateAngleZ = 0.64577182F;

		rightTrackModel[11].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		rightTrackModel[11].setRotationPoint(-71F, -15.5F, -33F);
		rightTrackModel[11].rotateAngleZ = 0.64577182F;

		rightTrackModel[12].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		rightTrackModel[12].setRotationPoint(-73.4F, -13.7F, -24F);
		rightTrackModel[12].rotateAngleZ = 0.78539816F;

		rightTrackModel[13].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box31
		rightTrackModel[13].setRotationPoint(-73.4F, -13.7F, -24F);
		rightTrackModel[13].rotateAngleZ = 0.78539816F;

		rightTrackModel[14].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		rightTrackModel[14].setRotationPoint(-73.4F, -13.7F, -28F);
		rightTrackModel[14].rotateAngleZ = 0.78539816F;

		rightTrackModel[15].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		rightTrackModel[15].setRotationPoint(-73.4F, -13.7F, -32F);
		rightTrackModel[15].rotateAngleZ = 0.78539816F;

		rightTrackModel[16].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		rightTrackModel[16].setRotationPoint(-73.4F, -13.7F, -32F);
		rightTrackModel[16].rotateAngleZ = 0.78539816F;

		rightTrackModel[17].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		rightTrackModel[17].setRotationPoint(-73.4F, -13.7F, -33F);
		rightTrackModel[17].rotateAngleZ = 0.78539816F;

		rightTrackModel[18].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		rightTrackModel[18].setRotationPoint(-75.5F, -11.7F, -24F);
		rightTrackModel[18].rotateAngleZ = 1.11701072F;

		rightTrackModel[19].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box43
		rightTrackModel[19].setRotationPoint(-75.5F, -11.7F, -24F);
		rightTrackModel[19].rotateAngleZ = 1.11701072F;

		rightTrackModel[20].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		rightTrackModel[20].setRotationPoint(-75.5F, -11.7F, -28F);
		rightTrackModel[20].rotateAngleZ = 1.11701072F;

		rightTrackModel[21].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		rightTrackModel[21].setRotationPoint(-75.5F, -11.7F, -32F);
		rightTrackModel[21].rotateAngleZ = 1.11701072F;

		rightTrackModel[22].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		rightTrackModel[22].setRotationPoint(-75.5F, -11.7F, -32F);
		rightTrackModel[22].rotateAngleZ = 1.11701072F;

		rightTrackModel[23].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		rightTrackModel[23].setRotationPoint(-75.5F, -11.7F, -33F);
		rightTrackModel[23].rotateAngleZ = 1.11701072F;

		rightTrackModel[24].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		rightTrackModel[24].setRotationPoint(-76.8F, -9F, -24F);
		rightTrackModel[24].rotateAngleZ = 1.57079633F;

		rightTrackModel[25].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box55
		rightTrackModel[25].setRotationPoint(-76.8F, -9F, -24F);
		rightTrackModel[25].rotateAngleZ = 1.57079633F;

		rightTrackModel[26].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		rightTrackModel[26].setRotationPoint(-76.8F, -9F, -28F);
		rightTrackModel[26].rotateAngleZ = 1.57079633F;

		rightTrackModel[27].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		rightTrackModel[27].setRotationPoint(-76.8F, -9F, -32F);
		rightTrackModel[27].rotateAngleZ = 1.57079633F;

		rightTrackModel[28].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		rightTrackModel[28].setRotationPoint(-76.8F, -9F, -32F);
		rightTrackModel[28].rotateAngleZ = 1.57079633F;

		rightTrackModel[29].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		rightTrackModel[29].setRotationPoint(-76.8F, -9F, -33F);
		rightTrackModel[29].rotateAngleZ = 1.57079633F;

		rightTrackModel[30].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		rightTrackModel[30].setRotationPoint(-76.8F, -6F, -24F);
		rightTrackModel[30].rotateAngleZ = 1.71042267F;

		rightTrackModel[31].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box67
		rightTrackModel[31].setRotationPoint(-76.8F, -6F, -24F);
		rightTrackModel[31].rotateAngleZ = 1.71042267F;

		rightTrackModel[32].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		rightTrackModel[32].setRotationPoint(-76.8F, -6F, -28F);
		rightTrackModel[32].rotateAngleZ = 1.71042267F;

		rightTrackModel[33].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		rightTrackModel[33].setRotationPoint(-76.8F, -6F, -32F);
		rightTrackModel[33].rotateAngleZ = 1.71042267F;

		rightTrackModel[34].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		rightTrackModel[34].setRotationPoint(-76.8F, -6F, -32F);
		rightTrackModel[34].rotateAngleZ = 1.71042267F;

		rightTrackModel[35].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		rightTrackModel[35].setRotationPoint(-76.8F, -6F, -33F);
		rightTrackModel[35].rotateAngleZ = 1.71042267F;

		rightTrackModel[36].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		rightTrackModel[36].setRotationPoint(-76.4F, -3F, -24F);
		rightTrackModel[36].rotateAngleZ = 2.37364778F;

		rightTrackModel[37].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box79
		rightTrackModel[37].setRotationPoint(-76.4F, -3F, -24F);
		rightTrackModel[37].rotateAngleZ = 2.37364778F;

		rightTrackModel[38].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		rightTrackModel[38].setRotationPoint(-76.4F, -3F, -28F);
		rightTrackModel[38].rotateAngleZ = 2.37364778F;

		rightTrackModel[39].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightTrackModel[39].setRotationPoint(-76.4F, -3F, -32F);
		rightTrackModel[39].rotateAngleZ = 2.37364778F;

		rightTrackModel[40].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		rightTrackModel[40].setRotationPoint(-76.4F, -3F, -32F);
		rightTrackModel[40].rotateAngleZ = 2.37364778F;

		rightTrackModel[41].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		rightTrackModel[41].setRotationPoint(-76.4F, -3F, -33F);
		rightTrackModel[41].rotateAngleZ = 2.37364778F;

		rightTrackModel[42].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		rightTrackModel[42].setRotationPoint(-74.4F, -1F, -24F);
		rightTrackModel[42].rotateAngleZ = 2.37364778F;

		rightTrackModel[43].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box91
		rightTrackModel[43].setRotationPoint(-74.4F, -1F, -24F);
		rightTrackModel[43].rotateAngleZ = 2.37364778F;

		rightTrackModel[44].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		rightTrackModel[44].setRotationPoint(-74.4F, -1F, -28F);
		rightTrackModel[44].rotateAngleZ = 2.37364778F;

		rightTrackModel[45].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		rightTrackModel[45].setRotationPoint(-74.4F, -1F, -32F);
		rightTrackModel[45].rotateAngleZ = 2.37364778F;

		rightTrackModel[46].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		rightTrackModel[46].setRotationPoint(-74.4F, -1F, -32F);
		rightTrackModel[46].rotateAngleZ = 2.37364778F;

		rightTrackModel[47].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		rightTrackModel[47].setRotationPoint(-74.4F, -1F, -33F);
		rightTrackModel[47].rotateAngleZ = 2.37364778F;

		rightTrackModel[48].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		rightTrackModel[48].setRotationPoint(-72.4F, 1F, -24F);
		rightTrackModel[48].rotateAngleZ = 2.67035376F;

		rightTrackModel[49].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box103
		rightTrackModel[49].setRotationPoint(-72.4F, 1F, -24F);
		rightTrackModel[49].rotateAngleZ = 2.67035376F;

		rightTrackModel[50].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		rightTrackModel[50].setRotationPoint(-72.4F, 1F, -28F);
		rightTrackModel[50].rotateAngleZ = 2.67035376F;

		rightTrackModel[51].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		rightTrackModel[51].setRotationPoint(-72.4F, 1F, -32F);
		rightTrackModel[51].rotateAngleZ = 2.67035376F;

		rightTrackModel[52].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		rightTrackModel[52].setRotationPoint(-72.4F, 1F, -32F);
		rightTrackModel[52].rotateAngleZ = 2.67035376F;

		rightTrackModel[53].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		rightTrackModel[53].setRotationPoint(-72.4F, 1F, -33F);
		rightTrackModel[53].rotateAngleZ = 2.67035376F;

		rightTrackModel[54].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
		rightTrackModel[54].setRotationPoint(-69.8F, 2.3F, -24F);
		rightTrackModel[54].rotateAngleZ = 2.74016693F;

		rightTrackModel[55].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box115
		rightTrackModel[55].setRotationPoint(-69.8F, 2.3F, -24F);
		rightTrackModel[55].rotateAngleZ = 2.74016693F;

		rightTrackModel[56].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		rightTrackModel[56].setRotationPoint(-69.8F, 2.3F, -28F);
		rightTrackModel[56].rotateAngleZ = 2.74016693F;

		rightTrackModel[57].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		rightTrackModel[57].setRotationPoint(-69.8F, 2.3F, -32F);
		rightTrackModel[57].rotateAngleZ = 2.74016693F;

		rightTrackModel[58].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		rightTrackModel[58].setRotationPoint(-69.8F, 2.3F, -32F);
		rightTrackModel[58].rotateAngleZ = 2.74016693F;

		rightTrackModel[59].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		rightTrackModel[59].setRotationPoint(-69.8F, 2.3F, -33F);
		rightTrackModel[59].rotateAngleZ = 2.74016693F;

		rightTrackModel[60].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		rightTrackModel[60].setRotationPoint(-67.1F, 3.5F, -24F);
		rightTrackModel[60].rotateAngleZ = 2.74016693F;

		rightTrackModel[61].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box127
		rightTrackModel[61].setRotationPoint(-67.1F, 3.5F, -24F);
		rightTrackModel[61].rotateAngleZ = 2.74016693F;

		rightTrackModel[62].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		rightTrackModel[62].setRotationPoint(-67.1F, 3.5F, -28F);
		rightTrackModel[62].rotateAngleZ = 2.74016693F;

		rightTrackModel[63].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		rightTrackModel[63].setRotationPoint(-67.1F, 3.5F, -32F);
		rightTrackModel[63].rotateAngleZ = 2.74016693F;

		rightTrackModel[64].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		rightTrackModel[64].setRotationPoint(-67.1F, 3.5F, -32F);
		rightTrackModel[64].rotateAngleZ = 2.74016693F;

		rightTrackModel[65].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		rightTrackModel[65].setRotationPoint(-67.1F, 3.5F, -33F);
		rightTrackModel[65].rotateAngleZ = 2.74016693F;

		rightTrackModel[66].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		rightTrackModel[66].setRotationPoint(-64.4F, 4.7F, -24F);
		rightTrackModel[66].rotateAngleZ = 2.74016693F;

		rightTrackModel[67].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box139
		rightTrackModel[67].setRotationPoint(-64.4F, 4.7F, -24F);
		rightTrackModel[67].rotateAngleZ = 2.74016693F;

		rightTrackModel[68].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		rightTrackModel[68].setRotationPoint(-64.4F, 4.7F, -28F);
		rightTrackModel[68].rotateAngleZ = 2.74016693F;

		rightTrackModel[69].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		rightTrackModel[69].setRotationPoint(-64.4F, 4.7F, -32F);
		rightTrackModel[69].rotateAngleZ = 2.74016693F;

		rightTrackModel[70].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		rightTrackModel[70].setRotationPoint(-64.4F, 4.7F, -32F);
		rightTrackModel[70].rotateAngleZ = 2.74016693F;

		rightTrackModel[71].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		rightTrackModel[71].setRotationPoint(-64.4F, 4.7F, -33F);
		rightTrackModel[71].rotateAngleZ = 2.74016693F;

		rightTrackModel[72].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		rightTrackModel[72].setRotationPoint(-61.7F, 5.9F, -24F);
		rightTrackModel[72].rotateAngleZ = 2.7925268F;

		rightTrackModel[73].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box151
		rightTrackModel[73].setRotationPoint(-61.7F, 5.9F, -24F);
		rightTrackModel[73].rotateAngleZ = 2.7925268F;

		rightTrackModel[74].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		rightTrackModel[74].setRotationPoint(-61.7F, 5.9F, -28F);
		rightTrackModel[74].rotateAngleZ = 2.7925268F;

		rightTrackModel[75].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		rightTrackModel[75].setRotationPoint(-61.7F, 5.9F, -32F);
		rightTrackModel[75].rotateAngleZ = 2.7925268F;

		rightTrackModel[76].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		rightTrackModel[76].setRotationPoint(-61.7F, 5.9F, -32F);
		rightTrackModel[76].rotateAngleZ = 2.7925268F;

		rightTrackModel[77].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		rightTrackModel[77].setRotationPoint(-61.7F, 5.9F, -33F);
		rightTrackModel[77].rotateAngleZ = 2.7925268F;

		rightTrackModel[78].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		rightTrackModel[78].setRotationPoint(-58.9F, 7F, -24F);
		rightTrackModel[78].rotateAngleZ = 2.7925268F;

		rightTrackModel[79].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box163
		rightTrackModel[79].setRotationPoint(-58.9F, 7F, -24F);
		rightTrackModel[79].rotateAngleZ = 2.7925268F;

		rightTrackModel[80].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		rightTrackModel[80].setRotationPoint(-58.9F, 7F, -28F);
		rightTrackModel[80].rotateAngleZ = 2.7925268F;

		rightTrackModel[81].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		rightTrackModel[81].setRotationPoint(-58.9F, 7F, -32F);
		rightTrackModel[81].rotateAngleZ = 2.7925268F;

		rightTrackModel[82].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		rightTrackModel[82].setRotationPoint(-58.9F, 7F, -32F);
		rightTrackModel[82].rotateAngleZ = 2.7925268F;

		rightTrackModel[83].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		rightTrackModel[83].setRotationPoint(-58.9F, 7F, -33F);
		rightTrackModel[83].rotateAngleZ = 2.7925268F;

		rightTrackModel[84].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		rightTrackModel[84].setRotationPoint(-56.1F, 8F, -24F);
		rightTrackModel[84].rotateAngleZ = 2.96705973F;

		rightTrackModel[85].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box175
		rightTrackModel[85].setRotationPoint(-56.1F, 8F, -24F);
		rightTrackModel[85].rotateAngleZ = 2.96705973F;

		rightTrackModel[86].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		rightTrackModel[86].setRotationPoint(-56.1F, 8F, -28F);
		rightTrackModel[86].rotateAngleZ = 2.96705973F;

		rightTrackModel[87].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		rightTrackModel[87].setRotationPoint(-56.1F, 8F, -32F);
		rightTrackModel[87].rotateAngleZ = 2.96705973F;

		rightTrackModel[88].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		rightTrackModel[88].setRotationPoint(-56.1F, 8F, -32F);
		rightTrackModel[88].rotateAngleZ = 2.96705973F;

		rightTrackModel[89].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		rightTrackModel[89].setRotationPoint(-56.1F, 8F, -33F);
		rightTrackModel[89].rotateAngleZ = 2.96705973F;

		rightTrackModel[90].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		rightTrackModel[90].setRotationPoint(-53.1F, 8.5F, -24F);
		rightTrackModel[90].rotateAngleZ = 3.14159265F;

		rightTrackModel[91].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box187
		rightTrackModel[91].setRotationPoint(-53.1F, 8.5F, -24F);
		rightTrackModel[91].rotateAngleZ = 3.14159265F;

		rightTrackModel[92].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		rightTrackModel[92].setRotationPoint(-53.1F, 8.5F, -28F);
		rightTrackModel[92].rotateAngleZ = 3.14159265F;

		rightTrackModel[93].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		rightTrackModel[93].setRotationPoint(-53.1F, 8.5F, -32F);
		rightTrackModel[93].rotateAngleZ = 3.14159265F;

		rightTrackModel[94].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		rightTrackModel[94].setRotationPoint(-53.1F, 8.5F, -32F);
		rightTrackModel[94].rotateAngleZ = 3.14159265F;

		rightTrackModel[95].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		rightTrackModel[95].setRotationPoint(-53.1F, 8.5F, -33F);
		rightTrackModel[95].rotateAngleZ = 3.14159265F;

		rightTrackModel[96].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		rightTrackModel[96].setRotationPoint(-50.1F, 8.5F, -24F);
		rightTrackModel[96].rotateAngleZ = 3.14159265F;

		rightTrackModel[97].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box199
		rightTrackModel[97].setRotationPoint(-50.1F, 8.5F, -24F);
		rightTrackModel[97].rotateAngleZ = 3.14159265F;

		rightTrackModel[98].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		rightTrackModel[98].setRotationPoint(-50.1F, 8.5F, -28F);
		rightTrackModel[98].rotateAngleZ = 3.14159265F;

		rightTrackModel[99].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		rightTrackModel[99].setRotationPoint(-50.1F, 8.5F, -32F);
		rightTrackModel[99].rotateAngleZ = 3.14159265F;

		rightTrackModel[100].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		rightTrackModel[100].setRotationPoint(-50.1F, 8.5F, -32F);
		rightTrackModel[100].rotateAngleZ = 3.14159265F;

		rightTrackModel[101].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		rightTrackModel[101].setRotationPoint(-50.1F, 8.5F, -33F);
		rightTrackModel[101].rotateAngleZ = 3.14159265F;

		rightTrackModel[102].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		rightTrackModel[102].setRotationPoint(-47.1F, 8.5F, -24F);
		rightTrackModel[102].rotateAngleZ = 3.14159265F;

		rightTrackModel[103].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box211
		rightTrackModel[103].setRotationPoint(-47.1F, 8.5F, -24F);
		rightTrackModel[103].rotateAngleZ = 3.14159265F;

		rightTrackModel[104].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		rightTrackModel[104].setRotationPoint(-47.1F, 8.5F, -28F);
		rightTrackModel[104].rotateAngleZ = 3.14159265F;

		rightTrackModel[105].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		rightTrackModel[105].setRotationPoint(-47.1F, 8.5F, -32F);
		rightTrackModel[105].rotateAngleZ = 3.14159265F;

		rightTrackModel[106].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box214
		rightTrackModel[106].setRotationPoint(-47.1F, 8.5F, -32F);
		rightTrackModel[106].rotateAngleZ = 3.14159265F;

		rightTrackModel[107].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		rightTrackModel[107].setRotationPoint(-47.1F, 8.5F, -33F);
		rightTrackModel[107].rotateAngleZ = 3.14159265F;

		rightTrackModel[108].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		rightTrackModel[108].setRotationPoint(-44.1F, 8.5F, -24F);
		rightTrackModel[108].rotateAngleZ = 3.14159265F;

		rightTrackModel[109].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box223
		rightTrackModel[109].setRotationPoint(-44.1F, 8.5F, -24F);
		rightTrackModel[109].rotateAngleZ = 3.14159265F;

		rightTrackModel[110].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		rightTrackModel[110].setRotationPoint(-44.1F, 8.5F, -28F);
		rightTrackModel[110].rotateAngleZ = 3.14159265F;

		rightTrackModel[111].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box225
		rightTrackModel[111].setRotationPoint(-44.1F, 8.5F, -32F);
		rightTrackModel[111].rotateAngleZ = 3.14159265F;

		rightTrackModel[112].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		rightTrackModel[112].setRotationPoint(-44.1F, 8.5F, -32F);
		rightTrackModel[112].rotateAngleZ = 3.14159265F;

		rightTrackModel[113].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		rightTrackModel[113].setRotationPoint(-44.1F, 8.5F, -33F);
		rightTrackModel[113].rotateAngleZ = 3.14159265F;

		rightTrackModel[114].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		rightTrackModel[114].setRotationPoint(-41.1F, 8.5F, -24F);
		rightTrackModel[114].rotateAngleZ = 3.14159265F;

		rightTrackModel[115].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box235
		rightTrackModel[115].setRotationPoint(-41.1F, 8.5F, -24F);
		rightTrackModel[115].rotateAngleZ = 3.14159265F;

		rightTrackModel[116].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box236
		rightTrackModel[116].setRotationPoint(-41.1F, 8.5F, -28F);
		rightTrackModel[116].rotateAngleZ = 3.14159265F;

		rightTrackModel[117].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box237
		rightTrackModel[117].setRotationPoint(-41.1F, 8.5F, -32F);
		rightTrackModel[117].rotateAngleZ = 3.14159265F;

		rightTrackModel[118].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box238
		rightTrackModel[118].setRotationPoint(-41.1F, 8.5F, -32F);
		rightTrackModel[118].rotateAngleZ = 3.14159265F;

		rightTrackModel[119].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		rightTrackModel[119].setRotationPoint(-41.1F, 8.5F, -33F);
		rightTrackModel[119].rotateAngleZ = 3.14159265F;

		rightTrackModel[120].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box246
		rightTrackModel[120].setRotationPoint(-38.1F, 8.5F, -24F);
		rightTrackModel[120].rotateAngleZ = 3.14159265F;

		rightTrackModel[121].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box247
		rightTrackModel[121].setRotationPoint(-38.1F, 8.5F, -24F);
		rightTrackModel[121].rotateAngleZ = 3.14159265F;

		rightTrackModel[122].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box248
		rightTrackModel[122].setRotationPoint(-38.1F, 8.5F, -28F);
		rightTrackModel[122].rotateAngleZ = 3.14159265F;

		rightTrackModel[123].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		rightTrackModel[123].setRotationPoint(-38.1F, 8.5F, -32F);
		rightTrackModel[123].rotateAngleZ = 3.14159265F;

		rightTrackModel[124].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
		rightTrackModel[124].setRotationPoint(-38.1F, 8.5F, -32F);
		rightTrackModel[124].rotateAngleZ = 3.14159265F;

		rightTrackModel[125].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box251
		rightTrackModel[125].setRotationPoint(-38.1F, 8.5F, -33F);
		rightTrackModel[125].rotateAngleZ = 3.14159265F;

		rightTrackModel[126].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box258
		rightTrackModel[126].setRotationPoint(-35.1F, 8.5F, -24F);
		rightTrackModel[126].rotateAngleZ = 3.14159265F;

		rightTrackModel[127].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box259
		rightTrackModel[127].setRotationPoint(-35.1F, 8.5F, -24F);
		rightTrackModel[127].rotateAngleZ = 3.14159265F;

		rightTrackModel[128].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box260
		rightTrackModel[128].setRotationPoint(-35.1F, 8.5F, -28F);
		rightTrackModel[128].rotateAngleZ = 3.14159265F;

		rightTrackModel[129].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		rightTrackModel[129].setRotationPoint(-35.1F, 8.5F, -32F);
		rightTrackModel[129].rotateAngleZ = 3.14159265F;

		rightTrackModel[130].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		rightTrackModel[130].setRotationPoint(-35.1F, 8.5F, -32F);
		rightTrackModel[130].rotateAngleZ = 3.14159265F;

		rightTrackModel[131].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box263
		rightTrackModel[131].setRotationPoint(-35.1F, 8.5F, -33F);
		rightTrackModel[131].rotateAngleZ = 3.14159265F;

		rightTrackModel[132].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box270
		rightTrackModel[132].setRotationPoint(-32.1F, 8.5F, -24F);
		rightTrackModel[132].rotateAngleZ = 3.14159265F;

		rightTrackModel[133].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box271
		rightTrackModel[133].setRotationPoint(-32.1F, 8.5F, -24F);
		rightTrackModel[133].rotateAngleZ = 3.14159265F;

		rightTrackModel[134].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box272
		rightTrackModel[134].setRotationPoint(-32.1F, 8.5F, -28F);
		rightTrackModel[134].rotateAngleZ = 3.14159265F;

		rightTrackModel[135].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box273
		rightTrackModel[135].setRotationPoint(-32.1F, 8.5F, -32F);
		rightTrackModel[135].rotateAngleZ = 3.14159265F;

		rightTrackModel[136].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box274
		rightTrackModel[136].setRotationPoint(-32.1F, 8.5F, -32F);
		rightTrackModel[136].rotateAngleZ = 3.14159265F;

		rightTrackModel[137].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box275
		rightTrackModel[137].setRotationPoint(-32.1F, 8.5F, -33F);
		rightTrackModel[137].rotateAngleZ = 3.14159265F;

		rightTrackModel[138].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box282
		rightTrackModel[138].setRotationPoint(-29.1F, 8.5F, -24F);
		rightTrackModel[138].rotateAngleZ = 3.14159265F;

		rightTrackModel[139].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box283
		rightTrackModel[139].setRotationPoint(-29.1F, 8.5F, -24F);
		rightTrackModel[139].rotateAngleZ = 3.14159265F;

		rightTrackModel[140].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box284
		rightTrackModel[140].setRotationPoint(-29.1F, 8.5F, -28F);
		rightTrackModel[140].rotateAngleZ = 3.14159265F;

		rightTrackModel[141].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box285
		rightTrackModel[141].setRotationPoint(-29.1F, 8.5F, -32F);
		rightTrackModel[141].rotateAngleZ = 3.14159265F;

		rightTrackModel[142].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box286
		rightTrackModel[142].setRotationPoint(-29.1F, 8.5F, -32F);
		rightTrackModel[142].rotateAngleZ = 3.14159265F;

		rightTrackModel[143].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		rightTrackModel[143].setRotationPoint(-29.1F, 8.5F, -33F);
		rightTrackModel[143].rotateAngleZ = 3.14159265F;

		rightTrackModel[144].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		rightTrackModel[144].setRotationPoint(-26.1F, 8.5F, -24F);
		rightTrackModel[144].rotateAngleZ = 3.14159265F;

		rightTrackModel[145].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box295
		rightTrackModel[145].setRotationPoint(-26.1F, 8.5F, -24F);
		rightTrackModel[145].rotateAngleZ = 3.14159265F;

		rightTrackModel[146].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		rightTrackModel[146].setRotationPoint(-26.1F, 8.5F, -28F);
		rightTrackModel[146].rotateAngleZ = 3.14159265F;

		rightTrackModel[147].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		rightTrackModel[147].setRotationPoint(-26.1F, 8.5F, -32F);
		rightTrackModel[147].rotateAngleZ = 3.14159265F;

		rightTrackModel[148].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box298
		rightTrackModel[148].setRotationPoint(-26.1F, 8.5F, -32F);
		rightTrackModel[148].rotateAngleZ = 3.14159265F;

		rightTrackModel[149].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		rightTrackModel[149].setRotationPoint(-26.1F, 8.5F, -33F);
		rightTrackModel[149].rotateAngleZ = 3.14159265F;

		rightTrackModel[150].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box306
		rightTrackModel[150].setRotationPoint(-23.1F, 8.5F, -24F);
		rightTrackModel[150].rotateAngleZ = 3.14159265F;

		rightTrackModel[151].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box307
		rightTrackModel[151].setRotationPoint(-23.1F, 8.5F, -24F);
		rightTrackModel[151].rotateAngleZ = 3.14159265F;

		rightTrackModel[152].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box308
		rightTrackModel[152].setRotationPoint(-23.1F, 8.5F, -28F);
		rightTrackModel[152].rotateAngleZ = 3.14159265F;

		rightTrackModel[153].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box309
		rightTrackModel[153].setRotationPoint(-23.1F, 8.5F, -32F);
		rightTrackModel[153].rotateAngleZ = 3.14159265F;

		rightTrackModel[154].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box310
		rightTrackModel[154].setRotationPoint(-23.1F, 8.5F, -32F);
		rightTrackModel[154].rotateAngleZ = 3.14159265F;

		rightTrackModel[155].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box311
		rightTrackModel[155].setRotationPoint(-23.1F, 8.5F, -33F);
		rightTrackModel[155].rotateAngleZ = 3.14159265F;

		rightTrackModel[156].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		rightTrackModel[156].setRotationPoint(-20.1F, 8.5F, -24F);
		rightTrackModel[156].rotateAngleZ = 3.14159265F;

		rightTrackModel[157].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box319
		rightTrackModel[157].setRotationPoint(-20.1F, 8.5F, -24F);
		rightTrackModel[157].rotateAngleZ = 3.14159265F;

		rightTrackModel[158].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box320
		rightTrackModel[158].setRotationPoint(-20.1F, 8.5F, -28F);
		rightTrackModel[158].rotateAngleZ = 3.14159265F;

		rightTrackModel[159].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box321
		rightTrackModel[159].setRotationPoint(-20.1F, 8.5F, -32F);
		rightTrackModel[159].rotateAngleZ = 3.14159265F;

		rightTrackModel[160].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		rightTrackModel[160].setRotationPoint(-20.1F, 8.5F, -32F);
		rightTrackModel[160].rotateAngleZ = 3.14159265F;

		rightTrackModel[161].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		rightTrackModel[161].setRotationPoint(-20.1F, 8.5F, -33F);
		rightTrackModel[161].rotateAngleZ = 3.14159265F;

		rightTrackModel[162].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box330
		rightTrackModel[162].setRotationPoint(-17.1F, 8.5F, -24F);
		rightTrackModel[162].rotateAngleZ = 3.14159265F;

		rightTrackModel[163].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box331
		rightTrackModel[163].setRotationPoint(-17.1F, 8.5F, -24F);
		rightTrackModel[163].rotateAngleZ = 3.14159265F;

		rightTrackModel[164].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box332
		rightTrackModel[164].setRotationPoint(-17.1F, 8.5F, -28F);
		rightTrackModel[164].rotateAngleZ = 3.14159265F;

		rightTrackModel[165].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box333
		rightTrackModel[165].setRotationPoint(-17.1F, 8.5F, -32F);
		rightTrackModel[165].rotateAngleZ = 3.14159265F;

		rightTrackModel[166].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box334
		rightTrackModel[166].setRotationPoint(-17.1F, 8.5F, -32F);
		rightTrackModel[166].rotateAngleZ = 3.14159265F;

		rightTrackModel[167].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box335
		rightTrackModel[167].setRotationPoint(-17.1F, 8.5F, -33F);
		rightTrackModel[167].rotateAngleZ = 3.14159265F;

		rightTrackModel[168].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box342
		rightTrackModel[168].setRotationPoint(-14.1F, 8.5F, -24F);
		rightTrackModel[168].rotateAngleZ = 3.14159265F;

		rightTrackModel[169].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box343
		rightTrackModel[169].setRotationPoint(-14.1F, 8.5F, -24F);
		rightTrackModel[169].rotateAngleZ = 3.14159265F;

		rightTrackModel[170].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box344
		rightTrackModel[170].setRotationPoint(-14.1F, 8.5F, -28F);
		rightTrackModel[170].rotateAngleZ = 3.14159265F;

		rightTrackModel[171].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box345
		rightTrackModel[171].setRotationPoint(-14.1F, 8.5F, -32F);
		rightTrackModel[171].rotateAngleZ = 3.14159265F;

		rightTrackModel[172].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box346
		rightTrackModel[172].setRotationPoint(-14.1F, 8.5F, -32F);
		rightTrackModel[172].rotateAngleZ = 3.14159265F;

		rightTrackModel[173].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box347
		rightTrackModel[173].setRotationPoint(-14.1F, 8.5F, -33F);
		rightTrackModel[173].rotateAngleZ = 3.14159265F;

		rightTrackModel[174].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box348
		rightTrackModel[174].setRotationPoint(-11.1F, 8.5F, -33F);
		rightTrackModel[174].rotateAngleZ = 3.14159265F;

		rightTrackModel[175].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		rightTrackModel[175].setRotationPoint(-11.1F, 8.5F, -32F);
		rightTrackModel[175].rotateAngleZ = 3.14159265F;

		rightTrackModel[176].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box350
		rightTrackModel[176].setRotationPoint(-11.1F, 8.5F, -32F);
		rightTrackModel[176].rotateAngleZ = 3.14159265F;

		rightTrackModel[177].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box351
		rightTrackModel[177].setRotationPoint(-11.1F, 8.5F, -28F);
		rightTrackModel[177].rotateAngleZ = 3.14159265F;

		rightTrackModel[178].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box352
		rightTrackModel[178].setRotationPoint(-11.1F, 8.5F, -24F);
		rightTrackModel[178].rotateAngleZ = 3.14159265F;

		rightTrackModel[179].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		rightTrackModel[179].setRotationPoint(-11.1F, 8.5F, -24F);
		rightTrackModel[179].rotateAngleZ = 3.14159265F;

		rightTrackModel[180].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box360
		rightTrackModel[180].setRotationPoint(-8.1F, 8.5F, -33F);
		rightTrackModel[180].rotateAngleZ = 3.14159265F;

		rightTrackModel[181].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box361
		rightTrackModel[181].setRotationPoint(-8.1F, 8.5F, -32F);
		rightTrackModel[181].rotateAngleZ = 3.14159265F;

		rightTrackModel[182].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box362
		rightTrackModel[182].setRotationPoint(-8.1F, 8.5F, -32F);
		rightTrackModel[182].rotateAngleZ = 3.14159265F;

		rightTrackModel[183].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box363
		rightTrackModel[183].setRotationPoint(-8.1F, 8.5F, -28F);
		rightTrackModel[183].rotateAngleZ = 3.14159265F;

		rightTrackModel[184].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box364
		rightTrackModel[184].setRotationPoint(-8.1F, 8.5F, -24F);
		rightTrackModel[184].rotateAngleZ = 3.14159265F;

		rightTrackModel[185].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		rightTrackModel[185].setRotationPoint(-8.1F, 8.5F, -24F);
		rightTrackModel[185].rotateAngleZ = 3.14159265F;

		rightTrackModel[186].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box372
		rightTrackModel[186].setRotationPoint(-5.1F, 8.5F, -33F);
		rightTrackModel[186].rotateAngleZ = 3.14159265F;

		rightTrackModel[187].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box373
		rightTrackModel[187].setRotationPoint(-5.1F, 8.5F, -32F);
		rightTrackModel[187].rotateAngleZ = 3.14159265F;

		rightTrackModel[188].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box374
		rightTrackModel[188].setRotationPoint(-5.1F, 8.5F, -32F);
		rightTrackModel[188].rotateAngleZ = 3.14159265F;

		rightTrackModel[189].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box375
		rightTrackModel[189].setRotationPoint(-5.1F, 8.5F, -28F);
		rightTrackModel[189].rotateAngleZ = 3.14159265F;

		rightTrackModel[190].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box376
		rightTrackModel[190].setRotationPoint(-5.1F, 8.5F, -24F);
		rightTrackModel[190].rotateAngleZ = 3.14159265F;

		rightTrackModel[191].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box377
		rightTrackModel[191].setRotationPoint(-5.1F, 8.5F, -24F);
		rightTrackModel[191].rotateAngleZ = 3.14159265F;

		rightTrackModel[192].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box384
		rightTrackModel[192].setRotationPoint(-2.1F, 8.5F, -33F);
		rightTrackModel[192].rotateAngleZ = 3.14159265F;

		rightTrackModel[193].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box385
		rightTrackModel[193].setRotationPoint(-2.1F, 8.5F, -32F);
		rightTrackModel[193].rotateAngleZ = 3.14159265F;

		rightTrackModel[194].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box386
		rightTrackModel[194].setRotationPoint(-2.1F, 8.5F, -32F);
		rightTrackModel[194].rotateAngleZ = 3.14159265F;

		rightTrackModel[195].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box387
		rightTrackModel[195].setRotationPoint(-2.1F, 8.5F, -28F);
		rightTrackModel[195].rotateAngleZ = 3.14159265F;

		rightTrackModel[196].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box388
		rightTrackModel[196].setRotationPoint(-2.1F, 8.5F, -24F);
		rightTrackModel[196].rotateAngleZ = 3.14159265F;

		rightTrackModel[197].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box389
		rightTrackModel[197].setRotationPoint(-2.1F, 8.5F, -24F);
		rightTrackModel[197].rotateAngleZ = 3.14159265F;

		rightTrackModel[198].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box396
		rightTrackModel[198].setRotationPoint(0.9F, 8.5F, -33F);
		rightTrackModel[198].rotateAngleZ = 3.14159265F;

		rightTrackModel[199].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box397
		rightTrackModel[199].setRotationPoint(0.9F, 8.5F, -32F);
		rightTrackModel[199].rotateAngleZ = 3.14159265F;

		rightTrackModel[200].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box398
		rightTrackModel[200].setRotationPoint(0.9F, 8.5F, -32F);
		rightTrackModel[200].rotateAngleZ = 3.14159265F;

		rightTrackModel[201].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box399
		rightTrackModel[201].setRotationPoint(0.9F, 8.5F, -28F);
		rightTrackModel[201].rotateAngleZ = 3.14159265F;

		rightTrackModel[202].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box400
		rightTrackModel[202].setRotationPoint(0.9F, 8.5F, -24F);
		rightTrackModel[202].rotateAngleZ = 3.14159265F;

		rightTrackModel[203].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box401
		rightTrackModel[203].setRotationPoint(0.9F, 8.5F, -24F);
		rightTrackModel[203].rotateAngleZ = 3.14159265F;

		rightTrackModel[204].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		rightTrackModel[204].setRotationPoint(3.9F, 8.5F, -33F);
		rightTrackModel[204].rotateAngleZ = 3.14159265F;

		rightTrackModel[205].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		rightTrackModel[205].setRotationPoint(3.9F, 8.5F, -32F);
		rightTrackModel[205].rotateAngleZ = 3.14159265F;

		rightTrackModel[206].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		rightTrackModel[206].setRotationPoint(3.9F, 8.5F, -32F);
		rightTrackModel[206].rotateAngleZ = 3.14159265F;

		rightTrackModel[207].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box411
		rightTrackModel[207].setRotationPoint(3.9F, 8.5F, -28F);
		rightTrackModel[207].rotateAngleZ = 3.14159265F;

		rightTrackModel[208].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box412
		rightTrackModel[208].setRotationPoint(3.9F, 8.5F, -24F);
		rightTrackModel[208].rotateAngleZ = 3.14159265F;

		rightTrackModel[209].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		rightTrackModel[209].setRotationPoint(3.9F, 8.5F, -24F);
		rightTrackModel[209].rotateAngleZ = 3.14159265F;

		rightTrackModel[210].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		rightTrackModel[210].setRotationPoint(6.9F, 8.5F, -33F);
		rightTrackModel[210].rotateAngleZ = 3.14159265F;

		rightTrackModel[211].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		rightTrackModel[211].setRotationPoint(6.9F, 8.5F, -32F);
		rightTrackModel[211].rotateAngleZ = 3.14159265F;

		rightTrackModel[212].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		rightTrackModel[212].setRotationPoint(6.9F, 8.5F, -32F);
		rightTrackModel[212].rotateAngleZ = 3.14159265F;

		rightTrackModel[213].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box423
		rightTrackModel[213].setRotationPoint(6.9F, 8.5F, -28F);
		rightTrackModel[213].rotateAngleZ = 3.14159265F;

		rightTrackModel[214].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box424
		rightTrackModel[214].setRotationPoint(6.9F, 8.5F, -24F);
		rightTrackModel[214].rotateAngleZ = 3.14159265F;

		rightTrackModel[215].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box425
		rightTrackModel[215].setRotationPoint(6.9F, 8.5F, -24F);
		rightTrackModel[215].rotateAngleZ = 3.14159265F;

		rightTrackModel[216].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box432
		rightTrackModel[216].setRotationPoint(9.9F, 8.5F, -33F);
		rightTrackModel[216].rotateAngleZ = 3.14159265F;

		rightTrackModel[217].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box433
		rightTrackModel[217].setRotationPoint(9.9F, 8.5F, -32F);
		rightTrackModel[217].rotateAngleZ = 3.14159265F;

		rightTrackModel[218].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box434
		rightTrackModel[218].setRotationPoint(9.9F, 8.5F, -32F);
		rightTrackModel[218].rotateAngleZ = 3.14159265F;

		rightTrackModel[219].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box435
		rightTrackModel[219].setRotationPoint(9.9F, 8.5F, -28F);
		rightTrackModel[219].rotateAngleZ = 3.14159265F;

		rightTrackModel[220].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box436
		rightTrackModel[220].setRotationPoint(9.9F, 8.5F, -24F);
		rightTrackModel[220].rotateAngleZ = 3.14159265F;

		rightTrackModel[221].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
		rightTrackModel[221].setRotationPoint(9.9F, 8.5F, -24F);
		rightTrackModel[221].rotateAngleZ = 3.14159265F;

		rightTrackModel[222].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		rightTrackModel[222].setRotationPoint(12.9F, 8.5F, -33F);
		rightTrackModel[222].rotateAngleZ = 3.14159265F;

		rightTrackModel[223].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box445
		rightTrackModel[223].setRotationPoint(12.9F, 8.5F, -32F);
		rightTrackModel[223].rotateAngleZ = 3.14159265F;

		rightTrackModel[224].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box446
		rightTrackModel[224].setRotationPoint(12.9F, 8.5F, -32F);
		rightTrackModel[224].rotateAngleZ = 3.14159265F;

		rightTrackModel[225].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box447
		rightTrackModel[225].setRotationPoint(12.9F, 8.5F, -28F);
		rightTrackModel[225].rotateAngleZ = 3.14159265F;

		rightTrackModel[226].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box448
		rightTrackModel[226].setRotationPoint(12.9F, 8.5F, -24F);
		rightTrackModel[226].rotateAngleZ = 3.14159265F;

		rightTrackModel[227].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box449
		rightTrackModel[227].setRotationPoint(12.9F, 8.5F, -24F);
		rightTrackModel[227].rotateAngleZ = 3.14159265F;

		rightTrackModel[228].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box456
		rightTrackModel[228].setRotationPoint(15.9F, 8.5F, -33F);
		rightTrackModel[228].rotateAngleZ = 3.14159265F;

		rightTrackModel[229].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
		rightTrackModel[229].setRotationPoint(15.9F, 8.5F, -32F);
		rightTrackModel[229].rotateAngleZ = 3.14159265F;

		rightTrackModel[230].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box458
		rightTrackModel[230].setRotationPoint(15.9F, 8.5F, -32F);
		rightTrackModel[230].rotateAngleZ = 3.14159265F;

		rightTrackModel[231].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box459
		rightTrackModel[231].setRotationPoint(15.9F, 8.5F, -28F);
		rightTrackModel[231].rotateAngleZ = 3.14159265F;

		rightTrackModel[232].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box460
		rightTrackModel[232].setRotationPoint(15.9F, 8.5F, -24F);
		rightTrackModel[232].rotateAngleZ = 3.14159265F;

		rightTrackModel[233].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box461
		rightTrackModel[233].setRotationPoint(15.9F, 8.5F, -24F);
		rightTrackModel[233].rotateAngleZ = 3.14159265F;

		rightTrackModel[234].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box468
		rightTrackModel[234].setRotationPoint(18.9F, 8.5F, -33F);
		rightTrackModel[234].rotateAngleZ = 3.14159265F;

		rightTrackModel[235].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box469
		rightTrackModel[235].setRotationPoint(18.9F, 8.5F, -32F);
		rightTrackModel[235].rotateAngleZ = 3.14159265F;

		rightTrackModel[236].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box470
		rightTrackModel[236].setRotationPoint(18.9F, 8.5F, -32F);
		rightTrackModel[236].rotateAngleZ = 3.14159265F;

		rightTrackModel[237].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box471
		rightTrackModel[237].setRotationPoint(18.9F, 8.5F, -28F);
		rightTrackModel[237].rotateAngleZ = 3.14159265F;

		rightTrackModel[238].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box472
		rightTrackModel[238].setRotationPoint(18.9F, 8.5F, -24F);
		rightTrackModel[238].rotateAngleZ = 3.14159265F;

		rightTrackModel[239].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box473
		rightTrackModel[239].setRotationPoint(18.9F, 8.5F, -24F);
		rightTrackModel[239].rotateAngleZ = 3.14159265F;

		rightTrackModel[240].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box480
		rightTrackModel[240].setRotationPoint(21.9F, 8.5F, -33F);
		rightTrackModel[240].rotateAngleZ = 3.14159265F;

		rightTrackModel[241].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box481
		rightTrackModel[241].setRotationPoint(21.9F, 8.5F, -32F);
		rightTrackModel[241].rotateAngleZ = 3.14159265F;

		rightTrackModel[242].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box482
		rightTrackModel[242].setRotationPoint(21.9F, 8.5F, -32F);
		rightTrackModel[242].rotateAngleZ = 3.14159265F;

		rightTrackModel[243].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box483
		rightTrackModel[243].setRotationPoint(21.9F, 8.5F, -28F);
		rightTrackModel[243].rotateAngleZ = 3.14159265F;

		rightTrackModel[244].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box484
		rightTrackModel[244].setRotationPoint(21.9F, 8.5F, -24F);
		rightTrackModel[244].rotateAngleZ = 3.14159265F;

		rightTrackModel[245].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box485
		rightTrackModel[245].setRotationPoint(21.9F, 8.5F, -24F);
		rightTrackModel[245].rotateAngleZ = 3.14159265F;

		rightTrackModel[246].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box492
		rightTrackModel[246].setRotationPoint(24.9F, 8.5F, -33F);
		rightTrackModel[246].rotateAngleZ = 3.14159265F;

		rightTrackModel[247].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box493
		rightTrackModel[247].setRotationPoint(24.9F, 8.5F, -32F);
		rightTrackModel[247].rotateAngleZ = 3.14159265F;

		rightTrackModel[248].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box494
		rightTrackModel[248].setRotationPoint(24.9F, 8.5F, -32F);
		rightTrackModel[248].rotateAngleZ = 3.14159265F;

		rightTrackModel[249].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box495
		rightTrackModel[249].setRotationPoint(24.9F, 8.5F, -28F);
		rightTrackModel[249].rotateAngleZ = 3.14159265F;

		rightTrackModel[250].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box496
		rightTrackModel[250].setRotationPoint(24.9F, 8.5F, -24F);
		rightTrackModel[250].rotateAngleZ = 3.14159265F;

		rightTrackModel[251].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box497
		rightTrackModel[251].setRotationPoint(24.9F, 8.5F, -24F);
		rightTrackModel[251].rotateAngleZ = 3.14159265F;

		rightTrackModel[252].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box504
		rightTrackModel[252].setRotationPoint(27.9F, 8.5F, -33F);
		rightTrackModel[252].rotateAngleZ = 3.14159265F;

		rightTrackModel[253].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box505
		rightTrackModel[253].setRotationPoint(27.9F, 8.5F, -32F);
		rightTrackModel[253].rotateAngleZ = 3.14159265F;

		rightTrackModel[254].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box506
		rightTrackModel[254].setRotationPoint(27.9F, 8.5F, -32F);
		rightTrackModel[254].rotateAngleZ = 3.14159265F;

		rightTrackModel[255].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box507
		rightTrackModel[255].setRotationPoint(27.9F, 8.5F, -28F);
		rightTrackModel[255].rotateAngleZ = 3.14159265F;

		rightTrackModel[256].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box508
		rightTrackModel[256].setRotationPoint(27.9F, 8.5F, -24F);
		rightTrackModel[256].rotateAngleZ = 3.14159265F;

		rightTrackModel[257].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box509
		rightTrackModel[257].setRotationPoint(27.9F, 8.5F, -24F);
		rightTrackModel[257].rotateAngleZ = 3.14159265F;

		rightTrackModel[258].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box516
		rightTrackModel[258].setRotationPoint(30.9F, 8.5F, -33F);
		rightTrackModel[258].rotateAngleZ = 3.14159265F;

		rightTrackModel[259].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box517
		rightTrackModel[259].setRotationPoint(30.9F, 8.5F, -32F);
		rightTrackModel[259].rotateAngleZ = 3.14159265F;

		rightTrackModel[260].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box518
		rightTrackModel[260].setRotationPoint(30.9F, 8.5F, -32F);
		rightTrackModel[260].rotateAngleZ = 3.14159265F;

		rightTrackModel[261].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box519
		rightTrackModel[261].setRotationPoint(30.9F, 8.5F, -28F);
		rightTrackModel[261].rotateAngleZ = 3.14159265F;

		rightTrackModel[262].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box520
		rightTrackModel[262].setRotationPoint(30.9F, 8.5F, -24F);
		rightTrackModel[262].rotateAngleZ = 3.14159265F;

		rightTrackModel[263].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box521
		rightTrackModel[263].setRotationPoint(30.9F, 8.5F, -24F);
		rightTrackModel[263].rotateAngleZ = 3.14159265F;

		rightTrackModel[264].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box528
		rightTrackModel[264].setRotationPoint(33.9F, 8.5F, -33F);
		rightTrackModel[264].rotateAngleZ = 3.14159265F;

		rightTrackModel[265].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box529
		rightTrackModel[265].setRotationPoint(33.9F, 8.5F, -32F);
		rightTrackModel[265].rotateAngleZ = 3.14159265F;

		rightTrackModel[266].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box530
		rightTrackModel[266].setRotationPoint(33.9F, 8.5F, -32F);
		rightTrackModel[266].rotateAngleZ = 3.14159265F;

		rightTrackModel[267].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box531
		rightTrackModel[267].setRotationPoint(33.9F, 8.5F, -28F);
		rightTrackModel[267].rotateAngleZ = 3.14159265F;

		rightTrackModel[268].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box532
		rightTrackModel[268].setRotationPoint(33.9F, 8.5F, -24F);
		rightTrackModel[268].rotateAngleZ = 3.14159265F;

		rightTrackModel[269].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box533
		rightTrackModel[269].setRotationPoint(33.9F, 8.5F, -24F);
		rightTrackModel[269].rotateAngleZ = 3.14159265F;

		rightTrackModel[270].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box540
		rightTrackModel[270].setRotationPoint(36.9F, 8.5F, -33F);
		rightTrackModel[270].rotateAngleZ = 3.14159265F;

		rightTrackModel[271].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box541
		rightTrackModel[271].setRotationPoint(36.9F, 8.5F, -32F);
		rightTrackModel[271].rotateAngleZ = 3.14159265F;

		rightTrackModel[272].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box542
		rightTrackModel[272].setRotationPoint(36.9F, 8.5F, -32F);
		rightTrackModel[272].rotateAngleZ = 3.14159265F;

		rightTrackModel[273].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box543
		rightTrackModel[273].setRotationPoint(36.9F, 8.5F, -28F);
		rightTrackModel[273].rotateAngleZ = 3.14159265F;

		rightTrackModel[274].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box544
		rightTrackModel[274].setRotationPoint(36.9F, 8.5F, -24F);
		rightTrackModel[274].rotateAngleZ = 3.14159265F;

		rightTrackModel[275].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box545
		rightTrackModel[275].setRotationPoint(36.9F, 8.5F, -24F);
		rightTrackModel[275].rotateAngleZ = 3.14159265F;

		rightTrackModel[276].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box552
		rightTrackModel[276].setRotationPoint(39.9F, 8.5F, -33F);
		rightTrackModel[276].rotateAngleZ = 3.14159265F;

		rightTrackModel[277].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box553
		rightTrackModel[277].setRotationPoint(39.9F, 8.5F, -32F);
		rightTrackModel[277].rotateAngleZ = 3.14159265F;

		rightTrackModel[278].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box554
		rightTrackModel[278].setRotationPoint(39.9F, 8.5F, -32F);
		rightTrackModel[278].rotateAngleZ = 3.14159265F;

		rightTrackModel[279].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box555
		rightTrackModel[279].setRotationPoint(39.9F, 8.5F, -28F);
		rightTrackModel[279].rotateAngleZ = 3.14159265F;

		rightTrackModel[280].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box556
		rightTrackModel[280].setRotationPoint(39.9F, 8.5F, -24F);
		rightTrackModel[280].rotateAngleZ = 3.14159265F;

		rightTrackModel[281].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box557
		rightTrackModel[281].setRotationPoint(39.9F, 8.5F, -24F);
		rightTrackModel[281].rotateAngleZ = 3.14159265F;

		rightTrackModel[282].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box564
		rightTrackModel[282].setRotationPoint(42.9F, 8.5F, -33F);
		rightTrackModel[282].rotateAngleZ = 3.14159265F;

		rightTrackModel[283].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box565
		rightTrackModel[283].setRotationPoint(42.9F, 8.5F, -32F);
		rightTrackModel[283].rotateAngleZ = 3.14159265F;

		rightTrackModel[284].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box566
		rightTrackModel[284].setRotationPoint(42.9F, 8.5F, -32F);
		rightTrackModel[284].rotateAngleZ = 3.14159265F;

		rightTrackModel[285].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		rightTrackModel[285].setRotationPoint(42.9F, 8.5F, -28F);
		rightTrackModel[285].rotateAngleZ = 3.14159265F;

		rightTrackModel[286].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box568
		rightTrackModel[286].setRotationPoint(42.9F, 8.5F, -24F);
		rightTrackModel[286].rotateAngleZ = 3.14159265F;

		rightTrackModel[287].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box569
		rightTrackModel[287].setRotationPoint(42.9F, 8.5F, -24F);
		rightTrackModel[287].rotateAngleZ = 3.14159265F;

		rightTrackModel[288].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box576
		rightTrackModel[288].setRotationPoint(45.9F, 8.5F, -33F);
		rightTrackModel[288].rotateAngleZ = 3.54301838F;

		rightTrackModel[289].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box577
		rightTrackModel[289].setRotationPoint(45.9F, 8.5F, -32F);
		rightTrackModel[289].rotateAngleZ = 3.54301838F;

		rightTrackModel[290].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box578
		rightTrackModel[290].setRotationPoint(45.9F, 8.5F, -32F);
		rightTrackModel[290].rotateAngleZ = 3.54301838F;

		rightTrackModel[291].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box579
		rightTrackModel[291].setRotationPoint(45.9F, 8.5F, -28F);
		rightTrackModel[291].rotateAngleZ = 3.54301838F;

		rightTrackModel[292].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box580
		rightTrackModel[292].setRotationPoint(45.9F, 8.5F, -24F);
		rightTrackModel[292].rotateAngleZ = 3.54301838F;

		rightTrackModel[293].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box581
		rightTrackModel[293].setRotationPoint(45.9F, 8.5F, -24F);
		rightTrackModel[293].rotateAngleZ = 3.54301838F;

		rightTrackModel[294].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box588
		rightTrackModel[294].setRotationPoint(48.6F, 7.4F, -33F);
		rightTrackModel[294].rotateAngleZ = 3.54301838F;

		rightTrackModel[295].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box589
		rightTrackModel[295].setRotationPoint(48.6F, 7.4F, -32F);
		rightTrackModel[295].rotateAngleZ = 3.54301838F;

		rightTrackModel[296].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box590
		rightTrackModel[296].setRotationPoint(48.6F, 7.4F, -32F);
		rightTrackModel[296].rotateAngleZ = 3.54301838F;

		rightTrackModel[297].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box591
		rightTrackModel[297].setRotationPoint(48.6F, 7.4F, -28F);
		rightTrackModel[297].rotateAngleZ = 3.54301838F;

		rightTrackModel[298].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box592
		rightTrackModel[298].setRotationPoint(48.6F, 7.4F, -24F);
		rightTrackModel[298].rotateAngleZ = 3.54301838F;

		rightTrackModel[299].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box593
		rightTrackModel[299].setRotationPoint(48.6F, 7.4F, -24F);
		rightTrackModel[299].rotateAngleZ = 3.54301838F;

		rightTrackModel[300].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box600
		rightTrackModel[300].setRotationPoint(51.4F, 6.3F, -33F);
		rightTrackModel[300].rotateAngleZ = 3.64773814F;

		rightTrackModel[301].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box601
		rightTrackModel[301].setRotationPoint(51.4F, 6.3F, -32F);
		rightTrackModel[301].rotateAngleZ = 3.64773814F;

		rightTrackModel[302].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box602
		rightTrackModel[302].setRotationPoint(51.4F, 6.3F, -32F);
		rightTrackModel[302].rotateAngleZ = 3.64773814F;

		rightTrackModel[303].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box603
		rightTrackModel[303].setRotationPoint(51.4F, 6.3F, -28F);
		rightTrackModel[303].rotateAngleZ = 3.64773814F;

		rightTrackModel[304].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box604
		rightTrackModel[304].setRotationPoint(51.4F, 6.3F, -24F);
		rightTrackModel[304].rotateAngleZ = 3.64773814F;

		rightTrackModel[305].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box605
		rightTrackModel[305].setRotationPoint(51.4F, 6.3F, -24F);
		rightTrackModel[305].rotateAngleZ = 3.64773814F;

		rightTrackModel[306].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box612
		rightTrackModel[306].setRotationPoint(53.9F, 5F, -33F);
		rightTrackModel[306].rotateAngleZ = 3.64773814F;

		rightTrackModel[307].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box613
		rightTrackModel[307].setRotationPoint(53.9F, 5F, -32F);
		rightTrackModel[307].rotateAngleZ = 3.64773814F;

		rightTrackModel[308].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box614
		rightTrackModel[308].setRotationPoint(53.9F, 5F, -32F);
		rightTrackModel[308].rotateAngleZ = 3.64773814F;

		rightTrackModel[309].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box615
		rightTrackModel[309].setRotationPoint(53.9F, 5F, -28F);
		rightTrackModel[309].rotateAngleZ = 3.64773814F;

		rightTrackModel[310].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box616
		rightTrackModel[310].setRotationPoint(53.9F, 5F, -24F);
		rightTrackModel[310].rotateAngleZ = 3.64773814F;

		rightTrackModel[311].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box617
		rightTrackModel[311].setRotationPoint(53.9F, 5F, -24F);
		rightTrackModel[311].rotateAngleZ = 3.64773814F;

		rightTrackModel[312].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box624
		rightTrackModel[312].setRotationPoint(56.5F, 3.6F, -33F);
		rightTrackModel[312].rotateAngleZ = 3.64773814F;

		rightTrackModel[313].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box625
		rightTrackModel[313].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[313].rotateAngleZ = 3.64773814F;

		rightTrackModel[314].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box626
		rightTrackModel[314].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[314].rotateAngleZ = 3.64773814F;

		rightTrackModel[315].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box627
		rightTrackModel[315].setRotationPoint(56.5F, 3.6F, -28F);
		rightTrackModel[315].rotateAngleZ = 3.64773814F;

		rightTrackModel[316].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box628
		rightTrackModel[316].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[316].rotateAngleZ = 3.64773814F;

		rightTrackModel[317].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box629
		rightTrackModel[317].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[317].rotateAngleZ = 3.64773814F;

		rightTrackModel[318].addShapeBox(-6F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box636
		rightTrackModel[318].setRotationPoint(56.5F, 3.6F, -33F);
		rightTrackModel[318].rotateAngleZ = 3.64773814F;

		rightTrackModel[319].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box637
		rightTrackModel[319].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[319].rotateAngleZ = 3.64773814F;

		rightTrackModel[320].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box638
		rightTrackModel[320].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[320].rotateAngleZ = 3.64773814F;

		rightTrackModel[321].addShapeBox(-5F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box639
		rightTrackModel[321].setRotationPoint(56.5F, 3.6F, -28F);
		rightTrackModel[321].rotateAngleZ = 3.64773814F;

		rightTrackModel[322].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box640
		rightTrackModel[322].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[322].rotateAngleZ = 3.64773814F;

		rightTrackModel[323].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box641
		rightTrackModel[323].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[323].rotateAngleZ = 3.64773814F;

		rightTrackModel[324].addShapeBox(-9F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box648
		rightTrackModel[324].setRotationPoint(56.5F, 3.6F, -33F);
		rightTrackModel[324].rotateAngleZ = 3.64773814F;

		rightTrackModel[325].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box649
		rightTrackModel[325].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[325].rotateAngleZ = 3.64773814F;

		rightTrackModel[326].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box650
		rightTrackModel[326].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[326].rotateAngleZ = 3.64773814F;

		rightTrackModel[327].addShapeBox(-8F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box651
		rightTrackModel[327].setRotationPoint(56.5F, 3.6F, -28F);
		rightTrackModel[327].rotateAngleZ = 3.64773814F;

		rightTrackModel[328].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box652
		rightTrackModel[328].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[328].rotateAngleZ = 3.64773814F;

		rightTrackModel[329].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box653
		rightTrackModel[329].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[329].rotateAngleZ = 3.64773814F;

		rightTrackModel[330].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box660
		rightTrackModel[330].setRotationPoint(64.3F, -0.7F, -33F);
		rightTrackModel[330].rotateAngleZ = 3.92699082F;

		rightTrackModel[331].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box661
		rightTrackModel[331].setRotationPoint(64.3F, -0.7F, -32F);
		rightTrackModel[331].rotateAngleZ = 3.92699082F;

		rightTrackModel[332].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box662
		rightTrackModel[332].setRotationPoint(64.3F, -0.7F, -32F);
		rightTrackModel[332].rotateAngleZ = 3.92699082F;

		rightTrackModel[333].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box663
		rightTrackModel[333].setRotationPoint(64.3F, -0.7F, -28F);
		rightTrackModel[333].rotateAngleZ = 3.92699082F;

		rightTrackModel[334].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box664
		rightTrackModel[334].setRotationPoint(64.3F, -0.7F, -24F);
		rightTrackModel[334].rotateAngleZ = 3.92699082F;

		rightTrackModel[335].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box665
		rightTrackModel[335].setRotationPoint(64.3F, -0.7F, -24F);
		rightTrackModel[335].rotateAngleZ = 3.92699082F;

		rightTrackModel[336].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box672
		rightTrackModel[336].setRotationPoint(66.3F, -2.7F, -33F);
		rightTrackModel[336].rotateAngleZ = 4.13643033F;

		rightTrackModel[337].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box673
		rightTrackModel[337].setRotationPoint(66.3F, -2.7F, -32F);
		rightTrackModel[337].rotateAngleZ = 4.13643033F;

		rightTrackModel[338].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box674
		rightTrackModel[338].setRotationPoint(66.3F, -2.7F, -32F);
		rightTrackModel[338].rotateAngleZ = 4.13643033F;

		rightTrackModel[339].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box675
		rightTrackModel[339].setRotationPoint(66.3F, -2.7F, -28F);
		rightTrackModel[339].rotateAngleZ = 4.13643033F;

		rightTrackModel[340].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box676
		rightTrackModel[340].setRotationPoint(66.3F, -2.7F, -24F);
		rightTrackModel[340].rotateAngleZ = 4.13643033F;

		rightTrackModel[341].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box677
		rightTrackModel[341].setRotationPoint(66.3F, -2.7F, -24F);
		rightTrackModel[341].rotateAngleZ = 4.13643033F;

		rightTrackModel[342].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box684
		rightTrackModel[342].setRotationPoint(68F, -5.1F, -33F);
		rightTrackModel[342].rotateAngleZ = 4.69493569F;

		rightTrackModel[343].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box685
		rightTrackModel[343].setRotationPoint(68F, -5.1F, -32F);
		rightTrackModel[343].rotateAngleZ = 4.69493569F;

		rightTrackModel[344].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box686
		rightTrackModel[344].setRotationPoint(68F, -5.1F, -32F);
		rightTrackModel[344].rotateAngleZ = 4.69493569F;

		rightTrackModel[345].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box687
		rightTrackModel[345].setRotationPoint(68F, -5.1F, -28F);
		rightTrackModel[345].rotateAngleZ = 4.69493569F;

		rightTrackModel[346].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box688
		rightTrackModel[346].setRotationPoint(68F, -5.1F, -24F);
		rightTrackModel[346].rotateAngleZ = 4.69493569F;

		rightTrackModel[347].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box689
		rightTrackModel[347].setRotationPoint(68F, -5.1F, -24F);
		rightTrackModel[347].rotateAngleZ = 4.69493569F;

		rightTrackModel[348].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box696
		rightTrackModel[348].setRotationPoint(68F, -8.1F, -33F);
		rightTrackModel[348].rotateAngleZ = 4.69493569F;

		rightTrackModel[349].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box697
		rightTrackModel[349].setRotationPoint(68F, -8.1F, -32F);
		rightTrackModel[349].rotateAngleZ = 4.69493569F;

		rightTrackModel[350].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box698
		rightTrackModel[350].setRotationPoint(68F, -8.1F, -32F);
		rightTrackModel[350].rotateAngleZ = 4.69493569F;

		rightTrackModel[351].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box699
		rightTrackModel[351].setRotationPoint(68F, -8.1F, -28F);
		rightTrackModel[351].rotateAngleZ = 4.69493569F;

		rightTrackModel[352].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box700
		rightTrackModel[352].setRotationPoint(68F, -8.1F, -24F);
		rightTrackModel[352].rotateAngleZ = 4.69493569F;

		rightTrackModel[353].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box701
		rightTrackModel[353].setRotationPoint(68F, -8.1F, -24F);
		rightTrackModel[353].rotateAngleZ = 4.69493569F;

		rightTrackModel[354].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box708
		rightTrackModel[354].setRotationPoint(68F, -11.1F, -33F);
		rightTrackModel[354].rotateAngleZ = 5.21853446F;

		rightTrackModel[355].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box709
		rightTrackModel[355].setRotationPoint(68F, -11.1F, -32F);
		rightTrackModel[355].rotateAngleZ = 5.21853446F;

		rightTrackModel[356].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box710
		rightTrackModel[356].setRotationPoint(68F, -11.1F, -32F);
		rightTrackModel[356].rotateAngleZ = 5.21853446F;

		rightTrackModel[357].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box711
		rightTrackModel[357].setRotationPoint(68F, -11.1F, -28F);
		rightTrackModel[357].rotateAngleZ = 5.21853446F;

		rightTrackModel[358].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box712
		rightTrackModel[358].setRotationPoint(68F, -11.1F, -24F);
		rightTrackModel[358].rotateAngleZ = 5.21853446F;

		rightTrackModel[359].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box713
		rightTrackModel[359].setRotationPoint(68F, -11.1F, -24F);
		rightTrackModel[359].rotateAngleZ = 5.21853446F;

		rightTrackModel[360].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box720
		rightTrackModel[360].setRotationPoint(66.5F, -13.7F, -33F);
		rightTrackModel[360].rotateAngleZ = 5.56760031F;

		rightTrackModel[361].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box721
		rightTrackModel[361].setRotationPoint(66.5F, -13.7F, -32F);
		rightTrackModel[361].rotateAngleZ = 5.56760031F;

		rightTrackModel[362].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box722
		rightTrackModel[362].setRotationPoint(66.5F, -13.7F, -32F);
		rightTrackModel[362].rotateAngleZ = 5.56760031F;

		rightTrackModel[363].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box723
		rightTrackModel[363].setRotationPoint(66.5F, -13.7F, -28F);
		rightTrackModel[363].rotateAngleZ = 5.56760031F;

		rightTrackModel[364].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box724
		rightTrackModel[364].setRotationPoint(66.5F, -13.7F, -24F);
		rightTrackModel[364].rotateAngleZ = 5.56760031F;

		rightTrackModel[365].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box725
		rightTrackModel[365].setRotationPoint(66.5F, -13.7F, -24F);
		rightTrackModel[365].rotateAngleZ = 5.56760031F;

		rightTrackModel[366].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box732
		rightTrackModel[366].setRotationPoint(65F, -16F, -33F);

		rightTrackModel[367].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box733
		rightTrackModel[367].setRotationPoint(65F, -16F, -32F);

		rightTrackModel[368].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box734
		rightTrackModel[368].setRotationPoint(65F, -16F, -32F);

		rightTrackModel[369].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box735
		rightTrackModel[369].setRotationPoint(65F, -16F, -28F);

		rightTrackModel[370].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box736
		rightTrackModel[370].setRotationPoint(65F, -16F, -24F);

		rightTrackModel[371].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box737
		rightTrackModel[371].setRotationPoint(65F, -16F, -24F);

		rightTrackModel[372].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box744
		rightTrackModel[372].setRotationPoint(62F, -16F, -33F);

		rightTrackModel[373].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box745
		rightTrackModel[373].setRotationPoint(62F, -16F, -32F);

		rightTrackModel[374].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box746
		rightTrackModel[374].setRotationPoint(62F, -16F, -32F);

		rightTrackModel[375].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box747
		rightTrackModel[375].setRotationPoint(62F, -16F, -28F);

		rightTrackModel[376].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box748
		rightTrackModel[376].setRotationPoint(62F, -16F, -24F);

		rightTrackModel[377].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box749
		rightTrackModel[377].setRotationPoint(62F, -16F, -24F);

		rightTrackModel[378].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box756
		rightTrackModel[378].setRotationPoint(59F, -16F, -33F);

		rightTrackModel[379].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box757
		rightTrackModel[379].setRotationPoint(59F, -16F, -32F);

		rightTrackModel[380].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box758
		rightTrackModel[380].setRotationPoint(59F, -16F, -32F);

		rightTrackModel[381].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box759
		rightTrackModel[381].setRotationPoint(59F, -16F, -28F);

		rightTrackModel[382].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box760
		rightTrackModel[382].setRotationPoint(59F, -16F, -24F);

		rightTrackModel[383].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box761
		rightTrackModel[383].setRotationPoint(59F, -16F, -24F);

		rightTrackModel[384].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box768
		rightTrackModel[384].setRotationPoint(56F, -16F, -33F);

		rightTrackModel[385].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box769
		rightTrackModel[385].setRotationPoint(56F, -16F, -32F);

		rightTrackModel[386].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box770
		rightTrackModel[386].setRotationPoint(56F, -16F, -32F);

		rightTrackModel[387].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box771
		rightTrackModel[387].setRotationPoint(56F, -16F, -28F);

		rightTrackModel[388].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box772
		rightTrackModel[388].setRotationPoint(56F, -16F, -24F);

		rightTrackModel[389].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box773
		rightTrackModel[389].setRotationPoint(56F, -16F, -24F);

		rightTrackModel[390].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box780
		rightTrackModel[390].setRotationPoint(53F, -16F, -33F);

		rightTrackModel[391].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box781
		rightTrackModel[391].setRotationPoint(53F, -16F, -32F);

		rightTrackModel[392].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box782
		rightTrackModel[392].setRotationPoint(53F, -16F, -32F);

		rightTrackModel[393].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box783
		rightTrackModel[393].setRotationPoint(53F, -16F, -28F);

		rightTrackModel[394].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box784
		rightTrackModel[394].setRotationPoint(53F, -16F, -24F);

		rightTrackModel[395].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box785
		rightTrackModel[395].setRotationPoint(53F, -16F, -24F);

		rightTrackModel[396].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box792
		rightTrackModel[396].setRotationPoint(50F, -16F, -33F);

		rightTrackModel[397].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box793
		rightTrackModel[397].setRotationPoint(50F, -16F, -32F);

		rightTrackModel[398].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box794
		rightTrackModel[398].setRotationPoint(50F, -16F, -32F);

		rightTrackModel[399].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box795
		rightTrackModel[399].setRotationPoint(50F, -16F, -28F);

		rightTrackModel[400].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box796
		rightTrackModel[400].setRotationPoint(50F, -16F, -24F);

		rightTrackModel[401].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box797
		rightTrackModel[401].setRotationPoint(50F, -16F, -24F);

		rightTrackModel[402].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box804
		rightTrackModel[402].setRotationPoint(47F, -16F, -33F);

		rightTrackModel[403].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box805
		rightTrackModel[403].setRotationPoint(47F, -16F, -32F);

		rightTrackModel[404].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box806
		rightTrackModel[404].setRotationPoint(47F, -16F, -32F);

		rightTrackModel[405].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box807
		rightTrackModel[405].setRotationPoint(47F, -16F, -28F);

		rightTrackModel[406].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box808
		rightTrackModel[406].setRotationPoint(47F, -16F, -24F);

		rightTrackModel[407].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box809
		rightTrackModel[407].setRotationPoint(47F, -16F, -24F);

		rightTrackModel[408].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box816
		rightTrackModel[408].setRotationPoint(44F, -16F, -33F);

		rightTrackModel[409].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box817
		rightTrackModel[409].setRotationPoint(44F, -16F, -32F);

		rightTrackModel[410].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box818
		rightTrackModel[410].setRotationPoint(44F, -16F, -32F);

		rightTrackModel[411].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box819
		rightTrackModel[411].setRotationPoint(44F, -16F, -28F);

		rightTrackModel[412].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box820
		rightTrackModel[412].setRotationPoint(44F, -16F, -24F);

		rightTrackModel[413].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box821
		rightTrackModel[413].setRotationPoint(44F, -16F, -24F);

		rightTrackModel[414].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box828
		rightTrackModel[414].setRotationPoint(41F, -16F, -33F);

		rightTrackModel[415].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box829
		rightTrackModel[415].setRotationPoint(41F, -16F, -32F);

		rightTrackModel[416].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box830
		rightTrackModel[416].setRotationPoint(41F, -16F, -32F);

		rightTrackModel[417].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box831
		rightTrackModel[417].setRotationPoint(41F, -16F, -28F);

		rightTrackModel[418].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box832
		rightTrackModel[418].setRotationPoint(41F, -16F, -24F);

		rightTrackModel[419].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box833
		rightTrackModel[419].setRotationPoint(41F, -16F, -24F);

		rightTrackModel[420].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box840
		rightTrackModel[420].setRotationPoint(38F, -16F, -33F);

		rightTrackModel[421].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box841
		rightTrackModel[421].setRotationPoint(38F, -16F, -32F);

		rightTrackModel[422].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box842
		rightTrackModel[422].setRotationPoint(38F, -16F, -32F);

		rightTrackModel[423].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box843
		rightTrackModel[423].setRotationPoint(38F, -16F, -28F);

		rightTrackModel[424].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box844
		rightTrackModel[424].setRotationPoint(38F, -16F, -24F);

		rightTrackModel[425].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box845
		rightTrackModel[425].setRotationPoint(38F, -16F, -24F);

		rightTrackModel[426].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box852
		rightTrackModel[426].setRotationPoint(35F, -16F, -33F);

		rightTrackModel[427].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box853
		rightTrackModel[427].setRotationPoint(35F, -16F, -32F);

		rightTrackModel[428].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box854
		rightTrackModel[428].setRotationPoint(35F, -16F, -32F);

		rightTrackModel[429].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box855
		rightTrackModel[429].setRotationPoint(35F, -16F, -28F);

		rightTrackModel[430].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box856
		rightTrackModel[430].setRotationPoint(35F, -16F, -24F);

		rightTrackModel[431].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box857
		rightTrackModel[431].setRotationPoint(35F, -16F, -24F);

		rightTrackModel[432].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box864
		rightTrackModel[432].setRotationPoint(32F, -16F, -33F);

		rightTrackModel[433].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box865
		rightTrackModel[433].setRotationPoint(32F, -16F, -32F);

		rightTrackModel[434].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box866
		rightTrackModel[434].setRotationPoint(32F, -16F, -32F);

		rightTrackModel[435].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box867
		rightTrackModel[435].setRotationPoint(32F, -16F, -28F);

		rightTrackModel[436].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box868
		rightTrackModel[436].setRotationPoint(32F, -16F, -24F);

		rightTrackModel[437].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box869
		rightTrackModel[437].setRotationPoint(32F, -16F, -24F);

		rightTrackModel[438].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box876
		rightTrackModel[438].setRotationPoint(29F, -16F, -33F);

		rightTrackModel[439].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box877
		rightTrackModel[439].setRotationPoint(29F, -16F, -32F);

		rightTrackModel[440].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box878
		rightTrackModel[440].setRotationPoint(29F, -16F, -32F);

		rightTrackModel[441].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box879
		rightTrackModel[441].setRotationPoint(29F, -16F, -28F);

		rightTrackModel[442].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box880
		rightTrackModel[442].setRotationPoint(29F, -16F, -24F);

		rightTrackModel[443].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box881
		rightTrackModel[443].setRotationPoint(29F, -16F, -24F);

		rightTrackModel[444].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box888
		rightTrackModel[444].setRotationPoint(26F, -16F, -33F);

		rightTrackModel[445].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box889
		rightTrackModel[445].setRotationPoint(26F, -16F, -32F);

		rightTrackModel[446].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box890
		rightTrackModel[446].setRotationPoint(26F, -16F, -32F);

		rightTrackModel[447].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box891
		rightTrackModel[447].setRotationPoint(26F, -16F, -28F);

		rightTrackModel[448].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box892
		rightTrackModel[448].setRotationPoint(26F, -16F, -24F);

		rightTrackModel[449].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box893
		rightTrackModel[449].setRotationPoint(26F, -16F, -24F);

		rightTrackModel[450].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box900
		rightTrackModel[450].setRotationPoint(23F, -16F, -33F);

		rightTrackModel[451].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box901
		rightTrackModel[451].setRotationPoint(23F, -16F, -32F);

		rightTrackModel[452].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box902
		rightTrackModel[452].setRotationPoint(23F, -16F, -32F);

		rightTrackModel[453].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box903
		rightTrackModel[453].setRotationPoint(23F, -16F, -28F);

		rightTrackModel[454].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box904
		rightTrackModel[454].setRotationPoint(23F, -16F, -24F);

		rightTrackModel[455].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box905
		rightTrackModel[455].setRotationPoint(23F, -16F, -24F);

		rightTrackModel[456].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box912
		rightTrackModel[456].setRotationPoint(20F, -16F, -33F);

		rightTrackModel[457].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box913
		rightTrackModel[457].setRotationPoint(20F, -16F, -32F);

		rightTrackModel[458].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box914
		rightTrackModel[458].setRotationPoint(20F, -16F, -32F);

		rightTrackModel[459].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box915
		rightTrackModel[459].setRotationPoint(20F, -16F, -28F);

		rightTrackModel[460].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box916
		rightTrackModel[460].setRotationPoint(20F, -16F, -24F);

		rightTrackModel[461].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box917
		rightTrackModel[461].setRotationPoint(20F, -16F, -24F);

		rightTrackModel[462].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box924
		rightTrackModel[462].setRotationPoint(17F, -16F, -33F);

		rightTrackModel[463].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box925
		rightTrackModel[463].setRotationPoint(17F, -16F, -32F);

		rightTrackModel[464].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box926
		rightTrackModel[464].setRotationPoint(17F, -16F, -32F);

		rightTrackModel[465].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box927
		rightTrackModel[465].setRotationPoint(17F, -16F, -28F);

		rightTrackModel[466].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box928
		rightTrackModel[466].setRotationPoint(17F, -16F, -24F);

		rightTrackModel[467].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box929
		rightTrackModel[467].setRotationPoint(17F, -16F, -24F);

		rightTrackModel[468].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box936
		rightTrackModel[468].setRotationPoint(14F, -16F, -33F);

		rightTrackModel[469].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box937
		rightTrackModel[469].setRotationPoint(14F, -16F, -32F);

		rightTrackModel[470].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box938
		rightTrackModel[470].setRotationPoint(14F, -16F, -32F);

		rightTrackModel[471].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box939
		rightTrackModel[471].setRotationPoint(14F, -16F, -28F);

		rightTrackModel[472].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box940
		rightTrackModel[472].setRotationPoint(14F, -16F, -24F);

		rightTrackModel[473].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box941
		rightTrackModel[473].setRotationPoint(14F, -16F, -24F);

		rightTrackModel[474].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box948
		rightTrackModel[474].setRotationPoint(11F, -16F, -33F);

		rightTrackModel[475].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box949
		rightTrackModel[475].setRotationPoint(11F, -16F, -32F);

		rightTrackModel[476].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box950
		rightTrackModel[476].setRotationPoint(11F, -16F, -32F);

		rightTrackModel[477].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box951
		rightTrackModel[477].setRotationPoint(11F, -16F, -28F);

		rightTrackModel[478].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box952
		rightTrackModel[478].setRotationPoint(11F, -16F, -24F);

		rightTrackModel[479].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box953
		rightTrackModel[479].setRotationPoint(11F, -16F, -24F);

		rightTrackModel[480].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box960
		rightTrackModel[480].setRotationPoint(8F, -16F, -33F);

		rightTrackModel[481].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box961
		rightTrackModel[481].setRotationPoint(8F, -16F, -32F);

		rightTrackModel[482].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box962
		rightTrackModel[482].setRotationPoint(8F, -16F, -32F);

		rightTrackModel[483].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box963
		rightTrackModel[483].setRotationPoint(8F, -16F, -28F);

		rightTrackModel[484].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box964
		rightTrackModel[484].setRotationPoint(8F, -16F, -24F);

		rightTrackModel[485].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box965
		rightTrackModel[485].setRotationPoint(8F, -16F, -24F);

		rightTrackModel[486].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box972
		rightTrackModel[486].setRotationPoint(5F, -16F, -33F);

		rightTrackModel[487].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box973
		rightTrackModel[487].setRotationPoint(5F, -16F, -32F);

		rightTrackModel[488].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box974
		rightTrackModel[488].setRotationPoint(5F, -16F, -32F);

		rightTrackModel[489].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box975
		rightTrackModel[489].setRotationPoint(5F, -16F, -28F);

		rightTrackModel[490].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box976
		rightTrackModel[490].setRotationPoint(5F, -16F, -24F);

		rightTrackModel[491].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box977
		rightTrackModel[491].setRotationPoint(5F, -16F, -24F);

		rightTrackModel[492].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box984
		rightTrackModel[492].setRotationPoint(2F, -16F, -33F);

		rightTrackModel[493].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box985
		rightTrackModel[493].setRotationPoint(2F, -16F, -32F);

		rightTrackModel[494].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box986
		rightTrackModel[494].setRotationPoint(2F, -16F, -32F);

		rightTrackModel[495].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box987
		rightTrackModel[495].setRotationPoint(2F, -16F, -28F);

		rightTrackModel[496].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box988
		rightTrackModel[496].setRotationPoint(2F, -16F, -24F);

		rightTrackModel[497].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box989
		rightTrackModel[497].setRotationPoint(2F, -16F, -24F);

		rightTrackModel[498].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box996
		rightTrackModel[498].setRotationPoint(-1F, -16F, -33F);

		rightTrackModel[499].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box997
		rightTrackModel[499].setRotationPoint(-1F, -16F, -32F);
	}

	private void initrightTrackModel_2()
	{
		rightTrackModel[500] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box998
		rightTrackModel[501] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box999
		rightTrackModel[502] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1000
		rightTrackModel[503] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1001
		rightTrackModel[504] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1008
		rightTrackModel[505] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1009
		rightTrackModel[506] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1010
		rightTrackModel[507] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1011
		rightTrackModel[508] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1012
		rightTrackModel[509] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1013
		rightTrackModel[510] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1020
		rightTrackModel[511] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1021
		rightTrackModel[512] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1022
		rightTrackModel[513] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1023
		rightTrackModel[514] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1024
		rightTrackModel[515] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1025
		rightTrackModel[516] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1032
		rightTrackModel[517] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1033
		rightTrackModel[518] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1034
		rightTrackModel[519] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1035
		rightTrackModel[520] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1036
		rightTrackModel[521] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1037
		rightTrackModel[522] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1044
		rightTrackModel[523] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1045
		rightTrackModel[524] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1046
		rightTrackModel[525] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1047
		rightTrackModel[526] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1048
		rightTrackModel[527] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1049
		rightTrackModel[528] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1056
		rightTrackModel[529] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1057
		rightTrackModel[530] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1058
		rightTrackModel[531] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1059
		rightTrackModel[532] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1060
		rightTrackModel[533] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1061
		rightTrackModel[534] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1068
		rightTrackModel[535] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1069
		rightTrackModel[536] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1070
		rightTrackModel[537] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1071
		rightTrackModel[538] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1072
		rightTrackModel[539] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1073
		rightTrackModel[540] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1080
		rightTrackModel[541] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1081
		rightTrackModel[542] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1082
		rightTrackModel[543] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1083
		rightTrackModel[544] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1084
		rightTrackModel[545] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1085
		rightTrackModel[546] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1092
		rightTrackModel[547] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1093
		rightTrackModel[548] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1094
		rightTrackModel[549] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1095
		rightTrackModel[550] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1096
		rightTrackModel[551] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1097
		rightTrackModel[552] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1104
		rightTrackModel[553] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1105
		rightTrackModel[554] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1106
		rightTrackModel[555] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1107
		rightTrackModel[556] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1108
		rightTrackModel[557] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1109
		rightTrackModel[558] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1116
		rightTrackModel[559] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1117
		rightTrackModel[560] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1118
		rightTrackModel[561] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1119
		rightTrackModel[562] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1120
		rightTrackModel[563] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1121
		rightTrackModel[564] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1128
		rightTrackModel[565] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1129
		rightTrackModel[566] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1130
		rightTrackModel[567] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1131
		rightTrackModel[568] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1132
		rightTrackModel[569] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1133
		rightTrackModel[570] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1140
		rightTrackModel[571] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1141
		rightTrackModel[572] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1142
		rightTrackModel[573] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1143
		rightTrackModel[574] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1144
		rightTrackModel[575] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1145
		rightTrackModel[576] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1152
		rightTrackModel[577] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1153
		rightTrackModel[578] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1154
		rightTrackModel[579] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1155
		rightTrackModel[580] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1156
		rightTrackModel[581] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1157
		rightTrackModel[582] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1164
		rightTrackModel[583] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1165
		rightTrackModel[584] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1166
		rightTrackModel[585] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1167
		rightTrackModel[586] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1168
		rightTrackModel[587] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1169
		rightTrackModel[588] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1176
		rightTrackModel[589] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1177
		rightTrackModel[590] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1178
		rightTrackModel[591] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1179
		rightTrackModel[592] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1180
		rightTrackModel[593] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1181
		rightTrackModel[594] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1188
		rightTrackModel[595] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1189
		rightTrackModel[596] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1190
		rightTrackModel[597] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1191
		rightTrackModel[598] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1192
		rightTrackModel[599] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1193
		rightTrackModel[600] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1200
		rightTrackModel[601] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1201
		rightTrackModel[602] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1202
		rightTrackModel[603] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1203
		rightTrackModel[604] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1204
		rightTrackModel[605] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1205
		rightTrackModel[606] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1212
		rightTrackModel[607] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1213
		rightTrackModel[608] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1214
		rightTrackModel[609] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1215
		rightTrackModel[610] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1216
		rightTrackModel[611] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1217
		rightTrackModel[612] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1224
		rightTrackModel[613] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1225
		rightTrackModel[614] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1226
		rightTrackModel[615] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1227
		rightTrackModel[616] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1228
		rightTrackModel[617] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1229
		rightTrackModel[618] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1236
		rightTrackModel[619] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1237
		rightTrackModel[620] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1238
		rightTrackModel[621] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1239
		rightTrackModel[622] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1240
		rightTrackModel[623] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1241
		rightTrackModel[624] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box1248
		rightTrackModel[625] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1249
		rightTrackModel[626] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1250
		rightTrackModel[627] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box1251
		rightTrackModel[628] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1252
		rightTrackModel[629] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1253
		rightTrackModel[630] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1262
		rightTrackModel[631] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box1263

		rightTrackModel[500].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box998
		rightTrackModel[500].setRotationPoint(-1F, -16F, -32F);

		rightTrackModel[501].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box999
		rightTrackModel[501].setRotationPoint(-1F, -16F, -28F);

		rightTrackModel[502].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1000
		rightTrackModel[502].setRotationPoint(-1F, -16F, -24F);

		rightTrackModel[503].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1001
		rightTrackModel[503].setRotationPoint(-1F, -16F, -24F);

		rightTrackModel[504].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1008
		rightTrackModel[504].setRotationPoint(-4F, -16F, -33F);

		rightTrackModel[505].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1009
		rightTrackModel[505].setRotationPoint(-4F, -16F, -32F);

		rightTrackModel[506].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1010
		rightTrackModel[506].setRotationPoint(-4F, -16F, -32F);

		rightTrackModel[507].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1011
		rightTrackModel[507].setRotationPoint(-4F, -16F, -28F);

		rightTrackModel[508].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1012
		rightTrackModel[508].setRotationPoint(-4F, -16F, -24F);

		rightTrackModel[509].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1013
		rightTrackModel[509].setRotationPoint(-4F, -16F, -24F);

		rightTrackModel[510].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1020
		rightTrackModel[510].setRotationPoint(-7F, -16F, -33F);

		rightTrackModel[511].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1021
		rightTrackModel[511].setRotationPoint(-7F, -16F, -32F);

		rightTrackModel[512].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1022
		rightTrackModel[512].setRotationPoint(-7F, -16F, -32F);

		rightTrackModel[513].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1023
		rightTrackModel[513].setRotationPoint(-7F, -16F, -28F);

		rightTrackModel[514].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1024
		rightTrackModel[514].setRotationPoint(-7F, -16F, -24F);

		rightTrackModel[515].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1025
		rightTrackModel[515].setRotationPoint(-7F, -16F, -24F);

		rightTrackModel[516].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1032
		rightTrackModel[516].setRotationPoint(-10F, -16F, -33F);

		rightTrackModel[517].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1033
		rightTrackModel[517].setRotationPoint(-10F, -16F, -32F);

		rightTrackModel[518].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1034
		rightTrackModel[518].setRotationPoint(-10F, -16F, -32F);

		rightTrackModel[519].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1035
		rightTrackModel[519].setRotationPoint(-10F, -16F, -28F);

		rightTrackModel[520].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1036
		rightTrackModel[520].setRotationPoint(-10F, -16F, -24F);

		rightTrackModel[521].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1037
		rightTrackModel[521].setRotationPoint(-10F, -16F, -24F);

		rightTrackModel[522].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1044
		rightTrackModel[522].setRotationPoint(-13F, -16F, -33F);

		rightTrackModel[523].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1045
		rightTrackModel[523].setRotationPoint(-13F, -16F, -32F);

		rightTrackModel[524].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1046
		rightTrackModel[524].setRotationPoint(-13F, -16F, -32F);

		rightTrackModel[525].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1047
		rightTrackModel[525].setRotationPoint(-13F, -16F, -28F);

		rightTrackModel[526].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1048
		rightTrackModel[526].setRotationPoint(-13F, -16F, -24F);

		rightTrackModel[527].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1049
		rightTrackModel[527].setRotationPoint(-13F, -16F, -24F);

		rightTrackModel[528].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1056
		rightTrackModel[528].setRotationPoint(-16F, -16F, -33F);

		rightTrackModel[529].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1057
		rightTrackModel[529].setRotationPoint(-16F, -16F, -32F);

		rightTrackModel[530].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1058
		rightTrackModel[530].setRotationPoint(-16F, -16F, -32F);

		rightTrackModel[531].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1059
		rightTrackModel[531].setRotationPoint(-16F, -16F, -28F);

		rightTrackModel[532].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1060
		rightTrackModel[532].setRotationPoint(-16F, -16F, -24F);

		rightTrackModel[533].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1061
		rightTrackModel[533].setRotationPoint(-16F, -16F, -24F);

		rightTrackModel[534].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1068
		rightTrackModel[534].setRotationPoint(-19F, -16F, -33F);

		rightTrackModel[535].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1069
		rightTrackModel[535].setRotationPoint(-19F, -16F, -32F);

		rightTrackModel[536].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1070
		rightTrackModel[536].setRotationPoint(-19F, -16F, -32F);

		rightTrackModel[537].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1071
		rightTrackModel[537].setRotationPoint(-19F, -16F, -28F);

		rightTrackModel[538].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1072
		rightTrackModel[538].setRotationPoint(-19F, -16F, -24F);

		rightTrackModel[539].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1073
		rightTrackModel[539].setRotationPoint(-19F, -16F, -24F);

		rightTrackModel[540].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1080
		rightTrackModel[540].setRotationPoint(-22F, -16F, -33F);

		rightTrackModel[541].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1081
		rightTrackModel[541].setRotationPoint(-22F, -16F, -32F);

		rightTrackModel[542].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1082
		rightTrackModel[542].setRotationPoint(-22F, -16F, -32F);

		rightTrackModel[543].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1083
		rightTrackModel[543].setRotationPoint(-22F, -16F, -28F);

		rightTrackModel[544].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1084
		rightTrackModel[544].setRotationPoint(-22F, -16F, -24F);

		rightTrackModel[545].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1085
		rightTrackModel[545].setRotationPoint(-22F, -16F, -24F);

		rightTrackModel[546].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1092
		rightTrackModel[546].setRotationPoint(-25F, -16F, -33F);

		rightTrackModel[547].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1093
		rightTrackModel[547].setRotationPoint(-25F, -16F, -32F);

		rightTrackModel[548].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1094
		rightTrackModel[548].setRotationPoint(-25F, -16F, -32F);

		rightTrackModel[549].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1095
		rightTrackModel[549].setRotationPoint(-25F, -16F, -28F);

		rightTrackModel[550].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1096
		rightTrackModel[550].setRotationPoint(-25F, -16F, -24F);

		rightTrackModel[551].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1097
		rightTrackModel[551].setRotationPoint(-25F, -16F, -24F);

		rightTrackModel[552].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1104
		rightTrackModel[552].setRotationPoint(-28F, -16F, -33F);

		rightTrackModel[553].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1105
		rightTrackModel[553].setRotationPoint(-28F, -16F, -32F);

		rightTrackModel[554].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1106
		rightTrackModel[554].setRotationPoint(-28F, -16F, -32F);

		rightTrackModel[555].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1107
		rightTrackModel[555].setRotationPoint(-28F, -16F, -28F);

		rightTrackModel[556].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1108
		rightTrackModel[556].setRotationPoint(-28F, -16F, -24F);

		rightTrackModel[557].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1109
		rightTrackModel[557].setRotationPoint(-28F, -16F, -24F);

		rightTrackModel[558].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1116
		rightTrackModel[558].setRotationPoint(-31F, -16F, -33F);

		rightTrackModel[559].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1117
		rightTrackModel[559].setRotationPoint(-31F, -16F, -32F);

		rightTrackModel[560].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1118
		rightTrackModel[560].setRotationPoint(-31F, -16F, -32F);

		rightTrackModel[561].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1119
		rightTrackModel[561].setRotationPoint(-31F, -16F, -28F);

		rightTrackModel[562].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1120
		rightTrackModel[562].setRotationPoint(-31F, -16F, -24F);

		rightTrackModel[563].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1121
		rightTrackModel[563].setRotationPoint(-31F, -16F, -24F);

		rightTrackModel[564].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1128
		rightTrackModel[564].setRotationPoint(-34F, -16F, -33F);

		rightTrackModel[565].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1129
		rightTrackModel[565].setRotationPoint(-34F, -16F, -32F);

		rightTrackModel[566].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1130
		rightTrackModel[566].setRotationPoint(-34F, -16F, -32F);

		rightTrackModel[567].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1131
		rightTrackModel[567].setRotationPoint(-34F, -16F, -28F);

		rightTrackModel[568].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1132
		rightTrackModel[568].setRotationPoint(-34F, -16F, -24F);

		rightTrackModel[569].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1133
		rightTrackModel[569].setRotationPoint(-34F, -16F, -24F);

		rightTrackModel[570].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1140
		rightTrackModel[570].setRotationPoint(-37F, -16F, -33F);

		rightTrackModel[571].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1141
		rightTrackModel[571].setRotationPoint(-37F, -16F, -32F);

		rightTrackModel[572].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1142
		rightTrackModel[572].setRotationPoint(-37F, -16F, -32F);

		rightTrackModel[573].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1143
		rightTrackModel[573].setRotationPoint(-37F, -16F, -28F);

		rightTrackModel[574].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1144
		rightTrackModel[574].setRotationPoint(-37F, -16F, -24F);

		rightTrackModel[575].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1145
		rightTrackModel[575].setRotationPoint(-37F, -16F, -24F);

		rightTrackModel[576].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1152
		rightTrackModel[576].setRotationPoint(-40F, -16F, -33F);

		rightTrackModel[577].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1153
		rightTrackModel[577].setRotationPoint(-40F, -16F, -32F);

		rightTrackModel[578].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1154
		rightTrackModel[578].setRotationPoint(-40F, -16F, -32F);

		rightTrackModel[579].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1155
		rightTrackModel[579].setRotationPoint(-40F, -16F, -28F);

		rightTrackModel[580].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1156
		rightTrackModel[580].setRotationPoint(-40F, -16F, -24F);

		rightTrackModel[581].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1157
		rightTrackModel[581].setRotationPoint(-40F, -16F, -24F);

		rightTrackModel[582].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1164
		rightTrackModel[582].setRotationPoint(-43F, -16F, -33F);

		rightTrackModel[583].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1165
		rightTrackModel[583].setRotationPoint(-43F, -16F, -32F);

		rightTrackModel[584].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1166
		rightTrackModel[584].setRotationPoint(-43F, -16F, -32F);

		rightTrackModel[585].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1167
		rightTrackModel[585].setRotationPoint(-43F, -16F, -28F);

		rightTrackModel[586].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1168
		rightTrackModel[586].setRotationPoint(-43F, -16F, -24F);

		rightTrackModel[587].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1169
		rightTrackModel[587].setRotationPoint(-43F, -16F, -24F);

		rightTrackModel[588].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1176
		rightTrackModel[588].setRotationPoint(-46F, -16F, -33F);

		rightTrackModel[589].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1177
		rightTrackModel[589].setRotationPoint(-46F, -16F, -32F);

		rightTrackModel[590].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1178
		rightTrackModel[590].setRotationPoint(-46F, -16F, -32F);

		rightTrackModel[591].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1179
		rightTrackModel[591].setRotationPoint(-46F, -16F, -28F);

		rightTrackModel[592].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1180
		rightTrackModel[592].setRotationPoint(-46F, -16F, -24F);

		rightTrackModel[593].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1181
		rightTrackModel[593].setRotationPoint(-46F, -16F, -24F);

		rightTrackModel[594].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1188
		rightTrackModel[594].setRotationPoint(-49F, -16F, -33F);

		rightTrackModel[595].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1189
		rightTrackModel[595].setRotationPoint(-49F, -16F, -32F);

		rightTrackModel[596].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1190
		rightTrackModel[596].setRotationPoint(-49F, -16F, -32F);

		rightTrackModel[597].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1191
		rightTrackModel[597].setRotationPoint(-49F, -16F, -28F);

		rightTrackModel[598].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1192
		rightTrackModel[598].setRotationPoint(-49F, -16F, -24F);

		rightTrackModel[599].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1193
		rightTrackModel[599].setRotationPoint(-49F, -16F, -24F);

		rightTrackModel[600].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1200
		rightTrackModel[600].setRotationPoint(-52F, -16F, -33F);

		rightTrackModel[601].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1201
		rightTrackModel[601].setRotationPoint(-52F, -16F, -32F);

		rightTrackModel[602].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1202
		rightTrackModel[602].setRotationPoint(-52F, -16F, -32F);

		rightTrackModel[603].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1203
		rightTrackModel[603].setRotationPoint(-52F, -16F, -28F);

		rightTrackModel[604].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1204
		rightTrackModel[604].setRotationPoint(-52F, -16F, -24F);

		rightTrackModel[605].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1205
		rightTrackModel[605].setRotationPoint(-52F, -16F, -24F);

		rightTrackModel[606].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1212
		rightTrackModel[606].setRotationPoint(-55F, -16F, -33F);

		rightTrackModel[607].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1213
		rightTrackModel[607].setRotationPoint(-55F, -16F, -32F);

		rightTrackModel[608].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1214
		rightTrackModel[608].setRotationPoint(-55F, -16F, -32F);

		rightTrackModel[609].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1215
		rightTrackModel[609].setRotationPoint(-55F, -16F, -28F);

		rightTrackModel[610].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1216
		rightTrackModel[610].setRotationPoint(-55F, -16F, -24F);

		rightTrackModel[611].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1217
		rightTrackModel[611].setRotationPoint(-55F, -16F, -24F);

		rightTrackModel[612].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1224
		rightTrackModel[612].setRotationPoint(-58F, -16F, -33F);

		rightTrackModel[613].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1225
		rightTrackModel[613].setRotationPoint(-58F, -16F, -32F);

		rightTrackModel[614].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1226
		rightTrackModel[614].setRotationPoint(-58F, -16F, -32F);

		rightTrackModel[615].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1227
		rightTrackModel[615].setRotationPoint(-58F, -16F, -28F);

		rightTrackModel[616].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1228
		rightTrackModel[616].setRotationPoint(-58F, -16F, -24F);

		rightTrackModel[617].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1229
		rightTrackModel[617].setRotationPoint(-58F, -16F, -24F);

		rightTrackModel[618].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1236
		rightTrackModel[618].setRotationPoint(-61F, -16F, -33F);

		rightTrackModel[619].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1237
		rightTrackModel[619].setRotationPoint(-61F, -16F, -32F);

		rightTrackModel[620].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1238
		rightTrackModel[620].setRotationPoint(-61F, -16F, -32F);

		rightTrackModel[621].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1239
		rightTrackModel[621].setRotationPoint(-61F, -16F, -28F);

		rightTrackModel[622].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1240
		rightTrackModel[622].setRotationPoint(-61F, -16F, -24F);

		rightTrackModel[623].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1241
		rightTrackModel[623].setRotationPoint(-61F, -16F, -24F);

		rightTrackModel[624].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1248
		rightTrackModel[624].setRotationPoint(-64F, -16F, -33F);
		rightTrackModel[624].rotateAngleZ = 0.13962634F;

		rightTrackModel[625].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1249
		rightTrackModel[625].setRotationPoint(-64F, -16F, -32F);
		rightTrackModel[625].rotateAngleZ = 0.13962634F;

		rightTrackModel[626].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1250
		rightTrackModel[626].setRotationPoint(-64F, -16F, -32F);
		rightTrackModel[626].rotateAngleZ = 0.13962634F;

		rightTrackModel[627].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1251
		rightTrackModel[627].setRotationPoint(-64F, -16F, -28F);
		rightTrackModel[627].rotateAngleZ = 0.13962634F;

		rightTrackModel[628].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1252
		rightTrackModel[628].setRotationPoint(-64F, -16F, -24F);
		rightTrackModel[628].rotateAngleZ = 0.13962634F;

		rightTrackModel[629].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1253
		rightTrackModel[629].setRotationPoint(-64F, -16F, -24F);
		rightTrackModel[629].rotateAngleZ = 0.13962634F;

		rightTrackModel[630].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1262
		rightTrackModel[630].setRotationPoint(-67F, -15.5F, -32F);

		rightTrackModel[631].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1263
		rightTrackModel[631].setRotationPoint(-67F, -15.5F, -24F);
	}
}