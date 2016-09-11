//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelDaring extends ModelVehicle
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelDaring()
	{
		bodyModel = new ModelRendererTurbo[84];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Body 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Body 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Body 7
		bodyModel[5] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Body8
		bodyModel[6] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Body10
		bodyModel[7] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Body 11
		bodyModel[8] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Body 12
		bodyModel[9] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Body 13
		bodyModel[10] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Body 14
		bodyModel[11] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Body 15
		bodyModel[12] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Body 16
		bodyModel[13] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Body 18
		bodyModel[14] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Body 19
		bodyModel[15] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Body 20
		bodyModel[16] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Body 21
		bodyModel[17] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Body 22
		bodyModel[18] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 0, 1020, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1450, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1870, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 6, 1900, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1980, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 58
		bodyModel[49] = new ModelRendererTurbo(this, 400, 104, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 450, 200, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 450, 300, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 455, 270, textureX, textureY); // Box 62
		bodyModel[53] = new ModelRendererTurbo(this, 450, 400, textureX, textureY); // Box 63
		bodyModel[54] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 64
		bodyModel[55] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 65
		bodyModel[56] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 66
		bodyModel[57] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 68
		bodyModel[59] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 70
		bodyModel[61] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 71
		bodyModel[62] = new ModelRendererTurbo(this, 450, 360, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 77
		bodyModel[68] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 78
		bodyModel[69] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 80
		bodyModel[71] = new ModelRendererTurbo(this, 470, 400, textureX, textureY); // Box 81
		bodyModel[72] = new ModelRendererTurbo(this, 450, 700, textureX, textureY); // Box 82
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		bodyModel[74] = new ModelRendererTurbo(this, 450, 810, textureX, textureY); // Box 84
		bodyModel[75] = new ModelRendererTurbo(this, 500, 900, textureX, textureY); // Box 85
		bodyModel[76] = new ModelRendererTurbo(this, 450, 1050, textureX, textureY); // Box 86
		bodyModel[77] = new ModelRendererTurbo(this, 450, 1100, textureX, textureY); // Box 87
		bodyModel[78] = new ModelRendererTurbo(this, 450, 1200, textureX, textureY); // Box 88
		bodyModel[79] = new ModelRendererTurbo(this, 450, 1400, textureX, textureY); // Box 89
		bodyModel[80] = new ModelRendererTurbo(this, 450, 1400, textureX, textureY); // Box 90
		bodyModel[81] = new ModelRendererTurbo(this, 450, 1450, textureX, textureY); // Box 91
		bodyModel[82] = new ModelRendererTurbo(this, 450, 1550, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 450, 1600, textureX, textureY); // Box 93

		bodyModel[0].addShapeBox(0F, 0F, 0F, 189, 55, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-65F, 0F, 0F,-65F, 0F, 0F,0F, 0F, 0F); // Body1
		bodyModel[0].setRotationPoint(180F, -39F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 189, 55, 36, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -35F,0F, 0F, 0F,0F, 0F, 0F,-65F, 0F, 0F,-65F, 0F, -35F,0F, 0F, -6F); // Body2
		bodyModel[1].setRotationPoint(180F, -39F, 4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 189, 55, 36, 0F,0F, 0F, 0F,0F, 0F, -35F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,-65F, 0F, -35F,-65F, 0F, 0F,0F, 0F, 0F); // Body 3
		bodyModel[2].setRotationPoint(180F, -39F, -40F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F,-6F, 0F, 0F,6F, 0F, 0F,6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Body 4
		bodyModel[3].setRotationPoint(365.1F, -44.9F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 189, 6, 36, 0F,0F, -5F, -35F,6F, 0F, 0F,6F, 0F, -35F,0F, -5F, 0F,0F, 0F, -35F,0F, 0F, 0F,0F, 0F, -35F,0F, 0F, 0F); // Body 7
		bodyModel[4].setRotationPoint(180F, -45F, 4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 189, 6, 36, 0F,0F, -5F, 0F,6F, 0F, -35F,6F, 0F, 0F,0F, -5F, -35F,0F, 0F, 0F,0F, 0F, -35F,0F, 0F, 0F,0F, 0F, -35F); // Body8
		bodyModel[5].setRotationPoint(180F, -45F, -40F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 16, 50, 0F,-6F, 0F, -6F,0F, 0F, -6F,0F, 0F, -6F,-6F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Body10
		bodyModel[6].setRotationPoint(180F, -55F, -25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 16, 10, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Body 11
		bodyModel[7].setRotationPoint(190F, -55F, -25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 25, 16, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Body 12
		bodyModel[8].setRotationPoint(190F, -55F, 15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 16, 50, 0F,0F, 0F, -6F,-6F, 0F, -6F,-6F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Body 13
		bodyModel[9].setRotationPoint(215F, -55F, -25F);

		bodyModel[10].addBox(0F, 0F, 0F, 25, 10, 30, 0F); // Body 14
		bodyModel[10].setRotationPoint(191F, -50F, -15F);

		bodyModel[11].addBox(0F, 0F, 0F, 25, 2, 3, 0F); // Body 15
		bodyModel[11].setRotationPoint(191F, -52F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 25, 2, 3, 0F); // Body 16
		bodyModel[12].setRotationPoint(191F, -52F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Body 18
		bodyModel[13].setRotationPoint(191F, -51F, -12F);

		bodyModel[14].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Body 19
		bodyModel[14].setRotationPoint(191F, -51F, -5F);

		bodyModel[15].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Body 20
		bodyModel[15].setRotationPoint(191F, -51F, 1F);

		bodyModel[16].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Body 21
		bodyModel[16].setRotationPoint(191F, -51F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 336, 55, 80, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, -6F); // Body 22
		bodyModel[17].setRotationPoint(-156F, -39F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 24, 30, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(158F, -63F, -15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 24, 25, 0F,0F, 0F, -8F,-5F, 0F, -24F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(158F, -63F, -40F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 24, 25, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, -24F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(158F, -63F, 15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 24, 80, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(148F, -63F, -40F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 200, 18, 80, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 30
		bodyModel[22].setRotationPoint(-52F, -57F, -40F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 6, 68, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		bodyModel[23].setRotationPoint(146F, -69F, -34F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 6, 68, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F); // Box 32
		bodyModel[24].setRotationPoint(158F, -69F, -34F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 3, 62, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 33
		bodyModel[25].setRotationPoint(146F, -77F, -31F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 62, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(156F, -77F, -31F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 1, 45, 0F,0F, 0F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -15F,0F, 0F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -15F); // Box 35
		bodyModel[27].setRotationPoint(231F, -40F, -22.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 15, 1, 45, 0F); // Box 36
		bodyModel[28].setRotationPoint(246F, -40F, -22.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 1, 45, 0F,0F, 0F, 0F,0F, 0F, -15F,0F, 0F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -15F,0F, 0F, -15F,0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(261F, -40F, -22.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,-2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(274F, -45F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,-2F, 0F, 0F,2F, 0F, 0F,-15F, -4F, 0F,15F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-15F, 0F, 0F,15F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(274F, -45F, 7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,15F, -4F, 0F,-15F, -4F, 0F,2F, 0F, 0F,-2F, 0F, 0F,15F, 0F, 0F,-15F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(274F, -45F, -22.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 42
		bodyModel[33].setRotationPoint(146F, -74F, -31F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 43
		bodyModel[34].setRotationPoint(146F, -74F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 44
		bodyModel[35].setRotationPoint(158F, -74F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 45
		bodyModel[36].setRotationPoint(158F, -74F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 6, 68, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F); // Box 46
		bodyModel[37].setRotationPoint(141F, -69F, -34F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 6, 56, 0F,0F, 0F, -9F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -9F,0F, 0F, -9F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -9F); // Box 47
		bodyModel[38].setRotationPoint(130F, -69F, -28F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 42, 88, 30, 0F,-8F, 0F, -8F,-8F, 0F, -8F,-8F, 0F, -8F,-8F, 0F, -8F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F,0F, 0F, 5F); // Box 48
		bodyModel[39].setRotationPoint(98F, -151F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 126, 6, 56, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(22F, -63F, -28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 42, 88, 5, 0F,-13F, 0F, -8F,-13F, 0F, -8F,-8F, 0F, 8F,-8F, 0F, 8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F); // Box 50
		bodyModel[41].setRotationPoint(98F, -151F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 42, 88, 5, 0F,-8F, 0F, 8F,-8F, 0F, 8F,-13F, 0F, -8F,-13F, 0F, -8F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(98F, -151F, 15F);

		bodyModel[43].addBox(0F, 0F, 0F, 26, 9, 14, 0F); // Box 52
		bodyModel[43].setRotationPoint(106F, -160F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 26, 9, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Box 53
		bodyModel[44].setRotationPoint(106F, -160F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 26, 9, 5, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 54
		bodyModel[45].setRotationPoint(106F, -160F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 8, 62, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F); // Box 55
		bodyModel[46].setRotationPoint(141F, -77F, -31F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 30, 15, 30, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F); // Box 57
		bodyModel[47].setRotationPoint(70F, -78F, -15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 40, 28, 32, 0F,-4F, 0F, -4F,-4F, 0F, -8F,-4F, 0F, -8F,-4F, 0F, -4F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Box 58
		bodyModel[48].setRotationPoint(22F, -91F, -16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 39, 16, 38, 0F,0F, 0F, -2F,-4F, 0F, -2F,-4F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 59
		bodyModel[49].setRotationPoint(-49F, -73F, -19F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 20, 3, 34, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 60
		bodyModel[50].setRotationPoint(-34F, -76F, -17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 33, 15, 0F,-3F, 0F, -3F,-3F, 0F, -3F,-3F, 0F, -3F,-3F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 61
		bodyModel[51].setRotationPoint(-30F, -109F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -1F,0F, -2F, -1F,0F, 0F, 0F); // Box 62
		bodyModel[52].setRotationPoint(-18F, -105F, -2F);

		bodyModel[53].addShapeBox(-1F, 0F, 0F, 3, 72, 3, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 63
		bodyModel[53].setRotationPoint(-23F, -181F, -1.5F);

		bodyModel[54].addBox(-1F, 0F, 0F, 12, 1, 4, 0F); // Box 64
		bodyModel[54].setRotationPoint(-27.5F, -123F, -2F);

		bodyModel[55].addShapeBox(-1F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 65
		bodyModel[55].setRotationPoint(-27.5F, -123F, 2F);

		bodyModel[56].addShapeBox(-1F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 66
		bodyModel[56].setRotationPoint(-27.5F, -123F, -6F);

		bodyModel[57].addShapeBox(-1F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 67
		bodyModel[57].setRotationPoint(-27.5F, -135F, -6F);

		bodyModel[58].addBox(-1F, 0F, 0F, 12, 1, 4, 0F); // Box 68
		bodyModel[58].setRotationPoint(-27.5F, -135F, -2F);

		bodyModel[59].addShapeBox(-1F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 69
		bodyModel[59].setRotationPoint(-27.5F, -135F, 2F);

		bodyModel[60].addShapeBox(-1F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 70
		bodyModel[60].setRotationPoint(-27.5F, -140F, 2F);

		bodyModel[61].addBox(-1F, 0F, 0F, 12, 1, 4, 0F); // Box 71
		bodyModel[61].setRotationPoint(-27.5F, -140F, -2F);

		bodyModel[62].addShapeBox(-1F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 72
		bodyModel[62].setRotationPoint(-27.5F, -140F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 73
		bodyModel[63].setRotationPoint(107F, -168F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, -8F,-8F, 0F, -8F); // Box 74
		bodyModel[64].setRotationPoint(107F, -168F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, -8F,-8F, 0F, -8F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 75
		bodyModel[65].setRotationPoint(107F, -168F, -12F);

		bodyModel[66].addBox(0F, 0F, 0F, 24, 8, 8, 0F); // Box 76
		bodyModel[66].setRotationPoint(107F, -176F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 77
		bodyModel[67].setRotationPoint(107F, -176F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 78
		bodyModel[68].setRotationPoint(107F, -176F, -12F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 79
		bodyModel[69].setRotationPoint(107F, -184F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, -8F,-8F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 80
		bodyModel[70].setRotationPoint(107F, -184F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, -8F,-8F, 0F, -8F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 81
		bodyModel[71].setRotationPoint(107F, -184F, -12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 104, 18, 80, 0F,-4F, 0F, -6F,0F, 0F, -6F,0F, 0F, -6F,-4F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 82
		bodyModel[72].setRotationPoint(-156F, -57F, -40F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 101, 18, 68, 0F,-5F, 0F, -6F,-6F, 0F, -6F,-6F, 0F, -6F,-5F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 83
		bodyModel[73].setRotationPoint(-152F, -75F, -34F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 28, 8, 56, 0F,0F, 0F, -3F,-3F, 0F, -3F,-3F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 84
		bodyModel[74].setRotationPoint(-85F, -83F, -28F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 25, 40, 40, 0F,-3.5F, 0F, -11F,-3.5F, 0F, -11F,-3.5F, 0F, -11F,-3.5F, 0F, -11F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 85
		bodyModel[75].setRotationPoint(-85F, -123F, -20F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 28, 18, 25, 0F,-4F, 0F, -8F,0F, 0F, -4F,0F, 0F, -4F,-4F, 0F, -8F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Box 86
		bodyModel[76].setRotationPoint(-111F, -93F, -12.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 11, 56, 0F,-3F, 0F, -4F,-1F, 0F, -4F,-1F, 0F, -4F,-3F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 87
		bodyModel[77].setRotationPoint(-147F, -86F, -28F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 126, 55, 80, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, -18F, -12F,0F, 0F, -6F,0F, 0F, -6F,0F, -18F, -12F); // Box 88
		bodyModel[78].setRotationPoint(-282F, -39F, -40F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 123, 2, 2, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 6F); // Box 89
		bodyModel[79].setRotationPoint(-278F, -41F, -38F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 123, 2, 2, 0F,0F, 0F, 6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, 6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F); // Box 90
		bodyModel[80].setRotationPoint(-278F, -41F, 36F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 2, 64, 0F); // Box 91
		bodyModel[81].setRotationPoint(-280F, -41F, -32F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 14, 20, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-272F, -1F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 50, 55, 40, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F); // Box 93
		bodyModel[83].setRotationPoint(-207F, -39F, -20F);

		
		//Copy This part into your model
		
		ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[3][];

		noseGunModel[0] = new ModelRendererTurbo[28];
		noseGunModel[0][0] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 0
		noseGunModel[0][1] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 1
		noseGunModel[0][2] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 2
		noseGunModel[0][3] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 3
		noseGunModel[0][4] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 4
		noseGunModel[0][5] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Box 5
		noseGunModel[0][6] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Box 6
		noseGunModel[0][7] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 7
		noseGunModel[0][8] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 8
		noseGunModel[0][9] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 9
		noseGunModel[0][10] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 10
		noseGunModel[0][11] = new ModelRendererTurbo(this, 600, 240, textureX, textureY); // Box 11
		noseGunModel[0][12] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 12
		noseGunModel[0][13] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Box 13
		noseGunModel[0][14] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 113
		noseGunModel[0][15] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 114
		noseGunModel[0][16] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Box 115
		noseGunModel[0][17] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 116
		noseGunModel[0][18] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Box 117
		noseGunModel[0][19] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Box 118
		noseGunModel[0][20] = new ModelRendererTurbo(this, 600, 320, textureX, textureY); // Box 119
		noseGunModel[0][21] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Box 120
		noseGunModel[0][22] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 121
		noseGunModel[0][23] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Box 122
		noseGunModel[0][24] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Box 123
		noseGunModel[0][25] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Box 124
		noseGunModel[0][26] = new ModelRendererTurbo(this, 600, 240, textureX, textureY); // Box 125
		noseGunModel[0][27] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Box 126

		noseGunModel[0][0].addBox(-4F, 0F, -12F, 8, 3, 24, 0F); // Box 0
		noseGunModel[0][0].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][1].addShapeBox(4F, 0F, -12F, 8, 3, 24, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 1
		noseGunModel[0][1].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][2].addShapeBox(-12F, -3F, -12F, 8, 3, 24, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 2
		noseGunModel[0][2].setRotationPoint(253.5F, -40F, 0F);

		noseGunModel[0][3].addBox(-9F, -10F, -12F, 13, 10, 24, 0F); // Box 3
		noseGunModel[0][3].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][4].addShapeBox(-15F, -10F, -12F, 6, 10, 24, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 4
		noseGunModel[0][4].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][5].addShapeBox(-9F, -16F, -12F, 13, 6, 9, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		noseGunModel[0][5].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][6].addShapeBox(-9F, -16F, 3F, 13, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		noseGunModel[0][6].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][7].addShapeBox(4F, -10F, -12F, 10, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		noseGunModel[0][7].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][8].addShapeBox(4F, -10F, 3F, 10, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 8
		noseGunModel[0][8].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][9].addShapeBox(4F, -16F, 3F, 10, 6, 9, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 9
		noseGunModel[0][9].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][10].addShapeBox(4F, -16F, -12F, 10, 6, 9, 0F, 0F, 0F, -6F, -10F, 0F, -6F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		noseGunModel[0][10].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][11].addBox(-9F, -14F, -3F, 13, 4, 6, 0F); // Box 11
		noseGunModel[0][11].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][12].addShapeBox(4F, -14F, -3F, 5, 13, 6, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		noseGunModel[0][12].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][13].addShapeBox(-15F, -16F, -12F, 6, 6, 24, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 13
		noseGunModel[0][13].setRotationPoint(253.5F, -43F, 0F);

		noseGunModel[0][14].addBox(-4F, 0F, -12F, 8, 3, 24, 0F); // Box 113
		noseGunModel[0][14].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][15].addShapeBox(-12F, -3F, -12F, 8, 3, 24, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 114
		noseGunModel[0][15].setRotationPoint(-253.5F, -39F, 0F);

		noseGunModel[0][16].addShapeBox(4F, 0F, -12F, 8, 3, 24, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 115
		noseGunModel[0][16].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][17].addShapeBox(4F, -10F, -12F, 10, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		noseGunModel[0][17].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][18].addBox(-9F, -10F, -12F, 13, 10, 24, 0F); // Box 117
		noseGunModel[0][18].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][19].addShapeBox(-15F, -10F, -12F, 6, 10, 24, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 118
		noseGunModel[0][19].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][20].addShapeBox(-15F, -16F, -12F, 6, 6, 24, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 119
		noseGunModel[0][20].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][21].addShapeBox(-9F, -16F, -12F, 13, 6, 9, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		noseGunModel[0][21].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][22].addShapeBox(4F, -16F, -12F, 10, 6, 9, 0F, 0F, 0F, -6F, -10F, 0F, -6F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		noseGunModel[0][22].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][23].addShapeBox(-9F, -16F, 3F, 13, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		noseGunModel[0][23].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][24].addShapeBox(4F, -16F, 3F, 10, 6, 9, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 123
		noseGunModel[0][24].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][25].addShapeBox(4F, -10F, 3F, 10, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 124
		noseGunModel[0][25].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][26].addBox(-9F, -14F, -3F, 13, 4, 6, 0F); // Box 125
		noseGunModel[0][26].setRotationPoint(-253.5F, -42F, 0F);

		noseGunModel[0][27].addShapeBox(4F, -14F, -3F, 5, 13, 6, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		noseGunModel[0][27].setRotationPoint(-253.5F, -42F, 0F);
		
		noseGunModel[1] = new ModelRendererTurbo[0];


		noseGunModel[2] = new ModelRendererTurbo[4];
		noseGunModel[2][0] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Box 14
		noseGunModel[2][1] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Box 15
		noseGunModel[2][2] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Box 127
		noseGunModel[2][3] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Box 128

		noseGunModel[2][0].addBox(5F, -1F, -1F, 30, 2, 2, 0F); // Box 14
		noseGunModel[2][0].setRotationPoint(253.5F, -51F, 0F);

		noseGunModel[2][1].addBox(23F, -1.5F, -1.5F, 6, 3, 3, 0F); // Box 15
		noseGunModel[2][1].setRotationPoint(253.5F, -51F, 0F);

		noseGunModel[2][2].addBox(5F, -1F, -1F, 30, 2, 2, 0F); // Box 127
		noseGunModel[2][2].setRotationPoint(-253.5F, -50F, 0F);

		noseGunModel[2][3].addBox(23F, -1.5F, -1.5F, 6, 3, 3, 0F); // Box 128
		noseGunModel[2][3].setRotationPoint(-253.5F, -50F, 0F);
		
		registerGunModel("Main", noseGunModel);


		
		
		//Copy This part into your model
		
		ModelRendererTurbo[][] p1GunModel = new ModelRendererTurbo[3][];

		p1GunModel[0] = new ModelRendererTurbo[3];
		p1GunModel[0][0] = new ModelRendererTurbo(this, 800, 0, textureX, textureY); // Box 16
		p1GunModel[0][1] = new ModelRendererTurbo(this, 800, 20, textureX, textureY); // Box 17
		p1GunModel[0][2] = new ModelRendererTurbo(this, 800, 20, textureX, textureY); // Box 18


		p1GunModel[0][0].addBox(-4F, 5F, -4F, 8, 2, 8, 0F); // Box 16

		p1GunModel[0][1].addShapeBox(-4F, 0F, -4F, 8, 5, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17

		p1GunModel[0][2].addShapeBox(-4F, 0F, 2F, 8, 5, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18



		for(ModelRendererTurbo noseGunPart : p1GunModel[0])
			noseGunPart.setRotationPoint(-3F, -64F, -28F);
		
		p1GunModel[1] = new ModelRendererTurbo[0];


		p1GunModel[2] = new ModelRendererTurbo[9];
		p1GunModel[2][0] = new ModelRendererTurbo(this, 800, 40, textureX, textureY); // Box 19
		p1GunModel[2][1] = new ModelRendererTurbo(this, 800, 80, textureX, textureY); // Box 21
		p1GunModel[2][2] = new ModelRendererTurbo(this, 800, 100, textureX, textureY); // Box 22
		p1GunModel[2][3] = new ModelRendererTurbo(this, 800, 120, textureX, textureY); // Box 23
		p1GunModel[2][4] = new ModelRendererTurbo(this, 800, 120, textureX, textureY); // Box 24
		p1GunModel[2][5] = new ModelRendererTurbo(this, 800, 140, textureX, textureY); // Box 25
		p1GunModel[2][6] = new ModelRendererTurbo(this, 800, 160, textureX, textureY); // Box 26
		p1GunModel[2][7] = new ModelRendererTurbo(this, 800, 160, textureX, textureY); // Box 27
		p1GunModel[2][8] = new ModelRendererTurbo(this, 800, 60, textureX, textureY); // Box 20

		p1GunModel[2][0].addBox(-3F, 0F, -2F, 6, 4, 4, 0F); // Box 19

		p1GunModel[2][1].addBox(3F, 1F, -0.5F, 6, 1, 1, 0F); // Box 21

		p1GunModel[2][2].addBox(-1F, -6F, -2F, 2, 6, 4, 0F); // Box 22

		p1GunModel[2][3].addShapeBox(1F, -6F, -2F, 1, 6, 4, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Box 23

		p1GunModel[2][4].addShapeBox(-2F, -6F, -2F, 1, 6, 4, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 24

		p1GunModel[2][5].addShapeBox(-1F, -7F, -2F, 2, 1, 4, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 25

		p1GunModel[2][6].addShapeBox(1F, -7F, -2F, 1, 1, 4, 0F,0F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Box 26

		p1GunModel[2][7].addShapeBox(-2F, -7F, -2F, 1, 1, 4, 0F,-1F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,-1F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 27

		p1GunModel[2][8].addShapeBox(-3F, 4F, -2F, 6, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 20
		
		for(ModelRendererTurbo p1GunPart : p1GunModel[2])
			p1GunPart.setRotationPoint(-3F, -64F, -28F);
		
		registerGunModel("PhalanxRight", p1GunModel);

		
		
		//Copy This part into your model
		
		ModelRendererTurbo[][] p2GunModel = new ModelRendererTurbo[3][];

		p2GunModel[0] = new ModelRendererTurbo[3];
		p2GunModel[0][0] = new ModelRendererTurbo(this, 800, 0, textureX, textureY); // Box 16
		p2GunModel[0][1] = new ModelRendererTurbo(this, 800, 20, textureX, textureY); // Box 17
		p2GunModel[0][2] = new ModelRendererTurbo(this, 800, 20, textureX, textureY); // Box 18


		p2GunModel[0][0].addBox(-4F, 5F, -4F, 8, 2, 8, 0F); // Box 16

		p2GunModel[0][1].addShapeBox(-4F, 0F, -4F, 8, 5, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17

		p2GunModel[0][2].addShapeBox(-4F, 0F, 2F, 8, 5, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18



		for(ModelRendererTurbo noseGunPart : p2GunModel[0])
			noseGunPart.setRotationPoint(-3F, -64F, 28F);
		
		p2GunModel[1] = new ModelRendererTurbo[0];


		p2GunModel[2] = new ModelRendererTurbo[9];
		p2GunModel[2][0] = new ModelRendererTurbo(this, 800, 40, textureX, textureY); // Box 19
		p2GunModel[2][1] = new ModelRendererTurbo(this, 800, 80, textureX, textureY); // Box 21
		p2GunModel[2][2] = new ModelRendererTurbo(this, 800, 100, textureX, textureY); // Box 22
		p2GunModel[2][3] = new ModelRendererTurbo(this, 800, 120, textureX, textureY); // Box 23
		p2GunModel[2][4] = new ModelRendererTurbo(this, 800, 120, textureX, textureY); // Box 24
		p2GunModel[2][5] = new ModelRendererTurbo(this, 800, 140, textureX, textureY); // Box 25
		p2GunModel[2][6] = new ModelRendererTurbo(this, 800, 160, textureX, textureY); // Box 26
		p2GunModel[2][7] = new ModelRendererTurbo(this, 800, 160, textureX, textureY); // Box 27
		p2GunModel[2][8] = new ModelRendererTurbo(this, 800, 60, textureX, textureY); // Box 20

		p2GunModel[2][0].addBox(-3F, 0F, -2F, 6, 4, 4, 0F); // Box 19

		p2GunModel[2][1].addBox(3F, 1F, -0.5F, 6, 1, 1, 0F); // Box 21

		p2GunModel[2][2].addBox(-1F, -6F, -2F, 2, 6, 4, 0F); // Box 22

		p2GunModel[2][3].addShapeBox(1F, -6F, -2F, 1, 6, 4, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Box 23

		p2GunModel[2][4].addShapeBox(-2F, -6F, -2F, 1, 6, 4, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 24

		p2GunModel[2][5].addShapeBox(-1F, -7F, -2F, 2, 1, 4, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 25

		p2GunModel[2][6].addShapeBox(1F, -7F, -2F, 1, 1, 4, 0F,0F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Box 26

		p2GunModel[2][7].addShapeBox(-2F, -7F, -2F, 1, 1, 4, 0F,-1F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,-1F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 27

		p2GunModel[2][8].addShapeBox(-3F, 4F, -2F, 6, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 20
		
		for(ModelRendererTurbo p2GunPart : p2GunModel[2])
			p2GunPart.setRotationPoint(-3F, -64F, 28F);
		
		registerGunModel("PhalanxLeft", p2GunModel);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
