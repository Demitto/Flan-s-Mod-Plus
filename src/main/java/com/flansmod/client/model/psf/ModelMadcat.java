//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
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


public class ModelMadcat extends ModelMecha
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMadcat()
	{
		bodyModel = new ModelRendererTurbo[190];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // B1
		bodyModel[1] = new ModelRendererTurbo(this, 108, 965, textureX, textureY); // B2
		bodyModel[2] = new ModelRendererTurbo(this, 343, 957, textureX, textureY); // B3
		bodyModel[3] = new ModelRendererTurbo(this, 609, 916, textureX, textureY); // B4
		bodyModel[4] = new ModelRendererTurbo(this, 817, 931, textureX, textureY); // B5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 904, textureX, textureY); // B6
		bodyModel[6] = new ModelRendererTurbo(this, 62, 965, textureX, textureY); // B7
		bodyModel[7] = new ModelRendererTurbo(this, 62, 965, textureX, textureY); // B8
		bodyModel[8] = new ModelRendererTurbo(this, 75, 910, textureX, textureY); // B9
		bodyModel[9] = new ModelRendererTurbo(this, 75, 910, textureX, textureY); // B10
		bodyModel[10] = new ModelRendererTurbo(this, 300, 965, textureX, textureY); // B11
		bodyModel[11] = new ModelRendererTurbo(this, 300, 965, textureX, textureY); // B12
		bodyModel[12] = new ModelRendererTurbo(this, 157, 928, textureX, textureY); // B13
		bodyModel[13] = new ModelRendererTurbo(this, 157, 928, textureX, textureY); // B14
		bodyModel[14] = new ModelRendererTurbo(this, 228, 885, textureX, textureY); // B15
		bodyModel[15] = new ModelRendererTurbo(this, 228, 806, textureX, textureY); // B16
		bodyModel[16] = new ModelRendererTurbo(this, 325, 878, textureX, textureY); // B17
		bodyModel[17] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // B18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 904, textureX, textureY); // B19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 904, textureX, textureY); // B20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 887, textureX, textureY); // B21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 887, textureX, textureY); // B22
		bodyModel[22] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // B23
		bodyModel[23] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // B24
		bodyModel[24] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // B25
		bodyModel[25] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // B26
		bodyModel[26] = new ModelRendererTurbo(this, 463, 925, textureX, textureY); // B27
		bodyModel[27] = new ModelRendererTurbo(this, 520, 898, textureX, textureY); // B28
		bodyModel[28] = new ModelRendererTurbo(this, 611, 862, textureX, textureY); // B29
		bodyModel[29] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // B30
		bodyModel[30] = new ModelRendererTurbo(this, 523, 36, textureX, textureY); // B31 58 888
		bodyModel[31] = new ModelRendererTurbo(this, 599, 20, textureX, textureY); // B32 98 888
		bodyModel[32] = new ModelRendererTurbo(this, 681, 20, textureX, textureY); // B33 142 888
		bodyModel[33] = new ModelRendererTurbo(this, 0, 862, textureX, textureY); // B34
		bodyModel[34] = new ModelRendererTurbo(this, 155, 795, textureX, textureY); // B35
		bodyModel[35] = new ModelRendererTurbo(this, 70, 862, textureX, textureY); // B36
		bodyModel[36] = new ModelRendererTurbo(this, 0, 862, textureX, textureY); // B37
		bodyModel[37] = new ModelRendererTurbo(this, 0, 862, textureX, textureY); // B38
		bodyModel[38] = new ModelRendererTurbo(this, 157, 862, textureX, textureY); // B39
		bodyModel[39] = new ModelRendererTurbo(this, 157, 862, textureX, textureY); // B40
		bodyModel[40] = new ModelRendererTurbo(this, 157, 869, textureX, textureY); // B41
		bodyModel[41] = new ModelRendererTurbo(this, 157, 869, textureX, textureY); // B42
		bodyModel[42] = new ModelRendererTurbo(this, 172, 869, textureX, textureY); // B43
		bodyModel[43] = new ModelRendererTurbo(this, 172, 869, textureX, textureY); // B44
		bodyModel[44] = new ModelRendererTurbo(this, 180, 869, textureX, textureY); // B45
		bodyModel[45] = new ModelRendererTurbo(this, 180, 869, textureX, textureY); // B46
		bodyModel[46] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // AL1
		bodyModel[47] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // AL2
		bodyModel[48] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // AR1
		bodyModel[49] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // AR2
		bodyModel[50] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1a
		bodyModel[51] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1b
		bodyModel[52] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1c
		bodyModel[53] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1d
		bodyModel[54] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1e
		bodyModel[55] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1f
		bodyModel[56] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1g
		bodyModel[57] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1h
		bodyModel[58] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1i
		bodyModel[59] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1j
		bodyModel[60] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1k
		bodyModel[61] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1l
		bodyModel[62] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1m
		bodyModel[63] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1n
		bodyModel[64] = new ModelRendererTurbo(this, 325, 799, textureX, textureY); // M1o
		bodyModel[65] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2a
		bodyModel[66] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2b
		bodyModel[67] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2c
		bodyModel[68] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2d
		bodyModel[69] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2e
		bodyModel[70] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2f
		bodyModel[71] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2g
		bodyModel[72] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2h
		bodyModel[73] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2i
		bodyModel[74] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2j
		bodyModel[75] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2k
		bodyModel[76] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2l
		bodyModel[77] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2m
		bodyModel[78] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2n
		bodyModel[79] = new ModelRendererTurbo(this, 325, 812, textureX, textureY); // M2o
		bodyModel[80] = new ModelRendererTurbo(this, 308, 807, textureX, textureY); // M3
		bodyModel[81] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4a
		bodyModel[82] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4b
		bodyModel[83] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4c
		bodyModel[84] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4d
		bodyModel[85] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4e
		bodyModel[86] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4f
		bodyModel[87] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4g
		bodyModel[88] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4h
		bodyModel[89] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4i
		bodyModel[90] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4j
		bodyModel[91] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4k
		bodyModel[92] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4l
		bodyModel[93] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4m
		bodyModel[94] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4n
		bodyModel[95] = new ModelRendererTurbo(this, 325, 879, textureX, textureY); // M4o
		bodyModel[96] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5a
		bodyModel[97] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5b
		bodyModel[98] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5c
		bodyModel[99] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5d
		bodyModel[100] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5e
		bodyModel[101] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5f
		bodyModel[102] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5g
		bodyModel[103] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5h
		bodyModel[104] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5i
		bodyModel[105] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5j
		bodyModel[106] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5k
		bodyModel[107] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5l
		bodyModel[108] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5m
		bodyModel[109] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5n
		bodyModel[110] = new ModelRendererTurbo(this, 325, 892, textureX, textureY); // M5o
		bodyModel[111] = new ModelRendererTurbo(this, 308, 886, textureX, textureY); // M6
		bodyModel[112] = new ModelRendererTurbo(this, 780, 715, textureX, textureY); // HUD1
		bodyModel[113] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // HUD2
		bodyModel[114] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // HUD3
		bodyModel[115] = new ModelRendererTurbo(this, 780, 715, textureX, textureY); // HUD1
		bodyModel[116] = new ModelRendererTurbo(this, 0, 423, textureX, textureY); // HUD2
		bodyModel[117] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // HUD3
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // CP0
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // CP0a
		bodyModel[120] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // CP0b
		bodyModel[121] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // CP0c
		bodyModel[122] = new ModelRendererTurbo(this, 45, 0, textureX, textureY); // CP0d
		bodyModel[123] = new ModelRendererTurbo(this, 62, 0, textureX, textureY); // CP0e
		bodyModel[124] = new ModelRendererTurbo(this, 0, 50, textureX, textureY); // CP1a
		bodyModel[125] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // CP1b
		bodyModel[126] = new ModelRendererTurbo(this, 56, 50, textureX, textureY); // CP1c
		bodyModel[127] = new ModelRendererTurbo(this, 85, 50, textureX, textureY); // CP1d
		bodyModel[128] = new ModelRendererTurbo(this, 152, 50, textureX, textureY); // CP1e
		bodyModel[129] = new ModelRendererTurbo(this, 209, 50, textureX, textureY); // CP1f
		bodyModel[130] = new ModelRendererTurbo(this, 209, 68, textureX, textureY); // CP1g
		bodyModel[131] = new ModelRendererTurbo(this, 266, 50, textureX, textureY); // CP1h
		bodyModel[132] = new ModelRendererTurbo(this, 323, 50, textureX, textureY); // CP1i
		bodyModel[133] = new ModelRendererTurbo(this, 366, 50, textureX, textureY); // CP1j
		bodyModel[134] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // CP1k
		bodyModel[135] = new ModelRendererTurbo(this, 452, 50, textureX, textureY); // CP1l
		bodyModel[136] = new ModelRendererTurbo(this, 494, 50, textureX, textureY); // CP1m
		bodyModel[137] = new ModelRendererTurbo(this, 527, 50, textureX, textureY); // CP1n
		bodyModel[138] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // CP2a
		bodyModel[139] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // CP2b
		bodyModel[140] = new ModelRendererTurbo(this, 52, 100, textureX, textureY); // CP2c
		bodyModel[141] = new ModelRendererTurbo(this, 52, 120, textureX, textureY); // CP2d
		bodyModel[142] = new ModelRendererTurbo(this, 103, 100, textureX, textureY); // CP2e
		bodyModel[143] = new ModelRendererTurbo(this, 132, 100, textureX, textureY); // CP2f
		bodyModel[144] = new ModelRendererTurbo(this, 103, 113, textureX, textureY); // CP2g
		bodyModel[145] = new ModelRendererTurbo(this, 202, 100, textureX, textureY); // CP2h
		bodyModel[146] = new ModelRendererTurbo(this, 254, 100, textureX, textureY); // CP2i
		bodyModel[147] = new ModelRendererTurbo(this, 305, 100, textureX, textureY); // CP2j
		bodyModel[148] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // CP2k
		bodyModel[149] = new ModelRendererTurbo(this, 358, 100, textureX, textureY); // CP2l
		bodyModel[150] = new ModelRendererTurbo(this, 358, 113, textureX, textureY); // CP2m
		bodyModel[151] = new ModelRendererTurbo(this, 403, 100, textureX, textureY); // CP2n
		bodyModel[152] = new ModelRendererTurbo(this, 403, 113, textureX, textureY); // CP2o
		bodyModel[153] = new ModelRendererTurbo(this, 422, 100, textureX, textureY); // CP2p
		bodyModel[154] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // CP3
		bodyModel[155] = new ModelRendererTurbo(this, 100, 140, textureX, textureY); // CP3a
		bodyModel[156] = new ModelRendererTurbo(this, 186, 140, textureX, textureY); // CP3b
		bodyModel[157] = new ModelRendererTurbo(this, 269, 140, textureX, textureY); // CP3c
		bodyModel[158] = new ModelRendererTurbo(this, 269, 156, textureX, textureY); // CP3d
		bodyModel[159] = new ModelRendererTurbo(this, 344, 140, textureX, textureY); // CP3e
		bodyModel[160] = new ModelRendererTurbo(this, 404, 145, textureX, textureY); // CP3f
		bodyModel[161] = new ModelRendererTurbo(this, 504, 140, textureX, textureY); // CP3g
		bodyModel[162] = new ModelRendererTurbo(this, 503, 153, textureX, textureY); // CP3h
		bodyModel[163] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // CP3i
		bodyModel[164] = new ModelRendererTurbo(this, 515, 100, textureX, textureY); // CP3j
		bodyModel[165] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // CP3k
		bodyModel[166] = new ModelRendererTurbo(this, 124, 0, textureX, textureY); // CP4
		bodyModel[167] = new ModelRendererTurbo(this, 186, 0, textureX, textureY); // CP4b
		bodyModel[168] = new ModelRendererTurbo(this, 210, 0, textureX, textureY); // CP4a
		bodyModel[169] = new ModelRendererTurbo(this, 235, 0, textureX, textureY); // D1
		bodyModel[170] = new ModelRendererTurbo(this, 249, 0, textureX, textureY); // D2
		bodyModel[171] = new ModelRendererTurbo(this, 273, 0, textureX, textureY); // D3
		bodyModel[172] = new ModelRendererTurbo(this, 294, 0, textureX, textureY); // D4
		bodyModel[173] = new ModelRendererTurbo(this, 330, 0, textureX, textureY); // D5
		bodyModel[174] = new ModelRendererTurbo(this, 350, 0, textureX, textureY); // D6
		bodyModel[175] = new ModelRendererTurbo(this, 374, 0, textureX, textureY); // D7
		bodyModel[176] = new ModelRendererTurbo(this, 389, 0, textureX, textureY); // DH1
		bodyModel[177] = new ModelRendererTurbo(this, 408, 0, textureX, textureY); // DH2
		bodyModel[178] = new ModelRendererTurbo(this, 428, 0, textureX, textureY); // DH3
		bodyModel[179] = new ModelRendererTurbo(this, 448, 0, textureX, textureY); // DH4
		bodyModel[180] = new ModelRendererTurbo(this, 468, 0, textureX, textureY); // DH5
		bodyModel[181] = new ModelRendererTurbo(this, 488, 0, textureX, textureY); // DO1
		bodyModel[182] = new ModelRendererTurbo(this, 488, 16, textureX, textureY); // DO2
		bodyModel[183] = new ModelRendererTurbo(this, 440, 785, textureX, textureY); // ARg
		bodyModel[184] = new ModelRendererTurbo(this, 502, 785, textureX, textureY); // ALg
		bodyModel[185] = new ModelRendererTurbo(this, 225, 555, textureX, textureY); // AL3
		bodyModel[186] = new ModelRendererTurbo(this, 290, 555, textureX, textureY); // AL4
		bodyModel[187] = new ModelRendererTurbo(this, 225, 455, textureX, textureY); // AR3
		bodyModel[188] = new ModelRendererTurbo(this, 290, 455, textureX, textureY); // AR4
		bodyModel[189] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // DH6

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 11, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F); // B1
		bodyModel[0].setRotationPoint(27F, -143F, -24F);

		bodyModel[1].addBox(0F, 0F, 0F, 69, 11, 48, 0F); // B2
		bodyModel[1].setRotationPoint(-42F, -143F, -24F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 80, 15, 52, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -20F, 0F, -2F); // B3
		bodyModel[2].setRotationPoint(-62F, -158F, -26F);

		bodyModel[3].addBox(0F, 0F, 0F, 51, 56, 52, 0F); // B4
		bodyModel[3].setRotationPoint(-62F, -214F, -26F);

		bodyModel[4].addBox(0F, 0F, 0F, 10, 40, 52, 0F); // B5
		bodyModel[4].setRotationPoint(-72F, -214F, -26F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 6, 52, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // B6
		bodyModel[5].setRotationPoint(-72F, -174F, -26F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 26, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); // B7
		bodyModel[6].setRotationPoint(-59F, -192F, 26F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 26, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F); // B8
		bodyModel[7].setRotationPoint(-59F, -192F, -42F);

		bodyModel[8].addBox(0F, 0F, 0F, 24, 26, 16, 0F); // B9
		bodyModel[8].setRotationPoint(-48F, -192F, 26F);

		bodyModel[9].addBox(0F, 0F, 0F, 24, 26, 16, 0F); // B10
		bodyModel[9].setRotationPoint(-48F, -192F, -42F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 24, 24, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, -7F); // B11
		bodyModel[10].setRotationPoint(-50F, -192F, 34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 24, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, 0F); // B12
		bodyModel[11].setRotationPoint(-50F, -192F, -50F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 18, 16, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, -7F); // B13
		bodyModel[12].setRotationPoint(-47F, -189F, 38F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 18, 16, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F);// B14
		bodyModel[13].setRotationPoint(-47F, -189F, -54F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 38, 38, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // B15
		bodyModel[14].setRotationPoint(-59F, -230F, 26F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 38, 38, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // B16
		bodyModel[15].setRotationPoint(-59F, -230F, -64F);

		bodyModel[16].addBox(0F, 0F, 0F, 30, 38, 38, 0F); // B17
		bodyModel[16].setRotationPoint(-49F, -230F, 26F);

		bodyModel[17].addBox(0F, 0F, 0F, 30, 38, 38, 0F); // B18
		bodyModel[17].setRotationPoint(-49F, -230F, -64F);

		bodyModel[18].addTrapezoid(0F, 0F, 0F, 7, 7, 7, 0F, -2F, ModelRendererTurbo.MR_RIGHT); // B19
		bodyModel[18].setRotationPoint(8F, -164F, 25F);

		bodyModel[19].addTrapezoid(0F, 0F, 0F, 7, 7, 7, 0F, -2F, ModelRendererTurbo.MR_RIGHT); // B20
		bodyModel[19].setRotationPoint(8F, -164F, -32F);

		bodyModel[20].addBox(0F, 0F, 0F, 21, 7, 7, 0F); // B21
		bodyModel[20].setRotationPoint(15F, -164F, 25F);

		bodyModel[21].addBox(0F, 0F, 0F, 21, 7, 7, 0F); // B22
		bodyModel[21].setRotationPoint(15F, -164F, -32F);

		bodyModel[22].addTrapezoid(0F, 0F, 0F, 4, 7, 7, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // B23
		bodyModel[22].setRotationPoint(36F, -164F, 25F);

		bodyModel[23].addTrapezoid(0F, 0F, 0F, 4, 7, 7, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // B24
		bodyModel[23].setRotationPoint(36F, -164F, -32F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // B25
		bodyModel[24].setRotationPoint(39F, -161F, 28F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // B26
		bodyModel[25].setRotationPoint(39F, -161F, -29F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 1, 28, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // B27
		bodyModel[26].setRotationPoint(42F, -154F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 1, 50, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F); // B28
		bodyModel[27].setRotationPoint(23F, -154F, -25F);

		bodyModel[28].addBox(0F, 0F, 0F, 20, 1, 50, 0F); // B29
		bodyModel[28].setRotationPoint(3F, -154F, -25F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 11, 18, 0F); // B30
		bodyModel[29].setRotationPoint(40F, -164F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 56, 1, 96, 0F, 0F, 0F, 0F, -49F, 4F, 0F, -49F, 4F, -84F, 0F, 0F, -84F, 0F, 0F, 0F, -49F, 0F, 0F, -49F, 0F, -84F, 0F, 0F, -84F); // B31
		bodyModel[30].setRotationPoint(35F, -162F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 56, 1, 112, 0F, 6F, 3F, 0F, -49F, 4F, 0F, -49F, 4F, -98F, 0F, 0F, -98F, 6F, 0F, 0F, -49F, 0F, 0F, -49F, 0F, -98F, 0F, 0F, -98F); // B32
		bodyModel[31].setRotationPoint(35F, -162F, -20F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 56, 1, 112, 0F, 0F, 0F, 0F, -49F, 4F, 0F, -49F, 4F, -98F, 6F, 3F, -98F, 0F, 0F, 0F, -49F, 0F, 0F, -49F, 0F, -98F, 6F, 0F, -98F); // B33
		bodyModel[32].setRotationPoint(35F, -162F, 6F);

		bodyModel[33].addBox(0F, 0F, 0F, 16, 3, 16, 0F); // B34
		bodyModel[33].setRotationPoint(17F, -157F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 25, 16, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // B35
		bodyModel[34].setRotationPoint(17F, -182F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 7, 10, 0F); // B36
		bodyModel[35].setRotationPoint(15F, -183F, -5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // B37
		bodyModel[36].setRotationPoint(17F, -182F, -5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // B38
		bodyModel[37].setRotationPoint(17F, -182F, 4F);

		bodyModel[38].addBox(0F, 0F, 0F, 15, 3, 2, 0F); // B39
		bodyModel[38].setRotationPoint(16F, -165F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 15, 3, 2, 0F); // B40
		bodyModel[39].setRotationPoint(16F, -165F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // B41
		bodyModel[40].setRotationPoint(29.2F, -165.2F, -9.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // B42
		bodyModel[41].setRotationPoint(29.2F, -165.2F, 6.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // B43
		bodyModel[42].setRotationPoint(30F, -169F, -8.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // B44
		bodyModel[43].setRotationPoint(30F, -169F, 7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // B45
		bodyModel[44].setRotationPoint(37F, -160F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // B46
		bodyModel[45].setRotationPoint(37F, -160F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 11, 52, 0F, 0F, 37F, 0F, 0F, 37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -37F, 0F, 0F, -37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // AL1
		bodyModel[46].setRotationPoint(-43F, -157F, 36F);

		bodyModel[47].addBox(0F, 0F, 0F, 11, 26, 11, 0F); // AL2
		bodyModel[47].setRotationPoint(-43F, -157F, 77F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 11, 52, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 37F, 0F, 0F, 37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -37F, 0F, 0F, -37F, 0F); // AR1
		bodyModel[48].setRotationPoint(-43F, -157F, -88F);

		bodyModel[49].addBox(0F, 0F, 0F, 11, 26, 11, 0F); // AR2
		bodyModel[49].setRotationPoint(-43F, -157F, -88F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1a
		bodyModel[50].setRotationPoint(-20F, -225.5F, -59.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1b
		bodyModel[51].setRotationPoint(-20F, -225.5F, -51.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1c
		bodyModel[52].setRotationPoint(-20F, -225.5F, -43.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1d
		bodyModel[53].setRotationPoint(-20F, -225.5F, -35.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1e
		bodyModel[54].setRotationPoint(-20F, -217.5F, -59.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1f
		bodyModel[55].setRotationPoint(-20F, -217.5F, -51.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1g
		bodyModel[56].setRotationPoint(-20F, -217.5F, -43.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1h
		bodyModel[57].setRotationPoint(-20F, -217.5F, -35.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1i
		bodyModel[58].setRotationPoint(-20F, -209.5F, -59.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1j
		bodyModel[59].setRotationPoint(-20F, -209.5F, -51.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1k
		bodyModel[60].setRotationPoint(-20F, -209.5F, -43.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1l
		bodyModel[61].setRotationPoint(-20F, -209.5F, -35.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1m
		bodyModel[62].setRotationPoint(-20F, -201.5F, -51.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1n
		bodyModel[63].setRotationPoint(-20F, -201.5F, -43.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M1o
		bodyModel[64].setRotationPoint(-20F, -201.5F, -35.5F);

		bodyModel[65].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2a
		bodyModel[65].setRotationPoint(-16F, -225.5F, -59.5F);

		bodyModel[66].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2b
		bodyModel[66].setRotationPoint(-16F, -225.5F, -51.5F);

		bodyModel[67].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2c
		bodyModel[67].setRotationPoint(-16F, -225.5F, -43.5F);

		bodyModel[68].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2d
		bodyModel[68].setRotationPoint(-16F, -225.5F, -35.5F);

		bodyModel[69].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2e
		bodyModel[69].setRotationPoint(-16F, -217.5F, -59.5F);

		bodyModel[70].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2f
		bodyModel[70].setRotationPoint(-16F, -217.5F, -51.5F);

		bodyModel[71].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2g
		bodyModel[71].setRotationPoint(-16F, -217.5F, -43.5F);

		bodyModel[72].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2h
		bodyModel[72].setRotationPoint(-16F, -217.5F, -35.5F);

		bodyModel[73].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2i
		bodyModel[73].setRotationPoint(-16F, -209.5F, -59.5F);

		bodyModel[74].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2j
		bodyModel[74].setRotationPoint(-16F, -209.5F, -51.5F);

		bodyModel[75].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2k
		bodyModel[75].setRotationPoint(-16F, -209.5F, -43.5F);

		bodyModel[76].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2l
		bodyModel[76].setRotationPoint(-16F, -209.5F, -35.5F);

		bodyModel[77].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2m
		bodyModel[77].setRotationPoint(-16F, -201.5F, -51.5F);

		bodyModel[78].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2n
		bodyModel[78].setRotationPoint(-16F, -201.5F, -43.5F);

		bodyModel[79].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M2o
		bodyModel[79].setRotationPoint(-16F, -201.5F, -35.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // M3
		bodyModel[80].setRotationPoint(-20F, -202F, -60F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4a
		bodyModel[81].setRotationPoint(-20F, -225.5F, 54.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4b
		bodyModel[82].setRotationPoint(-20F, -225.5F, 46.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4c
		bodyModel[83].setRotationPoint(-20F, -225.5F, 38.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4d
		bodyModel[84].setRotationPoint(-20F, -225.5F, 30.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4e
		bodyModel[85].setRotationPoint(-20F, -217.5F, 54.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4f
		bodyModel[86].setRotationPoint(-20F, -217.5F, 46.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4g
		bodyModel[87].setRotationPoint(-20F, -217.5F, 38.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4h
		bodyModel[88].setRotationPoint(-20F, -217.5F, 30.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4i
		bodyModel[89].setRotationPoint(-20F, -209.5F, 54.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4j
		bodyModel[90].setRotationPoint(-20F, -209.5F, 46.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4k
		bodyModel[91].setRotationPoint(-20F, -209.5F, 38.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4l
		bodyModel[92].setRotationPoint(-20F, -209.5F, 30.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4m
		bodyModel[93].setRotationPoint(-20F, -201.5F, 46.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4n
		bodyModel[94].setRotationPoint(-20F, -201.5F, 38.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // M4o
		bodyModel[95].setRotationPoint(-20F, -201.5F, 30.5F);

		bodyModel[96].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5a
		bodyModel[96].setRotationPoint(-16F, -225.5F, 54.5F);

		bodyModel[97].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5b
		bodyModel[97].setRotationPoint(-16F, -225.5F, 46.5F);

		bodyModel[98].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5c
		bodyModel[98].setRotationPoint(-16F, -225.5F, 38.5F);

		bodyModel[99].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5d
		bodyModel[99].setRotationPoint(-16F, -225.5F, 30.5F);

		bodyModel[100].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5e
		bodyModel[100].setRotationPoint(-16F, -217.5F, 54.5F);

		bodyModel[101].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5f
		bodyModel[101].setRotationPoint(-16F, -217.5F, 46.5F);

		bodyModel[102].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5g
		bodyModel[102].setRotationPoint(-16F, -217.5F, 38.5F);

		bodyModel[103].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5h
		bodyModel[103].setRotationPoint(-16F, -217.5F, 30.5F);

		bodyModel[104].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5i
		bodyModel[104].setRotationPoint(-16F, -209.5F, 54.5F);

		bodyModel[105].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5j
		bodyModel[105].setRotationPoint(-16F, -209.5F, 46.5F);

		bodyModel[106].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5k
		bodyModel[106].setRotationPoint(-16F, -209.5F, 38.5F);

		bodyModel[107].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5l
		bodyModel[107].setRotationPoint(-16F, -209.5F, 30.5F);

		bodyModel[108].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5m
		bodyModel[108].setRotationPoint(-16F, -201.5F, 46.5F);

		bodyModel[109].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5n
		bodyModel[109].setRotationPoint(-16F, -201.5F, 38.5F);

		bodyModel[110].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // M5o
		bodyModel[110].setRotationPoint(-16F, -201.5F, 30.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // M6
		bodyModel[111].setRotationPoint(-20F, -202F, 54F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -78F, 0F, 0F, -78F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, -80F, -78F, 0F, -80F, -78F);
		bodyModel[112].setRotationPoint(42F, -184F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 104, 72, 1, 0F, 0F, 0F, 9.5F, -78F, 0F, 0F, -78F, 0F, 0F, 0F, 0F, -9.5F, 0F, -54F, 9.5F, -78F, -54F, 0F, -78F, -54F, 0F, 0F, -54F, -9.5F); // HUD2
		bodyModel[113].setRotationPoint(16F, -184F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 104, 72, 1, 0F, 0F, 0F, -9.5F, -78F, 0F, 0F, -78F, 0F, 0F, 0F, 0F, 9.5F, 0F, -54F, -9.5F, -78F, -54F, 0F, -78F, -54F, 0F, 0F, -54F, 9.5F); // HUD3
		bodyModel[114].setRotationPoint(16F, -184F, 10F);

		bodyModel[115].flip = true;
		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -78F, 0F, 0F, -78F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, -80F, -78F, 0F, -80F, -78F);
		bodyModel[115].setRotationPoint(42F, -184.2F, -11F);

		bodyModel[116].flip = true;
		bodyModel[116].addShapeBox(0F, 0F, 0F, 104, 72, 1, 0F, 0F, 0F, 9.5F, -78F, 0F, 0F, -78F, 0F, 0F, 0F, 0F, -9.5F, 0F, -54F, 9.5F, -78F, -54F, 0F, -78F, -54F, 0F, 0F, -54F, -9.5F); // HUD2
		bodyModel[116].setRotationPoint(16F, -184.2F, -11F);

		bodyModel[117].flip = true;
		bodyModel[117].addShapeBox(0F, 0F, 0F, 104, 72, 1, 0F, 0F, 0F, -9.5F, -78F, 0F, 0F, -78F, 0F, 0F, 0F, 0F, 9.5F, 0F, -54F, -9.5F, -78F, -54F, 0F, -78F, -54F, 0F, 0F, -54F, 9.5F); // HUD3
		bodyModel[117].setRotationPoint(16F, -184.2F, 10F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 5, 28, 0F); // CP0
		bodyModel[118].setRotationPoint(58F, -160F, -14F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // CP0a
		bodyModel[119].setRotationPoint(58F, -165F, -14F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // CP0b
		bodyModel[120].setRotationPoint(58F, -165F, -5F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // CP0c
		bodyModel[121].setRotationPoint(58F, -165F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // CP0d
		bodyModel[122].setRotationPoint(58F, -165F, 12F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 2, 28, 0F); // CP0e
		bodyModel[123].setRotationPoint(58F, -167F, -14F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8.9999F, -2F, 0F, 0F, 0F, 0F, -7F); // CP1a
		bodyModel[124].setRotationPoint(42F, -167F, -23F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 18, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, -8.9999F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8.9999F, -2F, 0F, 0F, 0F, 0F, -7F); // CP1b
		bodyModel[125].setRotationPoint(42F, -160F, -23F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 18, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, 0F, -8.9999F, -9F, -2F, -8.9999F, 0F, 0F, -2F, 0F); // CP1c
		bodyModel[126].setRotationPoint(42F, -155F, -23F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 18, 9, 28, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // CP1d
		bodyModel[127].setRotationPoint(42F, -155F, -14F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 18, 9, 9, 0F, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -8.9999F, 0F, 0F, -8.9999F, -9F, 0F, 0F, -9F); // CP1e
		bodyModel[128].setRotationPoint(42F, -155F, 14F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 18, 6, 9, 0F, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F); // CP1f
		bodyModel[129].setRotationPoint(42F, -161F, 14F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F); // CP1g
		bodyModel[130].setRotationPoint(42F, -167F, 14F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F, 0F, 0F, -3.50909091F, -2F, -10F, 0F, 0F, -10F, -8.9999F, 0F, 0F, -4.09090909F, 0F, 0F, -4.22727273F, -2F, 10F, 0F, 0F, 10F, -8.9999F, 0F, 0F, -3.27272727F); // CP1h
		bodyModel[131].setRotationPoint(42F, -177F, 14F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 18, 22, 2, 0F, 0F, -2F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -2F, 0F, -16F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -16F, 0F, 0F); // CP1i
		bodyModel[132].setRotationPoint(42F, -189F, 12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 18, 22, 2, 0F, 0F, -2F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -2F, 0F, -16F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -16F, 0F, -1F); // CP1j
		bodyModel[133].setRotationPoint(42F, -189F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 22, 2, 0F, 0F, -2F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -2F, 0F, -16F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -16F, 0F, 1F); // CP1k
		bodyModel[134].setRotationPoint(42F, -189F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 18, 22, 2, 0F, 0F, -2F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -2F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -16F, 0F, 1F); // CP1l
		bodyModel[135].setRotationPoint(42F, -189F, -14F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F, 0F, 0F, -4.09090909F, 0F, -10F, -8.9999F, -2F, -10F, 0F, 0F, 0F, -3.50909091F, 0F, 0F, -3.27272727F, 0F, 10F, -8.9999F, -2F, 10F, 0F, 0F, 0F, -4.22727273F); // CP1m
		bodyModel[136].setRotationPoint(42F, -177F, -23F);

//		bodyModel[137].addBox(0F, 0F, 0F, 18, 22, 26, 0F); // CP1n
//		bodyModel[137].setRotationPoint(42F, -189F, -13F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F, 0F, 0F, -1.6F, 0F, 0F, -8F, 0F, 0F, 2F, 0F, 0F, -4.4F, 0F, 0F, 0F, 0F, 0F, -7.2F, 0F, 0F, 1.2F, 0F, 0F, -6F); // CP2a
		bodyModel[138].setRotationPoint(23F, -190F, -22F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F, 0F, 0F, -1.9047619F, 0F, 0F, -7F, 0F, 0F, 0.3F, 0F, 0F, -4.0952381F, 0F, 0F, -1.52380952F, 0F, 0F, -6.2F, 0F, 0F, -0.4F, 0F, 0F, -4.47619048F); // CP2b
		bodyModel[139].setRotationPoint(23F, -177F, -26F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 19, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F); // CP2c
		bodyModel[140].setRotationPoint(23F, -167F, -26F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 19, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, 9F, 0F, 0F, 0F); // CP2d
		bodyModel[141].setRotationPoint(23F, -155F, -26F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 19, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -8F, 0F, -2.9999F, -8F, 0F, -2.9999F, 0F, 0F, -2F, 0F); // CP2e
		bodyModel[142].setRotationPoint(23F, -146F, -22F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 19, 5, 28, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // CP2f
		bodyModel[143].setRotationPoint(23F, -148F, -14F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 19, 3, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -8F, 0F, 0F, -8F); // CP2g
		bodyModel[144].setRotationPoint(23F, -146F, 14F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 19, 9, 6, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -12F, 0F, 0F, -4F); // CP2h
		bodyModel[145].setRotationPoint(23F, -155F, 20F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 19, 12, 5, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // CP2i
		bodyModel[146].setRotationPoint(23F, -167F, 21F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F, 0F, 0F, -4.0952381F, 0F, 0F, 0.3F, 0F, 0F, -7F, 0F, 0F, -1.9047619F, 0F, 0F, -4.47619048F, 0F, 0F, -0.4F, 0F, 0F, -6.2F, 0F, 0F, -1.52380952F); // CP2j
		bodyModel[147].setRotationPoint(23F, -177F, 18F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F, 0F, 0F, -4.4F, 0F, 0F, 2F, 0F, 0F, -8F, 0F, 0F, -1.6F, 0F, 0F, -6F, 0F, 0F, 1.2F, 0F, 0F, -7.2F, 0F, 0F, 0F); // CP2k
		bodyModel[148].setRotationPoint(23F, -190F, 14F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 19, 9, 2, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -7F, 0F); // CP2l
		bodyModel[149].setRotationPoint(23F, -198F, 12F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 19, 9, 2, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -7F, 0F); // CP2m
		bodyModel[150].setRotationPoint(23F, -198F, 4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 19, 9, 2, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -7F, 0F); // CP2n
		bodyModel[151].setRotationPoint(23F, -198F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 19, 9, 2, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -7F, 0F); // CP2o
		bodyModel[152].setRotationPoint(23F, -198F, -14F);

//		bodyModel[153].addBox(0F, 0F, 0F, 19, 9, 26, 0F); // CP2p
//		bodyModel[153].setRotationPoint(23F, -198F, -13F);

		bodyModel[154].addBox(0F, 0F, 0F, 34, 2, 28, 0F); // CP3
		bodyModel[154].setRotationPoint(-11F, -198F, -14F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 34, 10, 8, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // CP3a
		bodyModel[155].setRotationPoint(-11F, -198F, -22F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 34, 21, 6, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // CP3b
		bodyModel[156].setRotationPoint(-11F, -188F, -26F);

		bodyModel[157].addBox(0F, 0F, 0F, 34, 12, 2, 0F); // CP3c
		bodyModel[157].setRotationPoint(-11F, -167F, -26F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 34, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // CP3d
		bodyModel[158].setRotationPoint(-11F, -155F, -26F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 34, 3, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CP3e
		bodyModel[159].setRotationPoint(-11F, -146F, -22F);

		bodyModel[160].addBox(0F, 0F, 0F, 34, 2, 28, 0F); // CP3f
		bodyModel[160].setRotationPoint(-11F, -145F, -14F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 34, 3, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // CP3g
		bodyModel[161].setRotationPoint(-11F, -146F, 14F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 34, 9, 6, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // CP3h
		bodyModel[162].setRotationPoint(-11F, -155F, 20F);

		bodyModel[163].addBox(0F, 0F, 0F, 34, 12, 2, 0F); // CP3i
		bodyModel[163].setRotationPoint(-11F, -167F, 24F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 34, 21, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // CP3j
		bodyModel[164].setRotationPoint(-11F, -188F, 20F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 34, 10, 8, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // CP3k
		bodyModel[165].setRotationPoint(-11F, -198F, 14F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 28, 0F, 0F, 0.94736842F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.94736842F, 0F, 0F, -0.94736842F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.94736842F, 0F); // CP4
		bodyModel[166].setRotationPoint(40F, -189F, -14F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 22, 9, 0F, 0F, -0.94736842F, 0F, 0F, -2F, 0F, 0F, 0F, -9F, 0F, 0.94736842F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // CP4b
		bodyModel[167].setRotationPoint(40F, -189F, 14F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 22, 9, 0F, 0F, 0.94736842F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -0.94736842F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // CP4a
		bodyModel[168].setRotationPoint(40F, -189F, -23F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // D1
		bodyModel[169].setRotationPoint(-11.5F, -199F, -25F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // D2
		bodyModel[170].setRotationPoint(-11.5F, -209F, -25F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // D3
		bodyModel[171].setRotationPoint(-11.5F, -212F, -17F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 9, 16, 0F); // D4
		bodyModel[172].setRotationPoint(-11.5F, -212F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // D5
		bodyModel[173].setRotationPoint(-11.5F, -212F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -5F, 0F, 0F, -5F, 0F); // D6
		bodyModel[174].setRotationPoint(-11.5F, -209F, 15F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // D7
		bodyModel[175].setRotationPoint(-11.5F, -199F, 20F);

		bodyModel[176].addTrapezoid(0F, 0F, 0F, 2, 38, 6, 0F, -1F,  ModelRendererTurbo.MR_RIGHT); // DH1
		bodyModel[176].setRotationPoint(-73F, -213F, 19F);

		bodyModel[177].addTrapezoid(0F, 0F, 0F, 2, 38, 6, 0F, -1F,  ModelRendererTurbo.MR_RIGHT); // DH2
		bodyModel[177].setRotationPoint(-73F, -213F, 8F);

		bodyModel[178].addTrapezoid(0F, 0F, 0F, 2, 38, 6, 0F, -1F,  ModelRendererTurbo.MR_RIGHT); // DH3
		bodyModel[178].setRotationPoint(-73F, -213F, -3F);

		bodyModel[179].addTrapezoid(0F, 0F, 0F, 2, 38, 6, 0F, -1F,  ModelRendererTurbo.MR_RIGHT); // DH4
		bodyModel[179].setRotationPoint(-73F, -213F, -14F);

		bodyModel[180].addTrapezoid(0F, 0F, 0F, 2, 38, 6, 0F, -1F,  ModelRendererTurbo.MR_RIGHT); // DH5
		bodyModel[180].setRotationPoint(-73F, -213F, -25F);

		bodyModel[181].addTrapezoid(0F, 0F, 0F, 45, 2, 10, 0F, -1F,  ModelRendererTurbo.MR_TOP); // DO1
		bodyModel[181].setRotationPoint(-68F, -215F, -23F);

		bodyModel[182].addTrapezoid(0F, 0F, 0F, 45, 2, 10, 0F, -1F,  ModelRendererTurbo.MR_TOP); // DO2
		bodyModel[182].setRotationPoint(-68F, -215F, 13F);

		bodyModel[183].addBox(0F, 0F, 0F, 6, 6, 24, 0F); // ARg
		bodyModel[183].setRotationPoint(-35F, -124F, -95F);

		bodyModel[184].addBox(0F, 0F, 0F, 6, 6, 24, 0F); // ALg
		bodyModel[184].setRotationPoint(-34.5F, -124F, 71F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 12, 20, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // AL3
		bodyModel[185].setRotationPoint(-44F, -131F, 73F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 14, 14, 0F); // AL4
		bodyModel[186].setRotationPoint(-32F, -128F, 76F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 12, 20, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // AR3
		bodyModel[187].setRotationPoint(-44F, -131F, -93F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 14, 14, 0F); // AR4
		bodyModel[188].setRotationPoint(-32F, -128F, -90F);

		bodyModel[189].addTrapezoid(0F, 0F, 0F, 6, 13, 20, 0F, -1.5F,  ModelRendererTurbo.MR_RIGHT); // DH6
		bodyModel[189].setRotationPoint(-75F, -194F, -25.5F);


		hipsModel = new ModelRendererTurbo[16];
		hipsModel[0] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // H1
		hipsModel[1] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // H2
		hipsModel[2] = new ModelRendererTurbo(this, 124, 745, textureX, textureY); // H3
		hipsModel[3] = new ModelRendererTurbo(this, 163, 745, textureX, textureY); // H4
		hipsModel[4] = new ModelRendererTurbo(this, 205, 745, textureX, textureY); // H5
		hipsModel[5] = new ModelRendererTurbo(this, 205, 770, textureX, textureY); // H6
		hipsModel[6] = new ModelRendererTurbo(this, 247, 745, textureX, textureY); // H7
		hipsModel[7] = new ModelRendererTurbo(this, 247, 770, textureX, textureY); // H8
		hipsModel[8] = new ModelRendererTurbo(this, 290, 745, textureX, textureY); // H9
		hipsModel[9] = new ModelRendererTurbo(this, 361, 745, textureX, textureY); // H10
		hipsModel[10] = new ModelRendererTurbo(this, 432, 745, textureX, textureY); // H11
		hipsModel[11] = new ModelRendererTurbo(this, 504, 745, textureX, textureY); // H12
		hipsModel[12] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // H13
		hipsModel[13] = new ModelRendererTurbo(this, 15, 745, textureX, textureY); // H14
		hipsModel[14] = new ModelRendererTurbo(this, 576, 745, textureX, textureY); // H15
		hipsModel[15] = new ModelRendererTurbo(this, 637, 745, textureX, textureY); // H16

		hipsModel[0].addBox(0F, 0F, 0F, 50, 14, 50, 0F); // H1
		hipsModel[0].setRotationPoint(-25F, -126F, -25F);

		hipsModel[1].addBox(0F, 0F, 0F, 40, 6, 40, 0F); // H2
		hipsModel[1].setRotationPoint(-20F, -132F, -20F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 13, 13, 7, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // H3
		hipsModel[2].setRotationPoint(-6.5F, -129F, 21F);

		hipsModel[3].addShapeBox(0F, 0F, 0F, 13, 13, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // H4
		hipsModel[3].setRotationPoint(-6.5F, -129F, -28F);

		hipsModel[4].addBox(0F, 0F, 0F, 18, 18, 1, 0F); // H5
		hipsModel[4].setRotationPoint(-9F, -132F, 27F);

		hipsModel[5].addBox(0F, 0F, 0F, 18, 18, 1, 0F); // H6
		hipsModel[5].setRotationPoint(-9F, -132F, -28F);

		hipsModel[6].addBox(0F, 0F, 0F, 16, 16, 4, 0F); // H7
		hipsModel[6].setRotationPoint(-8F, -131F, 33F);

		hipsModel[7].addBox(0F, 0F, 0F, 16, 16, 4, 0F); // H8
		hipsModel[7].setRotationPoint(-8F, -131F, -37F);

		hipsModel[8].addBox(0F, 0F, 0F, 24, 24, 10, 0F); // H9
		hipsModel[8].setRotationPoint(-12F, -135F, 37F);

		hipsModel[9].addBox(0F, 0F, 0F, 24, 24, 10, 0F); // H10
		hipsModel[9].setRotationPoint(-12F, -135F, -47F);

		hipsModel[10].addTrapezoid(0F, 0F, 0F, 24, 24, 11, 0F, -6F, ModelRendererTurbo.MR_BACK); // H11
		hipsModel[10].setRotationPoint(-12F, -135F, 47F);

		hipsModel[11].addTrapezoid(0F, 0F, 0F, 24, 24, 11, 0F, -6F, ModelRendererTurbo.MR_FRONT); // H12
		hipsModel[11].setRotationPoint(-12F, -135F, -58F);

		hipsModel[12].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // H13
		hipsModel[12].setRotationPoint(-2F, -125F, 57F);

		hipsModel[13].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // H14
		hipsModel[13].setRotationPoint(-2F, -125F, -59F);

		hipsModel[14].addTrapezoid(0F, 0F, 0F, 24, 24, 5, 0F, -2.5F, ModelRendererTurbo.MR_FRONT); // H15
		hipsModel[14].setRotationPoint(-12F, -135F, 28F);

		hipsModel[15].addTrapezoid(0F, 0F, 0F, 24, 24, 5, 0F, -2.5F, ModelRendererTurbo.MR_BACK); // H16
		hipsModel[15].setRotationPoint(-12F, -135F, -33F);


		leftArmModel = new ModelRendererTurbo[23];
		leftArmModel[0] = new ModelRendererTurbo(this, 78, 600, textureX, textureY); // AL5
		leftArmModel[1] = new ModelRendererTurbo(this, 78, 630, textureX, textureY); // AL6
		leftArmModel[2] = new ModelRendererTurbo(this, 78, 642, textureX, textureY); // AL7
		leftArmModel[3] = new ModelRendererTurbo(this, 78, 630, textureX, textureY); // AL8
		leftArmModel[4] = new ModelRendererTurbo(this, 78, 642, textureX, textureY); // AL9
		leftArmModel[5] = new ModelRendererTurbo(this, 160, 600, textureX, textureY); // AL10
		leftArmModel[6] = new ModelRendererTurbo(this, 252, 600, textureX, textureY); // AL11
		leftArmModel[7] = new ModelRendererTurbo(this, 312, 600, textureX, textureY); // AL12
		leftArmModel[8] = new ModelRendererTurbo(this, 373, 600, textureX, textureY); // AL13
		leftArmModel[9] = new ModelRendererTurbo(this, 436, 600, textureX, textureY); // AL14
		leftArmModel[10] = new ModelRendererTurbo(this, 509, 600, textureX, textureY); // AL15
		leftArmModel[11] = new ModelRendererTurbo(this, 185, 630, textureX, textureY); // AL16
		leftArmModel[12] = new ModelRendererTurbo(this, 550, 600, textureX, textureY); // HL1
		leftArmModel[13] = new ModelRendererTurbo(this, 614, 600, textureX, textureY); // HL2
		leftArmModel[14] = new ModelRendererTurbo(this, 696, 600, textureX, textureY); // HL3
		leftArmModel[15] = new ModelRendererTurbo(this, 130, 635, textureX, textureY); // HL4
		leftArmModel[16] = new ModelRendererTurbo(this, 165, 635, textureX, textureY); // HL5
		leftArmModel[17] = new ModelRendererTurbo(this, 760, 600, textureX, textureY); // HL6
		leftArmModel[18] = new ModelRendererTurbo(this, 760, 607, textureX, textureY); // HL7
		leftArmModel[19] = new ModelRendererTurbo(this, 760, 623, textureX, textureY); // HL8
		leftArmModel[20] = new ModelRendererTurbo(this, 760, 640, textureX, textureY); // HL9
		leftArmModel[21] = new ModelRendererTurbo(this, 760, 646, textureX, textureY); // HL10
		leftArmModel[22] = new ModelRendererTurbo(this, 760, 663, textureX, textureY); // HL11

		leftArmModel[0].addBox(-10F, 0F, -10F, 20, 7, 20, 0F); // AR5
		leftArmModel[0].setPosition(0, 0, 0);

		leftArmModel[1].addShapeBox(-6F, -6F, 10F, 12, 7, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // AR6
		leftArmModel[1].setPosition(0, 0, 0);

		leftArmModel[2].addShapeBox(-13F, 1F, 10F, 19, 6, 1, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // AR7
		leftArmModel[2].setPosition(0, 0, 0);

		leftArmModel[3].addShapeBox(-6F, -6F, -11F, 12, 7, 1, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // AR8
		leftArmModel[3].setPosition(0, 0, 0);

		leftArmModel[4].addShapeBox(-13F, 1F, -11F, 19, 6, 1, 0F, -7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // AR9
		leftArmModel[4].setPosition(0, 0, 0);

		leftArmModel[5].addBox(-11F, 7F, -12F, 21, 2, 24, 0F); // AR10
		leftArmModel[5].setPosition(0, 0, 0);

		leftArmModel[6].addBox(-17F, 7F, -14F, 27, 45, 2, 0F); // AR11
		leftArmModel[6].setPosition(0, 0, 0);

		leftArmModel[7].addBox(-17F, 7F, 12F, 27, 45, 2, 0F); // AR12
		leftArmModel[7].setPosition(0, 0, 0);

		leftArmModel[8].addBox(-17F, 7F, -12F, 6, 45, 24, 0F); // AR13
		leftArmModel[8].setPosition(0, 0, 0);

		leftArmModel[9].addTrapezoid(-25F, 2F, -9F, 16, 49, 18, 0F, -5F,  ModelRendererTurbo.MR_RIGHT); // AR14
		leftArmModel[9].setPosition(0, 0, 0);

		leftArmModel[10].addFlexBox(-23F, 2.5F, -3.5F, 12, 49, 7, 0F, -5F, -3F, -2F, -2F, ModelRendererTurbo.MR_RIGHT); // AR15
		leftArmModel[10].setPosition(0, 0, 0);

		leftArmModel[11].addTrapezoid(-6.5F, 9F, -6.5F, 13, 7, 13, 0F, -2F,  ModelRendererTurbo.MR_BOTTOM); // AR16
		leftArmModel[11].setPosition(0, 0, 0);

		leftArmModel[12].addFlexBox(7F, 9F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_LEFT); // // HL1

		leftArmModel[13].addBox(-8F, 9F, -12F, 15, 64, 24, 0F); // HL2

		leftArmModel[14].addFlexBox(-14F, 9F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_RIGHT); // HL3

		leftArmModel[15].addBox(-1F, 72F, -4F, 8, 8, 8, 0F); // HL4

		leftArmModel[16].addBox(-8F, 72F, -2F, 4, 6, 4, 0F); // HL5

		leftArmModel[17].addBox(-6F, 72F, -10F, 11, 3, 1, 0F); // HL6

		leftArmModel[18].addShapeBox(5F, 72F, -10F, 6, 3, 10, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // HL7

		leftArmModel[19].addShapeBox(5F, 72F, 0F, 6, 3, 10, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F); // HL8

		leftArmModel[20].addBox(-6F, 72F, 9F, 11, 3, 1, 0F); // HL9

		leftArmModel[21].addShapeBox(-12F, 72F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F); // HL10

		leftArmModel[22].addShapeBox(-12F, 72F, -10F, 6, 3, 10, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F); // HL11


		rightArmModel = new ModelRendererTurbo[23];
		rightArmModel[0] = new ModelRendererTurbo(this, 78, 670, textureX, textureY); // AR5
		rightArmModel[1] = new ModelRendererTurbo(this, 78, 700, textureX, textureY); // AR6
		rightArmModel[2] = new ModelRendererTurbo(this, 78, 712, textureX, textureY); // AR7
		rightArmModel[3] = new ModelRendererTurbo(this, 78, 700, textureX, textureY); // AR8
		rightArmModel[4] = new ModelRendererTurbo(this, 78, 712, textureX, textureY); // AR9
		rightArmModel[5] = new ModelRendererTurbo(this, 160, 670, textureX, textureY); // AR10
		rightArmModel[6] = new ModelRendererTurbo(this, 252, 670, textureX, textureY); // AR11
		rightArmModel[7] = new ModelRendererTurbo(this, 312, 670, textureX, textureY); // AR12
		rightArmModel[8] = new ModelRendererTurbo(this, 373, 670, textureX, textureY); // AR13
		rightArmModel[9] = new ModelRendererTurbo(this, 436, 670, textureX, textureY); // AR14
		rightArmModel[10] = new ModelRendererTurbo(this, 509, 670, textureX, textureY); // AR15
		rightArmModel[11] = new ModelRendererTurbo(this, 185, 700, textureX, textureY); // AR16
		rightArmModel[12] = new ModelRendererTurbo(this, 794, 600, textureX, textureY); // HR1
		rightArmModel[13] = new ModelRendererTurbo(this, 857, 600, textureX, textureY); // HR2
		rightArmModel[14] = new ModelRendererTurbo(this, 939, 600, textureX, textureY); // HR3
		rightArmModel[15] = new ModelRendererTurbo(this, 130, 705, textureX, textureY); // HR4
		rightArmModel[16] = new ModelRendererTurbo(this, 165, 705, textureX, textureY); // HR5
		rightArmModel[17] = new ModelRendererTurbo(this, 760, 680, textureX, textureY); // HR6
		rightArmModel[18] = new ModelRendererTurbo(this, 760, 687, textureX, textureY); // HR7
		rightArmModel[19] = new ModelRendererTurbo(this, 760, 703, textureX, textureY); // HR8
		rightArmModel[20] = new ModelRendererTurbo(this, 760, 720, textureX, textureY); // HR9
		rightArmModel[21] = new ModelRendererTurbo(this, 760, 726, textureX, textureY); // HR10
		rightArmModel[22] = new ModelRendererTurbo(this, 760, 743, textureX, textureY); // HR11

		rightArmModel[0].addBox(-10F, 0F, -10F, 20, 7, 20, 0F); // AR5

		rightArmModel[1].addShapeBox(-6F, -6F, 10F, 12, 7, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // AR6

		rightArmModel[2].addShapeBox(-13F, 1F, 10F, 19, 6, 1, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // AR7

		rightArmModel[3].addShapeBox(-6F, -6F, -11F, 12, 7, 1, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // AR8

		rightArmModel[4].addShapeBox(-13F, 1F, -11F, 19, 6, 1, 0F, -7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // AR9

		rightArmModel[5].addBox(-11F, 7F, -12F, 21, 2, 24, 0F); // AR10

		rightArmModel[6].addBox(-17F, 7F, -14F, 27, 45, 2, 0F); // AR11

		rightArmModel[7].addBox(-17F, 7F, 12F, 27, 45, 2, 0F); // AR12

		rightArmModel[8].addBox(-17F, 7F, -12F, 6, 45, 24, 0F); // AR13

		rightArmModel[9].addTrapezoid(-25F, 2F, -9F, 16, 49, 18, 0F, -5F,  ModelRendererTurbo.MR_RIGHT); // AR14

		rightArmModel[10].addFlexBox(-23F, 2.5F, -3.5F, 12, 49, 7, 0F, -5F, -3F, -2F, -2F, ModelRendererTurbo.MR_RIGHT); // AR15

		rightArmModel[11].addTrapezoid(-6.5F, 9F, -6.5F, 13, 7, 13, 0F, -2F,  ModelRendererTurbo.MR_BOTTOM); // AR16

		rightArmModel[12].addFlexBox(7F, 9F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_LEFT); // // HL1

		rightArmModel[13].addBox(-8F, 9F, -12F, 15, 64, 24, 0F); // HL2

		rightArmModel[14].addFlexBox(-14F, 9F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_RIGHT); // HL3

		rightArmModel[15].addBox(-1F, 72F, -4F, 8, 8, 8, 0F); // HL4

		rightArmModel[16].addBox(-8F, 72F, -2F, 4, 6, 4, 0F); // HL5

		rightArmModel[17].addBox(-6F, 72F, -10F, 11, 3, 1, 0F); // HL6

		rightArmModel[18].addShapeBox(5F, 72F, -10F, 6, 3, 10, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // HL7

		rightArmModel[19].addShapeBox(5F, 72F, 0F, 6, 3, 10, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F); // HL8

		rightArmModel[20].addBox(-6F, 72F, 9F, 11, 3, 1, 0F); // HL9

		rightArmModel[21].addShapeBox(-12F, 72F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F); // HL10

		rightArmModel[22].addShapeBox(-12F, 72F, -10F, 6, 3, 10, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F); // HL11


//		leftHandModel = new ModelRendererTurbo[11];
//		leftHandModel[0] = new ModelRendererTurbo(this, 550, 600, textureX, textureY); // HL1
//		leftHandModel[1] = new ModelRendererTurbo(this, 614, 600, textureX, textureY); // HL2
//		leftHandModel[2] = new ModelRendererTurbo(this, 696, 600, textureX, textureY); // HL3
//		leftHandModel[3] = new ModelRendererTurbo(this, 130, 635, textureX, textureY); // HL4
//		leftHandModel[4] = new ModelRendererTurbo(this, 165, 635, textureX, textureY); // HL5
//		leftHandModel[5] = new ModelRendererTurbo(this, 760, 600, textureX, textureY); // HL6
//		leftHandModel[6] = new ModelRendererTurbo(this, 760, 607, textureX, textureY); // HL7
//		leftHandModel[7] = new ModelRendererTurbo(this, 760, 623, textureX, textureY); // HL8
//		leftHandModel[8] = new ModelRendererTurbo(this, 760, 640, textureX, textureY); // HL9
//		leftHandModel[9] = new ModelRendererTurbo(this, 760, 646, textureX, textureY); // HL10
//		leftHandModel[10] = new ModelRendererTurbo(this, 760, 663, textureX, textureY); // HL11
//
//		leftHandModel[0].addFlexBox(7F, -16F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_LEFT); // // HL1
//
//		leftHandModel[1].addBox(-8F, -16F, -12F, 15, 64, 24, 0F); // HL2
//
//		leftHandModel[2].addFlexBox(-14F, -16F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_RIGHT); // HL3
//
//		leftHandModel[3].addBox(-1F, 47F, -4F, 8, 8, 8, 0F); // HL4
//
//		leftHandModel[4].addBox(-8F, 47F, -2F, 4, 6, 4, 0F); // HL5
//
//		leftHandModel[5].addBox(-6F, 47F, -10F, 11, 3, 1, 0F); // HL6
//
//		leftHandModel[6].addShapeBox(5F, 47F, -10F, 6, 3, 10, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // HL7
//
//		leftHandModel[7].addShapeBox(5F, 47F, 0F, 6, 3, 10, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F); // HL8
//
//		leftHandModel[8].addBox(-6F, 47F, 9F, 11, 3, 1, 0F); // HL9
//
//		leftHandModel[9].addShapeBox(-12F, 47F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F); // HL10
//
//		leftHandModel[10].addShapeBox(-12F, 47F, -10F, 6, 3, 10, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F); // HL11
//
//
//		rightHandModel = new ModelRendererTurbo[11];
//		rightHandModel[0] = new ModelRendererTurbo(this, 794, 670, textureX, textureY); // HR1
//		rightHandModel[1] = new ModelRendererTurbo(this, 857, 670, textureX, textureY); // HR2
//		rightHandModel[2] = new ModelRendererTurbo(this, 939, 670, textureX, textureY); // HR3
//		rightHandModel[3] = new ModelRendererTurbo(this, 130, 705, textureX, textureY); // HR4
//		rightHandModel[4] = new ModelRendererTurbo(this, 165, 705, textureX, textureY); // HR5
//		rightHandModel[5] = new ModelRendererTurbo(this, 760, 680, textureX, textureY); // HR6
//		rightHandModel[6] = new ModelRendererTurbo(this, 760, 687, textureX, textureY); // HR7
//		rightHandModel[7] = new ModelRendererTurbo(this, 760, 703, textureX, textureY); // HR8
//		rightHandModel[8] = new ModelRendererTurbo(this, 760, 720, textureX, textureY); // HR9
//		rightHandModel[9] = new ModelRendererTurbo(this, 760, 726, textureX, textureY); // HR10
//		rightHandModel[10] = new ModelRendererTurbo(this, 760, 743, textureX, textureY); // HR11
//
//		rightHandModel[0].addFlexBox(7F, -16F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_LEFT); // // HL1
//
//		rightHandModel[1].addBox(-8F, -16F, -12F, 15, 64, 24, 0F); // HL2
//
//		rightHandModel[2].addFlexBox(-14F, -16F, -12F, 6, 64, 24, 0F, 0F, 0F, -11.9999F, -11.9999F, ModelRendererTurbo.MR_RIGHT); // HL3
//
//		rightHandModel[3].addBox(-1F, 47F, -4F, 8, 8, 8, 0F); // HL4
//
//		rightHandModel[4].addBox(-8F, 47F, -2F, 4, 6, 4, 0F); // HL5
//
//		rightHandModel[5].addBox(-6F, 47F, -10F, 11, 3, 1, 0F); // HL6
//
//		rightHandModel[6].addShapeBox(5F, 47F, -10F, 6, 3, 10, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // HL7
//
//		rightHandModel[7].addShapeBox(5F, 47F, 0F, 6, 3, 10, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F); // HL8
//
//		rightHandModel[8].addBox(-6F, 47F, 9F, 11, 3, 1, 0F); // HL9
//
//		rightHandModel[9].addShapeBox(-12F, 47F, 0F, 6, 3, 10, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -5.9999F, 0F, 0F); // HL10
//
//		rightHandModel[10].addShapeBox(-12F, 47F, -10F, 6, 3, 10, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F); // HL11


		leftLegModel = new ModelRendererTurbo[27];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // LR1
		leftLegModel[1] = new ModelRendererTurbo(this, 53, 400, textureX, textureY); // LR2
		leftLegModel[2] = new ModelRendererTurbo(this, 108, 400, textureX, textureY); // LR3
		leftLegModel[3] = new ModelRendererTurbo(this, 225, 400, textureX, textureY); // LR4
		leftLegModel[4] = new ModelRendererTurbo(this, 329, 415, textureX, textureY); // LR5
		leftLegModel[5] = new ModelRendererTurbo(this, 444, 400, textureX, textureY); // LR6
		leftLegModel[6] = new ModelRendererTurbo(this, 559, 400, textureX, textureY); // LR7
		leftLegModel[7] = new ModelRendererTurbo(this, 748, 200, textureX, textureY); // FR11
		leftLegModel[8] = new ModelRendererTurbo(this, 891, 200, textureX, textureY); // FR12
		leftLegModel[9] = new ModelRendererTurbo(this, 675, 475, textureX, textureY); // FR13
		leftLegModel[10] = new ModelRendererTurbo(this, 803, 475, textureX, textureY); // FR14
		leftLegModel[11] = new ModelRendererTurbo(this, 833, 475, textureX, textureY); // FR15
		leftLegModel[12] = new ModelRendererTurbo(this, 272, 200, textureX, textureY); // FR17
		leftLegModel[13] = new ModelRendererTurbo(this, 450, 240, textureX, textureY); // FR18
		leftLegModel[14] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR19
		leftLegModel[15] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR20
		leftLegModel[16] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR21
		leftLegModel[17] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR22
		leftLegModel[18] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR23
		leftLegModel[19] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR24
		leftLegModel[20] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR25
		leftLegModel[21] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR26
		leftLegModel[22] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // FR27
		leftLegModel[23] = new ModelRendererTurbo(this, 495, 240, textureX, textureY); // FR28
		leftLegModel[24] = new ModelRendererTurbo(this, 540, 240, textureX, textureY); // FR29
		leftLegModel[25] = new ModelRendererTurbo(this, 891, 375, textureX, textureY); // FR30
		leftLegModel[26] = new ModelRendererTurbo(this, 748, 170, textureX, textureY); // FR31

		leftLegModel[0].addBox(-11F, -11F, 5F, 22, 11, 2, 0F); // LR1
		leftLegModel[0].setRotationPoint(0F, -123F, -42F);

		leftLegModel[1].addShapeBox(-12F, 0F, 5F, 22, 14, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // LR2
		leftLegModel[1].setRotationPoint(0F, -123F, -42F);

		leftLegModel[2].addShapeBox(-21F, 14F, 5F, 28, 3, 16, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LR3
		leftLegModel[2].setRotationPoint(0F, -123F, -42F);

		leftLegModel[3].addShapeBox(-48F, 17F, 9F, 55, 31, 8, 0F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, 0F, -20F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, -20F, 0F); // LR4
		leftLegModel[3].setRotationPoint(0F, -123F, -42F);

		leftLegModel[4].addFlexBox(-56F, 27F, -13F, 24, 9, 32, 0F, -9F, -9F, 0F, 0F, ModelRendererTurbo.MR_TOP); // LR5
		leftLegModel[4].setRotationPoint(0F, -123F, -42F);

		leftLegModel[5].addBox(-56F, 36F, -13F, 24, 6, 32, 0F); // LR6
		leftLegModel[5].setRotationPoint(0F, -123F, -42F);

		leftLegModel[6].addFlexBox(-56F, 42F, -13F, 24, 9, 32, 0F, -9F, -9F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // LR7
		leftLegModel[6].setRotationPoint(0F, -123F, -42F);

		leftLegModel[7].addShapeBox(-42F, 88F, -8F, 41, 26, 16, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -10F, 0F, 0F); // FR11
		leftLegModel[7].setRotationPoint(0F, -123F, -42F);

		leftLegModel[8].addShapeBox(-24F, 88F, -18F, 16, 20, 36, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FR12
		leftLegModel[8].setRotationPoint(0F, -123F, -42F);

		leftLegModel[9].addShapeBox(-55F, 27F, -4F, 54, 87, 8, 0F, 0F, -15F, 0F, -50F, -5F, 0F, -50F, -5F, 0F, 0F, -15F, 0F, -44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -44F, 0F, 0F); // FR13
		leftLegModel[9].setRotationPoint(0F, -123F, -42F);

		leftLegModel[10].addShapeBox(-68F, 22F, -4F, 4, 92, 8, 0F, 0F, 0F, 0F, 10F, -15F, 0F, 10F, -15F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, 0F, -55F, 0F, 0F); // FR14
		leftLegModel[10].setRotationPoint(0F, -123F, -42F);

		leftLegModel[11].addShapeBox(-72F, 22F, -6F, 4, 92, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, 0F, -55F, 0F, 0F); // FR15
		leftLegModel[11].setRotationPoint(0F, -123F, -42F);

		leftLegModel[12].addBox(-37F, 114F, -6F, 35, 2, 12, 0F); // FR17
		leftLegModel[12].setRotationPoint(0F, -123F, -42F);

		leftLegModel[13].addShapeBox(-44F, 88F, -6F, 8, 26, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // FR18
		leftLegModel[13].setRotationPoint(0F, -123F, -42F);

		leftLegModel[14].addBox(-38F, 112F, -7F, 10, 2, 14, 0F); // FR19
		leftLegModel[14].setRotationPoint(0F, -123F, -42F);

		leftLegModel[15].addBox(-39F, 109F, -7F, 10, 2, 14, 0F); // FR20
		leftLegModel[15].setRotationPoint(0F, -123F, -42F);

		leftLegModel[16].addBox(-41F, 106F, -7F, 10, 2, 14, 0F); // FR21
		leftLegModel[16].setRotationPoint(0F, -123F, -42F);

		leftLegModel[17].addBox(-42F, 103F, -7F, 10, 2, 14, 0F); // FR22
		leftLegModel[17].setRotationPoint(0F, -123F, -42F);

		leftLegModel[18].addBox(-43F, 100F, -7F, 10, 2, 14, 0F); // FR23
		leftLegModel[18].setRotationPoint(0F, -123F, -42F);

		leftLegModel[19].addBox(-44F, 97F, -7F, 10, 2, 14, 0F); // FR24
		leftLegModel[19].setRotationPoint(0F, -123F, -42F);

		leftLegModel[20].addBox(-45F, 94F, -7F, 10, 2, 14, 0F); // FR25
		leftLegModel[20].setRotationPoint(0F, -123F, -42F);

		leftLegModel[21].addBox(-46F, 91F, -7F, 10, 2, 14, 0F); // FR26
		leftLegModel[21].setRotationPoint(0F, -123F, -42F);

		leftLegModel[22].addBox(-46F, 88F, -7F, 10, 2, 14, 0F); // FR27
		leftLegModel[22].setRotationPoint(0F, -123F, -42F);

		leftLegModel[23].addShapeBox(-46F, 57F, -14F, 8, 20, 11, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, -12F, 0F, -2F, 10F, -2F, 0F, 10F, -2F, -3F, -12F, 0F, 0F); // FR28
		leftLegModel[23].setRotationPoint(0F, -123F, -42F);

		leftLegModel[24].addShapeBox(-46F, 57F, 3F, 8, 20, 11, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, -12F, 0F, 0F, 10F, -2F, -3F, 10F, -2F, 0F, -12F, 0F, -2F); // FR29
		leftLegModel[24].setRotationPoint(0F, -123F, -42F);

		leftLegModel[25].addShapeBox(-33F, 81F, -18F, 16, 7, 36, 0F, -4F, 0F, -8F, -8F, -1F, -8F, -8F, -1F, -8F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FR30
		leftLegModel[25].setRotationPoint(0F, -123F, -42F);

		leftLegModel[26].addShapeBox(-49F, 80F, -8F, 38, 8, 16, 0F, -14F, 2F, -2F, -15F, 0F, -2F, -15F, 0F, -2F, -14F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FR31
		leftLegModel[26].setRotationPoint(0F, -123F, -42F);


		rightLegModel = new ModelRendererTurbo[27];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // LL1
		rightLegModel[1] = new ModelRendererTurbo(this, 53, 500, textureX, textureY); // LL2
		rightLegModel[2] = new ModelRendererTurbo(this, 108, 500, textureX, textureY); // LL3
		rightLegModel[3] = new ModelRendererTurbo(this, 225, 500, textureX, textureY); // LL4
		rightLegModel[4] = new ModelRendererTurbo(this, 329, 515, textureX, textureY); // LL5
		rightLegModel[5] = new ModelRendererTurbo(this, 444, 500, textureX, textureY); // LL6
		rightLegModel[6] = new ModelRendererTurbo(this, 559, 500, textureX, textureY); // LL7
		rightLegModel[7] = new ModelRendererTurbo(this, 748, 300, textureX, textureY); // FL11
		rightLegModel[8] = new ModelRendererTurbo(this, 891, 300, textureX, textureY); // FL12
		rightLegModel[9] = new ModelRendererTurbo(this, 675, 360, textureX, textureY); // FL13
		rightLegModel[10] = new ModelRendererTurbo(this, 803, 360, textureX, textureY); // FL14
		rightLegModel[11] = new ModelRendererTurbo(this, 833, 360, textureX, textureY); // FL15
		rightLegModel[12] = new ModelRendererTurbo(this, 272, 300, textureX, textureY); // FL17
		rightLegModel[13] = new ModelRendererTurbo(this, 450, 340, textureX, textureY); // FL18
		rightLegModel[14] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL19
		rightLegModel[15] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL20
		rightLegModel[16] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL21
		rightLegModel[17] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL22
		rightLegModel[18] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL23
		rightLegModel[19] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL24
		rightLegModel[20] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL25
		rightLegModel[21] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL26
		rightLegModel[22] = new ModelRendererTurbo(this, 170, 300, textureX, textureY); // FL27
		rightLegModel[23] = new ModelRendererTurbo(this, 495, 340, textureX, textureY); // FL28
		rightLegModel[24] = new ModelRendererTurbo(this, 540, 340, textureX, textureY); // FL29
		rightLegModel[25] = new ModelRendererTurbo(this, 891, 430, textureX, textureY); // FL30
		rightLegModel[26] = new ModelRendererTurbo(this, 748, 270, textureX, textureY); // FL31


		rightLegModel[0].addBox(-11F, -11F, -7F, 22, 11, 2, 0F); // LL1
		rightLegModel[0].setPosition(0F, -123F, 42F);

		rightLegModel[1].addShapeBox(-12F, 0F, -9F, 22, 14, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // LL2
		rightLegModel[1].setPosition(0F, -123F, 42F);

		rightLegModel[2].addShapeBox(-21F, 14F, -21F, 28, 3, 16, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // LL3
		rightLegModel[2].setPosition(0F, -123F, 42F);

		rightLegModel[3].addShapeBox(-48F, 17F, -17F, 55, 31, 8, 0F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, 0F, -20F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, -20F, 0F); // LL4
		rightLegModel[3].setPosition(0F, -123F, 42F);

		rightLegModel[4].addFlexBox(-56F, 27F, -19F, 24, 9, 32, 0F, -9F, -9F, 0F, 0F, ModelRendererTurbo.MR_TOP); // LL5
		rightLegModel[4].setPosition(0F, -123F, 42F);

		rightLegModel[5].addBox(-56F, 36F, -19F, 24, 6, 32, 0F); // LL6
		rightLegModel[5].setPosition(0F, -123F, 42F);

		rightLegModel[6].addFlexBox(-56F, 42F, -19F, 24, 9, 32, 0F, -9F, -9F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // LL7
		rightLegModel[6].setPosition(0F, -123F, 42F);

		rightLegModel[7].addShapeBox(-42F, 88F, -8F, 41, 26, 16, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -10F, 0F, 0F); // FL11
		rightLegModel[7].setPosition(0F, -123F, 42F);

		rightLegModel[8].addShapeBox(-24F, 88F, -18F, 16, 20, 36, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FL12
		rightLegModel[8].setPosition(0F, -123F, 42F);

		rightLegModel[9].addShapeBox(-55F, 27F, -4F, 54, 87, 8, 0F, 0F, -15F, 0F, -50F, -5F, 0F, -50F, -5F, 0F, 0F, -15F, 0F, -44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -44F, 0F, 0F); // FL13
		rightLegModel[9].setPosition(0F, -123F, 42F);

		rightLegModel[10].addShapeBox(-68F, 22F, -4F, 4, 92, 8, 0F, 0F, 0F, 0F, 10F, -15F, 0F, 10F, -15F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, 0F, -55F, 0F, 0F); // FL14
		rightLegModel[10].setPosition(0F, -123F, 42F);

		rightLegModel[11].addShapeBox(-72F, 22F, -6F, 4, 92, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, 0F, -55F, 0F, 0F); // FL15
		rightLegModel[11].setPosition(0F, -123F, 42F);

		rightLegModel[12].addBox(-37F, 114F, -6F, 35, 2, 12, 0F); // FL17
		rightLegModel[12].setPosition(0F, -123F, 42F);

		rightLegModel[13].addShapeBox(-44F, 88F, -6F, 8, 26, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // FL18
		rightLegModel[13].setPosition(0F, -123F, 42F);

		rightLegModel[14].addBox(-38F, 112F, -7F, 10, 2, 14, 0F); // FL19
		rightLegModel[14].setPosition(0F, -123F, 42F);

		rightLegModel[15].addBox(-39F, 109F, -7F, 10, 2, 14, 0F); // FL20
		rightLegModel[15].setPosition(0F, -123F, 42F);

		rightLegModel[16].addBox(-41F, 106F, -7F, 10, 2, 14, 0F); // FL21
		rightLegModel[16].setPosition(0F, -123F, 42F);

		rightLegModel[17].addBox(-42F, 103F, -7F, 10, 2, 14, 0F); // FL22
		rightLegModel[17].setPosition(0F, -123F, 42F);

		rightLegModel[18].addBox(-43F, 100F, -7F, 10, 2, 14, 0F); // FL23
		rightLegModel[18].setPosition(0F, -123F, 42F);

		rightLegModel[19].addBox(-44F, 97F, -7F, 10, 2, 14, 0F); // FL24
		rightLegModel[19].setPosition(0F, -123F, 42F);

		rightLegModel[20].addBox(-45F, 94F, -7F, 10, 2, 14, 0F); // FL25
		rightLegModel[20].setPosition(0F, -123F, 42F);

		rightLegModel[21].addBox(-46F, 91F, -7F, 10, 2, 14, 0F); // FL26
		rightLegModel[21].setPosition(0F, -123F, 42F);

		rightLegModel[22].addBox(-46F, 88F, -7F, 10, 2, 14, 0F); // FL27
		rightLegModel[22].setPosition(0F, -123F, 42F);

		rightLegModel[23].addShapeBox(-46F, 57F, 3F, 8, 20, 11, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, -12F, 0F, 0F, 10F, -2F, -3F, 10F, -2F, 0F, -12F, 0F, -2F); // FL28
		rightLegModel[23].setPosition(0F, -123F, 42F);

		rightLegModel[24].addShapeBox(-46F, 57F, -14F, 8, 20, 11, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, -12F, 0F, -2F, 10F, -2F, 0F, 10F, -2F, -3F, -12F, 0F, 0F); // FL29
		rightLegModel[24].setPosition(0F, -123F, 42F);

		rightLegModel[25].addShapeBox(-33F, 81F, -18F, 16, 7, 36, 0F, -4F, 0F, -8F, -8F, -1F, -8F, -8F, -1F, -8F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FL30
		rightLegModel[25].setPosition(0F, -123F, 42F);

		rightLegModel[26].addShapeBox(-49F, 80F, -8F, 38, 8, 16, 0F, -14F, 2F, -2F, -15F, 0F, -2F, -15F, 0F, -2F, -14F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // FL31
		rightLegModel[26].setPosition(0F, -123F, 42F);


		leftFootModel = new ModelRendererTurbo[11];
		leftFootModel[0] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // FR1
		leftFootModel[1] = new ModelRendererTurbo(this, 95, 200, textureX, textureY); // FR2
		leftFootModel[2] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // FR3
		leftFootModel[3] = new ModelRendererTurbo(this, 105, 240, textureX, textureY); // FR4
		leftFootModel[4] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // FR5
		leftFootModel[5] = new ModelRendererTurbo(this, 273, 220, textureX, textureY); // FR6
		leftFootModel[6] = new ModelRendererTurbo(this, 357, 200, textureX, textureY); // FR7
		leftFootModel[7] = new ModelRendererTurbo(this, 450, 200, textureX, textureY); // FR8
		leftFootModel[8] = new ModelRendererTurbo(this, 540, 200, textureX, textureY); // FR9
		leftFootModel[9] = new ModelRendererTurbo(this, 616, 200, textureX, textureY); // FR10
		leftFootModel[10] = new ModelRendererTurbo(this, 616, 155, textureX, textureY); // FR16


		leftFootModel[0].addShapeBox(6F, 8F, 16F, 24, 15, 22, 0F, -10F, 0F, 0F, 0F, -7F, -14F, -6F, -7F, 0F, 0F, 0F, -8F, -10F, 0F, 0F, 0F, 0F, -14F, -6F, 0F, 0F, 0F, 0F, -8F); // FR1
		leftFootModel[0].setRotationPoint(0F, -13F, -42F);

		leftFootModel[1].addShapeBox(6F, 8F, -38F, 24, 15, 22, 0F, 0F, 0F, -8F, -6F, -7F, 0F, 0F, -7F, -14F, -10F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, -14F, -10F, 0F, 0F); // FR2
		leftFootModel[1].setRotationPoint(0F, -13F, -42F);

		leftFootModel[2].addShapeBox(-12F, 5F, 7F, 28, 11, 23, 0F, -16F, 0F, 0F, 0F, -3F, -9F, -10F, -3F, 0F, 0F, 0F, -12F, -16F, 0F, 0F, 0F, 3F, -9F, -10F, 3F, 0F, 0F, 0F, -12F); // FR3
		leftFootModel[2].setRotationPoint(0F, -13F, -42F);

		leftFootModel[3].addShapeBox(-12F, 5F, -30F, 28, 11, 23, 0F, 0F, 0F, -12F, -10F, -3F, 0F, 0F, -3F, -9F, -16F, 0F, 0F, 0F, 0F, -12F, -10F, 3F, 0F, 0F, 3F, -9F, -16F, 0F, 0F); // FR4
		leftFootModel[3].setRotationPoint(0F, -13F, -42F);

		leftFootModel[4].addShapeBox(-12F, 5F, -18F, 16, 14, 36, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // FR5
		leftFootModel[4].setRotationPoint(0F, -13F, -42F);

		leftFootModel[5].addBox(-26F, 5F, -18F, 14, 14, 36, 0F); // FR6
		leftFootModel[5].setRotationPoint(0F, -13F, -42F);

		leftFootModel[6].addShapeBox(-36F, 5F, -18F, 10, 14, 36, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // FR7
		leftFootModel[6].setRotationPoint(0F, -13F, -42F);

		leftFootModel[7].addShapeBox(-56F, 5F, -12F, 20, 11, 24, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F); // FR8
		leftFootModel[7].setRotationPoint(0F, -13F, -42F);

		leftFootModel[8].addShapeBox(-76F, 8F, -8F, 20, 15, 16, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FR9
		leftFootModel[8].setRotationPoint(0F, -13F, -42F);

		leftFootModel[9].addTrapezoid(-31F, -11F, -15F, 30, 11, 30, 0F, -5.01F, ModelRendererTurbo.MR_TOP); // FR10
		leftFootModel[9].setRotationPoint(0F, -13F, -42F);

		leftFootModel[10].addBox(-31F, 0F, -15F, 30, 10, 30, 0F); // FR16
		leftFootModel[10].setRotationPoint(0F, -13F, -42F);


		rightFootModel = new ModelRendererTurbo[11];
		rightFootModel[0] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // FL1
		rightFootModel[1] = new ModelRendererTurbo(this, 95, 300, textureX, textureY); // FL2
		rightFootModel[2] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // FL3
		rightFootModel[3] = new ModelRendererTurbo(this, 105, 340, textureX, textureY); // FL4
		rightFootModel[4] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // FL5
		rightFootModel[5] = new ModelRendererTurbo(this, 273, 320, textureX, textureY); // FL6
		rightFootModel[6] = new ModelRendererTurbo(this, 357, 300, textureX, textureY); // FL7
		rightFootModel[7] = new ModelRendererTurbo(this, 450, 300, textureX, textureY); // FL8
		rightFootModel[8] = new ModelRendererTurbo(this, 540, 300, textureX, textureY); // FL9
		rightFootModel[9] = new ModelRendererTurbo(this, 616, 300, textureX, textureY); // FL10
		rightFootModel[10] = new ModelRendererTurbo(this, 616, 255, textureX, textureY); // FL16

		rightFootModel[0].addShapeBox(6F, 8F, 16F, 24, 15, 22, 0F, -10F, 0F, 0F, 0F, -7F, -14F, -6F, -7F, 0F, 0F, 0F, -8F, -10F, 0F, 0F, 0F, 0F, -14F, -6F, 0F, 0F, 0F, 0F, -8F); // FL1
		rightFootModel[0].setPosition(0F, -13F, 42F);

		rightFootModel[1].addShapeBox(6F, 8F, -38F, 24, 15, 22, 0F, 0F, 0F, -8F, -6F, -7F, 0F, 0F, -7F, -14F, -10F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, -14F, -10F, 0F, 0F); // FL2
		rightFootModel[1].setPosition(0F, -13F, 42F);

		rightFootModel[2].addShapeBox(-12F, 5F, 7F, 28, 11, 23, 0F, -16F, 0F, 0F, 0F, -3F, -9F, -10F, -3F, 0F, 0F, 0F, -12F, -16F, 0F, 0F, 0F, 3F, -9F, -10F, 3F, 0F, 0F, 0F, -12F); // FL3
		rightFootModel[2].setPosition(0F, -13F, 42F);

		rightFootModel[3].addShapeBox(-12F, 5F, -30F, 28, 11, 23, 0F, 0F, 0F, -12F, -10F, -3F, 0F, 0F, -3F, -9F, -16F, 0F, 0F, 0F, 0F, -12F, -10F, 3F, 0F, 0F, 3F, -9F, -16F, 0F, 0F); // FL4
		rightFootModel[3].setPosition(0F, -13F, 42F);

		rightFootModel[4].addShapeBox(-12F, 5F, -18F, 16, 14, 36, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // FL5
		rightFootModel[4].setPosition(0F, -13F, 42F);

		rightFootModel[5].addBox(-26F, 5F, -18F, 14, 14, 36, 0F); // FL6
		rightFootModel[5].setPosition(0F, -13F, 42F);

		rightFootModel[6].addShapeBox(-36F, 5F, -18F, 10, 14, 36, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // FL7
		rightFootModel[6].setPosition(0F, -13F, 42F);

		rightFootModel[7].addShapeBox(-56F, 5F, -12F, 20, 11, 24, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F); // FL8
		rightFootModel[7].setPosition(0F, -13F, 42F);

		rightFootModel[8].addShapeBox(-76F, 8F, -8F, 20, 15, 16, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FL9
		rightFootModel[8].setPosition(0F, -13F, 42F);

		rightFootModel[9].addTrapezoid(-31F, -11F, -15F, 30, 11, 30, 0F, -5.01F, ModelRendererTurbo.MR_TOP); // FL10
		rightFootModel[9].setPosition(0F, -13F, 42F);

		rightFootModel[10].addBox(-31F, 0F, -15F, 30, 10, 30, 0F); // FL16
		rightFootModel[10].setPosition(0F, -13F, 42F);


		translateAll(0, -10, 0);


		flipAll();
	}
}