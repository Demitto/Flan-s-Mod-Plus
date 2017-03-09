//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.02.2017 - 16:27:50
// Last changed on: 08.02.2017 - 16:27:50

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFAMAS extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFAMAS() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[247];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		gunModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		gunModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		gunModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		gunModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		gunModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		gunModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		gunModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		gunModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		gunModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		gunModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		gunModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		gunModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		gunModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		gunModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		gunModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		gunModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		gunModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		gunModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		gunModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		gunModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		gunModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		gunModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		gunModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		gunModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		gunModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		gunModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		gunModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		gunModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		gunModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		gunModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		gunModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		gunModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		gunModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		gunModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		gunModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		gunModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		gunModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		gunModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		gunModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		gunModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		gunModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		gunModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		gunModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		gunModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		gunModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		gunModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		gunModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		gunModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		gunModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		gunModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		gunModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		gunModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		gunModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		gunModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		gunModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		gunModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		gunModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		gunModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		gunModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		gunModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		gunModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		gunModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		gunModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		gunModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		gunModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		gunModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		gunModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		gunModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		gunModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		gunModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		gunModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		gunModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		gunModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		gunModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		gunModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		gunModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		gunModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		gunModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		gunModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		gunModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		gunModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		gunModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		gunModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		gunModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		gunModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		gunModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		gunModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		gunModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		gunModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		gunModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135
		gunModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		gunModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		gunModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		gunModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		gunModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		gunModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		gunModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		gunModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		gunModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		gunModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		gunModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		gunModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		gunModel[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		gunModel[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		gunModel[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		gunModel[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		gunModel[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		gunModel[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 153
		gunModel[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		gunModel[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		gunModel[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 156
		gunModel[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		gunModel[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 158
		gunModel[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		gunModel[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		gunModel[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		gunModel[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		gunModel[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		gunModel[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		gunModel[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 165
		gunModel[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		gunModel[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		gunModel[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		gunModel[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		gunModel[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		gunModel[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		gunModel[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		gunModel[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		gunModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		gunModel[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		gunModel[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		gunModel[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		gunModel[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		gunModel[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		gunModel[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		gunModel[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		gunModel[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		gunModel[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		gunModel[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		gunModel[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		gunModel[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		gunModel[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		gunModel[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		gunModel[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		gunModel[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		gunModel[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		gunModel[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		gunModel[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		gunModel[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		gunModel[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		gunModel[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		gunModel[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 221
		gunModel[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 222
		gunModel[196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		gunModel[197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 224
		gunModel[198] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 225
		gunModel[199] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 226
		gunModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		gunModel[201] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		gunModel[202] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		gunModel[203] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		gunModel[204] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 231
		gunModel[205] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		gunModel[206] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		gunModel[207] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		gunModel[208] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		gunModel[209] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		gunModel[210] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		gunModel[211] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 238
		gunModel[212] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		gunModel[213] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		gunModel[214] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 241
		gunModel[215] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		gunModel[216] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		gunModel[217] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		gunModel[218] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 246
		gunModel[219] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		gunModel[220] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 248
		gunModel[221] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 249
		gunModel[222] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 255
		gunModel[223] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 256
		gunModel[224] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257
		gunModel[225] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 258
		gunModel[226] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 259
		gunModel[227] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 260
		gunModel[228] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 261
		gunModel[229] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 262
		gunModel[230] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 263
		gunModel[231] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 264
		gunModel[232] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 265
		gunModel[233] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 266
		gunModel[234] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 267
		gunModel[235] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 268
		gunModel[236] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		gunModel[237] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 270
		gunModel[238] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		gunModel[239] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		gunModel[240] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		gunModel[241] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 274
		gunModel[242] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 275
		gunModel[243] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 276
		gunModel[244] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 277
		gunModel[245] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 278
		gunModel[246] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 283

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(4F, -11F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(6F, -8F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(6F, -5F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(6F, -1F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(4F, 2F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.5F, 0F, 0F); // Box 6
		gunModel[5].setRotationPoint(3F, 5F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(2F, 8F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(1F, 12F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 9
		gunModel[8].setRotationPoint(0F, 15F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F); // Box 10
		gunModel[9].setRotationPoint(2F, -11F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F); // Box 11
		gunModel[10].setRotationPoint(4F, -8F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -2F); // Box 12
		gunModel[11].setRotationPoint(5F, -5F, -3F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F); // Box 13
		gunModel[12].setRotationPoint(2F, -1F, -3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F); // Box 14
		gunModel[13].setRotationPoint(0F, 2F, -3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -2F); // Box 15
		gunModel[14].setRotationPoint(-1F, 5F, -3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -2F); // Box 16
		gunModel[15].setRotationPoint(-1.5F, 8F, -3F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F); // Box 17
		gunModel[16].setRotationPoint(-2F, 12F, -3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 18
		gunModel[17].setRotationPoint(-2F, 15F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 19
		gunModel[18].setRotationPoint(13F, -8F, -3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F); // Box 20
		gunModel[19].setRotationPoint(13F, -1F, -3F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 2F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F, 3F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, 3F, 0F, 0F); // Box 21
		gunModel[20].setRotationPoint(13F, 2F, -3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 3F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, 3F, 0F, 0F, 4F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -2F, 4F, 0F, 0F); // Box 22
		gunModel[21].setRotationPoint(13F, 5F, -3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 4F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -2F, 4F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, 5F, 0F, 0F); // Box 23
		gunModel[22].setRotationPoint(13F, 8F, -3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 4F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 4F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, -2F, -4.5F, 0F, -2F, 5F, 0F, 0F); // Box 24
		gunModel[23].setRotationPoint(12F, 12F, -3F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F, 4F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -2F, 4F, 0F, 0F, 4F, 0F, 0F, -4.5F, -0.5F, -2F, -4.5F, -0.5F, -2F, 4F, 0F, 0F); // Box 25
		gunModel[24].setRotationPoint(11F, 15F, -3F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[25].setRotationPoint(15.5F, -8F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 27
		gunModel[26].setRotationPoint(15.5F, -2F, -1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[27].setRotationPoint(17.5F, -1F, -1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[28].setRotationPoint(20.5F, 0F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[29].setRotationPoint(28.5F, 1F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[30].setRotationPoint(30.5F, 1F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[31].setRotationPoint(32.5F, -4F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 33
		gunModel[32].setRotationPoint(31.5F, -6F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[33].setRotationPoint(31.5F, -8F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[34].setRotationPoint(25.5F, -8F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		gunModel[35].setRotationPoint(25.5F, -7F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[36].setRotationPoint(25.5F, -5F, 0F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[37].setRotationPoint(21.5F, -8F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 39
		gunModel[38].setRotationPoint(21.5F, -4F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F); // Box 40
		gunModel[39].setRotationPoint(21.5F, -2F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 13, 9, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		gunModel[40].setRotationPoint(19.5F, -16F, -6F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 10, 9, 13, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -3.5F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -3.5F, -2F); // Box 42
		gunModel[41].setRotationPoint(3.5F, -16F, -6F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 6, 9, 13, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F); // Box 43
		gunModel[42].setRotationPoint(13.5F, -16F, -6F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 9, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		gunModel[43].setRotationPoint(-5.5F, -16F, -4F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F); // Box 45
		gunModel[44].setRotationPoint(-10.5F, -16F, -4F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 46
		gunModel[45].setRotationPoint(-13.5F, -16F, -4F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 6F, 0F); // Box 47
		gunModel[46].setRotationPoint(-16.5F, -16F, -4F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F); // Box 48
		gunModel[47].setRotationPoint(-21.5F, -15F, -4F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F); // Box 49
		gunModel[48].setRotationPoint(-21.5F, -15F, 4F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[49].setRotationPoint(-22.5F, -15F, -3.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[50].setRotationPoint(-22.5F, -15F, 3.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 13, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 52
		gunModel[51].setRotationPoint(-35.5F, -15F, -3.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 13, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 53
		gunModel[52].setRotationPoint(-35.5F, -15F, 3.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 22, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[53].setRotationPoint(-57.5F, -11F, -3.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 22, 3, 8, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 3F, 0F, -2F); // Box 56
		gunModel[54].setRotationPoint(-57.5F, -2F, -3.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 8, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[55].setRotationPoint(-12.5F, -26F, -5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 14, 6, 11, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -12F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -12F, 0F, 0F); // Box 58
		gunModel[56].setRotationPoint(-23.5F, -18F, -5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[57].setRotationPoint(-23.5F, -12F, -5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[58].setRotationPoint(-24.5F, -10F, -5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F); // Box 61
		gunModel[59].setRotationPoint(-21.5F, -8F, -5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		gunModel[60].setRotationPoint(-32.5F, -10F, -5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 31, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 63
		gunModel[61].setRotationPoint(-43.5F, -26F, -2.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 31, 6, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -11F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -11F, 0F, 0.25F); // Box 64
		gunModel[62].setRotationPoint(-43.5F, -18F, -2.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 65
		gunModel[63].setRotationPoint(-32.5F, -12F, -2.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[64].setRotationPoint(-31.5F, -13F, 6F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 31, 6, 2, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[65].setRotationPoint(-43.5F, -23F, -4.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 20, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[66].setRotationPoint(-33.5F, -17F, -4.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 7, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 70
		gunModel[67].setRotationPoint(-40.5F, -17F, -4.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 14, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 71
		gunModel[68].setRotationPoint(-54.5F, -18F, -4.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[69].setRotationPoint(-51.5F, -22F, -4.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[70].setRotationPoint(-51.5F, -24F, -4.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F, 0F, 4F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, -3F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 74
		gunModel[71].setRotationPoint(-56.5F, -24F, -4.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[72].setRotationPoint(-56.5F, -22F, -4.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 4, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F); // Box 76
		gunModel[73].setRotationPoint(-58.5F, -18F, -4.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 14, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 77
		gunModel[74].setRotationPoint(-72.5F, -18F, -4.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, 0F, 0F, -3F); // Box 78
		gunModel[75].setRotationPoint(-72.5F, 0F, -4.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 18, 7, 10, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[76].setRotationPoint(-74.5F, -25F, -4.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 80
		gunModel[77].setRotationPoint(-74.5F, -28F, -4.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 5, 17, 11, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 81
		gunModel[78].setRotationPoint(-76.5F, -18F, -5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 5, 7, 11, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 82
		gunModel[79].setRotationPoint(-76.5F, -25F, -5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, -1F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, -1F, 0.5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 83
		gunModel[80].setRotationPoint(-76.5F, -28F, -5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, -2F, 0.5F, -3F); // Box 84
		gunModel[81].setRotationPoint(-76.5F, 0F, -5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 3, 17, 11, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F); // Box 85
		gunModel[82].setRotationPoint(-71.5F, -18F, -5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 24, 2, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 86
		gunModel[83].setRotationPoint(-10.5F, -18F, -4F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 24, 2, 9, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 87
		gunModel[84].setRotationPoint(-10.5F, -20F, -4F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[85].setRotationPoint(-19F, -11.5F, -6F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		gunModel[86].setRotationPoint(-17F, -11.5F, -6F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[87].setRotationPoint(-17F, -9.5F, -6F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 91
		gunModel[88].setRotationPoint(-19F, -9.5F, -6F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F); // Box 92
		gunModel[89].setRotationPoint(13.5F, -18F, -4F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 55, 3, 9, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F); // Box 93
		gunModel[90].setRotationPoint(19.5F, -18F, -4F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 21, 4, 6, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[91].setRotationPoint(-10.5F, -24F, -2.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 0F, 1.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, -3F, 0F, 1.25F); // Box 95
		gunModel[92].setRotationPoint(10.5F, -24F, -2.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 55, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F); // Box 96
		gunModel[93].setRotationPoint(19.5F, -24F, -2.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 49, 5, 13, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[94].setRotationPoint(32.5F, -16F, -6F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 98
		gunModel[95].setRotationPoint(33.5F, -10F, -6F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F); // Box 99
		gunModel[96].setRotationPoint(34.5F, -13F, -6F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2F); // Box 100
		gunModel[97].setRotationPoint(36.5F, -13F, -6F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 101
		gunModel[98].setRotationPoint(38.5F, -10F, -6F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[99].setRotationPoint(32.5F, -11F, -6F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[100].setRotationPoint(32.5F, -10F, -6F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 104
		gunModel[101].setRotationPoint(32.5F, -8F, -6F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[102].setRotationPoint(38.5F, -11F, -6F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[103].setRotationPoint(39.5F, -10F, -6F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		gunModel[104].setRotationPoint(39.5F, -8F, -6F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[105].setRotationPoint(46.5F, -11F, -6F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[106].setRotationPoint(40.5F, -11F, -6F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		gunModel[107].setRotationPoint(40.5F, -8F, -6F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[108].setRotationPoint(40.5F, -10F, -6F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 112
		gunModel[109].setRotationPoint(41.5F, -10F, -6F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F); // Box 113
		gunModel[110].setRotationPoint(42.5F, -13F, -6F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2F); // Box 114
		gunModel[111].setRotationPoint(44.5F, -13F, -6F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[112].setRotationPoint(47.5F, -10F, -6F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		gunModel[113].setRotationPoint(47.5F, -8F, -6F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 117
		gunModel[114].setRotationPoint(46.5F, -10F, -6F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[115].setRotationPoint(54.5F, -11F, -6F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[116].setRotationPoint(48.5F, -11F, -6F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		gunModel[117].setRotationPoint(48.5F, -8F, -6F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[118].setRotationPoint(48.5F, -10F, -6F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 122
		gunModel[119].setRotationPoint(49.5F, -10F, -6F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F); // Box 123
		gunModel[120].setRotationPoint(50.5F, -13F, -6F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2F); // Box 124
		gunModel[121].setRotationPoint(52.5F, -13F, -6F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[122].setRotationPoint(55.5F, -10F, -6F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
		gunModel[123].setRotationPoint(55.5F, -8F, -6F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 127
		gunModel[124].setRotationPoint(54.5F, -10F, -6F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[125].setRotationPoint(62.5F, -11F, -6F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[126].setRotationPoint(56.5F, -11F, -6F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		gunModel[127].setRotationPoint(56.5F, -8F, -6F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[128].setRotationPoint(56.5F, -10F, -6F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 132
		gunModel[129].setRotationPoint(57.5F, -10F, -6F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F); // Box 133
		gunModel[130].setRotationPoint(58.5F, -13F, -6F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2F); // Box 134
		gunModel[131].setRotationPoint(60.5F, -13F, -6F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[132].setRotationPoint(63.5F, -10F, -6F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		gunModel[133].setRotationPoint(63.5F, -8F, -6F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 137
		gunModel[134].setRotationPoint(62.5F, -10F, -6F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[135].setRotationPoint(70.5F, -11F, -6F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[136].setRotationPoint(64.5F, -11F, -6F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		gunModel[137].setRotationPoint(64.5F, -8F, -6F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		gunModel[138].setRotationPoint(64.5F, -10F, -6F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 142
		gunModel[139].setRotationPoint(65.5F, -10F, -6F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F); // Box 143
		gunModel[140].setRotationPoint(66.5F, -13F, -6F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2F); // Box 144
		gunModel[141].setRotationPoint(68.5F, -13F, -6F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gunModel[142].setRotationPoint(71.5F, -10F, -6F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		gunModel[143].setRotationPoint(71.5F, -8F, -6F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 147
		gunModel[144].setRotationPoint(70.5F, -10F, -6F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 148
		gunModel[145].setRotationPoint(72.5F, -11F, -6F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[146].setRotationPoint(74.5F, -18F, -5.75F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[147].setRotationPoint(74.5F, -18F, 5.75F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gunModel[148].setRotationPoint(74.5F, -24F, -5.75F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[149].setRotationPoint(74.5F, -24F, 5.75F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gunModel[150].setRotationPoint(74.5F, -32F, 2.5F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[151].setRotationPoint(74.5F, -34F, 2.5F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gunModel[152].setRotationPoint(73.5F, -36F, 2.5F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		gunModel[153].setRotationPoint(77.5F, -40F, 2.5F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[154].setRotationPoint(69.5F, -40F, 2.5F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 66, 4, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 158
		gunModel[155].setRotationPoint(3.5F, -40F, 2.5F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 159
		gunModel[156].setRotationPoint(1.5F, -41F, 2.5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 160
		gunModel[157].setRotationPoint(-0.5F, -41F, 2.5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		gunModel[158].setRotationPoint(-10.5F, -35F, 2.5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		gunModel[159].setRotationPoint(-10.5F, -41F, 2.5F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gunModel[160].setRotationPoint(-4.5F, -41F, 2.5F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		gunModel[161].setRotationPoint(-4.5F, -41F, -2.5F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		gunModel[162].setRotationPoint(-10.5F, -35F, -2.5F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		gunModel[163].setRotationPoint(-10.5F, -41F, -2.5F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 167
		gunModel[164].setRotationPoint(-0.5F, -41F, -2.5F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 168
		gunModel[165].setRotationPoint(1.5F, -41F, -2.5F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 66, 4, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 169
		gunModel[166].setRotationPoint(3.5F, -40F, -2.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[167].setRotationPoint(69.5F, -40F, -2.5F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[168].setRotationPoint(77.5F, -40F, -2.5F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gunModel[169].setRotationPoint(73.5F, -36F, -2.5F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gunModel[170].setRotationPoint(74.5F, -34F, -2.5F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[171].setRotationPoint(74.5F, -32F, -2.5F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[172].setRotationPoint(-10.5F, -31F, -1.5F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[173].setRotationPoint(-1.5F, -32F, -1.5F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F); // Box 177
		gunModel[174].setRotationPoint(-1.5F, -33F, -1.5F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[175].setRotationPoint(1.5F, -35F, -1.5F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[176].setRotationPoint(3.5F, -36F, -1.5F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[177].setRotationPoint(69.5F, -37F, -1.5F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 178
		gunModel[178].setRotationPoint(73.5F, -35F, -1.5F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 179
		gunModel[179].setRotationPoint(74.5F, -32F, -1.5F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 183
		gunModel[180].setRotationPoint(5F, -37.5F, -1F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 184
		gunModel[181].setRotationPoint(5F, -39F, -1F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[182].setRotationPoint(5F, -40F, -0.75F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		gunModel[183].setRotationPoint(5F, -40.5F, -0.75F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		gunModel[184].setRotationPoint(5F, -40.5F, 0.75F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		gunModel[185].setRotationPoint(5F, -40F, 0.75F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		gunModel[186].setRotationPoint(67F, -38F, -1F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		gunModel[187].setRotationPoint(67F, -39F, -1F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		gunModel[188].setRotationPoint(67F, -39F, 1F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 209
		gunModel[189].setRotationPoint(67F, -40F, -1F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		gunModel[190].setRotationPoint(67F, -41F, -1F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 211
		gunModel[191].setRotationPoint(67F, -40F, 1F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 212
		gunModel[192].setRotationPoint(67F, -41F, 1F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 213
		gunModel[193].setRotationPoint(67F, -39F, 0F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		gunModel[194].setRotationPoint(-5F, -26.5F, -3F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		gunModel[195].setRotationPoint(-7F, -26.5F, -3F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 223
		gunModel[196].setRotationPoint(-7F, -24.5F, -3F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 224
		gunModel[197].setRotationPoint(-5F, -24.5F, -3F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		gunModel[198].setRotationPoint(79F, -35.5F, -3F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		gunModel[199].setRotationPoint(77F, -35.5F, -3F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 227
		gunModel[200].setRotationPoint(77F, -33.5F, -3F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 228
		gunModel[201].setRotationPoint(79F, -33.5F, -3F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		gunModel[202].setRotationPoint(79F, -35.5F, 3F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		gunModel[203].setRotationPoint(77F, -35.5F, 3F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 231
		gunModel[204].setRotationPoint(77F, -33.5F, 3F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 232
		gunModel[205].setRotationPoint(79F, -33.5F, 3F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		gunModel[206].setRotationPoint(49F, -14.5F, 6.5F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		gunModel[207].setRotationPoint(47F, -14.5F, 6.5F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 235
		gunModel[208].setRotationPoint(47F, -12.5F, 6.5F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 236
		gunModel[209].setRotationPoint(49F, -12.5F, 6.5F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		gunModel[210].setRotationPoint(74.5F, -20.5F, -2F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		gunModel[211].setRotationPoint(81.5F, -21.5F, -3F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		gunModel[212].setRotationPoint(87.5F, -19.5F, -1F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		gunModel[213].setRotationPoint(105.5F, -20F, -1.5F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		gunModel[214].setRotationPoint(108.5F, -20F, -1.5F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		gunModel[215].setRotationPoint(110.5F, -20F, -1.5F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		gunModel[216].setRotationPoint(112.5F, -20F, -1.5F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		gunModel[217].setRotationPoint(112.5F, -17F, -1.5F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		gunModel[218].setRotationPoint(112.5F, -19F, -1.5F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		gunModel[219].setRotationPoint(112.5F, -19F, 1.5F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		gunModel[220].setRotationPoint(51.5F, -29F, -1.5F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		gunModel[221].setRotationPoint(51.5F, -30F, -1.5F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 255
		gunModel[222].setRotationPoint(-17.5F, -4F, -1.5F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F); // Box 256
		gunModel[223].setRotationPoint(-17.5F, 3F, -1.5F);

		gunModel[224].addShapeBox(0F, -3F, 1F, 3, 3, 3, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		gunModel[224].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[224].rotateAngleX = -0.48869219F;
		gunModel[224].rotateAngleY = 0.03490659F;
		gunModel[224].rotateAngleZ = 0.08726646F;

		gunModel[225].addShapeBox(0F, 0F, 1F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 258
		gunModel[225].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[225].rotateAngleX = -0.48869219F;
		gunModel[225].rotateAngleY = 0.03490659F;
		gunModel[225].rotateAngleZ = 0.08726646F;

		gunModel[226].addShapeBox(-5F, -3F, 1F, 5, 6, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 259
		gunModel[226].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[226].rotateAngleX = -0.48869219F;
		gunModel[226].rotateAngleY = 0.03490659F;
		gunModel[226].rotateAngleZ = 0.08726646F;

		gunModel[227].addShapeBox(-7F, -1F, 1F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		gunModel[227].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[227].rotateAngleX = -0.48869219F;
		gunModel[227].rotateAngleY = 0.03490659F;
		gunModel[227].rotateAngleZ = 0.08726646F;

		gunModel[228].addShapeBox(-8F, -1F, 1F, 1, 2, 3, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 261
		gunModel[228].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[228].rotateAngleX = -0.48869219F;
		gunModel[228].rotateAngleY = 0.03490659F;
		gunModel[228].rotateAngleZ = 0.08726646F;

		gunModel[229].addShapeBox(-11F, -2F, 0F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		gunModel[229].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[229].rotateAngleX = -0.48869219F;
		gunModel[229].rotateAngleY = 0.03490659F;
		gunModel[229].rotateAngleZ = 0.08726646F;

		gunModel[230].addShapeBox(-12F, -1F, 1F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 263
		gunModel[230].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[230].rotateAngleX = -0.48869219F;
		gunModel[230].rotateAngleY = 0.03490659F;
		gunModel[230].rotateAngleZ = 0.08726646F;

		gunModel[231].addShapeBox(-58F, -1F, 1F, 46, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		gunModel[231].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[231].rotateAngleX = -0.48869219F;
		gunModel[231].rotateAngleY = 0.03490659F;
		gunModel[231].rotateAngleZ = 0.08726646F;

		gunModel[232].addShapeBox(-62F, -1F, 1F, 4, 2, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 265
		gunModel[232].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[232].rotateAngleX = -0.48869219F;
		gunModel[232].rotateAngleY = 0.03490659F;
		gunModel[232].rotateAngleZ = 0.08726646F;

		gunModel[233].addShapeBox(-63F, -4F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		gunModel[233].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[233].rotateAngleX = -0.48869219F;
		gunModel[233].rotateAngleY = 0.03490659F;
		gunModel[233].rotateAngleZ = 0.08726646F;

		gunModel[234].addShapeBox(-65F, -4F, 3F, 2, 8, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 267
		gunModel[234].setRotationPoint(72.5F, -23.5F, -7F);
		gunModel[234].rotateAngleX = -0.48869219F;
		gunModel[234].rotateAngleY = 0.03490659F;
		gunModel[234].rotateAngleZ = 0.08726646F;

		gunModel[235].addShapeBox(-65F, -4F, -3F, 2, 8, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 268
		gunModel[235].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[235].rotateAngleX = 0.48869219F;
		gunModel[235].rotateAngleY = -0.03490659F;
		gunModel[235].rotateAngleZ = 0.08726646F;

		gunModel[236].addShapeBox(-63F, -4F, -3F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		gunModel[236].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[236].rotateAngleX = 0.48869219F;
		gunModel[236].rotateAngleY = -0.03490659F;
		gunModel[236].rotateAngleZ = 0.08726646F;

		gunModel[237].addShapeBox(-62F, -1F, -2F, 4, 2, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 270
		gunModel[237].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[237].rotateAngleX = 0.48869219F;
		gunModel[237].rotateAngleY = -0.03490659F;
		gunModel[237].rotateAngleZ = 0.08726646F;

		gunModel[238].addShapeBox(-58F, -1F, -2F, 46, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		gunModel[238].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[238].rotateAngleX = 0.48869219F;
		gunModel[238].rotateAngleY = -0.03490659F;
		gunModel[238].rotateAngleZ = 0.08726646F;

		gunModel[239].addShapeBox(-11F, -2F, -3F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		gunModel[239].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[239].rotateAngleX = 0.48869219F;
		gunModel[239].rotateAngleY = -0.03490659F;
		gunModel[239].rotateAngleZ = 0.08726646F;

		gunModel[240].addShapeBox(-12F, -1F, -3F, 1, 2, 3, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 273
		gunModel[240].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[240].rotateAngleX = 0.48869219F;
		gunModel[240].rotateAngleY = -0.03490659F;
		gunModel[240].rotateAngleZ = 0.08726646F;

		gunModel[241].addShapeBox(-8F, -1F, -3F, 1, 2, 3, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 274
		gunModel[241].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[241].rotateAngleX = 0.48869219F;
		gunModel[241].rotateAngleY = -0.03490659F;
		gunModel[241].rotateAngleZ = 0.08726646F;

		gunModel[242].addShapeBox(-7F, -1F, -2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		gunModel[242].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[242].rotateAngleX = 0.48869219F;
		gunModel[242].rotateAngleY = -0.03490659F;
		gunModel[242].rotateAngleZ = 0.08726646F;

		gunModel[243].addShapeBox(-5F, -3F, -3F, 5, 6, 3, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 276
		gunModel[243].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[243].rotateAngleX = 0.48869219F;
		gunModel[243].rotateAngleY = -0.03490659F;
		gunModel[243].rotateAngleZ = 0.08726646F;

		gunModel[244].addShapeBox(0F, -3F, -3F, 3, 3, 3, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		gunModel[244].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[244].rotateAngleX = 0.48869219F;
		gunModel[244].rotateAngleY = -0.03490659F;
		gunModel[244].rotateAngleZ = 0.08726646F;

		gunModel[245].addShapeBox(0F, 0F, -3F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F); // Box 278
		gunModel[245].setRotationPoint(72.5F, -23.5F, 7F);
		gunModel[245].rotateAngleX = 0.48869219F;
		gunModel[245].rotateAngleY = -0.03490659F;
		gunModel[245].rotateAngleZ = 0.08726646F;

		gunModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		gunModel[246].setRotationPoint(-19.5F, -26.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257
		ammoModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 258

		ammoModel[0].addShapeBox(0F, 0F, 0F, 15, 39, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 257
		ammoModel[0].setRotationPoint(-34.5F, -15F, -2.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 39, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 258
		ammoModel[1].setRotationPoint(-36.5F, -15F, -2.5F);


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		slideModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		slideModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 252
		slideModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 253
		slideModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 254

		slideModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		slideModel[0].setRotationPoint(31.5F, -26F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		slideModel[1].setRotationPoint(31.5F, -28F, -1F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		slideModel[2].setRotationPoint(31.5F, -30F, -1F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		slideModel[3].setRotationPoint(31.5F, -33F, -1F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		slideModel[4].setRotationPoint(32.5F, -35F, -1F);




		gunSlideDistance = 1.5F;


		animationType = EnumAnimationType.BULLPUP;
		
		hasArms = true;
		
		leftArmPos = new Vector3f(0F, -0.2F, 0F);
		leftArmRot = new Vector3f(90, 45, 0);
	
		leftArmReloadPos = new Vector3f(-0.6F, -0.7F, 0.2F);
		leftArmReloadRot = new Vector3f(90, 20, 0);
		
		rightArmPos = new Vector3f(0.4F, -0.5F, 0F);
		rightArmRot = new Vector3f(0, 0, -90);
		rightArmReloadPos = new Vector3f(0.4F, -0.6F, 0F);
		rightArmReloadRot = new Vector3f(-40, 0, -90);

		rightHandAmmo = false;
		leftHandAmmo = true;


		translateAll(10F, -2.5F, -0.5F);


		flipAll();
	}
}