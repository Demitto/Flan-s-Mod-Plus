//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.12.2016 - 21:03:05
// Last changed on: 03.12.2016 - 21:03:05

package com.flansmod.client.model.ww2; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRatte extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRatte() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[358];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		turretModel = new ModelRendererTurbo[57];
		barrelModel = new ModelRendererTurbo[40];
		leftTrackWheelModels = new ModelRendererTurbo[196];
		rightTrackWheelModels = new ModelRendererTurbo[196];
		fancyTrackModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape 14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		bodyModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 165
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 382
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 384
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 385
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 386
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 387
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 388
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 389
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 390
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 391
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 392
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 393
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 394
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 395
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 396
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 397
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 398
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 399
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 400
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 401
		bodyModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 402
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 403
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 404
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 405
		bodyModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 406
		bodyModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 407
		bodyModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 408
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 409
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 410
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 411
		bodyModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 412
		bodyModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 413
		bodyModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 414
		bodyModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 415
		bodyModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 416
		bodyModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 417
		bodyModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 418
		bodyModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 419
		bodyModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 421
		bodyModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 422
		bodyModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 423
		bodyModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 424
		bodyModel[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 425
		bodyModel[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 426
		bodyModel[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 427
		bodyModel[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 428
		bodyModel[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 429
		bodyModel[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 430
		bodyModel[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 431
		bodyModel[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 432
		bodyModel[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 433
		bodyModel[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 434
		bodyModel[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 435
		bodyModel[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 447
		bodyModel[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 448
		bodyModel[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 449
		bodyModel[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 450
		bodyModel[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 451
		bodyModel[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 452
		bodyModel[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 453
		bodyModel[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 454
		bodyModel[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 455
		bodyModel[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 456
		bodyModel[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 457
		bodyModel[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 458
		bodyModel[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 459
		bodyModel[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 460
		bodyModel[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 461
		bodyModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 462
		bodyModel[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 463
		bodyModel[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 464
		bodyModel[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 465
		bodyModel[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 466
		bodyModel[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 467
		bodyModel[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 468
		bodyModel[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 469
		bodyModel[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 470
		bodyModel[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 471
		bodyModel[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 472
		bodyModel[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 473
		bodyModel[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 474
		bodyModel[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 475
		bodyModel[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 476
		bodyModel[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 477
		bodyModel[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 478
		bodyModel[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 479
		bodyModel[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 480
		bodyModel[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 481
		bodyModel[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 482
		bodyModel[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 483
		bodyModel[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 484
		bodyModel[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 485
		bodyModel[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 486
		bodyModel[196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 487
		bodyModel[197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 488
		bodyModel[198] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 489
		bodyModel[199] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 490
		bodyModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 491
		bodyModel[201] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 492
		bodyModel[202] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 493
		bodyModel[203] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 494
		bodyModel[204] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 495
		bodyModel[205] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 496
		bodyModel[206] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 497
		bodyModel[207] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 498
		bodyModel[208] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 499
		bodyModel[209] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 500
		bodyModel[210] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 501
		bodyModel[211] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 502
		bodyModel[212] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 503
		bodyModel[213] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 504
		bodyModel[214] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 505
		bodyModel[215] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 506
		bodyModel[216] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 507
		bodyModel[217] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 508
		bodyModel[218] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 509
		bodyModel[219] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 510
		bodyModel[220] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 511
		bodyModel[221] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 512
		bodyModel[222] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 513
		bodyModel[223] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 514
		bodyModel[224] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 515
		bodyModel[225] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 516
		bodyModel[226] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 517
		bodyModel[227] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 518
		bodyModel[228] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 519
		bodyModel[229] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 520
		bodyModel[230] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 521
		bodyModel[231] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 522
		bodyModel[232] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 523
		bodyModel[233] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 524
		bodyModel[234] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 525
		bodyModel[235] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 526
		bodyModel[236] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 527
		bodyModel[237] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 528
		bodyModel[238] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 529
		bodyModel[239] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 530
		bodyModel[240] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 531
		bodyModel[241] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 532
		bodyModel[242] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 533
		bodyModel[243] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 534
		bodyModel[244] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 535
		bodyModel[245] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 536
		bodyModel[246] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 537
		bodyModel[247] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 538
		bodyModel[248] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 539
		bodyModel[249] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 540
		bodyModel[250] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 541
		bodyModel[251] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 542
		bodyModel[252] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 543
		bodyModel[253] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 544
		bodyModel[254] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 545
		bodyModel[255] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 546
		bodyModel[256] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 547
		bodyModel[257] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 548
		bodyModel[258] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 549
		bodyModel[259] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 550
		bodyModel[260] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 551
		bodyModel[261] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 552
		bodyModel[262] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 553
		bodyModel[263] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 554
		bodyModel[264] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 555
		bodyModel[265] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 556
		bodyModel[266] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 557
		bodyModel[267] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 558
		bodyModel[268] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 559
		bodyModel[269] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 560
		bodyModel[270] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 561
		bodyModel[271] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 562
		bodyModel[272] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 563
		bodyModel[273] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 564
		bodyModel[274] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 565
		bodyModel[275] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 566
		bodyModel[276] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 567
		bodyModel[277] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 568
		bodyModel[278] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 569
		bodyModel[279] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 570
		bodyModel[280] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 571
		bodyModel[281] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 572
		bodyModel[282] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 573
		bodyModel[283] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 574
		bodyModel[284] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 575
		bodyModel[285] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 576
		bodyModel[286] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 577
		bodyModel[287] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 578
		bodyModel[288] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 579
		bodyModel[289] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 580
		bodyModel[290] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 581
		bodyModel[291] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 582
		bodyModel[292] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 583
		bodyModel[293] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 584
		bodyModel[294] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 585
		bodyModel[295] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 586
		bodyModel[296] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 587
		bodyModel[297] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 588
		bodyModel[298] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 589
		bodyModel[299] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 590
		bodyModel[300] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 591
		bodyModel[301] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 592
		bodyModel[302] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 593
		bodyModel[303] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 594
		bodyModel[304] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 595
		bodyModel[305] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 596
		bodyModel[306] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 597
		bodyModel[307] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 598
		bodyModel[308] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 599
		bodyModel[309] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 600
		bodyModel[310] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 601
		bodyModel[311] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 602
		bodyModel[312] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 603
		bodyModel[313] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 604
		bodyModel[314] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 605
		bodyModel[315] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 606
		bodyModel[316] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 607
		bodyModel[317] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 608
		bodyModel[318] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 609
		bodyModel[319] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 610
		bodyModel[320] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 611
		bodyModel[321] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 617
		bodyModel[322] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 618
		bodyModel[323] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 619
		bodyModel[324] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 623
		bodyModel[325] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 624
		bodyModel[326] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 463
		bodyModel[327] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 464
		bodyModel[328] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 465
		bodyModel[329] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 466
		bodyModel[330] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 460
		bodyModel[331] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 461
		bodyModel[332] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 462
		bodyModel[333] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 463
		bodyModel[334] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 464
		bodyModel[335] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 465
		bodyModel[336] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 485
		bodyModel[337] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 486
		bodyModel[338] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 487
		bodyModel[339] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 488
		bodyModel[340] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 489
		bodyModel[341] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 490
		bodyModel[342] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 491
		bodyModel[343] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 492
		bodyModel[344] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 493
		bodyModel[345] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 494
		bodyModel[346] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 495
		bodyModel[347] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 496
		bodyModel[348] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 497
		bodyModel[349] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 498
		bodyModel[350] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 499
		bodyModel[351] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 500
		bodyModel[352] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 501
		bodyModel[353] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 502
		bodyModel[354] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 452
		bodyModel[355] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 453
		bodyModel[356] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 455
		bodyModel[357] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 458

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 21, 65, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(345F, -62F, -115F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 36, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(345F, -62F, -120F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 41, 20, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(345F, -62F, -140F);

		bodyModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(64, 14, 64, 14), new Coord2D(64, 34, 64, 34), new Coord2D(0, 34, 0, 34) }), 1, 64, 34, 184, 1, ModelRendererTurbo.MR_FRONT, new float[] {34 ,64 ,20 ,66}); // Shape 5
		bodyModel[3].setRotationPoint(350.5F, -27F, -115F);
		bodyModel[3].rotateAngleY = -1.57079633F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 39, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(345.5F, -61F, -134F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 38, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 7
		bodyModel[5].setRotationPoint(307F, -62F, -140F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 37, 51, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(270F, -62F, -140F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F); // Box 9
		bodyModel[7].setRotationPoint(239F, -62F, -140F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 111, 30, 85, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(239F, -92F, -135F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 111, 30, 5, 0F,0F, -5F, 0F, -35F, -5F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(239F, -92F, -140F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 36, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 12
		bodyModel[10].setRotationPoint(345F, -62F, 115F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 41, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(345F, -62F, 120F);

		bodyModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(64, 14, 64, 14), new Coord2D(64, 34, 64, 34), new Coord2D(0, 34, 0, 34) }), 1, 64, 34, 184, 1, ModelRendererTurbo.MR_FRONT, new float[] {34 ,64 ,20 ,66}); // Shape 14
		bodyModel[12].setRotationPoint(349.5F, -27F, 115F);
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 39, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(345.5F, -61F, 121F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 38, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 16
		bodyModel[14].setRotationPoint(307F, -62F, 135F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 37, 51, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(270F, -62F, 135F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 31, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F); // Box 18
		bodyModel[16].setRotationPoint(239F, -62F, 135F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 111, 30, 85, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(239F, -92F, 50F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 111, 30, 5, 0F,0F, 0F, 0F, -30F, 0F, 0F, -35F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(239F, -92F, 135F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 21, 65, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F); // Box 21
		bodyModel[19].setRotationPoint(345F, -62F, 50F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 106, 21, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 22
		bodyModel[20].setRotationPoint(239F, -62F, -55F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 106, 21, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 23
		bodyModel[21].setRotationPoint(239F, -62F, 50F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 28, 5, 0F,28F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(348.5F, -91F, -132F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 28, 5, 0F,28F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(348.5F, -91F, -97F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 28, 5, 0F,28F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(348.5F, -91F, -62F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 28, 5, 0F,28F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(348.5F, -91F, 127F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 28, 5, 0F,28F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(348.5F, -91F, 92F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 28, 5, 0F,28F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(348.5F, -91F, 57F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 85, 34, 100, 0F,0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(239F, -82F, -50F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 85, 24, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(239F, -48F, -50F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 85, 14, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(239F, -24F, -50F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 10, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(239F, -92F, -50F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 32, 4, 20, 0F,0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[32].setRotationPoint(214F, -113F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 32, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F); // Box 112
		bodyModel[33].setRotationPoint(214F, -113F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 31, 13, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F); // Box 113
		bodyModel[34].setRotationPoint(214F, -109F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 31, 13, 19, 0F,0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[35].setRotationPoint(214F, -109F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 32, 4, 20, 0F,0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[36].setRotationPoint(214F, -96F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 32, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F); // Box 116
		bodyModel[37].setRotationPoint(214F, -96F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 85, 24, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[38].setRotationPoint(239F, -48F, 37F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 63, 24, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[39].setRotationPoint(239F, -48F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 15, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(323.5F, -39F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(323.5F, -48F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(323.5F, -48F, 32F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[43].setRotationPoint(323.5F, -48F, 15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(302.5F, -82F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 48
		bodyModel[45].setRotationPoint(302.5F, -70F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 276, 61, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[46].setRotationPoint(-330F, -92F, -140F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 20, 71, 5, 0F,-5F, -50F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(-350F, -92F, -140F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 280, 36, 85, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(-330F, -92F, -135F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 20, 40, 85, 0F,0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 31F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 31F, 0F); // Box 54
		bodyModel[49].setRotationPoint(-350F, -92F, -135F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 280, 36, 85, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(-330F, -92F, 50F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 280, 25, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[51].setRotationPoint(-330F, -87F, -50F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 239, 31, 250, 0F,0F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[52].setRotationPoint(0F, -123F, -125F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 50, 31, 250, 0F,-30F, 0F, -50F, 0F, 0F, -30F, 0F, 0F, -30F, -30F, 0F, -50F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F); // Box 59
		bodyModel[53].setRotationPoint(-50F, -123F, -125F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 20, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[54].setRotationPoint(-330F, -31F, -140F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 32, 20, 5, 0F,0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[55].setRotationPoint(-310F, -31F, -140F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 20, 71, 5, 0F,0F, -50F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 63
		bodyModel[56].setRotationPoint(-350F, -92F, 135F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 20, 40, 85, 0F,0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 0F, 31F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 31F, 0F); // Box 64
		bodyModel[57].setRotationPoint(-350F, -92F, 50F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 20, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[58].setRotationPoint(-330F, -31F, 135F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 32, 20, 5, 0F,0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[59].setRotationPoint(-310F, -31F, 135F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 75, 10, 75, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[60].setRotationPoint(-330F, -102F, -130F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 75, 10, 75, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[61].setRotationPoint(-330F, -102F, 55F);

		bodyModel[62].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 69
		bodyModel[62].setRotationPoint(190F, -51F, -141F);

		bodyModel[63].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 70
		bodyModel[63].setRotationPoint(190F, -87F, -141F);

		bodyModel[64].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 74
		bodyModel[64].setRotationPoint(90F, -51F, -141F);

		bodyModel[65].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 75
		bodyModel[65].setRotationPoint(90F, -87F, -141F);

		bodyModel[66].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 82
		bodyModel[66].setRotationPoint(-110F, -51F, -141F);

		bodyModel[67].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 83
		bodyModel[67].setRotationPoint(-110F, -87F, -141F);

		bodyModel[68].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 86
		bodyModel[68].setRotationPoint(-210F, -51F, -141F);

		bodyModel[69].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 87
		bodyModel[69].setRotationPoint(-210F, -87F, -141F);

		bodyModel[70].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 89
		bodyModel[70].setRotationPoint(190F, -51F, 140F);

		bodyModel[71].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 90
		bodyModel[71].setRotationPoint(190F, -87F, 140F);

		bodyModel[72].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 94
		bodyModel[72].setRotationPoint(90F, -51F, 140F);

		bodyModel[73].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 95
		bodyModel[73].setRotationPoint(90F, -87F, 140F);

		bodyModel[74].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 102
		bodyModel[74].setRotationPoint(-110F, -51F, 140F);

		bodyModel[75].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 103
		bodyModel[75].setRotationPoint(-110F, -87F, 140F);

		bodyModel[76].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 106
		bodyModel[76].setRotationPoint(-210F, -51F, 140F);

		bodyModel[77].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 107
		bodyModel[77].setRotationPoint(-210F, -87F, 140F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 17, 40, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[78].setRotationPoint(221F, -108F, -73F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 16, 20, 250, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[79].setRotationPoint(4F, -112F, -125F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 2, 250, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[80].setRotationPoint(4F, -114F, -125F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 14, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[81].setRotationPoint(5F, -112F, -126F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 14, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[82].setRotationPoint(5F, -112F, 125F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[83].setRotationPoint(237F, -106F, -60F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[84].setRotationPoint(237F, -106F, -51F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 48, 31, 24, 0F,-22F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[85].setRotationPoint(23F, -123F, -119F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 48, 31, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[86].setRotationPoint(71F, -123F, -119F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 48, 31, 24, 0F,0F, 0F, 0F, -22F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[87].setRotationPoint(119F, -123F, -119F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 48, 31, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -6F); // Box 142
		bodyModel[88].setRotationPoint(23F, -123F, 95F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 48, 31, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[89].setRotationPoint(71F, -123F, 95F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 48, 31, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -6F, 0F, 0F, 0F); // Box 144
		bodyModel[90].setRotationPoint(119F, -123F, 95F);

		bodyModel[91].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 163
		bodyModel[91].setRotationPoint(140F, -87F, -141F);

		bodyModel[92].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 164
		bodyModel[92].setRotationPoint(140F, -51F, -141F);

		bodyModel[93].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 165
		bodyModel[93].setRotationPoint(-160F, -87F, -141F);

		bodyModel[94].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 166
		bodyModel[94].setRotationPoint(-160F, -51F, -141F);

		bodyModel[95].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 167
		bodyModel[95].setRotationPoint(-260F, -51F, -141F);

		bodyModel[96].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 168
		bodyModel[96].setRotationPoint(-260F, -87F, -141F);

		bodyModel[97].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 169
		bodyModel[97].setRotationPoint(140F, -87F, 140F);

		bodyModel[98].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 170
		bodyModel[98].setRotationPoint(140F, -51F, 140F);

		bodyModel[99].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 171
		bodyModel[99].setRotationPoint(-160F, -87F, 140F);

		bodyModel[100].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 172
		bodyModel[100].setRotationPoint(-160F, -51F, 140F);

		bodyModel[101].addTrapezoid(0F, 0F, 0F, 49, 20, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 173
		bodyModel[101].setRotationPoint(-260F, -51F, 140F);

		bodyModel[102].addTrapezoid(0F, 0F, 0F, 49, 36, 1, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 174
		bodyModel[102].setRotationPoint(-260F, -87F, 140F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 469, 52, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[103].setRotationPoint(-230F, -62F, -50F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 100, 4, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[104].setRotationPoint(-330F, -14F, -50F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 100, 48, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[105].setRotationPoint(-330F, -62F, -50F);

		bodyModel[106].addTrapezoid(0F, 0F, 0F, 2, 32, 16, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 385
		bodyModel[106].setRotationPoint(-232F, -47F, -36F);

		bodyModel[107].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 386
		bodyModel[107].setRotationPoint(-253F, -21F, 29F);

		bodyModel[108].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 387
		bodyModel[108].setRotationPoint(-253F, -35F, 29F);

		bodyModel[109].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 388
		bodyModel[109].setRotationPoint(-271F, -21F, 29F);

		bodyModel[110].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 389
		bodyModel[110].setRotationPoint(-271F, -35F, 29F);

		bodyModel[111].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 390
		bodyModel[111].setRotationPoint(-289F, -21F, 29F);

		bodyModel[112].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 391
		bodyModel[112].setRotationPoint(-289F, -35F, 29F);

		bodyModel[113].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 392
		bodyModel[113].setRotationPoint(-307F, -21F, 29F);

		bodyModel[114].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 393
		bodyModel[114].setRotationPoint(-307F, -35F, 29F);

		bodyModel[115].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 394
		bodyModel[115].setRotationPoint(-326F, -21F, 29F);

		bodyModel[116].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 395
		bodyModel[116].setRotationPoint(-326F, -35F, 29F);

		bodyModel[117].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 396
		bodyModel[117].setRotationPoint(-326F, -21F, 9F);

		bodyModel[118].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 397
		bodyModel[118].setRotationPoint(-326F, -35F, 9F);

		bodyModel[119].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 398
		bodyModel[119].setRotationPoint(-307F, -21F, 9F);

		bodyModel[120].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 399
		bodyModel[120].setRotationPoint(-307F, -35F, 9F);

		bodyModel[121].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 400
		bodyModel[121].setRotationPoint(-289F, -21F, 9F);

		bodyModel[122].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 401
		bodyModel[122].setRotationPoint(-289F, -35F, 9F);

		bodyModel[123].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 402
		bodyModel[123].setRotationPoint(-271F, -21F, 9F);

		bodyModel[124].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 403
		bodyModel[124].setRotationPoint(-271F, -35F, 9F);

		bodyModel[125].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 404
		bodyModel[125].setRotationPoint(-253F, -21F, 9F);

		bodyModel[126].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 405
		bodyModel[126].setRotationPoint(-253F, -35F, 9F);

		bodyModel[127].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 406
		bodyModel[127].setRotationPoint(-326F, -21F, -11F);

		bodyModel[128].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 407
		bodyModel[128].setRotationPoint(-326F, -35F, -11F);

		bodyModel[129].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 408
		bodyModel[129].setRotationPoint(-307F, -21F, -11F);

		bodyModel[130].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 409
		bodyModel[130].setRotationPoint(-307F, -35F, -11F);

		bodyModel[131].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 410
		bodyModel[131].setRotationPoint(-289F, -21F, -11F);

		bodyModel[132].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 411
		bodyModel[132].setRotationPoint(-289F, -35F, -11F);

		bodyModel[133].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 412
		bodyModel[133].setRotationPoint(-271F, -21F, -11F);

		bodyModel[134].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 413
		bodyModel[134].setRotationPoint(-271F, -35F, -11F);

		bodyModel[135].addTrapezoid(0F, 0F, 0F, 12, 7, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 414
		bodyModel[135].setRotationPoint(-253F, -21F, -11F);

		bodyModel[136].addTrapezoid(0F, 0F, 0F, 2, 14, 14, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 415
		bodyModel[136].setRotationPoint(-253F, -35F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 100, 48, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[137].setRotationPoint(-330F, -62F, 46F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 9, 77, 15, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[138].setRotationPoint(-339F, -87F, -50F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 9, 77, 65, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[139].setRotationPoint(-339F, -87F, -15F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 7, 20, 0F,-0.72F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.72F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[140].setRotationPoint(-339F, -17F, -35F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 9, 38, 20, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -4.0519F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.0519F, 0F, 0F); // Box 421
		bodyModel[141].setRotationPoint(-339F, -87F, -35F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 77, 12, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[142].setRotationPoint(-340F, -87F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F,0F, 0F, 0F, 1F, 32F, 0F, 0F, 32F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 423
		bodyModel[143].setRotationPoint(-350F, -21F, 50F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F,0F, 0F, 0F, 0F, 32F, 0F, 1F, 32F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -11F, 0F, 0F); // Box 424
		bodyModel[144].setRotationPoint(-350F, -21F, -51F);

		bodyModel[145].addShapeBox(-5F, 7F, 0F, 6, 3, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[145].setRotationPoint(-331F, -87F, 12F);
		bodyModel[145].rotateAngleZ = -0.08726646F;

		bodyModel[146].addShapeBox(-8F, 7F, 0F, 3, 3, 27, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 426
		bodyModel[146].setRotationPoint(-331F, -87F, 12F);
		bodyModel[146].rotateAngleZ = -0.08726646F;

		bodyModel[147].addShapeBox(-6F, 5F, 0F, 5, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[147].setRotationPoint(-331F, -87F, 14F);
		bodyModel[147].rotateAngleZ = -0.08726646F;

		bodyModel[148].addShapeBox(-7F, -1F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[148].setRotationPoint(-331F, -87F, 14F);
		bodyModel[148].rotateAngleZ = -0.08726646F;

		bodyModel[149].addShapeBox(-6.5F, 21F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[149].setRotationPoint(-331F, -87F, 13.5F);
		bodyModel[149].rotateAngleZ = -0.08726646F;

		bodyModel[150].addShapeBox(-6.5F, 21F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[150].setRotationPoint(-331F, -87F, 22F);
		bodyModel[150].rotateAngleZ = -0.08726646F;

		bodyModel[151].addShapeBox(-7F, -1F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[151].setRotationPoint(-331F, -87F, 22.5F);
		bodyModel[151].rotateAngleZ = -0.08726646F;

		bodyModel[152].addShapeBox(-6F, 5F, 0F, 5, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[152].setRotationPoint(-331F, -87F, 22.5F);
		bodyModel[152].rotateAngleZ = -0.08726646F;

		bodyModel[153].addShapeBox(-6.5F, 21F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[153].setRotationPoint(-331F, -87F, 30.5F);
		bodyModel[153].rotateAngleZ = -0.08726646F;

		bodyModel[154].addShapeBox(-7F, -1F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[154].setRotationPoint(-331F, -87F, 31F);
		bodyModel[154].rotateAngleZ = -0.08726646F;

		bodyModel[155].addShapeBox(-6F, 5F, 0F, 5, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[155].setRotationPoint(-331F, -87F, 31F);
		bodyModel[155].rotateAngleZ = -0.08726646F;

		bodyModel[156].addShapeBox(-5F, 7F, 0F, 6, 3, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[156].setRotationPoint(-331F, -87F, -39F);
		bodyModel[156].rotateAngleZ = -0.08726646F;

		bodyModel[157].addShapeBox(-8F, 7F, 0F, 3, 3, 27, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 448
		bodyModel[157].setRotationPoint(-331F, -87F, -39F);
		bodyModel[157].rotateAngleZ = -0.08726646F;

		bodyModel[158].addShapeBox(-6F, 5F, 0F, 5, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[158].setRotationPoint(-331F, -87F, -19F);
		bodyModel[158].rotateAngleZ = -0.08726646F;

		bodyModel[159].addShapeBox(-7F, -1F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[159].setRotationPoint(-331F, -87F, -19F);
		bodyModel[159].rotateAngleZ = -0.08726646F;

		bodyModel[160].addShapeBox(-6.5F, 21F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[160].setRotationPoint(-331F, -87F, -19.5F);
		bodyModel[160].rotateAngleZ = -0.08726646F;

		bodyModel[161].addShapeBox(-6.5F, 21F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[161].setRotationPoint(-331F, -87F, -28F);
		bodyModel[161].rotateAngleZ = -0.08726646F;

		bodyModel[162].addShapeBox(-7F, -1F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[162].setRotationPoint(-331F, -87F, -27.5F);
		bodyModel[162].rotateAngleZ = -0.08726646F;

		bodyModel[163].addShapeBox(-6F, 5F, 0F, 5, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[163].setRotationPoint(-331F, -87F, -27.5F);
		bodyModel[163].rotateAngleZ = -0.08726646F;

		bodyModel[164].addShapeBox(-6.5F, 21F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[164].setRotationPoint(-331F, -87F, -36.5F);
		bodyModel[164].rotateAngleZ = -0.08726646F;

		bodyModel[165].addShapeBox(-7F, -1F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[165].setRotationPoint(-331F, -87F, -36F);
		bodyModel[165].rotateAngleZ = -0.08726646F;

		bodyModel[166].addShapeBox(-6F, 5F, 0F, 5, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[166].setRotationPoint(-331F, -87F, -36F);
		bodyModel[166].rotateAngleZ = -0.08726646F;

		bodyModel[167].addShapeBox(-5.5F, 50F, 0F, 5, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[167].setRotationPoint(-331F, -87F, 25F);
		bodyModel[167].rotateAngleZ = -0.08726646F;

		bodyModel[168].addShapeBox(-5.5F, 50F, 0F, 5, 18, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[168].setRotationPoint(-331F, -87F, 20F);
		bodyModel[168].rotateAngleZ = -0.08726646F;

		bodyModel[169].addShapeBox(-5.5F, 50F, 0F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 460
		bodyModel[169].setRotationPoint(-331F, -87F, 33F);
		bodyModel[169].rotateAngleZ = -0.08726646F;

		bodyModel[170].addShapeBox(-6.5F, 48F, 0F, 6, 2, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[170].setRotationPoint(-331F, -87F, 25F);
		bodyModel[170].rotateAngleZ = -0.08726646F;

		bodyModel[171].addShapeBox(-6.5F, 68F, 0F, 6, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 462
		bodyModel[171].setRotationPoint(-331F, -87F, 25F);
		bodyModel[171].rotateAngleZ = -0.08726646F;

		bodyModel[172].addShapeBox(-6.5F, 55F, 0F, 6, 8, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[172].setRotationPoint(-331F, -87F, 18F);
		bodyModel[172].rotateAngleZ = -0.08726646F;

		bodyModel[173].addShapeBox(-6.5F, 55F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 464
		bodyModel[173].setRotationPoint(-331F, -87F, 38F);
		bodyModel[173].rotateAngleZ = -0.08726646F;

		bodyModel[174].addShapeBox(-6.5F, 48F, 0F, 6, 2, 6, 0F,0F, -6F, 1F, 0F, -6F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[174].setRotationPoint(-331F, -87F, 19F);
		bodyModel[174].rotateAngleZ = -0.08726646F;

		bodyModel[175].addShapeBox(-6.5F, 68F, 0F, 6, 2, 6, 0F,0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 466
		bodyModel[175].setRotationPoint(-331F, -87F, 19F);
		bodyModel[175].rotateAngleZ = -0.08726646F;

		bodyModel[176].addShapeBox(-6.5F, 68F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, 1F, 0F, -6F, 1F); // Box 467
		bodyModel[176].setRotationPoint(-331F, -87F, 33F);
		bodyModel[176].rotateAngleZ = -0.08726646F;

		bodyModel[177].addShapeBox(-6.5F, 48F, 0F, 6, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, 1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F); // Box 468
		bodyModel[177].setRotationPoint(-331F, -87F, 33F);
		bodyModel[177].rotateAngleZ = -0.08726646F;

		bodyModel[178].addTrapezoid(0F, 0F, 0F, 12, 2, 24, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 469
		bodyModel[178].setRotationPoint(-322F, -89F, -12F);

		bodyModel[179].addTrapezoid(0F, 0F, 0F, 4, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 470
		bodyModel[179].setRotationPoint(-318F, -90F, -2F);

		bodyModel[180].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 471
		bodyModel[180].setRotationPoint(-326F, -95F, -47F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[181].setRotationPoint(-326F, -95F, -40F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[182].setRotationPoint(-326F, -95F, -34F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F); // Box 474
		bodyModel[183].setRotationPoint(-326F, -95F, -28F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[184].setRotationPoint(-319F, -95F, -22F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 476
		bodyModel[185].setRotationPoint(-313F, -95F, -40F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[186].setRotationPoint(-307F, -95F, -34F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F); // Box 478
		bodyModel[187].setRotationPoint(-307F, -95F, -28F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[188].setRotationPoint(-318F, -95F, -33F);

		bodyModel[189].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[189].setRotationPoint(-316F, -94F, -31F);

		bodyModel[190].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[190].setRotationPoint(-316F, -94F, -31F);
		bodyModel[190].rotateAngleY = -2.0943951F;

		bodyModel[191].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[191].setRotationPoint(-316F, -94F, -31F);
		bodyModel[191].rotateAngleY = -4.1887902F;

		bodyModel[192].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 483
		bodyModel[192].setRotationPoint(-326F, -95F, 40F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[193].setRotationPoint(-326F, -95F, 34F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[194].setRotationPoint(-326F, -95F, 28F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[195].setRotationPoint(-326F, -95F, 22F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[196].setRotationPoint(-319F, -95F, 21F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[197].setRotationPoint(-313F, -95F, 34F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[198].setRotationPoint(-307F, -95F, 28F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[199].setRotationPoint(-307F, -95F, 22F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[200].setRotationPoint(-318F, -95F, 29F);

		bodyModel[201].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[201].setRotationPoint(-316F, -94F, 31F);

		bodyModel[202].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[202].setRotationPoint(-316F, -94F, 31F);
		bodyModel[202].rotateAngleY = -2.0943951F;

		bodyModel[203].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[203].setRotationPoint(-316F, -94F, 31F);
		bodyModel[203].rotateAngleY = -4.1887902F;

		bodyModel[204].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 495
		bodyModel[204].setRotationPoint(-298F, -90F, -50F);

		bodyModel[205].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 496
		bodyModel[205].setRotationPoint(-298F, -90F, 8F);

		bodyModel[206].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 497
		bodyModel[206].setRotationPoint(-240F, -90F, 8F);

		bodyModel[207].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 498
		bodyModel[207].setRotationPoint(-240F, -90F, -50F);

		bodyModel[208].addTrapezoid(0F, 0F, 0F, 12, 2, 24, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 499
		bodyModel[208].setRotationPoint(-264F, -89F, -12F);

		bodyModel[209].addTrapezoid(0F, 0F, 0F, 4, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 500
		bodyModel[209].setRotationPoint(-260F, -90F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[210].setRotationPoint(-255F, -95F, 34F);

		bodyModel[211].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 502
		bodyModel[211].setRotationPoint(-268F, -95F, 40F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[212].setRotationPoint(-268F, -95F, 34F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[213].setRotationPoint(-268F, -95F, 28F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[214].setRotationPoint(-268F, -95F, 22F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[215].setRotationPoint(-261F, -95F, 21F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[216].setRotationPoint(-249F, -95F, 22F);

		bodyModel[217].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 508
		bodyModel[217].setRotationPoint(-268F, -95F, -47F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 509
		bodyModel[218].setRotationPoint(-255F, -95F, -40F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[219].setRotationPoint(-268F, -95F, -40F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[220].setRotationPoint(-268F, -95F, -34F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F); // Box 512
		bodyModel[221].setRotationPoint(-268F, -95F, -28F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[222].setRotationPoint(-261F, -95F, -22F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[223].setRotationPoint(-249F, -95F, -34F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F); // Box 515
		bodyModel[224].setRotationPoint(-249F, -95F, -28F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[225].setRotationPoint(-260F, -95F, 29F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[226].setRotationPoint(-249F, -95F, 28F);

		bodyModel[227].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[227].setRotationPoint(-258F, -94F, 31F);
		bodyModel[227].rotateAngleY = -4.1887902F;

		bodyModel[228].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[228].setRotationPoint(-258F, -94F, 31F);
		bodyModel[228].rotateAngleY = -2.0943951F;

		bodyModel[229].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[229].setRotationPoint(-258F, -94F, 31F);

		bodyModel[230].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[230].setRotationPoint(-258F, -94F, -31F);
		bodyModel[230].rotateAngleY = -2.0943951F;

		bodyModel[231].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[231].setRotationPoint(-258F, -94F, -31F);
		bodyModel[231].rotateAngleY = -4.1887902F;

		bodyModel[232].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[232].setRotationPoint(-258F, -94F, -31F);

		bodyModel[233].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 524
		bodyModel[233].setRotationPoint(-182F, -90F, 8F);

		bodyModel[234].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 525
		bodyModel[234].setRotationPoint(-182F, -90F, -50F);

		bodyModel[235].addTrapezoid(0F, 0F, 0F, 12, 2, 24, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 526
		bodyModel[235].setRotationPoint(-206F, -89F, -12F);

		bodyModel[236].addTrapezoid(0F, 0F, 0F, 4, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 527
		bodyModel[236].setRotationPoint(-202F, -90F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[237].setRotationPoint(-197F, -95F, 34F);

		bodyModel[238].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 529
		bodyModel[238].setRotationPoint(-210F, -95F, 40F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[239].setRotationPoint(-210F, -95F, 34F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[240].setRotationPoint(-210F, -95F, 28F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[241].setRotationPoint(-210F, -95F, 22F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[242].setRotationPoint(-203F, -95F, 21F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[243].setRotationPoint(-191F, -95F, 22F);

		bodyModel[244].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 535
		bodyModel[244].setRotationPoint(-210F, -95F, -47F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 536
		bodyModel[245].setRotationPoint(-197F, -95F, -40F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[246].setRotationPoint(-210F, -95F, -40F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[247].setRotationPoint(-210F, -95F, -34F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F); // Box 539
		bodyModel[248].setRotationPoint(-210F, -95F, -28F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[249].setRotationPoint(-203F, -95F, -22F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[250].setRotationPoint(-191F, -95F, -34F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F); // Box 542
		bodyModel[251].setRotationPoint(-191F, -95F, -28F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[252].setRotationPoint(-202F, -95F, 29F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[253].setRotationPoint(-191F, -95F, 28F);

		bodyModel[254].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[254].setRotationPoint(-200F, -94F, 31F);
		bodyModel[254].rotateAngleY = -4.1887902F;

		bodyModel[255].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[255].setRotationPoint(-200F, -94F, 31F);
		bodyModel[255].rotateAngleY = -2.0943951F;

		bodyModel[256].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[256].setRotationPoint(-200F, -94F, 31F);

		bodyModel[257].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[257].setRotationPoint(-200F, -94F, -31F);
		bodyModel[257].rotateAngleY = -2.0943951F;

		bodyModel[258].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[258].setRotationPoint(-200F, -94F, -31F);
		bodyModel[258].rotateAngleY = -4.1887902F;

		bodyModel[259].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[259].setRotationPoint(-200F, -94F, -31F);

		bodyModel[260].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 551
		bodyModel[260].setRotationPoint(-124F, -90F, 8F);

		bodyModel[261].addTrapezoid(0F, 0F, 0F, 24, 3, 42, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 552
		bodyModel[261].setRotationPoint(-124F, -90F, -50F);

		bodyModel[262].addTrapezoid(0F, 0F, 0F, 12, 2, 24, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 553
		bodyModel[262].setRotationPoint(-148F, -89F, -12F);

		bodyModel[263].addTrapezoid(0F, 0F, 0F, 4, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 554
		bodyModel[263].setRotationPoint(-144F, -90F, -2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[264].setRotationPoint(-139F, -95F, 34F);

		bodyModel[265].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 556
		bodyModel[265].setRotationPoint(-152F, -95F, 40F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[266].setRotationPoint(-152F, -95F, 34F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[267].setRotationPoint(-152F, -95F, 28F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[268].setRotationPoint(-152F, -95F, 22F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[269].setRotationPoint(-145F, -95F, 21F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[270].setRotationPoint(-133F, -95F, 22F);

		bodyModel[271].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 562
		bodyModel[271].setRotationPoint(-152F, -95F, -47F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 563
		bodyModel[272].setRotationPoint(-139F, -95F, -40F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[273].setRotationPoint(-152F, -95F, -40F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[274].setRotationPoint(-152F, -95F, -34F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F); // Box 566
		bodyModel[275].setRotationPoint(-152F, -95F, -28F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[276].setRotationPoint(-145F, -95F, -22F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[277].setRotationPoint(-133F, -95F, -34F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F); // Box 569
		bodyModel[278].setRotationPoint(-133F, -95F, -28F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[279].setRotationPoint(-144F, -95F, 29F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[280].setRotationPoint(-133F, -95F, 28F);

		bodyModel[281].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[281].setRotationPoint(-142F, -94F, 31F);
		bodyModel[281].rotateAngleY = -4.1887902F;

		bodyModel[282].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[282].setRotationPoint(-142F, -94F, 31F);
		bodyModel[282].rotateAngleY = -2.0943951F;

		bodyModel[283].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[283].setRotationPoint(-142F, -94F, 31F);

		bodyModel[284].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[284].setRotationPoint(-142F, -94F, -31F);
		bodyModel[284].rotateAngleY = -2.0943951F;

		bodyModel[285].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[285].setRotationPoint(-142F, -94F, -31F);
		bodyModel[285].rotateAngleY = -4.1887902F;

		bodyModel[286].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[286].setRotationPoint(-142F, -94F, -31F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[287].setRotationPoint(-260F, -95F, -33F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[288].setRotationPoint(-202F, -95F, -33F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[289].setRotationPoint(-144F, -95F, -33F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[290].setRotationPoint(-94F, -95F, -40F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 582
		bodyModel[291].setRotationPoint(-81F, -95F, -40F);

		bodyModel[292].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 583
		bodyModel[292].setRotationPoint(-94F, -95F, -47F);

		bodyModel[293].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[293].setRotationPoint(-84F, -94F, -31F);

		bodyModel[294].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[294].setRotationPoint(-84F, -94F, -31F);
		bodyModel[294].rotateAngleY = -4.1887902F;

		bodyModel[295].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[295].setRotationPoint(-84F, -94F, -31F);
		bodyModel[295].rotateAngleY = -2.0943951F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[296].setRotationPoint(-86F, -95F, -33F);

		bodyModel[297].addTrapezoid(0F, 0F, 0F, 12, 2, 24, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 588
		bodyModel[297].setRotationPoint(-90F, -89F, -12F);

		bodyModel[298].addTrapezoid(0F, 0F, 0F, 4, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 589
		bodyModel[298].setRotationPoint(-86F, -90F, -2F);

		bodyModel[299].addTrapezoid(0F, 0F, 0F, 20, 8, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 590
		bodyModel[299].setRotationPoint(-94F, -95F, 40F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[300].setRotationPoint(-94F, -95F, 34F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[301].setRotationPoint(-81F, -95F, 34F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[302].setRotationPoint(-75F, -95F, 28F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[303].setRotationPoint(-75F, -95F, 22F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[304].setRotationPoint(-94F, -95F, 28F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,-7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[305].setRotationPoint(-94F, -95F, 22F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[306].setRotationPoint(-87F, -95F, 21F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[307].setRotationPoint(-86F, -95F, 29F);

		bodyModel[308].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[308].setRotationPoint(-84F, -94F, 31F);
		bodyModel[308].rotateAngleY = -2.0943951F;

		bodyModel[309].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[309].setRotationPoint(-84F, -94F, 31F);

		bodyModel[310].addShapeBox(-1F, 0F, -9F, 2, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[310].setRotationPoint(-84F, -94F, 31F);
		bodyModel[310].rotateAngleY = -4.1887902F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F); // Box 602
		bodyModel[311].setRotationPoint(-94F, -95F, -28F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[312].setRotationPoint(-94F, -95F, -34F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[313].setRotationPoint(-87F, -95F, -22F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 6F, 0F, 0F); // Box 605
		bodyModel[314].setRotationPoint(-75F, -95F, -28F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[315].setRotationPoint(-75F, -95F, -34F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 155, 61, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[316].setRotationPoint(84F, -92F, -140F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 130, 36, 230, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[317].setRotationPoint(-50F, -92F, -115F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 130, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[318].setRotationPoint(-50F, -57F, -135F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 130, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[319].setRotationPoint(-50F, -92F, -135F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 138, 8, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[320].setRotationPoint(-54F, -92F, -140F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[321].setRotationPoint(77F, -84F, -140F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[322].setRotationPoint(44F, -84F, -140F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 40, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[323].setRotationPoint(44F, -72F, -140F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 159, 36, 270, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[324].setRotationPoint(80F, -92F, -135F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 58, 53, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		bodyModel[325].setRotationPoint(-14F, -84F, -140F);

		bodyModel[326].addBox(0F, 0F, 0F, 12, 4, 3, 0F); // Box 463
		bodyModel[326].setRotationPoint(29F, -75F, -142F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[327].setRotationPoint(29F, -79F, -142F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 465
		bodyModel[328].setRotationPoint(29F, -71F, -142F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 38, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[329].setRotationPoint(-14F, -84F, -140F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[330].setRotationPoint(-54F, -84F, -140F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 40, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[331].setRotationPoint(-54F, -72F, -140F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[332].setRotationPoint(-21F, -84F, -140F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 463
		bodyModel[333].setRotationPoint(-10F, -71F, -142F);

		bodyModel[334].addBox(0F, 0F, 0F, 12, 4, 3, 0F); // Box 464
		bodyModel[334].setRotationPoint(-10F, -75F, -142F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[335].setRotationPoint(-10F, -79F, -142F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 276, 61, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[336].setRotationPoint(-330F, -92F, 135F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 155, 61, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[337].setRotationPoint(84F, -92F, 135F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 130, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[338].setRotationPoint(-50F, -57F, 115F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 130, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[339].setRotationPoint(-50F, -92F, 115F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 138, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[340].setRotationPoint(-54F, -92F, 135F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[341].setRotationPoint(77F, -84F, 135F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[342].setRotationPoint(44F, -84F, 135F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 40, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[343].setRotationPoint(44F, -72F, 135F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 58, 53, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[344].setRotationPoint(-14F, -84F, 135F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[345].setRotationPoint(-54F, -84F, 135F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 40, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[346].setRotationPoint(-54F, -72F, 135F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[347].setRotationPoint(-21F, -84F, 135F);

		bodyModel[348].addBox(0F, 0F, 0F, 12, 4, 3, 0F); // Box 497
		bodyModel[348].setRotationPoint(29F, -75F, 139F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[349].setRotationPoint(29F, -79F, 139F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 499
		bodyModel[350].setRotationPoint(29F, -71F, 139F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 500
		bodyModel[351].setRotationPoint(-10F, -71F, 139F);

		bodyModel[352].addBox(0F, 0F, 0F, 12, 4, 3, 0F); // Box 501
		bodyModel[352].setRotationPoint(-10F, -75F, 139F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[353].setRotationPoint(-10F, -79F, 139F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 75, 10, 75, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[354].setRotationPoint(-150F, -97F, -130F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 75, 10, 75, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[355].setRotationPoint(-150F, -97F, 55F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 12, 89, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[356].setRotationPoint(8F, -88F, -141F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 12, 89, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[357].setRotationPoint(8F, -88F, 140F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 420

		bodyDoorOpenModel[0].addShapeBox(-1F, -32F, 0F, 9, 32, 20, 0F,-4.0519F, 0F, 0F, -4.0519F, 0F, 0F, -4.0519F, 0F, 0F, -4.0519F, 0F, 0F, -0.72F, 0F, 0F, -7.72F, 0F, 0F, -7.72F, 0F, 0F, -0.72F, 0F, 0F); // Box 420
		bodyDoorOpenModel[0].setRotationPoint(-338F, -17F, -35F);
		bodyDoorOpenModel[0].rotateAngleZ = 2.26892803F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		turretModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 294
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 295
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 296
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 298
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 299
		turretModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 353
		turretModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 354
		turretModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 355
		turretModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 356
		turretModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 357
		turretModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 358
		turretModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 359
		turretModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 360
		turretModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 361
		turretModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 362
		turretModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		turretModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		turretModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		turretModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		turretModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367
		turretModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 368
		turretModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		turretModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		turretModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		turretModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		turretModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373
		turretModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 374
		turretModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 375
		turretModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 376
		turretModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 377
		turretModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 378
		turretModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 379
		turretModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 380
		turretModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 381

		turretModel[0].addShapeBox(0F, 0F, 0F, 70, 32, 40, 0F,0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[0].setRotationPoint(162F, -155F, -100F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 70, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		turretModel[1].setRotationPoint(162F, -135F, -54F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 70, 12, 6, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[2].setRotationPoint(162F, -135F, -60F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 70, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		turretModel[3].setRotationPoint(162F, -135F, -48F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 70, 32, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); // Box 149
		turretModel[4].setRotationPoint(162F, -155F, 60F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 70, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		turretModel[5].setRotationPoint(162F, -135F, 48F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 70, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		turretModel[6].setRotationPoint(162F, -135F, 54F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 70, 12, 6, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		turretModel[7].setRotationPoint(162F, -135F, 42F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 5, 32, 84, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[8].setRotationPoint(227F, -155F, -42F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 70, 30, 40, 0F,20F, 0F, -30F, -5F, -25F, -19.85714F, -5F, -25F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		turretModel[9].setRotationPoint(162F, -185F, -100F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 85, 37, 84, 0F,0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		turretModel[10].setRotationPoint(142F, -160F, -42F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 162, 32, 200, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		turretModel[11].setRotationPoint(0F, -155F, -100F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 162, 30, 200, 0F,0F, 0F, -30F, -20F, 0F, -30F, -20F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		turretModel[12].setRotationPoint(0F, -185F, -100F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 70, 30, 40, 0F,20F, 0F, 0F, -5F, -25F, 0F, -5F, -25F, -19.85714F, 20F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); // Box 182
		turretModel[13].setRotationPoint(162F, -185F, 60F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -1.7647F, 0F, 0F, -1.7647F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		turretModel[14].setRotationPoint(142F, -185F, -54F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, 0F, 0F, 0F, -1.7647F, 0F, 6F, -3.5294F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 6F, -4F, 0F, 0F, -4F, 0F); // Box 184
		turretModel[15].setRotationPoint(142F, -185F, -48F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, 0F, 0F, 6F, -3.5294F, 0F, 0F, -1.7647F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 6F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 185
		turretModel[16].setRotationPoint(142F, -185F, -60F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, -1.7647F, 0F, 0F, -1.7647F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		turretModel[17].setRotationPoint(142F, -185F, 48F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, 0F, 0F, 6F, -3.5294F, 0F, 0F, -1.7647F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 6F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 187
		turretModel[18].setRotationPoint(142F, -185F, 42F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 6, 9, 6, 0F,0F, 0F, 0F, 0F, -1.7647F, 0F, 6F, -3.5294F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 6F, -4F, 0F, 0F, -4F, 0F); // Box 188
		turretModel[19].setRotationPoint(142F, -185F, 54F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 20, 32, 200, 0F,0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Box 189
		turretModel[20].setRotationPoint(-20F, -155F, -100F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 20, 30, 200, 0F,0F, -10F, -35F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -10F, -35F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Box 190
		turretModel[21].setRotationPoint(-20F, -185F, -100F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 30, 20, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		turretModel[22].setRotationPoint(13F, -179F, -110F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 30, 6, 40, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[23].setRotationPoint(13F, -185F, -110F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		turretModel[24].setRotationPoint(43F, -179F, -109F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 30, 20, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[25].setRotationPoint(13F, -179F, 70F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 30, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		turretModel[26].setRotationPoint(13F, -185F, 70F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 1, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[27].setRotationPoint(43F, -179F, 93F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 109, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 353
		turretModel[28].setRotationPoint(14F, -131F, -120F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 70, 3, 240, 0F,0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F); // Box 354
		turretModel[29].setRotationPoint(-56F, -131F, -120F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 109, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		turretModel[30].setRotationPoint(14F, -147F, -120F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 20, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 0F); // Box 356
		turretModel[31].setRotationPoint(123F, -147F, -120F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 70, 16, 0, 0F,0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F); // Box 357
		turretModel[32].setRotationPoint(-56F, -147F, -120F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 0, 16, 86, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[33].setRotationPoint(-56F, -147F, -94F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 109, 3, 20, 0F,0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		turretModel[34].setRotationPoint(14F, -131F, 100F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 109, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		turretModel[35].setRotationPoint(14F, -147F, 120F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 20, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, 0F); // Box 361
		turretModel[36].setRotationPoint(123F, -147F, 120F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 70, 16, 0, 0F,0F, 0F, 26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F); // Box 362
		turretModel[37].setRotationPoint(-56F, -147F, 120F);

		turretModel[38].addTrapezoid(0F, 0F, 0F, 1, 32, 20, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 363
		turretModel[38].setRotationPoint(-21F, -165F, -10F);

		turretModel[39].addTrapezoid(0F, 0F, 0F, 1, 42, 12, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 364
		turretModel[39].setRotationPoint(-21F, -174F, -41F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 0, 16, 86, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[40].setRotationPoint(-56F, -147F, 8F);

		turretModel[41].addTrapezoid(0F, 0F, 0F, 1, 39, 12, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 366
		turretModel[41].setRotationPoint(-57F, -134F, -7F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 114, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[42].setRotationPoint(0F, -201F, -70F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 0, 16, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		turretModel[43].setRotationPoint(0F, -201F, -70F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 0, 16, 96, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		turretModel[44].setRotationPoint(0F, -201F, -26F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 28, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, 28F, 0F, 0F, 0F); // Box 370
		turretModel[45].setRotationPoint(114F, -201F, -70F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 0, 16, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		turretModel[46].setRotationPoint(142F, -201F, -42F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 114, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[47].setRotationPoint(0F, -201F, 70F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 28, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 28F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 28F, 0F, 0F, -28F, 0F, 0F, 0F); // Box 373
		turretModel[48].setRotationPoint(114F, -201F, 70F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 12, 21, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		turretModel[49].setRotationPoint(123F, -185F, -89F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 12, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		turretModel[50].setRotationPoint(123F, -185F, -85F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 12, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 376
		turretModel[51].setRotationPoint(123F, -185F, -81F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 12, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 377
		turretModel[52].setRotationPoint(123F, -185F, 85F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 12, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		turretModel[53].setRotationPoint(123F, -185F, 81F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 12, 21, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[54].setRotationPoint(123F, -185F, 77F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 96, 25, 60, 0F,0F, 0F, 0F, -15F, -6F, 0F, -15F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		turretModel[55].setRotationPoint(142F, -185F, -30F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 11, 25, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F); // Box 381
		turretModel[56].setRotationPoint(227F, -160F, -30F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 300
		barrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 301
		barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 302
		barrelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 303
		barrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 304
		barrelModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 305
		barrelModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 306
		barrelModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 308
		barrelModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 309
		barrelModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 310
		barrelModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 311
		barrelModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 312
		barrelModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 313
		barrelModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 314
		barrelModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 315
		barrelModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 316
		barrelModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 317
		barrelModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 318
		barrelModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 319
		barrelModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 320
		barrelModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 321
		barrelModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 322
		barrelModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 323
		barrelModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 324
		barrelModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 325
		barrelModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 326
		barrelModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 327
		barrelModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 328
		barrelModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 329
		barrelModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 330
		barrelModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 331
		barrelModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 332
		barrelModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 333
		barrelModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 334
		barrelModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 335
		barrelModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 336
		barrelModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 337
		barrelModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 338
		barrelModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 339
		barrelModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 340

		barrelModel[0].addShapeBox(41F, -9F, -3F, 60, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		barrelModel[0].setRotationPoint(145F, -155F, -51F);

		barrelModel[1].addShapeBox(41F, -9F, -9F, 60, 18, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		barrelModel[1].setRotationPoint(145F, -155F, -51F);

		barrelModel[2].addShapeBox(41F, -9F, 3F, 60, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 302
		barrelModel[2].setRotationPoint(145F, -155F, -51F);

		barrelModel[3].addShapeBox(-19F, -9F, -9F, 60, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		barrelModel[3].setRotationPoint(145F, -155F, -51F);

		barrelModel[4].addShapeBox(-19F, -15F, -9F, 60, 6, 18, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		barrelModel[4].setRotationPoint(145F, -155F, -51F);

		barrelModel[5].addShapeBox(-19F, 9F, -9F, 60, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 305
		barrelModel[5].setRotationPoint(145F, -155F, -51F);

		barrelModel[6].addShapeBox(101F, -8.5F, -2.5F, 30, 17, 5, 0F,0F, 0F, 0.33333F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0.33333F, 0F, 0F, 0.33333F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0.33333F); // Box 306
		barrelModel[6].setRotationPoint(145F, -155F, -51F);

		barrelModel[7].addShapeBox(101F, -8.5F, 2.5F, 30, 17, 6, 0F,0F, 0F, -0.33333F, 0F, -2.5F, 0.5F, 0F, -6.5F, -2.5F, 0F, -5.6666F, 0F, 0F, 0F, -0.33333F, 0F, -2.5F, 0.5F, 0F, -6.5F, -2.5F, 0F, -5.6666F, 0F); // Box 308
		barrelModel[7].setRotationPoint(145F, -155F, -51F);

		barrelModel[8].addShapeBox(131F, -6F, -2F, 190, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		barrelModel[8].setRotationPoint(145F, -155F, -51F);

		barrelModel[9].addShapeBox(131F, -6F, -6F, 190, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		barrelModel[9].setRotationPoint(145F, -155F, -51F);

		barrelModel[10].addShapeBox(131F, -6F, 2F, 190, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 311
		barrelModel[10].setRotationPoint(145F, -155F, -51F);

		barrelModel[11].addShapeBox(101F, -8.5F, -8.5F, 30, 17, 6, 0F,0F, -5.6666F, 0F, 0F, -6.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, 0F, -0.33333F, 0F, -5.6666F, 0F, 0F, -6.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, 0F, -0.33333F); // Box 312
		barrelModel[11].setRotationPoint(145F, -155F, -51F);

		barrelModel[12].addShapeBox(321F, -6F, -2F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 313
		barrelModel[12].setRotationPoint(145F, -155F, -51F);

		barrelModel[13].addShapeBox(321F, 4F, -2F, 10, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		barrelModel[13].setRotationPoint(145F, -155F, -51F);

		barrelModel[14].addShapeBox(321F, -2F, -6F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 315
		barrelModel[14].setRotationPoint(145F, -155F, -51F);

		barrelModel[15].addShapeBox(321F, -2F, 4F, 10, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		barrelModel[15].setRotationPoint(145F, -155F, -51F);

		barrelModel[16].addShapeBox(321F, -6F, 4F, 10, 4, 2, 0F,0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		barrelModel[16].setRotationPoint(145F, -155F, -51F);

		barrelModel[17].addShapeBox(321F, 2F, 4F, 10, 4, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 318
		barrelModel[17].setRotationPoint(145F, -155F, -51F);

		barrelModel[18].addShapeBox(321F, 2F, -6F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 3F, 0F, -2F, 3F); // Box 319
		barrelModel[18].setRotationPoint(145F, -155F, -51F);

		barrelModel[19].addShapeBox(321F, -6F, -6F, 10, 4, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 320
		barrelModel[19].setRotationPoint(145F, -155F, -51F);

		barrelModel[20].addShapeBox(-19F, -15F, -9F, 60, 6, 18, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		barrelModel[20].setRotationPoint(145F, -155F, 51F);

		barrelModel[21].addShapeBox(-19F, -9F, -9F, 60, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		barrelModel[21].setRotationPoint(145F, -155F, 51F);

		barrelModel[22].addShapeBox(-19F, 9F, -9F, 60, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 323
		barrelModel[22].setRotationPoint(145F, -155F, 51F);

		barrelModel[23].addShapeBox(41F, -9F, 3F, 60, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 324
		barrelModel[23].setRotationPoint(145F, -155F, 51F);

		barrelModel[24].addShapeBox(41F, -9F, -3F, 60, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		barrelModel[24].setRotationPoint(145F, -155F, 51F);

		barrelModel[25].addShapeBox(41F, -9F, -9F, 60, 18, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		barrelModel[25].setRotationPoint(145F, -155F, 51F);

		barrelModel[26].addShapeBox(101F, -8.5F, -8.5F, 30, 17, 6, 0F,0F, -5.6666F, 0F, 0F, -6.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, 0F, -0.33333F, 0F, -5.6666F, 0F, 0F, -6.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, 0F, -0.33333F); // Box 327
		barrelModel[26].setRotationPoint(145F, -155F, 51F);

		barrelModel[27].addShapeBox(101F, -8.5F, -2.5F, 30, 17, 5, 0F,0F, 0F, 0.33333F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0.33333F, 0F, 0F, 0.33333F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0.33333F); // Box 328
		barrelModel[27].setRotationPoint(145F, -155F, 51F);

		barrelModel[28].addShapeBox(101F, -8.5F, 2.5F, 30, 17, 6, 0F,0F, 0F, -0.33333F, 0F, -2.5F, 0.5F, 0F, -6.5F, -2.5F, 0F, -5.6666F, 0F, 0F, 0F, -0.33333F, 0F, -2.5F, 0.5F, 0F, -6.5F, -2.5F, 0F, -5.6666F, 0F); // Box 329
		barrelModel[28].setRotationPoint(145F, -155F, 51F);

		barrelModel[29].addShapeBox(131F, -6F, 2F, 190, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 330
		barrelModel[29].setRotationPoint(145F, -155F, 51F);

		barrelModel[30].addShapeBox(131F, -6F, -2F, 190, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		barrelModel[30].setRotationPoint(145F, -155F, 51F);

		barrelModel[31].addShapeBox(131F, -6F, -6F, 190, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		barrelModel[31].setRotationPoint(145F, -155F, 51F);

		barrelModel[32].addShapeBox(321F, -6F, -6F, 10, 4, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 333
		barrelModel[32].setRotationPoint(145F, -155F, 51F);

		barrelModel[33].addShapeBox(321F, -2F, -6F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 334
		barrelModel[33].setRotationPoint(145F, -155F, 51F);

		barrelModel[34].addShapeBox(321F, 2F, -6F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 3F, 0F, -2F, 3F); // Box 335
		barrelModel[34].setRotationPoint(145F, -155F, 51F);

		barrelModel[35].addShapeBox(321F, 4F, -2F, 10, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		barrelModel[35].setRotationPoint(145F, -155F, 51F);

		barrelModel[36].addShapeBox(321F, 2F, 4F, 10, 4, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 337
		barrelModel[36].setRotationPoint(145F, -155F, 51F);

		barrelModel[37].addShapeBox(321F, -2F, 4F, 10, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		barrelModel[37].setRotationPoint(145F, -155F, 51F);

		barrelModel[38].addShapeBox(321F, -6F, 4F, 10, 4, 2, 0F,0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		barrelModel[38].setRotationPoint(145F, -155F, 51F);

		barrelModel[39].addShapeBox(321F, -6F, -2F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 340
		barrelModel[39].setRotationPoint(145F, -155F, 51F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 654
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 655
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 656
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 657
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 658
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 659
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 660
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 661
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 662
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 663
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 664
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 665
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 666
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 667
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 668
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 669
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 670
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 671
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 672
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 673
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 674
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 675
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 676
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 677
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 678
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 679
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 680
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 681
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 682
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 683
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 684
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 685
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 686
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 687
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 688
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 689
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 690
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 691
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 692
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 693
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 694
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 695
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 696
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 697
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 698
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 699
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 700
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 701
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 702
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 703
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 704
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 705
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 706
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 707
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 708
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 709
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 710
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 711
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 712
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 713
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 714
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 715
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 716
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 717
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 718
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 719
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 720
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 721
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 722
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 723
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 724
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 725
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 726
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 727
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 728
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 729
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 730
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 731
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 732
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 733
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 734
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 735
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 736
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 737
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 738
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 739
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 740
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 741
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 742
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 743
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 744
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 745
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 746
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 747
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 748
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 749
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 750
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 751
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 752
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 753
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 754
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 755
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 756
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 757
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 758
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 759
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 760
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 761
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 762
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 763
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 764
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 765
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 766
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 767
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 768
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 769
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 770
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 771
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 772
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 773
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 774
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 775
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 776
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 777
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 778
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 779
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 780
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 781
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 782
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 783
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 784
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 785
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 786
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 787
		leftTrackWheelModels[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 788
		leftTrackWheelModels[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 789
		leftTrackWheelModels[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 790
		leftTrackWheelModels[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 791
		leftTrackWheelModels[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 792
		leftTrackWheelModels[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 793
		leftTrackWheelModels[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 794
		leftTrackWheelModels[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 795
		leftTrackWheelModels[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 796
		leftTrackWheelModels[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 797
		leftTrackWheelModels[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 798
		leftTrackWheelModels[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 799
		leftTrackWheelModels[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 800
		leftTrackWheelModels[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 801
		leftTrackWheelModels[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 802
		leftTrackWheelModels[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 803
		leftTrackWheelModels[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 804
		leftTrackWheelModels[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 805
		leftTrackWheelModels[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 806
		leftTrackWheelModels[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 807
		leftTrackWheelModels[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 808
		leftTrackWheelModels[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 809
		leftTrackWheelModels[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 810
		leftTrackWheelModels[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 811
		leftTrackWheelModels[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 812
		leftTrackWheelModels[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 813
		leftTrackWheelModels[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 814
		leftTrackWheelModels[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 815
		leftTrackWheelModels[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 816
		leftTrackWheelModels[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 817
		leftTrackWheelModels[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 818
		leftTrackWheelModels[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 819
		leftTrackWheelModels[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 820
		leftTrackWheelModels[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 821
		leftTrackWheelModels[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 822
		leftTrackWheelModels[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 823
		leftTrackWheelModels[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 824
		leftTrackWheelModels[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 825
		leftTrackWheelModels[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 826
		leftTrackWheelModels[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 827
		leftTrackWheelModels[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 828
		leftTrackWheelModels[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 829
		leftTrackWheelModels[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 830
		leftTrackWheelModels[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 831
		leftTrackWheelModels[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 832
		leftTrackWheelModels[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 833
		leftTrackWheelModels[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 834
		leftTrackWheelModels[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 835
		leftTrackWheelModels[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 836
		leftTrackWheelModels[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 837
		leftTrackWheelModels[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 838
		leftTrackWheelModels[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 839
		leftTrackWheelModels[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 840
		leftTrackWheelModels[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 841
		leftTrackWheelModels[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 842
		leftTrackWheelModels[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 843
		leftTrackWheelModels[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 844
		leftTrackWheelModels[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 845
		leftTrackWheelModels[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 846
		leftTrackWheelModels[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 847
		leftTrackWheelModels[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 848
		leftTrackWheelModels[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 849

		leftTrackWheelModels[0].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		leftTrackWheelModels[0].setRotationPoint(314F, -23F, 55F);

		leftTrackWheelModels[1].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 655
		leftTrackWheelModels[1].setRotationPoint(314F, -23F, 55F);

		leftTrackWheelModels[2].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 656
		leftTrackWheelModels[2].setRotationPoint(314F, -23F, 55F);

		leftTrackWheelModels[3].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 657
		leftTrackWheelModels[3].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[4].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		leftTrackWheelModels[4].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[5].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 659
		leftTrackWheelModels[5].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[6].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 660
		leftTrackWheelModels[6].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[7].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 661
		leftTrackWheelModels[7].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[8].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 662
		leftTrackWheelModels[8].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[9].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 663
		leftTrackWheelModels[9].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[10].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 664
		leftTrackWheelModels[10].setRotationPoint(314F, -23F, 51F);

		leftTrackWheelModels[11].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		leftTrackWheelModels[11].setRotationPoint(314F, -23F, 53F);

		leftTrackWheelModels[12].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		leftTrackWheelModels[12].setRotationPoint(314F, -23F, 53F);

		leftTrackWheelModels[13].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 667
		leftTrackWheelModels[13].setRotationPoint(314F, -23F, 53F);

		leftTrackWheelModels[14].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		leftTrackWheelModels[14].setRotationPoint(260F, -15F, 55F);

		leftTrackWheelModels[15].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 669
		leftTrackWheelModels[15].setRotationPoint(260F, -15F, 55F);

		leftTrackWheelModels[16].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 670
		leftTrackWheelModels[16].setRotationPoint(260F, -15F, 55F);

		leftTrackWheelModels[17].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 671
		leftTrackWheelModels[17].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[18].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		leftTrackWheelModels[18].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[19].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 673
		leftTrackWheelModels[19].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[20].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 674
		leftTrackWheelModels[20].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[21].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 675
		leftTrackWheelModels[21].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[22].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 676
		leftTrackWheelModels[22].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[23].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 677
		leftTrackWheelModels[23].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[24].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 678
		leftTrackWheelModels[24].setRotationPoint(260F, -15F, 51F);

		leftTrackWheelModels[25].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		leftTrackWheelModels[25].setRotationPoint(260F, -15F, 53F);

		leftTrackWheelModels[26].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		leftTrackWheelModels[26].setRotationPoint(260F, -15F, 53F);

		leftTrackWheelModels[27].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 681
		leftTrackWheelModels[27].setRotationPoint(260F, -15F, 53F);

		leftTrackWheelModels[28].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		leftTrackWheelModels[28].setRotationPoint(212F, -15F, 55F);

		leftTrackWheelModels[29].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 683
		leftTrackWheelModels[29].setRotationPoint(212F, -15F, 55F);

		leftTrackWheelModels[30].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 684
		leftTrackWheelModels[30].setRotationPoint(212F, -15F, 55F);

		leftTrackWheelModels[31].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 685
		leftTrackWheelModels[31].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[32].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		leftTrackWheelModels[32].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[33].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 687
		leftTrackWheelModels[33].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[34].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 688
		leftTrackWheelModels[34].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[35].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 689
		leftTrackWheelModels[35].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[36].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 690
		leftTrackWheelModels[36].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[37].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 691
		leftTrackWheelModels[37].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[38].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 692
		leftTrackWheelModels[38].setRotationPoint(212F, -15F, 51F);

		leftTrackWheelModels[39].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		leftTrackWheelModels[39].setRotationPoint(212F, -15F, 53F);

		leftTrackWheelModels[40].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		leftTrackWheelModels[40].setRotationPoint(212F, -15F, 53F);

		leftTrackWheelModels[41].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 695
		leftTrackWheelModels[41].setRotationPoint(212F, -15F, 53F);

		leftTrackWheelModels[42].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		leftTrackWheelModels[42].setRotationPoint(164F, -15F, 55F);

		leftTrackWheelModels[43].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 697
		leftTrackWheelModels[43].setRotationPoint(164F, -15F, 55F);

		leftTrackWheelModels[44].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 698
		leftTrackWheelModels[44].setRotationPoint(164F, -15F, 55F);

		leftTrackWheelModels[45].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 699
		leftTrackWheelModels[45].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[46].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		leftTrackWheelModels[46].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[47].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 701
		leftTrackWheelModels[47].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[48].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 702
		leftTrackWheelModels[48].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[49].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 703
		leftTrackWheelModels[49].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[50].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 704
		leftTrackWheelModels[50].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[51].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 705
		leftTrackWheelModels[51].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[52].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 706
		leftTrackWheelModels[52].setRotationPoint(164F, -15F, 51F);

		leftTrackWheelModels[53].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		leftTrackWheelModels[53].setRotationPoint(164F, -15F, 53F);

		leftTrackWheelModels[54].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		leftTrackWheelModels[54].setRotationPoint(164F, -15F, 53F);

		leftTrackWheelModels[55].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 709
		leftTrackWheelModels[55].setRotationPoint(164F, -15F, 53F);

		leftTrackWheelModels[56].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		leftTrackWheelModels[56].setRotationPoint(116F, -15F, 55F);

		leftTrackWheelModels[57].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 711
		leftTrackWheelModels[57].setRotationPoint(116F, -15F, 55F);

		leftTrackWheelModels[58].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 712
		leftTrackWheelModels[58].setRotationPoint(116F, -15F, 55F);

		leftTrackWheelModels[59].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 713
		leftTrackWheelModels[59].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[60].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		leftTrackWheelModels[60].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[61].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 715
		leftTrackWheelModels[61].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[62].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 716
		leftTrackWheelModels[62].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[63].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 717
		leftTrackWheelModels[63].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[64].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 718
		leftTrackWheelModels[64].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[65].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 719
		leftTrackWheelModels[65].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[66].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 720
		leftTrackWheelModels[66].setRotationPoint(116F, -15F, 51F);

		leftTrackWheelModels[67].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		leftTrackWheelModels[67].setRotationPoint(116F, -15F, 53F);

		leftTrackWheelModels[68].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		leftTrackWheelModels[68].setRotationPoint(116F, -15F, 53F);

		leftTrackWheelModels[69].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 723
		leftTrackWheelModels[69].setRotationPoint(116F, -15F, 53F);

		leftTrackWheelModels[70].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		leftTrackWheelModels[70].setRotationPoint(68F, -15F, 55F);

		leftTrackWheelModels[71].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 725
		leftTrackWheelModels[71].setRotationPoint(68F, -15F, 55F);

		leftTrackWheelModels[72].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 726
		leftTrackWheelModels[72].setRotationPoint(68F, -15F, 55F);

		leftTrackWheelModels[73].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 727
		leftTrackWheelModels[73].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[74].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		leftTrackWheelModels[74].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[75].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 729
		leftTrackWheelModels[75].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[76].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 730
		leftTrackWheelModels[76].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[77].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 731
		leftTrackWheelModels[77].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[78].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 732
		leftTrackWheelModels[78].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[79].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 733
		leftTrackWheelModels[79].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[80].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 734
		leftTrackWheelModels[80].setRotationPoint(68F, -15F, 51F);

		leftTrackWheelModels[81].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		leftTrackWheelModels[81].setRotationPoint(68F, -15F, 53F);

		leftTrackWheelModels[82].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		leftTrackWheelModels[82].setRotationPoint(68F, -15F, 53F);

		leftTrackWheelModels[83].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 737
		leftTrackWheelModels[83].setRotationPoint(68F, -15F, 53F);

		leftTrackWheelModels[84].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 738
		leftTrackWheelModels[84].setRotationPoint(20F, -15F, 55F);

		leftTrackWheelModels[85].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 739
		leftTrackWheelModels[85].setRotationPoint(20F, -15F, 55F);

		leftTrackWheelModels[86].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 740
		leftTrackWheelModels[86].setRotationPoint(20F, -15F, 55F);

		leftTrackWheelModels[87].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 741
		leftTrackWheelModels[87].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[88].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		leftTrackWheelModels[88].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[89].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 743
		leftTrackWheelModels[89].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[90].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 744
		leftTrackWheelModels[90].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[91].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 745
		leftTrackWheelModels[91].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[92].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 746
		leftTrackWheelModels[92].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[93].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 747
		leftTrackWheelModels[93].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[94].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 748
		leftTrackWheelModels[94].setRotationPoint(20F, -15F, 51F);

		leftTrackWheelModels[95].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		leftTrackWheelModels[95].setRotationPoint(20F, -15F, 53F);

		leftTrackWheelModels[96].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		leftTrackWheelModels[96].setRotationPoint(20F, -15F, 53F);

		leftTrackWheelModels[97].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 751
		leftTrackWheelModels[97].setRotationPoint(20F, -15F, 53F);

		leftTrackWheelModels[98].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		leftTrackWheelModels[98].setRotationPoint(-28F, -15F, 55F);

		leftTrackWheelModels[99].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 753
		leftTrackWheelModels[99].setRotationPoint(-28F, -15F, 55F);

		leftTrackWheelModels[100].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 754
		leftTrackWheelModels[100].setRotationPoint(-28F, -15F, 55F);

		leftTrackWheelModels[101].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 755
		leftTrackWheelModels[101].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[102].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		leftTrackWheelModels[102].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[103].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 757
		leftTrackWheelModels[103].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[104].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 758
		leftTrackWheelModels[104].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[105].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 759
		leftTrackWheelModels[105].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[106].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 760
		leftTrackWheelModels[106].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[107].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 761
		leftTrackWheelModels[107].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[108].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 762
		leftTrackWheelModels[108].setRotationPoint(-28F, -15F, 51F);

		leftTrackWheelModels[109].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		leftTrackWheelModels[109].setRotationPoint(-28F, -15F, 53F);

		leftTrackWheelModels[110].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		leftTrackWheelModels[110].setRotationPoint(-28F, -15F, 53F);

		leftTrackWheelModels[111].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 765
		leftTrackWheelModels[111].setRotationPoint(-28F, -15F, 53F);

		leftTrackWheelModels[112].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		leftTrackWheelModels[112].setRotationPoint(-76F, -15F, 55F);

		leftTrackWheelModels[113].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 767
		leftTrackWheelModels[113].setRotationPoint(-76F, -15F, 55F);

		leftTrackWheelModels[114].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 768
		leftTrackWheelModels[114].setRotationPoint(-76F, -15F, 55F);

		leftTrackWheelModels[115].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 769
		leftTrackWheelModels[115].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[116].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		leftTrackWheelModels[116].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[117].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 771
		leftTrackWheelModels[117].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[118].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 772
		leftTrackWheelModels[118].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[119].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 773
		leftTrackWheelModels[119].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[120].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 774
		leftTrackWheelModels[120].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[121].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 775
		leftTrackWheelModels[121].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[122].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 776
		leftTrackWheelModels[122].setRotationPoint(-76F, -15F, 51F);

		leftTrackWheelModels[123].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		leftTrackWheelModels[123].setRotationPoint(-76F, -15F, 53F);

		leftTrackWheelModels[124].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		leftTrackWheelModels[124].setRotationPoint(-76F, -15F, 53F);

		leftTrackWheelModels[125].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 779
		leftTrackWheelModels[125].setRotationPoint(-76F, -15F, 53F);

		leftTrackWheelModels[126].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		leftTrackWheelModels[126].setRotationPoint(-124F, -15F, 55F);

		leftTrackWheelModels[127].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 781
		leftTrackWheelModels[127].setRotationPoint(-124F, -15F, 55F);

		leftTrackWheelModels[128].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 782
		leftTrackWheelModels[128].setRotationPoint(-124F, -15F, 55F);

		leftTrackWheelModels[129].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 783
		leftTrackWheelModels[129].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[130].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		leftTrackWheelModels[130].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[131].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 785
		leftTrackWheelModels[131].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[132].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 786
		leftTrackWheelModels[132].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[133].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 787
		leftTrackWheelModels[133].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[134].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 788
		leftTrackWheelModels[134].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[135].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 789
		leftTrackWheelModels[135].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[136].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 790
		leftTrackWheelModels[136].setRotationPoint(-124F, -15F, 51F);

		leftTrackWheelModels[137].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		leftTrackWheelModels[137].setRotationPoint(-124F, -15F, 53F);

		leftTrackWheelModels[138].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		leftTrackWheelModels[138].setRotationPoint(-124F, -15F, 53F);

		leftTrackWheelModels[139].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 793
		leftTrackWheelModels[139].setRotationPoint(-124F, -15F, 53F);

		leftTrackWheelModels[140].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		leftTrackWheelModels[140].setRotationPoint(-172F, -15F, 55F);

		leftTrackWheelModels[141].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 795
		leftTrackWheelModels[141].setRotationPoint(-172F, -15F, 55F);

		leftTrackWheelModels[142].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 796
		leftTrackWheelModels[142].setRotationPoint(-172F, -15F, 55F);

		leftTrackWheelModels[143].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 797
		leftTrackWheelModels[143].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[144].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		leftTrackWheelModels[144].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[145].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 799
		leftTrackWheelModels[145].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[146].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 800
		leftTrackWheelModels[146].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[147].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 801
		leftTrackWheelModels[147].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[148].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 802
		leftTrackWheelModels[148].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[149].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 803
		leftTrackWheelModels[149].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[150].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 804
		leftTrackWheelModels[150].setRotationPoint(-172F, -15F, 51F);

		leftTrackWheelModels[151].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		leftTrackWheelModels[151].setRotationPoint(-172F, -15F, 53F);

		leftTrackWheelModels[152].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		leftTrackWheelModels[152].setRotationPoint(-172F, -15F, 53F);

		leftTrackWheelModels[153].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 807
		leftTrackWheelModels[153].setRotationPoint(-172F, -15F, 53F);

		leftTrackWheelModels[154].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		leftTrackWheelModels[154].setRotationPoint(-220F, -15F, 55F);

		leftTrackWheelModels[155].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 809
		leftTrackWheelModels[155].setRotationPoint(-220F, -15F, 55F);

		leftTrackWheelModels[156].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 810
		leftTrackWheelModels[156].setRotationPoint(-220F, -15F, 55F);

		leftTrackWheelModels[157].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 811
		leftTrackWheelModels[157].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[158].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		leftTrackWheelModels[158].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[159].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 813
		leftTrackWheelModels[159].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[160].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 814
		leftTrackWheelModels[160].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[161].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 815
		leftTrackWheelModels[161].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[162].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 816
		leftTrackWheelModels[162].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[163].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 817
		leftTrackWheelModels[163].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[164].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 818
		leftTrackWheelModels[164].setRotationPoint(-220F, -15F, 51F);

		leftTrackWheelModels[165].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		leftTrackWheelModels[165].setRotationPoint(-220F, -15F, 53F);

		leftTrackWheelModels[166].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		leftTrackWheelModels[166].setRotationPoint(-220F, -15F, 53F);

		leftTrackWheelModels[167].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 821
		leftTrackWheelModels[167].setRotationPoint(-220F, -15F, 53F);

		leftTrackWheelModels[168].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		leftTrackWheelModels[168].setRotationPoint(-268F, -15F, 55F);

		leftTrackWheelModels[169].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 823
		leftTrackWheelModels[169].setRotationPoint(-268F, -15F, 55F);

		leftTrackWheelModels[170].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 824
		leftTrackWheelModels[170].setRotationPoint(-268F, -15F, 55F);

		leftTrackWheelModels[171].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 825
		leftTrackWheelModels[171].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[172].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		leftTrackWheelModels[172].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[173].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 827
		leftTrackWheelModels[173].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[174].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 828
		leftTrackWheelModels[174].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[175].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 829
		leftTrackWheelModels[175].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[176].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 830
		leftTrackWheelModels[176].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[177].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 831
		leftTrackWheelModels[177].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[178].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 832
		leftTrackWheelModels[178].setRotationPoint(-268F, -15F, 51F);

		leftTrackWheelModels[179].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		leftTrackWheelModels[179].setRotationPoint(-268F, -15F, 53F);

		leftTrackWheelModels[180].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		leftTrackWheelModels[180].setRotationPoint(-268F, -15F, 53F);

		leftTrackWheelModels[181].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 835
		leftTrackWheelModels[181].setRotationPoint(-268F, -15F, 53F);

		leftTrackWheelModels[182].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		leftTrackWheelModels[182].setRotationPoint(-316F, -25F, 55F);

		leftTrackWheelModels[183].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 837
		leftTrackWheelModels[183].setRotationPoint(-316F, -25F, 55F);

		leftTrackWheelModels[184].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 838
		leftTrackWheelModels[184].setRotationPoint(-316F, -25F, 55F);

		leftTrackWheelModels[185].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 839
		leftTrackWheelModels[185].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[186].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		leftTrackWheelModels[186].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[187].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 841
		leftTrackWheelModels[187].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[188].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 842
		leftTrackWheelModels[188].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[189].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 843
		leftTrackWheelModels[189].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[190].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 844
		leftTrackWheelModels[190].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[191].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 845
		leftTrackWheelModels[191].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[192].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 846
		leftTrackWheelModels[192].setRotationPoint(-316F, -25F, 51F);

		leftTrackWheelModels[193].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		leftTrackWheelModels[193].setRotationPoint(-316F, -25F, 53F);

		leftTrackWheelModels[194].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		leftTrackWheelModels[194].setRotationPoint(-316F, -25F, 53F);

		leftTrackWheelModels[195].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 849
		leftTrackWheelModels[195].setRotationPoint(-316F, -25F, 53F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 850
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 851
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 852
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 853
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 854
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 855
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 856
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 857
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 858
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 859
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 860
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 861
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 862
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 863
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 864
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 865
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 866
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 867
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 868
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 869
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 870
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 871
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 872
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 873
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 874
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 875
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 876
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 877
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 878
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 879
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 880
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 881
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 882
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 883
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 884
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 885
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 886
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 887
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 888
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 889
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 890
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 891
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 892
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 893
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 894
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 895
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 896
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 897
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 898
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 899
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 900
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 901
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 902
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 903
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 904
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 905
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 906
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 907
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 908
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 909
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 910
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 911
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 912
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 913
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 914
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 915
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 916
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 917
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 918
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 919
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 920
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 921
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 922
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 923
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 924
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 925
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 926
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 927
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 928
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 929
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 930
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 931
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 932
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 933
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 934
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 935
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 936
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 937
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 938
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 939
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 940
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 941
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 942
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 943
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 944
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 945
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 946
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 947
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 948
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 949
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 950
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 951
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 952
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 953
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 954
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 955
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 956
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 957
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 958
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 959
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 960
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 961
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 962
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 963
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 964
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 965
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 966
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 967
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 968
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 969
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 970
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 971
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 972
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 973
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 974
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 975
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 976
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 977
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 978
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 979
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 980
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 981
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 982
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 983
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 984
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 985
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 986
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 987
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 988
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 989
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 990
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 991
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 992
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 993
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 994
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 995
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 996
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 997
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 998
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 999
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1000
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1001
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1002
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1003
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1004
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1005
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1006
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1007
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1008
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1009
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1010
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1011
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1012
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1013
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1014
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1015
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1016
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1017
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1018
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1019
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1020
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1021
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1022
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1023
		rightTrackWheelModels[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1024
		rightTrackWheelModels[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1025
		rightTrackWheelModels[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1026
		rightTrackWheelModels[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1027
		rightTrackWheelModels[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1028
		rightTrackWheelModels[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1029
		rightTrackWheelModels[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1030
		rightTrackWheelModels[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1031
		rightTrackWheelModels[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1032
		rightTrackWheelModels[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1033
		rightTrackWheelModels[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1034
		rightTrackWheelModels[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1035
		rightTrackWheelModels[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1036
		rightTrackWheelModels[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1037
		rightTrackWheelModels[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1038
		rightTrackWheelModels[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1039
		rightTrackWheelModels[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1040
		rightTrackWheelModels[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1041
		rightTrackWheelModels[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1042
		rightTrackWheelModels[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1043
		rightTrackWheelModels[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1044
		rightTrackWheelModels[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1045

		rightTrackWheelModels[0].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		rightTrackWheelModels[0].setRotationPoint(314F, -23F, -128F);

		rightTrackWheelModels[1].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 851
		rightTrackWheelModels[1].setRotationPoint(314F, -23F, -128F);

		rightTrackWheelModels[2].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 852
		rightTrackWheelModels[2].setRotationPoint(314F, -23F, -128F);

		rightTrackWheelModels[3].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 853
		rightTrackWheelModels[3].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[4].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		rightTrackWheelModels[4].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[5].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 855
		rightTrackWheelModels[5].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[6].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 856
		rightTrackWheelModels[6].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[7].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 857
		rightTrackWheelModels[7].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[8].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 858
		rightTrackWheelModels[8].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[9].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 859
		rightTrackWheelModels[9].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[10].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 860
		rightTrackWheelModels[10].setRotationPoint(314F, -23F, -132F);

		rightTrackWheelModels[11].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 861
		rightTrackWheelModels[11].setRotationPoint(314F, -23F, -130F);

		rightTrackWheelModels[12].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		rightTrackWheelModels[12].setRotationPoint(314F, -23F, -130F);

		rightTrackWheelModels[13].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 863
		rightTrackWheelModels[13].setRotationPoint(314F, -23F, -130F);

		rightTrackWheelModels[14].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		rightTrackWheelModels[14].setRotationPoint(260F, -15F, -128F);

		rightTrackWheelModels[15].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 865
		rightTrackWheelModels[15].setRotationPoint(260F, -15F, -128F);

		rightTrackWheelModels[16].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 866
		rightTrackWheelModels[16].setRotationPoint(260F, -15F, -128F);

		rightTrackWheelModels[17].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 867
		rightTrackWheelModels[17].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[18].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		rightTrackWheelModels[18].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[19].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 869
		rightTrackWheelModels[19].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[20].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 870
		rightTrackWheelModels[20].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[21].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 871
		rightTrackWheelModels[21].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[22].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 872
		rightTrackWheelModels[22].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[23].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 873
		rightTrackWheelModels[23].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[24].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 874
		rightTrackWheelModels[24].setRotationPoint(260F, -15F, -132F);

		rightTrackWheelModels[25].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		rightTrackWheelModels[25].setRotationPoint(260F, -15F, -130F);

		rightTrackWheelModels[26].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		rightTrackWheelModels[26].setRotationPoint(260F, -15F, -130F);

		rightTrackWheelModels[27].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 877
		rightTrackWheelModels[27].setRotationPoint(260F, -15F, -130F);

		rightTrackWheelModels[28].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		rightTrackWheelModels[28].setRotationPoint(212F, -15F, -128F);

		rightTrackWheelModels[29].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 879
		rightTrackWheelModels[29].setRotationPoint(212F, -15F, -128F);

		rightTrackWheelModels[30].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 880
		rightTrackWheelModels[30].setRotationPoint(212F, -15F, -128F);

		rightTrackWheelModels[31].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 881
		rightTrackWheelModels[31].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[32].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		rightTrackWheelModels[32].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[33].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 883
		rightTrackWheelModels[33].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[34].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 884
		rightTrackWheelModels[34].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[35].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 885
		rightTrackWheelModels[35].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[36].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 886
		rightTrackWheelModels[36].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[37].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 887
		rightTrackWheelModels[37].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[38].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 888
		rightTrackWheelModels[38].setRotationPoint(212F, -15F, -132F);

		rightTrackWheelModels[39].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		rightTrackWheelModels[39].setRotationPoint(212F, -15F, -130F);

		rightTrackWheelModels[40].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		rightTrackWheelModels[40].setRotationPoint(212F, -15F, -130F);

		rightTrackWheelModels[41].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 891
		rightTrackWheelModels[41].setRotationPoint(212F, -15F, -130F);

		rightTrackWheelModels[42].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		rightTrackWheelModels[42].setRotationPoint(164F, -15F, -128F);

		rightTrackWheelModels[43].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 893
		rightTrackWheelModels[43].setRotationPoint(164F, -15F, -128F);

		rightTrackWheelModels[44].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 894
		rightTrackWheelModels[44].setRotationPoint(164F, -15F, -128F);

		rightTrackWheelModels[45].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 895
		rightTrackWheelModels[45].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[46].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		rightTrackWheelModels[46].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[47].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 897
		rightTrackWheelModels[47].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[48].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 898
		rightTrackWheelModels[48].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[49].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 899
		rightTrackWheelModels[49].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[50].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 900
		rightTrackWheelModels[50].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[51].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 901
		rightTrackWheelModels[51].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[52].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 902
		rightTrackWheelModels[52].setRotationPoint(164F, -15F, -132F);

		rightTrackWheelModels[53].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		rightTrackWheelModels[53].setRotationPoint(164F, -15F, -130F);

		rightTrackWheelModels[54].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		rightTrackWheelModels[54].setRotationPoint(164F, -15F, -130F);

		rightTrackWheelModels[55].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 905
		rightTrackWheelModels[55].setRotationPoint(164F, -15F, -130F);

		rightTrackWheelModels[56].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		rightTrackWheelModels[56].setRotationPoint(116F, -15F, -128F);

		rightTrackWheelModels[57].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 907
		rightTrackWheelModels[57].setRotationPoint(116F, -15F, -128F);

		rightTrackWheelModels[58].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 908
		rightTrackWheelModels[58].setRotationPoint(116F, -15F, -128F);

		rightTrackWheelModels[59].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 909
		rightTrackWheelModels[59].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[60].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		rightTrackWheelModels[60].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[61].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 911
		rightTrackWheelModels[61].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[62].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 912
		rightTrackWheelModels[62].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[63].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 913
		rightTrackWheelModels[63].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[64].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 914
		rightTrackWheelModels[64].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[65].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 915
		rightTrackWheelModels[65].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[66].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 916
		rightTrackWheelModels[66].setRotationPoint(116F, -15F, -132F);

		rightTrackWheelModels[67].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		rightTrackWheelModels[67].setRotationPoint(116F, -15F, -130F);

		rightTrackWheelModels[68].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		rightTrackWheelModels[68].setRotationPoint(116F, -15F, -130F);

		rightTrackWheelModels[69].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 919
		rightTrackWheelModels[69].setRotationPoint(116F, -15F, -130F);

		rightTrackWheelModels[70].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		rightTrackWheelModels[70].setRotationPoint(68F, -15F, -128F);

		rightTrackWheelModels[71].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 921
		rightTrackWheelModels[71].setRotationPoint(68F, -15F, -128F);

		rightTrackWheelModels[72].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 922
		rightTrackWheelModels[72].setRotationPoint(68F, -15F, -128F);

		rightTrackWheelModels[73].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 923
		rightTrackWheelModels[73].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[74].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		rightTrackWheelModels[74].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[75].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 925
		rightTrackWheelModels[75].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[76].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 926
		rightTrackWheelModels[76].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[77].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 927
		rightTrackWheelModels[77].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[78].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 928
		rightTrackWheelModels[78].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[79].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 929
		rightTrackWheelModels[79].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[80].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 930
		rightTrackWheelModels[80].setRotationPoint(68F, -15F, -132F);

		rightTrackWheelModels[81].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 931
		rightTrackWheelModels[81].setRotationPoint(68F, -15F, -130F);

		rightTrackWheelModels[82].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		rightTrackWheelModels[82].setRotationPoint(68F, -15F, -130F);

		rightTrackWheelModels[83].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 933
		rightTrackWheelModels[83].setRotationPoint(68F, -15F, -130F);

		rightTrackWheelModels[84].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 934
		rightTrackWheelModels[84].setRotationPoint(20F, -15F, -128F);

		rightTrackWheelModels[85].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 935
		rightTrackWheelModels[85].setRotationPoint(20F, -15F, -128F);

		rightTrackWheelModels[86].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 936
		rightTrackWheelModels[86].setRotationPoint(20F, -15F, -128F);

		rightTrackWheelModels[87].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 937
		rightTrackWheelModels[87].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[88].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		rightTrackWheelModels[88].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[89].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 939
		rightTrackWheelModels[89].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[90].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 940
		rightTrackWheelModels[90].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[91].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 941
		rightTrackWheelModels[91].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[92].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 942
		rightTrackWheelModels[92].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[93].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 943
		rightTrackWheelModels[93].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[94].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 944
		rightTrackWheelModels[94].setRotationPoint(20F, -15F, -132F);

		rightTrackWheelModels[95].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
		rightTrackWheelModels[95].setRotationPoint(20F, -15F, -130F);

		rightTrackWheelModels[96].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		rightTrackWheelModels[96].setRotationPoint(20F, -15F, -130F);

		rightTrackWheelModels[97].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 947
		rightTrackWheelModels[97].setRotationPoint(20F, -15F, -130F);

		rightTrackWheelModels[98].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 948
		rightTrackWheelModels[98].setRotationPoint(-28F, -15F, -128F);

		rightTrackWheelModels[99].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 949
		rightTrackWheelModels[99].setRotationPoint(-28F, -15F, -128F);

		rightTrackWheelModels[100].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 950
		rightTrackWheelModels[100].setRotationPoint(-28F, -15F, -128F);

		rightTrackWheelModels[101].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 951
		rightTrackWheelModels[101].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[102].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		rightTrackWheelModels[102].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[103].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 953
		rightTrackWheelModels[103].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[104].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 954
		rightTrackWheelModels[104].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[105].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 955
		rightTrackWheelModels[105].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[106].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 956
		rightTrackWheelModels[106].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[107].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 957
		rightTrackWheelModels[107].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[108].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 958
		rightTrackWheelModels[108].setRotationPoint(-28F, -15F, -132F);

		rightTrackWheelModels[109].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		rightTrackWheelModels[109].setRotationPoint(-28F, -15F, -130F);

		rightTrackWheelModels[110].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		rightTrackWheelModels[110].setRotationPoint(-28F, -15F, -130F);

		rightTrackWheelModels[111].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 961
		rightTrackWheelModels[111].setRotationPoint(-28F, -15F, -130F);

		rightTrackWheelModels[112].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		rightTrackWheelModels[112].setRotationPoint(-76F, -15F, -128F);

		rightTrackWheelModels[113].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 963
		rightTrackWheelModels[113].setRotationPoint(-76F, -15F, -128F);

		rightTrackWheelModels[114].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 964
		rightTrackWheelModels[114].setRotationPoint(-76F, -15F, -128F);

		rightTrackWheelModels[115].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 965
		rightTrackWheelModels[115].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[116].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		rightTrackWheelModels[116].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[117].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 967
		rightTrackWheelModels[117].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[118].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 968
		rightTrackWheelModels[118].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[119].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 969
		rightTrackWheelModels[119].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[120].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 970
		rightTrackWheelModels[120].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[121].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 971
		rightTrackWheelModels[121].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[122].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 972
		rightTrackWheelModels[122].setRotationPoint(-76F, -15F, -132F);

		rightTrackWheelModels[123].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 973
		rightTrackWheelModels[123].setRotationPoint(-76F, -15F, -130F);

		rightTrackWheelModels[124].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		rightTrackWheelModels[124].setRotationPoint(-76F, -15F, -130F);

		rightTrackWheelModels[125].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 975
		rightTrackWheelModels[125].setRotationPoint(-76F, -15F, -130F);

		rightTrackWheelModels[126].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		rightTrackWheelModels[126].setRotationPoint(-124F, -15F, -128F);

		rightTrackWheelModels[127].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 977
		rightTrackWheelModels[127].setRotationPoint(-124F, -15F, -128F);

		rightTrackWheelModels[128].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 978
		rightTrackWheelModels[128].setRotationPoint(-124F, -15F, -128F);

		rightTrackWheelModels[129].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 979
		rightTrackWheelModels[129].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[130].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		rightTrackWheelModels[130].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[131].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 981
		rightTrackWheelModels[131].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[132].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 982
		rightTrackWheelModels[132].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[133].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 983
		rightTrackWheelModels[133].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[134].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 984
		rightTrackWheelModels[134].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[135].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 985
		rightTrackWheelModels[135].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[136].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 986
		rightTrackWheelModels[136].setRotationPoint(-124F, -15F, -132F);

		rightTrackWheelModels[137].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 987
		rightTrackWheelModels[137].setRotationPoint(-124F, -15F, -130F);

		rightTrackWheelModels[138].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		rightTrackWheelModels[138].setRotationPoint(-124F, -15F, -130F);

		rightTrackWheelModels[139].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 989
		rightTrackWheelModels[139].setRotationPoint(-124F, -15F, -130F);

		rightTrackWheelModels[140].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		rightTrackWheelModels[140].setRotationPoint(-172F, -15F, -128F);

		rightTrackWheelModels[141].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 991
		rightTrackWheelModels[141].setRotationPoint(-172F, -15F, -128F);

		rightTrackWheelModels[142].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 992
		rightTrackWheelModels[142].setRotationPoint(-172F, -15F, -128F);

		rightTrackWheelModels[143].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 993
		rightTrackWheelModels[143].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[144].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 994
		rightTrackWheelModels[144].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[145].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 995
		rightTrackWheelModels[145].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[146].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 996
		rightTrackWheelModels[146].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[147].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 997
		rightTrackWheelModels[147].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[148].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 998
		rightTrackWheelModels[148].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[149].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 999
		rightTrackWheelModels[149].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[150].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 1000
		rightTrackWheelModels[150].setRotationPoint(-172F, -15F, -132F);

		rightTrackWheelModels[151].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		rightTrackWheelModels[151].setRotationPoint(-172F, -15F, -130F);

		rightTrackWheelModels[152].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		rightTrackWheelModels[152].setRotationPoint(-172F, -15F, -130F);

		rightTrackWheelModels[153].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1003
		rightTrackWheelModels[153].setRotationPoint(-172F, -15F, -130F);

		rightTrackWheelModels[154].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		rightTrackWheelModels[154].setRotationPoint(-220F, -15F, -128F);

		rightTrackWheelModels[155].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1005
		rightTrackWheelModels[155].setRotationPoint(-220F, -15F, -128F);

		rightTrackWheelModels[156].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 1006
		rightTrackWheelModels[156].setRotationPoint(-220F, -15F, -128F);

		rightTrackWheelModels[157].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 1007
		rightTrackWheelModels[157].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[158].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		rightTrackWheelModels[158].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[159].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1009
		rightTrackWheelModels[159].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[160].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1010
		rightTrackWheelModels[160].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[161].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 1011
		rightTrackWheelModels[161].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[162].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 1012
		rightTrackWheelModels[162].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[163].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 1013
		rightTrackWheelModels[163].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[164].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 1014
		rightTrackWheelModels[164].setRotationPoint(-220F, -15F, -132F);

		rightTrackWheelModels[165].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		rightTrackWheelModels[165].setRotationPoint(-220F, -15F, -130F);

		rightTrackWheelModels[166].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		rightTrackWheelModels[166].setRotationPoint(-220F, -15F, -130F);

		rightTrackWheelModels[167].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1017
		rightTrackWheelModels[167].setRotationPoint(-220F, -15F, -130F);

		rightTrackWheelModels[168].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		rightTrackWheelModels[168].setRotationPoint(-268F, -15F, -128F);

		rightTrackWheelModels[169].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1019
		rightTrackWheelModels[169].setRotationPoint(-268F, -15F, -128F);

		rightTrackWheelModels[170].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 1020
		rightTrackWheelModels[170].setRotationPoint(-268F, -15F, -128F);

		rightTrackWheelModels[171].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 1021
		rightTrackWheelModels[171].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[172].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		rightTrackWheelModels[172].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[173].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1023
		rightTrackWheelModels[173].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[174].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1024
		rightTrackWheelModels[174].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[175].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 1025
		rightTrackWheelModels[175].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[176].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 1026
		rightTrackWheelModels[176].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[177].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 1027
		rightTrackWheelModels[177].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[178].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 1028
		rightTrackWheelModels[178].setRotationPoint(-268F, -15F, -132F);

		rightTrackWheelModels[179].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1029
		rightTrackWheelModels[179].setRotationPoint(-268F, -15F, -130F);

		rightTrackWheelModels[180].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		rightTrackWheelModels[180].setRotationPoint(-268F, -15F, -130F);

		rightTrackWheelModels[181].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1031
		rightTrackWheelModels[181].setRotationPoint(-268F, -15F, -130F);

		rightTrackWheelModels[182].addShapeBox(-6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		rightTrackWheelModels[182].setRotationPoint(-316F, -25F, -128F);

		rightTrackWheelModels[183].addShapeBox(6F, -18F, 0F, 12, 36, 73, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 1033
		rightTrackWheelModels[183].setRotationPoint(-316F, -25F, -128F);

		rightTrackWheelModels[184].addShapeBox(-18F, -18F, 0F, 12, 36, 73, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Box 1034
		rightTrackWheelModels[184].setRotationPoint(-316F, -25F, -128F);

		rightTrackWheelModels[185].addShapeBox(-6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 1035
		rightTrackWheelModels[185].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[186].addShapeBox(-6F, -21F, 0F, 12, 3, 81, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		rightTrackWheelModels[186].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[187].addShapeBox(-21F, -6F, 0F, 3, 12, 81, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1037
		rightTrackWheelModels[187].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[188].addShapeBox(18F, -6F, 0F, 3, 12, 81, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 1038
		rightTrackWheelModels[188].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[189].addShapeBox(6F, 18F, 0F, 12, 3, 81, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F); // Box 1039
		rightTrackWheelModels[189].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[190].addShapeBox(-18F, 18F, 0F, 12, 3, 81, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F); // Box 1040
		rightTrackWheelModels[190].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[191].addShapeBox(6F, -21F, 0F, 12, 3, 81, 0F,-3F, 0F, 0F, 3F, -12F, 0F, 3F, -12F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F); // Box 1041
		rightTrackWheelModels[191].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[192].addShapeBox(-18F, -21F, 0F, 12, 3, 81, 0F,3F, -12F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Box 1042
		rightTrackWheelModels[192].setRotationPoint(-316F, -25F, -132F);

		rightTrackWheelModels[193].addShapeBox(-3F, -1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		rightTrackWheelModels[193].setRotationPoint(-316F, -25F, -130F);

		rightTrackWheelModels[194].addShapeBox(-3F, -3F, 0F, 6, 2, 77, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		rightTrackWheelModels[194].setRotationPoint(-316F, -25F, -130F);

		rightTrackWheelModels[195].addShapeBox(-3F, 1F, 0F, 6, 2, 77, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1045
		rightTrackWheelModels[195].setRotationPoint(-316F, -25F, -130F);
	}

	private void initrightTrackModel_1()
	{

		fancyTrackModel = new ModelRendererTurbo[6];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1047
		fancyTrackModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1048
		fancyTrackModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1049
		fancyTrackModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1050
		fancyTrackModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1051
		fancyTrackModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1052

		fancyTrackModel[0].addShapeBox(-10F, -4F, -42.5F, 20, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047

		fancyTrackModel[1].addShapeBox(-10F, -4F, 18.5F, 20, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048

		fancyTrackModel[2].addShapeBox(-10F, -4F, -12F, 20, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049

		fancyTrackModel[3].addShapeBox(-12F, -2F, -6F, 24, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050

		fancyTrackModel[4].addShapeBox(-12F, -2F, -36.5F, 24, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051

		fancyTrackModel[5].addShapeBox(-12F, -2F, 24.5F, 24, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1052
	}


	private void initGuns()
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[20];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Box 456
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Box 457
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Box 458
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Box 459
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Box 460
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Box 461
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Box 462
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Box 463
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Box 464
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Box 465
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Box 466
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Box 467
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Box 468
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Box 469
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Box 474
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Box 475
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Box 476
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Box 477
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Box 478
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Box 479

		gun_1_Model[2][0].addShapeBox(0F, -6F, -6F, 6, 6, 6, 0F,6F, -2F, -2F, 0F, -2.666F, -2.666F, 0F, -1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 456

		gun_1_Model[2][1].addShapeBox(0F, -6F, 0F, 6, 6, 6, 0F,6F, 0F, 0F, 0F, -1F, 0F, 0F, -2.666F, -2.666F, 6F, -2F, -2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, 0F); // Box 457

		gun_1_Model[2][2].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -1F, 0F, 0F, -2.666F, -2.666F, 6F, -2F, -2F); // Box 458

		gun_1_Model[2][3].addShapeBox(0F, 0F, -6F, 6, 6, 6, 0F,6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -2F, -2F, 0F, -2.666F, -2.666F, 0F, -1F, 0F, 6F, 0F, 0F); // Box 459

		gun_1_Model[2][4].addShapeBox(6F, -4F, -4F, 8, 4, 4, 0F,0F, -1.3333F, -1.3333F, 0F, -2.3333F, -2.3333F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460

		gun_1_Model[2][5].addShapeBox(6F, -4F, 0F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.3333F, -2.3333F, 0F, -1.3333F, -1.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 461

		gun_1_Model[2][6].addShapeBox(6F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.3333F, -2.3333F, 0F, -1.3333F, -1.3333F); // Box 462

		gun_1_Model[2][7].addShapeBox(6F, 0F, -4F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3333F, -1.3333F, 0F, -2.3333F, -2.3333F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 463

		gun_1_Model[2][8].addShapeBox(14F, -4F, -4F, 73, 4, 4, 0F,0F, -2.3333F, -2.3333F, 0F, -3F, -3F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464

		gun_1_Model[2][9].addShapeBox(14F, -4F, 0F, 73, 4, 4, 0F,0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, -3F, 0F, -2.3333F, -2.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F); // Box 465

		gun_1_Model[2][10].addShapeBox(14F, 0F, 0F, 73, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, -3F, 0F, -2.3333F, -2.3333F); // Box 466

		gun_1_Model[2][11].addShapeBox(14F, 0F, -4F, 73, 4, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3333F, -2.3333F, 0F, -3F, -3F, 0F, -2.5F, 0F, 0F, -1.5F, 0F); // Box 467

		gun_1_Model[2][12].addShapeBox(87F, -1.5F, -2F, 5, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 468

		gun_1_Model[2][13].addShapeBox(87F, -1.5F, -2F, 5, 2, 2, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F); // Box 469

		gun_1_Model[2][14].addShapeBox(87F, -0.5F, -2F, 5, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 474

		gun_1_Model[2][15].addShapeBox(87F, -0.5F, 0F, 5, 2, 2, 0F,0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 475

		gun_1_Model[2][16].addShapeBox(87F, -1.5F, 0F, 5, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 476

		gun_1_Model[2][17].addShapeBox(87F, -1.5F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F); // Box 477

		gun_1_Model[2][18].addShapeBox(87F, -0.5F, 0F, 5, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 478

		gun_1_Model[2][19].addShapeBox(87F, -0.5F, -2F, 5, 2, 2, 0F,0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(247F, -103F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		gun_2_Model[0][0].addBox(-3F, -3F, -3F, 6, 6, 6, 0F); // Box 0

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(315F, -73F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[16];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		gun_2_Model[2][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16

		gun_2_Model[2][0].addBox(-5F, -2F, -6F, 10, 4, 3, 0F); // Box 1

		gun_2_Model[2][1].addShapeBox(5F, -2F, -6F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2

		gun_2_Model[2][2].addShapeBox(7F, -2F, -6F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_2_Model[2][3].addTrapezoid(9F, -2F, -6F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 4

		gun_2_Model[2][4].addTrapezoid(11F, -1.5F, -5.5F, 6, 2, 2, 0F, -0.20F, ModelRendererTurbo.MR_LEFT); // Box 5

		gun_2_Model[2][5].addShapeBox(17F, -1F, -5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_2_Model[2][6].addShapeBox(29F, -1F, -5F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 7

		gun_2_Model[2][7].addTrapezoid(-6F, -2F, -6F, 1, 4, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 8

		gun_2_Model[2][8].addShapeBox(17F, -1F, 4F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_2_Model[2][9].addShapeBox(29F, -1F, 4F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 10

		gun_2_Model[2][10].addTrapezoid(11F, -1.5F, 3.5F, 6, 2, 2, 0F, -0.20F, ModelRendererTurbo.MR_LEFT); // Box 11

		gun_2_Model[2][11].addTrapezoid(9F, -2F, 3F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 12

		gun_2_Model[2][12].addShapeBox(7F, -2F, 3F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_2_Model[2][13].addShapeBox(5F, -2F, 3F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[2][14].addBox(-5F, -2F, 3F, 10, 4, 3, 0F); // Box 15

		gun_2_Model[2][15].addTrapezoid(-6F, -2F, 3F, 1, 4, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(315F, -73F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[0];

		gun_8_Model[1] = new ModelRendererTurbo[0];

		gun_8_Model[2] = new ModelRendererTurbo[29];
		gun_8_Model[2][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gun_8_Model[2][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gun_8_Model[2][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gun_8_Model[2][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gun_8_Model[2][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gun_8_Model[2][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gun_8_Model[2][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gun_8_Model[2][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gun_8_Model[2][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		gun_8_Model[2][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		gun_8_Model[2][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		gun_8_Model[2][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		gun_8_Model[2][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gun_8_Model[2][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gun_8_Model[2][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		gun_8_Model[2][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		gun_8_Model[2][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		gun_8_Model[2][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		gun_8_Model[2][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		gun_8_Model[2][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		gun_8_Model[2][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		gun_8_Model[2][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		gun_8_Model[2][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		gun_8_Model[2][23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		gun_8_Model[2][24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		gun_8_Model[2][25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		gun_8_Model[2][26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gun_8_Model[2][27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		gun_8_Model[2][28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31

		gun_8_Model[2][0].addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9, 0F); // Box 0

		gun_8_Model[2][1].addBox(-1.5F, -4.5F, -1.5F, 3, 9, 3, 0F); // Box 1

		gun_8_Model[2][2].addShapeBox(-1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][3].addShapeBox(-1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_8_Model[2][4].addShapeBox(-1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 5

		gun_8_Model[2][5].addShapeBox(-1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_8_Model[2][6].addBox(-4.5F, -1.5F, -1.5F, 9, 3, 3, 0F); // Box 7

		gun_8_Model[2][7].addShapeBox(1.5F, -4.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_8_Model[2][8].addShapeBox(-4.5F, -4.5F, -1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_8_Model[2][9].addShapeBox(-4.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 10

		gun_8_Model[2][10].addShapeBox(1.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 11

		gun_8_Model[2][11].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_8_Model[2][12].addShapeBox(-4.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 13

		gun_8_Model[2][13].addShapeBox(1.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 14

		gun_8_Model[2][14].addShapeBox(1.5F, -1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_8_Model[2][15].addShapeBox(1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_8_Model[2][16].addShapeBox(-4.5F, -4.5F, -4.5F, 3, 3, 3, 0F,-1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_8_Model[2][17].addShapeBox(-4.5F, -4.5F, 1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 18

		gun_8_Model[2][18].addShapeBox(1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 19

		gun_8_Model[2][19].addShapeBox(-4.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F); // Box 20

		gun_8_Model[2][20].addShapeBox(1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F); // Box 21

		gun_8_Model[2][21].addShapeBox(1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 22

		gun_8_Model[2][22].addShapeBox(-4.5F, 1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 23

		gun_8_Model[2][23].addBox(20.5F, -1F, -2F, 4, 2, 4, 0F); // Box 24

		gun_8_Model[2][24].addShapeBox(20.5F, -2F, -2F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_8_Model[2][25].addShapeBox(20.5F, 1F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26

		gun_8_Model[2][26].addShapeBox(3.5F, -0.5F, -1.5F, 17, 1, 3, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 27

		gun_8_Model[2][27].addShapeBox(3.5F, -1.5F, -1.5F, 17, 1, 3, 0F,0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F); // Box 30

		gun_8_Model[2][28].addShapeBox(3.5F, 0.5F, -1.5F, 17, 1, 3, 0F,0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F); // Box 31

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[2])
		{
			gunPart.setRotationPoint(-4F, -73F, -141F);
		}


		registerGunModel("PassengerGun8", gun_8_Model);

		// Passenger 10
		ModelRendererTurbo[][] gun_9_Model = new ModelRendererTurbo[3][];

		gun_9_Model[0] = new ModelRendererTurbo[0];

		gun_9_Model[1] = new ModelRendererTurbo[0];

		gun_9_Model[2] = new ModelRendererTurbo[29];
		gun_9_Model[2][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gun_9_Model[2][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gun_9_Model[2][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gun_9_Model[2][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gun_9_Model[2][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gun_9_Model[2][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gun_9_Model[2][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gun_9_Model[2][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gun_9_Model[2][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		gun_9_Model[2][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		gun_9_Model[2][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		gun_9_Model[2][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		gun_9_Model[2][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gun_9_Model[2][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gun_9_Model[2][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		gun_9_Model[2][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		gun_9_Model[2][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		gun_9_Model[2][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		gun_9_Model[2][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		gun_9_Model[2][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		gun_9_Model[2][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		gun_9_Model[2][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		gun_9_Model[2][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		gun_9_Model[2][23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		gun_9_Model[2][24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		gun_9_Model[2][25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		gun_9_Model[2][26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gun_9_Model[2][27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		gun_9_Model[2][28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31

		gun_9_Model[2][0].addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9, 0F); // Box 0

		gun_9_Model[2][1].addBox(-1.5F, -4.5F, -1.5F, 3, 9, 3, 0F); // Box 1

		gun_9_Model[2][2].addShapeBox(-1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_9_Model[2][3].addShapeBox(-1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_9_Model[2][4].addShapeBox(-1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 5

		gun_9_Model[2][5].addShapeBox(-1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_9_Model[2][6].addBox(-4.5F, -1.5F, -1.5F, 9, 3, 3, 0F); // Box 7

		gun_9_Model[2][7].addShapeBox(1.5F, -4.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_9_Model[2][8].addShapeBox(-4.5F, -4.5F, -1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_9_Model[2][9].addShapeBox(-4.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 10

		gun_9_Model[2][10].addShapeBox(1.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 11

		gun_9_Model[2][11].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_9_Model[2][12].addShapeBox(-4.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 13

		gun_9_Model[2][13].addShapeBox(1.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 14

		gun_9_Model[2][14].addShapeBox(1.5F, -1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_9_Model[2][15].addShapeBox(1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_9_Model[2][16].addShapeBox(-4.5F, -4.5F, -4.5F, 3, 3, 3, 0F,-1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_9_Model[2][17].addShapeBox(-4.5F, -4.5F, 1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 18

		gun_9_Model[2][18].addShapeBox(1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 19

		gun_9_Model[2][19].addShapeBox(-4.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F); // Box 20

		gun_9_Model[2][20].addShapeBox(1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F); // Box 21

		gun_9_Model[2][21].addShapeBox(1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 22

		gun_9_Model[2][22].addShapeBox(-4.5F, 1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 23

		gun_9_Model[2][23].addBox(1.5F, -1F, -2F, 9, 2, 4, 0F); // Box 24

		gun_9_Model[2][24].addShapeBox(1.5F, -2F, -2F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_9_Model[2][25].addShapeBox(1.5F, 1F, -2F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26

		gun_9_Model[2][26].addShapeBox(10.5F, -0.5F, -1.5F, 4, 1, 3, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 27

		gun_9_Model[2][27].addShapeBox(10.5F, -1.5F, -1.5F, 4, 1, 3, 0F,0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F); // Box 30

		gun_9_Model[2][28].addShapeBox(10.5F, 0.5F, -1.5F, 4, 1, 3, 0F,0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F); // Box 31

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[2])
		{
			gunPart.setRotationPoint(35F, -73F, -141F);
		}


		registerGunModel("PassengerGun9", gun_9_Model);

		// Passenger 11
		ModelRendererTurbo[][] gun_10_Model = new ModelRendererTurbo[3][];

		gun_10_Model[0] = new ModelRendererTurbo[0];

		gun_10_Model[1] = new ModelRendererTurbo[0];

		gun_10_Model[2] = new ModelRendererTurbo[29];
		gun_10_Model[2][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gun_10_Model[2][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gun_10_Model[2][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gun_10_Model[2][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gun_10_Model[2][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gun_10_Model[2][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gun_10_Model[2][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gun_10_Model[2][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gun_10_Model[2][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		gun_10_Model[2][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		gun_10_Model[2][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		gun_10_Model[2][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		gun_10_Model[2][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gun_10_Model[2][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gun_10_Model[2][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		gun_10_Model[2][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		gun_10_Model[2][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		gun_10_Model[2][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		gun_10_Model[2][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		gun_10_Model[2][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		gun_10_Model[2][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		gun_10_Model[2][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		gun_10_Model[2][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		gun_10_Model[2][23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		gun_10_Model[2][24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		gun_10_Model[2][25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		gun_10_Model[2][26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gun_10_Model[2][27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		gun_10_Model[2][28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31

		gun_10_Model[2][0].addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9, 0F); // Box 0

		gun_10_Model[2][1].addBox(-1.5F, -4.5F, -1.5F, 3, 9, 3, 0F); // Box 1

		gun_10_Model[2][2].addShapeBox(-1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_10_Model[2][3].addShapeBox(-1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_10_Model[2][4].addShapeBox(-1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 5

		gun_10_Model[2][5].addShapeBox(-1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_10_Model[2][6].addBox(-4.5F, -1.5F, -1.5F, 9, 3, 3, 0F); // Box 7

		gun_10_Model[2][7].addShapeBox(1.5F, -4.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_10_Model[2][8].addShapeBox(-4.5F, -4.5F, -1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_10_Model[2][9].addShapeBox(-4.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 10

		gun_10_Model[2][10].addShapeBox(1.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 11

		gun_10_Model[2][11].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_10_Model[2][12].addShapeBox(-4.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 13

		gun_10_Model[2][13].addShapeBox(1.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 14

		gun_10_Model[2][14].addShapeBox(1.5F, -1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_10_Model[2][15].addShapeBox(1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_10_Model[2][16].addShapeBox(-4.5F, -4.5F, -4.5F, 3, 3, 3, 0F,-1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_10_Model[2][17].addShapeBox(-4.5F, -4.5F, 1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 18

		gun_10_Model[2][18].addShapeBox(1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 19

		gun_10_Model[2][19].addShapeBox(-4.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F); // Box 20

		gun_10_Model[2][20].addShapeBox(1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F); // Box 21

		gun_10_Model[2][21].addShapeBox(1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 22

		gun_10_Model[2][22].addShapeBox(-4.5F, 1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 23

		gun_10_Model[2][23].addBox(20.5F, -1F, -2F, 4, 2, 4, 0F); // Box 24

		gun_10_Model[2][24].addShapeBox(20.5F, -2F, -2F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_10_Model[2][25].addShapeBox(20.5F, 1F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26

		gun_10_Model[2][26].addShapeBox(3.5F, -0.5F, -1.5F, 17, 1, 3, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 27

		gun_10_Model[2][27].addShapeBox(3.5F, -1.5F, -1.5F, 17, 1, 3, 0F,0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F); // Box 30

		gun_10_Model[2][28].addShapeBox(3.5F, 0.5F, -1.5F, 17, 1, 3, 0F,0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F); // Box 31

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_10_Model[2])
		{
			gunPart.setRotationPoint(-4F, -73F, 141F);
		}


		registerGunModel("PassengerGun10", gun_10_Model);

		// Passenger 12
		ModelRendererTurbo[][] gun_11_Model = new ModelRendererTurbo[3][];

		gun_11_Model[0] = new ModelRendererTurbo[0];

		gun_11_Model[1] = new ModelRendererTurbo[0];

		gun_11_Model[2] = new ModelRendererTurbo[29];
		gun_11_Model[2][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gun_11_Model[2][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gun_11_Model[2][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gun_11_Model[2][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gun_11_Model[2][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gun_11_Model[2][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gun_11_Model[2][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		gun_11_Model[2][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		gun_11_Model[2][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		gun_11_Model[2][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		gun_11_Model[2][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		gun_11_Model[2][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		gun_11_Model[2][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gun_11_Model[2][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gun_11_Model[2][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		gun_11_Model[2][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		gun_11_Model[2][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		gun_11_Model[2][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		gun_11_Model[2][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		gun_11_Model[2][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		gun_11_Model[2][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		gun_11_Model[2][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		gun_11_Model[2][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		gun_11_Model[2][23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		gun_11_Model[2][24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		gun_11_Model[2][25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		gun_11_Model[2][26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		gun_11_Model[2][27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		gun_11_Model[2][28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31

		gun_11_Model[2][0].addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9, 0F); // Box 0

		gun_11_Model[2][1].addBox(-1.5F, -4.5F, -1.5F, 3, 9, 3, 0F); // Box 1

		gun_11_Model[2][2].addShapeBox(-1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_11_Model[2][3].addShapeBox(-1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_11_Model[2][4].addShapeBox(-1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 5

		gun_11_Model[2][5].addShapeBox(-1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_11_Model[2][6].addBox(-4.5F, -1.5F, -1.5F, 9, 3, 3, 0F); // Box 7

		gun_11_Model[2][7].addShapeBox(1.5F, -4.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_11_Model[2][8].addShapeBox(-4.5F, -4.5F, -1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_11_Model[2][9].addShapeBox(-4.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 10

		gun_11_Model[2][10].addShapeBox(1.5F, 1.5F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 11

		gun_11_Model[2][11].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_11_Model[2][12].addShapeBox(-4.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 13

		gun_11_Model[2][13].addShapeBox(1.5F, -1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 14

		gun_11_Model[2][14].addShapeBox(1.5F, -1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_11_Model[2][15].addShapeBox(1.5F, -4.5F, -4.5F, 3, 3, 3, 0F,0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_11_Model[2][16].addShapeBox(-4.5F, -4.5F, -4.5F, 3, 3, 3, 0F,-1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_11_Model[2][17].addShapeBox(-4.5F, -4.5F, 1.5F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 18

		gun_11_Model[2][18].addShapeBox(1.5F, -4.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 19

		gun_11_Model[2][19].addShapeBox(-4.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F); // Box 20

		gun_11_Model[2][20].addShapeBox(1.5F, 1.5F, 1.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F); // Box 21

		gun_11_Model[2][21].addShapeBox(1.5F, 1.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1.5F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 22

		gun_11_Model[2][22].addShapeBox(-4.5F, 1.5F, -4.5F, 3, 3, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 23

		gun_11_Model[2][23].addBox(1.5F, -1F, -2F, 9, 2, 4, 0F); // Box 24

		gun_11_Model[2][24].addShapeBox(1.5F, -2F, -2F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_11_Model[2][25].addShapeBox(1.5F, 1F, -2F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26

		gun_11_Model[2][26].addShapeBox(10.5F, -0.5F, -1.5F, 4, 1, 3, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 27

		gun_11_Model[2][27].addShapeBox(10.5F, -1.5F, -1.5F, 4, 1, 3, 0F,0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F); // Box 30

		gun_11_Model[2][28].addShapeBox(10.5F, 0.5F, -1.5F, 4, 1, 3, 0F,0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F); // Box 31

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_11_Model[2])
		{
			gunPart.setRotationPoint(35F, -73F, 141F);
		}


		registerGunModel("PassengerGun11", gun_11_Model);
	}
}