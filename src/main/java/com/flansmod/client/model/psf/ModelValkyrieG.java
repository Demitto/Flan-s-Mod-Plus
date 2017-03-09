//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelValkyrieG extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelValkyrieG()
	{
		bodyModel = new ModelRendererTurbo[145];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Import Box7
		bodyModel[1] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Import Box8
		bodyModel[2] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Import Box9
		bodyModel[3] = new ModelRendererTurbo(this, 0, 268, textureX, textureY); // Import Box10
		bodyModel[4] = new ModelRendererTurbo(this, 0, 299, textureX, textureY); // Import Box11
		bodyModel[5] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Import Box12
		bodyModel[6] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Import Box13
		bodyModel[7] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Import Box14
		bodyModel[8] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box15
		bodyModel[9] = new ModelRendererTurbo(this, 90, 420, textureX, textureY); // Import Box17
		bodyModel[10] = new ModelRendererTurbo(this, 89, 451, textureX, textureY); // Import Box18
		bodyModel[11] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Box19
		bodyModel[12] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Box20
		bodyModel[13] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Box21
		bodyModel[14] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import Box22
		bodyModel[15] = new ModelRendererTurbo(this, 0, 549, textureX, textureY); // Import Box23
		bodyModel[16] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Import Box24
		bodyModel[17] = new ModelRendererTurbo(this, 0, 618, textureX, textureY); // Import Box25
		bodyModel[18] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Import Box27
		bodyModel[19] = new ModelRendererTurbo(this, 0, 671, textureX, textureY); // Import Box28
		bodyModel[20] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import Box29
		bodyModel[21] = new ModelRendererTurbo(this, 0, 729, textureX, textureY); // Import Box30
		bodyModel[22] = new ModelRendererTurbo(this, 0, 774, textureX, textureY); // Import Box31
		bodyModel[23] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Import Box32
		bodyModel[24] = new ModelRendererTurbo(this, 0, 839, textureX, textureY); // Import Box33
		bodyModel[25] = new ModelRendererTurbo(this, 0, 881, textureX, textureY); // Import Box34
		bodyModel[26] = new ModelRendererTurbo(this, 0, 618, textureX, textureY); // Import Box0
		bodyModel[27] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Import Box1
		bodyModel[28] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Import Box4
		bodyModel[29] = new ModelRendererTurbo(this, 0, 671, textureX, textureY); // Import Box5
		bodyModel[30] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import Box6
		bodyModel[31] = new ModelRendererTurbo(this, 100, 721, textureX, textureY); // Import Box7
		bodyModel[32] = new ModelRendererTurbo(this, 0, 774, textureX, textureY); // Import Box8
		bodyModel[33] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Import Box9
		bodyModel[34] = new ModelRendererTurbo(this, 0, 839, textureX, textureY); // Import Box11--
		bodyModel[35] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import Box12
		bodyModel[36] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box13
		bodyModel[37] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box14
		bodyModel[38] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box15
		bodyModel[39] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import Box0
		bodyModel[40] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box1
		bodyModel[41] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box2
		bodyModel[42] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box3--
		bodyModel[43] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box4
		bodyModel[44] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Import Box5
		bodyModel[45] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import Box6
		bodyModel[46] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box7
		bodyModel[47] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Box8
		bodyModel[48] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box9
		bodyModel[49] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box10
		bodyModel[50] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Import Box11
		bodyModel[51] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // Import Box12
		bodyModel[52] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box13
		bodyModel[53] = new ModelRendererTurbo(this, 200, 584, textureX, textureY); // Import Box14
		bodyModel[54] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box15
		bodyModel[55] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Import Box16
		bodyModel[56] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import Box17
		bodyModel[57] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box18
		bodyModel[58] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Box19
		bodyModel[59] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box20
		bodyModel[60] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box21
		bodyModel[61] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Import Box22
		bodyModel[62] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box23
		bodyModel[63] = new ModelRendererTurbo(this, 200, 584, textureX, textureY); // Import Box24
		bodyModel[64] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box0
		bodyModel[65] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box1
		bodyModel[66] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box2
		bodyModel[67] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box3
		bodyModel[68] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import Box4
		bodyModel[69] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box5
		bodyModel[70] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import Box7
		bodyModel[71] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Import Box8
		bodyModel[72] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Import Box9
		bodyModel[73] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box12
		bodyModel[74] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box13
		bodyModel[75] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box14
		bodyModel[76] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box15
		bodyModel[77] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box16
		bodyModel[78] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box17
		bodyModel[79] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box42
		bodyModel[80] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box43
		bodyModel[81] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box44
		bodyModel[82] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box45
		bodyModel[83] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box46
		bodyModel[84] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box47
		bodyModel[85] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import Box48
		bodyModel[86] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box49
		bodyModel[87] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box50
		bodyModel[88] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box52
		bodyModel[89] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box53
		bodyModel[90] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box54
		bodyModel[91] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box55
		bodyModel[92] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box56
		bodyModel[93] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box57
		bodyModel[94] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box58
		bodyModel[95] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box59
		bodyModel[96] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box60
		bodyModel[97] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box61
		bodyModel[98] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box62
		bodyModel[99] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box63
		bodyModel[100] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box64
		bodyModel[101] = new ModelRendererTurbo(this, 400, 515, textureX, textureY); // Import Box65
		bodyModel[102] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box66
		bodyModel[103] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box67
		bodyModel[104] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box68
		bodyModel[105] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box69
		bodyModel[106] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box70
		bodyModel[107] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import Box71
		bodyModel[108] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box72
		bodyModel[109] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box73
		bodyModel[110] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box74
		bodyModel[111] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box75
		bodyModel[112] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box76
		bodyModel[113] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box77
		bodyModel[114] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box78
		bodyModel[115] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box79
		bodyModel[116] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import Box80
		bodyModel[117] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box81
		bodyModel[118] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box82
		bodyModel[119] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box83
		bodyModel[120] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box84
		bodyModel[121] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box85
		bodyModel[122] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box86
		bodyModel[123] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box87
		bodyModel[124] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box88
		bodyModel[125] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box89
		bodyModel[126] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box90
		bodyModel[127] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box91
		bodyModel[128] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box92
		bodyModel[129] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box93
		bodyModel[130] = new ModelRendererTurbo(this, 400, 515, textureX, textureY); // Import Box94
		bodyModel[131] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box95
		bodyModel[132] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box96
		bodyModel[133] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box97
		bodyModel[134] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box98
		bodyModel[135] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box99
		bodyModel[136] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import Box100
		bodyModel[137] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import Box103
		bodyModel[138] = new ModelRendererTurbo(this, 75, 320, textureX, textureY); // Import Box0
		bodyModel[139] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Import Box40
		bodyModel[140] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Import Box41
		bodyModel[141] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import Box42
		bodyModel[142] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 43
		bodyModel[143] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 44
		bodyModel[144] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 45

		bodyModel[0].addShapeBox(0F, 0F, 0F, 59, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[0].setRotationPoint(-92F, -35F, -9.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 59, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box8
		bodyModel[1].setRotationPoint(-92F, -35F, 7.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 59, 6, 19, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -4F); // Import Box9
		bodyModel[2].setRotationPoint(-92F, -24F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 11, 15, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[3].setRotationPoint(-92F, -35F, -7.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 15, 13, 0F); // Import Box11
		bodyModel[4].setRotationPoint(-60F, -39F, -6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[5].setRotationPoint(-60F, -40F, -6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 4, 7, 0F); // Import Box13
		bodyModel[6].setRotationPoint(-60F, -44F, -3.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 9, 2, 13, 0F); // Import Box14
		bodyModel[7].setRotationPoint(-69F, -26F, -6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 15, 13, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[8].setRotationPoint(-57F, -39F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 3, 21, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[9].setRotationPoint(-39F, -46F, -10.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 8, 21, 0F); // Import Box18
		bodyModel[10].setRotationPoint(-39F, -43F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F, 0F, -7F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box19
		bodyModel[11].setRotationPoint(-56F, -43F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -7F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0.5F); // Import Box20
		bodyModel[12].setRotationPoint(-56F, -43F, 7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 52, 3, 21, 0F, 0F, 0F, -3F, 0F, -8F, -8.5F, 0F, -8F, -8.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 6F, -8F, 0F, 6F, -8F, 0F, 0F, 0F); // Import Box21
		bodyModel[13].setRotationPoint(-33F, -46F, -10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 52, 8, 21, 0F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Import Box22
		bodyModel[14].setRotationPoint(-33F, -43F, -10.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 27, 11, 21, 0F); // Import Box23
		bodyModel[15].setRotationPoint(-33F, -36F, -10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 1, 26, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[16].setRotationPoint(-51F, -31F, -35.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 19, 5, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[17].setRotationPoint(-51F, -36F, -11.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 4, 26, 0F, -18F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 2F, -18F, 0F, 2F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box27
		bodyModel[18].setRotationPoint(-44F, -40F, -35.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 3, 25, 0F); // Import Box28
		bodyModel[19].setRotationPoint(-32F, -31F, -35.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F, -30F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[20].setRotationPoint(-32F, -36F, -46.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 26, 4, 33, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Import Box30
		bodyModel[21].setRotationPoint(-25F, -40F, -35.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 26, 8, 33, 0F); // Import Box31
		bodyModel[22].setRotationPoint(-25F, -36F, -35.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 31, 7, 11, 0F, 0F, -3F, 0F, -4F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box32
		bodyModel[23].setRotationPoint(1F, -36F, -46.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 40, 12, 25, 0F, 0F, -4F, 0F, -9F, -7F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box33
		bodyModel[24].setRotationPoint(1F, -40F, -35.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 40, 11, 29, 0F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box34
		bodyModel[25].setRotationPoint(1F, -40F, -14.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 19, 5, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[26].setRotationPoint(-51F, -36F, 9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F); // Import Box1
		bodyModel[27].setRotationPoint(-51F, -31F, 9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 19, 4, 26, 0F, -18F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -25F, -18F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -24F); // Import Box4
		bodyModel[28].setRotationPoint(-44F, -40F, 9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 7, 3, 25, 0F); // Import Box5
		bodyModel[29].setRotationPoint(-32F, -31F, 10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -30F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box6
		bodyModel[30].setRotationPoint(-32F, -36F, 35.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 26, 4, 33, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 1F, 0F, -1F, 1F, 0F); // Import Box7
		bodyModel[31].setRotationPoint(-25F, -40F, 2.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 26, 8, 33, 0F); // Import Box8
		bodyModel[32].setRotationPoint(-25F, -36F, 2.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 31, 7, 11, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, -8F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, -8F, 0F, 0F, 0F); // Import Box9
		bodyModel[33].setRotationPoint(1F, -36F, 35.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 12, 25, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -9F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -9F, 0F, 0F, 0F, 0F, 0F); // Import Box11--
		bodyModel[34].setRotationPoint(1F, -40F, 10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 18, 1, 15, 0F); // Import Box12
		bodyModel[35].setRotationPoint(-55F, -30.5F, -25.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box13
		bodyModel[36].setRotationPoint(-57F, -30.5F, -25.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 21, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 10F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[37].setRotationPoint(-53F, -30F, -25.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 33, 2, 11, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box15
		bodyModel[38].setRotationPoint(-32F, -31F, -46.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 18, 1, 15, 0F); // Import Box0
		bodyModel[39].setRotationPoint(-55F, -30.5F, 10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box1
		bodyModel[40].setRotationPoint(-57F, -30.5F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 21, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 10F, 0F, 0F, 0F); // Import Box2
		bodyModel[41].setRotationPoint(-53F, -30F, 9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 33, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box3--
		bodyModel[42].setRotationPoint(-32F, -31F, 35.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F); // Import Box4
		bodyModel[43].setRotationPoint(-44F, -29F, -12.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Import Box5
		bodyModel[44].setRotationPoint(-44F, -29F, -25.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box6
		bodyModel[45].setRotationPoint(-16F, -14F, -25.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[46].setRotationPoint(-16F, -14F, -12.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Import Box8
		bodyModel[47].setRotationPoint(-18F, -11F, -25.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box9
		bodyModel[48].setRotationPoint(-16F, -11F, -25.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 36, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box10
		bodyModel[49].setRotationPoint(-4F, -11F, -25.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 36, 18, 15, 0F); // Import Box11
		bodyModel[50].setRotationPoint(-4F, -29F, -25.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 27, 4, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -4F); // Import Box12
		bodyModel[51].setRotationPoint(-33F, -24F, -10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 18, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[52].setRotationPoint(32F, -29F, -25.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 2, 15, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F); // Import Box14
		bodyModel[53].setRotationPoint(32F, -11F, -25.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F); // Import Box15
		bodyModel[54].setRotationPoint(-44F, -29F, 23.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Import Box16
		bodyModel[55].setRotationPoint(-44F, -29F, 10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box17
		bodyModel[56].setRotationPoint(-16F, -14F, 10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[57].setRotationPoint(-16F, -14F, 23.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Import Box19
		bodyModel[58].setRotationPoint(-18F, -11F, 10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box20
		bodyModel[59].setRotationPoint(-16F, -11F, 10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 36, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box21
		bodyModel[60].setRotationPoint(-4F, -11F, 10.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 36, 18, 15, 0F); // Import Box22
		bodyModel[61].setRotationPoint(-4F, -29F, 10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 18, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[62].setRotationPoint(32F, -29F, 10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 15, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F); // Import Box24
		bodyModel[63].setRotationPoint(32F, -11F, 10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F); // Import Box0
		bodyModel[64].setRotationPoint(-33F, -20F, -5.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[65].setRotationPoint(-23F, -20F, -5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F); // Import Box2
		bodyModel[66].setRotationPoint(-33F, -20F, 2.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F); // Import Box3
		bodyModel[67].setRotationPoint(-23F, -20F, 2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box4
		bodyModel[68].setRotationPoint(-28F, -20F, -2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box5
		bodyModel[69].setRotationPoint(-47F, -19F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 48, 11, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[70].setRotationPoint(-6F, -29F, -10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Import Box8
		bodyModel[71].setRotationPoint(-13F, -19F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Import Box9
		bodyModel[72].setRotationPoint(-13F, -19F, 0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[73].setRotationPoint(-9F, -45F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[74].setRotationPoint(-3F, -44F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box14
		bodyModel[75].setRotationPoint(-90F, -19F, -5.5F);
		bodyModel[75].rotateAngleX = -0.78539816F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box15
		bodyModel[76].setRotationPoint(-85F, -19F, -5.5F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box16
		bodyModel[77].setRotationPoint(-90F, -19F, 5.5F);
		bodyModel[77].rotateAngleX = 0.78539816F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box17
		bodyModel[78].setRotationPoint(-85F, -19F, 5.5F);
		bodyModel[78].rotateAngleX = 0.78539816F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 19, 16, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box42
		bodyModel[79].setRotationPoint(19F, -29F, -28F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box43
		bodyModel[80].setRotationPoint(19F, -29F, -31F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 17, 24, 16, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box44
		bodyModel[81].setRotationPoint(34F, -31F, -28F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box45
		bodyModel[82].setRotationPoint(34F, -31F, -31F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 15, 25, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box46
		bodyModel[83].setRotationPoint(51F, -31F, -28F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box47
		bodyModel[84].setRotationPoint(51F, -31F, -31F);

		bodyModel[85].addBox(0F, 0F, 0F, 36, 25, 16, 0F); // Import Box48
		bodyModel[85].setRotationPoint(66F, -31F, -28F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[86].setRotationPoint(66F, -31F, -31F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[87].setRotationPoint(102F, -31F, -31F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -12F, 0F); // Import Box52
		bodyModel[88].setRotationPoint(19F, -29F, -12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F); // Import Box53
		bodyModel[89].setRotationPoint(34F, -31F, -12F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Import Box54
		bodyModel[90].setRotationPoint(51F, -31F, -12F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box55
		bodyModel[91].setRotationPoint(66F, -31F, -12F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F); // Import Box56
		bodyModel[92].setRotationPoint(102F, -31F, -12F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[93].setRotationPoint(102F, -30F, -26F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, 0F, 0F, -2F); // Import Box58
		bodyModel[94].setRotationPoint(102F, -28F, -26F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 2F, 0F, 0F, 2F); // Import Box59
		bodyModel[95].setRotationPoint(102F, -28F, -16F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box60
		bodyModel[96].setRotationPoint(102F, -9F, -26F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box61
		bodyModel[97].setRotationPoint(102F, -17F, -28F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box62
		bodyModel[98].setRotationPoint(102F, -17F, -14F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[99].setRotationPoint(102F, -28F, -23.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[100].setRotationPoint(102F, -28F, -21.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box65
		bodyModel[101].setRotationPoint(102F, -28F, -19.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[102].setRotationPoint(102F, -28F, -17.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[103].setRotationPoint(102F, -10F, -23.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[104].setRotationPoint(102F, -10F, -21.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[105].setRotationPoint(102F, -10F, -19.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[106].setRotationPoint(102F, -10F, -17.5F);

		bodyModel[107].addShapeBox(0F, 0F, -0.5F, 41, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, -14F, 0F, 0F); // Import Box71
		bodyModel[107].setRotationPoint(59F, -8F, -30F);
		bodyModel[107].rotateAngleX = -0.78539816F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 15, 19, 16, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box72
		bodyModel[108].setRotationPoint(19F, -29F, 12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box73
		bodyModel[109].setRotationPoint(19F, -29F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box74
		bodyModel[110].setRotationPoint(34F, -31F, 9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box75
		bodyModel[111].setRotationPoint(51F, -31F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		bodyModel[112].setRotationPoint(66F, -31F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[113].setRotationPoint(102F, -31F, 9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 17, 24, 16, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box78
		bodyModel[114].setRotationPoint(34F, -31F, 12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 15, 25, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box79
		bodyModel[115].setRotationPoint(51F, -31F, 12F);

		bodyModel[116].addBox(0F, 0F, 0F, 36, 25, 16, 0F); // Import Box80
		bodyModel[116].setRotationPoint(66F, -31F, 12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -12F, 0F); // Import Box81
		bodyModel[117].setRotationPoint(19F, -29F, 28F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F); // Import Box82
		bodyModel[118].setRotationPoint(34F, -31F, 28F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Import Box83
		bodyModel[119].setRotationPoint(51F, -31F, 28F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box84
		bodyModel[120].setRotationPoint(66F, -31F, 28F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F); // Import Box85
		bodyModel[121].setRotationPoint(102F, -31F, 28F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box86
		bodyModel[122].setRotationPoint(102F, -30F, 14F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box87
		bodyModel[123].setRotationPoint(102F, -9F, 14F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, 0F, 0F, -2F); // Import Box88
		bodyModel[124].setRotationPoint(102F, -28F, 14F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 2F, 0F, 0F, 2F); // Import Box89
		bodyModel[125].setRotationPoint(102F, -28F, 24F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box90
		bodyModel[126].setRotationPoint(102F, -17F, 12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box91
		bodyModel[127].setRotationPoint(102F, -17F, 26F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[128].setRotationPoint(102F, -28F, 22.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box93
		bodyModel[129].setRotationPoint(102F, -28F, 20.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[130].setRotationPoint(102F, -28F, 18.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[131].setRotationPoint(102F, -28F, 16.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[132].setRotationPoint(102F, -10F, 22.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[133].setRotationPoint(102F, -10F, 20.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		bodyModel[134].setRotationPoint(102F, -10F, 18.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[135].setRotationPoint(102F, -10F, 16.5F);

		bodyModel[136].addShapeBox(0F, 0F, -0.5F, 41, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, -14F, 0F, 0F); // Import Box100
		bodyModel[136].setRotationPoint(59F, -8F, 30F);
		bodyModel[136].rotateAngleX = 0.78539816F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 11, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[137].setRotationPoint(42F, -29F, -10.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 26, 4, 21, 0F); // Import Box0
		bodyModel[138].setRotationPoint(-25F, -40F, -10.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 84, 10, 1, 0F); // Import Box40
		bodyModel[139].setRotationPoint(34F, -24F, 30.1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box41
		bodyModel[140].setRotationPoint(22F, -24F, 30.1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Import Box42
		bodyModel[141].setRotationPoint(21F, -22F, 30.1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 43
		bodyModel[142].setRotationPoint(21F, -22F, -31.1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 44
		bodyModel[143].setRotationPoint(22F, -24F, -31.1F);

		bodyModel[144].addBox(0F, 0F, 0F, 84, 10, 1, 0F); // Box 45
		bodyModel[144].setRotationPoint(34F, -24F, -31.1F);


		noseModel = new ModelRendererTurbo[6];
		noseModel[0] = new ModelRendererTurbo(this, 0, 48, textureX, textureY); // Import Box1
		noseModel[1] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // Import Box2
		noseModel[2] = new ModelRendererTurbo(this, 0, 102, textureX, textureY); // Import Box3
		noseModel[3] = new ModelRendererTurbo(this, 0, 126, textureX, textureY); // Import Box4
		noseModel[4] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Import Box5
		noseModel[5] = new ModelRendererTurbo(this, 0, 181, textureX, textureY); // Import Box6

		noseModel[0].addShapeBox(0F, 0F, 0F, 33, 9, 15, 0F, -4F, -7F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -7F, -6F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F); // Import Box1
		noseModel[0].setRotationPoint(-153F, -35F, -7.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 33, 4, 15, 0F, 0F, 0F, -5F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F); // Import Box2
		noseModel[1].setRotationPoint(-153F, -26F, -7.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -27F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -27F, 0F, -5F); // Import Box3
		noseModel[2].setRotationPoint(-148F, -22F, -7.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 28, 9, 15, 0F, 0F, 0F, -4F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -10F, 2F, 0F, -10F, 2F, 0F, -4F, 0F); // Import Box4
		noseModel[3].setRotationPoint(-120F, -35F, -7.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 28, 4, 15, 0F, 0F, 4F, 0F, 0F, 10F, 2F, 0F, 10F, 2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Import Box5
		noseModel[4].setRotationPoint(-120F, -26F, -7.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -5F); // Import Box6
		noseModel[5].setRotationPoint(-120F, -22F, -7.5F);


		tailModel = new ModelRendererTurbo[19];
		tailModel[0] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import Box10
		tailModel[1] = new ModelRendererTurbo(this, 198, 810, textureX, textureY); // Import Box11
		tailModel[2] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Import Box18
		tailModel[3] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Import Box19
		tailModel[4] = new ModelRendererTurbo(this, 200, 860, textureX, textureY); // Import Box20
		tailModel[5] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Box21
		tailModel[6] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Import Box22
		tailModel[7] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Import Box23
		tailModel[8] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box25
		tailModel[9] = new ModelRendererTurbo(this, 48, 970, textureX, textureY); // Import Box26
		tailModel[10] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box27
		tailModel[11] = new ModelRendererTurbo(this, 0, 881, textureX, textureY); // Import Box29
		tailModel[12] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Box37
		tailModel[13] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Box38
		tailModel[14] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box39
		tailModel[15] = new ModelRendererTurbo(this, 48, 970, textureX, textureY); // Import Box40
		tailModel[16] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box41
		tailModel[17] = new ModelRendererTurbo(this, 430, 975, textureX, textureY); // Import Box101
		tailModel[18] = new ModelRendererTurbo(this, 430, 975, textureX, textureY); // Import Box102

		tailModel[0].addShapeBox(0F, 0F, 0F, 8, 6, 29, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // Import Box10
		tailModel[0].setRotationPoint(41F, -35F, -14.5F);

		tailModel[1].addBox(0F, -1F, 0F, 52, 2, 31, 0F); // Import Box11
		tailModel[1].setRotationPoint(49F, -36F, -15.5F);

		tailModel[2].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		tailModel[2].setRotationPoint(53F, -38F, -8.5F);

		tailModel[3].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		tailModel[3].setRotationPoint(53F, -38F, 5.5F);

		tailModel[4].addShapeBox(0F, -1F, 0F, 52, 4, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box20
		tailModel[4].setRotationPoint(49F, -34F, -15.5F);

		tailModel[5].addShapeBox(0F, -1F, 0F, 22, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box21
		tailModel[5].setRotationPoint(101F, -36F, -15.5F);

		tailModel[6].addBox(0F, -1F, 0F, 6, 1, 2, 0F); // Import Box22
		tailModel[6].setRotationPoint(120F, -36.5F, -9.5F);

		tailModel[7].addBox(0F, -1F, 0F, 6, 1, 2, 0F); // Import Box23
		tailModel[7].setRotationPoint(120F, -36.5F, 7.5F);

		tailModel[8].addShapeBox(47F, -11F, -1F, 14, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		tailModel[8].setRotationPoint(54F, -36F, -14.5F);
		tailModel[8].rotateAngleX = 0.34906585F;

		tailModel[9].addShapeBox(47F, -36F, -1F, 14, 25, 2, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		tailModel[9].setRotationPoint(54F, -36F, -14.5F);
		tailModel[9].rotateAngleX = 0.34906585F;

		tailModel[10].addShapeBox(47F, -36F, -1F, 12, 25, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F); // Import Box27
		tailModel[10].setRotationPoint(68F, -36F, -14.5F);
		tailModel[10].rotateAngleX = 0.34906585F;

		tailModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 29, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box29
		tailModel[11].setRotationPoint(41F, -37F, -14.5F);

		tailModel[12].addShapeBox(0F, -30F, -1F, 47, 30, 2, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		tailModel[12].setRotationPoint(54F, -36F, -14.5F);
		tailModel[12].rotateAngleX = 0.34906585F;

		tailModel[13].addShapeBox(0F, -30F, -1F, 47, 30, 2, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		tailModel[13].setRotationPoint(54F, -36F, 14.5F);
		tailModel[13].rotateAngleX = -0.34906585F;

		tailModel[14].addShapeBox(47F, -11F, -1F, 14, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		tailModel[14].setRotationPoint(54F, -36F, 14.5F);
		tailModel[14].rotateAngleX = -0.34906585F;

		tailModel[15].addShapeBox(47F, -36F, -1F, 14, 25, 2, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		tailModel[15].setRotationPoint(54F, -36F, 14.5F);
		tailModel[15].rotateAngleX = -0.34906585F;

		tailModel[16].addShapeBox(47F, -36F, -1F, 12, 25, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F); // Import Box41
		tailModel[16].setRotationPoint(68F, -36F, 14.5F);
		tailModel[16].rotateAngleX = -0.34906585F;

		tailModel[17].addBox(0F, -1F, 0F, 40, 16, 10, 0F); // Import Box101
		tailModel[17].setRotationPoint(51F, -30F, -10.5F);

		tailModel[18].addBox(0F, -1F, 0F, 40, 16, 10, 0F); // Import Box102
		tailModel[18].setRotationPoint(51F, -30F, 0.5F);


		bayModel = new ModelRendererTurbo[21];
		bayModel[0] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Import Box0
		bayModel[1] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Import Box1
		bayModel[2] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Import Box2
		bayModel[3] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Import Box3
		bayModel[4] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Import Box0
		bayModel[5] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Import Box1
		bayModel[6] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Import Box2
		bayModel[7] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Import Box3
		bayModel[8] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Import Box4
		bayModel[9] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Import Box5
		bayModel[10] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import Box0
		bayModel[11] = new ModelRendererTurbo(this, 600, 140, textureX, textureY); // Import Box1
		bayModel[12] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Import Box2
		bayModel[13] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Import Box3
		bayModel[14] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box4
		bayModel[15] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box5
		bayModel[16] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box6
		bayModel[17] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box7
		bayModel[18] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box8
		bayModel[19] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box9
		bayModel[20] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box10

		bayModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Import Box0
		bayModel[0].setRotationPoint(-29F, -12F, -3.5F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F); // Import Box1
		bayModel[1].setRotationPoint(-29F, -11F, -3.5F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box2
		bayModel[2].setRotationPoint(-29F, -11F, 2.5F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F); // Import Box3
		bayModel[3].setRotationPoint(-29F, -6F, -3.5F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 55, 5, 9, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Import Box0
		bayModel[4].setRotationPoint(-19F, -11F, -4.5F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 55, 2, 9, 0F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F); // Import Box1
		bayModel[5].setRotationPoint(-19F, -13F, -4.5F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 55, 2, 9, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -2F); // Import Box2
		bayModel[6].setRotationPoint(-19F, -6F, -4.5F);

		bayModel[7].addBox(0F, 0F, 0F, 16, 6, 11, 0F); // Import Box3
		bayModel[7].setRotationPoint(36F, -11.5F, -5.5F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bayModel[8].setRotationPoint(36F, -13.5F, -5.5F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box5
		bayModel[9].setRotationPoint(36F, -5.5F, -5.5F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -2F, 0F, -0.5F); // Import Box0
		bayModel[10].setRotationPoint(-17F, -4F, -1F);

		bayModel[11].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F); // Import Box1
		bayModel[11].setRotationPoint(52F, -11.5F, -5.5F);

		bayModel[12].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, 0F, -2F); // Import Box2
		bayModel[12].setRotationPoint(52F, -5.5F, -5.5F);

		bayModel[13].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, -2F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0F, 0F); // Import Box3
		bayModel[13].setRotationPoint(52F, -13.5F, -5.5F);

		bayModel[14].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import Box4
		bayModel[14].setRotationPoint(58F, -6F, -1F);

		bayModel[15].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bayModel[15].setRotationPoint(58F, -18F, -1F);

		bayModel[16].addBox(0F, 0F, 0F, 10, 7, 2, 0F); // Import Box6
		bayModel[16].setRotationPoint(24F, -18F, -1F);

		bayModel[17].addBox(0F, 0F, 0F, 10, 7, 2, 0F); // Import Box7
		bayModel[17].setRotationPoint(-3F, -18F, -1F);

		bayModel[18].addBox(0F, -1.5F, -0.5F, 10, 1, 1, 0F); // Import Box8
		bayModel[18].setRotationPoint(-26F, -8.5F, 0F);

		bayModel[19].addBox(0F, -1.5F, -0.5F, 10, 1, 1, 0F); // Import Box9
		bayModel[19].setRotationPoint(-26F, -8.5F, 0F);
		bayModel[19].rotateAngleX = 2.0943951F;

		bayModel[20].addBox(0F, -1.5F, -0.5F, 10, 1, 1, 0F); // Import Box10
		bayModel[20].setRotationPoint(-26F, -8.5F, 0F);
		bayModel[20].rotateAngleX = -2.0943951F;


		leftWingModel = new ModelRendererTurbo[47];
		leftWingModel[0] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box104
		leftWingModel[1] = new ModelRendererTurbo(this, 250, 620, textureX, textureY); // Import Box105
		leftWingModel[2] = new ModelRendererTurbo(this, 350, 519, textureX, textureY); // Import Box106
		leftWingModel[3] = new ModelRendererTurbo(this, 400, 620, textureX, textureY); // Import Box107
		leftWingModel[4] = new ModelRendererTurbo(this, 250, 500, textureX, textureY); // Import Box108
		leftWingModel[5] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Import Box109
		leftWingModel[6] = new ModelRendererTurbo(this, 400, 610, textureX, textureY); // Import Box111
		leftWingModel[7] = new ModelRendererTurbo(this, 400, 580, textureX, textureY); // Import Box112
		leftWingModel[8] = new ModelRendererTurbo(this, 420, 570, textureX, textureY); // Import Box113
		leftWingModel[9] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box0
		leftWingModel[10] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box2
		leftWingModel[11] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box3
		leftWingModel[12] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box4
		leftWingModel[13] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box5
		leftWingModel[14] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box10
		leftWingModel[15] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box11
		leftWingModel[16] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box20
		leftWingModel[17] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box21
		leftWingModel[18] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box22
		leftWingModel[19] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box23
		leftWingModel[20] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box24
		leftWingModel[21] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box25
		leftWingModel[22] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box26
		leftWingModel[23] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box27
		leftWingModel[24] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box28
		leftWingModel[25] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box29
		leftWingModel[26] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box30
		leftWingModel[27] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box31
		leftWingModel[28] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box32
		leftWingModel[29] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box33
		leftWingModel[30] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box34
		leftWingModel[31] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box35
		leftWingModel[32] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box36
		leftWingModel[33] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box37
		leftWingModel[34] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box38
		leftWingModel[35] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box40
		leftWingModel[36] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box41
		leftWingModel[37] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box42
		leftWingModel[38] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box43
		leftWingModel[39] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box44
		leftWingModel[40] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box45
		leftWingModel[41] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box46
		leftWingModel[42] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box47
		leftWingModel[43] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box48
		leftWingModel[44] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box49
		leftWingModel[45] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box50
		leftWingModel[46] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box51

		leftWingModel[0].addShapeBox(0F, 0F, -103F, 19, 2, 103, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		leftWingModel[0].setRotationPoint(0F, -32F, -46F);
		leftWingModel[0].rotateAngleY = 0.66322512F;

		leftWingModel[1].addShapeBox(-6F, 0F, -103F, 6, 2, 99, 0F, -9F, -0.5F, 0F, 6F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, 6F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F); // Import Box105
		leftWingModel[1].setRotationPoint(0F, -32F, -46F);
		leftWingModel[1].rotateAngleY = 0.66322512F;

		leftWingModel[2].addBox(19F, 0F, -32F, 6, 2, 24, 0F); // Import Box106
		leftWingModel[2].setRotationPoint(0F, -32F, -46F);
		leftWingModel[2].rotateAngleY = 0.66322512F;

		leftWingModel[3].addShapeBox(25F, 0F, -32F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box107
		leftWingModel[3].setRotationPoint(0F, -32F, -46F);
		leftWingModel[3].rotateAngleY = 0.66322512F;

		leftWingModel[4].addBox(19F, 0F, -103F, 4, 2, 71, 0F); // Import Box108
		leftWingModel[4].setRotationPoint(0F, -32F, -46F);
		leftWingModel[4].rotateAngleY = 0.66322512F;

		leftWingModel[5].addShapeBox(23F, 0F, -103F, 7, 2, 33, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		leftWingModel[5].setRotationPoint(0F, -32F, -46F);
		leftWingModel[5].rotateAngleY = 0.66322512F;

		leftWingModel[6].addShapeBox(3F, 0F, -105F, 3, 2, 2, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box111
		leftWingModel[6].setRotationPoint(0F, -32F, -46F);
		leftWingModel[6].rotateAngleY = 0.66322512F;

		leftWingModel[7].addShapeBox(6F, 0F, -105F, 18, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		leftWingModel[7].setRotationPoint(0F, -32F, -46F);
		leftWingModel[7].rotateAngleY = 0.66322512F;

		leftWingModel[8].addShapeBox(24F, 0F, -105F, 5, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		leftWingModel[8].setRotationPoint(0F, -32F, -46F);
		leftWingModel[8].rotateAngleY = 0.66322512F;

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 10, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		leftWingModel[9].setRotationPoint(11F, -30F, -51F);

		leftWingModel[10].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box2
		leftWingModel[10].setRotationPoint(6F, -21F, -52F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box3
		leftWingModel[11].setRotationPoint(1F, -21F, -52F);

		leftWingModel[12].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box4
		leftWingModel[12].setRotationPoint(24F, -20.5F, -51.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box5
		leftWingModel[13].setRotationPoint(26F, -21F, -52F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box10
		leftWingModel[14].setRotationPoint(26.5F, -19.5F, -52F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box11
		leftWingModel[15].setRotationPoint(26.5F, -21F, -50.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box20
		leftWingModel[16].setRotationPoint(26.5F, -26F, -47.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box21
		leftWingModel[17].setRotationPoint(26.5F, -24.5F, -49F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box22
		leftWingModel[18].setRotationPoint(26F, -26F, -49F);

		leftWingModel[19].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box23
		leftWingModel[19].setRotationPoint(24F, -25.5F, -48.5F);

		leftWingModel[20].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box24
		leftWingModel[20].setRotationPoint(6F, -26F, -49F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box25
		leftWingModel[21].setRotationPoint(1F, -26F, -49F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box26
		leftWingModel[22].setRotationPoint(26.5F, -26F, -53.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box27
		leftWingModel[23].setRotationPoint(26.5F, -24.5F, -55F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box28
		leftWingModel[24].setRotationPoint(26F, -26F, -55F);

		leftWingModel[25].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box29
		leftWingModel[25].setRotationPoint(24F, -25.5F, -54.5F);

		leftWingModel[26].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box30
		leftWingModel[26].setRotationPoint(6F, -26F, -55F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box31
		leftWingModel[27].setRotationPoint(1F, -26F, -55F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box32
		leftWingModel[28].setRotationPoint(25F, -21F, -82F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box33
		leftWingModel[29].setRotationPoint(50.5F, -24.5F, -85F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box34
		leftWingModel[30].setRotationPoint(50F, -26F, -85F);

		leftWingModel[31].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box35
		leftWingModel[31].setRotationPoint(48F, -25.5F, -84.5F);

		leftWingModel[32].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box36
		leftWingModel[32].setRotationPoint(30F, -26F, -85F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box37
		leftWingModel[33].setRotationPoint(25F, -26F, -85F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 10, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box38
		leftWingModel[34].setRotationPoint(35F, -30F, -81F);

		leftWingModel[35].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box40
		leftWingModel[35].setRotationPoint(30F, -21F, -82F);

		leftWingModel[36].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box41
		leftWingModel[36].setRotationPoint(48F, -20.5F, -81.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box42
		leftWingModel[37].setRotationPoint(50.5F, -19.5F, -82F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box43
		leftWingModel[38].setRotationPoint(50F, -21F, -82F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box44
		leftWingModel[39].setRotationPoint(50.5F, -21F, -80.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box45
		leftWingModel[40].setRotationPoint(50.5F, -26F, -83.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box46
		leftWingModel[41].setRotationPoint(50F, -26F, -79F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box47
		leftWingModel[42].setRotationPoint(50.5F, -24.5F, -79F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box48
		leftWingModel[43].setRotationPoint(50.5F, -26F, -77.5F);

		leftWingModel[44].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box49
		leftWingModel[44].setRotationPoint(48F, -25.5F, -78.5F);

		leftWingModel[45].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box50
		leftWingModel[45].setRotationPoint(30F, -26F, -79F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box51
		leftWingModel[46].setRotationPoint(25F, -26F, -79F);


		rightWingModel = new ModelRendererTurbo[47];
		rightWingModel[0] = new ModelRendererTurbo(this, 400, 610, textureX, textureY); // Import Box0
		rightWingModel[1] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Import Box1
		rightWingModel[2] = new ModelRendererTurbo(this, 350, 520, textureX, textureY); // Import Box2
		rightWingModel[3] = new ModelRendererTurbo(this, 400, 620, textureX, textureY); // Import Box3
		rightWingModel[4] = new ModelRendererTurbo(this, 250, 500, textureX, textureY); // Import Box4
		rightWingModel[5] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Import Box5
		rightWingModel[6] = new ModelRendererTurbo(this, 400, 610, textureX, textureY); // Import Box6
		rightWingModel[7] = new ModelRendererTurbo(this, 400, 580, textureX, textureY); // Import Box7
		rightWingModel[8] = new ModelRendererTurbo(this, 420, 570, textureX, textureY); // Import Box8
		rightWingModel[9] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box52
		rightWingModel[10] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box53
		rightWingModel[11] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box54
		rightWingModel[12] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box55
		rightWingModel[13] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box56
		rightWingModel[14] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box57
		rightWingModel[15] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box58
		rightWingModel[16] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box59
		rightWingModel[17] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box60
		rightWingModel[18] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box61
		rightWingModel[19] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box62
		rightWingModel[20] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box63
		rightWingModel[21] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box64
		rightWingModel[22] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box65
		rightWingModel[23] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box66
		rightWingModel[24] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box67
		rightWingModel[25] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box68
		rightWingModel[26] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box69
		rightWingModel[27] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box70
		rightWingModel[28] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box71
		rightWingModel[29] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box72
		rightWingModel[30] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box73
		rightWingModel[31] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box74
		rightWingModel[32] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box75
		rightWingModel[33] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box76
		rightWingModel[34] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box77
		rightWingModel[35] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box78
		rightWingModel[36] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box79
		rightWingModel[37] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box80
		rightWingModel[38] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box81
		rightWingModel[39] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box82
		rightWingModel[40] = new ModelRendererTurbo(this, 600, 310, textureX, textureY); // Import Box83
		rightWingModel[41] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box84
		rightWingModel[42] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box85
		rightWingModel[43] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box86
		rightWingModel[44] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box87
		rightWingModel[45] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box88
		rightWingModel[46] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Import Box89

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 19, 2, 103, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Import Box0
		rightWingModel[0].setRotationPoint(0F, -32F, 46F);
		rightWingModel[0].rotateAngleY = -0.66322512F;

		rightWingModel[1].addShapeBox(-6F, 0F, 4F, 6, 2, 99, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 6F, 0F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 6F, 0F, 0F, -9F, -0.5F, 0F); // Import Box1
		rightWingModel[1].setRotationPoint(0F, -32F, 46F);
		rightWingModel[1].rotateAngleY = -0.66322512F;

		rightWingModel[2].addBox(19F, 0F, 8F, 6, 2, 24, 0F); // Import Box2
		rightWingModel[2].setRotationPoint(0F, -32F, 46F);
		rightWingModel[2].rotateAngleY = -0.66322512F;

		rightWingModel[3].addShapeBox(25F, 0F, 23F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		rightWingModel[3].setRotationPoint(0F, -32F, 46F);
		rightWingModel[3].rotateAngleY = -0.66322512F;

		rightWingModel[4].addBox(19F, 0F, 32F, 4, 2, 71, 0F); // Import Box4
		rightWingModel[4].setRotationPoint(0F, -32F, 46F);
		rightWingModel[4].rotateAngleY = -0.66322512F;

		rightWingModel[5].addShapeBox(23F, 0F, 70F, 7, 2, 33, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		rightWingModel[5].setRotationPoint(0F, -32F, 46F);
		rightWingModel[5].rotateAngleY = -0.66322512F;

		rightWingModel[6].addShapeBox(3F, 0F, 103F, 3, 2, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box6
		rightWingModel[6].setRotationPoint(0F, -32F, 46F);
		rightWingModel[6].rotateAngleY = -0.66322512F;

		rightWingModel[7].addShapeBox(6F, 0F, 103F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box7
		rightWingModel[7].setRotationPoint(0F, -32F, 46F);
		rightWingModel[7].rotateAngleY = -0.66322512F;

		rightWingModel[8].addShapeBox(24F, 0F, 103F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Import Box8
		rightWingModel[8].setRotationPoint(0F, -32F, 46F);
		rightWingModel[8].rotateAngleY = -0.66322512F;

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 10, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box52
		rightWingModel[9].setRotationPoint(11F, -30F, 49F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box53
		rightWingModel[10].setRotationPoint(26F, -26F, 45F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box54
		rightWingModel[11].setRotationPoint(26F, -21F, 48F);

		rightWingModel[12].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box55
		rightWingModel[12].setRotationPoint(6F, -21F, 48F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box56
		rightWingModel[13].setRotationPoint(26.5F, -19.5F, 48F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box57
		rightWingModel[14].setRotationPoint(26.5F, -21F, 49.5F);

		rightWingModel[15].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box58
		rightWingModel[15].setRotationPoint(24F, -20.5F, 48.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box59
		rightWingModel[16].setRotationPoint(1F, -21F, 48F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box60
		rightWingModel[17].setRotationPoint(1F, -26F, 51F);

		rightWingModel[18].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box61
		rightWingModel[18].setRotationPoint(6F, -26F, 51F);

		rightWingModel[19].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box62
		rightWingModel[19].setRotationPoint(24F, -25.5F, 51.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box63
		rightWingModel[20].setRotationPoint(26F, -26F, 51F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box64
		rightWingModel[21].setRotationPoint(26.5F, -26F, 52.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box65
		rightWingModel[22].setRotationPoint(26.5F, -24.5F, 51F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box66
		rightWingModel[23].setRotationPoint(26.5F, -24.5F, 45F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box67
		rightWingModel[24].setRotationPoint(26.5F, -26F, 46.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box68
		rightWingModel[25].setRotationPoint(1F, -26F, 45F);

		rightWingModel[26].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box69
		rightWingModel[26].setRotationPoint(6F, -26F, 45F);

		rightWingModel[27].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box70
		rightWingModel[27].setRotationPoint(24F, -25.5F, 45.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 10, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box71
		rightWingModel[28].setRotationPoint(35F, -30F, 79F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box72
		rightWingModel[29].setRotationPoint(25F, -26F, 75F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box73
		rightWingModel[30].setRotationPoint(25F, -21F, 78F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box74
		rightWingModel[31].setRotationPoint(25F, -26F, 81F);

		rightWingModel[32].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box75
		rightWingModel[32].setRotationPoint(30F, -26F, 81F);

		rightWingModel[33].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box76
		rightWingModel[33].setRotationPoint(30F, -21F, 78F);

		rightWingModel[34].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Box77
		rightWingModel[34].setRotationPoint(30F, -26F, 75F);

		rightWingModel[35].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box78
		rightWingModel[35].setRotationPoint(48F, -25.5F, 75.5F);

		rightWingModel[36].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box79
		rightWingModel[36].setRotationPoint(48F, -25.5F, 81.5F);

		rightWingModel[37].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box80
		rightWingModel[37].setRotationPoint(48F, -20.5F, 78.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box81
		rightWingModel[38].setRotationPoint(50F, -21F, 78F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box82
		rightWingModel[39].setRotationPoint(50F, -26F, 81F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Import Box83
		rightWingModel[40].setRotationPoint(50F, -26F, 75F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box84
		rightWingModel[41].setRotationPoint(50.5F, -26F, 76.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box85
		rightWingModel[42].setRotationPoint(50.5F, -26F, 82.5F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box86
		rightWingModel[43].setRotationPoint(50.5F, -21F, 79.5F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box87
		rightWingModel[44].setRotationPoint(50.5F, -19.5F, 78F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box88
		rightWingModel[45].setRotationPoint(50.5F, -24.5F, 81F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box89
		rightWingModel[46].setRotationPoint(50.5F, -24.5F, 75F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import Box110

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, -52F, 8, 2, 38, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		pitchFlapLeftWingModel[0].setRotationPoint(29F, -32F, -46F);
		pitchFlapLeftWingModel[0].rotateAngleY = 0.66322512F;


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import Box9

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 14F, 8, 2, 38, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		pitchFlapRightWingModel[0].setRotationPoint(29F, -32F, 46F);
		pitchFlapRightWingModel[0].rotateAngleY = -0.66322512F;


		bodyWheelModel = new ModelRendererTurbo[15];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 400, 830, textureX, textureY); // Import Box3
		bodyWheelModel[1] = new ModelRendererTurbo(this, 400, 830, textureX, textureY); // Import Box4
		bodyWheelModel[2] = new ModelRendererTurbo(this, 463, 830, textureX, textureY); // Import Box5
		bodyWheelModel[3] = new ModelRendererTurbo(this, 480, 830, textureX, textureY); // Import Box6
		bodyWheelModel[4] = new ModelRendererTurbo(this, 400, 850, textureX, textureY); // Import Box7
		bodyWheelModel[5] = new ModelRendererTurbo(this, 400, 850, textureX, textureY); // Import Box8
		bodyWheelModel[6] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Import Box9
		bodyWheelModel[7] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import Box10
		bodyWheelModel[8] = new ModelRendererTurbo(this, 450, 870, textureX, textureY); // Import Box11
		bodyWheelModel[9] = new ModelRendererTurbo(this, 450, 870, textureX, textureY); // Import Box12
		bodyWheelModel[10] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import Box13
		bodyWheelModel[11] = new ModelRendererTurbo(this, 450, 872, textureX, textureY); // Import Box14
		bodyWheelModel[12] = new ModelRendererTurbo(this, 450, 870, textureX, textureY); // Import Box15
		bodyWheelModel[13] = new ModelRendererTurbo(this, 440, 850, textureX, textureY); // Import Box16
		bodyWheelModel[14] = new ModelRendererTurbo(this, 430, 865, textureX, textureY); // Import Box17

		bodyWheelModel[0].addBox(0F, 0F, -6F, 16, 2, 7, 0F); // Import Box3
		bodyWheelModel[0].setRotationPoint(-75F, -20F, -5.5F);
		bodyWheelModel[0].rotateAngleX = 0.90757121F;

		bodyWheelModel[1].addBox(0F, 0F, -1F, 16, 2, 7, 0F); // Import Box4
		bodyWheelModel[1].setRotationPoint(-75F, -20F, 5.5F);
		bodyWheelModel[1].rotateAngleX = -0.90757121F;

		bodyWheelModel[2].addBox(0F, 0F, 0F, 1, 13, 5, 0F); // Import Box5
		bodyWheelModel[2].setRotationPoint(-87F, -20F, -2.5F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 4, 12, 4, 0F); // Import Box6
		bodyWheelModel[3].setRotationPoint(-84F, -20F, -2F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box7
		bodyWheelModel[4].setRotationPoint(-80F, -15F, -1.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box8
		bodyWheelModel[5].setRotationPoint(-74F, -15F, -1.5F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Import Box9
		bodyWheelModel[6].setRotationPoint(-83F, -8F, -1F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 8, 4, 3, 0F); // Import Box10
		bodyWheelModel[7].setRotationPoint(-86F, 4F, 1F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyWheelModel[8].setRotationPoint(-86F, 2F, 1F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box12
		bodyWheelModel[9].setRotationPoint(-86F, 8F, 1F);

		bodyWheelModel[10].addBox(0F, 0F, 0F, 8, 4, 3, 0F); // Import Box13
		bodyWheelModel[10].setRotationPoint(-86F, 4F, -4F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyWheelModel[11].setRotationPoint(-86F, 2F, -4F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box15
		bodyWheelModel[12].setRotationPoint(-86F, 8F, -4F);

		bodyWheelModel[13].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Import Box16
		bodyWheelModel[13].setRotationPoint(-81F, -2F, -1F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Import Box17
		bodyWheelModel[14].setRotationPoint(-77F, 0F, -0.5F);


		leftWingWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import Box27
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import Box28
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 450, 900, textureX, textureY); // Import Box29
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 400, 930, textureX, textureY); // Import Box30
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 450, 930, textureX, textureY); // Import Box31
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 450, 860, textureX, textureY); // Import Box32
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 400, 860, textureX, textureY); // Import Box33
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 450, 860, textureX, textureY); // Import Box34
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 400, 950, textureX, textureY); // Import Box35

		leftWingWheelModel[0].addShapeBox(0F, 0F, -3F, 17, 15, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -4F, 0F, -1F); // Import Box27
		leftWingWheelModel[0].setRotationPoint(41F, -10F, -27F);
		leftWingWheelModel[0].rotateAngleX = -0.36651914F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, -3F, 17, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -1F, 0F, -1F); // Import Box28
		leftWingWheelModel[1].setRotationPoint(59F, -10F, -12F);
		leftWingWheelModel[1].rotateAngleX = 0.36651914F;

		leftWingWheelModel[2].addShapeBox(0F, 0F, -12F, 2, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box29
		leftWingWheelModel[2].setRotationPoint(35F, -10F, -15F);

		leftWingWheelModel[3].addBox(0F, 0F, -4F, 4, 9, 4, 0F); // Import Box30
		leftWingWheelModel[3].setRotationPoint(42F, -10F, -19F);

		leftWingWheelModel[4].addBox(0F, 0F, -2F, 2, 9, 2, 0F); // Import Box31
		leftWingWheelModel[4].setRotationPoint(43F, -3F, -20F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, -2F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box32
		leftWingWheelModel[5].setRotationPoint(40F, 8F, -22F);

		leftWingWheelModel[6].addBox(0F, 0F, -2F, 8, 4, 2, 0F); // Import Box33
		leftWingWheelModel[6].setRotationPoint(40F, 4F, -22F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, -2F, 8, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		leftWingWheelModel[7].setRotationPoint(40F, 2F, -22F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, -2F, 23, 2, 2, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box35
		leftWingWheelModel[8].setRotationPoint(46F, -4F, -20F);


		rightWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import Box18
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import Box19
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 450, 900, textureX, textureY); // Import Box20
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 400, 930, textureX, textureY); // Import Box21
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 450, 930, textureX, textureY); // Import Box22
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 450, 860, textureX, textureY); // Import Box23
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 400, 860, textureX, textureY); // Import Box24
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 450, 860, textureX, textureY); // Import Box25
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 400, 950, textureX, textureY); // Import Box26

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 17, 15, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -4F, 0F, -1F); // Import Box18
		rightWingWheelModel[0].setRotationPoint(41F, -10F, 27F);
		rightWingWheelModel[0].rotateAngleX = 0.36651914F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 17, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -1F, 0F, -1F); // Import Box19
		rightWingWheelModel[1].setRotationPoint(59F, -10F, 12F);
		rightWingWheelModel[1].rotateAngleX = -0.36651914F;

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box20
		rightWingWheelModel[2].setRotationPoint(35F, -10F, 15F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 4, 9, 4, 0F); // Import Box21
		rightWingWheelModel[3].setRotationPoint(42F, -10F, 19F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Import Box22
		rightWingWheelModel[4].setRotationPoint(43F, -3F, 20F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box23
		rightWingWheelModel[5].setRotationPoint(40F, 8F, 22F);

		rightWingWheelModel[6].addBox(0F, 0F, 0F, 8, 4, 2, 0F); // Import Box24
		rightWingWheelModel[6].setRotationPoint(40F, 4F, 22F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		rightWingWheelModel[7].setRotationPoint(40F, 2F, 22F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 23, 2, 2, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box26
		rightWingWheelModel[8].setRotationPoint(46F, -4F, 20F);


		bodyDoorCloseModel = new ModelRendererTurbo[9];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 91, 364, textureX, textureY); // Import Box10
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1, 420, textureX, textureY); // Import Box11
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 146, 480, textureX, textureY); // Import Box7
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 146, 480, textureX, textureY); // Import Box8
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 71, 276, textureX, textureY); // Import Box10
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Box11
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 107, 593, textureX, textureY); // Import Box12
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 186, 971, textureX, textureY); // Import Box13
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 304, 967, textureX, textureY); // Import Box2

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F, 0F, 0F, -3.5F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F); // Import Box10
		bodyDoorCloseModel[0].setRotationPoint(-59F, -47.5F, -10F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 20, 10, 20, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box11
		bodyDoorCloseModel[1].setRotationPoint(-59F, -44.5F, -10F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyDoorCloseModel[2].setRotationPoint(-59F, -44.5F, -10F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyDoorCloseModel[3].setRotationPoint(-59F, -44.5F, 9F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyDoorCloseModel[4].setRotationPoint(-55F, -47.5F, -10F);

		bodyDoorCloseModel[5].addShapeBox(-10F, 0F, 0F, 10, 3, 19, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyDoorCloseModel[5].setRotationPoint(-59F, -47.5F, -9.5F);

		bodyDoorCloseModel[6].addBox(-10F, 3F, 0F, 10, 10, 19, 0F); // Import Box12
		bodyDoorCloseModel[6].setRotationPoint(-59F, -47.5F, -9.5F);

		bodyDoorCloseModel[7].addShapeBox(-32F, 0F, 0F, 23, 3, 19, 0F, 0F, -8F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, -4.5F, 0F, 8.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, -0.5F); // Import Box13
		bodyDoorCloseModel[7].setRotationPoint(-60F, -47.5F, -9.5F);

		bodyDoorCloseModel[8].addShapeBox(-32F, 3F, 0F, 23, 10, 19, 0F, 0F, -8.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box2
		bodyDoorCloseModel[8].setRotationPoint(-60F, -47.5F, -9.5F);


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 110, 1, textureX, textureY); // Import Box0

		hudModel[0].addShapeBox(0F, -3F, -3F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -54F, 0F, 0F, -54F, 0F, 0F, -54F, -54F, 0F, -54F, -54F); // Import Box0
		hudModel[0].setRotationPoint(-78F, -41F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
