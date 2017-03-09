//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BMD1
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.evp2; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelBMD1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBMD1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[207];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box3
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box5
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box6
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box7
		bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box9
		bodyModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box10
		bodyModel[6] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box11
		bodyModel[7] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box13
		bodyModel[8] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import Box14
		bodyModel[9] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Box15
		bodyModel[10] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box16
		bodyModel[11] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box18
		bodyModel[12] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box21
		bodyModel[13] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import Box22
		bodyModel[14] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import Box23
		bodyModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box24
		bodyModel[16] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box25
		bodyModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Import Box26
		bodyModel[18] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box27
		bodyModel[19] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box28
		bodyModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box29
		bodyModel[21] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box30
		bodyModel[22] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box31
		bodyModel[23] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import Box32
		bodyModel[24] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import Box34
		bodyModel[25] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Box35
		bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box36
		bodyModel[27] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box37
		bodyModel[28] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import Box38
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box39
		bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box40
		bodyModel[31] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import Box41
		bodyModel[32] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box42
		bodyModel[33] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box43
		bodyModel[34] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box44
		bodyModel[35] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box45
		bodyModel[36] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box46
		bodyModel[37] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box47
		bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box48
		bodyModel[39] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box49
		bodyModel[40] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box50
		bodyModel[41] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box51
		bodyModel[42] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box52
		bodyModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box53
		bodyModel[44] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box54
		bodyModel[45] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box55
		bodyModel[46] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box56
		bodyModel[47] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box57
		bodyModel[48] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box58
		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box59
		bodyModel[50] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box60
		bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box61
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box62
		bodyModel[53] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box63
		bodyModel[54] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box58
		bodyModel[55] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import Box59
		bodyModel[56] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box53
		bodyModel[57] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box54
		bodyModel[58] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import Box55
		bodyModel[59] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import Box56
		bodyModel[60] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box57
		bodyModel[61] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box60
		bodyModel[62] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box61
		bodyModel[63] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box62
		bodyModel[64] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import Box63
		bodyModel[65] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import Box43
		bodyModel[66] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box44
		bodyModel[67] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box45
		bodyModel[68] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import Box46
		bodyModel[69] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box47
		bodyModel[70] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box48
		bodyModel[71] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import Box49
		bodyModel[72] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Import Box50
		bodyModel[73] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box51
		bodyModel[74] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Box52
		bodyModel[75] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box163
		bodyModel[76] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import Box167
		bodyModel[77] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import Box168
		bodyModel[78] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import Box169
		bodyModel[79] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Import Box170
		bodyModel[80] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Import Box171
		bodyModel[81] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Import Box172
		bodyModel[82] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box173
		bodyModel[83] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box174
		bodyModel[84] = new ModelRendererTurbo(this, 115, 147, textureX, textureY); // Import Box175
		bodyModel[85] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import Box176
		bodyModel[86] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import Box177
		bodyModel[87] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Import Box178
		bodyModel[88] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box179
		bodyModel[89] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Import Box180
		bodyModel[90] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box181
		bodyModel[91] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import Box182
		bodyModel[92] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import Box183
		bodyModel[93] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box184
		bodyModel[94] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box185
		bodyModel[95] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import Box186
		bodyModel[96] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import Box187
		bodyModel[97] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box188
		bodyModel[98] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box189
		bodyModel[99] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box190
		bodyModel[100] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box191
		bodyModel[101] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box192
		bodyModel[102] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import Box193
		bodyModel[103] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Import Box194
		bodyModel[104] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import Box195
		bodyModel[105] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Box194
		bodyModel[106] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import Box195
		bodyModel[107] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Import Box196
		bodyModel[108] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import Box197
		bodyModel[109] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box198
		bodyModel[110] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Import Box199
		bodyModel[111] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Import Box200
		bodyModel[112] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import Box201
		bodyModel[113] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box202
		bodyModel[114] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box203
		bodyModel[115] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Box204
		bodyModel[116] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box205
		bodyModel[117] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Import Box206
		bodyModel[118] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import Box207
		bodyModel[119] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import Box208
		bodyModel[120] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Box209
		bodyModel[121] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Import Box210
		bodyModel[122] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box211
		bodyModel[123] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box212
		bodyModel[124] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Import Box213
		bodyModel[125] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Import Box214
		bodyModel[126] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box215
		bodyModel[127] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Import Box216
		bodyModel[128] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Box217
		bodyModel[129] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box218
		bodyModel[130] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import Box219
		bodyModel[131] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box220
		bodyModel[132] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Import Box221
		bodyModel[133] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Import Box222
		bodyModel[134] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box223
		bodyModel[135] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box224
		bodyModel[136] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import Box223
		bodyModel[137] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Import Box224
		bodyModel[138] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import Box225
		bodyModel[139] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import Box226
		bodyModel[140] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import Box227
		bodyModel[141] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import Box231
		bodyModel[142] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Import Box232
		bodyModel[143] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box233
		bodyModel[144] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import Box234
		bodyModel[145] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import Box242
		bodyModel[146] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import Box243
		bodyModel[147] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Import Box244
		bodyModel[148] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import Box245
		bodyModel[149] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Import Box246
		bodyModel[150] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import Box247
		bodyModel[151] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import Box249
		bodyModel[152] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import Box250
		bodyModel[153] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box251
		bodyModel[154] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box252
		bodyModel[155] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import Box253
		bodyModel[156] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box254
		bodyModel[157] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import Box255
		bodyModel[158] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import Box256
		bodyModel[159] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Import Box257
		bodyModel[160] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Import Box258
		bodyModel[161] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import Box259
		bodyModel[162] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Import Box260
		bodyModel[163] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import Box261
		bodyModel[164] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Import Box262
		bodyModel[165] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Import Box263
		bodyModel[166] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import Box264
		bodyModel[167] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box265
		bodyModel[168] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box266
		bodyModel[169] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import Box267
		bodyModel[170] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import Box268
		bodyModel[171] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box269
		bodyModel[172] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Import Box270
		bodyModel[173] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import Box272
		bodyModel[174] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box273
		bodyModel[175] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box274
		bodyModel[176] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import Box275
		bodyModel[177] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import Box276
		bodyModel[178] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box277
		bodyModel[179] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box278
		bodyModel[180] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Import Box279
		bodyModel[181] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import Box280
		bodyModel[182] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Import Box328
		bodyModel[183] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Import Box271
		bodyModel[184] = new ModelRendererTurbo(this, 74, 196, textureX, textureY); // Import Box272
		bodyModel[185] = new ModelRendererTurbo(this, 74, 188, textureX, textureY); // Import Box273
		bodyModel[186] = new ModelRendererTurbo(this, 74, 180, textureX, textureY); // Import Box274
		bodyModel[187] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box275
		bodyModel[188] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box276
		bodyModel[189] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box277
		bodyModel[190] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box353
		bodyModel[191] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box354
		bodyModel[192] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box355
		bodyModel[193] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box356
		bodyModel[194] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box357
		bodyModel[195] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import Box358
		bodyModel[196] = new ModelRendererTurbo(this, 425, 143, textureX, textureY); // Import Box363
		bodyModel[197] = new ModelRendererTurbo(this, 431, 151, textureX, textureY); // Import Box364
		bodyModel[198] = new ModelRendererTurbo(this, 424, 151, textureX, textureY); // Import Box365
		bodyModel[199] = new ModelRendererTurbo(this, 440, 146, textureX, textureY); // Import Box366
		bodyModel[200] = new ModelRendererTurbo(this, 431, 146, textureX, textureY); // Import Box367
		bodyModel[201] = new ModelRendererTurbo(this, 425, 146, textureX, textureY); // Import Box368
		bodyModel[202] = new ModelRendererTurbo(this, 440, 149, textureX, textureY); // Import Box369
		bodyModel[203] = new ModelRendererTurbo(this, 431, 151, textureX, textureY); // Import Box370
		bodyModel[204] = new ModelRendererTurbo(this, 424, 155, textureX, textureY); // Import Box371
		bodyModel[205] = new ModelRendererTurbo(this, 424, 151, textureX, textureY); // Import Box372
		bodyModel[206] = new ModelRendererTurbo(this, 424, 158, textureX, textureY); // Import Box373

		bodyModel[0].addBox(-7F, 0F, -17F, 19, 8, 34, 0F); // Import Box3
		bodyModel[0].setRotationPoint(0F, -13F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -17F, 14, 5, 17, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[1].setRotationPoint(12F, -13F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F); // Import Box6
		bodyModel[2].setRotationPoint(12F, -13F, 0F);

		bodyModel[3].addShapeBox(0F, 8F, 0F, 20, 12, 17, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -3F, 0F, 0F, -3F); // Import Box7
		bodyModel[3].setRotationPoint(12F, -16F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -17F, 20, 4, 17, 0F, 0.5F, 0F, -2F, -3.5F, -4F, -5F, 0F, -4F, 0F, -3F, 0F, 0F, 0.5F, 0F, -2F, -3.5F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box9
		bodyModel[4].setRotationPoint(23F, -13F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 4, 17, 0F, -3F, 0F, 0F, 0F, -4F, 0F, -3.5F, -4F, -5F, 0.5F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -5F, 0.5F, 0F, -2F); // Import Box10
		bodyModel[5].setRotationPoint(23F, -13F, 0F);

		bodyModel[6].addShapeBox(0F, 4F, 0F, 20, 13, 15, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -3F, 0.5F, 0F, 0F, -11F, -2F, 0F, 0F, -13F, 0F, -3.5F, -13F, -3F, -5.5F, 0F, -1F); // Import Box11
		bodyModel[6].setRotationPoint(23F, -13F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 12F, 16, 6, 10, 0F, 0.5F, -1F, -3F, -2.6F, -4.27F, -0.55F, -4F, -4.3F, -5.65F, -3F, -3F, -4F, 0.5F, 0F, -3F, -0.6F, 0.3F, -0.2F, -2.1F, 0.3F, -6F, 0F, 0F, -3.5F); // Import Box13
		bodyModel[7].setRotationPoint(23F, -14F, 0F);

		bodyModel[8].addShapeBox(0F, 5F, 12F, 16, 12, 8, 0F, -5F, 0F, -2F, -2F, -0.3F, -0.2F, -4F, -0.3F, -4F, -5F, 0F, -4F, -5.5F, 0F, -2F, -0.6F, -11.7F, -0.2F, -2.1F, -11.7F, -4F, -5F, 0F, -4F); // Import Box14
		bodyModel[8].setRotationPoint(23F, -13F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 15F, 15, 5, 5, 0F, 0F, 0F, -2F, -4.5F, 0F, 0F, -1F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4F, 0F, -1.5F, 0F, 0F, 0F); // Import Box15
		bodyModel[9].setRotationPoint(12F, -13F, 0F);

		bodyModel[10].addShapeBox(0F, 7F, 14F, 16, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[10].setRotationPoint(12F, -15F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -20F, 15, 5, 5, 0F, 0F, -2F, 0F, -1F, -2F, -2F, -4.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[11].setRotationPoint(12F, -13F, 0F);

		bodyModel[12].addBox(0F, 0F, 0F, 30, 8, 7, 0F); // Import Box21
		bodyModel[12].setRotationPoint(-37F, -13F, 10F);

		bodyModel[13].addBox(0F, 0F, -7F, 30, 8, 7, 0F); // Import Box22
		bodyModel[13].setRotationPoint(-37F, -13F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 37, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[14].setRotationPoint(-25F, -13F, 17F);

		bodyModel[15].addShapeBox(0F, 0F, -3F, 37, 8, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[15].setRotationPoint(-25F, -13F, -17F);

		bodyModel[16].addBox(0F, 0F, -16F, 54, 9, 32, 0F); // Import Box25
		bodyModel[16].setRotationPoint(-42F, -5F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[17].setRotationPoint(-30F, -13F, 17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[18].setRotationPoint(-37F, -13F, 17F);

		bodyModel[19].addShapeBox(0F, 0F, -3F, 5, 8, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[19].setRotationPoint(-30F, -13F, -17F);

		bodyModel[20].addShapeBox(0F, 0F, -3F, 7, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[20].setRotationPoint(-37F, -13F, -17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 8, 10, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[21].setRotationPoint(-43F, -13F, 10F);

		bodyModel[22].addShapeBox(0F, 0F, -10F, 6, 8, 10, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[22].setRotationPoint(-43F, -13F, -10F);

		bodyModel[23].addShapeBox(0F, 7F, -16F, 16, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[23].setRotationPoint(12F, -15F, 0F);

		bodyModel[24].addShapeBox(0F, 8F, -17F, 20, 12, 17, 0F, 0F, 0F, -1F, -9.5F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[24].setRotationPoint(12F, -16F, 0F);

		bodyModel[25].addShapeBox(0F, 6F, -15F, 20, 13, 15, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -5.5F, 0F, -1F, -3.5F, -13F, -3F, 0F, -13F, 0F, -11F, -2F, 0F); // Import Box35
		bodyModel[25].setRotationPoint(23F, -15F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[26].setRotationPoint(12F, -6F, 16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[27].setRotationPoint(30F, -6F, 16F);
		bodyModel[27].rotateAngleZ = -0.33161256F;

		bodyModel[28].addShapeBox(0F, 0F, -4F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[28].setRotationPoint(12F, -6F, -16F);

		bodyModel[29].addShapeBox(0F, 0F, -4F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[29].setRotationPoint(30F, -6F, -16F);
		bodyModel[29].rotateAngleZ = -0.33161256F;

		bodyModel[30].addShapeBox(0F, 0F, -16F, 1, 9, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Import Box40
		bodyModel[30].setRotationPoint(-43F, -5F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, -10F, 36, 3, 20, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[31].setRotationPoint(-43F, -8F, 0F);

		bodyModel[32].addShapeBox(-11F, 0F, -10F, 11, 5, 20, 0F, -1F, -2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, -2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import Box42
		bodyModel[32].setRotationPoint(-7F, -13F, 0F);

		bodyModel[33].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box43
		bodyModel[33].setRotationPoint(22F, 2F, 16F);
		bodyModel[33].rotateAngleZ = 0.52359878F;

		bodyModel[34].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box44
		bodyModel[34].setRotationPoint(22F, 2F, 16F);
		bodyModel[34].rotateAngleZ = 0.52359878F;

		bodyModel[35].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box45
		bodyModel[35].setRotationPoint(11F, 2F, 16F);
		bodyModel[35].rotateAngleZ = 0.52359878F;

		bodyModel[36].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box46
		bodyModel[36].setRotationPoint(11F, 2F, 16F);
		bodyModel[36].rotateAngleZ = 0.52359878F;

		bodyModel[37].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box47
		bodyModel[37].setRotationPoint(0F, 2F, 16F);
		bodyModel[37].rotateAngleZ = 0.52359878F;

		bodyModel[38].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box48
		bodyModel[38].setRotationPoint(0F, 2F, 16F);
		bodyModel[38].rotateAngleZ = 0.52359878F;

		bodyModel[39].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box49
		bodyModel[39].setRotationPoint(-11F, 2F, 16F);
		bodyModel[39].rotateAngleZ = 0.52359878F;

		bodyModel[40].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box50
		bodyModel[40].setRotationPoint(-11F, 2F, 16F);
		bodyModel[40].rotateAngleZ = 0.52359878F;

		bodyModel[41].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box51
		bodyModel[41].setRotationPoint(-23F, 2F, 16F);
		bodyModel[41].rotateAngleZ = 0.52359878F;

		bodyModel[42].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box52
		bodyModel[42].setRotationPoint(-23F, 2F, 16F);
		bodyModel[42].rotateAngleZ = 0.52359878F;

		bodyModel[43].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[43].setRotationPoint(22F, 2F, 16F);
		bodyModel[43].rotateAngleZ = 0.52359878F;

		bodyModel[44].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[44].setRotationPoint(11F, 2F, 16F);
		bodyModel[44].rotateAngleZ = 0.52359878F;

		bodyModel[45].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[45].setRotationPoint(0F, 2F, 16F);
		bodyModel[45].rotateAngleZ = 0.52359878F;

		bodyModel[46].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[46].setRotationPoint(-11F, 2F, 16F);
		bodyModel[46].rotateAngleZ = 0.52359878F;

		bodyModel[47].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[47].setRotationPoint(-23F, 2F, 16F);
		bodyModel[47].rotateAngleZ = 0.52359878F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[48].setRotationPoint(27.5F, 0F, 16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[49].setRotationPoint(-39.5F, 0F, 16F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box60
		bodyModel[50].setRotationPoint(10F, -3F, 16F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box61
		bodyModel[51].setRotationPoint(0F, -3F, 16F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box62
		bodyModel[52].setRotationPoint(-12F, -3F, 16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box63
		bodyModel[53].setRotationPoint(-23F, -2.5F, 16F);

		bodyModel[54].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[54].setRotationPoint(27.5F, 0F, -16F);

		bodyModel[55].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[55].setRotationPoint(-39.5F, 0F, -16F);

		bodyModel[56].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box53
		bodyModel[56].setRotationPoint(22F, 2F, -16F);
		bodyModel[56].rotateAngleZ = 0.52359878F;

		bodyModel[57].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box54
		bodyModel[57].setRotationPoint(11F, 2F, -16F);
		bodyModel[57].rotateAngleZ = 0.52359878F;

		bodyModel[58].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box55
		bodyModel[58].setRotationPoint(0F, 2F, -16F);
		bodyModel[58].rotateAngleZ = 0.52359878F;

		bodyModel[59].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box56
		bodyModel[59].setRotationPoint(-11F, 2F, -16F);
		bodyModel[59].rotateAngleZ = 0.52359878F;

		bodyModel[60].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box57
		bodyModel[60].setRotationPoint(-23F, 2F, -16F);
		bodyModel[60].rotateAngleZ = 0.52359878F;

		bodyModel[61].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[61].setRotationPoint(10F, -3F, -16F);

		bodyModel[62].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyModel[62].setRotationPoint(0F, -3F, -16F);

		bodyModel[63].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[63].setRotationPoint(-12F, -3F, -16F);

		bodyModel[64].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[64].setRotationPoint(-23F, -2.5F, -16F);

		bodyModel[65].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box43
		bodyModel[65].setRotationPoint(22F, 2F, -16F);
		bodyModel[65].rotateAngleZ = 0.52359878F;

		bodyModel[66].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box44
		bodyModel[66].setRotationPoint(22F, 2F, -16F);
		bodyModel[66].rotateAngleZ = 0.52359878F;

		bodyModel[67].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box45
		bodyModel[67].setRotationPoint(11F, 2F, -16F);
		bodyModel[67].rotateAngleZ = 0.52359878F;

		bodyModel[68].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box46
		bodyModel[68].setRotationPoint(11F, 2F, -16F);
		bodyModel[68].rotateAngleZ = 0.52359878F;

		bodyModel[69].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box47
		bodyModel[69].setRotationPoint(0F, 2F, -16F);
		bodyModel[69].rotateAngleZ = 0.52359878F;

		bodyModel[70].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box48
		bodyModel[70].setRotationPoint(0F, 2F, -16F);
		bodyModel[70].rotateAngleZ = 0.52359878F;

		bodyModel[71].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box49
		bodyModel[71].setRotationPoint(-11F, 2F, -16F);
		bodyModel[71].rotateAngleZ = 0.52359878F;

		bodyModel[72].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box50
		bodyModel[72].setRotationPoint(-11F, 2F, -16F);
		bodyModel[72].rotateAngleZ = 0.52359878F;

		bodyModel[73].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box51
		bodyModel[73].setRotationPoint(-23F, 2F, -16F);
		bodyModel[73].rotateAngleZ = 0.52359878F;

		bodyModel[74].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box52
		bodyModel[74].setRotationPoint(-23F, 2F, -16F);
		bodyModel[74].rotateAngleZ = 0.52359878F;

		bodyModel[75].addShapeBox(-1F, -0.4F, -2F, 1, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box163
		bodyModel[75].setRotationPoint(26F, -11F, -18F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[76].setRotationPoint(-43F, -5F, 16F);

		bodyModel[77].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[77].setRotationPoint(-43F, -5F, -16F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[78].setRotationPoint(-43.01F, -6.25F, 10.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[79].setRotationPoint(-43.01F, -6.25F, 16.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[80].setRotationPoint(-43.01F, -6.25F, 13.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		bodyModel[81].setRotationPoint(-43.01F, -6.25F, -19.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[82].setRotationPoint(-43.01F, -6.25F, -16.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		bodyModel[83].setRotationPoint(-43.01F, -6.25F, -13.25F);

		bodyModel[84].addShapeBox(0F, -0.4F, -3F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		bodyModel[84].setRotationPoint(18F, -13F, 0F);

		bodyModel[85].addShapeBox(0F, -0.4F, -4F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[85].setRotationPoint(18F, -13F, 0F);

		bodyModel[86].addShapeBox(0F, -0.4F, 3F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box177
		bodyModel[86].setRotationPoint(18F, -13F, 0F);

		bodyModel[87].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box178
		bodyModel[87].setRotationPoint(25.5F, -13F, 0F);

		bodyModel[88].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box179
		bodyModel[88].setRotationPoint(25F, -13F, 3F);
		bodyModel[88].rotateAngleY = 0.34906585F;

		bodyModel[89].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box180
		bodyModel[89].setRotationPoint(25F, -13F, -3F);
		bodyModel[89].rotateAngleY = -0.34906585F;

		bodyModel[90].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box181
		bodyModel[90].setRotationPoint(21.5F, -13F, -10F);

		bodyModel[91].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box182
		bodyModel[91].setRotationPoint(21.5F, -13F, 10F);

		bodyModel[92].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box183
		bodyModel[92].setRotationPoint(20.5F, -13F, -13F);
		bodyModel[92].rotateAngleY = -0.34906585F;

		bodyModel[93].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box184
		bodyModel[93].setRotationPoint(20.5F, -13F, 13F);
		bodyModel[93].rotateAngleY = 0.34906585F;

		bodyModel[94].addShapeBox(1.5F, -0.6F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		bodyModel[94].setRotationPoint(19F, -13F, 0F);

		bodyModel[95].addShapeBox(2F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box186
		bodyModel[95].setRotationPoint(15F, -13F, -10F);
		bodyModel[95].rotateAngleY = -0.6981317F;

		bodyModel[96].addShapeBox(4F, -0.2F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box187
		bodyModel[96].setRotationPoint(15F, -13F, -10F);
		bodyModel[96].rotateAngleY = -0.6981317F;

		bodyModel[97].addShapeBox(0F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		bodyModel[97].setRotationPoint(15F, -13F, -10F);
		bodyModel[97].rotateAngleY = -0.6981317F;

		bodyModel[98].addShapeBox(0F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		bodyModel[98].setRotationPoint(15F, -13F, 10F);
		bodyModel[98].rotateAngleY = 0.6981317F;

		bodyModel[99].addShapeBox(2F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box190
		bodyModel[99].setRotationPoint(15F, -13F, 10F);
		bodyModel[99].rotateAngleY = 0.6981317F;

		bodyModel[100].addShapeBox(4F, -0.2F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box191
		bodyModel[100].setRotationPoint(15F, -13F, 10F);
		bodyModel[100].rotateAngleY = 0.6981317F;

		bodyModel[101].addShapeBox(-0.5F, -0.4F, -3.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box192
		bodyModel[101].setRotationPoint(15F, -13F, -10F);
		bodyModel[101].rotateAngleY = -0.6981317F;

		bodyModel[102].addShapeBox(-0.5F, -0.4F, 2.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box193
		bodyModel[102].setRotationPoint(15F, -13F, -10F);
		bodyModel[102].rotateAngleY = -0.6981317F;

		bodyModel[103].addShapeBox(-0.5F, -0.4F, 2.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box194
		bodyModel[103].setRotationPoint(15F, -13F, 10F);
		bodyModel[103].rotateAngleY = 0.6981317F;

		bodyModel[104].addShapeBox(-0.5F, -0.4F, -3.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box195
		bodyModel[104].setRotationPoint(15F, -13F, 10F);
		bodyModel[104].rotateAngleY = 0.6981317F;

		bodyModel[105].addShapeBox(-10F, 0F, -10F, 10, 2, 20, 0F, -4.9F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -3F, -4.9F, 0F, -3F, 0F, 0F, -0.1F, 0F, -2F, -0.1F, 0F, -2F, -0.1F, 0F, 0F, -0.1F); // Import Box194
		bodyModel[105].setRotationPoint(-7F, -13F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[106].setRotationPoint(-10F, -14F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		bodyModel[107].setRotationPoint(-7F, -14F, 14F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -6.9F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		bodyModel[108].setRotationPoint(-7F, -14F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, -7F, 3, 1, 7, 0F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		bodyModel[109].setRotationPoint(-10F, -14F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, -7F, 11, 1, 7, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -6.9F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9F, 0F, 0F, 0F); // Import Box199
		bodyModel[110].setRotationPoint(-7F, -14F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, -3F, 13, 1, 3, 0F, 0F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -2.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		bodyModel[111].setRotationPoint(-7F, -14F, -14F);

		bodyModel[112].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box201
		bodyModel[112].setRotationPoint(-3F, -14F, -16F);
		bodyModel[112].rotateAngleX = 0.50614548F;

		bodyModel[113].addShapeBox(0F, 0F, -3F, 4, 1, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		bodyModel[113].setRotationPoint(-3F, -14F, -16F);
		bodyModel[113].rotateAngleX = 0.50614548F;

		bodyModel[114].addShapeBox(0F, 0F, -4F, 4, 1, 1, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		bodyModel[114].setRotationPoint(-3F, -14F, -16F);
		bodyModel[114].rotateAngleX = 0.50614548F;

		bodyModel[115].addShapeBox(-3F, 0.02F, -3.25F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box204
		bodyModel[115].setRotationPoint(-3F, -14F, -16F);
		bodyModel[115].rotateAngleX = 0.36651914F;
		bodyModel[115].rotateAngleY = 0.78539816F;
		bodyModel[115].rotateAngleZ = 0.34906585F;

		bodyModel[116].addShapeBox(0F, 0F, -7F, 7, 1, 7, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		bodyModel[116].setRotationPoint(-18F, -14F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, -3F, 7, 3, 3, 0F, -1F, -2F, -0.3F, -4F, -2F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, 0F, -0.3F, -4F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		bodyModel[117].setRotationPoint(-18F, -14F, -17F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box207
		bodyModel[118].setRotationPoint(-37F, -13.2F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, -10F, 7, 1, 10, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box208
		bodyModel[119].setRotationPoint(-37F, -13.2F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		bodyModel[120].setRotationPoint(-30F, -13.5F, 18F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box210
		bodyModel[121].setRotationPoint(-30F, -31.5F, 18F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F); // Import Box211
		bodyModel[122].setRotationPoint(-30F, -13F, 17F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box212
		bodyModel[123].setRotationPoint(-37F, -13F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		bodyModel[124].setRotationPoint(-23F, -13F, 7F);

		bodyModel[125].addShapeBox(-5F, 0F, 0F, 7, 8, 3, 0F, 0F, -5.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -5.5F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Import Box214
		bodyModel[125].setRotationPoint(-37F, -13F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, -3F, 14, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box215
		bodyModel[126].setRotationPoint(-37F, -13F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, -3F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		bodyModel[127].setRotationPoint(-23F, -13F, -7F);

		bodyModel[128].addShapeBox(-5F, 0F, -3F, 7, 8, 3, 0F, 0F, -5.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -5.5F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Import Box217
		bodyModel[128].setRotationPoint(-37F, -13F, -7F);

		bodyModel[129].addShapeBox(0F, 5F, -20F, 16, 12, 8, 0F, -5F, 0F, -4F, -4F, -0.3F, -4F, -2F, -0.3F, -0.2F, -5F, 0F, -2F, -5F, 0F, -4F, -2.1F, -11.7F, -4F, -0.6F, -11.7F, -0.2F, -5.5F, 0F, -2F); // Import Box218
		bodyModel[129].setRotationPoint(23F, -13F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, -22F, 16, 6, 10, 0F, -3F, -3F, -4F, -4F, -4.3F, -5.65F, -2.6F, -4.27F, -0.55F, 0.5F, -1F, -3F, 0F, 0F, -3.5F, -2.1F, 0.3F, -6F, -0.6F, 0.3F, -0.2F, 0.5F, 0F, -3F); // Import Box219
		bodyModel[130].setRotationPoint(23F, -14F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, -20F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		bodyModel[131].setRotationPoint(12F, -8F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 15F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box221
		bodyModel[132].setRotationPoint(12F, -8F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, -20F, 14, 2, 3, 0F, 0F, 0F, -0.5F, -0.1F, -0.3F, -3F, -1.1F, -0.3F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -3F, -2.685F, 0F, 1F, 0F, 0F, 0F); // Import Box222
		bodyModel[133].setRotationPoint(23F, -8F, 1F);

		bodyModel[134].addShapeBox(0F, 0F, 15F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box223
		bodyModel[134].setRotationPoint(12F, -8F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 15F, 14, 2, 3, 0F, 0F, 0F, 0F, -1.1F, -0.3F, 1F, -0.1F, -0.3F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.685F, 0F, 1F, -1.4F, 0F, -3F, 0F, 0F, -0.5F); // Import Box224
		bodyModel[135].setRotationPoint(23F, -8F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box223
		bodyModel[136].setRotationPoint(-40F, -12F, 18F);

		bodyModel[137].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		bodyModel[137].setRotationPoint(-40F, -12F, -18F);

		bodyModel[138].addShapeBox(-7.5F, 0F, -0.25F, 6, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box225
		bodyModel[138].setRotationPoint(-35F, -8F, 0F);
		bodyModel[138].rotateAngleZ = 0.34906585F;

		bodyModel[139].addShapeBox(-7.5F, 0F, -4.75F, 6, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box226
		bodyModel[139].setRotationPoint(-35F, -8F, 0F);
		bodyModel[139].rotateAngleZ = 0.34906585F;

		bodyModel[140].addShapeBox(4F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		bodyModel[140].setRotationPoint(26F, -13F, 0F);
		bodyModel[140].rotateAngleZ = -0.2268928F;

		bodyModel[141].addShapeBox(4F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box231
		bodyModel[141].setRotationPoint(26F, -13F, 0F);
		bodyModel[141].rotateAngleZ = -0.2268928F;

		bodyModel[142].addShapeBox(5F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box232
		bodyModel[142].setRotationPoint(26F, -13F, 0F);
		bodyModel[142].rotateAngleZ = -0.2268928F;

		bodyModel[143].addShapeBox(6F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box233
		bodyModel[143].setRotationPoint(26F, -13F, 0F);
		bodyModel[143].rotateAngleZ = -0.2268928F;

		bodyModel[144].addShapeBox(7F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box234
		bodyModel[144].setRotationPoint(26F, -13F, 0F);
		bodyModel[144].rotateAngleZ = -0.2268928F;

		bodyModel[145].addShapeBox(8F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box242
		bodyModel[145].setRotationPoint(26F, -13F, 0F);
		bodyModel[145].rotateAngleZ = -0.2268928F;

		bodyModel[146].addShapeBox(9F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box243
		bodyModel[146].setRotationPoint(26F, -13F, 0F);
		bodyModel[146].rotateAngleZ = -0.2268928F;

		bodyModel[147].addShapeBox(10F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box244
		bodyModel[147].setRotationPoint(26F, -13F, 0F);
		bodyModel[147].rotateAngleZ = -0.2268928F;

		bodyModel[148].addShapeBox(11F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box245
		bodyModel[148].setRotationPoint(26F, -13F, 0F);
		bodyModel[148].rotateAngleZ = -0.2268928F;

		bodyModel[149].addShapeBox(12F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box246
		bodyModel[149].setRotationPoint(26F, -13F, 0F);
		bodyModel[149].rotateAngleZ = -0.2268928F;

		bodyModel[150].addShapeBox(13F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box247
		bodyModel[150].setRotationPoint(26F, -13F, 0F);
		bodyModel[150].rotateAngleZ = -0.2268928F;

		bodyModel[151].addShapeBox(5F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		bodyModel[151].setRotationPoint(26F, -13F, 0F);
		bodyModel[151].rotateAngleZ = -0.2268928F;

		bodyModel[152].addShapeBox(6F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
		bodyModel[152].setRotationPoint(26F, -13F, 0F);
		bodyModel[152].rotateAngleZ = -0.2268928F;

		bodyModel[153].addShapeBox(7F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box251
		bodyModel[153].setRotationPoint(26F, -13F, 0F);
		bodyModel[153].rotateAngleZ = -0.2268928F;

		bodyModel[154].addShapeBox(8F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box252
		bodyModel[154].setRotationPoint(26F, -13F, 0F);
		bodyModel[154].rotateAngleZ = -0.2268928F;

		bodyModel[155].addShapeBox(9F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box253
		bodyModel[155].setRotationPoint(26F, -13F, 0F);
		bodyModel[155].rotateAngleZ = -0.2268928F;

		bodyModel[156].addShapeBox(10F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box254
		bodyModel[156].setRotationPoint(26F, -13F, 0F);
		bodyModel[156].rotateAngleZ = -0.2268928F;

		bodyModel[157].addShapeBox(11F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box255
		bodyModel[157].setRotationPoint(26F, -13F, 0F);
		bodyModel[157].rotateAngleZ = -0.2268928F;

		bodyModel[158].addShapeBox(12F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box256
		bodyModel[158].setRotationPoint(26F, -13F, 0F);
		bodyModel[158].rotateAngleZ = -0.2268928F;

		bodyModel[159].addShapeBox(13F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box257
		bodyModel[159].setRotationPoint(26F, -13F, 0F);
		bodyModel[159].rotateAngleZ = -0.2268928F;

		bodyModel[160].addShapeBox(14.45F, -0.25F, -11F, 3, 1, 11, 0F, 3.117F, -0.7F, 0F, -3.117F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.117F, 0F, 0F, -3.117F, 0.045F, 0F, 0F, -0.68F, 0F, 0F, 0F, 0F); // Import Box258
		bodyModel[160].setRotationPoint(26F, -13F, 0F);
		bodyModel[160].rotateAngleZ = -0.2268928F;

		bodyModel[161].addShapeBox(14.45F, -0.25F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.117F, -0.7F, 0F, 3.117F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.68F, 0F, -3.117F, 0.045F, 0F, 3.117F, 0F, 0F); // Import Box259
		bodyModel[161].setRotationPoint(26F, -13F, 0F);
		bodyModel[161].rotateAngleZ = -0.2268928F;

		bodyModel[162].addShapeBox(-1F, 0F, -2F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box260
		bodyModel[162].setRotationPoint(26F, -11F, -18F);

		bodyModel[163].addShapeBox(-1F, 0.4F, -2F, 1, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Import Box261
		bodyModel[163].setRotationPoint(26F, -11F, -18F);

		bodyModel[164].addShapeBox(-1F, -0.4F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box262
		bodyModel[164].setRotationPoint(26F, -11F, 18F);

		bodyModel[165].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box263
		bodyModel[165].setRotationPoint(26F, -11F, 18F);

		bodyModel[166].addShapeBox(-1F, 0.4F, 0F, 1, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Import Box264
		bodyModel[166].setRotationPoint(26F, -11F, 18F);

		bodyModel[167].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F); // Import Box265
		bodyModel[167].setRotationPoint(26F, -11F, 18F);

		bodyModel[168].addShapeBox(-2F, -0.4F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F); // Import Box266
		bodyModel[168].setRotationPoint(26F, -11F, 18F);

		bodyModel[169].addShapeBox(-2F, 0.4F, 0F, 1, 1, 2, 0F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F); // Import Box267
		bodyModel[169].setRotationPoint(26F, -11F, 18F);

		bodyModel[170].addShapeBox(-2F, 0F, -2F, 1, 1, 2, 0F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F); // Import Box268
		bodyModel[170].setRotationPoint(26F, -11F, -18F);

		bodyModel[171].addShapeBox(-2F, -0.4F, -2F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F); // Import Box269
		bodyModel[171].setRotationPoint(26F, -11F, -18F);

		bodyModel[172].addShapeBox(-2F, 0.4F, -2F, 1, 1, 2, 0F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F); // Import Box270
		bodyModel[172].setRotationPoint(26F, -11F, -18F);

		bodyModel[173].addShapeBox(-1F, 3F, 12F, 1, 4, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box272
		bodyModel[173].setRotationPoint(-43F, -5F, 0F);
		bodyModel[173].rotateAngleZ = 0.06981317F;

		bodyModel[174].addShapeBox(-1F, 3F, -13F, 1, 4, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box273
		bodyModel[174].setRotationPoint(-43F, -5F, 0F);
		bodyModel[174].rotateAngleZ = 0.06981317F;

		bodyModel[175].addShapeBox(-1F, 2.5F, 11F, 1, 3, 3, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box274
		bodyModel[175].setRotationPoint(-43F, -5F, 0F);
		bodyModel[175].rotateAngleZ = 0.06981317F;

		bodyModel[176].addShapeBox(-1F, 2.5F, 14F, 1, 3, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F); // Import Box275
		bodyModel[176].setRotationPoint(-43F, -5F, 0F);
		bodyModel[176].rotateAngleZ = 0.06981317F;

		bodyModel[177].addShapeBox(-1F, 2.5F, 10F, 1, 3, 1, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box276
		bodyModel[177].setRotationPoint(-43F, -5F, 0F);
		bodyModel[177].rotateAngleZ = 0.06981317F;

		bodyModel[178].addShapeBox(-1F, 2.5F, -14F, 1, 3, 3, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box277
		bodyModel[178].setRotationPoint(-43F, -5F, 0F);
		bodyModel[178].rotateAngleZ = 0.06981317F;

		bodyModel[179].addShapeBox(-1F, 2.5F, -11F, 1, 3, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F); // Import Box278
		bodyModel[179].setRotationPoint(-43F, -5F, 0F);
		bodyModel[179].rotateAngleZ = 0.06981317F;

		bodyModel[180].addShapeBox(-1F, 2.5F, -15F, 1, 3, 1, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box279
		bodyModel[180].setRotationPoint(-43F, -5F, 0F);
		bodyModel[180].rotateAngleZ = 0.06981317F;

		bodyModel[181].addShapeBox(-1F, 6F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box280
		bodyModel[181].setRotationPoint(-43F, -5F, 0F);
		bodyModel[181].rotateAngleZ = 0.06981317F;

		bodyModel[182].addShapeBox(2.5F, 0F, -14F, 5, 13, 28, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -14F, 0.5F, -2F, -14F, 0F, 0F, 0F); // Import Box328
		bodyModel[182].setRotationPoint(26F, -9F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, -9F, 12, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F); // Import Box271
		bodyModel[183].setRotationPoint(-42F, 4F, 0F);

		bodyModel[184].addShapeBox(12F, 0F, -9F, 58, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box272
		bodyModel[184].setRotationPoint(-42F, 4F, 0F);

		bodyModel[185].addShapeBox(12F, 0F, -2F, 58, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box273
		bodyModel[185].setRotationPoint(-42F, 4F, 0F);

		bodyModel[186].addShapeBox(12F, 0F, 5F, 58, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box274
		bodyModel[186].setRotationPoint(-42F, 4F, 0F);

		bodyModel[187].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box275
		bodyModel[187].setRotationPoint(-7F, -13.2F, 16F);
		bodyModel[187].rotateAngleY = 1.06465084F;

		bodyModel[188].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box276
		bodyModel[188].setRotationPoint(-7F, -13.3F, -16F);
		bodyModel[188].rotateAngleY = -1.06465084F;

		bodyModel[189].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box277
		bodyModel[189].setRotationPoint(-16F, -11.4F, -4F);
		bodyModel[189].rotateAngleY = -3.14159265F;

		bodyModel[190].addShapeBox(0F, -0.4F, -2F, 1, 1, 2, 0F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Import Box353
		bodyModel[190].setRotationPoint(26F, -11F, -18F);

		bodyModel[191].addShapeBox(0F, -0.4F, -2F, 1, 1, 2, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, -1.3F, -0.3F, -0.9F, -1.3F, -0.3F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Import Box354
		bodyModel[191].setRotationPoint(26F, -11F, -18F);

		bodyModel[192].addShapeBox(0F, -0.4F, -2F, 1, 1, 2, 0F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.9F, -1.3F, 0F, -0.9F, -1.3F); // Import Box355
		bodyModel[192].setRotationPoint(26F, -11F, -18F);

		bodyModel[193].addShapeBox(0F, -0.4F, 0F, 1, 1, 2, 0F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.9F, -1.3F, 0F, -0.9F, -1.3F); // Import Box356
		bodyModel[193].setRotationPoint(26F, -11F, 18F);

		bodyModel[194].addShapeBox(0F, -0.4F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Import Box357
		bodyModel[194].setRotationPoint(26F, -11F, 18F);

		bodyModel[195].addShapeBox(0F, -0.4F, 0F, 1, 1, 2, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, -1.3F, -0.3F, -0.9F, -1.3F, -0.3F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Import Box358
		bodyModel[195].setRotationPoint(26F, -11F, 18F);

		bodyModel[196].addShapeBox(6F, 0F, -1F, 16, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box363
		bodyModel[196].setRotationPoint(12F, -10F, -20F);
		bodyModel[196].rotateAngleY = 0.14835299F;
		bodyModel[196].rotateAngleZ = -0.13962634F;

		bodyModel[197].addShapeBox(20F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box364
		bodyModel[197].setRotationPoint(12F, -10F, -20F);
		bodyModel[197].rotateAngleY = 0.14835299F;
		bodyModel[197].rotateAngleZ = -0.13962634F;

		bodyModel[198].addShapeBox(9F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box365
		bodyModel[198].setRotationPoint(12F, -10F, -20F);
		bodyModel[198].rotateAngleY = 0.14835299F;
		bodyModel[198].rotateAngleZ = -0.13962634F;

		bodyModel[199].addShapeBox(6F, 0F, -1F, 3, 1, 1, 0F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F); // Import Box366
		bodyModel[199].setRotationPoint(12F, -10F, -20F);
		bodyModel[199].rotateAngleY = 0.14835299F;
		bodyModel[199].rotateAngleZ = -0.13962634F;

		bodyModel[200].addShapeBox(2F, -1F, -1F, 3, 3, 1, 0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import Box367
		bodyModel[200].setRotationPoint(12F, -10F, -20F);
		bodyModel[200].rotateAngleY = 0.14835299F;
		bodyModel[200].rotateAngleZ = -0.13962634F;

		bodyModel[201].addShapeBox(1F, -1F, -1F, 1, 3, 1, 0F, -0.5F, -0.5F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F); // Import Box368
		bodyModel[201].setRotationPoint(12F, -10F, -20F);
		bodyModel[201].rotateAngleY = 0.14835299F;
		bodyModel[201].rotateAngleZ = -0.13962634F;

		bodyModel[202].addShapeBox(4F, 0F, -1F, 2, 1, 1, 0F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.6F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.6F); // Import Box369
		bodyModel[202].setRotationPoint(12F, -10F, -20F);
		bodyModel[202].rotateAngleY = 0.14835299F;
		bodyModel[202].rotateAngleZ = -0.13962634F;

		bodyModel[203].addShapeBox(20F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box370
		bodyModel[203].setRotationPoint(12F, -10F, 20F);
		bodyModel[203].rotateAngleY = -0.14835299F;
		bodyModel[203].rotateAngleZ = -0.13962634F;

		bodyModel[204].addShapeBox(1F, 0F, 0F, 21, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box371
		bodyModel[204].setRotationPoint(12F, -10F, 20F);
		bodyModel[204].rotateAngleY = -0.14835299F;
		bodyModel[204].rotateAngleZ = -0.13962634F;

		bodyModel[205].addShapeBox(9F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box372
		bodyModel[205].setRotationPoint(12F, -10F, 20F);
		bodyModel[205].rotateAngleY = -0.14835299F;
		bodyModel[205].rotateAngleZ = -0.13962634F;

		bodyModel[206].addShapeBox(0.9F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box373
		bodyModel[206].setRotationPoint(12F, -10F, 20F);
		bodyModel[206].rotateAngleY = -0.14835299F;
		bodyModel[206].rotateAngleZ = -0.13962634F;


		turretModel = new ModelRendererTurbo[58];
		turretModel[0] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import Box132
		turretModel[1] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Box133
		turretModel[2] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box140
		turretModel[3] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import Box141
		turretModel[4] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import Box5
		turretModel[5] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import Box149
		turretModel[6] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Import Box150
		turretModel[7] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box151
		turretModel[8] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Import Box154
		turretModel[9] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box155
		turretModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Box148
		turretModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box149
		turretModel[12] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box150
		turretModel[13] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Import Box151
		turretModel[14] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import Box152
		turretModel[15] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box153
		turretModel[16] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import Box154
		turretModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box155
		turretModel[18] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box156
		turretModel[19] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box157
		turretModel[20] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box158
		turretModel[21] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Import Box159
		turretModel[22] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Box160
		turretModel[23] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box161
		turretModel[24] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box162
		turretModel[25] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box165
		turretModel[26] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Import Box271
		turretModel[27] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Import Box303
		turretModel[28] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box304
		turretModel[29] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Import Box305
		turretModel[30] = new ModelRendererTurbo(this, 26, 219, textureX, textureY); // Import Box0
		turretModel[31] = new ModelRendererTurbo(this, 14, 223, textureX, textureY); // Import Box1
		turretModel[32] = new ModelRendererTurbo(this, 20, 219, textureX, textureY); // Import Box2
		turretModel[33] = new ModelRendererTurbo(this, 14, 219, textureX, textureY); // Import Box3
		turretModel[34] = new ModelRendererTurbo(this, 34, 214, textureX, textureY); // Import Box4
		turretModel[35] = new ModelRendererTurbo(this, 46, 220, textureX, textureY); // Import Box5
		turretModel[36] = new ModelRendererTurbo(this, 46, 214, textureX, textureY); // Import Box6
		turretModel[37] = new ModelRendererTurbo(this, 46, 217, textureX, textureY); // Import Box7
		turretModel[38] = new ModelRendererTurbo(this, 17, 211, textureX, textureY); // Import Box74
		turretModel[39] = new ModelRendererTurbo(this, 3, 211, textureX, textureY); // Import Box75
		turretModel[40] = new ModelRendererTurbo(this, 38, 219, textureX, textureY); // Import Box78
		turretModel[41] = new ModelRendererTurbo(this, 32, 219, textureX, textureY); // Import Box79
		turretModel[42] = new ModelRendererTurbo(this, 32, 211, textureX, textureY); // Import Box80
		turretModel[43] = new ModelRendererTurbo(this, 43, 166, textureX, textureY); // Import Box374
		turretModel[44] = new ModelRendererTurbo(this, 62, 164, textureX, textureY); // Import Box375
		turretModel[45] = new ModelRendererTurbo(this, 43, 180, textureX, textureY); // Import Box376
		turretModel[46] = new ModelRendererTurbo(this, 4, 175, textureX, textureY); // Import Box377
		turretModel[47] = new ModelRendererTurbo(this, 0, 188, textureX, textureY); // Import Box378
		turretModel[48] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Import Box379
		turretModel[49] = new ModelRendererTurbo(this, 1, 164, textureX, textureY); // Import Box380
		turretModel[50] = new ModelRendererTurbo(this, 66, 153, textureX, textureY); // Import Box381
		turretModel[51] = new ModelRendererTurbo(this, 66, 158, textureX, textureY); // Import Box382
		turretModel[52] = new ModelRendererTurbo(this, 16, 183, textureX, textureY); // Import Box386
		turretModel[53] = new ModelRendererTurbo(this, 16, 192, textureX, textureY); // Import Box387
		turretModel[54] = new ModelRendererTurbo(this, 16, 189, textureX, textureY); // Import Box388
		turretModel[55] = new ModelRendererTurbo(this, 16, 183, textureX, textureY); // Import Box389
		turretModel[56] = new ModelRendererTurbo(this, 16, 192, textureX, textureY); // Import Box390
		turretModel[57] = new ModelRendererTurbo(this, 16, 189, textureX, textureY); // Import Box391

		turretModel[0].addShapeBox(5F, -4F, -2F, 6, 4, 5, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Import Box132
		turretModel[0].setRotationPoint(6F, -14F, 0F);

		turretModel[1].addShapeBox(8.5F, -4F, -2F, 1, 4, 5, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box133
		turretModel[1].setRotationPoint(8F, -14F, 0F);

		turretModel[2].addShapeBox(7F, -4F, -3.5F, 2, 4, 2, 0F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, 0.5F, 0F, 0F, 0.5F); // Import Box140
		turretModel[2].setRotationPoint(8F, -14F, 0F);

		turretModel[3].addShapeBox(7F, -4F, -3.5F, 4, 4, 2, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box141
		turretModel[3].setRotationPoint(4F, -14F, 0F);

		turretModel[4].addShapeBox(4F, -5F, -1F, 6, 1, 4, 0F, 0F, -0.8F, -0.1F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Import Box5
		turretModel[4].setRotationPoint(6F, -14F, 0F);

		turretModel[5].addShapeBox(-3F, -4F, -12F, 6, 5, 24, 0F, -1F, 0F, -5F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		turretModel[5].setRotationPoint(6F, -14F, 0F);

		turretModel[6].addShapeBox(3F, -4F, -12F, 4, 5, 24, 0F, 1F, 0F, -6F, -2F, 0F, -9F, -2F, 0F, -9F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box150
		turretModel[6].setRotationPoint(6F, -14F, 0F);

		turretModel[7].addShapeBox(7F, -4F, -10F, 4, 5, 20, 0F, 2F, 0F, -7F, -5.9F, 0F, -7F, -5.9F, 0F, -7F, 2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box151
		turretModel[7].setRotationPoint(6F, -14F, 0F);

		turretModel[8].addShapeBox(-7F, -4F, -12F, 4, 5, 24, 0F, -1F, 0F, -6F, 1F, 0F, -5F, 1F, 0F, -5F, -1F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box154
		turretModel[8].setRotationPoint(6F, -14F, 0F);

		turretModel[9].addShapeBox(-11F, -4F, -10F, 4, 5, 20, 0F, -3F, 0F, -7F, 1F, 0F, -4F, 1F, 0F, -4F, -3F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box155
		turretModel[9].setRotationPoint(6F, -14F, 0F);

		turretModel[10].addShapeBox(2F, -5F, 3F, 1, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box148
		turretModel[10].setRotationPoint(6F, -14F, 0F);

		turretModel[11].addShapeBox(2F, -5.5F, 3F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box149
		turretModel[11].setRotationPoint(6F, -14F, 0F);

		turretModel[12].addShapeBox(3F, -5.5F, 3F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F); // Import Box150
		turretModel[12].setRotationPoint(6F, -14F, 0F);

		turretModel[13].addShapeBox(-0.5F, -4.2F, -2F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Import Box151
		turretModel[13].setRotationPoint(6F, -14F, 0F);

		turretModel[14].addShapeBox(-4.5F, -4.2F, -2F, 4, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box152
		turretModel[14].setRotationPoint(6F, -14F, 0F);

		turretModel[15].addShapeBox(-6.5F, -4.2F, -2F, 1, 1, 7, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1.5F); // Import Box153
		turretModel[15].setRotationPoint(6F, -14F, 0F);

		turretModel[16].addShapeBox(0F, -4.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box154
		turretModel[16].setRotationPoint(6F, -14F, 0F);

		turretModel[17].addShapeBox(0F, -4.5F, 3F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box155
		turretModel[17].setRotationPoint(6F, -14F, 0F);

		turretModel[18].addShapeBox(-4F, -5F, 6F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box156
		turretModel[18].setRotationPoint(6F, -14F, 0F);

		turretModel[19].addShapeBox(-1F, -1F, -1F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		turretModel[19].setRotationPoint(2F, -18F, -2.5F);
		turretModel[19].rotateAngleY = -0.26179939F;

		turretModel[20].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box158
		turretModel[20].setRotationPoint(8F, -18F, 1.5F);
		turretModel[20].rotateAngleY = -0.17453293F;

		turretModel[21].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box159
		turretModel[21].setRotationPoint(6.5F, -18F, 5.9F);
		turretModel[21].rotateAngleY = 0.90757121F;

		turretModel[22].addShapeBox(1F, -4.5F, -5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Import Box160
		turretModel[22].setRotationPoint(6F, -14F, 0F);

		turretModel[23].addShapeBox(1F, -5.5F, -5F, 1, 1, 1, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box161
		turretModel[23].setRotationPoint(6F, -14F, 0F);

		turretModel[24].addShapeBox(1.5F, -6.2F, -5.5F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box162
		turretModel[24].setRotationPoint(6F, -14F, 0F);

		turretModel[25].addShapeBox(1.5F, -5.8F, -5.5F, 1, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Import Box165
		turretModel[25].setRotationPoint(6F, -14F, 0F);

		turretModel[26].addShapeBox(1.5F, -6.6F, -5.5F, 1, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box271
		turretModel[26].setRotationPoint(6F, -14F, 0F);

		turretModel[27].addShapeBox(0.5F, -6.6F, -5.5F, 1, 1, 2, 0F, -0.7F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.2F, -0.7F, -0.7F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.4F, -0.2F); // Import Box303
		turretModel[27].setRotationPoint(6F, -14F, 0F);

		turretModel[28].addShapeBox(0.5F, -5.8F, -5.5F, 1, 1, 2, 0F, -0.7F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.4F, -0.2F, -0.7F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.2F, -0.7F); // Import Box304
		turretModel[28].setRotationPoint(6F, -14F, 0F);

		turretModel[29].addShapeBox(0.5F, -6.2F, -5.5F, 1, 1, 2, 0F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F, -0.2F); // Import Box305
		turretModel[29].setRotationPoint(6F, -14F, 0F);

		turretModel[30].addShapeBox(-5F, -6F, -6F, 1, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		turretModel[30].setRotationPoint(6F, -14F, 0F);

		turretModel[31].addShapeBox(-5F, -8F, -6F, 5, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		turretModel[31].setRotationPoint(6F, -14F, 0F);

		turretModel[32].addShapeBox(-5.5F, -8F, -6F, 1, 2, 1, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F); // Import Box2
		turretModel[32].setRotationPoint(6F, -14F, 0F);

		turretModel[33].addShapeBox(-1F, -8F, -6F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F); // Import Box3
		turretModel[33].setRotationPoint(6F, -14F, 0F);

		turretModel[34].addShapeBox(-4F, -8F, -6F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box4
		turretModel[34].setRotationPoint(6F, -14F, 0F);

		turretModel[35].addShapeBox(-5F, -8.5F, -6F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		turretModel[35].setRotationPoint(6F, -14F, 0F);

		turretModel[36].addShapeBox(-5F, -5.5F, -6F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box6
		turretModel[36].setRotationPoint(6F, -14F, 0F);

		turretModel[37].addShapeBox(-5F, -9F, -6F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box7
		turretModel[37].setRotationPoint(6F, -14F, 0F);

		turretModel[38].addShapeBox(-5F, -7.9F, -6F, 5, 1, 1, 0F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F); // Import Box74
		turretModel[38].setRotationPoint(6F, -14F, 0F);

		turretModel[39].addShapeBox(-5F, -6.9F, -6F, 5, 1, 1, 0F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F); // Import Box75
		turretModel[39].setRotationPoint(6F, -14F, 0F);

		turretModel[40].addShapeBox(-6.5F, -7.5F, -6F, 1, 1, 1, 0F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F); // Import Box78
		turretModel[40].setRotationPoint(6F, -14F, 0F);

		turretModel[41].addShapeBox(-5.2F, -7F, -5F, 1, 1, 1, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F); // Import Box79
		turretModel[41].setRotationPoint(6F, -14F, 0F);

		turretModel[42].addShapeBox(-6.75F, -7.5F, -6F, 1, 1, 1, 0F, -0.75F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.1F, -0.75F, -0.7F, -0.1F, -0.75F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F); // Import Box80
		turretModel[42].setRotationPoint(6F, -14F, 0F);

		turretModel[43].addShapeBox(-4F, 0F, -4.5F, 4, 4, 9, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, 0.1F); // Import Box374
		turretModel[43].setRotationPoint(-2F, -18F, 0F);

		turretModel[44].addShapeBox(-4F, 0F, 2.5F, 6, 4, 5, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F); // Import Box375
		turretModel[44].setRotationPoint(-2F, -18F, 0F);

		turretModel[45].addShapeBox(-4F, 0F, -7.5F, 6, 4, 5, 0F, -4F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.1F, 0F, 0F, -2.1F); // Import Box376
		turretModel[45].setRotationPoint(-2F, -18F, 0F);

		turretModel[46].addShapeBox(-2F, -1F, -3F, 2, 1, 6, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box377
		turretModel[46].setRotationPoint(-2F, -18F, 0F);

		turretModel[47].addShapeBox(-2F, -1F, 3F, 4, 1, 3, 0F, -0.5F, -0.5F, 0.2F, -2.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -2.5F, -0.5F, -0.3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box378
		turretModel[47].setRotationPoint(-2F, -18F, 0F);

		turretModel[48].addShapeBox(-2F, -1F, -6F, 4, 1, 3, 0F, -2.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -2.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box379
		turretModel[48].setRotationPoint(-2F, -18F, 0F);

		turretModel[49].addShapeBox(-4F, 4F, -4.5F, 2, 1, 9, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F); // Import Box380
		turretModel[49].setRotationPoint(-2F, -18F, 0F);

		turretModel[50].addShapeBox(-4F, 4F, 4.5F, 4, 1, 3, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -0.5F, -0.5F, -0.2F, -2.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -2.5F, -0.5F, -0.2F); // Import Box381
		turretModel[50].setRotationPoint(-2F, -18F, 0F);

		turretModel[51].addShapeBox(-4F, 4F, -7.5F, 4, 1, 3, 0F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, -2.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -2.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Import Box382
		turretModel[51].setRotationPoint(-2F, -18F, 0F);

		turretModel[52].addShapeBox(-4F, 0F, -3F, 4, 4, 1, 0F, -1.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.9F, 0F, -0.3F, 0.1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Import Box386
		turretModel[52].setRotationPoint(-2F, -18F, 0F);

		turretModel[53].addShapeBox(-2F, -1F, -3F, 2, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Import Box387
		turretModel[53].setRotationPoint(-2F, -18F, 0F);

		turretModel[54].addShapeBox(-4F, 4F, -3F, 2, 1, 1, 0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F); // Import Box388
		turretModel[54].setRotationPoint(-2F, -18F, 0F);

		turretModel[55].addShapeBox(-4F, 0F, 2F, 4, 4, 1, 0F, -1.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.9F, 0F, -0.3F, 0.1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Import Box389
		turretModel[55].setRotationPoint(-2F, -18F, 0F);

		turretModel[56].addShapeBox(-2F, -1F, 2F, 2, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Import Box390
		turretModel[56].setRotationPoint(-2F, -18F, 0F);

		turretModel[57].addShapeBox(-4F, 4F, 2F, 2, 1, 1, 0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F); // Import Box391
		turretModel[57].setRotationPoint(-2F, -18F, 0F);



		barrelModel = new ModelRendererTurbo[73];
		barrelModel[0] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import ImportBox134
		barrelModel[1] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import ImportBox135
		barrelModel[2] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import ImportBox136
		barrelModel[3] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import ImportBox137
		barrelModel[4] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import ImportBox139
		barrelModel[5] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import ImportBox142
		barrelModel[6] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import ImportBox0
		barrelModel[7] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import ImportBox1
		barrelModel[8] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import ImportBox2
		barrelModel[9] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import ImportBox3
		barrelModel[10] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import ImportBox148
		barrelModel[11] = new ModelRendererTurbo(this, 14, 214, textureX, textureY); // Import ImportBox8
		barrelModel[12] = new ModelRendererTurbo(this, 3, 234, textureX, textureY); // Import ImportBox10
		barrelModel[13] = new ModelRendererTurbo(this, 3, 231, textureX, textureY); // Import ImportBox11
		barrelModel[14] = new ModelRendererTurbo(this, 3, 228, textureX, textureY); // Import ImportBox12
		barrelModel[15] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox20
		barrelModel[16] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Import ImportBox21
		barrelModel[17] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox32
		barrelModel[18] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Import ImportBox36
		barrelModel[19] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox37
		barrelModel[20] = new ModelRendererTurbo(this, 9, 243, textureX, textureY); // Import ImportBox40
		barrelModel[21] = new ModelRendererTurbo(this, 9, 240, textureX, textureY); // Import ImportBox41
		barrelModel[22] = new ModelRendererTurbo(this, 9, 237, textureX, textureY); // Import ImportBox42
		barrelModel[23] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Import ImportBox43
		barrelModel[24] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox46
		barrelModel[25] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox47
		barrelModel[26] = new ModelRendererTurbo(this, 3, 240, textureX, textureY); // Import ImportBox51
		barrelModel[27] = new ModelRendererTurbo(this, 3, 243, textureX, textureY); // Import ImportBox52
		barrelModel[28] = new ModelRendererTurbo(this, 3, 237, textureX, textureY); // Import ImportBox53
		barrelModel[29] = new ModelRendererTurbo(this, 49, 223, textureX, textureY); // Import ImportBox54
		barrelModel[30] = new ModelRendererTurbo(this, 41, 235, textureX, textureY); // Import ImportBox55
		barrelModel[31] = new ModelRendererTurbo(this, 41, 232, textureX, textureY); // Import ImportBox56
		barrelModel[32] = new ModelRendererTurbo(this, 41, 229, textureX, textureY); // Import ImportBox57
		barrelModel[33] = new ModelRendererTurbo(this, 41, 226, textureX, textureY); // Import ImportBox58
		barrelModel[34] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Import ImportBox59
		barrelModel[35] = new ModelRendererTurbo(this, 35, 235, textureX, textureY); // Import ImportBox60
		barrelModel[36] = new ModelRendererTurbo(this, 35, 232, textureX, textureY); // Import ImportBox61
		barrelModel[37] = new ModelRendererTurbo(this, 35, 229, textureX, textureY); // Import ImportBox62
		barrelModel[38] = new ModelRendererTurbo(this, 35, 226, textureX, textureY); // Import ImportBox63
		barrelModel[39] = new ModelRendererTurbo(this, 35, 223, textureX, textureY); // Import ImportBox64
		barrelModel[40] = new ModelRendererTurbo(this, 29, 235, textureX, textureY); // Import ImportBox65
		barrelModel[41] = new ModelRendererTurbo(this, 29, 232, textureX, textureY); // Import ImportBox67
		barrelModel[42] = new ModelRendererTurbo(this, 29, 229, textureX, textureY); // Import ImportBox68
		barrelModel[43] = new ModelRendererTurbo(this, 29, 226, textureX, textureY); // Import ImportBox69
		barrelModel[44] = new ModelRendererTurbo(this, 29, 223, textureX, textureY); // Import ImportBox70
		barrelModel[45] = new ModelRendererTurbo(this, 14, 240, textureX, textureY); // Import ImportBox71
		barrelModel[46] = new ModelRendererTurbo(this, 19, 237, textureX, textureY); // Import ImportBox72
		barrelModel[47] = new ModelRendererTurbo(this, 14, 237, textureX, textureY); // Import ImportBox73
		barrelModel[48] = new ModelRendererTurbo(this, 49, 229, textureX, textureY); // Import ImportBox76
		barrelModel[49] = new ModelRendererTurbo(this, 49, 226, textureX, textureY); // Import ImportBox77
		barrelModel[50] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox81
		barrelModel[51] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox82
		barrelModel[52] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Import ImportBox83
		barrelModel[53] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox84
		barrelModel[54] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox85
		barrelModel[55] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox86
		barrelModel[56] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox87
		barrelModel[57] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Import ImportBox88
		barrelModel[58] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox89
		barrelModel[59] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox90
		barrelModel[60] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Import ImportBox91
		barrelModel[61] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox92
		barrelModel[62] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox93
		barrelModel[63] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Import ImportBox94
		barrelModel[64] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Import ImportBox95
		barrelModel[65] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox96
		barrelModel[66] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox97
		barrelModel[67] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox98
		barrelModel[68] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Import ImportBox99
		barrelModel[69] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Import ImportBox100
		barrelModel[70] = new ModelRendererTurbo(this, 91, 31, textureX, textureY); // Import ImportBox359
		barrelModel[71] = new ModelRendererTurbo(this, 86, 31, textureX, textureY); // Import ImportBox360
		barrelModel[72] = new ModelRendererTurbo(this, 81, 31, textureX, textureY); // Import ImportBox361

		barrelModel[0].addShapeBox(1.25F, -2F, -1F, 2, 4, 2, 0F, 0F, 0.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.2F, 0F); // Import ImportBox134
		barrelModel[0].setRotationPoint(16F, -16F, 0F);

		barrelModel[1].addShapeBox(0.25F, -2F, -1.5F, 1, 4, 4, 0F, -0.25F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.25F, -0.25F, 0.2F, 0.25F, -0.25F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.25F, -0.25F, 0.2F, 0.25F); // Import ImportBox135
		barrelModel[1].setRotationPoint(16F, -16F, 0F);

		barrelModel[2].addShapeBox(1.25F, -1F, -2.5F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0.5F, -0.7F, -0.2F, 0.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0.5F, -0.7F, -0.2F, 0.5F, -0.7F, 0F, 0F, 0.5F, 0F); // Import ImportBox136
		barrelModel[2].setRotationPoint(16F, -16F, 0F);

		barrelModel[3].addShapeBox(1F, -1F, -1F, 9, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import ImportBox137
		barrelModel[3].setRotationPoint(16F, -16F, 0F);

		barrelModel[4].addShapeBox(0F, -0.5F, -2.4F, 5, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox139
		barrelModel[4].setRotationPoint(16F, -16F, 0F);

		barrelModel[5].addShapeBox(0.75F, -2F, -3F, 1, 4, 1, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F); // Import ImportBox142
		barrelModel[5].setRotationPoint(16F, -16F, 0F);

		barrelModel[6].addShapeBox(1.25F, -2F, 1F, 2, 4, 2, 0F, 0F, 0.2F, -0.5F, 0.5F, -1.9F, -0.5F, 0.5F, -1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0.5F, -1.9F, -0.5F, 0.5F, -1.9F, -0.25F, 0F, 0.2F, -0.25F); // Import ImportBox0
		barrelModel[6].setRotationPoint(16F, -16F, 0F);

		barrelModel[7].addShapeBox(1.25F, -2F, -2.5F, 2, 4, 1, 0F, 0F, -0.5F, -1F, 0.5F, -1.7F, -1F, 0.5F, -1F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.5F, -1F, 0.5F, -1.7F, -1F, 0.5F, -1F, 0.5F, 0F, 0.2F, 0.5F); // Import ImportBox1
		barrelModel[7].setRotationPoint(16F, -16F, 0F);

		barrelModel[8].addShapeBox(1.25F, -2F, 1.5F, 2, 4, 1, 0F, 0F, 0.2F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1.9F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1.9F, -1F, 0F, 0.2F, -1F); // Import ImportBox2
		barrelModel[8].setRotationPoint(16F, -16F, 0F);

		barrelModel[9].addShapeBox(10F, -1F, -1F, 1, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.1F); // Import ImportBox3
		barrelModel[9].setRotationPoint(16F, -16F, 0F);

		barrelModel[10].addShapeBox(0.75F, -2F, -2.5F, 1, 4, 1, 0F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.2F, 0.5F, 0.25F, 0.2F, 0.5F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.2F, 0.5F, 0.25F, 0.2F, 0.5F); // Import ImportBox148
		barrelModel[10].setRotationPoint(16F, -16F, 0F);

		barrelModel[11].addShapeBox(-4F, -1F, -0.5F, 8, 1, 1, 0F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F); // Import ImportBox8
		barrelModel[11].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[12].addShapeBox(-6F, -1.9F, -0.5F, 13, 1, 1, 0F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F); // Import ImportBox10
		barrelModel[12].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[13].addShapeBox(-6F, -2.5F, -0.5F, 13, 1, 1, 0F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F); // Import ImportBox11
		barrelModel[13].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[14].addShapeBox(-6F, -1.3F, -0.5F, 13, 1, 1, 0F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F); // Import ImportBox12
		barrelModel[14].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[15].addShapeBox(2F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Import ImportBox20
		barrelModel[15].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[16].addShapeBox(2F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox21
		barrelModel[16].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[17].addShapeBox(-7F, -2.55F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Import ImportBox32
		barrelModel[17].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[18].addShapeBox(-7F, -1.9F, -0.65F, 1, 1, 1, 0F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Import ImportBox36
		barrelModel[18].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[19].addShapeBox(-7F, -2.55F, -0.55F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.15F, 0.4F, -0.5F, -0.15F, 0.4F, -0.5F, -0.15F, -1.3F, 0F, -0.15F, -1.3F); // Import ImportBox37
		barrelModel[19].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[20].addShapeBox(-7F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F); // Import ImportBox40
		barrelModel[20].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[21].addShapeBox(-7F, -2.4F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F); // Import ImportBox41
		barrelModel[21].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[22].addShapeBox(-7F, -1.4F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Import ImportBox42
		barrelModel[22].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[23].addShapeBox(7F, -1.9F, -0.6F, 1, 1, 1, 0F, 0F, -0.2F, 0.3F, -0.25F, -0.2F, 0.3F, -0.25F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, -0.25F, -0.2F, 0.3F, -0.25F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Import ImportBox43
		barrelModel[23].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[24].addShapeBox(7F, -2.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Import ImportBox46
		barrelModel[24].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[25].addShapeBox(7F, -2.5F, -0.55F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -1.25F, 0F, -0.2F, -1.25F); // Import ImportBox47
		barrelModel[25].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[26].addShapeBox(7.65F, -1.3F, 0.7F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Import ImportBox51
		barrelModel[26].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[27].addShapeBox(7.65F, -0.7F, 0.7F, 1, 1, 1, 0F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Import ImportBox52
		barrelModel[27].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[28].addShapeBox(7.65F, -0.1F, 0.7F, 1, 1, 1, 0F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import ImportBox53
		barrelModel[28].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[29].addShapeBox(-0.5F, -1F, 0.4F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox54
		barrelModel[29].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[30].addShapeBox(-0.5F, -2F, 0.9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F); // Import ImportBox55
		barrelModel[30].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[31].addShapeBox(-0.5F, -3F, 0.65F, 2, 1, 1, 0F, 0F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox56
		barrelModel[31].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[32].addShapeBox(-0.5F, -3.5F, 0.65F, 2, 1, 1, 0F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, 0F, 0.2F, -0.15F); // Import ImportBox57
		barrelModel[32].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[33].addShapeBox(-1F, -3F, 0.65F, 1, 1, 1, 0F, 0F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox58
		barrelModel[33].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[34].addShapeBox(-1F, -3.5F, 0.65F, 1, 1, 1, 0F, 0.15F, -0.1F, -0.15F, -0.5F, -0.1F, -0.15F, -0.5F, -0.1F, -0.15F, 0.15F, -0.1F, -0.15F, 0F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, 0F, 0.2F, -0.15F); // Import ImportBox59
		barrelModel[34].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[35].addShapeBox(1F, -3.55F, 0.65F, 1, 1, 1, 0F, 0F, -0.02F, -0.15F, -0.5F, -0.02F, -0.15F, -0.5F, -0.02F, -0.15F, 0F, -0.02F, -0.15F, 0F, -0.9F, -0.125F, -0.5F, -0.9F, -0.125F, -0.5F, -0.9F, -0.125F, 0F, -0.9F, -0.125F); // Import ImportBox60
		barrelModel[35].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[36].addShapeBox(1F, -3.55F, 0.65F, 1, 1, 1, 0F, 0F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, 0.25F, -0.8F, -0.5F, 0.25F, -0.8F, -0.5F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Import ImportBox61
		barrelModel[36].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[37].addShapeBox(1F, -3.55F, 0.65F, 1, 1, 1, 0F, 0F, -0.1F, -0.125F, -0.5F, -0.1F, -0.125F, -0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F, 0.25F, -0.8F, 0F, 0.25F, -0.8F); // Import ImportBox62
		barrelModel[37].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[38].addShapeBox(1F, -2.8F, 0.65F, 1, 1, 1, 0F, 0F, -0.02F, -0.2F, -0.6F, -0.02F, -0.2F, -0.6F, -0.02F, -0.2F, 0F, -0.02F, -0.2F, 0F, -0.9F, -0.2F, -0.6F, -0.9F, -0.2F, -0.6F, -0.9F, -0.2F, 0F, -0.9F, -0.2F); // Import ImportBox63
		barrelModel[38].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[39].addShapeBox(1F, -2.95F, 0.65F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.65F, -0.9F, -0.3F, -0.65F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.02F, -0.25F, -0.7F, -0.02F, -0.25F, -0.7F, -0.02F, -0.25F, 0F, -0.02F, -0.25F); // Import ImportBox64
		barrelModel[39].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[40].addShapeBox(1F, -2.3F, 0.65F, 1, 1, 1, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.67F, -0.25F, -0.7F, -0.67F, -0.25F, -0.65F, -0.75F, -0.7F, 0F, -0.75F, -0.7F); // Import ImportBox65
		barrelModel[40].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[41].addShapeBox(1F, -2.3F, 0.65F, 1, 1, 1, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.75F, -0.7F, -0.65F, -0.75F, -0.7F, -0.7F, -0.67F, -0.25F, 0F, -0.67F, -0.25F); // Import ImportBox67
		barrelModel[41].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[42].addShapeBox(-0.4F, -0.5F, 0.65F, 1, 1, 1, 0F, -0.26F, 0F, -0.26F, -0.26F, 0F, -0.26F, -0.26F, 0F, -0.26F, -0.26F, 0F, -0.26F, -0.26F, 0.5F, -0.26F, -0.26F, 0.5F, -0.26F, -0.26F, 0.5F, -0.26F, -0.26F, 0.5F, -0.26F); // Import ImportBox68
		barrelModel[42].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[43].addShapeBox(-0.4F, 1F, 0.65F, 1, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Import ImportBox69
		barrelModel[43].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[44].addShapeBox(-1F, -3.5F, 0.65F, 1, 1, 1, 0F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0.15F, -0.9F, -0.15F, -0.5F, -0.9F, -0.15F, -0.5F, -0.9F, -0.15F, 0.15F, -0.9F, -0.15F); // Import ImportBox70
		barrelModel[44].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[45].addShapeBox(-4F, -1.3F, -0.5F, 8, 1, 1, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import ImportBox71
		barrelModel[45].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[46].addShapeBox(-4F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import ImportBox72
		barrelModel[46].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[47].addShapeBox(-5F, -1F, -0.5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import ImportBox73
		barrelModel[47].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[48].addShapeBox(-0.4F, -0.5F, 0.65F, 1, 1, 1, 0F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F); // Import ImportBox76
		barrelModel[48].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[49].addShapeBox(-0.4F, 0.1F, 0.65F, 1, 1, 1, 0F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F); // Import ImportBox77
		barrelModel[49].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[50].addShapeBox(7F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import ImportBox81
		barrelModel[50].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[51].addShapeBox(7F, -1.3F, -0.55F, 1, 1, 1, 0F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -1.25F, 0F, -0.2F, -1.25F, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // Import ImportBox82
		barrelModel[51].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[52].addShapeBox(7F, -1.9F, -0.4F, 1, 1, 1, 0F, 0F, -0.2F, -1.2F, -0.25F, -0.2F, -1.2F, -0.25F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -1.2F, -0.25F, -0.2F, -1.2F, -0.25F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Import ImportBox83
		barrelModel[52].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[53].addShapeBox(7F, -2.5F, -0.45F, 1, 1, 1, 0F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -1.25F, -0.25F, -0.2F, -1.25F, -0.25F, -0.2F, 0.35F, 0F, -0.2F, 0.35F); // Import ImportBox84
		barrelModel[53].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[54].addShapeBox(7F, -1.3F, -0.45F, 1, 1, 1, 0F, 0F, -0.2F, -1.25F, -0.25F, -0.2F, -1.25F, -0.25F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Import ImportBox85
		barrelModel[54].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[55].addShapeBox(2F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox86
		barrelModel[55].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[56].addShapeBox(3F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Import ImportBox87
		barrelModel[56].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[57].addShapeBox(3F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox88
		barrelModel[57].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[58].addShapeBox(3F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox89
		barrelModel[58].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[59].addShapeBox(-2F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Import ImportBox90
		barrelModel[59].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[60].addShapeBox(-2F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox91
		barrelModel[60].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[61].addShapeBox(-2F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox92
		barrelModel[61].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[62].addShapeBox(-3F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Import ImportBox93
		barrelModel[62].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[63].addShapeBox(-3F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox94
		barrelModel[63].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[64].addShapeBox(-3F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Import ImportBox95
		barrelModel[64].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[65].addShapeBox(-7F, -1.25F, -0.5F, 1, 1, 1, 0F, 0F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import ImportBox96
		barrelModel[65].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[66].addShapeBox(-7F, -1.25F, -0.55F, 1, 1, 1, 0F, 0F, -0.15F, 0.4F, -0.5F, -0.15F, 0.4F, -0.5F, -0.15F, -1.3F, 0F, -0.15F, -1.3F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // Import ImportBox97
		barrelModel[66].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[67].addShapeBox(-7F, -2.55F, -0.45F, 1, 1, 1, 0F, 0F, -0.3F, -0.75F, -0.5F, -0.3F, -0.75F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.15F, -1.3F, -0.5F, -0.15F, -1.3F, -0.5F, -0.15F, 0.4F, 0F, -0.15F, 0.4F); // Import ImportBox98
		barrelModel[67].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[68].addShapeBox(-7F, -1.9F, 1.15F, 1, 1, 1, 0F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Import ImportBox99
		barrelModel[68].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[69].addShapeBox(-7F, -1.25F, -0.45F, 1, 1, 1, 0F, 0F, -0.15F, -1.3F, -0.5F, -0.15F, -1.3F, -0.5F, -0.15F, 0.4F, 0F, -0.15F, 0.4F, 0F, -0.3F, -0.75F, -0.5F, -0.3F, -0.75F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Import ImportBox100
		barrelModel[69].setRotationPoint(1.5F, -22.5F, -5.5F);

		barrelModel[70].addShapeBox(2.6F, -2F, -1F, 1, 1, 1, 0F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox359
		barrelModel[70].setRotationPoint(16F, -16F, 0F);

		barrelModel[71].addShapeBox(2.6F, -2F, 0F, 1, 1, 1, 0F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Import ImportBox360
		barrelModel[71].setRotationPoint(16F, -16F, 0F);

		barrelModel[72].addShapeBox(2.6F, -2F, -0.5F, 1, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		barrelModel[72].setRotationPoint(16F, -16F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[11];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape64
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape65
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape66
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape67
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape68
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Import Shape69
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Import Shape70
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape73
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape74
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape75
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape76

		leftTrackWheelModels[0].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape64
		leftTrackWheelModels[0].setRotationPoint(17F, 5.5F, 19F);

		leftTrackWheelModels[1].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape65
		leftTrackWheelModels[1].setRotationPoint(6F, 5.5F, 19F);

		leftTrackWheelModels[2].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape66
		leftTrackWheelModels[2].setRotationPoint(-5F, 5.5F, 19F);

		leftTrackWheelModels[3].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape67
		leftTrackWheelModels[3].setRotationPoint(-16F, 5.5F, 19F);

		leftTrackWheelModels[4].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape68
		leftTrackWheelModels[4].setRotationPoint(-28F, 5.5F, 19F);

		leftTrackWheelModels[5].addShape3D(3F, -3F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape69
		leftTrackWheelModels[5].setRotationPoint(-39F, 0.5F, 19F);

		leftTrackWheelModels[6].addShape3D(3F, -3F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape70
		leftTrackWheelModels[6].setRotationPoint(28F, 0.5F, 19F);

		leftTrackWheelModels[7].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape73
		leftTrackWheelModels[7].setRotationPoint(10.5F, -2.5F, 19F);

		leftTrackWheelModels[8].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape74
		leftTrackWheelModels[8].setRotationPoint(0.5F, -2.5F, 19F);

		leftTrackWheelModels[9].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape75
		leftTrackWheelModels[9].setRotationPoint(-11.5F, -2.5F, 19F);

		leftTrackWheelModels[10].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape76
		leftTrackWheelModels[10].setRotationPoint(-22.5F, -2F, 19F);


		rightTrackWheelModels = new ModelRendererTurbo[11];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape64
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape65
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape66
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape67
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Import Shape68
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Import Shape69
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Import Shape70
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape73
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape74
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape75
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Import Shape76

		rightTrackWheelModels[0].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape64
		rightTrackWheelModels[0].setRotationPoint(17F, 5.5F, -19F);

		rightTrackWheelModels[1].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape65
		rightTrackWheelModels[1].setRotationPoint(6F, 5.5F, -19F);

		rightTrackWheelModels[2].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape66
		rightTrackWheelModels[2].setRotationPoint(-5F, 5.5F, -19F);

		rightTrackWheelModels[3].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape67
		rightTrackWheelModels[3].setRotationPoint(-16F, 5.5F, -19F);

		rightTrackWheelModels[4].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Import Shape68
		rightTrackWheelModels[4].setRotationPoint(-28F, 5.5F, -19F);

		rightTrackWheelModels[5].addShape3D(3F, -3F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape69
		rightTrackWheelModels[5].setRotationPoint(-39F, 0.5F, -19F);

		rightTrackWheelModels[6].addShape3D(3F, -3F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape70
		rightTrackWheelModels[6].setRotationPoint(28F, 0.5F, -19F);

		rightTrackWheelModels[7].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape73
		rightTrackWheelModels[7].setRotationPoint(10.5F, -2.5F, -19F);

		rightTrackWheelModels[8].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape74
		rightTrackWheelModels[8].setRotationPoint(0.5F, -2.5F, -19F);

		rightTrackWheelModels[9].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape75
		rightTrackWheelModels[9].setRotationPoint(-11.5F, -2.5F, -19F);

		rightTrackWheelModels[10].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Import Shape76
		rightTrackWheelModels[10].setRotationPoint(-22.5F, -2F, -19F);

		
		leftAnimTrackModel = new ModelRendererTurbo[3][];
		rightAnimTrackModel = new ModelRendererTurbo[3][];

		leftAnimTrackModel[0] = new ModelRendererTurbo[12];
		leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 0, 273, textureX, textureY); // Import Box77
		leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 0, 342, textureX, textureY); // Import Box78
		leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 0, 248, textureX, textureY); // Import Box79
		leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Import Box80
		leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import Box81
		leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 0, 296, textureX, textureY); // Import Box82
		leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Import Box83
		leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 0, 304, textureX, textureY); // Import Box84
		leftAnimTrackModel[0][8] = new ModelRendererTurbo(this, 0, 281, textureX, textureY); // Import Box85
		leftAnimTrackModel[0][9] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Import Box86
		leftAnimTrackModel[0][10] = new ModelRendererTurbo(this, 0, 321, textureX, textureY); // Import Box87
		leftAnimTrackModel[0][11] = new ModelRendererTurbo(this, 0, 312, textureX, textureY); // Import Box88

		leftAnimTrackModel[0][0].addBox(0F, 0F, 0F, 49, 1, 4, 0F); // Import Box77
		leftAnimTrackModel[0][0].setRotationPoint(-30F, 9F, 16F);

		leftAnimTrackModel[0][1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		leftAnimTrackModel[0][1].setRotationPoint(29F, -3F, 16F);
		leftAnimTrackModel[0][1].rotateAngleZ = -0.78539816F;

		leftAnimTrackModel[0][2].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Box79
		leftAnimTrackModel[0][2].setRotationPoint(31.5F, -0.5F, 16F);
		leftAnimTrackModel[0][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[0][3].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		leftAnimTrackModel[0][3].setRotationPoint(31.5F, 1.5F, 16F);
		leftAnimTrackModel[0][3].rotateAngleZ = -2.35619449F;

		leftAnimTrackModel[0][4].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		leftAnimTrackModel[0][4].setRotationPoint(29F, 4F, 16F);
		leftAnimTrackModel[0][4].rotateAngleZ = -2.60106418F;

		leftAnimTrackModel[0][5].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Box82
		leftAnimTrackModel[0][5].setRotationPoint(-41.5F, -0.5F, 16F);
		leftAnimTrackModel[0][5].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[0][6].addShapeBox(0F, -1F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		leftAnimTrackModel[0][6].setRotationPoint(-42.5F, 1.5F, 16F);
		leftAnimTrackModel[0][6].rotateAngleZ = -0.78539816F;

		leftAnimTrackModel[0][7].addShapeBox(0F, -1F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftAnimTrackModel[0][7].setRotationPoint(-40F, -3F, 16F);
		leftAnimTrackModel[0][7].rotateAngleZ = -2.35619449F;

		leftAnimTrackModel[0][8].addShapeBox(0F, -1F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftAnimTrackModel[0][8].setRotationPoint(-40F, 4F, 16F);
		leftAnimTrackModel[0][8].rotateAngleZ = -0.54105207F;

		leftAnimTrackModel[0][9].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		leftAnimTrackModel[0][9].setRotationPoint(11F, -4.5F, 16F);
		leftAnimTrackModel[0][9].rotateAngleZ = -0.08307767F;

		leftAnimTrackModel[0][10].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		leftAnimTrackModel[0][10].setRotationPoint(-12F, -4.5F, 16F);

		leftAnimTrackModel[0][11].addShapeBox(-28F, 0F, 0F, 28, 1, 4, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		leftAnimTrackModel[0][11].setRotationPoint(-12F, -4.5F, 16F);
		leftAnimTrackModel[0][11].rotateAngleZ = 0.05323254F;


		rightAnimTrackModel[0] = new ModelRendererTurbo[12];
		rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 0, 273, textureX, textureY); // Import Box77
		rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 0, 342, textureX, textureY); // Import Box78
		rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 0, 248, textureX, textureY); // Import Box79
		rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Import Box80
		rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import Box81
		rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 0, 296, textureX, textureY); // Import Box82
		rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 0, 289, textureX, textureY); // Import Box83
		rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 0, 304, textureX, textureY); // Import Box84
		rightAnimTrackModel[0][8] = new ModelRendererTurbo(this, 0, 281, textureX, textureY); // Import Box85
		rightAnimTrackModel[0][9] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Import Box86
		rightAnimTrackModel[0][10] = new ModelRendererTurbo(this, 0, 321, textureX, textureY); // Import Box87
		rightAnimTrackModel[0][11] = new ModelRendererTurbo(this, 0, 312, textureX, textureY); // Import Box88

		rightAnimTrackModel[0][0].addBox(0F, 0F, -4F, 49, 1, 4, 0F); // Import Box77
		rightAnimTrackModel[0][0].setRotationPoint(-30F, 9F, -16F);

		rightAnimTrackModel[0][1].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		rightAnimTrackModel[0][1].setRotationPoint(29F, -3F, -16F);
		rightAnimTrackModel[0][1].rotateAngleZ = -0.78539816F;

		rightAnimTrackModel[0][2].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Box79
		rightAnimTrackModel[0][2].setRotationPoint(31.5F, -0.5F, -16F);
		rightAnimTrackModel[0][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[0][3].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		rightAnimTrackModel[0][3].setRotationPoint(31.5F, 1.5F, -16F);
		rightAnimTrackModel[0][3].rotateAngleZ = -2.35619449F;

		rightAnimTrackModel[0][4].addShapeBox(0F, 0F, -4F, 11, 1, 4, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightAnimTrackModel[0][4].setRotationPoint(29F, 4F, -16F);
		rightAnimTrackModel[0][4].rotateAngleZ = -2.60106418F;

		rightAnimTrackModel[0][5].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Box82
		rightAnimTrackModel[0][5].setRotationPoint(-41.5F, -0.5F, -16F);
		rightAnimTrackModel[0][5].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[0][6].addShapeBox(0F, -1F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		rightAnimTrackModel[0][6].setRotationPoint(-42.5F, 1.5F, -16F);
		rightAnimTrackModel[0][6].rotateAngleZ = -0.78539816F;

		rightAnimTrackModel[0][7].addShapeBox(0F, -1F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		rightAnimTrackModel[0][7].setRotationPoint(-40F, -3F, -16F);
		rightAnimTrackModel[0][7].rotateAngleZ = -2.35619449F;

		rightAnimTrackModel[0][8].addShapeBox(0F, -1F, -4F, 12, 1, 4, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		rightAnimTrackModel[0][8].setRotationPoint(-40F, 4F, -16F);
		rightAnimTrackModel[0][8].rotateAngleZ = -0.54105207F;

		rightAnimTrackModel[0][9].addShapeBox(0F, 0F, -4F, 18, 1, 4, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		rightAnimTrackModel[0][9].setRotationPoint(11F, -4.5F, -16F);
		rightAnimTrackModel[0][9].rotateAngleZ = -0.08307767F;

		rightAnimTrackModel[0][10].addShapeBox(0F, 0F, -4F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		rightAnimTrackModel[0][10].setRotationPoint(-12F, -4.5F, -16F);

		rightAnimTrackModel[0][11].addShapeBox(-28F, 0F, -4F, 28, 1, 4, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		rightAnimTrackModel[0][11].setRotationPoint(-12F, -4.5F, -16F);
		rightAnimTrackModel[0][11].rotateAngleZ = 0.05323254F;
		
		leftAnimTrackModel[1] = new ModelRendererTurbo[12];
		leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 125, 273, textureX, textureY); // Import Box77
		leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 125, 342, textureX, textureY); // Import Box78
		leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 125, 248, textureX, textureY); // Import Box79
		leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 125, 257, textureX, textureY); // Import Box80
		leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 125, 265, textureX, textureY); // Import Box81
		leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 125, 296, textureX, textureY); // Import Box82
		leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 125, 289, textureX, textureY); // Import Box83
		leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 125, 304, textureX, textureY); // Import Box84
		leftAnimTrackModel[1][8] = new ModelRendererTurbo(this, 125, 281, textureX, textureY); // Import Box85
		leftAnimTrackModel[1][9] = new ModelRendererTurbo(this, 125, 329, textureX, textureY); // Import Box86
		leftAnimTrackModel[1][10] = new ModelRendererTurbo(this, 125, 321, textureX, textureY); // Import Box87
		leftAnimTrackModel[1][11] = new ModelRendererTurbo(this, 125, 312, textureX, textureY); // Import Box88

		leftAnimTrackModel[1][0].addBox(0F, 0F, 0F, 49, 1, 4, 0F); // Import Box77
		leftAnimTrackModel[1][0].setRotationPoint(-30F, 9F, 16F);

		leftAnimTrackModel[1][1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		leftAnimTrackModel[1][1].setRotationPoint(29F, -3F, 16F);
		leftAnimTrackModel[1][1].rotateAngleZ = -0.78539816F;

		leftAnimTrackModel[1][2].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Box79
		leftAnimTrackModel[1][2].setRotationPoint(31.5F, -0.5F, 16F);
		leftAnimTrackModel[1][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[1][3].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		leftAnimTrackModel[1][3].setRotationPoint(31.5F, 1.5F, 16F);
		leftAnimTrackModel[1][3].rotateAngleZ = -2.35619449F;

		leftAnimTrackModel[1][4].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		leftAnimTrackModel[1][4].setRotationPoint(29F, 4F, 16F);
		leftAnimTrackModel[1][4].rotateAngleZ = -2.60106418F;

		leftAnimTrackModel[1][5].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Box82
		leftAnimTrackModel[1][5].setRotationPoint(-41.5F, -0.5F, 16F);
		leftAnimTrackModel[1][5].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[1][6].addShapeBox(0F, -1F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		leftAnimTrackModel[1][6].setRotationPoint(-42.5F, 1.5F, 16F);
		leftAnimTrackModel[1][6].rotateAngleZ = -0.78539816F;

		leftAnimTrackModel[1][7].addShapeBox(0F, -1F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftAnimTrackModel[1][7].setRotationPoint(-40F, -3F, 16F);
		leftAnimTrackModel[1][7].rotateAngleZ = -2.35619449F;

		leftAnimTrackModel[1][8].addShapeBox(0F, -1F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftAnimTrackModel[1][8].setRotationPoint(-40F, 4F, 16F);
		leftAnimTrackModel[1][8].rotateAngleZ = -0.54105207F;

		leftAnimTrackModel[1][9].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		leftAnimTrackModel[1][9].setRotationPoint(11F, -4.5F, 16F);
		leftAnimTrackModel[1][9].rotateAngleZ = -0.08307767F;

		leftAnimTrackModel[1][10].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		leftAnimTrackModel[1][10].setRotationPoint(-12F, -4.5F, 16F);

		leftAnimTrackModel[1][11].addShapeBox(-28F, 0F, 0F, 28, 1, 4, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		leftAnimTrackModel[1][11].setRotationPoint(-12F, -4.5F, 16F);
		leftAnimTrackModel[1][11].rotateAngleZ = 0.05323254F;


		rightAnimTrackModel[1] = new ModelRendererTurbo[12];
		rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 125, 273, textureX, textureY); // Import Box77
		rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 125, 342, textureX, textureY); // Import Box78
		rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 125, 248, textureX, textureY); // Import Box79
		rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 125, 257, textureX, textureY); // Import Box80
		rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 125, 265, textureX, textureY); // Import Box81
		rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 125, 296, textureX, textureY); // Import Box82
		rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 125, 289, textureX, textureY); // Import Box83
		rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 125, 304, textureX, textureY); // Import Box84
		rightAnimTrackModel[1][8] = new ModelRendererTurbo(this, 125, 281, textureX, textureY); // Import Box85
		rightAnimTrackModel[1][9] = new ModelRendererTurbo(this, 125, 329, textureX, textureY); // Import Box86
		rightAnimTrackModel[1][10] = new ModelRendererTurbo(this, 125, 321, textureX, textureY); // Import Box87
		rightAnimTrackModel[1][11] = new ModelRendererTurbo(this, 125, 312, textureX, textureY); // Import Box88

		rightAnimTrackModel[1][0].addBox(0F, 0F, -4F, 49, 1, 4, 0F); // Import Box77
		rightAnimTrackModel[1][0].setRotationPoint(-30F, 9F, -16F);

		rightAnimTrackModel[1][1].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		rightAnimTrackModel[1][1].setRotationPoint(29F, -3F, -16F);
		rightAnimTrackModel[1][1].rotateAngleZ = -0.78539816F;

		rightAnimTrackModel[1][2].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Box79
		rightAnimTrackModel[1][2].setRotationPoint(31.5F, -0.5F, -16F);
		rightAnimTrackModel[1][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[1][3].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		rightAnimTrackModel[1][3].setRotationPoint(31.5F, 1.5F, -16F);
		rightAnimTrackModel[1][3].rotateAngleZ = -2.35619449F;

		rightAnimTrackModel[1][4].addShapeBox(0F, 0F, -4F, 11, 1, 4, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightAnimTrackModel[1][4].setRotationPoint(29F, 4F, -16F);
		rightAnimTrackModel[1][4].rotateAngleZ = -2.60106418F;

		rightAnimTrackModel[1][5].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Box82
		rightAnimTrackModel[1][5].setRotationPoint(-41.5F, -0.5F, -16F);
		rightAnimTrackModel[1][5].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[1][6].addShapeBox(0F, -1F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		rightAnimTrackModel[1][6].setRotationPoint(-42.5F, 1.5F, -16F);
		rightAnimTrackModel[1][6].rotateAngleZ = -0.78539816F;

		rightAnimTrackModel[1][7].addShapeBox(0F, -1F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		rightAnimTrackModel[1][7].setRotationPoint(-40F, -3F, -16F);
		rightAnimTrackModel[1][7].rotateAngleZ = -2.35619449F;

		rightAnimTrackModel[1][8].addShapeBox(0F, -1F, -4F, 12, 1, 4, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		rightAnimTrackModel[1][8].setRotationPoint(-40F, 4F, -16F);
		rightAnimTrackModel[1][8].rotateAngleZ = -0.54105207F;

		rightAnimTrackModel[1][9].addShapeBox(0F, 0F, -4F, 18, 1, 4, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		rightAnimTrackModel[1][9].setRotationPoint(11F, -4.5F, -16F);
		rightAnimTrackModel[1][9].rotateAngleZ = -0.08307767F;

		rightAnimTrackModel[1][10].addShapeBox(0F, 0F, -4F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		rightAnimTrackModel[1][10].setRotationPoint(-12F, -4.5F, -16F);

		rightAnimTrackModel[1][11].addShapeBox(-28F, 0F, -4F, 28, 1, 4, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		rightAnimTrackModel[1][11].setRotationPoint(-12F, -4.5F, -16F);
		rightAnimTrackModel[1][11].rotateAngleZ = 0.05323254F;
		
		leftAnimTrackModel[2] = new ModelRendererTurbo[12];
		leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 270, 273, textureX, textureY); // Import Box77
		leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 270, 342, textureX, textureY); // Import Box78
		leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 270, 248, textureX, textureY); // Import Box79
		leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 270, 257, textureX, textureY); // Import Box80
		leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 270, 265, textureX, textureY); // Import Box81
		leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 270, 296, textureX, textureY); // Import Box82
		leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 270, 289, textureX, textureY); // Import Box83
		leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 270, 304, textureX, textureY); // Import Box84
		leftAnimTrackModel[2][8] = new ModelRendererTurbo(this, 270, 281, textureX, textureY); // Import Box85
		leftAnimTrackModel[2][9] = new ModelRendererTurbo(this, 270, 329, textureX, textureY); // Import Box86
		leftAnimTrackModel[2][10] = new ModelRendererTurbo(this, 270, 321, textureX, textureY); // Import Box87
		leftAnimTrackModel[2][11] = new ModelRendererTurbo(this, 270, 312, textureX, textureY); // Import Box88

		leftAnimTrackModel[2][0].addBox(0F, 0F, 0F, 49, 1, 4, 0F); // Import Box77
		leftAnimTrackModel[2][0].setRotationPoint(-30F, 9F, 16F);

		leftAnimTrackModel[2][1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		leftAnimTrackModel[2][1].setRotationPoint(29F, -3F, 16F);
		leftAnimTrackModel[2][1].rotateAngleZ = -0.78539816F;

		leftAnimTrackModel[2][2].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Box79
		leftAnimTrackModel[2][2].setRotationPoint(31.5F, -0.5F, 16F);
		leftAnimTrackModel[2][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[2][3].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		leftAnimTrackModel[2][3].setRotationPoint(31.5F, 1.5F, 16F);
		leftAnimTrackModel[2][3].rotateAngleZ = -2.35619449F;

		leftAnimTrackModel[2][4].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		leftAnimTrackModel[2][4].setRotationPoint(29F, 4F, 16F);
		leftAnimTrackModel[2][4].rotateAngleZ = -2.60106418F;

		leftAnimTrackModel[2][5].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Box82
		leftAnimTrackModel[2][5].setRotationPoint(-41.5F, -0.5F, 16F);
		leftAnimTrackModel[2][5].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[2][6].addShapeBox(0F, -1F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		leftAnimTrackModel[2][6].setRotationPoint(-42.5F, 1.5F, 16F);
		leftAnimTrackModel[2][6].rotateAngleZ = -0.78539816F;

		leftAnimTrackModel[2][7].addShapeBox(0F, -1F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftAnimTrackModel[2][7].setRotationPoint(-40F, -3F, 16F);
		leftAnimTrackModel[2][7].rotateAngleZ = -2.35619449F;

		leftAnimTrackModel[2][8].addShapeBox(0F, -1F, 0F, 12, 1, 4, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftAnimTrackModel[2][8].setRotationPoint(-40F, 4F, 16F);
		leftAnimTrackModel[2][8].rotateAngleZ = -0.54105207F;

		leftAnimTrackModel[2][9].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		leftAnimTrackModel[2][9].setRotationPoint(11F, -4.5F, 16F);
		leftAnimTrackModel[2][9].rotateAngleZ = -0.08307767F;

		leftAnimTrackModel[2][10].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		leftAnimTrackModel[2][10].setRotationPoint(-12F, -4.5F, 16F);

		leftAnimTrackModel[2][11].addShapeBox(-28F, 0F, 0F, 28, 1, 4, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		leftAnimTrackModel[2][11].setRotationPoint(-12F, -4.5F, 16F);
		leftAnimTrackModel[2][11].rotateAngleZ = 0.05323254F;


		rightAnimTrackModel[2] = new ModelRendererTurbo[12];
		rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 270, 273, textureX, textureY); // Import Box77
		rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 270, 342, textureX, textureY); // Import Box78
		rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 270, 248, textureX, textureY); // Import Box79
		rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 270, 257, textureX, textureY); // Import Box80
		rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 270, 265, textureX, textureY); // Import Box81
		rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 270, 296, textureX, textureY); // Import Box82
		rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 270, 289, textureX, textureY); // Import Box83
		rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 270, 304, textureX, textureY); // Import Box84
		rightAnimTrackModel[2][8] = new ModelRendererTurbo(this, 270, 281, textureX, textureY); // Import Box85
		rightAnimTrackModel[2][9] = new ModelRendererTurbo(this, 270, 329, textureX, textureY); // Import Box86
		rightAnimTrackModel[2][10] = new ModelRendererTurbo(this, 270, 321, textureX, textureY); // Import Box87
		rightAnimTrackModel[2][11] = new ModelRendererTurbo(this, 270, 312, textureX, textureY); // Import Box88

		rightAnimTrackModel[2][0].addBox(0F, 0F, -4F, 49, 1, 4, 0F); // Import Box77
		rightAnimTrackModel[2][0].setRotationPoint(-30F, 9F, -16F);

		rightAnimTrackModel[2][1].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		rightAnimTrackModel[2][1].setRotationPoint(29F, -3F, -16F);
		rightAnimTrackModel[2][1].rotateAngleZ = -0.78539816F;

		rightAnimTrackModel[2][2].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Box79
		rightAnimTrackModel[2][2].setRotationPoint(31.5F, -0.5F, -16F);
		rightAnimTrackModel[2][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[2][3].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		rightAnimTrackModel[2][3].setRotationPoint(31.5F, 1.5F, -16F);
		rightAnimTrackModel[2][3].rotateAngleZ = -2.35619449F;

		rightAnimTrackModel[2][4].addShapeBox(0F, 0F, -4F, 11, 1, 4, 0F, 0F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightAnimTrackModel[2][4].setRotationPoint(29F, 4F, -16F);
		rightAnimTrackModel[2][4].rotateAngleZ = -2.60106418F;

		rightAnimTrackModel[2][5].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Box82
		rightAnimTrackModel[2][5].setRotationPoint(-41.5F, -0.5F, -16F);
		rightAnimTrackModel[2][5].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[2][6].addShapeBox(0F, -1F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		rightAnimTrackModel[2][6].setRotationPoint(-42.5F, 1.5F, -16F);
		rightAnimTrackModel[2][6].rotateAngleZ = -0.78539816F;

		rightAnimTrackModel[2][7].addShapeBox(0F, -1F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0F, 0.54F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		rightAnimTrackModel[2][7].setRotationPoint(-40F, -3F, -16F);
		rightAnimTrackModel[2][7].rotateAngleZ = -2.35619449F;

		rightAnimTrackModel[2][8].addShapeBox(0F, -1F, -4F, 12, 1, 4, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		rightAnimTrackModel[2][8].setRotationPoint(-40F, 4F, -16F);
		rightAnimTrackModel[2][8].rotateAngleZ = -0.54105207F;

		rightAnimTrackModel[2][9].addShapeBox(0F, 0F, -4F, 18, 1, 4, 0F, 0F, 0F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		rightAnimTrackModel[2][9].setRotationPoint(11F, -4.5F, -16F);
		rightAnimTrackModel[2][9].rotateAngleZ = -0.08307767F;

		rightAnimTrackModel[2][10].addShapeBox(0F, 0F, -4F, 23, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		rightAnimTrackModel[2][10].setRotationPoint(-12F, -4.5F, -16F);

		rightAnimTrackModel[2][11].addShapeBox(-28F, 0F, -4F, 28, 1, 4, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		rightAnimTrackModel[2][11].setRotationPoint(-12F, -4.5F, -16F);
		rightAnimTrackModel[2][11].rotateAngleZ = 0.05323254F;
		
		
		animBarrelModel = new ModelRendererTurbo[4];
		animBarrelModel[0] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import ImportBox4
		animBarrelModel[1] = new ModelRendererTurbo(this, 141, 169, textureX, textureY); // Import ImportBox278
		animBarrelModel[2] = new ModelRendererTurbo(this, 141, 163, textureX, textureY); // Import ImportBox279
		animBarrelModel[3] = new ModelRendererTurbo(this, 141, 157, textureX, textureY); // Import ImportBox280

		animBarrelModel[0].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F); // Import ImportBox4
		animBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[1].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox278
		animBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[2].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Import ImportBox279
		animBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[3].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Import ImportBox280
		animBarrelModel[3].setRotationPoint(0, 0F, 0F);
		
		
		barrelAttach = new Vector3f(16F/16F, 16F/16F, 0F);
		


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
