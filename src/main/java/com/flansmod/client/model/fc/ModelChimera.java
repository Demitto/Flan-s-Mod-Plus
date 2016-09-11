//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChimera extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelChimera()
	{
		bodyModel = new ModelRendererTurbo[145];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		bodyModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		bodyModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201
		bodyModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202
		bodyModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		bodyModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		bodyModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		bodyModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		bodyModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		bodyModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		bodyModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		bodyModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		bodyModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 214
		bodyModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 215
		bodyModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 216
		bodyModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 217
		bodyModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 218
		bodyModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 219

		bodyModel[0].addShapeBox(0F, 0F, 0F, 15, 9, 19, 0F,0F, -2F, -12F, -3F, -5F, -16F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(47F, -16F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 15, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -18F, 0F, 0F, -12F); // Box 2
		bodyModel[1].setRotationPoint(47F, -7F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 6, 24, 0F,0F, 0F, -3F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -6F, 0F, -18F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(47F, -7F, -24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 9, 19, 0F,0F, 3F, -6F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(27F, -16F, -24F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 9, 19, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, 0F); // Box 7
		bodyModel[4].setRotationPoint(27F, -16F, 5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(27F, -16F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(36F, -16F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 6, 24, 0F,0F, 6F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[7].setRotationPoint(27F, -7F, -24F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(27F, -18F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[9].setRotationPoint(37F, -17.5F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[10].setRotationPoint(27F, -18F, 1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[11].setRotationPoint(37F, -17.5F, 1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F); // Box 17
		bodyModel[12].setRotationPoint(27F, -7F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 36, 6, 48, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-9F, -19F, -24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 15, 9, 10, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(47F, -16F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 9, 19, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -5F, -16F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -3F); // Box 22
		bodyModel[15].setRotationPoint(47F, -16F, 5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 40, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-33F, -13F, -24F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 6, 48, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-25F, -19F, -24F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 6, 48, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-46F, -19F, -24F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 6, 48, 0F,-3F, -2F, -9F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, -2F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 26
		bodyModel[19].setRotationPoint(-56F, -19F, -24F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 12, 48, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, -6F, -15F, 0F, 0F, -9F, 0F, 0F, -9F, -3F, -6F, -15F); // Box 27
		bodyModel[20].setRotationPoint(-56F, -13F, -24F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-43F, -20F, -19F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(-43F, -20F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[23].setRotationPoint(-43F, -20F, -17F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-28F, -20F, -17F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(-30F, -20F, -17F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[26].setRotationPoint(-32F, -20F, -17F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(-34F, -20F, -17F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[28].setRotationPoint(-36F, -20F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[29].setRotationPoint(-38F, -20F, -17F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[30].setRotationPoint(-40F, -20F, -17F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-43F, -20F, 17F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(-43F, -20F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(-43F, -20F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(-28F, -20F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(-30F, -20F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[36].setRotationPoint(-32F, -20F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(-34F, -20F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[38].setRotationPoint(-36F, -20F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(-38F, -20F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[40].setRotationPoint(-40F, -20F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 93, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[41].setRotationPoint(-46F, -13F, -40F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 93, 6, 2, 0F,9F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[42].setRotationPoint(-46F, -7F, -26F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 6, 16, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[43].setRotationPoint(47F, -13F, -40F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 52
		bodyModel[44].setRotationPoint(7F, -13F, -24F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 54
		bodyModel[45].setRotationPoint(-46F, -13F, -24F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 93, 11, 2, 0F,9F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[46].setRotationPoint(-46F, -7F, -40F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 6, 16, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[47].setRotationPoint(-55F, -13F, -40F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 6, 19, 0F,-3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[48].setRotationPoint(-46F, -19F, -40F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 6, 22, 0F,-3F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[49].setRotationPoint(-1F, -19F, -40F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[50].setRotationPoint(-25F, -16F, -37F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 19, 1, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[51].setRotationPoint(-25F, -17F, -37F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[52].setRotationPoint(18F, -16F, -37F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 93, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[53].setRotationPoint(-46F, -13F, 24F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 93, 6, 2, 0F,9F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[54].setRotationPoint(-46F, -7F, 24F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 6, 16, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[55].setRotationPoint(47F, -13F, 24F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 93, 11, 2, 0F,9F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(-46F, -7F, 38F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 9, 6, 16, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(-55F, -13F, 24F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 16, 6, 19, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[58].setRotationPoint(-46F, -19F, 21F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 16, 6, 22, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[59].setRotationPoint(-1F, -19F, 18F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[60].setRotationPoint(-25F, -16F, 27F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 19, 1, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[61].setRotationPoint(-25F, -17F, 27F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 71
		bodyModel[62].setRotationPoint(18F, -16F, 27F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 15, 15, 2, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[63].setRotationPoint(47F, -12F, -42F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 118
		bodyModel[64].setRotationPoint(46F, -12F, -42F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[65].setRotationPoint(44F, -12F, -42F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[66].setRotationPoint(28F, -12F, -42F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 121
		bodyModel[67].setRotationPoint(27F, -12F, -42F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[68].setRotationPoint(9F, -12F, -42F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[69].setRotationPoint(25F, -12F, -42F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 124
		bodyModel[70].setRotationPoint(8F, -12F, -42F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[71].setRotationPoint(-10F, -12F, -42F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[72].setRotationPoint(6F, -12F, -42F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 127
		bodyModel[73].setRotationPoint(-11F, -12F, -42F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-29F, -12F, -42F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[75].setRotationPoint(-13F, -12F, -42F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[76].setRotationPoint(-30F, -12F, -42F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 13, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[77].setRotationPoint(-45F, -12F, -42F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 132
		bodyModel[78].setRotationPoint(-46F, -12F, -42F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[79].setRotationPoint(-32F, -12F, -42F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 15, 2, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[80].setRotationPoint(47F, -12F, 40F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[81].setRotationPoint(46F, -12F, 40F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[82].setRotationPoint(44F, -12F, 40F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[83].setRotationPoint(28F, -12F, 40F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 138
		bodyModel[84].setRotationPoint(27F, -12F, 40F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[85].setRotationPoint(9F, -12F, 40F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[86].setRotationPoint(25F, -12F, 40F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 141
		bodyModel[87].setRotationPoint(8F, -12F, 40F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[88].setRotationPoint(-10F, -12F, 40F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[89].setRotationPoint(6F, -12F, 40F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 144
		bodyModel[90].setRotationPoint(-11F, -12F, 40F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 16, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[91].setRotationPoint(-29F, -12F, 40F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[92].setRotationPoint(-13F, -12F, 40F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 147
		bodyModel[93].setRotationPoint(-30F, -12F, 40F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 13, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[94].setRotationPoint(-45F, -12F, 40F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 149
		bodyModel[95].setRotationPoint(-46F, -12F, 40F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[96].setRotationPoint(-32F, -12F, 40F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[97].setRotationPoint(2F, -20F, -31F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[98].setRotationPoint(10F, -20F, -31F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[99].setRotationPoint(-43F, -20F, -31F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[100].setRotationPoint(-35F, -20F, -31F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[101].setRotationPoint(2F, -20F, 21F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[102].setRotationPoint(10F, -20F, 21F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[103].setRotationPoint(-43F, -20F, 21F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[104].setRotationPoint(-35F, -20F, 21F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[105].setRotationPoint(43F, -14F, -37F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[106].setRotationPoint(46F, -14F, -37F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[107].setRotationPoint(43F, -15F, -37F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[108].setRotationPoint(43F, -14F, -33F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[109].setRotationPoint(39F, -14F, -32F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[110].setRotationPoint(39F, -14F, -29F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[111].setRotationPoint(47F, -13F, -33F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[112].setRotationPoint(53.5F, -12.5F, -32.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[113].setRotationPoint(27F, -14F, -38F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[114].setRotationPoint(27F, -14F, -37F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[115].setRotationPoint(29F, -14F, -37F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[116].setRotationPoint(31F, -14F, -37F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[117].setRotationPoint(33F, -14F, -37F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[118].setRotationPoint(35F, -14F, -37F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[119].setRotationPoint(37F, -14F, -37F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[120].setRotationPoint(43F, -14F, 36F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[121].setRotationPoint(46F, -14F, 36F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[122].setRotationPoint(43F, -15F, 36F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[123].setRotationPoint(43F, -14F, 27F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[124].setRotationPoint(39F, -14F, 31F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[125].setRotationPoint(39F, -14F, 28F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[126].setRotationPoint(47F, -13F, 27F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[127].setRotationPoint(53.5F, -12.5F, 27.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[128].setRotationPoint(27F, -14F, 37F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[129].setRotationPoint(27F, -14F, 35F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[130].setRotationPoint(29F, -14F, 35F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[131].setRotationPoint(31F, -14F, 35F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[132].setRotationPoint(33F, -14F, 35F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[133].setRotationPoint(35F, -14F, 35F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[134].setRotationPoint(37F, -14F, 35F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[135].setRotationPoint(-24F, -17.5F, -36F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[136].setRotationPoint(-8F, -17.5F, -36F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[137].setRotationPoint(-24F, -17.5F, -29F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[138].setRotationPoint(-8F, -17.5F, -29F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[139].setRotationPoint(-24F, -17.5F, 35F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[140].setRotationPoint(-8F, -17.5F, 35F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[141].setRotationPoint(-24F, -17.5F, 28F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[142].setRotationPoint(-8F, -17.5F, 28F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[143].setRotationPoint(-32F, -14F, -35F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[144].setRotationPoint(-32F, -14F, 29F);


		turretModel = new ModelRendererTurbo[53];
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		turretModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 153
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		turretModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 156
		turretModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		turretModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		turretModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		turretModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		turretModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		turretModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		turretModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		turretModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		turretModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		turretModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		turretModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		turretModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		turretModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		turretModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		turretModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		turretModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		turretModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		turretModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		turretModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		turretModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		turretModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		turretModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		turretModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		turretModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191

		turretModel[0].addShapeBox(0F, 0F, 0F, 18, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		turretModel[0].setRotationPoint(-18F, -33F, -10F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 27, 11, 6, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		turretModel[1].setRotationPoint(0F, -33F, -10F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 27, 11, 6, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[2].setRotationPoint(0F, -33F, 4F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 27, 11, 14, 0F,0F, -3F, -9F, -12F, -9F, -6F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		turretModel[3].setRotationPoint(0F, -33F, -24F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 27, 3, 14, 0F,0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -18F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 76
		turretModel[4].setRotationPoint(0F, -22F, -24F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 27, 11, 14, 0F,0F, 0F, 0F, 0F, -9F, 0F, -12F, -9F, -6F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 77
		turretModel[5].setRotationPoint(0F, -33F, 10F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 27, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -18F, 0F, -6F, 0F, 0F, -6F); // Box 78
		turretModel[6].setRotationPoint(0F, -22F, 10F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 27, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 79
		turretModel[7].setRotationPoint(0F, -22F, -10F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 27, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 80
		turretModel[8].setRotationPoint(0F, -22F, 4F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 18, 11, 14, 0F,0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		turretModel[9].setRotationPoint(-18F, -33F, -24F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		turretModel[10].setRotationPoint(-18F, -22F, -24F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 18, 11, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[11].setRotationPoint(-18F, -33F, 10F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 18, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 84
		turretModel[12].setRotationPoint(-18F, -22F, 10F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 8, 11, 14, 0F,0F, -3F, -18F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, -3F, 9F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F); // Box 85
		turretModel[13].setRotationPoint(-26F, -33F, -24F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 8, 11, 14, 0F,0F, -3F, 9F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, -3F, -18F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 86
		turretModel[14].setRotationPoint(-26F, -33F, 10F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 8, 11, 20, 0F,0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 87
		turretModel[15].setRotationPoint(-26F, -33F, -10F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 8, 3, 48, 0F,0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -3F, 0F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -15F); // Box 89
		turretModel[16].setRotationPoint(-26F, -22F, -24F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 14, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		turretModel[17].setRotationPoint(-32F, -31F, -13F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 3, 10, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[18].setRotationPoint(-35F, -31F, -13F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 14, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		turretModel[19].setRotationPoint(-32F, -31F, 2F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 3, 10, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[20].setRotationPoint(-35F, -31F, 2F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 7, 14, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 95
		turretModel[21].setRotationPoint(0F, -33F, -4F);

		turretModel[22].addShapeBox(0F, -7F, -4F, 20, 14, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 96
		turretModel[22].setRotationPoint(0F, -26F, 0F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		turretModel[23].setRotationPoint(-12F, -34F, -5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 152
		turretModel[24].setRotationPoint(-13F, -34F, -5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 153
		turretModel[25].setRotationPoint(-4F, -34F, -5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[26].setRotationPoint(-32F, -32F, -13F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[27].setRotationPoint(-32F, -32F, -3F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		turretModel[28].setRotationPoint(-32F, -32F, -12F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		turretModel[29].setRotationPoint(-29F, -32F, -12F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		turretModel[30].setRotationPoint(-27F, -32F, -12F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		turretModel[31].setRotationPoint(-25F, -32F, -12F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		turretModel[32].setRotationPoint(-23F, -32F, -12F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		turretModel[33].setRotationPoint(-21F, -32F, -12F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 163
		turretModel[34].setRotationPoint(-28F, -32F, -8F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		turretModel[35].setRotationPoint(-27F, -35F, -7F);

		turretModel[36].addTrapezoid(0F, 0F, 0F, 1, 16, 1, 0F, -0.40F, ModelRendererTurbo.MR_TOP); // Box 166
		turretModel[36].setRotationPoint(-28.5F, -51F, -6.5F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 167
		turretModel[37].setRotationPoint(-32F, -34F, -6.5F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		turretModel[38].setRotationPoint(-32F, -35F, -6.5F);

		turretModel[39].addTrapezoid(0F, 0F, 0F, 1, 16, 1, 0F, -0.40F, ModelRendererTurbo.MR_TOP); // Box 169
		turretModel[39].setRotationPoint(-31F, -51F, -6.5F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		turretModel[40].setRotationPoint(-32F, -32F, 2F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		turretModel[41].setRotationPoint(-32F, -32F, 12F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		turretModel[42].setRotationPoint(-31F, -32F, 3F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		turretModel[43].setRotationPoint(-27F, -32F, 3F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		turretModel[44].setRotationPoint(-27F, -32F, 10F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		turretModel[45].setRotationPoint(-31F, -32F, 10F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 176
		turretModel[46].setRotationPoint(-30F, -32F, 6F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		turretModel[47].setRotationPoint(-2F, -35F, -2F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		turretModel[48].setRotationPoint(-18F, -34F, 7F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 179
		turretModel[49].setRotationPoint(-4F, -35F, -7F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		turretModel[50].setRotationPoint(-18F, -34F, -9F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		turretModel[51].setRotationPoint(-4F, -35F, 3F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 191
		turretModel[52].setRotationPoint(-7F, -57F, 7.5F);


		barrelModel = new ModelRendererTurbo[21];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		barrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		barrelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		barrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		barrelModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		barrelModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		barrelModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		barrelModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		barrelModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		barrelModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		barrelModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		barrelModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		barrelModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		barrelModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		barrelModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		barrelModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		barrelModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		barrelModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		barrelModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		barrelModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 396

		barrelModel[0].addShapeBox(0F, -3.5F, -3.5F, 10, 7, 7, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 97
		barrelModel[0].setRotationPoint(20F, -26F, 0F);

		barrelModel[1].addShapeBox(10F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 98
		barrelModel[1].setRotationPoint(20F, -26F, 0F);

		barrelModel[2].addShapeBox(14F, -1.5F, -1.5F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		barrelModel[2].setRotationPoint(20F, -26F, 0F);

		barrelModel[3].addShapeBox(22F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 100
		barrelModel[3].setRotationPoint(20F, -26F, 0F);

		barrelModel[4].addShapeBox(26F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[4].setRotationPoint(20F, -26F, 0F);

		barrelModel[5].addShapeBox(30F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 102
		barrelModel[5].setRotationPoint(20F, -26F, 0F);

		barrelModel[6].addShapeBox(34F, -1.5F, -1.5F, 25, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[6].setRotationPoint(20F, -26F, 0F);

		barrelModel[7].addShapeBox(59F, -2.5F, -2.5F, 4, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 104
		barrelModel[7].setRotationPoint(20F, -26F, 0F);

		barrelModel[8].addShapeBox(63F, -2.5F, -2.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		barrelModel[8].setRotationPoint(20F, -26F, 0F);

		barrelModel[9].addShapeBox(63F, -2.5F, 1.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		barrelModel[9].setRotationPoint(20F, -26F, 0F);

		barrelModel[10].addShapeBox(63F, 1.5F, 1.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		barrelModel[10].setRotationPoint(20F, -26F, 0F);

		barrelModel[11].addShapeBox(63F, 1.5F, -2.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		barrelModel[11].setRotationPoint(20F, -26F, 0F);

		barrelModel[12].addShapeBox(64F, -1.5F, 1.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		barrelModel[12].setRotationPoint(20F, -26F, 0F);

		barrelModel[13].addShapeBox(68F, -1.5F, 1.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		barrelModel[13].setRotationPoint(20F, -26F, 0F);

		barrelModel[14].addShapeBox(64F, -1.5F, -2.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		barrelModel[14].setRotationPoint(20F, -26F, 0F);

		barrelModel[15].addShapeBox(68F, -1.5F, -2.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		barrelModel[15].setRotationPoint(20F, -26F, 0F);

		barrelModel[16].addShapeBox(64F, -2.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		barrelModel[16].setRotationPoint(20F, -26F, 0F);

		barrelModel[17].addShapeBox(68F, -2.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		barrelModel[17].setRotationPoint(20F, -26F, 0F);

		barrelModel[18].addShapeBox(64F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		barrelModel[18].setRotationPoint(20F, -26F, 0F);

		barrelModel[19].addShapeBox(68F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		barrelModel[19].setRotationPoint(20F, -26F, 0F);

		barrelModel[20].addShapeBox(-5F, -3.5F, -3.5F, 5, 7, 7, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 396
		barrelModel[20].setRotationPoint(20F, -26F, 0F);


		leftTrackModel = new ModelRendererTurbo[86];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 310
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 311
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 312
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 313
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 314
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 315
		leftTrackModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 316
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 317
		leftTrackModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 318
		leftTrackModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 319
		leftTrackModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 320
		leftTrackModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 321
		leftTrackModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 322
		leftTrackModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 323
		leftTrackModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 324
		leftTrackModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 325
		leftTrackModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 326
		leftTrackModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 327
		leftTrackModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 328
		leftTrackModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 329
		leftTrackModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 330
		leftTrackModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 331
		leftTrackModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 332
		leftTrackModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 333
		leftTrackModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 334
		leftTrackModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 335
		leftTrackModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 336
		leftTrackModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 337
		leftTrackModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 338
		leftTrackModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 339
		leftTrackModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 340
		leftTrackModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 341
		leftTrackModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 342
		leftTrackModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 343
		leftTrackModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 344
		leftTrackModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 345
		leftTrackModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 346
		leftTrackModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 347
		leftTrackModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 348
		leftTrackModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 349
		leftTrackModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 350
		leftTrackModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 351
		leftTrackModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 352
		leftTrackModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 353
		leftTrackModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 354
		leftTrackModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 355
		leftTrackModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 356
		leftTrackModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 357
		leftTrackModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 358
		leftTrackModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 359
		leftTrackModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 360
		leftTrackModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 361
		leftTrackModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 362
		leftTrackModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		leftTrackModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		leftTrackModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		leftTrackModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		leftTrackModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367
		leftTrackModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 368
		leftTrackModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		leftTrackModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		leftTrackModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		leftTrackModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		leftTrackModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373
		leftTrackModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 374
		leftTrackModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 375
		leftTrackModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 376
		leftTrackModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 377
		leftTrackModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 378
		leftTrackModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 379
		leftTrackModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 380
		leftTrackModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 381
		leftTrackModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 382
		leftTrackModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383
		leftTrackModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 384
		leftTrackModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 385
		leftTrackModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 386
		leftTrackModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 387
		leftTrackModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 388
		leftTrackModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 389
		leftTrackModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 390
		leftTrackModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 391
		leftTrackModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 392
		leftTrackModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 393
		leftTrackModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 394
		leftTrackModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 395

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftTrackModel[0].setRotationPoint(52F, -2F, 27F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		leftTrackModel[1].setRotationPoint(52F, -4F, 27F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftTrackModel[2].setRotationPoint(53F, -5F, 27F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 313
		leftTrackModel[3].setRotationPoint(52F, 1F, 27F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 314
		leftTrackModel[4].setRotationPoint(53F, 3F, 27F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftTrackModel[5].setRotationPoint(27F, -1F, 34F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftTrackModel[6].setRotationPoint(27F, -4F, 34F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		leftTrackModel[7].setRotationPoint(29F, -6F, 34F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 318
		leftTrackModel[8].setRotationPoint(27F, 4F, 34F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 319
		leftTrackModel[9].setRotationPoint(29F, 7F, 34F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftTrackModel[10].setRotationPoint(29F, -6F, 27F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		leftTrackModel[11].setRotationPoint(27F, -4F, 27F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		leftTrackModel[12].setRotationPoint(27F, -1F, 27F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 323
		leftTrackModel[13].setRotationPoint(27F, 4F, 27F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 324
		leftTrackModel[14].setRotationPoint(29F, 7F, 27F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftTrackModel[15].setRotationPoint(31F, -3F, 30F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftTrackModel[16].setRotationPoint(30F, -2F, 30F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		leftTrackModel[17].setRotationPoint(30F, 0F, 30F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 328
		leftTrackModel[18].setRotationPoint(30F, 3F, 30F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 329
		leftTrackModel[19].setRotationPoint(31F, 5F, 30F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		leftTrackModel[20].setRotationPoint(33F, 0F, 15F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftTrackModel[21].setRotationPoint(13F, 0F, 15F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 23, 4, 5, 0F,4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftTrackModel[22].setRotationPoint(13F, -1F, 10F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftTrackModel[23].setRotationPoint(11F, -3F, 30F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftTrackModel[24].setRotationPoint(10F, -2F, 30F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackModel[25].setRotationPoint(10F, 0F, 30F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 336
		leftTrackModel[26].setRotationPoint(10F, 3F, 30F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 337
		leftTrackModel[27].setRotationPoint(11F, 5F, 30F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		leftTrackModel[28].setRotationPoint(9F, -6F, 34F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftTrackModel[29].setRotationPoint(7F, -4F, 34F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		leftTrackModel[30].setRotationPoint(7F, -1F, 34F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 341
		leftTrackModel[31].setRotationPoint(7F, 4F, 34F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 342
		leftTrackModel[32].setRotationPoint(9F, 7F, 34F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[33].setRotationPoint(9F, -6F, 27F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftTrackModel[34].setRotationPoint(7F, -4F, 27F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftTrackModel[35].setRotationPoint(7F, -1F, 27F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 346
		leftTrackModel[36].setRotationPoint(7F, 4F, 27F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 347
		leftTrackModel[37].setRotationPoint(9F, 7F, 27F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 23, 4, 5, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		leftTrackModel[38].setRotationPoint(-32F, -1F, 10F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[39].setRotationPoint(-32F, 0F, 15F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftTrackModel[40].setRotationPoint(-12F, 0F, 15F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftTrackModel[41].setRotationPoint(-16F, -6F, 27F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		leftTrackModel[42].setRotationPoint(-18F, -4F, 27F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftTrackModel[43].setRotationPoint(-18F, -1F, 27F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 354
		leftTrackModel[44].setRotationPoint(-16F, 7F, 27F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 355
		leftTrackModel[45].setRotationPoint(-18F, 4F, 27F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 356
		leftTrackModel[46].setRotationPoint(-14F, 5F, 30F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 357
		leftTrackModel[47].setRotationPoint(-15F, 3F, 30F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		leftTrackModel[48].setRotationPoint(-15F, 0F, 30F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		leftTrackModel[49].setRotationPoint(-15F, -2F, 30F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		leftTrackModel[50].setRotationPoint(-14F, -3F, 30F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftTrackModel[51].setRotationPoint(-16F, -6F, 34F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftTrackModel[52].setRotationPoint(-18F, -4F, 34F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		leftTrackModel[53].setRotationPoint(-18F, -1F, 34F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 364
		leftTrackModel[54].setRotationPoint(-18F, 4F, 34F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 365
		leftTrackModel[55].setRotationPoint(-16F, 7F, 34F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftTrackModel[56].setRotationPoint(-36F, -6F, 27F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftTrackModel[57].setRotationPoint(-38F, -4F, 27F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		leftTrackModel[58].setRotationPoint(-38F, -1F, 27F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 369
		leftTrackModel[59].setRotationPoint(-38F, 4F, 27F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 370
		leftTrackModel[60].setRotationPoint(-36F, 7F, 27F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftTrackModel[61].setRotationPoint(-34F, -3F, 30F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftTrackModel[62].setRotationPoint(-35F, -2F, 30F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftTrackModel[63].setRotationPoint(-35F, 0F, 30F);

		leftTrackModel[64].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 374
		leftTrackModel[64].setRotationPoint(-35F, 3F, 30F);

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 375
		leftTrackModel[65].setRotationPoint(-34F, 5F, 30F);

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 376
		leftTrackModel[66].setRotationPoint(-36F, 7F, 34F);

		leftTrackModel[67].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftTrackModel[67].setRotationPoint(-38F, -1F, 34F);

		leftTrackModel[68].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 378
		leftTrackModel[68].setRotationPoint(-38F, 4F, 34F);

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		leftTrackModel[69].setRotationPoint(-36F, -6F, 34F);

		leftTrackModel[70].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		leftTrackModel[70].setRotationPoint(-38F, -4F, 34F);

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		leftTrackModel[71].setRotationPoint(-52F, -2F, 27F);

		leftTrackModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftTrackModel[72].setRotationPoint(-51F, -5F, 27F);

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		leftTrackModel[73].setRotationPoint(-52F, -4F, 27F);

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 384
		leftTrackModel[74].setRotationPoint(-52F, 1F, 27F);

		leftTrackModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 385
		leftTrackModel[75].setRotationPoint(-51F, 3F, 27F);

		leftTrackModel[76].addShapeBox(2F, 0F, 0F, 110, 1, 12, 0F,-0.4F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[76].setRotationPoint(-52F, -6F, 26F);

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftTrackModel[77].setRotationPoint(60F, -6F, 26F);
		leftTrackModel[77].rotateAngleZ = -1.01229097F;

		leftTrackModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		leftTrackModel[78].setRotationPoint(62.1F, -2.6F, 26F);
		leftTrackModel[78].rotateAngleZ = -1.57079633F;

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftTrackModel[79].setRotationPoint(62.1F, 2.4F, 26F);
		leftTrackModel[79].rotateAngleZ = -2.44346095F;

		leftTrackModel[80].addShapeBox(0F, 0F, 0F, 23, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftTrackModel[80].setRotationPoint(59.8F, 4.3F, 26F);
		leftTrackModel[80].rotateAngleZ = -2.89550123F;

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 71, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		leftTrackModel[81].setRotationPoint(37.5F, 9.9F, 26F);
		leftTrackModel[81].rotateAngleZ = -3.14159265F;

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		leftTrackModel[82].setRotationPoint(-33.5F, 9.9F, 26F);
		leftTrackModel[82].rotateAngleZ = -3.43829863F;

		leftTrackModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		leftTrackModel[83].setRotationPoint(-49.8F, 4.9F, 26F);
		leftTrackModel[83].rotateAngleZ = -3.94444411F;

		leftTrackModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		leftTrackModel[84].setRotationPoint(-52.6F, 2F, 26F);
		leftTrackModel[84].rotateAngleZ = -4.71238898F;

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		leftTrackModel[85].setRotationPoint(-52.6F, -2F, 26F);
		leftTrackModel[85].rotateAngleZ = -5.34070751F;


		rightTrackModel = new ModelRendererTurbo[86];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 220
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 224
		rightTrackModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 225
		rightTrackModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 226
		rightTrackModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 231
		rightTrackModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		rightTrackModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		rightTrackModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		rightTrackModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		rightTrackModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		rightTrackModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		rightTrackModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		rightTrackModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		rightTrackModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 241
		rightTrackModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		rightTrackModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		rightTrackModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		rightTrackModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		rightTrackModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 246
		rightTrackModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		rightTrackModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 248
		rightTrackModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 249
		rightTrackModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		rightTrackModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		rightTrackModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 252
		rightTrackModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 253
		rightTrackModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 254
		rightTrackModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 255
		rightTrackModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 256
		rightTrackModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257
		rightTrackModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 258
		rightTrackModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 259
		rightTrackModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 260
		rightTrackModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 261
		rightTrackModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 262
		rightTrackModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 263
		rightTrackModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 264
		rightTrackModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 265
		rightTrackModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 266
		rightTrackModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 267
		rightTrackModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 268
		rightTrackModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		rightTrackModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 270
		rightTrackModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		rightTrackModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		rightTrackModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		rightTrackModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 274
		rightTrackModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 275
		rightTrackModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 276
		rightTrackModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 277
		rightTrackModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 278
		rightTrackModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 279
		rightTrackModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 280
		rightTrackModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 281
		rightTrackModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 282
		rightTrackModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 283
		rightTrackModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 284
		rightTrackModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 285
		rightTrackModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 286
		rightTrackModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 287
		rightTrackModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 288
		rightTrackModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 289
		rightTrackModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 290
		rightTrackModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 291
		rightTrackModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 292
		rightTrackModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 293
		rightTrackModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 294
		rightTrackModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 295
		rightTrackModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 296
		rightTrackModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		rightTrackModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 298
		rightTrackModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 299
		rightTrackModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 300
		rightTrackModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 301
		rightTrackModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 302
		rightTrackModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 303
		rightTrackModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 304
		rightTrackModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 305
		rightTrackModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 306
		rightTrackModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 307
		rightTrackModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 308
		rightTrackModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 309

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightTrackModel[0].setRotationPoint(52F, -2F, -37F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackModel[1].setRotationPoint(52F, -4F, -37F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightTrackModel[2].setRotationPoint(53F, -5F, -37F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 225
		rightTrackModel[3].setRotationPoint(52F, 1F, -37F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 226
		rightTrackModel[4].setRotationPoint(53F, 3F, -37F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackModel[5].setRotationPoint(27F, -1F, -37F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackModel[6].setRotationPoint(27F, -4F, -37F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[7].setRotationPoint(29F, -6F, -37F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 231
		rightTrackModel[8].setRotationPoint(27F, 4F, -37F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 232
		rightTrackModel[9].setRotationPoint(29F, 7F, -37F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightTrackModel[10].setRotationPoint(29F, -6F, -30F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackModel[11].setRotationPoint(27F, -4F, -30F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackModel[12].setRotationPoint(27F, -1F, -30F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 236
		rightTrackModel[13].setRotationPoint(27F, 4F, -30F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 237
		rightTrackModel[14].setRotationPoint(29F, 7F, -30F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackModel[15].setRotationPoint(31F, -3F, -34F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackModel[16].setRotationPoint(30F, -2F, -34F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackModel[17].setRotationPoint(30F, 0F, -34F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 242
		rightTrackModel[18].setRotationPoint(30F, 3F, -34F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 243
		rightTrackModel[19].setRotationPoint(31F, 5F, -34F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackModel[20].setRotationPoint(11F, -3F, -34F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackModel[21].setRotationPoint(10F, -2F, -34F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackModel[22].setRotationPoint(10F, 0F, -34F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 247
		rightTrackModel[23].setRotationPoint(10F, 3F, -34F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 248
		rightTrackModel[24].setRotationPoint(11F, 5F, -34F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackModel[25].setRotationPoint(9F, -6F, -37F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightTrackModel[26].setRotationPoint(7F, -4F, -37F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightTrackModel[27].setRotationPoint(7F, -1F, -37F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 252
		rightTrackModel[28].setRotationPoint(7F, 4F, -37F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 253
		rightTrackModel[29].setRotationPoint(9F, 7F, -37F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightTrackModel[30].setRotationPoint(9F, -6F, -30F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackModel[31].setRotationPoint(7F, -4F, -30F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[32].setRotationPoint(7F, -1F, -30F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 257
		rightTrackModel[33].setRotationPoint(7F, 4F, -30F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 258
		rightTrackModel[34].setRotationPoint(9F, 7F, -30F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightTrackModel[35].setRotationPoint(33F, 0F, -27F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightTrackModel[36].setRotationPoint(13F, 0F, -27F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 23, 4, 5, 0F,4F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightTrackModel[37].setRotationPoint(13F, -1F, -15F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 23, 4, 5, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightTrackModel[38].setRotationPoint(-32F, -1F, -15F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		rightTrackModel[39].setRotationPoint(-32F, 0F, -27F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightTrackModel[40].setRotationPoint(-12F, 0F, -27F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightTrackModel[41].setRotationPoint(-36F, -6F, -30F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightTrackModel[42].setRotationPoint(-38F, -4F, -30F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightTrackModel[43].setRotationPoint(-38F, -1F, -30F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 268
		rightTrackModel[44].setRotationPoint(-38F, 4F, -30F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 269
		rightTrackModel[45].setRotationPoint(-36F, 7F, -30F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightTrackModel[46].setRotationPoint(-34F, -3F, -34F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightTrackModel[47].setRotationPoint(-35F, -2F, -34F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightTrackModel[48].setRotationPoint(-35F, 0F, -34F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 273
		rightTrackModel[49].setRotationPoint(-35F, 3F, -34F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 274
		rightTrackModel[50].setRotationPoint(-34F, 5F, -34F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 275
		rightTrackModel[51].setRotationPoint(-36F, 7F, -37F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		rightTrackModel[52].setRotationPoint(-38F, -1F, -37F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 277
		rightTrackModel[53].setRotationPoint(-38F, 4F, -37F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackModel[54].setRotationPoint(-36F, -6F, -37F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackModel[55].setRotationPoint(-38F, -4F, -37F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightTrackModel[56].setRotationPoint(-16F, -6F, -30F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackModel[57].setRotationPoint(-18F, -4F, -30F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightTrackModel[58].setRotationPoint(-18F, -1F, -30F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 283
		rightTrackModel[59].setRotationPoint(-16F, 7F, -30F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 284
		rightTrackModel[60].setRotationPoint(-18F, 4F, -30F);

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 285
		rightTrackModel[61].setRotationPoint(-14F, 5F, -34F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 286
		rightTrackModel[62].setRotationPoint(-15F, 3F, -34F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackModel[63].setRotationPoint(-15F, 0F, -34F);

		rightTrackModel[64].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightTrackModel[64].setRotationPoint(-15F, -2F, -34F);

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightTrackModel[65].setRotationPoint(-14F, -3F, -34F);

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackModel[66].setRotationPoint(-16F, -6F, -37F);

		rightTrackModel[67].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackModel[67].setRotationPoint(-18F, -4F, -37F);

		rightTrackModel[68].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[68].setRotationPoint(-18F, -1F, -37F);

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 293
		rightTrackModel[69].setRotationPoint(-18F, 4F, -37F);

		rightTrackModel[70].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 294
		rightTrackModel[70].setRotationPoint(-16F, 7F, -37F);

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackModel[71].setRotationPoint(-52F, -2F, -37F);

		rightTrackModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackModel[72].setRotationPoint(-51F, -5F, -37F);

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackModel[73].setRotationPoint(-52F, -4F, -37F);

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 298
		rightTrackModel[74].setRotationPoint(-52F, 1F, -37F);

		rightTrackModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 299
		rightTrackModel[75].setRotationPoint(-51F, 3F, -37F);

		rightTrackModel[76].addShapeBox(2F, 0F, 0F, 110, 1, 12, 0F,-0.4F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightTrackModel[76].setRotationPoint(-52F, -6F, -38F);

		rightTrackModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackModel[77].setRotationPoint(60F, -6F, -38F);
		rightTrackModel[77].rotateAngleZ = -1.01229097F;

		rightTrackModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightTrackModel[78].setRotationPoint(62.1F, -2.6F, -38F);
		rightTrackModel[78].rotateAngleZ = -1.57079633F;

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightTrackModel[79].setRotationPoint(62.1F, 2.4F, -38F);
		rightTrackModel[79].rotateAngleZ = -2.44346095F;

		rightTrackModel[80].addShapeBox(0F, 0F, 0F, 23, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightTrackModel[80].setRotationPoint(59.8F, 4.3F, -38F);
		rightTrackModel[80].rotateAngleZ = -2.89550123F;

		rightTrackModel[81].addShapeBox(0F, 0F, 0F, 71, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightTrackModel[81].setRotationPoint(37.5F, 9.9F, -38F);
		rightTrackModel[81].rotateAngleZ = -3.14159265F;

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightTrackModel[82].setRotationPoint(-33.5F, 9.9F, -38F);
		rightTrackModel[82].rotateAngleZ = -3.43829863F;

		rightTrackModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		rightTrackModel[83].setRotationPoint(-49.8F, 4.9F, -38F);
		rightTrackModel[83].rotateAngleZ = -3.94444411F;

		rightTrackModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackModel[84].setRotationPoint(-52.6F, 2F, -38F);
		rightTrackModel[84].rotateAngleZ = -4.71238898F;

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightTrackModel[85].setRotationPoint(-52.6F, -2F, -38F);
		rightTrackModel[85].rotateAngleZ = -5.34070751F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}