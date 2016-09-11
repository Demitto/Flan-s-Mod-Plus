//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMonster extends ModelMecha //Same as Filename
{
	int textureX = 4096;
	int textureY = 4096;

	public ModelMonster() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[638];
		headModel = new ModelRendererTurbo[348];
		hipsModel = new ModelRendererTurbo[16];
		leftArmModel = new ModelRendererTurbo[216];
		rightArmModel = new ModelRendererTurbo[216];
		leftLegModel = new ModelRendererTurbo[103];
		rightLegModel = new ModelRendererTurbo[103];
		leftFootModel = new ModelRendererTurbo[194];
		rightFootModel = new ModelRendererTurbo[194];
		barrelModel = new ModelRendererTurbo[228];

		initbodyModel_1();
		initbodyModel_2();
		initheadModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initleftFootModel_1();
		initrightFootModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 471, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 0, 612, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 0, 686, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 0, 786, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 0, 856, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 0, 906, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 0, 786, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 71, 906, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 0, 856, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 0, 1069, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 0, 1084, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 0, 1069, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 0, 1179, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 0, 1211, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 0, 1238, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1264, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1289, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1314, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1356, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1374, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1388, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1404, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1422, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1343, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1374, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1388, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1459, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1471, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1488, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1471, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1459, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1515, textureX, textureY); // Box 56
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 133, 1540, textureX, textureY); // Box 58
		bodyModel[49] = new ModelRendererTurbo(this, 133, 1515, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1568, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1587, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Box 62
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Box 63
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1689, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1772, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1822, textureX, textureY); // Box 67
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1841, textureX, textureY); // Box 68
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1837, textureX, textureY); // Box 72
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1888, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1944, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 76
		bodyModel[62] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 77
		bodyModel[63] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 78
		bodyModel[64] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 79
		bodyModel[65] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 81
		bodyModel[67] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 82
		bodyModel[68] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 83
		bodyModel[69] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 84
		bodyModel[70] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 85
		bodyModel[71] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 86
		bodyModel[72] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 87
		bodyModel[73] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 88
		bodyModel[74] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 92
		bodyModel[75] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 93
		bodyModel[76] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 94
		bodyModel[77] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 95
		bodyModel[78] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 96
		bodyModel[79] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 97
		bodyModel[80] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 98
		bodyModel[81] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 99
		bodyModel[82] = new ModelRendererTurbo(this, 0, 2040, textureX, textureY); // Box 100
		bodyModel[83] = new ModelRendererTurbo(this, 0, 2108, textureX, textureY); // Box 102
		bodyModel[84] = new ModelRendererTurbo(this, 0, 2108, textureX, textureY); // Box 103
		bodyModel[85] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 104
		bodyModel[86] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 105
		bodyModel[87] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 107
		bodyModel[89] = new ModelRendererTurbo(this, 0, 2108, textureX, textureY); // Box 108
		bodyModel[90] = new ModelRendererTurbo(this, 0, 2040, textureX, textureY); // Box 109
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1587, textureX, textureY); // Box 110
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Box 111
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Box 112
		bodyModel[94] = new ModelRendererTurbo(this, 0, 2108, textureX, textureY); // Box 113
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1888, textureX, textureY); // Box 114
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1689, textureX, textureY); // Box 115
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1772, textureX, textureY); // Box 116
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1841, textureX, textureY); // Box 117
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1822, textureX, textureY); // Box 118
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1837, textureX, textureY); // Box 119
		bodyModel[101] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 120
		bodyModel[102] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 121
		bodyModel[103] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 122
		bodyModel[104] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 123
		bodyModel[105] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 124
		bodyModel[106] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 125
		bodyModel[107] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 126
		bodyModel[108] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 127
		bodyModel[109] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 129
		bodyModel[111] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 130
		bodyModel[112] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 131
		bodyModel[113] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 132
		bodyModel[114] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 133
		bodyModel[115] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 134
		bodyModel[116] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 135
		bodyModel[117] = new ModelRendererTurbo(this, 0, 2029, textureX, textureY); // Box 136
		bodyModel[118] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 137
		bodyModel[119] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 138
		bodyModel[120] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 139
		bodyModel[121] = new ModelRendererTurbo(this, 0, 2035, textureX, textureY); // Box 140
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1944, textureX, textureY); // Box 141
		bodyModel[123] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 142
		bodyModel[124] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 143
		bodyModel[125] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 144
		bodyModel[126] = new ModelRendererTurbo(this, 0, 2140, textureX, textureY); // Box 145
		bodyModel[127] = new ModelRendererTurbo(this, 0, 2050, textureX, textureY); // Box 146
		bodyModel[128] = new ModelRendererTurbo(this, 0, 2320, textureX, textureY); // Box 147
		bodyModel[129] = new ModelRendererTurbo(this, 0, 2320, textureX, textureY); // Box 148
		bodyModel[130] = new ModelRendererTurbo(this, 0, 2484, textureX, textureY); // Box 149
		bodyModel[131] = new ModelRendererTurbo(this, 0, 2584, textureX, textureY); // Box 150
		bodyModel[132] = new ModelRendererTurbo(this, 0, 2686, textureX, textureY); // Box 151
		bodyModel[133] = new ModelRendererTurbo(this, 0, 2766, textureX, textureY); // Box 152
		bodyModel[134] = new ModelRendererTurbo(this, 0, 2845, textureX, textureY); // Box 153
		bodyModel[135] = new ModelRendererTurbo(this, 0, 2926, textureX, textureY); // Box 154
		bodyModel[136] = new ModelRendererTurbo(this, 0, 2948, textureX, textureY); // Box 155
		bodyModel[137] = new ModelRendererTurbo(this, 0, 2948, textureX, textureY); // Box 156
		bodyModel[138] = new ModelRendererTurbo(this, 0, 2926, textureX, textureY); // Box 157
		bodyModel[139] = new ModelRendererTurbo(this, 0, 2967, textureX, textureY); // Box 158
		bodyModel[140] = new ModelRendererTurbo(this, 0, 3002, textureX, textureY); // Box 159
		bodyModel[141] = new ModelRendererTurbo(this, 0, 3002, textureX, textureY); // Box 160
		bodyModel[142] = new ModelRendererTurbo(this, 0, 3040, textureX, textureY); // Box 161
		bodyModel[143] = new ModelRendererTurbo(this, 0, 3040, textureX, textureY); // Box 162
		bodyModel[144] = new ModelRendererTurbo(this, 0, 3040, textureX, textureY); // Box 163
		bodyModel[145] = new ModelRendererTurbo(this, 0, 3040, textureX, textureY); // Box 164
		bodyModel[146] = new ModelRendererTurbo(this, 0, 3040, textureX, textureY); // Box 165
		bodyModel[147] = new ModelRendererTurbo(this, 0, 3040, textureX, textureY); // Box 166
		bodyModel[148] = new ModelRendererTurbo(this, 0, 3002, textureX, textureY); // Box 167
		bodyModel[149] = new ModelRendererTurbo(this, 0, 2967, textureX, textureY); // Box 168
		bodyModel[150] = new ModelRendererTurbo(this, 0, 3002, textureX, textureY); // Box 169
		bodyModel[151] = new ModelRendererTurbo(this, 0, 3055, textureX, textureY); // Box 170
		bodyModel[152] = new ModelRendererTurbo(this, 0, 3120, textureX, textureY); // Box 172
		bodyModel[153] = new ModelRendererTurbo(this, 0, 3137, textureX, textureY); // Box 173
		bodyModel[154] = new ModelRendererTurbo(this, 0, 3233, textureX, textureY); // Box 174
		bodyModel[155] = new ModelRendererTurbo(this, 0, 3316, textureX, textureY); // Box 175
		bodyModel[156] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 176
		bodyModel[157] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 177
		bodyModel[158] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 178
		bodyModel[159] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 179
		bodyModel[160] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 180
		bodyModel[161] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 181
		bodyModel[162] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 182
		bodyModel[163] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 183
		bodyModel[164] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 184
		bodyModel[165] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 185
		bodyModel[166] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 186
		bodyModel[167] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 187
		bodyModel[168] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 188
		bodyModel[169] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 189
		bodyModel[170] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 190
		bodyModel[171] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 191
		bodyModel[172] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 192
		bodyModel[173] = new ModelRendererTurbo(this, 0, 3375, textureX, textureY); // Box 193
		bodyModel[174] = new ModelRendererTurbo(this, 0, 3378, textureX, textureY); // Box 194
		bodyModel[175] = new ModelRendererTurbo(this, 0, 3461, textureX, textureY); // Box 195
		bodyModel[176] = new ModelRendererTurbo(this, 0, 3504, textureX, textureY); // Box 196
		bodyModel[177] = new ModelRendererTurbo(this, 0, 3546, textureX, textureY); // Box 197
		bodyModel[178] = new ModelRendererTurbo(this, 0, 3588, textureX, textureY); // Box 198
		bodyModel[179] = new ModelRendererTurbo(this, 0, 3633, textureX, textureY); // Box 199
		bodyModel[180] = new ModelRendererTurbo(this, 0, 3679, textureX, textureY); // Box 200
		bodyModel[181] = new ModelRendererTurbo(this, 0, 3723, textureX, textureY); // Box 201
		bodyModel[182] = new ModelRendererTurbo(this, 0, 3378, textureX, textureY); // Box 202
		bodyModel[183] = new ModelRendererTurbo(this, 0, 3461, textureX, textureY); // Box 203
		bodyModel[184] = new ModelRendererTurbo(this, 0, 3504, textureX, textureY); // Box 204
		bodyModel[185] = new ModelRendererTurbo(this, 0, 3546, textureX, textureY); // Box 205
		bodyModel[186] = new ModelRendererTurbo(this, 0, 3633, textureX, textureY); // Box 206
		bodyModel[187] = new ModelRendererTurbo(this, 0, 3679, textureX, textureY); // Box 207
		bodyModel[188] = new ModelRendererTurbo(this, 0, 3723, textureX, textureY); // Box 208
		bodyModel[189] = new ModelRendererTurbo(this, 0, 3588, textureX, textureY); // Box 209
		bodyModel[190] = new ModelRendererTurbo(this, 0, 3768, textureX, textureY); // Box 210
		bodyModel[191] = new ModelRendererTurbo(this, 0, 3837, textureX, textureY); // Box 211
		bodyModel[192] = new ModelRendererTurbo(this, 0, 3897, textureX, textureY); // Box 212
		bodyModel[193] = new ModelRendererTurbo(this, 0, 3953, textureX, textureY); // Box 213
		bodyModel[194] = new ModelRendererTurbo(this, 0, 4010, textureX, textureY); // Box 215
		bodyModel[195] = new ModelRendererTurbo(this, 850, 0, textureX, textureY); // Box 216
		bodyModel[196] = new ModelRendererTurbo(this, 850, 50, textureX, textureY); // Box 217
		bodyModel[197] = new ModelRendererTurbo(this, 850, 50, textureX, textureY); // Box 218
		bodyModel[198] = new ModelRendererTurbo(this, 850, 0, textureX, textureY); // Box 219
		bodyModel[199] = new ModelRendererTurbo(this, 0, 4010, textureX, textureY); // Box 220
		bodyModel[200] = new ModelRendererTurbo(this, 0, 3953, textureX, textureY); // Box 221
		bodyModel[201] = new ModelRendererTurbo(this, 0, 3897, textureX, textureY); // Box 222
		bodyModel[202] = new ModelRendererTurbo(this, 0, 3768, textureX, textureY); // Box 225
		bodyModel[203] = new ModelRendererTurbo(this, 0, 3837, textureX, textureY); // Box 226
		bodyModel[204] = new ModelRendererTurbo(this, 850, 133, textureX, textureY); // Box 227
		bodyModel[205] = new ModelRendererTurbo(this, 850, 157, textureX, textureY); // Box 228
		bodyModel[206] = new ModelRendererTurbo(this, 850, 184, textureX, textureY); // Box 229
		bodyModel[207] = new ModelRendererTurbo(this, 850, 215, textureX, textureY); // Box 230
		bodyModel[208] = new ModelRendererTurbo(this, 850, 241, textureX, textureY); // Box 231
		bodyModel[209] = new ModelRendererTurbo(this, 850, 265, textureX, textureY); // Box 232
		bodyModel[210] = new ModelRendererTurbo(this, 850, 295, textureX, textureY); // Box 233
		bodyModel[211] = new ModelRendererTurbo(this, 850, 320, textureX, textureY); // Box 234
		bodyModel[212] = new ModelRendererTurbo(this, 850, 295, textureX, textureY); // Box 235
		bodyModel[213] = new ModelRendererTurbo(this, 850, 320, textureX, textureY); // Box 236
		bodyModel[214] = new ModelRendererTurbo(this, 850, 344, textureX, textureY); // Box 237
		bodyModel[215] = new ModelRendererTurbo(this, 850, 377, textureX, textureY); // Box 238
		bodyModel[216] = new ModelRendererTurbo(this, 850, 377, textureX, textureY); // Box 239
		bodyModel[217] = new ModelRendererTurbo(this, 850, 397, textureX, textureY); // Box 240
		bodyModel[218] = new ModelRendererTurbo(this, 850, 425, textureX, textureY); // Box 241
		bodyModel[219] = new ModelRendererTurbo(this, 850, 425, textureX, textureY); // Box 242
		bodyModel[220] = new ModelRendererTurbo(this, 850, 445, textureX, textureY); // Box 243
		bodyModel[221] = new ModelRendererTurbo(this, 850, 445, textureX, textureY); // Box 244
		bodyModel[222] = new ModelRendererTurbo(this, 850, 445, textureX, textureY); // Box 245
		bodyModel[223] = new ModelRendererTurbo(this, 850, 445, textureX, textureY); // Box 246
		bodyModel[224] = new ModelRendererTurbo(this, 850, 397, textureX, textureY); // Box 247
		bodyModel[225] = new ModelRendererTurbo(this, 850, 425, textureX, textureY); // Box 248
		bodyModel[226] = new ModelRendererTurbo(this, 850, 425, textureX, textureY); // Box 249
		bodyModel[227] = new ModelRendererTurbo(this, 850, 377, textureX, textureY); // Box 250
		bodyModel[228] = new ModelRendererTurbo(this, 850, 344, textureX, textureY); // Box 251
		bodyModel[229] = new ModelRendererTurbo(this, 850, 377, textureX, textureY); // Box 252
		bodyModel[230] = new ModelRendererTurbo(this, 850, 133, textureX, textureY); // Box 253
		bodyModel[231] = new ModelRendererTurbo(this, 850, 157, textureX, textureY); // Box 254
		bodyModel[232] = new ModelRendererTurbo(this, 850, 184, textureX, textureY); // Box 255
		bodyModel[233] = new ModelRendererTurbo(this, 850, 215, textureX, textureY); // Box 256
		bodyModel[234] = new ModelRendererTurbo(this, 850, 241, textureX, textureY); // Box 257
		bodyModel[235] = new ModelRendererTurbo(this, 850, 320, textureX, textureY); // Box 258
		bodyModel[236] = new ModelRendererTurbo(this, 850, 295, textureX, textureY); // Box 259
		bodyModel[237] = new ModelRendererTurbo(this, 850, 265, textureX, textureY); // Box 260
		bodyModel[238] = new ModelRendererTurbo(this, 850, 320, textureX, textureY); // Box 261
		bodyModel[239] = new ModelRendererTurbo(this, 850, 295, textureX, textureY); // Box 262
		bodyModel[240] = new ModelRendererTurbo(this, 850, 444, textureX, textureY); // Box 263
		bodyModel[241] = new ModelRendererTurbo(this, 850, 504, textureX, textureY); // Box 264
		bodyModel[242] = new ModelRendererTurbo(this, 850, 555, textureX, textureY); // Box 265
		bodyModel[243] = new ModelRendererTurbo(this, 850, 504, textureX, textureY); // Box 266
		bodyModel[244] = new ModelRendererTurbo(this, 850, 597, textureX, textureY); // Box 267
		bodyModel[245] = new ModelRendererTurbo(this, 850, 640, textureX, textureY); // Box 268
		bodyModel[246] = new ModelRendererTurbo(this, 850, 666, textureX, textureY); // Box 270
		bodyModel[247] = new ModelRendererTurbo(this, 850, 687, textureX, textureY); // Box 271
		bodyModel[248] = new ModelRendererTurbo(this, 850, 666, textureX, textureY); // Box 272
		bodyModel[249] = new ModelRendererTurbo(this, 850, 687, textureX, textureY); // Box 273
		bodyModel[250] = new ModelRendererTurbo(this, 850, 700, textureX, textureY); // Box 279
		bodyModel[251] = new ModelRendererTurbo(this, 850, 733, textureX, textureY); // Box 280
		bodyModel[252] = new ModelRendererTurbo(this, 850, 757, textureX, textureY); // Box 281
		bodyModel[253] = new ModelRendererTurbo(this, 850, 733, textureX, textureY); // Box 282
		bodyModel[254] = new ModelRendererTurbo(this, 850, 772, textureX, textureY); // Box 283
		bodyModel[255] = new ModelRendererTurbo(this, 850, 787, textureX, textureY); // Box 284
		bodyModel[256] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 285
		bodyModel[257] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 286
		bodyModel[258] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 287
		bodyModel[259] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 288
		bodyModel[260] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 289
		bodyModel[261] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 290
		bodyModel[262] = new ModelRendererTurbo(this, 850, 787, textureX, textureY); // Box 291
		bodyModel[263] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 292
		bodyModel[264] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 293
		bodyModel[265] = new ModelRendererTurbo(this, 850, 980, textureX, textureY); // Box 294
		bodyModel[266] = new ModelRendererTurbo(this, 850, 1014, textureX, textureY); // Box 295
		bodyModel[267] = new ModelRendererTurbo(this, 850, 1060, textureX, textureY); // Box 296
		bodyModel[268] = new ModelRendererTurbo(this, 850, 1014, textureX, textureY); // Box 297
		bodyModel[269] = new ModelRendererTurbo(this, 850, 980, textureX, textureY); // Box 298
		bodyModel[270] = new ModelRendererTurbo(this, 850, 1110, textureX, textureY); // Box 299
		bodyModel[271] = new ModelRendererTurbo(this, 850, 555, textureX, textureY); // Box 300
		bodyModel[272] = new ModelRendererTurbo(this, 850, 504, textureX, textureY); // Box 301
		bodyModel[273] = new ModelRendererTurbo(this, 850, 444, textureX, textureY); // Box 302
		bodyModel[274] = new ModelRendererTurbo(this, 850, 504, textureX, textureY); // Box 303
		bodyModel[275] = new ModelRendererTurbo(this, 850, 597, textureX, textureY); // Box 304
		bodyModel[276] = new ModelRendererTurbo(this, 850, 687, textureX, textureY); // Box 305
		bodyModel[277] = new ModelRendererTurbo(this, 850, 666, textureX, textureY); // Box 306
		bodyModel[278] = new ModelRendererTurbo(this, 850, 640, textureX, textureY); // Box 307
		bodyModel[279] = new ModelRendererTurbo(this, 850, 666, textureX, textureY); // Box 308
		bodyModel[280] = new ModelRendererTurbo(this, 850, 687, textureX, textureY); // Box 309
		bodyModel[281] = new ModelRendererTurbo(this, 850, 1170, textureX, textureY); // Box 310
		bodyModel[282] = new ModelRendererTurbo(this, 850, 1231, textureX, textureY); // Box 311
		bodyModel[283] = new ModelRendererTurbo(this, 850, 1231, textureX, textureY); // Box 312
		bodyModel[284] = new ModelRendererTurbo(this, 850, 1291, textureX, textureY); // Box 313
		bodyModel[285] = new ModelRendererTurbo(this, 850, 1291, textureX, textureY); // Box 314
		bodyModel[286] = new ModelRendererTurbo(this, 850, 1331, textureX, textureY); // Box 315
		bodyModel[287] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 316
		bodyModel[288] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 317
		bodyModel[289] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 318
		bodyModel[290] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 319
		bodyModel[291] = new ModelRendererTurbo(this, 850, 1408, textureX, textureY); // Box 320
		bodyModel[292] = new ModelRendererTurbo(this, 850, 1408, textureX, textureY); // Box 321
		bodyModel[293] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 322
		bodyModel[294] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 323
		bodyModel[295] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 324
		bodyModel[296] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 325
		bodyModel[297] = new ModelRendererTurbo(this, 850, 1434, textureX, textureY); // Box 326
		bodyModel[298] = new ModelRendererTurbo(this, 850, 1489, textureX, textureY); // Box 327
		bodyModel[299] = new ModelRendererTurbo(this, 850, 1489, textureX, textureY); // Box 328
		bodyModel[300] = new ModelRendererTurbo(this, 850, 757, textureX, textureY); // Box 329
		bodyModel[301] = new ModelRendererTurbo(this, 850, 733, textureX, textureY); // Box 330
		bodyModel[302] = new ModelRendererTurbo(this, 850, 700, textureX, textureY); // Box 331
		bodyModel[303] = new ModelRendererTurbo(this, 850, 733, textureX, textureY); // Box 332
		bodyModel[304] = new ModelRendererTurbo(this, 850, 772, textureX, textureY); // Box 333
		bodyModel[305] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 334
		bodyModel[306] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 335
		bodyModel[307] = new ModelRendererTurbo(this, 850, 787, textureX, textureY); // Box 336
		bodyModel[308] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 337
		bodyModel[309] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 338
		bodyModel[310] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 339
		bodyModel[311] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 340
		bodyModel[312] = new ModelRendererTurbo(this, 850, 787, textureX, textureY); // Box 341
		bodyModel[313] = new ModelRendererTurbo(this, 850, 859, textureX, textureY); // Box 342
		bodyModel[314] = new ModelRendererTurbo(this, 850, 925, textureX, textureY); // Box 343
		bodyModel[315] = new ModelRendererTurbo(this, 850, 980, textureX, textureY); // Box 344
		bodyModel[316] = new ModelRendererTurbo(this, 850, 1014, textureX, textureY); // Box 345
		bodyModel[317] = new ModelRendererTurbo(this, 850, 1060, textureX, textureY); // Box 346
		bodyModel[318] = new ModelRendererTurbo(this, 850, 1014, textureX, textureY); // Box 347
		bodyModel[319] = new ModelRendererTurbo(this, 850, 980, textureX, textureY); // Box 348
		bodyModel[320] = new ModelRendererTurbo(this, 850, 1110, textureX, textureY); // Box 369
		bodyModel[321] = new ModelRendererTurbo(this, 850, 1231, textureX, textureY); // Box 373
		bodyModel[322] = new ModelRendererTurbo(this, 850, 1170, textureX, textureY); // Box 374
		bodyModel[323] = new ModelRendererTurbo(this, 850, 1231, textureX, textureY); // Box 375
		bodyModel[324] = new ModelRendererTurbo(this, 850, 1291, textureX, textureY); // Box 376
		bodyModel[325] = new ModelRendererTurbo(this, 850, 1291, textureX, textureY); // Box 377
		bodyModel[326] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 378
		bodyModel[327] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 379
		bodyModel[328] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 380
		bodyModel[329] = new ModelRendererTurbo(this, 850, 1369, textureX, textureY); // Box 381
		bodyModel[330] = new ModelRendererTurbo(this, 850, 1331, textureX, textureY); // Box 382
		bodyModel[331] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 383
		bodyModel[332] = new ModelRendererTurbo(this, 850, 1408, textureX, textureY); // Box 384
		bodyModel[333] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 385
		bodyModel[334] = new ModelRendererTurbo(this, 850, 1408, textureX, textureY); // Box 386
		bodyModel[335] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 387
		bodyModel[336] = new ModelRendererTurbo(this, 850, 1433, textureX, textureY); // Box 388
		bodyModel[337] = new ModelRendererTurbo(this, 850, 1489, textureX, textureY); // Box 389
		bodyModel[338] = new ModelRendererTurbo(this, 850, 1489, textureX, textureY); // Box 390
		bodyModel[339] = new ModelRendererTurbo(this, 850, 1434, textureX, textureY); // Box 391
		bodyModel[340] = new ModelRendererTurbo(this, 850, 1330, textureX, textureY); // Box 341
		bodyModel[341] = new ModelRendererTurbo(this, 850, 1570, textureX, textureY); // Box 342
		bodyModel[342] = new ModelRendererTurbo(this, 850, 1795, textureX, textureY); // Box 343
		bodyModel[343] = new ModelRendererTurbo(this, 850, 2019, textureX, textureY); // Box 344
		bodyModel[344] = new ModelRendererTurbo(this, 850, 2069, textureX, textureY); // Box 345
		bodyModel[345] = new ModelRendererTurbo(this, 850, 2112, textureX, textureY); // Box 346
		bodyModel[346] = new ModelRendererTurbo(this, 850, 2133, textureX, textureY); // Box 348
		bodyModel[347] = new ModelRendererTurbo(this, 850, 2150, textureX, textureY); // Box 349
		bodyModel[348] = new ModelRendererTurbo(this, 850, 2149, textureX, textureY); // Box 350
		bodyModel[349] = new ModelRendererTurbo(this, 850, 2193, textureX, textureY); // Box 351
		bodyModel[350] = new ModelRendererTurbo(this, 850, 2195, textureX, textureY); // Box 352
		bodyModel[351] = new ModelRendererTurbo(this, 850, 2232, textureX, textureY); // Box 353
		bodyModel[352] = new ModelRendererTurbo(this, 850, 2246, textureX, textureY); // Box 354
		bodyModel[353] = new ModelRendererTurbo(this, 850, 2260, textureX, textureY); // Box 355
		bodyModel[354] = new ModelRendererTurbo(this, 850, 2246, textureX, textureY); // Box 356
		bodyModel[355] = new ModelRendererTurbo(this, 850, 2260, textureX, textureY); // Box 357
		bodyModel[356] = new ModelRendererTurbo(this, 850, 2270, textureX, textureY); // Box 358
		bodyModel[357] = new ModelRendererTurbo(this, 850, 2270, textureX, textureY); // Box 359
		bodyModel[358] = new ModelRendererTurbo(this, 850, 2270, textureX, textureY); // Box 360
		bodyModel[359] = new ModelRendererTurbo(this, 850, 2150, textureX, textureY); // Box 360
		bodyModel[360] = new ModelRendererTurbo(this, 850, 2133, textureX, textureY); // Box 361
		bodyModel[361] = new ModelRendererTurbo(this, 850, 2195, textureX, textureY); // Box 362
		bodyModel[362] = new ModelRendererTurbo(this, 850, 2193, textureX, textureY); // Box 363
		bodyModel[363] = new ModelRendererTurbo(this, 850, 2149, textureX, textureY); // Box 364
		bodyModel[364] = new ModelRendererTurbo(this, 850, 2019, textureX, textureY); // Box 365
		bodyModel[365] = new ModelRendererTurbo(this, 850, 2069, textureX, textureY); // Box 366
		bodyModel[366] = new ModelRendererTurbo(this, 850, 2112, textureX, textureY); // Box 367
		bodyModel[367] = new ModelRendererTurbo(this, 850, 2232, textureX, textureY); // Box 368
		bodyModel[368] = new ModelRendererTurbo(this, 850, 2246, textureX, textureY); // Box 369
		bodyModel[369] = new ModelRendererTurbo(this, 850, 2260, textureX, textureY); // Box 370
		bodyModel[370] = new ModelRendererTurbo(this, 850, 2260, textureX, textureY); // Box 371
		bodyModel[371] = new ModelRendererTurbo(this, 850, 2246, textureX, textureY); // Box 372
		bodyModel[372] = new ModelRendererTurbo(this, 850, 2270, textureX, textureY); // Box 373
		bodyModel[373] = new ModelRendererTurbo(this, 850, 2270, textureX, textureY); // Box 374
		bodyModel[374] = new ModelRendererTurbo(this, 850, 2270, textureX, textureY); // Box 375
		bodyModel[375] = new ModelRendererTurbo(this, 850, 2069, textureX, textureY); // Box 376
		bodyModel[376] = new ModelRendererTurbo(this, 850, 2303, textureX, textureY); // Box 377
		bodyModel[377] = new ModelRendererTurbo(this, 850, 2536, textureX, textureY); // Box 378
		bodyModel[378] = new ModelRendererTurbo(this, 850, 2714, textureX, textureY); // Box 667
		bodyModel[379] = new ModelRendererTurbo(this, 850, 2790, textureX, textureY); // Box 679
		bodyModel[380] = new ModelRendererTurbo(this, 850, 2842, textureX, textureY); // Box 680
		bodyModel[381] = new ModelRendererTurbo(this, 850, 2880, textureX, textureY); // Box 681
		bodyModel[382] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 682
		bodyModel[383] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 683
		bodyModel[384] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 684
		bodyModel[385] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 685
		bodyModel[386] = new ModelRendererTurbo(this, 850, 2980, textureX, textureY); // Box 686
		bodyModel[387] = new ModelRendererTurbo(this, 850, 3005, textureX, textureY); // Box 687
		bodyModel[388] = new ModelRendererTurbo(this, 850, 3044, textureX, textureY); // Box 688
		bodyModel[389] = new ModelRendererTurbo(this, 850, 3096, textureX, textureY); // Box 689
		bodyModel[390] = new ModelRendererTurbo(this, 850, 3172, textureX, textureY); // Box 691
		bodyModel[391] = new ModelRendererTurbo(this, 850, 3193, textureX, textureY); // Box 692
		bodyModel[392] = new ModelRendererTurbo(this, 850, 3263, textureX, textureY); // Box 693
		bodyModel[393] = new ModelRendererTurbo(this, 850, 3311, textureX, textureY); // Box 694
		bodyModel[394] = new ModelRendererTurbo(this, 850, 3345, textureX, textureY); // Box 695
		bodyModel[395] = new ModelRendererTurbo(this, 850, 3400, textureX, textureY); // Box 696
		bodyModel[396] = new ModelRendererTurbo(this, 850, 3438, textureX, textureY); // Box 697
		bodyModel[397] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 698
		bodyModel[398] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 699
		bodyModel[399] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 700
		bodyModel[400] = new ModelRendererTurbo(this, 850, 2906, textureX, textureY); // Box 701
		bodyModel[401] = new ModelRendererTurbo(this, 850, 2714, textureX, textureY); // Box 702
		bodyModel[402] = new ModelRendererTurbo(this, 850, 2790, textureX, textureY); // Box 703
		bodyModel[403] = new ModelRendererTurbo(this, 850, 2842, textureX, textureY); // Box 704
		bodyModel[404] = new ModelRendererTurbo(this, 850, 2880, textureX, textureY); // Box 705
		bodyModel[405] = new ModelRendererTurbo(this, 850, 2980, textureX, textureY); // Box 706
		bodyModel[406] = new ModelRendererTurbo(this, 850, 3005, textureX, textureY); // Box 707
		bodyModel[407] = new ModelRendererTurbo(this, 850, 3044, textureX, textureY); // Box 708
		bodyModel[408] = new ModelRendererTurbo(this, 850, 3096, textureX, textureY); // Box 709
		bodyModel[409] = new ModelRendererTurbo(this, 850, 3193, textureX, textureY); // Box 710
		bodyModel[410] = new ModelRendererTurbo(this, 850, 3311, textureX, textureY); // Box 711
		bodyModel[411] = new ModelRendererTurbo(this, 850, 3263, textureX, textureY); // Box 712
		bodyModel[412] = new ModelRendererTurbo(this, 850, 3172, textureX, textureY); // Box 713
		bodyModel[413] = new ModelRendererTurbo(this, 850, 3345, textureX, textureY); // Box 714
		bodyModel[414] = new ModelRendererTurbo(this, 850, 3400, textureX, textureY); // Box 715
		bodyModel[415] = new ModelRendererTurbo(this, 850, 3438, textureX, textureY); // Box 716
		bodyModel[416] = new ModelRendererTurbo(this, 850, 3302, textureX, textureY); // Box 705
		bodyModel[417] = new ModelRendererTurbo(this, 850, 3482, textureX, textureY); // Box 706
		bodyModel[418] = new ModelRendererTurbo(this, 850, 3662, textureX, textureY); // Box 707
		bodyModel[419] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 708
		bodyModel[420] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 709
		bodyModel[421] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 710
		bodyModel[422] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 711
		bodyModel[423] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 712
		bodyModel[424] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 713
		bodyModel[425] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 714
		bodyModel[426] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 715
		bodyModel[427] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 716
		bodyModel[428] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 717
		bodyModel[429] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 718
		bodyModel[430] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 719
		bodyModel[431] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 720
		bodyModel[432] = new ModelRendererTurbo(this, 850, 3842, textureX, textureY); // Box 721
		bodyModel[433] = new ModelRendererTurbo(this, 850, 3845, textureX, textureY); // Box 722
		bodyModel[434] = new ModelRendererTurbo(this, 850, 3845, textureX, textureY); // Box 723
		bodyModel[435] = new ModelRendererTurbo(this, 850, 3900, textureX, textureY); // Box 724
		bodyModel[436] = new ModelRendererTurbo(this, 850, 3918, textureX, textureY); // Box 725
		bodyModel[437] = new ModelRendererTurbo(this, 850, 3940, textureX, textureY); // Box 726
		bodyModel[438] = new ModelRendererTurbo(this, 850, 3975, textureX, textureY); // Box 727
		bodyModel[439] = new ModelRendererTurbo(this, 850, 4000, textureX, textureY); // Box 728
		bodyModel[440] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 729
		bodyModel[441] = new ModelRendererTurbo(this, 1000, 24, textureX, textureY); // Box 730
		bodyModel[442] = new ModelRendererTurbo(this, 1000, 42, textureX, textureY); // Box 731
		bodyModel[443] = new ModelRendererTurbo(this, 1000, 24, textureX, textureY); // Box 732
		bodyModel[444] = new ModelRendererTurbo(this, 1000, 42, textureX, textureY); // Box 733
		bodyModel[445] = new ModelRendererTurbo(this, 1000, 58, textureX, textureY); // Box 735
		bodyModel[446] = new ModelRendererTurbo(this, 1000, 84, textureX, textureY); // Box 736
		bodyModel[447] = new ModelRendererTurbo(this, 1000, 111, textureX, textureY); // Box 737
		bodyModel[448] = new ModelRendererTurbo(this, 1000, 84, textureX, textureY); // Box 739
		bodyModel[449] = new ModelRendererTurbo(this, 1000, 58, textureX, textureY); // Box 740
		bodyModel[450] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 741
		bodyModel[451] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 742
		bodyModel[452] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 743
		bodyModel[453] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 744
		bodyModel[454] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 745
		bodyModel[455] = new ModelRendererTurbo(this, 1000, 42, textureX, textureY); // Box 746
		bodyModel[456] = new ModelRendererTurbo(this, 1000, 24, textureX, textureY); // Box 747
		bodyModel[457] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 748
		bodyModel[458] = new ModelRendererTurbo(this, 1000, 24, textureX, textureY); // Box 749
		bodyModel[459] = new ModelRendererTurbo(this, 1000, 42, textureX, textureY); // Box 750
		bodyModel[460] = new ModelRendererTurbo(this, 1000, 58, textureX, textureY); // Box 756
		bodyModel[461] = new ModelRendererTurbo(this, 1000, 84, textureX, textureY); // Box 757
		bodyModel[462] = new ModelRendererTurbo(this, 1000, 111, textureX, textureY); // Box 758
		bodyModel[463] = new ModelRendererTurbo(this, 1000, 58, textureX, textureY); // Box 759
		bodyModel[464] = new ModelRendererTurbo(this, 1000, 84, textureX, textureY); // Box 760
		bodyModel[465] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 761
		bodyModel[466] = new ModelRendererTurbo(this, 1100, 330, textureX, textureY); // Box 762
		bodyModel[467] = new ModelRendererTurbo(this, 1100, 330, textureX, textureY); // Box 763
		bodyModel[468] = new ModelRendererTurbo(this, 1100, 440, textureX, textureY); // Box 764
		bodyModel[469] = new ModelRendererTurbo(this, 1100, 440, textureX, textureY); // Box 765
		bodyModel[470] = new ModelRendererTurbo(this, 1100, 551, textureX, textureY); // Box 766
		bodyModel[471] = new ModelRendererTurbo(this, 1100, 551, textureX, textureY); // Box 767
		bodyModel[472] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 768
		bodyModel[473] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 769
		bodyModel[474] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 770
		bodyModel[475] = new ModelRendererTurbo(this, 1100, 590, textureX, textureY); // Box 771
		bodyModel[476] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 772
		bodyModel[477] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 773
		bodyModel[478] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 774
		bodyModel[479] = new ModelRendererTurbo(this, 1100, 621, textureX, textureY); // Box 775
		bodyModel[480] = new ModelRendererTurbo(this, 1100, 620, textureX, textureY); // Box 776
		bodyModel[481] = new ModelRendererTurbo(this, 1100, 411, textureX, textureY); // Box 777
		bodyModel[482] = new ModelRendererTurbo(this, 1100, 620, textureX, textureY); // Box 778
		bodyModel[483] = new ModelRendererTurbo(this, 1100, 551, textureX, textureY); // Box 779
		bodyModel[484] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 780
		bodyModel[485] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 781
		bodyModel[486] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 782
		bodyModel[487] = new ModelRendererTurbo(this, 1100, 590, textureX, textureY); // Box 783
		bodyModel[488] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 784
		bodyModel[489] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 785
		bodyModel[490] = new ModelRendererTurbo(this, 1100, 575, textureX, textureY); // Box 786
		bodyModel[491] = new ModelRendererTurbo(this, 1100, 621, textureX, textureY); // Box 787
		bodyModel[492] = new ModelRendererTurbo(this, 1100, 551, textureX, textureY); // Box 788
		bodyModel[493] = new ModelRendererTurbo(this, 1100, 706, textureX, textureY); // Box 789
		bodyModel[494] = new ModelRendererTurbo(this, 1100, 760, textureX, textureY); // Box 790
		bodyModel[495] = new ModelRendererTurbo(this, 1100, 706, textureX, textureY); // Box 791
		bodyModel[496] = new ModelRendererTurbo(this, 1100, 988, textureX, textureY); // Box 792
		bodyModel[497] = new ModelRendererTurbo(this, 1100, 1843, textureX, textureY); // Box 793
		bodyModel[498] = new ModelRendererTurbo(this, 1100, 2543, textureX, textureY); // Box 794
		bodyModel[499] = new ModelRendererTurbo(this, 1100, 2835, textureX, textureY); // Box 795

		bodyModel[0].addShapeBox(0F, 0F, 0F, 30, 91, 48, 0F,0F, 0F, 0F, 0F, -14F, -12F, 0F, -14F, -12F, 0F, 0F, 0F, 0F, 4F, 3F, -10F, 0F, -4F, -10F, 0F, -4F, 0F, 4F, 3F); // Box 1
		bodyModel[0].setRotationPoint(148F, -367F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 8, 16, 0F,0F, 0F, 0F, -2F, -4F, 1F, -2F, -4F, 1F, 0F, 0F, 0F, 3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 3F, 0F, 2F); // Box 5
		bodyModel[1].setRotationPoint(177F, -336F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 49, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, 8F, 0F, 4F); // Box 6
		bodyModel[2].setRotationPoint(175F, -328F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(171F, -279F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 11, 28, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 8
		bodyModel[4].setRotationPoint(134F, -279F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F); // Box 9
		bodyModel[5].setRotationPoint(126F, -271F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 92, 40, 54, 0F,0F, 0F, 23F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 23F, 0F, 13F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 23F); // Box 10
		bodyModel[6].setRotationPoint(56F, -312F, -27F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 92, 55, 11, 0F,0F, 24F, 26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, -26F, 0F, 0F, 26F, 0F, 0F, 1.64F, 0F, 0F, 0F, 0F, 0F, -26F); // Box 12
		bodyModel[7].setRotationPoint(56F, -367F, -24F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 92, 40, 5, 0F,0F, 0F, 23F, 0F, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, -23F, 0F, 13F, 23F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 13F, -23F); // Box 14
		bodyModel[8].setRotationPoint(56F, -312F, -32F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 91, 5, 0F,0F, -5F, 0F, -3F, -19F, -12F, 0F, -14F, 12F, 0F, 0F, 0F, 0F, -1F, 3F, -13F, -5F, -4F, -10F, 0F, 4F, 0F, 4F, -3F); // Box 15
		bodyModel[9].setRotationPoint(148F, -367F, -29F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 92, 55, 5, 0F,0F, 19F, 26F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 24F, -26F, 0F, 0F, 26F, 0F, 0F, 1.64F, 0F, 0F, 0F, 0F, 0F, -26F); // Box 17
		bodyModel[10].setRotationPoint(56F, -367F, -29F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 92, 55, 5, 0F,0F, 24F, -26F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 19F, 26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 1.64F, 0F, 0F, 26F); // Box 18
		bodyModel[11].setRotationPoint(56F, -367F, 24F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 92, 55, 11, 0F,0F, 24F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 1.64F, 0F, 0F, 26F); // Box 19
		bodyModel[12].setRotationPoint(56F, -367F, 13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 30, 91, 5, 0F,0F, 0F, 0F, 0F, -14F, 12F, -3F, -19F, -12F, 0F, -5F, 0F, 0F, 4F, -3F, -10F, 0F, 4F, -13F, -5F, -4F, 0F, -1F, 3F); // Box 20
		bodyModel[13].setRotationPoint(148F, -367F, 24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 92, 40, 5, 0F,0F, 0F, -23F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, 23F, 0F, 13F, -23F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 13F, 23F); // Box 21
		bodyModel[14].setRotationPoint(56F, -312F, 27F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, -2F, 0F, -4F, -4F, 1F, -2F, -4F, -1F, 0F, 0F, 0F, 3F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, -2F, 3F, 0F, -2F); // Box 23
		bodyModel[15].setRotationPoint(177F, -336F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 49, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 4F, -4F, 0F, 4F, -2F, 0F, -4F, 8F, 0F, -4F); // Box 24
		bodyModel[16].setRotationPoint(175F, -328F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(171F, -279F, -16F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 37, 11, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 3F); // Box 26
		bodyModel[18].setRotationPoint(134F, -279F, -16F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -1F, 0F); // Box 27
		bodyModel[19].setRotationPoint(126F, -271F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F); // Box 28
		bodyModel[20].setRotationPoint(126F, -271F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 37, 11, 2, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 29
		bodyModel[21].setRotationPoint(134F, -279F, 14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -3F, 0F, 0F, -2F, 0F); // Box 30
		bodyModel[22].setRotationPoint(171F, -279F, 14F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 49, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -4F, -2F, 0F, -4F, -4F, 0F, 4F, 8F, 0F, 4F); // Box 31
		bodyModel[23].setRotationPoint(175F, -328F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, -2F, -4F, -1F, -4F, -4F, 1F, 0F, -2F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 2F, 3F, 0F, 2F); // Box 32
		bodyModel[24].setRotationPoint(177F, -336F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 92, 4, 26, 0F,0F, 24F, 26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 26F, 0F, -24F, 26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 26F); // Box 33
		bodyModel[25].setRotationPoint(56F, -367F, -13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(113F, -388F, -10F);
		bodyModel[26].rotateAngleZ = -0.17453293F;

		bodyModel[27].addShapeBox(8F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 35
		bodyModel[27].setRotationPoint(113F, -388F, -10F);
		bodyModel[27].rotateAngleZ = -0.17453293F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[28].setRotationPoint(107F, -388F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(103F, -387.5F, -10F);
		bodyModel[29].rotateAngleZ = 0.12217305F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 6, 20, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(100F, -387F, -10F);
		bodyModel[30].rotateAngleZ = 0.16580628F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(96F, -385F, -10F);
		bodyModel[31].rotateAngleZ = 0.46251225F;

		bodyModel[32].addShapeBox(0F, 1F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(96F, -385F, -6F);
		bodyModel[32].rotateAngleZ = 0.46251225F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(93F, -383F, -10F);
		bodyModel[33].rotateAngleZ = 0.5846853F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(92F, -381F, -10F);
		bodyModel[34].rotateAngleZ = 1.10828408F;

		bodyModel[35].addShapeBox(0F, 1F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(93F, -383F, -6F);
		bodyModel[35].rotateAngleZ = 0.5846853F;

		bodyModel[36].addShapeBox(0F, 1F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[36].setRotationPoint(92F, -381F, -6F);
		bodyModel[36].rotateAngleZ = 1.10828408F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(96F, -385F, 6F);
		bodyModel[37].rotateAngleZ = 0.46251225F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[38].setRotationPoint(93F, -383F, 6F);
		bodyModel[38].rotateAngleZ = 0.5846853F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(92F, -381F, 6F);
		bodyModel[39].rotateAngleZ = 1.10828408F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 24, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 48
		bodyModel[40].setRotationPoint(113F, -387.5F, -6F);
		bodyModel[40].rotateAngleZ = -0.27925268F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 49
		bodyModel[41].setRotationPoint(113F, -387.5F, -12F);
		bodyModel[41].rotateAngleZ = -0.27925268F;

		bodyModel[42].addShapeBox(-6F, 2F, 0F, 36, 2, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(113F, -387.5F, -18F);
		bodyModel[42].rotateAngleZ = -0.27925268F;

		bodyModel[43].addShapeBox(-6F, 2F, 0F, 30, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 53
		bodyModel[43].setRotationPoint(113F, -387.5F, -6F);
		bodyModel[43].rotateAngleZ = -0.27925268F;

		bodyModel[44].addShapeBox(-6F, 2F, 0F, 36, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 4F); // Box 54
		bodyModel[44].setRotationPoint(113F, -387.5F, 6F);
		bodyModel[44].rotateAngleZ = -0.27925268F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 55
		bodyModel[45].setRotationPoint(113F, -387.5F, 6F);
		bodyModel[45].rotateAngleZ = -0.27925268F;

		bodyModel[46].addShapeBox(-10F, 4F, -4F, 44, 2, 16, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 56
		bodyModel[46].setRotationPoint(113F, -387.5F, -18F);
		bodyModel[46].rotateAngleZ = -0.27925268F;

		bodyModel[47].addShapeBox(-12F, 6F, -6F, 48, 6, 18, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 57
		bodyModel[47].setRotationPoint(113F, -387.5F, -18F);
		bodyModel[47].rotateAngleZ = -0.27925268F;

		bodyModel[48].addShapeBox(-12F, 6F, 0F, 48, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F); // Box 58
		bodyModel[48].setRotationPoint(113F, -387.5F, 6F);
		bodyModel[48].rotateAngleZ = -0.27925268F;

		bodyModel[49].addShapeBox(-10F, 4F, 0F, 44, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F); // Box 59
		bodyModel[49].setRotationPoint(113F, -387.5F, 6F);
		bodyModel[49].rotateAngleZ = -0.27925268F;

		bodyModel[50].addShapeBox(24F, 2F, 2F, 1, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 60
		bodyModel[50].setRotationPoint(113F, -387.5F, -6F);
		bodyModel[50].rotateAngleZ = -0.27925268F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 45, 20, 0F,0F, 0F, 0F, 0F, -4F, -18F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -18F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[51].setRotationPoint(138F, -348F, -51F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 9, 20, 0F,1.8F, -3F, -9F, 0F, -11F, -18F, 0F, -11F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -18F, 0F, 4F, 0F, 4F, 0F, 0F); // Box 62
		bodyModel[52].setRotationPoint(138F, -357F, -51F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 9, 20, 0F,0F, 0F, 0F, 0F, 4F, -18F, 0F, 4F, 0F, 4F, 0F, 0F, 1.8F, -3F, -9F, 0F, -11F, -18F, 0F, -11F, 0F, 4F, 0F, 0F); // Box 63
		bodyModel[53].setRotationPoint(138F, -303F, -51F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 37, 40, 38, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 65
		bodyModel[54].setRotationPoint(88F, -340F, -73F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 37, 11, 36, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[55].setRotationPoint(88F, -351F, -71F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, -2.972F, 0F, 0F, 0F, 0F, 0F, -2.972F, 0F, 0F, 0F, 0F, 0F, -2.972F, 0F, 0F, 0F, 0F, 0F, -2.972F); // Box 67
		bodyModel[56].setRotationPoint(88F, -351F, -73F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, -7.297F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 7.297F, 0F, 0F, -7.297F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 7.297F); // Box 68
		bodyModel[57].setRotationPoint(115F, -351F, -73F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 37, 9, 36, 0F,0F, -2F, -5F, 0F, -3F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[58].setRotationPoint(88F, -360F, -73F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 37, 17, 36, 0F,0F, -7F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F, -5F, 0F, -12F, -15F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[59].setRotationPoint(88F, -300F, -73F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 45, 36, 0F,0F, 7F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 4F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 75
		bodyModel[60].setRotationPoint(125F, -348F, -56F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 76
		bodyModel[61].setRotationPoint(125F, -348F, -57F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 77
		bodyModel[62].setRotationPoint(125F, -344F, -57F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 78
		bodyModel[63].setRotationPoint(125F, -340F, -57F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 79
		bodyModel[64].setRotationPoint(125F, -336F, -57F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 80
		bodyModel[65].setRotationPoint(125F, -332F, -57F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 81
		bodyModel[66].setRotationPoint(125F, -328F, -57F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 82
		bodyModel[67].setRotationPoint(125F, -324F, -57F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 83
		bodyModel[68].setRotationPoint(125F, -320F, -57F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 84
		bodyModel[69].setRotationPoint(125F, -316F, -57F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 85
		bodyModel[70].setRotationPoint(125F, -312F, -57F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 86
		bodyModel[71].setRotationPoint(125F, -308F, -57F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 87
		bodyModel[72].setRotationPoint(125F, -304F, -57F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 6F, 0F, 0F, 0F); // Box 88
		bodyModel[73].setRotationPoint(125F, -356F, -55F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 6F, 0F, 0F, 0F); // Box 92
		bodyModel[74].setRotationPoint(125F, -356F, -51F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 6F, 0F, 0F, 0F); // Box 93
		bodyModel[75].setRotationPoint(125F, -356F, -47F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 6F, 0F, 0F, 0F); // Box 94
		bodyModel[76].setRotationPoint(125F, -356F, -43F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 6F, 0F, 0F, 0F); // Box 95
		bodyModel[77].setRotationPoint(125F, -356F, -39F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -6F, 0F, 4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 6F, 0F, 0F, 0F); // Box 96
		bodyModel[78].setRotationPoint(125F, -299F, -54F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -6F, 0F, 4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 6F, 0F, 0F, 0F); // Box 97
		bodyModel[79].setRotationPoint(125F, -299F, -50F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -6F, 0F, 4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 6F, 0F, 0F, 0F); // Box 98
		bodyModel[80].setRotationPoint(125F, -299F, -46F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -6F, 0F, 4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 6F, 0F, 0F, 0F); // Box 99
		bodyModel[81].setRotationPoint(125F, -299F, -42F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 45, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[82].setRotationPoint(136F, -348F, -51F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,1.8F, -3F, -9F, -1.8F, -3F, -9F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 102
		bodyModel[83].setRotationPoint(136F, -357F, -51F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1.8F, -3F, -9F, -1.8F, -3F, -9F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 103
		bodyModel[84].setRotationPoint(136F, -303F, -51F);

		bodyModel[85].addShapeBox(13F, 0F, 0F, 2, 11, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[85].setRotationPoint(88F, -351F, -73F);
		bodyModel[85].rotateAngleY = 0.2639636F;

		bodyModel[86].addShapeBox(17F, 0F, 0F, 2, 11, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[86].setRotationPoint(88F, -351F, -73F);
		bodyModel[86].rotateAngleY = 0.2639636F;

		bodyModel[87].addShapeBox(21F, 0F, 0F, 2, 11, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[87].setRotationPoint(88F, -351F, -73F);
		bodyModel[87].rotateAngleY = 0.2639636F;

		bodyModel[88].addShapeBox(25F, 0F, 0F, 2, 11, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[88].setRotationPoint(88F, -351F, -73F);
		bodyModel[88].rotateAngleY = 0.2639636F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,4F, 0F, 0F, -4F, 0F, 0F, -1.8F, -3F, -9F, 1.8F, -3F, -9F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[89].setRotationPoint(136F, -357F, 31F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 45, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[90].setRotationPoint(136F, -348F, 31F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 45, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -18F, 0F, 0F, 0F); // Box 110
		bodyModel[91].setRotationPoint(138F, -348F, 31F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 9, 20, 0F,4F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -18F, 1.8F, -3F, -9F, 4F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -18F, 0F, 0F, 0F); // Box 111
		bodyModel[92].setRotationPoint(138F, -357F, 31F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 9, 20, 0F,4F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -18F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -18F, 1.8F, -3F, -9F); // Box 112
		bodyModel[93].setRotationPoint(138F, -303F, 31F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1.8F, -3F, -9F, 1.8F, -3F, -9F); // Box 113
		bodyModel[94].setRotationPoint(136F, -303F, 31F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 37, 17, 36, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -12F, -15F, 0F, -2F, -5F); // Box 114
		bodyModel[95].setRotationPoint(88F, -300F, 37F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 37, 40, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 7F, 0F); // Box 115
		bodyModel[96].setRotationPoint(88F, -340F, 35F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 37, 11, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 116
		bodyModel[97].setRotationPoint(88F, -351F, 35F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 7.297F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -7.297F, 0F, 0F, 7.297F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -7.297F); // Box 117
		bodyModel[98].setRotationPoint(115F, -351F, 71F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 11, 11, 5, 0F,0F, 0F, -2.972F, 0F, 0F, 0F, 0F, 0F, -2.972F, 0F, 0F, 0F, 0F, 0F, -2.972F, 0F, 0F, 0F, 0F, 0F, -2.972F, 0F, 0F, 0F); // Box 118
		bodyModel[99].setRotationPoint(88F, -351F, 68F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 37, 9, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -15F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 119
		bodyModel[100].setRotationPoint(88F, -360F, 37F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 7F, -6F, 0F, 0F, 0F); // Box 120
		bodyModel[101].setRotationPoint(125F, -356F, 54F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 7F, -6F, 0F, 0F, 0F); // Box 121
		bodyModel[102].setRotationPoint(125F, -356F, 50F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 7F, -6F, 0F, 0F, 0F); // Box 122
		bodyModel[103].setRotationPoint(125F, -356F, 46F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 7F, -6F, 0F, 0F, 0F); // Box 123
		bodyModel[104].setRotationPoint(125F, -356F, 42F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 6F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 6F, 0F, 7F, -6F, 0F, 0F, 0F); // Box 124
		bodyModel[105].setRotationPoint(125F, -356F, 38F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 125
		bodyModel[106].setRotationPoint(125F, -348F, 56F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 126
		bodyModel[107].setRotationPoint(125F, -344F, 56F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 127
		bodyModel[108].setRotationPoint(125F, -340F, 56F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(125F, -336F, 56F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 129
		bodyModel[110].setRotationPoint(125F, -332F, 56F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 130
		bodyModel[111].setRotationPoint(125F, -328F, 56F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 131
		bodyModel[112].setRotationPoint(125F, -324F, 56F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 132
		bodyModel[113].setRotationPoint(125F, -320F, 56F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 133
		bodyModel[114].setRotationPoint(125F, -316F, 56F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 134
		bodyModel[115].setRotationPoint(125F, -312F, 56F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 135
		bodyModel[116].setRotationPoint(125F, -308F, 56F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 136
		bodyModel[117].setRotationPoint(125F, -304F, 56F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 137
		bodyModel[118].setRotationPoint(125F, -299F, 41F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 138
		bodyModel[119].setRotationPoint(125F, -299F, 45F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 139
		bodyModel[120].setRotationPoint(125F, -299F, 49F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 140
		bodyModel[121].setRotationPoint(125F, -299F, 53F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 45, 36, 0F,0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 7F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 4F, 0F); // Box 141
		bodyModel[122].setRotationPoint(125F, -348F, 20F);

		bodyModel[123].addShapeBox(25F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[123].setRotationPoint(88F, -351F, 71F);
		bodyModel[123].rotateAngleY = -0.2639636F;

		bodyModel[124].addShapeBox(21F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[124].setRotationPoint(88F, -351F, 71F);
		bodyModel[124].rotateAngleY = -0.2639636F;

		bodyModel[125].addShapeBox(17F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[125].setRotationPoint(88F, -351F, 71F);
		bodyModel[125].rotateAngleY = -0.2639636F;

		bodyModel[126].addShapeBox(13F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[126].setRotationPoint(88F, -351F, 71F);
		bodyModel[126].rotateAngleY = -0.2639636F;

		bodyModel[127].addShapeBox(0F, 0F, -56F, 83, 154, 112, 0F,0F, 0F, 0F, 0F, -22F, -6F, 0F, -22F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 146
		bodyModel[127].setRotationPoint(-27F, -413F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 83, 154, 5, 0F,0F, -5F, 0F, 0F, -27F, -6F, 0F, -22F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 147
		bodyModel[128].setRotationPoint(-27F, -413F, -61F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 83, 154, 5, 0F,0F, 0F, 0F, 0F, -22F, 6F, 0F, -27F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 148
		bodyModel[129].setRotationPoint(-27F, -413F, 56F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 53, 14, 82, 0F,0F, 0F, -4F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 149
		bodyModel[130].setRotationPoint(-27F, -418F, -41F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 53, 14, 82, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 150
		bodyModel[131].setRotationPoint(-27F, -404F, -41F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 43, 14, 60, 0F,0F, 0F, 0F, 0F, -16F, -10F, 0F, -16F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -10F, 0F, 3F, -10F, 0F, 0F, 0F); // Box 151
		bodyModel[132].setRotationPoint(26F, -404F, -30F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 43, 14, 60, 0F,0F, 0F, -10F, -4F, -23F, -17F, -4F, -23F, -17F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 16F, -10F, 0F, 16F, -10F, 0F, 0F, 0F); // Box 152
		bodyModel[133].setRotationPoint(26F, -418F, -30F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 11, 14, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[134].setRotationPoint(30F, -400F, -32F);

		bodyModel[135].addShapeBox(0F, 0F, -4F, 11, 14, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[135].setRotationPoint(30F, -400F, -32F);

		bodyModel[136].addShapeBox(0F, 0F, -8F, 9, 14, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[136].setRotationPoint(31F, -400F, -31F);

		bodyModel[137].addShapeBox(0F, 0F, -8F, 9, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 156
		bodyModel[137].setRotationPoint(31F, -400F, 44F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 11, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 157
		bodyModel[138].setRotationPoint(30F, -400F, 32F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 27, 5, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 17F, 0F, 0F, 17F); // Box 158
		bodyModel[139].setRotationPoint(34F, -427F, -53F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 27, 5, 0F,1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -17F, 0F, 0F, -18F, 0F, 0F, 16F, 0F, 0F, 17F); // Box 159
		bodyModel[140].setRotationPoint(37F, -427F, -53F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 27, 5, 0F,-1F, 0F, -2F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -18F, 0F, 0F, -17F, 0F, 0F, 17F, 0F, 0F, 16F); // Box 160
		bodyModel[141].setRotationPoint(33F, -427F, -53F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 161
		bodyModel[142].setRotationPoint(35F, -486F, -63F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -12F, 0F, 0F, 10F, 0F, 0F, 11F); // Box 162
		bodyModel[143].setRotationPoint(36F, -486F, -63F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 10F); // Box 163
		bodyModel[144].setRotationPoint(34F, -486F, -63F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, -12F); // Box 164
		bodyModel[145].setRotationPoint(34F, -486F, 60F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, -11F); // Box 165
		bodyModel[146].setRotationPoint(35F, -486F, 60F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 59, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 10F, 0F, 0F, -12F, 0F, 0F, -11F); // Box 166
		bodyModel[147].setRotationPoint(36F, -486F, 60F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 27, 5, 0F,1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 17F, 0F, 0F, 16F, 0F, 0F, -18F, 0F, 0F, -17F); // Box 167
		bodyModel[148].setRotationPoint(37F, -427F, 48F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 27, 5, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, -17F, 0F, 0F, -17F); // Box 168
		bodyModel[149].setRotationPoint(34F, -427F, 48F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 27, 5, 0F,-1F, 0F, -2F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 16F, 0F, 0F, 17F, 0F, 0F, -17F, 0F, 0F, -18F); // Box 169
		bodyModel[150].setRotationPoint(33F, -427F, 48F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 23, 11, 52, 0F,0F, 0F, 0F, 0F, 5F, -13F, 0F, 5F, -13F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -14F, -13F, 0F, -14F, -13F, 0F, 0F, -3F); // Box 170
		bodyModel[151].setRotationPoint(93F, -264F, -26F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 23, 11, 3, 0F,0F, 0F, 0F, 0F, 5F, 13F, -3F, 5F, -10F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -14F, 13F, -3F, -12F, -13F, 0F, -3F, -3F); // Box 172
		bodyModel[152].setRotationPoint(93F, -264F, 26F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 50, 11, 82, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 7F, -3F); // Box 173
		bodyModel[153].setRotationPoint(35F, -264F, -41F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 50, 4, 76, 0F,0F, -7F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -7F, 0F, 0F, 7F, -3F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 7F, -3F); // Box 174
		bodyModel[154].setRotationPoint(35F, -253F, -38F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 9, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[155].setRotationPoint(85F, -264F, -23F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[156].setRotationPoint(85F, -255F, -23F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[157].setRotationPoint(85F, -255F, -19F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[158].setRotationPoint(85F, -255F, -15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[159].setRotationPoint(85F, -255F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[160].setRotationPoint(85F, -255F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[161].setRotationPoint(85F, -255F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[162].setRotationPoint(85F, -255F, 2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[163].setRotationPoint(85F, -255F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[164].setRotationPoint(85F, -255F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[165].setRotationPoint(85F, -255F, 14F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[166].setRotationPoint(85F, -255F, 18F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[167].setRotationPoint(85F, -255F, 22F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[168].setRotationPoint(85F, -256F, -24F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[169].setRotationPoint(85F, -260F, -24F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[170].setRotationPoint(85F, -264F, -24F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[171].setRotationPoint(85F, -264F, 23F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[172].setRotationPoint(85F, -260F, 23F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[173].setRotationPoint(85F, -256F, 23F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 81, 42, 38, 0F,0F, 0F, 0F, 0F, -15F, -16F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[174].setRotationPoint(-27F, -395F, -96F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 81, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -11.6F, -22F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[175].setRotationPoint(-27F, -353F, -96F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 81, 2, 38, 0F,0F, 0F, 0F, -22F, 0F, -11.6F, -22F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.58F, -27F, 0F, -10.5F, -27F, 0F, 0F, -8F, 0F, 0F); // Box 196
		bodyModel[176].setRotationPoint(-27F, -351F, -96F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 81, 2, 38, 0F,-8F, 0F, -1.58F, -27F, 0F, -10.5F, -27F, 0F, 0F, -8F, 0F, 0F, -14F, 0F, -2.76F, -31F, 0F, -9.87F, -31F, 0F, 0F, -14F, 0F, 0F); // Box 197
		bodyModel[177].setRotationPoint(-27F, -349F, -96F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-14F, 0F, -2.76F, -31F, 0F, -9.87F, -31F, 0F, 0F, -14F, 0F, 0F, -16F, 0F, -3.16F, -36F, 0F, -8.88F, -36F, 0F, 0F, -16F, 0F, 0F); // Box 198
		bodyModel[178].setRotationPoint(-27F, -347F, -96F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-16F, 0F, -3.16F, -36F, 0F, -8.88F, -36F, 0F, 0F, -16F, 0F, 0F, -18F, 0F, -3.5F, -40F, 0F, -8.09F, -40F, 0F, 0F, -18F, 0F, 0F); // Box 199
		bodyModel[179].setRotationPoint(-27F, -344F, -96F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-18F, 0F, -3.5F, -40F, 0F, -8.09F, -40F, 0F, 0F, -18F, 0F, 0F, -19F, 0F, -3.75F, -43F, 0F, -7.5F, -43F, 0F, 0F, -19F, 0F, 0F); // Box 200
		bodyModel[180].setRotationPoint(-27F, -341F, -96F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-19F, 0F, -3.75F, -43F, 0F, -7.5F, -43F, 0F, 0F, -19F, 0F, 0F, -20F, 0F, -3.95F, -45F, 0F, -7.1F, -45F, 0F, 0F, -20F, 0F, 0F); // Box 201
		bodyModel[181].setRotationPoint(-27F, -338F, -96F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 81, 42, 38, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); // Box 202
		bodyModel[182].setRotationPoint(-27F, -395F, 58F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 81, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -11.6F, 0F, 0F, 0F); // Box 203
		bodyModel[183].setRotationPoint(-27F, -353F, 58F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 81, 2, 38, 0F,0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -11.6F, 0F, 0F, 0F, -8F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, -10.5F, -8F, 0F, -1.58F); // Box 204
		bodyModel[184].setRotationPoint(-27F, -351F, 58F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 81, 2, 38, 0F,-8F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, -10.5F, -8F, 0F, -1.58F, -14F, 0F, 0F, -31F, 0F, 0F, -31F, 0F, -9.87F, -14F, 0F, -2.76F); // Box 205
		bodyModel[185].setRotationPoint(-27F, -349F, 58F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-16F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, -8.88F, -16F, 0F, -3.16F, -18F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -8.09F, -18F, 0F, -3.5F); // Box 206
		bodyModel[186].setRotationPoint(-27F, -344F, 58F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-18F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -8.09F, -18F, 0F, -3.5F, -19F, 0F, 0F, -43F, 0F, 0F, -43F, 0F, -7.5F, -19F, 0F, -3.75F); // Box 207
		bodyModel[187].setRotationPoint(-27F, -341F, 58F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-19F, 0F, 0F, -43F, 0F, 0F, -43F, 0F, -7.5F, -19F, 0F, -3.75F, -20F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, -7.1F, -20F, 0F, -3.95F); // Box 208
		bodyModel[188].setRotationPoint(-27F, -338F, 58F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 81, 3, 38, 0F,-14F, 0F, 0F, -31F, 0F, 0F, -31F, 0F, -9.87F, -14F, 0F, -2.76F, -16F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, -8.88F, -16F, 0F, -3.16F); // Box 209
		bodyModel[189].setRotationPoint(-27F, -347F, 58F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 27, 38, 0F,0F, 0F, 0F, 0F, -13F, -0.35F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.35F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[190].setRotationPoint(54F, -380F, -80F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 18, 38, 0F,0F, 0F, -0.35F, 0F, -6F, -1.05F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -0.35F, 0F, 0F, -1.05F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 211
		bodyModel[191].setRotationPoint(56F, -367F, -80F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 14, 38, 0F,0F, 0F, -1.05F, 0F, -4F, -1.76F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -1.05F, 0F, 0F, -1.76F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 212
		bodyModel[192].setRotationPoint(60F, -361F, -80F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 7, 15, 38, 0F,0F, 0F, -1.76F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1.76F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 213
		bodyModel[193].setRotationPoint(66F, -357F, -80F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 7, 15, 38, 0F,0F, 0F, -3F, 0F, 4F, -4.23F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 7F, -4.23F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[194].setRotationPoint(73F, -357F, -80F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 9, 38, 0F,0F, 0F, -4.23F, 0F, -3F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4.23F, 0F, 1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[195].setRotationPoint(80F, -361F, -80F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 42, 38, 0F,0F, 1F, -4.23F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -26F, -4.23F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -26F, 0F); // Box 217
		bodyModel[196].setRotationPoint(80F, -351F, -80F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 42, 38, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, -4.23F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -26F, -4.23F); // Box 218
		bodyModel[197].setRotationPoint(80F, -351F, 42F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 8, 9, 38, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -12F, 0F, 0F, -4.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 0F, -4.23F); // Box 219
		bodyModel[198].setRotationPoint(80F, -361F, 42F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 7, 15, 38, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4.23F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -4.23F, 0F, 0F, -3F); // Box 220
		bodyModel[199].setRotationPoint(73F, -357F, 42F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 7, 15, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.76F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -1.76F); // Box 221
		bodyModel[200].setRotationPoint(66F, -357F, 42F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 14, 38, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1.76F, 0F, 0F, -1.05F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.76F, 0F, -2F, -1.05F); // Box 222
		bodyModel[201].setRotationPoint(60F, -361F, 42F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 27, 38, 0F,0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.35F, 0F, 0F, 0F); // Box 225
		bodyModel[202].setRotationPoint(54F, -380F, 42F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 18, 38, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1.05F, 0F, 0F, -0.35F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -3F, -0.35F); // Box 226
		bodyModel[203].setRotationPoint(56F, -367F, 42F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[204].setRotationPoint(60.5F, -384F, -80F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[205].setRotationPoint(57.5F, -381F, -80F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 25, 9, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[206].setRotationPoint(57.5F, -376F, -80F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 230
		bodyModel[207].setRotationPoint(57.5F, -367F, -80F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 231
		bodyModel[208].setRotationPoint(60.5F, -362F, -80F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 21, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[209].setRotationPoint(59.5F, -375F, -63F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 21, 4, 17, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[210].setRotationPoint(59.5F, -379F, -63F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 15, 3, 17, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[211].setRotationPoint(62.5F, -382F, -63F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 21, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 235
		bodyModel[212].setRotationPoint(59.5F, -368F, -63F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 15, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 236
		bodyModel[213].setRotationPoint(62.5F, -364F, -63F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 20, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[214].setRotationPoint(74.5F, -383F, -79.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 20, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[215].setRotationPoint(74.5F, -384F, -79.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 20, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 239
		bodyModel[216].setRotationPoint(74.5F, -372F, -79.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[217].setRotationPoint(94.5F, -382F, -78.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[218].setRotationPoint(94.5F, -383F, -78.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 242
		bodyModel[219].setRotationPoint(94.5F, -373F, -78.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[220].setRotationPoint(102.5F, -382F, -78.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[221].setRotationPoint(102.5F, -382F, -65.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[222].setRotationPoint(102.5F, -382F, 64.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[223].setRotationPoint(102.5F, -382F, 77.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 8, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[224].setRotationPoint(94.5F, -382F, 64.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 248
		bodyModel[225].setRotationPoint(94.5F, -373F, 64.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[226].setRotationPoint(94.5F, -383F, 64.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 20, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[227].setRotationPoint(74.5F, -384F, 63.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 20, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[228].setRotationPoint(74.5F, -383F, 63.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 20, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 252
		bodyModel[229].setRotationPoint(74.5F, -372F, 63.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[230].setRotationPoint(60.5F, -384F, 63F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[231].setRotationPoint(57.5F, -381F, 63F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 25, 9, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[232].setRotationPoint(57.5F, -376F, 63F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 256
		bodyModel[233].setRotationPoint(57.5F, -367F, 63F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 257
		bodyModel[234].setRotationPoint(60.5F, -362F, 63F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 15, 3, 17, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[235].setRotationPoint(62.5F, -382F, 46F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 21, 4, 17, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[236].setRotationPoint(59.5F, -379F, 46F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 21, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[237].setRotationPoint(59.5F, -375F, 46F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 15, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 261
		bodyModel[238].setRotationPoint(62.5F, -364F, 46F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 21, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 262
		bodyModel[239].setRotationPoint(59.5F, -368F, 46F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 72, 24, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[240].setRotationPoint(8F, -321F, 48F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 72, 16, 32, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[241].setRotationPoint(8F, -337F, 48F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 56, 8, 32, 0F,-16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[242].setRotationPoint(16F, -345F, 48F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 72, 16, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 266
		bodyModel[243].setRotationPoint(8F, -297F, 48F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 56, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 267
		bodyModel[244].setRotationPoint(16F, -281F, 48F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 63, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[245].setRotationPoint(12F, -319F, 80F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[246].setRotationPoint(12F, -333F, 80F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,-14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[247].setRotationPoint(19F, -340F, 80F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 272
		bodyModel[248].setRotationPoint(12F, -299F, 80F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 273
		bodyModel[249].setRotationPoint(19F, -285F, 80F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 72, 24, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[250].setRotationPoint(6.5F, -320F, 84F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 72, 16, 5, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[251].setRotationPoint(6.5F, -336F, 84F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 56, 8, 5, 0F,-16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[252].setRotationPoint(14.5F, -344F, 84F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 72, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 282
		bodyModel[253].setRotationPoint(6.5F, -296F, 84F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 56, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 283
		bodyModel[254].setRotationPoint(14.5F, -280F, 84F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 19, 24, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F); // Box 284
		bodyModel[255].setRotationPoint(6.5F, -320F, 89F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -14F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -10F, 5F, 0F); // Box 285
		bodyModel[256].setRotationPoint(6.5F, -336F, 89F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,-16F, -4F, 0F, 0F, -4F, 0F, 0F, -15F, 0F, -18F, -15F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -14F, 10F, 0F); // Box 286
		bodyModel[257].setRotationPoint(6.5F, -344F, 89F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -10F, 5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -14F, -10F, 0F); // Box 287
		bodyModel[258].setRotationPoint(6.5F, -296F, 89F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -14F, 10F, 0F, -16F, -4F, 0F, 0F, -4F, 0F, 0F, -15F, 0F, -18F, -15F, 0F); // Box 288
		bodyModel[259].setRotationPoint(6.5F, -280F, 89F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,0F, 0F, 0F, -8F, 0F, 0F, -14F, 10F, 0F, 0F, 10F, 0F, 0F, -4F, 0F, -16F, -4F, 0F, -18F, -15F, 0F, 0F, -15F, 0F); // Box 289
		bodyModel[260].setRotationPoint(59.5F, -280F, 89F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -14F, -10F, 0F, 0F, -10F, 0F); // Box 290
		bodyModel[261].setRotationPoint(59.5F, -296F, 89F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 19, 24, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, 0F, -5F, 0F); // Box 291
		bodyModel[262].setRotationPoint(59.5F, -320F, 89F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,0F, 0F, 0F, -8F, 0F, 0F, -14F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 5F, 0F, 0F, 5F, 0F); // Box 292
		bodyModel[263].setRotationPoint(59.5F, -336F, 89F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,0F, -4F, 0F, -16F, -4F, 0F, -18F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -14F, 10F, 0F, 0F, 10F, 0F); // Box 293
		bodyModel[264].setRotationPoint(59.5F, -344F, 89F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 34, 4, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[265].setRotationPoint(25.5F, -329F, 102F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 34, 8, 36, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[266].setRotationPoint(25.5F, -325F, 98F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 34, 12, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[267].setRotationPoint(25.5F, -317F, 98F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 34, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 297
		bodyModel[268].setRotationPoint(25.5F, -305F, 98F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 34, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 298
		bodyModel[269].setRotationPoint(25.5F, -297F, 102F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 25, 33, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[270].setRotationPoint(30.5F, -324F, 130F);
		bodyModel[270].rotateAngleX = -0.85521133F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 56, 8, 32, 0F,-16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[271].setRotationPoint(16F, -345F, -80F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 72, 16, 32, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[272].setRotationPoint(8F, -337F, -80F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 72, 24, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[273].setRotationPoint(8F, -321F, -80F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 72, 16, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 303
		bodyModel[274].setRotationPoint(8F, -297F, -80F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 56, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 304
		bodyModel[275].setRotationPoint(16F, -281F, -80F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 305
		bodyModel[276].setRotationPoint(19F, -285F, -84F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 306
		bodyModel[277].setRotationPoint(12F, -299F, -84F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 63, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[278].setRotationPoint(12F, -319F, -84F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[279].setRotationPoint(12F, -333F, -84F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,-14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[280].setRotationPoint(19F, -340F, -84F);

		bodyModel[281].addShapeBox(0F, -7F, 15F, 27, 49, 10, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[281].setRotationPoint(29.5F, -324F, 130F);
		bodyModel[281].rotateAngleX = -0.66322512F;

		bodyModel[282].addShapeBox(0F, -7F, 15F, 2, 49, 10, 0F,0F, -10F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 311
		bodyModel[282].setRotationPoint(27.5F, -324F, 130F);
		bodyModel[282].rotateAngleX = -0.66322512F;

		bodyModel[283].addShapeBox(0F, -7F, 15F, 2, 49, 10, 0F,0F, -8F, 0F, 0F, -10F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[283].setRotationPoint(56.5F, -324F, 130F);
		bodyModel[283].rotateAngleX = -0.66322512F;

		bodyModel[284].addShapeBox(0F, -7F, 25F, 27, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[284].setRotationPoint(29.5F, -324F, 130F);
		bodyModel[284].rotateAngleX = -0.66322512F;

		bodyModel[285].addShapeBox(0F, 29F, 25F, 27, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[285].setRotationPoint(29.5F, -324F, 130F);
		bodyModel[285].rotateAngleX = -0.66322512F;

		bodyModel[286].addShapeBox(0F, 6F, 25F, 31, 23, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[286].setRotationPoint(27.5F, -324F, 130F);
		bodyModel[286].rotateAngleX = -0.66322512F;

		bodyModel[287].addShapeBox(0F, -7F, 25F, 2, 13, 24, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[287].setRotationPoint(27.5F, -324F, 130F);
		bodyModel[287].rotateAngleX = -0.66322512F;

		bodyModel[288].addShapeBox(0F, -7F, 25F, 2, 13, 24, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[288].setRotationPoint(56.5F, -324F, 130F);
		bodyModel[288].rotateAngleX = -0.66322512F;

		bodyModel[289].addShapeBox(0F, 29F, 25F, 2, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[289].setRotationPoint(56.5F, -324F, 130F);
		bodyModel[289].rotateAngleX = -0.66322512F;

		bodyModel[290].addShapeBox(0F, 29F, 25F, 2, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 319
		bodyModel[290].setRotationPoint(27.5F, -324F, 130F);
		bodyModel[290].rotateAngleX = -0.66322512F;

		bodyModel[291].addShapeBox(0F, -7F, 49F, 27, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 320
		bodyModel[291].setRotationPoint(29.5F, -324F, 130F);
		bodyModel[291].rotateAngleX = -0.66322512F;

		bodyModel[292].addShapeBox(0F, 29F, 49F, 27, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0F); // Box 321
		bodyModel[292].setRotationPoint(29.5F, -324F, 130F);
		bodyModel[292].rotateAngleX = -0.66322512F;

		bodyModel[293].addShapeBox(0F, -7F, 49F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, -2F, -12F, -2F, 2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, 0F); // Box 322
		bodyModel[293].setRotationPoint(56.5F, -324F, 130F);
		bodyModel[293].rotateAngleX = -0.66322512F;

		bodyModel[294].addShapeBox(0F, -7F, 49F, 2, 13, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 2F, -12F, 0F, -2F, -12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F); // Box 323
		bodyModel[294].setRotationPoint(27.5F, -324F, 130F);
		bodyModel[294].rotateAngleX = -0.66322512F;

		bodyModel[295].addShapeBox(0F, 29F, 49F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -12F, -2F, 2F, -12F, 0F); // Box 324
		bodyModel[295].setRotationPoint(56.5F, -324F, 130F);
		bodyModel[295].rotateAngleX = -0.66322512F;

		bodyModel[296].addShapeBox(0F, 29F, 49F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -12F, 0F, -2F, -12F, -2F); // Box 325
		bodyModel[296].setRotationPoint(27.5F, -324F, 130F);
		bodyModel[296].rotateAngleX = -0.66322512F;

		bodyModel[297].addShapeBox(0F, 6F, 38F, 18, 23, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F); // Box 326
		bodyModel[297].setRotationPoint(34.5F, -324F, 130F);
		bodyModel[297].rotateAngleX = -0.66322512F;

		bodyModel[298].addShapeBox(0F, 8F, 38F, 26, 6, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F); // Box 327
		bodyModel[298].setRotationPoint(30.5F, -324F, 130F);
		bodyModel[298].rotateAngleX = -0.66322512F;

		bodyModel[299].addShapeBox(0F, 20F, 38F, 26, 6, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F); // Box 328
		bodyModel[299].setRotationPoint(30.5F, -324F, 130F);
		bodyModel[299].rotateAngleX = -0.66322512F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 56, 8, 5, 0F,-16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[300].setRotationPoint(14.5F, -344F, -89F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 72, 16, 5, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[301].setRotationPoint(6.5F, -336F, -89F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 72, 24, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[302].setRotationPoint(6.5F, -320F, -89F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 72, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 332
		bodyModel[303].setRotationPoint(6.5F, -296F, -89F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 56, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); // Box 333
		bodyModel[304].setRotationPoint(14.5F, -280F, -89F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,0F, 10F, 0F, -14F, 10F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, -18F, -15F, 0F, -16F, -4F, 0F, 0F, -4F, 0F); // Box 334
		bodyModel[305].setRotationPoint(59.5F, -280F, -134F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,0F, 5F, 0F, -10F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -14F, -10F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[306].setRotationPoint(59.5F, -296F, -134F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 19, 24, 45, 0F,0F, -5F, 0F, -10F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[307].setRotationPoint(59.5F, -320F, -134F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,0F, -10F, 0F, -14F, -10F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -10F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[308].setRotationPoint(59.5F, -336F, -134F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,0F, -15F, 0F, -18F, -15F, 0F, -16F, -4F, 0F, 0F, -4F, 0F, 0F, 10F, 0F, -14F, 10F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[309].setRotationPoint(59.5F, -344F, -134F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,-18F, -15F, 0F, 0F, -15F, 0F, 0F, -4F, 0F, -16F, -4F, 0F, -14F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 339
		bodyModel[310].setRotationPoint(6.5F, -344F, -134F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,-14F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -10F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[311].setRotationPoint(6.5F, -336F, -134F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 19, 24, 45, 0F,-10F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[312].setRotationPoint(6.5F, -320F, -134F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 19, 16, 45, 0F,-10F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 342
		bodyModel[313].setRotationPoint(6.5F, -296F, -134F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 19, 8, 45, 0F,-14F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -18F, -15F, 0F, 0F, -15F, 0F, 0F, -4F, 0F, -16F, -4F, 0F); // Box 343
		bodyModel[314].setRotationPoint(6.5F, -280F, -134F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 34, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 344
		bodyModel[315].setRotationPoint(25.5F, -297F, -130F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 34, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 345
		bodyModel[316].setRotationPoint(25.5F, -305F, -134F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 34, 12, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[317].setRotationPoint(25.5F, -317F, -134F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 34, 8, 36, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[318].setRotationPoint(25.5F, -325F, -134F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 34, 4, 28, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[319].setRotationPoint(25.5F, -329F, -130F);

		bodyModel[320].addShapeBox(0F, 0F, -23F, 25, 33, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 369
		bodyModel[320].setRotationPoint(30.5F, -324F, -130F);
		bodyModel[320].rotateAngleX = 0.85521133F;

		bodyModel[321].addShapeBox(0F, -7F, -25F, 2, 49, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -10F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -2F); // Box 373
		bodyModel[321].setRotationPoint(27.5F, -324F, -130F);
		bodyModel[321].rotateAngleX = 0.66322512F;

		bodyModel[322].addShapeBox(0F, -7F, -25F, 27, 49, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 374
		bodyModel[322].setRotationPoint(29.5F, -324F, -130F);
		bodyModel[322].rotateAngleX = 0.66322512F;

		bodyModel[323].addShapeBox(0F, -7F, -25F, 2, 49, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, -2F, 0F, -8F, 0F); // Box 375
		bodyModel[323].setRotationPoint(56.5F, -324F, -130F);
		bodyModel[323].rotateAngleX = 0.66322512F;

		bodyModel[324].addShapeBox(0F, -7F, -49F, 27, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[324].setRotationPoint(29.5F, -324F, -130F);
		bodyModel[324].rotateAngleX = 0.66322512F;

		bodyModel[325].addShapeBox(0F, 29F, -49F, 27, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[325].setRotationPoint(29.5F, -324F, -130F);
		bodyModel[325].rotateAngleX = 0.66322512F;

		bodyModel[326].addShapeBox(0F, 29F, -49F, 2, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[326].setRotationPoint(56.5F, -324F, -130F);
		bodyModel[326].rotateAngleX = 0.66322512F;

		bodyModel[327].addShapeBox(0F, 29F, -49F, 2, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 379
		bodyModel[327].setRotationPoint(27.5F, -324F, -130F);
		bodyModel[327].rotateAngleX = 0.66322512F;

		bodyModel[328].addShapeBox(0F, -7F, -49F, 2, 13, 24, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[328].setRotationPoint(27.5F, -324F, -130F);
		bodyModel[328].rotateAngleX = 0.66322512F;

		bodyModel[329].addShapeBox(0F, -7F, -49F, 2, 13, 24, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[329].setRotationPoint(56.5F, -324F, -130F);
		bodyModel[329].rotateAngleX = 0.66322512F;

		bodyModel[330].addShapeBox(0F, 6F, -38F, 31, 23, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[330].setRotationPoint(27.5F, -324F, -130F);
		bodyModel[330].rotateAngleX = 0.66322512F;

		bodyModel[331].addShapeBox(0F, -7F, -59F, 2, 13, 10, 0F,-2F, -12F, -2F, 2F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[331].setRotationPoint(27.5F, -324F, -130F);
		bodyModel[331].rotateAngleX = 0.66322512F;

		bodyModel[332].addShapeBox(0F, -7F, -59F, 27, 13, 10, 0F,-2F, -12F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[332].setRotationPoint(29.5F, -324F, -130F);
		bodyModel[332].rotateAngleX = 0.66322512F;

		bodyModel[333].addShapeBox(0F, -7F, -59F, 2, 13, 10, 0F,2F, -12F, 0F, -2F, -12F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[333].setRotationPoint(56.5F, -324F, -130F);
		bodyModel[333].rotateAngleX = 0.66322512F;

		bodyModel[334].addShapeBox(0F, 29F, -59F, 27, 13, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[334].setRotationPoint(29.5F, -324F, -130F);
		bodyModel[334].rotateAngleX = 0.66322512F;

		bodyModel[335].addShapeBox(0F, 29F, -59F, 2, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -12F, 0F, -2F, -12F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[335].setRotationPoint(56.5F, -324F, -130F);
		bodyModel[335].rotateAngleX = 0.66322512F;

		bodyModel[336].addShapeBox(0F, 29F, -59F, 2, 13, 10, 0F,-2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, -2F, 2F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 388
		bodyModel[336].setRotationPoint(27.5F, -324F, -130F);
		bodyModel[336].rotateAngleX = 0.66322512F;

		bodyModel[337].addShapeBox(0F, 20F, -66F, 26, 6, 28, 0F,8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[337].setRotationPoint(30.5F, -324F, -130F);
		bodyModel[337].rotateAngleX = 0.66322512F;

		bodyModel[338].addShapeBox(0F, 8F, -66F, 26, 6, 28, 0F,8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[338].setRotationPoint(30.5F, -324F, -130F);
		bodyModel[338].rotateAngleX = 0.66322512F;

		bodyModel[339].addShapeBox(0F, 6F, -66F, 18, 23, 28, 0F,8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[339].setRotationPoint(34.5F, -324F, -130F);
		bodyModel[339].rotateAngleX = 0.66322512F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 176, 42, 196, 0F,0F, 0F, 0F, 0F, -17F, -2F, 0F, -17F, -2F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 19F, -2F, 0F, 19F, -2F, 0F, 0F, 14F); // Box 341
		bodyModel[340].setRotationPoint(-203F, -412F, -98F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 176, 26, 196, 0F,0F, 0F, -29F, 0F, -17F, -37F, 0F, -17F, -37F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 17F, -2F, 0F, 17F, -2F, 0F, 0F, 0F); // Box 342
		bodyModel[341].setRotationPoint(-203F, -438F, -98F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 5, 26, 196, 0F,0F, -5F, -34F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -5F, -34F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 343
		bodyModel[342].setRotationPoint(-208F, -438F, -98F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 5, 42, 7, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F, -14F); // Box 344
		bodyModel[343].setRotationPoint(-208F, -412F, -98F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 5, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.66F, 0F, 0F, 5.66F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[344].setRotationPoint(-208F, -412F, -91F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, 0F, 5.66F, 0F, 0F, 5.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11.33F, 0F, 0F, 11.33F, 0F, 0F, -11.33F, 0F, 0F, -11.33F); // Box 346
		bodyModel[345].setRotationPoint(-208F, -395F, -91F);

		bodyModel[346].addShapeBox(0F, -8F, 0F, 5, 8, 6, 0F,0F, 0F, -2.66F, 0F, 0F, -2.66F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[346].setRotationPoint(-208F, -370F, -104F);

		bodyModel[347].addShapeBox(0F, -8F, 0F, 5, 8, 3, 0F,0F, 0F, -2.66F, 0F, 0F, -2.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.66F, 0F, 0F, -2.66F); // Box 349
		bodyModel[347].setRotationPoint(-208F, -370F, -105F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 5, 19, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[348].setRotationPoint(-208F, -395F, -89F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[349].setRotationPoint(-208F, -376F, -70F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 5, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[350].setRotationPoint(-208F, -373F, -98F);

		bodyModel[351].addShapeBox(0F, -1.5F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[351].setRotationPoint(-206F, -384.5F, -94.5F);

		bodyModel[352].addShapeBox(0F, -3.5F, 0F, 3, 2, 9, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[352].setRotationPoint(-206F, -384.5F, -94.5F);

		bodyModel[353].addShapeBox(0F, -4.5F, 0F, 3, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[353].setRotationPoint(-206F, -384.5F, -93.5F);

		bodyModel[354].addShapeBox(0F, 1.5F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 356
		bodyModel[354].setRotationPoint(-206F, -384.5F, -94.5F);

		bodyModel[355].addShapeBox(0F, 3.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 357
		bodyModel[355].setRotationPoint(-206F, -384.5F, -93.5F);

		bodyModel[356].addShapeBox(0F, -1F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[356].setRotationPoint(-206F, -378F, -82.5F);

		bodyModel[357].addShapeBox(0F, -3F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[357].setRotationPoint(-206F, -378F, -82.5F);

		bodyModel[358].addShapeBox(0F, 1F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 360
		bodyModel[358].setRotationPoint(-206F, -378F, -82.5F);

		bodyModel[359].addShapeBox(0F, -8F, 0F, 5, 8, 3, 0F,0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -2.66F, 0F, 0F, -2.66F, 0F, 0F, -2.66F, 0F, 0F, -2.66F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[359].setRotationPoint(-208F, -370F, 102F);

		bodyModel[360].addShapeBox(0F, -8F, 0F, 5, 8, 6, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -2.66F, 0F, 0F, -2.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F); // Box 361
		bodyModel[360].setRotationPoint(-208F, -370F, 98F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 5, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[361].setRotationPoint(-208F, -373F, 67F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 363
		bodyModel[362].setRotationPoint(-208F, -376F, 67F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 5, 19, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F); // Box 364
		bodyModel[363].setRotationPoint(-208F, -395F, 67F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 42, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 9F); // Box 365
		bodyModel[364].setRotationPoint(-208F, -412F, 91F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 5, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.66F, 0F, 0F, 5.66F); // Box 366
		bodyModel[365].setRotationPoint(-208F, -412F, 67F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.66F, 0F, 0F, 5.66F, 0F, 0F, -11.33F, 0F, 0F, -11.33F, 0F, 0F, 11.33F, 0F, 0F, 11.33F); // Box 367
		bodyModel[366].setRotationPoint(-208F, -395F, 90F);

		bodyModel[367].addShapeBox(0F, -1.5F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[367].setRotationPoint(-206F, -384.5F, 85.5F);

		bodyModel[368].addShapeBox(0F, -3.5F, 0F, 3, 2, 9, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[368].setRotationPoint(-206F, -384.5F, 85.5F);

		bodyModel[369].addShapeBox(0F, -4.5F, 0F, 3, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[369].setRotationPoint(-206F, -384.5F, 86.5F);

		bodyModel[370].addShapeBox(0F, 3.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[370].setRotationPoint(-206F, -384.5F, 86.5F);

		bodyModel[371].addShapeBox(0F, 1.5F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 372
		bodyModel[371].setRotationPoint(-206F, -384.5F, 85.5F);

		bodyModel[372].addShapeBox(0F, -1F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[372].setRotationPoint(-206F, -378F, 76.5F);

		bodyModel[373].addShapeBox(0F, 1F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 374
		bodyModel[373].setRotationPoint(-206F, -378F, 76.5F);

		bodyModel[374].addShapeBox(0F, -3F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[374].setRotationPoint(-206F, -378F, 76.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 5, 7, 224, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -7F); // Box 376
		bodyModel[375].setRotationPoint(-208F, -370F, -112F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 176, 7, 224, 0F,0F, 0F, 0F, 0F, -18.9F, -16F, 0F, -18.9F, -16F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 12F, -16F, 0F, 12F, -16F, 0F, 0F, -5F); // Box 377
		bodyModel[376].setRotationPoint(-203F, -370F, -112F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 42, 134, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[377].setRotationPoint(-208F, -412F, -67F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 10, 16, 57, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[378].setRotationPoint(-208F, -443F, -72F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 10, 5, 45, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[379].setRotationPoint(-208F, -448F, -66F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 10, 3, 33, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[380].setRotationPoint(-208F, -451F, -60F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 10, 2, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[381].setRotationPoint(-208F, -453F, -54F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 3, 2, 19, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		bodyModel[382].setRotationPoint(-198F, -452F, -53F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 3, 31, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		bodyModel[383].setRotationPoint(-198F, -450F, -59F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 5, 43, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		bodyModel[384].setRotationPoint(-198F, -447F, -65F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 16, 55, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		bodyModel[385].setRotationPoint(-198F, -442F, -71F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 15, 2, 21, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 686
		bodyModel[386].setRotationPoint(-195F, -453F, -54F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 15, 3, 33, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 687
		bodyModel[387].setRotationPoint(-195F, -451F, -60F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 15, 5, 45, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 688
		bodyModel[388].setRotationPoint(-195F, -448F, -66F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 15, 16, 57, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 689
		bodyModel[389].setRotationPoint(-195F, -443F, -72F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 19, 2, 17, 0F,0F, 0F, -6F, 0F, -6.9F, -8F, 0F, -6.9F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 691
		bodyModel[390].setRotationPoint(-180F, -452F, -52F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 19, 15, 53, 0F,0F, 0F, -6F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 692
		bodyModel[391].setRotationPoint(-180F, -442F, -70F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 19, 5, 41, 0F,0F, 0F, -6F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 693
		bodyModel[392].setRotationPoint(-180F, -447F, -64F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 19, 3, 29, 0F,0F, 0F, -6F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 694
		bodyModel[393].setRotationPoint(-180F, -450F, -58F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 19, 10, 41, 0F,0F, 0F, -6F, 0F, -9F, -17F, 0F, -9F, -17F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 695
		bodyModel[394].setRotationPoint(-161F, -437F, -64F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 19, 5, 29, 0F,0F, 0F, -6F, 0F, -13F, -12F, 0F, -13F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 9F, -11F, 0F, 9F, -11F, 0F, 0F, 0F); // Box 696
		bodyModel[395].setRotationPoint(-161F, -442F, -58F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,0F, 0F, -6F, 0F, -15F, -8F, 0F, -15F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 13F, -6F, 0F, 13F, -6F, 0F, 0F, 0F); // Box 697
		bodyModel[396].setRotationPoint(-161F, -445F, -52F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 2, 19, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[397].setRotationPoint(-198F, -452F, 34F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 3, 31, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		bodyModel[398].setRotationPoint(-198F, -450F, 28F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 5, 43, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		bodyModel[399].setRotationPoint(-198F, -447F, 22F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 16, 55, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		bodyModel[400].setRotationPoint(-198F, -442F, 16F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 10, 16, 57, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		bodyModel[401].setRotationPoint(-208F, -443F, 15F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 10, 5, 45, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		bodyModel[402].setRotationPoint(-208F, -448F, 21F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 10, 3, 33, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		bodyModel[403].setRotationPoint(-208F, -451F, 27F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 10, 2, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[404].setRotationPoint(-208F, -453F, 33F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 15, 2, 21, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 706
		bodyModel[405].setRotationPoint(-195F, -453F, 33F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 15, 3, 33, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 707
		bodyModel[406].setRotationPoint(-195F, -451F, 27F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 15, 5, 45, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 708
		bodyModel[407].setRotationPoint(-195F, -448F, 21F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 15, 16, 57, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 709
		bodyModel[408].setRotationPoint(-195F, -443F, 15F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 19, 15, 53, 0F,0F, 0F, -6F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 710
		bodyModel[409].setRotationPoint(-180F, -442F, 17F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 19, 3, 29, 0F,0F, 0F, -6F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 711
		bodyModel[410].setRotationPoint(-180F, -450F, 29F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 19, 5, 41, 0F,0F, 0F, -6F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 712
		bodyModel[411].setRotationPoint(-180F, -447F, 23F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 19, 2, 17, 0F,0F, 0F, -6F, 0F, -6.9F, -8F, 0F, -6.9F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F); // Box 713
		bodyModel[412].setRotationPoint(-180F, -452F, 35F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 19, 10, 41, 0F,0F, 0F, -6F, 0F, -9F, -17F, 0F, -9F, -17F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 714
		bodyModel[413].setRotationPoint(-161F, -437F, 23F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 19, 5, 29, 0F,0F, 0F, -6F, 0F, -13F, -12F, 0F, -13F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 9F, -11F, 0F, 9F, -11F, 0F, 0F, 0F); // Box 715
		bodyModel[414].setRotationPoint(-161F, -442F, 29F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,0F, 0F, -6F, 0F, -15F, -8F, 0F, -15F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 13F, -6F, 0F, 13F, -6F, 0F, 0F, 0F); // Box 716
		bodyModel[415].setRotationPoint(-161F, -445F, 35F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 81, 16, 162, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[416].setRotationPoint(-161F, -360F, -81F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 53, 16, 162, 0F,0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F); // Box 706
		bodyModel[417].setRotationPoint(-80F, -360F, -81F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 16, 162, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 707
		bodyModel[418].setRotationPoint(-165F, -360F, -81F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		bodyModel[419].setRotationPoint(-148F, -360F, -87F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		bodyModel[420].setRotationPoint(-129F, -360F, -87F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		bodyModel[421].setRotationPoint(-110F, -360F, -87F);

		bodyModel[422].addShapeBox(0F, 0F, -6F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		bodyModel[422].setRotationPoint(-80F, -360F, -81F);
		bodyModel[422].rotateAngleY = 0.34421733F;

		bodyModel[423].addShapeBox(16F, 0F, -6F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		bodyModel[423].setRotationPoint(-80F, -360F, -81F);
		bodyModel[423].rotateAngleY = 0.34421733F;

		bodyModel[424].addShapeBox(32F, 0F, -6F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		bodyModel[424].setRotationPoint(-80F, -360F, -81F);
		bodyModel[424].rotateAngleY = 0.34421733F;

		bodyModel[425].addShapeBox(48F, 0F, -6F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		bodyModel[425].setRotationPoint(-80F, -360F, -81F);
		bodyModel[425].rotateAngleY = 0.34421733F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		bodyModel[426].setRotationPoint(-148F, -360F, 81F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		bodyModel[427].setRotationPoint(-129F, -360F, 81F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		bodyModel[428].setRotationPoint(-110F, -360F, 81F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		bodyModel[429].setRotationPoint(-80F, -360F, 81F);
		bodyModel[429].rotateAngleY = -0.34421733F;

		bodyModel[430].addShapeBox(16F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[430].setRotationPoint(-80F, -360F, 81F);
		bodyModel[430].rotateAngleY = -0.34421733F;

		bodyModel[431].addShapeBox(32F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		bodyModel[431].setRotationPoint(-80F, -360F, 81F);
		bodyModel[431].rotateAngleY = -0.34421733F;

		bodyModel[432].addShapeBox(48F, 0F, 0F, 6, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		bodyModel[432].setRotationPoint(-80F, -360F, 81F);
		bodyModel[432].rotateAngleY = -0.34421733F;

		bodyModel[433].addShapeBox(0F, 0F, 0F, 7, 5, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		bodyModel[433].setRotationPoint(-218F, -406F, -23F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 7, 5, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		bodyModel[434].setRotationPoint(-218F, -431F, -23F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 23, 5, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		bodyModel[435].setRotationPoint(-225F, -437F, -5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 23, 8, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[436].setRotationPoint(-225F, -432F, -6F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 23, 21, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[437].setRotationPoint(-225F, -424F, -6F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 23, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 727
		bodyModel[438].setRotationPoint(-225F, -403F, -6F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 7, 21, 12, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 728
		bodyModel[439].setRotationPoint(-232F, -424F, -6F);

		bodyModel[440].addShapeBox(0F, -3.5F, 0F, 21, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[440].setRotationPoint(-73F, -378F, -104F);

		bodyModel[441].addShapeBox(0F, -7.5F, 0F, 21, 4, 9, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[441].setRotationPoint(-73F, -378F, -104F);

		bodyModel[442].addShapeBox(0F, -10.5F, 0F, 15, 3, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[442].setRotationPoint(-70F, -378F, -104F);

		bodyModel[443].addShapeBox(0F, 3.5F, 0F, 21, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 732
		bodyModel[443].setRotationPoint(-73F, -378F, -104F);

		bodyModel[444].addShapeBox(0F, 7.5F, 0F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 733
		bodyModel[444].setRotationPoint(-70F, -378F, -104F);

		bodyModel[445].addShapeBox(0F, -10.5F, 0F, 15, 3, 20, 0F,-5F, -3F, 0F, -5F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		bodyModel[445].setRotationPoint(-70F, -378F, -126F);

		bodyModel[446].addShapeBox(0F, -7.5F, 0F, 21, 4, 20, 0F,-5F, -2F, 0F, -5F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		bodyModel[446].setRotationPoint(-73F, -378F, -126F);

		bodyModel[447].addShapeBox(0F, -3.5F, 0F, 21, 7, 20, 0F,-3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		bodyModel[447].setRotationPoint(-73F, -378F, -126F);

		bodyModel[448].addShapeBox(0F, 3.5F, 0F, 21, 4, 20, 0F,-3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 739
		bodyModel[448].setRotationPoint(-73F, -378F, -126F);

		bodyModel[449].addShapeBox(0F, 7.5F, 0F, 15, 3, 20, 0F,-2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 740
		bodyModel[449].setRotationPoint(-70F, -378F, -126F);

		bodyModel[450].addShapeBox(3F, -2.5F, -1F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 741
		bodyModel[450].setRotationPoint(-73F, -378F, -105F);

		bodyModel[451].addShapeBox(3F, -5.5F, -1F, 15, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		bodyModel[451].setRotationPoint(-73F, -378F, -105F);

		bodyModel[452].addShapeBox(5F, -7.5F, -1F, 11, 2, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		bodyModel[452].setRotationPoint(-73F, -378F, -105F);

		bodyModel[453].addShapeBox(3F, 2.5F, -1F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 744
		bodyModel[453].setRotationPoint(-73F, -378F, -105F);

		bodyModel[454].addShapeBox(5F, 5.5F, -1F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 745
		bodyModel[454].setRotationPoint(-73F, -378F, -105F);

		bodyModel[455].addShapeBox(0F, -10.5F, 0F, 15, 3, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[455].setRotationPoint(-70F, -378F, 95F);

		bodyModel[456].addShapeBox(0F, -7.5F, 0F, 21, 4, 9, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[456].setRotationPoint(-73F, -378F, 95F);

		bodyModel[457].addShapeBox(0F, -3.5F, 0F, 21, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[457].setRotationPoint(-73F, -378F, 95F);

		bodyModel[458].addShapeBox(0F, 3.5F, 0F, 21, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 749
		bodyModel[458].setRotationPoint(-73F, -378F, 95F);

		bodyModel[459].addShapeBox(0F, 7.5F, 0F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 750
		bodyModel[459].setRotationPoint(-70F, -378F, 95F);

		bodyModel[460].addShapeBox(0F, -10.5F, 0F, 15, 3, 20, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F); // Box 756
		bodyModel[460].setRotationPoint(-70F, -378F, 106F);

		bodyModel[461].addShapeBox(0F, -7.5F, 0F, 21, 4, 20, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F); // Box 757
		bodyModel[461].setRotationPoint(-73F, -378F, 106F);

		bodyModel[462].addShapeBox(0F, -3.5F, 0F, 21, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 758
		bodyModel[462].setRotationPoint(-73F, -378F, 106F);

		bodyModel[463].addShapeBox(0F, 7.5F, 0F, 15, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F); // Box 759
		bodyModel[463].setRotationPoint(-70F, -378F, 106F);

		bodyModel[464].addShapeBox(0F, 3.5F, 0F, 21, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F); // Box 760
		bodyModel[464].setRotationPoint(-73F, -378F, 106F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 25, 98, 224, 0F,0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F); // Box 761
		bodyModel[465].setRotationPoint(-47F, -344F, -112F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 41, 98, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[466].setRotationPoint(-88F, -344F, -117F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 41, 98, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 763
		bodyModel[467].setRotationPoint(-88F, -344F, 112F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 25, 98, 5, 0F,0F, -5F, 0F, 0F, -5F, -45F, 0F, 0F, 45F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -45F, 0F, 0F, 45F, 0F, 0F, 0F); // Box 764
		bodyModel[468].setRotationPoint(-47F, -344F, -117F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 25, 98, 5, 0F,0F, 0F, 0F, 0F, 0F, 45F, 0F, -5F, -45F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, -5F, -45F, 0F, -5F, 0F); // Box 765
		bodyModel[469].setRotationPoint(-47F, -344F, 112F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, -5F, 0F, 0F, -5F, -18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 0F); // Box 766
		bodyModel[470].setRotationPoint(-22F, -344F, -72F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -18F, 0F, 0F, 18F, 0F, 0F, 0F); // Box 767
		bodyModel[471].setRotationPoint(-22F, -261F, -72F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 768
		bodyModel[472].setRotationPoint(-22F, -325F, -72F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 769
		bodyModel[473].setRotationPoint(-22F, -319F, -72F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 770
		bodyModel[474].setRotationPoint(-22F, -313F, -72F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 10, 23, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 771
		bodyModel[475].setRotationPoint(-22F, -307F, -72F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 772
		bodyModel[476].setRotationPoint(-22F, -267F, -72F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 773
		bodyModel[477].setRotationPoint(-22F, -273F, -72F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 774
		bodyModel[478].setRotationPoint(-22F, -279F, -72F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 775
		bodyModel[479].setRotationPoint(-22F, -344F, -67F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 776
		bodyModel[480].setRotationPoint(-22F, -261F, -67F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 11, 55, 234, 0F,0F, 0F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		bodyModel[481].setRotationPoint(-99F, -351F, -117F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 778
		bodyModel[482].setRotationPoint(-22F, -261F, 62F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, -5F, -18F, 0F, -5F, 0F); // Box 779
		bodyModel[483].setRotationPoint(-22F, -261F, 67F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 780
		bodyModel[484].setRotationPoint(-22F, -267F, 67F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 781
		bodyModel[485].setRotationPoint(-22F, -273F, 67F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 782
		bodyModel[486].setRotationPoint(-22F, -279F, 67F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 10, 23, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 783
		bodyModel[487].setRotationPoint(-22F, -307F, 67F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 784
		bodyModel[488].setRotationPoint(-22F, -313F, 67F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 785
		bodyModel[489].setRotationPoint(-22F, -319F, 67F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 786
		bodyModel[490].setRotationPoint(-22F, -325F, 67F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 787
		bodyModel[491].setRotationPoint(-22F, -344F, 62F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 10, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 18F, 0F, -5F, -18F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 788
		bodyModel[492].setRotationPoint(-22F, -344F, 67F);

		bodyModel[493].addShapeBox(0F, 0F, -5F, 11, 46, 5, 0F,0F, -5F, 0F, 0F, -12F, -5F, 0F, -7F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 789
		bodyModel[493].setRotationPoint(-99F, -351F, -117F);

		bodyModel[494].addShapeBox(0F, 0F, -5F, 11, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -5F, 0F, -7F, 5F, 0F, 0F, 0F); // Box 790
		bodyModel[494].setRotationPoint(-99F, -305F, -117F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 11, 45, 234, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[495].setRotationPoint(-99F, -296F, -117F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 11, 5, 234, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 792
		bodyModel[496].setRotationPoint(-99F, -251F, -117F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 41, 98, 224, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		bodyModel[497].setRotationPoint(-88F, -344F, -112F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 63, 55, 234, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		bodyModel[498].setRotationPoint(-162F, -351F, -117F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 9, 49, 234, 0F,0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		bodyModel[499].setRotationPoint(-171F, -351F, -117F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 1100, 3122, textureX, textureY); // Box 796
		bodyModel[501] = new ModelRendererTurbo(this, 1100, 3178, textureX, textureY); // Box 797
		bodyModel[502] = new ModelRendererTurbo(this, 1100, 3196, textureX, textureY); // Box 798
		bodyModel[503] = new ModelRendererTurbo(this, 1182, 3177, textureX, textureY); // Box 799
		bodyModel[504] = new ModelRendererTurbo(this, 1100, 3222, textureX, textureY); // Box 800
		bodyModel[505] = new ModelRendererTurbo(this, 1100, 3222, textureX, textureY); // Box 801
		bodyModel[506] = new ModelRendererTurbo(this, 1100, 3494, textureX, textureY); // Box 802
		bodyModel[507] = new ModelRendererTurbo(this, 1100, 3769, textureX, textureY); // Box 803
		bodyModel[508] = new ModelRendererTurbo(this, 1100, 3769, textureX, textureY); // Box 804
		bodyModel[509] = new ModelRendererTurbo(this, 1100, 760, textureX, textureY); // Box 805
		bodyModel[510] = new ModelRendererTurbo(this, 1100, 3843, textureX, textureY); // Box 806
		bodyModel[511] = new ModelRendererTurbo(this, 1100, 706, textureX, textureY); // Box 807
		bodyModel[512] = new ModelRendererTurbo(this, 1100, 3178, textureX, textureY); // Box 808
		bodyModel[513] = new ModelRendererTurbo(this, 1100, 3122, textureX, textureY); // Box 809
		bodyModel[514] = new ModelRendererTurbo(this, 1100, 3768, textureX, textureY); // Box 810
		bodyModel[515] = new ModelRendererTurbo(this, 1100, 3860, textureX, textureY); // Box 811
		bodyModel[516] = new ModelRendererTurbo(this, 1100, 3860, textureX, textureY); // Box 812
		bodyModel[517] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 813
		bodyModel[518] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 814
		bodyModel[519] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 815
		bodyModel[520] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 816
		bodyModel[521] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 817
		bodyModel[522] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 818
		bodyModel[523] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 819
		bodyModel[524] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 820
		bodyModel[525] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 821
		bodyModel[526] = new ModelRendererTurbo(this, 1100, 3918, textureX, textureY); // Box 822
		bodyModel[527] = new ModelRendererTurbo(this, 1100, 3196, textureX, textureY); // Box 823
		bodyModel[528] = new ModelRendererTurbo(this, 1100, 3930, textureX, textureY); // Box 824
		bodyModel[529] = new ModelRendererTurbo(this, 1100, 4045, textureX, textureY); // Box 825
		bodyModel[530] = new ModelRendererTurbo(this, 1100, 4045, textureX, textureY); // Box 826
		bodyModel[531] = new ModelRendererTurbo(this, 1100, 3930, textureX, textureY); // Box 827
		bodyModel[532] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 828
		bodyModel[533] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 829
		bodyModel[534] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 830
		bodyModel[535] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 831
		bodyModel[536] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 832
		bodyModel[537] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 833
		bodyModel[538] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 834
		bodyModel[539] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 835
		bodyModel[540] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 836
		bodyModel[541] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 837
		bodyModel[542] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 838
		bodyModel[543] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 839
		bodyModel[544] = new ModelRendererTurbo(this, 1100, 3930, textureX, textureY); // Box 840
		bodyModel[545] = new ModelRendererTurbo(this, 1100, 4045, textureX, textureY); // Box 841
		bodyModel[546] = new ModelRendererTurbo(this, 1100, 4045, textureX, textureY); // Box 842
		bodyModel[547] = new ModelRendererTurbo(this, 1100, 3930, textureX, textureY); // Box 843
		bodyModel[548] = new ModelRendererTurbo(this, 1600, 0, textureX, textureY); // Box 844
		bodyModel[549] = new ModelRendererTurbo(this, 1600, 232, textureX, textureY); // Box 845
		bodyModel[550] = new ModelRendererTurbo(this, 1600, 457, textureX, textureY); // Box 846
		bodyModel[551] = new ModelRendererTurbo(this, 1600, 695, textureX, textureY); // Box 847
		bodyModel[552] = new ModelRendererTurbo(this, 1600, 922, textureX, textureY); // Box 848
		bodyModel[553] = new ModelRendererTurbo(this, 1600, 32, textureX, textureY); // Box 849
		bodyModel[554] = new ModelRendererTurbo(this, 1600, 111, textureX, textureY); // Box 850
		bodyModel[555] = new ModelRendererTurbo(this, 1600, 1148, textureX, textureY); // Box 851
		bodyModel[556] = new ModelRendererTurbo(this, 1600, 32, textureX, textureY); // Box 852
		bodyModel[557] = new ModelRendererTurbo(this, 1600, 111, textureX, textureY); // Box 853
		bodyModel[558] = new ModelRendererTurbo(this, 1600, 234, textureX, textureY); // Box 854
		bodyModel[559] = new ModelRendererTurbo(this, 1600, 312, textureX, textureY); // Box 855
		bodyModel[560] = new ModelRendererTurbo(this, 1600, 357, textureX, textureY); // Box 856
		bodyModel[561] = new ModelRendererTurbo(this, 1600, 388, textureX, textureY); // Box 857
		bodyModel[562] = new ModelRendererTurbo(this, 1600, 457, textureX, textureY); // Box 858
		bodyModel[563] = new ModelRendererTurbo(this, 1603, 522, textureX, textureY); // Box 859
		bodyModel[564] = new ModelRendererTurbo(this, 1600, 550, textureX, textureY); // Box 860
		bodyModel[565] = new ModelRendererTurbo(this, 1600, 584, textureX, textureY); // Box 861
		bodyModel[566] = new ModelRendererTurbo(this, 1600, 692, textureX, textureY); // Box 862
		bodyModel[567] = new ModelRendererTurbo(this, 1600, 730, textureX, textureY); // Box 863
		bodyModel[568] = new ModelRendererTurbo(this, 1600, 769, textureX, textureY); // Box 865
		bodyModel[569] = new ModelRendererTurbo(this, 1600, 780, textureX, textureY); // Box 866
		bodyModel[570] = new ModelRendererTurbo(this, 1600, 826, textureX, textureY); // Box 867
		bodyModel[571] = new ModelRendererTurbo(this, 1600, 840, textureX, textureY); // Box 868
		bodyModel[572] = new ModelRendererTurbo(this, 1600, 769, textureX, textureY); // Box 869
		bodyModel[573] = new ModelRendererTurbo(this, 1600, 780, textureX, textureY); // Box 870
		bodyModel[574] = new ModelRendererTurbo(this, 1600, 826, textureX, textureY); // Box 871
		bodyModel[575] = new ModelRendererTurbo(this, 1600, 840, textureX, textureY); // Box 872
		bodyModel[576] = new ModelRendererTurbo(this, 1600, 865, textureX, textureY); // Box 873
		bodyModel[577] = new ModelRendererTurbo(this, 1600, 917, textureX, textureY); // Box 874
		bodyModel[578] = new ModelRendererTurbo(this, 1600, 960, textureX, textureY); // Box 875
		bodyModel[579] = new ModelRendererTurbo(this, 1600, 980, textureX, textureY); // Box 876
		bodyModel[580] = new ModelRendererTurbo(this, 1600, 980, textureX, textureY); // Box 877
		bodyModel[581] = new ModelRendererTurbo(this, 1600, 960, textureX, textureY); // Box 878
		bodyModel[582] = new ModelRendererTurbo(this, 1600, 917, textureX, textureY); // Box 879
		bodyModel[583] = new ModelRendererTurbo(this, 1600, 865, textureX, textureY); // Box 880
		bodyModel[584] = new ModelRendererTurbo(this, 1600, 980, textureX, textureY); // Box 881
		bodyModel[585] = new ModelRendererTurbo(this, 1600, 960, textureX, textureY); // Box 882
		bodyModel[586] = new ModelRendererTurbo(this, 1600, 917, textureX, textureY); // Box 883
		bodyModel[587] = new ModelRendererTurbo(this, 1600, 865, textureX, textureY); // Box 884
		bodyModel[588] = new ModelRendererTurbo(this, 1600, 550, textureX, textureY); // Box 885
		bodyModel[589] = new ModelRendererTurbo(this, 1600, 584, textureX, textureY); // Box 886
		bodyModel[590] = new ModelRendererTurbo(this, 1600, 865, textureX, textureY); // Box 887
		bodyModel[591] = new ModelRendererTurbo(this, 1600, 917, textureX, textureY); // Box 888
		bodyModel[592] = new ModelRendererTurbo(this, 1600, 960, textureX, textureY); // Box 889
		bodyModel[593] = new ModelRendererTurbo(this, 1600, 692, textureX, textureY); // Box 890
		bodyModel[594] = new ModelRendererTurbo(this, 1600, 730, textureX, textureY); // Box 891
		bodyModel[595] = new ModelRendererTurbo(this, 1600, 980, textureX, textureY); // Box 892
		bodyModel[596] = new ModelRendererTurbo(this, 1600, 1294, textureX, textureY); // Box 890
		bodyModel[597] = new ModelRendererTurbo(this, 1600, 1000, textureX, textureY); // Box 1806
		bodyModel[598] = new ModelRendererTurbo(this, 1600, 1030, textureX, textureY); // Box 1807
		bodyModel[599] = new ModelRendererTurbo(this, 1600, 1065, textureX, textureY); // Box 1812
		bodyModel[600] = new ModelRendererTurbo(this, 1600, 1093, textureX, textureY); // Box 1813
		bodyModel[601] = new ModelRendererTurbo(this, 1600, 1065, textureX, textureY); // Box 1814
		bodyModel[602] = new ModelRendererTurbo(this, 1600, 1114, textureX, textureY); // Box 1815
		bodyModel[603] = new ModelRendererTurbo(this, 1600, 1148, textureX, textureY); // Box 1816
		bodyModel[604] = new ModelRendererTurbo(this, 1600, 1177, textureX, textureY); // Box 1817
		bodyModel[605] = new ModelRendererTurbo(this, 1600, 1177, textureX, textureY); // Box 1818
		bodyModel[606] = new ModelRendererTurbo(this, 1600, 1203, textureX, textureY); // Box 1819
		bodyModel[607] = new ModelRendererTurbo(this, 1600, 1203, textureX, textureY); // Box 1820
		bodyModel[608] = new ModelRendererTurbo(this, 1600, 1291, textureX, textureY); // Box 1821
		bodyModel[609] = new ModelRendererTurbo(this, 1600, 1330, textureX, textureY); // Box 1822
		bodyModel[610] = new ModelRendererTurbo(this, 1600, 1360, textureX, textureY); // Box 1823
		bodyModel[611] = new ModelRendererTurbo(this, 1600, 1330, textureX, textureY); // Box 1824
		bodyModel[612] = new ModelRendererTurbo(this, 1600, 1360, textureX, textureY); // Box 1825
		bodyModel[613] = new ModelRendererTurbo(this, 1600, 1030, textureX, textureY); // Box 1827
		bodyModel[614] = new ModelRendererTurbo(this, 1600, 1065, textureX, textureY); // Box 1828
		bodyModel[615] = new ModelRendererTurbo(this, 1600, 1093, textureX, textureY); // Box 1829
		bodyModel[616] = new ModelRendererTurbo(this, 1600, 1065, textureX, textureY); // Box 1830
		bodyModel[617] = new ModelRendererTurbo(this, 1600, 1114, textureX, textureY); // Box 1831
		bodyModel[618] = new ModelRendererTurbo(this, 1600, 1146, textureX, textureY); // Box 1832
		bodyModel[619] = new ModelRendererTurbo(this, 1600, 1177, textureX, textureY); // Box 1833
		bodyModel[620] = new ModelRendererTurbo(this, 1600, 1177, textureX, textureY); // Box 1834
		bodyModel[621] = new ModelRendererTurbo(this, 1600, 1203, textureX, textureY); // Box 1835
		bodyModel[622] = new ModelRendererTurbo(this, 1600, 1203, textureX, textureY); // Box 1836
		bodyModel[623] = new ModelRendererTurbo(this, 1600, 1291, textureX, textureY); // Box 1837
		bodyModel[624] = new ModelRendererTurbo(this, 1600, 1330, textureX, textureY); // Box 1838
		bodyModel[625] = new ModelRendererTurbo(this, 1600, 1360, textureX, textureY); // Box 1839
		bodyModel[626] = new ModelRendererTurbo(this, 1600, 1330, textureX, textureY); // Box 1840
		bodyModel[627] = new ModelRendererTurbo(this, 1600, 1360, textureX, textureY); // Box 1841
		bodyModel[628] = new ModelRendererTurbo(this, 1600, 1000, textureX, textureY); // Box 1842
		bodyModel[629] = new ModelRendererTurbo(this, 0, 3120, textureX, textureY); // Box 2270
		bodyModel[630] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 2271
		bodyModel[631] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 2272
		bodyModel[632] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 2273
		bodyModel[633] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 2274
		bodyModel[634] = new ModelRendererTurbo(this, 1000, 142, textureX, textureY); // Box 2275
		bodyModel[635] = new ModelRendererTurbo(this, 1100, 3843, textureX, textureY); // Box 2276
		bodyModel[636] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2254
		bodyModel[637] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 2255
		
		
		bodyModel[500].addShapeBox(0F, 0F, -5F, 9, 46, 5, 0F,0F, -12F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 796
		bodyModel[500].setRotationPoint(-171F, -351F, -117F);

		bodyModel[501].addShapeBox(0F, 0F, -5F, 9, 9, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -7F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 5F); // Box 797
		bodyModel[501].setRotationPoint(-171F, -305F, -117F);

		bodyModel[502].addShapeBox(0F, 0F, -5F, 63, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyModel[502].setRotationPoint(-162F, -351F, -117F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 84, 56, 224, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F); // Box 799
		bodyModel[503].setRotationPoint(-183F, -302F, -112F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 84, 56, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -50F, 0F); // Box 800
		bodyModel[504].setRotationPoint(-183F, -302F, -117F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 84, 56, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -55F, 0F); // Box 801
		bodyModel[505].setRotationPoint(-183F, -302F, 112F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 12, 42, 224, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		bodyModel[506].setRotationPoint(-183F, -344F, -112F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 12, 42, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		bodyModel[507].setRotationPoint(-183F, -344F, -117F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 12, 42, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		bodyModel[508].setRotationPoint(-183F, -344F, 112F);

		bodyModel[509].addShapeBox(0F, 0F, 5F, 11, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 5F, 0F, -7F, -5F, 0F, -5F, 0F); // Box 805
		bodyModel[509].setRotationPoint(-99F, -305F, 112F);

		bodyModel[510].addShapeBox(0F, 0F, 5F, 63, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 806
		bodyModel[510].setRotationPoint(-162F, -305F, 112F);

		bodyModel[511].addShapeBox(0F, 0F, 5F, 11, 46, 5, 0F,0F, 0F, 0F, 0F, -7F, 5F, 0F, -12F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 807
		bodyModel[511].setRotationPoint(-99F, -351F, 112F);

		bodyModel[512].addShapeBox(0F, 0F, 5F, 9, 9, 5, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -7F, 5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -5F); // Box 808
		bodyModel[512].setRotationPoint(-171F, -305F, 112F);

		bodyModel[513].addShapeBox(0F, 0F, 5F, 9, 46, 5, 0F,0F, -7F, 5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -12F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 809
		bodyModel[513].setRotationPoint(-171F, -351F, 112F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 23, 48, 224, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, -13.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.7F, 0F); // Box 810
		bodyModel[514].setRotationPoint(-206F, -344F, -112F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 23, 48, 5, 0F,-16F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -5F, -13.7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -13.7F, 0F); // Box 811
		bodyModel[515].setRotationPoint(-206F, -344F, -117F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 23, 48, 5, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -16F, -5F, 0F, 0F, -13.7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -13.7F, 0F); // Box 812
		bodyModel[516].setRotationPoint(-206F, -344F, 112F);

		bodyModel[517].addShapeBox(0F, 0F, -5F, 63, 4, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 813
		bodyModel[517].setRotationPoint(-162F, -344F, -117F);

		bodyModel[518].addShapeBox(0F, 0F, -5F, 63, 4, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 814
		bodyModel[518].setRotationPoint(-162F, -335F, -117F);

		bodyModel[519].addShapeBox(0F, 0F, -5F, 63, 4, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 815
		bodyModel[519].setRotationPoint(-162F, -327F, -117F);

		bodyModel[520].addShapeBox(0F, 0F, -5F, 63, 4, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 816
		bodyModel[520].setRotationPoint(-162F, -319F, -117F);

		bodyModel[521].addShapeBox(0F, 0F, -5F, 63, 4, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 817
		bodyModel[521].setRotationPoint(-162F, -311F, -117F);

		bodyModel[522].addShapeBox(0F, 0F, 5F, 63, 4, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 818
		bodyModel[522].setRotationPoint(-162F, -311F, 112F);

		bodyModel[523].addShapeBox(0F, 0F, 5F, 63, 4, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 819
		bodyModel[523].setRotationPoint(-162F, -319F, 112F);

		bodyModel[524].addShapeBox(0F, 0F, 5F, 63, 4, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 820
		bodyModel[524].setRotationPoint(-162F, -327F, 112F);

		bodyModel[525].addShapeBox(0F, 0F, 5F, 63, 4, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 821
		bodyModel[525].setRotationPoint(-162F, -335F, 112F);

		bodyModel[526].addShapeBox(0F, 0F, 5F, 63, 4, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 822
		bodyModel[526].setRotationPoint(-162F, -344F, 112F);

		bodyModel[527].addShapeBox(0F, 0F, 5F, 63, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 823
		bodyModel[527].setRotationPoint(-162F, -351F, 112F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 38, 3, 30, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 824
		bodyModel[528].setRotationPoint(-210F, -356F, -56F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 38, 34, 3, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		bodyModel[529].setRotationPoint(-210F, -353F, -56F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 38, 34, 3, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		bodyModel[530].setRotationPoint(-210F, -353F, -29F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 38, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		bodyModel[531].setRotationPoint(-210F, -319F, -56F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		bodyModel[532].setRotationPoint(-204F, -350F, -53F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		bodyModel[533].setRotationPoint(-204F, -345F, -53F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		bodyModel[534].setRotationPoint(-204F, -340F, -53F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		bodyModel[535].setRotationPoint(-204F, -335F, -53F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		bodyModel[536].setRotationPoint(-204F, -330F, -53F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		bodyModel[537].setRotationPoint(-204F, -325F, -53F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		bodyModel[538].setRotationPoint(-204F, -325F, 29F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		bodyModel[539].setRotationPoint(-204F, -330F, 29F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		bodyModel[540].setRotationPoint(-204F, -335F, 29F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		bodyModel[541].setRotationPoint(-204F, -340F, 29F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		bodyModel[542].setRotationPoint(-204F, -345F, 29F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 6, 5, 24, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		bodyModel[543].setRotationPoint(-204F, -350F, 29F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 38, 3, 30, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 840
		bodyModel[544].setRotationPoint(-210F, -356F, 26F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 38, 34, 3, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		bodyModel[545].setRotationPoint(-210F, -353F, 26F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 38, 34, 3, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		bodyModel[546].setRotationPoint(-210F, -353F, 53F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 38, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		bodyModel[547].setRotationPoint(-210F, -319F, 26F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 37, 17, 212, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 844
		bodyModel[548].setRotationPoint(-99F, -246F, -106F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 7, 10, 212, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 845
		bodyModel[549].setRotationPoint(-62F, -246F, -106F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 7, 17, 212, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 846
		bodyModel[550].setRotationPoint(-106F, -246F, -106F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 106, 7, 212, 0F,0F, 0F, 0F, 0F, -66F, 0F, 0F, -66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 66F, 0F, 0F, 66F, 0F, 0F, 0F, 0F); // Box 847
		bodyModel[551].setRotationPoint(-212F, -307F, -106F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 10, 10, 212, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 848
		bodyModel[552].setRotationPoint(-222F, -310F, -106F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 10, 26, 49, 0F,-2F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		bodyModel[553].setRotationPoint(-222F, -336F, -106F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 5, 5, 37, 0F,0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		bodyModel[554].setRotationPoint(-220F, -341F, -100F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 10, 8, 132, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 851
		bodyModel[555].setRotationPoint(-222F, -318F, -66F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 10, 26, 49, 0F,-2F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		bodyModel[556].setRotationPoint(-222F, -336F, 57F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 5, 5, 37, 0F,0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		bodyModel[557].setRotationPoint(-220F, -341F, 63F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 10, 26, 49, 0F,-2F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		bodyModel[558].setRotationPoint(-222F, -336F, -24.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 5, 5, 37, 0F,0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 855
		bodyModel[559].setRotationPoint(-220F, -341F, -18.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 21, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		bodyModel[560].setRotationPoint(-234F, -310F, -10F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 15, 20, 20, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 857
		bodyModel[561].setRotationPoint(-234F, -330F, -10F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 21, 41, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -65.84F, 0F, 0F, 65.84F, 0F, 0F, 65.84F, 0F, 0F, -65.84F, 0F, 0F); // Box 858
		bodyModel[562].setRotationPoint(-234F, -302F, -10F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 25, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 859
		bodyModel[563].setRotationPoint(-168F, -261F, -10F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 21, 11, 20, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		bodyModel[564].setRotationPoint(-161F, -268F, -60F);

		bodyModel[565].addShapeBox(-1F, 0F, 0F, 21, 37, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -59.42F, 0F, 0F, 38.42F, -14F, 0F, 38.42F, -14F, 0F, -59.42F, 0F, 0F); // Box 861
		bodyModel[565].setRotationPoint(-160F, -257F, -60F);

		bodyModel[566].addShapeBox(-1F, 0F, 0F, 7, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		bodyModel[566].setRotationPoint(-100.58F, -234F, -60F);

		bodyModel[567].addShapeBox(-1F, 0F, 0F, 31, 14, 20, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 863
		bodyModel[567].setRotationPoint(-93.58F, -234F, -60F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 25, 5, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 865
		bodyModel[568].setRotationPoint(-168F, -261F, -12F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 21, 41, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -67.84F, 0F, 0F, 65.84F, 0F, 0F, 65.84F, 0F, 0F, -65.84F, 0F, 0F); // Box 866
		bodyModel[569].setRotationPoint(-234F, -302F, -12F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 21, 8, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		bodyModel[570].setRotationPoint(-234F, -310F, -12F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 15, 20, 2, 0F,-15F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[571].setRotationPoint(-234F, -330F, -12F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 25, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -12F, -2F, 0F); // Box 869
		bodyModel[572].setRotationPoint(-168F, -261F, 10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 21, 41, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -65.84F, 0F, 0F, 65.84F, 0F, 0F, 65.84F, 0F, 0F, -67.84F, 0F, 0F); // Box 870
		bodyModel[573].setRotationPoint(-234F, -302F, 10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 21, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 871
		bodyModel[574].setRotationPoint(-234F, -310F, 10F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 15, 20, 2, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 872
		bodyModel[575].setRotationPoint(-234F, -330F, 10F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 21, 11, 2, 0F,-2F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		bodyModel[576].setRotationPoint(-161F, -268F, -62F);

		bodyModel[577].addShapeBox(-1F, 0F, 0F, 21, 37, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -59.42F, -2F, 0F, 38.42F, -14F, 0F, 38.42F, -14F, 0F, -59.42F, 0F, 0F); // Box 874
		bodyModel[577].setRotationPoint(-160F, -257F, -62F);

		bodyModel[578].addShapeBox(-1F, 0F, 0F, 7, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[578].setRotationPoint(-100.58F, -234F, -62F);

		bodyModel[579].addShapeBox(-1F, 0F, 0F, 31, 14, 2, 0F,0F, 0F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -15F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[579].setRotationPoint(-93.58F, -234F, -62F);

		bodyModel[580].addShapeBox(-1F, 0F, 0F, 31, 14, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -2F, -15F, 0F, 0F, -2F, 0F); // Box 877
		bodyModel[580].setRotationPoint(-93.58F, -234F, -40F);

		bodyModel[581].addShapeBox(-1F, 0F, 0F, 7, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 878
		bodyModel[581].setRotationPoint(-100.58F, -234F, -40F);

		bodyModel[582].addShapeBox(-1F, 0F, 0F, 21, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -59.42F, 0F, 0F, 38.42F, -14F, 0F, 38.42F, -14F, 0F, -59.42F, -2F, 0F); // Box 879
		bodyModel[582].setRotationPoint(-160F, -257F, -40F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 21, 11, 2, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 880
		bodyModel[583].setRotationPoint(-161F, -268F, -40F);

		bodyModel[584].addShapeBox(-1F, 0F, 0F, 31, 14, 2, 0F,0F, 0F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -15F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 881
		bodyModel[584].setRotationPoint(-93.58F, -234F, 38F);

		bodyModel[585].addShapeBox(-1F, 0F, 0F, 7, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		bodyModel[585].setRotationPoint(-100.58F, -234F, 38F);

		bodyModel[586].addShapeBox(-1F, 0F, 0F, 21, 37, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -59.42F, -2F, 0F, 38.42F, -14F, 0F, 38.42F, -14F, 0F, -59.42F, 0F, 0F); // Box 883
		bodyModel[586].setRotationPoint(-160F, -257F, 38F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 21, 11, 2, 0F,-2F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bodyModel[587].setRotationPoint(-161F, -268F, 38F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 21, 11, 20, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885
		bodyModel[588].setRotationPoint(-161F, -268F, 40F);

		bodyModel[589].addShapeBox(-1F, 0F, 0F, 21, 37, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -59.42F, 0F, 0F, 38.42F, -14F, 0F, 38.42F, -14F, 0F, -59.42F, 0F, 0F); // Box 886
		bodyModel[589].setRotationPoint(-160F, -257F, 40F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 21, 11, 2, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 887
		bodyModel[590].setRotationPoint(-161F, -268F, 60F);

		bodyModel[591].addShapeBox(-1F, 0F, 0F, 21, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -59.42F, 0F, 0F, 38.42F, -14F, 0F, 38.42F, -14F, 0F, -59.42F, -2F, 0F); // Box 888
		bodyModel[591].setRotationPoint(-160F, -257F, 60F);

		bodyModel[592].addShapeBox(-1F, 0F, 0F, 7, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 889
		bodyModel[592].setRotationPoint(-100.58F, -234F, 60F);

		bodyModel[593].addShapeBox(-1F, 0F, 0F, 7, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		bodyModel[593].setRotationPoint(-100.58F, -234F, 40F);

		bodyModel[594].addShapeBox(-1F, 0F, 0F, 31, 14, 20, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 891
		bodyModel[594].setRotationPoint(-93.58F, -234F, 40F);

		bodyModel[595].addShapeBox(-1F, 0F, 0F, 31, 14, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -2F, -15F, 0F, 0F, -2F, 0F); // Box 892
		bodyModel[595].setRotationPoint(-93.58F, -234F, 60F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 5, 26, 192, 0F,0F, 0F, -35F, 0F, -5F, -40F, 0F, -5F, -40F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F); // Box 890
		bodyModel[596].setRotationPoint(-27F, -421F, -96F);

		bodyModel[597].addShapeBox(0F, 6F, 66F, 34, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F); // Box 1806
		bodyModel[597].setRotationPoint(26.5F, -324F, 130F);
		bodyModel[597].rotateAngleX = -0.66322512F;

		bodyModel[598].addShapeBox(0F, 0F, 0F, 63, 21, 9, 0F,-4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1807
		bodyModel[598].setRotationPoint(11.5F, -281.5F, 173F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 63, 14, 9, 0F,-4.5F, 1.5F, 0F, -4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, -3.5F, 0F, -10.5F, -3.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 1812
		bodyModel[599].setRotationPoint(11.5F, -260.5F, 173F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 49, 7, 9, 0F,-3.5F, 3.5F, 0F, -3.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15.5F, -4.5F, 0F, -15.5F, -4.5F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 1813
		bodyModel[600].setRotationPoint(18.5F, -246.5F, 173F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 63, 14, 9, 0F,-10.5F, -3.5F, 0F, -10.5F, -3.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4.5F, 1.5F, 0F, -4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1814
		bodyModel[601].setRotationPoint(11.5F, -295.5F, 173F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 49, 7, 9, 0F,-15.5F, -4.5F, 0F, -15.5F, -4.5F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -3.5F, 3.5F, 0F, -3.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1815
		bodyModel[602].setRotationPoint(18.5F, -302.5F, 173F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 54, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1816
		bodyModel[603].setRotationPoint(16F, -280F, 182F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 54, 12, 8, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1817
		bodyModel[604].setRotationPoint(16F, -292F, 182F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 54, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1818
		bodyModel[605].setRotationPoint(16F, -262F, 182F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 42, 6, 8, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1819
		bodyModel[606].setRotationPoint(22F, -298F, 182F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 42, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 1820
		bodyModel[607].setRotationPoint(22F, -250F, 182F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 63, 21, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 1.5F, 0F, 4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 1.5F, 0F, 4.5F, 1.5F, 0F); // Box 1821
		bodyModel[608].setRotationPoint(11.5F, -281.5F, 190F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 63, 12, 15, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -3.5F, 5.5F, 0F, -3.5F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, -1.5F, 0F, 4.5F, -1.5F, 0F); // Box 1822
		bodyModel[609].setRotationPoint(11.5F, -293.5F, 190F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 51, 6, 15, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -13.5F, 7.5F, 0F, -13.5F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -5.5F, 0F, 2.5F, -5.5F, 0F); // Box 1823
		bodyModel[610].setRotationPoint(17.5F, -299.5F, 190F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 63, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4.5F, -1.5F, 0F, 4.5F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F, 5.5F, 0F, -3.5F, 5.5F, 0F); // Box 1824
		bodyModel[611].setRotationPoint(11.5F, -260.5F, 190F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 51, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -5.5F, 0F, 2.5F, -5.5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -13.5F, 7.5F, 0F, -13.5F, 7.5F, 0F); // Box 1825
		bodyModel[612].setRotationPoint(17.5F, -248.5F, 190F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 63, 21, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F); // Box 1827
		bodyModel[613].setRotationPoint(11.5F, -281.5F, -182F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 63, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 1.5F, 0F, -4.5F, 1.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -10.5F, -3.5F, 0F, -10.5F, -3.5F, 0F); // Box 1828
		bodyModel[614].setRotationPoint(11.5F, -260.5F, -182F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 49, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 3.5F, 0F, -3.5F, 3.5F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -15.5F, -4.5F, 0F, -15.5F, -4.5F, 0F); // Box 1829
		bodyModel[615].setRotationPoint(18.5F, -246.5F, -182F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 63, 14, 9, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -10.5F, -3.5F, 0F, -10.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 1.5F, 0F, -4.5F, 1.5F, 0F); // Box 1830
		bodyModel[616].setRotationPoint(11.5F, -295.5F, -182F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 49, 7, 9, 0F,-14F, 0F, 0F, -14F, 0F, 0F, -15.5F, -4.5F, 0F, -15.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 3.5F, 0F, -3.5F, 3.5F, 0F); // Box 1831
		bodyModel[617].setRotationPoint(18.5F, -302.5F, -182F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 54, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1832
		bodyModel[618].setRotationPoint(16F, -280F, -190F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 54, 12, 8, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1833
		bodyModel[619].setRotationPoint(16F, -292F, -190F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 54, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1834
		bodyModel[620].setRotationPoint(16F, -262F, -190F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 42, 6, 8, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1835
		bodyModel[621].setRotationPoint(22F, -298F, -190F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 42, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 1836
		bodyModel[622].setRotationPoint(22F, -250F, -190F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 63, 21, 15, 0F,4.5F, 1.5F, 0F, 4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 1.5F, 0F, 4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1837
		bodyModel[623].setRotationPoint(11.5F, -281.5F, -205F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 63, 12, 15, 0F,-3.5F, 5.5F, 0F, -3.5F, 5.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 4.5F, -1.5F, 0F, 4.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1838
		bodyModel[624].setRotationPoint(11.5F, -293.5F, -205F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 51, 6, 15, 0F,-13.5F, 7.5F, 0F, -13.5F, 7.5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 2.5F, -5.5F, 0F, 2.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1839
		bodyModel[625].setRotationPoint(17.5F, -299.5F, -205F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 63, 12, 15, 0F,4.5F, -1.5F, 0F, 4.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 5.5F, 0F, -3.5F, 5.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1840
		bodyModel[626].setRotationPoint(11.5F, -260.5F, -205F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 51, 6, 15, 0F,2.5F, -5.5F, 0F, 2.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 7.5F, 0F, -13.5F, 7.5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 1841
		bodyModel[627].setRotationPoint(17.5F, -248.5F, -205F);

		bodyModel[628].addShapeBox(0F, 6F, -70F, 34, 23, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1842
		bodyModel[628].setRotationPoint(26.5F, -324F, -130F);
		bodyModel[628].rotateAngleX = 0.66322512F;

		bodyModel[629].addShapeBox(0F, 0F, 0F, 23, 11, 3, 0F,0F, 0F, 0F, -3F, 5F, -10F, 0F, 5F, 13F, 0F, 0F, 0F, 0F, -3F, -3F, -3F, -12F, -13F, 0F, -14F, 13F, 0F, 0F, 3F); // Box 2270
		bodyModel[629].setRotationPoint(93F, -264F, -29F);

		bodyModel[630].addShapeBox(3F, -2.5F, 1F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2271
		bodyModel[630].setRotationPoint(-73F, -378F, 103F);

		bodyModel[631].addShapeBox(3F, -5.5F, 1F, 15, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2272
		bodyModel[631].setRotationPoint(-73F, -378F, 103F);

		bodyModel[632].addShapeBox(5F, -7.5F, 1F, 11, 2, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2273
		bodyModel[632].setRotationPoint(-73F, -378F, 103F);

		bodyModel[633].addShapeBox(3F, 2.5F, 1F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 2274
		bodyModel[633].setRotationPoint(-73F, -378F, 103F);

		bodyModel[634].addShapeBox(5F, 5.5F, 1F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 2275
		bodyModel[634].setRotationPoint(-73F, -378F, 103F);

		bodyModel[635].addShapeBox(0F, 0F, -5F, 63, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2276
		bodyModel[635].setRotationPoint(-162F, -305F, -117F);
		
		bodyModel[636].addShapeBox(0F, 0F, 5F, 60, 40, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2254
		bodyModel[636].setRotationPoint(-152F, -303F, 112.1F);

		bodyModel[637].addShapeBox(0F, 0F, 5F, 60, 40, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2255
		bodyModel[637].setRotationPoint(-145F, -303F, -122.1F);
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 379
		headModel[1] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 380
		headModel[2] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 382
		headModel[3] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 383
		headModel[4] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 384
		headModel[5] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 385
		headModel[6] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 386
		headModel[7] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 387
		headModel[8] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 388
		headModel[9] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 389
		headModel[10] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 390
		headModel[11] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 391
		headModel[12] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 392
		headModel[13] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 393
		headModel[14] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 394
		headModel[15] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 395
		headModel[16] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 396
		headModel[17] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 397
		headModel[18] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 398
		headModel[19] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 399
		headModel[20] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 400
		headModel[21] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 401
		headModel[22] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 402
		headModel[23] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 403
		headModel[24] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 404
		headModel[25] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 405
		headModel[26] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 406
		headModel[27] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 407
		headModel[28] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 408
		headModel[29] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 409
		headModel[30] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 410
		headModel[31] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 411
		headModel[32] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 412
		headModel[33] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 413
		headModel[34] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 414
		headModel[35] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 415
		headModel[36] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 415
		headModel[37] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 416
		headModel[38] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 417
		headModel[39] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 418
		headModel[40] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 419
		headModel[41] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 420
		headModel[42] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 421
		headModel[43] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 422
		headModel[44] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 423
		headModel[45] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 424
		headModel[46] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 425
		headModel[47] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 426
		headModel[48] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 427
		headModel[49] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 428
		headModel[50] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 429
		headModel[51] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 430
		headModel[52] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 431
		headModel[53] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 432
		headModel[54] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 433
		headModel[55] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 434
		headModel[56] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 435
		headModel[57] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 436
		headModel[58] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 437
		headModel[59] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 438
		headModel[60] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 439
		headModel[61] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 440
		headModel[62] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 441
		headModel[63] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 442
		headModel[64] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 443
		headModel[65] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 444
		headModel[66] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 445
		headModel[67] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 446
		headModel[68] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 447
		headModel[69] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 448
		headModel[70] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 449
		headModel[71] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 450
		headModel[72] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 451
		headModel[73] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 452
		headModel[74] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 453
		headModel[75] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 454
		headModel[76] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 455
		headModel[77] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 456
		headModel[78] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 457
		headModel[79] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 458
		headModel[80] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 459
		headModel[81] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 460
		headModel[82] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 461
		headModel[83] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 462
		headModel[84] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 463
		headModel[85] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 464
		headModel[86] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 465
		headModel[87] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 466
		headModel[88] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 467
		headModel[89] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 468
		headModel[90] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 469
		headModel[91] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 470
		headModel[92] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 471
		headModel[93] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 472
		headModel[94] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 473
		headModel[95] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 474
		headModel[96] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 475
		headModel[97] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 476
		headModel[98] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 477
		headModel[99] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 478
		headModel[100] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 479
		headModel[101] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 480
		headModel[102] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 481
		headModel[103] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 482
		headModel[104] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 483
		headModel[105] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 484
		headModel[106] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 485
		headModel[107] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 486
		headModel[108] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 487
		headModel[109] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 488
		headModel[110] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 489
		headModel[111] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 490
		headModel[112] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 491
		headModel[113] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 492
		headModel[114] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 493
		headModel[115] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 494
		headModel[116] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 495
		headModel[117] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 496
		headModel[118] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 497
		headModel[119] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 498
		headModel[120] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 499
		headModel[121] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 500
		headModel[122] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 501
		headModel[123] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 502
		headModel[124] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 503
		headModel[125] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 504
		headModel[126] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 505
		headModel[127] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 506
		headModel[128] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 507
		headModel[129] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 508
		headModel[130] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 509
		headModel[131] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 510
		headModel[132] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 511
		headModel[133] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 512
		headModel[134] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 513
		headModel[135] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 514
		headModel[136] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 515
		headModel[137] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 516
		headModel[138] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 517
		headModel[139] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 518
		headModel[140] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 519
		headModel[141] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 520
		headModel[142] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 521
		headModel[143] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 522
		headModel[144] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 523
		headModel[145] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 524
		headModel[146] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 525
		headModel[147] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 526
		headModel[148] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 527
		headModel[149] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 528
		headModel[150] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 529
		headModel[151] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 530
		headModel[152] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 531
		headModel[153] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 532
		headModel[154] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 533
		headModel[155] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 534
		headModel[156] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 535
		headModel[157] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 536
		headModel[158] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 537
		headModel[159] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 538
		headModel[160] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 539
		headModel[161] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 540
		headModel[162] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 541
		headModel[163] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 542
		headModel[164] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 543
		headModel[165] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 544
		headModel[166] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 545
		headModel[167] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 546
		headModel[168] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 547
		headModel[169] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 548
		headModel[170] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 549
		headModel[171] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 550
		headModel[172] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 551
		headModel[173] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 552
		headModel[174] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 553
		headModel[175] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 554
		headModel[176] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 555
		headModel[177] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 556
		headModel[178] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 557
		headModel[179] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 558
		headModel[180] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 559
		headModel[181] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 560
		headModel[182] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 561
		headModel[183] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 562
		headModel[184] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 563
		headModel[185] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 564
		headModel[186] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 565
		headModel[187] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 566
		headModel[188] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 567
		headModel[189] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 568
		headModel[190] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 569
		headModel[191] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 570
		headModel[192] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 571
		headModel[193] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 572
		headModel[194] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 573
		headModel[195] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 574
		headModel[196] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 575
		headModel[197] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 576
		headModel[198] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 577
		headModel[199] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 578
		headModel[200] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 579
		headModel[201] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 580
		headModel[202] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 581
		headModel[203] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 582
		headModel[204] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 583
		headModel[205] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 584
		headModel[206] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 585
		headModel[207] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 586
		headModel[208] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 587
		headModel[209] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 588
		headModel[210] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 589
		headModel[211] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 590
		headModel[212] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 591
		headModel[213] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 592
		headModel[214] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 593
		headModel[215] = new ModelRendererTurbo(this, 1600, 1384, textureX, textureY); // Box 594
		headModel[216] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 595
		headModel[217] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 596
		headModel[218] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 597
		headModel[219] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 598
		headModel[220] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 599
		headModel[221] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 600
		headModel[222] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 601
		headModel[223] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 602
		headModel[224] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 603
		headModel[225] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 604
		headModel[226] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 605
		headModel[227] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 606
		headModel[228] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 607
		headModel[229] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 608
		headModel[230] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 609
		headModel[231] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 610
		headModel[232] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 611
		headModel[233] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 612
		headModel[234] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 613
		headModel[235] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 614
		headModel[236] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 615
		headModel[237] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 616
		headModel[238] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 617
		headModel[239] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 618
		headModel[240] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 619
		headModel[241] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 620
		headModel[242] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 621
		headModel[243] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 622
		headModel[244] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 623
		headModel[245] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 624
		headModel[246] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 625
		headModel[247] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 626
		headModel[248] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 627
		headModel[249] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 628
		headModel[250] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 629
		headModel[251] = new ModelRendererTurbo(this, 1600, 1423, textureX, textureY); // Box 630
		headModel[252] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 631
		headModel[253] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 632
		headModel[254] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 633
		headModel[255] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 634
		headModel[256] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 635
		headModel[257] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 636
		headModel[258] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 637
		headModel[259] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 638
		headModel[260] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 639
		headModel[261] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 640
		headModel[262] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 641
		headModel[263] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 642
		headModel[264] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 643
		headModel[265] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 644
		headModel[266] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 645
		headModel[267] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 646
		headModel[268] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 647
		headModel[269] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 648
		headModel[270] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 649
		headModel[271] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 650
		headModel[272] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 651
		headModel[273] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 652
		headModel[274] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 653
		headModel[275] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 654
		headModel[276] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 655
		headModel[277] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 656
		headModel[278] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 657
		headModel[279] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 658
		headModel[280] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 659
		headModel[281] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 660
		headModel[282] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 661
		headModel[283] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 662
		headModel[284] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 663
		headModel[285] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 664
		headModel[286] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 665
		headModel[287] = new ModelRendererTurbo(this, 1600, 1437, textureX, textureY); // Box 666
		headModel[288] = new ModelRendererTurbo(this, 1600, 1519, textureX, textureY); // Box 891
		headModel[289] = new ModelRendererTurbo(this, 1600, 1575, textureX, textureY); // Box 892
		headModel[290] = new ModelRendererTurbo(this, 1600, 1630, textureX, textureY); // Box 893
		headModel[291] = new ModelRendererTurbo(this, 1600, 1671, textureX, textureY); // Box 894
		headModel[292] = new ModelRendererTurbo(this, 1600, 1726, textureX, textureY); // Box 896
		headModel[293] = new ModelRendererTurbo(this, 1600, 1779, textureX, textureY); // Box 896
		headModel[294] = new ModelRendererTurbo(this, 1600, 1835, textureX, textureY); // Box 897
		headModel[295] = new ModelRendererTurbo(this, 1600, 1890, textureX, textureY); // Box 898
		headModel[296] = new ModelRendererTurbo(this, 1600, 1932, textureX, textureY); // Box 899
		headModel[297] = new ModelRendererTurbo(this, 1600, 1988, textureX, textureY); // Box 900
		headModel[298] = new ModelRendererTurbo(this, 1600, 2169, textureX, textureY); // Box 901
		headModel[299] = new ModelRendererTurbo(this, 1600, 2206, textureX, textureY); // Box 902
		headModel[300] = new ModelRendererTurbo(this, 1600, 2257, textureX, textureY); // Box 903
		headModel[301] = new ModelRendererTurbo(this, 1600, 2300, textureX, textureY); // Box 904
		headModel[302] = new ModelRendererTurbo(this, 1600, 2356, textureX, textureY); // Box 905
		headModel[303] = new ModelRendererTurbo(this, 1600, 2387, textureX, textureY); // Box 906
		headModel[304] = new ModelRendererTurbo(this, 1600, 2421, textureX, textureY); // Box 908
		headModel[305] = new ModelRendererTurbo(this, 1600, 2459, textureX, textureY); // Box 909
		headModel[306] = new ModelRendererTurbo(this, 1600, 1630, textureX, textureY); // Box 910
		headModel[307] = new ModelRendererTurbo(this, 1600, 1726, textureX, textureY); // Box 911
		headModel[308] = new ModelRendererTurbo(this, 1600, 1671, textureX, textureY); // Box 912
		headModel[309] = new ModelRendererTurbo(this, 1600, 1518, textureX, textureY); // Box 913
		headModel[310] = new ModelRendererTurbo(this, 1600, 1575, textureX, textureY); // Box 914
		headModel[311] = new ModelRendererTurbo(this, 1600, 1890, textureX, textureY); // Box 915
		headModel[312] = new ModelRendererTurbo(this, 1600, 1835, textureX, textureY); // Box 916
		headModel[313] = new ModelRendererTurbo(this, 1600, 1988, textureX, textureY); // Box 917
		headModel[314] = new ModelRendererTurbo(this, 1600, 1932, textureX, textureY); // Box 918
		headModel[315] = new ModelRendererTurbo(this, 1600, 1779, textureX, textureY); // Box 919
		headModel[316] = new ModelRendererTurbo(this, 1600, 2169, textureX, textureY); // Box 920
		headModel[317] = new ModelRendererTurbo(this, 1600, 2300, textureX, textureY); // Box 921
		headModel[318] = new ModelRendererTurbo(this, 1600, 2206, textureX, textureY); // Box 922
		headModel[319] = new ModelRendererTurbo(this, 1600, 2257, textureX, textureY); // Box 923
		headModel[320] = new ModelRendererTurbo(this, 1600, 2421, textureX, textureY); // Box 924
		headModel[321] = new ModelRendererTurbo(this, 1600, 2387, textureX, textureY); // Box 925
		headModel[322] = new ModelRendererTurbo(this, 1600, 2356, textureX, textureY); // Box 926
		headModel[323] = new ModelRendererTurbo(this, 1600, 2459, textureX, textureY); // Box 927
		headModel[324] = new ModelRendererTurbo(this, 1600, 2540, textureX, textureY); // Box 928
		headModel[325] = new ModelRendererTurbo(this, 1600, 2604, textureX, textureY); // Box 929
		headModel[326] = new ModelRendererTurbo(this, 1600, 2668, textureX, textureY); // Box 930
		headModel[327] = new ModelRendererTurbo(this, 1600, 2840, textureX, textureY); // Box 931
		headModel[328] = new ModelRendererTurbo(this, 1600, 2879, textureX, textureY); // Box 932
		headModel[329] = new ModelRendererTurbo(this, 1600, 2941, textureX, textureY); // Box 933
		headModel[330] = new ModelRendererTurbo(this, 1600, 2978, textureX, textureY); // Box 934
		headModel[331] = new ModelRendererTurbo(this, 1600, 3034, textureX, textureY); // Box 935
		headModel[332] = new ModelRendererTurbo(this, 1600, 3099, textureX, textureY); // Box 936
		headModel[333] = new ModelRendererTurbo(this, 1600, 3154, textureX, textureY); // Box 937
		headModel[334] = new ModelRendererTurbo(this, 1600, 3188, textureX, textureY); // Box 938
		headModel[335] = new ModelRendererTurbo(this, 1600, 3242, textureX, textureY); // Box 939
		headModel[336] = new ModelRendererTurbo(this, 1600, 3099, textureX, textureY); // Box 940
		headModel[337] = new ModelRendererTurbo(this, 1600, 3242, textureX, textureY); // Box 941
		headModel[338] = new ModelRendererTurbo(this, 1600, 3188, textureX, textureY); // Box 942
		headModel[339] = new ModelRendererTurbo(this, 1600, 3154, textureX, textureY); // Box 943
		headModel[340] = new ModelRendererTurbo(this, 1600, 2941, textureX, textureY); // Box 944
		headModel[341] = new ModelRendererTurbo(this, 1600, 2978, textureX, textureY); // Box 945
		headModel[342] = new ModelRendererTurbo(this, 1600, 3034, textureX, textureY); // Box 946
		headModel[343] = new ModelRendererTurbo(this, 1600, 2879, textureX, textureY); // Box 947
		headModel[344] = new ModelRendererTurbo(this, 1600, 2540, textureX, textureY); // Box 948
		headModel[345] = new ModelRendererTurbo(this, 1600, 2604, textureX, textureY); // Box 949
		headModel[346] = new ModelRendererTurbo(this, 1600, 2668, textureX, textureY); // Box 950
		headModel[347] = new ModelRendererTurbo(this, 1600, 2840, textureX, textureY); // Box 951

		headModel[0].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 379
		headModel[0].setRotationPoint(-216F, -416F, -43F);

		headModel[1].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		headModel[1].setRotationPoint(-216F, -416F, -43F);

		headModel[2].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		headModel[2].setRotationPoint(-216F, -416F, -43F);

		headModel[3].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		headModel[3].setRotationPoint(-216F, -416F, -43F);
		headModel[3].rotateAngleX = 0.13089969F;

		headModel[4].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 384
		headModel[4].setRotationPoint(-216F, -416F, -43F);
		headModel[4].rotateAngleX = 0.13089969F;

		headModel[5].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		headModel[5].setRotationPoint(-216F, -416F, -43F);
		headModel[5].rotateAngleX = 0.13089969F;

		headModel[6].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		headModel[6].setRotationPoint(-216F, -416F, -43F);
		headModel[6].rotateAngleX = 0.26179939F;

		headModel[7].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 387
		headModel[7].setRotationPoint(-216F, -416F, -43F);
		headModel[7].rotateAngleX = 0.26179939F;

		headModel[8].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		headModel[8].setRotationPoint(-216F, -416F, -43F);
		headModel[8].rotateAngleX = 0.26179939F;

		headModel[9].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		headModel[9].setRotationPoint(-216F, -416F, -43F);
		headModel[9].rotateAngleX = 0.39269908F;

		headModel[10].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 390
		headModel[10].setRotationPoint(-216F, -416F, -43F);
		headModel[10].rotateAngleX = 0.39269908F;

		headModel[11].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		headModel[11].setRotationPoint(-216F, -416F, -43F);
		headModel[11].rotateAngleX = 0.39269908F;

		headModel[12].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		headModel[12].setRotationPoint(-216F, -416F, -43F);
		headModel[12].rotateAngleX = 0.52359878F;

		headModel[13].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 393
		headModel[13].setRotationPoint(-216F, -416F, -43F);
		headModel[13].rotateAngleX = 0.52359878F;

		headModel[14].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		headModel[14].setRotationPoint(-216F, -416F, -43F);
		headModel[14].rotateAngleX = 0.52359878F;

		headModel[15].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		headModel[15].setRotationPoint(-216F, -416F, -43F);
		headModel[15].rotateAngleX = 0.65449847F;

		headModel[16].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 396
		headModel[16].setRotationPoint(-216F, -416F, -43F);
		headModel[16].rotateAngleX = 0.65449847F;

		headModel[17].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		headModel[17].setRotationPoint(-216F, -416F, -43F);
		headModel[17].rotateAngleX = 0.65449847F;

		headModel[18].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		headModel[18].setRotationPoint(-216F, -416F, -43F);
		headModel[18].rotateAngleX = 0.78539816F;

		headModel[19].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 399
		headModel[19].setRotationPoint(-216F, -416F, -43F);
		headModel[19].rotateAngleX = 0.78539816F;

		headModel[20].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		headModel[20].setRotationPoint(-216F, -416F, -43F);
		headModel[20].rotateAngleX = 0.78539816F;

		headModel[21].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		headModel[21].setRotationPoint(-216F, -416F, -43F);
		headModel[21].rotateAngleX = 0.91629786F;

		headModel[22].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 402
		headModel[22].setRotationPoint(-216F, -416F, -43F);
		headModel[22].rotateAngleX = 0.91629786F;

		headModel[23].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		headModel[23].setRotationPoint(-216F, -416F, -43F);
		headModel[23].rotateAngleX = 0.91629786F;

		headModel[24].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		headModel[24].setRotationPoint(-216F, -416F, -43F);
		headModel[24].rotateAngleX = 1.04719755F;

		headModel[25].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 405
		headModel[25].setRotationPoint(-216F, -416F, -43F);
		headModel[25].rotateAngleX = 1.04719755F;

		headModel[26].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		headModel[26].setRotationPoint(-216F, -416F, -43F);
		headModel[26].rotateAngleX = 1.04719755F;

		headModel[27].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		headModel[27].setRotationPoint(-216F, -416F, -43F);
		headModel[27].rotateAngleX = 1.17809725F;

		headModel[28].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 408
		headModel[28].setRotationPoint(-216F, -416F, -43F);
		headModel[28].rotateAngleX = 1.17809725F;

		headModel[29].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		headModel[29].setRotationPoint(-216F, -416F, -43F);
		headModel[29].rotateAngleX = 1.17809725F;

		headModel[30].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		headModel[30].setRotationPoint(-216F, -416F, -43F);
		headModel[30].rotateAngleX = 1.30899694F;

		headModel[31].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 411
		headModel[31].setRotationPoint(-216F, -416F, -43F);
		headModel[31].rotateAngleX = 1.30899694F;

		headModel[32].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		headModel[32].setRotationPoint(-216F, -416F, -43F);
		headModel[32].rotateAngleX = 1.30899694F;

		headModel[33].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		headModel[33].setRotationPoint(-216F, -416F, -43F);
		headModel[33].rotateAngleX = 1.43989663F;

		headModel[34].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 414
		headModel[34].setRotationPoint(-216F, -416F, -43F);
		headModel[34].rotateAngleX = 1.43989663F;

		headModel[35].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		headModel[35].setRotationPoint(-216F, -416F, -43F);
		headModel[35].rotateAngleX = 1.43989663F;

		headModel[36].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 415
		headModel[36].setRotationPoint(-216F, -416F, -43F);
		headModel[36].rotateAngleX = 1.57079633F;

		headModel[37].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 416
		headModel[37].setRotationPoint(-216F, -416F, -43F);
		headModel[37].rotateAngleX = 1.70169602F;

		headModel[38].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 417
		headModel[38].setRotationPoint(-216F, -416F, -43F);
		headModel[38].rotateAngleX = 1.83259571F;

		headModel[39].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 418
		headModel[39].setRotationPoint(-216F, -416F, -43F);
		headModel[39].rotateAngleX = 1.96349541F;

		headModel[40].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 419
		headModel[40].setRotationPoint(-216F, -416F, -43F);
		headModel[40].rotateAngleX = 2.0943951F;

		headModel[41].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 420
		headModel[41].setRotationPoint(-216F, -416F, -43F);
		headModel[41].rotateAngleX = 2.2252948F;

		headModel[42].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 421
		headModel[42].setRotationPoint(-216F, -416F, -43F);
		headModel[42].rotateAngleX = 2.35619449F;

		headModel[43].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 422
		headModel[43].setRotationPoint(-216F, -416F, -43F);
		headModel[43].rotateAngleX = 2.48709418F;

		headModel[44].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 423
		headModel[44].setRotationPoint(-216F, -416F, -43F);
		headModel[44].rotateAngleX = 2.61799388F;

		headModel[45].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 424
		headModel[45].setRotationPoint(-216F, -416F, -43F);
		headModel[45].rotateAngleX = 2.74889357F;

		headModel[46].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 425
		headModel[46].setRotationPoint(-216F, -416F, -43F);
		headModel[46].rotateAngleX = 2.87979327F;

		headModel[47].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 426
		headModel[47].setRotationPoint(-216F, -416F, -43F);
		headModel[47].rotateAngleX = 3.01069296F;

		headModel[48].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		headModel[48].setRotationPoint(-216F, -416F, -43F);
		headModel[48].rotateAngleX = 1.57079633F;

		headModel[49].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		headModel[49].setRotationPoint(-216F, -416F, -43F);
		headModel[49].rotateAngleX = 1.70169602F;

		headModel[50].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		headModel[50].setRotationPoint(-216F, -416F, -43F);
		headModel[50].rotateAngleX = 1.83259571F;

		headModel[51].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		headModel[51].setRotationPoint(-216F, -416F, -43F);
		headModel[51].rotateAngleX = 1.96349541F;

		headModel[52].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		headModel[52].setRotationPoint(-216F, -416F, -43F);
		headModel[52].rotateAngleX = 2.0943951F;

		headModel[53].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		headModel[53].setRotationPoint(-216F, -416F, -43F);
		headModel[53].rotateAngleX = 2.2252948F;

		headModel[54].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		headModel[54].setRotationPoint(-216F, -416F, -43F);
		headModel[54].rotateAngleX = 2.35619449F;

		headModel[55].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		headModel[55].setRotationPoint(-216F, -416F, -43F);
		headModel[55].rotateAngleX = 2.48709418F;

		headModel[56].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		headModel[56].setRotationPoint(-216F, -416F, -43F);
		headModel[56].rotateAngleX = 2.61799388F;

		headModel[57].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		headModel[57].setRotationPoint(-216F, -416F, -43F);
		headModel[57].rotateAngleX = 2.74889357F;

		headModel[58].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		headModel[58].setRotationPoint(-216F, -416F, -43F);
		headModel[58].rotateAngleX = 2.87979327F;

		headModel[59].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		headModel[59].setRotationPoint(-216F, -416F, -43F);
		headModel[59].rotateAngleX = 3.01069296F;

		headModel[60].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		headModel[60].setRotationPoint(-216F, -416F, -43F);
		headModel[60].rotateAngleX = 3.01069296F;

		headModel[61].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		headModel[61].setRotationPoint(-216F, -416F, -43F);
		headModel[61].rotateAngleX = 2.87979327F;

		headModel[62].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		headModel[62].setRotationPoint(-216F, -416F, -43F);
		headModel[62].rotateAngleX = 2.74889357F;

		headModel[63].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		headModel[63].setRotationPoint(-216F, -416F, -43F);
		headModel[63].rotateAngleX = 2.61799388F;

		headModel[64].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		headModel[64].setRotationPoint(-216F, -416F, -43F);
		headModel[64].rotateAngleX = 2.48709418F;

		headModel[65].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		headModel[65].setRotationPoint(-216F, -416F, -43F);
		headModel[65].rotateAngleX = 2.35619449F;

		headModel[66].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		headModel[66].setRotationPoint(-216F, -416F, -43F);
		headModel[66].rotateAngleX = 2.2252948F;

		headModel[67].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		headModel[67].setRotationPoint(-216F, -416F, -43F);
		headModel[67].rotateAngleX = 2.0943951F;

		headModel[68].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		headModel[68].setRotationPoint(-216F, -416F, -43F);
		headModel[68].rotateAngleX = 1.96349541F;

		headModel[69].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		headModel[69].setRotationPoint(-216F, -416F, -43F);
		headModel[69].rotateAngleX = 1.83259571F;

		headModel[70].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		headModel[70].setRotationPoint(-216F, -416F, -43F);
		headModel[70].rotateAngleX = 1.70169602F;

		headModel[71].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		headModel[71].setRotationPoint(-216F, -416F, -43F);
		headModel[71].rotateAngleX = 1.57079633F;

		headModel[72].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 451
		headModel[72].setRotationPoint(-216F, -416F, -43F);
		headModel[72].rotateAngleX = 3.14159265F;

		headModel[73].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 452
		headModel[73].setRotationPoint(-216F, -416F, -43F);
		headModel[73].rotateAngleX = 3.27249235F;

		headModel[74].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 453
		headModel[74].setRotationPoint(-216F, -416F, -43F);
		headModel[74].rotateAngleX = 3.40339204F;

		headModel[75].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 454
		headModel[75].setRotationPoint(-216F, -416F, -43F);
		headModel[75].rotateAngleX = 3.53429174F;

		headModel[76].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 455
		headModel[76].setRotationPoint(-216F, -416F, -43F);
		headModel[76].rotateAngleX = 3.66519143F;

		headModel[77].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 456
		headModel[77].setRotationPoint(-216F, -416F, -43F);
		headModel[77].rotateAngleX = 3.79609112F;

		headModel[78].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 457
		headModel[78].setRotationPoint(-216F, -416F, -43F);
		headModel[78].rotateAngleX = 3.92699082F;

		headModel[79].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 458
		headModel[79].setRotationPoint(-216F, -416F, -43F);
		headModel[79].rotateAngleX = 4.05789051F;

		headModel[80].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 459
		headModel[80].setRotationPoint(-216F, -416F, -43F);
		headModel[80].rotateAngleX = 4.1887902F;

		headModel[81].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 460
		headModel[81].setRotationPoint(-216F, -416F, -43F);
		headModel[81].rotateAngleX = 4.3196899F;

		headModel[82].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 461
		headModel[82].setRotationPoint(-216F, -416F, -43F);
		headModel[82].rotateAngleX = 4.45058959F;

		headModel[83].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 462
		headModel[83].setRotationPoint(-216F, -416F, -43F);
		headModel[83].rotateAngleX = 4.58148929F;

		headModel[84].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		headModel[84].setRotationPoint(-216F, -416F, -43F);
		headModel[84].rotateAngleX = 3.14159265F;

		headModel[85].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		headModel[85].setRotationPoint(-216F, -416F, -43F);
		headModel[85].rotateAngleX = 3.27249235F;

		headModel[86].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		headModel[86].setRotationPoint(-216F, -416F, -43F);
		headModel[86].rotateAngleX = 3.40339204F;

		headModel[87].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		headModel[87].setRotationPoint(-216F, -416F, -43F);
		headModel[87].rotateAngleX = 3.53429174F;

		headModel[88].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		headModel[88].setRotationPoint(-216F, -416F, -43F);
		headModel[88].rotateAngleX = 3.66519143F;

		headModel[89].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		headModel[89].setRotationPoint(-216F, -416F, -43F);
		headModel[89].rotateAngleX = 3.79609112F;

		headModel[90].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		headModel[90].setRotationPoint(-216F, -416F, -43F);
		headModel[90].rotateAngleX = 3.92699082F;

		headModel[91].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		headModel[91].setRotationPoint(-216F, -416F, -43F);
		headModel[91].rotateAngleX = 4.05789051F;

		headModel[92].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		headModel[92].setRotationPoint(-216F, -416F, -43F);
		headModel[92].rotateAngleX = 4.1887902F;

		headModel[93].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		headModel[93].setRotationPoint(-216F, -416F, -43F);
		headModel[93].rotateAngleX = 4.3196899F;

		headModel[94].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		headModel[94].setRotationPoint(-216F, -416F, -43F);
		headModel[94].rotateAngleX = 4.45058959F;

		headModel[95].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		headModel[95].setRotationPoint(-216F, -416F, -43F);
		headModel[95].rotateAngleX = 4.58148929F;

		headModel[96].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		headModel[96].setRotationPoint(-216F, -416F, -43F);
		headModel[96].rotateAngleX = 4.58148929F;

		headModel[97].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		headModel[97].setRotationPoint(-216F, -416F, -43F);
		headModel[97].rotateAngleX = 4.45058959F;

		headModel[98].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		headModel[98].setRotationPoint(-216F, -416F, -43F);
		headModel[98].rotateAngleX = 4.3196899F;

		headModel[99].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		headModel[99].setRotationPoint(-216F, -416F, -43F);
		headModel[99].rotateAngleX = 4.1887902F;

		headModel[100].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		headModel[100].setRotationPoint(-216F, -416F, -43F);
		headModel[100].rotateAngleX = 4.05789051F;

		headModel[101].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		headModel[101].setRotationPoint(-216F, -416F, -43F);
		headModel[101].rotateAngleX = 3.92699082F;

		headModel[102].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		headModel[102].setRotationPoint(-216F, -416F, -43F);
		headModel[102].rotateAngleX = 3.79609112F;

		headModel[103].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		headModel[103].setRotationPoint(-216F, -416F, -43F);
		headModel[103].rotateAngleX = 3.66519143F;

		headModel[104].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		headModel[104].setRotationPoint(-216F, -416F, -43F);
		headModel[104].rotateAngleX = 3.53429174F;

		headModel[105].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		headModel[105].setRotationPoint(-216F, -416F, -43F);
		headModel[105].rotateAngleX = 3.40339204F;

		headModel[106].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		headModel[106].setRotationPoint(-216F, -416F, -43F);
		headModel[106].rotateAngleX = 3.27249235F;

		headModel[107].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		headModel[107].setRotationPoint(-216F, -416F, -43F);
		headModel[107].rotateAngleX = 3.14159265F;

		headModel[108].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 487
		headModel[108].setRotationPoint(-216F, -416F, -43F);
		headModel[108].rotateAngleX = 4.71238898F;

		headModel[109].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 488
		headModel[109].setRotationPoint(-216F, -416F, -43F);
		headModel[109].rotateAngleX = 4.84328867F;

		headModel[110].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 489
		headModel[110].setRotationPoint(-216F, -416F, -43F);
		headModel[110].rotateAngleX = 4.97418837F;

		headModel[111].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 490
		headModel[111].setRotationPoint(-216F, -416F, -43F);
		headModel[111].rotateAngleX = 5.10508806F;

		headModel[112].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 491
		headModel[112].setRotationPoint(-216F, -416F, -43F);
		headModel[112].rotateAngleX = 5.23598776F;

		headModel[113].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 492
		headModel[113].setRotationPoint(-216F, -416F, -43F);
		headModel[113].rotateAngleX = 5.36688745F;

		headModel[114].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 493
		headModel[114].setRotationPoint(-216F, -416F, -43F);
		headModel[114].rotateAngleX = 5.49778714F;

		headModel[115].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 494
		headModel[115].setRotationPoint(-216F, -416F, -43F);
		headModel[115].rotateAngleX = 5.62868684F;

		headModel[116].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 495
		headModel[116].setRotationPoint(-216F, -416F, -43F);
		headModel[116].rotateAngleX = 5.75958653F;

		headModel[117].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 496
		headModel[117].setRotationPoint(-216F, -416F, -43F);
		headModel[117].rotateAngleX = 5.89048623F;

		headModel[118].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 497
		headModel[118].setRotationPoint(-216F, -416F, -43F);
		headModel[118].rotateAngleX = 6.02138592F;

		headModel[119].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 498
		headModel[119].setRotationPoint(-216F, -416F, -43F);
		headModel[119].rotateAngleX = 6.15228561F;

		headModel[120].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		headModel[120].setRotationPoint(-216F, -416F, -43F);
		headModel[120].rotateAngleX = 4.71238898F;

		headModel[121].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		headModel[121].setRotationPoint(-216F, -416F, -43F);
		headModel[121].rotateAngleX = 4.84328867F;

		headModel[122].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		headModel[122].setRotationPoint(-216F, -416F, -43F);
		headModel[122].rotateAngleX = 4.97418837F;

		headModel[123].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		headModel[123].setRotationPoint(-216F, -416F, -43F);
		headModel[123].rotateAngleX = 5.10508806F;

		headModel[124].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		headModel[124].setRotationPoint(-216F, -416F, -43F);
		headModel[124].rotateAngleX = 5.23598776F;

		headModel[125].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		headModel[125].setRotationPoint(-216F, -416F, -43F);
		headModel[125].rotateAngleX = 5.36688745F;

		headModel[126].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		headModel[126].setRotationPoint(-216F, -416F, -43F);
		headModel[126].rotateAngleX = 5.49778714F;

		headModel[127].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		headModel[127].setRotationPoint(-216F, -416F, -43F);
		headModel[127].rotateAngleX = 5.62868684F;

		headModel[128].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		headModel[128].setRotationPoint(-216F, -416F, -43F);
		headModel[128].rotateAngleX = 5.75958653F;

		headModel[129].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		headModel[129].setRotationPoint(-216F, -416F, -43F);
		headModel[129].rotateAngleX = 5.89048623F;

		headModel[130].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		headModel[130].setRotationPoint(-216F, -416F, -43F);
		headModel[130].rotateAngleX = 6.02138592F;

		headModel[131].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		headModel[131].setRotationPoint(-216F, -416F, -43F);
		headModel[131].rotateAngleX = 6.15228561F;

		headModel[132].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		headModel[132].setRotationPoint(-216F, -416F, -43F);
		headModel[132].rotateAngleX = 6.15228561F;

		headModel[133].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		headModel[133].setRotationPoint(-216F, -416F, -43F);
		headModel[133].rotateAngleX = 6.02138592F;

		headModel[134].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		headModel[134].setRotationPoint(-216F, -416F, -43F);
		headModel[134].rotateAngleX = 5.89048623F;

		headModel[135].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		headModel[135].setRotationPoint(-216F, -416F, -43F);
		headModel[135].rotateAngleX = 5.75958653F;

		headModel[136].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		headModel[136].setRotationPoint(-216F, -416F, -43F);
		headModel[136].rotateAngleX = 5.62868684F;

		headModel[137].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		headModel[137].setRotationPoint(-216F, -416F, -43F);
		headModel[137].rotateAngleX = 5.49778714F;

		headModel[138].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		headModel[138].setRotationPoint(-216F, -416F, -43F);
		headModel[138].rotateAngleX = 5.36688745F;

		headModel[139].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		headModel[139].setRotationPoint(-216F, -416F, -43F);
		headModel[139].rotateAngleX = 5.23598776F;

		headModel[140].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		headModel[140].setRotationPoint(-216F, -416F, -43F);
		headModel[140].rotateAngleX = 5.10508806F;

		headModel[141].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		headModel[141].setRotationPoint(-216F, -416F, -43F);
		headModel[141].rotateAngleX = 4.97418837F;

		headModel[142].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		headModel[142].setRotationPoint(-216F, -416F, -43F);
		headModel[142].rotateAngleX = 4.84328867F;

		headModel[143].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		headModel[143].setRotationPoint(-216F, -416F, -43F);
		headModel[143].rotateAngleX = 4.71238898F;

		headModel[144].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 523
		headModel[144].setRotationPoint(-216F, -416F, 43F);
		headModel[144].rotateAngleX = 4.71238898F;

		headModel[145].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 524
		headModel[145].setRotationPoint(-216F, -416F, 43F);
		headModel[145].rotateAngleX = 4.84328867F;

		headModel[146].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 525
		headModel[146].setRotationPoint(-216F, -416F, 43F);
		headModel[146].rotateAngleX = 4.97418837F;

		headModel[147].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 526
		headModel[147].setRotationPoint(-216F, -416F, 43F);
		headModel[147].rotateAngleX = 5.10508806F;

		headModel[148].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 527
		headModel[148].setRotationPoint(-216F, -416F, 43F);
		headModel[148].rotateAngleX = 5.23598776F;

		headModel[149].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 528
		headModel[149].setRotationPoint(-216F, -416F, 43F);
		headModel[149].rotateAngleX = 5.36688745F;

		headModel[150].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 529
		headModel[150].setRotationPoint(-216F, -416F, 43F);
		headModel[150].rotateAngleX = 5.49778714F;

		headModel[151].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 530
		headModel[151].setRotationPoint(-216F, -416F, 43F);
		headModel[151].rotateAngleX = 5.62868684F;

		headModel[152].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 531
		headModel[152].setRotationPoint(-216F, -416F, 43F);
		headModel[152].rotateAngleX = 5.75958653F;

		headModel[153].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 532
		headModel[153].setRotationPoint(-216F, -416F, 43F);
		headModel[153].rotateAngleX = 5.89048623F;

		headModel[154].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 533
		headModel[154].setRotationPoint(-216F, -416F, 43F);
		headModel[154].rotateAngleX = 6.02138592F;

		headModel[155].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 534
		headModel[155].setRotationPoint(-216F, -416F, 43F);
		headModel[155].rotateAngleX = 6.15228561F;

		headModel[156].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		headModel[156].setRotationPoint(-216F, -416F, 43F);
		headModel[156].rotateAngleX = 4.71238898F;

		headModel[157].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		headModel[157].setRotationPoint(-216F, -416F, 43F);
		headModel[157].rotateAngleX = 4.84328867F;

		headModel[158].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		headModel[158].setRotationPoint(-216F, -416F, 43F);
		headModel[158].rotateAngleX = 4.97418837F;

		headModel[159].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		headModel[159].setRotationPoint(-216F, -416F, 43F);
		headModel[159].rotateAngleX = 5.10508806F;

		headModel[160].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		headModel[160].setRotationPoint(-216F, -416F, 43F);
		headModel[160].rotateAngleX = 5.23598776F;

		headModel[161].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		headModel[161].setRotationPoint(-216F, -416F, 43F);
		headModel[161].rotateAngleX = 5.36688745F;

		headModel[162].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		headModel[162].setRotationPoint(-216F, -416F, 43F);
		headModel[162].rotateAngleX = 5.49778714F;

		headModel[163].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		headModel[163].setRotationPoint(-216F, -416F, 43F);
		headModel[163].rotateAngleX = 5.62868684F;

		headModel[164].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		headModel[164].setRotationPoint(-216F, -416F, 43F);
		headModel[164].rotateAngleX = 5.75958653F;

		headModel[165].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		headModel[165].setRotationPoint(-216F, -416F, 43F);
		headModel[165].rotateAngleX = 5.89048623F;

		headModel[166].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		headModel[166].setRotationPoint(-216F, -416F, 43F);
		headModel[166].rotateAngleX = 6.02138592F;

		headModel[167].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		headModel[167].setRotationPoint(-216F, -416F, 43F);
		headModel[167].rotateAngleX = 6.15228561F;

		headModel[168].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		headModel[168].setRotationPoint(-216F, -416F, 43F);
		headModel[168].rotateAngleX = 6.15228561F;

		headModel[169].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		headModel[169].setRotationPoint(-216F, -416F, 43F);
		headModel[169].rotateAngleX = 6.02138592F;

		headModel[170].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		headModel[170].setRotationPoint(-216F, -416F, 43F);
		headModel[170].rotateAngleX = 5.89048623F;

		headModel[171].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		headModel[171].setRotationPoint(-216F, -416F, 43F);
		headModel[171].rotateAngleX = 5.75958653F;

		headModel[172].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		headModel[172].setRotationPoint(-216F, -416F, 43F);
		headModel[172].rotateAngleX = 5.62868684F;

		headModel[173].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		headModel[173].setRotationPoint(-216F, -416F, 43F);
		headModel[173].rotateAngleX = 5.49778714F;

		headModel[174].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		headModel[174].setRotationPoint(-216F, -416F, 43F);
		headModel[174].rotateAngleX = 5.36688745F;

		headModel[175].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		headModel[175].setRotationPoint(-216F, -416F, 43F);
		headModel[175].rotateAngleX = 5.23598776F;

		headModel[176].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		headModel[176].setRotationPoint(-216F, -416F, 43F);
		headModel[176].rotateAngleX = 5.10508806F;

		headModel[177].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		headModel[177].setRotationPoint(-216F, -416F, 43F);
		headModel[177].rotateAngleX = 4.97418837F;

		headModel[178].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		headModel[178].setRotationPoint(-216F, -416F, 43F);
		headModel[178].rotateAngleX = 4.84328867F;

		headModel[179].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		headModel[179].setRotationPoint(-216F, -416F, 43F);
		headModel[179].rotateAngleX = 4.71238898F;

		headModel[180].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 559
		headModel[180].setRotationPoint(-216F, -416F, 43F);

		headModel[181].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 560
		headModel[181].setRotationPoint(-216F, -416F, 43F);
		headModel[181].rotateAngleX = 0.13089969F;

		headModel[182].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 561
		headModel[182].setRotationPoint(-216F, -416F, 43F);
		headModel[182].rotateAngleX = 0.26179939F;

		headModel[183].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 562
		headModel[183].setRotationPoint(-216F, -416F, 43F);
		headModel[183].rotateAngleX = 0.39269908F;

		headModel[184].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 563
		headModel[184].setRotationPoint(-216F, -416F, 43F);
		headModel[184].rotateAngleX = 0.52359878F;

		headModel[185].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 564
		headModel[185].setRotationPoint(-216F, -416F, 43F);
		headModel[185].rotateAngleX = 0.65449847F;

		headModel[186].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 565
		headModel[186].setRotationPoint(-216F, -416F, 43F);
		headModel[186].rotateAngleX = 0.78539816F;

		headModel[187].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 566
		headModel[187].setRotationPoint(-216F, -416F, 43F);
		headModel[187].rotateAngleX = 0.91629786F;

		headModel[188].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 567
		headModel[188].setRotationPoint(-216F, -416F, 43F);
		headModel[188].rotateAngleX = 1.04719755F;

		headModel[189].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 568
		headModel[189].setRotationPoint(-216F, -416F, 43F);
		headModel[189].rotateAngleX = 1.17809725F;

		headModel[190].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 569
		headModel[190].setRotationPoint(-216F, -416F, 43F);
		headModel[190].rotateAngleX = 1.30899694F;

		headModel[191].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 570
		headModel[191].setRotationPoint(-216F, -416F, 43F);
		headModel[191].rotateAngleX = 1.43989663F;

		headModel[192].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 571
		headModel[192].setRotationPoint(-216F, -416F, 43F);
		headModel[192].rotateAngleX = 1.57079633F;

		headModel[193].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 572
		headModel[193].setRotationPoint(-216F, -416F, 43F);
		headModel[193].rotateAngleX = 1.70169602F;

		headModel[194].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 573
		headModel[194].setRotationPoint(-216F, -416F, 43F);
		headModel[194].rotateAngleX = 1.83259571F;

		headModel[195].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 574
		headModel[195].setRotationPoint(-216F, -416F, 43F);
		headModel[195].rotateAngleX = 1.96349541F;

		headModel[196].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 575
		headModel[196].setRotationPoint(-216F, -416F, 43F);
		headModel[196].rotateAngleX = 2.0943951F;

		headModel[197].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 576
		headModel[197].setRotationPoint(-216F, -416F, 43F);
		headModel[197].rotateAngleX = 2.2252948F;

		headModel[198].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 577
		headModel[198].setRotationPoint(-216F, -416F, 43F);
		headModel[198].rotateAngleX = 2.35619449F;

		headModel[199].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 578
		headModel[199].setRotationPoint(-216F, -416F, 43F);
		headModel[199].rotateAngleX = 2.48709418F;

		headModel[200].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 579
		headModel[200].setRotationPoint(-216F, -416F, 43F);
		headModel[200].rotateAngleX = 2.61799388F;

		headModel[201].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 580
		headModel[201].setRotationPoint(-216F, -416F, 43F);
		headModel[201].rotateAngleX = 2.74889357F;

		headModel[202].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 581
		headModel[202].setRotationPoint(-216F, -416F, 43F);
		headModel[202].rotateAngleX = 2.87979327F;

		headModel[203].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 582
		headModel[203].setRotationPoint(-216F, -416F, 43F);
		headModel[203].rotateAngleX = 3.01069296F;

		headModel[204].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 583
		headModel[204].setRotationPoint(-216F, -416F, 43F);
		headModel[204].rotateAngleX = 3.14159265F;

		headModel[205].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 584
		headModel[205].setRotationPoint(-216F, -416F, 43F);
		headModel[205].rotateAngleX = 3.27249235F;

		headModel[206].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 585
		headModel[206].setRotationPoint(-216F, -416F, 43F);
		headModel[206].rotateAngleX = 3.40339204F;

		headModel[207].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 586
		headModel[207].setRotationPoint(-216F, -416F, 43F);
		headModel[207].rotateAngleX = 3.53429174F;

		headModel[208].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 587
		headModel[208].setRotationPoint(-216F, -416F, 43F);
		headModel[208].rotateAngleX = 3.66519143F;

		headModel[209].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 588
		headModel[209].setRotationPoint(-216F, -416F, 43F);
		headModel[209].rotateAngleX = 3.79609112F;

		headModel[210].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 589
		headModel[210].setRotationPoint(-216F, -416F, 43F);
		headModel[210].rotateAngleX = 3.92699082F;

		headModel[211].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 590
		headModel[211].setRotationPoint(-216F, -416F, 43F);
		headModel[211].rotateAngleX = 4.05789051F;

		headModel[212].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 591
		headModel[212].setRotationPoint(-216F, -416F, 43F);
		headModel[212].rotateAngleX = 4.1887902F;

		headModel[213].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 592
		headModel[213].setRotationPoint(-216F, -416F, 43F);
		headModel[213].rotateAngleX = 4.3196899F;

		headModel[214].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 593
		headModel[214].setRotationPoint(-216F, -416F, 43F);
		headModel[214].rotateAngleX = 4.45058959F;

		headModel[215].addShapeBox(0F, 0F, -2F, 8, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 594
		headModel[215].setRotationPoint(-216F, -416F, 43F);
		headModel[215].rotateAngleX = 4.58148929F;

		headModel[216].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		headModel[216].setRotationPoint(-216F, -416F, 43F);

		headModel[217].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		headModel[217].setRotationPoint(-216F, -416F, 43F);
		headModel[217].rotateAngleX = 0.13089969F;

		headModel[218].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		headModel[218].setRotationPoint(-216F, -416F, 43F);
		headModel[218].rotateAngleX = 0.26179939F;

		headModel[219].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		headModel[219].setRotationPoint(-216F, -416F, 43F);
		headModel[219].rotateAngleX = 0.39269908F;

		headModel[220].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		headModel[220].setRotationPoint(-216F, -416F, 43F);
		headModel[220].rotateAngleX = 0.52359878F;

		headModel[221].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		headModel[221].setRotationPoint(-216F, -416F, 43F);
		headModel[221].rotateAngleX = 0.65449847F;

		headModel[222].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		headModel[222].setRotationPoint(-216F, -416F, 43F);
		headModel[222].rotateAngleX = 0.78539816F;

		headModel[223].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		headModel[223].setRotationPoint(-216F, -416F, 43F);
		headModel[223].rotateAngleX = 0.91629786F;

		headModel[224].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		headModel[224].setRotationPoint(-216F, -416F, 43F);
		headModel[224].rotateAngleX = 1.04719755F;

		headModel[225].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		headModel[225].setRotationPoint(-216F, -416F, 43F);
		headModel[225].rotateAngleX = 1.17809725F;

		headModel[226].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		headModel[226].setRotationPoint(-216F, -416F, 43F);
		headModel[226].rotateAngleX = 1.30899694F;

		headModel[227].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		headModel[227].setRotationPoint(-216F, -416F, 43F);
		headModel[227].rotateAngleX = 1.43989663F;

		headModel[228].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		headModel[228].setRotationPoint(-216F, -416F, 43F);
		headModel[228].rotateAngleX = 1.57079633F;

		headModel[229].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		headModel[229].setRotationPoint(-216F, -416F, 43F);
		headModel[229].rotateAngleX = 1.70169602F;

		headModel[230].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		headModel[230].setRotationPoint(-216F, -416F, 43F);
		headModel[230].rotateAngleX = 1.83259571F;

		headModel[231].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		headModel[231].setRotationPoint(-216F, -416F, 43F);
		headModel[231].rotateAngleX = 1.96349541F;

		headModel[232].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		headModel[232].setRotationPoint(-216F, -416F, 43F);
		headModel[232].rotateAngleX = 2.0943951F;

		headModel[233].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		headModel[233].setRotationPoint(-216F, -416F, 43F);
		headModel[233].rotateAngleX = 2.2252948F;

		headModel[234].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		headModel[234].setRotationPoint(-216F, -416F, 43F);
		headModel[234].rotateAngleX = 2.35619449F;

		headModel[235].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		headModel[235].setRotationPoint(-216F, -416F, 43F);
		headModel[235].rotateAngleX = 2.48709418F;

		headModel[236].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		headModel[236].setRotationPoint(-216F, -416F, 43F);
		headModel[236].rotateAngleX = 2.61799388F;

		headModel[237].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		headModel[237].setRotationPoint(-216F, -416F, 43F);
		headModel[237].rotateAngleX = 2.74889357F;

		headModel[238].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		headModel[238].setRotationPoint(-216F, -416F, 43F);
		headModel[238].rotateAngleX = 2.87979327F;

		headModel[239].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		headModel[239].setRotationPoint(-216F, -416F, 43F);
		headModel[239].rotateAngleX = 3.01069296F;

		headModel[240].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		headModel[240].setRotationPoint(-216F, -416F, 43F);
		headModel[240].rotateAngleX = 3.14159265F;

		headModel[241].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		headModel[241].setRotationPoint(-216F, -416F, 43F);
		headModel[241].rotateAngleX = 3.27249235F;

		headModel[242].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		headModel[242].setRotationPoint(-216F, -416F, 43F);
		headModel[242].rotateAngleX = 3.40339204F;

		headModel[243].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		headModel[243].setRotationPoint(-216F, -416F, 43F);
		headModel[243].rotateAngleX = 3.53429174F;

		headModel[244].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		headModel[244].setRotationPoint(-216F, -416F, 43F);
		headModel[244].rotateAngleX = 3.66519143F;

		headModel[245].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		headModel[245].setRotationPoint(-216F, -416F, 43F);
		headModel[245].rotateAngleX = 3.79609112F;

		headModel[246].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		headModel[246].setRotationPoint(-216F, -416F, 43F);
		headModel[246].rotateAngleX = 3.92699082F;

		headModel[247].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		headModel[247].setRotationPoint(-216F, -416F, 43F);
		headModel[247].rotateAngleX = 4.05789051F;

		headModel[248].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		headModel[248].setRotationPoint(-216F, -416F, 43F);
		headModel[248].rotateAngleX = 4.1887902F;

		headModel[249].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		headModel[249].setRotationPoint(-216F, -416F, 43F);
		headModel[249].rotateAngleX = 4.3196899F;

		headModel[250].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		headModel[250].setRotationPoint(-216F, -416F, 43F);
		headModel[250].rotateAngleX = 4.45058959F;

		headModel[251].addShapeBox(-1F, 22F, -2F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		headModel[251].setRotationPoint(-216F, -416F, 43F);
		headModel[251].rotateAngleX = 4.58148929F;

		headModel[252].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		headModel[252].setRotationPoint(-216F, -416F, 43F);

		headModel[253].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		headModel[253].setRotationPoint(-216F, -416F, 43F);
		headModel[253].rotateAngleX = 0.13089969F;

		headModel[254].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		headModel[254].setRotationPoint(-216F, -416F, 43F);
		headModel[254].rotateAngleX = 0.26179939F;

		headModel[255].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		headModel[255].setRotationPoint(-216F, -416F, 43F);
		headModel[255].rotateAngleX = 0.39269908F;

		headModel[256].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		headModel[256].setRotationPoint(-216F, -416F, 43F);
		headModel[256].rotateAngleX = 0.52359878F;

		headModel[257].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		headModel[257].setRotationPoint(-216F, -416F, 43F);
		headModel[257].rotateAngleX = 0.65449847F;

		headModel[258].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		headModel[258].setRotationPoint(-216F, -416F, 43F);
		headModel[258].rotateAngleX = 0.78539816F;

		headModel[259].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		headModel[259].setRotationPoint(-216F, -416F, 43F);
		headModel[259].rotateAngleX = 0.91629786F;

		headModel[260].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		headModel[260].setRotationPoint(-216F, -416F, 43F);
		headModel[260].rotateAngleX = 1.04719755F;

		headModel[261].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		headModel[261].setRotationPoint(-216F, -416F, 43F);
		headModel[261].rotateAngleX = 1.17809725F;

		headModel[262].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		headModel[262].setRotationPoint(-216F, -416F, 43F);
		headModel[262].rotateAngleX = 1.30899694F;

		headModel[263].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		headModel[263].setRotationPoint(-216F, -416F, 43F);
		headModel[263].rotateAngleX = 1.43989663F;

		headModel[264].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		headModel[264].setRotationPoint(-216F, -416F, 43F);
		headModel[264].rotateAngleX = 1.57079633F;

		headModel[265].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		headModel[265].setRotationPoint(-216F, -416F, 43F);
		headModel[265].rotateAngleX = 1.70169602F;

		headModel[266].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		headModel[266].setRotationPoint(-216F, -416F, 43F);
		headModel[266].rotateAngleX = 1.83259571F;

		headModel[267].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		headModel[267].setRotationPoint(-216F, -416F, 43F);
		headModel[267].rotateAngleX = 1.96349541F;

		headModel[268].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		headModel[268].setRotationPoint(-216F, -416F, 43F);
		headModel[268].rotateAngleX = 2.0943951F;

		headModel[269].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		headModel[269].setRotationPoint(-216F, -416F, 43F);
		headModel[269].rotateAngleX = 2.2252948F;

		headModel[270].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		headModel[270].setRotationPoint(-216F, -416F, 43F);
		headModel[270].rotateAngleX = 2.35619449F;

		headModel[271].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		headModel[271].setRotationPoint(-216F, -416F, 43F);
		headModel[271].rotateAngleX = 2.48709418F;

		headModel[272].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		headModel[272].setRotationPoint(-216F, -416F, 43F);
		headModel[272].rotateAngleX = 2.61799388F;

		headModel[273].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		headModel[273].setRotationPoint(-216F, -416F, 43F);
		headModel[273].rotateAngleX = 2.74889357F;

		headModel[274].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		headModel[274].setRotationPoint(-216F, -416F, 43F);
		headModel[274].rotateAngleX = 2.87979327F;

		headModel[275].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		headModel[275].setRotationPoint(-216F, -416F, 43F);
		headModel[275].rotateAngleX = 3.01069296F;

		headModel[276].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		headModel[276].setRotationPoint(-216F, -416F, 43F);
		headModel[276].rotateAngleX = 3.14159265F;

		headModel[277].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		headModel[277].setRotationPoint(-216F, -416F, 43F);
		headModel[277].rotateAngleX = 3.27249235F;

		headModel[278].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		headModel[278].setRotationPoint(-216F, -416F, 43F);
		headModel[278].rotateAngleX = 3.40339204F;

		headModel[279].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		headModel[279].setRotationPoint(-216F, -416F, 43F);
		headModel[279].rotateAngleX = 3.53429174F;

		headModel[280].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		headModel[280].setRotationPoint(-216F, -416F, 43F);
		headModel[280].rotateAngleX = 3.66519143F;

		headModel[281].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		headModel[281].setRotationPoint(-216F, -416F, 43F);
		headModel[281].rotateAngleX = 3.79609112F;

		headModel[282].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		headModel[282].setRotationPoint(-216F, -416F, 43F);
		headModel[282].rotateAngleX = 3.92699082F;

		headModel[283].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		headModel[283].setRotationPoint(-216F, -416F, 43F);
		headModel[283].rotateAngleX = 4.05789051F;

		headModel[284].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		headModel[284].setRotationPoint(-216F, -416F, 43F);
		headModel[284].rotateAngleX = 4.1887902F;

		headModel[285].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		headModel[285].setRotationPoint(-216F, -416F, 43F);
		headModel[285].rotateAngleX = 4.3196899F;

		headModel[286].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		headModel[286].setRotationPoint(-216F, -416F, 43F);
		headModel[286].rotateAngleX = 4.45058959F;

		headModel[287].addShapeBox(-1F, 0F, -2F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		headModel[287].setRotationPoint(-216F, -416F, 43F);
		headModel[287].rotateAngleX = 4.58148929F;

		headModel[288].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		headModel[288].setRotationPoint(-71F, -418F, -106F);

		headModel[289].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 892
		headModel[289].setRotationPoint(-71F, -429F, -106F);

		headModel[290].addShapeBox(0F, 0F, 0F, 38, 9, 29, 0F,0F, 0F, -8F, 0F, -2F, -8F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 893
		headModel[290].setRotationPoint(-71F, -438F, -101F);

		headModel[291].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		headModel[291].setRotationPoint(-71F, -407F, -106F);

		headModel[292].addShapeBox(0F, 0F, 0F, 38, 8, 41, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		headModel[292].setRotationPoint(-71F, -396F, -100F);

		headModel[293].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 896
		headModel[293].setRotationPoint(-109F, -418F, -106F);

		headModel[294].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 5F); // Box 897
		headModel[294].setRotationPoint(-109F, -429F, -106F);

		headModel[295].addShapeBox(0F, 0F, 0F, 38, 9, 29, 0F,0F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 1F, 5F); // Box 898
		headModel[295].setRotationPoint(-109F, -438F, -101F);

		headModel[296].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -6F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 899
		headModel[296].setRotationPoint(-109F, -407F, -104F);

		headModel[297].addShapeBox(0F, 0F, 0F, 38, 8, 41, 0F,0F, 6F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 900
		headModel[297].setRotationPoint(-109F, -396F, -97F);

		headModel[298].addShapeBox(0F, 0F, 0F, 25, 9, 24, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 901
		headModel[298].setRotationPoint(-134F, -418F, -102F);

		headModel[299].addShapeBox(0F, 0F, 0F, 25, 10, 37, 0F,0F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 5F); // Box 902
		headModel[299].setRotationPoint(-134F, -428F, -102F);

		headModel[300].addShapeBox(0F, 0F, 0F, 25, 9, 29, 0F,0F, -3F, -12F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, -3F, -8F, 0F, 3F, -5F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 3F, 2F); // Box 903
		headModel[300].setRotationPoint(-134F, -437F, -101F);

		headModel[301].addShapeBox(0F, 0F, 0F, 25, 11, 41, 0F,0F, 5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 904
		headModel[301].setRotationPoint(-134F, -409F, -98F);

		headModel[302].addShapeBox(0F, 0F, 0F, 15, 4, 24, 0F,0F, 4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 905
		headModel[302].setRotationPoint(-149F, -418F, -96F);

		headModel[303].addShapeBox(0F, 0F, 0F, 15, 7, 24, 0F,0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 906
		headModel[303].setRotationPoint(-149F, -425F, -96F);

		headModel[304].addShapeBox(0F, 0F, 0F, 15, 9, 24, 0F,0F, -8F, -10F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, -8F, -10F, 0F, 2F, -9F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -7F); // Box 908
		headModel[304].setRotationPoint(-149F, -434F, -96F);

		headModel[305].addShapeBox(0F, 0F, 0F, 15, 4, 24, 0F,0F, 4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 909
		headModel[305].setRotationPoint(-149F, -414F, -94F);

		headModel[306].addShapeBox(0F, 0F, 0F, 38, 9, 29, 0F,0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -8F, 0F, 0F, -8F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		headModel[306].setRotationPoint(-71F, -438F, 72F);

		headModel[307].addShapeBox(0F, 0F, 0F, 38, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F); // Box 911
		headModel[307].setRotationPoint(-71F, -396F, 59F);

		headModel[308].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F); // Box 912
		headModel[308].setRotationPoint(-71F, -407F, 65F);

		headModel[309].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 913
		headModel[309].setRotationPoint(-71F, -418F, 65F);

		headModel[310].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		headModel[310].setRotationPoint(-71F, -429F, 65F);

		headModel[311].addShapeBox(0F, 0F, 0F, 38, 9, 29, 0F,0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, -1F, -8F, 0F, 1F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 915
		headModel[311].setRotationPoint(-109F, -438F, 72F);

		headModel[312].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 916
		headModel[312].setRotationPoint(-109F, -429F, 65F);

		headModel[313].addShapeBox(0F, 0F, 0F, 38, 8, 41, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 6F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -8F); // Box 917
		headModel[313].setRotationPoint(-109F, -396F, 56F);

		headModel[314].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -10F); // Box 918
		headModel[314].setRotationPoint(-109F, -407F, 63F);

		headModel[315].addShapeBox(0F, 0F, 0F, 38, 11, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -8F); // Box 919
		headModel[315].setRotationPoint(-109F, -418F, 65F);

		headModel[316].addShapeBox(0F, 0F, 0F, 25, 9, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -8F); // Box 920
		headModel[316].setRotationPoint(-134F, -418F, 78F);

		headModel[317].addShapeBox(0F, 0F, 0F, 25, 11, 41, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -10F); // Box 921
		headModel[317].setRotationPoint(-134F, -409F, 57F);

		headModel[318].addShapeBox(0F, 0F, 0F, 25, 10, 37, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 922
		headModel[318].setRotationPoint(-134F, -428F, 65F);

		headModel[319].addShapeBox(0F, 0F, 0F, 25, 9, 29, 0F,0F, -3F, -8F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, -3F, -12F, 0F, 3F, 2F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 3F, -5F); // Box 923
		headModel[319].setRotationPoint(-134F, -437F, 72F);

		headModel[320].addShapeBox(0F, 0F, 0F, 15, 9, 24, 0F,0F, -8F, -10F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, -8F, -10F, 0F, 2F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, -9F); // Box 924
		headModel[320].setRotationPoint(-149F, -434F, 72F);

		headModel[321].addShapeBox(0F, 0F, 0F, 15, 7, 24, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -9F); // Box 925
		headModel[321].setRotationPoint(-149F, -425F, 72F);

		headModel[322].addShapeBox(0F, 0F, 0F, 15, 4, 24, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -10F); // Box 926
		headModel[322].setRotationPoint(-149F, -418F, 72F);

		headModel[323].addShapeBox(0F, 0F, 0F, 15, 4, 24, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -8F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -10F); // Box 927
		headModel[323].setRotationPoint(-149F, -414F, 70F);

		headModel[324].addShapeBox(0F, 0F, 0F, 38, 11, 50, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 928
		headModel[324].setRotationPoint(-71F, -432F, -54F);

		headModel[325].addShapeBox(0F, 0F, 0F, 38, 11, 50, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 929
		headModel[325].setRotationPoint(-71F, -443F, -54F);

		headModel[326].addShapeBox(0F, 0F, 0F, 38, 11, 44, 0F,0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 930
		headModel[326].setRotationPoint(-71F, -454F, -51F);

		headModel[327].addShapeBox(0F, 0F, 0F, 38, 6, 30, 0F,0F, 0F, -11F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -11F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 931
		headModel[327].setRotationPoint(-71F, -460F, -44F);

		headModel[328].addShapeBox(0F, 0F, 0F, 38, 11, 47, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 932
		headModel[328].setRotationPoint(-109F, -432F, -52F);

		headModel[329].addShapeBox(0F, 0F, 0F, 38, 6, 28, 0F,0F, -4F, -11F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4F, -11F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 933
		headModel[329].setRotationPoint(-109F, -460F, -43F);

		headModel[330].addShapeBox(0F, 0F, 0F, 38, 11, 42, 0F,0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 934
		headModel[330].setRotationPoint(-109F, -454F, -50F);

		headModel[331].addShapeBox(0F, 0F, 0F, 38, 11, 48, 0F,0F, -2F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 935
		headModel[331].setRotationPoint(-109F, -443F, -53F);

		headModel[332].addShapeBox(0F, 0F, 0F, 42, 11, 39, 0F,0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F); // Box 936
		headModel[332].setRotationPoint(-151F, -432F, -48F);

		headModel[333].addShapeBox(0F, 0F, 0F, 42, 6, 24, 0F,0F, -12F, -11F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -12F, -11F, 0F, 10F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -9F); // Box 937
		headModel[333].setRotationPoint(-151F, -456F, -41F);

		headModel[334].addShapeBox(0F, 0F, 0F, 42, 9, 38, 0F,0F, -10F, -16F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -10F, -16F, 0F, 4F, -15F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, -15F); // Box 938
		headModel[334].setRotationPoint(-151F, -450F, -48F);

		headModel[335].addShapeBox(0F, 0F, 0F, 42, 9, 40, 0F,0F, -4F, -16F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -16F, 0F, 0F, -14F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -14F); // Box 939
		headModel[335].setRotationPoint(-151F, -441F, -49F);

		headModel[336].addShapeBox(0F, 0F, 0F, 42, 11, 39, 0F,0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F); // Box 940
		headModel[336].setRotationPoint(-151F, -432F, 9F);

		headModel[337].addShapeBox(0F, 0F, 0F, 42, 9, 40, 0F,0F, -4F, -16F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -16F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F); // Box 941
		headModel[337].setRotationPoint(-151F, -441F, 9F);

		headModel[338].addShapeBox(0F, 0F, 0F, 42, 9, 38, 0F,0F, -10F, -16F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -10F, -16F, 0F, 4F, -15F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, -15F); // Box 942
		headModel[338].setRotationPoint(-151F, -450F, 10F);

		headModel[339].addShapeBox(0F, 0F, 0F, 42, 6, 24, 0F,0F, -12F, -11F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -12F, -11F, 0F, 10F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -9F); // Box 943
		headModel[339].setRotationPoint(-151F, -456F, 17F);

		headModel[340].addShapeBox(0F, 0F, 0F, 38, 6, 28, 0F,0F, -4F, -11F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4F, -11F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 944
		headModel[340].setRotationPoint(-109F, -460F, 15F);

		headModel[341].addShapeBox(0F, 0F, 0F, 38, 11, 42, 0F,0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 945
		headModel[341].setRotationPoint(-109F, -454F, 8F);

		headModel[342].addShapeBox(0F, 0F, 0F, 38, 11, 48, 0F,0F, -2F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 946
		headModel[342].setRotationPoint(-109F, -443F, 5F);

		headModel[343].addShapeBox(0F, 0F, 0F, 38, 11, 47, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 947
		headModel[343].setRotationPoint(-109F, -432F, 5F);

		headModel[344].addShapeBox(0F, 0F, 0F, 38, 11, 50, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 948
		headModel[344].setRotationPoint(-71F, -432F, 4F);

		headModel[345].addShapeBox(0F, 0F, 0F, 38, 11, 50, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 949
		headModel[345].setRotationPoint(-71F, -443F, 4F);

		headModel[346].addShapeBox(0F, 0F, 0F, 38, 11, 44, 0F,0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 950
		headModel[346].setRotationPoint(-71F, -454F, 7F);

		headModel[347].addShapeBox(0F, 0F, 0F, 38, 6, 30, 0F,0F, 0F, -11F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -11F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 951
		headModel[347].setRotationPoint(-71F, -460F, 14F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 1600, 3461, textureX, textureY); // Box 1180
		hipsModel[1] = new ModelRendererTurbo(this, 1600, 3608, textureX, textureY); // Box 1181
		hipsModel[2] = new ModelRendererTurbo(this, 1600, 3739, textureX, textureY); // Box 1182
		hipsModel[3] = new ModelRendererTurbo(this, 1600, 3865, textureX, textureY); // Box 1183
		hipsModel[4] = new ModelRendererTurbo(this, 1600, 3890, textureX, textureY); // Box 1184
		hipsModel[5] = new ModelRendererTurbo(this, 1600, 3907, textureX, textureY); // Box 1185
		hipsModel[6] = new ModelRendererTurbo(this, 1600, 3890, textureX, textureY); // Box 1186
		hipsModel[7] = new ModelRendererTurbo(this, 1600, 3907, textureX, textureY); // Box 1187
		hipsModel[8] = new ModelRendererTurbo(this, 1600, 3907, textureX, textureY); // Box 1188
		hipsModel[9] = new ModelRendererTurbo(this, 1600, 3890, textureX, textureY); // Box 1189
		hipsModel[10] = new ModelRendererTurbo(this, 1600, 3865, textureX, textureY); // Box 1190
		hipsModel[11] = new ModelRendererTurbo(this, 1600, 3890, textureX, textureY); // Box 1191
		hipsModel[12] = new ModelRendererTurbo(this, 1600, 3907, textureX, textureY); // Box 1192
		hipsModel[13] = new ModelRendererTurbo(this, 1600, 3920, textureX, textureY); // Box 1192
		hipsModel[14] = new ModelRendererTurbo(this, 1600, 4009, textureX, textureY); // Box 1193
		hipsModel[15] = new ModelRendererTurbo(this, 2100, 0, textureX, textureY); // Box 1194

		hipsModel[0].addShapeBox(0F, 0F, 0F, 73, 33, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1180
		hipsModel[0].setRotationPoint(-37F, -259F, -55F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 73, 18, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F); // Box 1181
		hipsModel[1].setRotationPoint(-37F, -226F, -55F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 51, 11, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F); // Box 1182
		hipsModel[2].setRotationPoint(-26F, -208F, -55F);

		hipsModel[3].addShapeBox(0F, 0F, 0F, 45, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1183
		hipsModel[3].setRotationPoint(-22.5F, -232F, 55F);

		hipsModel[4].addShapeBox(0F, 0F, 0F, 45, 10, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1184
		hipsModel[4].setRotationPoint(-22.5F, -242F, 55F);

		hipsModel[5].addShapeBox(0F, 0F, 0F, 35, 5, 4, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1185
		hipsModel[5].setRotationPoint(-17.5F, -247F, 55F);

		hipsModel[6].addShapeBox(0F, 0F, 0F, 45, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 1186
		hipsModel[6].setRotationPoint(-22.5F, -217F, 55F);

		hipsModel[7].addShapeBox(0F, 0F, 0F, 35, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 1187
		hipsModel[7].setRotationPoint(-17.5F, -207F, 55F);

		hipsModel[8].addShapeBox(0F, 0F, 0F, 35, 5, 4, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1188
		hipsModel[8].setRotationPoint(-17.5F, -247F, -59F);

		hipsModel[9].addShapeBox(0F, 0F, 0F, 45, 10, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1189
		hipsModel[9].setRotationPoint(-22.5F, -242F, -59F);

		hipsModel[10].addShapeBox(0F, 0F, 0F, 45, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1190
		hipsModel[10].setRotationPoint(-22.5F, -232F, -59F);

		hipsModel[11].addShapeBox(0F, 0F, 0F, 45, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 1191
		hipsModel[11].setRotationPoint(-22.5F, -217F, -59F);

		hipsModel[12].addShapeBox(0F, 0F, 0F, 35, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 1192
		hipsModel[12].setRotationPoint(-17.5F, -207F, -59F);

		hipsModel[13].addShapeBox(0F, 0F, 0F, 77, 19, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F); // Box 1192
		hipsModel[13].setRotationPoint(-39F, -226F, -33F);

		hipsModel[14].addShapeBox(0F, 0F, 0F, 55, 12, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F); // Box 1193
		hipsModel[14].setRotationPoint(-28F, -207F, -33F);

		hipsModel[15].addShapeBox(0F, 0F, 0F, 77, 4, 66, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1194
		hipsModel[15].setRotationPoint(-39F, -230F, -33F);
	}
	
	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 2100, 75, textureX, textureY); // Import ImportBox1843
		leftArmModel[1] = new ModelRendererTurbo(this, 2103, 172, textureX, textureY); // Import ImportBox1844
		leftArmModel[2] = new ModelRendererTurbo(this, 2100, 265, textureX, textureY); // Import ImportBox1845
		leftArmModel[3] = new ModelRendererTurbo(this, 2100, 265, textureX, textureY); // Import ImportBox1846
		leftArmModel[4] = new ModelRendererTurbo(this, 2100, 265, textureX, textureY); // Import ImportBox1847
		leftArmModel[5] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox1848
		leftArmModel[6] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox1849
		leftArmModel[7] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox1850
		leftArmModel[8] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox1851
		leftArmModel[9] = new ModelRendererTurbo(this, 2100, 428, textureX, textureY); // Import ImportBox1852
		leftArmModel[10] = new ModelRendererTurbo(this, 2100, 520, textureX, textureY); // Import ImportBox1853
		leftArmModel[11] = new ModelRendererTurbo(this, 2100, 612, textureX, textureY); // Import ImportBox1854
		leftArmModel[12] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox1855
		leftArmModel[13] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox1856
		leftArmModel[14] = new ModelRendererTurbo(this, 2100, 520, textureX, textureY); // Import ImportBox1857
		leftArmModel[15] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox1858
		leftArmModel[16] = new ModelRendererTurbo(this, 2100, 520, textureX, textureY); // Import ImportBox1859
		leftArmModel[17] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox1860
		leftArmModel[18] = new ModelRendererTurbo(this, 2100, 768, textureX, textureY); // Import ImportBox1861
		leftArmModel[19] = new ModelRendererTurbo(this, 2100, 918, textureX, textureY); // Import ImportBox1862
		leftArmModel[20] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox1863
		leftArmModel[21] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox1864
		leftArmModel[22] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox1865
		leftArmModel[23] = new ModelRendererTurbo(this, 2100, 992, textureX, textureY); // Import ImportBox1866
		leftArmModel[24] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1867
		leftArmModel[25] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1868
		leftArmModel[26] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1869
		leftArmModel[27] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1870
		leftArmModel[28] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1871
		leftArmModel[29] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1872
		leftArmModel[30] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1873
		leftArmModel[31] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox1874
		leftArmModel[32] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox1875
		leftArmModel[33] = new ModelRendererTurbo(this, 2100, 1059, textureX, textureY); // Import ImportBox1876
		leftArmModel[34] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox1877
		leftArmModel[35] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox1878
		leftArmModel[36] = new ModelRendererTurbo(this, 2100, 1096, textureX, textureY); // Import ImportBox1879
		leftArmModel[37] = new ModelRendererTurbo(this, 2100, 1135, textureX, textureY); // Import ImportBox1875
		leftArmModel[38] = new ModelRendererTurbo(this, 2100, 1176, textureX, textureY); // Import ImportBox1876
		leftArmModel[39] = new ModelRendererTurbo(this, 2100, 1214, textureX, textureY); // Import ImportBox1877
		leftArmModel[40] = new ModelRendererTurbo(this, 2100, 1247, textureX, textureY); // Import ImportBox1878
		leftArmModel[41] = new ModelRendererTurbo(this, 2100, 1285, textureX, textureY); // Import ImportBox1879
		leftArmModel[42] = new ModelRendererTurbo(this, 2100, 1314, textureX, textureY); // Import ImportBox1880
		leftArmModel[43] = new ModelRendererTurbo(this, 2100, 1346, textureX, textureY); // Import ImportBox1881
		leftArmModel[44] = new ModelRendererTurbo(this, 2100, 1385, textureX, textureY); // Import ImportBox1882
		leftArmModel[45] = new ModelRendererTurbo(this, 2100, 1415, textureX, textureY); // Import ImportBox1883
		leftArmModel[46] = new ModelRendererTurbo(this, 2100, 1385, textureX, textureY); // Import ImportBox1885
		leftArmModel[47] = new ModelRendererTurbo(this, 2100, 1507, textureX, textureY); // Import ImportBox1886
		leftArmModel[48] = new ModelRendererTurbo(this, 2100, 1549, textureX, textureY); // Import ImportBox1887
		leftArmModel[49] = new ModelRendererTurbo(this, 2100, 1549, textureX, textureY); // Import ImportBox1888
		leftArmModel[50] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox1889
		leftArmModel[51] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox1890
		leftArmModel[52] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox1891
		leftArmModel[53] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox1892
		leftArmModel[54] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox1893
		leftArmModel[55] = new ModelRendererTurbo(this, 2100, 1623, textureX, textureY); // Import ImportBox1894
		leftArmModel[56] = new ModelRendererTurbo(this, 2100, 1660, textureX, textureY); // Import ImportBox1895
		leftArmModel[57] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox1896
		leftArmModel[58] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox1897
		leftArmModel[59] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox1898
		leftArmModel[60] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox1899
		leftArmModel[61] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox1900
		leftArmModel[62] = new ModelRendererTurbo(this, 2100, 1695, textureX, textureY); // Import ImportBox1901
		leftArmModel[63] = new ModelRendererTurbo(this, 2100, 1730, textureX, textureY); // Import ImportBox1902
		leftArmModel[64] = new ModelRendererTurbo(this, 2100, 1777, textureX, textureY); // Import ImportBox1903
		leftArmModel[65] = new ModelRendererTurbo(this, 2100, 1787, textureX, textureY); // Import ImportBox1904
		leftArmModel[66] = new ModelRendererTurbo(this, 2100, 1777, textureX, textureY); // Import ImportBox1905
		leftArmModel[67] = new ModelRendererTurbo(this, 2100, 1815, textureX, textureY); // Import ImportBox1906
		leftArmModel[68] = new ModelRendererTurbo(this, 2100, 1815, textureX, textureY); // Import ImportBox1907
		leftArmModel[69] = new ModelRendererTurbo(this, 2100, 1823, textureX, textureY); // Import ImportBox1908
		leftArmModel[70] = new ModelRendererTurbo(this, 2100, 1823, textureX, textureY); // Import ImportBox1909
		leftArmModel[71] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1910
		leftArmModel[72] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1911
		leftArmModel[73] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1912
		leftArmModel[74] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1913
		leftArmModel[75] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1914
		leftArmModel[76] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1915
		leftArmModel[77] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1916
		leftArmModel[78] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1917
		leftArmModel[79] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1918
		leftArmModel[80] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox1919
		leftArmModel[81] = new ModelRendererTurbo(this, 2100, 1837, textureX, textureY); // Import ImportBox1920
		leftArmModel[82] = new ModelRendererTurbo(this, 2100, 1882, textureX, textureY); // Import ImportBox1921
		leftArmModel[83] = new ModelRendererTurbo(this, 2100, 1925, textureX, textureY); // Import ImportBox1922
		leftArmModel[84] = new ModelRendererTurbo(this, 2100, 1925, textureX, textureY); // Import ImportBox1923
		leftArmModel[85] = new ModelRendererTurbo(this, 2100, 1956, textureX, textureY); // Import ImportBox1924
		leftArmModel[86] = new ModelRendererTurbo(this, 2100, 1988, textureX, textureY); // Import ImportBox1925
		leftArmModel[87] = new ModelRendererTurbo(this, 2100, 1998, textureX, textureY); // Import ImportBox1926
		leftArmModel[88] = new ModelRendererTurbo(this, 2100, 2036, textureX, textureY); // Import ImportBox1928
		leftArmModel[89] = new ModelRendererTurbo(this, 2100, 2104, textureX, textureY); // Import ImportBox1929
		leftArmModel[90] = new ModelRendererTurbo(this, 2100, 2140, textureX, textureY); // Import ImportBox1930
		leftArmModel[91] = new ModelRendererTurbo(this, 2100, 2170, textureX, textureY); // Import ImportBox1931
		leftArmModel[92] = new ModelRendererTurbo(this, 2100, 2202, textureX, textureY); // Import ImportBox1932
		leftArmModel[93] = new ModelRendererTurbo(this, 2100, 2202, textureX, textureY); // Import ImportBox1933
		leftArmModel[94] = new ModelRendererTurbo(this, 2100, 2226, textureX, textureY); // Import ImportBox1934
		leftArmModel[95] = new ModelRendererTurbo(this, 2100, 2273, textureX, textureY); // Import ImportBox1937
		leftArmModel[96] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1939
		leftArmModel[97] = new ModelRendererTurbo(this, 2100, 2313, textureX, textureY); // Import ImportBox1940
		leftArmModel[98] = new ModelRendererTurbo(this, 2100, 2329, textureX, textureY); // Import ImportBox1941
		leftArmModel[99] = new ModelRendererTurbo(this, 2100, 2344, textureX, textureY); // Import ImportBox1943
		leftArmModel[100] = new ModelRendererTurbo(this, 2100, 2352, textureX, textureY); // Import ImportBox1944
		leftArmModel[101] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1945
		leftArmModel[102] = new ModelRendererTurbo(this, 2100, 2365, textureX, textureY); // Import ImportBox1946
		leftArmModel[103] = new ModelRendererTurbo(this, 2100, 2379, textureX, textureY); // Import ImportBox1947
		leftArmModel[104] = new ModelRendererTurbo(this, 2100, 2388, textureX, textureY); // Import ImportBox1948
		leftArmModel[105] = new ModelRendererTurbo(this, 2100, 2396, textureX, textureY); // Import ImportBox1949
		leftArmModel[106] = new ModelRendererTurbo(this, 2100, 2410, textureX, textureY); // Import ImportBox1950
		leftArmModel[107] = new ModelRendererTurbo(this, 2100, 2424, textureX, textureY); // Import ImportBox1951
		leftArmModel[108] = new ModelRendererTurbo(this, 2100, 2440, textureX, textureY); // Import ImportBox1952
		leftArmModel[109] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1953
		leftArmModel[110] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1954
		leftArmModel[111] = new ModelRendererTurbo(this, 2100, 2453, textureX, textureY); // Import ImportBox1955
		leftArmModel[112] = new ModelRendererTurbo(this, 2100, 2424, textureX, textureY); // Import ImportBox1956
		leftArmModel[113] = new ModelRendererTurbo(this, 2100, 2453, textureX, textureY); // Import ImportBox1957
		leftArmModel[114] = new ModelRendererTurbo(this, 2100, 2440, textureX, textureY); // Import ImportBox1958
		leftArmModel[115] = new ModelRendererTurbo(this, 2100, 2396, textureX, textureY); // Import ImportBox1959
		leftArmModel[116] = new ModelRendererTurbo(this, 2100, 2329, textureX, textureY); // Import ImportBox1960
		leftArmModel[117] = new ModelRendererTurbo(this, 2100, 2388, textureX, textureY); // Import ImportBox1961
		leftArmModel[118] = new ModelRendererTurbo(this, 2100, 2313, textureX, textureY); // Import ImportBox1962
		leftArmModel[119] = new ModelRendererTurbo(this, 2100, 2344, textureX, textureY); // Import ImportBox1963
		leftArmModel[120] = new ModelRendererTurbo(this, 2100, 2352, textureX, textureY); // Import ImportBox1964
		leftArmModel[121] = new ModelRendererTurbo(this, 2100, 2365, textureX, textureY); // Import ImportBox1965
		leftArmModel[122] = new ModelRendererTurbo(this, 2100, 2379, textureX, textureY); // Import ImportBox1966
		leftArmModel[123] = new ModelRendererTurbo(this, 2100, 2410, textureX, textureY); // Import ImportBox1967
		leftArmModel[124] = new ModelRendererTurbo(this, 2100, 2424, textureX, textureY); // Import ImportBox1968
		leftArmModel[125] = new ModelRendererTurbo(this, 2100, 2453, textureX, textureY); // Import ImportBox1969
		leftArmModel[126] = new ModelRendererTurbo(this, 2100, 2440, textureX, textureY); // Import ImportBox1970
		leftArmModel[127] = new ModelRendererTurbo(this, 2100, 2396, textureX, textureY); // Import ImportBox1971
		leftArmModel[128] = new ModelRendererTurbo(this, 2100, 2329, textureX, textureY); // Import ImportBox1972
		leftArmModel[129] = new ModelRendererTurbo(this, 2100, 2388, textureX, textureY); // Import ImportBox1973
		leftArmModel[130] = new ModelRendererTurbo(this, 2100, 2313, textureX, textureY); // Import ImportBox1974
		leftArmModel[131] = new ModelRendererTurbo(this, 2100, 2344, textureX, textureY); // Import ImportBox1975
		leftArmModel[132] = new ModelRendererTurbo(this, 2100, 2352, textureX, textureY); // Import ImportBox1976
		leftArmModel[133] = new ModelRendererTurbo(this, 2100, 2365, textureX, textureY); // Import ImportBox1977
		leftArmModel[134] = new ModelRendererTurbo(this, 2100, 2379, textureX, textureY); // Import ImportBox1978
		leftArmModel[135] = new ModelRendererTurbo(this, 2100, 2410, textureX, textureY); // Import ImportBox1979
		leftArmModel[136] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1980
		leftArmModel[137] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1981
		leftArmModel[138] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1982
		leftArmModel[139] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1983
		leftArmModel[140] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1984
		leftArmModel[141] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1985
		leftArmModel[142] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1986
		leftArmModel[143] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox1987
		leftArmModel[144] = new ModelRendererTurbo(this, 2100, 2460, textureX, textureY); // Import ImportBox1988
		leftArmModel[145] = new ModelRendererTurbo(this, 2100, 2527, textureX, textureY); // Import ImportBox1989
		leftArmModel[146] = new ModelRendererTurbo(this, 2100, 2527, textureX, textureY); // Import ImportBox1990
		leftArmModel[147] = new ModelRendererTurbo(this, 2100, 2561, textureX, textureY); // Import ImportBox1991
		leftArmModel[148] = new ModelRendererTurbo(this, 2100, 2589, textureX, textureY); // Import ImportBox1992
		leftArmModel[149] = new ModelRendererTurbo(this, 2100, 2620, textureX, textureY); // Import ImportBox1993
		leftArmModel[150] = new ModelRendererTurbo(this, 2100, 2657, textureX, textureY); // Import ImportBox2137
		leftArmModel[151] = new ModelRendererTurbo(this, 2100, 2657, textureX, textureY); // Import ImportBox2138
		leftArmModel[152] = new ModelRendererTurbo(this, 2100, 2657, textureX, textureY); // Import ImportBox2139
		leftArmModel[153] = new ModelRendererTurbo(this, 2100, 2709, textureX, textureY); // Import ImportBox2144
		leftArmModel[154] = new ModelRendererTurbo(this, 2100, 2771, textureX, textureY); // Import ImportBox2145
		leftArmModel[155] = new ModelRendererTurbo(this, 2100, 2884, textureX, textureY); // Import ImportBox2146
		leftArmModel[156] = new ModelRendererTurbo(this, 2100, 2884, textureX, textureY); // Import ImportBox2147
		leftArmModel[157] = new ModelRendererTurbo(this, 2100, 2915, textureX, textureY); // Import ImportBox2148
		leftArmModel[158] = new ModelRendererTurbo(this, 2100, 2964, textureX, textureY); // Import ImportBox2149
		leftArmModel[159] = new ModelRendererTurbo(this, 2100, 2964, textureX, textureY); // Import ImportBox2150
		leftArmModel[160] = new ModelRendererTurbo(this, 2100, 3000, textureX, textureY); // Import ImportBox2145
		leftArmModel[161] = new ModelRendererTurbo(this, 2100, 3094, textureX, textureY); // Import ImportBox2146
		leftArmModel[162] = new ModelRendererTurbo(this, 2100, 3130, textureX, textureY); // Import ImportBox2148
		leftArmModel[163] = new ModelRendererTurbo(this, 2100, 3174, textureX, textureY); // Import ImportBox2149
		leftArmModel[164] = new ModelRendererTurbo(this, 2100, 3174, textureX, textureY); // Import ImportBox2150
		leftArmModel[165] = new ModelRendererTurbo(this, 2100, 3203, textureX, textureY); // Import ImportBox2152
		leftArmModel[166] = new ModelRendererTurbo(this, 2100, 3203, textureX, textureY); // Import ImportBox2153
		leftArmModel[167] = new ModelRendererTurbo(this, 2100, 3253, textureX, textureY); // Import ImportBox2154
		leftArmModel[168] = new ModelRendererTurbo(this, 2100, 3130, textureX, textureY); // Import ImportBox2155
		leftArmModel[169] = new ModelRendererTurbo(this, 2100, 3094, textureX, textureY); // Import ImportBox2156
		leftArmModel[170] = new ModelRendererTurbo(this, 2100, 3367, textureX, textureY); // Import ImportBox2157
		leftArmModel[171] = new ModelRendererTurbo(this, 2100, 3367, textureX, textureY); // Import ImportBox2158
		leftArmModel[172] = new ModelRendererTurbo(this, 2100, 3435, textureX, textureY); // Import ImportBox2159
		leftArmModel[173] = new ModelRendererTurbo(this, 2100, 3489, textureX, textureY); // Import ImportBox2160
		leftArmModel[174] = new ModelRendererTurbo(this, 2100, 3435, textureX, textureY); // Import ImportBox2161
		leftArmModel[175] = new ModelRendererTurbo(this, 2100, 3589, textureX, textureY); // Import ImportBox2162
		leftArmModel[176] = new ModelRendererTurbo(this, 2100, 3648, textureX, textureY); // Import ImportBox2163
		leftArmModel[177] = new ModelRendererTurbo(this, 2100, 3696, textureX, textureY); // Import ImportBox2164
		leftArmModel[178] = new ModelRendererTurbo(this, 2100, 3744, textureX, textureY); // Import ImportBox2165
		leftArmModel[179] = new ModelRendererTurbo(this, 2100, 3854, textureX, textureY); // Import ImportBox2166
		leftArmModel[180] = new ModelRendererTurbo(this, 2100, 3871, textureX, textureY); // Import ImportBox2167
		leftArmModel[181] = new ModelRendererTurbo(this, 2100, 3900, textureX, textureY); // Import ImportBox2168
		leftArmModel[182] = new ModelRendererTurbo(this, 2100, 3965, textureX, textureY); // Import ImportBox2169
		leftArmModel[183] = new ModelRendererTurbo(this, 2100, 3991, textureX, textureY); // Import ImportBox2170
		leftArmModel[184] = new ModelRendererTurbo(this, 2120, 3956, textureX, textureY); // Import ImportBox2171
		leftArmModel[185] = new ModelRendererTurbo(this, 2700, 0, textureX, textureY); // Import ImportBox2172
		leftArmModel[186] = new ModelRendererTurbo(this, 2700, 22, textureX, textureY); // Import ImportBox2176
		leftArmModel[187] = new ModelRendererTurbo(this, 2700, 42, textureX, textureY); // Import ImportBox2177
		leftArmModel[188] = new ModelRendererTurbo(this, 2700, 60, textureX, textureY); // Import ImportBox2178
		leftArmModel[189] = new ModelRendererTurbo(this, 2700, 75, textureX, textureY); // Import ImportBox2179
		leftArmModel[190] = new ModelRendererTurbo(this, 2700, 90, textureX, textureY); // Import ImportBox2180
		leftArmModel[191] = new ModelRendererTurbo(this, 2700, 104, textureX, textureY); // Import ImportBox2181
		leftArmModel[192] = new ModelRendererTurbo(this, 2700, 117, textureX, textureY); // Import ImportBox2182
		leftArmModel[193] = new ModelRendererTurbo(this, 2700, 117, textureX, textureY); // Import ImportBox2183
		leftArmModel[194] = new ModelRendererTurbo(this, 2700, 90, textureX, textureY); // Import ImportBox2184
		leftArmModel[195] = new ModelRendererTurbo(this, 2700, 22, textureX, textureY); // Import ImportBox2185
		leftArmModel[196] = new ModelRendererTurbo(this, 2700, 75, textureX, textureY); // Import ImportBox2186
		leftArmModel[197] = new ModelRendererTurbo(this, 2700, 42, textureX, textureY); // Import ImportBox2187
		leftArmModel[198] = new ModelRendererTurbo(this, 2700, 60, textureX, textureY); // Import ImportBox2188
		leftArmModel[199] = new ModelRendererTurbo(this, 2700, 0, textureX, textureY); // Import ImportBox2189
		leftArmModel[200] = new ModelRendererTurbo(this, 2700, 104, textureX, textureY); // Import ImportBox2190
		leftArmModel[201] = new ModelRendererTurbo(this, 2700, 117, textureX, textureY); // Import ImportBox2191
		leftArmModel[202] = new ModelRendererTurbo(this, 2700, 90, textureX, textureY); // Import ImportBox2192
		leftArmModel[203] = new ModelRendererTurbo(this, 2700, 22, textureX, textureY); // Import ImportBox2193
		leftArmModel[204] = new ModelRendererTurbo(this, 2700, 75, textureX, textureY); // Import ImportBox2194
		leftArmModel[205] = new ModelRendererTurbo(this, 2700, 42, textureX, textureY); // Import ImportBox2195
		leftArmModel[206] = new ModelRendererTurbo(this, 2700, 60, textureX, textureY); // Import ImportBox2196
		leftArmModel[207] = new ModelRendererTurbo(this, 2700, 0, textureX, textureY); // Import ImportBox2197
		leftArmModel[208] = new ModelRendererTurbo(this, 2700, 104, textureX, textureY); // Import ImportBox2198
		leftArmModel[209] = new ModelRendererTurbo(this, 2700, 137, textureX, textureY); // Import ImportBox2199
		leftArmModel[210] = new ModelRendererTurbo(this, 2700, 173, textureX, textureY); // Import ImportBox2200
		leftArmModel[211] = new ModelRendererTurbo(this, 2700, 203, textureX, textureY); // Import ImportBox2201
		leftArmModel[212] = new ModelRendererTurbo(this, 2700, 237, textureX, textureY); // Import ImportBox2202
		leftArmModel[213] = new ModelRendererTurbo(this, 2700, 280, textureX, textureY); // Import ImportBox2203
		leftArmModel[214] = new ModelRendererTurbo(this, 2700, 320, textureX, textureY); // Import ImportBox2204
		leftArmModel[215] = new ModelRendererTurbo(this, 2700, 320, textureX, textureY); // Import ImportBox2206

		leftArmModel[0].addShapeBox(-21.5F, -43.5F, 0F, 97, 87, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1843
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.57079633F;

		leftArmModel[1].addShapeBox(75.5F, -43.5F, 2F, 23, 87, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1844
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.57079633F;

		leftArmModel[2].addShapeBox(79.5F, -43.5F, 0F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1845
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.57079633F;

		leftArmModel[3].addShapeBox(85.5F, -43.5F, 0F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1846
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.57079633F;

		leftArmModel[4].addShapeBox(91.5F, -43.5F, 0F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1847
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		leftArmModel[5].addShapeBox(75.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1848
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -1.57079633F;

		leftArmModel[6].addShapeBox(81.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1849
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -1.57079633F;

		leftArmModel[7].addShapeBox(87.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1850
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -1.57079633F;

		leftArmModel[8].addShapeBox(93.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1851
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.57079633F;

		leftArmModel[9].addShapeBox(97.5F, -43.5F, 0F, 119, 87, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1852
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.57079633F;

		leftArmModel[10].addShapeBox(232.5F, -43.5F, 0F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1853
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.57079633F;

		leftArmModel[11].addShapeBox(216.5F, -43.5F, 2F, 22, 87, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1854
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.57079633F;

		leftArmModel[12].addShapeBox(234.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1855
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.57079633F;

		leftArmModel[13].addShapeBox(228.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1856
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = -1.57079633F;

		leftArmModel[14].addShapeBox(226.5F, -43.5F, 0F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1857
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = -1.57079633F;

		leftArmModel[15].addShapeBox(222.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1858
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = -1.57079633F;

		leftArmModel[16].addShapeBox(220.5F, -43.5F, 0F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1859
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = -1.57079633F;

		leftArmModel[17].addShapeBox(216.5F, -29.5F, 0F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1860
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = -1.57079633F;

		leftArmModel[18].addShapeBox(238.5F, -43.5F, 0F, 14, 87, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1861
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);
		leftArmModel[18].rotateAngleZ = -1.57079633F;

		leftArmModel[19].addShapeBox(-21.5F, -46.5F, 0F, 238, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1862
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
		leftArmModel[19].rotateAngleZ = -1.57079633F;

		leftArmModel[20].addShapeBox(220.5F, -46.5F, 0F, 2, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1863
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);
		leftArmModel[20].rotateAngleZ = -1.57079633F;

		leftArmModel[21].addShapeBox(226.5F, -46.5F, 0F, 2, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1864
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -1.57079633F;

		leftArmModel[22].addShapeBox(232.5F, -46.5F, 0F, 2, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1865
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = -1.57079633F;

		leftArmModel[23].addShapeBox(238.5F, -46.5F, 0F, 14, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1866
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);
		leftArmModel[23].rotateAngleZ = -1.57079633F;

		leftArmModel[24].addShapeBox(216.5F, -44.5F, 2F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1867
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);
		leftArmModel[24].rotateAngleZ = -1.57079633F;

		leftArmModel[25].addShapeBox(222.5F, -44.5F, 2F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1868
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);
		leftArmModel[25].rotateAngleZ = -1.57079633F;

		leftArmModel[26].addShapeBox(228.5F, -44.5F, 2F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1869
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = -1.57079633F;

		leftArmModel[27].addShapeBox(234.5F, -44.5F, 2F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1870
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -1.57079633F;

		leftArmModel[28].addShapeBox(234.5F, 43.5F, 2F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1871
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);
		leftArmModel[28].rotateAngleZ = -1.57079633F;

		leftArmModel[29].addShapeBox(228.5F, 43.5F, 2F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1872
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
		leftArmModel[29].rotateAngleZ = -1.57079633F;

		leftArmModel[30].addShapeBox(222.5F, 43.5F, 2F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1873
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);
		leftArmModel[30].rotateAngleZ = -1.57079633F;

		leftArmModel[31].addShapeBox(216.5F, 43.5F, 2F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1874
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);
		leftArmModel[31].rotateAngleZ = -1.57079633F;

		leftArmModel[32].addShapeBox(220.5F, 43.5F, 0F, 2, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1875
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);
		leftArmModel[32].rotateAngleZ = -1.57079633F;

		leftArmModel[33].addShapeBox(-21.5F, 43.5F, 0F, 238, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1876
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = -1.57079633F;

		leftArmModel[34].addShapeBox(226.5F, 43.5F, 0F, 2, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1877
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);
		leftArmModel[34].rotateAngleZ = -1.57079633F;

		leftArmModel[35].addShapeBox(232.5F, 43.5F, 0F, 2, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1878
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);
		leftArmModel[35].rotateAngleZ = -1.57079633F;

		leftArmModel[36].addShapeBox(238.5F, 43.5F, 0F, 14, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1879
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);
		leftArmModel[36].rotateAngleZ = -1.57079633F;

		leftArmModel[37].addShapeBox(-21.5F, -43.5F, 28F, 192, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1875
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -1.57079633F;

		leftArmModel[38].addShapeBox(253.5F, -46.5F, 0F, 41, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1876
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = -1.57079633F;

		leftArmModel[39].addShapeBox(253.5F, -43.5F, 0F, 41, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1877
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);
		leftArmModel[39].rotateAngleZ = -1.57079633F;

		leftArmModel[40].addShapeBox(258.5F, -16.5F, 0F, 36, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1878
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);
		leftArmModel[40].rotateAngleZ = -1.57079633F;

		leftArmModel[41].addShapeBox(253.5F, -11.5F, 0F, 5, 23, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox1879
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);
		leftArmModel[41].rotateAngleZ = -1.57079633F;

		leftArmModel[42].addShapeBox(253.5F, 16.5F, 0F, 41, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1880
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);
		leftArmModel[42].rotateAngleZ = -1.57079633F;

		leftArmModel[43].addShapeBox(253.5F, 43.5F, 0F, 41, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1881
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);
		leftArmModel[43].rotateAngleZ = -1.57079633F;

		leftArmModel[44].addShapeBox(252.5F, -44.5F, 2F, 1, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1882
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);
		leftArmModel[44].rotateAngleZ = -1.57079633F;

		leftArmModel[45].addShapeBox(252.5F, -43.5F, 2F, 42, 87, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1883
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);
		leftArmModel[45].rotateAngleZ = -1.57079633F;

		leftArmModel[46].addShapeBox(252.5F, 43.5F, 2F, 1, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1885
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);
		leftArmModel[46].rotateAngleZ = -1.57079633F;

		leftArmModel[47].addShapeBox(283.5F, -16.5F, -1F, 13, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1886
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);
		leftArmModel[47].rotateAngleZ = -1.57079633F;

		leftArmModel[48].addShapeBox(263.5F, -16.5F, -1F, 20, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox1887
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);
		leftArmModel[48].rotateAngleZ = -1.57079633F;

		leftArmModel[49].addShapeBox(263.5F, 10.5F, -1F, 20, 6, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1888
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);
		leftArmModel[49].rotateAngleZ = -1.57079633F;

		leftArmModel[50].addShapeBox(175.5F, -43.5F, 28F, 4, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1889
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);
		leftArmModel[50].rotateAngleZ = -1.57079633F;

		leftArmModel[51].addShapeBox(184.5F, -43.5F, 28F, 4, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1890
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);
		leftArmModel[51].rotateAngleZ = -1.57079633F;

		leftArmModel[52].addShapeBox(170.5F, -43.5F, 28F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1891
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);
		leftArmModel[52].rotateAngleZ = -1.57079633F;

		leftArmModel[53].addShapeBox(179.5F, -43.5F, 28F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1892
		leftArmModel[53].setRotationPoint(0F, 0F, 0F);
		leftArmModel[53].rotateAngleZ = -1.57079633F;

		leftArmModel[54].addShapeBox(188.5F, -43.5F, 28F, 6, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1893
		leftArmModel[54].setRotationPoint(0F, 0F, 0F);
		leftArmModel[54].rotateAngleZ = -1.57079633F;

		leftArmModel[55].addShapeBox(194.5F, -43.5F, 28F, 100, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1894
		leftArmModel[55].setRotationPoint(0F, 0F, 0F);
		leftArmModel[55].rotateAngleZ = -1.57079633F;

		leftArmModel[56].addShapeBox(194.5F, 20.5F, 28F, 100, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Import ImportBox1895
		leftArmModel[56].setRotationPoint(0F, 0F, 0F);
		leftArmModel[56].rotateAngleZ = -1.57079633F;

		leftArmModel[57].addShapeBox(188.5F, 20.5F, 28F, 6, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1896
		leftArmModel[57].setRotationPoint(0F, 0F, 0F);
		leftArmModel[57].rotateAngleZ = -1.57079633F;

		leftArmModel[58].addShapeBox(184.5F, 20.5F, 28F, 4, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Import ImportBox1897
		leftArmModel[58].setRotationPoint(0F, 0F, 0F);
		leftArmModel[58].rotateAngleZ = -1.57079633F;

		leftArmModel[59].addShapeBox(179.5F, 20.5F, 28F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1898
		leftArmModel[59].setRotationPoint(0F, 0F, 0F);
		leftArmModel[59].rotateAngleZ = -1.57079633F;

		leftArmModel[60].addShapeBox(175.5F, 20.5F, 28F, 4, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Import ImportBox1899
		leftArmModel[60].setRotationPoint(0F, 0F, 0F);
		leftArmModel[60].rotateAngleZ = -1.57079633F;

		leftArmModel[61].addShapeBox(170.5F, 20.5F, 28F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1900
		leftArmModel[61].setRotationPoint(0F, 0F, 0F);
		leftArmModel[61].rotateAngleZ = -1.57079633F;

		leftArmModel[62].addShapeBox(-21.5F, 20.5F, 28F, 192, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Import ImportBox1901
		leftArmModel[62].setRotationPoint(0F, 0F, 0F);
		leftArmModel[62].rotateAngleZ = -1.57079633F;

		leftArmModel[63].addShapeBox(-21.5F, -20.5F, 38F, 316, 41, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1902
		leftArmModel[63].setRotationPoint(0F, 0F, 0F);
		leftArmModel[63].rotateAngleZ = -1.57079633F;

		leftArmModel[64].addShapeBox(-21.5F, -20.5F, 41F, 228, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1903
		leftArmModel[64].setRotationPoint(0F, 0F, 0F);
		leftArmModel[64].rotateAngleZ = -1.57079633F;

		leftArmModel[65].addShapeBox(-21.5F, -12.5F, 41F, 228, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1904
		leftArmModel[65].setRotationPoint(0F, 0F, 0F);
		leftArmModel[65].rotateAngleZ = -1.57079633F;

		leftArmModel[66].addShapeBox(-21.5F, 15.5F, 41F, 228, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1905
		leftArmModel[66].setRotationPoint(0F, 0F, 0F);
		leftArmModel[66].rotateAngleZ = -1.57079633F;

		leftArmModel[67].addShapeBox(199.5F, -15.5F, 41F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1906
		leftArmModel[67].setRotationPoint(0F, 0F, 0F);
		leftArmModel[67].rotateAngleZ = -1.57079633F;

		leftArmModel[68].addShapeBox(199.5F, 12.5F, 41F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1907
		leftArmModel[68].setRotationPoint(0F, 0F, 0F);
		leftArmModel[68].rotateAngleZ = -1.57079633F;

		leftArmModel[69].addShapeBox(28.5F, -15.5F, 40.5F, 172, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1908
		leftArmModel[69].setRotationPoint(0F, 0F, 0F);
		leftArmModel[69].rotateAngleZ = -1.57079633F;

		leftArmModel[70].addShapeBox(28.5F, 12.5F, 40.5F, 172, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1909
		leftArmModel[70].setRotationPoint(0F, 0F, 0F);
		leftArmModel[70].rotateAngleZ = -1.57079633F;

		leftArmModel[71].addShapeBox(24.5F, 12.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1910
		leftArmModel[71].setRotationPoint(0F, 0F, 0F);
		leftArmModel[71].rotateAngleZ = -1.57079633F;

		leftArmModel[72].addShapeBox(24.5F, -15.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1911
		leftArmModel[72].setRotationPoint(0F, 0F, 0F);
		leftArmModel[72].rotateAngleZ = -1.57079633F;

		leftArmModel[73].addShapeBox(20.5F, 12.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1912
		leftArmModel[73].setRotationPoint(0F, 0F, 0F);
		leftArmModel[73].rotateAngleZ = -1.57079633F;

		leftArmModel[74].addShapeBox(20.5F, -15.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1913
		leftArmModel[74].setRotationPoint(0F, 0F, 0F);
		leftArmModel[74].rotateAngleZ = -1.57079633F;

		leftArmModel[75].addShapeBox(16.5F, 12.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1914
		leftArmModel[75].setRotationPoint(0F, 0F, 0F);
		leftArmModel[75].rotateAngleZ = -1.57079633F;

		leftArmModel[76].addShapeBox(16.5F, -15.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1915
		leftArmModel[76].setRotationPoint(0F, 0F, 0F);
		leftArmModel[76].rotateAngleZ = -1.57079633F;

		leftArmModel[77].addShapeBox(12.5F, 12.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1916
		leftArmModel[77].setRotationPoint(0F, 0F, 0F);
		leftArmModel[77].rotateAngleZ = -1.57079633F;

		leftArmModel[78].addShapeBox(12.5F, -15.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1917
		leftArmModel[78].setRotationPoint(0F, 0F, 0F);
		leftArmModel[78].rotateAngleZ = -1.57079633F;

		leftArmModel[79].addShapeBox(8.5F, 12.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1918
		leftArmModel[79].setRotationPoint(0F, 0F, 0F);
		leftArmModel[79].rotateAngleZ = -1.57079633F;

		leftArmModel[80].addShapeBox(8.5F, -15.5F, 40.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1919
		leftArmModel[80].setRotationPoint(0F, 0F, 0F);
		leftArmModel[80].rotateAngleZ = -1.57079633F;

		leftArmModel[81].addShapeBox(208.5F, -20.5F, 41F, 86, 41, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1920
		leftArmModel[81].setRotationPoint(0F, 0F, 0F);
		leftArmModel[81].rotateAngleZ = -1.57079633F;

		leftArmModel[82].addShapeBox(251.5F, -8.5F, 42F, 6, 18, 21, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import ImportBox1921
		leftArmModel[82].setRotationPoint(0F, 0F, 0F);
		leftArmModel[82].rotateAngleZ = -1.57079633F;

		leftArmModel[83].addShapeBox(257.5F, -8.5F, 42F, 12, 6, 21, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1922
		leftArmModel[83].setRotationPoint(0F, 0F, 0F);
		leftArmModel[83].rotateAngleZ = -1.57079633F;

		leftArmModel[84].addShapeBox(257.5F, 3.5F, 42F, 12, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1923
		leftArmModel[84].setRotationPoint(0F, 0F, 0F);
		leftArmModel[84].rotateAngleZ = -1.57079633F;

		leftArmModel[85].addShapeBox(257.5F, -2.5F, 42F, 13, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1924
		leftArmModel[85].setRotationPoint(0F, 0F, 0F);
		leftArmModel[85].rotateAngleZ = -1.57079633F;

		leftArmModel[86].addShapeBox(257.5F, -2.5F, 63F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1925
		leftArmModel[86].setRotationPoint(0F, 0F, 0F);
		leftArmModel[86].rotateAngleZ = -1.57079633F;

		leftArmModel[87].addShapeBox(294.5F, -46.5F, 0F, 3, 3, 31, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Import ImportBox1926
		leftArmModel[87].setRotationPoint(0F, 0F, 0F);
		leftArmModel[87].rotateAngleZ = -1.57079633F;

		leftArmModel[88].addShapeBox(294.5F, -43.5F, 0F, 3, 87, 3, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox1928
		leftArmModel[88].setRotationPoint(0F, 0F, 0F);
		leftArmModel[88].rotateAngleZ = -1.57079633F;

		leftArmModel[89].addShapeBox(294.5F, 43.5F, 0F, 3, 3, 31, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F); // Import ImportBox1929
		leftArmModel[89].setRotationPoint(0F, 0F, 0F);
		leftArmModel[89].rotateAngleZ = -1.57079633F;

		leftArmModel[90].addShapeBox(294.5F, -43.5F, 28F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 7F); // Import ImportBox1930
		leftArmModel[90].setRotationPoint(0F, 0F, 0F);
		leftArmModel[90].rotateAngleZ = -1.57079633F;

		leftArmModel[91].addShapeBox(294.5F, 20.5F, 28F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Import ImportBox1931
		leftArmModel[91].setRotationPoint(0F, 0F, 0F);
		leftArmModel[91].rotateAngleZ = -1.57079633F;

		leftArmModel[92].addShapeBox(294.5F, -20.5F, 28F, 3, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1932
		leftArmModel[92].setRotationPoint(0F, 0F, 0F);
		leftArmModel[92].rotateAngleZ = -1.57079633F;

		leftArmModel[93].addShapeBox(294.5F, 12.5F, 28F, 3, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1933
		leftArmModel[93].setRotationPoint(0F, 0F, 0F);
		leftArmModel[93].rotateAngleZ = -1.57079633F;

		leftArmModel[94].addShapeBox(294.5F, -20.5F, 39F, 3, 41, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Import ImportBox1934
		leftArmModel[94].setRotationPoint(0F, 0F, 0F);
		leftArmModel[94].rotateAngleZ = -1.57079633F;

		leftArmModel[95].addShapeBox(294.5F, -11.5F, 38F, 3, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1937
		leftArmModel[95].setRotationPoint(0F, 0F, 0F);
		leftArmModel[95].rotateAngleZ = -1.57079633F;

		leftArmModel[96].addShapeBox(294.5F, -11.5F, 14F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1939
		leftArmModel[96].setRotationPoint(0F, 0F, 0F);
		leftArmModel[96].rotateAngleZ = -1.57079633F;

		leftArmModel[97].addShapeBox(93.5F, -11.5F, 19F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox1940
		leftArmModel[97].setRotationPoint(0F, 0F, 0F);
		leftArmModel[97].rotateAngleZ = -1.57079633F;

		leftArmModel[98].addShapeBox(93.5F, -6.5F, 14F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1941
		leftArmModel[98].setRotationPoint(0F, 0F, 0F);
		leftArmModel[98].rotateAngleZ = -1.57079633F;

		leftArmModel[99].addShapeBox(93.5F, -11.5F, 25F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1943
		leftArmModel[99].setRotationPoint(0F, 0F, 0F);
		leftArmModel[99].rotateAngleZ = -1.57079633F;

		leftArmModel[100].addShapeBox(93.5F, -11.5F, 27F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1944
		leftArmModel[100].setRotationPoint(0F, 0F, 0F);
		leftArmModel[100].rotateAngleZ = -1.57079633F;

		leftArmModel[101].addShapeBox(294.5F, -11.5F, 33F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1945
		leftArmModel[101].setRotationPoint(0F, 0F, 0F);
		leftArmModel[101].rotateAngleZ = -1.57079633F;

		leftArmModel[102].addShapeBox(93.5F, -6.5F, 33F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1946
		leftArmModel[102].setRotationPoint(0F, 0F, 0F);
		leftArmModel[102].rotateAngleZ = -1.57079633F;

		leftArmModel[103].addShapeBox(93.5F, -0.5F, 36F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1947
		leftArmModel[103].setRotationPoint(0F, 0F, 0F);
		leftArmModel[103].rotateAngleZ = -1.57079633F;

		leftArmModel[104].addShapeBox(93.5F, -0.5F, 14F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1948
		leftArmModel[104].setRotationPoint(0F, 0F, 0F);
		leftArmModel[104].rotateAngleZ = -1.57079633F;

		leftArmModel[105].addShapeBox(93.5F, 1.5F, 14F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1949
		leftArmModel[105].setRotationPoint(0F, 0F, 0F);
		leftArmModel[105].rotateAngleZ = -1.57079633F;

		leftArmModel[106].addShapeBox(93.5F, 1.5F, 33F, 204, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1950
		leftArmModel[106].setRotationPoint(0F, 0F, 0F);
		leftArmModel[106].rotateAngleZ = -1.57079633F;

		leftArmModel[107].addShapeBox(93.5F, 7.5F, 27F, 204, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1951
		leftArmModel[107].setRotationPoint(0F, 0F, 0F);
		leftArmModel[107].rotateAngleZ = -1.57079633F;

		leftArmModel[108].addShapeBox(93.5F, 7.5F, 19F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1952
		leftArmModel[108].setRotationPoint(0F, 0F, 0F);
		leftArmModel[108].rotateAngleZ = -1.57079633F;

		leftArmModel[109].addShapeBox(294.5F, 7.5F, 14F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1953
		leftArmModel[109].setRotationPoint(0F, 0F, 0F);
		leftArmModel[109].rotateAngleZ = -1.57079633F;

		leftArmModel[110].addShapeBox(294.5F, 7.5F, 33F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1954
		leftArmModel[110].setRotationPoint(0F, 0F, 0F);
		leftArmModel[110].rotateAngleZ = -1.57079633F;

		leftArmModel[111].addShapeBox(93.5F, 10.5F, 25F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1955
		leftArmModel[111].setRotationPoint(0F, 0F, 0F);
		leftArmModel[111].rotateAngleZ = -1.57079633F;

		leftArmModel[112].addShapeBox(93.5F, -19F, 17F, 204, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1956
		leftArmModel[112].setRotationPoint(0F, 0F, 0F);
		leftArmModel[112].rotateAngleZ = -1.57079633F;

		leftArmModel[113].addShapeBox(93.5F, -16F, 15F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1957
		leftArmModel[113].setRotationPoint(0F, 0F, 0F);
		leftArmModel[113].rotateAngleZ = -1.57079633F;

		leftArmModel[114].addShapeBox(93.5F, -19F, 9F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1958
		leftArmModel[114].setRotationPoint(0F, 0F, 0F);
		leftArmModel[114].rotateAngleZ = -1.57079633F;

		leftArmModel[115].addShapeBox(93.5F, -25F, 4F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1959
		leftArmModel[115].setRotationPoint(0F, 0F, 0F);
		leftArmModel[115].rotateAngleZ = -1.57079633F;

		leftArmModel[116].addShapeBox(93.5F, -33F, 4F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1960
		leftArmModel[116].setRotationPoint(0F, 0F, 0F);
		leftArmModel[116].rotateAngleZ = -1.57079633F;

		leftArmModel[117].addShapeBox(93.5F, -27F, 4F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1961
		leftArmModel[117].setRotationPoint(0F, 0F, 0F);
		leftArmModel[117].rotateAngleZ = -1.57079633F;

		leftArmModel[118].addShapeBox(93.5F, -38F, 9F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox1962
		leftArmModel[118].setRotationPoint(0F, 0F, 0F);
		leftArmModel[118].rotateAngleZ = -1.57079633F;

		leftArmModel[119].addShapeBox(93.5F, -38F, 15F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1963
		leftArmModel[119].setRotationPoint(0F, 0F, 0F);
		leftArmModel[119].rotateAngleZ = -1.57079633F;

		leftArmModel[120].addShapeBox(93.5F, -38F, 17F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1964
		leftArmModel[120].setRotationPoint(0F, 0F, 0F);
		leftArmModel[120].rotateAngleZ = -1.57079633F;

		leftArmModel[121].addShapeBox(93.5F, -33F, 23F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1965
		leftArmModel[121].setRotationPoint(0F, 0F, 0F);
		leftArmModel[121].rotateAngleZ = -1.57079633F;

		leftArmModel[122].addShapeBox(93.5F, -27F, 26F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1966
		leftArmModel[122].setRotationPoint(0F, 0F, 0F);
		leftArmModel[122].rotateAngleZ = -1.57079633F;

		leftArmModel[123].addShapeBox(93.5F, -25F, 23F, 204, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1967
		leftArmModel[123].setRotationPoint(0F, 0F, 0F);
		leftArmModel[123].rotateAngleZ = -1.57079633F;

		leftArmModel[124].addShapeBox(93.5F, 33F, 17F, 204, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1968
		leftArmModel[124].setRotationPoint(0F, 0F, 0F);
		leftArmModel[124].rotateAngleZ = -1.57079633F;

		leftArmModel[125].addShapeBox(93.5F, 36F, 15F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1969
		leftArmModel[125].setRotationPoint(0F, 0F, 0F);
		leftArmModel[125].rotateAngleZ = -1.57079633F;

		leftArmModel[126].addShapeBox(93.5F, 33F, 9F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1970
		leftArmModel[126].setRotationPoint(0F, 0F, 0F);
		leftArmModel[126].rotateAngleZ = -1.57079633F;

		leftArmModel[127].addShapeBox(93.5F, 27F, 4F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1971
		leftArmModel[127].setRotationPoint(0F, 0F, 0F);
		leftArmModel[127].rotateAngleZ = -1.57079633F;

		leftArmModel[128].addShapeBox(93.5F, 19F, 4F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1972
		leftArmModel[128].setRotationPoint(0F, 0F, 0F);
		leftArmModel[128].rotateAngleZ = -1.57079633F;

		leftArmModel[129].addShapeBox(93.5F, 25F, 4F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1973
		leftArmModel[129].setRotationPoint(0F, 0F, 0F);
		leftArmModel[129].rotateAngleZ = -1.57079633F;

		leftArmModel[130].addShapeBox(93.5F, 14F, 9F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox1974
		leftArmModel[130].setRotationPoint(0F, 0F, 0F);
		leftArmModel[130].rotateAngleZ = -1.57079633F;

		leftArmModel[131].addShapeBox(93.5F, 14F, 15F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1975
		leftArmModel[131].setRotationPoint(0F, 0F, 0F);
		leftArmModel[131].rotateAngleZ = -1.57079633F;

		leftArmModel[132].addShapeBox(93.5F, 14F, 17F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1976
		leftArmModel[132].setRotationPoint(0F, 0F, 0F);
		leftArmModel[132].rotateAngleZ = -1.57079633F;

		leftArmModel[133].addShapeBox(93.5F, 19F, 23F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1977
		leftArmModel[133].setRotationPoint(0F, 0F, 0F);
		leftArmModel[133].rotateAngleZ = -1.57079633F;

		leftArmModel[134].addShapeBox(93.5F, 25F, 26F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1978
		leftArmModel[134].setRotationPoint(0F, 0F, 0F);
		leftArmModel[134].rotateAngleZ = -1.57079633F;

		leftArmModel[135].addShapeBox(93.5F, 27F, 23F, 204, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1979
		leftArmModel[135].setRotationPoint(0F, 0F, 0F);
		leftArmModel[135].rotateAngleZ = -1.57079633F;

		leftArmModel[136].addShapeBox(294.5F, -38F, 4F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1980
		leftArmModel[136].setRotationPoint(0F, 0F, 0F);
		leftArmModel[136].rotateAngleZ = -1.57079633F;

		leftArmModel[137].addShapeBox(294.5F, -19F, 4F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1981
		leftArmModel[137].setRotationPoint(0F, 0F, 0F);
		leftArmModel[137].rotateAngleZ = -1.57079633F;

		leftArmModel[138].addShapeBox(294.5F, -19F, 23F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1982
		leftArmModel[138].setRotationPoint(0F, 0F, 0F);
		leftArmModel[138].rotateAngleZ = -1.57079633F;

		leftArmModel[139].addShapeBox(294.5F, -38F, 23F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1983
		leftArmModel[139].setRotationPoint(0F, 0F, 0F);
		leftArmModel[139].rotateAngleZ = -1.57079633F;

		leftArmModel[140].addShapeBox(294.5F, 14F, 4F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1984
		leftArmModel[140].setRotationPoint(0F, 0F, 0F);
		leftArmModel[140].rotateAngleZ = -1.57079633F;

		leftArmModel[141].addShapeBox(294.5F, 33F, 4F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1985
		leftArmModel[141].setRotationPoint(0F, 0F, 0F);
		leftArmModel[141].rotateAngleZ = -1.57079633F;

		leftArmModel[142].addShapeBox(294.5F, 33F, 23F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1986
		leftArmModel[142].setRotationPoint(0F, 0F, 0F);
		leftArmModel[142].rotateAngleZ = -1.57079633F;

		leftArmModel[143].addShapeBox(294.5F, 14F, 23F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1987
		leftArmModel[143].setRotationPoint(0F, 0F, 0F);
		leftArmModel[143].rotateAngleZ = -1.57079633F;

		leftArmModel[144].addShapeBox(296.5F, -42.5F, 3F, 1, 85, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1988
		leftArmModel[144].setRotationPoint(0F, 0F, 0F);
		leftArmModel[144].rotateAngleZ = -1.57079633F;

		leftArmModel[145].addShapeBox(296.5F, 38F, 4F, 1, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1989
		leftArmModel[145].setRotationPoint(0F, 0F, 0F);
		leftArmModel[145].rotateAngleZ = -1.57079633F;

		leftArmModel[146].addShapeBox(296.5F, -43F, 4F, 1, 5, 24, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1990
		leftArmModel[146].setRotationPoint(0F, 0F, 0F);
		leftArmModel[146].rotateAngleZ = -1.57079633F;

		leftArmModel[147].addShapeBox(296.5F, -14F, 4F, 1, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1991
		leftArmModel[147].setRotationPoint(0F, 0F, 0F);
		leftArmModel[147].rotateAngleZ = -1.57079633F;

		leftArmModel[148].addShapeBox(296.5F, 12F, 4F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1992
		leftArmModel[148].setRotationPoint(0F, 0F, 0F);
		leftArmModel[148].rotateAngleZ = -1.57079633F;

		leftArmModel[149].addShapeBox(294.5F, -11.5F, 4F, 3, 24, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1993
		leftArmModel[149].setRotationPoint(0F, 0F, 0F);
		leftArmModel[149].rotateAngleZ = -1.57079633F;

		leftArmModel[150].addShapeBox(90.5F, -38F, 4F, 3, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2137
		leftArmModel[150].setRotationPoint(0F, 0F, 0F);
		leftArmModel[150].rotateAngleZ = -1.57079633F;

		leftArmModel[151].addShapeBox(90.5F, 14F, 4F, 3, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2138
		leftArmModel[151].setRotationPoint(0F, 0F, 0F);
		leftArmModel[151].rotateAngleZ = -1.57079633F;

		leftArmModel[152].addShapeBox(90.5F, -11.5F, 14F, 3, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2139
		leftArmModel[152].setRotationPoint(0F, 0F, 0F);
		leftArmModel[152].rotateAngleZ = -1.57079633F;

		leftArmModel[153].addShapeBox(-67.5F, -20.5F, 42F, 74, 41, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2144
		leftArmModel[153].setRotationPoint(0F, 0F, 0F);
		leftArmModel[153].rotateAngleZ = -1.57079633F;

		leftArmModel[154].addShapeBox(-27.5F, -42.5F, 3F, 6, 85, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2145
		leftArmModel[154].setRotationPoint(0F, 0F, 0F);
		leftArmModel[154].rotateAngleZ = -1.57079633F;

		leftArmModel[155].addShapeBox(-27.5F, -43.5F, 3F, 6, 1, 26, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2146
		leftArmModel[155].setRotationPoint(0F, 0F, 0F);
		leftArmModel[155].rotateAngleZ = -1.57079633F;

		leftArmModel[156].addShapeBox(-27.5F, 42.5F, 3F, 6, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2147
		leftArmModel[156].setRotationPoint(0F, 0F, 0F);
		leftArmModel[156].rotateAngleZ = -1.57079633F;

		leftArmModel[157].addShapeBox(-27.5F, -20.5F, 36F, 6, 41, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2148
		leftArmModel[157].setRotationPoint(0F, 0F, 0F);
		leftArmModel[157].rotateAngleZ = -1.57079633F;

		leftArmModel[158].addShapeBox(-27.5F, -42.5F, 28F, 6, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2149
		leftArmModel[158].setRotationPoint(0F, 0F, 0F);
		leftArmModel[158].rotateAngleZ = -1.57079633F;

		leftArmModel[159].addShapeBox(-27.5F, 20.5F, 28F, 6, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Import ImportBox2150
		leftArmModel[159].setRotationPoint(0F, 0F, 0F);
		leftArmModel[159].rotateAngleZ = -1.57079633F;

		leftArmModel[160].addShapeBox(-69.5F, -43.5F, 0F, 42, 87, 4, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Import ImportBox2145
		leftArmModel[160].setRotationPoint(0F, 0F, 0F);
		leftArmModel[160].rotateAngleZ = -1.57079633F;

		leftArmModel[161].addShapeBox(-69.5F, -46.5F, 0F, 42, 3, 31, 0F,0F, 8F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 8F, 8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 11F); // Import ImportBox2146
		leftArmModel[161].setRotationPoint(0F, 0F, 0F);
		leftArmModel[161].rotateAngleZ = -1.57079633F;

		leftArmModel[162].addShapeBox(-69.5F, -43.5F, 28F, 42, 19, 21, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // Import ImportBox2148
		leftArmModel[162].setRotationPoint(0F, 0F, 0F);
		leftArmModel[162].rotateAngleZ = -1.57079633F;

		leftArmModel[163].addShapeBox(-69.5F, -24.5F, 28F, 42, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 9F); // Import ImportBox2149
		leftArmModel[163].setRotationPoint(0F, 0F, 0F);
		leftArmModel[163].rotateAngleZ = -1.57079633F;

		leftArmModel[164].addShapeBox(-69.5F, 20.5F, 28F, 42, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // Import ImportBox2150
		leftArmModel[164].setRotationPoint(0F, 0F, 0F);
		leftArmModel[164].rotateAngleZ = -1.57079633F;

		leftArmModel[165].addShapeBox(-200.5F, -54.5F, 0F, 131, 3, 42, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2152
		leftArmModel[165].setRotationPoint(0F, 0F, 0F);
		leftArmModel[165].rotateAngleZ = -1.57079633F;

		leftArmModel[166].addShapeBox(-200.5F, 51.5F, 0F, 131, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2153
		leftArmModel[166].setRotationPoint(0F, 0F, 0F);
		leftArmModel[166].rotateAngleZ = -1.57079633F;

		leftArmModel[167].addShapeBox(-200.5F, -51.5F, 0F, 131, 103, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2154
		leftArmModel[167].setRotationPoint(0F, 0F, 0F);
		leftArmModel[167].rotateAngleZ = -1.57079633F;

		leftArmModel[168].addShapeBox(-69.5F, 24.5F, 28F, 42, 19, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 8F, -7F); // Import ImportBox2155
		leftArmModel[168].setRotationPoint(0F, 0F, 0F);
		leftArmModel[168].rotateAngleZ = -1.57079633F;

		leftArmModel[169].addShapeBox(-69.5F, 43.5F, 0F, 42, 3, 31, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 11F, 0F, 8F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 8F, 8F); // Import ImportBox2156
		leftArmModel[169].setRotationPoint(0F, 0F, 0F);
		leftArmModel[169].rotateAngleZ = -1.57079633F;

		leftArmModel[170].addShapeBox(-200.5F, -51.5F, 4F, 131, 27, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F); // Import ImportBox2157
		leftArmModel[170].setRotationPoint(0F, 0F, 0F);
		leftArmModel[170].rotateAngleZ = -1.57079633F;

		leftArmModel[171].addShapeBox(-200.5F, 24.5F, 4F, 131, 27, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2158
		leftArmModel[171].setRotationPoint(0F, 0F, 0F);
		leftArmModel[171].rotateAngleZ = -1.57079633F;

		leftArmModel[172].addShapeBox(-200.5F, -24.5F, 4F, 131, 4, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F); // Import ImportBox2159
		leftArmModel[172].setRotationPoint(0F, 0F, 0F);
		leftArmModel[172].rotateAngleZ = -1.57079633F;

		leftArmModel[173].addShapeBox(-200.5F, -20.5F, 4F, 131, 41, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2160
		leftArmModel[173].setRotationPoint(0F, 0F, 0F);
		leftArmModel[173].rotateAngleZ = -1.57079633F;

		leftArmModel[174].addShapeBox(-200.5F, 20.5F, 4F, 131, 4, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2161
		leftArmModel[174].setRotationPoint(0F, 0F, 0F);
		leftArmModel[174].rotateAngleZ = -1.57079633F;

		leftArmModel[175].addShapeBox(-69.5F, -20.5F, 42F, 2, 41, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2162
		leftArmModel[175].setRotationPoint(0F, 0F, 0F);
		leftArmModel[175].rotateAngleZ = -1.57079633F;

		leftArmModel[176].addShapeBox(-202.5F, -54.5F, 0F, 2, 3, 42, 0F,0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Import ImportBox2163
		leftArmModel[176].setRotationPoint(0F, 0F, 0F);
		leftArmModel[176].rotateAngleZ = -1.57079633F;

		leftArmModel[177].addShapeBox(-202.5F, 51.5F, 0F, 2, 3, 42, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F); // Import ImportBox2164
		leftArmModel[177].setRotationPoint(0F, 0F, 0F);
		leftArmModel[177].rotateAngleZ = -1.57079633F;

		leftArmModel[178].addShapeBox(-202.5F, -51.5F, 0F, 2, 103, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2165
		leftArmModel[178].setRotationPoint(0F, 0F, 0F);
		leftArmModel[178].rotateAngleZ = -1.57079633F;

		leftArmModel[179].addShapeBox(-202.5F, -51.5F, 39F, 2, 27, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 1F, 5F); // Import ImportBox2166
		leftArmModel[179].setRotationPoint(0F, 0F, 0F);
		leftArmModel[179].rotateAngleZ = -1.57079633F;

		leftArmModel[180].addShapeBox(-202.5F, -24.5F, 39F, 2, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Import ImportBox2167
		leftArmModel[180].setRotationPoint(0F, 0F, 0F);
		leftArmModel[180].rotateAngleZ = -1.57079633F;

		leftArmModel[181].addShapeBox(-202.5F, -20.5F, 39F, 2, 41, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Import ImportBox2168
		leftArmModel[181].setRotationPoint(0F, 0F, 0F);
		leftArmModel[181].rotateAngleZ = -1.57079633F;

		leftArmModel[182].addShapeBox(-202.5F, 20.5F, 39F, 2, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -11F); // Import ImportBox2169
		leftArmModel[182].setRotationPoint(0F, 0F, 0F);
		leftArmModel[182].rotateAngleZ = -1.57079633F;

		leftArmModel[183].addShapeBox(-202.5F, 24.5F, 39F, 2, 27, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 1F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Import ImportBox2170
		leftArmModel[183].setRotationPoint(0F, 0F, 0F);
		leftArmModel[183].rotateAngleZ = -1.57079633F;

		leftArmModel[184].addShapeBox(-202.5F, -49.5F, 3F, 2, 99, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2171
		leftArmModel[184].setRotationPoint(0F, 0F, 0F);
		leftArmModel[184].rotateAngleZ = -1.57079633F;

		leftArmModel[185].addShapeBox(-208.5F, -39.5F, 10F, 6, 12, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2172
		leftArmModel[185].setRotationPoint(0F, 0F, 0F);
		leftArmModel[185].rotateAngleZ = -1.57079633F;

		leftArmModel[186].addShapeBox(-208.5F, -39.5F, 31F, 6, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2176
		leftArmModel[186].setRotationPoint(0F, 0F, 0F);
		leftArmModel[186].rotateAngleZ = -1.57079633F;

		leftArmModel[187].addShapeBox(-208.5F, -45.5F, 16F, 6, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2177
		leftArmModel[187].setRotationPoint(0F, 0F, 0F);
		leftArmModel[187].rotateAngleZ = -1.57079633F;

		leftArmModel[188].addShapeBox(-208.5F, -45.5F, 10F, 6, 3, 6, 0F,0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2178
		leftArmModel[188].setRotationPoint(0F, 0F, 0F);
		leftArmModel[188].rotateAngleZ = -1.57079633F;

		leftArmModel[189].addShapeBox(-208.5F, -45.5F, 28F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F); // Import ImportBox2179
		leftArmModel[189].setRotationPoint(0F, 0F, 0F);
		leftArmModel[189].rotateAngleZ = -1.57079633F;

		leftArmModel[190].addShapeBox(-208.5F, -24.5F, 28F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Import ImportBox2180
		leftArmModel[190].setRotationPoint(0F, 0F, 0F);
		leftArmModel[190].rotateAngleZ = -1.57079633F;

		leftArmModel[191].addShapeBox(-208.5F, -24.5F, 10F, 6, 3, 6, 0F,0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2181
		leftArmModel[191].setRotationPoint(0F, 0F, 0F);
		leftArmModel[191].rotateAngleZ = -1.57079633F;

		leftArmModel[192].addShapeBox(-208.5F, -24.5F, 16F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2182
		leftArmModel[192].setRotationPoint(0F, 0F, 0F);
		leftArmModel[192].rotateAngleZ = -1.57079633F;

		leftArmModel[193].addShapeBox(-208.5F, 42.5F, 16F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2183
		leftArmModel[193].setRotationPoint(0F, 0F, 0F);
		leftArmModel[193].rotateAngleZ = -1.57079633F;

		leftArmModel[194].addShapeBox(-208.5F, 42.5F, 28F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Import ImportBox2184
		leftArmModel[194].setRotationPoint(0F, 0F, 0F);
		leftArmModel[194].rotateAngleZ = -1.57079633F;

		leftArmModel[195].addShapeBox(-208.5F, 27.5F, 31F, 6, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2185
		leftArmModel[195].setRotationPoint(0F, 0F, 0F);
		leftArmModel[195].rotateAngleZ = -1.57079633F;

		leftArmModel[196].addShapeBox(-208.5F, 21.5F, 28F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F); // Import ImportBox2186
		leftArmModel[196].setRotationPoint(0F, 0F, 0F);
		leftArmModel[196].rotateAngleZ = -1.57079633F;

		leftArmModel[197].addShapeBox(-208.5F, 21.5F, 16F, 6, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2187
		leftArmModel[197].setRotationPoint(0F, 0F, 0F);
		leftArmModel[197].rotateAngleZ = -1.57079633F;

		leftArmModel[198].addShapeBox(-208.5F, 21.5F, 10F, 6, 3, 6, 0F,0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2188
		leftArmModel[198].setRotationPoint(0F, 0F, 0F);
		leftArmModel[198].rotateAngleZ = -1.57079633F;

		leftArmModel[199].addShapeBox(-208.5F, 27.5F, 10F, 6, 12, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2189
		leftArmModel[199].setRotationPoint(0F, 0F, 0F);
		leftArmModel[199].rotateAngleZ = -1.57079633F;

		leftArmModel[200].addShapeBox(-208.5F, 42.5F, 10F, 6, 3, 6, 0F,0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2190
		leftArmModel[200].setRotationPoint(0F, 0F, 0F);
		leftArmModel[200].rotateAngleZ = -1.57079633F;

		leftArmModel[201].addShapeBox(-208.5F, 9F, 31F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2191
		leftArmModel[201].setRotationPoint(0F, 0F, 0F);
		leftArmModel[201].rotateAngleZ = -1.57079633F;

		leftArmModel[202].addShapeBox(-208.5F, 9F, 43F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Import ImportBox2192
		leftArmModel[202].setRotationPoint(0F, 0F, 0F);
		leftArmModel[202].rotateAngleZ = -1.57079633F;

		leftArmModel[203].addShapeBox(-208.5F, -6F, 46F, 6, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2193
		leftArmModel[203].setRotationPoint(0F, 0F, 0F);
		leftArmModel[203].rotateAngleZ = -1.57079633F;

		leftArmModel[204].addShapeBox(-208.5F, -12F, 43F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F); // Import ImportBox2194
		leftArmModel[204].setRotationPoint(0F, 0F, 0F);
		leftArmModel[204].rotateAngleZ = -1.57079633F;

		leftArmModel[205].addShapeBox(-208.5F, -12F, 31F, 6, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2195
		leftArmModel[205].setRotationPoint(0F, 0F, 0F);
		leftArmModel[205].rotateAngleZ = -1.57079633F;

		leftArmModel[206].addShapeBox(-208.5F, -12F, 25F, 6, 3, 6, 0F,0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2196
		leftArmModel[206].setRotationPoint(0F, 0F, 0F);
		leftArmModel[206].rotateAngleZ = -1.57079633F;

		leftArmModel[207].addShapeBox(-208.5F, -6F, 25F, 6, 12, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2197
		leftArmModel[207].setRotationPoint(0F, 0F, 0F);
		leftArmModel[207].rotateAngleZ = -1.57079633F;

		leftArmModel[208].addShapeBox(-208.5F, 9F, 25F, 6, 3, 6, 0F,0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2198
		leftArmModel[208].setRotationPoint(0F, 0F, 0F);
		leftArmModel[208].rotateAngleZ = -1.57079633F;

		leftArmModel[209].addShapeBox(-200.5F, -13.5F, -1F, 9, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2199
		leftArmModel[209].setRotationPoint(0F, 0F, 0F);
		leftArmModel[209].rotateAngleZ = -1.57079633F;

		leftArmModel[210].addShapeBox(-191.5F, -13.5F, -1F, 20, 27, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import ImportBox2200
		leftArmModel[210].setRotationPoint(0F, 0F, 0F);
		leftArmModel[210].rotateAngleZ = -1.57079633F;

		leftArmModel[211].addShapeBox(-203.5F, -13.5F, -1F, 3, 27, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2201
		leftArmModel[211].setRotationPoint(0F, 0F, 0F);
		leftArmModel[211].rotateAngleZ = -1.57079633F;

		leftArmModel[212].addShapeBox(-203.5F, -13.5F, 3F, 3, 27, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Import ImportBox2202
		leftArmModel[212].setRotationPoint(0F, 0F, 0F);
		leftArmModel[212].rotateAngleZ = -1.57079633F;

		leftArmModel[213].addShapeBox(296.5F, -16.5F, -1F, 2, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2203
		leftArmModel[213].setRotationPoint(0F, 0F, 0F);
		leftArmModel[213].rotateAngleZ = -1.57079633F;

		leftArmModel[214].addShapeBox(296.5F, -16.5F, 2F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox2204
		leftArmModel[214].setRotationPoint(0F, 0F, 0F);
		leftArmModel[214].rotateAngleZ = -1.57079633F;

		leftArmModel[215].addShapeBox(296.5F, 11.5F, 2F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2206
		leftArmModel[215].setRotationPoint(0F, 0F, 0F);
		leftArmModel[215].rotateAngleZ = -1.57079633F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 2100, 75, textureX, textureY); // Import ImportBox1994
		rightArmModel[1] = new ModelRendererTurbo(this, 2100, 428, textureX, textureY); // Import ImportBox1995
		rightArmModel[2] = new ModelRendererTurbo(this, 2100, 768, textureX, textureY); // Import ImportBox1996
		rightArmModel[3] = new ModelRendererTurbo(this, 2100, 918, textureX, textureY); // Import ImportBox1997
		rightArmModel[4] = new ModelRendererTurbo(this, 2100, 992, textureX, textureY); // Import ImportBox1998
		rightArmModel[5] = new ModelRendererTurbo(this, 2100, 1059, textureX, textureY); // Import ImportBox1999
		rightArmModel[6] = new ModelRendererTurbo(this, 2100, 1096, textureX, textureY); // Import ImportBox2000
		rightArmModel[7] = new ModelRendererTurbo(this, 2100, 1135, textureX, textureY); // Import ImportBox2001
		rightArmModel[8] = new ModelRendererTurbo(this, 2100, 1176, textureX, textureY); // Import ImportBox2002
		rightArmModel[9] = new ModelRendererTurbo(this, 2100, 1346, textureX, textureY); // Import ImportBox2003
		rightArmModel[10] = new ModelRendererTurbo(this, 2100, 1623, textureX, textureY); // Import ImportBox2004
		rightArmModel[11] = new ModelRendererTurbo(this, 2100, 1660, textureX, textureY); // Import ImportBox2005
		rightArmModel[12] = new ModelRendererTurbo(this, 2100, 1695, textureX, textureY); // Import ImportBox2006
		rightArmModel[13] = new ModelRendererTurbo(this, 2103, 172, textureX, textureY); // Import ImportBox2007
		rightArmModel[14] = new ModelRendererTurbo(this, 2100, 265, textureX, textureY); // Import ImportBox2008
		rightArmModel[15] = new ModelRendererTurbo(this, 2100, 265, textureX, textureY); // Import ImportBox2009
		rightArmModel[16] = new ModelRendererTurbo(this, 2100, 265, textureX, textureY); // Import ImportBox2010
		rightArmModel[17] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox2011
		rightArmModel[18] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox2012
		rightArmModel[19] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox2013
		rightArmModel[20] = new ModelRendererTurbo(this, 2100, 359, textureX, textureY); // Import ImportBox2014
		rightArmModel[21] = new ModelRendererTurbo(this, 2100, 520, textureX, textureY); // Import ImportBox2015
		rightArmModel[22] = new ModelRendererTurbo(this, 2100, 612, textureX, textureY); // Import ImportBox2016
		rightArmModel[23] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox2017
		rightArmModel[24] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox2018
		rightArmModel[25] = new ModelRendererTurbo(this, 2100, 520, textureX, textureY); // Import ImportBox2019
		rightArmModel[26] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox2020
		rightArmModel[27] = new ModelRendererTurbo(this, 2100, 520, textureX, textureY); // Import ImportBox2021
		rightArmModel[28] = new ModelRendererTurbo(this, 2100, 703, textureX, textureY); // Import ImportBox2022
		rightArmModel[29] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox2023
		rightArmModel[30] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox2024
		rightArmModel[31] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox2025
		rightArmModel[32] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2026
		rightArmModel[33] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2027
		rightArmModel[34] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox2028
		rightArmModel[35] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox2029
		rightArmModel[36] = new ModelRendererTurbo(this, 2100, 955, textureX, textureY); // Import ImportBox2030
		rightArmModel[37] = new ModelRendererTurbo(this, 2100, 1385, textureX, textureY); // Import ImportBox2031
		rightArmModel[38] = new ModelRendererTurbo(this, 2100, 1415, textureX, textureY); // Import ImportBox2032
		rightArmModel[39] = new ModelRendererTurbo(this, 2100, 1385, textureX, textureY); // Import ImportBox2033
		rightArmModel[40] = new ModelRendererTurbo(this, 2100, 1214, textureX, textureY); // Import ImportBox2034
		rightArmModel[41] = new ModelRendererTurbo(this, 2100, 1247, textureX, textureY); // Import ImportBox2035
		rightArmModel[42] = new ModelRendererTurbo(this, 2100, 1285, textureX, textureY); // Import ImportBox2036
		rightArmModel[43] = new ModelRendererTurbo(this, 2100, 1314, textureX, textureY); // Import ImportBox2037
		rightArmModel[44] = new ModelRendererTurbo(this, 2100, 1507, textureX, textureY); // Import ImportBox2038
		rightArmModel[45] = new ModelRendererTurbo(this, 2100, 1549, textureX, textureY); // Import ImportBox2039
		rightArmModel[46] = new ModelRendererTurbo(this, 2100, 1549, textureX, textureY); // Import ImportBox2040
		rightArmModel[47] = new ModelRendererTurbo(this, 2100, 1730, textureX, textureY); // Import ImportBox2041
		rightArmModel[48] = new ModelRendererTurbo(this, 2100, 1777, textureX, textureY); // Import ImportBox2042
		rightArmModel[49] = new ModelRendererTurbo(this, 2100, 1787, textureX, textureY); // Import ImportBox2043
		rightArmModel[50] = new ModelRendererTurbo(this, 2100, 1777, textureX, textureY); // Import ImportBox2044
		rightArmModel[51] = new ModelRendererTurbo(this, 2100, 1837, textureX, textureY); // Import ImportBox2045
		rightArmModel[52] = new ModelRendererTurbo(this, 2100, 1882, textureX, textureY); // Import ImportBox2046
		rightArmModel[53] = new ModelRendererTurbo(this, 2100, 1925, textureX, textureY); // Import ImportBox2047
		rightArmModel[54] = new ModelRendererTurbo(this, 2100, 1925, textureX, textureY); // Import ImportBox2048
		rightArmModel[55] = new ModelRendererTurbo(this, 2100, 1956, textureX, textureY); // Import ImportBox2049
		rightArmModel[56] = new ModelRendererTurbo(this, 2100, 1988, textureX, textureY); // Import ImportBox2050
		rightArmModel[57] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox2051
		rightArmModel[58] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox2052
		rightArmModel[59] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox2053
		rightArmModel[60] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox2054
		rightArmModel[61] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox2055
		rightArmModel[62] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox2056
		rightArmModel[63] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox2057
		rightArmModel[64] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox2058
		rightArmModel[65] = new ModelRendererTurbo(this, 2100, 1560, textureX, textureY); // Import ImportBox2059
		rightArmModel[66] = new ModelRendererTurbo(this, 2100, 1596, textureX, textureY); // Import ImportBox2060
		rightArmModel[67] = new ModelRendererTurbo(this, 2100, 1815, textureX, textureY); // Import ImportBox2061
		rightArmModel[68] = new ModelRendererTurbo(this, 2100, 1815, textureX, textureY); // Import ImportBox2062
		rightArmModel[69] = new ModelRendererTurbo(this, 2100, 3653, textureX, textureY); // Import ImportBox2063
		rightArmModel[70] = new ModelRendererTurbo(this, 2100, 1823, textureX, textureY); // Import ImportBox2064
		rightArmModel[71] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2065
		rightArmModel[72] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2066
		rightArmModel[73] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2067
		rightArmModel[74] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2068
		rightArmModel[75] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2069
		rightArmModel[76] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2070
		rightArmModel[77] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2071
		rightArmModel[78] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2072
		rightArmModel[79] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2073
		rightArmModel[80] = new ModelRendererTurbo(this, 2100, 1830, textureX, textureY); // Import ImportBox2074
		rightArmModel[81] = new ModelRendererTurbo(this, 2100, 1998, textureX, textureY); // Import ImportBox2075
		rightArmModel[82] = new ModelRendererTurbo(this, 2100, 2036, textureX, textureY); // Import ImportBox2076
		rightArmModel[83] = new ModelRendererTurbo(this, 2100, 2104, textureX, textureY); // Import ImportBox2077
		rightArmModel[84] = new ModelRendererTurbo(this, 2100, 2140, textureX, textureY); // Import ImportBox2078
		rightArmModel[85] = new ModelRendererTurbo(this, 2100, 2170, textureX, textureY); // Import ImportBox2079
		rightArmModel[86] = new ModelRendererTurbo(this, 2100, 2202, textureX, textureY); // Import ImportBox2080
		rightArmModel[87] = new ModelRendererTurbo(this, 2100, 2202, textureX, textureY); // Import ImportBox2081
		rightArmModel[88] = new ModelRendererTurbo(this, 2100, 2226, textureX, textureY); // Import ImportBox2082
		rightArmModel[89] = new ModelRendererTurbo(this, 2100, 2273, textureX, textureY); // Import ImportBox2083
		rightArmModel[90] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2084
		rightArmModel[91] = new ModelRendererTurbo(this, 2100, 2352, textureX, textureY); // Import ImportBox2085
		rightArmModel[92] = new ModelRendererTurbo(this, 2100, 2365, textureX, textureY); // Import ImportBox2086
		rightArmModel[93] = new ModelRendererTurbo(this, 2100, 2344, textureX, textureY); // Import ImportBox2087
		rightArmModel[94] = new ModelRendererTurbo(this, 2100, 2313, textureX, textureY); // Import ImportBox2088
		rightArmModel[95] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2089
		rightArmModel[96] = new ModelRendererTurbo(this, 2100, 2329, textureX, textureY); // Import ImportBox2090
		rightArmModel[97] = new ModelRendererTurbo(this, 2100, 2388, textureX, textureY); // Import ImportBox2091
		rightArmModel[98] = new ModelRendererTurbo(this, 2100, 2379, textureX, textureY); // Import ImportBox2092
		rightArmModel[99] = new ModelRendererTurbo(this, 2100, 2410, textureX, textureY); // Import ImportBox2093
		rightArmModel[100] = new ModelRendererTurbo(this, 2100, 2396, textureX, textureY); // Import ImportBox2094
		rightArmModel[101] = new ModelRendererTurbo(this, 2100, 2440, textureX, textureY); // Import ImportBox2095
		rightArmModel[102] = new ModelRendererTurbo(this, 2100, 2424, textureX, textureY); // Import ImportBox2096
		rightArmModel[103] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2097
		rightArmModel[104] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2098
		rightArmModel[105] = new ModelRendererTurbo(this, 2100, 2453, textureX, textureY); // Import ImportBox2099
		rightArmModel[106] = new ModelRendererTurbo(this, 2100, 2440, textureX, textureY); // Import ImportBox2100
		rightArmModel[107] = new ModelRendererTurbo(this, 2100, 2453, textureX, textureY); // Import ImportBox2101
		rightArmModel[108] = new ModelRendererTurbo(this, 2100, 2424, textureX, textureY); // Import ImportBox2102
		rightArmModel[109] = new ModelRendererTurbo(this, 2100, 2410, textureX, textureY); // Import ImportBox2103
		rightArmModel[110] = new ModelRendererTurbo(this, 2100, 2365, textureX, textureY); // Import ImportBox2104
		rightArmModel[111] = new ModelRendererTurbo(this, 2100, 2379, textureX, textureY); // Import ImportBox2105
		rightArmModel[112] = new ModelRendererTurbo(this, 2100, 2352, textureX, textureY); // Import ImportBox2106
		rightArmModel[113] = new ModelRendererTurbo(this, 2100, 2344, textureX, textureY); // Import ImportBox2107
		rightArmModel[114] = new ModelRendererTurbo(this, 2100, 2313, textureX, textureY); // Import ImportBox2108
		rightArmModel[115] = new ModelRendererTurbo(this, 2100, 2329, textureX, textureY); // Import ImportBox2109
		rightArmModel[116] = new ModelRendererTurbo(this, 2100, 2388, textureX, textureY); // Import ImportBox2110
		rightArmModel[117] = new ModelRendererTurbo(this, 2100, 2396, textureX, textureY); // Import ImportBox2111
		rightArmModel[118] = new ModelRendererTurbo(this, 2100, 2440, textureX, textureY); // Import ImportBox2112
		rightArmModel[119] = new ModelRendererTurbo(this, 2100, 2453, textureX, textureY); // Import ImportBox2113
		rightArmModel[120] = new ModelRendererTurbo(this, 2100, 2424, textureX, textureY); // Import ImportBox2114
		rightArmModel[121] = new ModelRendererTurbo(this, 2100, 2410, textureX, textureY); // Import ImportBox2115
		rightArmModel[122] = new ModelRendererTurbo(this, 2100, 2365, textureX, textureY); // Import ImportBox2116
		rightArmModel[123] = new ModelRendererTurbo(this, 2100, 2379, textureX, textureY); // Import ImportBox2117
		rightArmModel[124] = new ModelRendererTurbo(this, 2100, 2352, textureX, textureY); // Import ImportBox2118
		rightArmModel[125] = new ModelRendererTurbo(this, 2100, 2344, textureX, textureY); // Import ImportBox2119
		rightArmModel[126] = new ModelRendererTurbo(this, 2100, 2313, textureX, textureY); // Import ImportBox2120
		rightArmModel[127] = new ModelRendererTurbo(this, 2100, 2329, textureX, textureY); // Import ImportBox2121
		rightArmModel[128] = new ModelRendererTurbo(this, 2100, 2388, textureX, textureY); // Import ImportBox2122
		rightArmModel[129] = new ModelRendererTurbo(this, 2100, 2396, textureX, textureY); // Import ImportBox2123
		rightArmModel[130] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2124
		rightArmModel[131] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2125
		rightArmModel[132] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2126
		rightArmModel[133] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2127
		rightArmModel[134] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2128
		rightArmModel[135] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2129
		rightArmModel[136] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2130
		rightArmModel[137] = new ModelRendererTurbo(this, 2100, 2300, textureX, textureY); // Import ImportBox2131
		rightArmModel[138] = new ModelRendererTurbo(this, 2100, 2460, textureX, textureY); // Import ImportBox2132
		rightArmModel[139] = new ModelRendererTurbo(this, 2100, 2527, textureX, textureY); // Import ImportBox2133
		rightArmModel[140] = new ModelRendererTurbo(this, 2100, 2561, textureX, textureY); // Import ImportBox2134
		rightArmModel[141] = new ModelRendererTurbo(this, 2100, 2589, textureX, textureY); // Import ImportBox2135
		rightArmModel[142] = new ModelRendererTurbo(this, 2100, 2620, textureX, textureY); // Import ImportBox2136
		rightArmModel[143] = new ModelRendererTurbo(this, 2100, 2657, textureX, textureY); // Import ImportBox2140
		rightArmModel[144] = new ModelRendererTurbo(this, 2100, 2657, textureX, textureY); // Import ImportBox2141
		rightArmModel[145] = new ModelRendererTurbo(this, 2100, 2657, textureX, textureY); // Import ImportBox2142
		rightArmModel[146] = new ModelRendererTurbo(this, 2100, 2527, textureX, textureY); // Import ImportBox2143
		rightArmModel[147] = new ModelRendererTurbo(this, 2700, 280, textureX, textureY); // Import ImportBox2207
		rightArmModel[148] = new ModelRendererTurbo(this, 2700, 320, textureX, textureY); // Import ImportBox2208
		rightArmModel[149] = new ModelRendererTurbo(this, 2700, 320, textureX, textureY); // Import ImportBox2209
		rightArmModel[150] = new ModelRendererTurbo(this, 2100, 2771, textureX, textureY); // Import ImportBox2210
		rightArmModel[151] = new ModelRendererTurbo(this, 2100, 2884, textureX, textureY); // Import ImportBox2211
		rightArmModel[152] = new ModelRendererTurbo(this, 2100, 2884, textureX, textureY); // Import ImportBox2212
		rightArmModel[153] = new ModelRendererTurbo(this, 2100, 2964, textureX, textureY); // Import ImportBox2213
		rightArmModel[154] = new ModelRendererTurbo(this, 2100, 2964, textureX, textureY); // Import ImportBox2214
		rightArmModel[155] = new ModelRendererTurbo(this, 2100, 2709, textureX, textureY); // Import ImportBox2215
		rightArmModel[156] = new ModelRendererTurbo(this, 2100, 3000, textureX, textureY); // Import ImportBox2216
		rightArmModel[157] = new ModelRendererTurbo(this, 2100, 3094, textureX, textureY); // Import ImportBox2217
		rightArmModel[158] = new ModelRendererTurbo(this, 2100, 3130, textureX, textureY); // Import ImportBox2218
		rightArmModel[159] = new ModelRendererTurbo(this, 2100, 3174, textureX, textureY); // Import ImportBox2219
		rightArmModel[160] = new ModelRendererTurbo(this, 2100, 3174, textureX, textureY); // Import ImportBox2220
		rightArmModel[161] = new ModelRendererTurbo(this, 2100, 3203, textureX, textureY); // Import ImportBox2221
		rightArmModel[162] = new ModelRendererTurbo(this, 2100, 3203, textureX, textureY); // Import ImportBox2222
		rightArmModel[163] = new ModelRendererTurbo(this, 2100, 3253, textureX, textureY); // Import ImportBox2223
		rightArmModel[164] = new ModelRendererTurbo(this, 2100, 3130, textureX, textureY); // Import ImportBox2224
		rightArmModel[165] = new ModelRendererTurbo(this, 2100, 3094, textureX, textureY); // Import ImportBox2225
		rightArmModel[166] = new ModelRendererTurbo(this, 2100, 3367, textureX, textureY); // Import ImportBox2226
		rightArmModel[167] = new ModelRendererTurbo(this, 2100, 3367, textureX, textureY); // Import ImportBox2227
		rightArmModel[168] = new ModelRendererTurbo(this, 2100, 3435, textureX, textureY); // Import ImportBox2228
		rightArmModel[169] = new ModelRendererTurbo(this, 2100, 3489, textureX, textureY); // Import ImportBox2229
		rightArmModel[170] = new ModelRendererTurbo(this, 2100, 3648, textureX, textureY); // Import ImportBox2230
		rightArmModel[171] = new ModelRendererTurbo(this, 2100, 3696, textureX, textureY); // Import ImportBox2231
		rightArmModel[172] = new ModelRendererTurbo(this, 2100, 3744, textureX, textureY); // Import ImportBox2232
		rightArmModel[173] = new ModelRendererTurbo(this, 2100, 3854, textureX, textureY); // Import ImportBox2233
		rightArmModel[174] = new ModelRendererTurbo(this, 2100, 3871, textureX, textureY); // Import ImportBox2234
		rightArmModel[175] = new ModelRendererTurbo(this, 2100, 3900, textureX, textureY); // Import ImportBox2235
		rightArmModel[176] = new ModelRendererTurbo(this, 2100, 3965, textureX, textureY); // Import ImportBox2236
		rightArmModel[177] = new ModelRendererTurbo(this, 2100, 3991, textureX, textureY); // Import ImportBox2237
		rightArmModel[178] = new ModelRendererTurbo(this, 2120, 3956, textureX, textureY); // Import ImportBox2238
		rightArmModel[179] = new ModelRendererTurbo(this, 2700, 137, textureX, textureY); // Import ImportBox2239
		rightArmModel[180] = new ModelRendererTurbo(this, 2700, 173, textureX, textureY); // Import ImportBox2240
		rightArmModel[181] = new ModelRendererTurbo(this, 2700, 203, textureX, textureY); // Import ImportBox2241
		rightArmModel[182] = new ModelRendererTurbo(this, 2700, 237, textureX, textureY); // Import ImportBox2242
		rightArmModel[183] = new ModelRendererTurbo(this, 2700, 22, textureX, textureY); // Import ImportBox2243
		rightArmModel[184] = new ModelRendererTurbo(this, 2700, 0, textureX, textureY); // Import ImportBox2244
		rightArmModel[185] = new ModelRendererTurbo(this, 2700, 42, textureX, textureY); // Import ImportBox2245
		rightArmModel[186] = new ModelRendererTurbo(this, 2700, 75, textureX, textureY); // Import ImportBox2246
		rightArmModel[187] = new ModelRendererTurbo(this, 2700, 60, textureX, textureY); // Import ImportBox2247
		rightArmModel[188] = new ModelRendererTurbo(this, 2700, 104, textureX, textureY); // Import ImportBox2248
		rightArmModel[189] = new ModelRendererTurbo(this, 2700, 90, textureX, textureY); // Import ImportBox2249
		rightArmModel[190] = new ModelRendererTurbo(this, 2700, 117, textureX, textureY); // Import ImportBox2250
		rightArmModel[191] = new ModelRendererTurbo(this, 2700, 117, textureX, textureY); // Import ImportBox2251
		rightArmModel[192] = new ModelRendererTurbo(this, 2700, 104, textureX, textureY); // Import ImportBox2252
		rightArmModel[193] = new ModelRendererTurbo(this, 2700, 0, textureX, textureY); // Import ImportBox2253
		rightArmModel[194] = new ModelRendererTurbo(this, 2700, 60, textureX, textureY); // Import ImportBox2254
		rightArmModel[195] = new ModelRendererTurbo(this, 2700, 42, textureX, textureY); // Import ImportBox2255
		rightArmModel[196] = new ModelRendererTurbo(this, 2700, 75, textureX, textureY); // Import ImportBox2256
		rightArmModel[197] = new ModelRendererTurbo(this, 2700, 22, textureX, textureY); // Import ImportBox2257
		rightArmModel[198] = new ModelRendererTurbo(this, 2700, 90, textureX, textureY); // Import ImportBox2258
		rightArmModel[199] = new ModelRendererTurbo(this, 2700, 117, textureX, textureY); // Import ImportBox2259
		rightArmModel[200] = new ModelRendererTurbo(this, 2700, 104, textureX, textureY); // Import ImportBox2260
		rightArmModel[201] = new ModelRendererTurbo(this, 2700, 0, textureX, textureY); // Import ImportBox2261
		rightArmModel[202] = new ModelRendererTurbo(this, 2700, 60, textureX, textureY); // Import ImportBox2262
		rightArmModel[203] = new ModelRendererTurbo(this, 2700, 42, textureX, textureY); // Import ImportBox2263
		rightArmModel[204] = new ModelRendererTurbo(this, 2700, 75, textureX, textureY); // Import ImportBox2264
		rightArmModel[205] = new ModelRendererTurbo(this, 2700, 22, textureX, textureY); // Import ImportBox2265
		rightArmModel[206] = new ModelRendererTurbo(this, 2700, 90, textureX, textureY); // Import ImportBox2266
		rightArmModel[207] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2267
		rightArmModel[208] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2268
		rightArmModel[209] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2270
		rightArmModel[210] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2271
		rightArmModel[211] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2272
		rightArmModel[212] = new ModelRendererTurbo(this, 2100, 1028, textureX, textureY); // Import ImportBox2273
		rightArmModel[213] = new ModelRendererTurbo(this, 2100, 3435, textureX, textureY); // Import ImportBox2274
		rightArmModel[214] = new ModelRendererTurbo(this, 2100, 3589, textureX, textureY); // Import ImportBox2275
		rightArmModel[215] = new ModelRendererTurbo(this, 2100, 2915, textureX, textureY); // Import ImportBox2270

		rightArmModel[0].addShapeBox(-21.5F, -43.5F, -3F, 97, 87, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1994
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.57079633F;

		rightArmModel[1].addShapeBox(97.5F, -43.5F, -3F, 119, 87, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1995
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.57079633F;

		rightArmModel[2].addShapeBox(238.5F, -43.5F, -3F, 14, 87, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1996
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -1.57079633F;

		rightArmModel[3].addShapeBox(-21.5F, -46.5F, -31F, 238, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1997
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -1.57079633F;

		rightArmModel[4].addShapeBox(238.5F, -46.5F, -31F, 14, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1998
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -1.57079633F;

		rightArmModel[5].addShapeBox(-21.5F, 43.5F, -31F, 238, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1999
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -1.57079633F;

		rightArmModel[6].addShapeBox(238.5F, 43.5F, -31F, 14, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2000
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -1.57079633F;

		rightArmModel[7].addShapeBox(-21.5F, -43.5F, -38F, 192, 23, 10, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2001
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -1.57079633F;

		rightArmModel[8].addShapeBox(253.5F, -46.5F, -31F, 41, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2002
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -1.57079633F;

		rightArmModel[9].addShapeBox(253.5F, 43.5F, -31F, 41, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2003
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -1.57079633F;

		rightArmModel[10].addShapeBox(194.5F, -43.5F, -38F, 100, 23, 10, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2004
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -1.57079633F;

		rightArmModel[11].addShapeBox(194.5F, 20.5F, -38F, 100, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2005
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -1.57079633F;

		rightArmModel[12].addShapeBox(-21.5F, 20.5F, -38F, 192, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2006
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -1.57079633F;

		rightArmModel[13].addShapeBox(75.5F, -43.5F, -3F, 23, 87, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2007
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
		rightArmModel[13].rotateAngleZ = -1.57079633F;

		rightArmModel[14].addShapeBox(79.5F, -43.5F, -2F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2008
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
		rightArmModel[14].rotateAngleZ = -1.57079633F;

		rightArmModel[15].addShapeBox(85.5F, -43.5F, -2F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2009
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
		rightArmModel[15].rotateAngleZ = -1.57079633F;

		rightArmModel[16].addShapeBox(91.5F, -43.5F, -2F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2010
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
		rightArmModel[16].rotateAngleZ = -1.57079633F;

		rightArmModel[17].addShapeBox(75.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2011
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);
		rightArmModel[17].rotateAngleZ = -1.57079633F;

		rightArmModel[18].addShapeBox(81.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2012
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);
		rightArmModel[18].rotateAngleZ = -1.57079633F;

		rightArmModel[19].addShapeBox(87.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2013
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
		rightArmModel[19].rotateAngleZ = -1.57079633F;

		rightArmModel[20].addShapeBox(93.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2014
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
		rightArmModel[20].rotateAngleZ = -1.57079633F;

		rightArmModel[21].addShapeBox(232.5F, -43.5F, -2F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2015
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
		rightArmModel[21].rotateAngleZ = -1.57079633F;

		rightArmModel[22].addShapeBox(216.5F, -43.5F, -3F, 22, 87, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2016
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = -1.57079633F;

		rightArmModel[23].addShapeBox(234.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2017
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);
		rightArmModel[23].rotateAngleZ = -1.57079633F;

		rightArmModel[24].addShapeBox(228.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2018
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);
		rightArmModel[24].rotateAngleZ = -1.57079633F;

		rightArmModel[25].addShapeBox(226.5F, -43.5F, -2F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2019
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);
		rightArmModel[25].rotateAngleZ = -1.57079633F;

		rightArmModel[26].addShapeBox(222.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2020
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = -1.57079633F;

		rightArmModel[27].addShapeBox(220.5F, -43.5F, -2F, 2, 87, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2021
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);
		rightArmModel[27].rotateAngleZ = -1.57079633F;

		rightArmModel[28].addShapeBox(216.5F, -29.5F, -2F, 4, 59, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2022
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);
		rightArmModel[28].rotateAngleZ = -1.57079633F;

		rightArmModel[29].addShapeBox(220.5F, -46.5F, -31F, 2, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2023
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = -1.57079633F;

		rightArmModel[30].addShapeBox(226.5F, -46.5F, -31F, 2, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2024
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = -1.57079633F;

		rightArmModel[31].addShapeBox(232.5F, -46.5F, -31F, 2, 3, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2025
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);
		rightArmModel[31].rotateAngleZ = -1.57079633F;

		rightArmModel[32].addShapeBox(228.5F, -44.5F, -29F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2026
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);
		rightArmModel[32].rotateAngleZ = -1.57079633F;

		rightArmModel[33].addShapeBox(222.5F, 43.5F, -29F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2027
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);
		rightArmModel[33].rotateAngleZ = -1.57079633F;

		rightArmModel[34].addShapeBox(220.5F, 43.5F, -31F, 2, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2028
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);
		rightArmModel[34].rotateAngleZ = -1.57079633F;

		rightArmModel[35].addShapeBox(226.5F, 43.5F, -31F, 2, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2029
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);
		rightArmModel[35].rotateAngleZ = -1.57079633F;

		rightArmModel[36].addShapeBox(232.5F, 43.5F, -31F, 2, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2030
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);
		rightArmModel[36].rotateAngleZ = -1.57079633F;

		rightArmModel[37].addShapeBox(252.5F, -44.5F, -29F, 1, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2031
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);
		rightArmModel[37].rotateAngleZ = -1.57079633F;

		rightArmModel[38].addShapeBox(252.5F, -43.5F, -3F, 42, 87, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2032
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);
		rightArmModel[38].rotateAngleZ = -1.57079633F;

		rightArmModel[39].addShapeBox(252.5F, 43.5F, -29F, 1, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2033
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);
		rightArmModel[39].rotateAngleZ = -1.57079633F;

		rightArmModel[40].addShapeBox(253.5F, -43.5F, -2F, 41, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2034
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);
		rightArmModel[40].rotateAngleZ = -1.57079633F;

		rightArmModel[41].addShapeBox(258.5F, -16.5F, -2F, 36, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2035
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);
		rightArmModel[41].rotateAngleZ = -1.57079633F;

		rightArmModel[42].addShapeBox(253.5F, -11.5F, -2F, 5, 23, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox2036
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);
		rightArmModel[42].rotateAngleZ = -1.57079633F;

		rightArmModel[43].addShapeBox(253.5F, 16.5F, -2F, 41, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2037
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);
		rightArmModel[43].rotateAngleZ = -1.57079633F;

		rightArmModel[44].addShapeBox(283.5F, -16.5F, -2F, 13, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2038
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);
		rightArmModel[44].rotateAngleZ = -1.57079633F;

		rightArmModel[45].addShapeBox(263.5F, -16.5F, 0F, 20, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox2039
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);
		rightArmModel[45].rotateAngleZ = -1.57079633F;

		rightArmModel[46].addShapeBox(263.5F, 10.5F, 0F, 20, 6, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2040
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);
		rightArmModel[46].rotateAngleZ = -1.57079633F;

		rightArmModel[47].addShapeBox(-21.5F, -20.5F, -41F, 316, 41, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2041
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);
		rightArmModel[47].rotateAngleZ = -1.57079633F;

		rightArmModel[48].addShapeBox(-21.5F, -20.5F, -42F, 228, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2042
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);
		rightArmModel[48].rotateAngleZ = -1.57079633F;

		rightArmModel[49].addShapeBox(-21.5F, -12.5F, -42F, 228, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2043
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);
		rightArmModel[49].rotateAngleZ = -1.57079633F;

		rightArmModel[50].addShapeBox(-21.5F, 15.5F, -42F, 228, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2044
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);
		rightArmModel[50].rotateAngleZ = -1.57079633F;

		rightArmModel[51].addShapeBox(208.5F, -20.5F, -42F, 86, 41, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2045
		rightArmModel[51].setRotationPoint(0F, 0F, 0F);
		rightArmModel[51].rotateAngleZ = -1.57079633F;

		rightArmModel[52].addShapeBox(251.5F, -8.5F, -63F, 6, 18, 21, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import ImportBox2046
		rightArmModel[52].setRotationPoint(0F, 0F, 0F);
		rightArmModel[52].rotateAngleZ = -1.57079633F;

		rightArmModel[53].addShapeBox(257.5F, -8.5F, -63F, 12, 6, 21, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2047
		rightArmModel[53].setRotationPoint(0F, 0F, 0F);
		rightArmModel[53].rotateAngleZ = -1.57079633F;

		rightArmModel[54].addShapeBox(257.5F, 3.5F, -63F, 12, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2048
		rightArmModel[54].setRotationPoint(0F, 0F, 0F);
		rightArmModel[54].rotateAngleZ = -1.57079633F;

		rightArmModel[55].addShapeBox(257.5F, -2.5F, -63F, 13, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2049
		rightArmModel[55].setRotationPoint(0F, 0F, 0F);
		rightArmModel[55].rotateAngleZ = -1.57079633F;

		rightArmModel[56].addShapeBox(257.5F, -2.5F, -64F, 13, 6, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2050
		rightArmModel[56].setRotationPoint(0F, 0F, 0F);
		rightArmModel[56].rotateAngleZ = -1.57079633F;

		rightArmModel[57].addShapeBox(175.5F, -43.5F, -38F, 4, 23, 10, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2051
		rightArmModel[57].setRotationPoint(0F, 0F, 0F);
		rightArmModel[57].rotateAngleZ = -1.57079633F;

		rightArmModel[58].addShapeBox(184.5F, -43.5F, -38F, 4, 23, 10, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2052
		rightArmModel[58].setRotationPoint(0F, 0F, 0F);
		rightArmModel[58].rotateAngleZ = -1.57079633F;

		rightArmModel[59].addShapeBox(170.5F, -43.5F, -31F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2053
		rightArmModel[59].setRotationPoint(0F, 0F, 0F);
		rightArmModel[59].rotateAngleZ = -1.57079633F;

		rightArmModel[60].addShapeBox(179.5F, -43.5F, -31F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2054
		rightArmModel[60].setRotationPoint(0F, 0F, 0F);
		rightArmModel[60].rotateAngleZ = -1.57079633F;

		rightArmModel[61].addShapeBox(188.5F, -43.5F, -31F, 6, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2055
		rightArmModel[61].setRotationPoint(0F, 0F, 0F);
		rightArmModel[61].rotateAngleZ = -1.57079633F;

		rightArmModel[62].addShapeBox(188.5F, 20.5F, -31F, 6, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2056
		rightArmModel[62].setRotationPoint(0F, 0F, 0F);
		rightArmModel[62].rotateAngleZ = -1.57079633F;

		rightArmModel[63].addShapeBox(184.5F, 20.5F, -38F, 4, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2057
		rightArmModel[63].setRotationPoint(0F, 0F, 0F);
		rightArmModel[63].rotateAngleZ = -1.57079633F;

		rightArmModel[64].addShapeBox(179.5F, 20.5F, -31F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2058
		rightArmModel[64].setRotationPoint(0F, 0F, 0F);
		rightArmModel[64].rotateAngleZ = -1.57079633F;

		rightArmModel[65].addShapeBox(175.5F, 20.5F, -38F, 4, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2059
		rightArmModel[65].setRotationPoint(0F, 0F, 0F);
		rightArmModel[65].rotateAngleZ = -1.57079633F;

		rightArmModel[66].addShapeBox(170.5F, 20.5F, -31F, 5, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2060
		rightArmModel[66].setRotationPoint(0F, 0F, 0F);
		rightArmModel[66].rotateAngleZ = -1.57079633F;

		rightArmModel[67].addShapeBox(199.5F, -15.5F, -42F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2061
		rightArmModel[67].setRotationPoint(0F, 0F, 0F);
		rightArmModel[67].rotateAngleZ = -1.57079633F;

		rightArmModel[68].addShapeBox(199.5F, 12.5F, -42F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2062
		rightArmModel[68].setRotationPoint(0F, 0F, 0F);
		rightArmModel[68].rotateAngleZ = -1.57079633F;

		rightArmModel[69].addShapeBox(28.5F, -15.5F, -41.5F, 172, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2063
		rightArmModel[69].setRotationPoint(0F, 0F, 0F);
		rightArmModel[69].rotateAngleZ = -1.57079633F;

		rightArmModel[70].addShapeBox(28.5F, 12.5F, -41.5F, 172, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2064
		rightArmModel[70].setRotationPoint(0F, 0F, 0F);
		rightArmModel[70].rotateAngleZ = -1.57079633F;

		rightArmModel[71].addShapeBox(24.5F, 12.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2065
		rightArmModel[71].setRotationPoint(0F, 0F, 0F);
		rightArmModel[71].rotateAngleZ = -1.57079633F;

		rightArmModel[72].addShapeBox(24.5F, -15.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2066
		rightArmModel[72].setRotationPoint(0F, 0F, 0F);
		rightArmModel[72].rotateAngleZ = -1.57079633F;

		rightArmModel[73].addShapeBox(20.5F, 12.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2067
		rightArmModel[73].setRotationPoint(0F, 0F, 0F);
		rightArmModel[73].rotateAngleZ = -1.57079633F;

		rightArmModel[74].addShapeBox(20.5F, -15.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2068
		rightArmModel[74].setRotationPoint(0F, 0F, 0F);
		rightArmModel[74].rotateAngleZ = -1.57079633F;

		rightArmModel[75].addShapeBox(16.5F, 12.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2069
		rightArmModel[75].setRotationPoint(0F, 0F, 0F);
		rightArmModel[75].rotateAngleZ = -1.57079633F;

		rightArmModel[76].addShapeBox(16.5F, -15.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2070
		rightArmModel[76].setRotationPoint(0F, 0F, 0F);
		rightArmModel[76].rotateAngleZ = -1.57079633F;

		rightArmModel[77].addShapeBox(12.5F, 12.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2071
		rightArmModel[77].setRotationPoint(0F, 0F, 0F);
		rightArmModel[77].rotateAngleZ = -1.57079633F;

		rightArmModel[78].addShapeBox(12.5F, -15.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2072
		rightArmModel[78].setRotationPoint(0F, 0F, 0F);
		rightArmModel[78].rotateAngleZ = -1.57079633F;

		rightArmModel[79].addShapeBox(8.5F, 12.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2073
		rightArmModel[79].setRotationPoint(0F, 0F, 0F);
		rightArmModel[79].rotateAngleZ = -1.57079633F;

		rightArmModel[80].addShapeBox(8.5F, -15.5F, -41.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2074
		rightArmModel[80].setRotationPoint(0F, 0F, 0F);
		rightArmModel[80].rotateAngleZ = -1.57079633F;

		rightArmModel[81].addShapeBox(294.5F, -46.5F, -31F, 3, 3, 31, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Import ImportBox2075
		rightArmModel[81].setRotationPoint(0F, 0F, 0F);
		rightArmModel[81].rotateAngleZ = -1.57079633F;

		rightArmModel[82].addShapeBox(294.5F, -43.5F, -3F, 3, 87, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Import ImportBox2076
		rightArmModel[82].setRotationPoint(0F, 0F, 0F);
		rightArmModel[82].rotateAngleZ = -1.57079633F;

		rightArmModel[83].addShapeBox(294.5F, 43.5F, -31F, 3, 3, 31, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F); // Import ImportBox2077
		rightArmModel[83].setRotationPoint(0F, 0F, 0F);
		rightArmModel[83].rotateAngleZ = -1.57079633F;

		rightArmModel[84].addShapeBox(294.5F, -43.5F, -31F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2078
		rightArmModel[84].setRotationPoint(0F, 0F, 0F);
		rightArmModel[84].rotateAngleZ = -1.57079633F;

		rightArmModel[85].addShapeBox(294.5F, 20.5F, -31F, 3, 23, 3, 0F,0F, 0F, 7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox2079
		rightArmModel[85].setRotationPoint(0F, 0F, 0F);
		rightArmModel[85].rotateAngleZ = -1.57079633F;

		rightArmModel[86].addShapeBox(294.5F, -20.5F, -39F, 3, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2080
		rightArmModel[86].setRotationPoint(0F, 0F, 0F);
		rightArmModel[86].rotateAngleZ = -1.57079633F;

		rightArmModel[87].addShapeBox(294.5F, 12.5F, -39F, 3, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2081
		rightArmModel[87].setRotationPoint(0F, 0F, 0F);
		rightArmModel[87].rotateAngleZ = -1.57079633F;

		rightArmModel[88].addShapeBox(294.5F, -20.5F, -42F, 3, 41, 3, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2082
		rightArmModel[88].setRotationPoint(0F, 0F, 0F);
		rightArmModel[88].rotateAngleZ = -1.57079633F;

		rightArmModel[89].addShapeBox(294.5F, -11.5F, -39F, 3, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2083
		rightArmModel[89].setRotationPoint(0F, 0F, 0F);
		rightArmModel[89].rotateAngleZ = -1.57079633F;

		rightArmModel[90].addShapeBox(294.5F, -11.5F, -19F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2084
		rightArmModel[90].setRotationPoint(0F, 0F, 0F);
		rightArmModel[90].rotateAngleZ = -1.57079633F;

		rightArmModel[91].addShapeBox(93.5F, -11.5F, -25F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2085
		rightArmModel[91].setRotationPoint(0F, 0F, 0F);
		rightArmModel[91].rotateAngleZ = -1.57079633F;

		rightArmModel[92].addShapeBox(93.5F, -6.5F, -19F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2086
		rightArmModel[92].setRotationPoint(0F, 0F, 0F);
		rightArmModel[92].rotateAngleZ = -1.57079633F;

		rightArmModel[93].addShapeBox(93.5F, -11.5F, -27F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2087
		rightArmModel[93].setRotationPoint(0F, 0F, 0F);
		rightArmModel[93].rotateAngleZ = -1.57079633F;

		rightArmModel[94].addShapeBox(93.5F, -11.5F, -33F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox2088
		rightArmModel[94].setRotationPoint(0F, 0F, 0F);
		rightArmModel[94].rotateAngleZ = -1.57079633F;

		rightArmModel[95].addShapeBox(294.5F, -11.5F, -38F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2089
		rightArmModel[95].setRotationPoint(0F, 0F, 0F);
		rightArmModel[95].rotateAngleZ = -1.57079633F;

		rightArmModel[96].addShapeBox(93.5F, -6.5F, -38F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2090
		rightArmModel[96].setRotationPoint(0F, 0F, 0F);
		rightArmModel[96].rotateAngleZ = -1.57079633F;

		rightArmModel[97].addShapeBox(93.5F, -0.5F, -38F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2091
		rightArmModel[97].setRotationPoint(0F, 0F, 0F);
		rightArmModel[97].rotateAngleZ = -1.57079633F;

		rightArmModel[98].addShapeBox(93.5F, -0.5F, -16F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2092
		rightArmModel[98].setRotationPoint(0F, 0F, 0F);
		rightArmModel[98].rotateAngleZ = -1.57079633F;

		rightArmModel[99].addShapeBox(93.5F, 1.5F, -19F, 204, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2093
		rightArmModel[99].setRotationPoint(0F, 0F, 0F);
		rightArmModel[99].rotateAngleZ = -1.57079633F;

		rightArmModel[100].addShapeBox(93.5F, 1.5F, -38F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2094
		rightArmModel[100].setRotationPoint(0F, 0F, 0F);
		rightArmModel[100].rotateAngleZ = -1.57079633F;

		rightArmModel[101].addShapeBox(93.5F, 7.5F, -33F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2095
		rightArmModel[101].setRotationPoint(0F, 0F, 0F);
		rightArmModel[101].rotateAngleZ = -1.57079633F;

		rightArmModel[102].addShapeBox(93.5F, 7.5F, -25F, 204, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2096
		rightArmModel[102].setRotationPoint(0F, 0F, 0F);
		rightArmModel[102].rotateAngleZ = -1.57079633F;

		rightArmModel[103].addShapeBox(294.5F, 7.5F, -19F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2097
		rightArmModel[103].setRotationPoint(0F, 0F, 0F);
		rightArmModel[103].rotateAngleZ = -1.57079633F;

		rightArmModel[104].addShapeBox(294.5F, 7.5F, -38F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2098
		rightArmModel[104].setRotationPoint(0F, 0F, 0F);
		rightArmModel[104].rotateAngleZ = -1.57079633F;

		rightArmModel[105].addShapeBox(93.5F, 10.5F, -27F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2099
		rightArmModel[105].setRotationPoint(0F, 0F, 0F);
		rightArmModel[105].rotateAngleZ = -1.57079633F;

		rightArmModel[106].addShapeBox(93.5F, -19F, -23F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2100
		rightArmModel[106].setRotationPoint(0F, 0F, 0F);
		rightArmModel[106].rotateAngleZ = -1.57079633F;

		rightArmModel[107].addShapeBox(93.5F, -16F, -17F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2101
		rightArmModel[107].setRotationPoint(0F, 0F, 0F);
		rightArmModel[107].rotateAngleZ = -1.57079633F;

		rightArmModel[108].addShapeBox(93.5F, -19F, -15F, 204, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2102
		rightArmModel[108].setRotationPoint(0F, 0F, 0F);
		rightArmModel[108].rotateAngleZ = -1.57079633F;

		rightArmModel[109].addShapeBox(93.5F, -25F, -9F, 204, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2103
		rightArmModel[109].setRotationPoint(0F, 0F, 0F);
		rightArmModel[109].rotateAngleZ = -1.57079633F;

		rightArmModel[110].addShapeBox(93.5F, -33F, -9F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2104
		rightArmModel[110].setRotationPoint(0F, 0F, 0F);
		rightArmModel[110].rotateAngleZ = -1.57079633F;

		rightArmModel[111].addShapeBox(93.5F, -27F, -6F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2105
		rightArmModel[111].setRotationPoint(0F, 0F, 0F);
		rightArmModel[111].rotateAngleZ = -1.57079633F;

		rightArmModel[112].addShapeBox(93.5F, -38F, -15F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2106
		rightArmModel[112].setRotationPoint(0F, 0F, 0F);
		rightArmModel[112].rotateAngleZ = -1.57079633F;

		rightArmModel[113].addShapeBox(93.5F, -38F, -17F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2107
		rightArmModel[113].setRotationPoint(0F, 0F, 0F);
		rightArmModel[113].rotateAngleZ = -1.57079633F;

		rightArmModel[114].addShapeBox(93.5F, -38F, -23F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox2108
		rightArmModel[114].setRotationPoint(0F, 0F, 0F);
		rightArmModel[114].rotateAngleZ = -1.57079633F;

		rightArmModel[115].addShapeBox(93.5F, -33F, -28F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2109
		rightArmModel[115].setRotationPoint(0F, 0F, 0F);
		rightArmModel[115].rotateAngleZ = -1.57079633F;

		rightArmModel[116].addShapeBox(93.5F, -27F, -28F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2110
		rightArmModel[116].setRotationPoint(0F, 0F, 0F);
		rightArmModel[116].rotateAngleZ = -1.57079633F;

		rightArmModel[117].addShapeBox(93.5F, -25F, -28F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2111
		rightArmModel[117].setRotationPoint(0F, 0F, 0F);
		rightArmModel[117].rotateAngleZ = -1.57079633F;

		rightArmModel[118].addShapeBox(93.5F, 33F, -23F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2112
		rightArmModel[118].setRotationPoint(0F, 0F, 0F);
		rightArmModel[118].rotateAngleZ = -1.57079633F;

		rightArmModel[119].addShapeBox(93.5F, 36F, -17F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2113
		rightArmModel[119].setRotationPoint(0F, 0F, 0F);
		rightArmModel[119].rotateAngleZ = -1.57079633F;

		rightArmModel[120].addShapeBox(93.5F, 33F, -15F, 204, 5, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2114
		rightArmModel[120].setRotationPoint(0F, 0F, 0F);
		rightArmModel[120].rotateAngleZ = -1.57079633F;

		rightArmModel[121].addShapeBox(93.5F, 27F, -9F, 204, 6, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2115
		rightArmModel[121].setRotationPoint(0F, 0F, 0F);
		rightArmModel[121].rotateAngleZ = -1.57079633F;

		rightArmModel[122].addShapeBox(93.5F, 19F, -9F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2116
		rightArmModel[122].setRotationPoint(0F, 0F, 0F);
		rightArmModel[122].rotateAngleZ = -1.57079633F;

		rightArmModel[123].addShapeBox(93.5F, 25F, -6F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2117
		rightArmModel[123].setRotationPoint(0F, 0F, 0F);
		rightArmModel[123].rotateAngleZ = -1.57079633F;

		rightArmModel[124].addShapeBox(93.5F, 14F, -15F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2118
		rightArmModel[124].setRotationPoint(0F, 0F, 0F);
		rightArmModel[124].rotateAngleZ = -1.57079633F;

		rightArmModel[125].addShapeBox(93.5F, 14F, -17F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2119
		rightArmModel[125].setRotationPoint(0F, 0F, 0F);
		rightArmModel[125].rotateAngleZ = -1.57079633F;

		rightArmModel[126].addShapeBox(93.5F, 14F, -23F, 204, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox2120
		rightArmModel[126].setRotationPoint(0F, 0F, 0F);
		rightArmModel[126].rotateAngleZ = -1.57079633F;

		rightArmModel[127].addShapeBox(93.5F, 19F, -28F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2121
		rightArmModel[127].setRotationPoint(0F, 0F, 0F);
		rightArmModel[127].rotateAngleZ = -1.57079633F;

		rightArmModel[128].addShapeBox(93.5F, 25F, -28F, 204, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2122
		rightArmModel[128].setRotationPoint(0F, 0F, 0F);
		rightArmModel[128].rotateAngleZ = -1.57079633F;

		rightArmModel[129].addShapeBox(93.5F, 27F, -28F, 204, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2123
		rightArmModel[129].setRotationPoint(0F, 0F, 0F);
		rightArmModel[129].rotateAngleZ = -1.57079633F;

		rightArmModel[130].addShapeBox(294.5F, -38F, -9F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2124
		rightArmModel[130].setRotationPoint(0F, 0F, 0F);
		rightArmModel[130].rotateAngleZ = -1.57079633F;

		rightArmModel[131].addShapeBox(294.5F, -19F, -9F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2125
		rightArmModel[131].setRotationPoint(0F, 0F, 0F);
		rightArmModel[131].rotateAngleZ = -1.57079633F;

		rightArmModel[132].addShapeBox(294.5F, -19F, -28F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2126
		rightArmModel[132].setRotationPoint(0F, 0F, 0F);
		rightArmModel[132].rotateAngleZ = -1.57079633F;

		rightArmModel[133].addShapeBox(294.5F, -38F, -28F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2127
		rightArmModel[133].setRotationPoint(0F, 0F, 0F);
		rightArmModel[133].rotateAngleZ = -1.57079633F;

		rightArmModel[134].addShapeBox(294.5F, 14F, -9F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2128
		rightArmModel[134].setRotationPoint(0F, 0F, 0F);
		rightArmModel[134].rotateAngleZ = -1.57079633F;

		rightArmModel[135].addShapeBox(294.5F, 33F, -9F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2129
		rightArmModel[135].setRotationPoint(0F, 0F, 0F);
		rightArmModel[135].rotateAngleZ = -1.57079633F;

		rightArmModel[136].addShapeBox(294.5F, 33F, -28F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2130
		rightArmModel[136].setRotationPoint(0F, 0F, 0F);
		rightArmModel[136].rotateAngleZ = -1.57079633F;

		rightArmModel[137].addShapeBox(294.5F, 14F, -28F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2131
		rightArmModel[137].setRotationPoint(0F, 0F, 0F);
		rightArmModel[137].rotateAngleZ = -1.57079633F;

		rightArmModel[138].addShapeBox(296.5F, -42.5F, -4F, 1, 85, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2132
		rightArmModel[138].setRotationPoint(0F, 0F, 0F);
		rightArmModel[138].rotateAngleZ = -1.57079633F;

		rightArmModel[139].addShapeBox(296.5F, -43F, -28F, 1, 5, 24, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2133
		rightArmModel[139].setRotationPoint(0F, 0F, 0F);
		rightArmModel[139].rotateAngleZ = -1.57079633F;

		rightArmModel[140].addShapeBox(296.5F, -14F, -28F, 1, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox2134
		rightArmModel[140].setRotationPoint(0F, 0F, 0F);
		rightArmModel[140].rotateAngleZ = -1.57079633F;

		rightArmModel[141].addShapeBox(296.5F, 12F, -28F, 1, 2, 24, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2135
		rightArmModel[141].setRotationPoint(0F, 0F, 0F);
		rightArmModel[141].rotateAngleZ = -1.57079633F;

		rightArmModel[142].addShapeBox(294.5F, -11.5F, -14F, 3, 24, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2136
		rightArmModel[142].setRotationPoint(0F, 0F, 0F);
		rightArmModel[142].rotateAngleZ = -1.57079633F;

		rightArmModel[143].addShapeBox(90.5F, -38F, -28F, 3, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2140
		rightArmModel[143].setRotationPoint(0F, 0F, 0F);
		rightArmModel[143].rotateAngleZ = -1.57079633F;

		rightArmModel[144].addShapeBox(90.5F, 14F, -28F, 3, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2141
		rightArmModel[144].setRotationPoint(0F, 0F, 0F);
		rightArmModel[144].rotateAngleZ = -1.57079633F;

		rightArmModel[145].addShapeBox(90.5F, -11.5F, -38F, 3, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2142
		rightArmModel[145].setRotationPoint(0F, 0F, 0F);
		rightArmModel[145].rotateAngleZ = -1.57079633F;

		rightArmModel[146].addShapeBox(296.5F, 38F, -28F, 1, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox2143
		rightArmModel[146].setRotationPoint(0F, 0F, 0F);
		rightArmModel[146].rotateAngleZ = -1.57079633F;

		rightArmModel[147].addShapeBox(296.5F, -16.5F, -2F, 2, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox2207
		rightArmModel[147].setRotationPoint(0F, 0F, 0F);
		rightArmModel[147].rotateAngleZ = -1.57079633F;

		rightArmModel[148].addShapeBox(296.5F, -16.5F, -6F, 2, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2208
		rightArmModel[148].setRotationPoint(0F, 0F, 0F);
		rightArmModel[148].rotateAngleZ = -1.57079633F;

		rightArmModel[149].addShapeBox(296.5F, 11.5F, -6F, 2, 5, 4, 0F,0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2209
		rightArmModel[149].setRotationPoint(0F, 0F, 0F);
		rightArmModel[149].rotateAngleZ = -1.57079633F;

		rightArmModel[150].addShapeBox(-27.5F, -42.5F, -28F, 6, 85, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2210
		rightArmModel[150].setRotationPoint(0F, 0F, 0F);
		rightArmModel[150].rotateAngleZ = -1.57079633F;

		rightArmModel[151].addShapeBox(-27.5F, -43.5F, -29F, 6, 1, 26, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2211
		rightArmModel[151].setRotationPoint(0F, 0F, 0F);
		rightArmModel[151].rotateAngleZ = -1.57079633F;

		rightArmModel[152].addShapeBox(-27.5F, 42.5F, -29F, 6, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2212
		rightArmModel[152].setRotationPoint(0F, 0F, 0F);
		rightArmModel[152].rotateAngleZ = -1.57079633F;

		rightArmModel[153].addShapeBox(-27.5F, -42.5F, -36F, 6, 22, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2213
		rightArmModel[153].setRotationPoint(0F, 0F, 0F);
		rightArmModel[153].rotateAngleZ = -1.57079633F;

		rightArmModel[154].addShapeBox(-27.5F, 20.5F, -36F, 6, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2214
		rightArmModel[154].setRotationPoint(0F, 0F, 0F);
		rightArmModel[154].rotateAngleZ = -1.57079633F;

		rightArmModel[155].addShapeBox(-67.5F, -20.5F, -60F, 74, 41, 18, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2215
		rightArmModel[155].setRotationPoint(0F, 0F, 0F);
		rightArmModel[155].rotateAngleZ = -1.57079633F;

		rightArmModel[156].addShapeBox(-69.5F, -43.5F, -4F, 42, 87, 4, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Import ImportBox2216
		rightArmModel[156].setRotationPoint(0F, 0F, 0F);
		rightArmModel[156].rotateAngleZ = -1.57079633F;

		rightArmModel[157].addShapeBox(-69.5F, -46.5F, -31F, 42, 3, 31, 0F,0F, 8F, 8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 8F, -3F, 0F, -8F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Import ImportBox2217
		rightArmModel[157].setRotationPoint(0F, 0F, 0F);
		rightArmModel[157].rotateAngleZ = -1.57079633F;

		rightArmModel[158].addShapeBox(-69.5F, -43.5F, -49F, 42, 19, 21, 0F,0F, 8F, -7F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2218
		rightArmModel[158].setRotationPoint(0F, 0F, 0F);
		rightArmModel[158].rotateAngleZ = -1.57079633F;

		rightArmModel[159].addShapeBox(-69.5F, -24.5F, -49F, 42, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2219
		rightArmModel[159].setRotationPoint(0F, 0F, 0F);
		rightArmModel[159].rotateAngleZ = -1.57079633F;

		rightArmModel[160].addShapeBox(-69.5F, 20.5F, -49F, 42, 4, 21, 0F,0F, 0F, 9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2220
		rightArmModel[160].setRotationPoint(0F, 0F, 0F);
		rightArmModel[160].rotateAngleZ = -1.57079633F;

		rightArmModel[161].addShapeBox(-200.5F, -54.5F, -42F, 131, 3, 42, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2221
		rightArmModel[161].setRotationPoint(0F, 0F, 0F);
		rightArmModel[161].rotateAngleZ = -1.57079633F;

		rightArmModel[162].addShapeBox(-200.5F, 51.5F, -42F, 131, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox2222
		rightArmModel[162].setRotationPoint(0F, 0F, 0F);
		rightArmModel[162].rotateAngleZ = -1.57079633F;

		rightArmModel[163].addShapeBox(-200.5F, -51.5F, -4F, 131, 103, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2223
		rightArmModel[163].setRotationPoint(0F, 0F, 0F);
		rightArmModel[163].rotateAngleZ = -1.57079633F;

		rightArmModel[164].addShapeBox(-69.5F, 24.5F, -49F, 42, 19, 21, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 8F, 0F); // Import ImportBox2224
		rightArmModel[164].setRotationPoint(0F, 0F, 0F);
		rightArmModel[164].rotateAngleZ = -1.57079633F;

		rightArmModel[165].addShapeBox(-69.5F, 43.5F, -31F, 42, 3, 31, 0F,0F, -8F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 8F, -3F); // Import ImportBox2225
		rightArmModel[165].setRotationPoint(0F, 0F, 0F);
		rightArmModel[165].rotateAngleZ = -1.57079633F;

		rightArmModel[166].addShapeBox(-200.5F, -51.5F, -42F, 131, 27, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2226
		rightArmModel[166].setRotationPoint(0F, 0F, 0F);
		rightArmModel[166].rotateAngleZ = -1.57079633F;

		rightArmModel[167].addShapeBox(-200.5F, 24.5F, -42F, 131, 27, 38, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2227
		rightArmModel[167].setRotationPoint(0F, 0F, 0F);
		rightArmModel[167].rotateAngleZ = -1.57079633F;

		rightArmModel[168].addShapeBox(-200.5F, -24.5F, -49F, 131, 4, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2228
		rightArmModel[168].setRotationPoint(0F, 0F, 0F);
		rightArmModel[168].rotateAngleZ = -1.57079633F;

		rightArmModel[169].addShapeBox(-200.5F, -20.5F, -58F, 131, 41, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2229
		rightArmModel[169].setRotationPoint(0F, 0F, 0F);
		rightArmModel[169].rotateAngleZ = -1.57079633F;

		rightArmModel[170].addShapeBox(-202.5F, -54.5F, -42F, 2, 3, 42, 0F,0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Import ImportBox2230
		rightArmModel[170].setRotationPoint(0F, 0F, 0F);
		rightArmModel[170].rotateAngleZ = -1.57079633F;

		rightArmModel[171].addShapeBox(-202.5F, 51.5F, -42F, 2, 3, 42, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -5F); // Import ImportBox2231
		rightArmModel[171].setRotationPoint(0F, 0F, 0F);
		rightArmModel[171].rotateAngleZ = -1.57079633F;

		rightArmModel[172].addShapeBox(-202.5F, -51.5F, -3F, 2, 103, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Import ImportBox2232
		rightArmModel[172].setRotationPoint(0F, 0F, 0F);
		rightArmModel[172].rotateAngleZ = -1.57079633F;

		rightArmModel[173].addShapeBox(-202.5F, -51.5F, -42F, 2, 27, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2233
		rightArmModel[173].setRotationPoint(0F, 0F, 0F);
		rightArmModel[173].rotateAngleZ = -1.57079633F;

		rightArmModel[174].addShapeBox(-202.5F, -24.5F, -58F, 2, 4, 19, 0F,0F, -1F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2234
		rightArmModel[174].setRotationPoint(0F, 0F, 0F);
		rightArmModel[174].rotateAngleZ = -1.57079633F;

		rightArmModel[175].addShapeBox(-202.5F, -20.5F, -58F, 2, 41, 19, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2235
		rightArmModel[175].setRotationPoint(0F, 0F, 0F);
		rightArmModel[175].rotateAngleZ = -1.57079633F;

		rightArmModel[176].addShapeBox(-202.5F, 20.5F, -58F, 2, 4, 19, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2236
		rightArmModel[176].setRotationPoint(0F, 0F, 0F);
		rightArmModel[176].rotateAngleZ = -1.57079633F;

		rightArmModel[177].addShapeBox(-202.5F, 24.5F, -42F, 2, 27, 3, 0F,0F, 1F, 5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2237
		rightArmModel[177].setRotationPoint(0F, 0F, 0F);
		rightArmModel[177].rotateAngleZ = -1.57079633F;

		rightArmModel[178].addShapeBox(-202.5F, -49.5F, -39F, 2, 99, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2238
		rightArmModel[178].setRotationPoint(0F, 0F, 0F);
		rightArmModel[178].rotateAngleZ = -1.57079633F;

		rightArmModel[179].addShapeBox(-200.5F, -13.5F, 0F, 9, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2239
		rightArmModel[179].setRotationPoint(0F, 0F, 0F);
		rightArmModel[179].rotateAngleZ = -1.57079633F;

		rightArmModel[180].addShapeBox(-191.5F, -13.5F, 0F, 20, 27, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import ImportBox2240
		rightArmModel[180].setRotationPoint(0F, 0F, 0F);
		rightArmModel[180].rotateAngleZ = -1.57079633F;

		rightArmModel[181].addShapeBox(-203.5F, -13.5F, -3F, 3, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox2241
		rightArmModel[181].setRotationPoint(0F, 0F, 0F);
		rightArmModel[181].rotateAngleZ = -1.57079633F;

		rightArmModel[182].addShapeBox(-203.5F, -13.5F, -15F, 3, 27, 12, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2242
		rightArmModel[182].setRotationPoint(0F, 0F, 0F);
		rightArmModel[182].rotateAngleZ = -1.57079633F;

		rightArmModel[183].addShapeBox(-208.5F, -39.5F, -13F, 6, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2243
		rightArmModel[183].setRotationPoint(0F, 0F, 0F);
		rightArmModel[183].rotateAngleZ = -1.57079633F;

		rightArmModel[184].addShapeBox(-208.5F, -39.5F, -34F, 6, 12, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2244
		rightArmModel[184].setRotationPoint(0F, 0F, 0F);
		rightArmModel[184].rotateAngleZ = -1.57079633F;

		rightArmModel[185].addShapeBox(-208.5F, -45.5F, -28F, 6, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2245
		rightArmModel[185].setRotationPoint(0F, 0F, 0F);
		rightArmModel[185].rotateAngleZ = -1.57079633F;

		rightArmModel[186].addShapeBox(-208.5F, -45.5F, -16F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F); // Import ImportBox2246
		rightArmModel[186].setRotationPoint(0F, 0F, 0F);
		rightArmModel[186].rotateAngleZ = -1.57079633F;

		rightArmModel[187].addShapeBox(-208.5F, -45.5F, -34F, 6, 3, 6, 0F,0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2247
		rightArmModel[187].setRotationPoint(0F, 0F, 0F);
		rightArmModel[187].rotateAngleZ = -1.57079633F;

		rightArmModel[188].addShapeBox(-208.5F, -24.5F, -34F, 6, 3, 6, 0F,0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2248
		rightArmModel[188].setRotationPoint(0F, 0F, 0F);
		rightArmModel[188].rotateAngleZ = -1.57079633F;

		rightArmModel[189].addShapeBox(-208.5F, -24.5F, -16F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Import ImportBox2249
		rightArmModel[189].setRotationPoint(0F, 0F, 0F);
		rightArmModel[189].rotateAngleZ = -1.57079633F;

		rightArmModel[190].addShapeBox(-208.5F, -24.5F, -28F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2250
		rightArmModel[190].setRotationPoint(0F, 0F, 0F);
		rightArmModel[190].rotateAngleZ = -1.57079633F;

		rightArmModel[191].addShapeBox(-208.5F, 42.5F, -28F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2251
		rightArmModel[191].setRotationPoint(0F, 0F, 0F);
		rightArmModel[191].rotateAngleZ = -1.57079633F;

		rightArmModel[192].addShapeBox(-208.5F, 42.5F, -34F, 6, 3, 6, 0F,0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2252
		rightArmModel[192].setRotationPoint(0F, 0F, 0F);
		rightArmModel[192].rotateAngleZ = -1.57079633F;

		rightArmModel[193].addShapeBox(-208.5F, 27.5F, -34F, 6, 12, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2253
		rightArmModel[193].setRotationPoint(0F, 0F, 0F);
		rightArmModel[193].rotateAngleZ = -1.57079633F;

		rightArmModel[194].addShapeBox(-208.5F, 21.5F, -34F, 6, 3, 6, 0F,0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2254
		rightArmModel[194].setRotationPoint(0F, 0F, 0F);
		rightArmModel[194].rotateAngleZ = -1.57079633F;

		rightArmModel[195].addShapeBox(-208.5F, 21.5F, -28F, 6, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2255
		rightArmModel[195].setRotationPoint(0F, 0F, 0F);
		rightArmModel[195].rotateAngleZ = -1.57079633F;

		rightArmModel[196].addShapeBox(-208.5F, 21.5F, -16F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F); // Import ImportBox2256
		rightArmModel[196].setRotationPoint(0F, 0F, 0F);
		rightArmModel[196].rotateAngleZ = -1.57079633F;

		rightArmModel[197].addShapeBox(-208.5F, 27.5F, -13F, 6, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2257
		rightArmModel[197].setRotationPoint(0F, 0F, 0F);
		rightArmModel[197].rotateAngleZ = -1.57079633F;

		rightArmModel[198].addShapeBox(-208.5F, 42.5F, -16F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Import ImportBox2258
		rightArmModel[198].setRotationPoint(0F, 0F, 0F);
		rightArmModel[198].rotateAngleZ = -1.57079633F;

		rightArmModel[199].addShapeBox(-208.5F, 9F, -43F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2259
		rightArmModel[199].setRotationPoint(0F, 0F, 0F);
		rightArmModel[199].rotateAngleZ = -1.57079633F;

		rightArmModel[200].addShapeBox(-208.5F, 9F, -49F, 6, 3, 6, 0F,0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox2260
		rightArmModel[200].setRotationPoint(0F, 0F, 0F);
		rightArmModel[200].rotateAngleZ = -1.57079633F;

		rightArmModel[201].addShapeBox(-208.5F, -6F, -49F, 6, 12, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2261
		rightArmModel[201].setRotationPoint(0F, 0F, 0F);
		rightArmModel[201].rotateAngleZ = -1.57079633F;

		rightArmModel[202].addShapeBox(-208.5F, -12F, -49F, 6, 3, 6, 0F,0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2262
		rightArmModel[202].setRotationPoint(0F, 0F, 0F);
		rightArmModel[202].rotateAngleZ = -1.57079633F;

		rightArmModel[203].addShapeBox(-208.5F, -12F, -43F, 6, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2263
		rightArmModel[203].setRotationPoint(0F, 0F, 0F);
		rightArmModel[203].rotateAngleZ = -1.57079633F;

		rightArmModel[204].addShapeBox(-208.5F, -12F, -31F, 6, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F); // Import ImportBox2264
		rightArmModel[204].setRotationPoint(0F, 0F, 0F);
		rightArmModel[204].rotateAngleZ = -1.57079633F;

		rightArmModel[205].addShapeBox(-208.5F, -6F, -28F, 6, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox2265
		rightArmModel[205].setRotationPoint(0F, 0F, 0F);
		rightArmModel[205].rotateAngleZ = -1.57079633F;

		rightArmModel[206].addShapeBox(-208.5F, 9F, -31F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Import ImportBox2266
		rightArmModel[206].setRotationPoint(0F, 0F, 0F);
		rightArmModel[206].rotateAngleZ = -1.57079633F;

		rightArmModel[207].addShapeBox(234.5F, 43.5F, -29F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2267
		rightArmModel[207].setRotationPoint(0F, 0F, 0F);
		rightArmModel[207].rotateAngleZ = -1.57079633F;

		rightArmModel[208].addShapeBox(228.5F, 43.5F, -29F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2268
		rightArmModel[208].setRotationPoint(0F, 0F, 0F);
		rightArmModel[208].rotateAngleZ = -1.57079633F;

		rightArmModel[209].addShapeBox(216.5F, 43.5F, -29F, 4, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox2270
		rightArmModel[209].setRotationPoint(0F, 0F, 0F);
		rightArmModel[209].rotateAngleZ = -1.57079633F;

		rightArmModel[210].addShapeBox(216.5F, -44.5F, -29F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2271
		rightArmModel[210].setRotationPoint(0F, 0F, 0F);
		rightArmModel[210].rotateAngleZ = -1.57079633F;

		rightArmModel[211].addShapeBox(222.5F, -44.5F, -29F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2272
		rightArmModel[211].setRotationPoint(0F, 0F, 0F);
		rightArmModel[211].rotateAngleZ = -1.57079633F;

		rightArmModel[212].addShapeBox(234.5F, -44.5F, -29F, 4, 1, 27, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2273
		rightArmModel[212].setRotationPoint(0F, 0F, 0F);
		rightArmModel[212].rotateAngleZ = -1.57079633F;

		rightArmModel[213].addShapeBox(-200.5F, 20.5F, -49F, 131, 4, 45, 0F,0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2274
		rightArmModel[213].setRotationPoint(0F, 0F, 0F);
		rightArmModel[213].rotateAngleZ = -1.57079633F;

		rightArmModel[214].addShapeBox(-69.5F, -20.5F, -60F, 2, 41, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2275
		rightArmModel[214].setRotationPoint(0F, 0F, 0F);
		rightArmModel[214].rotateAngleZ = -1.57079633F;

		rightArmModel[215].addShapeBox(-27.5F, -20.5F, -42F, 6, 41, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2270
		rightArmModel[215].setRotationPoint(0F, 0F, 0F);
		rightArmModel[215].rotateAngleZ = -1.57079633F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 2700, 334, textureX, textureY); // Box 1195
		leftLegModel[1] = new ModelRendererTurbo(this, 2700, 366, textureX, textureY); // Box 1196
		leftLegModel[2] = new ModelRendererTurbo(this, 2700, 397, textureX, textureY); // Box 1197
		leftLegModel[3] = new ModelRendererTurbo(this, 2700, 429, textureX, textureY); // Box 1198
		leftLegModel[4] = new ModelRendererTurbo(this, 2700, 458, textureX, textureY); // Box 1199
		leftLegModel[5] = new ModelRendererTurbo(this, 2700, 483, textureX, textureY); // Box 1200
		leftLegModel[6] = new ModelRendererTurbo(this, 2700, 501, textureX, textureY); // Box 1201
		leftLegModel[7] = new ModelRendererTurbo(this, 2700, 578, textureX, textureY); // Box 1202
		leftLegModel[8] = new ModelRendererTurbo(this, 2700, 429, textureX, textureY); // Box 1203
		leftLegModel[9] = new ModelRendererTurbo(this, 2700, 483, textureX, textureY); // Box 1204
		leftLegModel[10] = new ModelRendererTurbo(this, 2700, 458, textureX, textureY); // Box 1205
		leftLegModel[11] = new ModelRendererTurbo(this, 2700, 649, textureX, textureY); // Box 1206
		leftLegModel[12] = new ModelRendererTurbo(this, 2700, 663, textureX, textureY); // Box 1207
		leftLegModel[13] = new ModelRendererTurbo(this, 2700, 686, textureX, textureY); // Box 1208
		leftLegModel[14] = new ModelRendererTurbo(this, 2700, 716, textureX, textureY); // Box 1211
		leftLegModel[15] = new ModelRendererTurbo(this, 2700, 738, textureX, textureY); // Box 1212
		leftLegModel[16] = new ModelRendererTurbo(this, 2700, 753, textureX, textureY); // Box 1211
		leftLegModel[17] = new ModelRendererTurbo(this, 2700, 882, textureX, textureY); // Box 1212
		leftLegModel[18] = new ModelRendererTurbo(this, 2700, 882, textureX, textureY); // Box 1213
		leftLegModel[19] = new ModelRendererTurbo(this, 2700, 933, textureX, textureY); // Box 1214
		leftLegModel[20] = new ModelRendererTurbo(this, 2700, 933, textureX, textureY); // Box 1215
		leftLegModel[21] = new ModelRendererTurbo(this, 2700, 946, textureX, textureY); // Box 1216
		leftLegModel[22] = new ModelRendererTurbo(this, 2700, 1022, textureX, textureY); // Box 1218
		leftLegModel[23] = new ModelRendererTurbo(this, 2700, 1089, textureX, textureY); // Box 1219
		leftLegModel[24] = new ModelRendererTurbo(this, 2700, 1022, textureX, textureY); // Box 1220
		leftLegModel[25] = new ModelRendererTurbo(this, 2700, 1204, textureX, textureY); // Box 1221
		leftLegModel[26] = new ModelRendererTurbo(this, 2700, 1204, textureX, textureY); // Box 1222
		leftLegModel[27] = new ModelRendererTurbo(this, 2700, 1022, textureX, textureY); // Box 1223
		leftLegModel[28] = new ModelRendererTurbo(this, 2700, 1280, textureX, textureY); // Box 1224
		leftLegModel[29] = new ModelRendererTurbo(this, 2700, 1361, textureX, textureY); // Box 1225
		leftLegModel[30] = new ModelRendererTurbo(this, 2700, 1415, textureX, textureY); // Box 1227
		leftLegModel[31] = new ModelRendererTurbo(this, 2700, 1461, textureX, textureY); // Box 1228
		leftLegModel[32] = new ModelRendererTurbo(this, 2700, 1505, textureX, textureY); // Box 1229
		leftLegModel[33] = new ModelRendererTurbo(this, 2700, 1505, textureX, textureY); // Box 1230
		leftLegModel[34] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1231
		leftLegModel[35] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1232
		leftLegModel[36] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1233
		leftLegModel[37] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1234
		leftLegModel[38] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1235
		leftLegModel[39] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1236
		leftLegModel[40] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1237
		leftLegModel[41] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1238
		leftLegModel[42] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1239
		leftLegModel[43] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1240
		leftLegModel[44] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1241
		leftLegModel[45] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1242
		leftLegModel[46] = new ModelRendererTurbo(this, 2700, 1699, textureX, textureY); // Box 1243
		leftLegModel[47] = new ModelRendererTurbo(this, 2700, 1842, textureX, textureY); // Box 1244
		leftLegModel[48] = new ModelRendererTurbo(this, 2700, 1925, textureX, textureY); // Box 1246
		leftLegModel[49] = new ModelRendererTurbo(this, 2700, 1925, textureX, textureY); // Box 1247
		leftLegModel[50] = new ModelRendererTurbo(this, 2700, 1926, textureX, textureY); // Box 1246
		leftLegModel[51] = new ModelRendererTurbo(this, 2700, 2008, textureX, textureY); // Box 1247
		leftLegModel[52] = new ModelRendererTurbo(this, 2700, 2099, textureX, textureY); // Box 1248
		leftLegModel[53] = new ModelRendererTurbo(this, 2700, 2189, textureX, textureY); // Box 1249
		leftLegModel[54] = new ModelRendererTurbo(this, 2700, 2222, textureX, textureY); // Box 1250
		leftLegModel[55] = new ModelRendererTurbo(this, 2700, 2264, textureX, textureY); // Box 1251
		leftLegModel[56] = new ModelRendererTurbo(this, 2700, 2299, textureX, textureY); // Box 1252
		leftLegModel[57] = new ModelRendererTurbo(this, 2700, 2367, textureX, textureY); // Box 1253
		leftLegModel[58] = new ModelRendererTurbo(this, 2700, 2435, textureX, textureY); // Box 1254
		leftLegModel[59] = new ModelRendererTurbo(this, 2700, 2471, textureX, textureY); // Box 1255
		leftLegModel[60] = new ModelRendererTurbo(this, 2700, 2517, textureX, textureY); // Box 1256
		leftLegModel[61] = new ModelRendererTurbo(this, 2700, 2189, textureX, textureY); // Box 1258
		leftLegModel[62] = new ModelRendererTurbo(this, 2700, 2222, textureX, textureY); // Box 1259
		leftLegModel[63] = new ModelRendererTurbo(this, 2700, 2264, textureX, textureY); // Box 1260
		leftLegModel[64] = new ModelRendererTurbo(this, 2700, 2299, textureX, textureY); // Box 1261
		leftLegModel[65] = new ModelRendererTurbo(this, 2700, 2367, textureX, textureY); // Box 1262
		leftLegModel[66] = new ModelRendererTurbo(this, 2700, 2435, textureX, textureY); // Box 1263
		leftLegModel[67] = new ModelRendererTurbo(this, 2700, 2471, textureX, textureY); // Box 1264
		leftLegModel[68] = new ModelRendererTurbo(this, 2700, 2517, textureX, textureY); // Box 1265
		leftLegModel[69] = new ModelRendererTurbo(this, 2700, 2550, textureX, textureY); // Box 1266
		leftLegModel[70] = new ModelRendererTurbo(this, 2700, 2589, textureX, textureY); // Box 1267
		leftLegModel[71] = new ModelRendererTurbo(this, 2700, 2627, textureX, textureY); // Box 1270
		leftLegModel[72] = new ModelRendererTurbo(this, 2700, 2663, textureX, textureY); // Box 1271
		leftLegModel[73] = new ModelRendererTurbo(this, 2700, 2550, textureX, textureY); // Box 1272
		leftLegModel[74] = new ModelRendererTurbo(this, 2700, 2589, textureX, textureY); // Box 1273
		leftLegModel[75] = new ModelRendererTurbo(this, 2700, 2627, textureX, textureY); // Box 1274
		leftLegModel[76] = new ModelRendererTurbo(this, 2700, 2663, textureX, textureY); // Box 1275
		leftLegModel[77] = new ModelRendererTurbo(this, 2700, 2624, textureX, textureY); // Box 1276
		leftLegModel[78] = new ModelRendererTurbo(this, 2700, 2717, textureX, textureY); // Box 1277
		leftLegModel[79] = new ModelRendererTurbo(this, 2700, 2810, textureX, textureY); // Box 1278
		leftLegModel[80] = new ModelRendererTurbo(this, 2700, 2903, textureX, textureY); // Box 1279
		leftLegModel[81] = new ModelRendererTurbo(this, 2700, 2810, textureX, textureY); // Box 1280
		leftLegModel[82] = new ModelRendererTurbo(this, 2700, 2903, textureX, textureY); // Box 1281
		leftLegModel[83] = new ModelRendererTurbo(this, 2700, 2996, textureX, textureY); // Box 1282
		leftLegModel[84] = new ModelRendererTurbo(this, 2700, 3093, textureX, textureY); // Box 1283
		leftLegModel[85] = new ModelRendererTurbo(this, 2700, 3190, textureX, textureY); // Box 1284
		leftLegModel[86] = new ModelRendererTurbo(this, 2700, 3309, textureX, textureY); // Box 1285
		leftLegModel[87] = new ModelRendererTurbo(this, 2700, 3428, textureX, textureY); // Box 1286
		leftLegModel[88] = new ModelRendererTurbo(this, 2700, 3521, textureX, textureY); // Box 1287
		leftLegModel[89] = new ModelRendererTurbo(this, 2700, 3610, textureX, textureY); // Box 1288
		leftLegModel[90] = new ModelRendererTurbo(this, 2700, 3644, textureX, textureY); // Box 1289
		leftLegModel[91] = new ModelRendererTurbo(this, 2700, 3610, textureX, textureY); // Box 1290
		leftLegModel[92] = new ModelRendererTurbo(this, 2700, 3728, textureX, textureY); // Box 1383
		leftLegModel[93] = new ModelRendererTurbo(this, 2700, 3790, textureX, textureY); // Box 1384
		leftLegModel[94] = new ModelRendererTurbo(this, 2700, 3790, textureX, textureY); // Box 1385
		leftLegModel[95] = new ModelRendererTurbo(this, 2700, 3828, textureX, textureY); // Box 1386
		leftLegModel[96] = new ModelRendererTurbo(this, 2700, 3890, textureX, textureY); // Box 1387
		leftLegModel[97] = new ModelRendererTurbo(this, 2700, 3929, textureX, textureY); // Box 1388
		leftLegModel[98] = new ModelRendererTurbo(this, 2700, 3890, textureX, textureY); // Box 1389
		leftLegModel[99] = new ModelRendererTurbo(this, 2700, 3995, textureX, textureY); // Box 1390
		leftLegModel[100] = new ModelRendererTurbo(this, 2839, 3618, textureX, textureY); // Box 1392
		leftLegModel[101] = new ModelRendererTurbo(this, 2839, 3712, textureX, textureY); // Box 1393
		leftLegModel[102] = new ModelRendererTurbo(this, 2843, 3782, textureX, textureY); // Box 1761

		leftLegModel[0].addShapeBox(0F, 0F, 0F, 60, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1195
		leftLegModel[0].setRotationPoint(-30F, -234.5F, 59F);

		leftLegModel[1].addShapeBox(0F, 0F, 0F, 60, 20, 8, 0F,-20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1196
		leftLegModel[1].setRotationPoint(-30F, -254.5F, 59F);

		leftLegModel[2].addShapeBox(0F, 0F, 0F, 60, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Box 1197
		leftLegModel[2].setRotationPoint(-30F, -214.5F, 59F);

		leftLegModel[3].addShapeBox(0F, 0F, 0F, 63, 21, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1198
		leftLegModel[3].setRotationPoint(-31.5F, -235F, 67F);

		leftLegModel[4].addShapeBox(0F, 0F, 0F, 63, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 1199
		leftLegModel[4].setRotationPoint(-31.5F, -214F, 67F);

		leftLegModel[5].addShapeBox(0F, 0F, 0F, 49, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 1200
		leftLegModel[5].setRotationPoint(-24.5F, -200F, 67F);

		leftLegModel[6].addShapeBox(0F, 0F, 0F, 63, 14, 60, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1201
		leftLegModel[6].setRotationPoint(-31.5F, -249F, 67F);

		leftLegModel[7].addShapeBox(0F, 0F, 0F, 49, 7, 60, 0F,-14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1202
		leftLegModel[7].setRotationPoint(-24.5F, -256F, 67F);

		leftLegModel[8].addShapeBox(0F, 0F, 0F, 63, 21, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1203
		leftLegModel[8].setRotationPoint(-31.5F, -235F, 122F);

		leftLegModel[9].addShapeBox(0F, 0F, 0F, 49, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 1204
		leftLegModel[9].setRotationPoint(-24.5F, -200F, 122F);

		leftLegModel[10].addShapeBox(0F, 0F, 0F, 63, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 1205
		leftLegModel[10].setRotationPoint(-31.5F, -214F, 122F);

		leftLegModel[11].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -16F, -6F, 0F, -16F, -6F, 0F); // Box 1206
		leftLegModel[11].setRotationPoint(-24.5F, -200F, 127F);

		leftLegModel[12].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 3F, 0F, -6F, 3F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -11F, -5F, 0F, -11F, -5F, 0F); // Box 1207
		leftLegModel[12].setRotationPoint(-31.5F, -214F, 127F);

		leftLegModel[13].addShapeBox(1F, 0F, 0F, 63, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F); // Box 1208
		leftLegModel[13].setRotationPoint(-32.5F, -235F, 127F);

		leftLegModel[14].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 3F, 0F, -6F, 3F, 0F); // Box 1211
		leftLegModel[14].setRotationPoint(-31.5F, -249F, 127F);

		leftLegModel[15].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,-14F, 0F, 0F, -14F, 0F, 0F, -16F, -6F, 0F, -16F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F, -4F, 5F, 0F); // Box 1212
		leftLegModel[15].setRotationPoint(-24.5F, -256F, 127F);

		leftLegModel[16].addShapeBox(0F, 0F, 0F, 11, 64, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, -3F, -5F, -3F, -3F, 0F, 0F, 0F); // Box 1211
		leftLegModel[16].setRotationPoint(20.5F, -214F, 67F);

		leftLegModel[17].addShapeBox(0F, 0F, 0F, 32, 43, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F); // Box 1212
		leftLegModel[17].setRotationPoint(-11.5F, -193F, 123F);

		leftLegModel[18].addShapeBox(0F, 0F, 0F, 32, 43, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F); // Box 1213
		leftLegModel[18].setRotationPoint(-11.5F, -193F, 67F);

		leftLegModel[19].addShapeBox(0F, 0F, 0F, 32, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1214
		leftLegModel[19].setRotationPoint(-11.5F, -199F, 67F);

		leftLegModel[20].addShapeBox(0F, 0F, 0F, 32, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1215
		leftLegModel[20].setRotationPoint(-11.5F, -199F, 123F);

		leftLegModel[21].addShapeBox(0F, 0F, 0F, 5, 21, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1216
		leftLegModel[21].setRotationPoint(26.5F, -235F, 72F);

		leftLegModel[22].addShapeBox(0F, 0F, 0F, 36, 12, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1218
		leftLegModel[22].setRotationPoint(-24.5F, -223F, 72F);

		leftLegModel[23].addShapeBox(0F, -24F, 0F, 36, 72, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 1219
		leftLegModel[23].setRotationPoint(-38.5F, -218F, 77F);
		leftLegModel[23].rotateAngleZ = -0.43633231F;

		leftLegModel[24].addShapeBox(0F, 0F, 0F, 36, 12, 51, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1220
		leftLegModel[24].setRotationPoint(-24.5F, -235F, 72F);

		leftLegModel[25].addShapeBox(0F, -24F, 0F, 36, 72, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -15F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 1221
		leftLegModel[25].setRotationPoint(-38.5F, -218F, 76F);
		leftLegModel[25].rotateAngleZ = -0.43633231F;

		leftLegModel[26].addShapeBox(0F, -24F, 0F, 36, 72, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -15F, 0F, 0F, -1F, 0F, 0F); // Box 1222
		leftLegModel[26].setRotationPoint(-38.5F, -218F, 118F);
		leftLegModel[26].rotateAngleZ = -0.43633231F;

		leftLegModel[27].addShapeBox(0F, 0F, 0F, 36, 12, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 1223
		leftLegModel[27].setRotationPoint(-24.5F, -211F, 72F);

		leftLegModel[28].addShapeBox(0F, 0F, 0F, 19, 44, 33, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 1224
		leftLegModel[28].setRotationPoint(-1.5F, -218F, 81F);

		leftLegModel[29].addShapeBox(0F, 0F, 0F, 13, 18, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 17F, 0F, 0F); // Box 1225
		leftLegModel[29].setRotationPoint(-1.5F, -174F, 81F);

		leftLegModel[30].addShapeBox(0F, 0F, 0F, 13, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 1227
		leftLegModel[30].setRotationPoint(-6.5F, -156F, 81F);

		leftLegModel[31].addShapeBox(0F, 0F, 0F, 13, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1228
		leftLegModel[31].setRotationPoint(-19.5F, -156F, 81F);

		leftLegModel[32].addShapeBox(0F, 0F, 0F, 33, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 1229
		leftLegModel[32].setRotationPoint(-37.5F, -149F, 81F);

		leftLegModel[33].addShapeBox(0F, 0F, 0F, 33, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 1230
		leftLegModel[33].setRotationPoint(-37.5F, -149F, 107F);

		leftLegModel[34].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1231
		leftLegModel[34].setRotationPoint(-36.5F, -163F, 77F);

		leftLegModel[35].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1232
		leftLegModel[35].setRotationPoint(-36.5F, -155F, 77F);

		leftLegModel[36].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 1233
		leftLegModel[36].setRotationPoint(-36.5F, -147F, 77F);

		leftLegModel[37].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 1234
		leftLegModel[37].setRotationPoint(-31.5F, -126F, 77F);

		leftLegModel[38].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1235
		leftLegModel[38].setRotationPoint(-31.5F, -142F, 77F);

		leftLegModel[39].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1236
		leftLegModel[39].setRotationPoint(-31.5F, -134F, 77F);

		leftLegModel[40].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1237
		leftLegModel[40].setRotationPoint(-33.5F, -161F, 69F);

		leftLegModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1238
		leftLegModel[41].setRotationPoint(-33.5F, -155F, 69F);

		leftLegModel[42].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1239
		leftLegModel[42].setRotationPoint(-33.5F, -149F, 69F);

		leftLegModel[43].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1240
		leftLegModel[43].setRotationPoint(-28.5F, -127F, 69F);

		leftLegModel[44].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1241
		leftLegModel[44].setRotationPoint(-28.5F, -139F, 69F);

		leftLegModel[45].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1242
		leftLegModel[45].setRotationPoint(-28.5F, -133F, 69F);

		leftLegModel[46].addShapeBox(0F, 0F, 0F, 7, 54, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1243
		leftLegModel[46].setRotationPoint(-68.5F, -186F, 56F);

		leftLegModel[47].addShapeBox(0F, 0F, 0F, 12, 8, 67, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1244
		leftLegModel[47].setRotationPoint(-68.5F, -194F, 64F);

		leftLegModel[48].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,-10F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1246
		leftLegModel[48].setRotationPoint(-68.5F, -194F, 56F);

		leftLegModel[49].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 1247
		leftLegModel[49].setRotationPoint(-68.5F, -194F, 131F);

		leftLegModel[50].addShapeBox(0F, 0F, 0F, 4, 8, 67, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1246
		leftLegModel[50].setRotationPoint(-56.5F, -194F, 64F);

		leftLegModel[51].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1247
		leftLegModel[51].setRotationPoint(-52.5F, -194F, 56F);

		leftLegModel[52].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1248
		leftLegModel[52].setRotationPoint(-52.5F, -190F, 56F);

		leftLegModel[53].addShapeBox(0F, 0F, 0F, 31, 22, 6, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1249
		leftLegModel[53].setRotationPoint(-61.5F, -186F, 125F);

		leftLegModel[54].addShapeBox(0F, 0F, 0F, 31, 32, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1250
		leftLegModel[54].setRotationPoint(-61.5F, -164F, 125F);

		leftLegModel[55].addShapeBox(0F, 0F, 0F, 28, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Box 1251
		leftLegModel[55].setRotationPoint(-58.5F, -132F, 125F);

		leftLegModel[56].addShapeBox(0F, 0F, 0F, 41, 57, 6, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1252
		leftLegModel[56].setRotationPoint(-30.5F, -164F, 125F);

		leftLegModel[57].addShapeBox(0F, 0F, 0F, 41, 57, 8, 0F,0F, 0F, 0F, 0F, -12F, 0F, -5F, -15F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -5F, -15F, 0F, 0F, -4F, 0F); // Box 1253
		leftLegModel[57].setRotationPoint(-30.5F, -164F, 131F);

		leftLegModel[58].addShapeBox(0F, 0F, 0F, 28, 25, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -22F, -4F, 0F); // Box 1254
		leftLegModel[58].setRotationPoint(-58.5F, -132F, 131F);

		leftLegModel[59].addShapeBox(0F, 0F, 0F, 31, 32, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1255
		leftLegModel[59].setRotationPoint(-61.5F, -164F, 131F);

		leftLegModel[60].addShapeBox(0F, 0F, 0F, 31, 22, 8, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1256
		leftLegModel[60].setRotationPoint(-61.5F, -186F, 131F);

		leftLegModel[61].addShapeBox(0F, 0F, 0F, 31, 22, 6, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1258
		leftLegModel[61].setRotationPoint(-61.5F, -186F, 64F);

		leftLegModel[62].addShapeBox(0F, 0F, 0F, 31, 32, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1259
		leftLegModel[62].setRotationPoint(-61.5F, -164F, 64F);

		leftLegModel[63].addShapeBox(0F, 0F, 0F, 28, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Box 1260
		leftLegModel[63].setRotationPoint(-58.5F, -132F, 64F);

		leftLegModel[64].addShapeBox(0F, 0F, 0F, 41, 57, 6, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1261
		leftLegModel[64].setRotationPoint(-30.5F, -164F, 64F);

		leftLegModel[65].addShapeBox(0F, 0F, 0F, 41, 57, 8, 0F,0F, -4F, 0F, -5F, -15F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -15F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1262
		leftLegModel[65].setRotationPoint(-30.5F, -164F, 56F);

		leftLegModel[66].addShapeBox(0F, 0F, 0F, 28, 25, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Box 1263
		leftLegModel[66].setRotationPoint(-58.5F, -132F, 56F);

		leftLegModel[67].addShapeBox(0F, 0F, 0F, 31, 32, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		leftLegModel[67].setRotationPoint(-61.5F, -164F, 56F);

		leftLegModel[68].addShapeBox(0F, 0F, 0F, 31, 22, 8, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		leftLegModel[68].setRotationPoint(-61.5F, -186F, 56F);

		leftLegModel[69].addShapeBox(0F, 0F, 0F, 28, 27, 8, 0F,0F, 0F, 0F, 0F, -26F, 0F, -4F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 1266
		leftLegModel[69].setRotationPoint(-58.5F, -130F, 131F);

		leftLegModel[70].addShapeBox(0F, 0F, 0F, 28, 27, 6, 0F,0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1267
		leftLegModel[70].setRotationPoint(-58.5F, -130F, 125F);

		leftLegModel[71].addShapeBox(0F, 0F, 0F, 28, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1270
		leftLegModel[71].setRotationPoint(-58.5F, -103F, 125F);

		leftLegModel[72].addShapeBox(0F, 0F, 0F, 28, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -22F, -4F, 0F, 0F, -4F, 0F); // Box 1271
		leftLegModel[72].setRotationPoint(-58.5F, -103F, 131F);

		leftLegModel[73].addShapeBox(0F, 0F, 0F, 28, 27, 8, 0F,0F, 0F, 0F, -4F, -22F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1272
		leftLegModel[73].setRotationPoint(-58.5F, -130F, 56F);

		leftLegModel[74].addShapeBox(0F, 0F, 0F, 28, 27, 6, 0F,0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1273
		leftLegModel[74].setRotationPoint(-58.5F, -130F, 64F);

		leftLegModel[75].addShapeBox(0F, 0F, 0F, 28, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1274
		leftLegModel[75].setRotationPoint(-58.5F, -103F, 64F);

		leftLegModel[76].addShapeBox(0F, 0F, 0F, 28, 26, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -22F, -4F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1275
		leftLegModel[76].setRotationPoint(-58.5F, -103F, 56F);

		leftLegModel[77].addShapeBox(0F, 0F, 0F, 3, 6, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1276
		leftLegModel[77].setRotationPoint(-61.5F, -130F, 56F);

		leftLegModel[78].addShapeBox(0F, 0F, 0F, 7, 6, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1277
		leftLegModel[78].setRotationPoint(-68.5F, -130F, 56F);

		leftLegModel[79].addShapeBox(0F, 0F, 0F, 7, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1278
		leftLegModel[79].setRotationPoint(-68.5F, -116F, 56F);

		leftLegModel[80].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1279
		leftLegModel[80].setRotationPoint(-61.5F, -116F, 56F);

		leftLegModel[81].addShapeBox(0F, 0F, 0F, 7, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1280
		leftLegModel[81].setRotationPoint(-68.5F, -104F, 56F);

		leftLegModel[82].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1281
		leftLegModel[82].setRotationPoint(-61.5F, -104F, 56F);

		leftLegModel[83].addShapeBox(0F, 0F, 0F, 7, 10, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1282
		leftLegModel[83].setRotationPoint(-68.5F, -91F, 56F);

		leftLegModel[84].addShapeBox(0F, 0F, 0F, 3, 10, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1283
		leftLegModel[84].setRotationPoint(-61.5F, -91F, 56F);

		leftLegModel[85].addShapeBox(0F, 0F, 0F, 3, 34, 79, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1284
		leftLegModel[85].setRotationPoint(-61.5F, -124F, 58F);

		leftLegModel[86].addShapeBox(0F, 0F, 0F, 5, 34, 79, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1285
		leftLegModel[86].setRotationPoint(-66.5F, -124F, 58F);

		leftLegModel[87].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 1286
		leftLegModel[87].setRotationPoint(-61.5F, -81F, 56F);

		leftLegModel[88].addShapeBox(0F, 0F, 0F, 7, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -16F); // Box 1287
		leftLegModel[88].setRotationPoint(-68.5F, -81F, 56F);

		leftLegModel[89].addShapeBox(0F, 0F, 0F, 30, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1288
		leftLegModel[89].setRotationPoint(-60.5F, -132F, 70F);

		leftLegModel[90].addShapeBox(0F, 0F, 0F, 4, 29, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1289
		leftLegModel[90].setRotationPoint(-60.5F, -132F, 72F);

		leftLegModel[91].addShapeBox(0F, 0F, 0F, 30, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1290
		leftLegModel[91].setRotationPoint(-60.5F, -132F, 123F);

		leftLegModel[92].addShapeBox(0F, 0.5F, 0F, 19, 27, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 1383
		leftLegModel[92].setRotationPoint(-15.5F, -142F, 80F);
		leftLegModel[92].rotateAngleZ = -0.73303829F;

		leftLegModel[93].addShapeBox(0F, -0.5F, 0F, 19, 1, 33, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1384
		leftLegModel[93].setRotationPoint(-15.5F, -142F, 80F);
		leftLegModel[93].rotateAngleZ = -0.73303829F;

		leftLegModel[94].addShapeBox(0F, 27.5F, 0F, 19, 1, 33, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, -1F); // Box 1385
		leftLegModel[94].setRotationPoint(-15.5F, -142F, 80F);
		leftLegModel[94].rotateAngleZ = -0.73303829F;

		leftLegModel[95].addShapeBox(19F, 0.5F, 0F, 28, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1386
		leftLegModel[95].setRotationPoint(-15.5F, -142F, 81F);
		leftLegModel[95].rotateAngleZ = -0.73303829F;

		leftLegModel[96].addShapeBox(20F, -0.5F, 0F, 25, 1, 33, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1387
		leftLegModel[96].setRotationPoint(-15.5F, -142F, 80F);
		leftLegModel[96].rotateAngleZ = -0.73303829F;

		leftLegModel[97].addShapeBox(20F, 0.5F, 0F, 25, 27, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1388
		leftLegModel[97].setRotationPoint(-15.5F, -142F, 80F);
		leftLegModel[97].rotateAngleZ = -0.73303829F;

		leftLegModel[98].addShapeBox(20F, 27.5F, 0F, 25, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1389
		leftLegModel[98].setRotationPoint(-15.5F, -142F, 80F);
		leftLegModel[98].rotateAngleZ = -0.73303829F;

		leftLegModel[99].addShapeBox(47F, 0.5F, 0F, 21, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F); // Box 1390
		leftLegModel[99].setRotationPoint(-15.5F, -142F, 81F);
		leftLegModel[99].rotateAngleZ = -0.73303829F;

		leftLegModel[100].addShapeBox(0F, 0F, 0F, 22, 51, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F); // Box 1392
		leftLegModel[100].setRotationPoint(-56.5F, -115F, 77F);

		leftLegModel[101].addShapeBox(0F, 0F, 0F, 39, 25, 39, 0F,0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 39F, 0F, 0F, 39F, 0F, 0F, 0F, 0F); // Box 1393
		leftLegModel[101].setRotationPoint(-34.5F, -89F, 77F);

		leftLegModel[102].addShapeBox(68F, 0.5F, 0F, 21, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F); // Box 1761
		leftLegModel[102].setRotationPoint(-15.5F, -142F, 81F);
		leftLegModel[102].rotateAngleZ = -0.73303829F;
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 2700, 334, textureX, textureY); // Box 1298
		rightLegModel[1] = new ModelRendererTurbo(this, 2700, 366, textureX, textureY); // Box 1299
		rightLegModel[2] = new ModelRendererTurbo(this, 2700, 397, textureX, textureY); // Box 1300
		rightLegModel[3] = new ModelRendererTurbo(this, 2700, 429, textureX, textureY); // Box 1301
		rightLegModel[4] = new ModelRendererTurbo(this, 2700, 458, textureX, textureY); // Box 1302
		rightLegModel[5] = new ModelRendererTurbo(this, 2700, 483, textureX, textureY); // Box 1303
		rightLegModel[6] = new ModelRendererTurbo(this, 2700, 501, textureX, textureY); // Box 1304
		rightLegModel[7] = new ModelRendererTurbo(this, 2700, 578, textureX, textureY); // Box 1305
		rightLegModel[8] = new ModelRendererTurbo(this, 2700, 429, textureX, textureY); // Box 1306
		rightLegModel[9] = new ModelRendererTurbo(this, 2700, 483, textureX, textureY); // Box 1307
		rightLegModel[10] = new ModelRendererTurbo(this, 2700, 458, textureX, textureY); // Box 1308
		rightLegModel[11] = new ModelRendererTurbo(this, 2850, 753, textureX, textureY); // Box 1309
		rightLegModel[12] = new ModelRendererTurbo(this, 2700, 882, textureX, textureY); // Box 1310
		rightLegModel[13] = new ModelRendererTurbo(this, 2700, 882, textureX, textureY); // Box 1311
		rightLegModel[14] = new ModelRendererTurbo(this, 2700, 933, textureX, textureY); // Box 1312
		rightLegModel[15] = new ModelRendererTurbo(this, 2700, 933, textureX, textureY); // Box 1313
		rightLegModel[16] = new ModelRendererTurbo(this, 2700, 946, textureX, textureY); // Box 1314
		rightLegModel[17] = new ModelRendererTurbo(this, 2700, 1022, textureX, textureY); // Box 1315
		rightLegModel[18] = new ModelRendererTurbo(this, 2700, 1089, textureX, textureY); // Box 1316
		rightLegModel[19] = new ModelRendererTurbo(this, 2700, 1022, textureX, textureY); // Box 1317
		rightLegModel[20] = new ModelRendererTurbo(this, 2700, 1204, textureX, textureY); // Box 1318
		rightLegModel[21] = new ModelRendererTurbo(this, 2700, 1022, textureX, textureY); // Box 1319
		rightLegModel[22] = new ModelRendererTurbo(this, 2700, 1280, textureX, textureY); // Box 1320
		rightLegModel[23] = new ModelRendererTurbo(this, 2700, 1361, textureX, textureY); // Box 1321
		rightLegModel[24] = new ModelRendererTurbo(this, 2700, 1415, textureX, textureY); // Box 1322
		rightLegModel[25] = new ModelRendererTurbo(this, 2700, 1461, textureX, textureY); // Box 1323
		rightLegModel[26] = new ModelRendererTurbo(this, 2700, 1505, textureX, textureY); // Box 1324
		rightLegModel[27] = new ModelRendererTurbo(this, 2700, 1505, textureX, textureY); // Box 1325
		rightLegModel[28] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1326
		rightLegModel[29] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1327
		rightLegModel[30] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1328
		rightLegModel[31] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1329
		rightLegModel[32] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1330
		rightLegModel[33] = new ModelRendererTurbo(this, 2700, 1523, textureX, textureY); // Box 1331
		rightLegModel[34] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1332
		rightLegModel[35] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1333
		rightLegModel[36] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1334
		rightLegModel[37] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1335
		rightLegModel[38] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1336
		rightLegModel[39] = new ModelRendererTurbo(this, 2700, 1579, textureX, textureY); // Box 1337
		rightLegModel[40] = new ModelRendererTurbo(this, 2700, 1699, textureX, textureY); // Box 1338
		rightLegModel[41] = new ModelRendererTurbo(this, 2700, 1842, textureX, textureY); // Box 1339
		rightLegModel[42] = new ModelRendererTurbo(this, 2700, 1925, textureX, textureY); // Box 1340
		rightLegModel[43] = new ModelRendererTurbo(this, 2700, 1925, textureX, textureY); // Box 1341
		rightLegModel[44] = new ModelRendererTurbo(this, 2700, 1926, textureX, textureY); // Box 1342
		rightLegModel[45] = new ModelRendererTurbo(this, 2700, 2008, textureX, textureY); // Box 1343
		rightLegModel[46] = new ModelRendererTurbo(this, 2700, 2099, textureX, textureY); // Box 1344
		rightLegModel[47] = new ModelRendererTurbo(this, 2700, 2264, textureX, textureY); // Box 1345
		rightLegModel[48] = new ModelRendererTurbo(this, 2700, 2299, textureX, textureY); // Box 1346
		rightLegModel[49] = new ModelRendererTurbo(this, 2700, 2367, textureX, textureY); // Box 1347
		rightLegModel[50] = new ModelRendererTurbo(this, 2700, 2435, textureX, textureY); // Box 1348
		rightLegModel[51] = new ModelRendererTurbo(this, 2700, 2471, textureX, textureY); // Box 1349
		rightLegModel[52] = new ModelRendererTurbo(this, 2700, 2517, textureX, textureY); // Box 1350
		rightLegModel[53] = new ModelRendererTurbo(this, 2700, 2264, textureX, textureY); // Box 1351
		rightLegModel[54] = new ModelRendererTurbo(this, 2700, 2299, textureX, textureY); // Box 1352
		rightLegModel[55] = new ModelRendererTurbo(this, 2700, 2367, textureX, textureY); // Box 1353
		rightLegModel[56] = new ModelRendererTurbo(this, 2700, 2435, textureX, textureY); // Box 1354
		rightLegModel[57] = new ModelRendererTurbo(this, 2700, 2471, textureX, textureY); // Box 1355
		rightLegModel[58] = new ModelRendererTurbo(this, 2700, 2517, textureX, textureY); // Box 1356
		rightLegModel[59] = new ModelRendererTurbo(this, 2700, 2627, textureX, textureY); // Box 1357
		rightLegModel[60] = new ModelRendererTurbo(this, 2700, 2663, textureX, textureY); // Box 1358
		rightLegModel[61] = new ModelRendererTurbo(this, 2700, 2627, textureX, textureY); // Box 1359
		rightLegModel[62] = new ModelRendererTurbo(this, 2700, 2663, textureX, textureY); // Box 1360
		rightLegModel[63] = new ModelRendererTurbo(this, 2700, 2624, textureX, textureY); // Box 1361
		rightLegModel[64] = new ModelRendererTurbo(this, 2700, 2717, textureX, textureY); // Box 1362
		rightLegModel[65] = new ModelRendererTurbo(this, 2700, 2810, textureX, textureY); // Box 1363
		rightLegModel[66] = new ModelRendererTurbo(this, 2700, 2903, textureX, textureY); // Box 1364
		rightLegModel[67] = new ModelRendererTurbo(this, 2700, 2810, textureX, textureY); // Box 1365
		rightLegModel[68] = new ModelRendererTurbo(this, 2700, 2903, textureX, textureY); // Box 1366
		rightLegModel[69] = new ModelRendererTurbo(this, 2700, 2996, textureX, textureY); // Box 1367
		rightLegModel[70] = new ModelRendererTurbo(this, 2700, 3190, textureX, textureY); // Box 1368
		rightLegModel[71] = new ModelRendererTurbo(this, 2700, 3309, textureX, textureY); // Box 1369
		rightLegModel[72] = new ModelRendererTurbo(this, 2700, 3428, textureX, textureY); // Box 1370
		rightLegModel[73] = new ModelRendererTurbo(this, 2700, 3521, textureX, textureY); // Box 1371
		rightLegModel[74] = new ModelRendererTurbo(this, 2700, 3610, textureX, textureY); // Box 1372
		rightLegModel[75] = new ModelRendererTurbo(this, 2700, 3644, textureX, textureY); // Box 1373
		rightLegModel[76] = new ModelRendererTurbo(this, 2700, 3610, textureX, textureY); // Box 1374
		rightLegModel[77] = new ModelRendererTurbo(this, 2700, 2550, textureX, textureY); // Box 1375
		rightLegModel[78] = new ModelRendererTurbo(this, 2700, 2589, textureX, textureY); // Box 1376
		rightLegModel[79] = new ModelRendererTurbo(this, 2700, 2550, textureX, textureY); // Box 1377
		rightLegModel[80] = new ModelRendererTurbo(this, 2700, 2589, textureX, textureY); // Box 1378
		rightLegModel[81] = new ModelRendererTurbo(this, 2700, 3093, textureX, textureY); // Box 1379
		rightLegModel[82] = new ModelRendererTurbo(this, 2700, 2222, textureX, textureY); // Box 1380
		rightLegModel[83] = new ModelRendererTurbo(this, 2700, 2222, textureX, textureY); // Box 1381
		rightLegModel[84] = new ModelRendererTurbo(this, 2700, 649, textureX, textureY); // Box 1382
		rightLegModel[85] = new ModelRendererTurbo(this, 2700, 663, textureX, textureY); // Box 1383
		rightLegModel[86] = new ModelRendererTurbo(this, 2700, 686, textureX, textureY); // Box 1384
		rightLegModel[87] = new ModelRendererTurbo(this, 2700, 716, textureX, textureY); // Box 1385
		rightLegModel[88] = new ModelRendererTurbo(this, 2700, 738, textureX, textureY); // Box 1386
		rightLegModel[89] = new ModelRendererTurbo(this, 2700, 3728, textureX, textureY); // Box 1394
		rightLegModel[90] = new ModelRendererTurbo(this, 2700, 3790, textureX, textureY); // Box 1395
		rightLegModel[91] = new ModelRendererTurbo(this, 2700, 3790, textureX, textureY); // Box 1396
		rightLegModel[92] = new ModelRendererTurbo(this, 2700, 3828, textureX, textureY); // Box 1397
		rightLegModel[93] = new ModelRendererTurbo(this, 2700, 3890, textureX, textureY); // Box 1398
		rightLegModel[94] = new ModelRendererTurbo(this, 2700, 3929, textureX, textureY); // Box 1399
		rightLegModel[95] = new ModelRendererTurbo(this, 2700, 3890, textureX, textureY); // Box 1400
		rightLegModel[96] = new ModelRendererTurbo(this, 2700, 3995, textureX, textureY); // Box 1401
		rightLegModel[97] = new ModelRendererTurbo(this, 2839, 3618, textureX, textureY); // Box 1402
		rightLegModel[98] = new ModelRendererTurbo(this, 2839, 3712, textureX, textureY); // Box 1403
		rightLegModel[99] = new ModelRendererTurbo(this, 2843, 3782, textureX, textureY); // Box 1762
		rightLegModel[100] = new ModelRendererTurbo(this, 2700, 1204, textureX, textureY); // Box 2277
		rightLegModel[101] = new ModelRendererTurbo(this, 2700, 2189, textureX, textureY); // Box 2278
		rightLegModel[102] = new ModelRendererTurbo(this, 2700, 2189, textureX, textureY); // Box 2279

		rightLegModel[0].addShapeBox(0F, 0F, 0F, 60, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1298
		rightLegModel[0].setRotationPoint(-30F, -234.5F, -67F);

		rightLegModel[1].addShapeBox(0F, 0F, 0F, 60, 20, 8, 0F,-20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1299
		rightLegModel[1].setRotationPoint(-30F, -254.5F, -67F);

		rightLegModel[2].addShapeBox(0F, 0F, 0F, 60, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Box 1300
		rightLegModel[2].setRotationPoint(-30F, -214.5F, -67F);

		rightLegModel[3].addShapeBox(0F, 0F, 0F, 63, 21, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1301
		rightLegModel[3].setRotationPoint(-31.5F, -235F, -72F);

		rightLegModel[4].addShapeBox(0F, 0F, 0F, 63, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 1302
		rightLegModel[4].setRotationPoint(-31.5F, -214F, -72F);

		rightLegModel[5].addShapeBox(0F, 0F, 0F, 49, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 1303
		rightLegModel[5].setRotationPoint(-24.5F, -200F, -72F);

		rightLegModel[6].addShapeBox(0F, 0F, 0F, 63, 14, 60, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1304
		rightLegModel[6].setRotationPoint(-31.5F, -249F, -127F);

		rightLegModel[7].addShapeBox(0F, 0F, 0F, 49, 7, 60, 0F,-14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1305
		rightLegModel[7].setRotationPoint(-24.5F, -256F, -127F);

		rightLegModel[8].addShapeBox(0F, 0F, 0F, 63, 21, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1306
		rightLegModel[8].setRotationPoint(-31.5F, -235F, -127F);

		rightLegModel[9].addShapeBox(0F, 0F, 0F, 49, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 1307
		rightLegModel[9].setRotationPoint(-24.5F, -200F, -127F);

		rightLegModel[10].addShapeBox(0F, 0F, 0F, 63, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 1308
		rightLegModel[10].setRotationPoint(-31.5F, -214F, -127F);

		rightLegModel[11].addShapeBox(0F, 0F, 0F, 11, 64, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, -3F, -5F, -3F, -3F, 0F, 0F, 0F); // Box 1309
		rightLegModel[11].setRotationPoint(20.5F, -214F, -127F);

		rightLegModel[12].addShapeBox(0F, 0F, 0F, 32, 43, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F); // Box 1310
		rightLegModel[12].setRotationPoint(-11.5F, -193F, -127F);

		rightLegModel[13].addShapeBox(0F, 0F, 0F, 32, 43, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F); // Box 1311
		rightLegModel[13].setRotationPoint(-11.5F, -193F, -71F);

		rightLegModel[14].addShapeBox(0F, 0F, 0F, 32, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1312
		rightLegModel[14].setRotationPoint(-11.5F, -199F, -71F);

		rightLegModel[15].addShapeBox(0F, 0F, 0F, 32, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1313
		rightLegModel[15].setRotationPoint(-11.5F, -199F, -127F);

		rightLegModel[16].addShapeBox(0F, 0F, 0F, 5, 21, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1314
		rightLegModel[16].setRotationPoint(26.5F, -235F, -122F);

		rightLegModel[17].addShapeBox(0F, 0F, 0F, 36, 12, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1315
		rightLegModel[17].setRotationPoint(-24.5F, -223F, -123F);

		rightLegModel[18].addShapeBox(0F, -24F, 0F, 36, 72, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 1316
		rightLegModel[18].setRotationPoint(-38.5F, -218F, -118F);
		rightLegModel[18].rotateAngleZ = -0.43633231F;

		rightLegModel[19].addShapeBox(0F, 0F, 0F, 36, 12, 51, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1317
		rightLegModel[19].setRotationPoint(-24.5F, -235F, -123F);

		rightLegModel[20].addShapeBox(0F, -24F, 0F, 36, 72, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -15F, 0F, 0F, -1F, 0F, 0F); // Box 1318
		rightLegModel[20].setRotationPoint(-38.5F, -218F, -77F);
		rightLegModel[20].rotateAngleZ = -0.43633231F;

		rightLegModel[21].addShapeBox(0F, 0F, 0F, 36, 12, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 1319
		rightLegModel[21].setRotationPoint(-24.5F, -211F, -123F);

		rightLegModel[22].addShapeBox(0F, 0F, 0F, 19, 44, 33, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 1320
		rightLegModel[22].setRotationPoint(-1.5F, -218F, -114F);

		rightLegModel[23].addShapeBox(0F, 0F, 0F, 13, 18, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 17F, 0F, 0F); // Box 1321
		rightLegModel[23].setRotationPoint(-1.5F, -174F, -114F);

		rightLegModel[24].addShapeBox(0F, 0F, 0F, 13, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		rightLegModel[24].setRotationPoint(-6.5F, -156F, -114F);

		rightLegModel[25].addShapeBox(0F, 0F, 0F, 13, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1323
		rightLegModel[25].setRotationPoint(-19.5F, -156F, -114F);

		rightLegModel[26].addShapeBox(0F, 0F, 0F, 33, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		rightLegModel[26].setRotationPoint(-37.5F, -149F, -88F);

		rightLegModel[27].addShapeBox(0F, 0F, 0F, 33, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 1325
		rightLegModel[27].setRotationPoint(-37.5F, -149F, -114F);

		rightLegModel[28].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1326
		rightLegModel[28].setRotationPoint(-36.5F, -163F, -118F);

		rightLegModel[29].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1327
		rightLegModel[29].setRotationPoint(-36.5F, -155F, -118F);

		rightLegModel[30].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 1328
		rightLegModel[30].setRotationPoint(-36.5F, -147F, -118F);

		rightLegModel[31].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 1329
		rightLegModel[31].setRotationPoint(-31.5F, -126F, -118F);

		rightLegModel[32].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1330
		rightLegModel[32].setRotationPoint(-31.5F, -142F, -118F);

		rightLegModel[33].addShapeBox(0F, 0F, 0F, 24, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1331
		rightLegModel[33].setRotationPoint(-31.5F, -134F, -118F);

		rightLegModel[34].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1332
		rightLegModel[34].setRotationPoint(-33.5F, -161F, -127F);

		rightLegModel[35].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1333
		rightLegModel[35].setRotationPoint(-33.5F, -155F, -127F);

		rightLegModel[36].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1334
		rightLegModel[36].setRotationPoint(-33.5F, -149F, -127F);

		rightLegModel[37].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1335
		rightLegModel[37].setRotationPoint(-28.5F, -127F, -127F);

		rightLegModel[38].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1336
		rightLegModel[38].setRotationPoint(-28.5F, -139F, -127F);

		rightLegModel[39].addShapeBox(0F, 0F, 0F, 18, 6, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1337
		rightLegModel[39].setRotationPoint(-28.5F, -133F, -127F);

		rightLegModel[40].addShapeBox(0F, 0F, 0F, 7, 54, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1338
		rightLegModel[40].setRotationPoint(-68.5F, -186F, -139F);

		rightLegModel[41].addShapeBox(0F, 0F, 0F, 12, 8, 67, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1339
		rightLegModel[41].setRotationPoint(-68.5F, -194F, -131F);

		rightLegModel[42].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 1340
		rightLegModel[42].setRotationPoint(-68.5F, -194F, -64F);

		rightLegModel[43].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,-10F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1341
		rightLegModel[43].setRotationPoint(-68.5F, -194F, -139F);

		rightLegModel[44].addShapeBox(0F, 0F, 0F, 4, 8, 67, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1342
		rightLegModel[44].setRotationPoint(-56.5F, -194F, -131F);

		rightLegModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1343
		rightLegModel[45].setRotationPoint(-52.5F, -194F, -139F);

		rightLegModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1344
		rightLegModel[46].setRotationPoint(-52.5F, -190F, -139F);

		rightLegModel[47].addShapeBox(0F, 0F, 0F, 28, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Box 1345
		rightLegModel[47].setRotationPoint(-58.5F, -132F, -131F);

		rightLegModel[48].addShapeBox(0F, 0F, 0F, 41, 57, 6, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1346
		rightLegModel[48].setRotationPoint(-30.5F, -164F, -131F);

		rightLegModel[49].addShapeBox(0F, 0F, 0F, 41, 57, 8, 0F,0F, -4F, 0F, -5F, -15F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -15F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1347
		rightLegModel[49].setRotationPoint(-30.5F, -164F, -139F);

		rightLegModel[50].addShapeBox(0F, 0F, 0F, 28, 25, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Box 1348
		rightLegModel[50].setRotationPoint(-58.5F, -132F, -139F);

		rightLegModel[51].addShapeBox(0F, 0F, 0F, 31, 32, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1349
		rightLegModel[51].setRotationPoint(-61.5F, -164F, -139F);

		rightLegModel[52].addShapeBox(0F, 0F, 0F, 31, 22, 8, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1350
		rightLegModel[52].setRotationPoint(-61.5F, -186F, -139F);

		rightLegModel[53].addShapeBox(0F, 0F, 0F, 28, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Box 1351
		rightLegModel[53].setRotationPoint(-58.5F, -132F, -70F);

		rightLegModel[54].addShapeBox(0F, 0F, 0F, 41, 57, 6, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1352
		rightLegModel[54].setRotationPoint(-30.5F, -164F, -70F);

		rightLegModel[55].addShapeBox(0F, 0F, 0F, 41, 57, 8, 0F,0F, 0F, 0F, 0F, -12F, 0F, -5F, -15F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -5F, -15F, 0F, 0F, -4F, 0F); // Box 1353
		rightLegModel[55].setRotationPoint(-30.5F, -164F, -64F);

		rightLegModel[56].addShapeBox(0F, 0F, 0F, 28, 25, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -22F, -4F, 0F); // Box 1354
		rightLegModel[56].setRotationPoint(-58.5F, -132F, -64F);

		rightLegModel[57].addShapeBox(0F, 0F, 0F, 31, 32, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		rightLegModel[57].setRotationPoint(-61.5F, -164F, -64F);

		rightLegModel[58].addShapeBox(0F, 0F, 0F, 31, 22, 8, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1356
		rightLegModel[58].setRotationPoint(-61.5F, -186F, -64F);

		rightLegModel[59].addShapeBox(0F, 0F, 0F, 28, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		rightLegModel[59].setRotationPoint(-58.5F, -103F, -131F);

		rightLegModel[60].addShapeBox(0F, 0F, 0F, 28, 26, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -22F, -4F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		rightLegModel[60].setRotationPoint(-58.5F, -103F, -139F);

		rightLegModel[61].addShapeBox(0F, 0F, 0F, 28, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 1359
		rightLegModel[61].setRotationPoint(-58.5F, -103F, -70F);

		rightLegModel[62].addShapeBox(0F, 0F, 0F, 28, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -22F, -4F, 0F, 0F, -4F, 0F); // Box 1360
		rightLegModel[62].setRotationPoint(-58.5F, -103F, -64F);

		rightLegModel[63].addShapeBox(0F, 0F, 0F, 3, 6, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1361
		rightLegModel[63].setRotationPoint(-61.5F, -130F, -139F);

		rightLegModel[64].addShapeBox(0F, 0F, 0F, 7, 6, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1362
		rightLegModel[64].setRotationPoint(-68.5F, -130F, -139F);

		rightLegModel[65].addShapeBox(0F, 0F, 0F, 7, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1363
		rightLegModel[65].setRotationPoint(-68.5F, -116F, -139F);

		rightLegModel[66].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1364
		rightLegModel[66].setRotationPoint(-61.5F, -116F, -139F);

		rightLegModel[67].addShapeBox(0F, 0F, 0F, 7, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1365
		rightLegModel[67].setRotationPoint(-68.5F, -104F, -139F);

		rightLegModel[68].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1366
		rightLegModel[68].setRotationPoint(-61.5F, -104F, -139F);

		rightLegModel[69].addShapeBox(0F, 0F, 0F, 7, 10, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1367
		rightLegModel[69].setRotationPoint(-68.5F, -91F, -139F);

		rightLegModel[70].addShapeBox(0F, 0F, 0F, 3, 34, 79, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1368
		rightLegModel[70].setRotationPoint(-61.5F, -124F, -137F);

		rightLegModel[71].addShapeBox(0F, 0F, 0F, 5, 34, 79, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1369
		rightLegModel[71].setRotationPoint(-66.5F, -124F, -137F);

		rightLegModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 1370
		rightLegModel[72].setRotationPoint(-61.5F, -81F, -139F);

		rightLegModel[73].addShapeBox(0F, 0F, 0F, 7, 4, 83, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -16F); // Box 1371
		rightLegModel[73].setRotationPoint(-68.5F, -81F, -139F);

		rightLegModel[74].addShapeBox(0F, 0F, 0F, 28, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1372
		rightLegModel[74].setRotationPoint(-61.5F, -132F, -72F);

		rightLegModel[75].addShapeBox(0F, 0F, 0F, 2, 29, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1373
		rightLegModel[75].setRotationPoint(-61.5F, -132F, -123F);

		rightLegModel[76].addShapeBox(0F, 0F, 0F, 28, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1374
		rightLegModel[76].setRotationPoint(-61.5F, -132F, -125F);

		rightLegModel[77].addShapeBox(0F, 0F, 0F, 28, 27, 8, 0F,0F, 0F, 0F, -4F, -22F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1375
		rightLegModel[77].setRotationPoint(-58.5F, -130F, -139F);

		rightLegModel[78].addShapeBox(0F, 0F, 0F, 28, 27, 6, 0F,0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1376
		rightLegModel[78].setRotationPoint(-58.5F, -130F, -131F);

		rightLegModel[79].addShapeBox(0F, 0F, 0F, 28, 27, 8, 0F,0F, 0F, 0F, 0F, -26F, 0F, -4F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 1377
		rightLegModel[79].setRotationPoint(-58.5F, -130F, -64F);

		rightLegModel[80].addShapeBox(0F, 0F, 0F, 28, 27, 6, 0F,0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1378
		rightLegModel[80].setRotationPoint(-58.5F, -130F, -70F);

		rightLegModel[81].addShapeBox(0F, 0F, 0F, 3, 10, 83, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1379
		rightLegModel[81].setRotationPoint(-61.5F, -91F, -139F);

		rightLegModel[82].addShapeBox(0F, 0F, 0F, 31, 32, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1380
		rightLegModel[82].setRotationPoint(-61.5F, -164F, -131F);

		rightLegModel[83].addShapeBox(0F, 0F, 0F, 31, 32, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1381
		rightLegModel[83].setRotationPoint(-61.5F, -164F, -70F);

		rightLegModel[84].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,-4F, 5F, 0F, -4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -6F, 0F, -16F, -6F, 0F, -14F, 0F, 0F, -14F, 0F, 0F); // Box 1382
		rightLegModel[84].setRotationPoint(-24.5F, -200F, -131F);

		rightLegModel[85].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,-6F, 3F, 0F, -6F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 1383
		rightLegModel[85].setRotationPoint(-31.5F, -214F, -131F);

		rightLegModel[86].addShapeBox(1F, 0F, 0F, 63, 21, 4, 0F,-6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1384
		rightLegModel[86].setRotationPoint(-32.5F, -235F, -131F);

		rightLegModel[87].addShapeBox(0F, 0F, 0F, 63, 14, 4, 0F,-11F, -5F, 0F, -11F, -5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 3F, 0F, -6F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1385
		rightLegModel[87].setRotationPoint(-31.5F, -249F, -131F);

		rightLegModel[88].addShapeBox(0F, 0F, 0F, 49, 7, 4, 0F,-16F, -6F, 0F, -16F, -6F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1386
		rightLegModel[88].setRotationPoint(-24.5F, -256F, -131F);

		rightLegModel[89].addShapeBox(0F, 0.5F, 0F, 19, 27, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 1394
		rightLegModel[89].setRotationPoint(-15.5F, -142F, -113F);
		rightLegModel[89].rotateAngleZ = -0.73303829F;

		rightLegModel[90].addShapeBox(0F, -0.5F, 0F, 19, 1, 33, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1395
		rightLegModel[90].setRotationPoint(-15.5F, -142F, -113F);
		rightLegModel[90].rotateAngleZ = -0.73303829F;

		rightLegModel[91].addShapeBox(0F, 27.5F, 0F, 19, 1, 33, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, -1F); // Box 1396
		rightLegModel[91].setRotationPoint(-15.5F, -142F, -113F);
		rightLegModel[91].rotateAngleZ = -0.73303829F;

		rightLegModel[92].addShapeBox(19F, 0.5F, 0F, 28, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1397
		rightLegModel[92].setRotationPoint(-15.5F, -142F, -112F);
		rightLegModel[92].rotateAngleZ = -0.73303829F;

		rightLegModel[93].addShapeBox(20F, -0.5F, 0F, 25, 1, 33, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1398
		rightLegModel[93].setRotationPoint(-15.5F, -142F, -113F);
		rightLegModel[93].rotateAngleZ = -0.73303829F;

		rightLegModel[94].addShapeBox(20F, 0.5F, 0F, 25, 27, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1399
		rightLegModel[94].setRotationPoint(-15.5F, -142F, -113F);
		rightLegModel[94].rotateAngleZ = -0.73303829F;

		rightLegModel[95].addShapeBox(20F, 27.5F, 0F, 25, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1400
		rightLegModel[95].setRotationPoint(-15.5F, -142F, -113F);
		rightLegModel[95].rotateAngleZ = -0.73303829F;

		rightLegModel[96].addShapeBox(47F, 0.5F, 0F, 21, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0F, 0F); // Box 1401
		rightLegModel[96].setRotationPoint(-15.5F, -142F, -112F);
		rightLegModel[96].rotateAngleZ = -0.73303829F;

		rightLegModel[97].addShapeBox(0F, 0F, 0F, 22, 51, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F); // Box 1402
		rightLegModel[97].setRotationPoint(-56.5F, -115F, -116F);

		rightLegModel[98].addShapeBox(0F, 0F, 0F, 39, 25, 39, 0F,0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 39F, 0F, 0F, 39F, 0F, 0F, 0F, 0F); // Box 1403
		rightLegModel[98].setRotationPoint(-34.5F, -89F, -116F);

		rightLegModel[99].addShapeBox(68F, 0.5F, 0F, 21, 27, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F); // Box 1762
		rightLegModel[99].setRotationPoint(-15.5F, -142F, -112F);
		rightLegModel[99].rotateAngleZ = -0.73303829F;

		rightLegModel[100].addShapeBox(0F, -24F, 0F, 36, 72, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -15F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 2277
		rightLegModel[100].setRotationPoint(-38.5F, -218F, -119F);
		rightLegModel[100].rotateAngleZ = -0.43633231F;

		rightLegModel[101].addShapeBox(0F, 0F, 0F, 31, 22, 6, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2278
		rightLegModel[101].setRotationPoint(-61.5F, -186F, -131F);

		rightLegModel[102].addShapeBox(0F, 0F, 0F, 31, 22, 6, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2279
		rightLegModel[102].setRotationPoint(-61.5F, -186F, -70F);
	}
	private void initleftFootModel_1()
	{
		leftFootModel[0] = new ModelRendererTurbo(this, 3000, 0, textureX, textureY); // Box 1403
		leftFootModel[1] = new ModelRendererTurbo(this, 3000, 50, textureX, textureY); // Box 1405
		leftFootModel[2] = new ModelRendererTurbo(this, 3000, 110, textureX, textureY); // Box 1406
		leftFootModel[3] = new ModelRendererTurbo(this, 3000, 177, textureX, textureY); // Box 1407
		leftFootModel[4] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1408
		leftFootModel[5] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1409
		leftFootModel[6] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1409
		leftFootModel[7] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1410
		leftFootModel[8] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1411
		leftFootModel[9] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1412
		leftFootModel[10] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1413
		leftFootModel[11] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1414
		leftFootModel[12] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1415
		leftFootModel[13] = new ModelRendererTurbo(this, 3000, 397, textureX, textureY); // Box 1416
		leftFootModel[14] = new ModelRendererTurbo(this, 3000, 0, textureX, textureY); // Box 1431
		leftFootModel[15] = new ModelRendererTurbo(this, 3000, 50, textureX, textureY); // Box 1432
		leftFootModel[16] = new ModelRendererTurbo(this, 3000, 110, textureX, textureY); // Box 1433
		leftFootModel[17] = new ModelRendererTurbo(this, 3000, 177, textureX, textureY); // Box 1434
		leftFootModel[18] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1435
		leftFootModel[19] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1436
		leftFootModel[20] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1437
		leftFootModel[21] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1438
		leftFootModel[22] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1439
		leftFootModel[23] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1440
		leftFootModel[24] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1441
		leftFootModel[25] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1442
		leftFootModel[26] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1443
		leftFootModel[27] = new ModelRendererTurbo(this, 3000, 397, textureX, textureY); // Box 1444
		leftFootModel[28] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1459
		leftFootModel[29] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1461
		leftFootModel[30] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1463
		leftFootModel[31] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1464
		leftFootModel[32] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1465
		leftFootModel[33] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1466
		leftFootModel[34] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1467
		leftFootModel[35] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1468
		leftFootModel[36] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1469
		leftFootModel[37] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1470
		leftFootModel[38] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1480
		leftFootModel[39] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1481
		leftFootModel[40] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1482
		leftFootModel[41] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1483
		leftFootModel[42] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1485
		leftFootModel[43] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1486
		leftFootModel[44] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1487
		leftFootModel[45] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1488
		leftFootModel[46] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1490
		leftFootModel[47] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1500
		leftFootModel[48] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1501
		leftFootModel[49] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1502
		leftFootModel[50] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1503
		leftFootModel[51] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1504
		leftFootModel[52] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1505
		leftFootModel[53] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1506
		leftFootModel[54] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1507
		leftFootModel[55] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1508
		leftFootModel[56] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1518
		leftFootModel[57] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1519
		leftFootModel[58] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1520
		leftFootModel[59] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1521
		leftFootModel[60] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1522
		leftFootModel[61] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1523
		leftFootModel[62] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1524
		leftFootModel[63] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1525
		leftFootModel[64] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1526
		leftFootModel[65] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1545
		leftFootModel[66] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1547
		leftFootModel[67] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1548
		leftFootModel[68] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1549
		leftFootModel[69] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1550
		leftFootModel[70] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1551
		leftFootModel[71] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1552
		leftFootModel[72] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1553
		leftFootModel[73] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1554
		leftFootModel[74] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1564
		leftFootModel[75] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1565
		leftFootModel[76] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1566
		leftFootModel[77] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1567
		leftFootModel[78] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1568
		leftFootModel[79] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1569
		leftFootModel[80] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1570
		leftFootModel[81] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1571
		leftFootModel[82] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1572
		leftFootModel[83] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1578
		leftFootModel[84] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1579
		leftFootModel[85] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1580
		leftFootModel[86] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1581
		leftFootModel[87] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1582
		leftFootModel[88] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1583
		leftFootModel[89] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1584
		leftFootModel[90] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1585
		leftFootModel[91] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1586
		leftFootModel[92] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1596
		leftFootModel[93] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1597
		leftFootModel[94] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1598
		leftFootModel[95] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1599
		leftFootModel[96] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1600
		leftFootModel[97] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1601
		leftFootModel[98] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1602
		leftFootModel[99] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1603
		leftFootModel[100] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1604
		leftFootModel[101] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1620
		leftFootModel[102] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1621
		leftFootModel[103] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1622
		leftFootModel[104] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1623
		leftFootModel[105] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1624
		leftFootModel[106] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1625
		leftFootModel[107] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1626
		leftFootModel[108] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1627
		leftFootModel[109] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1628
		leftFootModel[110] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1631
		leftFootModel[111] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1633
		leftFootModel[112] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1634
		leftFootModel[113] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1635
		leftFootModel[114] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1636
		leftFootModel[115] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1638
		leftFootModel[116] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1639
		leftFootModel[117] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1640
		leftFootModel[118] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1641
		leftFootModel[119] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1642
		leftFootModel[120] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1643
		leftFootModel[121] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1644
		leftFootModel[122] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1645
		leftFootModel[123] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1646
		leftFootModel[124] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1647
		leftFootModel[125] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1648
		leftFootModel[126] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1649
		leftFootModel[127] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1650
		leftFootModel[128] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1669
		leftFootModel[129] = new ModelRendererTurbo(this, 3000, 416, textureX, textureY); // Box 1671
		leftFootModel[130] = new ModelRendererTurbo(this, 3000, 514, textureX, textureY); // Box 1672
		leftFootModel[131] = new ModelRendererTurbo(this, 3000, 613, textureX, textureY); // Box 1673
		leftFootModel[132] = new ModelRendererTurbo(this, 3000, 703, textureX, textureY); // Box 1674
		leftFootModel[133] = new ModelRendererTurbo(this, 3000, 792, textureX, textureY); // Box 1675
		leftFootModel[134] = new ModelRendererTurbo(this, 3000, 928, textureX, textureY); // Box 1676
		leftFootModel[135] = new ModelRendererTurbo(this, 3000, 1063, textureX, textureY); // Box 1677
		leftFootModel[136] = new ModelRendererTurbo(this, 3000, 1189, textureX, textureY); // Box 1678
		leftFootModel[137] = new ModelRendererTurbo(this, 3000, 1298, textureX, textureY); // Box 1679
		leftFootModel[138] = new ModelRendererTurbo(this, 3000, 1377, textureX, textureY); // Box 1680
		leftFootModel[139] = new ModelRendererTurbo(this, 3000, 1454, textureX, textureY); // Box 1681
		leftFootModel[140] = new ModelRendererTurbo(this, 3000, 1455, textureX, textureY); // Box 1682
		leftFootModel[141] = new ModelRendererTurbo(this, 3000, 1579, textureX, textureY); // Box 1683
		leftFootModel[142] = new ModelRendererTurbo(this, 3000, 1701, textureX, textureY); // Box 1684
		leftFootModel[143] = new ModelRendererTurbo(this, 3000, 1820, textureX, textureY); // Box 1685
		leftFootModel[144] = new ModelRendererTurbo(this, 3000, 1928, textureX, textureY); // Box 1686
		leftFootModel[145] = new ModelRendererTurbo(this, 3000, 2005, textureX, textureY); // Box 1699
		leftFootModel[146] = new ModelRendererTurbo(this, 3000, 2130, textureX, textureY); // Box 1700
		leftFootModel[147] = new ModelRendererTurbo(this, 3000, 2243, textureX, textureY); // Box 1701
		leftFootModel[148] = new ModelRendererTurbo(this, 3000, 2243, textureX, textureY); // Box 1702
		leftFootModel[149] = new ModelRendererTurbo(this, 3000, 2247, textureX, textureY); // Box 1703
		leftFootModel[150] = new ModelRendererTurbo(this, 3000, 2367, textureX, textureY); // Box 1704
		leftFootModel[151] = new ModelRendererTurbo(this, 3000, 2488, textureX, textureY); // Box 1705
		leftFootModel[152] = new ModelRendererTurbo(this, 3000, 2609, textureX, textureY); // Box 1706
		leftFootModel[153] = new ModelRendererTurbo(this, 3000, 2730, textureX, textureY); // Box 1707
		leftFootModel[154] = new ModelRendererTurbo(this, 3000, 2847, textureX, textureY); // Box 1708
		leftFootModel[155] = new ModelRendererTurbo(this, 3000, 2860, textureX, textureY); // Box 1709
		leftFootModel[156] = new ModelRendererTurbo(this, 3000, 2875, textureX, textureY); // Box 1710
		leftFootModel[157] = new ModelRendererTurbo(this, 3000, 2888, textureX, textureY); // Box 1711
		leftFootModel[158] = new ModelRendererTurbo(this, 3000, 2901, textureX, textureY); // Box 1712
		leftFootModel[159] = new ModelRendererTurbo(this, 3000, 2915, textureX, textureY); // Box 1713
		leftFootModel[160] = new ModelRendererTurbo(this, 3000, 2847, textureX, textureY); // Box 1714
		leftFootModel[161] = new ModelRendererTurbo(this, 3000, 2860, textureX, textureY); // Box 1715
		leftFootModel[162] = new ModelRendererTurbo(this, 3000, 2875, textureX, textureY); // Box 1716
		leftFootModel[163] = new ModelRendererTurbo(this, 3000, 2888, textureX, textureY); // Box 1717
		leftFootModel[164] = new ModelRendererTurbo(this, 3000, 2901, textureX, textureY); // Box 1718
		leftFootModel[165] = new ModelRendererTurbo(this, 3000, 2915, textureX, textureY); // Box 1719
		leftFootModel[166] = new ModelRendererTurbo(this, 3000, 2924, textureX, textureY); // Box 1720
		leftFootModel[167] = new ModelRendererTurbo(this, 3000, 2942, textureX, textureY); // Box 1721
		leftFootModel[168] = new ModelRendererTurbo(this, 3000, 2942, textureX, textureY); // Box 1722
		leftFootModel[169] = new ModelRendererTurbo(this, 3000, 2924, textureX, textureY); // Box 1723
		leftFootModel[170] = new ModelRendererTurbo(this, 3000, 2922, textureX, textureY); // Box 1724
		leftFootModel[171] = new ModelRendererTurbo(this, 3000, 3038, textureX, textureY); // Box 1725
		leftFootModel[172] = new ModelRendererTurbo(this, 3000, 3102, textureX, textureY); // Box 1726
		leftFootModel[173] = new ModelRendererTurbo(this, 3000, 3168, textureX, textureY); // Box 1727
		leftFootModel[174] = new ModelRendererTurbo(this, 3000, 3233, textureX, textureY); // Box 1757
		leftFootModel[175] = new ModelRendererTurbo(this, 3000, 3346, textureX, textureY); // Box 1758
		leftFootModel[176] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1770
		leftFootModel[177] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1771
		leftFootModel[178] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1772
		leftFootModel[179] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1773
		leftFootModel[180] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1774
		leftFootModel[181] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1775
		leftFootModel[182] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1776
		leftFootModel[183] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1777
		leftFootModel[184] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1778
		leftFootModel[185] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1779
		leftFootModel[186] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1780
		leftFootModel[187] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1781
		leftFootModel[188] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1782
		leftFootModel[189] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1783
		leftFootModel[190] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1784
		leftFootModel[191] = new ModelRendererTurbo(this, 3000, 3495, textureX, textureY); // Box 1800
		leftFootModel[192] = new ModelRendererTurbo(this, 3000, 3563, textureX, textureY); // Box 1801
		leftFootModel[193] = new ModelRendererTurbo(this, 3000, 3632, textureX, textureY); // Box 1803

		leftFootModel[0].addShapeBox(0F, 0F, 0F, 5, 26, 21, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F); // Box 1403
		leftFootModel[0].setRotationPoint(-32.5F, -72F, 55F);

		leftFootModel[1].addShapeBox(0F, 0F, 0F, 6, 34, 21, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 1405
		leftFootModel[1].setRotationPoint(-27.5F, -76F, 55F);

		leftFootModel[2].addShapeBox(0F, 0F, 0F, 12, 43, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1406
		leftFootModel[2].setRotationPoint(-21.5F, -79F, 55F);

		leftFootModel[3].addShapeBox(0F, 0F, 0F, 10, 51, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 1407
		leftFootModel[3].setRotationPoint(-9.5F, -82F, 55F);

		leftFootModel[4].addShapeBox(0F, 0F, 0F, 13, 7, 21, 0F,0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1408
		leftFootModel[4].setRotationPoint(0.5F, -88F, 55F);

		leftFootModel[5].addShapeBox(0F, 0F, 0F, 13, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 1409
		leftFootModel[5].setRotationPoint(0.5F, -81F, 54F);

		leftFootModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 1F, 1.5F, 0F, 1F, 0F, -1F, 0F, 0F); // Box 1409
		leftFootModel[6].setRotationPoint(4.5F, -78F, 53F);

		leftFootModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 24, 0F,-1F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 1F, 0F, -3F, 0F, 1F, 0F, 1F, 1.5F, 0F, 1F, 0F, -3F, 0F, 0F); // Box 1410
		leftFootModel[7].setRotationPoint(4.5F, -74F, 52F);

		leftFootModel[8].addShapeBox(0F, 0F, 0F, 6, 5, 25, 0F,0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, -1F, 0F, 0F); // Box 1411
		leftFootModel[8].setRotationPoint(7.5F, -68F, 51F);

		leftFootModel[9].addShapeBox(0F, 0F, 0F, 5, 14, 26, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1412
		leftFootModel[9].setRotationPoint(8.5F, -62F, 50F);

		leftFootModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1413
		leftFootModel[10].setRotationPoint(8.5F, -48F, 50F);

		leftFootModel[11].addShapeBox(0F, 0F, 0F, 8, 5, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1414
		leftFootModel[11].setRotationPoint(5.5F, -43F, 50F);

		leftFootModel[12].addShapeBox(0F, 0F, 0F, 10, 7, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 1415
		leftFootModel[12].setRotationPoint(3.5F, -38F, 50F);

		leftFootModel[13].addShapeBox(0F, -1F, 0F, 10, 49, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1416
		leftFootModel[13].setRotationPoint(0.5F, -81F, 55F);

		leftFootModel[14].addShapeBox(0F, 0F, 0F, 5, 26, 21, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F); // Box 1431
		leftFootModel[14].setRotationPoint(-32.5F, -72F, 117F);

		leftFootModel[15].addShapeBox(0F, 0F, 0F, 6, 34, 21, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 1432
		leftFootModel[15].setRotationPoint(-27.5F, -76F, 117F);

		leftFootModel[16].addShapeBox(0F, 0F, 0F, 12, 43, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1433
		leftFootModel[16].setRotationPoint(-21.5F, -79F, 117F);

		leftFootModel[17].addShapeBox(0F, 0F, 0F, 10, 51, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 1434
		leftFootModel[17].setRotationPoint(-9.5F, -82F, 117F);

		leftFootModel[18].addShapeBox(0F, 0F, 0F, 13, 7, 21, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1435
		leftFootModel[18].setRotationPoint(0.5F, -88F, 117F);

		leftFootModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -4F, 0F, 1F); // Box 1436
		leftFootModel[19].setRotationPoint(0.5F, -81F, 117F);

		leftFootModel[20].addShapeBox(0F, 0F, 0F, 9, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, -1F, 0F, 1F); // Box 1437
		leftFootModel[20].setRotationPoint(4.5F, -78F, 117F);

		leftFootModel[21].addShapeBox(0F, 0F, 0F, 9, 5, 24, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 1F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, -3F, 0F, 1F); // Box 1438
		leftFootModel[21].setRotationPoint(4.5F, -74F, 117F);

		leftFootModel[22].addShapeBox(0F, 0F, 0F, 6, 5, 25, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -1F, 0F, 1F); // Box 1439
		leftFootModel[22].setRotationPoint(7.5F, -68F, 117F);

		leftFootModel[23].addShapeBox(0F, 0F, 0F, 5, 14, 26, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1440
		leftFootModel[23].setRotationPoint(8.5F, -62F, 117F);

		leftFootModel[24].addShapeBox(0F, 0F, 0F, 5, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1441
		leftFootModel[24].setRotationPoint(8.5F, -48F, 117F);

		leftFootModel[25].addShapeBox(0F, 0F, 0F, 8, 5, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1442
		leftFootModel[25].setRotationPoint(5.5F, -43F, 117F);

		leftFootModel[26].addShapeBox(0F, 0F, 0F, 10, 7, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 1443
		leftFootModel[26].setRotationPoint(3.5F, -38F, 117F);

		leftFootModel[27].addShapeBox(0F, 0F, 0F, 10, 49, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1444
		leftFootModel[27].setRotationPoint(0.5F, -81F, 136F);

		leftFootModel[28].addShapeBox(0F, 0F, 0F, 16, 43, 93, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1459
		leftFootModel[28].setRotationPoint(13.5F, -62F, 50F);

		leftFootModel[29].addShapeBox(0F, 0F, 0F, 10, 40, 93, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1461
		leftFootModel[29].setRotationPoint(29.5F, -59F, 50F);

		leftFootModel[30].addShapeBox(0F, 0F, 0F, 10, 38, 93, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1463
		leftFootModel[30].setRotationPoint(39.5F, -57F, 50F);

		leftFootModel[31].addShapeBox(0F, 0F, 0F, 11, 36, 93, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1464
		leftFootModel[31].setRotationPoint(49.5F, -55F, 50F);

		leftFootModel[32].addShapeBox(0F, 0F, 0F, 10, 33, 93, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1465
		leftFootModel[32].setRotationPoint(60.5F, -52F, 50F);

		leftFootModel[33].addShapeBox(0F, 0F, 0F, 11, 29, 91, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1466
		leftFootModel[33].setRotationPoint(70.5F, -48F, 51F);

		leftFootModel[34].addShapeBox(0F, 0F, 0F, 10, 24, 89, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1467
		leftFootModel[34].setRotationPoint(81.5F, -43F, 52F);

		leftFootModel[35].addShapeBox(0F, 0F, 0F, 10, 19, 87, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1468
		leftFootModel[35].setRotationPoint(91.5F, -38F, 53F);

		leftFootModel[36].addShapeBox(0F, 0F, 0F, 10, 14, 85, 0F,0F, 0F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 1469
		leftFootModel[36].setRotationPoint(101.5F, -33F, 54F);

		leftFootModel[37].addShapeBox(0F, 0F, 0F, 10, 8, 82, 0F,0F, 0F, 0F, 4F, -6F, -2F, 4F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 1470
		leftFootModel[37].setRotationPoint(111.5F, -27F, 55.5F);

		leftFootModel[38].addShapeBox(0F, 0F, 0F, 16, 6, 93, 0F,0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1480
		leftFootModel[38].setRotationPoint(13.5F, -68F, 50F);

		leftFootModel[39].addShapeBox(0F, 0F, 0F, 20, 6, 93, 0F,0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1481
		leftFootModel[39].setRotationPoint(29.5F, -65F, 50F);

		leftFootModel[40].addShapeBox(0F, 0F, 0F, 11, 6, 93, 0F,0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1482
		leftFootModel[40].setRotationPoint(49.5F, -61F, 50F);

		leftFootModel[41].addShapeBox(0F, 0F, 0F, 10, 5, 93, 0F,0F, 0F, -0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 1483
		leftFootModel[41].setRotationPoint(60.5F, -57F, 50F);

		leftFootModel[42].addShapeBox(0F, 0F, 0F, 11, 5, 91, 0F,0F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1485
		leftFootModel[42].setRotationPoint(70.5F, -53F, 51F);

		leftFootModel[43].addShapeBox(0F, 0F, 0F, 10, 4, 89, 0F,0F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1486
		leftFootModel[43].setRotationPoint(81.5F, -47F, 52F);

		leftFootModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 87, 0F,0F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1487
		leftFootModel[44].setRotationPoint(91.5F, -41F, 53F);

		leftFootModel[45].addShapeBox(0F, 0F, 0F, 10, 2, 85, 0F,0F, 0F, -0.5F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 6F, -1.5F, 0F, 6F, -1.5F, 0F, 0F, 0F); // Box 1488
		leftFootModel[45].setRotationPoint(101.5F, -35F, 54F);

		leftFootModel[46].addShapeBox(0F, 0F, 0F, 14, 1, 82, 0F,0F, 0F, -0.5F, 2F, -6F, -3F, 2F, -6F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, 0F); // Box 1490
		leftFootModel[46].setRotationPoint(111.5F, -28F, 55.5F);

		leftFootModel[47].addShapeBox(0F, 0F, 0F, 16, 6, 92, 0F,0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1500
		leftFootModel[47].setRotationPoint(13.5F, -74F, 50.5F);

		leftFootModel[48].addShapeBox(0F, 0F, 0F, 20, 6, 92, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1501
		leftFootModel[48].setRotationPoint(29.5F, -71F, 50.5F);

		leftFootModel[49].addShapeBox(0F, 0F, 0F, 11, 6, 92, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1502
		leftFootModel[49].setRotationPoint(49.5F, -67F, 50.5F);

		leftFootModel[50].addShapeBox(0F, 0F, 0F, 10, 6, 92, 0F,0F, 0F, -1F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 1503
		leftFootModel[50].setRotationPoint(60.5F, -63F, 50.5F);

		leftFootModel[51].addShapeBox(0F, 0F, 0F, 11, 6, 90, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 1504
		leftFootModel[51].setRotationPoint(70.5F, -59F, 51.5F);

		leftFootModel[52].addShapeBox(0F, 0F, 0F, 10, 5, 88, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 1505
		leftFootModel[52].setRotationPoint(81.5F, -52F, 52.5F);

		leftFootModel[53].addShapeBox(0F, 0F, 0F, 10, 4, 86, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 1506
		leftFootModel[53].setRotationPoint(91.5F, -45F, 53.5F);

		leftFootModel[54].addShapeBox(0F, 0F, 0F, 10, 3, 84, 0F,0F, 0F, -1F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1507
		leftFootModel[54].setRotationPoint(101.5F, -38F, 54.5F);

		leftFootModel[55].addShapeBox(0F, 0F, 0F, 14, 3, 81, 0F,0F, 0F, -1F, 3F, -8F, -4F, 3F, -8F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 6F, -2.5F, 2F, 6F, -2.5F, 0F, 0F, 0F); // Box 1508
		leftFootModel[55].setRotationPoint(111.5F, -31F, 56F);

		leftFootModel[56].addShapeBox(0F, 0F, 0F, 16, 4, 90, 0F,0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1518
		leftFootModel[56].setRotationPoint(13.5F, -78F, 51.5F);

		leftFootModel[57].addShapeBox(0F, 0F, 0F, 20, 4, 90, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1519
		leftFootModel[57].setRotationPoint(29.5F, -75F, 51.5F);

		leftFootModel[58].addShapeBox(0F, 0F, 0F, 11, 4, 90, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1520
		leftFootModel[58].setRotationPoint(49.5F, -71F, 51.5F);

		leftFootModel[59].addShapeBox(0F, 0F, 0F, 10, 4, 90, 0F,0F, 0F, -1F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 1521
		leftFootModel[59].setRotationPoint(60.5F, -67F, 51.5F);

		leftFootModel[60].addShapeBox(0F, 0F, 0F, 11, 3, 88, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1522
		leftFootModel[60].setRotationPoint(70.5F, -62F, 52.5F);

		leftFootModel[61].addShapeBox(0F, 0F, 0F, 10, 3, 86, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1523
		leftFootModel[61].setRotationPoint(81.5F, -55F, 53.5F);

		leftFootModel[62].addShapeBox(0F, 0F, 0F, 10, 3, 84, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1524
		leftFootModel[62].setRotationPoint(91.5F, -48F, 54.5F);

		leftFootModel[63].addShapeBox(0F, 0F, 0F, 10, 3, 82, 0F,0F, 0F, -1F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1525
		leftFootModel[63].setRotationPoint(101.5F, -41F, 55.5F);

		leftFootModel[64].addShapeBox(0F, 0F, 0F, 16, 3, 82, 0F,0F, 0F, -2.5F, 2F, -10F, -6F, 2F, -10F, -6F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 1F, 8F, -4.5F, 1F, 8F, -4.5F, 0F, 0F, -1.5F); // Box 1526
		leftFootModel[64].setRotationPoint(111.5F, -34F, 55.5F);

		leftFootModel[65].addShapeBox(0F, 0F, 0F, 16, 3, 88, 0F,0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1545
		leftFootModel[65].setRotationPoint(13.5F, -81F, 52.5F);

		leftFootModel[66].addShapeBox(0F, 0F, 0F, 20, 3, 88, 0F,0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1547
		leftFootModel[66].setRotationPoint(29.5F, -78F, 52.5F);

		leftFootModel[67].addShapeBox(0F, 0F, 0F, 11, 3, 88, 0F,0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1548
		leftFootModel[67].setRotationPoint(49.5F, -74F, 52.5F);

		leftFootModel[68].addShapeBox(0F, 0F, 0F, 10, 3, 88, 0F,0F, 0F, -1.5F, 0F, -5F, -2.5F, 0F, -5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1549
		leftFootModel[68].setRotationPoint(60.5F, -70F, 52.5F);

		leftFootModel[69].addShapeBox(0F, 0F, 0F, 11, 3, 86, 0F,0F, 0F, -1.5F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1550
		leftFootModel[69].setRotationPoint(70.5F, -65F, 53.5F);

		leftFootModel[70].addShapeBox(0F, 0F, 0F, 10, 3, 84, 0F,0F, 0F, -1.5F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1551
		leftFootModel[70].setRotationPoint(81.5F, -58F, 54.5F);

		leftFootModel[71].addShapeBox(0F, 0F, 0F, 10, 3, 82, 0F,0F, 0F, -1.5F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1552
		leftFootModel[71].setRotationPoint(91.5F, -51F, 55.5F);

		leftFootModel[72].addShapeBox(0F, 0F, 0F, 10, 3, 80, 0F,0F, 0F, -1.5F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1553
		leftFootModel[72].setRotationPoint(101.5F, -44F, 56.5F);

		leftFootModel[73].addShapeBox(0F, 0F, 0F, 18, 3, 77, 0F,0F, 0F, -1.5F, 3F, -10F, -6F, 3F, -10F, -6F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 10F, -3.5F, 0F, 10F, -3.5F, 0F, 0F, 0F); // Box 1554
		leftFootModel[73].setRotationPoint(111.5F, -37F, 58F);

		leftFootModel[74].addShapeBox(0F, 0F, 0F, 16, 7, 85, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1564
		leftFootModel[74].setRotationPoint(13.5F, -88F, 54F);

		leftFootModel[75].addShapeBox(0F, 0F, 0F, 20, 7, 85, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1565
		leftFootModel[75].setRotationPoint(29.5F, -85F, 54F);

		leftFootModel[76].addShapeBox(0F, 0F, 0F, 11, 7, 85, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1566
		leftFootModel[76].setRotationPoint(49.5F, -81F, 54F);

		leftFootModel[77].addShapeBox(0F, 0F, 0F, 10, 7, 85, 0F,0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1567
		leftFootModel[77].setRotationPoint(60.5F, -77F, 54F);

		leftFootModel[78].addShapeBox(0F, 0F, 0F, 11, 7, 83, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1568
		leftFootModel[78].setRotationPoint(70.5F, -72F, 55F);

		leftFootModel[79].addShapeBox(0F, 0F, 0F, 10, 7, 81, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1569
		leftFootModel[79].setRotationPoint(81.5F, -65F, 56F);

		leftFootModel[80].addShapeBox(0F, 0F, 0F, 10, 7, 79, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1570
		leftFootModel[80].setRotationPoint(91.5F, -58F, 57F);

		leftFootModel[81].addShapeBox(0F, 0F, 0F, 10, 7, 77, 0F,0F, 0F, -4F, 0F, -7F, -5.5F, 0F, -7F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1571
		leftFootModel[81].setRotationPoint(101.5F, -51F, 58F);

		leftFootModel[82].addShapeBox(0F, 0F, 0F, 21, 7, 74, 0F,0F, 0F, -4F, 4F, -13F, -8.5F, 4F, -13F, -8.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 10F, -4.5F, 0F, 10F, -4.5F, 0F, 0F, 0F); // Box 1572
		leftFootModel[82].setRotationPoint(111.5F, -44F, 59.5F);

		leftFootModel[83].addShapeBox(0F, 0F, 0F, 16, 7, 77, 0F,-8F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, -8F, -3F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1578
		leftFootModel[83].setRotationPoint(13.5F, -95F, 58F);

		leftFootModel[84].addShapeBox(0F, 0F, 0F, 20, 7, 77, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1579
		leftFootModel[84].setRotationPoint(29.5F, -92F, 58F);

		leftFootModel[85].addShapeBox(0F, 0F, 0F, 11, 7, 77, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1580
		leftFootModel[85].setRotationPoint(49.5F, -88F, 58F);

		leftFootModel[86].addShapeBox(0F, 0F, 0F, 10, 7, 77, 0F,0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1581
		leftFootModel[86].setRotationPoint(60.5F, -84F, 58F);

		leftFootModel[87].addShapeBox(0F, 0F, 0F, 11, 7, 75, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1582
		leftFootModel[87].setRotationPoint(70.5F, -79F, 59F);

		leftFootModel[88].addShapeBox(0F, 0F, 0F, 10, 7, 73, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1583
		leftFootModel[88].setRotationPoint(81.5F, -72F, 60F);

		leftFootModel[89].addShapeBox(0F, 0F, 0F, 10, 7, 71, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1584
		leftFootModel[89].setRotationPoint(91.5F, -65F, 61F);

		leftFootModel[90].addShapeBox(0F, 0F, 0F, 10, 7, 69, 0F,0F, 0F, -4F, 0F, -7F, -5.5F, 0F, -7F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1585
		leftFootModel[90].setRotationPoint(101.5F, -58F, 62F);

		leftFootModel[91].addShapeBox(0F, 0F, 0F, 25, 7, 66, 0F,0F, 0F, -4F, 3F, -17F, -8.5F, 3F, -17F, -8.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 13F, -4.5F, 0F, 13F, -4.5F, 0F, 0F, 0F); // Box 1586
		leftFootModel[91].setRotationPoint(111.5F, -51F, 63.5F);

		leftFootModel[92].addShapeBox(0F, 0F, 0F, 8, 7, 69, 0F,-9F, 0F, -6F, 2F, 0F, -6F, 2F, 0F, -6F, -9F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1596
		leftFootModel[92].setRotationPoint(21.5F, -99F, 62F);

		leftFootModel[93].addShapeBox(0F, 0F, 0F, 20, 7, 69, 0F,-2F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1597
		leftFootModel[93].setRotationPoint(29.5F, -99F, 62F);

		leftFootModel[94].addShapeBox(0F, 0F, 0F, 11, 7, 69, 0F,0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1598
		leftFootModel[94].setRotationPoint(49.5F, -95F, 62F);

		leftFootModel[95].addShapeBox(0F, 0F, 0F, 10, 7, 69, 0F,0F, 0F, -6F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1599
		leftFootModel[95].setRotationPoint(60.5F, -91F, 62F);

		leftFootModel[96].addShapeBox(0F, 0F, 0F, 11, 7, 67, 0F,0F, 0F, -6F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1600
		leftFootModel[96].setRotationPoint(70.5F, -86F, 63F);

		leftFootModel[97].addShapeBox(0F, 0F, 0F, 10, 7, 65, 0F,0F, 0F, -6F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1601
		leftFootModel[97].setRotationPoint(81.5F, -79F, 64F);

		leftFootModel[98].addShapeBox(0F, 0F, 0F, 10, 7, 63, 0F,0F, 0F, -6F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1602
		leftFootModel[98].setRotationPoint(91.5F, -72F, 65F);

		leftFootModel[99].addShapeBox(0F, 0F, 0F, 10, 7, 61, 0F,0F, 0F, -6F, 0F, -7F, -7.5F, 0F, -7F, -7.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1603
		leftFootModel[99].setRotationPoint(101.5F, -65F, 66F);

		leftFootModel[100].addShapeBox(0F, 0F, 0F, 28, 7, 59, 0F,0F, 0F, -6.5F, 3F, -21F, -9F, 3F, -21F, -9F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 17F, -5F, 0F, 17F, -5F, 0F, 0F, -0.5F); // Box 1604
		leftFootModel[100].setRotationPoint(111.5F, -58F, 67F);

		leftFootModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 57, 0F,-6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1620
		leftFootModel[101].setRotationPoint(30.5F, -104F, 68F);

		leftFootModel[102].addShapeBox(0F, 0F, 0F, 18, 5, 57, 0F,-6F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1621
		leftFootModel[102].setRotationPoint(31.5F, -104F, 68F);

		leftFootModel[103].addShapeBox(0F, 0F, 0F, 11, 5, 57, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1622
		leftFootModel[103].setRotationPoint(49.5F, -100F, 68F);

		leftFootModel[104].addShapeBox(0F, 0F, 0F, 10, 5, 57, 0F,0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1623
		leftFootModel[104].setRotationPoint(60.5F, -96F, 68F);

		leftFootModel[105].addShapeBox(0F, 0F, 0F, 11, 5, 55, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1624
		leftFootModel[105].setRotationPoint(70.5F, -91F, 69F);

		leftFootModel[106].addShapeBox(0F, 0F, 0F, 10, 5, 53, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1625
		leftFootModel[106].setRotationPoint(81.5F, -84F, 70F);

		leftFootModel[107].addShapeBox(0F, 0F, 0F, 10, 5, 51, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1626
		leftFootModel[107].setRotationPoint(91.5F, -77F, 71F);

		leftFootModel[108].addShapeBox(0F, 0F, 0F, 10, 5, 49, 0F,0F, 0F, -4F, 0F, -7F, -5.5F, 0F, -7F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1627
		leftFootModel[108].setRotationPoint(101.5F, -70F, 72F);

		leftFootModel[109].addShapeBox(0F, 0F, 0F, 31, 5, 46, 0F,0F, 0F, -4F, 2F, -24F, -7.5F, 2F, -24F, -7.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 21F, -2.5F, 0F, 21F, -2.5F, 0F, 0F, 0F); // Box 1628
		leftFootModel[109].setRotationPoint(111.5F, -63F, 73.5F);

		leftFootModel[110].addShapeBox(0F, 0F, 0F, 1, 7, 24, 0F,-6F, -1F, -10F, 6F, -1F, -10F, 6F, 1F, 0.5F, -6F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1631
		leftFootModel[110].setRotationPoint(36.5F, -111F, 72F);

		leftFootModel[111].addShapeBox(0F, 0F, 0F, 12, 7, 24, 0F,-6F, -1F, -10F, 0F, -2.5F, -10F, 0F, -1F, 0.5F, -6F, 1F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 1633
		leftFootModel[111].setRotationPoint(37.5F, -111F, 72F);

		leftFootModel[112].addShapeBox(0F, 0F, 0F, 11, 7, 24, 0F,0F, 1.5F, -10F, 0F, -2F, -10F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 1634
		leftFootModel[112].setRotationPoint(49.5F, -107F, 72F);

		leftFootModel[113].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F,0F, 2F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 0.5F, 0F, 0F, 0.5F); // Box 1635
		leftFootModel[113].setRotationPoint(60.5F, -103F, 72F);

		leftFootModel[114].addShapeBox(0F, 0F, 0F, 11, 7, 23, 0F,0F, 3F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1636
		leftFootModel[114].setRotationPoint(70.5F, -98F, 73F);

		leftFootModel[115].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 5F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1638
		leftFootModel[115].setRotationPoint(81.5F, -91F, 74F);

		leftFootModel[116].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 5F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1639
		leftFootModel[116].setRotationPoint(91.5F, -84F, 75F);

		leftFootModel[117].addShapeBox(0F, 0F, 0F, 10, 7, 20, 0F,0F, 5F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1640
		leftFootModel[117].setRotationPoint(101.5F, -77F, 76F);

		leftFootModel[118].addShapeBox(0F, 0F, 0F, 33, 7, 19, 0F,0F, 5F, -10F, 1F, -30F, -11F, 1.5F, -29.5F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 24F, -4F, 0F, 24F, 0.5F, 0F, 0F, 0.5F); // Box 1641
		leftFootModel[118].setRotationPoint(111.5F, -70F, 77F);

		leftFootModel[119].addShapeBox(0F, 0F, 0F, 33, 7, 19, 0F,0F, 7F, 0.5F, 1.5F, -29.5F, 0.5F, 1F, -30F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 24F, 0.5F, 0F, 24F, -4F, 0F, 0F, 0F); // Box 1642
		leftFootModel[119].setRotationPoint(111.5F, -70F, 97F);

		leftFootModel[120].addShapeBox(0F, 0F, 0F, 10, 7, 20, 0F,0F, 7F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1643
		leftFootModel[120].setRotationPoint(101.5F, -77F, 97F);

		leftFootModel[121].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 7F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1644
		leftFootModel[121].setRotationPoint(91.5F, -84F, 97F);

		leftFootModel[122].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 7F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1645
		leftFootModel[122].setRotationPoint(81.5F, -91F, 97F);

		leftFootModel[123].addShapeBox(0F, 0F, 0F, 11, 7, 23, 0F,0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 3F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1646
		leftFootModel[123].setRotationPoint(70.5F, -98F, 97F);

		leftFootModel[124].addShapeBox(0F, 0F, 0F, 12, 7, 24, 0F,-6F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -2.5F, -10F, -6F, -1F, -10F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1647
		leftFootModel[124].setRotationPoint(37.5F, -111F, 97F);

		leftFootModel[125].addShapeBox(0F, 0F, 0F, 11, 7, 24, 0F,0F, 3F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -10F, 0F, 1.5F, -10F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1648
		leftFootModel[125].setRotationPoint(49.5F, -107F, 97F);

		leftFootModel[126].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F,0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 2F, -10F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1649
		leftFootModel[126].setRotationPoint(60.5F, -103F, 97F);

		leftFootModel[127].addShapeBox(0F, 0F, 0F, 1, 7, 24, 0F,-6F, 1F, 0.5F, 6F, 1F, 0.5F, 6F, -1F, -10F, -6F, -1F, -10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1650
		leftFootModel[127].setRotationPoint(36.5F, -111F, 97F);

		leftFootModel[128].addShapeBox(0F, 0F, 0F, 15, 12, 93, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 1669
		leftFootModel[128].setRotationPoint(-1.5F, -31F, 50F);

		leftFootModel[129].addShapeBox(0F, 0F, 0F, 47, 1, 93, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1671
		leftFootModel[129].setRotationPoint(13.5F, -19F, 50F);

		leftFootModel[130].addShapeBox(0F, 0F, 0F, 41, 1, 93, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 1672
		leftFootModel[130].setRotationPoint(60.5F, -19F, 50F);

		leftFootModel[131].addShapeBox(0F, 0F, 0F, 10, 1, 85, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 1673
		leftFootModel[131].setRotationPoint(101.5F, -19F, 54F);

		leftFootModel[132].addShapeBox(0F, 0F, 0F, 10, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 1674
		leftFootModel[132].setRotationPoint(111.5F, -19F, 55.5F);

		leftFootModel[133].addShapeBox(0F, 0F, 0F, 37, 15, 115, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 1675
		leftFootModel[133].setRotationPoint(18.5F, -14F, 39F);

		leftFootModel[134].addShapeBox(0F, 0F, 0F, 30, 15, 115, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1676
		leftFootModel[134].setRotationPoint(55.5F, -14F, 39F);

		leftFootModel[135].addShapeBox(0F, 0F, 0F, 30, 13, 109, 0F,0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1677
		leftFootModel[135].setRotationPoint(85.5F, -12F, 42F);

		leftFootModel[136].addShapeBox(0F, 0F, 0F, 35, 11, 95, 0F,0F, 0F, 0F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 1678
		leftFootModel[136].setRotationPoint(115.5F, -10F, 49F);

		leftFootModel[137].addShapeBox(0F, 0F, 0F, 2, 5, 71, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 1679
		leftFootModel[137].setRotationPoint(150.5F, -4F, 61F);

		leftFootModel[138].addShapeBox(0F, 0F, 0F, 49, 11, 59, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1680
		leftFootModel[138].setRotationPoint(136.5F, -10F, 67F);

		leftFootModel[139].addShapeBox(0F, 0F, 0F, 4, 6, 45, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1681
		leftFootModel[139].setRotationPoint(185.5F, -5F, 74F);

		leftFootModel[140].addShapeBox(0F, 0F, 0F, 37, 4, 115, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1682
		leftFootModel[140].setRotationPoint(18.5F, -18F, 39F);

		leftFootModel[141].addShapeBox(0F, 0F, 0F, 30, 4, 115, 0F,0F, 0F, -12F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 1683
		leftFootModel[141].setRotationPoint(55.5F, -18F, 39F);

		leftFootModel[142].addShapeBox(0F, 0F, 0F, 30, 6, 109, 0F,0F, 0F, -12F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 0F); // Box 1684
		leftFootModel[142].setRotationPoint(85.5F, -18F, 42F);

		leftFootModel[143].addShapeBox(0F, 0F, 0F, 35, 8, 95, 0F,0F, 0F, -12F, 0F, -12F, -23F, 0F, -12F, -23F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 6F, -12F, 0F, 6F, -12F, 0F, 0F, 0F); // Box 1685
		leftFootModel[143].setRotationPoint(115.5F, -18F, 49F);

		leftFootModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 71, 0F,0F, 0F, -11F, -1F, -1F, -11F, -1F, -1F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 1686
		leftFootModel[144].setRotationPoint(150.5F, -6F, 61F);

		leftFootModel[145].addShapeBox(0F, 0F, 0F, 82, 7, 109, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 1699
		leftFootModel[145].setRotationPoint(-61.5F, -7F, 42F);

		leftFootModel[146].addShapeBox(0F, 0F, 0F, 57, 1, 109, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1700
		leftFootModel[146].setRotationPoint(-36.5F, 0F, 42F);

		leftFootModel[147].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1701
		leftFootModel[147].setRotationPoint(-53.5F, 0F, 42F);

		leftFootModel[148].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1702
		leftFootModel[148].setRotationPoint(-53.5F, 0F, 141F);

		leftFootModel[149].addShapeBox(0F, 0F, 0F, 77, 7, 109, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1703
		leftFootModel[149].setRotationPoint(-61.5F, -14F, 42F);

		leftFootModel[150].addShapeBox(0F, 0F, 0F, 71, 7, 109, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1704
		leftFootModel[150].setRotationPoint(-61.5F, -21F, 42F);

		leftFootModel[151].addShapeBox(0F, 0F, 0F, 64, 7, 109, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1705
		leftFootModel[151].setRotationPoint(-61.5F, -28F, 42F);

		leftFootModel[152].addShapeBox(0F, 0F, 0F, 55, 7, 109, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1706
		leftFootModel[152].setRotationPoint(-61.5F, -35F, 42F);

		leftFootModel[153].addShapeBox(0F, 0F, 0F, 41, 5, 109, 0F,-5F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1707
		leftFootModel[153].setRotationPoint(-61.5F, -40F, 42F);

		leftFootModel[154].addShapeBox(0F, 0F, 0F, 82, 7, 3, 0F,-3F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 1708
		leftFootModel[154].setRotationPoint(-61.5F, -7F, 39F);

		leftFootModel[155].addShapeBox(0F, 0F, 0F, 77, 7, 3, 0F,-3F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1709
		leftFootModel[155].setRotationPoint(-61.5F, -14F, 39F);

		leftFootModel[156].addShapeBox(0F, 0F, 0F, 71, 7, 3, 0F,-3F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1710
		leftFootModel[156].setRotationPoint(-61.5F, -21F, 39F);

		leftFootModel[157].addShapeBox(0F, 0F, 0F, 64, 7, 3, 0F,-3F, 0F, 0F, -12F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1711
		leftFootModel[157].setRotationPoint(-61.5F, -28F, 39F);

		leftFootModel[158].addShapeBox(0F, 0F, 0F, 55, 7, 3, 0F,-3F, 0F, 0F, -17F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1712
		leftFootModel[158].setRotationPoint(-61.5F, -35F, 39F);

		leftFootModel[159].addShapeBox(0F, 0F, 0F, 41, 5, 3, 0F,-8F, -3F, 0F, -24F, -3F, 0F, -21F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1713
		leftFootModel[159].setRotationPoint(-61.5F, -40F, 39F);

		leftFootModel[160].addShapeBox(0F, 0F, 0F, 82, 7, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -8F, -3F, 0F); // Box 1714
		leftFootModel[160].setRotationPoint(-61.5F, -7F, 151F);

		leftFootModel[161].addShapeBox(0F, 0F, 0F, 77, 7, 3, 0F,0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1715
		leftFootModel[161].setRotationPoint(-61.5F, -14F, 151F);

		leftFootModel[162].addShapeBox(0F, 0F, 0F, 71, 7, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1716
		leftFootModel[162].setRotationPoint(-61.5F, -21F, 151F);

		leftFootModel[163].addShapeBox(0F, 0F, 0F, 64, 7, 3, 0F,0F, 0F, 0F, -9F, 0F, 0F, -12F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1717
		leftFootModel[163].setRotationPoint(-61.5F, -28F, 151F);

		leftFootModel[164].addShapeBox(0F, 0F, 0F, 55, 7, 3, 0F,0F, 0F, 0F, -14F, 0F, 0F, -17F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1718
		leftFootModel[164].setRotationPoint(-61.5F, -35F, 151F);

		leftFootModel[165].addShapeBox(0F, 0F, 0F, 41, 5, 3, 0F,-5F, 0F, 0F, -21F, 0F, 0F, -24F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1719
		leftFootModel[165].setRotationPoint(-61.5F, -40F, 151F);

		leftFootModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 1720
		leftFootModel[166].setRotationPoint(-62.5F, -7F, 141F);

		leftFootModel[167].addShapeBox(0F, 0F, 0F, 1, 24, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1721
		leftFootModel[167].setRotationPoint(-62.5F, -31F, 126F);

		leftFootModel[168].addShapeBox(0F, 0F, 0F, 1, 24, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 1722
		leftFootModel[168].setRotationPoint(-62.5F, -31F, 42F);

		leftFootModel[169].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 1723
		leftFootModel[169].setRotationPoint(-62.5F, -7F, 42F);

		leftFootModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 109, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1724
		leftFootModel[170].setRotationPoint(-62.5F, -35F, 42F);

		leftFootModel[171].addShapeBox(0F, 0F, 0F, 1, 14, 47, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 1725
		leftFootModel[171].setRotationPoint(-62.5F, -21F, 73F);

		leftFootModel[172].addShapeBox(0F, 0F, 0F, 1, 8, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 4F, 9F, 0F, 4F, 9F, 0F, 4F, -9F, 0F, 4F); // Box 1726
		leftFootModel[172].setRotationPoint(-62.5F, -7F, 70F);

		leftFootModel[173].addShapeBox(0F, 0F, 0F, 8, 1, 61, 0F,1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1727
		leftFootModel[173].setRotationPoint(-53.5F, 0F, 66F);

		leftFootModel[174].addShapeBox(0F, 0F, 0F, 63, 46, 61, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1757
		leftFootModel[174].setRotationPoint(-29.5F, -46F, 66F);

		leftFootModel[175].addShapeBox(0F, 0F, 0F, 30, 6, 61, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1758
		leftFootModel[175].setRotationPoint(-29.5F, -52F, 66F);

		leftFootModel[176].addShapeBox(0F, 0F, 0F, 19, 11, 59, 0F,-10F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, -10F, 0F, -4F, 3F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 3F, 0F, 0F); // Box 1770
		leftFootModel[176].setRotationPoint(130.5F, -22F, 67F);

		leftFootModel[177].addShapeBox(0F, 0F, 0F, 23, 9, 51, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -6F, 0F, 2F, -6F, 0F, 0F, 2F); // Box 1771
		leftFootModel[177].setRotationPoint(149.5F, -17F, 71F);

		leftFootModel[178].addShapeBox(0F, 0F, 0F, 14, 5, 37, 0F,0F, 0F, 0F, 0F, -4F, -15F, 0F, -4F, -15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -14F, 0F, 1F, -14F, 0F, 0F, 1F); // Box 1772
		leftFootModel[178].setRotationPoint(172.5F, -11F, 78F);

		leftFootModel[179].addShapeBox(0F, 0F, 0F, 9, 7, 51, 0F,-7F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 1773
		leftFootModel[179].setRotationPoint(140.5F, -29F, 71F);

		leftFootModel[180].addShapeBox(0F, 0F, 0F, 23, 11, 37, 0F,0F, 0F, 0F, 0F, -9F, -6F, 0F, -9F, -6F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 7F); // Box 1774
		leftFootModel[180].setRotationPoint(149.5F, -28F, 78F);

		leftFootModel[181].addShapeBox(0F, 0F, 0F, 14, 8, 25, 0F,0F, 0F, 0F, -1F, -10F, -10F, -1F, -10F, -10F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 4F, -9F, 0F, 4F, -9F, 0F, 0F, 6F); // Box 1775
		leftFootModel[181].setRotationPoint(172.5F, -19F, 84F);

		leftFootModel[182].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F); // Box 1776
		leftFootModel[182].setRotationPoint(147.5F, -33F, 90F);

		leftFootModel[183].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,-2F, -1F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F); // Box 1777
		leftFootModel[183].setRotationPoint(147.5F, -33F, 78F);

		leftFootModel[184].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, -2F, -1F, -6F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F); // Box 1778
		leftFootModel[184].setRotationPoint(147.5F, -33F, 103F);

		leftFootModel[185].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, 0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 9F, -2F, 0F, 9F, -2F, 6F, 0F, 0F); // Box 1779
		leftFootModel[185].setRotationPoint(152.5F, -33F, 90F);

		leftFootModel[186].addShapeBox(0F, 0F, 0F, 20, 5, 12, 0F,0F, -2F, -6F, 0F, -12F, -9F, 0F, -10F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 9F, -6F, 0F, 9F, 2F, 6F, 0F, 0F); // Box 1780
		leftFootModel[186].setRotationPoint(152.5F, -33F, 78F);

		leftFootModel[187].addShapeBox(0F, 0F, 0F, 20, 5, 12, 0F,0F, 0F, 0F, 0F, -10F, 2F, 0F, -12F, -9F, 0F, -2F, -6F, 6F, 0F, 0F, 0F, 9F, 2F, 0F, 9F, -6F, 3F, 0F, 0F); // Box 1781
		leftFootModel[187].setRotationPoint(152.5F, -33F, 103F);

		leftFootModel[188].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, 0F, 0F, -5F, -6F, -3F, -5F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -3F, 0F, 10F, -3F, 0F, 0F, 0F); // Box 1782
		leftFootModel[188].setRotationPoint(172.5F, -23F, 92F);

		leftFootModel[189].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, -2F, -3F, -6F, -6F, -8F, -5F, -6F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -10F, 0F, 10F, 3F, 0F, 0F, 0F); // Box 1783
		leftFootModel[189].setRotationPoint(172.5F, -23F, 84F);

		leftFootModel[190].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, 0F, 0F, -5F, -6F, 3F, -6F, -6F, -8F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 10F, 3F, 0F, 10F, -10F, 0F, 0F, 0F); // Box 1784
		leftFootModel[190].setRotationPoint(172.5F, -23F, 101F);

		leftFootModel[191].addShapeBox(0F, 0F, 0F, 22, 11, 53, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 1800
		leftFootModel[191].setRotationPoint(119.5F, -22F, 70F);

		leftFootModel[192].addShapeBox(0F, 0F, 0F, 22, 11, 53, 0F,0F, 0F, -6F, 9F, -3F, -12F, 9F, -3F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1801
		leftFootModel[192].setRotationPoint(119.5F, -33F, 70F);

		leftFootModel[193].addShapeBox(0F, 0F, 0F, 31, 4, 53, 0F,0F, 3F, -15F, 0F, -6F, -18F, 0F, -6F, -18F, 0F, 3F, -15F, 0F, 0F, -6F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, 0F, -6F); // Box 1803
		leftFootModel[193].setRotationPoint(119.5F, -37F, 70F);
	}

	private void initrightFootModel_1()
	{
		rightFootModel[0] = new ModelRendererTurbo(this, 3000, 0, textureX, textureY); // Box 1431
		rightFootModel[1] = new ModelRendererTurbo(this, 3000, 50, textureX, textureY); // Box 1432
		rightFootModel[2] = new ModelRendererTurbo(this, 3000, 110, textureX, textureY); // Box 1433
		rightFootModel[3] = new ModelRendererTurbo(this, 3000, 177, textureX, textureY); // Box 1434
		rightFootModel[4] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1435
		rightFootModel[5] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1436
		rightFootModel[6] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1437
		rightFootModel[7] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1438
		rightFootModel[8] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1439
		rightFootModel[9] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1440
		rightFootModel[10] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1441
		rightFootModel[11] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1442
		rightFootModel[12] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1443
		rightFootModel[13] = new ModelRendererTurbo(this, 3000, 397, textureX, textureY); // Box 1444
		rightFootModel[14] = new ModelRendererTurbo(this, 3000, 0, textureX, textureY); // Box 1445
		rightFootModel[15] = new ModelRendererTurbo(this, 3000, 50, textureX, textureY); // Box 1446
		rightFootModel[16] = new ModelRendererTurbo(this, 3000, 110, textureX, textureY); // Box 1447
		rightFootModel[17] = new ModelRendererTurbo(this, 3000, 177, textureX, textureY); // Box 1448
		rightFootModel[18] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1449
		rightFootModel[19] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1450
		rightFootModel[20] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1451
		rightFootModel[21] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1452
		rightFootModel[22] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1453
		rightFootModel[23] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1454
		rightFootModel[24] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1455
		rightFootModel[25] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1456
		rightFootModel[26] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1457
		rightFootModel[27] = new ModelRendererTurbo(this, 3000, 397, textureX, textureY); // Box 1458
		rightFootModel[28] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1471
		rightFootModel[29] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1472
		rightFootModel[30] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1473
		rightFootModel[31] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1474
		rightFootModel[32] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1475
		rightFootModel[33] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1476
		rightFootModel[34] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1477
		rightFootModel[35] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1478
		rightFootModel[36] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1479
		rightFootModel[37] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1491
		rightFootModel[38] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1492
		rightFootModel[39] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1493
		rightFootModel[40] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1494
		rightFootModel[41] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1495
		rightFootModel[42] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1496
		rightFootModel[43] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1497
		rightFootModel[44] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1498
		rightFootModel[45] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1509
		rightFootModel[46] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1510
		rightFootModel[47] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1511
		rightFootModel[48] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1512
		rightFootModel[49] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1513
		rightFootModel[50] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1514
		rightFootModel[51] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1515
		rightFootModel[52] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1516
		rightFootModel[53] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1536
		rightFootModel[54] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1537
		rightFootModel[55] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1538
		rightFootModel[56] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1539
		rightFootModel[57] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1540
		rightFootModel[58] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1541
		rightFootModel[59] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1542
		rightFootModel[60] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1543
		rightFootModel[61] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1555
		rightFootModel[62] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1556
		rightFootModel[63] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1557
		rightFootModel[64] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1558
		rightFootModel[65] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1559
		rightFootModel[66] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1560
		rightFootModel[67] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1561
		rightFootModel[68] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1562
		rightFootModel[69] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1563
		rightFootModel[70] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1573
		rightFootModel[71] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1574
		rightFootModel[72] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1575
		rightFootModel[73] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1576
		rightFootModel[74] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1577
		rightFootModel[75] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1578
		rightFootModel[76] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1579
		rightFootModel[77] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1580
		rightFootModel[78] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1581
		rightFootModel[79] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1587
		rightFootModel[80] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1588
		rightFootModel[81] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1589
		rightFootModel[82] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1590
		rightFootModel[83] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1591
		rightFootModel[84] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1592
		rightFootModel[85] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1593
		rightFootModel[86] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1594
		rightFootModel[87] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1595
		rightFootModel[88] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1606
		rightFootModel[89] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1607
		rightFootModel[90] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1608
		rightFootModel[91] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1609
		rightFootModel[92] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1610
		rightFootModel[93] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1611
		rightFootModel[94] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1612
		rightFootModel[95] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1613
		rightFootModel[96] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1614
		rightFootModel[97] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1616
		rightFootModel[98] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1617
		rightFootModel[99] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1618
		rightFootModel[100] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1619
		rightFootModel[101] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1629
		rightFootModel[102] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1630
		rightFootModel[103] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1631
		rightFootModel[104] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1632
		rightFootModel[105] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1633
		rightFootModel[106] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1634
		rightFootModel[107] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1635
		rightFootModel[108] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1636
		rightFootModel[109] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1637
		rightFootModel[110] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1651
		rightFootModel[111] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1652
		rightFootModel[112] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1653
		rightFootModel[113] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1654
		rightFootModel[114] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1655
		rightFootModel[115] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1656
		rightFootModel[116] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1657
		rightFootModel[117] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1658
		rightFootModel[118] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1659
		rightFootModel[119] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1660
		rightFootModel[120] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1661
		rightFootModel[121] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1662
		rightFootModel[122] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1663
		rightFootModel[123] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1664
		rightFootModel[124] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1665
		rightFootModel[125] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1666
		rightFootModel[126] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1667
		rightFootModel[127] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1668
		rightFootModel[128] = new ModelRendererTurbo(this, 3000, 255, textureX, textureY); // Box 1670
		rightFootModel[129] = new ModelRendererTurbo(this, 3000, 792, textureX, textureY); // Box 1687
		rightFootModel[130] = new ModelRendererTurbo(this, 3000, 928, textureX, textureY); // Box 1688
		rightFootModel[131] = new ModelRendererTurbo(this, 3000, 1063, textureX, textureY); // Box 1689
		rightFootModel[132] = new ModelRendererTurbo(this, 3000, 1189, textureX, textureY); // Box 1690
		rightFootModel[133] = new ModelRendererTurbo(this, 3000, 1298, textureX, textureY); // Box 1691
		rightFootModel[134] = new ModelRendererTurbo(this, 3000, 1377, textureX, textureY); // Box 1692
		rightFootModel[135] = new ModelRendererTurbo(this, 3000, 1454, textureX, textureY); // Box 1693
		rightFootModel[136] = new ModelRendererTurbo(this, 3000, 1455, textureX, textureY); // Box 1694
		rightFootModel[137] = new ModelRendererTurbo(this, 3000, 1579, textureX, textureY); // Box 1695
		rightFootModel[138] = new ModelRendererTurbo(this, 3000, 1701, textureX, textureY); // Box 1696
		rightFootModel[139] = new ModelRendererTurbo(this, 3000, 1820, textureX, textureY); // Box 1697
		rightFootModel[140] = new ModelRendererTurbo(this, 3000, 1928, textureX, textureY); // Box 1698
		rightFootModel[141] = new ModelRendererTurbo(this, 3000, 2005, textureX, textureY); // Box 1728
		rightFootModel[142] = new ModelRendererTurbo(this, 3000, 2130, textureX, textureY); // Box 1729
		rightFootModel[143] = new ModelRendererTurbo(this, 3000, 2243, textureX, textureY); // Box 1730
		rightFootModel[144] = new ModelRendererTurbo(this, 3000, 2243, textureX, textureY); // Box 1731
		rightFootModel[145] = new ModelRendererTurbo(this, 3000, 2247, textureX, textureY); // Box 1732
		rightFootModel[146] = new ModelRendererTurbo(this, 3000, 2367, textureX, textureY); // Box 1733
		rightFootModel[147] = new ModelRendererTurbo(this, 3000, 2488, textureX, textureY); // Box 1734
		rightFootModel[148] = new ModelRendererTurbo(this, 3000, 2609, textureX, textureY); // Box 1735
		rightFootModel[149] = new ModelRendererTurbo(this, 3000, 2730, textureX, textureY); // Box 1736
		rightFootModel[150] = new ModelRendererTurbo(this, 3000, 2847, textureX, textureY); // Box 1737
		rightFootModel[151] = new ModelRendererTurbo(this, 3000, 2860, textureX, textureY); // Box 1738
		rightFootModel[152] = new ModelRendererTurbo(this, 3000, 2875, textureX, textureY); // Box 1739
		rightFootModel[153] = new ModelRendererTurbo(this, 3000, 2888, textureX, textureY); // Box 1740
		rightFootModel[154] = new ModelRendererTurbo(this, 3000, 2901, textureX, textureY); // Box 1741
		rightFootModel[155] = new ModelRendererTurbo(this, 3000, 2915, textureX, textureY); // Box 1742
		rightFootModel[156] = new ModelRendererTurbo(this, 3000, 2847, textureX, textureY); // Box 1743
		rightFootModel[157] = new ModelRendererTurbo(this, 3000, 2860, textureX, textureY); // Box 1744
		rightFootModel[158] = new ModelRendererTurbo(this, 3000, 2875, textureX, textureY); // Box 1745
		rightFootModel[159] = new ModelRendererTurbo(this, 3000, 2888, textureX, textureY); // Box 1746
		rightFootModel[160] = new ModelRendererTurbo(this, 3000, 2901, textureX, textureY); // Box 1747
		rightFootModel[161] = new ModelRendererTurbo(this, 3000, 2915, textureX, textureY); // Box 1748
		rightFootModel[162] = new ModelRendererTurbo(this, 3000, 2924, textureX, textureY); // Box 1749
		rightFootModel[163] = new ModelRendererTurbo(this, 3000, 2942, textureX, textureY); // Box 1750
		rightFootModel[164] = new ModelRendererTurbo(this, 3000, 2942, textureX, textureY); // Box 1751
		rightFootModel[165] = new ModelRendererTurbo(this, 3000, 2924, textureX, textureY); // Box 1752
		rightFootModel[166] = new ModelRendererTurbo(this, 3000, 2922, textureX, textureY); // Box 1753
		rightFootModel[167] = new ModelRendererTurbo(this, 3000, 3038, textureX, textureY); // Box 1754
		rightFootModel[168] = new ModelRendererTurbo(this, 3000, 3102, textureX, textureY); // Box 1755
		rightFootModel[169] = new ModelRendererTurbo(this, 3000, 3168, textureX, textureY); // Box 1756
		rightFootModel[170] = new ModelRendererTurbo(this, 3000, 3233, textureX, textureY); // Box 1759
		rightFootModel[171] = new ModelRendererTurbo(this, 3000, 3346, textureX, textureY); // Box 1760
		rightFootModel[172] = new ModelRendererTurbo(this, 3000, 416, textureX, textureY); // Box 1766
		rightFootModel[173] = new ModelRendererTurbo(this, 3000, 514, textureX, textureY); // Box 1767
		rightFootModel[174] = new ModelRendererTurbo(this, 3000, 613, textureX, textureY); // Box 1768
		rightFootModel[175] = new ModelRendererTurbo(this, 3000, 703, textureX, textureY); // Box 1769
		rightFootModel[176] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1785
		rightFootModel[177] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1786
		rightFootModel[178] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1787
		rightFootModel[179] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1788
		rightFootModel[180] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1789
		rightFootModel[181] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1790
		rightFootModel[182] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1791
		rightFootModel[183] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1792
		rightFootModel[184] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1793
		rightFootModel[185] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1794
		rightFootModel[186] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1795
		rightFootModel[187] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1796
		rightFootModel[188] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1797
		rightFootModel[189] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1798
		rightFootModel[190] = new ModelRendererTurbo(this, 3000, 3418, textureX, textureY); // Box 1799
		rightFootModel[191] = new ModelRendererTurbo(this, 3000, 3495, textureX, textureY); // Box 1804
		rightFootModel[192] = new ModelRendererTurbo(this, 3000, 3563, textureX, textureY); // Box 1805
		rightFootModel[193] = new ModelRendererTurbo(this, 3000, 3632, textureX, textureY); // Box 1806

		rightFootModel[0].addShapeBox(0F, 0F, 0F, 5, 26, 21, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F); // Box 1431
		rightFootModel[0].setRotationPoint(-32.5F, -72F, -76F);

		rightFootModel[1].addShapeBox(0F, 0F, 0F, 6, 34, 21, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 1432
		rightFootModel[1].setRotationPoint(-27.5F, -76F, -76F);

		rightFootModel[2].addShapeBox(0F, 0F, 0F, 12, 43, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1433
		rightFootModel[2].setRotationPoint(-21.5F, -79F, -76F);

		rightFootModel[3].addShapeBox(0F, 0F, 0F, 10, 51, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 1434
		rightFootModel[3].setRotationPoint(-9.5F, -82F, -76F);

		rightFootModel[4].addShapeBox(0F, 0F, 0F, 13, 7, 21, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1435
		rightFootModel[4].setRotationPoint(0.5F, -88F, -76F);

		rightFootModel[5].addShapeBox(0F, 0F, 0F, 13, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -4F, 0F, 1F); // Box 1436
		rightFootModel[5].setRotationPoint(0.5F, -81F, -76F);

		rightFootModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, -1F, 0F, 1F); // Box 1437
		rightFootModel[6].setRotationPoint(4.5F, -78F, -76F);

		rightFootModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 24, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 1F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, -3F, 0F, 1F); // Box 1438
		rightFootModel[7].setRotationPoint(4.5F, -74F, -76F);

		rightFootModel[8].addShapeBox(0F, 0F, 0F, 6, 5, 25, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -1F, 0F, 1F); // Box 1439
		rightFootModel[8].setRotationPoint(7.5F, -68F, -76F);

		rightFootModel[9].addShapeBox(0F, 0F, 0F, 5, 14, 26, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1440
		rightFootModel[9].setRotationPoint(8.5F, -62F, -76F);

		rightFootModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1441
		rightFootModel[10].setRotationPoint(8.5F, -48F, -76F);

		rightFootModel[11].addShapeBox(0F, 0F, 0F, 8, 5, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1442
		rightFootModel[11].setRotationPoint(5.5F, -43F, -76F);

		rightFootModel[12].addShapeBox(0F, 0F, 0F, 10, 7, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 1443
		rightFootModel[12].setRotationPoint(3.5F, -38F, -76F);

		rightFootModel[13].addShapeBox(0F, 0F, 0F, 10, 49, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1444
		rightFootModel[13].setRotationPoint(0.5F, -81F, -57F);

		rightFootModel[14].addShapeBox(0F, 0F, 0F, 5, 26, 21, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F); // Box 1445
		rightFootModel[14].setRotationPoint(-32.5F, -72F, -138F);

		rightFootModel[15].addShapeBox(0F, 0F, 0F, 6, 34, 21, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 1446
		rightFootModel[15].setRotationPoint(-27.5F, -76F, -138F);

		rightFootModel[16].addShapeBox(0F, 0F, 0F, 12, 43, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1447
		rightFootModel[16].setRotationPoint(-21.5F, -79F, -138F);

		rightFootModel[17].addShapeBox(0F, 0F, 0F, 10, 51, 21, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 1448
		rightFootModel[17].setRotationPoint(-9.5F, -82F, -138F);

		rightFootModel[18].addShapeBox(0F, 0F, 0F, 13, 7, 21, 0F,0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1449
		rightFootModel[18].setRotationPoint(0.5F, -88F, -138F);

		rightFootModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 1450
		rightFootModel[19].setRotationPoint(0.5F, -81F, -139F);

		rightFootModel[20].addShapeBox(0F, 0F, 0F, 9, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 1F, 1.5F, 0F, 1F, 0F, -1F, 0F, 0F); // Box 1451
		rightFootModel[20].setRotationPoint(4.5F, -78F, -140F);

		rightFootModel[21].addShapeBox(0F, 0F, 0F, 9, 5, 24, 0F,-1F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 1F, 0F, -3F, 0F, 1F, 0F, 1F, 1.5F, 0F, 1F, 0F, -3F, 0F, 0F); // Box 1452
		rightFootModel[21].setRotationPoint(4.5F, -74F, -141F);

		rightFootModel[22].addShapeBox(0F, 0F, 0F, 6, 5, 25, 0F,0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, -1F, 0F, 0F); // Box 1453
		rightFootModel[22].setRotationPoint(7.5F, -68F, -142F);

		rightFootModel[23].addShapeBox(0F, 0F, 0F, 5, 14, 26, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1454
		rightFootModel[23].setRotationPoint(8.5F, -62F, -143F);

		rightFootModel[24].addShapeBox(0F, 0F, 0F, 5, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1455
		rightFootModel[24].setRotationPoint(8.5F, -48F, -143F);

		rightFootModel[25].addShapeBox(0F, 0F, 0F, 8, 5, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 1456
		rightFootModel[25].setRotationPoint(5.5F, -43F, -143F);

		rightFootModel[26].addShapeBox(0F, 0F, 0F, 10, 7, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 1457
		rightFootModel[26].setRotationPoint(3.5F, -38F, -143F);

		rightFootModel[27].addShapeBox(0F, 0F, 0F, 10, 49, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1458
		rightFootModel[27].setRotationPoint(0.5F, -81F, -138F);

		rightFootModel[28].addShapeBox(0F, 0F, 0F, 16, 43, 93, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1471
		rightFootModel[28].setRotationPoint(13.5F, -62F, -143F);

		rightFootModel[29].addShapeBox(0F, 0F, 0F, 10, 40, 93, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1472
		rightFootModel[29].setRotationPoint(29.5F, -59F, -143F);

		rightFootModel[30].addShapeBox(0F, 0F, 0F, 10, 38, 93, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1473
		rightFootModel[30].setRotationPoint(39.5F, -57F, -143F);

		rightFootModel[31].addShapeBox(0F, 0F, 0F, 11, 36, 93, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1474
		rightFootModel[31].setRotationPoint(49.5F, -55F, -143F);

		rightFootModel[32].addShapeBox(0F, 0F, 0F, 10, 33, 93, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1475
		rightFootModel[32].setRotationPoint(60.5F, -52F, -143F);

		rightFootModel[33].addShapeBox(0F, 0F, 0F, 11, 29, 91, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1476
		rightFootModel[33].setRotationPoint(70.5F, -48F, -142F);

		rightFootModel[34].addShapeBox(0F, 0F, 0F, 10, 24, 89, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1477
		rightFootModel[34].setRotationPoint(81.5F, -43F, -141F);

		rightFootModel[35].addShapeBox(0F, 0F, 0F, 10, 19, 87, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1478
		rightFootModel[35].setRotationPoint(91.5F, -38F, -140F);

		rightFootModel[36].addShapeBox(0F, 0F, 0F, 10, 14, 85, 0F,0F, 0F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 1479
		rightFootModel[36].setRotationPoint(101.5F, -33F, -139F);

		rightFootModel[37].addShapeBox(0F, 0F, 0F, 16, 6, 93, 0F,0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1491
		rightFootModel[37].setRotationPoint(13.5F, -68F, -143F);

		rightFootModel[38].addShapeBox(0F, 0F, 0F, 20, 6, 93, 0F,0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1492
		rightFootModel[38].setRotationPoint(29.5F, -65F, -143F);

		rightFootModel[39].addShapeBox(0F, 0F, 0F, 11, 6, 93, 0F,0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1493
		rightFootModel[39].setRotationPoint(49.5F, -61F, -143F);

		rightFootModel[40].addShapeBox(0F, 0F, 0F, 10, 5, 93, 0F,0F, 0F, -0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 1494
		rightFootModel[40].setRotationPoint(60.5F, -57F, -143F);

		rightFootModel[41].addShapeBox(0F, 0F, 0F, 11, 5, 91, 0F,0F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1495
		rightFootModel[41].setRotationPoint(70.5F, -53F, -142F);

		rightFootModel[42].addShapeBox(0F, 0F, 0F, 10, 4, 89, 0F,0F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1496
		rightFootModel[42].setRotationPoint(81.5F, -47F, -141F);

		rightFootModel[43].addShapeBox(0F, 0F, 0F, 10, 3, 87, 0F,0F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1497
		rightFootModel[43].setRotationPoint(91.5F, -41F, -140F);

		rightFootModel[44].addShapeBox(0F, 0F, 0F, 10, 2, 85, 0F,0F, 0F, -0.5F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 6F, -1.5F, 0F, 6F, -1.5F, 0F, 0F, 0F); // Box 1498
		rightFootModel[44].setRotationPoint(101.5F, -35F, -139F);

		rightFootModel[45].addShapeBox(0F, 0F, 0F, 16, 6, 92, 0F,0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1509
		rightFootModel[45].setRotationPoint(13.5F, -74F, -142.5F);

		rightFootModel[46].addShapeBox(0F, 0F, 0F, 20, 6, 92, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1510
		rightFootModel[46].setRotationPoint(29.5F, -71F, -142.5F);

		rightFootModel[47].addShapeBox(0F, 0F, 0F, 11, 6, 92, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1511
		rightFootModel[47].setRotationPoint(49.5F, -67F, -142.5F);

		rightFootModel[48].addShapeBox(0F, 0F, 0F, 10, 6, 92, 0F,0F, 0F, -1F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 1512
		rightFootModel[48].setRotationPoint(60.5F, -63F, -142.5F);

		rightFootModel[49].addShapeBox(0F, 0F, 0F, 11, 6, 90, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 1513
		rightFootModel[49].setRotationPoint(70.5F, -59F, -141.5F);

		rightFootModel[50].addShapeBox(0F, 0F, 0F, 10, 5, 88, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 1514
		rightFootModel[50].setRotationPoint(81.5F, -52F, -140.5F);

		rightFootModel[51].addShapeBox(0F, 0F, 0F, 10, 4, 86, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 1515
		rightFootModel[51].setRotationPoint(91.5F, -45F, -139.5F);

		rightFootModel[52].addShapeBox(0F, 0F, 0F, 10, 3, 84, 0F,0F, 0F, -1F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1516
		rightFootModel[52].setRotationPoint(101.5F, -38F, -138.5F);

		rightFootModel[53].addShapeBox(0F, 0F, 0F, 16, 4, 90, 0F,0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1536
		rightFootModel[53].setRotationPoint(13.5F, -78F, -141.5F);

		rightFootModel[54].addShapeBox(0F, 0F, 0F, 20, 4, 90, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1537
		rightFootModel[54].setRotationPoint(29.5F, -75F, -141.5F);

		rightFootModel[55].addShapeBox(0F, 0F, 0F, 11, 4, 90, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1538
		rightFootModel[55].setRotationPoint(49.5F, -71F, -141.5F);

		rightFootModel[56].addShapeBox(0F, 0F, 0F, 10, 4, 90, 0F,0F, 0F, -1F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 1539
		rightFootModel[56].setRotationPoint(60.5F, -67F, -141.5F);

		rightFootModel[57].addShapeBox(0F, 0F, 0F, 11, 3, 88, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1540
		rightFootModel[57].setRotationPoint(70.5F, -62F, -140.5F);

		rightFootModel[58].addShapeBox(0F, 0F, 0F, 10, 3, 86, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1541
		rightFootModel[58].setRotationPoint(81.5F, -55F, -139.5F);

		rightFootModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 84, 0F,0F, 0F, -1F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1542
		rightFootModel[59].setRotationPoint(91.5F, -48F, -138.5F);

		rightFootModel[60].addShapeBox(0F, 0F, 0F, 10, 3, 82, 0F,0F, 0F, -1F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1543
		rightFootModel[60].setRotationPoint(101.5F, -41F, -137.5F);

		rightFootModel[61].addShapeBox(0F, 0F, 0F, 16, 3, 88, 0F,0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1555
		rightFootModel[61].setRotationPoint(13.5F, -81F, -140.5F);

		rightFootModel[62].addShapeBox(0F, 0F, 0F, 20, 3, 88, 0F,0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1556
		rightFootModel[62].setRotationPoint(29.5F, -78F, -140.5F);

		rightFootModel[63].addShapeBox(0F, 0F, 0F, 11, 3, 88, 0F,0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1557
		rightFootModel[63].setRotationPoint(49.5F, -74F, -140.5F);

		rightFootModel[64].addShapeBox(0F, 0F, 0F, 10, 3, 88, 0F,0F, 0F, -1.5F, 0F, -5F, -2.5F, 0F, -5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1558
		rightFootModel[64].setRotationPoint(60.5F, -70F, -140.5F);

		rightFootModel[65].addShapeBox(0F, 0F, 0F, 11, 3, 86, 0F,0F, 0F, -1.5F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1559
		rightFootModel[65].setRotationPoint(70.5F, -65F, -139.5F);

		rightFootModel[66].addShapeBox(0F, 0F, 0F, 10, 3, 84, 0F,0F, 0F, -1.5F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1560
		rightFootModel[66].setRotationPoint(81.5F, -58F, -138.5F);

		rightFootModel[67].addShapeBox(0F, 0F, 0F, 10, 3, 82, 0F,0F, 0F, -1.5F, 0F, -7F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1561
		rightFootModel[67].setRotationPoint(91.5F, -51F, -137.5F);

		rightFootModel[68].addShapeBox(0F, 0F, 0F, 10, 3, 80, 0F,0F, 0F, -1.5F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1562
		rightFootModel[68].setRotationPoint(101.5F, -44F, -136.5F);

		rightFootModel[69].addShapeBox(0F, 0F, 0F, 18, 3, 77, 0F,0F, 0F, -1.5F, 3F, -10F, -6F, 3F, -10F, -6F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 10F, -3.5F, 0F, 10F, -3.5F, 0F, 0F, 0F); // Box 1563
		rightFootModel[69].setRotationPoint(111.5F, -37F, -135F);

		rightFootModel[70].addShapeBox(0F, 0F, 0F, 16, 7, 85, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1573
		rightFootModel[70].setRotationPoint(13.5F, -88F, -139F);

		rightFootModel[71].addShapeBox(0F, 0F, 0F, 20, 7, 85, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1574
		rightFootModel[71].setRotationPoint(29.5F, -85F, -139F);

		rightFootModel[72].addShapeBox(0F, 0F, 0F, 11, 7, 85, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1575
		rightFootModel[72].setRotationPoint(49.5F, -81F, -139F);

		rightFootModel[73].addShapeBox(0F, 0F, 0F, 10, 7, 85, 0F,0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1576
		rightFootModel[73].setRotationPoint(60.5F, -77F, -139F);

		rightFootModel[74].addShapeBox(0F, 0F, 0F, 11, 7, 83, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1577
		rightFootModel[74].setRotationPoint(70.5F, -72F, -138F);

		rightFootModel[75].addShapeBox(0F, 0F, 0F, 10, 7, 81, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1578
		rightFootModel[75].setRotationPoint(81.5F, -65F, -137F);

		rightFootModel[76].addShapeBox(0F, 0F, 0F, 10, 7, 79, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1579
		rightFootModel[76].setRotationPoint(91.5F, -58F, -136F);

		rightFootModel[77].addShapeBox(0F, 0F, 0F, 10, 7, 77, 0F,0F, 0F, -4F, 0F, -7F, -5.5F, 0F, -7F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1580
		rightFootModel[77].setRotationPoint(101.5F, -51F, -135F);

		rightFootModel[78].addShapeBox(0F, 0F, 0F, 21, 7, 74, 0F,0F, 0F, -4F, 4F, -13F, -8.5F, 4F, -13F, -8.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 10F, -4.5F, 0F, 10F, -4.5F, 0F, 0F, 0F); // Box 1581
		rightFootModel[78].setRotationPoint(111.5F, -44F, -133.5F);

		rightFootModel[79].addShapeBox(0F, 0F, 0F, 16, 7, 77, 0F,-8F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, -8F, -3F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1587
		rightFootModel[79].setRotationPoint(13.5F, -95F, -135F);

		rightFootModel[80].addShapeBox(0F, 0F, 0F, 20, 7, 77, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1588
		rightFootModel[80].setRotationPoint(29.5F, -92F, -135F);

		rightFootModel[81].addShapeBox(0F, 0F, 0F, 11, 7, 77, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1589
		rightFootModel[81].setRotationPoint(49.5F, -88F, -135F);

		rightFootModel[82].addShapeBox(0F, 0F, 0F, 10, 7, 77, 0F,0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1590
		rightFootModel[82].setRotationPoint(60.5F, -84F, -135F);

		rightFootModel[83].addShapeBox(0F, 0F, 0F, 11, 7, 75, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1591
		rightFootModel[83].setRotationPoint(70.5F, -79F, -134F);

		rightFootModel[84].addShapeBox(0F, 0F, 0F, 10, 7, 73, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1592
		rightFootModel[84].setRotationPoint(81.5F, -72F, -133F);

		rightFootModel[85].addShapeBox(0F, 0F, 0F, 10, 7, 71, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1593
		rightFootModel[85].setRotationPoint(91.5F, -65F, -132F);

		rightFootModel[86].addShapeBox(0F, 0F, 0F, 10, 7, 69, 0F,0F, 0F, -4F, 0F, -7F, -5.5F, 0F, -7F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1594
		rightFootModel[86].setRotationPoint(101.5F, -58F, -131F);

		rightFootModel[87].addShapeBox(0F, 0F, 0F, 25, 7, 66, 0F,0F, 0F, -4F, 3F, -17F, -8.5F, 3F, -17F, -8.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 13F, -4.5F, 0F, 13F, -4.5F, 0F, 0F, 0F); // Box 1595
		rightFootModel[87].setRotationPoint(111.5F, -51F, -129.5F);

		rightFootModel[88].addShapeBox(0F, 0F, 0F, 8, 7, 69, 0F,-9F, 0F, -6F, 2F, 0F, -6F, 2F, 0F, -6F, -9F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1606
		rightFootModel[88].setRotationPoint(21.5F, -99F, -131F);

		rightFootModel[89].addShapeBox(0F, 0F, 0F, 20, 7, 69, 0F,-2F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1607
		rightFootModel[89].setRotationPoint(29.5F, -99F, -131F);

		rightFootModel[90].addShapeBox(0F, 0F, 0F, 11, 7, 69, 0F,0F, 0F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1608
		rightFootModel[90].setRotationPoint(49.5F, -95F, -131F);

		rightFootModel[91].addShapeBox(0F, 0F, 0F, 10, 7, 69, 0F,0F, 0F, -6F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1609
		rightFootModel[91].setRotationPoint(60.5F, -91F, -131F);

		rightFootModel[92].addShapeBox(0F, 0F, 0F, 11, 7, 67, 0F,0F, 0F, -6F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1610
		rightFootModel[92].setRotationPoint(70.5F, -86F, -130F);

		rightFootModel[93].addShapeBox(0F, 0F, 0F, 10, 7, 65, 0F,0F, 0F, -6F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1611
		rightFootModel[93].setRotationPoint(81.5F, -79F, -129F);

		rightFootModel[94].addShapeBox(0F, 0F, 0F, 10, 7, 63, 0F,0F, 0F, -6F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1612
		rightFootModel[94].setRotationPoint(91.5F, -72F, -128F);

		rightFootModel[95].addShapeBox(0F, 0F, 0F, 10, 7, 61, 0F,0F, 0F, -6F, 0F, -7F, -7.5F, 0F, -7F, -7.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1613
		rightFootModel[95].setRotationPoint(101.5F, -65F, -127F);

		rightFootModel[96].addShapeBox(0F, 0F, 0F, 28, 7, 59, 0F,0F, 0F, -6.5F, 3F, -21F, -9F, 3F, -21F, -9F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 17F, -5F, 0F, 17F, -5F, 0F, 0F, -0.5F); // Box 1614
		rightFootModel[96].setRotationPoint(111.5F, -58F, -126F);

		rightFootModel[97].addShapeBox(0F, 0F, 0F, 10, 8, 82, 0F,0F, 0F, 0F, 4F, -6F, -2F, 4F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 1616
		rightFootModel[97].setRotationPoint(111.5F, -27F, -137.5F);

		rightFootModel[98].addShapeBox(0F, 0F, 0F, 14, 1, 82, 0F,0F, 0F, -0.5F, 2F, -6F, -3F, 2F, -6F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, 0F); // Box 1617
		rightFootModel[98].setRotationPoint(111.5F, -28F, -137.5F);

		rightFootModel[99].addShapeBox(0F, 0F, 0F, 14, 3, 81, 0F,0F, 0F, -1F, 3F, -8F, -4F, 3F, -8F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 6F, -2.5F, 2F, 6F, -2.5F, 0F, 0F, 0F); // Box 1618
		rightFootModel[99].setRotationPoint(111.5F, -31F, -137F);

		rightFootModel[100].addShapeBox(0F, 0F, 0F, 16, 3, 82, 0F,0F, 0F, -2.5F, 2F, -10F, -6F, 2F, -10F, -6F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 1F, 8F, -4.5F, 1F, 8F, -4.5F, 0F, 0F, -1.5F); // Box 1619
		rightFootModel[100].setRotationPoint(111.5F, -34F, -137.5F);

		rightFootModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 57, 0F,-6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1629
		rightFootModel[101].setRotationPoint(30.5F, -104F, -125F);

		rightFootModel[102].addShapeBox(0F, 0F, 0F, 18, 5, 57, 0F,-6F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1630
		rightFootModel[102].setRotationPoint(31.5F, -104F, -125F);

		rightFootModel[103].addShapeBox(0F, 0F, 0F, 11, 5, 57, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1631
		rightFootModel[103].setRotationPoint(49.5F, -100F, -125F);

		rightFootModel[104].addShapeBox(0F, 0F, 0F, 10, 5, 57, 0F,0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1632
		rightFootModel[104].setRotationPoint(60.5F, -96F, -125F);

		rightFootModel[105].addShapeBox(0F, 0F, 0F, 11, 5, 55, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1633
		rightFootModel[105].setRotationPoint(70.5F, -91F, -124F);

		rightFootModel[106].addShapeBox(0F, 0F, 0F, 10, 5, 53, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1634
		rightFootModel[106].setRotationPoint(81.5F, -84F, -123F);

		rightFootModel[107].addShapeBox(0F, 0F, 0F, 10, 5, 51, 0F,0F, 0F, -4F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1635
		rightFootModel[107].setRotationPoint(91.5F, -77F, -122F);

		rightFootModel[108].addShapeBox(0F, 0F, 0F, 10, 5, 49, 0F,0F, 0F, -4F, 0F, -7F, -5.5F, 0F, -7F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 1636
		rightFootModel[108].setRotationPoint(101.5F, -70F, -121F);

		rightFootModel[109].addShapeBox(0F, 0F, 0F, 31, 5, 46, 0F,0F, 0F, -4F, 2F, -24F, -7.5F, 2F, -24F, -7.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 21F, -2.5F, 0F, 21F, -2.5F, 0F, 0F, 0F); // Box 1637
		rightFootModel[109].setRotationPoint(111.5F, -63F, -119.5F);

		rightFootModel[110].addShapeBox(0F, 0F, 0F, 1, 7, 24, 0F,-6F, 1F, 0.5F, 6F, 1F, 0.5F, 6F, -1F, -10F, -6F, -1F, -10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1651
		rightFootModel[110].setRotationPoint(36.5F, -111F, -96F);

		rightFootModel[111].addShapeBox(0F, 0F, 0F, 12, 7, 24, 0F,-6F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -2.5F, -10F, -6F, -1F, -10F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1652
		rightFootModel[111].setRotationPoint(37.5F, -111F, -96F);

		rightFootModel[112].addShapeBox(0F, 0F, 0F, 11, 7, 24, 0F,0F, 3F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -10F, 0F, 1.5F, -10F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 1653
		rightFootModel[112].setRotationPoint(49.5F, -107F, -96F);

		rightFootModel[113].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F,0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 2F, -10F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 1654
		rightFootModel[113].setRotationPoint(60.5F, -103F, -96F);

		rightFootModel[114].addShapeBox(0F, 0F, 0F, 11, 7, 23, 0F,0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 3F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1655
		rightFootModel[114].setRotationPoint(70.5F, -98F, -96F);

		rightFootModel[115].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 7F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1656
		rightFootModel[115].setRotationPoint(81.5F, -91F, -96F);

		rightFootModel[116].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 7F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1657
		rightFootModel[116].setRotationPoint(91.5F, -84F, -96F);

		rightFootModel[117].addShapeBox(0F, 0F, 0F, 10, 7, 20, 0F,0F, 7F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 1658
		rightFootModel[117].setRotationPoint(101.5F, -77F, -96F);

		rightFootModel[118].addShapeBox(0F, 0F, 0F, 33, 7, 19, 0F,0F, 7F, 0.5F, 1.5F, -29.5F, 0.5F, 1F, -30F, -11F, 0F, 5F, -10F, 0F, 0F, 0.5F, 0F, 24F, 0.5F, 0F, 24F, -4F, 0F, 0F, 0F); // Box 1659
		rightFootModel[118].setRotationPoint(111.5F, -70F, -96F);

		rightFootModel[119].addShapeBox(0F, 0F, 0F, 33, 7, 19, 0F,0F, 5F, -10F, 1F, -30F, -11F, 1.5F, -29.5F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 24F, -4F, 0F, 24F, 0.5F, 0F, 0F, 0.5F); // Box 1660
		rightFootModel[119].setRotationPoint(111.5F, -70F, -116F);

		rightFootModel[120].addShapeBox(0F, 0F, 0F, 10, 7, 20, 0F,0F, 5F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1661
		rightFootModel[120].setRotationPoint(101.5F, -77F, -117F);

		rightFootModel[121].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 5F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1662
		rightFootModel[121].setRotationPoint(91.5F, -84F, -118F);

		rightFootModel[122].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 5F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 7F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1663
		rightFootModel[122].setRotationPoint(81.5F, -91F, -119F);

		rightFootModel[123].addShapeBox(0F, 0F, 0F, 11, 7, 23, 0F,0F, 3F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, 0.5F, 0F, 0F, 0.5F); // Box 1664
		rightFootModel[123].setRotationPoint(70.5F, -98F, -120F);

		rightFootModel[124].addShapeBox(0F, 0F, 0F, 12, 7, 24, 0F,-6F, -1F, -10F, 0F, -2.5F, -10F, 0F, -1F, 0.5F, -6F, 1F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 1665
		rightFootModel[124].setRotationPoint(37.5F, -111F, -121F);

		rightFootModel[125].addShapeBox(0F, 0F, 0F, 11, 7, 24, 0F,0F, 1.5F, -10F, 0F, -2F, -10F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 1666
		rightFootModel[125].setRotationPoint(49.5F, -107F, -121F);

		rightFootModel[126].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F,0F, 2F, -10F, 0F, -2F, -11F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 0.5F, 0F, 0F, 0.5F); // Box 1667
		rightFootModel[126].setRotationPoint(60.5F, -103F, -121F);

		rightFootModel[127].addShapeBox(0F, 0F, 0F, 1, 7, 24, 0F,-6F, -1F, -10F, 6F, -1F, -10F, 6F, 1F, 0.5F, -6F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1668
		rightFootModel[127].setRotationPoint(36.5F, -111F, -121F);

		rightFootModel[128].addShapeBox(0F, 0F, 0F, 15, 12, 93, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 1670
		rightFootModel[128].setRotationPoint(-1.5F, -31F, -143F);

		rightFootModel[129].addShapeBox(0F, 0F, 0F, 37, 15, 115, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 1687
		rightFootModel[129].setRotationPoint(18.5F, -14F, -154F);

		rightFootModel[130].addShapeBox(0F, 0F, 0F, 30, 15, 115, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1688
		rightFootModel[130].setRotationPoint(55.5F, -14F, -154F);

		rightFootModel[131].addShapeBox(0F, 0F, 0F, 30, 13, 109, 0F,0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1689
		rightFootModel[131].setRotationPoint(85.5F, -12F, -151F);

		rightFootModel[132].addShapeBox(0F, 0F, 0F, 35, 11, 95, 0F,0F, 0F, 0F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 1690
		rightFootModel[132].setRotationPoint(115.5F, -10F, -144F);

		rightFootModel[133].addShapeBox(0F, 0F, 0F, 2, 5, 71, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 1691
		rightFootModel[133].setRotationPoint(150.5F, -4F, -132F);

		rightFootModel[134].addShapeBox(0F, 0F, 0F, 49, 11, 59, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1692
		rightFootModel[134].setRotationPoint(136.5F, -10F, -126F);

		rightFootModel[135].addShapeBox(0F, 0F, 0F, 4, 6, 45, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1693
		rightFootModel[135].setRotationPoint(185.5F, -5F, -119F);

		rightFootModel[136].addShapeBox(0F, 0F, 0F, 37, 4, 115, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1694
		rightFootModel[136].setRotationPoint(18.5F, -18F, -154F);

		rightFootModel[137].addShapeBox(0F, 0F, 0F, 30, 4, 115, 0F,0F, 0F, -12F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 1695
		rightFootModel[137].setRotationPoint(55.5F, -18F, -154F);

		rightFootModel[138].addShapeBox(0F, 0F, 0F, 30, 6, 109, 0F,0F, 0F, -12F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 0F); // Box 1696
		rightFootModel[138].setRotationPoint(85.5F, -18F, -151F);

		rightFootModel[139].addShapeBox(0F, 0F, 0F, 35, 8, 95, 0F,0F, 0F, -12F, 0F, -12F, -23F, 0F, -12F, -23F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 6F, -12F, 0F, 6F, -12F, 0F, 0F, 0F); // Box 1697
		rightFootModel[139].setRotationPoint(115.5F, -18F, -144F);

		rightFootModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 71, 0F,0F, 0F, -11F, -1F, -1F, -11F, -1F, -1F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 1698
		rightFootModel[140].setRotationPoint(150.5F, -6F, -132F);

		rightFootModel[141].addShapeBox(0F, 0F, 0F, 82, 7, 109, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 1728
		rightFootModel[141].setRotationPoint(-61.5F, -7F, -151F);

		rightFootModel[142].addShapeBox(0F, 0F, 0F, 57, 1, 109, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1729
		rightFootModel[142].setRotationPoint(-36.5F, 0F, -151F);

		rightFootModel[143].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1730
		rightFootModel[143].setRotationPoint(-53.5F, 0F, -52F);

		rightFootModel[144].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1731
		rightFootModel[144].setRotationPoint(-53.5F, 0F, -151F);

		rightFootModel[145].addShapeBox(0F, 0F, 0F, 77, 7, 109, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1732
		rightFootModel[145].setRotationPoint(-61.5F, -14F, -151F);

		rightFootModel[146].addShapeBox(0F, 0F, 0F, 71, 7, 109, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1733
		rightFootModel[146].setRotationPoint(-61.5F, -21F, -151F);

		rightFootModel[147].addShapeBox(0F, 0F, 0F, 64, 7, 109, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1734
		rightFootModel[147].setRotationPoint(-61.5F, -28F, -151F);

		rightFootModel[148].addShapeBox(0F, 0F, 0F, 55, 7, 109, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1735
		rightFootModel[148].setRotationPoint(-61.5F, -35F, -151F);

		rightFootModel[149].addShapeBox(0F, 0F, 0F, 41, 5, 109, 0F,-5F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1736
		rightFootModel[149].setRotationPoint(-61.5F, -40F, -151F);

		rightFootModel[150].addShapeBox(0F, 0F, 0F, 82, 7, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -8F, -3F, 0F); // Box 1737
		rightFootModel[150].setRotationPoint(-61.5F, -7F, -42F);

		rightFootModel[151].addShapeBox(0F, 0F, 0F, 77, 7, 3, 0F,0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1738
		rightFootModel[151].setRotationPoint(-61.5F, -14F, -42F);

		rightFootModel[152].addShapeBox(0F, 0F, 0F, 71, 7, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1739
		rightFootModel[152].setRotationPoint(-61.5F, -21F, -42F);

		rightFootModel[153].addShapeBox(0F, 0F, 0F, 64, 7, 3, 0F,0F, 0F, 0F, -9F, 0F, 0F, -12F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1740
		rightFootModel[153].setRotationPoint(-61.5F, -28F, -42F);

		rightFootModel[154].addShapeBox(0F, 0F, 0F, 55, 7, 3, 0F,0F, 0F, 0F, -14F, 0F, 0F, -17F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1741
		rightFootModel[154].setRotationPoint(-61.5F, -35F, -42F);

		rightFootModel[155].addShapeBox(0F, 0F, 0F, 41, 5, 3, 0F,-5F, 0F, 0F, -21F, 0F, 0F, -24F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1742
		rightFootModel[155].setRotationPoint(-61.5F, -40F, -42F);

		rightFootModel[156].addShapeBox(0F, 0F, 0F, 82, 7, 3, 0F,-3F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 1743
		rightFootModel[156].setRotationPoint(-61.5F, -7F, -154F);

		rightFootModel[157].addShapeBox(0F, 0F, 0F, 77, 7, 3, 0F,-3F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1744
		rightFootModel[157].setRotationPoint(-61.5F, -14F, -154F);

		rightFootModel[158].addShapeBox(0F, 0F, 0F, 71, 7, 3, 0F,-3F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1745
		rightFootModel[158].setRotationPoint(-61.5F, -21F, -154F);

		rightFootModel[159].addShapeBox(0F, 0F, 0F, 64, 7, 3, 0F,-3F, 0F, 0F, -12F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1746
		rightFootModel[159].setRotationPoint(-61.5F, -28F, -154F);

		rightFootModel[160].addShapeBox(0F, 0F, 0F, 55, 7, 3, 0F,-3F, 0F, 0F, -17F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1747
		rightFootModel[160].setRotationPoint(-61.5F, -35F, -154F);

		rightFootModel[161].addShapeBox(0F, 0F, 0F, 41, 5, 3, 0F,-8F, -3F, 0F, -24F, -3F, 0F, -21F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1748
		rightFootModel[161].setRotationPoint(-61.5F, -40F, -154F);

		rightFootModel[162].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 1749
		rightFootModel[162].setRotationPoint(-62.5F, -7F, -151F);

		rightFootModel[163].addShapeBox(0F, 0F, 0F, 1, 24, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 1750
		rightFootModel[163].setRotationPoint(-62.5F, -31F, -151F);

		rightFootModel[164].addShapeBox(0F, 0F, 0F, 1, 24, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1751
		rightFootModel[164].setRotationPoint(-62.5F, -31F, -67F);

		rightFootModel[165].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 1752
		rightFootModel[165].setRotationPoint(-62.5F, -7F, -52F);

		rightFootModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 109, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1753
		rightFootModel[166].setRotationPoint(-62.5F, -35F, -151F);

		rightFootModel[167].addShapeBox(0F, 0F, 0F, 1, 14, 47, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 1754
		rightFootModel[167].setRotationPoint(-62.5F, -21F, -120F);

		rightFootModel[168].addShapeBox(0F, 0F, 0F, 1, 8, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 4F, 9F, 0F, 4F, 9F, 0F, 4F, -9F, 0F, 4F); // Box 1755
		rightFootModel[168].setRotationPoint(-62.5F, -7F, -123F);

		rightFootModel[169].addShapeBox(0F, 0F, 0F, 8, 1, 61, 0F,1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1756
		rightFootModel[169].setRotationPoint(-53.5F, 0F, -127F);

		rightFootModel[170].addShapeBox(0F, 0F, 0F, 63, 46, 61, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1759
		rightFootModel[170].setRotationPoint(-29.5F, -46F, -127F);

		rightFootModel[171].addShapeBox(0F, 0F, 0F, 30, 6, 61, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1760
		rightFootModel[171].setRotationPoint(-29.5F, -52F, -127F);

		rightFootModel[172].addShapeBox(0F, 0F, 0F, 47, 1, 93, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1766
		rightFootModel[172].setRotationPoint(13.5F, -19F, -143F);

		rightFootModel[173].addShapeBox(0F, 0F, 0F, 41, 1, 93, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 1767
		rightFootModel[173].setRotationPoint(60.5F, -19F, -143F);

		rightFootModel[174].addShapeBox(0F, 0F, 0F, 10, 1, 85, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 1768
		rightFootModel[174].setRotationPoint(101.5F, -19F, -139F);

		rightFootModel[175].addShapeBox(0F, 0F, 0F, 10, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 1769
		rightFootModel[175].setRotationPoint(111.5F, -19F, -137.5F);

		rightFootModel[176].addShapeBox(0F, 0F, 0F, 19, 11, 59, 0F,-10F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, -10F, 0F, -4F, 3F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 3F, 0F, 0F); // Box 1785
		rightFootModel[176].setRotationPoint(130.5F, -22F, -126F);

		rightFootModel[177].addShapeBox(0F, 0F, 0F, 23, 9, 51, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -6F, 0F, 2F, -6F, 0F, 0F, 2F); // Box 1786
		rightFootModel[177].setRotationPoint(149.5F, -17F, -122F);

		rightFootModel[178].addShapeBox(0F, 0F, 0F, 14, 5, 37, 0F,0F, 0F, 0F, 0F, -4F, -15F, 0F, -4F, -15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -14F, 0F, 1F, -14F, 0F, 0F, 1F); // Box 1787
		rightFootModel[178].setRotationPoint(172.5F, -11F, -115F);

		rightFootModel[179].addShapeBox(0F, 0F, 0F, 9, 7, 51, 0F,-7F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 1788
		rightFootModel[179].setRotationPoint(140.5F, -29F, -122F);

		rightFootModel[180].addShapeBox(0F, 0F, 0F, 23, 11, 37, 0F,0F, 0F, 0F, 0F, -9F, -6F, 0F, -9F, -6F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 7F); // Box 1789
		rightFootModel[180].setRotationPoint(149.5F, -28F, -115F);

		rightFootModel[181].addShapeBox(0F, 0F, 0F, 14, 8, 25, 0F,0F, 0F, 0F, -1F, -10F, -10F, -1F, -10F, -10F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 4F, -9F, 0F, 4F, -9F, 0F, 0F, 6F); // Box 1790
		rightFootModel[181].setRotationPoint(172.5F, -19F, -109F);

		rightFootModel[182].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F); // Box 1791
		rightFootModel[182].setRotationPoint(147.5F, -33F, -103F);

		rightFootModel[183].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, -2F, -1F, -6F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F); // Box 1792
		rightFootModel[183].setRotationPoint(147.5F, -33F, -90F);

		rightFootModel[184].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,-2F, -1F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F); // Box 1793
		rightFootModel[184].setRotationPoint(147.5F, -33F, -115F);

		rightFootModel[185].addShapeBox(0F, 0F, 0F, 20, 5, 13, 0F,0F, 0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 9F, -2F, 0F, 9F, -2F, 3F, 0F, 0F); // Box 1794
		rightFootModel[185].setRotationPoint(152.5F, -33F, -103F);

		rightFootModel[186].addShapeBox(0F, 0F, 0F, 20, 5, 12, 0F,0F, 0F, 0F, 0F, -10F, 2F, 0F, -12F, -9F, 0F, -2F, -6F, 6F, 0F, 0F, 0F, 9F, 2F, 0F, 9F, -6F, 3F, 0F, 0F); // Box 1795
		rightFootModel[186].setRotationPoint(152.5F, -33F, -90F);

		rightFootModel[187].addShapeBox(0F, 0F, 0F, 20, 5, 12, 0F,0F, -2F, -6F, 0F, -12F, -9F, 0F, -10F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 9F, -6F, 0F, 9F, 2F, 6F, 0F, 0F); // Box 1796
		rightFootModel[187].setRotationPoint(152.5F, -33F, -115F);

		rightFootModel[188].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, 0F, 0F, -5F, -6F, -3F, -5F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -3F, 0F, 10F, -3F, 0F, 0F, 0F); // Box 1797
		rightFootModel[188].setRotationPoint(172.5F, -23F, -101F);

		rightFootModel[189].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, 0F, 0F, -5F, -6F, 3F, -6F, -6F, -8F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 10F, 3F, 0F, 10F, -10F, 0F, 0F, 0F); // Box 1798
		rightFootModel[189].setRotationPoint(172.5F, -23F, -92F);

		rightFootModel[190].addShapeBox(0F, 0F, 0F, 13, 4, 8, 0F,0F, -2F, -3F, -6F, -6F, -8F, -5F, -6F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -10F, 0F, 10F, 3F, 0F, 0F, 0F); // Box 1799
		rightFootModel[190].setRotationPoint(172.5F, -23F, -109F);

		rightFootModel[191].addShapeBox(0F, 0F, 0F, 22, 11, 53, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 1804
		rightFootModel[191].setRotationPoint(119.5F, -22F, -123F);

		rightFootModel[192].addShapeBox(0F, 0F, 0F, 22, 11, 53, 0F,0F, 0F, -6F, 9F, -3F, -12F, 9F, -3F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1805
		rightFootModel[192].setRotationPoint(119.5F, -33F, -123F);

		rightFootModel[193].addShapeBox(0F, 0F, 0F, 31, 4, 53, 0F,0F, 3F, -15F, 0F, -6F, -18F, 0F, -6F, -18F, 0F, 3F, -15F, 0F, 0F, -6F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, 0F, -6F); // Box 1806
		rightFootModel[193].setRotationPoint(119.5F, -37F, -123F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 3000, 3697, textureX, textureY); // Box 953
		barrelModel[1] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 955
		barrelModel[2] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 956
		barrelModel[3] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 957
		barrelModel[4] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 958
		barrelModel[5] = new ModelRendererTurbo(this, 3000, 3821, textureX, textureY); // Box 959
		barrelModel[6] = new ModelRendererTurbo(this, 3000, 3882, textureX, textureY); // Box 960
		barrelModel[7] = new ModelRendererTurbo(this, 3000, 3940, textureX, textureY); // Box 961
		barrelModel[8] = new ModelRendererTurbo(this, 3000, 3980, textureX, textureY); // Box 962
		barrelModel[9] = new ModelRendererTurbo(this, 3000, 4036, textureX, textureY); // Box 964
		barrelModel[10] = new ModelRendererTurbo(this, 3400, 0, textureX, textureY); // Box 965
		barrelModel[11] = new ModelRendererTurbo(this, 3400, 33, textureX, textureY); // Box 966
		barrelModel[12] = new ModelRendererTurbo(this, 3400, 78, textureX, textureY); // Box 967
		barrelModel[13] = new ModelRendererTurbo(this, 3400, 126, textureX, textureY); // Box 968
		barrelModel[14] = new ModelRendererTurbo(this, 3400, 170, textureX, textureY); // Box 969
		barrelModel[15] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 970
		barrelModel[16] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 971
		barrelModel[17] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 972
		barrelModel[18] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 973
		barrelModel[19] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 974
		barrelModel[20] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 975
		barrelModel[21] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 976
		barrelModel[22] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 977
		barrelModel[23] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 978
		barrelModel[24] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 979
		barrelModel[25] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 980
		barrelModel[26] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 981
		barrelModel[27] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 982
		barrelModel[28] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 983
		barrelModel[29] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 984
		barrelModel[30] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 985
		barrelModel[31] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 986
		barrelModel[32] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 987
		barrelModel[33] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 988
		barrelModel[34] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 989
		barrelModel[35] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 990
		barrelModel[36] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 991
		barrelModel[37] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 992
		barrelModel[38] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 993
		barrelModel[39] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 994
		barrelModel[40] = new ModelRendererTurbo(this, 3500, 311, textureX, textureY); // Box 995
		barrelModel[41] = new ModelRendererTurbo(this, 3500, 344, textureX, textureY); // Box 996
		barrelModel[42] = new ModelRendererTurbo(this, 3500, 392, textureX, textureY); // Box 997
		barrelModel[43] = new ModelRendererTurbo(this, 3495, 439, textureX, textureY); // Box 998
		barrelModel[44] = new ModelRendererTurbo(this, 3500, 483, textureX, textureY); // Box 999
		barrelModel[45] = new ModelRendererTurbo(this, 3400, 518, textureX, textureY); // Box 1000
		barrelModel[46] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1008
		barrelModel[47] = new ModelRendererTurbo(this, 3400, 550, textureX, textureY); // Box 1009
		barrelModel[48] = new ModelRendererTurbo(this, 3400, 566, textureX, textureY); // Box 1012
		barrelModel[49] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 1009
		barrelModel[50] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 1010
		barrelModel[51] = new ModelRendererTurbo(this, 3000, 3697, textureX, textureY); // Box 1011
		barrelModel[52] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 1012
		barrelModel[53] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 1013
		barrelModel[54] = new ModelRendererTurbo(this, 3000, 4036, textureX, textureY); // Box 1014
		barrelModel[55] = new ModelRendererTurbo(this, 3000, 3980, textureX, textureY); // Box 1015
		barrelModel[56] = new ModelRendererTurbo(this, 3000, 3821, textureX, textureY); // Box 1016
		barrelModel[57] = new ModelRendererTurbo(this, 3000, 3882, textureX, textureY); // Box 1017
		barrelModel[58] = new ModelRendererTurbo(this, 3000, 3940, textureX, textureY); // Box 1018
		barrelModel[59] = new ModelRendererTurbo(this, 3400, 0, textureX, textureY); // Box 1019
		barrelModel[60] = new ModelRendererTurbo(this, 3400, 33, textureX, textureY); // Box 1020
		barrelModel[61] = new ModelRendererTurbo(this, 3400, 78, textureX, textureY); // Box 1021
		barrelModel[62] = new ModelRendererTurbo(this, 3400, 126, textureX, textureY); // Box 1022
		barrelModel[63] = new ModelRendererTurbo(this, 3400, 170, textureX, textureY); // Box 1023
		barrelModel[64] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1024
		barrelModel[65] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1025
		barrelModel[66] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1026
		barrelModel[67] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1027
		barrelModel[68] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1028
		barrelModel[69] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 1029
		barrelModel[70] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 1030
		barrelModel[71] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 1031
		barrelModel[72] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 1032
		barrelModel[73] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 1033
		barrelModel[74] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1034
		barrelModel[75] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1035
		barrelModel[76] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1036
		barrelModel[77] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1037
		barrelModel[78] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1038
		barrelModel[79] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 1039
		barrelModel[80] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 1040
		barrelModel[81] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 1041
		barrelModel[82] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 1042
		barrelModel[83] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 1043
		barrelModel[84] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1044
		barrelModel[85] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1045
		barrelModel[86] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1046
		barrelModel[87] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1047
		barrelModel[88] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1048
		barrelModel[89] = new ModelRendererTurbo(this, 3500, 483, textureX, textureY); // Box 1049
		barrelModel[90] = new ModelRendererTurbo(this, 3495, 439, textureX, textureY); // Box 1050
		barrelModel[91] = new ModelRendererTurbo(this, 3500, 392, textureX, textureY); // Box 1051
		barrelModel[92] = new ModelRendererTurbo(this, 3500, 344, textureX, textureY); // Box 1052
		barrelModel[93] = new ModelRendererTurbo(this, 3500, 311, textureX, textureY); // Box 1053
		barrelModel[94] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 1066
		barrelModel[95] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 1067
		barrelModel[96] = new ModelRendererTurbo(this, 3000, 3697, textureX, textureY); // Box 1068
		barrelModel[97] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 1069
		barrelModel[98] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 1070
		barrelModel[99] = new ModelRendererTurbo(this, 3000, 4036, textureX, textureY); // Box 1071
		barrelModel[100] = new ModelRendererTurbo(this, 3000, 3980, textureX, textureY); // Box 1072
		barrelModel[101] = new ModelRendererTurbo(this, 3000, 3821, textureX, textureY); // Box 1073
		barrelModel[102] = new ModelRendererTurbo(this, 3000, 3882, textureX, textureY); // Box 1074
		barrelModel[103] = new ModelRendererTurbo(this, 3000, 3940, textureX, textureY); // Box 1075
		barrelModel[104] = new ModelRendererTurbo(this, 3400, 0, textureX, textureY); // Box 1076
		barrelModel[105] = new ModelRendererTurbo(this, 3400, 33, textureX, textureY); // Box 1077
		barrelModel[106] = new ModelRendererTurbo(this, 3400, 78, textureX, textureY); // Box 1078
		barrelModel[107] = new ModelRendererTurbo(this, 3400, 126, textureX, textureY); // Box 1079
		barrelModel[108] = new ModelRendererTurbo(this, 3400, 170, textureX, textureY); // Box 1080
		barrelModel[109] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1081
		barrelModel[110] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1082
		barrelModel[111] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1083
		barrelModel[112] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1084
		barrelModel[113] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1085
		barrelModel[114] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 1086
		barrelModel[115] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 1087
		barrelModel[116] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 1088
		barrelModel[117] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 1089
		barrelModel[118] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 1090
		barrelModel[119] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1091
		barrelModel[120] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1092
		barrelModel[121] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1093
		barrelModel[122] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1094
		barrelModel[123] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1095
		barrelModel[124] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 1096
		barrelModel[125] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 1097
		barrelModel[126] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 1098
		barrelModel[127] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 1099
		barrelModel[128] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 1100
		barrelModel[129] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1101
		barrelModel[130] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1102
		barrelModel[131] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1103
		barrelModel[132] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1104
		barrelModel[133] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1105
		barrelModel[134] = new ModelRendererTurbo(this, 3500, 483, textureX, textureY); // Box 1106
		barrelModel[135] = new ModelRendererTurbo(this, 3495, 439, textureX, textureY); // Box 1107
		barrelModel[136] = new ModelRendererTurbo(this, 3500, 392, textureX, textureY); // Box 1108
		barrelModel[137] = new ModelRendererTurbo(this, 3500, 344, textureX, textureY); // Box 1109
		barrelModel[138] = new ModelRendererTurbo(this, 3500, 311, textureX, textureY); // Box 1110
		barrelModel[139] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 1123
		barrelModel[140] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 1124
		barrelModel[141] = new ModelRendererTurbo(this, 3000, 3697, textureX, textureY); // Box 1125
		barrelModel[142] = new ModelRendererTurbo(this, 3000, 3789, textureX, textureY); // Box 1126
		barrelModel[143] = new ModelRendererTurbo(this, 3000, 3744, textureX, textureY); // Box 1127
		barrelModel[144] = new ModelRendererTurbo(this, 3000, 4036, textureX, textureY); // Box 1128
		barrelModel[145] = new ModelRendererTurbo(this, 3000, 3980, textureX, textureY); // Box 1129
		barrelModel[146] = new ModelRendererTurbo(this, 3000, 3821, textureX, textureY); // Box 1130
		barrelModel[147] = new ModelRendererTurbo(this, 3000, 3882, textureX, textureY); // Box 1131
		barrelModel[148] = new ModelRendererTurbo(this, 3000, 3940, textureX, textureY); // Box 1132
		barrelModel[149] = new ModelRendererTurbo(this, 3400, 0, textureX, textureY); // Box 1133
		barrelModel[150] = new ModelRendererTurbo(this, 3400, 33, textureX, textureY); // Box 1134
		barrelModel[151] = new ModelRendererTurbo(this, 3400, 78, textureX, textureY); // Box 1135
		barrelModel[152] = new ModelRendererTurbo(this, 3400, 126, textureX, textureY); // Box 1136
		barrelModel[153] = new ModelRendererTurbo(this, 3400, 170, textureX, textureY); // Box 1137
		barrelModel[154] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1138
		barrelModel[155] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1139
		barrelModel[156] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1140
		barrelModel[157] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1141
		barrelModel[158] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1142
		barrelModel[159] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 1143
		barrelModel[160] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 1144
		barrelModel[161] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 1145
		barrelModel[162] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 1146
		barrelModel[163] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 1147
		barrelModel[164] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1148
		barrelModel[165] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1149
		barrelModel[166] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1150
		barrelModel[167] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1151
		barrelModel[168] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1152
		barrelModel[169] = new ModelRendererTurbo(this, 3400, 483, textureX, textureY); // Box 1153
		barrelModel[170] = new ModelRendererTurbo(this, 3395, 439, textureX, textureY); // Box 1154
		barrelModel[171] = new ModelRendererTurbo(this, 3400, 311, textureX, textureY); // Box 1155
		barrelModel[172] = new ModelRendererTurbo(this, 3400, 344, textureX, textureY); // Box 1156
		barrelModel[173] = new ModelRendererTurbo(this, 3400, 392, textureX, textureY); // Box 1157
		barrelModel[174] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1158
		barrelModel[175] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1159
		barrelModel[176] = new ModelRendererTurbo(this, 3400, 203, textureX, textureY); // Box 1160
		barrelModel[177] = new ModelRendererTurbo(this, 3400, 283, textureX, textureY); // Box 1161
		barrelModel[178] = new ModelRendererTurbo(this, 3405, 245, textureX, textureY); // Box 1162
		barrelModel[179] = new ModelRendererTurbo(this, 3500, 483, textureX, textureY); // Box 1163
		barrelModel[180] = new ModelRendererTurbo(this, 3495, 439, textureX, textureY); // Box 1164
		barrelModel[181] = new ModelRendererTurbo(this, 3500, 392, textureX, textureY); // Box 1165
		barrelModel[182] = new ModelRendererTurbo(this, 3500, 344, textureX, textureY); // Box 1166
		barrelModel[183] = new ModelRendererTurbo(this, 3500, 311, textureX, textureY); // Box 1167
		barrelModel[184] = new ModelRendererTurbo(this, 3400, 584, textureX, textureY); // Box 1180
		barrelModel[185] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1181
		barrelModel[186] = new ModelRendererTurbo(this, 3400, 600, textureX, textureY); // Box 1182
		barrelModel[187] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1183
		barrelModel[188] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1184
		barrelModel[189] = new ModelRendererTurbo(this, 3400, 620, textureX, textureY); // Box 1185
		barrelModel[190] = new ModelRendererTurbo(this, 3400, 634, textureX, textureY); // Box 1186
		barrelModel[191] = new ModelRendererTurbo(this, 3400, 650, textureX, textureY); // Box 1187
		barrelModel[192] = new ModelRendererTurbo(this, 3400, 620, textureX, textureY); // Box 1212
		barrelModel[193] = new ModelRendererTurbo(this, 3400, 650, textureX, textureY); // Box 1213
		barrelModel[194] = new ModelRendererTurbo(this, 3400, 566, textureX, textureY); // Box 1214
		barrelModel[195] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1215
		barrelModel[196] = new ModelRendererTurbo(this, 3400, 634, textureX, textureY); // Box 1216
		barrelModel[197] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1217
		barrelModel[198] = new ModelRendererTurbo(this, 3400, 600, textureX, textureY); // Box 1218
		barrelModel[199] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1219
		barrelModel[200] = new ModelRendererTurbo(this, 3400, 584, textureX, textureY); // Box 1220
		barrelModel[201] = new ModelRendererTurbo(this, 3400, 550, textureX, textureY); // Box 1221
		barrelModel[202] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1222
		barrelModel[203] = new ModelRendererTurbo(this, 3400, 518, textureX, textureY); // Box 1223
		barrelModel[204] = new ModelRendererTurbo(this, 3400, 620, textureX, textureY); // Box 1224
		barrelModel[205] = new ModelRendererTurbo(this, 3400, 650, textureX, textureY); // Box 1225
		barrelModel[206] = new ModelRendererTurbo(this, 3400, 566, textureX, textureY); // Box 1226
		barrelModel[207] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1227
		barrelModel[208] = new ModelRendererTurbo(this, 3400, 634, textureX, textureY); // Box 1228
		barrelModel[209] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1229
		barrelModel[210] = new ModelRendererTurbo(this, 3400, 600, textureX, textureY); // Box 1230
		barrelModel[211] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1231
		barrelModel[212] = new ModelRendererTurbo(this, 3400, 584, textureX, textureY); // Box 1232
		barrelModel[213] = new ModelRendererTurbo(this, 3400, 550, textureX, textureY); // Box 1233
		barrelModel[214] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1234
		barrelModel[215] = new ModelRendererTurbo(this, 3400, 518, textureX, textureY); // Box 1235
		barrelModel[216] = new ModelRendererTurbo(this, 3400, 566, textureX, textureY); // Box 1236
		barrelModel[217] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1237
		barrelModel[218] = new ModelRendererTurbo(this, 3400, 634, textureX, textureY); // Box 1238
		barrelModel[219] = new ModelRendererTurbo(this, 3400, 650, textureX, textureY); // Box 1239
		barrelModel[220] = new ModelRendererTurbo(this, 3400, 620, textureX, textureY); // Box 1240
		barrelModel[221] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1241
		barrelModel[222] = new ModelRendererTurbo(this, 3400, 600, textureX, textureY); // Box 1242
		barrelModel[223] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1243
		barrelModel[224] = new ModelRendererTurbo(this, 3400, 584, textureX, textureY); // Box 1244
		barrelModel[225] = new ModelRendererTurbo(this, 3400, 518, textureX, textureY); // Box 1245
		barrelModel[226] = new ModelRendererTurbo(this, 3400, 550, textureX, textureY); // Box 1246
		barrelModel[227] = new ModelRendererTurbo(this, 3400, 539, textureX, textureY); // Box 1247

		barrelModel[0].addShapeBox(-10F, -5.5F, -16.5F, 27, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		barrelModel[0].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[1].addShapeBox(-10F, -12.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		barrelModel[1].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[2].addShapeBox(-10F, -16.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 956
		barrelModel[2].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[3].addShapeBox(-10F, 5.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 957
		barrelModel[3].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[4].addShapeBox(-10F, 12.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 958
		barrelModel[4].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[5].addShapeBox(17F, -7F, -21F, 117, 14, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		barrelModel[5].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[6].addShapeBox(17F, -16F, -21F, 117, 9, 42, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		barrelModel[6].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[7].addShapeBox(17F, -21F, -16F, 117, 5, 32, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 961
		barrelModel[7].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[8].addShapeBox(17F, 7F, -21F, 117, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 962
		barrelModel[8].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[9].addShapeBox(17F, 16F, -16F, 117, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 964
		barrelModel[9].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[10].addShapeBox(134F, -16.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		barrelModel[10].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[11].addShapeBox(134F, -12.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		barrelModel[11].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[12].addShapeBox(134F, -5.5F, -16.5F, 12, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		barrelModel[12].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[13].addShapeBox(134F, 5.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 968
		barrelModel[13].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[14].addShapeBox(134F, 12.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 969
		barrelModel[14].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[15].addShapeBox(146F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		barrelModel[15].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[16].addShapeBox(146F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		barrelModel[16].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[17].addShapeBox(146F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		barrelModel[17].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[18].addShapeBox(146F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 973
		barrelModel[18].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[19].addShapeBox(146F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 974
		barrelModel[19].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[20].addShapeBox(158F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 975
		barrelModel[20].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[21].addShapeBox(158F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 976
		barrelModel[21].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[22].addShapeBox(158F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		barrelModel[22].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[23].addShapeBox(158F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		barrelModel[23].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[24].addShapeBox(158F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		barrelModel[24].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[25].addShapeBox(179F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 980
		barrelModel[25].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[26].addShapeBox(179F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 981
		barrelModel[26].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[27].addShapeBox(179F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 982
		barrelModel[27].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[28].addShapeBox(179F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		barrelModel[28].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[29].addShapeBox(179F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 984
		barrelModel[29].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[30].addShapeBox(167F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 985
		barrelModel[30].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[31].addShapeBox(167F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		barrelModel[31].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[32].addShapeBox(167F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 987
		barrelModel[32].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[33].addShapeBox(167F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 988
		barrelModel[33].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[34].addShapeBox(167F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 989
		barrelModel[34].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[35].addShapeBox(188F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		barrelModel[35].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[36].addShapeBox(188F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		barrelModel[36].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[37].addShapeBox(188F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 992
		barrelModel[37].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[38].addShapeBox(188F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 993
		barrelModel[38].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[39].addShapeBox(188F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 994
		barrelModel[39].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[40].addShapeBox(200F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 995
		barrelModel[40].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[41].addShapeBox(200F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 996
		barrelModel[41].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[42].addShapeBox(200F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 997
		barrelModel[42].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[43].addShapeBox(200F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		barrelModel[43].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[44].addShapeBox(200F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 999
		barrelModel[44].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[45].addShapeBox(209F, -16.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 1000
		barrelModel[45].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[46].addShapeBox(209F, -12.5F, -16.5F, 277, 4, 4, 0F,0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 1008
		barrelModel[46].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[47].addShapeBox(209F, -16.5F, -12.5F, 277, 4, 7, 0F,0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 1009
		barrelModel[47].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[48].addShapeBox(209F, -5.5F, -16.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1012
		barrelModel[48].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[49].addShapeBox(-10F, -16.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		barrelModel[49].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[50].addShapeBox(-10F, -12.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		barrelModel[50].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[51].addShapeBox(-10F, -5.5F, -16.5F, 27, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		barrelModel[51].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[52].addShapeBox(-10F, 12.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1012
		barrelModel[52].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[53].addShapeBox(-10F, 5.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1013
		barrelModel[53].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[54].addShapeBox(17F, 16F, -16F, 117, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 1014
		barrelModel[54].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[55].addShapeBox(17F, 7F, -21F, 117, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 1015
		barrelModel[55].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[56].addShapeBox(17F, -7F, -21F, 117, 14, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		barrelModel[56].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[57].addShapeBox(17F, -16F, -21F, 117, 9, 42, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		barrelModel[57].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[58].addShapeBox(17F, -21F, -16F, 117, 5, 32, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		barrelModel[58].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[59].addShapeBox(134F, -16.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		barrelModel[59].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[60].addShapeBox(134F, -12.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		barrelModel[60].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[61].addShapeBox(134F, -5.5F, -16.5F, 12, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		barrelModel[61].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[62].addShapeBox(134F, 5.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1022
		barrelModel[62].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[63].addShapeBox(134F, 12.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1023
		barrelModel[63].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[64].addShapeBox(146F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1024
		barrelModel[64].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[65].addShapeBox(146F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1025
		barrelModel[65].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[66].addShapeBox(146F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		barrelModel[66].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[67].addShapeBox(146F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1027
		barrelModel[67].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[68].addShapeBox(146F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		barrelModel[68].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[69].addShapeBox(158F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1029
		barrelModel[69].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[70].addShapeBox(158F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		barrelModel[70].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[71].addShapeBox(158F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		barrelModel[71].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[72].addShapeBox(158F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1032
		barrelModel[72].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[73].addShapeBox(158F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1033
		barrelModel[73].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[74].addShapeBox(167F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1034
		barrelModel[74].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[75].addShapeBox(167F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1035
		barrelModel[75].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[76].addShapeBox(167F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		barrelModel[76].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[77].addShapeBox(167F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		barrelModel[77].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[78].addShapeBox(167F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		barrelModel[78].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[79].addShapeBox(179F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		barrelModel[79].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[80].addShapeBox(179F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1040
		barrelModel[80].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[81].addShapeBox(179F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1041
		barrelModel[81].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[82].addShapeBox(179F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1042
		barrelModel[82].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[83].addShapeBox(179F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		barrelModel[83].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[84].addShapeBox(188F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1044
		barrelModel[84].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[85].addShapeBox(188F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1045
		barrelModel[85].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[86].addShapeBox(188F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		barrelModel[86].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[87].addShapeBox(188F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		barrelModel[87].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[88].addShapeBox(188F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048
		barrelModel[88].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[89].addShapeBox(200F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		barrelModel[89].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[90].addShapeBox(200F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		barrelModel[90].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[91].addShapeBox(200F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051
		barrelModel[91].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[92].addShapeBox(200F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1052
		barrelModel[92].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[93].addShapeBox(200F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1053
		barrelModel[93].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[94].addShapeBox(-10F, -16.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1066
		barrelModel[94].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[95].addShapeBox(-10F, -12.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1067
		barrelModel[95].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[96].addShapeBox(-10F, -5.5F, -16.5F, 27, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		barrelModel[96].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[97].addShapeBox(-10F, 12.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1069
		barrelModel[97].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[98].addShapeBox(-10F, 5.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1070
		barrelModel[98].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[99].addShapeBox(17F, 16F, -16F, 117, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 1071
		barrelModel[99].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[100].addShapeBox(17F, 7F, -21F, 117, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 1072
		barrelModel[100].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[101].addShapeBox(17F, -7F, -21F, 117, 14, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1073
		barrelModel[101].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[102].addShapeBox(17F, -16F, -21F, 117, 9, 42, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1074
		barrelModel[102].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[103].addShapeBox(17F, -21F, -16F, 117, 5, 32, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1075
		barrelModel[103].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[104].addShapeBox(134F, -16.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		barrelModel[104].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[105].addShapeBox(134F, -12.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1077
		barrelModel[105].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[106].addShapeBox(134F, -5.5F, -16.5F, 12, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		barrelModel[106].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[107].addShapeBox(134F, 5.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1079
		barrelModel[107].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[108].addShapeBox(134F, 12.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1080
		barrelModel[108].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[109].addShapeBox(146F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1081
		barrelModel[109].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[110].addShapeBox(146F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1082
		barrelModel[110].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[111].addShapeBox(146F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1083
		barrelModel[111].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[112].addShapeBox(146F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		barrelModel[112].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[113].addShapeBox(146F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1085
		barrelModel[113].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[114].addShapeBox(158F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		barrelModel[114].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[115].addShapeBox(158F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087
		barrelModel[115].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[116].addShapeBox(158F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		barrelModel[116].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[117].addShapeBox(158F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1089
		barrelModel[117].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[118].addShapeBox(158F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1090
		barrelModel[118].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[119].addShapeBox(167F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1091
		barrelModel[119].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[120].addShapeBox(167F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1092
		barrelModel[120].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[121].addShapeBox(167F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1093
		barrelModel[121].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[122].addShapeBox(167F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1094
		barrelModel[122].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[123].addShapeBox(167F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1095
		barrelModel[123].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[124].addShapeBox(179F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1096
		barrelModel[124].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[125].addShapeBox(179F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1097
		barrelModel[125].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[126].addShapeBox(179F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1098
		barrelModel[126].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[127].addShapeBox(179F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1099
		barrelModel[127].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[128].addShapeBox(179F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1100
		barrelModel[128].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[129].addShapeBox(188F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1101
		barrelModel[129].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[130].addShapeBox(188F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1102
		barrelModel[130].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[131].addShapeBox(188F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1103
		barrelModel[131].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[132].addShapeBox(188F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		barrelModel[132].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[133].addShapeBox(188F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1105
		barrelModel[133].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[134].addShapeBox(200F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1106
		barrelModel[134].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[135].addShapeBox(200F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1107
		barrelModel[135].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[136].addShapeBox(200F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1108
		barrelModel[136].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[137].addShapeBox(200F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1109
		barrelModel[137].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[138].addShapeBox(200F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1110
		barrelModel[138].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[139].addShapeBox(-10F, -16.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1123
		barrelModel[139].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[140].addShapeBox(-10F, -12.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1124
		barrelModel[140].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[141].addShapeBox(-10F, -5.5F, -16.5F, 27, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1125
		barrelModel[141].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[142].addShapeBox(-10F, 12.5F, -12.5F, 27, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1126
		barrelModel[142].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[143].addShapeBox(-10F, 5.5F, -16.5F, 27, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1127
		barrelModel[143].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[144].addShapeBox(17F, 16F, -16F, 117, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 1128
		barrelModel[144].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[145].addShapeBox(17F, 7F, -21F, 117, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 1129
		barrelModel[145].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[146].addShapeBox(17F, -7F, -21F, 117, 14, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1130
		barrelModel[146].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[147].addShapeBox(17F, -16F, -21F, 117, 9, 42, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1131
		barrelModel[147].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[148].addShapeBox(17F, -21F, -16F, 117, 5, 32, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1132
		barrelModel[148].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[149].addShapeBox(134F, -16.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1133
		barrelModel[149].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[150].addShapeBox(134F, -12.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1134
		barrelModel[150].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[151].addShapeBox(134F, -5.5F, -16.5F, 12, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1135
		barrelModel[151].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[152].addShapeBox(134F, 5.5F, -16.5F, 12, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1136
		barrelModel[152].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[153].addShapeBox(134F, 12.5F, -12.5F, 12, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1137
		barrelModel[153].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[154].addShapeBox(146F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1138
		barrelModel[154].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[155].addShapeBox(146F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1139
		barrelModel[155].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[156].addShapeBox(146F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1140
		barrelModel[156].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[157].addShapeBox(146F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		barrelModel[157].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[158].addShapeBox(146F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1142
		barrelModel[158].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[159].addShapeBox(158F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1143
		barrelModel[159].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[160].addShapeBox(158F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1144
		barrelModel[160].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[161].addShapeBox(158F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1145
		barrelModel[161].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[162].addShapeBox(158F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1146
		barrelModel[162].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[163].addShapeBox(158F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1147
		barrelModel[163].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[164].addShapeBox(167F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1148
		barrelModel[164].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[165].addShapeBox(167F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1149
		barrelModel[165].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[166].addShapeBox(167F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1150
		barrelModel[166].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[167].addShapeBox(167F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1151
		barrelModel[167].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[168].addShapeBox(167F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1152
		barrelModel[168].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[169].addShapeBox(179F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1153
		barrelModel[169].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[170].addShapeBox(179F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1154
		barrelModel[170].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[171].addShapeBox(179F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1155
		barrelModel[171].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[172].addShapeBox(179F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1156
		barrelModel[172].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[173].addShapeBox(179F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1157
		barrelModel[173].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[174].addShapeBox(188F, 10.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1158
		barrelModel[174].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[175].addShapeBox(188F, 4.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1159
		barrelModel[175].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[176].addShapeBox(188F, -4.5F, -13.5F, 12, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1160
		barrelModel[176].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[177].addShapeBox(188F, -13.5F, -10.5F, 12, 3, 21, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1161
		barrelModel[177].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[178].addShapeBox(188F, -10.5F, -13.5F, 12, 6, 27, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1162
		barrelModel[178].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[179].addShapeBox(200F, -16.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1163
		barrelModel[179].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[180].addShapeBox(200F, -12.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1164
		barrelModel[180].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[181].addShapeBox(200F, -5.5F, -16.5F, 9, 11, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1165
		barrelModel[181].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[182].addShapeBox(200F, 5.5F, -16.5F, 9, 7, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1166
		barrelModel[182].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[183].addShapeBox(200F, 12.5F, -12.5F, 9, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 1167
		barrelModel[183].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[184].addShapeBox(209F, -16.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F); // Box 1180
		barrelModel[184].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[185].addShapeBox(209F, -12.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -9F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F); // Box 1181
		barrelModel[185].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[186].addShapeBox(209F, -5.5F, 12.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3.9F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 1182
		barrelModel[186].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[187].addShapeBox(209F, 8.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, -2F, 3.9F, 0F, -9F, -4F, 0F, -7F, 0F); // Box 1183
		barrelModel[187].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[188].addShapeBox(209F, 8.5F, -16.5F, 277, 4, 4, 0F,0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1184
		barrelModel[188].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[189].addShapeBox(209F, 12.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F); // Box 1185
		barrelModel[189].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[190].addShapeBox(209F, 12.5F, -12.5F, 277, 4, 7, 0F,0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F); // Box 1186
		barrelModel[190].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[191].addShapeBox(209F, 12.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 1187
		barrelModel[191].setRotationPoint(-33F, -412.5F, -84F);

		barrelModel[192].addShapeBox(209F, 12.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F); // Box 1212
		barrelModel[192].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[193].addShapeBox(209F, 12.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 1213
		barrelModel[193].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[194].addShapeBox(209F, -5.5F, -16.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1214
		barrelModel[194].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[195].addShapeBox(209F, 8.5F, -16.5F, 277, 4, 4, 0F,0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1215
		barrelModel[195].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[196].addShapeBox(209F, 12.5F, -12.5F, 277, 4, 7, 0F,0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F); // Box 1216
		barrelModel[196].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[197].addShapeBox(209F, 8.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, -2F, 3.9F, 0F, -9F, -4F, 0F, -7F, 0F); // Box 1217
		barrelModel[197].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[198].addShapeBox(209F, -5.5F, 12.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 1218
		barrelModel[198].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[199].addShapeBox(209F, -12.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -9F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F); // Box 1219
		barrelModel[199].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[200].addShapeBox(209F, -16.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F); // Box 1220
		barrelModel[200].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[201].addShapeBox(209F, -16.5F, -12.5F, 277, 4, 7, 0F,0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 1221
		barrelModel[201].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[202].addShapeBox(209F, -12.5F, -16.5F, 277, 4, 4, 0F,0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 1222
		barrelModel[202].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[203].addShapeBox(209F, -16.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 1223
		barrelModel[203].setRotationPoint(-33F, -437.5F, -30F);

		barrelModel[204].addShapeBox(209F, 12.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F); // Box 1224
		barrelModel[204].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[205].addShapeBox(209F, 12.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 1225
		barrelModel[205].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[206].addShapeBox(209F, -5.5F, -16.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1226
		barrelModel[206].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[207].addShapeBox(209F, 8.5F, -16.5F, 277, 4, 4, 0F,0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1227
		barrelModel[207].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[208].addShapeBox(209F, 12.5F, -12.5F, 277, 4, 7, 0F,0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F); // Box 1228
		barrelModel[208].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[209].addShapeBox(209F, 8.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, -2F, 3.9F, 0F, -9F, -4F, 0F, -7F, 0F); // Box 1229
		barrelModel[209].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[210].addShapeBox(209F, -5.5F, 12.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 1230
		barrelModel[210].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[211].addShapeBox(209F, -12.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -9F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F); // Box 1231
		barrelModel[211].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[212].addShapeBox(209F, -16.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F); // Box 1232
		barrelModel[212].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[213].addShapeBox(209F, -16.5F, -12.5F, 277, 4, 7, 0F,0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 1233
		barrelModel[213].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[214].addShapeBox(209F, -12.5F, -16.5F, 277, 4, 4, 0F,0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 1234
		barrelModel[214].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[215].addShapeBox(209F, -16.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 1235
		barrelModel[215].setRotationPoint(-33F, -437.5F, 30F);

		barrelModel[216].addShapeBox(209F, -5.5F, -16.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1236
		barrelModel[216].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[217].addShapeBox(209F, 8.5F, -16.5F, 277, 4, 4, 0F,0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 1237
		barrelModel[217].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[218].addShapeBox(209F, 12.5F, -12.5F, 277, 4, 7, 0F,0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F); // Box 1238
		barrelModel[218].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[219].addShapeBox(209F, 12.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 1239
		barrelModel[219].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[220].addShapeBox(209F, 12.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F); // Box 1240
		barrelModel[220].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[221].addShapeBox(209F, 8.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, -2F, 3.9F, 0F, -9F, -4F, 0F, -7F, 0F); // Box 1241
		barrelModel[221].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[222].addShapeBox(209F, -5.5F, 12.5F, 277, 11, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 1242
		barrelModel[222].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[223].addShapeBox(209F, -12.5F, 12.5F, 277, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -9F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 5F, -8F, 0F, 3F, -4F); // Box 1243
		barrelModel[223].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[224].addShapeBox(209F, -16.5F, 5.5F, 277, 4, 7, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 9F, -4F, 0F, 7F, 0F); // Box 1244
		barrelModel[224].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[225].addShapeBox(209F, -16.5F, -5.5F, 277, 4, 11, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 1245
		barrelModel[225].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[226].addShapeBox(209F, -16.5F, -12.5F, 277, 4, 7, 0F,0F, -4F, 0F, 0F, -6F, -4F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 9F, -4F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 1246
		barrelModel[226].setRotationPoint(-33F, -412.5F, 84F);

		barrelModel[227].addShapeBox(209F, -12.5F, -16.5F, 277, 4, 4, 0F,0F, -7F, 0F, 0F, -9F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 5F, -8F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 1247
		barrelModel[227].setRotationPoint(-33F, -412.5F, 84F);
	}
}