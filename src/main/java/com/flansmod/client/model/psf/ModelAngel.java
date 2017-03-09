//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelAngel extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelAngel()
	{
		bodyModel = new ModelRendererTurbo[123];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 26, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[0].setRotationPoint(-75F, -45.5F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 0F, -8F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[1].setRotationPoint(-75F, -45.5F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[2].setRotationPoint(-75F, -31.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(-75F, -25.5F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[4].setRotationPoint(-75F, -45.5F, 1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 18
		bodyModel[5].setRotationPoint(-75F, -31.5F, 1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F); // Box 19
		bodyModel[6].setRotationPoint(-75F, -25.5F, 1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(-75.5F, -32.5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[8].setRotationPoint(-75.5F, -30.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(-75.5F, -28.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[10].setRotationPoint(-75.5F, -26.5F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-75.5F, -32.5F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-75.5F, -30.5F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-75.5F, -28.5F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(-75.5F, -26.5F, 5.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 14, 7, 0F, 0F, -6F, -2F, 0F, -4F, -0.5F, 0F, -4F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-69F, -45.5F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, -7F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.923F, -1.3076F, 0F, -0.923F, -3F, 0F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(-69F, -45.5F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F, 0F, -2F, -3F, 0F, -3F, -1F, 0F, -3F, -5F, 0F, -2F, -3F, 0F, -0.923F, -1.3076F, 0F, -2F, -0.5F, 0F, -2F, -5F, 0F, -0.923F, -3F); // Box 30
		bodyModel[17].setRotationPoint(-63F, -45.5F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(-69F, -31.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 78, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-69F, -25.5F, -7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 78, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-69F, -25.5F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 14, 7, 0F, 0F, -6F, 0F, 0F, -4F, -4F, 0F, -4F, -0.5F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(-69F, -45.5F, 1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -0.923F, -3F, 0F, -0.923F, -1.3076F, 0F, 0F, -2F); // Box 35
		bodyModel[22].setRotationPoint(-69F, -45.5F, 0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F, 0F, -2F, -3F, 0F, -3F, -5F, 0F, -3F, -1F, 0F, -2F, -3F, 0F, -0.923F, -3F, 0F, -2F, -5F, 0F, -2F, -0.5F, 0F, -0.923F, -1.3076F); // Box 36
		bodyModel[23].setRotationPoint(-63F, -45.5F, 0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		bodyModel[24].setRotationPoint(-69F, -31.5F, 1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 78, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F); // Box 38
		bodyModel[25].setRotationPoint(-69F, -25.5F, 1.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 14, 7, 0F, 0F, -4F, -1.5F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 39
		bodyModel[26].setRotationPoint(-56F, -45.5F, -9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 36, 6, 7, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[27].setRotationPoint(-56F, -31.5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 4F, 1F, 0F, 4F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[28].setRotationPoint(-56F, -42.5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 14, 7, 0F, 0F, -4F, -3F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, -1.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(-56F, -45.5F, 2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 36, 6, 7, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 44
		bodyModel[30].setRotationPoint(-56F, -31.5F, 1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 4F, -2F, 0F, 4F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 45
		bodyModel[31].setRotationPoint(-56F, -42.5F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 46
		bodyModel[32].setRotationPoint(-41F, -45.5F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 21, 9, 7, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 47
		bodyModel[33].setRotationPoint(-41F, -50.5F, -9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[34].setRotationPoint(-41F, -50.5F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[35].setRotationPoint(-41F, -54.5F, -8.2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[36].setRotationPoint(-41F, -57.5F, -6.7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0.5F, -2.7F, 0F, 0.5F, -2.7F, 0F, -1.5F, 0.7F, 0F, -1.5F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[37].setRotationPoint(-41F, -60F, -4.7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[38].setRotationPoint(-41F, -60.5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 14, 7, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[39].setRotationPoint(-41F, -45.5F, 2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 9, 7, 0F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[40].setRotationPoint(-41F, -50.5F, 2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[41].setRotationPoint(-41F, -50.5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[42].setRotationPoint(-41F, -54.5F, 6.2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[43].setRotationPoint(-41F, -57.5F, 4.7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -1.5F, 0.7F, 0F, -1.5F, 0.7F, 0F, 0.5F, -2.7F, 0F, 0.5F, -2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[44].setRotationPoint(-41F, -60F, 2.7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[45].setRotationPoint(-41F, -60.5F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(-52F, -46.5F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1.2F, 0F, -2.3F, -1F, 0F, -2F, -1.2F, 0F, 2F, 1.2F, 0F, 2F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F); // Box 61
		bodyModel[47].setRotationPoint(-52F, -49.5F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 2.4F, 0F, -4.8F, -2.4F, 0F, -4.5F, -2.4F, 0F, 4.5F, 2.4F, 0F, 4.8F, 1.2F, 0F, -2.3F, -1F, 0F, -2F, -1.2F, 0F, 2F, 1.2F, 0F, 2F); // Box 62
		bodyModel[48].setRotationPoint(-52F, -52.5F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2.8F, 0F, -8F, -3.1F, 0F, -8F, -3.2F, -1F, 7F, 2.8F, -1F, 7F, 2.4F, 0F, -4.8F, -2.4F, 0F, -4.5F, -2.4F, 0F, 4.5F, 2.4F, 0F, 4.8F); // Box 63
		bodyModel[49].setRotationPoint(-52F, -53.5F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bodyModel[50].setRotationPoint(-52F, -46.5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1.2F, 0F, 2F, -1.2F, 0F, 2F, -1F, 0F, -2F, 1.2F, 0F, -2.3F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F); // Box 66
		bodyModel[51].setRotationPoint(-52F, -49.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 2.4F, 0F, 4.8F, -2.4F, 0F, 4.5F, -2.4F, 0F, -4.5F, 2.4F, 0F, -4.8F, 1.2F, 0F, 2F, -1.2F, 0F, 2F, -1F, 0F, -2F, 1.2F, 0F, -2.3F); // Box 67
		bodyModel[52].setRotationPoint(-52F, -52.5F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2.8F, -1F, 7F, -3.2F, -1F, 7F, -3.1F, 0F, -8F, 2.8F, 0F, -8F, 2.4F, 0F, 4.8F, -2.4F, 0F, 4.5F, -2.4F, 0F, -4.5F, 2.4F, 0F, -4.8F); // Box 68
		bodyModel[53].setRotationPoint(-52F, -53.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, -2F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[54].setRotationPoint(-36F, -50.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[55].setRotationPoint(-31F, -50.5F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F, -7F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, -7F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[56].setRotationPoint(-31F, -54.5F, -8.2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -2F, 0.5F, -3.7F, 0F, 0.5F, -3.7F, 0F, -1.5F, 2.7F, -2F, -1.5F, 2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74
		bodyModel[57].setRotationPoint(-24F, -57.5F, -5.7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[58].setRotationPoint(-22F, -58F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, -2F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[59].setRotationPoint(-36F, -50.5F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[60].setRotationPoint(-31F, -50.5F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F, -7F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, -7F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[61].setRotationPoint(-31F, -54.5F, 6.2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -2F, -1.5F, 2.7F, 0F, -1.5F, 2.7F, 0F, 0.5F, -3.7F, -2F, 0.5F, -3.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[62].setRotationPoint(-24F, -57.5F, 4.7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 29, 3, 12, 0F, 0F, 0.5F, -3.7F, 0F, -5.5F, -4F, 0F, -5.5F, -4.7F, 0F, 0.5F, -4.3F, 0F, 0F, 0F, 0F, 4F, -1.7F, 0F, 4F, -2.3F, 0F, 0F, -0.6F); // Box 80
		bodyModel[63].setRotationPoint(-20F, -57.5F, -5.7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 29, 8, 4, 0F, 0F, -4F, -0.8F, 0F, -7F, -3F, 0F, -4F, 1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 1F, 0F, 0F, 0F); // Box 82
		bodyModel[64].setRotationPoint(-20F, -54.5F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 29, 15, 1, 0F, 0F, -5F, 0F, 0F, -8F, -1F, 0F, -2F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 83
		bodyModel[65].setRotationPoint(-20F, -46.5F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 29, 6, 7, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[66].setRotationPoint(-20F, -31.5F, -8.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 29, 8, 4, 0F, 0F, 0F, -0.7F, 0F, -4F, 1F, 0F, -7F, -3F, 0F, -4F, -0.8F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 86
		bodyModel[67].setRotationPoint(-20F, -54.5F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 29, 15, 1, 0F, 0F, 0F, -0.5F, 0F, -2F, 1.5F, 0F, -8F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		bodyModel[68].setRotationPoint(-20F, -46.5F, 8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 29, 6, 7, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		bodyModel[69].setRotationPoint(-20F, -31.5F, 1.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 29, 8, 10, 0F, 0F, 0F, 0.7F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 89
		bodyModel[70].setRotationPoint(-20F, -54.5F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 29, 13, 14, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[71].setRotationPoint(-20F, -44.5F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 29, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 91
		bodyModel[72].setRotationPoint(-20F, -31.5F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 109, 2, 8, 0F, 0F, -0.5F, -2.3F, 0F, -21F, -3F, 0F, -21F, -3F, 0F, -0.5F, -2.4F, 0F, 0F, 0F, 0F, 20F, -2F, 0F, 20F, -2F, 0F, 0F, 0F); // Box 86
		bodyModel[73].setRotationPoint(9F, -52.5F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 109, 3, 12, 0F, 0F, 0F, -2F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 18F, -3.5F, 0F, 18F, -3.5F, 0F, 0F, 0F); // Box 87
		bodyModel[74].setRotationPoint(9F, -50.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 109, 3, 14, 0F, 0F, 0F, -1F, 0F, -18F, -4.5F, 0F, -18F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 16F, -4F, 0F, 16F, -4F, 0F, 0F, 0F); // Box 88
		bodyModel[75].setRotationPoint(9F, -47.5F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 109, 6, 17, 0F, 0F, 0F, -1.5F, 0F, -16F, -5.5F, 0F, -16F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 11F, -5F, 0F, 11F, -5F, 0F, 0F, 0F); // Box 90
		bodyModel[76].setRotationPoint(9F, -44.5F, -8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 109, 7, 17, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, -5F, 0F, 0F, 0F); // Box 91
		bodyModel[77].setRotationPoint(9F, -38.5F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 29, 4, 49, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 92
		bodyModel[78].setRotationPoint(-20F, -36.5F, -24.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F); // Box 93
		bodyModel[79].setRotationPoint(-30F, -36.5F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.1F); // Box 94
		bodyModel[80].setRotationPoint(-34F, -36.5F, 8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.1F, 0F, -1F, -1.1F); // Box 95
		bodyModel[81].setRotationPoint(-38F, -36.5F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.1F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1.1F, -1.5F); // Box 96
		bodyModel[82].setRotationPoint(-41F, -36.5F, 8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.7F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, -0.5F, 0F, -1.2F, -1.8F); // Box 97
		bodyModel[83].setRotationPoint(-43F, -36.5F, 8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.8F, 0F, -0.9F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.8F, 0F, -1.3F, -3.5F); // Box 98
		bodyModel[84].setRotationPoint(-45F, -36.5F, 8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -3.5F, 0F, -1.1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -3.5F, 0F, -1.4F, -5.5F); // Box 99
		bodyModel[85].setRotationPoint(-47F, -36.5F, 8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, -3.5F, 0F, -1.3F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -3.5F, 0F, -1.6F, -6.5F); // Box 100
		bodyModel[86].setRotationPoint(-49F, -36.5F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.3F, -3.5F, 0F, -1.5F, -8.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.6F, -3.5F, 0F, -1.8F, -8.5F); // Box 101
		bodyModel[87].setRotationPoint(-51F, -36.5F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 29, 16, 2, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, -12F, 0F, -1.2437F, 0F, 0F, -3F, 0F, 0F, 3F, -12F, 0F, 1.2437F); // Box 102
		bodyModel[88].setRotationPoint(-20F, -32.5F, -24.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 16, 2, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 8F, -4F, 0F, 0F, 0F, -1.2437F, 0F, 0F, 1.2437F, 8F, -4F, 0F); // Box 103
		bodyModel[89].setRotationPoint(-21F, -32.5F, -24.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 24, 2, 42, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[90].setRotationPoint(-32F, -18.5F, -21F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, -2F, 1F, -0.5F, 0F, 0F, 0.2437F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.2437F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[91].setRotationPoint(-32F, -18.5F, -23F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, -3F, 2F, 1.5F, 0F, 0F, 0.2437F, 0F, 0F, 0F, -3F, 2F, -1.5F, 0F, -1F, -0.5F, 0F, 0F, 0.2437F, 0F, 0F, 0F, -2F, -3F, -1.5F); // Box 106
		bodyModel[92].setRotationPoint(-32F, -18.5F, -23F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 30, 15, 1, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[93].setRotationPoint(-25F, -33.5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F, -10F, 0F, -0.3F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 108
		bodyModel[94].setRotationPoint(-29F, -33.5F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[95].setRotationPoint(-24F, -28F, -26F);

		bodyModel[96].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 110
		bodyModel[96].setRotationPoint(-26F, -28F, -26F);

		bodyModel[97].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 111
		bodyModel[97].setRotationPoint(-27F, -27.5F, -25.5F);

		bodyModel[98].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 112
		bodyModel[98].setRotationPoint(-21F, -28F, -26F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1F, 0F, 0F, 0F); // Box 113
		bodyModel[99].setRotationPoint(-16F, -27.5F, -25.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 29, 16, 2, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, -12F, 0F, 1.2437F, 0F, 0F, 3F, 0F, 0F, -3F, -12F, 0F, -1.2437F); // Box 114
		bodyModel[100].setRotationPoint(-20F, -32.5F, 22.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 13, 16, 2, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 8F, -4F, 0F, 0F, 0F, 1.2437F, 0F, 0F, -1.2437F, 8F, -4F, 0F); // Box 115
		bodyModel[101].setRotationPoint(-21F, -32.5F, 22.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2437F, -2F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2437F, 0F, -1F, -0.5F); // Box 116
		bodyModel[102].setRotationPoint(-32F, -18.5F, 21F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, -3F, 2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.2437F, -3F, 2F, 1.5F, -2F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.2437F, 0F, -1F, -0.5F); // Box 117
		bodyModel[103].setRotationPoint(-32F, -18.5F, 21F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 30, 15, 1, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[104].setRotationPoint(-25F, -33.5F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F, -10F, 0F, -0.3F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 119
		bodyModel[105].setRotationPoint(-29F, -33.5F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[106].setRotationPoint(-24F, -28F, 23F);

		bodyModel[107].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 121
		bodyModel[107].setRotationPoint(-26F, -28F, 23F);

		bodyModel[108].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 122
		bodyModel[108].setRotationPoint(-21F, -28F, 23F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Box 123
		bodyModel[109].setRotationPoint(-16F, -27.5F, 23.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 4, 16, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[110].setRotationPoint(-30F, -36.5F, -24.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[111].setRotationPoint(-34F, -36.5F, -25.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F, 0F, -0.3F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.1F, 0F, -0.8F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[112].setRotationPoint(-38F, -36.5F, -25.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F, 0F, -0.5F, -1.5F, 0F, -0.3F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, -1.5F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[113].setRotationPoint(-41F, -36.5F, -24.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F, 0F, -0.7F, -1.8F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.8F, 0F, -1.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(-43F, -36.5F, -23.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F, 0F, -0.9F, -3.5F, 0F, -0.7F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -3.5F, 0F, -1.2F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[115].setRotationPoint(-45F, -36.5F, -23.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F, 0F, -1.1F, -5.5F, 0F, -0.9F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -5.5F, 0F, -1.3F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[116].setRotationPoint(-47F, -36.5F, -23.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F, 0F, -1.3F, -6.5F, 0F, -1.1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, -6.5F, 0F, -1.4F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[117].setRotationPoint(-49F, -36.5F, -21.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0F, -1.5F, -8.5F, 0F, -1.3F, -3.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.8F, -8.5F, 0F, -1.6F, -3.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 132
		bodyModel[118].setRotationPoint(-51F, -36.5F, -18.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 155, 18, 43, 0F, 0F, 0F, 0F, 0F, -11F, -18F, 0F, -11F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 133
		bodyModel[119].setRotationPoint(9F, -34.5F, -21.5F);

		bodyModel[120].addShapeBox(5F, 1F, -0.2F, 260, 260, 1, 0F, 0F, 0F, 0F, -242F, 0F, 0F, -242F, 0F, 0F, 0F, 0F, 0F, 0F, -242F, 0F, -242F, -242F, 0F, -242F, -242F, 0F, 0F, -242F, 0F); // Box 134
		bodyModel[120].setRotationPoint(-20F, -36.5F, -24.5F);
		bodyModel[120].rotateAngleY = 0.10308089F;

		bodyModel[121].addShapeBox(5F, 1F, 0.2F, 260, 260, 1, 0F, 0F, 0F, 0F, -242F, 0F, 0F, -242F, 0F, 0F, 0F, 0F, 0F, 0F, -242F, 0F, -242F, -242F, 0F, -242F, -242F, 0F, 0F, -242F, 0F); // Box 137
		bodyModel[121].setRotationPoint(-20F, -36.5F, 23.5F);
		bodyModel[121].rotateAngleY = -0.10308089F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 17, 2, 42, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 138
		bodyModel[122].setRotationPoint(-8F, -18.5F, -21F);


		noseModel = new ModelRendererTurbo[13];
		noseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		noseModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		noseModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		noseModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		noseModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		noseModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		noseModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		noseModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		noseModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		noseModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		noseModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		noseModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12

		noseModel[0].addShapeBox(0F, 0F, -0.5F, 74, 8, 1, 0F, 0F, -7.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 0
		noseModel[0].setRotationPoint(-184F, -27.5F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 74, 8, 1, 0F, 0F, -7.375F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7.25F, 0.25F, 0F, -0.125F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 1
		noseModel[1].setRotationPoint(-184F, -27.5F, -1.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 74, 8, 1, 0F, 0F, -7.25F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7.375F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.125F, -1F); // Box 2
		noseModel[2].setRotationPoint(-184F, -27.5F, 0.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 12, 1, 34, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -12F, 0F, 0F); // Box 3
		noseModel[3].setRotationPoint(-149F, -21.5F, 0.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, -0.4F, 0F); // Box 4
		noseModel[4].setRotationPoint(-151F, -21.5F, 0.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 3F, 0F, 0F, -3F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		noseModel[5].setRotationPoint(-136F, -21.5F, 0.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 34, 0F, -12F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		noseModel[6].setRotationPoint(-149F, -21.5F, -34.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, -12F, -0.4F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -12F, -0.4F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 7
		noseModel[7].setRotationPoint(-151F, -21.5F, -34.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 34, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 8
		noseModel[8].setRotationPoint(-136F, -21.5F, -34.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 35, 23, 3, 0F, 0F, -15F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 9
		noseModel[9].setRotationPoint(-110F, -42.5F, -1.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 35, 23, 4, 0F, 0F, -16F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -15F, 1F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 10
		noseModel[10].setRotationPoint(-110F, -42.5F, -5.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 35, 23, 4, 0F, 0F, -15F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -16F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, -4F); // Box 11
		noseModel[11].setRotationPoint(-110F, -42.5F, 1.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		noseModel[12].setRotationPoint(-95F, -35.5F, -1F);


		tailModel = new ModelRendererTurbo[30];
		tailModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		tailModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		tailModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		tailModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		tailModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		tailModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		tailModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		tailModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		tailModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		tailModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		tailModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		tailModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		tailModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		tailModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		tailModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 153
		tailModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		tailModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		tailModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 156
		tailModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		tailModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 158
		tailModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		tailModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		tailModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		tailModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		tailModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		tailModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 165
		tailModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		tailModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		tailModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		tailModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171

		tailModel[0].addShapeBox(0F, 0F, 0F, 56, 11, 17, 0F, -31F, 0F, -4F, 7F, 0F, -8F, 7F, 0F, -8F, -31F, 0F, -4F, 0F, 0F, 0F, -1F, 4F, -8F, -1F, 4F, -8F, 0F, 0F, 0F); // Box 139
		tailModel[0].setRotationPoint(109F, -38.5F, -8.5F);

		tailModel[1].addShapeBox(0F, -1F, 0F, 3, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, -0.387F, 0F, 0F, -0.3775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.387F, 0F, 0F, -0.3775F, 0F, 0F, 0F); // Box 140
		tailModel[1].setRotationPoint(109F, -27.5F, -8.5F);
		tailModel[1].rotateAngleZ = 0.34097799F;

		tailModel[2].addShapeBox(3F, -1F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.387F, 0F, 0F, -3.7333F, 0F, 0F, 3.7333F, 0F, 0F, 0.387F, 0F, 0F, -0.387F, 0F, 0F, -3.7333F, 0F, 0F, 3.7333F, 0F, 0F, 0.387F); // Box 141
		tailModel[2].setRotationPoint(109F, -27.5F, -8.5F);
		tailModel[2].rotateAngleZ = 0.34097799F;

		tailModel[3].addShapeBox(3F, -1F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.387F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.387F, 0F, 0F, -0.387F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.387F); // Box 142
		tailModel[3].setRotationPoint(109F, -27.5F, -5.5F);
		tailModel[3].rotateAngleZ = 0.34097799F;

		tailModel[4].addShapeBox(3F, -1F, 0F, 28, 1, 1, 0F, 0F, 0F, 0.387F, 0F, 0F, 3.7333F, 0F, 0F, -3.7333F, 0F, 0F, -0.387F, 0F, 0F, 0.387F, 0F, 0F, 3.7333F, 0F, 0F, -3.7333F, 0F, 0F, -0.387F); // Box 143
		tailModel[4].setRotationPoint(109F, -27.5F, 7.5F);
		tailModel[4].rotateAngleZ = 0.34097799F;

		tailModel[5].addShapeBox(3F, -1F, 0F, 28, 1, 1, 0F, 0F, 0F, 0.387F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.387F, 0F, 0F, 0.387F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.387F); // Box 144
		tailModel[5].setRotationPoint(109F, -27.5F, 4.5F);
		tailModel[5].rotateAngleZ = 0.34097799F;

		tailModel[6].addShapeBox(31F, -1F, 0F, 3, 1, 17, 0F, 0F, 0F, -3.733F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -3.733F, 0F, 0F, -3.733F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.733F); // Box 145
		tailModel[6].setRotationPoint(109F, -27.5F, -8.5F);
		tailModel[6].rotateAngleZ = 0.34097799F;

		tailModel[7].addShapeBox(0F, 0F, 0F, 42, 19, 9, 0F, -18F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, -18F, 0F, -1F, 0F, 0F, 0F, -11F, 0F, -4F, -11F, 0F, -4F, 0F, 0F, 0F); // Box 146
		tailModel[7].setRotationPoint(141F, -57.5F, -4.5F);

		tailModel[8].addShapeBox(0F, -1F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -0.1111F, 0F, 0F, -0.1111F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1111F, 0F, 0F, -0.1111F, 0F, 0F, 0F); // Box 147
		tailModel[8].setRotationPoint(141F, -38.5F, -4.5F);
		tailModel[8].rotateAngleZ = 0.81241935F;

		tailModel[9].addShapeBox(2F, -1F, 0F, 24, 1, 1, 0F, 0F, 0F, -0.1111F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0.1111F, 0F, 0F, -0.1111F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.1111F); // Box 148
		tailModel[9].setRotationPoint(141F, -38.5F, -4.5F);
		tailModel[9].rotateAngleZ = 0.81241935F;

		tailModel[10].addShapeBox(2F, -1F, 0F, 24, 1, 1, 0F, 0F, 0F, 0.1111F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -0.1111F, 0F, 0F, 0.1111F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.1111F); // Box 149
		tailModel[10].setRotationPoint(141F, -38.5F, 3.5F);
		tailModel[10].rotateAngleZ = 0.81241935F;

		tailModel[11].addShapeBox(-2F, -1F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tailModel[11].setRotationPoint(141F, -38.5F, -4.5F);
		tailModel[11].rotateAngleZ = 0.81241935F;

		tailModel[12].addShapeBox(0F, 0F, 0F, 52, 28, 3, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		tailModel[12].setRotationPoint(107F, -56.5F, -1.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 52, 1, 3, 0F, 0F, -25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -25F, -1F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F); // Box 152
		tailModel[13].setRotationPoint(107F, -57.5F, -1.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tailModel[14].setRotationPoint(158F, -59.5F, -3.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		tailModel[15].setRotationPoint(159F, -60.5F, -2.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 155
		tailModel[16].setRotationPoint(165F, -59.5F, -3.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 156
		tailModel[17].setRotationPoint(165F, -60.5F, -2.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F, 0F, 0F, -2F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 157
		tailModel[18].setRotationPoint(172F, -59.5F, -3.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0F, -0.5F, -2F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, -1F); // Box 158
		tailModel[19].setRotationPoint(172F, -60.5F, -2.5F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[20].setRotationPoint(165F, -58.5F, -1.5F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 161
		tailModel[21].setRotationPoint(173F, -58.5F, -1.5F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 22, 1, 62, 0F, -18F, 0F, 0F, 4F, -0.8F, 0F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, -18F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 162
		tailModel[22].setRotationPoint(162F, -57.5F, -62.5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 62, 0F, -18F, -0.33F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -18F, -0.33F, 0F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F); // Box 163
		tailModel[23].setRotationPoint(159F, -57.5F, -62.5F);

		tailModel[24].addShapeBox(0F, -1F, -19F, 8, 1, 19, 0F, -7F, 0F, 0F, 2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[24].setRotationPoint(180F, -56.5F, -62.5F);
		tailModel[24].rotateAngleX = -0.66322512F;

		tailModel[25].addShapeBox(0F, -1F, -19F, 3, 1, 19, 0F, -7F, -0.33F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.53F, -0.4F, -7F, -0.33F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.3F); // Box 165
		tailModel[25].setRotationPoint(177F, -56.5F, -62.5F);
		tailModel[25].rotateAngleX = -0.66322512F;

		tailModel[26].addShapeBox(0F, 0F, 0F, 22, 1, 62, 0F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 4F, -0.8F, 0F, -18F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 4F, 0F, 0F, -18F, 0F, 0F); // Box 166
		tailModel[26].setRotationPoint(162F, -57.5F, 0.5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 62, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -18F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -18F, -0.33F, 0F); // Box 167
		tailModel[27].setRotationPoint(159F, -57.5F, 0.5F);

		tailModel[28].addShapeBox(0F, 0F, -19F, 8, 1, 19, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 170
		tailModel[28].setRotationPoint(180F, -56.5F, 62.5F);
		tailModel[28].rotateAngleX = -2.47836754F;

		tailModel[29].addShapeBox(0F, 0F, -19F, 3, 1, 19, 0F, -7F, -0.33F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.3F, -7F, -0.33F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.53F, -0.4F); // Box 171
		tailModel[29].setRotationPoint(177F, -56.5F, 62.5F);
		tailModel[29].rotateAngleX = -2.47836754F;


		leftWingModel = new ModelRendererTurbo[30];
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		leftWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		leftWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		leftWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		leftWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		leftWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		leftWingModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		leftWingModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		leftWingModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		leftWingModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181
		leftWingModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		leftWingModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		leftWingModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		leftWingModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		leftWingModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		leftWingModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		leftWingModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		leftWingModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		leftWingModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		leftWingModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		leftWingModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		leftWingModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		leftWingModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200
		leftWingModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201
		leftWingModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202
		leftWingModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		leftWingModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		leftWingModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		leftWingModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		leftWingModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 132, 1, 61, 0F, -103F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, -13F, -103F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, -13F); // Box 172
		leftWingModel[0].setRotationPoint(4F, -17.6F, -69.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 61, 0F, -103F, -0.33F, 0F, 103F, 0F, 0F, 0F, 0F, -13F, 0F, -0.33F, -14F, -103F, -0.33F, 0F, 103F, 0F, 0F, 0F, 0F, -13F, 0F, -0.33F, -14F); // Box 173
		leftWingModel[1].setRotationPoint(-6F, -17.6F, -69.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 40, 1, 61, 0F, -22F, 0F, 0F, 0F, -0.8F, 0F, -15F, -0.8F, 2F, 1F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 2F, 1F, 0F, 0F); // Box 174
		leftWingModel[2].setRotationPoint(114F, -17.6F, -69.5F);

		leftWingModel[3].addShapeBox(0F, 0F, -43F, 30, 1, 43, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingModel[3].setRotationPoint(106F, -17.6F, -69.5F);
		leftWingModel[3].rotateAngleX = 0.61086524F;

		leftWingModel[4].addShapeBox(0F, 0F, -43F, 10, 1, 43, 0F, -34F, -0.33F, 0F, 29F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -34F, -0.33F, 0F, 29F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F); // Box 176
		leftWingModel[4].setRotationPoint(96F, -17.6F, -69.5F);
		leftWingModel[4].rotateAngleX = 0.61086524F;

		leftWingModel[5].addShapeBox(0F, 0F, -43F, 18, 1, 43, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftWingModel[5].setRotationPoint(136F, -17.6F, -69.5F);
		leftWingModel[5].rotateAngleX = 0.61086524F;

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 21, 6, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 178
		leftWingModel[6].setRotationPoint(112F, -19.6F, -70.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftWingModel[7].setRotationPoint(101F, -19.6F, -70.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 180
		leftWingModel[8].setRotationPoint(95F, -19.6F, -70.5F);

		leftWingModel[9].addShapeBox(0F, -1F, -47F, 12, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		leftWingModel[9].setRotationPoint(125F, -17.6F, -69.5F);
		leftWingModel[9].rotateAngleX = 0.61086524F;

		leftWingModel[10].addShapeBox(0F, -3F, -47F, 12, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftWingModel[10].setRotationPoint(125F, -17.6F, -69.5F);
		leftWingModel[10].rotateAngleX = 0.61086524F;

		leftWingModel[11].addShapeBox(0F, 1F, -47F, 12, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 183
		leftWingModel[11].setRotationPoint(125F, -17.6F, -69.5F);
		leftWingModel[11].rotateAngleX = 0.61086524F;

		leftWingModel[12].addShapeBox(0F, -1F, -47F, 6, 2, 6, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 184
		leftWingModel[12].setRotationPoint(119F, -17.6F, -69.5F);
		leftWingModel[12].rotateAngleX = 0.61086524F;

		leftWingModel[13].addShapeBox(0F, -3F, -47F, 6, 2, 6, 0F, 0F, -1.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, -2.25F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 185
		leftWingModel[13].setRotationPoint(119F, -17.6F, -69.5F);
		leftWingModel[13].rotateAngleX = 0.61086524F;

		leftWingModel[14].addShapeBox(0F, 1F, -47F, 6, 2, 6, 0F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, -2.25F); // Box 186
		leftWingModel[14].setRotationPoint(119F, -17.6F, -69.5F);
		leftWingModel[14].rotateAngleX = 0.61086524F;

		leftWingModel[15].addShapeBox(18F, 1F, -47F, 27, 2, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2.25F, 0F, 0F, -2F); // Box 187
		leftWingModel[15].setRotationPoint(119F, -17.6F, -69.5F);
		leftWingModel[15].rotateAngleX = 0.61086524F;

		leftWingModel[16].addShapeBox(18F, -1F, -47F, 27, 2, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Box 188
		leftWingModel[16].setRotationPoint(119F, -17.6F, -69.5F);
		leftWingModel[16].rotateAngleX = 0.61086524F;

		leftWingModel[17].addShapeBox(18F, -3F, -47F, 27, 2, 6, 0F, 0F, 0F, -2F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F); // Box 189
		leftWingModel[17].setRotationPoint(119F, -17.6F, -69.5F);
		leftWingModel[17].rotateAngleX = 0.61086524F;

		leftWingModel[18].addShapeBox(0F, -1F, -43F, 30, 1, 43, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftWingModel[18].setRotationPoint(106F, -17.6F, 69.5F);
		leftWingModel[18].rotateAngleX = 2.53072742F;

		leftWingModel[19].addShapeBox(0F, -1F, -43F, 10, 1, 43, 0F, -34F, -0.33F, 0F, 29F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -34F, -0.33F, 0F, 29F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F); // Box 197
		leftWingModel[19].setRotationPoint(96F, -17.6F, 69.5F);
		leftWingModel[19].rotateAngleX = 2.53072742F;

		leftWingModel[20].addShapeBox(0F, -1F, -43F, 18, 1, 43, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 198
		leftWingModel[20].setRotationPoint(136F, -17.6F, 69.5F);
		leftWingModel[20].rotateAngleX = 2.53072742F;

		leftWingModel[21].addShapeBox(0F, 0F, -47F, 12, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 199
		leftWingModel[21].setRotationPoint(125F, -17.6F, 69.5F);
		leftWingModel[21].rotateAngleX = 2.53072742F;

		leftWingModel[22].addShapeBox(0F, -2F, -47F, 12, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftWingModel[22].setRotationPoint(125F, -17.6F, 69.5F);
		leftWingModel[22].rotateAngleX = 2.53072742F;

		leftWingModel[23].addShapeBox(0F, -4F, -47F, 12, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[23].setRotationPoint(125F, -17.6F, 69.5F);
		leftWingModel[23].rotateAngleX = 2.53072742F;

		leftWingModel[24].addShapeBox(0F, -2F, -47F, 6, 2, 6, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 202
		leftWingModel[24].setRotationPoint(119F, -17.6F, 69.5F);
		leftWingModel[24].rotateAngleX = 2.53072742F;

		leftWingModel[25].addShapeBox(0F, -4F, -47F, 6, 2, 6, 0F, 0F, -1.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, -2.25F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 203
		leftWingModel[25].setRotationPoint(119F, -17.6F, 69.5F);
		leftWingModel[25].rotateAngleX = 2.53072742F;

		leftWingModel[26].addShapeBox(0F, 0F, -47F, 6, 2, 6, 0F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -1.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, -2.25F); // Box 204
		leftWingModel[26].setRotationPoint(119F, -17.6F, 69.5F);
		leftWingModel[26].rotateAngleX = 2.53072742F;

		leftWingModel[27].addShapeBox(18F, 0F, -47F, 27, 2, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2.25F, 0F, 0F, -2F); // Box 205
		leftWingModel[27].setRotationPoint(119F, -17.6F, 69.5F);
		leftWingModel[27].rotateAngleX = 2.53072742F;

		leftWingModel[28].addShapeBox(18F, -2F, -47F, 27, 2, 6, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Box 206
		leftWingModel[28].setRotationPoint(119F, -17.6F, 69.5F);
		leftWingModel[28].rotateAngleX = 2.53072742F;

		leftWingModel[29].addShapeBox(18F, -4F, -47F, 27, 2, 6, 0F, 0F, 0F, -2F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F); // Box 207
		leftWingModel[29].setRotationPoint(119F, -17.6F, 69.5F);
		leftWingModel[29].rotateAngleX = 2.53072742F;


		rightWingModel = new ModelRendererTurbo[6];
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		rightWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		rightWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		rightWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		rightWingModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 132, 1, 61, 0F, 0F, 0F, -13F, -23F, 0F, 0F, 0F, 0F, 0F, -103F, 0F, 0F, 0F, 0F, -13F, -23F, 0F, 0F, 0F, 0F, 0F, -103F, 0F, 0F); // Box 190
		rightWingModel[0].setRotationPoint(4F, -17.6F, 8.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 61, 0F, 0F, -0.33F, -14F, 0F, 0F, -13F, 103F, 0F, 0F, -103F, -0.33F, 0F, 0F, -0.33F, -14F, 0F, 0F, -13F, 103F, 0F, 0F, -103F, -0.33F, 0F); // Box 191
		rightWingModel[1].setRotationPoint(-6F, -17.6F, 8.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 40, 1, 61, 0F, 1F, 0F, 0F, -15F, -0.8F, 2F, 0F, -0.8F, 0F, -22F, 0F, 0F, 1F, 0F, 0F, -15F, 0F, 2F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 192
		rightWingModel[2].setRotationPoint(114F, -17.6F, 8.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 21, 6, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 193
		rightWingModel[3].setRotationPoint(112F, -19.6F, 68.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightWingModel[4].setRotationPoint(101F, -19.6F, 68.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 195
		rightWingModel[5].setRotationPoint(95F, -19.6F, 68.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}