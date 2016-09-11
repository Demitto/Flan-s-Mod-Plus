//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelMoke extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMoke()
	{
		bodyModel = new ModelRendererTurbo[130];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 412, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 412, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 562, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Box 58
		bodyModel[40] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 59
		bodyModel[41] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 60
		bodyModel[42] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 64
		bodyModel[46] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 66
		bodyModel[48] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 74
		bodyModel[54] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Box 75
		bodyModel[55] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 76
		bodyModel[56] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 77
		bodyModel[57] = new ModelRendererTurbo(this, 200, 460, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 200, 460, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Box 81
		bodyModel[60] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 95
		bodyModel[62] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Box 96
		bodyModel[63] = new ModelRendererTurbo(this, 200, 540, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Box 1
		bodyModel[65] = new ModelRendererTurbo(this, 200, 580, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 3
		bodyModel[67] = new ModelRendererTurbo(this, 200, 540, textureX, textureY); // Box 4
		bodyModel[68] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 200, 720, textureX, textureY); // Box 6
		bodyModel[70] = new ModelRendererTurbo(this, 200, 740, textureX, textureY); // Box 7
		bodyModel[71] = new ModelRendererTurbo(this, 200, 740, textureX, textureY); // Box 8
		bodyModel[72] = new ModelRendererTurbo(this, 200, 720, textureX, textureY); // Box 9
		bodyModel[73] = new ModelRendererTurbo(this, 200, 770, textureX, textureY); // Box 10
		bodyModel[74] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 11
		bodyModel[75] = new ModelRendererTurbo(this, 220, 820, textureX, textureY); // Box 12
		bodyModel[76] = new ModelRendererTurbo(this, 240, 820, textureX, textureY); // Box 13
		bodyModel[77] = new ModelRendererTurbo(this, 240, 820, textureX, textureY); // Box 14
		bodyModel[78] = new ModelRendererTurbo(this, 220, 820, textureX, textureY); // Box 15
		bodyModel[79] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Box 16
		bodyModel[80] = new ModelRendererTurbo(this, 200, 840, textureX, textureY); // Box 17
		bodyModel[81] = new ModelRendererTurbo(this, 200, 860, textureX, textureY); // Box 18
		bodyModel[82] = new ModelRendererTurbo(this, 200, 880, textureX, textureY); // Box 19
		bodyModel[83] = new ModelRendererTurbo(this, 200, 880, textureX, textureY); // Box 20
		bodyModel[84] = new ModelRendererTurbo(this, 200, 890, textureX, textureY); // Box 21
		bodyModel[85] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Box 22
		bodyModel[86] = new ModelRendererTurbo(this, 200, 890, textureX, textureY); // Box 23
		bodyModel[87] = new ModelRendererTurbo(this, 200, 960, textureX, textureY); // Box 46
		bodyModel[88] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 1
		bodyModel[90] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 3
		bodyModel[92] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 4
		bodyModel[93] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 5
		bodyModel[94] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Box 6
		bodyModel[95] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 7
		bodyModel[96] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 8
		bodyModel[97] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 9
		bodyModel[98] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Box 10
		bodyModel[99] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 11
		bodyModel[100] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 12
		bodyModel[101] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 13
		bodyModel[102] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 14
		bodyModel[103] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Box 15
		bodyModel[104] = new ModelRendererTurbo(this, 400, 130, textureX, textureY); // Box 16
		bodyModel[105] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 17
		bodyModel[106] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Box 18
		bodyModel[107] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 19
		bodyModel[108] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Box 20
		bodyModel[109] = new ModelRendererTurbo(this, 400, 130, textureX, textureY); // Box 21
		bodyModel[110] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 22
		bodyModel[111] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Box 23
		bodyModel[112] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 24
		bodyModel[113] = new ModelRendererTurbo(this, 400, 260, textureX, textureY); // Box 25
		bodyModel[114] = new ModelRendererTurbo(this, 400, 260, textureX, textureY); // Box 26
		bodyModel[115] = new ModelRendererTurbo(this, 400, 270, textureX, textureY); // Box 27
		bodyModel[116] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 28
		bodyModel[117] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 29
		bodyModel[118] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Box 30
		bodyModel[119] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Box 31
		bodyModel[120] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 32
		bodyModel[121] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 33
		bodyModel[122] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 34
		bodyModel[123] = new ModelRendererTurbo(this, 400, 480, textureX, textureY); // Box 35
		bodyModel[124] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Box 37
		bodyModel[125] = new ModelRendererTurbo(this, 400, 570, textureX, textureY); // Box 38
		bodyModel[126] = new ModelRendererTurbo(this, 400, 630, textureX, textureY); // Box 40
		bodyModel[127] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Box 41
		bodyModel[128] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Box 42
		bodyModel[129] = new ModelRendererTurbo(this, 400, 630, textureX, textureY); // Box 43

		bodyModel[0].addShapeBox(0F, 0F, 0F, 31, 3, 44, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(38F, -14.5F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 31, 2, 40, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(38F, -16.5F, -20F);

		bodyModel[2].addBox(0F, 0F, 0F, 26, 2, 64, 0F); // Box 3
		bodyModel[2].setRotationPoint(43F, -7.5F, -32F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 15, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -15F,0F, 0F, -15F,0F, 0F, 0F,0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(67F, -5.5F, -32F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 15, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -15F,0F, 0F, -15F); // Box 5
		bodyModel[4].setRotationPoint(67F, -5.5F, 16F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 15, 32, 0F); // Box 6
		bodyModel[5].setRotationPoint(67F, -5.5F, -16F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 7
		bodyModel[6].setRotationPoint(68.5F, -15.5F, -2.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(68.5F, -11.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, -3F,0F, 0F, -3F); // Box 9
		bodyModel[8].setRotationPoint(68.5F, -10.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F); // Box 10
		bodyModel[9].setRotationPoint(68.5F, -4.5F, -15F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 11
		bodyModel[10].setRotationPoint(68.5F, -2.5F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -3F,0F, 0F, -3F,0F, -1F, 0F,0F, -1F, 0F); // Box 12
		bodyModel[11].setRotationPoint(68.5F, -0.5F, -15F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 24, 0F); // Box 13
		bodyModel[12].setRotationPoint(68.5F, 3.5F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 3F,0F, 0F, 3F); // Box 14
		bodyModel[13].setRotationPoint(68.5F, -10.5F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(68.5F, -4.5F, 11F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 16
		bodyModel[15].setRotationPoint(68.5F, -2.5F, 14F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, -3F,0F, 0F, -3F); // Box 17
		bodyModel[16].setRotationPoint(68.5F, -0.5F, 12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F); // Box 18
		bodyModel[17].setRotationPoint(68.1F, -10.5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F); // Box 19
		bodyModel[18].setRotationPoint(68.1F, -4.5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 28, 0F); // Box 20
		bodyModel[19].setRotationPoint(68.1F, -2.5F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 21
		bodyModel[20].setRotationPoint(68.1F, -0.5F, -14F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 24
		bodyModel[21].setRotationPoint(68.2F, -10.5F, -4F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 31
		bodyModel[22].setRotationPoint(68.2F, -10.5F, 3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 36
		bodyModel[23].setRotationPoint(68.3F, -9.5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(68.3F, -7.5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 38
		bodyModel[25].setRotationPoint(68.3F, -5.5F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 28, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(68.3F, -3.5F, -14F);

		bodyModel[27].addBox(0F, 0F, 0F, 31, 4, 44, 0F); // Box 41
		bodyModel[27].setRotationPoint(38F, -11.5F, -22F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 28, 0F); // Box 42
		bodyModel[28].setRotationPoint(68.3F, -1.5F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 43
		bodyModel[29].setRotationPoint(68.3F, 0.5F, -14F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 44
		bodyModel[30].setRotationPoint(68.3F, 2.5F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Box 45
		bodyModel[31].setRotationPoint(69F, -0.5F, -19F);
		bodyModel[31].rotateAngleX = 0.26179939F;

		bodyModel[32].addShapeBox(0F, 0F, -1F, 4, 7, 1, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Box 46
		bodyModel[32].setRotationPoint(69F, -0.5F, 19F);
		bodyModel[32].rotateAngleX = -0.26179939F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 62, 0F); // Box 47
		bodyModel[33].setRotationPoint(71.5F, 1.5F, -31F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 48
		bodyModel[34].setRotationPoint(68.5F, -11.5F, -20F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 49
		bodyModel[35].setRotationPoint(68.5F, -13.5F, -20F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 50
		bodyModel[36].setRotationPoint(68.5F, -14.5F, -19F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 51
		bodyModel[37].setRotationPoint(68.5F, -8.5F, -20F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 52
		bodyModel[38].setRotationPoint(68.5F, -6.5F, -19F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 58
		bodyModel[39].setRotationPoint(68.5F, -14.5F, 12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 59
		bodyModel[40].setRotationPoint(68.5F, -13.5F, 11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 60
		bodyModel[41].setRotationPoint(68.5F, -11.5F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 61
		bodyModel[42].setRotationPoint(68.5F, -8.5F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 62
		bodyModel[43].setRotationPoint(68.5F, -6.5F, 12F);

		bodyModel[44].addBox(0F, 0F, 0F, 24, 15, 35, 0F); // Box 63
		bodyModel[44].setRotationPoint(43F, -5.5F, -17F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F); // Box 64
		bodyModel[45].setRotationPoint(31F, -7.5F, -32F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F); // Box 65
		bodyModel[46].setRotationPoint(31F, -7.5F, 22F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 17, 44, 0F,0F, -3F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 66
		bodyModel[47].setRotationPoint(37F, -7.5F, -22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 9, 52, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F); // Box 68
		bodyModel[48].setRotationPoint(37F, -16.5F, -26F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 69
		bodyModel[49].setRotationPoint(37F, -37.5F, -26F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 70
		bodyModel[50].setRotationPoint(37F, -37.5F, 24F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 48, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,-1F, 0F, 0F); // Box 71
		bodyModel[51].setRotationPoint(27F, -37.5F, -24F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F); // Box 73
		bodyModel[52].setRotationPoint(31F, -4.5F, -22F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F); // Box 74
		bodyModel[53].setRotationPoint(31F, -4.5F, 20F);

		bodyModel[54].addBox(0F, 0F, 0F, 63, 2, 10, 0F); // Box 75
		bodyModel[54].setRotationPoint(-32F, -1.5F, 22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 63, 10, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 76
		bodyModel[55].setRotationPoint(-32F, 0.5F, 22F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 5, 40, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F); // Box 77
		bodyModel[56].setRotationPoint(31F, 4.5F, -20F);

		bodyModel[57].addBox(0F, 0F, 0F, 63, 13, 2, 0F); // Box 79
		bodyModel[57].setRotationPoint(-32F, -1.5F, 20F);

		bodyModel[58].addBox(0F, 0F, 0F, 63, 13, 2, 0F); // Box 80
		bodyModel[58].setRotationPoint(-32F, -1.5F, -22F);

		bodyModel[59].addBox(0F, 0F, 0F, 76, 5, 40, 0F); // Box 81
		bodyModel[59].setRotationPoint(-45F, 6.5F, -20F);

		bodyModel[60].addBox(-19F, -1.5F, -1.5F, 21, 2, 2, 0F); // Box 82
		bodyModel[60].setRotationPoint(37F, 0.5F, 13F);
		bodyModel[60].rotateAngleZ = -0.75049158F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 63, 10, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 95
		bodyModel[61].setRotationPoint(-32F, 0.5F, -32F);

		bodyModel[62].addBox(0F, 0F, 0F, 63, 2, 10, 0F); // Box 96
		bodyModel[62].setRotationPoint(-32F, -1.5F, -32F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F); // Box 0
		bodyModel[63].setRotationPoint(-45F, -1.5F, 22F);

		bodyModel[64].addBox(0F, 0F, 0F, 20, 2, 10, 0F); // Box 1
		bodyModel[64].setRotationPoint(-65F, -7.5F, 22F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 13, 64, 0F); // Box 2
		bodyModel[65].setRotationPoint(-65F, -5.5F, -32F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 44, 0F); // Box 3
		bodyModel[66].setRotationPoint(-65F, -7.5F, -22F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F); // Box 4
		bodyModel[67].setRotationPoint(-45F, -1.5F, -32F);

		bodyModel[68].addBox(0F, 0F, 0F, 20, 2, 10, 0F); // Box 5
		bodyModel[68].setRotationPoint(-65F, -7.5F, -32F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 6
		bodyModel[69].setRotationPoint(-45F, -1.5F, 20F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 19, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F); // Box 7
		bodyModel[70].setRotationPoint(-63F, -7.5F, 20F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 18, 19, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F); // Box 8
		bodyModel[71].setRotationPoint(-63F, -7.5F, -22F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		bodyModel[72].setRotationPoint(-45F, -1.5F, -22F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 2, 40, 0F,0F, 12F, 0F,0F, 8F, 0F,0F, 08F, 0F,0F, 12F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F); // Box 10
		bodyModel[73].setRotationPoint(-63F, 9.5F, -20F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 11
		bodyModel[74].setRotationPoint(-65.5F, -5.5F, -31F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 12
		bodyModel[75].setRotationPoint(-65.5F, -5.5F, -26F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 13
		bodyModel[76].setRotationPoint(-65.5F, -5.5F, -21F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 14
		bodyModel[77].setRotationPoint(-65.5F, -5.5F, 18F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 15
		bodyModel[78].setRotationPoint(-65.5F, -5.5F, 23F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 16
		bodyModel[79].setRotationPoint(-65.5F, -5.5F, 28F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 9, 12, 0F); // Box 17
		bodyModel[80].setRotationPoint(-65.5F, -3.5F, -14F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 2, 46, 0F); // Box 18
		bodyModel[81].setRotationPoint(48.5F, 5.5F, -23F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 19
		bodyModel[82].setRotationPoint(47.5F, 4.5F, -25F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 20
		bodyModel[83].setRotationPoint(47.5F, 5.5F, 23F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F); // Box 21
		bodyModel[84].setRotationPoint(48.5F, 10.5F, -25F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 2, 50, 0F); // Box 22
		bodyModel[85].setRotationPoint(48.5F, 0.5F, -25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		bodyModel[86].setRotationPoint(48.5F, 10.5F, 17F);

		bodyModel[87].addBox(-10.5F, -3.5F, -6F, 7, 7, 50, 0F); // Box 46
		bodyModel[87].setRotationPoint(-39.5F, 6.5F, -19F);

		bodyModel[88].addBox(0F, 0F, 0F, 10, 6, 14, 0F); // Box 0
		bodyModel[88].setRotationPoint(7F, 0.5F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[89].setRotationPoint(3F, 0.5F, 5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 2
		bodyModel[90].setRotationPoint(-1F, 2.5F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 21, 14, 0F,5F, -2F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,5F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		bodyModel[91].setRotationPoint(-1F, -18.5F, 5F);

		bodyModel[92].addBox(0F, 0F, 0F, 10, 6, 14, 0F); // Box 4
		bodyModel[92].setRotationPoint(7F, 0.5F, -19F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		bodyModel[93].setRotationPoint(3F, 0.5F, -19F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 6
		bodyModel[94].setRotationPoint(-1F, 2.5F, -19F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 21, 14, 0F,5F, -2F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,5F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 7
		bodyModel[95].setRotationPoint(-1F, -18.5F, -19F);

		bodyModel[96].addBox(0F, 0F, 0F, 10, 6, 14, 0F); // Box 8
		bodyModel[96].setRotationPoint(-27F, 0.5F, -19F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		bodyModel[97].setRotationPoint(-31F, 0.5F, -19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 10
		bodyModel[98].setRotationPoint(-35F, 2.5F, -19F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 21, 14, 0F,5F, -2F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,5F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 11
		bodyModel[99].setRotationPoint(-35F, -18.5F, -19F);

		bodyModel[100].addBox(0F, 0F, 0F, 10, 6, 14, 0F); // Box 12
		bodyModel[100].setRotationPoint(-27F, 0.5F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 13
		bodyModel[101].setRotationPoint(-31F, 0.5F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 21, 14, 0F,5F, -2F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,5F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		bodyModel[102].setRotationPoint(-35F, -18.5F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 15
		bodyModel[103].setRotationPoint(-35F, 2.5F, 5F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 13, 2, 0F); // Box 16
		bodyModel[104].setRotationPoint(-10F, -14.5F, -27F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,2F, -2F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F,2F, -2F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F); // Box 17
		bodyModel[105].setRotationPoint(-10F, -21.5F, -27F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,11F, 0F, 0F,-11F, 0F, 0F,-11F, 0F, 0F,11F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18
		bodyModel[106].setRotationPoint(-12F, -42.5F, -27F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,-20F, 0F, 0F,20F, 0F, 0F,20F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 19
		bodyModel[107].setRotationPoint(-10F, -42.5F, -27F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,2F, -2F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F,2F, -2F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F,0F, 0F, 0.2F); // Box 20
		bodyModel[108].setRotationPoint(-10F, -21.5F, 25F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 13, 2, 0F); // Box 21
		bodyModel[109].setRotationPoint(-10F, -14.5F, 25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,-20F, 0F, 0F,20F, 0F, 0F,20F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 22
		bodyModel[110].setRotationPoint(-10F, -42.5F, 25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,11F, 0F, 0F,-11F, 0F, 0F,-11F, 0F, 0F,11F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		bodyModel[111].setRotationPoint(-12F, -42.5F, 25F);

		bodyModel[112].addBox(0F, 0F, 0F, 35, 1, 54, 0F); // Box 24
		bodyModel[112].setRotationPoint(-23F, -43.5F, -27F);

		bodyModel[113].addBox(0F, 0F, 0F, 35, 5, 1, 0F); // Box 25
		bodyModel[113].setRotationPoint(-23F, -43.5F, -28F);

		bodyModel[114].addBox(0F, 0F, 0F, 35, 5, 1, 0F); // Box 26
		bodyModel[114].setRotationPoint(-23F, -43.5F, 27F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 16, 1, 54, 0F,0F, 0F, 0F,0F, -5F, -1F,0F, -5F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 5F, -1F,0F, 5F, -1F,0F, 0F, 0F); // Box 27
		bodyModel[115].setRotationPoint(12F, -43.5F, -27F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F,0F, -5F, -1F,0F, -5F, 1F,0F, 0F, 0F,0F, 0F, 0F,1.5F, 3F, -1F,1.5F, 3F, 1F,0F, 0F, 0F); // Box 28
		bodyModel[116].setRotationPoint(12F, -43.5F, -28F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F,0F, -5F, 1F,0F, -5F, -1F,0F, 0F, 0F,0F, 0F, 0F,1.5F, 3F, 1F,1.5F, 3F, -1F,0F, 0F, 0F); // Box 29
		bodyModel[117].setRotationPoint(12F, -43.5F, 27F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 30
		bodyModel[118].setRotationPoint(-53F, -38.5F, 25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 31, 2, 0F,10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		bodyModel[119].setRotationPoint(-53F, -38.5F, -27F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 40, 1, 54, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 32
		bodyModel[120].setRotationPoint(-63F, -39.5F, -27F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 40, 5, 1, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 33
		bodyModel[121].setRotationPoint(-63F, -39.5F, -28F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 40, 5, 1, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 34
		bodyModel[122].setRotationPoint(-63F, -39.5F, 27F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 4, 54, 0F); // Box 35
		bodyModel[123].setRotationPoint(-63F, -38.5F, -27F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F); // Box 37
		bodyModel[124].setRotationPoint(-63F, -34.5F, 18F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 52, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 38
		bodyModel[125].setRotationPoint(-63F, -26.5F, -26F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2.5F,0F, 0F, -2.5F); // Box 40
		bodyModel[126].setRotationPoint(-63F, -22.5F, 18F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 45, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1.25F,0F, 0F, -1.25F,0F, 0F, -1.25F,0F, 0F, -1.25F); // Box 41
		bodyModel[127].setRotationPoint(-63F, -12.5F, -22.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Box 42
		bodyModel[128].setRotationPoint(-63F, -34.5F, -28F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2.5F,0F, 0F, -2.5F,0F, 0F, 0F,0F, 0F, 0F); // Box 43
		bodyModel[129].setRotationPoint(-63F, -22.5F, -25F);


		leftFrontWheelModel = new ModelRendererTurbo[5];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 31
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 32
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 400, 740, textureX, textureY); // Box 33
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 34
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 35

		leftFrontWheelModel[0].addShapeBox(-7.5F, -10.5F, 0F, 15, 3, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		leftFrontWheelModel[0].setRotationPoint(49.5F, 6.5F, 25F);

		leftFrontWheelModel[1].addShapeBox(-10.5F, -7.5F, 0F, 21, 4, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 32
		leftFrontWheelModel[1].setRotationPoint(49.5F, 6.5F, 25F);

		leftFrontWheelModel[2].addBox(-10.5F, -3.5F, 0F, 21, 7, 6, 0F); // Box 33
		leftFrontWheelModel[2].setRotationPoint(49.5F, 6.5F, 25F);

		leftFrontWheelModel[3].addShapeBox(-10.5F, 3.5F, 0F, 21, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 34
		leftFrontWheelModel[3].setRotationPoint(49.5F, 6.5F, 25F);

		leftFrontWheelModel[4].addShapeBox(-7.5F, 7.5F, 0F, 15, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 35
		leftFrontWheelModel[4].setRotationPoint(49.5F, 6.5F, 25F);


		rightFrontWheelModel = new ModelRendererTurbo[5];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 400, 740, textureX, textureY); // Box 24
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 27
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 28
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 29
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 30

		rightFrontWheelModel[0].addBox(-10.5F, -3.5F, -6F, 21, 7, 6, 0F); // Box 24
		rightFrontWheelModel[0].setRotationPoint(49.5F, 6.5F, -25F);

		rightFrontWheelModel[1].addShapeBox(-10.5F, -7.5F, -6F, 21, 4, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 27
		rightFrontWheelModel[1].setRotationPoint(49.5F, 6.5F, -25F);

		rightFrontWheelModel[2].addShapeBox(-7.5F, -10.5F, -6F, 15, 3, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 28
		rightFrontWheelModel[2].setRotationPoint(49.5F, 6.5F, -25F);

		rightFrontWheelModel[3].addShapeBox(-10.5F, 3.5F, -6F, 21, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 29
		rightFrontWheelModel[3].setRotationPoint(49.5F, 6.5F, -25F);

		rightFrontWheelModel[4].addShapeBox(-7.5F, 7.5F, -6F, 15, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 30
		rightFrontWheelModel[4].setRotationPoint(49.5F, 6.5F, -25F);


		leftBackWheelModel = new ModelRendererTurbo[5];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 41
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 42
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 400, 740, textureX, textureY); // Box 43
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 44
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 45

		leftBackWheelModel[0].addShapeBox(-7.5F, -10.5F, 0F, 15, 3, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 41
		leftBackWheelModel[0].setRotationPoint(-46.5F, 6.5F, 25F);

		leftBackWheelModel[1].addShapeBox(-10.5F, -7.5F, 0F, 21, 4, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 42
		leftBackWheelModel[1].setRotationPoint(-46.5F, 6.5F, 25F);

		leftBackWheelModel[2].addBox(-10.5F, -3.5F, 0F, 21, 7, 6, 0F); // Box 43
		leftBackWheelModel[2].setRotationPoint(-46.5F, 6.5F, 25F);

		leftBackWheelModel[3].addShapeBox(-10.5F, 3.5F, 0F, 21, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 44
		leftBackWheelModel[3].setRotationPoint(-46.5F, 6.5F, 25F);

		leftBackWheelModel[4].addShapeBox(-7.5F, 7.5F, 0F, 15, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 45
		leftBackWheelModel[4].setRotationPoint(-46.5F, 6.5F, 25F);


		rightBackWheelModel = new ModelRendererTurbo[5];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 36
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 37
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 400, 740, textureX, textureY); // Box 38
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Box 39
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Box 40

		rightBackWheelModel[0].addShapeBox(-7.5F, -10.5F, -6F, 15, 3, 6, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 36
		rightBackWheelModel[0].setRotationPoint(-46.5F, 6.5F, -25F);

		rightBackWheelModel[1].addShapeBox(-10.5F, -7.5F, -6F, 21, 4, 6, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		rightBackWheelModel[1].setRotationPoint(-46.5F, 6.5F, -25F);

		rightBackWheelModel[2].addBox(-10.5F, -3.5F, -6F, 21, 7, 6, 0F); // Box 38
		rightBackWheelModel[2].setRotationPoint(-46.5F, 6.5F, -25F);

		rightBackWheelModel[3].addShapeBox(-10.5F, 3.5F, -6F, 21, 4, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F); // Box 39
		rightBackWheelModel[3].setRotationPoint(-46.5F, 6.5F, -25F);

		rightBackWheelModel[4].addShapeBox(-7.5F, 7.5F, -6F, 15, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 40
		rightBackWheelModel[4].setRotationPoint(-46.5F, 6.5F, -25F);


		steeringWheelModel = new ModelRendererTurbo[12];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Box 83
		steeringWheelModel[1] = new ModelRendererTurbo(this, 400, 770, textureX, textureY); // Box 84
		steeringWheelModel[2] = new ModelRendererTurbo(this, 400, 780, textureX, textureY); // Box 85
		steeringWheelModel[3] = new ModelRendererTurbo(this, 400, 780, textureX, textureY); // Box 86
		steeringWheelModel[4] = new ModelRendererTurbo(this, 400, 800, textureX, textureY); // Box 87
		steeringWheelModel[5] = new ModelRendererTurbo(this, 400, 800, textureX, textureY); // Box 88
		steeringWheelModel[6] = new ModelRendererTurbo(this, 400, 820, textureX, textureY); // Box 89
		steeringWheelModel[7] = new ModelRendererTurbo(this, 400, 820, textureX, textureY); // Box 90
		steeringWheelModel[8] = new ModelRendererTurbo(this, 400, 840, textureX, textureY); // Box 91
		steeringWheelModel[9] = new ModelRendererTurbo(this, 400, 840, textureX, textureY); // Box 92
		steeringWheelModel[10] = new ModelRendererTurbo(this, 400, 840, textureX, textureY); // Box 93
		steeringWheelModel[11] = new ModelRendererTurbo(this, 400, 840, textureX, textureY); // Box 94

		steeringWheelModel[0].addShapeBox(-22F, -2.5F, -2.5F, 3, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Box 83
		steeringWheelModel[0].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[0].rotateAngleZ = -0.75049158F;

		steeringWheelModel[1].addBox(-23F, -2.5F, -2.5F, 1, 4, 4, 0F); // Box 84
		steeringWheelModel[1].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[1].rotateAngleZ = -0.75049158F;

		steeringWheelModel[2].addBox(-23F, -1.5F, 1.5F, 1, 2, 5, 0F); // Box 85
		steeringWheelModel[2].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[2].rotateAngleZ = -0.75049158F;

		steeringWheelModel[3].addBox(-23F, -1.5F, -7.5F, 1, 2, 5, 0F); // Box 86
		steeringWheelModel[3].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[3].rotateAngleZ = -0.75049158F;

		steeringWheelModel[4].addBox(-23F, -4.5F, 6.5F, 1, 8, 1, 0F); // Box 87
		steeringWheelModel[4].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[4].rotateAngleZ = -0.75049158F;

		steeringWheelModel[5].addBox(-23F, -4.5F, -8.5F, 1, 8, 1, 0F); // Box 88
		steeringWheelModel[5].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[5].rotateAngleZ = -0.75049158F;

		steeringWheelModel[6].addBox(-23F, -8.5F, -4.5F, 1, 1, 8, 0F); // Box 89
		steeringWheelModel[6].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[6].rotateAngleZ = -0.75049158F;

		steeringWheelModel[7].addBox(-23F, 6.5F, -4.5F, 1, 1, 8, 0F); // Box 90
		steeringWheelModel[7].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[7].rotateAngleZ = -0.75049158F;

		steeringWheelModel[8].addShapeBox(-23F, -8.5F, 6.5F, 1, 4, 1, 0F,0F, -1F, 3F,0F, -1F, 3F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 91
		steeringWheelModel[8].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[8].rotateAngleZ = -0.75049158F;

		steeringWheelModel[9].addShapeBox(-23F, -8.5F, -8.5F, 1, 4, 1, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, -1F, 3F,0F, -1F, 3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 92
		steeringWheelModel[9].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[9].rotateAngleZ = -0.75049158F;

		steeringWheelModel[10].addShapeBox(-23F, 3.5F, 6.5F, 1, 4, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 3F,0F, -1F, 3F,0F, 0F, -4F,0F, 0F, -4F); // Box 93
		steeringWheelModel[10].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[10].rotateAngleZ = -0.75049158F;

		steeringWheelModel[11].addShapeBox(-23F, 3.5F, -8.5F, 1, 4, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, -1F, 3F,0F, -1F, 3F); // Box 94
		steeringWheelModel[11].setRotationPoint(37F, 0.5F, 13F);
		steeringWheelModel[11].rotateAngleZ = -0.75049158F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
