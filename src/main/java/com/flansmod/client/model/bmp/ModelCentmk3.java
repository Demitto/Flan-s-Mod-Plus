//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Centurion
// Model Creator: 
// Created on: 22.02.2016 - 18:44:27
// Last changed on: 22.02.2016 - 18:44:27

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCentmk3 extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 4096;

	public ModelCentmk3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[354];
		turretModel = new ModelRendererTurbo[83];
		barrelModel = new ModelRendererTurbo[17];
		leftTrackWheelModels = new ModelRendererTurbo[110];
		rightTrackWheelModels = new ModelRendererTurbo[110];
		leftTrackModel = new ModelRendererTurbo[632];
		rightTrackModel = new ModelRendererTurbo[632];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initleftTrackModel_2();
		initrightTrackModel_1();
		initrightTrackModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 177, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 291, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 326, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 336, textureX, textureY); // Import Box7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Import Box8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 366, textureX, textureY); // Import Box9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 386, textureX, textureY); // Import Box10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 291, textureX, textureY); // Import Box11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Import Box12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 336, textureX, textureY); // Import Box13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Import Box14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 366, textureX, textureY); // Import Box15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 386, textureX, textureY); // Import Box16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 399, textureX, textureY); // Import Box17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // Import Box18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 433, textureX, textureY); // Import Box19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 399, textureX, textureY); // Import Box26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // Import Box27
		bodyModel[28] = new ModelRendererTurbo(this, 0, 433, textureX, textureY); // Import Box28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Import Box35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Import Box36
		bodyModel[37] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Import Box37
		bodyModel[38] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Import Box38
		bodyModel[39] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Box39
		bodyModel[40] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Box40
		bodyModel[41] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Import Box41
		bodyModel[42] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Box42
		bodyModel[43] = new ModelRendererTurbo(this, 0, 514, textureX, textureY); // Import Box43
		bodyModel[44] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Import Box44
		bodyModel[45] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Import Box45
		bodyModel[46] = new ModelRendererTurbo(this, 0, 472, textureX, textureY); // Import Box46
		bodyModel[47] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Import Box47
		bodyModel[48] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Box48
		bodyModel[49] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import Box49
		bodyModel[50] = new ModelRendererTurbo(this, 0, 482, textureX, textureY); // Import Box50
		bodyModel[51] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Box51
		bodyModel[52] = new ModelRendererTurbo(this, 0, 514, textureX, textureY); // Import Box52
		bodyModel[53] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Import Box53
		bodyModel[54] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Import Box54
		bodyModel[55] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Import Box55
		bodyModel[56] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Import Box56
		bodyModel[57] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Import Box57
		bodyModel[58] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Import Box58
		bodyModel[59] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Import Box59
		bodyModel[60] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Import Box60
		bodyModel[61] = new ModelRendererTurbo(this, 0, 555, textureX, textureY); // Import Box61
		bodyModel[62] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import Box62
		bodyModel[63] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import Box63
		bodyModel[64] = new ModelRendererTurbo(this, 0, 555, textureX, textureY); // Import Box64
		bodyModel[65] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import Box65
		bodyModel[66] = new ModelRendererTurbo(this, 0, 555, textureX, textureY); // Import Box66
		bodyModel[67] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import Box67
		bodyModel[68] = new ModelRendererTurbo(this, 0, 555, textureX, textureY); // Import Box68
		bodyModel[69] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box69
		bodyModel[70] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box70
		bodyModel[71] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box71
		bodyModel[72] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box72
		bodyModel[73] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box73
		bodyModel[74] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box74
		bodyModel[75] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box75
		bodyModel[76] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box76
		bodyModel[77] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box77
		bodyModel[78] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box78
		bodyModel[79] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box79
		bodyModel[80] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box80
		bodyModel[81] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box81
		bodyModel[82] = new ModelRendererTurbo(this, 0, 585, textureX, textureY); // Import Box82
		bodyModel[83] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Import Box83
		bodyModel[84] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Import Box84
		bodyModel[85] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Import Box85
		bodyModel[86] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Import Box86
		bodyModel[87] = new ModelRendererTurbo(this, 0, 614, textureX, textureY); // Import Box87
		bodyModel[88] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Import Box88
		bodyModel[89] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Import Box89
		bodyModel[90] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Import Box90
		bodyModel[91] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Import Box91
		bodyModel[92] = new ModelRendererTurbo(this, 0, 614, textureX, textureY); // Import Box92
		bodyModel[93] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Import Box93
		bodyModel[94] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Import Box94
		bodyModel[95] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Import Box95
		bodyModel[96] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box96
		bodyModel[97] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box97
		bodyModel[98] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box98
		bodyModel[99] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box99
		bodyModel[100] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box100
		bodyModel[101] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box101
		bodyModel[102] = new ModelRendererTurbo(this, 0, 667, textureX, textureY); // Import Box102
		bodyModel[103] = new ModelRendererTurbo(this, 0, 684, textureX, textureY); // Import Box103
		bodyModel[104] = new ModelRendererTurbo(this, 0, 684, textureX, textureY); // Import Box104
		bodyModel[105] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box105
		bodyModel[106] = new ModelRendererTurbo(this, 0, 697, textureX, textureY); // Import Box106
		bodyModel[107] = new ModelRendererTurbo(this, 0, 697, textureX, textureY); // Import Box107
		bodyModel[108] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box108
		bodyModel[109] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Import Box109
		bodyModel[110] = new ModelRendererTurbo(this, 0, 705, textureX, textureY); // Import Box110
		bodyModel[111] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Import Box111
		bodyModel[112] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Import Box112
		bodyModel[113] = new ModelRendererTurbo(this, 0, 718, textureX, textureY); // Import Box113
		bodyModel[114] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box114
		bodyModel[115] = new ModelRendererTurbo(this, 0, 732, textureX, textureY); // Import Box115
		bodyModel[116] = new ModelRendererTurbo(this, 0, 732, textureX, textureY); // Import Box116
		bodyModel[117] = new ModelRendererTurbo(this, 0, 736, textureX, textureY); // Import Box117
		bodyModel[118] = new ModelRendererTurbo(this, 0, 736, textureX, textureY); // Import Box118
		bodyModel[119] = new ModelRendererTurbo(this, 0, 718, textureX, textureY); // Import Box119
		bodyModel[120] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box126
		bodyModel[121] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box127
		bodyModel[122] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Box129
		bodyModel[123] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Import Box130
		bodyModel[124] = new ModelRendererTurbo(this, 0, 837, textureX, textureY); // Import Box131
		bodyModel[125] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box132
		bodyModel[126] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box133
		bodyModel[127] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box134
		bodyModel[128] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import Box135
		bodyModel[129] = new ModelRendererTurbo(this, 20, 838, textureX, textureY); // Import Box136
		bodyModel[130] = new ModelRendererTurbo(this, 0, 891, textureX, textureY); // Import Box137
		bodyModel[131] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box138
		bodyModel[132] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box139
		bodyModel[133] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box140
		bodyModel[134] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box141
		bodyModel[135] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Import Box142
		bodyModel[136] = new ModelRendererTurbo(this, 0, 837, textureX, textureY); // Import Box143
		bodyModel[137] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box144
		bodyModel[138] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box145
		bodyModel[139] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box146
		bodyModel[140] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import Box147
		bodyModel[141] = new ModelRendererTurbo(this, 20, 838, textureX, textureY); // Import Box148
		bodyModel[142] = new ModelRendererTurbo(this, 0, 891, textureX, textureY); // Import Box149
		bodyModel[143] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box150
		bodyModel[144] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box151
		bodyModel[145] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box152
		bodyModel[146] = new ModelRendererTurbo(this, 0, 456, textureX, textureY); // Import Box153
		bodyModel[147] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Import Box154
		bodyModel[148] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Box154
		bodyModel[149] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Import Box155
		bodyModel[150] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Box156
		bodyModel[151] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Import Box157
		bodyModel[152] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Import Box158
		bodyModel[153] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box159
		bodyModel[154] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box160
		bodyModel[155] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box161
		bodyModel[156] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box162
		bodyModel[157] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box163
		bodyModel[158] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box164
		bodyModel[159] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box165
		bodyModel[160] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box166
		bodyModel[161] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box167
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1072, textureX, textureY); // Import Box168
		bodyModel[163] = new ModelRendererTurbo(this, 0, 983, textureX, textureY); // Import Box169
		bodyModel[164] = new ModelRendererTurbo(this, 0, 987, textureX, textureY); // Import Box171
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box172
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box173
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box174
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box175
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box176
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box177
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box178
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box179
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box180
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box181
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box182
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box183
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box184
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box185
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box186
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box187
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box188
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box189
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box190
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box191
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box192
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box193
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box194
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box195
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box196
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box197
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box198
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box199
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box200
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1028, textureX, textureY); // Import Box201
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1032, textureX, textureY); // Import Box202
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Import Box203
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Import Box204
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1116, textureX, textureY); // Import Box205
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Import Box206
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1108, textureX, textureY); // Import Box207
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Import Box209
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Import Box210
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Import Box211
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Import Box212
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Import Box213
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box214
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box215
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box216
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Import Box217
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1225, textureX, textureY); // Import Box218
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Import Box219
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Import Box220
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Import Box221
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Import Box222
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1271, textureX, textureY); // Import Box223
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1312, textureX, textureY); // Import Box224
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Import Box225
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1336, textureX, textureY); // Import Box226
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Import Box227
		bodyModel[220] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box228
		bodyModel[221] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box229
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box230
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box231
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box232
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box233
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import Box234
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1366, textureX, textureY); // Import Box235
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import Box236
		bodyModel[229] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box237
		bodyModel[230] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box238
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box239
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box240
		bodyModel[233] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box241
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box242
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1383, textureX, textureY); // Import Box261
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1395, textureX, textureY); // Import Box262
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Import Box263
		bodyModel[238] = new ModelRendererTurbo(this, 0, 1408, textureX, textureY); // Import Box264
		bodyModel[239] = new ModelRendererTurbo(this, 0, 1414, textureX, textureY); // Import Box265
		bodyModel[240] = new ModelRendererTurbo(this, 0, 1419, textureX, textureY); // Import Box266
		bodyModel[241] = new ModelRendererTurbo(this, 0, 1428, textureX, textureY); // Import Box267
		bodyModel[242] = new ModelRendererTurbo(this, 0, 1435, textureX, textureY); // Import Box266
		bodyModel[243] = new ModelRendererTurbo(this, 0, 1419, textureX, textureY); // Import Box272
		bodyModel[244] = new ModelRendererTurbo(this, 0, 1428, textureX, textureY); // Import Box273
		bodyModel[245] = new ModelRendererTurbo(this, 0, 1435, textureX, textureY); // Import Box274
		bodyModel[246] = new ModelRendererTurbo(this, 0, 1443, textureX, textureY); // Import Box275
		bodyModel[247] = new ModelRendererTurbo(this, 0, 1383, textureX, textureY); // Import Box276
		bodyModel[248] = new ModelRendererTurbo(this, 0, 1395, textureX, textureY); // Import Box277
		bodyModel[249] = new ModelRendererTurbo(this, 0, 1403, textureX, textureY); // Import Box278
		bodyModel[250] = new ModelRendererTurbo(this, 0, 1408, textureX, textureY); // Import Box279
		bodyModel[251] = new ModelRendererTurbo(this, 0, 1414, textureX, textureY); // Import Box280
		bodyModel[252] = new ModelRendererTurbo(this, 0, 1449, textureX, textureY); // Import Box281
		bodyModel[253] = new ModelRendererTurbo(this, 0, 1453, textureX, textureY); // Import Box282
		bodyModel[254] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Import Box283
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1462, textureX, textureY); // Import Box284
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1468, textureX, textureY); // Import Box285
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1443, textureX, textureY); // Import Box286
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1449, textureX, textureY); // Import Box287
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1453, textureX, textureY); // Import Box288
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Import Box289
		bodyModel[261] = new ModelRendererTurbo(this, 0, 1462, textureX, textureY); // Import Box290
		bodyModel[262] = new ModelRendererTurbo(this, 0, 1468, textureX, textureY); // Import Box291
		bodyModel[263] = new ModelRendererTurbo(this, 0, 1473, textureX, textureY); // Import Box292
		bodyModel[264] = new ModelRendererTurbo(this, 0, 1473, textureX, textureY); // Import Box293
		bodyModel[265] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Import Box294
		bodyModel[266] = new ModelRendererTurbo(this, 0, 1496, textureX, textureY); // Import Box295
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1504, textureX, textureY); // Import Box296
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1514, textureX, textureY); // Import Box297
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1521, textureX, textureY); // Import Box298
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Import Box299
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1548, textureX, textureY); // Import Box300
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1569, textureX, textureY); // Import Box301
		bodyModel[273] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Import Box302
		bodyModel[274] = new ModelRendererTurbo(this, 0, 1610, textureX, textureY); // Import Box303
		bodyModel[275] = new ModelRendererTurbo(this, 0, 1610, textureX, textureY); // Import Box304
		bodyModel[276] = new ModelRendererTurbo(this, 0, 1615, textureX, textureY); // Import Box305
		bodyModel[277] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Import Box306
		bodyModel[278] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Import Box307
		bodyModel[279] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Import Box308
		bodyModel[280] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Import Box309
		bodyModel[281] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Import Box310
		bodyModel[282] = new ModelRendererTurbo(this, 0, 1632, textureX, textureY); // Import Box311
		bodyModel[283] = new ModelRendererTurbo(this, 0, 1638, textureX, textureY); // Import Box312
		bodyModel[284] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Import Box313
		bodyModel[285] = new ModelRendererTurbo(this, 0, 1638, textureX, textureY); // Import Box314
		bodyModel[286] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Import Box315
		bodyModel[287] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Import Box316
		bodyModel[288] = new ModelRendererTurbo(this, 0, 1656, textureX, textureY); // Import Box317
		bodyModel[289] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import Box416
		bodyModel[290] = new ModelRendererTurbo(this, 0, 1366, textureX, textureY); // Import Box417
		bodyModel[291] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import Box418
		bodyModel[292] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box419
		bodyModel[293] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box420
		bodyModel[294] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box421
		bodyModel[295] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box422
		bodyModel[296] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box423
		bodyModel[297] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box424
		bodyModel[298] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Import Box425
		bodyModel[299] = new ModelRendererTurbo(this, 0, 1336, textureX, textureY); // Import Box426
		bodyModel[300] = new ModelRendererTurbo(this, 0, 1323, textureX, textureY); // Import Box427
		bodyModel[301] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box428
		bodyModel[302] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box429
		bodyModel[303] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box430
		bodyModel[304] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box431
		bodyModel[305] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box432
		bodyModel[306] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box433
		bodyModel[307] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Import Box434
		bodyModel[308] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Import Box435
		bodyModel[309] = new ModelRendererTurbo(this, 0, 622, textureX, textureY); // Import Box436
		bodyModel[310] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box437
		bodyModel[311] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box438
		bodyModel[312] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box439
		bodyModel[313] = new ModelRendererTurbo(this, 0, 654, textureX, textureY); // Import Box440
		bodyModel[314] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Import Box443
		bodyModel[315] = new ModelRendererTurbo(this, 0, 1656, textureX, textureY); // Import Box444
		bodyModel[316] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box0
		bodyModel[317] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box1
		bodyModel[318] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box2
		bodyModel[319] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box3
		bodyModel[320] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box4
		bodyModel[321] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box5
		bodyModel[322] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box6
		bodyModel[323] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box7
		bodyModel[324] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box8
		bodyModel[325] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box9
		bodyModel[326] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box10
		bodyModel[327] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box11
		bodyModel[328] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box12
		bodyModel[329] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box13
		bodyModel[330] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box14
		bodyModel[331] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box15
		bodyModel[332] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box16
		bodyModel[333] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box17
		bodyModel[334] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box18
		bodyModel[335] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box19
		bodyModel[336] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box20
		bodyModel[337] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box21
		bodyModel[338] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box22
		bodyModel[339] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box23
		bodyModel[340] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box24
		bodyModel[341] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box25
		bodyModel[342] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box26
		bodyModel[343] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box27
		bodyModel[344] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box28
		bodyModel[345] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box29
		bodyModel[346] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box30
		bodyModel[347] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Import Box31
		bodyModel[348] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box32
		bodyModel[349] = new ModelRendererTurbo(this, 0, 1670, textureX, textureY); // Import Box33
		bodyModel[350] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box34
		bodyModel[351] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box35
		bodyModel[352] = new ModelRendererTurbo(this, 0, 326, textureX, textureY); // Import Box1933
		bodyModel[353] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Import Box1934

		bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 11, 42, 0F,0F, 0F, 0F, -19F, 0F, -0.2F, -19F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(41F, -21F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 100, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-73F, -21F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, -19F, 0F, -4F, -19F, 0F, -4F, 0F, 0F, -4F); // Import Box2
		bodyModel[2].setRotationPoint(41F, -10F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 114, 11, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box3
		bodyModel[3].setRotationPoint(-73F, -10F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 124, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[4].setRotationPoint(-72F, -21F, -34F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.78947F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.78947F, 1.2F, 0F, 0F, -0.8F); // Import Box5
		bodyModel[5].setRotationPoint(42F, -21F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F); // Import Box6
		bodyModel[6].setRotationPoint(41F, -21F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[7].setRotationPoint(52F, -21F, -34F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -11F, 3F, 0F, -6F, 1.2F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, 7.01F, 3F, 0F, 6F, 1.2F); // Import Box8
		bodyModel[8].setRotationPoint(52F, -21F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box9
		bodyModel[9].setRotationPoint(63F, -19.5F, -34F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2.9F, 2F, -9.5F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2.9F, 2F, 5.501F, 1F); // Import Box10
		bodyModel[10].setRotationPoint(63F, -19.5F, -21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 124, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[11].setRotationPoint(-72F, -21F, 21F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.8F, 0F, -5.78947F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 5.78947F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[12].setRotationPoint(42F, -21F, 20F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[13].setRotationPoint(52F, -21F, 21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, -6F, 1.2F, -2F, -11F, 3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 6F, 1.2F, -2F, 7.01F, 3F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[14].setRotationPoint(52F, -21F, 20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 4, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[15].setRotationPoint(63F, -19.5F, 21F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,2F, -9.5F, 1F, 0F, -6F, -2.9F, 0F, -6F, 0F, 0F, 0F, 0F, 2F, 5.501F, 1F, 0F, 3F, -2.9F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[16].setRotationPoint(63F, -19.5F, 18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 38, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[17].setRotationPoint(14F, -21F, -35F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[18].setRotationPoint(52F, -21F, -35F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[19].setRotationPoint(52F, -15F, -35F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[20].setRotationPoint(50F, -21.5F, -35.2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[21].setRotationPoint(15F, -21.5F, -35.2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[22].setRotationPoint(20F, -17.5F, -35.2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[23].setRotationPoint(49F, -17.5F, -35.2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[24].setRotationPoint(35F, -7.5F, -35.2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[25].setRotationPoint(63.8F, -16F, -35.2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 38, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[26].setRotationPoint(14F, -21F, 34F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[27].setRotationPoint(52F, -21F, 34F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[28].setRotationPoint(52F, -15F, 34F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[29].setRotationPoint(50F, -21.5F, 34.2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[30].setRotationPoint(15F, -21.5F, 34.2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[31].setRotationPoint(20F, -17.5F, 34.2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[32].setRotationPoint(49F, -17.5F, 34.2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[33].setRotationPoint(31F, -9.5F, 34.2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[34].setRotationPoint(63.8F, -16F, 34.2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		bodyModel[35].setRotationPoint(54F, -13F, -16F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[36].setRotationPoint(61F, -13F, -16F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[37].setRotationPoint(61F, -13F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[38].setRotationPoint(61F, -10F, -17F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[39].setRotationPoint(61F, -9F, -17F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[40].setRotationPoint(61F, -9F, -13F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box41
		bodyModel[41].setRotationPoint(61F, -6F, -17F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[42].setRotationPoint(61F, -11.2F, -15.5F);

		bodyModel[43].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Import Box43
		bodyModel[43].setRotationPoint(64F, -11.2F, -15.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[44].setRotationPoint(54F, -13F, 13F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[45].setRotationPoint(61F, -13F, 15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[46].setRotationPoint(61F, -13F, 13F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[47].setRotationPoint(61F, -10F, 12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[48].setRotationPoint(61F, -9F, 16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[49].setRotationPoint(61F, -9F, 12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box50
		bodyModel[50].setRotationPoint(61F, -6F, 12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[51].setRotationPoint(61F, -11.2F, 13.5F);

		bodyModel[52].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Import Box52
		bodyModel[52].setRotationPoint(64F, -11.2F, 13.5F);

		bodyModel[53].addShapeBox(4F, -0.5F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[53].setRotationPoint(42F, -21F, -12F);
		bodyModel[53].rotateAngleZ = -0.5422738F;

		bodyModel[54].addShapeBox(4F, -0.5F, 8F, 13, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[54].setRotationPoint(42F, -21F, -21F);
		bodyModel[54].rotateAngleZ = -0.5422738F;

		bodyModel[55].addShapeBox(4F, -0.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box55
		bodyModel[55].setRotationPoint(42F, -21F, -2F);
		bodyModel[55].rotateAngleZ = -0.5422738F;

		bodyModel[56].addShapeBox(4F, -0.5F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[56].setRotationPoint(42F, -21F, 2F);
		bodyModel[56].rotateAngleZ = -0.5422738F;

		bodyModel[57].addShapeBox(4F, -0.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box57
		bodyModel[57].setRotationPoint(42F, -21F, 12F);
		bodyModel[57].rotateAngleZ = -0.5422738F;

		bodyModel[58].addShapeBox(4F, -0.5F, 0F, 13, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[58].setRotationPoint(42F, -21F, 1F);
		bodyModel[58].rotateAngleZ = -0.5422738F;

		bodyModel[59].addShapeBox(6F, -1.5F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		bodyModel[59].setRotationPoint(42F, -21F, -2F);
		bodyModel[59].rotateAngleZ = -0.5422738F;

		bodyModel[60].addShapeBox(14F, -1.5F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[60].setRotationPoint(42F, -21F, -2F);
		bodyModel[60].rotateAngleZ = -0.5422738F;

		bodyModel[61].addShapeBox(5F, -1.5F, 0F, 11, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyModel[61].setRotationPoint(42F, -21F, -4F);
		bodyModel[61].rotateAngleZ = -0.5422738F;

		bodyModel[62].addShapeBox(4F, -1.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[62].setRotationPoint(42F, -21F, -5F);
		bodyModel[62].rotateAngleZ = -0.5422738F;

		bodyModel[63].addShapeBox(4F, -1.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[63].setRotationPoint(42F, -21F, -7F);
		bodyModel[63].rotateAngleZ = -0.5422738F;

		bodyModel[64].addShapeBox(5F, -1.5F, 0F, 11, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[64].setRotationPoint(42F, -21F, -6F);
		bodyModel[64].rotateAngleZ = -0.5422738F;

		bodyModel[65].addShapeBox(4F, -1.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		bodyModel[65].setRotationPoint(42F, -21F, -9F);
		bodyModel[65].rotateAngleZ = -0.5422738F;

		bodyModel[66].addShapeBox(5F, -1.5F, 0F, 11, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[66].setRotationPoint(42F, -21F, -8F);
		bodyModel[66].rotateAngleZ = -0.5422738F;

		bodyModel[67].addShapeBox(4F, -1.5F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[67].setRotationPoint(42F, -21F, -11F);
		bodyModel[67].rotateAngleZ = -0.5422738F;

		bodyModel[68].addShapeBox(5F, -1.5F, 0F, 11, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[68].setRotationPoint(42F, -21F, -10F);
		bodyModel[68].rotateAngleZ = -0.5422738F;

		bodyModel[69].addShapeBox(6F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[69].setRotationPoint(42F, -21F, -11F);
		bodyModel[69].rotateAngleZ = -0.5422738F;

		bodyModel[70].addShapeBox(6F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[70].setRotationPoint(42F, -21F, -9F);
		bodyModel[70].rotateAngleZ = -0.5422738F;

		bodyModel[71].addShapeBox(6F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		bodyModel[71].setRotationPoint(42F, -21F, -7F);
		bodyModel[71].rotateAngleZ = -0.5422738F;

		bodyModel[72].addShapeBox(6F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		bodyModel[72].setRotationPoint(42F, -21F, -5F);
		bodyModel[72].rotateAngleZ = -0.5422738F;

		bodyModel[73].addShapeBox(13F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[73].setRotationPoint(42F, -21F, -5F);
		bodyModel[73].rotateAngleZ = -0.5422738F;

		bodyModel[74].addShapeBox(13F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[74].setRotationPoint(42F, -21F, -7F);
		bodyModel[74].rotateAngleZ = -0.5422738F;

		bodyModel[75].addShapeBox(13F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[75].setRotationPoint(42F, -21F, -9F);
		bodyModel[75].rotateAngleZ = -0.5422738F;

		bodyModel[76].addShapeBox(13F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[76].setRotationPoint(42F, -21F, -11F);
		bodyModel[76].rotateAngleZ = -0.5422738F;

		bodyModel[77].addShapeBox(9.5F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[77].setRotationPoint(42F, -21F, -5F);
		bodyModel[77].rotateAngleZ = -0.5422738F;

		bodyModel[78].addShapeBox(9.5F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[78].setRotationPoint(42F, -21F, -7F);
		bodyModel[78].rotateAngleZ = -0.5422738F;

		bodyModel[79].addShapeBox(9.5F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[79].setRotationPoint(42F, -21F, -9F);
		bodyModel[79].rotateAngleZ = -0.5422738F;

		bodyModel[80].addShapeBox(9.5F, -2.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		bodyModel[80].setRotationPoint(42F, -21F, -11F);
		bodyModel[80].rotateAngleZ = -0.5422738F;

		bodyModel[81].addShapeBox(5F, -1.5F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		bodyModel[81].setRotationPoint(42F, -21F, 2F);
		bodyModel[81].rotateAngleZ = -0.5422738F;

		bodyModel[82].addShapeBox(5F, -2.5F, 0F, 9, 1, 10, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[82].setRotationPoint(42F, -21F, 2F);
		bodyModel[82].rotateAngleZ = -0.5422738F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box83
		bodyModel[83].setRotationPoint(54F, -14F, -16F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[84].setRotationPoint(54F, -15F, -16F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[85].setRotationPoint(54F, -16F, -16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box86
		bodyModel[86].setRotationPoint(53F, -16F, -16F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box87
		bodyModel[87].setRotationPoint(53F, -15F, -16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box88
		bodyModel[88].setRotationPoint(54F, -14F, 13F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[89].setRotationPoint(54F, -15F, 13F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[90].setRotationPoint(54F, -16F, 13F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box91
		bodyModel[91].setRotationPoint(53F, -16F, 13F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box92
		bodyModel[92].setRotationPoint(53F, -15F, 13F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		bodyModel[93].setRotationPoint(19.5F, -22F, 23F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box94
		bodyModel[94].setRotationPoint(19.5F, -22.9F, 23F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box95
		bodyModel[95].setRotationPoint(19.5F, -23F, 23F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[96].setRotationPoint(19.5F, -24F, 24F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[97].setRotationPoint(19.5F, -24F, 27F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		bodyModel[98].setRotationPoint(19.5F, -24F, 32F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[99].setRotationPoint(19.5F, -24F, 29F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box100
		bodyModel[100].setRotationPoint(20.5F, -23F, 34F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box101
		bodyModel[101].setRotationPoint(37.5F, -23F, 34F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 13, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		bodyModel[102].setRotationPoint(27F, -21.5F, -17F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,-1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box103
		bodyModel[103].setRotationPoint(27F, -21.5F, -18F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box104
		bodyModel[104].setRotationPoint(27F, -21.5F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box105
		bodyModel[105].setRotationPoint(32F, -23.5F, -14F);
		bodyModel[105].rotateAngleY = -0.29670597F;

		bodyModel[106].addShapeBox(5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[106].setRotationPoint(32F, -23.5F, -14F);
		bodyModel[106].rotateAngleY = -0.29670597F;

		bodyModel[107].addShapeBox(5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		bodyModel[107].setRotationPoint(32F, -23.5F, -10F);
		bodyModel[107].rotateAngleY = -0.05235988F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box108
		bodyModel[108].setRotationPoint(32F, -23.5F, -10F);
		bodyModel[108].rotateAngleY = -0.05235988F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		bodyModel[109].setRotationPoint(28F, -22F, -20F);
		bodyModel[109].rotateAngleY = -0.34906585F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[110].setRotationPoint(32F, -22F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[111].setRotationPoint(37F, -22F, 13F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[112].setRotationPoint(37F, -22F, 16F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		bodyModel[113].setRotationPoint(37.5F, -22F, 14F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
		bodyModel[114].setRotationPoint(35F, -22F, -21F);

		bodyModel[115].addShapeBox(4F, -0.5F, 3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		bodyModel[115].setRotationPoint(42F, -21F, -21F);
		bodyModel[115].rotateAngleZ = -0.5422738F;

		bodyModel[116].addShapeBox(4F, -0.5F, 7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		bodyModel[116].setRotationPoint(42F, -21F, -21F);
		bodyModel[116].rotateAngleZ = -0.5422738F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[117].setRotationPoint(27F, -21F, -21F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[118].setRotationPoint(27F, -21F, 19F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 14, 11, 38, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyModel[119].setRotationPoint(27F, -21F, -19F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box126
		bodyModel[120].setRotationPoint(20.5F, -23F, -35F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box127
		bodyModel[121].setRotationPoint(37.5F, -23F, -35F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 57, 3, 42, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[122].setRotationPoint(-73F, -24F, -21F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 37, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		bodyModel[123].setRotationPoint(-24F, -21F, 34F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box131
		bodyModel[124].setRotationPoint(13F, -21F, 34F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[125].setRotationPoint(-23F, -21.5F, 34.2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[126].setRotationPoint(11F, -21.5F, 34.2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[127].setRotationPoint(-7F, -9.5F, 34.2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		bodyModel[128].setRotationPoint(-28F, -21F, 34F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box136
		bodyModel[129].setRotationPoint(-25F, -21F, 34F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 44, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); // Import Box137
		bodyModel[130].setRotationPoint(-72F, -21F, 34F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		bodyModel[131].setRotationPoint(-27F, -21.5F, 34.2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[132].setRotationPoint(-71F, -21.5F, 34.2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[133].setRotationPoint(-31F, -8.5F, 34.2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[134].setRotationPoint(-49F, -18.5F, 34.2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 37, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[135].setRotationPoint(-24F, -21F, -35F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[136].setRotationPoint(13F, -21F, -35F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[137].setRotationPoint(-23F, -21.5F, -35.2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		bodyModel[138].setRotationPoint(11F, -21.5F, -35.2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		bodyModel[139].setRotationPoint(-7F, -9.5F, -35.2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		bodyModel[140].setRotationPoint(-28F, -21F, -35F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F); // Import Box148
		bodyModel[141].setRotationPoint(-25F, -21F, -35F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 44, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); // Import Box149
		bodyModel[142].setRotationPoint(-72F, -21F, -35F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[143].setRotationPoint(-27F, -21.5F, -35.2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		bodyModel[144].setRotationPoint(-71F, -21.5F, -35.2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		bodyModel[145].setRotationPoint(-31F, -8.5F, -35.2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		bodyModel[146].setRotationPoint(-49F, -18.5F, -35.2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box154
		bodyModel[147].setRotationPoint(-79F, -21F, 21F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		bodyModel[148].setRotationPoint(-73F, -26F, -21F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		bodyModel[149].setRotationPoint(-73F, -27F, -21F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		bodyModel[150].setRotationPoint(-73F, -26F, 19F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		bodyModel[151].setRotationPoint(-73F, -27F, 19F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		bodyModel[152].setRotationPoint(-72F, -27F, -19F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		bodyModel[153].setRotationPoint(-48F, -25F, 17F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[154].setRotationPoint(-48F, -25F, 13F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[155].setRotationPoint(-48F, -25F, 9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[156].setRotationPoint(-48F, -25F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		bodyModel[157].setRotationPoint(-48F, -25F, 1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		bodyModel[158].setRotationPoint(-48F, -25F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		bodyModel[159].setRotationPoint(-48F, -25F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[160].setRotationPoint(-48F, -25F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		bodyModel[161].setRotationPoint(-48F, -25F, -15F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[162].setRotationPoint(-38F, -24.5F, -17F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		bodyModel[163].setRotationPoint(-48F, -25F, -19F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 22, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[164].setRotationPoint(-70F, -25F, -19F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		bodyModel[165].setRotationPoint(-52F, -26F, -18.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[166].setRotationPoint(-52F, -26F, -14.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		bodyModel[167].setRotationPoint(-52F, -26F, -10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		bodyModel[168].setRotationPoint(-52F, -26F, -6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[169].setRotationPoint(-52F, -26F, -2.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		bodyModel[170].setRotationPoint(-52F, -26F, 1.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		bodyModel[171].setRotationPoint(-52F, -26F, 5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		bodyModel[172].setRotationPoint(-52F, -26F, 9.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		bodyModel[173].setRotationPoint(-52F, -26F, 13.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		bodyModel[174].setRotationPoint(-52F, -26F, 17.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		bodyModel[175].setRotationPoint(-51F, -26F, 16.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		bodyModel[176].setRotationPoint(-51F, -26F, 12.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		bodyModel[177].setRotationPoint(-51F, -26F, 8.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		bodyModel[178].setRotationPoint(-51F, -26F, 4.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		bodyModel[179].setRotationPoint(-51F, -26F, 0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		bodyModel[180].setRotationPoint(-51F, -26F, -3.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		bodyModel[181].setRotationPoint(-51F, -26F, -7.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		bodyModel[182].setRotationPoint(-51F, -26F, -11.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		bodyModel[183].setRotationPoint(-51F, -26F, -15.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		bodyModel[184].setRotationPoint(-51F, -26F, -19.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		bodyModel[185].setRotationPoint(-51F, -26F, 18.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		bodyModel[186].setRotationPoint(-51F, -26F, 14.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		bodyModel[187].setRotationPoint(-51F, -26F, 10.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[188].setRotationPoint(-51F, -26F, 6.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		bodyModel[189].setRotationPoint(-51F, -26F, 2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		bodyModel[190].setRotationPoint(-51F, -26F, -1.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		bodyModel[191].setRotationPoint(-51F, -26F, -5.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		bodyModel[192].setRotationPoint(-51F, -26F, -9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		bodyModel[193].setRotationPoint(-51F, -26F, -13.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		bodyModel[194].setRotationPoint(-51F, -26F, -17.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		bodyModel[195].setRotationPoint(-54F, -25.5F, -19F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		bodyModel[196].setRotationPoint(-69.5F, -25.5F, -18.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		bodyModel[197].setRotationPoint(-69.5F, -25.5F, -11.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		bodyModel[198].setRotationPoint(-69.5F, -25.5F, -4.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		bodyModel[199].setRotationPoint(-69.5F, -25.5F, 12.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		bodyModel[200].setRotationPoint(-69.5F, -25.5F, 5.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		bodyModel[201].setRotationPoint(-56F, -26F, -16.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		bodyModel[202].setRotationPoint(-56F, -26F, -9.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box211
		bodyModel[203].setRotationPoint(-56F, -26F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		bodyModel[204].setRotationPoint(-56F, -26F, 14.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		bodyModel[205].setRotationPoint(-56F, -26F, 7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box214
		bodyModel[206].setRotationPoint(-80F, -24F, -21F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box215
		bodyModel[207].setRotationPoint(-80F, -24F, 19F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 8, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box216
		bodyModel[208].setRotationPoint(-80F, -24F, -19F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 8, 1, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		bodyModel[209].setRotationPoint(-81F, -16F, -21F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 6, 6, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		bodyModel[210].setRotationPoint(-79F, -22F, -19F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box219
		bodyModel[211].setRotationPoint(-78F, -23.8F, -19F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		bodyModel[212].setRotationPoint(-77F, -23.8F, -19F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		bodyModel[213].setRotationPoint(-76F, -23.8F, -19F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		bodyModel[214].setRotationPoint(-75F, -23.8F, -19F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box223
		bodyModel[215].setRotationPoint(-74F, -23.8F, -19F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		bodyModel[216].setRotationPoint(-79F, -24F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box225
		bodyModel[217].setRotationPoint(-13F, -23F, 23F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box226
		bodyModel[218].setRotationPoint(-13F, -22.9F, 23F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		bodyModel[219].setRotationPoint(-13F, -22F, 23F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box228
		bodyModel[220].setRotationPoint(16.5F, -23F, 34F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box229
		bodyModel[221].setRotationPoint(-11.5F, -23F, 34F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box230
		bodyModel[222].setRotationPoint(-13F, -24F, 32F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box231
		bodyModel[223].setRotationPoint(-13F, -24F, 29F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		bodyModel[224].setRotationPoint(-13F, -24F, 27F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		bodyModel[225].setRotationPoint(-13F, -24F, 24F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		bodyModel[226].setRotationPoint(-23.5F, -22F, 23F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box235
		bodyModel[227].setRotationPoint(-23.5F, -22.9F, 23F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box236
		bodyModel[228].setRotationPoint(-23.5F, -23F, 23F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box237
		bodyModel[229].setRotationPoint(-15.5F, -23F, 34F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box238
		bodyModel[230].setRotationPoint(-22.5F, -23F, 34F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		bodyModel[231].setRotationPoint(-23.5F, -24F, 24F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box240
		bodyModel[232].setRotationPoint(-23.5F, -24F, 27F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box241
		bodyModel[233].setRotationPoint(-23.5F, -24F, 29F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box242
		bodyModel[234].setRotationPoint(-23.5F, -24F, 32F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		bodyModel[235].setRotationPoint(-68F, -26F, -26F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 21, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		bodyModel[236].setRotationPoint(-68F, -26F, -28F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box263
		bodyModel[237].setRotationPoint(-68.5F, -25F, -26F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box264
		bodyModel[238].setRotationPoint(-69.5F, -25F, -26F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F); // Import Box265
		bodyModel[239].setRotationPoint(-72.5F, -25F, -26F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box266
		bodyModel[240].setRotationPoint(-47F, -25F, -24F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		bodyModel[241].setRotationPoint(-47F, -25F, -26F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box266
		bodyModel[242].setRotationPoint(-32F, -24F, -24F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box272
		bodyModel[243].setRotationPoint(-47F, -25F, 21F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box273
		bodyModel[244].setRotationPoint(-47F, -25F, 24F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box274
		bodyModel[245].setRotationPoint(-32F, -24F, 21F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box275
		bodyModel[246].setRotationPoint(-46F, -22F, -30F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box276
		bodyModel[247].setRotationPoint(-68F, -26F, 21F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 21, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box277
		bodyModel[248].setRotationPoint(-68F, -26F, 26F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box278
		bodyModel[249].setRotationPoint(-68.5F, -25F, 24F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box279
		bodyModel[250].setRotationPoint(-69.5F, -25F, 24F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F); // Import Box280
		bodyModel[251].setRotationPoint(-72.5F, -25F, 24F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box281
		bodyModel[252].setRotationPoint(-54F, -22F, -32F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box282
		bodyModel[253].setRotationPoint(-39F, -22F, -29F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box283
		bodyModel[254].setRotationPoint(-41F, -22F, -30F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box284
		bodyModel[255].setRotationPoint(-42F, -22F, -30F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box285
		bodyModel[256].setRotationPoint(-29F, -22F, -30F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box286
		bodyModel[257].setRotationPoint(-46F, -22F, 26F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		bodyModel[258].setRotationPoint(-54F, -22F, 31F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		bodyModel[259].setRotationPoint(-39F, -22F, 28F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box289
		bodyModel[260].setRotationPoint(-41F, -22F, 27F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box290
		bodyModel[261].setRotationPoint(-42F, -22F, 27F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		bodyModel[262].setRotationPoint(-29F, -22F, 27F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box292
		bodyModel[263].setRotationPoint(-84F, -24F, 18F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box293
		bodyModel[264].setRotationPoint(-84F, -24F, -20F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		bodyModel[265].setRotationPoint(-82F, -23F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		bodyModel[266].setRotationPoint(-83F, -23F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		bodyModel[267].setRotationPoint(-82F, -23F, -2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		bodyModel[268].setRotationPoint(-82F, -19F, -2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box298
		bodyModel[269].setRotationPoint(-81F, -24F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box299
		bodyModel[270].setRotationPoint(-74F, -13F, -9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box300
		bodyModel[271].setRotationPoint(-75F, -9F, -9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box301
		bodyModel[272].setRotationPoint(-76F, -7F, -9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box302
		bodyModel[273].setRotationPoint(-77F, -6F, -9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box303
		bodyModel[274].setRotationPoint(-77F, -5F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box304
		bodyModel[275].setRotationPoint(-77F, -5F, 7F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box305
		bodyModel[276].setRotationPoint(-74F, -4.5F, -7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box306
		bodyModel[277].setRotationPoint(-74.5F, -5F, -6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box307
		bodyModel[278].setRotationPoint(-74.5F, -5F, -4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box308
		bodyModel[279].setRotationPoint(-74.5F, -5F, -2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box309
		bodyModel[280].setRotationPoint(-74.5F, -5F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box310
		bodyModel[281].setRotationPoint(-74.5F, -5F, 3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box311
		bodyModel[282].setRotationPoint(-74.5F, -5F, 1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box312
		bodyModel[283].setRotationPoint(-75F, -9F, -15F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box313
		bodyModel[284].setRotationPoint(-76F, -6F, -15F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		bodyModel[285].setRotationPoint(-75F, -9F, 12F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		bodyModel[286].setRotationPoint(-76F, -6F, 12F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box316
		bodyModel[287].setRotationPoint(39F, -23F, 31F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Import Box317
		bodyModel[288].setRotationPoint(39F, -23F, 24F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		bodyModel[289].setRotationPoint(-23.5F, -22F, -34F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box417
		bodyModel[290].setRotationPoint(-23.5F, -22.9F, -34F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box418
		bodyModel[291].setRotationPoint(-23.5F, -23F, -34F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box419
		bodyModel[292].setRotationPoint(-15.5F, -23F, -35F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box420
		bodyModel[293].setRotationPoint(-22.5F, -23F, -35F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		bodyModel[294].setRotationPoint(-23.5F, -24F, -25F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		bodyModel[295].setRotationPoint(-23.5F, -24F, -28F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box423
		bodyModel[296].setRotationPoint(-23.5F, -24F, -30F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box424
		bodyModel[297].setRotationPoint(-23.5F, -24F, -33F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box425
		bodyModel[298].setRotationPoint(-13F, -23F, -34F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box426
		bodyModel[299].setRotationPoint(-13F, -22.9F, -34F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 32, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box427
		bodyModel[300].setRotationPoint(-13F, -22F, -34F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box428
		bodyModel[301].setRotationPoint(16.5F, -23F, -35F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box429
		bodyModel[302].setRotationPoint(-11.5F, -23F, -35F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box430
		bodyModel[303].setRotationPoint(-13F, -24F, -33F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box431
		bodyModel[304].setRotationPoint(-13F, -24F, -30F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box432
		bodyModel[305].setRotationPoint(-13F, -24F, -28F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box433
		bodyModel[306].setRotationPoint(-13F, -24F, -25F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box434
		bodyModel[307].setRotationPoint(19.5F, -22F, -34F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import Box435
		bodyModel[308].setRotationPoint(19.5F, -22.9F, -34F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box436
		bodyModel[309].setRotationPoint(19.5F, -23F, -34F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
		bodyModel[310].setRotationPoint(19.5F, -24F, -25F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box438
		bodyModel[311].setRotationPoint(19.5F, -24F, -28F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box439
		bodyModel[312].setRotationPoint(19.5F, -24F, -33F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box440
		bodyModel[313].setRotationPoint(19.5F, -24F, -30F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box443
		bodyModel[314].setRotationPoint(39F, -23F, -34F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box444
		bodyModel[315].setRotationPoint(39F, -23F, -25F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[316].setRotationPoint(41F, -3F, 16.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.1F, 0F, -5F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		bodyModel[317].setRotationPoint(41F, 0F, 16.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[318].setRotationPoint(41F, -4F, 16.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Import Box3
		bodyModel[319].setRotationPoint(41F, -3F, -23.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -0.1F, 0F, 3F, -0.1F, 0F); // Import Box4
		bodyModel[320].setRotationPoint(41F, 0F, -23.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Import Box5
		bodyModel[321].setRotationPoint(41F, -4F, -23.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[322].setRotationPoint(23F, -3F, 16.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box7
		bodyModel[323].setRotationPoint(23F, 0F, 16.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[324].setRotationPoint(23F, -4F, 16.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		bodyModel[325].setRotationPoint(2F, -4F, 16.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[326].setRotationPoint(2F, -3F, 16.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box11
		bodyModel[327].setRotationPoint(2F, 0F, 16.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[328].setRotationPoint(23F, -3F, -23.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Import Box13
		bodyModel[329].setRotationPoint(23F, 0F, -23.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[330].setRotationPoint(23F, -4F, -23.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[331].setRotationPoint(2F, -4F, -23.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[332].setRotationPoint(2F, -3F, -23.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Import Box17
		bodyModel[333].setRotationPoint(2F, 0F, -23.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[334].setRotationPoint(-17F, -3F, -23.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[335].setRotationPoint(-17F, -3F, 16.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box20
		bodyModel[336].setRotationPoint(-17F, 0F, 16.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Import Box21
		bodyModel[337].setRotationPoint(-17F, 0F, -23.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[338].setRotationPoint(-17F, -4F, -23.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[339].setRotationPoint(-17F, -4F, 16.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[340].setRotationPoint(-34F, -3F, -23.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[341].setRotationPoint(-34F, -3F, 16.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box26
		bodyModel[342].setRotationPoint(-34F, 0F, 16.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Import Box27
		bodyModel[343].setRotationPoint(-34F, 0F, -23.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[344].setRotationPoint(-34F, -4F, -23.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[345].setRotationPoint(-34F, -4F, 16.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[346].setRotationPoint(-53F, -3F, -23.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[347].setRotationPoint(-53F, -3F, 16.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box32
		bodyModel[348].setRotationPoint(-53F, 0F, 16.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Import Box33
		bodyModel[349].setRotationPoint(-53F, 0F, -23.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[350].setRotationPoint(-53F, -4F, -23.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		bodyModel[351].setRotationPoint(-53F, -4F, 16.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1933
		bodyModel[352].setRotationPoint(41F, -21F, 20F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box1934
		bodyModel[353].setRotationPoint(-79F, -21F, -34F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 1690, textureX, textureY); // Import Box315
		turretModel[1] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import Box316
		turretModel[2] = new ModelRendererTurbo(this, 0, 1747, textureX, textureY); // Import Box317
		turretModel[3] = new ModelRendererTurbo(this, 0, 1773, textureX, textureY); // Import Box318
		turretModel[4] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import Box319
		turretModel[5] = new ModelRendererTurbo(this, 0, 1855, textureX, textureY); // Import Box321
		turretModel[6] = new ModelRendererTurbo(this, 0, 1883, textureX, textureY); // Import Box322
		turretModel[7] = new ModelRendererTurbo(this, 0, 1914, textureX, textureY); // Import Box323
		turretModel[8] = new ModelRendererTurbo(this, 0, 1944, textureX, textureY); // Import Box324
		turretModel[9] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Import Box325
		turretModel[10] = new ModelRendererTurbo(this, 0, 2007, textureX, textureY); // Import Box326
		turretModel[11] = new ModelRendererTurbo(this, 0, 2034, textureX, textureY); // Import Box327
		turretModel[12] = new ModelRendererTurbo(this, 0, 2067, textureX, textureY); // Import Box328
		turretModel[13] = new ModelRendererTurbo(this, 0, 2094, textureX, textureY); // Import Box329
		turretModel[14] = new ModelRendererTurbo(this, 0, 2129, textureX, textureY); // Import Box330
		turretModel[15] = new ModelRendererTurbo(this, 0, 2157, textureX, textureY); // Import Box331
		turretModel[16] = new ModelRendererTurbo(this, 0, 2192, textureX, textureY); // Import Box332
		turretModel[17] = new ModelRendererTurbo(this, 0, 2220, textureX, textureY); // Import Box333
		turretModel[18] = new ModelRendererTurbo(this, 0, 2247, textureX, textureY); // Import Box334
		turretModel[19] = new ModelRendererTurbo(this, 0, 2274, textureX, textureY); // Import Box335
		turretModel[20] = new ModelRendererTurbo(this, 0, 2297, textureX, textureY); // Import Box336
		turretModel[21] = new ModelRendererTurbo(this, 0, 2319, textureX, textureY); // Import Box337
		turretModel[22] = new ModelRendererTurbo(this, 0, 2337, textureX, textureY); // Import Box338
		turretModel[23] = new ModelRendererTurbo(this, 0, 2358, textureX, textureY); // Import Box339
		turretModel[24] = new ModelRendererTurbo(this, 0, 2374, textureX, textureY); // Import Box340
		turretModel[25] = new ModelRendererTurbo(this, 0, 2389, textureX, textureY); // Import Box341
		turretModel[26] = new ModelRendererTurbo(this, 0, 2413, textureX, textureY); // Import Box342
		turretModel[27] = new ModelRendererTurbo(this, 0, 2440, textureX, textureY); // Import Box343
		turretModel[28] = new ModelRendererTurbo(this, 0, 2457, textureX, textureY); // Import Box344
		turretModel[29] = new ModelRendererTurbo(this, 0, 2494, textureX, textureY); // Import Box345
		turretModel[30] = new ModelRendererTurbo(this, 0, 2531, textureX, textureY); // Import Box346
		turretModel[31] = new ModelRendererTurbo(this, 0, 2564, textureX, textureY); // Import Box347
		turretModel[32] = new ModelRendererTurbo(this, 0, 2599, textureX, textureY); // Import Box348
		turretModel[33] = new ModelRendererTurbo(this, 0, 2635, textureX, textureY); // Import Box349
		turretModel[34] = new ModelRendererTurbo(this, 0, 2672, textureX, textureY); // Import Box350
		turretModel[35] = new ModelRendererTurbo(this, 0, 2672, textureX, textureY); // Import Box351
		turretModel[36] = new ModelRendererTurbo(this, 0, 2708, textureX, textureY); // Import Box352
		turretModel[37] = new ModelRendererTurbo(this, 0, 2732, textureX, textureY); // Import Box353
		turretModel[38] = new ModelRendererTurbo(this, 0, 2757, textureX, textureY); // Import Box354
		turretModel[39] = new ModelRendererTurbo(this, 0, 2766, textureX, textureY); // Import Box355
		turretModel[40] = new ModelRendererTurbo(this, 0, 2773, textureX, textureY); // Import Box356
		turretModel[41] = new ModelRendererTurbo(this, 0, 2766, textureX, textureY); // Import Box357
		turretModel[42] = new ModelRendererTurbo(this, 0, 2778, textureX, textureY); // Import Box358
		turretModel[43] = new ModelRendererTurbo(this, 0, 2783, textureX, textureY); // Import Box359
		turretModel[44] = new ModelRendererTurbo(this, 0, 2792, textureX, textureY); // Import Box360
		turretModel[45] = new ModelRendererTurbo(this, 0, 2801, textureX, textureY); // Import Box361
		turretModel[46] = new ModelRendererTurbo(this, 0, 2809, textureX, textureY); // Import Box362
		turretModel[47] = new ModelRendererTurbo(this, 0, 2809, textureX, textureY); // Import Box363
		turretModel[48] = new ModelRendererTurbo(this, 0, 2815, textureX, textureY); // Import Box364
		turretModel[49] = new ModelRendererTurbo(this, 0, 2824, textureX, textureY); // Import Box365
		turretModel[50] = new ModelRendererTurbo(this, 0, 2824, textureX, textureY); // Import Box366
		turretModel[51] = new ModelRendererTurbo(this, 0, 2830, textureX, textureY); // Import Box367
		turretModel[52] = new ModelRendererTurbo(this, 0, 2835, textureX, textureY); // Import Box368
		turretModel[53] = new ModelRendererTurbo(this, 0, 2838, textureX, textureY); // Import Box369
		turretModel[54] = new ModelRendererTurbo(this, 0, 2835, textureX, textureY); // Import Box370
		turretModel[55] = new ModelRendererTurbo(this, 0, 2848, textureX, textureY); // Import Box371
		turretModel[56] = new ModelRendererTurbo(this, 0, 2856, textureX, textureY); // Import Box372
		turretModel[57] = new ModelRendererTurbo(this, 0, 2864, textureX, textureY); // Import Box373
		turretModel[58] = new ModelRendererTurbo(this, 0, 2872, textureX, textureY); // Import Box374
		turretModel[59] = new ModelRendererTurbo(this, 0, 2884, textureX, textureY); // Import Box375
		turretModel[60] = new ModelRendererTurbo(this, 0, 2884, textureX, textureY); // Import Box376
		turretModel[61] = new ModelRendererTurbo(this, 0, 2872, textureX, textureY); // Import Box377
		turretModel[62] = new ModelRendererTurbo(this, 0, 2864, textureX, textureY); // Import Box378
		turretModel[63] = new ModelRendererTurbo(this, 0, 2856, textureX, textureY); // Import Box379
		turretModel[64] = new ModelRendererTurbo(this, 0, 2887, textureX, textureY); // Import Box381
		turretModel[65] = new ModelRendererTurbo(this, 0, 2890, textureX, textureY); // Import Box382
		turretModel[66] = new ModelRendererTurbo(this, 0, 2894, textureX, textureY); // Import Box383
		turretModel[67] = new ModelRendererTurbo(this, 0, 2909, textureX, textureY); // Import Box384
		turretModel[68] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Import Box385
		turretModel[69] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Import Box386
		turretModel[70] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Import Box387
		turretModel[71] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Import Box388
		turretModel[72] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Import Box389
		turretModel[73] = new ModelRendererTurbo(this, 0, 2918, textureX, textureY); // Import Box390
		turretModel[74] = new ModelRendererTurbo(this, 0, 2923, textureX, textureY); // Import Box391
		turretModel[75] = new ModelRendererTurbo(this, 0, 2966, textureX, textureY); // Import Box392
		turretModel[76] = new ModelRendererTurbo(this, 0, 3001, textureX, textureY); // Import Box393
		turretModel[77] = new ModelRendererTurbo(this, 0, 3037, textureX, textureY); // Import Box394
		turretModel[78] = new ModelRendererTurbo(this, 0, 3079, textureX, textureY); // Import Box395
		turretModel[79] = new ModelRendererTurbo(this, 0, 3115, textureX, textureY); // Import Box396
		turretModel[80] = new ModelRendererTurbo(this, 0, 3151, textureX, textureY); // Import Box397
		turretModel[81] = new ModelRendererTurbo(this, 0, 3164, textureX, textureY); // Import Box398
		turretModel[82] = new ModelRendererTurbo(this, 0, 3178, textureX, textureY); // Import Box399

		turretModel[0].addShapeBox(0F, 0F, 0F, 31, 6, 22, 0F,0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		turretModel[0].setRotationPoint(-26F, -40F, -22F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 10, 6, 19, 0F,0F, 0F, -15F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box316
		turretModel[1].setRotationPoint(-36F, -40F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 8, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -15F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F); // Import Box317
		turretModel[2].setRotationPoint(-36F, -40F, 0F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 28, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Import Box318
		turretModel[3].setRotationPoint(-28F, -40F, 0F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 8, 7, 18, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Import Box319
		turretModel[4].setRotationPoint(-36F, -34F, 0F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 10, 7, 19, 0F,0F, 3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box321
		turretModel[5].setRotationPoint(-36F, -34F, -19F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 5, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		turretModel[6].setRotationPoint(0F, -40F, 0F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F,0F, 0F, -6F, 0F, -5F, -7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		turretModel[7].setRotationPoint(5F, -40F, -22F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 14, 6, 24, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box324
		turretModel[8].setRotationPoint(5F, -40F, 0F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 31, 7, 22, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box325
		turretModel[9].setRotationPoint(-26F, -34F, -22F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 28, 3, 22, 0F,0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		turretModel[10].setRotationPoint(-23F, -27F, -22F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 14, 10, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		turretModel[11].setRotationPoint(5F, -34F, -22F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box328
		turretModel[12].setRotationPoint(5F, -24F, -22F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 14, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -6F, 0F, 0F, 0F); // Import Box329
		turretModel[13].setRotationPoint(5F, -34F, 0F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 2F); // Import Box330
		turretModel[14].setRotationPoint(5F, -24F, 0F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 5, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box331
		turretModel[15].setRotationPoint(0F, -34F, 0F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 5, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box332
		turretModel[16].setRotationPoint(0F, -24F, 0F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 28, 3, 22, 0F,0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.709F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box333
		turretModel[17].setRotationPoint(-23F, -24F, -22F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 28, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Import Box334
		turretModel[18].setRotationPoint(-28F, -34F, 0F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 23, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F); // Import Box335
		turretModel[19].setRotationPoint(-23F, -27F, 0F);

		turretModel[20].addShapeBox(-17F, 0F, 0F, 17, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box336
		turretModel[20].setRotationPoint(15F, -34F, 19F);
		turretModel[20].rotateAngleY = 0.3429572F;

		turretModel[21].addShapeBox(-17F, 0F, 11F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F); // Import Box337
		turretModel[21].setRotationPoint(15F, -34F, 19F);
		turretModel[21].rotateAngleY = 0.3429572F;

		turretModel[22].addShapeBox(0F, 0F, 0F, 18, 7, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Import Box338
		turretModel[22].setRotationPoint(-28F, -34F, 18F);
		turretModel[22].rotateAngleY = 0.20943951F;

		turretModel[23].addShapeBox(0F, 0F, -1F, 39, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box339
		turretModel[23].setRotationPoint(-26F, -34F, -19F);
		turretModel[23].rotateAngleY = -0.15376351F;

		turretModel[24].addShapeBox(0F, 0F, -8F, 39, 7, 7, 0F,-6F, -4F, 0F, -9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box340
		turretModel[24].setRotationPoint(-26F, -34F, -19F);
		turretModel[24].rotateAngleY = -0.15376351F;

		turretModel[25].addShapeBox(0F, 0F, 0F, 23, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 3.0714F); // Import Box341
		turretModel[25].setRotationPoint(-23F, -24F, 0F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F,0F, 0F, -9F, 0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2.709F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box342
		turretModel[26].setRotationPoint(-26F, -27F, -22F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1.0714F); // Import Box343
		turretModel[27].setRotationPoint(-26F, -27F, 0F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F); // Import Box344
		turretModel[28].setRotationPoint(6F, -41F, -16F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import Box345
		turretModel[29].setRotationPoint(-2F, -41F, -16F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 29, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import Box346
		turretModel[30].setRotationPoint(-8F, -41F, -15F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 6, 5, 29, 0F,0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box347
		turretModel[31].setRotationPoint(-8F, -38F, -15F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 5, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import Box348
		turretModel[32].setRotationPoint(-13F, -41F, -18F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 30, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box349
		turretModel[33].setRotationPoint(-13F, -38F, -18F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 28, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import Box350
		turretModel[34].setRotationPoint(-21F, -41F, -18F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 8, 5, 28, 0F,0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box351
		turretModel[35].setRotationPoint(-21F, -38F, -18F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 5, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import Box352
		turretModel[36].setRotationPoint(-26F, -41F, -11F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Import Box353
		turretModel[37].setRotationPoint(-28F, -41F, -9F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		turretModel[38].setRotationPoint(-18F, -42F, -10F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box355
		turretModel[39].setRotationPoint(-18F, -42F, -14F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box356
		turretModel[40].setRotationPoint(-16F, -42F, -16F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box357
		turretModel[41].setRotationPoint(-18F, -42F, -4F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box358
		turretModel[42].setRotationPoint(-16F, -42F, 0F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box359
		turretModel[43].setRotationPoint(-15F, -44F, -9F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box360
		turretModel[44].setRotationPoint(-15F, -44F, -13F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box361
		turretModel[45].setRotationPoint(-15F, -44F, -5F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box362
		turretModel[46].setRotationPoint(-3F, -45F, -10F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box363
		turretModel[47].setRotationPoint(-3F, -45F, -5F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box364
		turretModel[48].setRotationPoint(-3F, -46F, -10F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		turretModel[49].setRotationPoint(-12F, -45F, -13F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box366
		turretModel[50].setRotationPoint(-7F, -45F, -13F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box367
		turretModel[51].setRotationPoint(-12F, -45F, -14F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box368
		turretModel[52].setRotationPoint(5F, -42F, -12F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box369
		turretModel[53].setRotationPoint(5F, -43F, -12F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box370
		turretModel[54].setRotationPoint(5F, -42F, -7F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box371
		turretModel[55].setRotationPoint(7F, -41.5F, -4F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box372
		turretModel[56].setRotationPoint(3F, -41.5F, 4F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box373
		turretModel[57].setRotationPoint(1F, -41.5F, 4F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box374
		turretModel[58].setRotationPoint(-3F, -41.5F, 2F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box375
		turretModel[59].setRotationPoint(3F, -41.5F, 2F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box376
		turretModel[60].setRotationPoint(3F, -41.5F, 10F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box377
		turretModel[61].setRotationPoint(-8F, -41.5F, 2F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box378
		turretModel[62].setRotationPoint(-10F, -41.5F, 4F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box379
		turretModel[63].setRotationPoint(-11F, -41.5F, 4F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box381
		turretModel[64].setRotationPoint(-12F, -41.5F, 2F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box382
		turretModel[65].setRotationPoint(6F, -41.5F, 8F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box383
		turretModel[66].setRotationPoint(-38F, -37F, -3F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box384
		turretModel[67].setRotationPoint(-38F, -39F, -3F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box385
		turretModel[68].setRotationPoint(-19F, -41.5F, 3F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box386
		turretModel[69].setRotationPoint(-20F, -41.5F, 3F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box387
		turretModel[70].setRotationPoint(-18F, -41.5F, 3F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box388
		turretModel[71].setRotationPoint(-21F, -41.5F, -8F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box389
		turretModel[72].setRotationPoint(-22F, -41.5F, -8F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box390
		turretModel[73].setRotationPoint(-20F, -41.5F, -8F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 4, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box391
		turretModel[74].setRotationPoint(19F, -33F, -15F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box392
		turretModel[75].setRotationPoint(19F, -35F, -15F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box393
		turretModel[76].setRotationPoint(19F, -24F, -15F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 4, 9, 32, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Import Box394
		turretModel[77].setRotationPoint(23F, -33F, -15F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F); // Import Box395
		turretModel[78].setRotationPoint(23F, -35F, -15F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F,0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -2F); // Import Box396
		turretModel[79].setRotationPoint(23F, -24F, -15F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F); // Import Box397
		turretModel[80].setRotationPoint(23F, -30F, -4.5F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -2F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F); // Import Box398
		turretModel[81].setRotationPoint(23F, -33F, -4.5F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, 0F, -2F); // Import Box399
		turretModel[82].setRotationPoint(23F, -27F, -4.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 3192, textureX, textureY); // Import Box409
		barrelModel[1] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 400, 13, textureX, textureY); // Box 1
		barrelModel[3] = new ModelRendererTurbo(this, 400, 13, textureX, textureY); // Box 2
		barrelModel[4] = new ModelRendererTurbo(this, 400, 13, textureX, textureY); // Box 3
		barrelModel[5] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 4
		barrelModel[6] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 5
		barrelModel[7] = new ModelRendererTurbo(this, 400, 37, textureX, textureY); // Box 6
		barrelModel[8] = new ModelRendererTurbo(this, 400, 37, textureX, textureY); // Box 7
		barrelModel[9] = new ModelRendererTurbo(this, 400, 58, textureX, textureY); // Box 9
		barrelModel[10] = new ModelRendererTurbo(this, 400, 46, textureX, textureY); // Box 10
		barrelModel[11] = new ModelRendererTurbo(this, 400, 69, textureX, textureY); // Box 11
		barrelModel[12] = new ModelRendererTurbo(this, 400, 77, textureX, textureY); // Box 12
		barrelModel[13] = new ModelRendererTurbo(this, 400, 37, textureX, textureY); // Box 13
		barrelModel[14] = new ModelRendererTurbo(this, 400, 25, textureX, textureY); // Box 14
		barrelModel[15] = new ModelRendererTurbo(this, 400, 25, textureX, textureY); // Box 16
		barrelModel[16] = new ModelRendererTurbo(this, 400, 25, textureX, textureY); // Box 17

		barrelModel[0].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		barrelModel[0].setRotationPoint(26F, -30.5F, 8.5F);

		barrelModel[1].addShapeBox(0F, -1F, -3F, 70, 2, 6, 0F,0F, 0F, -0.2F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, 0F, -0.2F); // Box 0
		barrelModel[1].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[2].addShapeBox(-2F, -1F, -3F, 2, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 1
		barrelModel[2].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[3].addShapeBox(-2F, -3F, -3F, 2, 2, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 2
		barrelModel[3].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[4].addShapeBox(-2F, 1F, -3F, 2, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 3
		barrelModel[4].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[5].addShapeBox(0F, -3F, -3F, 70, 2, 6, 0F,0F, -0.2F, -2F, 0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, -0.2F, -2F, 0F, 0F, -0.2F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, 0F, -0.2F); // Box 4
		barrelModel[5].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[6].addShapeBox(0F, 1F, -3F, 70, 2, 6, 0F,0F, 0F, -0.2F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -2F, 0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, -0.2F, -2F); // Box 5
		barrelModel[6].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[7].addShapeBox(95F, -0.5F, -2.5F, 7, 1, 5, 0F,0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0.33F, 0F); // Box 6
		barrelModel[7].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[8].addShapeBox(95F, -2.5F, -2.5F, 7, 1, 5, 0F,0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 7
		barrelModel[8].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[9].addShapeBox(102F, -3F, -3F, 5, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		barrelModel[9].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[10].addShapeBox(102F, 1F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 10
		barrelModel[10].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[11].addShapeBox(102F, -1F, -3F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		barrelModel[11].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[12].addShapeBox(102F, -1F, 1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[12].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[13].addShapeBox(95F, 1.5F, -2.5F, 7, 1, 5, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, 0F, -1.66F); // Box 13
		barrelModel[13].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[14].addShapeBox(70F, -1F, -3F, 25, 2, 6, 0F,0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, -0.33F, -1F); // Box 14
		barrelModel[14].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[15].addShapeBox(70F, -3F, -3F, 25, 2, 6, 0F,0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, 0.33F, -1F); // Box 16
		barrelModel[15].setRotationPoint(29F, -28.5F, 0F);

		barrelModel[16].addShapeBox(70F, 1F, -3F, 25, 2, 6, 0F,0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, -1F, -2.33F, 0F, -1F, -2.33F); // Box 17
		barrelModel[16].setRotationPoint(29F, -28.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 3244, textureX, textureY); // Import Box413
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3255, textureX, textureY); // Import Box414
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3265, textureX, textureY); // Import Box415
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Import Box419
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Import Box420
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box421
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box422
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box423
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box424
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box425
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box426
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3302, textureX, textureY); // Import Box427
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box440
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box441
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box442
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box443
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box444
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box445
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box446
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box447
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box448
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box449
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box450
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box451
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box452
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box453
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box482
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box483
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box484
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box485
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box486
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box487
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box488
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box489
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box490
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box491
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box492
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box493
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box494
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box495
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box510
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box511
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box512
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box513
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box514
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box515
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box516
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box517
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box518
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box519
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box520
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box521
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box522
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box523
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box538
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box539
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box540
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box541
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box542
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box543
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box544
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box545
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box546
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box547
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box548
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box549
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box550
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box551
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box566
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box567
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box568
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box569
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box570
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box571
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box572
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box573
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box574
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box575
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box576
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box577
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box578
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box579
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box594
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box595
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box596
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box597
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box598
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box599
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box600
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box601
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box602
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box603
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box604
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box605
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box606
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box607
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box622
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box623
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box624
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box625
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box626
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box627
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box628
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box629
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box630
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box631
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box632
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box633
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box634
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box635

		leftTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		leftTrackWheelModels[0].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[1].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box414
		leftTrackWheelModels[1].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[2].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box415
		leftTrackWheelModels[2].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[3].addShapeBox(-6F, -2F, -1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		leftTrackWheelModels[3].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[4].addShapeBox(5F, -2F, -1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		leftTrackWheelModels[4].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[5].addShapeBox(-2F, -6F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		leftTrackWheelModels[5].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[6].addShapeBox(-2F, 5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		leftTrackWheelModels[6].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[7].addShapeBox(-6F, 5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box423
		leftTrackWheelModels[7].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Import Box424
		leftTrackWheelModels[8].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[9].addShapeBox(2F, -6F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Import Box425
		leftTrackWheelModels[9].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[10].addShapeBox(2F, 5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box426
		leftTrackWheelModels[10].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[11].addShapeBox(-1F, -1F, -0.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box427
		leftTrackWheelModels[11].setRotationPoint(61F, -9F, 24F);

		leftTrackWheelModels[12].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box440
		leftTrackWheelModels[12].setRotationPoint(43F, 0F, 24F);

		leftTrackWheelModels[13].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
		leftTrackWheelModels[13].setRotationPoint(43F, 0F, 24F);

		leftTrackWheelModels[14].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box442
		leftTrackWheelModels[14].setRotationPoint(43F, 0F, 24F);

		leftTrackWheelModels[15].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box443
		leftTrackWheelModels[15].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[16].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		leftTrackWheelModels[16].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box445
		leftTrackWheelModels[17].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[18].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box446
		leftTrackWheelModels[18].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[19].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box447
		leftTrackWheelModels[19].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[20].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box448
		leftTrackWheelModels[20].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[21].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box449
		leftTrackWheelModels[21].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[22].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box450
		leftTrackWheelModels[22].setRotationPoint(43F, 0F, 23F);

		leftTrackWheelModels[23].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box451
		leftTrackWheelModels[23].setRotationPoint(43F, 0F, 23.5F);

		leftTrackWheelModels[24].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		leftTrackWheelModels[24].setRotationPoint(43F, 0F, 23.5F);

		leftTrackWheelModels[25].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box453
		leftTrackWheelModels[25].setRotationPoint(43F, 0F, 23.5F);

		leftTrackWheelModels[26].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box482
		leftTrackWheelModels[26].setRotationPoint(25F, 0F, 24F);

		leftTrackWheelModels[27].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box483
		leftTrackWheelModels[27].setRotationPoint(25F, 0F, 24F);

		leftTrackWheelModels[28].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box484
		leftTrackWheelModels[28].setRotationPoint(25F, 0F, 24F);

		leftTrackWheelModels[29].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box485
		leftTrackWheelModels[29].setRotationPoint(25F, 0F, 23.5F);

		leftTrackWheelModels[30].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box486
		leftTrackWheelModels[30].setRotationPoint(25F, 0F, 23.5F);

		leftTrackWheelModels[31].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box487
		leftTrackWheelModels[31].setRotationPoint(25F, 0F, 23.5F);

		leftTrackWheelModels[32].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box488
		leftTrackWheelModels[32].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[33].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box489
		leftTrackWheelModels[33].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[34].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box490
		leftTrackWheelModels[34].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[35].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box491
		leftTrackWheelModels[35].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[36].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box492
		leftTrackWheelModels[36].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[37].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box493
		leftTrackWheelModels[37].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[38].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box494
		leftTrackWheelModels[38].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[39].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box495
		leftTrackWheelModels[39].setRotationPoint(25F, 0F, 23F);

		leftTrackWheelModels[40].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box510
		leftTrackWheelModels[40].setRotationPoint(4F, 0F, 23.5F);

		leftTrackWheelModels[41].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box511
		leftTrackWheelModels[41].setRotationPoint(4F, 0F, 23.5F);

		leftTrackWheelModels[42].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box512
		leftTrackWheelModels[42].setRotationPoint(4F, 0F, 23.5F);

		leftTrackWheelModels[43].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		leftTrackWheelModels[43].setRotationPoint(4F, 0F, 24F);

		leftTrackWheelModels[44].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box514
		leftTrackWheelModels[44].setRotationPoint(4F, 0F, 24F);

		leftTrackWheelModels[45].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box515
		leftTrackWheelModels[45].setRotationPoint(4F, 0F, 24F);

		leftTrackWheelModels[46].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box516
		leftTrackWheelModels[46].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[47].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box517
		leftTrackWheelModels[47].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[48].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box518
		leftTrackWheelModels[48].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[49].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box519
		leftTrackWheelModels[49].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[50].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box520
		leftTrackWheelModels[50].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[51].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box521
		leftTrackWheelModels[51].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[52].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box522
		leftTrackWheelModels[52].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[53].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box523
		leftTrackWheelModels[53].setRotationPoint(4F, 0F, 23F);

		leftTrackWheelModels[54].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box538
		leftTrackWheelModels[54].setRotationPoint(-14F, 0F, 23.5F);

		leftTrackWheelModels[55].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box539
		leftTrackWheelModels[55].setRotationPoint(-14F, 0F, 23.5F);

		leftTrackWheelModels[56].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box540
		leftTrackWheelModels[56].setRotationPoint(-14F, 0F, 23.5F);

		leftTrackWheelModels[57].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box541
		leftTrackWheelModels[57].setRotationPoint(-14F, 0F, 24F);

		leftTrackWheelModels[58].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box542
		leftTrackWheelModels[58].setRotationPoint(-14F, 0F, 24F);

		leftTrackWheelModels[59].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box543
		leftTrackWheelModels[59].setRotationPoint(-14F, 0F, 24F);

		leftTrackWheelModels[60].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box544
		leftTrackWheelModels[60].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[61].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box545
		leftTrackWheelModels[61].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[62].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box546
		leftTrackWheelModels[62].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[63].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box547
		leftTrackWheelModels[63].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[64].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box548
		leftTrackWheelModels[64].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[65].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box549
		leftTrackWheelModels[65].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[66].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box550
		leftTrackWheelModels[66].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[67].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box551
		leftTrackWheelModels[67].setRotationPoint(-14F, 0F, 23F);

		leftTrackWheelModels[68].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box566
		leftTrackWheelModels[68].setRotationPoint(-32F, 0F, 23.5F);

		leftTrackWheelModels[69].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		leftTrackWheelModels[69].setRotationPoint(-32F, 0F, 23.5F);

		leftTrackWheelModels[70].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box568
		leftTrackWheelModels[70].setRotationPoint(-32F, 0F, 23.5F);

		leftTrackWheelModels[71].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box569
		leftTrackWheelModels[71].setRotationPoint(-32F, 0F, 24F);

		leftTrackWheelModels[72].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box570
		leftTrackWheelModels[72].setRotationPoint(-32F, 0F, 24F);

		leftTrackWheelModels[73].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box571
		leftTrackWheelModels[73].setRotationPoint(-32F, 0F, 24F);

		leftTrackWheelModels[74].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box572
		leftTrackWheelModels[74].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[75].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box573
		leftTrackWheelModels[75].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[76].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box574
		leftTrackWheelModels[76].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[77].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box575
		leftTrackWheelModels[77].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[78].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box576
		leftTrackWheelModels[78].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[79].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box577
		leftTrackWheelModels[79].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[80].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box578
		leftTrackWheelModels[80].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[81].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box579
		leftTrackWheelModels[81].setRotationPoint(-32F, 0F, 23F);

		leftTrackWheelModels[82].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box594
		leftTrackWheelModels[82].setRotationPoint(-50F, 0F, 23.5F);

		leftTrackWheelModels[83].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box595
		leftTrackWheelModels[83].setRotationPoint(-50F, 0F, 23.5F);

		leftTrackWheelModels[84].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box596
		leftTrackWheelModels[84].setRotationPoint(-50F, 0F, 23.5F);

		leftTrackWheelModels[85].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box597
		leftTrackWheelModels[85].setRotationPoint(-50F, 0F, 24F);

		leftTrackWheelModels[86].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box598
		leftTrackWheelModels[86].setRotationPoint(-50F, 0F, 24F);

		leftTrackWheelModels[87].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box599
		leftTrackWheelModels[87].setRotationPoint(-50F, 0F, 24F);

		leftTrackWheelModels[88].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box600
		leftTrackWheelModels[88].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[89].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box601
		leftTrackWheelModels[89].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[90].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box602
		leftTrackWheelModels[90].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[91].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box603
		leftTrackWheelModels[91].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[92].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box604
		leftTrackWheelModels[92].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[93].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box605
		leftTrackWheelModels[93].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[94].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box606
		leftTrackWheelModels[94].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[95].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box607
		leftTrackWheelModels[95].setRotationPoint(-50F, 0F, 23F);

		leftTrackWheelModels[96].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box622
		leftTrackWheelModels[96].setRotationPoint(-68F, -7F, 23.5F);

		leftTrackWheelModels[97].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box623
		leftTrackWheelModels[97].setRotationPoint(-68F, -7F, 23.5F);

		leftTrackWheelModels[98].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box624
		leftTrackWheelModels[98].setRotationPoint(-68F, -7F, 23.5F);

		leftTrackWheelModels[99].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box625
		leftTrackWheelModels[99].setRotationPoint(-68F, -7F, 24F);

		leftTrackWheelModels[100].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box626
		leftTrackWheelModels[100].setRotationPoint(-68F, -7F, 24F);

		leftTrackWheelModels[101].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box627
		leftTrackWheelModels[101].setRotationPoint(-68F, -7F, 24F);

		leftTrackWheelModels[102].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box628
		leftTrackWheelModels[102].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[103].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box629
		leftTrackWheelModels[103].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[104].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box630
		leftTrackWheelModels[104].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[105].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box631
		leftTrackWheelModels[105].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[106].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box632
		leftTrackWheelModels[106].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[107].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box633
		leftTrackWheelModels[107].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[108].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box634
		leftTrackWheelModels[108].setRotationPoint(-68F, -7F, 23F);

		leftTrackWheelModels[109].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box635
		leftTrackWheelModels[109].setRotationPoint(-68F, -7F, 23F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 3244, textureX, textureY); // Import Box428
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3255, textureX, textureY); // Import Box429
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3265, textureX, textureY); // Import Box430
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Import Box431
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3277, textureX, textureY); // Import Box432
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box433
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box434
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box435
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box436
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box437
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3290, textureX, textureY); // Import Box438
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3302, textureX, textureY); // Import Box439
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box454
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box455
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box456
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box457
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box458
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box459
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box460
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box461
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box462
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box463
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box464
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box465
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box466
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box467
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box468
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box469
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box470
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box471
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box472
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box473
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box474
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box475
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box476
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box477
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box478
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box479
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box480
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box481
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box496
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box497
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box498
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box499
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box500
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box501
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box502
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box503
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box504
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box505
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box506
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box507
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box508
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box509
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box524
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box525
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box526
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box527
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box528
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box529
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box530
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box531
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box532
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box533
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box534
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box535
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box536
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box537
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box552
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box553
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box554
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box555
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box556
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box557
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box558
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box559
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box560
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box561
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box562
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box563
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box564
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box565
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box580
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box581
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box582
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box583
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box584
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box585
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box586
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box587
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box588
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box589
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box590
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box591
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box592
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box593
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3340, textureX, textureY); // Import Box608
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box609
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box610
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3424, textureX, textureY); // Import Box611
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3367, textureX, textureY); // Import Box612
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3355, textureX, textureY); // Import Box613
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box614
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box615
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box616
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box617
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3410, textureX, textureY); // Import Box618
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box619
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3380, textureX, textureY); // Import Box620
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3395, textureX, textureY); // Import Box621

		rightTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box428
		rightTrackWheelModels[0].setRotationPoint(61F, -9F, -30F);

		rightTrackWheelModels[1].addShapeBox(-5F, -5F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box429
		rightTrackWheelModels[1].setRotationPoint(61F, -9F, -30F);

		rightTrackWheelModels[2].addShapeBox(-5F, 2F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box430
		rightTrackWheelModels[2].setRotationPoint(61F, -9F, -30F);

		rightTrackWheelModels[3].addShapeBox(-6F, -2F, 1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box431
		rightTrackWheelModels[3].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[4].addShapeBox(5F, -2F, 1F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box432
		rightTrackWheelModels[4].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[5].addShapeBox(-2F, -6F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box433
		rightTrackWheelModels[5].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[6].addShapeBox(-2F, 5F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box434
		rightTrackWheelModels[6].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[7].addShapeBox(-6F, 5F, 1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box435
		rightTrackWheelModels[7].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[8].addShapeBox(-6F, -6F, 1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Import Box436
		rightTrackWheelModels[8].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[9].addShapeBox(2F, -6F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Import Box437
		rightTrackWheelModels[9].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[10].addShapeBox(2F, 5F, 1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box438
		rightTrackWheelModels[10].setRotationPoint(61F, -9F, -32F);

		rightTrackWheelModels[11].addShapeBox(-1F, -1F, 0.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box439
		rightTrackWheelModels[11].setRotationPoint(61F, -9F, -31F);

		rightTrackWheelModels[12].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box454
		rightTrackWheelModels[12].setRotationPoint(43F, 0F, -30F);

		rightTrackWheelModels[13].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box455
		rightTrackWheelModels[13].setRotationPoint(43F, 0F, -30F);

		rightTrackWheelModels[14].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box456
		rightTrackWheelModels[14].setRotationPoint(43F, 0F, -30F);

		rightTrackWheelModels[15].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
		rightTrackWheelModels[15].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[16].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box458
		rightTrackWheelModels[16].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box459
		rightTrackWheelModels[17].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[18].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box460
		rightTrackWheelModels[18].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[19].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box461
		rightTrackWheelModels[19].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[20].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box462
		rightTrackWheelModels[20].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[21].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box463
		rightTrackWheelModels[21].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[22].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box464
		rightTrackWheelModels[22].setRotationPoint(43F, 0F, -31F);

		rightTrackWheelModels[23].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box465
		rightTrackWheelModels[23].setRotationPoint(43F, 0F, -30.5F);

		rightTrackWheelModels[24].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box466
		rightTrackWheelModels[24].setRotationPoint(43F, 0F, -30.5F);

		rightTrackWheelModels[25].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box467
		rightTrackWheelModels[25].setRotationPoint(43F, 0F, -30.5F);

		rightTrackWheelModels[26].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box468
		rightTrackWheelModels[26].setRotationPoint(25F, 0F, -30.5F);

		rightTrackWheelModels[27].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box469
		rightTrackWheelModels[27].setRotationPoint(25F, 0F, -30.5F);

		rightTrackWheelModels[28].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box470
		rightTrackWheelModels[28].setRotationPoint(25F, 0F, -30.5F);

		rightTrackWheelModels[29].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box471
		rightTrackWheelModels[29].setRotationPoint(25F, 0F, -30F);

		rightTrackWheelModels[30].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box472
		rightTrackWheelModels[30].setRotationPoint(25F, 0F, -30F);

		rightTrackWheelModels[31].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box473
		rightTrackWheelModels[31].setRotationPoint(25F, 0F, -30F);

		rightTrackWheelModels[32].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box474
		rightTrackWheelModels[32].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[33].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box475
		rightTrackWheelModels[33].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[34].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box476
		rightTrackWheelModels[34].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[35].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box477
		rightTrackWheelModels[35].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[36].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box478
		rightTrackWheelModels[36].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[37].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box479
		rightTrackWheelModels[37].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[38].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box480
		rightTrackWheelModels[38].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[39].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box481
		rightTrackWheelModels[39].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[40].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box496
		rightTrackWheelModels[40].setRotationPoint(4F, 0F, -30F);

		rightTrackWheelModels[41].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box497
		rightTrackWheelModels[41].setRotationPoint(4F, 0F, -30.5F);

		rightTrackWheelModels[42].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box498
		rightTrackWheelModels[42].setRotationPoint(4F, 0F, -30.5F);

		rightTrackWheelModels[43].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box499
		rightTrackWheelModels[43].setRotationPoint(4F, 0F, -30.5F);

		rightTrackWheelModels[44].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box500
		rightTrackWheelModels[44].setRotationPoint(4F, 0F, -30F);

		rightTrackWheelModels[45].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box501
		rightTrackWheelModels[45].setRotationPoint(4F, 0F, -30F);

		rightTrackWheelModels[46].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box502
		rightTrackWheelModels[46].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[47].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box503
		rightTrackWheelModels[47].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[48].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box504
		rightTrackWheelModels[48].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[49].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box505
		rightTrackWheelModels[49].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[50].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box506
		rightTrackWheelModels[50].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[51].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box507
		rightTrackWheelModels[51].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[52].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box508
		rightTrackWheelModels[52].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[53].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box509
		rightTrackWheelModels[53].setRotationPoint(4F, 0F, -31F);

		rightTrackWheelModels[54].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box524
		rightTrackWheelModels[54].setRotationPoint(-14F, 0F, -30F);

		rightTrackWheelModels[55].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box525
		rightTrackWheelModels[55].setRotationPoint(-14F, 0F, -30.5F);

		rightTrackWheelModels[56].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box526
		rightTrackWheelModels[56].setRotationPoint(-14F, 0F, -30.5F);

		rightTrackWheelModels[57].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box527
		rightTrackWheelModels[57].setRotationPoint(-14F, 0F, -30.5F);

		rightTrackWheelModels[58].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box528
		rightTrackWheelModels[58].setRotationPoint(-14F, 0F, -30F);

		rightTrackWheelModels[59].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box529
		rightTrackWheelModels[59].setRotationPoint(-14F, 0F, -30F);

		rightTrackWheelModels[60].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box530
		rightTrackWheelModels[60].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[61].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box531
		rightTrackWheelModels[61].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[62].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box532
		rightTrackWheelModels[62].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[63].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box533
		rightTrackWheelModels[63].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[64].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box534
		rightTrackWheelModels[64].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[65].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box535
		rightTrackWheelModels[65].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[66].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box536
		rightTrackWheelModels[66].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[67].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box537
		rightTrackWheelModels[67].setRotationPoint(-14F, 0F, -31F);

		rightTrackWheelModels[68].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box552
		rightTrackWheelModels[68].setRotationPoint(-32F, 0F, -30F);

		rightTrackWheelModels[69].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box553
		rightTrackWheelModels[69].setRotationPoint(-32F, 0F, -30.5F);

		rightTrackWheelModels[70].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box554
		rightTrackWheelModels[70].setRotationPoint(-32F, 0F, -30.5F);

		rightTrackWheelModels[71].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box555
		rightTrackWheelModels[71].setRotationPoint(-32F, 0F, -30.5F);

		rightTrackWheelModels[72].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box556
		rightTrackWheelModels[72].setRotationPoint(-32F, 0F, -30F);

		rightTrackWheelModels[73].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box557
		rightTrackWheelModels[73].setRotationPoint(-32F, 0F, -30F);

		rightTrackWheelModels[74].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box558
		rightTrackWheelModels[74].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[75].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box559
		rightTrackWheelModels[75].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[76].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box560
		rightTrackWheelModels[76].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[77].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box561
		rightTrackWheelModels[77].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[78].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box562
		rightTrackWheelModels[78].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[79].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box563
		rightTrackWheelModels[79].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[80].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box564
		rightTrackWheelModels[80].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[81].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box565
		rightTrackWheelModels[81].setRotationPoint(-32F, 0F, -31F);

		rightTrackWheelModels[82].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box580
		rightTrackWheelModels[82].setRotationPoint(-50F, 0F, -30F);

		rightTrackWheelModels[83].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box581
		rightTrackWheelModels[83].setRotationPoint(-50F, 0F, -30.5F);

		rightTrackWheelModels[84].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box582
		rightTrackWheelModels[84].setRotationPoint(-50F, 0F, -30.5F);

		rightTrackWheelModels[85].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box583
		rightTrackWheelModels[85].setRotationPoint(-50F, 0F, -30.5F);

		rightTrackWheelModels[86].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box584
		rightTrackWheelModels[86].setRotationPoint(-50F, 0F, -30F);

		rightTrackWheelModels[87].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box585
		rightTrackWheelModels[87].setRotationPoint(-50F, 0F, -30F);

		rightTrackWheelModels[88].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box586
		rightTrackWheelModels[88].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[89].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box587
		rightTrackWheelModels[89].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[90].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box588
		rightTrackWheelModels[90].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[91].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box589
		rightTrackWheelModels[91].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[92].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box590
		rightTrackWheelModels[92].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[93].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box591
		rightTrackWheelModels[93].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[94].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box592
		rightTrackWheelModels[94].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[95].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box593
		rightTrackWheelModels[95].setRotationPoint(-50F, 0F, -31F);

		rightTrackWheelModels[96].addShapeBox(-6.5F, -2.5F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box608
		rightTrackWheelModels[96].setRotationPoint(-68F, -7F, -30F);

		rightTrackWheelModels[97].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box609
		rightTrackWheelModels[97].setRotationPoint(-68F, -7F, -30.5F);

		rightTrackWheelModels[98].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box610
		rightTrackWheelModels[98].setRotationPoint(-68F, -7F, -30.5F);

		rightTrackWheelModels[99].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box611
		rightTrackWheelModels[99].setRotationPoint(-68F, -7F, -30.5F);

		rightTrackWheelModels[100].addShapeBox(-6.5F, 2.5F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box612
		rightTrackWheelModels[100].setRotationPoint(-68F, -7F, -30F);

		rightTrackWheelModels[101].addShapeBox(-6.5F, -6.5F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box613
		rightTrackWheelModels[101].setRotationPoint(-68F, -7F, -30F);

		rightTrackWheelModels[102].addShapeBox(-2.5F, -7.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box614
		rightTrackWheelModels[102].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[103].addShapeBox(-7.5F, -7.5F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box615
		rightTrackWheelModels[103].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[104].addShapeBox(-7.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box616
		rightTrackWheelModels[104].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[105].addShapeBox(-7.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -5F, 0F, 0F); // Import Box617
		rightTrackWheelModels[105].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[106].addShapeBox(-2.5F, 6.5F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box618
		rightTrackWheelModels[106].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[107].addShapeBox(6.5F, 2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F); // Import Box619
		rightTrackWheelModels[107].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[108].addShapeBox(6.5F, -2.5F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box620
		rightTrackWheelModels[108].setRotationPoint(-68F, -7F, -31F);

		rightTrackWheelModels[109].addShapeBox(6.5F, -7.5F, 0F, 1, 5, 8, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box621
		rightTrackWheelModels[109].setRotationPoint(-68F, -7F, -31F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox6
		leftTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox7
		leftTrackModel[2] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox8
		leftTrackModel[3] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox9
		leftTrackModel[4] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox10
		leftTrackModel[5] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox11
		leftTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox12
		leftTrackModel[7] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox13
		leftTrackModel[8] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox14
		leftTrackModel[9] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox15
		leftTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox16
		leftTrackModel[11] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox17
		leftTrackModel[12] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox24
		leftTrackModel[13] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox25
		leftTrackModel[14] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox26
		leftTrackModel[15] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox27
		leftTrackModel[16] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox28
		leftTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox29
		leftTrackModel[18] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox36
		leftTrackModel[19] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox37
		leftTrackModel[20] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox38
		leftTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox39
		leftTrackModel[22] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox40
		leftTrackModel[23] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox41
		leftTrackModel[24] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox48
		leftTrackModel[25] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox49
		leftTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox50
		leftTrackModel[27] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox51
		leftTrackModel[28] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox52
		leftTrackModel[29] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox53
		leftTrackModel[30] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox60
		leftTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox61
		leftTrackModel[32] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox62
		leftTrackModel[33] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox63
		leftTrackModel[34] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox64
		leftTrackModel[35] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox65
		leftTrackModel[36] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox72
		leftTrackModel[37] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox73
		leftTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox74
		leftTrackModel[39] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox75
		leftTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox76
		leftTrackModel[41] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox77
		leftTrackModel[42] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox84
		leftTrackModel[43] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox85
		leftTrackModel[44] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox86
		leftTrackModel[45] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox87
		leftTrackModel[46] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox88
		leftTrackModel[47] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox89
		leftTrackModel[48] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox96
		leftTrackModel[49] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox97
		leftTrackModel[50] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox98
		leftTrackModel[51] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox99
		leftTrackModel[52] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox100
		leftTrackModel[53] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox101
		leftTrackModel[54] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox108
		leftTrackModel[55] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox109
		leftTrackModel[56] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox110
		leftTrackModel[57] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox111
		leftTrackModel[58] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox112
		leftTrackModel[59] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox113
		leftTrackModel[60] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox120
		leftTrackModel[61] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox121
		leftTrackModel[62] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox122
		leftTrackModel[63] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox123
		leftTrackModel[64] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox124
		leftTrackModel[65] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox125
		leftTrackModel[66] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox132
		leftTrackModel[67] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox133
		leftTrackModel[68] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox134
		leftTrackModel[69] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox135
		leftTrackModel[70] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox136
		leftTrackModel[71] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox137
		leftTrackModel[72] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox144
		leftTrackModel[73] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox145
		leftTrackModel[74] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox146
		leftTrackModel[75] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox147
		leftTrackModel[76] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox148
		leftTrackModel[77] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox149
		leftTrackModel[78] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox156
		leftTrackModel[79] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox157
		leftTrackModel[80] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox158
		leftTrackModel[81] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox159
		leftTrackModel[82] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox160
		leftTrackModel[83] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox161
		leftTrackModel[84] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox168
		leftTrackModel[85] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox169
		leftTrackModel[86] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox170
		leftTrackModel[87] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox171
		leftTrackModel[88] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox172
		leftTrackModel[89] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox173
		leftTrackModel[90] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox180
		leftTrackModel[91] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox181
		leftTrackModel[92] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox182
		leftTrackModel[93] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox183
		leftTrackModel[94] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox184
		leftTrackModel[95] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox185
		leftTrackModel[96] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox192
		leftTrackModel[97] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox193
		leftTrackModel[98] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox194
		leftTrackModel[99] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox195
		leftTrackModel[100] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox196
		leftTrackModel[101] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox197
		leftTrackModel[102] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox204
		leftTrackModel[103] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox205
		leftTrackModel[104] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox206
		leftTrackModel[105] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox207
		leftTrackModel[106] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox208
		leftTrackModel[107] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox209
		leftTrackModel[108] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox216
		leftTrackModel[109] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox217
		leftTrackModel[110] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox218
		leftTrackModel[111] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox219
		leftTrackModel[112] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox220
		leftTrackModel[113] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox221
		leftTrackModel[114] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox228
		leftTrackModel[115] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox229
		leftTrackModel[116] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox230
		leftTrackModel[117] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox231
		leftTrackModel[118] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox232
		leftTrackModel[119] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox233
		leftTrackModel[120] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox240
		leftTrackModel[121] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox241
		leftTrackModel[122] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox242
		leftTrackModel[123] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox243
		leftTrackModel[124] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox244
		leftTrackModel[125] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox245
		leftTrackModel[126] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox252
		leftTrackModel[127] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox253
		leftTrackModel[128] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox254
		leftTrackModel[129] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox255
		leftTrackModel[130] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox256
		leftTrackModel[131] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox257
		leftTrackModel[132] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox264
		leftTrackModel[133] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox265
		leftTrackModel[134] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox266
		leftTrackModel[135] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox267
		leftTrackModel[136] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox268
		leftTrackModel[137] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox269
		leftTrackModel[138] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox276
		leftTrackModel[139] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox277
		leftTrackModel[140] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox278
		leftTrackModel[141] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox279
		leftTrackModel[142] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox280
		leftTrackModel[143] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox281
		leftTrackModel[144] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox288
		leftTrackModel[145] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox289
		leftTrackModel[146] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox290
		leftTrackModel[147] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox291
		leftTrackModel[148] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox292
		leftTrackModel[149] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox293
		leftTrackModel[150] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox300
		leftTrackModel[151] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox301
		leftTrackModel[152] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox302
		leftTrackModel[153] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox303
		leftTrackModel[154] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox304
		leftTrackModel[155] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox305
		leftTrackModel[156] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox312
		leftTrackModel[157] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox313
		leftTrackModel[158] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox314
		leftTrackModel[159] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox315
		leftTrackModel[160] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox316
		leftTrackModel[161] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox317
		leftTrackModel[162] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox324
		leftTrackModel[163] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox325
		leftTrackModel[164] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox326
		leftTrackModel[165] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox327
		leftTrackModel[166] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox328
		leftTrackModel[167] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox329
		leftTrackModel[168] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox336
		leftTrackModel[169] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox337
		leftTrackModel[170] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox338
		leftTrackModel[171] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox339
		leftTrackModel[172] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox340
		leftTrackModel[173] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox341
		leftTrackModel[174] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox354
		leftTrackModel[175] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox355
		leftTrackModel[176] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox356
		leftTrackModel[177] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox357
		leftTrackModel[178] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox358
		leftTrackModel[179] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox359
		leftTrackModel[180] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox366
		leftTrackModel[181] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox367
		leftTrackModel[182] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox368
		leftTrackModel[183] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox369
		leftTrackModel[184] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox370
		leftTrackModel[185] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox371
		leftTrackModel[186] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox378
		leftTrackModel[187] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox379
		leftTrackModel[188] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox380
		leftTrackModel[189] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox381
		leftTrackModel[190] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox382
		leftTrackModel[191] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox383
		leftTrackModel[192] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox390
		leftTrackModel[193] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox391
		leftTrackModel[194] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox392
		leftTrackModel[195] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox393
		leftTrackModel[196] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox394
		leftTrackModel[197] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox395
		leftTrackModel[198] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox402
		leftTrackModel[199] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox403
		leftTrackModel[200] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox404
		leftTrackModel[201] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox405
		leftTrackModel[202] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox406
		leftTrackModel[203] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox407
		leftTrackModel[204] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox414
		leftTrackModel[205] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox415
		leftTrackModel[206] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox416
		leftTrackModel[207] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox417
		leftTrackModel[208] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox418
		leftTrackModel[209] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox419
		leftTrackModel[210] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox426
		leftTrackModel[211] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox427
		leftTrackModel[212] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox428
		leftTrackModel[213] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox429
		leftTrackModel[214] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox430
		leftTrackModel[215] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox431
		leftTrackModel[216] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox438
		leftTrackModel[217] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox439
		leftTrackModel[218] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox440
		leftTrackModel[219] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox441
		leftTrackModel[220] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox442
		leftTrackModel[221] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox443
		leftTrackModel[222] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox450
		leftTrackModel[223] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox451
		leftTrackModel[224] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox452
		leftTrackModel[225] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox453
		leftTrackModel[226] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox454
		leftTrackModel[227] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox455
		leftTrackModel[228] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox462
		leftTrackModel[229] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox463
		leftTrackModel[230] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox464
		leftTrackModel[231] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox465
		leftTrackModel[232] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox466
		leftTrackModel[233] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox467
		leftTrackModel[234] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox474
		leftTrackModel[235] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox475
		leftTrackModel[236] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox476
		leftTrackModel[237] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox477
		leftTrackModel[238] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox478
		leftTrackModel[239] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox479
		leftTrackModel[240] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox486
		leftTrackModel[241] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox487
		leftTrackModel[242] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox488
		leftTrackModel[243] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox489
		leftTrackModel[244] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox490
		leftTrackModel[245] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox491
		leftTrackModel[246] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox498
		leftTrackModel[247] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox499
		leftTrackModel[248] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox500
		leftTrackModel[249] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox501
		leftTrackModel[250] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox502
		leftTrackModel[251] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox503
		leftTrackModel[252] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox510
		leftTrackModel[253] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox511
		leftTrackModel[254] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox512
		leftTrackModel[255] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox513
		leftTrackModel[256] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox514
		leftTrackModel[257] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox515
		leftTrackModel[258] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox522
		leftTrackModel[259] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox523
		leftTrackModel[260] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox524
		leftTrackModel[261] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox525
		leftTrackModel[262] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox526
		leftTrackModel[263] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox527
		leftTrackModel[264] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox534
		leftTrackModel[265] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox535
		leftTrackModel[266] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox536
		leftTrackModel[267] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox537
		leftTrackModel[268] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox538
		leftTrackModel[269] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox539
		leftTrackModel[270] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox546
		leftTrackModel[271] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox547
		leftTrackModel[272] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox548
		leftTrackModel[273] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox549
		leftTrackModel[274] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox550
		leftTrackModel[275] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox551
		leftTrackModel[276] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox558
		leftTrackModel[277] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox559
		leftTrackModel[278] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox560
		leftTrackModel[279] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox561
		leftTrackModel[280] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox562
		leftTrackModel[281] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox563
		leftTrackModel[282] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox570
		leftTrackModel[283] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox571
		leftTrackModel[284] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox572
		leftTrackModel[285] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox573
		leftTrackModel[286] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox574
		leftTrackModel[287] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox575
		leftTrackModel[288] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox582
		leftTrackModel[289] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox583
		leftTrackModel[290] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox584
		leftTrackModel[291] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox585
		leftTrackModel[292] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox586
		leftTrackModel[293] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox587
		leftTrackModel[294] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox594
		leftTrackModel[295] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox595
		leftTrackModel[296] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox596
		leftTrackModel[297] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox597
		leftTrackModel[298] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox598
		leftTrackModel[299] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox599
		leftTrackModel[300] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox606
		leftTrackModel[301] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox607
		leftTrackModel[302] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox608
		leftTrackModel[303] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox609
		leftTrackModel[304] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox610
		leftTrackModel[305] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox611
		leftTrackModel[306] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox618
		leftTrackModel[307] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox619
		leftTrackModel[308] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox620
		leftTrackModel[309] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox621
		leftTrackModel[310] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox622
		leftTrackModel[311] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox623
		leftTrackModel[312] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox630
		leftTrackModel[313] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox631
		leftTrackModel[314] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox632
		leftTrackModel[315] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox633
		leftTrackModel[316] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox634
		leftTrackModel[317] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox635
		leftTrackModel[318] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox642
		leftTrackModel[319] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox643
		leftTrackModel[320] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox644
		leftTrackModel[321] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox645
		leftTrackModel[322] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox646
		leftTrackModel[323] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox647
		leftTrackModel[324] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox654
		leftTrackModel[325] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox655
		leftTrackModel[326] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox656
		leftTrackModel[327] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox657
		leftTrackModel[328] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox658
		leftTrackModel[329] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox659
		leftTrackModel[330] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox666
		leftTrackModel[331] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox667
		leftTrackModel[332] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox668
		leftTrackModel[333] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox669
		leftTrackModel[334] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox670
		leftTrackModel[335] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox671
		leftTrackModel[336] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox678
		leftTrackModel[337] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox679
		leftTrackModel[338] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox680
		leftTrackModel[339] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox681
		leftTrackModel[340] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox682
		leftTrackModel[341] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox683
		leftTrackModel[342] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox690
		leftTrackModel[343] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox691
		leftTrackModel[344] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox692
		leftTrackModel[345] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox693
		leftTrackModel[346] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox694
		leftTrackModel[347] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox695
		leftTrackModel[348] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox702
		leftTrackModel[349] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox703
		leftTrackModel[350] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox704
		leftTrackModel[351] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox705
		leftTrackModel[352] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox706
		leftTrackModel[353] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox707
		leftTrackModel[354] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox714
		leftTrackModel[355] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox715
		leftTrackModel[356] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox716
		leftTrackModel[357] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox717
		leftTrackModel[358] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox718
		leftTrackModel[359] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox719
		leftTrackModel[360] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox726
		leftTrackModel[361] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox727
		leftTrackModel[362] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox728
		leftTrackModel[363] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox729
		leftTrackModel[364] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox730
		leftTrackModel[365] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox731
		leftTrackModel[366] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox738
		leftTrackModel[367] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox739
		leftTrackModel[368] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox740
		leftTrackModel[369] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox741
		leftTrackModel[370] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox742
		leftTrackModel[371] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox743
		leftTrackModel[372] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox750
		leftTrackModel[373] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox751
		leftTrackModel[374] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox752
		leftTrackModel[375] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox753
		leftTrackModel[376] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox754
		leftTrackModel[377] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox755
		leftTrackModel[378] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox762
		leftTrackModel[379] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox763
		leftTrackModel[380] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox764
		leftTrackModel[381] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox765
		leftTrackModel[382] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox766
		leftTrackModel[383] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox767
		leftTrackModel[384] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox774
		leftTrackModel[385] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox775
		leftTrackModel[386] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox776
		leftTrackModel[387] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox777
		leftTrackModel[388] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox778
		leftTrackModel[389] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox779
		leftTrackModel[390] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox786
		leftTrackModel[391] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox787
		leftTrackModel[392] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox788
		leftTrackModel[393] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox789
		leftTrackModel[394] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox790
		leftTrackModel[395] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox791
		leftTrackModel[396] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox798
		leftTrackModel[397] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox799
		leftTrackModel[398] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox800
		leftTrackModel[399] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox801
		leftTrackModel[400] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox802
		leftTrackModel[401] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox803
		leftTrackModel[402] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox810
		leftTrackModel[403] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox811
		leftTrackModel[404] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox812
		leftTrackModel[405] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox813
		leftTrackModel[406] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox814
		leftTrackModel[407] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox815
		leftTrackModel[408] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox822
		leftTrackModel[409] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox823
		leftTrackModel[410] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox824
		leftTrackModel[411] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox825
		leftTrackModel[412] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox826
		leftTrackModel[413] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox827
		leftTrackModel[414] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox834
		leftTrackModel[415] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox835
		leftTrackModel[416] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox836
		leftTrackModel[417] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox837
		leftTrackModel[418] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox838
		leftTrackModel[419] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox839
		leftTrackModel[420] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox846
		leftTrackModel[421] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox847
		leftTrackModel[422] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox848
		leftTrackModel[423] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox849
		leftTrackModel[424] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox850
		leftTrackModel[425] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox851
		leftTrackModel[426] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox858
		leftTrackModel[427] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox859
		leftTrackModel[428] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox860
		leftTrackModel[429] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox861
		leftTrackModel[430] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox862
		leftTrackModel[431] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox863
		leftTrackModel[432] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox870
		leftTrackModel[433] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox871
		leftTrackModel[434] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox872
		leftTrackModel[435] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox873
		leftTrackModel[436] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox874
		leftTrackModel[437] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox875
		leftTrackModel[438] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox882
		leftTrackModel[439] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox883
		leftTrackModel[440] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox884
		leftTrackModel[441] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox885
		leftTrackModel[442] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox886
		leftTrackModel[443] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox887
		leftTrackModel[444] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox894
		leftTrackModel[445] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox895
		leftTrackModel[446] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox896
		leftTrackModel[447] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox897
		leftTrackModel[448] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox898
		leftTrackModel[449] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox899
		leftTrackModel[450] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox906
		leftTrackModel[451] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox907
		leftTrackModel[452] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox908
		leftTrackModel[453] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox909
		leftTrackModel[454] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox910
		leftTrackModel[455] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox911
		leftTrackModel[456] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox918
		leftTrackModel[457] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox919
		leftTrackModel[458] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox920
		leftTrackModel[459] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox921
		leftTrackModel[460] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox922
		leftTrackModel[461] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox923
		leftTrackModel[462] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox930
		leftTrackModel[463] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox931
		leftTrackModel[464] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox932
		leftTrackModel[465] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox933
		leftTrackModel[466] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox934
		leftTrackModel[467] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox935
		leftTrackModel[468] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox942
		leftTrackModel[469] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox943
		leftTrackModel[470] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox944
		leftTrackModel[471] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox945
		leftTrackModel[472] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox946
		leftTrackModel[473] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox947
		leftTrackModel[474] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox954
		leftTrackModel[475] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox955
		leftTrackModel[476] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox956
		leftTrackModel[477] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox957
		leftTrackModel[478] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox958
		leftTrackModel[479] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox959
		leftTrackModel[480] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox966
		leftTrackModel[481] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox967
		leftTrackModel[482] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox968
		leftTrackModel[483] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox969
		leftTrackModel[484] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox970
		leftTrackModel[485] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox971
		leftTrackModel[486] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox978
		leftTrackModel[487] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox979
		leftTrackModel[488] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox980
		leftTrackModel[489] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox981
		leftTrackModel[490] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox982
		leftTrackModel[491] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox983
		leftTrackModel[492] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox990
		leftTrackModel[493] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox991
		leftTrackModel[494] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox992
		leftTrackModel[495] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox993
		leftTrackModel[496] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox994
		leftTrackModel[497] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox995
		leftTrackModel[498] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1002
		leftTrackModel[499] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1003

		leftTrackModel[0].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		leftTrackModel[0].setRotationPoint(-68F, -15.5F, 30F);

		leftTrackModel[1].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox7
		leftTrackModel[1].setRotationPoint(-68F, -15.5F, 30F);

		leftTrackModel[2].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		leftTrackModel[2].setRotationPoint(-68F, -15.5F, 22F);

		leftTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		leftTrackModel[3].setRotationPoint(-68F, -15.5F, 22F);

		leftTrackModel[4].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		leftTrackModel[4].setRotationPoint(-68F, -15.5F, 26F);

		leftTrackModel[5].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		leftTrackModel[5].setRotationPoint(-68F, -15.5F, 21F);

		leftTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		leftTrackModel[6].setRotationPoint(-71F, -15.5F, 30F);
		leftTrackModel[6].rotateAngleZ = 0.64577182F;

		leftTrackModel[7].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox13
		leftTrackModel[7].setRotationPoint(-71F, -15.5F, 30F);
		leftTrackModel[7].rotateAngleZ = 0.64577182F;

		leftTrackModel[8].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		leftTrackModel[8].setRotationPoint(-71F, -15.5F, 22F);
		leftTrackModel[8].rotateAngleZ = 0.64577182F;

		leftTrackModel[9].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		leftTrackModel[9].setRotationPoint(-71F, -15.5F, 22F);
		leftTrackModel[9].rotateAngleZ = 0.64577182F;

		leftTrackModel[10].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox16
		leftTrackModel[10].setRotationPoint(-71F, -15.5F, 26F);
		leftTrackModel[10].rotateAngleZ = 0.64577182F;

		leftTrackModel[11].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox17
		leftTrackModel[11].setRotationPoint(-71F, -15.5F, 21F);
		leftTrackModel[11].rotateAngleZ = 0.64577182F;

		leftTrackModel[12].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		leftTrackModel[12].setRotationPoint(-73.4F, -13.7F, 30F);
		leftTrackModel[12].rotateAngleZ = 0.78539816F;

		leftTrackModel[13].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox25
		leftTrackModel[13].setRotationPoint(-73.4F, -13.7F, 30F);
		leftTrackModel[13].rotateAngleZ = 0.78539816F;

		leftTrackModel[14].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox26
		leftTrackModel[14].setRotationPoint(-73.4F, -13.7F, 22F);
		leftTrackModel[14].rotateAngleZ = 0.78539816F;

		leftTrackModel[15].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox27
		leftTrackModel[15].setRotationPoint(-73.4F, -13.7F, 22F);
		leftTrackModel[15].rotateAngleZ = 0.78539816F;

		leftTrackModel[16].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox28
		leftTrackModel[16].setRotationPoint(-73.4F, -13.7F, 26F);
		leftTrackModel[16].rotateAngleZ = 0.78539816F;

		leftTrackModel[17].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox29
		leftTrackModel[17].setRotationPoint(-73.4F, -13.7F, 21F);
		leftTrackModel[17].rotateAngleZ = 0.78539816F;

		leftTrackModel[18].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox36
		leftTrackModel[18].setRotationPoint(-75.5F, -11.7F, 30F);
		leftTrackModel[18].rotateAngleZ = 1.11701072F;

		leftTrackModel[19].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox37
		leftTrackModel[19].setRotationPoint(-75.5F, -11.7F, 30F);
		leftTrackModel[19].rotateAngleZ = 1.11701072F;

		leftTrackModel[20].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox38
		leftTrackModel[20].setRotationPoint(-75.5F, -11.7F, 22F);
		leftTrackModel[20].rotateAngleZ = 1.11701072F;

		leftTrackModel[21].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox39
		leftTrackModel[21].setRotationPoint(-75.5F, -11.7F, 22F);
		leftTrackModel[21].rotateAngleZ = 1.11701072F;

		leftTrackModel[22].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox40
		leftTrackModel[22].setRotationPoint(-75.5F, -11.7F, 26F);
		leftTrackModel[22].rotateAngleZ = 1.11701072F;

		leftTrackModel[23].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox41
		leftTrackModel[23].setRotationPoint(-75.5F, -11.7F, 21F);
		leftTrackModel[23].rotateAngleZ = 1.11701072F;

		leftTrackModel[24].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox48
		leftTrackModel[24].setRotationPoint(-76.8F, -9F, 30F);
		leftTrackModel[24].rotateAngleZ = 1.57079633F;

		leftTrackModel[25].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox49
		leftTrackModel[25].setRotationPoint(-76.8F, -9F, 30F);
		leftTrackModel[25].rotateAngleZ = 1.57079633F;

		leftTrackModel[26].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox50
		leftTrackModel[26].setRotationPoint(-76.8F, -9F, 22F);
		leftTrackModel[26].rotateAngleZ = 1.57079633F;

		leftTrackModel[27].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox51
		leftTrackModel[27].setRotationPoint(-76.8F, -9F, 22F);
		leftTrackModel[27].rotateAngleZ = 1.57079633F;

		leftTrackModel[28].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox52
		leftTrackModel[28].setRotationPoint(-76.8F, -9F, 26F);
		leftTrackModel[28].rotateAngleZ = 1.57079633F;

		leftTrackModel[29].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox53
		leftTrackModel[29].setRotationPoint(-76.8F, -9F, 21F);
		leftTrackModel[29].rotateAngleZ = 1.57079633F;

		leftTrackModel[30].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox60
		leftTrackModel[30].setRotationPoint(-76.8F, -6F, 30F);
		leftTrackModel[30].rotateAngleZ = 1.71042267F;

		leftTrackModel[31].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox61
		leftTrackModel[31].setRotationPoint(-76.8F, -6F, 30F);
		leftTrackModel[31].rotateAngleZ = 1.71042267F;

		leftTrackModel[32].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox62
		leftTrackModel[32].setRotationPoint(-76.8F, -6F, 22F);
		leftTrackModel[32].rotateAngleZ = 1.71042267F;

		leftTrackModel[33].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox63
		leftTrackModel[33].setRotationPoint(-76.8F, -6F, 22F);
		leftTrackModel[33].rotateAngleZ = 1.71042267F;

		leftTrackModel[34].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		leftTrackModel[34].setRotationPoint(-76.8F, -6F, 26F);
		leftTrackModel[34].rotateAngleZ = 1.71042267F;

		leftTrackModel[35].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox65
		leftTrackModel[35].setRotationPoint(-76.8F, -6F, 21F);
		leftTrackModel[35].rotateAngleZ = 1.71042267F;

		leftTrackModel[36].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox72
		leftTrackModel[36].setRotationPoint(-76.4F, -3F, 30F);
		leftTrackModel[36].rotateAngleZ = 2.37364778F;

		leftTrackModel[37].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox73
		leftTrackModel[37].setRotationPoint(-76.4F, -3F, 30F);
		leftTrackModel[37].rotateAngleZ = 2.37364778F;

		leftTrackModel[38].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox74
		leftTrackModel[38].setRotationPoint(-76.4F, -3F, 22F);
		leftTrackModel[38].rotateAngleZ = 2.37364778F;

		leftTrackModel[39].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox75
		leftTrackModel[39].setRotationPoint(-76.4F, -3F, 22F);
		leftTrackModel[39].rotateAngleZ = 2.37364778F;

		leftTrackModel[40].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox76
		leftTrackModel[40].setRotationPoint(-76.4F, -3F, 26F);
		leftTrackModel[40].rotateAngleZ = 2.37364778F;

		leftTrackModel[41].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox77
		leftTrackModel[41].setRotationPoint(-76.4F, -3F, 21F);
		leftTrackModel[41].rotateAngleZ = 2.37364778F;

		leftTrackModel[42].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox84
		leftTrackModel[42].setRotationPoint(-74.4F, -1F, 30F);
		leftTrackModel[42].rotateAngleZ = 2.37364778F;

		leftTrackModel[43].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox85
		leftTrackModel[43].setRotationPoint(-74.4F, -1F, 30F);
		leftTrackModel[43].rotateAngleZ = 2.37364778F;

		leftTrackModel[44].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox86
		leftTrackModel[44].setRotationPoint(-74.4F, -1F, 22F);
		leftTrackModel[44].rotateAngleZ = 2.37364778F;

		leftTrackModel[45].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		leftTrackModel[45].setRotationPoint(-74.4F, -1F, 22F);
		leftTrackModel[45].rotateAngleZ = 2.37364778F;

		leftTrackModel[46].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox88
		leftTrackModel[46].setRotationPoint(-74.4F, -1F, 26F);
		leftTrackModel[46].rotateAngleZ = 2.37364778F;

		leftTrackModel[47].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox89
		leftTrackModel[47].setRotationPoint(-74.4F, -1F, 21F);
		leftTrackModel[47].rotateAngleZ = 2.37364778F;

		leftTrackModel[48].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox96
		leftTrackModel[48].setRotationPoint(-72.4F, 1F, 30F);
		leftTrackModel[48].rotateAngleZ = 2.67035376F;

		leftTrackModel[49].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox97
		leftTrackModel[49].setRotationPoint(-72.4F, 1F, 30F);
		leftTrackModel[49].rotateAngleZ = 2.67035376F;

		leftTrackModel[50].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox98
		leftTrackModel[50].setRotationPoint(-72.4F, 1F, 22F);
		leftTrackModel[50].rotateAngleZ = 2.67035376F;

		leftTrackModel[51].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox99
		leftTrackModel[51].setRotationPoint(-72.4F, 1F, 22F);
		leftTrackModel[51].rotateAngleZ = 2.67035376F;

		leftTrackModel[52].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox100
		leftTrackModel[52].setRotationPoint(-72.4F, 1F, 26F);
		leftTrackModel[52].rotateAngleZ = 2.67035376F;

		leftTrackModel[53].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox101
		leftTrackModel[53].setRotationPoint(-72.4F, 1F, 21F);
		leftTrackModel[53].rotateAngleZ = 2.67035376F;

		leftTrackModel[54].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		leftTrackModel[54].setRotationPoint(-69.8F, 2.3F, 30F);
		leftTrackModel[54].rotateAngleZ = 2.74016693F;

		leftTrackModel[55].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox109
		leftTrackModel[55].setRotationPoint(-69.8F, 2.3F, 30F);
		leftTrackModel[55].rotateAngleZ = 2.74016693F;

		leftTrackModel[56].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox110
		leftTrackModel[56].setRotationPoint(-69.8F, 2.3F, 22F);
		leftTrackModel[56].rotateAngleZ = 2.74016693F;

		leftTrackModel[57].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox111
		leftTrackModel[57].setRotationPoint(-69.8F, 2.3F, 22F);
		leftTrackModel[57].rotateAngleZ = 2.74016693F;

		leftTrackModel[58].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox112
		leftTrackModel[58].setRotationPoint(-69.8F, 2.3F, 26F);
		leftTrackModel[58].rotateAngleZ = 2.74016693F;

		leftTrackModel[59].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox113
		leftTrackModel[59].setRotationPoint(-69.8F, 2.3F, 21F);
		leftTrackModel[59].rotateAngleZ = 2.74016693F;

		leftTrackModel[60].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox120
		leftTrackModel[60].setRotationPoint(-67.1F, 3.5F, 30F);
		leftTrackModel[60].rotateAngleZ = 2.74016693F;

		leftTrackModel[61].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox121
		leftTrackModel[61].setRotationPoint(-67.1F, 3.5F, 30F);
		leftTrackModel[61].rotateAngleZ = 2.74016693F;

		leftTrackModel[62].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
		leftTrackModel[62].setRotationPoint(-67.1F, 3.5F, 22F);
		leftTrackModel[62].rotateAngleZ = 2.74016693F;

		leftTrackModel[63].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		leftTrackModel[63].setRotationPoint(-67.1F, 3.5F, 22F);
		leftTrackModel[63].rotateAngleZ = 2.74016693F;

		leftTrackModel[64].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox124
		leftTrackModel[64].setRotationPoint(-67.1F, 3.5F, 26F);
		leftTrackModel[64].rotateAngleZ = 2.74016693F;

		leftTrackModel[65].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		leftTrackModel[65].setRotationPoint(-67.1F, 3.5F, 21F);
		leftTrackModel[65].rotateAngleZ = 2.74016693F;

		leftTrackModel[66].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox132
		leftTrackModel[66].setRotationPoint(-64.4F, 4.7F, 30F);
		leftTrackModel[66].rotateAngleZ = 2.74016693F;

		leftTrackModel[67].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox133
		leftTrackModel[67].setRotationPoint(-64.4F, 4.7F, 30F);
		leftTrackModel[67].rotateAngleZ = 2.74016693F;

		leftTrackModel[68].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox134
		leftTrackModel[68].setRotationPoint(-64.4F, 4.7F, 22F);
		leftTrackModel[68].rotateAngleZ = 2.74016693F;

		leftTrackModel[69].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox135
		leftTrackModel[69].setRotationPoint(-64.4F, 4.7F, 22F);
		leftTrackModel[69].rotateAngleZ = 2.74016693F;

		leftTrackModel[70].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox136
		leftTrackModel[70].setRotationPoint(-64.4F, 4.7F, 26F);
		leftTrackModel[70].rotateAngleZ = 2.74016693F;

		leftTrackModel[71].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox137
		leftTrackModel[71].setRotationPoint(-64.4F, 4.7F, 21F);
		leftTrackModel[71].rotateAngleZ = 2.74016693F;

		leftTrackModel[72].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox144
		leftTrackModel[72].setRotationPoint(-61.7F, 5.9F, 30F);
		leftTrackModel[72].rotateAngleZ = 2.7925268F;

		leftTrackModel[73].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox145
		leftTrackModel[73].setRotationPoint(-61.7F, 5.9F, 30F);
		leftTrackModel[73].rotateAngleZ = 2.7925268F;

		leftTrackModel[74].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		leftTrackModel[74].setRotationPoint(-61.7F, 5.9F, 22F);
		leftTrackModel[74].rotateAngleZ = 2.7925268F;

		leftTrackModel[75].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox147
		leftTrackModel[75].setRotationPoint(-61.7F, 5.9F, 22F);
		leftTrackModel[75].rotateAngleZ = 2.7925268F;

		leftTrackModel[76].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox148
		leftTrackModel[76].setRotationPoint(-61.7F, 5.9F, 26F);
		leftTrackModel[76].rotateAngleZ = 2.7925268F;

		leftTrackModel[77].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox149
		leftTrackModel[77].setRotationPoint(-61.7F, 5.9F, 21F);
		leftTrackModel[77].rotateAngleZ = 2.7925268F;

		leftTrackModel[78].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox156
		leftTrackModel[78].setRotationPoint(-58.9F, 7F, 30F);
		leftTrackModel[78].rotateAngleZ = 2.7925268F;

		leftTrackModel[79].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox157
		leftTrackModel[79].setRotationPoint(-58.9F, 7F, 30F);
		leftTrackModel[79].rotateAngleZ = 2.7925268F;

		leftTrackModel[80].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox158
		leftTrackModel[80].setRotationPoint(-58.9F, 7F, 22F);
		leftTrackModel[80].rotateAngleZ = 2.7925268F;

		leftTrackModel[81].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox159
		leftTrackModel[81].setRotationPoint(-58.9F, 7F, 22F);
		leftTrackModel[81].rotateAngleZ = 2.7925268F;

		leftTrackModel[82].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox160
		leftTrackModel[82].setRotationPoint(-58.9F, 7F, 26F);
		leftTrackModel[82].rotateAngleZ = 2.7925268F;

		leftTrackModel[83].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox161
		leftTrackModel[83].setRotationPoint(-58.9F, 7F, 21F);
		leftTrackModel[83].rotateAngleZ = 2.7925268F;

		leftTrackModel[84].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox168
		leftTrackModel[84].setRotationPoint(-56.1F, 8F, 30F);
		leftTrackModel[84].rotateAngleZ = 2.96705973F;

		leftTrackModel[85].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox169
		leftTrackModel[85].setRotationPoint(-56.1F, 8F, 30F);
		leftTrackModel[85].rotateAngleZ = 2.96705973F;

		leftTrackModel[86].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox170
		leftTrackModel[86].setRotationPoint(-56.1F, 8F, 22F);
		leftTrackModel[86].rotateAngleZ = 2.96705973F;

		leftTrackModel[87].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox171
		leftTrackModel[87].setRotationPoint(-56.1F, 8F, 22F);
		leftTrackModel[87].rotateAngleZ = 2.96705973F;

		leftTrackModel[88].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		leftTrackModel[88].setRotationPoint(-56.1F, 8F, 26F);
		leftTrackModel[88].rotateAngleZ = 2.96705973F;

		leftTrackModel[89].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		leftTrackModel[89].setRotationPoint(-56.1F, 8F, 21F);
		leftTrackModel[89].rotateAngleZ = 2.96705973F;

		leftTrackModel[90].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox180
		leftTrackModel[90].setRotationPoint(-53.1F, 8.5F, 30F);
		leftTrackModel[90].rotateAngleZ = 3.14159265F;

		leftTrackModel[91].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox181
		leftTrackModel[91].setRotationPoint(-53.1F, 8.5F, 30F);
		leftTrackModel[91].rotateAngleZ = 3.14159265F;

		leftTrackModel[92].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox182
		leftTrackModel[92].setRotationPoint(-53.1F, 8.5F, 22F);
		leftTrackModel[92].rotateAngleZ = 3.14159265F;

		leftTrackModel[93].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox183
		leftTrackModel[93].setRotationPoint(-53.1F, 8.5F, 22F);
		leftTrackModel[93].rotateAngleZ = 3.14159265F;

		leftTrackModel[94].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox184
		leftTrackModel[94].setRotationPoint(-53.1F, 8.5F, 26F);
		leftTrackModel[94].rotateAngleZ = 3.14159265F;

		leftTrackModel[95].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox185
		leftTrackModel[95].setRotationPoint(-53.1F, 8.5F, 21F);
		leftTrackModel[95].rotateAngleZ = 3.14159265F;

		leftTrackModel[96].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox192
		leftTrackModel[96].setRotationPoint(-50.1F, 8.5F, 30F);
		leftTrackModel[96].rotateAngleZ = 3.14159265F;

		leftTrackModel[97].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox193
		leftTrackModel[97].setRotationPoint(-50.1F, 8.5F, 30F);
		leftTrackModel[97].rotateAngleZ = 3.14159265F;

		leftTrackModel[98].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox194
		leftTrackModel[98].setRotationPoint(-50.1F, 8.5F, 22F);
		leftTrackModel[98].rotateAngleZ = 3.14159265F;

		leftTrackModel[99].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox195
		leftTrackModel[99].setRotationPoint(-50.1F, 8.5F, 22F);
		leftTrackModel[99].rotateAngleZ = 3.14159265F;

		leftTrackModel[100].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox196
		leftTrackModel[100].setRotationPoint(-50.1F, 8.5F, 26F);
		leftTrackModel[100].rotateAngleZ = 3.14159265F;

		leftTrackModel[101].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox197
		leftTrackModel[101].setRotationPoint(-50.1F, 8.5F, 21F);
		leftTrackModel[101].rotateAngleZ = 3.14159265F;

		leftTrackModel[102].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox204
		leftTrackModel[102].setRotationPoint(-47.1F, 8.5F, 30F);
		leftTrackModel[102].rotateAngleZ = 3.14159265F;

		leftTrackModel[103].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox205
		leftTrackModel[103].setRotationPoint(-47.1F, 8.5F, 30F);
		leftTrackModel[103].rotateAngleZ = 3.14159265F;

		leftTrackModel[104].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox206
		leftTrackModel[104].setRotationPoint(-47.1F, 8.5F, 22F);
		leftTrackModel[104].rotateAngleZ = 3.14159265F;

		leftTrackModel[105].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox207
		leftTrackModel[105].setRotationPoint(-47.1F, 8.5F, 22F);
		leftTrackModel[105].rotateAngleZ = 3.14159265F;

		leftTrackModel[106].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox208
		leftTrackModel[106].setRotationPoint(-47.1F, 8.5F, 26F);
		leftTrackModel[106].rotateAngleZ = 3.14159265F;

		leftTrackModel[107].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox209
		leftTrackModel[107].setRotationPoint(-47.1F, 8.5F, 21F);
		leftTrackModel[107].rotateAngleZ = 3.14159265F;

		leftTrackModel[108].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox216
		leftTrackModel[108].setRotationPoint(-44.1F, 8.5F, 30F);
		leftTrackModel[108].rotateAngleZ = 3.14159265F;

		leftTrackModel[109].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox217
		leftTrackModel[109].setRotationPoint(-44.1F, 8.5F, 30F);
		leftTrackModel[109].rotateAngleZ = 3.14159265F;

		leftTrackModel[110].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox218
		leftTrackModel[110].setRotationPoint(-44.1F, 8.5F, 22F);
		leftTrackModel[110].rotateAngleZ = 3.14159265F;

		leftTrackModel[111].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox219
		leftTrackModel[111].setRotationPoint(-44.1F, 8.5F, 22F);
		leftTrackModel[111].rotateAngleZ = 3.14159265F;

		leftTrackModel[112].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox220
		leftTrackModel[112].setRotationPoint(-44.1F, 8.5F, 26F);
		leftTrackModel[112].rotateAngleZ = 3.14159265F;

		leftTrackModel[113].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox221
		leftTrackModel[113].setRotationPoint(-44.1F, 8.5F, 21F);
		leftTrackModel[113].rotateAngleZ = 3.14159265F;

		leftTrackModel[114].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox228
		leftTrackModel[114].setRotationPoint(-41.1F, 8.5F, 30F);
		leftTrackModel[114].rotateAngleZ = 3.14159265F;

		leftTrackModel[115].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox229
		leftTrackModel[115].setRotationPoint(-41.1F, 8.5F, 30F);
		leftTrackModel[115].rotateAngleZ = 3.14159265F;

		leftTrackModel[116].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox230
		leftTrackModel[116].setRotationPoint(-41.1F, 8.5F, 22F);
		leftTrackModel[116].rotateAngleZ = 3.14159265F;

		leftTrackModel[117].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox231
		leftTrackModel[117].setRotationPoint(-41.1F, 8.5F, 22F);
		leftTrackModel[117].rotateAngleZ = 3.14159265F;

		leftTrackModel[118].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox232
		leftTrackModel[118].setRotationPoint(-41.1F, 8.5F, 26F);
		leftTrackModel[118].rotateAngleZ = 3.14159265F;

		leftTrackModel[119].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox233
		leftTrackModel[119].setRotationPoint(-41.1F, 8.5F, 21F);
		leftTrackModel[119].rotateAngleZ = 3.14159265F;

		leftTrackModel[120].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox240
		leftTrackModel[120].setRotationPoint(-38.1F, 8.5F, 30F);
		leftTrackModel[120].rotateAngleZ = 3.14159265F;

		leftTrackModel[121].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox241
		leftTrackModel[121].setRotationPoint(-38.1F, 8.5F, 30F);
		leftTrackModel[121].rotateAngleZ = 3.14159265F;

		leftTrackModel[122].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox242
		leftTrackModel[122].setRotationPoint(-38.1F, 8.5F, 22F);
		leftTrackModel[122].rotateAngleZ = 3.14159265F;

		leftTrackModel[123].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox243
		leftTrackModel[123].setRotationPoint(-38.1F, 8.5F, 22F);
		leftTrackModel[123].rotateAngleZ = 3.14159265F;

		leftTrackModel[124].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox244
		leftTrackModel[124].setRotationPoint(-38.1F, 8.5F, 26F);
		leftTrackModel[124].rotateAngleZ = 3.14159265F;

		leftTrackModel[125].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox245
		leftTrackModel[125].setRotationPoint(-38.1F, 8.5F, 21F);
		leftTrackModel[125].rotateAngleZ = 3.14159265F;

		leftTrackModel[126].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox252
		leftTrackModel[126].setRotationPoint(-35.1F, 8.5F, 30F);
		leftTrackModel[126].rotateAngleZ = 3.14159265F;

		leftTrackModel[127].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox253
		leftTrackModel[127].setRotationPoint(-35.1F, 8.5F, 30F);
		leftTrackModel[127].rotateAngleZ = 3.14159265F;

		leftTrackModel[128].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox254
		leftTrackModel[128].setRotationPoint(-35.1F, 8.5F, 22F);
		leftTrackModel[128].rotateAngleZ = 3.14159265F;

		leftTrackModel[129].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox255
		leftTrackModel[129].setRotationPoint(-35.1F, 8.5F, 22F);
		leftTrackModel[129].rotateAngleZ = 3.14159265F;

		leftTrackModel[130].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox256
		leftTrackModel[130].setRotationPoint(-35.1F, 8.5F, 26F);
		leftTrackModel[130].rotateAngleZ = 3.14159265F;

		leftTrackModel[131].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox257
		leftTrackModel[131].setRotationPoint(-35.1F, 8.5F, 21F);
		leftTrackModel[131].rotateAngleZ = 3.14159265F;

		leftTrackModel[132].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox264
		leftTrackModel[132].setRotationPoint(-32.1F, 8.5F, 30F);
		leftTrackModel[132].rotateAngleZ = 3.14159265F;

		leftTrackModel[133].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox265
		leftTrackModel[133].setRotationPoint(-32.1F, 8.5F, 30F);
		leftTrackModel[133].rotateAngleZ = 3.14159265F;

		leftTrackModel[134].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox266
		leftTrackModel[134].setRotationPoint(-32.1F, 8.5F, 22F);
		leftTrackModel[134].rotateAngleZ = 3.14159265F;

		leftTrackModel[135].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox267
		leftTrackModel[135].setRotationPoint(-32.1F, 8.5F, 22F);
		leftTrackModel[135].rotateAngleZ = 3.14159265F;

		leftTrackModel[136].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox268
		leftTrackModel[136].setRotationPoint(-32.1F, 8.5F, 26F);
		leftTrackModel[136].rotateAngleZ = 3.14159265F;

		leftTrackModel[137].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox269
		leftTrackModel[137].setRotationPoint(-32.1F, 8.5F, 21F);
		leftTrackModel[137].rotateAngleZ = 3.14159265F;

		leftTrackModel[138].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox276
		leftTrackModel[138].setRotationPoint(-29.1F, 8.5F, 30F);
		leftTrackModel[138].rotateAngleZ = 3.14159265F;

		leftTrackModel[139].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox277
		leftTrackModel[139].setRotationPoint(-29.1F, 8.5F, 30F);
		leftTrackModel[139].rotateAngleZ = 3.14159265F;

		leftTrackModel[140].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox278
		leftTrackModel[140].setRotationPoint(-29.1F, 8.5F, 22F);
		leftTrackModel[140].rotateAngleZ = 3.14159265F;

		leftTrackModel[141].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox279
		leftTrackModel[141].setRotationPoint(-29.1F, 8.5F, 22F);
		leftTrackModel[141].rotateAngleZ = 3.14159265F;

		leftTrackModel[142].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox280
		leftTrackModel[142].setRotationPoint(-29.1F, 8.5F, 26F);
		leftTrackModel[142].rotateAngleZ = 3.14159265F;

		leftTrackModel[143].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox281
		leftTrackModel[143].setRotationPoint(-29.1F, 8.5F, 21F);
		leftTrackModel[143].rotateAngleZ = 3.14159265F;

		leftTrackModel[144].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox288
		leftTrackModel[144].setRotationPoint(-26.1F, 8.5F, 30F);
		leftTrackModel[144].rotateAngleZ = 3.14159265F;

		leftTrackModel[145].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox289
		leftTrackModel[145].setRotationPoint(-26.1F, 8.5F, 30F);
		leftTrackModel[145].rotateAngleZ = 3.14159265F;

		leftTrackModel[146].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox290
		leftTrackModel[146].setRotationPoint(-26.1F, 8.5F, 22F);
		leftTrackModel[146].rotateAngleZ = 3.14159265F;

		leftTrackModel[147].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox291
		leftTrackModel[147].setRotationPoint(-26.1F, 8.5F, 22F);
		leftTrackModel[147].rotateAngleZ = 3.14159265F;

		leftTrackModel[148].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox292
		leftTrackModel[148].setRotationPoint(-26.1F, 8.5F, 26F);
		leftTrackModel[148].rotateAngleZ = 3.14159265F;

		leftTrackModel[149].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox293
		leftTrackModel[149].setRotationPoint(-26.1F, 8.5F, 21F);
		leftTrackModel[149].rotateAngleZ = 3.14159265F;

		leftTrackModel[150].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox300
		leftTrackModel[150].setRotationPoint(-23.1F, 8.5F, 30F);
		leftTrackModel[150].rotateAngleZ = 3.14159265F;

		leftTrackModel[151].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox301
		leftTrackModel[151].setRotationPoint(-23.1F, 8.5F, 30F);
		leftTrackModel[151].rotateAngleZ = 3.14159265F;

		leftTrackModel[152].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox302
		leftTrackModel[152].setRotationPoint(-23.1F, 8.5F, 22F);
		leftTrackModel[152].rotateAngleZ = 3.14159265F;

		leftTrackModel[153].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox303
		leftTrackModel[153].setRotationPoint(-23.1F, 8.5F, 22F);
		leftTrackModel[153].rotateAngleZ = 3.14159265F;

		leftTrackModel[154].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox304
		leftTrackModel[154].setRotationPoint(-23.1F, 8.5F, 26F);
		leftTrackModel[154].rotateAngleZ = 3.14159265F;

		leftTrackModel[155].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox305
		leftTrackModel[155].setRotationPoint(-23.1F, 8.5F, 21F);
		leftTrackModel[155].rotateAngleZ = 3.14159265F;

		leftTrackModel[156].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox312
		leftTrackModel[156].setRotationPoint(-20.1F, 8.5F, 30F);
		leftTrackModel[156].rotateAngleZ = 3.14159265F;

		leftTrackModel[157].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox313
		leftTrackModel[157].setRotationPoint(-20.1F, 8.5F, 30F);
		leftTrackModel[157].rotateAngleZ = 3.14159265F;

		leftTrackModel[158].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox314
		leftTrackModel[158].setRotationPoint(-20.1F, 8.5F, 22F);
		leftTrackModel[158].rotateAngleZ = 3.14159265F;

		leftTrackModel[159].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox315
		leftTrackModel[159].setRotationPoint(-20.1F, 8.5F, 22F);
		leftTrackModel[159].rotateAngleZ = 3.14159265F;

		leftTrackModel[160].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox316
		leftTrackModel[160].setRotationPoint(-20.1F, 8.5F, 26F);
		leftTrackModel[160].rotateAngleZ = 3.14159265F;

		leftTrackModel[161].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox317
		leftTrackModel[161].setRotationPoint(-20.1F, 8.5F, 21F);
		leftTrackModel[161].rotateAngleZ = 3.14159265F;

		leftTrackModel[162].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox324
		leftTrackModel[162].setRotationPoint(-17.1F, 8.5F, 30F);
		leftTrackModel[162].rotateAngleZ = 3.14159265F;

		leftTrackModel[163].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox325
		leftTrackModel[163].setRotationPoint(-17.1F, 8.5F, 30F);
		leftTrackModel[163].rotateAngleZ = 3.14159265F;

		leftTrackModel[164].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox326
		leftTrackModel[164].setRotationPoint(-17.1F, 8.5F, 22F);
		leftTrackModel[164].rotateAngleZ = 3.14159265F;

		leftTrackModel[165].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox327
		leftTrackModel[165].setRotationPoint(-17.1F, 8.5F, 22F);
		leftTrackModel[165].rotateAngleZ = 3.14159265F;

		leftTrackModel[166].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox328
		leftTrackModel[166].setRotationPoint(-17.1F, 8.5F, 26F);
		leftTrackModel[166].rotateAngleZ = 3.14159265F;

		leftTrackModel[167].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox329
		leftTrackModel[167].setRotationPoint(-17.1F, 8.5F, 21F);
		leftTrackModel[167].rotateAngleZ = 3.14159265F;

		leftTrackModel[168].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox336
		leftTrackModel[168].setRotationPoint(-14.1F, 8.5F, 30F);
		leftTrackModel[168].rotateAngleZ = 3.14159265F;

		leftTrackModel[169].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox337
		leftTrackModel[169].setRotationPoint(-14.1F, 8.5F, 30F);
		leftTrackModel[169].rotateAngleZ = 3.14159265F;

		leftTrackModel[170].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox338
		leftTrackModel[170].setRotationPoint(-14.1F, 8.5F, 22F);
		leftTrackModel[170].rotateAngleZ = 3.14159265F;

		leftTrackModel[171].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox339
		leftTrackModel[171].setRotationPoint(-14.1F, 8.5F, 22F);
		leftTrackModel[171].rotateAngleZ = 3.14159265F;

		leftTrackModel[172].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox340
		leftTrackModel[172].setRotationPoint(-14.1F, 8.5F, 26F);
		leftTrackModel[172].rotateAngleZ = 3.14159265F;

		leftTrackModel[173].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox341
		leftTrackModel[173].setRotationPoint(-14.1F, 8.5F, 21F);
		leftTrackModel[173].rotateAngleZ = 3.14159265F;

		leftTrackModel[174].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox354
		leftTrackModel[174].setRotationPoint(-11.1F, 8.5F, 22F);
		leftTrackModel[174].rotateAngleZ = 3.14159265F;

		leftTrackModel[175].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox355
		leftTrackModel[175].setRotationPoint(-11.1F, 8.5F, 22F);
		leftTrackModel[175].rotateAngleZ = 3.14159265F;

		leftTrackModel[176].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		leftTrackModel[176].setRotationPoint(-11.1F, 8.5F, 26F);
		leftTrackModel[176].rotateAngleZ = 3.14159265F;

		leftTrackModel[177].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox357
		leftTrackModel[177].setRotationPoint(-11.1F, 8.5F, 30F);
		leftTrackModel[177].rotateAngleZ = 3.14159265F;

		leftTrackModel[178].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox358
		leftTrackModel[178].setRotationPoint(-11.1F, 8.5F, 30F);
		leftTrackModel[178].rotateAngleZ = 3.14159265F;

		leftTrackModel[179].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox359
		leftTrackModel[179].setRotationPoint(-11.1F, 8.5F, 21F);
		leftTrackModel[179].rotateAngleZ = 3.14159265F;

		leftTrackModel[180].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox366
		leftTrackModel[180].setRotationPoint(-8.1F, 8.5F, 22F);
		leftTrackModel[180].rotateAngleZ = 3.14159265F;

		leftTrackModel[181].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox367
		leftTrackModel[181].setRotationPoint(-8.1F, 8.5F, 22F);
		leftTrackModel[181].rotateAngleZ = 3.14159265F;

		leftTrackModel[182].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox368
		leftTrackModel[182].setRotationPoint(-8.1F, 8.5F, 26F);
		leftTrackModel[182].rotateAngleZ = 3.14159265F;

		leftTrackModel[183].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox369
		leftTrackModel[183].setRotationPoint(-8.1F, 8.5F, 30F);
		leftTrackModel[183].rotateAngleZ = 3.14159265F;

		leftTrackModel[184].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox370
		leftTrackModel[184].setRotationPoint(-8.1F, 8.5F, 30F);
		leftTrackModel[184].rotateAngleZ = 3.14159265F;

		leftTrackModel[185].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox371
		leftTrackModel[185].setRotationPoint(-8.1F, 8.5F, 21F);
		leftTrackModel[185].rotateAngleZ = 3.14159265F;

		leftTrackModel[186].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox378
		leftTrackModel[186].setRotationPoint(-5.1F, 8.5F, 22F);
		leftTrackModel[186].rotateAngleZ = 3.14159265F;

		leftTrackModel[187].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox379
		leftTrackModel[187].setRotationPoint(-5.1F, 8.5F, 22F);
		leftTrackModel[187].rotateAngleZ = 3.14159265F;

		leftTrackModel[188].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox380
		leftTrackModel[188].setRotationPoint(-5.1F, 8.5F, 26F);
		leftTrackModel[188].rotateAngleZ = 3.14159265F;

		leftTrackModel[189].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox381
		leftTrackModel[189].setRotationPoint(-5.1F, 8.5F, 30F);
		leftTrackModel[189].rotateAngleZ = 3.14159265F;

		leftTrackModel[190].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox382
		leftTrackModel[190].setRotationPoint(-5.1F, 8.5F, 30F);
		leftTrackModel[190].rotateAngleZ = 3.14159265F;

		leftTrackModel[191].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox383
		leftTrackModel[191].setRotationPoint(-5.1F, 8.5F, 21F);
		leftTrackModel[191].rotateAngleZ = 3.14159265F;

		leftTrackModel[192].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox390
		leftTrackModel[192].setRotationPoint(-2.1F, 8.5F, 22F);
		leftTrackModel[192].rotateAngleZ = 3.14159265F;

		leftTrackModel[193].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox391
		leftTrackModel[193].setRotationPoint(-2.1F, 8.5F, 22F);
		leftTrackModel[193].rotateAngleZ = 3.14159265F;

		leftTrackModel[194].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox392
		leftTrackModel[194].setRotationPoint(-2.1F, 8.5F, 26F);
		leftTrackModel[194].rotateAngleZ = 3.14159265F;

		leftTrackModel[195].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox393
		leftTrackModel[195].setRotationPoint(-2.1F, 8.5F, 30F);
		leftTrackModel[195].rotateAngleZ = 3.14159265F;

		leftTrackModel[196].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox394
		leftTrackModel[196].setRotationPoint(-2.1F, 8.5F, 30F);
		leftTrackModel[196].rotateAngleZ = 3.14159265F;

		leftTrackModel[197].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox395
		leftTrackModel[197].setRotationPoint(-2.1F, 8.5F, 21F);
		leftTrackModel[197].rotateAngleZ = 3.14159265F;

		leftTrackModel[198].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox402
		leftTrackModel[198].setRotationPoint(0.9F, 8.5F, 22F);
		leftTrackModel[198].rotateAngleZ = 3.14159265F;

		leftTrackModel[199].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox403
		leftTrackModel[199].setRotationPoint(0.9F, 8.5F, 22F);
		leftTrackModel[199].rotateAngleZ = 3.14159265F;

		leftTrackModel[200].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox404
		leftTrackModel[200].setRotationPoint(0.9F, 8.5F, 26F);
		leftTrackModel[200].rotateAngleZ = 3.14159265F;

		leftTrackModel[201].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox405
		leftTrackModel[201].setRotationPoint(0.9F, 8.5F, 30F);
		leftTrackModel[201].rotateAngleZ = 3.14159265F;

		leftTrackModel[202].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox406
		leftTrackModel[202].setRotationPoint(0.9F, 8.5F, 30F);
		leftTrackModel[202].rotateAngleZ = 3.14159265F;

		leftTrackModel[203].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox407
		leftTrackModel[203].setRotationPoint(0.9F, 8.5F, 21F);
		leftTrackModel[203].rotateAngleZ = 3.14159265F;

		leftTrackModel[204].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox414
		leftTrackModel[204].setRotationPoint(3.9F, 8.5F, 22F);
		leftTrackModel[204].rotateAngleZ = 3.14159265F;

		leftTrackModel[205].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox415
		leftTrackModel[205].setRotationPoint(3.9F, 8.5F, 22F);
		leftTrackModel[205].rotateAngleZ = 3.14159265F;

		leftTrackModel[206].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox416
		leftTrackModel[206].setRotationPoint(3.9F, 8.5F, 26F);
		leftTrackModel[206].rotateAngleZ = 3.14159265F;

		leftTrackModel[207].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox417
		leftTrackModel[207].setRotationPoint(3.9F, 8.5F, 30F);
		leftTrackModel[207].rotateAngleZ = 3.14159265F;

		leftTrackModel[208].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox418
		leftTrackModel[208].setRotationPoint(3.9F, 8.5F, 30F);
		leftTrackModel[208].rotateAngleZ = 3.14159265F;

		leftTrackModel[209].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox419
		leftTrackModel[209].setRotationPoint(3.9F, 8.5F, 21F);
		leftTrackModel[209].rotateAngleZ = 3.14159265F;

		leftTrackModel[210].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox426
		leftTrackModel[210].setRotationPoint(6.9F, 8.5F, 22F);
		leftTrackModel[210].rotateAngleZ = 3.14159265F;

		leftTrackModel[211].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox427
		leftTrackModel[211].setRotationPoint(6.9F, 8.5F, 22F);
		leftTrackModel[211].rotateAngleZ = 3.14159265F;

		leftTrackModel[212].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox428
		leftTrackModel[212].setRotationPoint(6.9F, 8.5F, 26F);
		leftTrackModel[212].rotateAngleZ = 3.14159265F;

		leftTrackModel[213].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox429
		leftTrackModel[213].setRotationPoint(6.9F, 8.5F, 30F);
		leftTrackModel[213].rotateAngleZ = 3.14159265F;

		leftTrackModel[214].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox430
		leftTrackModel[214].setRotationPoint(6.9F, 8.5F, 30F);
		leftTrackModel[214].rotateAngleZ = 3.14159265F;

		leftTrackModel[215].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox431
		leftTrackModel[215].setRotationPoint(6.9F, 8.5F, 21F);
		leftTrackModel[215].rotateAngleZ = 3.14159265F;

		leftTrackModel[216].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox438
		leftTrackModel[216].setRotationPoint(9.9F, 8.5F, 22F);
		leftTrackModel[216].rotateAngleZ = 3.14159265F;

		leftTrackModel[217].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox439
		leftTrackModel[217].setRotationPoint(9.9F, 8.5F, 22F);
		leftTrackModel[217].rotateAngleZ = 3.14159265F;

		leftTrackModel[218].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox440
		leftTrackModel[218].setRotationPoint(9.9F, 8.5F, 26F);
		leftTrackModel[218].rotateAngleZ = 3.14159265F;

		leftTrackModel[219].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox441
		leftTrackModel[219].setRotationPoint(9.9F, 8.5F, 30F);
		leftTrackModel[219].rotateAngleZ = 3.14159265F;

		leftTrackModel[220].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox442
		leftTrackModel[220].setRotationPoint(9.9F, 8.5F, 30F);
		leftTrackModel[220].rotateAngleZ = 3.14159265F;

		leftTrackModel[221].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox443
		leftTrackModel[221].setRotationPoint(9.9F, 8.5F, 21F);
		leftTrackModel[221].rotateAngleZ = 3.14159265F;

		leftTrackModel[222].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox450
		leftTrackModel[222].setRotationPoint(12.9F, 8.5F, 22F);
		leftTrackModel[222].rotateAngleZ = 3.14159265F;

		leftTrackModel[223].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox451
		leftTrackModel[223].setRotationPoint(12.9F, 8.5F, 22F);
		leftTrackModel[223].rotateAngleZ = 3.14159265F;

		leftTrackModel[224].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox452
		leftTrackModel[224].setRotationPoint(12.9F, 8.5F, 26F);
		leftTrackModel[224].rotateAngleZ = 3.14159265F;

		leftTrackModel[225].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox453
		leftTrackModel[225].setRotationPoint(12.9F, 8.5F, 30F);
		leftTrackModel[225].rotateAngleZ = 3.14159265F;

		leftTrackModel[226].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox454
		leftTrackModel[226].setRotationPoint(12.9F, 8.5F, 30F);
		leftTrackModel[226].rotateAngleZ = 3.14159265F;

		leftTrackModel[227].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox455
		leftTrackModel[227].setRotationPoint(12.9F, 8.5F, 21F);
		leftTrackModel[227].rotateAngleZ = 3.14159265F;

		leftTrackModel[228].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox462
		leftTrackModel[228].setRotationPoint(15.9F, 8.5F, 22F);
		leftTrackModel[228].rotateAngleZ = 3.14159265F;

		leftTrackModel[229].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox463
		leftTrackModel[229].setRotationPoint(15.9F, 8.5F, 22F);
		leftTrackModel[229].rotateAngleZ = 3.14159265F;

		leftTrackModel[230].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox464
		leftTrackModel[230].setRotationPoint(15.9F, 8.5F, 26F);
		leftTrackModel[230].rotateAngleZ = 3.14159265F;

		leftTrackModel[231].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox465
		leftTrackModel[231].setRotationPoint(15.9F, 8.5F, 30F);
		leftTrackModel[231].rotateAngleZ = 3.14159265F;

		leftTrackModel[232].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox466
		leftTrackModel[232].setRotationPoint(15.9F, 8.5F, 30F);
		leftTrackModel[232].rotateAngleZ = 3.14159265F;

		leftTrackModel[233].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox467
		leftTrackModel[233].setRotationPoint(15.9F, 8.5F, 21F);
		leftTrackModel[233].rotateAngleZ = 3.14159265F;

		leftTrackModel[234].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox474
		leftTrackModel[234].setRotationPoint(18.9F, 8.5F, 22F);
		leftTrackModel[234].rotateAngleZ = 3.14159265F;

		leftTrackModel[235].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox475
		leftTrackModel[235].setRotationPoint(18.9F, 8.5F, 22F);
		leftTrackModel[235].rotateAngleZ = 3.14159265F;

		leftTrackModel[236].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox476
		leftTrackModel[236].setRotationPoint(18.9F, 8.5F, 26F);
		leftTrackModel[236].rotateAngleZ = 3.14159265F;

		leftTrackModel[237].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox477
		leftTrackModel[237].setRotationPoint(18.9F, 8.5F, 30F);
		leftTrackModel[237].rotateAngleZ = 3.14159265F;

		leftTrackModel[238].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox478
		leftTrackModel[238].setRotationPoint(18.9F, 8.5F, 30F);
		leftTrackModel[238].rotateAngleZ = 3.14159265F;

		leftTrackModel[239].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox479
		leftTrackModel[239].setRotationPoint(18.9F, 8.5F, 21F);
		leftTrackModel[239].rotateAngleZ = 3.14159265F;

		leftTrackModel[240].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox486
		leftTrackModel[240].setRotationPoint(21.9F, 8.5F, 22F);
		leftTrackModel[240].rotateAngleZ = 3.14159265F;

		leftTrackModel[241].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox487
		leftTrackModel[241].setRotationPoint(21.9F, 8.5F, 22F);
		leftTrackModel[241].rotateAngleZ = 3.14159265F;

		leftTrackModel[242].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox488
		leftTrackModel[242].setRotationPoint(21.9F, 8.5F, 26F);
		leftTrackModel[242].rotateAngleZ = 3.14159265F;

		leftTrackModel[243].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox489
		leftTrackModel[243].setRotationPoint(21.9F, 8.5F, 30F);
		leftTrackModel[243].rotateAngleZ = 3.14159265F;

		leftTrackModel[244].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox490
		leftTrackModel[244].setRotationPoint(21.9F, 8.5F, 30F);
		leftTrackModel[244].rotateAngleZ = 3.14159265F;

		leftTrackModel[245].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox491
		leftTrackModel[245].setRotationPoint(21.9F, 8.5F, 21F);
		leftTrackModel[245].rotateAngleZ = 3.14159265F;

		leftTrackModel[246].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox498
		leftTrackModel[246].setRotationPoint(24.9F, 8.5F, 22F);
		leftTrackModel[246].rotateAngleZ = 3.14159265F;

		leftTrackModel[247].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox499
		leftTrackModel[247].setRotationPoint(24.9F, 8.5F, 22F);
		leftTrackModel[247].rotateAngleZ = 3.14159265F;

		leftTrackModel[248].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox500
		leftTrackModel[248].setRotationPoint(24.9F, 8.5F, 26F);
		leftTrackModel[248].rotateAngleZ = 3.14159265F;

		leftTrackModel[249].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox501
		leftTrackModel[249].setRotationPoint(24.9F, 8.5F, 30F);
		leftTrackModel[249].rotateAngleZ = 3.14159265F;

		leftTrackModel[250].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox502
		leftTrackModel[250].setRotationPoint(24.9F, 8.5F, 30F);
		leftTrackModel[250].rotateAngleZ = 3.14159265F;

		leftTrackModel[251].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox503
		leftTrackModel[251].setRotationPoint(24.9F, 8.5F, 21F);
		leftTrackModel[251].rotateAngleZ = 3.14159265F;

		leftTrackModel[252].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox510
		leftTrackModel[252].setRotationPoint(27.9F, 8.5F, 22F);
		leftTrackModel[252].rotateAngleZ = 3.14159265F;

		leftTrackModel[253].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox511
		leftTrackModel[253].setRotationPoint(27.9F, 8.5F, 22F);
		leftTrackModel[253].rotateAngleZ = 3.14159265F;

		leftTrackModel[254].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox512
		leftTrackModel[254].setRotationPoint(27.9F, 8.5F, 26F);
		leftTrackModel[254].rotateAngleZ = 3.14159265F;

		leftTrackModel[255].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox513
		leftTrackModel[255].setRotationPoint(27.9F, 8.5F, 30F);
		leftTrackModel[255].rotateAngleZ = 3.14159265F;

		leftTrackModel[256].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox514
		leftTrackModel[256].setRotationPoint(27.9F, 8.5F, 30F);
		leftTrackModel[256].rotateAngleZ = 3.14159265F;

		leftTrackModel[257].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox515
		leftTrackModel[257].setRotationPoint(27.9F, 8.5F, 21F);
		leftTrackModel[257].rotateAngleZ = 3.14159265F;

		leftTrackModel[258].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox522
		leftTrackModel[258].setRotationPoint(30.9F, 8.5F, 22F);
		leftTrackModel[258].rotateAngleZ = 3.14159265F;

		leftTrackModel[259].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox523
		leftTrackModel[259].setRotationPoint(30.9F, 8.5F, 22F);
		leftTrackModel[259].rotateAngleZ = 3.14159265F;

		leftTrackModel[260].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox524
		leftTrackModel[260].setRotationPoint(30.9F, 8.5F, 26F);
		leftTrackModel[260].rotateAngleZ = 3.14159265F;

		leftTrackModel[261].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox525
		leftTrackModel[261].setRotationPoint(30.9F, 8.5F, 30F);
		leftTrackModel[261].rotateAngleZ = 3.14159265F;

		leftTrackModel[262].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox526
		leftTrackModel[262].setRotationPoint(30.9F, 8.5F, 30F);
		leftTrackModel[262].rotateAngleZ = 3.14159265F;

		leftTrackModel[263].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox527
		leftTrackModel[263].setRotationPoint(30.9F, 8.5F, 21F);
		leftTrackModel[263].rotateAngleZ = 3.14159265F;

		leftTrackModel[264].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox534
		leftTrackModel[264].setRotationPoint(33.9F, 8.5F, 22F);
		leftTrackModel[264].rotateAngleZ = 3.14159265F;

		leftTrackModel[265].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox535
		leftTrackModel[265].setRotationPoint(33.9F, 8.5F, 22F);
		leftTrackModel[265].rotateAngleZ = 3.14159265F;

		leftTrackModel[266].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox536
		leftTrackModel[266].setRotationPoint(33.9F, 8.5F, 26F);
		leftTrackModel[266].rotateAngleZ = 3.14159265F;

		leftTrackModel[267].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox537
		leftTrackModel[267].setRotationPoint(33.9F, 8.5F, 30F);
		leftTrackModel[267].rotateAngleZ = 3.14159265F;

		leftTrackModel[268].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox538
		leftTrackModel[268].setRotationPoint(33.9F, 8.5F, 30F);
		leftTrackModel[268].rotateAngleZ = 3.14159265F;

		leftTrackModel[269].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox539
		leftTrackModel[269].setRotationPoint(33.9F, 8.5F, 21F);
		leftTrackModel[269].rotateAngleZ = 3.14159265F;

		leftTrackModel[270].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox546
		leftTrackModel[270].setRotationPoint(36.9F, 8.5F, 22F);
		leftTrackModel[270].rotateAngleZ = 3.14159265F;

		leftTrackModel[271].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox547
		leftTrackModel[271].setRotationPoint(36.9F, 8.5F, 22F);
		leftTrackModel[271].rotateAngleZ = 3.14159265F;

		leftTrackModel[272].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox548
		leftTrackModel[272].setRotationPoint(36.9F, 8.5F, 26F);
		leftTrackModel[272].rotateAngleZ = 3.14159265F;

		leftTrackModel[273].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox549
		leftTrackModel[273].setRotationPoint(36.9F, 8.5F, 30F);
		leftTrackModel[273].rotateAngleZ = 3.14159265F;

		leftTrackModel[274].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox550
		leftTrackModel[274].setRotationPoint(36.9F, 8.5F, 30F);
		leftTrackModel[274].rotateAngleZ = 3.14159265F;

		leftTrackModel[275].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox551
		leftTrackModel[275].setRotationPoint(36.9F, 8.5F, 21F);
		leftTrackModel[275].rotateAngleZ = 3.14159265F;

		leftTrackModel[276].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox558
		leftTrackModel[276].setRotationPoint(39.9F, 8.5F, 22F);
		leftTrackModel[276].rotateAngleZ = 3.14159265F;

		leftTrackModel[277].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox559
		leftTrackModel[277].setRotationPoint(39.9F, 8.5F, 22F);
		leftTrackModel[277].rotateAngleZ = 3.14159265F;

		leftTrackModel[278].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox560
		leftTrackModel[278].setRotationPoint(39.9F, 8.5F, 26F);
		leftTrackModel[278].rotateAngleZ = 3.14159265F;

		leftTrackModel[279].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox561
		leftTrackModel[279].setRotationPoint(39.9F, 8.5F, 30F);
		leftTrackModel[279].rotateAngleZ = 3.14159265F;

		leftTrackModel[280].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox562
		leftTrackModel[280].setRotationPoint(39.9F, 8.5F, 30F);
		leftTrackModel[280].rotateAngleZ = 3.14159265F;

		leftTrackModel[281].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox563
		leftTrackModel[281].setRotationPoint(39.9F, 8.5F, 21F);
		leftTrackModel[281].rotateAngleZ = 3.14159265F;

		leftTrackModel[282].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox570
		leftTrackModel[282].setRotationPoint(42.9F, 8.5F, 22F);
		leftTrackModel[282].rotateAngleZ = 3.14159265F;

		leftTrackModel[283].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox571
		leftTrackModel[283].setRotationPoint(42.9F, 8.5F, 22F);
		leftTrackModel[283].rotateAngleZ = 3.14159265F;

		leftTrackModel[284].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox572
		leftTrackModel[284].setRotationPoint(42.9F, 8.5F, 26F);
		leftTrackModel[284].rotateAngleZ = 3.14159265F;

		leftTrackModel[285].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox573
		leftTrackModel[285].setRotationPoint(42.9F, 8.5F, 30F);
		leftTrackModel[285].rotateAngleZ = 3.14159265F;

		leftTrackModel[286].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox574
		leftTrackModel[286].setRotationPoint(42.9F, 8.5F, 30F);
		leftTrackModel[286].rotateAngleZ = 3.14159265F;

		leftTrackModel[287].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox575
		leftTrackModel[287].setRotationPoint(42.9F, 8.5F, 21F);
		leftTrackModel[287].rotateAngleZ = 3.14159265F;

		leftTrackModel[288].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox582
		leftTrackModel[288].setRotationPoint(45.9F, 8.5F, 22F);
		leftTrackModel[288].rotateAngleZ = 3.54301838F;

		leftTrackModel[289].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox583
		leftTrackModel[289].setRotationPoint(45.9F, 8.5F, 22F);
		leftTrackModel[289].rotateAngleZ = 3.54301838F;

		leftTrackModel[290].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox584
		leftTrackModel[290].setRotationPoint(45.9F, 8.5F, 26F);
		leftTrackModel[290].rotateAngleZ = 3.54301838F;

		leftTrackModel[291].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox585
		leftTrackModel[291].setRotationPoint(45.9F, 8.5F, 30F);
		leftTrackModel[291].rotateAngleZ = 3.54301838F;

		leftTrackModel[292].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox586
		leftTrackModel[292].setRotationPoint(45.9F, 8.5F, 30F);
		leftTrackModel[292].rotateAngleZ = 3.54301838F;

		leftTrackModel[293].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox587
		leftTrackModel[293].setRotationPoint(45.9F, 8.5F, 21F);
		leftTrackModel[293].rotateAngleZ = 3.54301838F;

		leftTrackModel[294].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox594
		leftTrackModel[294].setRotationPoint(48.6F, 7.4F, 22F);
		leftTrackModel[294].rotateAngleZ = 3.54301838F;

		leftTrackModel[295].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox595
		leftTrackModel[295].setRotationPoint(48.6F, 7.4F, 22F);
		leftTrackModel[295].rotateAngleZ = 3.54301838F;

		leftTrackModel[296].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox596
		leftTrackModel[296].setRotationPoint(48.6F, 7.4F, 26F);
		leftTrackModel[296].rotateAngleZ = 3.54301838F;

		leftTrackModel[297].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox597
		leftTrackModel[297].setRotationPoint(48.6F, 7.4F, 30F);
		leftTrackModel[297].rotateAngleZ = 3.54301838F;

		leftTrackModel[298].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox598
		leftTrackModel[298].setRotationPoint(48.6F, 7.4F, 30F);
		leftTrackModel[298].rotateAngleZ = 3.54301838F;

		leftTrackModel[299].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox599
		leftTrackModel[299].setRotationPoint(48.6F, 7.4F, 21F);
		leftTrackModel[299].rotateAngleZ = 3.54301838F;

		leftTrackModel[300].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox606
		leftTrackModel[300].setRotationPoint(51.4F, 6.3F, 22F);
		leftTrackModel[300].rotateAngleZ = 3.64773814F;

		leftTrackModel[301].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox607
		leftTrackModel[301].setRotationPoint(51.4F, 6.3F, 22F);
		leftTrackModel[301].rotateAngleZ = 3.64773814F;

		leftTrackModel[302].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox608
		leftTrackModel[302].setRotationPoint(51.4F, 6.3F, 26F);
		leftTrackModel[302].rotateAngleZ = 3.64773814F;

		leftTrackModel[303].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox609
		leftTrackModel[303].setRotationPoint(51.4F, 6.3F, 30F);
		leftTrackModel[303].rotateAngleZ = 3.64773814F;

		leftTrackModel[304].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox610
		leftTrackModel[304].setRotationPoint(51.4F, 6.3F, 30F);
		leftTrackModel[304].rotateAngleZ = 3.64773814F;

		leftTrackModel[305].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox611
		leftTrackModel[305].setRotationPoint(51.4F, 6.3F, 21F);
		leftTrackModel[305].rotateAngleZ = 3.64773814F;

		leftTrackModel[306].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox618
		leftTrackModel[306].setRotationPoint(53.9F, 5F, 22F);
		leftTrackModel[306].rotateAngleZ = 3.64773814F;

		leftTrackModel[307].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox619
		leftTrackModel[307].setRotationPoint(53.9F, 5F, 22F);
		leftTrackModel[307].rotateAngleZ = 3.64773814F;

		leftTrackModel[308].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox620
		leftTrackModel[308].setRotationPoint(53.9F, 5F, 26F);
		leftTrackModel[308].rotateAngleZ = 3.64773814F;

		leftTrackModel[309].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox621
		leftTrackModel[309].setRotationPoint(53.9F, 5F, 30F);
		leftTrackModel[309].rotateAngleZ = 3.64773814F;

		leftTrackModel[310].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox622
		leftTrackModel[310].setRotationPoint(53.9F, 5F, 30F);
		leftTrackModel[310].rotateAngleZ = 3.64773814F;

		leftTrackModel[311].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox623
		leftTrackModel[311].setRotationPoint(53.9F, 5F, 21F);
		leftTrackModel[311].rotateAngleZ = 3.64773814F;

		leftTrackModel[312].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox630
		leftTrackModel[312].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[312].rotateAngleZ = 3.64773814F;

		leftTrackModel[313].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox631
		leftTrackModel[313].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[313].rotateAngleZ = 3.64773814F;

		leftTrackModel[314].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox632
		leftTrackModel[314].setRotationPoint(56.5F, 3.6F, 26F);
		leftTrackModel[314].rotateAngleZ = 3.64773814F;

		leftTrackModel[315].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox633
		leftTrackModel[315].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[315].rotateAngleZ = 3.64773814F;

		leftTrackModel[316].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox634
		leftTrackModel[316].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[316].rotateAngleZ = 3.64773814F;

		leftTrackModel[317].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox635
		leftTrackModel[317].setRotationPoint(56.5F, 3.6F, 21F);
		leftTrackModel[317].rotateAngleZ = 3.64773814F;

		leftTrackModel[318].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox642
		leftTrackModel[318].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[318].rotateAngleZ = 3.64773814F;

		leftTrackModel[319].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox643
		leftTrackModel[319].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[319].rotateAngleZ = 3.64773814F;

		leftTrackModel[320].addShapeBox(-5F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox644
		leftTrackModel[320].setRotationPoint(56.5F, 3.6F, 26F);
		leftTrackModel[320].rotateAngleZ = 3.64773814F;

		leftTrackModel[321].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox645
		leftTrackModel[321].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[321].rotateAngleZ = 3.64773814F;

		leftTrackModel[322].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox646
		leftTrackModel[322].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[322].rotateAngleZ = 3.64773814F;

		leftTrackModel[323].addShapeBox(-6F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox647
		leftTrackModel[323].setRotationPoint(56.5F, 3.6F, 21F);
		leftTrackModel[323].rotateAngleZ = 3.64773814F;

		leftTrackModel[324].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox654
		leftTrackModel[324].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[324].rotateAngleZ = 3.64773814F;

		leftTrackModel[325].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox655
		leftTrackModel[325].setRotationPoint(56.5F, 3.6F, 22F);
		leftTrackModel[325].rotateAngleZ = 3.64773814F;

		leftTrackModel[326].addShapeBox(-8F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox656
		leftTrackModel[326].setRotationPoint(56.5F, 3.6F, 26F);
		leftTrackModel[326].rotateAngleZ = 3.64773814F;

		leftTrackModel[327].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox657
		leftTrackModel[327].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[327].rotateAngleZ = 3.64773814F;

		leftTrackModel[328].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox658
		leftTrackModel[328].setRotationPoint(56.5F, 3.6F, 30F);
		leftTrackModel[328].rotateAngleZ = 3.64773814F;

		leftTrackModel[329].addShapeBox(-9F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox659
		leftTrackModel[329].setRotationPoint(56.5F, 3.6F, 21F);
		leftTrackModel[329].rotateAngleZ = 3.64773814F;

		leftTrackModel[330].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox666
		leftTrackModel[330].setRotationPoint(64.3F, -0.7F, 22F);
		leftTrackModel[330].rotateAngleZ = 3.92699082F;

		leftTrackModel[331].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox667
		leftTrackModel[331].setRotationPoint(64.3F, -0.7F, 22F);
		leftTrackModel[331].rotateAngleZ = 3.92699082F;

		leftTrackModel[332].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox668
		leftTrackModel[332].setRotationPoint(64.3F, -0.7F, 26F);
		leftTrackModel[332].rotateAngleZ = 3.92699082F;

		leftTrackModel[333].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox669
		leftTrackModel[333].setRotationPoint(64.3F, -0.7F, 30F);
		leftTrackModel[333].rotateAngleZ = 3.92699082F;

		leftTrackModel[334].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox670
		leftTrackModel[334].setRotationPoint(64.3F, -0.7F, 30F);
		leftTrackModel[334].rotateAngleZ = 3.92699082F;

		leftTrackModel[335].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox671
		leftTrackModel[335].setRotationPoint(64.3F, -0.7F, 21F);
		leftTrackModel[335].rotateAngleZ = 3.92699082F;

		leftTrackModel[336].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox678
		leftTrackModel[336].setRotationPoint(66.3F, -2.7F, 22F);
		leftTrackModel[336].rotateAngleZ = 4.13643033F;

		leftTrackModel[337].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox679
		leftTrackModel[337].setRotationPoint(66.3F, -2.7F, 22F);
		leftTrackModel[337].rotateAngleZ = 4.13643033F;

		leftTrackModel[338].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox680
		leftTrackModel[338].setRotationPoint(66.3F, -2.7F, 26F);
		leftTrackModel[338].rotateAngleZ = 4.13643033F;

		leftTrackModel[339].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox681
		leftTrackModel[339].setRotationPoint(66.3F, -2.7F, 30F);
		leftTrackModel[339].rotateAngleZ = 4.13643033F;

		leftTrackModel[340].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox682
		leftTrackModel[340].setRotationPoint(66.3F, -2.7F, 30F);
		leftTrackModel[340].rotateAngleZ = 4.13643033F;

		leftTrackModel[341].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox683
		leftTrackModel[341].setRotationPoint(66.3F, -2.7F, 21F);
		leftTrackModel[341].rotateAngleZ = 4.13643033F;

		leftTrackModel[342].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox690
		leftTrackModel[342].setRotationPoint(68F, -5.1F, 22F);
		leftTrackModel[342].rotateAngleZ = 4.69493569F;

		leftTrackModel[343].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox691
		leftTrackModel[343].setRotationPoint(68F, -5.1F, 22F);
		leftTrackModel[343].rotateAngleZ = 4.69493569F;

		leftTrackModel[344].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox692
		leftTrackModel[344].setRotationPoint(68F, -5.1F, 26F);
		leftTrackModel[344].rotateAngleZ = 4.69493569F;

		leftTrackModel[345].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox693
		leftTrackModel[345].setRotationPoint(68F, -5.1F, 30F);
		leftTrackModel[345].rotateAngleZ = 4.69493569F;

		leftTrackModel[346].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox694
		leftTrackModel[346].setRotationPoint(68F, -5.1F, 30F);
		leftTrackModel[346].rotateAngleZ = 4.69493569F;

		leftTrackModel[347].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox695
		leftTrackModel[347].setRotationPoint(68F, -5.1F, 21F);
		leftTrackModel[347].rotateAngleZ = 4.69493569F;

		leftTrackModel[348].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox702
		leftTrackModel[348].setRotationPoint(68F, -8.1F, 22F);
		leftTrackModel[348].rotateAngleZ = 4.69493569F;

		leftTrackModel[349].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox703
		leftTrackModel[349].setRotationPoint(68F, -8.1F, 22F);
		leftTrackModel[349].rotateAngleZ = 4.69493569F;

		leftTrackModel[350].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox704
		leftTrackModel[350].setRotationPoint(68F, -8.1F, 26F);
		leftTrackModel[350].rotateAngleZ = 4.69493569F;

		leftTrackModel[351].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox705
		leftTrackModel[351].setRotationPoint(68F, -8.1F, 30F);
		leftTrackModel[351].rotateAngleZ = 4.69493569F;

		leftTrackModel[352].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox706
		leftTrackModel[352].setRotationPoint(68F, -8.1F, 30F);
		leftTrackModel[352].rotateAngleZ = 4.69493569F;

		leftTrackModel[353].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox707
		leftTrackModel[353].setRotationPoint(68F, -8.1F, 21F);
		leftTrackModel[353].rotateAngleZ = 4.69493569F;

		leftTrackModel[354].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox714
		leftTrackModel[354].setRotationPoint(68F, -11.1F, 22F);
		leftTrackModel[354].rotateAngleZ = 5.21853446F;

		leftTrackModel[355].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox715
		leftTrackModel[355].setRotationPoint(68F, -11.1F, 22F);
		leftTrackModel[355].rotateAngleZ = 5.21853446F;

		leftTrackModel[356].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox716
		leftTrackModel[356].setRotationPoint(68F, -11.1F, 26F);
		leftTrackModel[356].rotateAngleZ = 5.21853446F;

		leftTrackModel[357].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox717
		leftTrackModel[357].setRotationPoint(68F, -11.1F, 30F);
		leftTrackModel[357].rotateAngleZ = 5.21853446F;

		leftTrackModel[358].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox718
		leftTrackModel[358].setRotationPoint(68F, -11.1F, 30F);
		leftTrackModel[358].rotateAngleZ = 5.21853446F;

		leftTrackModel[359].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox719
		leftTrackModel[359].setRotationPoint(68F, -11.1F, 21F);
		leftTrackModel[359].rotateAngleZ = 5.21853446F;

		leftTrackModel[360].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox726
		leftTrackModel[360].setRotationPoint(66.5F, -13.7F, 22F);
		leftTrackModel[360].rotateAngleZ = 5.56760031F;

		leftTrackModel[361].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox727
		leftTrackModel[361].setRotationPoint(66.5F, -13.7F, 22F);
		leftTrackModel[361].rotateAngleZ = 5.56760031F;

		leftTrackModel[362].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox728
		leftTrackModel[362].setRotationPoint(66.5F, -13.7F, 26F);
		leftTrackModel[362].rotateAngleZ = 5.56760031F;

		leftTrackModel[363].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox729
		leftTrackModel[363].setRotationPoint(66.5F, -13.7F, 30F);
		leftTrackModel[363].rotateAngleZ = 5.56760031F;

		leftTrackModel[364].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox730
		leftTrackModel[364].setRotationPoint(66.5F, -13.7F, 30F);
		leftTrackModel[364].rotateAngleZ = 5.56760031F;

		leftTrackModel[365].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox731
		leftTrackModel[365].setRotationPoint(66.5F, -13.7F, 21F);
		leftTrackModel[365].rotateAngleZ = 5.56760031F;

		leftTrackModel[366].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox738
		leftTrackModel[366].setRotationPoint(65F, -16F, 22F);

		leftTrackModel[367].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox739
		leftTrackModel[367].setRotationPoint(65F, -16F, 22F);

		leftTrackModel[368].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox740
		leftTrackModel[368].setRotationPoint(65F, -16F, 26F);

		leftTrackModel[369].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox741
		leftTrackModel[369].setRotationPoint(65F, -16F, 30F);

		leftTrackModel[370].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox742
		leftTrackModel[370].setRotationPoint(65F, -16F, 30F);

		leftTrackModel[371].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox743
		leftTrackModel[371].setRotationPoint(65F, -16F, 21F);

		leftTrackModel[372].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox750
		leftTrackModel[372].setRotationPoint(62F, -16F, 22F);

		leftTrackModel[373].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox751
		leftTrackModel[373].setRotationPoint(62F, -16F, 22F);

		leftTrackModel[374].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox752
		leftTrackModel[374].setRotationPoint(62F, -16F, 26F);

		leftTrackModel[375].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox753
		leftTrackModel[375].setRotationPoint(62F, -16F, 30F);

		leftTrackModel[376].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox754
		leftTrackModel[376].setRotationPoint(62F, -16F, 30F);

		leftTrackModel[377].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox755
		leftTrackModel[377].setRotationPoint(62F, -16F, 21F);

		leftTrackModel[378].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox762
		leftTrackModel[378].setRotationPoint(59F, -16F, 22F);

		leftTrackModel[379].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox763
		leftTrackModel[379].setRotationPoint(59F, -16F, 22F);

		leftTrackModel[380].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox764
		leftTrackModel[380].setRotationPoint(59F, -16F, 26F);

		leftTrackModel[381].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox765
		leftTrackModel[381].setRotationPoint(59F, -16F, 30F);

		leftTrackModel[382].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox766
		leftTrackModel[382].setRotationPoint(59F, -16F, 30F);

		leftTrackModel[383].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox767
		leftTrackModel[383].setRotationPoint(59F, -16F, 21F);

		leftTrackModel[384].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox774
		leftTrackModel[384].setRotationPoint(56F, -16F, 22F);

		leftTrackModel[385].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox775
		leftTrackModel[385].setRotationPoint(56F, -16F, 22F);

		leftTrackModel[386].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox776
		leftTrackModel[386].setRotationPoint(56F, -16F, 26F);

		leftTrackModel[387].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox777
		leftTrackModel[387].setRotationPoint(56F, -16F, 30F);

		leftTrackModel[388].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox778
		leftTrackModel[388].setRotationPoint(56F, -16F, 30F);

		leftTrackModel[389].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox779
		leftTrackModel[389].setRotationPoint(56F, -16F, 21F);

		leftTrackModel[390].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox786
		leftTrackModel[390].setRotationPoint(53F, -16F, 22F);

		leftTrackModel[391].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox787
		leftTrackModel[391].setRotationPoint(53F, -16F, 22F);

		leftTrackModel[392].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox788
		leftTrackModel[392].setRotationPoint(53F, -16F, 26F);

		leftTrackModel[393].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox789
		leftTrackModel[393].setRotationPoint(53F, -16F, 30F);

		leftTrackModel[394].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox790
		leftTrackModel[394].setRotationPoint(53F, -16F, 30F);

		leftTrackModel[395].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox791
		leftTrackModel[395].setRotationPoint(53F, -16F, 21F);

		leftTrackModel[396].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox798
		leftTrackModel[396].setRotationPoint(50F, -16F, 22F);

		leftTrackModel[397].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox799
		leftTrackModel[397].setRotationPoint(50F, -16F, 22F);

		leftTrackModel[398].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox800
		leftTrackModel[398].setRotationPoint(50F, -16F, 26F);

		leftTrackModel[399].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox801
		leftTrackModel[399].setRotationPoint(50F, -16F, 30F);

		leftTrackModel[400].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox802
		leftTrackModel[400].setRotationPoint(50F, -16F, 30F);

		leftTrackModel[401].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox803
		leftTrackModel[401].setRotationPoint(50F, -16F, 21F);

		leftTrackModel[402].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox810
		leftTrackModel[402].setRotationPoint(47F, -16F, 22F);

		leftTrackModel[403].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox811
		leftTrackModel[403].setRotationPoint(47F, -16F, 22F);

		leftTrackModel[404].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox812
		leftTrackModel[404].setRotationPoint(47F, -16F, 26F);

		leftTrackModel[405].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox813
		leftTrackModel[405].setRotationPoint(47F, -16F, 30F);

		leftTrackModel[406].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox814
		leftTrackModel[406].setRotationPoint(47F, -16F, 30F);

		leftTrackModel[407].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox815
		leftTrackModel[407].setRotationPoint(47F, -16F, 21F);

		leftTrackModel[408].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox822
		leftTrackModel[408].setRotationPoint(44F, -16F, 22F);

		leftTrackModel[409].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox823
		leftTrackModel[409].setRotationPoint(44F, -16F, 22F);

		leftTrackModel[410].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox824
		leftTrackModel[410].setRotationPoint(44F, -16F, 26F);

		leftTrackModel[411].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox825
		leftTrackModel[411].setRotationPoint(44F, -16F, 30F);

		leftTrackModel[412].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox826
		leftTrackModel[412].setRotationPoint(44F, -16F, 30F);

		leftTrackModel[413].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox827
		leftTrackModel[413].setRotationPoint(44F, -16F, 21F);

		leftTrackModel[414].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox834
		leftTrackModel[414].setRotationPoint(41F, -16F, 22F);

		leftTrackModel[415].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox835
		leftTrackModel[415].setRotationPoint(41F, -16F, 22F);

		leftTrackModel[416].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox836
		leftTrackModel[416].setRotationPoint(41F, -16F, 26F);

		leftTrackModel[417].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox837
		leftTrackModel[417].setRotationPoint(41F, -16F, 30F);

		leftTrackModel[418].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox838
		leftTrackModel[418].setRotationPoint(41F, -16F, 30F);

		leftTrackModel[419].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox839
		leftTrackModel[419].setRotationPoint(41F, -16F, 21F);

		leftTrackModel[420].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox846
		leftTrackModel[420].setRotationPoint(38F, -16F, 22F);

		leftTrackModel[421].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox847
		leftTrackModel[421].setRotationPoint(38F, -16F, 22F);

		leftTrackModel[422].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox848
		leftTrackModel[422].setRotationPoint(38F, -16F, 26F);

		leftTrackModel[423].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox849
		leftTrackModel[423].setRotationPoint(38F, -16F, 30F);

		leftTrackModel[424].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox850
		leftTrackModel[424].setRotationPoint(38F, -16F, 30F);

		leftTrackModel[425].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox851
		leftTrackModel[425].setRotationPoint(38F, -16F, 21F);

		leftTrackModel[426].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox858
		leftTrackModel[426].setRotationPoint(35F, -16F, 22F);

		leftTrackModel[427].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox859
		leftTrackModel[427].setRotationPoint(35F, -16F, 22F);

		leftTrackModel[428].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox860
		leftTrackModel[428].setRotationPoint(35F, -16F, 26F);

		leftTrackModel[429].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox861
		leftTrackModel[429].setRotationPoint(35F, -16F, 30F);

		leftTrackModel[430].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox862
		leftTrackModel[430].setRotationPoint(35F, -16F, 30F);

		leftTrackModel[431].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox863
		leftTrackModel[431].setRotationPoint(35F, -16F, 21F);

		leftTrackModel[432].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox870
		leftTrackModel[432].setRotationPoint(32F, -16F, 22F);

		leftTrackModel[433].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox871
		leftTrackModel[433].setRotationPoint(32F, -16F, 22F);

		leftTrackModel[434].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox872
		leftTrackModel[434].setRotationPoint(32F, -16F, 26F);

		leftTrackModel[435].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox873
		leftTrackModel[435].setRotationPoint(32F, -16F, 30F);

		leftTrackModel[436].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox874
		leftTrackModel[436].setRotationPoint(32F, -16F, 30F);

		leftTrackModel[437].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox875
		leftTrackModel[437].setRotationPoint(32F, -16F, 21F);

		leftTrackModel[438].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox882
		leftTrackModel[438].setRotationPoint(29F, -16F, 22F);

		leftTrackModel[439].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox883
		leftTrackModel[439].setRotationPoint(29F, -16F, 22F);

		leftTrackModel[440].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox884
		leftTrackModel[440].setRotationPoint(29F, -16F, 26F);

		leftTrackModel[441].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox885
		leftTrackModel[441].setRotationPoint(29F, -16F, 30F);

		leftTrackModel[442].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox886
		leftTrackModel[442].setRotationPoint(29F, -16F, 30F);

		leftTrackModel[443].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox887
		leftTrackModel[443].setRotationPoint(29F, -16F, 21F);

		leftTrackModel[444].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox894
		leftTrackModel[444].setRotationPoint(26F, -16F, 22F);

		leftTrackModel[445].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox895
		leftTrackModel[445].setRotationPoint(26F, -16F, 22F);

		leftTrackModel[446].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox896
		leftTrackModel[446].setRotationPoint(26F, -16F, 26F);

		leftTrackModel[447].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox897
		leftTrackModel[447].setRotationPoint(26F, -16F, 30F);

		leftTrackModel[448].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox898
		leftTrackModel[448].setRotationPoint(26F, -16F, 30F);

		leftTrackModel[449].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox899
		leftTrackModel[449].setRotationPoint(26F, -16F, 21F);

		leftTrackModel[450].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox906
		leftTrackModel[450].setRotationPoint(23F, -16F, 22F);

		leftTrackModel[451].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox907
		leftTrackModel[451].setRotationPoint(23F, -16F, 22F);

		leftTrackModel[452].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox908
		leftTrackModel[452].setRotationPoint(23F, -16F, 26F);

		leftTrackModel[453].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox909
		leftTrackModel[453].setRotationPoint(23F, -16F, 30F);

		leftTrackModel[454].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox910
		leftTrackModel[454].setRotationPoint(23F, -16F, 30F);

		leftTrackModel[455].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox911
		leftTrackModel[455].setRotationPoint(23F, -16F, 21F);

		leftTrackModel[456].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox918
		leftTrackModel[456].setRotationPoint(20F, -16F, 22F);

		leftTrackModel[457].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox919
		leftTrackModel[457].setRotationPoint(20F, -16F, 22F);

		leftTrackModel[458].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox920
		leftTrackModel[458].setRotationPoint(20F, -16F, 26F);

		leftTrackModel[459].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox921
		leftTrackModel[459].setRotationPoint(20F, -16F, 30F);

		leftTrackModel[460].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox922
		leftTrackModel[460].setRotationPoint(20F, -16F, 30F);

		leftTrackModel[461].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox923
		leftTrackModel[461].setRotationPoint(20F, -16F, 21F);

		leftTrackModel[462].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox930
		leftTrackModel[462].setRotationPoint(17F, -16F, 22F);

		leftTrackModel[463].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox931
		leftTrackModel[463].setRotationPoint(17F, -16F, 22F);

		leftTrackModel[464].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox932
		leftTrackModel[464].setRotationPoint(17F, -16F, 26F);

		leftTrackModel[465].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox933
		leftTrackModel[465].setRotationPoint(17F, -16F, 30F);

		leftTrackModel[466].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox934
		leftTrackModel[466].setRotationPoint(17F, -16F, 30F);

		leftTrackModel[467].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox935
		leftTrackModel[467].setRotationPoint(17F, -16F, 21F);

		leftTrackModel[468].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox942
		leftTrackModel[468].setRotationPoint(14F, -16F, 22F);

		leftTrackModel[469].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox943
		leftTrackModel[469].setRotationPoint(14F, -16F, 22F);

		leftTrackModel[470].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox944
		leftTrackModel[470].setRotationPoint(14F, -16F, 26F);

		leftTrackModel[471].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox945
		leftTrackModel[471].setRotationPoint(14F, -16F, 30F);

		leftTrackModel[472].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox946
		leftTrackModel[472].setRotationPoint(14F, -16F, 30F);

		leftTrackModel[473].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox947
		leftTrackModel[473].setRotationPoint(14F, -16F, 21F);

		leftTrackModel[474].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox954
		leftTrackModel[474].setRotationPoint(11F, -16F, 22F);

		leftTrackModel[475].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox955
		leftTrackModel[475].setRotationPoint(11F, -16F, 22F);

		leftTrackModel[476].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox956
		leftTrackModel[476].setRotationPoint(11F, -16F, 26F);

		leftTrackModel[477].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox957
		leftTrackModel[477].setRotationPoint(11F, -16F, 30F);

		leftTrackModel[478].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox958
		leftTrackModel[478].setRotationPoint(11F, -16F, 30F);

		leftTrackModel[479].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox959
		leftTrackModel[479].setRotationPoint(11F, -16F, 21F);

		leftTrackModel[480].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox966
		leftTrackModel[480].setRotationPoint(8F, -16F, 22F);

		leftTrackModel[481].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox967
		leftTrackModel[481].setRotationPoint(8F, -16F, 22F);

		leftTrackModel[482].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox968
		leftTrackModel[482].setRotationPoint(8F, -16F, 26F);

		leftTrackModel[483].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox969
		leftTrackModel[483].setRotationPoint(8F, -16F, 30F);

		leftTrackModel[484].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox970
		leftTrackModel[484].setRotationPoint(8F, -16F, 30F);

		leftTrackModel[485].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox971
		leftTrackModel[485].setRotationPoint(8F, -16F, 21F);

		leftTrackModel[486].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox978
		leftTrackModel[486].setRotationPoint(5F, -16F, 22F);

		leftTrackModel[487].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox979
		leftTrackModel[487].setRotationPoint(5F, -16F, 22F);

		leftTrackModel[488].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox980
		leftTrackModel[488].setRotationPoint(5F, -16F, 26F);

		leftTrackModel[489].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox981
		leftTrackModel[489].setRotationPoint(5F, -16F, 30F);

		leftTrackModel[490].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox982
		leftTrackModel[490].setRotationPoint(5F, -16F, 30F);

		leftTrackModel[491].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox983
		leftTrackModel[491].setRotationPoint(5F, -16F, 21F);

		leftTrackModel[492].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox990
		leftTrackModel[492].setRotationPoint(2F, -16F, 22F);

		leftTrackModel[493].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox991
		leftTrackModel[493].setRotationPoint(2F, -16F, 22F);

		leftTrackModel[494].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox992
		leftTrackModel[494].setRotationPoint(2F, -16F, 26F);

		leftTrackModel[495].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox993
		leftTrackModel[495].setRotationPoint(2F, -16F, 30F);

		leftTrackModel[496].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox994
		leftTrackModel[496].setRotationPoint(2F, -16F, 30F);

		leftTrackModel[497].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox995
		leftTrackModel[497].setRotationPoint(2F, -16F, 21F);

		leftTrackModel[498].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1002
		leftTrackModel[498].setRotationPoint(-1F, -16F, 22F);

		leftTrackModel[499].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1003
		leftTrackModel[499].setRotationPoint(-1F, -16F, 22F);
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1004
		leftTrackModel[501] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1005
		leftTrackModel[502] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1006
		leftTrackModel[503] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1007
		leftTrackModel[504] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1014
		leftTrackModel[505] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1015
		leftTrackModel[506] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1016
		leftTrackModel[507] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1017
		leftTrackModel[508] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1018
		leftTrackModel[509] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1019
		leftTrackModel[510] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1026
		leftTrackModel[511] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1027
		leftTrackModel[512] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1028
		leftTrackModel[513] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1029
		leftTrackModel[514] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1030
		leftTrackModel[515] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1031
		leftTrackModel[516] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1038
		leftTrackModel[517] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1039
		leftTrackModel[518] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1040
		leftTrackModel[519] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1041
		leftTrackModel[520] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1042
		leftTrackModel[521] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1043
		leftTrackModel[522] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1050
		leftTrackModel[523] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1051
		leftTrackModel[524] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1052
		leftTrackModel[525] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1053
		leftTrackModel[526] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1054
		leftTrackModel[527] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1055
		leftTrackModel[528] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1062
		leftTrackModel[529] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1063
		leftTrackModel[530] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1064
		leftTrackModel[531] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1065
		leftTrackModel[532] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1066
		leftTrackModel[533] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1067
		leftTrackModel[534] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1074
		leftTrackModel[535] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1075
		leftTrackModel[536] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1076
		leftTrackModel[537] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1077
		leftTrackModel[538] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1078
		leftTrackModel[539] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1079
		leftTrackModel[540] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1086
		leftTrackModel[541] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1087
		leftTrackModel[542] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1088
		leftTrackModel[543] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1089
		leftTrackModel[544] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1090
		leftTrackModel[545] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1091
		leftTrackModel[546] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1098
		leftTrackModel[547] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1099
		leftTrackModel[548] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1100
		leftTrackModel[549] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1101
		leftTrackModel[550] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1102
		leftTrackModel[551] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1103
		leftTrackModel[552] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1110
		leftTrackModel[553] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1111
		leftTrackModel[554] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1112
		leftTrackModel[555] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1113
		leftTrackModel[556] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1114
		leftTrackModel[557] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1115
		leftTrackModel[558] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1122
		leftTrackModel[559] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1123
		leftTrackModel[560] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1124
		leftTrackModel[561] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1125
		leftTrackModel[562] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1126
		leftTrackModel[563] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1127
		leftTrackModel[564] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1134
		leftTrackModel[565] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1135
		leftTrackModel[566] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1136
		leftTrackModel[567] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1137
		leftTrackModel[568] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1138
		leftTrackModel[569] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1139
		leftTrackModel[570] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1146
		leftTrackModel[571] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1147
		leftTrackModel[572] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1148
		leftTrackModel[573] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1149
		leftTrackModel[574] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1150
		leftTrackModel[575] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1151
		leftTrackModel[576] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1158
		leftTrackModel[577] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1159
		leftTrackModel[578] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1160
		leftTrackModel[579] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1161
		leftTrackModel[580] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1162
		leftTrackModel[581] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1163
		leftTrackModel[582] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1170
		leftTrackModel[583] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1171
		leftTrackModel[584] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1172
		leftTrackModel[585] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1173
		leftTrackModel[586] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1174
		leftTrackModel[587] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1175
		leftTrackModel[588] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1182
		leftTrackModel[589] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1183
		leftTrackModel[590] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1184
		leftTrackModel[591] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1185
		leftTrackModel[592] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1186
		leftTrackModel[593] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1187
		leftTrackModel[594] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1194
		leftTrackModel[595] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1195
		leftTrackModel[596] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1196
		leftTrackModel[597] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1197
		leftTrackModel[598] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1198
		leftTrackModel[599] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1199
		leftTrackModel[600] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1206
		leftTrackModel[601] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1207
		leftTrackModel[602] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1208
		leftTrackModel[603] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1209
		leftTrackModel[604] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1210
		leftTrackModel[605] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1211
		leftTrackModel[606] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1218
		leftTrackModel[607] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1219
		leftTrackModel[608] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1220
		leftTrackModel[609] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1221
		leftTrackModel[610] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1222
		leftTrackModel[611] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1223
		leftTrackModel[612] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1230
		leftTrackModel[613] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1231
		leftTrackModel[614] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1232
		leftTrackModel[615] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1233
		leftTrackModel[616] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1234
		leftTrackModel[617] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1235
		leftTrackModel[618] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1242
		leftTrackModel[619] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1243
		leftTrackModel[620] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1244
		leftTrackModel[621] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1245
		leftTrackModel[622] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1246
		leftTrackModel[623] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1247
		leftTrackModel[624] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1254
		leftTrackModel[625] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1255
		leftTrackModel[626] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1256
		leftTrackModel[627] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1257
		leftTrackModel[628] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1258
		leftTrackModel[629] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1259
		leftTrackModel[630] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1264
		leftTrackModel[631] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1265

		leftTrackModel[500].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1004
		leftTrackModel[500].setRotationPoint(-1F, -16F, 26F);

		leftTrackModel[501].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1005
		leftTrackModel[501].setRotationPoint(-1F, -16F, 30F);

		leftTrackModel[502].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1006
		leftTrackModel[502].setRotationPoint(-1F, -16F, 30F);

		leftTrackModel[503].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1007
		leftTrackModel[503].setRotationPoint(-1F, -16F, 21F);

		leftTrackModel[504].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1014
		leftTrackModel[504].setRotationPoint(-4F, -16F, 22F);

		leftTrackModel[505].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1015
		leftTrackModel[505].setRotationPoint(-4F, -16F, 22F);

		leftTrackModel[506].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1016
		leftTrackModel[506].setRotationPoint(-4F, -16F, 26F);

		leftTrackModel[507].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1017
		leftTrackModel[507].setRotationPoint(-4F, -16F, 30F);

		leftTrackModel[508].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1018
		leftTrackModel[508].setRotationPoint(-4F, -16F, 30F);

		leftTrackModel[509].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1019
		leftTrackModel[509].setRotationPoint(-4F, -16F, 21F);

		leftTrackModel[510].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1026
		leftTrackModel[510].setRotationPoint(-7F, -16F, 22F);

		leftTrackModel[511].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1027
		leftTrackModel[511].setRotationPoint(-7F, -16F, 22F);

		leftTrackModel[512].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1028
		leftTrackModel[512].setRotationPoint(-7F, -16F, 26F);

		leftTrackModel[513].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1029
		leftTrackModel[513].setRotationPoint(-7F, -16F, 30F);

		leftTrackModel[514].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1030
		leftTrackModel[514].setRotationPoint(-7F, -16F, 30F);

		leftTrackModel[515].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1031
		leftTrackModel[515].setRotationPoint(-7F, -16F, 21F);

		leftTrackModel[516].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1038
		leftTrackModel[516].setRotationPoint(-10F, -16F, 22F);

		leftTrackModel[517].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1039
		leftTrackModel[517].setRotationPoint(-10F, -16F, 22F);

		leftTrackModel[518].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1040
		leftTrackModel[518].setRotationPoint(-10F, -16F, 26F);

		leftTrackModel[519].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1041
		leftTrackModel[519].setRotationPoint(-10F, -16F, 30F);

		leftTrackModel[520].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1042
		leftTrackModel[520].setRotationPoint(-10F, -16F, 30F);

		leftTrackModel[521].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1043
		leftTrackModel[521].setRotationPoint(-10F, -16F, 21F);

		leftTrackModel[522].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1050
		leftTrackModel[522].setRotationPoint(-13F, -16F, 22F);

		leftTrackModel[523].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1051
		leftTrackModel[523].setRotationPoint(-13F, -16F, 22F);

		leftTrackModel[524].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1052
		leftTrackModel[524].setRotationPoint(-13F, -16F, 26F);

		leftTrackModel[525].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1053
		leftTrackModel[525].setRotationPoint(-13F, -16F, 30F);

		leftTrackModel[526].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1054
		leftTrackModel[526].setRotationPoint(-13F, -16F, 30F);

		leftTrackModel[527].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1055
		leftTrackModel[527].setRotationPoint(-13F, -16F, 21F);

		leftTrackModel[528].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1062
		leftTrackModel[528].setRotationPoint(-16F, -16F, 22F);

		leftTrackModel[529].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1063
		leftTrackModel[529].setRotationPoint(-16F, -16F, 22F);

		leftTrackModel[530].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1064
		leftTrackModel[530].setRotationPoint(-16F, -16F, 26F);

		leftTrackModel[531].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1065
		leftTrackModel[531].setRotationPoint(-16F, -16F, 30F);

		leftTrackModel[532].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1066
		leftTrackModel[532].setRotationPoint(-16F, -16F, 30F);

		leftTrackModel[533].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1067
		leftTrackModel[533].setRotationPoint(-16F, -16F, 21F);

		leftTrackModel[534].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1074
		leftTrackModel[534].setRotationPoint(-19F, -16F, 22F);

		leftTrackModel[535].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1075
		leftTrackModel[535].setRotationPoint(-19F, -16F, 22F);

		leftTrackModel[536].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1076
		leftTrackModel[536].setRotationPoint(-19F, -16F, 26F);

		leftTrackModel[537].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1077
		leftTrackModel[537].setRotationPoint(-19F, -16F, 30F);

		leftTrackModel[538].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1078
		leftTrackModel[538].setRotationPoint(-19F, -16F, 30F);

		leftTrackModel[539].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1079
		leftTrackModel[539].setRotationPoint(-19F, -16F, 21F);

		leftTrackModel[540].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1086
		leftTrackModel[540].setRotationPoint(-22F, -16F, 22F);

		leftTrackModel[541].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1087
		leftTrackModel[541].setRotationPoint(-22F, -16F, 22F);

		leftTrackModel[542].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1088
		leftTrackModel[542].setRotationPoint(-22F, -16F, 26F);

		leftTrackModel[543].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1089
		leftTrackModel[543].setRotationPoint(-22F, -16F, 30F);

		leftTrackModel[544].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1090
		leftTrackModel[544].setRotationPoint(-22F, -16F, 30F);

		leftTrackModel[545].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1091
		leftTrackModel[545].setRotationPoint(-22F, -16F, 21F);

		leftTrackModel[546].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1098
		leftTrackModel[546].setRotationPoint(-25F, -16F, 22F);

		leftTrackModel[547].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1099
		leftTrackModel[547].setRotationPoint(-25F, -16F, 22F);

		leftTrackModel[548].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1100
		leftTrackModel[548].setRotationPoint(-25F, -16F, 26F);

		leftTrackModel[549].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1101
		leftTrackModel[549].setRotationPoint(-25F, -16F, 30F);

		leftTrackModel[550].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1102
		leftTrackModel[550].setRotationPoint(-25F, -16F, 30F);

		leftTrackModel[551].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1103
		leftTrackModel[551].setRotationPoint(-25F, -16F, 21F);

		leftTrackModel[552].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1110
		leftTrackModel[552].setRotationPoint(-28F, -16F, 22F);

		leftTrackModel[553].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1111
		leftTrackModel[553].setRotationPoint(-28F, -16F, 22F);

		leftTrackModel[554].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1112
		leftTrackModel[554].setRotationPoint(-28F, -16F, 26F);

		leftTrackModel[555].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1113
		leftTrackModel[555].setRotationPoint(-28F, -16F, 30F);

		leftTrackModel[556].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1114
		leftTrackModel[556].setRotationPoint(-28F, -16F, 30F);

		leftTrackModel[557].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1115
		leftTrackModel[557].setRotationPoint(-28F, -16F, 21F);

		leftTrackModel[558].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1122
		leftTrackModel[558].setRotationPoint(-31F, -16F, 22F);

		leftTrackModel[559].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1123
		leftTrackModel[559].setRotationPoint(-31F, -16F, 22F);

		leftTrackModel[560].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1124
		leftTrackModel[560].setRotationPoint(-31F, -16F, 26F);

		leftTrackModel[561].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1125
		leftTrackModel[561].setRotationPoint(-31F, -16F, 30F);

		leftTrackModel[562].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1126
		leftTrackModel[562].setRotationPoint(-31F, -16F, 30F);

		leftTrackModel[563].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1127
		leftTrackModel[563].setRotationPoint(-31F, -16F, 21F);

		leftTrackModel[564].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1134
		leftTrackModel[564].setRotationPoint(-34F, -16F, 22F);

		leftTrackModel[565].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1135
		leftTrackModel[565].setRotationPoint(-34F, -16F, 22F);

		leftTrackModel[566].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1136
		leftTrackModel[566].setRotationPoint(-34F, -16F, 26F);

		leftTrackModel[567].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1137
		leftTrackModel[567].setRotationPoint(-34F, -16F, 30F);

		leftTrackModel[568].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1138
		leftTrackModel[568].setRotationPoint(-34F, -16F, 30F);

		leftTrackModel[569].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1139
		leftTrackModel[569].setRotationPoint(-34F, -16F, 21F);

		leftTrackModel[570].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1146
		leftTrackModel[570].setRotationPoint(-37F, -16F, 22F);

		leftTrackModel[571].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1147
		leftTrackModel[571].setRotationPoint(-37F, -16F, 22F);

		leftTrackModel[572].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1148
		leftTrackModel[572].setRotationPoint(-37F, -16F, 26F);

		leftTrackModel[573].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1149
		leftTrackModel[573].setRotationPoint(-37F, -16F, 30F);

		leftTrackModel[574].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1150
		leftTrackModel[574].setRotationPoint(-37F, -16F, 30F);

		leftTrackModel[575].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1151
		leftTrackModel[575].setRotationPoint(-37F, -16F, 21F);

		leftTrackModel[576].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1158
		leftTrackModel[576].setRotationPoint(-40F, -16F, 22F);

		leftTrackModel[577].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1159
		leftTrackModel[577].setRotationPoint(-40F, -16F, 22F);

		leftTrackModel[578].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1160
		leftTrackModel[578].setRotationPoint(-40F, -16F, 26F);

		leftTrackModel[579].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1161
		leftTrackModel[579].setRotationPoint(-40F, -16F, 30F);

		leftTrackModel[580].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1162
		leftTrackModel[580].setRotationPoint(-40F, -16F, 30F);

		leftTrackModel[581].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1163
		leftTrackModel[581].setRotationPoint(-40F, -16F, 21F);

		leftTrackModel[582].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1170
		leftTrackModel[582].setRotationPoint(-43F, -16F, 22F);

		leftTrackModel[583].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1171
		leftTrackModel[583].setRotationPoint(-43F, -16F, 22F);

		leftTrackModel[584].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1172
		leftTrackModel[584].setRotationPoint(-43F, -16F, 26F);

		leftTrackModel[585].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1173
		leftTrackModel[585].setRotationPoint(-43F, -16F, 30F);

		leftTrackModel[586].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1174
		leftTrackModel[586].setRotationPoint(-43F, -16F, 30F);

		leftTrackModel[587].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1175
		leftTrackModel[587].setRotationPoint(-43F, -16F, 21F);

		leftTrackModel[588].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1182
		leftTrackModel[588].setRotationPoint(-46F, -16F, 22F);

		leftTrackModel[589].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1183
		leftTrackModel[589].setRotationPoint(-46F, -16F, 22F);

		leftTrackModel[590].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1184
		leftTrackModel[590].setRotationPoint(-46F, -16F, 26F);

		leftTrackModel[591].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1185
		leftTrackModel[591].setRotationPoint(-46F, -16F, 30F);

		leftTrackModel[592].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1186
		leftTrackModel[592].setRotationPoint(-46F, -16F, 30F);

		leftTrackModel[593].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1187
		leftTrackModel[593].setRotationPoint(-46F, -16F, 21F);

		leftTrackModel[594].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1194
		leftTrackModel[594].setRotationPoint(-49F, -16F, 22F);

		leftTrackModel[595].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1195
		leftTrackModel[595].setRotationPoint(-49F, -16F, 22F);

		leftTrackModel[596].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1196
		leftTrackModel[596].setRotationPoint(-49F, -16F, 26F);

		leftTrackModel[597].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1197
		leftTrackModel[597].setRotationPoint(-49F, -16F, 30F);

		leftTrackModel[598].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1198
		leftTrackModel[598].setRotationPoint(-49F, -16F, 30F);

		leftTrackModel[599].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1199
		leftTrackModel[599].setRotationPoint(-49F, -16F, 21F);

		leftTrackModel[600].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1206
		leftTrackModel[600].setRotationPoint(-52F, -16F, 22F);

		leftTrackModel[601].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1207
		leftTrackModel[601].setRotationPoint(-52F, -16F, 22F);

		leftTrackModel[602].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1208
		leftTrackModel[602].setRotationPoint(-52F, -16F, 26F);

		leftTrackModel[603].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1209
		leftTrackModel[603].setRotationPoint(-52F, -16F, 30F);

		leftTrackModel[604].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1210
		leftTrackModel[604].setRotationPoint(-52F, -16F, 30F);

		leftTrackModel[605].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1211
		leftTrackModel[605].setRotationPoint(-52F, -16F, 21F);

		leftTrackModel[606].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1218
		leftTrackModel[606].setRotationPoint(-55F, -16F, 22F);

		leftTrackModel[607].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1219
		leftTrackModel[607].setRotationPoint(-55F, -16F, 22F);

		leftTrackModel[608].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1220
		leftTrackModel[608].setRotationPoint(-55F, -16F, 26F);

		leftTrackModel[609].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1221
		leftTrackModel[609].setRotationPoint(-55F, -16F, 30F);

		leftTrackModel[610].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1222
		leftTrackModel[610].setRotationPoint(-55F, -16F, 30F);

		leftTrackModel[611].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1223
		leftTrackModel[611].setRotationPoint(-55F, -16F, 21F);

		leftTrackModel[612].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1230
		leftTrackModel[612].setRotationPoint(-58F, -16F, 22F);

		leftTrackModel[613].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1231
		leftTrackModel[613].setRotationPoint(-58F, -16F, 22F);

		leftTrackModel[614].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1232
		leftTrackModel[614].setRotationPoint(-58F, -16F, 26F);

		leftTrackModel[615].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1233
		leftTrackModel[615].setRotationPoint(-58F, -16F, 30F);

		leftTrackModel[616].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1234
		leftTrackModel[616].setRotationPoint(-58F, -16F, 30F);

		leftTrackModel[617].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1235
		leftTrackModel[617].setRotationPoint(-58F, -16F, 21F);

		leftTrackModel[618].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1242
		leftTrackModel[618].setRotationPoint(-61F, -16F, 22F);

		leftTrackModel[619].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1243
		leftTrackModel[619].setRotationPoint(-61F, -16F, 22F);

		leftTrackModel[620].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1244
		leftTrackModel[620].setRotationPoint(-61F, -16F, 26F);

		leftTrackModel[621].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1245
		leftTrackModel[621].setRotationPoint(-61F, -16F, 30F);

		leftTrackModel[622].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1246
		leftTrackModel[622].setRotationPoint(-61F, -16F, 30F);

		leftTrackModel[623].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1247
		leftTrackModel[623].setRotationPoint(-61F, -16F, 21F);

		leftTrackModel[624].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1254
		leftTrackModel[624].setRotationPoint(-64F, -16F, 22F);
		leftTrackModel[624].rotateAngleZ = 0.13962634F;

		leftTrackModel[625].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1255
		leftTrackModel[625].setRotationPoint(-64F, -16F, 22F);
		leftTrackModel[625].rotateAngleZ = 0.13962634F;

		leftTrackModel[626].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1256
		leftTrackModel[626].setRotationPoint(-64F, -16F, 26F);
		leftTrackModel[626].rotateAngleZ = 0.13962634F;

		leftTrackModel[627].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1257
		leftTrackModel[627].setRotationPoint(-64F, -16F, 30F);
		leftTrackModel[627].rotateAngleZ = 0.13962634F;

		leftTrackModel[628].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1258
		leftTrackModel[628].setRotationPoint(-64F, -16F, 30F);
		leftTrackModel[628].rotateAngleZ = 0.13962634F;

		leftTrackModel[629].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1259
		leftTrackModel[629].setRotationPoint(-64F, -16F, 21F);
		leftTrackModel[629].rotateAngleZ = 0.13962634F;

		leftTrackModel[630].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1264
		leftTrackModel[630].setRotationPoint(-67F, -15.5F, 22F);

		leftTrackModel[631].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1265
		leftTrackModel[631].setRotationPoint(-67F, -15.5F, 30F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox0
		rightTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1
		rightTrackModel[2] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox2
		rightTrackModel[3] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox3
		rightTrackModel[4] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox4
		rightTrackModel[5] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox5
		rightTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox18
		rightTrackModel[7] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox19
		rightTrackModel[8] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox20
		rightTrackModel[9] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox21
		rightTrackModel[10] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox22
		rightTrackModel[11] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox23
		rightTrackModel[12] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox30
		rightTrackModel[13] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox31
		rightTrackModel[14] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox32
		rightTrackModel[15] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox33
		rightTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox34
		rightTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox35
		rightTrackModel[18] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox42
		rightTrackModel[19] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox43
		rightTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox44
		rightTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox45
		rightTrackModel[22] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox46
		rightTrackModel[23] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox47
		rightTrackModel[24] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox54
		rightTrackModel[25] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox55
		rightTrackModel[26] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox56
		rightTrackModel[27] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox57
		rightTrackModel[28] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox58
		rightTrackModel[29] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox59
		rightTrackModel[30] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox66
		rightTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox67
		rightTrackModel[32] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox68
		rightTrackModel[33] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox69
		rightTrackModel[34] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox70
		rightTrackModel[35] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox71
		rightTrackModel[36] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox78
		rightTrackModel[37] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox79
		rightTrackModel[38] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox80
		rightTrackModel[39] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox81
		rightTrackModel[40] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox82
		rightTrackModel[41] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox83
		rightTrackModel[42] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox90
		rightTrackModel[43] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox91
		rightTrackModel[44] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox92
		rightTrackModel[45] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox93
		rightTrackModel[46] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox94
		rightTrackModel[47] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox95
		rightTrackModel[48] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox102
		rightTrackModel[49] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox103
		rightTrackModel[50] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox104
		rightTrackModel[51] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox105
		rightTrackModel[52] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox106
		rightTrackModel[53] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox107
		rightTrackModel[54] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox114
		rightTrackModel[55] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox115
		rightTrackModel[56] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox116
		rightTrackModel[57] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox117
		rightTrackModel[58] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox118
		rightTrackModel[59] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox119
		rightTrackModel[60] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox126
		rightTrackModel[61] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox127
		rightTrackModel[62] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox128
		rightTrackModel[63] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox129
		rightTrackModel[64] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox130
		rightTrackModel[65] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox131
		rightTrackModel[66] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox138
		rightTrackModel[67] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox139
		rightTrackModel[68] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox140
		rightTrackModel[69] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox141
		rightTrackModel[70] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox142
		rightTrackModel[71] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox143
		rightTrackModel[72] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox150
		rightTrackModel[73] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox151
		rightTrackModel[74] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox152
		rightTrackModel[75] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox153
		rightTrackModel[76] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox154
		rightTrackModel[77] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox155
		rightTrackModel[78] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox162
		rightTrackModel[79] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox163
		rightTrackModel[80] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox164
		rightTrackModel[81] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox165
		rightTrackModel[82] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox166
		rightTrackModel[83] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox167
		rightTrackModel[84] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox174
		rightTrackModel[85] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox175
		rightTrackModel[86] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox176
		rightTrackModel[87] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox177
		rightTrackModel[88] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox178
		rightTrackModel[89] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox179
		rightTrackModel[90] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox186
		rightTrackModel[91] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox187
		rightTrackModel[92] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox188
		rightTrackModel[93] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox189
		rightTrackModel[94] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox190
		rightTrackModel[95] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox191
		rightTrackModel[96] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox198
		rightTrackModel[97] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox199
		rightTrackModel[98] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox200
		rightTrackModel[99] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox201
		rightTrackModel[100] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox202
		rightTrackModel[101] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox203
		rightTrackModel[102] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox210
		rightTrackModel[103] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox211
		rightTrackModel[104] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox212
		rightTrackModel[105] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox213
		rightTrackModel[106] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox214
		rightTrackModel[107] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox215
		rightTrackModel[108] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox222
		rightTrackModel[109] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox223
		rightTrackModel[110] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox224
		rightTrackModel[111] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox225
		rightTrackModel[112] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox226
		rightTrackModel[113] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox227
		rightTrackModel[114] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox234
		rightTrackModel[115] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox235
		rightTrackModel[116] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox236
		rightTrackModel[117] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox237
		rightTrackModel[118] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox238
		rightTrackModel[119] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox239
		rightTrackModel[120] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox246
		rightTrackModel[121] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox247
		rightTrackModel[122] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox248
		rightTrackModel[123] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox249
		rightTrackModel[124] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox250
		rightTrackModel[125] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox251
		rightTrackModel[126] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox258
		rightTrackModel[127] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox259
		rightTrackModel[128] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox260
		rightTrackModel[129] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox261
		rightTrackModel[130] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox262
		rightTrackModel[131] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox263
		rightTrackModel[132] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox270
		rightTrackModel[133] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox271
		rightTrackModel[134] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox272
		rightTrackModel[135] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox273
		rightTrackModel[136] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox274
		rightTrackModel[137] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox275
		rightTrackModel[138] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox282
		rightTrackModel[139] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox283
		rightTrackModel[140] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox284
		rightTrackModel[141] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox285
		rightTrackModel[142] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox286
		rightTrackModel[143] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox287
		rightTrackModel[144] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox294
		rightTrackModel[145] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox295
		rightTrackModel[146] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox296
		rightTrackModel[147] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox297
		rightTrackModel[148] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox298
		rightTrackModel[149] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox299
		rightTrackModel[150] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox306
		rightTrackModel[151] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox307
		rightTrackModel[152] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox308
		rightTrackModel[153] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox309
		rightTrackModel[154] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox310
		rightTrackModel[155] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox311
		rightTrackModel[156] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox318
		rightTrackModel[157] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox319
		rightTrackModel[158] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox320
		rightTrackModel[159] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox321
		rightTrackModel[160] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox322
		rightTrackModel[161] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox323
		rightTrackModel[162] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox330
		rightTrackModel[163] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox331
		rightTrackModel[164] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox332
		rightTrackModel[165] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox333
		rightTrackModel[166] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox334
		rightTrackModel[167] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox335
		rightTrackModel[168] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox342
		rightTrackModel[169] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox343
		rightTrackModel[170] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox344
		rightTrackModel[171] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox345
		rightTrackModel[172] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox346
		rightTrackModel[173] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox347
		rightTrackModel[174] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox348
		rightTrackModel[175] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox349
		rightTrackModel[176] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox350
		rightTrackModel[177] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox351
		rightTrackModel[178] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox352
		rightTrackModel[179] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox353
		rightTrackModel[180] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox360
		rightTrackModel[181] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox361
		rightTrackModel[182] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox362
		rightTrackModel[183] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox363
		rightTrackModel[184] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox364
		rightTrackModel[185] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox365
		rightTrackModel[186] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox372
		rightTrackModel[187] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox373
		rightTrackModel[188] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox374
		rightTrackModel[189] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox375
		rightTrackModel[190] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox376
		rightTrackModel[191] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox377
		rightTrackModel[192] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox384
		rightTrackModel[193] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox385
		rightTrackModel[194] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox386
		rightTrackModel[195] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox387
		rightTrackModel[196] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox388
		rightTrackModel[197] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox389
		rightTrackModel[198] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox396
		rightTrackModel[199] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox397
		rightTrackModel[200] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox398
		rightTrackModel[201] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox399
		rightTrackModel[202] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox400
		rightTrackModel[203] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox401
		rightTrackModel[204] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox408
		rightTrackModel[205] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox409
		rightTrackModel[206] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox410
		rightTrackModel[207] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox411
		rightTrackModel[208] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox412
		rightTrackModel[209] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox413
		rightTrackModel[210] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox420
		rightTrackModel[211] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox421
		rightTrackModel[212] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox422
		rightTrackModel[213] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox423
		rightTrackModel[214] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox424
		rightTrackModel[215] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox425
		rightTrackModel[216] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox432
		rightTrackModel[217] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox433
		rightTrackModel[218] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox434
		rightTrackModel[219] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox435
		rightTrackModel[220] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox436
		rightTrackModel[221] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox437
		rightTrackModel[222] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox444
		rightTrackModel[223] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox445
		rightTrackModel[224] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox446
		rightTrackModel[225] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox447
		rightTrackModel[226] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox448
		rightTrackModel[227] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox449
		rightTrackModel[228] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox456
		rightTrackModel[229] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox457
		rightTrackModel[230] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox458
		rightTrackModel[231] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox459
		rightTrackModel[232] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox460
		rightTrackModel[233] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox461
		rightTrackModel[234] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox468
		rightTrackModel[235] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox469
		rightTrackModel[236] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox470
		rightTrackModel[237] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox471
		rightTrackModel[238] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox472
		rightTrackModel[239] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox473
		rightTrackModel[240] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox480
		rightTrackModel[241] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox481
		rightTrackModel[242] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox482
		rightTrackModel[243] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox483
		rightTrackModel[244] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox484
		rightTrackModel[245] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox485
		rightTrackModel[246] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox492
		rightTrackModel[247] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox493
		rightTrackModel[248] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox494
		rightTrackModel[249] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox495
		rightTrackModel[250] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox496
		rightTrackModel[251] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox497
		rightTrackModel[252] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox504
		rightTrackModel[253] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox505
		rightTrackModel[254] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox506
		rightTrackModel[255] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox507
		rightTrackModel[256] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox508
		rightTrackModel[257] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox509
		rightTrackModel[258] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox516
		rightTrackModel[259] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox517
		rightTrackModel[260] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox518
		rightTrackModel[261] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox519
		rightTrackModel[262] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox520
		rightTrackModel[263] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox521
		rightTrackModel[264] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox528
		rightTrackModel[265] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox529
		rightTrackModel[266] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox530
		rightTrackModel[267] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox531
		rightTrackModel[268] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox532
		rightTrackModel[269] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox533
		rightTrackModel[270] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox540
		rightTrackModel[271] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox541
		rightTrackModel[272] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox542
		rightTrackModel[273] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox543
		rightTrackModel[274] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox544
		rightTrackModel[275] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox545
		rightTrackModel[276] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox552
		rightTrackModel[277] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox553
		rightTrackModel[278] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox554
		rightTrackModel[279] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox555
		rightTrackModel[280] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox556
		rightTrackModel[281] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox557
		rightTrackModel[282] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox564
		rightTrackModel[283] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox565
		rightTrackModel[284] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox566
		rightTrackModel[285] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox567
		rightTrackModel[286] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox568
		rightTrackModel[287] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox569
		rightTrackModel[288] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox576
		rightTrackModel[289] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox577
		rightTrackModel[290] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox578
		rightTrackModel[291] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox579
		rightTrackModel[292] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox580
		rightTrackModel[293] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox581
		rightTrackModel[294] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox588
		rightTrackModel[295] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox589
		rightTrackModel[296] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox590
		rightTrackModel[297] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox591
		rightTrackModel[298] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox592
		rightTrackModel[299] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox593
		rightTrackModel[300] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox600
		rightTrackModel[301] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox601
		rightTrackModel[302] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox602
		rightTrackModel[303] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox603
		rightTrackModel[304] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox604
		rightTrackModel[305] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox605
		rightTrackModel[306] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox612
		rightTrackModel[307] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox613
		rightTrackModel[308] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox614
		rightTrackModel[309] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox615
		rightTrackModel[310] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox616
		rightTrackModel[311] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox617
		rightTrackModel[312] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox624
		rightTrackModel[313] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox625
		rightTrackModel[314] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox626
		rightTrackModel[315] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox627
		rightTrackModel[316] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox628
		rightTrackModel[317] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox629
		rightTrackModel[318] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox636
		rightTrackModel[319] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox637
		rightTrackModel[320] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox638
		rightTrackModel[321] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox639
		rightTrackModel[322] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox640
		rightTrackModel[323] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox641
		rightTrackModel[324] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox648
		rightTrackModel[325] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox649
		rightTrackModel[326] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox650
		rightTrackModel[327] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox651
		rightTrackModel[328] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox652
		rightTrackModel[329] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox653
		rightTrackModel[330] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox660
		rightTrackModel[331] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox661
		rightTrackModel[332] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox662
		rightTrackModel[333] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox663
		rightTrackModel[334] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox664
		rightTrackModel[335] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox665
		rightTrackModel[336] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox672
		rightTrackModel[337] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox673
		rightTrackModel[338] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox674
		rightTrackModel[339] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox675
		rightTrackModel[340] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox676
		rightTrackModel[341] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox677
		rightTrackModel[342] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox684
		rightTrackModel[343] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox685
		rightTrackModel[344] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox686
		rightTrackModel[345] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox687
		rightTrackModel[346] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox688
		rightTrackModel[347] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox689
		rightTrackModel[348] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox696
		rightTrackModel[349] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox697
		rightTrackModel[350] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox698
		rightTrackModel[351] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox699
		rightTrackModel[352] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox700
		rightTrackModel[353] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox701
		rightTrackModel[354] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox708
		rightTrackModel[355] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox709
		rightTrackModel[356] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox710
		rightTrackModel[357] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox711
		rightTrackModel[358] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox712
		rightTrackModel[359] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox713
		rightTrackModel[360] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox720
		rightTrackModel[361] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox721
		rightTrackModel[362] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox722
		rightTrackModel[363] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox723
		rightTrackModel[364] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox724
		rightTrackModel[365] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox725
		rightTrackModel[366] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox732
		rightTrackModel[367] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox733
		rightTrackModel[368] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox734
		rightTrackModel[369] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox735
		rightTrackModel[370] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox736
		rightTrackModel[371] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox737
		rightTrackModel[372] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox744
		rightTrackModel[373] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox745
		rightTrackModel[374] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox746
		rightTrackModel[375] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox747
		rightTrackModel[376] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox748
		rightTrackModel[377] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox749
		rightTrackModel[378] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox756
		rightTrackModel[379] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox757
		rightTrackModel[380] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox758
		rightTrackModel[381] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox759
		rightTrackModel[382] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox760
		rightTrackModel[383] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox761
		rightTrackModel[384] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox768
		rightTrackModel[385] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox769
		rightTrackModel[386] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox770
		rightTrackModel[387] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox771
		rightTrackModel[388] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox772
		rightTrackModel[389] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox773
		rightTrackModel[390] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox780
		rightTrackModel[391] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox781
		rightTrackModel[392] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox782
		rightTrackModel[393] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox783
		rightTrackModel[394] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox784
		rightTrackModel[395] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox785
		rightTrackModel[396] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox792
		rightTrackModel[397] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox793
		rightTrackModel[398] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox794
		rightTrackModel[399] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox795
		rightTrackModel[400] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox796
		rightTrackModel[401] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox797
		rightTrackModel[402] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox804
		rightTrackModel[403] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox805
		rightTrackModel[404] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox806
		rightTrackModel[405] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox807
		rightTrackModel[406] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox808
		rightTrackModel[407] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox809
		rightTrackModel[408] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox816
		rightTrackModel[409] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox817
		rightTrackModel[410] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox818
		rightTrackModel[411] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox819
		rightTrackModel[412] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox820
		rightTrackModel[413] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox821
		rightTrackModel[414] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox828
		rightTrackModel[415] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox829
		rightTrackModel[416] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox830
		rightTrackModel[417] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox831
		rightTrackModel[418] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox832
		rightTrackModel[419] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox833
		rightTrackModel[420] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox840
		rightTrackModel[421] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox841
		rightTrackModel[422] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox842
		rightTrackModel[423] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox843
		rightTrackModel[424] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox844
		rightTrackModel[425] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox845
		rightTrackModel[426] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox852
		rightTrackModel[427] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox853
		rightTrackModel[428] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox854
		rightTrackModel[429] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox855
		rightTrackModel[430] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox856
		rightTrackModel[431] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox857
		rightTrackModel[432] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox864
		rightTrackModel[433] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox865
		rightTrackModel[434] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox866
		rightTrackModel[435] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox867
		rightTrackModel[436] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox868
		rightTrackModel[437] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox869
		rightTrackModel[438] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox876
		rightTrackModel[439] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox877
		rightTrackModel[440] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox878
		rightTrackModel[441] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox879
		rightTrackModel[442] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox880
		rightTrackModel[443] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox881
		rightTrackModel[444] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox888
		rightTrackModel[445] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox889
		rightTrackModel[446] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox890
		rightTrackModel[447] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox891
		rightTrackModel[448] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox892
		rightTrackModel[449] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox893
		rightTrackModel[450] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox900
		rightTrackModel[451] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox901
		rightTrackModel[452] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox902
		rightTrackModel[453] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox903
		rightTrackModel[454] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox904
		rightTrackModel[455] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox905
		rightTrackModel[456] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox912
		rightTrackModel[457] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox913
		rightTrackModel[458] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox914
		rightTrackModel[459] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox915
		rightTrackModel[460] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox916
		rightTrackModel[461] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox917
		rightTrackModel[462] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox924
		rightTrackModel[463] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox925
		rightTrackModel[464] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox926
		rightTrackModel[465] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox927
		rightTrackModel[466] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox928
		rightTrackModel[467] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox929
		rightTrackModel[468] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox936
		rightTrackModel[469] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox937
		rightTrackModel[470] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox938
		rightTrackModel[471] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox939
		rightTrackModel[472] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox940
		rightTrackModel[473] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox941
		rightTrackModel[474] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox948
		rightTrackModel[475] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox949
		rightTrackModel[476] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox950
		rightTrackModel[477] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox951
		rightTrackModel[478] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox952
		rightTrackModel[479] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox953
		rightTrackModel[480] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox960
		rightTrackModel[481] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox961
		rightTrackModel[482] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox962
		rightTrackModel[483] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox963
		rightTrackModel[484] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox964
		rightTrackModel[485] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox965
		rightTrackModel[486] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox972
		rightTrackModel[487] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox973
		rightTrackModel[488] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox974
		rightTrackModel[489] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox975
		rightTrackModel[490] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox976
		rightTrackModel[491] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox977
		rightTrackModel[492] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox984
		rightTrackModel[493] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox985
		rightTrackModel[494] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox986
		rightTrackModel[495] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox987
		rightTrackModel[496] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox988
		rightTrackModel[497] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox989
		rightTrackModel[498] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox996
		rightTrackModel[499] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox997

		rightTrackModel[0].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		rightTrackModel[0].setRotationPoint(-68F, -15.5F, -32F);

		rightTrackModel[1].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		rightTrackModel[1].setRotationPoint(-68F, -15.5F, -32F);

		rightTrackModel[2].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox2
		rightTrackModel[2].setRotationPoint(-68F, -15.5F, -24F);

		rightTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		rightTrackModel[3].setRotationPoint(-68F, -15.5F, -24F);

		rightTrackModel[4].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		rightTrackModel[4].setRotationPoint(-68F, -15.5F, -28F);

		rightTrackModel[5].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		rightTrackModel[5].setRotationPoint(-68F, -15.5F, -33F);

		rightTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		rightTrackModel[6].setRotationPoint(-71F, -15.5F, -24F);
		rightTrackModel[6].rotateAngleZ = 0.64577182F;

		rightTrackModel[7].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox19
		rightTrackModel[7].setRotationPoint(-71F, -15.5F, -24F);
		rightTrackModel[7].rotateAngleZ = 0.64577182F;

		rightTrackModel[8].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox20
		rightTrackModel[8].setRotationPoint(-71F, -15.5F, -28F);
		rightTrackModel[8].rotateAngleZ = 0.64577182F;

		rightTrackModel[9].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		rightTrackModel[9].setRotationPoint(-71F, -15.5F, -32F);
		rightTrackModel[9].rotateAngleZ = 0.64577182F;

		rightTrackModel[10].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		rightTrackModel[10].setRotationPoint(-71F, -15.5F, -32F);
		rightTrackModel[10].rotateAngleZ = 0.64577182F;

		rightTrackModel[11].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		rightTrackModel[11].setRotationPoint(-71F, -15.5F, -33F);
		rightTrackModel[11].rotateAngleZ = 0.64577182F;

		rightTrackModel[12].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		rightTrackModel[12].setRotationPoint(-73.4F, -13.7F, -24F);
		rightTrackModel[12].rotateAngleZ = 0.78539816F;

		rightTrackModel[13].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox31
		rightTrackModel[13].setRotationPoint(-73.4F, -13.7F, -24F);
		rightTrackModel[13].rotateAngleZ = 0.78539816F;

		rightTrackModel[14].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		rightTrackModel[14].setRotationPoint(-73.4F, -13.7F, -28F);
		rightTrackModel[14].rotateAngleZ = 0.78539816F;

		rightTrackModel[15].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox33
		rightTrackModel[15].setRotationPoint(-73.4F, -13.7F, -32F);
		rightTrackModel[15].rotateAngleZ = 0.78539816F;

		rightTrackModel[16].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox34
		rightTrackModel[16].setRotationPoint(-73.4F, -13.7F, -32F);
		rightTrackModel[16].rotateAngleZ = 0.78539816F;

		rightTrackModel[17].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox35
		rightTrackModel[17].setRotationPoint(-73.4F, -13.7F, -33F);
		rightTrackModel[17].rotateAngleZ = 0.78539816F;

		rightTrackModel[18].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		rightTrackModel[18].setRotationPoint(-75.5F, -11.7F, -24F);
		rightTrackModel[18].rotateAngleZ = 1.11701072F;

		rightTrackModel[19].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox43
		rightTrackModel[19].setRotationPoint(-75.5F, -11.7F, -24F);
		rightTrackModel[19].rotateAngleZ = 1.11701072F;

		rightTrackModel[20].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox44
		rightTrackModel[20].setRotationPoint(-75.5F, -11.7F, -28F);
		rightTrackModel[20].rotateAngleZ = 1.11701072F;

		rightTrackModel[21].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox45
		rightTrackModel[21].setRotationPoint(-75.5F, -11.7F, -32F);
		rightTrackModel[21].rotateAngleZ = 1.11701072F;

		rightTrackModel[22].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox46
		rightTrackModel[22].setRotationPoint(-75.5F, -11.7F, -32F);
		rightTrackModel[22].rotateAngleZ = 1.11701072F;

		rightTrackModel[23].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox47
		rightTrackModel[23].setRotationPoint(-75.5F, -11.7F, -33F);
		rightTrackModel[23].rotateAngleZ = 1.11701072F;

		rightTrackModel[24].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox54
		rightTrackModel[24].setRotationPoint(-76.8F, -9F, -24F);
		rightTrackModel[24].rotateAngleZ = 1.57079633F;

		rightTrackModel[25].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox55
		rightTrackModel[25].setRotationPoint(-76.8F, -9F, -24F);
		rightTrackModel[25].rotateAngleZ = 1.57079633F;

		rightTrackModel[26].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox56
		rightTrackModel[26].setRotationPoint(-76.8F, -9F, -28F);
		rightTrackModel[26].rotateAngleZ = 1.57079633F;

		rightTrackModel[27].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		rightTrackModel[27].setRotationPoint(-76.8F, -9F, -32F);
		rightTrackModel[27].rotateAngleZ = 1.57079633F;

		rightTrackModel[28].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox58
		rightTrackModel[28].setRotationPoint(-76.8F, -9F, -32F);
		rightTrackModel[28].rotateAngleZ = 1.57079633F;

		rightTrackModel[29].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		rightTrackModel[29].setRotationPoint(-76.8F, -9F, -33F);
		rightTrackModel[29].rotateAngleZ = 1.57079633F;

		rightTrackModel[30].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		rightTrackModel[30].setRotationPoint(-76.8F, -6F, -24F);
		rightTrackModel[30].rotateAngleZ = 1.71042267F;

		rightTrackModel[31].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox67
		rightTrackModel[31].setRotationPoint(-76.8F, -6F, -24F);
		rightTrackModel[31].rotateAngleZ = 1.71042267F;

		rightTrackModel[32].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox68
		rightTrackModel[32].setRotationPoint(-76.8F, -6F, -28F);
		rightTrackModel[32].rotateAngleZ = 1.71042267F;

		rightTrackModel[33].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox69
		rightTrackModel[33].setRotationPoint(-76.8F, -6F, -32F);
		rightTrackModel[33].rotateAngleZ = 1.71042267F;

		rightTrackModel[34].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox70
		rightTrackModel[34].setRotationPoint(-76.8F, -6F, -32F);
		rightTrackModel[34].rotateAngleZ = 1.71042267F;

		rightTrackModel[35].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox71
		rightTrackModel[35].setRotationPoint(-76.8F, -6F, -33F);
		rightTrackModel[35].rotateAngleZ = 1.71042267F;

		rightTrackModel[36].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		rightTrackModel[36].setRotationPoint(-76.4F, -3F, -24F);
		rightTrackModel[36].rotateAngleZ = 2.37364778F;

		rightTrackModel[37].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox79
		rightTrackModel[37].setRotationPoint(-76.4F, -3F, -24F);
		rightTrackModel[37].rotateAngleZ = 2.37364778F;

		rightTrackModel[38].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox80
		rightTrackModel[38].setRotationPoint(-76.4F, -3F, -28F);
		rightTrackModel[38].rotateAngleZ = 2.37364778F;

		rightTrackModel[39].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox81
		rightTrackModel[39].setRotationPoint(-76.4F, -3F, -32F);
		rightTrackModel[39].rotateAngleZ = 2.37364778F;

		rightTrackModel[40].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox82
		rightTrackModel[40].setRotationPoint(-76.4F, -3F, -32F);
		rightTrackModel[40].rotateAngleZ = 2.37364778F;

		rightTrackModel[41].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox83
		rightTrackModel[41].setRotationPoint(-76.4F, -3F, -33F);
		rightTrackModel[41].rotateAngleZ = 2.37364778F;

		rightTrackModel[42].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox90
		rightTrackModel[42].setRotationPoint(-74.4F, -1F, -24F);
		rightTrackModel[42].rotateAngleZ = 2.37364778F;

		rightTrackModel[43].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox91
		rightTrackModel[43].setRotationPoint(-74.4F, -1F, -24F);
		rightTrackModel[43].rotateAngleZ = 2.37364778F;

		rightTrackModel[44].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox92
		rightTrackModel[44].setRotationPoint(-74.4F, -1F, -28F);
		rightTrackModel[44].rotateAngleZ = 2.37364778F;

		rightTrackModel[45].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox93
		rightTrackModel[45].setRotationPoint(-74.4F, -1F, -32F);
		rightTrackModel[45].rotateAngleZ = 2.37364778F;

		rightTrackModel[46].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox94
		rightTrackModel[46].setRotationPoint(-74.4F, -1F, -32F);
		rightTrackModel[46].rotateAngleZ = 2.37364778F;

		rightTrackModel[47].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox95
		rightTrackModel[47].setRotationPoint(-74.4F, -1F, -33F);
		rightTrackModel[47].rotateAngleZ = 2.37364778F;

		rightTrackModel[48].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox102
		rightTrackModel[48].setRotationPoint(-72.4F, 1F, -24F);
		rightTrackModel[48].rotateAngleZ = 2.67035376F;

		rightTrackModel[49].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox103
		rightTrackModel[49].setRotationPoint(-72.4F, 1F, -24F);
		rightTrackModel[49].rotateAngleZ = 2.67035376F;

		rightTrackModel[50].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox104
		rightTrackModel[50].setRotationPoint(-72.4F, 1F, -28F);
		rightTrackModel[50].rotateAngleZ = 2.67035376F;

		rightTrackModel[51].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
		rightTrackModel[51].setRotationPoint(-72.4F, 1F, -32F);
		rightTrackModel[51].rotateAngleZ = 2.67035376F;

		rightTrackModel[52].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		rightTrackModel[52].setRotationPoint(-72.4F, 1F, -32F);
		rightTrackModel[52].rotateAngleZ = 2.67035376F;

		rightTrackModel[53].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox107
		rightTrackModel[53].setRotationPoint(-72.4F, 1F, -33F);
		rightTrackModel[53].rotateAngleZ = 2.67035376F;

		rightTrackModel[54].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox114
		rightTrackModel[54].setRotationPoint(-69.8F, 2.3F, -24F);
		rightTrackModel[54].rotateAngleZ = 2.74016693F;

		rightTrackModel[55].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox115
		rightTrackModel[55].setRotationPoint(-69.8F, 2.3F, -24F);
		rightTrackModel[55].rotateAngleZ = 2.74016693F;

		rightTrackModel[56].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox116
		rightTrackModel[56].setRotationPoint(-69.8F, 2.3F, -28F);
		rightTrackModel[56].rotateAngleZ = 2.74016693F;

		rightTrackModel[57].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox117
		rightTrackModel[57].setRotationPoint(-69.8F, 2.3F, -32F);
		rightTrackModel[57].rotateAngleZ = 2.74016693F;

		rightTrackModel[58].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox118
		rightTrackModel[58].setRotationPoint(-69.8F, 2.3F, -32F);
		rightTrackModel[58].rotateAngleZ = 2.74016693F;

		rightTrackModel[59].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox119
		rightTrackModel[59].setRotationPoint(-69.8F, 2.3F, -33F);
		rightTrackModel[59].rotateAngleZ = 2.74016693F;

		rightTrackModel[60].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		rightTrackModel[60].setRotationPoint(-67.1F, 3.5F, -24F);
		rightTrackModel[60].rotateAngleZ = 2.74016693F;

		rightTrackModel[61].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox127
		rightTrackModel[61].setRotationPoint(-67.1F, 3.5F, -24F);
		rightTrackModel[61].rotateAngleZ = 2.74016693F;

		rightTrackModel[62].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		rightTrackModel[62].setRotationPoint(-67.1F, 3.5F, -28F);
		rightTrackModel[62].rotateAngleZ = 2.74016693F;

		rightTrackModel[63].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		rightTrackModel[63].setRotationPoint(-67.1F, 3.5F, -32F);
		rightTrackModel[63].rotateAngleZ = 2.74016693F;

		rightTrackModel[64].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		rightTrackModel[64].setRotationPoint(-67.1F, 3.5F, -32F);
		rightTrackModel[64].rotateAngleZ = 2.74016693F;

		rightTrackModel[65].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox131
		rightTrackModel[65].setRotationPoint(-67.1F, 3.5F, -33F);
		rightTrackModel[65].rotateAngleZ = 2.74016693F;

		rightTrackModel[66].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox138
		rightTrackModel[66].setRotationPoint(-64.4F, 4.7F, -24F);
		rightTrackModel[66].rotateAngleZ = 2.74016693F;

		rightTrackModel[67].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox139
		rightTrackModel[67].setRotationPoint(-64.4F, 4.7F, -24F);
		rightTrackModel[67].rotateAngleZ = 2.74016693F;

		rightTrackModel[68].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox140
		rightTrackModel[68].setRotationPoint(-64.4F, 4.7F, -28F);
		rightTrackModel[68].rotateAngleZ = 2.74016693F;

		rightTrackModel[69].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox141
		rightTrackModel[69].setRotationPoint(-64.4F, 4.7F, -32F);
		rightTrackModel[69].rotateAngleZ = 2.74016693F;

		rightTrackModel[70].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox142
		rightTrackModel[70].setRotationPoint(-64.4F, 4.7F, -32F);
		rightTrackModel[70].rotateAngleZ = 2.74016693F;

		rightTrackModel[71].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox143
		rightTrackModel[71].setRotationPoint(-64.4F, 4.7F, -33F);
		rightTrackModel[71].rotateAngleZ = 2.74016693F;

		rightTrackModel[72].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox150
		rightTrackModel[72].setRotationPoint(-61.7F, 5.9F, -24F);
		rightTrackModel[72].rotateAngleZ = 2.7925268F;

		rightTrackModel[73].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox151
		rightTrackModel[73].setRotationPoint(-61.7F, 5.9F, -24F);
		rightTrackModel[73].rotateAngleZ = 2.7925268F;

		rightTrackModel[74].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox152
		rightTrackModel[74].setRotationPoint(-61.7F, 5.9F, -28F);
		rightTrackModel[74].rotateAngleZ = 2.7925268F;

		rightTrackModel[75].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox153
		rightTrackModel[75].setRotationPoint(-61.7F, 5.9F, -32F);
		rightTrackModel[75].rotateAngleZ = 2.7925268F;

		rightTrackModel[76].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox154
		rightTrackModel[76].setRotationPoint(-61.7F, 5.9F, -32F);
		rightTrackModel[76].rotateAngleZ = 2.7925268F;

		rightTrackModel[77].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox155
		rightTrackModel[77].setRotationPoint(-61.7F, 5.9F, -33F);
		rightTrackModel[77].rotateAngleZ = 2.7925268F;

		rightTrackModel[78].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox162
		rightTrackModel[78].setRotationPoint(-58.9F, 7F, -24F);
		rightTrackModel[78].rotateAngleZ = 2.7925268F;

		rightTrackModel[79].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox163
		rightTrackModel[79].setRotationPoint(-58.9F, 7F, -24F);
		rightTrackModel[79].rotateAngleZ = 2.7925268F;

		rightTrackModel[80].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		rightTrackModel[80].setRotationPoint(-58.9F, 7F, -28F);
		rightTrackModel[80].rotateAngleZ = 2.7925268F;

		rightTrackModel[81].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox165
		rightTrackModel[81].setRotationPoint(-58.9F, 7F, -32F);
		rightTrackModel[81].rotateAngleZ = 2.7925268F;

		rightTrackModel[82].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		rightTrackModel[82].setRotationPoint(-58.9F, 7F, -32F);
		rightTrackModel[82].rotateAngleZ = 2.7925268F;

		rightTrackModel[83].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox167
		rightTrackModel[83].setRotationPoint(-58.9F, 7F, -33F);
		rightTrackModel[83].rotateAngleZ = 2.7925268F;

		rightTrackModel[84].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		rightTrackModel[84].setRotationPoint(-56.1F, 8F, -24F);
		rightTrackModel[84].rotateAngleZ = 2.96705973F;

		rightTrackModel[85].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox175
		rightTrackModel[85].setRotationPoint(-56.1F, 8F, -24F);
		rightTrackModel[85].rotateAngleZ = 2.96705973F;

		rightTrackModel[86].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox176
		rightTrackModel[86].setRotationPoint(-56.1F, 8F, -28F);
		rightTrackModel[86].rotateAngleZ = 2.96705973F;

		rightTrackModel[87].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox177
		rightTrackModel[87].setRotationPoint(-56.1F, 8F, -32F);
		rightTrackModel[87].rotateAngleZ = 2.96705973F;

		rightTrackModel[88].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox178
		rightTrackModel[88].setRotationPoint(-56.1F, 8F, -32F);
		rightTrackModel[88].rotateAngleZ = 2.96705973F;

		rightTrackModel[89].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox179
		rightTrackModel[89].setRotationPoint(-56.1F, 8F, -33F);
		rightTrackModel[89].rotateAngleZ = 2.96705973F;

		rightTrackModel[90].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox186
		rightTrackModel[90].setRotationPoint(-53.1F, 8.5F, -24F);
		rightTrackModel[90].rotateAngleZ = 3.14159265F;

		rightTrackModel[91].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox187
		rightTrackModel[91].setRotationPoint(-53.1F, 8.5F, -24F);
		rightTrackModel[91].rotateAngleZ = 3.14159265F;

		rightTrackModel[92].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox188
		rightTrackModel[92].setRotationPoint(-53.1F, 8.5F, -28F);
		rightTrackModel[92].rotateAngleZ = 3.14159265F;

		rightTrackModel[93].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox189
		rightTrackModel[93].setRotationPoint(-53.1F, 8.5F, -32F);
		rightTrackModel[93].rotateAngleZ = 3.14159265F;

		rightTrackModel[94].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox190
		rightTrackModel[94].setRotationPoint(-53.1F, 8.5F, -32F);
		rightTrackModel[94].rotateAngleZ = 3.14159265F;

		rightTrackModel[95].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox191
		rightTrackModel[95].setRotationPoint(-53.1F, 8.5F, -33F);
		rightTrackModel[95].rotateAngleZ = 3.14159265F;

		rightTrackModel[96].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox198
		rightTrackModel[96].setRotationPoint(-50.1F, 8.5F, -24F);
		rightTrackModel[96].rotateAngleZ = 3.14159265F;

		rightTrackModel[97].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox199
		rightTrackModel[97].setRotationPoint(-50.1F, 8.5F, -24F);
		rightTrackModel[97].rotateAngleZ = 3.14159265F;

		rightTrackModel[98].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox200
		rightTrackModel[98].setRotationPoint(-50.1F, 8.5F, -28F);
		rightTrackModel[98].rotateAngleZ = 3.14159265F;

		rightTrackModel[99].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox201
		rightTrackModel[99].setRotationPoint(-50.1F, 8.5F, -32F);
		rightTrackModel[99].rotateAngleZ = 3.14159265F;

		rightTrackModel[100].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox202
		rightTrackModel[100].setRotationPoint(-50.1F, 8.5F, -32F);
		rightTrackModel[100].rotateAngleZ = 3.14159265F;

		rightTrackModel[101].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox203
		rightTrackModel[101].setRotationPoint(-50.1F, 8.5F, -33F);
		rightTrackModel[101].rotateAngleZ = 3.14159265F;

		rightTrackModel[102].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox210
		rightTrackModel[102].setRotationPoint(-47.1F, 8.5F, -24F);
		rightTrackModel[102].rotateAngleZ = 3.14159265F;

		rightTrackModel[103].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox211
		rightTrackModel[103].setRotationPoint(-47.1F, 8.5F, -24F);
		rightTrackModel[103].rotateAngleZ = 3.14159265F;

		rightTrackModel[104].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox212
		rightTrackModel[104].setRotationPoint(-47.1F, 8.5F, -28F);
		rightTrackModel[104].rotateAngleZ = 3.14159265F;

		rightTrackModel[105].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox213
		rightTrackModel[105].setRotationPoint(-47.1F, 8.5F, -32F);
		rightTrackModel[105].rotateAngleZ = 3.14159265F;

		rightTrackModel[106].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox214
		rightTrackModel[106].setRotationPoint(-47.1F, 8.5F, -32F);
		rightTrackModel[106].rotateAngleZ = 3.14159265F;

		rightTrackModel[107].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox215
		rightTrackModel[107].setRotationPoint(-47.1F, 8.5F, -33F);
		rightTrackModel[107].rotateAngleZ = 3.14159265F;

		rightTrackModel[108].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox222
		rightTrackModel[108].setRotationPoint(-44.1F, 8.5F, -24F);
		rightTrackModel[108].rotateAngleZ = 3.14159265F;

		rightTrackModel[109].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox223
		rightTrackModel[109].setRotationPoint(-44.1F, 8.5F, -24F);
		rightTrackModel[109].rotateAngleZ = 3.14159265F;

		rightTrackModel[110].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox224
		rightTrackModel[110].setRotationPoint(-44.1F, 8.5F, -28F);
		rightTrackModel[110].rotateAngleZ = 3.14159265F;

		rightTrackModel[111].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox225
		rightTrackModel[111].setRotationPoint(-44.1F, 8.5F, -32F);
		rightTrackModel[111].rotateAngleZ = 3.14159265F;

		rightTrackModel[112].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox226
		rightTrackModel[112].setRotationPoint(-44.1F, 8.5F, -32F);
		rightTrackModel[112].rotateAngleZ = 3.14159265F;

		rightTrackModel[113].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox227
		rightTrackModel[113].setRotationPoint(-44.1F, 8.5F, -33F);
		rightTrackModel[113].rotateAngleZ = 3.14159265F;

		rightTrackModel[114].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox234
		rightTrackModel[114].setRotationPoint(-41.1F, 8.5F, -24F);
		rightTrackModel[114].rotateAngleZ = 3.14159265F;

		rightTrackModel[115].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox235
		rightTrackModel[115].setRotationPoint(-41.1F, 8.5F, -24F);
		rightTrackModel[115].rotateAngleZ = 3.14159265F;

		rightTrackModel[116].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox236
		rightTrackModel[116].setRotationPoint(-41.1F, 8.5F, -28F);
		rightTrackModel[116].rotateAngleZ = 3.14159265F;

		rightTrackModel[117].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox237
		rightTrackModel[117].setRotationPoint(-41.1F, 8.5F, -32F);
		rightTrackModel[117].rotateAngleZ = 3.14159265F;

		rightTrackModel[118].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox238
		rightTrackModel[118].setRotationPoint(-41.1F, 8.5F, -32F);
		rightTrackModel[118].rotateAngleZ = 3.14159265F;

		rightTrackModel[119].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox239
		rightTrackModel[119].setRotationPoint(-41.1F, 8.5F, -33F);
		rightTrackModel[119].rotateAngleZ = 3.14159265F;

		rightTrackModel[120].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox246
		rightTrackModel[120].setRotationPoint(-38.1F, 8.5F, -24F);
		rightTrackModel[120].rotateAngleZ = 3.14159265F;

		rightTrackModel[121].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox247
		rightTrackModel[121].setRotationPoint(-38.1F, 8.5F, -24F);
		rightTrackModel[121].rotateAngleZ = 3.14159265F;

		rightTrackModel[122].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox248
		rightTrackModel[122].setRotationPoint(-38.1F, 8.5F, -28F);
		rightTrackModel[122].rotateAngleZ = 3.14159265F;

		rightTrackModel[123].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox249
		rightTrackModel[123].setRotationPoint(-38.1F, 8.5F, -32F);
		rightTrackModel[123].rotateAngleZ = 3.14159265F;

		rightTrackModel[124].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox250
		rightTrackModel[124].setRotationPoint(-38.1F, 8.5F, -32F);
		rightTrackModel[124].rotateAngleZ = 3.14159265F;

		rightTrackModel[125].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox251
		rightTrackModel[125].setRotationPoint(-38.1F, 8.5F, -33F);
		rightTrackModel[125].rotateAngleZ = 3.14159265F;

		rightTrackModel[126].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox258
		rightTrackModel[126].setRotationPoint(-35.1F, 8.5F, -24F);
		rightTrackModel[126].rotateAngleZ = 3.14159265F;

		rightTrackModel[127].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox259
		rightTrackModel[127].setRotationPoint(-35.1F, 8.5F, -24F);
		rightTrackModel[127].rotateAngleZ = 3.14159265F;

		rightTrackModel[128].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox260
		rightTrackModel[128].setRotationPoint(-35.1F, 8.5F, -28F);
		rightTrackModel[128].rotateAngleZ = 3.14159265F;

		rightTrackModel[129].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox261
		rightTrackModel[129].setRotationPoint(-35.1F, 8.5F, -32F);
		rightTrackModel[129].rotateAngleZ = 3.14159265F;

		rightTrackModel[130].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox262
		rightTrackModel[130].setRotationPoint(-35.1F, 8.5F, -32F);
		rightTrackModel[130].rotateAngleZ = 3.14159265F;

		rightTrackModel[131].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox263
		rightTrackModel[131].setRotationPoint(-35.1F, 8.5F, -33F);
		rightTrackModel[131].rotateAngleZ = 3.14159265F;

		rightTrackModel[132].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox270
		rightTrackModel[132].setRotationPoint(-32.1F, 8.5F, -24F);
		rightTrackModel[132].rotateAngleZ = 3.14159265F;

		rightTrackModel[133].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox271
		rightTrackModel[133].setRotationPoint(-32.1F, 8.5F, -24F);
		rightTrackModel[133].rotateAngleZ = 3.14159265F;

		rightTrackModel[134].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox272
		rightTrackModel[134].setRotationPoint(-32.1F, 8.5F, -28F);
		rightTrackModel[134].rotateAngleZ = 3.14159265F;

		rightTrackModel[135].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox273
		rightTrackModel[135].setRotationPoint(-32.1F, 8.5F, -32F);
		rightTrackModel[135].rotateAngleZ = 3.14159265F;

		rightTrackModel[136].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox274
		rightTrackModel[136].setRotationPoint(-32.1F, 8.5F, -32F);
		rightTrackModel[136].rotateAngleZ = 3.14159265F;

		rightTrackModel[137].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox275
		rightTrackModel[137].setRotationPoint(-32.1F, 8.5F, -33F);
		rightTrackModel[137].rotateAngleZ = 3.14159265F;

		rightTrackModel[138].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox282
		rightTrackModel[138].setRotationPoint(-29.1F, 8.5F, -24F);
		rightTrackModel[138].rotateAngleZ = 3.14159265F;

		rightTrackModel[139].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox283
		rightTrackModel[139].setRotationPoint(-29.1F, 8.5F, -24F);
		rightTrackModel[139].rotateAngleZ = 3.14159265F;

		rightTrackModel[140].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox284
		rightTrackModel[140].setRotationPoint(-29.1F, 8.5F, -28F);
		rightTrackModel[140].rotateAngleZ = 3.14159265F;

		rightTrackModel[141].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox285
		rightTrackModel[141].setRotationPoint(-29.1F, 8.5F, -32F);
		rightTrackModel[141].rotateAngleZ = 3.14159265F;

		rightTrackModel[142].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox286
		rightTrackModel[142].setRotationPoint(-29.1F, 8.5F, -32F);
		rightTrackModel[142].rotateAngleZ = 3.14159265F;

		rightTrackModel[143].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox287
		rightTrackModel[143].setRotationPoint(-29.1F, 8.5F, -33F);
		rightTrackModel[143].rotateAngleZ = 3.14159265F;

		rightTrackModel[144].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox294
		rightTrackModel[144].setRotationPoint(-26.1F, 8.5F, -24F);
		rightTrackModel[144].rotateAngleZ = 3.14159265F;

		rightTrackModel[145].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox295
		rightTrackModel[145].setRotationPoint(-26.1F, 8.5F, -24F);
		rightTrackModel[145].rotateAngleZ = 3.14159265F;

		rightTrackModel[146].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox296
		rightTrackModel[146].setRotationPoint(-26.1F, 8.5F, -28F);
		rightTrackModel[146].rotateAngleZ = 3.14159265F;

		rightTrackModel[147].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox297
		rightTrackModel[147].setRotationPoint(-26.1F, 8.5F, -32F);
		rightTrackModel[147].rotateAngleZ = 3.14159265F;

		rightTrackModel[148].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox298
		rightTrackModel[148].setRotationPoint(-26.1F, 8.5F, -32F);
		rightTrackModel[148].rotateAngleZ = 3.14159265F;

		rightTrackModel[149].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox299
		rightTrackModel[149].setRotationPoint(-26.1F, 8.5F, -33F);
		rightTrackModel[149].rotateAngleZ = 3.14159265F;

		rightTrackModel[150].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox306
		rightTrackModel[150].setRotationPoint(-23.1F, 8.5F, -24F);
		rightTrackModel[150].rotateAngleZ = 3.14159265F;

		rightTrackModel[151].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox307
		rightTrackModel[151].setRotationPoint(-23.1F, 8.5F, -24F);
		rightTrackModel[151].rotateAngleZ = 3.14159265F;

		rightTrackModel[152].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox308
		rightTrackModel[152].setRotationPoint(-23.1F, 8.5F, -28F);
		rightTrackModel[152].rotateAngleZ = 3.14159265F;

		rightTrackModel[153].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox309
		rightTrackModel[153].setRotationPoint(-23.1F, 8.5F, -32F);
		rightTrackModel[153].rotateAngleZ = 3.14159265F;

		rightTrackModel[154].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox310
		rightTrackModel[154].setRotationPoint(-23.1F, 8.5F, -32F);
		rightTrackModel[154].rotateAngleZ = 3.14159265F;

		rightTrackModel[155].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox311
		rightTrackModel[155].setRotationPoint(-23.1F, 8.5F, -33F);
		rightTrackModel[155].rotateAngleZ = 3.14159265F;

		rightTrackModel[156].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox318
		rightTrackModel[156].setRotationPoint(-20.1F, 8.5F, -24F);
		rightTrackModel[156].rotateAngleZ = 3.14159265F;

		rightTrackModel[157].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox319
		rightTrackModel[157].setRotationPoint(-20.1F, 8.5F, -24F);
		rightTrackModel[157].rotateAngleZ = 3.14159265F;

		rightTrackModel[158].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox320
		rightTrackModel[158].setRotationPoint(-20.1F, 8.5F, -28F);
		rightTrackModel[158].rotateAngleZ = 3.14159265F;

		rightTrackModel[159].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox321
		rightTrackModel[159].setRotationPoint(-20.1F, 8.5F, -32F);
		rightTrackModel[159].rotateAngleZ = 3.14159265F;

		rightTrackModel[160].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox322
		rightTrackModel[160].setRotationPoint(-20.1F, 8.5F, -32F);
		rightTrackModel[160].rotateAngleZ = 3.14159265F;

		rightTrackModel[161].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox323
		rightTrackModel[161].setRotationPoint(-20.1F, 8.5F, -33F);
		rightTrackModel[161].rotateAngleZ = 3.14159265F;

		rightTrackModel[162].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox330
		rightTrackModel[162].setRotationPoint(-17.1F, 8.5F, -24F);
		rightTrackModel[162].rotateAngleZ = 3.14159265F;

		rightTrackModel[163].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox331
		rightTrackModel[163].setRotationPoint(-17.1F, 8.5F, -24F);
		rightTrackModel[163].rotateAngleZ = 3.14159265F;

		rightTrackModel[164].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox332
		rightTrackModel[164].setRotationPoint(-17.1F, 8.5F, -28F);
		rightTrackModel[164].rotateAngleZ = 3.14159265F;

		rightTrackModel[165].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox333
		rightTrackModel[165].setRotationPoint(-17.1F, 8.5F, -32F);
		rightTrackModel[165].rotateAngleZ = 3.14159265F;

		rightTrackModel[166].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox334
		rightTrackModel[166].setRotationPoint(-17.1F, 8.5F, -32F);
		rightTrackModel[166].rotateAngleZ = 3.14159265F;

		rightTrackModel[167].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox335
		rightTrackModel[167].setRotationPoint(-17.1F, 8.5F, -33F);
		rightTrackModel[167].rotateAngleZ = 3.14159265F;

		rightTrackModel[168].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox342
		rightTrackModel[168].setRotationPoint(-14.1F, 8.5F, -24F);
		rightTrackModel[168].rotateAngleZ = 3.14159265F;

		rightTrackModel[169].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox343
		rightTrackModel[169].setRotationPoint(-14.1F, 8.5F, -24F);
		rightTrackModel[169].rotateAngleZ = 3.14159265F;

		rightTrackModel[170].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox344
		rightTrackModel[170].setRotationPoint(-14.1F, 8.5F, -28F);
		rightTrackModel[170].rotateAngleZ = 3.14159265F;

		rightTrackModel[171].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox345
		rightTrackModel[171].setRotationPoint(-14.1F, 8.5F, -32F);
		rightTrackModel[171].rotateAngleZ = 3.14159265F;

		rightTrackModel[172].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox346
		rightTrackModel[172].setRotationPoint(-14.1F, 8.5F, -32F);
		rightTrackModel[172].rotateAngleZ = 3.14159265F;

		rightTrackModel[173].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox347
		rightTrackModel[173].setRotationPoint(-14.1F, 8.5F, -33F);
		rightTrackModel[173].rotateAngleZ = 3.14159265F;

		rightTrackModel[174].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox348
		rightTrackModel[174].setRotationPoint(-11.1F, 8.5F, -33F);
		rightTrackModel[174].rotateAngleZ = 3.14159265F;

		rightTrackModel[175].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox349
		rightTrackModel[175].setRotationPoint(-11.1F, 8.5F, -32F);
		rightTrackModel[175].rotateAngleZ = 3.14159265F;

		rightTrackModel[176].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox350
		rightTrackModel[176].setRotationPoint(-11.1F, 8.5F, -32F);
		rightTrackModel[176].rotateAngleZ = 3.14159265F;

		rightTrackModel[177].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox351
		rightTrackModel[177].setRotationPoint(-11.1F, 8.5F, -28F);
		rightTrackModel[177].rotateAngleZ = 3.14159265F;

		rightTrackModel[178].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox352
		rightTrackModel[178].setRotationPoint(-11.1F, 8.5F, -24F);
		rightTrackModel[178].rotateAngleZ = 3.14159265F;

		rightTrackModel[179].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox353
		rightTrackModel[179].setRotationPoint(-11.1F, 8.5F, -24F);
		rightTrackModel[179].rotateAngleZ = 3.14159265F;

		rightTrackModel[180].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox360
		rightTrackModel[180].setRotationPoint(-8.1F, 8.5F, -33F);
		rightTrackModel[180].rotateAngleZ = 3.14159265F;

		rightTrackModel[181].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		rightTrackModel[181].setRotationPoint(-8.1F, 8.5F, -32F);
		rightTrackModel[181].rotateAngleZ = 3.14159265F;

		rightTrackModel[182].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		rightTrackModel[182].setRotationPoint(-8.1F, 8.5F, -32F);
		rightTrackModel[182].rotateAngleZ = 3.14159265F;

		rightTrackModel[183].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox363
		rightTrackModel[183].setRotationPoint(-8.1F, 8.5F, -28F);
		rightTrackModel[183].rotateAngleZ = 3.14159265F;

		rightTrackModel[184].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox364
		rightTrackModel[184].setRotationPoint(-8.1F, 8.5F, -24F);
		rightTrackModel[184].rotateAngleZ = 3.14159265F;

		rightTrackModel[185].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox365
		rightTrackModel[185].setRotationPoint(-8.1F, 8.5F, -24F);
		rightTrackModel[185].rotateAngleZ = 3.14159265F;

		rightTrackModel[186].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox372
		rightTrackModel[186].setRotationPoint(-5.1F, 8.5F, -33F);
		rightTrackModel[186].rotateAngleZ = 3.14159265F;

		rightTrackModel[187].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox373
		rightTrackModel[187].setRotationPoint(-5.1F, 8.5F, -32F);
		rightTrackModel[187].rotateAngleZ = 3.14159265F;

		rightTrackModel[188].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox374
		rightTrackModel[188].setRotationPoint(-5.1F, 8.5F, -32F);
		rightTrackModel[188].rotateAngleZ = 3.14159265F;

		rightTrackModel[189].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox375
		rightTrackModel[189].setRotationPoint(-5.1F, 8.5F, -28F);
		rightTrackModel[189].rotateAngleZ = 3.14159265F;

		rightTrackModel[190].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox376
		rightTrackModel[190].setRotationPoint(-5.1F, 8.5F, -24F);
		rightTrackModel[190].rotateAngleZ = 3.14159265F;

		rightTrackModel[191].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox377
		rightTrackModel[191].setRotationPoint(-5.1F, 8.5F, -24F);
		rightTrackModel[191].rotateAngleZ = 3.14159265F;

		rightTrackModel[192].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox384
		rightTrackModel[192].setRotationPoint(-2.1F, 8.5F, -33F);
		rightTrackModel[192].rotateAngleZ = 3.14159265F;

		rightTrackModel[193].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox385
		rightTrackModel[193].setRotationPoint(-2.1F, 8.5F, -32F);
		rightTrackModel[193].rotateAngleZ = 3.14159265F;

		rightTrackModel[194].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox386
		rightTrackModel[194].setRotationPoint(-2.1F, 8.5F, -32F);
		rightTrackModel[194].rotateAngleZ = 3.14159265F;

		rightTrackModel[195].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox387
		rightTrackModel[195].setRotationPoint(-2.1F, 8.5F, -28F);
		rightTrackModel[195].rotateAngleZ = 3.14159265F;

		rightTrackModel[196].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox388
		rightTrackModel[196].setRotationPoint(-2.1F, 8.5F, -24F);
		rightTrackModel[196].rotateAngleZ = 3.14159265F;

		rightTrackModel[197].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox389
		rightTrackModel[197].setRotationPoint(-2.1F, 8.5F, -24F);
		rightTrackModel[197].rotateAngleZ = 3.14159265F;

		rightTrackModel[198].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox396
		rightTrackModel[198].setRotationPoint(0.9F, 8.5F, -33F);
		rightTrackModel[198].rotateAngleZ = 3.14159265F;

		rightTrackModel[199].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox397
		rightTrackModel[199].setRotationPoint(0.9F, 8.5F, -32F);
		rightTrackModel[199].rotateAngleZ = 3.14159265F;

		rightTrackModel[200].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox398
		rightTrackModel[200].setRotationPoint(0.9F, 8.5F, -32F);
		rightTrackModel[200].rotateAngleZ = 3.14159265F;

		rightTrackModel[201].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox399
		rightTrackModel[201].setRotationPoint(0.9F, 8.5F, -28F);
		rightTrackModel[201].rotateAngleZ = 3.14159265F;

		rightTrackModel[202].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox400
		rightTrackModel[202].setRotationPoint(0.9F, 8.5F, -24F);
		rightTrackModel[202].rotateAngleZ = 3.14159265F;

		rightTrackModel[203].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox401
		rightTrackModel[203].setRotationPoint(0.9F, 8.5F, -24F);
		rightTrackModel[203].rotateAngleZ = 3.14159265F;

		rightTrackModel[204].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox408
		rightTrackModel[204].setRotationPoint(3.9F, 8.5F, -33F);
		rightTrackModel[204].rotateAngleZ = 3.14159265F;

		rightTrackModel[205].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox409
		rightTrackModel[205].setRotationPoint(3.9F, 8.5F, -32F);
		rightTrackModel[205].rotateAngleZ = 3.14159265F;

		rightTrackModel[206].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox410
		rightTrackModel[206].setRotationPoint(3.9F, 8.5F, -32F);
		rightTrackModel[206].rotateAngleZ = 3.14159265F;

		rightTrackModel[207].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox411
		rightTrackModel[207].setRotationPoint(3.9F, 8.5F, -28F);
		rightTrackModel[207].rotateAngleZ = 3.14159265F;

		rightTrackModel[208].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox412
		rightTrackModel[208].setRotationPoint(3.9F, 8.5F, -24F);
		rightTrackModel[208].rotateAngleZ = 3.14159265F;

		rightTrackModel[209].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox413
		rightTrackModel[209].setRotationPoint(3.9F, 8.5F, -24F);
		rightTrackModel[209].rotateAngleZ = 3.14159265F;

		rightTrackModel[210].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox420
		rightTrackModel[210].setRotationPoint(6.9F, 8.5F, -33F);
		rightTrackModel[210].rotateAngleZ = 3.14159265F;

		rightTrackModel[211].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox421
		rightTrackModel[211].setRotationPoint(6.9F, 8.5F, -32F);
		rightTrackModel[211].rotateAngleZ = 3.14159265F;

		rightTrackModel[212].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox422
		rightTrackModel[212].setRotationPoint(6.9F, 8.5F, -32F);
		rightTrackModel[212].rotateAngleZ = 3.14159265F;

		rightTrackModel[213].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox423
		rightTrackModel[213].setRotationPoint(6.9F, 8.5F, -28F);
		rightTrackModel[213].rotateAngleZ = 3.14159265F;

		rightTrackModel[214].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox424
		rightTrackModel[214].setRotationPoint(6.9F, 8.5F, -24F);
		rightTrackModel[214].rotateAngleZ = 3.14159265F;

		rightTrackModel[215].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox425
		rightTrackModel[215].setRotationPoint(6.9F, 8.5F, -24F);
		rightTrackModel[215].rotateAngleZ = 3.14159265F;

		rightTrackModel[216].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox432
		rightTrackModel[216].setRotationPoint(9.9F, 8.5F, -33F);
		rightTrackModel[216].rotateAngleZ = 3.14159265F;

		rightTrackModel[217].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox433
		rightTrackModel[217].setRotationPoint(9.9F, 8.5F, -32F);
		rightTrackModel[217].rotateAngleZ = 3.14159265F;

		rightTrackModel[218].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox434
		rightTrackModel[218].setRotationPoint(9.9F, 8.5F, -32F);
		rightTrackModel[218].rotateAngleZ = 3.14159265F;

		rightTrackModel[219].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox435
		rightTrackModel[219].setRotationPoint(9.9F, 8.5F, -28F);
		rightTrackModel[219].rotateAngleZ = 3.14159265F;

		rightTrackModel[220].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox436
		rightTrackModel[220].setRotationPoint(9.9F, 8.5F, -24F);
		rightTrackModel[220].rotateAngleZ = 3.14159265F;

		rightTrackModel[221].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox437
		rightTrackModel[221].setRotationPoint(9.9F, 8.5F, -24F);
		rightTrackModel[221].rotateAngleZ = 3.14159265F;

		rightTrackModel[222].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox444
		rightTrackModel[222].setRotationPoint(12.9F, 8.5F, -33F);
		rightTrackModel[222].rotateAngleZ = 3.14159265F;

		rightTrackModel[223].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox445
		rightTrackModel[223].setRotationPoint(12.9F, 8.5F, -32F);
		rightTrackModel[223].rotateAngleZ = 3.14159265F;

		rightTrackModel[224].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox446
		rightTrackModel[224].setRotationPoint(12.9F, 8.5F, -32F);
		rightTrackModel[224].rotateAngleZ = 3.14159265F;

		rightTrackModel[225].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox447
		rightTrackModel[225].setRotationPoint(12.9F, 8.5F, -28F);
		rightTrackModel[225].rotateAngleZ = 3.14159265F;

		rightTrackModel[226].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox448
		rightTrackModel[226].setRotationPoint(12.9F, 8.5F, -24F);
		rightTrackModel[226].rotateAngleZ = 3.14159265F;

		rightTrackModel[227].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox449
		rightTrackModel[227].setRotationPoint(12.9F, 8.5F, -24F);
		rightTrackModel[227].rotateAngleZ = 3.14159265F;

		rightTrackModel[228].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox456
		rightTrackModel[228].setRotationPoint(15.9F, 8.5F, -33F);
		rightTrackModel[228].rotateAngleZ = 3.14159265F;

		rightTrackModel[229].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox457
		rightTrackModel[229].setRotationPoint(15.9F, 8.5F, -32F);
		rightTrackModel[229].rotateAngleZ = 3.14159265F;

		rightTrackModel[230].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox458
		rightTrackModel[230].setRotationPoint(15.9F, 8.5F, -32F);
		rightTrackModel[230].rotateAngleZ = 3.14159265F;

		rightTrackModel[231].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox459
		rightTrackModel[231].setRotationPoint(15.9F, 8.5F, -28F);
		rightTrackModel[231].rotateAngleZ = 3.14159265F;

		rightTrackModel[232].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox460
		rightTrackModel[232].setRotationPoint(15.9F, 8.5F, -24F);
		rightTrackModel[232].rotateAngleZ = 3.14159265F;

		rightTrackModel[233].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox461
		rightTrackModel[233].setRotationPoint(15.9F, 8.5F, -24F);
		rightTrackModel[233].rotateAngleZ = 3.14159265F;

		rightTrackModel[234].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox468
		rightTrackModel[234].setRotationPoint(18.9F, 8.5F, -33F);
		rightTrackModel[234].rotateAngleZ = 3.14159265F;

		rightTrackModel[235].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox469
		rightTrackModel[235].setRotationPoint(18.9F, 8.5F, -32F);
		rightTrackModel[235].rotateAngleZ = 3.14159265F;

		rightTrackModel[236].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox470
		rightTrackModel[236].setRotationPoint(18.9F, 8.5F, -32F);
		rightTrackModel[236].rotateAngleZ = 3.14159265F;

		rightTrackModel[237].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox471
		rightTrackModel[237].setRotationPoint(18.9F, 8.5F, -28F);
		rightTrackModel[237].rotateAngleZ = 3.14159265F;

		rightTrackModel[238].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox472
		rightTrackModel[238].setRotationPoint(18.9F, 8.5F, -24F);
		rightTrackModel[238].rotateAngleZ = 3.14159265F;

		rightTrackModel[239].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox473
		rightTrackModel[239].setRotationPoint(18.9F, 8.5F, -24F);
		rightTrackModel[239].rotateAngleZ = 3.14159265F;

		rightTrackModel[240].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox480
		rightTrackModel[240].setRotationPoint(21.9F, 8.5F, -33F);
		rightTrackModel[240].rotateAngleZ = 3.14159265F;

		rightTrackModel[241].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox481
		rightTrackModel[241].setRotationPoint(21.9F, 8.5F, -32F);
		rightTrackModel[241].rotateAngleZ = 3.14159265F;

		rightTrackModel[242].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox482
		rightTrackModel[242].setRotationPoint(21.9F, 8.5F, -32F);
		rightTrackModel[242].rotateAngleZ = 3.14159265F;

		rightTrackModel[243].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox483
		rightTrackModel[243].setRotationPoint(21.9F, 8.5F, -28F);
		rightTrackModel[243].rotateAngleZ = 3.14159265F;

		rightTrackModel[244].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox484
		rightTrackModel[244].setRotationPoint(21.9F, 8.5F, -24F);
		rightTrackModel[244].rotateAngleZ = 3.14159265F;

		rightTrackModel[245].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox485
		rightTrackModel[245].setRotationPoint(21.9F, 8.5F, -24F);
		rightTrackModel[245].rotateAngleZ = 3.14159265F;

		rightTrackModel[246].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox492
		rightTrackModel[246].setRotationPoint(24.9F, 8.5F, -33F);
		rightTrackModel[246].rotateAngleZ = 3.14159265F;

		rightTrackModel[247].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox493
		rightTrackModel[247].setRotationPoint(24.9F, 8.5F, -32F);
		rightTrackModel[247].rotateAngleZ = 3.14159265F;

		rightTrackModel[248].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox494
		rightTrackModel[248].setRotationPoint(24.9F, 8.5F, -32F);
		rightTrackModel[248].rotateAngleZ = 3.14159265F;

		rightTrackModel[249].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox495
		rightTrackModel[249].setRotationPoint(24.9F, 8.5F, -28F);
		rightTrackModel[249].rotateAngleZ = 3.14159265F;

		rightTrackModel[250].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox496
		rightTrackModel[250].setRotationPoint(24.9F, 8.5F, -24F);
		rightTrackModel[250].rotateAngleZ = 3.14159265F;

		rightTrackModel[251].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox497
		rightTrackModel[251].setRotationPoint(24.9F, 8.5F, -24F);
		rightTrackModel[251].rotateAngleZ = 3.14159265F;

		rightTrackModel[252].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox504
		rightTrackModel[252].setRotationPoint(27.9F, 8.5F, -33F);
		rightTrackModel[252].rotateAngleZ = 3.14159265F;

		rightTrackModel[253].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox505
		rightTrackModel[253].setRotationPoint(27.9F, 8.5F, -32F);
		rightTrackModel[253].rotateAngleZ = 3.14159265F;

		rightTrackModel[254].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox506
		rightTrackModel[254].setRotationPoint(27.9F, 8.5F, -32F);
		rightTrackModel[254].rotateAngleZ = 3.14159265F;

		rightTrackModel[255].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox507
		rightTrackModel[255].setRotationPoint(27.9F, 8.5F, -28F);
		rightTrackModel[255].rotateAngleZ = 3.14159265F;

		rightTrackModel[256].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox508
		rightTrackModel[256].setRotationPoint(27.9F, 8.5F, -24F);
		rightTrackModel[256].rotateAngleZ = 3.14159265F;

		rightTrackModel[257].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox509
		rightTrackModel[257].setRotationPoint(27.9F, 8.5F, -24F);
		rightTrackModel[257].rotateAngleZ = 3.14159265F;

		rightTrackModel[258].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox516
		rightTrackModel[258].setRotationPoint(30.9F, 8.5F, -33F);
		rightTrackModel[258].rotateAngleZ = 3.14159265F;

		rightTrackModel[259].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox517
		rightTrackModel[259].setRotationPoint(30.9F, 8.5F, -32F);
		rightTrackModel[259].rotateAngleZ = 3.14159265F;

		rightTrackModel[260].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox518
		rightTrackModel[260].setRotationPoint(30.9F, 8.5F, -32F);
		rightTrackModel[260].rotateAngleZ = 3.14159265F;

		rightTrackModel[261].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox519
		rightTrackModel[261].setRotationPoint(30.9F, 8.5F, -28F);
		rightTrackModel[261].rotateAngleZ = 3.14159265F;

		rightTrackModel[262].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox520
		rightTrackModel[262].setRotationPoint(30.9F, 8.5F, -24F);
		rightTrackModel[262].rotateAngleZ = 3.14159265F;

		rightTrackModel[263].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox521
		rightTrackModel[263].setRotationPoint(30.9F, 8.5F, -24F);
		rightTrackModel[263].rotateAngleZ = 3.14159265F;

		rightTrackModel[264].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox528
		rightTrackModel[264].setRotationPoint(33.9F, 8.5F, -33F);
		rightTrackModel[264].rotateAngleZ = 3.14159265F;

		rightTrackModel[265].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox529
		rightTrackModel[265].setRotationPoint(33.9F, 8.5F, -32F);
		rightTrackModel[265].rotateAngleZ = 3.14159265F;

		rightTrackModel[266].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox530
		rightTrackModel[266].setRotationPoint(33.9F, 8.5F, -32F);
		rightTrackModel[266].rotateAngleZ = 3.14159265F;

		rightTrackModel[267].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox531
		rightTrackModel[267].setRotationPoint(33.9F, 8.5F, -28F);
		rightTrackModel[267].rotateAngleZ = 3.14159265F;

		rightTrackModel[268].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox532
		rightTrackModel[268].setRotationPoint(33.9F, 8.5F, -24F);
		rightTrackModel[268].rotateAngleZ = 3.14159265F;

		rightTrackModel[269].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox533
		rightTrackModel[269].setRotationPoint(33.9F, 8.5F, -24F);
		rightTrackModel[269].rotateAngleZ = 3.14159265F;

		rightTrackModel[270].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox540
		rightTrackModel[270].setRotationPoint(36.9F, 8.5F, -33F);
		rightTrackModel[270].rotateAngleZ = 3.14159265F;

		rightTrackModel[271].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox541
		rightTrackModel[271].setRotationPoint(36.9F, 8.5F, -32F);
		rightTrackModel[271].rotateAngleZ = 3.14159265F;

		rightTrackModel[272].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox542
		rightTrackModel[272].setRotationPoint(36.9F, 8.5F, -32F);
		rightTrackModel[272].rotateAngleZ = 3.14159265F;

		rightTrackModel[273].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox543
		rightTrackModel[273].setRotationPoint(36.9F, 8.5F, -28F);
		rightTrackModel[273].rotateAngleZ = 3.14159265F;

		rightTrackModel[274].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox544
		rightTrackModel[274].setRotationPoint(36.9F, 8.5F, -24F);
		rightTrackModel[274].rotateAngleZ = 3.14159265F;

		rightTrackModel[275].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox545
		rightTrackModel[275].setRotationPoint(36.9F, 8.5F, -24F);
		rightTrackModel[275].rotateAngleZ = 3.14159265F;

		rightTrackModel[276].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox552
		rightTrackModel[276].setRotationPoint(39.9F, 8.5F, -33F);
		rightTrackModel[276].rotateAngleZ = 3.14159265F;

		rightTrackModel[277].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox553
		rightTrackModel[277].setRotationPoint(39.9F, 8.5F, -32F);
		rightTrackModel[277].rotateAngleZ = 3.14159265F;

		rightTrackModel[278].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox554
		rightTrackModel[278].setRotationPoint(39.9F, 8.5F, -32F);
		rightTrackModel[278].rotateAngleZ = 3.14159265F;

		rightTrackModel[279].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox555
		rightTrackModel[279].setRotationPoint(39.9F, 8.5F, -28F);
		rightTrackModel[279].rotateAngleZ = 3.14159265F;

		rightTrackModel[280].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox556
		rightTrackModel[280].setRotationPoint(39.9F, 8.5F, -24F);
		rightTrackModel[280].rotateAngleZ = 3.14159265F;

		rightTrackModel[281].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox557
		rightTrackModel[281].setRotationPoint(39.9F, 8.5F, -24F);
		rightTrackModel[281].rotateAngleZ = 3.14159265F;

		rightTrackModel[282].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox564
		rightTrackModel[282].setRotationPoint(42.9F, 8.5F, -33F);
		rightTrackModel[282].rotateAngleZ = 3.14159265F;

		rightTrackModel[283].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox565
		rightTrackModel[283].setRotationPoint(42.9F, 8.5F, -32F);
		rightTrackModel[283].rotateAngleZ = 3.14159265F;

		rightTrackModel[284].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox566
		rightTrackModel[284].setRotationPoint(42.9F, 8.5F, -32F);
		rightTrackModel[284].rotateAngleZ = 3.14159265F;

		rightTrackModel[285].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox567
		rightTrackModel[285].setRotationPoint(42.9F, 8.5F, -28F);
		rightTrackModel[285].rotateAngleZ = 3.14159265F;

		rightTrackModel[286].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox568
		rightTrackModel[286].setRotationPoint(42.9F, 8.5F, -24F);
		rightTrackModel[286].rotateAngleZ = 3.14159265F;

		rightTrackModel[287].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox569
		rightTrackModel[287].setRotationPoint(42.9F, 8.5F, -24F);
		rightTrackModel[287].rotateAngleZ = 3.14159265F;

		rightTrackModel[288].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox576
		rightTrackModel[288].setRotationPoint(45.9F, 8.5F, -33F);
		rightTrackModel[288].rotateAngleZ = 3.54301838F;

		rightTrackModel[289].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox577
		rightTrackModel[289].setRotationPoint(45.9F, 8.5F, -32F);
		rightTrackModel[289].rotateAngleZ = 3.54301838F;

		rightTrackModel[290].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox578
		rightTrackModel[290].setRotationPoint(45.9F, 8.5F, -32F);
		rightTrackModel[290].rotateAngleZ = 3.54301838F;

		rightTrackModel[291].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox579
		rightTrackModel[291].setRotationPoint(45.9F, 8.5F, -28F);
		rightTrackModel[291].rotateAngleZ = 3.54301838F;

		rightTrackModel[292].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox580
		rightTrackModel[292].setRotationPoint(45.9F, 8.5F, -24F);
		rightTrackModel[292].rotateAngleZ = 3.54301838F;

		rightTrackModel[293].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox581
		rightTrackModel[293].setRotationPoint(45.9F, 8.5F, -24F);
		rightTrackModel[293].rotateAngleZ = 3.54301838F;

		rightTrackModel[294].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox588
		rightTrackModel[294].setRotationPoint(48.6F, 7.4F, -33F);
		rightTrackModel[294].rotateAngleZ = 3.54301838F;

		rightTrackModel[295].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox589
		rightTrackModel[295].setRotationPoint(48.6F, 7.4F, -32F);
		rightTrackModel[295].rotateAngleZ = 3.54301838F;

		rightTrackModel[296].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox590
		rightTrackModel[296].setRotationPoint(48.6F, 7.4F, -32F);
		rightTrackModel[296].rotateAngleZ = 3.54301838F;

		rightTrackModel[297].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox591
		rightTrackModel[297].setRotationPoint(48.6F, 7.4F, -28F);
		rightTrackModel[297].rotateAngleZ = 3.54301838F;

		rightTrackModel[298].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox592
		rightTrackModel[298].setRotationPoint(48.6F, 7.4F, -24F);
		rightTrackModel[298].rotateAngleZ = 3.54301838F;

		rightTrackModel[299].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox593
		rightTrackModel[299].setRotationPoint(48.6F, 7.4F, -24F);
		rightTrackModel[299].rotateAngleZ = 3.54301838F;

		rightTrackModel[300].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox600
		rightTrackModel[300].setRotationPoint(51.4F, 6.3F, -33F);
		rightTrackModel[300].rotateAngleZ = 3.64773814F;

		rightTrackModel[301].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox601
		rightTrackModel[301].setRotationPoint(51.4F, 6.3F, -32F);
		rightTrackModel[301].rotateAngleZ = 3.64773814F;

		rightTrackModel[302].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox602
		rightTrackModel[302].setRotationPoint(51.4F, 6.3F, -32F);
		rightTrackModel[302].rotateAngleZ = 3.64773814F;

		rightTrackModel[303].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox603
		rightTrackModel[303].setRotationPoint(51.4F, 6.3F, -28F);
		rightTrackModel[303].rotateAngleZ = 3.64773814F;

		rightTrackModel[304].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox604
		rightTrackModel[304].setRotationPoint(51.4F, 6.3F, -24F);
		rightTrackModel[304].rotateAngleZ = 3.64773814F;

		rightTrackModel[305].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox605
		rightTrackModel[305].setRotationPoint(51.4F, 6.3F, -24F);
		rightTrackModel[305].rotateAngleZ = 3.64773814F;

		rightTrackModel[306].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox612
		rightTrackModel[306].setRotationPoint(53.9F, 5F, -33F);
		rightTrackModel[306].rotateAngleZ = 3.64773814F;

		rightTrackModel[307].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox613
		rightTrackModel[307].setRotationPoint(53.9F, 5F, -32F);
		rightTrackModel[307].rotateAngleZ = 3.64773814F;

		rightTrackModel[308].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox614
		rightTrackModel[308].setRotationPoint(53.9F, 5F, -32F);
		rightTrackModel[308].rotateAngleZ = 3.64773814F;

		rightTrackModel[309].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox615
		rightTrackModel[309].setRotationPoint(53.9F, 5F, -28F);
		rightTrackModel[309].rotateAngleZ = 3.64773814F;

		rightTrackModel[310].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox616
		rightTrackModel[310].setRotationPoint(53.9F, 5F, -24F);
		rightTrackModel[310].rotateAngleZ = 3.64773814F;

		rightTrackModel[311].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox617
		rightTrackModel[311].setRotationPoint(53.9F, 5F, -24F);
		rightTrackModel[311].rotateAngleZ = 3.64773814F;

		rightTrackModel[312].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox624
		rightTrackModel[312].setRotationPoint(56.5F, 3.6F, -33F);
		rightTrackModel[312].rotateAngleZ = 3.64773814F;

		rightTrackModel[313].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox625
		rightTrackModel[313].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[313].rotateAngleZ = 3.64773814F;

		rightTrackModel[314].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox626
		rightTrackModel[314].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[314].rotateAngleZ = 3.64773814F;

		rightTrackModel[315].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox627
		rightTrackModel[315].setRotationPoint(56.5F, 3.6F, -28F);
		rightTrackModel[315].rotateAngleZ = 3.64773814F;

		rightTrackModel[316].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox628
		rightTrackModel[316].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[316].rotateAngleZ = 3.64773814F;

		rightTrackModel[317].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox629
		rightTrackModel[317].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[317].rotateAngleZ = 3.64773814F;

		rightTrackModel[318].addShapeBox(-6F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox636
		rightTrackModel[318].setRotationPoint(56.5F, 3.6F, -33F);
		rightTrackModel[318].rotateAngleZ = 3.64773814F;

		rightTrackModel[319].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox637
		rightTrackModel[319].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[319].rotateAngleZ = 3.64773814F;

		rightTrackModel[320].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox638
		rightTrackModel[320].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[320].rotateAngleZ = 3.64773814F;

		rightTrackModel[321].addShapeBox(-5F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox639
		rightTrackModel[321].setRotationPoint(56.5F, 3.6F, -28F);
		rightTrackModel[321].rotateAngleZ = 3.64773814F;

		rightTrackModel[322].addShapeBox(-5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox640
		rightTrackModel[322].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[322].rotateAngleZ = 3.64773814F;

		rightTrackModel[323].addShapeBox(-4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox641
		rightTrackModel[323].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[323].rotateAngleZ = 3.64773814F;

		rightTrackModel[324].addShapeBox(-9F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox648
		rightTrackModel[324].setRotationPoint(56.5F, 3.6F, -33F);
		rightTrackModel[324].rotateAngleZ = 3.64773814F;

		rightTrackModel[325].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox649
		rightTrackModel[325].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[325].rotateAngleZ = 3.64773814F;

		rightTrackModel[326].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox650
		rightTrackModel[326].setRotationPoint(56.5F, 3.6F, -32F);
		rightTrackModel[326].rotateAngleZ = 3.64773814F;

		rightTrackModel[327].addShapeBox(-8F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox651
		rightTrackModel[327].setRotationPoint(56.5F, 3.6F, -28F);
		rightTrackModel[327].rotateAngleZ = 3.64773814F;

		rightTrackModel[328].addShapeBox(-8F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox652
		rightTrackModel[328].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[328].rotateAngleZ = 3.64773814F;

		rightTrackModel[329].addShapeBox(-7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox653
		rightTrackModel[329].setRotationPoint(56.5F, 3.6F, -24F);
		rightTrackModel[329].rotateAngleZ = 3.64773814F;

		rightTrackModel[330].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox660
		rightTrackModel[330].setRotationPoint(64.3F, -0.7F, -33F);
		rightTrackModel[330].rotateAngleZ = 3.92699082F;

		rightTrackModel[331].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox661
		rightTrackModel[331].setRotationPoint(64.3F, -0.7F, -32F);
		rightTrackModel[331].rotateAngleZ = 3.92699082F;

		rightTrackModel[332].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox662
		rightTrackModel[332].setRotationPoint(64.3F, -0.7F, -32F);
		rightTrackModel[332].rotateAngleZ = 3.92699082F;

		rightTrackModel[333].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox663
		rightTrackModel[333].setRotationPoint(64.3F, -0.7F, -28F);
		rightTrackModel[333].rotateAngleZ = 3.92699082F;

		rightTrackModel[334].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox664
		rightTrackModel[334].setRotationPoint(64.3F, -0.7F, -24F);
		rightTrackModel[334].rotateAngleZ = 3.92699082F;

		rightTrackModel[335].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox665
		rightTrackModel[335].setRotationPoint(64.3F, -0.7F, -24F);
		rightTrackModel[335].rotateAngleZ = 3.92699082F;

		rightTrackModel[336].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox672
		rightTrackModel[336].setRotationPoint(66.3F, -2.7F, -33F);
		rightTrackModel[336].rotateAngleZ = 4.13643033F;

		rightTrackModel[337].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox673
		rightTrackModel[337].setRotationPoint(66.3F, -2.7F, -32F);
		rightTrackModel[337].rotateAngleZ = 4.13643033F;

		rightTrackModel[338].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox674
		rightTrackModel[338].setRotationPoint(66.3F, -2.7F, -32F);
		rightTrackModel[338].rotateAngleZ = 4.13643033F;

		rightTrackModel[339].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox675
		rightTrackModel[339].setRotationPoint(66.3F, -2.7F, -28F);
		rightTrackModel[339].rotateAngleZ = 4.13643033F;

		rightTrackModel[340].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox676
		rightTrackModel[340].setRotationPoint(66.3F, -2.7F, -24F);
		rightTrackModel[340].rotateAngleZ = 4.13643033F;

		rightTrackModel[341].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox677
		rightTrackModel[341].setRotationPoint(66.3F, -2.7F, -24F);
		rightTrackModel[341].rotateAngleZ = 4.13643033F;

		rightTrackModel[342].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox684
		rightTrackModel[342].setRotationPoint(68F, -5.1F, -33F);
		rightTrackModel[342].rotateAngleZ = 4.69493569F;

		rightTrackModel[343].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox685
		rightTrackModel[343].setRotationPoint(68F, -5.1F, -32F);
		rightTrackModel[343].rotateAngleZ = 4.69493569F;

		rightTrackModel[344].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox686
		rightTrackModel[344].setRotationPoint(68F, -5.1F, -32F);
		rightTrackModel[344].rotateAngleZ = 4.69493569F;

		rightTrackModel[345].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox687
		rightTrackModel[345].setRotationPoint(68F, -5.1F, -28F);
		rightTrackModel[345].rotateAngleZ = 4.69493569F;

		rightTrackModel[346].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox688
		rightTrackModel[346].setRotationPoint(68F, -5.1F, -24F);
		rightTrackModel[346].rotateAngleZ = 4.69493569F;

		rightTrackModel[347].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox689
		rightTrackModel[347].setRotationPoint(68F, -5.1F, -24F);
		rightTrackModel[347].rotateAngleZ = 4.69493569F;

		rightTrackModel[348].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox696
		rightTrackModel[348].setRotationPoint(68F, -8.1F, -33F);
		rightTrackModel[348].rotateAngleZ = 4.69493569F;

		rightTrackModel[349].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox697
		rightTrackModel[349].setRotationPoint(68F, -8.1F, -32F);
		rightTrackModel[349].rotateAngleZ = 4.69493569F;

		rightTrackModel[350].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox698
		rightTrackModel[350].setRotationPoint(68F, -8.1F, -32F);
		rightTrackModel[350].rotateAngleZ = 4.69493569F;

		rightTrackModel[351].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox699
		rightTrackModel[351].setRotationPoint(68F, -8.1F, -28F);
		rightTrackModel[351].rotateAngleZ = 4.69493569F;

		rightTrackModel[352].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox700
		rightTrackModel[352].setRotationPoint(68F, -8.1F, -24F);
		rightTrackModel[352].rotateAngleZ = 4.69493569F;

		rightTrackModel[353].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox701
		rightTrackModel[353].setRotationPoint(68F, -8.1F, -24F);
		rightTrackModel[353].rotateAngleZ = 4.69493569F;

		rightTrackModel[354].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox708
		rightTrackModel[354].setRotationPoint(68F, -11.1F, -33F);
		rightTrackModel[354].rotateAngleZ = 5.21853446F;

		rightTrackModel[355].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox709
		rightTrackModel[355].setRotationPoint(68F, -11.1F, -32F);
		rightTrackModel[355].rotateAngleZ = 5.21853446F;

		rightTrackModel[356].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox710
		rightTrackModel[356].setRotationPoint(68F, -11.1F, -32F);
		rightTrackModel[356].rotateAngleZ = 5.21853446F;

		rightTrackModel[357].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox711
		rightTrackModel[357].setRotationPoint(68F, -11.1F, -28F);
		rightTrackModel[357].rotateAngleZ = 5.21853446F;

		rightTrackModel[358].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox712
		rightTrackModel[358].setRotationPoint(68F, -11.1F, -24F);
		rightTrackModel[358].rotateAngleZ = 5.21853446F;

		rightTrackModel[359].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox713
		rightTrackModel[359].setRotationPoint(68F, -11.1F, -24F);
		rightTrackModel[359].rotateAngleZ = 5.21853446F;

		rightTrackModel[360].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox720
		rightTrackModel[360].setRotationPoint(66.5F, -13.7F, -33F);
		rightTrackModel[360].rotateAngleZ = 5.56760031F;

		rightTrackModel[361].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox721
		rightTrackModel[361].setRotationPoint(66.5F, -13.7F, -32F);
		rightTrackModel[361].rotateAngleZ = 5.56760031F;

		rightTrackModel[362].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox722
		rightTrackModel[362].setRotationPoint(66.5F, -13.7F, -32F);
		rightTrackModel[362].rotateAngleZ = 5.56760031F;

		rightTrackModel[363].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox723
		rightTrackModel[363].setRotationPoint(66.5F, -13.7F, -28F);
		rightTrackModel[363].rotateAngleZ = 5.56760031F;

		rightTrackModel[364].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox724
		rightTrackModel[364].setRotationPoint(66.5F, -13.7F, -24F);
		rightTrackModel[364].rotateAngleZ = 5.56760031F;

		rightTrackModel[365].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox725
		rightTrackModel[365].setRotationPoint(66.5F, -13.7F, -24F);
		rightTrackModel[365].rotateAngleZ = 5.56760031F;

		rightTrackModel[366].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox732
		rightTrackModel[366].setRotationPoint(65F, -16F, -33F);

		rightTrackModel[367].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox733
		rightTrackModel[367].setRotationPoint(65F, -16F, -32F);

		rightTrackModel[368].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox734
		rightTrackModel[368].setRotationPoint(65F, -16F, -32F);

		rightTrackModel[369].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox735
		rightTrackModel[369].setRotationPoint(65F, -16F, -28F);

		rightTrackModel[370].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox736
		rightTrackModel[370].setRotationPoint(65F, -16F, -24F);

		rightTrackModel[371].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox737
		rightTrackModel[371].setRotationPoint(65F, -16F, -24F);

		rightTrackModel[372].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox744
		rightTrackModel[372].setRotationPoint(62F, -16F, -33F);

		rightTrackModel[373].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox745
		rightTrackModel[373].setRotationPoint(62F, -16F, -32F);

		rightTrackModel[374].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox746
		rightTrackModel[374].setRotationPoint(62F, -16F, -32F);

		rightTrackModel[375].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox747
		rightTrackModel[375].setRotationPoint(62F, -16F, -28F);

		rightTrackModel[376].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox748
		rightTrackModel[376].setRotationPoint(62F, -16F, -24F);

		rightTrackModel[377].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox749
		rightTrackModel[377].setRotationPoint(62F, -16F, -24F);

		rightTrackModel[378].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox756
		rightTrackModel[378].setRotationPoint(59F, -16F, -33F);

		rightTrackModel[379].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox757
		rightTrackModel[379].setRotationPoint(59F, -16F, -32F);

		rightTrackModel[380].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox758
		rightTrackModel[380].setRotationPoint(59F, -16F, -32F);

		rightTrackModel[381].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox759
		rightTrackModel[381].setRotationPoint(59F, -16F, -28F);

		rightTrackModel[382].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox760
		rightTrackModel[382].setRotationPoint(59F, -16F, -24F);

		rightTrackModel[383].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox761
		rightTrackModel[383].setRotationPoint(59F, -16F, -24F);

		rightTrackModel[384].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox768
		rightTrackModel[384].setRotationPoint(56F, -16F, -33F);

		rightTrackModel[385].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox769
		rightTrackModel[385].setRotationPoint(56F, -16F, -32F);

		rightTrackModel[386].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox770
		rightTrackModel[386].setRotationPoint(56F, -16F, -32F);

		rightTrackModel[387].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox771
		rightTrackModel[387].setRotationPoint(56F, -16F, -28F);

		rightTrackModel[388].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox772
		rightTrackModel[388].setRotationPoint(56F, -16F, -24F);

		rightTrackModel[389].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox773
		rightTrackModel[389].setRotationPoint(56F, -16F, -24F);

		rightTrackModel[390].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox780
		rightTrackModel[390].setRotationPoint(53F, -16F, -33F);

		rightTrackModel[391].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox781
		rightTrackModel[391].setRotationPoint(53F, -16F, -32F);

		rightTrackModel[392].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox782
		rightTrackModel[392].setRotationPoint(53F, -16F, -32F);

		rightTrackModel[393].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox783
		rightTrackModel[393].setRotationPoint(53F, -16F, -28F);

		rightTrackModel[394].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox784
		rightTrackModel[394].setRotationPoint(53F, -16F, -24F);

		rightTrackModel[395].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox785
		rightTrackModel[395].setRotationPoint(53F, -16F, -24F);

		rightTrackModel[396].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox792
		rightTrackModel[396].setRotationPoint(50F, -16F, -33F);

		rightTrackModel[397].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox793
		rightTrackModel[397].setRotationPoint(50F, -16F, -32F);

		rightTrackModel[398].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox794
		rightTrackModel[398].setRotationPoint(50F, -16F, -32F);

		rightTrackModel[399].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox795
		rightTrackModel[399].setRotationPoint(50F, -16F, -28F);

		rightTrackModel[400].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox796
		rightTrackModel[400].setRotationPoint(50F, -16F, -24F);

		rightTrackModel[401].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox797
		rightTrackModel[401].setRotationPoint(50F, -16F, -24F);

		rightTrackModel[402].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox804
		rightTrackModel[402].setRotationPoint(47F, -16F, -33F);

		rightTrackModel[403].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox805
		rightTrackModel[403].setRotationPoint(47F, -16F, -32F);

		rightTrackModel[404].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox806
		rightTrackModel[404].setRotationPoint(47F, -16F, -32F);

		rightTrackModel[405].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox807
		rightTrackModel[405].setRotationPoint(47F, -16F, -28F);

		rightTrackModel[406].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox808
		rightTrackModel[406].setRotationPoint(47F, -16F, -24F);

		rightTrackModel[407].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox809
		rightTrackModel[407].setRotationPoint(47F, -16F, -24F);

		rightTrackModel[408].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox816
		rightTrackModel[408].setRotationPoint(44F, -16F, -33F);

		rightTrackModel[409].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox817
		rightTrackModel[409].setRotationPoint(44F, -16F, -32F);

		rightTrackModel[410].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox818
		rightTrackModel[410].setRotationPoint(44F, -16F, -32F);

		rightTrackModel[411].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox819
		rightTrackModel[411].setRotationPoint(44F, -16F, -28F);

		rightTrackModel[412].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox820
		rightTrackModel[412].setRotationPoint(44F, -16F, -24F);

		rightTrackModel[413].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox821
		rightTrackModel[413].setRotationPoint(44F, -16F, -24F);

		rightTrackModel[414].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox828
		rightTrackModel[414].setRotationPoint(41F, -16F, -33F);

		rightTrackModel[415].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox829
		rightTrackModel[415].setRotationPoint(41F, -16F, -32F);

		rightTrackModel[416].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox830
		rightTrackModel[416].setRotationPoint(41F, -16F, -32F);

		rightTrackModel[417].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox831
		rightTrackModel[417].setRotationPoint(41F, -16F, -28F);

		rightTrackModel[418].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox832
		rightTrackModel[418].setRotationPoint(41F, -16F, -24F);

		rightTrackModel[419].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox833
		rightTrackModel[419].setRotationPoint(41F, -16F, -24F);

		rightTrackModel[420].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox840
		rightTrackModel[420].setRotationPoint(38F, -16F, -33F);

		rightTrackModel[421].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox841
		rightTrackModel[421].setRotationPoint(38F, -16F, -32F);

		rightTrackModel[422].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox842
		rightTrackModel[422].setRotationPoint(38F, -16F, -32F);

		rightTrackModel[423].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox843
		rightTrackModel[423].setRotationPoint(38F, -16F, -28F);

		rightTrackModel[424].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox844
		rightTrackModel[424].setRotationPoint(38F, -16F, -24F);

		rightTrackModel[425].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox845
		rightTrackModel[425].setRotationPoint(38F, -16F, -24F);

		rightTrackModel[426].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox852
		rightTrackModel[426].setRotationPoint(35F, -16F, -33F);

		rightTrackModel[427].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox853
		rightTrackModel[427].setRotationPoint(35F, -16F, -32F);

		rightTrackModel[428].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox854
		rightTrackModel[428].setRotationPoint(35F, -16F, -32F);

		rightTrackModel[429].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox855
		rightTrackModel[429].setRotationPoint(35F, -16F, -28F);

		rightTrackModel[430].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox856
		rightTrackModel[430].setRotationPoint(35F, -16F, -24F);

		rightTrackModel[431].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox857
		rightTrackModel[431].setRotationPoint(35F, -16F, -24F);

		rightTrackModel[432].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox864
		rightTrackModel[432].setRotationPoint(32F, -16F, -33F);

		rightTrackModel[433].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox865
		rightTrackModel[433].setRotationPoint(32F, -16F, -32F);

		rightTrackModel[434].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox866
		rightTrackModel[434].setRotationPoint(32F, -16F, -32F);

		rightTrackModel[435].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox867
		rightTrackModel[435].setRotationPoint(32F, -16F, -28F);

		rightTrackModel[436].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox868
		rightTrackModel[436].setRotationPoint(32F, -16F, -24F);

		rightTrackModel[437].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox869
		rightTrackModel[437].setRotationPoint(32F, -16F, -24F);

		rightTrackModel[438].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox876
		rightTrackModel[438].setRotationPoint(29F, -16F, -33F);

		rightTrackModel[439].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox877
		rightTrackModel[439].setRotationPoint(29F, -16F, -32F);

		rightTrackModel[440].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox878
		rightTrackModel[440].setRotationPoint(29F, -16F, -32F);

		rightTrackModel[441].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox879
		rightTrackModel[441].setRotationPoint(29F, -16F, -28F);

		rightTrackModel[442].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox880
		rightTrackModel[442].setRotationPoint(29F, -16F, -24F);

		rightTrackModel[443].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox881
		rightTrackModel[443].setRotationPoint(29F, -16F, -24F);

		rightTrackModel[444].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox888
		rightTrackModel[444].setRotationPoint(26F, -16F, -33F);

		rightTrackModel[445].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox889
		rightTrackModel[445].setRotationPoint(26F, -16F, -32F);

		rightTrackModel[446].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox890
		rightTrackModel[446].setRotationPoint(26F, -16F, -32F);

		rightTrackModel[447].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox891
		rightTrackModel[447].setRotationPoint(26F, -16F, -28F);

		rightTrackModel[448].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox892
		rightTrackModel[448].setRotationPoint(26F, -16F, -24F);

		rightTrackModel[449].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox893
		rightTrackModel[449].setRotationPoint(26F, -16F, -24F);

		rightTrackModel[450].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox900
		rightTrackModel[450].setRotationPoint(23F, -16F, -33F);

		rightTrackModel[451].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox901
		rightTrackModel[451].setRotationPoint(23F, -16F, -32F);

		rightTrackModel[452].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox902
		rightTrackModel[452].setRotationPoint(23F, -16F, -32F);

		rightTrackModel[453].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox903
		rightTrackModel[453].setRotationPoint(23F, -16F, -28F);

		rightTrackModel[454].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox904
		rightTrackModel[454].setRotationPoint(23F, -16F, -24F);

		rightTrackModel[455].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox905
		rightTrackModel[455].setRotationPoint(23F, -16F, -24F);

		rightTrackModel[456].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox912
		rightTrackModel[456].setRotationPoint(20F, -16F, -33F);

		rightTrackModel[457].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox913
		rightTrackModel[457].setRotationPoint(20F, -16F, -32F);

		rightTrackModel[458].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox914
		rightTrackModel[458].setRotationPoint(20F, -16F, -32F);

		rightTrackModel[459].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox915
		rightTrackModel[459].setRotationPoint(20F, -16F, -28F);

		rightTrackModel[460].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox916
		rightTrackModel[460].setRotationPoint(20F, -16F, -24F);

		rightTrackModel[461].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox917
		rightTrackModel[461].setRotationPoint(20F, -16F, -24F);

		rightTrackModel[462].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox924
		rightTrackModel[462].setRotationPoint(17F, -16F, -33F);

		rightTrackModel[463].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox925
		rightTrackModel[463].setRotationPoint(17F, -16F, -32F);

		rightTrackModel[464].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox926
		rightTrackModel[464].setRotationPoint(17F, -16F, -32F);

		rightTrackModel[465].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox927
		rightTrackModel[465].setRotationPoint(17F, -16F, -28F);

		rightTrackModel[466].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox928
		rightTrackModel[466].setRotationPoint(17F, -16F, -24F);

		rightTrackModel[467].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox929
		rightTrackModel[467].setRotationPoint(17F, -16F, -24F);

		rightTrackModel[468].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox936
		rightTrackModel[468].setRotationPoint(14F, -16F, -33F);

		rightTrackModel[469].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox937
		rightTrackModel[469].setRotationPoint(14F, -16F, -32F);

		rightTrackModel[470].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox938
		rightTrackModel[470].setRotationPoint(14F, -16F, -32F);

		rightTrackModel[471].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox939
		rightTrackModel[471].setRotationPoint(14F, -16F, -28F);

		rightTrackModel[472].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox940
		rightTrackModel[472].setRotationPoint(14F, -16F, -24F);

		rightTrackModel[473].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox941
		rightTrackModel[473].setRotationPoint(14F, -16F, -24F);

		rightTrackModel[474].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox948
		rightTrackModel[474].setRotationPoint(11F, -16F, -33F);

		rightTrackModel[475].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox949
		rightTrackModel[475].setRotationPoint(11F, -16F, -32F);

		rightTrackModel[476].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox950
		rightTrackModel[476].setRotationPoint(11F, -16F, -32F);

		rightTrackModel[477].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox951
		rightTrackModel[477].setRotationPoint(11F, -16F, -28F);

		rightTrackModel[478].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox952
		rightTrackModel[478].setRotationPoint(11F, -16F, -24F);

		rightTrackModel[479].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox953
		rightTrackModel[479].setRotationPoint(11F, -16F, -24F);

		rightTrackModel[480].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox960
		rightTrackModel[480].setRotationPoint(8F, -16F, -33F);

		rightTrackModel[481].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox961
		rightTrackModel[481].setRotationPoint(8F, -16F, -32F);

		rightTrackModel[482].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox962
		rightTrackModel[482].setRotationPoint(8F, -16F, -32F);

		rightTrackModel[483].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox963
		rightTrackModel[483].setRotationPoint(8F, -16F, -28F);

		rightTrackModel[484].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox964
		rightTrackModel[484].setRotationPoint(8F, -16F, -24F);

		rightTrackModel[485].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox965
		rightTrackModel[485].setRotationPoint(8F, -16F, -24F);

		rightTrackModel[486].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox972
		rightTrackModel[486].setRotationPoint(5F, -16F, -33F);

		rightTrackModel[487].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox973
		rightTrackModel[487].setRotationPoint(5F, -16F, -32F);

		rightTrackModel[488].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox974
		rightTrackModel[488].setRotationPoint(5F, -16F, -32F);

		rightTrackModel[489].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox975
		rightTrackModel[489].setRotationPoint(5F, -16F, -28F);

		rightTrackModel[490].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox976
		rightTrackModel[490].setRotationPoint(5F, -16F, -24F);

		rightTrackModel[491].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox977
		rightTrackModel[491].setRotationPoint(5F, -16F, -24F);

		rightTrackModel[492].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox984
		rightTrackModel[492].setRotationPoint(2F, -16F, -33F);

		rightTrackModel[493].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox985
		rightTrackModel[493].setRotationPoint(2F, -16F, -32F);

		rightTrackModel[494].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox986
		rightTrackModel[494].setRotationPoint(2F, -16F, -32F);

		rightTrackModel[495].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox987
		rightTrackModel[495].setRotationPoint(2F, -16F, -28F);

		rightTrackModel[496].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox988
		rightTrackModel[496].setRotationPoint(2F, -16F, -24F);

		rightTrackModel[497].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox989
		rightTrackModel[497].setRotationPoint(2F, -16F, -24F);

		rightTrackModel[498].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox996
		rightTrackModel[498].setRotationPoint(-1F, -16F, -33F);

		rightTrackModel[499].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox997
		rightTrackModel[499].setRotationPoint(-1F, -16F, -32F);
	}

	private void initrightTrackModel_2()
	{
		rightTrackModel[500] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox998
		rightTrackModel[501] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox999
		rightTrackModel[502] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1000
		rightTrackModel[503] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1001
		rightTrackModel[504] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1008
		rightTrackModel[505] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1009
		rightTrackModel[506] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1010
		rightTrackModel[507] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1011
		rightTrackModel[508] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1012
		rightTrackModel[509] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1013
		rightTrackModel[510] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1020
		rightTrackModel[511] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1021
		rightTrackModel[512] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1022
		rightTrackModel[513] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1023
		rightTrackModel[514] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1024
		rightTrackModel[515] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1025
		rightTrackModel[516] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1032
		rightTrackModel[517] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1033
		rightTrackModel[518] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1034
		rightTrackModel[519] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1035
		rightTrackModel[520] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1036
		rightTrackModel[521] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1037
		rightTrackModel[522] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1044
		rightTrackModel[523] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1045
		rightTrackModel[524] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1046
		rightTrackModel[525] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1047
		rightTrackModel[526] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1048
		rightTrackModel[527] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1049
		rightTrackModel[528] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1056
		rightTrackModel[529] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1057
		rightTrackModel[530] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1058
		rightTrackModel[531] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1059
		rightTrackModel[532] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1060
		rightTrackModel[533] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1061
		rightTrackModel[534] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1068
		rightTrackModel[535] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1069
		rightTrackModel[536] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1070
		rightTrackModel[537] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1071
		rightTrackModel[538] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1072
		rightTrackModel[539] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1073
		rightTrackModel[540] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1080
		rightTrackModel[541] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1081
		rightTrackModel[542] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1082
		rightTrackModel[543] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1083
		rightTrackModel[544] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1084
		rightTrackModel[545] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1085
		rightTrackModel[546] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1092
		rightTrackModel[547] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1093
		rightTrackModel[548] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1094
		rightTrackModel[549] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1095
		rightTrackModel[550] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1096
		rightTrackModel[551] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1097
		rightTrackModel[552] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1104
		rightTrackModel[553] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1105
		rightTrackModel[554] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1106
		rightTrackModel[555] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1107
		rightTrackModel[556] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1108
		rightTrackModel[557] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1109
		rightTrackModel[558] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1116
		rightTrackModel[559] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1117
		rightTrackModel[560] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1118
		rightTrackModel[561] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1119
		rightTrackModel[562] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1120
		rightTrackModel[563] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1121
		rightTrackModel[564] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1128
		rightTrackModel[565] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1129
		rightTrackModel[566] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1130
		rightTrackModel[567] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1131
		rightTrackModel[568] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1132
		rightTrackModel[569] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1133
		rightTrackModel[570] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1140
		rightTrackModel[571] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1141
		rightTrackModel[572] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1142
		rightTrackModel[573] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1143
		rightTrackModel[574] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1144
		rightTrackModel[575] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1145
		rightTrackModel[576] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1152
		rightTrackModel[577] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1153
		rightTrackModel[578] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1154
		rightTrackModel[579] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1155
		rightTrackModel[580] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1156
		rightTrackModel[581] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1157
		rightTrackModel[582] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1164
		rightTrackModel[583] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1165
		rightTrackModel[584] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1166
		rightTrackModel[585] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1167
		rightTrackModel[586] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1168
		rightTrackModel[587] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1169
		rightTrackModel[588] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1176
		rightTrackModel[589] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1177
		rightTrackModel[590] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1178
		rightTrackModel[591] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1179
		rightTrackModel[592] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1180
		rightTrackModel[593] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1181
		rightTrackModel[594] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1188
		rightTrackModel[595] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1189
		rightTrackModel[596] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1190
		rightTrackModel[597] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1191
		rightTrackModel[598] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1192
		rightTrackModel[599] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1193
		rightTrackModel[600] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1200
		rightTrackModel[601] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1201
		rightTrackModel[602] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1202
		rightTrackModel[603] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1203
		rightTrackModel[604] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1204
		rightTrackModel[605] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1205
		rightTrackModel[606] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1212
		rightTrackModel[607] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1213
		rightTrackModel[608] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1214
		rightTrackModel[609] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1215
		rightTrackModel[610] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1216
		rightTrackModel[611] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1217
		rightTrackModel[612] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1224
		rightTrackModel[613] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1225
		rightTrackModel[614] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1226
		rightTrackModel[615] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1227
		rightTrackModel[616] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1228
		rightTrackModel[617] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1229
		rightTrackModel[618] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1236
		rightTrackModel[619] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1237
		rightTrackModel[620] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1238
		rightTrackModel[621] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1239
		rightTrackModel[622] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1240
		rightTrackModel[623] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1241
		rightTrackModel[624] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import ImportBox1248
		rightTrackModel[625] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1249
		rightTrackModel[626] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1250
		rightTrackModel[627] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import ImportBox1251
		rightTrackModel[628] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1252
		rightTrackModel[629] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1253
		rightTrackModel[630] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1262
		rightTrackModel[631] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import ImportBox1263

		rightTrackModel[500].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox998
		rightTrackModel[500].setRotationPoint(-1F, -16F, -32F);

		rightTrackModel[501].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox999
		rightTrackModel[501].setRotationPoint(-1F, -16F, -28F);

		rightTrackModel[502].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1000
		rightTrackModel[502].setRotationPoint(-1F, -16F, -24F);

		rightTrackModel[503].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1001
		rightTrackModel[503].setRotationPoint(-1F, -16F, -24F);

		rightTrackModel[504].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1008
		rightTrackModel[504].setRotationPoint(-4F, -16F, -33F);

		rightTrackModel[505].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1009
		rightTrackModel[505].setRotationPoint(-4F, -16F, -32F);

		rightTrackModel[506].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1010
		rightTrackModel[506].setRotationPoint(-4F, -16F, -32F);

		rightTrackModel[507].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1011
		rightTrackModel[507].setRotationPoint(-4F, -16F, -28F);

		rightTrackModel[508].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1012
		rightTrackModel[508].setRotationPoint(-4F, -16F, -24F);

		rightTrackModel[509].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1013
		rightTrackModel[509].setRotationPoint(-4F, -16F, -24F);

		rightTrackModel[510].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1020
		rightTrackModel[510].setRotationPoint(-7F, -16F, -33F);

		rightTrackModel[511].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1021
		rightTrackModel[511].setRotationPoint(-7F, -16F, -32F);

		rightTrackModel[512].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1022
		rightTrackModel[512].setRotationPoint(-7F, -16F, -32F);

		rightTrackModel[513].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1023
		rightTrackModel[513].setRotationPoint(-7F, -16F, -28F);

		rightTrackModel[514].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1024
		rightTrackModel[514].setRotationPoint(-7F, -16F, -24F);

		rightTrackModel[515].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1025
		rightTrackModel[515].setRotationPoint(-7F, -16F, -24F);

		rightTrackModel[516].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1032
		rightTrackModel[516].setRotationPoint(-10F, -16F, -33F);

		rightTrackModel[517].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1033
		rightTrackModel[517].setRotationPoint(-10F, -16F, -32F);

		rightTrackModel[518].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1034
		rightTrackModel[518].setRotationPoint(-10F, -16F, -32F);

		rightTrackModel[519].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1035
		rightTrackModel[519].setRotationPoint(-10F, -16F, -28F);

		rightTrackModel[520].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1036
		rightTrackModel[520].setRotationPoint(-10F, -16F, -24F);

		rightTrackModel[521].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1037
		rightTrackModel[521].setRotationPoint(-10F, -16F, -24F);

		rightTrackModel[522].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1044
		rightTrackModel[522].setRotationPoint(-13F, -16F, -33F);

		rightTrackModel[523].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1045
		rightTrackModel[523].setRotationPoint(-13F, -16F, -32F);

		rightTrackModel[524].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1046
		rightTrackModel[524].setRotationPoint(-13F, -16F, -32F);

		rightTrackModel[525].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1047
		rightTrackModel[525].setRotationPoint(-13F, -16F, -28F);

		rightTrackModel[526].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1048
		rightTrackModel[526].setRotationPoint(-13F, -16F, -24F);

		rightTrackModel[527].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1049
		rightTrackModel[527].setRotationPoint(-13F, -16F, -24F);

		rightTrackModel[528].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1056
		rightTrackModel[528].setRotationPoint(-16F, -16F, -33F);

		rightTrackModel[529].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1057
		rightTrackModel[529].setRotationPoint(-16F, -16F, -32F);

		rightTrackModel[530].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1058
		rightTrackModel[530].setRotationPoint(-16F, -16F, -32F);

		rightTrackModel[531].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1059
		rightTrackModel[531].setRotationPoint(-16F, -16F, -28F);

		rightTrackModel[532].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1060
		rightTrackModel[532].setRotationPoint(-16F, -16F, -24F);

		rightTrackModel[533].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1061
		rightTrackModel[533].setRotationPoint(-16F, -16F, -24F);

		rightTrackModel[534].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1068
		rightTrackModel[534].setRotationPoint(-19F, -16F, -33F);

		rightTrackModel[535].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1069
		rightTrackModel[535].setRotationPoint(-19F, -16F, -32F);

		rightTrackModel[536].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1070
		rightTrackModel[536].setRotationPoint(-19F, -16F, -32F);

		rightTrackModel[537].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1071
		rightTrackModel[537].setRotationPoint(-19F, -16F, -28F);

		rightTrackModel[538].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1072
		rightTrackModel[538].setRotationPoint(-19F, -16F, -24F);

		rightTrackModel[539].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1073
		rightTrackModel[539].setRotationPoint(-19F, -16F, -24F);

		rightTrackModel[540].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1080
		rightTrackModel[540].setRotationPoint(-22F, -16F, -33F);

		rightTrackModel[541].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1081
		rightTrackModel[541].setRotationPoint(-22F, -16F, -32F);

		rightTrackModel[542].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1082
		rightTrackModel[542].setRotationPoint(-22F, -16F, -32F);

		rightTrackModel[543].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1083
		rightTrackModel[543].setRotationPoint(-22F, -16F, -28F);

		rightTrackModel[544].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1084
		rightTrackModel[544].setRotationPoint(-22F, -16F, -24F);

		rightTrackModel[545].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1085
		rightTrackModel[545].setRotationPoint(-22F, -16F, -24F);

		rightTrackModel[546].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1092
		rightTrackModel[546].setRotationPoint(-25F, -16F, -33F);

		rightTrackModel[547].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1093
		rightTrackModel[547].setRotationPoint(-25F, -16F, -32F);

		rightTrackModel[548].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1094
		rightTrackModel[548].setRotationPoint(-25F, -16F, -32F);

		rightTrackModel[549].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1095
		rightTrackModel[549].setRotationPoint(-25F, -16F, -28F);

		rightTrackModel[550].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1096
		rightTrackModel[550].setRotationPoint(-25F, -16F, -24F);

		rightTrackModel[551].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1097
		rightTrackModel[551].setRotationPoint(-25F, -16F, -24F);

		rightTrackModel[552].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1104
		rightTrackModel[552].setRotationPoint(-28F, -16F, -33F);

		rightTrackModel[553].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1105
		rightTrackModel[553].setRotationPoint(-28F, -16F, -32F);

		rightTrackModel[554].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1106
		rightTrackModel[554].setRotationPoint(-28F, -16F, -32F);

		rightTrackModel[555].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1107
		rightTrackModel[555].setRotationPoint(-28F, -16F, -28F);

		rightTrackModel[556].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1108
		rightTrackModel[556].setRotationPoint(-28F, -16F, -24F);

		rightTrackModel[557].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1109
		rightTrackModel[557].setRotationPoint(-28F, -16F, -24F);

		rightTrackModel[558].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1116
		rightTrackModel[558].setRotationPoint(-31F, -16F, -33F);

		rightTrackModel[559].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1117
		rightTrackModel[559].setRotationPoint(-31F, -16F, -32F);

		rightTrackModel[560].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1118
		rightTrackModel[560].setRotationPoint(-31F, -16F, -32F);

		rightTrackModel[561].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1119
		rightTrackModel[561].setRotationPoint(-31F, -16F, -28F);

		rightTrackModel[562].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1120
		rightTrackModel[562].setRotationPoint(-31F, -16F, -24F);

		rightTrackModel[563].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1121
		rightTrackModel[563].setRotationPoint(-31F, -16F, -24F);

		rightTrackModel[564].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1128
		rightTrackModel[564].setRotationPoint(-34F, -16F, -33F);

		rightTrackModel[565].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1129
		rightTrackModel[565].setRotationPoint(-34F, -16F, -32F);

		rightTrackModel[566].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1130
		rightTrackModel[566].setRotationPoint(-34F, -16F, -32F);

		rightTrackModel[567].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1131
		rightTrackModel[567].setRotationPoint(-34F, -16F, -28F);

		rightTrackModel[568].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1132
		rightTrackModel[568].setRotationPoint(-34F, -16F, -24F);

		rightTrackModel[569].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1133
		rightTrackModel[569].setRotationPoint(-34F, -16F, -24F);

		rightTrackModel[570].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1140
		rightTrackModel[570].setRotationPoint(-37F, -16F, -33F);

		rightTrackModel[571].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1141
		rightTrackModel[571].setRotationPoint(-37F, -16F, -32F);

		rightTrackModel[572].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1142
		rightTrackModel[572].setRotationPoint(-37F, -16F, -32F);

		rightTrackModel[573].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1143
		rightTrackModel[573].setRotationPoint(-37F, -16F, -28F);

		rightTrackModel[574].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1144
		rightTrackModel[574].setRotationPoint(-37F, -16F, -24F);

		rightTrackModel[575].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1145
		rightTrackModel[575].setRotationPoint(-37F, -16F, -24F);

		rightTrackModel[576].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1152
		rightTrackModel[576].setRotationPoint(-40F, -16F, -33F);

		rightTrackModel[577].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1153
		rightTrackModel[577].setRotationPoint(-40F, -16F, -32F);

		rightTrackModel[578].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1154
		rightTrackModel[578].setRotationPoint(-40F, -16F, -32F);

		rightTrackModel[579].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1155
		rightTrackModel[579].setRotationPoint(-40F, -16F, -28F);

		rightTrackModel[580].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1156
		rightTrackModel[580].setRotationPoint(-40F, -16F, -24F);

		rightTrackModel[581].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1157
		rightTrackModel[581].setRotationPoint(-40F, -16F, -24F);

		rightTrackModel[582].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1164
		rightTrackModel[582].setRotationPoint(-43F, -16F, -33F);

		rightTrackModel[583].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1165
		rightTrackModel[583].setRotationPoint(-43F, -16F, -32F);

		rightTrackModel[584].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1166
		rightTrackModel[584].setRotationPoint(-43F, -16F, -32F);

		rightTrackModel[585].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1167
		rightTrackModel[585].setRotationPoint(-43F, -16F, -28F);

		rightTrackModel[586].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1168
		rightTrackModel[586].setRotationPoint(-43F, -16F, -24F);

		rightTrackModel[587].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1169
		rightTrackModel[587].setRotationPoint(-43F, -16F, -24F);

		rightTrackModel[588].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1176
		rightTrackModel[588].setRotationPoint(-46F, -16F, -33F);

		rightTrackModel[589].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1177
		rightTrackModel[589].setRotationPoint(-46F, -16F, -32F);

		rightTrackModel[590].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1178
		rightTrackModel[590].setRotationPoint(-46F, -16F, -32F);

		rightTrackModel[591].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1179
		rightTrackModel[591].setRotationPoint(-46F, -16F, -28F);

		rightTrackModel[592].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1180
		rightTrackModel[592].setRotationPoint(-46F, -16F, -24F);

		rightTrackModel[593].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1181
		rightTrackModel[593].setRotationPoint(-46F, -16F, -24F);

		rightTrackModel[594].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1188
		rightTrackModel[594].setRotationPoint(-49F, -16F, -33F);

		rightTrackModel[595].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1189
		rightTrackModel[595].setRotationPoint(-49F, -16F, -32F);

		rightTrackModel[596].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1190
		rightTrackModel[596].setRotationPoint(-49F, -16F, -32F);

		rightTrackModel[597].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1191
		rightTrackModel[597].setRotationPoint(-49F, -16F, -28F);

		rightTrackModel[598].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1192
		rightTrackModel[598].setRotationPoint(-49F, -16F, -24F);

		rightTrackModel[599].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1193
		rightTrackModel[599].setRotationPoint(-49F, -16F, -24F);

		rightTrackModel[600].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1200
		rightTrackModel[600].setRotationPoint(-52F, -16F, -33F);

		rightTrackModel[601].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1201
		rightTrackModel[601].setRotationPoint(-52F, -16F, -32F);

		rightTrackModel[602].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1202
		rightTrackModel[602].setRotationPoint(-52F, -16F, -32F);

		rightTrackModel[603].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1203
		rightTrackModel[603].setRotationPoint(-52F, -16F, -28F);

		rightTrackModel[604].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1204
		rightTrackModel[604].setRotationPoint(-52F, -16F, -24F);

		rightTrackModel[605].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1205
		rightTrackModel[605].setRotationPoint(-52F, -16F, -24F);

		rightTrackModel[606].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1212
		rightTrackModel[606].setRotationPoint(-55F, -16F, -33F);

		rightTrackModel[607].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1213
		rightTrackModel[607].setRotationPoint(-55F, -16F, -32F);

		rightTrackModel[608].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1214
		rightTrackModel[608].setRotationPoint(-55F, -16F, -32F);

		rightTrackModel[609].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1215
		rightTrackModel[609].setRotationPoint(-55F, -16F, -28F);

		rightTrackModel[610].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1216
		rightTrackModel[610].setRotationPoint(-55F, -16F, -24F);

		rightTrackModel[611].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1217
		rightTrackModel[611].setRotationPoint(-55F, -16F, -24F);

		rightTrackModel[612].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1224
		rightTrackModel[612].setRotationPoint(-58F, -16F, -33F);

		rightTrackModel[613].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1225
		rightTrackModel[613].setRotationPoint(-58F, -16F, -32F);

		rightTrackModel[614].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1226
		rightTrackModel[614].setRotationPoint(-58F, -16F, -32F);

		rightTrackModel[615].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1227
		rightTrackModel[615].setRotationPoint(-58F, -16F, -28F);

		rightTrackModel[616].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1228
		rightTrackModel[616].setRotationPoint(-58F, -16F, -24F);

		rightTrackModel[617].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1229
		rightTrackModel[617].setRotationPoint(-58F, -16F, -24F);

		rightTrackModel[618].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1236
		rightTrackModel[618].setRotationPoint(-61F, -16F, -33F);

		rightTrackModel[619].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1237
		rightTrackModel[619].setRotationPoint(-61F, -16F, -32F);

		rightTrackModel[620].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1238
		rightTrackModel[620].setRotationPoint(-61F, -16F, -32F);

		rightTrackModel[621].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1239
		rightTrackModel[621].setRotationPoint(-61F, -16F, -28F);

		rightTrackModel[622].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1240
		rightTrackModel[622].setRotationPoint(-61F, -16F, -24F);

		rightTrackModel[623].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1241
		rightTrackModel[623].setRotationPoint(-61F, -16F, -24F);

		rightTrackModel[624].addShapeBox(-3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1248
		rightTrackModel[624].setRotationPoint(-64F, -16F, -33F);
		rightTrackModel[624].rotateAngleZ = 0.13962634F;

		rightTrackModel[625].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1249
		rightTrackModel[625].setRotationPoint(-64F, -16F, -32F);
		rightTrackModel[625].rotateAngleZ = 0.13962634F;

		rightTrackModel[626].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1250
		rightTrackModel[626].setRotationPoint(-64F, -16F, -32F);
		rightTrackModel[626].rotateAngleZ = 0.13962634F;

		rightTrackModel[627].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1251
		rightTrackModel[627].setRotationPoint(-64F, -16F, -28F);
		rightTrackModel[627].rotateAngleZ = 0.13962634F;

		rightTrackModel[628].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import ImportBox1252
		rightTrackModel[628].setRotationPoint(-64F, -16F, -24F);
		rightTrackModel[628].rotateAngleZ = 0.13962634F;

		rightTrackModel[629].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1253
		rightTrackModel[629].setRotationPoint(-64F, -16F, -24F);
		rightTrackModel[629].rotateAngleZ = 0.13962634F;

		rightTrackModel[630].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1262
		rightTrackModel[630].setRotationPoint(-67F, -15.5F, -32F);

		rightTrackModel[631].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1263
		rightTrackModel[631].setRotationPoint(-67F, -15.5F, -24F);
	}
}