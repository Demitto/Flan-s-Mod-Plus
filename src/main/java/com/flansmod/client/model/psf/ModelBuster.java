//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBuster extends ModelGun
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelBuster()
	{
		gunModel = new ModelRendererTurbo[76];
		gunModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Box 41
		gunModel[1] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 42
		gunModel[2] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 43
		gunModel[3] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Box 44
		gunModel[4] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 45
		gunModel[5] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 46
		gunModel[6] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 47
		gunModel[7] = new ModelRendererTurbo(this, 0, 210, textureX, textureY); // Box 48
		gunModel[8] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Box 49
		gunModel[9] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Box 50
		gunModel[10] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Box 51
		gunModel[11] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Box 52
		gunModel[12] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 53
		gunModel[13] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Box 54
		gunModel[14] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Box 55
		gunModel[15] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 56
		gunModel[16] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 57
		gunModel[17] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Box 58
		gunModel[18] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 59
		gunModel[19] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 60
		gunModel[20] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 61
		gunModel[21] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 62
		gunModel[22] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 63
		gunModel[23] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 64
		gunModel[24] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 65
		gunModel[25] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Box 66
		gunModel[26] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 67
		gunModel[27] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 68
		gunModel[28] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Box 69
		gunModel[29] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Box 70
		gunModel[30] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Box 71
		gunModel[31] = new ModelRendererTurbo(this, 0, 540, textureX, textureY); // Box 72
		gunModel[32] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 73
		gunModel[33] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Box 74
		gunModel[34] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Box 75
		gunModel[35] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Box 79
		gunModel[36] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 80
		gunModel[37] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 81
		gunModel[38] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 82
		gunModel[39] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Box 83
		gunModel[40] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Box 84
		gunModel[41] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Box 86
		gunModel[42] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Box 87
		gunModel[43] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Box 88
		gunModel[44] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 89
		gunModel[45] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 90
		gunModel[46] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Box 103
		gunModel[47] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 104
		gunModel[48] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Box 105
		gunModel[49] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 106
		gunModel[50] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Box 107
		gunModel[51] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 108
		gunModel[52] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Box 109
		gunModel[53] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 110
		gunModel[54] = new ModelRendererTurbo(this, 0, 1040, textureX, textureY); // Box 111
		gunModel[55] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 112
		gunModel[56] = new ModelRendererTurbo(this, 0, 1080, textureX, textureY); // Box 113
		gunModel[57] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Box 116
		gunModel[58] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Box 117
		gunModel[59] = new ModelRendererTurbo(this, 0, 1150, textureX, textureY); // Box 118
		gunModel[60] = new ModelRendererTurbo(this, 0, 1220, textureX, textureY); // Box 119
		gunModel[61] = new ModelRendererTurbo(this, 0, 1280, textureX, textureY); // Box 120
		gunModel[62] = new ModelRendererTurbo(this, 0, 1320, textureX, textureY); // Box 121
		gunModel[63] = new ModelRendererTurbo(this, 0, 1340, textureX, textureY); // Box 122
		gunModel[64] = new ModelRendererTurbo(this, 0, 1420, textureX, textureY); // Box 123
		gunModel[65] = new ModelRendererTurbo(this, 0, 1440, textureX, textureY); // Box 124
		gunModel[66] = new ModelRendererTurbo(this, 0, 1460, textureX, textureY); // Box 125
		gunModel[67] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 126
		gunModel[68] = new ModelRendererTurbo(this, 0, 1480, textureX, textureY); // Box 127
		gunModel[69] = new ModelRendererTurbo(this, 0, 1500, textureX, textureY); // Box 128
		gunModel[70] = new ModelRendererTurbo(this, 0, 1520, textureX, textureY); // Box 129
		gunModel[71] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 130
		gunModel[72] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 131
		gunModel[73] = new ModelRendererTurbo(this, 0, 1560, textureX, textureY); // Box 132
		gunModel[74] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 133
		gunModel[75] = new ModelRendererTurbo(this, 0, 1640, textureX, textureY); // Box 134

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F); // Box 41
		gunModel[0].setRotationPoint(36F, -33F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,4F, 0F, 0F,-4F, 0F, -2F,-4F, 0F, -2F,4F, 0F, 0F); // Box 42
		gunModel[1].setRotationPoint(45F, -33F, -3F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Box 43
		gunModel[2].setRotationPoint(36F, -27F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 44
		gunModel[3].setRotationPoint(41F, -27F, -3F);

		gunModel[4].addBox(0F, 0F, 0F, 5, 8, 8, 0F); // Box 45
		gunModel[4].setRotationPoint(31F, -33F, -4F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F,2F, 0F, 1F,2F, 0F, 1F,0F, 0F, 1F); // Box 46
		gunModel[5].setRotationPoint(31F, -25F, -4F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F); // Box 47
		gunModel[6].setRotationPoint(29F, -25F, -4F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 48
		gunModel[7].setRotationPoint(30F, -30F, -4F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 49
		gunModel[8].setRotationPoint(30F, -33F, -4F);

		gunModel[9].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // Box 50
		gunModel[9].setRotationPoint(36F, -36F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 51
		gunModel[10].setRotationPoint(45F, -36F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,2F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 52
		gunModel[11].setRotationPoint(29F, -36F, -4F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 53
		gunModel[12].setRotationPoint(27F, -22F, -5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 6, 10, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, -3F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, -3F, 0F); // Box 54
		gunModel[13].setRotationPoint(51F, -25F, -5F);

		gunModel[14].addBox(0F, 0F, 0F, 3, 11, 10, 0F); // Box 55
		gunModel[14].setRotationPoint(54F, -36F, -5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 50, 2, 10, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 56
		gunModel[15].setRotationPoint(29F, -38F, -5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 50, 3, 16, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 57
		gunModel[16].setRotationPoint(29F, -41F, -8F);

		gunModel[17].addBox(0F, 0F, 0F, 50, 5, 20, 0F); // Box 58
		gunModel[17].setRotationPoint(29F, -46F, -10F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 50, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 59
		gunModel[18].setRotationPoint(29F, -50F, -10F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 50, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 60
		gunModel[19].setRotationPoint(29F, -49F, -6F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 45, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 61
		gunModel[20].setRotationPoint(29F, -54F, -10F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 62
		gunModel[21].setRotationPoint(29F, -56F, -10F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 50, 3, 3, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 63
		gunModel[22].setRotationPoint(29F, -49F, 3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 50, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 64
		gunModel[23].setRotationPoint(29F, -50F, 6F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 45, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 65
		gunModel[24].setRotationPoint(29F, -54F, 6F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 66
		gunModel[25].setRotationPoint(29F, -56F, 6F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 45, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 67
		gunModel[26].setRotationPoint(29F, -60F, 6F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 45, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 68
		gunModel[27].setRotationPoint(29F, -60F, -10F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 69
		gunModel[28].setRotationPoint(49F, -63F, -10F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 30, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F); // Box 70
		gunModel[29].setRotationPoint(49F, -63F, -6F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 30, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F); // Box 71
		gunModel[30].setRotationPoint(49F, -63F, 3F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 72
		gunModel[31].setRotationPoint(49F, -63F, 6F);

		gunModel[32].addBox(0F, 0F, 0F, 30, 8, 20, 0F); // Box 73
		gunModel[32].setRotationPoint(49F, -71F, -10F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 30, 2, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F); // Box 74
		gunModel[33].setRotationPoint(49F, -76F, -5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 30, 3, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Box 75
		gunModel[34].setRotationPoint(49F, -74F, -8F);

		gunModel[35].addBox(0F, 0F, 0F, 15, 17, 6, 0F); // Box 79
		gunModel[35].setRotationPoint(30F, -63F, -3F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 15, 17, 3, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 80
		gunModel[36].setRotationPoint(30F, -62F, 3F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 15, 17, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 81
		gunModel[37].setRotationPoint(30F, -62F, -6F);

		gunModel[38].addBox(0F, 0F, 0F, 39, 4, 12, 0F); // Box 82
		gunModel[38].setRotationPoint(47F, -57.5F, -6F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 39, 2, 12, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 83
		gunModel[39].setRotationPoint(47F, -59.5F, -6F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 39, 2, 10, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 84
		gunModel[40].setRotationPoint(47F, -61.5F, -5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 39, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 86
		gunModel[41].setRotationPoint(47F, -53.5F, -6F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 39, 2, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F); // Box 87
		gunModel[42].setRotationPoint(47F, -51.5F, -5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 40, 6, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 88
		gunModel[43].setRotationPoint(-11F, -56F, 4F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 15, 10, 6, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 89
		gunModel[44].setRotationPoint(-11F, -66F, 4F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 20, 2, 20, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 90
		gunModel[45].setRotationPoint(29F, -62F, -10F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 40, 6, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 103
		gunModel[46].setRotationPoint(-11F, -56F, -10F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 15, 10, 6, 0F,0F, 0F, -3F,-4F, 0F, -3F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 104
		gunModel[47].setRotationPoint(-11F, -66F, -10F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 65, 2, 8, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 105
		gunModel[48].setRotationPoint(-36F, -38F, -4F);

		gunModel[49].addBox(0F, 0F, 0F, 65, 10, 12, 0F); // Box 106
		gunModel[49].setRotationPoint(-36F, -48F, -6F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 65, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Box 107
		gunModel[50].setRotationPoint(-36F, -50F, -4F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 24, 3, 10, 0F,-2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 108
		gunModel[51].setRotationPoint(21F, -19F, -5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F,-2F, 0F, 0F,10F, 0F, 0F,10F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 109
		gunModel[52].setRotationPoint(19F, -16F, -5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 16, 21, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,6F, 0F, 0F); // Box 110
		gunModel[53].setRotationPoint(19F, -11F, -5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 111
		gunModel[54].setRotationPoint(13F, 10F, -5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 112
		gunModel[55].setRotationPoint(13F, 3F, -4.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 13, 6, 9, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 113
		gunModel[56].setRotationPoint(11F, -3F, -4.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 17, 2, 14, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 116
		gunModel[57].setRotationPoint(-50F, -51F, -7F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 15, 9, 14, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 117
		gunModel[58].setRotationPoint(-50F, -49F, -7F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 15, 48, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F); // Box 118
		gunModel[59].setRotationPoint(-50F, -40F, -7F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 10, 40, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,-2F, 0F, 0F); // Box 119
		gunModel[60].setRotationPoint(-39F, -38F, -6F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 9, 14, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 120
		gunModel[61].setRotationPoint(-52F, -49F, -7F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 121
		gunModel[62].setRotationPoint(-52F, -51F, -7F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 48, 14, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,-2F, 0F, -2F,2F, 0F, 0F,2F, 0F, 0F,-2F, 0F, -2F); // Box 122
		gunModel[63].setRotationPoint(-52F, -40F, -7F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 15, 2, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 123
		gunModel[64].setRotationPoint(-48F, 8F, -7F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, -2F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, -2F, -2F); // Box 124
		gunModel[65].setRotationPoint(-50F, 8F, -7F);

		gunModel[66].addBox(0F, 0F, 0F, 54, 4, 8, 0F); // Box 125
		gunModel[66].setRotationPoint(-39F, 0F, -4F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 54, 2, 8, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 126
		gunModel[67].setRotationPoint(-39F, -2F, -4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 54, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 127
		gunModel[68].setRotationPoint(-39F, 4F, -4F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 128
		gunModel[69].setRotationPoint(-39F, 2F, -6F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 21, 7, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 129
		gunModel[70].setRotationPoint(19F, -56F, -14F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 21, 4, 28, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 130
		gunModel[71].setRotationPoint(19F, -60F, -14F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 15, 3, 28, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 131
		gunModel[72].setRotationPoint(22F, -63F, -14F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 21, 4, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 132
		gunModel[73].setRotationPoint(19F, -49F, -14F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 15, 3, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 133
		gunModel[74].setRotationPoint(22F, -45F, -14F);

		gunModel[75].addShapeBox(-8.5F, -4F, 0F, 17, 5, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 134
		gunModel[75].setRotationPoint(30F, -51F, -15F);
		gunModel[75].rotateAngleZ = 0.34906585F;


		slideModel = new ModelRendererTurbo[14];
		slideModel[0] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Box 76
		slideModel[1] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Box 77
		slideModel[2] = new ModelRendererTurbo(this, 0, 1740, textureX, textureY); // Box 91
		slideModel[3] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Box 92
		slideModel[4] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Box 93
		slideModel[5] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Box 94
		slideModel[6] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Box 95
		slideModel[7] = new ModelRendererTurbo(this, 0, 1840, textureX, textureY); // Box 96
		slideModel[8] = new ModelRendererTurbo(this, 0, 1860, textureX, textureY); // Box 97
		slideModel[9] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Box 98
		slideModel[10] = new ModelRendererTurbo(this, 0, 1920, textureX, textureY); // Box 99
		slideModel[11] = new ModelRendererTurbo(this, 0, 1940, textureX, textureY); // Box 100
		slideModel[12] = new ModelRendererTurbo(this, 0, 1960, textureX, textureY); // Box 101
		slideModel[13] = new ModelRendererTurbo(this, 0, 1990, textureX, textureY); // Box 102

		slideModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 76
		slideModel[0].setRotationPoint(39F, -68F, -6F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, -2F,0F, 2F, -2F,0F, 2F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Box 77
		slideModel[1].setRotationPoint(39F, -73F, -6F);

		slideModel[2].addBox(0F, 0F, 0F, 41, 14, 8, 0F); // Box 91
		slideModel[2].setRotationPoint(-2F, -69F, -4F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 41, 2, 8, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 92
		slideModel[3].setRotationPoint(-2F, -71F, -4F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, 4F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 4F, 0F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F); // Box 93
		slideModel[4].setRotationPoint(-6F, -71F, -4F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 14, 8, 0F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F); // Box 94
		slideModel[5].setRotationPoint(-6F, -69F, -4F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 41, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 95
		slideModel[6].setRotationPoint(-2F, -55F, -4F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F); // Box 96
		slideModel[7].setRotationPoint(-6F, -55F, -4F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 25, 14, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 97
		slideModel[8].setRotationPoint(-31F, -69F, -6F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 25, 6, 12, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 98
		slideModel[9].setRotationPoint(-31F, -75F, -6F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 25, 5, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 99
		slideModel[10].setRotationPoint(-31F, -55F, -6F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 0F, 0F); // Box 100
		slideModel[11].setRotationPoint(-35F, -55F, -4F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 4, 14, 8, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F); // Box 101
		slideModel[12].setRotationPoint(-35F, -69F, -4F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, 0F, -2F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 0F); // Box 102
		slideModel[13].setRotationPoint(-35F, -71F, -4F);



		barrelAttachPoint = new Vector3f(0F, 0F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(0F, 0F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);

		gunSlideDistance = 1.5F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
