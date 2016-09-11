//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB44 extends ModelVehicle //Same as Filename
{
	int textureX = 4096;
	int textureY = 4096;

	public ModelB44() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[342];
		turretModel = new ModelRendererTurbo[121];
		barrelModel = new ModelRendererTurbo[48];
		leftTrackModel = new ModelRendererTurbo[742];
		rightTrackModel = new ModelRendererTurbo[742];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackModel_1();
		initleftTrackModel_2();
		initrightTrackModel_1();
		initrightTrackModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import Box4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Import Box5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Box6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import Box7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import Box8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Import Box9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Box10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import Box11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import Box12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Import Box13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import Box15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Import Box16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box17
		bodyModel[16] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import Box18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import Box81
		bodyModel[18] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box82
		bodyModel[19] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box83
		bodyModel[20] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box84
		bodyModel[21] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import Box85
		bodyModel[22] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box86
		bodyModel[23] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box87
		bodyModel[24] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box88
		bodyModel[25] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Box139
		bodyModel[26] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Box140
		bodyModel[27] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Box141
		bodyModel[28] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box143
		bodyModel[29] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Box144
		bodyModel[30] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box145
		bodyModel[31] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box146
		bodyModel[32] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box147
		bodyModel[33] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Box153
		bodyModel[34] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box154
		bodyModel[35] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box155
		bodyModel[36] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box156
		bodyModel[37] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import Box157
		bodyModel[38] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import Box158
		bodyModel[39] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import Box159
		bodyModel[40] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import Box160
		bodyModel[41] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import Box161
		bodyModel[42] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Box162
		bodyModel[43] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Import Box163
		bodyModel[44] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import Box164
		bodyModel[45] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import Box165
		bodyModel[46] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import Box166
		bodyModel[47] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import Box167
		bodyModel[48] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import Box168
		bodyModel[49] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box169
		bodyModel[50] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box170
		bodyModel[51] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box171
		bodyModel[52] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box172
		bodyModel[53] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box173
		bodyModel[54] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box174
		bodyModel[55] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box175
		bodyModel[56] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box176
		bodyModel[57] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box177
		bodyModel[58] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box178
		bodyModel[59] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box179
		bodyModel[60] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box180
		bodyModel[61] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box181
		bodyModel[62] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Box182
		bodyModel[63] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box183
		bodyModel[64] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box184
		bodyModel[65] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Box185
		bodyModel[66] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box186
		bodyModel[67] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box187
		bodyModel[68] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box188
		bodyModel[69] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box189
		bodyModel[70] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box190
		bodyModel[71] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import Box191
		bodyModel[72] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import Box192
		bodyModel[73] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import Box193
		bodyModel[74] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box194
		bodyModel[75] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box195
		bodyModel[76] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box197
		bodyModel[77] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box198
		bodyModel[78] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box199
		bodyModel[79] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box200
		bodyModel[80] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box201
		bodyModel[81] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import Box202
		bodyModel[82] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import Box203
		bodyModel[83] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box204
		bodyModel[84] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box205
		bodyModel[85] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box206
		bodyModel[86] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box207
		bodyModel[87] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box208
		bodyModel[88] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box209
		bodyModel[89] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box210
		bodyModel[90] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import Box211
		bodyModel[91] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box212
		bodyModel[92] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box213
		bodyModel[93] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box214
		bodyModel[94] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box215
		bodyModel[95] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box216
		bodyModel[96] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import Box217
		bodyModel[97] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box218
		bodyModel[98] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import Box219
		bodyModel[99] = new ModelRendererTurbo(this, 0, 865, textureX, textureY); // Import Box220
		bodyModel[100] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import Box221
		bodyModel[101] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Import Box222
		bodyModel[102] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import Box223
		bodyModel[103] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Import Box224
		bodyModel[104] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box225
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box226
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box227
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box228
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box229
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box230
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box231
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box232
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box233
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box234
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box235
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box236
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box237
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box238
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box239
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box240
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box241
		bodyModel[121] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box242
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box243
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box244
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box245
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box246
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box247
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box248
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box249
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box250
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box251
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box252
		bodyModel[132] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box253
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box254
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box255
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box256
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box257
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box258
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box259
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box260
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box261
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box262
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box263
		bodyModel[143] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box264
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box265
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box266
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box267
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box268
		bodyModel[148] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box275
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box276
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box277
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box278
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box279
		bodyModel[153] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box291
		bodyModel[154] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box292
		bodyModel[155] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box293
		bodyModel[156] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box294
		bodyModel[157] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box295
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box296
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box297
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box298
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box299
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box300
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box301
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box302
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box303
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box304
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box305
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box306
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box307
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box308
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box309
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box310
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box311
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box312
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box313
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Import Box314
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Import Box315
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box316
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box317
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box318
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box319
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box320
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box321
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box322
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box323
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box324
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box325
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box326
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box327
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box328
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box329
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box330
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box331
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box332
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box333
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box334
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box335
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box336
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box337
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box338
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1035, textureX, textureY); // Import Box339
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1045, textureX, textureY); // Import Box340
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box341
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import Box342
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import Box343
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import Box344
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import Box345
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box346
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box347
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Import Box348
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box349
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Import Box350
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import Box351
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import Box352
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box353
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box354
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box355
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box356
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box357
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box358
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Import Box359
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box360
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Import Box361
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import Box362
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import Box363
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box364
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box365
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box366
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box367
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import Box368
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import Box369
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import Box370
		bodyModel[233] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import Box371
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import Box372
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import Box373
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import Box374
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import Box375
		bodyModel[238] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import Box376
		bodyModel[239] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import Box377
		bodyModel[240] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import Box378
		bodyModel[241] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import Box379
		bodyModel[242] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box380
		bodyModel[243] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box381
		bodyModel[244] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box382
		bodyModel[245] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import Box383
		bodyModel[246] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box384
		bodyModel[247] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box385
		bodyModel[248] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box386
		bodyModel[249] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box387
		bodyModel[250] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import Box388
		bodyModel[251] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import Box389
		bodyModel[252] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box390
		bodyModel[253] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box391
		bodyModel[254] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box392
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box393
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box394
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box395
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box396
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box397
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box398
		bodyModel[261] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box399
		bodyModel[262] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box400
		bodyModel[263] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box401
		bodyModel[264] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box402
		bodyModel[265] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box403
		bodyModel[266] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box404
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box405
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box406
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box407
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import Box408
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box409
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Import Box410
		bodyModel[273] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box411
		bodyModel[274] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Import Box412
		bodyModel[275] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box413
		bodyModel[276] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box414
		bodyModel[277] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box415
		bodyModel[278] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import Box416
		bodyModel[279] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box417
		bodyModel[280] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box418
		bodyModel[281] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box419
		bodyModel[282] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box420
		bodyModel[283] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import Box421
		bodyModel[284] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Import Box422
		bodyModel[285] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box423
		bodyModel[286] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box424
		bodyModel[287] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box425
		bodyModel[288] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box426
		bodyModel[289] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import Box427
		bodyModel[290] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box428
		bodyModel[291] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box429
		bodyModel[292] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box430
		bodyModel[293] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box431
		bodyModel[294] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box432
		bodyModel[295] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box433
		bodyModel[296] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box434
		bodyModel[297] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box435
		bodyModel[298] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import Box436
		bodyModel[299] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Import Box437
		bodyModel[300] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box438
		bodyModel[301] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box439
		bodyModel[302] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box440
		bodyModel[303] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box441
		bodyModel[304] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import Box442
		bodyModel[305] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box443
		bodyModel[306] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box444
		bodyModel[307] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import Box445
		bodyModel[308] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import Box446
		bodyModel[309] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import Box447
		bodyModel[310] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import Box448
		bodyModel[311] = new ModelRendererTurbo(this, 0, 1244, textureX, textureY); // Import Box449
		bodyModel[312] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box450
		bodyModel[313] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import Box451
		bodyModel[314] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import Box452
		bodyModel[315] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box453
		bodyModel[316] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import Box454
		bodyModel[317] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import Box455
		bodyModel[318] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box456
		bodyModel[319] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box459
		bodyModel[320] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box460
		bodyModel[321] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box461
		bodyModel[322] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import Box462
		bodyModel[323] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import Box463
		bodyModel[324] = new ModelRendererTurbo(this, 0, 1244, textureX, textureY); // Import Box464
		bodyModel[325] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box465
		bodyModel[326] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import Box466
		bodyModel[327] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import Box467
		bodyModel[328] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box468
		bodyModel[329] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import Box469
		bodyModel[330] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import Box470
		bodyModel[331] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box471
		bodyModel[332] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box472
		bodyModel[333] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box473
		bodyModel[334] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box474
		bodyModel[335] = new ModelRendererTurbo(this, 0, 1263, textureX, textureY); // Import Box475
		bodyModel[336] = new ModelRendererTurbo(this, 0, 1296, textureX, textureY); // Import Box476
		bodyModel[337] = new ModelRendererTurbo(this, 0, 1328, textureX, textureY); // Import Box477
		bodyModel[338] = new ModelRendererTurbo(this, 0, 1296, textureX, textureY); // Import Box478
		bodyModel[339] = new ModelRendererTurbo(this, 0, 1328, textureX, textureY); // Import Box479
		bodyModel[340] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import Box667
		bodyModel[341] = new ModelRendererTurbo(this, 0, 1362, textureX, textureY); // Import Box668

		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 12, 10, 0F,0F, 0F, 0F, -24F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(30F, -16F, -17.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 25, 7, 10, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[1].setRotationPoint(30F, -4F, -17.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 62, 19, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[2].setRotationPoint(-32F, -16F, -17.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 94, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box5
		bodyModel[3].setRotationPoint(-45F, -12F, -29F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F); // Import Box6
		bodyModel[4].setRotationPoint(49F, -12F, -29F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F); // Import Box7
		bodyModel[5].setRotationPoint(53F, -11F, -29F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0.5F, 0F, 0F, 0.5F); // Import Box8
		bodyModel[6].setRotationPoint(55F, -9F, -29F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 94, 1, 12, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		bodyModel[7].setRotationPoint(-45F, -12F, 17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[8].setRotationPoint(49F, -12F, 17F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[9].setRotationPoint(53F, -11F, 17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 3F, 0.5F, -1F, 3F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[10].setRotationPoint(55F, -9F, 17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F); // Import Box13
		bodyModel[11].setRotationPoint(-49F, -12F, -29F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 3F, 0.5F); // Import Box14
		bodyModel[12].setRotationPoint(-52F, -11F, -29F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Import Box15
		bodyModel[13].setRotationPoint(-54F, -8F, -29F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box16
		bodyModel[14].setRotationPoint(-49F, -12F, 18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box17
		bodyModel[15].setRotationPoint(-52F, -11F, 18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Import Box18
		bodyModel[16].setRotationPoint(-54F, -8F, 18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		bodyModel[17].setRotationPoint(40F, -12F, -16.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[18].setRotationPoint(49F, -12F, -16.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		bodyModel[19].setRotationPoint(53F, -11F, -16.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[20].setRotationPoint(55F, -9F, -16.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[21].setRotationPoint(40F, -12F, 15.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		bodyModel[22].setRotationPoint(49F, -12F, 15.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		bodyModel[23].setRotationPoint(53F, -11F, 15.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box88
		bodyModel[24].setRotationPoint(55F, -9F, 15.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 25, 12, 10, 0F,0F, 0F, 0F, -15F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[25].setRotationPoint(30F, -16F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[26].setRotationPoint(30F, -4F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 25, 12, 15, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[27].setRotationPoint(30F, -16F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 25, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[28].setRotationPoint(30F, -4F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 80, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[29].setRotationPoint(-31F, -12F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box145
		bodyModel[30].setRotationPoint(49F, -12F, -30F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[31].setRotationPoint(53F, -11F, -30F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[32].setRotationPoint(55F, -9F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 80, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		bodyModel[33].setRotationPoint(-31F, -12F, 29F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box154
		bodyModel[34].setRotationPoint(49F, -12F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		bodyModel[35].setRotationPoint(53F, -11F, 29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box156
		bodyModel[36].setRotationPoint(55F, -9F, 29F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 19, 35, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		bodyModel[37].setRotationPoint(-39F, -16F, -17.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 22, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		bodyModel[38].setRotationPoint(-50F, -19F, -17.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 19, 35, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box159
		bodyModel[39].setRotationPoint(-53F, -16F, -17.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[40].setRotationPoint(-39F, -19F, -14.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[41].setRotationPoint(-39F, -19F, 11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 29, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[42].setRotationPoint(-19F, -19F, -14.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		bodyModel[43].setRotationPoint(-39F, -18F, -11.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		bodyModel[44].setRotationPoint(-39F, -19F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		bodyModel[45].setRotationPoint(-35F, -19F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[46].setRotationPoint(-31F, -19F, -11.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[47].setRotationPoint(-27F, -19F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[48].setRotationPoint(-23F, -19F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[49].setRotationPoint(-37F, -18.5F, -10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[50].setRotationPoint(-37F, -18.5F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[51].setRotationPoint(-37F, -18.5F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		bodyModel[52].setRotationPoint(-37F, -18.5F, -4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[53].setRotationPoint(-37F, -18.5F, -2.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		bodyModel[54].setRotationPoint(-37F, -18.5F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		bodyModel[55].setRotationPoint(-37F, -18.5F, 1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[56].setRotationPoint(-37F, -18.5F, 3.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		bodyModel[57].setRotationPoint(-37F, -18.5F, 5.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		bodyModel[58].setRotationPoint(-37F, -18.5F, 7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		bodyModel[59].setRotationPoint(-37F, -18.5F, 9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box180
		bodyModel[60].setRotationPoint(-55F, -21F, -13.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box181
		bodyModel[61].setRotationPoint(-56F, -21F, -13.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		bodyModel[62].setRotationPoint(-57F, -21F, -14.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box183
		bodyModel[63].setRotationPoint(-55F, -21F, 11.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box184
		bodyModel[64].setRotationPoint(-56F, -21F, 11.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		bodyModel[65].setRotationPoint(-57F, -21F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box186
		bodyModel[66].setRotationPoint(-56F, -14F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box187
		bodyModel[67].setRotationPoint(-56F, -14F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box188
		bodyModel[68].setRotationPoint(-57F, -10.5F, -18.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		bodyModel[69].setRotationPoint(-58F, -10.5F, -18.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box190
		bodyModel[70].setRotationPoint(-59F, -10.5F, -18.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box191
		bodyModel[71].setRotationPoint(-38F, -12F, -30F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import Box192
		bodyModel[72].setRotationPoint(-38F, -12F, 29F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box193
		bodyModel[73].setRotationPoint(-54F, -16F, -6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box194
		bodyModel[74].setRotationPoint(-55F, -23F, -6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box195
		bodyModel[75].setRotationPoint(-55F, -23F, -3.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box197
		bodyModel[76].setRotationPoint(-55F, -22F, -5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box198
		bodyModel[77].setRotationPoint(-55F, -20F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box199
		bodyModel[78].setRotationPoint(-55F, -18F, -5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box200
		bodyModel[79].setRotationPoint(-55F, -16F, -5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box201
		bodyModel[80].setRotationPoint(-55F, -14F, -5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box202
		bodyModel[81].setRotationPoint(-55F, -14F, -5.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box203
		bodyModel[82].setRotationPoint(-54F, -16F, 2.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box204
		bodyModel[83].setRotationPoint(-55F, -23F, 5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box205
		bodyModel[84].setRotationPoint(-55F, -23F, 2.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box206
		bodyModel[85].setRotationPoint(-55F, -22F, 3.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box207
		bodyModel[86].setRotationPoint(-55F, -20F, 3.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box208
		bodyModel[87].setRotationPoint(-55F, -18F, 3.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box209
		bodyModel[88].setRotationPoint(-55F, -16F, 3.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box210
		bodyModel[89].setRotationPoint(-55F, -14F, 3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box211
		bodyModel[90].setRotationPoint(-55F, -14F, 3.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box212
		bodyModel[91].setRotationPoint(-45F, -23F, 2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box213
		bodyModel[92].setRotationPoint(-45F, -23F, 5.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box214
		bodyModel[93].setRotationPoint(-45F, -20F, 3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box215
		bodyModel[94].setRotationPoint(-45F, -22F, 3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box216
		bodyModel[95].setRotationPoint(-45F, -23F, -3.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box217
		bodyModel[96].setRotationPoint(-45F, -23F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box218
		bodyModel[97].setRotationPoint(-45F, -20F, -5.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box219
		bodyModel[98].setRotationPoint(-45F, -22F, -5.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		bodyModel[99].setRotationPoint(-54F, -25F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box221
		bodyModel[100].setRotationPoint(-54F, -22F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box222
		bodyModel[101].setRotationPoint(-53F, -20F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 2, 18, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box223
		bodyModel[102].setRotationPoint(-54F, -27F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 1, 18, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		bodyModel[103].setRotationPoint(-53F, -28F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box225
		bodyModel[104].setRotationPoint(-31F, -10F, -31F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Import Box226
		bodyModel[105].setRotationPoint(-31F, -10F, -32F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box227
		bodyModel[106].setRotationPoint(-31F, -3F, -32F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Import Box228
		bodyModel[107].setRotationPoint(-31F, -9F, -32F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Import Box229
		bodyModel[108].setRotationPoint(-24F, -9F, -32F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box230
		bodyModel[109].setRotationPoint(-19F, -9.5F, -31F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box231
		bodyModel[110].setRotationPoint(-19F, -7.5F, -31F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		bodyModel[111].setRotationPoint(-19F, -5.5F, -31F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		bodyModel[112].setRotationPoint(-19F, -3.5F, -31F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		bodyModel[113].setRotationPoint(-19F, -1.5F, -31F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box235
		bodyModel[114].setRotationPoint(-19F, 0.5F, -31F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box236
		bodyModel[115].setRotationPoint(-5F, 0.5F, -31F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box237
		bodyModel[116].setRotationPoint(-5F, -9.5F, -31F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box238
		bodyModel[117].setRotationPoint(-5F, -7.5F, -31F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		bodyModel[118].setRotationPoint(-5F, -5.5F, -31F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box240
		bodyModel[119].setRotationPoint(-5F, -3.5F, -31F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box241
		bodyModel[120].setRotationPoint(-5F, -1.5F, -31F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box242
		bodyModel[121].setRotationPoint(-17F, -10F, -31F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Import Box243
		bodyModel[122].setRotationPoint(-17F, -10F, -32F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Import Box244
		bodyModel[123].setRotationPoint(-17F, -9F, -32F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box245
		bodyModel[124].setRotationPoint(-17F, -3F, -32F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Import Box246
		bodyModel[125].setRotationPoint(-10F, -9F, -32F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box247
		bodyModel[126].setRotationPoint(9F, 0.5F, -31F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box248
		bodyModel[127].setRotationPoint(9F, -9.5F, -31F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		bodyModel[128].setRotationPoint(9F, -7.5F, -31F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
		bodyModel[129].setRotationPoint(9F, -5.5F, -31F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box251
		bodyModel[130].setRotationPoint(9F, -3.5F, -31F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box252
		bodyModel[131].setRotationPoint(9F, -1.5F, -31F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box253
		bodyModel[132].setRotationPoint(-3F, -10F, -31F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Import Box254
		bodyModel[133].setRotationPoint(-3F, -10F, -32F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Import Box255
		bodyModel[134].setRotationPoint(-3F, -9F, -32F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box256
		bodyModel[135].setRotationPoint(-3F, -3F, -32F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Import Box257
		bodyModel[136].setRotationPoint(4F, -9F, -32F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box258
		bodyModel[137].setRotationPoint(23F, 0.5F, -31F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box259
		bodyModel[138].setRotationPoint(23F, -9.5F, -31F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box260
		bodyModel[139].setRotationPoint(23F, -7.5F, -31F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		bodyModel[140].setRotationPoint(23F, -5.5F, -31F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		bodyModel[141].setRotationPoint(23F, -3.5F, -31F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box263
		bodyModel[142].setRotationPoint(23F, -1.5F, -31F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box264
		bodyModel[143].setRotationPoint(11F, -10F, -31F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Import Box265
		bodyModel[144].setRotationPoint(11F, -10F, -32F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Import Box266
		bodyModel[145].setRotationPoint(11F, -9F, -32F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box267
		bodyModel[146].setRotationPoint(11F, -3F, -32F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Import Box268
		bodyModel[147].setRotationPoint(18F, -9F, -32F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box275
		bodyModel[148].setRotationPoint(25F, -10F, -31F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Import Box276
		bodyModel[149].setRotationPoint(25F, -10F, -32F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Import Box277
		bodyModel[150].setRotationPoint(25F, -9F, -32F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box278
		bodyModel[151].setRotationPoint(25F, -3F, -32F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Import Box279
		bodyModel[152].setRotationPoint(32F, -9F, -32F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		bodyModel[153].setRotationPoint(-31F, -10F, 30F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		bodyModel[154].setRotationPoint(-17F, -10F, 30F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		bodyModel[155].setRotationPoint(-3F, -10F, 30F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		bodyModel[156].setRotationPoint(11F, -10F, 30F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		bodyModel[157].setRotationPoint(25F, -10F, 30F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F); // Import Box296
		bodyModel[158].setRotationPoint(-31F, -10F, 31F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box297
		bodyModel[159].setRotationPoint(-31F, -3F, 31F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F); // Import Box298
		bodyModel[160].setRotationPoint(-31F, -9F, 31F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F); // Import Box299
		bodyModel[161].setRotationPoint(-24F, -9F, 31F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F); // Import Box300
		bodyModel[162].setRotationPoint(-17F, -10F, 31F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F); // Import Box301
		bodyModel[163].setRotationPoint(-17F, -9F, 31F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box302
		bodyModel[164].setRotationPoint(-17F, -3F, 31F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F); // Import Box303
		bodyModel[165].setRotationPoint(-10F, -9F, 31F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F); // Import Box304
		bodyModel[166].setRotationPoint(-3F, -10F, 31F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F); // Import Box305
		bodyModel[167].setRotationPoint(-3F, -9F, 31F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box306
		bodyModel[168].setRotationPoint(-3F, -3F, 31F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F); // Import Box307
		bodyModel[169].setRotationPoint(4F, -9F, 31F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F); // Import Box308
		bodyModel[170].setRotationPoint(11F, -10F, 31F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F); // Import Box309
		bodyModel[171].setRotationPoint(11F, -9F, 31F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box310
		bodyModel[172].setRotationPoint(11F, -3F, 31F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F); // Import Box311
		bodyModel[173].setRotationPoint(18F, -9F, 31F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F); // Import Box312
		bodyModel[174].setRotationPoint(25F, -10F, 31F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F); // Import Box313
		bodyModel[175].setRotationPoint(25F, -9F, 31F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box314
		bodyModel[176].setRotationPoint(25F, -3F, 31F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F); // Import Box315
		bodyModel[177].setRotationPoint(32F, -9F, 31F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		bodyModel[178].setRotationPoint(-19F, -9.5F, 30F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box317
		bodyModel[179].setRotationPoint(-19F, -7.5F, 30F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		bodyModel[180].setRotationPoint(-19F, -5.5F, 30F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box319
		bodyModel[181].setRotationPoint(-19F, -3.5F, 30F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box320
		bodyModel[182].setRotationPoint(-19F, -1.5F, 30F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box321
		bodyModel[183].setRotationPoint(-19F, 0.5F, 30F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		bodyModel[184].setRotationPoint(-5F, 0.5F, 30F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		bodyModel[185].setRotationPoint(-5F, -9.5F, 30F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		bodyModel[186].setRotationPoint(-5F, -7.5F, 30F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box325
		bodyModel[187].setRotationPoint(-5F, -5.5F, 30F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		bodyModel[188].setRotationPoint(-5F, -3.5F, 30F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		bodyModel[189].setRotationPoint(-5F, -1.5F, 30F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box328
		bodyModel[190].setRotationPoint(9F, 0.5F, 30F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box329
		bodyModel[191].setRotationPoint(9F, -9.5F, 30F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box330
		bodyModel[192].setRotationPoint(9F, -7.5F, 30F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box331
		bodyModel[193].setRotationPoint(9F, -5.5F, 30F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box332
		bodyModel[194].setRotationPoint(9F, -3.5F, 30F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box333
		bodyModel[195].setRotationPoint(9F, -1.5F, 30F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box334
		bodyModel[196].setRotationPoint(23F, 0.5F, 30F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box335
		bodyModel[197].setRotationPoint(23F, -9.5F, 30F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box336
		bodyModel[198].setRotationPoint(23F, -7.5F, 30F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box337
		bodyModel[199].setRotationPoint(23F, -5.5F, 30F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box338
		bodyModel[200].setRotationPoint(23F, -3.5F, 30F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box339
		bodyModel[201].setRotationPoint(23F, -1.5F, 30F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box340
		bodyModel[202].setRotationPoint(42F, -14F, -2.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box341
		bodyModel[203].setRotationPoint(42F, -13F, -2.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box342
		bodyModel[204].setRotationPoint(42F, -13F, 1.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box343
		bodyModel[205].setRotationPoint(42F, -13F, -1.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box344
		bodyModel[206].setRotationPoint(42F, -12F, -1.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box345
		bodyModel[207].setRotationPoint(42F, -11F, -1.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box346
		bodyModel[208].setRotationPoint(-32F, -16F, -28.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box347
		bodyModel[209].setRotationPoint(-12F, -16F, -28.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box348
		bodyModel[210].setRotationPoint(-30F, -13F, -28.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		bodyModel[211].setRotationPoint(-30F, -15F, -28.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box350
		bodyModel[212].setRotationPoint(-30F, -16F, -28.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box351
		bodyModel[213].setRotationPoint(-28F, -17F, -24.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box352
		bodyModel[214].setRotationPoint(-22F, -17F, -24.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		bodyModel[215].setRotationPoint(-29F, -16.5F, -26.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		bodyModel[216].setRotationPoint(-29F, -16.5F, -24.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box355
		bodyModel[217].setRotationPoint(-29F, -16.5F, -22.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box356
		bodyModel[218].setRotationPoint(-29F, -16.5F, -20.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box357
		bodyModel[219].setRotationPoint(-32F, -16F, 17.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box358
		bodyModel[220].setRotationPoint(-12F, -16F, 17.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box359
		bodyModel[221].setRotationPoint(-30F, -13F, 17.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box360
		bodyModel[222].setRotationPoint(-30F, -15F, 17.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box361
		bodyModel[223].setRotationPoint(-30F, -16F, 17.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box362
		bodyModel[224].setRotationPoint(-28F, -17F, 13.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box363
		bodyModel[225].setRotationPoint(-22F, -17F, 13.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box364
		bodyModel[226].setRotationPoint(-29F, -16.5F, 25.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		bodyModel[227].setRotationPoint(-29F, -16.5F, 23.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box366
		bodyModel[228].setRotationPoint(-29F, -16.5F, 21.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box367
		bodyModel[229].setRotationPoint(-29F, -16.5F, 19.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box368
		bodyModel[230].setRotationPoint(37F, -16F, -24.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box369
		bodyModel[231].setRotationPoint(37F, -16F, -25.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box370
		bodyModel[232].setRotationPoint(37F, -16F, -22.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box371
		bodyModel[233].setRotationPoint(45F, -14.5F, -25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box372
		bodyModel[234].setRotationPoint(45F, -15.5F, -25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box373
		bodyModel[235].setRotationPoint(45F, -13.5F, -25F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box374
		bodyModel[236].setRotationPoint(37F, -16F, 22.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box375
		bodyModel[237].setRotationPoint(37F, -16F, 24.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box376
		bodyModel[238].setRotationPoint(37F, -16F, 21.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box377
		bodyModel[239].setRotationPoint(45F, -14.5F, 22F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box378
		bodyModel[240].setRotationPoint(45F, -15.5F, 22F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box379
		bodyModel[241].setRotationPoint(45F, -13.5F, 22F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box380
		bodyModel[242].setRotationPoint(29F, -16F, -28.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box381
		bodyModel[243].setRotationPoint(8F, -16F, -28.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box382
		bodyModel[244].setRotationPoint(29F, -16F, 17.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box383
		bodyModel[245].setRotationPoint(8F, -16F, 17.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box384
		bodyModel[246].setRotationPoint(-10F, -15F, -26.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box385
		bodyModel[247].setRotationPoint(-10F, -16F, -26.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box386
		bodyModel[248].setRotationPoint(-10F, -16F, -21.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box387
		bodyModel[249].setRotationPoint(-10F, -15F, -21.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box388
		bodyModel[250].setRotationPoint(-11F, -14F, -22.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box389
		bodyModel[251].setRotationPoint(-11F, -13F, -27.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box390
		bodyModel[252].setRotationPoint(-7F, -15F, -26.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box391
		bodyModel[253].setRotationPoint(-7F, -16F, -26.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box392
		bodyModel[254].setRotationPoint(-7F, -15F, -21.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box393
		bodyModel[255].setRotationPoint(-7F, -16F, -21.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box394
		bodyModel[256].setRotationPoint(-4F, -15F, -26.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box395
		bodyModel[257].setRotationPoint(-4F, -16F, -26.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box396
		bodyModel[258].setRotationPoint(-4F, -15F, -21.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box397
		bodyModel[259].setRotationPoint(-4F, -16F, -21.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box398
		bodyModel[260].setRotationPoint(-1F, -15F, -26.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box399
		bodyModel[261].setRotationPoint(-1F, -16F, -26.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box400
		bodyModel[262].setRotationPoint(-1F, -15F, -21.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box401
		bodyModel[263].setRotationPoint(-1F, -16F, -21.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box402
		bodyModel[264].setRotationPoint(2F, -15F, -26.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box403
		bodyModel[265].setRotationPoint(2F, -16F, -26.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box404
		bodyModel[266].setRotationPoint(2F, -15F, -21.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		bodyModel[267].setRotationPoint(2F, -16F, -21.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box406
		bodyModel[268].setRotationPoint(5F, -15F, -26.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		bodyModel[269].setRotationPoint(5F, -16F, -26.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		bodyModel[270].setRotationPoint(5F, -15F, -21.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		bodyModel[271].setRotationPoint(5F, -16F, -21.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		bodyModel[272].setRotationPoint(-10F, -16F, 17.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box411
		bodyModel[273].setRotationPoint(-10F, -15F, 17.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box412
		bodyModel[274].setRotationPoint(-10F, -13F, 17.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		bodyModel[275].setRotationPoint(-9F, -16.5F, 19.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		bodyModel[276].setRotationPoint(-9F, -16.5F, 21.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
		bodyModel[277].setRotationPoint(-9F, -16.5F, 23.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		bodyModel[278].setRotationPoint(-9F, -16.5F, 25.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box417
		bodyModel[279].setRotationPoint(-34F, -13F, -21.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box418
		bodyModel[280].setRotationPoint(-38F, -13F, -21.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		bodyModel[281].setRotationPoint(-37F, -13F, -21.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		bodyModel[282].setRotationPoint(-37F, -13F, -19.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		bodyModel[283].setRotationPoint(-37F, -13F, -20.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		bodyModel[284].setRotationPoint(-41F, -14F, -20.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box423
		bodyModel[285].setRotationPoint(-44F, -13F, -21.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box424
		bodyModel[286].setRotationPoint(-43F, -13F, -21.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box425
		bodyModel[287].setRotationPoint(-40F, -13F, -21.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box426
		bodyModel[288].setRotationPoint(-43F, -13F, -19.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box427
		bodyModel[289].setRotationPoint(-41F, -13F, -20.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box428
		bodyModel[290].setRotationPoint(-38F, -13F, -26.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box429
		bodyModel[291].setRotationPoint(-37F, -13F, -26.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box430
		bodyModel[292].setRotationPoint(-34F, -13F, -26.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box431
		bodyModel[293].setRotationPoint(-37F, -13F, -24.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box432
		bodyModel[294].setRotationPoint(-34F, -13F, 18.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box433
		bodyModel[295].setRotationPoint(-38F, -13F, 18.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box434
		bodyModel[296].setRotationPoint(-37F, -13F, 20.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box435
		bodyModel[297].setRotationPoint(-37F, -13F, 18.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box436
		bodyModel[298].setRotationPoint(-37F, -13F, 19.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
		bodyModel[299].setRotationPoint(-41F, -14F, 19.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box438
		bodyModel[300].setRotationPoint(-44F, -13F, 18.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box439
		bodyModel[301].setRotationPoint(-43F, -13F, 20.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box440
		bodyModel[302].setRotationPoint(-40F, -13F, 18.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
		bodyModel[303].setRotationPoint(-43F, -13F, 18.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box442
		bodyModel[304].setRotationPoint(-41F, -13F, 19.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box443
		bodyModel[305].setRotationPoint(-38F, -13F, 23.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		bodyModel[306].setRotationPoint(-37F, -13F, 25.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box445
		bodyModel[307].setRotationPoint(-34F, -13F, 23.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box446
		bodyModel[308].setRotationPoint(-37F, -13F, 23.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box447
		bodyModel[309].setRotationPoint(10F, -13F, -28.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box448
		bodyModel[310].setRotationPoint(11F, -13F, -27.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box449
		bodyModel[311].setRotationPoint(17F, -13F, -28.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box450
		bodyModel[312].setRotationPoint(19F, -13F, -28.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box451
		bodyModel[313].setRotationPoint(11F, -13F, -23.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		bodyModel[314].setRotationPoint(10F, -13F, -24.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box453
		bodyModel[315].setRotationPoint(17F, -13F, -24.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box454
		bodyModel[316].setRotationPoint(18F, -13F, -24.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box455
		bodyModel[317].setRotationPoint(18F, -13F, -22.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box456
		bodyModel[318].setRotationPoint(21F, -13F, -25.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box459
		bodyModel[319].setRotationPoint(23F, -13F, -23.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box460
		bodyModel[320].setRotationPoint(25F, -13F, -24.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box461
		bodyModel[321].setRotationPoint(27F, -13F, -26.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box462
		bodyModel[322].setRotationPoint(10F, -13F, 25.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box463
		bodyModel[323].setRotationPoint(11F, -13F, 26.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box464
		bodyModel[324].setRotationPoint(17F, -13F, 25.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box465
		bodyModel[325].setRotationPoint(19F, -13F, 25.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box466
		bodyModel[326].setRotationPoint(11F, -13F, 22.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box467
		bodyModel[327].setRotationPoint(10F, -13F, 21.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box468
		bodyModel[328].setRotationPoint(17F, -13F, 21.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box469
		bodyModel[329].setRotationPoint(18F, -13F, 23.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box470
		bodyModel[330].setRotationPoint(18F, -13F, 21.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box471
		bodyModel[331].setRotationPoint(21F, -13F, 15.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box472
		bodyModel[332].setRotationPoint(23F, -13F, 13.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box473
		bodyModel[333].setRotationPoint(25F, -13F, 14.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box474
		bodyModel[334].setRotationPoint(27F, -13F, 16.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box475
		bodyModel[335].setRotationPoint(-4.5F, -18F, -13.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 6, 2, 27, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box476
		bodyModel[336].setRotationPoint(-10.5F, -18F, -13.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 2, 21, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box477
		bodyModel[337].setRotationPoint(-14.5F, -18F, -10.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 6, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box478
		bodyModel[338].setRotationPoint(4.5F, -18F, -13.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box479
		bodyModel[339].setRotationPoint(10.5F, -18F, -10.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import Box667
		bodyModel[340].setRotationPoint(34F, -17F, -2.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box668
		bodyModel[341].setRotationPoint(31F, -17F, -5.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 1378, textureX, textureY); // Import Box480
		turretModel[1] = new ModelRendererTurbo(this, 0, 1399, textureX, textureY); // Import Box481
		turretModel[2] = new ModelRendererTurbo(this, 0, 1420, textureX, textureY); // Import Box482
		turretModel[3] = new ModelRendererTurbo(this, 0, 1438, textureX, textureY); // Import Box483
		turretModel[4] = new ModelRendererTurbo(this, 0, 1459, textureX, textureY); // Import Box484
		turretModel[5] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Import Box485
		turretModel[6] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Import Box487
		turretModel[7] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import Box488
		turretModel[8] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Import Box489
		turretModel[9] = new ModelRendererTurbo(this, 0, 1579, textureX, textureY); // Import Box490
		turretModel[10] = new ModelRendererTurbo(this, 0, 1605, textureX, textureY); // Import Box491
		turretModel[11] = new ModelRendererTurbo(this, 0, 1630, textureX, textureY); // Import Box492
		turretModel[12] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Import Box493
		turretModel[13] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box494
		turretModel[14] = new ModelRendererTurbo(this, 0, 1704, textureX, textureY); // Import Box495
		turretModel[15] = new ModelRendererTurbo(this, 0, 1725, textureX, textureY); // Import Box496
		turretModel[16] = new ModelRendererTurbo(this, 0, 1742, textureX, textureY); // Import Box497
		turretModel[17] = new ModelRendererTurbo(this, 0, 1765, textureX, textureY); // Import Box498
		turretModel[18] = new ModelRendererTurbo(this, 0, 1787, textureX, textureY); // Import Box501
		turretModel[19] = new ModelRendererTurbo(this, 0, 1811, textureX, textureY); // Import Box502
		turretModel[20] = new ModelRendererTurbo(this, 0, 1378, textureX, textureY); // Import Box503
		turretModel[21] = new ModelRendererTurbo(this, 0, 1399, textureX, textureY); // Import Box504
		turretModel[22] = new ModelRendererTurbo(this, 0, 1420, textureX, textureY); // Import Box505
		turretModel[23] = new ModelRendererTurbo(this, 0, 1438, textureX, textureY); // Import Box506
		turretModel[24] = new ModelRendererTurbo(this, 0, 1459, textureX, textureY); // Import Box507
		turretModel[25] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Import Box508
		turretModel[26] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Import Box509
		turretModel[27] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import Box510
		turretModel[28] = new ModelRendererTurbo(this, 0, 1552, textureX, textureY); // Import Box511
		turretModel[29] = new ModelRendererTurbo(this, 0, 1579, textureX, textureY); // Import Box512
		turretModel[30] = new ModelRendererTurbo(this, 0, 1605, textureX, textureY); // Import Box513
		turretModel[31] = new ModelRendererTurbo(this, 0, 1630, textureX, textureY); // Import Box514
		turretModel[32] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Import Box515
		turretModel[33] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box516
		turretModel[34] = new ModelRendererTurbo(this, 0, 1704, textureX, textureY); // Import Box517
		turretModel[35] = new ModelRendererTurbo(this, 0, 1725, textureX, textureY); // Import Box518
		turretModel[36] = new ModelRendererTurbo(this, 0, 1742, textureX, textureY); // Import Box519
		turretModel[37] = new ModelRendererTurbo(this, 0, 1765, textureX, textureY); // Import Box520
		turretModel[38] = new ModelRendererTurbo(this, 0, 1787, textureX, textureY); // Import Box521
		turretModel[39] = new ModelRendererTurbo(this, 0, 1811, textureX, textureY); // Import Box522
		turretModel[40] = new ModelRendererTurbo(this, 0, 1835, textureX, textureY); // Import Box524
		turretModel[41] = new ModelRendererTurbo(this, 0, 1859, textureX, textureY); // Import Box525
		turretModel[42] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Import Box526
		turretModel[43] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Import Box527
		turretModel[44] = new ModelRendererTurbo(this, 0, 1926, textureX, textureY); // Import Box528
		turretModel[45] = new ModelRendererTurbo(this, 0, 1835, textureX, textureY); // Import Box529
		turretModel[46] = new ModelRendererTurbo(this, 0, 1859, textureX, textureY); // Import Box530
		turretModel[47] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // Import Box531
		turretModel[48] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Import Box532
		turretModel[49] = new ModelRendererTurbo(this, 0, 1926, textureX, textureY); // Import Box533
		turretModel[50] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Box534
		turretModel[51] = new ModelRendererTurbo(this, 0, 1965, textureX, textureY); // Import Box535
		turretModel[52] = new ModelRendererTurbo(this, 0, 1977, textureX, textureY); // Import Box536
		turretModel[53] = new ModelRendererTurbo(this, 0, 1965, textureX, textureY); // Import Box537
		turretModel[54] = new ModelRendererTurbo(this, 0, 1977, textureX, textureY); // Import Box538
		turretModel[55] = new ModelRendererTurbo(this, 0, 1986, textureX, textureY); // Import Box539
		turretModel[56] = new ModelRendererTurbo(this, 0, 1992, textureX, textureY); // Import Box540
		turretModel[57] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box541
		turretModel[58] = new ModelRendererTurbo(this, 0, 1992, textureX, textureY); // Import Box544
		turretModel[59] = new ModelRendererTurbo(this, 0, 1986, textureX, textureY); // Import Box545
		turretModel[60] = new ModelRendererTurbo(this, 0, 1986, textureX, textureY); // Import Box546
		turretModel[61] = new ModelRendererTurbo(this, 0, 1992, textureX, textureY); // Import Box547
		turretModel[62] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box548
		turretModel[63] = new ModelRendererTurbo(this, 0, 1992, textureX, textureY); // Import Box549
		turretModel[64] = new ModelRendererTurbo(this, 0, 1986, textureX, textureY); // Import Box550
		turretModel[65] = new ModelRendererTurbo(this, 0, 2011, textureX, textureY); // Import Box611
		turretModel[66] = new ModelRendererTurbo(this, 0, 2034, textureX, textureY); // Import Box612
		turretModel[67] = new ModelRendererTurbo(this, 0, 2056, textureX, textureY); // Import Box613
		turretModel[68] = new ModelRendererTurbo(this, 0, 2080, textureX, textureY); // Import Box614
		turretModel[69] = new ModelRendererTurbo(this, 0, 2096, textureX, textureY); // Import Box615
		turretModel[70] = new ModelRendererTurbo(this, 0, 2110, textureX, textureY); // Import Box616
		turretModel[71] = new ModelRendererTurbo(this, 0, 2080, textureX, textureY); // Import Box617
		turretModel[72] = new ModelRendererTurbo(this, 0, 2096, textureX, textureY); // Import Box618
		turretModel[73] = new ModelRendererTurbo(this, 0, 2110, textureX, textureY); // Import Box619
		turretModel[74] = new ModelRendererTurbo(this, 0, 2120, textureX, textureY); // Import Box620
		turretModel[75] = new ModelRendererTurbo(this, 0, 2127, textureX, textureY); // Import Box621
		turretModel[76] = new ModelRendererTurbo(this, 0, 2120, textureX, textureY); // Import Box622
		turretModel[77] = new ModelRendererTurbo(this, 0, 2127, textureX, textureY); // Import Box623
		turretModel[78] = new ModelRendererTurbo(this, 0, 2139, textureX, textureY); // Import Box624
		turretModel[79] = new ModelRendererTurbo(this, 0, 2146, textureX, textureY); // Import Box628
		turretModel[80] = new ModelRendererTurbo(this, 0, 2154, textureX, textureY); // Import Box629
		turretModel[81] = new ModelRendererTurbo(this, 0, 2161, textureX, textureY); // Import Box630
		turretModel[82] = new ModelRendererTurbo(this, 0, 2154, textureX, textureY); // Import Box631
		turretModel[83] = new ModelRendererTurbo(this, 0, 2161, textureX, textureY); // Import Box632
		turretModel[84] = new ModelRendererTurbo(this, 0, 2167, textureX, textureY); // Import Box633
		turretModel[85] = new ModelRendererTurbo(this, 0, 2178, textureX, textureY); // Import Box634
		turretModel[86] = new ModelRendererTurbo(this, 0, 2189, textureX, textureY); // Import Box635
		turretModel[87] = new ModelRendererTurbo(this, 0, 2200, textureX, textureY); // Import Box636
		turretModel[88] = new ModelRendererTurbo(this, 0, 2217, textureX, textureY); // Import Box637
		turretModel[89] = new ModelRendererTurbo(this, 0, 2230, textureX, textureY); // Import Box638
		turretModel[90] = new ModelRendererTurbo(this, 0, 2230, textureX, textureY); // Import Box639
		turretModel[91] = new ModelRendererTurbo(this, 0, 2236, textureX, textureY); // Import Box640
		turretModel[92] = new ModelRendererTurbo(this, 0, 2241, textureX, textureY); // Import Box641
		turretModel[93] = new ModelRendererTurbo(this, 0, 2236, textureX, textureY); // Import Box642
		turretModel[94] = new ModelRendererTurbo(this, 0, 2241, textureX, textureY); // Import Box643
		turretModel[95] = new ModelRendererTurbo(this, 0, 2236, textureX, textureY); // Import Box644
		turretModel[96] = new ModelRendererTurbo(this, 0, 2241, textureX, textureY); // Import Box645
		turretModel[97] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Import Box646
		turretModel[98] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Import Box647
		turretModel[99] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Import Box648
		turretModel[100] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Import Box649
		turretModel[101] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Import Box650
		turretModel[102] = new ModelRendererTurbo(this, 0, 2251, textureX, textureY); // Import Box651
		turretModel[103] = new ModelRendererTurbo(this, 0, 2251, textureX, textureY); // Import Box653
		turretModel[104] = new ModelRendererTurbo(this, 0, 2256, textureX, textureY); // Import Box654
		turretModel[105] = new ModelRendererTurbo(this, 0, 2256, textureX, textureY); // Import Box655
		turretModel[106] = new ModelRendererTurbo(this, 0, 2264, textureX, textureY); // Import Box656
		turretModel[107] = new ModelRendererTurbo(this, 0, 2264, textureX, textureY); // Import Box657
		turretModel[108] = new ModelRendererTurbo(this, 0, 2282, textureX, textureY); // Import Box658
		turretModel[109] = new ModelRendererTurbo(this, 0, 2282, textureX, textureY); // Import Box659
		turretModel[110] = new ModelRendererTurbo(this, 0, 2282, textureX, textureY); // Import Box660
		turretModel[111] = new ModelRendererTurbo(this, 0, 2282, textureX, textureY); // Import Box661
		turretModel[112] = new ModelRendererTurbo(this, 0, 2286, textureX, textureY); // Box 1824
		turretModel[113] = new ModelRendererTurbo(this, 0, 2297, textureX, textureY); // Box 1825
		turretModel[114] = new ModelRendererTurbo(this, 0, 2297, textureX, textureY); // Box 1826
		turretModel[115] = new ModelRendererTurbo(this, 0, 2304, textureX, textureY); // Box 1827
		turretModel[116] = new ModelRendererTurbo(this, 0, 2309, textureX, textureY); // Box 1830
		turretModel[117] = new ModelRendererTurbo(this, 0, 2309, textureX, textureY); // Box 1831
		turretModel[118] = new ModelRendererTurbo(this, 0, 2309, textureX, textureY); // Box 1832
		turretModel[119] = new ModelRendererTurbo(this, 0, 2309, textureX, textureY); // Box 1833
		turretModel[120] = new ModelRendererTurbo(this, 0, 2304, textureX, textureY); // Box 1834

		turretModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box480
		turretModel[0].setRotationPoint(-2.5F, -19F, 0F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F); // Import Box481
		turretModel[1].setRotationPoint(-11.5F, -19F, 0F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -6F); // Import Box482
		turretModel[2].setRotationPoint(-17.5F, -19F, 0F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -10F, 0F, 0F, -2F); // Import Box483
		turretModel[3].setRotationPoint(10.5F, -19F, 0F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box484
		turretModel[4].setRotationPoint(-2.5F, -23F, 0F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box485
		turretModel[5].setRotationPoint(-11.5F, -23F, 0F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 6, 4, 13, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F); // Import Box487
		turretModel[6].setRotationPoint(-17.5F, -23F, 0F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, 0F); // Import Box488
		turretModel[7].setRotationPoint(10.5F, -23F, 0F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 13, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box489
		turretModel[8].setRotationPoint(-2.5F, -29F, 0F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 9, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box490
		turretModel[9].setRotationPoint(-11.5F, -29F, 0F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F); // Import Box491
		turretModel[10].setRotationPoint(-18.5F, -29F, 0F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 13, 6, 17, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box492
		turretModel[11].setRotationPoint(10.5F, -29F, 0F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F); // Import Box493
		turretModel[12].setRotationPoint(-2.5F, -33F, 0F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F); // Import Box494
		turretModel[13].setRotationPoint(-11.5F, -33F, 0F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F); // Import Box495
		turretModel[14].setRotationPoint(-17.5F, -33F, 0F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F); // Import Box496
		turretModel[15].setRotationPoint(-17.5F, -35F, 0F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box497
		turretModel[16].setRotationPoint(-11.5F, -35F, 0F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box498
		turretModel[17].setRotationPoint(-2.5F, -35F, 0F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 13, 4, 17, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, -11F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -7F, 0F, 0F, 0F); // Import Box501
		turretModel[18].setRotationPoint(10.5F, -32F, 0F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 17, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, -14F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -11F, 0F, 0F, -1F); // Import Box502
		turretModel[19].setRotationPoint(10.5F, -34F, 0F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box503
		turretModel[20].setRotationPoint(-2.5F, -19F, -16F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box504
		turretModel[21].setRotationPoint(-11.5F, -19F, -16F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,-1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box505
		turretModel[22].setRotationPoint(-17.5F, -19F, -13F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box506
		turretModel[23].setRotationPoint(10.5F, -19F, -16F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box507
		turretModel[24].setRotationPoint(-2.5F, -23F, -16F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box508
		turretModel[25].setRotationPoint(-11.5F, -23F, -16F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 6, 4, 13, 0F,0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box509
		turretModel[26].setRotationPoint(-17.5F, -23F, -13F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F,0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box510
		turretModel[27].setRotationPoint(10.5F, -23F, -16F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 13, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box511
		turretModel[28].setRotationPoint(-2.5F, -29F, -17F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 9, 6, 17, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box512
		turretModel[29].setRotationPoint(-11.5F, -29F, -17F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 7, 6, 14, 0F,-1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		turretModel[30].setRotationPoint(-18.5F, -29F, -14F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 13, 6, 17, 0F,0F, -1F, 0F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box514
		turretModel[31].setRotationPoint(10.5F, -29F, -17F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 13, 4, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box515
		turretModel[32].setRotationPoint(-2.5F, -33F, -16F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box516
		turretModel[33].setRotationPoint(-11.5F, -33F, -16F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 13, 0F,-1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box517
		turretModel[34].setRotationPoint(-17.5F, -33F, -13F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,-4F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box518
		turretModel[35].setRotationPoint(-17.5F, -35F, -13F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 16, 0F,0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box519
		turretModel[36].setRotationPoint(-11.5F, -35F, -16F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box520
		turretModel[37].setRotationPoint(-2.5F, -35F, -16F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 13, 4, 17, 0F,0F, -1F, -1F, 0F, -3F, -11F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box521
		turretModel[38].setRotationPoint(10.5F, -32F, -17F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 13, 3, 17, 0F,0F, -1F, -5F, 0F, -4F, -14F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 2F, -11F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box522
		turretModel[39].setRotationPoint(10.5F, -34F, -17F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -6F); // Import Box524
		turretModel[40].setRotationPoint(23.5F, -23F, 0F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -11F, 0F, 0F, -10F); // Import Box525
		turretModel[41].setRotationPoint(23.5F, -20F, 0F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -6F); // Import Box526
		turretModel[42].setRotationPoint(23.5F, -26F, 0F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -13F, 0F, 0F, -11F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -10F, 0F, 0F, -7F); // Import Box527
		turretModel[43].setRotationPoint(23.5F, -29F, 0F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -13F, 0F, 0F, -11F); // Import Box528
		turretModel[44].setRotationPoint(23.5F, -30F, 0F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, -5F, 1F, 0F, -8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box529
		turretModel[45].setRotationPoint(23.5F, -23F, -16F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, -1F, -11F, -1F, -1F, 0F, 0F, 0F, 0F); // Import Box530
		turretModel[46].setRotationPoint(23.5F, -20F, -16F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 4, 3, 17, 0F,0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box531
		turretModel[47].setRotationPoint(23.5F, -26F, -17F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, -11F, 0F, -1F, -13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -10F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box532
		turretModel[48].setRotationPoint(23.5F, -29F, -17F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, -14F, -1F, -1F, -14F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 1F, -13F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box533
		turretModel[49].setRotationPoint(23.5F, -30F, -17F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box534
		turretModel[50].setRotationPoint(23.5F, -26F, -3F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box535
		turretModel[51].setRotationPoint(23.5F, -28F, -3F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box536
		turretModel[52].setRotationPoint(23.5F, -29F, -3F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box537
		turretModel[53].setRotationPoint(23.5F, -22F, -3F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box538
		turretModel[54].setRotationPoint(23.5F, -20F, -3F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Import Box539
		turretModel[55].setRotationPoint(23.5F, -29F, 3F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box540
		turretModel[56].setRotationPoint(23.5F, -28F, 3F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box541
		turretModel[57].setRotationPoint(23.5F, -26F, 3F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F); // Import Box544
		turretModel[58].setRotationPoint(23.5F, -22F, 3F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F); // Import Box545
		turretModel[59].setRotationPoint(23.5F, -20F, 3F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, 0F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box546
		turretModel[60].setRotationPoint(23.5F, -29F, -5F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -1F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box547
		turretModel[61].setRotationPoint(23.5F, -28F, -5F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box548
		turretModel[62].setRotationPoint(23.5F, -26F, -5F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box549
		turretModel[63].setRotationPoint(23.5F, -22F, -5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box550
		turretModel[64].setRotationPoint(23.5F, -20F, -5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 9, 6, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box611
		turretModel[65].setRotationPoint(-22.5F, -34F, -7F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 12, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box612
		turretModel[66].setRotationPoint(-28.5F, -28F, -7F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 9, 4, 14, 0F,6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box613
		turretModel[67].setRotationPoint(-22.5F, -22F, -7F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,-2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box614
		turretModel[68].setRotationPoint(-22.5F, -34F, -10F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 12, 6, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box615
		turretModel[69].setRotationPoint(-28.5F, -28F, -10F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box616
		turretModel[70].setRotationPoint(-22.5F, -22F, -10F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box617
		turretModel[71].setRotationPoint(-22.5F, -34F, 7F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 12, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box618
		turretModel[72].setRotationPoint(-28.5F, -28F, 7F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F); // Import Box619
		turretModel[73].setRotationPoint(-22.5F, -22F, 7F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box620
		turretModel[74].setRotationPoint(-23.5F, -34F, -6F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box621
		turretModel[75].setRotationPoint(-26.5F, -34F, -6F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box622
		turretModel[76].setRotationPoint(-23.5F, -34F, 4F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box623
		turretModel[77].setRotationPoint(-26.5F, -34F, 4F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box624
		turretModel[78].setRotationPoint(-19.5F, -34F, -1.5F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box628
		turretModel[79].setRotationPoint(-2.5F, -36F, -7F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box629
		turretModel[80].setRotationPoint(-2.5F, -36F, -9F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box630
		turretModel[81].setRotationPoint(-1.5F, -36F, -10F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box631
		turretModel[82].setRotationPoint(-2.5F, -36F, -4F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box632
		turretModel[83].setRotationPoint(-1.5F, -36F, -2F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box633
		turretModel[84].setRotationPoint(-2.5F, -36F, 1F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F); // Import Box634
		turretModel[85].setRotationPoint(1.5F, -36F, 1F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box635
		turretModel[86].setRotationPoint(-4.5F, -36F, 1F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box636
		turretModel[87].setRotationPoint(5.5F, -36F, 0F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box637
		turretModel[88].setRotationPoint(11.5F, -36F, 0F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box638
		turretModel[89].setRotationPoint(11.5F, -35F, 0F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box639
		turretModel[90].setRotationPoint(11.5F, -35F, 9F);

		turretModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box640
		turretModel[91].setRotationPoint(11.5F, -34.5F, 1.5F);

		turretModel[92].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Import Box641
		turretModel[92].setRotationPoint(14.5F, -34.5F, 1.5F);

		turretModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box642
		turretModel[93].setRotationPoint(11.5F, -34.5F, 6.5F);

		turretModel[94].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Import Box643
		turretModel[94].setRotationPoint(14.5F, -34.5F, 6.5F);

		turretModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box644
		turretModel[95].setRotationPoint(11.5F, -34.5F, 4F);

		turretModel[96].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Import Box645
		turretModel[96].setRotationPoint(14.5F, -34.5F, 4F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box646
		turretModel[97].setRotationPoint(6.5F, -37F, 0F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box647
		turretModel[98].setRotationPoint(6.5F, -37F, 2F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box648
		turretModel[99].setRotationPoint(6.5F, -37F, 4F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box649
		turretModel[100].setRotationPoint(6.5F, -37F, 7F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box650
		turretModel[101].setRotationPoint(6.5F, -37F, 9F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box651
		turretModel[102].setRotationPoint(5.5F, -34F, -8F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box653
		turretModel[103].setRotationPoint(3.5F, -34F, -4F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box654
		turretModel[104].setRotationPoint(-2.5F, -34F, -18F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box655
		turretModel[105].setRotationPoint(5.5F, -34F, -18F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box656
		turretModel[106].setRotationPoint(-2.5F, -33F, -18F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box657
		turretModel[107].setRotationPoint(5.5F, -33F, -18F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box658
		turretModel[108].setRotationPoint(-1.5F, -33F, -18F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box659
		turretModel[109].setRotationPoint(-1.5F, -29F, -18F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box660
		turretModel[110].setRotationPoint(-1.5F, -25F, -18F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box661
		turretModel[111].setRotationPoint(-1.5F, -21F, -18F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 1824
		turretModel[112].setRotationPoint(-2.5F, -29F, 16F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 1825
		turretModel[113].setRotationPoint(-2.5F, -30F, 16F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F); // Box 1826
		turretModel[114].setRotationPoint(-2.5F, -24F, 16F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1827
		turretModel[115].setRotationPoint(2.5F, -28F, 17.5F);
		turretModel[115].rotateAngleZ = 0.2443461F;

		turretModel[116].addShapeBox(0F, -1F, 0F, 6, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1830
		turretModel[116].setRotationPoint(2.5F, -28F, 17.5F);
		turretModel[116].rotateAngleZ = 0.2443461F;

		turretModel[117].addShapeBox(0F, 1F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1831
		turretModel[117].setRotationPoint(2.5F, -28F, 17.5F);
		turretModel[117].rotateAngleZ = 0.2443461F;

		turretModel[118].addShapeBox(0F, 1F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1832
		turretModel[118].setRotationPoint(2.5F, -26F, 17.5F);
		turretModel[118].rotateAngleZ = -0.15707963F;

		turretModel[119].addShapeBox(0F, -1F, 0F, 6, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1833
		turretModel[119].setRotationPoint(2.5F, -26F, 17.5F);
		turretModel[119].rotateAngleZ = -0.15707963F;

		turretModel[120].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1834
		turretModel[120].setRotationPoint(2.5F, -26F, 17.5F);
		turretModel[120].rotateAngleZ = -0.15707963F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 2315, textureX, textureY); // Import Box551
		barrelModel[1] = new ModelRendererTurbo(this, 0, 2315, textureX, textureY); // Import Box552
		barrelModel[2] = new ModelRendererTurbo(this, 0, 2315, textureX, textureY); // Import Box553
		barrelModel[3] = new ModelRendererTurbo(this, 0, 2315, textureX, textureY); // Import Box554
		barrelModel[4] = new ModelRendererTurbo(this, 0, 2323, textureX, textureY); // Import Box555
		barrelModel[5] = new ModelRendererTurbo(this, 0, 2323, textureX, textureY); // Import Box556
		barrelModel[6] = new ModelRendererTurbo(this, 0, 2323, textureX, textureY); // Import Box557
		barrelModel[7] = new ModelRendererTurbo(this, 0, 2323, textureX, textureY); // Import Box558
		barrelModel[8] = new ModelRendererTurbo(this, 0, 2329, textureX, textureY); // Import Box559
		barrelModel[9] = new ModelRendererTurbo(this, 0, 2329, textureX, textureY); // Import Box560
		barrelModel[10] = new ModelRendererTurbo(this, 0, 2329, textureX, textureY); // Import Box561
		barrelModel[11] = new ModelRendererTurbo(this, 0, 2329, textureX, textureY); // Import Box562
		barrelModel[12] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box563
		barrelModel[13] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box564
		barrelModel[14] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box565
		barrelModel[15] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box566
		barrelModel[16] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box567
		barrelModel[17] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box568
		barrelModel[18] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box569
		barrelModel[19] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box570
		barrelModel[20] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box571
		barrelModel[21] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box572
		barrelModel[22] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box573
		barrelModel[23] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box574
		barrelModel[24] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box579
		barrelModel[25] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box580
		barrelModel[26] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box581
		barrelModel[27] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box583
		barrelModel[28] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box584
		barrelModel[29] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box585
		barrelModel[30] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box586
		barrelModel[31] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box587
		barrelModel[32] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box588
		barrelModel[33] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box589
		barrelModel[34] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box590
		barrelModel[35] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box591
		barrelModel[36] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box592
		barrelModel[37] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box593
		barrelModel[38] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box594
		barrelModel[39] = new ModelRendererTurbo(this, 0, 2345, textureX, textureY); // Import Box595
		barrelModel[40] = new ModelRendererTurbo(this, 0, 2351, textureX, textureY); // Import Box597
		barrelModel[41] = new ModelRendererTurbo(this, 0, 2351, textureX, textureY); // Import Box600
		barrelModel[42] = new ModelRendererTurbo(this, 0, 2358, textureX, textureY); // Import Box601
		barrelModel[43] = new ModelRendererTurbo(this, 0, 2358, textureX, textureY); // Import Box602
		barrelModel[44] = new ModelRendererTurbo(this, 0, 2358, textureX, textureY); // Import Box607
		barrelModel[45] = new ModelRendererTurbo(this, 0, 2351, textureX, textureY); // Import Box608
		barrelModel[46] = new ModelRendererTurbo(this, 0, 2351, textureX, textureY); // Import Box609
		barrelModel[47] = new ModelRendererTurbo(this, 0, 2358, textureX, textureY); // Import Box610

		barrelModel[0].addShapeBox(-4F, 0F, 0F, 23, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box551
		barrelModel[0].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[1].addShapeBox(-4F, -3F, 0F, 23, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box552
		barrelModel[1].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[2].addShapeBox(-4F, -3F, -3F, 23, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box553
		barrelModel[2].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[3].addShapeBox(-4F, 0F, -3F, 23, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box554
		barrelModel[3].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[4].addShapeBox(18F, -2F, 0F, 43, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box555
		barrelModel[4].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[5].addShapeBox(18F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box556
		barrelModel[5].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[6].addShapeBox(18F, 0F, -2F, 43, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box557
		barrelModel[6].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[7].addShapeBox(18F, -2F, -2F, 43, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box558
		barrelModel[7].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[8].addShapeBox(61F, -3F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box559
		barrelModel[8].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[9].addShapeBox(61F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box560
		barrelModel[9].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[10].addShapeBox(61F, 0F, -3F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box561
		barrelModel[10].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[11].addShapeBox(61F, -3F, -3F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box562
		barrelModel[11].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[12].addShapeBox(64F, -3F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box563
		barrelModel[12].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[13].addShapeBox(64F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box564
		barrelModel[13].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[14].addShapeBox(64F, 0F, -3F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box565
		barrelModel[14].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[15].addShapeBox(64F, -3F, -3F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box566
		barrelModel[15].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[16].addShapeBox(66F, -3F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		barrelModel[16].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[17].addShapeBox(66F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box568
		barrelModel[17].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[18].addShapeBox(66F, 0F, -3F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box569
		barrelModel[18].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[19].addShapeBox(66F, -3F, -3F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box570
		barrelModel[19].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[20].addShapeBox(68F, -3F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box571
		barrelModel[20].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[21].addShapeBox(68F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box572
		barrelModel[21].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[22].addShapeBox(68F, 0F, -3F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box573
		barrelModel[22].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[23].addShapeBox(68F, -3F, -3F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box574
		barrelModel[23].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[24].addShapeBox(63F, -3F, -3F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box579
		barrelModel[24].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[25].addShapeBox(63F, 0F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box580
		barrelModel[25].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[26].addShapeBox(63F, -5F, 1F, 1, 3, 1, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box581
		barrelModel[26].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[27].addShapeBox(63F, 2F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -3F, 1F); // Import Box583
		barrelModel[27].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[28].addShapeBox(65F, 2F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -3F, 1F); // Import Box584
		barrelModel[28].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[29].addShapeBox(65F, 0F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box585
		barrelModel[29].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[30].addShapeBox(65F, -3F, -3F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box586
		barrelModel[30].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[31].addShapeBox(65F, -5F, 1F, 1, 3, 1, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box587
		barrelModel[31].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[32].addShapeBox(67F, 2F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -3F, 1F); // Import Box588
		barrelModel[32].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[33].addShapeBox(67F, 0F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box589
		barrelModel[33].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[34].addShapeBox(67F, -3F, -3F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box590
		barrelModel[34].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[35].addShapeBox(67F, -5F, 1F, 1, 3, 1, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box591
		barrelModel[35].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[36].addShapeBox(69F, 2F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -3F, 1F); // Import Box592
		barrelModel[36].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[37].addShapeBox(69F, 0F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box593
		barrelModel[37].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[38].addShapeBox(69F, -3F, -3F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box594
		barrelModel[38].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[39].addShapeBox(69F, -5F, 1F, 1, 3, 1, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box595
		barrelModel[39].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[40].addShapeBox(70F, -3F, 2F, 6, 3, 1, 0F,0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box597
		barrelModel[40].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[41].addShapeBox(70F, -5F, 1F, 6, 3, 1, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box600
		barrelModel[41].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[42].addShapeBox(70F, -3F, -3F, 6, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box601
		barrelModel[42].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[43].addShapeBox(70F, -5F, -2F, 6, 3, 1, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box602
		barrelModel[43].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[44].addShapeBox(70F, 0F, -3F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Import Box607
		barrelModel[44].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[45].addShapeBox(70F, 0F, 2F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box608
		barrelModel[45].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[46].addShapeBox(70F, 2F, 1F, 6, 3, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -2F, -2F); // Import Box609
		barrelModel[46].setRotationPoint(30.5F, -24F, 0F);

		barrelModel[47].addShapeBox(70F, 2F, -2F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -3F, 1F); // Import Box610
		barrelModel[47].setRotationPoint(30.5F, -24F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box677
		leftTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box678
		leftTrackModel[2] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box679
		leftTrackModel[3] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box680
		leftTrackModel[4] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box681
		leftTrackModel[5] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box682
		leftTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box683
		leftTrackModel[7] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box684
		leftTrackModel[8] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box685
		leftTrackModel[9] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box686
		leftTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box687
		leftTrackModel[11] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box688
		leftTrackModel[12] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box689
		leftTrackModel[13] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box690
		leftTrackModel[14] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box691
		leftTrackModel[15] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box692
		leftTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box693
		leftTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box694
		leftTrackModel[18] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box695
		leftTrackModel[19] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box696
		leftTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box697
		leftTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box698
		leftTrackModel[22] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box699
		leftTrackModel[23] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box700
		leftTrackModel[24] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box701
		leftTrackModel[25] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box702
		leftTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box703
		leftTrackModel[27] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box704
		leftTrackModel[28] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box705
		leftTrackModel[29] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box706
		leftTrackModel[30] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box707
		leftTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box708
		leftTrackModel[32] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box709
		leftTrackModel[33] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box710
		leftTrackModel[34] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box711
		leftTrackModel[35] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box712
		leftTrackModel[36] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box713
		leftTrackModel[37] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box714
		leftTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box715
		leftTrackModel[39] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box716
		leftTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box717
		leftTrackModel[41] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box718
		leftTrackModel[42] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box719
		leftTrackModel[43] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box720
		leftTrackModel[44] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box721
		leftTrackModel[45] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box722
		leftTrackModel[46] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box723
		leftTrackModel[47] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box724
		leftTrackModel[48] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box725
		leftTrackModel[49] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box726
		leftTrackModel[50] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box727
		leftTrackModel[51] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box728
		leftTrackModel[52] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box729
		leftTrackModel[53] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box730
		leftTrackModel[54] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box731
		leftTrackModel[55] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box732
		leftTrackModel[56] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box733
		leftTrackModel[57] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box734
		leftTrackModel[58] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box735
		leftTrackModel[59] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box736
		leftTrackModel[60] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box737
		leftTrackModel[61] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box738
		leftTrackModel[62] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box739
		leftTrackModel[63] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box740
		leftTrackModel[64] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box741
		leftTrackModel[65] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box742
		leftTrackModel[66] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box743
		leftTrackModel[67] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box744
		leftTrackModel[68] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box745
		leftTrackModel[69] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box746
		leftTrackModel[70] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box747
		leftTrackModel[71] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box748
		leftTrackModel[72] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box749
		leftTrackModel[73] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box750
		leftTrackModel[74] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box751
		leftTrackModel[75] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box752
		leftTrackModel[76] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box753
		leftTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box754
		leftTrackModel[78] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box755
		leftTrackModel[79] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box756
		leftTrackModel[80] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box757
		leftTrackModel[81] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box758
		leftTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box759
		leftTrackModel[83] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box760
		leftTrackModel[84] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box761
		leftTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box762
		leftTrackModel[86] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box763
		leftTrackModel[87] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box764
		leftTrackModel[88] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box765
		leftTrackModel[89] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box766
		leftTrackModel[90] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box767
		leftTrackModel[91] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box768
		leftTrackModel[92] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box769
		leftTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box770
		leftTrackModel[94] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box771
		leftTrackModel[95] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box772
		leftTrackModel[96] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box773
		leftTrackModel[97] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box774
		leftTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box775
		leftTrackModel[99] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box776
		leftTrackModel[100] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box777
		leftTrackModel[101] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box778
		leftTrackModel[102] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box779
		leftTrackModel[103] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box780
		leftTrackModel[104] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box781
		leftTrackModel[105] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box782
		leftTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box783
		leftTrackModel[107] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box784
		leftTrackModel[108] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box785
		leftTrackModel[109] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box786
		leftTrackModel[110] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box787
		leftTrackModel[111] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box788
		leftTrackModel[112] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box789
		leftTrackModel[113] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box790
		leftTrackModel[114] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box791
		leftTrackModel[115] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box792
		leftTrackModel[116] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box793
		leftTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box794
		leftTrackModel[118] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box795
		leftTrackModel[119] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box796
		leftTrackModel[120] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box797
		leftTrackModel[121] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box798
		leftTrackModel[122] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box799
		leftTrackModel[123] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box800
		leftTrackModel[124] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box801
		leftTrackModel[125] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box802
		leftTrackModel[126] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box803
		leftTrackModel[127] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box804
		leftTrackModel[128] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box805
		leftTrackModel[129] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box806
		leftTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box807
		leftTrackModel[131] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box808
		leftTrackModel[132] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box809
		leftTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box810
		leftTrackModel[134] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box811
		leftTrackModel[135] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box812
		leftTrackModel[136] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box813
		leftTrackModel[137] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box814
		leftTrackModel[138] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box815
		leftTrackModel[139] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box816
		leftTrackModel[140] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box817
		leftTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box818
		leftTrackModel[142] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box819
		leftTrackModel[143] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box820
		leftTrackModel[144] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box821
		leftTrackModel[145] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box822
		leftTrackModel[146] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box823
		leftTrackModel[147] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box824
		leftTrackModel[148] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box825
		leftTrackModel[149] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box826
		leftTrackModel[150] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box827
		leftTrackModel[151] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box828
		leftTrackModel[152] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box829
		leftTrackModel[153] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box830
		leftTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box831
		leftTrackModel[155] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box832
		leftTrackModel[156] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box833
		leftTrackModel[157] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box834
		leftTrackModel[158] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box835
		leftTrackModel[159] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box836
		leftTrackModel[160] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box837
		leftTrackModel[161] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box838
		leftTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box839
		leftTrackModel[163] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box840
		leftTrackModel[164] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box841
		leftTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box842
		leftTrackModel[166] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box843
		leftTrackModel[167] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box844
		leftTrackModel[168] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box845
		leftTrackModel[169] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box846
		leftTrackModel[170] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box847
		leftTrackModel[171] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box848
		leftTrackModel[172] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box849
		leftTrackModel[173] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box850
		leftTrackModel[174] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box851
		leftTrackModel[175] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box852
		leftTrackModel[176] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box853
		leftTrackModel[177] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box854
		leftTrackModel[178] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box855
		leftTrackModel[179] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box856
		leftTrackModel[180] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box857
		leftTrackModel[181] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box858
		leftTrackModel[182] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box859
		leftTrackModel[183] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box860
		leftTrackModel[184] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box861
		leftTrackModel[185] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box862
		leftTrackModel[186] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box863
		leftTrackModel[187] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box864
		leftTrackModel[188] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box865
		leftTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box866
		leftTrackModel[190] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box867
		leftTrackModel[191] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box868
		leftTrackModel[192] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box869
		leftTrackModel[193] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box870
		leftTrackModel[194] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box871
		leftTrackModel[195] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box872
		leftTrackModel[196] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box873
		leftTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box874
		leftTrackModel[198] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box875
		leftTrackModel[199] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box876
		leftTrackModel[200] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box877
		leftTrackModel[201] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box878
		leftTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box879
		leftTrackModel[203] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box880
		leftTrackModel[204] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box881
		leftTrackModel[205] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box882
		leftTrackModel[206] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box883
		leftTrackModel[207] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box884
		leftTrackModel[208] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box885
		leftTrackModel[209] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box886
		leftTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box887
		leftTrackModel[211] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box888
		leftTrackModel[212] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box889
		leftTrackModel[213] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box890
		leftTrackModel[214] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box891
		leftTrackModel[215] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box892
		leftTrackModel[216] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box893
		leftTrackModel[217] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box894
		leftTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box895
		leftTrackModel[219] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box896
		leftTrackModel[220] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box897
		leftTrackModel[221] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box898
		leftTrackModel[222] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box899
		leftTrackModel[223] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box900
		leftTrackModel[224] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box901
		leftTrackModel[225] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box902
		leftTrackModel[226] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box903
		leftTrackModel[227] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box904
		leftTrackModel[228] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box905
		leftTrackModel[229] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box906
		leftTrackModel[230] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box907
		leftTrackModel[231] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box908
		leftTrackModel[232] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box909
		leftTrackModel[233] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box910
		leftTrackModel[234] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box911
		leftTrackModel[235] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box912
		leftTrackModel[236] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box913
		leftTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box914
		leftTrackModel[238] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box915
		leftTrackModel[239] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box916
		leftTrackModel[240] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box917
		leftTrackModel[241] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box918
		leftTrackModel[242] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box919
		leftTrackModel[243] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box920
		leftTrackModel[244] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box921
		leftTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box922
		leftTrackModel[246] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box923
		leftTrackModel[247] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box924
		leftTrackModel[248] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box925
		leftTrackModel[249] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box926
		leftTrackModel[250] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box927
		leftTrackModel[251] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box928
		leftTrackModel[252] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box929
		leftTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box930
		leftTrackModel[254] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box931
		leftTrackModel[255] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box932
		leftTrackModel[256] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box933
		leftTrackModel[257] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box934
		leftTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box935
		leftTrackModel[259] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box936
		leftTrackModel[260] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box937
		leftTrackModel[261] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box938
		leftTrackModel[262] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box939
		leftTrackModel[263] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box940
		leftTrackModel[264] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box941
		leftTrackModel[265] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box942
		leftTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box943
		leftTrackModel[267] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box944
		leftTrackModel[268] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box945
		leftTrackModel[269] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box946
		leftTrackModel[270] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box947
		leftTrackModel[271] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box948
		leftTrackModel[272] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box949
		leftTrackModel[273] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box950
		leftTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box951
		leftTrackModel[275] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box952
		leftTrackModel[276] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box953
		leftTrackModel[277] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box954
		leftTrackModel[278] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box955
		leftTrackModel[279] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box956
		leftTrackModel[280] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box957
		leftTrackModel[281] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box958
		leftTrackModel[282] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box959
		leftTrackModel[283] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box960
		leftTrackModel[284] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box961
		leftTrackModel[285] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box962
		leftTrackModel[286] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box963
		leftTrackModel[287] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box964
		leftTrackModel[288] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box965
		leftTrackModel[289] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box966
		leftTrackModel[290] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box967
		leftTrackModel[291] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box968
		leftTrackModel[292] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box969
		leftTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box970
		leftTrackModel[294] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box971
		leftTrackModel[295] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box972
		leftTrackModel[296] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box973
		leftTrackModel[297] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box974
		leftTrackModel[298] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box975
		leftTrackModel[299] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box976
		leftTrackModel[300] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box977
		leftTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box978
		leftTrackModel[302] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box979
		leftTrackModel[303] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box980
		leftTrackModel[304] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box981
		leftTrackModel[305] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box982
		leftTrackModel[306] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box983
		leftTrackModel[307] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box984
		leftTrackModel[308] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box985
		leftTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box986
		leftTrackModel[310] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box987
		leftTrackModel[311] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box988
		leftTrackModel[312] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box989
		leftTrackModel[313] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box990
		leftTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box991
		leftTrackModel[315] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box992
		leftTrackModel[316] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box993
		leftTrackModel[317] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box994
		leftTrackModel[318] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box995
		leftTrackModel[319] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box996
		leftTrackModel[320] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box997
		leftTrackModel[321] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box998
		leftTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box999
		leftTrackModel[323] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1000
		leftTrackModel[324] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1001
		leftTrackModel[325] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1002
		leftTrackModel[326] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1003
		leftTrackModel[327] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1004
		leftTrackModel[328] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1005
		leftTrackModel[329] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1006
		leftTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1007
		leftTrackModel[331] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1008
		leftTrackModel[332] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1009
		leftTrackModel[333] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1010
		leftTrackModel[334] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1011
		leftTrackModel[335] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1012
		leftTrackModel[336] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1013
		leftTrackModel[337] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1014
		leftTrackModel[338] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1015
		leftTrackModel[339] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1016
		leftTrackModel[340] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1017
		leftTrackModel[341] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1018
		leftTrackModel[342] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1019
		leftTrackModel[343] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1020
		leftTrackModel[344] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1021
		leftTrackModel[345] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1022
		leftTrackModel[346] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1023
		leftTrackModel[347] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1024
		leftTrackModel[348] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1025
		leftTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1026
		leftTrackModel[350] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1027
		leftTrackModel[351] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1028
		leftTrackModel[352] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1029
		leftTrackModel[353] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1030
		leftTrackModel[354] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1031
		leftTrackModel[355] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1032
		leftTrackModel[356] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1033
		leftTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1034
		leftTrackModel[358] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1035
		leftTrackModel[359] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1036
		leftTrackModel[360] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1037
		leftTrackModel[361] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1038
		leftTrackModel[362] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1039
		leftTrackModel[363] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1040
		leftTrackModel[364] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1041
		leftTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1042
		leftTrackModel[366] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1043
		leftTrackModel[367] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1044
		leftTrackModel[368] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1045
		leftTrackModel[369] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1046
		leftTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1047
		leftTrackModel[371] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1048
		leftTrackModel[372] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1049
		leftTrackModel[373] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1050
		leftTrackModel[374] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1051
		leftTrackModel[375] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1052
		leftTrackModel[376] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1053
		leftTrackModel[377] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1054
		leftTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1055
		leftTrackModel[379] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1056
		leftTrackModel[380] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1057
		leftTrackModel[381] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1058
		leftTrackModel[382] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1059
		leftTrackModel[383] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1060
		leftTrackModel[384] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1061
		leftTrackModel[385] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1062
		leftTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1063
		leftTrackModel[387] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1064
		leftTrackModel[388] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1065
		leftTrackModel[389] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1066
		leftTrackModel[390] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1067
		leftTrackModel[391] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1068
		leftTrackModel[392] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1069
		leftTrackModel[393] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1070
		leftTrackModel[394] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1071
		leftTrackModel[395] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1072
		leftTrackModel[396] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1073
		leftTrackModel[397] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1074
		leftTrackModel[398] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1075
		leftTrackModel[399] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1076
		leftTrackModel[400] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1077
		leftTrackModel[401] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1078
		leftTrackModel[402] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1079
		leftTrackModel[403] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1080
		leftTrackModel[404] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1081
		leftTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1082
		leftTrackModel[406] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1083
		leftTrackModel[407] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1084
		leftTrackModel[408] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1085
		leftTrackModel[409] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1086
		leftTrackModel[410] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1087
		leftTrackModel[411] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1088
		leftTrackModel[412] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1089
		leftTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1090
		leftTrackModel[414] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1091
		leftTrackModel[415] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1092
		leftTrackModel[416] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1093
		leftTrackModel[417] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1094
		leftTrackModel[418] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1095
		leftTrackModel[419] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1096
		leftTrackModel[420] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1097
		leftTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1098
		leftTrackModel[422] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1099
		leftTrackModel[423] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1100
		leftTrackModel[424] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1101
		leftTrackModel[425] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1102
		leftTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1103
		leftTrackModel[427] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1104
		leftTrackModel[428] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1105
		leftTrackModel[429] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1106
		leftTrackModel[430] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1107
		leftTrackModel[431] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1108
		leftTrackModel[432] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1109
		leftTrackModel[433] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1110
		leftTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1111
		leftTrackModel[435] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1112
		leftTrackModel[436] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1113
		leftTrackModel[437] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1114
		leftTrackModel[438] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1115
		leftTrackModel[439] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1116
		leftTrackModel[440] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1117
		leftTrackModel[441] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1118
		leftTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1119
		leftTrackModel[443] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1120
		leftTrackModel[444] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1121
		leftTrackModel[445] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1122
		leftTrackModel[446] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1123
		leftTrackModel[447] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1124
		leftTrackModel[448] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1125
		leftTrackModel[449] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1126
		leftTrackModel[450] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1127
		leftTrackModel[451] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1128
		leftTrackModel[452] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1129
		leftTrackModel[453] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1130
		leftTrackModel[454] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1131
		leftTrackModel[455] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1132
		leftTrackModel[456] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1133
		leftTrackModel[457] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1134
		leftTrackModel[458] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1135
		leftTrackModel[459] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1136
		leftTrackModel[460] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1137
		leftTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1138
		leftTrackModel[462] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1139
		leftTrackModel[463] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1140
		leftTrackModel[464] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1141
		leftTrackModel[465] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1142
		leftTrackModel[466] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1143
		leftTrackModel[467] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1144
		leftTrackModel[468] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1145
		leftTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1146
		leftTrackModel[470] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1147
		leftTrackModel[471] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1148
		leftTrackModel[472] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1149
		leftTrackModel[473] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1150
		leftTrackModel[474] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1151
		leftTrackModel[475] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1152
		leftTrackModel[476] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1153
		leftTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1154
		leftTrackModel[478] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1155
		leftTrackModel[479] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1156
		leftTrackModel[480] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1157
		leftTrackModel[481] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1158
		leftTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1159
		leftTrackModel[483] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1160
		leftTrackModel[484] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1161
		leftTrackModel[485] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1162
		leftTrackModel[486] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1163
		leftTrackModel[487] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1164
		leftTrackModel[488] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1165
		leftTrackModel[489] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1166
		leftTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1167
		leftTrackModel[491] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1168
		leftTrackModel[492] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1169
		leftTrackModel[493] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1170
		leftTrackModel[494] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1171
		leftTrackModel[495] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1172
		leftTrackModel[496] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1173
		leftTrackModel[497] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1174
		leftTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1175
		leftTrackModel[499] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1176

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box677
		leftTrackModel[0].setRotationPoint(45F, -6F, 18.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box678
		leftTrackModel[1].setRotationPoint(45F, -8F, 18.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box679
		leftTrackModel[2].setRotationPoint(46F, -9F, 18.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box680
		leftTrackModel[3].setRotationPoint(45F, -3F, 18.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box681
		leftTrackModel[4].setRotationPoint(46F, -1F, 18.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box682
		leftTrackModel[5].setRotationPoint(35F, -1F, 18.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box683
		leftTrackModel[6].setRotationPoint(34F, 0F, 18.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box684
		leftTrackModel[7].setRotationPoint(34F, 2F, 18.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box685
		leftTrackModel[8].setRotationPoint(34F, 5F, 18.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box686
		leftTrackModel[9].setRotationPoint(35F, 7F, 18.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box687
		leftTrackModel[10].setRotationPoint(22F, -1F, 18.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box688
		leftTrackModel[11].setRotationPoint(21F, 0F, 18.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box689
		leftTrackModel[12].setRotationPoint(21F, 2F, 18.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box690
		leftTrackModel[13].setRotationPoint(21F, 5F, 18.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box691
		leftTrackModel[14].setRotationPoint(22F, 7F, 18.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box692
		leftTrackModel[15].setRotationPoint(9F, -1F, 18.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box693
		leftTrackModel[16].setRotationPoint(8F, 0F, 18.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box694
		leftTrackModel[17].setRotationPoint(8F, 2F, 18.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box695
		leftTrackModel[18].setRotationPoint(8F, 5F, 18.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box696
		leftTrackModel[19].setRotationPoint(9F, 7F, 18.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box697
		leftTrackModel[20].setRotationPoint(-40F, -1F, 18.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box698
		leftTrackModel[21].setRotationPoint(-41F, 0F, 18.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box699
		leftTrackModel[22].setRotationPoint(-41F, 2F, 18.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box700
		leftTrackModel[23].setRotationPoint(-41F, 5F, 18.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box701
		leftTrackModel[24].setRotationPoint(-40F, 7F, 18.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box702
		leftTrackModel[25].setRotationPoint(-27F, -1F, 18.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box703
		leftTrackModel[26].setRotationPoint(-28F, 0F, 18.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box704
		leftTrackModel[27].setRotationPoint(-28F, 2F, 18.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box705
		leftTrackModel[28].setRotationPoint(-28F, 5F, 18.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box706
		leftTrackModel[29].setRotationPoint(-27F, 7F, 18.5F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box707
		leftTrackModel[30].setRotationPoint(-14F, -1F, 18.5F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box708
		leftTrackModel[31].setRotationPoint(-15F, 0F, 18.5F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box709
		leftTrackModel[32].setRotationPoint(-15F, 2F, 18.5F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box710
		leftTrackModel[33].setRotationPoint(-15F, 5F, 18.5F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box711
		leftTrackModel[34].setRotationPoint(-14F, 7F, 18.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box712
		leftTrackModel[35].setRotationPoint(-48F, -1F, 18.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box713
		leftTrackModel[36].setRotationPoint(-49F, -6F, 18.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box714
		leftTrackModel[37].setRotationPoint(-49F, -3F, 18.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box715
		leftTrackModel[38].setRotationPoint(-49F, -8F, 18.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box716
		leftTrackModel[39].setRotationPoint(-48F, -9F, 18.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box717
		leftTrackModel[40].setRotationPoint(-2.5F, -1F, 18.5F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box718
		leftTrackModel[41].setRotationPoint(-3.5F, 0F, 18.5F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box719
		leftTrackModel[42].setRotationPoint(-3.5F, 2F, 18.5F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box720
		leftTrackModel[43].setRotationPoint(-3.5F, 5F, 18.5F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box721
		leftTrackModel[44].setRotationPoint(-2.5F, 7F, 18.5F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box722
		leftTrackModel[45].setRotationPoint(48F, -10F, 25.5F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box723
		leftTrackModel[46].setRotationPoint(48F, -10F, 17.5F);

		leftTrackModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box724
		leftTrackModel[47].setRotationPoint(48F, -10F, 25.5F);

		leftTrackModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box725
		leftTrackModel[48].setRotationPoint(48F, -10F, 17.5F);

		leftTrackModel[49].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box726
		leftTrackModel[49].setRotationPoint(48F, -10F, 16.5F);

		leftTrackModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box727
		leftTrackModel[50].setRotationPoint(48F, -10F, 21.5F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box728
		leftTrackModel[51].setRotationPoint(48F, -10F, 23.5F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box729
		leftTrackModel[52].setRotationPoint(48F, -10F, 20.5F);

		leftTrackModel[53].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box730
		leftTrackModel[53].setRotationPoint(51F, -10F, 16.5F);
		leftTrackModel[53].rotateAngleZ = -0.40142573F;

		leftTrackModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box731
		leftTrackModel[54].setRotationPoint(51F, -10F, 25.5F);
		leftTrackModel[54].rotateAngleZ = -0.40142573F;

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box732
		leftTrackModel[55].setRotationPoint(51F, -10F, 25.5F);
		leftTrackModel[55].rotateAngleZ = -0.40142573F;

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box733
		leftTrackModel[56].setRotationPoint(51F, -10F, 23.5F);
		leftTrackModel[56].rotateAngleZ = -0.40142573F;

		leftTrackModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box734
		leftTrackModel[57].setRotationPoint(51F, -10F, 21.5F);
		leftTrackModel[57].rotateAngleZ = -0.40142573F;

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box735
		leftTrackModel[58].setRotationPoint(51F, -10F, 20.5F);
		leftTrackModel[58].rotateAngleZ = -0.40142573F;

		leftTrackModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box736
		leftTrackModel[59].setRotationPoint(51F, -10F, 17.5F);
		leftTrackModel[59].rotateAngleZ = -0.40142573F;

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box737
		leftTrackModel[60].setRotationPoint(51F, -10F, 17.5F);
		leftTrackModel[60].rotateAngleZ = -0.40142573F;

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box738
		leftTrackModel[61].setRotationPoint(53.7F, -8.8F, 25.5F);
		leftTrackModel[61].rotateAngleZ = -1.02974426F;

		leftTrackModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box739
		leftTrackModel[62].setRotationPoint(53.7F, -8.8F, 25.5F);
		leftTrackModel[62].rotateAngleZ = -1.02974426F;

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box740
		leftTrackModel[63].setRotationPoint(53.7F, -8.8F, 23.5F);
		leftTrackModel[63].rotateAngleZ = -1.02974426F;

		leftTrackModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box741
		leftTrackModel[64].setRotationPoint(53.7F, -8.8F, 21.5F);
		leftTrackModel[64].rotateAngleZ = -1.02974426F;

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box742
		leftTrackModel[65].setRotationPoint(53.7F, -8.8F, 20.5F);
		leftTrackModel[65].rotateAngleZ = -1.02974426F;

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box743
		leftTrackModel[66].setRotationPoint(53.7F, -8.8F, 17.5F);
		leftTrackModel[66].rotateAngleZ = -1.02974426F;

		leftTrackModel[67].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box744
		leftTrackModel[67].setRotationPoint(53.7F, -8.8F, 17.5F);
		leftTrackModel[67].rotateAngleZ = -1.02974426F;

		leftTrackModel[68].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box745
		leftTrackModel[68].setRotationPoint(53.7F, -8.8F, 16.5F);
		leftTrackModel[68].rotateAngleZ = -1.02974426F;

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box746
		leftTrackModel[69].setRotationPoint(55.25F, -6.25F, 25.5F);
		leftTrackModel[69].rotateAngleZ = -1.57079633F;

		leftTrackModel[70].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box747
		leftTrackModel[70].setRotationPoint(55.25F, -6.25F, 25.5F);
		leftTrackModel[70].rotateAngleZ = -1.57079633F;

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box748
		leftTrackModel[71].setRotationPoint(55.25F, -6.25F, 23.5F);
		leftTrackModel[71].rotateAngleZ = -1.57079633F;

		leftTrackModel[72].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box749
		leftTrackModel[72].setRotationPoint(55.25F, -6.25F, 21.5F);
		leftTrackModel[72].rotateAngleZ = -1.57079633F;

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box750
		leftTrackModel[73].setRotationPoint(55.25F, -6.25F, 20.5F);
		leftTrackModel[73].rotateAngleZ = -1.57079633F;

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box751
		leftTrackModel[74].setRotationPoint(55.25F, -6.25F, 17.5F);
		leftTrackModel[74].rotateAngleZ = -1.57079633F;

		leftTrackModel[75].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box752
		leftTrackModel[75].setRotationPoint(55.25F, -6.25F, 17.5F);
		leftTrackModel[75].rotateAngleZ = -1.57079633F;

		leftTrackModel[76].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box753
		leftTrackModel[76].setRotationPoint(55.25F, -6.25F, 16.5F);
		leftTrackModel[76].rotateAngleZ = -1.57079633F;

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box754
		leftTrackModel[77].setRotationPoint(55.25F, -3.25F, 25.5F);
		leftTrackModel[77].rotateAngleZ = -2.07694181F;

		leftTrackModel[78].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box755
		leftTrackModel[78].setRotationPoint(55.25F, -3.25F, 25.5F);
		leftTrackModel[78].rotateAngleZ = -2.07694181F;

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box756
		leftTrackModel[79].setRotationPoint(55.25F, -3.25F, 23.5F);
		leftTrackModel[79].rotateAngleZ = -2.07694181F;

		leftTrackModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box757
		leftTrackModel[80].setRotationPoint(55.25F, -3.25F, 21.5F);
		leftTrackModel[80].rotateAngleZ = -2.07694181F;

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box758
		leftTrackModel[81].setRotationPoint(55.25F, -3.25F, 20.5F);
		leftTrackModel[81].rotateAngleZ = -2.07694181F;

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box759
		leftTrackModel[82].setRotationPoint(55.25F, -3.25F, 17.5F);
		leftTrackModel[82].rotateAngleZ = -2.07694181F;

		leftTrackModel[83].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box760
		leftTrackModel[83].setRotationPoint(55.25F, -3.25F, 17.5F);
		leftTrackModel[83].rotateAngleZ = -2.07694181F;

		leftTrackModel[84].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box761
		leftTrackModel[84].setRotationPoint(55.25F, -3.25F, 16.5F);
		leftTrackModel[84].rotateAngleZ = -2.07694181F;

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box762
		leftTrackModel[85].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[85].rotateAngleZ = -2.47836754F;

		leftTrackModel[86].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box763
		leftTrackModel[86].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[86].rotateAngleZ = -2.47836754F;

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box764
		leftTrackModel[87].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[87].rotateAngleZ = -2.47836754F;

		leftTrackModel[88].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box765
		leftTrackModel[88].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[88].rotateAngleZ = -2.47836754F;

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box766
		leftTrackModel[89].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[89].rotateAngleZ = -2.47836754F;

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box767
		leftTrackModel[90].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[90].rotateAngleZ = -2.47836754F;

		leftTrackModel[91].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box768
		leftTrackModel[91].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[91].rotateAngleZ = -2.47836754F;

		leftTrackModel[92].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box769
		leftTrackModel[92].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[92].rotateAngleZ = -2.47836754F;

		leftTrackModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box770
		leftTrackModel[93].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[93].rotateAngleZ = -2.47836754F;

		leftTrackModel[94].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box771
		leftTrackModel[94].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[94].rotateAngleZ = -2.47836754F;

		leftTrackModel[95].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box772
		leftTrackModel[95].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[95].rotateAngleZ = -2.47836754F;

		leftTrackModel[96].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box773
		leftTrackModel[96].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[96].rotateAngleZ = -2.47836754F;

		leftTrackModel[97].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box774
		leftTrackModel[97].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[97].rotateAngleZ = -2.47836754F;

		leftTrackModel[98].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box775
		leftTrackModel[98].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[98].rotateAngleZ = -2.47836754F;

		leftTrackModel[99].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box776
		leftTrackModel[99].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[99].rotateAngleZ = -2.47836754F;

		leftTrackModel[100].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box777
		leftTrackModel[100].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[100].rotateAngleZ = -2.47836754F;

		leftTrackModel[101].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box778
		leftTrackModel[101].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[101].rotateAngleZ = -2.47836754F;

		leftTrackModel[102].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box779
		leftTrackModel[102].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[102].rotateAngleZ = -2.47836754F;

		leftTrackModel[103].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box780
		leftTrackModel[103].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[103].rotateAngleZ = -2.47836754F;

		leftTrackModel[104].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box781
		leftTrackModel[104].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[104].rotateAngleZ = -2.47836754F;

		leftTrackModel[105].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box782
		leftTrackModel[105].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[105].rotateAngleZ = -2.47836754F;

		leftTrackModel[106].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box783
		leftTrackModel[106].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[106].rotateAngleZ = -2.47836754F;

		leftTrackModel[107].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box784
		leftTrackModel[107].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[107].rotateAngleZ = -2.47836754F;

		leftTrackModel[108].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box785
		leftTrackModel[108].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[108].rotateAngleZ = -2.47836754F;

		leftTrackModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box786
		leftTrackModel[109].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[109].rotateAngleZ = -2.47836754F;

		leftTrackModel[110].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box787
		leftTrackModel[110].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[110].rotateAngleZ = -2.47836754F;

		leftTrackModel[111].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box788
		leftTrackModel[111].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[111].rotateAngleZ = -2.47836754F;

		leftTrackModel[112].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box789
		leftTrackModel[112].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[112].rotateAngleZ = -2.47836754F;

		leftTrackModel[113].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box790
		leftTrackModel[113].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[113].rotateAngleZ = -2.47836754F;

		leftTrackModel[114].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box791
		leftTrackModel[114].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[114].rotateAngleZ = -2.47836754F;

		leftTrackModel[115].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box792
		leftTrackModel[115].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[115].rotateAngleZ = -2.47836754F;

		leftTrackModel[116].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box793
		leftTrackModel[116].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[116].rotateAngleZ = -2.47836754F;

		leftTrackModel[117].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box794
		leftTrackModel[117].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[117].rotateAngleZ = -2.47836754F;

		leftTrackModel[118].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box795
		leftTrackModel[118].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[118].rotateAngleZ = -2.47836754F;

		leftTrackModel[119].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box796
		leftTrackModel[119].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[119].rotateAngleZ = -2.47836754F;

		leftTrackModel[120].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box797
		leftTrackModel[120].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[120].rotateAngleZ = -2.47836754F;

		leftTrackModel[121].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box798
		leftTrackModel[121].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[121].rotateAngleZ = -2.47836754F;

		leftTrackModel[122].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box799
		leftTrackModel[122].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[122].rotateAngleZ = -2.47836754F;

		leftTrackModel[123].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box800
		leftTrackModel[123].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[123].rotateAngleZ = -2.47836754F;

		leftTrackModel[124].addShapeBox(14F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box801
		leftTrackModel[124].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[124].rotateAngleZ = -2.47836754F;

		leftTrackModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box802
		leftTrackModel[125].setRotationPoint(43.5F, 8.8F, 25.5F);
		leftTrackModel[125].rotateAngleZ = -3.08923278F;

		leftTrackModel[126].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box803
		leftTrackModel[126].setRotationPoint(43.5F, 8.8F, 25.5F);
		leftTrackModel[126].rotateAngleZ = -3.08923278F;

		leftTrackModel[127].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box804
		leftTrackModel[127].setRotationPoint(43.5F, 8.8F, 23.5F);
		leftTrackModel[127].rotateAngleZ = -3.08923278F;

		leftTrackModel[128].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box805
		leftTrackModel[128].setRotationPoint(43.5F, 8.8F, 21.5F);
		leftTrackModel[128].rotateAngleZ = -3.08923278F;

		leftTrackModel[129].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box806
		leftTrackModel[129].setRotationPoint(43.5F, 8.8F, 20.5F);
		leftTrackModel[129].rotateAngleZ = -3.08923278F;

		leftTrackModel[130].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box807
		leftTrackModel[130].setRotationPoint(43.5F, 8.8F, 17.5F);
		leftTrackModel[130].rotateAngleZ = -3.08923278F;

		leftTrackModel[131].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box808
		leftTrackModel[131].setRotationPoint(43.5F, 8.8F, 17.5F);
		leftTrackModel[131].rotateAngleZ = -3.08923278F;

		leftTrackModel[132].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box809
		leftTrackModel[132].setRotationPoint(43.5F, 8.8F, 16.5F);
		leftTrackModel[132].rotateAngleZ = -3.08923278F;

		leftTrackModel[133].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box810
		leftTrackModel[133].setRotationPoint(40.5F, 9F, 25.5F);
		leftTrackModel[133].rotateAngleZ = -3.14159265F;

		leftTrackModel[134].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box811
		leftTrackModel[134].setRotationPoint(40.5F, 9F, 25.5F);
		leftTrackModel[134].rotateAngleZ = -3.14159265F;

		leftTrackModel[135].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box812
		leftTrackModel[135].setRotationPoint(40.5F, 9F, 23.5F);
		leftTrackModel[135].rotateAngleZ = -3.14159265F;

		leftTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box813
		leftTrackModel[136].setRotationPoint(40.5F, 9F, 21.5F);
		leftTrackModel[136].rotateAngleZ = -3.14159265F;

		leftTrackModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box814
		leftTrackModel[137].setRotationPoint(40.5F, 9F, 20.5F);
		leftTrackModel[137].rotateAngleZ = -3.14159265F;

		leftTrackModel[138].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box815
		leftTrackModel[138].setRotationPoint(40.5F, 9F, 17.5F);
		leftTrackModel[138].rotateAngleZ = -3.14159265F;

		leftTrackModel[139].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box816
		leftTrackModel[139].setRotationPoint(40.5F, 9F, 17.5F);
		leftTrackModel[139].rotateAngleZ = -3.14159265F;

		leftTrackModel[140].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box817
		leftTrackModel[140].setRotationPoint(40.5F, 9F, 16.5F);
		leftTrackModel[140].rotateAngleZ = -3.14159265F;

		leftTrackModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box818
		leftTrackModel[141].setRotationPoint(37.5F, 9F, 25.5F);
		leftTrackModel[141].rotateAngleZ = -3.14159265F;

		leftTrackModel[142].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box819
		leftTrackModel[142].setRotationPoint(37.5F, 9F, 25.5F);
		leftTrackModel[142].rotateAngleZ = -3.14159265F;

		leftTrackModel[143].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box820
		leftTrackModel[143].setRotationPoint(37.5F, 9F, 23.5F);
		leftTrackModel[143].rotateAngleZ = -3.14159265F;

		leftTrackModel[144].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box821
		leftTrackModel[144].setRotationPoint(37.5F, 9F, 21.5F);
		leftTrackModel[144].rotateAngleZ = -3.14159265F;

		leftTrackModel[145].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box822
		leftTrackModel[145].setRotationPoint(37.5F, 9F, 20.5F);
		leftTrackModel[145].rotateAngleZ = -3.14159265F;

		leftTrackModel[146].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box823
		leftTrackModel[146].setRotationPoint(37.5F, 9F, 17.5F);
		leftTrackModel[146].rotateAngleZ = -3.14159265F;

		leftTrackModel[147].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box824
		leftTrackModel[147].setRotationPoint(37.5F, 9F, 17.5F);
		leftTrackModel[147].rotateAngleZ = -3.14159265F;

		leftTrackModel[148].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box825
		leftTrackModel[148].setRotationPoint(37.5F, 9F, 16.5F);
		leftTrackModel[148].rotateAngleZ = -3.14159265F;

		leftTrackModel[149].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box826
		leftTrackModel[149].setRotationPoint(34.5F, 9F, 25.5F);
		leftTrackModel[149].rotateAngleZ = -3.14159265F;

		leftTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box827
		leftTrackModel[150].setRotationPoint(34.5F, 9F, 25.5F);
		leftTrackModel[150].rotateAngleZ = -3.14159265F;

		leftTrackModel[151].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box828
		leftTrackModel[151].setRotationPoint(34.5F, 9F, 23.5F);
		leftTrackModel[151].rotateAngleZ = -3.14159265F;

		leftTrackModel[152].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box829
		leftTrackModel[152].setRotationPoint(34.5F, 9F, 21.5F);
		leftTrackModel[152].rotateAngleZ = -3.14159265F;

		leftTrackModel[153].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box830
		leftTrackModel[153].setRotationPoint(34.5F, 9F, 20.5F);
		leftTrackModel[153].rotateAngleZ = -3.14159265F;

		leftTrackModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box831
		leftTrackModel[154].setRotationPoint(34.5F, 9F, 17.5F);
		leftTrackModel[154].rotateAngleZ = -3.14159265F;

		leftTrackModel[155].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box832
		leftTrackModel[155].setRotationPoint(34.5F, 9F, 17.5F);
		leftTrackModel[155].rotateAngleZ = -3.14159265F;

		leftTrackModel[156].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box833
		leftTrackModel[156].setRotationPoint(34.5F, 9F, 16.5F);
		leftTrackModel[156].rotateAngleZ = -3.14159265F;

		leftTrackModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box834
		leftTrackModel[157].setRotationPoint(31.5F, 9F, 25.5F);
		leftTrackModel[157].rotateAngleZ = -3.14159265F;

		leftTrackModel[158].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box835
		leftTrackModel[158].setRotationPoint(31.5F, 9F, 25.5F);
		leftTrackModel[158].rotateAngleZ = -3.14159265F;

		leftTrackModel[159].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box836
		leftTrackModel[159].setRotationPoint(31.5F, 9F, 23.5F);
		leftTrackModel[159].rotateAngleZ = -3.14159265F;

		leftTrackModel[160].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box837
		leftTrackModel[160].setRotationPoint(31.5F, 9F, 21.5F);
		leftTrackModel[160].rotateAngleZ = -3.14159265F;

		leftTrackModel[161].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box838
		leftTrackModel[161].setRotationPoint(31.5F, 9F, 20.5F);
		leftTrackModel[161].rotateAngleZ = -3.14159265F;

		leftTrackModel[162].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box839
		leftTrackModel[162].setRotationPoint(31.5F, 9F, 17.5F);
		leftTrackModel[162].rotateAngleZ = -3.14159265F;

		leftTrackModel[163].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box840
		leftTrackModel[163].setRotationPoint(31.5F, 9F, 17.5F);
		leftTrackModel[163].rotateAngleZ = -3.14159265F;

		leftTrackModel[164].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box841
		leftTrackModel[164].setRotationPoint(31.5F, 9F, 16.5F);
		leftTrackModel[164].rotateAngleZ = -3.14159265F;

		leftTrackModel[165].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box842
		leftTrackModel[165].setRotationPoint(28.5F, 9F, 25.5F);
		leftTrackModel[165].rotateAngleZ = -3.14159265F;

		leftTrackModel[166].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box843
		leftTrackModel[166].setRotationPoint(28.5F, 9F, 25.5F);
		leftTrackModel[166].rotateAngleZ = -3.14159265F;

		leftTrackModel[167].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box844
		leftTrackModel[167].setRotationPoint(28.5F, 9F, 23.5F);
		leftTrackModel[167].rotateAngleZ = -3.14159265F;

		leftTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box845
		leftTrackModel[168].setRotationPoint(28.5F, 9F, 21.5F);
		leftTrackModel[168].rotateAngleZ = -3.14159265F;

		leftTrackModel[169].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box846
		leftTrackModel[169].setRotationPoint(28.5F, 9F, 20.5F);
		leftTrackModel[169].rotateAngleZ = -3.14159265F;

		leftTrackModel[170].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box847
		leftTrackModel[170].setRotationPoint(28.5F, 9F, 17.5F);
		leftTrackModel[170].rotateAngleZ = -3.14159265F;

		leftTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box848
		leftTrackModel[171].setRotationPoint(28.5F, 9F, 17.5F);
		leftTrackModel[171].rotateAngleZ = -3.14159265F;

		leftTrackModel[172].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box849
		leftTrackModel[172].setRotationPoint(28.5F, 9F, 16.5F);
		leftTrackModel[172].rotateAngleZ = -3.14159265F;

		leftTrackModel[173].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box850
		leftTrackModel[173].setRotationPoint(25.5F, 9F, 25.5F);
		leftTrackModel[173].rotateAngleZ = -3.14159265F;

		leftTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box851
		leftTrackModel[174].setRotationPoint(25.5F, 9F, 25.5F);
		leftTrackModel[174].rotateAngleZ = -3.14159265F;

		leftTrackModel[175].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box852
		leftTrackModel[175].setRotationPoint(25.5F, 9F, 23.5F);
		leftTrackModel[175].rotateAngleZ = -3.14159265F;

		leftTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box853
		leftTrackModel[176].setRotationPoint(25.5F, 9F, 21.5F);
		leftTrackModel[176].rotateAngleZ = -3.14159265F;

		leftTrackModel[177].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box854
		leftTrackModel[177].setRotationPoint(25.5F, 9F, 20.5F);
		leftTrackModel[177].rotateAngleZ = -3.14159265F;

		leftTrackModel[178].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box855
		leftTrackModel[178].setRotationPoint(25.5F, 9F, 17.5F);
		leftTrackModel[178].rotateAngleZ = -3.14159265F;

		leftTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box856
		leftTrackModel[179].setRotationPoint(25.5F, 9F, 17.5F);
		leftTrackModel[179].rotateAngleZ = -3.14159265F;

		leftTrackModel[180].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box857
		leftTrackModel[180].setRotationPoint(25.5F, 9F, 16.5F);
		leftTrackModel[180].rotateAngleZ = -3.14159265F;

		leftTrackModel[181].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box858
		leftTrackModel[181].setRotationPoint(22.5F, 9F, 25.5F);
		leftTrackModel[181].rotateAngleZ = -3.14159265F;

		leftTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box859
		leftTrackModel[182].setRotationPoint(22.5F, 9F, 25.5F);
		leftTrackModel[182].rotateAngleZ = -3.14159265F;

		leftTrackModel[183].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box860
		leftTrackModel[183].setRotationPoint(22.5F, 9F, 23.5F);
		leftTrackModel[183].rotateAngleZ = -3.14159265F;

		leftTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box861
		leftTrackModel[184].setRotationPoint(22.5F, 9F, 21.5F);
		leftTrackModel[184].rotateAngleZ = -3.14159265F;

		leftTrackModel[185].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box862
		leftTrackModel[185].setRotationPoint(22.5F, 9F, 20.5F);
		leftTrackModel[185].rotateAngleZ = -3.14159265F;

		leftTrackModel[186].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box863
		leftTrackModel[186].setRotationPoint(22.5F, 9F, 17.5F);
		leftTrackModel[186].rotateAngleZ = -3.14159265F;

		leftTrackModel[187].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box864
		leftTrackModel[187].setRotationPoint(22.5F, 9F, 17.5F);
		leftTrackModel[187].rotateAngleZ = -3.14159265F;

		leftTrackModel[188].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box865
		leftTrackModel[188].setRotationPoint(22.5F, 9F, 16.5F);
		leftTrackModel[188].rotateAngleZ = -3.14159265F;

		leftTrackModel[189].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box866
		leftTrackModel[189].setRotationPoint(19.5F, 9F, 25.5F);
		leftTrackModel[189].rotateAngleZ = -3.14159265F;

		leftTrackModel[190].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box867
		leftTrackModel[190].setRotationPoint(19.5F, 9F, 25.5F);
		leftTrackModel[190].rotateAngleZ = -3.14159265F;

		leftTrackModel[191].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box868
		leftTrackModel[191].setRotationPoint(19.5F, 9F, 23.5F);
		leftTrackModel[191].rotateAngleZ = -3.14159265F;

		leftTrackModel[192].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box869
		leftTrackModel[192].setRotationPoint(19.5F, 9F, 21.5F);
		leftTrackModel[192].rotateAngleZ = -3.14159265F;

		leftTrackModel[193].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box870
		leftTrackModel[193].setRotationPoint(19.5F, 9F, 20.5F);
		leftTrackModel[193].rotateAngleZ = -3.14159265F;

		leftTrackModel[194].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box871
		leftTrackModel[194].setRotationPoint(19.5F, 9F, 17.5F);
		leftTrackModel[194].rotateAngleZ = -3.14159265F;

		leftTrackModel[195].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box872
		leftTrackModel[195].setRotationPoint(19.5F, 9F, 17.5F);
		leftTrackModel[195].rotateAngleZ = -3.14159265F;

		leftTrackModel[196].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box873
		leftTrackModel[196].setRotationPoint(19.5F, 9F, 16.5F);
		leftTrackModel[196].rotateAngleZ = -3.14159265F;

		leftTrackModel[197].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box874
		leftTrackModel[197].setRotationPoint(16.5F, 9F, 25.5F);
		leftTrackModel[197].rotateAngleZ = -3.14159265F;

		leftTrackModel[198].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box875
		leftTrackModel[198].setRotationPoint(16.5F, 9F, 25.5F);
		leftTrackModel[198].rotateAngleZ = -3.14159265F;

		leftTrackModel[199].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box876
		leftTrackModel[199].setRotationPoint(16.5F, 9F, 23.5F);
		leftTrackModel[199].rotateAngleZ = -3.14159265F;

		leftTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box877
		leftTrackModel[200].setRotationPoint(16.5F, 9F, 21.5F);
		leftTrackModel[200].rotateAngleZ = -3.14159265F;

		leftTrackModel[201].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box878
		leftTrackModel[201].setRotationPoint(16.5F, 9F, 20.5F);
		leftTrackModel[201].rotateAngleZ = -3.14159265F;

		leftTrackModel[202].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box879
		leftTrackModel[202].setRotationPoint(16.5F, 9F, 17.5F);
		leftTrackModel[202].rotateAngleZ = -3.14159265F;

		leftTrackModel[203].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box880
		leftTrackModel[203].setRotationPoint(16.5F, 9F, 17.5F);
		leftTrackModel[203].rotateAngleZ = -3.14159265F;

		leftTrackModel[204].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box881
		leftTrackModel[204].setRotationPoint(16.5F, 9F, 16.5F);
		leftTrackModel[204].rotateAngleZ = -3.14159265F;

		leftTrackModel[205].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box882
		leftTrackModel[205].setRotationPoint(13.5F, 9F, 25.5F);
		leftTrackModel[205].rotateAngleZ = -3.14159265F;

		leftTrackModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box883
		leftTrackModel[206].setRotationPoint(13.5F, 9F, 25.5F);
		leftTrackModel[206].rotateAngleZ = -3.14159265F;

		leftTrackModel[207].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box884
		leftTrackModel[207].setRotationPoint(13.5F, 9F, 23.5F);
		leftTrackModel[207].rotateAngleZ = -3.14159265F;

		leftTrackModel[208].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box885
		leftTrackModel[208].setRotationPoint(13.5F, 9F, 21.5F);
		leftTrackModel[208].rotateAngleZ = -3.14159265F;

		leftTrackModel[209].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box886
		leftTrackModel[209].setRotationPoint(13.5F, 9F, 20.5F);
		leftTrackModel[209].rotateAngleZ = -3.14159265F;

		leftTrackModel[210].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box887
		leftTrackModel[210].setRotationPoint(13.5F, 9F, 17.5F);
		leftTrackModel[210].rotateAngleZ = -3.14159265F;

		leftTrackModel[211].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box888
		leftTrackModel[211].setRotationPoint(13.5F, 9F, 17.5F);
		leftTrackModel[211].rotateAngleZ = -3.14159265F;

		leftTrackModel[212].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box889
		leftTrackModel[212].setRotationPoint(13.5F, 9F, 16.5F);
		leftTrackModel[212].rotateAngleZ = -3.14159265F;

		leftTrackModel[213].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box890
		leftTrackModel[213].setRotationPoint(10.5F, 9F, 25.5F);
		leftTrackModel[213].rotateAngleZ = -3.14159265F;

		leftTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box891
		leftTrackModel[214].setRotationPoint(10.5F, 9F, 25.5F);
		leftTrackModel[214].rotateAngleZ = -3.14159265F;

		leftTrackModel[215].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box892
		leftTrackModel[215].setRotationPoint(10.5F, 9F, 23.5F);
		leftTrackModel[215].rotateAngleZ = -3.14159265F;

		leftTrackModel[216].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box893
		leftTrackModel[216].setRotationPoint(10.5F, 9F, 21.5F);
		leftTrackModel[216].rotateAngleZ = -3.14159265F;

		leftTrackModel[217].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box894
		leftTrackModel[217].setRotationPoint(10.5F, 9F, 20.5F);
		leftTrackModel[217].rotateAngleZ = -3.14159265F;

		leftTrackModel[218].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box895
		leftTrackModel[218].setRotationPoint(10.5F, 9F, 17.5F);
		leftTrackModel[218].rotateAngleZ = -3.14159265F;

		leftTrackModel[219].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box896
		leftTrackModel[219].setRotationPoint(10.5F, 9F, 17.5F);
		leftTrackModel[219].rotateAngleZ = -3.14159265F;

		leftTrackModel[220].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box897
		leftTrackModel[220].setRotationPoint(10.5F, 9F, 16.5F);
		leftTrackModel[220].rotateAngleZ = -3.14159265F;

		leftTrackModel[221].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box898
		leftTrackModel[221].setRotationPoint(7.5F, 9F, 25.5F);
		leftTrackModel[221].rotateAngleZ = -3.14159265F;

		leftTrackModel[222].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box899
		leftTrackModel[222].setRotationPoint(7.5F, 9F, 25.5F);
		leftTrackModel[222].rotateAngleZ = -3.14159265F;

		leftTrackModel[223].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box900
		leftTrackModel[223].setRotationPoint(7.5F, 9F, 23.5F);
		leftTrackModel[223].rotateAngleZ = -3.14159265F;

		leftTrackModel[224].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box901
		leftTrackModel[224].setRotationPoint(7.5F, 9F, 21.5F);
		leftTrackModel[224].rotateAngleZ = -3.14159265F;

		leftTrackModel[225].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box902
		leftTrackModel[225].setRotationPoint(7.5F, 9F, 20.5F);
		leftTrackModel[225].rotateAngleZ = -3.14159265F;

		leftTrackModel[226].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box903
		leftTrackModel[226].setRotationPoint(7.5F, 9F, 17.5F);
		leftTrackModel[226].rotateAngleZ = -3.14159265F;

		leftTrackModel[227].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box904
		leftTrackModel[227].setRotationPoint(7.5F, 9F, 17.5F);
		leftTrackModel[227].rotateAngleZ = -3.14159265F;

		leftTrackModel[228].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box905
		leftTrackModel[228].setRotationPoint(7.5F, 9F, 16.5F);
		leftTrackModel[228].rotateAngleZ = -3.14159265F;

		leftTrackModel[229].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box906
		leftTrackModel[229].setRotationPoint(4.5F, 9F, 25.5F);
		leftTrackModel[229].rotateAngleZ = -3.14159265F;

		leftTrackModel[230].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box907
		leftTrackModel[230].setRotationPoint(4.5F, 9F, 25.5F);
		leftTrackModel[230].rotateAngleZ = -3.14159265F;

		leftTrackModel[231].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box908
		leftTrackModel[231].setRotationPoint(4.5F, 9F, 23.5F);
		leftTrackModel[231].rotateAngleZ = -3.14159265F;

		leftTrackModel[232].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box909
		leftTrackModel[232].setRotationPoint(4.5F, 9F, 21.5F);
		leftTrackModel[232].rotateAngleZ = -3.14159265F;

		leftTrackModel[233].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box910
		leftTrackModel[233].setRotationPoint(4.5F, 9F, 20.5F);
		leftTrackModel[233].rotateAngleZ = -3.14159265F;

		leftTrackModel[234].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box911
		leftTrackModel[234].setRotationPoint(4.5F, 9F, 17.5F);
		leftTrackModel[234].rotateAngleZ = -3.14159265F;

		leftTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box912
		leftTrackModel[235].setRotationPoint(4.5F, 9F, 17.5F);
		leftTrackModel[235].rotateAngleZ = -3.14159265F;

		leftTrackModel[236].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box913
		leftTrackModel[236].setRotationPoint(4.5F, 9F, 16.5F);
		leftTrackModel[236].rotateAngleZ = -3.14159265F;

		leftTrackModel[237].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box914
		leftTrackModel[237].setRotationPoint(1.5F, 9F, 25.5F);
		leftTrackModel[237].rotateAngleZ = -3.14159265F;

		leftTrackModel[238].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box915
		leftTrackModel[238].setRotationPoint(1.5F, 9F, 25.5F);
		leftTrackModel[238].rotateAngleZ = -3.14159265F;

		leftTrackModel[239].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box916
		leftTrackModel[239].setRotationPoint(1.5F, 9F, 23.5F);
		leftTrackModel[239].rotateAngleZ = -3.14159265F;

		leftTrackModel[240].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box917
		leftTrackModel[240].setRotationPoint(1.5F, 9F, 21.5F);
		leftTrackModel[240].rotateAngleZ = -3.14159265F;

		leftTrackModel[241].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box918
		leftTrackModel[241].setRotationPoint(1.5F, 9F, 20.5F);
		leftTrackModel[241].rotateAngleZ = -3.14159265F;

		leftTrackModel[242].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box919
		leftTrackModel[242].setRotationPoint(1.5F, 9F, 17.5F);
		leftTrackModel[242].rotateAngleZ = -3.14159265F;

		leftTrackModel[243].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box920
		leftTrackModel[243].setRotationPoint(1.5F, 9F, 17.5F);
		leftTrackModel[243].rotateAngleZ = -3.14159265F;

		leftTrackModel[244].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box921
		leftTrackModel[244].setRotationPoint(1.5F, 9F, 16.5F);
		leftTrackModel[244].rotateAngleZ = -3.14159265F;

		leftTrackModel[245].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box922
		leftTrackModel[245].setRotationPoint(-1.5F, 9F, 25.5F);
		leftTrackModel[245].rotateAngleZ = -3.14159265F;

		leftTrackModel[246].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box923
		leftTrackModel[246].setRotationPoint(-1.5F, 9F, 25.5F);
		leftTrackModel[246].rotateAngleZ = -3.14159265F;

		leftTrackModel[247].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box924
		leftTrackModel[247].setRotationPoint(-1.5F, 9F, 23.5F);
		leftTrackModel[247].rotateAngleZ = -3.14159265F;

		leftTrackModel[248].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box925
		leftTrackModel[248].setRotationPoint(-1.5F, 9F, 21.5F);
		leftTrackModel[248].rotateAngleZ = -3.14159265F;

		leftTrackModel[249].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box926
		leftTrackModel[249].setRotationPoint(-1.5F, 9F, 20.5F);
		leftTrackModel[249].rotateAngleZ = -3.14159265F;

		leftTrackModel[250].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box927
		leftTrackModel[250].setRotationPoint(-1.5F, 9F, 17.5F);
		leftTrackModel[250].rotateAngleZ = -3.14159265F;

		leftTrackModel[251].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box928
		leftTrackModel[251].setRotationPoint(-1.5F, 9F, 17.5F);
		leftTrackModel[251].rotateAngleZ = -3.14159265F;

		leftTrackModel[252].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box929
		leftTrackModel[252].setRotationPoint(-1.5F, 9F, 16.5F);
		leftTrackModel[252].rotateAngleZ = -3.14159265F;

		leftTrackModel[253].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box930
		leftTrackModel[253].setRotationPoint(-4.5F, 9F, 25.5F);
		leftTrackModel[253].rotateAngleZ = -3.14159265F;

		leftTrackModel[254].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box931
		leftTrackModel[254].setRotationPoint(-4.5F, 9F, 25.5F);
		leftTrackModel[254].rotateAngleZ = -3.14159265F;

		leftTrackModel[255].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box932
		leftTrackModel[255].setRotationPoint(-4.5F, 9F, 23.5F);
		leftTrackModel[255].rotateAngleZ = -3.14159265F;

		leftTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box933
		leftTrackModel[256].setRotationPoint(-4.5F, 9F, 21.5F);
		leftTrackModel[256].rotateAngleZ = -3.14159265F;

		leftTrackModel[257].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box934
		leftTrackModel[257].setRotationPoint(-4.5F, 9F, 20.5F);
		leftTrackModel[257].rotateAngleZ = -3.14159265F;

		leftTrackModel[258].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box935
		leftTrackModel[258].setRotationPoint(-4.5F, 9F, 17.5F);
		leftTrackModel[258].rotateAngleZ = -3.14159265F;

		leftTrackModel[259].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box936
		leftTrackModel[259].setRotationPoint(-4.5F, 9F, 17.5F);
		leftTrackModel[259].rotateAngleZ = -3.14159265F;

		leftTrackModel[260].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box937
		leftTrackModel[260].setRotationPoint(-4.5F, 9F, 16.5F);
		leftTrackModel[260].rotateAngleZ = -3.14159265F;

		leftTrackModel[261].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box938
		leftTrackModel[261].setRotationPoint(-7.5F, 9F, 25.5F);
		leftTrackModel[261].rotateAngleZ = -3.14159265F;

		leftTrackModel[262].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box939
		leftTrackModel[262].setRotationPoint(-7.5F, 9F, 25.5F);
		leftTrackModel[262].rotateAngleZ = -3.14159265F;

		leftTrackModel[263].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box940
		leftTrackModel[263].setRotationPoint(-7.5F, 9F, 23.5F);
		leftTrackModel[263].rotateAngleZ = -3.14159265F;

		leftTrackModel[264].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box941
		leftTrackModel[264].setRotationPoint(-7.5F, 9F, 21.5F);
		leftTrackModel[264].rotateAngleZ = -3.14159265F;

		leftTrackModel[265].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box942
		leftTrackModel[265].setRotationPoint(-7.5F, 9F, 20.5F);
		leftTrackModel[265].rotateAngleZ = -3.14159265F;

		leftTrackModel[266].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box943
		leftTrackModel[266].setRotationPoint(-7.5F, 9F, 17.5F);
		leftTrackModel[266].rotateAngleZ = -3.14159265F;

		leftTrackModel[267].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box944
		leftTrackModel[267].setRotationPoint(-7.5F, 9F, 17.5F);
		leftTrackModel[267].rotateAngleZ = -3.14159265F;

		leftTrackModel[268].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box945
		leftTrackModel[268].setRotationPoint(-7.5F, 9F, 16.5F);
		leftTrackModel[268].rotateAngleZ = -3.14159265F;

		leftTrackModel[269].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box946
		leftTrackModel[269].setRotationPoint(-10.5F, 9F, 25.5F);
		leftTrackModel[269].rotateAngleZ = -3.14159265F;

		leftTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box947
		leftTrackModel[270].setRotationPoint(-10.5F, 9F, 25.5F);
		leftTrackModel[270].rotateAngleZ = -3.14159265F;

		leftTrackModel[271].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box948
		leftTrackModel[271].setRotationPoint(-10.5F, 9F, 23.5F);
		leftTrackModel[271].rotateAngleZ = -3.14159265F;

		leftTrackModel[272].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box949
		leftTrackModel[272].setRotationPoint(-10.5F, 9F, 21.5F);
		leftTrackModel[272].rotateAngleZ = -3.14159265F;

		leftTrackModel[273].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box950
		leftTrackModel[273].setRotationPoint(-10.5F, 9F, 20.5F);
		leftTrackModel[273].rotateAngleZ = -3.14159265F;

		leftTrackModel[274].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box951
		leftTrackModel[274].setRotationPoint(-10.5F, 9F, 17.5F);
		leftTrackModel[274].rotateAngleZ = -3.14159265F;

		leftTrackModel[275].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box952
		leftTrackModel[275].setRotationPoint(-10.5F, 9F, 17.5F);
		leftTrackModel[275].rotateAngleZ = -3.14159265F;

		leftTrackModel[276].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box953
		leftTrackModel[276].setRotationPoint(-10.5F, 9F, 16.5F);
		leftTrackModel[276].rotateAngleZ = -3.14159265F;

		leftTrackModel[277].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box954
		leftTrackModel[277].setRotationPoint(-13.5F, 9F, 25.5F);
		leftTrackModel[277].rotateAngleZ = -3.14159265F;

		leftTrackModel[278].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box955
		leftTrackModel[278].setRotationPoint(-13.5F, 9F, 25.5F);
		leftTrackModel[278].rotateAngleZ = -3.14159265F;

		leftTrackModel[279].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box956
		leftTrackModel[279].setRotationPoint(-13.5F, 9F, 23.5F);
		leftTrackModel[279].rotateAngleZ = -3.14159265F;

		leftTrackModel[280].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box957
		leftTrackModel[280].setRotationPoint(-13.5F, 9F, 21.5F);
		leftTrackModel[280].rotateAngleZ = -3.14159265F;

		leftTrackModel[281].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box958
		leftTrackModel[281].setRotationPoint(-13.5F, 9F, 20.5F);
		leftTrackModel[281].rotateAngleZ = -3.14159265F;

		leftTrackModel[282].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box959
		leftTrackModel[282].setRotationPoint(-13.5F, 9F, 17.5F);
		leftTrackModel[282].rotateAngleZ = -3.14159265F;

		leftTrackModel[283].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box960
		leftTrackModel[283].setRotationPoint(-13.5F, 9F, 17.5F);
		leftTrackModel[283].rotateAngleZ = -3.14159265F;

		leftTrackModel[284].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box961
		leftTrackModel[284].setRotationPoint(-13.5F, 9F, 16.5F);
		leftTrackModel[284].rotateAngleZ = -3.14159265F;

		leftTrackModel[285].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box962
		leftTrackModel[285].setRotationPoint(-16.5F, 9F, 25.5F);
		leftTrackModel[285].rotateAngleZ = -3.14159265F;

		leftTrackModel[286].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box963
		leftTrackModel[286].setRotationPoint(-16.5F, 9F, 25.5F);
		leftTrackModel[286].rotateAngleZ = -3.14159265F;

		leftTrackModel[287].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box964
		leftTrackModel[287].setRotationPoint(-16.5F, 9F, 23.5F);
		leftTrackModel[287].rotateAngleZ = -3.14159265F;

		leftTrackModel[288].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box965
		leftTrackModel[288].setRotationPoint(-16.5F, 9F, 21.5F);
		leftTrackModel[288].rotateAngleZ = -3.14159265F;

		leftTrackModel[289].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box966
		leftTrackModel[289].setRotationPoint(-16.5F, 9F, 20.5F);
		leftTrackModel[289].rotateAngleZ = -3.14159265F;

		leftTrackModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box967
		leftTrackModel[290].setRotationPoint(-16.5F, 9F, 17.5F);
		leftTrackModel[290].rotateAngleZ = -3.14159265F;

		leftTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box968
		leftTrackModel[291].setRotationPoint(-16.5F, 9F, 17.5F);
		leftTrackModel[291].rotateAngleZ = -3.14159265F;

		leftTrackModel[292].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box969
		leftTrackModel[292].setRotationPoint(-16.5F, 9F, 16.5F);
		leftTrackModel[292].rotateAngleZ = -3.14159265F;

		leftTrackModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box970
		leftTrackModel[293].setRotationPoint(-19.5F, 9F, 25.5F);
		leftTrackModel[293].rotateAngleZ = -3.14159265F;

		leftTrackModel[294].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box971
		leftTrackModel[294].setRotationPoint(-19.5F, 9F, 25.5F);
		leftTrackModel[294].rotateAngleZ = -3.14159265F;

		leftTrackModel[295].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box972
		leftTrackModel[295].setRotationPoint(-19.5F, 9F, 23.5F);
		leftTrackModel[295].rotateAngleZ = -3.14159265F;

		leftTrackModel[296].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box973
		leftTrackModel[296].setRotationPoint(-19.5F, 9F, 21.5F);
		leftTrackModel[296].rotateAngleZ = -3.14159265F;

		leftTrackModel[297].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box974
		leftTrackModel[297].setRotationPoint(-19.5F, 9F, 20.5F);
		leftTrackModel[297].rotateAngleZ = -3.14159265F;

		leftTrackModel[298].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box975
		leftTrackModel[298].setRotationPoint(-19.5F, 9F, 17.5F);
		leftTrackModel[298].rotateAngleZ = -3.14159265F;

		leftTrackModel[299].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box976
		leftTrackModel[299].setRotationPoint(-19.5F, 9F, 17.5F);
		leftTrackModel[299].rotateAngleZ = -3.14159265F;

		leftTrackModel[300].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box977
		leftTrackModel[300].setRotationPoint(-19.5F, 9F, 16.5F);
		leftTrackModel[300].rotateAngleZ = -3.14159265F;

		leftTrackModel[301].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box978
		leftTrackModel[301].setRotationPoint(-22.5F, 9F, 25.5F);
		leftTrackModel[301].rotateAngleZ = -3.14159265F;

		leftTrackModel[302].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box979
		leftTrackModel[302].setRotationPoint(-22.5F, 9F, 25.5F);
		leftTrackModel[302].rotateAngleZ = -3.14159265F;

		leftTrackModel[303].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box980
		leftTrackModel[303].setRotationPoint(-22.5F, 9F, 23.5F);
		leftTrackModel[303].rotateAngleZ = -3.14159265F;

		leftTrackModel[304].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box981
		leftTrackModel[304].setRotationPoint(-22.5F, 9F, 21.5F);
		leftTrackModel[304].rotateAngleZ = -3.14159265F;

		leftTrackModel[305].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box982
		leftTrackModel[305].setRotationPoint(-22.5F, 9F, 20.5F);
		leftTrackModel[305].rotateAngleZ = -3.14159265F;

		leftTrackModel[306].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box983
		leftTrackModel[306].setRotationPoint(-22.5F, 9F, 17.5F);
		leftTrackModel[306].rotateAngleZ = -3.14159265F;

		leftTrackModel[307].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box984
		leftTrackModel[307].setRotationPoint(-22.5F, 9F, 17.5F);
		leftTrackModel[307].rotateAngleZ = -3.14159265F;

		leftTrackModel[308].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box985
		leftTrackModel[308].setRotationPoint(-22.5F, 9F, 16.5F);
		leftTrackModel[308].rotateAngleZ = -3.14159265F;

		leftTrackModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box986
		leftTrackModel[309].setRotationPoint(-26.5F, 9F, 25.5F);
		leftTrackModel[309].rotateAngleZ = -3.14159265F;

		leftTrackModel[310].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box987
		leftTrackModel[310].setRotationPoint(-26.5F, 9F, 25.5F);
		leftTrackModel[310].rotateAngleZ = -3.14159265F;

		leftTrackModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box988
		leftTrackModel[311].setRotationPoint(-26.5F, 9F, 23.5F);
		leftTrackModel[311].rotateAngleZ = -3.14159265F;

		leftTrackModel[312].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box989
		leftTrackModel[312].setRotationPoint(-26.5F, 9F, 21.5F);
		leftTrackModel[312].rotateAngleZ = -3.14159265F;

		leftTrackModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box990
		leftTrackModel[313].setRotationPoint(-26.5F, 9F, 20.5F);
		leftTrackModel[313].rotateAngleZ = -3.14159265F;

		leftTrackModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box991
		leftTrackModel[314].setRotationPoint(-26.5F, 9F, 17.5F);
		leftTrackModel[314].rotateAngleZ = -3.14159265F;

		leftTrackModel[315].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box992
		leftTrackModel[315].setRotationPoint(-26.5F, 9F, 17.5F);
		leftTrackModel[315].rotateAngleZ = -3.14159265F;

		leftTrackModel[316].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box993
		leftTrackModel[316].setRotationPoint(-26.5F, 9F, 16.5F);
		leftTrackModel[316].rotateAngleZ = -3.14159265F;

		leftTrackModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box994
		leftTrackModel[317].setRotationPoint(-29.5F, 9F, 25.5F);
		leftTrackModel[317].rotateAngleZ = -3.14159265F;

		leftTrackModel[318].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box995
		leftTrackModel[318].setRotationPoint(-29.5F, 9F, 25.5F);
		leftTrackModel[318].rotateAngleZ = -3.14159265F;

		leftTrackModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box996
		leftTrackModel[319].setRotationPoint(-29.5F, 9F, 23.5F);
		leftTrackModel[319].rotateAngleZ = -3.14159265F;

		leftTrackModel[320].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box997
		leftTrackModel[320].setRotationPoint(-29.5F, 9F, 21.5F);
		leftTrackModel[320].rotateAngleZ = -3.14159265F;

		leftTrackModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box998
		leftTrackModel[321].setRotationPoint(-29.5F, 9F, 20.5F);
		leftTrackModel[321].rotateAngleZ = -3.14159265F;

		leftTrackModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box999
		leftTrackModel[322].setRotationPoint(-29.5F, 9F, 17.5F);
		leftTrackModel[322].rotateAngleZ = -3.14159265F;

		leftTrackModel[323].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1000
		leftTrackModel[323].setRotationPoint(-29.5F, 9F, 17.5F);
		leftTrackModel[323].rotateAngleZ = -3.14159265F;

		leftTrackModel[324].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1001
		leftTrackModel[324].setRotationPoint(-29.5F, 9F, 16.5F);
		leftTrackModel[324].rotateAngleZ = -3.14159265F;

		leftTrackModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1002
		leftTrackModel[325].setRotationPoint(-32.5F, 9F, 25.5F);
		leftTrackModel[325].rotateAngleZ = -3.14159265F;

		leftTrackModel[326].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1003
		leftTrackModel[326].setRotationPoint(-32.5F, 9F, 25.5F);
		leftTrackModel[326].rotateAngleZ = -3.14159265F;

		leftTrackModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1004
		leftTrackModel[327].setRotationPoint(-32.5F, 9F, 23.5F);
		leftTrackModel[327].rotateAngleZ = -3.14159265F;

		leftTrackModel[328].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1005
		leftTrackModel[328].setRotationPoint(-32.5F, 9F, 21.5F);
		leftTrackModel[328].rotateAngleZ = -3.14159265F;

		leftTrackModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1006
		leftTrackModel[329].setRotationPoint(-32.5F, 9F, 20.5F);
		leftTrackModel[329].rotateAngleZ = -3.14159265F;

		leftTrackModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1007
		leftTrackModel[330].setRotationPoint(-32.5F, 9F, 17.5F);
		leftTrackModel[330].rotateAngleZ = -3.14159265F;

		leftTrackModel[331].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1008
		leftTrackModel[331].setRotationPoint(-32.5F, 9F, 17.5F);
		leftTrackModel[331].rotateAngleZ = -3.14159265F;

		leftTrackModel[332].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1009
		leftTrackModel[332].setRotationPoint(-32.5F, 9F, 16.5F);
		leftTrackModel[332].rotateAngleZ = -3.14159265F;

		leftTrackModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1010
		leftTrackModel[333].setRotationPoint(-35.5F, 9F, 25.5F);
		leftTrackModel[333].rotateAngleZ = -3.14159265F;

		leftTrackModel[334].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1011
		leftTrackModel[334].setRotationPoint(-35.5F, 9F, 25.5F);
		leftTrackModel[334].rotateAngleZ = -3.14159265F;

		leftTrackModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1012
		leftTrackModel[335].setRotationPoint(-35.5F, 9F, 23.5F);
		leftTrackModel[335].rotateAngleZ = -3.14159265F;

		leftTrackModel[336].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1013
		leftTrackModel[336].setRotationPoint(-35.5F, 9F, 21.5F);
		leftTrackModel[336].rotateAngleZ = -3.14159265F;

		leftTrackModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1014
		leftTrackModel[337].setRotationPoint(-35.5F, 9F, 20.5F);
		leftTrackModel[337].rotateAngleZ = -3.14159265F;

		leftTrackModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1015
		leftTrackModel[338].setRotationPoint(-35.5F, 9F, 17.5F);
		leftTrackModel[338].rotateAngleZ = -3.14159265F;

		leftTrackModel[339].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1016
		leftTrackModel[339].setRotationPoint(-35.5F, 9F, 17.5F);
		leftTrackModel[339].rotateAngleZ = -3.14159265F;

		leftTrackModel[340].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1017
		leftTrackModel[340].setRotationPoint(-35.5F, 9F, 16.5F);
		leftTrackModel[340].rotateAngleZ = -3.14159265F;

		leftTrackModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1018
		leftTrackModel[341].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[341].rotateAngleZ = -3.78736448F;

		leftTrackModel[342].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1019
		leftTrackModel[342].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[342].rotateAngleZ = -3.78736448F;

		leftTrackModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1020
		leftTrackModel[343].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[343].rotateAngleZ = -3.78736448F;

		leftTrackModel[344].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1021
		leftTrackModel[344].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[344].rotateAngleZ = -3.78736448F;

		leftTrackModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1022
		leftTrackModel[345].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[345].rotateAngleZ = -3.78736448F;

		leftTrackModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1023
		leftTrackModel[346].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[346].rotateAngleZ = -3.78736448F;

		leftTrackModel[347].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1024
		leftTrackModel[347].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[347].rotateAngleZ = -3.78736448F;

		leftTrackModel[348].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1025
		leftTrackModel[348].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[348].rotateAngleZ = -3.78736448F;

		leftTrackModel[349].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1026
		leftTrackModel[349].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[349].rotateAngleZ = -3.78736448F;

		leftTrackModel[350].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1027
		leftTrackModel[350].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[350].rotateAngleZ = -3.78736448F;

		leftTrackModel[351].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1028
		leftTrackModel[351].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[351].rotateAngleZ = -3.78736448F;

		leftTrackModel[352].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1029
		leftTrackModel[352].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[352].rotateAngleZ = -3.78736448F;

		leftTrackModel[353].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1030
		leftTrackModel[353].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[353].rotateAngleZ = -3.78736448F;

		leftTrackModel[354].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1031
		leftTrackModel[354].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[354].rotateAngleZ = -3.78736448F;

		leftTrackModel[355].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1032
		leftTrackModel[355].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[355].rotateAngleZ = -3.78736448F;

		leftTrackModel[356].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1033
		leftTrackModel[356].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[356].rotateAngleZ = -3.78736448F;

		leftTrackModel[357].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1034
		leftTrackModel[357].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[357].rotateAngleZ = -3.78736448F;

		leftTrackModel[358].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1035
		leftTrackModel[358].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[358].rotateAngleZ = -3.78736448F;

		leftTrackModel[359].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1036
		leftTrackModel[359].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[359].rotateAngleZ = -3.78736448F;

		leftTrackModel[360].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1037
		leftTrackModel[360].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[360].rotateAngleZ = -3.78736448F;

		leftTrackModel[361].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1038
		leftTrackModel[361].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[361].rotateAngleZ = -3.78736448F;

		leftTrackModel[362].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1039
		leftTrackModel[362].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[362].rotateAngleZ = -3.78736448F;

		leftTrackModel[363].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1040
		leftTrackModel[363].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[363].rotateAngleZ = -3.78736448F;

		leftTrackModel[364].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1041
		leftTrackModel[364].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[364].rotateAngleZ = -3.78736448F;

		leftTrackModel[365].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1042
		leftTrackModel[365].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[365].rotateAngleZ = -3.78736448F;

		leftTrackModel[366].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1043
		leftTrackModel[366].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[366].rotateAngleZ = -3.78736448F;

		leftTrackModel[367].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1044
		leftTrackModel[367].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[367].rotateAngleZ = -3.78736448F;

		leftTrackModel[368].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1045
		leftTrackModel[368].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[368].rotateAngleZ = -3.78736448F;

		leftTrackModel[369].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1046
		leftTrackModel[369].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[369].rotateAngleZ = -3.78736448F;

		leftTrackModel[370].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1047
		leftTrackModel[370].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[370].rotateAngleZ = -3.78736448F;

		leftTrackModel[371].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1048
		leftTrackModel[371].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[371].rotateAngleZ = -3.78736448F;

		leftTrackModel[372].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1049
		leftTrackModel[372].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[372].rotateAngleZ = -3.78736448F;

		leftTrackModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1050
		leftTrackModel[373].setRotationPoint(-48F, 1.8F, 25.5F);
		leftTrackModel[373].rotateAngleZ = -4.1887902F;

		leftTrackModel[374].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1051
		leftTrackModel[374].setRotationPoint(-48F, 1.8F, 25.5F);
		leftTrackModel[374].rotateAngleZ = -4.1887902F;

		leftTrackModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1052
		leftTrackModel[375].setRotationPoint(-48F, 1.8F, 23.5F);
		leftTrackModel[375].rotateAngleZ = -4.1887902F;

		leftTrackModel[376].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1053
		leftTrackModel[376].setRotationPoint(-48F, 1.8F, 21.5F);
		leftTrackModel[376].rotateAngleZ = -4.1887902F;

		leftTrackModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1054
		leftTrackModel[377].setRotationPoint(-48F, 1.8F, 20.5F);
		leftTrackModel[377].rotateAngleZ = -4.1887902F;

		leftTrackModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1055
		leftTrackModel[378].setRotationPoint(-48F, 1.8F, 17.5F);
		leftTrackModel[378].rotateAngleZ = -4.1887902F;

		leftTrackModel[379].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1056
		leftTrackModel[379].setRotationPoint(-48F, 1.8F, 17.5F);
		leftTrackModel[379].rotateAngleZ = -4.1887902F;

		leftTrackModel[380].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1057
		leftTrackModel[380].setRotationPoint(-48F, 1.8F, 16.5F);
		leftTrackModel[380].rotateAngleZ = -4.1887902F;

		leftTrackModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1058
		leftTrackModel[381].setRotationPoint(-49.5F, -0.8F, 25.5F);
		leftTrackModel[381].rotateAngleZ = -4.52040276F;

		leftTrackModel[382].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1059
		leftTrackModel[382].setRotationPoint(-49.5F, -0.8F, 25.5F);
		leftTrackModel[382].rotateAngleZ = -4.52040276F;

		leftTrackModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1060
		leftTrackModel[383].setRotationPoint(-49.5F, -0.8F, 23.5F);
		leftTrackModel[383].rotateAngleZ = -4.52040276F;

		leftTrackModel[384].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1061
		leftTrackModel[384].setRotationPoint(-49.5F, -0.8F, 21.5F);
		leftTrackModel[384].rotateAngleZ = -4.52040276F;

		leftTrackModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1062
		leftTrackModel[385].setRotationPoint(-49.5F, -0.8F, 20.5F);
		leftTrackModel[385].rotateAngleZ = -4.52040276F;

		leftTrackModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1063
		leftTrackModel[386].setRotationPoint(-49.5F, -0.8F, 17.5F);
		leftTrackModel[386].rotateAngleZ = -4.52040276F;

		leftTrackModel[387].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1064
		leftTrackModel[387].setRotationPoint(-49.5F, -0.8F, 17.5F);
		leftTrackModel[387].rotateAngleZ = -4.52040276F;

		leftTrackModel[388].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1065
		leftTrackModel[388].setRotationPoint(-49.5F, -0.8F, 16.5F);
		leftTrackModel[388].rotateAngleZ = -4.52040276F;

		leftTrackModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1066
		leftTrackModel[389].setRotationPoint(-50F, -3.6F, 25.5F);
		leftTrackModel[389].rotateAngleZ = -4.71238898F;

		leftTrackModel[390].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1067
		leftTrackModel[390].setRotationPoint(-50F, -3.6F, 25.5F);
		leftTrackModel[390].rotateAngleZ = -4.71238898F;

		leftTrackModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1068
		leftTrackModel[391].setRotationPoint(-50F, -3.6F, 23.5F);
		leftTrackModel[391].rotateAngleZ = -4.71238898F;

		leftTrackModel[392].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1069
		leftTrackModel[392].setRotationPoint(-50F, -3.6F, 21.5F);
		leftTrackModel[392].rotateAngleZ = -4.71238898F;

		leftTrackModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1070
		leftTrackModel[393].setRotationPoint(-50F, -3.6F, 20.5F);
		leftTrackModel[393].rotateAngleZ = -4.71238898F;

		leftTrackModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1071
		leftTrackModel[394].setRotationPoint(-50F, -3.6F, 17.5F);
		leftTrackModel[394].rotateAngleZ = -4.71238898F;

		leftTrackModel[395].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1072
		leftTrackModel[395].setRotationPoint(-50F, -3.6F, 17.5F);
		leftTrackModel[395].rotateAngleZ = -4.71238898F;

		leftTrackModel[396].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1073
		leftTrackModel[396].setRotationPoint(-50F, -3.6F, 16.5F);
		leftTrackModel[396].rotateAngleZ = -4.71238898F;

		leftTrackModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1074
		leftTrackModel[397].setRotationPoint(-50F, -6.6F, 25.5F);
		leftTrackModel[397].rotateAngleZ = -5.21853446F;

		leftTrackModel[398].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1075
		leftTrackModel[398].setRotationPoint(-50F, -6.6F, 25.5F);
		leftTrackModel[398].rotateAngleZ = -5.21853446F;

		leftTrackModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1076
		leftTrackModel[399].setRotationPoint(-50F, -6.6F, 23.5F);
		leftTrackModel[399].rotateAngleZ = -5.21853446F;

		leftTrackModel[400].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1077
		leftTrackModel[400].setRotationPoint(-50F, -6.6F, 21.5F);
		leftTrackModel[400].rotateAngleZ = -5.21853446F;

		leftTrackModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1078
		leftTrackModel[401].setRotationPoint(-50F, -6.6F, 20.5F);
		leftTrackModel[401].rotateAngleZ = -5.21853446F;

		leftTrackModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1079
		leftTrackModel[402].setRotationPoint(-50F, -6.6F, 17.5F);
		leftTrackModel[402].rotateAngleZ = -5.21853446F;

		leftTrackModel[403].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1080
		leftTrackModel[403].setRotationPoint(-50F, -6.6F, 17.5F);
		leftTrackModel[403].rotateAngleZ = -5.21853446F;

		leftTrackModel[404].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1081
		leftTrackModel[404].setRotationPoint(-50F, -6.6F, 16.5F);
		leftTrackModel[404].rotateAngleZ = -5.21853446F;

		leftTrackModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1082
		leftTrackModel[405].setRotationPoint(-48.6F, -9.2F, 25.5F);
		leftTrackModel[405].rotateAngleZ = 0.2443461F;

		leftTrackModel[406].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1083
		leftTrackModel[406].setRotationPoint(-48.6F, -9.2F, 25.5F);
		leftTrackModel[406].rotateAngleZ = 0.2443461F;

		leftTrackModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1084
		leftTrackModel[407].setRotationPoint(-48.6F, -9.2F, 23.5F);
		leftTrackModel[407].rotateAngleZ = 0.2443461F;

		leftTrackModel[408].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1085
		leftTrackModel[408].setRotationPoint(-48.6F, -9.2F, 21.5F);
		leftTrackModel[408].rotateAngleZ = 0.2443461F;

		leftTrackModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1086
		leftTrackModel[409].setRotationPoint(-48.6F, -9.2F, 20.5F);
		leftTrackModel[409].rotateAngleZ = 0.2443461F;

		leftTrackModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1087
		leftTrackModel[410].setRotationPoint(-48.6F, -9.2F, 17.5F);
		leftTrackModel[410].rotateAngleZ = 0.2443461F;

		leftTrackModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1088
		leftTrackModel[411].setRotationPoint(-48.6F, -9.2F, 17.5F);
		leftTrackModel[411].rotateAngleZ = 0.2443461F;

		leftTrackModel[412].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1089
		leftTrackModel[412].setRotationPoint(-48.6F, -9.2F, 16.5F);
		leftTrackModel[412].rotateAngleZ = 0.2443461F;

		leftTrackModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1090
		leftTrackModel[413].setRotationPoint(-46F, -10F, 25.5F);

		leftTrackModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1091
		leftTrackModel[414].setRotationPoint(-46F, -10F, 25.5F);

		leftTrackModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1092
		leftTrackModel[415].setRotationPoint(-46F, -10F, 23.5F);

		leftTrackModel[416].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1093
		leftTrackModel[416].setRotationPoint(-46F, -10F, 21.5F);

		leftTrackModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1094
		leftTrackModel[417].setRotationPoint(-46F, -10F, 20.5F);

		leftTrackModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1095
		leftTrackModel[418].setRotationPoint(-46F, -10F, 17.5F);

		leftTrackModel[419].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1096
		leftTrackModel[419].setRotationPoint(-46F, -10F, 17.5F);

		leftTrackModel[420].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1097
		leftTrackModel[420].setRotationPoint(-46F, -10F, 16.5F);

		leftTrackModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1098
		leftTrackModel[421].setRotationPoint(-43F, -10F, 25.5F);

		leftTrackModel[422].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1099
		leftTrackModel[422].setRotationPoint(-43F, -10F, 25.5F);

		leftTrackModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1100
		leftTrackModel[423].setRotationPoint(-43F, -10F, 23.5F);

		leftTrackModel[424].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1101
		leftTrackModel[424].setRotationPoint(-43F, -10F, 21.5F);

		leftTrackModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1102
		leftTrackModel[425].setRotationPoint(-43F, -10F, 20.5F);

		leftTrackModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1103
		leftTrackModel[426].setRotationPoint(-43F, -10F, 17.5F);

		leftTrackModel[427].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1104
		leftTrackModel[427].setRotationPoint(-43F, -10F, 17.5F);

		leftTrackModel[428].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1105
		leftTrackModel[428].setRotationPoint(-43F, -10F, 16.5F);

		leftTrackModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1106
		leftTrackModel[429].setRotationPoint(-40F, -10F, 25.5F);

		leftTrackModel[430].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1107
		leftTrackModel[430].setRotationPoint(-40F, -10F, 25.5F);

		leftTrackModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1108
		leftTrackModel[431].setRotationPoint(-40F, -10F, 23.5F);

		leftTrackModel[432].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1109
		leftTrackModel[432].setRotationPoint(-40F, -10F, 21.5F);

		leftTrackModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1110
		leftTrackModel[433].setRotationPoint(-40F, -10F, 20.5F);

		leftTrackModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1111
		leftTrackModel[434].setRotationPoint(-40F, -10F, 17.5F);

		leftTrackModel[435].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1112
		leftTrackModel[435].setRotationPoint(-40F, -10F, 17.5F);

		leftTrackModel[436].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1113
		leftTrackModel[436].setRotationPoint(-40F, -10F, 16.5F);

		leftTrackModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1114
		leftTrackModel[437].setRotationPoint(-37F, -10F, 25.5F);

		leftTrackModel[438].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1115
		leftTrackModel[438].setRotationPoint(-37F, -10F, 25.5F);

		leftTrackModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1116
		leftTrackModel[439].setRotationPoint(-37F, -10F, 23.5F);

		leftTrackModel[440].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1117
		leftTrackModel[440].setRotationPoint(-37F, -10F, 21.5F);

		leftTrackModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1118
		leftTrackModel[441].setRotationPoint(-37F, -10F, 20.5F);

		leftTrackModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1119
		leftTrackModel[442].setRotationPoint(-37F, -10F, 17.5F);

		leftTrackModel[443].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1120
		leftTrackModel[443].setRotationPoint(-37F, -10F, 17.5F);

		leftTrackModel[444].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1121
		leftTrackModel[444].setRotationPoint(-37F, -10F, 16.5F);

		leftTrackModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1122
		leftTrackModel[445].setRotationPoint(-34F, -10F, 25.5F);

		leftTrackModel[446].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1123
		leftTrackModel[446].setRotationPoint(-34F, -10F, 25.5F);

		leftTrackModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1124
		leftTrackModel[447].setRotationPoint(-34F, -10F, 23.5F);

		leftTrackModel[448].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1125
		leftTrackModel[448].setRotationPoint(-34F, -10F, 21.5F);

		leftTrackModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1126
		leftTrackModel[449].setRotationPoint(-34F, -10F, 20.5F);

		leftTrackModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1127
		leftTrackModel[450].setRotationPoint(-34F, -10F, 17.5F);

		leftTrackModel[451].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1128
		leftTrackModel[451].setRotationPoint(-34F, -10F, 17.5F);

		leftTrackModel[452].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1129
		leftTrackModel[452].setRotationPoint(-34F, -10F, 16.5F);

		leftTrackModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1130
		leftTrackModel[453].setRotationPoint(-31F, -10F, 25.5F);

		leftTrackModel[454].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1131
		leftTrackModel[454].setRotationPoint(-31F, -10F, 25.5F);

		leftTrackModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1132
		leftTrackModel[455].setRotationPoint(-31F, -10F, 23.5F);

		leftTrackModel[456].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1133
		leftTrackModel[456].setRotationPoint(-31F, -10F, 21.5F);

		leftTrackModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1134
		leftTrackModel[457].setRotationPoint(-31F, -10F, 20.5F);

		leftTrackModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1135
		leftTrackModel[458].setRotationPoint(-31F, -10F, 17.5F);

		leftTrackModel[459].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1136
		leftTrackModel[459].setRotationPoint(-31F, -10F, 17.5F);

		leftTrackModel[460].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1137
		leftTrackModel[460].setRotationPoint(-31F, -10F, 16.5F);

		leftTrackModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1138
		leftTrackModel[461].setRotationPoint(-28F, -10F, 25.5F);

		leftTrackModel[462].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1139
		leftTrackModel[462].setRotationPoint(-28F, -10F, 25.5F);

		leftTrackModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1140
		leftTrackModel[463].setRotationPoint(-28F, -10F, 23.5F);

		leftTrackModel[464].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1141
		leftTrackModel[464].setRotationPoint(-28F, -10F, 21.5F);

		leftTrackModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1142
		leftTrackModel[465].setRotationPoint(-28F, -10F, 20.5F);

		leftTrackModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1143
		leftTrackModel[466].setRotationPoint(-28F, -10F, 17.5F);

		leftTrackModel[467].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1144
		leftTrackModel[467].setRotationPoint(-28F, -10F, 17.5F);

		leftTrackModel[468].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1145
		leftTrackModel[468].setRotationPoint(-28F, -10F, 16.5F);

		leftTrackModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1146
		leftTrackModel[469].setRotationPoint(-25F, -10F, 25.5F);

		leftTrackModel[470].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1147
		leftTrackModel[470].setRotationPoint(-25F, -10F, 25.5F);

		leftTrackModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1148
		leftTrackModel[471].setRotationPoint(-25F, -10F, 23.5F);

		leftTrackModel[472].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1149
		leftTrackModel[472].setRotationPoint(-25F, -10F, 21.5F);

		leftTrackModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1150
		leftTrackModel[473].setRotationPoint(-25F, -10F, 20.5F);

		leftTrackModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1151
		leftTrackModel[474].setRotationPoint(-25F, -10F, 17.5F);

		leftTrackModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1152
		leftTrackModel[475].setRotationPoint(-25F, -10F, 17.5F);

		leftTrackModel[476].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1153
		leftTrackModel[476].setRotationPoint(-25F, -10F, 16.5F);

		leftTrackModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1154
		leftTrackModel[477].setRotationPoint(-22F, -10F, 25.5F);

		leftTrackModel[478].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1155
		leftTrackModel[478].setRotationPoint(-22F, -10F, 25.5F);

		leftTrackModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1156
		leftTrackModel[479].setRotationPoint(-22F, -10F, 23.5F);

		leftTrackModel[480].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1157
		leftTrackModel[480].setRotationPoint(-22F, -10F, 21.5F);

		leftTrackModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1158
		leftTrackModel[481].setRotationPoint(-22F, -10F, 20.5F);

		leftTrackModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1159
		leftTrackModel[482].setRotationPoint(-22F, -10F, 17.5F);

		leftTrackModel[483].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1160
		leftTrackModel[483].setRotationPoint(-22F, -10F, 17.5F);

		leftTrackModel[484].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1161
		leftTrackModel[484].setRotationPoint(-22F, -10F, 16.5F);

		leftTrackModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1162
		leftTrackModel[485].setRotationPoint(-19F, -10F, 25.5F);

		leftTrackModel[486].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1163
		leftTrackModel[486].setRotationPoint(-19F, -10F, 25.5F);

		leftTrackModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1164
		leftTrackModel[487].setRotationPoint(-19F, -10F, 23.5F);

		leftTrackModel[488].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1165
		leftTrackModel[488].setRotationPoint(-19F, -10F, 21.5F);

		leftTrackModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1166
		leftTrackModel[489].setRotationPoint(-19F, -10F, 20.5F);

		leftTrackModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1167
		leftTrackModel[490].setRotationPoint(-19F, -10F, 17.5F);

		leftTrackModel[491].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1168
		leftTrackModel[491].setRotationPoint(-19F, -10F, 17.5F);

		leftTrackModel[492].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1169
		leftTrackModel[492].setRotationPoint(-19F, -10F, 16.5F);

		leftTrackModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1170
		leftTrackModel[493].setRotationPoint(-16F, -10F, 25.5F);

		leftTrackModel[494].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1171
		leftTrackModel[494].setRotationPoint(-16F, -10F, 25.5F);

		leftTrackModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1172
		leftTrackModel[495].setRotationPoint(-16F, -10F, 23.5F);

		leftTrackModel[496].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1173
		leftTrackModel[496].setRotationPoint(-16F, -10F, 21.5F);

		leftTrackModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1174
		leftTrackModel[497].setRotationPoint(-16F, -10F, 20.5F);

		leftTrackModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1175
		leftTrackModel[498].setRotationPoint(-16F, -10F, 17.5F);

		leftTrackModel[499].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1176
		leftTrackModel[499].setRotationPoint(-16F, -10F, 17.5F);
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1177
		leftTrackModel[501] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1178
		leftTrackModel[502] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1179
		leftTrackModel[503] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1180
		leftTrackModel[504] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1181
		leftTrackModel[505] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1182
		leftTrackModel[506] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1183
		leftTrackModel[507] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1184
		leftTrackModel[508] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1185
		leftTrackModel[509] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1186
		leftTrackModel[510] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1187
		leftTrackModel[511] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1188
		leftTrackModel[512] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1189
		leftTrackModel[513] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1190
		leftTrackModel[514] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1191
		leftTrackModel[515] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1192
		leftTrackModel[516] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1193
		leftTrackModel[517] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1194
		leftTrackModel[518] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1195
		leftTrackModel[519] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1196
		leftTrackModel[520] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1197
		leftTrackModel[521] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1198
		leftTrackModel[522] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1199
		leftTrackModel[523] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1200
		leftTrackModel[524] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1201
		leftTrackModel[525] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1202
		leftTrackModel[526] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1203
		leftTrackModel[527] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1204
		leftTrackModel[528] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1205
		leftTrackModel[529] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1206
		leftTrackModel[530] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1207
		leftTrackModel[531] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1208
		leftTrackModel[532] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1209
		leftTrackModel[533] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1210
		leftTrackModel[534] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1211
		leftTrackModel[535] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1212
		leftTrackModel[536] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1213
		leftTrackModel[537] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1214
		leftTrackModel[538] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1215
		leftTrackModel[539] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1216
		leftTrackModel[540] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1217
		leftTrackModel[541] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1218
		leftTrackModel[542] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1219
		leftTrackModel[543] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1220
		leftTrackModel[544] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1221
		leftTrackModel[545] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1222
		leftTrackModel[546] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1223
		leftTrackModel[547] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1224
		leftTrackModel[548] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1225
		leftTrackModel[549] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1226
		leftTrackModel[550] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1227
		leftTrackModel[551] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1228
		leftTrackModel[552] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1229
		leftTrackModel[553] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1230
		leftTrackModel[554] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1231
		leftTrackModel[555] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1232
		leftTrackModel[556] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1233
		leftTrackModel[557] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1234
		leftTrackModel[558] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1235
		leftTrackModel[559] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1236
		leftTrackModel[560] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1237
		leftTrackModel[561] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1238
		leftTrackModel[562] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1239
		leftTrackModel[563] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1240
		leftTrackModel[564] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1241
		leftTrackModel[565] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1242
		leftTrackModel[566] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1243
		leftTrackModel[567] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1244
		leftTrackModel[568] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1245
		leftTrackModel[569] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1246
		leftTrackModel[570] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1247
		leftTrackModel[571] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1248
		leftTrackModel[572] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1249
		leftTrackModel[573] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1250
		leftTrackModel[574] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1251
		leftTrackModel[575] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1252
		leftTrackModel[576] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1253
		leftTrackModel[577] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1254
		leftTrackModel[578] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1255
		leftTrackModel[579] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1256
		leftTrackModel[580] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1257
		leftTrackModel[581] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1258
		leftTrackModel[582] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1259
		leftTrackModel[583] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1260
		leftTrackModel[584] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1261
		leftTrackModel[585] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1262
		leftTrackModel[586] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1263
		leftTrackModel[587] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1264
		leftTrackModel[588] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1265
		leftTrackModel[589] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1266
		leftTrackModel[590] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1267
		leftTrackModel[591] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1268
		leftTrackModel[592] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1269
		leftTrackModel[593] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1270
		leftTrackModel[594] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1271
		leftTrackModel[595] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1272
		leftTrackModel[596] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1273
		leftTrackModel[597] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1274
		leftTrackModel[598] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1275
		leftTrackModel[599] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1276
		leftTrackModel[600] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1277
		leftTrackModel[601] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1278
		leftTrackModel[602] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1279
		leftTrackModel[603] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1280
		leftTrackModel[604] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1281
		leftTrackModel[605] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1282
		leftTrackModel[606] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1283
		leftTrackModel[607] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1284
		leftTrackModel[608] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1285
		leftTrackModel[609] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1286
		leftTrackModel[610] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1287
		leftTrackModel[611] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1288
		leftTrackModel[612] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1289
		leftTrackModel[613] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1290
		leftTrackModel[614] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1291
		leftTrackModel[615] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1292
		leftTrackModel[616] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1293
		leftTrackModel[617] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1294
		leftTrackModel[618] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1295
		leftTrackModel[619] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1296
		leftTrackModel[620] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1297
		leftTrackModel[621] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1298
		leftTrackModel[622] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1299
		leftTrackModel[623] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1300
		leftTrackModel[624] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1301
		leftTrackModel[625] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1302
		leftTrackModel[626] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1303
		leftTrackModel[627] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1304
		leftTrackModel[628] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1305
		leftTrackModel[629] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1306
		leftTrackModel[630] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1307
		leftTrackModel[631] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1308
		leftTrackModel[632] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1309
		leftTrackModel[633] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1310
		leftTrackModel[634] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1311
		leftTrackModel[635] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1312
		leftTrackModel[636] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1313
		leftTrackModel[637] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1314
		leftTrackModel[638] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1315
		leftTrackModel[639] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1316
		leftTrackModel[640] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1317
		leftTrackModel[641] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1318
		leftTrackModel[642] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1319
		leftTrackModel[643] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1320
		leftTrackModel[644] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1321
		leftTrackModel[645] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1322
		leftTrackModel[646] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1323
		leftTrackModel[647] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1324
		leftTrackModel[648] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1325
		leftTrackModel[649] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1326
		leftTrackModel[650] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1327
		leftTrackModel[651] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1328
		leftTrackModel[652] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1329
		leftTrackModel[653] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1330
		leftTrackModel[654] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1331
		leftTrackModel[655] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1332
		leftTrackModel[656] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box1333
		leftTrackModel[657] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box1334
		leftTrackModel[658] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1335
		leftTrackModel[659] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box1336
		leftTrackModel[660] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box1337
		leftTrackModel[661] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1843
		leftTrackModel[662] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1844
		leftTrackModel[663] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1845
		leftTrackModel[664] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1846
		leftTrackModel[665] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1847
		leftTrackModel[666] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1848
		leftTrackModel[667] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1849
		leftTrackModel[668] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1850
		leftTrackModel[669] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1852
		leftTrackModel[670] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1861
		leftTrackModel[671] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1862
		leftTrackModel[672] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1863
		leftTrackModel[673] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1864
		leftTrackModel[674] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1865
		leftTrackModel[675] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1866
		leftTrackModel[676] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1867
		leftTrackModel[677] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1868
		leftTrackModel[678] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1869
		leftTrackModel[679] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1879
		leftTrackModel[680] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1880
		leftTrackModel[681] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1881
		leftTrackModel[682] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1882
		leftTrackModel[683] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1883
		leftTrackModel[684] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1884
		leftTrackModel[685] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1885
		leftTrackModel[686] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1886
		leftTrackModel[687] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1887
		leftTrackModel[688] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1897
		leftTrackModel[689] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1898
		leftTrackModel[690] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1899
		leftTrackModel[691] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1900
		leftTrackModel[692] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1901
		leftTrackModel[693] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1902
		leftTrackModel[694] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1903
		leftTrackModel[695] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1904
		leftTrackModel[696] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1905
		leftTrackModel[697] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1915
		leftTrackModel[698] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1916
		leftTrackModel[699] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1917
		leftTrackModel[700] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1918
		leftTrackModel[701] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1919
		leftTrackModel[702] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1920
		leftTrackModel[703] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1921
		leftTrackModel[704] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1922
		leftTrackModel[705] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1923
		leftTrackModel[706] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1933
		leftTrackModel[707] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1934
		leftTrackModel[708] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1935
		leftTrackModel[709] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1936
		leftTrackModel[710] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1937
		leftTrackModel[711] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1938
		leftTrackModel[712] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1939
		leftTrackModel[713] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1940
		leftTrackModel[714] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1941
		leftTrackModel[715] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1951
		leftTrackModel[716] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1952
		leftTrackModel[717] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1953
		leftTrackModel[718] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1954
		leftTrackModel[719] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1955
		leftTrackModel[720] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1956
		leftTrackModel[721] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1957
		leftTrackModel[722] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1958
		leftTrackModel[723] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1959
		leftTrackModel[724] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1969
		leftTrackModel[725] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1970
		leftTrackModel[726] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1971
		leftTrackModel[727] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1972
		leftTrackModel[728] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1973
		leftTrackModel[729] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1974
		leftTrackModel[730] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1975
		leftTrackModel[731] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1976
		leftTrackModel[732] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1977
		leftTrackModel[733] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1987
		leftTrackModel[734] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1988
		leftTrackModel[735] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1989
		leftTrackModel[736] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1990
		leftTrackModel[737] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1991
		leftTrackModel[738] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1992
		leftTrackModel[739] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1993
		leftTrackModel[740] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1994
		leftTrackModel[741] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1995

		leftTrackModel[500].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1177
		leftTrackModel[500].setRotationPoint(-16F, -10F, 16.5F);

		leftTrackModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1178
		leftTrackModel[501].setRotationPoint(-13F, -10F, 25.5F);

		leftTrackModel[502].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1179
		leftTrackModel[502].setRotationPoint(-13F, -10F, 25.5F);

		leftTrackModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1180
		leftTrackModel[503].setRotationPoint(-13F, -10F, 23.5F);

		leftTrackModel[504].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1181
		leftTrackModel[504].setRotationPoint(-13F, -10F, 21.5F);

		leftTrackModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1182
		leftTrackModel[505].setRotationPoint(-13F, -10F, 20.5F);

		leftTrackModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1183
		leftTrackModel[506].setRotationPoint(-13F, -10F, 17.5F);

		leftTrackModel[507].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1184
		leftTrackModel[507].setRotationPoint(-13F, -10F, 17.5F);

		leftTrackModel[508].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1185
		leftTrackModel[508].setRotationPoint(-13F, -10F, 16.5F);

		leftTrackModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1186
		leftTrackModel[509].setRotationPoint(-10F, -10F, 25.5F);

		leftTrackModel[510].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1187
		leftTrackModel[510].setRotationPoint(-10F, -10F, 25.5F);

		leftTrackModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1188
		leftTrackModel[511].setRotationPoint(-10F, -10F, 23.5F);

		leftTrackModel[512].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1189
		leftTrackModel[512].setRotationPoint(-10F, -10F, 21.5F);

		leftTrackModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1190
		leftTrackModel[513].setRotationPoint(-10F, -10F, 20.5F);

		leftTrackModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1191
		leftTrackModel[514].setRotationPoint(-10F, -10F, 17.5F);

		leftTrackModel[515].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1192
		leftTrackModel[515].setRotationPoint(-10F, -10F, 17.5F);

		leftTrackModel[516].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1193
		leftTrackModel[516].setRotationPoint(-10F, -10F, 16.5F);

		leftTrackModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1194
		leftTrackModel[517].setRotationPoint(-7F, -10F, 25.5F);

		leftTrackModel[518].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1195
		leftTrackModel[518].setRotationPoint(-7F, -10F, 25.5F);

		leftTrackModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1196
		leftTrackModel[519].setRotationPoint(-7F, -10F, 23.5F);

		leftTrackModel[520].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1197
		leftTrackModel[520].setRotationPoint(-7F, -10F, 21.5F);

		leftTrackModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1198
		leftTrackModel[521].setRotationPoint(-7F, -10F, 20.5F);

		leftTrackModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1199
		leftTrackModel[522].setRotationPoint(-7F, -10F, 17.5F);

		leftTrackModel[523].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1200
		leftTrackModel[523].setRotationPoint(-7F, -10F, 17.5F);

		leftTrackModel[524].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1201
		leftTrackModel[524].setRotationPoint(-7F, -10F, 16.5F);

		leftTrackModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1202
		leftTrackModel[525].setRotationPoint(-4F, -10F, 25.5F);

		leftTrackModel[526].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1203
		leftTrackModel[526].setRotationPoint(-4F, -10F, 25.5F);

		leftTrackModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1204
		leftTrackModel[527].setRotationPoint(-4F, -10F, 23.5F);

		leftTrackModel[528].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1205
		leftTrackModel[528].setRotationPoint(-4F, -10F, 21.5F);

		leftTrackModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1206
		leftTrackModel[529].setRotationPoint(-4F, -10F, 20.5F);

		leftTrackModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1207
		leftTrackModel[530].setRotationPoint(-4F, -10F, 17.5F);

		leftTrackModel[531].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1208
		leftTrackModel[531].setRotationPoint(-4F, -10F, 17.5F);

		leftTrackModel[532].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1209
		leftTrackModel[532].setRotationPoint(-4F, -10F, 16.5F);

		leftTrackModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1210
		leftTrackModel[533].setRotationPoint(-1F, -10F, 25.5F);

		leftTrackModel[534].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1211
		leftTrackModel[534].setRotationPoint(-1F, -10F, 25.5F);

		leftTrackModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1212
		leftTrackModel[535].setRotationPoint(-1F, -10F, 23.5F);

		leftTrackModel[536].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1213
		leftTrackModel[536].setRotationPoint(-1F, -10F, 21.5F);

		leftTrackModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1214
		leftTrackModel[537].setRotationPoint(-1F, -10F, 20.5F);

		leftTrackModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1215
		leftTrackModel[538].setRotationPoint(-1F, -10F, 17.5F);

		leftTrackModel[539].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1216
		leftTrackModel[539].setRotationPoint(-1F, -10F, 17.5F);

		leftTrackModel[540].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1217
		leftTrackModel[540].setRotationPoint(-1F, -10F, 16.5F);

		leftTrackModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1218
		leftTrackModel[541].setRotationPoint(2F, -10F, 25.5F);

		leftTrackModel[542].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1219
		leftTrackModel[542].setRotationPoint(2F, -10F, 25.5F);

		leftTrackModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1220
		leftTrackModel[543].setRotationPoint(2F, -10F, 23.5F);

		leftTrackModel[544].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1221
		leftTrackModel[544].setRotationPoint(2F, -10F, 21.5F);

		leftTrackModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1222
		leftTrackModel[545].setRotationPoint(2F, -10F, 20.5F);

		leftTrackModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1223
		leftTrackModel[546].setRotationPoint(2F, -10F, 17.5F);

		leftTrackModel[547].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1224
		leftTrackModel[547].setRotationPoint(2F, -10F, 17.5F);

		leftTrackModel[548].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1225
		leftTrackModel[548].setRotationPoint(2F, -10F, 16.5F);

		leftTrackModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1226
		leftTrackModel[549].setRotationPoint(5F, -10F, 25.5F);

		leftTrackModel[550].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1227
		leftTrackModel[550].setRotationPoint(5F, -10F, 25.5F);

		leftTrackModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1228
		leftTrackModel[551].setRotationPoint(5F, -10F, 23.5F);

		leftTrackModel[552].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1229
		leftTrackModel[552].setRotationPoint(5F, -10F, 21.5F);

		leftTrackModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1230
		leftTrackModel[553].setRotationPoint(5F, -10F, 20.5F);

		leftTrackModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1231
		leftTrackModel[554].setRotationPoint(5F, -10F, 17.5F);

		leftTrackModel[555].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1232
		leftTrackModel[555].setRotationPoint(5F, -10F, 17.5F);

		leftTrackModel[556].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1233
		leftTrackModel[556].setRotationPoint(5F, -10F, 16.5F);

		leftTrackModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1234
		leftTrackModel[557].setRotationPoint(8F, -10F, 25.5F);

		leftTrackModel[558].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1235
		leftTrackModel[558].setRotationPoint(8F, -10F, 25.5F);

		leftTrackModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1236
		leftTrackModel[559].setRotationPoint(8F, -10F, 23.5F);

		leftTrackModel[560].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1237
		leftTrackModel[560].setRotationPoint(8F, -10F, 21.5F);

		leftTrackModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1238
		leftTrackModel[561].setRotationPoint(8F, -10F, 20.5F);

		leftTrackModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1239
		leftTrackModel[562].setRotationPoint(8F, -10F, 17.5F);

		leftTrackModel[563].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1240
		leftTrackModel[563].setRotationPoint(8F, -10F, 17.5F);

		leftTrackModel[564].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1241
		leftTrackModel[564].setRotationPoint(8F, -10F, 16.5F);

		leftTrackModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1242
		leftTrackModel[565].setRotationPoint(11F, -10F, 25.5F);

		leftTrackModel[566].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1243
		leftTrackModel[566].setRotationPoint(11F, -10F, 25.5F);

		leftTrackModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1244
		leftTrackModel[567].setRotationPoint(11F, -10F, 23.5F);

		leftTrackModel[568].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1245
		leftTrackModel[568].setRotationPoint(11F, -10F, 21.5F);

		leftTrackModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1246
		leftTrackModel[569].setRotationPoint(11F, -10F, 20.5F);

		leftTrackModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1247
		leftTrackModel[570].setRotationPoint(11F, -10F, 17.5F);

		leftTrackModel[571].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1248
		leftTrackModel[571].setRotationPoint(11F, -10F, 17.5F);

		leftTrackModel[572].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1249
		leftTrackModel[572].setRotationPoint(11F, -10F, 16.5F);

		leftTrackModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1250
		leftTrackModel[573].setRotationPoint(14F, -10F, 25.5F);

		leftTrackModel[574].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1251
		leftTrackModel[574].setRotationPoint(14F, -10F, 25.5F);

		leftTrackModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1252
		leftTrackModel[575].setRotationPoint(14F, -10F, 23.5F);

		leftTrackModel[576].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1253
		leftTrackModel[576].setRotationPoint(14F, -10F, 21.5F);

		leftTrackModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1254
		leftTrackModel[577].setRotationPoint(14F, -10F, 20.5F);

		leftTrackModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1255
		leftTrackModel[578].setRotationPoint(14F, -10F, 17.5F);

		leftTrackModel[579].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1256
		leftTrackModel[579].setRotationPoint(14F, -10F, 17.5F);

		leftTrackModel[580].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1257
		leftTrackModel[580].setRotationPoint(14F, -10F, 16.5F);

		leftTrackModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1258
		leftTrackModel[581].setRotationPoint(17F, -10F, 25.5F);

		leftTrackModel[582].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1259
		leftTrackModel[582].setRotationPoint(17F, -10F, 25.5F);

		leftTrackModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1260
		leftTrackModel[583].setRotationPoint(17F, -10F, 23.5F);

		leftTrackModel[584].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1261
		leftTrackModel[584].setRotationPoint(17F, -10F, 21.5F);

		leftTrackModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1262
		leftTrackModel[585].setRotationPoint(17F, -10F, 20.5F);

		leftTrackModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1263
		leftTrackModel[586].setRotationPoint(17F, -10F, 17.5F);

		leftTrackModel[587].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1264
		leftTrackModel[587].setRotationPoint(17F, -10F, 17.5F);

		leftTrackModel[588].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1265
		leftTrackModel[588].setRotationPoint(17F, -10F, 16.5F);

		leftTrackModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1266
		leftTrackModel[589].setRotationPoint(20F, -10F, 25.5F);

		leftTrackModel[590].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1267
		leftTrackModel[590].setRotationPoint(20F, -10F, 25.5F);

		leftTrackModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1268
		leftTrackModel[591].setRotationPoint(20F, -10F, 23.5F);

		leftTrackModel[592].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1269
		leftTrackModel[592].setRotationPoint(20F, -10F, 21.5F);

		leftTrackModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1270
		leftTrackModel[593].setRotationPoint(20F, -10F, 20.5F);

		leftTrackModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1271
		leftTrackModel[594].setRotationPoint(20F, -10F, 17.5F);

		leftTrackModel[595].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1272
		leftTrackModel[595].setRotationPoint(20F, -10F, 17.5F);

		leftTrackModel[596].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1273
		leftTrackModel[596].setRotationPoint(20F, -10F, 16.5F);

		leftTrackModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1274
		leftTrackModel[597].setRotationPoint(23F, -10F, 25.5F);

		leftTrackModel[598].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1275
		leftTrackModel[598].setRotationPoint(23F, -10F, 25.5F);

		leftTrackModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1276
		leftTrackModel[599].setRotationPoint(23F, -10F, 23.5F);

		leftTrackModel[600].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1277
		leftTrackModel[600].setRotationPoint(23F, -10F, 21.5F);

		leftTrackModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1278
		leftTrackModel[601].setRotationPoint(23F, -10F, 20.5F);

		leftTrackModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1279
		leftTrackModel[602].setRotationPoint(23F, -10F, 17.5F);

		leftTrackModel[603].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1280
		leftTrackModel[603].setRotationPoint(23F, -10F, 17.5F);

		leftTrackModel[604].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1281
		leftTrackModel[604].setRotationPoint(23F, -10F, 16.5F);

		leftTrackModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1282
		leftTrackModel[605].setRotationPoint(26F, -10F, 25.5F);

		leftTrackModel[606].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1283
		leftTrackModel[606].setRotationPoint(26F, -10F, 25.5F);

		leftTrackModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1284
		leftTrackModel[607].setRotationPoint(26F, -10F, 23.5F);

		leftTrackModel[608].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1285
		leftTrackModel[608].setRotationPoint(26F, -10F, 21.5F);

		leftTrackModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1286
		leftTrackModel[609].setRotationPoint(26F, -10F, 20.5F);

		leftTrackModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1287
		leftTrackModel[610].setRotationPoint(26F, -10F, 17.5F);

		leftTrackModel[611].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1288
		leftTrackModel[611].setRotationPoint(26F, -10F, 17.5F);

		leftTrackModel[612].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1289
		leftTrackModel[612].setRotationPoint(26F, -10F, 16.5F);

		leftTrackModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1290
		leftTrackModel[613].setRotationPoint(29F, -10F, 25.5F);

		leftTrackModel[614].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1291
		leftTrackModel[614].setRotationPoint(29F, -10F, 25.5F);

		leftTrackModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1292
		leftTrackModel[615].setRotationPoint(29F, -10F, 23.5F);

		leftTrackModel[616].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1293
		leftTrackModel[616].setRotationPoint(29F, -10F, 21.5F);

		leftTrackModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1294
		leftTrackModel[617].setRotationPoint(29F, -10F, 20.5F);

		leftTrackModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1295
		leftTrackModel[618].setRotationPoint(29F, -10F, 17.5F);

		leftTrackModel[619].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1296
		leftTrackModel[619].setRotationPoint(29F, -10F, 17.5F);

		leftTrackModel[620].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1297
		leftTrackModel[620].setRotationPoint(29F, -10F, 16.5F);

		leftTrackModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1298
		leftTrackModel[621].setRotationPoint(32F, -10F, 25.5F);

		leftTrackModel[622].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1299
		leftTrackModel[622].setRotationPoint(32F, -10F, 25.5F);

		leftTrackModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1300
		leftTrackModel[623].setRotationPoint(32F, -10F, 23.5F);

		leftTrackModel[624].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1301
		leftTrackModel[624].setRotationPoint(32F, -10F, 21.5F);

		leftTrackModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1302
		leftTrackModel[625].setRotationPoint(32F, -10F, 20.5F);

		leftTrackModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1303
		leftTrackModel[626].setRotationPoint(32F, -10F, 17.5F);

		leftTrackModel[627].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1304
		leftTrackModel[627].setRotationPoint(32F, -10F, 17.5F);

		leftTrackModel[628].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1305
		leftTrackModel[628].setRotationPoint(32F, -10F, 16.5F);

		leftTrackModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1306
		leftTrackModel[629].setRotationPoint(35F, -10F, 25.5F);

		leftTrackModel[630].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1307
		leftTrackModel[630].setRotationPoint(35F, -10F, 25.5F);

		leftTrackModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1308
		leftTrackModel[631].setRotationPoint(35F, -10F, 23.5F);

		leftTrackModel[632].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1309
		leftTrackModel[632].setRotationPoint(35F, -10F, 21.5F);

		leftTrackModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1310
		leftTrackModel[633].setRotationPoint(35F, -10F, 20.5F);

		leftTrackModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1311
		leftTrackModel[634].setRotationPoint(35F, -10F, 17.5F);

		leftTrackModel[635].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1312
		leftTrackModel[635].setRotationPoint(35F, -10F, 17.5F);

		leftTrackModel[636].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1313
		leftTrackModel[636].setRotationPoint(35F, -10F, 16.5F);

		leftTrackModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1314
		leftTrackModel[637].setRotationPoint(38F, -10F, 25.5F);

		leftTrackModel[638].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1315
		leftTrackModel[638].setRotationPoint(38F, -10F, 25.5F);

		leftTrackModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1316
		leftTrackModel[639].setRotationPoint(38F, -10F, 23.5F);

		leftTrackModel[640].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1317
		leftTrackModel[640].setRotationPoint(38F, -10F, 21.5F);

		leftTrackModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1318
		leftTrackModel[641].setRotationPoint(38F, -10F, 20.5F);

		leftTrackModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1319
		leftTrackModel[642].setRotationPoint(38F, -10F, 17.5F);

		leftTrackModel[643].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1320
		leftTrackModel[643].setRotationPoint(38F, -10F, 17.5F);

		leftTrackModel[644].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1321
		leftTrackModel[644].setRotationPoint(38F, -10F, 16.5F);

		leftTrackModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1322
		leftTrackModel[645].setRotationPoint(41F, -10F, 25.5F);

		leftTrackModel[646].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1323
		leftTrackModel[646].setRotationPoint(41F, -10F, 25.5F);

		leftTrackModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1324
		leftTrackModel[647].setRotationPoint(41F, -10F, 23.5F);

		leftTrackModel[648].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1325
		leftTrackModel[648].setRotationPoint(41F, -10F, 21.5F);

		leftTrackModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1326
		leftTrackModel[649].setRotationPoint(41F, -10F, 20.5F);

		leftTrackModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1327
		leftTrackModel[650].setRotationPoint(41F, -10F, 17.5F);

		leftTrackModel[651].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1328
		leftTrackModel[651].setRotationPoint(41F, -10F, 17.5F);

		leftTrackModel[652].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1329
		leftTrackModel[652].setRotationPoint(41F, -10F, 16.5F);

		leftTrackModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box1330
		leftTrackModel[653].setRotationPoint(44F, -10F, 25.5F);

		leftTrackModel[654].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box1331
		leftTrackModel[654].setRotationPoint(45F, -10F, 25.5F);

		leftTrackModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box1332
		leftTrackModel[655].setRotationPoint(44F, -10F, 23.5F);

		leftTrackModel[656].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box1333
		leftTrackModel[656].setRotationPoint(45F, -10F, 21.5F);

		leftTrackModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box1334
		leftTrackModel[657].setRotationPoint(44F, -10F, 20.5F);

		leftTrackModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box1335
		leftTrackModel[658].setRotationPoint(44F, -10F, 17.5F);

		leftTrackModel[659].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1336
		leftTrackModel[659].setRotationPoint(45F, -10F, 17.5F);

		leftTrackModel[660].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1337
		leftTrackModel[660].setRotationPoint(45F, -10F, 16.5F);

		leftTrackModel[661].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1843
		leftTrackModel[661].setRotationPoint(38.5F, 3.5F, 18F);

		leftTrackModel[662].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1844
		leftTrackModel[662].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[662].rotateAngleZ = 0.78539816F;

		leftTrackModel[663].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1845
		leftTrackModel[663].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[663].rotateAngleZ = 1.57079633F;

		leftTrackModel[664].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1846
		leftTrackModel[664].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[664].rotateAngleZ = 2.35619449F;

		leftTrackModel[665].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1847
		leftTrackModel[665].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[665].rotateAngleZ = 3.14159265F;

		leftTrackModel[666].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1848
		leftTrackModel[666].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[666].rotateAngleZ = 3.92699082F;

		leftTrackModel[667].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1849
		leftTrackModel[667].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[667].rotateAngleZ = 4.71238898F;

		leftTrackModel[668].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1850
		leftTrackModel[668].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[668].rotateAngleZ = 5.49778714F;

		leftTrackModel[669].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1852
		leftTrackModel[669].setRotationPoint(38.5F, 3.5F, 18F);

		leftTrackModel[670].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1861
		leftTrackModel[670].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[670].rotateAngleZ = 4.71238898F;

		leftTrackModel[671].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1862
		leftTrackModel[671].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[671].rotateAngleZ = 5.49778714F;

		leftTrackModel[672].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1863
		leftTrackModel[672].setRotationPoint(49.5F, -4.5F, 18F);

		leftTrackModel[673].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1864
		leftTrackModel[673].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[673].rotateAngleZ = 3.92699082F;

		leftTrackModel[674].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1865
		leftTrackModel[674].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[674].rotateAngleZ = 3.14159265F;

		leftTrackModel[675].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1866
		leftTrackModel[675].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[675].rotateAngleZ = 2.35619449F;

		leftTrackModel[676].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1867
		leftTrackModel[676].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[676].rotateAngleZ = 1.57079633F;

		leftTrackModel[677].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1868
		leftTrackModel[677].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[677].rotateAngleZ = 0.78539816F;

		leftTrackModel[678].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1869
		leftTrackModel[678].setRotationPoint(49.5F, -4.5F, 18F);

		leftTrackModel[679].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1879
		leftTrackModel[679].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[679].rotateAngleZ = 4.71238898F;

		leftTrackModel[680].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1880
		leftTrackModel[680].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[680].rotateAngleZ = 5.49778714F;

		leftTrackModel[681].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1881
		leftTrackModel[681].setRotationPoint(25.5F, 3.5F, 18F);

		leftTrackModel[682].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1882
		leftTrackModel[682].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[682].rotateAngleZ = 3.92699082F;

		leftTrackModel[683].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1883
		leftTrackModel[683].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[683].rotateAngleZ = 3.14159265F;

		leftTrackModel[684].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1884
		leftTrackModel[684].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[684].rotateAngleZ = 2.35619449F;

		leftTrackModel[685].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1885
		leftTrackModel[685].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[685].rotateAngleZ = 1.57079633F;

		leftTrackModel[686].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1886
		leftTrackModel[686].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[686].rotateAngleZ = 0.78539816F;

		leftTrackModel[687].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1887
		leftTrackModel[687].setRotationPoint(25.5F, 3.5F, 18F);

		leftTrackModel[688].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1897
		leftTrackModel[688].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[688].rotateAngleZ = 4.71238898F;

		leftTrackModel[689].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1898
		leftTrackModel[689].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[689].rotateAngleZ = 5.49778714F;

		leftTrackModel[690].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1899
		leftTrackModel[690].setRotationPoint(12.5F, 3.5F, 18F);

		leftTrackModel[691].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1900
		leftTrackModel[691].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[691].rotateAngleZ = 3.92699082F;

		leftTrackModel[692].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1901
		leftTrackModel[692].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[692].rotateAngleZ = 3.14159265F;

		leftTrackModel[693].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1902
		leftTrackModel[693].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[693].rotateAngleZ = 2.35619449F;

		leftTrackModel[694].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1903
		leftTrackModel[694].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[694].rotateAngleZ = 1.57079633F;

		leftTrackModel[695].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1904
		leftTrackModel[695].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[695].rotateAngleZ = 0.78539816F;

		leftTrackModel[696].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1905
		leftTrackModel[696].setRotationPoint(12.5F, 3.5F, 18F);

		leftTrackModel[697].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1915
		leftTrackModel[697].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[697].rotateAngleZ = 4.71238898F;

		leftTrackModel[698].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1916
		leftTrackModel[698].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[698].rotateAngleZ = 5.49778714F;

		leftTrackModel[699].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1917
		leftTrackModel[699].setRotationPoint(1F, 3.5F, 18F);

		leftTrackModel[700].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1918
		leftTrackModel[700].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[700].rotateAngleZ = 3.92699082F;

		leftTrackModel[701].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1919
		leftTrackModel[701].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[701].rotateAngleZ = 3.14159265F;

		leftTrackModel[702].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1920
		leftTrackModel[702].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[702].rotateAngleZ = 2.35619449F;

		leftTrackModel[703].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1921
		leftTrackModel[703].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[703].rotateAngleZ = 1.57079633F;

		leftTrackModel[704].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1922
		leftTrackModel[704].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[704].rotateAngleZ = 0.78539816F;

		leftTrackModel[705].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1923
		leftTrackModel[705].setRotationPoint(1F, 3.5F, 18F);

		leftTrackModel[706].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1933
		leftTrackModel[706].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[706].rotateAngleZ = 4.71238898F;

		leftTrackModel[707].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1934
		leftTrackModel[707].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[707].rotateAngleZ = 5.49778714F;

		leftTrackModel[708].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1935
		leftTrackModel[708].setRotationPoint(-10.5F, 3.5F, 18F);

		leftTrackModel[709].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1936
		leftTrackModel[709].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[709].rotateAngleZ = 3.92699082F;

		leftTrackModel[710].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1937
		leftTrackModel[710].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[710].rotateAngleZ = 3.14159265F;

		leftTrackModel[711].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1938
		leftTrackModel[711].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[711].rotateAngleZ = 2.35619449F;

		leftTrackModel[712].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1939
		leftTrackModel[712].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[712].rotateAngleZ = 1.57079633F;

		leftTrackModel[713].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1940
		leftTrackModel[713].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[713].rotateAngleZ = 0.78539816F;

		leftTrackModel[714].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1941
		leftTrackModel[714].setRotationPoint(-10.5F, 3.5F, 18F);

		leftTrackModel[715].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951
		leftTrackModel[715].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[715].rotateAngleZ = 4.71238898F;

		leftTrackModel[716].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1952
		leftTrackModel[716].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[716].rotateAngleZ = 5.49778714F;

		leftTrackModel[717].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1953
		leftTrackModel[717].setRotationPoint(-23.5F, 3.5F, 18F);

		leftTrackModel[718].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1954
		leftTrackModel[718].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[718].rotateAngleZ = 3.92699082F;

		leftTrackModel[719].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1955
		leftTrackModel[719].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[719].rotateAngleZ = 3.14159265F;

		leftTrackModel[720].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1956
		leftTrackModel[720].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[720].rotateAngleZ = 2.35619449F;

		leftTrackModel[721].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1957
		leftTrackModel[721].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[721].rotateAngleZ = 1.57079633F;

		leftTrackModel[722].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1958
		leftTrackModel[722].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[722].rotateAngleZ = 0.78539816F;

		leftTrackModel[723].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1959
		leftTrackModel[723].setRotationPoint(-23.5F, 3.5F, 18F);

		leftTrackModel[724].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1969
		leftTrackModel[724].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[724].rotateAngleZ = 4.71238898F;

		leftTrackModel[725].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1970
		leftTrackModel[725].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[725].rotateAngleZ = 5.49778714F;

		leftTrackModel[726].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1971
		leftTrackModel[726].setRotationPoint(-36.5F, 3.5F, 18F);

		leftTrackModel[727].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1972
		leftTrackModel[727].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[727].rotateAngleZ = 3.92699082F;

		leftTrackModel[728].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1973
		leftTrackModel[728].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[728].rotateAngleZ = 3.14159265F;

		leftTrackModel[729].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1974
		leftTrackModel[729].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[729].rotateAngleZ = 2.35619449F;

		leftTrackModel[730].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1975
		leftTrackModel[730].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[730].rotateAngleZ = 1.57079633F;

		leftTrackModel[731].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1976
		leftTrackModel[731].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[731].rotateAngleZ = 0.78539816F;

		leftTrackModel[732].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1977
		leftTrackModel[732].setRotationPoint(-36.5F, 3.5F, 18F);

		leftTrackModel[733].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1987
		leftTrackModel[733].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[733].rotateAngleZ = 4.71238898F;

		leftTrackModel[734].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1988
		leftTrackModel[734].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[734].rotateAngleZ = 5.49778714F;

		leftTrackModel[735].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1989
		leftTrackModel[735].setRotationPoint(-44.5F, -4.5F, 18F);

		leftTrackModel[736].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1990
		leftTrackModel[736].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[736].rotateAngleZ = 3.92699082F;

		leftTrackModel[737].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1991
		leftTrackModel[737].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[737].rotateAngleZ = 3.14159265F;

		leftTrackModel[738].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1992
		leftTrackModel[738].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[738].rotateAngleZ = 2.35619449F;

		leftTrackModel[739].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1993
		leftTrackModel[739].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[739].rotateAngleZ = 1.57079633F;

		leftTrackModel[740].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1994
		leftTrackModel[740].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[740].rotateAngleZ = 0.78539816F;

		leftTrackModel[741].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1995
		leftTrackModel[741].setRotationPoint(-44.5F, -4.5F, 18F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox502
		rightTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox503
		rightTrackModel[2] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox504
		rightTrackModel[3] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox505
		rightTrackModel[4] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox506
		rightTrackModel[5] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox507
		rightTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox508
		rightTrackModel[7] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox509
		rightTrackModel[8] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox510
		rightTrackModel[9] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox511
		rightTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox512
		rightTrackModel[11] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox513
		rightTrackModel[12] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox514
		rightTrackModel[13] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox515
		rightTrackModel[14] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox516
		rightTrackModel[15] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox517
		rightTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox518
		rightTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox519
		rightTrackModel[18] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox520
		rightTrackModel[19] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox521
		rightTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox522
		rightTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox523
		rightTrackModel[22] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox524
		rightTrackModel[23] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox525
		rightTrackModel[24] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox526
		rightTrackModel[25] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox527
		rightTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox528
		rightTrackModel[27] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox529
		rightTrackModel[28] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox530
		rightTrackModel[29] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox531
		rightTrackModel[30] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox532
		rightTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox533
		rightTrackModel[32] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox534
		rightTrackModel[33] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox535
		rightTrackModel[34] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox536
		rightTrackModel[35] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox537
		rightTrackModel[36] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox538
		rightTrackModel[37] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox539
		rightTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox540
		rightTrackModel[39] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox541
		rightTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox542
		rightTrackModel[41] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox543
		rightTrackModel[42] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox544
		rightTrackModel[43] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox545
		rightTrackModel[44] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox546
		rightTrackModel[45] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box0
		rightTrackModel[46] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box1
		rightTrackModel[47] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box47
		rightTrackModel[48] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box48
		rightTrackModel[49] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box49
		rightTrackModel[50] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box50
		rightTrackModel[51] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box51
		rightTrackModel[52] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box52
		rightTrackModel[53] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box61
		rightTrackModel[54] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box62
		rightTrackModel[55] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box63
		rightTrackModel[56] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box64
		rightTrackModel[57] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box65
		rightTrackModel[58] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box66
		rightTrackModel[59] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box67
		rightTrackModel[60] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box68
		rightTrackModel[61] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box77
		rightTrackModel[62] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box78
		rightTrackModel[63] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box79
		rightTrackModel[64] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box80
		rightTrackModel[65] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box81
		rightTrackModel[66] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box82
		rightTrackModel[67] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box83
		rightTrackModel[68] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box84
		rightTrackModel[69] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box85
		rightTrackModel[70] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box86
		rightTrackModel[71] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box87
		rightTrackModel[72] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box88
		rightTrackModel[73] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box89
		rightTrackModel[74] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box90
		rightTrackModel[75] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box91
		rightTrackModel[76] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box92
		rightTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box93
		rightTrackModel[78] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box94
		rightTrackModel[79] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box95
		rightTrackModel[80] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box96
		rightTrackModel[81] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box97
		rightTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box98
		rightTrackModel[83] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box99
		rightTrackModel[84] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box100
		rightTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box101
		rightTrackModel[86] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box102
		rightTrackModel[87] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box103
		rightTrackModel[88] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box104
		rightTrackModel[89] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box105
		rightTrackModel[90] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box106
		rightTrackModel[91] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box107
		rightTrackModel[92] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box108
		rightTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box109
		rightTrackModel[94] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box110
		rightTrackModel[95] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box111
		rightTrackModel[96] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box112
		rightTrackModel[97] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box113
		rightTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box114
		rightTrackModel[99] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box115
		rightTrackModel[100] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box116
		rightTrackModel[101] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box117
		rightTrackModel[102] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box118
		rightTrackModel[103] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box119
		rightTrackModel[104] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box120
		rightTrackModel[105] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box121
		rightTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box122
		rightTrackModel[107] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box123
		rightTrackModel[108] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box124
		rightTrackModel[109] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box125
		rightTrackModel[110] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box126
		rightTrackModel[111] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box127
		rightTrackModel[112] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box128
		rightTrackModel[113] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box129
		rightTrackModel[114] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box130
		rightTrackModel[115] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box131
		rightTrackModel[116] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box132
		rightTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box133
		rightTrackModel[118] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box134
		rightTrackModel[119] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box135
		rightTrackModel[120] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box136
		rightTrackModel[121] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box137
		rightTrackModel[122] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box138
		rightTrackModel[123] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box139
		rightTrackModel[124] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box140
		rightTrackModel[125] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box141
		rightTrackModel[126] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box142
		rightTrackModel[127] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box143
		rightTrackModel[128] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box144
		rightTrackModel[129] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box145
		rightTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box146
		rightTrackModel[131] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box147
		rightTrackModel[132] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box148
		rightTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box149
		rightTrackModel[134] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box150
		rightTrackModel[135] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box151
		rightTrackModel[136] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box152
		rightTrackModel[137] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box153
		rightTrackModel[138] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box154
		rightTrackModel[139] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box155
		rightTrackModel[140] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box156
		rightTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box157
		rightTrackModel[142] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box158
		rightTrackModel[143] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box159
		rightTrackModel[144] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box160
		rightTrackModel[145] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box161
		rightTrackModel[146] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box162
		rightTrackModel[147] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box163
		rightTrackModel[148] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box164
		rightTrackModel[149] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box165
		rightTrackModel[150] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box166
		rightTrackModel[151] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box167
		rightTrackModel[152] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box168
		rightTrackModel[153] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box169
		rightTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box170
		rightTrackModel[155] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box171
		rightTrackModel[156] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box172
		rightTrackModel[157] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box173
		rightTrackModel[158] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box174
		rightTrackModel[159] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box175
		rightTrackModel[160] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box176
		rightTrackModel[161] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box177
		rightTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box178
		rightTrackModel[163] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box179
		rightTrackModel[164] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box180
		rightTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box181
		rightTrackModel[166] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box182
		rightTrackModel[167] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box183
		rightTrackModel[168] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box184
		rightTrackModel[169] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box185
		rightTrackModel[170] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box186
		rightTrackModel[171] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box187
		rightTrackModel[172] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box188
		rightTrackModel[173] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box189
		rightTrackModel[174] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box190
		rightTrackModel[175] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box191
		rightTrackModel[176] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box192
		rightTrackModel[177] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box193
		rightTrackModel[178] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box194
		rightTrackModel[179] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box195
		rightTrackModel[180] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box196
		rightTrackModel[181] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box197
		rightTrackModel[182] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box198
		rightTrackModel[183] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box199
		rightTrackModel[184] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box200
		rightTrackModel[185] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box201
		rightTrackModel[186] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box202
		rightTrackModel[187] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box203
		rightTrackModel[188] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box204
		rightTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box205
		rightTrackModel[190] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box206
		rightTrackModel[191] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box207
		rightTrackModel[192] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box208
		rightTrackModel[193] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box209
		rightTrackModel[194] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box210
		rightTrackModel[195] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box211
		rightTrackModel[196] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box212
		rightTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box213
		rightTrackModel[198] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box214
		rightTrackModel[199] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box215
		rightTrackModel[200] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box216
		rightTrackModel[201] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box217
		rightTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box218
		rightTrackModel[203] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box219
		rightTrackModel[204] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box220
		rightTrackModel[205] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box221
		rightTrackModel[206] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box222
		rightTrackModel[207] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box223
		rightTrackModel[208] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box224
		rightTrackModel[209] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box225
		rightTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box226
		rightTrackModel[211] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box227
		rightTrackModel[212] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box228
		rightTrackModel[213] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box229
		rightTrackModel[214] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box230
		rightTrackModel[215] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box231
		rightTrackModel[216] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box232
		rightTrackModel[217] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box233
		rightTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box234
		rightTrackModel[219] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box235
		rightTrackModel[220] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box236
		rightTrackModel[221] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box237
		rightTrackModel[222] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box238
		rightTrackModel[223] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box239
		rightTrackModel[224] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box240
		rightTrackModel[225] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box241
		rightTrackModel[226] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box242
		rightTrackModel[227] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box243
		rightTrackModel[228] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box244
		rightTrackModel[229] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box245
		rightTrackModel[230] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box246
		rightTrackModel[231] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box247
		rightTrackModel[232] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box248
		rightTrackModel[233] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box249
		rightTrackModel[234] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box250
		rightTrackModel[235] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box251
		rightTrackModel[236] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box252
		rightTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box253
		rightTrackModel[238] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box254
		rightTrackModel[239] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box255
		rightTrackModel[240] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box256
		rightTrackModel[241] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box257
		rightTrackModel[242] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box258
		rightTrackModel[243] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box259
		rightTrackModel[244] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box260
		rightTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box261
		rightTrackModel[246] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box262
		rightTrackModel[247] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box263
		rightTrackModel[248] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box264
		rightTrackModel[249] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box265
		rightTrackModel[250] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box266
		rightTrackModel[251] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box267
		rightTrackModel[252] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box268
		rightTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box269
		rightTrackModel[254] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box270
		rightTrackModel[255] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box271
		rightTrackModel[256] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box272
		rightTrackModel[257] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box273
		rightTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box274
		rightTrackModel[259] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box275
		rightTrackModel[260] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box276
		rightTrackModel[261] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box277
		rightTrackModel[262] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box278
		rightTrackModel[263] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box279
		rightTrackModel[264] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box280
		rightTrackModel[265] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box281
		rightTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box282
		rightTrackModel[267] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box283
		rightTrackModel[268] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box284
		rightTrackModel[269] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box285
		rightTrackModel[270] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box286
		rightTrackModel[271] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box287
		rightTrackModel[272] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box288
		rightTrackModel[273] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box289
		rightTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box290
		rightTrackModel[275] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box291
		rightTrackModel[276] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box292
		rightTrackModel[277] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box293
		rightTrackModel[278] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box294
		rightTrackModel[279] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box295
		rightTrackModel[280] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box296
		rightTrackModel[281] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box297
		rightTrackModel[282] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box298
		rightTrackModel[283] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box299
		rightTrackModel[284] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box300
		rightTrackModel[285] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box301
		rightTrackModel[286] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box302
		rightTrackModel[287] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box303
		rightTrackModel[288] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box304
		rightTrackModel[289] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box305
		rightTrackModel[290] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box306
		rightTrackModel[291] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box307
		rightTrackModel[292] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box308
		rightTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box309
		rightTrackModel[294] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box310
		rightTrackModel[295] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box311
		rightTrackModel[296] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box312
		rightTrackModel[297] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box313
		rightTrackModel[298] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box314
		rightTrackModel[299] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box315
		rightTrackModel[300] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box316
		rightTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box317
		rightTrackModel[302] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box318
		rightTrackModel[303] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box319
		rightTrackModel[304] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box320
		rightTrackModel[305] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box321
		rightTrackModel[306] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box322
		rightTrackModel[307] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box323
		rightTrackModel[308] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box324
		rightTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box325
		rightTrackModel[310] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box326
		rightTrackModel[311] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box327
		rightTrackModel[312] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box328
		rightTrackModel[313] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box329
		rightTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box330
		rightTrackModel[315] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box331
		rightTrackModel[316] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box332
		rightTrackModel[317] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box333
		rightTrackModel[318] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box334
		rightTrackModel[319] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box335
		rightTrackModel[320] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box336
		rightTrackModel[321] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box337
		rightTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box338
		rightTrackModel[323] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box339
		rightTrackModel[324] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box340
		rightTrackModel[325] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box341
		rightTrackModel[326] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box342
		rightTrackModel[327] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box343
		rightTrackModel[328] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box344
		rightTrackModel[329] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box345
		rightTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box346
		rightTrackModel[331] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box347
		rightTrackModel[332] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box348
		rightTrackModel[333] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box349
		rightTrackModel[334] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box350
		rightTrackModel[335] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box351
		rightTrackModel[336] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box352
		rightTrackModel[337] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box353
		rightTrackModel[338] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box354
		rightTrackModel[339] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box355
		rightTrackModel[340] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box356
		rightTrackModel[341] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box357
		rightTrackModel[342] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box358
		rightTrackModel[343] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box359
		rightTrackModel[344] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box360
		rightTrackModel[345] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box361
		rightTrackModel[346] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box362
		rightTrackModel[347] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box363
		rightTrackModel[348] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box364
		rightTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box365
		rightTrackModel[350] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box366
		rightTrackModel[351] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box367
		rightTrackModel[352] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box368
		rightTrackModel[353] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box369
		rightTrackModel[354] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box370
		rightTrackModel[355] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box371
		rightTrackModel[356] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box372
		rightTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box373
		rightTrackModel[358] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box374
		rightTrackModel[359] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box375
		rightTrackModel[360] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box376
		rightTrackModel[361] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box377
		rightTrackModel[362] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box378
		rightTrackModel[363] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box379
		rightTrackModel[364] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box380
		rightTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box381
		rightTrackModel[366] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box382
		rightTrackModel[367] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box383
		rightTrackModel[368] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box384
		rightTrackModel[369] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box385
		rightTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box386
		rightTrackModel[371] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box387
		rightTrackModel[372] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box388
		rightTrackModel[373] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box389
		rightTrackModel[374] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box390
		rightTrackModel[375] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box391
		rightTrackModel[376] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box392
		rightTrackModel[377] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box393
		rightTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box394
		rightTrackModel[379] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box395
		rightTrackModel[380] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box396
		rightTrackModel[381] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box397
		rightTrackModel[382] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box398
		rightTrackModel[383] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box399
		rightTrackModel[384] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box400
		rightTrackModel[385] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box401
		rightTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box402
		rightTrackModel[387] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box403
		rightTrackModel[388] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box404
		rightTrackModel[389] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box405
		rightTrackModel[390] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box406
		rightTrackModel[391] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box407
		rightTrackModel[392] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box408
		rightTrackModel[393] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box409
		rightTrackModel[394] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box410
		rightTrackModel[395] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box411
		rightTrackModel[396] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box412
		rightTrackModel[397] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box413
		rightTrackModel[398] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box414
		rightTrackModel[399] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box415
		rightTrackModel[400] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box416
		rightTrackModel[401] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box417
		rightTrackModel[402] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box418
		rightTrackModel[403] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box419
		rightTrackModel[404] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box420
		rightTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box421
		rightTrackModel[406] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box422
		rightTrackModel[407] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box423
		rightTrackModel[408] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box424
		rightTrackModel[409] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box425
		rightTrackModel[410] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box426
		rightTrackModel[411] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box427
		rightTrackModel[412] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box428
		rightTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box429
		rightTrackModel[414] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box430
		rightTrackModel[415] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box431
		rightTrackModel[416] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box432
		rightTrackModel[417] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box433
		rightTrackModel[418] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box434
		rightTrackModel[419] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box435
		rightTrackModel[420] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box436
		rightTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box437
		rightTrackModel[422] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box438
		rightTrackModel[423] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box439
		rightTrackModel[424] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box440
		rightTrackModel[425] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box441
		rightTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box442
		rightTrackModel[427] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box443
		rightTrackModel[428] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box444
		rightTrackModel[429] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box445
		rightTrackModel[430] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box446
		rightTrackModel[431] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box447
		rightTrackModel[432] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box448
		rightTrackModel[433] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box449
		rightTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box450
		rightTrackModel[435] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box451
		rightTrackModel[436] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box452
		rightTrackModel[437] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box453
		rightTrackModel[438] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box454
		rightTrackModel[439] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box455
		rightTrackModel[440] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box456
		rightTrackModel[441] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box457
		rightTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box458
		rightTrackModel[443] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box459
		rightTrackModel[444] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box460
		rightTrackModel[445] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box461
		rightTrackModel[446] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box462
		rightTrackModel[447] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box463
		rightTrackModel[448] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box464
		rightTrackModel[449] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box465
		rightTrackModel[450] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box466
		rightTrackModel[451] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box467
		rightTrackModel[452] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box468
		rightTrackModel[453] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box469
		rightTrackModel[454] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box470
		rightTrackModel[455] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box471
		rightTrackModel[456] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box472
		rightTrackModel[457] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box473
		rightTrackModel[458] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box474
		rightTrackModel[459] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box475
		rightTrackModel[460] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box476
		rightTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box477
		rightTrackModel[462] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box478
		rightTrackModel[463] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box479
		rightTrackModel[464] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box480
		rightTrackModel[465] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box481
		rightTrackModel[466] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box482
		rightTrackModel[467] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box483
		rightTrackModel[468] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box484
		rightTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box485
		rightTrackModel[470] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box486
		rightTrackModel[471] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box487
		rightTrackModel[472] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box488
		rightTrackModel[473] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box489
		rightTrackModel[474] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box490
		rightTrackModel[475] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box491
		rightTrackModel[476] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box492
		rightTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box493
		rightTrackModel[478] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box494
		rightTrackModel[479] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box495
		rightTrackModel[480] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box496
		rightTrackModel[481] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box497
		rightTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box498
		rightTrackModel[483] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box499
		rightTrackModel[484] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box500
		rightTrackModel[485] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box501
		rightTrackModel[486] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box502
		rightTrackModel[487] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box503
		rightTrackModel[488] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box504
		rightTrackModel[489] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box505
		rightTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box506
		rightTrackModel[491] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box507
		rightTrackModel[492] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box508
		rightTrackModel[493] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box509
		rightTrackModel[494] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box510
		rightTrackModel[495] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box511
		rightTrackModel[496] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box512
		rightTrackModel[497] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box513
		rightTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box514
		rightTrackModel[499] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box515

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox502
		rightTrackModel[0].setRotationPoint(45F, -6F, -26.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox503
		rightTrackModel[1].setRotationPoint(45F, -8F, -26.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox504
		rightTrackModel[2].setRotationPoint(46F, -9F, -26.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox505
		rightTrackModel[3].setRotationPoint(45F, -3F, -26.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox506
		rightTrackModel[4].setRotationPoint(46F, -1F, -26.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox507
		rightTrackModel[5].setRotationPoint(35F, -1F, -26.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox508
		rightTrackModel[6].setRotationPoint(34F, 0F, -26.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox509
		rightTrackModel[7].setRotationPoint(34F, 2F, -26.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox510
		rightTrackModel[8].setRotationPoint(34F, 5F, -26.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox511
		rightTrackModel[9].setRotationPoint(35F, 7F, -26.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox512
		rightTrackModel[10].setRotationPoint(22F, -1F, -26.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox513
		rightTrackModel[11].setRotationPoint(21F, 0F, -26.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox514
		rightTrackModel[12].setRotationPoint(21F, 2F, -26.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox515
		rightTrackModel[13].setRotationPoint(21F, 5F, -26.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox516
		rightTrackModel[14].setRotationPoint(22F, 7F, -26.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox517
		rightTrackModel[15].setRotationPoint(9F, -1F, -26.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox518
		rightTrackModel[16].setRotationPoint(8F, 0F, -26.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox519
		rightTrackModel[17].setRotationPoint(8F, 2F, -26.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox520
		rightTrackModel[18].setRotationPoint(8F, 5F, -26.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox521
		rightTrackModel[19].setRotationPoint(9F, 7F, -26.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox522
		rightTrackModel[20].setRotationPoint(-40F, -1F, -26.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox523
		rightTrackModel[21].setRotationPoint(-41F, 0F, -26.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox524
		rightTrackModel[22].setRotationPoint(-41F, 2F, -26.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox525
		rightTrackModel[23].setRotationPoint(-41F, 5F, -26.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox526
		rightTrackModel[24].setRotationPoint(-40F, 7F, -26.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox527
		rightTrackModel[25].setRotationPoint(-27F, -1F, -26.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox528
		rightTrackModel[26].setRotationPoint(-28F, 0F, -26.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox529
		rightTrackModel[27].setRotationPoint(-28F, 2F, -26.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox530
		rightTrackModel[28].setRotationPoint(-28F, 5F, -26.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox531
		rightTrackModel[29].setRotationPoint(-27F, 7F, -26.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox532
		rightTrackModel[30].setRotationPoint(-14F, -1F, -26.5F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox533
		rightTrackModel[31].setRotationPoint(-15F, 0F, -26.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox534
		rightTrackModel[32].setRotationPoint(-15F, 2F, -26.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox535
		rightTrackModel[33].setRotationPoint(-15F, 5F, -26.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox536
		rightTrackModel[34].setRotationPoint(-14F, 7F, -26.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox537
		rightTrackModel[35].setRotationPoint(-48F, -1F, -26.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox538
		rightTrackModel[36].setRotationPoint(-49F, -6F, -26.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox539
		rightTrackModel[37].setRotationPoint(-49F, -3F, -26.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox540
		rightTrackModel[38].setRotationPoint(-49F, -8F, -26.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox541
		rightTrackModel[39].setRotationPoint(-48F, -9F, -26.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox542
		rightTrackModel[40].setRotationPoint(-2.5F, -1F, -26.5F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox543
		rightTrackModel[41].setRotationPoint(-3.5F, 0F, -26.5F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox544
		rightTrackModel[42].setRotationPoint(-3.5F, 2F, -26.5F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox545
		rightTrackModel[43].setRotationPoint(-3.5F, 5F, -26.5F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox546
		rightTrackModel[44].setRotationPoint(-2.5F, 7F, -26.5F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		rightTrackModel[45].setRotationPoint(48F, -10F, -27.5F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		rightTrackModel[46].setRotationPoint(48F, -10F, -19.5F);

		rightTrackModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		rightTrackModel[47].setRotationPoint(48F, -10F, -27.5F);

		rightTrackModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box48
		rightTrackModel[48].setRotationPoint(48F, -10F, -19.5F);

		rightTrackModel[49].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		rightTrackModel[49].setRotationPoint(48F, -10F, -28.5F);

		rightTrackModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box50
		rightTrackModel[50].setRotationPoint(48F, -10F, -23.5F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		rightTrackModel[51].setRotationPoint(48F, -10F, -24.5F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		rightTrackModel[52].setRotationPoint(48F, -10F, -21.5F);

		rightTrackModel[53].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		rightTrackModel[53].setRotationPoint(51F, -10F, -28.5F);
		rightTrackModel[53].rotateAngleZ = -0.40142573F;

		rightTrackModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		rightTrackModel[54].setRotationPoint(51F, -10F, -27.5F);
		rightTrackModel[54].rotateAngleZ = -0.40142573F;

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		rightTrackModel[55].setRotationPoint(51F, -10F, -27.5F);
		rightTrackModel[55].rotateAngleZ = -0.40142573F;

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		rightTrackModel[56].setRotationPoint(51F, -10F, -24.5F);
		rightTrackModel[56].rotateAngleZ = -0.40142573F;

		rightTrackModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box65
		rightTrackModel[57].setRotationPoint(51F, -10F, -23.5F);
		rightTrackModel[57].rotateAngleZ = -0.40142573F;

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		rightTrackModel[58].setRotationPoint(51F, -10F, -21.5F);
		rightTrackModel[58].rotateAngleZ = -0.40142573F;

		rightTrackModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box67
		rightTrackModel[59].setRotationPoint(51F, -10F, -19.5F);
		rightTrackModel[59].rotateAngleZ = -0.40142573F;

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		rightTrackModel[60].setRotationPoint(51F, -10F, -19.5F);
		rightTrackModel[60].rotateAngleZ = -0.40142573F;

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		rightTrackModel[61].setRotationPoint(53.7F, -8.8F, -27.5F);
		rightTrackModel[61].rotateAngleZ = -1.02974426F;

		rightTrackModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		rightTrackModel[62].setRotationPoint(53.7F, -8.8F, -27.5F);
		rightTrackModel[62].rotateAngleZ = -1.02974426F;

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		rightTrackModel[63].setRotationPoint(53.7F, -8.8F, -24.5F);
		rightTrackModel[63].rotateAngleZ = -1.02974426F;

		rightTrackModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box80
		rightTrackModel[64].setRotationPoint(53.7F, -8.8F, -23.5F);
		rightTrackModel[64].rotateAngleZ = -1.02974426F;

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightTrackModel[65].setRotationPoint(53.7F, -8.8F, -21.5F);
		rightTrackModel[65].rotateAngleZ = -1.02974426F;

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		rightTrackModel[66].setRotationPoint(53.7F, -8.8F, -19.5F);
		rightTrackModel[66].rotateAngleZ = -1.02974426F;

		rightTrackModel[67].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box83
		rightTrackModel[67].setRotationPoint(53.7F, -8.8F, -19.5F);
		rightTrackModel[67].rotateAngleZ = -1.02974426F;

		rightTrackModel[68].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		rightTrackModel[68].setRotationPoint(53.7F, -8.8F, -28.5F);
		rightTrackModel[68].rotateAngleZ = -1.02974426F;

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		rightTrackModel[69].setRotationPoint(55.25F, -6.25F, -27.5F);
		rightTrackModel[69].rotateAngleZ = -1.57079633F;

		rightTrackModel[70].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		rightTrackModel[70].setRotationPoint(55.25F, -6.25F, -27.5F);
		rightTrackModel[70].rotateAngleZ = -1.57079633F;

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		rightTrackModel[71].setRotationPoint(55.25F, -6.25F, -24.5F);
		rightTrackModel[71].rotateAngleZ = -1.57079633F;

		rightTrackModel[72].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box88
		rightTrackModel[72].setRotationPoint(55.25F, -6.25F, -23.5F);
		rightTrackModel[72].rotateAngleZ = -1.57079633F;

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		rightTrackModel[73].setRotationPoint(55.25F, -6.25F, -21.5F);
		rightTrackModel[73].rotateAngleZ = -1.57079633F;

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		rightTrackModel[74].setRotationPoint(55.25F, -6.25F, -19.5F);
		rightTrackModel[74].rotateAngleZ = -1.57079633F;

		rightTrackModel[75].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box91
		rightTrackModel[75].setRotationPoint(55.25F, -6.25F, -19.5F);
		rightTrackModel[75].rotateAngleZ = -1.57079633F;

		rightTrackModel[76].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		rightTrackModel[76].setRotationPoint(55.25F, -6.25F, -28.5F);
		rightTrackModel[76].rotateAngleZ = -1.57079633F;

		rightTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		rightTrackModel[77].setRotationPoint(55.25F, -3.25F, -27.5F);
		rightTrackModel[77].rotateAngleZ = -2.07694181F;

		rightTrackModel[78].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		rightTrackModel[78].setRotationPoint(55.25F, -3.25F, -27.5F);
		rightTrackModel[78].rotateAngleZ = -2.07694181F;

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		rightTrackModel[79].setRotationPoint(55.25F, -3.25F, -24.5F);
		rightTrackModel[79].rotateAngleZ = -2.07694181F;

		rightTrackModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box96
		rightTrackModel[80].setRotationPoint(55.25F, -3.25F, -23.5F);
		rightTrackModel[80].rotateAngleZ = -2.07694181F;

		rightTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		rightTrackModel[81].setRotationPoint(55.25F, -3.25F, -21.5F);
		rightTrackModel[81].rotateAngleZ = -2.07694181F;

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		rightTrackModel[82].setRotationPoint(55.25F, -3.25F, -19.5F);
		rightTrackModel[82].rotateAngleZ = -2.07694181F;

		rightTrackModel[83].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box99
		rightTrackModel[83].setRotationPoint(55.25F, -3.25F, -19.5F);
		rightTrackModel[83].rotateAngleZ = -2.07694181F;

		rightTrackModel[84].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		rightTrackModel[84].setRotationPoint(55.25F, -3.25F, -28.5F);
		rightTrackModel[84].rotateAngleZ = -2.07694181F;

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		rightTrackModel[85].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[85].rotateAngleZ = -2.47836754F;

		rightTrackModel[86].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		rightTrackModel[86].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[86].rotateAngleZ = -2.47836754F;

		rightTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		rightTrackModel[87].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[87].rotateAngleZ = -2.47836754F;

		rightTrackModel[88].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box104
		rightTrackModel[88].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[88].rotateAngleZ = -2.47836754F;

		rightTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		rightTrackModel[89].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[89].rotateAngleZ = -2.47836754F;

		rightTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		rightTrackModel[90].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[90].rotateAngleZ = -2.47836754F;

		rightTrackModel[91].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box107
		rightTrackModel[91].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[91].rotateAngleZ = -2.47836754F;

		rightTrackModel[92].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		rightTrackModel[92].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[92].rotateAngleZ = -2.47836754F;

		rightTrackModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		rightTrackModel[93].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[93].rotateAngleZ = -2.47836754F;

		rightTrackModel[94].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		rightTrackModel[94].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[94].rotateAngleZ = -2.47836754F;

		rightTrackModel[95].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		rightTrackModel[95].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[95].rotateAngleZ = -2.47836754F;

		rightTrackModel[96].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box112
		rightTrackModel[96].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[96].rotateAngleZ = -2.47836754F;

		rightTrackModel[97].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		rightTrackModel[97].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[97].rotateAngleZ = -2.47836754F;

		rightTrackModel[98].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
		rightTrackModel[98].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[98].rotateAngleZ = -2.47836754F;

		rightTrackModel[99].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box115
		rightTrackModel[99].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[99].rotateAngleZ = -2.47836754F;

		rightTrackModel[100].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		rightTrackModel[100].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[100].rotateAngleZ = -2.47836754F;

		rightTrackModel[101].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		rightTrackModel[101].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[101].rotateAngleZ = -2.47836754F;

		rightTrackModel[102].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		rightTrackModel[102].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[102].rotateAngleZ = -2.47836754F;

		rightTrackModel[103].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		rightTrackModel[103].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[103].rotateAngleZ = -2.47836754F;

		rightTrackModel[104].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box120
		rightTrackModel[104].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[104].rotateAngleZ = -2.47836754F;

		rightTrackModel[105].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		rightTrackModel[105].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[105].rotateAngleZ = -2.47836754F;

		rightTrackModel[106].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		rightTrackModel[106].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[106].rotateAngleZ = -2.47836754F;

		rightTrackModel[107].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box123
		rightTrackModel[107].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[107].rotateAngleZ = -2.47836754F;

		rightTrackModel[108].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		rightTrackModel[108].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[108].rotateAngleZ = -2.47836754F;

		rightTrackModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		rightTrackModel[109].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[109].rotateAngleZ = -2.47836754F;

		rightTrackModel[110].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		rightTrackModel[110].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[110].rotateAngleZ = -2.47836754F;

		rightTrackModel[111].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box127
		rightTrackModel[111].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[111].rotateAngleZ = -2.47836754F;

		rightTrackModel[112].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box128
		rightTrackModel[112].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[112].rotateAngleZ = -2.47836754F;

		rightTrackModel[113].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		rightTrackModel[113].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[113].rotateAngleZ = -2.47836754F;

		rightTrackModel[114].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		rightTrackModel[114].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[114].rotateAngleZ = -2.47836754F;

		rightTrackModel[115].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box131
		rightTrackModel[115].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[115].rotateAngleZ = -2.47836754F;

		rightTrackModel[116].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		rightTrackModel[116].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[116].rotateAngleZ = -2.47836754F;

		rightTrackModel[117].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		rightTrackModel[117].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[117].rotateAngleZ = -2.47836754F;

		rightTrackModel[118].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		rightTrackModel[118].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[118].rotateAngleZ = -2.47836754F;

		rightTrackModel[119].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		rightTrackModel[119].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[119].rotateAngleZ = -2.47836754F;

		rightTrackModel[120].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box136
		rightTrackModel[120].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[120].rotateAngleZ = -2.47836754F;

		rightTrackModel[121].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		rightTrackModel[121].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[121].rotateAngleZ = -2.47836754F;

		rightTrackModel[122].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		rightTrackModel[122].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[122].rotateAngleZ = -2.47836754F;

		rightTrackModel[123].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box139
		rightTrackModel[123].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[123].rotateAngleZ = -2.47836754F;

		rightTrackModel[124].addShapeBox(14F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		rightTrackModel[124].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[124].rotateAngleZ = -2.47836754F;

		rightTrackModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		rightTrackModel[125].setRotationPoint(43.5F, 8.8F, -27.5F);
		rightTrackModel[125].rotateAngleZ = -3.08923278F;

		rightTrackModel[126].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		rightTrackModel[126].setRotationPoint(43.5F, 8.8F, -27.5F);
		rightTrackModel[126].rotateAngleZ = -3.08923278F;

		rightTrackModel[127].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		rightTrackModel[127].setRotationPoint(43.5F, 8.8F, -24.5F);
		rightTrackModel[127].rotateAngleZ = -3.08923278F;

		rightTrackModel[128].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box144
		rightTrackModel[128].setRotationPoint(43.5F, 8.8F, -23.5F);
		rightTrackModel[128].rotateAngleZ = -3.08923278F;

		rightTrackModel[129].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		rightTrackModel[129].setRotationPoint(43.5F, 8.8F, -21.5F);
		rightTrackModel[129].rotateAngleZ = -3.08923278F;

		rightTrackModel[130].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		rightTrackModel[130].setRotationPoint(43.5F, 8.8F, -19.5F);
		rightTrackModel[130].rotateAngleZ = -3.08923278F;

		rightTrackModel[131].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box147
		rightTrackModel[131].setRotationPoint(43.5F, 8.8F, -19.5F);
		rightTrackModel[131].rotateAngleZ = -3.08923278F;

		rightTrackModel[132].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		rightTrackModel[132].setRotationPoint(43.5F, 8.8F, -28.5F);
		rightTrackModel[132].rotateAngleZ = -3.08923278F;

		rightTrackModel[133].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		rightTrackModel[133].setRotationPoint(40.5F, 9F, -27.5F);
		rightTrackModel[133].rotateAngleZ = -3.14159265F;

		rightTrackModel[134].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		rightTrackModel[134].setRotationPoint(40.5F, 9F, -27.5F);
		rightTrackModel[134].rotateAngleZ = -3.14159265F;

		rightTrackModel[135].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		rightTrackModel[135].setRotationPoint(40.5F, 9F, -24.5F);
		rightTrackModel[135].rotateAngleZ = -3.14159265F;

		rightTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box152
		rightTrackModel[136].setRotationPoint(40.5F, 9F, -23.5F);
		rightTrackModel[136].rotateAngleZ = -3.14159265F;

		rightTrackModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		rightTrackModel[137].setRotationPoint(40.5F, 9F, -21.5F);
		rightTrackModel[137].rotateAngleZ = -3.14159265F;

		rightTrackModel[138].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		rightTrackModel[138].setRotationPoint(40.5F, 9F, -19.5F);
		rightTrackModel[138].rotateAngleZ = -3.14159265F;

		rightTrackModel[139].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box155
		rightTrackModel[139].setRotationPoint(40.5F, 9F, -19.5F);
		rightTrackModel[139].rotateAngleZ = -3.14159265F;

		rightTrackModel[140].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		rightTrackModel[140].setRotationPoint(40.5F, 9F, -28.5F);
		rightTrackModel[140].rotateAngleZ = -3.14159265F;

		rightTrackModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		rightTrackModel[141].setRotationPoint(37.5F, 9F, -27.5F);
		rightTrackModel[141].rotateAngleZ = -3.14159265F;

		rightTrackModel[142].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		rightTrackModel[142].setRotationPoint(37.5F, 9F, -27.5F);
		rightTrackModel[142].rotateAngleZ = -3.14159265F;

		rightTrackModel[143].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		rightTrackModel[143].setRotationPoint(37.5F, 9F, -24.5F);
		rightTrackModel[143].rotateAngleZ = -3.14159265F;

		rightTrackModel[144].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box160
		rightTrackModel[144].setRotationPoint(37.5F, 9F, -23.5F);
		rightTrackModel[144].rotateAngleZ = -3.14159265F;

		rightTrackModel[145].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		rightTrackModel[145].setRotationPoint(37.5F, 9F, -21.5F);
		rightTrackModel[145].rotateAngleZ = -3.14159265F;

		rightTrackModel[146].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		rightTrackModel[146].setRotationPoint(37.5F, 9F, -19.5F);
		rightTrackModel[146].rotateAngleZ = -3.14159265F;

		rightTrackModel[147].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box163
		rightTrackModel[147].setRotationPoint(37.5F, 9F, -19.5F);
		rightTrackModel[147].rotateAngleZ = -3.14159265F;

		rightTrackModel[148].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		rightTrackModel[148].setRotationPoint(37.5F, 9F, -28.5F);
		rightTrackModel[148].rotateAngleZ = -3.14159265F;

		rightTrackModel[149].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		rightTrackModel[149].setRotationPoint(34.5F, 9F, -27.5F);
		rightTrackModel[149].rotateAngleZ = -3.14159265F;

		rightTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		rightTrackModel[150].setRotationPoint(34.5F, 9F, -27.5F);
		rightTrackModel[150].rotateAngleZ = -3.14159265F;

		rightTrackModel[151].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		rightTrackModel[151].setRotationPoint(34.5F, 9F, -24.5F);
		rightTrackModel[151].rotateAngleZ = -3.14159265F;

		rightTrackModel[152].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box168
		rightTrackModel[152].setRotationPoint(34.5F, 9F, -23.5F);
		rightTrackModel[152].rotateAngleZ = -3.14159265F;

		rightTrackModel[153].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		rightTrackModel[153].setRotationPoint(34.5F, 9F, -21.5F);
		rightTrackModel[153].rotateAngleZ = -3.14159265F;

		rightTrackModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		rightTrackModel[154].setRotationPoint(34.5F, 9F, -19.5F);
		rightTrackModel[154].rotateAngleZ = -3.14159265F;

		rightTrackModel[155].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box171
		rightTrackModel[155].setRotationPoint(34.5F, 9F, -19.5F);
		rightTrackModel[155].rotateAngleZ = -3.14159265F;

		rightTrackModel[156].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		rightTrackModel[156].setRotationPoint(34.5F, 9F, -28.5F);
		rightTrackModel[156].rotateAngleZ = -3.14159265F;

		rightTrackModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		rightTrackModel[157].setRotationPoint(31.5F, 9F, -27.5F);
		rightTrackModel[157].rotateAngleZ = -3.14159265F;

		rightTrackModel[158].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		rightTrackModel[158].setRotationPoint(31.5F, 9F, -27.5F);
		rightTrackModel[158].rotateAngleZ = -3.14159265F;

		rightTrackModel[159].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		rightTrackModel[159].setRotationPoint(31.5F, 9F, -24.5F);
		rightTrackModel[159].rotateAngleZ = -3.14159265F;

		rightTrackModel[160].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box176
		rightTrackModel[160].setRotationPoint(31.5F, 9F, -23.5F);
		rightTrackModel[160].rotateAngleZ = -3.14159265F;

		rightTrackModel[161].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		rightTrackModel[161].setRotationPoint(31.5F, 9F, -21.5F);
		rightTrackModel[161].rotateAngleZ = -3.14159265F;

		rightTrackModel[162].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		rightTrackModel[162].setRotationPoint(31.5F, 9F, -19.5F);
		rightTrackModel[162].rotateAngleZ = -3.14159265F;

		rightTrackModel[163].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box179
		rightTrackModel[163].setRotationPoint(31.5F, 9F, -19.5F);
		rightTrackModel[163].rotateAngleZ = -3.14159265F;

		rightTrackModel[164].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		rightTrackModel[164].setRotationPoint(31.5F, 9F, -28.5F);
		rightTrackModel[164].rotateAngleZ = -3.14159265F;

		rightTrackModel[165].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		rightTrackModel[165].setRotationPoint(28.5F, 9F, -27.5F);
		rightTrackModel[165].rotateAngleZ = -3.14159265F;

		rightTrackModel[166].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		rightTrackModel[166].setRotationPoint(28.5F, 9F, -27.5F);
		rightTrackModel[166].rotateAngleZ = -3.14159265F;

		rightTrackModel[167].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		rightTrackModel[167].setRotationPoint(28.5F, 9F, -24.5F);
		rightTrackModel[167].rotateAngleZ = -3.14159265F;

		rightTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box184
		rightTrackModel[168].setRotationPoint(28.5F, 9F, -23.5F);
		rightTrackModel[168].rotateAngleZ = -3.14159265F;

		rightTrackModel[169].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		rightTrackModel[169].setRotationPoint(28.5F, 9F, -21.5F);
		rightTrackModel[169].rotateAngleZ = -3.14159265F;

		rightTrackModel[170].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		rightTrackModel[170].setRotationPoint(28.5F, 9F, -19.5F);
		rightTrackModel[170].rotateAngleZ = -3.14159265F;

		rightTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box187
		rightTrackModel[171].setRotationPoint(28.5F, 9F, -19.5F);
		rightTrackModel[171].rotateAngleZ = -3.14159265F;

		rightTrackModel[172].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		rightTrackModel[172].setRotationPoint(28.5F, 9F, -28.5F);
		rightTrackModel[172].rotateAngleZ = -3.14159265F;

		rightTrackModel[173].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		rightTrackModel[173].setRotationPoint(25.5F, 9F, -27.5F);
		rightTrackModel[173].rotateAngleZ = -3.14159265F;

		rightTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		rightTrackModel[174].setRotationPoint(25.5F, 9F, -27.5F);
		rightTrackModel[174].rotateAngleZ = -3.14159265F;

		rightTrackModel[175].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		rightTrackModel[175].setRotationPoint(25.5F, 9F, -24.5F);
		rightTrackModel[175].rotateAngleZ = -3.14159265F;

		rightTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box192
		rightTrackModel[176].setRotationPoint(25.5F, 9F, -23.5F);
		rightTrackModel[176].rotateAngleZ = -3.14159265F;

		rightTrackModel[177].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		rightTrackModel[177].setRotationPoint(25.5F, 9F, -21.5F);
		rightTrackModel[177].rotateAngleZ = -3.14159265F;

		rightTrackModel[178].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		rightTrackModel[178].setRotationPoint(25.5F, 9F, -19.5F);
		rightTrackModel[178].rotateAngleZ = -3.14159265F;

		rightTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box195
		rightTrackModel[179].setRotationPoint(25.5F, 9F, -19.5F);
		rightTrackModel[179].rotateAngleZ = -3.14159265F;

		rightTrackModel[180].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		rightTrackModel[180].setRotationPoint(25.5F, 9F, -28.5F);
		rightTrackModel[180].rotateAngleZ = -3.14159265F;

		rightTrackModel[181].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		rightTrackModel[181].setRotationPoint(22.5F, 9F, -27.5F);
		rightTrackModel[181].rotateAngleZ = -3.14159265F;

		rightTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		rightTrackModel[182].setRotationPoint(22.5F, 9F, -27.5F);
		rightTrackModel[182].rotateAngleZ = -3.14159265F;

		rightTrackModel[183].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		rightTrackModel[183].setRotationPoint(22.5F, 9F, -24.5F);
		rightTrackModel[183].rotateAngleZ = -3.14159265F;

		rightTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box200
		rightTrackModel[184].setRotationPoint(22.5F, 9F, -23.5F);
		rightTrackModel[184].rotateAngleZ = -3.14159265F;

		rightTrackModel[185].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		rightTrackModel[185].setRotationPoint(22.5F, 9F, -21.5F);
		rightTrackModel[185].rotateAngleZ = -3.14159265F;

		rightTrackModel[186].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		rightTrackModel[186].setRotationPoint(22.5F, 9F, -19.5F);
		rightTrackModel[186].rotateAngleZ = -3.14159265F;

		rightTrackModel[187].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box203
		rightTrackModel[187].setRotationPoint(22.5F, 9F, -19.5F);
		rightTrackModel[187].rotateAngleZ = -3.14159265F;

		rightTrackModel[188].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		rightTrackModel[188].setRotationPoint(22.5F, 9F, -28.5F);
		rightTrackModel[188].rotateAngleZ = -3.14159265F;

		rightTrackModel[189].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		rightTrackModel[189].setRotationPoint(19.5F, 9F, -27.5F);
		rightTrackModel[189].rotateAngleZ = -3.14159265F;

		rightTrackModel[190].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		rightTrackModel[190].setRotationPoint(19.5F, 9F, -27.5F);
		rightTrackModel[190].rotateAngleZ = -3.14159265F;

		rightTrackModel[191].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		rightTrackModel[191].setRotationPoint(19.5F, 9F, -24.5F);
		rightTrackModel[191].rotateAngleZ = -3.14159265F;

		rightTrackModel[192].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box208
		rightTrackModel[192].setRotationPoint(19.5F, 9F, -23.5F);
		rightTrackModel[192].rotateAngleZ = -3.14159265F;

		rightTrackModel[193].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		rightTrackModel[193].setRotationPoint(19.5F, 9F, -21.5F);
		rightTrackModel[193].rotateAngleZ = -3.14159265F;

		rightTrackModel[194].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		rightTrackModel[194].setRotationPoint(19.5F, 9F, -19.5F);
		rightTrackModel[194].rotateAngleZ = -3.14159265F;

		rightTrackModel[195].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box211
		rightTrackModel[195].setRotationPoint(19.5F, 9F, -19.5F);
		rightTrackModel[195].rotateAngleZ = -3.14159265F;

		rightTrackModel[196].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		rightTrackModel[196].setRotationPoint(19.5F, 9F, -28.5F);
		rightTrackModel[196].rotateAngleZ = -3.14159265F;

		rightTrackModel[197].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		rightTrackModel[197].setRotationPoint(16.5F, 9F, -27.5F);
		rightTrackModel[197].rotateAngleZ = -3.14159265F;

		rightTrackModel[198].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box214
		rightTrackModel[198].setRotationPoint(16.5F, 9F, -27.5F);
		rightTrackModel[198].rotateAngleZ = -3.14159265F;

		rightTrackModel[199].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		rightTrackModel[199].setRotationPoint(16.5F, 9F, -24.5F);
		rightTrackModel[199].rotateAngleZ = -3.14159265F;

		rightTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box216
		rightTrackModel[200].setRotationPoint(16.5F, 9F, -23.5F);
		rightTrackModel[200].rotateAngleZ = -3.14159265F;

		rightTrackModel[201].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		rightTrackModel[201].setRotationPoint(16.5F, 9F, -21.5F);
		rightTrackModel[201].rotateAngleZ = -3.14159265F;

		rightTrackModel[202].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		rightTrackModel[202].setRotationPoint(16.5F, 9F, -19.5F);
		rightTrackModel[202].rotateAngleZ = -3.14159265F;

		rightTrackModel[203].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box219
		rightTrackModel[203].setRotationPoint(16.5F, 9F, -19.5F);
		rightTrackModel[203].rotateAngleZ = -3.14159265F;

		rightTrackModel[204].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		rightTrackModel[204].setRotationPoint(16.5F, 9F, -28.5F);
		rightTrackModel[204].rotateAngleZ = -3.14159265F;

		rightTrackModel[205].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		rightTrackModel[205].setRotationPoint(13.5F, 9F, -27.5F);
		rightTrackModel[205].rotateAngleZ = -3.14159265F;

		rightTrackModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		rightTrackModel[206].setRotationPoint(13.5F, 9F, -27.5F);
		rightTrackModel[206].rotateAngleZ = -3.14159265F;

		rightTrackModel[207].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box223
		rightTrackModel[207].setRotationPoint(13.5F, 9F, -24.5F);
		rightTrackModel[207].rotateAngleZ = -3.14159265F;

		rightTrackModel[208].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box224
		rightTrackModel[208].setRotationPoint(13.5F, 9F, -23.5F);
		rightTrackModel[208].rotateAngleZ = -3.14159265F;

		rightTrackModel[209].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box225
		rightTrackModel[209].setRotationPoint(13.5F, 9F, -21.5F);
		rightTrackModel[209].rotateAngleZ = -3.14159265F;

		rightTrackModel[210].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		rightTrackModel[210].setRotationPoint(13.5F, 9F, -19.5F);
		rightTrackModel[210].rotateAngleZ = -3.14159265F;

		rightTrackModel[211].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box227
		rightTrackModel[211].setRotationPoint(13.5F, 9F, -19.5F);
		rightTrackModel[211].rotateAngleZ = -3.14159265F;

		rightTrackModel[212].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box228
		rightTrackModel[212].setRotationPoint(13.5F, 9F, -28.5F);
		rightTrackModel[212].rotateAngleZ = -3.14159265F;

		rightTrackModel[213].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box229
		rightTrackModel[213].setRotationPoint(10.5F, 9F, -27.5F);
		rightTrackModel[213].rotateAngleZ = -3.14159265F;

		rightTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box230
		rightTrackModel[214].setRotationPoint(10.5F, 9F, -27.5F);
		rightTrackModel[214].rotateAngleZ = -3.14159265F;

		rightTrackModel[215].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box231
		rightTrackModel[215].setRotationPoint(10.5F, 9F, -24.5F);
		rightTrackModel[215].rotateAngleZ = -3.14159265F;

		rightTrackModel[216].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box232
		rightTrackModel[216].setRotationPoint(10.5F, 9F, -23.5F);
		rightTrackModel[216].rotateAngleZ = -3.14159265F;

		rightTrackModel[217].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		rightTrackModel[217].setRotationPoint(10.5F, 9F, -21.5F);
		rightTrackModel[217].rotateAngleZ = -3.14159265F;

		rightTrackModel[218].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		rightTrackModel[218].setRotationPoint(10.5F, 9F, -19.5F);
		rightTrackModel[218].rotateAngleZ = -3.14159265F;

		rightTrackModel[219].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box235
		rightTrackModel[219].setRotationPoint(10.5F, 9F, -19.5F);
		rightTrackModel[219].rotateAngleZ = -3.14159265F;

		rightTrackModel[220].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box236
		rightTrackModel[220].setRotationPoint(10.5F, 9F, -28.5F);
		rightTrackModel[220].rotateAngleZ = -3.14159265F;

		rightTrackModel[221].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box237
		rightTrackModel[221].setRotationPoint(7.5F, 9F, -27.5F);
		rightTrackModel[221].rotateAngleZ = -3.14159265F;

		rightTrackModel[222].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box238
		rightTrackModel[222].setRotationPoint(7.5F, 9F, -27.5F);
		rightTrackModel[222].rotateAngleZ = -3.14159265F;

		rightTrackModel[223].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		rightTrackModel[223].setRotationPoint(7.5F, 9F, -24.5F);
		rightTrackModel[223].rotateAngleZ = -3.14159265F;

		rightTrackModel[224].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box240
		rightTrackModel[224].setRotationPoint(7.5F, 9F, -23.5F);
		rightTrackModel[224].rotateAngleZ = -3.14159265F;

		rightTrackModel[225].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box241
		rightTrackModel[225].setRotationPoint(7.5F, 9F, -21.5F);
		rightTrackModel[225].rotateAngleZ = -3.14159265F;

		rightTrackModel[226].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box242
		rightTrackModel[226].setRotationPoint(7.5F, 9F, -19.5F);
		rightTrackModel[226].rotateAngleZ = -3.14159265F;

		rightTrackModel[227].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box243
		rightTrackModel[227].setRotationPoint(7.5F, 9F, -19.5F);
		rightTrackModel[227].rotateAngleZ = -3.14159265F;

		rightTrackModel[228].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box244
		rightTrackModel[228].setRotationPoint(7.5F, 9F, -28.5F);
		rightTrackModel[228].rotateAngleZ = -3.14159265F;

		rightTrackModel[229].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box245
		rightTrackModel[229].setRotationPoint(4.5F, 9F, -27.5F);
		rightTrackModel[229].rotateAngleZ = -3.14159265F;

		rightTrackModel[230].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box246
		rightTrackModel[230].setRotationPoint(4.5F, 9F, -27.5F);
		rightTrackModel[230].rotateAngleZ = -3.14159265F;

		rightTrackModel[231].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box247
		rightTrackModel[231].setRotationPoint(4.5F, 9F, -24.5F);
		rightTrackModel[231].rotateAngleZ = -3.14159265F;

		rightTrackModel[232].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box248
		rightTrackModel[232].setRotationPoint(4.5F, 9F, -23.5F);
		rightTrackModel[232].rotateAngleZ = -3.14159265F;

		rightTrackModel[233].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		rightTrackModel[233].setRotationPoint(4.5F, 9F, -21.5F);
		rightTrackModel[233].rotateAngleZ = -3.14159265F;

		rightTrackModel[234].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
		rightTrackModel[234].setRotationPoint(4.5F, 9F, -19.5F);
		rightTrackModel[234].rotateAngleZ = -3.14159265F;

		rightTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box251
		rightTrackModel[235].setRotationPoint(4.5F, 9F, -19.5F);
		rightTrackModel[235].rotateAngleZ = -3.14159265F;

		rightTrackModel[236].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box252
		rightTrackModel[236].setRotationPoint(4.5F, 9F, -28.5F);
		rightTrackModel[236].rotateAngleZ = -3.14159265F;

		rightTrackModel[237].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box253
		rightTrackModel[237].setRotationPoint(1.5F, 9F, -27.5F);
		rightTrackModel[237].rotateAngleZ = -3.14159265F;

		rightTrackModel[238].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box254
		rightTrackModel[238].setRotationPoint(1.5F, 9F, -27.5F);
		rightTrackModel[238].rotateAngleZ = -3.14159265F;

		rightTrackModel[239].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box255
		rightTrackModel[239].setRotationPoint(1.5F, 9F, -24.5F);
		rightTrackModel[239].rotateAngleZ = -3.14159265F;

		rightTrackModel[240].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box256
		rightTrackModel[240].setRotationPoint(1.5F, 9F, -23.5F);
		rightTrackModel[240].rotateAngleZ = -3.14159265F;

		rightTrackModel[241].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box257
		rightTrackModel[241].setRotationPoint(1.5F, 9F, -21.5F);
		rightTrackModel[241].rotateAngleZ = -3.14159265F;

		rightTrackModel[242].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box258
		rightTrackModel[242].setRotationPoint(1.5F, 9F, -19.5F);
		rightTrackModel[242].rotateAngleZ = -3.14159265F;

		rightTrackModel[243].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box259
		rightTrackModel[243].setRotationPoint(1.5F, 9F, -19.5F);
		rightTrackModel[243].rotateAngleZ = -3.14159265F;

		rightTrackModel[244].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box260
		rightTrackModel[244].setRotationPoint(1.5F, 9F, -28.5F);
		rightTrackModel[244].rotateAngleZ = -3.14159265F;

		rightTrackModel[245].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		rightTrackModel[245].setRotationPoint(-1.5F, 9F, -27.5F);
		rightTrackModel[245].rotateAngleZ = -3.14159265F;

		rightTrackModel[246].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		rightTrackModel[246].setRotationPoint(-1.5F, 9F, -27.5F);
		rightTrackModel[246].rotateAngleZ = -3.14159265F;

		rightTrackModel[247].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box263
		rightTrackModel[247].setRotationPoint(-1.5F, 9F, -24.5F);
		rightTrackModel[247].rotateAngleZ = -3.14159265F;

		rightTrackModel[248].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box264
		rightTrackModel[248].setRotationPoint(-1.5F, 9F, -23.5F);
		rightTrackModel[248].rotateAngleZ = -3.14159265F;

		rightTrackModel[249].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box265
		rightTrackModel[249].setRotationPoint(-1.5F, 9F, -21.5F);
		rightTrackModel[249].rotateAngleZ = -3.14159265F;

		rightTrackModel[250].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box266
		rightTrackModel[250].setRotationPoint(-1.5F, 9F, -19.5F);
		rightTrackModel[250].rotateAngleZ = -3.14159265F;

		rightTrackModel[251].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box267
		rightTrackModel[251].setRotationPoint(-1.5F, 9F, -19.5F);
		rightTrackModel[251].rotateAngleZ = -3.14159265F;

		rightTrackModel[252].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box268
		rightTrackModel[252].setRotationPoint(-1.5F, 9F, -28.5F);
		rightTrackModel[252].rotateAngleZ = -3.14159265F;

		rightTrackModel[253].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box269
		rightTrackModel[253].setRotationPoint(-4.5F, 9F, -27.5F);
		rightTrackModel[253].rotateAngleZ = -3.14159265F;

		rightTrackModel[254].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box270
		rightTrackModel[254].setRotationPoint(-4.5F, 9F, -27.5F);
		rightTrackModel[254].rotateAngleZ = -3.14159265F;

		rightTrackModel[255].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box271
		rightTrackModel[255].setRotationPoint(-4.5F, 9F, -24.5F);
		rightTrackModel[255].rotateAngleZ = -3.14159265F;

		rightTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box272
		rightTrackModel[256].setRotationPoint(-4.5F, 9F, -23.5F);
		rightTrackModel[256].rotateAngleZ = -3.14159265F;

		rightTrackModel[257].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box273
		rightTrackModel[257].setRotationPoint(-4.5F, 9F, -21.5F);
		rightTrackModel[257].rotateAngleZ = -3.14159265F;

		rightTrackModel[258].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box274
		rightTrackModel[258].setRotationPoint(-4.5F, 9F, -19.5F);
		rightTrackModel[258].rotateAngleZ = -3.14159265F;

		rightTrackModel[259].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box275
		rightTrackModel[259].setRotationPoint(-4.5F, 9F, -19.5F);
		rightTrackModel[259].rotateAngleZ = -3.14159265F;

		rightTrackModel[260].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box276
		rightTrackModel[260].setRotationPoint(-4.5F, 9F, -28.5F);
		rightTrackModel[260].rotateAngleZ = -3.14159265F;

		rightTrackModel[261].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box277
		rightTrackModel[261].setRotationPoint(-7.5F, 9F, -27.5F);
		rightTrackModel[261].rotateAngleZ = -3.14159265F;

		rightTrackModel[262].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box278
		rightTrackModel[262].setRotationPoint(-7.5F, 9F, -27.5F);
		rightTrackModel[262].rotateAngleZ = -3.14159265F;

		rightTrackModel[263].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box279
		rightTrackModel[263].setRotationPoint(-7.5F, 9F, -24.5F);
		rightTrackModel[263].rotateAngleZ = -3.14159265F;

		rightTrackModel[264].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box280
		rightTrackModel[264].setRotationPoint(-7.5F, 9F, -23.5F);
		rightTrackModel[264].rotateAngleZ = -3.14159265F;

		rightTrackModel[265].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box281
		rightTrackModel[265].setRotationPoint(-7.5F, 9F, -21.5F);
		rightTrackModel[265].rotateAngleZ = -3.14159265F;

		rightTrackModel[266].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box282
		rightTrackModel[266].setRotationPoint(-7.5F, 9F, -19.5F);
		rightTrackModel[266].rotateAngleZ = -3.14159265F;

		rightTrackModel[267].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box283
		rightTrackModel[267].setRotationPoint(-7.5F, 9F, -19.5F);
		rightTrackModel[267].rotateAngleZ = -3.14159265F;

		rightTrackModel[268].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box284
		rightTrackModel[268].setRotationPoint(-7.5F, 9F, -28.5F);
		rightTrackModel[268].rotateAngleZ = -3.14159265F;

		rightTrackModel[269].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box285
		rightTrackModel[269].setRotationPoint(-10.5F, 9F, -27.5F);
		rightTrackModel[269].rotateAngleZ = -3.14159265F;

		rightTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box286
		rightTrackModel[270].setRotationPoint(-10.5F, 9F, -27.5F);
		rightTrackModel[270].rotateAngleZ = -3.14159265F;

		rightTrackModel[271].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		rightTrackModel[271].setRotationPoint(-10.5F, 9F, -24.5F);
		rightTrackModel[271].rotateAngleZ = -3.14159265F;

		rightTrackModel[272].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box288
		rightTrackModel[272].setRotationPoint(-10.5F, 9F, -23.5F);
		rightTrackModel[272].rotateAngleZ = -3.14159265F;

		rightTrackModel[273].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box289
		rightTrackModel[273].setRotationPoint(-10.5F, 9F, -21.5F);
		rightTrackModel[273].rotateAngleZ = -3.14159265F;

		rightTrackModel[274].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		rightTrackModel[274].setRotationPoint(-10.5F, 9F, -19.5F);
		rightTrackModel[274].rotateAngleZ = -3.14159265F;

		rightTrackModel[275].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box291
		rightTrackModel[275].setRotationPoint(-10.5F, 9F, -19.5F);
		rightTrackModel[275].rotateAngleZ = -3.14159265F;

		rightTrackModel[276].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		rightTrackModel[276].setRotationPoint(-10.5F, 9F, -28.5F);
		rightTrackModel[276].rotateAngleZ = -3.14159265F;

		rightTrackModel[277].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		rightTrackModel[277].setRotationPoint(-13.5F, 9F, -27.5F);
		rightTrackModel[277].rotateAngleZ = -3.14159265F;

		rightTrackModel[278].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		rightTrackModel[278].setRotationPoint(-13.5F, 9F, -27.5F);
		rightTrackModel[278].rotateAngleZ = -3.14159265F;

		rightTrackModel[279].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		rightTrackModel[279].setRotationPoint(-13.5F, 9F, -24.5F);
		rightTrackModel[279].rotateAngleZ = -3.14159265F;

		rightTrackModel[280].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box296
		rightTrackModel[280].setRotationPoint(-13.5F, 9F, -23.5F);
		rightTrackModel[280].rotateAngleZ = -3.14159265F;

		rightTrackModel[281].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		rightTrackModel[281].setRotationPoint(-13.5F, 9F, -21.5F);
		rightTrackModel[281].rotateAngleZ = -3.14159265F;

		rightTrackModel[282].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box298
		rightTrackModel[282].setRotationPoint(-13.5F, 9F, -19.5F);
		rightTrackModel[282].rotateAngleZ = -3.14159265F;

		rightTrackModel[283].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box299
		rightTrackModel[283].setRotationPoint(-13.5F, 9F, -19.5F);
		rightTrackModel[283].rotateAngleZ = -3.14159265F;

		rightTrackModel[284].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box300
		rightTrackModel[284].setRotationPoint(-13.5F, 9F, -28.5F);
		rightTrackModel[284].rotateAngleZ = -3.14159265F;

		rightTrackModel[285].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box301
		rightTrackModel[285].setRotationPoint(-16.5F, 9F, -27.5F);
		rightTrackModel[285].rotateAngleZ = -3.14159265F;

		rightTrackModel[286].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box302
		rightTrackModel[286].setRotationPoint(-16.5F, 9F, -27.5F);
		rightTrackModel[286].rotateAngleZ = -3.14159265F;

		rightTrackModel[287].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box303
		rightTrackModel[287].setRotationPoint(-16.5F, 9F, -24.5F);
		rightTrackModel[287].rotateAngleZ = -3.14159265F;

		rightTrackModel[288].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box304
		rightTrackModel[288].setRotationPoint(-16.5F, 9F, -23.5F);
		rightTrackModel[288].rotateAngleZ = -3.14159265F;

		rightTrackModel[289].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box305
		rightTrackModel[289].setRotationPoint(-16.5F, 9F, -21.5F);
		rightTrackModel[289].rotateAngleZ = -3.14159265F;

		rightTrackModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box306
		rightTrackModel[290].setRotationPoint(-16.5F, 9F, -19.5F);
		rightTrackModel[290].rotateAngleZ = -3.14159265F;

		rightTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box307
		rightTrackModel[291].setRotationPoint(-16.5F, 9F, -19.5F);
		rightTrackModel[291].rotateAngleZ = -3.14159265F;

		rightTrackModel[292].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box308
		rightTrackModel[292].setRotationPoint(-16.5F, 9F, -28.5F);
		rightTrackModel[292].rotateAngleZ = -3.14159265F;

		rightTrackModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box309
		rightTrackModel[293].setRotationPoint(-19.5F, 9F, -27.5F);
		rightTrackModel[293].rotateAngleZ = -3.14159265F;

		rightTrackModel[294].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box310
		rightTrackModel[294].setRotationPoint(-19.5F, 9F, -27.5F);
		rightTrackModel[294].rotateAngleZ = -3.14159265F;

		rightTrackModel[295].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box311
		rightTrackModel[295].setRotationPoint(-19.5F, 9F, -24.5F);
		rightTrackModel[295].rotateAngleZ = -3.14159265F;

		rightTrackModel[296].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box312
		rightTrackModel[296].setRotationPoint(-19.5F, 9F, -23.5F);
		rightTrackModel[296].rotateAngleZ = -3.14159265F;

		rightTrackModel[297].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box313
		rightTrackModel[297].setRotationPoint(-19.5F, 9F, -21.5F);
		rightTrackModel[297].rotateAngleZ = -3.14159265F;

		rightTrackModel[298].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		rightTrackModel[298].setRotationPoint(-19.5F, 9F, -19.5F);
		rightTrackModel[298].rotateAngleZ = -3.14159265F;

		rightTrackModel[299].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box315
		rightTrackModel[299].setRotationPoint(-19.5F, 9F, -19.5F);
		rightTrackModel[299].rotateAngleZ = -3.14159265F;

		rightTrackModel[300].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		rightTrackModel[300].setRotationPoint(-19.5F, 9F, -28.5F);
		rightTrackModel[300].rotateAngleZ = -3.14159265F;

		rightTrackModel[301].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box317
		rightTrackModel[301].setRotationPoint(-22.5F, 9F, -27.5F);
		rightTrackModel[301].rotateAngleZ = -3.14159265F;

		rightTrackModel[302].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		rightTrackModel[302].setRotationPoint(-22.5F, 9F, -27.5F);
		rightTrackModel[302].rotateAngleZ = -3.14159265F;

		rightTrackModel[303].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box319
		rightTrackModel[303].setRotationPoint(-22.5F, 9F, -24.5F);
		rightTrackModel[303].rotateAngleZ = -3.14159265F;

		rightTrackModel[304].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box320
		rightTrackModel[304].setRotationPoint(-22.5F, 9F, -23.5F);
		rightTrackModel[304].rotateAngleZ = -3.14159265F;

		rightTrackModel[305].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box321
		rightTrackModel[305].setRotationPoint(-22.5F, 9F, -21.5F);
		rightTrackModel[305].rotateAngleZ = -3.14159265F;

		rightTrackModel[306].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		rightTrackModel[306].setRotationPoint(-22.5F, 9F, -19.5F);
		rightTrackModel[306].rotateAngleZ = -3.14159265F;

		rightTrackModel[307].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box323
		rightTrackModel[307].setRotationPoint(-22.5F, 9F, -19.5F);
		rightTrackModel[307].rotateAngleZ = -3.14159265F;

		rightTrackModel[308].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		rightTrackModel[308].setRotationPoint(-22.5F, 9F, -28.5F);
		rightTrackModel[308].rotateAngleZ = -3.14159265F;

		rightTrackModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box325
		rightTrackModel[309].setRotationPoint(-26.5F, 9F, -27.5F);
		rightTrackModel[309].rotateAngleZ = -3.14159265F;

		rightTrackModel[310].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		rightTrackModel[310].setRotationPoint(-26.5F, 9F, -27.5F);
		rightTrackModel[310].rotateAngleZ = -3.14159265F;

		rightTrackModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		rightTrackModel[311].setRotationPoint(-26.5F, 9F, -24.5F);
		rightTrackModel[311].rotateAngleZ = -3.14159265F;

		rightTrackModel[312].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box328
		rightTrackModel[312].setRotationPoint(-26.5F, 9F, -23.5F);
		rightTrackModel[312].rotateAngleZ = -3.14159265F;

		rightTrackModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box329
		rightTrackModel[313].setRotationPoint(-26.5F, 9F, -21.5F);
		rightTrackModel[313].rotateAngleZ = -3.14159265F;

		rightTrackModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box330
		rightTrackModel[314].setRotationPoint(-26.5F, 9F, -19.5F);
		rightTrackModel[314].rotateAngleZ = -3.14159265F;

		rightTrackModel[315].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box331
		rightTrackModel[315].setRotationPoint(-26.5F, 9F, -19.5F);
		rightTrackModel[315].rotateAngleZ = -3.14159265F;

		rightTrackModel[316].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box332
		rightTrackModel[316].setRotationPoint(-26.5F, 9F, -28.5F);
		rightTrackModel[316].rotateAngleZ = -3.14159265F;

		rightTrackModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box333
		rightTrackModel[317].setRotationPoint(-29.5F, 9F, -27.5F);
		rightTrackModel[317].rotateAngleZ = -3.14159265F;

		rightTrackModel[318].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box334
		rightTrackModel[318].setRotationPoint(-29.5F, 9F, -27.5F);
		rightTrackModel[318].rotateAngleZ = -3.14159265F;

		rightTrackModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box335
		rightTrackModel[319].setRotationPoint(-29.5F, 9F, -24.5F);
		rightTrackModel[319].rotateAngleZ = -3.14159265F;

		rightTrackModel[320].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box336
		rightTrackModel[320].setRotationPoint(-29.5F, 9F, -23.5F);
		rightTrackModel[320].rotateAngleZ = -3.14159265F;

		rightTrackModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box337
		rightTrackModel[321].setRotationPoint(-29.5F, 9F, -21.5F);
		rightTrackModel[321].rotateAngleZ = -3.14159265F;

		rightTrackModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box338
		rightTrackModel[322].setRotationPoint(-29.5F, 9F, -19.5F);
		rightTrackModel[322].rotateAngleZ = -3.14159265F;

		rightTrackModel[323].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box339
		rightTrackModel[323].setRotationPoint(-29.5F, 9F, -19.5F);
		rightTrackModel[323].rotateAngleZ = -3.14159265F;

		rightTrackModel[324].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box340
		rightTrackModel[324].setRotationPoint(-29.5F, 9F, -28.5F);
		rightTrackModel[324].rotateAngleZ = -3.14159265F;

		rightTrackModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box341
		rightTrackModel[325].setRotationPoint(-32.5F, 9F, -27.5F);
		rightTrackModel[325].rotateAngleZ = -3.14159265F;

		rightTrackModel[326].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box342
		rightTrackModel[326].setRotationPoint(-32.5F, 9F, -27.5F);
		rightTrackModel[326].rotateAngleZ = -3.14159265F;

		rightTrackModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box343
		rightTrackModel[327].setRotationPoint(-32.5F, 9F, -24.5F);
		rightTrackModel[327].rotateAngleZ = -3.14159265F;

		rightTrackModel[328].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box344
		rightTrackModel[328].setRotationPoint(-32.5F, 9F, -23.5F);
		rightTrackModel[328].rotateAngleZ = -3.14159265F;

		rightTrackModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box345
		rightTrackModel[329].setRotationPoint(-32.5F, 9F, -21.5F);
		rightTrackModel[329].rotateAngleZ = -3.14159265F;

		rightTrackModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box346
		rightTrackModel[330].setRotationPoint(-32.5F, 9F, -19.5F);
		rightTrackModel[330].rotateAngleZ = -3.14159265F;

		rightTrackModel[331].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box347
		rightTrackModel[331].setRotationPoint(-32.5F, 9F, -19.5F);
		rightTrackModel[331].rotateAngleZ = -3.14159265F;

		rightTrackModel[332].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box348
		rightTrackModel[332].setRotationPoint(-32.5F, 9F, -28.5F);
		rightTrackModel[332].rotateAngleZ = -3.14159265F;

		rightTrackModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		rightTrackModel[333].setRotationPoint(-35.5F, 9F, -27.5F);
		rightTrackModel[333].rotateAngleZ = -3.14159265F;

		rightTrackModel[334].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box350
		rightTrackModel[334].setRotationPoint(-35.5F, 9F, -27.5F);
		rightTrackModel[334].rotateAngleZ = -3.14159265F;

		rightTrackModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box351
		rightTrackModel[335].setRotationPoint(-35.5F, 9F, -24.5F);
		rightTrackModel[335].rotateAngleZ = -3.14159265F;

		rightTrackModel[336].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box352
		rightTrackModel[336].setRotationPoint(-35.5F, 9F, -23.5F);
		rightTrackModel[336].rotateAngleZ = -3.14159265F;

		rightTrackModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		rightTrackModel[337].setRotationPoint(-35.5F, 9F, -21.5F);
		rightTrackModel[337].rotateAngleZ = -3.14159265F;

		rightTrackModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		rightTrackModel[338].setRotationPoint(-35.5F, 9F, -19.5F);
		rightTrackModel[338].rotateAngleZ = -3.14159265F;

		rightTrackModel[339].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box355
		rightTrackModel[339].setRotationPoint(-35.5F, 9F, -19.5F);
		rightTrackModel[339].rotateAngleZ = -3.14159265F;

		rightTrackModel[340].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box356
		rightTrackModel[340].setRotationPoint(-35.5F, 9F, -28.5F);
		rightTrackModel[340].rotateAngleZ = -3.14159265F;

		rightTrackModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box357
		rightTrackModel[341].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[341].rotateAngleZ = -3.78736448F;

		rightTrackModel[342].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box358
		rightTrackModel[342].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[342].rotateAngleZ = -3.78736448F;

		rightTrackModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box359
		rightTrackModel[343].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[343].rotateAngleZ = -3.78736448F;

		rightTrackModel[344].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box360
		rightTrackModel[344].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[344].rotateAngleZ = -3.78736448F;

		rightTrackModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box361
		rightTrackModel[345].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[345].rotateAngleZ = -3.78736448F;

		rightTrackModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box362
		rightTrackModel[346].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[346].rotateAngleZ = -3.78736448F;

		rightTrackModel[347].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box363
		rightTrackModel[347].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[347].rotateAngleZ = -3.78736448F;

		rightTrackModel[348].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box364
		rightTrackModel[348].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[348].rotateAngleZ = -3.78736448F;

		rightTrackModel[349].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		rightTrackModel[349].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[349].rotateAngleZ = -3.78736448F;

		rightTrackModel[350].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box366
		rightTrackModel[350].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[350].rotateAngleZ = -3.78736448F;

		rightTrackModel[351].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box367
		rightTrackModel[351].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[351].rotateAngleZ = -3.78736448F;

		rightTrackModel[352].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box368
		rightTrackModel[352].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[352].rotateAngleZ = -3.78736448F;

		rightTrackModel[353].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box369
		rightTrackModel[353].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[353].rotateAngleZ = -3.78736448F;

		rightTrackModel[354].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box370
		rightTrackModel[354].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[354].rotateAngleZ = -3.78736448F;

		rightTrackModel[355].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box371
		rightTrackModel[355].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[355].rotateAngleZ = -3.78736448F;

		rightTrackModel[356].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box372
		rightTrackModel[356].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[356].rotateAngleZ = -3.78736448F;

		rightTrackModel[357].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box373
		rightTrackModel[357].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[357].rotateAngleZ = -3.78736448F;

		rightTrackModel[358].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box374
		rightTrackModel[358].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[358].rotateAngleZ = -3.78736448F;

		rightTrackModel[359].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box375
		rightTrackModel[359].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[359].rotateAngleZ = -3.78736448F;

		rightTrackModel[360].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box376
		rightTrackModel[360].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[360].rotateAngleZ = -3.78736448F;

		rightTrackModel[361].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box377
		rightTrackModel[361].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[361].rotateAngleZ = -3.78736448F;

		rightTrackModel[362].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box378
		rightTrackModel[362].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[362].rotateAngleZ = -3.78736448F;

		rightTrackModel[363].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box379
		rightTrackModel[363].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[363].rotateAngleZ = -3.78736448F;

		rightTrackModel[364].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box380
		rightTrackModel[364].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[364].rotateAngleZ = -3.78736448F;

		rightTrackModel[365].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box381
		rightTrackModel[365].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[365].rotateAngleZ = -3.78736448F;

		rightTrackModel[366].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box382
		rightTrackModel[366].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[366].rotateAngleZ = -3.78736448F;

		rightTrackModel[367].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box383
		rightTrackModel[367].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[367].rotateAngleZ = -3.78736448F;

		rightTrackModel[368].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box384
		rightTrackModel[368].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[368].rotateAngleZ = -3.78736448F;

		rightTrackModel[369].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box385
		rightTrackModel[369].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[369].rotateAngleZ = -3.78736448F;

		rightTrackModel[370].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box386
		rightTrackModel[370].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[370].rotateAngleZ = -3.78736448F;

		rightTrackModel[371].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box387
		rightTrackModel[371].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[371].rotateAngleZ = -3.78736448F;

		rightTrackModel[372].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box388
		rightTrackModel[372].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[372].rotateAngleZ = -3.78736448F;

		rightTrackModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box389
		rightTrackModel[373].setRotationPoint(-48F, 1.8F, -27.5F);
		rightTrackModel[373].rotateAngleZ = -4.1887902F;

		rightTrackModel[374].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box390
		rightTrackModel[374].setRotationPoint(-48F, 1.8F, -27.5F);
		rightTrackModel[374].rotateAngleZ = -4.1887902F;

		rightTrackModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box391
		rightTrackModel[375].setRotationPoint(-48F, 1.8F, -24.5F);
		rightTrackModel[375].rotateAngleZ = -4.1887902F;

		rightTrackModel[376].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box392
		rightTrackModel[376].setRotationPoint(-48F, 1.8F, -23.5F);
		rightTrackModel[376].rotateAngleZ = -4.1887902F;

		rightTrackModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box393
		rightTrackModel[377].setRotationPoint(-48F, 1.8F, -21.5F);
		rightTrackModel[377].rotateAngleZ = -4.1887902F;

		rightTrackModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box394
		rightTrackModel[378].setRotationPoint(-48F, 1.8F, -19.5F);
		rightTrackModel[378].rotateAngleZ = -4.1887902F;

		rightTrackModel[379].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box395
		rightTrackModel[379].setRotationPoint(-48F, 1.8F, -19.5F);
		rightTrackModel[379].rotateAngleZ = -4.1887902F;

		rightTrackModel[380].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box396
		rightTrackModel[380].setRotationPoint(-48F, 1.8F, -28.5F);
		rightTrackModel[380].rotateAngleZ = -4.1887902F;

		rightTrackModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box397
		rightTrackModel[381].setRotationPoint(-49.5F, -0.8F, -27.5F);
		rightTrackModel[381].rotateAngleZ = -4.52040276F;

		rightTrackModel[382].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box398
		rightTrackModel[382].setRotationPoint(-49.5F, -0.8F, -27.5F);
		rightTrackModel[382].rotateAngleZ = -4.52040276F;

		rightTrackModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box399
		rightTrackModel[383].setRotationPoint(-49.5F, -0.8F, -24.5F);
		rightTrackModel[383].rotateAngleZ = -4.52040276F;

		rightTrackModel[384].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box400
		rightTrackModel[384].setRotationPoint(-49.5F, -0.8F, -23.5F);
		rightTrackModel[384].rotateAngleZ = -4.52040276F;

		rightTrackModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box401
		rightTrackModel[385].setRotationPoint(-49.5F, -0.8F, -21.5F);
		rightTrackModel[385].rotateAngleZ = -4.52040276F;

		rightTrackModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box402
		rightTrackModel[386].setRotationPoint(-49.5F, -0.8F, -19.5F);
		rightTrackModel[386].rotateAngleZ = -4.52040276F;

		rightTrackModel[387].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box403
		rightTrackModel[387].setRotationPoint(-49.5F, -0.8F, -19.5F);
		rightTrackModel[387].rotateAngleZ = -4.52040276F;

		rightTrackModel[388].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box404
		rightTrackModel[388].setRotationPoint(-49.5F, -0.8F, -28.5F);
		rightTrackModel[388].rotateAngleZ = -4.52040276F;

		rightTrackModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		rightTrackModel[389].setRotationPoint(-50F, -3.6F, -27.5F);
		rightTrackModel[389].rotateAngleZ = -4.71238898F;

		rightTrackModel[390].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box406
		rightTrackModel[390].setRotationPoint(-50F, -3.6F, -27.5F);
		rightTrackModel[390].rotateAngleZ = -4.71238898F;

		rightTrackModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		rightTrackModel[391].setRotationPoint(-50F, -3.6F, -24.5F);
		rightTrackModel[391].rotateAngleZ = -4.71238898F;

		rightTrackModel[392].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box408
		rightTrackModel[392].setRotationPoint(-50F, -3.6F, -23.5F);
		rightTrackModel[392].rotateAngleZ = -4.71238898F;

		rightTrackModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		rightTrackModel[393].setRotationPoint(-50F, -3.6F, -21.5F);
		rightTrackModel[393].rotateAngleZ = -4.71238898F;

		rightTrackModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		rightTrackModel[394].setRotationPoint(-50F, -3.6F, -19.5F);
		rightTrackModel[394].rotateAngleZ = -4.71238898F;

		rightTrackModel[395].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box411
		rightTrackModel[395].setRotationPoint(-50F, -3.6F, -19.5F);
		rightTrackModel[395].rotateAngleZ = -4.71238898F;

		rightTrackModel[396].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box412
		rightTrackModel[396].setRotationPoint(-50F, -3.6F, -28.5F);
		rightTrackModel[396].rotateAngleZ = -4.71238898F;

		rightTrackModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		rightTrackModel[397].setRotationPoint(-50F, -6.6F, -27.5F);
		rightTrackModel[397].rotateAngleZ = -5.21853446F;

		rightTrackModel[398].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		rightTrackModel[398].setRotationPoint(-50F, -6.6F, -27.5F);
		rightTrackModel[398].rotateAngleZ = -5.21853446F;

		rightTrackModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box415
		rightTrackModel[399].setRotationPoint(-50F, -6.6F, -24.5F);
		rightTrackModel[399].rotateAngleZ = -5.21853446F;

		rightTrackModel[400].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box416
		rightTrackModel[400].setRotationPoint(-50F, -6.6F, -23.5F);
		rightTrackModel[400].rotateAngleZ = -5.21853446F;

		rightTrackModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box417
		rightTrackModel[401].setRotationPoint(-50F, -6.6F, -21.5F);
		rightTrackModel[401].rotateAngleZ = -5.21853446F;

		rightTrackModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
		rightTrackModel[402].setRotationPoint(-50F, -6.6F, -19.5F);
		rightTrackModel[402].rotateAngleZ = -5.21853446F;

		rightTrackModel[403].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box419
		rightTrackModel[403].setRotationPoint(-50F, -6.6F, -19.5F);
		rightTrackModel[403].rotateAngleZ = -5.21853446F;

		rightTrackModel[404].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		rightTrackModel[404].setRotationPoint(-50F, -6.6F, -28.5F);
		rightTrackModel[404].rotateAngleZ = -5.21853446F;

		rightTrackModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		rightTrackModel[405].setRotationPoint(-48.6F, -9.2F, -27.5F);
		rightTrackModel[405].rotateAngleZ = 0.2443461F;

		rightTrackModel[406].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		rightTrackModel[406].setRotationPoint(-48.6F, -9.2F, -27.5F);
		rightTrackModel[406].rotateAngleZ = 0.2443461F;

		rightTrackModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box423
		rightTrackModel[407].setRotationPoint(-48.6F, -9.2F, -24.5F);
		rightTrackModel[407].rotateAngleZ = 0.2443461F;

		rightTrackModel[408].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box424
		rightTrackModel[408].setRotationPoint(-48.6F, -9.2F, -23.5F);
		rightTrackModel[408].rotateAngleZ = 0.2443461F;

		rightTrackModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box425
		rightTrackModel[409].setRotationPoint(-48.6F, -9.2F, -21.5F);
		rightTrackModel[409].rotateAngleZ = 0.2443461F;

		rightTrackModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box426
		rightTrackModel[410].setRotationPoint(-48.6F, -9.2F, -19.5F);
		rightTrackModel[410].rotateAngleZ = 0.2443461F;

		rightTrackModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box427
		rightTrackModel[411].setRotationPoint(-48.6F, -9.2F, -19.5F);
		rightTrackModel[411].rotateAngleZ = 0.2443461F;

		rightTrackModel[412].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box428
		rightTrackModel[412].setRotationPoint(-48.6F, -9.2F, -28.5F);
		rightTrackModel[412].rotateAngleZ = 0.2443461F;

		rightTrackModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box429
		rightTrackModel[413].setRotationPoint(-46F, -10F, -27.5F);

		rightTrackModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box430
		rightTrackModel[414].setRotationPoint(-46F, -10F, -27.5F);

		rightTrackModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box431
		rightTrackModel[415].setRotationPoint(-46F, -10F, -24.5F);

		rightTrackModel[416].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box432
		rightTrackModel[416].setRotationPoint(-46F, -10F, -23.5F);

		rightTrackModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box433
		rightTrackModel[417].setRotationPoint(-46F, -10F, -21.5F);

		rightTrackModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box434
		rightTrackModel[418].setRotationPoint(-46F, -10F, -19.5F);

		rightTrackModel[419].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box435
		rightTrackModel[419].setRotationPoint(-46F, -10F, -19.5F);

		rightTrackModel[420].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box436
		rightTrackModel[420].setRotationPoint(-46F, -10F, -28.5F);

		rightTrackModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
		rightTrackModel[421].setRotationPoint(-43F, -10F, -27.5F);

		rightTrackModel[422].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box438
		rightTrackModel[422].setRotationPoint(-43F, -10F, -27.5F);

		rightTrackModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box439
		rightTrackModel[423].setRotationPoint(-43F, -10F, -24.5F);

		rightTrackModel[424].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box440
		rightTrackModel[424].setRotationPoint(-43F, -10F, -23.5F);

		rightTrackModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
		rightTrackModel[425].setRotationPoint(-43F, -10F, -21.5F);

		rightTrackModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box442
		rightTrackModel[426].setRotationPoint(-43F, -10F, -19.5F);

		rightTrackModel[427].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box443
		rightTrackModel[427].setRotationPoint(-43F, -10F, -19.5F);

		rightTrackModel[428].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		rightTrackModel[428].setRotationPoint(-43F, -10F, -28.5F);

		rightTrackModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box445
		rightTrackModel[429].setRotationPoint(-40F, -10F, -27.5F);

		rightTrackModel[430].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box446
		rightTrackModel[430].setRotationPoint(-40F, -10F, -27.5F);

		rightTrackModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box447
		rightTrackModel[431].setRotationPoint(-40F, -10F, -24.5F);

		rightTrackModel[432].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box448
		rightTrackModel[432].setRotationPoint(-40F, -10F, -23.5F);

		rightTrackModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box449
		rightTrackModel[433].setRotationPoint(-40F, -10F, -21.5F);

		rightTrackModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box450
		rightTrackModel[434].setRotationPoint(-40F, -10F, -19.5F);

		rightTrackModel[435].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box451
		rightTrackModel[435].setRotationPoint(-40F, -10F, -19.5F);

		rightTrackModel[436].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		rightTrackModel[436].setRotationPoint(-40F, -10F, -28.5F);

		rightTrackModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box453
		rightTrackModel[437].setRotationPoint(-37F, -10F, -27.5F);

		rightTrackModel[438].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box454
		rightTrackModel[438].setRotationPoint(-37F, -10F, -27.5F);

		rightTrackModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box455
		rightTrackModel[439].setRotationPoint(-37F, -10F, -24.5F);

		rightTrackModel[440].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box456
		rightTrackModel[440].setRotationPoint(-37F, -10F, -23.5F);

		rightTrackModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
		rightTrackModel[441].setRotationPoint(-37F, -10F, -21.5F);

		rightTrackModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box458
		rightTrackModel[442].setRotationPoint(-37F, -10F, -19.5F);

		rightTrackModel[443].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box459
		rightTrackModel[443].setRotationPoint(-37F, -10F, -19.5F);

		rightTrackModel[444].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box460
		rightTrackModel[444].setRotationPoint(-37F, -10F, -28.5F);

		rightTrackModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box461
		rightTrackModel[445].setRotationPoint(-34F, -10F, -27.5F);

		rightTrackModel[446].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box462
		rightTrackModel[446].setRotationPoint(-34F, -10F, -27.5F);

		rightTrackModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box463
		rightTrackModel[447].setRotationPoint(-34F, -10F, -24.5F);

		rightTrackModel[448].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box464
		rightTrackModel[448].setRotationPoint(-34F, -10F, -23.5F);

		rightTrackModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box465
		rightTrackModel[449].setRotationPoint(-34F, -10F, -21.5F);

		rightTrackModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box466
		rightTrackModel[450].setRotationPoint(-34F, -10F, -19.5F);

		rightTrackModel[451].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box467
		rightTrackModel[451].setRotationPoint(-34F, -10F, -19.5F);

		rightTrackModel[452].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box468
		rightTrackModel[452].setRotationPoint(-34F, -10F, -28.5F);

		rightTrackModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box469
		rightTrackModel[453].setRotationPoint(-31F, -10F, -27.5F);

		rightTrackModel[454].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box470
		rightTrackModel[454].setRotationPoint(-31F, -10F, -27.5F);

		rightTrackModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box471
		rightTrackModel[455].setRotationPoint(-31F, -10F, -24.5F);

		rightTrackModel[456].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box472
		rightTrackModel[456].setRotationPoint(-31F, -10F, -23.5F);

		rightTrackModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box473
		rightTrackModel[457].setRotationPoint(-31F, -10F, -21.5F);

		rightTrackModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box474
		rightTrackModel[458].setRotationPoint(-31F, -10F, -19.5F);

		rightTrackModel[459].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box475
		rightTrackModel[459].setRotationPoint(-31F, -10F, -19.5F);

		rightTrackModel[460].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box476
		rightTrackModel[460].setRotationPoint(-31F, -10F, -28.5F);

		rightTrackModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box477
		rightTrackModel[461].setRotationPoint(-28F, -10F, -27.5F);

		rightTrackModel[462].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box478
		rightTrackModel[462].setRotationPoint(-28F, -10F, -27.5F);

		rightTrackModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box479
		rightTrackModel[463].setRotationPoint(-28F, -10F, -24.5F);

		rightTrackModel[464].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box480
		rightTrackModel[464].setRotationPoint(-28F, -10F, -23.5F);

		rightTrackModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box481
		rightTrackModel[465].setRotationPoint(-28F, -10F, -21.5F);

		rightTrackModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box482
		rightTrackModel[466].setRotationPoint(-28F, -10F, -19.5F);

		rightTrackModel[467].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box483
		rightTrackModel[467].setRotationPoint(-28F, -10F, -19.5F);

		rightTrackModel[468].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box484
		rightTrackModel[468].setRotationPoint(-28F, -10F, -28.5F);

		rightTrackModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box485
		rightTrackModel[469].setRotationPoint(-25F, -10F, -27.5F);

		rightTrackModel[470].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box486
		rightTrackModel[470].setRotationPoint(-25F, -10F, -27.5F);

		rightTrackModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box487
		rightTrackModel[471].setRotationPoint(-25F, -10F, -24.5F);

		rightTrackModel[472].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box488
		rightTrackModel[472].setRotationPoint(-25F, -10F, -23.5F);

		rightTrackModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box489
		rightTrackModel[473].setRotationPoint(-25F, -10F, -21.5F);

		rightTrackModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box490
		rightTrackModel[474].setRotationPoint(-25F, -10F, -19.5F);

		rightTrackModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box491
		rightTrackModel[475].setRotationPoint(-25F, -10F, -19.5F);

		rightTrackModel[476].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box492
		rightTrackModel[476].setRotationPoint(-25F, -10F, -28.5F);

		rightTrackModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box493
		rightTrackModel[477].setRotationPoint(-22F, -10F, -27.5F);

		rightTrackModel[478].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box494
		rightTrackModel[478].setRotationPoint(-22F, -10F, -27.5F);

		rightTrackModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box495
		rightTrackModel[479].setRotationPoint(-22F, -10F, -24.5F);

		rightTrackModel[480].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box496
		rightTrackModel[480].setRotationPoint(-22F, -10F, -23.5F);

		rightTrackModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box497
		rightTrackModel[481].setRotationPoint(-22F, -10F, -21.5F);

		rightTrackModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box498
		rightTrackModel[482].setRotationPoint(-22F, -10F, -19.5F);

		rightTrackModel[483].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box499
		rightTrackModel[483].setRotationPoint(-22F, -10F, -19.5F);

		rightTrackModel[484].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box500
		rightTrackModel[484].setRotationPoint(-22F, -10F, -28.5F);

		rightTrackModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box501
		rightTrackModel[485].setRotationPoint(-19F, -10F, -27.5F);

		rightTrackModel[486].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box502
		rightTrackModel[486].setRotationPoint(-19F, -10F, -27.5F);

		rightTrackModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box503
		rightTrackModel[487].setRotationPoint(-19F, -10F, -24.5F);

		rightTrackModel[488].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box504
		rightTrackModel[488].setRotationPoint(-19F, -10F, -23.5F);

		rightTrackModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box505
		rightTrackModel[489].setRotationPoint(-19F, -10F, -21.5F);

		rightTrackModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box506
		rightTrackModel[490].setRotationPoint(-19F, -10F, -19.5F);

		rightTrackModel[491].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box507
		rightTrackModel[491].setRotationPoint(-19F, -10F, -19.5F);

		rightTrackModel[492].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box508
		rightTrackModel[492].setRotationPoint(-19F, -10F, -28.5F);

		rightTrackModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box509
		rightTrackModel[493].setRotationPoint(-16F, -10F, -27.5F);

		rightTrackModel[494].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box510
		rightTrackModel[494].setRotationPoint(-16F, -10F, -27.5F);

		rightTrackModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box511
		rightTrackModel[495].setRotationPoint(-16F, -10F, -24.5F);

		rightTrackModel[496].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box512
		rightTrackModel[496].setRotationPoint(-16F, -10F, -23.5F);

		rightTrackModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		rightTrackModel[497].setRotationPoint(-16F, -10F, -21.5F);

		rightTrackModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box514
		rightTrackModel[498].setRotationPoint(-16F, -10F, -19.5F);

		rightTrackModel[499].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box515
		rightTrackModel[499].setRotationPoint(-16F, -10F, -19.5F);
	}

	private void initrightTrackModel_2()
	{
		rightTrackModel[500] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box516
		rightTrackModel[501] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box517
		rightTrackModel[502] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box518
		rightTrackModel[503] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box519
		rightTrackModel[504] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box520
		rightTrackModel[505] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box521
		rightTrackModel[506] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box522
		rightTrackModel[507] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box523
		rightTrackModel[508] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box524
		rightTrackModel[509] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box525
		rightTrackModel[510] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box526
		rightTrackModel[511] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box527
		rightTrackModel[512] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box528
		rightTrackModel[513] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box529
		rightTrackModel[514] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box530
		rightTrackModel[515] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box531
		rightTrackModel[516] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box532
		rightTrackModel[517] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box533
		rightTrackModel[518] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box534
		rightTrackModel[519] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box535
		rightTrackModel[520] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box536
		rightTrackModel[521] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box537
		rightTrackModel[522] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box538
		rightTrackModel[523] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box539
		rightTrackModel[524] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box540
		rightTrackModel[525] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box541
		rightTrackModel[526] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box542
		rightTrackModel[527] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box543
		rightTrackModel[528] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box544
		rightTrackModel[529] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box545
		rightTrackModel[530] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box546
		rightTrackModel[531] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box547
		rightTrackModel[532] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box548
		rightTrackModel[533] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box549
		rightTrackModel[534] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box550
		rightTrackModel[535] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box551
		rightTrackModel[536] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box552
		rightTrackModel[537] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box553
		rightTrackModel[538] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box554
		rightTrackModel[539] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box555
		rightTrackModel[540] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box556
		rightTrackModel[541] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box557
		rightTrackModel[542] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box558
		rightTrackModel[543] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box559
		rightTrackModel[544] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box560
		rightTrackModel[545] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box561
		rightTrackModel[546] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box562
		rightTrackModel[547] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box563
		rightTrackModel[548] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box564
		rightTrackModel[549] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box565
		rightTrackModel[550] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box566
		rightTrackModel[551] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box567
		rightTrackModel[552] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box568
		rightTrackModel[553] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box569
		rightTrackModel[554] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box570
		rightTrackModel[555] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box571
		rightTrackModel[556] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box572
		rightTrackModel[557] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box573
		rightTrackModel[558] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box574
		rightTrackModel[559] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box575
		rightTrackModel[560] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box576
		rightTrackModel[561] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box577
		rightTrackModel[562] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box578
		rightTrackModel[563] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box579
		rightTrackModel[564] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box580
		rightTrackModel[565] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box581
		rightTrackModel[566] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box582
		rightTrackModel[567] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box583
		rightTrackModel[568] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box584
		rightTrackModel[569] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box585
		rightTrackModel[570] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box586
		rightTrackModel[571] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box587
		rightTrackModel[572] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box588
		rightTrackModel[573] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box589
		rightTrackModel[574] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box590
		rightTrackModel[575] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box591
		rightTrackModel[576] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box592
		rightTrackModel[577] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box593
		rightTrackModel[578] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box594
		rightTrackModel[579] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box595
		rightTrackModel[580] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box596
		rightTrackModel[581] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box597
		rightTrackModel[582] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box598
		rightTrackModel[583] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box599
		rightTrackModel[584] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box600
		rightTrackModel[585] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box601
		rightTrackModel[586] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box602
		rightTrackModel[587] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box603
		rightTrackModel[588] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box604
		rightTrackModel[589] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box605
		rightTrackModel[590] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box606
		rightTrackModel[591] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box607
		rightTrackModel[592] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box608
		rightTrackModel[593] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box609
		rightTrackModel[594] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box610
		rightTrackModel[595] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box611
		rightTrackModel[596] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box612
		rightTrackModel[597] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box613
		rightTrackModel[598] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box614
		rightTrackModel[599] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box615
		rightTrackModel[600] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box616
		rightTrackModel[601] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box617
		rightTrackModel[602] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box618
		rightTrackModel[603] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box619
		rightTrackModel[604] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box620
		rightTrackModel[605] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box621
		rightTrackModel[606] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box622
		rightTrackModel[607] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box623
		rightTrackModel[608] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box624
		rightTrackModel[609] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box625
		rightTrackModel[610] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box626
		rightTrackModel[611] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box627
		rightTrackModel[612] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box628
		rightTrackModel[613] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box629
		rightTrackModel[614] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box630
		rightTrackModel[615] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box631
		rightTrackModel[616] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box632
		rightTrackModel[617] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box633
		rightTrackModel[618] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box634
		rightTrackModel[619] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box635
		rightTrackModel[620] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box636
		rightTrackModel[621] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box637
		rightTrackModel[622] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box638
		rightTrackModel[623] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box639
		rightTrackModel[624] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box640
		rightTrackModel[625] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box641
		rightTrackModel[626] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box642
		rightTrackModel[627] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box643
		rightTrackModel[628] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box644
		rightTrackModel[629] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box645
		rightTrackModel[630] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box646
		rightTrackModel[631] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box647
		rightTrackModel[632] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box648
		rightTrackModel[633] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box649
		rightTrackModel[634] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box650
		rightTrackModel[635] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box651
		rightTrackModel[636] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box652
		rightTrackModel[637] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box653
		rightTrackModel[638] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box654
		rightTrackModel[639] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box655
		rightTrackModel[640] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box656
		rightTrackModel[641] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box657
		rightTrackModel[642] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box658
		rightTrackModel[643] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box659
		rightTrackModel[644] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box660
		rightTrackModel[645] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box661
		rightTrackModel[646] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box662
		rightTrackModel[647] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box663
		rightTrackModel[648] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box664
		rightTrackModel[649] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box665
		rightTrackModel[650] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box666
		rightTrackModel[651] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box667
		rightTrackModel[652] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box668
		rightTrackModel[653] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box669
		rightTrackModel[654] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box670
		rightTrackModel[655] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box671
		rightTrackModel[656] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import Box672
		rightTrackModel[657] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import Box673
		rightTrackModel[658] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import Box674
		rightTrackModel[659] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import Box675
		rightTrackModel[660] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import Box676
		rightTrackModel[661] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1835
		rightTrackModel[662] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1836
		rightTrackModel[663] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1837
		rightTrackModel[664] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1838
		rightTrackModel[665] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1839
		rightTrackModel[666] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1840
		rightTrackModel[667] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1841
		rightTrackModel[668] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1842
		rightTrackModel[669] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1851
		rightTrackModel[670] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1853
		rightTrackModel[671] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1854
		rightTrackModel[672] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1855
		rightTrackModel[673] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1856
		rightTrackModel[674] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1857
		rightTrackModel[675] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1858
		rightTrackModel[676] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1859
		rightTrackModel[677] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1860
		rightTrackModel[678] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1870
		rightTrackModel[679] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1871
		rightTrackModel[680] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1872
		rightTrackModel[681] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1873
		rightTrackModel[682] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1874
		rightTrackModel[683] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1875
		rightTrackModel[684] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1876
		rightTrackModel[685] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1877
		rightTrackModel[686] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1878
		rightTrackModel[687] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1888
		rightTrackModel[688] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1889
		rightTrackModel[689] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1890
		rightTrackModel[690] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1891
		rightTrackModel[691] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1892
		rightTrackModel[692] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1893
		rightTrackModel[693] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1894
		rightTrackModel[694] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1895
		rightTrackModel[695] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1896
		rightTrackModel[696] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1906
		rightTrackModel[697] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1907
		rightTrackModel[698] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1908
		rightTrackModel[699] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1909
		rightTrackModel[700] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1910
		rightTrackModel[701] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1911
		rightTrackModel[702] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1912
		rightTrackModel[703] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1913
		rightTrackModel[704] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1914
		rightTrackModel[705] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1924
		rightTrackModel[706] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1925
		rightTrackModel[707] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1926
		rightTrackModel[708] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1927
		rightTrackModel[709] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1928
		rightTrackModel[710] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1929
		rightTrackModel[711] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1930
		rightTrackModel[712] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1931
		rightTrackModel[713] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1932
		rightTrackModel[714] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1942
		rightTrackModel[715] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1943
		rightTrackModel[716] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1944
		rightTrackModel[717] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1945
		rightTrackModel[718] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1946
		rightTrackModel[719] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1947
		rightTrackModel[720] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1948
		rightTrackModel[721] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1949
		rightTrackModel[722] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1950
		rightTrackModel[723] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1960
		rightTrackModel[724] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1961
		rightTrackModel[725] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1962
		rightTrackModel[726] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1963
		rightTrackModel[727] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1964
		rightTrackModel[728] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1965
		rightTrackModel[729] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1966
		rightTrackModel[730] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1967
		rightTrackModel[731] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1968
		rightTrackModel[732] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1978
		rightTrackModel[733] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1979
		rightTrackModel[734] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1980
		rightTrackModel[735] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1981
		rightTrackModel[736] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1982
		rightTrackModel[737] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1983
		rightTrackModel[738] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1984
		rightTrackModel[739] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1985
		rightTrackModel[740] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Box 1986
		rightTrackModel[741] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Box 1996

		rightTrackModel[500].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box516
		rightTrackModel[500].setRotationPoint(-16F, -10F, -28.5F);

		rightTrackModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box517
		rightTrackModel[501].setRotationPoint(-13F, -10F, -27.5F);

		rightTrackModel[502].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box518
		rightTrackModel[502].setRotationPoint(-13F, -10F, -27.5F);

		rightTrackModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box519
		rightTrackModel[503].setRotationPoint(-13F, -10F, -24.5F);

		rightTrackModel[504].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box520
		rightTrackModel[504].setRotationPoint(-13F, -10F, -23.5F);

		rightTrackModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box521
		rightTrackModel[505].setRotationPoint(-13F, -10F, -21.5F);

		rightTrackModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box522
		rightTrackModel[506].setRotationPoint(-13F, -10F, -19.5F);

		rightTrackModel[507].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box523
		rightTrackModel[507].setRotationPoint(-13F, -10F, -19.5F);

		rightTrackModel[508].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box524
		rightTrackModel[508].setRotationPoint(-13F, -10F, -28.5F);

		rightTrackModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box525
		rightTrackModel[509].setRotationPoint(-10F, -10F, -27.5F);

		rightTrackModel[510].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box526
		rightTrackModel[510].setRotationPoint(-10F, -10F, -27.5F);

		rightTrackModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box527
		rightTrackModel[511].setRotationPoint(-10F, -10F, -24.5F);

		rightTrackModel[512].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box528
		rightTrackModel[512].setRotationPoint(-10F, -10F, -23.5F);

		rightTrackModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box529
		rightTrackModel[513].setRotationPoint(-10F, -10F, -21.5F);

		rightTrackModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box530
		rightTrackModel[514].setRotationPoint(-10F, -10F, -19.5F);

		rightTrackModel[515].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box531
		rightTrackModel[515].setRotationPoint(-10F, -10F, -19.5F);

		rightTrackModel[516].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box532
		rightTrackModel[516].setRotationPoint(-10F, -10F, -28.5F);

		rightTrackModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box533
		rightTrackModel[517].setRotationPoint(-7F, -10F, -27.5F);

		rightTrackModel[518].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box534
		rightTrackModel[518].setRotationPoint(-7F, -10F, -27.5F);

		rightTrackModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box535
		rightTrackModel[519].setRotationPoint(-7F, -10F, -24.5F);

		rightTrackModel[520].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box536
		rightTrackModel[520].setRotationPoint(-7F, -10F, -23.5F);

		rightTrackModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box537
		rightTrackModel[521].setRotationPoint(-7F, -10F, -21.5F);

		rightTrackModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box538
		rightTrackModel[522].setRotationPoint(-7F, -10F, -19.5F);

		rightTrackModel[523].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box539
		rightTrackModel[523].setRotationPoint(-7F, -10F, -19.5F);

		rightTrackModel[524].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box540
		rightTrackModel[524].setRotationPoint(-7F, -10F, -28.5F);

		rightTrackModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box541
		rightTrackModel[525].setRotationPoint(-4F, -10F, -27.5F);

		rightTrackModel[526].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box542
		rightTrackModel[526].setRotationPoint(-4F, -10F, -27.5F);

		rightTrackModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box543
		rightTrackModel[527].setRotationPoint(-4F, -10F, -24.5F);

		rightTrackModel[528].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box544
		rightTrackModel[528].setRotationPoint(-4F, -10F, -23.5F);

		rightTrackModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box545
		rightTrackModel[529].setRotationPoint(-4F, -10F, -21.5F);

		rightTrackModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box546
		rightTrackModel[530].setRotationPoint(-4F, -10F, -19.5F);

		rightTrackModel[531].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box547
		rightTrackModel[531].setRotationPoint(-4F, -10F, -19.5F);

		rightTrackModel[532].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box548
		rightTrackModel[532].setRotationPoint(-4F, -10F, -28.5F);

		rightTrackModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box549
		rightTrackModel[533].setRotationPoint(-1F, -10F, -27.5F);

		rightTrackModel[534].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box550
		rightTrackModel[534].setRotationPoint(-1F, -10F, -27.5F);

		rightTrackModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box551
		rightTrackModel[535].setRotationPoint(-1F, -10F, -24.5F);

		rightTrackModel[536].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box552
		rightTrackModel[536].setRotationPoint(-1F, -10F, -23.5F);

		rightTrackModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box553
		rightTrackModel[537].setRotationPoint(-1F, -10F, -21.5F);

		rightTrackModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box554
		rightTrackModel[538].setRotationPoint(-1F, -10F, -19.5F);

		rightTrackModel[539].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box555
		rightTrackModel[539].setRotationPoint(-1F, -10F, -19.5F);

		rightTrackModel[540].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box556
		rightTrackModel[540].setRotationPoint(-1F, -10F, -28.5F);

		rightTrackModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box557
		rightTrackModel[541].setRotationPoint(2F, -10F, -27.5F);

		rightTrackModel[542].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box558
		rightTrackModel[542].setRotationPoint(2F, -10F, -27.5F);

		rightTrackModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box559
		rightTrackModel[543].setRotationPoint(2F, -10F, -24.5F);

		rightTrackModel[544].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box560
		rightTrackModel[544].setRotationPoint(2F, -10F, -23.5F);

		rightTrackModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box561
		rightTrackModel[545].setRotationPoint(2F, -10F, -21.5F);

		rightTrackModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box562
		rightTrackModel[546].setRotationPoint(2F, -10F, -19.5F);

		rightTrackModel[547].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box563
		rightTrackModel[547].setRotationPoint(2F, -10F, -19.5F);

		rightTrackModel[548].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box564
		rightTrackModel[548].setRotationPoint(2F, -10F, -28.5F);

		rightTrackModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box565
		rightTrackModel[549].setRotationPoint(5F, -10F, -27.5F);

		rightTrackModel[550].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box566
		rightTrackModel[550].setRotationPoint(5F, -10F, -27.5F);

		rightTrackModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		rightTrackModel[551].setRotationPoint(5F, -10F, -24.5F);

		rightTrackModel[552].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box568
		rightTrackModel[552].setRotationPoint(5F, -10F, -23.5F);

		rightTrackModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box569
		rightTrackModel[553].setRotationPoint(5F, -10F, -21.5F);

		rightTrackModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box570
		rightTrackModel[554].setRotationPoint(5F, -10F, -19.5F);

		rightTrackModel[555].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box571
		rightTrackModel[555].setRotationPoint(5F, -10F, -19.5F);

		rightTrackModel[556].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box572
		rightTrackModel[556].setRotationPoint(5F, -10F, -28.5F);

		rightTrackModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box573
		rightTrackModel[557].setRotationPoint(8F, -10F, -27.5F);

		rightTrackModel[558].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box574
		rightTrackModel[558].setRotationPoint(8F, -10F, -27.5F);

		rightTrackModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box575
		rightTrackModel[559].setRotationPoint(8F, -10F, -24.5F);

		rightTrackModel[560].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box576
		rightTrackModel[560].setRotationPoint(8F, -10F, -23.5F);

		rightTrackModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box577
		rightTrackModel[561].setRotationPoint(8F, -10F, -21.5F);

		rightTrackModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box578
		rightTrackModel[562].setRotationPoint(8F, -10F, -19.5F);

		rightTrackModel[563].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box579
		rightTrackModel[563].setRotationPoint(8F, -10F, -19.5F);

		rightTrackModel[564].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box580
		rightTrackModel[564].setRotationPoint(8F, -10F, -28.5F);

		rightTrackModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box581
		rightTrackModel[565].setRotationPoint(11F, -10F, -27.5F);

		rightTrackModel[566].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box582
		rightTrackModel[566].setRotationPoint(11F, -10F, -27.5F);

		rightTrackModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box583
		rightTrackModel[567].setRotationPoint(11F, -10F, -24.5F);

		rightTrackModel[568].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box584
		rightTrackModel[568].setRotationPoint(11F, -10F, -23.5F);

		rightTrackModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box585
		rightTrackModel[569].setRotationPoint(11F, -10F, -21.5F);

		rightTrackModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box586
		rightTrackModel[570].setRotationPoint(11F, -10F, -19.5F);

		rightTrackModel[571].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box587
		rightTrackModel[571].setRotationPoint(11F, -10F, -19.5F);

		rightTrackModel[572].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box588
		rightTrackModel[572].setRotationPoint(11F, -10F, -28.5F);

		rightTrackModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box589
		rightTrackModel[573].setRotationPoint(14F, -10F, -27.5F);

		rightTrackModel[574].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box590
		rightTrackModel[574].setRotationPoint(14F, -10F, -27.5F);

		rightTrackModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box591
		rightTrackModel[575].setRotationPoint(14F, -10F, -24.5F);

		rightTrackModel[576].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box592
		rightTrackModel[576].setRotationPoint(14F, -10F, -23.5F);

		rightTrackModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box593
		rightTrackModel[577].setRotationPoint(14F, -10F, -21.5F);

		rightTrackModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box594
		rightTrackModel[578].setRotationPoint(14F, -10F, -19.5F);

		rightTrackModel[579].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box595
		rightTrackModel[579].setRotationPoint(14F, -10F, -19.5F);

		rightTrackModel[580].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box596
		rightTrackModel[580].setRotationPoint(14F, -10F, -28.5F);

		rightTrackModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box597
		rightTrackModel[581].setRotationPoint(17F, -10F, -27.5F);

		rightTrackModel[582].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box598
		rightTrackModel[582].setRotationPoint(17F, -10F, -27.5F);

		rightTrackModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box599
		rightTrackModel[583].setRotationPoint(17F, -10F, -24.5F);

		rightTrackModel[584].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box600
		rightTrackModel[584].setRotationPoint(17F, -10F, -23.5F);

		rightTrackModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box601
		rightTrackModel[585].setRotationPoint(17F, -10F, -21.5F);

		rightTrackModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box602
		rightTrackModel[586].setRotationPoint(17F, -10F, -19.5F);

		rightTrackModel[587].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box603
		rightTrackModel[587].setRotationPoint(17F, -10F, -19.5F);

		rightTrackModel[588].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box604
		rightTrackModel[588].setRotationPoint(17F, -10F, -28.5F);

		rightTrackModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box605
		rightTrackModel[589].setRotationPoint(20F, -10F, -27.5F);

		rightTrackModel[590].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box606
		rightTrackModel[590].setRotationPoint(20F, -10F, -27.5F);

		rightTrackModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box607
		rightTrackModel[591].setRotationPoint(20F, -10F, -24.5F);

		rightTrackModel[592].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box608
		rightTrackModel[592].setRotationPoint(20F, -10F, -23.5F);

		rightTrackModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box609
		rightTrackModel[593].setRotationPoint(20F, -10F, -21.5F);

		rightTrackModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box610
		rightTrackModel[594].setRotationPoint(20F, -10F, -19.5F);

		rightTrackModel[595].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box611
		rightTrackModel[595].setRotationPoint(20F, -10F, -19.5F);

		rightTrackModel[596].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box612
		rightTrackModel[596].setRotationPoint(20F, -10F, -28.5F);

		rightTrackModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box613
		rightTrackModel[597].setRotationPoint(23F, -10F, -27.5F);

		rightTrackModel[598].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box614
		rightTrackModel[598].setRotationPoint(23F, -10F, -27.5F);

		rightTrackModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box615
		rightTrackModel[599].setRotationPoint(23F, -10F, -24.5F);

		rightTrackModel[600].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box616
		rightTrackModel[600].setRotationPoint(23F, -10F, -23.5F);

		rightTrackModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box617
		rightTrackModel[601].setRotationPoint(23F, -10F, -21.5F);

		rightTrackModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box618
		rightTrackModel[602].setRotationPoint(23F, -10F, -19.5F);

		rightTrackModel[603].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box619
		rightTrackModel[603].setRotationPoint(23F, -10F, -19.5F);

		rightTrackModel[604].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box620
		rightTrackModel[604].setRotationPoint(23F, -10F, -28.5F);

		rightTrackModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box621
		rightTrackModel[605].setRotationPoint(26F, -10F, -27.5F);

		rightTrackModel[606].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box622
		rightTrackModel[606].setRotationPoint(26F, -10F, -27.5F);

		rightTrackModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box623
		rightTrackModel[607].setRotationPoint(26F, -10F, -24.5F);

		rightTrackModel[608].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box624
		rightTrackModel[608].setRotationPoint(26F, -10F, -23.5F);

		rightTrackModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box625
		rightTrackModel[609].setRotationPoint(26F, -10F, -21.5F);

		rightTrackModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box626
		rightTrackModel[610].setRotationPoint(26F, -10F, -19.5F);

		rightTrackModel[611].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box627
		rightTrackModel[611].setRotationPoint(26F, -10F, -19.5F);

		rightTrackModel[612].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box628
		rightTrackModel[612].setRotationPoint(26F, -10F, -28.5F);

		rightTrackModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box629
		rightTrackModel[613].setRotationPoint(29F, -10F, -27.5F);

		rightTrackModel[614].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box630
		rightTrackModel[614].setRotationPoint(29F, -10F, -27.5F);

		rightTrackModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box631
		rightTrackModel[615].setRotationPoint(29F, -10F, -24.5F);

		rightTrackModel[616].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box632
		rightTrackModel[616].setRotationPoint(29F, -10F, -23.5F);

		rightTrackModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box633
		rightTrackModel[617].setRotationPoint(29F, -10F, -21.5F);

		rightTrackModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box634
		rightTrackModel[618].setRotationPoint(29F, -10F, -19.5F);

		rightTrackModel[619].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box635
		rightTrackModel[619].setRotationPoint(29F, -10F, -19.5F);

		rightTrackModel[620].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box636
		rightTrackModel[620].setRotationPoint(29F, -10F, -28.5F);

		rightTrackModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box637
		rightTrackModel[621].setRotationPoint(32F, -10F, -27.5F);

		rightTrackModel[622].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box638
		rightTrackModel[622].setRotationPoint(32F, -10F, -27.5F);

		rightTrackModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box639
		rightTrackModel[623].setRotationPoint(32F, -10F, -24.5F);

		rightTrackModel[624].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box640
		rightTrackModel[624].setRotationPoint(32F, -10F, -23.5F);

		rightTrackModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box641
		rightTrackModel[625].setRotationPoint(32F, -10F, -21.5F);

		rightTrackModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box642
		rightTrackModel[626].setRotationPoint(32F, -10F, -19.5F);

		rightTrackModel[627].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box643
		rightTrackModel[627].setRotationPoint(32F, -10F, -19.5F);

		rightTrackModel[628].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box644
		rightTrackModel[628].setRotationPoint(32F, -10F, -28.5F);

		rightTrackModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box645
		rightTrackModel[629].setRotationPoint(35F, -10F, -27.5F);

		rightTrackModel[630].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box646
		rightTrackModel[630].setRotationPoint(35F, -10F, -27.5F);

		rightTrackModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box647
		rightTrackModel[631].setRotationPoint(35F, -10F, -24.5F);

		rightTrackModel[632].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box648
		rightTrackModel[632].setRotationPoint(35F, -10F, -23.5F);

		rightTrackModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box649
		rightTrackModel[633].setRotationPoint(35F, -10F, -21.5F);

		rightTrackModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box650
		rightTrackModel[634].setRotationPoint(35F, -10F, -19.5F);

		rightTrackModel[635].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box651
		rightTrackModel[635].setRotationPoint(35F, -10F, -19.5F);

		rightTrackModel[636].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box652
		rightTrackModel[636].setRotationPoint(35F, -10F, -28.5F);

		rightTrackModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box653
		rightTrackModel[637].setRotationPoint(38F, -10F, -27.5F);

		rightTrackModel[638].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box654
		rightTrackModel[638].setRotationPoint(38F, -10F, -27.5F);

		rightTrackModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box655
		rightTrackModel[639].setRotationPoint(38F, -10F, -24.5F);

		rightTrackModel[640].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box656
		rightTrackModel[640].setRotationPoint(38F, -10F, -23.5F);

		rightTrackModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box657
		rightTrackModel[641].setRotationPoint(38F, -10F, -21.5F);

		rightTrackModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box658
		rightTrackModel[642].setRotationPoint(38F, -10F, -19.5F);

		rightTrackModel[643].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box659
		rightTrackModel[643].setRotationPoint(38F, -10F, -19.5F);

		rightTrackModel[644].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box660
		rightTrackModel[644].setRotationPoint(38F, -10F, -28.5F);

		rightTrackModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box661
		rightTrackModel[645].setRotationPoint(41F, -10F, -27.5F);

		rightTrackModel[646].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box662
		rightTrackModel[646].setRotationPoint(41F, -10F, -27.5F);

		rightTrackModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box663
		rightTrackModel[647].setRotationPoint(41F, -10F, -24.5F);

		rightTrackModel[648].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box664
		rightTrackModel[648].setRotationPoint(41F, -10F, -23.5F);

		rightTrackModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box665
		rightTrackModel[649].setRotationPoint(41F, -10F, -21.5F);

		rightTrackModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box666
		rightTrackModel[650].setRotationPoint(41F, -10F, -19.5F);

		rightTrackModel[651].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box667
		rightTrackModel[651].setRotationPoint(41F, -10F, -19.5F);

		rightTrackModel[652].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box668
		rightTrackModel[652].setRotationPoint(41F, -10F, -28.5F);

		rightTrackModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box669
		rightTrackModel[653].setRotationPoint(44F, -10F, -27.5F);

		rightTrackModel[654].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box670
		rightTrackModel[654].setRotationPoint(45F, -10F, -27.5F);

		rightTrackModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box671
		rightTrackModel[655].setRotationPoint(44F, -10F, -24.5F);

		rightTrackModel[656].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box672
		rightTrackModel[656].setRotationPoint(45F, -10F, -23.5F);

		rightTrackModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box673
		rightTrackModel[657].setRotationPoint(44F, -10F, -21.5F);

		rightTrackModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box674
		rightTrackModel[658].setRotationPoint(44F, -10F, -19.5F);

		rightTrackModel[659].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box675
		rightTrackModel[659].setRotationPoint(45F, -10F, -19.5F);

		rightTrackModel[660].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box676
		rightTrackModel[660].setRotationPoint(45F, -10F, -28.5F);

		rightTrackModel[661].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1835
		rightTrackModel[661].setRotationPoint(38.5F, 3.5F, -27F);

		rightTrackModel[662].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1836
		rightTrackModel[662].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[662].rotateAngleZ = 0.78539816F;

		rightTrackModel[663].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1837
		rightTrackModel[663].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[663].rotateAngleZ = 1.57079633F;

		rightTrackModel[664].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1838
		rightTrackModel[664].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[664].rotateAngleZ = 2.35619449F;

		rightTrackModel[665].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1839
		rightTrackModel[665].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[665].rotateAngleZ = 3.14159265F;

		rightTrackModel[666].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1840
		rightTrackModel[666].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[666].rotateAngleZ = 3.92699082F;

		rightTrackModel[667].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1841
		rightTrackModel[667].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[667].rotateAngleZ = 4.71238898F;

		rightTrackModel[668].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1842
		rightTrackModel[668].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[668].rotateAngleZ = 5.49778714F;

		rightTrackModel[669].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1851
		rightTrackModel[669].setRotationPoint(38.5F, 3.5F, -27F);

		rightTrackModel[670].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1853
		rightTrackModel[670].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[670].rotateAngleZ = 4.71238898F;

		rightTrackModel[671].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1854
		rightTrackModel[671].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[671].rotateAngleZ = 5.49778714F;

		rightTrackModel[672].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1855
		rightTrackModel[672].setRotationPoint(49.5F, -4.5F, -27F);

		rightTrackModel[673].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1856
		rightTrackModel[673].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[673].rotateAngleZ = 0.78539816F;

		rightTrackModel[674].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1857
		rightTrackModel[674].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[674].rotateAngleZ = 1.57079633F;

		rightTrackModel[675].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1858
		rightTrackModel[675].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[675].rotateAngleZ = 2.35619449F;

		rightTrackModel[676].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1859
		rightTrackModel[676].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[676].rotateAngleZ = 3.14159265F;

		rightTrackModel[677].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1860
		rightTrackModel[677].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[677].rotateAngleZ = 3.92699082F;

		rightTrackModel[678].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1870
		rightTrackModel[678].setRotationPoint(49.5F, -4.5F, -27F);

		rightTrackModel[679].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1871
		rightTrackModel[679].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[679].rotateAngleZ = 4.71238898F;

		rightTrackModel[680].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1872
		rightTrackModel[680].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[680].rotateAngleZ = 5.49778714F;

		rightTrackModel[681].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1873
		rightTrackModel[681].setRotationPoint(25.5F, 3.5F, -27F);

		rightTrackModel[682].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1874
		rightTrackModel[682].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[682].rotateAngleZ = 0.78539816F;

		rightTrackModel[683].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1875
		rightTrackModel[683].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[683].rotateAngleZ = 1.57079633F;

		rightTrackModel[684].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1876
		rightTrackModel[684].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[684].rotateAngleZ = 2.35619449F;

		rightTrackModel[685].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1877
		rightTrackModel[685].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[685].rotateAngleZ = 3.14159265F;

		rightTrackModel[686].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1878
		rightTrackModel[686].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[686].rotateAngleZ = 3.92699082F;

		rightTrackModel[687].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1888
		rightTrackModel[687].setRotationPoint(25.5F, 3.5F, -27F);

		rightTrackModel[688].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1889
		rightTrackModel[688].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[688].rotateAngleZ = 4.71238898F;

		rightTrackModel[689].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1890
		rightTrackModel[689].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[689].rotateAngleZ = 5.49778714F;

		rightTrackModel[690].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1891
		rightTrackModel[690].setRotationPoint(12.5F, 3.5F, -27F);

		rightTrackModel[691].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1892
		rightTrackModel[691].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[691].rotateAngleZ = 0.78539816F;

		rightTrackModel[692].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1893
		rightTrackModel[692].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[692].rotateAngleZ = 1.57079633F;

		rightTrackModel[693].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1894
		rightTrackModel[693].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[693].rotateAngleZ = 2.35619449F;

		rightTrackModel[694].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1895
		rightTrackModel[694].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[694].rotateAngleZ = 3.14159265F;

		rightTrackModel[695].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1896
		rightTrackModel[695].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[695].rotateAngleZ = 3.92699082F;

		rightTrackModel[696].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1906
		rightTrackModel[696].setRotationPoint(12.5F, 3.5F, -27F);

		rightTrackModel[697].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1907
		rightTrackModel[697].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[697].rotateAngleZ = 4.71238898F;

		rightTrackModel[698].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1908
		rightTrackModel[698].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[698].rotateAngleZ = 5.49778714F;

		rightTrackModel[699].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1909
		rightTrackModel[699].setRotationPoint(1F, 3.5F, -27F);

		rightTrackModel[700].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1910
		rightTrackModel[700].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[700].rotateAngleZ = 0.78539816F;

		rightTrackModel[701].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1911
		rightTrackModel[701].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[701].rotateAngleZ = 1.57079633F;

		rightTrackModel[702].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1912
		rightTrackModel[702].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[702].rotateAngleZ = 2.35619449F;

		rightTrackModel[703].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1913
		rightTrackModel[703].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[703].rotateAngleZ = 3.14159265F;

		rightTrackModel[704].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1914
		rightTrackModel[704].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[704].rotateAngleZ = 3.92699082F;

		rightTrackModel[705].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1924
		rightTrackModel[705].setRotationPoint(1F, 3.5F, -27F);

		rightTrackModel[706].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1925
		rightTrackModel[706].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[706].rotateAngleZ = 4.71238898F;

		rightTrackModel[707].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1926
		rightTrackModel[707].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[707].rotateAngleZ = 5.49778714F;

		rightTrackModel[708].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1927
		rightTrackModel[708].setRotationPoint(-10.5F, 3.5F, -27F);

		rightTrackModel[709].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1928
		rightTrackModel[709].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[709].rotateAngleZ = 0.78539816F;

		rightTrackModel[710].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1929
		rightTrackModel[710].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[710].rotateAngleZ = 1.57079633F;

		rightTrackModel[711].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1930
		rightTrackModel[711].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[711].rotateAngleZ = 2.35619449F;

		rightTrackModel[712].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1931
		rightTrackModel[712].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[712].rotateAngleZ = 3.14159265F;

		rightTrackModel[713].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1932
		rightTrackModel[713].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[713].rotateAngleZ = 3.92699082F;

		rightTrackModel[714].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1942
		rightTrackModel[714].setRotationPoint(-10.5F, 3.5F, -27F);

		rightTrackModel[715].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1943
		rightTrackModel[715].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[715].rotateAngleZ = 4.71238898F;

		rightTrackModel[716].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1944
		rightTrackModel[716].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[716].rotateAngleZ = 5.49778714F;

		rightTrackModel[717].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1945
		rightTrackModel[717].setRotationPoint(-23.5F, 3.5F, -27F);

		rightTrackModel[718].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1946
		rightTrackModel[718].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[718].rotateAngleZ = 0.78539816F;

		rightTrackModel[719].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1947
		rightTrackModel[719].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[719].rotateAngleZ = 1.57079633F;

		rightTrackModel[720].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1948
		rightTrackModel[720].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[720].rotateAngleZ = 2.35619449F;

		rightTrackModel[721].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1949
		rightTrackModel[721].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[721].rotateAngleZ = 3.14159265F;

		rightTrackModel[722].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1950
		rightTrackModel[722].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[722].rotateAngleZ = 3.92699082F;

		rightTrackModel[723].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1960
		rightTrackModel[723].setRotationPoint(-23.5F, 3.5F, -27F);

		rightTrackModel[724].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1961
		rightTrackModel[724].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[724].rotateAngleZ = 4.71238898F;

		rightTrackModel[725].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1962
		rightTrackModel[725].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[725].rotateAngleZ = 5.49778714F;

		rightTrackModel[726].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1963
		rightTrackModel[726].setRotationPoint(-36.5F, 3.5F, -27F);

		rightTrackModel[727].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1964
		rightTrackModel[727].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[727].rotateAngleZ = 0.78539816F;

		rightTrackModel[728].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1965
		rightTrackModel[728].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[728].rotateAngleZ = 1.57079633F;

		rightTrackModel[729].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1966
		rightTrackModel[729].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[729].rotateAngleZ = 2.35619449F;

		rightTrackModel[730].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1967
		rightTrackModel[730].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[730].rotateAngleZ = 3.14159265F;

		rightTrackModel[731].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1968
		rightTrackModel[731].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[731].rotateAngleZ = 3.92699082F;

		rightTrackModel[732].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1978
		rightTrackModel[732].setRotationPoint(-36.5F, 3.5F, -27F);

		rightTrackModel[733].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1979
		rightTrackModel[733].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[733].rotateAngleZ = 4.71238898F;

		rightTrackModel[734].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1980
		rightTrackModel[734].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[734].rotateAngleZ = 5.49778714F;

		rightTrackModel[735].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1981
		rightTrackModel[735].setRotationPoint(-44.5F, -4.5F, -27F);

		rightTrackModel[736].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1982
		rightTrackModel[736].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[736].rotateAngleZ = 0.78539816F;

		rightTrackModel[737].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1983
		rightTrackModel[737].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[737].rotateAngleZ = 1.57079633F;

		rightTrackModel[738].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1984
		rightTrackModel[738].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[738].rotateAngleZ = 2.35619449F;

		rightTrackModel[739].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1985
		rightTrackModel[739].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[739].rotateAngleZ = 3.14159265F;

		rightTrackModel[740].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1986
		rightTrackModel[740].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[740].rotateAngleZ = 3.92699082F;

		rightTrackModel[741].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1996
		rightTrackModel[741].setRotationPoint(-44.5F, -4.5F, -27F);
	}
}