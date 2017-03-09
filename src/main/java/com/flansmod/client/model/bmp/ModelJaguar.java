//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelJaguar extends ModelPlane
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelJaguar()
	{
		bodyModel = new ModelRendererTurbo[81];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Import Box8
		bodyModel[1] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import Box9
		bodyModel[2] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import Box10
		bodyModel[3] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import Box11
		bodyModel[4] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box12
		bodyModel[5] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box13
		bodyModel[6] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import Box14
		bodyModel[7] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import Box15
		bodyModel[8] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import Box16
		bodyModel[9] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box17
		bodyModel[10] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box18
		bodyModel[11] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import Box19
		bodyModel[12] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import Box20
		bodyModel[13] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Import Box21
		bodyModel[14] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import Box22
		bodyModel[15] = new ModelRendererTurbo(this, 0, 486, textureX, textureY); // Import Box23
		bodyModel[16] = new ModelRendererTurbo(this, 0, 486, textureX, textureY); // Import Box24
		bodyModel[17] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import Box25
		bodyModel[18] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Box26
		bodyModel[19] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import Box27
		bodyModel[20] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import Box28
		bodyModel[21] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Box29
		bodyModel[22] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Import Box30
		bodyModel[23] = new ModelRendererTurbo(this, 0, 675, textureX, textureY); // Import Box31
		bodyModel[24] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Import Box32
		bodyModel[25] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import Box33
		bodyModel[26] = new ModelRendererTurbo(this, 0, 735, textureX, textureY); // Import Box34
		bodyModel[27] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box35
		bodyModel[28] = new ModelRendererTurbo(this, 0, 765, textureX, textureY); // Import Box36
		bodyModel[29] = new ModelRendererTurbo(this, 0, 785, textureX, textureY); // Import Box37
		bodyModel[30] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Import Box38
		bodyModel[31] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Import Box39
		bodyModel[32] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Box40
		bodyModel[33] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import Box41
		bodyModel[34] = new ModelRendererTurbo(this, 0, 905, textureX, textureY); // Import Box42
		bodyModel[35] = new ModelRendererTurbo(this, 0, 935, textureX, textureY); // Import Box44
		bodyModel[36] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Import Box45
		bodyModel[37] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box46
		bodyModel[38] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box47
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Import Box51
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1065, textureX, textureY); // Import Box52
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box53
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Import Box56
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1163, textureX, textureY); // Import Box57
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Import Box58
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Import Box59
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1215, textureX, textureY); // Import Box60
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box61
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Import Box62
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box64
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import Box66
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import Box67
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box68
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import Box70
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1430, textureX, textureY); // Import Box71
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Import Box72
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1470, textureX, textureY); // Import Box73
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1495, textureX, textureY); // Import Box74
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1512, textureX, textureY); // Import Box75
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import Box76
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Import Box77
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1580, textureX, textureY); // Import Box78
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Import Box79
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box80
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1512, textureX, textureY); // Import Box81
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1470, textureX, textureY); // Import Box82
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import Box83
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import Box84
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import Box85
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1430, textureX, textureY); // Import Box86
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1495, textureX, textureY); // Import Box87
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import Box88
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Import Box89
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1580, textureX, textureY); // Import Box90
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import Box91
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Box92
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Box93
		bodyModel[77] = new ModelRendererTurbo(this, 0, 985, textureX, textureY); // Import Box133
		bodyModel[78] = new ModelRendererTurbo(this, 0, 975, textureX, textureY); // Import Box134
		bodyModel[79] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import Box135
		bodyModel[80] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 3, 20, 0F, 0F, -5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, -4F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Import Box8
		bodyModel[0].setRotationPoint(-81F, -38F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 18, 20, 0F, 0F, -5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box9
		bodyModel[1].setRotationPoint(-81F, -36F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 20, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Import Box10
		bodyModel[2].setRotationPoint(-81F, -18F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 20, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[3].setRotationPoint(-55F, -38F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 57, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box12
		bodyModel[4].setRotationPoint(-55F, -18F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 48, 20, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[5].setRotationPoint(-55F, -38F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F, 6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 4F, 6F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[6].setRotationPoint(-25F, -46F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F, 6F, 0F, 4F, -6F, 0F, 4F, -6F, 0F, -4F, 6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[7].setRotationPoint(-25F, -46F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[8].setRotationPoint(-31F, -48F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, 10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -3F); // Import Box17
		bodyModel[9].setRotationPoint(-55F, -48F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 3F); // Import Box18
		bodyModel[10].setRotationPoint(-55F, -48F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 9, 20, 2, 0F); // Import Box19
		bodyModel[11].setRotationPoint(-7F, -38F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F, 0F, -9F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[12].setRotationPoint(-7F, -47F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 9, 20, 2, 0F); // Import Box21
		bodyModel[13].setRotationPoint(-7F, -38F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F, 0F, -9F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[14].setRotationPoint(-7F, -47F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[15].setRotationPoint(-1F, -47F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[16].setRotationPoint(-1F, -47F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[17].setRotationPoint(-1F, -49F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 20, 16, 0F); // Import Box26
		bodyModel[18].setRotationPoint(-9F, -38F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 7, 13, 0F); // Import Box27
		bodyModel[19].setRotationPoint(-10F, -44F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 7, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[20].setRotationPoint(-7F, -44F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 14, 3, 16, 0F); // Import Box29
		bodyModel[21].setRotationPoint(-23F, -21F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 18, 10, 16, 0F); // Import Box30
		bodyModel[22].setRotationPoint(-54F, -28F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 10, 16, 0F, 0F, -5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[23].setRotationPoint(-54F, -38F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Import Box32
		bodyModel[24].setRotationPoint(-36.5F, -37F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box33
		bodyModel[25].setRotationPoint(-36.5F, -30F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box34
		bodyModel[26].setRotationPoint(-36.5F, -25F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Import Box35
		bodyModel[27].setRotationPoint(-36.5F, -30F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 10, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[28].setRotationPoint(-36.5F, -28F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Import Box37
		bodyModel[29].setRotationPoint(-30.5F, -32F, -1F);
		bodyModel[29].rotateAngleZ = -0.41887902F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box38
		bodyModel[30].setRotationPoint(-28F, -49F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box39
		bodyModel[31].setRotationPoint(-28F, -49F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 24, 20, 28, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box40
		bodyModel[32].setRotationPoint(2F, -38F, -14F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 24, 9, 20, 0F, 0F, 0F, -4F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Import Box41
		bodyModel[33].setRotationPoint(2F, -47F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 24, 2, 20, 0F, 0F, 0F, -6F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 4F, -5F, 0F, 4F, -5F, 0F, 0F, -4F); // Import Box42
		bodyModel[34].setRotationPoint(2F, -49F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 24, 2, 28, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F); // Import Box44
		bodyModel[35].setRotationPoint(2F, -18F, -14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Import Box45
		bodyModel[36].setRotationPoint(-17F, -20F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Import Box46
		bodyModel[37].setRotationPoint(-17F, -22F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, -0.1F, 4F); // Import Box47
		bodyModel[38].setRotationPoint(-17F, -18F, -14F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 20, 30, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box51
		bodyModel[39].setRotationPoint(26F, -38F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 5, 30, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box52
		bodyModel[40].setRotationPoint(26F, -43F, -15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 78, 5, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[41].setRotationPoint(26F, -48F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 24, 4, 4, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[42].setRotationPoint(2F, -50F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box57
		bodyModel[43].setRotationPoint(3F, -51F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[44].setRotationPoint(2F, -52F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 21, 2, 30, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Import Box59
		bodyModel[45].setRotationPoint(26F, -18F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 57, 20, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[46].setRotationPoint(47F, -38F, -15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 57, 2, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box61
		bodyModel[47].setRotationPoint(47F, -18F, -15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 57, 5, 30, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[48].setRotationPoint(47F, -43F, -15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F); // Import Box64
		bodyModel[49].setRotationPoint(-13F, -43F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[50].setRotationPoint(-13F, -43F, -19F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[51].setRotationPoint(-13F, -30F, -19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box68
		bodyModel[52].setRotationPoint(-13F, -43F, -20F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 14, 10, 0F); // Import Box70
		bodyModel[53].setRotationPoint(-3F, -43F, -22F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		bodyModel[54].setRotationPoint(-3F, -43F, -23F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F); // Import Box72
		bodyModel[55].setRotationPoint(-3F, -43F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 14, 14, 8, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[56].setRotationPoint(4F, -43F, -20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 14, 14, 1, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box74
		bodyModel[57].setRotationPoint(4F, -43F, -23F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 14, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Import Box75
		bodyModel[58].setRotationPoint(4F, -43F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 5F, 0F, 0F, 0F); // Import Box76
		bodyModel[59].setRotationPoint(18F, -43F, -20F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 3F, 0F, -1F, 2F); // Import Box77
		bodyModel[60].setRotationPoint(18F, -43F, -12F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F, 0F, -1F, 0F, 0F, -1F, -13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -13F, 0F, 0F, 13F, 0F, 0F, 0F); // Import Box78
		bodyModel[61].setRotationPoint(18F, -43F, -21F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 14, 2, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[62].setRotationPoint(-3F, -43F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		bodyModel[63].setRotationPoint(-13F, -43F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 14, 14, 2, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		bodyModel[64].setRotationPoint(4F, -43F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 14, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box82
		bodyModel[65].setRotationPoint(4F, -43F, 12F);

		bodyModel[66].addBox(0F, 0F, 0F, 7, 14, 10, 0F); // Import Box83
		bodyModel[66].setRotationPoint(-3F, -43F, 12F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[67].setRotationPoint(-13F, -43F, 12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 0F); // Import Box85
		bodyModel[68].setRotationPoint(-13F, -43F, 19F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box86
		bodyModel[69].setRotationPoint(-3F, -43F, 22F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F, 0F); // Import Box87
		bodyModel[70].setRotationPoint(4F, -43F, 22F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 18, 14, 8, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -13F, 0F, 0F, 0F); // Import Box88
		bodyModel[71].setRotationPoint(18F, -43F, 12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 14, 2, 0F, 0F, -1F, 2F, 0F, -1F, 3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 3F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box89
		bodyModel[72].setRotationPoint(18F, -43F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, -1F, -13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, -1F, -13F, 0F, -1F, 0F); // Import Box90
		bodyModel[73].setRotationPoint(18F, -43F, 20F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Import Box91
		bodyModel[74].setRotationPoint(-13F, -30F, 12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[75].setRotationPoint(41F, -49F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		bodyModel[76].setRotationPoint(56F, -49F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[77].setRotationPoint(-17F, -22F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[78].setRotationPoint(-17F, -20F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 43, 2, 4, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 4F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Import Box135
		bodyModel[79].setRotationPoint(-17F, -18F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -54F, 0F, 0F, -54F, 0F, 0F, -54F, -54F, 0F, -54F, -54F); // Box 0
		bodyModel[80].setRotationPoint(-37F, -44F, -3F);



		noseModel = new ModelRendererTurbo[9];
		noseModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Box0
		noseModel[1] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Box1
		noseModel[2] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box2
		noseModel[3] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box3
		noseModel[4] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Import Box4
		noseModel[5] = new ModelRendererTurbo(this, 0, 165, textureX, textureY); // Import Box6
		noseModel[6] = new ModelRendererTurbo(this, 0, 165, textureX, textureY); // Import Box7
		noseModel[7] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import Box54
		noseModel[8] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import Box55

		noseModel[0].addTrapezoid(0F, 0F, 0F, 31, 2, 2, 0F, -0.90F, ModelRendererTurbo.MR_RIGHT); // Import Box0
		noseModel[0].setRotationPoint(-153F, -22F, -1F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 31, 10, 14, 0F, 0F, -7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F); // Import Box1
		noseModel[1].setRotationPoint(-122F, -29F, -7F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 31, 2, 14, 0F, 0F, -8.9F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, -6F, 0F, 7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -6F); // Import Box2
		noseModel[2].setRotationPoint(-122F, -31F, -7F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 31, 2, 14, 0F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -6F); // Import Box3
		noseModel[3].setRotationPoint(-122F, -19F, -7F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 13, 16, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box4
		noseModel[4].setRotationPoint(-91F, -31F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Import Box6
		noseModel[5].setRotationPoint(-91F, -33F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F); // Import Box7
		noseModel[6].setRotationPoint(-91F, -18F, -8F);

		noseModel[7].addBox(0F, 0F, 0F, 1, 0, 10, 0F); // Import Box54
		noseModel[7].setRotationPoint(-112F, -24F, -5F);

		noseModel[8].addBox(0F, 0F, 0F, 1, 0, 10, 0F); // Import Box55
		noseModel[8].setRotationPoint(-109F, -22F, -5F);


		tailModel = new ModelRendererTurbo[37];
		tailModel[0] = new ModelRendererTurbo(this, 0, 1605, textureX, textureY); // Import Box129
		tailModel[1] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Import Box130
		tailModel[2] = new ModelRendererTurbo(this, 0, 1685, textureX, textureY); // Import Box131
		tailModel[3] = new ModelRendererTurbo(this, 0, 1705, textureX, textureY); // Import Box132
		tailModel[4] = new ModelRendererTurbo(this, 0, 1745, textureX, textureY); // Import Box136
		tailModel[5] = new ModelRendererTurbo(this, 0, 1775, textureX, textureY); // Import Box137
		tailModel[6] = new ModelRendererTurbo(this, 0, 1805, textureX, textureY); // Import Box138
		tailModel[7] = new ModelRendererTurbo(this, 0, 1831, textureX, textureY); // Import Box139
		tailModel[8] = new ModelRendererTurbo(this, 0, 1865, textureX, textureY); // Import Box140
		tailModel[9] = new ModelRendererTurbo(this, 0, 1885, textureX, textureY); // Import Box141
		tailModel[10] = new ModelRendererTurbo(this, 0, 1905, textureX, textureY); // Import Box142
		tailModel[11] = new ModelRendererTurbo(this, 0, 1940, textureX, textureY); // Import Box143
		tailModel[12] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Import Box144
		tailModel[13] = new ModelRendererTurbo(this, 0, 1980, textureX, textureY); // Import Box145
		tailModel[14] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box146
		tailModel[15] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box147
		tailModel[16] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box148
		tailModel[17] = new ModelRendererTurbo(this, 0, 2000, textureX, textureY); // Import Box149
		tailModel[18] = new ModelRendererTurbo(this, 0, 1980, textureX, textureY); // Import Box150
		tailModel[19] = new ModelRendererTurbo(this, 0, 1940, textureX, textureY); // Import Box151
		tailModel[20] = new ModelRendererTurbo(this, 0, 1905, textureX, textureY); // Import Box152
		tailModel[21] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Import Box153
		tailModel[22] = new ModelRendererTurbo(this, 0, 1885, textureX, textureY); // Import Box154
		tailModel[23] = new ModelRendererTurbo(this, 0, 1831, textureX, textureY); // Import Box155
		tailModel[24] = new ModelRendererTurbo(this, 0, 1865, textureX, textureY); // Import Box156
		tailModel[25] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box157
		tailModel[26] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box158
		tailModel[27] = new ModelRendererTurbo(this, 200, 25, textureX, textureY); // Import Box160
		tailModel[28] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Import Box161
		tailModel[29] = new ModelRendererTurbo(this, 200, 115, textureX, textureY); // Import Box162
		tailModel[30] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Import Box163
		tailModel[31] = new ModelRendererTurbo(this, 200, 25, textureX, textureY); // Import Box164
		tailModel[32] = new ModelRendererTurbo(this, 200, 115, textureX, textureY); // Import Box165
		tailModel[33] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box0
		tailModel[34] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box1
		tailModel[35] = new ModelRendererTurbo(this, 200, 310, textureX, textureY); // Import Box2
		tailModel[36] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box3

		tailModel[0].addShapeBox(0F, 0F, 0F, 39, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box129
		tailModel[0].setRotationPoint(104F, -38F, -15F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 39, 5, 30, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box130
		tailModel[1].setRotationPoint(104F, -43F, -15F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 39, 5, 10, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F); // Import Box131
		tailModel[2].setRotationPoint(104F, -48F, -5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 39, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 5F, -6F); // Import Box132
		tailModel[3].setRotationPoint(104F, -34F, -15F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 44, 4, 22, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Import Box136
		tailModel[4].setRotationPoint(143F, -38F, -11F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 44, 5, 22, 0F, 0F, 0F, -5F, 0F, -4F, -10F, 0F, -4F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Import Box137
		tailModel[5].setRotationPoint(143F, -43F, -11F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 44, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 5F, -1F); // Import Box138
		tailModel[6].setRotationPoint(143F, -34F, -11F);

		tailModel[7].addBox(0F, 0F, 0F, 18, 14, 15, 0F); // Import Box139
		tailModel[7].setRotationPoint(104F, -32F, -15F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 18, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		tailModel[8].setRotationPoint(104F, -34F, -15F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 18, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box141
		tailModel[9].setRotationPoint(104F, -18F, -15F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 19, 14, 15, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		tailModel[10].setRotationPoint(122F, -32F, -15F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 19, 2, 15, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Import Box143
		tailModel[11].setRotationPoint(122F, -34F, -15F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 19, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box144
		tailModel[12].setRotationPoint(122F, -18F, -15F);

		tailModel[13].addBox(0F, 0F, 0F, 4, 8, 11, 0F); // Import Box145
		tailModel[13].setRotationPoint(141F, -26F, -13F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		tailModel[14].setRotationPoint(141F, -28F, -13F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box147
		tailModel[15].setRotationPoint(141F, -18F, -13F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box148
		tailModel[16].setRotationPoint(141F, -18F, 2F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		tailModel[17].setRotationPoint(141F, -28F, 2F);

		tailModel[18].addBox(0F, 0F, 0F, 4, 8, 11, 0F); // Import Box150
		tailModel[18].setRotationPoint(141F, -26F, 2F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 19, 2, 15, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Import Box151
		tailModel[19].setRotationPoint(122F, -34F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 19, 14, 15, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		tailModel[20].setRotationPoint(122F, -32F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 19, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box153
		tailModel[21].setRotationPoint(122F, -18F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 18, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box154
		tailModel[22].setRotationPoint(104F, -18F, 0F);

		tailModel[23].addBox(0F, 0F, 0F, 18, 14, 15, 0F); // Import Box155
		tailModel[23].setRotationPoint(104F, -32F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 18, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		tailModel[24].setRotationPoint(104F, -34F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 33, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, -3F, 0F, -14F, 0F, 0F); // Import Box157
		tailModel[25].setRotationPoint(107F, -18F, -15F);
		tailModel[25].rotateAngleX = -0.52359878F;

		tailModel[26].addShapeBox(0F, 0F, 0F, 33, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1.5F, -14F, 0F, -1.5F); // Import Box158
		tailModel[26].setRotationPoint(107F, -18F, 13F);
		tailModel[26].rotateAngleX = 0.52359878F;

		tailModel[27].addShapeBox(0F, 0F, 0F, 40, 4, 37, 0F, -37F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 6F, 0F, 0F, 0F, -37F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 6F, 0F, 0F, 0F); // Import Box160
		tailModel[27].setRotationPoint(145F, -38F, -47F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 37, 0F, -37F, -1.5F, 0F, 37F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -37F, -1.5F, 0F, 37F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box161
		tailModel[28].setRotationPoint(143F, -38F, -47F);

		tailModel[29].addShapeBox(12F, -2F, 0F, 14, 4, 43, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -12F, -3F, 3F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 3F, 12F, 0F, 0F); // Import Box162
		tailModel[29].setRotationPoint(173F, -36F, -47F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 37, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 37F, 0F, 0F, -37F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 37F, 0F, 0F, -37F, -1.5F, 0F); // Import Box163
		tailModel[30].setRotationPoint(143F, -38F, 10F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 40, 4, 37, 0F, 0F, 0F, 0F, -12F, 0F, 6F, 0F, 0F, 0F, -37F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 6F, 0F, 0F, 0F, -37F, 0F, 0F); // Import Box164
		tailModel[31].setRotationPoint(145F, -38F, 10F);

		tailModel[32].addShapeBox(12F, -2F, 0F, 14, 4, 43, 0F, 12F, 0F, 0F, -12F, -3F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		tailModel[32].setRotationPoint(173F, -36F, 4F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 52, 63, 2, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		tailModel[33].setRotationPoint(135F, -102F, -1F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F, -51F, 0F, -0.5F, 51F, 0F, 0F, 51F, 0F, 0F, -51F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box1
		tailModel[34].setRotationPoint(133F, -102F, -1F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 9, 63, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 9F, 0F, 0F); // Import Box2
		tailModel[35].setRotationPoint(187F, -102F, -1F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 35, 4, 3, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		tailModel[36].setRotationPoint(162F, -89F, -1.5F);


		leftWingModel = new ModelRendererTurbo[39];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Box94
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Box95
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Import Box96
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box97
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box98
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 535, textureX, textureY); // Import Box99
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Import Box100
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 630, textureX, textureY); // Import Box101
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import Box102
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Import Box103
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 710, textureX, textureY); // Import Box104
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 730, textureX, textureY); // Import Box105
		leftWingModel[12] = new ModelRendererTurbo(this, 200, 770, textureX, textureY); // Import Box106
		leftWingModel[13] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Import Box0
		leftWingModel[14] = new ModelRendererTurbo(this, 200, 815, textureX, textureY); // Import Box1
		leftWingModel[15] = new ModelRendererTurbo(this, 200, 825, textureX, textureY); // Import Box2
		leftWingModel[16] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Import Box3
		leftWingModel[17] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import Box4
		leftWingModel[18] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Box5
		leftWingModel[19] = new ModelRendererTurbo(this, 200, 925, textureX, textureY); // Import Box6
		leftWingModel[20] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import Box7
		leftWingModel[21] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import Box8
		leftWingModel[22] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Box9
		leftWingModel[23] = new ModelRendererTurbo(this, 200, 925, textureX, textureY); // Import Box10
		leftWingModel[24] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import Box11
		leftWingModel[25] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Import Box12
		leftWingModel[26] = new ModelRendererTurbo(this, 200, 975, textureX, textureY); // Import Box13
		leftWingModel[27] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import Box14
		leftWingModel[28] = new ModelRendererTurbo(this, 200, 990, textureX, textureY); // Import Box15
		leftWingModel[29] = new ModelRendererTurbo(this, 200, 1000, textureX, textureY); // Import Box16
		leftWingModel[30] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box17
		leftWingModel[31] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box18
		leftWingModel[32] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box19
		leftWingModel[33] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box20
		leftWingModel[34] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box21
		leftWingModel[35] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box22
		leftWingModel[36] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box23
		leftWingModel[37] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box24
		leftWingModel[38] = new ModelRendererTurbo(this, 200, 1030, textureX, textureY); // Import Box25

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		leftWingModel[0].setRotationPoint(20F, -41F, -30F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 11, 5, 9, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F); // Import Box95
		leftWingModel[1].setRotationPoint(18F, -41F, -30F);

		leftWingModel[2].addBox(0F, 0F, 0F, 10, 5, 9, 0F); // Import Box96
		leftWingModel[2].setRotationPoint(20F, -41F, -21F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box97
		leftWingModel[3].setRotationPoint(18F, -41F, -21F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 53, 5, 54, 0F, -52F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -52F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		leftWingModel[4].setRotationPoint(29F, -41F, -84F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 54, 5, 54, 0F, -52F, -3F, 0F, 0F, -2F, 0F, -52F, 0F, 0F, 0F, -2F, 0F, -52F, -1F, 0F, 0F, 0F, 0F, -52F, 0F, 0F, 0F, -2F, 0F); // Import Box99
		leftWingModel[5].setRotationPoint(27F, -41F, -84F);

		leftWingModel[6].addBox(0F, 0F, 0F, 60, 5, 21, 0F); // Import Box100
		leftWingModel[6].setRotationPoint(30F, -41F, -30F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 27, 3, 13, 0F, -12.5F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		leftWingModel[7].setRotationPoint(81F, -39F, -97F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, -12.5F, -1F, 0F, 12.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -12.5F, -0.75F, 0F, 12.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box102
		leftWingModel[8].setRotationPoint(79F, -39F, -97F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 26, 3, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 1.18F, 0F, 0F, 1.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		leftWingModel[9].setRotationPoint(82F, -39F, -84F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Import Box104
		leftWingModel[10].setRotationPoint(111F, -39F, -97F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 5, 3, 32, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, 10F, 1.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F); // Import Box105
		leftWingModel[11].setRotationPoint(108F, -39F, -84F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F, 0F, 1.18F, 0F, 0F, 1.18F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		leftWingModel[12].setRotationPoint(82F, -39F, -52F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 45, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Import Box0
		leftWingModel[13].setRotationPoint(40F, -36F, -41F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 25, 3, 2, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		leftWingModel[14].setRotationPoint(40F, -44F, -41F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 33, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Import Box2
		leftWingModel[15].setRotationPoint(62F, -36F, -64F);

		leftWingModel[16].addBox(0F, 0F, 0F, 75, 12, 12, 0F); // Import Box3
		leftWingModel[16].setRotationPoint(24F, -29F, -46F);

		leftWingModel[17].addTrapezoid(0F, 0F, 0F, 6, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box4
		leftWingModel[17].setRotationPoint(18F, -29F, -46F);

		leftWingModel[18].addTrapezoid(0F, 0F, 0F, 4, 10, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box5
		leftWingModel[18].setRotationPoint(14F, -28F, -45F);

		leftWingModel[19].addTrapezoid(0F, 0F, 0F, 2, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box6
		leftWingModel[19].setRotationPoint(12F, -27F, -44F);

		leftWingModel[20].addTrapezoid(0F, 0F, 0F, 2, 6, 6, 0F, -1.50F, ModelRendererTurbo.MR_RIGHT); // Import Box7
		leftWingModel[20].setRotationPoint(10F, -26F, -43F);

		leftWingModel[21].addTrapezoid(0F, 0F, 0F, 6, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Import Box8
		leftWingModel[21].setRotationPoint(99F, -29F, -46F);

		leftWingModel[22].addTrapezoid(0F, 0F, 0F, 4, 10, 10, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Import Box9
		leftWingModel[22].setRotationPoint(105F, -28F, -45F);

		leftWingModel[23].addTrapezoid(0F, 0F, 0F, 2, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Import Box10
		leftWingModel[23].setRotationPoint(109F, -27F, -44F);

		leftWingModel[24].addTrapezoid(0F, 0F, 0F, 2, 6, 6, 0F, -1.50F, ModelRendererTurbo.MR_LEFT); // Import Box11
		leftWingModel[24].setRotationPoint(111F, -26F, -43F);

		leftWingModel[25].addBox(0F, 0F, 0F, 58, 4, 4, 0F); // Import Box12
		leftWingModel[25].setRotationPoint(42F, -29F, -65F);

		leftWingModel[26].addTrapezoid(0F, 0F, 0F, 2, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box13
		leftWingModel[26].setRotationPoint(40F, -29F, -65F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 46, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box14
		leftWingModel[27].setRotationPoint(49F, -25F, -64F);

		leftWingModel[28].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box15
		leftWingModel[28].setRotationPoint(32F, -47F, -41.5F);

		leftWingModel[29].addTrapezoid(0F, 0F, 0F, 6, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box16
		leftWingModel[29].setRotationPoint(26F, -47F, -41.5F);

		leftWingModel[30].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box17
		leftWingModel[30].setRotationPoint(35F, -45.5F, -40F);
		leftWingModel[30].rotateAngleX = 0.78539816F;

		leftWingModel[31].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box18
		leftWingModel[31].setRotationPoint(35F, -45.5F, -40F);
		leftWingModel[31].rotateAngleX = 2.35619449F;

		leftWingModel[32].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box19
		leftWingModel[32].setRotationPoint(35F, -45.5F, -40F);
		leftWingModel[32].rotateAngleX = -2.35619449F;

		leftWingModel[33].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box20
		leftWingModel[33].setRotationPoint(35F, -45.5F, -40F);
		leftWingModel[33].rotateAngleX = -0.78539816F;

		leftWingModel[34].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box21
		leftWingModel[34].setRotationPoint(65.9F, -45.5F, -40F);
		leftWingModel[34].rotateAngleX = -0.78539816F;

		leftWingModel[35].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box22
		leftWingModel[35].setRotationPoint(65.9F, -45.5F, -40F);
		leftWingModel[35].rotateAngleX = 0.78539816F;

		leftWingModel[36].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box23
		leftWingModel[36].setRotationPoint(65.9F, -45.5F, -40F);
		leftWingModel[36].rotateAngleX = 2.35619449F;

		leftWingModel[37].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box24
		leftWingModel[37].setRotationPoint(65.9F, -45.5F, -40F);
		leftWingModel[37].rotateAngleX = -2.35619449F;

		leftWingModel[38].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Import Box25
		leftWingModel[38].setRotationPoint(77F, -46.5F, -41F);


		rightWingModel = new ModelRendererTurbo[39];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Import Box111
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Box112
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Box113
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box114
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Import Box115
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 770, textureX, textureY); // Import Box116
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Box117
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 535, textureX, textureY); // Import Box118
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Import Box119
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import Box120
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 630, textureX, textureY); // Import Box121
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 710, textureX, textureY); // Import Box122
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 730, textureX, textureY); // Import Box123
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 802, textureX, textureY); // Import Box26
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 825, textureX, textureY); // Import Box27
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 965, textureX, textureY); // Import Box28
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 975, textureX, textureY); // Import Box29
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 985, textureX, textureY); // Import Box30
		rightWingModel[18] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Import Box31
		rightWingModel[19] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import Box32
		rightWingModel[20] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Box33
		rightWingModel[21] = new ModelRendererTurbo(this, 200, 925, textureX, textureY); // Import Box34
		rightWingModel[22] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import Box35
		rightWingModel[23] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import Box36
		rightWingModel[24] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Box37
		rightWingModel[25] = new ModelRendererTurbo(this, 200, 925, textureX, textureY); // Import Box38
		rightWingModel[26] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import Box39
		rightWingModel[27] = new ModelRendererTurbo(this, 200, 815, textureX, textureY); // Import Box40
		rightWingModel[28] = new ModelRendererTurbo(this, 200, 990, textureX, textureY); // Import Box41
		rightWingModel[29] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box42
		rightWingModel[30] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box43
		rightWingModel[31] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box44
		rightWingModel[32] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box45
		rightWingModel[33] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box46
		rightWingModel[34] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box47
		rightWingModel[35] = new ModelRendererTurbo(this, 200, 1020, textureX, textureY); // Import Box48
		rightWingModel[36] = new ModelRendererTurbo(this, 200, 1030, textureX, textureY); // Import Box49
		rightWingModel[37] = new ModelRendererTurbo(this, 200, 1010, textureX, textureY); // Import Box50
		rightWingModel[38] = new ModelRendererTurbo(this, 200, 1000, textureX, textureY); // Import Box51

		rightWingModel[0].addBox(0F, 0F, 0F, 10, 5, 9, 0F); // Import Box111
		rightWingModel[0].setRotationPoint(20F, -41F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Import Box112
		rightWingModel[1].setRotationPoint(20F, -41F, 21F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 11, 5, 9, 0F, 0F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F); // Import Box113
		rightWingModel[2].setRotationPoint(18F, -41F, 21F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box114
		rightWingModel[3].setRotationPoint(18F, -41F, 12F);

		rightWingModel[4].addBox(0F, 0F, 0F, 60, 5, 21, 0F); // Import Box115
		rightWingModel[4].setRotationPoint(30F, -41F, 9F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.18F, 0F, 0F, 1.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		rightWingModel[5].setRotationPoint(82F, -39F, 30F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 53, 5, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -52F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -52F, 0F, 0F); // Import Box117
		rightWingModel[6].setRotationPoint(29F, -41F, 30F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 54, 5, 54, 0F, 0F, -2F, 0F, -52F, 0F, 0F, 0F, -2F, 0F, -52F, -3F, 0F, 0F, -2F, 0F, -52F, 0F, 0F, 0F, 0F, 0F, -52F, -1F, 0F); // Import Box118
		rightWingModel[7].setRotationPoint(27F, -41F, 30F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 26, 3, 32, 0F, 0F, 1.18F, 0F, -10F, 1.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		rightWingModel[8].setRotationPoint(82F, -39F, 52F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 12.5F, -0.5F, 0F, -12.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 12.5F, 0F, 0F, -12.5F, -0.75F, 0F); // Import Box120
		rightWingModel[9].setRotationPoint(79F, -39F, 84F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 27, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, -12.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -12.5F, 0F, 0F); // Import Box121
		rightWingModel[10].setRotationPoint(81F, -39F, 84F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F, 3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		rightWingModel[11].setRotationPoint(111F, -39F, 84F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 32, 0F, 10F, 1.18F, 0F, -10F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		rightWingModel[12].setRotationPoint(108F, -39F, 52F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 45, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Import Box26
		rightWingModel[13].setRotationPoint(40F, -36F, 39F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 33, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Import Box27
		rightWingModel[14].setRotationPoint(62F, -36F, 62F);

		rightWingModel[15].addBox(0F, 0F, 0F, 58, 4, 4, 0F); // Import Box28
		rightWingModel[15].setRotationPoint(42F, -29F, 61F);

		rightWingModel[16].addTrapezoid(0F, 0F, 0F, 2, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box29
		rightWingModel[16].setRotationPoint(40F, -29F, 61F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 46, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box30
		rightWingModel[17].setRotationPoint(49F, -25F, 62F);

		rightWingModel[18].addBox(0F, 0F, 0F, 75, 12, 12, 0F); // Import Box31
		rightWingModel[18].setRotationPoint(24F, -29F, 34F);

		rightWingModel[19].addTrapezoid(0F, 0F, 0F, 6, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box32
		rightWingModel[19].setRotationPoint(18F, -29F, 34F);

		rightWingModel[20].addTrapezoid(0F, 0F, 0F, 4, 10, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box33
		rightWingModel[20].setRotationPoint(14F, -28F, 35F);

		rightWingModel[21].addTrapezoid(0F, 0F, 0F, 2, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box34
		rightWingModel[21].setRotationPoint(12F, -27F, 36F);

		rightWingModel[22].addTrapezoid(0F, 0F, 0F, 2, 6, 6, 0F, -1.50F, ModelRendererTurbo.MR_RIGHT); // Import Box35
		rightWingModel[22].setRotationPoint(10F, -26F, 37F);

		rightWingModel[23].addTrapezoid(0F, 0F, 0F, 6, 12, 12, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Import Box36
		rightWingModel[23].setRotationPoint(99F, -29F, 34F);

		rightWingModel[24].addTrapezoid(0F, 0F, 0F, 4, 10, 10, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Import Box37
		rightWingModel[24].setRotationPoint(105F, -28F, 35F);

		rightWingModel[25].addTrapezoid(0F, 0F, 0F, 2, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Import Box38
		rightWingModel[25].setRotationPoint(109F, -27F, 36F);

		rightWingModel[26].addTrapezoid(0F, 0F, 0F, 2, 6, 6, 0F, -1.50F, ModelRendererTurbo.MR_LEFT); // Import Box39
		rightWingModel[26].setRotationPoint(111F, -26F, 37F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 25, 3, 2, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		rightWingModel[27].setRotationPoint(40F, -44F, 39F);

		rightWingModel[28].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box41
		rightWingModel[28].setRotationPoint(32F, -47F, 38.5F);

		rightWingModel[29].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box42
		rightWingModel[29].setRotationPoint(35F, -45.5F, 40F);
		rightWingModel[29].rotateAngleX = -0.78539816F;

		rightWingModel[30].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box43
		rightWingModel[30].setRotationPoint(35F, -45.5F, 40F);
		rightWingModel[30].rotateAngleX = -2.35619449F;

		rightWingModel[31].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box44
		rightWingModel[31].setRotationPoint(35F, -45.5F, 40F);
		rightWingModel[31].rotateAngleX = 2.35619449F;

		rightWingModel[32].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box45
		rightWingModel[32].setRotationPoint(65.9F, -45.5F, 40F);
		rightWingModel[32].rotateAngleX = -2.35619449F;

		rightWingModel[33].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box46
		rightWingModel[33].setRotationPoint(65.9F, -45.5F, 40F);
		rightWingModel[33].rotateAngleX = 2.35619449F;

		rightWingModel[34].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box47
		rightWingModel[34].setRotationPoint(65.9F, -45.5F, 40F);
		rightWingModel[34].rotateAngleX = -0.78539816F;

		rightWingModel[35].addShapeBox(0F, 1F, -0.5F, 10, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box48
		rightWingModel[35].setRotationPoint(65.9F, -45.5F, 40F);
		rightWingModel[35].rotateAngleX = 0.78539816F;

		rightWingModel[36].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Import Box49
		rightWingModel[36].setRotationPoint(77F, -46.5F, 39F);

		rightWingModel[37].addShapeBox(0F, 1F, -0.5F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -5.8F, 0F, -0.4F); // Import Box50
		rightWingModel[37].setRotationPoint(35F, -45.5F, 40F);
		rightWingModel[37].rotateAngleX = 0.78539816F;

		rightWingModel[38].addTrapezoid(0F, 0F, 0F, 6, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Import Box51
		rightWingModel[38].setRotationPoint(26F, -47F, 38.5F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 200, 1275, textureX, textureY); // Import Box107
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 200, 1335, textureX, textureY); // Import Box108
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 200, 1250, textureX, textureY); // Import Box109
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this, 200, 1305, textureX, textureY); // Import Box110

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F, 0F, 1.18F, 0F, 0F, 1.18F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		pitchFlapLeftWingModel[0].setRotationPoint(90F, -39F, -52F);

		pitchFlapLeftWingModel[1].addShapeBox(8F, 0F, 0F, 5, 3, 22, 0F, 0F, 1.18F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		pitchFlapLeftWingModel[1].setRotationPoint(90F, -39F, -52F);

		pitchFlapLeftWingModel[2].addBox(0F, -2F, 0F, 8, 5, 18, 0F); // Import Box109
		pitchFlapLeftWingModel[2].setRotationPoint(90F, -39F, -30F);

		pitchFlapLeftWingModel[3].addShapeBox(8F, -2F, 0F, 5, 5, 18, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		pitchFlapLeftWingModel[3].setRotationPoint(90F, -39F, -30F);


		pitchFlapRightWingModel = new ModelRendererTurbo[4];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 200, 1275, textureX, textureY); // Import Box124
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 200, 1250, textureX, textureY); // Import Box125
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 200, 1305, textureX, textureY); // Import Box126
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this, 200, 1335, textureX, textureY); // Import Box127

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.18F, 0F, 0F, 1.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		pitchFlapRightWingModel[0].setRotationPoint(90F, -39F, 30F);

		pitchFlapRightWingModel[1].addBox(0F, -2F, 0F, 8, 5, 18, 0F); // Import Box125
		pitchFlapRightWingModel[1].setRotationPoint(90F, -39F, 12F);

		pitchFlapRightWingModel[2].addShapeBox(8F, -2F, 0F, 5, 5, 18, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		pitchFlapRightWingModel[2].setRotationPoint(90F, -39F, 12F);

		pitchFlapRightWingModel[3].addShapeBox(8F, 0F, 0F, 5, 3, 22, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box127
		pitchFlapRightWingModel[3].setRotationPoint(90F, -39F, 30F);


		bodyWheelModel = new ModelRendererTurbo[13];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 1040, textureX, textureY); // Import Box52
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 1050, textureX, textureY); // Import Box53
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 1064, textureX, textureY); // Import Box54
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 1086, textureX, textureY); // Import Box55
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 1097, textureX, textureY); // Import Box56
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 1115, textureX, textureY); // Import Box57
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 1130, textureX, textureY); // Import Box58
		bodyWheelModel[7] = new ModelRendererTurbo(this, 200, 1142, textureX, textureY); // Import Box59
		bodyWheelModel[8] = new ModelRendererTurbo(this, 200, 1150, textureX, textureY); // Import Box60
		bodyWheelModel[9] = new ModelRendererTurbo(this, 200, 1142, textureX, textureY); // Import Box61
		bodyWheelModel[10] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box62
		bodyWheelModel[11] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box63
		bodyWheelModel[12] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box64

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Box52
		bodyWheelModel[0].setRotationPoint(-55F, -16F, -2F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyWheelModel[1].setRotationPoint(-55F, -14F, -5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box54
		bodyWheelModel[2].setRotationPoint(-55F, -12F, -5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box55
		bodyWheelModel[3].setRotationPoint(-51F, -16F, -2F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 3, 12, 3, 0F); // Import Box56
		bodyWheelModel[4].setRotationPoint(-49F, -12F, -1.5F);

		bodyWheelModel[5].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Import Box57
		bodyWheelModel[5].setRotationPoint(-45F, -12F, -0.5F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Import Box58
		bodyWheelModel[6].setRotationPoint(-49F, 0F, -2.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box59
		bodyWheelModel[7].setRotationPoint(-48F, 0F, -2.5F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box60
		bodyWheelModel[8].setRotationPoint(-46F, -2F, -0.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyWheelModel[9].setRotationPoint(-48F, 0F, 1.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyWheelModel[10].setRotationPoint(-47F, 1F, -1.5F);

		bodyWheelModel[11].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Import Box63
		bodyWheelModel[11].setRotationPoint(-47F, 4F, -1.5F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box64
		bodyWheelModel[12].setRotationPoint(-47F, 7F, -1.5F);


		leftWingWheelModel = new ModelRendererTurbo[11];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1185, textureX, textureY); // Import Box65
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Import Box66
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1206, textureX, textureY); // Import Box67
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1230, textureX, textureY); // Import Box68
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1240, textureX, textureY); // Import Box69
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box70
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box71
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box72
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box73
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box74
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box75

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 20, 7, 2, 0F); // Import Box65
		leftWingWheelModel[0].setRotationPoint(69F, -18F, -15F);
		leftWingWheelModel[0].rotateAngleX = -0.52359878F;

		leftWingWheelModel[1].addShapeBox(0F, 7F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box66
		leftWingWheelModel[1].setRotationPoint(69F, -18F, -15F);
		leftWingWheelModel[1].rotateAngleX = -0.52359878F;

		leftWingWheelModel[2].addBox(0F, -2F, 3F, 4, 17, 4, 0F); // Import Box67
		leftWingWheelModel[2].setRotationPoint(72F, -18F, -15F);
		leftWingWheelModel[2].rotateAngleX = -0.52359878F;

		leftWingWheelModel[3].addBox(1F, 15F, 4F, 2, 3, 2, 0F); // Import Box68
		leftWingWheelModel[3].setRotationPoint(72F, -18F, -15F);
		leftWingWheelModel[3].rotateAngleX = -0.52359878F;

		leftWingWheelModel[4].addBox(1F, 15F, 4F, 2, 6, 2, 0F); // Import Box69
		leftWingWheelModel[4].setRotationPoint(72F, -15.5F, -24.5F);

		leftWingWheelModel[5].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box70
		leftWingWheelModel[5].setRotationPoint(68.5F, -8F, -23.5F);

		leftWingWheelModel[6].addBox(1F, 15F, 0F, 9, 3, 3, 0F); // Import Box71
		leftWingWheelModel[6].setRotationPoint(68.5F, -11F, -23.5F);

		leftWingWheelModel[7].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		leftWingWheelModel[7].setRotationPoint(68.5F, -14F, -23.5F);

		leftWingWheelModel[8].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		leftWingWheelModel[8].setRotationPoint(68.5F, -14F, -18.5F);

		leftWingWheelModel[9].addBox(1F, 15F, 0F, 9, 3, 3, 0F); // Import Box74
		leftWingWheelModel[9].setRotationPoint(68.5F, -11F, -18.5F);

		leftWingWheelModel[10].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box75
		leftWingWheelModel[10].setRotationPoint(68.5F, -8F, -18.5F);


		rightWingWheelModel = new ModelRendererTurbo[11];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1185, textureX, textureY); // Import Box76
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Import Box77
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1206, textureX, textureY); // Import Box78
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1230, textureX, textureY); // Import Box79
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1240, textureX, textureY); // Import Box80
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box81
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box82
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box83
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 200, 1175, textureX, textureY); // Import Box84
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Import Box85
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 200, 1155, textureX, textureY); // Import Box86

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 20, 7, 2, 0F); // Import Box76
		rightWingWheelModel[0].setRotationPoint(69F, -18F, 13F);
		rightWingWheelModel[0].rotateAngleX = 0.52359878F;

		rightWingWheelModel[1].addShapeBox(0F, 7F, 0F, 20, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box77
		rightWingWheelModel[1].setRotationPoint(69F, -18F, 13F);
		rightWingWheelModel[1].rotateAngleX = 0.52359878F;

		rightWingWheelModel[2].addBox(0F, 0F, -4F, 4, 17, 4, 0F); // Import Box78
		rightWingWheelModel[2].setRotationPoint(72F, -18F, 12F);
		rightWingWheelModel[2].rotateAngleX = 0.52359878F;

		rightWingWheelModel[3].addBox(1F, 16F, -4F, 2, 3, 2, 0F); // Import Box79
		rightWingWheelModel[3].setRotationPoint(72F, -18F, 13F);
		rightWingWheelModel[3].rotateAngleX = 0.52359878F;

		rightWingWheelModel[4].addBox(1F, 15F, 0F, 2, 6, 2, 0F); // Import Box80
		rightWingWheelModel[4].setRotationPoint(72F, -15.5F, 18.5F);

		rightWingWheelModel[5].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightWingWheelModel[5].setRotationPoint(68.5F, -14F, 20.5F);

		rightWingWheelModel[6].addBox(1F, 15F, 0F, 9, 3, 3, 0F); // Import Box82
		rightWingWheelModel[6].setRotationPoint(68.5F, -11F, 20.5F);

		rightWingWheelModel[7].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box83
		rightWingWheelModel[7].setRotationPoint(68.5F, -8F, 20.5F);

		rightWingWheelModel[8].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box84
		rightWingWheelModel[8].setRotationPoint(68.5F, -8F, 15.5F);

		rightWingWheelModel[9].addBox(1F, 15F, 0F, 9, 3, 3, 0F); // Import Box85
		rightWingWheelModel[9].setRotationPoint(68.5F, -11F, 15.5F);

		rightWingWheelModel[10].addShapeBox(1F, 15F, 0F, 9, 3, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		rightWingWheelModel[10].setRotationPoint(68.5F, -14F, 15.5F);
		
		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 1

		hudModel[0].addShapeBox(0F, -3F, -3F, 0, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -54F, 0F, 0F, -54F, 0F, 0F, -54F, -54F, 0F, -54F, -54F); // Box 1
		hudModel[0].setRotationPoint(-37.1F, -41F, 0F);



		// Passenger Gun 1
		ModelRendererTurbo[][] gun_0_Model = new ModelRendererTurbo[3][];

		gun_0_Model[0] = new ModelRendererTurbo[0];

		gun_0_Model[1] = new ModelRendererTurbo[0];

		gun_0_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Gun0", gun_0_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
