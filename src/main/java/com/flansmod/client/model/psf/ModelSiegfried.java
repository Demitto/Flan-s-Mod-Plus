//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Siegfried
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.psf; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSiegfried extends ModelMecha //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelSiegfried() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[371];
		hipsModel = new ModelRendererTurbo[137];
		leftArmModel = new ModelRendererTurbo[183];
		rightArmModel = new ModelRendererTurbo[183];
		leftLegModel = new ModelRendererTurbo[121];
		rightLegModel = new ModelRendererTurbo[121];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 580, 442, textureX, textureY); // Core100
		bodyModel[2] = new ModelRendererTurbo(this, 17, 671, textureX, textureY); // Core101
		bodyModel[3] = new ModelRendererTurbo(this, 688, 462, textureX, textureY); // Core102
		bodyModel[4] = new ModelRendererTurbo(this, 17, 671, textureX, textureY); // Core103
		bodyModel[5] = new ModelRendererTurbo(this, 292, 698, textureX, textureY); // Core104
		bodyModel[6] = new ModelRendererTurbo(this, 292, 672, textureX, textureY); // Core105
		bodyModel[7] = new ModelRendererTurbo(this, 809, 307, textureX, textureY); // Core106
		bodyModel[8] = new ModelRendererTurbo(this, 809, 307, textureX, textureY); // Core107
		bodyModel[9] = new ModelRendererTurbo(this, 371, 905, textureX, textureY); // Core108
		bodyModel[10] = new ModelRendererTurbo(this, 503, 11, textureX, textureY); // Core109
		bodyModel[11] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Core11
		bodyModel[12] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Core110
		bodyModel[13] = new ModelRendererTurbo(this, 809, 307, textureX, textureY); // Core111
		bodyModel[14] = new ModelRendererTurbo(this, 809, 307, textureX, textureY); // Core112
		bodyModel[15] = new ModelRendererTurbo(this, 809, 307, textureX, textureY); // Core113
		bodyModel[16] = new ModelRendererTurbo(this, 809, 307, textureX, textureY); // Core114
		bodyModel[17] = new ModelRendererTurbo(this, 682, 406, textureX, textureY); // Core117
		bodyModel[18] = new ModelRendererTurbo(this, 623, 435, textureX, textureY); // Core118
		bodyModel[19] = new ModelRendererTurbo(this, 622, 408, textureX, textureY); // Core119
		bodyModel[20] = new ModelRendererTurbo(this, 197, 419, textureX, textureY); // Core12
		bodyModel[21] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Core120
		bodyModel[22] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Core121
		bodyModel[23] = new ModelRendererTurbo(this, 18, 905, textureX, textureY); // Core122
		bodyModel[24] = new ModelRendererTurbo(this, 881, 325, textureX, textureY); // Core123
		bodyModel[25] = new ModelRendererTurbo(this, 881, 350, textureX, textureY); // Core124
		bodyModel[26] = new ModelRendererTurbo(this, 881, 306, textureX, textureY); // Core125
		bodyModel[27] = new ModelRendererTurbo(this, 809, 328, textureX, textureY); // Core126
		bodyModel[28] = new ModelRendererTurbo(this, 810, 353, textureX, textureY); // Core127
		bodyModel[29] = new ModelRendererTurbo(this, 923, 313, textureX, textureY); // Core128
		bodyModel[30] = new ModelRendererTurbo(this, 923, 313, textureX, textureY); // Core129
		bodyModel[31] = new ModelRendererTurbo(this, 197, 419, textureX, textureY); // Core13
		bodyModel[32] = new ModelRendererTurbo(this, 808, 391, textureX, textureY); // Core130
		bodyModel[33] = new ModelRendererTurbo(this, 808, 391, textureX, textureY); // Core131
		bodyModel[34] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core132
		bodyModel[35] = new ModelRendererTurbo(this, 10, 806, textureX, textureY); // Core133
		bodyModel[36] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core134
		bodyModel[37] = new ModelRendererTurbo(this, 605, 410, textureX, textureY); // Core135
		bodyModel[38] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core136
		bodyModel[39] = new ModelRendererTurbo(this, 294, 730, textureX, textureY); // Core137
		bodyModel[40] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Core138
		bodyModel[41] = new ModelRendererTurbo(this, 18, 905, textureX, textureY); // Core139
		bodyModel[42] = new ModelRendererTurbo(this, 263, 335, textureX, textureY); // Core14
		bodyModel[43] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core140
		bodyModel[44] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core141
		bodyModel[45] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core142
		bodyModel[46] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core143
		bodyModel[47] = new ModelRendererTurbo(this, 881, 350, textureX, textureY); // Core144
		bodyModel[48] = new ModelRendererTurbo(this, 881, 325, textureX, textureY); // Core145
		bodyModel[49] = new ModelRendererTurbo(this, 881, 306, textureX, textureY); // Core146
		bodyModel[50] = new ModelRendererTurbo(this, 809, 328, textureX, textureY); // Core147
		bodyModel[51] = new ModelRendererTurbo(this, 810, 353, textureX, textureY); // Core148
		bodyModel[52] = new ModelRendererTurbo(this, 808, 391, textureX, textureY); // Core149
		bodyModel[53] = new ModelRendererTurbo(this, 269, 233, textureX, textureY); // Core15
		bodyModel[54] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core150
		bodyModel[55] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Core151
		bodyModel[56] = new ModelRendererTurbo(this, 294, 758, textureX, textureY); // Core152
		bodyModel[57] = new ModelRendererTurbo(this, 126, 946, textureX, textureY); // Core153
		bodyModel[58] = new ModelRendererTurbo(this, 808, 391, textureX, textureY); // Core154
		bodyModel[59] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core155
		bodyModel[60] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core156
		bodyModel[61] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core157
		bodyModel[62] = new ModelRendererTurbo(this, 843, 391, textureX, textureY); // Core158
		bodyModel[63] = new ModelRendererTurbo(this, 18, 905, textureX, textureY); // Core159
		bodyModel[64] = new ModelRendererTurbo(this, 263, 335, textureX, textureY); // Core16
		bodyModel[65] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core160
		bodyModel[66] = new ModelRendererTurbo(this, 503, 58, textureX, textureY); // Core161
		bodyModel[67] = new ModelRendererTurbo(this, 5, 233, textureX, textureY); // Core162
		bodyModel[68] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core163
		bodyModel[69] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core165
		bodyModel[70] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core166
		bodyModel[71] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core167
		bodyModel[72] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core168
		bodyModel[73] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core169
		bodyModel[74] = new ModelRendererTurbo(this, 209, 347, textureX, textureY); // Core17
		bodyModel[75] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core170
		bodyModel[76] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core171
		bodyModel[77] = new ModelRendererTurbo(this, 342, 11, textureX, textureY); // Core172
		bodyModel[78] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core173
		bodyModel[79] = new ModelRendererTurbo(this, 8, 427, textureX, textureY); // Core174
		bodyModel[80] = new ModelRendererTurbo(this, 126, 905, textureX, textureY); // Core175
		bodyModel[81] = new ModelRendererTurbo(this, 647, 494, textureX, textureY); // Core176
		bodyModel[82] = new ModelRendererTurbo(this, 504, 403, textureX, textureY); // Core177
		bodyModel[83] = new ModelRendererTurbo(this, 516, 403, textureX, textureY); // Core178
		bodyModel[84] = new ModelRendererTurbo(this, 516, 403, textureX, textureY); // Core179
		bodyModel[85] = new ModelRendererTurbo(this, 255, 287, textureX, textureY); // Core18
		bodyModel[86] = new ModelRendererTurbo(this, 504, 403, textureX, textureY); // Core180
		bodyModel[87] = new ModelRendererTurbo(this, 504, 403, textureX, textureY); // Core181
		bodyModel[88] = new ModelRendererTurbo(this, 516, 403, textureX, textureY); // Core182
		bodyModel[89] = new ModelRendererTurbo(this, 516, 403, textureX, textureY); // Core183
		bodyModel[90] = new ModelRendererTurbo(this, 504, 403, textureX, textureY); // Core184
		bodyModel[91] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core185
		bodyModel[92] = new ModelRendererTurbo(this, 18, 905, textureX, textureY); // Core186
		bodyModel[93] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core187
		bodyModel[94] = new ModelRendererTurbo(this, 282, 422, textureX, textureY); // Core188
		bodyModel[95] = new ModelRendererTurbo(this, 5, 503, textureX, textureY); // Core189
		bodyModel[96] = new ModelRendererTurbo(this, 221, 479, textureX, textureY); // Core19
		bodyModel[97] = new ModelRendererTurbo(this, 73, 546, textureX, textureY); // Core190
		bodyModel[98] = new ModelRendererTurbo(this, 5, 538, textureX, textureY); // Core191
		bodyModel[99] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core192
		bodyModel[100] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core193
		bodyModel[101] = new ModelRendererTurbo(this, 13, 745, textureX, textureY); // Core194
		bodyModel[102] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core195
		bodyModel[103] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core196
		bodyModel[104] = new ModelRendererTurbo(this, 281, 437, textureX, textureY); // Core197
		bodyModel[105] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core198
		bodyModel[106] = new ModelRendererTurbo(this, 13, 745, textureX, textureY); // Core199
		bodyModel[107] = new ModelRendererTurbo(this, 605, 410, textureX, textureY); // Core2
		bodyModel[108] = new ModelRendererTurbo(this, 221, 502, textureX, textureY); // Core20
		bodyModel[109] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core200
		bodyModel[110] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core201
		bodyModel[111] = new ModelRendererTurbo(this, 13, 745, textureX, textureY); // Core202
		bodyModel[112] = new ModelRendererTurbo(this, 252, 905, textureX, textureY); // Core203
		bodyModel[113] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core204
		bodyModel[114] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core205
		bodyModel[115] = new ModelRendererTurbo(this, 299, 452, textureX, textureY); // Core206
		bodyModel[116] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core207
		bodyModel[117] = new ModelRendererTurbo(this, 299, 452, textureX, textureY); // Core208
		bodyModel[118] = new ModelRendererTurbo(this, 252, 905, textureX, textureY); // Core209
		bodyModel[119] = new ModelRendererTurbo(this, 221, 502, textureX, textureY); // Core21
		bodyModel[120] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core210
		bodyModel[121] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Core211
		bodyModel[122] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core212
		bodyModel[123] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core213
		bodyModel[124] = new ModelRendererTurbo(this, 371, 905, textureX, textureY); // Core214
		bodyModel[125] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core215
		bodyModel[126] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core216
		bodyModel[127] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core217
		bodyModel[128] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core218
		bodyModel[129] = new ModelRendererTurbo(this, 437, 156, textureX, textureY); // Core219
		bodyModel[130] = new ModelRendererTurbo(this, 377, 986, textureX, textureY); // Core22
		bodyModel[131] = new ModelRendererTurbo(this, 299, 452, textureX, textureY); // Core220
		bodyModel[132] = new ModelRendererTurbo(this, 503, 11, textureX, textureY); // Core221
		bodyModel[133] = new ModelRendererTurbo(this, 514, 156, textureX, textureY); // Core222
		bodyModel[134] = new ModelRendererTurbo(this, 299, 452, textureX, textureY); // Core223
		bodyModel[135] = new ModelRendererTurbo(this, 503, 58, textureX, textureY); // Core224
		bodyModel[136] = new ModelRendererTurbo(this, 437, 156, textureX, textureY); // Core225
		bodyModel[137] = new ModelRendererTurbo(this, 514, 156, textureX, textureY); // Core226
		bodyModel[138] = new ModelRendererTurbo(this, 299, 452, textureX, textureY); // Core227
		bodyModel[139] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Core228
		bodyModel[140] = new ModelRendererTurbo(this, 17, 989, textureX, textureY); // Core23
		bodyModel[141] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core230
		bodyModel[142] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Core231
		bodyModel[143] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Core232
		bodyModel[144] = new ModelRendererTurbo(this, 595, 16, textureX, textureY); // Core233
		bodyModel[145] = new ModelRendererTurbo(this, 282, 422, textureX, textureY); // Core234
		bodyModel[146] = new ModelRendererTurbo(this, 595, 16, textureX, textureY); // Core235
		bodyModel[147] = new ModelRendererTurbo(this, 282, 422, textureX, textureY); // Core236
		bodyModel[148] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core237
		bodyModel[149] = new ModelRendererTurbo(this, 595, 16, textureX, textureY); // Core238
		bodyModel[150] = new ModelRendererTurbo(this, 282, 422, textureX, textureY); // Core239
		bodyModel[151] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Core24
		bodyModel[152] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core240
		bodyModel[153] = new ModelRendererTurbo(this, 282, 422, textureX, textureY); // Core241
		bodyModel[154] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core242
		bodyModel[155] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core243
		bodyModel[156] = new ModelRendererTurbo(this, 359, 939, textureX, textureY); // Core244
		bodyModel[157] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core245
		bodyModel[158] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Core246
		bodyModel[159] = new ModelRendererTurbo(this, 282, 422, textureX, textureY); // Core247
		bodyModel[160] = new ModelRendererTurbo(this, 457, 119, textureX, textureY); // Core248
		bodyModel[161] = new ModelRendererTurbo(this, 299, 433, textureX, textureY); // Core249
		bodyModel[162] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core25
		bodyModel[163] = new ModelRendererTurbo(this, 437, 156, textureX, textureY); // Core250
		bodyModel[164] = new ModelRendererTurbo(this, 299, 433, textureX, textureY); // Core251
		bodyModel[165] = new ModelRendererTurbo(this, 514, 156, textureX, textureY); // Core252
		bodyModel[166] = new ModelRendererTurbo(this, 302, 479, textureX, textureY); // Core253
		bodyModel[167] = new ModelRendererTurbo(this, 514, 156, textureX, textureY); // Core254
		bodyModel[168] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core255
		bodyModel[169] = new ModelRendererTurbo(this, 437, 156, textureX, textureY); // Core256
		bodyModel[170] = new ModelRendererTurbo(this, 595, 16, textureX, textureY); // Core257
		bodyModel[171] = new ModelRendererTurbo(this, 297, 491, textureX, textureY); // Core258
		bodyModel[172] = new ModelRendererTurbo(this, 261, 502, textureX, textureY); // Core259
		bodyModel[173] = new ModelRendererTurbo(this, 221, 522, textureX, textureY); // Core26
		bodyModel[174] = new ModelRendererTurbo(this, 595, 16, textureX, textureY); // Core260
		bodyModel[175] = new ModelRendererTurbo(this, 595, 16, textureX, textureY); // Core261
		bodyModel[176] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core262
		bodyModel[177] = new ModelRendererTurbo(this, 246, 132, textureX, textureY); // Core263
		bodyModel[178] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core264
		bodyModel[179] = new ModelRendererTurbo(this, 509, 203, textureX, textureY); // Core265
		bodyModel[180] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core266
		bodyModel[181] = new ModelRendererTurbo(this, 636, 479, textureX, textureY); // Core267
		bodyModel[182] = new ModelRendererTurbo(this, 377, 986, textureX, textureY); // Core268
		bodyModel[183] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core269
		bodyModel[184] = new ModelRendererTurbo(this, 221, 522, textureX, textureY); // Core27
		bodyModel[185] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core270
		bodyModel[186] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core271
		bodyModel[187] = new ModelRendererTurbo(this, 509, 203, textureX, textureY); // Core272
		bodyModel[188] = new ModelRendererTurbo(this, 302, 479, textureX, textureY); // Core273
		bodyModel[189] = new ModelRendererTurbo(this, 246, 132, textureX, textureY); // Core274
		bodyModel[190] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core275
		bodyModel[191] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core276
		bodyModel[192] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core277
		bodyModel[193] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core278
		bodyModel[194] = new ModelRendererTurbo(this, 297, 491, textureX, textureY); // Core279
		bodyModel[195] = new ModelRendererTurbo(this, 255, 522, textureX, textureY); // Core28
		bodyModel[196] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core280
		bodyModel[197] = new ModelRendererTurbo(this, 261, 502, textureX, textureY); // Core281
		bodyModel[198] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core282
		bodyModel[199] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core283
		bodyModel[200] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core284
		bodyModel[201] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core285
		bodyModel[202] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core286
		bodyModel[203] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core287
		bodyModel[204] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core288
		bodyModel[205] = new ModelRendererTurbo(this, 261, 491, textureX, textureY); // Core289
		bodyModel[206] = new ModelRendererTurbo(this, 255, 522, textureX, textureY); // Core29
		bodyModel[207] = new ModelRendererTurbo(this, 540, 109, textureX, textureY); // Core290
		bodyModel[208] = new ModelRendererTurbo(this, 636, 462, textureX, textureY); // Core291
		bodyModel[209] = new ModelRendererTurbo(this, 229, 623, textureX, textureY); // Core292
		bodyModel[210] = new ModelRendererTurbo(this, 394, 939, textureX, textureY); // Core293
		bodyModel[211] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core294
		bodyModel[212] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core295
		bodyModel[213] = new ModelRendererTurbo(this, 509, 203, textureX, textureY); // Core296
		bodyModel[214] = new ModelRendererTurbo(this, 302, 479, textureX, textureY); // Core297
		bodyModel[215] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core298
		bodyModel[216] = new ModelRendererTurbo(this, 246, 132, textureX, textureY); // Core299
		bodyModel[217] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core3
		bodyModel[218] = new ModelRendererTurbo(this, 221, 522, textureX, textureY); // Core30
		bodyModel[219] = new ModelRendererTurbo(this, 509, 203, textureX, textureY); // Core300
		bodyModel[220] = new ModelRendererTurbo(this, 297, 491, textureX, textureY); // Core301
		bodyModel[221] = new ModelRendererTurbo(this, 246, 132, textureX, textureY); // Core302
		bodyModel[222] = new ModelRendererTurbo(this, 269, 476, textureX, textureY); // Core303
		bodyModel[223] = new ModelRendererTurbo(this, 269, 476, textureX, textureY); // Core304
		bodyModel[224] = new ModelRendererTurbo(this, 295, 587, textureX, textureY); // Core305
		bodyModel[225] = new ModelRendererTurbo(this, 269, 476, textureX, textureY); // Core307
		bodyModel[226] = new ModelRendererTurbo(this, 282, 478, textureX, textureY); // Core308
		bodyModel[227] = new ModelRendererTurbo(this, 295, 587, textureX, textureY); // Core309
		bodyModel[228] = new ModelRendererTurbo(this, 221, 522, textureX, textureY); // Core31
		bodyModel[229] = new ModelRendererTurbo(this, 295, 587, textureX, textureY); // Core310
		bodyModel[230] = new ModelRendererTurbo(this, 302, 479, textureX, textureY); // Core311
		bodyModel[231] = new ModelRendererTurbo(this, 719, 185, textureX, textureY); // Core312
		bodyModel[232] = new ModelRendererTurbo(this, 297, 491, textureX, textureY); // Core313
		bodyModel[233] = new ModelRendererTurbo(this, 269, 476, textureX, textureY); // Core314
		bodyModel[234] = new ModelRendererTurbo(this, 840, 60, textureX, textureY); // Core315
		bodyModel[235] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core316
		bodyModel[236] = new ModelRendererTurbo(this, 636, 462, textureX, textureY); // Core317
		bodyModel[237] = new ModelRendererTurbo(this, 342, 11, textureX, textureY); // Core318
		bodyModel[238] = new ModelRendererTurbo(this, 377, 986, textureX, textureY); // Core319
		bodyModel[239] = new ModelRendererTurbo(this, 221, 502, textureX, textureY); // Core32
		bodyModel[240] = new ModelRendererTurbo(this, 612, 66, textureX, textureY); // Core320
		bodyModel[241] = new ModelRendererTurbo(this, 678, 12, textureX, textureY); // Core321
		bodyModel[242] = new ModelRendererTurbo(this, 269, 476, textureX, textureY); // Core322
		bodyModel[243] = new ModelRendererTurbo(this, 295, 500, textureX, textureY); // Core323
		bodyModel[244] = new ModelRendererTurbo(this, 371, 905, textureX, textureY); // Core324
		bodyModel[245] = new ModelRendererTurbo(this, 295, 500, textureX, textureY); // Core325
		bodyModel[246] = new ModelRendererTurbo(this, 359, 939, textureX, textureY); // Core326
		bodyModel[247] = new ModelRendererTurbo(this, 269, 476, textureX, textureY); // Core327
		bodyModel[248] = new ModelRendererTurbo(this, 394, 939, textureX, textureY); // Core328
		bodyModel[249] = new ModelRendererTurbo(this, 6, 593, textureX, textureY); // Core329
		bodyModel[250] = new ModelRendererTurbo(this, 221, 502, textureX, textureY); // Core33
		bodyModel[251] = new ModelRendererTurbo(this, 377, 986, textureX, textureY); // Core330
		bodyModel[252] = new ModelRendererTurbo(this, 163, 233, textureX, textureY); // Core331
		bodyModel[253] = new ModelRendererTurbo(this, 377, 986, textureX, textureY); // Core332
		bodyModel[254] = new ModelRendererTurbo(this, 354, 486, textureX, textureY); // Core333
		bodyModel[255] = new ModelRendererTurbo(this, 394, 939, textureX, textureY); // Core334
		bodyModel[256] = new ModelRendererTurbo(this, 359, 939, textureX, textureY); // Core335
		bodyModel[257] = new ModelRendererTurbo(this, 329, 485, textureX, textureY); // Core336
		bodyModel[258] = new ModelRendererTurbo(this, 329, 455, textureX, textureY); // Core337
		bodyModel[259] = new ModelRendererTurbo(this, 371, 905, textureX, textureY); // Core338
		bodyModel[260] = new ModelRendererTurbo(this, 636, 479, textureX, textureY); // Core339
		bodyModel[261] = new ModelRendererTurbo(this, 221, 479, textureX, textureY); // Core34
		bodyModel[262] = new ModelRendererTurbo(this, 394, 939, textureX, textureY); // Core340
		bodyModel[263] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core341
		bodyModel[264] = new ModelRendererTurbo(this, 229, 623, textureX, textureY); // Core342
		bodyModel[265] = new ModelRendererTurbo(this, 342, 11, textureX, textureY); // Core343
		bodyModel[266] = new ModelRendererTurbo(this, 329, 483, textureX, textureY); // Core344
		bodyModel[267] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core345
		bodyModel[268] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core346
		bodyModel[269] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core348
		bodyModel[270] = new ModelRendererTurbo(this, 291, 512, textureX, textureY); // Core35
		bodyModel[271] = new ModelRendererTurbo(this, 329, 431, textureX, textureY); // Core351
		bodyModel[272] = new ModelRendererTurbo(this, 329, 453, textureX, textureY); // Core355
		bodyModel[273] = new ModelRendererTurbo(this, 329, 429, textureX, textureY); // Core356
		bodyModel[274] = new ModelRendererTurbo(this, 229, 623, textureX, textureY); // Core357
		bodyModel[275] = new ModelRendererTurbo(this, 359, 939, textureX, textureY); // Core358
		bodyModel[276] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Core359
		bodyModel[277] = new ModelRendererTurbo(this, 18, 905, textureX, textureY); // Core36
		bodyModel[278] = new ModelRendererTurbo(this, 636, 479, textureX, textureY); // Core360
		bodyModel[279] = new ModelRendererTurbo(this, 329, 455, textureX, textureY); // Core361
		bodyModel[280] = new ModelRendererTurbo(this, 329, 431, textureX, textureY); // Core362
		bodyModel[281] = new ModelRendererTurbo(this, 329, 431, textureX, textureY); // Core367
		bodyModel[282] = new ModelRendererTurbo(this, 329, 455, textureX, textureY); // Core368
		bodyModel[283] = new ModelRendererTurbo(this, 329, 429, textureX, textureY); // Core369
		bodyModel[284] = new ModelRendererTurbo(this, 394, 939, textureX, textureY); // Core37
		bodyModel[285] = new ModelRendererTurbo(this, 197, 437, textureX, textureY); // Core370
		bodyModel[286] = new ModelRendererTurbo(this, 234, 814, textureX, textureY); // Core371
		bodyModel[287] = new ModelRendererTurbo(this, 234, 814, textureX, textureY); // Core372
		bodyModel[288] = new ModelRendererTurbo(this, 234, 814, textureX, textureY); // Core373
		bodyModel[289] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core38
		bodyModel[290] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core39
		bodyModel[291] = new ModelRendererTurbo(this, 252, 905, textureX, textureY); // Core4
		bodyModel[292] = new ModelRendererTurbo(this, 291, 512, textureX, textureY); // Core40
		bodyModel[293] = new ModelRendererTurbo(this, 295, 587, textureX, textureY); // Core400
		bodyModel[294] = new ModelRendererTurbo(this, 295, 515, textureX, textureY); // Core41
		bodyModel[295] = new ModelRendererTurbo(this, 351, 465, textureX, textureY); // Core42
		bodyModel[296] = new ModelRendererTurbo(this, 277, 492, textureX, textureY); // Core43
		bodyModel[297] = new ModelRendererTurbo(this, 287, 492, textureX, textureY); // Core44
		bodyModel[298] = new ModelRendererTurbo(this, 277, 492, textureX, textureY); // Core45
		bodyModel[299] = new ModelRendererTurbo(this, 287, 492, textureX, textureY); // Core46
		bodyModel[300] = new ModelRendererTurbo(this, 229, 293, textureX, textureY); // Core47
		bodyModel[301] = new ModelRendererTurbo(this, 229, 293, textureX, textureY); // Core48
		bodyModel[302] = new ModelRendererTurbo(this, 18, 905, textureX, textureY); // Core49
		bodyModel[303] = new ModelRendererTurbo(this, 605, 410, textureX, textureY); // Core5
		bodyModel[304] = new ModelRendererTurbo(this, 359, 939, textureX, textureY); // Core50
		bodyModel[305] = new ModelRendererTurbo(this, 391, 11, textureX, textureY); // Core51
		bodyModel[306] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core52
		bodyModel[307] = new ModelRendererTurbo(this, 229, 293, textureX, textureY); // Core53
		bodyModel[308] = new ModelRendererTurbo(this, 371, 905, textureX, textureY); // Core54
		bodyModel[309] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core55
		bodyModel[310] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core56
		bodyModel[311] = new ModelRendererTurbo(this, 229, 293, textureX, textureY); // Core57
		bodyModel[312] = new ModelRendererTurbo(this, 377, 480, textureX, textureY); // Core58
		bodyModel[313] = new ModelRendererTurbo(this, 251, 359, textureX, textureY); // Core59
		bodyModel[314] = new ModelRendererTurbo(this, 53, 683, textureX, textureY); // Core6
		bodyModel[315] = new ModelRendererTurbo(this, 377, 333, textureX, textureY); // Core60
		bodyModel[316] = new ModelRendererTurbo(this, 377, 398, textureX, textureY); // Core61
		bodyModel[317] = new ModelRendererTurbo(this, 435, 229, textureX, textureY); // Core62
		bodyModel[318] = new ModelRendererTurbo(this, 377, 229, textureX, textureY); // Core63
		bodyModel[319] = new ModelRendererTurbo(this, 11, 361, textureX, textureY); // Core64
		bodyModel[320] = new ModelRendererTurbo(this, 372, 575, textureX, textureY); // Core65
		bodyModel[321] = new ModelRendererTurbo(this, 436, 285, textureX, textureY); // Core66
		bodyModel[322] = new ModelRendererTurbo(this, 377, 986, textureX, textureY); // Core67
		bodyModel[323] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core68
		bodyModel[324] = new ModelRendererTurbo(this, 12, 946, textureX, textureY); // Core69
		bodyModel[325] = new ModelRendererTurbo(this, 389, 95, textureX, textureY); // Core70
		bodyModel[326] = new ModelRendererTurbo(this, 371, 300, textureX, textureY); // Core71
		bodyModel[327] = new ModelRendererTurbo(this, 371, 313, textureX, textureY); // Core72
		bodyModel[328] = new ModelRendererTurbo(this, 371, 332, textureX, textureY); // Core73
		bodyModel[329] = new ModelRendererTurbo(this, 371, 281, textureX, textureY); // Core74
		bodyModel[330] = new ModelRendererTurbo(this, 371, 281, textureX, textureY); // Core75
		bodyModel[331] = new ModelRendererTurbo(this, 371, 300, textureX, textureY); // Core76
		bodyModel[332] = new ModelRendererTurbo(this, 436, 285, textureX, textureY); // Core77
		bodyModel[333] = new ModelRendererTurbo(this, 371, 313, textureX, textureY); // Core78
		bodyModel[334] = new ModelRendererTurbo(this, 371, 332, textureX, textureY); // Core79
		bodyModel[335] = new ModelRendererTurbo(this, 371, 905, textureX, textureY); // Core8
		bodyModel[336] = new ModelRendererTurbo(this, 342, 11, textureX, textureY); // Core80
		bodyModel[337] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core81
		bodyModel[338] = new ModelRendererTurbo(this, 394, 939, textureX, textureY); // Core82
		bodyModel[339] = new ModelRendererTurbo(this, 5, 503, textureX, textureY); // Core83
		bodyModel[340] = new ModelRendererTurbo(this, 11, 361, textureX, textureY); // Core84
		bodyModel[341] = new ModelRendererTurbo(this, 372, 575, textureX, textureY); // Core85
		bodyModel[342] = new ModelRendererTurbo(this, 504, 403, textureX, textureY); // Core86
		bodyModel[343] = new ModelRendererTurbo(this, 580, 359, textureX, textureY); // Core87
		bodyModel[344] = new ModelRendererTurbo(this, 497, 443, textureX, textureY); // Core88
		bodyModel[345] = new ModelRendererTurbo(this, 580, 316, textureX, textureY); // Core89
		bodyModel[346] = new ModelRendererTurbo(this, 636, 479, textureX, textureY); // Core9
		bodyModel[347] = new ModelRendererTurbo(this, 700, 356, textureX, textureY); // Core90
		bodyModel[348] = new ModelRendererTurbo(this, 700, 310, textureX, textureY); // Core91
		bodyModel[349] = new ModelRendererTurbo(this, 572, 485, textureX, textureY); // Core92
		bodyModel[350] = new ModelRendererTurbo(this, 126, 946, textureX, textureY); // Core93
		bodyModel[351] = new ModelRendererTurbo(this, 359, 939, textureX, textureY); // Core94
		bodyModel[352] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Core95
		bodyModel[353] = new ModelRendererTurbo(this, 346, 80, textureX, textureY); // Core96
		bodyModel[354] = new ModelRendererTurbo(this, 490, 306, textureX, textureY); // Core97
		bodyModel[355] = new ModelRendererTurbo(this, 487, 485, textureX, textureY); // Core98
		bodyModel[356] = new ModelRendererTurbo(this, 580, 442, textureX, textureY); // Core99
		bodyModel[357] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights1
		bodyModel[358] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights10
		bodyModel[359] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights2
		bodyModel[360] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights3
		bodyModel[361] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights4
		bodyModel[362] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights5
		bodyModel[363] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights6
		bodyModel[364] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights6
		bodyModel[365] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights7
		bodyModel[366] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights8
		bodyModel[367] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights9
		bodyModel[368] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // CoreLights9
		bodyModel[369] = new ModelRendererTurbo(this, 1332, 17, textureX, textureY); // CoreDecal1
		bodyModel[370] = new ModelRendererTurbo(this, 1349, 346, textureX, textureY); // CoreDecal2

		bodyModel[0].addShapeBox(8F, -74F, 34F, 16, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Core1
		bodyModel[0].setRotationPoint(0F, -193F, 0F);

		bodyModel[1].addShapeBox(27F, -153F, -4F, 2, 8, 8, 0F,0F, 0F, -1F, 2F, -3F, -1F, 2F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core100
		bodyModel[1].setRotationPoint(0F, -193F, 0F);

		bodyModel[2].addShapeBox(-34F, -88F, -60F, 70, 10, 120, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core101
		bodyModel[2].setRotationPoint(0F, -193F, 0F);

		bodyModel[3].addShapeBox(-30F, -165F, 1F, 8, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core102
		bodyModel[3].setRotationPoint(0F, -193F, 0F);

		bodyModel[4].addShapeBox(-34F, -135F, -60F, 70, 10, 120, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core103
		bodyModel[4].setRotationPoint(0F, -193F, 0F);

		bodyModel[5].addShapeBox(-34F, -135F, 60F, 70, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Core104
		bodyModel[5].setRotationPoint(0F, -193F, 0F);

		bodyModel[6].addShapeBox(-34F, -135F, -75F, 70, 10, 15, 0F,-20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core105
		bodyModel[6].setRotationPoint(0F, -193F, 0F);

		bodyModel[7].addShapeBox(-14F, -165F, 14F, 24, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core106
		bodyModel[7].setRotationPoint(0F, -193F, 0F);

		bodyModel[8].addShapeBox(-14F, -171F, 14F, 24, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core107
		bodyModel[8].setRotationPoint(0F, -193F, 0F);

		bodyModel[9].addShapeBox(-21F, -78F, 22F, 8, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core108
		bodyModel[9].setRotationPoint(0F, -193F, 0F);

		bodyModel[10].addBox(-10F, -119F, 60F, 24, 24, 16, 0F); // Core109
		bodyModel[10].setRotationPoint(0F, -193F, 0F);

		bodyModel[11].addShapeBox(-19F, -119F, 44F, 42, 24, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core11
		bodyModel[11].setRotationPoint(0F, -193F, 0F);

		bodyModel[12].addShapeBox(-19F, -119F, -60F, 42, 24, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core110
		bodyModel[12].setRotationPoint(0F, -193F, 0F);

		bodyModel[13].addShapeBox(-14F, -155F, 14F, 24, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Core111
		bodyModel[13].setRotationPoint(0F, -193F, 0F);

		bodyModel[14].addShapeBox(-14F, -171F, -18F, 24, 6, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core112
		bodyModel[14].setRotationPoint(0F, -193F, 0F);

		bodyModel[15].addShapeBox(-14F, -165F, -18F, 24, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core113
		bodyModel[15].setRotationPoint(0F, -193F, 0F);

		bodyModel[16].addShapeBox(-14F, -155F, -18F, 24, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Core114
		bodyModel[16].setRotationPoint(0F, -193F, 0F);

		bodyModel[17].addBox(-10F, -174F, -9F, 24, 5, 10, 0F); // Core117
		bodyModel[17].setRotationPoint(0F, -193F, 0F);

		bodyModel[18].addBox(-5F, -170.5F, 1F, 16, 1, 9, 0F); // Core118
		bodyModel[18].setRotationPoint(0F, -193F, 0F);

		bodyModel[19].addShapeBox(14F, -169F, 2F, 18, 7, 6, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core119
		bodyModel[19].setRotationPoint(0F, -193F, 0F);

		bodyModel[20].addShapeBox(15F, -90.5F, -9F, 26, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core12
		bodyModel[20].setRotationPoint(0F, -193F, 0F);

		bodyModel[21].addShapeBox(-19F, -119F, -68F, 42, 24, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core120
		bodyModel[21].setRotationPoint(0F, -193F, 0F);

		bodyModel[22].addShapeBox(-14F, -128F, 108F, 32, 42, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Core121
		bodyModel[22].setRotationPoint(0F, -193F, 0F);

		bodyModel[23].addShapeBox(-18F, -59F, 9F, 36, 17, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Core122
		bodyModel[23].setRotationPoint(0F, -193F, 0F);

		bodyModel[24].addShapeBox(-5F, -165F, 20F, 6, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core123
		bodyModel[24].setRotationPoint(0F, -193F, 0F);

		bodyModel[25].addShapeBox(-5F, -165F, 28F, 6, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core124
		bodyModel[25].setRotationPoint(0F, -193F, 0F);

		bodyModel[26].addShapeBox(-5F, -165F, 18F, 6, 10, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core125
		bodyModel[26].setRotationPoint(0F, -193F, 0F);

		bodyModel[27].addShapeBox(-6F, -162F, 18F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core126
		bodyModel[27].setRotationPoint(0F, -193F, 0F);

		bodyModel[28].addShapeBox(-4F, -167F, 22F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core127
		bodyModel[28].setRotationPoint(0F, -193F, 0F);

		bodyModel[29].addShapeBox(27F, -214F, -17F, 3, 50, 3, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core128
		bodyModel[29].setRotationPoint(0F, -193F, 0F);
		bodyModel[29].rotateAngleZ = 0.17453293F;

		bodyModel[30].addShapeBox(55F, -201F, 15F, 2, 40, 2, 0F,-1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core129
		bodyModel[30].setRotationPoint(0F, -193F, 0F);
		bodyModel[30].rotateAngleZ = 0.34906585F;

		bodyModel[31].addShapeBox(15F, -90.5F, 4F, 26, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core13
		bodyModel[31].setRotationPoint(0F, -193F, 0F);

		bodyModel[32].addShapeBox(-3F, -171F, 20F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core130
		bodyModel[32].setRotationPoint(0F, -193F, 0F);

		bodyModel[33].addShapeBox(-3F, -154F, 20F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core131
		bodyModel[33].setRotationPoint(0F, -193F, 0F);

		bodyModel[34].addShapeBox(-14F, -90F, 62F, 32, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Core132
		bodyModel[34].setRotationPoint(0F, -193F, 0F);

		bodyModel[35].addShapeBox(-30F, -80F, -40F, 60, 6, 80, 0F,3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core133
		bodyModel[35].setRotationPoint(0F, -193F, 0F);

		bodyModel[36].addShapeBox(24F, -74F, 34F, 6, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F); // Core134
		bodyModel[36].setRotationPoint(0F, -193F, 0F);

		bodyModel[37].addShapeBox(32F, -166F, 3.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core135
		bodyModel[37].setRotationPoint(0F, -193F, 0F);

		bodyModel[38].addShapeBox(16F, -120F, -61F, 6, 26, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core136
		bodyModel[38].setRotationPoint(0F, -193F, 0F);

		bodyModel[39].addShapeBox(-34F, -88F, 60F, 70, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Core137
		bodyModel[39].setRotationPoint(0F, -193F, 0F);

		bodyModel[40].addShapeBox(-14F, -128F, 96F, 32, 42, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core138
		bodyModel[40].setRotationPoint(0F, -193F, 0F);

		bodyModel[41].addShapeBox(-18F, -59F, -19F, 36, 17, 10, 0F,-12F, 0F, 0F, -12F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core139
		bodyModel[41].setRotationPoint(0F, -193F, 0F);

		bodyModel[42].addShapeBox(5F, -92F, -25F, 40, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[42].setRotationPoint(0F, -193F, 0F);

		bodyModel[43].addShapeBox(-3F, -154F, 29F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Core140
		bodyModel[43].setRotationPoint(0F, -193F, 0F);

		bodyModel[44].addShapeBox(-3F, -171F, 29F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Core141
		bodyModel[44].setRotationPoint(0F, -193F, 0F);

		bodyModel[45].addShapeBox(-3F, -168F, 32F, 2, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core142
		bodyModel[45].setRotationPoint(0F, -193F, 0F);

		bodyModel[46].addShapeBox(-3F, -157F, 32F, 2, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Core143
		bodyModel[46].setRotationPoint(0F, -193F, 0F);

		bodyModel[47].addShapeBox(-5F, -165F, -30F, 6, 10, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core144
		bodyModel[47].setRotationPoint(0F, -193F, 0F);

		bodyModel[48].addShapeBox(-5F, -165F, -28F, 6, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core145
		bodyModel[48].setRotationPoint(0F, -193F, 0F);

		bodyModel[49].addShapeBox(-5F, -165F, -20F, 6, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core146
		bodyModel[49].setRotationPoint(0F, -193F, 0F);

		bodyModel[50].addShapeBox(-6F, -162F, -28F, 8, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core147
		bodyModel[50].setRotationPoint(0F, -193F, 0F);

		bodyModel[51].addShapeBox(-4F, -167F, -26F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core148
		bodyModel[51].setRotationPoint(0F, -193F, 0F);

		bodyModel[52].addShapeBox(-3F, -171F, -29F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core149
		bodyModel[52].setRotationPoint(0F, -193F, 0F);

		bodyModel[53].addShapeBox(5F, -132F, 25F, 40, 43, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core15
		bodyModel[53].setRotationPoint(0F, -193F, 0F);

		bodyModel[54].addShapeBox(16F, -120F, -51F, 6, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core150
		bodyModel[54].setRotationPoint(0F, -193F, 0F);

		bodyModel[55].addShapeBox(-14F, -128F, 86F, 32, 42, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core151
		bodyModel[55].setRotationPoint(0F, -193F, 0F);

		bodyModel[56].addShapeBox(-34F, -88F, -75F, 70, 10, 15, 0F,-20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core152
		bodyModel[56].setRotationPoint(0F, -193F, 0F);

		bodyModel[57].addShapeBox(-18F, -59F, -9F, 36, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core153
		bodyModel[57].setRotationPoint(0F, -193F, 0F);

		bodyModel[58].addShapeBox(-3F, -154F, -29F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core154
		bodyModel[58].setRotationPoint(0F, -193F, 0F);

		bodyModel[59].addShapeBox(-3F, -171F, -32F, 2, 5, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core155
		bodyModel[59].setRotationPoint(0F, -193F, 0F);

		bodyModel[60].addShapeBox(-3F, -168F, -48F, 2, 5, 16, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core156
		bodyModel[60].setRotationPoint(0F, -193F, 0F);

		bodyModel[61].addShapeBox(-3F, -154F, -32F, 2, 5, 3, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core157
		bodyModel[61].setRotationPoint(0F, -193F, 0F);

		bodyModel[62].addShapeBox(-3F, -157F, -48F, 2, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core158
		bodyModel[62].setRotationPoint(0F, -193F, 0F);

		bodyModel[63].addShapeBox(-18F, -77F, 9F, 36, 18, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F); // Core159
		bodyModel[63].setRotationPoint(0F, -193F, 0F);

		bodyModel[64].addShapeBox(5F, -92F, 15F, 40, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core16
		bodyModel[64].setRotationPoint(0F, -193F, 0F);

		bodyModel[65].addShapeBox(16F, -120F, -69F, 6, 26, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core160
		bodyModel[65].setRotationPoint(0F, -193F, 0F);

		bodyModel[66].addBox(-9F, -118F, 76F, 22, 22, 16, 0F); // Core161
		bodyModel[66].setRotationPoint(0F, -193F, 0F);

		bodyModel[67].addShapeBox(-39F, -136F, -30F, 44, 60, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core162
		bodyModel[67].setRotationPoint(0F, -193F, 0F);

		bodyModel[68].addShapeBox(10F, -161F, -14F, 17, 1, 28, 0F,0F, 0F, 0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -9F, 0F, 3F, -9F, 0F, 0F, 0F); // Core163
		bodyModel[68].setRotationPoint(0F, -193F, 0F);

		bodyModel[69].addShapeBox(0.8F, -165F, 4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core165
		bodyModel[69].setRotationPoint(0F, -193F, 0F);
		bodyModel[69].rotateAngleZ = -0.15707963F;

		bodyModel[70].addShapeBox(0.8F, -165F, -5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core166
		bodyModel[70].setRotationPoint(0F, -193F, 0F);
		bodyModel[70].rotateAngleZ = -0.15707963F;

		bodyModel[71].addShapeBox(-5.2F, -165F, 7F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core167
		bodyModel[71].setRotationPoint(0F, -193F, 0F);
		bodyModel[71].rotateAngleZ = -0.15707963F;

		bodyModel[72].addShapeBox(-10.2F, -165F, 9.8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core168
		bodyModel[72].setRotationPoint(0F, -193F, 0F);
		bodyModel[72].rotateAngleZ = -0.15707963F;

		bodyModel[73].addShapeBox(-14.2F, -164.8F, 12F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core169
		bodyModel[73].setRotationPoint(0F, -193F, 0F);
		bodyModel[73].rotateAngleZ = -0.15707963F;

		bodyModel[74].addShapeBox(42F, -92F, -15F, 3, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core17
		bodyModel[74].setRotationPoint(0F, -193F, 0F);

		bodyModel[75].addShapeBox(-14.2F, -164.8F, -13F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core170
		bodyModel[75].setRotationPoint(0F, -193F, 0F);
		bodyModel[75].rotateAngleZ = -0.15707963F;

		bodyModel[76].addShapeBox(-10.2F, -165F, -10.8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core171
		bodyModel[76].setRotationPoint(0F, -193F, 0F);
		bodyModel[76].rotateAngleZ = -0.15707963F;

		bodyModel[77].addShapeBox(-17F, -128F, -64F, 5, 42, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core172
		bodyModel[77].setRotationPoint(0F, -193F, 0F);

		bodyModel[78].addShapeBox(-6F, -138F, 94F, 17, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core173
		bodyModel[78].setRotationPoint(0F, -193F, 0F);

		bodyModel[79].addShapeBox(5F, -89F, -30F, 40, 12, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core174
		bodyModel[79].setRotationPoint(0F, -193F, 0F);

		bodyModel[80].addShapeBox(-18F, -75F, -9F, 36, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core175
		bodyModel[80].setRotationPoint(0F, -193F, 0F);

		bodyModel[81].addShapeBox(-5.2F, -165F, -8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core176
		bodyModel[81].setRotationPoint(0F, -193F, 0F);
		bodyModel[81].rotateAngleZ = -0.15707963F;

		bodyModel[82].addShapeBox(47F, -139F, -13F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core177
		bodyModel[82].setRotationPoint(0F, -193F, 0F);
		bodyModel[82].rotateAngleZ = 0.2443461F;

		bodyModel[83].addShapeBox(47.5F, -145F, -12.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core178
		bodyModel[83].setRotationPoint(0F, -193F, 0F);
		bodyModel[83].rotateAngleZ = 0.2443461F;

		bodyModel[84].addShapeBox(47.5F, -145F, 11.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core179
		bodyModel[84].setRotationPoint(0F, -193F, 0F);
		bodyModel[84].rotateAngleZ = 0.2443461F;

		bodyModel[85].addShapeBox(5F, -92F, -15F, 9, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core18
		bodyModel[85].setRotationPoint(0F, -193F, 0F);

		bodyModel[86].addShapeBox(47F, -139F, 11F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core180
		bodyModel[86].setRotationPoint(0F, -193F, 0F);
		bodyModel[86].rotateAngleZ = 0.2443461F;

		bodyModel[87].addShapeBox(-52F, -139F, 11F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core181
		bodyModel[87].setRotationPoint(0F, -193F, 0F);
		bodyModel[87].rotateAngleZ = -0.2443461F;

		bodyModel[88].addShapeBox(-51.5F, -145F, 11.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core182
		bodyModel[88].setRotationPoint(0F, -193F, 0F);
		bodyModel[88].rotateAngleZ = -0.2443461F;

		bodyModel[89].addShapeBox(-51.5F, -145F, -12.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core183
		bodyModel[89].setRotationPoint(0F, -193F, 0F);
		bodyModel[89].rotateAngleZ = -0.2443461F;

		bodyModel[90].addShapeBox(-52F, -139F, -13F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core184
		bodyModel[90].setRotationPoint(0F, -193F, 0F);
		bodyModel[90].rotateAngleZ = -0.2443461F;

		bodyModel[91].addShapeBox(-18F, -120F, -51F, 6, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core185
		bodyModel[91].setRotationPoint(0F, -193F, 0F);

		bodyModel[92].addShapeBox(-18F, -77F, -19F, 36, 18, 10, 0F,-12F, 0F, 0F, -12F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core186
		bodyModel[92].setRotationPoint(0F, -193F, 0F);

		bodyModel[93].addShapeBox(-6F, -86F, 94F, 17, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core187
		bodyModel[93].setRotationPoint(0F, -193F, 0F);

		bodyModel[94].addShapeBox(25F, -113F, -2F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core188
		bodyModel[94].setRotationPoint(0F, -193F, 0F);

		bodyModel[95].addShapeBox(-39F, -146F, 15F, 70, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core189
		bodyModel[95].setRotationPoint(0F, -193F, 0F);

		bodyModel[96].addShapeBox(33.5F, -132F, 13F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Core19
		bodyModel[96].setRotationPoint(0F, -193F, 0F);
		bodyModel[96].rotateAngleY = -0.78539816F;

		bodyModel[97].addShapeBox(-39F, -144F, -15F, 70, 8, 30, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core190
		bodyModel[97].setRotationPoint(0F, -193F, 0F);

		bodyModel[98].addBox(-39F, -146F, -15F, 13, 2, 30, 0F); // Core191
		bodyModel[98].setRotationPoint(0F, -193F, 0F);

		bodyModel[99].addShapeBox(-6F, -143F, 94F, 17, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core192
		bodyModel[99].setRotationPoint(0F, -193F, 0F);

		bodyModel[100].addShapeBox(-18F, -120F, -61F, 6, 26, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core193
		bodyModel[100].setRotationPoint(0F, -193F, 0F);

		bodyModel[101].addShapeBox(-22F, -78F, 10F, 44, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Core194
		bodyModel[101].setRotationPoint(0F, -193F, 0F);

		bodyModel[102].addShapeBox(26F, -101F, 3F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core195
		bodyModel[102].setRotationPoint(0F, -193F, 0F);

		bodyModel[103].addShapeBox(-6F, -76F, 94F, 17, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Core196
		bodyModel[103].setRotationPoint(0F, -193F, 0F);

		bodyModel[104].addShapeBox(33F, -107F, -1.5F, 2, 10, 3, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core197
		bodyModel[104].setRotationPoint(0F, -193F, 0F);
		bodyModel[104].rotateAngleZ = 0.06981317F;

		bodyModel[105].addShapeBox(-18F, -120F, -69F, 6, 26, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core198
		bodyModel[105].setRotationPoint(0F, -193F, 0F);

		bodyModel[106].addShapeBox(-22F, -78F, -10F, 44, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core199
		bodyModel[106].setRotationPoint(0F, -193F, 0F);

		bodyModel[107].addShapeBox(32F, -167F, 3.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core2
		bodyModel[107].setRotationPoint(0F, -193F, 0F);

		bodyModel[108].addShapeBox(21.5F, -129F, 15.5F, 6, 8, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Core20
		bodyModel[108].setRotationPoint(0F, -193F, 0F);
		bodyModel[108].rotateAngleY = -0.78539816F;
		bodyModel[108].rotateAngleZ = -0.10471976F;

		bodyModel[109].addShapeBox(26F, -101F, -5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core200
		bodyModel[109].setRotationPoint(0F, -193F, 0F);

		bodyModel[110].addShapeBox(-14F, -137F, -50F, 32, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Core201
		bodyModel[110].setRotationPoint(0F, -193F, 0F);

		bodyModel[111].addShapeBox(-22F, -78F, -22F, 44, 6, 12, 0F,-12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core202
		bodyModel[111].setRotationPoint(0F, -193F, 0F);

		bodyModel[112].addShapeBox(-13F, -73F, -10F, 26, 73, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core203
		bodyModel[112].setRotationPoint(0F, -193F, 0F);

		bodyModel[113].addShapeBox(-14F, -137F, -62F, 32, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core204
		bodyModel[113].setRotationPoint(0F, -193F, 0F);

		bodyModel[114].addShapeBox(-6F, -64F, 48F, 17, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Core205
		bodyModel[114].setRotationPoint(0F, -193F, 0F);

		bodyModel[115].addShapeBox(26.5F, -100.5F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core206
		bodyModel[115].setRotationPoint(0F, -193F, 0F);

		bodyModel[116].addShapeBox(-6F, -150F, 48F, 17, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core207
		bodyModel[116].setRotationPoint(0F, -193F, 0F);

		bodyModel[117].addShapeBox(25.5F, -111.5F, 2F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core208
		bodyModel[117].setRotationPoint(0F, -193F, 0F);

		bodyModel[118].addShapeBox(-13F, -81F, 10F, 26, 80, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Core209
		bodyModel[118].setRotationPoint(0F, -193F, 0F);

		bodyModel[119].addShapeBox(21.5F, -129F, 11.5F, 6, 8, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Core21
		bodyModel[119].setRotationPoint(0F, -193F, 0F);
		bodyModel[119].rotateAngleY = -0.78539816F;
		bodyModel[119].rotateAngleZ = -0.10471976F;

		bodyModel[120].addShapeBox(-14F, -137F, -72F, 32, 12, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core210
		bodyModel[120].setRotationPoint(0F, -193F, 0F);

		bodyModel[121].addShapeBox(-31F, -165F, 7F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core211
		bodyModel[121].setRotationPoint(0F, -193F, 0F);

		bodyModel[122].addShapeBox(-30F, -74F, 18F, 6, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Core212
		bodyModel[122].setRotationPoint(0F, -193F, 0F);

		bodyModel[123].addShapeBox(-14F, -90F, 40F, 32, 14, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core213
		bodyModel[123].setRotationPoint(0F, -193F, 0F);

		bodyModel[124].addShapeBox(13F, -78F, 22F, 8, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core214
		bodyModel[124].setRotationPoint(0F, -193F, 0F);

		bodyModel[125].addShapeBox(-6F, -150F, -64F, 17, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core215
		bodyModel[125].setRotationPoint(0F, -193F, 0F);

		bodyModel[126].addShapeBox(-6F, -155F, 48F, 17, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core216
		bodyModel[126].setRotationPoint(0F, -193F, 0F);

		bodyModel[127].addShapeBox(25F, -113F, 7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core217
		bodyModel[127].setRotationPoint(0F, -193F, 0F);

		bodyModel[128].addShapeBox(-6F, -155F, -64F, 17, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core218
		bodyModel[128].setRotationPoint(0F, -193F, 0F);

		bodyModel[129].addShapeBox(-4F, -152F, 61F, 12, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Core219
		bodyModel[129].setRotationPoint(0F, -193F, 0F);

		bodyModel[130].addShapeBox(-20.5F, -27F, -29F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core22
		bodyModel[130].setRotationPoint(0F, -193F, 0F);

		bodyModel[131].addShapeBox(25.5F, -113.5F, 5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core220
		bodyModel[131].setRotationPoint(0F, -193F, 0F);

		bodyModel[132].addBox(-10F, -119F, -78F, 24, 24, 16, 0F); // Core221
		bodyModel[132].setRotationPoint(0F, -193F, 0F);

		bodyModel[133].addShapeBox(-3F, -147F, 81F, 10, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Core222
		bodyModel[133].setRotationPoint(0F, -193F, 0F);

		bodyModel[134].addShapeBox(25.5F, -113.5F, -7F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core223
		bodyModel[134].setRotationPoint(0F, -193F, 0F);

		bodyModel[135].addBox(-9F, -118F, -94F, 22, 22, 16, 0F); // Core224
		bodyModel[135].setRotationPoint(0F, -193F, 0F);

		bodyModel[136].addShapeBox(-4F, -77F, 62F, 12, 12, 20, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core225
		bodyModel[136].setRotationPoint(0F, -193F, 0F);

		bodyModel[137].addShapeBox(-3F, -80F, 82F, 10, 10, 20, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core226
		bodyModel[137].setRotationPoint(0F, -193F, 0F);

		bodyModel[138].addShapeBox(25.5F, -111.5F, -5F, 2, 2, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core227
		bodyModel[138].setRotationPoint(0F, -193F, 0F);

		bodyModel[139].addShapeBox(-14F, -128F, -116F, 32, 42, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core228
		bodyModel[139].setRotationPoint(0F, -193F, 0F);

		bodyModel[140].addShapeBox(-18F, -30F, -9F, 36, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core23
		bodyModel[140].setRotationPoint(0F, -193F, 0F);

		bodyModel[141].addShapeBox(-6F, -77F, 48F, 17, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core230
		bodyModel[141].setRotationPoint(0F, -193F, 0F);

		bodyModel[142].addShapeBox(-14F, -128F, -106F, 32, 42, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core231
		bodyModel[142].setRotationPoint(0F, -193F, 0F);

		bodyModel[143].addShapeBox(-14F, -128F, -94F, 32, 42, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Core232
		bodyModel[143].setRotationPoint(0F, -193F, 0F);

		bodyModel[144].addShapeBox(-10F, -144F, 110F, 24, 72, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core233
		bodyModel[144].setRotationPoint(0F, -193F, 0F);

		bodyModel[145].addShapeBox(32.5F, -106.5F, -2F, 3, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core234
		bodyModel[145].setRotationPoint(0F, -193F, 0F);
		bodyModel[145].rotateAngleZ = 0.06981317F;

		bodyModel[146].addShapeBox(-34F, -144F, 110F, 24, 72, 10, 0F,0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F); // Core235
		bodyModel[146].setRotationPoint(0F, -193F, 0F);

		bodyModel[147].addShapeBox(32.5F, -105F, -2F, 3, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core236
		bodyModel[147].setRotationPoint(0F, -193F, 0F);
		bodyModel[147].rotateAngleZ = 0.06981317F;

		bodyModel[148].addShapeBox(-6F, -138F, -108F, 17, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core237
		bodyModel[148].setRotationPoint(0F, -193F, 0F);

		bodyModel[149].addShapeBox(14F, -144F, 110F, 24, 72, 10, 0F,0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F); // Core238
		bodyModel[149].setRotationPoint(0F, -193F, 0F);

		bodyModel[150].addShapeBox(32.5F, -103.5F, -2F, 3, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core239
		bodyModel[150].setRotationPoint(0F, -193F, 0F);
		bodyModel[150].rotateAngleZ = 0.06981317F;

		bodyModel[151].addShapeBox(-19F, -119F, 60F, 42, 24, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core24
		bodyModel[151].setRotationPoint(0F, -193F, 0F);

		bodyModel[152].addShapeBox(-6F, -143F, -108F, 17, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core240
		bodyModel[152].setRotationPoint(0F, -193F, 0F);

		bodyModel[153].addShapeBox(32.5F, -102F, -2F, 3, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core241
		bodyModel[153].setRotationPoint(0F, -193F, 0F);
		bodyModel[153].rotateAngleZ = 0.06981317F;

		bodyModel[154].addShapeBox(-6F, -86F, -108F, 17, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core242
		bodyModel[154].setRotationPoint(0F, -193F, 0F);

		bodyModel[155].addShapeBox(-30F, -74F, 34F, 6, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F); // Core243
		bodyModel[155].setRotationPoint(0F, -193F, 0F);

		bodyModel[156].addShapeBox(14F, -73F, 23F, 6, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core244
		bodyModel[156].setRotationPoint(0F, -193F, 0F);

		bodyModel[157].addShapeBox(-14F, -137F, 40F, 32, 12, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core245
		bodyModel[157].setRotationPoint(0F, -193F, 0F);

		bodyModel[158].addShapeBox(-31F, -165F, 2F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core246
		bodyModel[158].setRotationPoint(0F, -193F, 0F);

		bodyModel[159].addShapeBox(32.5F, -100.5F, -2F, 3, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Core247
		bodyModel[159].setRotationPoint(0F, -193F, 0F);
		bodyModel[159].rotateAngleZ = 0.06981317F;

		bodyModel[160].addShapeBox(-6F, -76F, -108F, 17, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Core248
		bodyModel[160].setRotationPoint(0F, -193F, 0F);

		bodyModel[161].addShapeBox(26F, -109F, 2F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Core249
		bodyModel[161].setRotationPoint(0F, -193F, 0F);

		bodyModel[162].addShapeBox(-14F, -90F, -50F, 32, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Core25
		bodyModel[162].setRotationPoint(0F, -193F, 0F);

		bodyModel[163].addShapeBox(-4F, -152F, -82F, 12, 12, 20, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core250
		bodyModel[163].setRotationPoint(0F, -193F, 0F);

		bodyModel[164].addShapeBox(26F, -109F, -7F, 1, 1, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core251
		bodyModel[164].setRotationPoint(0F, -193F, 0F);

		bodyModel[165].addShapeBox(-3F, -147F, -102F, 10, 10, 20, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core252
		bodyModel[165].setRotationPoint(0F, -193F, 0F);

		bodyModel[166].addShapeBox(-77F, -86F, 8F, 7, 2, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core253
		bodyModel[166].setRotationPoint(0F, -193F, 0F);
		bodyModel[166].rotateAngleZ = -0.97738438F;

		bodyModel[167].addShapeBox(-3F, -80F, -101F, 10, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Core254
		bodyModel[167].setRotationPoint(0F, -193F, 0F);

		bodyModel[168].addShapeBox(-71F, -86F, 8F, 2, 2, 1, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Core255
		bodyModel[168].setRotationPoint(0F, -193F, 0F);
		bodyModel[168].rotateAngleZ = -0.97738438F;

		bodyModel[169].addShapeBox(-4F, -77F, -81F, 12, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Core256
		bodyModel[169].setRotationPoint(0F, -193F, 0F);

		bodyModel[170].addShapeBox(-34F, -144F, -118F, 24, 72, 10, 0F,0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F); // Core257
		bodyModel[170].setRotationPoint(0F, -193F, 0F);

		bodyModel[171].addShapeBox(-28F, -107.5F, 8F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core258
		bodyModel[171].setRotationPoint(0F, -193F, 0F);
		bodyModel[171].rotateAngleZ = -0.52359878F;

		bodyModel[172].addShapeBox(-30F, -107F, 7F, 2, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core259
		bodyModel[172].setRotationPoint(0F, -193F, 0F);
		bodyModel[172].rotateAngleZ = -0.61086524F;

		bodyModel[173].addShapeBox(21.5F, -121F, 15.5F, 6, 6, 6, 0F,-2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F); // Core26
		bodyModel[173].setRotationPoint(0F, -193F, 0F);
		bodyModel[173].rotateAngleY = -0.78539816F;
		bodyModel[173].rotateAngleZ = -0.10471976F;

		bodyModel[174].addShapeBox(-10F, -144F, -118F, 24, 72, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core260
		bodyModel[174].setRotationPoint(0F, -193F, 0F);

		bodyModel[175].addShapeBox(14F, -144F, -118F, 24, 72, 10, 0F,0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F); // Core261
		bodyModel[175].setRotationPoint(0F, -193F, 0F);

		bodyModel[176].addShapeBox(-29F, -107F, 6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core262
		bodyModel[176].setRotationPoint(0F, -193F, 0F);
		bodyModel[176].rotateAngleZ = -0.61086524F;

		bodyModel[177].addShapeBox(46F, -122F, 52F, 8, 28, 60, 0F,-8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Core263
		bodyModel[177].setRotationPoint(0F, -193F, 0F);

		bodyModel[178].addShapeBox(-30F, -107F, 8.7F, 2, 5, 1, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F); // Core264
		bodyModel[178].setRotationPoint(0F, -193F, 0F);
		bodyModel[178].rotateAngleZ = -0.61086524F;

		bodyModel[179].addShapeBox(-12F, -160F, 52F, 28, 8, 60, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Core265
		bodyModel[179].setRotationPoint(0F, -193F, 0F);

		bodyModel[180].addShapeBox(-29F, -105F, 6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core266
		bodyModel[180].setRotationPoint(0F, -193F, 0F);
		bodyModel[180].rotateAngleZ = -0.61086524F;

		bodyModel[181].addShapeBox(-30F, -166F, 3F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core267
		bodyModel[181].setRotationPoint(0F, -193F, 0F);

		bodyModel[182].addShapeBox(13.5F, -27F, 22.5F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core268
		bodyModel[182].setRotationPoint(0F, -193F, 0F);

		bodyModel[183].addShapeBox(-24F, -74F, 34F, 16, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Core269
		bodyModel[183].setRotationPoint(0F, -193F, 0F);

		bodyModel[184].addShapeBox(21.5F, -121F, 11.5F, 6, 6, 6, 0F,-2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F); // Core27
		bodyModel[184].setRotationPoint(0F, -193F, 0F);
		bodyModel[184].rotateAngleY = -0.78539816F;
		bodyModel[184].rotateAngleZ = -0.10471976F;

		bodyModel[185].addShapeBox(-14F, -137F, 50F, 32, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core270
		bodyModel[185].setRotationPoint(0F, -193F, 0F);

		bodyModel[186].addShapeBox(-29F, -103F, 6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core271
		bodyModel[186].setRotationPoint(0F, -193F, 0F);
		bodyModel[186].rotateAngleZ = -0.61086524F;

		bodyModel[187].addShapeBox(-12F, -64F, 52F, 28, 8, 60, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core272
		bodyModel[187].setRotationPoint(0F, -193F, 0F);

		bodyModel[188].addShapeBox(-77F, -86F, -9F, 7, 2, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core273
		bodyModel[188].setRotationPoint(0F, -193F, 0F);
		bodyModel[188].rotateAngleZ = -0.97738438F;

		bodyModel[189].addShapeBox(-50F, -122F, 52F, 8, 28, 60, 0F,8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Core274
		bodyModel[189].setRotationPoint(0F, -193F, 0F);

		bodyModel[190].addBox(38F, -119F, 111F, 6, 22, 6, 0F); // Core275
		bodyModel[190].setRotationPoint(0F, -193F, 0F);

		bodyModel[191].addShapeBox(25F, -113F, -10F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core276
		bodyModel[191].setRotationPoint(0F, -193F, 0F);

		bodyModel[192].addBox(-9F, -149F, 111F, 22, 6, 6, 0F); // Core277
		bodyModel[192].setRotationPoint(0F, -193F, 0F);

		bodyModel[193].addShapeBox(-71F, -86F, -9F, 2, 2, 1, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Core278
		bodyModel[193].setRotationPoint(0F, -193F, 0F);
		bodyModel[193].rotateAngleZ = -0.97738438F;

		bodyModel[194].addShapeBox(-28F, -107.5F, -9F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core279
		bodyModel[194].setRotationPoint(0F, -193F, 0F);
		bodyModel[194].rotateAngleZ = -0.52359878F;

		bodyModel[195].addBox(35.5F, -112F, 13F, 2, 4, 7, 0F); // Core28
		bodyModel[195].setRotationPoint(0F, -193F, 0F);
		bodyModel[195].rotateAngleY = -0.78539816F;

		bodyModel[196].addBox(-9F, -72F, 111F, 22, 6, 6, 0F); // Core280
		bodyModel[196].setRotationPoint(0F, -193F, 0F);

		bodyModel[197].addShapeBox(-30F, -107F, -9F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Core281
		bodyModel[197].setRotationPoint(0F, -193F, 0F);
		bodyModel[197].rotateAngleZ = -0.61086524F;

		bodyModel[198].addBox(-39F, -119F, 111F, 6, 22, 6, 0F); // Core282
		bodyModel[198].setRotationPoint(0F, -193F, 0F);

		bodyModel[199].addBox(38F, -119F, -116F, 6, 22, 6, 0F); // Core283
		bodyModel[199].setRotationPoint(0F, -193F, 0F);

		bodyModel[200].addShapeBox(-30F, -107F, -9.7F, 2, 5, 1, 0F,-.4F, 0F, -.3F, -.4F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core284
		bodyModel[200].setRotationPoint(0F, -193F, 0F);
		bodyModel[200].rotateAngleZ = -0.61086524F;

		bodyModel[201].addBox(-9F, -149F, -116F, 22, 6, 6, 0F); // Core285
		bodyModel[201].setRotationPoint(0F, -193F, 0F);

		bodyModel[202].addShapeBox(-29F, -107F, -7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core286
		bodyModel[202].setRotationPoint(0F, -193F, 0F);
		bodyModel[202].rotateAngleZ = -0.61086524F;

		bodyModel[203].addShapeBox(-29F, -105F, -7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core287
		bodyModel[203].setRotationPoint(0F, -193F, 0F);
		bodyModel[203].rotateAngleZ = -0.61086524F;

		bodyModel[204].addBox(-9F, -72F, -116F, 22, 6, 6, 0F); // Core288
		bodyModel[204].setRotationPoint(0F, -193F, 0F);

		bodyModel[205].addShapeBox(-29F, -103F, -7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core289
		bodyModel[205].setRotationPoint(0F, -193F, 0F);
		bodyModel[205].rotateAngleZ = -0.61086524F;

		bodyModel[206].addBox(36F, -112F, -20F, 2, 4, 7, 0F); // Core29
		bodyModel[206].setRotationPoint(0F, -193F, 0F);
		bodyModel[206].rotateAngleY = 0.78539816F;

		bodyModel[207].addBox(-39F, -119F, -116F, 6, 22, 6, 0F); // Core290
		bodyModel[207].setRotationPoint(0F, -193F, 0F);

		bodyModel[208].addShapeBox(-22.5F, -166.5F, 2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core291
		bodyModel[208].setRotationPoint(0F, -193F, 0F);

		bodyModel[209].addShapeBox(-22F, -25F, -10F, 44, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core292
		bodyModel[209].setRotationPoint(0F, -193F, 0F);

		bodyModel[210].addShapeBox(14.5F, -54F, 23.5F, 5, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core293
		bodyModel[210].setRotationPoint(0F, -193F, 0F);

		bodyModel[211].addShapeBox(-14F, -137F, 62F, 32, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Core294
		bodyModel[211].setRotationPoint(0F, -193F, 0F);

		bodyModel[212].addShapeBox(-30F, -74F, -34F, 6, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Core295
		bodyModel[212].setRotationPoint(0F, -193F, 0F);

		bodyModel[213].addShapeBox(-12F, -64F, -111F, 28, 8, 60, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Core296
		bodyModel[213].setRotationPoint(0F, -193F, 0F);

		bodyModel[214].addShapeBox(23F, -101F, 4.5F, 6, 2, 1, 0F,0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, 2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, 2F, 0F, -.2F, 0F); // Core297
		bodyModel[214].setRotationPoint(0F, -194F, 0F);
		bodyModel[214].rotateAngleZ = -0.05235988F;

		bodyModel[215].addShapeBox(29F, -101F, 6F, 2, 2, 2, 0F,.1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F); // Core298
		bodyModel[215].setRotationPoint(0F, -194F, 0F);
		bodyModel[215].rotateAngleZ = -0.05235988F;

		bodyModel[216].addShapeBox(46F, -122F, -111F, 8, 28, 60, 0F,8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Core299
		bodyModel[216].setRotationPoint(0F, -193F, 0F);

		bodyModel[217].addShapeBox(-14F, -90F, 50F, 32, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core3
		bodyModel[217].setRotationPoint(0F, -193F, 0F);

		bodyModel[218].addShapeBox(22F, -121F, -21.5F, 6, 6, 6, 0F,-2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F); // Core30
		bodyModel[218].setRotationPoint(0F, -193F, 0F);
		bodyModel[218].rotateAngleY = 0.78539816F;
		bodyModel[218].rotateAngleZ = -0.10471976F;

		bodyModel[219].addShapeBox(-12F, -160F, -111F, 28, 8, 60, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core300
		bodyModel[219].setRotationPoint(0F, -193F, 0F);

		bodyModel[220].addShapeBox(-17F, -104F, 6.5F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Core301
		bodyModel[220].setRotationPoint(0F, -194F, 0F);
		bodyModel[220].rotateAngleZ = -0.50614548F;

		bodyModel[221].addShapeBox(-50F, -122F, -111F, 8, 28, 60, 0F,-8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Core302
		bodyModel[221].setRotationPoint(0F, -193F, 0F);

		bodyModel[222].addShapeBox(-10F, -105F, 3.5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core303
		bodyModel[222].setRotationPoint(0F, -194F, 0F);
		bodyModel[222].rotateAngleZ = -0.50614548F;

		bodyModel[223].addBox(-10.5F, -103.5F, 7F, 1, 1, 1, 0F); // Core304
		bodyModel[223].setRotationPoint(0F, -194F, 0F);
		bodyModel[223].rotateAngleZ = -0.50614548F;

		bodyModel[224].addBox(24F, -139F, 30F, 16, 6, 16, 0F); // Core305
		bodyModel[224].setRotationPoint(0F, -193F, 0F);

		bodyModel[225].addShapeBox(-10F, -107F, 3.5F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core307
		bodyModel[225].setRotationPoint(0F, -194F, 0F);
		bodyModel[225].rotateAngleZ = -0.50614548F;

		bodyModel[226].addShapeBox(29F, -101F, -8F, 2, 2, 2, 0F,.1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F); // Core308
		bodyModel[226].setRotationPoint(0F, -194F, 0F);
		bodyModel[226].rotateAngleZ = -0.05235988F;

		bodyModel[227].addBox(24F, -81F, 30F, 16, 6, 16, 0F); // Core309
		bodyModel[227].setRotationPoint(0F, -193F, 0F);

		bodyModel[228].addShapeBox(22F, -121F, -17.5F, 6, 6, 6, 0F,-2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F); // Core31
		bodyModel[228].setRotationPoint(0F, -193F, 0F);
		bodyModel[228].rotateAngleY = 0.78539816F;
		bodyModel[228].rotateAngleZ = -0.10471976F;

		bodyModel[229].addBox(24F, -81F, -47F, 16, 6, 16, 0F); // Core310
		bodyModel[229].setRotationPoint(0F, -193F, 0F);

		bodyModel[230].addShapeBox(23F, -101F, -5.5F, 6, 2, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, -2F, 0F, -.2F, 0F); // Core311
		bodyModel[230].setRotationPoint(0F, -194F, 0F);
		bodyModel[230].rotateAngleZ = -0.05235988F;

		bodyModel[231].addShapeBox(-30F, -134F, -25F, 77, 58, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core312
		bodyModel[231].setRotationPoint(0F, -193F, 0F);
		bodyModel[231].rotateAngleZ = 0.61086524F;

		bodyModel[232].addShapeBox(-17F, -104F, -7.5F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Core313
		bodyModel[232].setRotationPoint(0F, -194F, 0F);
		bodyModel[232].rotateAngleZ = -0.50614548F;

		bodyModel[233].addShapeBox(-10F, -105F, -7.5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core314
		bodyModel[233].setRotationPoint(0F, -194F, 0F);
		bodyModel[233].rotateAngleZ = -0.50614548F;

		bodyModel[234].addShapeBox(-44F, -134F, -25F, 14, 58, 50, 0F,0F, -10F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -10F); // Core315
		bodyModel[234].setRotationPoint(0F, -193F, 0F);
		bodyModel[234].rotateAngleZ = 0.61086524F;

		bodyModel[235].addShapeBox(-30F, -74F, -40F, 6, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F); // Core316
		bodyModel[235].setRotationPoint(0F, -193F, 0F);

		bodyModel[236].addShapeBox(-22.5F, -152.5F, 2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core317
		bodyModel[236].setRotationPoint(0F, -193F, 0F);

		bodyModel[237].addShapeBox(-17F, -128F, 48F, 5, 42, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core318
		bodyModel[237].setRotationPoint(0F, -193F, 0F);

		bodyModel[238].addShapeBox(13.5F, -27F, -29F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core319
		bodyModel[238].setRotationPoint(0F, -193F, 0F);

		bodyModel[239].addShapeBox(22F, -129F, -17.5F, 6, 8, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Core32
		bodyModel[239].setRotationPoint(0F, -193F, 0F);
		bodyModel[239].rotateAngleY = 0.78539816F;
		bodyModel[239].rotateAngleZ = -0.10471976F;

		bodyModel[240].addShapeBox(-5F, -119F, -32F, 41, 28, 65, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core320
		bodyModel[240].setRotationPoint(0F, -193F, 0F);
		bodyModel[240].rotateAngleZ = 0.61086524F;

		bodyModel[241].addShapeBox(-20F, -141F, -18F, 71, 7, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core321
		bodyModel[241].setRotationPoint(0F, -193F, 0F);
		bodyModel[241].rotateAngleZ = 0.61086524F;

		bodyModel[242].addBox(-10.5F, -103.5F, -8F, 1, 1, 1, 0F); // Core322
		bodyModel[242].setRotationPoint(0F, -194F, 0F);
		bodyModel[242].rotateAngleZ = -0.50614548F;

		bodyModel[243].addShapeBox(-11F, -107F, 4.5F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core323
		bodyModel[243].setRotationPoint(0F, -194F, 0F);
		bodyModel[243].rotateAngleZ = -0.50614548F;

		bodyModel[244].addShapeBox(-3F, -78F, -33.5F, 8, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core324
		bodyModel[244].setRotationPoint(0F, -193F, 0F);

		bodyModel[245].addShapeBox(-11F, -107F, -6.5F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core325
		bodyModel[245].setRotationPoint(0F, -194F, 0F);
		bodyModel[245].rotateAngleZ = -0.50614548F;

		bodyModel[246].addShapeBox(-2F, -73F, -32.5F, 6, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core326
		bodyModel[246].setRotationPoint(0F, -193F, 0F);

		bodyModel[247].addShapeBox(-10F, -107F, -7.5F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core327
		bodyModel[247].setRotationPoint(0F, -194F, 0F);
		bodyModel[247].rotateAngleZ = -0.50614548F;

		bodyModel[248].addShapeBox(-1.5F, -54F, -32F, 5, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core328
		bodyModel[248].setRotationPoint(0F, -193F, 0F);

		bodyModel[249].addShapeBox(5F, -136F, -30F, 40, 9, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core329
		bodyModel[249].setRotationPoint(0F, -193F, 0F);

		bodyModel[250].addShapeBox(22F, -129F, -21.5F, 6, 8, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Core33
		bodyModel[250].setRotationPoint(0F, -193F, 0F);
		bodyModel[250].rotateAngleY = 0.78539816F;
		bodyModel[250].rotateAngleZ = -0.10471976F;

		bodyModel[251].addShapeBox(-2.5F, -27F, -33F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core330
		bodyModel[251].setRotationPoint(0F, -193F, 0F);

		bodyModel[252].addShapeBox(5F, -132F, -30F, 40, 43, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core331
		bodyModel[252].setRotationPoint(0F, -193F, 0F);

		bodyModel[253].addShapeBox(-2.5F, -27F, 28F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core332
		bodyModel[253].setRotationPoint(0F, -193F, 0F);

		bodyModel[254].addBox(23F, -112F, -1F, 2, 4, 2, 0F); // Core333
		bodyModel[254].setRotationPoint(0F, -193F, 0F);

		bodyModel[255].addShapeBox(-1.5F, -54F, 29F, 5, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core334
		bodyModel[255].setRotationPoint(0F, -193F, 0F);

		bodyModel[256].addShapeBox(-2F, -73F, 28.5F, 6, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core335
		bodyModel[256].setRotationPoint(0F, -193F, 0F);

		bodyModel[257].addBox(20.5F, -111.5F, -2.5F, 3, 3, 5, 0F); // Core336
		bodyModel[257].setRotationPoint(0F, -193F, 0F);

		bodyModel[258].addBox(-78.5F, -90.2F, -1.5F, 10, 2, 3, 0F); // Core337
		bodyModel[258].setRotationPoint(0F, -193F, 0F);
		bodyModel[258].rotateAngleZ = -0.85521133F;

		bodyModel[259].addShapeBox(-3F, -78F, 27.5F, 8, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core338
		bodyModel[259].setRotationPoint(0F, -193F, 0F);

		bodyModel[260].addShapeBox(-30F, -153F, 3F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core339
		bodyModel[260].setRotationPoint(0F, -193F, 0F);

		bodyModel[261].addShapeBox(34F, -132F, -20F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Core34
		bodyModel[261].setRotationPoint(0F, -193F, 0F);
		bodyModel[261].rotateAngleY = 0.78539816F;

		bodyModel[262].addShapeBox(14.5F, -54F, -28F, 5, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core340
		bodyModel[262].setRotationPoint(0F, -193F, 0F);

		bodyModel[263].addShapeBox(-24F, -74F, -40F, 16, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Core341
		bodyModel[263].setRotationPoint(0F, -193F, 0F);

		bodyModel[264].addShapeBox(-22F, -25F, 10F, 44, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Core342
		bodyModel[264].setRotationPoint(0F, -193F, 0F);

		bodyModel[265].addShapeBox(16F, -128F, 48F, 5, 42, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core343
		bodyModel[265].setRotationPoint(0F, -193F, 0F);

		bodyModel[266].addShapeBox(-91.5F, -78.5F, -2F, 2, 2, 4, 0F,.2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F); // Core344
		bodyModel[266].setRotationPoint(0F, -193F, 0F);
		bodyModel[266].rotateAngleZ = -0.99483767F;

		bodyModel[267].addShapeBox(8F, -74F, -41F, 16, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Core345
		bodyModel[267].setRotationPoint(0F, -193F, 1F);

		bodyModel[268].addShapeBox(24F, -74F, -35F, 6, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Core346
		bodyModel[268].setRotationPoint(0F, -193F, 1F);

		bodyModel[269].addShapeBox(24F, -74F, -41F, 6, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F); // Core348
		bodyModel[269].setRotationPoint(0F, -193F, 1F);

		bodyModel[270].addBox(34.5F, -116F, 10F, 1, 12, 12, 0F); // Core35
		bodyModel[270].setRotationPoint(0F, -193F, 0F);
		bodyModel[270].rotateAngleY = -0.78539816F;

		bodyModel[271].addShapeBox(11.5F, -129.5F, -1F, 8, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -.2F, -2.5F, 0F, -.2F, -2.5F, 0F, -.2F, -2.5F, 0F, -.2F); // Core351
		bodyModel[271].setRotationPoint(0F, -193F, -1F);

		bodyModel[272].addBox(21F, -111F, -9F, 2, 2, 18, 0F); // Core355
		bodyModel[272].setRotationPoint(0F, -193F, 0F);

		bodyModel[273].addShapeBox(21F, -111F, 9F, 2, 2, 2, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Core356
		bodyModel[273].setRotationPoint(0F, -193F, 0F);

		bodyModel[274].addShapeBox(-22F, -25F, -22F, 44, 6, 12, 0F,-12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core357
		bodyModel[274].setRotationPoint(0F, -193F, 0F);

		bodyModel[275].addShapeBox(14F, -73F, -28.5F, 6, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core358
		bodyModel[275].setRotationPoint(0F, -193F, 0F);

		bodyModel[276].addShapeBox(-19F, -119F, 52F, 42, 24, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core359
		bodyModel[276].setRotationPoint(0F, -193F, 0F);

		bodyModel[277].addShapeBox(-18F, -40F, 9F, 36, 17, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Core36
		bodyModel[277].setRotationPoint(0F, -193F, 0F);

		bodyModel[278].addShapeBox(-31F, -166F, 3F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core360
		bodyModel[278].setRotationPoint(0F, -193F, 0F);

		bodyModel[279].addBox(21F, -120F, 9F, 2, 9, 2, 0F); // Core361
		bodyModel[279].setRotationPoint(0F, -193F, 0F);

		bodyModel[280].addShapeBox(20.5F, -129F, 8.5F, 3, 9, 3, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core362
		bodyModel[280].setRotationPoint(0F, -193F, 0F);

		bodyModel[281].addShapeBox(20.5F, -129F, -11.5F, 3, 9, 3, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core367
		bodyModel[281].setRotationPoint(0F, -193F, 0F);

		bodyModel[282].addBox(21F, -120F, -11F, 2, 9, 2, 0F); // Core368
		bodyModel[282].setRotationPoint(0F, -193F, 0F);

		bodyModel[283].addShapeBox(21F, -111F, -11F, 2, 2, 2, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Core369
		bodyModel[283].setRotationPoint(0F, -193F, 0F);

		bodyModel[284].addShapeBox(-19.5F, -54F, -28F, 5, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core37
		bodyModel[284].setRotationPoint(0F, -193F, 0F);

		bodyModel[285].addShapeBox(16F, -90F, -15F, 24, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core370
		bodyModel[285].setRotationPoint(0F, -193F, 0F);

		bodyModel[286].addShapeBox(-29F, -22F, -21F, 60, 6, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core371
		bodyModel[286].setRotationPoint(0F, -193F, 0F);

		bodyModel[287].addShapeBox(-29F, -22F, -33F, 60, 6, 12, 0F,-12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core372
		bodyModel[287].setRotationPoint(0F, -193F, 0F);

		bodyModel[288].addShapeBox(-29F, -22F, 23F, 60, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Core373
		bodyModel[288].setRotationPoint(0F, -193F, 0F);

		bodyModel[289].addShapeBox(-14F, -90F, -72F, 32, 14, 10, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core38
		bodyModel[289].setRotationPoint(0F, -193F, 0F);

		bodyModel[290].addShapeBox(16F, -120F, 61F, 6, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core39
		bodyModel[290].setRotationPoint(0F, -193F, 0F);

		bodyModel[291].addShapeBox(-13F, -81F, -14F, 26, 80, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core4
		bodyModel[291].setRotationPoint(0F, -193F, 0F);

		bodyModel[292].addBox(35F, -116F, -22.5F, 1, 12, 12, 0F); // Core40
		bodyModel[292].setRotationPoint(0F, -193F, 0F);
		bodyModel[292].rotateAngleY = 0.78539816F;

		bodyModel[293].addBox(24F, -139F, -47F, 16, 6, 16, 0F); // Core400
		bodyModel[293].setRotationPoint(0F, -193F, 0F);

		bodyModel[294].addShapeBox(34.44F, -126F, 0F, 0, 32, 32, 0F,0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F); // Core41
		bodyModel[294].setRotationPoint(0F, -193F, 0F);
		bodyModel[294].rotateAngleY = -0.78539816F;

		bodyModel[295].addShapeBox(34.95F, -126F, -32.5F, 0, 32, 32, 0F,0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F); // Core42
		bodyModel[295].setRotationPoint(0F, -193F, 0F);
		bodyModel[295].rotateAngleY = 0.78539816F;

		bodyModel[296].addShapeBox(11.5F, -104F, 8F, 1, 4, 1, 0F,.1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F); // Core43
		bodyModel[296].setRotationPoint(0F, -193F, 0F);
		bodyModel[296].rotateAngleZ = -0.2268928F;

		bodyModel[297].addShapeBox(11.5F, -100F, 8F, 1, 6, 1, 0F,.3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F); // Core44
		bodyModel[297].setRotationPoint(0F, -193F, 0F);
		bodyModel[297].rotateAngleZ = -0.2268928F;

		bodyModel[298].addShapeBox(11.5F, -104F, -9F, 1, 4, 1, 0F,.1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F); // Core45
		bodyModel[298].setRotationPoint(0F, -193F, 0F);
		bodyModel[298].rotateAngleZ = -0.2268928F;

		bodyModel[299].addShapeBox(11.5F, -100F, -9F, 1, 6, 1, 0F,.3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F); // Core46
		bodyModel[299].setRotationPoint(0F, -193F, 0F);
		bodyModel[299].rotateAngleZ = -0.2268928F;

		bodyModel[300].addShapeBox(14F, -132F, -25F, 5, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core47
		bodyModel[300].setRotationPoint(0F, -193F, 0F);

		bodyModel[301].addShapeBox(36F, -132F, -25F, 5, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core48
		bodyModel[301].setRotationPoint(0F, -193F, 0F);

		bodyModel[302].addShapeBox(-18F, -40F, -19F, 36, 17, 10, 0F,-12F, 0F, 0F, -12F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core49
		bodyModel[302].setRotationPoint(0F, -193F, 0F);

		bodyModel[303].addShapeBox(32F, -168F, 3.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core5
		bodyModel[303].setRotationPoint(0F, -193F, 0F);

		bodyModel[304].addShapeBox(-20F, -73F, -28.5F, 6, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core50
		bodyModel[304].setRotationPoint(0F, -193F, 0F);

		bodyModel[305].addShapeBox(-14F, -90F, -62F, 32, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core51
		bodyModel[305].setRotationPoint(0F, -193F, 0F);

		bodyModel[306].addShapeBox(16F, -120F, 51F, 6, 26, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core52
		bodyModel[306].setRotationPoint(0F, -193F, 0F);

		bodyModel[307].addShapeBox(36F, -132F, 23F, 5, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core53
		bodyModel[307].setRotationPoint(0F, -193F, 0F);

		bodyModel[308].addShapeBox(-21F, -78F, -29.5F, 8, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[308].setRotationPoint(0F, -193F, 0F);

		bodyModel[309].addShapeBox(16F, -120F, 43F, 6, 26, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core55
		bodyModel[309].setRotationPoint(0F, -193F, 0F);

		bodyModel[310].addShapeBox(-6F, -77F, -64F, 17, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core56
		bodyModel[310].setRotationPoint(0F, -193F, 0F);

		bodyModel[311].addShapeBox(14F, -132F, 23F, 5, 40, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core57
		bodyModel[311].setRotationPoint(0F, -193F, 0F);

		bodyModel[312].addShapeBox(45F, -81F, -26F, 20, 4, 52, 0F,0F, 0F, 0F, -6F, 8F, -5F, -6F, 8F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, 0F); // Core58
		bodyModel[312].setRotationPoint(0F, -193F, 0F);

		bodyModel[313].addShapeBox(45F, -92F, -25F, 4, 3, 50, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Core59
		bodyModel[313].setRotationPoint(0F, -193F, 0F);

		bodyModel[314].addShapeBox(24F, -74F, 18F, 6, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Core6
		bodyModel[314].setRotationPoint(0F, -193F, 0F);

		bodyModel[315].addShapeBox(45F, -136F, -26F, 20, 4, 52, 0F,0F, 0F, 0F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 8F, -5F, -6F, 8F, -5F, 0F, 0F, 0F); // Core60
		bodyModel[315].setRotationPoint(0F, -193F, 0F);

		bodyModel[316].addBox(59F, -124F, -21F, 6, 35, 42, 0F); // Core61
		bodyModel[316].setRotationPoint(0F, -193F, 0F);

		bodyModel[317].addShapeBox(45F, -124F, 26F, 20, 35, 4, 0F,0F, 12F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 12F, 0F); // Core62
		bodyModel[317].setRotationPoint(0F, -193F, 0F);

		bodyModel[318].addShapeBox(45F, -124F, -30F, 20, 35, 4, 0F,0F, 12F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 12F, 0F); // Core63
		bodyModel[318].setRotationPoint(0F, -193F, 0F);

		bodyModel[319].addShapeBox(-39F, -132F, 30F, 79, 50, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core64
		bodyModel[319].setRotationPoint(0F, -193F, 0F);

		bodyModel[320].addShapeBox(40F, -143F, 30F, 8, 78, 16, 0F,0F, 0F, 0F, 6F, -6F, -1F, 6F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Core65
		bodyModel[320].setRotationPoint(0F, -193F, 0F);

		bodyModel[321].addBox(65F, -124F, 17F, 4, 35, 4, 0F); // Core66
		bodyModel[321].setRotationPoint(0F, -193F, 0F);

		bodyModel[322].addShapeBox(-20.5F, -27F, 22.5F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core67
		bodyModel[322].setRotationPoint(0F, -193F, 0F);

		bodyModel[323].addShapeBox(-18F, -120F, 43F, 6, 26, 8, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core68
		bodyModel[323].setRotationPoint(0F, -193F, 0F);

		bodyModel[324].addShapeBox(-18F, -49F, -9F, 36, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core69
		bodyModel[324].setRotationPoint(0F, -193F, 0F);

		bodyModel[325].addShapeBox(-6F, -64F, -64F, 17, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Core70
		bodyModel[325].setRotationPoint(0F, -193F, 0F);

		bodyModel[326].addShapeBox(45F, -140F, 17F, 24, 4, 4, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 12F, 0F, -4F, 12F, 0F, 0F, 0F, 0F); // Core71
		bodyModel[326].setRotationPoint(0F, -193F, 0F);

		bodyModel[327].addShapeBox(45F, -77F, 17F, 24, 4, 4, 0F,0F, 0F, 0F, -4F, 12F, 0F, -4F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Core72
		bodyModel[327].setRotationPoint(0F, -193F, 0F);

		bodyModel[328].addBox(31F, -77F, 17F, 14, 4, 4, 0F); // Core73
		bodyModel[328].setRotationPoint(0F, -193F, 0F);

		bodyModel[329].addBox(31F, -140F, 17F, 14, 4, 4, 0F); // Core74
		bodyModel[329].setRotationPoint(0F, -193F, 0F);

		bodyModel[330].addBox(31F, -140F, -21F, 14, 4, 4, 0F); // Core75
		bodyModel[330].setRotationPoint(0F, -193F, 0F);

		bodyModel[331].addShapeBox(45F, -140F, -21F, 24, 4, 4, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 12F, 0F, -4F, 12F, 0F, 0F, 0F, 0F); // Core76
		bodyModel[331].setRotationPoint(0F, -193F, 0F);

		bodyModel[332].addBox(65F, -124F, -21F, 4, 35, 4, 0F); // Core77
		bodyModel[332].setRotationPoint(0F, -193F, 0F);

		bodyModel[333].addShapeBox(45F, -77F, -21F, 24, 4, 4, 0F,0F, 0F, 0F, -4F, 12F, 0F, -4F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Core78
		bodyModel[333].setRotationPoint(0F, -193F, 0F);

		bodyModel[334].addBox(31F, -77F, -21F, 14, 4, 4, 0F); // Core79
		bodyModel[334].setRotationPoint(0F, -193F, 0F);

		bodyModel[335].addShapeBox(13F, -78F, -29.5F, 8, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core8
		bodyModel[335].setRotationPoint(0F, -193F, 0F);

		bodyModel[336].addShapeBox(16F, -128F, -64F, 5, 42, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core80
		bodyModel[336].setRotationPoint(0F, -193F, 0F);

		bodyModel[337].addShapeBox(-18F, -120F, 61F, 6, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core81
		bodyModel[337].setRotationPoint(0F, -193F, 0F);

		bodyModel[338].addShapeBox(-19.5F, -54F, 23.5F, 5, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core82
		bodyModel[338].setRotationPoint(0F, -193F, 0F);

		bodyModel[339].addShapeBox(-39F, -146F, -30F, 70, 10, 15, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core83
		bodyModel[339].setRotationPoint(0F, -193F, 0F);

		bodyModel[340].addShapeBox(-39F, -132F, -38F, 79, 50, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core84
		bodyModel[340].setRotationPoint(0F, -193F, 0F);

		bodyModel[341].addShapeBox(40F, -143F, -47F, 8, 78, 16, 0F,0F, 0F, 0F, 6F, -6F, -1F, 6F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Core85
		bodyModel[341].setRotationPoint(0F, -193F, 0F);

		bodyModel[342].addShapeBox(-12F, -150F, -11F, 22, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core86
		bodyModel[342].setRotationPoint(0F, -193F, 0F);

		bodyModel[343].addShapeBox(-14F, -156F, -14F, 26, 6, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core87
		bodyModel[343].setRotationPoint(0F, -193F, 0F);

		bodyModel[344].addShapeBox(-14F, -171F, -14F, 20, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core88
		bodyModel[344].setRotationPoint(0F, -193F, 0F);

		bodyModel[345].addShapeBox(-14F, -170F, -14F, 26, 7, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core89
		bodyModel[345].setRotationPoint(0F, -193F, 0F);

		bodyModel[346].addShapeBox(-31F, -154F, 3F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core9
		bodyModel[346].setRotationPoint(0F, -193F, 0F);

		bodyModel[347].addShapeBox(12F, -156F, -14F, 16, 6, 28, 0F,0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, -8F, -2F, 4F, -8F, 0F, 0F, 0F); // Core90
		bodyModel[347].setRotationPoint(0F, -193F, 0F);

		bodyModel[348].addShapeBox(12F, -170F, -14F, 17, 7, 28, 0F,0F, 0F, 0F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -9F, 0F, 3F, -9F, 0F, 0F, 0F); // Core91
		bodyModel[348].setRotationPoint(0F, -193F, 0F);

		bodyModel[349].addShapeBox(6F, -168F, -12F, 6, 12, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core92
		bodyModel[349].setRotationPoint(0F, -193F, 0F);

		bodyModel[350].addShapeBox(-18F, -42F, -9F, 36, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core93
		bodyModel[350].setRotationPoint(0F, -193F, 0F);

		bodyModel[351].addShapeBox(-20F, -73F, 23F, 6, 28, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core94
		bodyModel[351].setRotationPoint(0F, -193F, 0F);

		bodyModel[352].addShapeBox(-19F, -119F, -52F, 42, 24, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Core95
		bodyModel[352].setRotationPoint(0F, -193F, 0F);

		bodyModel[353].addShapeBox(-18F, -120F, 51F, 6, 26, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core96
		bodyModel[353].setRotationPoint(0F, -193F, 0F);

		bodyModel[354].addShapeBox(-22F, -171F, -14F, 8, 23, 28, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Core97
		bodyModel[354].setRotationPoint(0F, -193F, 0F);

		bodyModel[355].addShapeBox(12F, -167F, -12F, 13, 14, 24, 0F,0F, 0F, 0F, 2F, -4F, -8F, 2F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Core98
		bodyModel[355].setRotationPoint(0F, -193F, 0F);

		bodyModel[356].addShapeBox(20F, -153F, -4F, 7, 8, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Core99
		bodyModel[356].setRotationPoint(0F, -193F, 0F);

		bodyModel[357].addBox(44F, -141F, 33F, 8, 3, 3, 0F); // CoreLights1
		bodyModel[357].setRotationPoint(0F, -193F, 0F);

		bodyModel[358].addBox(-37F, -137F, -38F, 8, 3, 3, 0F); // CoreLights10
		bodyModel[358].setRotationPoint(0F, -193F, 0F);

		bodyModel[359].addBox(44F, -141F, 40F, 8, 3, 3, 0F); // CoreLights2
		bodyModel[359].setRotationPoint(0F, -193F, 0F);

		bodyModel[360].addBox(44F, -141F, -37F, 8, 3, 3, 0F); // CoreLights3
		bodyModel[360].setRotationPoint(0F, -193F, 0F);

		bodyModel[361].addBox(44F, -141F, -44F, 8, 3, 3, 0F); // CoreLights4
		bodyModel[361].setRotationPoint(0F, -193F, 0F);

		bodyModel[362].addBox(12F, -167F, -13F, 8, 3, 3, 0F); // CoreLights5
		bodyModel[362].setRotationPoint(0F, -193F, 0F);

		bodyModel[363].addBox(12F, -167F, 10F, 8, 3, 3, 0F); // CoreLights6
		bodyModel[363].setRotationPoint(0F, -193F, 0F);

		bodyModel[364].addBox(-21F, -165F, 10F, 8, 3, 3, 0F); // CoreLights6
		bodyModel[364].setRotationPoint(0F, -193F, 0F);

		bodyModel[365].addBox(-21F, -165F, -13F, 8, 3, 3, 0F); // CoreLights7
		bodyModel[365].setRotationPoint(0F, -193F, 0F);

		bodyModel[366].addBox(-37F, -137F, 31F, 8, 3, 3, 0F); // CoreLights8
		bodyModel[366].setRotationPoint(0F, -193F, 0F);

		bodyModel[367].addBox(-37F, -137F, -34F, 8, 3, 3, 0F); // CoreLights9
		bodyModel[367].setRotationPoint(0F, -193F, 0F);

		bodyModel[368].addBox(-37F, -137F, 35F, 8, 3, 3, 0F); // CoreLights9
		bodyModel[368].setRotationPoint(0F, -193F, 0F);

		bodyModel[369].addShapeBox(54.1F, -194F, 52F, 0, 100, 220, 0F,-8F, -72F, 0F, 8F, -72F, 0F, -8F, -72F, -160F, 8F, -72F, -160F, -8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -160F, 8F, 0F, -160F); // CoreDecal1
		bodyModel[369].setRotationPoint(0F, -193F, 0F);

		bodyModel[370].addShapeBox(54.1F, -194F, -271F, 0, 100, 220, 0F,8F, -72F, -160F, -8F, -72F, -160F, 8F, -72F, 0F, -8F, -72F, 0F, 8F, 0F, -160F, -8F, 0F, -160F, 8F, 0F, 0F, -8F, 0F, 0F); // CoreDecal2
		bodyModel[370].setRotationPoint(0F, -193F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights1
		hipsModel[1] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights2
		hipsModel[2] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights3
		hipsModel[3] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights4
		hipsModel[4] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights5
		hipsModel[5] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights6
		hipsModel[6] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights7
		hipsModel[7] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // HipLights8
		hipsModel[8] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips1
		hipsModel[9] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips10
		hipsModel[10] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips100
		hipsModel[11] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips101
		hipsModel[12] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips102
		hipsModel[13] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips103
		hipsModel[14] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips104
		hipsModel[15] = new ModelRendererTurbo(this, 570, 1228, textureX, textureY); // Hips105
		hipsModel[16] = new ModelRendererTurbo(this, 583, 1385, textureX, textureY); // Hips106
		hipsModel[17] = new ModelRendererTurbo(this, 570, 1228, textureX, textureY); // Hips107
		hipsModel[18] = new ModelRendererTurbo(this, 350, 1390, textureX, textureY); // Hips108
		hipsModel[19] = new ModelRendererTurbo(this, 498, 1289, textureX, textureY); // Hips109
		hipsModel[20] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips11
		hipsModel[21] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips110
		hipsModel[22] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips111
		hipsModel[23] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips112
		hipsModel[24] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips113
		hipsModel[25] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips114
		hipsModel[26] = new ModelRendererTurbo(this, 607, 1342, textureX, textureY); // Hips115
		hipsModel[27] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips116
		hipsModel[28] = new ModelRendererTurbo(this, 26, 1552, textureX, textureY); // Hips117
		hipsModel[29] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips118
		hipsModel[30] = new ModelRendererTurbo(this, 607, 1342, textureX, textureY); // Hips119
		hipsModel[31] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips12
		hipsModel[32] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips120
		hipsModel[33] = new ModelRendererTurbo(this, 25, 1511, textureX, textureY); // Hips121
		hipsModel[34] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips122
		hipsModel[35] = new ModelRendererTurbo(this, 249, 1525, textureX, textureY); // Hips123
		hipsModel[36] = new ModelRendererTurbo(this, 239, 1661, textureX, textureY); // Hips124
		hipsModel[37] = new ModelRendererTurbo(this, 298, 1661, textureX, textureY); // Hips125
		hipsModel[38] = new ModelRendererTurbo(this, 345, 1661, textureX, textureY); // Hips126
		hipsModel[39] = new ModelRendererTurbo(this, 239, 1661, textureX, textureY); // Hips127
		hipsModel[40] = new ModelRendererTurbo(this, 298, 1661, textureX, textureY); // Hips128
		hipsModel[41] = new ModelRendererTurbo(this, 345, 1661, textureX, textureY); // Hips129
		hipsModel[42] = new ModelRendererTurbo(this, 583, 1385, textureX, textureY); // Hips13
		hipsModel[43] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips14
		hipsModel[44] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips15
		hipsModel[45] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips16
		hipsModel[46] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips17
		hipsModel[47] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips18
		hipsModel[48] = new ModelRendererTurbo(this, 12, 1135, textureX, textureY); // Hips19
		hipsModel[49] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips2
		hipsModel[50] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips20
		hipsModel[51] = new ModelRendererTurbo(this, 12, 1032, textureX, textureY); // Hips21
		hipsModel[52] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips22
		hipsModel[53] = new ModelRendererTurbo(this, 12, 1268, textureX, textureY); // Hips23
		hipsModel[54] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips24
		hipsModel[55] = new ModelRendererTurbo(this, 24, 1390, textureX, textureY); // Hips25
		hipsModel[56] = new ModelRendererTurbo(this, 354, 1032, textureX, textureY); // Hips26
		hipsModel[57] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips27
		hipsModel[58] = new ModelRendererTurbo(this, 348, 1161, textureX, textureY); // Hips28
		hipsModel[59] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips29
		hipsModel[60] = new ModelRendererTurbo(this, 26, 1661, textureX, textureY); // Hips3
		hipsModel[61] = new ModelRendererTurbo(this, 583, 1420, textureX, textureY); // Hips30
		hipsModel[62] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips31
		hipsModel[63] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips32
		hipsModel[64] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips33
		hipsModel[65] = new ModelRendererTurbo(this, 484, 1043, textureX, textureY); // Hips34
		hipsModel[66] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips35
		hipsModel[67] = new ModelRendererTurbo(this, 25, 1511, textureX, textureY); // Hips36
		hipsModel[68] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips37
		hipsModel[69] = new ModelRendererTurbo(this, 26, 1552, textureX, textureY); // Hips38
		hipsModel[70] = new ModelRendererTurbo(this, 93, 1661, textureX, textureY); // Hips39
		hipsModel[71] = new ModelRendererTurbo(this, 93, 1661, textureX, textureY); // Hips4
		hipsModel[72] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // Hips40
		hipsModel[73] = new ModelRendererTurbo(this, 320, 1283, textureX, textureY); // Hips41
		hipsModel[74] = new ModelRendererTurbo(this, 26, 1661, textureX, textureY); // Hips42
		hipsModel[75] = new ModelRendererTurbo(this, 542, 1180, textureX, textureY); // Hips43
		hipsModel[76] = new ModelRendererTurbo(this, 152, 1542, textureX, textureY); // Hips44
		hipsModel[77] = new ModelRendererTurbo(this, 262, 1560, textureX, textureY); // Hips45
		hipsModel[78] = new ModelRendererTurbo(this, 542, 1180, textureX, textureY); // Hips46
		hipsModel[79] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips47
		hipsModel[80] = new ModelRendererTurbo(this, 320, 1283, textureX, textureY); // Hips48
		hipsModel[81] = new ModelRendererTurbo(this, 357, 1560, textureX, textureY); // Hips49
		hipsModel[82] = new ModelRendererTurbo(this, 152, 1542, textureX, textureY); // Hips5
		hipsModel[83] = new ModelRendererTurbo(this, 542, 1180, textureX, textureY); // Hips50
		hipsModel[84] = new ModelRendererTurbo(this, 583, 1449, textureX, textureY); // Hips51
		hipsModel[85] = new ModelRendererTurbo(this, 357, 1560, textureX, textureY); // Hips52
		hipsModel[86] = new ModelRendererTurbo(this, 542, 1180, textureX, textureY); // Hips53
		hipsModel[87] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips54
		hipsModel[88] = new ModelRendererTurbo(this, 320, 1283, textureX, textureY); // Hips55
		hipsModel[89] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips56
		hipsModel[90] = new ModelRendererTurbo(this, 320, 1283, textureX, textureY); // Hips57
		hipsModel[91] = new ModelRendererTurbo(this, 320, 1283, textureX, textureY); // Hips58
		hipsModel[92] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips59
		hipsModel[93] = new ModelRendererTurbo(this, 262, 1560, textureX, textureY); // Hips6
		hipsModel[94] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips60
		hipsModel[95] = new ModelRendererTurbo(this, 320, 1283, textureX, textureY); // Hips61
		hipsModel[96] = new ModelRendererTurbo(this, 570, 1228, textureX, textureY); // Hips62
		hipsModel[97] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips63
		hipsModel[98] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips64
		hipsModel[99] = new ModelRendererTurbo(this, 350, 1390, textureX, textureY); // Hips65
		hipsModel[100] = new ModelRendererTurbo(this, 391, 1289, textureX, textureY); // Hips66
		hipsModel[101] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips67
		hipsModel[102] = new ModelRendererTurbo(this, 570, 1228, textureX, textureY); // Hips68
		hipsModel[103] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips69
		hipsModel[104] = new ModelRendererTurbo(this, 357, 1560, textureX, textureY); // Hips7
		hipsModel[105] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips70
		hipsModel[106] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips71
		hipsModel[107] = new ModelRendererTurbo(this, 583, 1449, textureX, textureY); // Hips72
		hipsModel[108] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips73
		hipsModel[109] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips74
		hipsModel[110] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips75
		hipsModel[111] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips76
		hipsModel[112] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips77
		hipsModel[113] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips78
		hipsModel[114] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips79
		hipsModel[115] = new ModelRendererTurbo(this, 357, 1560, textureX, textureY); // Hips8
		hipsModel[116] = new ModelRendererTurbo(this, 481, 1229, textureX, textureY); // Hips80
		hipsModel[117] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips81
		hipsModel[118] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips82
		hipsModel[119] = new ModelRendererTurbo(this, 398, 1565, textureX, textureY); // Hips83
		hipsModel[120] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips84
		hipsModel[121] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips85
		hipsModel[122] = new ModelRendererTurbo(this, 249, 1525, textureX, textureY); // Hips86
		hipsModel[123] = new ModelRendererTurbo(this, 481, 1390, textureX, textureY); // Hips87
		hipsModel[124] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips88
		hipsModel[125] = new ModelRendererTurbo(this, 249, 1525, textureX, textureY); // Hips89
		hipsModel[126] = new ModelRendererTurbo(this, 357, 1531, textureX, textureY); // Hips9
		hipsModel[127] = new ModelRendererTurbo(this, 607, 1342, textureX, textureY); // Hips90
		hipsModel[128] = new ModelRendererTurbo(this, 249, 1525, textureX, textureY); // Hips91
		hipsModel[129] = new ModelRendererTurbo(this, 583, 1420, textureX, textureY); // Hips92
		hipsModel[130] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips93
		hipsModel[131] = new ModelRendererTurbo(this, 249, 1525, textureX, textureY); // Hips94
		hipsModel[132] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips96
		hipsModel[133] = new ModelRendererTurbo(this, 607, 1342, textureX, textureY); // Hips97
		hipsModel[134] = new ModelRendererTurbo(this, 249, 1525, textureX, textureY); // Hips98
		hipsModel[135] = new ModelRendererTurbo(this, 607, 1307, textureX, textureY); // Hips99
		hipsModel[136] = new ModelRendererTurbo(this, 485, 1127, textureX, textureY); // LeftLeg96

		hipsModel[0].addBox(55F, -15F, -22F, 8, 3, 3, 0F); // HipLights1
		hipsModel[0].setRotationPoint(0F, -193F, 0F);

		hipsModel[1].addBox(55F, -15F, 19F, 8, 3, 3, 0F); // HipLights2
		hipsModel[1].setRotationPoint(0F, -193F, 0F);

		hipsModel[2].addBox(46F, 34F, -22F, 8, 3, 3, 0F); // HipLights3
		hipsModel[2].setRotationPoint(0F, -193F, 0F);

		hipsModel[3].addBox(46F, 34F, 19F, 8, 3, 3, 0F); // HipLights4
		hipsModel[3].setRotationPoint(0F, -193F, 0F);

		hipsModel[4].addBox(62F, -2F, -32F, 8, 3, 3, 0F); // HipLights5
		hipsModel[4].setRotationPoint(0F, -193F, 0F);
		hipsModel[4].rotateAngleZ = 0.36651914F;

		hipsModel[5].addBox(62F, -2F, -62F, 8, 3, 3, 0F); // HipLights6
		hipsModel[5].setRotationPoint(0F, -193F, 0F);
		hipsModel[5].rotateAngleZ = 0.36651914F;

		hipsModel[6].addBox(62F, -2F, 29F, 8, 3, 3, 0F); // HipLights7
		hipsModel[6].setRotationPoint(0F, -193F, 0F);
		hipsModel[6].rotateAngleZ = 0.36651914F;

		hipsModel[7].addBox(62F, -2F, 59F, 8, 3, 3, 0F); // HipLights8
		hipsModel[7].setRotationPoint(0F, -193F, 0F);
		hipsModel[7].rotateAngleZ = 0.36651914F;

		hipsModel[8].addShapeBox(-54F, 30F, -38F, 14, 6, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Hips1
		hipsModel[8].setRotationPoint(0F, -193F, 0F);

		hipsModel[9].addShapeBox(78F, 73F, 39F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips10
		hipsModel[9].setRotationPoint(0F, -193F, 0F);
		hipsModel[9].rotateAngleZ = 0.36651914F;

		hipsModel[10].addShapeBox(-84F, 5F, -35F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips100
		hipsModel[10].setRotationPoint(0F, -193F, 0F);
		hipsModel[10].rotateAngleZ = -0.54105207F;

		hipsModel[11].addShapeBox(-84F, 5F, -51.5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips101
		hipsModel[11].setRotationPoint(0F, -193F, 0F);
		hipsModel[11].rotateAngleZ = -0.54105207F;

		hipsModel[12].addShapeBox(-84F, 5F, -68F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips102
		hipsModel[12].setRotationPoint(0F, -193F, 0F);
		hipsModel[12].rotateAngleZ = -0.54105207F;

		hipsModel[13].addShapeBox(-87F, 5F, -68F, 3, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips103
		hipsModel[13].setRotationPoint(0F, -193F, 0F);
		hipsModel[13].rotateAngleZ = -0.54105207F;

		hipsModel[14].addShapeBox(-70F, 5F, -68F, 3, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips104
		hipsModel[14].setRotationPoint(0F, -193F, 0F);
		hipsModel[14].rotateAngleZ = -0.54105207F;

		hipsModel[15].addShapeBox(-67F, 11F, -63F, 16, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips105
		hipsModel[15].setRotationPoint(0F, -193F, 0F);
		hipsModel[15].rotateAngleZ = -0.54105207F;

		hipsModel[16].addBox(-30F, 43F, -51F, 15, 15, 13, 0F); // Hips106
		hipsModel[16].setRotationPoint(0F, -193F, 0F);
		hipsModel[16].rotateAngleZ = -0.57595865F;

		hipsModel[17].addShapeBox(-51F, 11F, -63F, 5, 20, 26, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Hips107
		hipsModel[17].setRotationPoint(0F, -193F, 0F);
		hipsModel[17].rotateAngleZ = -0.54105207F;

		hipsModel[18].addShapeBox(-87F, 11F, -68F, 20, 62, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips108
		hipsModel[18].setRotationPoint(0F, -193F, 0F);
		hipsModel[18].rotateAngleZ = -0.54105207F;

		hipsModel[19].addShapeBox(-67F, 31F, -68F, 8, 42, 36, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips109
		hipsModel[19].setRotationPoint(0F, -193F, 0F);
		hipsModel[19].rotateAngleZ = -0.54105207F;

		hipsModel[20].addShapeBox(78F, 55F, 39F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips11
		hipsModel[20].setRotationPoint(0F, -193F, 0F);
		hipsModel[20].rotateAngleZ = 0.36651914F;

		hipsModel[21].addShapeBox(-87F, 73F, -68F, 4, 13, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F); // Hips110
		hipsModel[21].setRotationPoint(0F, -193F, 0F);
		hipsModel[21].rotateAngleZ = -0.54105207F;

		hipsModel[22].addShapeBox(-63F, 73F, -68F, 4, 13, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Hips111
		hipsModel[22].setRotationPoint(0F, -193F, 0F);
		hipsModel[22].rotateAngleZ = -0.54105207F;

		hipsModel[23].addShapeBox(-81F, 72F, -34F, 20, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips112
		hipsModel[23].setRotationPoint(-2F, -193F, 0F);
		hipsModel[23].rotateAngleZ = -0.54105207F;

		hipsModel[24].addShapeBox(-82F, 72F, -68F, 20, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips113
		hipsModel[24].setRotationPoint(-1F, -193F, 0F);
		hipsModel[24].rotateAngleZ = -0.54105207F;

		hipsModel[25].addShapeBox(-80.5F, 71F, -66F, 15, 13, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips114
		hipsModel[25].setRotationPoint(0F, -193F, 0F);
		hipsModel[25].rotateAngleZ = -0.54105207F;

		hipsModel[26].addShapeBox(-80.5F, 71F, -61F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips115
		hipsModel[26].setRotationPoint(0F, -193F, 0F);
		hipsModel[26].rotateAngleZ = -0.54105207F;

		hipsModel[27].addShapeBox(-80.5F, 71F, -56F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F); // Hips116
		hipsModel[27].setRotationPoint(0F, -193F, 0F);
		hipsModel[27].rotateAngleZ = -0.54105207F;

		hipsModel[28].addShapeBox(53F, 1F, 26F, 17, 53, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips117
		hipsModel[28].setRotationPoint(0F, -193F, 0F);
		hipsModel[28].rotateAngleZ = 0.36651914F;

		hipsModel[29].addShapeBox(-80.5F, 71F, -50F, 15, 13, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips118
		hipsModel[29].setRotationPoint(0F, -193F, 0F);
		hipsModel[29].rotateAngleZ = -0.54105207F;

		hipsModel[30].addShapeBox(-80.5F, 71F, -45F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips119
		hipsModel[30].setRotationPoint(0F, -193F, 0F);
		hipsModel[30].rotateAngleZ = -0.54105207F;

		hipsModel[31].addShapeBox(78F, 36F, 39F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips12
		hipsModel[31].setRotationPoint(0F, -193F, 0F);
		hipsModel[31].rotateAngleZ = 0.36651914F;

		hipsModel[32].addShapeBox(-80.5F, 71F, -40F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F); // Hips120
		hipsModel[32].setRotationPoint(0F, -193F, 0F);
		hipsModel[32].rotateAngleZ = -0.54105207F;

		hipsModel[33].addBox(43F, 1F, 26F, 10, 14, 13, 0F); // Hips121
		hipsModel[33].setRotationPoint(0F, -193F, 0F);
		hipsModel[33].rotateAngleZ = 0.36651914F;

		hipsModel[34].addShapeBox(40F, 2F, -40F, 10, 5, 80, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips122
		hipsModel[34].setRotationPoint(0F, -193F, 0F);

		hipsModel[35].addShapeBox(49F, 22F, -80F, 26, 11, 6, 0F,0F, 0F, 0F, 3.5F, -8F, 0F, 3.5F, -8F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 3.5F, 0F, 0F); // Hips123
		hipsModel[35].setRotationPoint(0F, -193F, 0F);
		hipsModel[35].rotateAngleZ = 0.36651914F;

		hipsModel[36].addBox(40F, 1F, 26F, 10, 12, 12, 0F); // Hips124
		hipsModel[36].setRotationPoint(0F, -193F, 0F);

		hipsModel[37].addBox(50F, 2F, 27F, 5, 10, 10, 0F); // Hips125
		hipsModel[37].setRotationPoint(0F, -193F, 0F);

		hipsModel[38].addBox(54F, 3F, 28F, 8, 8, 8, 0F); // Hips126
		hipsModel[38].setRotationPoint(0F, -193F, 0F);

		hipsModel[39].addBox(40F, 1F, -38F, 10, 12, 12, 0F); // Hips127
		hipsModel[39].setRotationPoint(0F, -193F, 0F);

		hipsModel[40].addBox(50F, 2F, -37F, 5, 10, 10, 0F); // Hips128
		hipsModel[40].setRotationPoint(0F, -193F, 0F);

		hipsModel[41].addBox(54F, 3F, -36F, 8, 8, 8, 0F); // Hips129
		hipsModel[41].setRotationPoint(0F, -193F, 0F);

		hipsModel[42].addBox(-30F, 43F, 38F, 15, 15, 13, 0F); // Hips13
		hipsModel[42].setRotationPoint(0F, -193F, 0F);
		hipsModel[42].rotateAngleZ = -0.57595865F;

		hipsModel[43].addShapeBox(76F, 24F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips14
		hipsModel[43].setRotationPoint(0F, -193F, 0F);
		hipsModel[43].rotateAngleZ = 0.36651914F;

		hipsModel[44].addShapeBox(76F, 27F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips15
		hipsModel[44].setRotationPoint(0F, -193F, 0F);
		hipsModel[44].rotateAngleZ = 0.36651914F;

		hipsModel[45].addShapeBox(76F, 30F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips16
		hipsModel[45].setRotationPoint(0F, -193F, 0F);
		hipsModel[45].rotateAngleZ = 0.36651914F;

		hipsModel[46].addShapeBox(76F, 33F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips17
		hipsModel[46].setRotationPoint(0F, -193F, 0F);
		hipsModel[46].rotateAngleZ = 0.36651914F;

		hipsModel[47].addShapeBox(76F, 50F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips18
		hipsModel[47].setRotationPoint(0F, -193F, 0F);
		hipsModel[47].rotateAngleZ = 0.36651914F;

		hipsModel[48].addShapeBox(-36F, -10F, -42F, 75, 35, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips19
		hipsModel[48].setRotationPoint(0F, -193F, 0F);

		hipsModel[49].addShapeBox(-54F, 24F, -38F, 14, 6, 76, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips2
		hipsModel[49].setRotationPoint(0F, -193F, 0F);

		hipsModel[50].addShapeBox(76F, 47F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips20
		hipsModel[50].setRotationPoint(0F, -193F, 0F);
		hipsModel[50].rotateAngleZ = 0.36651914F;

		hipsModel[51].addShapeBox(-36F, -16F, -42F, 75, 6, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips21
		hipsModel[51].setRotationPoint(0F, -193F, 0F);

		hipsModel[52].addShapeBox(76F, 44F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips22
		hipsModel[52].setRotationPoint(0F, -193F, 0F);
		hipsModel[52].rotateAngleZ = 0.36651914F;

		hipsModel[53].addShapeBox(-36F, 25F, -42F, 75, 20, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Hips23
		hipsModel[53].setRotationPoint(0F, -193F, 0F);

		hipsModel[54].addShapeBox(76F, 41F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips24
		hipsModel[54].setRotationPoint(0F, -193F, 0F);
		hipsModel[54].rotateAngleZ = 0.36651914F;

		hipsModel[55].addShapeBox(-44F, -10F, -23F, 85, 58, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips25
		hipsModel[55].setRotationPoint(0F, -193F, 0F);

		hipsModel[56].addShapeBox(41F, -22F, -23F, 14, 70, 46, 0F,0F, 0F, 0F, 6F, -10F, 0F, 6F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Hips26
		hipsModel[56].setRotationPoint(0F, -193F, 0F);

		hipsModel[57].addShapeBox(76F, 69F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips27
		hipsModel[57].setRotationPoint(0F, -193F, 0F);
		hipsModel[57].rotateAngleZ = 0.36651914F;

		hipsModel[58].addShapeBox(-60F, -10F, -23F, 16, 58, 46, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Hips28
		hipsModel[58].setRotationPoint(0F, -193F, 0F);

		hipsModel[59].addShapeBox(76F, 66F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips29
		hipsModel[59].setRotationPoint(0F, -193F, 0F);
		hipsModel[59].rotateAngleZ = 0.36651914F;

		hipsModel[60].addShapeBox(53F, 1F, 65F, 17, 53, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips3
		hipsModel[60].setRotationPoint(0F, -193F, 0F);
		hipsModel[60].rotateAngleZ = 0.36651914F;

		hipsModel[61].addBox(-45F, 46F, 39F, 15, 10, 10, 0F); // Hips30
		hipsModel[61].setRotationPoint(0F, -193F, 0F);
		hipsModel[61].rotateAngleZ = -0.57595865F;

		hipsModel[62].addShapeBox(43F, -15F, -40F, 10, 5, 80, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips31
		hipsModel[62].setRotationPoint(0F, -193F, 0F);

		hipsModel[63].addShapeBox(76F, 63F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips32
		hipsModel[63].setRotationPoint(0F, -193F, 0F);
		hipsModel[63].rotateAngleZ = 0.36651914F;

		hipsModel[64].addShapeBox(76F, 60F, 39F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips33
		hipsModel[64].setRotationPoint(0F, -193F, 0F);
		hipsModel[64].rotateAngleZ = 0.36651914F;

		hipsModel[65].addShapeBox(39F, -37F, -18F, 19, 36, 36, 0F,0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips34
		hipsModel[65].setRotationPoint(0F, -193F, 0F);

		hipsModel[66].addShapeBox(-54F, 5F, -38F, 14, 6, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Hips35
		hipsModel[66].setRotationPoint(0F, -193F, 0F);

		hipsModel[67].addBox(43F, 1F, -39F, 10, 14, 13, 0F); // Hips36
		hipsModel[67].setRotationPoint(0F, -193F, 0F);
		hipsModel[67].rotateAngleZ = 0.36651914F;

		hipsModel[68].addShapeBox(-54F, -1F, -38F, 14, 6, 76, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips37
		hipsModel[68].setRotationPoint(0F, -193F, 0F);

		hipsModel[69].addShapeBox(53F, 1F, -65F, 17, 53, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips38
		hipsModel[69].setRotationPoint(0F, -193F, 0F);
		hipsModel[69].rotateAngleZ = 0.36651914F;

		hipsModel[70].addShapeBox(53F, 54F, -74F, 17, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips39
		hipsModel[70].setRotationPoint(0F, -193F, 0F);
		hipsModel[70].rotateAngleZ = 0.36651914F;

		hipsModel[71].addShapeBox(53F, 54F, 26F, 17, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Hips4
		hipsModel[71].setRotationPoint(0F, -193F, 0F);
		hipsModel[71].rotateAngleZ = 0.36651914F;

		hipsModel[72].addShapeBox(43F, -10F, -40F, 10, 5, 80, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips40
		hipsModel[72].setRotationPoint(0F, -193F, 0F);

		hipsModel[73].addShapeBox(-47F, -52F, 26F, 16, 32, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips41
		hipsModel[73].setRotationPoint(0F, -193F, 0F);
		hipsModel[73].rotateAngleZ = 0.6981317F;

		hipsModel[74].addShapeBox(53F, 1F, -74F, 17, 53, 9, 0F,0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips42
		hipsModel[74].setRotationPoint(0F, -193F, 0F);
		hipsModel[74].rotateAngleZ = 0.36651914F;

		hipsModel[75].addShapeBox(-46F, -51F, 25F, 14, 6, 20, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips43
		hipsModel[75].setRotationPoint(0F, -193F, 0F);
		hipsModel[75].rotateAngleZ = 0.6981317F;

		hipsModel[76].addShapeBox(70F, 1F, -65F, 6, 65, 39, 0F,0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F); // Hips44
		hipsModel[76].setRotationPoint(0F, -193F, 0F);
		hipsModel[76].rotateAngleZ = 0.36651914F;

		hipsModel[77].addShapeBox(61F, 13F, -57F, 17, 58, 22, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Hips45
		hipsModel[77].setRotationPoint(0F, -193F, 0F);
		hipsModel[77].rotateAngleZ = 0.36651914F;

		hipsModel[78].addShapeBox(-46F, -45F, 25F, 14, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Hips46
		hipsModel[78].setRotationPoint(0F, -193F, 0F);
		hipsModel[78].rotateAngleZ = 0.6981317F;

		hipsModel[79].addShapeBox(78F, 19F, -53F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips47
		hipsModel[79].setRotationPoint(0F, -193F, 0F);
		hipsModel[79].rotateAngleZ = 0.36651914F;

		hipsModel[80].addShapeBox(-47F, -52F, -36F, 16, 32, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips48
		hipsModel[80].setRotationPoint(0F, -193F, 0F);
		hipsModel[80].rotateAngleZ = 0.6981317F;

		hipsModel[81].addShapeBox(78F, 19F, -39F, 7, 58, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips49
		hipsModel[81].setRotationPoint(0F, -193F, 0F);
		hipsModel[81].rotateAngleZ = 0.36651914F;

		hipsModel[82].addShapeBox(70F, 1F, 26F, 6, 65, 39, 0F,0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F); // Hips5
		hipsModel[82].setRotationPoint(0F, -193F, 0F);
		hipsModel[82].rotateAngleZ = 0.36651914F;

		hipsModel[83].addShapeBox(-46F, -44F, -45F, 14, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Hips50
		hipsModel[83].setRotationPoint(0F, -193F, 0F);
		hipsModel[83].rotateAngleZ = 0.6981317F;

		hipsModel[84].addBox(-60F, 46.5F, 39.5F, 15, 9, 9, 0F); // Hips51
		hipsModel[84].setRotationPoint(0F, -193F, 0F);
		hipsModel[84].rotateAngleZ = -0.57595865F;

		hipsModel[85].addShapeBox(78F, 19F, -57F, 7, 58, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips52
		hipsModel[85].setRotationPoint(0F, -193F, 0F);
		hipsModel[85].rotateAngleZ = 0.36651914F;

		hipsModel[86].addShapeBox(-46F, -51F, -45F, 14, 7, 20, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips53
		hipsModel[86].setRotationPoint(0F, -193F, 0F);
		hipsModel[86].rotateAngleZ = 0.6981317F;

		hipsModel[87].addShapeBox(78F, 73F, -53F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips54
		hipsModel[87].setRotationPoint(0F, -193F, 0F);
		hipsModel[87].rotateAngleZ = 0.36651914F;

		hipsModel[88].addShapeBox(-47F, -54F, 26F, 16, 2, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips55
		hipsModel[88].setRotationPoint(0F, -193F, 0F);
		hipsModel[88].rotateAngleZ = 0.6981317F;

		hipsModel[89].addShapeBox(78F, 55F, -53F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips56
		hipsModel[89].setRotationPoint(0F, -193F, 0F);
		hipsModel[89].rotateAngleZ = 0.36651914F;

		hipsModel[90].addShapeBox(-47F, -20F, 26F, 16, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips57
		hipsModel[90].setRotationPoint(0F, -193F, 0F);
		hipsModel[90].rotateAngleZ = 0.6981317F;

		hipsModel[91].addShapeBox(-47F, -20F, -36F, 16, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips58
		hipsModel[91].setRotationPoint(0F, -193F, 0F);
		hipsModel[91].rotateAngleZ = 0.6981317F;

		hipsModel[92].addShapeBox(78F, 36F, -53F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips59
		hipsModel[92].setRotationPoint(0F, -193F, 0F);
		hipsModel[92].rotateAngleZ = 0.36651914F;

		hipsModel[93].addShapeBox(61F, 13F, 35F, 17, 58, 22, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Hips6
		hipsModel[93].setRotationPoint(0F, -193F, 0F);
		hipsModel[93].rotateAngleZ = 0.36651914F;

		hipsModel[94].addShapeBox(76F, 24F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips60
		hipsModel[94].setRotationPoint(0F, -193F, 0F);
		hipsModel[94].rotateAngleZ = 0.36651914F;

		hipsModel[95].addShapeBox(-47F, -54F, -36F, 16, 2, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips61
		hipsModel[95].setRotationPoint(0F, -193F, 0F);
		hipsModel[95].rotateAngleZ = 0.6981317F;

		hipsModel[96].addShapeBox(-68F, 11F, 37F, 16, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips62
		hipsModel[96].setRotationPoint(0F, -193F, 0F);
		hipsModel[96].rotateAngleZ = -0.54105207F;

		hipsModel[97].addShapeBox(76F, 27F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips63
		hipsModel[97].setRotationPoint(0F, -193F, 0F);
		hipsModel[97].rotateAngleZ = 0.36651914F;

		hipsModel[98].addShapeBox(76F, 30F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips64
		hipsModel[98].setRotationPoint(0F, -193F, 0F);
		hipsModel[98].rotateAngleZ = 0.36651914F;

		hipsModel[99].addShapeBox(-88F, 11F, 32F, 20, 62, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips65
		hipsModel[99].setRotationPoint(0F, -193F, 0F);
		hipsModel[99].rotateAngleZ = -0.54105207F;

		hipsModel[100].addShapeBox(-68F, 31F, 32F, 8, 42, 36, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips66
		hipsModel[100].setRotationPoint(0F, -193F, 0F);
		hipsModel[100].rotateAngleZ = -0.54105207F;

		hipsModel[101].addShapeBox(76F, 33F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips67
		hipsModel[101].setRotationPoint(0F, -193F, 0F);
		hipsModel[101].rotateAngleZ = 0.36651914F;

		hipsModel[102].addShapeBox(-52F, 11F, 37F, 5, 20, 26, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Hips68
		hipsModel[102].setRotationPoint(0F, -193F, 0F);
		hipsModel[102].rotateAngleZ = -0.54105207F;

		hipsModel[103].addShapeBox(76F, 41F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips69
		hipsModel[103].setRotationPoint(0F, -193F, 0F);
		hipsModel[103].rotateAngleZ = 0.36651914F;

		hipsModel[104].addShapeBox(78F, 19F, 35F, 7, 58, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips7
		hipsModel[104].setRotationPoint(0F, -193F, 0F);
		hipsModel[104].rotateAngleZ = 0.36651914F;

		hipsModel[105].addShapeBox(76F, 44F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips70
		hipsModel[105].setRotationPoint(0F, -193F, 0F);
		hipsModel[105].rotateAngleZ = 0.36651914F;

		hipsModel[106].addShapeBox(-88F, 5F, 32F, 3, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips71
		hipsModel[106].setRotationPoint(0F, -193F, 0F);
		hipsModel[106].rotateAngleZ = -0.54105207F;

		hipsModel[107].addBox(-60F, 46.5F, -48.5F, 15, 9, 9, 0F); // Hips72
		hipsModel[107].setRotationPoint(0F, -193F, 0F);
		hipsModel[107].rotateAngleZ = -0.57595865F;

		hipsModel[108].addShapeBox(76F, 47F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips73
		hipsModel[108].setRotationPoint(0F, -193F, 0F);
		hipsModel[108].rotateAngleZ = 0.36651914F;

		hipsModel[109].addShapeBox(-71F, 5F, 32F, 3, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips74
		hipsModel[109].setRotationPoint(0F, -193F, 0F);
		hipsModel[109].rotateAngleZ = -0.54105207F;

		hipsModel[110].addShapeBox(76F, 50F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips75
		hipsModel[110].setRotationPoint(0F, -193F, 0F);
		hipsModel[110].rotateAngleZ = 0.36651914F;

		hipsModel[111].addShapeBox(-85F, 5F, 32F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips76
		hipsModel[111].setRotationPoint(0F, -193F, 0F);
		hipsModel[111].rotateAngleZ = -0.54105207F;

		hipsModel[112].addShapeBox(-85F, 5F, 65F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips77
		hipsModel[112].setRotationPoint(0F, -193F, 0F);
		hipsModel[112].rotateAngleZ = -0.54105207F;

		hipsModel[113].addShapeBox(76F, 60F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips78
		hipsModel[113].setRotationPoint(0F, -193F, 0F);
		hipsModel[113].rotateAngleZ = 0.36651914F;

		hipsModel[114].addShapeBox(76F, 63F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips79
		hipsModel[114].setRotationPoint(0F, -193F, 0F);
		hipsModel[114].rotateAngleZ = 0.36651914F;

		hipsModel[115].addShapeBox(78F, 19F, 53F, 7, 58, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips8
		hipsModel[115].setRotationPoint(0F, -193F, 0F);
		hipsModel[115].rotateAngleZ = 0.36651914F;

		hipsModel[116].addShapeBox(-85F, 5F, 48.5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips80
		hipsModel[116].setRotationPoint(0F, -193F, 0F);
		hipsModel[116].rotateAngleZ = -0.54105207F;

		hipsModel[117].addShapeBox(-88F, 73F, 32F, 4, 13, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F); // Hips81
		hipsModel[117].setRotationPoint(0F, -193F, 0F);
		hipsModel[117].rotateAngleZ = -0.54105207F;

		hipsModel[118].addShapeBox(76F, 66F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips82
		hipsModel[118].setRotationPoint(0F, -193F, 0F);
		hipsModel[118].rotateAngleZ = 0.36651914F;

		hipsModel[119].addShapeBox(76F, 69F, -53F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips83
		hipsModel[119].setRotationPoint(0F, -193F, 0F);
		hipsModel[119].rotateAngleZ = 0.36651914F;

		hipsModel[120].addShapeBox(-64F, 73F, 32F, 4, 13, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Hips84
		hipsModel[120].setRotationPoint(0F, -193F, 0F);
		hipsModel[120].rotateAngleZ = -0.54105207F;

		hipsModel[121].addShapeBox(-83F, 72F, 32F, 20, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips85
		hipsModel[121].setRotationPoint(-1F, -193F, 0F);
		hipsModel[121].rotateAngleZ = -0.54105207F;

		hipsModel[122].addShapeBox(49F, 7F, 74F, 26, 11, 6, 0F,0F, 0F, 0F, 3.5F, -8F, 0F, 3.5F, -8F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 3.5F, 0F, 0F); // Hips86
		hipsModel[122].setRotationPoint(0F, -193F, 0F);
		hipsModel[122].rotateAngleZ = 0.36651914F;

		hipsModel[123].addShapeBox(-82F, 72F, 66F, 20, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hips87
		hipsModel[123].setRotationPoint(-2F, -193F, 0F);
		hipsModel[123].rotateAngleZ = -0.54105207F;

		hipsModel[124].addShapeBox(-81.5F, 71F, 44F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F); // Hips88
		hipsModel[124].setRotationPoint(0F, -193F, 0F);
		hipsModel[124].rotateAngleZ = -0.54105207F;

		hipsModel[125].addShapeBox(49F, 22F, 74F, 26, 11, 6, 0F,0F, 0F, 0F, 3.5F, -8F, 0F, 3.5F, -8F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 3.5F, 0F, 0F); // Hips89
		hipsModel[125].setRotationPoint(0F, -193F, 0F);
		hipsModel[125].rotateAngleZ = 0.36651914F;

		hipsModel[126].addShapeBox(78F, 19F, 39F, 7, 4, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Hips9
		hipsModel[126].setRotationPoint(0F, -193F, 0F);
		hipsModel[126].rotateAngleZ = 0.36651914F;

		hipsModel[127].addShapeBox(-81.5F, 71F, 39F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips90
		hipsModel[127].setRotationPoint(0F, -193F, 0F);
		hipsModel[127].rotateAngleZ = -0.54105207F;

		hipsModel[128].addShapeBox(49F, 36F, 74F, 26, 11, 6, 0F,0F, 0F, 0F, 3.5F, -8F, 0F, 3.5F, -8F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 3.5F, 0F, 0F); // Hips91
		hipsModel[128].setRotationPoint(0F, -193F, 0F);
		hipsModel[128].rotateAngleZ = 0.36651914F;

		hipsModel[129].addBox(-45F, 46F, -49F, 15, 10, 10, 0F); // Hips92
		hipsModel[129].setRotationPoint(0F, -193F, 0F);
		hipsModel[129].rotateAngleZ = -0.57595865F;

		hipsModel[130].addShapeBox(-81.5F, 71F, 34F, 15, 13, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips93
		hipsModel[130].setRotationPoint(0F, -193F, 0F);
		hipsModel[130].rotateAngleZ = -0.54105207F;

		hipsModel[131].addShapeBox(49F, 36F, -80F, 26, 11, 6, 0F,0F, 0F, 0F, 3.5F, -8F, 0F, 3.5F, -8F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 3.5F, 0F, 0F); // Hips94
		hipsModel[131].setRotationPoint(0F, -193F, 0F);
		hipsModel[131].rotateAngleZ = 0.36651914F;

		hipsModel[132].addShapeBox(-81.5F, 71F, 50F, 15, 13, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips96
		hipsModel[132].setRotationPoint(0F, -193F, 0F);
		hipsModel[132].rotateAngleZ = -0.54105207F;

		hipsModel[133].addShapeBox(-81.5F, 71F, 55F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Hips97
		hipsModel[133].setRotationPoint(0F, -193F, 0F);
		hipsModel[133].rotateAngleZ = -0.54105207F;

		hipsModel[134].addShapeBox(49F, 7F, -80F, 26, 11, 6, 0F,0F, 0F, 0F, 3.5F, -8F, 0F, 3.5F, -8F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 3.5F, 0F, 0F); // Hips98
		hipsModel[134].setRotationPoint(0F, -193F, 0F);
		hipsModel[134].rotateAngleZ = 0.36651914F;

		hipsModel[135].addShapeBox(-81.5F, 71F, 60F, 15, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F); // Hips99
		hipsModel[135].setRotationPoint(0F, -193F, 0F);
		hipsModel[135].rotateAngleZ = -0.54105207F;

		hipsModel[136].addShapeBox(40F, 7F, -40F, 10, 5, 80, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftLeg96
		hipsModel[136].setRotationPoint(0F, -193F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 983, 1912, textureX, textureY); // Import LeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this, 1211, 448, textureX, textureY); // Import LeftArm10
		leftArmModel[2] = new ModelRendererTurbo(this, 1163, 705, textureX, textureY); // Import LeftArm100
		leftArmModel[3] = new ModelRendererTurbo(this, 1405, 1670, textureX, textureY); // Import LeftArm101
		leftArmModel[4] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm102
		leftArmModel[5] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm103
		leftArmModel[6] = new ModelRendererTurbo(this, 999, 276, textureX, textureY); // Import LeftArm104
		leftArmModel[7] = new ModelRendererTurbo(this, 1404, 1729, textureX, textureY); // Import LeftArm105
		leftArmModel[8] = new ModelRendererTurbo(this, 999, 253, textureX, textureY); // Import LeftArm106
		leftArmModel[9] = new ModelRendererTurbo(this, 1135, 1097, textureX, textureY); // Import LeftArm107
		leftArmModel[10] = new ModelRendererTurbo(this, 810, 1931, textureX, textureY); // Import LeftArm108
		leftArmModel[11] = new ModelRendererTurbo(this, 1076, 303, textureX, textureY); // Import LeftArm109
		leftArmModel[12] = new ModelRendererTurbo(this, 1007, 605, textureX, textureY); // Import LeftArm11
		leftArmModel[13] = new ModelRendererTurbo(this, 1321, 1729, textureX, textureY); // Import LeftArm110
		leftArmModel[14] = new ModelRendererTurbo(this, 1218, 1097, textureX, textureY); // Import LeftArm111
		leftArmModel[15] = new ModelRendererTurbo(this, 810, 1931, textureX, textureY); // Import LeftArm112
		leftArmModel[16] = new ModelRendererTurbo(this, 1196, 1729, textureX, textureY); // Import LeftArm113
		leftArmModel[17] = new ModelRendererTurbo(this, 987, 356, textureX, textureY); // Import LeftArm114
		leftArmModel[18] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import LeftArm115
		leftArmModel[19] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import LeftArm116
		leftArmModel[20] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import LeftArm117
		leftArmModel[21] = new ModelRendererTurbo(this, 987, 315, textureX, textureY); // Import LeftArm118
		leftArmModel[22] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import LeftArm119
		leftArmModel[23] = new ModelRendererTurbo(this, 983, 1823, textureX, textureY); // Import LeftArm12
		leftArmModel[24] = new ModelRendererTurbo(this, 999, 212, textureX, textureY); // Import LeftArm120
		leftArmModel[25] = new ModelRendererTurbo(this, 1076, 1017, textureX, textureY); // Import LeftArm121
		leftArmModel[26] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import LeftArm122
		leftArmModel[27] = new ModelRendererTurbo(this, 999, 171, textureX, textureY); // Import LeftArm123
		leftArmModel[28] = new ModelRendererTurbo(this, 1023, 1017, textureX, textureY); // Import LeftArm124
		leftArmModel[29] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import LeftArm125
		leftArmModel[30] = new ModelRendererTurbo(this, 1126, 427, textureX, textureY); // Import LeftArm126
		leftArmModel[31] = new ModelRendererTurbo(this, 1157, 911, textureX, textureY); // Import LeftArm127
		leftArmModel[32] = new ModelRendererTurbo(this, 1126, 522, textureX, textureY); // Import LeftArm128
		leftArmModel[33] = new ModelRendererTurbo(this, 1186, 1875, textureX, textureY); // Import LeftArm129
		leftArmModel[34] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // Import LeftArm13
		leftArmModel[35] = new ModelRendererTurbo(this, 1157, 945, textureX, textureY); // Import LeftArm130
		leftArmModel[36] = new ModelRendererTurbo(this, 1325, 1875, textureX, textureY); // Import LeftArm131
		leftArmModel[37] = new ModelRendererTurbo(this, 1217, 641, textureX, textureY); // Import LeftArm132
		leftArmModel[38] = new ModelRendererTurbo(this, 1295, 1445, textureX, textureY); // Import LeftArm133
		leftArmModel[39] = new ModelRendererTurbo(this, 1186, 449, textureX, textureY); // Import LeftArm134
		leftArmModel[40] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm135
		leftArmModel[41] = new ModelRendererTurbo(this, 1105, 1232, textureX, textureY); // Import LeftArm136
		leftArmModel[42] = new ModelRendererTurbo(this, 1392, 1875, textureX, textureY); // Import LeftArm137
		leftArmModel[43] = new ModelRendererTurbo(this, 1242, 1314, textureX, textureY); // Import LeftArm138
		leftArmModel[44] = new ModelRendererTurbo(this, 1379, 1936, textureX, textureY); // Import LeftArm139
		leftArmModel[45] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm14
		leftArmModel[46] = new ModelRendererTurbo(this, 1105, 1316, textureX, textureY); // Import LeftArm140
		leftArmModel[47] = new ModelRendererTurbo(this, 1171, 1392, textureX, textureY); // Import LeftArm141
		leftArmModel[48] = new ModelRendererTurbo(this, 1183, 1936, textureX, textureY); // Import LeftArm142
		leftArmModel[49] = new ModelRendererTurbo(this, 1308, 1936, textureX, textureY); // Import LeftArm143
		leftArmModel[50] = new ModelRendererTurbo(this, 1171, 1433, textureX, textureY); // Import LeftArm144
		leftArmModel[51] = new ModelRendererTurbo(this, 1242, 1350, textureX, textureY); // Import LeftArm145
		leftArmModel[52] = new ModelRendererTurbo(this, 1458, 1782, textureX, textureY); // Import LeftArm146
		leftArmModel[53] = new ModelRendererTurbo(this, 1511, 1453, textureX, textureY); // Import LeftArm147
		leftArmModel[54] = new ModelRendererTurbo(this, 1105, 1351, textureX, textureY); // Import LeftArm148
		leftArmModel[55] = new ModelRendererTurbo(this, 1511, 1512, textureX, textureY); // Import LeftArm149
		leftArmModel[56] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm15
		leftArmModel[57] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // Import LeftArm150
		leftArmModel[58] = new ModelRendererTurbo(this, 1398, 1504, textureX, textureY); // Import LeftArm151
		leftArmModel[59] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // Import LeftArm152
		leftArmModel[60] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // Import LeftArm153
		leftArmModel[61] = new ModelRendererTurbo(this, 1398, 1575, textureX, textureY); // Import LeftArm154
		leftArmModel[62] = new ModelRendererTurbo(this, 1157, 928, textureX, textureY); // Import LeftArm155
		leftArmModel[63] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import LeftArm156
		leftArmModel[64] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm157
		leftArmModel[65] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm159
		leftArmModel[66] = new ModelRendererTurbo(this, 1212, 1239, textureX, textureY); // Import LeftArm16
		leftArmModel[67] = new ModelRendererTurbo(this, 1398, 1445, textureX, textureY); // Import LeftArm160
		leftArmModel[68] = new ModelRendererTurbo(this, 1264, 910, textureX, textureY); // Import LeftArm161
		leftArmModel[69] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import LeftArm162
		leftArmModel[70] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import LeftArm163
		leftArmModel[71] = new ModelRendererTurbo(this, 1368, 1062, textureX, textureY); // Import LeftArm164
		leftArmModel[72] = new ModelRendererTurbo(this, 1368, 1085, textureX, textureY); // Import LeftArm165
		leftArmModel[73] = new ModelRendererTurbo(this, 1417, 1062, textureX, textureY); // Import LeftArm166
		leftArmModel[74] = new ModelRendererTurbo(this, 1417, 1085, textureX, textureY); // Import LeftArm167
		leftArmModel[75] = new ModelRendererTurbo(this, 1368, 1085, textureX, textureY); // Import LeftArm168
		leftArmModel[76] = new ModelRendererTurbo(this, 1368, 1062, textureX, textureY); // Import LeftArm169
		leftArmModel[77] = new ModelRendererTurbo(this, 1417, 1085, textureX, textureY); // Import LeftArm170
		leftArmModel[78] = new ModelRendererTurbo(this, 1417, 1062, textureX, textureY); // Import LeftArm171
		leftArmModel[79] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm172
		leftArmModel[80] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm173
		leftArmModel[81] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import LeftArm175
		leftArmModel[82] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import LeftArm176
		leftArmModel[83] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import LeftArm177
		leftArmModel[84] = new ModelRendererTurbo(this, 1273, 1039, textureX, textureY); // Import LeftArm178
		leftArmModel[85] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import LeftArm18
		leftArmModel[86] = new ModelRendererTurbo(this, 1511, 1577, textureX, textureY); // Import LeftArm180
		leftArmModel[87] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm181
		leftArmModel[88] = new ModelRendererTurbo(this, 1511, 1636, textureX, textureY); // Import LeftArm182
		leftArmModel[89] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm183
		leftArmModel[90] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // Import LeftArm185
		leftArmModel[91] = new ModelRendererTurbo(this, 1497, 1876, textureX, textureY); // Import LeftArm186
		leftArmModel[92] = new ModelRendererTurbo(this, 810, 1817, textureX, textureY); // Import LeftArm187
		leftArmModel[93] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm188
		leftArmModel[94] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import LeftArm19
		leftArmModel[95] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // Import LeftArm190
		leftArmModel[96] = new ModelRendererTurbo(this, 1087, 11, textureX, textureY); // Import LeftArm191
		leftArmModel[97] = new ModelRendererTurbo(this, 1176, 11, textureX, textureY); // Import LeftArm192
		leftArmModel[98] = new ModelRendererTurbo(this, 996, 11, textureX, textureY); // Import LeftArm193
		leftArmModel[99] = new ModelRendererTurbo(this, 1020, 854, textureX, textureY); // Import LeftArm2
		leftArmModel[100] = new ModelRendererTurbo(this, 1307, 1239, textureX, textureY); // Import LeftArm20
		leftArmModel[101] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import LeftArm21
		leftArmModel[102] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm23
		leftArmModel[103] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import LeftArm24
		leftArmModel[104] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import LeftArm26
		leftArmModel[105] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // Import LeftArm27
		leftArmModel[106] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // Import LeftArm29
		leftArmModel[107] = new ModelRendererTurbo(this, 1020, 777, textureX, textureY); // Import LeftArm3
		leftArmModel[108] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm30
		leftArmModel[109] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import LeftArm31
		leftArmModel[110] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // Import LeftArm32
		leftArmModel[111] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm33
		leftArmModel[112] = new ModelRendererTurbo(this, 810, 1817, textureX, textureY); // Import LeftArm35
		leftArmModel[113] = new ModelRendererTurbo(this, 1186, 449, textureX, textureY); // Import LeftArm36
		leftArmModel[114] = new ModelRendererTurbo(this, 987, 397, textureX, textureY); // Import LeftArm37
		leftArmModel[115] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import LeftArm38
		leftArmModel[116] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import LeftArm39
		leftArmModel[117] = new ModelRendererTurbo(this, 1211, 419, textureX, textureY); // Import LeftArm4
		leftArmModel[118] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm40
		leftArmModel[119] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import LeftArm41
		leftArmModel[120] = new ModelRendererTurbo(this, 1211, 419, textureX, textureY); // Import LeftArm42
		leftArmModel[121] = new ModelRendererTurbo(this, 1076, 106, textureX, textureY); // Import LeftArm43
		leftArmModel[122] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm44
		leftArmModel[123] = new ModelRendererTurbo(this, 1186, 419, textureX, textureY); // Import LeftArm45
		leftArmModel[124] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import LeftArm46
		leftArmModel[125] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm47
		leftArmModel[126] = new ModelRendererTurbo(this, 1076, 338, textureX, textureY); // Import LeftArm48
		leftArmModel[127] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import LeftArm49
		leftArmModel[128] = new ModelRendererTurbo(this, 1200, 1558, textureX, textureY); // Import LeftArm5
		leftArmModel[129] = new ModelRendererTurbo(this, 1186, 432, textureX, textureY); // Import LeftArm50
		leftArmModel[130] = new ModelRendererTurbo(this, 1163, 766, textureX, textureY); // Import LeftArm51
		leftArmModel[131] = new ModelRendererTurbo(this, 1207, 1782, textureX, textureY); // Import LeftArm52
		leftArmModel[132] = new ModelRendererTurbo(this, 1186, 419, textureX, textureY); // Import LeftArm53
		leftArmModel[133] = new ModelRendererTurbo(this, 1135, 619, textureX, textureY); // Import LeftArm54
		leftArmModel[134] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm55
		leftArmModel[135] = new ModelRendererTurbo(this, 1211, 448, textureX, textureY); // Import LeftArm56
		leftArmModel[136] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // Import LeftArm57
		leftArmModel[137] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import LeftArm58
		leftArmModel[138] = new ModelRendererTurbo(this, 1125, 1017, textureX, textureY); // Import LeftArm59
		leftArmModel[139] = new ModelRendererTurbo(this, 1134, 1149, textureX, textureY); // Import LeftArm6
		leftArmModel[140] = new ModelRendererTurbo(this, 987, 498, textureX, textureY); // Import LeftArm60
		leftArmModel[141] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm61
		leftArmModel[142] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // Import LeftArm62
		leftArmModel[143] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm63
		leftArmModel[144] = new ModelRendererTurbo(this, 999, 171, textureX, textureY); // Import LeftArm64
		leftArmModel[145] = new ModelRendererTurbo(this, 1178, 1017, textureX, textureY); // Import LeftArm65
		leftArmModel[146] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import LeftArm66
		leftArmModel[147] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // Import LeftArm67
		leftArmModel[148] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm68
		leftArmModel[149] = new ModelRendererTurbo(this, 999, 212, textureX, textureY); // Import LeftArm69
		leftArmModel[150] = new ModelRendererTurbo(this, 1200, 1469, textureX, textureY); // Import LeftArm7
		leftArmModel[151] = new ModelRendererTurbo(this, 1043, 975, textureX, textureY); // Import LeftArm70
		leftArmModel[152] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm71
		leftArmModel[153] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm72
		leftArmModel[154] = new ModelRendererTurbo(this, 1135, 1097, textureX, textureY); // Import LeftArm73
		leftArmModel[155] = new ModelRendererTurbo(this, 1043, 975, textureX, textureY); // Import LeftArm74
		leftArmModel[156] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm75
		leftArmModel[157] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm76
		leftArmModel[158] = new ModelRendererTurbo(this, 999, 253, textureX, textureY); // Import LeftArm77
		leftArmModel[159] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm78
		leftArmModel[160] = new ModelRendererTurbo(this, 999, 276, textureX, textureY); // Import LeftArm79
		leftArmModel[161] = new ModelRendererTurbo(this, 1240, 706, textureX, textureY); // Import LeftArm8
		leftArmModel[162] = new ModelRendererTurbo(this, 1218, 1097, textureX, textureY); // Import LeftArm80
		leftArmModel[163] = new ModelRendererTurbo(this, 994, 980, textureX, textureY); // Import LeftArm81
		leftArmModel[164] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm82
		leftArmModel[165] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm83
		leftArmModel[166] = new ModelRendererTurbo(this, 994, 980, textureX, textureY); // Import LeftArm84
		leftArmModel[167] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import LeftArm85
		leftArmModel[168] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import LeftArm86
		leftArmModel[169] = new ModelRendererTurbo(this, 1076, 161, textureX, textureY); // Import LeftArm87
		leftArmModel[170] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm88
		leftArmModel[171] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import LeftArm89
		leftArmModel[172] = new ModelRendererTurbo(this, 1019, 706, textureX, textureY); // Import LeftArm9
		leftArmModel[173] = new ModelRendererTurbo(this, 1076, 250, textureX, textureY); // Import LeftArm90
		leftArmModel[174] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import LeftArm91
		leftArmModel[175] = new ModelRendererTurbo(this, 1163, 839, textureX, textureY); // Import LeftArm92
		leftArmModel[176] = new ModelRendererTurbo(this, 1195, 1670, textureX, textureY); // Import LeftArm93
		leftArmModel[177] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm94
		leftArmModel[178] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import LeftArm95
		leftArmModel[179] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import LeftArm96
		leftArmModel[180] = new ModelRendererTurbo(this, 1326, 1670, textureX, textureY); // Import LeftArm97
		leftArmModel[181] = new ModelRendererTurbo(this, 1186, 432, textureX, textureY); // Import LeftArm98
		leftArmModel[182] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import LeftArm99

		leftArmModel[0].addShapeBox(-71F, 178F, 27F, 40, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = 0.27925268F;

		leftArmModel[1].addShapeBox(37F, -33F, 39F, 3, 7, 18, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm10
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -0.34906585F;

		leftArmModel[2].addShapeBox(9F, 14F, 29F, 12, 19, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm100
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -0.34906585F;

		leftArmModel[3].addShapeBox(-109F, 102F, 61F, 8, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Import LeftArm101
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = 0.41887902F;

		leftArmModel[4].addShapeBox(-49F, 245F, 40F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm102
		leftArmModel[4].setRotationPoint(1F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = 0.27925268F;

		leftArmModel[5].addShapeBox(-27F, 43F, 2F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import LeftArm103
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -0.34906585F;

		leftArmModel[6].addShapeBox(-21F, -45F, 56F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import LeftArm104
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -0.34906585F;

		leftArmModel[7].addShapeBox(-107F, 146F, 61F, 6, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Import LeftArm105
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = 0.41887902F;

		leftArmModel[8].addShapeBox(-21F, -50F, 56F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm106
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -0.34906585F;

		leftArmModel[9].addShapeBox(-22F, 37F, 8F, 8, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm107
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -0.34906585F;

		leftArmModel[10].addShapeBox(-40F, 199F, 68F, 7, 46, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import LeftArm108
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = 0.27925268F;

		leftArmModel[11].addShapeBox(-44F, -36F, 78F, 86, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import LeftArm109
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -0.34906585F;

		leftArmModel[12].addShapeBox(-9F, -28F, 20F, 18, 54, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm11
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -0.34906585F;

		leftArmModel[13].addShapeBox(-49F, 146F, 61F, 6, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Import LeftArm110
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = 0.41887902F;

		leftArmModel[14].addShapeBox(-21F, 38F, 15F, 6, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm111
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = -0.34906585F;

		leftArmModel[15].addShapeBox(-73F, 199F, 68F, 7, 46, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import LeftArm112
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = 0.27925268F;

		leftArmModel[16].addShapeBox(-101F, 146F, 79F, 52, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm113
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = 0.41887902F;

		leftArmModel[17].addShapeBox(27F, -36F, 63F, 15, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm114
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = -0.34906585F;

		leftArmModel[18].addShapeBox(-23F, 37F, 41F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm115
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);
		leftArmModel[18].rotateAngleZ = -0.34906585F;

		leftArmModel[19].addShapeBox(-49F, 128F, 62F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm116
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
		leftArmModel[19].rotateAngleZ = 0.41887902F;

		leftArmModel[20].addShapeBox(-23F, 42F, 41F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import LeftArm117
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);
		leftArmModel[20].rotateAngleZ = -0.34906585F;

		leftArmModel[21].addShapeBox(-44F, -36F, 63F, 15, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm118
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -0.34906585F;

		leftArmModel[22].addShapeBox(-106F, 128F, 62F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm119
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = 0.41887902F;

		leftArmModel[23].addShapeBox(-76F, 188F, 25F, 50, 20, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm12
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);
		leftArmModel[23].rotateAngleZ = 0.27925268F;

		leftArmModel[24].addShapeBox(-20F, -44F, 35F, 8, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import LeftArm120
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);
		leftArmModel[24].rotateAngleZ = -0.34906585F;

		leftArmModel[25].addShapeBox(21F, 26F, 27F, 8, 46, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import LeftArm121
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);
		leftArmModel[25].rotateAngleZ = -0.34906585F;

		leftArmModel[26].addShapeBox(-54F, 128F, 79F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm122
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = 0.41887902F;

		leftArmModel[27].addShapeBox(-21F, -41F, 14F, 10, 10, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import LeftArm123
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -0.34906585F;

		leftArmModel[28].addShapeBox(-30F, 26F, 27F, 8, 46, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import LeftArm124
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);
		leftArmModel[28].rotateAngleZ = -0.34906585F;

		leftArmModel[29].addShapeBox(-101F, 128F, 79F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm125
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
		leftArmModel[29].rotateAngleZ = 0.41887902F;

		leftArmModel[30].addShapeBox(27F, -27F, 25F, 15, 40, 10, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm126
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);
		leftArmModel[30].rotateAngleZ = -0.34906585F;

		leftArmModel[31].addShapeBox(-22F, 27F, 66F, 43, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Import LeftArm127
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);
		leftArmModel[31].rotateAngleZ = -0.34906585F;

		leftArmModel[32].addShapeBox(-44F, -27F, 25F, 15, 40, 10, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm128
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);
		leftArmModel[32].rotateAngleZ = -0.34906585F;

		leftArmModel[33].addShapeBox(-101F, 102F, 11F, 52, 26, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm129
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = 0.41887902F;

		leftArmModel[34].addShapeBox(7F, 88F, 47F, 30, 10, 25, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm13
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);
		leftArmModel[34].rotateAngleZ = -0.34906585F;

		leftArmModel[35].addShapeBox(-22F, 50F, 66F, 43, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Import LeftArm130
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);
		leftArmModel[35].rotateAngleZ = -0.34906585F;

		leftArmModel[36].addShapeBox(-49F, 102F, 131F, 3, 26, 21, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm131
		leftArmModel[36].setRotationPoint(0F, 0F, -120F);
		leftArmModel[36].rotateAngleZ = 0.41887902F;

		leftArmModel[37].addShapeBox(-22F, 52F, 27F, 43, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm132
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -0.34906585F;

		leftArmModel[38].addShapeBox(-99F, 87F, 15F, 22, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm133
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = 0.41887902F;

		leftArmModel[39].addBox(32F, -28F, 42F, 5, 1, 12, 0F); // Import LeftArm134
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);
		leftArmModel[39].rotateAngleZ = -0.34906585F;

		leftArmModel[40].addBox(-34F, 199F, 56F, 12, 46, 12, 0F); // Import LeftArm135
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);
		leftArmModel[40].rotateAngleZ = 0.27925268F;

		leftArmModel[41].addShapeBox(1F, 91F, 20F, 24, 12, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm136
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);
		leftArmModel[41].rotateAngleZ = -0.34906585F;

		leftArmModel[42].addShapeBox(-104F, 102F, 131F, 3, 26, 21, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm137
		leftArmModel[42].setRotationPoint(0F, 0F, -120F);
		leftArmModel[42].rotateAngleZ = 0.41887902F;

		leftArmModel[43].addShapeBox(-23F, 60F, 39F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm138
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);
		leftArmModel[43].rotateAngleZ = -0.34906585F;

		leftArmModel[44].addShapeBox(-104F, 149F, 131F, 3, 14, 21, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm139
		leftArmModel[44].setRotationPoint(0F, 0F, -120F);
		leftArmModel[44].rotateAngleZ = 0.41887902F;

		leftArmModel[45].addShapeBox(-65F, 118F, 65F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm14
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);
		leftArmModel[45].rotateAngleZ = 0.41887902F;

		leftArmModel[46].addShapeBox(-23F, 60F, 54F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import LeftArm140
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);
		leftArmModel[46].rotateAngleZ = -0.34906585F;

		leftArmModel[47].addShapeBox(-23F, 60F, 24F, 45, 8, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm141
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);
		leftArmModel[47].rotateAngleZ = -0.34906585F;

		leftArmModel[48].addShapeBox(-101F, 149F, 11F, 52, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm142
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);
		leftArmModel[48].rotateAngleZ = 0.41887902F;

		leftArmModel[49].addShapeBox(-49F, 149F, 131F, 3, 14, 21, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm143
		leftArmModel[49].setRotationPoint(0F, 0F, -120F);
		leftArmModel[49].rotateAngleZ = 0.41887902F;

		leftArmModel[50].addShapeBox(-23F, 68F, 24F, 45, 8, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm144
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);
		leftArmModel[50].rotateAngleZ = -0.34906585F;

		leftArmModel[51].addShapeBox(-23F, 68F, 39F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm145
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);
		leftArmModel[51].rotateAngleZ = -0.34906585F;

		leftArmModel[52].addShapeBox(-103F, 163F, 15F, 56, 10, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm146
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);
		leftArmModel[52].rotateAngleZ = 0.41887902F;

		leftArmModel[53].addBox(-51F, 102F, 157F, 6, 26, 20, 0F); // Import LeftArm147
		leftArmModel[53].setRotationPoint(0F, 0F, -120F);
		leftArmModel[53].rotateAngleZ = 0.41887902F;

		leftArmModel[54].addShapeBox(-23F, 68F, 54F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import LeftArm148
		leftArmModel[54].setRotationPoint(0F, 0F, 0F);
		leftArmModel[54].rotateAngleZ = -0.34906585F;

		leftArmModel[55].addBox(-51F, 145F, 157F, 6, 18, 20, 0F); // Import LeftArm149
		leftArmModel[55].setRotationPoint(0F, 0F, -120F);
		leftArmModel[55].rotateAngleZ = 0.41887902F;

		leftArmModel[56].addShapeBox(-23F, -37F, 2F, 14, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm15
		leftArmModel[56].setRotationPoint(0F, 0F, 0F);
		leftArmModel[56].rotateAngleZ = -0.34906585F;

		leftArmModel[57].addBox(-22F, 27F, 63F, 43, 6, 3, 0F); // Import LeftArm150
		leftArmModel[57].setRotationPoint(0F, 0F, 0F);
		leftArmModel[57].rotateAngleZ = -0.34906585F;

		leftArmModel[58].addBox(-127F, 111F, 157F, 28, 46, 20, 0F); // Import LeftArm151
		leftArmModel[58].setRotationPoint(0F, 0F, -120F);
		leftArmModel[58].rotateAngleZ = 0.41887902F;

		leftArmModel[59].addBox(-22F, 50F, 63F, 43, 10, 3, 0F); // Import LeftArm152
		leftArmModel[59].setRotationPoint(0F, 0F, 0F);
		leftArmModel[59].rotateAngleZ = -0.34906585F;

		leftArmModel[60].addBox(-22F, 38F, 63F, 43, 6, 3, 0F); // Import LeftArm153
		leftArmModel[60].setRotationPoint(0F, 0F, 0F);
		leftArmModel[60].rotateAngleZ = -0.34906585F;

		leftArmModel[61].addShapeBox(-132F, 111F, 157F, 5, 46, 20, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Import LeftArm154
		leftArmModel[61].setRotationPoint(0F, 0F, -120F);
		leftArmModel[61].rotateAngleZ = 0.41887902F;

		leftArmModel[62].addShapeBox(-22F, 38F, 66F, 43, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Import LeftArm155
		leftArmModel[62].setRotationPoint(0F, 0F, 0F);
		leftArmModel[62].rotateAngleZ = -0.34906585F;

		leftArmModel[63].addShapeBox(-71F, 103.5F, 49F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm156
		leftArmModel[63].setRotationPoint(0F, 0F, 0F);

		leftArmModel[64].addBox(-82F, 199F, 56F, 12, 46, 12, 0F); // Import LeftArm157
		leftArmModel[64].setRotationPoint(0F, 0F, 0F);
		leftArmModel[64].rotateAngleZ = 0.27925268F;

		leftArmModel[65].addShapeBox(9F, -37F, 2F, 14, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm159
		leftArmModel[65].setRotationPoint(0F, 0F, 0F);
		leftArmModel[65].rotateAngleZ = -0.34906585F;

		leftArmModel[66].addBox(-25F, 91F, 64F, 26, 12, 16, 0F); // Import LeftArm16
		leftArmModel[66].setRotationPoint(0F, 0F, -6F);
		leftArmModel[66].rotateAngleZ = -0.34906585F;

		leftArmModel[67].addShapeBox(-99F, 87F, 57F, 22, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm160
		leftArmModel[67].setRotationPoint(0F, 0F, 0F);
		leftArmModel[67].rotateAngleZ = 0.41887902F;

		leftArmModel[68].addBox(-11F, 33F, 63F, 22, 17, 6, 0F); // Import LeftArm161
		leftArmModel[68].setRotationPoint(0F, 0F, 0F);
		leftArmModel[68].rotateAngleZ = -0.34906585F;

		leftArmModel[69].addShapeBox(-71F, 99.5F, 49F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm162
		leftArmModel[69].setRotationPoint(0F, 0F, 0F);

		leftArmModel[70].addShapeBox(-71F, 108.5F, 49F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftArm163
		leftArmModel[70].setRotationPoint(0F, 0F, 0F);

		leftArmModel[71].addShapeBox(-65F, 99.5F, 49.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import LeftArm164
		leftArmModel[71].setRotationPoint(0F, 0F, 0F);

		leftArmModel[72].addShapeBox(-53F, 91F, 49F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import LeftArm165
		leftArmModel[72].setRotationPoint(0F, 0F, 0F);

		leftArmModel[73].addShapeBox(-69F, 102.5F, 49.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import LeftArm166
		leftArmModel[73].setRotationPoint(0F, 0F, 0F);

		leftArmModel[74].addShapeBox(-57F, 116F, 49F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import LeftArm167
		leftArmModel[74].setRotationPoint(0F, 0F, 0F);

		leftArmModel[75].addShapeBox(-53F, 91F, 37F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import LeftArm168
		leftArmModel[75].setRotationPoint(0F, 0F, 0F);

		leftArmModel[76].addShapeBox(-65F, 99.5F, 37.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import LeftArm169
		leftArmModel[76].setRotationPoint(0F, 0F, 0F);

		leftArmModel[77].addShapeBox(-57F, 116F, 37F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import LeftArm170
		leftArmModel[77].setRotationPoint(0F, 0F, 0F);

		leftArmModel[78].addShapeBox(-69F, 102.5F, 37.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import LeftArm171
		leftArmModel[78].setRotationPoint(0F, 0F, 0F);

		leftArmModel[79].addShapeBox(-82F, 199F, 38F, 12, 46, 18, 0F,0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm172
		leftArmModel[79].setRotationPoint(0F, 0F, 0F);
		leftArmModel[79].rotateAngleZ = 0.27925268F;

		leftArmModel[80].addShapeBox(9F, -42F, 2F, 14, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm173
		leftArmModel[80].setRotationPoint(0F, 0F, 0F);
		leftArmModel[80].rotateAngleZ = -0.34906585F;

		leftArmModel[81].addShapeBox(-71F, 108.5F, 37F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LeftArm175
		leftArmModel[81].setRotationPoint(0F, 0F, 0F);

		leftArmModel[82].addShapeBox(-71F, 103.5F, 37F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm176
		leftArmModel[82].setRotationPoint(0F, 0F, 0F);

		leftArmModel[83].addShapeBox(-71F, 99.5F, 37F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm177
		leftArmModel[83].setRotationPoint(0F, 0F, 0F);

		leftArmModel[84].addShapeBox(-52F, 87.5F, 32F, 12, 44, 30, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 5F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -7F, -2F); // Import LeftArm178
		leftArmModel[84].setRotationPoint(0F, 0F, 0F);
		leftArmModel[84].rotateAngleZ = -0.20943951F;

		leftArmModel[85].addShapeBox(-34F, 238F, 30F, 12, 7, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm18
		leftArmModel[85].setRotationPoint(0F, 0F, 0F);
		leftArmModel[85].rotateAngleZ = 0.27925268F;

		leftArmModel[86].addShapeBox(-90F, 118F, 33F, 30, 18, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm180
		leftArmModel[86].setRotationPoint(0F, 0F, 0F);
		leftArmModel[86].rotateAngleZ = 0.41887902F;

		leftArmModel[87].addShapeBox(-70F, 237F, 38F, 36, 8, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm181
		leftArmModel[87].setRotationPoint(0F, 0F, 0F);
		leftArmModel[87].rotateAngleZ = 0.27925268F;

		leftArmModel[88].addShapeBox(-89F, 135F, 34F, 28, 18, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm182
		leftArmModel[88].setRotationPoint(0F, 0F, 0F);
		leftArmModel[88].rotateAngleZ = 0.41887902F;

		leftArmModel[89].addShapeBox(-82F, 194F, 56F, 60, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm183
		leftArmModel[89].setRotationPoint(0F, 0F, 0F);
		leftArmModel[89].rotateAngleZ = 0.27925268F;

		leftArmModel[90].addShapeBox(7F, 98F, 47F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm185
		leftArmModel[90].setRotationPoint(0F, 0F, 0F);
		leftArmModel[90].rotateAngleZ = -0.34906585F;

		leftArmModel[91].addShapeBox(-99F, 153F, 15F, 48, 10, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm186
		leftArmModel[91].setRotationPoint(0F, 0F, 0F);
		leftArmModel[91].rotateAngleZ = 0.41887902F;

		leftArmModel[92].addShapeBox(-83F, 196F, 59F, 62, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm187
		leftArmModel[92].setRotationPoint(0F, 0F, 0F);
		leftArmModel[92].rotateAngleZ = 0.27925268F;

		leftArmModel[93].addShapeBox(-23F, -42F, 2F, 14, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm188
		leftArmModel[93].setRotationPoint(0F, 0F, 0F);
		leftArmModel[93].rotateAngleZ = -0.34906585F;

		leftArmModel[94].addShapeBox(-63.5F, 136F, 66.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm19
		leftArmModel[94].setRotationPoint(0F, 0F, 0F);
		leftArmModel[94].rotateAngleZ = 0.41887902F;

		leftArmModel[95].addShapeBox(7F, 108F, 47F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import LeftArm190
		leftArmModel[95].setRotationPoint(0F, 0F, 0F);
		leftArmModel[95].rotateAngleZ = -0.34906585F;

		leftArmModel[96].addShapeBox(-9F, -28F, 0F, 18, 54, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm191
		leftArmModel[96].setRotationPoint(0F, 0F, 0F);
		leftArmModel[96].rotateAngleZ = -0.34906585F;

		leftArmModel[97].addShapeBox(-27F, -28F, 0F, 18, 54, 20, 0F,0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Import LeftArm192
		leftArmModel[97].setRotationPoint(0F, 0F, 0F);
		leftArmModel[97].rotateAngleZ = -0.34906585F;

		leftArmModel[98].addShapeBox(9F, -28F, 0F, 18, 54, 20, 0F,0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // Import LeftArm193
		leftArmModel[98].setRotationPoint(0F, 0F, 0F);
		leftArmModel[98].rotateAngleZ = -0.34906585F;

		leftArmModel[99].addShapeBox(-23F, -25F, 54F, 46, 48, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Import LeftArm2
		leftArmModel[99].setRotationPoint(0F, 0F, 0F);
		leftArmModel[99].rotateAngleZ = -0.34906585F;

		leftArmModel[100].addBox(-25F, 91F, 20F, 26, 12, 16, 0F); // Import LeftArm20
		leftArmModel[100].setRotationPoint(0F, 0F, 0F);
		leftArmModel[100].rotateAngleZ = -0.34906585F;

		leftArmModel[101].addShapeBox(-81F, 238F, 30F, 12, 7, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm21
		leftArmModel[101].setRotationPoint(0F, 0F, 0F);
		leftArmModel[101].rotateAngleZ = 0.27925268F;

		leftArmModel[102].addShapeBox(-65F, 150F, 65F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm23
		leftArmModel[102].setRotationPoint(0F, 0F, 0F);
		leftArmModel[102].rotateAngleZ = 0.41887902F;

		leftArmModel[103].addShapeBox(-63.5F, 136F, 18.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm24
		leftArmModel[103].setRotationPoint(0F, 0F, 0F);
		leftArmModel[103].rotateAngleZ = 0.41887902F;

		leftArmModel[104].addShapeBox(-66F, 238F, 30F, 12, 7, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm26
		leftArmModel[104].setRotationPoint(0F, 0F, 0F);
		leftArmModel[104].rotateAngleZ = 0.27925268F;

		leftArmModel[105].addShapeBox(-71F, 92F, 22F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import LeftArm27
		leftArmModel[105].setRotationPoint(0F, 0F, 0F);
		leftArmModel[105].rotateAngleZ = 0.41887902F;

		leftArmModel[106].addShapeBox(-71F, 82F, 22F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm29
		leftArmModel[106].setRotationPoint(0F, 0F, 0F);
		leftArmModel[106].rotateAngleZ = 0.41887902F;

		leftArmModel[107].addShapeBox(-23F, -25F, 38F, 46, 48, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm3
		leftArmModel[107].setRotationPoint(0F, 0F, 0F);
		leftArmModel[107].rotateAngleZ = -0.34906585F;

		leftArmModel[108].addShapeBox(-65F, 118F, 17F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm30
		leftArmModel[108].setRotationPoint(0F, 0F, 0F);
		leftArmModel[108].rotateAngleZ = 0.41887902F;

		leftArmModel[109].addShapeBox(-49F, 238F, 30F, 12, 7, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm31
		leftArmModel[109].setRotationPoint(0F, 0F, 0F);
		leftArmModel[109].rotateAngleZ = 0.27925268F;

		leftArmModel[110].addShapeBox(-71F, 72F, 22F, 30, 10, 25, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm32
		leftArmModel[110].setRotationPoint(0F, 0F, 0F);
		leftArmModel[110].rotateAngleZ = 0.41887902F;

		leftArmModel[111].addShapeBox(-65F, 150F, 17F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm33
		leftArmModel[111].setRotationPoint(0F, 0F, 0F);
		leftArmModel[111].rotateAngleZ = 0.41887902F;

		leftArmModel[112].addShapeBox(-82F, 196F, 30F, 60, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm35
		leftArmModel[112].setRotationPoint(0F, 0F, 0F);
		leftArmModel[112].rotateAngleZ = 0.27925268F;

		leftArmModel[113].addBox(-40F, -28F, 42F, 5, 1, 12, 0F); // Import LeftArm36
		leftArmModel[113].setRotationPoint(0F, 0F, 0F);
		leftArmModel[113].rotateAngleZ = -0.34906585F;

		leftArmModel[114].addShapeBox(27F, -27F, 35F, 15, 40, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm37
		leftArmModel[114].setRotationPoint(0F, 0F, 0F);
		leftArmModel[114].rotateAngleZ = -0.34906585F;

		leftArmModel[115].addShapeBox(-81F, 194F, 27F, 58, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm38
		leftArmModel[115].setRotationPoint(0F, 0F, 0F);
		leftArmModel[115].rotateAngleZ = 0.27925268F;

		leftArmModel[116].addShapeBox(-95.5F, 136F, 18.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm39
		leftArmModel[116].setRotationPoint(0F, 0F, 0F);
		leftArmModel[116].rotateAngleZ = 0.41887902F;

		leftArmModel[117].addShapeBox(29F, -33F, 39F, 3, 7, 18, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm4
		leftArmModel[117].setRotationPoint(0F, 0F, 0F);
		leftArmModel[117].rotateAngleZ = -0.34906585F;

		leftArmModel[118].addShapeBox(-97F, 118F, 17F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm40
		leftArmModel[118].setRotationPoint(0F, 0F, 0F);
		leftArmModel[118].rotateAngleZ = 0.41887902F;

		leftArmModel[119].addShapeBox(-31F, 199F, 27F, 8, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // Import LeftArm41
		leftArmModel[119].setRotationPoint(0F, 0F, 0F);
		leftArmModel[119].rotateAngleZ = 0.27925268F;

		leftArmModel[120].addShapeBox(-43F, -33F, 39F, 3, 7, 18, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm42
		leftArmModel[120].setRotationPoint(0F, 0F, 0F);
		leftArmModel[120].rotateAngleZ = -0.34906585F;

		leftArmModel[121].addShapeBox(-30F, -8F, 38F, 58, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm43
		leftArmModel[121].setRotationPoint(0F, 0F, 0F);
		leftArmModel[121].rotateAngleZ = -0.34906585F;

		leftArmModel[122].addShapeBox(-97F, 150F, 17F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm44
		leftArmModel[122].setRotationPoint(0F, 0F, 0F);
		leftArmModel[122].rotateAngleZ = 0.41887902F;

		leftArmModel[123].addShapeBox(-40F, -33F, 39F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm45
		leftArmModel[123].setRotationPoint(0F, 0F, 0F);
		leftArmModel[123].rotateAngleZ = -0.34906585F;

		leftArmModel[124].addShapeBox(-81F, 199F, 20F, 58, 44, 7, 0F,0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm46
		leftArmModel[124].setRotationPoint(0F, 0F, 0F);
		leftArmModel[124].rotateAngleZ = 0.27925268F;

		leftArmModel[125].addShapeBox(-97F, 150F, 65F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm47
		leftArmModel[125].setRotationPoint(0F, 0F, 0F);
		leftArmModel[125].rotateAngleZ = 0.41887902F;

		leftArmModel[126].addShapeBox(-44F, -27F, 78F, 86, 42, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import LeftArm48
		leftArmModel[126].setRotationPoint(0F, 0F, 0F);
		leftArmModel[126].rotateAngleZ = -0.34906585F;

		leftArmModel[127].addShapeBox(-81F, 199F, 27F, 8, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // Import LeftArm49
		leftArmModel[127].setRotationPoint(0F, 0F, 0F);
		leftArmModel[127].rotateAngleZ = 0.27925268F;

		leftArmModel[128].addShapeBox(-77F, 87F, 15F, 16, 15, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm5
		leftArmModel[128].setRotationPoint(0F, 0F, 0F);
		leftArmModel[128].rotateAngleZ = 0.41887902F;

		leftArmModel[129].addShapeBox(-40F, -33F, 54F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm50
		leftArmModel[129].setRotationPoint(0F, 0F, 0F);
		leftArmModel[129].rotateAngleZ = -0.34906585F;

		leftArmModel[130].addShapeBox(-22F, 14F, 29F, 12, 19, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm51
		leftArmModel[130].setRotationPoint(0F, 0F, 0F);
		leftArmModel[130].rotateAngleZ = -0.34906585F;

		leftArmModel[131].addShapeBox(-99F, 102F, 15F, 48, 16, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm52
		leftArmModel[131].setRotationPoint(0F, 0F, 0F);
		leftArmModel[131].rotateAngleZ = 0.41887902F;

		leftArmModel[132].addShapeBox(32F, -33F, 39F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm53
		leftArmModel[132].setRotationPoint(0F, 0F, 0F);
		leftArmModel[132].rotateAngleZ = -0.34906585F;

		leftArmModel[133].addShapeBox(-9F, -28F, 56F, 18, 54, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F); // Import LeftArm54
		leftArmModel[133].setRotationPoint(0F, 0F, 0F);
		leftArmModel[133].rotateAngleZ = -0.34906585F;

		leftArmModel[134].addShapeBox(-34F, 199F, 38F, 12, 46, 18, 0F,0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm55
		leftArmModel[134].setRotationPoint(0F, 0F, 0F);
		leftArmModel[134].rotateAngleZ = 0.27925268F;

		leftArmModel[135].addShapeBox(-35F, -33F, 39F, 3, 7, 18, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm56
		leftArmModel[135].setRotationPoint(0F, 0F, 0F);
		leftArmModel[135].rotateAngleZ = -0.34906585F;

		leftArmModel[136].addShapeBox(-40F, 238F, 27F, 9, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import LeftArm57
		leftArmModel[136].setRotationPoint(0F, 0F, 0F);
		leftArmModel[136].rotateAngleZ = 0.27925268F;

		leftArmModel[137].addShapeBox(-95.5F, 136F, 66.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm58
		leftArmModel[137].setRotationPoint(0F, 0F, 0F);
		leftArmModel[137].rotateAngleZ = 0.41887902F;

		leftArmModel[138].addShapeBox(-30F, 26F, 54F, 8, 46, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import LeftArm59
		leftArmModel[138].setRotationPoint(0F, 0F, 0F);
		leftArmModel[138].rotateAngleZ = -0.34906585F;

		leftArmModel[139].addShapeBox(-25F, 76F, 20F, 50, 15, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm6
		leftArmModel[139].setRotationPoint(0F, 0F, 0F);
		leftArmModel[139].rotateAngleZ = -0.34906585F;

		leftArmModel[140].addShapeBox(-44F, -27F, 35F, 15, 40, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm60
		leftArmModel[140].setRotationPoint(0F, 0F, 0F);
		leftArmModel[140].rotateAngleZ = -0.34906585F;

		leftArmModel[141].addShapeBox(-97F, 118F, 65F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm61
		leftArmModel[141].setRotationPoint(0F, 0F, 0F);
		leftArmModel[141].rotateAngleZ = 0.41887902F;

		leftArmModel[142].addShapeBox(-72F, 238F, 27F, 9, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import LeftArm62
		leftArmModel[142].setRotationPoint(0F, 0F, 0F);
		leftArmModel[142].rotateAngleZ = 0.27925268F;

		leftArmModel[143].addShapeBox(9F, 8F, 2F, 18, 35, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm63
		leftArmModel[143].setRotationPoint(0F, 0F, 0F);
		leftArmModel[143].rotateAngleZ = -0.34906585F;

		leftArmModel[144].addShapeBox(11F, -41F, 14F, 10, 10, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import LeftArm64
		leftArmModel[144].setRotationPoint(0F, 0F, 0F);
		leftArmModel[144].rotateAngleZ = -0.34906585F;

		leftArmModel[145].addShapeBox(21F, 26F, 54F, 8, 46, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import LeftArm65
		leftArmModel[145].setRotationPoint(0F, 0F, 0F);
		leftArmModel[145].rotateAngleZ = -0.34906585F;

		leftArmModel[146].addShapeBox(-80F, 136F, 18.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm66
		leftArmModel[146].setRotationPoint(0F, 0F, 0F);
		leftArmModel[146].rotateAngleZ = 0.41887902F;

		leftArmModel[147].addShapeBox(-56F, 238F, 27F, 9, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import LeftArm67
		leftArmModel[147].setRotationPoint(0F, 0F, 0F);
		leftArmModel[147].rotateAngleZ = 0.27925268F;

		leftArmModel[148].addShapeBox(9F, 43F, 2F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import LeftArm68
		leftArmModel[148].setRotationPoint(0F, 0F, 0F);
		leftArmModel[148].rotateAngleZ = -0.34906585F;

		leftArmModel[149].addShapeBox(12F, -44F, 35F, 8, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import LeftArm69
		leftArmModel[149].setRotationPoint(0F, 0F, 0F);
		leftArmModel[149].rotateAngleZ = -0.34906585F;

		leftArmModel[150].addShapeBox(-61F, 87F, 15F, 10, 15, 64, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm7
		leftArmModel[150].setRotationPoint(0F, 0F, 0F);
		leftArmModel[150].rotateAngleZ = 0.41887902F;

		leftArmModel[151].addBox(-30F, 26F, 35F, 59, 7, 23, 0F); // Import LeftArm70
		leftArmModel[151].setRotationPoint(0F, 0F, 0F);
		leftArmModel[151].rotateAngleZ = -0.34906585F;

		leftArmModel[152].addShapeBox(-81.5F, 118F, 17F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm71
		leftArmModel[152].setRotationPoint(0F, 0F, 0F);
		leftArmModel[152].rotateAngleZ = 0.41887902F;

		leftArmModel[153].addShapeBox(-34F, 245F, 56F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm72
		leftArmModel[153].setRotationPoint(0F, 0F, 0F);
		leftArmModel[153].rotateAngleZ = 0.27925268F;

		leftArmModel[154].addShapeBox(14F, 37F, 8F, 8, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm73
		leftArmModel[154].setRotationPoint(0F, 0F, 0F);
		leftArmModel[154].rotateAngleZ = -0.34906585F;

		leftArmModel[155].addBox(-30F, 53F, 35F, 59, 7, 23, 0F); // Import LeftArm74
		leftArmModel[155].setRotationPoint(0F, 0F, 0F);
		leftArmModel[155].rotateAngleZ = -0.34906585F;

		leftArmModel[156].addShapeBox(-34F, 245F, 40F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm75
		leftArmModel[156].setRotationPoint(0F, 0F, 0F);
		leftArmModel[156].rotateAngleZ = 0.27925268F;

		leftArmModel[157].addShapeBox(-81.5F, 150F, 17F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm76
		leftArmModel[157].setRotationPoint(0F, 0F, 0F);
		leftArmModel[157].rotateAngleZ = 0.41887902F;

		leftArmModel[158].addShapeBox(11F, -50F, 56F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm77
		leftArmModel[158].setRotationPoint(0F, 0F, 0F);
		leftArmModel[158].rotateAngleZ = -0.34906585F;

		leftArmModel[159].addShapeBox(-80F, 245F, 56F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm78
		leftArmModel[159].setRotationPoint(0F, 0F, 0F);
		leftArmModel[159].rotateAngleZ = 0.27925268F;

		leftArmModel[160].addShapeBox(11F, -45F, 56F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import LeftArm79
		leftArmModel[160].setRotationPoint(0F, 0F, 0F);
		leftArmModel[160].rotateAngleZ = -0.34906585F;

		leftArmModel[161].addShapeBox(-22F, 50F, 23F, 43, 10, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm8
		leftArmModel[161].setRotationPoint(0F, 0F, 0F);
		leftArmModel[161].rotateAngleZ = -0.34906585F;

		leftArmModel[162].addShapeBox(15F, 38F, 15F, 6, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm80
		leftArmModel[162].setRotationPoint(0F, 0F, 0F);
		leftArmModel[162].rotateAngleZ = -0.34906585F;

		leftArmModel[163].addBox(24F, 33F, 44F, 5, 20, 6, 0F); // Import LeftArm81
		leftArmModel[163].setRotationPoint(0F, 0F, 0F);
		leftArmModel[163].rotateAngleZ = -0.34906585F;

		leftArmModel[164].addShapeBox(-81.5F, 150F, 65F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm82
		leftArmModel[164].setRotationPoint(0F, 0F, 0F);
		leftArmModel[164].rotateAngleZ = 0.41887902F;

		leftArmModel[165].addShapeBox(-80F, 245F, 40F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm83
		leftArmModel[165].setRotationPoint(0F, 0F, 0F);
		leftArmModel[165].rotateAngleZ = 0.27925268F;

		leftArmModel[166].addBox(-30F, 33F, 44F, 5, 20, 6, 0F); // Import LeftArm84
		leftArmModel[166].setRotationPoint(0F, 0F, 0F);
		leftArmModel[166].rotateAngleZ = -0.34906585F;

		leftArmModel[167].addShapeBox(-80F, 136F, 66.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm85
		leftArmModel[167].setRotationPoint(0F, 0F, 0F);
		leftArmModel[167].rotateAngleZ = 0.41887902F;

		leftArmModel[168].addShapeBox(13F, 37F, 41F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm86
		leftArmModel[168].setRotationPoint(0F, 0F, 0F);
		leftArmModel[168].rotateAngleZ = -0.34906585F;

		leftArmModel[169].addShapeBox(-44F, -51F, 63F, 86, 15, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm87
		leftArmModel[169].setRotationPoint(0F, 0F, 0F);
		leftArmModel[169].rotateAngleZ = -0.34906585F;

		leftArmModel[170].addShapeBox(-67F, 245F, 56F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm88
		leftArmModel[170].setRotationPoint(1F, 0F, 0F);
		leftArmModel[170].rotateAngleZ = 0.27925268F;

		leftArmModel[171].addShapeBox(-81.5F, 118F, 65F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm89
		leftArmModel[171].setRotationPoint(0F, 0F, 0F);
		leftArmModel[171].rotateAngleZ = 0.41887902F;

		leftArmModel[172].addShapeBox(-23F, -25F, 22F, 46, 48, 16, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm9
		leftArmModel[172].setRotationPoint(0F, 0F, 0F);
		leftArmModel[172].rotateAngleZ = -0.34906585F;

		leftArmModel[173].addShapeBox(-44F, -51F, 78F, 86, 15, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -15F, -15F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import LeftArm90
		leftArmModel[173].setRotationPoint(0F, 0F, 0F);
		leftArmModel[173].rotateAngleZ = -0.34906585F;

		leftArmModel[174].addShapeBox(13F, 42F, 41F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import LeftArm91
		leftArmModel[174].setRotationPoint(0F, 0F, 0F);
		leftArmModel[174].rotateAngleZ = -0.34906585F;

		leftArmModel[175].addShapeBox(-13F, 28F, 29F, 26, 24, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm92
		leftArmModel[175].setRotationPoint(0F, 0F, 0F);
		leftArmModel[175].rotateAngleZ = -0.34906585F;

		leftArmModel[176].addShapeBox(-101F, 102F, 79F, 52, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm93
		leftArmModel[176].setRotationPoint(0F, 0F, 0F);
		leftArmModel[176].rotateAngleZ = 0.41887902F;

		leftArmModel[177].addShapeBox(-67F, 245F, 40F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm94
		leftArmModel[177].setRotationPoint(1F, 0F, 0F);
		leftArmModel[177].rotateAngleZ = 0.27925268F;

		leftArmModel[178].addShapeBox(-27F, 8F, 2F, 18, 35, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm95
		leftArmModel[178].setRotationPoint(0F, 0F, 0F);
		leftArmModel[178].rotateAngleZ = -0.34906585F;

		leftArmModel[179].addShapeBox(-49F, 245F, 56F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import LeftArm96
		leftArmModel[179].setRotationPoint(1F, 0F, 0F);
		leftArmModel[179].rotateAngleZ = 0.27925268F;

		leftArmModel[180].addShapeBox(-49F, 102F, 61F, 8, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Import LeftArm97
		leftArmModel[180].setRotationPoint(0F, 0F, 0F);
		leftArmModel[180].rotateAngleZ = 0.41887902F;

		leftArmModel[181].addShapeBox(32F, -33F, 54F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm98
		leftArmModel[181].setRotationPoint(0F, 0F, 0F);
		leftArmModel[181].rotateAngleZ = -0.34906585F;

		leftArmModel[182].addShapeBox(-82F, 199F, 68F, 60, 46, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import LeftArm99
		leftArmModel[182].setRotationPoint(0F, 0F, 0F);
		leftArmModel[182].rotateAngleZ = 0.27925268F;
	}
	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1105, 1316, textureX, textureY); // Import RightArm1
		rightArmModel[1] = new ModelRendererTurbo(this, 810, 1817, textureX, textureY); // Import RightArm10
		rightArmModel[2] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import RightArm100
		rightArmModel[3] = new ModelRendererTurbo(this, 1217, 641, textureX, textureY); // Import RightArm101
		rightArmModel[4] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm102
		rightArmModel[5] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import RightArm103
		rightArmModel[6] = new ModelRendererTurbo(this, 987, 397, textureX, textureY); // Import RightArm104
		rightArmModel[7] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm105
		rightArmModel[8] = new ModelRendererTurbo(this, 1171, 1392, textureX, textureY); // Import RightArm106
		rightArmModel[9] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm107
		rightArmModel[10] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import RightArm108
		rightArmModel[11] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm109
		rightArmModel[12] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm11
		rightArmModel[13] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import RightArm110
		rightArmModel[14] = new ModelRendererTurbo(this, 987, 356, textureX, textureY); // Import RightArm111
		rightArmModel[15] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm112
		rightArmModel[16] = new ModelRendererTurbo(this, 1076, 161, textureX, textureY); // Import RightArm113
		rightArmModel[17] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import RightArm114
		rightArmModel[18] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm115
		rightArmModel[19] = new ModelRendererTurbo(this, 987, 498, textureX, textureY); // Import RightArm116
		rightArmModel[20] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // Import RightArm117
		rightArmModel[21] = new ModelRendererTurbo(this, 987, 315, textureX, textureY); // Import RightArm118
		rightArmModel[22] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm119
		rightArmModel[23] = new ModelRendererTurbo(this, 810, 1931, textureX, textureY); // Import RightArm12
		rightArmModel[24] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm120
		rightArmModel[25] = new ModelRendererTurbo(this, 1076, 250, textureX, textureY); // Import RightArm121
		rightArmModel[26] = new ModelRendererTurbo(this, 1076, 303, textureX, textureY); // Import RightArm122
		rightArmModel[27] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm123
		rightArmModel[28] = new ModelRendererTurbo(this, 1134, 1149, textureX, textureY); // Import RightArm124
		rightArmModel[29] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm125
		rightArmModel[30] = new ModelRendererTurbo(this, 1076, 338, textureX, textureY); // Import RightArm126
		rightArmModel[31] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm127
		rightArmModel[32] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm128
		rightArmModel[33] = new ModelRendererTurbo(this, 1126, 427, textureX, textureY); // Import RightArm129
		rightArmModel[34] = new ModelRendererTurbo(this, 810, 1931, textureX, textureY); // Import RightArm13
		rightArmModel[35] = new ModelRendererTurbo(this, 1126, 522, textureX, textureY); // Import RightArm130
		rightArmModel[36] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm131
		rightArmModel[37] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import RightArm132
		rightArmModel[38] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import RightArm133
		rightArmModel[39] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import RightArm134
		rightArmModel[40] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // Import RightArm135
		rightArmModel[41] = new ModelRendererTurbo(this, 1218, 1097, textureX, textureY); // Import RightArm136
		rightArmModel[42] = new ModelRendererTurbo(this, 1135, 1097, textureX, textureY); // Import RightArm137
		rightArmModel[43] = new ModelRendererTurbo(this, 1135, 1097, textureX, textureY); // Import RightArm138
		rightArmModel[44] = new ModelRendererTurbo(this, 1307, 1239, textureX, textureY); // Import RightArm139
		rightArmModel[45] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm14
		rightArmModel[46] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm140
		rightArmModel[47] = new ModelRendererTurbo(this, 1218, 1097, textureX, textureY); // Import RightArm141
		rightArmModel[48] = new ModelRendererTurbo(this, 983, 1823, textureX, textureY); // Import RightArm142
		rightArmModel[49] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import RightArm143
		rightArmModel[50] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm144
		rightArmModel[51] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm145
		rightArmModel[52] = new ModelRendererTurbo(this, 1105, 1232, textureX, textureY); // Import RightArm146
		rightArmModel[53] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm147
		rightArmModel[54] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm148
		rightArmModel[55] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // Import RightArm149
		rightArmModel[56] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // Import RightArm15
		rightArmModel[57] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm150
		rightArmModel[58] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm151
		rightArmModel[59] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm152
		rightArmModel[60] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm153
		rightArmModel[61] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm154
		rightArmModel[62] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm155
		rightArmModel[63] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm156
		rightArmModel[64] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm157
		rightArmModel[65] = new ModelRendererTurbo(this, 1195, 1670, textureX, textureY); // Import RightArm158
		rightArmModel[66] = new ModelRendererTurbo(this, 1196, 1729, textureX, textureY); // Import RightArm159
		rightArmModel[67] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm16
		rightArmModel[68] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import RightArm160
		rightArmModel[69] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import RightArm161
		rightArmModel[70] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import RightArm162
		rightArmModel[71] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // Import RightArm163
		rightArmModel[72] = new ModelRendererTurbo(this, 1186, 1875, textureX, textureY); // Import RightArm164
		rightArmModel[73] = new ModelRendererTurbo(this, 1183, 1936, textureX, textureY); // Import RightArm165
		rightArmModel[74] = new ModelRendererTurbo(this, 1325, 1875, textureX, textureY); // Import RightArm167
		rightArmModel[75] = new ModelRendererTurbo(this, 1392, 1875, textureX, textureY); // Import RightArm168
		rightArmModel[76] = new ModelRendererTurbo(this, 1308, 1936, textureX, textureY); // Import RightArm169
		rightArmModel[77] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm17
		rightArmModel[78] = new ModelRendererTurbo(this, 1379, 1936, textureX, textureY); // Import RightArm170
		rightArmModel[79] = new ModelRendererTurbo(this, 1326, 1670, textureX, textureY); // Import RightArm172
		rightArmModel[80] = new ModelRendererTurbo(this, 1321, 1729, textureX, textureY); // Import RightArm173
		rightArmModel[81] = new ModelRendererTurbo(this, 1405, 1670, textureX, textureY); // Import RightArm174
		rightArmModel[82] = new ModelRendererTurbo(this, 1404, 1729, textureX, textureY); // Import RightArm175
		rightArmModel[83] = new ModelRendererTurbo(this, 1186, 449, textureX, textureY); // Import RightArm176
		rightArmModel[84] = new ModelRendererTurbo(this, 1186, 449, textureX, textureY); // Import RightArm177
		rightArmModel[85] = new ModelRendererTurbo(this, 1211, 419, textureX, textureY); // Import RightArm178
		rightArmModel[86] = new ModelRendererTurbo(this, 1211, 448, textureX, textureY); // Import RightArm179
		rightArmModel[87] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import RightArm18
		rightArmModel[88] = new ModelRendererTurbo(this, 1186, 432, textureX, textureY); // Import RightArm180
		rightArmModel[89] = new ModelRendererTurbo(this, 1186, 419, textureX, textureY); // Import RightArm181
		rightArmModel[90] = new ModelRendererTurbo(this, 1211, 448, textureX, textureY); // Import RightArm182
		rightArmModel[91] = new ModelRendererTurbo(this, 1186, 419, textureX, textureY); // Import RightArm183
		rightArmModel[92] = new ModelRendererTurbo(this, 1211, 419, textureX, textureY); // Import RightArm184
		rightArmModel[93] = new ModelRendererTurbo(this, 1186, 432, textureX, textureY); // Import RightArm185
		rightArmModel[94] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import RightArm19
		rightArmModel[95] = new ModelRendererTurbo(this, 996, 11, textureX, textureY); // Import RightArm2
		rightArmModel[96] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // Import RightArm20
		rightArmModel[97] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // Import RightArm21
		rightArmModel[98] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // Import RightArm22
		rightArmModel[99] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // Import RightArm23
		rightArmModel[100] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import RightArm24
		rightArmModel[101] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import RightArm25
		rightArmModel[102] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import RightArm26
		rightArmModel[103] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // Import RightArm27
		rightArmModel[104] = new ModelRendererTurbo(this, 999, 171, textureX, textureY); // Import RightArm28
		rightArmModel[105] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // Import RightArm29
		rightArmModel[106] = new ModelRendererTurbo(this, 1105, 1351, textureX, textureY); // Import RightArm3
		rightArmModel[107] = new ModelRendererTurbo(this, 1212, 1239, textureX, textureY); // Import RightArm30
		rightArmModel[108] = new ModelRendererTurbo(this, 999, 212, textureX, textureY); // Import RightArm31
		rightArmModel[109] = new ModelRendererTurbo(this, 999, 171, textureX, textureY); // Import RightArm32
		rightArmModel[110] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // Import RightArm33
		rightArmModel[111] = new ModelRendererTurbo(this, 999, 212, textureX, textureY); // Import RightArm34
		rightArmModel[112] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // Import RightArm35
		rightArmModel[113] = new ModelRendererTurbo(this, 999, 253, textureX, textureY); // Import RightArm36
		rightArmModel[114] = new ModelRendererTurbo(this, 1368, 1085, textureX, textureY); // Import RightArm37
		rightArmModel[115] = new ModelRendererTurbo(this, 1368, 1085, textureX, textureY); // Import RightArm38
		rightArmModel[116] = new ModelRendererTurbo(this, 999, 276, textureX, textureY); // Import RightArm39
		rightArmModel[117] = new ModelRendererTurbo(this, 1087, 11, textureX, textureY); // Import RightArm4
		rightArmModel[118] = new ModelRendererTurbo(this, 999, 253, textureX, textureY); // Import RightArm40
		rightArmModel[119] = new ModelRendererTurbo(this, 1368, 1062, textureX, textureY); // Import RightArm41
		rightArmModel[120] = new ModelRendererTurbo(this, 1368, 1062, textureX, textureY); // Import RightArm42
		rightArmModel[121] = new ModelRendererTurbo(this, 999, 276, textureX, textureY); // Import RightArm43
		rightArmModel[122] = new ModelRendererTurbo(this, 1242, 1350, textureX, textureY); // Import RightArm44
		rightArmModel[123] = new ModelRendererTurbo(this, 1176, 11, textureX, textureY); // Import RightArm45
		rightArmModel[124] = new ModelRendererTurbo(this, 1417, 1085, textureX, textureY); // Import RightArm46
		rightArmModel[125] = new ModelRendererTurbo(this, 1007, 605, textureX, textureY); // Import RightArm47
		rightArmModel[126] = new ModelRendererTurbo(this, 1417, 1062, textureX, textureY); // Import RightArm48
		rightArmModel[127] = new ModelRendererTurbo(this, 1417, 1085, textureX, textureY); // Import RightArm49
		rightArmModel[128] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm5
		rightArmModel[129] = new ModelRendererTurbo(this, 1020, 854, textureX, textureY); // Import RightArm50
		rightArmModel[130] = new ModelRendererTurbo(this, 1020, 777, textureX, textureY); // Import RightArm51
		rightArmModel[131] = new ModelRendererTurbo(this, 1417, 1062, textureX, textureY); // Import RightArm52
		rightArmModel[132] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import RightArm53
		rightArmModel[133] = new ModelRendererTurbo(this, 1019, 706, textureX, textureY); // Import RightArm54
		rightArmModel[134] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import RightArm55
		rightArmModel[135] = new ModelRendererTurbo(this, 1076, 106, textureX, textureY); // Import RightArm56
		rightArmModel[136] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import RightArm57
		rightArmModel[137] = new ModelRendererTurbo(this, 1135, 619, textureX, textureY); // Import RightArm58
		rightArmModel[138] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import RightArm59
		rightArmModel[139] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // Import RightArm6
		rightArmModel[140] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import RightArm60
		rightArmModel[141] = new ModelRendererTurbo(this, 1163, 839, textureX, textureY); // Import RightArm61
		rightArmModel[142] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // Import RightArm62
		rightArmModel[143] = new ModelRendererTurbo(this, 1076, 1017, textureX, textureY); // Import RightArm63
		rightArmModel[144] = new ModelRendererTurbo(this, 1242, 1314, textureX, textureY); // Import RightArm64
		rightArmModel[145] = new ModelRendererTurbo(this, 1043, 975, textureX, textureY); // Import RightArm65
		rightArmModel[146] = new ModelRendererTurbo(this, 1273, 1039, textureX, textureY); // Import RightArm66
		rightArmModel[147] = new ModelRendererTurbo(this, 1398, 1445, textureX, textureY); // Import RightArm67
		rightArmModel[148] = new ModelRendererTurbo(this, 1043, 975, textureX, textureY); // Import RightArm68
		rightArmModel[149] = new ModelRendererTurbo(this, 1178, 1017, textureX, textureY); // Import RightArm69
		rightArmModel[150] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // Import RightArm7
		rightArmModel[151] = new ModelRendererTurbo(this, 1295, 1445, textureX, textureY); // Import RightArm70
		rightArmModel[152] = new ModelRendererTurbo(this, 1023, 1017, textureX, textureY); // Import RightArm71
		rightArmModel[153] = new ModelRendererTurbo(this, 1207, 1782, textureX, textureY); // Import RightArm72
		rightArmModel[154] = new ModelRendererTurbo(this, 994, 980, textureX, textureY); // Import RightArm73
		rightArmModel[155] = new ModelRendererTurbo(this, 1398, 1504, textureX, textureY); // Import RightArm74
		rightArmModel[156] = new ModelRendererTurbo(this, 1398, 1575, textureX, textureY); // Import RightArm75
		rightArmModel[157] = new ModelRendererTurbo(this, 1125, 1017, textureX, textureY); // Import RightArm76
		rightArmModel[158] = new ModelRendererTurbo(this, 1200, 1558, textureX, textureY); // Import RightArm77
		rightArmModel[159] = new ModelRendererTurbo(this, 994, 980, textureX, textureY); // Import RightArm78
		rightArmModel[160] = new ModelRendererTurbo(this, 1163, 705, textureX, textureY); // Import RightArm79
		rightArmModel[161] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // Import RightArm8
		rightArmModel[162] = new ModelRendererTurbo(this, 1200, 1469, textureX, textureY); // Import RightArm80
		rightArmModel[163] = new ModelRendererTurbo(this, 1163, 766, textureX, textureY); // Import RightArm81
		rightArmModel[164] = new ModelRendererTurbo(this, 1511, 1453, textureX, textureY); // Import RightArm82
		rightArmModel[165] = new ModelRendererTurbo(this, 1511, 1512, textureX, textureY); // Import RightArm83
		rightArmModel[166] = new ModelRendererTurbo(this, 1240, 706, textureX, textureY); // Import RightArm84
		rightArmModel[167] = new ModelRendererTurbo(this, 1171, 1433, textureX, textureY); // Import RightArm85
		rightArmModel[168] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // Import RightArm86
		rightArmModel[169] = new ModelRendererTurbo(this, 1157, 945, textureX, textureY); // Import RightArm87
		rightArmModel[170] = new ModelRendererTurbo(this, 1511, 1636, textureX, textureY); // Import RightArm88
		rightArmModel[171] = new ModelRendererTurbo(this, 1157, 928, textureX, textureY); // Import RightArm89
		rightArmModel[172] = new ModelRendererTurbo(this, 810, 1817, textureX, textureY); // Import RightArm9
		rightArmModel[173] = new ModelRendererTurbo(this, 1511, 1577, textureX, textureY); // Import RightArm90
		rightArmModel[174] = new ModelRendererTurbo(this, 1497, 1876, textureX, textureY); // Import RightArm91
		rightArmModel[175] = new ModelRendererTurbo(this, 1157, 911, textureX, textureY); // Import RightArm92
		rightArmModel[176] = new ModelRendererTurbo(this, 1458, 1782, textureX, textureY); // Import RightArm93
		rightArmModel[177] = new ModelRendererTurbo(this, 1264, 910, textureX, textureY); // Import RightArm94
		rightArmModel[178] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // Import RightArm95
		rightArmModel[179] = new ModelRendererTurbo(this, 983, 1912, textureX, textureY); // Import RightArm96
		rightArmModel[180] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // Import RightArm97
		rightArmModel[181] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // Import RightArm98
		rightArmModel[182] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // Import RightArm99

		rightArmModel[0].addShapeBox(-23F, 60F, -40F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import RightArm1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -0.34906585F;

		rightArmModel[1].addShapeBox(-83F, 196F, -64F, 62, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm10
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = 0.27925268F;

		rightArmModel[2].addShapeBox(-63.5F, 136F, -27.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm100
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = 0.41887902F;

		rightArmModel[3].addShapeBox(-22F, 52F, -64F, 43, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm101
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -0.34906585F;

		rightArmModel[4].addShapeBox(-65F, 118F, -77F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm102
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = 0.41887902F;

		rightArmModel[5].addShapeBox(-63.5F, 136F, -75.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm103
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = 0.41887902F;

		rightArmModel[6].addShapeBox(27F, -27F, -76F, 15, 40, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm104
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -0.34906585F;

		rightArmModel[7].addShapeBox(-81.5F, 118F, -77F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm105
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = 0.41887902F;

		rightArmModel[8].addShapeBox(-23F, 60F, -68F, 45, 8, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm106
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -0.34906585F;

		rightArmModel[9].addShapeBox(9F, -42F, -18F, 14, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm107
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -0.34906585F;

		rightArmModel[10].addShapeBox(-80F, 136F, -75.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm108
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = 0.41887902F;

		rightArmModel[11].addShapeBox(-81.5F, 118F, -29F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm109
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = 0.41887902F;

		rightArmModel[12].addShapeBox(-82F, 199F, -82F, 60, 46, 15, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm11
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = 0.27925268F;

		rightArmModel[13].addShapeBox(-80F, 136F, -27.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm110
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
		rightArmModel[13].rotateAngleZ = 0.41887902F;

		rightArmModel[14].addShapeBox(27F, -36F, -76F, 15, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm111
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
		rightArmModel[14].rotateAngleZ = -0.34906585F;

		rightArmModel[15].addShapeBox(-97F, 118F, -77F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm112
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
		rightArmModel[15].rotateAngleZ = 0.41887902F;

		rightArmModel[16].addShapeBox(-44F, -51F, -76F, 86, 15, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm113
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
		rightArmModel[16].rotateAngleZ = -0.34906585F;

		rightArmModel[17].addShapeBox(-95.5F, 136F, -75.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm114
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);
		rightArmModel[17].rotateAngleZ = 0.41887902F;

		rightArmModel[18].addShapeBox(-97F, 118F, -29F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm115
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);
		rightArmModel[18].rotateAngleZ = 0.41887902F;

		rightArmModel[19].addShapeBox(-44F, -27F, -76F, 15, 40, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm116
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
		rightArmModel[19].rotateAngleZ = -0.34906585F;

		rightArmModel[20].addShapeBox(-95.5F, 136F, -27.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm117
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
		rightArmModel[20].rotateAngleZ = 0.41887902F;

		rightArmModel[21].addShapeBox(-44F, -36F, -76F, 15, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm118
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
		rightArmModel[21].rotateAngleZ = -0.34906585F;

		rightArmModel[22].addShapeBox(-97F, 150F, -29F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm119
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = 0.41887902F;

		rightArmModel[23].addShapeBox(-40F, 199F, -86F, 7, 46, 19, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm12
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);
		rightArmModel[23].rotateAngleZ = 0.27925268F;

		rightArmModel[24].addShapeBox(-81.5F, 150F, -29F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm120
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);
		rightArmModel[24].rotateAngleZ = 0.41887902F;

		rightArmModel[25].addShapeBox(-44F, -51F, -91F, 86, 15, 15, 0F,-15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm121
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);
		rightArmModel[25].rotateAngleZ = -0.34906585F;

		rightArmModel[26].addShapeBox(-44F, -36F, -91F, 86, 9, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm122
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = -0.34906585F;

		rightArmModel[27].addShapeBox(-65F, 150F, -29F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm123
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);
		rightArmModel[27].rotateAngleZ = 0.41887902F;

		rightArmModel[28].addShapeBox(-25F, 76F, -74F, 50, 15, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm124
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);
		rightArmModel[28].rotateAngleZ = -0.34906585F;

		rightArmModel[29].addShapeBox(9F, 8F, -18F, 18, 35, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm125
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = -0.34906585F;

		rightArmModel[30].addShapeBox(-44F, -27F, -91F, 86, 42, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm126
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = -0.34906585F;

		rightArmModel[31].addShapeBox(-97F, 150F, -77F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm127
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);
		rightArmModel[31].rotateAngleZ = 0.41887902F;

		rightArmModel[32].addShapeBox(-81.5F, 150F, -77F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm128
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);
		rightArmModel[32].rotateAngleZ = 0.41887902F;

		rightArmModel[33].addShapeBox(27F, -27F, -33F, 15, 40, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // Import RightArm129
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);
		rightArmModel[33].rotateAngleZ = -0.34906585F;

		rightArmModel[34].addShapeBox(-73F, 199F, -86F, 7, 46, 19, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm13
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);
		rightArmModel[34].rotateAngleZ = 0.27925268F;

		rightArmModel[35].addShapeBox(-44F, -27F, -33F, 15, 40, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // Import RightArm130
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);
		rightArmModel[35].rotateAngleZ = -0.34906585F;

		rightArmModel[36].addShapeBox(-65F, 150F, -77F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm131
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);
		rightArmModel[36].rotateAngleZ = 0.41887902F;

		rightArmModel[37].addShapeBox(13F, 42F, -52F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import RightArm132
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);
		rightArmModel[37].rotateAngleZ = -0.34906585F;

		rightArmModel[38].addShapeBox(13F, 37F, -52F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm133
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);
		rightArmModel[38].rotateAngleZ = -0.34906585F;

		rightArmModel[39].addShapeBox(-23F, 37F, -52F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm134
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);
		rightArmModel[39].rotateAngleZ = -0.34906585F;

		rightArmModel[40].addShapeBox(-23F, 42F, -52F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import RightArm135
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);
		rightArmModel[40].rotateAngleZ = -0.34906585F;

		rightArmModel[41].addShapeBox(15F, 38F, -43F, 6, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm136
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);
		rightArmModel[41].rotateAngleZ = -0.34906585F;

		rightArmModel[42].addShapeBox(14F, 37F, -34F, 8, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm137
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);
		rightArmModel[42].rotateAngleZ = -0.34906585F;

		rightArmModel[43].addShapeBox(-22F, 37F, -34F, 8, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm138
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);
		rightArmModel[43].rotateAngleZ = -0.34906585F;

		rightArmModel[44].addBox(-25F, 91F, -74F, 26, 12, 16, 0F); // Import RightArm139
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);
		rightArmModel[44].rotateAngleZ = -0.34906585F;

		rightArmModel[45].addShapeBox(-34F, 199F, -55F, 12, 46, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm14
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);
		rightArmModel[45].rotateAngleZ = 0.27925268F;

		rightArmModel[46].addShapeBox(9F, 43F, -18F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import RightArm140
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);
		rightArmModel[46].rotateAngleZ = -0.34906585F;

		rightArmModel[47].addShapeBox(-21F, 38F, -43F, 6, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm141
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);
		rightArmModel[47].rotateAngleZ = -0.34906585F;

		rightArmModel[48].addShapeBox(-76F, 188F, -69F, 50, 20, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm142
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);
		rightArmModel[48].rotateAngleZ = 0.27925268F;

		rightArmModel[49].addShapeBox(-81F, 194F, -38F, 58, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm143
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);
		rightArmModel[49].rotateAngleZ = 0.27925268F;

		rightArmModel[50].addBox(-34F, 199F, -67F, 12, 46, 12, 0F); // Import RightArm144
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);
		rightArmModel[50].rotateAngleZ = 0.27925268F;

		rightArmModel[51].addShapeBox(-23F, -37F, -18F, 14, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm145
		rightArmModel[51].setRotationPoint(0F, 0F, 0F);
		rightArmModel[51].rotateAngleZ = -0.34906585F;

		rightArmModel[52].addShapeBox(1F, 91F, -74F, 24, 12, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Import RightArm146
		rightArmModel[52].setRotationPoint(0F, 0F, 0F);
		rightArmModel[52].rotateAngleZ = -0.34906585F;

		rightArmModel[53].addShapeBox(-82F, 194F, -67F, 60, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm147
		rightArmModel[53].setRotationPoint(0F, 0F, 0F);
		rightArmModel[53].rotateAngleZ = 0.27925268F;

		rightArmModel[54].addBox(-82F, 199F, -67F, 12, 46, 12, 0F); // Import RightArm148
		rightArmModel[54].setRotationPoint(0F, 0F, 0F);
		rightArmModel[54].rotateAngleZ = 0.27925268F;

		rightArmModel[55].addShapeBox(-71F, 82F, -47F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm149
		rightArmModel[55].setRotationPoint(0F, 0F, 0F);
		rightArmModel[55].rotateAngleZ = 0.41887902F;

		rightArmModel[56].addShapeBox(7F, 98F, -72F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm15
		rightArmModel[56].setRotationPoint(0F, 0F, 0F);
		rightArmModel[56].rotateAngleZ = -0.34906585F;

		rightArmModel[57].addShapeBox(-27F, 8F, -18F, 18, 35, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm150
		rightArmModel[57].setRotationPoint(0F, 0F, 0F);
		rightArmModel[57].rotateAngleZ = -0.34906585F;

		rightArmModel[58].addShapeBox(-34F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm151
		rightArmModel[58].setRotationPoint(0F, 0F, 0F);
		rightArmModel[58].rotateAngleZ = 0.27925268F;

		rightArmModel[59].addShapeBox(-49F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm152
		rightArmModel[59].setRotationPoint(1F, 0F, 0F);
		rightArmModel[59].rotateAngleZ = 0.27925268F;

		rightArmModel[60].addShapeBox(-67F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm153
		rightArmModel[60].setRotationPoint(1F, 0F, 0F);
		rightArmModel[60].rotateAngleZ = 0.27925268F;

		rightArmModel[61].addShapeBox(-80F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm154
		rightArmModel[61].setRotationPoint(0F, 0F, 0F);
		rightArmModel[61].rotateAngleZ = 0.27925268F;

		rightArmModel[62].addShapeBox(-80F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm155
		rightArmModel[62].setRotationPoint(0F, 0F, 0F);
		rightArmModel[62].rotateAngleZ = 0.27925268F;

		rightArmModel[63].addShapeBox(-67F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm156
		rightArmModel[63].setRotationPoint(1F, 0F, 0F);
		rightArmModel[63].rotateAngleZ = 0.27925268F;

		rightArmModel[64].addShapeBox(-49F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm157
		rightArmModel[64].setRotationPoint(1F, 0F, 0F);
		rightArmModel[64].rotateAngleZ = 0.27925268F;

		rightArmModel[65].addShapeBox(-101F, 102F, -87F, 52, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm158
		rightArmModel[65].setRotationPoint(0F, 0F, 0F);
		rightArmModel[65].rotateAngleZ = 0.41887902F;

		rightArmModel[66].addShapeBox(-101F, 146F, -85F, 52, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm159
		rightArmModel[66].setRotationPoint(0F, 0F, 0F);
		rightArmModel[66].rotateAngleZ = 0.41887902F;

		rightArmModel[67].addShapeBox(-23F, -42F, -18F, 14, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm16
		rightArmModel[67].setRotationPoint(0F, 0F, 0F);
		rightArmModel[67].rotateAngleZ = -0.34906585F;

		rightArmModel[68].addShapeBox(-106F, 128F, -67F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm160
		rightArmModel[68].setRotationPoint(0F, 0F, 0F);
		rightArmModel[68].rotateAngleZ = 0.41887902F;

		rightArmModel[69].addShapeBox(-101F, 128F, -84F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm161
		rightArmModel[69].setRotationPoint(0F, 0F, 0F);
		rightArmModel[69].rotateAngleZ = 0.41887902F;

		rightArmModel[70].addShapeBox(-54F, 128F, -84F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm162
		rightArmModel[70].setRotationPoint(0F, 0F, 0F);
		rightArmModel[70].rotateAngleZ = 0.41887902F;

		rightArmModel[71].addShapeBox(-49F, 128F, -67F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm163
		rightArmModel[71].setRotationPoint(0F, 0F, 0F);
		rightArmModel[71].rotateAngleZ = 0.41887902F;

		rightArmModel[72].addShapeBox(-101F, 102F, -15F, 52, 26, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm164
		rightArmModel[72].setRotationPoint(0F, 0F, 0F);
		rightArmModel[72].rotateAngleZ = 0.41887902F;

		rightArmModel[73].addShapeBox(-101F, 149F, -15F, 52, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm165
		rightArmModel[73].setRotationPoint(0F, 0F, 0F);
		rightArmModel[73].rotateAngleZ = 0.41887902F;

		rightArmModel[74].addShapeBox(-49F, 102F, -34F, 3, 26, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Import RightArm167
		rightArmModel[74].setRotationPoint(0F, 0F, 0F);
		rightArmModel[74].rotateAngleZ = 0.41887902F;

		rightArmModel[75].addShapeBox(-104F, 102F, -34F, 3, 26, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Import RightArm168
		rightArmModel[75].setRotationPoint(0F, 0F, 0F);
		rightArmModel[75].rotateAngleZ = 0.41887902F;

		rightArmModel[76].addShapeBox(-49F, 149F, -34F, 3, 14, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Import RightArm169
		rightArmModel[76].setRotationPoint(0F, 0F, 0F);
		rightArmModel[76].rotateAngleZ = 0.41887902F;

		rightArmModel[77].addShapeBox(-82F, 199F, -55F, 12, 46, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm17
		rightArmModel[77].setRotationPoint(0F, 0F, 0F);
		rightArmModel[77].rotateAngleZ = 0.27925268F;

		rightArmModel[78].addShapeBox(-104F, 149F, -34F, 3, 14, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Import RightArm170
		rightArmModel[78].setRotationPoint(0F, 0F, 0F);
		rightArmModel[78].rotateAngleZ = 0.41887902F;

		rightArmModel[79].addShapeBox(-49F, 102F, -87F, 8, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm172
		rightArmModel[79].setRotationPoint(0F, 0F, 0F);
		rightArmModel[79].rotateAngleZ = 0.41887902F;

		rightArmModel[80].addShapeBox(-49F, 146F, -85F, 6, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm173
		rightArmModel[80].setRotationPoint(0F, 0F, 0F);
		rightArmModel[80].rotateAngleZ = 0.41887902F;

		rightArmModel[81].addShapeBox(-109F, 102F, -87F, 8, 26, 26, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm174
		rightArmModel[81].setRotationPoint(0F, 0F, 0F);
		rightArmModel[81].rotateAngleZ = 0.41887902F;

		rightArmModel[82].addShapeBox(-107F, 146F, -85F, 6, 17, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm175
		rightArmModel[82].setRotationPoint(0F, 0F, 0F);
		rightArmModel[82].rotateAngleZ = 0.41887902F;

		rightArmModel[83].addBox(32F, -28F, -52F, 5, 1, 12, 0F); // Import RightArm176
		rightArmModel[83].setRotationPoint(0F, 0F, 0F);
		rightArmModel[83].rotateAngleZ = -0.34906585F;

		rightArmModel[84].addBox(-40F, -28F, -52F, 5, 1, 12, 0F); // Import RightArm177
		rightArmModel[84].setRotationPoint(0F, 0F, 0F);
		rightArmModel[84].rotateAngleZ = -0.34906585F;

		rightArmModel[85].addShapeBox(-43F, -33F, -55F, 3, 7, 18, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm178
		rightArmModel[85].setRotationPoint(0F, 0F, 0F);
		rightArmModel[85].rotateAngleZ = -0.34906585F;

		rightArmModel[86].addShapeBox(-35F, -33F, -55F, 3, 7, 18, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm179
		rightArmModel[86].setRotationPoint(0F, 0F, 0F);
		rightArmModel[86].rotateAngleZ = -0.34906585F;

		rightArmModel[87].addShapeBox(-31F, 199F, -38F, 8, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm18
		rightArmModel[87].setRotationPoint(0F, 0F, 0F);
		rightArmModel[87].rotateAngleZ = 0.27925268F;

		rightArmModel[88].addShapeBox(-40F, -33F, -40F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm180
		rightArmModel[88].setRotationPoint(0F, 0F, 0F);
		rightArmModel[88].rotateAngleZ = -0.34906585F;

		rightArmModel[89].addShapeBox(-40F, -33F, -55F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm181
		rightArmModel[89].setRotationPoint(0F, 0F, 0F);
		rightArmModel[89].rotateAngleZ = -0.34906585F;

		rightArmModel[90].addShapeBox(37F, -33F, -55F, 3, 7, 18, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm182
		rightArmModel[90].setRotationPoint(0F, 0F, 0F);
		rightArmModel[90].rotateAngleZ = -0.34906585F;

		rightArmModel[91].addShapeBox(32F, -33F, -55F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm183
		rightArmModel[91].setRotationPoint(0F, 0F, 0F);
		rightArmModel[91].rotateAngleZ = -0.34906585F;

		rightArmModel[92].addShapeBox(29F, -33F, -55F, 3, 7, 18, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm184
		rightArmModel[92].setRotationPoint(0F, 0F, 0F);
		rightArmModel[92].rotateAngleZ = -0.34906585F;

		rightArmModel[93].addShapeBox(32F, -33F, -40F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm185
		rightArmModel[93].setRotationPoint(0F, 0F, 0F);
		rightArmModel[93].rotateAngleZ = -0.34906585F;

		rightArmModel[94].addShapeBox(-81F, 199F, -38F, 8, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm19
		rightArmModel[94].setRotationPoint(0F, 0F, 0F);
		rightArmModel[94].rotateAngleZ = 0.27925268F;

		rightArmModel[95].addShapeBox(9F, -28F, -20F, 18, 54, 20, 0F,0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // Import RightArm2
		rightArmModel[95].setRotationPoint(0F, 0F, 0F);
		rightArmModel[95].rotateAngleZ = -0.34906585F;

		rightArmModel[96].addShapeBox(-81F, 199F, -26F, 58, 44, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Import RightArm20
		rightArmModel[96].setRotationPoint(0F, 0F, 0F);
		rightArmModel[96].rotateAngleZ = 0.27925268F;

		rightArmModel[97].addShapeBox(-40F, 238F, -34F, 9, 5, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm21
		rightArmModel[97].setRotationPoint(0F, 0F, 0F);
		rightArmModel[97].rotateAngleZ = 0.27925268F;

		rightArmModel[98].addShapeBox(-56F, 238F, -34F, 9, 5, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm22
		rightArmModel[98].setRotationPoint(0F, 0F, 0F);
		rightArmModel[98].rotateAngleZ = 0.27925268F;

		rightArmModel[99].addShapeBox(-72F, 238F, -34F, 9, 5, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm23
		rightArmModel[99].setRotationPoint(0F, 0F, 0F);
		rightArmModel[99].rotateAngleZ = 0.27925268F;

		rightArmModel[100].addShapeBox(-34F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import RightArm24
		rightArmModel[100].setRotationPoint(0F, 0F, 0F);
		rightArmModel[100].rotateAngleZ = 0.27925268F;

		rightArmModel[101].addShapeBox(-49F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import RightArm25
		rightArmModel[101].setRotationPoint(0F, 0F, 0F);
		rightArmModel[101].rotateAngleZ = 0.27925268F;

		rightArmModel[102].addShapeBox(-66F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import RightArm26
		rightArmModel[102].setRotationPoint(0F, 0F, 0F);
		rightArmModel[102].rotateAngleZ = 0.27925268F;

		rightArmModel[103].addShapeBox(7F, 88F, -72F, 30, 10, 25, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm27
		rightArmModel[103].setRotationPoint(0F, 0F, 0F);
		rightArmModel[103].rotateAngleZ = -0.34906585F;

		rightArmModel[104].addShapeBox(-21F, -41F, -35F, 10, 10, 21, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm28
		rightArmModel[104].setRotationPoint(0F, 0F, 0F);
		rightArmModel[104].rotateAngleZ = -0.34906585F;

		rightArmModel[105].addShapeBox(-81F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import RightArm29
		rightArmModel[105].setRotationPoint(0F, 0F, 0F);
		rightArmModel[105].rotateAngleZ = 0.27925268F;

		rightArmModel[106].addShapeBox(-23F, 68F, -40F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // Import RightArm3
		rightArmModel[106].setRotationPoint(0F, 0F, 0F);
		rightArmModel[106].rotateAngleZ = -0.34906585F;

		rightArmModel[107].addBox(-25F, 91F, -30F, 26, 12, 16, 0F); // Import RightArm30
		rightArmModel[107].setRotationPoint(0F, 0F, -6F);
		rightArmModel[107].rotateAngleZ = -0.34906585F;

		rightArmModel[108].addShapeBox(-20F, -44F, -58F, 8, 8, 23, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm31
		rightArmModel[108].setRotationPoint(0F, 0F, 0F);
		rightArmModel[108].rotateAngleZ = -0.34906585F;

		rightArmModel[109].addShapeBox(11F, -41F, -35F, 10, 10, 21, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm32
		rightArmModel[109].setRotationPoint(0F, 0F, 0F);
		rightArmModel[109].rotateAngleZ = -0.34906585F;

		rightArmModel[110].addShapeBox(7F, 108F, -72F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import RightArm33
		rightArmModel[110].setRotationPoint(0F, 0F, 0F);
		rightArmModel[110].rotateAngleZ = -0.34906585F;

		rightArmModel[111].addShapeBox(12F, -44F, -58F, 8, 8, 23, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm34
		rightArmModel[111].setRotationPoint(0F, 0F, 0F);
		rightArmModel[111].rotateAngleZ = -0.34906585F;

		rightArmModel[112].addShapeBox(-71F, 72F, -47F, 30, 10, 25, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm35
		rightArmModel[112].setRotationPoint(0F, 0F, 0F);
		rightArmModel[112].rotateAngleZ = 0.41887902F;

		rightArmModel[113].addShapeBox(11F, -50F, -66F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm36
		rightArmModel[113].setRotationPoint(0F, 0F, 0F);
		rightArmModel[113].rotateAngleZ = -0.34906585F;

		rightArmModel[114].addShapeBox(-53F, 91F, -57F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import RightArm37
		rightArmModel[114].setRotationPoint(0F, 0F, 0F);

		rightArmModel[115].addShapeBox(-53F, 91F, -45F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import RightArm38
		rightArmModel[115].setRotationPoint(0F, 0F, 0F);

		rightArmModel[116].addShapeBox(11F, -45F, -66F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import RightArm39
		rightArmModel[116].setRotationPoint(0F, 0F, 0F);
		rightArmModel[116].rotateAngleZ = -0.34906585F;

		rightArmModel[117].addShapeBox(-9F, -28F, -20F, 18, 54, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm4
		rightArmModel[117].setRotationPoint(0F, 0F, 0F);
		rightArmModel[117].rotateAngleZ = -0.34906585F;

		rightArmModel[118].addShapeBox(-21F, -50F, -66F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm40
		rightArmModel[118].setRotationPoint(0F, 0F, 0F);
		rightArmModel[118].rotateAngleZ = -0.34906585F;

		rightArmModel[119].addShapeBox(-65F, 99.5F, -44.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import RightArm41
		rightArmModel[119].setRotationPoint(0F, 0F, 0F);

		rightArmModel[120].addShapeBox(-65F, 99.5F, -56.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import RightArm42
		rightArmModel[120].setRotationPoint(0F, 0F, 0F);

		rightArmModel[121].addShapeBox(-21F, -45F, -66F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import RightArm43
		rightArmModel[121].setRotationPoint(0F, 0F, 0F);
		rightArmModel[121].rotateAngleZ = -0.34906585F;

		rightArmModel[122].addShapeBox(-23F, 68F, -55F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm44
		rightArmModel[122].setRotationPoint(0F, 0F, 0F);
		rightArmModel[122].rotateAngleZ = -0.34906585F;

		rightArmModel[123].addShapeBox(-27F, -28F, -20F, 18, 54, 20, 0F,0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Import RightArm45
		rightArmModel[123].setRotationPoint(0F, 0F, 0F);
		rightArmModel[123].rotateAngleZ = -0.34906585F;

		rightArmModel[124].addShapeBox(-57F, 116F, -57F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import RightArm46
		rightArmModel[124].setRotationPoint(0F, 0F, 0F);

		rightArmModel[125].addShapeBox(-9F, -28F, -56F, 18, 54, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm47
		rightArmModel[125].setRotationPoint(0F, 0F, 0F);
		rightArmModel[125].rotateAngleZ = -0.34906585F;

		rightArmModel[126].addShapeBox(-69F, 102.5F, -56.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import RightArm48
		rightArmModel[126].setRotationPoint(0F, 0F, 0F);

		rightArmModel[127].addShapeBox(-57F, 116F, -45F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import RightArm49
		rightArmModel[127].setRotationPoint(0F, 0F, 0F);

		rightArmModel[128].addShapeBox(-27F, 43F, -18F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import RightArm5
		rightArmModel[128].setRotationPoint(0F, 0F, 0F);
		rightArmModel[128].rotateAngleZ = -0.34906585F;

		rightArmModel[129].addShapeBox(-23F, -25F, -40F, 46, 48, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Import RightArm50
		rightArmModel[129].setRotationPoint(0F, 0F, 0F);
		rightArmModel[129].rotateAngleZ = -0.34906585F;

		rightArmModel[130].addShapeBox(-23F, -25F, -56F, 46, 48, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm51
		rightArmModel[130].setRotationPoint(0F, 0F, 0F);
		rightArmModel[130].rotateAngleZ = -0.34906585F;

		rightArmModel[131].addShapeBox(-69F, 102.5F, -44.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // Import RightArm52
		rightArmModel[131].setRotationPoint(0F, 0F, 0F);

		rightArmModel[132].addShapeBox(-71F, 108.5F, -57F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightArm53
		rightArmModel[132].setRotationPoint(0F, 0F, 0F);

		rightArmModel[133].addShapeBox(-23F, -25F, -72F, 46, 48, 16, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm54
		rightArmModel[133].setRotationPoint(0F, 0F, 0F);
		rightArmModel[133].rotateAngleZ = -0.34906585F;

		rightArmModel[134].addShapeBox(-71F, 103.5F, -57F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm55
		rightArmModel[134].setRotationPoint(0F, 0F, 0F);

		rightArmModel[135].addShapeBox(-30F, -8F, -56F, 58, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm56
		rightArmModel[135].setRotationPoint(0F, 0F, 0F);
		rightArmModel[135].rotateAngleZ = -0.34906585F;

		rightArmModel[136].addShapeBox(-71F, 99.5F, -57F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm57
		rightArmModel[136].setRotationPoint(0F, 0F, 0F);

		rightArmModel[137].addShapeBox(-9F, -28F, -72F, 18, 54, 16, 0F,0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm58
		rightArmModel[137].setRotationPoint(0F, 0F, 0F);
		rightArmModel[137].rotateAngleZ = -0.34906585F;

		rightArmModel[138].addShapeBox(-71F, 99.5F, -45F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm59
		rightArmModel[138].setRotationPoint(0F, 0F, 0F);

		rightArmModel[139].addShapeBox(-71F, 92F, -47F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import RightArm6
		rightArmModel[139].setRotationPoint(0F, 0F, 0F);
		rightArmModel[139].rotateAngleZ = 0.41887902F;

		rightArmModel[140].addShapeBox(-71F, 103.5F, -45F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm60
		rightArmModel[140].setRotationPoint(0F, 0F, 0F);

		rightArmModel[141].addShapeBox(-13F, 28F, -65F, 26, 24, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm61
		rightArmModel[141].setRotationPoint(0F, 0F, 0F);
		rightArmModel[141].rotateAngleZ = -0.34906585F;

		rightArmModel[142].addShapeBox(-71F, 108.5F, -45F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import RightArm62
		rightArmModel[142].setRotationPoint(0F, 0F, 0F);

		rightArmModel[143].addShapeBox(21F, 26F, -67F, 8, 46, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import RightArm63
		rightArmModel[143].setRotationPoint(0F, 0F, 0F);
		rightArmModel[143].rotateAngleZ = -0.34906585F;

		rightArmModel[144].addShapeBox(-23F, 60F, -55F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm64
		rightArmModel[144].setRotationPoint(0F, 0F, 0F);
		rightArmModel[144].rotateAngleZ = -0.34906585F;

		rightArmModel[145].addBox(-30F, 53F, -59F, 59, 7, 23, 0F); // Import RightArm65
		rightArmModel[145].setRotationPoint(0F, 0F, 0F);
		rightArmModel[145].rotateAngleZ = -0.34906585F;

		rightArmModel[146].addShapeBox(-52F, 87.5F, -62F, 12, 44, 30, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 5F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -7F, -2F); // Import RightArm66
		rightArmModel[146].setRotationPoint(0F, 0F, 0F);
		rightArmModel[146].rotateAngleZ = -0.20943951F;

		rightArmModel[147].addShapeBox(-99F, 87F, -37F, 22, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm67
		rightArmModel[147].setRotationPoint(0F, 0F, 0F);
		rightArmModel[147].rotateAngleZ = 0.41887902F;

		rightArmModel[148].addBox(-30F, 26F, -59F, 59, 7, 23, 0F); // Import RightArm68
		rightArmModel[148].setRotationPoint(0F, 0F, 0F);
		rightArmModel[148].rotateAngleZ = -0.34906585F;

		rightArmModel[149].addShapeBox(21F, 26F, -40F, 8, 46, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import RightArm69
		rightArmModel[149].setRotationPoint(0F, 0F, 0F);
		rightArmModel[149].rotateAngleZ = -0.34906585F;

		rightArmModel[150].addShapeBox(-34F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Import RightArm7
		rightArmModel[150].setRotationPoint(0F, 0F, 0F);
		rightArmModel[150].rotateAngleZ = 0.27925268F;

		rightArmModel[151].addShapeBox(-99F, 87F, -79F, 22, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm70
		rightArmModel[151].setRotationPoint(0F, 0F, 0F);
		rightArmModel[151].rotateAngleZ = 0.41887902F;

		rightArmModel[152].addShapeBox(-30F, 26F, -67F, 8, 46, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import RightArm71
		rightArmModel[152].setRotationPoint(0F, 0F, 0F);
		rightArmModel[152].rotateAngleZ = -0.34906585F;

		rightArmModel[153].addShapeBox(-99F, 102F, -79F, 48, 16, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm72
		rightArmModel[153].setRotationPoint(0F, 0F, 0F);
		rightArmModel[153].rotateAngleZ = 0.41887902F;

		rightArmModel[154].addBox(-30F, 33F, -50F, 5, 20, 6, 0F); // Import RightArm73
		rightArmModel[154].setRotationPoint(0F, 0F, 0F);
		rightArmModel[154].rotateAngleZ = -0.34906585F;

		rightArmModel[155].addBox(-127F, 111F, 63F, 28, 46, 20, 0F); // Import RightArm74
		rightArmModel[155].setRotationPoint(0F, 0F, -120F);
		rightArmModel[155].rotateAngleZ = 0.41887902F;

		rightArmModel[156].addShapeBox(-132F, 111F, 63F, 5, 46, 20, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Import RightArm75
		rightArmModel[156].setRotationPoint(0F, 0F, -120F);
		rightArmModel[156].rotateAngleZ = 0.41887902F;

		rightArmModel[157].addShapeBox(-30F, 26F, -40F, 8, 46, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import RightArm76
		rightArmModel[157].setRotationPoint(0F, 0F, 0F);
		rightArmModel[157].rotateAngleZ = -0.34906585F;

		rightArmModel[158].addShapeBox(-77F, 87F, -79F, 16, 15, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm77
		rightArmModel[158].setRotationPoint(0F, 0F, 0F);
		rightArmModel[158].rotateAngleZ = 0.41887902F;

		rightArmModel[159].addBox(24F, 33F, -50F, 5, 20, 6, 0F); // Import RightArm78
		rightArmModel[159].setRotationPoint(0F, 0F, 0F);
		rightArmModel[159].rotateAngleZ = -0.34906585F;

		rightArmModel[160].addShapeBox(9F, 14F, -65F, 12, 19, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm79
		rightArmModel[160].setRotationPoint(0F, 0F, 0F);
		rightArmModel[160].rotateAngleZ = -0.34906585F;

		rightArmModel[161].addShapeBox(-70F, 237F, -67F, 36, 8, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm8
		rightArmModel[161].setRotationPoint(0F, 0F, 0F);
		rightArmModel[161].rotateAngleZ = 0.27925268F;

		rightArmModel[162].addShapeBox(-61F, 87F, -79F, 10, 15, 64, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm80
		rightArmModel[162].setRotationPoint(0F, 0F, 0F);
		rightArmModel[162].rotateAngleZ = 0.41887902F;

		rightArmModel[163].addShapeBox(-22F, 14F, -65F, 12, 19, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm81
		rightArmModel[163].setRotationPoint(0F, 0F, 0F);
		rightArmModel[163].rotateAngleZ = -0.34906585F;

		rightArmModel[164].addBox(-51F, 102F, 64F, 6, 26, 20, 0F); // Import RightArm82
		rightArmModel[164].setRotationPoint(0F, 0F, -120F);
		rightArmModel[164].rotateAngleZ = 0.41887902F;

		rightArmModel[165].addBox(-51F, 145F, 64F, 6, 18, 20, 0F); // Import RightArm83
		rightArmModel[165].setRotationPoint(0F, 0F, -120F);
		rightArmModel[165].rotateAngleZ = 0.41887902F;

		rightArmModel[166].addShapeBox(-22F, 50F, -28F, 43, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Import RightArm84
		rightArmModel[166].setRotationPoint(0F, 0F, 0F);
		rightArmModel[166].rotateAngleZ = -0.34906585F;

		rightArmModel[167].addShapeBox(-23F, 68F, -70F, 45, 8, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm85
		rightArmModel[167].setRotationPoint(0F, 0F, 0F);
		rightArmModel[167].rotateAngleZ = -0.34906585F;

		rightArmModel[168].addShapeBox(9F, -37F, -18F, 14, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm86
		rightArmModel[168].setRotationPoint(0F, 0F, 0F);
		rightArmModel[168].rotateAngleZ = -0.34906585F;

		rightArmModel[169].addShapeBox(-22F, 50F, -71F, 43, 10, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm87
		rightArmModel[169].setRotationPoint(0F, 0F, 0F);
		rightArmModel[169].rotateAngleZ = -0.34906585F;

		rightArmModel[170].addShapeBox(-89F, 135F, -60F, 28, 18, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm88
		rightArmModel[170].setRotationPoint(0F, 0F, 0F);
		rightArmModel[170].rotateAngleZ = 0.41887902F;

		rightArmModel[171].addShapeBox(-22F, 38F, -71F, 43, 6, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm89
		rightArmModel[171].setRotationPoint(0F, 0F, 0F);
		rightArmModel[171].rotateAngleZ = -0.34906585F;

		rightArmModel[172].addShapeBox(-82F, 196F, -35F, 60, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm9
		rightArmModel[172].setRotationPoint(0F, 0F, 0F);
		rightArmModel[172].rotateAngleZ = 0.27925268F;

		rightArmModel[173].addShapeBox(-90F, 118F, -61F, 30, 18, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm90
		rightArmModel[173].setRotationPoint(0F, 0F, 0F);
		rightArmModel[173].rotateAngleZ = 0.41887902F;

		rightArmModel[174].addShapeBox(-99F, 153F, -79F, 48, 10, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm91
		rightArmModel[174].setRotationPoint(0F, 0F, 0F);
		rightArmModel[174].rotateAngleZ = 0.41887902F;

		rightArmModel[175].addShapeBox(-22F, 27F, -71F, 43, 6, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm92
		rightArmModel[175].setRotationPoint(0F, 0F, 0F);
		rightArmModel[175].rotateAngleZ = -0.34906585F;

		rightArmModel[176].addShapeBox(-103F, 163F, -79F, 56, 10, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm93
		rightArmModel[176].setRotationPoint(0F, 0F, 0F);
		rightArmModel[176].rotateAngleZ = 0.41887902F;

		rightArmModel[177].addBox(-11F, 33F, -70F, 22, 17, 6, 0F); // Import RightArm94
		rightArmModel[177].setRotationPoint(0F, 0F, 0F);
		rightArmModel[177].rotateAngleZ = -0.34906585F;

		rightArmModel[178].addBox(-22F, 50F, -67F, 43, 10, 3, 0F); // Import RightArm95
		rightArmModel[178].setRotationPoint(0F, 0F, 0F);
		rightArmModel[178].rotateAngleZ = -0.34906585F;

		rightArmModel[179].addShapeBox(-71F, 178F, -67F, 40, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm96
		rightArmModel[179].setRotationPoint(0F, 0F, 0F);
		rightArmModel[179].rotateAngleZ = 0.27925268F;

		rightArmModel[180].addShapeBox(-65F, 118F, -29F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightArm97
		rightArmModel[180].setRotationPoint(0F, 0F, 0F);
		rightArmModel[180].rotateAngleZ = 0.41887902F;

		rightArmModel[181].addBox(-22F, 38F, -65F, 43, 6, 3, 0F); // Import RightArm98
		rightArmModel[181].setRotationPoint(0F, 0F, 0F);
		rightArmModel[181].rotateAngleZ = -0.34906585F;

		rightArmModel[182].addBox(-22F, 27F, -65F, 43, 6, 3, 0F); // Import RightArm99
		rightArmModel[182].setRotationPoint(0F, 0F, 0F);
		rightArmModel[182].rotateAngleZ = -0.34906585F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 760, 853, textureX, textureY); // LeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 624, 655, textureX, textureY); // LeftLeg10
		leftLegModel[2] = new ModelRendererTurbo(this, 1021, 1501, textureX, textureY); // LeftLeg100
		leftLegModel[3] = new ModelRendererTurbo(this, 479, 1505, textureX, textureY); // LeftLeg101
		leftLegModel[4] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // LeftLeg102
		leftLegModel[5] = new ModelRendererTurbo(this, 493, 559, textureX, textureY); // LeftLeg103
		leftLegModel[6] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // LeftLeg104
		leftLegModel[7] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // LeftLeg105
		leftLegModel[8] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // LeftLeg106
		leftLegModel[9] = new ModelRendererTurbo(this, 408, 1659, textureX, textureY); // LeftLeg107
		leftLegModel[10] = new ModelRendererTurbo(this, 493, 559, textureX, textureY); // LeftLeg108
		leftLegModel[11] = new ModelRendererTurbo(this, 493, 559, textureX, textureY); // LeftLeg109
		leftLegModel[12] = new ModelRendererTurbo(this, 624, 792, textureX, textureY); // LeftLeg11
		leftLegModel[13] = new ModelRendererTurbo(this, 559, 1670, textureX, textureY); // LeftLeg110
		leftLegModel[14] = new ModelRendererTurbo(this, 559, 1670, textureX, textureY); // LeftLeg111
		leftLegModel[15] = new ModelRendererTurbo(this, 493, 673, textureX, textureY); // LeftLeg112
		leftLegModel[16] = new ModelRendererTurbo(this, 493, 746, textureX, textureY); // LeftLeg113
		leftLegModel[17] = new ModelRendererTurbo(this, 608, 1708, textureX, textureY); // LeftLeg114
		leftLegModel[18] = new ModelRendererTurbo(this, 484, 1755, textureX, textureY); // LeftLeg115
		leftLegModel[19] = new ModelRendererTurbo(this, 493, 602, textureX, textureY); // LeftLeg116
		leftLegModel[20] = new ModelRendererTurbo(this, 381, 1755, textureX, textureY); // LeftLeg117
		leftLegModel[21] = new ModelRendererTurbo(this, 608, 1671, textureX, textureY); // LeftLeg118
		leftLegModel[22] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // LeftLeg119
		leftLegModel[23] = new ModelRendererTurbo(this, 632, 858, textureX, textureY); // LeftLeg12
		leftLegModel[24] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // LeftLeg120
		leftLegModel[25] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // LeftLeg121
		leftLegModel[26] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // LeftLeg122
		leftLegModel[27] = new ModelRendererTurbo(this, 624, 554, textureX, textureY); // LeftLeg13
		leftLegModel[28] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // LeftLeg14
		leftLegModel[29] = new ModelRendererTurbo(this, 911, 757, textureX, textureY); // LeftLeg15
		leftLegModel[30] = new ModelRendererTurbo(this, 773, 419, textureX, textureY); // LeftLeg16
		leftLegModel[31] = new ModelRendererTurbo(this, 773, 419, textureX, textureY); // LeftLeg17
		leftLegModel[32] = new ModelRendererTurbo(this, 773, 419, textureX, textureY); // LeftLeg18
		leftLegModel[33] = new ModelRendererTurbo(this, 773, 474, textureX, textureY); // LeftLeg19
		leftLegModel[34] = new ModelRendererTurbo(this, 790, 1094, textureX, textureY); // LeftLeg2
		leftLegModel[35] = new ModelRendererTurbo(this, 773, 474, textureX, textureY); // LeftLeg20
		leftLegModel[36] = new ModelRendererTurbo(this, 773, 474, textureX, textureY); // LeftLeg21
		leftLegModel[37] = new ModelRendererTurbo(this, 815, 781, textureX, textureY); // LeftLeg22
		leftLegModel[38] = new ModelRendererTurbo(this, 815, 781, textureX, textureY); // LeftLeg23
		leftLegModel[39] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // LeftLeg24
		leftLegModel[40] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // LeftLeg25
		leftLegModel[41] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // LeftLeg26
		leftLegModel[42] = new ModelRendererTurbo(this, 869, 1370, textureX, textureY); // LeftLeg27
		leftLegModel[43] = new ModelRendererTurbo(this, 636, 1393, textureX, textureY); // LeftLeg28
		leftLegModel[44] = new ModelRendererTurbo(this, 967, 1171, textureX, textureY); // LeftLeg29
		leftLegModel[45] = new ModelRendererTurbo(this, 814, 980, textureX, textureY); // LeftLeg3
		leftLegModel[46] = new ModelRendererTurbo(this, 681, 1170, textureX, textureY); // LeftLeg30
		leftLegModel[47] = new ModelRendererTurbo(this, 678, 1338, textureX, textureY); // LeftLeg31
		leftLegModel[48] = new ModelRendererTurbo(this, 678, 1289, textureX, textureY); // LeftLeg32
		leftLegModel[49] = new ModelRendererTurbo(this, 779, 1340, textureX, textureY); // LeftLeg33
		leftLegModel[50] = new ModelRendererTurbo(this, 779, 1291, textureX, textureY); // LeftLeg34
		leftLegModel[51] = new ModelRendererTurbo(this, 779, 1340, textureX, textureY); // LeftLeg35
		leftLegModel[52] = new ModelRendererTurbo(this, 779, 1291, textureX, textureY); // LeftLeg36
		leftLegModel[53] = new ModelRendererTurbo(this, 890, 1170, textureX, textureY); // LeftLeg37
		leftLegModel[54] = new ModelRendererTurbo(this, 31, 1794, textureX, textureY); // LeftLeg38
		leftLegModel[55] = new ModelRendererTurbo(this, 112, 1741, textureX, textureY); // LeftLeg39
		leftLegModel[56] = new ModelRendererTurbo(this, 632, 893, textureX, textureY); // LeftLeg4
		leftLegModel[57] = new ModelRendererTurbo(this, 174, 1794, textureX, textureY); // LeftLeg40
		leftLegModel[58] = new ModelRendererTurbo(this, 605, 978, textureX, textureY); // LeftLeg41
		leftLegModel[59] = new ModelRendererTurbo(this, 77, 1741, textureX, textureY); // LeftLeg42
		leftLegModel[60] = new ModelRendererTurbo(this, 155, 1741, textureX, textureY); // LeftLeg43
		leftLegModel[61] = new ModelRendererTurbo(this, 198, 1741, textureX, textureY); // LeftLeg44
		leftLegModel[62] = new ModelRendererTurbo(this, 239, 1794, textureX, textureY); // LeftLeg45
		leftLegModel[63] = new ModelRendererTurbo(this, 298, 1794, textureX, textureY); // LeftLeg46
		leftLegModel[64] = new ModelRendererTurbo(this, 298, 1825, textureX, textureY); // LeftLeg47
		leftLegModel[65] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg48
		leftLegModel[66] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg49
		leftLegModel[67] = new ModelRendererTurbo(this, 632, 893, textureX, textureY); // LeftLeg5
		leftLegModel[68] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg50
		leftLegModel[69] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg51
		leftLegModel[70] = new ModelRendererTurbo(this, 968, 1248, textureX, textureY); // LeftLeg52
		leftLegModel[71] = new ModelRendererTurbo(this, 923, 1595, textureX, textureY); // LeftLeg53
		leftLegModel[72] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg54
		leftLegModel[73] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg55
		leftLegModel[74] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg56
		leftLegModel[75] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg57
		leftLegModel[76] = new ModelRendererTurbo(this, 155, 1741, textureX, textureY); // LeftLeg58
		leftLegModel[77] = new ModelRendererTurbo(this, 198, 1741, textureX, textureY); // LeftLeg59
		leftLegModel[78] = new ModelRendererTurbo(this, 632, 893, textureX, textureY); // LeftLeg6
		leftLegModel[79] = new ModelRendererTurbo(this, 112, 1741, textureX, textureY); // LeftLeg60
		leftLegModel[80] = new ModelRendererTurbo(this, 77, 1741, textureX, textureY); // LeftLeg61
		leftLegModel[81] = new ModelRendererTurbo(this, 31, 1794, textureX, textureY); // LeftLeg62
		leftLegModel[82] = new ModelRendererTurbo(this, 1010, 1093, textureX, textureY); // LeftLeg63
		leftLegModel[83] = new ModelRendererTurbo(this, 239, 1794, textureX, textureY); // LeftLeg64
		leftLegModel[84] = new ModelRendererTurbo(this, 174, 1794, textureX, textureY); // LeftLeg65
		leftLegModel[85] = new ModelRendererTurbo(this, 298, 1825, textureX, textureY); // LeftLeg66
		leftLegModel[86] = new ModelRendererTurbo(this, 298, 1794, textureX, textureY); // LeftLeg67
		leftLegModel[87] = new ModelRendererTurbo(this, 434, 913, textureX, textureY); // LeftLeg68
		leftLegModel[88] = new ModelRendererTurbo(this, 434, 913, textureX, textureY); // LeftLeg69
		leftLegModel[89] = new ModelRendererTurbo(this, 811, 656, textureX, textureY); // LeftLeg7
		leftLegModel[90] = new ModelRendererTurbo(this, 537, 913, textureX, textureY); // LeftLeg70
		leftLegModel[91] = new ModelRendererTurbo(this, 537, 913, textureX, textureY); // LeftLeg71
		leftLegModel[92] = new ModelRendererTurbo(this, 457, 913, textureX, textureY); // LeftLeg72
		leftLegModel[93] = new ModelRendererTurbo(this, 77, 1741, textureX, textureY); // LeftLeg73
		leftLegModel[94] = new ModelRendererTurbo(this, 897, 1093, textureX, textureY); // LeftLeg74
		leftLegModel[95] = new ModelRendererTurbo(this, 198, 1741, textureX, textureY); // LeftLeg75
		leftLegModel[96] = new ModelRendererTurbo(this, 112, 1741, textureX, textureY); // LeftLeg76
		leftLegModel[97] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg77
		leftLegModel[98] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg78
		leftLegModel[99] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg79
		leftLegModel[100] = new ModelRendererTurbo(this, 811, 751, textureX, textureY); // LeftLeg8
		leftLegModel[101] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // LeftLeg80
		leftLegModel[102] = new ModelRendererTurbo(this, 155, 1741, textureX, textureY); // LeftLeg81
		leftLegModel[103] = new ModelRendererTurbo(this, 31, 1794, textureX, textureY); // LeftLeg82
		leftLegModel[104] = new ModelRendererTurbo(this, 298, 1794, textureX, textureY); // LeftLeg83
		leftLegModel[105] = new ModelRendererTurbo(this, 239, 1794, textureX, textureY); // LeftLeg84
		leftLegModel[106] = new ModelRendererTurbo(this, 683, 1129, textureX, textureY); // LeftLeg85
		leftLegModel[107] = new ModelRendererTurbo(this, 174, 1794, textureX, textureY); // LeftLeg86
		leftLegModel[108] = new ModelRendererTurbo(this, 298, 1825, textureX, textureY); // LeftLeg87
		leftLegModel[109] = new ModelRendererTurbo(this, 718, 1696, textureX, textureY); // LeftLeg88
		leftLegModel[110] = new ModelRendererTurbo(this, 947, 1696, textureX, textureY); // LeftLeg89
		leftLegModel[111] = new ModelRendererTurbo(this, 811, 547, textureX, textureY); // LeftLeg9
		leftLegModel[112] = new ModelRendererTurbo(this, 742, 1595, textureX, textureY); // LeftLeg90
		leftLegModel[113] = new ModelRendererTurbo(this, 701, 1501, textureX, textureY); // LeftLeg91
		leftLegModel[114] = new ModelRendererTurbo(this, 876, 1501, textureX, textureY); // LeftLeg92
		leftLegModel[115] = new ModelRendererTurbo(this, 592, 1632, textureX, textureY); // LeftLeg93
		leftLegModel[116] = new ModelRendererTurbo(this, 585, 1597, textureX, textureY); // LeftLeg94
		leftLegModel[117] = new ModelRendererTurbo(this, 464, 1590, textureX, textureY); // LeftLeg95
		leftLegModel[118] = new ModelRendererTurbo(this, 683, 1092, textureX, textureY); // LeftLeg97
		leftLegModel[119] = new ModelRendererTurbo(this, 693, 1595, textureX, textureY); // LeftLeg98
		leftLegModel[120] = new ModelRendererTurbo(this, 693, 1595, textureX, textureY); // LeftLeg99

		leftLegModel[0].addShapeBox(19.5F, 56.5F, -11F, 45, 36, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg1
		leftLegModel[0].setRotationPoint(0F, -175F, 42F);
		leftLegModel[0].rotateAngleZ = -0.34906585F;

		leftLegModel[1].addShapeBox(24.5F, 4.5F, -4F, 17, 56, 70, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // LeftLeg10
		leftLegModel[1].setRotationPoint(0F, -175F, 42F);
		leftLegModel[1].rotateAngleZ = 0.34906585F;

		leftLegModel[2].addShapeBox(39.5F, 151.5F, 4F, 14, 2, 54, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg100
		leftLegModel[2].setRotationPoint(0F, -175F, 42F);

		leftLegModel[3].addBox(6.5F, 127.5F, 13F, 44, 27, 36, 0F); // LeftLeg101
		leftLegModel[3].setRotationPoint(0F, -175F, 42F);
		leftLegModel[3].rotateAngleZ = -0.31415927F;

		leftLegModel[4].addBox(6.5F, 131.5F, 53F, 8, 20, 8, 0F); // LeftLeg102
		leftLegModel[4].setRotationPoint(0F, -175F, 42F);
		leftLegModel[4].rotateAngleZ = -0.31415927F;

		leftLegModel[5].addShapeBox(-25.5F, -10.5F, 0F, 49, 21, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg103
		leftLegModel[5].setRotationPoint(0F, -175F, 42F);
		leftLegModel[5].rotateAngleZ = 0.34906585F;

		leftLegModel[6].addBox(34.5F, 131.5F, 53F, 8, 20, 8, 0F); // LeftLeg104
		leftLegModel[6].setRotationPoint(0F, -175F, 42F);
		leftLegModel[6].rotateAngleZ = -0.31415927F;

		leftLegModel[7].addBox(34.5F, 131.5F, 1F, 8, 20, 8, 0F); // LeftLeg105
		leftLegModel[7].setRotationPoint(0F, -175F, 42F);
		leftLegModel[7].rotateAngleZ = -0.31415927F;

		leftLegModel[8].addBox(6.5F, 131.5F, 1F, 8, 20, 8, 0F); // LeftLeg106
		leftLegModel[8].setRotationPoint(0F, -175F, 42F);
		leftLegModel[8].rotateAngleZ = -0.31415927F;

		leftLegModel[9].addBox(-71.5F, 141.5F, 3F, 13, 33, 54, 0F); // LeftLeg107
		leftLegModel[9].setRotationPoint(0F, -175F, 42F);

		leftLegModel[10].addShapeBox(-25.5F, 10.5F, 0F, 49, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // LeftLeg108
		leftLegModel[10].setRotationPoint(0F, -175F, 42F);
		leftLegModel[10].rotateAngleZ = 0.34906585F;

		leftLegModel[11].addShapeBox(-25.5F, -26.5F, 0F, 49, 16, 10, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg109
		leftLegModel[11].setRotationPoint(0F, -175F, 42F);
		leftLegModel[11].rotateAngleZ = 0.34906585F;

		leftLegModel[12].addShapeBox(-27.5F, -15.5F, 58F, 52, 44, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg11
		leftLegModel[12].setRotationPoint(0F, -175F, 42F);
		leftLegModel[12].rotateAngleZ = 0.34906585F;

		leftLegModel[13].addShapeBox(-78.5F, 141.5F, 7F, 7, 33, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // LeftLeg110
		leftLegModel[13].setRotationPoint(0F, -175F, 42F);

		leftLegModel[14].addShapeBox(-78.5F, 141.5F, 43F, 7, 33, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // LeftLeg111
		leftLegModel[14].setRotationPoint(0F, -175F, 42F);

		leftLegModel[15].addShapeBox(-13.5F, -22.5F, 27F, 25, 45, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg112
		leftLegModel[15].setRotationPoint(0F, -175F, 42F);
		leftLegModel[15].rotateAngleZ = 0.34906585F;

		leftLegModel[16].addShapeBox(-13.5F, -22.5F, 42F, 25, 45, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // LeftLeg113
		leftLegModel[16].setRotationPoint(0F, -175F, 42F);
		leftLegModel[16].rotateAngleZ = 0.34906585F;

		leftLegModel[17].addBox(-75.5F, 108.5F, 21F, 14, 57, 20, 0F); // LeftLeg114
		leftLegModel[17].setRotationPoint(0F, -175F, 42F);

		leftLegModel[18].addBox(-77.5F, 85.5F, 17F, 17, 23, 28, 0F); // LeftLeg115
		leftLegModel[18].setRotationPoint(0F, -175F, 42F);

		leftLegModel[19].addShapeBox(-13.5F, -22.5F, 12F, 25, 45, 15, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg116
		leftLegModel[19].setRotationPoint(0F, -175F, 42F);
		leftLegModel[19].rotateAngleZ = 0.34906585F;

		leftLegModel[20].addShapeBox(-77.5F, 79.5F, 17F, 17, 6, 28, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg117
		leftLegModel[20].setRotationPoint(0F, -175F, 42F);

		leftLegModel[21].addShapeBox(-79.5F, 162.5F, 22F, 8, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg118
		leftLegModel[21].setRotationPoint(0F, -176F, 42F);

		leftLegModel[22].addShapeBox(11.5F, -20.5F, 1F, 8, 40, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg119
		leftLegModel[22].setRotationPoint(0F, -175F, 42F);
		leftLegModel[22].rotateAngleZ = 0.34906585F;

		leftLegModel[23].addShapeBox(-27.5F, -27.5F, 58F, 52, 12, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg12
		leftLegModel[23].setRotationPoint(0F, -175F, 42F);
		leftLegModel[23].rotateAngleZ = 0.34906585F;

		leftLegModel[24].addShapeBox(11.5F, -20.5F, 41F, 8, 40, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // LeftLeg120
		leftLegModel[24].setRotationPoint(0F, -175F, 42F);
		leftLegModel[24].rotateAngleZ = 0.34906585F;

		leftLegModel[25].addShapeBox(-26.5F, -20.5F, 1F, 13, 40, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg121
		leftLegModel[25].setRotationPoint(0F, -175F, 42F);
		leftLegModel[25].rotateAngleZ = 0.34906585F;

		leftLegModel[26].addShapeBox(-26.5F, -20.5F, 41F, 13, 40, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // LeftLeg122
		leftLegModel[26].setRotationPoint(0F, -175F, 42F);
		leftLegModel[26].rotateAngleZ = 0.34906585F;

		leftLegModel[27].addShapeBox(24.5F, -15.5F, -4F, 17, 20, 70, 0F,0F, 0F, 0F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // LeftLeg13
		leftLegModel[27].setRotationPoint(0F, -175F, 42F);
		leftLegModel[27].rotateAngleZ = 0.34906585F;

		leftLegModel[28].addShapeBox(94.5F, 46.5F, 8F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // LeftLeg14
		leftLegModel[28].setRotationPoint(0F, -175F, 42F);
		leftLegModel[28].rotateAngleZ = -0.34906585F;

		leftLegModel[29].addShapeBox(-19.5F, 49.5F, -4F, 36, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // LeftLeg15
		leftLegModel[29].setRotationPoint(0F, -175F, 42F);
		leftLegModel[29].rotateAngleZ = 0.34906585F;

		leftLegModel[30].addShapeBox(-39.5F, 54.5F, 0.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg16
		leftLegModel[30].setRotationPoint(0F, -175F, 42F);
		leftLegModel[30].rotateAngleZ = 0.34906585F;

		leftLegModel[31].addShapeBox(-39.5F, 42.5F, 0.5F, 36, 12, 30, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg17
		leftLegModel[31].setRotationPoint(0F, -175F, 42F);
		leftLegModel[31].rotateAngleZ = 0.34906585F;

		leftLegModel[32].addShapeBox(-39.5F, 66.5F, 0.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // LeftLeg18
		leftLegModel[32].setRotationPoint(0F, -175F, 42F);
		leftLegModel[32].rotateAngleZ = 0.34906585F;

		leftLegModel[33].addShapeBox(2.5F, 65.5F, 31.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // LeftLeg19
		leftLegModel[33].setRotationPoint(0F, -175F, 42F);
		leftLegModel[33].rotateAngleZ = -0.34906585F;

		leftLegModel[34].addShapeBox(64.5F, 56.5F, -11F, 23, 36, 27, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg2
		leftLegModel[34].setRotationPoint(0F, -175F, 42F);
		leftLegModel[34].rotateAngleZ = -0.34906585F;

		leftLegModel[35].addShapeBox(2.5F, 41.5F, 31.5F, 36, 12, 30, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg20
		leftLegModel[35].setRotationPoint(0F, -175F, 42F);
		leftLegModel[35].rotateAngleZ = -0.34906585F;

		leftLegModel[36].addShapeBox(2.5F, 53.5F, 31.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg21
		leftLegModel[36].setRotationPoint(0F, -175F, 42F);
		leftLegModel[36].rotateAngleZ = -0.34906585F;

		leftLegModel[37].addShapeBox(-8.5F, 26.5F, 0F, 14, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg22
		leftLegModel[37].setRotationPoint(0F, -175F, 42F);
		leftLegModel[37].rotateAngleZ = 0.34906585F;

		leftLegModel[38].addShapeBox(-6.5F, 39.5F, 2F, 10, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg23
		leftLegModel[38].setRotationPoint(0F, -175F, 42F);
		leftLegModel[38].rotateAngleZ = 0.34906585F;

		leftLegModel[39].addShapeBox(94.5F, 46.5F, 45F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // LeftLeg24
		leftLegModel[39].setRotationPoint(0F, -175F, 42F);
		leftLegModel[39].rotateAngleZ = -0.34906585F;

		leftLegModel[40].addShapeBox(94.5F, 73.5F, 45F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // LeftLeg25
		leftLegModel[40].setRotationPoint(0F, -175F, 42F);
		leftLegModel[40].rotateAngleZ = -0.34906585F;

		leftLegModel[41].addShapeBox(94.5F, 73.5F, 8F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // LeftLeg26
		leftLegModel[41].setRotationPoint(0F, -175F, 42F);
		leftLegModel[41].rotateAngleZ = -0.34906585F;

		leftLegModel[42].addShapeBox(65.5F, 128.5F, -11F, 23, 9, 82, 0F,0F, 0F, 0F, 0F, 8F, -12F, 0F, 8F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -12F, 0F, -8F, -12F, 0F, 0F, 0F); // LeftLeg27
		leftLegModel[42].setRotationPoint(0F, -175F, 42F);
		leftLegModel[42].rotateAngleZ = -0.34906585F;

		leftLegModel[43].addShapeBox(-2.5F, 128.5F, -11F, 68, 9, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg28
		leftLegModel[43].setRotationPoint(0F, -175F, 42F);
		leftLegModel[43].rotateAngleZ = -0.34906585F;

		leftLegModel[44].addShapeBox(51.5F, 92.5F, 34F, 27, 36, 30, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 6F, 0F, -10F, 6F, 0F, -10F, 0F, 0F, 5F); // LeftLeg29
		leftLegModel[44].setRotationPoint(0F, -175F, 42F);
		leftLegModel[44].rotateAngleZ = -0.34906585F;

		leftLegModel[45].addShapeBox(87.5F, 42.5F, 4F, 7, 44, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg3
		leftLegModel[45].setRotationPoint(0F, -175F, 42F);
		leftLegModel[45].rotateAngleZ = -0.34906585F;

		leftLegModel[46].addShapeBox(19.5F, 92.5F, -3F, 32, 36, 67, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // LeftLeg30
		leftLegModel[46].setRotationPoint(0F, -175F, 42F);
		leftLegModel[46].rotateAngleZ = -0.34906585F;

		leftLegModel[47].addShapeBox(57.5F, 108.5F, 20F, 20, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg31
		leftLegModel[47].setRotationPoint(0F, -175F, 42F);
		leftLegModel[47].rotateAngleZ = -0.34906585F;

		leftLegModel[48].addShapeBox(59.5F, 92.5F, 22F, 16, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg32
		leftLegModel[48].setRotationPoint(0F, -175F, 42F);
		leftLegModel[48].rotateAngleZ = -0.34906585F;

		leftLegModel[49].addShapeBox(-0.5F, 108.5F, 40F, 20, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg33
		leftLegModel[49].setRotationPoint(0F, -175F, 42F);
		leftLegModel[49].rotateAngleZ = -0.34906585F;

		leftLegModel[50].addShapeBox(1.5F, 92.5F, 42F, 16, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg34
		leftLegModel[50].setRotationPoint(0F, -175F, 42F);
		leftLegModel[50].rotateAngleZ = -0.34906585F;

		leftLegModel[51].addShapeBox(-0.5F, 108.5F, 0F, 20, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg35
		leftLegModel[51].setRotationPoint(0F, -175F, 42F);
		leftLegModel[51].rotateAngleZ = -0.34906585F;

		leftLegModel[52].addShapeBox(1.5F, 92.5F, 2F, 16, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg36
		leftLegModel[52].setRotationPoint(0F, -175F, 42F);
		leftLegModel[52].rotateAngleZ = -0.34906585F;

		leftLegModel[53].addShapeBox(-2.5F, 92.5F, 25F, 22, 36, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg37
		leftLegModel[53].setRotationPoint(0F, -175F, 42F);
		leftLegModel[53].rotateAngleZ = -0.34906585F;

		leftLegModel[54].addShapeBox(-45.5F, 59.5F, 71F, 50, 36, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg38
		leftLegModel[54].setRotationPoint(0F, -175F, 42F);
		leftLegModel[54].rotateAngleZ = 0.43633231F;

		leftLegModel[55].addShapeBox(4.5F, 59.5F, 71F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg39
		leftLegModel[55].setRotationPoint(0F, -175F, 42F);
		leftLegModel[55].rotateAngleZ = 0.43633231F;

		leftLegModel[56].addShapeBox(-13.5F, 22.5F, 27F, 25, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg4
		leftLegModel[56].setRotationPoint(0F, -175F, 42F);
		leftLegModel[56].rotateAngleZ = 0.34906585F;

		leftLegModel[57].addShapeBox(-65.5F, 59.5F, 71F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg40
		leftLegModel[57].setRotationPoint(0F, -175F, 42F);
		leftLegModel[57].rotateAngleZ = 0.43633231F;

		leftLegModel[58].addShapeBox(-2.5F, 68.5F, -6F, 22, 24, 72, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg41
		leftLegModel[58].setRotationPoint(0F, -175F, 42F);
		leftLegModel[58].rotateAngleZ = -0.34906585F;

		leftLegModel[59].addShapeBox(4.5F, 59.5F, 83F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg42
		leftLegModel[59].setRotationPoint(0F, -175F, 42F);
		leftLegModel[59].rotateAngleZ = 0.43633231F;

		leftLegModel[60].addShapeBox(4.5F, 59.5F, 75F, 9, 16, 8, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // LeftLeg43
		leftLegModel[60].setRotationPoint(0F, -175F, 42F);
		leftLegModel[60].rotateAngleZ = 0.43633231F;

		leftLegModel[61].addShapeBox(4.5F, 79.5F, 75F, 9, 16, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg44
		leftLegModel[61].setRotationPoint(0F, -175F, 42F);
		leftLegModel[61].rotateAngleZ = 0.43633231F;

		leftLegModel[62].addShapeBox(-65.5F, 59.5F, 83F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg45
		leftLegModel[62].setRotationPoint(0F, -175F, 42F);
		leftLegModel[62].rotateAngleZ = 0.43633231F;

		leftLegModel[63].addShapeBox(-65.5F, 59.5F, 75F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg46
		leftLegModel[63].setRotationPoint(0F, -175F, 42F);
		leftLegModel[63].rotateAngleZ = 0.43633231F;

		leftLegModel[64].addShapeBox(-65.5F, 81.5F, 75F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg47
		leftLegModel[64].setRotationPoint(0F, -175F, 42F);
		leftLegModel[64].rotateAngleZ = 0.43633231F;

		leftLegModel[65].addBox(2.5F, 70.5F, 75F, 9, 2, 8, 0F); // LeftLeg48
		leftLegModel[65].setRotationPoint(0F, -175F, 42F);
		leftLegModel[65].rotateAngleZ = 0.43633231F;

		leftLegModel[66].addBox(2.5F, 74.5F, 75F, 9, 2, 8, 0F); // LeftLeg49
		leftLegModel[66].setRotationPoint(0F, -175F, 42F);
		leftLegModel[66].rotateAngleZ = 0.43633231F;

		leftLegModel[67].addShapeBox(-13.5F, 15.5F, 42F, 25, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // LeftLeg5
		leftLegModel[67].setRotationPoint(0F, -175F, 42F);
		leftLegModel[67].rotateAngleZ = 0.34906585F;

		leftLegModel[68].addBox(2.5F, 78.5F, 75F, 9, 2, 8, 0F); // LeftLeg50
		leftLegModel[68].setRotationPoint(0F, -175F, 42F);
		leftLegModel[68].rotateAngleZ = 0.43633231F;

		leftLegModel[69].addBox(2.5F, 82.5F, 75F, 9, 2, 8, 0F); // LeftLeg51
		leftLegModel[69].setRotationPoint(0F, -175F, 42F);
		leftLegModel[69].rotateAngleZ = 0.43633231F;

		leftLegModel[70].addShapeBox(51.5F, 92.5F, -4F, 27, 36, 30, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 5F, 6F, 0F, -10F, 6F, 0F, -10F, 0F, 0F, -10F); // LeftLeg52
		leftLegModel[70].setRotationPoint(0F, -175F, 42F);
		leftLegModel[70].rotateAngleZ = -0.34906585F;

		leftLegModel[71].addShapeBox(13.5F, 154.5F, -5F, 32, 20, 70, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // LeftLeg53
		leftLegModel[71].setRotationPoint(0F, -175F, 42F);

		leftLegModel[72].addBox(2.5F, 82.5F, -23F, 9, 2, 8, 0F); // LeftLeg54
		leftLegModel[72].setRotationPoint(0F, -175F, 42F);
		leftLegModel[72].rotateAngleZ = 0.43633231F;

		leftLegModel[73].addBox(2.5F, 78.5F, -23F, 9, 2, 8, 0F); // LeftLeg55
		leftLegModel[73].setRotationPoint(0F, -175F, 42F);
		leftLegModel[73].rotateAngleZ = 0.43633231F;

		leftLegModel[74].addBox(2.5F, 74.5F, -23F, 9, 2, 8, 0F); // LeftLeg56
		leftLegModel[74].setRotationPoint(0F, -175F, 42F);
		leftLegModel[74].rotateAngleZ = 0.43633231F;

		leftLegModel[75].addBox(2.5F, 70.5F, -23F, 9, 2, 8, 0F); // LeftLeg57
		leftLegModel[75].setRotationPoint(0F, -175F, 42F);
		leftLegModel[75].rotateAngleZ = 0.43633231F;

		leftLegModel[76].addShapeBox(4.5F, 59.5F, -23F, 9, 16, 8, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // LeftLeg58
		leftLegModel[76].setRotationPoint(0F, -175F, 42F);
		leftLegModel[76].rotateAngleZ = 0.43633231F;

		leftLegModel[77].addShapeBox(4.5F, 79.5F, -23F, 9, 16, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg59
		leftLegModel[77].setRotationPoint(0F, -175F, 42F);
		leftLegModel[77].rotateAngleZ = 0.43633231F;

		leftLegModel[78].addShapeBox(-13.5F, 15.5F, 20F, 25, 13, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg6
		leftLegModel[78].setRotationPoint(0F, -175F, 42F);
		leftLegModel[78].rotateAngleZ = 0.34906585F;

		leftLegModel[79].addShapeBox(4.5F, 59.5F, -27F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg60
		leftLegModel[79].setRotationPoint(0F, -175F, 42F);
		leftLegModel[79].rotateAngleZ = 0.43633231F;

		leftLegModel[80].addShapeBox(4.5F, 59.5F, -15F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg61
		leftLegModel[80].setRotationPoint(0F, -175F, 42F);
		leftLegModel[80].rotateAngleZ = 0.43633231F;

		leftLegModel[81].addShapeBox(-45.5F, 59.5F, -27F, 50, 36, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg62
		leftLegModel[81].setRotationPoint(0F, -175F, 42F);
		leftLegModel[81].rotateAngleZ = 0.43633231F;

		leftLegModel[82].addShapeBox(64.5F, 56.5F, 44F, 23, 36, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // LeftLeg63
		leftLegModel[82].setRotationPoint(0F, -175F, 42F);
		leftLegModel[82].rotateAngleZ = -0.34906585F;

		leftLegModel[83].addShapeBox(-65.5F, 59.5F, -15F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg64
		leftLegModel[83].setRotationPoint(0F, -175F, 42F);
		leftLegModel[83].rotateAngleZ = 0.43633231F;

		leftLegModel[84].addShapeBox(-65.5F, 59.5F, -27F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg65
		leftLegModel[84].setRotationPoint(0F, -175F, 42F);
		leftLegModel[84].rotateAngleZ = 0.43633231F;

		leftLegModel[85].addShapeBox(-65.5F, 81.5F, -23F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg66
		leftLegModel[85].setRotationPoint(0F, -175F, 42F);
		leftLegModel[85].rotateAngleZ = 0.43633231F;

		leftLegModel[86].addShapeBox(-65.5F, 59.5F, -23F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg67
		leftLegModel[86].setRotationPoint(0F, -175F, 42F);
		leftLegModel[86].rotateAngleZ = 0.43633231F;

		leftLegModel[87].addShapeBox(33.5F, 43.5F, 8F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg68
		leftLegModel[87].setRotationPoint(0F, -175F, 42F);

		leftLegModel[88].addShapeBox(33.5F, 43.5F, 38F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg69
		leftLegModel[88].setRotationPoint(0F, -175F, 42F);

		leftLegModel[89].addShapeBox(-19.5F, 28.5F, 16F, 36, 32, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // LeftLeg7
		leftLegModel[89].setRotationPoint(0F, -175F, 42F);
		leftLegModel[89].rotateAngleZ = 0.34906585F;

		leftLegModel[90].addShapeBox(34.5F, 59.5F, 9F, 14, 23, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg70
		leftLegModel[90].setRotationPoint(0F, -175F, 42F);

		leftLegModel[91].addShapeBox(34.5F, 59.5F, 39F, 14, 23, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg71
		leftLegModel[91].setRotationPoint(0F, -175F, 42F);

		leftLegModel[92].addShapeBox(49.5F, 51.5F, 5F, 4, 16, 52, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // LeftLeg72
		leftLegModel[92].setRotationPoint(0F, -175F, 42F);

		leftLegModel[93].addShapeBox(26.5F, -19.5F, 78F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg73
		leftLegModel[93].setRotationPoint(0F, -175F, 42F);
		leftLegModel[93].rotateAngleZ = 1.09955743F;

		leftLegModel[94].addShapeBox(64.5F, 56.5F, 16F, 23, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg74
		leftLegModel[94].setRotationPoint(0F, -175F, 42F);
		leftLegModel[94].rotateAngleZ = -0.34906585F;

		leftLegModel[95].addShapeBox(26.5F, 0.5F, 70F, 9, 16, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg75
		leftLegModel[95].setRotationPoint(0F, -175F, 42F);
		leftLegModel[95].rotateAngleZ = 1.09955743F;

		leftLegModel[96].addShapeBox(26.5F, -19.5F, 66F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // LeftLeg76
		leftLegModel[96].setRotationPoint(0F, -175F, 42F);
		leftLegModel[96].rotateAngleZ = 1.09955743F;

		leftLegModel[97].addBox(24.5F, 3.5F, 70F, 9, 2, 8, 0F); // LeftLeg77
		leftLegModel[97].setRotationPoint(0F, -175F, 42F);
		leftLegModel[97].rotateAngleZ = 1.09955743F;

		leftLegModel[98].addBox(24.5F, -0.5F, 70F, 9, 2, 8, 0F); // LeftLeg78
		leftLegModel[98].setRotationPoint(0F, -175F, 42F);
		leftLegModel[98].rotateAngleZ = 1.09955743F;

		leftLegModel[99].addBox(24.5F, -4.5F, 70F, 9, 2, 8, 0F); // LeftLeg79
		leftLegModel[99].setRotationPoint(0F, -175F, 42F);
		leftLegModel[99].rotateAngleZ = 1.09955743F;

		leftLegModel[100].addShapeBox(-27.5F, 28.5F, -4F, 8, 25, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // LeftLeg8
		leftLegModel[100].setRotationPoint(0F, -175F, 42F);
		leftLegModel[100].rotateAngleZ = 0.34906585F;

		leftLegModel[101].addBox(24.5F, -8.5F, 70F, 9, 2, 8, 0F); // LeftLeg80
		leftLegModel[101].setRotationPoint(0F, -175F, 42F);
		leftLegModel[101].rotateAngleZ = 1.09955743F;

		leftLegModel[102].addShapeBox(26.5F, -19.5F, 70F, 9, 16, 8, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // LeftLeg81
		leftLegModel[102].setRotationPoint(0F, -175F, 42F);
		leftLegModel[102].rotateAngleZ = 1.09955743F;

		leftLegModel[103].addShapeBox(-23.5F, -19.5F, 66F, 50, 36, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg82
		leftLegModel[103].setRotationPoint(0F, -175F, 42F);
		leftLegModel[103].rotateAngleZ = 1.09955743F;

		leftLegModel[104].addShapeBox(-43.5F, -19.5F, 70F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg83
		leftLegModel[104].setRotationPoint(0F, -175F, 42F);
		leftLegModel[104].rotateAngleZ = 1.09955743F;

		leftLegModel[105].addShapeBox(-43.5F, -19.5F, 78F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg84
		leftLegModel[105].setRotationPoint(0F, -175F, 42F);
		leftLegModel[105].rotateAngleZ = 1.09955743F;

		leftLegModel[106].addShapeBox(64.5F, 48.5F, 53F, 23, 8, 18, 0F,0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // LeftLeg85
		leftLegModel[106].setRotationPoint(0F, -175F, 42F);
		leftLegModel[106].rotateAngleZ = -0.34906585F;

		leftLegModel[107].addShapeBox(-43.5F, -19.5F, 66F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg86
		leftLegModel[107].setRotationPoint(0F, -175F, 42F);
		leftLegModel[107].rotateAngleZ = 1.09955743F;

		leftLegModel[108].addShapeBox(-43.5F, 2.5F, 70F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // LeftLeg87
		leftLegModel[108].setRotationPoint(0F, -175F, 42F);
		leftLegModel[108].rotateAngleZ = 1.09955743F;

		leftLegModel[109].addShapeBox(-29.5F, 154.5F, -5F, 40, 20, 70, 0F,0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg88
		leftLegModel[109].setRotationPoint(0F, -175F, 42F);

		leftLegModel[110].addShapeBox(-65.5F, 144.5F, -5F, 36, 30, 70, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // LeftLeg89
		leftLegModel[110].setRotationPoint(0F, -175F, 42F);

		leftLegModel[111].addShapeBox(16.5F, 28.5F, -4F, 8, 32, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftLeg9
		leftLegModel[111].setRotationPoint(0F, -175F, 42F);
		leftLegModel[111].rotateAngleZ = 0.34906585F;

		leftLegModel[112].addShapeBox(47.5F, 154.5F, -2F, 19, 20, 64, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // LeftLeg90
		leftLegModel[112].setRotationPoint(0F, -175F, 42F);

		leftLegModel[113].addBox(5.5F, 152.5F, -3F, 14, 14, 66, 0F); // LeftLeg91
		leftLegModel[113].setRotationPoint(0F, -175F, 42F);

		leftLegModel[114].addBox(39.5F, 153.5F, 4F, 14, 14, 54, 0F); // LeftLeg92
		leftLegModel[114].setRotationPoint(0F, -175F, 42F);

		leftLegModel[115].addShapeBox(47.5F, 147.5F, -2F, 19, 7, 16, 0F,-3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -12F); // LeftLeg93
		leftLegModel[115].setRotationPoint(0F, -175F, 42F);

		leftLegModel[116].addShapeBox(47.5F, 147.5F, 46F, 19, 7, 16, 0F,-3F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // LeftLeg94
		leftLegModel[116].setRotationPoint(0F, -175F, 42F);

		leftLegModel[117].addBox(61.5F, 147.5F, 6F, 5, 7, 48, 0F); // LeftLeg95
		leftLegModel[117].setRotationPoint(0F, -175F, 42F);

		leftLegModel[118].addShapeBox(64.5F, 48.5F, -11F, 23, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F); // LeftLeg97
		leftLegModel[118].setRotationPoint(0F, -175F, 42F);
		leftLegModel[118].rotateAngleZ = -0.34906585F;

		leftLegModel[119].addShapeBox(66.5F, 151.5F, 9F, 5, 23, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // LeftLeg98
		leftLegModel[119].setRotationPoint(0F, -175F, 42F);

		leftLegModel[120].addShapeBox(66.5F, 151.5F, 41F, 5, 23, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // LeftLeg99
		leftLegModel[120].setRotationPoint(0F, -175F, 42F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 493, 559, textureX, textureY); // RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg10
		rightLegModel[2] = new ModelRendererTurbo(this, 408, 1659, textureX, textureY); // RightLeg100
		rightLegModel[3] = new ModelRendererTurbo(this, 493, 602, textureX, textureY); // RightLeg101
		rightLegModel[4] = new ModelRendererTurbo(this, 559, 1670, textureX, textureY); // RightLeg102
		rightLegModel[5] = new ModelRendererTurbo(this, 559, 1670, textureX, textureY); // RightLeg103
		rightLegModel[6] = new ModelRendererTurbo(this, 608, 1671, textureX, textureY); // RightLeg104
		rightLegModel[7] = new ModelRendererTurbo(this, 608, 1708, textureX, textureY); // RightLeg105
		rightLegModel[8] = new ModelRendererTurbo(this, 484, 1755, textureX, textureY); // RightLeg106
		rightLegModel[9] = new ModelRendererTurbo(this, 381, 1755, textureX, textureY); // RightLeg107
		rightLegModel[10] = new ModelRendererTurbo(this, 239, 1794, textureX, textureY); // RightLeg108
		rightLegModel[11] = new ModelRendererTurbo(this, 298, 1794, textureX, textureY); // RightLeg109
		rightLegModel[12] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg11
		rightLegModel[13] = new ModelRendererTurbo(this, 174, 1794, textureX, textureY); // RightLeg110
		rightLegModel[14] = new ModelRendererTurbo(this, 298, 1825, textureX, textureY); // RightLeg111
		rightLegModel[15] = new ModelRendererTurbo(this, 493, 673, textureX, textureY); // RightLeg112
		rightLegModel[16] = new ModelRendererTurbo(this, 298, 1825, textureX, textureY); // RightLeg113
		rightLegModel[17] = new ModelRendererTurbo(this, 239, 1794, textureX, textureY); // RightLeg114
		rightLegModel[18] = new ModelRendererTurbo(this, 174, 1794, textureX, textureY); // RightLeg115
		rightLegModel[19] = new ModelRendererTurbo(this, 298, 1794, textureX, textureY); // RightLeg116
		rightLegModel[20] = new ModelRendererTurbo(this, 31, 1794, textureX, textureY); // RightLeg117
		rightLegModel[21] = new ModelRendererTurbo(this, 198, 1741, textureX, textureY); // RightLeg118
		rightLegModel[22] = new ModelRendererTurbo(this, 155, 1741, textureX, textureY); // RightLeg119
		rightLegModel[23] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg12
		rightLegModel[24] = new ModelRendererTurbo(this, 77, 1741, textureX, textureY); // RightLeg120
		rightLegModel[25] = new ModelRendererTurbo(this, 112, 1741, textureX, textureY); // RightLeg121
		rightLegModel[26] = new ModelRendererTurbo(this, 77, 1741, textureX, textureY); // RightLeg122
		rightLegModel[27] = new ModelRendererTurbo(this, 632, 893, textureX, textureY); // RightLeg13
		rightLegModel[28] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg14
		rightLegModel[29] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg15
		rightLegModel[30] = new ModelRendererTurbo(this, 31, 1794, textureX, textureY); // RightLeg16
		rightLegModel[31] = new ModelRendererTurbo(this, 77, 1741, textureX, textureY); // RightLeg17
		rightLegModel[32] = new ModelRendererTurbo(this, 198, 1741, textureX, textureY); // RightLeg18
		rightLegModel[33] = new ModelRendererTurbo(this, 112, 1741, textureX, textureY); // RightLeg19
		rightLegModel[34] = new ModelRendererTurbo(this, 493, 746, textureX, textureY); // RightLeg2
		rightLegModel[35] = new ModelRendererTurbo(this, 493, 559, textureX, textureY); // RightLeg2
		rightLegModel[36] = new ModelRendererTurbo(this, 155, 1741, textureX, textureY); // RightLeg20
		rightLegModel[37] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg21
		rightLegModel[38] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg22
		rightLegModel[39] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg23
		rightLegModel[40] = new ModelRendererTurbo(this, 632, 893, textureX, textureY); // RightLeg24
		rightLegModel[41] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg25
		rightLegModel[42] = new ModelRendererTurbo(this, 174, 1794, textureX, textureY); // RightLeg26
		rightLegModel[43] = new ModelRendererTurbo(this, 298, 1825, textureX, textureY); // RightLeg27
		rightLegModel[44] = new ModelRendererTurbo(this, 239, 1794, textureX, textureY); // RightLeg28
		rightLegModel[45] = new ModelRendererTurbo(this, 298, 1794, textureX, textureY); // RightLeg29
		rightLegModel[46] = new ModelRendererTurbo(this, 155, 1741, textureX, textureY); // RightLeg3
		rightLegModel[47] = new ModelRendererTurbo(this, 632, 893, textureX, textureY); // RightLeg30
		rightLegModel[48] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // RightLeg31
		rightLegModel[49] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // RightLeg32
		rightLegModel[50] = new ModelRendererTurbo(this, 911, 757, textureX, textureY); // RightLeg33
		rightLegModel[51] = new ModelRendererTurbo(this, 811, 547, textureX, textureY); // RightLeg34
		rightLegModel[52] = new ModelRendererTurbo(this, 493, 559, textureX, textureY); // RightLeg35
		rightLegModel[53] = new ModelRendererTurbo(this, 624, 655, textureX, textureY); // RightLeg36
		rightLegModel[54] = new ModelRendererTurbo(this, 811, 656, textureX, textureY); // RightLeg37
		rightLegModel[55] = new ModelRendererTurbo(this, 624, 792, textureX, textureY); // RightLeg38
		rightLegModel[56] = new ModelRendererTurbo(this, 624, 554, textureX, textureY); // RightLeg39
		rightLegModel[57] = new ModelRendererTurbo(this, 112, 1741, textureX, textureY); // RightLeg4
		rightLegModel[58] = new ModelRendererTurbo(this, 632, 858, textureX, textureY); // RightLeg40
		rightLegModel[59] = new ModelRendererTurbo(this, 811, 751, textureX, textureY); // RightLeg41
		rightLegModel[60] = new ModelRendererTurbo(this, 773, 419, textureX, textureY); // RightLeg42
		rightLegModel[61] = new ModelRendererTurbo(this, 773, 419, textureX, textureY); // RightLeg43
		rightLegModel[62] = new ModelRendererTurbo(this, 773, 419, textureX, textureY); // RightLeg44
		rightLegModel[63] = new ModelRendererTurbo(this, 605, 978, textureX, textureY); // RightLeg45
		rightLegModel[64] = new ModelRendererTurbo(this, 815, 781, textureX, textureY); // RightLeg46
		rightLegModel[65] = new ModelRendererTurbo(this, 773, 474, textureX, textureY); // RightLeg47
		rightLegModel[66] = new ModelRendererTurbo(this, 773, 474, textureX, textureY); // RightLeg48
		rightLegModel[67] = new ModelRendererTurbo(this, 773, 474, textureX, textureY); // RightLeg49
		rightLegModel[68] = new ModelRendererTurbo(this, 198, 1741, textureX, textureY); // RightLeg5
		rightLegModel[69] = new ModelRendererTurbo(this, 434, 913, textureX, textureY); // RightLeg50
		rightLegModel[70] = new ModelRendererTurbo(this, 434, 913, textureX, textureY); // RightLeg51
		rightLegModel[71] = new ModelRendererTurbo(this, 457, 913, textureX, textureY); // RightLeg52
		rightLegModel[72] = new ModelRendererTurbo(this, 537, 913, textureX, textureY); // RightLeg53
		rightLegModel[73] = new ModelRendererTurbo(this, 537, 913, textureX, textureY); // RightLeg54
		rightLegModel[74] = new ModelRendererTurbo(this, 760, 853, textureX, textureY); // RightLeg55
		rightLegModel[75] = new ModelRendererTurbo(this, 790, 1094, textureX, textureY); // RightLeg56
		rightLegModel[76] = new ModelRendererTurbo(this, 815, 781, textureX, textureY); // RightLeg57
		rightLegModel[77] = new ModelRendererTurbo(this, 897, 1093, textureX, textureY); // RightLeg58
		rightLegModel[78] = new ModelRendererTurbo(this, 1010, 1093, textureX, textureY); // RightLeg59
		rightLegModel[79] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg6
		rightLegModel[80] = new ModelRendererTurbo(this, 683, 1129, textureX, textureY); // RightLeg60
		rightLegModel[81] = new ModelRendererTurbo(this, 683, 1092, textureX, textureY); // RightLeg61
		rightLegModel[82] = new ModelRendererTurbo(this, 814, 980, textureX, textureY); // RightLeg62
		rightLegModel[83] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // RightLeg63
		rightLegModel[84] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // RightLeg64
		rightLegModel[85] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // RightLeg65
		rightLegModel[86] = new ModelRendererTurbo(this, 814, 985, textureX, textureY); // RightLeg66
		rightLegModel[87] = new ModelRendererTurbo(this, 779, 1340, textureX, textureY); // RightLeg68
		rightLegModel[88] = new ModelRendererTurbo(this, 779, 1291, textureX, textureY); // RightLeg69
		rightLegModel[89] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg7
		rightLegModel[90] = new ModelRendererTurbo(this, 890, 1170, textureX, textureY); // RightLeg70
		rightLegModel[91] = new ModelRendererTurbo(this, 779, 1340, textureX, textureY); // RightLeg71
		rightLegModel[92] = new ModelRendererTurbo(this, 779, 1291, textureX, textureY); // RightLeg72
		rightLegModel[93] = new ModelRendererTurbo(this, 681, 1170, textureX, textureY); // RightLeg73
		rightLegModel[94] = new ModelRendererTurbo(this, 967, 1171, textureX, textureY); // RightLeg74
		rightLegModel[95] = new ModelRendererTurbo(this, 636, 1393, textureX, textureY); // RightLeg75
		rightLegModel[96] = new ModelRendererTurbo(this, 869, 1370, textureX, textureY); // RightLeg76
		rightLegModel[97] = new ModelRendererTurbo(this, 968, 1248, textureX, textureY); // RightLeg77
		rightLegModel[98] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // RightLeg78
		rightLegModel[99] = new ModelRendererTurbo(this, 678, 1338, textureX, textureY); // RightLeg79
		rightLegModel[100] = new ModelRendererTurbo(this, 31, 1794, textureX, textureY); // RightLeg8
		rightLegModel[101] = new ModelRendererTurbo(this, 678, 1289, textureX, textureY); // RightLeg80
		rightLegModel[102] = new ModelRendererTurbo(this, 479, 1505, textureX, textureY); // RightLeg81
		rightLegModel[103] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // RightLeg82
		rightLegModel[104] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // RightLeg83
		rightLegModel[105] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // RightLeg84
		rightLegModel[106] = new ModelRendererTurbo(this, 648, 1506, textureX, textureY); // RightLeg85
		rightLegModel[107] = new ModelRendererTurbo(this, 947, 1696, textureX, textureY); // RightLeg86
		rightLegModel[108] = new ModelRendererTurbo(this, 718, 1696, textureX, textureY); // RightLeg87
		rightLegModel[109] = new ModelRendererTurbo(this, 923, 1595, textureX, textureY); // RightLeg88
		rightLegModel[110] = new ModelRendererTurbo(this, 493, 817, textureX, textureY); // RightLeg89
		rightLegModel[111] = new ModelRendererTurbo(this, 30, 1741, textureX, textureY); // RightLeg9
		rightLegModel[112] = new ModelRendererTurbo(this, 742, 1595, textureX, textureY); // RightLeg90
		rightLegModel[113] = new ModelRendererTurbo(this, 585, 1597, textureX, textureY); // RightLeg91
		rightLegModel[114] = new ModelRendererTurbo(this, 464, 1590, textureX, textureY); // RightLeg92
		rightLegModel[115] = new ModelRendererTurbo(this, 592, 1632, textureX, textureY); // RightLeg93
		rightLegModel[116] = new ModelRendererTurbo(this, 693, 1595, textureX, textureY); // RightLeg94
		rightLegModel[117] = new ModelRendererTurbo(this, 693, 1595, textureX, textureY); // RightLeg95
		rightLegModel[118] = new ModelRendererTurbo(this, 1021, 1501, textureX, textureY); // RightLeg96
		rightLegModel[119] = new ModelRendererTurbo(this, 876, 1501, textureX, textureY); // RightLeg97
		rightLegModel[120] = new ModelRendererTurbo(this, 701, 1501, textureX, textureY); // RightLeg98

		rightLegModel[0].addShapeBox(-25.5F, -26.5F, -10F, 49, 16, 10, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg1
		rightLegModel[0].setRotationPoint(0F, -175F, -42F);
		rightLegModel[0].rotateAngleZ = 0.34906585F;

		rightLegModel[1].addBox(2.5F, 70.5F, -83F, 9, 2, 8, 0F); // RightLeg10
		rightLegModel[1].setRotationPoint(0F, -175F, -42F);
		rightLegModel[1].rotateAngleZ = 0.43633231F;

		rightLegModel[2].addBox(-71.5F, 141.5F, -57F, 13, 33, 54, 0F); // RightLeg100
		rightLegModel[2].setRotationPoint(0F, -175F, -42F);

		rightLegModel[3].addShapeBox(-13.5F, -22.5F, -56F, 25, 45, 15, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg101
		rightLegModel[3].setRotationPoint(0F, -175F, -42F);
		rightLegModel[3].rotateAngleZ = 0.34906585F;

		rightLegModel[4].addShapeBox(-78.5F, 141.5F, -17F, 7, 33, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // RightLeg102
		rightLegModel[4].setRotationPoint(0F, -175F, -42F);

		rightLegModel[5].addShapeBox(-78.5F, 141.5F, -53F, 7, 33, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // RightLeg103
		rightLegModel[5].setRotationPoint(0F, -175F, -42F);

		rightLegModel[6].addShapeBox(-79.5F, 162.5F, -38F, 8, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg104
		rightLegModel[6].setRotationPoint(0F, -176F, -42F);

		rightLegModel[7].addBox(-75.5F, 108.5F, -39F, 14, 57, 20, 0F); // RightLeg105
		rightLegModel[7].setRotationPoint(0F, -175F, -42F);

		rightLegModel[8].addBox(-77.5F, 85.5F, -43F, 17, 23, 28, 0F); // RightLeg106
		rightLegModel[8].setRotationPoint(0F, -175F, -42F);

		rightLegModel[9].addShapeBox(-77.5F, 79.5F, -43F, 17, 6, 28, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg107
		rightLegModel[9].setRotationPoint(0F, -175F, -42F);

		rightLegModel[10].addShapeBox(-65.5F, 59.5F, -75F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg108
		rightLegModel[10].setRotationPoint(0F, -175F, -42F);
		rightLegModel[10].rotateAngleZ = 0.43633231F;

		rightLegModel[11].addShapeBox(-65.5F, 59.5F, -83F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg109
		rightLegModel[11].setRotationPoint(0F, -175F, -42F);
		rightLegModel[11].rotateAngleZ = 0.43633231F;

		rightLegModel[12].addBox(2.5F, 82.5F, 15F, 9, 2, 8, 0F); // RightLeg11
		rightLegModel[12].setRotationPoint(0F, -175F, -42F);
		rightLegModel[12].rotateAngleZ = 0.43633231F;

		rightLegModel[13].addShapeBox(-65.5F, 59.5F, -87F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg110
		rightLegModel[13].setRotationPoint(0F, -175F, -42F);
		rightLegModel[13].rotateAngleZ = 0.43633231F;

		rightLegModel[14].addShapeBox(-65.5F, 81.5F, -83F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg111
		rightLegModel[14].setRotationPoint(0F, -175F, -42F);
		rightLegModel[14].rotateAngleZ = 0.43633231F;

		rightLegModel[15].addShapeBox(-13.5F, -22.5F, -41F, 25, 45, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg112
		rightLegModel[15].setRotationPoint(0F, -175F, -42F);
		rightLegModel[15].rotateAngleZ = 0.34906585F;

		rightLegModel[16].addShapeBox(-65.5F, 81.5F, 15F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg113
		rightLegModel[16].setRotationPoint(0F, -175F, -42F);
		rightLegModel[16].rotateAngleZ = 0.43633231F;

		rightLegModel[17].addShapeBox(-65.5F, 59.5F, 23F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg114
		rightLegModel[17].setRotationPoint(0F, -175F, -42F);
		rightLegModel[17].rotateAngleZ = 0.43633231F;

		rightLegModel[18].addShapeBox(-65.5F, 59.5F, 11F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg115
		rightLegModel[18].setRotationPoint(0F, -175F, -42F);
		rightLegModel[18].rotateAngleZ = 0.43633231F;

		rightLegModel[19].addShapeBox(-65.5F, 59.5F, 15F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg116
		rightLegModel[19].setRotationPoint(0F, -175F, -42F);
		rightLegModel[19].rotateAngleZ = 0.43633231F;

		rightLegModel[20].addShapeBox(-45.5F, 59.5F, 11F, 50, 36, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg117
		rightLegModel[20].setRotationPoint(0F, -175F, -42F);
		rightLegModel[20].rotateAngleZ = 0.43633231F;

		rightLegModel[21].addShapeBox(4.5F, 79.5F, 15F, 9, 16, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg118
		rightLegModel[21].setRotationPoint(0F, -175F, -42F);
		rightLegModel[21].rotateAngleZ = 0.43633231F;

		rightLegModel[22].addShapeBox(4.5F, 59.5F, 15F, 9, 16, 8, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // RightLeg119
		rightLegModel[22].setRotationPoint(0F, -175F, -42F);
		rightLegModel[22].rotateAngleZ = 0.43633231F;

		rightLegModel[23].addBox(2.5F, 78.5F, 15F, 9, 2, 8, 0F); // RightLeg12
		rightLegModel[23].setRotationPoint(0F, -175F, -42F);
		rightLegModel[23].rotateAngleZ = 0.43633231F;

		rightLegModel[24].addShapeBox(4.5F, 59.5F, 23F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg120
		rightLegModel[24].setRotationPoint(0F, -175F, -42F);
		rightLegModel[24].rotateAngleZ = 0.43633231F;

		rightLegModel[25].addShapeBox(4.5F, 59.5F, 11F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg121
		rightLegModel[25].setRotationPoint(0F, -175F, -42F);
		rightLegModel[25].rotateAngleZ = 0.43633231F;

		rightLegModel[26].addShapeBox(4.5F, 59.5F, -75F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg122
		rightLegModel[26].setRotationPoint(0F, -175F, -42F);
		rightLegModel[26].rotateAngleZ = 0.43633231F;

		rightLegModel[27].addShapeBox(-13.5F, 15.5F, -48F, 25, 13, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg13
		rightLegModel[27].setRotationPoint(0F, -175F, -42F);
		rightLegModel[27].rotateAngleZ = 0.34906585F;

		rightLegModel[28].addBox(2.5F, 74.5F, 15F, 9, 2, 8, 0F); // RightLeg14
		rightLegModel[28].setRotationPoint(0F, -175F, -42F);
		rightLegModel[28].rotateAngleZ = 0.43633231F;

		rightLegModel[29].addBox(2.5F, 70.5F, 15F, 9, 2, 8, 0F); // RightLeg15
		rightLegModel[29].setRotationPoint(0F, -175F, -42F);
		rightLegModel[29].rotateAngleZ = 0.43633231F;

		rightLegModel[30].addShapeBox(-23.5F, -19.5F, -82F, 50, 36, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg16
		rightLegModel[30].setRotationPoint(0F, -175F, -42F);
		rightLegModel[30].rotateAngleZ = 1.09955743F;

		rightLegModel[31].addShapeBox(26.5F, -19.5F, -70F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg17
		rightLegModel[31].setRotationPoint(0F, -175F, -42F);
		rightLegModel[31].rotateAngleZ = 1.09955743F;

		rightLegModel[32].addShapeBox(26.5F, 0.5F, -79F, 9, 16, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg18
		rightLegModel[32].setRotationPoint(0F, -175F, -42F);
		rightLegModel[32].rotateAngleZ = 1.09955743F;

		rightLegModel[33].addShapeBox(26.5F, -19.5F, -82F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg19
		rightLegModel[33].setRotationPoint(0F, -175F, -42F);
		rightLegModel[33].rotateAngleZ = 1.09955743F;

		rightLegModel[34].addShapeBox(-13.5F, -22.5F, -26F, 25, 45, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // RightLeg2
		rightLegModel[34].setRotationPoint(0F, -175F, -42F);
		rightLegModel[34].rotateAngleZ = 0.34906585F;

		rightLegModel[35].addShapeBox(-25.5F, -10.5F, -10F, 49, 21, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg2
		rightLegModel[35].setRotationPoint(0F, -175F, -42F);
		rightLegModel[35].rotateAngleZ = 0.34906585F;

		rightLegModel[36].addShapeBox(26.5F, -19.5F, -78F, 9, 16, 8, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // RightLeg20
		rightLegModel[36].setRotationPoint(0F, -175F, -42F);
		rightLegModel[36].rotateAngleZ = 1.09955743F;

		rightLegModel[37].addBox(24.5F, -8.5F, -79F, 9, 2, 8, 0F); // RightLeg21
		rightLegModel[37].setRotationPoint(0F, -175F, -42F);
		rightLegModel[37].rotateAngleZ = 1.09955743F;

		rightLegModel[38].addBox(24.5F, -4.5F, -79F, 9, 2, 8, 0F); // RightLeg22
		rightLegModel[38].setRotationPoint(0F, -175F, -42F);
		rightLegModel[38].rotateAngleZ = 1.09955743F;

		rightLegModel[39].addBox(24.5F, -0.5F, -79F, 9, 2, 8, 0F); // RightLeg23
		rightLegModel[39].setRotationPoint(0F, -175F, -42F);
		rightLegModel[39].rotateAngleZ = 1.09955743F;

		rightLegModel[40].addShapeBox(-13.5F, 22.5F, -41F, 25, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg24
		rightLegModel[40].setRotationPoint(0F, -175F, -42F);
		rightLegModel[40].rotateAngleZ = 0.34906585F;

		rightLegModel[41].addBox(24.5F, 3.5F, -79F, 9, 2, 8, 0F); // RightLeg25
		rightLegModel[41].setRotationPoint(0F, -175F, -42F);
		rightLegModel[41].rotateAngleZ = 1.09955743F;

		rightLegModel[42].addShapeBox(-43.5F, -19.5F, -82F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg26
		rightLegModel[42].setRotationPoint(0F, -175F, -42F);
		rightLegModel[42].rotateAngleZ = 1.09955743F;

		rightLegModel[43].addShapeBox(-43.5F, 2.5F, -79F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg27
		rightLegModel[43].setRotationPoint(0F, -175F, -42F);
		rightLegModel[43].rotateAngleZ = 1.09955743F;

		rightLegModel[44].addShapeBox(-43.5F, -19.5F, -70F, 20, 36, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg28
		rightLegModel[44].setRotationPoint(0F, -175F, -42F);
		rightLegModel[44].rotateAngleZ = 1.09955743F;

		rightLegModel[45].addShapeBox(-43.5F, -19.5F, -78F, 20, 14, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // RightLeg29
		rightLegModel[45].setRotationPoint(0F, -175F, -42F);
		rightLegModel[45].rotateAngleZ = 1.09955743F;

		rightLegModel[46].addShapeBox(4.5F, 59.5F, -83F, 9, 16, 8, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // RightLeg3
		rightLegModel[46].setRotationPoint(0F, -175F, -42F);
		rightLegModel[46].rotateAngleZ = 0.43633231F;

		rightLegModel[47].addShapeBox(-13.5F, 15.5F, -26F, 25, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // RightLeg30
		rightLegModel[47].setRotationPoint(0F, -175F, -42F);
		rightLegModel[47].rotateAngleZ = 0.34906585F;

		rightLegModel[48].addShapeBox(11.5F, -20.5F, -54F, 8, 40, 14, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg31
		rightLegModel[48].setRotationPoint(0F, -175F, -42F);
		rightLegModel[48].rotateAngleZ = 0.34906585F;

		rightLegModel[49].addShapeBox(-26.5F, -20.5F, -54F, 13, 40, 14, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg32
		rightLegModel[49].setRotationPoint(0F, -175F, -42F);
		rightLegModel[49].rotateAngleZ = 0.34906585F;

		rightLegModel[50].addShapeBox(-19.5F, 49.5F, -16F, 36, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // RightLeg33
		rightLegModel[50].setRotationPoint(0F, -175F, -42F);
		rightLegModel[50].rotateAngleZ = 0.34906585F;

		rightLegModel[51].addShapeBox(16.5F, 28.5F, -66F, 8, 32, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg34
		rightLegModel[51].setRotationPoint(0F, -175F, -42F);
		rightLegModel[51].rotateAngleZ = 0.34906585F;

		rightLegModel[52].addShapeBox(-25.5F, 10.5F, -10F, 49, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // RightLeg35
		rightLegModel[52].setRotationPoint(0F, -175F, -42F);
		rightLegModel[52].rotateAngleZ = 0.34906585F;

		rightLegModel[53].addShapeBox(24.5F, 4.5F, -66F, 17, 56, 70, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // RightLeg36
		rightLegModel[53].setRotationPoint(0F, -175F, -42F);
		rightLegModel[53].rotateAngleZ = 0.34906585F;

		rightLegModel[54].addShapeBox(-19.5F, 28.5F, -66F, 36, 32, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // RightLeg37
		rightLegModel[54].setRotationPoint(0F, -175F, -42F);
		rightLegModel[54].rotateAngleZ = 0.34906585F;

		rightLegModel[55].addShapeBox(-27.5F, -15.5F, -67F, 52, 44, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg38
		rightLegModel[55].setRotationPoint(0F, -175F, -42F);
		rightLegModel[55].rotateAngleZ = 0.34906585F;

		rightLegModel[56].addShapeBox(24.5F, -15.5F, -66F, 17, 20, 70, 0F,0F, 0F, 0F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // RightLeg39
		rightLegModel[56].setRotationPoint(0F, -175F, -42F);
		rightLegModel[56].rotateAngleZ = 0.34906585F;

		rightLegModel[57].addShapeBox(4.5F, 59.5F, -87F, 9, 36, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg4
		rightLegModel[57].setRotationPoint(0F, -175F, -42F);
		rightLegModel[57].rotateAngleZ = 0.43633231F;

		rightLegModel[58].addShapeBox(-27.5F, -27.5F, -66F, 52, 12, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg40
		rightLegModel[58].setRotationPoint(0F, -175F, -42F);
		rightLegModel[58].rotateAngleZ = 0.34906585F;

		rightLegModel[59].addShapeBox(-27.5F, 28.5F, -66F, 8, 25, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // RightLeg41
		rightLegModel[59].setRotationPoint(0F, -175F, -42F);
		rightLegModel[59].rotateAngleZ = 0.34906585F;

		rightLegModel[60].addShapeBox(-39.5F, 66.5F, -31.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // RightLeg42
		rightLegModel[60].setRotationPoint(0F, -175F, -42F);
		rightLegModel[60].rotateAngleZ = 0.34906585F;

		rightLegModel[61].addShapeBox(-39.5F, 54.5F, -31.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg43
		rightLegModel[61].setRotationPoint(0F, -175F, -42F);
		rightLegModel[61].rotateAngleZ = 0.34906585F;

		rightLegModel[62].addShapeBox(-39.5F, 42.5F, -31.5F, 36, 12, 30, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg44
		rightLegModel[62].setRotationPoint(0F, -175F, -42F);
		rightLegModel[62].rotateAngleZ = 0.34906585F;

		rightLegModel[63].addShapeBox(-2.5F, 68.5F, -68F, 22, 24, 72, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg45
		rightLegModel[63].setRotationPoint(0F, -175F, -42F);
		rightLegModel[63].rotateAngleZ = -0.34906585F;

		rightLegModel[64].addShapeBox(-8.5F, 26.5F, -14F, 14, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg46
		rightLegModel[64].setRotationPoint(0F, -175F, -42F);
		rightLegModel[64].rotateAngleZ = 0.34906585F;

		rightLegModel[65].addShapeBox(2.5F, 41.5F, -62.5F, 36, 12, 30, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg47
		rightLegModel[65].setRotationPoint(0F, -175F, -42F);
		rightLegModel[65].rotateAngleZ = -0.34906585F;

		rightLegModel[66].addShapeBox(2.5F, 53.5F, -62.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg48
		rightLegModel[66].setRotationPoint(0F, -175F, -42F);
		rightLegModel[66].rotateAngleZ = -0.34906585F;

		rightLegModel[67].addShapeBox(2.5F, 65.5F, -62.5F, 36, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // RightLeg49
		rightLegModel[67].setRotationPoint(0F, -175F, -42F);
		rightLegModel[67].rotateAngleZ = -0.34906585F;

		rightLegModel[68].addShapeBox(4.5F, 79.5F, -83F, 9, 16, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // RightLeg5
		rightLegModel[68].setRotationPoint(0F, -175F, -42F);
		rightLegModel[68].rotateAngleZ = 0.43633231F;

		rightLegModel[69].addShapeBox(33.5F, 43.5F, -54F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg50
		rightLegModel[69].setRotationPoint(0F, -175F, -42F);

		rightLegModel[70].addShapeBox(33.5F, 43.5F, -24F, 16, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg51
		rightLegModel[70].setRotationPoint(0F, -175F, -42F);

		rightLegModel[71].addShapeBox(49.5F, 51.5F, -57F, 4, 16, 52, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // RightLeg52
		rightLegModel[71].setRotationPoint(0F, -175F, -42F);

		rightLegModel[72].addShapeBox(34.5F, 59.5F, -23F, 14, 23, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg53
		rightLegModel[72].setRotationPoint(0F, -175F, -42F);

		rightLegModel[73].addShapeBox(34.5F, 59.5F, -53F, 14, 23, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg54
		rightLegModel[73].setRotationPoint(0F, -175F, -42F);

		rightLegModel[74].addShapeBox(19.5F, 56.5F, -71F, 45, 36, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg55
		rightLegModel[74].setRotationPoint(0F, -175F, -42F);
		rightLegModel[74].rotateAngleZ = -0.34906585F;

		rightLegModel[75].addShapeBox(64.5F, 56.5F, -72F, 23, 36, 27, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg56
		rightLegModel[75].setRotationPoint(0F, -175F, -42F);
		rightLegModel[75].rotateAngleZ = -0.34906585F;

		rightLegModel[76].addShapeBox(-6.5F, 39.5F, -12F, 10, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg57
		rightLegModel[76].setRotationPoint(0F, -175F, -42F);
		rightLegModel[76].rotateAngleZ = 0.34906585F;

		rightLegModel[77].addShapeBox(64.5F, 56.5F, -46F, 23, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg58
		rightLegModel[77].setRotationPoint(0F, -175F, -42F);
		rightLegModel[77].rotateAngleZ = -0.34906585F;

		rightLegModel[78].addShapeBox(64.5F, 56.5F, -17F, 23, 36, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // RightLeg59
		rightLegModel[78].setRotationPoint(0F, -175F, -42F);
		rightLegModel[78].rotateAngleZ = -0.34906585F;

		rightLegModel[79].addBox(2.5F, 82.5F, -83F, 9, 2, 8, 0F); // RightLeg6
		rightLegModel[79].setRotationPoint(0F, -175F, -42F);
		rightLegModel[79].rotateAngleZ = 0.43633231F;

		rightLegModel[80].addShapeBox(64.5F, 48.5F, -8F, 23, 8, 18, 0F,0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // RightLeg60
		rightLegModel[80].setRotationPoint(0F, -175F, -42F);
		rightLegModel[80].rotateAngleZ = -0.34906585F;

		rightLegModel[81].addShapeBox(64.5F, 48.5F, -72F, 23, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F); // RightLeg61
		rightLegModel[81].setRotationPoint(0F, -175F, -42F);
		rightLegModel[81].rotateAngleZ = -0.34906585F;

		rightLegModel[82].addShapeBox(87.5F, 42.5F, -57F, 7, 44, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg62
		rightLegModel[82].setRotationPoint(0F, -175F, -42F);
		rightLegModel[82].rotateAngleZ = -0.34906585F;

		rightLegModel[83].addShapeBox(94.5F, 46.5F, -53F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // RightLeg63
		rightLegModel[83].setRotationPoint(0F, -175F, -42F);
		rightLegModel[83].rotateAngleZ = -0.34906585F;

		rightLegModel[84].addShapeBox(94.5F, 46.5F, -16F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // RightLeg64
		rightLegModel[84].setRotationPoint(0F, -175F, -42F);
		rightLegModel[84].rotateAngleZ = -0.34906585F;

		rightLegModel[85].addShapeBox(94.5F, 73.5F, -16F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // RightLeg65
		rightLegModel[85].setRotationPoint(0F, -175F, -42F);
		rightLegModel[85].rotateAngleZ = -0.34906585F;

		rightLegModel[86].addShapeBox(94.5F, 73.5F, -53F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // RightLeg66
		rightLegModel[86].setRotationPoint(0F, -175F, -42F);
		rightLegModel[86].rotateAngleZ = -0.34906585F;

		rightLegModel[87].addShapeBox(-0.5F, 108.5F, -22F, 20, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg68
		rightLegModel[87].setRotationPoint(0F, -175F, -42F);
		rightLegModel[87].rotateAngleZ = -0.34906585F;

		rightLegModel[88].addShapeBox(1.5F, 92.5F, -20F, 16, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg69
		rightLegModel[88].setRotationPoint(0F, -175F, -42F);
		rightLegModel[88].rotateAngleZ = -0.34906585F;

		rightLegModel[89].addBox(2.5F, 78.5F, -83F, 9, 2, 8, 0F); // RightLeg7
		rightLegModel[89].setRotationPoint(0F, -175F, -42F);
		rightLegModel[89].rotateAngleZ = 0.43633231F;

		rightLegModel[90].addShapeBox(-2.5F, 92.5F, -37F, 22, 36, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg70
		rightLegModel[90].setRotationPoint(0F, -175F, -42F);
		rightLegModel[90].rotateAngleZ = -0.34906585F;

		rightLegModel[91].addShapeBox(-0.5F, 108.5F, -62F, 20, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg71
		rightLegModel[91].setRotationPoint(0F, -175F, -42F);
		rightLegModel[91].rotateAngleZ = -0.34906585F;

		rightLegModel[92].addShapeBox(1.5F, 92.5F, -60F, 16, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg72
		rightLegModel[92].setRotationPoint(0F, -175F, -42F);
		rightLegModel[92].rotateAngleZ = -0.34906585F;

		rightLegModel[93].addShapeBox(19.5F, 92.5F, -65F, 32, 36, 67, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // RightLeg73
		rightLegModel[93].setRotationPoint(0F, -175F, -42F);
		rightLegModel[93].rotateAngleZ = -0.34906585F;

		rightLegModel[94].addShapeBox(51.5F, 92.5F, -28F, 27, 36, 30, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 6F, 0F, -10F, 6F, 0F, -10F, 0F, 0F, 5F); // RightLeg74
		rightLegModel[94].setRotationPoint(0F, -175F, -42F);
		rightLegModel[94].rotateAngleZ = -0.34906585F;

		rightLegModel[95].addShapeBox(-2.5F, 128.5F, -73F, 68, 9, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg75
		rightLegModel[95].setRotationPoint(0F, -175F, -42F);
		rightLegModel[95].rotateAngleZ = -0.34906585F;

		rightLegModel[96].addShapeBox(65.5F, 128.5F, -73F, 23, 9, 82, 0F,0F, 0F, 0F, 0F, 8F, -12F, 0F, 8F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -12F, 0F, -8F, -12F, 0F, 0F, 0F); // RightLeg76
		rightLegModel[96].setRotationPoint(0F, -175F, -42F);
		rightLegModel[96].rotateAngleZ = -0.34906585F;

		rightLegModel[97].addShapeBox(51.5F, 92.5F, -66F, 27, 36, 30, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 5F, 6F, 0F, -10F, 6F, 0F, -10F, 0F, 0F, -10F); // RightLeg77
		rightLegModel[97].setRotationPoint(0F, -175F, -42F);
		rightLegModel[97].rotateAngleZ = -0.34906585F;

		rightLegModel[98].addShapeBox(-26.5F, -20.5F, -40F, 13, 40, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg78
		rightLegModel[98].setRotationPoint(0F, -175F, -42F);
		rightLegModel[98].rotateAngleZ = 0.34906585F;

		rightLegModel[99].addShapeBox(57.5F, 108.5F, -42F, 20, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg79
		rightLegModel[99].setRotationPoint(0F, -175F, -42F);
		rightLegModel[99].rotateAngleZ = -0.34906585F;

		rightLegModel[100].addShapeBox(-45.5F, 59.5F, -87F, 50, 36, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg8
		rightLegModel[100].setRotationPoint(0F, -175F, -42F);
		rightLegModel[100].rotateAngleZ = 0.43633231F;

		rightLegModel[101].addShapeBox(59.5F, 92.5F, -40F, 16, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg80
		rightLegModel[101].setRotationPoint(0F, -175F, -42F);
		rightLegModel[101].rotateAngleZ = -0.34906585F;

		rightLegModel[102].addBox(6.5F, 127.5F, -48F, 44, 27, 36, 0F); // RightLeg81
		rightLegModel[102].setRotationPoint(0F, -175F, -42F);
		rightLegModel[102].rotateAngleZ = -0.31415927F;

		rightLegModel[103].addBox(6.5F, 131.5F, -60F, 8, 20, 8, 0F); // RightLeg82
		rightLegModel[103].setRotationPoint(0F, -175F, -42F);
		rightLegModel[103].rotateAngleZ = -0.31415927F;

		rightLegModel[104].addBox(34.5F, 131.5F, -60F, 8, 20, 8, 0F); // RightLeg83
		rightLegModel[104].setRotationPoint(0F, -175F, -42F);
		rightLegModel[104].rotateAngleZ = -0.31415927F;

		rightLegModel[105].addBox(6.5F, 131.5F, -8F, 8, 20, 8, 0F); // RightLeg84
		rightLegModel[105].setRotationPoint(0F, -175F, -42F);
		rightLegModel[105].rotateAngleZ = -0.31415927F;

		rightLegModel[106].addBox(34.5F, 131.5F, -8F, 8, 20, 8, 0F); // RightLeg85
		rightLegModel[106].setRotationPoint(0F, -175F, -42F);
		rightLegModel[106].rotateAngleZ = -0.31415927F;

		rightLegModel[107].addShapeBox(-65.5F, 144.5F, -65F, 36, 30, 70, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // RightLeg86
		rightLegModel[107].setRotationPoint(0F, -175F, -42F);

		rightLegModel[108].addShapeBox(-29.5F, 154.5F, -65F, 40, 20, 70, 0F,0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg87
		rightLegModel[108].setRotationPoint(0F, -175F, -42F);

		rightLegModel[109].addShapeBox(13.5F, 154.5F, -65F, 32, 20, 70, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // RightLeg88
		rightLegModel[109].setRotationPoint(0F, -175F, -42F);

		rightLegModel[110].addShapeBox(11.5F, -20.5F, -40F, 8, 40, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg89
		rightLegModel[110].setRotationPoint(0F, -175F, -42F);
		rightLegModel[110].rotateAngleZ = 0.34906585F;

		rightLegModel[111].addBox(2.5F, 74.5F, -83F, 9, 2, 8, 0F); // RightLeg9
		rightLegModel[111].setRotationPoint(0F, -175F, -42F);
		rightLegModel[111].rotateAngleZ = 0.43633231F;

		rightLegModel[112].addShapeBox(47.5F, 154.5F, -62F, 19, 20, 64, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // RightLeg90
		rightLegModel[112].setRotationPoint(0F, -175F, -42F);

		rightLegModel[113].addShapeBox(47.5F, 147.5F, -14F, 19, 7, 16, 0F,-3F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // RightLeg91
		rightLegModel[113].setRotationPoint(0F, -175F, -42F);

		rightLegModel[114].addBox(61.5F, 147.5F, -54F, 5, 7, 48, 0F); // RightLeg92
		rightLegModel[114].setRotationPoint(0F, -175F, -42F);

		rightLegModel[115].addShapeBox(47.5F, 147.5F, -62F, 19, 7, 16, 0F,-3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -12F); // RightLeg93
		rightLegModel[115].setRotationPoint(0F, -175F, -42F);

		rightLegModel[116].addShapeBox(66.5F, 151.5F, -51F, 5, 23, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // RightLeg94
		rightLegModel[116].setRotationPoint(0F, -175F, -42F);

		rightLegModel[117].addShapeBox(66.5F, 151.5F, -19F, 5, 23, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // RightLeg95
		rightLegModel[117].setRotationPoint(0F, -175F, -42F);

		rightLegModel[118].addShapeBox(39.5F, 151.5F, -56F, 14, 2, 54, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightLeg96
		rightLegModel[118].setRotationPoint(0F, -175F, -42F);

		rightLegModel[119].addBox(39.5F, 153.5F, -56F, 14, 14, 54, 0F); // RightLeg97
		rightLegModel[119].setRotationPoint(0F, -175F, -42F);

		rightLegModel[120].addBox(5.5F, 152.5F, -63F, 14, 14, 66, 0F); // RightLeg98
		rightLegModel[120].setRotationPoint(0F, -175F, -42F);
	}
}