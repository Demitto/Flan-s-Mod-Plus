//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMechPLaser extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechPLaser() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[126];
		gunModel[0] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Import Body1
		gunModel[1] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 72
		gunModel[2] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 73
		gunModel[3] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 74
		gunModel[4] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 75
		gunModel[5] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 76
		gunModel[6] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 77
		gunModel[7] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 78
		gunModel[8] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 79
		gunModel[9] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 80
		gunModel[10] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 81
		gunModel[11] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 82
		gunModel[12] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 83
		gunModel[13] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 84
		gunModel[14] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 85
		gunModel[15] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 86
		gunModel[16] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 87
		gunModel[17] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 88
		gunModel[18] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 89
		gunModel[19] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 90
		gunModel[20] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 91
		gunModel[21] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 92
		gunModel[22] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 93
		gunModel[23] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 94
		gunModel[24] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 95
		gunModel[25] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 96
		gunModel[26] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 97
		gunModel[27] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 98
		gunModel[28] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 99
		gunModel[29] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 100
		gunModel[30] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 101
		gunModel[31] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 102
		gunModel[32] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 103
		gunModel[33] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 104
		gunModel[34] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 105
		gunModel[35] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 106
		gunModel[36] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 107
		gunModel[37] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 108
		gunModel[38] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 109
		gunModel[39] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 110
		gunModel[40] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 111
		gunModel[41] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 112
		gunModel[42] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 113
		gunModel[43] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 114
		gunModel[44] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 115
		gunModel[45] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 116
		gunModel[46] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 117
		gunModel[47] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 118
		gunModel[48] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 119
		gunModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 120
		gunModel[50] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 121
		gunModel[51] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 122
		gunModel[52] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 123
		gunModel[53] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 124
		gunModel[54] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 125
		gunModel[55] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 126
		gunModel[56] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 127
		gunModel[57] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 128
		gunModel[58] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 129
		gunModel[59] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 130
		gunModel[60] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 131
		gunModel[61] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 132
		gunModel[62] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 133
		gunModel[63] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 134
		gunModel[64] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 135
		gunModel[65] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 136
		gunModel[66] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 137
		gunModel[67] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 138
		gunModel[68] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 139
		gunModel[69] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 140
		gunModel[70] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 141
		gunModel[71] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 142
		gunModel[72] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 143
		gunModel[73] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 144
		gunModel[74] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 145
		gunModel[75] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 146
		gunModel[76] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 147
		gunModel[77] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 148
		gunModel[78] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 149
		gunModel[79] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 150
		gunModel[80] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 151
		gunModel[81] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 152
		gunModel[82] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 153
		gunModel[83] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 154
		gunModel[84] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 155
		gunModel[85] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 156
		gunModel[86] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 157
		gunModel[87] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 158
		gunModel[88] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 159
		gunModel[89] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 160
		gunModel[90] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 161
		gunModel[91] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 162
		gunModel[92] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 163
		gunModel[93] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 164
		gunModel[94] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 165
		gunModel[95] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 166
		gunModel[96] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 167
		gunModel[97] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 168
		gunModel[98] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 169
		gunModel[99] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 170
		gunModel[100] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 171
		gunModel[101] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 172
		gunModel[102] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 173
		gunModel[103] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 174
		gunModel[104] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 175
		gunModel[105] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 176
		gunModel[106] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 177
		gunModel[107] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 178
		gunModel[108] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 179
		gunModel[109] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 180
		gunModel[110] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 181
		gunModel[111] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 182
		gunModel[112] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 183
		gunModel[113] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 184
		gunModel[114] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 185
		gunModel[115] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 186
		gunModel[116] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 187
		gunModel[117] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 188
		gunModel[118] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 189
		gunModel[119] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 190
		gunModel[120] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 191
		gunModel[121] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 192
		gunModel[122] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 193
		gunModel[123] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 194
		gunModel[124] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 195
		gunModel[125] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 196

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Import Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 9, 32, 24, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 72
		gunModel[1].setRotationPoint(19F, -16F, -12F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 26, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[2].setRotationPoint(28F, -13F, -9F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 25, 26, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[3].setRotationPoint(34F, -13F, -8F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[4].setRotationPoint(34F, -13F, -9F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[5].setRotationPoint(34F, 9F, -9F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[6].setRotationPoint(55F, -9F, -9F);

		gunModel[7].addTrapezoid(0F, 0F, 0F, 17, 14, 1, 0F, 1.00F, ModelRendererTurbo.MR_BACK); // Box 78
		gunModel[7].setRotationPoint(36F, -7F, -9F);

		gunModel[8].addTrapezoid(0F, 0F, 0F, 17, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 79
		gunModel[8].setRotationPoint(36F, -7F, -10F);

		gunModel[9].addTrapezoid(0F, 0F, 0F, 17, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 80
		gunModel[9].setRotationPoint(36F, 6F, -10F);

		gunModel[10].addTrapezoid(0F, 0F, 0F, 1, 12, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 81
		gunModel[10].setRotationPoint(36F, -6F, -10F);

		gunModel[11].addTrapezoid(0F, 0F, 0F, 1, 12, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 82
		gunModel[11].setRotationPoint(52F, -6F, -10F);

		gunModel[12].addTrapezoid(0F, 0F, 0F, 15, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 83
		gunModel[12].setRotationPoint(37F, -5.5F, -9.5F);

		gunModel[13].addTrapezoid(0F, 0F, 0F, 15, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 84
		gunModel[13].setRotationPoint(37F, -3.5F, -9.5F);

		gunModel[14].addTrapezoid(0F, 0F, 0F, 15, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 85
		gunModel[14].setRotationPoint(37F, -1.5F, -9.5F);

		gunModel[15].addTrapezoid(0F, 0F, 0F, 15, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 86
		gunModel[15].setRotationPoint(37F, 0.5F, -9.5F);

		gunModel[16].addTrapezoid(0F, 0F, 0F, 15, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 87
		gunModel[16].setRotationPoint(37F, 2.5F, -9.5F);

		gunModel[17].addTrapezoid(0F, 0F, 0F, 15, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 88
		gunModel[17].setRotationPoint(37F, 4.5F, -9.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 17, 26, 18, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, 0F, 0F); // Box 89
		gunModel[18].setRotationPoint(59F, -13F, -9F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[19].setRotationPoint(28F, 13F, -8F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[20].setRotationPoint(28F, 15F, -8F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 92
		gunModel[21].setRotationPoint(28F, 17F, -8F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[22].setRotationPoint(28F, 13F, 2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[23].setRotationPoint(28F, 15F, 2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 95
		gunModel[24].setRotationPoint(28F, 17F, 2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[25].setRotationPoint(30F, 13F, -9F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 97
		gunModel[26].setRotationPoint(30F, 18F, -9F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 98
		gunModel[27].setRotationPoint(49F, 18F, -9F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[28].setRotationPoint(49F, 13F, -9F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 100
		gunModel[29].setRotationPoint(44F, 18F, -9F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[30].setRotationPoint(44F, 13F, -9F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[31].setRotationPoint(35F, 13F, -9F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 103
		gunModel[32].setRotationPoint(35F, 18F, -9F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[33].setRotationPoint(30F, 13F, 1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 105
		gunModel[34].setRotationPoint(30F, 18F, 1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 106
		gunModel[35].setRotationPoint(49F, 18F, 1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[36].setRotationPoint(49F, 13F, 1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 108
		gunModel[37].setRotationPoint(44F, 18F, 1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[38].setRotationPoint(44F, 13F, 1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[39].setRotationPoint(35F, 13F, 1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 111
		gunModel[40].setRotationPoint(35F, 18F, 1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[41].setRotationPoint(76F, -10F, -6F);

		gunModel[42].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 113
		gunModel[42].setRotationPoint(77F, -10F, -6F);

		gunModel[43].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 114
		gunModel[43].setRotationPoint(78F, -9F, -5F);

		gunModel[44].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 115
		gunModel[44].setRotationPoint(79F, -10F, -6F);

		gunModel[45].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 116
		gunModel[45].setRotationPoint(81F, -10F, -6F);

		gunModel[46].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 117
		gunModel[46].setRotationPoint(82F, -9F, -5F);

		gunModel[47].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 118
		gunModel[47].setRotationPoint(83F, -10F, -6F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[48].setRotationPoint(80F, -10F, -6F);

		gunModel[49].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 120
		gunModel[49].setRotationPoint(85F, -10F, -6F);

		gunModel[50].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 121
		gunModel[50].setRotationPoint(86F, -9F, -5F);

		gunModel[51].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 122
		gunModel[51].setRotationPoint(87F, -10F, -6F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gunModel[52].setRotationPoint(84F, -10F, -6F);

		gunModel[53].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 124
		gunModel[53].setRotationPoint(89F, -10F, -6F);

		gunModel[54].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 125
		gunModel[54].setRotationPoint(90F, -9F, -5F);

		gunModel[55].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 126
		gunModel[55].setRotationPoint(91F, -10F, -6F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[56].setRotationPoint(88F, -10F, -6F);

		gunModel[57].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 128
		gunModel[57].setRotationPoint(93F, -10F, -6F);

		gunModel[58].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 129
		gunModel[58].setRotationPoint(94F, -9F, -5F);

		gunModel[59].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 130
		gunModel[59].setRotationPoint(95F, -10F, -6F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[60].setRotationPoint(92F, -10F, -6F);

		gunModel[61].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 132
		gunModel[61].setRotationPoint(97F, -10F, -6F);

		gunModel[62].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 133
		gunModel[62].setRotationPoint(98F, -9F, -5F);

		gunModel[63].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 134
		gunModel[63].setRotationPoint(99F, -10F, -6F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[64].setRotationPoint(96F, -10F, -6F);

		gunModel[65].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 136
		gunModel[65].setRotationPoint(101F, -10F, -6F);

		gunModel[66].addTrapezoid(0F, 0F, 0F, 1, 10, 10, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 137
		gunModel[66].setRotationPoint(102F, -9F, -5F);

		gunModel[67].addTrapezoid(0F, 0F, 0F, 1, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 138
		gunModel[67].setRotationPoint(103F, -10F, -6F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[68].setRotationPoint(100F, -10F, -6F);

		gunModel[69].addTrapezoid(0F, 0F, 0F, 7, 12, 12, 0F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 140
		gunModel[69].setRotationPoint(104F, -10F, -6F);

		gunModel[70].addTrapezoid(0F, 0F, 0F, 7, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 141
		gunModel[70].setRotationPoint(111F, -8F, -2F);

		gunModel[71].addTrapezoid(0F, 0F, 0F, 7, 1, 4, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 142
		gunModel[71].setRotationPoint(111F, -1F, -2F);

		gunModel[72].addTrapezoid(0F, 0F, 0F, 7, 4, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 143
		gunModel[72].setRotationPoint(111F, -6F, -4F);

		gunModel[73].addTrapezoid(0F, 0F, 0F, 7, 4, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 144
		gunModel[73].setRotationPoint(111F, -6F, 3F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gunModel[74].setRotationPoint(118F, -8F, -4F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 146
		gunModel[75].setRotationPoint(118F, -2F, -4F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[76].setRotationPoint(118F, -6F, -4F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[77].setRotationPoint(118F, -6F, 2F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 48, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[78].setRotationPoint(59F, 4F, -3F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[79].setRotationPoint(59F, 10F, -3F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gunModel[80].setRotationPoint(105F, 6F, -3F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 152
		gunModel[81].setRotationPoint(103F, 6F, -3F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 153
		gunModel[82].setRotationPoint(103F, 6F, 1F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 154
		gunModel[83].setRotationPoint(100.5F, 6F, -1F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 155
		gunModel[84].setRotationPoint(99F, 6F, -3F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 156
		gunModel[85].setRotationPoint(96.5F, 6F, -1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 157
		gunModel[86].setRotationPoint(99F, 6F, 1F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 158
		gunModel[87].setRotationPoint(95F, 6F, -3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 159
		gunModel[88].setRotationPoint(92.5F, 6F, -1F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 160
		gunModel[89].setRotationPoint(95F, 6F, 1F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 161
		gunModel[90].setRotationPoint(91F, 6F, -3F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 162
		gunModel[91].setRotationPoint(88.5F, 6F, -1F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 163
		gunModel[92].setRotationPoint(91F, 6F, 1F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 164
		gunModel[93].setRotationPoint(87F, 6F, -3F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 165
		gunModel[94].setRotationPoint(84.5F, 6F, -1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 166
		gunModel[95].setRotationPoint(87F, 6F, 1F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 167
		gunModel[96].setRotationPoint(83F, 6F, -3F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 168
		gunModel[97].setRotationPoint(80.5F, 6F, -1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 169
		gunModel[98].setRotationPoint(83F, 6F, 1F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 170
		gunModel[99].setRotationPoint(79F, 6F, -3F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 171
		gunModel[100].setRotationPoint(76.5F, 6F, -1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 172
		gunModel[101].setRotationPoint(79F, 6F, 1F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 173
		gunModel[102].setRotationPoint(75F, 6F, -3F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 174
		gunModel[103].setRotationPoint(72.5F, 6F, -1F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 175
		gunModel[104].setRotationPoint(75F, 6F, 1F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 176
		gunModel[105].setRotationPoint(71F, 6F, -3F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 177
		gunModel[106].setRotationPoint(68.5F, 6F, -1F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 178
		gunModel[107].setRotationPoint(71F, 6F, 1F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[108].setRotationPoint(76F, 2F, -3F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[109].setRotationPoint(80F, 2F, -3F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gunModel[110].setRotationPoint(84F, 2F, -3F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[111].setRotationPoint(88F, 2F, -3F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[112].setRotationPoint(92F, 2F, -3F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[113].setRotationPoint(96F, 2F, -3F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[114].setRotationPoint(100F, 2F, -3F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[115].setRotationPoint(59F, -13F, -4.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 28, 3, 9, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		gunModel[116].setRotationPoint(48F, -16F, -4.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		gunModel[117].setRotationPoint(76F, -15F, -1.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		gunModel[118].setRotationPoint(76F, -14F, -1.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 190
		gunModel[119].setRotationPoint(76F, -13F, -1.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		gunModel[120].setRotationPoint(84F, -14F, -0.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 3, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 192
		gunModel[121].setRotationPoint(35F, -13F, 9F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 3, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 193
		gunModel[122].setRotationPoint(41F, -13F, 9F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 194
		gunModel[123].setRotationPoint(47F, -13F, 9F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 28, 1, 3, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		gunModel[124].setRotationPoint(22F, -14F, -7.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 28, 1, 3, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		gunModel[125].setRotationPoint(22F, -14F, 4.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}