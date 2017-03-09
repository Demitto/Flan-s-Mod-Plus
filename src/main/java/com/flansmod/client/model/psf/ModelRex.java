//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRex extends ModelMecha
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelRex()	
	{


// Head
		headModel = new ModelRendererTurbo[195];
		headModel[0] = new ModelRendererTurbo(this,  0,  84, textureX, textureY); // Head1
		headModel[1] = new ModelRendererTurbo(this,  0,  156, textureX, textureY); // Head2
		headModel[2] = new ModelRendererTurbo(this,  0,  156, textureX, textureY); // Head3
		headModel[3] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // Head4
		headModel[4] = new ModelRendererTurbo(this,  16,  300, textureX, textureY); // Head5
		headModel[5] = new ModelRendererTurbo(this,  20,  340, textureX, textureY); // Head6
		headModel[6] = new ModelRendererTurbo(this,  20,  340, textureX, textureY); // Head7
		headModel[7] = new ModelRendererTurbo(this,  20,  338, textureX, textureY); // Head9
		headModel[8] = new ModelRendererTurbo(this,  20,  410, textureX, textureY); // Head10
		headModel[9] = new ModelRendererTurbo(this,  20,  450, textureX, textureY); // Head11
		headModel[10] = new ModelRendererTurbo(this,  20,  461, textureX, textureY); // Head12
		headModel[11] = new ModelRendererTurbo(this,  20,  470, textureX, textureY); // Head13
		headModel[12] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head14
		headModel[13] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head15
		headModel[14] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head16
		headModel[15] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head17
		headModel[16] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head18
		headModel[17] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // Head19
		headModel[18] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // Head20
		headModel[19] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Head21
		headModel[20] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Head22
		headModel[21] = new ModelRendererTurbo(this,  20,  410, textureX, textureY); // Head24
		headModel[22] = new ModelRendererTurbo(this,  20,  450, textureX, textureY); // Head25
		headModel[23] = new ModelRendererTurbo(this,  20,  470, textureX, textureY); // Head26
		headModel[24] = new ModelRendererTurbo(this,  20,  461, textureX, textureY); // Head27
		headModel[25] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head28
		headModel[26] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head29
		headModel[27] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head30
		headModel[28] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head31
		headModel[29] = new ModelRendererTurbo(this,  20,  480, textureX, textureY); // Head32
		headModel[30] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // Head33
		headModel[31] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // Head34
		headModel[32] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // Head35
		headModel[33] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // Head36
		headModel[34] = new ModelRendererTurbo(this,  0,  595, textureX, textureY); // Head37
		headModel[35] = new ModelRendererTurbo(this,  0,  660, textureX, textureY); // Head38
		headModel[36] = new ModelRendererTurbo(this,  0,  660, textureX, textureY); // Head39
		headModel[37] = new ModelRendererTurbo(this,  0,  690, textureX, textureY); // Head40SEAT
		headModel[38] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // Head41
		headModel[39] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // Head42
		headModel[40] = new ModelRendererTurbo(this,  0,  820, textureX, textureY); // Head43
		headModel[41] = new ModelRendererTurbo(this,  0,  860, textureX, textureY); // Head44
		headModel[42] = new ModelRendererTurbo(this,  0,  880, textureX, textureY); // Head45
		headModel[43] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // Head46
		headModel[44] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Head47
		headModel[45] = new ModelRendererTurbo(this,  200,  38, textureX, textureY); // Head48
		headModel[46] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Head49
		headModel[47] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // Head50
		headModel[48] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // Head51
		headModel[49] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Head52
		headModel[50] = new ModelRendererTurbo(this,  200,  240, textureX, textureY); // Head53
		headModel[51] = new ModelRendererTurbo(this,  20,  470, textureX, textureY); // Head54
		headModel[52] = new ModelRendererTurbo(this,  20,  470, textureX, textureY); // Head55
		headModel[53] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); // Head56
		headModel[54] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); // Head57
		headModel[55] = new ModelRendererTurbo(this,  200,  290, textureX, textureY); // Head58
		headModel[56] = new ModelRendererTurbo(this,  200,  290, textureX, textureY); // Head59
		headModel[57] = new ModelRendererTurbo(this,  80,  660, textureX, textureY); // Head60
		headModel[58] = new ModelRendererTurbo(this,  800,  660, textureX, textureY); // Head61
		headModel[59] = new ModelRendererTurbo(this,  800,  600, textureX, textureY); // Head62
		headModel[60] = new ModelRendererTurbo(this,  945,  600, textureX, textureY); // Head63
		headModel[61] = new ModelRendererTurbo(this,  200,  350, textureX, textureY); // Head64-
		headModel[62] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // Head65
		headModel[63] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // Head66
		headModel[64] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Head67
		headModel[65] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // Head68
		headModel[66] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Head69
		headModel[67] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // Head70
		headModel[68] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // Head71
		headModel[69] = new ModelRendererTurbo(this,  200,  445, textureX, textureY); // Head72
		headModel[70] = new ModelRendererTurbo(this,  200,  510, textureX, textureY); // Head73-
		headModel[71] = new ModelRendererTurbo(this,  200,  530, textureX, textureY); // Head74
		headModel[72] = new ModelRendererTurbo(this,  200,  510, textureX, textureY); // Head75
		headModel[73] = new ModelRendererTurbo(this,  200,  530, textureX, textureY); // Head76
		headModel[74] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // Head77
		headModel[75] = new ModelRendererTurbo(this,  200,  626, textureX, textureY); // Head78
		headModel[76] = new ModelRendererTurbo(this,  200,  680, textureX, textureY); // Head79
		headModel[77] = new ModelRendererTurbo(this,  200,  745, textureX, textureY); // Head80
		headModel[78] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head81
		headModel[79] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head82
		headModel[80] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head83
		headModel[81] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head84
		headModel[82] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head85
		headModel[83] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head86
		headModel[84] = new ModelRendererTurbo(this,  200,  820, textureX, textureY); // Head87
		headModel[85] = new ModelRendererTurbo(this,  200,  820, textureX, textureY); // Head88
		headModel[86] = new ModelRendererTurbo(this,  200,  830, textureX, textureY); // Head89
		headModel[87] = new ModelRendererTurbo(this,  200,  850, textureX, textureY); // Head90
		headModel[88] = new ModelRendererTurbo(this,  200,  850, textureX, textureY); // Head91
		headModel[89] = new ModelRendererTurbo(this,  200,  850, textureX, textureY); // Head92
		headModel[90] = new ModelRendererTurbo(this,  200,  870, textureX, textureY); // Head94
		headModel[91] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // Head95
		headModel[92] = new ModelRendererTurbo(this,  200,  970, textureX, textureY); // Head96
		headModel[93] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // Head97
		headModel[94] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // Head98
		headModel[95] = new ModelRendererTurbo(this,  400,  230, textureX, textureY); // Head99
		headModel[96] = new ModelRendererTurbo(this,  400,  270, textureX, textureY); // Head100
		headModel[97] = new ModelRendererTurbo(this,  400,  295, textureX, textureY); // Head101
		headModel[98] = new ModelRendererTurbo(this,  400,  330, textureX, textureY); // Head102
		headModel[99] = new ModelRendererTurbo(this,  400,  50, textureX, textureY); // Head103
		headModel[100] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // Head104
		headModel[101] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head105
		headModel[102] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head106
		headModel[103] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head107
		headModel[104] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head108
		headModel[105] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head109
		headModel[106] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head110
		headModel[107] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head111
		headModel[108] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head112
		headModel[109] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head113
		headModel[110] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head114
		headModel[111] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head115
		headModel[112] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head116
		headModel[113] = new ModelRendererTurbo(this,  420,  630, textureX, textureY); // Head117
		headModel[114] = new ModelRendererTurbo(this,  420,  630, textureX, textureY); // Head118
		headModel[115] = new ModelRendererTurbo(this,  420,  645, textureX, textureY); // Head119
		headModel[116] = new ModelRendererTurbo(this,  450,  620, textureX, textureY); // Head120
		headModel[117] = new ModelRendererTurbo(this,  460,  660, textureX, textureY); // Head121
		headModel[118] = new ModelRendererTurbo(this,  460,  680, textureX, textureY); // Head122
		headModel[119] = new ModelRendererTurbo(this,  460,  700, textureX, textureY); // Head123
		headModel[120] = new ModelRendererTurbo(this,  460,  750, textureX, textureY); // Head124
		headModel[121] = new ModelRendererTurbo(this,  460,  770, textureX, textureY); // Head125
		headModel[122] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head126
		headModel[123] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head127
		headModel[124] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head128
		headModel[125] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head129
		headModel[126] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head130
		headModel[127] = new ModelRendererTurbo(this,  200,  810, textureX, textureY); // Head131
		headModel[128] = new ModelRendererTurbo(this,  200,  820, textureX, textureY); // Head132
		headModel[129] = new ModelRendererTurbo(this,  200,  820, textureX, textureY); // Head133
		headModel[130] = new ModelRendererTurbo(this,  200,  830, textureX, textureY); // Head134
		headModel[131] = new ModelRendererTurbo(this,  200,  850, textureX, textureY); // Head135
		headModel[132] = new ModelRendererTurbo(this,  200,  850, textureX, textureY); // Head136
		headModel[133] = new ModelRendererTurbo(this,  200,  850, textureX, textureY); // Head137
		headModel[134] = new ModelRendererTurbo(this,  200,  870, textureX, textureY); // Head138
		headModel[135] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // Head139
		headModel[136] = new ModelRendererTurbo(this,  200,  970, textureX, textureY); // Head140
		headModel[137] = new ModelRendererTurbo(this,  400,  150, textureX, textureY); // Head141
		headModel[138] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // Head142
		headModel[139] = new ModelRendererTurbo(this,  400,  230, textureX, textureY); // Head143
		headModel[140] = new ModelRendererTurbo(this,  400,  270, textureX, textureY); // Head145
		headModel[141] = new ModelRendererTurbo(this,  400,  295, textureX, textureY); // Head146
		headModel[142] = new ModelRendererTurbo(this,  400,  330, textureX, textureY); // Head147
		headModel[143] = new ModelRendererTurbo(this,  400,  50, textureX, textureY); // Head148
		headModel[144] = new ModelRendererTurbo(this,  400,  360, textureX, textureY); // Head149
		headModel[145] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head150
		headModel[146] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head151
		headModel[147] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head152
		headModel[148] = new ModelRendererTurbo(this,  400,  410, textureX, textureY); // Head153
		headModel[149] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head154
		headModel[150] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head155
		headModel[151] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head156
		headModel[152] = new ModelRendererTurbo(this,  290,  350, textureX, textureY); // Head157
		headModel[153] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head158
		headModel[154] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head159
		headModel[155] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head160
		headModel[156] = new ModelRendererTurbo(this,  290,  380, textureX, textureY); // Head161
		headModel[157] = new ModelRendererTurbo(this,  420,  630, textureX, textureY); // Head162
		headModel[158] = new ModelRendererTurbo(this,  420,  630, textureX, textureY); // Head163
		headModel[159] = new ModelRendererTurbo(this,  420,  645, textureX, textureY); // Head164
		headModel[160] = new ModelRendererTurbo(this,  450,  620, textureX, textureY); // Head165
		headModel[161] = new ModelRendererTurbo(this,  460,  660, textureX, textureY); // Head166
		headModel[162] = new ModelRendererTurbo(this,  460,  680, textureX, textureY); // Head167
		headModel[163] = new ModelRendererTurbo(this,  460,  700, textureX, textureY); // Head168
		headModel[164] = new ModelRendererTurbo(this,  460,  750, textureX, textureY); // Head169
		headModel[165] = new ModelRendererTurbo(this,  460,  770, textureX, textureY); // Head170--
		headModel[166] = new ModelRendererTurbo(this,  460,  813, textureX, textureY); // Head171
		headModel[167] = new ModelRendererTurbo(this,  460,  860, textureX, textureY); // Head172
		headModel[168] = new ModelRendererTurbo(this,  460,  900, textureX, textureY); // Head173
		headModel[169] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // Head174
		headModel[170] = new ModelRendererTurbo(this,  500,  150, textureX, textureY); // Head175
		headModel[171] = new ModelRendererTurbo(this,  500,  250, textureX, textureY); // Head176
		headModel[172] = new ModelRendererTurbo(this,  600,  150, textureX, textureY); // Head177
		headModel[173] = new ModelRendererTurbo(this,  600,  250, textureX, textureY); // Head178
		headModel[174] = new ModelRendererTurbo(this,  588,  270, textureX, textureY); // Head179
		headModel[175] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head180
		headModel[176] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head181
		headModel[177] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head182
		headModel[178] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head183
		headModel[179] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head184
		headModel[180] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head185
		headModel[181] = new ModelRendererTurbo(this,  500,  250, textureX, textureY); // Head186
		headModel[182] = new ModelRendererTurbo(this,  600,  150, textureX, textureY); // Head187
		headModel[183] = new ModelRendererTurbo(this,  600,  250, textureX, textureY); // Head189
		headModel[184] = new ModelRendererTurbo(this,  588,  270, textureX, textureY); // Head190
		headModel[185] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head191
		headModel[186] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head192
		headModel[187] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head193
		headModel[188] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head194
		headModel[189] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head195
		headModel[190] = new ModelRendererTurbo(this,  400,  820, textureX, textureY); // Head196
		headModel[191] = new ModelRendererTurbo(this,  600,  330, textureX, textureY); // Head197
		headModel[192] = new ModelRendererTurbo(this,  600,  385, textureX, textureY); // Head198
		headModel[193] = new ModelRendererTurbo(this,  572,  300, textureX, textureY); // Head199
		headModel[194] = new ModelRendererTurbo(this,  572,  300, textureX, textureY); // Head200

		headModel[0].addBox(0F, 0F, 0F, 62, 21, 40, 0F); // Head1
		headModel[0].setRotationPoint(31F, -182F, -20F);

		headModel[1].addBox(0F, 0F, 0F, 62, 8, 4, 0F); // Head2
		headModel[1].setRotationPoint(31F, -190F, -20F);

		headModel[2].addBox(0F, 0F, 0F, 62, 8, 4, 0F); // Head3
		headModel[2].setRotationPoint(31F, -190F, 16F);

		headModel[3].addBox(0F, 0F, 0F, 4, 8, 32, 0F); // Head4
		headModel[3].setRotationPoint(85F, -190F, -16F);

		headModel[4].addBox(0F, 0F, 0F, 4, 4, 32, 0F); // Head5
		headModel[4].setRotationPoint(89F, -186F, -16F);

		headModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); //Test
		headModel[5].setRotationPoint(89F, -190F, -16F);

		headModel[6].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[6].setRotationPoint(89F, -190F, 8F);

		headModel[7].addShapeBox(0F, 0F, 0F, 28, 21, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); //Test
		headModel[7].setRotationPoint(3F, -182F, -20F);

		headModel[8].addBox(-62F, 3F, 0F, 62, 26, 4, 0F); // Head10
		headModel[8].setRotationPoint(92F, -190F, 15.9F);
		headModel[8].rotateAngleZ = -0.296706F;

		headModel[9].addBox(-20F, 0F, 0F, 20, 3, 4, 0F); // Head11
		headModel[9].setRotationPoint(92F, -190F, 15.9F);
		headModel[9].rotateAngleZ = -0.296706F;

		headModel[10].addBox(-52F, 0F, 0F, 32, 3, 2, 0F); // Head12
		headModel[10].setRotationPoint(92F, -190F, 15.9F);
		headModel[10].rotateAngleZ = -0.296706F;

		headModel[11].addShapeBox(-62F, 0F, 0F, 10, 3, 4, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[11].setRotationPoint(92F, -190F, 15.9F);
		headModel[11].rotateAngleZ = -0.296706F;

		headModel[12].addBox(-48F, 0F, 2F, 2, 3, 1, 0F); // Head14
		headModel[12].setRotationPoint(92F, -190F, 15.9F);
		headModel[12].rotateAngleZ = -0.296706F;

		headModel[13].addBox(-42F, 0F, 2F, 2, 3, 1, 0F); // Head15
		headModel[13].setRotationPoint(92F, -190F, 15.9F);
		headModel[13].rotateAngleZ = -0.296706F;

		headModel[14].addBox(-36F, 0F, 2F, 2, 3, 1, 0F); // Head16
		headModel[14].setRotationPoint(92F, -190F, 15.9F);
		headModel[14].rotateAngleZ = -0.296706F;

		headModel[15].addBox(-30F, 0F, 2F, 2, 3, 1, 0F); // Head17
		headModel[15].setRotationPoint(92F, -190F, 15.9F);
		headModel[15].rotateAngleZ = -0.296706F;

		headModel[16].addBox(-24F, 0F, 2F, 2, 3, 1, 0F); // Head18
		headModel[16].setRotationPoint(92F, -190F, 15.9F);
		headModel[16].rotateAngleZ = -0.296706F;

		headModel[17].addBox(0F, 0F, 0F, 22, 10, 1, 0F); // Head19
		headModel[17].setRotationPoint(71.5F, -182F, 19.5F);

		headModel[18].addBox(0F, 0F, 0F, 11, 10, 1, 0F); // Head20
		headModel[18].setRotationPoint(60.5F, -182F, 19.5F);

		headModel[19].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F); //Test
		headModel[19].setRotationPoint(60.5F, -172F, 19.5F);

		headModel[20].addBox(-62F, 11F, 0F, 10, 18, 4, 0F); // Head22
		headModel[20].setRotationPoint(106F, -190F, 16.3F);
		headModel[20].rotateAngleZ = -0.296706F;

		headModel[21].addBox(-62F, 3F, 0F, 62, 26, 4, 0F); // Head24
		headModel[21].setRotationPoint(92F, -190F, -19.9F);
		headModel[21].rotateAngleZ = -0.296706F;

		headModel[22].addBox(-20F, 0F, 0F, 20, 3, 4, 0F); // Head25
		headModel[22].setRotationPoint(92F, -190F, -19.9F);
		headModel[22].rotateAngleZ = -0.296706F;

		headModel[23].addShapeBox(-62F, 0F, 0F, 10, 3, 4, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[23].setRotationPoint(92F, -190F, -19.9F);
		headModel[23].rotateAngleZ = -0.296706F;

		headModel[24].addBox(-52F, 0F, 0F, 32, 3, 2, 0F); // Head27
		headModel[24].setRotationPoint(92F, -190F, -17.9F);
		headModel[24].rotateAngleZ = -0.296706F;

		headModel[25].addBox(-48F, 0F, 2F, 2, 3, 1, 0F); // Head28
		headModel[25].setRotationPoint(92F, -190F, -20.9F);
		headModel[25].rotateAngleZ = -0.296706F;

		headModel[26].addBox(-42F, 0F, 2F, 2, 3, 1, 0F); // Head29
		headModel[26].setRotationPoint(92F, -190F, -20.9F);
		headModel[26].rotateAngleZ = -0.296706F;

		headModel[27].addBox(-36F, 0F, 2F, 2, 3, 1, 0F); // Head30
		headModel[27].setRotationPoint(92F, -190F, -20.9F);
		headModel[27].rotateAngleZ = -0.296706F;

		headModel[28].addBox(-30F, 0F, 2F, 2, 3, 1, 0F); // Head31
		headModel[28].setRotationPoint(92F, -190F, -20.9F);
		headModel[28].rotateAngleZ = -0.296706F;

		headModel[29].addBox(-24F, 0F, 2F, 2, 3, 1, 0F); // Head32
		headModel[29].setRotationPoint(92F, -190F, -20.9F);
		headModel[29].rotateAngleZ = -0.296706F;

		headModel[30].addBox(0F, 0F, 0F, 22, 10, 1, 0F); // Head33
		headModel[30].setRotationPoint(71.5F, -182F, -20.5F);

		headModel[31].addBox(0F, 0F, 0F, 11, 10, 1, 0F); // Head34
		headModel[31].setRotationPoint(60.5F, -182F, -20.5F);

		headModel[32].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F); //Test
		headModel[32].setRotationPoint(60.5F, -172F, -20.5F);

		headModel[33].addBox(-62F, 11F, 0F, 10, 18, 4, 0F); // Head36
		headModel[33].setRotationPoint(106F, -190F, -20.3F);
		headModel[33].rotateAngleZ = -0.296706F;

		headModel[34].addBox(0F, 0F, 0F, 26, 33, 28, 0F); // Head37
		headModel[34].setRotationPoint(49F, -211F, -14F);
		headModel[34].rotateAngleZ = -0.296706F;

		headModel[35].addBox(0F, 0F, 0F, 26, 13, 10, 0F); // Head38
		headModel[35].setRotationPoint(49F, -195F, -15F);

		headModel[36].addBox(0F, 0F, 0F, 26, 13, 10, 0F); // Head39
		headModel[36].setRotationPoint(49F, -195F, 5F);

		headModel[37].addBox(0F, 0F, 0F, 16, 10, 16, 0F); // Head40SEAT
		headModel[37].setRotationPoint(9F, -192F, -8F);

		headModel[38].addBox(0F, 0F, 0F, 6, 34, 16, 0F); // Head41
		headModel[38].setRotationPoint(3F, -216F, -8F);

		headModel[39].addBox(4F, 0F, 0F, 22, 10, 10, 0F); // Head42
		headModel[39].setRotationPoint(32F, -208F, -5F);
		headModel[39].rotateAngleZ = -0.08726646F;

		headModel[40].addBox(7F, -1F, -1F, 4, 25, 12, 0F); // Head43
		headModel[40].setRotationPoint(32F, -208F, -5F);
		headModel[40].rotateAngleZ = -0.08726646F;

		headModel[41].addBox(7F, -1F, -1F, 12, 4, 4, 0F); // Head44
		headModel[41].setRotationPoint(25F, -193F, -11F);
		headModel[41].rotateAngleZ = -0.08726646F;

		headModel[42].addBox(8F, -5F, 0F, 2, 4, 2, 0F); // Head45
		headModel[42].setRotationPoint(25F, -193F, -11F);
		headModel[42].rotateAngleZ = -0.08726646F;

		headModel[43].addBox(3F, -1F, 0.5F, 16, 36, 29, 0F); // Head46
		headModel[43].setRotationPoint(49F, -211F, -14F);
		headModel[43].rotateAngleZ = -0.296706F;

		headModel[44].addBox(-100F, 3F, 0F, 38, 31, 4, 0F); // Head47
		headModel[44].setRotationPoint(92F, -190F, 15.9F);
		headModel[44].rotateAngleZ = -0.296706F;

		headModel[45].addBox(0F, 0F, 0F, 28, 35, 40, 0F); // Head48
		headModel[45].setRotationPoint(-25F, -218F, -20F);

		headModel[46].addBox(-100F, 3F, 0F, 38, 31, 4, 0F); // Head49
		headModel[46].setRotationPoint(92F, -190F, -19.9F);
		headModel[46].rotateAngleZ = -0.296706F;

		headModel[47].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Head50
		headModel[47].setRotationPoint(92.5F, -182F, 10F);

		headModel[48].addBox(0F, 0F, 0F, 1, 17, 5, 0F); // Head51
		headModel[48].setRotationPoint(92.5F, -182F, -15F);

		headModel[49].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Head52
		headModel[49].setRotationPoint(92.5F, -182F, -10F);

		headModel[50].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Head53
		headModel[50].setRotationPoint(92.5F, -174F, -10F);

		headModel[51].addShapeBox(-93F, 0F, 0F, 10, 3, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[51].setRotationPoint(92F, -190F, -19.9F);
		headModel[51].rotateAngleZ = -0.296706F;

		headModel[52].addShapeBox(-93F, 0F, 0F, 10, 3, 4, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[52].setRotationPoint(92F, -190F, 15.9F);
		headModel[52].rotateAngleZ = -0.296706F;

		headModel[53].addBox(0F, 0F, 0F, 52, 1, 8, 0F); // Head56
		headModel[53].setRotationPoint(31F, -161F, -16F);

		headModel[54].addBox(0F, 0F, 0F, 52, 1, 8, 0F); // Head57
		headModel[54].setRotationPoint(31F, -161F, 8F);

		headModel[55].addBox(0F, 0F, 0F, 8, 1, 16, 0F); // Head58
		headModel[55].setRotationPoint(39F, -161.5F, -8F);

		headModel[56].addBox(0F, 0F, 0F, 8, 1, 16, 0F); // Head59
		headModel[56].setRotationPoint(64F, -161.5F, -8F);

		headModel[57].addShapeBox(0F, 0F, 0F, 20, 38, 32, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[57].setRotationPoint(72F, -228F, -16F);

		headModel[58].addBox(-1F, 0F, 0F, 73, 18, 33, 0F); // Head61
		headModel[58].setRotationPoint(4F, -243F, -16.5F);
		headModel[58].rotateAngleZ = -0.20943951F;

		headModel[59].addBox(0F, 0F, 0F, 70, 35, 1, 0F); // Head62
		headModel[59].setRotationPoint(3F, -226F, -16.6F);

		headModel[60].addBox(0F, 0F, 0F, 70, 35, 1, 0F); // Head63
		headModel[60].setRotationPoint(3F, -226F, 15.6F);

		headModel[61].addBox(34F, -1F, 0F, 20, 1, 14, 0F); // Head64-
		headModel[61].setRotationPoint(4F, -243F, -7F);
		headModel[61].rotateAngleZ = -0.20943951F;

		headModel[62].addBox(40F, -0.5F, 0F, 10, 1, 20, 0F); // Head65
		headModel[62].setRotationPoint(4F, -243F, -10F);
		headModel[62].rotateAngleZ = -0.20943951F;

		headModel[63].addBox(34F, -1F, 0F, 20, 6, 4, 0F); // Head66
		headModel[63].setRotationPoint(4F, -243F, 13F);
		headModel[63].rotateAngleZ = -0.20943951F;

		headModel[64].addBox(14F, -1F, 0F, 20, 8, 4, 0F); // Head67
		headModel[64].setRotationPoint(4F, -243F, 13F);
		headModel[64].rotateAngleZ = -0.20943951F;

		headModel[65].addBox(34F, -1F, 0F, 20, 6, 4, 0F); // Head68
		headModel[65].setRotationPoint(4F, -243F, -17F);
		headModel[65].rotateAngleZ = -0.20943951F;

		headModel[66].addBox(14F, -1F, 0F, 20, 8, 4, 0F); // Head69
		headModel[66].setRotationPoint(4F, -243F, -17F);
		headModel[66].rotateAngleZ = -0.20943951F;

		headModel[67].addShapeBox(0F, 0F, 0F, 31, 29, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[67].setRotationPoint(3F, -222F, 15.8F);

		headModel[68].addShapeBox(0F, 0F, 0F, 31, 29, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[68].setRotationPoint(3F, -222F, -16.8F);

		headModel[69].addBox(-1F, 0F, 0F, 28, 26, 30, 0F); // Head72
		headModel[69].setRotationPoint(-24F, -243F, -15F);

		headModel[70].addBox(-1F, 0F, 0F, 28, 13, 2, 0F); // Head73-
		headModel[70].setRotationPoint(-24F, -243F, -17F);

		headModel[71].addShapeBox(-1F, 0F, 0F, 16, 12, 2, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[71].setRotationPoint(-12F, -230F, -17F);

		headModel[72].addBox(-1F, 0F, 0F, 28, 13, 2, 0F); // Head75
		headModel[72].setRotationPoint(-24F, -243F, 15F);

		headModel[73].addShapeBox(-1F, 0F, 0F, 16, 12, 2, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[73].setRotationPoint(-12F, -230F, 15F);

		headModel[74].addBox(0F, 0F, 0F, 85, 40, 148, 0F); // Head77
		headModel[74].setRotationPoint(-110F, -237F, -74F);

		headModel[75].addBox(0F, 0F, 0F, 85, 6, 40, 0F); // Head78
		headModel[75].setRotationPoint(-110F, -243F, -20F);

		headModel[76].addBox(0F, 0F, 0F, 85, 6, 55, 0F); // Head79
		headModel[76].setRotationPoint(-110.1F, -243F, 20F);
		headModel[76].rotateAngleX = -0.1064651F;

		headModel[77].addBox(0F, 0F, -55F, 85, 6, 55, 0F); // Head80
		headModel[77].setRotationPoint(-110.1F, -243F, -20F);
		headModel[77].rotateAngleX = 0.1064651F;

		headModel[78].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[78].setRotationPoint(-45.1F, -196F, 28F);

		headModel[79].addBox(0F, 0F, 0F, 20, 2, 6, 0F); // Head82
		headModel[79].setRotationPoint(-45.1F, -194F, 28F);

		headModel[80].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		headModel[80].setRotationPoint(-45.1F, -192F, 28F);

		headModel[81].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[81].setRotationPoint(-45.1F, -196F, 37F);

		headModel[82].addBox(0F, 0F, 0F, 20, 2, 6, 0F); // Head85
		headModel[82].setRotationPoint(-45.1F, -194F, 37F);

		headModel[83].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		headModel[83].setRotationPoint(-45.1F, -192F, 37F);

		headModel[84].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Head87
		headModel[84].setRotationPoint(-45.1F, -196F, 46F);

		headModel[85].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Head88
		headModel[85].setRotationPoint(-45.1F, -192F, 46F);

		headModel[86].addBox(0F, 0.5F, 0.5F, 9, 7, 3, 0F); // Head89
		headModel[86].setRotationPoint(-37.1F, -197F, 45F);

		headModel[87].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[87].setRotationPoint(-44.1F, -196F, 50F);

		headModel[88].addBox(0F, 0F, 0F, 20, 3, 9, 0F); // Head91
		headModel[88].setRotationPoint(-44.1F, -193F, 50F);

		headModel[89].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		headModel[89].setRotationPoint(-44.1F, -190F, 50F);

		headModel[90].addBox(0F, 0F, 0F, 85, 7, 35, 0F); // Head94
		headModel[90].setRotationPoint(-110.1F, -187F, 25F);

		headModel[91].addBox(0F, 0F, 0F, 66, 10, 35, 0F); // Head95
		headModel[91].setRotationPoint(-110.1F, -197F, 25F);

		headModel[92].addBox(0F, 0F, 0F, 85, 17, 8, 0F); // Head96
		headModel[92].setRotationPoint(-110.1F, -197F, 17F);

		headModel[93].addBox(0F, 0F, 0F, 1, 15, 30, 0F); // Head97
		headModel[93].setRotationPoint(-25F, -216F, 19F);

		headModel[94].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[94].setRotationPoint(-25F, -221F, 15F);

		headModel[95].addShapeBox(0F, 0F, 0F, 1, 10, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[95].setRotationPoint(-25F, -231F, 15F);

		headModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); //Test
		headModel[96].setRotationPoint(-25F, -216F, 49F);

		headModel[97].addBox(10F, -2F, 16F, 30, 2, 20, 0F); // Head101
		headModel[97].setRotationPoint(-110.1F, -243F, 20F);
		headModel[97].rotateAngleX = -0.1064651F;

		headModel[98].addBox(40F, -1F, 16F, 30, 1, 20, 0F); // Head102
		headModel[98].setRotationPoint(-110.1F, -243F, 20F);
		headModel[98].rotateAngleX = -0.1064651F;

		headModel[99].addBox(0F, -33F, -26F, 85, 33, 54, 0F); // Head103
		headModel[99].setRotationPoint(-110.1F, -198F, 59F);
		headModel[99].rotateAngleX = -1.047198F;

		headModel[100].addShapeBox(1F, -28F, 28F, 83, 28, 16, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[100].setRotationPoint(-110.1F, -198F, 59F);
		headModel[100].rotateAngleX = -1.047198F;

		headModel[101].addShapeBox(7F, -24F, 44F, 34, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		headModel[101].setRotationPoint(-110.1F, -198F, 59F);
		headModel[101].rotateAngleX = -1.047198F;

		headModel[102].addShapeBox(7F, -18F, 44F, 34, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		headModel[102].setRotationPoint(-110.1F, -198F, 59F);
		headModel[102].rotateAngleX = -1.047198F;

		headModel[103].addShapeBox(7F, -12F, 44F, 34, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		headModel[103].setRotationPoint(-110.1F, -198F, 59F);
		headModel[103].rotateAngleX = -1.047198F;

		headModel[104].addShapeBox(7F, -6F, 44F, 34, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		headModel[104].setRotationPoint(-110.1F, -198F, 59F);
		headModel[104].rotateAngleX = -1.047198F;

		headModel[105].addBox(41F, -24F, 44F, 34, 3, 17, 0F); // Head109
		headModel[105].setRotationPoint(-110.1F, -198F, 59F);
		headModel[105].rotateAngleX = -1.047198F;

		headModel[106].addBox(41F, -18F, 44F, 34, 3, 17, 0F); // Head110
		headModel[106].setRotationPoint(-110.1F, -198F, 59F);
		headModel[106].rotateAngleX = -1.047198F;

		headModel[107].addBox(41F, -12F, 44F, 34, 3, 17, 0F); // Head111
		headModel[107].setRotationPoint(-110.1F, -198F, 59F);
		headModel[107].rotateAngleX = -1.047198F;

		headModel[108].addBox(41F, -7F, 44F, 34, 3, 17, 0F); // Head112
		headModel[108].setRotationPoint(-110.1F, -198F, 58F);
		headModel[108].rotateAngleX = -1.047198F;

		headModel[109].addShapeBox(75F, -24F, 44F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); //Test
		headModel[109].setRotationPoint(-110.1F, -198F, 59F);
		headModel[109].rotateAngleX = -1.047198F;

		headModel[110].addShapeBox(75F, -18F, 44F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); //Test
		headModel[110].setRotationPoint(-110.1F, -198F, 59F);
		headModel[110].rotateAngleX = -1.047198F;

		headModel[111].addShapeBox(75F, -12F, 44F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); //Test
		headModel[111].setRotationPoint(-110.1F, -198F, 59F);
		headModel[111].rotateAngleX = -1.047198F;

		headModel[112].addShapeBox(75F, -7F, 44F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); //Test
		headModel[112].setRotationPoint(-110.1F, -198F, 58F);
		headModel[112].rotateAngleX = -1.047198F;

		headModel[113].addBox(41F, -26F, 44F, 4, 2, 6, 0F); // Head117
		headModel[113].setRotationPoint(-110.1F, -198F, 59F);
		headModel[113].rotateAngleX = -1.047198F;

		headModel[114].addBox(54F, -26F, 44F, 4, 2, 6, 0F); // Head118
		headModel[114].setRotationPoint(-110.1F, -198F, 59F);
		headModel[114].rotateAngleX = -1.047198F;

		headModel[115].addBox(45F, -25F, 45.5F, 9, 1, 3, 0F); // Head119
		headModel[115].setRotationPoint(-110.1F, -198F, 59F);
		headModel[115].rotateAngleX = -1.047198F;

		headModel[116].addShapeBox(66F, -39F, -16F, 8, 6, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[116].setRotationPoint(-110.1F, -198F, 59F);
		headModel[116].rotateAngleX = -1.047198F;

		headModel[117].addBox(74F, -39F, -12F, 1, 6, 2, 0F); // Head121
		headModel[117].setRotationPoint(-110.1F, -198F, 58F);
		headModel[117].rotateAngleX = -1.047198F;

		headModel[118].addBox(49F, -38F, -13F, 17, 5, 10, 0F); // Head122
		headModel[118].setRotationPoint(-110.1F, -198F, 59F);
		headModel[118].rotateAngleX = -1.047198F;

		headModel[119].addBox(22F, -39F, -15F, 27, 6, 15, 0F); // Head123
		headModel[119].setRotationPoint(-110.1F, -198F, 59F);
		headModel[119].rotateAngleX = -1.047198F;

		headModel[120].addShapeBox(23F, -37F, 0F, 10, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[120].setRotationPoint(-110.1F, -198F, 59F);
		headModel[120].rotateAngleX = -1.047198F;

		headModel[121].addShapeBox(36F, -37F, 0F, 10, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[121].setRotationPoint(-110.1F, -198F, 59F);
		headModel[121].rotateAngleX = -1.047198F;

		headModel[122].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[122].setRotationPoint(-45.1F, -196F, -34F);

		headModel[123].addBox(0F, 0F, 0F, 20, 2, 6, 0F); // Head127
		headModel[123].setRotationPoint(-45.1F, -194F, -34F);

		headModel[124].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		headModel[124].setRotationPoint(-45.1F, -192F, -34F);

		headModel[125].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[125].setRotationPoint(-45.1F, -196F, -43F);

		headModel[126].addBox(0F, 0F, 0F, 20, 2, 6, 0F); // Head130
		headModel[126].setRotationPoint(-45.1F, -194F, -43F);

		headModel[127].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		headModel[127].setRotationPoint(-45.1F, -192F, -43F);

		headModel[128].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Head132
		headModel[128].setRotationPoint(-45.1F, -196F, -48F);

		headModel[129].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Head133
		headModel[129].setRotationPoint(-45.1F, -192F, -48F);

		headModel[130].addBox(0F, 0.5F, 0.5F, 9, 7, 3, 0F); // Head134
		headModel[130].setRotationPoint(-37.1F, -197F, -49F);

		headModel[131].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[131].setRotationPoint(-44.1F, -196F, -59F);

		headModel[132].addBox(0F, 0F, 0F, 20, 3, 9, 0F); // Head136
		headModel[132].setRotationPoint(-44.1F, -193F, -59F);

		headModel[133].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		headModel[133].setRotationPoint(-44.1F, -190F, -59F);

		headModel[134].addBox(0F, 0F, 0F, 85, 7, 35, 0F); // Head138
		headModel[134].setRotationPoint(-110.1F, -187F, -60F);

		headModel[135].addBox(0F, 0F, 0F, 66, 10, 35, 0F); // Head139
		headModel[135].setRotationPoint(-110.1F, -197F, -60F);

		headModel[136].addBox(0F, 0F, 0F, 85, 17, 8, 0F); // Head140
		headModel[136].setRotationPoint(-110.1F, -197F, -25F);

		headModel[137].addBox(0F, 0F, 0F, 1, 15, 30, 0F); // Head141
		headModel[137].setRotationPoint(-25F, -216F, -49F);

		headModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[138].setRotationPoint(-25F, -221F, -35F);

		headModel[139].addShapeBox(0F, 0F, 0F, 1, 10, 27, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[139].setRotationPoint(-25F, -231F, -42F);

		headModel[140].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[140].setRotationPoint(-25F, -216F, -54F);

		headModel[141].addBox(10F, -2F, -36F, 30, 2, 20, 0F); // Head146
		headModel[141].setRotationPoint(-110.1F, -243F, -20F);
		headModel[141].rotateAngleX = 0.1064651F;

		headModel[142].addBox(40F, -1F, -36F, 30, 1, 20, 0F); // Head147
		headModel[142].setRotationPoint(-110.1F, -243F, -20F);
		headModel[142].rotateAngleX = 0.1064651F;

		headModel[143].addBox(0F, -33F, -28F, 85, 33, 54, 0F); // Head148
		headModel[143].setRotationPoint(-110.1F, -198F, -59F);
		headModel[143].rotateAngleX = 1.047198F;

		headModel[144].addShapeBox(1F, -28F, -44F, 83, 28, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); //Test
		headModel[144].setRotationPoint(-110.1F, -198F, -59F);
		headModel[144].rotateAngleX = 1.047198F;

		headModel[145].addShapeBox(7F, -24F, -54F, 34, 3, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[145].setRotationPoint(-110.1F, -198F, -59F);
		headModel[145].rotateAngleX = 1.047198F;

		headModel[146].addShapeBox(7F, -18F, -54F, 34, 3, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[146].setRotationPoint(-110.1F, -198F, -59F);
		headModel[146].rotateAngleX = 1.047198F;

		headModel[147].addShapeBox(7F, -12F, -54F, 34, 3, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[147].setRotationPoint(-110.1F, -198F, -59F);
		headModel[147].rotateAngleX = 1.047198F;

		headModel[148].addShapeBox(7F, -6F, -54F, 34, 3, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[148].setRotationPoint(-110.1F, -198F, -59F);
		headModel[148].rotateAngleX = 1.047198F;

		headModel[149].addBox(41F, -24F, -61F, 34, 3, 17, 0F); // Head154
		headModel[149].setRotationPoint(-110.1F, -198F, -59F);
		headModel[149].rotateAngleX = 1.047198F;

		headModel[150].addBox(41F, -18F, -61F, 34, 3, 17, 0F); // Head155
		headModel[150].setRotationPoint(-110.1F, -198F, -59F);
		headModel[150].rotateAngleX = 1.047198F;

		headModel[151].addBox(41F, -12F, -61F, 34, 3, 17, 0F); // Head156
		headModel[151].setRotationPoint(-110.1F, -198F, -59F);
		headModel[151].rotateAngleX = 1.047198F;

		headModel[152].addBox(41F, -6F, -61F, 34, 3, 17, 0F); // Head157
		headModel[152].setRotationPoint(-110.1F, -198F, -59F);
		headModel[152].rotateAngleX = 1.047198F;

		headModel[153].addShapeBox(75F, -24F, -61F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[153].setRotationPoint(-110.1F, -198F, -59F);
		headModel[153].rotateAngleX = 1.047198F;

		headModel[154].addShapeBox(75F, -18F, -61F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[154].setRotationPoint(-110.1F, -198F, -59F);
		headModel[154].rotateAngleX = 1.047198F;

		headModel[155].addShapeBox(75F, -12F, -61F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[155].setRotationPoint(-110.1F, -198F, -59F);
		headModel[155].rotateAngleX = 1.047198F;

		headModel[156].addShapeBox(75F, -6F, -61F, 7, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[156].setRotationPoint(-110.1F, -198F, -59F);
		headModel[156].rotateAngleX = 1.047198F;

		headModel[157].addBox(41F, -26F, -50F, 4, 2, 6, 0F); // Head162
		headModel[157].setRotationPoint(-110.1F, -198F, -59F);
		headModel[157].rotateAngleX = 1.047198F;

		headModel[158].addBox(54F, -26F, -50F, 4, 2, 6, 0F); // Head163
		headModel[158].setRotationPoint(-110.1F, -198F, -59F);
		headModel[158].rotateAngleX = 1.047198F;

		headModel[159].addBox(45F, -25F, -48.5F, 9, 1, 3, 0F); // Head164
		headModel[159].setRotationPoint(-110.1F, -198F, -59F);
		headModel[159].rotateAngleX = 1.047198F;

		headModel[160].addShapeBox(66F, -39F, 0F, 8, 6, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[160].setRotationPoint(-110.1F, -198F, -59F);
		headModel[160].rotateAngleX = 1.047198F;

		headModel[161].addBox(74F, -39F, 10F, 1, 6, 2, 0F); // Head166
		headModel[161].setRotationPoint(-110.1F, -198F, -58F);
		headModel[161].rotateAngleX = 1.047198F;

		headModel[162].addBox(49F, -38F, 3F, 17, 5, 10, 0F); // Head167
		headModel[162].setRotationPoint(-110.1F, -198F, -59F);
		headModel[162].rotateAngleX = 1.047198F;

		headModel[163].addBox(22F, -39F, 0F, 27, 6, 15, 0F); // Head168
		headModel[163].setRotationPoint(-110.1F, -198F, -59F);
		headModel[163].rotateAngleX = 1.047198F;

		headModel[164].addShapeBox(23F, -37F, -9F, 10, 4, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[164].setRotationPoint(-110.1F, -198F, -59F);
		headModel[164].rotateAngleX = 1.047198F;

		headModel[165].addShapeBox(36F, -37F, -5F, 10, 4, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[165].setRotationPoint(-110.1F, -198F, -59F);
		headModel[165].rotateAngleX = 1.047198F;

		headModel[166].addBox(0F, 0F, 0F, 40, 2, 34, 0F); // Head171
		headModel[166].setRotationPoint(-110F, -245F, -17F);

		headModel[167].addShapeBox(0F, 0F, 0F, 20, 2, 34, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); //Test
		headModel[167].setRotationPoint(-70F, -245F, -17F);

		headModel[168].addBox(-25F, 0F, 0F, 25, 74, 30, 0F); // Head173
		headModel[168].setRotationPoint(-4F, -183F, -15F);
		headModel[168].rotateAngleZ = -0.6981317F;

		headModel[169].addShapeBox(0F, 0F, 0F, 24, 74, 8, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); //Test
		headModel[169].setRotationPoint(-4F, -183F, -19F);
		headModel[169].rotateAngleZ = -0.6981317F;

		headModel[170].addShapeBox(0F, 0F, 0F, 24, 74, 8, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, 0F, 0F, 0F); //Test
		headModel[170].setRotationPoint(-4F, -183F, 11F);
		headModel[170].rotateAngleZ = -0.6981317F;

		headModel[171].addBox(-16F, 0F, 0F, 16, 10, 4, 0F); // Head176
		headModel[171].setRotationPoint(-4F, -183F, 15F);
		headModel[171].rotateAngleZ = -0.6981317F;

		headModel[172].addBox(-25F, 0F, 0F, 13, 74, 4, 0F); // Head177
		headModel[172].setRotationPoint(-4F, -183F, 15F);
		headModel[172].rotateAngleZ = -0.6981317F;

		headModel[173].addBox(-12F, 64F, 0F, 12, 10, 4, 0F); // Head178
		headModel[173].setRotationPoint(-4F, -183F, 15F);
		headModel[173].rotateAngleZ = -0.6981317F;

		headModel[174].addShapeBox(-8F, 10F, 0F, 4, 54, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		headModel[174].setRotationPoint(-4F, -183F, 15F);
		headModel[174].rotateAngleZ = -0.6981317F;

		headModel[175].addShapeBox(-12F, 14F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		headModel[175].setRotationPoint(-4F, -183F, 15F);
		headModel[175].rotateAngleZ = -0.6981317F;

		headModel[176].addShapeBox(-12F, 22F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		headModel[176].setRotationPoint(-4F, -183F, 15F);
		headModel[176].rotateAngleZ = -0.6981317F;

		headModel[177].addShapeBox(-12F, 30F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		headModel[177].setRotationPoint(-4F, -183F, 15F);
		headModel[177].rotateAngleZ = -0.6981317F;

		headModel[178].addShapeBox(-12F, 38F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		headModel[178].setRotationPoint(-4F, -183F, 15F);
		headModel[178].rotateAngleZ = -0.6981317F;

		headModel[179].addShapeBox(-12F, 46F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		headModel[179].setRotationPoint(-4F, -183F, 15F);
		headModel[179].rotateAngleZ = -0.6981317F;

		headModel[180].addShapeBox(-12F, 54F, 0F, 12, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		headModel[180].setRotationPoint(-4F, -183F, 15F);
		headModel[180].rotateAngleZ = -0.6981317F;

		headModel[181].addBox(-16F, 0F, 0F, 16, 10, 4, 0F); // Head186
		headModel[181].setRotationPoint(-4F, -183F, -19F);
		headModel[181].rotateAngleZ = -0.6981317F;

		headModel[182].addBox(-25F, 0F, 0F, 13, 74, 4, 0F); // Head187
		headModel[182].setRotationPoint(-4F, -183F, -19F);
		headModel[182].rotateAngleZ = -0.6981317F;

		headModel[183].addBox(-12F, 64F, 0F, 12, 10, 4, 0F); // Head189
		headModel[183].setRotationPoint(-4F, -183F, -19F);
		headModel[183].rotateAngleZ = -0.6981317F;

		headModel[184].addShapeBox(-8F, 10F, 0F, 4, 54, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[184].setRotationPoint(-4F, -183F, -17F);
		headModel[184].rotateAngleZ = -0.6981317F;

		headModel[185].addShapeBox(-12F, 14F, 0F, 12, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[185].setRotationPoint(-4F, -183F, -18F);
		headModel[185].rotateAngleZ = -0.6981317F;

		headModel[186].addShapeBox(-12F, 22F, 0F, 12, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[186].setRotationPoint(-4F, -183F, -18F);
		headModel[186].rotateAngleZ = -0.6981317F;

		headModel[187].addShapeBox(-12F, 30F, 0F, 12, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[187].setRotationPoint(-4F, -183F, -18F);
		headModel[187].rotateAngleZ = -0.6981317F;

		headModel[188].addShapeBox(-12F, 38F, 0F, 12, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[188].setRotationPoint(-4F, -183F, -18F);
		headModel[188].rotateAngleZ = -0.6981317F;

		headModel[189].addShapeBox(-12F, 46F, 0F, 12, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[189].setRotationPoint(-4F, -183F, -18F);
		headModel[189].rotateAngleZ = -0.6981317F;

		headModel[190].addShapeBox(-12F, 54F, 0F, 12, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[190].setRotationPoint(-4F, -183F, -18F);
		headModel[190].rotateAngleZ = -0.6981317F;

		headModel[191].addBox(0F, 0F, 0F, 8, 32, 15, 0F); // Head197
		headModel[191].setRotationPoint(-4F, -183F, -7.5F);
		headModel[191].rotateAngleZ = -0.6981317F;

		headModel[192].addBox(0F, 54F, -1F, 8, 19, 15, 0F); // Head198
		headModel[192].setRotationPoint(-4F, -183F, -7.5F);
		headModel[192].rotateAngleZ = -0.6981317F;

		headModel[193].addBox(0F, 32F, 0F, 4, 22, 4, 0F); // Head199
		headModel[193].setRotationPoint(-4F, -183F, -6.5F);
		headModel[193].rotateAngleZ = -0.6981317F;

		headModel[194].addBox(0F, 32F, 0F, 4, 22, 4, 0F); // Head200
		headModel[194].setRotationPoint(-4F, -183F, 0.5F);
		headModel[194].rotateAngleZ = -0.6981317F;



// Body
		bodyModel = new ModelRendererTurbo[100];
		bodyModel[0] = new ModelRendererTurbo(this,  600,  440, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this,  600,  440, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this,  600,  480, textureX, textureY); // Body3
		bodyModel[3] = new ModelRendererTurbo(this,  600,  480, textureX, textureY); // Body4
		bodyModel[4] = new ModelRendererTurbo(this,  600,  513, textureX, textureY); // Body5
		bodyModel[5] = new ModelRendererTurbo(this,  600,  620, textureX, textureY); // Body6
		bodyModel[6] = new ModelRendererTurbo(this,  600,  710, textureX, textureY); // Body7
		bodyModel[7] = new ModelRendererTurbo(this,  581,  760, textureX, textureY); // Body8
		bodyModel[8] = new ModelRendererTurbo(this,  600,  250, textureX, textureY); // Body9
		bodyModel[9] = new ModelRendererTurbo(this,  600,  920, textureX, textureY); // Body10
		bodyModel[10] = new ModelRendererTurbo(this,  800,  0, textureX, textureY); // Body11
		bodyModel[11] = new ModelRendererTurbo(this,  800,  100, textureX, textureY); // Body12
		bodyModel[12] = new ModelRendererTurbo(this,  800,  180, textureX, textureY); // Body13
		bodyModel[13] = new ModelRendererTurbo(this,  800,  250, textureX, textureY); // Body14
		bodyModel[14] = new ModelRendererTurbo(this,  800,  0, textureX, textureY); // Body15
		bodyModel[15] = new ModelRendererTurbo(this,  800,  100, textureX, textureY); // Body16
		bodyModel[16] = new ModelRendererTurbo(this,  800,  180, textureX, textureY); // Body17
		bodyModel[17] = new ModelRendererTurbo(this,  800,  310, textureX, textureY); // Body18
		bodyModel[18] = new ModelRendererTurbo(this,  800,  380, textureX, textureY); // Body19
		bodyModel[19] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body20
		bodyModel[20] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body21
		bodyModel[21] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body22
		bodyModel[22] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body24
		bodyModel[23] = new ModelRendererTurbo(this,  850,  450, textureX, textureY); // Body25
		bodyModel[24] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body26
		bodyModel[25] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body27
		bodyModel[26] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body28
		bodyModel[27] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body29
		bodyModel[28] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body30
		bodyModel[29] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body31
		bodyModel[30] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body32
		bodyModel[31] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body33
		bodyModel[32] = new ModelRendererTurbo(this,  800,  310, textureX, textureY); // Body34
		bodyModel[33] = new ModelRendererTurbo(this,  800,  380, textureX, textureY); // Body35
		bodyModel[34] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body36
		bodyModel[35] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body37
		bodyModel[36] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body38
		bodyModel[37] = new ModelRendererTurbo(this,  800,  480, textureX, textureY); // Body39
		bodyModel[38] = new ModelRendererTurbo(this,  850,  450, textureX, textureY); // Body40
		bodyModel[39] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body41
		bodyModel[40] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body42
		bodyModel[41] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body43
		bodyModel[42] = new ModelRendererTurbo(this,  840,  540, textureX, textureY); // Body44
		bodyModel[43] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body45
		bodyModel[44] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body46
		bodyModel[45] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body47
		bodyModel[46] = new ModelRendererTurbo(this,  840,  570, textureX, textureY); // Body48
		bodyModel[47] = new ModelRendererTurbo(this,  581,  760, textureX, textureY); // Body49-
		bodyModel[48] = new ModelRendererTurbo(this,  1100,  0, textureX, textureY); // Body50
		bodyModel[49] = new ModelRendererTurbo(this,  1100,  100, textureX, textureY); // Body51
		bodyModel[50] = new ModelRendererTurbo(this,  1100,  130, textureX, textureY); // Body52
		bodyModel[51] = new ModelRendererTurbo(this,  1100,  150, textureX, textureY); // Body53
		bodyModel[52] = new ModelRendererTurbo(this,  1100,  200, textureX, textureY); // Body54
		bodyModel[53] = new ModelRendererTurbo(this,  1100,  230, textureX, textureY); // Body55
		bodyModel[54] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body56
		bodyModel[55] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body57
		bodyModel[56] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body58
		bodyModel[57] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body59
		bodyModel[58] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body60
		bodyModel[59] = new ModelRendererTurbo(this,  1100,  280, textureX, textureY); // Body61
		bodyModel[60] = new ModelRendererTurbo(this,  1100,  350, textureX, textureY); // Body62
		bodyModel[61] = new ModelRendererTurbo(this,  1100,  405, textureX, textureY); // Body63
		bodyModel[62] = new ModelRendererTurbo(this,  1100,  470, textureX, textureY); // Body64
		bodyModel[63] = new ModelRendererTurbo(this,  1100,  100, textureX, textureY); // Body65
		bodyModel[64] = new ModelRendererTurbo(this,  1100,  130, textureX, textureY); // Body66
		bodyModel[65] = new ModelRendererTurbo(this,  1100,  150, textureX, textureY); // Body67
		bodyModel[66] = new ModelRendererTurbo(this,  1100,  200, textureX, textureY); // Body68
		bodyModel[67] = new ModelRendererTurbo(this,  1100,  230, textureX, textureY); // Body69
		bodyModel[68] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body70
		bodyModel[69] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body71
		bodyModel[70] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body72
		bodyModel[71] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body73
		bodyModel[72] = new ModelRendererTurbo(this,  1100,  250, textureX, textureY); // Body74
		bodyModel[73] = new ModelRendererTurbo(this,  1100,  280, textureX, textureY); // Body75
		bodyModel[74] = new ModelRendererTurbo(this,  1100,  350, textureX, textureY); // Body76
		bodyModel[75] = new ModelRendererTurbo(this,  1100,  405, textureX, textureY); // Body77-
		bodyModel[76] = new ModelRendererTurbo(this,  1100,  570, textureX, textureY); // Body78
		bodyModel[77] = new ModelRendererTurbo(this,  1100,  620, textureX, textureY); // Body79
		bodyModel[78] = new ModelRendererTurbo(this,  1100,  650, textureX, textureY); // Body80
		bodyModel[79] = new ModelRendererTurbo(this,  1100,  680, textureX, textureY); // Body81
		bodyModel[80] = new ModelRendererTurbo(this,  1100,  720, textureX, textureY); // Body82
		bodyModel[81] = new ModelRendererTurbo(this,  1100,  760, textureX, textureY); // Body83
		bodyModel[82] = new ModelRendererTurbo(this,  1100,  800, textureX, textureY); // Body84
		bodyModel[83] = new ModelRendererTurbo(this,  1100,  870, textureX, textureY); // Body85
		bodyModel[84] = new ModelRendererTurbo(this,  1100,  870, textureX, textureY); // Body86
		bodyModel[85] = new ModelRendererTurbo(this,  1100,  930, textureX, textureY); // Body87
		bodyModel[86] = new ModelRendererTurbo(this,  1100,  950, textureX, textureY); // Body88
		bodyModel[87] = new ModelRendererTurbo(this,  1100,  980, textureX, textureY); // Body89
		bodyModel[88] = new ModelRendererTurbo(this,  1100,  570, textureX, textureY); // Body90
		bodyModel[89] = new ModelRendererTurbo(this,  1100,  620, textureX, textureY); // Body91
		bodyModel[90] = new ModelRendererTurbo(this,  1100,  650, textureX, textureY); // Body92
		bodyModel[91] = new ModelRendererTurbo(this,  1100,  680, textureX, textureY); // Body93
		bodyModel[92] = new ModelRendererTurbo(this,  1100,  720, textureX, textureY); // Body94
		bodyModel[93] = new ModelRendererTurbo(this,  1100,  760, textureX, textureY); // Body95
		bodyModel[94] = new ModelRendererTurbo(this,  1100,  800, textureX, textureY); // Body96
		bodyModel[95] = new ModelRendererTurbo(this,  1100,  870, textureX, textureY); // Body97
		bodyModel[96] = new ModelRendererTurbo(this,  1100,  870, textureX, textureY); // Body98
		bodyModel[97] = new ModelRendererTurbo(this,  1100,  930, textureX, textureY); // Body99
		bodyModel[98] = new ModelRendererTurbo(this,  1100,  950, textureX, textureY); // Body100
		bodyModel[99] = new ModelRendererTurbo(this,  1100,  980, textureX, textureY); // Body101

		bodyModel[0].addBox(-96F, 63F, 0F, 98, 25, 8, 0F); // Body1
		bodyModel[0].setRotationPoint(-50F, -206F, 19F);

		bodyModel[1].addBox(-96F, 63F, 0F, 98, 25, 8, 0F); // Body2
		bodyModel[1].setRotationPoint(-50F, -206F, -27F);

		bodyModel[2].addShapeBox(-96F, 63F, 0F, 20, 25, 8, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[2].setRotationPoint(48F, -206F, 19F);

		bodyModel[3].addShapeBox(-96F, 63F, 0F, 20, 25, 8, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[3].setRotationPoint(48F, -206F, -27F);

		bodyModel[4].addBox(-96F, 63F, 0F, 80, 25, 38, 0F); // Body5
		bodyModel[4].setRotationPoint(-50F, -206F, -19F);

		bodyModel[5].addBox(0F, 54F, 0F, 25, 62, 20, 0F); // Body6
		bodyModel[5].setRotationPoint(-181F, -216F, -10F);
		bodyModel[5].rotateAngleZ = 0.5759587F;

		bodyModel[6].addShapeBox(25F, 31F, 0F, 61, 25, 21, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[6].setRotationPoint(-218F, -216F, -10.5F);

		bodyModel[7].addBox(25F, -17F, 0F, 120, 48, 100, 0F); // Body8
		bodyModel[7].setRotationPoint(-296F, -216F, -50F);

		bodyModel[8].addBox(0F, -17F, 0F, 20, 20, 40, 0F); // Body9
		bodyModel[8].setRotationPoint(-151F, -188F, -20F);

		bodyModel[9].addShapeBox(0F, -17F, 0F, 20, 28, 40, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[9].setRotationPoint(-151F, -216F, -20F);

		bodyModel[10].addBox(25F, -17F, 0F, 40, 53, 40, 0F); // Body11
		bodyModel[10].setRotationPoint(-213F, -220F, 20F);

		bodyModel[11].addShapeBox(0F, -17F, 0F, 20, 28, 40, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[11].setRotationPoint(-148F, -220F, 20F);

		bodyModel[12].addBox(0F, -17F, 0F, 20, 25, 40, 0F); // Body13
		bodyModel[12].setRotationPoint(-148F, -192F, 20F);

		bodyModel[13].addBox(0F, -17F, 0F, 3, 10, 40, 0F); // Body14
		bodyModel[13].setRotationPoint(-131F, -188F, -20F);

		bodyModel[14].addBox(25F, -17F, 0F, 40, 53, 40, 0F); // Body15
		bodyModel[14].setRotationPoint(-213F, -220F, -60F);

		bodyModel[15].addShapeBox(0F, -17F, 0F, 20, 28, 40, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[15].setRotationPoint(-148F, -220F, -60F);

		bodyModel[16].addBox(0F, -17F, 0F, 20, 25, 40, 0F); // Body17

		bodyModel[16].setRotationPoint(-148F, -192F, -60F);

		bodyModel[17].addBox(25F, -17F, 0F, 84, 53, 10, 0F); // Body18
		bodyModel[17].setRotationPoint(-297F, -220F, -55F);

		bodyModel[18].addBox(25F, -17F, 0F, 84, 53, 5, 0F); // Body19
		bodyModel[18].setRotationPoint(-297F, -220F, -25F);

		bodyModel[19].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body20
		bodyModel[19].setRotationPoint(-192F, -220F, -45F);

		bodyModel[20].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body21
		bodyModel[20].setRotationPoint(-212F, -220F, -45F);

		bodyModel[21].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body22
		bodyModel[21].setRotationPoint(-232F, -220F, -45F);

		bodyModel[22].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body24
		bodyModel[22].setRotationPoint(-252F, -220F, -45F);

		bodyModel[23].addBox(0F, -17F, 0F, 4, 53, 20, 0F); // Body25
		bodyModel[23].setRotationPoint(-272F, -220F, -45F);

		bodyModel[24].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[24].setRotationPoint(-208F, -218F, -41F);

		bodyModel[25].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		bodyModel[25].setRotationPoint(-228F, -218F, -41F);

		bodyModel[26].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
	bodyModel[26].setRotationPoint(-248F, -218F, -41F);

		bodyModel[27].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		bodyModel[27].setRotationPoint(-268F, -218F, -41F);

		bodyModel[28].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body30
		bodyModel[28].setRotationPoint(-208F, -236F, -45F);
		bodyModel[28].rotateAngleX = 0.8726646F;

		bodyModel[29].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body31
		bodyModel[29].setRotationPoint(-228F, -236F, -45F);
		bodyModel[29].rotateAngleX = 1.256637F;

		bodyModel[30].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body32
		bodyModel[30].setRotationPoint(-248F, -236F, -45F);
		bodyModel[30].rotateAngleX = 1.396263F;

		bodyModel[31].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body33
		bodyModel[31].setRotationPoint(-268F, -236F, -45F);
		bodyModel[31].rotateAngleX = 1.570796F;

		bodyModel[32].addBox(25F, -17F, 0F, 84, 53, 10, 0F); // Body34
		bodyModel[32].setRotationPoint(-297F, -220F, 45F);

		bodyModel[33].addBox(25F, -17F, 0F, 84, 53, 5, 0F); // Body35
		bodyModel[33].setRotationPoint(-297F, -220F, 20F);

		bodyModel[34].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body36
		bodyModel[34].setRotationPoint(-192F, -220F, 25F);

		bodyModel[35].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body37
		bodyModel[35].setRotationPoint(-212F, -220F, 25F);

		bodyModel[36].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body38
		bodyModel[36].setRotationPoint(-232F, -220F, 25F);

		bodyModel[37].addBox(0F, -17F, 0F, 4, 4, 20, 0F); // Body39
		bodyModel[37].setRotationPoint(-252F, -220F, 25F);

		bodyModel[38].addBox(0F, -17F, 0F, 4, 53, 20, 0F); // Body40
		bodyModel[38].setRotationPoint(-272F, -220F, 25F);

		bodyModel[39].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		bodyModel[39].setRotationPoint(-208F, -218F, 25F);

		bodyModel[40].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		bodyModel[40].setRotationPoint(-228F, -218F, 25F);

		bodyModel[41].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		bodyModel[41].setRotationPoint(-248F, -218F, 25F);

		bodyModel[42].addShapeBox(0F, -17F, 0F, 16, 2, 16, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		bodyModel[42].setRotationPoint(-268F, -218F, 25F);

		bodyModel[43].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body45
		bodyModel[43].setRotationPoint(-208F, -236F, 45F);
		bodyModel[43].rotateAngleX = 2.268928F;

		bodyModel[44].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body46
		bodyModel[44].setRotationPoint(-228F, -236F, 45F);
		bodyModel[44].rotateAngleX = 1.919862F;

		bodyModel[45].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body47
		bodyModel[45].setRotationPoint(-248F, -236F, 45F);
		bodyModel[45].rotateAngleX = 1.745329F;

		bodyModel[46].addBox(0F, -1F, 0F, 16, 2, 20, 0F); // Body48
		bodyModel[46].setRotationPoint(-268F, -236F, 45F);
		bodyModel[46].rotateAngleX = 1.570796F;

		bodyModel[47].addShapeBox(25F, -17F, 0F, 60, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); //Test
		bodyModel[47].setRotationPoint(-243F, -217F, -10F);

		bodyModel[48].addBox(25F, -17F, 0F, 20, 1, 40, 0F); // Body50
		bodyModel[48].setRotationPoint(-272F, -217F, -20F);

		bodyModel[49].addBox(25F, -17F, 0F, 84, 12, 5, 0F); // Body51
		bodyModel[49].setRotationPoint(-297F, -220F, 55F);

		bodyModel[50].addShapeBox(25F, -17F, 0F, 41, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[50].setRotationPoint(-297F, -208F, 55F);

		bodyModel[51].addBox(25F, -17F, 0F, 20, 36, 5, 0F); // Body53
		bodyModel[51].setRotationPoint(-297F, -203F, 55F);

		bodyModel[52].addBox(25F, -17F, 0F, 64, 12, 5, 0F); // Body54
		bodyModel[52].setRotationPoint(-277F, -179F, 55F);

		bodyModel[53].addShapeBox(25F, -17F, 0F, 64, 7, 2, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[53].setRotationPoint(-277F, -186F, 55F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); //Test
		bodyModel[54].setRotationPoint(-196F, -220F, 55F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); //Test
		bodyModel[55].setRotationPoint(-205F, -220F, 55F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); //Test
		bodyModel[56].setRotationPoint(-214F, -220F, 55F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); //Test
		bodyModel[57].setRotationPoint(-223F, -220F, 55F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); //Test
		bodyModel[58].setRotationPoint(-232F, -220F, 55F);

		bodyModel[59].addShapeBox(0F, -17F, 0F, 21, 20, 40, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[59].setRotationPoint(-293F, -220F, 20F);

		bodyModel[60].addShapeBox(0F, -17F, 0F, 21, 33, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); //Test
		bodyModel[60].setRotationPoint(-293F, -200F, 45F);

		bodyModel[61].addShapeBox(0F, -17F, 0F, 21, 33, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F); //Test
		bodyModel[61].setRotationPoint(-293F, -200F, 20F);

		bodyModel[62].addShapeBox(0F, -17F, 0F, 18, 48, 40, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F); //Test
		bodyModel[62].setRotationPoint(-289F, -216F, -20F);

		bodyModel[63].addBox(25F, -17F, 0F, 84, 12, 5, 0F); // Body65
		bodyModel[63].setRotationPoint(-297F, -220F, -60F);

		bodyModel[64].addShapeBox(25F, -17F, 0F, 41, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[64].setRotationPoint(-297F, -208F, -60F);

		bodyModel[65].addBox(25F, -17F, 0F, 20, 36, 5, 0F); // Body67
		bodyModel[65].setRotationPoint(-297F, -203F, -60F);

		bodyModel[66].addBox(25F, -17F, 0F, 64, 12, 5, 0F); // Body68
		bodyModel[66].setRotationPoint(-277F, -179F, -60F);

		bodyModel[67].addShapeBox(25F, -17F, 0F, 64, 7, 2, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[67].setRotationPoint(-277F, -186F, -57F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[68].setRotationPoint(-196F, -220F, -60F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[69].setRotationPoint(-205F, -220F, -60F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[70].setRotationPoint(-214F, -220F, -60F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[71].setRotationPoint(-223F, -220F, -60F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 15, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[72].setRotationPoint(-232F, -220F, -60F);

		bodyModel[73].addShapeBox(0F, -17F, 0F, 21, 20, 40, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[73].setRotationPoint(-293F, -220F, -60F);

		bodyModel[74].addShapeBox(0F, -17F, 0F, 21, 33, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); //Test
		bodyModel[74].setRotationPoint(-293F, -200F, -60F);

		bodyModel[75].addShapeBox(0F, -17F, 0F, 21, 33, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F); //Test
		bodyModel[75].setRotationPoint(-293F, -200F, -45F);

		bodyModel[76].addBox(25F, -17F, 0F, 15, 23, 20, 0F); // Body78
		bodyModel[76].setRotationPoint(-193F, -214F, 60F);

		bodyModel[77].addShapeBox(25F, -17F, 0F, 15, 16, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[77].setRotationPoint(-193F, -191F, 60F);

		bodyModel[78].addBox(25F, -17F, 0F, 4, 17, 6, 0F); // Body80
		bodyModel[78].setRotationPoint(-178F, -211F, 60F);

		bodyModel[79].addShapeBox(25F, -17F, 0F, 2, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); //Test
		bodyModel[79].setRotationPoint(-174F, -211F, 60F);

		bodyModel[80].addShapeBox(25F, -17F, 0F, 10, 6, 20, 0F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, -9.5F); //Test
		bodyModel[80].setRotationPoint(-190.5F, -220F, 60F);

		bodyModel[81].addBox(25F, -17F, 0F, 10, 4, 10, 0F); // Body83
		bodyModel[81].setRotationPoint(-190.5F, -224F, 70F);

		bodyModel[82].addBox(25F, -17F, 0F, 8, 8, 47, 0F); // Body84
		bodyModel[82].setRotationPoint(-189.5F, -214F, 79F);

		bodyModel[83].addShapeBox(25F, -17F, 0F, 4, 16, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); //Test
		bodyModel[83].setRotationPoint(-181.5F, -214F, 84F);

		bodyModel[84].addShapeBox(25F, -17F, 0F, 4, 16, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); //Test
		bodyModel[84].setRotationPoint(-193.5F, -214F, 84F);

		bodyModel[85].addBox(25F, -17F, 0F, 4, 9, 8, 0F); // Body87
		bodyModel[85].setRotationPoint(-187.5F, -223F, 117F);

		bodyModel[86].addBox(25F, -17F, 0F, 2, 2, 10, 0F); // Body88
		bodyModel[86].setRotationPoint(-186.5F, -222F, 80F);

		bodyModel[87].addBox(25F, -17.5F, 0F, 3, 3, 27, 0F); // Body89
		bodyModel[87].setRotationPoint(-187F, -222F, 90F);

		bodyModel[88].addBox(25F, -17F, 0F, 15, 23, 20, 0F); // Body90
		bodyModel[88].setRotationPoint(-193F, -214F, -80F);

		bodyModel[89].addShapeBox(25F, -17F, 0F, 15, 16, 4, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[89].setRotationPoint(-193F, -191F, -64F);

		bodyModel[90].addBox(25F, -17F, 0F, 4, 17, 6, 0F); // Body92
		bodyModel[90].setRotationPoint(-178F, -211F, -66F);

		bodyModel[91].addShapeBox(25F, -17F, 0F, 2, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[91].setRotationPoint(-174F, -211F, -66F);

		bodyModel[92].addShapeBox(25F, -17F, 0F, 10, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[92].setRotationPoint(-190.5F, -220F, -80F);

		bodyModel[93].addBox(25F, -17F, 0F, 10, 4, 10, 0F); // Body95
		bodyModel[93].setRotationPoint(-190.5F, -224F, -80F);

		bodyModel[94].addBox(25F, -17F, 0F, 8, 8, 47, 0F); // Body96
		bodyModel[94].setRotationPoint(-189.5F, -214F, -126F);

		bodyModel[95].addShapeBox(25F, -17F, 0F, 4, 16, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); //Test
		bodyModel[95].setRotationPoint(-181.5F, -214F, -124F);

		bodyModel[96].addShapeBox(25F, -17F, 0F, 4, 16, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); //Test
		bodyModel[96].setRotationPoint(-193.5F, -214F, -124F);

		bodyModel[97].addBox(25F, -17F, 0F, 4, 9, 8, 0F); // Body99
		bodyModel[97].setRotationPoint(-187.5F, -223F, -125F);

		bodyModel[98].addBox(25F, -17F, 0F, 2, 2, 10, 0F); // Body100
		bodyModel[98].setRotationPoint(-186.5F, -222F, -90F);

		bodyModel[99].addBox(25F, -17.5F, 0F, 3, 3, 27, 0F); // Body101
		bodyModel[99].setRotationPoint(-187F, -222F, -117F);


		hipsModel = new ModelRendererTurbo[22];
		hipsModel[0] = new ModelRendererTurbo(this,  1100,  1050, textureX, textureY); // Hips1
		hipsModel[1] = new ModelRendererTurbo(this,  0,  1050, textureX, textureY); // Hips2
		hipsModel[2] = new ModelRendererTurbo(this,  0,  1150, textureX, textureY); // Hips3
		hipsModel[3] = new ModelRendererTurbo(this,  0,  1220, textureX, textureY); // Hips4
		hipsModel[4] = new ModelRendererTurbo(this,  0,  1290, textureX, textureY); // Hips5
		hipsModel[5] = new ModelRendererTurbo(this,  0,  1290, textureX, textureY); // Hips6
		hipsModel[6] = new ModelRendererTurbo(this,  0,  1320, textureX, textureY); // Hips7
		hipsModel[7] = new ModelRendererTurbo(this,  0,  1350, textureX, textureY); // Hips8
		hipsModel[8] = new ModelRendererTurbo(this,  0,  1350, textureX, textureY); // Hips9
		hipsModel[9] = new ModelRendererTurbo(this,  0,  1400, textureX, textureY); // Hips10
		hipsModel[10] = new ModelRendererTurbo(this,  0,  1400, textureX, textureY); // Hips11
		hipsModel[11] = new ModelRendererTurbo(this,  0,  1400, textureX, textureY); // Hips12
		hipsModel[12] = new ModelRendererTurbo(this,  0,  1480, textureX, textureY); // Hips13
		hipsModel[13] = new ModelRendererTurbo(this,  0,  1550, textureX, textureY); // Hips15-
		hipsModel[14] = new ModelRendererTurbo(this,  0,  1600, textureX, textureY); // Hips14
		hipsModel[15] = new ModelRendererTurbo(this,  0,  1600, textureX, textureY); // Hips15
		hipsModel[16] = new ModelRendererTurbo(this,  0,  1650, textureX, textureY); // Hips16
		hipsModel[17] = new ModelRendererTurbo(this,  0,  1480, textureX, textureY); // Hips17
		hipsModel[18] = new ModelRendererTurbo(this,  0,  1550, textureX, textureY); // Hips18
		hipsModel[19] = new ModelRendererTurbo(this,  0,  1600, textureX, textureY); // Hips19
		hipsModel[20] = new ModelRendererTurbo(this,  0,  1600, textureX, textureY); // Hips20
		hipsModel[21] = new ModelRendererTurbo(this,  0,  1650, textureX, textureY); // Hips21

		hipsModel[0].addShapeBox(-96F, 63F, 0F, 20, 50, 54, 0F, 10F, -30F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -30F, -20F, 10F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -20F); //Test
		hipsModel[0].setRotationPoint(-70F, -206F, -27F);

		hipsModel[1].addBox(-96F, 63F, 0F, 118, 25, 54, 0F); // Hips2
		hipsModel[1].setRotationPoint(-50F, -181F, -27F);

		hipsModel[2].addBox(-96F, 63F, 0F, 20, 10, 54, 0F); // Hips3
		hipsModel[2].setRotationPoint(68F, -171F, -27F);

		hipsModel[3].addShapeBox(-96F, 63F, 0F, 20, 5, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -20F, 0F, -4F, -20F, 0F, 0F, 0F); //Test
		hipsModel[3].setRotationPoint(68F, -161F, -27F);

		hipsModel[4].addShapeBox(-96F, 63F, 0F, 20, 10, 8, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		hipsModel[4].setRotationPoint(68F, -181F, -27F);

		hipsModel[5].addShapeBox(-96F, 63F, 0F, 20, 10, 8, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		hipsModel[5].setRotationPoint(68F, -181F, 19F);

		hipsModel[6].addBox(-96F, 63F, 0F, 60, 14, 10, 0F); // Hips7
		hipsModel[6].setRotationPoint(-9F, -156F, -5F);

		hipsModel[7].addBox(-96F, 63F, 0F, 10, 9, 14, 0F); // Hips8
		hipsModel[7].setRotationPoint(-4F, -156F, -7F);

		hipsModel[8].addBox(-96F, 63F, 0F, 10, 9, 14, 0F); // Hips9
		hipsModel[8].setRotationPoint(13F, -156F, -7F);

		hipsModel[9].addShapeBox(-96F, 63F, 0F, 30, 10, 62, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		hipsModel[9].setRotationPoint(-27F, -187F, -31F);

		hipsModel[10].addBox(-96F, 63F, 0F, 30, 10, 62, 0F); // Hips11
		hipsModel[10].setRotationPoint(-27F, -177F, -31F);

		hipsModel[11].addShapeBox(-96F, 63F, 0F, 30, 10, 62, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); //Test
		hipsModel[11].setRotationPoint(-27F, -167F, -31F);

		hipsModel[12].addBox(0F, 0F, 0F, 10, 19, 25, 0F); // Hips13
		hipsModel[12].setRotationPoint(-114F, -118F, 31F);

		hipsModel[13].addBox(0F, 0F, 0F, 2, 26, 18, 0F); // Hips15-
		hipsModel[13].setRotationPoint(-100F, -118F, 34F);

		hipsModel[14].addBox(0F, 0F, 0F, 18, 4, 23, 0F); // Hips14
		hipsModel[14].setRotationPoint(-118F, -114F, 31F);

		hipsModel[15].addBox(0F, 0F, 0F, 18, 4, 23, 0F); // Hips15
		hipsModel[15].setRotationPoint(-118F, -105F, 31F);

		hipsModel[16].addShapeBox(0F, 0F, 0F, 2, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		hipsModel[16].setRotationPoint(-100F, -92F, 34F);

		hipsModel[17].addBox(0F, 0F, 0F, 10, 19, 25, 0F); // Hips17
		hipsModel[17].setRotationPoint(-114F, -118F, -56F);

		hipsModel[18].addBox(0F, 0F, 0F, 2, 26, 18, 0F); // Hips18
		hipsModel[18].setRotationPoint(-100F, -118F, -52F);

		hipsModel[19].addBox(0F, 0F, 0F, 18, 4, 23, 0F); // Hips19
		hipsModel[19].setRotationPoint(-118F, -114F, -54F);

		hipsModel[20].addBox(0F, 0F, 0F, 18, 4, 23, 0F); // Hips20
		hipsModel[20].setRotationPoint(-118F, -105F, -54F);

		hipsModel[21].addShapeBox(0F, 0F, 0F, 2, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		hipsModel[21].setRotationPoint(-100F, -92F, -52F);

		rightLegModel = new ModelRendererTurbo[113];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // RightLeg2
		rightLegModel[2] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // RightLeg3
		rightLegModel[3] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // RightLeg4
		rightLegModel[4] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // RightLeg5
		rightLegModel[5] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // RightLeg6
		rightLegModel[6] = new ModelRendererTurbo(this, 400, 1024, textureX, textureY); // RightLeg7
		rightLegModel[7] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // RightLeg8
		rightLegModel[8] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // RightLeg9
		rightLegModel[9] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // RightLeg10
		rightLegModel[10] = new ModelRendererTurbo(this, 400, 1150, textureX, textureY); // RightLeg11
		rightLegModel[11] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // RightLeg12
		rightLegModel[12] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // RightLeg13
		rightLegModel[13] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // RightLeg14
		rightLegModel[14] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // RightLeg15
		rightLegModel[15] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // RightLeg16
		rightLegModel[16] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // RightLeg17
		rightLegModel[17] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // RightLeg18
		rightLegModel[18] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // RightLeg19
		rightLegModel[19] = new ModelRendererTurbo(this, 400, 1340, textureX, textureY); // RightLeg20
		rightLegModel[20] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // RightLeg21
		rightLegModel[21] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // RightLeg22
		rightLegModel[22] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // RightLeg23
		rightLegModel[23] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // RightLeg24
		rightLegModel[24] = new ModelRendererTurbo(this, 400, 1410, textureX, textureY); // RightLeg25
		rightLegModel[25] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // RightLeg26
		rightLegModel[26] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg27
		rightLegModel[27] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg28
		rightLegModel[28] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg29
		rightLegModel[29] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg30
		rightLegModel[30] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg31
		rightLegModel[31] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg32
		rightLegModel[32] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg33
		rightLegModel[33] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg34
		rightLegModel[34] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // RightLeg35
		rightLegModel[35] = new ModelRendererTurbo(this, 400, 1540, textureX, textureY); // RightLeg36
		rightLegModel[36] = new ModelRendererTurbo(this, 400, 1580, textureX, textureY); // RightLeg37
		rightLegModel[37] = new ModelRendererTurbo(this, 400, 1410, textureX, textureY); // RightLeg38
		rightLegModel[38] = new ModelRendererTurbo(this, 400, 1410, textureX, textureY); // RightLeg39
		rightLegModel[39] = new ModelRendererTurbo(this, 400, 1630, textureX, textureY); // RightLeg40
		rightLegModel[40] = new ModelRendererTurbo(this, 400, 1680, textureX, textureY); // RightLeg41
		rightLegModel[41] = new ModelRendererTurbo(this, 400, 1630, textureX, textureY); // RightLeg42
		rightLegModel[42] = new ModelRendererTurbo(this, 400, 1710, textureX, textureY); // RightLeg43
		rightLegModel[43] = new ModelRendererTurbo(this, 400, 1760, textureX, textureY); // RightLeg44
		rightLegModel[44] = new ModelRendererTurbo(this, 400, 1790, textureX, textureY); // RightLeg45
		rightLegModel[45] = new ModelRendererTurbo(this, 400, 1810, textureX, textureY); // RightLeg46
		rightLegModel[46] = new ModelRendererTurbo(this, 400, 1880, textureX, textureY); // RightLeg47-
		rightLegModel[47] = new ModelRendererTurbo(this, 600, 1000, textureX, textureY); // RightLeg48
		rightLegModel[48] = new ModelRendererTurbo(this, 600, 1060, textureX, textureY); // RightLeg49
		rightLegModel[49] = new ModelRendererTurbo(this, 600, 1130, textureX, textureY); // RightLeg50
		rightLegModel[50] = new ModelRendererTurbo(this, 600, 1190, textureX, textureY); // RightLeg51
		rightLegModel[51] = new ModelRendererTurbo(this, 600, 1240, textureX, textureY); // RightLeg52
		rightLegModel[52] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // RightLeg53
		rightLegModel[53] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // RightLeg54
		rightLegModel[54] = new ModelRendererTurbo(this, 600, 1300, textureX, textureY); // RightLeg55
		rightLegModel[55] = new ModelRendererTurbo(this, 600, 1350, textureX, textureY); // RightLeg56
		rightLegModel[56] = new ModelRendererTurbo(this, 600, 1450, textureX, textureY); // RightLeg57
		rightLegModel[57] = new ModelRendererTurbo(this, 600, 1480, textureX, textureY); // RightLeg58
		rightLegModel[58] = new ModelRendererTurbo(this, 600, 1130, textureX, textureY); // RightLeg59
		rightLegModel[59] = new ModelRendererTurbo(this, 600, 1190, textureX, textureY); // RightLeg60
		rightLegModel[60] = new ModelRendererTurbo(this, 600, 1240, textureX, textureY); // RightLeg61
		rightLegModel[61] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // RightLeg62
		rightLegModel[62] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // RightLeg63
		rightLegModel[63] = new ModelRendererTurbo(this, 600, 1300, textureX, textureY); // RightLeg64
		rightLegModel[64] = new ModelRendererTurbo(this, 600, 1450, textureX, textureY); // RightLeg65
		rightLegModel[65] = new ModelRendererTurbo(this, 600, 1530, textureX, textureY); // RightLeg66
		rightLegModel[66] = new ModelRendererTurbo(this, 600, 1530, textureX, textureY); // RightLeg67
		rightLegModel[67] = new ModelRendererTurbo(this, 600, 1550, textureX, textureY); // RightLeg68
		rightLegModel[68] = new ModelRendererTurbo(this, 600, 1550, textureX, textureY); // RightLeg69
		rightLegModel[69] = new ModelRendererTurbo(this, 600, 1600, textureX, textureY); // RightLeg70
		rightLegModel[70] = new ModelRendererTurbo(this, 600, 1670, textureX, textureY); // RightLeg71
		rightLegModel[71] = new ModelRendererTurbo(this, 600, 1670, textureX, textureY); // RightLeg72
		rightLegModel[72] = new ModelRendererTurbo(this, 600, 1720, textureX, textureY); // RightLeg73
		rightLegModel[73] = new ModelRendererTurbo(this, 600, 1720, textureX, textureY); // RightLeg74
		rightLegModel[74] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg75
		rightLegModel[75] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg76
		rightLegModel[76] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg77
		rightLegModel[77] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg78
		rightLegModel[78] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg79
		rightLegModel[79] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg80
		rightLegModel[80] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // RightLeg81
		rightLegModel[81] = new ModelRendererTurbo(this, 600, 1800, textureX, textureY); // RightLeg82
		rightLegModel[82] = new ModelRendererTurbo(this, 600, 1880, textureX, textureY); // RightLeg83
		rightLegModel[83] = new ModelRendererTurbo(this, 600, 1940, textureX, textureY); // RightLeg84
		rightLegModel[84] = new ModelRendererTurbo(this, 800, 1070, textureX, textureY); // RightLeg85
		rightLegModel[85] = new ModelRendererTurbo(this, 800, 1110, textureX, textureY); // RightLeg86
		rightLegModel[86] = new ModelRendererTurbo(this, 800, 1170, textureX, textureY); // RightLeg87
		rightLegModel[87] = new ModelRendererTurbo(this, 800, 1250, textureX, textureY); // RightLeg88
		rightLegModel[88] = new ModelRendererTurbo(this, 800, 1310, textureX, textureY); // RightLeg89
		rightLegModel[89] = new ModelRendererTurbo(this, 800, 1380, textureX, textureY); // RightLeg90
		rightLegModel[90] = new ModelRendererTurbo(this, 800, 1550, textureX, textureY); // RightLeg91
		rightLegModel[91] = new ModelRendererTurbo(this, 800, 1620, textureX, textureY); // RightLeg92
		rightLegModel[92] = new ModelRendererTurbo(this, 800, 1700, textureX, textureY); // RightLeg93
		rightLegModel[93] = new ModelRendererTurbo(this, 800, 1800, textureX, textureY); // RightLeg94
		rightLegModel[94] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // RightLeg95
		rightLegModel[95] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // RightLeg96
		rightLegModel[96] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // RightLeg97
		rightLegModel[97] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // RightLeg98
		rightLegModel[98] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // RightLeg99
		rightLegModel[99] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // RightLeg100
		rightLegModel[100] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // RightLeg101
		rightLegModel[101] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // RightLeg102
		rightLegModel[102] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // RightLeg103
		rightLegModel[103] = new ModelRendererTurbo(this, 800, 1800, textureX, textureY); // RightLeg104
		rightLegModel[104] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // RightLeg105
		rightLegModel[105] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // RightLeg106
		rightLegModel[106] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // RightLeg107
		rightLegModel[107] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // RightLeg108
		rightLegModel[108] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // RightLeg109
		rightLegModel[109] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // RightLeg110
		rightLegModel[110] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // RightLeg111
		rightLegModel[111] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // RightLeg112
		rightLegModel[112] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // RightLeg113

		rightLegModel[0].addShapeBox(-24F, -20F, -37F, 130, 55, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRightLeg1
		rightLegModel[0].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[0].rotateAngleZ = -0.4886922F;

		rightLegModel[1].addShapeBox(-34F, -20F, -10F, 140, 60, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRightLeg2
		rightLegModel[1].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[1].rotateAngleZ = -0.4886922F;

		rightLegModel[2].addShapeBox(-34F, -30F, -10F, 60, 10, 10, 0F, -6F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg3
		rightLegModel[2].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[2].rotateAngleZ = -0.4886922F;

		rightLegModel[3].addShapeBox(-34F, -20F, -47F, 140, 60, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRightLeg4
		rightLegModel[3].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[3].rotateAngleZ = -0.4886922F;

		rightLegModel[4].addShapeBox(-34F, -30F, -47F, 60, 10, 10, 0F, -6F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg5
		rightLegModel[4].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[4].rotateAngleZ = -0.4886922F;

		rightLegModel[5].addBox(61.3F, -89F, -46.9F, 45, 40, 47, 0F); // RightLeg6
		rightLegModel[5].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[5].rotateAngleZ = -1.27409F;

		rightLegModel[6].addShapeBox(96F, 12F, -47.1F, 42, 20, 47, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); //Test RightLeg7
		rightLegModel[6].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[6].rotateAngleZ = -0.4886922F;

		rightLegModel[7].addBox(65.3F, -91F, -19.9F, 10, 3, 20, 0F); // RightLeg8
		rightLegModel[7].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[7].rotateAngleZ = -1.27409F;

		rightLegModel[8].addBox(92.3F, -91F, -19.9F, 10, 3, 20, 0F); // RightLeg9
		rightLegModel[8].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[8].rotateAngleZ = -1.27409F;

		rightLegModel[9].addBox(79.3F, -91F, -45.9F, 10, 3, 20, 0F); // RightLeg10
		rightLegModel[9].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[9].rotateAngleZ = -1.27409F;

		rightLegModel[10].addBox(107F, 18F, -48F, 32, 13, 15, 0F); // RightLeg11
		rightLegModel[10].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[10].rotateAngleZ = -0.4886922F;

		rightLegModel[11].addShapeBox(96F, 32F, -10.1F, 42, 8, 10, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); //Test RightLeg12
		rightLegModel[11].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[11].rotateAngleZ = -0.4886922F;

		rightLegModel[12].addShapeBox(106F, 32F, -47F, 32, 8, 10, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); //Test RightLeg13
		rightLegModel[12].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[12].rotateAngleZ = -0.4886922F;

		rightLegModel[13].addShapeBox(84F, 40F, -10.1F, 54, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); //TestRightLeg14
		rightLegModel[13].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[13].rotateAngleZ = -0.4886922F;

		rightLegModel[14].addShapeBox(84F, 40F, -47F, 54, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); //Test RightLeg15
		rightLegModel[14].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[14].rotateAngleZ = -0.4886922F;

		rightLegModel[15].addShapeBox(18F, 40F, -42F, 24, 7, 5, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg16
		rightLegModel[15].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[15].rotateAngleZ = -0.4886922F;

		rightLegModel[16].addBox(42F, 40F, -42F, 41, 5, 5, 0F); // RightLeg17
		rightLegModel[16].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[16].rotateAngleZ = -0.4886922F;

		rightLegModel[17].addBox(42F, 40F, -10F, 41, 5, 5, 0F); // RightLeg18
		rightLegModel[17].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[17].rotateAngleZ = -0.4886922F;

		rightLegModel[18].addShapeBox(18F, 40F, -10F, 24, 7, 5, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg19
		rightLegModel[18].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[18].rotateAngleZ = -0.4886922F;

		rightLegModel[19].addBox(-25F, -17F, -31F, 1, 14, 16, 0F); // RightLeg20
		rightLegModel[19].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[19].rotateAngleZ = -0.4886922F;

		rightLegModel[20].addBox(-26F, -17F, -31F, 1, 2, 16, 0F); // RightLeg21
		rightLegModel[20].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[20].rotateAngleZ = -0.4886922F;

		rightLegModel[21].addBox(-26F, -13F, -31F, 1, 2, 16, 0F); // RightLeg22
		rightLegModel[21].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[21].rotateAngleZ = -0.4886922F;

		rightLegModel[22].addBox(-26F, -9F, -31F, 1, 2, 16, 0F); // RightLeg23
		rightLegModel[22].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[22].rotateAngleZ = -0.4886922F;

		rightLegModel[23].addBox(-26F, -5F, -31F, 1, 2, 16, 0F); // RightLeg24
		rightLegModel[23].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[23].rotateAngleZ = -0.4886922F;

		rightLegModel[24].addBox(-20F, 4F, -53F, 24, 8, 6, 0F); // RightLeg25
		rightLegModel[24].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[24].rotateAngleZ = -0.4886922F;

		rightLegModel[25].addShapeBox(76F, -9F, -48F, 20, 40, 1, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); //TestRightLeg26
		rightLegModel[25].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[25].rotateAngleZ = -0.4886922F;

		rightLegModel[26].addShapeBox(79.3F, -96F, -49.9F, 9, 29, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test RightLeg27
		rightLegModel[26].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[26].rotateAngleZ = -1.27409F;

		rightLegModel[27].addBox(79.3F, -96F, -52.9F, 9, 29, 3, 0F); // RightLeg28
		rightLegModel[27].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[27].rotateAngleZ = -1.27409F;

		rightLegModel[28].addShapeBox(79.3F, -96F, -55.9F, 9, 29, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg29
		rightLegModel[28].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[28].rotateAngleZ = -1.27409F;

		rightLegModel[29].addShapeBox(92.3F, -96F, -49.9F, 9, 29, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test RightLeg30
		rightLegModel[29].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[29].rotateAngleZ = -1.27409F;

		rightLegModel[30].addBox(92.3F, -96F, -52.9F, 9, 29, 3, 0F); // RightLeg31
		rightLegModel[30].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[30].rotateAngleZ = -1.27409F;

		rightLegModel[31].addShapeBox(92.3F, -96F, -55.9F, 9, 29, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg32
		rightLegModel[31].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[31].rotateAngleZ = -1.27409F;

		rightLegModel[32].addShapeBox(66.3F, -96F, -49.9F, 9, 29, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test RightLeg33
		rightLegModel[32].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[32].rotateAngleZ = -1.27409F;

		rightLegModel[33].addBox(66.3F, -96F, -52.9F, 9, 29, 3, 0F); // RightLeg34
		rightLegModel[33].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[33].rotateAngleZ = -1.27409F;

		rightLegModel[34].addShapeBox(66.3F, -96F, -55.9F, 9, 29, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg35
		rightLegModel[34].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[34].rotateAngleZ = -1.27409F;

		rightLegModel[35].addShapeBox(34F, -21F, -37F, 60, 1, 27, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); //TestRightLeg36
		rightLegModel[35].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[35].rotateAngleZ = -0.4886922F;

		rightLegModel[36].addBox(16F, -9F, -48F, 60, 40, 1, 0F); // RightLeg37
		rightLegModel[36].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[36].rotateAngleZ = -0.4886922F;

		rightLegModel[37].addShapeBox(-20F, 12F, -53F, 24, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); //Test RightLeg38
		rightLegModel[37].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[37].rotateAngleZ = -0.4886922F;

		rightLegModel[38].addShapeBox(-20F, -4F, -53F, 24, 8, 6, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg39
		rightLegModel[38].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[38].rotateAngleZ = -0.4886922F;

		rightLegModel[39].addBox(-25F, -3F, -55F, 10, 33, 9, 0F); // RightLeg40
		rightLegModel[39].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[39].rotateAngleZ = -0.8726646F;

		rightLegModel[40].addBox(-25F, 30F, -55F, 40, 10, 9, 0F); // RightLeg41
		rightLegModel[40].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[40].rotateAngleZ = -0.8726646F;

		rightLegModel[41].addBox(5F, -3F, -55F, 10, 33, 9, 0F); // RightLeg42
		rightLegModel[41].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[41].rotateAngleZ = -0.8726646F;

		rightLegModel[42].addShapeBox(-25F, -3F, -60F, 40, 33, 5, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg43
		rightLegModel[42].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[42].rotateAngleZ = -0.8726646F;

		rightLegModel[43].addBox(-11F, 7F, -55F, 10, 10, 9, 0F); // RightLeg44
		rightLegModel[43].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[43].rotateAngleZ = -0.8726646F;

		rightLegModel[44].addBox(-25F, 30F, -60F, 40, 10, 5, 0F); // RightLeg45
		rightLegModel[44].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[44].rotateAngleZ = -0.8726646F;

		rightLegModel[45].addShapeBox(-25F, 40F, -55F, 40, 42, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); //Test RightLeg46
		rightLegModel[45].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[45].rotateAngleZ = -0.8726646F;

		rightLegModel[46].addShapeBox(-25F, 40F, -60F, 40, 42, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); //Test RightLeg47-
		rightLegModel[46].setRotationPoint(-109F, -108F, -63F);
		rightLegModel[46].rotateAngleZ = -0.8726646F;

		rightLegModel[47].addShapeBox(23F, 44F, -42F, 145, 12, 37, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg48
		rightLegModel[47].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[47].rotateAngleZ = -0.8377581F;

		rightLegModel[48].addShapeBox(23F, 56F, -42F, 60, 24, 37, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); //Test RightLeg49
		rightLegModel[48].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[48].rotateAngleZ = -0.8377581F;

		rightLegModel[49].addShapeBox(68F, 56F, -10F, 15, 42, 5, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRightLeg50
		rightLegModel[49].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[49].rotateAngleZ = -0.8377581F;

		rightLegModel[50].addBox(83F, 56F, -10F, 84, 32, 5, 0F); // RightLeg51
		rightLegModel[50].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[50].rotateAngleZ = -0.8377581F;

		rightLegModel[51].addBox(83F, 88F, -10F, 84, 10, 2, 0F); // RightLeg52
		rightLegModel[51].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[51].rotateAngleZ = -0.8377581F;

		rightLegModel[52].addBox(96F, 88F, -9F, 4, 11, 2, 0F); // RightLeg53
		rightLegModel[52].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[52].rotateAngleZ = -0.8377581F;

		rightLegModel[53].addBox(144F, 88F, -9F, 4, 11, 2, 0F); // RightLeg54
		rightLegModel[53].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[53].rotateAngleZ = -0.8377581F;

		rightLegModel[54].addBox(167F, 56F, -10F, 20, 42, 5, 0F); // RightLeg55
		rightLegModel[54].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[54].rotateAngleZ = -0.8377581F;

		rightLegModel[55].addBox(187F, 56F, -52F, 44, 42, 47, 0F); // RightLeg56
		rightLegModel[55].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[55].rotateAngleZ = -0.8377581F;

		rightLegModel[56].addShapeBox(187F, 46F, -15F, 15, 10, 10, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg57
		rightLegModel[56].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[56].rotateAngleZ = -0.8377581F;

		rightLegModel[57].addBox(83F, 65F, -42F, 105, 4, 37, 0F); // RightLeg58
		rightLegModel[57].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[57].rotateAngleZ = -0.8377581F;

		rightLegModel[58].addShapeBox(68F, 56F, -52F, 15, 42, 5, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg59
		rightLegModel[58].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[58].rotateAngleZ = -0.8377581F;

		rightLegModel[59].addBox(83F, 56F, -52F, 84, 32, 5, 0F); // RightLeg60
		rightLegModel[59].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[59].rotateAngleZ = -0.8377581F;

		rightLegModel[60].addBox(83F, 88F, -49F, 84, 10, 2, 0F); // RightLeg61
		rightLegModel[60].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[60].rotateAngleZ = -0.8377581F;

		rightLegModel[61].addBox(96F, 88F, -50F, 4, 11, 2, 0F); // RightLeg62
		rightLegModel[61].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[61].rotateAngleZ = -0.8377581F;

		rightLegModel[62].addBox(144F, 88F, -50F, 4, 11, 2, 0F); // RightLeg63
		rightLegModel[62].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[62].rotateAngleZ = -0.8377581F;

		rightLegModel[63].addBox(167F, 56F, -52F, 20, 42, 5, 0F); // RightLeg64
		rightLegModel[63].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[63].rotateAngleZ = -0.8377581F;

		rightLegModel[64].addShapeBox(187F, 46F, -52F, 15, 10, 10, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg65
		rightLegModel[64].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[64].rotateAngleZ = -0.8377581F;

		rightLegModel[65].addBox(83F, 61F, -18F, 105, 4, 6, 0F); // RightLeg66
		rightLegModel[65].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[65].rotateAngleZ = -0.8377581F;

		rightLegModel[66].addBox(83F, 61F, -35F, 105, 4, 6, 0F); // RightLeg67
		rightLegModel[66].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[66].rotateAngleZ = -0.8377581F;

		rightLegModel[67].addBox(178F, 59F, -36F, 10, 5, 8, 0F); // RightLeg68
		rightLegModel[67].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[67].rotateAngleZ = -0.8377581F;

		rightLegModel[68].addBox(178F, 59F, -20F, 10, 5, 8, 0F); // RightLeg69
		rightLegModel[68].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[68].rotateAngleY = 0.01745329F;
		rightLegModel[68].rotateAngleZ = -0.8377581F;

		rightLegModel[69].addBox(126F, 69F, -42F, 40, 22, 37, 0F); // RightLeg70
		rightLegModel[69].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[69].rotateAngleZ = -0.8377581F;

		rightLegModel[70].addBox(126F, 91F, -42F, 5, 3, 37, 0F); // RightLeg71
		rightLegModel[70].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[70].rotateAngleZ = -0.8377581F;

		rightLegModel[71].addBox(159F, 91F, -42F, 5, 3, 37, 0F); // RightLeg72
		rightLegModel[71].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[71].rotateAngleZ = -0.8377581F;

		rightLegModel[72].addBox(131F, 91F, -10F, 28, 3, 5, 0F); // RightLeg73
		rightLegModel[72].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[72].rotateAngleZ = -0.8377581F;

		rightLegModel[73].addBox(131F, 91F, -42F, 28, 3, 5, 0F); // RightLeg74
		rightLegModel[73].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[73].rotateAngleZ = -0.8377581F;

		rightLegModel[74].addBox(133F, 91F, -37F, 2, 2, 27, 0F); // RightLeg75
		rightLegModel[74].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[74].rotateAngleZ = -0.8377581F;

		rightLegModel[75].addBox(137F, 91F, -37F, 2, 2, 27, 0F); // RightLeg76
		rightLegModel[75].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[75].rotateAngleZ = -0.8377581F;

		rightLegModel[76].addBox(141F, 91F, -37F, 2, 2, 27, 0F); // RightLeg77
		rightLegModel[76].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[76].rotateAngleZ = -0.8377581F;

		rightLegModel[77].addBox(145F, 91F, -37F, 2, 2, 27, 0F); // RightLeg78
		rightLegModel[77].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[77].rotateAngleZ = -0.8377581F;

		rightLegModel[78].addBox(149F, 91F, -37F, 2, 2, 27, 0F); // RightLeg79
		rightLegModel[78].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[78].rotateAngleZ = -0.8377581F;

		rightLegModel[79].addBox(153F, 91F, -37F, 2, 2, 27, 0F); // RightLeg80
		rightLegModel[79].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[79].rotateAngleZ = -0.8377581F;

		rightLegModel[80].addBox(157F, 91F, -37F, 2, 2, 27, 0F); // RightLeg81
		rightLegModel[80].setRotationPoint(-110F, -108F, -56F);
		rightLegModel[80].rotateAngleZ = -0.8377581F;

		rightLegModel[81].addBox(81.9F, 208.6F, -51.9F, 31, 30, 47, 0F); // RightLeg82
		rightLegModel[81].setRotationPoint(-109F, -108F, -51F);

		rightLegModel[82].addBox(66.7F, 209F, -38.5F, 20, 17, 20, 0F); // RightLeg83
		rightLegModel[82].setRotationPoint(-117F, -108F, -51F);

		rightLegModel[83].addShapeBox(60.7F, 238F, -48.5F, 60, 7, 40, 0F, 5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, -5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); //Test RightLeg84
		rightLegModel[83].setRotationPoint(-117F, -108F, -51F);

		rightLegModel[84].addBox(68.2F, 226F, -36F, 15, 12, 15, 0F); // RightLeg85
		rightLegModel[84].setRotationPoint(-117F, -108F, -51F);

		rightLegModel[85].addBox(36F, 81F, -41F, 60, 12, 36, 0F); // RightLeg86
		rightLegModel[85].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[85].rotateAngleZ = -0.8377581F;

		rightLegModel[86].addShapeBox(26F, 81F, -41F, 10, 30, 36, 0F, 0F, -10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, -10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F); //Test RightLeg87
		rightLegModel[86].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[86].rotateAngleZ = -0.8377581F;

		rightLegModel[87].addShapeBox(36F, 93F, -41F, 27, 18, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg88
		rightLegModel[87].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[87].rotateAngleZ = -0.8377581F;

		rightLegModel[88].addShapeBox(48F, 82F, -39F, 70, 29, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); //Test RightLeg89
		rightLegModel[88].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[88].rotateAngleZ = -0.8377581F;

		rightLegModel[89].addShapeBox(118F, 82F, -39F, 10, 29, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -10F, 0F); //Test RightLeg90
		rightLegModel[89].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[89].rotateAngleZ = -0.8377581F;

		rightLegModel[90].addBox(39F, 65F, -37F, 30, 24, 27, 0F); // RightLeg91
		rightLegModel[90].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[90].rotateAngleZ = -0.8377581F;

		rightLegModel[91].addBox(27F, 32F, -37F, 90, 27, 27, 0F); // RightLeg92
		rightLegModel[91].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[91].rotateAngleZ = -0.4886922F;

		rightLegModel[92].addShapeBox(27F, 59F, -37F, 90, 23, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); //Test RightLeg93
		rightLegModel[92].setRotationPoint(-109F, -108F, -56F);
		rightLegModel[92].rotateAngleZ = -0.4886922F;


		rightLegModel[93].addBox(108.7F, 198F, -13.9F, 5, 10, 8, 0F); // RightLeg94
		rightLegModel[93].setRotationPoint(-109F, -108F, -51F);

		rightLegModel[94].addShapeBox(16.7F, 227F, -14.4F, 3, 23, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //Test RightLeg95
		rightLegModel[94].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[94].rotateAngleZ = 0.4363323F;

		rightLegModel[95].addBox(19.7F, 227F, -14.4F, 3, 23, 9, 0F); // RightLeg96
		rightLegModel[95].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[95].rotateAngleZ = 0.4363323F;

		rightLegModel[96].addShapeBox(22.7F, 227F, -14.4F, 3, 23, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); //TestRightLeg97
		rightLegModel[96].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[96].rotateAngleZ = 0.4363323F;

		rightLegModel[97].addBox(20.2F, 250F, -12.9F, 2, 23, 6, 0F); // RightLeg98
		rightLegModel[97].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[97].rotateAngleZ = 0.4363323F;

		rightLegModel[98].addShapeBox(18.2F, 250F, -12.9F, 2, 23, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //TestRightLeg99
		rightLegModel[98].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[98].rotateAngleZ = 0.4363323F;

		rightLegModel[99].addShapeBox(22.2F, 250F, -12.9F, 2, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); //Test RightLeg100
		rightLegModel[99].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[99].rotateAngleZ = 0.4363323F;

		rightLegModel[100].addShapeBox(22.2F, 273F, -12.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); //TestRightLeg101
		rightLegModel[100].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[100].rotateAngleZ = 0.4363323F;

		rightLegModel[101].addShapeBox(20.2F, 273F, -12.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test RightLeg102
		rightLegModel[101].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[101].rotateAngleZ = 0.4363323F;

		rightLegModel[102].addShapeBox(18.2F, 273F, -12.9F, 2, 5, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); //Test RightLeg103
		rightLegModel[102].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[102].rotateAngleZ = 0.4363323F;

		rightLegModel[103].addBox(108.7F, 198F, -50.9F, 5, 10, 8, 0F); // RightLeg104
		rightLegModel[103].setRotationPoint(-109F, -108F, -51F);

		rightLegModel[104].addShapeBox(16.7F, 227F, -51.4F, 3, 23, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //Test RightLeg105
		rightLegModel[104].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[104].rotateAngleZ = 0.4363323F;

		rightLegModel[105].addBox(19.7F, 227F, -51.4F, 3, 23, 9, 0F); // RightLeg106
		rightLegModel[105].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[105].rotateAngleZ = 0.4363323F;

		rightLegModel[106].addShapeBox(22.7F, 227F, -51.4F, 3, 23, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); //TestRightLeg107
		rightLegModel[106].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[106].rotateAngleZ = 0.4363323F;

		rightLegModel[107].addBox(20.2F, 250F, -50.9F, 2, 23, 6, 0F); // RightLeg108
		rightLegModel[107].setRotationPoint(-109F, -108F, -50F);
		rightLegModel[107].rotateAngleZ = 0.4363323F;

		rightLegModel[108].addShapeBox(18.2F, 250F, -49.9F, 2, 23, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //TestRightLeg109
		rightLegModel[108].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[108].rotateAngleZ = 0.4363323F;

		rightLegModel[109].addShapeBox(22.2F, 250F, -49.9F, 2, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); //Test RightLeg110
		rightLegModel[109].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[109].rotateAngleZ = 0.4363323F;

		rightLegModel[110].addShapeBox(22.2F, 273F, -49.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); //TestRightLeg111
		rightLegModel[110].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[110].rotateAngleZ = 0.4363323F;

		rightLegModel[111].addShapeBox(20.2F, 273F, -49.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test RightLeg112
		rightLegModel[111].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[111].rotateAngleZ = 0.4363323F;

		rightLegModel[112].addShapeBox(18.2F, 273F, -49.9F, 2, 5, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); //Test RightLeg113
		rightLegModel[112].setRotationPoint(-109F, -108F, -51F);
		rightLegModel[112].rotateAngleZ = 0.4363323F;




		leftLegModel = new ModelRendererTurbo[113];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // LeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // LeftLeg2
		leftLegModel[2] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // LeftLeg3
		leftLegModel[3] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // LeftLeg4
		leftLegModel[4] = new ModelRendererTurbo(this, 0, 1880, textureX, textureY); // LeftLeg5
		leftLegModel[5] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // LeftLeg6
		leftLegModel[6] = new ModelRendererTurbo(this, 400, 1024, textureX, textureY); // LeftLeg7
		leftLegModel[7] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // LeftLeg8
		leftLegModel[8] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // LeftLeg9
		leftLegModel[9] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // LeftLeg10
		leftLegModel[10] = new ModelRendererTurbo(this, 400, 1150, textureX, textureY); // LeftLeg11
		leftLegModel[11] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // LeftLeg12
		leftLegModel[12] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // LeftLeg13
		leftLegModel[13] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // LeftLeg14
		leftLegModel[14] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // LeftLeg15
		leftLegModel[15] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // LeftLeg16
		leftLegModel[16] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // LeftLeg17
		leftLegModel[17] = new ModelRendererTurbo(this, 400, 1320, textureX, textureY); // LeftLeg18
		leftLegModel[18] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // LeftLeg19
		leftLegModel[19] = new ModelRendererTurbo(this, 400, 1340, textureX, textureY); // LeftLeg20
		leftLegModel[20] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // LeftLeg21
		leftLegModel[21] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // LeftLeg22
		leftLegModel[22] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // LeftLeg23
		leftLegModel[23] = new ModelRendererTurbo(this, 400, 1380, textureX, textureY); // LeftLeg24
		leftLegModel[24] = new ModelRendererTurbo(this, 400, 1410, textureX, textureY); // LeftLeg25
		leftLegModel[25] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // LeftLeg26
		leftLegModel[26] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg27
		leftLegModel[27] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg28
		leftLegModel[28] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg29
		leftLegModel[29] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg30
		leftLegModel[30] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg31
		leftLegModel[31] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg32
		leftLegModel[32] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg33
		leftLegModel[33] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg34
		leftLegModel[34] = new ModelRendererTurbo(this, 400, 1500, textureX, textureY); // LeftLeg35
		leftLegModel[35] = new ModelRendererTurbo(this, 400, 1540, textureX, textureY); // LeftLeg36
		leftLegModel[36] = new ModelRendererTurbo(this, 400, 1580, textureX, textureY); // LeftLeg37
		leftLegModel[37] = new ModelRendererTurbo(this, 400, 1410, textureX, textureY); // LeftLeg38
		leftLegModel[38] = new ModelRendererTurbo(this, 400, 1410, textureX, textureY); // LeftLeg39
		leftLegModel[39] = new ModelRendererTurbo(this, 400, 1630, textureX, textureY); // LeftLeg40
		leftLegModel[40] = new ModelRendererTurbo(this, 400, 1680, textureX, textureY); // LeftLeg41
		leftLegModel[41] = new ModelRendererTurbo(this, 400, 1630, textureX, textureY); // LeftLeg42
		leftLegModel[42] = new ModelRendererTurbo(this, 400, 1710, textureX, textureY); // LeftLeg43
		leftLegModel[43] = new ModelRendererTurbo(this, 400, 1760, textureX, textureY); // LeftLeg44
		leftLegModel[44] = new ModelRendererTurbo(this, 400, 1790, textureX, textureY); // LeftLeg45
		leftLegModel[45] = new ModelRendererTurbo(this, 400, 1810, textureX, textureY); // LeftLeg46
		leftLegModel[46] = new ModelRendererTurbo(this, 400, 1880, textureX, textureY); // LeftLeg47-
		leftLegModel[47] = new ModelRendererTurbo(this, 600, 1000, textureX, textureY); // LeftLeg48
		leftLegModel[48] = new ModelRendererTurbo(this, 600, 1060, textureX, textureY); // LeftLeg49
		leftLegModel[49] = new ModelRendererTurbo(this, 600, 1130, textureX, textureY); // LeftLeg50
		leftLegModel[50] = new ModelRendererTurbo(this, 600, 1190, textureX, textureY); // LeftLeg51
		leftLegModel[51] = new ModelRendererTurbo(this, 600, 1240, textureX, textureY); // LeftLeg52
		leftLegModel[52] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // LeftLeg53
		leftLegModel[53] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // LeftLeg54
		leftLegModel[54] = new ModelRendererTurbo(this, 600, 1300, textureX, textureY); // LeftLeg55
		leftLegModel[55] = new ModelRendererTurbo(this, 600, 1350, textureX, textureY); // LeftLeg56
		leftLegModel[56] = new ModelRendererTurbo(this, 600, 1450, textureX, textureY); // LeftLeg57
		leftLegModel[57] = new ModelRendererTurbo(this, 600, 1480, textureX, textureY); // LeftLeg58
		leftLegModel[58] = new ModelRendererTurbo(this, 600, 1130, textureX, textureY); // LeftLeg59
		leftLegModel[59] = new ModelRendererTurbo(this, 600, 1190, textureX, textureY); // LeftLeg60
		leftLegModel[60] = new ModelRendererTurbo(this, 600, 1240, textureX, textureY); // LeftLeg61
		leftLegModel[61] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // LeftLeg62
		leftLegModel[62] = new ModelRendererTurbo(this, 600, 1260, textureX, textureY); // LeftLeg63
		leftLegModel[63] = new ModelRendererTurbo(this, 600, 1300, textureX, textureY); // LeftLeg64
		leftLegModel[64] = new ModelRendererTurbo(this, 600, 1450, textureX, textureY); // LeftLeg65
		leftLegModel[65] = new ModelRendererTurbo(this, 600, 1530, textureX, textureY); // LeftLeg66
		leftLegModel[66] = new ModelRendererTurbo(this, 600, 1530, textureX, textureY); // LeftLeg67
		leftLegModel[67] = new ModelRendererTurbo(this, 600, 1550, textureX, textureY); // LeftLeg68
		leftLegModel[68] = new ModelRendererTurbo(this, 600, 1550, textureX, textureY); // LeftLeg69
		leftLegModel[69] = new ModelRendererTurbo(this, 600, 1600, textureX, textureY); // LeftLeg70
		leftLegModel[70] = new ModelRendererTurbo(this, 600, 1670, textureX, textureY); // LeftLeg71
		leftLegModel[71] = new ModelRendererTurbo(this, 600, 1670, textureX, textureY); // LeftLeg72
		leftLegModel[72] = new ModelRendererTurbo(this, 600, 1720, textureX, textureY); // LeftLeg73
		leftLegModel[73] = new ModelRendererTurbo(this, 600, 1720, textureX, textureY); // LeftLeg74
		leftLegModel[74] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg75
		leftLegModel[75] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg76
		leftLegModel[76] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg77
		leftLegModel[77] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg78
		leftLegModel[78] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg79
		leftLegModel[79] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg80
		leftLegModel[80] = new ModelRendererTurbo(this, 600, 1740, textureX, textureY); // LeftLeg81
		leftLegModel[81] = new ModelRendererTurbo(this, 600, 1800, textureX, textureY); // LeftLeg82
		leftLegModel[82] = new ModelRendererTurbo(this, 600, 1880, textureX, textureY); // LeftLeg83
		leftLegModel[83] = new ModelRendererTurbo(this, 600, 1940, textureX, textureY); // LeftLeg84
		leftLegModel[84] = new ModelRendererTurbo(this, 800, 1070, textureX, textureY); // LeftLeg85
		leftLegModel[85] = new ModelRendererTurbo(this, 800, 1110, textureX, textureY); // LeftLeg86
		leftLegModel[86] = new ModelRendererTurbo(this, 800, 1170, textureX, textureY); // LeftLeg87
		leftLegModel[87] = new ModelRendererTurbo(this, 800, 1250, textureX, textureY); // LeftLeg88
		leftLegModel[88] = new ModelRendererTurbo(this, 800, 1310, textureX, textureY); // LeftLeg89
		leftLegModel[89] = new ModelRendererTurbo(this, 800, 1380, textureX, textureY); // LeftLeg90
		leftLegModel[90] = new ModelRendererTurbo(this, 800, 1550, textureX, textureY); // LeftLeg91
		leftLegModel[91] = new ModelRendererTurbo(this, 800, 1620, textureX, textureY); // LeftLeg92
		leftLegModel[92] = new ModelRendererTurbo(this, 800, 1700, textureX, textureY); // LeftLeg93
		leftLegModel[93] = new ModelRendererTurbo(this, 800, 1800, textureX, textureY); // LeftLeg94
		leftLegModel[94] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // LeftLeg95
		leftLegModel[95] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // LeftLeg96
		leftLegModel[96] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // LeftLeg97
		leftLegModel[97] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // LeftLeg98
		leftLegModel[98] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // LeftLeg99
		leftLegModel[99] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // LeftLeg100
		leftLegModel[100] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // LeftLeg101
		leftLegModel[101] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // LeftLeg102
		leftLegModel[102] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // LeftLeg103
		leftLegModel[103] = new ModelRendererTurbo(this, 800, 1800, textureX, textureY); // LeftLeg104
		leftLegModel[104] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // LeftLeg105
		leftLegModel[105] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // LeftLeg106
		leftLegModel[106] = new ModelRendererTurbo(this, 800, 1850, textureX, textureY); // LeftLeg107
		leftLegModel[107] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // LeftLeg108
		leftLegModel[108] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // LeftLeg109
		leftLegModel[109] = new ModelRendererTurbo(this, 800, 1900, textureX, textureY); // LeftLeg110
		leftLegModel[110] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // LeftLeg111
		leftLegModel[111] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // LeftLeg112
		leftLegModel[112] = new ModelRendererTurbo(this, 900, 1800, textureX, textureY); // LeftLeg113

		leftLegModel[0].addShapeBox(-24F, -20F, 10F, 130, 55, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestLeftLeg1
		leftLegModel[0].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[0].rotateAngleZ = -0.4886922F;

		leftLegModel[1].addShapeBox(-34F, -20F, 0F, 140, 60, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestLeftLeg2
		leftLegModel[1].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[1].rotateAngleZ = -0.4886922F;

		leftLegModel[2].addShapeBox(-34F, -30F, 0F, 60, 10, 10, 0F, -6F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg3
		leftLegModel[2].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[2].rotateAngleZ = -0.4886922F;

		leftLegModel[3].addShapeBox(-34F, -20F, 37F, 140, 60, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestLeftLeg4
		leftLegModel[3].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[3].rotateAngleZ = -0.4886922F;

		leftLegModel[4].addShapeBox(-34F, -30F, 37F, 60, 10, 10, 0F, -6F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg5
		leftLegModel[4].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[4].rotateAngleZ = -0.4886922F;

		leftLegModel[5].addBox(61.3F, -89F, -0.1F, 45, 40, 47, 0F); // LeftLeg6
		leftLegModel[5].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[5].rotateAngleZ = -1.27409F;

		leftLegModel[6].addBox(96F, 12F, 0.1F, 42, 20, 47, 0F); // LeftLeg7
		leftLegModel[6].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[6].rotateAngleZ = -0.4886922F;

		leftLegModel[7].addBox(65.3F, -91F, -0.1F, 10, 3, 20, 0F); // LeftLeg8
		leftLegModel[7].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[7].rotateAngleZ = -1.27409F;

		leftLegModel[8].addBox(92.3F, -91F, -0.1F, 10, 3, 20, 0F); // LeftLeg9
		leftLegModel[8].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[8].rotateAngleZ = -1.27409F;

		leftLegModel[9].addBox(79.3F, -91F, 25.9F, 10, 3, 20, 0F); // LeftLeg10
		leftLegModel[9].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[9].rotateAngleZ = -1.27409F;

		leftLegModel[10].addBox(107F, 18F, 33F, 32, 13, 15, 0F); // LeftLeg11
		leftLegModel[10].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[10].rotateAngleZ = -0.4886922F;

		leftLegModel[11].addShapeBox(96F, 32F, 0.1F, 42, 8, 10, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); //Test LeftLeg12
		leftLegModel[11].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[11].rotateAngleZ = -0.4886922F;

		leftLegModel[12].addShapeBox(106F, 32F, 37F, 32, 8, 10, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); //Test LeftLeg13
		leftLegModel[12].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[12].rotateAngleZ = -0.4886922F;

		leftLegModel[13].addShapeBox(84F, 40F, 0.1F, 54, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); //Test LeftLeg14
		leftLegModel[13].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[13].rotateAngleZ = -0.4886922F;

		leftLegModel[14].addShapeBox(84F, 40F, 37F, 54, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); //Test LeftLeg15
		leftLegModel[14].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[14].rotateAngleZ = -0.4886922F;

		leftLegModel[15].addShapeBox(18F, 40F, 37F, 24, 7, 5, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg16
		leftLegModel[15].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[15].rotateAngleZ = -0.4886922F;

		leftLegModel[16].addBox(42F, 40F, 37F, 41, 5, 5, 0F); // LeftLeg17
		leftLegModel[16].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[16].rotateAngleZ = -0.4886922F;

		leftLegModel[17].addBox(42F, 40F, 5F, 41, 5, 5, 0F); // LeftLeg18
		leftLegModel[17].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[17].rotateAngleZ = -0.4886922F;

		leftLegModel[18].addShapeBox(18F, 40F, 5F, 24, 7, 5, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg19
		leftLegModel[18].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[18].rotateAngleZ = -0.4886922F;

		leftLegModel[19].addBox(-25F, -17F, 15F, 1, 14, 16, 0F); // LeftLeg20
		leftLegModel[19].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[19].rotateAngleZ = -0.4886922F;

		leftLegModel[20].addBox(-26F, -17F, 15F, 1, 2, 16, 0F); // LeftLeg21
		leftLegModel[20].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[20].rotateAngleZ = -0.4886922F;

		leftLegModel[21].addBox(-26F, -13F, 17F, 1, 2, 16, 0F); // LeftLeg22
		leftLegModel[21].setRotationPoint(-109F, -108F, 54F);
		leftLegModel[21].rotateAngleZ = -0.4886922F;

		leftLegModel[22].addBox(-26F, -9F, 17F, 1, 2, 16, 0F); // LeftLeg23
		leftLegModel[22].setRotationPoint(-109F, -108F, 54F);
		leftLegModel[22].rotateAngleZ = -0.4886922F;

		leftLegModel[23].addBox(-26F, -5F, 17F, 1, 2, 16, 0F); // LeftLeg24
		leftLegModel[23].setRotationPoint(-109F, -108F, 54F);
		leftLegModel[23].rotateAngleZ = -0.4886922F;

		leftLegModel[24].addBox(-20F, 4F, 47F, 24, 8, 6, 0F); // LeftLeg25
		leftLegModel[24].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[24].rotateAngleZ = -0.4886922F;

		leftLegModel[25].addShapeBox(76F, -9F, 47F, 20, 40, 1, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); //TestLeftLeg26
		leftLegModel[25].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[25].rotateAngleZ = -0.4886922F;

		leftLegModel[26].addShapeBox(79.3F, -96F, 46.9F, 9, 29, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg27
		leftLegModel[26].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[26].rotateAngleZ = -1.27409F;

		leftLegModel[27].addBox(79.3F, -96F, 49.9F, 9, 29, 3, 0F); // LeftLeg28
		leftLegModel[27].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[27].rotateAngleZ = -1.27409F;

		leftLegModel[28].addShapeBox(79.3F, -96F, 52.9F, 9, 29, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test LeftLeg29
		leftLegModel[28].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[28].rotateAngleZ = -1.27409F;

		leftLegModel[29].addShapeBox(92.3F, -96F, 46.9F, 9, 29, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg30
		leftLegModel[29].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[29].rotateAngleZ = -1.27409F;

		leftLegModel[30].addBox(92.3F, -96F, 49.9F, 9, 29, 3, 0F); // LeftLeg31
		leftLegModel[30].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[30].rotateAngleZ = -1.27409F;

		leftLegModel[31].addShapeBox(92.3F, -96F, 52.9F, 9, 29, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test LeftLeg32
		leftLegModel[31].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[31].rotateAngleZ = -1.27409F;

		leftLegModel[32].addShapeBox(66.3F, -96F, 46.9F, 9, 29, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg33
		leftLegModel[32].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[32].rotateAngleZ = -1.27409F;

		leftLegModel[33].addBox(66.3F, -96F, 49.9F, 9, 29, 3, 0F); // LeftLeg34
		leftLegModel[33].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[33].rotateAngleZ = -1.27409F;

		leftLegModel[34].addShapeBox(66.3F, -96F, 52.9F, 9, 29, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test LeftLeg35
		leftLegModel[34].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[34].rotateAngleZ = -1.27409F;

		leftLegModel[35].addShapeBox(34F, -21F, 10F, 60, 1, 27, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); //TestLeftLeg36
		leftLegModel[35].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[35].rotateAngleZ = -0.4886922F;

		leftLegModel[36].addBox(16F, -9F, 47F, 60, 40, 1, 0F); // LeftLeg37
		leftLegModel[36].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[36].rotateAngleZ = -0.4886922F;

		leftLegModel[37].addShapeBox(-20F, 12F, 47F, 24, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); //Test LeftLeg38
		leftLegModel[37].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[37].rotateAngleZ = -0.4886922F;

		leftLegModel[38].addShapeBox(-20F, -4F, 47F, 24, 8, 6, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg39
		leftLegModel[38].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[38].rotateAngleZ = -0.4886922F;

		leftLegModel[39].addBox(-25F, -3F, 46F, 10, 33, 9, 0F); // LeftLeg40
		leftLegModel[39].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[39].rotateAngleZ = -0.8726646F;

		leftLegModel[40].addBox(-25F, 30F, 46F, 40, 10, 9, 0F); // LeftLeg41
		leftLegModel[40].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[40].rotateAngleZ = -0.8726646F;

		leftLegModel[41].addBox(5F, -3F, 46F, 10, 33, 9, 0F); // LeftLeg42
		leftLegModel[41].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[41].rotateAngleZ = -0.8726646F;

		leftLegModel[42].addShapeBox(-25F, -3F, 55F, 40, 33, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg43
		leftLegModel[42].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[42].rotateAngleZ = -0.8726646F;

		leftLegModel[43].addBox(-11F, 7F, 46F, 10, 10, 9, 0F); // LeftLeg44
		leftLegModel[43].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[43].rotateAngleZ = -0.8726646F;

		leftLegModel[44].addBox(-25F, 30F, 55F, 40, 10, 5, 0F); // LeftLeg45
		leftLegModel[44].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[44].rotateAngleZ = -0.8726646F;

		leftLegModel[45].addShapeBox(-25F, 40F, 46F, 40, 42, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); //Test LeftLeg46
		leftLegModel[45].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[45].rotateAngleZ = -0.8726646F;

		leftLegModel[46].addShapeBox(-25F, 40F, 55F, 40, 42, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); //Test LeftLeg47-
		leftLegModel[46].setRotationPoint(-109F, -108F, 63F);
		leftLegModel[46].rotateAngleZ = -0.8726646F;

		leftLegModel[47].addShapeBox(23F, 44F, 5F, 145, 12, 37, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg48
		leftLegModel[47].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[47].rotateAngleZ = -0.8377581F;

		leftLegModel[48].addShapeBox(23F, 56F, 5F, 60, 24, 37, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); //Test LeftLeg49
		leftLegModel[48].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[48].rotateAngleZ = -0.8377581F;

		leftLegModel[49].addShapeBox(68F, 56F, 5F, 15, 42, 5, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg50
		leftLegModel[49].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[49].rotateAngleZ = -0.8377581F;

		leftLegModel[50].addBox(83F, 56F, 5F, 84, 32, 5, 0F); // LeftLeg51
		leftLegModel[50].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[50].rotateAngleZ = -0.8377581F;

		leftLegModel[51].addBox(83F, 88F, 8F, 84, 10, 2, 0F); // LeftLeg52
		leftLegModel[51].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[51].rotateAngleZ = -0.8377581F;

		leftLegModel[52].addBox(96F, 88F, 7F, 4, 11, 2, 0F); // LeftLeg53
		leftLegModel[52].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[52].rotateAngleZ = -0.8377581F;

		leftLegModel[53].addBox(144F, 88F, 7F, 4, 11, 2, 0F); // LeftLeg54
		leftLegModel[53].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[53].rotateAngleZ = -0.8377581F;

		leftLegModel[54].addBox(167F, 56F, 5F, 20, 42, 5, 0F); // LeftLeg55
		leftLegModel[54].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[54].rotateAngleZ = -0.8377581F;

		leftLegModel[55].addBox(187F, 56F, 5F, 44, 42, 47, 0F); // LeftLeg56
		leftLegModel[55].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[55].rotateAngleZ = -0.8377581F;

		leftLegModel[56].addShapeBox(187F, 46F, 5F, 15, 10, 10, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg57
		leftLegModel[56].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[56].rotateAngleZ = -0.8377581F;

		leftLegModel[57].addBox(83F, 65F, 5F, 105, 4, 37, 0F); // LeftLeg58
		leftLegModel[57].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[57].rotateAngleZ = -0.8377581F;

		leftLegModel[58].addShapeBox(68F, 56F, 47F, 15, 42, 5, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg59
		leftLegModel[58].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[58].rotateAngleZ = -0.8377581F;

		leftLegModel[59].addBox(83F, 56F, 47F, 84, 32, 5, 0F); // LeftLeg60
		leftLegModel[59].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[59].rotateAngleZ = -0.8377581F;

		leftLegModel[60].addBox(83F, 88F, 47F, 84, 10, 2, 0F); // LeftLeg61
		leftLegModel[60].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[60].rotateAngleZ = -0.8377581F;

		leftLegModel[61].addBox(96F, 88F, 48F, 4, 11, 2, 0F); // LeftLeg62
		leftLegModel[61].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[61].rotateAngleZ = -0.8377581F;

		leftLegModel[62].addBox(144F, 88F, 48F, 4, 11, 2, 0F); // LeftLeg63
		leftLegModel[62].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[62].rotateAngleZ = -0.8377581F;

		leftLegModel[63].addBox(167F, 56F, 47F, 20, 42, 5, 0F); // LeftLeg64
		leftLegModel[63].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[63].rotateAngleZ = -0.8377581F;

		leftLegModel[64].addShapeBox(187F, 46F, 42F, 15, 10, 10, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg65
		leftLegModel[64].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[64].rotateAngleZ = -0.8377581F;

		leftLegModel[65].addBox(83F, 61F, 12F, 105, 4, 6, 0F); // LeftLeg66
		leftLegModel[65].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[65].rotateAngleZ = -0.8377581F;

		leftLegModel[66].addBox(83F, 61F, 29F, 105, 4, 6, 0F); // LeftLeg67
		leftLegModel[66].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[66].rotateAngleZ = -0.8377581F;

		leftLegModel[67].addBox(178F, 59F, 28F, 10, 5, 8, 0F); // LeftLeg68
		leftLegModel[67].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[67].rotateAngleZ = -0.8377581F;

		leftLegModel[68].addBox(178F, 59F, 10F, 10, 5, 8, 0F); // LeftLeg69
		leftLegModel[68].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[68].rotateAngleY = 0.01745329F;
		leftLegModel[68].rotateAngleZ = -0.8377581F;

		leftLegModel[69].addBox(126F, 69F, 5F, 40, 22, 37, 0F); // LeftLeg70
		leftLegModel[69].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[69].rotateAngleZ = -0.8377581F;

		leftLegModel[70].addBox(126F, 91F, 5F, 5, 3, 37, 0F); // LeftLeg71
		leftLegModel[70].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[70].rotateAngleZ = -0.8377581F;

		leftLegModel[71].addBox(159F, 91F, 5F, 5, 3, 37, 0F); // LeftLeg72
		leftLegModel[71].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[71].rotateAngleZ = -0.8377581F;

		leftLegModel[72].addBox(131F, 91F, 5F, 28, 3, 5, 0F); // LeftLeg73
		leftLegModel[72].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[72].rotateAngleZ = -0.8377581F;

		leftLegModel[73].addBox(131F, 91F, 37F, 28, 3, 5, 0F); // LeftLeg74
		leftLegModel[73].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[73].rotateAngleZ = -0.8377581F;

		leftLegModel[74].addBox(133F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg75
		leftLegModel[74].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[74].rotateAngleZ = -0.8377581F;

		leftLegModel[75].addBox(137F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg76
		leftLegModel[75].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[75].rotateAngleZ = -0.8377581F;

		leftLegModel[76].addBox(141F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg77
		leftLegModel[76].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[76].rotateAngleZ = -0.8377581F;

		leftLegModel[77].addBox(145F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg78
		leftLegModel[77].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[77].rotateAngleZ = -0.8377581F;

		leftLegModel[78].addBox(149F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg79
		leftLegModel[78].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[78].rotateAngleZ = -0.8377581F;

		leftLegModel[79].addBox(153F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg80
		leftLegModel[79].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[79].rotateAngleZ = -0.8377581F;

		leftLegModel[80].addBox(157F, 91F, 10F, 2, 2, 27, 0F); // LeftLeg81
		leftLegModel[80].setRotationPoint(-110F, -108F, 56F);
		leftLegModel[80].rotateAngleZ = -0.8377581F;

		leftLegModel[81].addBox(81.9F, 208.6F, 4.9F, 31, 30, 47, 0F); // LeftLeg82
		leftLegModel[81].setRotationPoint(-109F, -108F, 51F);

		leftLegModel[82].addBox(66.7F, 209F, 18.5F, 20, 17, 20, 0F); // LeftLeg83
		leftLegModel[82].setRotationPoint(-117F, -108F, 51F);

		leftLegModel[83].addShapeBox(60.7F, 238F, 8.5F, 60, 7, 40, 0F, 5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, -5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); //Test LeftLeg84
		leftLegModel[83].setRotationPoint(-117F, -108F, 51F);

		leftLegModel[84].addBox(68.2F, 226F, 21F, 15, 12, 15, 0F); // LeftLeg85
		leftLegModel[84].setRotationPoint(-117F, -108F, 51F);

		leftLegModel[85].addBox(36F, 81F, 5F, 60, 12, 36, 0F); // LeftLeg86
		leftLegModel[85].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[85].rotateAngleZ = -0.8377581F;

		leftLegModel[86].addShapeBox(26F, 81F, 5F, 10, 30, 36, 0F, 0F, -10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, -10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F); //Test LeftLeg87
		leftLegModel[86].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[86].rotateAngleZ = -0.8377581F;

		leftLegModel[87].addShapeBox(36F, 93F, 5F, 27, 18, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg88
		leftLegModel[87].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[87].rotateAngleZ = -0.8377581F;

		leftLegModel[88].addShapeBox(48F, 82F, 7F, 70, 29, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); //Test LeftLeg89
		leftLegModel[88].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[88].rotateAngleZ = -0.8377581F;

		leftLegModel[89].addShapeBox(118F, 82F, 7F, 10, 29, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -10F, 0F); //Test LeftLeg90
		leftLegModel[89].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[89].rotateAngleZ = -0.8377581F;

		leftLegModel[90].addBox(39F, 65F, 10F, 30, 24, 27, 0F); // LeftLeg91
		leftLegModel[90].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[90].rotateAngleZ = -0.8377581F;

		leftLegModel[91].addBox(27F, 32F, 10F, 90, 27, 27, 0F); // LeftLeg92
		leftLegModel[91].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[91].rotateAngleZ = -0.4886922F;

		leftLegModel[92].addShapeBox(27F, 59F, 10F, 90, 23, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); //Test LeftLeg93
		leftLegModel[92].setRotationPoint(-109F, -108F, 56F);
		leftLegModel[92].rotateAngleZ = -0.4886922F;

		leftLegModel[93].addBox(108.7F, 198F, 5.9F, 5, 10, 8, 0F); // LeftLeg94
		leftLegModel[93].setRotationPoint(-109F, -108F, 51F);

		leftLegModel[94].addShapeBox(16.7F, 227F, 5.4F, 3, 23, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //Test LeftLeg95
		leftLegModel[94].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[94].rotateAngleZ = 0.4363323F;

		leftLegModel[95].addBox(19.7F, 227F, 5.4F, 3, 23, 9, 0F); // LeftLeg96
		leftLegModel[95].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[95].rotateAngleZ = 0.4363323F;

		leftLegModel[96].addShapeBox(22.7F, 227F, 5.4F, 3, 23, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); //Test LeftLeg97
		leftLegModel[96].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[96].rotateAngleZ = 0.4363323F;

		leftLegModel[97].addBox(20.2F, 250F, 6.9F, 2, 23, 6, 0F); // LeftLeg98
		leftLegModel[97].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[97].rotateAngleZ = 0.4363323F;

		leftLegModel[98].addShapeBox(18.2F, 250F, 6.9F, 2, 23, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //Test LeftLeg99
		leftLegModel[98].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[98].rotateAngleZ = 0.4363323F;

		leftLegModel[99].addShapeBox(22.2F, 250F, 6.9F, 2, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); //Test LeftLeg100
		leftLegModel[99].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[99].rotateAngleZ = 0.4363323F;

		leftLegModel[100].addShapeBox(22.2F, 273F, 6.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); //Test LeftLeg101
		leftLegModel[100].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[100].rotateAngleZ = 0.4363323F;

		leftLegModel[101].addShapeBox(20.2F, 273F, 6.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //TestLeftLeg102
		leftLegModel[101].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[101].rotateAngleZ = 0.4363323F;

		leftLegModel[102].addShapeBox(18.2F, 273F, 6.9F, 2, 5, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); //Test LeftLeg103
		leftLegModel[102].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[102].rotateAngleZ = 0.4363323F;

		leftLegModel[103].addBox(108.7F, 198F, 42.9F, 5, 10, 8, 0F); // LeftLeg104
		leftLegModel[103].setRotationPoint(-109F, -108F, 51F);

		leftLegModel[104].addShapeBox(16.7F, 227F, 42.4F, 3, 23, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //TestLeftLeg105
		leftLegModel[104].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[104].rotateAngleZ = 0.4363323F;

		leftLegModel[105].addBox(19.7F, 227F, 42.4F, 3, 23, 9, 0F); // LeftLeg106
		leftLegModel[105].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[105].rotateAngleZ = 0.4363323F;

		leftLegModel[106].addShapeBox(22.7F, 227F, 42.4F, 3, 23, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); //Test LeftLeg107
		leftLegModel[106].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[106].rotateAngleZ = 0.4363323F;

		leftLegModel[107].addBox(20.2F, 250F, 43.9F, 2, 23, 6, 0F); // LeftLeg108
		leftLegModel[107].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[107].rotateAngleZ = 0.4363323F;

		leftLegModel[108].addShapeBox(18.2F, 250F, 43.9F, 2, 23, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //Test LeftLeg109
		leftLegModel[108].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[108].rotateAngleZ = 0.4363323F;

		leftLegModel[109].addShapeBox(22.2F, 250F, 43.9F, 2, 23, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // LeftLeg110
		leftLegModel[109].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[109].rotateAngleZ = 0.4363323F;

		leftLegModel[110].addShapeBox(22.2F, 273F, 43.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); //TestLeftLeg111
		leftLegModel[110].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[110].rotateAngleZ = 0.4363323F;

		leftLegModel[111].addShapeBox(20.2F, 273F, 43.9F, 2, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test LeftLeg112
		leftLegModel[111].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[111].rotateAngleZ = 0.4363323F;

		leftLegModel[112].addShapeBox(18.2F, 273F, 43.9F, 2, 5, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); //Test LeftLeg113
		leftLegModel[112].setRotationPoint(-109F, -108F, 51F);
		leftLegModel[112].rotateAngleZ = 0.4363323F;



		leftArmModel = new ModelRendererTurbo[53];
		leftArmModel[0] = new ModelRendererTurbo(this,  1300,  0, textureX, textureY); // RIghtArm1
		leftArmModel[1] = new ModelRendererTurbo(this,  1300,  100, textureX, textureY); // RIghtArm2
		leftArmModel[2] = new ModelRendererTurbo(this,  1300,  130, textureX, textureY); // RIghtArm3
		leftArmModel[3] = new ModelRendererTurbo(this,  1300,  130, textureX, textureY); // RIghtArm4
		leftArmModel[4] = new ModelRendererTurbo(this,  1300,  150, textureX, textureY); // RIghtArm5
		leftArmModel[5] = new ModelRendererTurbo(this,  1300,  170, textureX, textureY); // RIghtArm6
		leftArmModel[6] = new ModelRendererTurbo(this,  1300,  170, textureX, textureY); // RIghtArm7
		leftArmModel[7] = new ModelRendererTurbo(this,  1300,  200, textureX, textureY); // RIghtArm8
		leftArmModel[8] = new ModelRendererTurbo(this,  1300,  200, textureX, textureY); // RIghtArm9
		leftArmModel[9] = new ModelRendererTurbo(this,  1300,  230, textureX, textureY); // RIghtArm10
		leftArmModel[10] = new ModelRendererTurbo(this,  1300,  230, textureX, textureY); // RIghtArm11
		leftArmModel[11] = new ModelRendererTurbo(this,  1300,  260, textureX, textureY); // RIghtArm12
		leftArmModel[12] = new ModelRendererTurbo(this,  1300,  310, textureX, textureY); // RIghtArm13
		leftArmModel[13] = new ModelRendererTurbo(this,  1300,  360, textureX, textureY); // RIghtArm14
		leftArmModel[14] = new ModelRendererTurbo(this,  1300,  395, textureX, textureY); // RIghtArm15
		leftArmModel[15] = new ModelRendererTurbo(this,  1300,  440, textureX, textureY); // RIghtArm16
		leftArmModel[16] = new ModelRendererTurbo(this,  1300,  480, textureX, textureY); // RIghtArm17
		leftArmModel[17] = new ModelRendererTurbo(this,  1300,  520, textureX, textureY); // RIghtArm18
		leftArmModel[18] = new ModelRendererTurbo(this,  1300,  560, textureX, textureY); // RIghtArm19
		leftArmModel[19] = new ModelRendererTurbo(this,  1300,  600, textureX, textureY); // RIghtArm20
		leftArmModel[20] = new ModelRendererTurbo(this,  1300,  650, textureX, textureY); // RIghtArm21
		leftArmModel[21] = new ModelRendererTurbo(this,  1300,  650, textureX, textureY); // RIghtArm22
		leftArmModel[22] = new ModelRendererTurbo(this,  1300,  650, textureX, textureY); // RIghtArm23
		leftArmModel[23] = new ModelRendererTurbo(this,  1300,  680, textureX, textureY); // RIghtArm24
		leftArmModel[24] = new ModelRendererTurbo(this,  1300,  700, textureX, textureY); // RIghtArm25
		leftArmModel[25] = new ModelRendererTurbo(this,  1300,  750, textureX, textureY); // RIghtArm26
		leftArmModel[26] = new ModelRendererTurbo(this,  1300,  800, textureX, textureY); // RIghtArm27
		leftArmModel[27] = new ModelRendererTurbo(this,  1300,  840, textureX, textureY); // RIghtArm28
		leftArmModel[28] = new ModelRendererTurbo(this,  1300,  881, textureX, textureY); // RIghtArm29
		leftArmModel[29] = new ModelRendererTurbo(this,  1300,  920, textureX, textureY); // RIghtArm30
		leftArmModel[30] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm34
		leftArmModel[31] = new ModelRendererTurbo(this,  1300,  920, textureX, textureY); // RIghtArm31
		leftArmModel[32] = new ModelRendererTurbo(this,  1300,  940, textureX, textureY); // RIghtArm32
		leftArmModel[33] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm33
		leftArmModel[34] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm35
		leftArmModel[35] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm36
		leftArmModel[36] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm37
		leftArmModel[37] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm38
		leftArmModel[38] = new ModelRendererTurbo(this,  1300,  960, textureX, textureY); // RIghtArm39
		leftArmModel[39] = new ModelRendererTurbo(this,  1300,  1000, textureX, textureY); // RIghtArm40
		leftArmModel[40] = new ModelRendererTurbo(this,  1300,  1000, textureX, textureY); // RIghtArm41
		leftArmModel[41] = new ModelRendererTurbo(this,  1300,  1000, textureX, textureY); // RIghtArm42
		leftArmModel[42] = new ModelRendererTurbo(this,  1300,  1100, textureX, textureY); // RIghtArm43
		leftArmModel[43] = new ModelRendererTurbo(this,  1300,  1100, textureX, textureY); // RIghtArm44
		leftArmModel[44] = new ModelRendererTurbo(this,  1300,  1100, textureX, textureY); // RIghtArm45
		leftArmModel[45] = new ModelRendererTurbo(this,  1300,  1200, textureX, textureY); // RIghtArm46
		leftArmModel[46] = new ModelRendererTurbo(this,  1300,  1200, textureX, textureY); // RIghtArm47
		leftArmModel[47] = new ModelRendererTurbo(this,  1300,  1200, textureX, textureY); // RIghtArm48
		leftArmModel[48] = new ModelRendererTurbo(this,  1300,  1200, textureX, textureY); // RIghtArm49
		leftArmModel[49] = new ModelRendererTurbo(this,  1300,  1200, textureX, textureY); // RIghtArm50
		leftArmModel[50] = new ModelRendererTurbo(this,  1300,  1200, textureX, textureY); // RIghtArm51
		leftArmModel[51] = new ModelRendererTurbo(this,  1300,  1260, textureX, textureY); // RIghtArm52
		leftArmModel[52] = new ModelRendererTurbo(this,  1300,  1290, textureX, textureY); // RIghtArm53

		leftArmModel[0].addBox(-6F, -5F, 252F, 12, 11, 8, 0F); // RIghtArm1
		leftArmModel[0].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[0].rotateAngleZ = -1.570796F;

		leftArmModel[1].addBox(-52F, -5F, 260F, 66, 11, 6, 0F); // RIghtArm2
		leftArmModel[1].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[1].rotateAngleZ = -1.570796F;

		leftArmModel[2].addBox(-51F, -4F, 257F, 36, 9, 3, 0F); // RIghtArm3
		leftArmModel[2].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[2].rotateAngleZ = -1.570796F;

		leftArmModel[3].addShapeBox(-51F, -4F, 254F, 36, 9, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[3].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[3].rotateAngleZ = -1.570796F;

		leftArmModel[4].addBox(-15F, -2.5F, 258F, 15, 6, 2, 0F); // RIghtArm5
		leftArmModel[4].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[4].rotateAngleZ = -1.570796F;

		leftArmModel[5].addShapeBox(-52F, -9F, 251F, 16, 4, 15, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[5].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[5].rotateAngleZ = -1.570796F;

		leftArmModel[6].addShapeBox(-52F, 6F, 251F, 16, 4, 15, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[6].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[6].rotateAngleZ = -1.570796F;

		leftArmModel[7].addBox(-36F, -9F, 251F, 42, 4, 15, 0F); // RIghtArm8
		leftArmModel[7].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[7].rotateAngleZ = -1.570796F;

		leftArmModel[8].addBox(-36F, 6F, 251F, 42, 4, 15, 0F); // RIghtArm9
		leftArmModel[8].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[8].rotateAngleZ = -1.570796F;

		leftArmModel[9].addShapeBox(6F, -9F, 251F, 8, 4, 15, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[9].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[9].rotateAngleZ = -1.570796F;

		leftArmModel[10].addShapeBox(6F, 6F, 251F, 8, 4, 15, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[10].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[10].rotateAngleZ = -1.570796F;

		leftArmModel[11].addBox(-52F, -9F, 266F, 66, 19, 19, 0F); // RIghtArm12
		leftArmModel[11].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[11].rotateAngleZ = -1.570796F;

		leftArmModel[12].addShapeBox(14F, -5F, 266F, 12, 13, 19, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[12].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[12].rotateAngleZ = -1.570796F;

		leftArmModel[13].addBox(26F, -5F, 272F, 12, 13, 13, 0F); // RIghtArm14
		leftArmModel[13].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[13].rotateAngleZ = -1.570796F;

		leftArmModel[14].addBox(-34F, -18F, 266F, 48, 9, 19, 0F); // RIghtArm15
		leftArmModel[14].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[14].rotateAngleZ = -1.570796F;

		leftArmModel[15].addShapeBox(4F, -27F, 266F, 10, 9, 19, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[15].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[15].rotateAngleZ = -1.570796F;

		leftArmModel[16].addBox(-18F, -27F, 266F, 22, 9, 19, 0F); // RIghtArm17
		leftArmModel[16].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[16].rotateAngleZ = -1.570796F;

		leftArmModel[17].addBox(-33F, -27F, 266F, 14, 8, 19, 0F); // RIghtArm18
		leftArmModel[17].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[17].rotateAngleZ = -1.570796F;

		leftArmModel[18].addBox(-34F, -26F, 267F, 16, 8, 17, 0F); // RIghtArm19
		leftArmModel[18].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[18].rotateAngleZ = -1.570796F;

		leftArmModel[19].addShapeBox(-56F, -27F, 266F, 22, 18, 19, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[19].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[19].rotateAngleZ = -1.570796F;

		leftArmModel[20].addBox(-68F, -2F, 268F, 16, 5, 15, 0F); // RIghtArm21
		leftArmModel[20].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[20].rotateAngleZ = -1.570796F;

		leftArmModel[21].addShapeBox(-68F, -7F, 268F, 16, 5, 15, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[21].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[21].rotateAngleZ = -1.570796F;

		leftArmModel[22].addShapeBox(-68F, 3F, 268F, 16, 5, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); //Test
		leftArmModel[22].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[22].rotateAngleZ = -1.570796F;

		leftArmModel[23].addShapeBox(-87F, -9F, 272F, 35, 2, 7, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //Test
		leftArmModel[23].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[23].rotateAngleZ = -1.570796F;

		leftArmModel[24].addShapeBox(-2F, 10F, 266F, 16, 16, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F); //Test
		leftArmModel[24].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[24].rotateAngleZ = -1.570796F;

		leftArmModel[25].addShapeBox(-6F, 10F, 266F, 4, 16, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		leftArmModel[25].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[25].rotateAngleZ = -1.570796F;

		leftArmModel[26].addShapeBox(-74F, 10F, 266F, 68, 16, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -10F, -3F); //Test
		leftArmModel[26].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[26].rotateAngleZ = -1.570796F;

		leftArmModel[27].addBox(-10F, -9F, 285F, 16, 19, 15, 0F); // RIghtArm28
		leftArmModel[27].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[27].rotateAngleZ = -1.570796F;

		leftArmModel[28].addShapeBox(-52F, -9F, 285F, 42, 19, 15, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -10F); //Test
		leftArmModel[28].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[28].rotateAngleZ = -1.570796F;

		leftArmModel[29].addBox(6F, -9F, 285F, 2, 2, 15, 0F); // RIghtArm30
		leftArmModel[29].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[29].rotateAngleZ = -1.570796F;

		leftArmModel[30].addBox(6F, -4F, 285F, 1, 1, 13, 0F); // RIghtArm34
		leftArmModel[30].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[30].rotateAngleZ = -1.570796F;

		leftArmModel[31].addBox(6F, 8F, 285F, 2, 2, 15, 0F); // RIghtArm31
		leftArmModel[31].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[31].rotateAngleZ = -1.570796F;

		leftArmModel[32].addBox(6F, -7F, 298F, 2, 15, 2, 0F); // RIghtArm32
		leftArmModel[32].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[32].rotateAngleZ = -1.570796F;

		leftArmModel[33].addBox(6F, -6F, 285F, 1, 1, 13, 0F); // RIghtArm33
		leftArmModel[33].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[33].rotateAngleZ = -1.570796F;

		leftArmModel[34].addBox(6F, -2F, 285F, 1, 1, 13, 0F); // RIghtArm35
		leftArmModel[34].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[34].rotateAngleZ = -1.570796F;

		leftArmModel[35].addBox(6F, 0F, 285F, 1, 1, 13, 0F); // RIghtArm36
		leftArmModel[35].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[35].rotateAngleZ = -1.570796F;

		leftArmModel[36].addBox(6F, 2F, 285F, 1, 1, 13, 0F); // RIghtArm37
		leftArmModel[36].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[36].rotateAngleZ = -1.570796F;

		leftArmModel[37].addBox(6F, 4F, 285F, 1, 1, 13, 0F); // RIghtArm38
		leftArmModel[37].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[37].rotateAngleZ = -1.570796F;

		leftArmModel[38].addBox(6F, 6F, 285F, 1, 1, 13, 0F); // RIghtArm39
		leftArmModel[38].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[38].rotateAngleZ = -1.570796F;

		leftArmModel[39].addBox(38F, -8.5F, 249F, 6, 20, 60, 0F); // RIghtArm40
		leftArmModel[39].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[39].rotateAngleZ = -1.570796F;

		leftArmModel[40].addShapeBox(38F, -28.5F, 249F, 6, 20, 60, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRIghtArm41
		leftArmModel[40].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[40].rotateAngleZ = -1.570796F;

		leftArmModel[41].addShapeBox(38F, 11.5F, 249F, 6, 20, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F); //TestRIghtArm42
		leftArmModel[41].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[41].rotateAngleZ = -1.570796F;

		leftArmModel[42].addShapeBox(44F, -9.5F, 246F, 14, 22, 66, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F); //TestRIghtArm43
		leftArmModel[42].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[42].rotateAngleZ = -1.570796F;

		leftArmModel[43].addShapeBox(44F, -31.5F, 246F, 14, 22, 66, 0F, 0F, 0F, -22F, 0F, -9F, -25F, 0F, -9F, -25F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 3F, -9F, 0F, 3F, -9F, 0F, 0F, 0F); //TestRIghtArm44
		leftArmModel[43].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[43].rotateAngleZ = -1.570796F;

		leftArmModel[44].addShapeBox(44F, 12.5F, 246F, 14, 22, 66, 0F, 0F, 0F, 0F, 0F, 3F, -9F, 0F, 3F, -9F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -9F, -25F, 0F, -9F, -25F, 0F, 0F, -22F); //TestRIghtArm45
		leftArmModel[44].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[44].rotateAngleZ = -1.570796F;

		leftArmModel[45].addBox(58F, -6.5F, 255F, 1, 16, 20, 0F); // RIghtArm46
		leftArmModel[45].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[45].rotateAngleZ = -1.570796F;

		leftArmModel[46].addShapeBox(58F, -22.5F, 255F, 1, 16, 20, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRIghtArm47
		leftArmModel[46].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[46].rotateAngleZ = -1.570796F;

		leftArmModel[47].addShapeBox(58F, 9.5F, 255F, 1, 16, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRIghtArm48
		leftArmModel[47].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[47].rotateAngleZ = -1.570796F;

		leftArmModel[48].addBox(58F, -6.5F, 283F, 1, 16, 20, 0F); // RIghtArm49
		leftArmModel[48].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[48].rotateAngleZ = -1.570796F;

		leftArmModel[49].addShapeBox(58F, -22.5F, 283F, 1, 16, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //TestRIghtArm50
		leftArmModel[49].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[49].rotateAngleZ = -1.570796F;

		leftArmModel[50].addShapeBox(58F, 9.5F, 283F, 1, 16, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F); //TestRIghtArm51
		leftArmModel[50].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[50].rotateAngleZ = -1.570796F;

		leftArmModel[51].addShapeBox(-24F, -36.5F, 275F, 59, 6, 12, 0F, -8F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); //Test
		leftArmModel[51].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[51].rotateAngleZ = -1.780236F;

		leftArmModel[52].addShapeBox(-21F, -7.5F, 303F, 59, 12, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, -1F); //Test
		leftArmModel[52].setRotationPoint(-109F, 137F, 0F);
		leftArmModel[52].rotateAngleZ = -1.570796F;
		flipAll();

		translateAll(109F, 137F, 0F);
	}
}