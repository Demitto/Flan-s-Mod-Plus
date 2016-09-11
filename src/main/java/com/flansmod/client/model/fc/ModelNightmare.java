//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNightmare extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNightmare() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[294];
		tailModel = new ModelRendererTurbo[102];
		bayModel = new ModelRendererTurbo[5];
		leftWingModel = new ModelRendererTurbo[234];
		rightWingModel = new ModelRendererTurbo[138];
		yawFlapModel = new ModelRendererTurbo[8];
		pitchFlapLeftModel = new ModelRendererTurbo[8];
		pitchFlapRightModel = new ModelRendererTurbo[8];
		pitchFlapLeftWingModel = new ModelRendererTurbo[11];
		pitchFlapRightWingModel = new ModelRendererTurbo[11];
		skidsModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initskidsModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 301
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 302
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 304
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 305
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 306
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 307
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 308
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 309
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 310
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 312
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 313
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 314
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 427
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 428
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 429
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 430
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 431
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 432
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 433
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 434
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 435
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 436
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 437
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 438
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 439
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 440
		bodyModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 441
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 442
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 443
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 444
		bodyModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 445
		bodyModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 446
		bodyModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 447
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 448
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 450
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 451
		bodyModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 452
		bodyModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 453
		bodyModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 454
		bodyModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 455
		bodyModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 456
		bodyModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 457
		bodyModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 458
		bodyModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 459
		bodyModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 460
		bodyModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 461
		bodyModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 462
		bodyModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 463
		bodyModel[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 464
		bodyModel[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 465
		bodyModel[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 468
		bodyModel[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 469
		bodyModel[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 470
		bodyModel[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 472
		bodyModel[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 474
		bodyModel[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 476
		bodyModel[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 477
		bodyModel[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 478
		bodyModel[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 479
		bodyModel[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 480
		bodyModel[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 481
		bodyModel[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 482
		bodyModel[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 486
		bodyModel[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 487
		bodyModel[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 488
		bodyModel[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 490
		bodyModel[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 492
		bodyModel[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 496
		bodyModel[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 497
		bodyModel[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 498
		bodyModel[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 499
		bodyModel[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 502
		bodyModel[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 503
		bodyModel[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 504
		bodyModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 505
		bodyModel[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 514
		bodyModel[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 515
		bodyModel[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 516
		bodyModel[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 517
		bodyModel[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 520
		bodyModel[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 521
		bodyModel[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 522
		bodyModel[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 523
		bodyModel[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 534
		bodyModel[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 535
		bodyModel[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 536
		bodyModel[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 537
		bodyModel[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 538
		bodyModel[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 539
		bodyModel[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 540
		bodyModel[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 541
		bodyModel[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 542
		bodyModel[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 543
		bodyModel[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 544
		bodyModel[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 545
		bodyModel[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 550
		bodyModel[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 551
		bodyModel[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 554
		bodyModel[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 555
		bodyModel[196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 556
		bodyModel[197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 557
		bodyModel[198] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 558
		bodyModel[199] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 559
		bodyModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 560
		bodyModel[201] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 561
		bodyModel[202] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 562
		bodyModel[203] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 563
		bodyModel[204] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 566
		bodyModel[205] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 567
		bodyModel[206] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 568
		bodyModel[207] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 569
		bodyModel[208] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 570
		bodyModel[209] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 571
		bodyModel[210] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 572
		bodyModel[211] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 573
		bodyModel[212] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 574
		bodyModel[213] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 575
		bodyModel[214] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 577
		bodyModel[215] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 578
		bodyModel[216] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 579
		bodyModel[217] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 580
		bodyModel[218] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 581
		bodyModel[219] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 582
		bodyModel[220] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 583
		bodyModel[221] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 585
		bodyModel[222] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 587
		bodyModel[223] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 588
		bodyModel[224] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 589
		bodyModel[225] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 590
		bodyModel[226] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 591
		bodyModel[227] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 592
		bodyModel[228] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 593
		bodyModel[229] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 594
		bodyModel[230] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 595
		bodyModel[231] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 596
		bodyModel[232] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 597
		bodyModel[233] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 598
		bodyModel[234] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 599
		bodyModel[235] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 600
		bodyModel[236] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 601
		bodyModel[237] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 603
		bodyModel[238] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 604
		bodyModel[239] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 605
		bodyModel[240] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 606
		bodyModel[241] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 607
		bodyModel[242] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 608
		bodyModel[243] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 609
		bodyModel[244] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 610
		bodyModel[245] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 611
		bodyModel[246] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 612
		bodyModel[247] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 613
		bodyModel[248] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 614
		bodyModel[249] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 615
		bodyModel[250] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 616
		bodyModel[251] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 624
		bodyModel[252] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 625
		bodyModel[253] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 626
		bodyModel[254] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 627
		bodyModel[255] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 628
		bodyModel[256] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 629
		bodyModel[257] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 630
		bodyModel[258] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 631
		bodyModel[259] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 632
		bodyModel[260] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 633
		bodyModel[261] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 634
		bodyModel[262] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 635
		bodyModel[263] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 636
		bodyModel[264] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 637
		bodyModel[265] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 638
		bodyModel[266] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 639
		bodyModel[267] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 640
		bodyModel[268] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 641
		bodyModel[269] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 642
		bodyModel[270] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 643
		bodyModel[271] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 644
		bodyModel[272] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 646
		bodyModel[273] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 647
		bodyModel[274] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 648
		bodyModel[275] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 649
		bodyModel[276] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 652
		bodyModel[277] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 653
		bodyModel[278] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 654
		bodyModel[279] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 655
		bodyModel[280] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 656
		bodyModel[281] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 657
		bodyModel[282] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 658
		bodyModel[283] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 659
		bodyModel[284] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 660
		bodyModel[285] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 661
		bodyModel[286] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 662
		bodyModel[287] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 663
		bodyModel[288] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 664
		bodyModel[289] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 665
		bodyModel[290] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 666
		bodyModel[291] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 667
		bodyModel[292] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 668
		bodyModel[293] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 669

		bodyModel[0].addBox(0F, 0F, 0F, 14, 6, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-49F, -19F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 21, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-35F, -34F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-35F, -42F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-32F, -42F, -4F);

		bodyModel[4].addTrapezoid(0F, 0F, 0F, 1, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 5
		bodyModel[4].setRotationPoint(-36F, -42F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,-3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-49F, -22F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 15, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-38F, -34F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,-3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-49F, -22F, 5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 15, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-38F, -34F, 5F);

		bodyModel[9].addTrapezoid(0F, 0F, 0F, 5, 1, 10, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 10
		bodyModel[9].setRotationPoint(-40F, -20F, -5F);

		bodyModel[10].addTrapezoid(0F, 0F, 0F, 5, 1, 10, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 11
		bodyModel[10].setRotationPoint(-44F, -20F, -5F);

		bodyModel[11].addTrapezoid(0F, 0F, 0F, 5, 1, 10, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 12
		bodyModel[11].setRotationPoint(-49F, -20F, -5F);

		bodyModel[12].addTrapezoid(0F, 0F, 0F, 1, 4, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 13
		bodyModel[12].setRotationPoint(-36F, -34F, -5F);

		bodyModel[13].addTrapezoid(0F, 0F, 0F, 1, 6, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 14
		bodyModel[13].setRotationPoint(-36F, -31F, -5F);

		bodyModel[14].addTrapezoid(0F, 0F, 0F, 1, 7, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 15
		bodyModel[14].setRotationPoint(-36F, -26F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 39, 16, 22, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 17
		bodyModel[15].setRotationPoint(-70F, -13F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 131, 16, 28, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-31F, -16F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-90F, -4F, -7F);

		bodyModel[18].addTrapezoid(0F, 0F, 0F, 5, 1, 10, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 22
		bodyModel[18].setRotationPoint(-81F, -5F, -5F);

		bodyModel[19].addTrapezoid(0F, 0F, 0F, 5, 1, 10, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 23
		bodyModel[19].setRotationPoint(-85F, -5F, -5F);

		bodyModel[20].addTrapezoid(0F, 0F, 0F, 5, 1, 10, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 24
		bodyModel[20].setRotationPoint(-90F, -5F, -5F);

		bodyModel[21].addTrapezoid(0F, 0F, 0F, 1, 7, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 25
		bodyModel[21].setRotationPoint(-77F, -11F, -5F);

		bodyModel[22].addTrapezoid(0F, 0F, 0F, 1, 6, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 26
		bodyModel[22].setRotationPoint(-77F, -16F, -5F);

		bodyModel[23].addTrapezoid(0F, 0F, 0F, 1, 4, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 27
		bodyModel[23].setRotationPoint(-77F, -19F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 15, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-79F, -19F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 15, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-79F, -19F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,-3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-90F, -7F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,-3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-90F, -7F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 21, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-76F, -19F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-73F, -27F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(-76F, -27F, -4F);

		bodyModel[31].addTrapezoid(0F, 0F, 0F, 1, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 35
		bodyModel[31].setRotationPoint(-77F, -27F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 13, 28, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(-31F, -42F, -14F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, -14F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-70F, -44F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-72F, -5F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-31F, -44F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[36].setRotationPoint(-72F, -30F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 44
		bodyModel[37].setRotationPoint(-72F, -28F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 45
		bodyModel[38].setRotationPoint(-72F, -28F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 11, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[39].setRotationPoint(-72F, -8F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(-72F, -19F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 8, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(-72F, -27F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[42].setRotationPoint(-48F, -44F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 57
		bodyModel[43].setRotationPoint(-48F, -42F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 58
		bodyModel[44].setRotationPoint(-48F, -42F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[45].setRotationPoint(-48F, -44F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 131, 3, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 60
		bodyModel[46].setRotationPoint(-31F, 0F, -14F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[47].setRotationPoint(-72F, -13F, -13F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[48].setRotationPoint(-72F, -18F, -13F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 39, 14, 6, 0F,0F, -11F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, 5F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, 4F); // Box 59
		bodyModel[49].setRotationPoint(-70F, -24F, -17F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 39, 11, 6, 0F,0F, -11F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, 5F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, 4F); // Box 60
		bodyModel[50].setRotationPoint(-70F, -29F, -17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 131, 8, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[51].setRotationPoint(-31F, -24F, -17F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 131, 5, 34, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[52].setRotationPoint(-31F, -29F, -17F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 39, 14, 3, 0F,0F, -11F, 4F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -11F, -1F, 0F, 5F, 4F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, -4F); // Box 65
		bodyModel[53].setRotationPoint(-70F, -16F, 11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 66
		bodyModel[54].setRotationPoint(-72F, -5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -1F); // Box 67
		bodyModel[55].setRotationPoint(-90F, -5F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[56].setRotationPoint(-72F, -13F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[57].setRotationPoint(-72F, -18F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 39, 14, 6, 0F,0F, -11F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -4F, 0F, 5F, 4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -4F); // Box 70
		bodyModel[58].setRotationPoint(-70F, -24F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 39, 11, 6, 0F,0F, -11F, 4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -11F, -7F, 0F, 5F, 4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -4F); // Box 71
		bodyModel[59].setRotationPoint(-70F, -29F, 11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 8, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 72
		bodyModel[60].setRotationPoint(-90F, -13F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F); // Box 73
		bodyModel[61].setRotationPoint(-90F, -18F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 39, 14, 3, 0F,0F, -11F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 4F); // Box 74
		bodyModel[62].setRotationPoint(-70F, -16F, -14F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[63].setRotationPoint(-90F, -30F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 76
		bodyModel[64].setRotationPoint(-90F, 2F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 77
		bodyModel[65].setRotationPoint(-90F, -5F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 8, 6, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[66].setRotationPoint(-90F, -13F, -13F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 79
		bodyModel[67].setRotationPoint(-90F, -18F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 4, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 80
		bodyModel[68].setRotationPoint(-106F, -4F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -3F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 81
		bodyModel[69].setRotationPoint(-106F, -5F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 82
		bodyModel[70].setRotationPoint(-106F, -10F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 83
		bodyModel[71].setRotationPoint(-106F, -15F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -3F); // Box 84
		bodyModel[72].setRotationPoint(-106F, -5F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 85
		bodyModel[73].setRotationPoint(-106F, -10F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 16, 5, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 86
		bodyModel[74].setRotationPoint(-106F, -15F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 87
		bodyModel[75].setRotationPoint(-114F, -2F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[76].setRotationPoint(-114F, -5F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[77].setRotationPoint(-116F, -10F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-5F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[78].setRotationPoint(-116F, -15F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -4F); // Box 91
		bodyModel[79].setRotationPoint(-114F, -2F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -4F); // Box 92
		bodyModel[80].setRotationPoint(-114F, -5F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F); // Box 93
		bodyModel[81].setRotationPoint(-116F, -10F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F); // Box 94
		bodyModel[82].setRotationPoint(-116F, -15F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,-2F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[83].setRotationPoint(-112F, -18F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 96
		bodyModel[84].setRotationPoint(-112F, -18F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 97
		bodyModel[85].setRotationPoint(-90F, -28F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, -12F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -12F, 2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 2F); // Box 98
		bodyModel[86].setRotationPoint(-106F, -30F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 100
		bodyModel[87].setRotationPoint(-90F, -28F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[88].setRotationPoint(-90F, -30F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -14F, -1F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F); // Box 103
		bodyModel[89].setRotationPoint(-70F, -44F, 5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[90].setRotationPoint(-48F, -44F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[91].setRotationPoint(-90F, -30F, 5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, -12F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -12F, -3F, 0F, 12F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, -2F); // Box 106
		bodyModel[92].setRotationPoint(-106F, -30F, 5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 35, 13, 28, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[93].setRotationPoint(-25F, -42F, -14F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 35, 2, 14, 0F,0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 115
		bodyModel[94].setRotationPoint(-25F, -44F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 90, 13, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[95].setRotationPoint(10F, -42F, -14F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 90, 2, 28, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[96].setRotationPoint(10F, -44F, -14F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[97].setRotationPoint(-118F, -10F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[98].setRotationPoint(-118F, -8F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 304
		bodyModel[99].setRotationPoint(-118F, -6F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[100].setRotationPoint(-140F, -7.5F, 1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 306
		bodyModel[101].setRotationPoint(-122F, -8F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[102].setRotationPoint(-140F, -8.5F, 1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 308
		bodyModel[103].setRotationPoint(-140F, -6.5F, 1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -1.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, -2.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 309
		bodyModel[104].setRotationPoint(-122F, -10F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, -2.5F); // Box 310
		bodyModel[105].setRotationPoint(-122F, -6F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 312
		bodyModel[106].setRotationPoint(-146F, -7.5F, 1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 313
		bodyModel[107].setRotationPoint(-146F, -8.5F, 1.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 314
		bodyModel[108].setRotationPoint(-146F, -6.5F, 1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 44, 15, 3, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[109].setRotationPoint(10F, -58F, -13F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 32, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[110].setRotationPoint(22F, -60F, -13F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 32, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F); // Box 429
		bodyModel[111].setRotationPoint(22F, -60F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 44, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F); // Box 430
		bodyModel[112].setRotationPoint(10F, -60F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 44, 15, 3, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[113].setRotationPoint(10F, -58F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 32, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[114].setRotationPoint(22F, -60F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 32, 2, 9, 0F,12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[115].setRotationPoint(22F, -60F, 1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 44, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F); // Box 434
		bodyModel[116].setRotationPoint(10F, -60F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[117].setRotationPoint(22F, -57F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[118].setRotationPoint(22F, -55F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[119].setRotationPoint(22F, -53F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[120].setRotationPoint(22F, -51F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[121].setRotationPoint(22F, -49F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[122].setRotationPoint(22F, -47F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[123].setRotationPoint(22F, -45F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[124].setRotationPoint(26F, -58F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 44, 16, 22, 0F,0F, 0F, 0F, -12F, -3F, -3F, -12F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 443
		bodyModel[125].setRotationPoint(54F, -60F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 44, 16, 2, 0F,0F, -2F, 0F, -13F, -4F, -3F, -12F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 444
		bodyModel[126].setRotationPoint(54F, -60F, -13F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 44, 16, 2, 0F,0F, 0F, 0F, -12F, -3F, 3F, -13F, -4F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, 0F, 0F, 0F); // Box 445
		bodyModel[127].setRotationPoint(54F, -60F, 11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 40, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 446
		bodyModel[128].setRotationPoint(22F, -61F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 40, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 447
		bodyModel[129].setRotationPoint(22F, -61F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[130].setRotationPoint(23F, -60.5F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 450
		bodyModel[131].setRotationPoint(22F, -60.5F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 451
		bodyModel[132].setRotationPoint(29F, -60.5F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 452
		bodyModel[133].setRotationPoint(40F, -60.5F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[134].setRotationPoint(34F, -60.5F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 454
		bodyModel[135].setRotationPoint(33F, -60.5F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 455
		bodyModel[136].setRotationPoint(51F, -60.5F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[137].setRotationPoint(45F, -60.5F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 457
		bodyModel[138].setRotationPoint(44F, -60.5F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[139].setRotationPoint(-28F, -16F, -17F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[140].setRotationPoint(-28F, -16F, -13F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[141].setRotationPoint(-24F, -16F, -13F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[142].setRotationPoint(-24F, -16F, -17F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[143].setRotationPoint(-20F, -16F, -13F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[144].setRotationPoint(-20F, -16F, -17F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[145].setRotationPoint(-8F, -16F, -13F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[146].setRotationPoint(-8F, -16F, -17F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[147].setRotationPoint(-16F, -16F, -13F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[148].setRotationPoint(-16F, -16F, -17F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[149].setRotationPoint(4F, -16F, -13F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[150].setRotationPoint(0F, -16F, -13F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[151].setRotationPoint(-4F, -16F, -13F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 476
		bodyModel[152].setRotationPoint(-28F, -16F, 13F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[153].setRotationPoint(-28F, -16F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[154].setRotationPoint(-24F, -16F, 11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 479
		bodyModel[155].setRotationPoint(-24F, -16F, 13F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[156].setRotationPoint(-20F, -16F, 11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 481
		bodyModel[157].setRotationPoint(-20F, -16F, 13F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[158].setRotationPoint(-8F, -16F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[159].setRotationPoint(-16F, -16F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 487
		bodyModel[160].setRotationPoint(-16F, -16F, 13F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[161].setRotationPoint(4F, -16F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[162].setRotationPoint(0F, -16F, 11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[163].setRotationPoint(-4F, -16F, 11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[164].setRotationPoint(12F, -16F, 11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 497
		bodyModel[165].setRotationPoint(12F, -16F, 13F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[166].setRotationPoint(16F, -16F, 11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 499
		bodyModel[167].setRotationPoint(16F, -16F, 13F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[168].setRotationPoint(24F, -16F, 11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 503
		bodyModel[169].setRotationPoint(24F, -16F, 13F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[170].setRotationPoint(20F, -16F, 11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 505
		bodyModel[171].setRotationPoint(20F, -16F, 13F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[172].setRotationPoint(12F, -16F, -13F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[173].setRotationPoint(12F, -16F, -17F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[174].setRotationPoint(16F, -16F, -13F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[175].setRotationPoint(16F, -16F, -17F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[176].setRotationPoint(24F, -16F, -13F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[177].setRotationPoint(24F, -16F, -17F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[178].setRotationPoint(20F, -16F, -13F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[179].setRotationPoint(20F, -16F, -17F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[180].setRotationPoint(52F, -16F, -13F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[181].setRotationPoint(52F, -16F, -17F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[182].setRotationPoint(64F, -16F, -13F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[183].setRotationPoint(64F, -16F, -17F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[184].setRotationPoint(60F, -16F, -13F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[185].setRotationPoint(60F, -16F, -17F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[186].setRotationPoint(56F, -16F, -13F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[187].setRotationPoint(56F, -16F, -17F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[188].setRotationPoint(76F, -16F, -13F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[189].setRotationPoint(76F, -16F, -17F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[190].setRotationPoint(72F, -16F, -13F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[191].setRotationPoint(72F, -16F, -17F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[192].setRotationPoint(52F, -16F, 11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 551
		bodyModel[193].setRotationPoint(52F, -16F, 13F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[194].setRotationPoint(64F, -16F, 11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 555
		bodyModel[195].setRotationPoint(64F, -16F, 13F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[196].setRotationPoint(60F, -16F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 557
		bodyModel[197].setRotationPoint(60F, -16F, 13F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[198].setRotationPoint(56F, -16F, 11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 559
		bodyModel[199].setRotationPoint(56F, -16F, 13F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[200].setRotationPoint(76F, -16F, 11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 561
		bodyModel[201].setRotationPoint(76F, -16F, 13F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[202].setRotationPoint(72F, -16F, 11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 563
		bodyModel[203].setRotationPoint(72F, -16F, 13F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[204].setRotationPoint(80F, -16F, -17F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[205].setRotationPoint(84F, -16F, -17F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[206].setRotationPoint(80F, -16F, -13F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[207].setRotationPoint(84F, -16F, -13F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 570
		bodyModel[208].setRotationPoint(80F, -16F, 13F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 571
		bodyModel[209].setRotationPoint(84F, -16F, 13F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[210].setRotationPoint(84F, -16F, 11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[211].setRotationPoint(80F, -16F, 11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 14, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 574
		bodyModel[212].setRotationPoint(-28F, 3F, -13F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 14, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 575
		bodyModel[213].setRotationPoint(-8F, 3F, -13F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 14, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 577
		bodyModel[214].setRotationPoint(12F, 3F, -13F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 14, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 578
		bodyModel[215].setRotationPoint(72F, 3F, -13F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 14, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 579
		bodyModel[216].setRotationPoint(52F, 3F, -13F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 114, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 580
		bodyModel[217].setRotationPoint(-28F, -18F, -18F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 581
		bodyModel[218].setRotationPoint(-26F, -21F, -18F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 114, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 582
		bodyModel[219].setRotationPoint(-28F, -24F, -18F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 114, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[220].setRotationPoint(-28F, -18F, 17F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 114, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[221].setRotationPoint(-28F, -24F, 17F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[222].setRotationPoint(-4F, -16F, -17F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[223].setRotationPoint(0F, -16F, -17F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[224].setRotationPoint(4F, -16F, -17F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 590
		bodyModel[225].setRotationPoint(-8F, -16F, 13F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 591
		bodyModel[226].setRotationPoint(-4F, -16F, 13F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 592
		bodyModel[227].setRotationPoint(0F, -16F, 13F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 593
		bodyModel[228].setRotationPoint(4F, -16F, 13F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 19, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[229].setRotationPoint(-10F, -14F, -20F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[230].setRotationPoint(-11F, -13F, -19.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[231].setRotationPoint(-11F, -9F, -19.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[232].setRotationPoint(-9F, -13F, -20.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[233].setRotationPoint(5F, -13F, -20.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 19, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[234].setRotationPoint(-10F, -14F, 17F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[235].setRotationPoint(-14F, -13F, 17.5F);

		bodyModel[236].addTrapezoid(0F, 0F, 0F, 4, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 601
		bodyModel[236].setRotationPoint(-18F, -13F, 17.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[237].setRotationPoint(-26F, -12.5F, 18F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[238].setRotationPoint(-31F, -12F, 18.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[239].setRotationPoint(-11F, -8F, 17.5F);

		bodyModel[240].addTrapezoid(0F, 0F, 0F, 4, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 606
		bodyModel[240].setRotationPoint(-15F, -8F, 17.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[241].setRotationPoint(-9F, -13F, 20.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[242].setRotationPoint(5F, -13F, 20.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[243].setRotationPoint(-9F, -14.5F, 17.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[244].setRotationPoint(-5F, -14.5F, 17.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[245].setRotationPoint(-1F, -14.5F, 17.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[246].setRotationPoint(3F, -14.5F, 17.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[247].setRotationPoint(-9F, -14.5F, -19.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[248].setRotationPoint(-5F, -14.5F, -19.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[249].setRotationPoint(-1F, -14.5F, -19.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[250].setRotationPoint(3F, -14.5F, -19.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 624
		bodyModel[251].setRotationPoint(-6F, -21F, -18F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 625
		bodyModel[252].setRotationPoint(14F, -21F, -18F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 626
		bodyModel[253].setRotationPoint(34F, -21F, -18F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 627
		bodyModel[254].setRotationPoint(54F, -21F, -18F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 628
		bodyModel[255].setRotationPoint(74F, -21F, -18F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[256].setRotationPoint(-26F, -21F, 17F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[257].setRotationPoint(-6F, -21F, 17F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[258].setRotationPoint(14F, -21F, 17F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[259].setRotationPoint(34F, -21F, 17F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[260].setRotationPoint(54F, -21F, 17F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[261].setRotationPoint(74F, -21F, 17F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 30, 13, 28, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 635
		bodyModel[262].setRotationPoint(100F, -42F, -14F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 30, 2, 14, 0F,0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 636
		bodyModel[263].setRotationPoint(100F, -44F, -7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 30, 5, 34, 0F,0F, 0F, -3F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 637
		bodyModel[264].setRotationPoint(100F, -29F, -17F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 30, 8, 34, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 638
		bodyModel[265].setRotationPoint(100F, -24F, -17F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 30, 16, 34, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -3F); // Box 639
		bodyModel[266].setRotationPoint(100F, -16F, -17F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 30, 3, 28, 0F,0F, 0F, 0F, 0F, 9F, -2F, 0F, 9F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -3F); // Box 640
		bodyModel[267].setRotationPoint(100F, 0F, -14F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 30, 9, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[268].setRotationPoint(130F, -42F, -13F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 30, 9, 26, 0F,0F, -2F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F); // Box 642
		bodyModel[269].setRotationPoint(130F, -18F, -13F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 30, 8, 26, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 643
		bodyModel[270].setRotationPoint(130F, -33F, -13F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 30, 9, 26, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F); // Box 644
		bodyModel[271].setRotationPoint(130F, -25F, -13F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 30, 2, 14, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[272].setRotationPoint(130F, -44F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 30, 2, 14, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 2F); // Box 647
		bodyModel[273].setRotationPoint(130F, -9F, -7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 20, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[274].setRotationPoint(160F, -44F, -5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -9F, 0F, -2F, 0F, 0F, -2F); // Box 649
		bodyModel[275].setRotationPoint(160F, -44F, 5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 11, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 652
		bodyModel[276].setRotationPoint(160F, -36F, 11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[277].setRotationPoint(160F, -29F, 11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 11, 7, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[278].setRotationPoint(160F, -22F, 11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, -9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 0F, -8F, 0F); // Box 655
		bodyModel[279].setRotationPoint(160F, -15F, 5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 20, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[280].setRotationPoint(160F, -9F, -5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F,0F, -8F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 657
		bodyModel[281].setRotationPoint(160F, -44F, -13F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 11, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[282].setRotationPoint(160F, -36F, -13F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[283].setRotationPoint(160F, -29F, -13F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 11, 7, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[284].setRotationPoint(160F, -22F, -13F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F,0F, 0F, -2F, -9F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[285].setRotationPoint(160F, -15F, -13F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[286].setRotationPoint(162F, -40.5F, -9F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		bodyModel[287].setRotationPoint(162F, -36.5F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		bodyModel[288].setRotationPoint(162F, -32.5F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[289].setRotationPoint(162F, -28.5F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		bodyModel[290].setRotationPoint(162F, -24.5F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[291].setRotationPoint(162F, -20.5F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		bodyModel[292].setRotationPoint(162F, -16.5F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[293].setRotationPoint(162F, -12.5F, -8F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 692
		tailModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 693
		tailModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 694
		tailModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 695
		tailModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 696
		tailModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 697
		tailModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 698
		tailModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 699
		tailModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 700
		tailModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 701
		tailModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 702
		tailModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 703
		tailModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 704
		tailModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 705
		tailModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 706
		tailModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 707
		tailModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 708
		tailModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 709
		tailModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 652
		tailModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 653
		tailModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 654
		tailModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 672
		tailModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 681
		tailModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 698
		tailModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 699
		tailModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 700
		tailModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 701
		tailModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 702
		tailModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 703
		tailModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 704
		tailModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 705
		tailModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 706
		tailModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 707
		tailModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 716
		tailModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 717
		tailModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 718
		tailModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 719
		tailModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 720
		tailModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 721
		tailModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 722
		tailModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 723
		tailModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 724
		tailModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 725
		tailModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 734
		tailModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 735
		tailModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 736
		tailModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 737
		tailModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 738
		tailModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 739
		tailModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 740
		tailModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 741
		tailModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 742
		tailModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 743
		tailModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 744
		tailModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 745
		tailModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 746
		tailModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 747
		tailModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 748
		tailModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 749
		tailModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 750
		tailModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 814
		tailModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 815
		tailModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 816
		tailModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 817
		tailModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 818
		tailModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 819
		tailModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 770
		tailModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 771
		tailModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 772
		tailModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 773
		tailModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 774
		tailModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 775
		tailModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 776
		tailModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 777
		tailModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 778
		tailModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 779
		tailModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 780
		tailModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 781
		tailModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 782
		tailModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 783
		tailModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 784
		tailModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 785
		tailModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 786
		tailModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 787
		tailModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 788
		tailModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 789
		tailModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 790
		tailModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 791
		tailModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 792
		tailModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 793
		tailModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 794
		tailModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 795
		tailModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 796
		tailModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 797
		tailModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 798
		tailModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 799
		tailModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 800
		tailModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 804
		tailModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 805
		tailModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 806
		tailModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 807
		tailModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 808

		tailModel[0].addShapeBox(0F, 0F, 0F, 67, 6, 27, 0F,-67F, 0F, 12F, 0F, 0F, -6F, -34F, 0F, 1F, 0F, 0F, 0F, -67F, 0F, 12F, 0F, 0F, -6F, -34F, 0F, 1F, 0F, 0F, 0F); // Box 692
		tailModel[0].setRotationPoint(130F, -25F, -40F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 17, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		tailModel[1].setRotationPoint(197F, -25F, -52F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 17, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		tailModel[2].setRotationPoint(197F, -39F, -52F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		tailModel[3].setRotationPoint(197F, -35F, -46F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		tailModel[4].setRotationPoint(200F, -35F, -46F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		tailModel[5].setRotationPoint(204.5F, -35F, -46F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		tailModel[6].setRotationPoint(209F, -35F, -46F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		tailModel[7].setRotationPoint(212F, -35F, -46F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 17, 24, 24, 0F,0F, 0F, -24F, 0F, 0F, -24F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F); // Box 700
		tailModel[8].setRotationPoint(197F, -63F, -52F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 67, 6, 26, 0F,0F, 0F, 0F, -40F, 0F, 1F, 0F, 0F, -6F, -67F, 0F, 12F, 0F, 0F, 0F, -40F, 0F, 1F, 0F, 0F, -6F, -67F, 0F, 12F); // Box 701
		tailModel[9].setRotationPoint(130F, -25F, 14F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 17, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		tailModel[10].setRotationPoint(197F, -25F, 34F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 17, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		tailModel[11].setRotationPoint(197F, -39F, 46F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		tailModel[12].setRotationPoint(197F, -35F, 40F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		tailModel[13].setRotationPoint(200F, -35F, 40F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		tailModel[14].setRotationPoint(204.5F, -35F, 40F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		tailModel[15].setRotationPoint(209F, -35F, 40F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 2, 10, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		tailModel[16].setRotationPoint(212F, -35F, 40F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 17, 24, 24, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		tailModel[17].setRotationPoint(197F, -63F, 28F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 4, 6, 39, 0F,-67F, -2F, 0F, 67F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -67F, -2F, 0F, 67F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 652
		tailModel[18].setRotationPoint(126F, -25F, -52F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 4, 6, 38, 0F,0F, -2F, 0F, 0F, 0F, 0F, 67F, 0F, 0F, -67F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 67F, 0F, 0F, -67F, -2F, 0F); // Box 653
		tailModel[19].setRotationPoint(126F, -25F, 14F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		tailModel[20].setRotationPoint(197F, -63F, -28F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		tailModel[21].setRotationPoint(197F, -63F, 27F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		tailModel[22].setRotationPoint(197F, -63F, -21F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		tailModel[23].setRotationPoint(197F, -63F, 20F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		tailModel[24].setRotationPoint(197F, -63F, -14F);

		tailModel[25].addShapeBox(-12.5F, -3.5F, 0F, 34, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		tailModel[25].setRotationPoint(199.5F, -60F, -13F);

		tailModel[26].addShapeBox(-9.5F, -2.5F, 0F, 31, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		tailModel[26].setRotationPoint(199.5F, -60F, -13F);

		tailModel[27].addShapeBox(-9.5F, 2.5F, 1F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		tailModel[27].setRotationPoint(199.5F, -60F, -13F);

		tailModel[28].addShapeBox(-9.5F, -2.5F, 5F, 31, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		tailModel[28].setRotationPoint(199.5F, -60F, -13F);

		tailModel[29].addShapeBox(-8.5F, -2.5F, 1F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		tailModel[29].setRotationPoint(205.5F, -60F, -13F);

		tailModel[30].addShapeBox(-10.5F, 0F, 1.5F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 705
		tailModel[30].setRotationPoint(205.5F, -60F, -13F);

		tailModel[31].addShapeBox(-10.5F, -2F, 1.5F, 29, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		tailModel[31].setRotationPoint(205.5F, -60F, -13F);

		tailModel[32].addShapeBox(-10.5F, -1F, 1.5F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		tailModel[32].setRotationPoint(205.5F, -60F, -13F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		tailModel[33].setRotationPoint(197F, -63F, -7F);

		tailModel[34].addShapeBox(-12.5F, -3.5F, 0F, 34, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		tailModel[34].setRotationPoint(199.5F, -60F, 7F);

		tailModel[35].addShapeBox(-8.5F, -2.5F, 1F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		tailModel[35].setRotationPoint(205.5F, -60F, 7F);

		tailModel[36].addShapeBox(-9.5F, -2.5F, 0F, 31, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		tailModel[36].setRotationPoint(199.5F, -60F, 7F);

		tailModel[37].addShapeBox(-10.5F, 0F, 1.5F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 720
		tailModel[37].setRotationPoint(205.5F, -60F, 7F);

		tailModel[38].addShapeBox(-10.5F, -1F, 1.5F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		tailModel[38].setRotationPoint(205.5F, -60F, 7F);

		tailModel[39].addShapeBox(-10.5F, -2F, 1.5F, 29, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		tailModel[39].setRotationPoint(205.5F, -60F, 7F);

		tailModel[40].addShapeBox(-9.5F, -2.5F, 5F, 31, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		tailModel[40].setRotationPoint(199.5F, -60F, 7F);

		tailModel[41].addShapeBox(-9.5F, 2.5F, 1F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		tailModel[41].setRotationPoint(199.5F, -60F, 7F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		tailModel[42].setRotationPoint(197F, -63F, 13F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		tailModel[43].setRotationPoint(197F, -63F, 6F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 19, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		tailModel[44].setRotationPoint(196F, -64F, -6F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 736
		tailModel[45].setRotationPoint(192F, -64F, -6F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 737
		tailModel[46].setRotationPoint(192F, -64F, 0F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 738
		tailModel[47].setRotationPoint(190F, -61.5F, -3.5F);

		tailModel[48].addTrapezoid(0F, 0F, 0F, 4, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 739
		tailModel[48].setRotationPoint(186F, -61.5F, -3.5F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		tailModel[49].setRotationPoint(190F, -61.5F, 0.5F);

		tailModel[50].addTrapezoid(0F, 0F, 0F, 4, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 741
		tailModel[50].setRotationPoint(186F, -61.5F, 0.5F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		tailModel[51].setRotationPoint(215F, -64F, -6F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		tailModel[52].setRotationPoint(215F, -57F, -6F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		tailModel[53].setRotationPoint(215F, -63F, -6F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		tailModel[54].setRotationPoint(215F, -63F, 5F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		tailModel[55].setRotationPoint(214.5F, -63F, -4.5F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		tailModel[56].setRotationPoint(214.5F, -63F, -2.5F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		tailModel[57].setRotationPoint(214.5F, -63F, -0.5F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		tailModel[58].setRotationPoint(214.5F, -63F, 1.5F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		tailModel[59].setRotationPoint(214.5F, -63F, 3.5F);

		tailModel[60].addShapeBox(-12.5F, -3.5F, 0F, 22, 4, 2, 0F,-6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		tailModel[60].setRotationPoint(205.5F, -64F, -11F);

		tailModel[61].addShapeBox(-12.5F, -3.5F, 0F, 22, 4, 2, 0F,-6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		tailModel[61].setRotationPoint(205.5F, -64F, 9F);

		tailModel[62].addShapeBox(-12.5F, -3F, 0F, 22, 2, 2, 0F,-6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		tailModel[62].setRotationPoint(205.5F, -63F, 2F);

		tailModel[63].addShapeBox(-12.5F, -3F, 0F, 22, 2, 2, 0F,-6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		tailModel[63].setRotationPoint(205.5F, -63F, -4F);

		tailModel[64].addShapeBox(-10.5F, -1F, 1.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818
		tailModel[64].setRotationPoint(193.5F, -60F, 8F);

		tailModel[65].addShapeBox(-10.5F, -1F, -1.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		tailModel[65].setRotationPoint(193.5F, -60F, -9F);

		tailModel[66].addShapeBox(0F, -1F, 2F, 3, 1, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		tailModel[66].setRotationPoint(198.5F, -39F, -52F);
		tailModel[66].rotateAngleX = 0.78539816F;

		tailModel[67].addShapeBox(0F, -1F, 2F, 3, 1, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		tailModel[67].setRotationPoint(209.5F, -39F, -52F);
		tailModel[67].rotateAngleX = 0.78539816F;

		tailModel[68].addShapeBox(0F, -1F, 2F, 2, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		tailModel[68].setRotationPoint(202.5F, -39F, -52F);
		tailModel[68].rotateAngleX = 0.78539816F;

		tailModel[69].addShapeBox(0F, -1F, 2F, 2, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		tailModel[69].setRotationPoint(206.5F, -39F, -52F);
		tailModel[69].rotateAngleX = 0.78539816F;

		tailModel[70].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 774
		tailModel[70].setRotationPoint(199F, -36F, -54F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 775
		tailModel[71].setRotationPoint(203F, -36F, -54F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 776
		tailModel[72].setRotationPoint(209F, -34F, -54F);

		tailModel[73].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 777
		tailModel[73].setRotationPoint(197F, -32.5F, -54F);

		tailModel[74].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 778
		tailModel[74].setRotationPoint(197F, -28.5F, -54F);

		tailModel[75].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 779
		tailModel[75].setRotationPoint(191F, -32F, -53.5F);

		tailModel[76].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 780
		tailModel[76].setRotationPoint(194F, -28F, -53.5F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 781
		tailModel[77].setRotationPoint(199F, -36F, 52F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 782
		tailModel[78].setRotationPoint(203F, -36F, 52F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 783
		tailModel[79].setRotationPoint(209F, -34F, 52F);

		tailModel[80].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 784
		tailModel[80].setRotationPoint(197F, -32.5F, 52F);

		tailModel[81].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 785
		tailModel[81].setRotationPoint(197F, -28.5F, 52F);

		tailModel[82].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 786
		tailModel[82].setRotationPoint(191F, -32F, 52.5F);

		tailModel[83].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 787
		tailModel[83].setRotationPoint(194F, -28F, 52.5F);

		tailModel[84].addShapeBox(0F, -1F, -32F, 3, 1, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		tailModel[84].setRotationPoint(198.5F, -39F, 52F);
		tailModel[84].rotateAngleX = -0.78539816F;

		tailModel[85].addShapeBox(0F, -1F, -32F, 3, 1, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		tailModel[85].setRotationPoint(209.5F, -39F, 52F);
		tailModel[85].rotateAngleX = -0.78539816F;

		tailModel[86].addShapeBox(0F, -1F, -18F, 2, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		tailModel[86].setRotationPoint(202.5F, -39F, 52F);
		tailModel[86].rotateAngleX = -0.78539816F;

		tailModel[87].addShapeBox(0F, -1F, -18F, 2, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		tailModel[87].setRotationPoint(206.5F, -39F, 52F);
		tailModel[87].rotateAngleX = -0.78539816F;

		tailModel[88].addShapeBox(0F, 0F, 0F, 79, 5, 27, 0F,0F, 0F, -25F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 792
		tailModel[88].setRotationPoint(98F, -24.5F, -40F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 79, 5, 2, 0F,3F, -1.5F, -25F, 1F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 25F, 3F, -1.5F, -25F, 1F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 25F); // Box 793
		tailModel[89].setRotationPoint(98F, -24.5F, -42F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 79, 5, 27, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F); // Box 794
		tailModel[90].setRotationPoint(98F, -24.5F, 13F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 79, 5, 2, 0F,0F, 0F, 25F, 0F, 0F, 0F, 1F, -1.5F, 1F, 3F, -1.5F, -25F, 0F, 0F, 25F, 0F, 0F, 0F, 1F, -1.5F, 1F, 3F, -1.5F, -25F); // Box 795
		tailModel[91].setRotationPoint(98F, -24.5F, 40F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 30, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F); // Box 796
		tailModel[92].setRotationPoint(120F, -23F, -34F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		tailModel[93].setRotationPoint(120F, -24F, -34F);

		tailModel[94].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		tailModel[94].setRotationPoint(114F, -24F, -28F);

		tailModel[95].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 799
		tailModel[95].setRotationPoint(120F, -21F, -34F);

		tailModel[96].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 800
		tailModel[96].setRotationPoint(114F, -21F, -28F);

		tailModel[97].addShapeBox(0F, 0F, 0F, 30, 2, 14, 0F,15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		tailModel[97].setRotationPoint(120F, -23F, 20F);

		tailModel[98].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		tailModel[98].setRotationPoint(120F, -24F, 32F);

		tailModel[99].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		tailModel[99].setRotationPoint(114F, -24F, 26F);

		tailModel[100].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 807
		tailModel[100].setRotationPoint(120F, -21F, 32F);

		tailModel[101].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 808
		tailModel[101].setRotationPoint(114F, -21F, 26F);
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bayModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bayModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bayModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 220
		bayModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 221

		bayModel[0].addShapeBox(0F, -2F, -1F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		bayModel[0].setRotationPoint(-98F, 2F, 0F);

		bayModel[1].addShapeBox(5F, -1F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bayModel[1].setRotationPoint(-98F, 2F, 0F);

		bayModel[2].addShapeBox(15F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bayModel[2].setRotationPoint(-98F, 2F, 0F);

		bayModel[3].addShapeBox(13F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bayModel[3].setRotationPoint(-98F, 2F, 0F);

		bayModel[4].addShapeBox(11F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bayModel[4].setRotationPoint(-98F, 2F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		leftWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		leftWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		leftWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		leftWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		leftWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		leftWingModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		leftWingModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		leftWingModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		leftWingModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		leftWingModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		leftWingModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		leftWingModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		leftWingModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		leftWingModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		leftWingModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		leftWingModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		leftWingModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135
		leftWingModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		leftWingModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		leftWingModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		leftWingModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		leftWingModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		leftWingModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		leftWingModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		leftWingModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		leftWingModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		leftWingModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		leftWingModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		leftWingModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		leftWingModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 156
		leftWingModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		leftWingModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 158
		leftWingModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		leftWingModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		leftWingModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		leftWingModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		leftWingModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		leftWingModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		leftWingModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 165
		leftWingModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		leftWingModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		leftWingModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		leftWingModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		leftWingModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		leftWingModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		leftWingModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		leftWingModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		leftWingModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		leftWingModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		leftWingModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		leftWingModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		leftWingModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		leftWingModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		leftWingModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181
		leftWingModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		leftWingModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		leftWingModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		leftWingModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		leftWingModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		leftWingModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200
		leftWingModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201
		leftWingModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202
		leftWingModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		leftWingModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		leftWingModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		leftWingModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		leftWingModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		leftWingModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		leftWingModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		leftWingModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		leftWingModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		leftWingModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		leftWingModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		leftWingModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 214
		leftWingModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 215
		leftWingModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 216
		leftWingModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 217
		leftWingModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 218
		leftWingModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 219
		leftWingModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 220
		leftWingModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 221
		leftWingModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 222
		leftWingModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		leftWingModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 224
		leftWingModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 225
		leftWingModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 226
		leftWingModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		leftWingModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		leftWingModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		leftWingModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		leftWingModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 231
		leftWingModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		leftWingModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		leftWingModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		leftWingModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		leftWingModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		leftWingModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		leftWingModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 238
		leftWingModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		leftWingModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		leftWingModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 241
		leftWingModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		leftWingModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 222
		leftWingModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		leftWingModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 224
		leftWingModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		leftWingModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		leftWingModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		leftWingModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		leftWingModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 231
		leftWingModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		leftWingModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		leftWingModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		leftWingModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		leftWingModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		leftWingModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		leftWingModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 238
		leftWingModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		leftWingModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		leftWingModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 241
		leftWingModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		leftWingModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		leftWingModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		leftWingModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		leftWingModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 246
		leftWingModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		leftWingModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 248
		leftWingModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 249
		leftWingModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		leftWingModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		leftWingModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 252
		leftWingModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 253
		leftWingModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 254
		leftWingModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 255
		leftWingModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 256
		leftWingModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257
		leftWingModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 258
		leftWingModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 259
		leftWingModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 260
		leftWingModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 261
		leftWingModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 262
		leftWingModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 311
		leftWingModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 315
		leftWingModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 316
		leftWingModel[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 317
		leftWingModel[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 318
		leftWingModel[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 319
		leftWingModel[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 325
		leftWingModel[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 326
		leftWingModel[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 327
		leftWingModel[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 332
		leftWingModel[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 333
		leftWingModel[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 334
		leftWingModel[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 335
		leftWingModel[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 336
		leftWingModel[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 341
		leftWingModel[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 342
		leftWingModel[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 345
		leftWingModel[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 349
		leftWingModel[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 350
		leftWingModel[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 351
		leftWingModel[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 352
		leftWingModel[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 353
		leftWingModel[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 354
		leftWingModel[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 355
		leftWingModel[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 356
		leftWingModel[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 357
		leftWingModel[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 358
		leftWingModel[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 359
		leftWingModel[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 360
		leftWingModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 361
		leftWingModel[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 362
		leftWingModel[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		leftWingModel[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		leftWingModel[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		leftWingModel[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		leftWingModel[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367
		leftWingModel[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 368
		leftWingModel[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		leftWingModel[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		leftWingModel[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		leftWingModel[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		leftWingModel[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373
		leftWingModel[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 374
		leftWingModel[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 375
		leftWingModel[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 376
		leftWingModel[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 377
		leftWingModel[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 378
		leftWingModel[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 379
		leftWingModel[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 380
		leftWingModel[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 381
		leftWingModel[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 382
		leftWingModel[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383
		leftWingModel[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 384
		leftWingModel[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 385
		leftWingModel[196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 386
		leftWingModel[197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 387
		leftWingModel[198] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 617
		leftWingModel[199] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 618
		leftWingModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 619
		leftWingModel[201] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 621
		leftWingModel[202] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 623
		leftWingModel[203] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 670
		leftWingModel[204] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 671
		leftWingModel[205] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 672
		leftWingModel[206] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 673
		leftWingModel[207] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 674
		leftWingModel[208] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 675
		leftWingModel[209] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 676
		leftWingModel[210] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 677
		leftWingModel[211] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 678
		leftWingModel[212] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 679
		leftWingModel[213] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 680
		leftWingModel[214] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 753
		leftWingModel[215] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 754
		leftWingModel[216] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 755
		leftWingModel[217] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 756
		leftWingModel[218] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 757
		leftWingModel[219] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 758
		leftWingModel[220] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 759
		leftWingModel[221] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 760
		leftWingModel[222] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 761
		leftWingModel[223] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 762
		leftWingModel[224] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 763
		leftWingModel[225] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 826
		leftWingModel[226] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 827
		leftWingModel[227] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 828
		leftWingModel[228] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 829
		leftWingModel[229] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 812
		leftWingModel[230] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 813
		leftWingModel[231] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 814
		leftWingModel[232] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 815
		leftWingModel[233] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 816

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 90, 13, 28, 0F,0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftWingModel[0].setRotationPoint(10F, -42F, -42F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 28, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 119
		leftWingModel[1].setRotationPoint(6F, -42F, -42F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 28, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 120
		leftWingModel[2].setRotationPoint(6F, -32F, -42F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftWingModel[3].setRotationPoint(6F, -39F, -42F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		leftWingModel[4].setRotationPoint(6F, -39F, -16F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		leftWingModel[5].setRotationPoint(6F, -39F, -18F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		leftWingModel[6].setRotationPoint(6F, -39F, -20F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingModel[7].setRotationPoint(6F, -39F, -22F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingModel[8].setRotationPoint(6F, -39F, -24F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingModel[9].setRotationPoint(6F, -39F, -39F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingModel[10].setRotationPoint(6F, -39F, -37F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		leftWingModel[11].setRotationPoint(6F, -39F, -35F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftWingModel[12].setRotationPoint(6F, -39F, -33F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftWingModel[13].setRotationPoint(6F, -39F, -31F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 30, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 132
		leftWingModel[14].setRotationPoint(10F, -29F, -24F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftWingModel[15].setRotationPoint(10F, -25F, -25F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 30, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftWingModel[16].setRotationPoint(10F, -24F, -25F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		leftWingModel[17].setRotationPoint(10F, -19F, -25F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftWingModel[18].setRotationPoint(9F, -24F, -24F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		leftWingModel[19].setRotationPoint(9F, -24F, -20F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftWingModel[20].setRotationPoint(9F, -24F, -22F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftWingModel[21].setRotationPoint(9F, -20F, -20F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftWingModel[22].setRotationPoint(9F, -20F, -22F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftWingModel[23].setRotationPoint(9F, -20F, -24F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingModel[24].setRotationPoint(9F, -22F, -22F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftWingModel[25].setRotationPoint(9F, -22F, -20F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftWingModel[26].setRotationPoint(9F, -22F, -24F);

		leftWingModel[27].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 145
		leftWingModel[27].setRotationPoint(8F, -24F, -20F);

		leftWingModel[28].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 154
		leftWingModel[28].setRotationPoint(8F, -24F, -22F);

		leftWingModel[29].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 155
		leftWingModel[29].setRotationPoint(8F, -24F, -24F);

		leftWingModel[30].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 156
		leftWingModel[30].setRotationPoint(8F, -22F, -24F);

		leftWingModel[31].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 157
		leftWingModel[31].setRotationPoint(8F, -22F, -22F);

		leftWingModel[32].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 158
		leftWingModel[32].setRotationPoint(8F, -22F, -20F);

		leftWingModel[33].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 159
		leftWingModel[33].setRotationPoint(8F, -20F, -24F);

		leftWingModel[34].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 160
		leftWingModel[34].setRotationPoint(8F, -20F, -22F);

		leftWingModel[35].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 161
		leftWingModel[35].setRotationPoint(8F, -20F, -20F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F); // Box 162
		leftWingModel[36].setRotationPoint(33F, -29F, -37F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 38, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingModel[37].setRotationPoint(33F, -25F, -37F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 38, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftWingModel[38].setRotationPoint(33F, -23F, -37F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 38, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 165
		leftWingModel[39].setRotationPoint(33F, -18F, -37F);

		leftWingModel[40].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 166
		leftWingModel[40].setRotationPoint(33F, -20.5F, -32.5F);

		leftWingModel[41].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 168
		leftWingModel[41].setRotationPoint(33F, -20.5F, -32.5F);

		leftWingModel[42].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 169
		leftWingModel[42].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[42].rotateAngleX = -0.78539816F;

		leftWingModel[43].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 170
		leftWingModel[43].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[43].rotateAngleX = -0.78539816F;

		leftWingModel[44].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 171
		leftWingModel[44].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[44].rotateAngleX = -1.57079633F;

		leftWingModel[45].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 172
		leftWingModel[45].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[45].rotateAngleX = -1.57079633F;

		leftWingModel[46].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 173
		leftWingModel[46].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[46].rotateAngleX = -2.35619449F;

		leftWingModel[47].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 174
		leftWingModel[47].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[47].rotateAngleX = -2.35619449F;

		leftWingModel[48].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 175
		leftWingModel[48].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[48].rotateAngleX = -3.14159265F;

		leftWingModel[49].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 176
		leftWingModel[49].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[49].rotateAngleX = -3.14159265F;

		leftWingModel[50].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 177
		leftWingModel[50].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[50].rotateAngleX = -3.92699082F;

		leftWingModel[51].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 178
		leftWingModel[51].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[51].rotateAngleX = -3.92699082F;

		leftWingModel[52].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 179
		leftWingModel[52].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[52].rotateAngleX = -4.71238898F;

		leftWingModel[53].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 180
		leftWingModel[53].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[53].rotateAngleX = -4.71238898F;

		leftWingModel[54].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 181
		leftWingModel[54].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[54].rotateAngleX = -5.49778714F;

		leftWingModel[55].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 182
		leftWingModel[55].setRotationPoint(33F, -20.5F, -32.5F);
		leftWingModel[55].rotateAngleX = -5.49778714F;

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftWingModel[56].setRotationPoint(14F, -25F, -37F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftWingModel[57].setRotationPoint(14F, -23F, -37F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 185
		leftWingModel[58].setRotationPoint(14F, -18F, -37F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 30, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 199
		leftWingModel[59].setRotationPoint(10F, -29F, 19F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftWingModel[60].setRotationPoint(10F, -25F, 18F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 30, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[61].setRotationPoint(10F, -24F, 18F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 202
		leftWingModel[62].setRotationPoint(10F, -19F, 18F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftWingModel[63].setRotationPoint(9F, -24F, 23F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftWingModel[64].setRotationPoint(9F, -24F, 19F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftWingModel[65].setRotationPoint(9F, -24F, 21F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingModel[66].setRotationPoint(9F, -20F, 19F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingModel[67].setRotationPoint(9F, -20F, 21F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftWingModel[68].setRotationPoint(9F, -20F, 23F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingModel[69].setRotationPoint(9F, -22F, 21F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		leftWingModel[70].setRotationPoint(9F, -22F, 19F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingModel[71].setRotationPoint(9F, -22F, 23F);

		leftWingModel[72].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 212
		leftWingModel[72].setRotationPoint(8F, -24F, 19F);

		leftWingModel[73].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 213
		leftWingModel[73].setRotationPoint(8F, -24F, 21F);

		leftWingModel[74].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 214
		leftWingModel[74].setRotationPoint(8F, -24F, 23F);

		leftWingModel[75].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 215
		leftWingModel[75].setRotationPoint(8F, -22F, 23F);

		leftWingModel[76].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 216
		leftWingModel[76].setRotationPoint(8F, -22F, 21F);

		leftWingModel[77].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 217
		leftWingModel[77].setRotationPoint(8F, -22F, 19F);

		leftWingModel[78].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 218
		leftWingModel[78].setRotationPoint(8F, -20F, 23F);

		leftWingModel[79].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 219
		leftWingModel[79].setRotationPoint(8F, -20F, 21F);

		leftWingModel[80].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_RIGHT); // Box 220
		leftWingModel[80].setRotationPoint(8F, -20F, 19F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 38, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F); // Box 221
		leftWingModel[81].setRotationPoint(33F, -29F, 28F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 38, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftWingModel[82].setRotationPoint(33F, -25F, 28F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 38, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftWingModel[83].setRotationPoint(33F, -23F, 28F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 38, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 224
		leftWingModel[84].setRotationPoint(33F, -18F, 28F);

		leftWingModel[85].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 225
		leftWingModel[85].setRotationPoint(33F, -20.5F, 32.5F);

		leftWingModel[86].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 226
		leftWingModel[86].setRotationPoint(33F, -20.5F, 32.5F);

		leftWingModel[87].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 227
		leftWingModel[87].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[87].rotateAngleX = -0.78539816F;

		leftWingModel[88].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 228
		leftWingModel[88].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[88].rotateAngleX = -0.78539816F;

		leftWingModel[89].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 229
		leftWingModel[89].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[89].rotateAngleX = -1.57079633F;

		leftWingModel[90].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 230
		leftWingModel[90].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[90].rotateAngleX = -1.57079633F;

		leftWingModel[91].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 231
		leftWingModel[91].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[91].rotateAngleX = -2.35619449F;

		leftWingModel[92].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 232
		leftWingModel[92].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[92].rotateAngleX = -3.14159265F;

		leftWingModel[93].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 233
		leftWingModel[93].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[93].rotateAngleX = -3.14159265F;

		leftWingModel[94].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 234
		leftWingModel[94].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[94].rotateAngleX = -3.92699082F;

		leftWingModel[95].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 235
		leftWingModel[95].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[95].rotateAngleX = -3.92699082F;

		leftWingModel[96].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 236
		leftWingModel[96].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[96].rotateAngleX = -4.71238898F;

		leftWingModel[97].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 237
		leftWingModel[97].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[97].rotateAngleX = -4.71238898F;

		leftWingModel[98].addShapeBox(-22F, -1F, -4F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 238
		leftWingModel[98].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[98].rotateAngleX = -5.49778714F;

		leftWingModel[99].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 239
		leftWingModel[99].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[99].rotateAngleX = -5.49778714F;

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftWingModel[100].setRotationPoint(14F, -25F, 28F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftWingModel[101].setRotationPoint(14F, -23F, 28F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 242
		leftWingModel[102].setRotationPoint(14F, -18F, 28F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftWingModel[103].setRotationPoint(10F, -44F, -40F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftWingModel[104].setRotationPoint(10F, -44F, -21F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftWingModel[105].setRotationPoint(10F, -44F, -40F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 17, 2, 23, 0F,0F, 0F, 0F, -2F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F); // Box 227
		leftWingModel[106].setRotationPoint(53F, -44F, -40F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		leftWingModel[107].setRotationPoint(12F, -44F, -36F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftWingModel[108].setRotationPoint(16F, -44F, -36F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		leftWingModel[109].setRotationPoint(20F, -44F, -36F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftWingModel[110].setRotationPoint(24F, -44F, -36F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftWingModel[111].setRotationPoint(28F, -44F, -36F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		leftWingModel[112].setRotationPoint(32F, -44F, -36F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftWingModel[113].setRotationPoint(36F, -44F, -36F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftWingModel[114].setRotationPoint(40F, -44F, -36F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftWingModel[115].setRotationPoint(44F, -44F, -36F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		leftWingModel[116].setRotationPoint(48F, -44F, -36F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		leftWingModel[117].setRotationPoint(48F, -44F, -25F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		leftWingModel[118].setRotationPoint(44F, -44F, -25F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftWingModel[119].setRotationPoint(40F, -44F, -25F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftWingModel[120].setRotationPoint(36F, -44F, -25F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftWingModel[121].setRotationPoint(32F, -44F, -25F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftWingModel[122].setRotationPoint(28F, -44F, -25F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftWingModel[123].setRotationPoint(24F, -44F, -25F);

		leftWingModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftWingModel[124].setRotationPoint(20F, -44F, -25F);

		leftWingModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		leftWingModel[125].setRotationPoint(16F, -44F, -25F);

		leftWingModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingModel[126].setRotationPoint(12F, -44F, -25F);

		leftWingModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingModel[127].setRotationPoint(51F, -44F, -32F);

		leftWingModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 249
		leftWingModel[128].setRotationPoint(49F, -44F, -32F);

		leftWingModel[129].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingModel[129].setRotationPoint(44F, -44F, -30F);

		leftWingModel[130].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftWingModel[130].setRotationPoint(32F, -43F, -30F);

		leftWingModel[131].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 252
		leftWingModel[131].setRotationPoint(28F, -45F, -31F);

		leftWingModel[132].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftWingModel[132].setRotationPoint(24F, -45F, -31F);

		leftWingModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		leftWingModel[133].setRotationPoint(22F, -45F, -30F);

		leftWingModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftWingModel[134].setRotationPoint(22F, -44F, -30F);

		leftWingModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 256
		leftWingModel[135].setRotationPoint(22F, -43F, -30F);

		leftWingModel[136].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 257
		leftWingModel[136].setRotationPoint(20F, -45F, -31F);

		leftWingModel[137].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 258
		leftWingModel[137].setRotationPoint(20F, -45F, -27F);

		leftWingModel[138].addTrapezoid(0F, 0F, 0F, 12, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 259
		leftWingModel[138].setRotationPoint(10F, -44.5F, -29.5F);

		leftWingModel[139].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftWingModel[139].setRotationPoint(-1F, -44F, -29F);

		leftWingModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftWingModel[140].setRotationPoint(27F, -46F, -31F);

		leftWingModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftWingModel[141].setRotationPoint(24F, -46F, -31F);

		leftWingModel[142].addShapeBox(-23F, -1F, -4F, 23, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 311
		leftWingModel[142].setRotationPoint(33F, -20.5F, 32.5F);
		leftWingModel[142].rotateAngleX = -2.35619449F;

		leftWingModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftWingModel[143].setRotationPoint(58F, -45F, -33F);

		leftWingModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 316
		leftWingModel[144].setRotationPoint(56F, -45F, -33F);

		leftWingModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 317
		leftWingModel[145].setRotationPoint(55F, -45F, -32F);

		leftWingModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 318
		leftWingModel[146].setRotationPoint(61F, -45F, -33F);

		leftWingModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 319
		leftWingModel[147].setRotationPoint(63F, -45F, -32F);

		leftWingModel[148].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftWingModel[148].setRotationPoint(59F, -16F, -33F);

		leftWingModel[149].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 2F, 0F, -2F, 2F); // Box 326
		leftWingModel[149].setRotationPoint(59F, -12F, -33F);

		leftWingModel[150].addShapeBox(0F, 0F, 0F, 6, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		leftWingModel[150].setRotationPoint(59F, -10F, -29F);

		leftWingModel[151].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftWingModel[151].setRotationPoint(59F, -22F, -38F);

		leftWingModel[152].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftWingModel[152].setRotationPoint(35F, -23F, -37.5F);

		leftWingModel[153].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 334
		leftWingModel[153].setRotationPoint(35F, -18F, -37.5F);

		leftWingModel[154].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F); // Box 335
		leftWingModel[154].setRotationPoint(35F, -15F, -34F);

		leftWingModel[155].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		leftWingModel[155].setRotationPoint(27F, -14F, -33F);

		leftWingModel[156].addShapeBox(0F, 0F, 0F, 66, 13, 24, 0F,-26F, -33F, 0F, -4F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 30F, 0F, -4F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		leftWingModel[156].setRotationPoint(10F, -42F, -66F);

		leftWingModel[157].addShapeBox(0F, 0F, 0F, 36, 6, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 342
		leftWingModel[157].setRotationPoint(36F, -3F, -76F);

		leftWingModel[158].addShapeBox(0F, 0F, 0F, 33, 6, 30, 0F,0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -18F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftWingModel[158].setRotationPoint(36F, -3F, -106F);

		leftWingModel[159].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftWingModel[159].setRotationPoint(36F, -3F, -109F);

		leftWingModel[160].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftWingModel[160].setRotationPoint(38F, -7.5F, -110F);

		leftWingModel[161].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftWingModel[161].setRotationPoint(45F, -7.5F, -110F);

		leftWingModel[162].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		leftWingModel[162].setRotationPoint(35.5F, 2F, -111F);

		leftWingModel[163].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftWingModel[163].setRotationPoint(35.5F, -7F, -111F);

		leftWingModel[164].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 354
		leftWingModel[164].setRotationPoint(16F, -5.5F, -113.5F);

		leftWingModel[165].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		leftWingModel[165].setRotationPoint(16F, -6.5F, -113.5F);

		leftWingModel[166].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		leftWingModel[166].setRotationPoint(16F, -7.5F, -113.5F);

		leftWingModel[167].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 357
		leftWingModel[167].setRotationPoint(11F, -6.5F, -113.5F);

		leftWingModel[168].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 358
		leftWingModel[168].setRotationPoint(11F, -7.5F, -113.5F);

		leftWingModel[169].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 359
		leftWingModel[169].setRotationPoint(11F, -5.5F, -113.5F);

		leftWingModel[170].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 360
		leftWingModel[170].setRotationPoint(64F, -7.5F, -113.5F);

		leftWingModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 361
		leftWingModel[171].setRotationPoint(64F, -6.5F, -113.5F);

		leftWingModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 362
		leftWingModel[172].setRotationPoint(64F, -5.5F, -113.5F);

		leftWingModel[173].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		leftWingModel[173].setRotationPoint(20F, -6F, -112F);
		leftWingModel[173].rotateAngleX = 0.78539816F;

		leftWingModel[174].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		leftWingModel[174].setRotationPoint(20F, -6F, -112F);
		leftWingModel[174].rotateAngleX = 2.35619449F;

		leftWingModel[175].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		leftWingModel[175].setRotationPoint(20F, -6F, -112F);
		leftWingModel[175].rotateAngleX = -2.35619449F;

		leftWingModel[176].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftWingModel[176].setRotationPoint(20F, -6F, -112F);
		leftWingModel[176].rotateAngleX = -0.78539816F;

		leftWingModel[177].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftWingModel[177].setRotationPoint(55F, -6F, -112F);
		leftWingModel[177].rotateAngleX = -0.78539816F;

		leftWingModel[178].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		leftWingModel[178].setRotationPoint(55F, -6F, -112F);
		leftWingModel[178].rotateAngleX = -2.35619449F;

		leftWingModel[179].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		leftWingModel[179].setRotationPoint(55F, -6F, -112F);
		leftWingModel[179].rotateAngleX = 2.35619449F;

		leftWingModel[180].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		leftWingModel[180].setRotationPoint(55F, -6F, -112F);
		leftWingModel[180].rotateAngleX = 0.78539816F;

		leftWingModel[181].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftWingModel[181].setRotationPoint(55F, 3F, -112F);
		leftWingModel[181].rotateAngleX = 2.35619449F;

		leftWingModel[182].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftWingModel[182].setRotationPoint(55F, 3F, -112F);
		leftWingModel[182].rotateAngleX = 0.78539816F;

		leftWingModel[183].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftWingModel[183].setRotationPoint(55F, 3F, -112F);
		leftWingModel[183].rotateAngleX = -0.78539816F;

		leftWingModel[184].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		leftWingModel[184].setRotationPoint(55F, 3F, -112F);
		leftWingModel[184].rotateAngleX = -2.35619449F;

		leftWingModel[185].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		leftWingModel[185].setRotationPoint(20F, 3F, -112F);
		leftWingModel[185].rotateAngleX = 0.78539816F;

		leftWingModel[186].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		leftWingModel[186].setRotationPoint(20F, 3F, -112F);
		leftWingModel[186].rotateAngleX = 2.35619449F;

		leftWingModel[187].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftWingModel[187].setRotationPoint(20F, 3F, -112F);
		leftWingModel[187].rotateAngleX = -2.35619449F;

		leftWingModel[188].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftWingModel[188].setRotationPoint(20F, 3F, -112F);
		leftWingModel[188].rotateAngleX = -0.78539816F;

		leftWingModel[189].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 379
		leftWingModel[189].setRotationPoint(64F, 3.5F, -113.5F);

		leftWingModel[190].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 380
		leftWingModel[190].setRotationPoint(64F, 2.5F, -113.5F);

		leftWingModel[191].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 381
		leftWingModel[191].setRotationPoint(64F, 1.5F, -113.5F);

		leftWingModel[192].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftWingModel[192].setRotationPoint(16F, 1.5F, -113.5F);

		leftWingModel[193].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		leftWingModel[193].setRotationPoint(16F, 2.5F, -113.5F);

		leftWingModel[194].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 384
		leftWingModel[194].setRotationPoint(16F, 3.5F, -113.5F);

		leftWingModel[195].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 385
		leftWingModel[195].setRotationPoint(11F, 3.5F, -113.5F);

		leftWingModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 386
		leftWingModel[196].setRotationPoint(11F, 2.5F, -113.5F);

		leftWingModel[197].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 387
		leftWingModel[197].setRotationPoint(11F, 1.5F, -113.5F);

		leftWingModel[198].addShapeBox(0F, 0F, 0F, 15, 2, 30, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 617
		leftWingModel[198].setRotationPoint(-2F, -39F, -15F);

		leftWingModel[199].addShapeBox(0F, 0F, 0F, 10, 2, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 618
		leftWingModel[199].setRotationPoint(-12F, -39F, -14F);

		leftWingModel[200].addShapeBox(0F, 0F, 0F, 5, 2, 24, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 619
		leftWingModel[200].setRotationPoint(-17F, -39F, -12F);

		leftWingModel[201].addShapeBox(0F, 0F, 0F, 15, 2, 30, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 621
		leftWingModel[201].setRotationPoint(-2F, -32F, -15F);

		leftWingModel[202].addShapeBox(0F, 0F, 0F, 10, 2, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 623
		leftWingModel[202].setRotationPoint(-12F, -32F, -14F);

		leftWingModel[203].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		leftWingModel[203].setRotationPoint(31F, -2F, -86F);

		leftWingModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		leftWingModel[204].setRotationPoint(28F, -1.5F, -85.5F);

		leftWingModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		leftWingModel[205].setRotationPoint(28F, -1.5F, -82.5F);

		leftWingModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		leftWingModel[206].setRotationPoint(18F, -1F, -82F);

		leftWingModel[207].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		leftWingModel[207].setRotationPoint(23F, -1F, -85F);

		leftWingModel[208].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		leftWingModel[208].setRotationPoint(33F, -2F, -97F);

		leftWingModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		leftWingModel[209].setRotationPoint(30F, -1.5F, -96.5F);

		leftWingModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		leftWingModel[210].setRotationPoint(30F, -1.5F, -94.5F);

		leftWingModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		leftWingModel[211].setRotationPoint(31F, -1.5F, -89.5F);

		leftWingModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		leftWingModel[212].setRotationPoint(31F, -1.5F, -91.5F);

		leftWingModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		leftWingModel[213].setRotationPoint(34F, -2F, -92F);

		leftWingModel[214].addShapeBox(0F, -2F, -38F, 4, 2, 36, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		leftWingModel[214].setRotationPoint(38F, -42F, -42F);
		leftWingModel[214].rotateAngleX = 0.9424778F;

		leftWingModel[215].addShapeBox(0F, -2F, -38F, 4, 2, 36, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		leftWingModel[215].setRotationPoint(50F, -42F, -42F);
		leftWingModel[215].rotateAngleX = 0.9424778F;

		leftWingModel[216].addShapeBox(0F, -2F, -38F, 4, 2, 36, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		leftWingModel[216].setRotationPoint(62F, -42F, -42F);
		leftWingModel[216].rotateAngleX = 0.9424778F;

		leftWingModel[217].addShapeBox(0F, -2F, -7F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		leftWingModel[217].setRotationPoint(42F, -42F, -42F);
		leftWingModel[217].rotateAngleX = 0.9424778F;

		leftWingModel[218].addShapeBox(0F, -2F, -11F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		leftWingModel[218].setRotationPoint(42F, -42F, -42F);
		leftWingModel[218].rotateAngleX = 0.9424778F;

		leftWingModel[219].addShapeBox(0F, -2F, -15F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		leftWingModel[219].setRotationPoint(42F, -42F, -42F);
		leftWingModel[219].rotateAngleX = 0.9424778F;

		leftWingModel[220].addShapeBox(0F, -2F, -19F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		leftWingModel[220].setRotationPoint(42F, -42F, -42F);
		leftWingModel[220].rotateAngleX = 0.9424778F;

		leftWingModel[221].addShapeBox(0F, -2F, -23F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		leftWingModel[221].setRotationPoint(42F, -42F, -42F);
		leftWingModel[221].rotateAngleX = 0.9424778F;

		leftWingModel[222].addShapeBox(0F, -2F, -27F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		leftWingModel[222].setRotationPoint(42F, -42F, -42F);
		leftWingModel[222].rotateAngleX = 0.9424778F;

		leftWingModel[223].addShapeBox(0F, -2F, -31F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		leftWingModel[223].setRotationPoint(42F, -42F, -42F);
		leftWingModel[223].rotateAngleX = 0.9424778F;

		leftWingModel[224].addShapeBox(0F, -2F, -35F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		leftWingModel[224].setRotationPoint(42F, -42F, -42F);
		leftWingModel[224].rotateAngleX = 0.9424778F;

		leftWingModel[225].addShapeBox(0F, -2F, -7F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		leftWingModel[225].setRotationPoint(54F, -42F, -42F);
		leftWingModel[225].rotateAngleX = 0.9424778F;

		leftWingModel[226].addShapeBox(0F, -2F, -15F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		leftWingModel[226].setRotationPoint(54F, -42F, -42F);
		leftWingModel[226].rotateAngleX = 0.9424778F;

		leftWingModel[227].addShapeBox(0F, -2F, -23F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		leftWingModel[227].setRotationPoint(54F, -42F, -42F);
		leftWingModel[227].rotateAngleX = 0.9424778F;

		leftWingModel[228].addShapeBox(0F, -2F, -31F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		leftWingModel[228].setRotationPoint(54F, -42F, -42F);
		leftWingModel[228].rotateAngleX = 0.9424778F;

		leftWingModel[229].addShapeBox(0F, 0F, 0F, 23, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		leftWingModel[229].setRotationPoint(80F, -37F, -34F);

		leftWingModel[230].addShapeBox(0F, 0F, 0F, 23, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 0F); // Box 813
		leftWingModel[230].setRotationPoint(103F, -37F, -34F);

		leftWingModel[231].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		leftWingModel[231].setRotationPoint(104F, -36.5F, -32F);

		leftWingModel[232].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		leftWingModel[232].setRotationPoint(90F, -36.5F, -24F);

		leftWingModel[233].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		leftWingModel[233].setRotationPoint(90F, -36.5F, -17F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		rightWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		rightWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		rightWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		rightWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		rightWingModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		rightWingModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		rightWingModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		rightWingModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		rightWingModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		rightWingModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		rightWingModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		rightWingModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 263
		rightWingModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 264
		rightWingModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 265
		rightWingModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 266
		rightWingModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 267
		rightWingModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 268
		rightWingModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		rightWingModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 270
		rightWingModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		rightWingModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		rightWingModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		rightWingModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 274
		rightWingModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 275
		rightWingModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 276
		rightWingModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 277
		rightWingModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 278
		rightWingModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 279
		rightWingModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 280
		rightWingModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 281
		rightWingModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 282
		rightWingModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 283
		rightWingModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 284
		rightWingModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 285
		rightWingModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 286
		rightWingModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 287
		rightWingModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 288
		rightWingModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 289
		rightWingModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 290
		rightWingModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 291
		rightWingModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 292
		rightWingModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 293
		rightWingModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 294
		rightWingModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 295
		rightWingModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 296
		rightWingModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		rightWingModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 298
		rightWingModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 299
		rightWingModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 300
		rightWingModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 320
		rightWingModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 321
		rightWingModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 322
		rightWingModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 323
		rightWingModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 324
		rightWingModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 328
		rightWingModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 329
		rightWingModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 330
		rightWingModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 331
		rightWingModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 337
		rightWingModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 338
		rightWingModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 339
		rightWingModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 340
		rightWingModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 346
		rightWingModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 347
		rightWingModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 348
		rightWingModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 681
		rightWingModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 682
		rightWingModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 683
		rightWingModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 684
		rightWingModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 685
		rightWingModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 686
		rightWingModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 687
		rightWingModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 688
		rightWingModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 689
		rightWingModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 690
		rightWingModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 691
		rightWingModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 764
		rightWingModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 765
		rightWingModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 766
		rightWingModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 767
		rightWingModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 768
		rightWingModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 769
		rightWingModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 770
		rightWingModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 771
		rightWingModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 772
		rightWingModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 773
		rightWingModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 774
		rightWingModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 775
		rightWingModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 776
		rightWingModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 777
		rightWingModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 778
		rightWingModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 779
		rightWingModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 780
		rightWingModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 781
		rightWingModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 782
		rightWingModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 783
		rightWingModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 784
		rightWingModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 785
		rightWingModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 786
		rightWingModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 787
		rightWingModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 788
		rightWingModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 789
		rightWingModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 790
		rightWingModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 791
		rightWingModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 792
		rightWingModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 793
		rightWingModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 794
		rightWingModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 795
		rightWingModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 796
		rightWingModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 797
		rightWingModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 798
		rightWingModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 799
		rightWingModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 800
		rightWingModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 801
		rightWingModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 802
		rightWingModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 803
		rightWingModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 804
		rightWingModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 805
		rightWingModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 806
		rightWingModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 807
		rightWingModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 808
		rightWingModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 809
		rightWingModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 810
		rightWingModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 811
		rightWingModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 812
		rightWingModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 813
		rightWingModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 830
		rightWingModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 831
		rightWingModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 832
		rightWingModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 833
		rightWingModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 817
		rightWingModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 818
		rightWingModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 819
		rightWingModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 820
		rightWingModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 821
		rightWingModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 822

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 90, 13, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F); // Box 186
		rightWingModel[0].setRotationPoint(10F, -42F, 14F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 28, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 187
		rightWingModel[1].setRotationPoint(6F, -42F, 14F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 28, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 188
		rightWingModel[2].setRotationPoint(6F, -32F, 14F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 189
		rightWingModel[3].setRotationPoint(6F, -39F, 40F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightWingModel[4].setRotationPoint(6F, -39F, 14F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		rightWingModel[5].setRotationPoint(6F, -39F, 17F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		rightWingModel[6].setRotationPoint(6F, -39F, 19F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightWingModel[7].setRotationPoint(6F, -39F, 21F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightWingModel[8].setRotationPoint(6F, -39F, 23F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rightWingModel[9].setRotationPoint(6F, -39F, 38F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightWingModel[10].setRotationPoint(6F, -39F, 36F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightWingModel[11].setRotationPoint(6F, -39F, 34F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		rightWingModel[12].setRotationPoint(6F, -39F, 32F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		rightWingModel[13].setRotationPoint(10F, -44F, 36F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightWingModel[14].setRotationPoint(10F, -44F, 17F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 17, 2, 23, 0F,0F, 0F, 0F, 16F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightWingModel[15].setRotationPoint(53F, -44F, 17F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightWingModel[16].setRotationPoint(12F, -44F, 32F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightWingModel[17].setRotationPoint(16F, -44F, 32F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightWingModel[18].setRotationPoint(20F, -44F, 32F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightWingModel[19].setRotationPoint(24F, -44F, 32F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightWingModel[20].setRotationPoint(28F, -44F, 32F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightWingModel[21].setRotationPoint(32F, -44F, 32F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightWingModel[22].setRotationPoint(36F, -44F, 32F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightWingModel[23].setRotationPoint(40F, -44F, 32F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightWingModel[24].setRotationPoint(44F, -44F, 32F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		rightWingModel[25].setRotationPoint(48F, -44F, 32F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		rightWingModel[26].setRotationPoint(48F, -44F, 21F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightWingModel[27].setRotationPoint(44F, -44F, 21F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightWingModel[28].setRotationPoint(40F, -44F, 21F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightWingModel[29].setRotationPoint(36F, -44F, 21F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingModel[30].setRotationPoint(32F, -44F, 21F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[31].setRotationPoint(28F, -44F, 21F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightWingModel[32].setRotationPoint(24F, -44F, 21F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightWingModel[33].setRotationPoint(20F, -44F, 21F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightWingModel[34].setRotationPoint(16F, -44F, 21F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightWingModel[35].setRotationPoint(12F, -44F, 21F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightWingModel[36].setRotationPoint(51F, -44F, 25F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 287
		rightWingModel[37].setRotationPoint(49F, -44F, 25F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightWingModel[38].setRotationPoint(44F, -44F, 27F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightWingModel[39].setRotationPoint(32F, -43F, 27F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 290
		rightWingModel[40].setRotationPoint(28F, -45F, 26F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightWingModel[41].setRotationPoint(24F, -45F, 26F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightWingModel[42].setRotationPoint(22F, -45F, 27F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightWingModel[43].setRotationPoint(22F, -44F, 27F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 294
		rightWingModel[44].setRotationPoint(22F, -43F, 27F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 295
		rightWingModel[45].setRotationPoint(20F, -45F, 30F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 296
		rightWingModel[46].setRotationPoint(20F, -45F, 26F);

		rightWingModel[47].addTrapezoid(0F, 0F, 0F, 12, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 297
		rightWingModel[47].setRotationPoint(10F, -44.5F, 27.5F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightWingModel[48].setRotationPoint(-1F, -44F, 28F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[49].setRotationPoint(27F, -46F, 26F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightWingModel[50].setRotationPoint(24F, -46F, 26F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		rightWingModel[51].setRotationPoint(58F, -45F, 24F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 321
		rightWingModel[52].setRotationPoint(56F, -45F, 24F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 322
		rightWingModel[53].setRotationPoint(55F, -45F, 25F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 323
		rightWingModel[54].setRotationPoint(61F, -45F, 24F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 324
		rightWingModel[55].setRotationPoint(63F, -45F, 25F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		rightWingModel[56].setRotationPoint(59F, -16F, 31F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 329
		rightWingModel[57].setRotationPoint(59F, -12F, 31F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[58].setRotationPoint(59F, -10F, 12F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		rightWingModel[59].setRotationPoint(59F, -22F, 36F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[60].setRotationPoint(35F, -23F, 27.5F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 338
		rightWingModel[61].setRotationPoint(35F, -18F, 27.5F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F); // Box 339
		rightWingModel[62].setRotationPoint(35F, -15F, 31F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightWingModel[63].setRotationPoint(27F, -14F, 32F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 66, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -33F, 0F, -26F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 30F, 0F, -26F, 30F, 0F); // Box 346
		rightWingModel[64].setRotationPoint(10F, -42F, 42F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 36, 6, 10, 0F,0F, 6F, 0F, 0F, 6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 347
		rightWingModel[65].setRotationPoint(36F, -3F, 66F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 33, 6, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -3F, 0F, 0F, -3F, 0F); // Box 348
		rightWingModel[66].setRotationPoint(36F, -3F, 76F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		rightWingModel[67].setRotationPoint(31F, -2F, 80F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		rightWingModel[68].setRotationPoint(28F, -1.5F, 83.5F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		rightWingModel[69].setRotationPoint(28F, -1.5F, 80.5F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		rightWingModel[70].setRotationPoint(18F, -1F, 81F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		rightWingModel[71].setRotationPoint(23F, -1F, 84F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		rightWingModel[72].setRotationPoint(33F, -2F, 93F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		rightWingModel[73].setRotationPoint(30F, -1.5F, 95.5F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		rightWingModel[74].setRotationPoint(30F, -1.5F, 93.5F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		rightWingModel[75].setRotationPoint(31F, -1.5F, 88.5F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		rightWingModel[76].setRotationPoint(31F, -1.5F, 90.5F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		rightWingModel[77].setRotationPoint(34F, -2F, 88F);

		rightWingModel[78].addShapeBox(0F, -2F, 33F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		rightWingModel[78].setRotationPoint(42F, -42F, 42F);
		rightWingModel[78].rotateAngleX = -0.9424778F;

		rightWingModel[79].addShapeBox(0F, -2F, 2F, 4, 2, 36, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		rightWingModel[79].setRotationPoint(38F, -42F, 42F);
		rightWingModel[79].rotateAngleX = -0.9424778F;

		rightWingModel[80].addShapeBox(0F, -2F, 2F, 4, 2, 36, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		rightWingModel[80].setRotationPoint(50F, -42F, 42F);
		rightWingModel[80].rotateAngleX = -0.9424778F;

		rightWingModel[81].addShapeBox(0F, -2F, 29F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		rightWingModel[81].setRotationPoint(42F, -42F, 42F);
		rightWingModel[81].rotateAngleX = -0.9424778F;

		rightWingModel[82].addShapeBox(0F, -2F, 25F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		rightWingModel[82].setRotationPoint(42F, -42F, 42F);
		rightWingModel[82].rotateAngleX = -0.9424778F;

		rightWingModel[83].addShapeBox(0F, -2F, 21F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		rightWingModel[83].setRotationPoint(42F, -42F, 42F);
		rightWingModel[83].rotateAngleX = -0.9424778F;

		rightWingModel[84].addShapeBox(0F, -2F, 17F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		rightWingModel[84].setRotationPoint(42F, -42F, 42F);
		rightWingModel[84].rotateAngleX = -0.9424778F;

		rightWingModel[85].addShapeBox(0F, -2F, 13F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		rightWingModel[85].setRotationPoint(42F, -42F, 42F);
		rightWingModel[85].rotateAngleX = -0.9424778F;

		rightWingModel[86].addShapeBox(0F, -2F, 9F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		rightWingModel[86].setRotationPoint(42F, -42F, 42F);
		rightWingModel[86].rotateAngleX = -0.9424778F;

		rightWingModel[87].addShapeBox(0F, -2F, 5F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		rightWingModel[87].setRotationPoint(42F, -42F, 42F);
		rightWingModel[87].rotateAngleX = -0.9424778F;

		rightWingModel[88].addShapeBox(0F, -2F, 2F, 4, 2, 36, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		rightWingModel[88].setRotationPoint(62F, -42F, 42F);
		rightWingModel[88].rotateAngleX = -0.9424778F;

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 775
		rightWingModel[89].setRotationPoint(36F, -3F, 106F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		rightWingModel[90].setRotationPoint(38F, -7.5F, 109F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		rightWingModel[91].setRotationPoint(45F, -7.5F, 109F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		rightWingModel[92].setRotationPoint(35.5F, 2F, 110F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		rightWingModel[93].setRotationPoint(35.5F, -7F, 110F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 780
		rightWingModel[94].setRotationPoint(16F, -5.5F, 110.5F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		rightWingModel[95].setRotationPoint(16F, -6.5F, 110.5F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		rightWingModel[96].setRotationPoint(16F, -7.5F, 110.5F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 783
		rightWingModel[97].setRotationPoint(11F, -6.5F, 110.5F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 784
		rightWingModel[98].setRotationPoint(11F, -7.5F, 110.5F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 785
		rightWingModel[99].setRotationPoint(11F, -5.5F, 110.5F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 786
		rightWingModel[100].setRotationPoint(64F, -7.5F, 110.5F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 787
		rightWingModel[101].setRotationPoint(64F, -6.5F, 110.5F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 788
		rightWingModel[102].setRotationPoint(64F, -5.5F, 110.5F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 789
		rightWingModel[103].setRotationPoint(64F, 3.5F, 110.5F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 790
		rightWingModel[104].setRotationPoint(64F, 2.5F, 110.5F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 791
		rightWingModel[105].setRotationPoint(64F, 1.5F, 110.5F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		rightWingModel[106].setRotationPoint(16F, 1.5F, 110.5F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		rightWingModel[107].setRotationPoint(16F, 2.5F, 110.5F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 794
		rightWingModel[108].setRotationPoint(16F, 3.5F, 110.5F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F); // Box 795
		rightWingModel[109].setRotationPoint(11F, 3.5F, 110.5F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 796
		rightWingModel[110].setRotationPoint(11F, 2.5F, 110.5F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 797
		rightWingModel[111].setRotationPoint(11F, 1.5F, 110.5F);

		rightWingModel[112].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		rightWingModel[112].setRotationPoint(20F, -6F, 112F);
		rightWingModel[112].rotateAngleX = 0.78539816F;

		rightWingModel[113].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 799
		rightWingModel[113].setRotationPoint(20F, -6F, 112F);
		rightWingModel[113].rotateAngleX = 2.35619449F;

		rightWingModel[114].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		rightWingModel[114].setRotationPoint(20F, -6F, 112F);
		rightWingModel[114].rotateAngleX = -0.78539816F;

		rightWingModel[115].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		rightWingModel[115].setRotationPoint(20F, -6F, 112F);
		rightWingModel[115].rotateAngleX = -2.35619449F;

		rightWingModel[116].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		rightWingModel[116].setRotationPoint(20F, 3F, 112F);
		rightWingModel[116].rotateAngleX = -0.78539816F;

		rightWingModel[117].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		rightWingModel[117].setRotationPoint(20F, 3F, 112F);
		rightWingModel[117].rotateAngleX = -2.35619449F;

		rightWingModel[118].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		rightWingModel[118].setRotationPoint(20F, 3F, 112F);
		rightWingModel[118].rotateAngleX = 2.35619449F;

		rightWingModel[119].addShapeBox(0F, -3F, -0.5F, 11, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		rightWingModel[119].setRotationPoint(20F, 3F, 112F);
		rightWingModel[119].rotateAngleX = 0.78539816F;

		rightWingModel[120].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		rightWingModel[120].setRotationPoint(55F, 3F, 112F);
		rightWingModel[120].rotateAngleX = 2.35619449F;

		rightWingModel[121].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		rightWingModel[121].setRotationPoint(55F, 3F, 112F);
		rightWingModel[121].rotateAngleX = 0.78539816F;

		rightWingModel[122].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		rightWingModel[122].setRotationPoint(55F, 3F, 112F);
		rightWingModel[122].rotateAngleX = -0.78539816F;

		rightWingModel[123].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		rightWingModel[123].setRotationPoint(55F, 3F, 112F);
		rightWingModel[123].rotateAngleX = -2.35619449F;

		rightWingModel[124].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		rightWingModel[124].setRotationPoint(55F, -6F, 112F);
		rightWingModel[124].rotateAngleX = -2.35619449F;

		rightWingModel[125].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		rightWingModel[125].setRotationPoint(55F, -6F, 112F);
		rightWingModel[125].rotateAngleX = 2.35619449F;

		rightWingModel[126].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		rightWingModel[126].setRotationPoint(55F, -6F, 112F);
		rightWingModel[126].rotateAngleX = 0.78539816F;

		rightWingModel[127].addShapeBox(0F, -4F, -0.5F, 11, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		rightWingModel[127].setRotationPoint(55F, -6F, 112F);
		rightWingModel[127].rotateAngleX = -0.78539816F;

		rightWingModel[128].addShapeBox(0F, -2F, 5F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		rightWingModel[128].setRotationPoint(54F, -42F, 42F);
		rightWingModel[128].rotateAngleX = -0.9424778F;

		rightWingModel[129].addShapeBox(0F, -2F, 13F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		rightWingModel[129].setRotationPoint(54F, -42F, 42F);
		rightWingModel[129].rotateAngleX = -0.9424778F;

		rightWingModel[130].addShapeBox(0F, -2F, 21F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		rightWingModel[130].setRotationPoint(54F, -42F, 42F);
		rightWingModel[130].rotateAngleX = -0.9424778F;

		rightWingModel[131].addShapeBox(0F, -2F, 29F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		rightWingModel[131].setRotationPoint(54F, -42F, 42F);
		rightWingModel[131].rotateAngleX = -0.9424778F;

		rightWingModel[132].addShapeBox(0F, 0F, 0F, 23, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		rightWingModel[132].setRotationPoint(80F, -37F, 26F);

		rightWingModel[133].addShapeBox(0F, 0F, 0F, 23, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, -22F, 0F, 0F, 0F); // Box 818
		rightWingModel[133].setRotationPoint(103F, -37F, 26F);

		rightWingModel[134].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		rightWingModel[134].setRotationPoint(104F, -36.5F, 31F);

		rightWingModel[135].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		rightWingModel[135].setRotationPoint(90F, -36.5F, 23F);

		rightWingModel[136].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
		rightWingModel[136].setRotationPoint(90F, -36.5F, 16F);

		rightWingModel[137].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		rightWingModel[137].setRotationPoint(6F, -39F, 25F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 751
		yawFlapModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 752
		yawFlapModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 820
		yawFlapModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 821
		yawFlapModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 822
		yawFlapModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 823
		yawFlapModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 824
		yawFlapModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 825

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 5, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		yawFlapModel[0].setRotationPoint(163F, -42F, -4.5F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 5, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		yawFlapModel[1].setRotationPoint(163F, -42F, 4.5F);

		yawFlapModel[2].addShapeBox(-6F, 0F, -1F, 12, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F); // Box 820
		yawFlapModel[2].setRotationPoint(205F, -19F, -44F);

		yawFlapModel[3].addShapeBox(-8F, 0F, -1F, 2, 12, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -0.5F); // Box 821
		yawFlapModel[3].setRotationPoint(205F, -19F, -44F);

		yawFlapModel[4].addShapeBox(6F, 0F, -1F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, 0F); // Box 822
		yawFlapModel[4].setRotationPoint(205F, -19F, -44F);

		yawFlapModel[5].addShapeBox(-8F, 0F, -1F, 2, 12, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -0.5F); // Box 823
		yawFlapModel[5].setRotationPoint(205F, -19F, 44F);

		yawFlapModel[6].addShapeBox(-6F, 0F, -1F, 12, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F); // Box 824
		yawFlapModel[6].setRotationPoint(205F, -19F, 44F);

		yawFlapModel[7].addShapeBox(6F, 0F, -1F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, 0F); // Box 825
		yawFlapModel[7].setRotationPoint(205F, -19F, 44F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 655
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 656
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 657
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 658
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 659
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 660
		pitchFlapLeftModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 661
		pitchFlapLeftModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 662

		pitchFlapLeftModel[0].addShapeBox(-9.5F, -2.5F, 0F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		pitchFlapLeftModel[0].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[1].addShapeBox(-9.5F, -2.5F, 5F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		pitchFlapLeftModel[1].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[2].addShapeBox(-12.5F, -3.5F, 0F, 22, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		pitchFlapLeftModel[2].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[3].addShapeBox(-8.5F, -2.5F, 1F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		pitchFlapLeftModel[3].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[4].addShapeBox(-9.5F, 2.5F, 1F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		pitchFlapLeftModel[4].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[5].addShapeBox(-10.5F, -2F, 1.5F, 21, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		pitchFlapLeftModel[5].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[6].addShapeBox(-10.5F, -1F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		pitchFlapLeftModel[6].setRotationPoint(205.5F, -60F, -27F);

		pitchFlapLeftModel[7].addShapeBox(-10.5F, 0F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 662
		pitchFlapLeftModel[7].setRotationPoint(205.5F, -60F, -27F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 673
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 674
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 675
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 676
		pitchFlapRightModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 677
		pitchFlapRightModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 678
		pitchFlapRightModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 679
		pitchFlapRightModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 680

		pitchFlapRightModel[0].addShapeBox(-9.5F, -2.5F, 5F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		pitchFlapRightModel[0].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[1].addShapeBox(-9.5F, -2.5F, 0F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		pitchFlapRightModel[1].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[2].addShapeBox(-12.5F, -3.5F, 0F, 22, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		pitchFlapRightModel[2].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[3].addShapeBox(-10.5F, -2F, 1.5F, 21, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		pitchFlapRightModel[3].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[4].addShapeBox(-10.5F, -1F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		pitchFlapRightModel[4].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[5].addShapeBox(-10.5F, 0F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 678
		pitchFlapRightModel[5].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[6].addShapeBox(-9.5F, 2.5F, 1F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		pitchFlapRightModel[6].setRotationPoint(205.5F, -60F, 21F);

		pitchFlapRightModel[7].addShapeBox(-8.5F, -2.5F, 1F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		pitchFlapRightModel[7].setRotationPoint(205.5F, -60F, 21F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 682
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 683
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 684
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 685
		pitchFlapLeftWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 686
		pitchFlapLeftWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 687
		pitchFlapLeftWingModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 688
		pitchFlapLeftWingModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 689
		pitchFlapLeftWingModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 801
		pitchFlapLeftWingModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 802
		pitchFlapLeftWingModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 803

		pitchFlapLeftWingModel[0].addShapeBox(-12.5F, -3.5F, 0F, 22, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		pitchFlapLeftWingModel[0].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[1].addShapeBox(-9.5F, -2.5F, 0F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		pitchFlapLeftWingModel[1].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[2].addShapeBox(-9.5F, 2.5F, 1F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		pitchFlapLeftWingModel[2].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[3].addShapeBox(-9.5F, -2.5F, 5F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		pitchFlapLeftWingModel[3].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[4].addShapeBox(-8.5F, -2.5F, 1F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		pitchFlapLeftWingModel[4].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[5].addShapeBox(-10.5F, 0F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 687
		pitchFlapLeftWingModel[5].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[6].addShapeBox(-10.5F, -1F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		pitchFlapLeftWingModel[6].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[7].addShapeBox(-10.5F, -2F, 1.5F, 21, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		pitchFlapLeftWingModel[7].setRotationPoint(205.5F, -60F, -20F);

		pitchFlapLeftWingModel[8].addShapeBox(-10F, -1F, 0F, 22, 2, 18, 0F,-18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		pitchFlapLeftWingModel[8].setRotationPoint(135F, -22F, -52F);

		pitchFlapLeftWingModel[9].addShapeBox(-15F, -1F, 0F, 23, 2, 18, 0F,-18F, -0.5F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, -0.5F, 0F, -18F, -0.5F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, -0.5F, 0F); // Box 802
		pitchFlapLeftWingModel[9].setRotationPoint(135F, -22F, -52F);

		pitchFlapLeftWingModel[10].addShapeBox(12F, -1F, 0F, 3, 2, 18, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 803
		pitchFlapLeftWingModel[10].setRotationPoint(135F, -22F, -52F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 690
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 691
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 692
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 693
		pitchFlapRightWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 694
		pitchFlapRightWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 695
		pitchFlapRightWingModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 696
		pitchFlapRightWingModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 697
		pitchFlapRightWingModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 809
		pitchFlapRightWingModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 810
		pitchFlapRightWingModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 811

		pitchFlapRightWingModel[0].addShapeBox(-12.5F, -3.5F, 0F, 22, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		pitchFlapRightWingModel[0].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[1].addShapeBox(-9.5F, -2.5F, 0F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		pitchFlapRightWingModel[1].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[2].addShapeBox(-9.5F, 2.5F, 1F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		pitchFlapRightWingModel[2].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[3].addShapeBox(-9.5F, -2.5F, 5F, 19, 6, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		pitchFlapRightWingModel[3].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[4].addShapeBox(-8.5F, -2.5F, 1F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		pitchFlapRightWingModel[4].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[5].addShapeBox(-10.5F, 0F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 695
		pitchFlapRightWingModel[5].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[6].addShapeBox(-10.5F, -1F, 1.5F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		pitchFlapRightWingModel[6].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[7].addShapeBox(-10.5F, -2F, 1.5F, 21, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		pitchFlapRightWingModel[7].setRotationPoint(205.5F, -60F, 14F);

		pitchFlapRightWingModel[8].addShapeBox(-10F, -1F, 0F, 22, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F); // Box 809
		pitchFlapRightWingModel[8].setRotationPoint(135F, -22F, 34F);

		pitchFlapRightWingModel[9].addShapeBox(-15F, -1F, 0F, 23, 2, 18, 0F,0F, -0.5F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -18F, -0.5F, 0F, 0F, -0.5F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -18F, -0.5F, 0F); // Box 810
		pitchFlapRightWingModel[9].setRotationPoint(135F, -22F, 34F);

		pitchFlapRightWingModel[10].addShapeBox(12F, -1F, 0F, 3, 2, 18, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 811
		pitchFlapRightWingModel[10].setRotationPoint(135F, -22F, 34F);
	}

	private void initskidsModel_1()
	{
		skidsModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		skidsModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		skidsModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		skidsModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110

		skidsModel[0].addShapeBox(-6F, 0F, -6F, 6, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 107
		skidsModel[0].setRotationPoint(-98F, 0F, 0F);

		skidsModel[1].addShapeBox(-10F, 0F, -6F, 4, 4, 12, 0F,2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 108
		skidsModel[1].setRotationPoint(-98F, 0F, 0F);

		skidsModel[2].addShapeBox(0F, 0F, -6F, 8, 4, 5, 0F,0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4.5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 109
		skidsModel[2].setRotationPoint(-98F, 0F, 0F);

		skidsModel[3].addShapeBox(0F, 0F, 1F, 8, 4, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4.5F, 0F, 0F, -4F); // Box 110
		skidsModel[3].setRotationPoint(-98F, 0F, 0F);
	}
}