//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.10
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMechMML extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechMML()
	{
		gunModel = new ModelRendererTurbo[143];
		gunModel[0] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Import Body1
		gunModel[1] = new ModelRendererTurbo(this, 0, 124, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 0, 173, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 0, 173, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 0, 173, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 8
		gunModel[10] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 9
		gunModel[11] = new ModelRendererTurbo(this, 0, 173, textureX, textureY); // Box 10
		gunModel[12] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 11
		gunModel[13] = new ModelRendererTurbo(this, 0, 208, textureX, textureY); // Box 12
		gunModel[14] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 13
		gunModel[15] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Box 14
		gunModel[16] = new ModelRendererTurbo(this, 0, 294, textureX, textureY); // Box 15
		gunModel[17] = new ModelRendererTurbo(this, 0, 294, textureX, textureY); // Box 16
		gunModel[18] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Box 17
		gunModel[19] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 25
		gunModel[22] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 26
		gunModel[23] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 28
		gunModel[24] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 29
		gunModel[25] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 30
		gunModel[26] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 32
		gunModel[28] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 33
		gunModel[29] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 34
		gunModel[30] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 35
		gunModel[31] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 36
		gunModel[32] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 37
		gunModel[33] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 38
		gunModel[34] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 39
		gunModel[35] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 40
		gunModel[36] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 41
		gunModel[37] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 42
		gunModel[38] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 43
		gunModel[39] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 44
		gunModel[40] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 45
		gunModel[41] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 46
		gunModel[42] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 47
		gunModel[43] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 48
		gunModel[44] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 49
		gunModel[45] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 50
		gunModel[46] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 51
		gunModel[47] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 52
		gunModel[48] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 53
		gunModel[49] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 54
		gunModel[50] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 55
		gunModel[51] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 56
		gunModel[52] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 57
		gunModel[53] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 58
		gunModel[54] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 59
		gunModel[55] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 60
		gunModel[56] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 61
		gunModel[57] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 62
		gunModel[58] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 63
		gunModel[59] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 64
		gunModel[60] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 65
		gunModel[61] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 66
		gunModel[62] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 67
		gunModel[63] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 68
		gunModel[64] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 69
		gunModel[65] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 70
		gunModel[66] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 71
		gunModel[67] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 72
		gunModel[68] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 73
		gunModel[69] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 74
		gunModel[70] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 75
		gunModel[71] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 76
		gunModel[72] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 77
		gunModel[73] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 78
		gunModel[74] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 79
		gunModel[75] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 80
		gunModel[76] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 81
		gunModel[77] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 82
		gunModel[78] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 83
		gunModel[79] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 84
		gunModel[80] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 85
		gunModel[81] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 86
		gunModel[82] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 87
		gunModel[83] = new ModelRendererTurbo(this, 0, 329, textureX, textureY); // Box 88
		gunModel[84] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 89
		gunModel[85] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 90
		gunModel[86] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 91
		gunModel[87] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 92
		gunModel[88] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 93
		gunModel[89] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 94
		gunModel[90] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 95
		gunModel[91] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Box 96
		gunModel[92] = new ModelRendererTurbo(this, 0, 396, textureX, textureY); // Box 97
		gunModel[93] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Box 98
		gunModel[94] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 99
		gunModel[95] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 100
		gunModel[96] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 101
		gunModel[97] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 102
		gunModel[98] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 103
		gunModel[99] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 104
		gunModel[100] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 105
		gunModel[101] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Box 106
		gunModel[102] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 107
		gunModel[103] = new ModelRendererTurbo(this, 0, 466, textureX, textureY); // Box 108
		gunModel[104] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Box 109
		gunModel[105] = new ModelRendererTurbo(this, 0, 484, textureX, textureY); // Box 111
		gunModel[106] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 112
		gunModel[107] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 113
		gunModel[108] = new ModelRendererTurbo(this, 200, 30, textureX, textureY); // Box 114
		gunModel[109] = new ModelRendererTurbo(this, 200, 40, textureX, textureY); // Box 115
		gunModel[110] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Box 116
		gunModel[111] = new ModelRendererTurbo(this, 200, 84, textureX, textureY); // Box 117
		gunModel[112] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 118
		gunModel[113] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 119
		gunModel[114] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 120
		gunModel[115] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 121
		gunModel[116] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 122
		gunModel[117] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 123
		gunModel[118] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Box 124
		gunModel[119] = new ModelRendererTurbo(this, 200, 84, textureX, textureY); // Box 125
		gunModel[120] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Box 126
		gunModel[121] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Box 127
		gunModel[122] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 128
		gunModel[123] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 129
		gunModel[124] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 130
		gunModel[125] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 131
		gunModel[126] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 132
		gunModel[127] = new ModelRendererTurbo(this, 200, 96, textureX, textureY); // Box 133
		gunModel[128] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 134
		gunModel[129] = new ModelRendererTurbo(this, 200, 153, textureX, textureY); // Box 135
		gunModel[130] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Box 136
		gunModel[131] = new ModelRendererTurbo(this, 200, 202, textureX, textureY); // Box 137
		gunModel[132] = new ModelRendererTurbo(this, 200, 225, textureX, textureY); // Box 138
		gunModel[133] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 139
		gunModel[134] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 140
		gunModel[135] = new ModelRendererTurbo(this, 200, 202, textureX, textureY); // Box 141
		gunModel[136] = new ModelRendererTurbo(this, 200, 225, textureX, textureY); // Box 142
		gunModel[137] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 143
		gunModel[138] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 144
		gunModel[139] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 145
		gunModel[140] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 146
		gunModel[141] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 147
		gunModel[142] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 148

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Import Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(-22F, -20F, -12F, 15, 24, 20, 0F); // Box 0
		gunModel[1].setRotationPoint(41F, 8F, 2F);

		gunModel[2].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 1
		gunModel[2].setRotationPoint(19F, 6F, 10F);

		gunModel[3].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 2
		gunModel[3].setRotationPoint(19F, -10F, 10F);

		gunModel[4].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 3
		gunModel[4].setRotationPoint(22F, -1.5F, 10F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[5].setRotationPoint(22F, -4.5F, 10F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 5
		gunModel[6].setRotationPoint(22F, 1.5F, 10F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		gunModel[7].setRotationPoint(22F, 1.5F, -11F);

		gunModel[8].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 7
		gunModel[8].setRotationPoint(19F, 6F, -11F);

		gunModel[9].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 8
		gunModel[9].setRotationPoint(22F, -1.5F, -11F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[10].setRotationPoint(22F, -4.5F, -11F);

		gunModel[11].addBox(0F, 0F, 0F, 15, 4, 1, 0F); // Box 10
		gunModel[11].setRotationPoint(19F, -10F, -11F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[12].setRotationPoint(19F, -15F, -6F);

		gunModel[13].addBox(-22F, -20F, -12F, 15, 32, 22, 0F); // Box 12
		gunModel[13].setRotationPoint(56F, 4F, 1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 13
		gunModel[14].setRotationPoint(19F, 12F, -6F);

		gunModel[15].addBox(-22F, -20F, -12F, 47, 1, 22, 0F); // Box 14
		gunModel[15].setRotationPoint(71F, 4F, 1F);

		gunModel[16].addBox(-22F, -20F, -12F, 47, 30, 1, 0F); // Box 15
		gunModel[16].setRotationPoint(71F, 5F, 1F);

		gunModel[17].addBox(-22F, -20F, 0F, 47, 30, 1, 0F); // Box 16
		gunModel[17].setRotationPoint(71F, 5F, 10F);

		gunModel[18].addBox(-22F, 0F, -12F, 47, 1, 22, 0F); // Box 17
		gunModel[18].setRotationPoint(71F, 15F, 1F);

		gunModel[19].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 22
		gunModel[19].setRotationPoint(71F, 6F, 2F);

		gunModel[20].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[20].setRotationPoint(71F, 5F, 2F);

		gunModel[21].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		gunModel[21].setRotationPoint(71F, 9F, 2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 26
		gunModel[22].setRotationPoint(97F, -14F, -10F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 28
		gunModel[23].setRotationPoint(97F, -15F, -10F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 29
		gunModel[24].setRotationPoint(97F, -11F, -10F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 30
		gunModel[25].setRotationPoint(97F, -14F, 5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 31
		gunModel[26].setRotationPoint(97F, -15F, 5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 32
		gunModel[27].setRotationPoint(97F, -11F, 5F);

		gunModel[28].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 33
		gunModel[28].setRotationPoint(71F, 9F, 17F);

		gunModel[29].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 34
		gunModel[29].setRotationPoint(71F, 6F, 17F);

		gunModel[30].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[30].setRotationPoint(71F, 5F, 17F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 36
		gunModel[31].setRotationPoint(97F, -14F, -2.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 37
		gunModel[32].setRotationPoint(97F, -15F, -2.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 38
		gunModel[33].setRotationPoint(97F, -11F, -2.5F);

		gunModel[34].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 39
		gunModel[34].setRotationPoint(71F, 9F, 9.5F);

		gunModel[35].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 40
		gunModel[35].setRotationPoint(71F, 6F, 9.5F);

		gunModel[36].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[36].setRotationPoint(71F, 5F, 9.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 42
		gunModel[37].setRotationPoint(97F, -6F, -2.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 43
		gunModel[38].setRotationPoint(97F, -7F, -2.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 44
		gunModel[39].setRotationPoint(97F, -3F, -2.5F);

		gunModel[40].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		gunModel[40].setRotationPoint(71F, 17F, 9.5F);

		gunModel[41].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 46
		gunModel[41].setRotationPoint(71F, 14F, 9.5F);

		gunModel[42].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[42].setRotationPoint(71F, 13F, 9.5F);

		gunModel[43].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[43].setRotationPoint(71F, 13F, 2F);

		gunModel[44].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 49
		gunModel[44].setRotationPoint(71F, 14F, 2F);

		gunModel[45].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		gunModel[45].setRotationPoint(71F, 17F, 2F);

		gunModel[46].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[46].setRotationPoint(71F, 13F, 17F);

		gunModel[47].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 52
		gunModel[47].setRotationPoint(71F, 14F, 17F);

		gunModel[48].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		gunModel[48].setRotationPoint(71F, 17F, 17F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 54
		gunModel[49].setRotationPoint(97F, -6F, 5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 55
		gunModel[50].setRotationPoint(97F, -7F, 5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 56
		gunModel[51].setRotationPoint(97F, -3F, 5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 57
		gunModel[52].setRotationPoint(97F, -6F, -10F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 58
		gunModel[53].setRotationPoint(97F, -7F, -10F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 59
		gunModel[54].setRotationPoint(97F, -3F, -10F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 60
		gunModel[55].setRotationPoint(97F, 3F, -2.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 61
		gunModel[56].setRotationPoint(97F, 2F, -2.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 62
		gunModel[57].setRotationPoint(97F, 6F, -2.5F);

		gunModel[58].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		gunModel[58].setRotationPoint(71F, 26F, 9.5F);

		gunModel[59].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 64
		gunModel[59].setRotationPoint(71F, 23F, 9.5F);

		gunModel[60].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[60].setRotationPoint(71F, 22F, 9.5F);

		gunModel[61].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[61].setRotationPoint(71F, 22F, 2F);

		gunModel[62].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 67
		gunModel[62].setRotationPoint(71F, 23F, 2F);

		gunModel[63].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 68
		gunModel[63].setRotationPoint(71F, 26F, 2F);

		gunModel[64].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[64].setRotationPoint(71F, 22F, 17F);

		gunModel[65].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 70
		gunModel[65].setRotationPoint(71F, 23F, 17F);

		gunModel[66].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 71
		gunModel[66].setRotationPoint(71F, 26F, 17F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 72
		gunModel[67].setRotationPoint(97F, 3F, 5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 73
		gunModel[68].setRotationPoint(97F, 2F, 5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 74
		gunModel[69].setRotationPoint(97F, 6F, 5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 75
		gunModel[70].setRotationPoint(97F, 3F, -10F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 76
		gunModel[71].setRotationPoint(97F, 2F, -10F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 77
		gunModel[72].setRotationPoint(97F, 6F, -10F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 78
		gunModel[73].setRotationPoint(97F, 11F, -2.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 79
		gunModel[74].setRotationPoint(97F, 10F, -2.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 80
		gunModel[75].setRotationPoint(97F, 14F, -2.5F);

		gunModel[76].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		gunModel[76].setRotationPoint(71F, 34F, 9.5F);

		gunModel[77].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 82
		gunModel[77].setRotationPoint(71F, 31F, 9.5F);

		gunModel[78].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[78].setRotationPoint(71F, 30F, 9.5F);

		gunModel[79].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[79].setRotationPoint(71F, 30F, 2F);

		gunModel[80].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 85
		gunModel[80].setRotationPoint(71F, 31F, 2F);

		gunModel[81].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 86
		gunModel[81].setRotationPoint(71F, 34F, 2F);

		gunModel[82].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[82].setRotationPoint(71F, 30F, 17F);

		gunModel[83].addBox(-22F, -20F, -12F, 48, 3, 5, 0F); // Box 88
		gunModel[83].setRotationPoint(71F, 31F, 17F);

		gunModel[84].addShapeBox(-22F, -20F, -12F, 48, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 89
		gunModel[84].setRotationPoint(71F, 34F, 17F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 90
		gunModel[85].setRotationPoint(97F, 11F, 5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 91
		gunModel[86].setRotationPoint(97F, 10F, 5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 92
		gunModel[87].setRotationPoint(97F, 14F, 5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -2F, 0F, -1.33F, -2F, 0F, 0F, 0F); // Box 93
		gunModel[88].setRotationPoint(97F, 11F, -10F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F); // Box 94
		gunModel[89].setRotationPoint(97F, 10F, -10F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 1.33F, -2F, 0F, 1.33F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.99F, -2.33F, 0F, -1.99F, -2.33F, 0F, 0F, -1F); // Box 95
		gunModel[90].setRotationPoint(97F, 14F, -10F);

		gunModel[91].addBox(-22F, 0F, -12F, 47, 3, 20, 0F); // Box 96
		gunModel[91].setRotationPoint(71F, 7F, 2F);

		gunModel[92].addBox(-22F, 0F, -12F, 47, 4, 20, 0F); // Box 97
		gunModel[92].setRotationPoint(71F, -2F, 2F);

		gunModel[93].addBox(-22F, 0F, -12F, 47, 3, 20, 0F); // Box 98
		gunModel[93].setRotationPoint(71F, -10F, 2F);

		gunModel[94].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 99
		gunModel[94].setRotationPoint(71F, 5F, 2.5F);

		gunModel[95].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 100
		gunModel[95].setRotationPoint(71F, 5F, -5F);

		gunModel[96].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		gunModel[96].setRotationPoint(71F, 13F, -5F);

		gunModel[97].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
		gunModel[97].setRotationPoint(71F, 13F, 2.5F);

		gunModel[98].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		gunModel[98].setRotationPoint(71F, 22F, -5F);

		gunModel[99].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		gunModel[99].setRotationPoint(71F, 22F, 2.5F);

		gunModel[100].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		gunModel[100].setRotationPoint(71F, 30F, -5F);

		gunModel[101].addShapeBox(-22F, -20F, 0F, 47, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		gunModel[101].setRotationPoint(71F, 30F, 2.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 25, 6, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[102].setRotationPoint(46F, -22F, -8F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[103].setRotationPoint(71F, -22F, -5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 6F, 0F, 0F, 6F, 0F); // Box 109
		gunModel[104].setRotationPoint(71F, -22F, 5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[105].setRotationPoint(71F, -22F, -8F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[106].setRotationPoint(71F, -21F, -2F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[107].setRotationPoint(82F, -20.5F, -1.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[108].setRotationPoint(92F, -20F, -1F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 5, 6, 16, 0F,0F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 115
		gunModel[109].setRotationPoint(41F, -22F, -8F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[110].setRotationPoint(46F, -12F, 11F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[111].setRotationPoint(46F, -6F, 11F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[112].setRotationPoint(58F, -6F, 11F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[113].setRotationPoint(62F, -6F, 11F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[114].setRotationPoint(66F, -6F, 11F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[115].setRotationPoint(70F, -6F, 11F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[116].setRotationPoint(74F, -6F, 11F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gunModel[117].setRotationPoint(78F, -6F, 11F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 124
		gunModel[118].setRotationPoint(46F, 0F, 11F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[119].setRotationPoint(46F, -6F, -15F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		gunModel[120].setRotationPoint(46F, -12F, -15F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 35, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[121].setRotationPoint(46F, 0F, -15F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[122].setRotationPoint(58F, -6F, -13F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[123].setRotationPoint(62F, -6F, -13F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[124].setRotationPoint(66F, -6F, -13F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[125].setRotationPoint(70F, -6F, -13F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[126].setRotationPoint(74F, -6F, -13F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[127].setRotationPoint(78F, -6F, -13F);

		gunModel[128].addShapeBox(-22F, -20F, -12F, 15, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 134
		gunModel[128].setRotationPoint(56F, 36F, 2F);

		gunModel[129].addShapeBox(-22F, -20F, -12F, 13, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[129].setRotationPoint(64F, 36F, 4F);

		gunModel[130].addShapeBox(-22F, -20F, -12F, 13, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 136
		gunModel[130].setRotationPoint(72F, 36F, 6F);

		gunModel[131].addShapeBox(-22F, -20F, -12F, 15, 10, 10, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 137
		gunModel[131].setRotationPoint(41F, 36F, 2F);

		gunModel[132].addShapeBox(-22F, -20F, -12F, 50, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[132].setRotationPoint(-9F, 39F, 4F);

		gunModel[133].addShapeBox(-22F, -20F, -12F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 139
		gunModel[133].setRotationPoint(-13F, 39F, 4F);

		gunModel[134].addShapeBox(-22F, -20F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 140
		gunModel[134].setRotationPoint(-13F, 39F, 2F);

		gunModel[135].addShapeBox(-22F, -20F, 0F, 15, 10, 10, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 141
		gunModel[135].setRotationPoint(41F, 36F, 0F);

		gunModel[136].addShapeBox(-22F, -20F, 0F, 50, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		gunModel[136].setRotationPoint(-9F, 39F, 2F);

		gunModel[137].addBox(0F, 0F, 0F, 6, 9, 24, 0F); // Box 143
		gunModel[137].setRotationPoint(8F, 16F, -12F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 6, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 144
		gunModel[138].setRotationPoint(8F, 25F, -12F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 6, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 145
		gunModel[139].setRotationPoint(-6F, 25F, -12F);

		gunModel[140].addBox(0F, 0F, 0F, 6, 9, 24, 0F); // Box 146
		gunModel[140].setRotationPoint(-6F, 16F, -12F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 6, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 147
		gunModel[141].setRotationPoint(-22F, 25F, -12F);

		gunModel[142].addBox(0F, 0F, 0F, 6, 9, 24, 0F); // Box 148
		gunModel[142].setRotationPoint(-22F, 16F, -12F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}