//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBA44 extends ModelVehicle //Same as Filename
{
	int textureX = 3000;
	int textureY = 3000;

	public ModelBA44() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[239];
		turretModel = new ModelRendererTurbo[46];
		barrelModel = new ModelRendererTurbo[71];
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
		bodyModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import ImportBox0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import ImportBox2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import ImportBox4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Import ImportBox5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportBox6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import ImportBox7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import ImportBox8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Import ImportBox9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportBox10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import ImportBox11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import ImportBox12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Import ImportBox13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import ImportBox14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import ImportBox15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Import ImportBox16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import ImportBox17
		bodyModel[16] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import ImportBox18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import ImportBox81
		bodyModel[18] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import ImportBox82
		bodyModel[19] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import ImportBox83
		bodyModel[20] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportBox84
		bodyModel[21] = new ModelRendererTurbo(this, 0, 305, textureX, textureY); // Import ImportBox85
		bodyModel[22] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import ImportBox86
		bodyModel[23] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import ImportBox87
		bodyModel[24] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportBox88
		bodyModel[25] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import ImportBox139
		bodyModel[26] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import ImportBox140
		bodyModel[27] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import ImportBox141
		bodyModel[28] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportBox143
		bodyModel[29] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import ImportBox144
		bodyModel[30] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import ImportBox145
		bodyModel[31] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import ImportBox146
		bodyModel[32] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportBox147
		bodyModel[33] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import ImportBox153
		bodyModel[34] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import ImportBox154
		bodyModel[35] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import ImportBox155
		bodyModel[36] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportBox156
		bodyModel[37] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import ImportBox157
		bodyModel[38] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import ImportBox158
		bodyModel[39] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import ImportBox159
		bodyModel[40] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import ImportBox160
		bodyModel[41] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import ImportBox161
		bodyModel[42] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import ImportBox162
		bodyModel[43] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Import ImportBox163
		bodyModel[44] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import ImportBox164
		bodyModel[45] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import ImportBox165
		bodyModel[46] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import ImportBox166
		bodyModel[47] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import ImportBox167
		bodyModel[48] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import ImportBox168
		bodyModel[49] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox169
		bodyModel[50] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox170
		bodyModel[51] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox171
		bodyModel[52] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox172
		bodyModel[53] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox173
		bodyModel[54] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox174
		bodyModel[55] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox175
		bodyModel[56] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox176
		bodyModel[57] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox177
		bodyModel[58] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox178
		bodyModel[59] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportBox179
		bodyModel[60] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import ImportBox180
		bodyModel[61] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import ImportBox181
		bodyModel[62] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import ImportBox182
		bodyModel[63] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import ImportBox183
		bodyModel[64] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import ImportBox184
		bodyModel[65] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import ImportBox185
		bodyModel[66] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import ImportBox186
		bodyModel[67] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import ImportBox187
		bodyModel[68] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import ImportBox188
		bodyModel[69] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import ImportBox189
		bodyModel[70] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import ImportBox190
		bodyModel[71] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import ImportBox192
		bodyModel[72] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import ImportBox193
		bodyModel[73] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox194
		bodyModel[74] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox195
		bodyModel[75] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox197
		bodyModel[76] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox198
		bodyModel[77] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox199
		bodyModel[78] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox200
		bodyModel[79] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox201
		bodyModel[80] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import ImportBox202
		bodyModel[81] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import ImportBox203
		bodyModel[82] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox204
		bodyModel[83] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox205
		bodyModel[84] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox206
		bodyModel[85] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox207
		bodyModel[86] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox208
		bodyModel[87] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox209
		bodyModel[88] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox210
		bodyModel[89] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import ImportBox211
		bodyModel[90] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox212
		bodyModel[91] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox213
		bodyModel[92] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox214
		bodyModel[93] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox215
		bodyModel[94] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox216
		bodyModel[95] = new ModelRendererTurbo(this, 0, 827, textureX, textureY); // Import ImportBox217
		bodyModel[96] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox218
		bodyModel[97] = new ModelRendererTurbo(this, 0, 842, textureX, textureY); // Import ImportBox219
		bodyModel[98] = new ModelRendererTurbo(this, 0, 865, textureX, textureY); // Import ImportBox220
		bodyModel[99] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import ImportBox221
		bodyModel[100] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Import ImportBox222
		bodyModel[101] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Import ImportBox223
		bodyModel[102] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Import ImportBox224
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1045, textureX, textureY); // Import ImportBox340
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import ImportBox341
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1055, textureX, textureY); // Import ImportBox342
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import ImportBox343
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import ImportBox344
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import ImportBox345
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox346
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox347
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Import ImportBox348
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import ImportBox349
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Import ImportBox350
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import ImportBox351
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import ImportBox352
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox353
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox354
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox355
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox356
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox357
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox358
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Import ImportBox359
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import ImportBox360
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Import ImportBox361
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import ImportBox362
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import ImportBox363
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox364
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox365
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox366
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox367
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import ImportBox368
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import ImportBox369
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import ImportBox370
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import ImportBox371
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import ImportBox372
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import ImportBox373
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import ImportBox374
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import ImportBox375
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1178, textureX, textureY); // Import ImportBox376
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import ImportBox377
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import ImportBox378
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1185, textureX, textureY); // Import ImportBox379
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox380
		bodyModel[144] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox381
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox382
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1075, textureX, textureY); // Import ImportBox383
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox384
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox385
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox386
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox387
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import ImportBox388
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import ImportBox389
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox390
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox391
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox392
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox393
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox394
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox395
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox396
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox397
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox398
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox399
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox400
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox401
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox402
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox403
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox404
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox405
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox406
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox407
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Import ImportBox408
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox409
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Import ImportBox410
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import ImportBox411
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Import ImportBox412
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox413
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox414
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox415
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1165, textureX, textureY); // Import ImportBox416
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox417
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox418
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox419
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox420
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import ImportBox421
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Import ImportBox422
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox423
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox424
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox425
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox426
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import ImportBox427
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox428
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox429
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox430
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox431
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox432
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox433
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox434
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox435
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import ImportBox436
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1231, textureX, textureY); // Import ImportBox437
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox438
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox439
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox440
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox441
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1227, textureX, textureY); // Import ImportBox442
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox443
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox444
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1217, textureX, textureY); // Import ImportBox445
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1224, textureX, textureY); // Import ImportBox446
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import ImportBox447
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import ImportBox448
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1244, textureX, textureY); // Import ImportBox449
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox450
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import ImportBox451
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import ImportBox452
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox453
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import ImportBox454
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import ImportBox455
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox456
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox459
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox460
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox461
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import ImportBox462
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import ImportBox463
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1244, textureX, textureY); // Import ImportBox464
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox465
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1240, textureX, textureY); // Import ImportBox466
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1234, textureX, textureY); // Import ImportBox467
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox468
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import ImportBox469
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1256, textureX, textureY); // Import ImportBox470
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox471
		bodyModel[233] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox472
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox473
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import ImportBox474
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import ImportBox667
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1362, textureX, textureY); // Import ImportBox668
		bodyModel[238] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Box 59

		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 12, 10, 0F,0F, 0F, 0F, -24F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		bodyModel[0].setRotationPoint(30F, -16F, -17.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 25, 7, 10, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		bodyModel[1].setRotationPoint(30F, -4F, -17.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 62, 19, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		bodyModel[2].setRotationPoint(-32F, -16F, -17.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 94, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox5
		bodyModel[3].setRotationPoint(-45F, -12F, -29F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox6
		bodyModel[4].setRotationPoint(49F, -12F, -29F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox7
		bodyModel[5].setRotationPoint(53F, -11F, -29F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox8
		bodyModel[6].setRotationPoint(55F, -9F, -29F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 94, 1, 12, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		bodyModel[7].setRotationPoint(-45F, -12F, 17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox10
		bodyModel[8].setRotationPoint(49F, -12F, 17F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox11
		bodyModel[9].setRotationPoint(53F, -11F, 17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 3F, 0.5F, -1F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox12
		bodyModel[10].setRotationPoint(55F, -9F, 17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F); // Import ImportBox13
		bodyModel[11].setRotationPoint(-49F, -12F, -29F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 3F, 0.5F); // Import ImportBox14
		bodyModel[12].setRotationPoint(-52F, -11F, -29F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Import ImportBox15
		bodyModel[13].setRotationPoint(-54F, -8F, -29F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox16
		bodyModel[14].setRotationPoint(-49F, -12F, 18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 3F, 0F); // Import ImportBox17
		bodyModel[15].setRotationPoint(-52F, -11F, 18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Import ImportBox18
		bodyModel[16].setRotationPoint(-54F, -8F, 18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		bodyModel[17].setRotationPoint(40F, -12F, -16.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox82
		bodyModel[18].setRotationPoint(49F, -12F, -16.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox83
		bodyModel[19].setRotationPoint(53F, -11F, -16.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox84
		bodyModel[20].setRotationPoint(55F, -9F, -16.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox85
		bodyModel[21].setRotationPoint(40F, -12F, 15.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		bodyModel[22].setRotationPoint(49F, -12F, 15.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		bodyModel[23].setRotationPoint(53F, -11F, 15.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox88
		bodyModel[24].setRotationPoint(55F, -9F, 15.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 25, 12, 10, 0F,0F, 0F, 0F, -15F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox139
		bodyModel[25].setRotationPoint(30F, -16F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox140
		bodyModel[26].setRotationPoint(30F, -4F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 25, 12, 15, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox141
		bodyModel[27].setRotationPoint(30F, -16F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 25, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox143
		bodyModel[28].setRotationPoint(30F, -4F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 80, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox144
		bodyModel[29].setRotationPoint(-31F, -12F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox145
		bodyModel[30].setRotationPoint(49F, -12F, -30F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		bodyModel[31].setRotationPoint(53F, -11F, -30F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox147
		bodyModel[32].setRotationPoint(55F, -9F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 80, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox153
		bodyModel[33].setRotationPoint(-31F, -12F, 29F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import ImportBox154
		bodyModel[34].setRotationPoint(49F, -12F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox155
		bodyModel[35].setRotationPoint(53F, -11F, 29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox156
		bodyModel[36].setRotationPoint(55F, -9F, 29F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 19, 35, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox157
		bodyModel[37].setRotationPoint(-39F, -16F, -17.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 22, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox158
		bodyModel[38].setRotationPoint(-50F, -19F, -17.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 19, 35, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox159
		bodyModel[39].setRotationPoint(-53F, -16F, -17.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox160
		bodyModel[40].setRotationPoint(-39F, -19F, -14.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox161
		bodyModel[41].setRotationPoint(-39F, -19F, 11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 29, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox162
		bodyModel[42].setRotationPoint(-19F, -19F, -14.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox163
		bodyModel[43].setRotationPoint(-39F, -18F, -11.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		bodyModel[44].setRotationPoint(-39F, -19F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox165
		bodyModel[45].setRotationPoint(-35F, -19F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		bodyModel[46].setRotationPoint(-31F, -19F, -11.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox167
		bodyModel[47].setRotationPoint(-27F, -19F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox168
		bodyModel[48].setRotationPoint(-23F, -19F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox169
		bodyModel[49].setRotationPoint(-37F, -18.5F, -10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox170
		bodyModel[50].setRotationPoint(-37F, -18.5F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox171
		bodyModel[51].setRotationPoint(-37F, -18.5F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		bodyModel[52].setRotationPoint(-37F, -18.5F, -4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		bodyModel[53].setRotationPoint(-37F, -18.5F, -2.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		bodyModel[54].setRotationPoint(-37F, -18.5F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox175
		bodyModel[55].setRotationPoint(-37F, -18.5F, 1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox176
		bodyModel[56].setRotationPoint(-37F, -18.5F, 3.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox177
		bodyModel[57].setRotationPoint(-37F, -18.5F, 5.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox178
		bodyModel[58].setRotationPoint(-37F, -18.5F, 7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox179
		bodyModel[59].setRotationPoint(-37F, -18.5F, 9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox180
		bodyModel[60].setRotationPoint(-55F, -21F, -13.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox181
		bodyModel[61].setRotationPoint(-56F, -21F, -13.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox182
		bodyModel[62].setRotationPoint(-57F, -21F, -14.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox183
		bodyModel[63].setRotationPoint(-55F, -21F, 11.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox184
		bodyModel[64].setRotationPoint(-56F, -21F, 11.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox185
		bodyModel[65].setRotationPoint(-57F, -21F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox186
		bodyModel[66].setRotationPoint(-56F, -14F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox187
		bodyModel[67].setRotationPoint(-56F, -14F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox188
		bodyModel[68].setRotationPoint(-57F, -10.5F, -18.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox189
		bodyModel[69].setRotationPoint(-58F, -10.5F, -18.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox190
		bodyModel[70].setRotationPoint(-59F, -10.5F, -18.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Import ImportBox192
		bodyModel[71].setRotationPoint(-38F, -12F, 29F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox193
		bodyModel[72].setRotationPoint(-54F, -16F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox194
		bodyModel[73].setRotationPoint(-55F, -23F, -6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox195
		bodyModel[74].setRotationPoint(-55F, -23F, -3.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox197
		bodyModel[75].setRotationPoint(-55F, -22F, -5.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox198
		bodyModel[76].setRotationPoint(-55F, -20F, -5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox199
		bodyModel[77].setRotationPoint(-55F, -18F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox200
		bodyModel[78].setRotationPoint(-55F, -16F, -5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox201
		bodyModel[79].setRotationPoint(-55F, -14F, -5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox202
		bodyModel[80].setRotationPoint(-55F, -14F, -5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox203
		bodyModel[81].setRotationPoint(-54F, -16F, 2.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox204
		bodyModel[82].setRotationPoint(-55F, -23F, 5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox205
		bodyModel[83].setRotationPoint(-55F, -23F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox206
		bodyModel[84].setRotationPoint(-55F, -22F, 3.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox207
		bodyModel[85].setRotationPoint(-55F, -20F, 3.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox208
		bodyModel[86].setRotationPoint(-55F, -18F, 3.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox209
		bodyModel[87].setRotationPoint(-55F, -16F, 3.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox210
		bodyModel[88].setRotationPoint(-55F, -14F, 3.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox211
		bodyModel[89].setRotationPoint(-55F, -14F, 3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox212
		bodyModel[90].setRotationPoint(-45F, -23F, 2.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox213
		bodyModel[91].setRotationPoint(-45F, -23F, 5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox214
		bodyModel[92].setRotationPoint(-45F, -20F, 3.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox215
		bodyModel[93].setRotationPoint(-45F, -22F, 3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox216
		bodyModel[94].setRotationPoint(-45F, -23F, -3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox217
		bodyModel[95].setRotationPoint(-45F, -23F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox218
		bodyModel[96].setRotationPoint(-45F, -20F, -5.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import ImportBox219
		bodyModel[97].setRotationPoint(-45F, -22F, -5.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		bodyModel[98].setRotationPoint(-54F, -25F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox221
		bodyModel[99].setRotationPoint(-54F, -22F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox222
		bodyModel[100].setRotationPoint(-53F, -20F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 2, 18, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox223
		bodyModel[101].setRotationPoint(-54F, -27F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 1, 18, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox224
		bodyModel[102].setRotationPoint(-53F, -28F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox340
		bodyModel[103].setRotationPoint(42F, -14F, -2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox341
		bodyModel[104].setRotationPoint(42F, -13F, -2.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox342
		bodyModel[105].setRotationPoint(42F, -13F, 1.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox343
		bodyModel[106].setRotationPoint(42F, -13F, -1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox344
		bodyModel[107].setRotationPoint(42F, -12F, -1.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox345
		bodyModel[108].setRotationPoint(42F, -11F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox346
		bodyModel[109].setRotationPoint(-32F, -16F, -28.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox347
		bodyModel[110].setRotationPoint(-12F, -16F, -28.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox348
		bodyModel[111].setRotationPoint(-30F, -13F, -28.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox349
		bodyModel[112].setRotationPoint(-30F, -15F, -28.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox350
		bodyModel[113].setRotationPoint(-30F, -16F, -28.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox351
		bodyModel[114].setRotationPoint(-28F, -17F, -24.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox352
		bodyModel[115].setRotationPoint(-22F, -17F, -24.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox353
		bodyModel[116].setRotationPoint(-29F, -16.5F, -26.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox354
		bodyModel[117].setRotationPoint(-29F, -16.5F, -24.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox355
		bodyModel[118].setRotationPoint(-29F, -16.5F, -22.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		bodyModel[119].setRotationPoint(-29F, -16.5F, -20.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox357
		bodyModel[120].setRotationPoint(-32F, -16F, 17.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox358
		bodyModel[121].setRotationPoint(-12F, -16F, 17.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox359
		bodyModel[122].setRotationPoint(-30F, -13F, 17.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox360
		bodyModel[123].setRotationPoint(-30F, -15F, 17.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		bodyModel[124].setRotationPoint(-30F, -16F, 17.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		bodyModel[125].setRotationPoint(-28F, -17F, 13.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox363
		bodyModel[126].setRotationPoint(-22F, -17F, 13.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox364
		bodyModel[127].setRotationPoint(-29F, -16.5F, 25.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox365
		bodyModel[128].setRotationPoint(-29F, -16.5F, 23.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox366
		bodyModel[129].setRotationPoint(-29F, -16.5F, 21.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox367
		bodyModel[130].setRotationPoint(-29F, -16.5F, 19.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox368
		bodyModel[131].setRotationPoint(37F, -16F, -24.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox369
		bodyModel[132].setRotationPoint(37F, -16F, -25.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox370
		bodyModel[133].setRotationPoint(37F, -16F, -22.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox371
		bodyModel[134].setRotationPoint(45F, -14.5F, -25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox372
		bodyModel[135].setRotationPoint(45F, -15.5F, -25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox373
		bodyModel[136].setRotationPoint(45F, -13.5F, -25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox374
		bodyModel[137].setRotationPoint(37F, -16F, 22.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox375
		bodyModel[138].setRotationPoint(37F, -16F, 24.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox376
		bodyModel[139].setRotationPoint(37F, -16F, 21.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox377
		bodyModel[140].setRotationPoint(45F, -14.5F, 22F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox378
		bodyModel[141].setRotationPoint(45F, -15.5F, 22F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox379
		bodyModel[142].setRotationPoint(45F, -13.5F, 22F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox380
		bodyModel[143].setRotationPoint(29F, -16F, -28.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox381
		bodyModel[144].setRotationPoint(8F, -16F, -28.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox382
		bodyModel[145].setRotationPoint(29F, -16F, 17.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox383
		bodyModel[146].setRotationPoint(8F, -16F, 17.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox384
		bodyModel[147].setRotationPoint(-10F, -15F, -26.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox385
		bodyModel[148].setRotationPoint(-10F, -16F, -26.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox386
		bodyModel[149].setRotationPoint(-10F, -16F, -21.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox387
		bodyModel[150].setRotationPoint(-10F, -15F, -21.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox388
		bodyModel[151].setRotationPoint(-11F, -14F, -22.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox389
		bodyModel[152].setRotationPoint(-11F, -13F, -27.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox390
		bodyModel[153].setRotationPoint(-7F, -15F, -26.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox391
		bodyModel[154].setRotationPoint(-7F, -16F, -26.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox392
		bodyModel[155].setRotationPoint(-7F, -15F, -21.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox393
		bodyModel[156].setRotationPoint(-7F, -16F, -21.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox394
		bodyModel[157].setRotationPoint(-4F, -15F, -26.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox395
		bodyModel[158].setRotationPoint(-4F, -16F, -26.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox396
		bodyModel[159].setRotationPoint(-4F, -15F, -21.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox397
		bodyModel[160].setRotationPoint(-4F, -16F, -21.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox398
		bodyModel[161].setRotationPoint(-1F, -15F, -26.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox399
		bodyModel[162].setRotationPoint(-1F, -16F, -26.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox400
		bodyModel[163].setRotationPoint(-1F, -15F, -21.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox401
		bodyModel[164].setRotationPoint(-1F, -16F, -21.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox402
		bodyModel[165].setRotationPoint(2F, -15F, -26.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox403
		bodyModel[166].setRotationPoint(2F, -16F, -26.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox404
		bodyModel[167].setRotationPoint(2F, -15F, -21.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox405
		bodyModel[168].setRotationPoint(2F, -16F, -21.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox406
		bodyModel[169].setRotationPoint(5F, -15F, -26.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox407
		bodyModel[170].setRotationPoint(5F, -16F, -26.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox408
		bodyModel[171].setRotationPoint(5F, -15F, -21.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox409
		bodyModel[172].setRotationPoint(5F, -16F, -21.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox410
		bodyModel[173].setRotationPoint(-10F, -16F, 17.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox411
		bodyModel[174].setRotationPoint(-10F, -15F, 17.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox412
		bodyModel[175].setRotationPoint(-10F, -13F, 17.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox413
		bodyModel[176].setRotationPoint(-9F, -16.5F, 19.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox414
		bodyModel[177].setRotationPoint(-9F, -16.5F, 21.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox415
		bodyModel[178].setRotationPoint(-9F, -16.5F, 23.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox416
		bodyModel[179].setRotationPoint(-9F, -16.5F, 25.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox417
		bodyModel[180].setRotationPoint(-34F, -13F, -21.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox418
		bodyModel[181].setRotationPoint(-38F, -13F, -21.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox419
		bodyModel[182].setRotationPoint(-37F, -13F, -21.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox420
		bodyModel[183].setRotationPoint(-37F, -13F, -19.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox421
		bodyModel[184].setRotationPoint(-37F, -13F, -20.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox422
		bodyModel[185].setRotationPoint(-41F, -14F, -20.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox423
		bodyModel[186].setRotationPoint(-44F, -13F, -21.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox424
		bodyModel[187].setRotationPoint(-43F, -13F, -21.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox425
		bodyModel[188].setRotationPoint(-40F, -13F, -21.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox426
		bodyModel[189].setRotationPoint(-43F, -13F, -19.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox427
		bodyModel[190].setRotationPoint(-41F, -13F, -20.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox428
		bodyModel[191].setRotationPoint(-38F, -13F, -26.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox429
		bodyModel[192].setRotationPoint(-37F, -13F, -26.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox430
		bodyModel[193].setRotationPoint(-34F, -13F, -26.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox431
		bodyModel[194].setRotationPoint(-37F, -13F, -24.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox432
		bodyModel[195].setRotationPoint(-34F, -13F, 18.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox433
		bodyModel[196].setRotationPoint(-38F, -13F, 18.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox434
		bodyModel[197].setRotationPoint(-37F, -13F, 20.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox435
		bodyModel[198].setRotationPoint(-37F, -13F, 18.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox436
		bodyModel[199].setRotationPoint(-37F, -13F, 19.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox437
		bodyModel[200].setRotationPoint(-41F, -14F, 19.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox438
		bodyModel[201].setRotationPoint(-44F, -13F, 18.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox439
		bodyModel[202].setRotationPoint(-43F, -13F, 20.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox440
		bodyModel[203].setRotationPoint(-40F, -13F, 18.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox441
		bodyModel[204].setRotationPoint(-43F, -13F, 18.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox442
		bodyModel[205].setRotationPoint(-41F, -13F, 19.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox443
		bodyModel[206].setRotationPoint(-38F, -13F, 23.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox444
		bodyModel[207].setRotationPoint(-37F, -13F, 25.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox445
		bodyModel[208].setRotationPoint(-34F, -13F, 23.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox446
		bodyModel[209].setRotationPoint(-37F, -13F, 23.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox447
		bodyModel[210].setRotationPoint(10F, -13F, -28.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox448
		bodyModel[211].setRotationPoint(11F, -13F, -27.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox449
		bodyModel[212].setRotationPoint(17F, -13F, -28.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox450
		bodyModel[213].setRotationPoint(19F, -13F, -28.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox451
		bodyModel[214].setRotationPoint(11F, -13F, -23.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox452
		bodyModel[215].setRotationPoint(10F, -13F, -24.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox453
		bodyModel[216].setRotationPoint(17F, -13F, -24.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox454
		bodyModel[217].setRotationPoint(18F, -13F, -24.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox455
		bodyModel[218].setRotationPoint(18F, -13F, -22.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox456
		bodyModel[219].setRotationPoint(21F, -13F, -25.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox459
		bodyModel[220].setRotationPoint(23F, -13F, -23.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox460
		bodyModel[221].setRotationPoint(25F, -13F, -24.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox461
		bodyModel[222].setRotationPoint(27F, -13F, -26.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox462
		bodyModel[223].setRotationPoint(10F, -13F, 25.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox463
		bodyModel[224].setRotationPoint(11F, -13F, 26.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox464
		bodyModel[225].setRotationPoint(17F, -13F, 25.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox465
		bodyModel[226].setRotationPoint(19F, -13F, 25.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox466
		bodyModel[227].setRotationPoint(11F, -13F, 22.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox467
		bodyModel[228].setRotationPoint(10F, -13F, 21.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox468
		bodyModel[229].setRotationPoint(17F, -13F, 21.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox469
		bodyModel[230].setRotationPoint(18F, -13F, 23.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox470
		bodyModel[231].setRotationPoint(18F, -13F, 21.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox471
		bodyModel[232].setRotationPoint(21F, -13F, 15.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox472
		bodyModel[233].setRotationPoint(23F, -13F, 13.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox473
		bodyModel[234].setRotationPoint(25F, -13F, 14.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox474
		bodyModel[235].setRotationPoint(27F, -13F, 16.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import ImportBox667
		bodyModel[236].setRotationPoint(34F, -17F, -2.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox668
		bodyModel[237].setRotationPoint(31F, -17F, -5.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 59
		bodyModel[238].setRotationPoint(-38F, -12F, -30F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 0
		turretModel[1] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1
		turretModel[2] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 2
		turretModel[3] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 3
		turretModel[4] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 4
		turretModel[5] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 5
		turretModel[6] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 6
		turretModel[7] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 7
		turretModel[8] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 9
		turretModel[9] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 10
		turretModel[10] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 11
		turretModel[11] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 12
		turretModel[12] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 13
		turretModel[13] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 14
		turretModel[14] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 15
		turretModel[15] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 16
		turretModel[16] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 17
		turretModel[17] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 18
		turretModel[18] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 19
		turretModel[19] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 20
		turretModel[20] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 21
		turretModel[21] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 22
		turretModel[22] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 23
		turretModel[23] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 24
		turretModel[24] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 25
		turretModel[25] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 26
		turretModel[26] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 27
		turretModel[27] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 28
		turretModel[28] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 29
		turretModel[29] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 30
		turretModel[30] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 31
		turretModel[31] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 32
		turretModel[32] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 33
		turretModel[33] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 34
		turretModel[34] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 35
		turretModel[35] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 36
		turretModel[36] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 37
		turretModel[37] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 38
		turretModel[38] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 40
		turretModel[39] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 41
		turretModel[40] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 42
		turretModel[41] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 44
		turretModel[42] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 45
		turretModel[43] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 46
		turretModel[44] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 47
		turretModel[45] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1819

		turretModel[0].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[0].setRotationPoint(9F, -20F, 5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 19, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[1].setRotationPoint(9F, -20F, -5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[2].setRotationPoint(9F, -20F, 10F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 3
		turretModel[3].setRotationPoint(9F, -20F, -10F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 4
		turretModel[4].setRotationPoint(9F, -20F, -16F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 14, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 5
		turretModel[5].setRotationPoint(-5F, -20F, 0F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 16, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[6].setRotationPoint(-5F, -20F, -16F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 10, 4, 20, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 7
		turretModel[7].setRotationPoint(-15F, -20F, -10F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 16, 11, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[8].setRotationPoint(9F, -31F, 5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 16, 11, 5, 0F,0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 10
		turretModel[9].setRotationPoint(9F, -31F, -10F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 10, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[10].setRotationPoint(9F, -31F, 10F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 10, 11, 6, 0F,0F, 0F, -3F, -9F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[11].setRotationPoint(9F, -31F, -16F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[12].setRotationPoint(9F, -31F, -5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[13].setRotationPoint(9F, -23F, -5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 19, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[14].setRotationPoint(9F, -28F, -5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 14, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 16
		turretModel[15].setRotationPoint(-5F, -31F, 0F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 14, 11, 16, 0F,0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[16].setRotationPoint(-5F, -31F, -16F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 10, 11, 20, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 18
		turretModel[17].setRotationPoint(-15F, -31F, -10F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 10, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		turretModel[18].setRotationPoint(-25F, -31F, -2F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 20
		turretModel[19].setRotationPoint(-25F, -31F, 2F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 8, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 21
		turretModel[20].setRotationPoint(-23F, -31F, 5F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 10, 11, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[21].setRotationPoint(-25F, -31F, -5F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 8, 11, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[22].setRotationPoint(-23F, -31F, -7F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[23].setRotationPoint(-20F, -27F, -11F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[24].setRotationPoint(-16F, -29F, -10.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 26
		turretModel[25].setRotationPoint(-17F, -29F, -10.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		turretModel[26].setRotationPoint(-15F, -29F, -10.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 28
		turretModel[27].setRotationPoint(-11F, -29F, -10.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[28].setRotationPoint(-12F, -29F, -10.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 30
		turretModel[29].setRotationPoint(-13F, -29F, -10.5F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 22, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 31
		turretModel[30].setRotationPoint(-20F, -27F, 7F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[31].setRotationPoint(-16F, -29F, 7.5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 33
		turretModel[32].setRotationPoint(-17F, -29F, 7.5F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 34
		turretModel[33].setRotationPoint(-15F, -29F, 7.5F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 35
		turretModel[34].setRotationPoint(-11F, -29F, 7.5F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[35].setRotationPoint(-12F, -29F, 7.5F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 37
		turretModel[36].setRotationPoint(-13F, -29F, 7.5F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 38
		turretModel[37].setRotationPoint(12F, -35F, 0F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 40
		turretModel[38].setRotationPoint(2F, -38F, 0F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
		turretModel[39].setRotationPoint(-8F, -38F, 0F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 0F); // Box 42
		turretModel[40].setRotationPoint(-12F, -35F, 0F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 3F, 3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		turretModel[41].setRotationPoint(12F, -35F, -4F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		turretModel[42].setRotationPoint(2F, -38F, -7F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, -3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		turretModel[43].setRotationPoint(-8F, -38F, -7F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 47
		turretModel[44].setRotationPoint(-12F, -35F, -4F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 19, 4, 8, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1819
		turretModel[45].setRotationPoint(6F, -35F, -4F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 48
		barrelModel[1] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 49
		barrelModel[2] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 50
		barrelModel[3] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 51
		barrelModel[4] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 52
		barrelModel[5] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 53
		barrelModel[6] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 54
		barrelModel[7] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 55
		barrelModel[8] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 56
		barrelModel[9] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 57
		barrelModel[10] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 58
		barrelModel[11] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1783
		barrelModel[12] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1784
		barrelModel[13] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1785
		barrelModel[14] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1786
		barrelModel[15] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1787
		barrelModel[16] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1788
		barrelModel[17] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1789
		barrelModel[18] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1790
		barrelModel[19] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1791
		barrelModel[20] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1792
		barrelModel[21] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1793
		barrelModel[22] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1794
		barrelModel[23] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1795
		barrelModel[24] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1796
		barrelModel[25] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1797
		barrelModel[26] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1798
		barrelModel[27] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1799
		barrelModel[28] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1800
		barrelModel[29] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1801
		barrelModel[30] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1802
		barrelModel[31] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1803
		barrelModel[32] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1804
		barrelModel[33] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1805
		barrelModel[34] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1806
		barrelModel[35] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1807
		barrelModel[36] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1808
		barrelModel[37] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1809
		barrelModel[38] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1810
		barrelModel[39] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1811
		barrelModel[40] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1812
		barrelModel[41] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1813
		barrelModel[42] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1814
		barrelModel[43] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1815
		barrelModel[44] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1816
		barrelModel[45] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1817
		barrelModel[46] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1818
		barrelModel[47] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1820
		barrelModel[48] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1821
		barrelModel[49] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1822
		barrelModel[50] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1823
		barrelModel[51] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1824
		barrelModel[52] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1825
		barrelModel[53] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1826
		barrelModel[54] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1827
		barrelModel[55] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1828
		barrelModel[56] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1829
		barrelModel[57] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1830
		barrelModel[58] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1831
		barrelModel[59] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1832
		barrelModel[60] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1833
		barrelModel[61] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1834
		barrelModel[62] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1835
		barrelModel[63] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1836
		barrelModel[64] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1837
		barrelModel[65] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1838
		barrelModel[66] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1839
		barrelModel[67] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1840
		barrelModel[68] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1841
		barrelModel[69] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1845
		barrelModel[70] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 1846

		barrelModel[0].addShapeBox(0F, -3F, -4.5F, 14, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[0].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[1].addShapeBox(0F, -5F, -4.5F, 14, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[1].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[2].addShapeBox(0F, 3F, -4.5F, 14, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 50
		barrelModel[2].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[3].addShapeBox(14F, -4F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[3].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[4].addShapeBox(14F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 52
		barrelModel[4].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[5].addShapeBox(14F, 0F, -4F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		barrelModel[5].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[6].addShapeBox(14F, -4F, -4F, 13, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		barrelModel[6].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[7].addShapeBox(27F, -3F, 0F, 24, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		barrelModel[7].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[8].addShapeBox(27F, 0F, 0F, 24, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 56
		barrelModel[8].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[9].addShapeBox(27F, 0F, -3F, 24, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		barrelModel[9].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[10].addShapeBox(27F, -3F, -3F, 24, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[10].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[11].addShapeBox(51F, -2F, 0F, 41, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1783
		barrelModel[11].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[12].addShapeBox(51F, 0F, 0F, 41, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1784
		barrelModel[12].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[13].addShapeBox(51F, 0F, -2F, 41, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1785
		barrelModel[13].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[14].addShapeBox(51F, -2F, -2F, 41, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1786
		barrelModel[14].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[15].addShapeBox(92F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F); // Box 1787
		barrelModel[15].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[16].addShapeBox(92F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F); // Box 1788
		barrelModel[16].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[17].addShapeBox(92F, -2F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1789
		barrelModel[17].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[18].addShapeBox(92F, -2F, 0F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1790
		barrelModel[18].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[19].addShapeBox(92F, 0F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1791
		barrelModel[19].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[20].addShapeBox(92F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1792
		barrelModel[20].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[21].addShapeBox(92F, 0F, 0F, 2, 2, 2, 0F,0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1793
		barrelModel[21].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[22].addShapeBox(92F, 0F, -2F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1794
		barrelModel[22].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[23].addShapeBox(94F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F); // Box 1795
		barrelModel[23].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[24].addShapeBox(94F, 0F, 0F, 2, 2, 2, 0F,0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1796
		barrelModel[24].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[25].addShapeBox(94F, 0F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1797
		barrelModel[25].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[26].addShapeBox(94F, -2F, 0F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1798
		barrelModel[26].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[27].addShapeBox(96F, -2F, 0F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1799
		barrelModel[27].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[28].addShapeBox(96F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1800
		barrelModel[28].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[29].addShapeBox(96F, 0F, 0F, 2, 2, 2, 0F,0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1801
		barrelModel[29].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[30].addShapeBox(96F, 0F, -2F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1802
		barrelModel[30].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[31].addShapeBox(96F, 0F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1803
		barrelModel[31].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[32].addShapeBox(96F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F); // Box 1804
		barrelModel[32].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[33].addShapeBox(96F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F); // Box 1805
		barrelModel[33].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[34].addShapeBox(96F, -2F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1806
		barrelModel[34].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[35].addShapeBox(98F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1807
		barrelModel[35].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[36].addShapeBox(98F, 0F, -2F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1808
		barrelModel[36].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[37].addShapeBox(98F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F); // Box 1809
		barrelModel[37].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[38].addShapeBox(98F, -2F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1810
		barrelModel[38].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[39].addShapeBox(100F, -2F, 0F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1811
		barrelModel[39].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[40].addShapeBox(100F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1812
		barrelModel[40].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[41].addShapeBox(100F, 0F, 0F, 2, 2, 2, 0F,0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1813
		barrelModel[41].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[42].addShapeBox(100F, 0F, -2F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1814
		barrelModel[42].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[43].addShapeBox(100F, 0F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1815
		barrelModel[43].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[44].addShapeBox(100F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.414F, 0F, 0F, -1.414F); // Box 1816
		barrelModel[44].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[45].addShapeBox(100F, -2F, -2F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1.414F, 0F, 0F, -1.414F, 0F); // Box 1817
		barrelModel[45].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[46].addShapeBox(100F, -2F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.414F, 0F, 0F, -1.414F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1818
		barrelModel[46].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[47].addShapeBox(0F, -9F, -2.5F, 20, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1820
		barrelModel[47].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[48].addShapeBox(20F, -9F, -2.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1821
		barrelModel[48].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[49].addShapeBox(20F, -8F, -2.5F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 1822
		barrelModel[49].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[50].addShapeBox(20F, -8F, 1.5F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 1823
		barrelModel[50].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[51].addShapeBox(15F, -5F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1824
		barrelModel[51].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[52].addShapeBox(17F, -5F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1825
		barrelModel[52].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[53].addShapeBox(19F, -5F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1826
		barrelModel[53].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[54].addShapeBox(7F, -10F, -1.5F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1827
		barrelModel[54].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[55].addShapeBox(18F, -10F, -1.5F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1828
		barrelModel[55].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[56].addShapeBox(21F, -8F, -1.5F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1829
		barrelModel[56].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[57].addShapeBox(21F, -7F, -1.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1830
		barrelModel[57].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[58].addShapeBox(21F, -6F, -1.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1831
		barrelModel[58].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[59].addShapeBox(1F, -10F, -1.5F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1832
		barrelModel[59].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[60].addShapeBox(28F, -4F, -2F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1833
		barrelModel[60].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[61].addShapeBox(34F, -4F, -2F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1834
		barrelModel[61].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[62].addShapeBox(40F, -4F, -2F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1835
		barrelModel[62].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[63].addShapeBox(46F, -4F, -2F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1836
		barrelModel[63].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[64].addShapeBox(32F, -4F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1837
		barrelModel[64].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[65].addShapeBox(44F, -4F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1838
		barrelModel[65].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[66].addShapeBox(28F, 2F, -2F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1839
		barrelModel[66].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[67].addShapeBox(32F, 2F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1840
		barrelModel[67].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[68].addShapeBox(34F, 2F, -2F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1841
		barrelModel[68].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[69].addShapeBox(80F, 1.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1845
		barrelModel[69].setRotationPoint(19F, -25.5F, 0F);

		barrelModel[70].addShapeBox(79F, 3.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1846
		barrelModel[70].setRotationPoint(19F, -25.5F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox677
		leftTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox678
		leftTrackModel[2] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox679
		leftTrackModel[3] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox680
		leftTrackModel[4] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox681
		leftTrackModel[5] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox682
		leftTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox683
		leftTrackModel[7] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox684
		leftTrackModel[8] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox685
		leftTrackModel[9] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox686
		leftTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox687
		leftTrackModel[11] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox688
		leftTrackModel[12] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox689
		leftTrackModel[13] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox690
		leftTrackModel[14] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox691
		leftTrackModel[15] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox692
		leftTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox693
		leftTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox694
		leftTrackModel[18] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox695
		leftTrackModel[19] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox696
		leftTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox697
		leftTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox698
		leftTrackModel[22] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox699
		leftTrackModel[23] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox700
		leftTrackModel[24] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox701
		leftTrackModel[25] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox702
		leftTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox703
		leftTrackModel[27] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox704
		leftTrackModel[28] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox705
		leftTrackModel[29] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox706
		leftTrackModel[30] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox707
		leftTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox708
		leftTrackModel[32] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox709
		leftTrackModel[33] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox710
		leftTrackModel[34] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox711
		leftTrackModel[35] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox712
		leftTrackModel[36] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox713
		leftTrackModel[37] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox714
		leftTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox715
		leftTrackModel[39] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox716
		leftTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox717
		leftTrackModel[41] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox718
		leftTrackModel[42] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox719
		leftTrackModel[43] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportBox720
		leftTrackModel[44] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportBox721
		leftTrackModel[45] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox722
		leftTrackModel[46] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox723
		leftTrackModel[47] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox724
		leftTrackModel[48] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox725
		leftTrackModel[49] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox726
		leftTrackModel[50] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox727
		leftTrackModel[51] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox728
		leftTrackModel[52] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox729
		leftTrackModel[53] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox730
		leftTrackModel[54] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox731
		leftTrackModel[55] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox732
		leftTrackModel[56] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox733
		leftTrackModel[57] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox734
		leftTrackModel[58] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox735
		leftTrackModel[59] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox736
		leftTrackModel[60] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox737
		leftTrackModel[61] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox738
		leftTrackModel[62] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox739
		leftTrackModel[63] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox740
		leftTrackModel[64] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox741
		leftTrackModel[65] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox742
		leftTrackModel[66] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox743
		leftTrackModel[67] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox744
		leftTrackModel[68] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox745
		leftTrackModel[69] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox746
		leftTrackModel[70] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox747
		leftTrackModel[71] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox748
		leftTrackModel[72] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox749
		leftTrackModel[73] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox750
		leftTrackModel[74] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox751
		leftTrackModel[75] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox752
		leftTrackModel[76] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox753
		leftTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox754
		leftTrackModel[78] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox755
		leftTrackModel[79] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox756
		leftTrackModel[80] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox757
		leftTrackModel[81] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox758
		leftTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox759
		leftTrackModel[83] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox760
		leftTrackModel[84] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox761
		leftTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox762
		leftTrackModel[86] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox763
		leftTrackModel[87] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox764
		leftTrackModel[88] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox765
		leftTrackModel[89] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox766
		leftTrackModel[90] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox767
		leftTrackModel[91] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox768
		leftTrackModel[92] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox769
		leftTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox770
		leftTrackModel[94] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox771
		leftTrackModel[95] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox772
		leftTrackModel[96] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox773
		leftTrackModel[97] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox774
		leftTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox775
		leftTrackModel[99] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox776
		leftTrackModel[100] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox777
		leftTrackModel[101] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox778
		leftTrackModel[102] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox779
		leftTrackModel[103] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox780
		leftTrackModel[104] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox781
		leftTrackModel[105] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox782
		leftTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox783
		leftTrackModel[107] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox784
		leftTrackModel[108] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox785
		leftTrackModel[109] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox786
		leftTrackModel[110] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox787
		leftTrackModel[111] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox788
		leftTrackModel[112] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox789
		leftTrackModel[113] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox790
		leftTrackModel[114] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox791
		leftTrackModel[115] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox792
		leftTrackModel[116] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox793
		leftTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox794
		leftTrackModel[118] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox795
		leftTrackModel[119] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox796
		leftTrackModel[120] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox797
		leftTrackModel[121] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox798
		leftTrackModel[122] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox799
		leftTrackModel[123] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox800
		leftTrackModel[124] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox801
		leftTrackModel[125] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox802
		leftTrackModel[126] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox803
		leftTrackModel[127] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox804
		leftTrackModel[128] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox805
		leftTrackModel[129] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox806
		leftTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox807
		leftTrackModel[131] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox808
		leftTrackModel[132] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox809
		leftTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox810
		leftTrackModel[134] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox811
		leftTrackModel[135] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox812
		leftTrackModel[136] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox813
		leftTrackModel[137] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox814
		leftTrackModel[138] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox815
		leftTrackModel[139] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox816
		leftTrackModel[140] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox817
		leftTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox818
		leftTrackModel[142] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox819
		leftTrackModel[143] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox820
		leftTrackModel[144] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox821
		leftTrackModel[145] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox822
		leftTrackModel[146] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox823
		leftTrackModel[147] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox824
		leftTrackModel[148] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox825
		leftTrackModel[149] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox826
		leftTrackModel[150] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox827
		leftTrackModel[151] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox828
		leftTrackModel[152] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox829
		leftTrackModel[153] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox830
		leftTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox831
		leftTrackModel[155] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox832
		leftTrackModel[156] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox833
		leftTrackModel[157] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox834
		leftTrackModel[158] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox835
		leftTrackModel[159] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox836
		leftTrackModel[160] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox837
		leftTrackModel[161] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox838
		leftTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox839
		leftTrackModel[163] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox840
		leftTrackModel[164] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox841
		leftTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox842
		leftTrackModel[166] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox843
		leftTrackModel[167] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox844
		leftTrackModel[168] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox845
		leftTrackModel[169] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox846
		leftTrackModel[170] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox847
		leftTrackModel[171] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox848
		leftTrackModel[172] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox849
		leftTrackModel[173] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox850
		leftTrackModel[174] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox851
		leftTrackModel[175] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox852
		leftTrackModel[176] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox853
		leftTrackModel[177] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox854
		leftTrackModel[178] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox855
		leftTrackModel[179] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox856
		leftTrackModel[180] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox857
		leftTrackModel[181] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox858
		leftTrackModel[182] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox859
		leftTrackModel[183] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox860
		leftTrackModel[184] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox861
		leftTrackModel[185] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox862
		leftTrackModel[186] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox863
		leftTrackModel[187] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox864
		leftTrackModel[188] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox865
		leftTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox866
		leftTrackModel[190] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox867
		leftTrackModel[191] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox868
		leftTrackModel[192] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox869
		leftTrackModel[193] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox870
		leftTrackModel[194] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox871
		leftTrackModel[195] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox872
		leftTrackModel[196] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox873
		leftTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox874
		leftTrackModel[198] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox875
		leftTrackModel[199] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox876
		leftTrackModel[200] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox877
		leftTrackModel[201] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox878
		leftTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox879
		leftTrackModel[203] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox880
		leftTrackModel[204] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox881
		leftTrackModel[205] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox882
		leftTrackModel[206] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox883
		leftTrackModel[207] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox884
		leftTrackModel[208] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox885
		leftTrackModel[209] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox886
		leftTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox887
		leftTrackModel[211] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox888
		leftTrackModel[212] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox889
		leftTrackModel[213] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox890
		leftTrackModel[214] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox891
		leftTrackModel[215] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox892
		leftTrackModel[216] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox893
		leftTrackModel[217] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox894
		leftTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox895
		leftTrackModel[219] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox896
		leftTrackModel[220] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox897
		leftTrackModel[221] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox898
		leftTrackModel[222] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox899
		leftTrackModel[223] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox900
		leftTrackModel[224] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox901
		leftTrackModel[225] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox902
		leftTrackModel[226] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox903
		leftTrackModel[227] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox904
		leftTrackModel[228] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox905
		leftTrackModel[229] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox906
		leftTrackModel[230] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox907
		leftTrackModel[231] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox908
		leftTrackModel[232] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox909
		leftTrackModel[233] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox910
		leftTrackModel[234] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox911
		leftTrackModel[235] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox912
		leftTrackModel[236] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox913
		leftTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox914
		leftTrackModel[238] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox915
		leftTrackModel[239] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox916
		leftTrackModel[240] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox917
		leftTrackModel[241] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox918
		leftTrackModel[242] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox919
		leftTrackModel[243] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox920
		leftTrackModel[244] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox921
		leftTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox922
		leftTrackModel[246] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox923
		leftTrackModel[247] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox924
		leftTrackModel[248] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox925
		leftTrackModel[249] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox926
		leftTrackModel[250] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox927
		leftTrackModel[251] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox928
		leftTrackModel[252] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox929
		leftTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox930
		leftTrackModel[254] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox931
		leftTrackModel[255] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox932
		leftTrackModel[256] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox933
		leftTrackModel[257] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox934
		leftTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox935
		leftTrackModel[259] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox936
		leftTrackModel[260] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox937
		leftTrackModel[261] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox938
		leftTrackModel[262] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox939
		leftTrackModel[263] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox940
		leftTrackModel[264] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox941
		leftTrackModel[265] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox942
		leftTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox943
		leftTrackModel[267] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox944
		leftTrackModel[268] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox945
		leftTrackModel[269] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox946
		leftTrackModel[270] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox947
		leftTrackModel[271] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox948
		leftTrackModel[272] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox949
		leftTrackModel[273] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox950
		leftTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox951
		leftTrackModel[275] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox952
		leftTrackModel[276] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox953
		leftTrackModel[277] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox954
		leftTrackModel[278] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox955
		leftTrackModel[279] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox956
		leftTrackModel[280] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox957
		leftTrackModel[281] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox958
		leftTrackModel[282] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox959
		leftTrackModel[283] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox960
		leftTrackModel[284] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox961
		leftTrackModel[285] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox962
		leftTrackModel[286] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox963
		leftTrackModel[287] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox964
		leftTrackModel[288] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox965
		leftTrackModel[289] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox966
		leftTrackModel[290] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox967
		leftTrackModel[291] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox968
		leftTrackModel[292] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox969
		leftTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox970
		leftTrackModel[294] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox971
		leftTrackModel[295] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox972
		leftTrackModel[296] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox973
		leftTrackModel[297] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox974
		leftTrackModel[298] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox975
		leftTrackModel[299] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox976
		leftTrackModel[300] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox977
		leftTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox978
		leftTrackModel[302] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox979
		leftTrackModel[303] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox980
		leftTrackModel[304] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox981
		leftTrackModel[305] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox982
		leftTrackModel[306] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox983
		leftTrackModel[307] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox984
		leftTrackModel[308] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox985
		leftTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox986
		leftTrackModel[310] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox987
		leftTrackModel[311] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox988
		leftTrackModel[312] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox989
		leftTrackModel[313] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox990
		leftTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox991
		leftTrackModel[315] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox992
		leftTrackModel[316] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox993
		leftTrackModel[317] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox994
		leftTrackModel[318] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox995
		leftTrackModel[319] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox996
		leftTrackModel[320] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox997
		leftTrackModel[321] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox998
		leftTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox999
		leftTrackModel[323] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1000
		leftTrackModel[324] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1001
		leftTrackModel[325] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1002
		leftTrackModel[326] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1003
		leftTrackModel[327] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1004
		leftTrackModel[328] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1005
		leftTrackModel[329] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1006
		leftTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1007
		leftTrackModel[331] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1008
		leftTrackModel[332] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1009
		leftTrackModel[333] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1010
		leftTrackModel[334] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1011
		leftTrackModel[335] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1012
		leftTrackModel[336] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1013
		leftTrackModel[337] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1014
		leftTrackModel[338] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1015
		leftTrackModel[339] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1016
		leftTrackModel[340] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1017
		leftTrackModel[341] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1018
		leftTrackModel[342] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1019
		leftTrackModel[343] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1020
		leftTrackModel[344] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1021
		leftTrackModel[345] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1022
		leftTrackModel[346] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1023
		leftTrackModel[347] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1024
		leftTrackModel[348] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1025
		leftTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1026
		leftTrackModel[350] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1027
		leftTrackModel[351] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1028
		leftTrackModel[352] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1029
		leftTrackModel[353] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1030
		leftTrackModel[354] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1031
		leftTrackModel[355] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1032
		leftTrackModel[356] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1033
		leftTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1034
		leftTrackModel[358] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1035
		leftTrackModel[359] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1036
		leftTrackModel[360] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1037
		leftTrackModel[361] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1038
		leftTrackModel[362] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1039
		leftTrackModel[363] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1040
		leftTrackModel[364] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1041
		leftTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1042
		leftTrackModel[366] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1043
		leftTrackModel[367] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1044
		leftTrackModel[368] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1045
		leftTrackModel[369] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1046
		leftTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1047
		leftTrackModel[371] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1048
		leftTrackModel[372] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1049
		leftTrackModel[373] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1050
		leftTrackModel[374] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1051
		leftTrackModel[375] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1052
		leftTrackModel[376] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1053
		leftTrackModel[377] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1054
		leftTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1055
		leftTrackModel[379] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1056
		leftTrackModel[380] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1057
		leftTrackModel[381] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1058
		leftTrackModel[382] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1059
		leftTrackModel[383] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1060
		leftTrackModel[384] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1061
		leftTrackModel[385] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1062
		leftTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1063
		leftTrackModel[387] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1064
		leftTrackModel[388] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1065
		leftTrackModel[389] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1066
		leftTrackModel[390] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1067
		leftTrackModel[391] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1068
		leftTrackModel[392] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1069
		leftTrackModel[393] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1070
		leftTrackModel[394] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1071
		leftTrackModel[395] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1072
		leftTrackModel[396] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1073
		leftTrackModel[397] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1074
		leftTrackModel[398] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1075
		leftTrackModel[399] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1076
		leftTrackModel[400] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1077
		leftTrackModel[401] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1078
		leftTrackModel[402] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1079
		leftTrackModel[403] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1080
		leftTrackModel[404] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1081
		leftTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1082
		leftTrackModel[406] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1083
		leftTrackModel[407] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1084
		leftTrackModel[408] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1085
		leftTrackModel[409] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1086
		leftTrackModel[410] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1087
		leftTrackModel[411] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1088
		leftTrackModel[412] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1089
		leftTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1090
		leftTrackModel[414] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1091
		leftTrackModel[415] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1092
		leftTrackModel[416] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1093
		leftTrackModel[417] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1094
		leftTrackModel[418] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1095
		leftTrackModel[419] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1096
		leftTrackModel[420] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1097
		leftTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1098
		leftTrackModel[422] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1099
		leftTrackModel[423] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1100
		leftTrackModel[424] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1101
		leftTrackModel[425] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1102
		leftTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1103
		leftTrackModel[427] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1104
		leftTrackModel[428] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1105
		leftTrackModel[429] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1106
		leftTrackModel[430] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1107
		leftTrackModel[431] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1108
		leftTrackModel[432] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1109
		leftTrackModel[433] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1110
		leftTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1111
		leftTrackModel[435] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1112
		leftTrackModel[436] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1113
		leftTrackModel[437] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1114
		leftTrackModel[438] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1115
		leftTrackModel[439] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1116
		leftTrackModel[440] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1117
		leftTrackModel[441] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1118
		leftTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1119
		leftTrackModel[443] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1120
		leftTrackModel[444] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1121
		leftTrackModel[445] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1122
		leftTrackModel[446] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1123
		leftTrackModel[447] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1124
		leftTrackModel[448] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1125
		leftTrackModel[449] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1126
		leftTrackModel[450] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1127
		leftTrackModel[451] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1128
		leftTrackModel[452] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1129
		leftTrackModel[453] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1130
		leftTrackModel[454] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1131
		leftTrackModel[455] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1132
		leftTrackModel[456] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1133
		leftTrackModel[457] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1134
		leftTrackModel[458] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1135
		leftTrackModel[459] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1136
		leftTrackModel[460] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1137
		leftTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1138
		leftTrackModel[462] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1139
		leftTrackModel[463] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1140
		leftTrackModel[464] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1141
		leftTrackModel[465] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1142
		leftTrackModel[466] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1143
		leftTrackModel[467] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1144
		leftTrackModel[468] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1145
		leftTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1146
		leftTrackModel[470] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1147
		leftTrackModel[471] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1148
		leftTrackModel[472] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1149
		leftTrackModel[473] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1150
		leftTrackModel[474] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1151
		leftTrackModel[475] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1152
		leftTrackModel[476] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1153
		leftTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1154
		leftTrackModel[478] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1155
		leftTrackModel[479] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1156
		leftTrackModel[480] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1157
		leftTrackModel[481] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1158
		leftTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1159
		leftTrackModel[483] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1160
		leftTrackModel[484] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1161
		leftTrackModel[485] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1162
		leftTrackModel[486] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1163
		leftTrackModel[487] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1164
		leftTrackModel[488] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1165
		leftTrackModel[489] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1166
		leftTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1167
		leftTrackModel[491] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1168
		leftTrackModel[492] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1169
		leftTrackModel[493] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1170
		leftTrackModel[494] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1171
		leftTrackModel[495] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1172
		leftTrackModel[496] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1173
		leftTrackModel[497] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1174
		leftTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1175
		leftTrackModel[499] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1176

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox677
		leftTrackModel[0].setRotationPoint(45F, -6F, 18.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox678
		leftTrackModel[1].setRotationPoint(45F, -8F, 18.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox679
		leftTrackModel[2].setRotationPoint(46F, -9F, 18.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox680
		leftTrackModel[3].setRotationPoint(45F, -3F, 18.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox681
		leftTrackModel[4].setRotationPoint(46F, -1F, 18.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox682
		leftTrackModel[5].setRotationPoint(35F, -1F, 18.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox683
		leftTrackModel[6].setRotationPoint(34F, 0F, 18.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox684
		leftTrackModel[7].setRotationPoint(34F, 2F, 18.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox685
		leftTrackModel[8].setRotationPoint(34F, 5F, 18.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox686
		leftTrackModel[9].setRotationPoint(35F, 7F, 18.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox687
		leftTrackModel[10].setRotationPoint(22F, -1F, 18.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox688
		leftTrackModel[11].setRotationPoint(21F, 0F, 18.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox689
		leftTrackModel[12].setRotationPoint(21F, 2F, 18.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox690
		leftTrackModel[13].setRotationPoint(21F, 5F, 18.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox691
		leftTrackModel[14].setRotationPoint(22F, 7F, 18.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox692
		leftTrackModel[15].setRotationPoint(9F, -1F, 18.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox693
		leftTrackModel[16].setRotationPoint(8F, 0F, 18.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox694
		leftTrackModel[17].setRotationPoint(8F, 2F, 18.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox695
		leftTrackModel[18].setRotationPoint(8F, 5F, 18.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox696
		leftTrackModel[19].setRotationPoint(9F, 7F, 18.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox697
		leftTrackModel[20].setRotationPoint(-40F, -1F, 18.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox698
		leftTrackModel[21].setRotationPoint(-41F, 0F, 18.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox699
		leftTrackModel[22].setRotationPoint(-41F, 2F, 18.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox700
		leftTrackModel[23].setRotationPoint(-41F, 5F, 18.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox701
		leftTrackModel[24].setRotationPoint(-40F, 7F, 18.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox702
		leftTrackModel[25].setRotationPoint(-27F, -1F, 18.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox703
		leftTrackModel[26].setRotationPoint(-28F, 0F, 18.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox704
		leftTrackModel[27].setRotationPoint(-28F, 2F, 18.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox705
		leftTrackModel[28].setRotationPoint(-28F, 5F, 18.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox706
		leftTrackModel[29].setRotationPoint(-27F, 7F, 18.5F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox707
		leftTrackModel[30].setRotationPoint(-14F, -1F, 18.5F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox708
		leftTrackModel[31].setRotationPoint(-15F, 0F, 18.5F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox709
		leftTrackModel[32].setRotationPoint(-15F, 2F, 18.5F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox710
		leftTrackModel[33].setRotationPoint(-15F, 5F, 18.5F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox711
		leftTrackModel[34].setRotationPoint(-14F, 7F, 18.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox712
		leftTrackModel[35].setRotationPoint(-48F, -1F, 18.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox713
		leftTrackModel[36].setRotationPoint(-49F, -6F, 18.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox714
		leftTrackModel[37].setRotationPoint(-49F, -3F, 18.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox715
		leftTrackModel[38].setRotationPoint(-49F, -8F, 18.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox716
		leftTrackModel[39].setRotationPoint(-48F, -9F, 18.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox717
		leftTrackModel[40].setRotationPoint(-2.5F, -1F, 18.5F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox718
		leftTrackModel[41].setRotationPoint(-3.5F, 0F, 18.5F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox719
		leftTrackModel[42].setRotationPoint(-3.5F, 2F, 18.5F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox720
		leftTrackModel[43].setRotationPoint(-3.5F, 5F, 18.5F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox721
		leftTrackModel[44].setRotationPoint(-2.5F, 7F, 18.5F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox722
		leftTrackModel[45].setRotationPoint(48F, -10F, 25.5F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox723
		leftTrackModel[46].setRotationPoint(48F, -10F, 17.5F);

		leftTrackModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox724
		leftTrackModel[47].setRotationPoint(48F, -10F, 25.5F);

		leftTrackModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox725
		leftTrackModel[48].setRotationPoint(48F, -10F, 17.5F);

		leftTrackModel[49].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox726
		leftTrackModel[49].setRotationPoint(48F, -10F, 16.5F);

		leftTrackModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox727
		leftTrackModel[50].setRotationPoint(48F, -10F, 21.5F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox728
		leftTrackModel[51].setRotationPoint(48F, -10F, 23.5F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox729
		leftTrackModel[52].setRotationPoint(48F, -10F, 20.5F);

		leftTrackModel[53].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox730
		leftTrackModel[53].setRotationPoint(51F, -10F, 16.5F);
		leftTrackModel[53].rotateAngleZ = -0.40142573F;

		leftTrackModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox731
		leftTrackModel[54].setRotationPoint(51F, -10F, 25.5F);
		leftTrackModel[54].rotateAngleZ = -0.40142573F;

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox732
		leftTrackModel[55].setRotationPoint(51F, -10F, 25.5F);
		leftTrackModel[55].rotateAngleZ = -0.40142573F;

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox733
		leftTrackModel[56].setRotationPoint(51F, -10F, 23.5F);
		leftTrackModel[56].rotateAngleZ = -0.40142573F;

		leftTrackModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox734
		leftTrackModel[57].setRotationPoint(51F, -10F, 21.5F);
		leftTrackModel[57].rotateAngleZ = -0.40142573F;

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox735
		leftTrackModel[58].setRotationPoint(51F, -10F, 20.5F);
		leftTrackModel[58].rotateAngleZ = -0.40142573F;

		leftTrackModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox736
		leftTrackModel[59].setRotationPoint(51F, -10F, 17.5F);
		leftTrackModel[59].rotateAngleZ = -0.40142573F;

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox737
		leftTrackModel[60].setRotationPoint(51F, -10F, 17.5F);
		leftTrackModel[60].rotateAngleZ = -0.40142573F;

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox738
		leftTrackModel[61].setRotationPoint(53.7F, -8.8F, 25.5F);
		leftTrackModel[61].rotateAngleZ = -1.02974426F;

		leftTrackModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox739
		leftTrackModel[62].setRotationPoint(53.7F, -8.8F, 25.5F);
		leftTrackModel[62].rotateAngleZ = -1.02974426F;

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox740
		leftTrackModel[63].setRotationPoint(53.7F, -8.8F, 23.5F);
		leftTrackModel[63].rotateAngleZ = -1.02974426F;

		leftTrackModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox741
		leftTrackModel[64].setRotationPoint(53.7F, -8.8F, 21.5F);
		leftTrackModel[64].rotateAngleZ = -1.02974426F;

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox742
		leftTrackModel[65].setRotationPoint(53.7F, -8.8F, 20.5F);
		leftTrackModel[65].rotateAngleZ = -1.02974426F;

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox743
		leftTrackModel[66].setRotationPoint(53.7F, -8.8F, 17.5F);
		leftTrackModel[66].rotateAngleZ = -1.02974426F;

		leftTrackModel[67].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox744
		leftTrackModel[67].setRotationPoint(53.7F, -8.8F, 17.5F);
		leftTrackModel[67].rotateAngleZ = -1.02974426F;

		leftTrackModel[68].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox745
		leftTrackModel[68].setRotationPoint(53.7F, -8.8F, 16.5F);
		leftTrackModel[68].rotateAngleZ = -1.02974426F;

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox746
		leftTrackModel[69].setRotationPoint(55.25F, -6.25F, 25.5F);
		leftTrackModel[69].rotateAngleZ = -1.57079633F;

		leftTrackModel[70].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox747
		leftTrackModel[70].setRotationPoint(55.25F, -6.25F, 25.5F);
		leftTrackModel[70].rotateAngleZ = -1.57079633F;

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox748
		leftTrackModel[71].setRotationPoint(55.25F, -6.25F, 23.5F);
		leftTrackModel[71].rotateAngleZ = -1.57079633F;

		leftTrackModel[72].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox749
		leftTrackModel[72].setRotationPoint(55.25F, -6.25F, 21.5F);
		leftTrackModel[72].rotateAngleZ = -1.57079633F;

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox750
		leftTrackModel[73].setRotationPoint(55.25F, -6.25F, 20.5F);
		leftTrackModel[73].rotateAngleZ = -1.57079633F;

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox751
		leftTrackModel[74].setRotationPoint(55.25F, -6.25F, 17.5F);
		leftTrackModel[74].rotateAngleZ = -1.57079633F;

		leftTrackModel[75].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox752
		leftTrackModel[75].setRotationPoint(55.25F, -6.25F, 17.5F);
		leftTrackModel[75].rotateAngleZ = -1.57079633F;

		leftTrackModel[76].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox753
		leftTrackModel[76].setRotationPoint(55.25F, -6.25F, 16.5F);
		leftTrackModel[76].rotateAngleZ = -1.57079633F;

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox754
		leftTrackModel[77].setRotationPoint(55.25F, -3.25F, 25.5F);
		leftTrackModel[77].rotateAngleZ = -2.07694181F;

		leftTrackModel[78].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox755
		leftTrackModel[78].setRotationPoint(55.25F, -3.25F, 25.5F);
		leftTrackModel[78].rotateAngleZ = -2.07694181F;

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox756
		leftTrackModel[79].setRotationPoint(55.25F, -3.25F, 23.5F);
		leftTrackModel[79].rotateAngleZ = -2.07694181F;

		leftTrackModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox757
		leftTrackModel[80].setRotationPoint(55.25F, -3.25F, 21.5F);
		leftTrackModel[80].rotateAngleZ = -2.07694181F;

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox758
		leftTrackModel[81].setRotationPoint(55.25F, -3.25F, 20.5F);
		leftTrackModel[81].rotateAngleZ = -2.07694181F;

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox759
		leftTrackModel[82].setRotationPoint(55.25F, -3.25F, 17.5F);
		leftTrackModel[82].rotateAngleZ = -2.07694181F;

		leftTrackModel[83].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox760
		leftTrackModel[83].setRotationPoint(55.25F, -3.25F, 17.5F);
		leftTrackModel[83].rotateAngleZ = -2.07694181F;

		leftTrackModel[84].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox761
		leftTrackModel[84].setRotationPoint(55.25F, -3.25F, 16.5F);
		leftTrackModel[84].rotateAngleZ = -2.07694181F;

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox762
		leftTrackModel[85].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[85].rotateAngleZ = -2.47836754F;

		leftTrackModel[86].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox763
		leftTrackModel[86].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[86].rotateAngleZ = -2.47836754F;

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox764
		leftTrackModel[87].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[87].rotateAngleZ = -2.47836754F;

		leftTrackModel[88].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox765
		leftTrackModel[88].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[88].rotateAngleZ = -2.47836754F;

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox766
		leftTrackModel[89].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[89].rotateAngleZ = -2.47836754F;

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox767
		leftTrackModel[90].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[90].rotateAngleZ = -2.47836754F;

		leftTrackModel[91].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox768
		leftTrackModel[91].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[91].rotateAngleZ = -2.47836754F;

		leftTrackModel[92].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox769
		leftTrackModel[92].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[92].rotateAngleZ = -2.47836754F;

		leftTrackModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox770
		leftTrackModel[93].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[93].rotateAngleZ = -2.47836754F;

		leftTrackModel[94].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox771
		leftTrackModel[94].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[94].rotateAngleZ = -2.47836754F;

		leftTrackModel[95].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox772
		leftTrackModel[95].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[95].rotateAngleZ = -2.47836754F;

		leftTrackModel[96].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox773
		leftTrackModel[96].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[96].rotateAngleZ = -2.47836754F;

		leftTrackModel[97].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox774
		leftTrackModel[97].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[97].rotateAngleZ = -2.47836754F;

		leftTrackModel[98].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox775
		leftTrackModel[98].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[98].rotateAngleZ = -2.47836754F;

		leftTrackModel[99].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox776
		leftTrackModel[99].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[99].rotateAngleZ = -2.47836754F;

		leftTrackModel[100].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox777
		leftTrackModel[100].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[100].rotateAngleZ = -2.47836754F;

		leftTrackModel[101].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox778
		leftTrackModel[101].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[101].rotateAngleZ = -2.47836754F;

		leftTrackModel[102].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox779
		leftTrackModel[102].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[102].rotateAngleZ = -2.47836754F;

		leftTrackModel[103].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox780
		leftTrackModel[103].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[103].rotateAngleZ = -2.47836754F;

		leftTrackModel[104].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox781
		leftTrackModel[104].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[104].rotateAngleZ = -2.47836754F;

		leftTrackModel[105].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox782
		leftTrackModel[105].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[105].rotateAngleZ = -2.47836754F;

		leftTrackModel[106].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox783
		leftTrackModel[106].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[106].rotateAngleZ = -2.47836754F;

		leftTrackModel[107].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox784
		leftTrackModel[107].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[107].rotateAngleZ = -2.47836754F;

		leftTrackModel[108].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox785
		leftTrackModel[108].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[108].rotateAngleZ = -2.47836754F;

		leftTrackModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox786
		leftTrackModel[109].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[109].rotateAngleZ = -2.47836754F;

		leftTrackModel[110].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox787
		leftTrackModel[110].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[110].rotateAngleZ = -2.47836754F;

		leftTrackModel[111].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox788
		leftTrackModel[111].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[111].rotateAngleZ = -2.47836754F;

		leftTrackModel[112].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox789
		leftTrackModel[112].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[112].rotateAngleZ = -2.47836754F;

		leftTrackModel[113].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox790
		leftTrackModel[113].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[113].rotateAngleZ = -2.47836754F;

		leftTrackModel[114].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox791
		leftTrackModel[114].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[114].rotateAngleZ = -2.47836754F;

		leftTrackModel[115].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox792
		leftTrackModel[115].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[115].rotateAngleZ = -2.47836754F;

		leftTrackModel[116].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox793
		leftTrackModel[116].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[116].rotateAngleZ = -2.47836754F;

		leftTrackModel[117].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox794
		leftTrackModel[117].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[117].rotateAngleZ = -2.47836754F;

		leftTrackModel[118].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox795
		leftTrackModel[118].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[118].rotateAngleZ = -2.47836754F;

		leftTrackModel[119].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox796
		leftTrackModel[119].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[119].rotateAngleZ = -2.47836754F;

		leftTrackModel[120].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox797
		leftTrackModel[120].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[120].rotateAngleZ = -2.47836754F;

		leftTrackModel[121].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox798
		leftTrackModel[121].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[121].rotateAngleZ = -2.47836754F;

		leftTrackModel[122].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox799
		leftTrackModel[122].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[122].rotateAngleZ = -2.47836754F;

		leftTrackModel[123].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox800
		leftTrackModel[123].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[123].rotateAngleZ = -2.47836754F;

		leftTrackModel[124].addShapeBox(14F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox801
		leftTrackModel[124].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[124].rotateAngleZ = -2.47836754F;

		leftTrackModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox802
		leftTrackModel[125].setRotationPoint(43.5F, 8.8F, 25.5F);
		leftTrackModel[125].rotateAngleZ = -3.08923278F;

		leftTrackModel[126].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox803
		leftTrackModel[126].setRotationPoint(43.5F, 8.8F, 25.5F);
		leftTrackModel[126].rotateAngleZ = -3.08923278F;

		leftTrackModel[127].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox804
		leftTrackModel[127].setRotationPoint(43.5F, 8.8F, 23.5F);
		leftTrackModel[127].rotateAngleZ = -3.08923278F;

		leftTrackModel[128].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox805
		leftTrackModel[128].setRotationPoint(43.5F, 8.8F, 21.5F);
		leftTrackModel[128].rotateAngleZ = -3.08923278F;

		leftTrackModel[129].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox806
		leftTrackModel[129].setRotationPoint(43.5F, 8.8F, 20.5F);
		leftTrackModel[129].rotateAngleZ = -3.08923278F;

		leftTrackModel[130].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox807
		leftTrackModel[130].setRotationPoint(43.5F, 8.8F, 17.5F);
		leftTrackModel[130].rotateAngleZ = -3.08923278F;

		leftTrackModel[131].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox808
		leftTrackModel[131].setRotationPoint(43.5F, 8.8F, 17.5F);
		leftTrackModel[131].rotateAngleZ = -3.08923278F;

		leftTrackModel[132].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox809
		leftTrackModel[132].setRotationPoint(43.5F, 8.8F, 16.5F);
		leftTrackModel[132].rotateAngleZ = -3.08923278F;

		leftTrackModel[133].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox810
		leftTrackModel[133].setRotationPoint(40.5F, 9F, 25.5F);
		leftTrackModel[133].rotateAngleZ = -3.14159265F;

		leftTrackModel[134].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox811
		leftTrackModel[134].setRotationPoint(40.5F, 9F, 25.5F);
		leftTrackModel[134].rotateAngleZ = -3.14159265F;

		leftTrackModel[135].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox812
		leftTrackModel[135].setRotationPoint(40.5F, 9F, 23.5F);
		leftTrackModel[135].rotateAngleZ = -3.14159265F;

		leftTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox813
		leftTrackModel[136].setRotationPoint(40.5F, 9F, 21.5F);
		leftTrackModel[136].rotateAngleZ = -3.14159265F;

		leftTrackModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox814
		leftTrackModel[137].setRotationPoint(40.5F, 9F, 20.5F);
		leftTrackModel[137].rotateAngleZ = -3.14159265F;

		leftTrackModel[138].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox815
		leftTrackModel[138].setRotationPoint(40.5F, 9F, 17.5F);
		leftTrackModel[138].rotateAngleZ = -3.14159265F;

		leftTrackModel[139].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox816
		leftTrackModel[139].setRotationPoint(40.5F, 9F, 17.5F);
		leftTrackModel[139].rotateAngleZ = -3.14159265F;

		leftTrackModel[140].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox817
		leftTrackModel[140].setRotationPoint(40.5F, 9F, 16.5F);
		leftTrackModel[140].rotateAngleZ = -3.14159265F;

		leftTrackModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox818
		leftTrackModel[141].setRotationPoint(37.5F, 9F, 25.5F);
		leftTrackModel[141].rotateAngleZ = -3.14159265F;

		leftTrackModel[142].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox819
		leftTrackModel[142].setRotationPoint(37.5F, 9F, 25.5F);
		leftTrackModel[142].rotateAngleZ = -3.14159265F;

		leftTrackModel[143].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox820
		leftTrackModel[143].setRotationPoint(37.5F, 9F, 23.5F);
		leftTrackModel[143].rotateAngleZ = -3.14159265F;

		leftTrackModel[144].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox821
		leftTrackModel[144].setRotationPoint(37.5F, 9F, 21.5F);
		leftTrackModel[144].rotateAngleZ = -3.14159265F;

		leftTrackModel[145].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox822
		leftTrackModel[145].setRotationPoint(37.5F, 9F, 20.5F);
		leftTrackModel[145].rotateAngleZ = -3.14159265F;

		leftTrackModel[146].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox823
		leftTrackModel[146].setRotationPoint(37.5F, 9F, 17.5F);
		leftTrackModel[146].rotateAngleZ = -3.14159265F;

		leftTrackModel[147].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox824
		leftTrackModel[147].setRotationPoint(37.5F, 9F, 17.5F);
		leftTrackModel[147].rotateAngleZ = -3.14159265F;

		leftTrackModel[148].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox825
		leftTrackModel[148].setRotationPoint(37.5F, 9F, 16.5F);
		leftTrackModel[148].rotateAngleZ = -3.14159265F;

		leftTrackModel[149].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox826
		leftTrackModel[149].setRotationPoint(34.5F, 9F, 25.5F);
		leftTrackModel[149].rotateAngleZ = -3.14159265F;

		leftTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox827
		leftTrackModel[150].setRotationPoint(34.5F, 9F, 25.5F);
		leftTrackModel[150].rotateAngleZ = -3.14159265F;

		leftTrackModel[151].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox828
		leftTrackModel[151].setRotationPoint(34.5F, 9F, 23.5F);
		leftTrackModel[151].rotateAngleZ = -3.14159265F;

		leftTrackModel[152].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox829
		leftTrackModel[152].setRotationPoint(34.5F, 9F, 21.5F);
		leftTrackModel[152].rotateAngleZ = -3.14159265F;

		leftTrackModel[153].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox830
		leftTrackModel[153].setRotationPoint(34.5F, 9F, 20.5F);
		leftTrackModel[153].rotateAngleZ = -3.14159265F;

		leftTrackModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox831
		leftTrackModel[154].setRotationPoint(34.5F, 9F, 17.5F);
		leftTrackModel[154].rotateAngleZ = -3.14159265F;

		leftTrackModel[155].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox832
		leftTrackModel[155].setRotationPoint(34.5F, 9F, 17.5F);
		leftTrackModel[155].rotateAngleZ = -3.14159265F;

		leftTrackModel[156].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox833
		leftTrackModel[156].setRotationPoint(34.5F, 9F, 16.5F);
		leftTrackModel[156].rotateAngleZ = -3.14159265F;

		leftTrackModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox834
		leftTrackModel[157].setRotationPoint(31.5F, 9F, 25.5F);
		leftTrackModel[157].rotateAngleZ = -3.14159265F;

		leftTrackModel[158].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox835
		leftTrackModel[158].setRotationPoint(31.5F, 9F, 25.5F);
		leftTrackModel[158].rotateAngleZ = -3.14159265F;

		leftTrackModel[159].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox836
		leftTrackModel[159].setRotationPoint(31.5F, 9F, 23.5F);
		leftTrackModel[159].rotateAngleZ = -3.14159265F;

		leftTrackModel[160].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox837
		leftTrackModel[160].setRotationPoint(31.5F, 9F, 21.5F);
		leftTrackModel[160].rotateAngleZ = -3.14159265F;

		leftTrackModel[161].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox838
		leftTrackModel[161].setRotationPoint(31.5F, 9F, 20.5F);
		leftTrackModel[161].rotateAngleZ = -3.14159265F;

		leftTrackModel[162].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox839
		leftTrackModel[162].setRotationPoint(31.5F, 9F, 17.5F);
		leftTrackModel[162].rotateAngleZ = -3.14159265F;

		leftTrackModel[163].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox840
		leftTrackModel[163].setRotationPoint(31.5F, 9F, 17.5F);
		leftTrackModel[163].rotateAngleZ = -3.14159265F;

		leftTrackModel[164].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox841
		leftTrackModel[164].setRotationPoint(31.5F, 9F, 16.5F);
		leftTrackModel[164].rotateAngleZ = -3.14159265F;

		leftTrackModel[165].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox842
		leftTrackModel[165].setRotationPoint(28.5F, 9F, 25.5F);
		leftTrackModel[165].rotateAngleZ = -3.14159265F;

		leftTrackModel[166].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox843
		leftTrackModel[166].setRotationPoint(28.5F, 9F, 25.5F);
		leftTrackModel[166].rotateAngleZ = -3.14159265F;

		leftTrackModel[167].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox844
		leftTrackModel[167].setRotationPoint(28.5F, 9F, 23.5F);
		leftTrackModel[167].rotateAngleZ = -3.14159265F;

		leftTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox845
		leftTrackModel[168].setRotationPoint(28.5F, 9F, 21.5F);
		leftTrackModel[168].rotateAngleZ = -3.14159265F;

		leftTrackModel[169].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox846
		leftTrackModel[169].setRotationPoint(28.5F, 9F, 20.5F);
		leftTrackModel[169].rotateAngleZ = -3.14159265F;

		leftTrackModel[170].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox847
		leftTrackModel[170].setRotationPoint(28.5F, 9F, 17.5F);
		leftTrackModel[170].rotateAngleZ = -3.14159265F;

		leftTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox848
		leftTrackModel[171].setRotationPoint(28.5F, 9F, 17.5F);
		leftTrackModel[171].rotateAngleZ = -3.14159265F;

		leftTrackModel[172].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox849
		leftTrackModel[172].setRotationPoint(28.5F, 9F, 16.5F);
		leftTrackModel[172].rotateAngleZ = -3.14159265F;

		leftTrackModel[173].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox850
		leftTrackModel[173].setRotationPoint(25.5F, 9F, 25.5F);
		leftTrackModel[173].rotateAngleZ = -3.14159265F;

		leftTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox851
		leftTrackModel[174].setRotationPoint(25.5F, 9F, 25.5F);
		leftTrackModel[174].rotateAngleZ = -3.14159265F;

		leftTrackModel[175].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox852
		leftTrackModel[175].setRotationPoint(25.5F, 9F, 23.5F);
		leftTrackModel[175].rotateAngleZ = -3.14159265F;

		leftTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox853
		leftTrackModel[176].setRotationPoint(25.5F, 9F, 21.5F);
		leftTrackModel[176].rotateAngleZ = -3.14159265F;

		leftTrackModel[177].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox854
		leftTrackModel[177].setRotationPoint(25.5F, 9F, 20.5F);
		leftTrackModel[177].rotateAngleZ = -3.14159265F;

		leftTrackModel[178].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox855
		leftTrackModel[178].setRotationPoint(25.5F, 9F, 17.5F);
		leftTrackModel[178].rotateAngleZ = -3.14159265F;

		leftTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox856
		leftTrackModel[179].setRotationPoint(25.5F, 9F, 17.5F);
		leftTrackModel[179].rotateAngleZ = -3.14159265F;

		leftTrackModel[180].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox857
		leftTrackModel[180].setRotationPoint(25.5F, 9F, 16.5F);
		leftTrackModel[180].rotateAngleZ = -3.14159265F;

		leftTrackModel[181].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox858
		leftTrackModel[181].setRotationPoint(22.5F, 9F, 25.5F);
		leftTrackModel[181].rotateAngleZ = -3.14159265F;

		leftTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox859
		leftTrackModel[182].setRotationPoint(22.5F, 9F, 25.5F);
		leftTrackModel[182].rotateAngleZ = -3.14159265F;

		leftTrackModel[183].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox860
		leftTrackModel[183].setRotationPoint(22.5F, 9F, 23.5F);
		leftTrackModel[183].rotateAngleZ = -3.14159265F;

		leftTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox861
		leftTrackModel[184].setRotationPoint(22.5F, 9F, 21.5F);
		leftTrackModel[184].rotateAngleZ = -3.14159265F;

		leftTrackModel[185].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox862
		leftTrackModel[185].setRotationPoint(22.5F, 9F, 20.5F);
		leftTrackModel[185].rotateAngleZ = -3.14159265F;

		leftTrackModel[186].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox863
		leftTrackModel[186].setRotationPoint(22.5F, 9F, 17.5F);
		leftTrackModel[186].rotateAngleZ = -3.14159265F;

		leftTrackModel[187].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox864
		leftTrackModel[187].setRotationPoint(22.5F, 9F, 17.5F);
		leftTrackModel[187].rotateAngleZ = -3.14159265F;

		leftTrackModel[188].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox865
		leftTrackModel[188].setRotationPoint(22.5F, 9F, 16.5F);
		leftTrackModel[188].rotateAngleZ = -3.14159265F;

		leftTrackModel[189].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox866
		leftTrackModel[189].setRotationPoint(19.5F, 9F, 25.5F);
		leftTrackModel[189].rotateAngleZ = -3.14159265F;

		leftTrackModel[190].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox867
		leftTrackModel[190].setRotationPoint(19.5F, 9F, 25.5F);
		leftTrackModel[190].rotateAngleZ = -3.14159265F;

		leftTrackModel[191].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox868
		leftTrackModel[191].setRotationPoint(19.5F, 9F, 23.5F);
		leftTrackModel[191].rotateAngleZ = -3.14159265F;

		leftTrackModel[192].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox869
		leftTrackModel[192].setRotationPoint(19.5F, 9F, 21.5F);
		leftTrackModel[192].rotateAngleZ = -3.14159265F;

		leftTrackModel[193].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox870
		leftTrackModel[193].setRotationPoint(19.5F, 9F, 20.5F);
		leftTrackModel[193].rotateAngleZ = -3.14159265F;

		leftTrackModel[194].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox871
		leftTrackModel[194].setRotationPoint(19.5F, 9F, 17.5F);
		leftTrackModel[194].rotateAngleZ = -3.14159265F;

		leftTrackModel[195].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox872
		leftTrackModel[195].setRotationPoint(19.5F, 9F, 17.5F);
		leftTrackModel[195].rotateAngleZ = -3.14159265F;

		leftTrackModel[196].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox873
		leftTrackModel[196].setRotationPoint(19.5F, 9F, 16.5F);
		leftTrackModel[196].rotateAngleZ = -3.14159265F;

		leftTrackModel[197].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox874
		leftTrackModel[197].setRotationPoint(16.5F, 9F, 25.5F);
		leftTrackModel[197].rotateAngleZ = -3.14159265F;

		leftTrackModel[198].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox875
		leftTrackModel[198].setRotationPoint(16.5F, 9F, 25.5F);
		leftTrackModel[198].rotateAngleZ = -3.14159265F;

		leftTrackModel[199].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox876
		leftTrackModel[199].setRotationPoint(16.5F, 9F, 23.5F);
		leftTrackModel[199].rotateAngleZ = -3.14159265F;

		leftTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox877
		leftTrackModel[200].setRotationPoint(16.5F, 9F, 21.5F);
		leftTrackModel[200].rotateAngleZ = -3.14159265F;

		leftTrackModel[201].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox878
		leftTrackModel[201].setRotationPoint(16.5F, 9F, 20.5F);
		leftTrackModel[201].rotateAngleZ = -3.14159265F;

		leftTrackModel[202].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox879
		leftTrackModel[202].setRotationPoint(16.5F, 9F, 17.5F);
		leftTrackModel[202].rotateAngleZ = -3.14159265F;

		leftTrackModel[203].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox880
		leftTrackModel[203].setRotationPoint(16.5F, 9F, 17.5F);
		leftTrackModel[203].rotateAngleZ = -3.14159265F;

		leftTrackModel[204].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox881
		leftTrackModel[204].setRotationPoint(16.5F, 9F, 16.5F);
		leftTrackModel[204].rotateAngleZ = -3.14159265F;

		leftTrackModel[205].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox882
		leftTrackModel[205].setRotationPoint(13.5F, 9F, 25.5F);
		leftTrackModel[205].rotateAngleZ = -3.14159265F;

		leftTrackModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox883
		leftTrackModel[206].setRotationPoint(13.5F, 9F, 25.5F);
		leftTrackModel[206].rotateAngleZ = -3.14159265F;

		leftTrackModel[207].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox884
		leftTrackModel[207].setRotationPoint(13.5F, 9F, 23.5F);
		leftTrackModel[207].rotateAngleZ = -3.14159265F;

		leftTrackModel[208].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox885
		leftTrackModel[208].setRotationPoint(13.5F, 9F, 21.5F);
		leftTrackModel[208].rotateAngleZ = -3.14159265F;

		leftTrackModel[209].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox886
		leftTrackModel[209].setRotationPoint(13.5F, 9F, 20.5F);
		leftTrackModel[209].rotateAngleZ = -3.14159265F;

		leftTrackModel[210].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox887
		leftTrackModel[210].setRotationPoint(13.5F, 9F, 17.5F);
		leftTrackModel[210].rotateAngleZ = -3.14159265F;

		leftTrackModel[211].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox888
		leftTrackModel[211].setRotationPoint(13.5F, 9F, 17.5F);
		leftTrackModel[211].rotateAngleZ = -3.14159265F;

		leftTrackModel[212].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox889
		leftTrackModel[212].setRotationPoint(13.5F, 9F, 16.5F);
		leftTrackModel[212].rotateAngleZ = -3.14159265F;

		leftTrackModel[213].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox890
		leftTrackModel[213].setRotationPoint(10.5F, 9F, 25.5F);
		leftTrackModel[213].rotateAngleZ = -3.14159265F;

		leftTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox891
		leftTrackModel[214].setRotationPoint(10.5F, 9F, 25.5F);
		leftTrackModel[214].rotateAngleZ = -3.14159265F;

		leftTrackModel[215].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox892
		leftTrackModel[215].setRotationPoint(10.5F, 9F, 23.5F);
		leftTrackModel[215].rotateAngleZ = -3.14159265F;

		leftTrackModel[216].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox893
		leftTrackModel[216].setRotationPoint(10.5F, 9F, 21.5F);
		leftTrackModel[216].rotateAngleZ = -3.14159265F;

		leftTrackModel[217].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox894
		leftTrackModel[217].setRotationPoint(10.5F, 9F, 20.5F);
		leftTrackModel[217].rotateAngleZ = -3.14159265F;

		leftTrackModel[218].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox895
		leftTrackModel[218].setRotationPoint(10.5F, 9F, 17.5F);
		leftTrackModel[218].rotateAngleZ = -3.14159265F;

		leftTrackModel[219].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox896
		leftTrackModel[219].setRotationPoint(10.5F, 9F, 17.5F);
		leftTrackModel[219].rotateAngleZ = -3.14159265F;

		leftTrackModel[220].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox897
		leftTrackModel[220].setRotationPoint(10.5F, 9F, 16.5F);
		leftTrackModel[220].rotateAngleZ = -3.14159265F;

		leftTrackModel[221].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox898
		leftTrackModel[221].setRotationPoint(7.5F, 9F, 25.5F);
		leftTrackModel[221].rotateAngleZ = -3.14159265F;

		leftTrackModel[222].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox899
		leftTrackModel[222].setRotationPoint(7.5F, 9F, 25.5F);
		leftTrackModel[222].rotateAngleZ = -3.14159265F;

		leftTrackModel[223].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox900
		leftTrackModel[223].setRotationPoint(7.5F, 9F, 23.5F);
		leftTrackModel[223].rotateAngleZ = -3.14159265F;

		leftTrackModel[224].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox901
		leftTrackModel[224].setRotationPoint(7.5F, 9F, 21.5F);
		leftTrackModel[224].rotateAngleZ = -3.14159265F;

		leftTrackModel[225].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox902
		leftTrackModel[225].setRotationPoint(7.5F, 9F, 20.5F);
		leftTrackModel[225].rotateAngleZ = -3.14159265F;

		leftTrackModel[226].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox903
		leftTrackModel[226].setRotationPoint(7.5F, 9F, 17.5F);
		leftTrackModel[226].rotateAngleZ = -3.14159265F;

		leftTrackModel[227].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox904
		leftTrackModel[227].setRotationPoint(7.5F, 9F, 17.5F);
		leftTrackModel[227].rotateAngleZ = -3.14159265F;

		leftTrackModel[228].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox905
		leftTrackModel[228].setRotationPoint(7.5F, 9F, 16.5F);
		leftTrackModel[228].rotateAngleZ = -3.14159265F;

		leftTrackModel[229].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox906
		leftTrackModel[229].setRotationPoint(4.5F, 9F, 25.5F);
		leftTrackModel[229].rotateAngleZ = -3.14159265F;

		leftTrackModel[230].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox907
		leftTrackModel[230].setRotationPoint(4.5F, 9F, 25.5F);
		leftTrackModel[230].rotateAngleZ = -3.14159265F;

		leftTrackModel[231].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox908
		leftTrackModel[231].setRotationPoint(4.5F, 9F, 23.5F);
		leftTrackModel[231].rotateAngleZ = -3.14159265F;

		leftTrackModel[232].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox909
		leftTrackModel[232].setRotationPoint(4.5F, 9F, 21.5F);
		leftTrackModel[232].rotateAngleZ = -3.14159265F;

		leftTrackModel[233].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox910
		leftTrackModel[233].setRotationPoint(4.5F, 9F, 20.5F);
		leftTrackModel[233].rotateAngleZ = -3.14159265F;

		leftTrackModel[234].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox911
		leftTrackModel[234].setRotationPoint(4.5F, 9F, 17.5F);
		leftTrackModel[234].rotateAngleZ = -3.14159265F;

		leftTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox912
		leftTrackModel[235].setRotationPoint(4.5F, 9F, 17.5F);
		leftTrackModel[235].rotateAngleZ = -3.14159265F;

		leftTrackModel[236].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox913
		leftTrackModel[236].setRotationPoint(4.5F, 9F, 16.5F);
		leftTrackModel[236].rotateAngleZ = -3.14159265F;

		leftTrackModel[237].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox914
		leftTrackModel[237].setRotationPoint(1.5F, 9F, 25.5F);
		leftTrackModel[237].rotateAngleZ = -3.14159265F;

		leftTrackModel[238].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox915
		leftTrackModel[238].setRotationPoint(1.5F, 9F, 25.5F);
		leftTrackModel[238].rotateAngleZ = -3.14159265F;

		leftTrackModel[239].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox916
		leftTrackModel[239].setRotationPoint(1.5F, 9F, 23.5F);
		leftTrackModel[239].rotateAngleZ = -3.14159265F;

		leftTrackModel[240].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox917
		leftTrackModel[240].setRotationPoint(1.5F, 9F, 21.5F);
		leftTrackModel[240].rotateAngleZ = -3.14159265F;

		leftTrackModel[241].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox918
		leftTrackModel[241].setRotationPoint(1.5F, 9F, 20.5F);
		leftTrackModel[241].rotateAngleZ = -3.14159265F;

		leftTrackModel[242].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox919
		leftTrackModel[242].setRotationPoint(1.5F, 9F, 17.5F);
		leftTrackModel[242].rotateAngleZ = -3.14159265F;

		leftTrackModel[243].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox920
		leftTrackModel[243].setRotationPoint(1.5F, 9F, 17.5F);
		leftTrackModel[243].rotateAngleZ = -3.14159265F;

		leftTrackModel[244].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox921
		leftTrackModel[244].setRotationPoint(1.5F, 9F, 16.5F);
		leftTrackModel[244].rotateAngleZ = -3.14159265F;

		leftTrackModel[245].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox922
		leftTrackModel[245].setRotationPoint(-1.5F, 9F, 25.5F);
		leftTrackModel[245].rotateAngleZ = -3.14159265F;

		leftTrackModel[246].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox923
		leftTrackModel[246].setRotationPoint(-1.5F, 9F, 25.5F);
		leftTrackModel[246].rotateAngleZ = -3.14159265F;

		leftTrackModel[247].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox924
		leftTrackModel[247].setRotationPoint(-1.5F, 9F, 23.5F);
		leftTrackModel[247].rotateAngleZ = -3.14159265F;

		leftTrackModel[248].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox925
		leftTrackModel[248].setRotationPoint(-1.5F, 9F, 21.5F);
		leftTrackModel[248].rotateAngleZ = -3.14159265F;

		leftTrackModel[249].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox926
		leftTrackModel[249].setRotationPoint(-1.5F, 9F, 20.5F);
		leftTrackModel[249].rotateAngleZ = -3.14159265F;

		leftTrackModel[250].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox927
		leftTrackModel[250].setRotationPoint(-1.5F, 9F, 17.5F);
		leftTrackModel[250].rotateAngleZ = -3.14159265F;

		leftTrackModel[251].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox928
		leftTrackModel[251].setRotationPoint(-1.5F, 9F, 17.5F);
		leftTrackModel[251].rotateAngleZ = -3.14159265F;

		leftTrackModel[252].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox929
		leftTrackModel[252].setRotationPoint(-1.5F, 9F, 16.5F);
		leftTrackModel[252].rotateAngleZ = -3.14159265F;

		leftTrackModel[253].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox930
		leftTrackModel[253].setRotationPoint(-4.5F, 9F, 25.5F);
		leftTrackModel[253].rotateAngleZ = -3.14159265F;

		leftTrackModel[254].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox931
		leftTrackModel[254].setRotationPoint(-4.5F, 9F, 25.5F);
		leftTrackModel[254].rotateAngleZ = -3.14159265F;

		leftTrackModel[255].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox932
		leftTrackModel[255].setRotationPoint(-4.5F, 9F, 23.5F);
		leftTrackModel[255].rotateAngleZ = -3.14159265F;

		leftTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox933
		leftTrackModel[256].setRotationPoint(-4.5F, 9F, 21.5F);
		leftTrackModel[256].rotateAngleZ = -3.14159265F;

		leftTrackModel[257].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox934
		leftTrackModel[257].setRotationPoint(-4.5F, 9F, 20.5F);
		leftTrackModel[257].rotateAngleZ = -3.14159265F;

		leftTrackModel[258].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox935
		leftTrackModel[258].setRotationPoint(-4.5F, 9F, 17.5F);
		leftTrackModel[258].rotateAngleZ = -3.14159265F;

		leftTrackModel[259].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox936
		leftTrackModel[259].setRotationPoint(-4.5F, 9F, 17.5F);
		leftTrackModel[259].rotateAngleZ = -3.14159265F;

		leftTrackModel[260].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox937
		leftTrackModel[260].setRotationPoint(-4.5F, 9F, 16.5F);
		leftTrackModel[260].rotateAngleZ = -3.14159265F;

		leftTrackModel[261].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox938
		leftTrackModel[261].setRotationPoint(-7.5F, 9F, 25.5F);
		leftTrackModel[261].rotateAngleZ = -3.14159265F;

		leftTrackModel[262].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox939
		leftTrackModel[262].setRotationPoint(-7.5F, 9F, 25.5F);
		leftTrackModel[262].rotateAngleZ = -3.14159265F;

		leftTrackModel[263].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox940
		leftTrackModel[263].setRotationPoint(-7.5F, 9F, 23.5F);
		leftTrackModel[263].rotateAngleZ = -3.14159265F;

		leftTrackModel[264].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox941
		leftTrackModel[264].setRotationPoint(-7.5F, 9F, 21.5F);
		leftTrackModel[264].rotateAngleZ = -3.14159265F;

		leftTrackModel[265].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox942
		leftTrackModel[265].setRotationPoint(-7.5F, 9F, 20.5F);
		leftTrackModel[265].rotateAngleZ = -3.14159265F;

		leftTrackModel[266].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox943
		leftTrackModel[266].setRotationPoint(-7.5F, 9F, 17.5F);
		leftTrackModel[266].rotateAngleZ = -3.14159265F;

		leftTrackModel[267].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox944
		leftTrackModel[267].setRotationPoint(-7.5F, 9F, 17.5F);
		leftTrackModel[267].rotateAngleZ = -3.14159265F;

		leftTrackModel[268].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox945
		leftTrackModel[268].setRotationPoint(-7.5F, 9F, 16.5F);
		leftTrackModel[268].rotateAngleZ = -3.14159265F;

		leftTrackModel[269].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox946
		leftTrackModel[269].setRotationPoint(-10.5F, 9F, 25.5F);
		leftTrackModel[269].rotateAngleZ = -3.14159265F;

		leftTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox947
		leftTrackModel[270].setRotationPoint(-10.5F, 9F, 25.5F);
		leftTrackModel[270].rotateAngleZ = -3.14159265F;

		leftTrackModel[271].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox948
		leftTrackModel[271].setRotationPoint(-10.5F, 9F, 23.5F);
		leftTrackModel[271].rotateAngleZ = -3.14159265F;

		leftTrackModel[272].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox949
		leftTrackModel[272].setRotationPoint(-10.5F, 9F, 21.5F);
		leftTrackModel[272].rotateAngleZ = -3.14159265F;

		leftTrackModel[273].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox950
		leftTrackModel[273].setRotationPoint(-10.5F, 9F, 20.5F);
		leftTrackModel[273].rotateAngleZ = -3.14159265F;

		leftTrackModel[274].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox951
		leftTrackModel[274].setRotationPoint(-10.5F, 9F, 17.5F);
		leftTrackModel[274].rotateAngleZ = -3.14159265F;

		leftTrackModel[275].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox952
		leftTrackModel[275].setRotationPoint(-10.5F, 9F, 17.5F);
		leftTrackModel[275].rotateAngleZ = -3.14159265F;

		leftTrackModel[276].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox953
		leftTrackModel[276].setRotationPoint(-10.5F, 9F, 16.5F);
		leftTrackModel[276].rotateAngleZ = -3.14159265F;

		leftTrackModel[277].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox954
		leftTrackModel[277].setRotationPoint(-13.5F, 9F, 25.5F);
		leftTrackModel[277].rotateAngleZ = -3.14159265F;

		leftTrackModel[278].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox955
		leftTrackModel[278].setRotationPoint(-13.5F, 9F, 25.5F);
		leftTrackModel[278].rotateAngleZ = -3.14159265F;

		leftTrackModel[279].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox956
		leftTrackModel[279].setRotationPoint(-13.5F, 9F, 23.5F);
		leftTrackModel[279].rotateAngleZ = -3.14159265F;

		leftTrackModel[280].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox957
		leftTrackModel[280].setRotationPoint(-13.5F, 9F, 21.5F);
		leftTrackModel[280].rotateAngleZ = -3.14159265F;

		leftTrackModel[281].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox958
		leftTrackModel[281].setRotationPoint(-13.5F, 9F, 20.5F);
		leftTrackModel[281].rotateAngleZ = -3.14159265F;

		leftTrackModel[282].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox959
		leftTrackModel[282].setRotationPoint(-13.5F, 9F, 17.5F);
		leftTrackModel[282].rotateAngleZ = -3.14159265F;

		leftTrackModel[283].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox960
		leftTrackModel[283].setRotationPoint(-13.5F, 9F, 17.5F);
		leftTrackModel[283].rotateAngleZ = -3.14159265F;

		leftTrackModel[284].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox961
		leftTrackModel[284].setRotationPoint(-13.5F, 9F, 16.5F);
		leftTrackModel[284].rotateAngleZ = -3.14159265F;

		leftTrackModel[285].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox962
		leftTrackModel[285].setRotationPoint(-16.5F, 9F, 25.5F);
		leftTrackModel[285].rotateAngleZ = -3.14159265F;

		leftTrackModel[286].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox963
		leftTrackModel[286].setRotationPoint(-16.5F, 9F, 25.5F);
		leftTrackModel[286].rotateAngleZ = -3.14159265F;

		leftTrackModel[287].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox964
		leftTrackModel[287].setRotationPoint(-16.5F, 9F, 23.5F);
		leftTrackModel[287].rotateAngleZ = -3.14159265F;

		leftTrackModel[288].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox965
		leftTrackModel[288].setRotationPoint(-16.5F, 9F, 21.5F);
		leftTrackModel[288].rotateAngleZ = -3.14159265F;

		leftTrackModel[289].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox966
		leftTrackModel[289].setRotationPoint(-16.5F, 9F, 20.5F);
		leftTrackModel[289].rotateAngleZ = -3.14159265F;

		leftTrackModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox967
		leftTrackModel[290].setRotationPoint(-16.5F, 9F, 17.5F);
		leftTrackModel[290].rotateAngleZ = -3.14159265F;

		leftTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox968
		leftTrackModel[291].setRotationPoint(-16.5F, 9F, 17.5F);
		leftTrackModel[291].rotateAngleZ = -3.14159265F;

		leftTrackModel[292].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox969
		leftTrackModel[292].setRotationPoint(-16.5F, 9F, 16.5F);
		leftTrackModel[292].rotateAngleZ = -3.14159265F;

		leftTrackModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox970
		leftTrackModel[293].setRotationPoint(-19.5F, 9F, 25.5F);
		leftTrackModel[293].rotateAngleZ = -3.14159265F;

		leftTrackModel[294].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox971
		leftTrackModel[294].setRotationPoint(-19.5F, 9F, 25.5F);
		leftTrackModel[294].rotateAngleZ = -3.14159265F;

		leftTrackModel[295].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox972
		leftTrackModel[295].setRotationPoint(-19.5F, 9F, 23.5F);
		leftTrackModel[295].rotateAngleZ = -3.14159265F;

		leftTrackModel[296].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox973
		leftTrackModel[296].setRotationPoint(-19.5F, 9F, 21.5F);
		leftTrackModel[296].rotateAngleZ = -3.14159265F;

		leftTrackModel[297].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox974
		leftTrackModel[297].setRotationPoint(-19.5F, 9F, 20.5F);
		leftTrackModel[297].rotateAngleZ = -3.14159265F;

		leftTrackModel[298].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox975
		leftTrackModel[298].setRotationPoint(-19.5F, 9F, 17.5F);
		leftTrackModel[298].rotateAngleZ = -3.14159265F;

		leftTrackModel[299].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox976
		leftTrackModel[299].setRotationPoint(-19.5F, 9F, 17.5F);
		leftTrackModel[299].rotateAngleZ = -3.14159265F;

		leftTrackModel[300].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox977
		leftTrackModel[300].setRotationPoint(-19.5F, 9F, 16.5F);
		leftTrackModel[300].rotateAngleZ = -3.14159265F;

		leftTrackModel[301].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox978
		leftTrackModel[301].setRotationPoint(-22.5F, 9F, 25.5F);
		leftTrackModel[301].rotateAngleZ = -3.14159265F;

		leftTrackModel[302].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox979
		leftTrackModel[302].setRotationPoint(-22.5F, 9F, 25.5F);
		leftTrackModel[302].rotateAngleZ = -3.14159265F;

		leftTrackModel[303].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox980
		leftTrackModel[303].setRotationPoint(-22.5F, 9F, 23.5F);
		leftTrackModel[303].rotateAngleZ = -3.14159265F;

		leftTrackModel[304].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox981
		leftTrackModel[304].setRotationPoint(-22.5F, 9F, 21.5F);
		leftTrackModel[304].rotateAngleZ = -3.14159265F;

		leftTrackModel[305].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox982
		leftTrackModel[305].setRotationPoint(-22.5F, 9F, 20.5F);
		leftTrackModel[305].rotateAngleZ = -3.14159265F;

		leftTrackModel[306].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox983
		leftTrackModel[306].setRotationPoint(-22.5F, 9F, 17.5F);
		leftTrackModel[306].rotateAngleZ = -3.14159265F;

		leftTrackModel[307].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox984
		leftTrackModel[307].setRotationPoint(-22.5F, 9F, 17.5F);
		leftTrackModel[307].rotateAngleZ = -3.14159265F;

		leftTrackModel[308].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox985
		leftTrackModel[308].setRotationPoint(-22.5F, 9F, 16.5F);
		leftTrackModel[308].rotateAngleZ = -3.14159265F;

		leftTrackModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox986
		leftTrackModel[309].setRotationPoint(-26.5F, 9F, 25.5F);
		leftTrackModel[309].rotateAngleZ = -3.14159265F;

		leftTrackModel[310].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox987
		leftTrackModel[310].setRotationPoint(-26.5F, 9F, 25.5F);
		leftTrackModel[310].rotateAngleZ = -3.14159265F;

		leftTrackModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox988
		leftTrackModel[311].setRotationPoint(-26.5F, 9F, 23.5F);
		leftTrackModel[311].rotateAngleZ = -3.14159265F;

		leftTrackModel[312].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox989
		leftTrackModel[312].setRotationPoint(-26.5F, 9F, 21.5F);
		leftTrackModel[312].rotateAngleZ = -3.14159265F;

		leftTrackModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox990
		leftTrackModel[313].setRotationPoint(-26.5F, 9F, 20.5F);
		leftTrackModel[313].rotateAngleZ = -3.14159265F;

		leftTrackModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox991
		leftTrackModel[314].setRotationPoint(-26.5F, 9F, 17.5F);
		leftTrackModel[314].rotateAngleZ = -3.14159265F;

		leftTrackModel[315].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox992
		leftTrackModel[315].setRotationPoint(-26.5F, 9F, 17.5F);
		leftTrackModel[315].rotateAngleZ = -3.14159265F;

		leftTrackModel[316].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox993
		leftTrackModel[316].setRotationPoint(-26.5F, 9F, 16.5F);
		leftTrackModel[316].rotateAngleZ = -3.14159265F;

		leftTrackModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox994
		leftTrackModel[317].setRotationPoint(-29.5F, 9F, 25.5F);
		leftTrackModel[317].rotateAngleZ = -3.14159265F;

		leftTrackModel[318].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox995
		leftTrackModel[318].setRotationPoint(-29.5F, 9F, 25.5F);
		leftTrackModel[318].rotateAngleZ = -3.14159265F;

		leftTrackModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox996
		leftTrackModel[319].setRotationPoint(-29.5F, 9F, 23.5F);
		leftTrackModel[319].rotateAngleZ = -3.14159265F;

		leftTrackModel[320].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox997
		leftTrackModel[320].setRotationPoint(-29.5F, 9F, 21.5F);
		leftTrackModel[320].rotateAngleZ = -3.14159265F;

		leftTrackModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox998
		leftTrackModel[321].setRotationPoint(-29.5F, 9F, 20.5F);
		leftTrackModel[321].rotateAngleZ = -3.14159265F;

		leftTrackModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox999
		leftTrackModel[322].setRotationPoint(-29.5F, 9F, 17.5F);
		leftTrackModel[322].rotateAngleZ = -3.14159265F;

		leftTrackModel[323].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1000
		leftTrackModel[323].setRotationPoint(-29.5F, 9F, 17.5F);
		leftTrackModel[323].rotateAngleZ = -3.14159265F;

		leftTrackModel[324].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1001
		leftTrackModel[324].setRotationPoint(-29.5F, 9F, 16.5F);
		leftTrackModel[324].rotateAngleZ = -3.14159265F;

		leftTrackModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1002
		leftTrackModel[325].setRotationPoint(-32.5F, 9F, 25.5F);
		leftTrackModel[325].rotateAngleZ = -3.14159265F;

		leftTrackModel[326].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1003
		leftTrackModel[326].setRotationPoint(-32.5F, 9F, 25.5F);
		leftTrackModel[326].rotateAngleZ = -3.14159265F;

		leftTrackModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1004
		leftTrackModel[327].setRotationPoint(-32.5F, 9F, 23.5F);
		leftTrackModel[327].rotateAngleZ = -3.14159265F;

		leftTrackModel[328].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1005
		leftTrackModel[328].setRotationPoint(-32.5F, 9F, 21.5F);
		leftTrackModel[328].rotateAngleZ = -3.14159265F;

		leftTrackModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1006
		leftTrackModel[329].setRotationPoint(-32.5F, 9F, 20.5F);
		leftTrackModel[329].rotateAngleZ = -3.14159265F;

		leftTrackModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1007
		leftTrackModel[330].setRotationPoint(-32.5F, 9F, 17.5F);
		leftTrackModel[330].rotateAngleZ = -3.14159265F;

		leftTrackModel[331].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1008
		leftTrackModel[331].setRotationPoint(-32.5F, 9F, 17.5F);
		leftTrackModel[331].rotateAngleZ = -3.14159265F;

		leftTrackModel[332].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1009
		leftTrackModel[332].setRotationPoint(-32.5F, 9F, 16.5F);
		leftTrackModel[332].rotateAngleZ = -3.14159265F;

		leftTrackModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1010
		leftTrackModel[333].setRotationPoint(-35.5F, 9F, 25.5F);
		leftTrackModel[333].rotateAngleZ = -3.14159265F;

		leftTrackModel[334].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1011
		leftTrackModel[334].setRotationPoint(-35.5F, 9F, 25.5F);
		leftTrackModel[334].rotateAngleZ = -3.14159265F;

		leftTrackModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1012
		leftTrackModel[335].setRotationPoint(-35.5F, 9F, 23.5F);
		leftTrackModel[335].rotateAngleZ = -3.14159265F;

		leftTrackModel[336].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1013
		leftTrackModel[336].setRotationPoint(-35.5F, 9F, 21.5F);
		leftTrackModel[336].rotateAngleZ = -3.14159265F;

		leftTrackModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1014
		leftTrackModel[337].setRotationPoint(-35.5F, 9F, 20.5F);
		leftTrackModel[337].rotateAngleZ = -3.14159265F;

		leftTrackModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1015
		leftTrackModel[338].setRotationPoint(-35.5F, 9F, 17.5F);
		leftTrackModel[338].rotateAngleZ = -3.14159265F;

		leftTrackModel[339].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1016
		leftTrackModel[339].setRotationPoint(-35.5F, 9F, 17.5F);
		leftTrackModel[339].rotateAngleZ = -3.14159265F;

		leftTrackModel[340].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1017
		leftTrackModel[340].setRotationPoint(-35.5F, 9F, 16.5F);
		leftTrackModel[340].rotateAngleZ = -3.14159265F;

		leftTrackModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1018
		leftTrackModel[341].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[341].rotateAngleZ = -3.78736448F;

		leftTrackModel[342].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1019
		leftTrackModel[342].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[342].rotateAngleZ = -3.78736448F;

		leftTrackModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1020
		leftTrackModel[343].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[343].rotateAngleZ = -3.78736448F;

		leftTrackModel[344].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1021
		leftTrackModel[344].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[344].rotateAngleZ = -3.78736448F;

		leftTrackModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1022
		leftTrackModel[345].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[345].rotateAngleZ = -3.78736448F;

		leftTrackModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1023
		leftTrackModel[346].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[346].rotateAngleZ = -3.78736448F;

		leftTrackModel[347].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1024
		leftTrackModel[347].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[347].rotateAngleZ = -3.78736448F;

		leftTrackModel[348].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1025
		leftTrackModel[348].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[348].rotateAngleZ = -3.78736448F;

		leftTrackModel[349].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1026
		leftTrackModel[349].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[349].rotateAngleZ = -3.78736448F;

		leftTrackModel[350].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1027
		leftTrackModel[350].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[350].rotateAngleZ = -3.78736448F;

		leftTrackModel[351].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1028
		leftTrackModel[351].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[351].rotateAngleZ = -3.78736448F;

		leftTrackModel[352].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1029
		leftTrackModel[352].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[352].rotateAngleZ = -3.78736448F;

		leftTrackModel[353].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1030
		leftTrackModel[353].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[353].rotateAngleZ = -3.78736448F;

		leftTrackModel[354].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1031
		leftTrackModel[354].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[354].rotateAngleZ = -3.78736448F;

		leftTrackModel[355].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1032
		leftTrackModel[355].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[355].rotateAngleZ = -3.78736448F;

		leftTrackModel[356].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1033
		leftTrackModel[356].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[356].rotateAngleZ = -3.78736448F;

		leftTrackModel[357].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1034
		leftTrackModel[357].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[357].rotateAngleZ = -3.78736448F;

		leftTrackModel[358].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1035
		leftTrackModel[358].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[358].rotateAngleZ = -3.78736448F;

		leftTrackModel[359].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1036
		leftTrackModel[359].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[359].rotateAngleZ = -3.78736448F;

		leftTrackModel[360].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1037
		leftTrackModel[360].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[360].rotateAngleZ = -3.78736448F;

		leftTrackModel[361].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1038
		leftTrackModel[361].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[361].rotateAngleZ = -3.78736448F;

		leftTrackModel[362].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1039
		leftTrackModel[362].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[362].rotateAngleZ = -3.78736448F;

		leftTrackModel[363].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1040
		leftTrackModel[363].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[363].rotateAngleZ = -3.78736448F;

		leftTrackModel[364].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1041
		leftTrackModel[364].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[364].rotateAngleZ = -3.78736448F;

		leftTrackModel[365].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1042
		leftTrackModel[365].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[365].rotateAngleZ = -3.78736448F;

		leftTrackModel[366].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1043
		leftTrackModel[366].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[366].rotateAngleZ = -3.78736448F;

		leftTrackModel[367].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1044
		leftTrackModel[367].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[367].rotateAngleZ = -3.78736448F;

		leftTrackModel[368].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1045
		leftTrackModel[368].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[368].rotateAngleZ = -3.78736448F;

		leftTrackModel[369].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1046
		leftTrackModel[369].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[369].rotateAngleZ = -3.78736448F;

		leftTrackModel[370].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1047
		leftTrackModel[370].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[370].rotateAngleZ = -3.78736448F;

		leftTrackModel[371].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1048
		leftTrackModel[371].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[371].rotateAngleZ = -3.78736448F;

		leftTrackModel[372].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1049
		leftTrackModel[372].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[372].rotateAngleZ = -3.78736448F;

		leftTrackModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1050
		leftTrackModel[373].setRotationPoint(-48F, 1.8F, 25.5F);
		leftTrackModel[373].rotateAngleZ = -4.1887902F;

		leftTrackModel[374].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1051
		leftTrackModel[374].setRotationPoint(-48F, 1.8F, 25.5F);
		leftTrackModel[374].rotateAngleZ = -4.1887902F;

		leftTrackModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1052
		leftTrackModel[375].setRotationPoint(-48F, 1.8F, 23.5F);
		leftTrackModel[375].rotateAngleZ = -4.1887902F;

		leftTrackModel[376].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1053
		leftTrackModel[376].setRotationPoint(-48F, 1.8F, 21.5F);
		leftTrackModel[376].rotateAngleZ = -4.1887902F;

		leftTrackModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1054
		leftTrackModel[377].setRotationPoint(-48F, 1.8F, 20.5F);
		leftTrackModel[377].rotateAngleZ = -4.1887902F;

		leftTrackModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1055
		leftTrackModel[378].setRotationPoint(-48F, 1.8F, 17.5F);
		leftTrackModel[378].rotateAngleZ = -4.1887902F;

		leftTrackModel[379].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1056
		leftTrackModel[379].setRotationPoint(-48F, 1.8F, 17.5F);
		leftTrackModel[379].rotateAngleZ = -4.1887902F;

		leftTrackModel[380].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1057
		leftTrackModel[380].setRotationPoint(-48F, 1.8F, 16.5F);
		leftTrackModel[380].rotateAngleZ = -4.1887902F;

		leftTrackModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1058
		leftTrackModel[381].setRotationPoint(-49.5F, -0.8F, 25.5F);
		leftTrackModel[381].rotateAngleZ = -4.52040276F;

		leftTrackModel[382].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1059
		leftTrackModel[382].setRotationPoint(-49.5F, -0.8F, 25.5F);
		leftTrackModel[382].rotateAngleZ = -4.52040276F;

		leftTrackModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1060
		leftTrackModel[383].setRotationPoint(-49.5F, -0.8F, 23.5F);
		leftTrackModel[383].rotateAngleZ = -4.52040276F;

		leftTrackModel[384].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1061
		leftTrackModel[384].setRotationPoint(-49.5F, -0.8F, 21.5F);
		leftTrackModel[384].rotateAngleZ = -4.52040276F;

		leftTrackModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1062
		leftTrackModel[385].setRotationPoint(-49.5F, -0.8F, 20.5F);
		leftTrackModel[385].rotateAngleZ = -4.52040276F;

		leftTrackModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1063
		leftTrackModel[386].setRotationPoint(-49.5F, -0.8F, 17.5F);
		leftTrackModel[386].rotateAngleZ = -4.52040276F;

		leftTrackModel[387].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1064
		leftTrackModel[387].setRotationPoint(-49.5F, -0.8F, 17.5F);
		leftTrackModel[387].rotateAngleZ = -4.52040276F;

		leftTrackModel[388].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1065
		leftTrackModel[388].setRotationPoint(-49.5F, -0.8F, 16.5F);
		leftTrackModel[388].rotateAngleZ = -4.52040276F;

		leftTrackModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1066
		leftTrackModel[389].setRotationPoint(-50F, -3.6F, 25.5F);
		leftTrackModel[389].rotateAngleZ = -4.71238898F;

		leftTrackModel[390].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1067
		leftTrackModel[390].setRotationPoint(-50F, -3.6F, 25.5F);
		leftTrackModel[390].rotateAngleZ = -4.71238898F;

		leftTrackModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1068
		leftTrackModel[391].setRotationPoint(-50F, -3.6F, 23.5F);
		leftTrackModel[391].rotateAngleZ = -4.71238898F;

		leftTrackModel[392].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1069
		leftTrackModel[392].setRotationPoint(-50F, -3.6F, 21.5F);
		leftTrackModel[392].rotateAngleZ = -4.71238898F;

		leftTrackModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1070
		leftTrackModel[393].setRotationPoint(-50F, -3.6F, 20.5F);
		leftTrackModel[393].rotateAngleZ = -4.71238898F;

		leftTrackModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1071
		leftTrackModel[394].setRotationPoint(-50F, -3.6F, 17.5F);
		leftTrackModel[394].rotateAngleZ = -4.71238898F;

		leftTrackModel[395].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1072
		leftTrackModel[395].setRotationPoint(-50F, -3.6F, 17.5F);
		leftTrackModel[395].rotateAngleZ = -4.71238898F;

		leftTrackModel[396].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1073
		leftTrackModel[396].setRotationPoint(-50F, -3.6F, 16.5F);
		leftTrackModel[396].rotateAngleZ = -4.71238898F;

		leftTrackModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1074
		leftTrackModel[397].setRotationPoint(-50F, -6.6F, 25.5F);
		leftTrackModel[397].rotateAngleZ = -5.21853446F;

		leftTrackModel[398].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1075
		leftTrackModel[398].setRotationPoint(-50F, -6.6F, 25.5F);
		leftTrackModel[398].rotateAngleZ = -5.21853446F;

		leftTrackModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1076
		leftTrackModel[399].setRotationPoint(-50F, -6.6F, 23.5F);
		leftTrackModel[399].rotateAngleZ = -5.21853446F;

		leftTrackModel[400].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1077
		leftTrackModel[400].setRotationPoint(-50F, -6.6F, 21.5F);
		leftTrackModel[400].rotateAngleZ = -5.21853446F;

		leftTrackModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1078
		leftTrackModel[401].setRotationPoint(-50F, -6.6F, 20.5F);
		leftTrackModel[401].rotateAngleZ = -5.21853446F;

		leftTrackModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1079
		leftTrackModel[402].setRotationPoint(-50F, -6.6F, 17.5F);
		leftTrackModel[402].rotateAngleZ = -5.21853446F;

		leftTrackModel[403].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1080
		leftTrackModel[403].setRotationPoint(-50F, -6.6F, 17.5F);
		leftTrackModel[403].rotateAngleZ = -5.21853446F;

		leftTrackModel[404].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1081
		leftTrackModel[404].setRotationPoint(-50F, -6.6F, 16.5F);
		leftTrackModel[404].rotateAngleZ = -5.21853446F;

		leftTrackModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1082
		leftTrackModel[405].setRotationPoint(-48.6F, -9.2F, 25.5F);
		leftTrackModel[405].rotateAngleZ = 0.2443461F;

		leftTrackModel[406].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1083
		leftTrackModel[406].setRotationPoint(-48.6F, -9.2F, 25.5F);
		leftTrackModel[406].rotateAngleZ = 0.2443461F;

		leftTrackModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1084
		leftTrackModel[407].setRotationPoint(-48.6F, -9.2F, 23.5F);
		leftTrackModel[407].rotateAngleZ = 0.2443461F;

		leftTrackModel[408].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1085
		leftTrackModel[408].setRotationPoint(-48.6F, -9.2F, 21.5F);
		leftTrackModel[408].rotateAngleZ = 0.2443461F;

		leftTrackModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1086
		leftTrackModel[409].setRotationPoint(-48.6F, -9.2F, 20.5F);
		leftTrackModel[409].rotateAngleZ = 0.2443461F;

		leftTrackModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1087
		leftTrackModel[410].setRotationPoint(-48.6F, -9.2F, 17.5F);
		leftTrackModel[410].rotateAngleZ = 0.2443461F;

		leftTrackModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1088
		leftTrackModel[411].setRotationPoint(-48.6F, -9.2F, 17.5F);
		leftTrackModel[411].rotateAngleZ = 0.2443461F;

		leftTrackModel[412].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1089
		leftTrackModel[412].setRotationPoint(-48.6F, -9.2F, 16.5F);
		leftTrackModel[412].rotateAngleZ = 0.2443461F;

		leftTrackModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1090
		leftTrackModel[413].setRotationPoint(-46F, -10F, 25.5F);

		leftTrackModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1091
		leftTrackModel[414].setRotationPoint(-46F, -10F, 25.5F);

		leftTrackModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1092
		leftTrackModel[415].setRotationPoint(-46F, -10F, 23.5F);

		leftTrackModel[416].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1093
		leftTrackModel[416].setRotationPoint(-46F, -10F, 21.5F);

		leftTrackModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1094
		leftTrackModel[417].setRotationPoint(-46F, -10F, 20.5F);

		leftTrackModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1095
		leftTrackModel[418].setRotationPoint(-46F, -10F, 17.5F);

		leftTrackModel[419].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1096
		leftTrackModel[419].setRotationPoint(-46F, -10F, 17.5F);

		leftTrackModel[420].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1097
		leftTrackModel[420].setRotationPoint(-46F, -10F, 16.5F);

		leftTrackModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1098
		leftTrackModel[421].setRotationPoint(-43F, -10F, 25.5F);

		leftTrackModel[422].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1099
		leftTrackModel[422].setRotationPoint(-43F, -10F, 25.5F);

		leftTrackModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1100
		leftTrackModel[423].setRotationPoint(-43F, -10F, 23.5F);

		leftTrackModel[424].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1101
		leftTrackModel[424].setRotationPoint(-43F, -10F, 21.5F);

		leftTrackModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1102
		leftTrackModel[425].setRotationPoint(-43F, -10F, 20.5F);

		leftTrackModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1103
		leftTrackModel[426].setRotationPoint(-43F, -10F, 17.5F);

		leftTrackModel[427].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1104
		leftTrackModel[427].setRotationPoint(-43F, -10F, 17.5F);

		leftTrackModel[428].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1105
		leftTrackModel[428].setRotationPoint(-43F, -10F, 16.5F);

		leftTrackModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1106
		leftTrackModel[429].setRotationPoint(-40F, -10F, 25.5F);

		leftTrackModel[430].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1107
		leftTrackModel[430].setRotationPoint(-40F, -10F, 25.5F);

		leftTrackModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1108
		leftTrackModel[431].setRotationPoint(-40F, -10F, 23.5F);

		leftTrackModel[432].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1109
		leftTrackModel[432].setRotationPoint(-40F, -10F, 21.5F);

		leftTrackModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1110
		leftTrackModel[433].setRotationPoint(-40F, -10F, 20.5F);

		leftTrackModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1111
		leftTrackModel[434].setRotationPoint(-40F, -10F, 17.5F);

		leftTrackModel[435].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1112
		leftTrackModel[435].setRotationPoint(-40F, -10F, 17.5F);

		leftTrackModel[436].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1113
		leftTrackModel[436].setRotationPoint(-40F, -10F, 16.5F);

		leftTrackModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1114
		leftTrackModel[437].setRotationPoint(-37F, -10F, 25.5F);

		leftTrackModel[438].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1115
		leftTrackModel[438].setRotationPoint(-37F, -10F, 25.5F);

		leftTrackModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1116
		leftTrackModel[439].setRotationPoint(-37F, -10F, 23.5F);

		leftTrackModel[440].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1117
		leftTrackModel[440].setRotationPoint(-37F, -10F, 21.5F);

		leftTrackModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1118
		leftTrackModel[441].setRotationPoint(-37F, -10F, 20.5F);

		leftTrackModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1119
		leftTrackModel[442].setRotationPoint(-37F, -10F, 17.5F);

		leftTrackModel[443].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1120
		leftTrackModel[443].setRotationPoint(-37F, -10F, 17.5F);

		leftTrackModel[444].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1121
		leftTrackModel[444].setRotationPoint(-37F, -10F, 16.5F);

		leftTrackModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1122
		leftTrackModel[445].setRotationPoint(-34F, -10F, 25.5F);

		leftTrackModel[446].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1123
		leftTrackModel[446].setRotationPoint(-34F, -10F, 25.5F);

		leftTrackModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1124
		leftTrackModel[447].setRotationPoint(-34F, -10F, 23.5F);

		leftTrackModel[448].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1125
		leftTrackModel[448].setRotationPoint(-34F, -10F, 21.5F);

		leftTrackModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1126
		leftTrackModel[449].setRotationPoint(-34F, -10F, 20.5F);

		leftTrackModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1127
		leftTrackModel[450].setRotationPoint(-34F, -10F, 17.5F);

		leftTrackModel[451].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1128
		leftTrackModel[451].setRotationPoint(-34F, -10F, 17.5F);

		leftTrackModel[452].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1129
		leftTrackModel[452].setRotationPoint(-34F, -10F, 16.5F);

		leftTrackModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1130
		leftTrackModel[453].setRotationPoint(-31F, -10F, 25.5F);

		leftTrackModel[454].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1131
		leftTrackModel[454].setRotationPoint(-31F, -10F, 25.5F);

		leftTrackModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1132
		leftTrackModel[455].setRotationPoint(-31F, -10F, 23.5F);

		leftTrackModel[456].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1133
		leftTrackModel[456].setRotationPoint(-31F, -10F, 21.5F);

		leftTrackModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1134
		leftTrackModel[457].setRotationPoint(-31F, -10F, 20.5F);

		leftTrackModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1135
		leftTrackModel[458].setRotationPoint(-31F, -10F, 17.5F);

		leftTrackModel[459].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1136
		leftTrackModel[459].setRotationPoint(-31F, -10F, 17.5F);

		leftTrackModel[460].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1137
		leftTrackModel[460].setRotationPoint(-31F, -10F, 16.5F);

		leftTrackModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1138
		leftTrackModel[461].setRotationPoint(-28F, -10F, 25.5F);

		leftTrackModel[462].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1139
		leftTrackModel[462].setRotationPoint(-28F, -10F, 25.5F);

		leftTrackModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1140
		leftTrackModel[463].setRotationPoint(-28F, -10F, 23.5F);

		leftTrackModel[464].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1141
		leftTrackModel[464].setRotationPoint(-28F, -10F, 21.5F);

		leftTrackModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1142
		leftTrackModel[465].setRotationPoint(-28F, -10F, 20.5F);

		leftTrackModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1143
		leftTrackModel[466].setRotationPoint(-28F, -10F, 17.5F);

		leftTrackModel[467].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1144
		leftTrackModel[467].setRotationPoint(-28F, -10F, 17.5F);

		leftTrackModel[468].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1145
		leftTrackModel[468].setRotationPoint(-28F, -10F, 16.5F);

		leftTrackModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1146
		leftTrackModel[469].setRotationPoint(-25F, -10F, 25.5F);

		leftTrackModel[470].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1147
		leftTrackModel[470].setRotationPoint(-25F, -10F, 25.5F);

		leftTrackModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1148
		leftTrackModel[471].setRotationPoint(-25F, -10F, 23.5F);

		leftTrackModel[472].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1149
		leftTrackModel[472].setRotationPoint(-25F, -10F, 21.5F);

		leftTrackModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1150
		leftTrackModel[473].setRotationPoint(-25F, -10F, 20.5F);

		leftTrackModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1151
		leftTrackModel[474].setRotationPoint(-25F, -10F, 17.5F);

		leftTrackModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1152
		leftTrackModel[475].setRotationPoint(-25F, -10F, 17.5F);

		leftTrackModel[476].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1153
		leftTrackModel[476].setRotationPoint(-25F, -10F, 16.5F);

		leftTrackModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1154
		leftTrackModel[477].setRotationPoint(-22F, -10F, 25.5F);

		leftTrackModel[478].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1155
		leftTrackModel[478].setRotationPoint(-22F, -10F, 25.5F);

		leftTrackModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1156
		leftTrackModel[479].setRotationPoint(-22F, -10F, 23.5F);

		leftTrackModel[480].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1157
		leftTrackModel[480].setRotationPoint(-22F, -10F, 21.5F);

		leftTrackModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1158
		leftTrackModel[481].setRotationPoint(-22F, -10F, 20.5F);

		leftTrackModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1159
		leftTrackModel[482].setRotationPoint(-22F, -10F, 17.5F);

		leftTrackModel[483].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1160
		leftTrackModel[483].setRotationPoint(-22F, -10F, 17.5F);

		leftTrackModel[484].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1161
		leftTrackModel[484].setRotationPoint(-22F, -10F, 16.5F);

		leftTrackModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1162
		leftTrackModel[485].setRotationPoint(-19F, -10F, 25.5F);

		leftTrackModel[486].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1163
		leftTrackModel[486].setRotationPoint(-19F, -10F, 25.5F);

		leftTrackModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1164
		leftTrackModel[487].setRotationPoint(-19F, -10F, 23.5F);

		leftTrackModel[488].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1165
		leftTrackModel[488].setRotationPoint(-19F, -10F, 21.5F);

		leftTrackModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1166
		leftTrackModel[489].setRotationPoint(-19F, -10F, 20.5F);

		leftTrackModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1167
		leftTrackModel[490].setRotationPoint(-19F, -10F, 17.5F);

		leftTrackModel[491].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1168
		leftTrackModel[491].setRotationPoint(-19F, -10F, 17.5F);

		leftTrackModel[492].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1169
		leftTrackModel[492].setRotationPoint(-19F, -10F, 16.5F);

		leftTrackModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1170
		leftTrackModel[493].setRotationPoint(-16F, -10F, 25.5F);

		leftTrackModel[494].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1171
		leftTrackModel[494].setRotationPoint(-16F, -10F, 25.5F);

		leftTrackModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1172
		leftTrackModel[495].setRotationPoint(-16F, -10F, 23.5F);

		leftTrackModel[496].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1173
		leftTrackModel[496].setRotationPoint(-16F, -10F, 21.5F);

		leftTrackModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1174
		leftTrackModel[497].setRotationPoint(-16F, -10F, 20.5F);

		leftTrackModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1175
		leftTrackModel[498].setRotationPoint(-16F, -10F, 17.5F);

		leftTrackModel[499].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1176
		leftTrackModel[499].setRotationPoint(-16F, -10F, 17.5F);
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1177
		leftTrackModel[501] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1178
		leftTrackModel[502] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1179
		leftTrackModel[503] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1180
		leftTrackModel[504] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1181
		leftTrackModel[505] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1182
		leftTrackModel[506] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1183
		leftTrackModel[507] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1184
		leftTrackModel[508] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1185
		leftTrackModel[509] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1186
		leftTrackModel[510] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1187
		leftTrackModel[511] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1188
		leftTrackModel[512] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1189
		leftTrackModel[513] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1190
		leftTrackModel[514] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1191
		leftTrackModel[515] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1192
		leftTrackModel[516] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1193
		leftTrackModel[517] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1194
		leftTrackModel[518] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1195
		leftTrackModel[519] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1196
		leftTrackModel[520] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1197
		leftTrackModel[521] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1198
		leftTrackModel[522] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1199
		leftTrackModel[523] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1200
		leftTrackModel[524] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1201
		leftTrackModel[525] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1202
		leftTrackModel[526] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1203
		leftTrackModel[527] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1204
		leftTrackModel[528] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1205
		leftTrackModel[529] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1206
		leftTrackModel[530] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1207
		leftTrackModel[531] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1208
		leftTrackModel[532] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1209
		leftTrackModel[533] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1210
		leftTrackModel[534] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1211
		leftTrackModel[535] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1212
		leftTrackModel[536] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1213
		leftTrackModel[537] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1214
		leftTrackModel[538] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1215
		leftTrackModel[539] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1216
		leftTrackModel[540] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1217
		leftTrackModel[541] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1218
		leftTrackModel[542] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1219
		leftTrackModel[543] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1220
		leftTrackModel[544] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1221
		leftTrackModel[545] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1222
		leftTrackModel[546] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1223
		leftTrackModel[547] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1224
		leftTrackModel[548] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1225
		leftTrackModel[549] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1226
		leftTrackModel[550] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1227
		leftTrackModel[551] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1228
		leftTrackModel[552] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1229
		leftTrackModel[553] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1230
		leftTrackModel[554] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1231
		leftTrackModel[555] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1232
		leftTrackModel[556] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1233
		leftTrackModel[557] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1234
		leftTrackModel[558] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1235
		leftTrackModel[559] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1236
		leftTrackModel[560] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1237
		leftTrackModel[561] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1238
		leftTrackModel[562] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1239
		leftTrackModel[563] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1240
		leftTrackModel[564] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1241
		leftTrackModel[565] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1242
		leftTrackModel[566] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1243
		leftTrackModel[567] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1244
		leftTrackModel[568] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1245
		leftTrackModel[569] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1246
		leftTrackModel[570] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1247
		leftTrackModel[571] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1248
		leftTrackModel[572] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1249
		leftTrackModel[573] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1250
		leftTrackModel[574] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1251
		leftTrackModel[575] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1252
		leftTrackModel[576] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1253
		leftTrackModel[577] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1254
		leftTrackModel[578] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1255
		leftTrackModel[579] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1256
		leftTrackModel[580] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1257
		leftTrackModel[581] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1258
		leftTrackModel[582] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1259
		leftTrackModel[583] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1260
		leftTrackModel[584] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1261
		leftTrackModel[585] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1262
		leftTrackModel[586] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1263
		leftTrackModel[587] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1264
		leftTrackModel[588] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1265
		leftTrackModel[589] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1266
		leftTrackModel[590] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1267
		leftTrackModel[591] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1268
		leftTrackModel[592] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1269
		leftTrackModel[593] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1270
		leftTrackModel[594] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1271
		leftTrackModel[595] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1272
		leftTrackModel[596] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1273
		leftTrackModel[597] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1274
		leftTrackModel[598] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1275
		leftTrackModel[599] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1276
		leftTrackModel[600] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1277
		leftTrackModel[601] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1278
		leftTrackModel[602] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1279
		leftTrackModel[603] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1280
		leftTrackModel[604] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1281
		leftTrackModel[605] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1282
		leftTrackModel[606] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1283
		leftTrackModel[607] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1284
		leftTrackModel[608] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1285
		leftTrackModel[609] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1286
		leftTrackModel[610] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1287
		leftTrackModel[611] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1288
		leftTrackModel[612] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1289
		leftTrackModel[613] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1290
		leftTrackModel[614] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1291
		leftTrackModel[615] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1292
		leftTrackModel[616] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1293
		leftTrackModel[617] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1294
		leftTrackModel[618] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1295
		leftTrackModel[619] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1296
		leftTrackModel[620] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1297
		leftTrackModel[621] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1298
		leftTrackModel[622] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1299
		leftTrackModel[623] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1300
		leftTrackModel[624] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1301
		leftTrackModel[625] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1302
		leftTrackModel[626] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1303
		leftTrackModel[627] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1304
		leftTrackModel[628] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1305
		leftTrackModel[629] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1306
		leftTrackModel[630] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1307
		leftTrackModel[631] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1308
		leftTrackModel[632] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1309
		leftTrackModel[633] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1310
		leftTrackModel[634] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1311
		leftTrackModel[635] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1312
		leftTrackModel[636] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1313
		leftTrackModel[637] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1314
		leftTrackModel[638] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1315
		leftTrackModel[639] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1316
		leftTrackModel[640] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1317
		leftTrackModel[641] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1318
		leftTrackModel[642] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1319
		leftTrackModel[643] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1320
		leftTrackModel[644] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1321
		leftTrackModel[645] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1322
		leftTrackModel[646] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1323
		leftTrackModel[647] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1324
		leftTrackModel[648] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1325
		leftTrackModel[649] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1326
		leftTrackModel[650] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1327
		leftTrackModel[651] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1328
		leftTrackModel[652] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1329
		leftTrackModel[653] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1330
		leftTrackModel[654] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1331
		leftTrackModel[655] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1332
		leftTrackModel[656] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox1333
		leftTrackModel[657] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox1334
		leftTrackModel[658] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1335
		leftTrackModel[659] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox1336
		leftTrackModel[660] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox1337
		leftTrackModel[661] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1843
		leftTrackModel[662] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1844
		leftTrackModel[663] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1845
		leftTrackModel[664] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1846
		leftTrackModel[665] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1847
		leftTrackModel[666] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1848
		leftTrackModel[667] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1849
		leftTrackModel[668] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1850
		leftTrackModel[669] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1852
		leftTrackModel[670] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1861
		leftTrackModel[671] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1862
		leftTrackModel[672] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1863
		leftTrackModel[673] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1864
		leftTrackModel[674] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1865
		leftTrackModel[675] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1866
		leftTrackModel[676] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1867
		leftTrackModel[677] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1868
		leftTrackModel[678] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1869
		leftTrackModel[679] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1879
		leftTrackModel[680] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1880
		leftTrackModel[681] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1881
		leftTrackModel[682] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1882
		leftTrackModel[683] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1883
		leftTrackModel[684] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1884
		leftTrackModel[685] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1885
		leftTrackModel[686] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1886
		leftTrackModel[687] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1887
		leftTrackModel[688] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1897
		leftTrackModel[689] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1898
		leftTrackModel[690] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1899
		leftTrackModel[691] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1900
		leftTrackModel[692] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1901
		leftTrackModel[693] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1902
		leftTrackModel[694] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1903
		leftTrackModel[695] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1904
		leftTrackModel[696] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1905
		leftTrackModel[697] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1915
		leftTrackModel[698] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1916
		leftTrackModel[699] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1917
		leftTrackModel[700] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1918
		leftTrackModel[701] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1919
		leftTrackModel[702] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1920
		leftTrackModel[703] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1921
		leftTrackModel[704] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1922
		leftTrackModel[705] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1923
		leftTrackModel[706] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1933
		leftTrackModel[707] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1934
		leftTrackModel[708] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1935
		leftTrackModel[709] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1936
		leftTrackModel[710] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1937
		leftTrackModel[711] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1938
		leftTrackModel[712] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1939
		leftTrackModel[713] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1940
		leftTrackModel[714] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1941
		leftTrackModel[715] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1951
		leftTrackModel[716] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1952
		leftTrackModel[717] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1953
		leftTrackModel[718] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1954
		leftTrackModel[719] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1955
		leftTrackModel[720] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1956
		leftTrackModel[721] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1957
		leftTrackModel[722] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1958
		leftTrackModel[723] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1959
		leftTrackModel[724] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1969
		leftTrackModel[725] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1970
		leftTrackModel[726] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1971
		leftTrackModel[727] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1972
		leftTrackModel[728] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1973
		leftTrackModel[729] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1974
		leftTrackModel[730] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1975
		leftTrackModel[731] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1976
		leftTrackModel[732] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1977
		leftTrackModel[733] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1987
		leftTrackModel[734] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1988
		leftTrackModel[735] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1989
		leftTrackModel[736] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1990
		leftTrackModel[737] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1991
		leftTrackModel[738] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1992
		leftTrackModel[739] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1993
		leftTrackModel[740] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1994
		leftTrackModel[741] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1995

		leftTrackModel[500].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1177
		leftTrackModel[500].setRotationPoint(-16F, -10F, 16.5F);

		leftTrackModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1178
		leftTrackModel[501].setRotationPoint(-13F, -10F, 25.5F);

		leftTrackModel[502].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1179
		leftTrackModel[502].setRotationPoint(-13F, -10F, 25.5F);

		leftTrackModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1180
		leftTrackModel[503].setRotationPoint(-13F, -10F, 23.5F);

		leftTrackModel[504].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1181
		leftTrackModel[504].setRotationPoint(-13F, -10F, 21.5F);

		leftTrackModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1182
		leftTrackModel[505].setRotationPoint(-13F, -10F, 20.5F);

		leftTrackModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1183
		leftTrackModel[506].setRotationPoint(-13F, -10F, 17.5F);

		leftTrackModel[507].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1184
		leftTrackModel[507].setRotationPoint(-13F, -10F, 17.5F);

		leftTrackModel[508].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1185
		leftTrackModel[508].setRotationPoint(-13F, -10F, 16.5F);

		leftTrackModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1186
		leftTrackModel[509].setRotationPoint(-10F, -10F, 25.5F);

		leftTrackModel[510].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1187
		leftTrackModel[510].setRotationPoint(-10F, -10F, 25.5F);

		leftTrackModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1188
		leftTrackModel[511].setRotationPoint(-10F, -10F, 23.5F);

		leftTrackModel[512].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1189
		leftTrackModel[512].setRotationPoint(-10F, -10F, 21.5F);

		leftTrackModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1190
		leftTrackModel[513].setRotationPoint(-10F, -10F, 20.5F);

		leftTrackModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1191
		leftTrackModel[514].setRotationPoint(-10F, -10F, 17.5F);

		leftTrackModel[515].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1192
		leftTrackModel[515].setRotationPoint(-10F, -10F, 17.5F);

		leftTrackModel[516].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1193
		leftTrackModel[516].setRotationPoint(-10F, -10F, 16.5F);

		leftTrackModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1194
		leftTrackModel[517].setRotationPoint(-7F, -10F, 25.5F);

		leftTrackModel[518].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1195
		leftTrackModel[518].setRotationPoint(-7F, -10F, 25.5F);

		leftTrackModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1196
		leftTrackModel[519].setRotationPoint(-7F, -10F, 23.5F);

		leftTrackModel[520].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1197
		leftTrackModel[520].setRotationPoint(-7F, -10F, 21.5F);

		leftTrackModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1198
		leftTrackModel[521].setRotationPoint(-7F, -10F, 20.5F);

		leftTrackModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1199
		leftTrackModel[522].setRotationPoint(-7F, -10F, 17.5F);

		leftTrackModel[523].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1200
		leftTrackModel[523].setRotationPoint(-7F, -10F, 17.5F);

		leftTrackModel[524].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1201
		leftTrackModel[524].setRotationPoint(-7F, -10F, 16.5F);

		leftTrackModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1202
		leftTrackModel[525].setRotationPoint(-4F, -10F, 25.5F);

		leftTrackModel[526].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1203
		leftTrackModel[526].setRotationPoint(-4F, -10F, 25.5F);

		leftTrackModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1204
		leftTrackModel[527].setRotationPoint(-4F, -10F, 23.5F);

		leftTrackModel[528].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1205
		leftTrackModel[528].setRotationPoint(-4F, -10F, 21.5F);

		leftTrackModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1206
		leftTrackModel[529].setRotationPoint(-4F, -10F, 20.5F);

		leftTrackModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1207
		leftTrackModel[530].setRotationPoint(-4F, -10F, 17.5F);

		leftTrackModel[531].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1208
		leftTrackModel[531].setRotationPoint(-4F, -10F, 17.5F);

		leftTrackModel[532].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1209
		leftTrackModel[532].setRotationPoint(-4F, -10F, 16.5F);

		leftTrackModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1210
		leftTrackModel[533].setRotationPoint(-1F, -10F, 25.5F);

		leftTrackModel[534].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1211
		leftTrackModel[534].setRotationPoint(-1F, -10F, 25.5F);

		leftTrackModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1212
		leftTrackModel[535].setRotationPoint(-1F, -10F, 23.5F);

		leftTrackModel[536].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1213
		leftTrackModel[536].setRotationPoint(-1F, -10F, 21.5F);

		leftTrackModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1214
		leftTrackModel[537].setRotationPoint(-1F, -10F, 20.5F);

		leftTrackModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1215
		leftTrackModel[538].setRotationPoint(-1F, -10F, 17.5F);

		leftTrackModel[539].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1216
		leftTrackModel[539].setRotationPoint(-1F, -10F, 17.5F);

		leftTrackModel[540].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1217
		leftTrackModel[540].setRotationPoint(-1F, -10F, 16.5F);

		leftTrackModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1218
		leftTrackModel[541].setRotationPoint(2F, -10F, 25.5F);

		leftTrackModel[542].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1219
		leftTrackModel[542].setRotationPoint(2F, -10F, 25.5F);

		leftTrackModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1220
		leftTrackModel[543].setRotationPoint(2F, -10F, 23.5F);

		leftTrackModel[544].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1221
		leftTrackModel[544].setRotationPoint(2F, -10F, 21.5F);

		leftTrackModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1222
		leftTrackModel[545].setRotationPoint(2F, -10F, 20.5F);

		leftTrackModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1223
		leftTrackModel[546].setRotationPoint(2F, -10F, 17.5F);

		leftTrackModel[547].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1224
		leftTrackModel[547].setRotationPoint(2F, -10F, 17.5F);

		leftTrackModel[548].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1225
		leftTrackModel[548].setRotationPoint(2F, -10F, 16.5F);

		leftTrackModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1226
		leftTrackModel[549].setRotationPoint(5F, -10F, 25.5F);

		leftTrackModel[550].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1227
		leftTrackModel[550].setRotationPoint(5F, -10F, 25.5F);

		leftTrackModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1228
		leftTrackModel[551].setRotationPoint(5F, -10F, 23.5F);

		leftTrackModel[552].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1229
		leftTrackModel[552].setRotationPoint(5F, -10F, 21.5F);

		leftTrackModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1230
		leftTrackModel[553].setRotationPoint(5F, -10F, 20.5F);

		leftTrackModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1231
		leftTrackModel[554].setRotationPoint(5F, -10F, 17.5F);

		leftTrackModel[555].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1232
		leftTrackModel[555].setRotationPoint(5F, -10F, 17.5F);

		leftTrackModel[556].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1233
		leftTrackModel[556].setRotationPoint(5F, -10F, 16.5F);

		leftTrackModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1234
		leftTrackModel[557].setRotationPoint(8F, -10F, 25.5F);

		leftTrackModel[558].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1235
		leftTrackModel[558].setRotationPoint(8F, -10F, 25.5F);

		leftTrackModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1236
		leftTrackModel[559].setRotationPoint(8F, -10F, 23.5F);

		leftTrackModel[560].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1237
		leftTrackModel[560].setRotationPoint(8F, -10F, 21.5F);

		leftTrackModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1238
		leftTrackModel[561].setRotationPoint(8F, -10F, 20.5F);

		leftTrackModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1239
		leftTrackModel[562].setRotationPoint(8F, -10F, 17.5F);

		leftTrackModel[563].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1240
		leftTrackModel[563].setRotationPoint(8F, -10F, 17.5F);

		leftTrackModel[564].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1241
		leftTrackModel[564].setRotationPoint(8F, -10F, 16.5F);

		leftTrackModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1242
		leftTrackModel[565].setRotationPoint(11F, -10F, 25.5F);

		leftTrackModel[566].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1243
		leftTrackModel[566].setRotationPoint(11F, -10F, 25.5F);

		leftTrackModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1244
		leftTrackModel[567].setRotationPoint(11F, -10F, 23.5F);

		leftTrackModel[568].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1245
		leftTrackModel[568].setRotationPoint(11F, -10F, 21.5F);

		leftTrackModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1246
		leftTrackModel[569].setRotationPoint(11F, -10F, 20.5F);

		leftTrackModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1247
		leftTrackModel[570].setRotationPoint(11F, -10F, 17.5F);

		leftTrackModel[571].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1248
		leftTrackModel[571].setRotationPoint(11F, -10F, 17.5F);

		leftTrackModel[572].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1249
		leftTrackModel[572].setRotationPoint(11F, -10F, 16.5F);

		leftTrackModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1250
		leftTrackModel[573].setRotationPoint(14F, -10F, 25.5F);

		leftTrackModel[574].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1251
		leftTrackModel[574].setRotationPoint(14F, -10F, 25.5F);

		leftTrackModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1252
		leftTrackModel[575].setRotationPoint(14F, -10F, 23.5F);

		leftTrackModel[576].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1253
		leftTrackModel[576].setRotationPoint(14F, -10F, 21.5F);

		leftTrackModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1254
		leftTrackModel[577].setRotationPoint(14F, -10F, 20.5F);

		leftTrackModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1255
		leftTrackModel[578].setRotationPoint(14F, -10F, 17.5F);

		leftTrackModel[579].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1256
		leftTrackModel[579].setRotationPoint(14F, -10F, 17.5F);

		leftTrackModel[580].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1257
		leftTrackModel[580].setRotationPoint(14F, -10F, 16.5F);

		leftTrackModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1258
		leftTrackModel[581].setRotationPoint(17F, -10F, 25.5F);

		leftTrackModel[582].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1259
		leftTrackModel[582].setRotationPoint(17F, -10F, 25.5F);

		leftTrackModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1260
		leftTrackModel[583].setRotationPoint(17F, -10F, 23.5F);

		leftTrackModel[584].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1261
		leftTrackModel[584].setRotationPoint(17F, -10F, 21.5F);

		leftTrackModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1262
		leftTrackModel[585].setRotationPoint(17F, -10F, 20.5F);

		leftTrackModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1263
		leftTrackModel[586].setRotationPoint(17F, -10F, 17.5F);

		leftTrackModel[587].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1264
		leftTrackModel[587].setRotationPoint(17F, -10F, 17.5F);

		leftTrackModel[588].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1265
		leftTrackModel[588].setRotationPoint(17F, -10F, 16.5F);

		leftTrackModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1266
		leftTrackModel[589].setRotationPoint(20F, -10F, 25.5F);

		leftTrackModel[590].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1267
		leftTrackModel[590].setRotationPoint(20F, -10F, 25.5F);

		leftTrackModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1268
		leftTrackModel[591].setRotationPoint(20F, -10F, 23.5F);

		leftTrackModel[592].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1269
		leftTrackModel[592].setRotationPoint(20F, -10F, 21.5F);

		leftTrackModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1270
		leftTrackModel[593].setRotationPoint(20F, -10F, 20.5F);

		leftTrackModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1271
		leftTrackModel[594].setRotationPoint(20F, -10F, 17.5F);

		leftTrackModel[595].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1272
		leftTrackModel[595].setRotationPoint(20F, -10F, 17.5F);

		leftTrackModel[596].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1273
		leftTrackModel[596].setRotationPoint(20F, -10F, 16.5F);

		leftTrackModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1274
		leftTrackModel[597].setRotationPoint(23F, -10F, 25.5F);

		leftTrackModel[598].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1275
		leftTrackModel[598].setRotationPoint(23F, -10F, 25.5F);

		leftTrackModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1276
		leftTrackModel[599].setRotationPoint(23F, -10F, 23.5F);

		leftTrackModel[600].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1277
		leftTrackModel[600].setRotationPoint(23F, -10F, 21.5F);

		leftTrackModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1278
		leftTrackModel[601].setRotationPoint(23F, -10F, 20.5F);

		leftTrackModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1279
		leftTrackModel[602].setRotationPoint(23F, -10F, 17.5F);

		leftTrackModel[603].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1280
		leftTrackModel[603].setRotationPoint(23F, -10F, 17.5F);

		leftTrackModel[604].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1281
		leftTrackModel[604].setRotationPoint(23F, -10F, 16.5F);

		leftTrackModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1282
		leftTrackModel[605].setRotationPoint(26F, -10F, 25.5F);

		leftTrackModel[606].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1283
		leftTrackModel[606].setRotationPoint(26F, -10F, 25.5F);

		leftTrackModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1284
		leftTrackModel[607].setRotationPoint(26F, -10F, 23.5F);

		leftTrackModel[608].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1285
		leftTrackModel[608].setRotationPoint(26F, -10F, 21.5F);

		leftTrackModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1286
		leftTrackModel[609].setRotationPoint(26F, -10F, 20.5F);

		leftTrackModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1287
		leftTrackModel[610].setRotationPoint(26F, -10F, 17.5F);

		leftTrackModel[611].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1288
		leftTrackModel[611].setRotationPoint(26F, -10F, 17.5F);

		leftTrackModel[612].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1289
		leftTrackModel[612].setRotationPoint(26F, -10F, 16.5F);

		leftTrackModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1290
		leftTrackModel[613].setRotationPoint(29F, -10F, 25.5F);

		leftTrackModel[614].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1291
		leftTrackModel[614].setRotationPoint(29F, -10F, 25.5F);

		leftTrackModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1292
		leftTrackModel[615].setRotationPoint(29F, -10F, 23.5F);

		leftTrackModel[616].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1293
		leftTrackModel[616].setRotationPoint(29F, -10F, 21.5F);

		leftTrackModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1294
		leftTrackModel[617].setRotationPoint(29F, -10F, 20.5F);

		leftTrackModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1295
		leftTrackModel[618].setRotationPoint(29F, -10F, 17.5F);

		leftTrackModel[619].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1296
		leftTrackModel[619].setRotationPoint(29F, -10F, 17.5F);

		leftTrackModel[620].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1297
		leftTrackModel[620].setRotationPoint(29F, -10F, 16.5F);

		leftTrackModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1298
		leftTrackModel[621].setRotationPoint(32F, -10F, 25.5F);

		leftTrackModel[622].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1299
		leftTrackModel[622].setRotationPoint(32F, -10F, 25.5F);

		leftTrackModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1300
		leftTrackModel[623].setRotationPoint(32F, -10F, 23.5F);

		leftTrackModel[624].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1301
		leftTrackModel[624].setRotationPoint(32F, -10F, 21.5F);

		leftTrackModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1302
		leftTrackModel[625].setRotationPoint(32F, -10F, 20.5F);

		leftTrackModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1303
		leftTrackModel[626].setRotationPoint(32F, -10F, 17.5F);

		leftTrackModel[627].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1304
		leftTrackModel[627].setRotationPoint(32F, -10F, 17.5F);

		leftTrackModel[628].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1305
		leftTrackModel[628].setRotationPoint(32F, -10F, 16.5F);

		leftTrackModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1306
		leftTrackModel[629].setRotationPoint(35F, -10F, 25.5F);

		leftTrackModel[630].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1307
		leftTrackModel[630].setRotationPoint(35F, -10F, 25.5F);

		leftTrackModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1308
		leftTrackModel[631].setRotationPoint(35F, -10F, 23.5F);

		leftTrackModel[632].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1309
		leftTrackModel[632].setRotationPoint(35F, -10F, 21.5F);

		leftTrackModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1310
		leftTrackModel[633].setRotationPoint(35F, -10F, 20.5F);

		leftTrackModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1311
		leftTrackModel[634].setRotationPoint(35F, -10F, 17.5F);

		leftTrackModel[635].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1312
		leftTrackModel[635].setRotationPoint(35F, -10F, 17.5F);

		leftTrackModel[636].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1313
		leftTrackModel[636].setRotationPoint(35F, -10F, 16.5F);

		leftTrackModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1314
		leftTrackModel[637].setRotationPoint(38F, -10F, 25.5F);

		leftTrackModel[638].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1315
		leftTrackModel[638].setRotationPoint(38F, -10F, 25.5F);

		leftTrackModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1316
		leftTrackModel[639].setRotationPoint(38F, -10F, 23.5F);

		leftTrackModel[640].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1317
		leftTrackModel[640].setRotationPoint(38F, -10F, 21.5F);

		leftTrackModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1318
		leftTrackModel[641].setRotationPoint(38F, -10F, 20.5F);

		leftTrackModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1319
		leftTrackModel[642].setRotationPoint(38F, -10F, 17.5F);

		leftTrackModel[643].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1320
		leftTrackModel[643].setRotationPoint(38F, -10F, 17.5F);

		leftTrackModel[644].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1321
		leftTrackModel[644].setRotationPoint(38F, -10F, 16.5F);

		leftTrackModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1322
		leftTrackModel[645].setRotationPoint(41F, -10F, 25.5F);

		leftTrackModel[646].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1323
		leftTrackModel[646].setRotationPoint(41F, -10F, 25.5F);

		leftTrackModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1324
		leftTrackModel[647].setRotationPoint(41F, -10F, 23.5F);

		leftTrackModel[648].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1325
		leftTrackModel[648].setRotationPoint(41F, -10F, 21.5F);

		leftTrackModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1326
		leftTrackModel[649].setRotationPoint(41F, -10F, 20.5F);

		leftTrackModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1327
		leftTrackModel[650].setRotationPoint(41F, -10F, 17.5F);

		leftTrackModel[651].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1328
		leftTrackModel[651].setRotationPoint(41F, -10F, 17.5F);

		leftTrackModel[652].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1329
		leftTrackModel[652].setRotationPoint(41F, -10F, 16.5F);

		leftTrackModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1330
		leftTrackModel[653].setRotationPoint(44F, -10F, 25.5F);

		leftTrackModel[654].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1331
		leftTrackModel[654].setRotationPoint(45F, -10F, 25.5F);

		leftTrackModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1332
		leftTrackModel[655].setRotationPoint(44F, -10F, 23.5F);

		leftTrackModel[656].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1333
		leftTrackModel[656].setRotationPoint(45F, -10F, 21.5F);

		leftTrackModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1334
		leftTrackModel[657].setRotationPoint(44F, -10F, 20.5F);

		leftTrackModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1335
		leftTrackModel[658].setRotationPoint(44F, -10F, 17.5F);

		leftTrackModel[659].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1336
		leftTrackModel[659].setRotationPoint(45F, -10F, 17.5F);

		leftTrackModel[660].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1337
		leftTrackModel[660].setRotationPoint(45F, -10F, 16.5F);

		leftTrackModel[661].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1843
		leftTrackModel[661].setRotationPoint(38.5F, 3.5F, 18F);

		leftTrackModel[662].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1844
		leftTrackModel[662].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[662].rotateAngleZ = 0.78539816F;

		leftTrackModel[663].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1845
		leftTrackModel[663].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[663].rotateAngleZ = 1.57079633F;

		leftTrackModel[664].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1846
		leftTrackModel[664].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[664].rotateAngleZ = 2.35619449F;

		leftTrackModel[665].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1847
		leftTrackModel[665].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[665].rotateAngleZ = 3.14159265F;

		leftTrackModel[666].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1848
		leftTrackModel[666].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[666].rotateAngleZ = 3.92699082F;

		leftTrackModel[667].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1849
		leftTrackModel[667].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[667].rotateAngleZ = 4.71238898F;

		leftTrackModel[668].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1850
		leftTrackModel[668].setRotationPoint(38.5F, 3.5F, 18F);
		leftTrackModel[668].rotateAngleZ = 5.49778714F;

		leftTrackModel[669].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1852
		leftTrackModel[669].setRotationPoint(38.5F, 3.5F, 18F);

		leftTrackModel[670].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1861
		leftTrackModel[670].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[670].rotateAngleZ = 4.71238898F;

		leftTrackModel[671].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1862
		leftTrackModel[671].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[671].rotateAngleZ = 5.49778714F;

		leftTrackModel[672].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1863
		leftTrackModel[672].setRotationPoint(49.5F, -4.5F, 18F);

		leftTrackModel[673].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1864
		leftTrackModel[673].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[673].rotateAngleZ = 3.92699082F;

		leftTrackModel[674].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1865
		leftTrackModel[674].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[674].rotateAngleZ = 3.14159265F;

		leftTrackModel[675].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1866
		leftTrackModel[675].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[675].rotateAngleZ = 2.35619449F;

		leftTrackModel[676].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1867
		leftTrackModel[676].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[676].rotateAngleZ = 1.57079633F;

		leftTrackModel[677].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1868
		leftTrackModel[677].setRotationPoint(49.5F, -4.5F, 18F);
		leftTrackModel[677].rotateAngleZ = 0.78539816F;

		leftTrackModel[678].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1869
		leftTrackModel[678].setRotationPoint(49.5F, -4.5F, 18F);

		leftTrackModel[679].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1879
		leftTrackModel[679].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[679].rotateAngleZ = 4.71238898F;

		leftTrackModel[680].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1880
		leftTrackModel[680].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[680].rotateAngleZ = 5.49778714F;

		leftTrackModel[681].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1881
		leftTrackModel[681].setRotationPoint(25.5F, 3.5F, 18F);

		leftTrackModel[682].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1882
		leftTrackModel[682].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[682].rotateAngleZ = 3.92699082F;

		leftTrackModel[683].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1883
		leftTrackModel[683].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[683].rotateAngleZ = 3.14159265F;

		leftTrackModel[684].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1884
		leftTrackModel[684].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[684].rotateAngleZ = 2.35619449F;

		leftTrackModel[685].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1885
		leftTrackModel[685].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[685].rotateAngleZ = 1.57079633F;

		leftTrackModel[686].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1886
		leftTrackModel[686].setRotationPoint(25.5F, 3.5F, 18F);
		leftTrackModel[686].rotateAngleZ = 0.78539816F;

		leftTrackModel[687].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1887
		leftTrackModel[687].setRotationPoint(25.5F, 3.5F, 18F);

		leftTrackModel[688].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1897
		leftTrackModel[688].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[688].rotateAngleZ = 4.71238898F;

		leftTrackModel[689].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1898
		leftTrackModel[689].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[689].rotateAngleZ = 5.49778714F;

		leftTrackModel[690].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1899
		leftTrackModel[690].setRotationPoint(12.5F, 3.5F, 18F);

		leftTrackModel[691].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1900
		leftTrackModel[691].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[691].rotateAngleZ = 3.92699082F;

		leftTrackModel[692].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1901
		leftTrackModel[692].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[692].rotateAngleZ = 3.14159265F;

		leftTrackModel[693].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1902
		leftTrackModel[693].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[693].rotateAngleZ = 2.35619449F;

		leftTrackModel[694].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1903
		leftTrackModel[694].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[694].rotateAngleZ = 1.57079633F;

		leftTrackModel[695].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1904
		leftTrackModel[695].setRotationPoint(12.5F, 3.5F, 18F);
		leftTrackModel[695].rotateAngleZ = 0.78539816F;

		leftTrackModel[696].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1905
		leftTrackModel[696].setRotationPoint(12.5F, 3.5F, 18F);

		leftTrackModel[697].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1915
		leftTrackModel[697].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[697].rotateAngleZ = 4.71238898F;

		leftTrackModel[698].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1916
		leftTrackModel[698].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[698].rotateAngleZ = 5.49778714F;

		leftTrackModel[699].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1917
		leftTrackModel[699].setRotationPoint(1F, 3.5F, 18F);

		leftTrackModel[700].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1918
		leftTrackModel[700].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[700].rotateAngleZ = 3.92699082F;

		leftTrackModel[701].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1919
		leftTrackModel[701].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[701].rotateAngleZ = 3.14159265F;

		leftTrackModel[702].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1920
		leftTrackModel[702].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[702].rotateAngleZ = 2.35619449F;

		leftTrackModel[703].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1921
		leftTrackModel[703].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[703].rotateAngleZ = 1.57079633F;

		leftTrackModel[704].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1922
		leftTrackModel[704].setRotationPoint(1F, 3.5F, 18F);
		leftTrackModel[704].rotateAngleZ = 0.78539816F;

		leftTrackModel[705].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1923
		leftTrackModel[705].setRotationPoint(1F, 3.5F, 18F);

		leftTrackModel[706].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1933
		leftTrackModel[706].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[706].rotateAngleZ = 4.71238898F;

		leftTrackModel[707].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1934
		leftTrackModel[707].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[707].rotateAngleZ = 5.49778714F;

		leftTrackModel[708].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1935
		leftTrackModel[708].setRotationPoint(-10.5F, 3.5F, 18F);

		leftTrackModel[709].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1936
		leftTrackModel[709].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[709].rotateAngleZ = 3.92699082F;

		leftTrackModel[710].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1937
		leftTrackModel[710].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[710].rotateAngleZ = 3.14159265F;

		leftTrackModel[711].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1938
		leftTrackModel[711].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[711].rotateAngleZ = 2.35619449F;

		leftTrackModel[712].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1939
		leftTrackModel[712].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[712].rotateAngleZ = 1.57079633F;

		leftTrackModel[713].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1940
		leftTrackModel[713].setRotationPoint(-10.5F, 3.5F, 18F);
		leftTrackModel[713].rotateAngleZ = 0.78539816F;

		leftTrackModel[714].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1941
		leftTrackModel[714].setRotationPoint(-10.5F, 3.5F, 18F);

		leftTrackModel[715].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1951
		leftTrackModel[715].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[715].rotateAngleZ = 4.71238898F;

		leftTrackModel[716].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1952
		leftTrackModel[716].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[716].rotateAngleZ = 5.49778714F;

		leftTrackModel[717].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1953
		leftTrackModel[717].setRotationPoint(-23.5F, 3.5F, 18F);

		leftTrackModel[718].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1954
		leftTrackModel[718].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[718].rotateAngleZ = 3.92699082F;

		leftTrackModel[719].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1955
		leftTrackModel[719].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[719].rotateAngleZ = 3.14159265F;

		leftTrackModel[720].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1956
		leftTrackModel[720].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[720].rotateAngleZ = 2.35619449F;

		leftTrackModel[721].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1957
		leftTrackModel[721].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[721].rotateAngleZ = 1.57079633F;

		leftTrackModel[722].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1958
		leftTrackModel[722].setRotationPoint(-23.5F, 3.5F, 18F);
		leftTrackModel[722].rotateAngleZ = 0.78539816F;

		leftTrackModel[723].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1959
		leftTrackModel[723].setRotationPoint(-23.5F, 3.5F, 18F);

		leftTrackModel[724].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1969
		leftTrackModel[724].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[724].rotateAngleZ = 4.71238898F;

		leftTrackModel[725].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1970
		leftTrackModel[725].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[725].rotateAngleZ = 5.49778714F;

		leftTrackModel[726].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1971
		leftTrackModel[726].setRotationPoint(-36.5F, 3.5F, 18F);

		leftTrackModel[727].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1972
		leftTrackModel[727].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[727].rotateAngleZ = 3.92699082F;

		leftTrackModel[728].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1973
		leftTrackModel[728].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[728].rotateAngleZ = 3.14159265F;

		leftTrackModel[729].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1974
		leftTrackModel[729].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[729].rotateAngleZ = 2.35619449F;

		leftTrackModel[730].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1975
		leftTrackModel[730].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[730].rotateAngleZ = 1.57079633F;

		leftTrackModel[731].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1976
		leftTrackModel[731].setRotationPoint(-36.5F, 3.5F, 18F);
		leftTrackModel[731].rotateAngleZ = 0.78539816F;

		leftTrackModel[732].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1977
		leftTrackModel[732].setRotationPoint(-36.5F, 3.5F, 18F);

		leftTrackModel[733].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1987
		leftTrackModel[733].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[733].rotateAngleZ = 4.71238898F;

		leftTrackModel[734].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1988
		leftTrackModel[734].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[734].rotateAngleZ = 5.49778714F;

		leftTrackModel[735].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1989
		leftTrackModel[735].setRotationPoint(-44.5F, -4.5F, 18F);

		leftTrackModel[736].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1990
		leftTrackModel[736].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[736].rotateAngleZ = 3.92699082F;

		leftTrackModel[737].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1991
		leftTrackModel[737].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[737].rotateAngleZ = 3.14159265F;

		leftTrackModel[738].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1992
		leftTrackModel[738].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[738].rotateAngleZ = 2.35619449F;

		leftTrackModel[739].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1993
		leftTrackModel[739].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[739].rotateAngleZ = 1.57079633F;

		leftTrackModel[740].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1994
		leftTrackModel[740].setRotationPoint(-44.5F, -4.5F, 18F);
		leftTrackModel[740].rotateAngleZ = 0.78539816F;

		leftTrackModel[741].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1995
		leftTrackModel[741].setRotationPoint(-44.5F, -4.5F, 18F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox502
		rightTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox503
		rightTrackModel[2] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox504
		rightTrackModel[3] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox505
		rightTrackModel[4] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox506
		rightTrackModel[5] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox507
		rightTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox508
		rightTrackModel[7] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox509
		rightTrackModel[8] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox510
		rightTrackModel[9] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox511
		rightTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox512
		rightTrackModel[11] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox513
		rightTrackModel[12] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox514
		rightTrackModel[13] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox515
		rightTrackModel[14] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox516
		rightTrackModel[15] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox517
		rightTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox518
		rightTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox519
		rightTrackModel[18] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox520
		rightTrackModel[19] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox521
		rightTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox522
		rightTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox523
		rightTrackModel[22] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox524
		rightTrackModel[23] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox525
		rightTrackModel[24] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox526
		rightTrackModel[25] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox527
		rightTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox528
		rightTrackModel[27] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox529
		rightTrackModel[28] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox530
		rightTrackModel[29] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox531
		rightTrackModel[30] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox532
		rightTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox533
		rightTrackModel[32] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox534
		rightTrackModel[33] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox535
		rightTrackModel[34] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox536
		rightTrackModel[35] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox537
		rightTrackModel[36] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox538
		rightTrackModel[37] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox539
		rightTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox540
		rightTrackModel[39] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox541
		rightTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportImportBox542
		rightTrackModel[41] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportImportBox543
		rightTrackModel[42] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportImportBox544
		rightTrackModel[43] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import ImportImportBox545
		rightTrackModel[44] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import ImportImportBox546
		rightTrackModel[45] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox0
		rightTrackModel[46] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox1
		rightTrackModel[47] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox47
		rightTrackModel[48] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox48
		rightTrackModel[49] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox49
		rightTrackModel[50] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox50
		rightTrackModel[51] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox51
		rightTrackModel[52] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox52
		rightTrackModel[53] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox61
		rightTrackModel[54] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox62
		rightTrackModel[55] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox63
		rightTrackModel[56] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox64
		rightTrackModel[57] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox65
		rightTrackModel[58] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox66
		rightTrackModel[59] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox67
		rightTrackModel[60] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox68
		rightTrackModel[61] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox77
		rightTrackModel[62] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox78
		rightTrackModel[63] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox79
		rightTrackModel[64] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox80
		rightTrackModel[65] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox81
		rightTrackModel[66] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox82
		rightTrackModel[67] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox83
		rightTrackModel[68] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox84
		rightTrackModel[69] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox85
		rightTrackModel[70] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox86
		rightTrackModel[71] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox87
		rightTrackModel[72] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox88
		rightTrackModel[73] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox89
		rightTrackModel[74] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox90
		rightTrackModel[75] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox91
		rightTrackModel[76] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox92
		rightTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox93
		rightTrackModel[78] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox94
		rightTrackModel[79] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox95
		rightTrackModel[80] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox96
		rightTrackModel[81] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox97
		rightTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox98
		rightTrackModel[83] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox99
		rightTrackModel[84] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox100
		rightTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox101
		rightTrackModel[86] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox102
		rightTrackModel[87] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox103
		rightTrackModel[88] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox104
		rightTrackModel[89] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox105
		rightTrackModel[90] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox106
		rightTrackModel[91] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox107
		rightTrackModel[92] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox108
		rightTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox109
		rightTrackModel[94] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox110
		rightTrackModel[95] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox111
		rightTrackModel[96] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox112
		rightTrackModel[97] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox113
		rightTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox114
		rightTrackModel[99] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox115
		rightTrackModel[100] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox116
		rightTrackModel[101] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox117
		rightTrackModel[102] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox118
		rightTrackModel[103] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox119
		rightTrackModel[104] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox120
		rightTrackModel[105] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox121
		rightTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox122
		rightTrackModel[107] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox123
		rightTrackModel[108] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox124
		rightTrackModel[109] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox125
		rightTrackModel[110] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox126
		rightTrackModel[111] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox127
		rightTrackModel[112] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox128
		rightTrackModel[113] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox129
		rightTrackModel[114] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox130
		rightTrackModel[115] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox131
		rightTrackModel[116] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox132
		rightTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox133
		rightTrackModel[118] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox134
		rightTrackModel[119] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox135
		rightTrackModel[120] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox136
		rightTrackModel[121] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox137
		rightTrackModel[122] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox138
		rightTrackModel[123] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox139
		rightTrackModel[124] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox140
		rightTrackModel[125] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox141
		rightTrackModel[126] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox142
		rightTrackModel[127] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox143
		rightTrackModel[128] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox144
		rightTrackModel[129] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox145
		rightTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox146
		rightTrackModel[131] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox147
		rightTrackModel[132] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox148
		rightTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox149
		rightTrackModel[134] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox150
		rightTrackModel[135] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox151
		rightTrackModel[136] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox152
		rightTrackModel[137] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox153
		rightTrackModel[138] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox154
		rightTrackModel[139] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox155
		rightTrackModel[140] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox156
		rightTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox157
		rightTrackModel[142] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox158
		rightTrackModel[143] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox159
		rightTrackModel[144] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox160
		rightTrackModel[145] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox161
		rightTrackModel[146] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox162
		rightTrackModel[147] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox163
		rightTrackModel[148] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox164
		rightTrackModel[149] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox165
		rightTrackModel[150] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox166
		rightTrackModel[151] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox167
		rightTrackModel[152] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox168
		rightTrackModel[153] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox169
		rightTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox170
		rightTrackModel[155] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox171
		rightTrackModel[156] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox172
		rightTrackModel[157] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox173
		rightTrackModel[158] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox174
		rightTrackModel[159] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox175
		rightTrackModel[160] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox176
		rightTrackModel[161] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox177
		rightTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox178
		rightTrackModel[163] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox179
		rightTrackModel[164] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox180
		rightTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox181
		rightTrackModel[166] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox182
		rightTrackModel[167] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox183
		rightTrackModel[168] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox184
		rightTrackModel[169] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox185
		rightTrackModel[170] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox186
		rightTrackModel[171] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox187
		rightTrackModel[172] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox188
		rightTrackModel[173] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox189
		rightTrackModel[174] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox190
		rightTrackModel[175] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox191
		rightTrackModel[176] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox192
		rightTrackModel[177] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox193
		rightTrackModel[178] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox194
		rightTrackModel[179] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox195
		rightTrackModel[180] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox196
		rightTrackModel[181] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox197
		rightTrackModel[182] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox198
		rightTrackModel[183] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox199
		rightTrackModel[184] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox200
		rightTrackModel[185] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox201
		rightTrackModel[186] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox202
		rightTrackModel[187] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox203
		rightTrackModel[188] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox204
		rightTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox205
		rightTrackModel[190] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox206
		rightTrackModel[191] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox207
		rightTrackModel[192] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox208
		rightTrackModel[193] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox209
		rightTrackModel[194] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox210
		rightTrackModel[195] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox211
		rightTrackModel[196] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox212
		rightTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox213
		rightTrackModel[198] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox214
		rightTrackModel[199] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox215
		rightTrackModel[200] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox216
		rightTrackModel[201] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox217
		rightTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox218
		rightTrackModel[203] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox219
		rightTrackModel[204] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox220
		rightTrackModel[205] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox221
		rightTrackModel[206] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox222
		rightTrackModel[207] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox223
		rightTrackModel[208] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox224
		rightTrackModel[209] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox225
		rightTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox226
		rightTrackModel[211] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox227
		rightTrackModel[212] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox228
		rightTrackModel[213] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox229
		rightTrackModel[214] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox230
		rightTrackModel[215] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox231
		rightTrackModel[216] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox232
		rightTrackModel[217] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox233
		rightTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox234
		rightTrackModel[219] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox235
		rightTrackModel[220] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox236
		rightTrackModel[221] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox237
		rightTrackModel[222] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox238
		rightTrackModel[223] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox239
		rightTrackModel[224] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox240
		rightTrackModel[225] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox241
		rightTrackModel[226] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox242
		rightTrackModel[227] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox243
		rightTrackModel[228] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox244
		rightTrackModel[229] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox245
		rightTrackModel[230] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox246
		rightTrackModel[231] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox247
		rightTrackModel[232] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox248
		rightTrackModel[233] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox249
		rightTrackModel[234] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox250
		rightTrackModel[235] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox251
		rightTrackModel[236] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox252
		rightTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox253
		rightTrackModel[238] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox254
		rightTrackModel[239] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox255
		rightTrackModel[240] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox256
		rightTrackModel[241] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox257
		rightTrackModel[242] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox258
		rightTrackModel[243] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox259
		rightTrackModel[244] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox260
		rightTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox261
		rightTrackModel[246] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox262
		rightTrackModel[247] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox263
		rightTrackModel[248] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox264
		rightTrackModel[249] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox265
		rightTrackModel[250] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox266
		rightTrackModel[251] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox267
		rightTrackModel[252] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox268
		rightTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox269
		rightTrackModel[254] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox270
		rightTrackModel[255] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox271
		rightTrackModel[256] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox272
		rightTrackModel[257] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox273
		rightTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox274
		rightTrackModel[259] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox275
		rightTrackModel[260] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox276
		rightTrackModel[261] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox277
		rightTrackModel[262] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox278
		rightTrackModel[263] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox279
		rightTrackModel[264] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox280
		rightTrackModel[265] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox281
		rightTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox282
		rightTrackModel[267] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox283
		rightTrackModel[268] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox284
		rightTrackModel[269] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox285
		rightTrackModel[270] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox286
		rightTrackModel[271] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox287
		rightTrackModel[272] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox288
		rightTrackModel[273] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox289
		rightTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox290
		rightTrackModel[275] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox291
		rightTrackModel[276] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox292
		rightTrackModel[277] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox293
		rightTrackModel[278] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox294
		rightTrackModel[279] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox295
		rightTrackModel[280] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox296
		rightTrackModel[281] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox297
		rightTrackModel[282] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox298
		rightTrackModel[283] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox299
		rightTrackModel[284] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox300
		rightTrackModel[285] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox301
		rightTrackModel[286] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox302
		rightTrackModel[287] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox303
		rightTrackModel[288] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox304
		rightTrackModel[289] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox305
		rightTrackModel[290] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox306
		rightTrackModel[291] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox307
		rightTrackModel[292] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox308
		rightTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox309
		rightTrackModel[294] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox310
		rightTrackModel[295] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox311
		rightTrackModel[296] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox312
		rightTrackModel[297] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox313
		rightTrackModel[298] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox314
		rightTrackModel[299] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox315
		rightTrackModel[300] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox316
		rightTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox317
		rightTrackModel[302] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox318
		rightTrackModel[303] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox319
		rightTrackModel[304] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox320
		rightTrackModel[305] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox321
		rightTrackModel[306] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox322
		rightTrackModel[307] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox323
		rightTrackModel[308] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox324
		rightTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox325
		rightTrackModel[310] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox326
		rightTrackModel[311] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox327
		rightTrackModel[312] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox328
		rightTrackModel[313] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox329
		rightTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox330
		rightTrackModel[315] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox331
		rightTrackModel[316] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox332
		rightTrackModel[317] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox333
		rightTrackModel[318] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox334
		rightTrackModel[319] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox335
		rightTrackModel[320] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox336
		rightTrackModel[321] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox337
		rightTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox338
		rightTrackModel[323] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox339
		rightTrackModel[324] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox340
		rightTrackModel[325] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox341
		rightTrackModel[326] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox342
		rightTrackModel[327] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox343
		rightTrackModel[328] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox344
		rightTrackModel[329] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox345
		rightTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox346
		rightTrackModel[331] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox347
		rightTrackModel[332] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox348
		rightTrackModel[333] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox349
		rightTrackModel[334] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox350
		rightTrackModel[335] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox351
		rightTrackModel[336] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox352
		rightTrackModel[337] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox353
		rightTrackModel[338] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox354
		rightTrackModel[339] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox355
		rightTrackModel[340] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox356
		rightTrackModel[341] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox357
		rightTrackModel[342] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox358
		rightTrackModel[343] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox359
		rightTrackModel[344] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox360
		rightTrackModel[345] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox361
		rightTrackModel[346] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox362
		rightTrackModel[347] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox363
		rightTrackModel[348] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox364
		rightTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox365
		rightTrackModel[350] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox366
		rightTrackModel[351] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox367
		rightTrackModel[352] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox368
		rightTrackModel[353] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox369
		rightTrackModel[354] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox370
		rightTrackModel[355] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox371
		rightTrackModel[356] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox372
		rightTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox373
		rightTrackModel[358] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox374
		rightTrackModel[359] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox375
		rightTrackModel[360] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox376
		rightTrackModel[361] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox377
		rightTrackModel[362] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox378
		rightTrackModel[363] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox379
		rightTrackModel[364] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox380
		rightTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox381
		rightTrackModel[366] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox382
		rightTrackModel[367] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox383
		rightTrackModel[368] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox384
		rightTrackModel[369] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox385
		rightTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox386
		rightTrackModel[371] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox387
		rightTrackModel[372] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox388
		rightTrackModel[373] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox389
		rightTrackModel[374] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox390
		rightTrackModel[375] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox391
		rightTrackModel[376] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox392
		rightTrackModel[377] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox393
		rightTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox394
		rightTrackModel[379] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox395
		rightTrackModel[380] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox396
		rightTrackModel[381] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox397
		rightTrackModel[382] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox398
		rightTrackModel[383] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox399
		rightTrackModel[384] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox400
		rightTrackModel[385] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox401
		rightTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox402
		rightTrackModel[387] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox403
		rightTrackModel[388] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox404
		rightTrackModel[389] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox405
		rightTrackModel[390] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox406
		rightTrackModel[391] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox407
		rightTrackModel[392] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox408
		rightTrackModel[393] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox409
		rightTrackModel[394] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox410
		rightTrackModel[395] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox411
		rightTrackModel[396] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox412
		rightTrackModel[397] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox413
		rightTrackModel[398] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox414
		rightTrackModel[399] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox415
		rightTrackModel[400] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox416
		rightTrackModel[401] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox417
		rightTrackModel[402] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox418
		rightTrackModel[403] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox419
		rightTrackModel[404] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox420
		rightTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox421
		rightTrackModel[406] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox422
		rightTrackModel[407] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox423
		rightTrackModel[408] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox424
		rightTrackModel[409] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox425
		rightTrackModel[410] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox426
		rightTrackModel[411] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox427
		rightTrackModel[412] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox428
		rightTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox429
		rightTrackModel[414] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox430
		rightTrackModel[415] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox431
		rightTrackModel[416] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox432
		rightTrackModel[417] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox433
		rightTrackModel[418] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox434
		rightTrackModel[419] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox435
		rightTrackModel[420] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox436
		rightTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox437
		rightTrackModel[422] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox438
		rightTrackModel[423] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox439
		rightTrackModel[424] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox440
		rightTrackModel[425] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox441
		rightTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox442
		rightTrackModel[427] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox443
		rightTrackModel[428] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox444
		rightTrackModel[429] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox445
		rightTrackModel[430] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox446
		rightTrackModel[431] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox447
		rightTrackModel[432] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox448
		rightTrackModel[433] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox449
		rightTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox450
		rightTrackModel[435] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox451
		rightTrackModel[436] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox452
		rightTrackModel[437] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox453
		rightTrackModel[438] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox454
		rightTrackModel[439] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox455
		rightTrackModel[440] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox456
		rightTrackModel[441] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox457
		rightTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox458
		rightTrackModel[443] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox459
		rightTrackModel[444] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox460
		rightTrackModel[445] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox461
		rightTrackModel[446] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox462
		rightTrackModel[447] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox463
		rightTrackModel[448] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox464
		rightTrackModel[449] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox465
		rightTrackModel[450] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox466
		rightTrackModel[451] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox467
		rightTrackModel[452] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox468
		rightTrackModel[453] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox469
		rightTrackModel[454] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox470
		rightTrackModel[455] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox471
		rightTrackModel[456] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox472
		rightTrackModel[457] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox473
		rightTrackModel[458] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox474
		rightTrackModel[459] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox475
		rightTrackModel[460] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox476
		rightTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox477
		rightTrackModel[462] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox478
		rightTrackModel[463] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox479
		rightTrackModel[464] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox480
		rightTrackModel[465] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox481
		rightTrackModel[466] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox482
		rightTrackModel[467] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox483
		rightTrackModel[468] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox484
		rightTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox485
		rightTrackModel[470] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox486
		rightTrackModel[471] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox487
		rightTrackModel[472] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox488
		rightTrackModel[473] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox489
		rightTrackModel[474] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox490
		rightTrackModel[475] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox491
		rightTrackModel[476] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox492
		rightTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox493
		rightTrackModel[478] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox494
		rightTrackModel[479] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox495
		rightTrackModel[480] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox496
		rightTrackModel[481] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox497
		rightTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox498
		rightTrackModel[483] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox499
		rightTrackModel[484] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox500
		rightTrackModel[485] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox501
		rightTrackModel[486] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox502
		rightTrackModel[487] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox503
		rightTrackModel[488] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox504
		rightTrackModel[489] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox505
		rightTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox506
		rightTrackModel[491] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox507
		rightTrackModel[492] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox508
		rightTrackModel[493] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox509
		rightTrackModel[494] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox510
		rightTrackModel[495] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox511
		rightTrackModel[496] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox512
		rightTrackModel[497] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox513
		rightTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox514
		rightTrackModel[499] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox515

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox502
		rightTrackModel[0].setRotationPoint(45F, -6F, -26.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox503
		rightTrackModel[1].setRotationPoint(45F, -8F, -26.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox504
		rightTrackModel[2].setRotationPoint(46F, -9F, -26.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox505
		rightTrackModel[3].setRotationPoint(45F, -3F, -26.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox506
		rightTrackModel[4].setRotationPoint(46F, -1F, -26.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox507
		rightTrackModel[5].setRotationPoint(35F, -1F, -26.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox508
		rightTrackModel[6].setRotationPoint(34F, 0F, -26.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox509
		rightTrackModel[7].setRotationPoint(34F, 2F, -26.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox510
		rightTrackModel[8].setRotationPoint(34F, 5F, -26.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox511
		rightTrackModel[9].setRotationPoint(35F, 7F, -26.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox512
		rightTrackModel[10].setRotationPoint(22F, -1F, -26.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox513
		rightTrackModel[11].setRotationPoint(21F, 0F, -26.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox514
		rightTrackModel[12].setRotationPoint(21F, 2F, -26.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox515
		rightTrackModel[13].setRotationPoint(21F, 5F, -26.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox516
		rightTrackModel[14].setRotationPoint(22F, 7F, -26.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox517
		rightTrackModel[15].setRotationPoint(9F, -1F, -26.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox518
		rightTrackModel[16].setRotationPoint(8F, 0F, -26.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox519
		rightTrackModel[17].setRotationPoint(8F, 2F, -26.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox520
		rightTrackModel[18].setRotationPoint(8F, 5F, -26.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox521
		rightTrackModel[19].setRotationPoint(9F, 7F, -26.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox522
		rightTrackModel[20].setRotationPoint(-40F, -1F, -26.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox523
		rightTrackModel[21].setRotationPoint(-41F, 0F, -26.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox524
		rightTrackModel[22].setRotationPoint(-41F, 2F, -26.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox525
		rightTrackModel[23].setRotationPoint(-41F, 5F, -26.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox526
		rightTrackModel[24].setRotationPoint(-40F, 7F, -26.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox527
		rightTrackModel[25].setRotationPoint(-27F, -1F, -26.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox528
		rightTrackModel[26].setRotationPoint(-28F, 0F, -26.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox529
		rightTrackModel[27].setRotationPoint(-28F, 2F, -26.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox530
		rightTrackModel[28].setRotationPoint(-28F, 5F, -26.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox531
		rightTrackModel[29].setRotationPoint(-27F, 7F, -26.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox532
		rightTrackModel[30].setRotationPoint(-14F, -1F, -26.5F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox533
		rightTrackModel[31].setRotationPoint(-15F, 0F, -26.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox534
		rightTrackModel[32].setRotationPoint(-15F, 2F, -26.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox535
		rightTrackModel[33].setRotationPoint(-15F, 5F, -26.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox536
		rightTrackModel[34].setRotationPoint(-14F, 7F, -26.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox537
		rightTrackModel[35].setRotationPoint(-48F, -1F, -26.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox538
		rightTrackModel[36].setRotationPoint(-49F, -6F, -26.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox539
		rightTrackModel[37].setRotationPoint(-49F, -3F, -26.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox540
		rightTrackModel[38].setRotationPoint(-49F, -8F, -26.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox541
		rightTrackModel[39].setRotationPoint(-48F, -9F, -26.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox542
		rightTrackModel[40].setRotationPoint(-2.5F, -1F, -26.5F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox543
		rightTrackModel[41].setRotationPoint(-3.5F, 0F, -26.5F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox544
		rightTrackModel[42].setRotationPoint(-3.5F, 2F, -26.5F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox545
		rightTrackModel[43].setRotationPoint(-3.5F, 5F, -26.5F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox546
		rightTrackModel[44].setRotationPoint(-2.5F, 7F, -26.5F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		rightTrackModel[45].setRotationPoint(48F, -10F, -27.5F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		rightTrackModel[46].setRotationPoint(48F, -10F, -19.5F);

		rightTrackModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox47
		rightTrackModel[47].setRotationPoint(48F, -10F, -27.5F);

		rightTrackModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox48
		rightTrackModel[48].setRotationPoint(48F, -10F, -19.5F);

		rightTrackModel[49].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox49
		rightTrackModel[49].setRotationPoint(48F, -10F, -28.5F);

		rightTrackModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox50
		rightTrackModel[50].setRotationPoint(48F, -10F, -23.5F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox51
		rightTrackModel[51].setRotationPoint(48F, -10F, -24.5F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox52
		rightTrackModel[52].setRotationPoint(48F, -10F, -21.5F);

		rightTrackModel[53].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox61
		rightTrackModel[53].setRotationPoint(51F, -10F, -28.5F);
		rightTrackModel[53].rotateAngleZ = -0.40142573F;

		rightTrackModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox62
		rightTrackModel[54].setRotationPoint(51F, -10F, -27.5F);
		rightTrackModel[54].rotateAngleZ = -0.40142573F;

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox63
		rightTrackModel[55].setRotationPoint(51F, -10F, -27.5F);
		rightTrackModel[55].rotateAngleZ = -0.40142573F;

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		rightTrackModel[56].setRotationPoint(51F, -10F, -24.5F);
		rightTrackModel[56].rotateAngleZ = -0.40142573F;

		rightTrackModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox65
		rightTrackModel[57].setRotationPoint(51F, -10F, -23.5F);
		rightTrackModel[57].rotateAngleZ = -0.40142573F;

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		rightTrackModel[58].setRotationPoint(51F, -10F, -21.5F);
		rightTrackModel[58].rotateAngleZ = -0.40142573F;

		rightTrackModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox67
		rightTrackModel[59].setRotationPoint(51F, -10F, -19.5F);
		rightTrackModel[59].rotateAngleZ = -0.40142573F;

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox68
		rightTrackModel[60].setRotationPoint(51F, -10F, -19.5F);
		rightTrackModel[60].rotateAngleZ = -0.40142573F;

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox77
		rightTrackModel[61].setRotationPoint(53.7F, -8.8F, -27.5F);
		rightTrackModel[61].rotateAngleZ = -1.02974426F;

		rightTrackModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		rightTrackModel[62].setRotationPoint(53.7F, -8.8F, -27.5F);
		rightTrackModel[62].rotateAngleZ = -1.02974426F;

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox79
		rightTrackModel[63].setRotationPoint(53.7F, -8.8F, -24.5F);
		rightTrackModel[63].rotateAngleZ = -1.02974426F;

		rightTrackModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox80
		rightTrackModel[64].setRotationPoint(53.7F, -8.8F, -23.5F);
		rightTrackModel[64].rotateAngleZ = -1.02974426F;

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		rightTrackModel[65].setRotationPoint(53.7F, -8.8F, -21.5F);
		rightTrackModel[65].rotateAngleZ = -1.02974426F;

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox82
		rightTrackModel[66].setRotationPoint(53.7F, -8.8F, -19.5F);
		rightTrackModel[66].rotateAngleZ = -1.02974426F;

		rightTrackModel[67].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox83
		rightTrackModel[67].setRotationPoint(53.7F, -8.8F, -19.5F);
		rightTrackModel[67].rotateAngleZ = -1.02974426F;

		rightTrackModel[68].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
		rightTrackModel[68].setRotationPoint(53.7F, -8.8F, -28.5F);
		rightTrackModel[68].rotateAngleZ = -1.02974426F;

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox85
		rightTrackModel[69].setRotationPoint(55.25F, -6.25F, -27.5F);
		rightTrackModel[69].rotateAngleZ = -1.57079633F;

		rightTrackModel[70].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		rightTrackModel[70].setRotationPoint(55.25F, -6.25F, -27.5F);
		rightTrackModel[70].rotateAngleZ = -1.57079633F;

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		rightTrackModel[71].setRotationPoint(55.25F, -6.25F, -24.5F);
		rightTrackModel[71].rotateAngleZ = -1.57079633F;

		rightTrackModel[72].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox88
		rightTrackModel[72].setRotationPoint(55.25F, -6.25F, -23.5F);
		rightTrackModel[72].rotateAngleZ = -1.57079633F;

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox89
		rightTrackModel[73].setRotationPoint(55.25F, -6.25F, -21.5F);
		rightTrackModel[73].rotateAngleZ = -1.57079633F;

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		rightTrackModel[74].setRotationPoint(55.25F, -6.25F, -19.5F);
		rightTrackModel[74].rotateAngleZ = -1.57079633F;

		rightTrackModel[75].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox91
		rightTrackModel[75].setRotationPoint(55.25F, -6.25F, -19.5F);
		rightTrackModel[75].rotateAngleZ = -1.57079633F;

		rightTrackModel[76].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox92
		rightTrackModel[76].setRotationPoint(55.25F, -6.25F, -28.5F);
		rightTrackModel[76].rotateAngleZ = -1.57079633F;

		rightTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox93
		rightTrackModel[77].setRotationPoint(55.25F, -3.25F, -27.5F);
		rightTrackModel[77].rotateAngleZ = -2.07694181F;

		rightTrackModel[78].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox94
		rightTrackModel[78].setRotationPoint(55.25F, -3.25F, -27.5F);
		rightTrackModel[78].rotateAngleZ = -2.07694181F;

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox95
		rightTrackModel[79].setRotationPoint(55.25F, -3.25F, -24.5F);
		rightTrackModel[79].rotateAngleZ = -2.07694181F;

		rightTrackModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox96
		rightTrackModel[80].setRotationPoint(55.25F, -3.25F, -23.5F);
		rightTrackModel[80].rotateAngleZ = -2.07694181F;

		rightTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox97
		rightTrackModel[81].setRotationPoint(55.25F, -3.25F, -21.5F);
		rightTrackModel[81].rotateAngleZ = -2.07694181F;

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox98
		rightTrackModel[82].setRotationPoint(55.25F, -3.25F, -19.5F);
		rightTrackModel[82].rotateAngleZ = -2.07694181F;

		rightTrackModel[83].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox99
		rightTrackModel[83].setRotationPoint(55.25F, -3.25F, -19.5F);
		rightTrackModel[83].rotateAngleZ = -2.07694181F;

		rightTrackModel[84].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox100
		rightTrackModel[84].setRotationPoint(55.25F, -3.25F, -28.5F);
		rightTrackModel[84].rotateAngleZ = -2.07694181F;

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox101
		rightTrackModel[85].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[85].rotateAngleZ = -2.47836754F;

		rightTrackModel[86].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		rightTrackModel[86].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[86].rotateAngleZ = -2.47836754F;

		rightTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox103
		rightTrackModel[87].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[87].rotateAngleZ = -2.47836754F;

		rightTrackModel[88].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox104
		rightTrackModel[88].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[88].rotateAngleZ = -2.47836754F;

		rightTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
		rightTrackModel[89].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[89].rotateAngleZ = -2.47836754F;

		rightTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		rightTrackModel[90].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[90].rotateAngleZ = -2.47836754F;

		rightTrackModel[91].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox107
		rightTrackModel[91].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[91].rotateAngleZ = -2.47836754F;

		rightTrackModel[92].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		rightTrackModel[92].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[92].rotateAngleZ = -2.47836754F;

		rightTrackModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox109
		rightTrackModel[93].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[93].rotateAngleZ = -2.47836754F;

		rightTrackModel[94].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox110
		rightTrackModel[94].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[94].rotateAngleZ = -2.47836754F;

		rightTrackModel[95].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox111
		rightTrackModel[95].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[95].rotateAngleZ = -2.47836754F;

		rightTrackModel[96].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox112
		rightTrackModel[96].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[96].rotateAngleZ = -2.47836754F;

		rightTrackModel[97].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox113
		rightTrackModel[97].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[97].rotateAngleZ = -2.47836754F;

		rightTrackModel[98].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
		rightTrackModel[98].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[98].rotateAngleZ = -2.47836754F;

		rightTrackModel[99].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox115
		rightTrackModel[99].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[99].rotateAngleZ = -2.47836754F;

		rightTrackModel[100].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox116
		rightTrackModel[100].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[100].rotateAngleZ = -2.47836754F;

		rightTrackModel[101].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox117
		rightTrackModel[101].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[101].rotateAngleZ = -2.47836754F;

		rightTrackModel[102].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox118
		rightTrackModel[102].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[102].rotateAngleZ = -2.47836754F;

		rightTrackModel[103].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox119
		rightTrackModel[103].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[103].rotateAngleZ = -2.47836754F;

		rightTrackModel[104].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox120
		rightTrackModel[104].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[104].rotateAngleZ = -2.47836754F;

		rightTrackModel[105].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		rightTrackModel[105].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[105].rotateAngleZ = -2.47836754F;

		rightTrackModel[106].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
		rightTrackModel[106].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[106].rotateAngleZ = -2.47836754F;

		rightTrackModel[107].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox123
		rightTrackModel[107].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[107].rotateAngleZ = -2.47836754F;

		rightTrackModel[108].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox124
		rightTrackModel[108].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[108].rotateAngleZ = -2.47836754F;

		rightTrackModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		rightTrackModel[109].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[109].rotateAngleZ = -2.47836754F;

		rightTrackModel[110].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		rightTrackModel[110].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[110].rotateAngleZ = -2.47836754F;

		rightTrackModel[111].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		rightTrackModel[111].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[111].rotateAngleZ = -2.47836754F;

		rightTrackModel[112].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox128
		rightTrackModel[112].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[112].rotateAngleZ = -2.47836754F;

		rightTrackModel[113].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		rightTrackModel[113].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[113].rotateAngleZ = -2.47836754F;

		rightTrackModel[114].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		rightTrackModel[114].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[114].rotateAngleZ = -2.47836754F;

		rightTrackModel[115].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox131
		rightTrackModel[115].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[115].rotateAngleZ = -2.47836754F;

		rightTrackModel[116].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox132
		rightTrackModel[116].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[116].rotateAngleZ = -2.47836754F;

		rightTrackModel[117].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox133
		rightTrackModel[117].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[117].rotateAngleZ = -2.47836754F;

		rightTrackModel[118].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox134
		rightTrackModel[118].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[118].rotateAngleZ = -2.47836754F;

		rightTrackModel[119].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox135
		rightTrackModel[119].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[119].rotateAngleZ = -2.47836754F;

		rightTrackModel[120].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox136
		rightTrackModel[120].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[120].rotateAngleZ = -2.47836754F;

		rightTrackModel[121].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox137
		rightTrackModel[121].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[121].rotateAngleZ = -2.47836754F;

		rightTrackModel[122].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox138
		rightTrackModel[122].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[122].rotateAngleZ = -2.47836754F;

		rightTrackModel[123].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox139
		rightTrackModel[123].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[123].rotateAngleZ = -2.47836754F;

		rightTrackModel[124].addShapeBox(14F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox140
		rightTrackModel[124].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[124].rotateAngleZ = -2.47836754F;

		rightTrackModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox141
		rightTrackModel[125].setRotationPoint(43.5F, 8.8F, -27.5F);
		rightTrackModel[125].rotateAngleZ = -3.08923278F;

		rightTrackModel[126].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox142
		rightTrackModel[126].setRotationPoint(43.5F, 8.8F, -27.5F);
		rightTrackModel[126].rotateAngleZ = -3.08923278F;

		rightTrackModel[127].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox143
		rightTrackModel[127].setRotationPoint(43.5F, 8.8F, -24.5F);
		rightTrackModel[127].rotateAngleZ = -3.08923278F;

		rightTrackModel[128].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox144
		rightTrackModel[128].setRotationPoint(43.5F, 8.8F, -23.5F);
		rightTrackModel[128].rotateAngleZ = -3.08923278F;

		rightTrackModel[129].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox145
		rightTrackModel[129].setRotationPoint(43.5F, 8.8F, -21.5F);
		rightTrackModel[129].rotateAngleZ = -3.08923278F;

		rightTrackModel[130].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		rightTrackModel[130].setRotationPoint(43.5F, 8.8F, -19.5F);
		rightTrackModel[130].rotateAngleZ = -3.08923278F;

		rightTrackModel[131].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox147
		rightTrackModel[131].setRotationPoint(43.5F, 8.8F, -19.5F);
		rightTrackModel[131].rotateAngleZ = -3.08923278F;

		rightTrackModel[132].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox148
		rightTrackModel[132].setRotationPoint(43.5F, 8.8F, -28.5F);
		rightTrackModel[132].rotateAngleZ = -3.08923278F;

		rightTrackModel[133].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox149
		rightTrackModel[133].setRotationPoint(40.5F, 9F, -27.5F);
		rightTrackModel[133].rotateAngleZ = -3.14159265F;

		rightTrackModel[134].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox150
		rightTrackModel[134].setRotationPoint(40.5F, 9F, -27.5F);
		rightTrackModel[134].rotateAngleZ = -3.14159265F;

		rightTrackModel[135].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox151
		rightTrackModel[135].setRotationPoint(40.5F, 9F, -24.5F);
		rightTrackModel[135].rotateAngleZ = -3.14159265F;

		rightTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox152
		rightTrackModel[136].setRotationPoint(40.5F, 9F, -23.5F);
		rightTrackModel[136].rotateAngleZ = -3.14159265F;

		rightTrackModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox153
		rightTrackModel[137].setRotationPoint(40.5F, 9F, -21.5F);
		rightTrackModel[137].rotateAngleZ = -3.14159265F;

		rightTrackModel[138].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox154
		rightTrackModel[138].setRotationPoint(40.5F, 9F, -19.5F);
		rightTrackModel[138].rotateAngleZ = -3.14159265F;

		rightTrackModel[139].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox155
		rightTrackModel[139].setRotationPoint(40.5F, 9F, -19.5F);
		rightTrackModel[139].rotateAngleZ = -3.14159265F;

		rightTrackModel[140].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox156
		rightTrackModel[140].setRotationPoint(40.5F, 9F, -28.5F);
		rightTrackModel[140].rotateAngleZ = -3.14159265F;

		rightTrackModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox157
		rightTrackModel[141].setRotationPoint(37.5F, 9F, -27.5F);
		rightTrackModel[141].rotateAngleZ = -3.14159265F;

		rightTrackModel[142].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox158
		rightTrackModel[142].setRotationPoint(37.5F, 9F, -27.5F);
		rightTrackModel[142].rotateAngleZ = -3.14159265F;

		rightTrackModel[143].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox159
		rightTrackModel[143].setRotationPoint(37.5F, 9F, -24.5F);
		rightTrackModel[143].rotateAngleZ = -3.14159265F;

		rightTrackModel[144].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox160
		rightTrackModel[144].setRotationPoint(37.5F, 9F, -23.5F);
		rightTrackModel[144].rotateAngleZ = -3.14159265F;

		rightTrackModel[145].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox161
		rightTrackModel[145].setRotationPoint(37.5F, 9F, -21.5F);
		rightTrackModel[145].rotateAngleZ = -3.14159265F;

		rightTrackModel[146].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox162
		rightTrackModel[146].setRotationPoint(37.5F, 9F, -19.5F);
		rightTrackModel[146].rotateAngleZ = -3.14159265F;

		rightTrackModel[147].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox163
		rightTrackModel[147].setRotationPoint(37.5F, 9F, -19.5F);
		rightTrackModel[147].rotateAngleZ = -3.14159265F;

		rightTrackModel[148].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		rightTrackModel[148].setRotationPoint(37.5F, 9F, -28.5F);
		rightTrackModel[148].rotateAngleZ = -3.14159265F;

		rightTrackModel[149].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox165
		rightTrackModel[149].setRotationPoint(34.5F, 9F, -27.5F);
		rightTrackModel[149].rotateAngleZ = -3.14159265F;

		rightTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		rightTrackModel[150].setRotationPoint(34.5F, 9F, -27.5F);
		rightTrackModel[150].rotateAngleZ = -3.14159265F;

		rightTrackModel[151].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox167
		rightTrackModel[151].setRotationPoint(34.5F, 9F, -24.5F);
		rightTrackModel[151].rotateAngleZ = -3.14159265F;

		rightTrackModel[152].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox168
		rightTrackModel[152].setRotationPoint(34.5F, 9F, -23.5F);
		rightTrackModel[152].rotateAngleZ = -3.14159265F;

		rightTrackModel[153].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox169
		rightTrackModel[153].setRotationPoint(34.5F, 9F, -21.5F);
		rightTrackModel[153].rotateAngleZ = -3.14159265F;

		rightTrackModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox170
		rightTrackModel[154].setRotationPoint(34.5F, 9F, -19.5F);
		rightTrackModel[154].rotateAngleZ = -3.14159265F;

		rightTrackModel[155].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox171
		rightTrackModel[155].setRotationPoint(34.5F, 9F, -19.5F);
		rightTrackModel[155].rotateAngleZ = -3.14159265F;

		rightTrackModel[156].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		rightTrackModel[156].setRotationPoint(34.5F, 9F, -28.5F);
		rightTrackModel[156].rotateAngleZ = -3.14159265F;

		rightTrackModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		rightTrackModel[157].setRotationPoint(31.5F, 9F, -27.5F);
		rightTrackModel[157].rotateAngleZ = -3.14159265F;

		rightTrackModel[158].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		rightTrackModel[158].setRotationPoint(31.5F, 9F, -27.5F);
		rightTrackModel[158].rotateAngleZ = -3.14159265F;

		rightTrackModel[159].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox175
		rightTrackModel[159].setRotationPoint(31.5F, 9F, -24.5F);
		rightTrackModel[159].rotateAngleZ = -3.14159265F;

		rightTrackModel[160].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox176
		rightTrackModel[160].setRotationPoint(31.5F, 9F, -23.5F);
		rightTrackModel[160].rotateAngleZ = -3.14159265F;

		rightTrackModel[161].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox177
		rightTrackModel[161].setRotationPoint(31.5F, 9F, -21.5F);
		rightTrackModel[161].rotateAngleZ = -3.14159265F;

		rightTrackModel[162].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox178
		rightTrackModel[162].setRotationPoint(31.5F, 9F, -19.5F);
		rightTrackModel[162].rotateAngleZ = -3.14159265F;

		rightTrackModel[163].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox179
		rightTrackModel[163].setRotationPoint(31.5F, 9F, -19.5F);
		rightTrackModel[163].rotateAngleZ = -3.14159265F;

		rightTrackModel[164].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox180
		rightTrackModel[164].setRotationPoint(31.5F, 9F, -28.5F);
		rightTrackModel[164].rotateAngleZ = -3.14159265F;

		rightTrackModel[165].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox181
		rightTrackModel[165].setRotationPoint(28.5F, 9F, -27.5F);
		rightTrackModel[165].rotateAngleZ = -3.14159265F;

		rightTrackModel[166].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox182
		rightTrackModel[166].setRotationPoint(28.5F, 9F, -27.5F);
		rightTrackModel[166].rotateAngleZ = -3.14159265F;

		rightTrackModel[167].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox183
		rightTrackModel[167].setRotationPoint(28.5F, 9F, -24.5F);
		rightTrackModel[167].rotateAngleZ = -3.14159265F;

		rightTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox184
		rightTrackModel[168].setRotationPoint(28.5F, 9F, -23.5F);
		rightTrackModel[168].rotateAngleZ = -3.14159265F;

		rightTrackModel[169].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox185
		rightTrackModel[169].setRotationPoint(28.5F, 9F, -21.5F);
		rightTrackModel[169].rotateAngleZ = -3.14159265F;

		rightTrackModel[170].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox186
		rightTrackModel[170].setRotationPoint(28.5F, 9F, -19.5F);
		rightTrackModel[170].rotateAngleZ = -3.14159265F;

		rightTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox187
		rightTrackModel[171].setRotationPoint(28.5F, 9F, -19.5F);
		rightTrackModel[171].rotateAngleZ = -3.14159265F;

		rightTrackModel[172].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox188
		rightTrackModel[172].setRotationPoint(28.5F, 9F, -28.5F);
		rightTrackModel[172].rotateAngleZ = -3.14159265F;

		rightTrackModel[173].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox189
		rightTrackModel[173].setRotationPoint(25.5F, 9F, -27.5F);
		rightTrackModel[173].rotateAngleZ = -3.14159265F;

		rightTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox190
		rightTrackModel[174].setRotationPoint(25.5F, 9F, -27.5F);
		rightTrackModel[174].rotateAngleZ = -3.14159265F;

		rightTrackModel[175].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox191
		rightTrackModel[175].setRotationPoint(25.5F, 9F, -24.5F);
		rightTrackModel[175].rotateAngleZ = -3.14159265F;

		rightTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox192
		rightTrackModel[176].setRotationPoint(25.5F, 9F, -23.5F);
		rightTrackModel[176].rotateAngleZ = -3.14159265F;

		rightTrackModel[177].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox193
		rightTrackModel[177].setRotationPoint(25.5F, 9F, -21.5F);
		rightTrackModel[177].rotateAngleZ = -3.14159265F;

		rightTrackModel[178].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox194
		rightTrackModel[178].setRotationPoint(25.5F, 9F, -19.5F);
		rightTrackModel[178].rotateAngleZ = -3.14159265F;

		rightTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox195
		rightTrackModel[179].setRotationPoint(25.5F, 9F, -19.5F);
		rightTrackModel[179].rotateAngleZ = -3.14159265F;

		rightTrackModel[180].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox196
		rightTrackModel[180].setRotationPoint(25.5F, 9F, -28.5F);
		rightTrackModel[180].rotateAngleZ = -3.14159265F;

		rightTrackModel[181].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox197
		rightTrackModel[181].setRotationPoint(22.5F, 9F, -27.5F);
		rightTrackModel[181].rotateAngleZ = -3.14159265F;

		rightTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox198
		rightTrackModel[182].setRotationPoint(22.5F, 9F, -27.5F);
		rightTrackModel[182].rotateAngleZ = -3.14159265F;

		rightTrackModel[183].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox199
		rightTrackModel[183].setRotationPoint(22.5F, 9F, -24.5F);
		rightTrackModel[183].rotateAngleZ = -3.14159265F;

		rightTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox200
		rightTrackModel[184].setRotationPoint(22.5F, 9F, -23.5F);
		rightTrackModel[184].rotateAngleZ = -3.14159265F;

		rightTrackModel[185].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox201
		rightTrackModel[185].setRotationPoint(22.5F, 9F, -21.5F);
		rightTrackModel[185].rotateAngleZ = -3.14159265F;

		rightTrackModel[186].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox202
		rightTrackModel[186].setRotationPoint(22.5F, 9F, -19.5F);
		rightTrackModel[186].rotateAngleZ = -3.14159265F;

		rightTrackModel[187].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox203
		rightTrackModel[187].setRotationPoint(22.5F, 9F, -19.5F);
		rightTrackModel[187].rotateAngleZ = -3.14159265F;

		rightTrackModel[188].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox204
		rightTrackModel[188].setRotationPoint(22.5F, 9F, -28.5F);
		rightTrackModel[188].rotateAngleZ = -3.14159265F;

		rightTrackModel[189].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox205
		rightTrackModel[189].setRotationPoint(19.5F, 9F, -27.5F);
		rightTrackModel[189].rotateAngleZ = -3.14159265F;

		rightTrackModel[190].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox206
		rightTrackModel[190].setRotationPoint(19.5F, 9F, -27.5F);
		rightTrackModel[190].rotateAngleZ = -3.14159265F;

		rightTrackModel[191].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox207
		rightTrackModel[191].setRotationPoint(19.5F, 9F, -24.5F);
		rightTrackModel[191].rotateAngleZ = -3.14159265F;

		rightTrackModel[192].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox208
		rightTrackModel[192].setRotationPoint(19.5F, 9F, -23.5F);
		rightTrackModel[192].rotateAngleZ = -3.14159265F;

		rightTrackModel[193].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox209
		rightTrackModel[193].setRotationPoint(19.5F, 9F, -21.5F);
		rightTrackModel[193].rotateAngleZ = -3.14159265F;

		rightTrackModel[194].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox210
		rightTrackModel[194].setRotationPoint(19.5F, 9F, -19.5F);
		rightTrackModel[194].rotateAngleZ = -3.14159265F;

		rightTrackModel[195].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox211
		rightTrackModel[195].setRotationPoint(19.5F, 9F, -19.5F);
		rightTrackModel[195].rotateAngleZ = -3.14159265F;

		rightTrackModel[196].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox212
		rightTrackModel[196].setRotationPoint(19.5F, 9F, -28.5F);
		rightTrackModel[196].rotateAngleZ = -3.14159265F;

		rightTrackModel[197].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox213
		rightTrackModel[197].setRotationPoint(16.5F, 9F, -27.5F);
		rightTrackModel[197].rotateAngleZ = -3.14159265F;

		rightTrackModel[198].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox214
		rightTrackModel[198].setRotationPoint(16.5F, 9F, -27.5F);
		rightTrackModel[198].rotateAngleZ = -3.14159265F;

		rightTrackModel[199].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox215
		rightTrackModel[199].setRotationPoint(16.5F, 9F, -24.5F);
		rightTrackModel[199].rotateAngleZ = -3.14159265F;

		rightTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox216
		rightTrackModel[200].setRotationPoint(16.5F, 9F, -23.5F);
		rightTrackModel[200].rotateAngleZ = -3.14159265F;

		rightTrackModel[201].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox217
		rightTrackModel[201].setRotationPoint(16.5F, 9F, -21.5F);
		rightTrackModel[201].rotateAngleZ = -3.14159265F;

		rightTrackModel[202].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox218
		rightTrackModel[202].setRotationPoint(16.5F, 9F, -19.5F);
		rightTrackModel[202].rotateAngleZ = -3.14159265F;

		rightTrackModel[203].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox219
		rightTrackModel[203].setRotationPoint(16.5F, 9F, -19.5F);
		rightTrackModel[203].rotateAngleZ = -3.14159265F;

		rightTrackModel[204].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		rightTrackModel[204].setRotationPoint(16.5F, 9F, -28.5F);
		rightTrackModel[204].rotateAngleZ = -3.14159265F;

		rightTrackModel[205].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox221
		rightTrackModel[205].setRotationPoint(13.5F, 9F, -27.5F);
		rightTrackModel[205].rotateAngleZ = -3.14159265F;

		rightTrackModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox222
		rightTrackModel[206].setRotationPoint(13.5F, 9F, -27.5F);
		rightTrackModel[206].rotateAngleZ = -3.14159265F;

		rightTrackModel[207].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox223
		rightTrackModel[207].setRotationPoint(13.5F, 9F, -24.5F);
		rightTrackModel[207].rotateAngleZ = -3.14159265F;

		rightTrackModel[208].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox224
		rightTrackModel[208].setRotationPoint(13.5F, 9F, -23.5F);
		rightTrackModel[208].rotateAngleZ = -3.14159265F;

		rightTrackModel[209].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox225
		rightTrackModel[209].setRotationPoint(13.5F, 9F, -21.5F);
		rightTrackModel[209].rotateAngleZ = -3.14159265F;

		rightTrackModel[210].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox226
		rightTrackModel[210].setRotationPoint(13.5F, 9F, -19.5F);
		rightTrackModel[210].rotateAngleZ = -3.14159265F;

		rightTrackModel[211].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox227
		rightTrackModel[211].setRotationPoint(13.5F, 9F, -19.5F);
		rightTrackModel[211].rotateAngleZ = -3.14159265F;

		rightTrackModel[212].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox228
		rightTrackModel[212].setRotationPoint(13.5F, 9F, -28.5F);
		rightTrackModel[212].rotateAngleZ = -3.14159265F;

		rightTrackModel[213].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox229
		rightTrackModel[213].setRotationPoint(10.5F, 9F, -27.5F);
		rightTrackModel[213].rotateAngleZ = -3.14159265F;

		rightTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox230
		rightTrackModel[214].setRotationPoint(10.5F, 9F, -27.5F);
		rightTrackModel[214].rotateAngleZ = -3.14159265F;

		rightTrackModel[215].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox231
		rightTrackModel[215].setRotationPoint(10.5F, 9F, -24.5F);
		rightTrackModel[215].rotateAngleZ = -3.14159265F;

		rightTrackModel[216].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox232
		rightTrackModel[216].setRotationPoint(10.5F, 9F, -23.5F);
		rightTrackModel[216].rotateAngleZ = -3.14159265F;

		rightTrackModel[217].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox233
		rightTrackModel[217].setRotationPoint(10.5F, 9F, -21.5F);
		rightTrackModel[217].rotateAngleZ = -3.14159265F;

		rightTrackModel[218].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox234
		rightTrackModel[218].setRotationPoint(10.5F, 9F, -19.5F);
		rightTrackModel[218].rotateAngleZ = -3.14159265F;

		rightTrackModel[219].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox235
		rightTrackModel[219].setRotationPoint(10.5F, 9F, -19.5F);
		rightTrackModel[219].rotateAngleZ = -3.14159265F;

		rightTrackModel[220].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox236
		rightTrackModel[220].setRotationPoint(10.5F, 9F, -28.5F);
		rightTrackModel[220].rotateAngleZ = -3.14159265F;

		rightTrackModel[221].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox237
		rightTrackModel[221].setRotationPoint(7.5F, 9F, -27.5F);
		rightTrackModel[221].rotateAngleZ = -3.14159265F;

		rightTrackModel[222].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox238
		rightTrackModel[222].setRotationPoint(7.5F, 9F, -27.5F);
		rightTrackModel[222].rotateAngleZ = -3.14159265F;

		rightTrackModel[223].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox239
		rightTrackModel[223].setRotationPoint(7.5F, 9F, -24.5F);
		rightTrackModel[223].rotateAngleZ = -3.14159265F;

		rightTrackModel[224].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox240
		rightTrackModel[224].setRotationPoint(7.5F, 9F, -23.5F);
		rightTrackModel[224].rotateAngleZ = -3.14159265F;

		rightTrackModel[225].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox241
		rightTrackModel[225].setRotationPoint(7.5F, 9F, -21.5F);
		rightTrackModel[225].rotateAngleZ = -3.14159265F;

		rightTrackModel[226].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox242
		rightTrackModel[226].setRotationPoint(7.5F, 9F, -19.5F);
		rightTrackModel[226].rotateAngleZ = -3.14159265F;

		rightTrackModel[227].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox243
		rightTrackModel[227].setRotationPoint(7.5F, 9F, -19.5F);
		rightTrackModel[227].rotateAngleZ = -3.14159265F;

		rightTrackModel[228].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox244
		rightTrackModel[228].setRotationPoint(7.5F, 9F, -28.5F);
		rightTrackModel[228].rotateAngleZ = -3.14159265F;

		rightTrackModel[229].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox245
		rightTrackModel[229].setRotationPoint(4.5F, 9F, -27.5F);
		rightTrackModel[229].rotateAngleZ = -3.14159265F;

		rightTrackModel[230].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox246
		rightTrackModel[230].setRotationPoint(4.5F, 9F, -27.5F);
		rightTrackModel[230].rotateAngleZ = -3.14159265F;

		rightTrackModel[231].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox247
		rightTrackModel[231].setRotationPoint(4.5F, 9F, -24.5F);
		rightTrackModel[231].rotateAngleZ = -3.14159265F;

		rightTrackModel[232].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox248
		rightTrackModel[232].setRotationPoint(4.5F, 9F, -23.5F);
		rightTrackModel[232].rotateAngleZ = -3.14159265F;

		rightTrackModel[233].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox249
		rightTrackModel[233].setRotationPoint(4.5F, 9F, -21.5F);
		rightTrackModel[233].rotateAngleZ = -3.14159265F;

		rightTrackModel[234].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox250
		rightTrackModel[234].setRotationPoint(4.5F, 9F, -19.5F);
		rightTrackModel[234].rotateAngleZ = -3.14159265F;

		rightTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox251
		rightTrackModel[235].setRotationPoint(4.5F, 9F, -19.5F);
		rightTrackModel[235].rotateAngleZ = -3.14159265F;

		rightTrackModel[236].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox252
		rightTrackModel[236].setRotationPoint(4.5F, 9F, -28.5F);
		rightTrackModel[236].rotateAngleZ = -3.14159265F;

		rightTrackModel[237].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox253
		rightTrackModel[237].setRotationPoint(1.5F, 9F, -27.5F);
		rightTrackModel[237].rotateAngleZ = -3.14159265F;

		rightTrackModel[238].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox254
		rightTrackModel[238].setRotationPoint(1.5F, 9F, -27.5F);
		rightTrackModel[238].rotateAngleZ = -3.14159265F;

		rightTrackModel[239].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox255
		rightTrackModel[239].setRotationPoint(1.5F, 9F, -24.5F);
		rightTrackModel[239].rotateAngleZ = -3.14159265F;

		rightTrackModel[240].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox256
		rightTrackModel[240].setRotationPoint(1.5F, 9F, -23.5F);
		rightTrackModel[240].rotateAngleZ = -3.14159265F;

		rightTrackModel[241].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox257
		rightTrackModel[241].setRotationPoint(1.5F, 9F, -21.5F);
		rightTrackModel[241].rotateAngleZ = -3.14159265F;

		rightTrackModel[242].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox258
		rightTrackModel[242].setRotationPoint(1.5F, 9F, -19.5F);
		rightTrackModel[242].rotateAngleZ = -3.14159265F;

		rightTrackModel[243].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox259
		rightTrackModel[243].setRotationPoint(1.5F, 9F, -19.5F);
		rightTrackModel[243].rotateAngleZ = -3.14159265F;

		rightTrackModel[244].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox260
		rightTrackModel[244].setRotationPoint(1.5F, 9F, -28.5F);
		rightTrackModel[244].rotateAngleZ = -3.14159265F;

		rightTrackModel[245].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox261
		rightTrackModel[245].setRotationPoint(-1.5F, 9F, -27.5F);
		rightTrackModel[245].rotateAngleZ = -3.14159265F;

		rightTrackModel[246].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox262
		rightTrackModel[246].setRotationPoint(-1.5F, 9F, -27.5F);
		rightTrackModel[246].rotateAngleZ = -3.14159265F;

		rightTrackModel[247].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox263
		rightTrackModel[247].setRotationPoint(-1.5F, 9F, -24.5F);
		rightTrackModel[247].rotateAngleZ = -3.14159265F;

		rightTrackModel[248].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox264
		rightTrackModel[248].setRotationPoint(-1.5F, 9F, -23.5F);
		rightTrackModel[248].rotateAngleZ = -3.14159265F;

		rightTrackModel[249].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox265
		rightTrackModel[249].setRotationPoint(-1.5F, 9F, -21.5F);
		rightTrackModel[249].rotateAngleZ = -3.14159265F;

		rightTrackModel[250].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox266
		rightTrackModel[250].setRotationPoint(-1.5F, 9F, -19.5F);
		rightTrackModel[250].rotateAngleZ = -3.14159265F;

		rightTrackModel[251].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox267
		rightTrackModel[251].setRotationPoint(-1.5F, 9F, -19.5F);
		rightTrackModel[251].rotateAngleZ = -3.14159265F;

		rightTrackModel[252].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox268
		rightTrackModel[252].setRotationPoint(-1.5F, 9F, -28.5F);
		rightTrackModel[252].rotateAngleZ = -3.14159265F;

		rightTrackModel[253].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox269
		rightTrackModel[253].setRotationPoint(-4.5F, 9F, -27.5F);
		rightTrackModel[253].rotateAngleZ = -3.14159265F;

		rightTrackModel[254].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox270
		rightTrackModel[254].setRotationPoint(-4.5F, 9F, -27.5F);
		rightTrackModel[254].rotateAngleZ = -3.14159265F;

		rightTrackModel[255].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox271
		rightTrackModel[255].setRotationPoint(-4.5F, 9F, -24.5F);
		rightTrackModel[255].rotateAngleZ = -3.14159265F;

		rightTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox272
		rightTrackModel[256].setRotationPoint(-4.5F, 9F, -23.5F);
		rightTrackModel[256].rotateAngleZ = -3.14159265F;

		rightTrackModel[257].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox273
		rightTrackModel[257].setRotationPoint(-4.5F, 9F, -21.5F);
		rightTrackModel[257].rotateAngleZ = -3.14159265F;

		rightTrackModel[258].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox274
		rightTrackModel[258].setRotationPoint(-4.5F, 9F, -19.5F);
		rightTrackModel[258].rotateAngleZ = -3.14159265F;

		rightTrackModel[259].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox275
		rightTrackModel[259].setRotationPoint(-4.5F, 9F, -19.5F);
		rightTrackModel[259].rotateAngleZ = -3.14159265F;

		rightTrackModel[260].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox276
		rightTrackModel[260].setRotationPoint(-4.5F, 9F, -28.5F);
		rightTrackModel[260].rotateAngleZ = -3.14159265F;

		rightTrackModel[261].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox277
		rightTrackModel[261].setRotationPoint(-7.5F, 9F, -27.5F);
		rightTrackModel[261].rotateAngleZ = -3.14159265F;

		rightTrackModel[262].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox278
		rightTrackModel[262].setRotationPoint(-7.5F, 9F, -27.5F);
		rightTrackModel[262].rotateAngleZ = -3.14159265F;

		rightTrackModel[263].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox279
		rightTrackModel[263].setRotationPoint(-7.5F, 9F, -24.5F);
		rightTrackModel[263].rotateAngleZ = -3.14159265F;

		rightTrackModel[264].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox280
		rightTrackModel[264].setRotationPoint(-7.5F, 9F, -23.5F);
		rightTrackModel[264].rotateAngleZ = -3.14159265F;

		rightTrackModel[265].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox281
		rightTrackModel[265].setRotationPoint(-7.5F, 9F, -21.5F);
		rightTrackModel[265].rotateAngleZ = -3.14159265F;

		rightTrackModel[266].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox282
		rightTrackModel[266].setRotationPoint(-7.5F, 9F, -19.5F);
		rightTrackModel[266].rotateAngleZ = -3.14159265F;

		rightTrackModel[267].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox283
		rightTrackModel[267].setRotationPoint(-7.5F, 9F, -19.5F);
		rightTrackModel[267].rotateAngleZ = -3.14159265F;

		rightTrackModel[268].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox284
		rightTrackModel[268].setRotationPoint(-7.5F, 9F, -28.5F);
		rightTrackModel[268].rotateAngleZ = -3.14159265F;

		rightTrackModel[269].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox285
		rightTrackModel[269].setRotationPoint(-10.5F, 9F, -27.5F);
		rightTrackModel[269].rotateAngleZ = -3.14159265F;

		rightTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox286
		rightTrackModel[270].setRotationPoint(-10.5F, 9F, -27.5F);
		rightTrackModel[270].rotateAngleZ = -3.14159265F;

		rightTrackModel[271].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox287
		rightTrackModel[271].setRotationPoint(-10.5F, 9F, -24.5F);
		rightTrackModel[271].rotateAngleZ = -3.14159265F;

		rightTrackModel[272].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox288
		rightTrackModel[272].setRotationPoint(-10.5F, 9F, -23.5F);
		rightTrackModel[272].rotateAngleZ = -3.14159265F;

		rightTrackModel[273].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox289
		rightTrackModel[273].setRotationPoint(-10.5F, 9F, -21.5F);
		rightTrackModel[273].rotateAngleZ = -3.14159265F;

		rightTrackModel[274].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox290
		rightTrackModel[274].setRotationPoint(-10.5F, 9F, -19.5F);
		rightTrackModel[274].rotateAngleZ = -3.14159265F;

		rightTrackModel[275].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox291
		rightTrackModel[275].setRotationPoint(-10.5F, 9F, -19.5F);
		rightTrackModel[275].rotateAngleZ = -3.14159265F;

		rightTrackModel[276].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox292
		rightTrackModel[276].setRotationPoint(-10.5F, 9F, -28.5F);
		rightTrackModel[276].rotateAngleZ = -3.14159265F;

		rightTrackModel[277].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox293
		rightTrackModel[277].setRotationPoint(-13.5F, 9F, -27.5F);
		rightTrackModel[277].rotateAngleZ = -3.14159265F;

		rightTrackModel[278].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox294
		rightTrackModel[278].setRotationPoint(-13.5F, 9F, -27.5F);
		rightTrackModel[278].rotateAngleZ = -3.14159265F;

		rightTrackModel[279].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox295
		rightTrackModel[279].setRotationPoint(-13.5F, 9F, -24.5F);
		rightTrackModel[279].rotateAngleZ = -3.14159265F;

		rightTrackModel[280].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox296
		rightTrackModel[280].setRotationPoint(-13.5F, 9F, -23.5F);
		rightTrackModel[280].rotateAngleZ = -3.14159265F;

		rightTrackModel[281].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox297
		rightTrackModel[281].setRotationPoint(-13.5F, 9F, -21.5F);
		rightTrackModel[281].rotateAngleZ = -3.14159265F;

		rightTrackModel[282].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox298
		rightTrackModel[282].setRotationPoint(-13.5F, 9F, -19.5F);
		rightTrackModel[282].rotateAngleZ = -3.14159265F;

		rightTrackModel[283].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox299
		rightTrackModel[283].setRotationPoint(-13.5F, 9F, -19.5F);
		rightTrackModel[283].rotateAngleZ = -3.14159265F;

		rightTrackModel[284].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox300
		rightTrackModel[284].setRotationPoint(-13.5F, 9F, -28.5F);
		rightTrackModel[284].rotateAngleZ = -3.14159265F;

		rightTrackModel[285].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox301
		rightTrackModel[285].setRotationPoint(-16.5F, 9F, -27.5F);
		rightTrackModel[285].rotateAngleZ = -3.14159265F;

		rightTrackModel[286].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox302
		rightTrackModel[286].setRotationPoint(-16.5F, 9F, -27.5F);
		rightTrackModel[286].rotateAngleZ = -3.14159265F;

		rightTrackModel[287].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox303
		rightTrackModel[287].setRotationPoint(-16.5F, 9F, -24.5F);
		rightTrackModel[287].rotateAngleZ = -3.14159265F;

		rightTrackModel[288].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox304
		rightTrackModel[288].setRotationPoint(-16.5F, 9F, -23.5F);
		rightTrackModel[288].rotateAngleZ = -3.14159265F;

		rightTrackModel[289].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox305
		rightTrackModel[289].setRotationPoint(-16.5F, 9F, -21.5F);
		rightTrackModel[289].rotateAngleZ = -3.14159265F;

		rightTrackModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox306
		rightTrackModel[290].setRotationPoint(-16.5F, 9F, -19.5F);
		rightTrackModel[290].rotateAngleZ = -3.14159265F;

		rightTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox307
		rightTrackModel[291].setRotationPoint(-16.5F, 9F, -19.5F);
		rightTrackModel[291].rotateAngleZ = -3.14159265F;

		rightTrackModel[292].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox308
		rightTrackModel[292].setRotationPoint(-16.5F, 9F, -28.5F);
		rightTrackModel[292].rotateAngleZ = -3.14159265F;

		rightTrackModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox309
		rightTrackModel[293].setRotationPoint(-19.5F, 9F, -27.5F);
		rightTrackModel[293].rotateAngleZ = -3.14159265F;

		rightTrackModel[294].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox310
		rightTrackModel[294].setRotationPoint(-19.5F, 9F, -27.5F);
		rightTrackModel[294].rotateAngleZ = -3.14159265F;

		rightTrackModel[295].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox311
		rightTrackModel[295].setRotationPoint(-19.5F, 9F, -24.5F);
		rightTrackModel[295].rotateAngleZ = -3.14159265F;

		rightTrackModel[296].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox312
		rightTrackModel[296].setRotationPoint(-19.5F, 9F, -23.5F);
		rightTrackModel[296].rotateAngleZ = -3.14159265F;

		rightTrackModel[297].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox313
		rightTrackModel[297].setRotationPoint(-19.5F, 9F, -21.5F);
		rightTrackModel[297].rotateAngleZ = -3.14159265F;

		rightTrackModel[298].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox314
		rightTrackModel[298].setRotationPoint(-19.5F, 9F, -19.5F);
		rightTrackModel[298].rotateAngleZ = -3.14159265F;

		rightTrackModel[299].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox315
		rightTrackModel[299].setRotationPoint(-19.5F, 9F, -19.5F);
		rightTrackModel[299].rotateAngleZ = -3.14159265F;

		rightTrackModel[300].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox316
		rightTrackModel[300].setRotationPoint(-19.5F, 9F, -28.5F);
		rightTrackModel[300].rotateAngleZ = -3.14159265F;

		rightTrackModel[301].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox317
		rightTrackModel[301].setRotationPoint(-22.5F, 9F, -27.5F);
		rightTrackModel[301].rotateAngleZ = -3.14159265F;

		rightTrackModel[302].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox318
		rightTrackModel[302].setRotationPoint(-22.5F, 9F, -27.5F);
		rightTrackModel[302].rotateAngleZ = -3.14159265F;

		rightTrackModel[303].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox319
		rightTrackModel[303].setRotationPoint(-22.5F, 9F, -24.5F);
		rightTrackModel[303].rotateAngleZ = -3.14159265F;

		rightTrackModel[304].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox320
		rightTrackModel[304].setRotationPoint(-22.5F, 9F, -23.5F);
		rightTrackModel[304].rotateAngleZ = -3.14159265F;

		rightTrackModel[305].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox321
		rightTrackModel[305].setRotationPoint(-22.5F, 9F, -21.5F);
		rightTrackModel[305].rotateAngleZ = -3.14159265F;

		rightTrackModel[306].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox322
		rightTrackModel[306].setRotationPoint(-22.5F, 9F, -19.5F);
		rightTrackModel[306].rotateAngleZ = -3.14159265F;

		rightTrackModel[307].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox323
		rightTrackModel[307].setRotationPoint(-22.5F, 9F, -19.5F);
		rightTrackModel[307].rotateAngleZ = -3.14159265F;

		rightTrackModel[308].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox324
		rightTrackModel[308].setRotationPoint(-22.5F, 9F, -28.5F);
		rightTrackModel[308].rotateAngleZ = -3.14159265F;

		rightTrackModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox325
		rightTrackModel[309].setRotationPoint(-26.5F, 9F, -27.5F);
		rightTrackModel[309].rotateAngleZ = -3.14159265F;

		rightTrackModel[310].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox326
		rightTrackModel[310].setRotationPoint(-26.5F, 9F, -27.5F);
		rightTrackModel[310].rotateAngleZ = -3.14159265F;

		rightTrackModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox327
		rightTrackModel[311].setRotationPoint(-26.5F, 9F, -24.5F);
		rightTrackModel[311].rotateAngleZ = -3.14159265F;

		rightTrackModel[312].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox328
		rightTrackModel[312].setRotationPoint(-26.5F, 9F, -23.5F);
		rightTrackModel[312].rotateAngleZ = -3.14159265F;

		rightTrackModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox329
		rightTrackModel[313].setRotationPoint(-26.5F, 9F, -21.5F);
		rightTrackModel[313].rotateAngleZ = -3.14159265F;

		rightTrackModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox330
		rightTrackModel[314].setRotationPoint(-26.5F, 9F, -19.5F);
		rightTrackModel[314].rotateAngleZ = -3.14159265F;

		rightTrackModel[315].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox331
		rightTrackModel[315].setRotationPoint(-26.5F, 9F, -19.5F);
		rightTrackModel[315].rotateAngleZ = -3.14159265F;

		rightTrackModel[316].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox332
		rightTrackModel[316].setRotationPoint(-26.5F, 9F, -28.5F);
		rightTrackModel[316].rotateAngleZ = -3.14159265F;

		rightTrackModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox333
		rightTrackModel[317].setRotationPoint(-29.5F, 9F, -27.5F);
		rightTrackModel[317].rotateAngleZ = -3.14159265F;

		rightTrackModel[318].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox334
		rightTrackModel[318].setRotationPoint(-29.5F, 9F, -27.5F);
		rightTrackModel[318].rotateAngleZ = -3.14159265F;

		rightTrackModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox335
		rightTrackModel[319].setRotationPoint(-29.5F, 9F, -24.5F);
		rightTrackModel[319].rotateAngleZ = -3.14159265F;

		rightTrackModel[320].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox336
		rightTrackModel[320].setRotationPoint(-29.5F, 9F, -23.5F);
		rightTrackModel[320].rotateAngleZ = -3.14159265F;

		rightTrackModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox337
		rightTrackModel[321].setRotationPoint(-29.5F, 9F, -21.5F);
		rightTrackModel[321].rotateAngleZ = -3.14159265F;

		rightTrackModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox338
		rightTrackModel[322].setRotationPoint(-29.5F, 9F, -19.5F);
		rightTrackModel[322].rotateAngleZ = -3.14159265F;

		rightTrackModel[323].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox339
		rightTrackModel[323].setRotationPoint(-29.5F, 9F, -19.5F);
		rightTrackModel[323].rotateAngleZ = -3.14159265F;

		rightTrackModel[324].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox340
		rightTrackModel[324].setRotationPoint(-29.5F, 9F, -28.5F);
		rightTrackModel[324].rotateAngleZ = -3.14159265F;

		rightTrackModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox341
		rightTrackModel[325].setRotationPoint(-32.5F, 9F, -27.5F);
		rightTrackModel[325].rotateAngleZ = -3.14159265F;

		rightTrackModel[326].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox342
		rightTrackModel[326].setRotationPoint(-32.5F, 9F, -27.5F);
		rightTrackModel[326].rotateAngleZ = -3.14159265F;

		rightTrackModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox343
		rightTrackModel[327].setRotationPoint(-32.5F, 9F, -24.5F);
		rightTrackModel[327].rotateAngleZ = -3.14159265F;

		rightTrackModel[328].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox344
		rightTrackModel[328].setRotationPoint(-32.5F, 9F, -23.5F);
		rightTrackModel[328].rotateAngleZ = -3.14159265F;

		rightTrackModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox345
		rightTrackModel[329].setRotationPoint(-32.5F, 9F, -21.5F);
		rightTrackModel[329].rotateAngleZ = -3.14159265F;

		rightTrackModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox346
		rightTrackModel[330].setRotationPoint(-32.5F, 9F, -19.5F);
		rightTrackModel[330].rotateAngleZ = -3.14159265F;

		rightTrackModel[331].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox347
		rightTrackModel[331].setRotationPoint(-32.5F, 9F, -19.5F);
		rightTrackModel[331].rotateAngleZ = -3.14159265F;

		rightTrackModel[332].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox348
		rightTrackModel[332].setRotationPoint(-32.5F, 9F, -28.5F);
		rightTrackModel[332].rotateAngleZ = -3.14159265F;

		rightTrackModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox349
		rightTrackModel[333].setRotationPoint(-35.5F, 9F, -27.5F);
		rightTrackModel[333].rotateAngleZ = -3.14159265F;

		rightTrackModel[334].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox350
		rightTrackModel[334].setRotationPoint(-35.5F, 9F, -27.5F);
		rightTrackModel[334].rotateAngleZ = -3.14159265F;

		rightTrackModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox351
		rightTrackModel[335].setRotationPoint(-35.5F, 9F, -24.5F);
		rightTrackModel[335].rotateAngleZ = -3.14159265F;

		rightTrackModel[336].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox352
		rightTrackModel[336].setRotationPoint(-35.5F, 9F, -23.5F);
		rightTrackModel[336].rotateAngleZ = -3.14159265F;

		rightTrackModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox353
		rightTrackModel[337].setRotationPoint(-35.5F, 9F, -21.5F);
		rightTrackModel[337].rotateAngleZ = -3.14159265F;

		rightTrackModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox354
		rightTrackModel[338].setRotationPoint(-35.5F, 9F, -19.5F);
		rightTrackModel[338].rotateAngleZ = -3.14159265F;

		rightTrackModel[339].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox355
		rightTrackModel[339].setRotationPoint(-35.5F, 9F, -19.5F);
		rightTrackModel[339].rotateAngleZ = -3.14159265F;

		rightTrackModel[340].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		rightTrackModel[340].setRotationPoint(-35.5F, 9F, -28.5F);
		rightTrackModel[340].rotateAngleZ = -3.14159265F;

		rightTrackModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox357
		rightTrackModel[341].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[341].rotateAngleZ = -3.78736448F;

		rightTrackModel[342].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox358
		rightTrackModel[342].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[342].rotateAngleZ = -3.78736448F;

		rightTrackModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox359
		rightTrackModel[343].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[343].rotateAngleZ = -3.78736448F;

		rightTrackModel[344].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox360
		rightTrackModel[344].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[344].rotateAngleZ = -3.78736448F;

		rightTrackModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		rightTrackModel[345].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[345].rotateAngleZ = -3.78736448F;

		rightTrackModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		rightTrackModel[346].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[346].rotateAngleZ = -3.78736448F;

		rightTrackModel[347].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox363
		rightTrackModel[347].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[347].rotateAngleZ = -3.78736448F;

		rightTrackModel[348].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox364
		rightTrackModel[348].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[348].rotateAngleZ = -3.78736448F;

		rightTrackModel[349].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox365
		rightTrackModel[349].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[349].rotateAngleZ = -3.78736448F;

		rightTrackModel[350].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox366
		rightTrackModel[350].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[350].rotateAngleZ = -3.78736448F;

		rightTrackModel[351].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox367
		rightTrackModel[351].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[351].rotateAngleZ = -3.78736448F;

		rightTrackModel[352].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox368
		rightTrackModel[352].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[352].rotateAngleZ = -3.78736448F;

		rightTrackModel[353].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox369
		rightTrackModel[353].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[353].rotateAngleZ = -3.78736448F;

		rightTrackModel[354].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox370
		rightTrackModel[354].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[354].rotateAngleZ = -3.78736448F;

		rightTrackModel[355].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox371
		rightTrackModel[355].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[355].rotateAngleZ = -3.78736448F;

		rightTrackModel[356].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox372
		rightTrackModel[356].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[356].rotateAngleZ = -3.78736448F;

		rightTrackModel[357].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox373
		rightTrackModel[357].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[357].rotateAngleZ = -3.78736448F;

		rightTrackModel[358].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox374
		rightTrackModel[358].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[358].rotateAngleZ = -3.78736448F;

		rightTrackModel[359].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox375
		rightTrackModel[359].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[359].rotateAngleZ = -3.78736448F;

		rightTrackModel[360].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox376
		rightTrackModel[360].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[360].rotateAngleZ = -3.78736448F;

		rightTrackModel[361].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox377
		rightTrackModel[361].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[361].rotateAngleZ = -3.78736448F;

		rightTrackModel[362].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox378
		rightTrackModel[362].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[362].rotateAngleZ = -3.78736448F;

		rightTrackModel[363].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox379
		rightTrackModel[363].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[363].rotateAngleZ = -3.78736448F;

		rightTrackModel[364].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox380
		rightTrackModel[364].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[364].rotateAngleZ = -3.78736448F;

		rightTrackModel[365].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox381
		rightTrackModel[365].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[365].rotateAngleZ = -3.78736448F;

		rightTrackModel[366].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox382
		rightTrackModel[366].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[366].rotateAngleZ = -3.78736448F;

		rightTrackModel[367].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox383
		rightTrackModel[367].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[367].rotateAngleZ = -3.78736448F;

		rightTrackModel[368].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox384
		rightTrackModel[368].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[368].rotateAngleZ = -3.78736448F;

		rightTrackModel[369].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox385
		rightTrackModel[369].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[369].rotateAngleZ = -3.78736448F;

		rightTrackModel[370].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox386
		rightTrackModel[370].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[370].rotateAngleZ = -3.78736448F;

		rightTrackModel[371].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox387
		rightTrackModel[371].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[371].rotateAngleZ = -3.78736448F;

		rightTrackModel[372].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox388
		rightTrackModel[372].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[372].rotateAngleZ = -3.78736448F;

		rightTrackModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox389
		rightTrackModel[373].setRotationPoint(-48F, 1.8F, -27.5F);
		rightTrackModel[373].rotateAngleZ = -4.1887902F;

		rightTrackModel[374].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox390
		rightTrackModel[374].setRotationPoint(-48F, 1.8F, -27.5F);
		rightTrackModel[374].rotateAngleZ = -4.1887902F;

		rightTrackModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox391
		rightTrackModel[375].setRotationPoint(-48F, 1.8F, -24.5F);
		rightTrackModel[375].rotateAngleZ = -4.1887902F;

		rightTrackModel[376].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox392
		rightTrackModel[376].setRotationPoint(-48F, 1.8F, -23.5F);
		rightTrackModel[376].rotateAngleZ = -4.1887902F;

		rightTrackModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox393
		rightTrackModel[377].setRotationPoint(-48F, 1.8F, -21.5F);
		rightTrackModel[377].rotateAngleZ = -4.1887902F;

		rightTrackModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox394
		rightTrackModel[378].setRotationPoint(-48F, 1.8F, -19.5F);
		rightTrackModel[378].rotateAngleZ = -4.1887902F;

		rightTrackModel[379].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox395
		rightTrackModel[379].setRotationPoint(-48F, 1.8F, -19.5F);
		rightTrackModel[379].rotateAngleZ = -4.1887902F;

		rightTrackModel[380].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox396
		rightTrackModel[380].setRotationPoint(-48F, 1.8F, -28.5F);
		rightTrackModel[380].rotateAngleZ = -4.1887902F;

		rightTrackModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox397
		rightTrackModel[381].setRotationPoint(-49.5F, -0.8F, -27.5F);
		rightTrackModel[381].rotateAngleZ = -4.52040276F;

		rightTrackModel[382].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox398
		rightTrackModel[382].setRotationPoint(-49.5F, -0.8F, -27.5F);
		rightTrackModel[382].rotateAngleZ = -4.52040276F;

		rightTrackModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox399
		rightTrackModel[383].setRotationPoint(-49.5F, -0.8F, -24.5F);
		rightTrackModel[383].rotateAngleZ = -4.52040276F;

		rightTrackModel[384].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox400
		rightTrackModel[384].setRotationPoint(-49.5F, -0.8F, -23.5F);
		rightTrackModel[384].rotateAngleZ = -4.52040276F;

		rightTrackModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox401
		rightTrackModel[385].setRotationPoint(-49.5F, -0.8F, -21.5F);
		rightTrackModel[385].rotateAngleZ = -4.52040276F;

		rightTrackModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox402
		rightTrackModel[386].setRotationPoint(-49.5F, -0.8F, -19.5F);
		rightTrackModel[386].rotateAngleZ = -4.52040276F;

		rightTrackModel[387].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox403
		rightTrackModel[387].setRotationPoint(-49.5F, -0.8F, -19.5F);
		rightTrackModel[387].rotateAngleZ = -4.52040276F;

		rightTrackModel[388].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox404
		rightTrackModel[388].setRotationPoint(-49.5F, -0.8F, -28.5F);
		rightTrackModel[388].rotateAngleZ = -4.52040276F;

		rightTrackModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox405
		rightTrackModel[389].setRotationPoint(-50F, -3.6F, -27.5F);
		rightTrackModel[389].rotateAngleZ = -4.71238898F;

		rightTrackModel[390].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox406
		rightTrackModel[390].setRotationPoint(-50F, -3.6F, -27.5F);
		rightTrackModel[390].rotateAngleZ = -4.71238898F;

		rightTrackModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox407
		rightTrackModel[391].setRotationPoint(-50F, -3.6F, -24.5F);
		rightTrackModel[391].rotateAngleZ = -4.71238898F;

		rightTrackModel[392].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox408
		rightTrackModel[392].setRotationPoint(-50F, -3.6F, -23.5F);
		rightTrackModel[392].rotateAngleZ = -4.71238898F;

		rightTrackModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox409
		rightTrackModel[393].setRotationPoint(-50F, -3.6F, -21.5F);
		rightTrackModel[393].rotateAngleZ = -4.71238898F;

		rightTrackModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox410
		rightTrackModel[394].setRotationPoint(-50F, -3.6F, -19.5F);
		rightTrackModel[394].rotateAngleZ = -4.71238898F;

		rightTrackModel[395].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox411
		rightTrackModel[395].setRotationPoint(-50F, -3.6F, -19.5F);
		rightTrackModel[395].rotateAngleZ = -4.71238898F;

		rightTrackModel[396].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox412
		rightTrackModel[396].setRotationPoint(-50F, -3.6F, -28.5F);
		rightTrackModel[396].rotateAngleZ = -4.71238898F;

		rightTrackModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox413
		rightTrackModel[397].setRotationPoint(-50F, -6.6F, -27.5F);
		rightTrackModel[397].rotateAngleZ = -5.21853446F;

		rightTrackModel[398].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox414
		rightTrackModel[398].setRotationPoint(-50F, -6.6F, -27.5F);
		rightTrackModel[398].rotateAngleZ = -5.21853446F;

		rightTrackModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox415
		rightTrackModel[399].setRotationPoint(-50F, -6.6F, -24.5F);
		rightTrackModel[399].rotateAngleZ = -5.21853446F;

		rightTrackModel[400].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox416
		rightTrackModel[400].setRotationPoint(-50F, -6.6F, -23.5F);
		rightTrackModel[400].rotateAngleZ = -5.21853446F;

		rightTrackModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox417
		rightTrackModel[401].setRotationPoint(-50F, -6.6F, -21.5F);
		rightTrackModel[401].rotateAngleZ = -5.21853446F;

		rightTrackModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox418
		rightTrackModel[402].setRotationPoint(-50F, -6.6F, -19.5F);
		rightTrackModel[402].rotateAngleZ = -5.21853446F;

		rightTrackModel[403].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox419
		rightTrackModel[403].setRotationPoint(-50F, -6.6F, -19.5F);
		rightTrackModel[403].rotateAngleZ = -5.21853446F;

		rightTrackModel[404].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox420
		rightTrackModel[404].setRotationPoint(-50F, -6.6F, -28.5F);
		rightTrackModel[404].rotateAngleZ = -5.21853446F;

		rightTrackModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox421
		rightTrackModel[405].setRotationPoint(-48.6F, -9.2F, -27.5F);
		rightTrackModel[405].rotateAngleZ = 0.2443461F;

		rightTrackModel[406].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox422
		rightTrackModel[406].setRotationPoint(-48.6F, -9.2F, -27.5F);
		rightTrackModel[406].rotateAngleZ = 0.2443461F;

		rightTrackModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox423
		rightTrackModel[407].setRotationPoint(-48.6F, -9.2F, -24.5F);
		rightTrackModel[407].rotateAngleZ = 0.2443461F;

		rightTrackModel[408].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox424
		rightTrackModel[408].setRotationPoint(-48.6F, -9.2F, -23.5F);
		rightTrackModel[408].rotateAngleZ = 0.2443461F;

		rightTrackModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox425
		rightTrackModel[409].setRotationPoint(-48.6F, -9.2F, -21.5F);
		rightTrackModel[409].rotateAngleZ = 0.2443461F;

		rightTrackModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox426
		rightTrackModel[410].setRotationPoint(-48.6F, -9.2F, -19.5F);
		rightTrackModel[410].rotateAngleZ = 0.2443461F;

		rightTrackModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox427
		rightTrackModel[411].setRotationPoint(-48.6F, -9.2F, -19.5F);
		rightTrackModel[411].rotateAngleZ = 0.2443461F;

		rightTrackModel[412].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox428
		rightTrackModel[412].setRotationPoint(-48.6F, -9.2F, -28.5F);
		rightTrackModel[412].rotateAngleZ = 0.2443461F;

		rightTrackModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox429
		rightTrackModel[413].setRotationPoint(-46F, -10F, -27.5F);

		rightTrackModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox430
		rightTrackModel[414].setRotationPoint(-46F, -10F, -27.5F);

		rightTrackModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox431
		rightTrackModel[415].setRotationPoint(-46F, -10F, -24.5F);

		rightTrackModel[416].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox432
		rightTrackModel[416].setRotationPoint(-46F, -10F, -23.5F);

		rightTrackModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox433
		rightTrackModel[417].setRotationPoint(-46F, -10F, -21.5F);

		rightTrackModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox434
		rightTrackModel[418].setRotationPoint(-46F, -10F, -19.5F);

		rightTrackModel[419].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox435
		rightTrackModel[419].setRotationPoint(-46F, -10F, -19.5F);

		rightTrackModel[420].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox436
		rightTrackModel[420].setRotationPoint(-46F, -10F, -28.5F);

		rightTrackModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox437
		rightTrackModel[421].setRotationPoint(-43F, -10F, -27.5F);

		rightTrackModel[422].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox438
		rightTrackModel[422].setRotationPoint(-43F, -10F, -27.5F);

		rightTrackModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox439
		rightTrackModel[423].setRotationPoint(-43F, -10F, -24.5F);

		rightTrackModel[424].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox440
		rightTrackModel[424].setRotationPoint(-43F, -10F, -23.5F);

		rightTrackModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox441
		rightTrackModel[425].setRotationPoint(-43F, -10F, -21.5F);

		rightTrackModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox442
		rightTrackModel[426].setRotationPoint(-43F, -10F, -19.5F);

		rightTrackModel[427].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox443
		rightTrackModel[427].setRotationPoint(-43F, -10F, -19.5F);

		rightTrackModel[428].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox444
		rightTrackModel[428].setRotationPoint(-43F, -10F, -28.5F);

		rightTrackModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox445
		rightTrackModel[429].setRotationPoint(-40F, -10F, -27.5F);

		rightTrackModel[430].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox446
		rightTrackModel[430].setRotationPoint(-40F, -10F, -27.5F);

		rightTrackModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox447
		rightTrackModel[431].setRotationPoint(-40F, -10F, -24.5F);

		rightTrackModel[432].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox448
		rightTrackModel[432].setRotationPoint(-40F, -10F, -23.5F);

		rightTrackModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox449
		rightTrackModel[433].setRotationPoint(-40F, -10F, -21.5F);

		rightTrackModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox450
		rightTrackModel[434].setRotationPoint(-40F, -10F, -19.5F);

		rightTrackModel[435].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox451
		rightTrackModel[435].setRotationPoint(-40F, -10F, -19.5F);

		rightTrackModel[436].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox452
		rightTrackModel[436].setRotationPoint(-40F, -10F, -28.5F);

		rightTrackModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox453
		rightTrackModel[437].setRotationPoint(-37F, -10F, -27.5F);

		rightTrackModel[438].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox454
		rightTrackModel[438].setRotationPoint(-37F, -10F, -27.5F);

		rightTrackModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox455
		rightTrackModel[439].setRotationPoint(-37F, -10F, -24.5F);

		rightTrackModel[440].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox456
		rightTrackModel[440].setRotationPoint(-37F, -10F, -23.5F);

		rightTrackModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox457
		rightTrackModel[441].setRotationPoint(-37F, -10F, -21.5F);

		rightTrackModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox458
		rightTrackModel[442].setRotationPoint(-37F, -10F, -19.5F);

		rightTrackModel[443].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox459
		rightTrackModel[443].setRotationPoint(-37F, -10F, -19.5F);

		rightTrackModel[444].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox460
		rightTrackModel[444].setRotationPoint(-37F, -10F, -28.5F);

		rightTrackModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox461
		rightTrackModel[445].setRotationPoint(-34F, -10F, -27.5F);

		rightTrackModel[446].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox462
		rightTrackModel[446].setRotationPoint(-34F, -10F, -27.5F);

		rightTrackModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox463
		rightTrackModel[447].setRotationPoint(-34F, -10F, -24.5F);

		rightTrackModel[448].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox464
		rightTrackModel[448].setRotationPoint(-34F, -10F, -23.5F);

		rightTrackModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox465
		rightTrackModel[449].setRotationPoint(-34F, -10F, -21.5F);

		rightTrackModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox466
		rightTrackModel[450].setRotationPoint(-34F, -10F, -19.5F);

		rightTrackModel[451].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox467
		rightTrackModel[451].setRotationPoint(-34F, -10F, -19.5F);

		rightTrackModel[452].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox468
		rightTrackModel[452].setRotationPoint(-34F, -10F, -28.5F);

		rightTrackModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox469
		rightTrackModel[453].setRotationPoint(-31F, -10F, -27.5F);

		rightTrackModel[454].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox470
		rightTrackModel[454].setRotationPoint(-31F, -10F, -27.5F);

		rightTrackModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox471
		rightTrackModel[455].setRotationPoint(-31F, -10F, -24.5F);

		rightTrackModel[456].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox472
		rightTrackModel[456].setRotationPoint(-31F, -10F, -23.5F);

		rightTrackModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox473
		rightTrackModel[457].setRotationPoint(-31F, -10F, -21.5F);

		rightTrackModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox474
		rightTrackModel[458].setRotationPoint(-31F, -10F, -19.5F);

		rightTrackModel[459].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox475
		rightTrackModel[459].setRotationPoint(-31F, -10F, -19.5F);

		rightTrackModel[460].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox476
		rightTrackModel[460].setRotationPoint(-31F, -10F, -28.5F);

		rightTrackModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox477
		rightTrackModel[461].setRotationPoint(-28F, -10F, -27.5F);

		rightTrackModel[462].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox478
		rightTrackModel[462].setRotationPoint(-28F, -10F, -27.5F);

		rightTrackModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox479
		rightTrackModel[463].setRotationPoint(-28F, -10F, -24.5F);

		rightTrackModel[464].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox480
		rightTrackModel[464].setRotationPoint(-28F, -10F, -23.5F);

		rightTrackModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox481
		rightTrackModel[465].setRotationPoint(-28F, -10F, -21.5F);

		rightTrackModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox482
		rightTrackModel[466].setRotationPoint(-28F, -10F, -19.5F);

		rightTrackModel[467].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox483
		rightTrackModel[467].setRotationPoint(-28F, -10F, -19.5F);

		rightTrackModel[468].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox484
		rightTrackModel[468].setRotationPoint(-28F, -10F, -28.5F);

		rightTrackModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox485
		rightTrackModel[469].setRotationPoint(-25F, -10F, -27.5F);

		rightTrackModel[470].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox486
		rightTrackModel[470].setRotationPoint(-25F, -10F, -27.5F);

		rightTrackModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox487
		rightTrackModel[471].setRotationPoint(-25F, -10F, -24.5F);

		rightTrackModel[472].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox488
		rightTrackModel[472].setRotationPoint(-25F, -10F, -23.5F);

		rightTrackModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox489
		rightTrackModel[473].setRotationPoint(-25F, -10F, -21.5F);

		rightTrackModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox490
		rightTrackModel[474].setRotationPoint(-25F, -10F, -19.5F);

		rightTrackModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox491
		rightTrackModel[475].setRotationPoint(-25F, -10F, -19.5F);

		rightTrackModel[476].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox492
		rightTrackModel[476].setRotationPoint(-25F, -10F, -28.5F);

		rightTrackModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox493
		rightTrackModel[477].setRotationPoint(-22F, -10F, -27.5F);

		rightTrackModel[478].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox494
		rightTrackModel[478].setRotationPoint(-22F, -10F, -27.5F);

		rightTrackModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox495
		rightTrackModel[479].setRotationPoint(-22F, -10F, -24.5F);

		rightTrackModel[480].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox496
		rightTrackModel[480].setRotationPoint(-22F, -10F, -23.5F);

		rightTrackModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox497
		rightTrackModel[481].setRotationPoint(-22F, -10F, -21.5F);

		rightTrackModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox498
		rightTrackModel[482].setRotationPoint(-22F, -10F, -19.5F);

		rightTrackModel[483].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox499
		rightTrackModel[483].setRotationPoint(-22F, -10F, -19.5F);

		rightTrackModel[484].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox500
		rightTrackModel[484].setRotationPoint(-22F, -10F, -28.5F);

		rightTrackModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox501
		rightTrackModel[485].setRotationPoint(-19F, -10F, -27.5F);

		rightTrackModel[486].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox502
		rightTrackModel[486].setRotationPoint(-19F, -10F, -27.5F);

		rightTrackModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox503
		rightTrackModel[487].setRotationPoint(-19F, -10F, -24.5F);

		rightTrackModel[488].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox504
		rightTrackModel[488].setRotationPoint(-19F, -10F, -23.5F);

		rightTrackModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox505
		rightTrackModel[489].setRotationPoint(-19F, -10F, -21.5F);

		rightTrackModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox506
		rightTrackModel[490].setRotationPoint(-19F, -10F, -19.5F);

		rightTrackModel[491].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox507
		rightTrackModel[491].setRotationPoint(-19F, -10F, -19.5F);

		rightTrackModel[492].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox508
		rightTrackModel[492].setRotationPoint(-19F, -10F, -28.5F);

		rightTrackModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox509
		rightTrackModel[493].setRotationPoint(-16F, -10F, -27.5F);

		rightTrackModel[494].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox510
		rightTrackModel[494].setRotationPoint(-16F, -10F, -27.5F);

		rightTrackModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox511
		rightTrackModel[495].setRotationPoint(-16F, -10F, -24.5F);

		rightTrackModel[496].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox512
		rightTrackModel[496].setRotationPoint(-16F, -10F, -23.5F);

		rightTrackModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox513
		rightTrackModel[497].setRotationPoint(-16F, -10F, -21.5F);

		rightTrackModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox514
		rightTrackModel[498].setRotationPoint(-16F, -10F, -19.5F);

		rightTrackModel[499].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox515
		rightTrackModel[499].setRotationPoint(-16F, -10F, -19.5F);
	}

	private void initrightTrackModel_2()
	{
		rightTrackModel[500] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox516
		rightTrackModel[501] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox517
		rightTrackModel[502] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox518
		rightTrackModel[503] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox519
		rightTrackModel[504] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox520
		rightTrackModel[505] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox521
		rightTrackModel[506] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox522
		rightTrackModel[507] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox523
		rightTrackModel[508] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox524
		rightTrackModel[509] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox525
		rightTrackModel[510] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox526
		rightTrackModel[511] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox527
		rightTrackModel[512] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox528
		rightTrackModel[513] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox529
		rightTrackModel[514] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox530
		rightTrackModel[515] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox531
		rightTrackModel[516] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox532
		rightTrackModel[517] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox533
		rightTrackModel[518] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox534
		rightTrackModel[519] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox535
		rightTrackModel[520] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox536
		rightTrackModel[521] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox537
		rightTrackModel[522] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox538
		rightTrackModel[523] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox539
		rightTrackModel[524] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox540
		rightTrackModel[525] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox541
		rightTrackModel[526] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox542
		rightTrackModel[527] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox543
		rightTrackModel[528] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox544
		rightTrackModel[529] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox545
		rightTrackModel[530] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox546
		rightTrackModel[531] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox547
		rightTrackModel[532] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox548
		rightTrackModel[533] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox549
		rightTrackModel[534] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox550
		rightTrackModel[535] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox551
		rightTrackModel[536] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox552
		rightTrackModel[537] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox553
		rightTrackModel[538] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox554
		rightTrackModel[539] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox555
		rightTrackModel[540] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox556
		rightTrackModel[541] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox557
		rightTrackModel[542] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox558
		rightTrackModel[543] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox559
		rightTrackModel[544] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox560
		rightTrackModel[545] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox561
		rightTrackModel[546] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox562
		rightTrackModel[547] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox563
		rightTrackModel[548] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox564
		rightTrackModel[549] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox565
		rightTrackModel[550] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox566
		rightTrackModel[551] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox567
		rightTrackModel[552] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox568
		rightTrackModel[553] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox569
		rightTrackModel[554] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox570
		rightTrackModel[555] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox571
		rightTrackModel[556] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox572
		rightTrackModel[557] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox573
		rightTrackModel[558] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox574
		rightTrackModel[559] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox575
		rightTrackModel[560] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox576
		rightTrackModel[561] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox577
		rightTrackModel[562] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox578
		rightTrackModel[563] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox579
		rightTrackModel[564] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox580
		rightTrackModel[565] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox581
		rightTrackModel[566] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox582
		rightTrackModel[567] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox583
		rightTrackModel[568] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox584
		rightTrackModel[569] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox585
		rightTrackModel[570] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox586
		rightTrackModel[571] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox587
		rightTrackModel[572] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox588
		rightTrackModel[573] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox589
		rightTrackModel[574] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox590
		rightTrackModel[575] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox591
		rightTrackModel[576] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox592
		rightTrackModel[577] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox593
		rightTrackModel[578] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox594
		rightTrackModel[579] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox595
		rightTrackModel[580] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox596
		rightTrackModel[581] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox597
		rightTrackModel[582] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox598
		rightTrackModel[583] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox599
		rightTrackModel[584] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox600
		rightTrackModel[585] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox601
		rightTrackModel[586] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox602
		rightTrackModel[587] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox603
		rightTrackModel[588] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox604
		rightTrackModel[589] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox605
		rightTrackModel[590] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox606
		rightTrackModel[591] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox607
		rightTrackModel[592] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox608
		rightTrackModel[593] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox609
		rightTrackModel[594] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox610
		rightTrackModel[595] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox611
		rightTrackModel[596] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox612
		rightTrackModel[597] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox613
		rightTrackModel[598] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox614
		rightTrackModel[599] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox615
		rightTrackModel[600] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox616
		rightTrackModel[601] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox617
		rightTrackModel[602] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox618
		rightTrackModel[603] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox619
		rightTrackModel[604] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox620
		rightTrackModel[605] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox621
		rightTrackModel[606] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox622
		rightTrackModel[607] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox623
		rightTrackModel[608] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox624
		rightTrackModel[609] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox625
		rightTrackModel[610] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox626
		rightTrackModel[611] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox627
		rightTrackModel[612] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox628
		rightTrackModel[613] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox629
		rightTrackModel[614] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox630
		rightTrackModel[615] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox631
		rightTrackModel[616] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox632
		rightTrackModel[617] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox633
		rightTrackModel[618] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox634
		rightTrackModel[619] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox635
		rightTrackModel[620] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox636
		rightTrackModel[621] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox637
		rightTrackModel[622] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox638
		rightTrackModel[623] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox639
		rightTrackModel[624] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox640
		rightTrackModel[625] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox641
		rightTrackModel[626] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox642
		rightTrackModel[627] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox643
		rightTrackModel[628] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox644
		rightTrackModel[629] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox645
		rightTrackModel[630] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox646
		rightTrackModel[631] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox647
		rightTrackModel[632] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox648
		rightTrackModel[633] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox649
		rightTrackModel[634] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox650
		rightTrackModel[635] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox651
		rightTrackModel[636] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox652
		rightTrackModel[637] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox653
		rightTrackModel[638] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox654
		rightTrackModel[639] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox655
		rightTrackModel[640] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox656
		rightTrackModel[641] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox657
		rightTrackModel[642] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox658
		rightTrackModel[643] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox659
		rightTrackModel[644] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox660
		rightTrackModel[645] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox661
		rightTrackModel[646] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox662
		rightTrackModel[647] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox663
		rightTrackModel[648] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox664
		rightTrackModel[649] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox665
		rightTrackModel[650] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox666
		rightTrackModel[651] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox667
		rightTrackModel[652] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox668
		rightTrackModel[653] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox669
		rightTrackModel[654] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox670
		rightTrackModel[655] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox671
		rightTrackModel[656] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Import ImportBox672
		rightTrackModel[657] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Import ImportBox673
		rightTrackModel[658] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Import ImportBox674
		rightTrackModel[659] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Import ImportBox675
		rightTrackModel[660] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Import ImportBox676
		rightTrackModel[661] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1835
		rightTrackModel[662] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1836
		rightTrackModel[663] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1837
		rightTrackModel[664] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1838
		rightTrackModel[665] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1839
		rightTrackModel[666] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1840
		rightTrackModel[667] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1841
		rightTrackModel[668] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1842
		rightTrackModel[669] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1851
		rightTrackModel[670] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1853
		rightTrackModel[671] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1854
		rightTrackModel[672] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1855
		rightTrackModel[673] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1856
		rightTrackModel[674] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1857
		rightTrackModel[675] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1858
		rightTrackModel[676] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1859
		rightTrackModel[677] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1860
		rightTrackModel[678] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1870
		rightTrackModel[679] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1871
		rightTrackModel[680] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1872
		rightTrackModel[681] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1873
		rightTrackModel[682] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1874
		rightTrackModel[683] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1875
		rightTrackModel[684] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1876
		rightTrackModel[685] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1877
		rightTrackModel[686] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1878
		rightTrackModel[687] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1888
		rightTrackModel[688] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1889
		rightTrackModel[689] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1890
		rightTrackModel[690] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1891
		rightTrackModel[691] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1892
		rightTrackModel[692] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1893
		rightTrackModel[693] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1894
		rightTrackModel[694] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1895
		rightTrackModel[695] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1896
		rightTrackModel[696] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1906
		rightTrackModel[697] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1907
		rightTrackModel[698] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1908
		rightTrackModel[699] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1909
		rightTrackModel[700] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1910
		rightTrackModel[701] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1911
		rightTrackModel[702] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1912
		rightTrackModel[703] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1913
		rightTrackModel[704] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1914
		rightTrackModel[705] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1924
		rightTrackModel[706] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1925
		rightTrackModel[707] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1926
		rightTrackModel[708] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1927
		rightTrackModel[709] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1928
		rightTrackModel[710] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1929
		rightTrackModel[711] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1930
		rightTrackModel[712] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1931
		rightTrackModel[713] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1932
		rightTrackModel[714] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1942
		rightTrackModel[715] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1943
		rightTrackModel[716] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1944
		rightTrackModel[717] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1945
		rightTrackModel[718] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1946
		rightTrackModel[719] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1947
		rightTrackModel[720] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1948
		rightTrackModel[721] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1949
		rightTrackModel[722] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1950
		rightTrackModel[723] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1960
		rightTrackModel[724] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1961
		rightTrackModel[725] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1962
		rightTrackModel[726] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1963
		rightTrackModel[727] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1964
		rightTrackModel[728] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1965
		rightTrackModel[729] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1966
		rightTrackModel[730] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1967
		rightTrackModel[731] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1968
		rightTrackModel[732] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1978
		rightTrackModel[733] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1979
		rightTrackModel[734] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1980
		rightTrackModel[735] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1981
		rightTrackModel[736] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1982
		rightTrackModel[737] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1983
		rightTrackModel[738] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1984
		rightTrackModel[739] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1985
		rightTrackModel[740] = new ModelRendererTurbo(this, 1000, 170, textureX, textureY); // Import Box1986
		rightTrackModel[741] = new ModelRendererTurbo(this, 1000, 155, textureX, textureY); // Import Box1996

		rightTrackModel[500].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox516
		rightTrackModel[500].setRotationPoint(-16F, -10F, -28.5F);

		rightTrackModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox517
		rightTrackModel[501].setRotationPoint(-13F, -10F, -27.5F);

		rightTrackModel[502].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox518
		rightTrackModel[502].setRotationPoint(-13F, -10F, -27.5F);

		rightTrackModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox519
		rightTrackModel[503].setRotationPoint(-13F, -10F, -24.5F);

		rightTrackModel[504].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox520
		rightTrackModel[504].setRotationPoint(-13F, -10F, -23.5F);

		rightTrackModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox521
		rightTrackModel[505].setRotationPoint(-13F, -10F, -21.5F);

		rightTrackModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox522
		rightTrackModel[506].setRotationPoint(-13F, -10F, -19.5F);

		rightTrackModel[507].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox523
		rightTrackModel[507].setRotationPoint(-13F, -10F, -19.5F);

		rightTrackModel[508].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox524
		rightTrackModel[508].setRotationPoint(-13F, -10F, -28.5F);

		rightTrackModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox525
		rightTrackModel[509].setRotationPoint(-10F, -10F, -27.5F);

		rightTrackModel[510].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox526
		rightTrackModel[510].setRotationPoint(-10F, -10F, -27.5F);

		rightTrackModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox527
		rightTrackModel[511].setRotationPoint(-10F, -10F, -24.5F);

		rightTrackModel[512].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox528
		rightTrackModel[512].setRotationPoint(-10F, -10F, -23.5F);

		rightTrackModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox529
		rightTrackModel[513].setRotationPoint(-10F, -10F, -21.5F);

		rightTrackModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox530
		rightTrackModel[514].setRotationPoint(-10F, -10F, -19.5F);

		rightTrackModel[515].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox531
		rightTrackModel[515].setRotationPoint(-10F, -10F, -19.5F);

		rightTrackModel[516].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox532
		rightTrackModel[516].setRotationPoint(-10F, -10F, -28.5F);

		rightTrackModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox533
		rightTrackModel[517].setRotationPoint(-7F, -10F, -27.5F);

		rightTrackModel[518].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox534
		rightTrackModel[518].setRotationPoint(-7F, -10F, -27.5F);

		rightTrackModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox535
		rightTrackModel[519].setRotationPoint(-7F, -10F, -24.5F);

		rightTrackModel[520].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox536
		rightTrackModel[520].setRotationPoint(-7F, -10F, -23.5F);

		rightTrackModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox537
		rightTrackModel[521].setRotationPoint(-7F, -10F, -21.5F);

		rightTrackModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox538
		rightTrackModel[522].setRotationPoint(-7F, -10F, -19.5F);

		rightTrackModel[523].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox539
		rightTrackModel[523].setRotationPoint(-7F, -10F, -19.5F);

		rightTrackModel[524].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox540
		rightTrackModel[524].setRotationPoint(-7F, -10F, -28.5F);

		rightTrackModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox541
		rightTrackModel[525].setRotationPoint(-4F, -10F, -27.5F);

		rightTrackModel[526].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox542
		rightTrackModel[526].setRotationPoint(-4F, -10F, -27.5F);

		rightTrackModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox543
		rightTrackModel[527].setRotationPoint(-4F, -10F, -24.5F);

		rightTrackModel[528].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox544
		rightTrackModel[528].setRotationPoint(-4F, -10F, -23.5F);

		rightTrackModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox545
		rightTrackModel[529].setRotationPoint(-4F, -10F, -21.5F);

		rightTrackModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox546
		rightTrackModel[530].setRotationPoint(-4F, -10F, -19.5F);

		rightTrackModel[531].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox547
		rightTrackModel[531].setRotationPoint(-4F, -10F, -19.5F);

		rightTrackModel[532].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox548
		rightTrackModel[532].setRotationPoint(-4F, -10F, -28.5F);

		rightTrackModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox549
		rightTrackModel[533].setRotationPoint(-1F, -10F, -27.5F);

		rightTrackModel[534].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox550
		rightTrackModel[534].setRotationPoint(-1F, -10F, -27.5F);

		rightTrackModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox551
		rightTrackModel[535].setRotationPoint(-1F, -10F, -24.5F);

		rightTrackModel[536].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox552
		rightTrackModel[536].setRotationPoint(-1F, -10F, -23.5F);

		rightTrackModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox553
		rightTrackModel[537].setRotationPoint(-1F, -10F, -21.5F);

		rightTrackModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox554
		rightTrackModel[538].setRotationPoint(-1F, -10F, -19.5F);

		rightTrackModel[539].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox555
		rightTrackModel[539].setRotationPoint(-1F, -10F, -19.5F);

		rightTrackModel[540].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox556
		rightTrackModel[540].setRotationPoint(-1F, -10F, -28.5F);

		rightTrackModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox557
		rightTrackModel[541].setRotationPoint(2F, -10F, -27.5F);

		rightTrackModel[542].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox558
		rightTrackModel[542].setRotationPoint(2F, -10F, -27.5F);

		rightTrackModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox559
		rightTrackModel[543].setRotationPoint(2F, -10F, -24.5F);

		rightTrackModel[544].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox560
		rightTrackModel[544].setRotationPoint(2F, -10F, -23.5F);

		rightTrackModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox561
		rightTrackModel[545].setRotationPoint(2F, -10F, -21.5F);

		rightTrackModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox562
		rightTrackModel[546].setRotationPoint(2F, -10F, -19.5F);

		rightTrackModel[547].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox563
		rightTrackModel[547].setRotationPoint(2F, -10F, -19.5F);

		rightTrackModel[548].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox564
		rightTrackModel[548].setRotationPoint(2F, -10F, -28.5F);

		rightTrackModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox565
		rightTrackModel[549].setRotationPoint(5F, -10F, -27.5F);

		rightTrackModel[550].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox566
		rightTrackModel[550].setRotationPoint(5F, -10F, -27.5F);

		rightTrackModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox567
		rightTrackModel[551].setRotationPoint(5F, -10F, -24.5F);

		rightTrackModel[552].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox568
		rightTrackModel[552].setRotationPoint(5F, -10F, -23.5F);

		rightTrackModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox569
		rightTrackModel[553].setRotationPoint(5F, -10F, -21.5F);

		rightTrackModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox570
		rightTrackModel[554].setRotationPoint(5F, -10F, -19.5F);

		rightTrackModel[555].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox571
		rightTrackModel[555].setRotationPoint(5F, -10F, -19.5F);

		rightTrackModel[556].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox572
		rightTrackModel[556].setRotationPoint(5F, -10F, -28.5F);

		rightTrackModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox573
		rightTrackModel[557].setRotationPoint(8F, -10F, -27.5F);

		rightTrackModel[558].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox574
		rightTrackModel[558].setRotationPoint(8F, -10F, -27.5F);

		rightTrackModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox575
		rightTrackModel[559].setRotationPoint(8F, -10F, -24.5F);

		rightTrackModel[560].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox576
		rightTrackModel[560].setRotationPoint(8F, -10F, -23.5F);

		rightTrackModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox577
		rightTrackModel[561].setRotationPoint(8F, -10F, -21.5F);

		rightTrackModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox578
		rightTrackModel[562].setRotationPoint(8F, -10F, -19.5F);

		rightTrackModel[563].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox579
		rightTrackModel[563].setRotationPoint(8F, -10F, -19.5F);

		rightTrackModel[564].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox580
		rightTrackModel[564].setRotationPoint(8F, -10F, -28.5F);

		rightTrackModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox581
		rightTrackModel[565].setRotationPoint(11F, -10F, -27.5F);

		rightTrackModel[566].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox582
		rightTrackModel[566].setRotationPoint(11F, -10F, -27.5F);

		rightTrackModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox583
		rightTrackModel[567].setRotationPoint(11F, -10F, -24.5F);

		rightTrackModel[568].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox584
		rightTrackModel[568].setRotationPoint(11F, -10F, -23.5F);

		rightTrackModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox585
		rightTrackModel[569].setRotationPoint(11F, -10F, -21.5F);

		rightTrackModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox586
		rightTrackModel[570].setRotationPoint(11F, -10F, -19.5F);

		rightTrackModel[571].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox587
		rightTrackModel[571].setRotationPoint(11F, -10F, -19.5F);

		rightTrackModel[572].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox588
		rightTrackModel[572].setRotationPoint(11F, -10F, -28.5F);

		rightTrackModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox589
		rightTrackModel[573].setRotationPoint(14F, -10F, -27.5F);

		rightTrackModel[574].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox590
		rightTrackModel[574].setRotationPoint(14F, -10F, -27.5F);

		rightTrackModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox591
		rightTrackModel[575].setRotationPoint(14F, -10F, -24.5F);

		rightTrackModel[576].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox592
		rightTrackModel[576].setRotationPoint(14F, -10F, -23.5F);

		rightTrackModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox593
		rightTrackModel[577].setRotationPoint(14F, -10F, -21.5F);

		rightTrackModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox594
		rightTrackModel[578].setRotationPoint(14F, -10F, -19.5F);

		rightTrackModel[579].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox595
		rightTrackModel[579].setRotationPoint(14F, -10F, -19.5F);

		rightTrackModel[580].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox596
		rightTrackModel[580].setRotationPoint(14F, -10F, -28.5F);

		rightTrackModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox597
		rightTrackModel[581].setRotationPoint(17F, -10F, -27.5F);

		rightTrackModel[582].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox598
		rightTrackModel[582].setRotationPoint(17F, -10F, -27.5F);

		rightTrackModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox599
		rightTrackModel[583].setRotationPoint(17F, -10F, -24.5F);

		rightTrackModel[584].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox600
		rightTrackModel[584].setRotationPoint(17F, -10F, -23.5F);

		rightTrackModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox601
		rightTrackModel[585].setRotationPoint(17F, -10F, -21.5F);

		rightTrackModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox602
		rightTrackModel[586].setRotationPoint(17F, -10F, -19.5F);

		rightTrackModel[587].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox603
		rightTrackModel[587].setRotationPoint(17F, -10F, -19.5F);

		rightTrackModel[588].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox604
		rightTrackModel[588].setRotationPoint(17F, -10F, -28.5F);

		rightTrackModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox605
		rightTrackModel[589].setRotationPoint(20F, -10F, -27.5F);

		rightTrackModel[590].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox606
		rightTrackModel[590].setRotationPoint(20F, -10F, -27.5F);

		rightTrackModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox607
		rightTrackModel[591].setRotationPoint(20F, -10F, -24.5F);

		rightTrackModel[592].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox608
		rightTrackModel[592].setRotationPoint(20F, -10F, -23.5F);

		rightTrackModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox609
		rightTrackModel[593].setRotationPoint(20F, -10F, -21.5F);

		rightTrackModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox610
		rightTrackModel[594].setRotationPoint(20F, -10F, -19.5F);

		rightTrackModel[595].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox611
		rightTrackModel[595].setRotationPoint(20F, -10F, -19.5F);

		rightTrackModel[596].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox612
		rightTrackModel[596].setRotationPoint(20F, -10F, -28.5F);

		rightTrackModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox613
		rightTrackModel[597].setRotationPoint(23F, -10F, -27.5F);

		rightTrackModel[598].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox614
		rightTrackModel[598].setRotationPoint(23F, -10F, -27.5F);

		rightTrackModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox615
		rightTrackModel[599].setRotationPoint(23F, -10F, -24.5F);

		rightTrackModel[600].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox616
		rightTrackModel[600].setRotationPoint(23F, -10F, -23.5F);

		rightTrackModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox617
		rightTrackModel[601].setRotationPoint(23F, -10F, -21.5F);

		rightTrackModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox618
		rightTrackModel[602].setRotationPoint(23F, -10F, -19.5F);

		rightTrackModel[603].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox619
		rightTrackModel[603].setRotationPoint(23F, -10F, -19.5F);

		rightTrackModel[604].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox620
		rightTrackModel[604].setRotationPoint(23F, -10F, -28.5F);

		rightTrackModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox621
		rightTrackModel[605].setRotationPoint(26F, -10F, -27.5F);

		rightTrackModel[606].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox622
		rightTrackModel[606].setRotationPoint(26F, -10F, -27.5F);

		rightTrackModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox623
		rightTrackModel[607].setRotationPoint(26F, -10F, -24.5F);

		rightTrackModel[608].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox624
		rightTrackModel[608].setRotationPoint(26F, -10F, -23.5F);

		rightTrackModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox625
		rightTrackModel[609].setRotationPoint(26F, -10F, -21.5F);

		rightTrackModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox626
		rightTrackModel[610].setRotationPoint(26F, -10F, -19.5F);

		rightTrackModel[611].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox627
		rightTrackModel[611].setRotationPoint(26F, -10F, -19.5F);

		rightTrackModel[612].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox628
		rightTrackModel[612].setRotationPoint(26F, -10F, -28.5F);

		rightTrackModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox629
		rightTrackModel[613].setRotationPoint(29F, -10F, -27.5F);

		rightTrackModel[614].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox630
		rightTrackModel[614].setRotationPoint(29F, -10F, -27.5F);

		rightTrackModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox631
		rightTrackModel[615].setRotationPoint(29F, -10F, -24.5F);

		rightTrackModel[616].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox632
		rightTrackModel[616].setRotationPoint(29F, -10F, -23.5F);

		rightTrackModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox633
		rightTrackModel[617].setRotationPoint(29F, -10F, -21.5F);

		rightTrackModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox634
		rightTrackModel[618].setRotationPoint(29F, -10F, -19.5F);

		rightTrackModel[619].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox635
		rightTrackModel[619].setRotationPoint(29F, -10F, -19.5F);

		rightTrackModel[620].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox636
		rightTrackModel[620].setRotationPoint(29F, -10F, -28.5F);

		rightTrackModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox637
		rightTrackModel[621].setRotationPoint(32F, -10F, -27.5F);

		rightTrackModel[622].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox638
		rightTrackModel[622].setRotationPoint(32F, -10F, -27.5F);

		rightTrackModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox639
		rightTrackModel[623].setRotationPoint(32F, -10F, -24.5F);

		rightTrackModel[624].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox640
		rightTrackModel[624].setRotationPoint(32F, -10F, -23.5F);

		rightTrackModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox641
		rightTrackModel[625].setRotationPoint(32F, -10F, -21.5F);

		rightTrackModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox642
		rightTrackModel[626].setRotationPoint(32F, -10F, -19.5F);

		rightTrackModel[627].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox643
		rightTrackModel[627].setRotationPoint(32F, -10F, -19.5F);

		rightTrackModel[628].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox644
		rightTrackModel[628].setRotationPoint(32F, -10F, -28.5F);

		rightTrackModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox645
		rightTrackModel[629].setRotationPoint(35F, -10F, -27.5F);

		rightTrackModel[630].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox646
		rightTrackModel[630].setRotationPoint(35F, -10F, -27.5F);

		rightTrackModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox647
		rightTrackModel[631].setRotationPoint(35F, -10F, -24.5F);

		rightTrackModel[632].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox648
		rightTrackModel[632].setRotationPoint(35F, -10F, -23.5F);

		rightTrackModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox649
		rightTrackModel[633].setRotationPoint(35F, -10F, -21.5F);

		rightTrackModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox650
		rightTrackModel[634].setRotationPoint(35F, -10F, -19.5F);

		rightTrackModel[635].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox651
		rightTrackModel[635].setRotationPoint(35F, -10F, -19.5F);

		rightTrackModel[636].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox652
		rightTrackModel[636].setRotationPoint(35F, -10F, -28.5F);

		rightTrackModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox653
		rightTrackModel[637].setRotationPoint(38F, -10F, -27.5F);

		rightTrackModel[638].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox654
		rightTrackModel[638].setRotationPoint(38F, -10F, -27.5F);

		rightTrackModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox655
		rightTrackModel[639].setRotationPoint(38F, -10F, -24.5F);

		rightTrackModel[640].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox656
		rightTrackModel[640].setRotationPoint(38F, -10F, -23.5F);

		rightTrackModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox657
		rightTrackModel[641].setRotationPoint(38F, -10F, -21.5F);

		rightTrackModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox658
		rightTrackModel[642].setRotationPoint(38F, -10F, -19.5F);

		rightTrackModel[643].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox659
		rightTrackModel[643].setRotationPoint(38F, -10F, -19.5F);

		rightTrackModel[644].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox660
		rightTrackModel[644].setRotationPoint(38F, -10F, -28.5F);

		rightTrackModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox661
		rightTrackModel[645].setRotationPoint(41F, -10F, -27.5F);

		rightTrackModel[646].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox662
		rightTrackModel[646].setRotationPoint(41F, -10F, -27.5F);

		rightTrackModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox663
		rightTrackModel[647].setRotationPoint(41F, -10F, -24.5F);

		rightTrackModel[648].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox664
		rightTrackModel[648].setRotationPoint(41F, -10F, -23.5F);

		rightTrackModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox665
		rightTrackModel[649].setRotationPoint(41F, -10F, -21.5F);

		rightTrackModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox666
		rightTrackModel[650].setRotationPoint(41F, -10F, -19.5F);

		rightTrackModel[651].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox667
		rightTrackModel[651].setRotationPoint(41F, -10F, -19.5F);

		rightTrackModel[652].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox668
		rightTrackModel[652].setRotationPoint(41F, -10F, -28.5F);

		rightTrackModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox669
		rightTrackModel[653].setRotationPoint(44F, -10F, -27.5F);

		rightTrackModel[654].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox670
		rightTrackModel[654].setRotationPoint(45F, -10F, -27.5F);

		rightTrackModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox671
		rightTrackModel[655].setRotationPoint(44F, -10F, -24.5F);

		rightTrackModel[656].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox672
		rightTrackModel[656].setRotationPoint(45F, -10F, -23.5F);

		rightTrackModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox673
		rightTrackModel[657].setRotationPoint(44F, -10F, -21.5F);

		rightTrackModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox674
		rightTrackModel[658].setRotationPoint(44F, -10F, -19.5F);

		rightTrackModel[659].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox675
		rightTrackModel[659].setRotationPoint(45F, -10F, -19.5F);

		rightTrackModel[660].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox676
		rightTrackModel[660].setRotationPoint(45F, -10F, -28.5F);

		rightTrackModel[661].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1835
		rightTrackModel[661].setRotationPoint(38.5F, 3.5F, -27F);

		rightTrackModel[662].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1836
		rightTrackModel[662].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[662].rotateAngleZ = 0.78539816F;

		rightTrackModel[663].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1837
		rightTrackModel[663].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[663].rotateAngleZ = 1.57079633F;

		rightTrackModel[664].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1838
		rightTrackModel[664].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[664].rotateAngleZ = 2.35619449F;

		rightTrackModel[665].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1839
		rightTrackModel[665].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[665].rotateAngleZ = 3.14159265F;

		rightTrackModel[666].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1840
		rightTrackModel[666].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[666].rotateAngleZ = 3.92699082F;

		rightTrackModel[667].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1841
		rightTrackModel[667].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[667].rotateAngleZ = 4.71238898F;

		rightTrackModel[668].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1842
		rightTrackModel[668].setRotationPoint(38.5F, 3.5F, -27F);
		rightTrackModel[668].rotateAngleZ = 5.49778714F;

		rightTrackModel[669].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1851
		rightTrackModel[669].setRotationPoint(38.5F, 3.5F, -27F);

		rightTrackModel[670].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1853
		rightTrackModel[670].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[670].rotateAngleZ = 4.71238898F;

		rightTrackModel[671].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1854
		rightTrackModel[671].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[671].rotateAngleZ = 5.49778714F;

		rightTrackModel[672].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1855
		rightTrackModel[672].setRotationPoint(49.5F, -4.5F, -27F);

		rightTrackModel[673].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1856
		rightTrackModel[673].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[673].rotateAngleZ = 0.78539816F;

		rightTrackModel[674].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1857
		rightTrackModel[674].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[674].rotateAngleZ = 1.57079633F;

		rightTrackModel[675].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1858
		rightTrackModel[675].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[675].rotateAngleZ = 2.35619449F;

		rightTrackModel[676].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1859
		rightTrackModel[676].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[676].rotateAngleZ = 3.14159265F;

		rightTrackModel[677].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1860
		rightTrackModel[677].setRotationPoint(49.5F, -4.5F, -27F);
		rightTrackModel[677].rotateAngleZ = 3.92699082F;

		rightTrackModel[678].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1870
		rightTrackModel[678].setRotationPoint(49.5F, -4.5F, -27F);

		rightTrackModel[679].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1871
		rightTrackModel[679].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[679].rotateAngleZ = 4.71238898F;

		rightTrackModel[680].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1872
		rightTrackModel[680].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[680].rotateAngleZ = 5.49778714F;

		rightTrackModel[681].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1873
		rightTrackModel[681].setRotationPoint(25.5F, 3.5F, -27F);

		rightTrackModel[682].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1874
		rightTrackModel[682].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[682].rotateAngleZ = 0.78539816F;

		rightTrackModel[683].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1875
		rightTrackModel[683].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[683].rotateAngleZ = 1.57079633F;

		rightTrackModel[684].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1876
		rightTrackModel[684].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[684].rotateAngleZ = 2.35619449F;

		rightTrackModel[685].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1877
		rightTrackModel[685].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[685].rotateAngleZ = 3.14159265F;

		rightTrackModel[686].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1878
		rightTrackModel[686].setRotationPoint(25.5F, 3.5F, -27F);
		rightTrackModel[686].rotateAngleZ = 3.92699082F;

		rightTrackModel[687].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1888
		rightTrackModel[687].setRotationPoint(25.5F, 3.5F, -27F);

		rightTrackModel[688].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1889
		rightTrackModel[688].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[688].rotateAngleZ = 4.71238898F;

		rightTrackModel[689].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1890
		rightTrackModel[689].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[689].rotateAngleZ = 5.49778714F;

		rightTrackModel[690].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1891
		rightTrackModel[690].setRotationPoint(12.5F, 3.5F, -27F);

		rightTrackModel[691].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1892
		rightTrackModel[691].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[691].rotateAngleZ = 0.78539816F;

		rightTrackModel[692].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1893
		rightTrackModel[692].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[692].rotateAngleZ = 1.57079633F;

		rightTrackModel[693].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1894
		rightTrackModel[693].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[693].rotateAngleZ = 2.35619449F;

		rightTrackModel[694].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1895
		rightTrackModel[694].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[694].rotateAngleZ = 3.14159265F;

		rightTrackModel[695].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1896
		rightTrackModel[695].setRotationPoint(12.5F, 3.5F, -27F);
		rightTrackModel[695].rotateAngleZ = 3.92699082F;

		rightTrackModel[696].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1906
		rightTrackModel[696].setRotationPoint(12.5F, 3.5F, -27F);

		rightTrackModel[697].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1907
		rightTrackModel[697].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[697].rotateAngleZ = 4.71238898F;

		rightTrackModel[698].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1908
		rightTrackModel[698].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[698].rotateAngleZ = 5.49778714F;

		rightTrackModel[699].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1909
		rightTrackModel[699].setRotationPoint(1F, 3.5F, -27F);

		rightTrackModel[700].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1910
		rightTrackModel[700].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[700].rotateAngleZ = 0.78539816F;

		rightTrackModel[701].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1911
		rightTrackModel[701].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[701].rotateAngleZ = 1.57079633F;

		rightTrackModel[702].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1912
		rightTrackModel[702].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[702].rotateAngleZ = 2.35619449F;

		rightTrackModel[703].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1913
		rightTrackModel[703].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[703].rotateAngleZ = 3.14159265F;

		rightTrackModel[704].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1914
		rightTrackModel[704].setRotationPoint(1F, 3.5F, -27F);
		rightTrackModel[704].rotateAngleZ = 3.92699082F;

		rightTrackModel[705].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1924
		rightTrackModel[705].setRotationPoint(1F, 3.5F, -27F);

		rightTrackModel[706].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1925
		rightTrackModel[706].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[706].rotateAngleZ = 4.71238898F;

		rightTrackModel[707].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1926
		rightTrackModel[707].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[707].rotateAngleZ = 5.49778714F;

		rightTrackModel[708].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1927
		rightTrackModel[708].setRotationPoint(-10.5F, 3.5F, -27F);

		rightTrackModel[709].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1928
		rightTrackModel[709].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[709].rotateAngleZ = 0.78539816F;

		rightTrackModel[710].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1929
		rightTrackModel[710].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[710].rotateAngleZ = 1.57079633F;

		rightTrackModel[711].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1930
		rightTrackModel[711].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[711].rotateAngleZ = 2.35619449F;

		rightTrackModel[712].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1931
		rightTrackModel[712].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[712].rotateAngleZ = 3.14159265F;

		rightTrackModel[713].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1932
		rightTrackModel[713].setRotationPoint(-10.5F, 3.5F, -27F);
		rightTrackModel[713].rotateAngleZ = 3.92699082F;

		rightTrackModel[714].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1942
		rightTrackModel[714].setRotationPoint(-10.5F, 3.5F, -27F);

		rightTrackModel[715].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1943
		rightTrackModel[715].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[715].rotateAngleZ = 4.71238898F;

		rightTrackModel[716].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1944
		rightTrackModel[716].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[716].rotateAngleZ = 5.49778714F;

		rightTrackModel[717].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1945
		rightTrackModel[717].setRotationPoint(-23.5F, 3.5F, -27F);

		rightTrackModel[718].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1946
		rightTrackModel[718].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[718].rotateAngleZ = 0.78539816F;

		rightTrackModel[719].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1947
		rightTrackModel[719].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[719].rotateAngleZ = 1.57079633F;

		rightTrackModel[720].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1948
		rightTrackModel[720].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[720].rotateAngleZ = 2.35619449F;

		rightTrackModel[721].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1949
		rightTrackModel[721].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[721].rotateAngleZ = 3.14159265F;

		rightTrackModel[722].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1950
		rightTrackModel[722].setRotationPoint(-23.5F, 3.5F, -27F);
		rightTrackModel[722].rotateAngleZ = 3.92699082F;

		rightTrackModel[723].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1960
		rightTrackModel[723].setRotationPoint(-23.5F, 3.5F, -27F);

		rightTrackModel[724].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1961
		rightTrackModel[724].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[724].rotateAngleZ = 4.71238898F;

		rightTrackModel[725].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1962
		rightTrackModel[725].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[725].rotateAngleZ = 5.49778714F;

		rightTrackModel[726].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1963
		rightTrackModel[726].setRotationPoint(-36.5F, 3.5F, -27F);

		rightTrackModel[727].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1964
		rightTrackModel[727].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[727].rotateAngleZ = 0.78539816F;

		rightTrackModel[728].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1965
		rightTrackModel[728].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[728].rotateAngleZ = 1.57079633F;

		rightTrackModel[729].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1966
		rightTrackModel[729].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[729].rotateAngleZ = 2.35619449F;

		rightTrackModel[730].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1967
		rightTrackModel[730].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[730].rotateAngleZ = 3.14159265F;

		rightTrackModel[731].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1968
		rightTrackModel[731].setRotationPoint(-36.5F, 3.5F, -27F);
		rightTrackModel[731].rotateAngleZ = 3.92699082F;

		rightTrackModel[732].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1978
		rightTrackModel[732].setRotationPoint(-36.5F, 3.5F, -27F);

		rightTrackModel[733].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1979
		rightTrackModel[733].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[733].rotateAngleZ = 4.71238898F;

		rightTrackModel[734].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1980
		rightTrackModel[734].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[734].rotateAngleZ = 5.49778714F;

		rightTrackModel[735].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1981
		rightTrackModel[735].setRotationPoint(-44.5F, -4.5F, -27F);

		rightTrackModel[736].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1982
		rightTrackModel[736].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[736].rotateAngleZ = 0.78539816F;

		rightTrackModel[737].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1983
		rightTrackModel[737].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[737].rotateAngleZ = 1.57079633F;

		rightTrackModel[738].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1984
		rightTrackModel[738].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[738].rotateAngleZ = 2.35619449F;

		rightTrackModel[739].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1985
		rightTrackModel[739].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[739].rotateAngleZ = 3.14159265F;

		rightTrackModel[740].addShapeBox(3F, -0.5F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1986
		rightTrackModel[740].setRotationPoint(-44.5F, -4.5F, -27F);
		rightTrackModel[740].rotateAngleZ = 3.92699082F;

		rightTrackModel[741].addShapeBox(-1F, -1F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1996
		rightTrackModel[741].setRotationPoint(-44.5F, -4.5F, -27F);
	}
}