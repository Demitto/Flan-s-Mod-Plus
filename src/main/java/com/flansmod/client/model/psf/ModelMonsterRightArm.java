//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMonsterRightArm extends ModelMecha //Same as Filename
{
	int textureX = 3000;
	int textureY = 3000;

	public ModelMonsterRightArm() //Same as Filename
	{

		rightArmModel = new ModelRendererTurbo[216];



		initrightArmModel_1();


		translateAll(0F, 0F, 0F);


		flipAll();
	}


	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1105, 1316, textureX, textureY); // RightArm1
		rightArmModel[1] = new ModelRendererTurbo(this, 810, 1817, textureX, textureY); // RightArm10
		rightArmModel[2] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // RightArm100
		rightArmModel[3] = new ModelRendererTurbo(this, 1217, 641, textureX, textureY); // RightArm101
		rightArmModel[4] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm102
		rightArmModel[5] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // RightArm103
		rightArmModel[6] = new ModelRendererTurbo(this, 987, 397, textureX, textureY); // RightArm104
		rightArmModel[7] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm105
		rightArmModel[8] = new ModelRendererTurbo(this, 1171, 1392, textureX, textureY); // RightArm106
		rightArmModel[9] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm107
		rightArmModel[10] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // RightArm108
		rightArmModel[11] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm109
		rightArmModel[12] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm11
		rightArmModel[13] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // RightArm110
		rightArmModel[14] = new ModelRendererTurbo(this, 987, 356, textureX, textureY); // RightArm111
		rightArmModel[15] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm112
		rightArmModel[16] = new ModelRendererTurbo(this, 1076, 161, textureX, textureY); // RightArm113
		rightArmModel[17] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // RightArm114
		rightArmModel[18] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm115
		rightArmModel[19] = new ModelRendererTurbo(this, 987, 498, textureX, textureY); // RightArm116
		rightArmModel[20] = new ModelRendererTurbo(this, 1497, 1742, textureX, textureY); // RightArm117
		rightArmModel[21] = new ModelRendererTurbo(this, 987, 315, textureX, textureY); // RightArm118
		rightArmModel[22] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm119
		rightArmModel[23] = new ModelRendererTurbo(this, 810, 1931, textureX, textureY); // RightArm12
		rightArmModel[24] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm120
		rightArmModel[25] = new ModelRendererTurbo(this, 1076, 250, textureX, textureY); // RightArm121
		rightArmModel[26] = new ModelRendererTurbo(this, 1076, 303, textureX, textureY); // RightArm122
		rightArmModel[27] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm123
		rightArmModel[28] = new ModelRendererTurbo(this, 1134, 1149, textureX, textureY); // RightArm124
		rightArmModel[29] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm125
		rightArmModel[30] = new ModelRendererTurbo(this, 1076, 338, textureX, textureY); // RightArm126
		rightArmModel[31] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm127
		rightArmModel[32] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm128
		rightArmModel[33] = new ModelRendererTurbo(this, 1126, 427, textureX, textureY); // RightArm129
		rightArmModel[34] = new ModelRendererTurbo(this, 810, 1931, textureX, textureY); // RightArm13
		rightArmModel[35] = new ModelRendererTurbo(this, 1126, 522, textureX, textureY); // RightArm130
		rightArmModel[36] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm131
		rightArmModel[37] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // RightArm132
		rightArmModel[38] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // RightArm133
		rightArmModel[39] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // RightArm134
		rightArmModel[40] = new ModelRendererTurbo(this, 1129, 1144, textureX, textureY); // RightArm135
		rightArmModel[41] = new ModelRendererTurbo(this, 1218, 1097, textureX, textureY); // RightArm136
		rightArmModel[42] = new ModelRendererTurbo(this, 1135, 1097, textureX, textureY); // RightArm137
		rightArmModel[43] = new ModelRendererTurbo(this, 1135, 1097, textureX, textureY); // RightArm138
		rightArmModel[44] = new ModelRendererTurbo(this, 1307, 1239, textureX, textureY); // RightArm139
		rightArmModel[45] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm14
		rightArmModel[46] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm140
		rightArmModel[47] = new ModelRendererTurbo(this, 1218, 1097, textureX, textureY); // RightArm141
		rightArmModel[48] = new ModelRendererTurbo(this, 983, 1823, textureX, textureY); // RightArm142
		rightArmModel[49] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // RightArm143
		rightArmModel[50] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm144
		rightArmModel[51] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm145
		rightArmModel[52] = new ModelRendererTurbo(this, 1105, 1232, textureX, textureY); // RightArm146
		rightArmModel[53] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm147
		rightArmModel[54] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm148
		rightArmModel[55] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // RightArm149
		rightArmModel[56] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // RightArm15
		rightArmModel[57] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm150
		rightArmModel[58] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm151
		rightArmModel[59] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm152
		rightArmModel[60] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm153
		rightArmModel[61] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm154
		rightArmModel[62] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm155
		rightArmModel[63] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm156
		rightArmModel[64] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm157
		rightArmModel[65] = new ModelRendererTurbo(this, 1195, 1670, textureX, textureY); // RightArm158
		rightArmModel[66] = new ModelRendererTurbo(this, 1196, 1729, textureX, textureY); // RightArm159
		rightArmModel[67] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm16
		rightArmModel[68] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // RightArm160
		rightArmModel[69] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // RightArm161
		rightArmModel[70] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // RightArm162
		rightArmModel[71] = new ModelRendererTurbo(this, 1462, 1883, textureX, textureY); // RightArm163
		rightArmModel[72] = new ModelRendererTurbo(this, 1186, 1875, textureX, textureY); // RightArm164
		rightArmModel[73] = new ModelRendererTurbo(this, 1183, 1936, textureX, textureY); // RightArm165
		rightArmModel[74] = new ModelRendererTurbo(this, 1325, 1875, textureX, textureY); // RightArm167
		rightArmModel[75] = new ModelRendererTurbo(this, 1392, 1875, textureX, textureY); // RightArm168
		rightArmModel[76] = new ModelRendererTurbo(this, 1308, 1936, textureX, textureY); // RightArm169
		rightArmModel[77] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm17
		rightArmModel[78] = new ModelRendererTurbo(this, 1379, 1936, textureX, textureY); // RightArm170
		rightArmModel[79] = new ModelRendererTurbo(this, 1326, 1670, textureX, textureY); // RightArm172
		rightArmModel[80] = new ModelRendererTurbo(this, 1321, 1729, textureX, textureY); // RightArm173
		rightArmModel[81] = new ModelRendererTurbo(this, 1405, 1670, textureX, textureY); // RightArm174
		rightArmModel[82] = new ModelRendererTurbo(this, 1404, 1729, textureX, textureY); // RightArm175
		rightArmModel[83] = new ModelRendererTurbo(this, 1186, 449, textureX, textureY); // RightArm176
		rightArmModel[84] = new ModelRendererTurbo(this, 1186, 449, textureX, textureY); // RightArm177
		rightArmModel[85] = new ModelRendererTurbo(this, 1211, 419, textureX, textureY); // RightArm178
		rightArmModel[86] = new ModelRendererTurbo(this, 1211, 448, textureX, textureY); // RightArm179
		rightArmModel[87] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // RightArm18
		rightArmModel[88] = new ModelRendererTurbo(this, 1186, 432, textureX, textureY); // RightArm180
		rightArmModel[89] = new ModelRendererTurbo(this, 1186, 419, textureX, textureY); // RightArm181
		rightArmModel[90] = new ModelRendererTurbo(this, 1211, 448, textureX, textureY); // RightArm182
		rightArmModel[91] = new ModelRendererTurbo(this, 1186, 419, textureX, textureY); // RightArm183
		rightArmModel[92] = new ModelRendererTurbo(this, 1211, 419, textureX, textureY); // RightArm184
		rightArmModel[93] = new ModelRendererTurbo(this, 1186, 432, textureX, textureY); // RightArm185
		rightArmModel[94] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // RightArm19
		rightArmModel[95] = new ModelRendererTurbo(this, 996, 11, textureX, textureY); // RightArm2
		rightArmModel[96] = new ModelRendererTurbo(this, 643, 1810, textureX, textureY); // RightArm20
		rightArmModel[97] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // RightArm21
		rightArmModel[98] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // RightArm22
		rightArmModel[99] = new ModelRendererTurbo(this, 643, 1875, textureX, textureY); // RightArm23
		rightArmModel[100] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // RightArm24
		rightArmModel[101] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // RightArm25
		rightArmModel[102] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // RightArm26
		rightArmModel[103] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // RightArm27
		rightArmModel[104] = new ModelRendererTurbo(this, 999, 171, textureX, textureY); // RightArm28
		rightArmModel[105] = new ModelRendererTurbo(this, 877, 1931, textureX, textureY); // RightArm29
		rightArmModel[106] = new ModelRendererTurbo(this, 1105, 1351, textureX, textureY); // RightArm3
		rightArmModel[107] = new ModelRendererTurbo(this, 1212, 1239, textureX, textureY); // RightArm30
		rightArmModel[108] = new ModelRendererTurbo(this, 999, 212, textureX, textureY); // RightArm31
		rightArmModel[109] = new ModelRendererTurbo(this, 999, 171, textureX, textureY); // RightArm32
		rightArmModel[110] = new ModelRendererTurbo(this, 1247, 996, textureX, textureY); // RightArm33
		rightArmModel[111] = new ModelRendererTurbo(this, 999, 212, textureX, textureY); // RightArm34
		rightArmModel[112] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // RightArm35
		rightArmModel[113] = new ModelRendererTurbo(this, 999, 253, textureX, textureY); // RightArm36
		rightArmModel[114] = new ModelRendererTurbo(this, 1368, 1085, textureX, textureY); // RightArm37
		rightArmModel[115] = new ModelRendererTurbo(this, 1368, 1085, textureX, textureY); // RightArm38
		rightArmModel[116] = new ModelRendererTurbo(this, 999, 276, textureX, textureY); // RightArm39
		rightArmModel[117] = new ModelRendererTurbo(this, 1087, 11, textureX, textureY); // RightArm4
		rightArmModel[118] = new ModelRendererTurbo(this, 999, 253, textureX, textureY); // RightArm40
		rightArmModel[119] = new ModelRendererTurbo(this, 1368, 1062, textureX, textureY); // RightArm41
		rightArmModel[120] = new ModelRendererTurbo(this, 1368, 1062, textureX, textureY); // RightArm42
		rightArmModel[121] = new ModelRendererTurbo(this, 999, 276, textureX, textureY); // RightArm43
		rightArmModel[122] = new ModelRendererTurbo(this, 1242, 1350, textureX, textureY); // RightArm44
		rightArmModel[123] = new ModelRendererTurbo(this, 1176, 11, textureX, textureY); // RightArm45
		rightArmModel[124] = new ModelRendererTurbo(this, 1417, 1085, textureX, textureY); // RightArm46
		rightArmModel[125] = new ModelRendererTurbo(this, 1007, 605, textureX, textureY); // RightArm47
		rightArmModel[126] = new ModelRendererTurbo(this, 1417, 1062, textureX, textureY); // RightArm48
		rightArmModel[127] = new ModelRendererTurbo(this, 1417, 1085, textureX, textureY); // RightArm49
		rightArmModel[128] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm5
		rightArmModel[129] = new ModelRendererTurbo(this, 1020, 854, textureX, textureY); // RightArm50
		rightArmModel[130] = new ModelRendererTurbo(this, 1020, 777, textureX, textureY); // RightArm51
		rightArmModel[131] = new ModelRendererTurbo(this, 1417, 1062, textureX, textureY); // RightArm52
		rightArmModel[132] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // RightArm53
		rightArmModel[133] = new ModelRendererTurbo(this, 1019, 706, textureX, textureY); // RightArm54
		rightArmModel[134] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // RightArm55
		rightArmModel[135] = new ModelRendererTurbo(this, 1076, 106, textureX, textureY); // RightArm56
		rightArmModel[136] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // RightArm57
		rightArmModel[137] = new ModelRendererTurbo(this, 1135, 619, textureX, textureY); // RightArm58
		rightArmModel[138] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // RightArm59
		rightArmModel[139] = new ModelRendererTurbo(this, 1247, 949, textureX, textureY); // RightArm6
		rightArmModel[140] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // RightArm60
		rightArmModel[141] = new ModelRendererTurbo(this, 1163, 839, textureX, textureY); // RightArm61
		rightArmModel[142] = new ModelRendererTurbo(this, 1368, 1039, textureX, textureY); // RightArm62
		rightArmModel[143] = new ModelRendererTurbo(this, 1076, 1017, textureX, textureY); // RightArm63
		rightArmModel[144] = new ModelRendererTurbo(this, 1242, 1314, textureX, textureY); // RightArm64
		rightArmModel[145] = new ModelRendererTurbo(this, 1043, 975, textureX, textureY); // RightArm65
		rightArmModel[146] = new ModelRendererTurbo(this, 1273, 1039, textureX, textureY); // RightArm66
		rightArmModel[147] = new ModelRendererTurbo(this, 1398, 1445, textureX, textureY); // RightArm67
		rightArmModel[148] = new ModelRendererTurbo(this, 1043, 975, textureX, textureY); // RightArm68
		rightArmModel[149] = new ModelRendererTurbo(this, 1178, 1017, textureX, textureY); // RightArm69
		rightArmModel[150] = new ModelRendererTurbo(this, 930, 1931, textureX, textureY); // RightArm7
		rightArmModel[151] = new ModelRendererTurbo(this, 1295, 1445, textureX, textureY); // RightArm70
		rightArmModel[152] = new ModelRendererTurbo(this, 1023, 1017, textureX, textureY); // RightArm71
		rightArmModel[153] = new ModelRendererTurbo(this, 1207, 1782, textureX, textureY); // RightArm72
		rightArmModel[154] = new ModelRendererTurbo(this, 994, 980, textureX, textureY); // RightArm73
		rightArmModel[155] = new ModelRendererTurbo(this, 1398, 1504, textureX, textureY); // RightArm74
		rightArmModel[156] = new ModelRendererTurbo(this, 1398, 1575, textureX, textureY); // RightArm75
		rightArmModel[157] = new ModelRendererTurbo(this, 1125, 1017, textureX, textureY); // RightArm76
		rightArmModel[158] = new ModelRendererTurbo(this, 1200, 1558, textureX, textureY); // RightArm77
		rightArmModel[159] = new ModelRendererTurbo(this, 994, 980, textureX, textureY); // RightArm78
		rightArmModel[160] = new ModelRendererTurbo(this, 1163, 705, textureX, textureY); // RightArm79
		rightArmModel[161] = new ModelRendererTurbo(this, 810, 1852, textureX, textureY); // RightArm8
		rightArmModel[162] = new ModelRendererTurbo(this, 1200, 1469, textureX, textureY); // RightArm80
		rightArmModel[163] = new ModelRendererTurbo(this, 1163, 766, textureX, textureY); // RightArm81
		rightArmModel[164] = new ModelRendererTurbo(this, 1511, 1453, textureX, textureY); // RightArm82
		rightArmModel[165] = new ModelRendererTurbo(this, 1511, 1512, textureX, textureY); // RightArm83
		rightArmModel[166] = new ModelRendererTurbo(this, 1240, 706, textureX, textureY); // RightArm84
		rightArmModel[167] = new ModelRendererTurbo(this, 1171, 1433, textureX, textureY); // RightArm85
		rightArmModel[168] = new ModelRendererTurbo(this, 991, 106, textureX, textureY); // RightArm86
		rightArmModel[169] = new ModelRendererTurbo(this, 1157, 945, textureX, textureY); // RightArm87
		rightArmModel[170] = new ModelRendererTurbo(this, 1511, 1636, textureX, textureY); // RightArm88
		rightArmModel[171] = new ModelRendererTurbo(this, 1157, 928, textureX, textureY); // RightArm89
		rightArmModel[172] = new ModelRendererTurbo(this, 810, 1817, textureX, textureY); // RightArm9
		rightArmModel[173] = new ModelRendererTurbo(this, 1511, 1577, textureX, textureY); // RightArm90
		rightArmModel[174] = new ModelRendererTurbo(this, 1497, 1876, textureX, textureY); // RightArm91
		rightArmModel[175] = new ModelRendererTurbo(this, 1157, 911, textureX, textureY); // RightArm92
		rightArmModel[176] = new ModelRendererTurbo(this, 1458, 1782, textureX, textureY); // RightArm93
		rightArmModel[177] = new ModelRendererTurbo(this, 1264, 910, textureX, textureY); // RightArm94
		rightArmModel[178] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // RightArm95
		rightArmModel[179] = new ModelRendererTurbo(this, 983, 1912, textureX, textureY); // RightArm96
		rightArmModel[180] = new ModelRendererTurbo(this, 1497, 1695, textureX, textureY); // RightArm97
		rightArmModel[181] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // RightArm98
		rightArmModel[182] = new ModelRendererTurbo(this, 1050, 934, textureX, textureY); // RightArm99

		rightArmModel[0].addShapeBox(-23F, 60F, -40F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // RightArm1
		rightArmModel[0].setRotationPoint(2F, -301F, -118F);
		rightArmModel[0].rotateAngleZ = -0.34906585F;

		rightArmModel[1].addShapeBox(-83F, 196F, -64F, 62, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm10
		rightArmModel[1].setRotationPoint(2F, -301F, -118F);
		rightArmModel[1].rotateAngleZ = 0.27925268F;

		rightArmModel[2].addShapeBox(-63.5F, 136F, -27.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm100
		rightArmModel[2].setRotationPoint(2F, -301F, -118F);
		rightArmModel[2].rotateAngleZ = 0.41887902F;

		rightArmModel[3].addShapeBox(-22F, 52F, -64F, 43, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm101
		rightArmModel[3].setRotationPoint(2F, -301F, -118F);
		rightArmModel[3].rotateAngleZ = -0.34906585F;

		rightArmModel[4].addShapeBox(-65F, 118F, -77F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm102
		rightArmModel[4].setRotationPoint(2F, -301F, -118F);
		rightArmModel[4].rotateAngleZ = 0.41887902F;

		rightArmModel[5].addShapeBox(-63.5F, 136F, -75.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm103
		rightArmModel[5].setRotationPoint(2F, -301F, -118F);
		rightArmModel[5].rotateAngleZ = 0.41887902F;

		rightArmModel[6].addShapeBox(27F, -27F, -76F, 15, 40, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm104
		rightArmModel[6].setRotationPoint(2F, -301F, -118F);
		rightArmModel[6].rotateAngleZ = -0.34906585F;

		rightArmModel[7].addShapeBox(-81.5F, 118F, -77F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm105
		rightArmModel[7].setRotationPoint(2F, -301F, -118F);
		rightArmModel[7].rotateAngleZ = 0.41887902F;

		rightArmModel[8].addShapeBox(-23F, 60F, -68F, 45, 8, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm106
		rightArmModel[8].setRotationPoint(2F, -301F, -118F);
		rightArmModel[8].rotateAngleZ = -0.34906585F;

		rightArmModel[9].addShapeBox(9F, -42F, -18F, 14, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm107
		rightArmModel[9].setRotationPoint(2F, -301F, -118F);
		rightArmModel[9].rotateAngleZ = -0.34906585F;

		rightArmModel[10].addShapeBox(-80F, 136F, -75.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm108
		rightArmModel[10].setRotationPoint(2F, -301F, -118F);
		rightArmModel[10].rotateAngleZ = 0.41887902F;

		rightArmModel[11].addShapeBox(-81.5F, 118F, -29F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm109
		rightArmModel[11].setRotationPoint(2F, -301F, -118F);
		rightArmModel[11].rotateAngleZ = 0.41887902F;

		rightArmModel[12].addShapeBox(-82F, 199F, -82F, 60, 46, 15, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm11
		rightArmModel[12].setRotationPoint(2F, -301F, -118F);
		rightArmModel[12].rotateAngleZ = 0.27925268F;

		rightArmModel[13].addShapeBox(-80F, 136F, -27.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm110
		rightArmModel[13].setRotationPoint(2F, -301F, -118F);
		rightArmModel[13].rotateAngleZ = 0.41887902F;

		rightArmModel[14].addShapeBox(27F, -36F, -76F, 15, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm111
		rightArmModel[14].setRotationPoint(2F, -301F, -118F);
		rightArmModel[14].rotateAngleZ = -0.34906585F;

		rightArmModel[15].addShapeBox(-97F, 118F, -77F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm112
		rightArmModel[15].setRotationPoint(2F, -301F, -118F);
		rightArmModel[15].rotateAngleZ = 0.41887902F;

		rightArmModel[16].addShapeBox(-44F, -51F, -76F, 86, 15, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm113
		rightArmModel[16].setRotationPoint(2F, -301F, -118F);
		rightArmModel[16].rotateAngleZ = -0.34906585F;

		rightArmModel[17].addShapeBox(-95.5F, 136F, -75.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm114
		rightArmModel[17].setRotationPoint(2F, -301F, -118F);
		rightArmModel[17].rotateAngleZ = 0.41887902F;

		rightArmModel[18].addShapeBox(-97F, 118F, -29F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm115
		rightArmModel[18].setRotationPoint(2F, -301F, -118F);
		rightArmModel[18].rotateAngleZ = 0.41887902F;

		rightArmModel[19].addShapeBox(-44F, -27F, -76F, 15, 40, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm116
		rightArmModel[19].setRotationPoint(2F, -301F, -118F);
		rightArmModel[19].rotateAngleZ = -0.34906585F;

		rightArmModel[20].addShapeBox(-95.5F, 136F, -27.5F, 9, 17, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm117
		rightArmModel[20].setRotationPoint(2F, -301F, -118F);
		rightArmModel[20].rotateAngleZ = 0.41887902F;

		rightArmModel[21].addShapeBox(-44F, -36F, -76F, 15, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm118
		rightArmModel[21].setRotationPoint(2F, -301F, -118F);
		rightArmModel[21].rotateAngleZ = -0.34906585F;

		rightArmModel[22].addShapeBox(-97F, 150F, -29F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm119
		rightArmModel[22].setRotationPoint(2F, -301F, -118F);
		rightArmModel[22].rotateAngleZ = 0.41887902F;

		rightArmModel[23].addShapeBox(-40F, 199F, -86F, 7, 46, 19, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm12
		rightArmModel[23].setRotationPoint(2F, -301F, -118F);
		rightArmModel[23].rotateAngleZ = 0.27925268F;

		rightArmModel[24].addShapeBox(-81.5F, 150F, -29F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm120
		rightArmModel[24].setRotationPoint(2F, -301F, -118F);
		rightArmModel[24].rotateAngleZ = 0.41887902F;

		rightArmModel[25].addShapeBox(-44F, -51F, -91F, 86, 15, 15, 0F,-15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm121
		rightArmModel[25].setRotationPoint(2F, -301F, -118F);
		rightArmModel[25].rotateAngleZ = -0.34906585F;

		rightArmModel[26].addShapeBox(-44F, -36F, -91F, 86, 9, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm122
		rightArmModel[26].setRotationPoint(2F, -301F, -118F);
		rightArmModel[26].rotateAngleZ = -0.34906585F;

		rightArmModel[27].addShapeBox(-65F, 150F, -29F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm123
		rightArmModel[27].setRotationPoint(2F, -301F, -118F);
		rightArmModel[27].rotateAngleZ = 0.41887902F;

		rightArmModel[28].addShapeBox(-25F, 76F, -74F, 50, 15, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm124
		rightArmModel[28].setRotationPoint(2F, -301F, -118F);
		rightArmModel[28].rotateAngleZ = -0.34906585F;

		rightArmModel[29].addShapeBox(9F, 8F, -18F, 18, 35, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm125
		rightArmModel[29].setRotationPoint(2F, -301F, -118F);
		rightArmModel[29].rotateAngleZ = -0.34906585F;

		rightArmModel[30].addShapeBox(-44F, -27F, -91F, 86, 42, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm126
		rightArmModel[30].setRotationPoint(2F, -301F, -118F);
		rightArmModel[30].rotateAngleZ = -0.34906585F;

		rightArmModel[31].addShapeBox(-97F, 150F, -77F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm127
		rightArmModel[31].setRotationPoint(2F, -301F, -118F);
		rightArmModel[31].rotateAngleZ = 0.41887902F;

		rightArmModel[32].addShapeBox(-81.5F, 150F, -77F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm128
		rightArmModel[32].setRotationPoint(2F, -301F, -118F);
		rightArmModel[32].rotateAngleZ = 0.41887902F;

		rightArmModel[33].addShapeBox(27F, -27F, -33F, 15, 40, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // RightArm129
		rightArmModel[33].setRotationPoint(2F, -301F, -118F);
		rightArmModel[33].rotateAngleZ = -0.34906585F;

		rightArmModel[34].addShapeBox(-73F, 199F, -86F, 7, 46, 19, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm13
		rightArmModel[34].setRotationPoint(2F, -301F, -118F);
		rightArmModel[34].rotateAngleZ = 0.27925268F;

		rightArmModel[35].addShapeBox(-44F, -27F, -33F, 15, 40, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // RightArm130
		rightArmModel[35].setRotationPoint(2F, -301F, -118F);
		rightArmModel[35].rotateAngleZ = -0.34906585F;

		rightArmModel[36].addShapeBox(-65F, 150F, -77F, 12, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm131
		rightArmModel[36].setRotationPoint(2F, -301F, -118F);
		rightArmModel[36].rotateAngleZ = 0.41887902F;

		rightArmModel[37].addShapeBox(13F, 42F, -52F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // RightArm132
		rightArmModel[37].setRotationPoint(2F, -301F, -118F);
		rightArmModel[37].rotateAngleZ = -0.34906585F;

		rightArmModel[38].addShapeBox(13F, 37F, -52F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm133
		rightArmModel[38].setRotationPoint(2F, -301F, -118F);
		rightArmModel[38].rotateAngleZ = -0.34906585F;

		rightArmModel[39].addShapeBox(-23F, 37F, -52F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm134
		rightArmModel[39].setRotationPoint(2F, -301F, -118F);
		rightArmModel[39].rotateAngleZ = -0.34906585F;

		rightArmModel[40].addShapeBox(-23F, 42F, -52F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // RightArm135
		rightArmModel[40].setRotationPoint(2F, -301F, -118F);
		rightArmModel[40].rotateAngleZ = -0.34906585F;

		rightArmModel[41].addShapeBox(15F, 38F, -43F, 6, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm136
		rightArmModel[41].setRotationPoint(2F, -301F, -118F);
		rightArmModel[41].rotateAngleZ = -0.34906585F;

		rightArmModel[42].addShapeBox(14F, 37F, -34F, 8, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm137
		rightArmModel[42].setRotationPoint(2F, -301F, -118F);
		rightArmModel[42].rotateAngleZ = -0.34906585F;

		rightArmModel[43].addShapeBox(-22F, 37F, -34F, 8, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm138
		rightArmModel[43].setRotationPoint(2F, -301F, -118F);
		rightArmModel[43].rotateAngleZ = -0.34906585F;

		rightArmModel[44].addBox(-25F, 91F, -74F, 26, 12, 16, 0F); // RightArm139
		rightArmModel[44].setRotationPoint(2F, -301F, -118F);
		rightArmModel[44].rotateAngleZ = -0.34906585F;

		rightArmModel[45].addShapeBox(-34F, 199F, -55F, 12, 46, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm14
		rightArmModel[45].setRotationPoint(2F, -301F, -118F);
		rightArmModel[45].rotateAngleZ = 0.27925268F;

		rightArmModel[46].addShapeBox(9F, 43F, -18F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // RightArm140
		rightArmModel[46].setRotationPoint(2F, -301F, -118F);
		rightArmModel[46].rotateAngleZ = -0.34906585F;

		rightArmModel[47].addShapeBox(-21F, 38F, -43F, 6, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm141
		rightArmModel[47].setRotationPoint(2F, -301F, -118F);
		rightArmModel[47].rotateAngleZ = -0.34906585F;

		rightArmModel[48].addShapeBox(-76F, 188F, -69F, 50, 20, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm142
		rightArmModel[48].setRotationPoint(2F, -301F, -118F);
		rightArmModel[48].rotateAngleZ = 0.27925268F;

		rightArmModel[49].addShapeBox(-81F, 194F, -38F, 58, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm143
		rightArmModel[49].setRotationPoint(2F, -301F, -118F);
		rightArmModel[49].rotateAngleZ = 0.27925268F;

		rightArmModel[50].addBox(-34F, 199F, -67F, 12, 46, 12, 0F); // RightArm144
		rightArmModel[50].setRotationPoint(2F, -301F, -118F);
		rightArmModel[50].rotateAngleZ = 0.27925268F;

		rightArmModel[51].addShapeBox(-23F, -37F, -18F, 14, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm145
		rightArmModel[51].setRotationPoint(2F, -301F, -118F);
		rightArmModel[51].rotateAngleZ = -0.34906585F;

		rightArmModel[52].addShapeBox(1F, 91F, -74F, 24, 12, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightArm146
		rightArmModel[52].setRotationPoint(2F, -301F, -118F);
		rightArmModel[52].rotateAngleZ = -0.34906585F;

		rightArmModel[53].addShapeBox(-82F, 194F, -67F, 60, 5, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm147
		rightArmModel[53].setRotationPoint(2F, -301F, -118F);
		rightArmModel[53].rotateAngleZ = 0.27925268F;

		rightArmModel[54].addBox(-82F, 199F, -67F, 12, 46, 12, 0F); // RightArm148
		rightArmModel[54].setRotationPoint(2F, -301F, -118F);
		rightArmModel[54].rotateAngleZ = 0.27925268F;

		rightArmModel[55].addShapeBox(-71F, 82F, -47F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm149
		rightArmModel[55].setRotationPoint(2F, -301F, -118F);
		rightArmModel[55].rotateAngleZ = 0.41887902F;

		rightArmModel[56].addShapeBox(7F, 98F, -72F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm15
		rightArmModel[56].setRotationPoint(2F, -301F, -118F);
		rightArmModel[56].rotateAngleZ = -0.34906585F;

		rightArmModel[57].addShapeBox(-27F, 8F, -18F, 18, 35, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm150
		rightArmModel[57].setRotationPoint(2F, -301F, -118F);
		rightArmModel[57].rotateAngleZ = -0.34906585F;

		rightArmModel[58].addShapeBox(-34F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm151
		rightArmModel[58].setRotationPoint(2F, -301F, -118F);
		rightArmModel[58].rotateAngleZ = 0.27925268F;

		rightArmModel[59].addShapeBox(-49F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm152
		rightArmModel[59].setRotationPoint(3F, -301F, -118F);
		rightArmModel[59].rotateAngleZ = 0.27925268F;

		rightArmModel[60].addShapeBox(-67F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm153
		rightArmModel[60].setRotationPoint(3F, -301F, -118F);
		rightArmModel[60].rotateAngleZ = 0.27925268F;

		rightArmModel[61].addShapeBox(-80F, 245F, -65F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm154
		rightArmModel[61].setRotationPoint(2F, -301F, -118F);
		rightArmModel[61].rotateAngleZ = 0.27925268F;

		rightArmModel[62].addShapeBox(-80F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm155
		rightArmModel[62].setRotationPoint(2F, -301F, -118F);
		rightArmModel[62].rotateAngleZ = 0.27925268F;

		rightArmModel[63].addShapeBox(-67F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm156
		rightArmModel[63].setRotationPoint(3F, -301F, -118F);
		rightArmModel[63].rotateAngleZ = 0.27925268F;

		rightArmModel[64].addShapeBox(-49F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm157
		rightArmModel[64].setRotationPoint(3F, -301F, -118F);
		rightArmModel[64].rotateAngleZ = 0.27925268F;

		rightArmModel[65].addShapeBox(-101F, 102F, -87F, 52, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm158
		rightArmModel[65].setRotationPoint(2F, -301F, -118F);
		rightArmModel[65].rotateAngleZ = 0.41887902F;

		rightArmModel[66].addShapeBox(-101F, 146F, -85F, 52, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm159
		rightArmModel[66].setRotationPoint(2F, -301F, -118F);
		rightArmModel[66].rotateAngleZ = 0.41887902F;

		rightArmModel[67].addShapeBox(-23F, -42F, -18F, 14, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm16
		rightArmModel[67].setRotationPoint(2F, -301F, -118F);
		rightArmModel[67].rotateAngleZ = -0.34906585F;

		rightArmModel[68].addShapeBox(-106F, 128F, -67F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm160
		rightArmModel[68].setRotationPoint(2F, -301F, -118F);
		rightArmModel[68].rotateAngleZ = 0.41887902F;

		rightArmModel[69].addShapeBox(-101F, 128F, -84F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm161
		rightArmModel[69].setRotationPoint(2F, -301F, -118F);
		rightArmModel[69].rotateAngleZ = 0.41887902F;

		rightArmModel[70].addShapeBox(-54F, 128F, -84F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm162
		rightArmModel[70].setRotationPoint(2F, -301F, -118F);
		rightArmModel[70].rotateAngleZ = 0.41887902F;

		rightArmModel[71].addShapeBox(-49F, 128F, -67F, 5, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm163
		rightArmModel[71].setRotationPoint(2F, -301F, -118F);
		rightArmModel[71].rotateAngleZ = 0.41887902F;

		rightArmModel[72].addShapeBox(-101F, 102F, -15F, 52, 26, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm164
		rightArmModel[72].setRotationPoint(2F, -301F, -118F);
		rightArmModel[72].rotateAngleZ = 0.41887902F;

		rightArmModel[73].addShapeBox(-101F, 149F, -15F, 52, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm165
		rightArmModel[73].setRotationPoint(2F, -301F, -118F);
		rightArmModel[73].rotateAngleZ = 0.41887902F;

		rightArmModel[74].addShapeBox(-49F, 102F, -34F, 3, 26, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // RightArm167
		rightArmModel[74].setRotationPoint(2F, -301F, -118F);
		rightArmModel[74].rotateAngleZ = 0.41887902F;

		rightArmModel[75].addShapeBox(-104F, 102F, -34F, 3, 26, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // RightArm168
		rightArmModel[75].setRotationPoint(2F, -301F, -118F);
		rightArmModel[75].rotateAngleZ = 0.41887902F;

		rightArmModel[76].addShapeBox(-49F, 149F, -34F, 3, 14, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // RightArm169
		rightArmModel[76].setRotationPoint(2F, -301F, -118F);
		rightArmModel[76].rotateAngleZ = 0.41887902F;

		rightArmModel[77].addShapeBox(-82F, 199F, -55F, 12, 46, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm17
		rightArmModel[77].setRotationPoint(2F, -301F, -118F);
		rightArmModel[77].rotateAngleZ = 0.27925268F;

		rightArmModel[78].addShapeBox(-104F, 149F, -34F, 3, 14, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // RightArm170
		rightArmModel[78].setRotationPoint(2F, -301F, -118F);
		rightArmModel[78].rotateAngleZ = 0.41887902F;

		rightArmModel[79].addShapeBox(-49F, 102F, -87F, 8, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm172
		rightArmModel[79].setRotationPoint(2F, -301F, -118F);
		rightArmModel[79].rotateAngleZ = 0.41887902F;

		rightArmModel[80].addShapeBox(-49F, 146F, -85F, 6, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm173
		rightArmModel[80].setRotationPoint(2F, -301F, -118F);
		rightArmModel[80].rotateAngleZ = 0.41887902F;

		rightArmModel[81].addShapeBox(-109F, 102F, -87F, 8, 26, 26, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm174
		rightArmModel[81].setRotationPoint(2F, -301F, -118F);
		rightArmModel[81].rotateAngleZ = 0.41887902F;

		rightArmModel[82].addShapeBox(-107F, 146F, -85F, 6, 17, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm175
		rightArmModel[82].setRotationPoint(2F, -301F, -118F);
		rightArmModel[82].rotateAngleZ = 0.41887902F;

		rightArmModel[83].addBox(32F, -28F, -52F, 5, 1, 12, 0F); // RightArm176
		rightArmModel[83].setRotationPoint(2F, -301F, -118F);
		rightArmModel[83].rotateAngleZ = -0.34906585F;

		rightArmModel[84].addBox(-40F, -28F, -52F, 5, 1, 12, 0F); // RightArm177
		rightArmModel[84].setRotationPoint(2F, -301F, -118F);
		rightArmModel[84].rotateAngleZ = -0.34906585F;

		rightArmModel[85].addShapeBox(-43F, -33F, -55F, 3, 7, 18, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm178
		rightArmModel[85].setRotationPoint(2F, -301F, -118F);
		rightArmModel[85].rotateAngleZ = -0.34906585F;

		rightArmModel[86].addShapeBox(-35F, -33F, -55F, 3, 7, 18, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm179
		rightArmModel[86].setRotationPoint(2F, -301F, -118F);
		rightArmModel[86].rotateAngleZ = -0.34906585F;

		rightArmModel[87].addShapeBox(-31F, 199F, -38F, 8, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm18
		rightArmModel[87].setRotationPoint(2F, -301F, -118F);
		rightArmModel[87].rotateAngleZ = 0.27925268F;

		rightArmModel[88].addShapeBox(-40F, -33F, -40F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm180
		rightArmModel[88].setRotationPoint(2F, -301F, -118F);
		rightArmModel[88].rotateAngleZ = -0.34906585F;

		rightArmModel[89].addShapeBox(-40F, -33F, -55F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm181
		rightArmModel[89].setRotationPoint(2F, -301F, -118F);
		rightArmModel[89].rotateAngleZ = -0.34906585F;

		rightArmModel[90].addShapeBox(37F, -33F, -55F, 3, 7, 18, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm182
		rightArmModel[90].setRotationPoint(2F, -301F, -118F);
		rightArmModel[90].rotateAngleZ = -0.34906585F;

		rightArmModel[91].addShapeBox(32F, -33F, -55F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm183
		rightArmModel[91].setRotationPoint(2F, -301F, -118F);
		rightArmModel[91].rotateAngleZ = -0.34906585F;

		rightArmModel[92].addShapeBox(29F, -33F, -55F, 3, 7, 18, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm184
		rightArmModel[92].setRotationPoint(2F, -301F, -118F);
		rightArmModel[92].rotateAngleZ = -0.34906585F;

		rightArmModel[93].addShapeBox(32F, -33F, -40F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm185
		rightArmModel[93].setRotationPoint(2F, -301F, -118F);
		rightArmModel[93].rotateAngleZ = -0.34906585F;

		rightArmModel[94].addShapeBox(-81F, 199F, -38F, 8, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm19
		rightArmModel[94].setRotationPoint(2F, -301F, -118F);
		rightArmModel[94].rotateAngleZ = 0.27925268F;

		rightArmModel[95].addShapeBox(9F, -28F, -20F, 18, 54, 20, 0F,0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F); // RightArm2
		rightArmModel[95].setRotationPoint(2F, -301F, -118F);
		rightArmModel[95].rotateAngleZ = -0.34906585F;

		rightArmModel[96].addShapeBox(-81F, 199F, -26F, 58, 44, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // RightArm20
		rightArmModel[96].setRotationPoint(2F, -301F, -118F);
		rightArmModel[96].rotateAngleZ = 0.27925268F;

		rightArmModel[97].addShapeBox(-40F, 238F, -34F, 9, 5, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm21
		rightArmModel[97].setRotationPoint(2F, -301F, -118F);
		rightArmModel[97].rotateAngleZ = 0.27925268F;

		rightArmModel[98].addShapeBox(-56F, 238F, -34F, 9, 5, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm22
		rightArmModel[98].setRotationPoint(2F, -301F, -118F);
		rightArmModel[98].rotateAngleZ = 0.27925268F;

		rightArmModel[99].addShapeBox(-72F, 238F, -34F, 9, 5, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm23
		rightArmModel[99].setRotationPoint(2F, -301F, -118F);
		rightArmModel[99].rotateAngleZ = 0.27925268F;

		rightArmModel[100].addShapeBox(-34F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // RightArm24
		rightArmModel[100].setRotationPoint(2F, -301F, -118F);
		rightArmModel[100].rotateAngleZ = 0.27925268F;

		rightArmModel[101].addShapeBox(-49F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // RightArm25
		rightArmModel[101].setRotationPoint(2F, -301F, -118F);
		rightArmModel[101].rotateAngleZ = 0.27925268F;

		rightArmModel[102].addShapeBox(-66F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // RightArm26
		rightArmModel[102].setRotationPoint(2F, -301F, -118F);
		rightArmModel[102].rotateAngleZ = 0.27925268F;

		rightArmModel[103].addShapeBox(7F, 88F, -72F, 30, 10, 25, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm27
		rightArmModel[103].setRotationPoint(2F, -301F, -118F);
		rightArmModel[103].rotateAngleZ = -0.34906585F;

		rightArmModel[104].addShapeBox(-21F, -41F, -35F, 10, 10, 21, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm28
		rightArmModel[104].setRotationPoint(2F, -301F, -118F);
		rightArmModel[104].rotateAngleZ = -0.34906585F;

		rightArmModel[105].addShapeBox(-81F, 238F, -37F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // RightArm29
		rightArmModel[105].setRotationPoint(2F, -301F, -118F);
		rightArmModel[105].rotateAngleZ = 0.27925268F;

		rightArmModel[106].addShapeBox(-23F, 68F, -40F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F); // RightArm3
		rightArmModel[106].setRotationPoint(2F, -301F, -118F);
		rightArmModel[106].rotateAngleZ = -0.34906585F;

		rightArmModel[107].addBox(-25F, 91F, -30F, 26, 12, 16, 0F); // RightArm30
		rightArmModel[107].setRotationPoint(2F, -301F, -124F);
		rightArmModel[107].rotateAngleZ = -0.34906585F;

		rightArmModel[108].addShapeBox(-20F, -44F, -58F, 8, 8, 23, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm31
		rightArmModel[108].setRotationPoint(2F, -301F, -118F);
		rightArmModel[108].rotateAngleZ = -0.34906585F;

		rightArmModel[109].addShapeBox(11F, -41F, -35F, 10, 10, 21, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm32
		rightArmModel[109].setRotationPoint(2F, -301F, -118F);
		rightArmModel[109].rotateAngleZ = -0.34906585F;

		rightArmModel[110].addShapeBox(7F, 108F, -72F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // RightArm33
		rightArmModel[110].setRotationPoint(2F, -301F, -118F);
		rightArmModel[110].rotateAngleZ = -0.34906585F;

		rightArmModel[111].addShapeBox(12F, -44F, -58F, 8, 8, 23, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm34
		rightArmModel[111].setRotationPoint(2F, -301F, -118F);
		rightArmModel[111].rotateAngleZ = -0.34906585F;

		rightArmModel[112].addShapeBox(-71F, 72F, -47F, 30, 10, 25, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm35
		rightArmModel[112].setRotationPoint(2F, -301F, -118F);
		rightArmModel[112].rotateAngleZ = 0.41887902F;

		rightArmModel[113].addShapeBox(11F, -50F, -66F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm36
		rightArmModel[113].setRotationPoint(2F, -301F, -118F);
		rightArmModel[113].rotateAngleZ = -0.34906585F;

		rightArmModel[114].addShapeBox(-53F, 91F, -57F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // RightArm37
		rightArmModel[114].setRotationPoint(2F, -301F, -118F);

		rightArmModel[115].addShapeBox(-53F, 91F, -45F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // RightArm38
		rightArmModel[115].setRotationPoint(2F, -301F, -118F);

		rightArmModel[116].addShapeBox(11F, -45F, -66F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // RightArm39
		rightArmModel[116].setRotationPoint(2F, -301F, -118F);
		rightArmModel[116].rotateAngleZ = -0.34906585F;

		rightArmModel[117].addShapeBox(-9F, -28F, -20F, 18, 54, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm4
		rightArmModel[117].setRotationPoint(2F, -301F, -118F);
		rightArmModel[117].rotateAngleZ = -0.34906585F;

		rightArmModel[118].addShapeBox(-21F, -50F, -66F, 10, 5, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm40
		rightArmModel[118].setRotationPoint(2F, -301F, -118F);
		rightArmModel[118].rotateAngleZ = -0.34906585F;

		rightArmModel[119].addShapeBox(-65F, 99.5F, -44.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // RightArm41
		rightArmModel[119].setRotationPoint(2F, -301F, -118F);

		rightArmModel[120].addShapeBox(-65F, 99.5F, -56.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // RightArm42
		rightArmModel[120].setRotationPoint(2F, -301F, -118F);

		rightArmModel[121].addShapeBox(-21F, -45F, -66F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // RightArm43
		rightArmModel[121].setRotationPoint(2F, -301F, -118F);
		rightArmModel[121].rotateAngleZ = -0.34906585F;

		rightArmModel[122].addShapeBox(-23F, 68F, -55F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm44
		rightArmModel[122].setRotationPoint(2F, -301F, -118F);
		rightArmModel[122].rotateAngleZ = -0.34906585F;

		rightArmModel[123].addShapeBox(-27F, -28F, -20F, 18, 54, 20, 0F,0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // RightArm45
		rightArmModel[123].setRotationPoint(2F, -301F, -118F);
		rightArmModel[123].rotateAngleZ = -0.34906585F;

		rightArmModel[124].addShapeBox(-57F, 116F, -57F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // RightArm46
		rightArmModel[124].setRotationPoint(2F, -301F, -118F);

		rightArmModel[125].addShapeBox(-9F, -28F, -56F, 18, 54, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm47
		rightArmModel[125].setRotationPoint(2F, -301F, -118F);
		rightArmModel[125].rotateAngleZ = -0.34906585F;

		rightArmModel[126].addShapeBox(-69F, 102.5F, -56.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // RightArm48
		rightArmModel[126].setRotationPoint(2F, -301F, -118F);

		rightArmModel[127].addShapeBox(-57F, 116F, -45F, 12, 8, 8, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // RightArm49
		rightArmModel[127].setRotationPoint(2F, -301F, -118F);

		rightArmModel[128].addShapeBox(-27F, 43F, -18F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // RightArm5
		rightArmModel[128].setRotationPoint(2F, -301F, -118F);
		rightArmModel[128].rotateAngleZ = -0.34906585F;

		rightArmModel[129].addShapeBox(-23F, -25F, -40F, 46, 48, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // RightArm50
		rightArmModel[129].setRotationPoint(2F, -301F, -118F);
		rightArmModel[129].rotateAngleZ = -0.34906585F;

		rightArmModel[130].addShapeBox(-23F, -25F, -56F, 46, 48, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm51
		rightArmModel[130].setRotationPoint(2F, -301F, -118F);
		rightArmModel[130].rotateAngleZ = -0.34906585F;

		rightArmModel[131].addShapeBox(-69F, 102.5F, -44.5F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 0F, 0F); // RightArm52
		rightArmModel[131].setRotationPoint(2F, -301F, -118F);

		rightArmModel[132].addShapeBox(-71F, 108.5F, -57F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // RightArm53
		rightArmModel[132].setRotationPoint(2F, -301F, -118F);

		rightArmModel[133].addShapeBox(-23F, -25F, -72F, 46, 48, 16, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm54
		rightArmModel[133].setRotationPoint(2F, -301F, -118F);
		rightArmModel[133].rotateAngleZ = -0.34906585F;

		rightArmModel[134].addShapeBox(-71F, 103.5F, -57F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm55
		rightArmModel[134].setRotationPoint(2F, -301F, -118F);

		rightArmModel[135].addShapeBox(-30F, -8F, -56F, 58, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm56
		rightArmModel[135].setRotationPoint(2F, -301F, -118F);
		rightArmModel[135].rotateAngleZ = -0.34906585F;

		rightArmModel[136].addShapeBox(-71F, 99.5F, -57F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm57
		rightArmModel[136].setRotationPoint(2F, -301F, -118F);

		rightArmModel[137].addShapeBox(-9F, -28F, -72F, 18, 54, 16, 0F,0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm58
		rightArmModel[137].setRotationPoint(2F, -301F, -118F);
		rightArmModel[137].rotateAngleZ = -0.34906585F;

		rightArmModel[138].addShapeBox(-71F, 99.5F, -45F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm59
		rightArmModel[138].setRotationPoint(2F, -301F, -118F);

		rightArmModel[139].addShapeBox(-71F, 92F, -47F, 30, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // RightArm6
		rightArmModel[139].setRotationPoint(2F, -301F, -118F);
		rightArmModel[139].rotateAngleZ = 0.41887902F;

		rightArmModel[140].addShapeBox(-71F, 103.5F, -45F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm60
		rightArmModel[140].setRotationPoint(2F, -301F, -118F);

		rightArmModel[141].addShapeBox(-13F, 28F, -65F, 26, 24, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm61
		rightArmModel[141].setRotationPoint(2F, -301F, -118F);
		rightArmModel[141].rotateAngleZ = -0.34906585F;

		rightArmModel[142].addShapeBox(-71F, 108.5F, -45F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // RightArm62
		rightArmModel[142].setRotationPoint(2F, -301F, -118F);

		rightArmModel[143].addShapeBox(21F, 26F, -67F, 8, 46, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // RightArm63
		rightArmModel[143].setRotationPoint(2F, -301F, -118F);
		rightArmModel[143].rotateAngleZ = -0.34906585F;

		rightArmModel[144].addShapeBox(-23F, 60F, -55F, 45, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm64
		rightArmModel[144].setRotationPoint(2F, -301F, -118F);
		rightArmModel[144].rotateAngleZ = -0.34906585F;

		rightArmModel[145].addBox(-30F, 53F, -59F, 59, 7, 23, 0F); // RightArm65
		rightArmModel[145].setRotationPoint(2F, -301F, -118F);
		rightArmModel[145].rotateAngleZ = -0.34906585F;

		rightArmModel[146].addShapeBox(-52F, 87.5F, -62F, 12, 44, 30, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 5F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -7F, -2F); // RightArm66
		rightArmModel[146].setRotationPoint(2F, -301F, -118F);
		rightArmModel[146].rotateAngleZ = -0.20943951F;

		rightArmModel[147].addShapeBox(-99F, 87F, -37F, 22, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm67
		rightArmModel[147].setRotationPoint(2F, -301F, -118F);
		rightArmModel[147].rotateAngleZ = 0.41887902F;

		rightArmModel[148].addBox(-30F, 26F, -59F, 59, 7, 23, 0F); // RightArm68
		rightArmModel[148].setRotationPoint(2F, -301F, -118F);
		rightArmModel[148].rotateAngleZ = -0.34906585F;

		rightArmModel[149].addShapeBox(21F, 26F, -40F, 8, 46, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // RightArm69
		rightArmModel[149].setRotationPoint(2F, -301F, -118F);
		rightArmModel[149].rotateAngleZ = -0.34906585F;

		rightArmModel[150].addShapeBox(-34F, 245F, -49F, 10, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // RightArm7
		rightArmModel[150].setRotationPoint(2F, -301F, -118F);
		rightArmModel[150].rotateAngleZ = 0.27925268F;

		rightArmModel[151].addShapeBox(-99F, 87F, -79F, 22, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm70
		rightArmModel[151].setRotationPoint(2F, -301F, -118F);
		rightArmModel[151].rotateAngleZ = 0.41887902F;

		rightArmModel[152].addShapeBox(-30F, 26F, -67F, 8, 46, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // RightArm71
		rightArmModel[152].setRotationPoint(2F, -301F, -118F);
		rightArmModel[152].rotateAngleZ = -0.34906585F;

		rightArmModel[153].addShapeBox(-99F, 102F, -79F, 48, 16, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm72
		rightArmModel[153].setRotationPoint(2F, -301F, -118F);
		rightArmModel[153].rotateAngleZ = 0.41887902F;

		rightArmModel[154].addBox(-30F, 33F, -50F, 5, 20, 6, 0F); // RightArm73
		rightArmModel[154].setRotationPoint(2F, -301F, -118F);
		rightArmModel[154].rotateAngleZ = -0.34906585F;

		rightArmModel[155].addBox(-127F, 111F, 63F, 28, 46, 20, 0F); // RightArm74
		rightArmModel[155].setRotationPoint(2F, -301F, -238F);
		rightArmModel[155].rotateAngleZ = 0.41887902F;

		rightArmModel[156].addShapeBox(-132F, 111F, 63F, 5, 46, 20, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // RightArm75
		rightArmModel[156].setRotationPoint(2F, -301F, -238F);
		rightArmModel[156].rotateAngleZ = 0.41887902F;

		rightArmModel[157].addShapeBox(-30F, 26F, -40F, 8, 46, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // RightArm76
		rightArmModel[157].setRotationPoint(2F, -301F, -118F);
		rightArmModel[157].rotateAngleZ = -0.34906585F;

		rightArmModel[158].addShapeBox(-77F, 87F, -79F, 16, 15, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm77
		rightArmModel[158].setRotationPoint(2F, -301F, -118F);
		rightArmModel[158].rotateAngleZ = 0.41887902F;

		rightArmModel[159].addBox(24F, 33F, -50F, 5, 20, 6, 0F); // RightArm78
		rightArmModel[159].setRotationPoint(2F, -301F, -118F);
		rightArmModel[159].rotateAngleZ = -0.34906585F;

		rightArmModel[160].addShapeBox(9F, 14F, -65F, 12, 19, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm79
		rightArmModel[160].setRotationPoint(2F, -301F, -118F);
		rightArmModel[160].rotateAngleZ = -0.34906585F;

		rightArmModel[161].addShapeBox(-70F, 237F, -67F, 36, 8, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm8
		rightArmModel[161].setRotationPoint(2F, -301F, -118F);
		rightArmModel[161].rotateAngleZ = 0.27925268F;

		rightArmModel[162].addShapeBox(-61F, 87F, -79F, 10, 15, 64, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm80
		rightArmModel[162].setRotationPoint(2F, -301F, -118F);
		rightArmModel[162].rotateAngleZ = 0.41887902F;

		rightArmModel[163].addShapeBox(-22F, 14F, -65F, 12, 19, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm81
		rightArmModel[163].setRotationPoint(2F, -301F, -118F);
		rightArmModel[163].rotateAngleZ = -0.34906585F;

		rightArmModel[164].addBox(-51F, 102F, 64F, 6, 26, 20, 0F); // RightArm82
		rightArmModel[164].setRotationPoint(2F, -301F, -238F);
		rightArmModel[164].rotateAngleZ = 0.41887902F;

		rightArmModel[165].addBox(-51F, 145F, 64F, 6, 18, 20, 0F); // RightArm83
		rightArmModel[165].setRotationPoint(2F, -301F, -238F);
		rightArmModel[165].rotateAngleZ = 0.41887902F;

		rightArmModel[166].addShapeBox(-22F, 50F, -28F, 43, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // RightArm84
		rightArmModel[166].setRotationPoint(2F, -301F, -118F);
		rightArmModel[166].rotateAngleZ = -0.34906585F;

		rightArmModel[167].addShapeBox(-23F, 68F, -70F, 45, 8, 15, 0F,-15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm85
		rightArmModel[167].setRotationPoint(2F, -301F, -118F);
		rightArmModel[167].rotateAngleZ = -0.34906585F;

		rightArmModel[168].addShapeBox(9F, -37F, -18F, 14, 24, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm86
		rightArmModel[168].setRotationPoint(2F, -301F, -118F);
		rightArmModel[168].rotateAngleZ = -0.34906585F;

		rightArmModel[169].addShapeBox(-22F, 50F, -71F, 43, 10, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm87
		rightArmModel[169].setRotationPoint(2F, -301F, -118F);
		rightArmModel[169].rotateAngleZ = -0.34906585F;

		rightArmModel[170].addShapeBox(-89F, 135F, -60F, 28, 18, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm88
		rightArmModel[170].setRotationPoint(2F, -301F, -118F);
		rightArmModel[170].rotateAngleZ = 0.41887902F;

		rightArmModel[171].addShapeBox(-22F, 38F, -71F, 43, 6, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm89
		rightArmModel[171].setRotationPoint(2F, -301F, -118F);
		rightArmModel[171].rotateAngleZ = -0.34906585F;

		rightArmModel[172].addShapeBox(-82F, 196F, -35F, 60, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm9
		rightArmModel[172].setRotationPoint(2F, -301F, -118F);
		rightArmModel[172].rotateAngleZ = 0.27925268F;

		rightArmModel[173].addShapeBox(-90F, 118F, -61F, 30, 18, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm90
		rightArmModel[173].setRotationPoint(2F, -301F, -118F);
		rightArmModel[173].rotateAngleZ = 0.41887902F;

		rightArmModel[174].addShapeBox(-99F, 153F, -79F, 48, 10, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm91
		rightArmModel[174].setRotationPoint(2F, -301F, -118F);
		rightArmModel[174].rotateAngleZ = 0.41887902F;

		rightArmModel[175].addShapeBox(-22F, 27F, -71F, 43, 6, 4, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm92
		rightArmModel[175].setRotationPoint(2F, -301F, -118F);
		rightArmModel[175].rotateAngleZ = -0.34906585F;

		rightArmModel[176].addShapeBox(-103F, 163F, -79F, 56, 10, 64, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm93
		rightArmModel[176].setRotationPoint(2F, -301F, -118F);
		rightArmModel[176].rotateAngleZ = 0.41887902F;

		rightArmModel[177].addBox(-11F, 33F, -70F, 22, 17, 6, 0F); // RightArm94
		rightArmModel[177].setRotationPoint(2F, -301F, -118F);
		rightArmModel[177].rotateAngleZ = -0.34906585F;

		rightArmModel[178].addBox(-22F, 50F, -67F, 43, 10, 3, 0F); // RightArm95
		rightArmModel[178].setRotationPoint(2F, -301F, -118F);
		rightArmModel[178].rotateAngleZ = -0.34906585F;

		rightArmModel[179].addShapeBox(-71F, 178F, -67F, 40, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm96
		rightArmModel[179].setRotationPoint(2F, -301F, -118F);
		rightArmModel[179].rotateAngleZ = 0.27925268F;

		rightArmModel[180].addShapeBox(-65F, 118F, -29F, 12, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightArm97
		rightArmModel[180].setRotationPoint(2F, -301F, -118F);
		rightArmModel[180].rotateAngleZ = 0.41887902F;

		rightArmModel[181].addBox(-22F, 38F, -65F, 43, 6, 3, 0F); // RightArm98
		rightArmModel[181].setRotationPoint(2F, -301F, -118F);
		rightArmModel[181].rotateAngleZ = -0.34906585F;

		rightArmModel[182].addBox(-22F, 27F, -65F, 43, 6, 3, 0F); // RightArm99
		rightArmModel[182].setRotationPoint(2F, -301F, -118F);
		rightArmModel[182].rotateAngleZ = -0.34906585F;
	}



}