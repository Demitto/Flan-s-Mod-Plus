//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelFangB extends ModelPlane
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelFangB()
	{
		bodyModel = new ModelRendererTurbo[195];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box12
		bodyModel[8] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box13
		bodyModel[9] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import Box14
		bodyModel[10] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box15
		bodyModel[11] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box16
		bodyModel[12] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import Box17
		bodyModel[13] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Box18
		bodyModel[14] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box19
		bodyModel[15] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import Box20
		bodyModel[16] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Box22
		bodyModel[17] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import Box23
		bodyModel[18] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import Box24
		bodyModel[19] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box25
		bodyModel[20] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box26
		bodyModel[21] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box27
		bodyModel[22] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box28
		bodyModel[23] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box29
		bodyModel[24] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Box30
		bodyModel[25] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import Box31
		bodyModel[26] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import Box32
		bodyModel[27] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Import Box0
		bodyModel[28] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import Box1
		bodyModel[29] = new ModelRendererTurbo(this, 81, 880, textureX, textureY); // Import Box2
		bodyModel[30] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import Box3
		bodyModel[31] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box4
		bodyModel[32] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Box5
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Import Box6
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box7
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import Box8
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import Box9
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import Box10
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import Box11
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box12
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box13
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Box14
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box15
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box17
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box18
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box21
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import Box22
		bodyModel[47] = new ModelRendererTurbo(this, 81, 880, textureX, textureY); // Import Box24
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box25
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import Box26
		bodyModel[50] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Import Box27
		bodyModel[51] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import Box28
		bodyModel[52] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import Box29
		bodyModel[53] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box30
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box31
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import Box32
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Import Box33
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box34
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import Box35
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import Box36
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Box37
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box39
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box41
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import Box42
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import Box44
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import Box45
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1490, textureX, textureY); // Import Box47
		bodyModel[67] = new ModelRendererTurbo(this, 81, 1520, textureX, textureY); // Import Box48
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1520, textureX, textureY); // Import Box49
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Import Box50
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Box51
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1640, textureX, textureY); // Import Box52
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box53
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import Box54
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1490, textureX, textureY); // Import Box55
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1520, textureX, textureY); // Import Box56
		bodyModel[76] = new ModelRendererTurbo(this, 81, 1520, textureX, textureY); // Import Box57
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Box58
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1640, textureX, textureY); // Import Box59
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import Box60
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import Box61
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Import Box62
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Import Box63
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Import Box64
		bodyModel[84] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box98
		bodyModel[85] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import Box99
		bodyModel[86] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box100
		bodyModel[87] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box101
		bodyModel[88] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box102
		bodyModel[89] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box103
		bodyModel[90] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box104
		bodyModel[91] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box107
		bodyModel[92] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box108
		bodyModel[93] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box109
		bodyModel[94] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box110
		bodyModel[95] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box111
		bodyModel[96] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box113
		bodyModel[97] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box114
		bodyModel[98] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box115
		bodyModel[99] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box116
		bodyModel[100] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box117
		bodyModel[101] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box118
		bodyModel[102] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box119
		bodyModel[103] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box120
		bodyModel[104] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box121
		bodyModel[105] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box122
		bodyModel[106] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box123
		bodyModel[107] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box124
		bodyModel[108] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box125
		bodyModel[109] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box126
		bodyModel[110] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box127
		bodyModel[111] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box128
		bodyModel[112] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box129
		bodyModel[113] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box130
		bodyModel[114] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box131
		bodyModel[115] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import Box132
		bodyModel[116] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box133
		bodyModel[117] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box134
		bodyModel[118] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box135
		bodyModel[119] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box136
		bodyModel[120] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box137
		bodyModel[121] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box138
		bodyModel[122] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box139
		bodyModel[123] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box140
		bodyModel[124] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box141
		bodyModel[125] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box142
		bodyModel[126] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box143
		bodyModel[127] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box144
		bodyModel[128] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box145
		bodyModel[129] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box146
		bodyModel[130] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box147
		bodyModel[131] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box148
		bodyModel[132] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box149
		bodyModel[133] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box150
		bodyModel[134] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box151
		bodyModel[135] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box152
		bodyModel[136] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box153
		bodyModel[137] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box154
		bodyModel[138] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box155
		bodyModel[139] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box156
		bodyModel[140] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box157
		bodyModel[141] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box158
		bodyModel[142] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box159
		bodyModel[143] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box160
		bodyModel[144] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box161
		bodyModel[145] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box162
		bodyModel[146] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box163
		bodyModel[147] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box164
		bodyModel[148] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box165
		bodyModel[149] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box166
		bodyModel[150] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box167
		bodyModel[151] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box168
		bodyModel[152] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box169
		bodyModel[153] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box170
		bodyModel[154] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box171
		bodyModel[155] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box172
		bodyModel[156] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box173
		bodyModel[157] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box174
		bodyModel[158] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box175
		bodyModel[159] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box176
		bodyModel[160] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box177
		bodyModel[161] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box178
		bodyModel[162] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box179
		bodyModel[163] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box180
		bodyModel[164] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box181
		bodyModel[165] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box182
		bodyModel[166] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box183
		bodyModel[167] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box184
		bodyModel[168] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box185
		bodyModel[169] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box186
		bodyModel[170] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box187
		bodyModel[171] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box188
		bodyModel[172] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box189
		bodyModel[173] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box190
		bodyModel[174] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box191
		bodyModel[175] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box192
		bodyModel[176] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box193
		bodyModel[177] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box194
		bodyModel[178] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box195
		bodyModel[179] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box196
		bodyModel[180] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box197
		bodyModel[181] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box198
		bodyModel[182] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box199
		bodyModel[183] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box200
		bodyModel[184] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box201
		bodyModel[185] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box202
		bodyModel[186] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box203
		bodyModel[187] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box204
		bodyModel[188] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box205
		bodyModel[189] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box206
		bodyModel[190] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box207
		bodyModel[191] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box208
		bodyModel[192] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box209
		bodyModel[193] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box210
		bodyModel[194] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Box211

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 4, 24, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box0
		bodyModel[0].setRotationPoint(-75F, -11F, -12F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 29, 24, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-27F, -36F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 30, 4, 0F, 0F, -15F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[2].setRotationPoint(-51F, -41F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import Box3
		bodyModel[3].setRotationPoint(-75F, -26F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 27, 3, 2, 0F); // Import Box4
		bodyModel[4].setRotationPoint(-54F, -41F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 1F, 3F, 0F, 0.9F, 3F, 0F, 0F, -3F, 0F, 0F); // Import Box5
		bodyModel[5].setRotationPoint(-54F, -38F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Import Box6
		bodyModel[6].setRotationPoint(-75F, -41F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 24, 4, 24, 0F); // Import Box12
		bodyModel[7].setRotationPoint(-51F, -11F, -12F);

		bodyModel[8].addBox(0F, 0F, 0F, 27, 3, 2, 0F); // Import Box13
		bodyModel[8].setRotationPoint(-54F, -41F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.9F, -3F, 0F, 1F); // Import Box14
		bodyModel[9].setRotationPoint(-54F, -38F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 1F); // Import Box15
		bodyModel[10].setRotationPoint(-75F, -41F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 15, 4, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box16
		bodyModel[11].setRotationPoint(-75F, -26F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 24, 30, 4, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[12].setRotationPoint(-51F, -41F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Import Box18
		bodyModel[13].setRotationPoint(-54F, -41F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 19, 18, 0F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Import Box19
		bodyModel[14].setRotationPoint(-96F, -26F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 3, 18, 0F, 0F, -8F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -8F, -4F, 0F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -4F); // Import Box20
		bodyModel[15].setRotationPoint(-96F, -29F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 34, 16, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[16].setRotationPoint(-24F, -41F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 18, 26, 24, 0F); // Import Box23
		bodyModel[17].setRotationPoint(-12F, -33F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 6, 18, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[18].setRotationPoint(-20F, -38F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[19].setRotationPoint(-24F, -41F, -12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[20].setRotationPoint(-12F, -41F, -12F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[21].setRotationPoint(0F, -41F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 5, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[22].setRotationPoint(-27F, -41F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 34, 4, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[23].setRotationPoint(-24F, -41F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 34, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[24].setRotationPoint(-24F, -41F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 17, 8, 24, 0F, 0F, 0F, -6F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[25].setRotationPoint(6F, -41F, -12F);

		bodyModel[26].addBox(0F, 0F, 0F, 104, 26, 24, 0F); // Import Box32
		bodyModel[26].setRotationPoint(6F, -33F, -12F);

		bodyModel[27].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import Box0
		bodyModel[27].setRotationPoint(-7F, -33F, -36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box1
		bodyModel[28].setRotationPoint(-7F, -30F, -36F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box2
		bodyModel[29].setRotationPoint(-7F, -30F, -16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import Box3
		bodyModel[30].setRotationPoint(-14F, -32F, -34F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[31].setRotationPoint(18F, -11F, -32F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 87, 10, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[32].setRotationPoint(23F, -43F, -12F);

		bodyModel[33].addBox(0F, 0F, 0F, 110, 26, 24, 0F); // Import Box6
		bodyModel[33].setRotationPoint(23F, -33F, -36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 45, 5, 16, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[34].setRotationPoint(0F, -38F, -33F);

		bodyModel[35].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box8
		bodyModel[35].setRotationPoint(-7F, -37F, -30F);

		bodyModel[36].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import Box9
		bodyModel[36].setRotationPoint(-24F, -36F, -29F);

		bodyModel[37].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import Box10
		bodyModel[37].setRotationPoint(-24F, -36F, -22F);

		bodyModel[38].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box11
		bodyModel[38].setRotationPoint(-7F, -37F, -23F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[39].setRotationPoint(-25F, -26F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[40].setRotationPoint(-17F, -17F, -15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 42, 5, 23, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 4F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import Box14
		bodyModel[41].setRotationPoint(45F, -38F, -33F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 87, 26, 11, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[42].setRotationPoint(23F, -33F, -47F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[43].setRotationPoint(2F, -31F, -39F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[44].setRotationPoint(13F, -17F, -39F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[45].setRotationPoint(1F, -26F, -59F);

		bodyModel[46].addShapeBox(0F, -15F, 0F, 50, 15, 4, 0F, -25F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, -25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[46].setRotationPoint(45F, -27F, -47F);
		bodyModel[46].rotateAngleX = 0.43633231F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box24
		bodyModel[47].setRotationPoint(-7F, -30F, 32F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import Box25
		bodyModel[48].setRotationPoint(-25F, -26F, 12F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import Box26
		bodyModel[49].setRotationPoint(-17F, -17F, 12F);

		bodyModel[50].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import Box27
		bodyModel[50].setRotationPoint(-7F, -33F, 12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import Box28
		bodyModel[51].setRotationPoint(-14F, -32F, 14F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box29
		bodyModel[52].setRotationPoint(-7F, -30F, 12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[53].setRotationPoint(18F, -11F, 16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import Box31
		bodyModel[54].setRotationPoint(13F, -17F, 36F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import Box32
		bodyModel[55].setRotationPoint(2F, -31F, 36F);

		bodyModel[56].addBox(0F, 0F, 0F, 110, 26, 24, 0F); // Import Box33
		bodyModel[56].setRotationPoint(23F, -33F, 12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 45, 5, 16, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[57].setRotationPoint(0F, -38F, 17F);

		bodyModel[58].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box35
		bodyModel[58].setRotationPoint(-7F, -37F, 20F);

		bodyModel[59].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box36
		bodyModel[59].setRotationPoint(-7F, -37F, 27F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 42, 5, 23, 0F, 6F, 4F, 0F, 0F, 4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[60].setRotationPoint(45F, -38F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 87, 26, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Import Box39
		bodyModel[61].setRotationPoint(23F, -33F, 36F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F); // Import Box41
		bodyModel[62].setRotationPoint(1F, -26F, 36F);

		bodyModel[63].addShapeBox(0F, -15F, 0F, 50, 15, 4, 0F, -25F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, -25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[63].setRotationPoint(45F, -27F, 43F);
		bodyModel[63].rotateAngleX = -0.43633231F;

		bodyModel[64].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import Box44
		bodyModel[64].setRotationPoint(-24F, -36F, 28F);

		bodyModel[65].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import Box45
		bodyModel[65].setRotationPoint(-24F, -36F, 21F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[66].setRotationPoint(133F, -33F, -32F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[67].setRotationPoint(133F, -33F, -16F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[68].setRotationPoint(133F, -33F, -36F);

		bodyModel[69].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import Box50
		bodyModel[69].setRotationPoint(133F, -10F, -36F);

		bodyModel[70].addBox(0F, 0F, 0F, 11, 2, 16, 0F); // Import Box51
		bodyModel[70].setRotationPoint(133F, -27F, -32F);

		bodyModel[71].addBox(0F, 0F, 0F, 17, 2, 16, 0F); // Import Box52
		bodyModel[71].setRotationPoint(133F, -22F, -32F);

		bodyModel[72].addBox(0F, 0F, 0F, 22, 2, 16, 0F); // Import Box53
		bodyModel[72].setRotationPoint(133F, -17F, -32F);

		bodyModel[73].addBox(0F, 0F, 0F, 27, 2, 16, 0F); // Import Box54
		bodyModel[73].setRotationPoint(133F, -13F, -32F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[74].setRotationPoint(133F, -33F, 16F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[75].setRotationPoint(133F, -33F, 32F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[76].setRotationPoint(133F, -33F, 12F);

		bodyModel[77].addBox(0F, 0F, 0F, 11, 2, 16, 0F); // Import Box58
		bodyModel[77].setRotationPoint(133F, -27F, 16F);

		bodyModel[78].addBox(0F, 0F, 0F, 17, 2, 16, 0F); // Import Box59
		bodyModel[78].setRotationPoint(133F, -22F, 16F);

		bodyModel[79].addBox(0F, 0F, 0F, 22, 2, 16, 0F); // Import Box60
		bodyModel[79].setRotationPoint(133F, -17F, 16F);

		bodyModel[80].addBox(0F, 0F, 0F, 27, 2, 16, 0F); // Import Box61
		bodyModel[80].setRotationPoint(133F, -13F, 16F);

		bodyModel[81].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import Box62
		bodyModel[81].setRotationPoint(133F, -10F, 12F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 26, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[82].setRotationPoint(111F, -33F, -12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 11, 10, 24, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[83].setRotationPoint(110F, -43F, -12F);

		bodyModel[84].addBox(0F, 0F, 0F, 42, 21, 21, 0F); // Import Box98
		bodyModel[84].setRotationPoint(45F, -54F, -32F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 21, 21, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[85].setRotationPoint(87F, -54F, -32F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 14, 17, 21, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		bodyModel[86].setRotationPoint(101F, -50F, -32F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		bodyModel[87].setRotationPoint(115F, -42F, -32F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		bodyModel[88].setRotationPoint(115F, -42F, -24F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[89].setRotationPoint(115F, -42F, -15F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box104
		bodyModel[90].setRotationPoint(44F, -53F, -30F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box107
		bodyModel[91].setRotationPoint(44F, -53F, -27F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box108
		bodyModel[92].setRotationPoint(44F, -53F, -24F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box109
		bodyModel[93].setRotationPoint(44F, -53F, -21F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box110
		bodyModel[94].setRotationPoint(44F, -53F, -18F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box111
		bodyModel[95].setRotationPoint(44F, -53F, -15F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box113
		bodyModel[96].setRotationPoint(44F, -50F, -30F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box114
		bodyModel[97].setRotationPoint(44F, -50F, -27F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box115
		bodyModel[98].setRotationPoint(44F, -50F, -24F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box116
		bodyModel[99].setRotationPoint(44F, -50F, -21F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box117
		bodyModel[100].setRotationPoint(44F, -50F, -18F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box118
		bodyModel[101].setRotationPoint(44F, -50F, -15F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box119
		bodyModel[102].setRotationPoint(44F, -47F, -30F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box120
		bodyModel[103].setRotationPoint(44F, -47F, -27F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box121
		bodyModel[104].setRotationPoint(44F, -47F, -24F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box122
		bodyModel[105].setRotationPoint(44F, -47F, -21F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box123
		bodyModel[106].setRotationPoint(44F, -47F, -18F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box124
		bodyModel[107].setRotationPoint(44F, -47F, -15F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box125
		bodyModel[108].setRotationPoint(44F, -44F, -30F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box126
		bodyModel[109].setRotationPoint(44F, -44F, -27F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box127
		bodyModel[110].setRotationPoint(44F, -44F, -24F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box128
		bodyModel[111].setRotationPoint(44F, -44F, -21F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box129
		bodyModel[112].setRotationPoint(44F, -44F, -18F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box130
		bodyModel[113].setRotationPoint(44F, -44F, -15F);

		bodyModel[114].addBox(0F, 0F, 0F, 42, 21, 21, 0F); // Import Box131
		bodyModel[114].setRotationPoint(45F, -54F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 14, 21, 21, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[115].setRotationPoint(87F, -54F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 14, 17, 21, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[116].setRotationPoint(101F, -50F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[117].setRotationPoint(115F, -42F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		bodyModel[118].setRotationPoint(115F, -42F, 20F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[119].setRotationPoint(115F, -42F, 28F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box137
		bodyModel[120].setRotationPoint(44F, -53F, 13F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box138
		bodyModel[121].setRotationPoint(44F, -50F, 13F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box139
		bodyModel[122].setRotationPoint(44F, -47F, 13F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box140
		bodyModel[123].setRotationPoint(44F, -44F, 13F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box141
		bodyModel[124].setRotationPoint(44F, -44F, 16F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box142
		bodyModel[125].setRotationPoint(44F, -47F, 16F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box143
		bodyModel[126].setRotationPoint(44F, -50F, 16F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box144
		bodyModel[127].setRotationPoint(44F, -53F, 16F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box145
		bodyModel[128].setRotationPoint(44F, -53F, 19F);

		bodyModel[129].addBox(0F, 0F, 0F, 42, 21, 21, 0F); // Import Box146
		bodyModel[129].setRotationPoint(45F, -54F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box147
		bodyModel[130].setRotationPoint(44F, -50F, 19F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box148
		bodyModel[131].setRotationPoint(44F, -47F, 19F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box149
		bodyModel[132].setRotationPoint(44F, -44F, 19F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box150
		bodyModel[133].setRotationPoint(44F, -44F, 22F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box151
		bodyModel[134].setRotationPoint(44F, -50F, 22F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box152
		bodyModel[135].setRotationPoint(44F, -47F, 22F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box153
		bodyModel[136].setRotationPoint(44F, -53F, 22F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box154
		bodyModel[137].setRotationPoint(44F, -53F, 25F);

		bodyModel[138].addBox(0F, 0F, 0F, 42, 21, 21, 0F); // Import Box155
		bodyModel[138].setRotationPoint(45F, -54F, 11F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box156
		bodyModel[139].setRotationPoint(44F, -50F, 28F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box157
		bodyModel[140].setRotationPoint(44F, -53F, 28F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box158
		bodyModel[141].setRotationPoint(44F, -50F, 25F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box159
		bodyModel[142].setRotationPoint(44F, -47F, 25F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box160
		bodyModel[143].setRotationPoint(44F, -47F, 28F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box161
		bodyModel[144].setRotationPoint(44F, -44F, 28F);

		bodyModel[145].addBox(0F, 0F, 0F, 42, 21, 21, 0F); // Import Box162
		bodyModel[145].setRotationPoint(45F, -54F, 11F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box163
		bodyModel[146].setRotationPoint(44F, -44F, 25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box164
		bodyModel[147].setRotationPoint(43F, -53F, -15F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box165
		bodyModel[148].setRotationPoint(43F, -53F, -18F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box166
		bodyModel[149].setRotationPoint(43F, -53F, -21F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box167
		bodyModel[150].setRotationPoint(43F, -53F, -24F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box168
		bodyModel[151].setRotationPoint(43F, -53F, -27F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box169
		bodyModel[152].setRotationPoint(43F, -53F, -30F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box170
		bodyModel[153].setRotationPoint(43F, -50F, -30F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box171
		bodyModel[154].setRotationPoint(43F, -50F, -27F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box172
		bodyModel[155].setRotationPoint(43F, -50F, -24F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box173
		bodyModel[156].setRotationPoint(43F, -50F, -21F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box174
		bodyModel[157].setRotationPoint(43F, -50F, -18F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box175
		bodyModel[158].setRotationPoint(43F, -50F, -15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box176
		bodyModel[159].setRotationPoint(43F, -47F, -30F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box177
		bodyModel[160].setRotationPoint(43F, -47F, -27F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box178
		bodyModel[161].setRotationPoint(43F, -47F, -24F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box179
		bodyModel[162].setRotationPoint(43F, -47F, -21F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box180
		bodyModel[163].setRotationPoint(43F, -47F, -18F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box181
		bodyModel[164].setRotationPoint(43F, -47F, -15F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box182
		bodyModel[165].setRotationPoint(43F, -44F, -30F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box183
		bodyModel[166].setRotationPoint(43F, -44F, -27F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box184
		bodyModel[167].setRotationPoint(43F, -44F, -24F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box185
		bodyModel[168].setRotationPoint(43F, -44F, -21F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box186
		bodyModel[169].setRotationPoint(43F, -44F, -18F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box187
		bodyModel[170].setRotationPoint(43F, -44F, -15F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box188
		bodyModel[171].setRotationPoint(43F, -44F, 28F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box189
		bodyModel[172].setRotationPoint(43F, -44F, 25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box190
		bodyModel[173].setRotationPoint(43F, -44F, 22F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box191
		bodyModel[174].setRotationPoint(43F, -44F, 19F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box192
		bodyModel[175].setRotationPoint(43F, -44F, 16F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box193
		bodyModel[176].setRotationPoint(43F, -44F, 13F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box194
		bodyModel[177].setRotationPoint(43F, -47F, 28F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box195
		bodyModel[178].setRotationPoint(43F, -47F, 25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box196
		bodyModel[179].setRotationPoint(43F, -47F, 22F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box197
		bodyModel[180].setRotationPoint(43F, -47F, 19F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box198
		bodyModel[181].setRotationPoint(43F, -47F, 16F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box199
		bodyModel[182].setRotationPoint(43F, -47F, 13F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box200
		bodyModel[183].setRotationPoint(43F, -50F, 13F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box201
		bodyModel[184].setRotationPoint(43F, -50F, 16F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box202
		bodyModel[185].setRotationPoint(43F, -50F, 19F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box203
		bodyModel[186].setRotationPoint(43F, -50F, 22F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box204
		bodyModel[187].setRotationPoint(43F, -50F, 25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box205
		bodyModel[188].setRotationPoint(43F, -50F, 28F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box206
		bodyModel[189].setRotationPoint(43F, -53F, 28F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box207
		bodyModel[190].setRotationPoint(43F, -53F, 25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box208
		bodyModel[191].setRotationPoint(43F, -53F, 22F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box209
		bodyModel[192].setRotationPoint(43F, -53F, 19F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box210
		bodyModel[193].setRotationPoint(43F, -53F, 16F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box211
		bodyModel[194].setRotationPoint(43F, -53F, 13F);


		noseModel = new ModelRendererTurbo[8];
		noseModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box0
		noseModel[1] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box1
		noseModel[2] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import Box2
		noseModel[3] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box3
		noseModel[4] = new ModelRendererTurbo(this, 400, 140, textureX, textureY); // Import Box4
		noseModel[5] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Import Box5
		noseModel[6] = new ModelRendererTurbo(this, 400, 210, textureX, textureY); // Import Box7
		noseModel[7] = new ModelRendererTurbo(this, 400, 210, textureX, textureY); // Import Box8

		noseModel[0].addShapeBox(0F, 0F, 0F, 6, 29, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		noseModel[0].setRotationPoint(-33F, -36F, -7F);

		noseModel[1].addBox(0F, 0F, 0F, 4, 6, 8, 0F); // Import Box1
		noseModel[1].setRotationPoint(-34F, -38F, -4F);

		noseModel[2].addBox(0F, 0F, 0F, 14, 4, 14, 0F); // Import Box2
		noseModel[2].setRotationPoint(-46F, -15F, -7F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 17, 11, 16, 0F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box3
		noseModel[3].setRotationPoint(-75F, -23F, -8F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Import Box4
		noseModel[4].setRotationPoint(-75F, -28F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		noseModel[5].setRotationPoint(-58F, -19F, -2F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		noseModel[6].setRotationPoint(-58F, -19F, 2F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		noseModel[7].setRotationPoint(-58F, -19F, -8F);


		tailModel = new ModelRendererTurbo[9];
		tailModel[0] = new ModelRendererTurbo(this, 0, 1860, textureX, textureY); // Import Box65
		tailModel[1] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Import Box66
		tailModel[2] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Import Box67
		tailModel[3] = new ModelRendererTurbo(this, 0, 1940, textureX, textureY); // Import Box68
		tailModel[4] = new ModelRendererTurbo(this, 0, 1990, textureX, textureY); // Import Box69
		tailModel[5] = new ModelRendererTurbo(this, 0, 1990, textureX, textureY); // Import Box70
		tailModel[6] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box71
		tailModel[7] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Import Box73
		tailModel[8] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import Box74

		tailModel[0].addBox(0F, 0F, 0F, 60, 18, 16, 0F); // Import Box65
		tailModel[0].setRotationPoint(121F, -41F, -8F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 60, 18, 4, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		tailModel[1].setRotationPoint(121F, -41F, -12F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 60, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box67
		tailModel[2].setRotationPoint(121F, -41F, 8F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 10, 18, 16, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box68
		tailModel[3].setRotationPoint(181F, -41F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 10, 18, 4, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Import Box69
		tailModel[4].setRotationPoint(181F, -41F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 10, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, -4F, 0F, -4F, 0F); // Import Box70
		tailModel[5].setRotationPoint(181F, -41F, 8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 48, 4, 38, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -6F, -1F, 0F, -24F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -24F, -1F, 0F); // Import Box71
		tailModel[6].setRotationPoint(143F, -65F, 2F);
		tailModel[6].rotateAngleX = -0.26179939F;

		tailModel[7].addShapeBox(0F, 0F, -38F, 48, 4, 38, 0F, -24F, -1F, 0F, -6F, -1F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, -24F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		tailModel[7].setRotationPoint(143F, -65F, -2F);
		tailModel[7].rotateAngleX = 0.26179939F;

		tailModel[8].addShapeBox(0F, 0F, 2F, 59, 4, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F); // Import Box74
		tailModel[8].setRotationPoint(132F, -39F, -2F);
		tailModel[8].rotateAngleX = 1.57079633F;


		leftWingModel = new ModelRendererTurbo[2];
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 1360, textureX, textureY); // Import Box19
		leftWingModel[1] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import Box20

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 87, 13, 11, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box19
		leftWingModel[0].setRotationPoint(23F, -27F, -58F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 72, 13, 70, 0F, 25F, -26F, 0F, -75F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 16F, 0F, -75F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		leftWingModel[1].setRotationPoint(23F, -27F, -128F);


		rightWingModel = new ModelRendererTurbo[2];
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 1360, textureX, textureY); // Import Box40
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import Box43

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 87, 13, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		rightWingModel[0].setRotationPoint(23F, -27F, 47F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 72, 13, 70, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -75F, -26F, 0F, 25F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -75F, 16F, 0F, 25F, 16F, 0F); // Import Box43
		rightWingModel[1].setRotationPoint(23F, -27F, 58F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import Box6

		yawFlapModel[0].addBox(0F, 0F, -1F, 2, 7, 2, 0F); // Import Box6
		yawFlapModel[0].setRotationPoint(-55F, -19F, 0F);
		yawFlapModel[0].rotateAngleZ = 3.14159265F;


		bodyWheelModel = new ModelRendererTurbo[12];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import Box75
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import Box76
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box77
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box78
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import Box79
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box80
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box81
		bodyWheelModel[7] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Import Box82
		bodyWheelModel[8] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box83
		bodyWheelModel[9] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import Box88
		bodyWheelModel[10] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box89
		bodyWheelModel[11] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box90

		bodyWheelModel[0].addBox(0F, 0F, 0F, 10, 7, 4, 0F); // Import Box75
		bodyWheelModel[0].setRotationPoint(-55F, -7F, -2F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 10, 7, 4, 0F); // Import Box76
		bodyWheelModel[1].setRotationPoint(-37F, -7F, -2F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Import Box77
		bodyWheelModel[2].setRotationPoint(-35F, 0F, -1.5F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Import Box78
		bodyWheelModel[3].setRotationPoint(-53F, 0F, -1.5F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 29, 3, 11, 0F); // Import Box79
		bodyWheelModel[4].setRotationPoint(-55F, 7F, -5.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Import Box80
		bodyWheelModel[5].setRotationPoint(-61F, 7F, -5.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import Box81
		bodyWheelModel[6].setRotationPoint(-26F, 7F, -5.5F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Import Box82
		bodyWheelModel[7].setRotationPoint(-44F, -7F, -1F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box83
		bodyWheelModel[8].setRotationPoint(-43.5F, 2F, -0.5F);

		bodyWheelModel[9].addBox(0F, 0F, 0F, 29, 3, 11, 0F); // Import Box88
		bodyWheelModel[9].setRotationPoint(35F, 7F, -83.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import Box89
		bodyWheelModel[10].setRotationPoint(64F, 7F, -83.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Import Box90
		bodyWheelModel[11].setRotationPoint(29F, 7F, -83.5F);


		leftWingWheelModel = new ModelRendererTurbo[4];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import Box84
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import Box85
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box86
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box87

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import Box84
		leftWingWheelModel[0].setRotationPoint(54F, -10F, -82F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import Box85
		leftWingWheelModel[1].setRotationPoint(36F, -10F, -82F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import Box86
		leftWingWheelModel[2].setRotationPoint(56F, 1F, -81F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import Box87
		leftWingWheelModel[3].setRotationPoint(38F, 1F, -81F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import Box91
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import Box92
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box93
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import Box94
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import Box95
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box96
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import Box97

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import Box91
		rightWingWheelModel[0].setRotationPoint(54F, -10F, 76F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import Box92
		rightWingWheelModel[1].setRotationPoint(36F, -10F, 76F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import Box93
		rightWingWheelModel[2].setRotationPoint(38F, 1F, 77F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import Box94
		rightWingWheelModel[3].setRotationPoint(56F, 1F, 77F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 29, 3, 11, 0F); // Import Box95
		rightWingWheelModel[4].setRotationPoint(35F, 7F, 72.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import Box96
		rightWingWheelModel[5].setRotationPoint(64F, 7F, 72.5F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Import Box97
		rightWingWheelModel[6].setRotationPoint(29F, 7F, 72.5F);


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Import Box9

		hudModel[0].addShapeBox(0F, -4F, -4F, 0, 80, 80, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -72F, 0F, 0F, -72F, 0F, -72F, 0F, 0F, -72F, 0F, 0F, -72F, -72F, 0F, -72F, -72F); // Import Box9
		hudModel[0].setRotationPoint(-57F, -32F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
