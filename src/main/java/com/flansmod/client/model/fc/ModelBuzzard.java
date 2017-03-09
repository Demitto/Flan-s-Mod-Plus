//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.6
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBuzzard extends ModelPlane
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelBuzzard()
	{
		bodyModel = new ModelRendererTurbo[427];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 85, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 106, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 0, 124, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 0, 168, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 0, 186, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 0, 231, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 0, 297, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 0, 297, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 0, 347, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 0, 356, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 0, 363, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 0, 373, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 0, 383, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 0, 383, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 0, 383, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 0, 383, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 0, 373, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 0, 356, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 0, 363, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 0, 389, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 0, 402, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 0, 411, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 0, 411, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 0, 397, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 0, 419, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 0, 547, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 0, 556, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 0, 567, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 0, 567, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 0, 572, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 0, 572, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 0, 567, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 0, 567, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 0, 556, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 0, 547, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 0, 554, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 0, 597, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 0, 624, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 0, 597, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 0, 624, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 0, 651, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 0, 716, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 0, 716, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 0, 717, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 0, 752, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 0, 789, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 0, 798, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 0, 798, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 0, 789, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 0, 809, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 0, 809, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 0, 809, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 0, 809, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 0, 818, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 0, 821, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 0, 821, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 0, 854, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 0, 888, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 0, 896, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 0, 901, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 0, 901, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 0, 124, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 0, 168, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 0, 186, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 0, 203, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 0, 231, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 0, 297, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 0, 297, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 0, 85, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 0, 106, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 0, 356, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 0, 363, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 0, 347, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 0, 389, textureX, textureY); // Box 125
		bodyModel[126] = new ModelRendererTurbo(this, 0, 419, textureX, textureY); // Box 126
		bodyModel[127] = new ModelRendererTurbo(this, 0, 402, textureX, textureY); // Box 127
		bodyModel[128] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 0, 411, textureX, textureY); // Box 129
		bodyModel[130] = new ModelRendererTurbo(this, 0, 411, textureX, textureY); // Box 130
		bodyModel[131] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 131
		bodyModel[132] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 132
		bodyModel[133] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 133
		bodyModel[134] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 134
		bodyModel[135] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 136
		bodyModel[137] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 0, 397, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Box 139
		bodyModel[140] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 141
		bodyModel[142] = new ModelRendererTurbo(this, 0, 443, textureX, textureY); // Box 142
		bodyModel[143] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 143
		bodyModel[144] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Box 144
		bodyModel[145] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 0, 962, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Box 148
		bodyModel[148] = new ModelRendererTurbo(this, 0, 991, textureX, textureY); // Box 149
		bodyModel[149] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Box 150
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 151
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1023, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1023, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 0, 962, textureX, textureY); // Box 155
		bodyModel[155] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Box 156
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 157
		bodyModel[157] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 0, 991, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Box 161
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 165
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Box 166
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1209, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 180
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 181
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 205
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 206
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 207
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 208
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 209
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 210
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 211
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 212
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 213
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 214
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 215
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 216
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 217
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 218
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 219
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 220
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1209, textureX, textureY); // Box 272
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Box 273
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Box 274
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 275
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 276
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 277
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 278
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 279
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 280
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 281
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 282
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 283
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 284
		bodyModel[233] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 285
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 286
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 287
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 288
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 289
		bodyModel[238] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 290
		bodyModel[239] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 291
		bodyModel[240] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 292
		bodyModel[241] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 293
		bodyModel[242] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 294
		bodyModel[243] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 295
		bodyModel[244] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 296
		bodyModel[245] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 297
		bodyModel[246] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 298
		bodyModel[247] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 299
		bodyModel[248] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 300
		bodyModel[249] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 301
		bodyModel[250] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 302
		bodyModel[251] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 303
		bodyModel[252] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 304
		bodyModel[253] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 305
		bodyModel[254] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 306
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 307
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 308
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 309
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 310
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 311
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 312
		bodyModel[261] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 313
		bodyModel[262] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 314
		bodyModel[263] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 315
		bodyModel[264] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 316
		bodyModel[265] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 317
		bodyModel[266] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 318
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 319
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 320
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 321
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 322
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 323
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 324
		bodyModel[273] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Box 325
		bodyModel[274] = new ModelRendererTurbo(this, 0, 1269, textureX, textureY); // Box 326
		bodyModel[275] = new ModelRendererTurbo(this, 0, 1314, textureX, textureY); // Box 327
		bodyModel[276] = new ModelRendererTurbo(this, 0, 1381, textureX, textureY); // Box 328
		bodyModel[277] = new ModelRendererTurbo(this, 0, 1381, textureX, textureY); // Box 331
		bodyModel[278] = new ModelRendererTurbo(this, 0, 1422, textureX, textureY); // Box 332
		bodyModel[279] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 333
		bodyModel[280] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 334
		bodyModel[281] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 335
		bodyModel[282] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 336
		bodyModel[283] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 337
		bodyModel[284] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 338
		bodyModel[285] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 339
		bodyModel[286] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 340
		bodyModel[287] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 341
		bodyModel[288] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 342
		bodyModel[289] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 343
		bodyModel[290] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 344
		bodyModel[291] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 345
		bodyModel[292] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 346
		bodyModel[293] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 347
		bodyModel[294] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 348
		bodyModel[295] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 349
		bodyModel[296] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 350
		bodyModel[297] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 351
		bodyModel[298] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 352
		bodyModel[299] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 353
		bodyModel[300] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 354
		bodyModel[301] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 355
		bodyModel[302] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 356
		bodyModel[303] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 357
		bodyModel[304] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 358
		bodyModel[305] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 359
		bodyModel[306] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 360
		bodyModel[307] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 361
		bodyModel[308] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 362
		bodyModel[309] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 363
		bodyModel[310] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 364
		bodyModel[311] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 365
		bodyModel[312] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 366
		bodyModel[313] = new ModelRendererTurbo(this, 0, 1478, textureX, textureY); // Box 367
		bodyModel[314] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 368
		bodyModel[315] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 369
		bodyModel[316] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 370
		bodyModel[317] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 371
		bodyModel[318] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 372
		bodyModel[319] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 373
		bodyModel[320] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 374
		bodyModel[321] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 375
		bodyModel[322] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 376
		bodyModel[323] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 377
		bodyModel[324] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 378
		bodyModel[325] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 379
		bodyModel[326] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 380
		bodyModel[327] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 381
		bodyModel[328] = new ModelRendererTurbo(this, 0, 1455, textureX, textureY); // Box 382
		bodyModel[329] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 383
		bodyModel[330] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 384
		bodyModel[331] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 385
		bodyModel[332] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 386
		bodyModel[333] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 387
		bodyModel[334] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 388
		bodyModel[335] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 389
		bodyModel[336] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 390
		bodyModel[337] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 391
		bodyModel[338] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 392
		bodyModel[339] = new ModelRendererTurbo(this, 0, 1422, textureX, textureY); // Box 393
		bodyModel[340] = new ModelRendererTurbo(this, 0, 1459, textureX, textureY); // Box 394
		bodyModel[341] = new ModelRendererTurbo(this, 0, 1523, textureX, textureY); // Box 395
		bodyModel[342] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Box 396
		bodyModel[343] = new ModelRendererTurbo(this, 0, 1549, textureX, textureY); // Box 397
		bodyModel[344] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Box 398
		bodyModel[345] = new ModelRendererTurbo(this, 0, 1557, textureX, textureY); // Box 399
		bodyModel[346] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 400
		bodyModel[347] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 401
		bodyModel[348] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 402
		bodyModel[349] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 403
		bodyModel[350] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 404
		bodyModel[351] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 405
		bodyModel[352] = new ModelRendererTurbo(this, 0, 1557, textureX, textureY); // Box 406
		bodyModel[353] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Box 407
		bodyModel[354] = new ModelRendererTurbo(this, 0, 1549, textureX, textureY); // Box 408
		bodyModel[355] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Box 409
		bodyModel[356] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 410
		bodyModel[357] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 411
		bodyModel[358] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 412
		bodyModel[359] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 413
		bodyModel[360] = new ModelRendererTurbo(this, 0, 1557, textureX, textureY); // Box 414
		bodyModel[361] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Box 415
		bodyModel[362] = new ModelRendererTurbo(this, 0, 1549, textureX, textureY); // Box 416
		bodyModel[363] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Box 417
		bodyModel[364] = new ModelRendererTurbo(this, 0, 1505, textureX, textureY); // Box 418
		bodyModel[365] = new ModelRendererTurbo(this, 0, 1523, textureX, textureY); // Box 419
		bodyModel[366] = new ModelRendererTurbo(this, 0, 1557, textureX, textureY); // Box 420
		bodyModel[367] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Box 421
		bodyModel[368] = new ModelRendererTurbo(this, 0, 1549, textureX, textureY); // Box 422
		bodyModel[369] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Box 423
		bodyModel[370] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 424
		bodyModel[371] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 425
		bodyModel[372] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 426
		bodyModel[373] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 427
		bodyModel[374] = new ModelRendererTurbo(this, 0, 1565, textureX, textureY); // Box 428
		bodyModel[375] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 429
		bodyModel[376] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Box 430
		bodyModel[377] = new ModelRendererTurbo(this, 0, 1615, textureX, textureY); // Box 431
		bodyModel[378] = new ModelRendererTurbo(this, 0, 1615, textureX, textureY); // Box 432
		bodyModel[379] = new ModelRendererTurbo(this, 0, 1656, textureX, textureY); // Box 433
		bodyModel[380] = new ModelRendererTurbo(this, 0, 1731, textureX, textureY); // Box 438
		bodyModel[381] = new ModelRendererTurbo(this, 0, 1753, textureX, textureY); // Box 439
		bodyModel[382] = new ModelRendererTurbo(this, 0, 1731, textureX, textureY); // Box 440
		bodyModel[383] = new ModelRendererTurbo(this, 0, 1753, textureX, textureY); // Box 441
		bodyModel[384] = new ModelRendererTurbo(this, 0, 1768, textureX, textureY); // Box 472
		bodyModel[385] = new ModelRendererTurbo(this, 0, 1768, textureX, textureY); // Box 473
		bodyModel[386] = new ModelRendererTurbo(this, 0, 1820, textureX, textureY); // Box 474
		bodyModel[387] = new ModelRendererTurbo(this, 0, 1768, textureX, textureY); // Box 475
		bodyModel[388] = new ModelRendererTurbo(this, 0, 1806, textureX, textureY); // Box 476
		bodyModel[389] = new ModelRendererTurbo(this, 0, 1786, textureX, textureY); // Box 477
		bodyModel[390] = new ModelRendererTurbo(this, 0, 1806, textureX, textureY); // Box 478
		bodyModel[391] = new ModelRendererTurbo(this, 0, 1786, textureX, textureY); // Box 479
		bodyModel[392] = new ModelRendererTurbo(this, 0, 1768, textureX, textureY); // Box 480
		bodyModel[393] = new ModelRendererTurbo(this, 0, 1840, textureX, textureY); // Box 500
		bodyModel[394] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Box 501
		bodyModel[395] = new ModelRendererTurbo(this, 0, 1915, textureX, textureY); // Box 502
		bodyModel[396] = new ModelRendererTurbo(this, 0, 1915, textureX, textureY); // Box 503
		bodyModel[397] = new ModelRendererTurbo(this, 0, 1915, textureX, textureY); // Box 506
		bodyModel[398] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Box 507
		bodyModel[399] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Box 508
		bodyModel[400] = new ModelRendererTurbo(this, 0, 1967, textureX, textureY); // Box 509
		bodyModel[401] = new ModelRendererTurbo(this, 0, 1967, textureX, textureY); // Box 510
		bodyModel[402] = new ModelRendererTurbo(this, 0, 1985, textureX, textureY); // Box 511
		bodyModel[403] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 512
		bodyModel[404] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 513
		bodyModel[405] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 514
		bodyModel[406] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 515
		bodyModel[407] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 516
		bodyModel[408] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 517
		bodyModel[409] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 518
		bodyModel[410] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 519
		bodyModel[411] = new ModelRendererTurbo(this, 0, 1967, textureX, textureY); // Box 520
		bodyModel[412] = new ModelRendererTurbo(this, 0, 1985, textureX, textureY); // Box 521
		bodyModel[413] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 522
		bodyModel[414] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 523
		bodyModel[415] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 524
		bodyModel[416] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 525
		bodyModel[417] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 526
		bodyModel[418] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 527
		bodyModel[419] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 528
		bodyModel[420] = new ModelRendererTurbo(this, 0, 1998, textureX, textureY); // Box 529
		bodyModel[421] = new ModelRendererTurbo(this, 0, 1967, textureX, textureY); // Box 530
		bodyModel[422] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Box 531
		bodyModel[423] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Box 532
		bodyModel[424] = new ModelRendererTurbo(this, 0, 2011, textureX, textureY); // Box 533
		bodyModel[425] = new ModelRendererTurbo(this, 0, 2011, textureX, textureY); // Box 534
		bodyModel[426] = new ModelRendererTurbo(this, 0, 2027, textureX, textureY); // Box 535

		bodyModel[0].addBox(0F, 0F, 0F, 10, 3, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-100F, -23F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-103F, -23F, -7F);

		bodyModel[2].addBox(0F, -11F, 0F, 3, 11, 14, 0F); // Box 0
		bodyModel[2].setRotationPoint(-93F, -23F, -7F);
		bodyModel[2].rotateAngleZ = -0.13962634F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[3].setRotationPoint(-93F, -23F, -7F);
		bodyModel[3].rotateAngleZ = 0.13962634F;

		bodyModel[4].addShapeBox(0F, -14F, 0F, 3, 3, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-93F, -23F, -7F);
		bodyModel[4].rotateAngleZ = -0.13962634F;

		bodyModel[5].addShapeBox(-2F, -20F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-92F, -23F, -4F);
		bodyModel[5].rotateAngleZ = -0.13962634F;

		bodyModel[6].addShapeBox(-1F, -20F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-91F, -23F, -4F);
		bodyModel[6].rotateAngleZ = -0.13962634F;

		bodyModel[7].addShapeBox(-4F, -20F, 0F, 1, 4, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 0
		bodyModel[7].setRotationPoint(-91F, -23F, -3F);
		bodyModel[7].rotateAngleZ = -0.13962634F;

		bodyModel[8].addShapeBox(-4F, -16F, 0F, 1, 3, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 0
		bodyModel[8].setRotationPoint(-91F, -23F, -3F);
		bodyModel[8].rotateAngleZ = -0.13962634F;

		bodyModel[9].addShapeBox(-3F, -11F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 0
		bodyModel[9].setRotationPoint(-91F, -24F, -5F);
		bodyModel[9].rotateAngleZ = -0.13962634F;

		bodyModel[10].addShapeBox(-3F, -8F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 0
		bodyModel[10].setRotationPoint(-91F, -24F, -5F);
		bodyModel[10].rotateAngleZ = -0.13962634F;

		bodyModel[11].addShapeBox(-3F, -5F, 0F, 1, 4, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 0
		bodyModel[11].setRotationPoint(-91F, -23F, -5F);
		bodyModel[11].rotateAngleZ = -0.13962634F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-100F, -24F, -5F);

		bodyModel[13].addShapeBox(-3F, -11F, 0F, 3, 11, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-93F, -23F, 5F);
		bodyModel[13].rotateAngleZ = -0.13962634F;

		bodyModel[14].addShapeBox(-3F, -11F, 0F, 3, 11, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-93F, -23F, -7F);
		bodyModel[14].rotateAngleZ = -0.13962634F;

		bodyModel[15].addBox(0F, 0F, 0F, 3, 14, 12, 0F); // Box 0
		bodyModel[15].setRotationPoint(-90F, -34F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-89F, -34F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-109F, -29F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-109F, -29F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-108F, -30F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-107.5F, -35F, 7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-106.5F, -35F, 7.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 29, 5, 14, 0F); // Box 0
		bodyModel[22].setRotationPoint(-116F, -20F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-111F, -25F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-111.5F, -24F, 5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-111.5F, -24F, 3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-111.5F, -24F, -4.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-111.5F, -24F, -6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-111F, -25F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-89F, -34F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-109F, -29F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(-108F, -30F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(-107.5F, -35F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-106.5F, -35F, -8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 0
		bodyModel[34].setRotationPoint(-115F, -28F, -2F);

		bodyModel[35].addBox(2F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[35].setRotationPoint(-115F, -36F, -2F);
		bodyModel[35].rotateAngleZ = -0.80285146F;

		bodyModel[36].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-115F, -36F, 2F);
		bodyModel[36].rotateAngleZ = -0.80285146F;

		bodyModel[37].addShapeBox(3F, 0F, 1F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(-115F, -36F, 2F);
		bodyModel[37].rotateAngleZ = -0.80285146F;

		bodyModel[38].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[38].setRotationPoint(-115F, -36F, -3F);
		bodyModel[38].rotateAngleZ = -0.80285146F;

		bodyModel[39].addShapeBox(3F, 0F, -1F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-115F, -36F, -3F);
		bodyModel[39].rotateAngleZ = -0.80285146F;

		bodyModel[40].addShapeBox(0.8F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[40].setRotationPoint(-112F, -33F, 1F);
		bodyModel[40].rotateAngleZ = -0.80285146F;

		bodyModel[41].addShapeBox(0.8F, -0.5F, -1F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[41].setRotationPoint(-112F, -33F, 1F);
		bodyModel[41].rotateAngleZ = -0.80285146F;

		bodyModel[42].addShapeBox(0.8F, -0.5F, -2F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[42].setRotationPoint(-112F, -33F, 1F);
		bodyModel[42].rotateAngleZ = -0.80285146F;

		bodyModel[43].addShapeBox(0.8F, -0.5F, -3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[43].setRotationPoint(-112F, -33F, 1F);
		bodyModel[43].rotateAngleZ = -0.80285146F;

		bodyModel[44].addShapeBox(-0.2F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[44].setRotationPoint(-112F, -33F, 1F);
		bodyModel[44].rotateAngleZ = -0.80285146F;

		bodyModel[45].addShapeBox(-0.2F, -0.5F, -3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[45].setRotationPoint(-112F, -33F, 1F);
		bodyModel[45].rotateAngleZ = -0.80285146F;

		bodyModel[46].addShapeBox(-1.2F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[46].setRotationPoint(-112F, -33F, 1F);
		bodyModel[46].rotateAngleZ = -0.80285146F;

		bodyModel[47].addShapeBox(-1.2F, -0.5F, -3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[47].setRotationPoint(-112F, -33F, 1F);
		bodyModel[47].rotateAngleZ = -0.80285146F;

		bodyModel[48].addShapeBox(-1.5F, -0.5F, -1F, 20, 1, 20, 0F, -18F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -18F, 0F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-125F, -46F, -18F);
		bodyModel[48].rotateAngleZ = -0.80285146F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-114F, -33F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-116F, -33F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(-116F, -33F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-116F, -39F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[53].setRotationPoint(-116F, -39F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[54].setRotationPoint(-116F, -33F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 28, 28, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-115.5F, -47F, -21F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(-116F, -29F, 1F);

		bodyModel[57].addShapeBox(0.5F, -2F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(-116F, -29F, 3F);
		bodyModel[57].rotateAngleZ = 0.43633231F;

		bodyModel[58].addShapeBox(1F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[58].setRotationPoint(-116F, -29F, 6F);
		bodyModel[58].rotateAngleZ = 0.43633231F;

		bodyModel[59].addShapeBox(1F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[59].setRotationPoint(-116F, -29F, 5F);
		bodyModel[59].rotateAngleZ = 0.43633231F;

		bodyModel[60].addShapeBox(1F, -1F, 1F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[60].setRotationPoint(-116F, -29F, 4F);
		bodyModel[60].rotateAngleZ = 0.43633231F;

		bodyModel[61].addShapeBox(1F, -1F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[61].setRotationPoint(-116F, -29F, -6F);
		bodyModel[61].rotateAngleZ = 0.43633231F;

		bodyModel[62].addShapeBox(1F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[62].setRotationPoint(-116F, -29F, -6F);
		bodyModel[62].rotateAngleZ = 0.43633231F;

		bodyModel[63].addShapeBox(1F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[63].setRotationPoint(-116F, -29F, -7F);
		bodyModel[63].rotateAngleZ = 0.43633231F;

		bodyModel[64].addShapeBox(0.5F, -2F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-116F, -29F, -7F);
		bodyModel[64].rotateAngleZ = 0.43633231F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[65].setRotationPoint(-116F, -29F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 20, 22, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 0
		bodyModel[66].setRotationPoint(-120F, -33F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 22, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[67].setRotationPoint(-120F, -33F, 15F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 22, 4, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[68].setRotationPoint(-108F, -33F, 15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 30, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(-100F, -41F, 15F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 22, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[70].setRotationPoint(-120F, -33F, -19F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 22, 4, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[71].setRotationPoint(-108F, -33F, -19F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 30, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(-100F, -41F, -19F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 24, 26, 38, 0F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 0
		bodyModel[73].setRotationPoint(-144F, -37F, -19F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[74].setRotationPoint(-93F, -47F, 15F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[75].setRotationPoint(-93F, -47F, -19F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 34, 4, 30, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[76].setRotationPoint(-121F, -51F, -15F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 30, 6, 30, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(-117F, -57F, -15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 34, 4, 4, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 0
		bodyModel[78].setRotationPoint(-121F, -51F, 15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 30, 6, 4, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 0
		bodyModel[79].setRotationPoint(-117F, -57F, 15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 30, 6, 4, 0F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[80].setRotationPoint(-117F, -57F, -19F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 34, 4, 4, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[81].setRotationPoint(-121F, -51F, -19F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[82].setRotationPoint(-139F, -27F, 12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[83].setRotationPoint(-139F, -21F, 12F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-139.5F, -20.5F, 14.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(-139.5F, -18.5F, 14.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(-139.5F, -24.5F, 14.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[87].setRotationPoint(-139.5F, -26.5F, 14.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[88].setRotationPoint(-139.5F, -24.5F, -15.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[89].setRotationPoint(-139.5F, -26.5F, -15.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[90].setRotationPoint(-139F, -27F, -16F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(-139F, -21F, -16F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-139.5F, -18.5F, -15.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[93].setRotationPoint(-139.5F, -20.5F, -15.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[94].setRotationPoint(-120F, -37F, -19F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[95].setRotationPoint(-120F, -37F, 15F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 24, 3, 20, 0F, -3F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, -6F, -3F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 96
		bodyModel[96].setRotationPoint(-144F, -40F, -10F);

		bodyModel[97].addTrapezoid(0F, 0F, 0F, 4, 12, 20, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 97
		bodyModel[97].setRotationPoint(-148F, -29F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[98].setRotationPoint(-142F, -34F, -13F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[99].setRotationPoint(-154F, -33.5F, -12.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[100].setRotationPoint(-166F, -33F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 93, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[101].setRotationPoint(-120F, -15F, -15F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 14, 12, 0F); // Box 102
		bodyModel[102].setRotationPoint(-58F, -34F, -6F);

		bodyModel[103].addBox(0F, 0F, 0F, 29, 5, 14, 0F); // Box 103
		bodyModel[103].setRotationPoint(-84F, -20F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-57F, -34F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[105].setRotationPoint(-57F, -34F, 6F);

		bodyModel[106].addBox(0F, -11F, 0F, 3, 11, 14, 0F); // Box 106
		bodyModel[106].setRotationPoint(-61F, -23F, -7F);
		bodyModel[106].rotateAngleZ = -0.13962634F;

		bodyModel[107].addShapeBox(0F, -14F, 0F, 3, 3, 14, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[107].setRotationPoint(-61F, -23F, -7F);
		bodyModel[107].rotateAngleZ = -0.13962634F;

		bodyModel[108].addShapeBox(-2F, -20F, 0F, 2, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[108].setRotationPoint(-60F, -23F, -4F);
		bodyModel[108].rotateAngleZ = -0.13962634F;

		bodyModel[109].addShapeBox(-1F, -20F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[109].setRotationPoint(-59F, -23F, -4F);
		bodyModel[109].rotateAngleZ = -0.13962634F;

		bodyModel[110].addShapeBox(-4F, -20F, 0F, 1, 4, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 110
		bodyModel[110].setRotationPoint(-59F, -23F, -3F);
		bodyModel[110].rotateAngleZ = -0.13962634F;

		bodyModel[111].addShapeBox(-4F, -16F, 0F, 1, 3, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 111
		bodyModel[111].setRotationPoint(-59F, -23F, -3F);
		bodyModel[111].rotateAngleZ = -0.13962634F;

		bodyModel[112].addShapeBox(-3F, -11F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 112
		bodyModel[112].setRotationPoint(-59F, -24F, -5F);
		bodyModel[112].rotateAngleZ = -0.13962634F;

		bodyModel[113].addShapeBox(-3F, -8F, 0F, 1, 3, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 113
		bodyModel[113].setRotationPoint(-59F, -24F, -5F);
		bodyModel[113].rotateAngleZ = -0.13962634F;

		bodyModel[114].addShapeBox(-3F, -5F, 0F, 1, 4, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 114
		bodyModel[114].setRotationPoint(-59F, -23F, -5F);
		bodyModel[114].rotateAngleZ = -0.13962634F;

		bodyModel[115].addShapeBox(-3F, -11F, 0F, 3, 11, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 115
		bodyModel[115].setRotationPoint(-61F, -23F, 5F);
		bodyModel[115].rotateAngleZ = -0.13962634F;

		bodyModel[116].addShapeBox(-3F, -11F, 0F, 3, 11, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 116
		bodyModel[116].setRotationPoint(-61F, -23F, -7F);
		bodyModel[116].rotateAngleZ = -0.13962634F;

		bodyModel[117].addBox(0F, 0F, 0F, 10, 3, 14, 0F); // Box 117
		bodyModel[117].setRotationPoint(-68F, -23F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[118].setRotationPoint(-71F, -23F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[119].setRotationPoint(-68F, -24F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[120].setRotationPoint(-77F, -29F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[121].setRotationPoint(-76F, -30F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[122].setRotationPoint(-75.5F, -35F, 7.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(-74.5F, -35F, 7.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[124].setRotationPoint(-77F, -29F, 6F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 125
		bodyModel[125].setRotationPoint(-83F, -28F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[126].setRotationPoint(-82F, -33F, -1F);

		bodyModel[127].addBox(2F, 0F, 0F, 4, 1, 4, 0F); // Box 127
		bodyModel[127].setRotationPoint(-83F, -36F, -2F);
		bodyModel[127].rotateAngleZ = -0.80285146F;

		bodyModel[128].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-83F, -36F, -3F);
		bodyModel[128].rotateAngleZ = -0.80285146F;

		bodyModel[129].addShapeBox(3F, 0F, -1F, 4, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[129].setRotationPoint(-83F, -36F, -3F);
		bodyModel[129].rotateAngleZ = -0.80285146F;

		bodyModel[130].addShapeBox(3F, 0F, 1F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 130
		bodyModel[130].setRotationPoint(-83F, -36F, 2F);
		bodyModel[130].rotateAngleZ = -0.80285146F;

		bodyModel[131].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[131].setRotationPoint(-83F, -36F, 2F);
		bodyModel[131].rotateAngleZ = -0.80285146F;

		bodyModel[132].addShapeBox(-1.2F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 132
		bodyModel[132].setRotationPoint(-80F, -33F, 1F);
		bodyModel[132].rotateAngleZ = -0.80285146F;

		bodyModel[133].addShapeBox(-0.2F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 133
		bodyModel[133].setRotationPoint(-80F, -33F, 1F);
		bodyModel[133].rotateAngleZ = -0.80285146F;

		bodyModel[134].addShapeBox(0.8F, -0.5F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 134
		bodyModel[134].setRotationPoint(-80F, -33F, 1F);
		bodyModel[134].rotateAngleZ = -0.80285146F;

		bodyModel[135].addShapeBox(0.8F, -0.5F, -3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 135
		bodyModel[135].setRotationPoint(-80F, -33F, 1F);
		bodyModel[135].rotateAngleZ = -0.80285146F;

		bodyModel[136].addShapeBox(-0.2F, -0.5F, -3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[136].setRotationPoint(-80F, -33F, 1F);
		bodyModel[136].rotateAngleZ = -0.80285146F;

		bodyModel[137].addShapeBox(-1.2F, -0.5F, -3F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 137
		bodyModel[137].setRotationPoint(-80F, -33F, 1F);
		bodyModel[137].rotateAngleZ = -0.80285146F;

		bodyModel[138].addShapeBox(-1.5F, -0.5F, -1F, 20, 1, 20, 0F, -18F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -18F, 0F, 0F); // Box 138
		bodyModel[138].setRotationPoint(-93F, -46F, -18F);
		bodyModel[138].rotateAngleZ = -0.80285146F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 139
		bodyModel[139].setRotationPoint(-84F, -33F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[140].setRotationPoint(-84F, -33F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[141].setRotationPoint(-84F, -39F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[142].setRotationPoint(-84F, -33F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[143].setRotationPoint(-84F, -39F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 28, 28, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 144
		bodyModel[144].setRotationPoint(-83.5F, -47F, -21F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 30, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[145].setRotationPoint(-87F, -31F, -19F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[146].setRotationPoint(-87F, -51F, -19F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[147].setRotationPoint(-87F, -47F, -17F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[148].setRotationPoint(-73F, -47F, -17F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[149].setRotationPoint(-61F, -47F, -17F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[150].setRotationPoint(-87F, -41F, -19F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[151].setRotationPoint(-61F, -47F, -19F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 30, 40, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[152].setRotationPoint(-57F, -51F, -19F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 30, 40, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[153].setRotationPoint(-57F, -51F, 15F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[154].setRotationPoint(-87F, -51F, 15F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[155].setRotationPoint(-87F, -47F, 15F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[156].setRotationPoint(-87F, -41F, 17F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 30, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[157].setRotationPoint(-87F, -31F, 15F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[158].setRotationPoint(-73F, -47F, 15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[159].setRotationPoint(-61F, -47F, 17F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[160].setRotationPoint(-61F, -47F, 15F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 54, 6, 38, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[161].setRotationPoint(-87F, -57F, -19F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 48, 2, 16, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[162].setRotationPoint(-87F, -31F, -35F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 32, 2, 16, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[163].setRotationPoint(-71F, -13F, -35F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 32, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 165
		bodyModel[164].setRotationPoint(-71F, -29F, -35F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 48, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 166
		bodyModel[165].setRotationPoint(-87F, -31F, 19F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 32, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 167
		bodyModel[166].setRotationPoint(-71F, -29F, 33F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 32, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 168
		bodyModel[167].setRotationPoint(-71F, -13F, 19F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 14, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F); // Box 169
		bodyModel[168].setRotationPoint(-41F, -47F, 19F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 14, 4, 16, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[169].setRotationPoint(-41F, -51F, 19F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[170].setRotationPoint(-43F, -46F, 20F);

		bodyModel[171].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 172
		bodyModel[171].setRotationPoint(-44F, -46F, 20F);

		bodyModel[172].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 173
		bodyModel[172].setRotationPoint(-44F, -46F, 23F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[173].setRotationPoint(-43F, -46F, 23F);

		bodyModel[174].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 175
		bodyModel[174].setRotationPoint(-44F, -46F, 26F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[175].setRotationPoint(-43F, -46F, 26F);

		bodyModel[176].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 177
		bodyModel[176].setRotationPoint(-44F, -46F, 29F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[177].setRotationPoint(-43F, -46F, 29F);

		bodyModel[178].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 179
		bodyModel[178].setRotationPoint(-44F, -46F, 32F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[179].setRotationPoint(-43F, -46F, 32F);

		bodyModel[180].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 181
		bodyModel[180].setRotationPoint(-47F, -43F, 32F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[181].setRotationPoint(-46F, -43F, 32F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[182].setRotationPoint(-46F, -43F, 29F);

		bodyModel[183].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 184
		bodyModel[183].setRotationPoint(-47F, -43F, 29F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[184].setRotationPoint(-46F, -43F, 26F);

		bodyModel[185].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 186
		bodyModel[185].setRotationPoint(-47F, -43F, 26F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[186].setRotationPoint(-46F, -43F, 23F);

		bodyModel[187].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 188
		bodyModel[187].setRotationPoint(-47F, -43F, 23F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[188].setRotationPoint(-46F, -43F, 20F);

		bodyModel[189].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 190
		bodyModel[189].setRotationPoint(-47F, -43F, 20F);

		bodyModel[190].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 191
		bodyModel[190].setRotationPoint(-50F, -40F, 32F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[191].setRotationPoint(-49F, -40F, 32F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[192].setRotationPoint(-49F, -40F, 29F);

		bodyModel[193].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 194
		bodyModel[193].setRotationPoint(-50F, -40F, 29F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[194].setRotationPoint(-49F, -40F, 26F);

		bodyModel[195].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 196
		bodyModel[195].setRotationPoint(-50F, -40F, 26F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[196].setRotationPoint(-49F, -40F, 23F);

		bodyModel[197].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 198
		bodyModel[197].setRotationPoint(-50F, -40F, 23F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[198].setRotationPoint(-49F, -40F, 20F);

		bodyModel[199].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 200
		bodyModel[199].setRotationPoint(-50F, -40F, 20F);

		bodyModel[200].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 201
		bodyModel[200].setRotationPoint(-53F, -37F, 32F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[201].setRotationPoint(-52F, -37F, 32F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[202].setRotationPoint(-52F, -37F, 29F);

		bodyModel[203].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 204
		bodyModel[203].setRotationPoint(-53F, -37F, 29F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[204].setRotationPoint(-52F, -37F, 26F);

		bodyModel[205].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 206
		bodyModel[205].setRotationPoint(-53F, -37F, 26F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[206].setRotationPoint(-52F, -37F, 23F);

		bodyModel[207].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 208
		bodyModel[207].setRotationPoint(-53F, -37F, 23F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[208].setRotationPoint(-52F, -37F, 20F);

		bodyModel[209].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 210
		bodyModel[209].setRotationPoint(-53F, -37F, 20F);

		bodyModel[210].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 211
		bodyModel[210].setRotationPoint(-56F, -34F, 32F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[211].setRotationPoint(-55F, -34F, 32F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[212].setRotationPoint(-55F, -34F, 29F);

		bodyModel[213].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 214
		bodyModel[213].setRotationPoint(-56F, -34F, 29F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[214].setRotationPoint(-55F, -34F, 26F);

		bodyModel[215].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 216
		bodyModel[215].setRotationPoint(-56F, -34F, 26F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[216].setRotationPoint(-55F, -34F, 23F);

		bodyModel[217].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 218
		bodyModel[217].setRotationPoint(-56F, -34F, 23F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[218].setRotationPoint(-55F, -34F, 20F);

		bodyModel[219].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 220
		bodyModel[219].setRotationPoint(-56F, -34F, 20F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 14, 4, 16, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[220].setRotationPoint(-41F, -51F, -35F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 12, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[221].setRotationPoint(-39F, -31F, 19F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 12, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[222].setRotationPoint(-39F, -31F, -35F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[223].setRotationPoint(-43F, -46F, -28F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[224].setRotationPoint(-43F, -46F, -25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[225].setRotationPoint(-43F, -46F, -22F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[226].setRotationPoint(-43F, -46F, -31F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[227].setRotationPoint(-43F, -46F, -34F);

		bodyModel[228].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 280
		bodyModel[228].setRotationPoint(-44F, -46F, -34F);

		bodyModel[229].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 281
		bodyModel[229].setRotationPoint(-44F, -46F, -31F);

		bodyModel[230].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 282
		bodyModel[230].setRotationPoint(-44F, -46F, -28F);

		bodyModel[231].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 283
		bodyModel[231].setRotationPoint(-44F, -46F, -25F);

		bodyModel[232].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 284
		bodyModel[232].setRotationPoint(-44F, -46F, -22F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[233].setRotationPoint(-46F, -43F, -22F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[234].setRotationPoint(-46F, -43F, -25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[235].setRotationPoint(-46F, -43F, -28F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[236].setRotationPoint(-46F, -43F, -31F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[237].setRotationPoint(-46F, -43F, -34F);

		bodyModel[238].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 290
		bodyModel[238].setRotationPoint(-47F, -43F, -34F);

		bodyModel[239].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 291
		bodyModel[239].setRotationPoint(-47F, -43F, -31F);

		bodyModel[240].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 292
		bodyModel[240].setRotationPoint(-47F, -43F, -28F);

		bodyModel[241].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 293
		bodyModel[241].setRotationPoint(-47F, -43F, -25F);

		bodyModel[242].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 294
		bodyModel[242].setRotationPoint(-47F, -43F, -22F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[243].setRotationPoint(-49F, -40F, -22F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[244].setRotationPoint(-49F, -40F, -25F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[245].setRotationPoint(-49F, -40F, -28F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[246].setRotationPoint(-49F, -40F, -31F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[247].setRotationPoint(-49F, -40F, -34F);

		bodyModel[248].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 300
		bodyModel[248].setRotationPoint(-50F, -40F, -34F);

		bodyModel[249].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 301
		bodyModel[249].setRotationPoint(-50F, -40F, -31F);

		bodyModel[250].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 302
		bodyModel[250].setRotationPoint(-50F, -40F, -28F);

		bodyModel[251].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 303
		bodyModel[251].setRotationPoint(-50F, -40F, -25F);

		bodyModel[252].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 304
		bodyModel[252].setRotationPoint(-50F, -40F, -22F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[253].setRotationPoint(-52F, -37F, -22F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[254].setRotationPoint(-52F, -37F, -25F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[255].setRotationPoint(-52F, -37F, -28F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[256].setRotationPoint(-52F, -37F, -31F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[257].setRotationPoint(-52F, -37F, -34F);

		bodyModel[258].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 310
		bodyModel[258].setRotationPoint(-53F, -37F, -34F);

		bodyModel[259].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 311
		bodyModel[259].setRotationPoint(-53F, -37F, -31F);

		bodyModel[260].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 312
		bodyModel[260].setRotationPoint(-53F, -37F, -28F);

		bodyModel[261].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 313
		bodyModel[261].setRotationPoint(-53F, -37F, -25F);

		bodyModel[262].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 314
		bodyModel[262].setRotationPoint(-53F, -37F, -22F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[263].setRotationPoint(-55F, -34F, -34F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[264].setRotationPoint(-55F, -34F, -31F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 14, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F); // Box 317
		bodyModel[265].setRotationPoint(-41F, -47F, -35F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[266].setRotationPoint(-55F, -34F, -28F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[267].setRotationPoint(-55F, -34F, -25F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[268].setRotationPoint(-55F, -34F, -22F);

		bodyModel[269].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 321
		bodyModel[269].setRotationPoint(-56F, -34F, -22F);

		bodyModel[270].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 322
		bodyModel[270].setRotationPoint(-56F, -34F, -25F);

		bodyModel[271].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 323
		bodyModel[271].setRotationPoint(-56F, -34F, -28F);

		bodyModel[272].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 324
		bodyModel[272].setRotationPoint(-56F, -34F, -31F);

		bodyModel[273].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 325
		bodyModel[273].setRotationPoint(-56F, -34F, -34F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 6, 6, 38, 0F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F); // Box 326
		bodyModel[274].setRotationPoint(-33F, -57F, -19F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 90, 4, 62, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[275].setRotationPoint(-27F, -15F, -31F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 130, 36, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[276].setRotationPoint(-27F, -47F, -35F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 130, 36, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[277].setRotationPoint(-27F, -47F, 31F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 158, 4, 12, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 332
		bodyModel[278].setRotationPoint(-27F, -51F, -35F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[279].setRotationPoint(-25F, -22F, -31F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[280].setRotationPoint(-24F, -19F, -26F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[281].setRotationPoint(-16F, -19F, -26F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[282].setRotationPoint(-25F, -34F, -31F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 337
		bodyModel[283].setRotationPoint(-25F, -34F, -29F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 338
		bodyModel[284].setRotationPoint(-13F, -34F, -29F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[285].setRotationPoint(-9F, -22F, -31F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 340
		bodyModel[286].setRotationPoint(-9F, -34F, -29F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 341
		bodyModel[287].setRotationPoint(3F, -34F, -29F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[288].setRotationPoint(-9F, -34F, -31F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[289].setRotationPoint(-8F, -19F, -26F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[290].setRotationPoint(0F, -19F, -26F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[291].setRotationPoint(7F, -22F, -31F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 346
		bodyModel[292].setRotationPoint(7F, -34F, -29F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 347
		bodyModel[293].setRotationPoint(19F, -34F, -29F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[294].setRotationPoint(7F, -34F, -31F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[295].setRotationPoint(8F, -19F, -26F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[296].setRotationPoint(16F, -19F, -26F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[297].setRotationPoint(23F, -22F, -31F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 352
		bodyModel[298].setRotationPoint(23F, -34F, -29F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 353
		bodyModel[299].setRotationPoint(35F, -34F, -29F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[300].setRotationPoint(23F, -34F, -31F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[301].setRotationPoint(24F, -19F, -26F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[302].setRotationPoint(32F, -19F, -26F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[303].setRotationPoint(39F, -22F, -31F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 358
		bodyModel[304].setRotationPoint(39F, -34F, -29F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 359
		bodyModel[305].setRotationPoint(51F, -34F, -29F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[306].setRotationPoint(39F, -34F, -31F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[307].setRotationPoint(40F, -19F, -26F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[308].setRotationPoint(48F, -19F, -26F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[309].setRotationPoint(-25F, -34F, 29F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[310].setRotationPoint(-9F, -34F, 29F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[311].setRotationPoint(7F, -34F, 29F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[312].setRotationPoint(23F, -34F, 29F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 14, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[313].setRotationPoint(39F, -34F, 29F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[314].setRotationPoint(-25F, -22F, 21F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[315].setRotationPoint(-9F, -22F, 21F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[316].setRotationPoint(7F, -22F, 21F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[317].setRotationPoint(23F, -22F, 21F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[318].setRotationPoint(39F, -22F, 21F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[319].setRotationPoint(48F, -19F, 22F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[320].setRotationPoint(40F, -19F, 22F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[321].setRotationPoint(32F, -19F, 22F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[322].setRotationPoint(24F, -19F, 22F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[323].setRotationPoint(16F, -19F, 22F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[324].setRotationPoint(8F, -19F, 22F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[325].setRotationPoint(0F, -19F, 22F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[326].setRotationPoint(-8F, -19F, 22F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[327].setRotationPoint(-16F, -19F, 22F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[328].setRotationPoint(-24F, -19F, 22F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[329].setRotationPoint(-25F, -34F, 27F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[330].setRotationPoint(-13F, -34F, 27F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[331].setRotationPoint(-9F, -34F, 27F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[332].setRotationPoint(3F, -34F, 27F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[333].setRotationPoint(7F, -34F, 27F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[334].setRotationPoint(19F, -34F, 27F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[335].setRotationPoint(23F, -34F, 27F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[336].setRotationPoint(35F, -34F, 27F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[337].setRotationPoint(39F, -34F, 27F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[338].setRotationPoint(51F, -34F, 27F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 158, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[339].setRotationPoint(-27F, -51F, 23F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 162, 6, 38, 0F, 0F, 0F, 5F, -8F, 0F, 5F, -8F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 394
		bodyModel[340].setRotationPoint(-27F, -57F, -19F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 24, 8, 6, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[341].setRotationPoint(13F, -38F, 35F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[342].setRotationPoint(-1F, -38F, 36F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[343].setRotationPoint(-15F, -37F, 37F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[344].setRotationPoint(-29F, -36.5F, 37.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 399
		bodyModel[345].setRotationPoint(-1F, -34F, 36F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[346].setRotationPoint(4F, -30F, 36.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[347].setRotationPoint(7F, -30F, 36.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[348].setRotationPoint(10F, -30F, 36.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[349].setRotationPoint(-14F, -19F, 36.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[350].setRotationPoint(-17F, -19F, 36.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[351].setRotationPoint(-20F, -19F, 36.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 406
		bodyModel[352].setRotationPoint(-25F, -23F, 36F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[353].setRotationPoint(-25F, -27F, 36F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[354].setRotationPoint(-39F, -26F, 37F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[355].setRotationPoint(-53F, -25.5F, 37.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 24, 10, 6, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[356].setRotationPoint(-11F, -27F, 35F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[357].setRotationPoint(-14F, -19F, -38.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[358].setRotationPoint(-17F, -19F, -38.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[359].setRotationPoint(-20F, -19F, -38.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 414
		bodyModel[360].setRotationPoint(-25F, -23F, -39F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[361].setRotationPoint(-25F, -27F, -40F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[362].setRotationPoint(-39F, -26F, -39F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[363].setRotationPoint(-53F, -25.5F, -38.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 24, 10, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 418
		bodyModel[364].setRotationPoint(-11F, -27F, -41F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 24, 8, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 419
		bodyModel[365].setRotationPoint(13F, -38F, -41F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 420
		bodyModel[366].setRotationPoint(-1F, -34F, -39F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[367].setRotationPoint(-1F, -38F, -40F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[368].setRotationPoint(-15F, -37F, -39F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[369].setRotationPoint(-29F, -36.5F, -38.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[370].setRotationPoint(10F, -31F, -38.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[371].setRotationPoint(7F, -31F, -38.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[372].setRotationPoint(4F, -31F, -38.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 40, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[373].setRotationPoint(63F, -15F, -31F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 40, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[374].setRotationPoint(63F, -15F, 11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 40, 4, 20, 0F, 0F, 0F, 0F, 0F, 32F, 0F, 0F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[375].setRotationPoint(103F, -15F, 11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 40, 4, 20, 0F, 0F, 0F, 0F, 0F, 32F, 0F, 0F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[376].setRotationPoint(103F, -15F, -31F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 40, 36, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[377].setRotationPoint(103F, -47F, 31F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 40, 36, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[378].setRotationPoint(103F, -47F, -35F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 12, 4, 70, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[379].setRotationPoint(131F, -51F, -35F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 24, 10, 10, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, 3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 4F, 4F, 0F); // Box 438
		bodyModel[380].setRotationPoint(48F, -26F, -45F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 26, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 439
		bodyModel[381].setRotationPoint(72F, -24F, -43F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 24, 10, 10, 0F, 4F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 440
		bodyModel[382].setRotationPoint(48F, -26F, 35F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 26, 6, 8, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[383].setRotationPoint(72F, -24F, 35F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 92, 4, 12, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 472
		bodyModel[384].setRotationPoint(-120F, -11F, -19F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 92, 4, 12, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 473
		bodyModel[385].setRotationPoint(-120F, -11F, 7F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 48, 4, 14, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 474
		bodyModel[386].setRotationPoint(-102F, -11F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 92, 4, 12, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 475
		bodyModel[387].setRotationPoint(3F, -11F, 23F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 92, 4, 8, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 476
		bodyModel[388].setRotationPoint(3F, -11F, 0F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 48, 4, 15, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 477
		bodyModel[389].setRotationPoint(22F, -11F, 8F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 92, 4, 8, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 478
		bodyModel[390].setRotationPoint(3F, -11F, -8F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 48, 4, 15, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 479
		bodyModel[391].setRotationPoint(22F, -11F, -23F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 92, 4, 12, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 480
		bodyModel[392].setRotationPoint(3F, -11F, -35F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 40, 8, 38, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[393].setRotationPoint(-20F, -65F, -19F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[394].setRotationPoint(-30F, -65F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, -8F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[395].setRotationPoint(-30F, -65F, -19F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -8F, 8F, 0F); // Box 503
		bodyModel[396].setRotationPoint(-30F, -65F, 11F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 20, 8, 38, 0F, 0F, 0F, -8F, 0F, -8F, -16F, 0F, -8F, -16F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 1F, -15F, 0F, 1F, -15F, 0F, 0F, 0F); // Box 506
		bodyModel[397].setRotationPoint(20F, -65F, -19F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[398].setRotationPoint(61F, -59F, -19F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[399].setRotationPoint(61F, -59F, -6F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 509
		bodyModel[400].setRotationPoint(59F, -59F, -19F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[401].setRotationPoint(86F, -59F, -19F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 25, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[402].setRotationPoint(61F, -57.5F, -17F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[403].setRotationPoint(63F, -58F, -17F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[404].setRotationPoint(66F, -58F, -17F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[405].setRotationPoint(69F, -58F, -17F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[406].setRotationPoint(72F, -58F, -17F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[407].setRotationPoint(75F, -58F, -17F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[408].setRotationPoint(78F, -58F, -17F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[409].setRotationPoint(81F, -58F, -17F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[410].setRotationPoint(84F, -58F, -17F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[411].setRotationPoint(86F, -59F, 4F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 25, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[412].setRotationPoint(61F, -57.5F, 6F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[413].setRotationPoint(84F, -58F, 6F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[414].setRotationPoint(81F, -58F, 6F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[415].setRotationPoint(78F, -58F, 6F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[416].setRotationPoint(75F, -58F, 6F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[417].setRotationPoint(72F, -58F, 6F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[418].setRotationPoint(69F, -58F, 6F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[419].setRotationPoint(66F, -58F, 6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[420].setRotationPoint(63F, -58F, 6F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 530
		bodyModel[421].setRotationPoint(59F, -59F, 4F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[422].setRotationPoint(61F, -59F, 17F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[423].setRotationPoint(61F, -59F, 4F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 533
		bodyModel[424].setRotationPoint(95F, -58F, -19F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 534
		bodyModel[425].setRotationPoint(95F, -58F, 6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 535
		bodyModel[426].setRotationPoint(103F, -58F, -6F);


		tailModel = new ModelRendererTurbo[23];
		tailModel[0] = new ModelRendererTurbo(this, 200, 77, textureX, textureY); // Box 444
		tailModel[1] = new ModelRendererTurbo(this, 200, 131, textureX, textureY); // Box 387
		tailModel[2] = new ModelRendererTurbo(this, 200, 158, textureX, textureY); // Box 388
		tailModel[3] = new ModelRendererTurbo(this, 200, 194, textureX, textureY); // Box 389
		tailModel[4] = new ModelRendererTurbo(this, 200, 219, textureX, textureY); // Box 390
		tailModel[5] = new ModelRendererTurbo(this, 200, 246, textureX, textureY); // Box 391
		tailModel[6] = new ModelRendererTurbo(this, 200, 277, textureX, textureY); // Box 392
		tailModel[7] = new ModelRendererTurbo(this, 200, 277, textureX, textureY); // Box 393
		tailModel[8] = new ModelRendererTurbo(this, 200, 277, textureX, textureY); // Box 394
		tailModel[9] = new ModelRendererTurbo(this, 200, 77, textureX, textureY); // Box 395
		tailModel[10] = new ModelRendererTurbo(this, 200, 131, textureX, textureY); // Box 396
		tailModel[11] = new ModelRendererTurbo(this, 200, 158, textureX, textureY); // Box 397
		tailModel[12] = new ModelRendererTurbo(this, 200, 246, textureX, textureY); // Box 398
		tailModel[13] = new ModelRendererTurbo(this, 200, 277, textureX, textureY); // Box 399
		tailModel[14] = new ModelRendererTurbo(this, 200, 194, textureX, textureY); // Box 400
		tailModel[15] = new ModelRendererTurbo(this, 200, 219, textureX, textureY); // Box 401
		tailModel[16] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 402
		tailModel[17] = new ModelRendererTurbo(this, 200, 326, textureX, textureY); // Box 403
		tailModel[18] = new ModelRendererTurbo(this, 200, 326, textureX, textureY); // Box 404
		tailModel[19] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 405
		tailModel[20] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 406
		tailModel[21] = new ModelRendererTurbo(this, 200, 387, textureX, textureY); // Box 407
		tailModel[22] = new ModelRendererTurbo(this, 200, 387, textureX, textureY); // Box 408

		tailModel[0].addShapeBox(0F, 0F, 0F, 40, 32, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 40F, 0F, 0F); // Box 444
		tailModel[0].setRotationPoint(143F, -43F, 11F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 80, 4, 20, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		tailModel[1].setRotationPoint(143F, -47F, 11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 40, 12, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		tailModel[2].setRotationPoint(183F, -43F, 11F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 389
		tailModel[3].setRotationPoint(183F, -31F, 11F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 390
		tailModel[4].setRotationPoint(203F, -31F, 11F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		tailModel[5].setRotationPoint(223F, -43F, 13F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		tailModel[6].setRotationPoint(223F, -45F, 13F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 393
		tailModel[7].setRotationPoint(223F, -31F, 13F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 394
		tailModel[8].setRotationPoint(223F, -31F, -29F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 40, 32, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 40F, 0F, 0F); // Box 395
		tailModel[9].setRotationPoint(143F, -43F, -31F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 80, 4, 20, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		tailModel[10].setRotationPoint(143F, -47F, -31F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 40, 12, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		tailModel[11].setRotationPoint(183F, -43F, -31F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		tailModel[12].setRotationPoint(223F, -43F, -29F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		tailModel[13].setRotationPoint(223F, -45F, -29F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 400
		tailModel[14].setRotationPoint(183F, -31F, -31F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 401
		tailModel[15].setRotationPoint(203F, -31F, -31F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		tailModel[16].setRotationPoint(213F, -43F, -11F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 403
		tailModel[17].setRotationPoint(208F, -43F, -11F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		tailModel[18].setRotationPoint(208F, -43F, 3F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 20, 40, 4, 0F, 0F, 0F, -1F, -10F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, -1F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F); // Box 405
		tailModel[19].setRotationPoint(203F, -87F, 19F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 20, 40, 4, 0F, 0F, 0F, -1F, -10F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, -1F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F); // Box 406
		tailModel[20].setRotationPoint(203F, -87F, -23F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 20, 4, 40, 0F, 0F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F); // Box 407
		tailModel[21].setRotationPoint(203F, -39F, -71F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 20, 4, 40, 0F, 30F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, 0F, -2F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 408
		tailModel[22].setRotationPoint(203F, -39F, 31F);


		leftWingModel = new ModelRendererTurbo[39];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 432, textureX, textureY); // Box 409
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 478, textureX, textureY); // Box 410
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 544, textureX, textureY); // Box 411
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 565, textureX, textureY); // Box 412
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 544, textureX, textureY); // Box 413
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 595, textureX, textureY); // Box 414
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 629, textureX, textureY); // Box 415
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 649, textureX, textureY); // Box 416
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 417
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 418
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 684, textureX, textureY); // Box 419
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 420
		leftWingModel[12] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 421
		leftWingModel[13] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 422
		leftWingModel[14] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 423
		leftWingModel[15] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 424
		leftWingModel[16] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 425
		leftWingModel[17] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 426
		leftWingModel[18] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 427
		leftWingModel[19] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 428
		leftWingModel[20] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 429
		leftWingModel[21] = new ModelRendererTurbo(this, 200, 684, textureX, textureY); // Box 430
		leftWingModel[22] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 431
		leftWingModel[23] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 432
		leftWingModel[24] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 433
		leftWingModel[25] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 434
		leftWingModel[26] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 435
		leftWingModel[27] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 436
		leftWingModel[28] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 437
		leftWingModel[29] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 438
		leftWingModel[30] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 439
		leftWingModel[31] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 440
		leftWingModel[32] = new ModelRendererTurbo(this, 200, 1130, textureX, textureY); // Box 504
		leftWingModel[33] = new ModelRendererTurbo(this, 200, 702, textureX, textureY); // Box 585
		leftWingModel[34] = new ModelRendererTurbo(this, 200, 717, textureX, textureY); // Box 586
		leftWingModel[35] = new ModelRendererTurbo(this, 200, 732, textureX, textureY); // Box 587
		leftWingModel[36] = new ModelRendererTurbo(this, 200, 717, textureX, textureY); // Box 588
		leftWingModel[37] = new ModelRendererTurbo(this, 200, 702, textureX, textureY); // Box 589
		leftWingModel[38] = new ModelRendererTurbo(this, 200, 732, textureX, textureY); // Box 590

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 130, 5, 40, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 20F, 2F, 0F, 0F, 2F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 409
		leftWingModel[0].setRotationPoint(-27F, -45F, -75F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 80, 5, 60, 0F, 0F, -23F, 0F, -60F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, -60F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		leftWingModel[1].setRotationPoint(23F, -45F, -135F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 80, 16, 4, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		leftWingModel[2].setRotationPoint(25F, -40F, -68F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 80, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 412
		leftWingModel[3].setRotationPoint(25F, -24F, -68F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 80, 16, 4, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		leftWingModel[4].setRotationPoint(25F, -40F, -48F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 4, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		leftWingModel[5].setRotationPoint(101F, -40F, -64F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 415
		leftWingModel[6].setRotationPoint(105F, -27F, -64F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 16, 3, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		leftWingModel[7].setRotationPoint(105F, -40F, -64F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 417
		leftWingModel[8].setRotationPoint(105F, -37F, -64F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 418
		leftWingModel[9].setRotationPoint(105F, -37F, -51F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 76, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		leftWingModel[10].setRotationPoint(25F, -40F, -72F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		leftWingModel[11].setRotationPoint(25F, -36F, -70F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		leftWingModel[12].setRotationPoint(33F, -36F, -70F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		leftWingModel[13].setRotationPoint(41F, -36F, -70F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		leftWingModel[14].setRotationPoint(49F, -36F, -70F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		leftWingModel[15].setRotationPoint(57F, -36F, -70F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		leftWingModel[16].setRotationPoint(65F, -36F, -70F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		leftWingModel[17].setRotationPoint(73F, -36F, -70F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		leftWingModel[18].setRotationPoint(81F, -36F, -70F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		leftWingModel[19].setRotationPoint(89F, -36F, -70F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		leftWingModel[20].setRotationPoint(97F, -36F, -70F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 76, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 430
		leftWingModel[21].setRotationPoint(25F, -40F, -44F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 431
		leftWingModel[22].setRotationPoint(25F, -36F, -44F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 432
		leftWingModel[23].setRotationPoint(33F, -36F, -44F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 433
		leftWingModel[24].setRotationPoint(41F, -36F, -44F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 434
		leftWingModel[25].setRotationPoint(49F, -36F, -44F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		leftWingModel[26].setRotationPoint(57F, -36F, -44F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 436
		leftWingModel[27].setRotationPoint(65F, -36F, -44F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 437
		leftWingModel[28].setRotationPoint(73F, -36F, -44F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 438
		leftWingModel[29].setRotationPoint(81F, -36F, -44F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 439
		leftWingModel[30].setRotationPoint(89F, -36F, -44F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 440
		leftWingModel[31].setRotationPoint(97F, -36F, -44F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 4, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		leftWingModel[32].setRotationPoint(34F, -40F, -64F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 16, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		leftWingModel[33].setRotationPoint(42F, -37F, -93F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 586
		leftWingModel[34].setRotationPoint(34F, -37F, -93F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 587
		leftWingModel[35].setRotationPoint(58F, -37F, -93F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 588
		leftWingModel[36].setRotationPoint(28F, -30F, -114F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 16, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		leftWingModel[37].setRotationPoint(36F, -30F, -114F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 590
		leftWingModel[38].setRotationPoint(52F, -30F, -114F);


		rightWingModel = new ModelRendererTurbo[39];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 441
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 684, textureX, textureY); // Box 442
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 443
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 444
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 445
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 446
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 447
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 448
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 449
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 450
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 451
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 684, textureX, textureY); // Box 452
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 453
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 454
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 455
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 456
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 457
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 458
		rightWingModel[18] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 459
		rightWingModel[19] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 460
		rightWingModel[20] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 461
		rightWingModel[21] = new ModelRendererTurbo(this, 200, 544, textureX, textureY); // Box 462
		rightWingModel[22] = new ModelRendererTurbo(this, 200, 544, textureX, textureY); // Box 463
		rightWingModel[23] = new ModelRendererTurbo(this, 200, 565, textureX, textureY); // Box 464
		rightWingModel[24] = new ModelRendererTurbo(this, 200, 432, textureX, textureY); // Box 465
		rightWingModel[25] = new ModelRendererTurbo(this, 200, 478, textureX, textureY); // Box 466
		rightWingModel[26] = new ModelRendererTurbo(this, 200, 595, textureX, textureY); // Box 467
		rightWingModel[27] = new ModelRendererTurbo(this, 200, 629, textureX, textureY); // Box 468
		rightWingModel[28] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 469
		rightWingModel[29] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 470
		rightWingModel[30] = new ModelRendererTurbo(this, 200, 649, textureX, textureY); // Box 471
		rightWingModel[31] = new ModelRendererTurbo(this, 200, 1130, textureX, textureY); // Box 505
		rightWingModel[32] = new ModelRendererTurbo(this, 200, 717, textureX, textureY); // Box 591
		rightWingModel[33] = new ModelRendererTurbo(this, 200, 702, textureX, textureY); // Box 592
		rightWingModel[34] = new ModelRendererTurbo(this, 200, 732, textureX, textureY); // Box 593
		rightWingModel[35] = new ModelRendererTurbo(this, 200, 732, textureX, textureY); // Box 594
		rightWingModel[36] = new ModelRendererTurbo(this, 200, 702, textureX, textureY); // Box 595
		rightWingModel[37] = new ModelRendererTurbo(this, 200, 717, textureX, textureY); // Box 596
		rightWingModel[38] = new ModelRendererTurbo(this, 200, 695, textureX, textureY); // Box 603

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		rightWingModel[0].setRotationPoint(97F, -36F, 42F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 76, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		rightWingModel[1].setRotationPoint(25F, -40F, 40F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		rightWingModel[2].setRotationPoint(89F, -36F, 42F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		rightWingModel[3].setRotationPoint(81F, -36F, 42F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		rightWingModel[4].setRotationPoint(73F, -36F, 42F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		rightWingModel[5].setRotationPoint(65F, -36F, 42F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightWingModel[6].setRotationPoint(57F, -36F, 42F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		rightWingModel[7].setRotationPoint(49F, -36F, 42F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightWingModel[8].setRotationPoint(41F, -36F, 42F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		rightWingModel[9].setRotationPoint(33F, -36F, 42F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightWingModel[10].setRotationPoint(25F, -36F, 42F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 76, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 452
		rightWingModel[11].setRotationPoint(25F, -40F, 68F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 453
		rightWingModel[12].setRotationPoint(97F, -36F, 68F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 454
		rightWingModel[13].setRotationPoint(89F, -36F, 68F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 455
		rightWingModel[14].setRotationPoint(81F, -36F, 68F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 456
		rightWingModel[15].setRotationPoint(73F, -36F, 68F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 457
		rightWingModel[16].setRotationPoint(65F, -36F, 68F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 458
		rightWingModel[17].setRotationPoint(57F, -36F, 68F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 459
		rightWingModel[18].setRotationPoint(49F, -36F, 68F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 460
		rightWingModel[19].setRotationPoint(41F, -36F, 68F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 461
		rightWingModel[20].setRotationPoint(33F, -36F, 68F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 80, 16, 4, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightWingModel[21].setRotationPoint(25F, -40F, 64F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 80, 16, 4, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightWingModel[22].setRotationPoint(25F, -40F, 44F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 80, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 464
		rightWingModel[23].setRotationPoint(25F, -24F, 44F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 130, 5, 40, 0F, 0F, 2F, 0F, 20F, 2F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F); // Box 465
		rightWingModel[24].setRotationPoint(-27F, -45F, 35F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 80, 5, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 20F, 0F, 0F, 20F, 0F); // Box 466
		rightWingModel[25].setRotationPoint(23F, -45F, 75F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 4, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightWingModel[26].setRotationPoint(101F, -40F, 48F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 468
		rightWingModel[27].setRotationPoint(105F, -27F, 48F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightWingModel[28].setRotationPoint(105F, -37F, 61F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightWingModel[29].setRotationPoint(105F, -37F, 48F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 16, 3, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightWingModel[30].setRotationPoint(105F, -40F, 48F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 4, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightWingModel[31].setRotationPoint(34F, -40F, 48F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 591
		rightWingModel[32].setRotationPoint(34F, -37F, 86F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 16, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		rightWingModel[33].setRotationPoint(42F, -37F, 86F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 593
		rightWingModel[34].setRotationPoint(58F, -37F, 86F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 594
		rightWingModel[35].setRotationPoint(52F, -30F, 107F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 16, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		rightWingModel[36].setRotationPoint(36F, -30F, 107F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 596
		rightWingModel[37].setRotationPoint(28F, -30F, 107F);

		rightWingModel[38].addShapeBox(-8F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 603
		rightWingModel[38].setRotationPoint(33F, -36F, 68F);


		bodyWheelModel = new ModelRendererTurbo[14];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 748, textureX, textureY); // Box 536
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 775, textureX, textureY); // Box 537
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 775, textureX, textureY); // Box 538
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 775, textureX, textureY); // Box 539
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 748, textureX, textureY); // Box 540
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 775, textureX, textureY); // Box 541
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Box 542
		bodyWheelModel[7] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Box 543
		bodyWheelModel[8] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 544
		bodyWheelModel[9] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 545
		bodyWheelModel[10] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 546
		bodyWheelModel[11] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 547
		bodyWheelModel[12] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 548
		bodyWheelModel[13] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 549

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyWheelModel[0].setRotationPoint(-89F, -7F, -6F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 537
		bodyWheelModel[1].setRotationPoint(-91F, -7F, -6F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 538
		bodyWheelModel[2].setRotationPoint(-81F, -7F, -6F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 539
		bodyWheelModel[3].setRotationPoint(-59F, -7F, -6F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 8, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyWheelModel[4].setRotationPoint(-67F, -7F, -6F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 541
		bodyWheelModel[5].setRotationPoint(-69F, -7F, -6F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyWheelModel[6].setRotationPoint(-91F, 6F, -6F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyWheelModel[7].setRotationPoint(-69F, 6F, -6F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 42, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyWheelModel[8].setRotationPoint(-95F, 6F, -10F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 545
		bodyWheelModel[9].setRotationPoint(-103F, 6F, -10F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 546
		bodyWheelModel[10].setRotationPoint(-53F, 6F, -10F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 547
		bodyWheelModel[11].setRotationPoint(-53F, 6F, 6F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 42, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyWheelModel[12].setRotationPoint(-95F, 6F, 6F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 549
		bodyWheelModel[13].setRotationPoint(-103F, 6F, 6F);


		leftWingWheelModel = new ModelRendererTurbo[20];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 550
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 866, textureX, textureY); // Box 551
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 552
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 553
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 866, textureX, textureY); // Box 554
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 555
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 556
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 557
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 558
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 559
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 560
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 561
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Box 562
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Box 563
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Box 559
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 560
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 561
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 562
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Box 563
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 564

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 550
		leftWingWheelModel[0].setRotationPoint(81F, -21F, -62F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftWingWheelModel[1].setRotationPoint(61F, -21F, -62F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 552
		leftWingWheelModel[2].setRotationPoint(59F, -21F, -62F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 553
		leftWingWheelModel[3].setRotationPoint(69F, -21F, -62F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 8, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftWingWheelModel[4].setRotationPoint(83F, -21F, -62F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 555
		leftWingWheelModel[5].setRotationPoint(91F, -21F, -62F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 42, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		leftWingWheelModel[6].setRotationPoint(55F, 6F, -66F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 557
		leftWingWheelModel[7].setRotationPoint(97F, 6F, -66F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 558
		leftWingWheelModel[8].setRotationPoint(47F, 6F, -66F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 559
		leftWingWheelModel[9].setRotationPoint(97F, 6F, -50F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 560
		leftWingWheelModel[10].setRotationPoint(47F, 6F, -50F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 42, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftWingWheelModel[11].setRotationPoint(55F, 6F, -50F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		leftWingWheelModel[12].setRotationPoint(59F, 6F, -62F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftWingWheelModel[13].setRotationPoint(81F, 6F, -62F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 4, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		leftWingWheelModel[14].setRotationPoint(63F, -8F, -60F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 560
		leftWingWheelModel[15].setRotationPoint(61F, -8F, -60F);

		leftWingWheelModel[16].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 561
		leftWingWheelModel[16].setRotationPoint(67F, -8F, -60F);

		leftWingWheelModel[17].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 562
		leftWingWheelModel[17].setRotationPoint(89F, -8F, -60F);

		leftWingWheelModel[18].addShapeBox(0F, 0F, 0F, 4, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftWingWheelModel[18].setRotationPoint(85F, -8F, -60F);

		leftWingWheelModel[19].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 564
		leftWingWheelModel[19].setRotationPoint(83F, -8F, -60F);


		rightWingWheelModel = new ModelRendererTurbo[20];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 565
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Box 566
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 567
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 568
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Box 569
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Box 570
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 571
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 200, 866, textureX, textureY); // Box 572
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 573
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 200, 866, textureX, textureY); // Box 574
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 575
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 576
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Box 577
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Box 578
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 579
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 580
		rightWingWheelModel[16] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 581
		rightWingWheelModel[17] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 582
		rightWingWheelModel[18] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 583
		rightWingWheelModel[19] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Box 584

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 565
		rightWingWheelModel[0].setRotationPoint(89F, -8F, 52F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightWingWheelModel[1].setRotationPoint(85F, -8F, 52F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 567
		rightWingWheelModel[2].setRotationPoint(83F, -8F, 52F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 568
		rightWingWheelModel[3].setRotationPoint(67F, -8F, 52F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightWingWheelModel[4].setRotationPoint(63F, -8F, 52F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 570
		rightWingWheelModel[5].setRotationPoint(61F, -8F, 52F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 571
		rightWingWheelModel[6].setRotationPoint(59F, -21F, 50F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		rightWingWheelModel[7].setRotationPoint(61F, -21F, 50F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 573
		rightWingWheelModel[8].setRotationPoint(69F, -21F, 50F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		rightWingWheelModel[9].setRotationPoint(83F, -21F, 50F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 575
		rightWingWheelModel[10].setRotationPoint(81F, -21F, 50F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 576
		rightWingWheelModel[11].setRotationPoint(91F, -21F, 50F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		rightWingWheelModel[12].setRotationPoint(81F, 6F, 50F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightWingWheelModel[13].setRotationPoint(59F, 6F, 50F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 42, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		rightWingWheelModel[14].setRotationPoint(55F, 6F, 46F);

		rightWingWheelModel[15].addShapeBox(0F, 0F, 0F, 42, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		rightWingWheelModel[15].setRotationPoint(55F, 6F, 62F);

		rightWingWheelModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 581
		rightWingWheelModel[16].setRotationPoint(47F, 6F, 46F);

		rightWingWheelModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 582
		rightWingWheelModel[17].setRotationPoint(47F, 6F, 62F);

		rightWingWheelModel[18].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 583
		rightWingWheelModel[18].setRotationPoint(97F, 6F, 46F);

		rightWingWheelModel[19].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 584
		rightWingWheelModel[19].setRotationPoint(97F, 6F, 62F);


		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 200, 990, textureX, textureY); // Box 600
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Box 601

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 40, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyDoorOpenModel[0].setRotationPoint(63F, -15F, -11F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 40, 4, 22, 0F, 0F, 0F, 0F, 0F, 32F, 0F, 0F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); // Box 601
		bodyDoorOpenModel[1].setRotationPoint(103F, -15F, -11F);


		bodyDoorCloseModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Box 435
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 200, 990, textureX, textureY); // Box 436

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 40, 4, 22, 0F, 0F, 0F, 0F, 0F, 32F, 0F, 0F, 32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); // Box 435
		bodyDoorCloseModel[0].setRotationPoint(103F, -15F, -11F);
		bodyDoorCloseModel[0].rotateAngleZ = -1.18682389F;

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 40, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyDoorCloseModel[1].setRotationPoint(63F, -15F, -11F);


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Box 602

		hudModel[0].addShapeBox(0F, -7F, -21F, 0, 28, 28, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -14F, 0F, -14F, -14F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 602
		hudModel[0].setRotationPoint(-115.6F, -40F, 0F);


		
		ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[3][];

		noseGunModel[0] = new ModelRendererTurbo[4];
		noseGunModel[0][0] = new ModelRendererTurbo(this, 200, 1050, textureX, textureY); // Box 597
		noseGunModel[0][1] = new ModelRendererTurbo(this, 200, 1060, textureX, textureY); // Box 598
		noseGunModel[0][2] = new ModelRendererTurbo(this, 200, 1060, textureX, textureY); // Box 599
		noseGunModel[0][3] = new ModelRendererTurbo(this, 200, 1070, textureX, textureY); // Box 600



		noseGunModel[0][0].addShapeBox(-2.5F, 0F, -3.5F, 5, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597

		noseGunModel[0][1].addShapeBox(-3.5F, 0F, -3.5F, 1, 2, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 598

		noseGunModel[0][2].addShapeBox(2.5F, 0F, -3.5F, 1, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 599

		noseGunModel[0][3].addShapeBox(-2.5F, 2F, -3.5F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 600

		
		for(ModelRendererTurbo noseGunPart : noseGunModel[0])
			noseGunPart.setRotationPoint(49F, -30F, -89.5F);
		
		noseGunModel[1] = new ModelRendererTurbo[0];


		noseGunModel[2] = new ModelRendererTurbo[13];
		noseGunModel[2][0] = new ModelRendererTurbo(this, 200, 1077, textureX, textureY); // Box 601
		noseGunModel[2][1] = new ModelRendererTurbo(this, 200, 1082, textureX, textureY); // Box 602
		noseGunModel[2][2] = new ModelRendererTurbo(this, 200, 1086, textureX, textureY); // Box 603
		noseGunModel[2][3] = new ModelRendererTurbo(this, 200, 1090, textureX, textureY); // Box 604
		noseGunModel[2][4] = new ModelRendererTurbo(this, 200, 1093, textureX, textureY); // Box 605
		noseGunModel[2][5] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 606
		noseGunModel[2][6] = new ModelRendererTurbo(this, 200, 1096, textureX, textureY); // Box 607
		noseGunModel[2][7] = new ModelRendererTurbo(this, 200, 1105, textureX, textureY); // Box 608
		noseGunModel[2][8] = new ModelRendererTurbo(this, 200, 1110, textureX, textureY); // Box 609
		noseGunModel[2][9] = new ModelRendererTurbo(this, 200, 1115, textureX, textureY); // Box 610
		noseGunModel[2][10] = new ModelRendererTurbo(this, 200, 1105, textureX, textureY); // Box 611
		noseGunModel[2][11] = new ModelRendererTurbo(this, 200, 1110, textureX, textureY); // Box 612
		noseGunModel[2][12] = new ModelRendererTurbo(this, 200, 1115, textureX, textureY); // Box 613


		noseGunModel[2][0].addShapeBox(-2.5F, -1F, -2.5F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601

		noseGunModel[2][1].addShapeBox(-2.5F, 1F, -2.5F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 602

		noseGunModel[2][2].addShapeBox(-3F, -0.5F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603

		noseGunModel[2][3].addShapeBox(-2F, -0.5F, -2F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604

		noseGunModel[2][4].addShapeBox(-6F, -0.5F, -2F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 605

		noseGunModel[2][5].addShapeBox(1F, -2F, -0.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606

		noseGunModel[2][6].addShapeBox(-2F, -2F, -0.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607

		noseGunModel[2][7].addShapeBox(-7F, -2F, 0.5F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608

		noseGunModel[2][8].addShapeBox(-9F, -2F, 0.5F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 609

		noseGunModel[2][9].addShapeBox(7F, -2F, 0.5F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 610

		noseGunModel[2][10].addShapeBox(-7F, 2F, 0.5F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611

		noseGunModel[2][11].addShapeBox(-9F, 2F, 0.5F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 612

		noseGunModel[2][12].addShapeBox(7F, 2F, 0.5F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 613
		
		for(ModelRendererTurbo noseGunPart : noseGunModel[2])
			noseGunPart.setRotationPoint(49F, -25F, -89.5F);
		
		registerGunModel("Main", noseGunModel);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}