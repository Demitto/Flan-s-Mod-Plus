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

public class ModelMechFlak extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechFlak() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[58];
		gunModel[0] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Import Body1
		gunModel[1] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 71
		gunModel[2] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 72
		gunModel[3] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 73
		gunModel[4] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 74
		gunModel[5] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 75
		gunModel[6] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 76
		gunModel[7] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 77
		gunModel[8] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 78
		gunModel[9] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 79
		gunModel[10] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 80
		gunModel[11] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 81
		gunModel[12] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 82
		gunModel[13] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 83
		gunModel[14] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 84
		gunModel[15] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 85
		gunModel[16] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 86
		gunModel[17] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 87
		gunModel[18] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 88
		gunModel[19] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 89
		gunModel[20] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 90
		gunModel[21] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 91
		gunModel[22] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 92
		gunModel[23] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 93
		gunModel[24] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 94
		gunModel[25] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 95
		gunModel[26] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 96
		gunModel[27] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 97
		gunModel[28] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 98
		gunModel[29] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 99
		gunModel[30] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 100
		gunModel[31] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 101
		gunModel[32] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 102
		gunModel[33] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 103
		gunModel[34] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 104
		gunModel[35] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 105
		gunModel[36] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 106
		gunModel[37] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 107
		gunModel[38] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 115
		gunModel[39] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 116
		gunModel[40] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 117
		gunModel[41] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 118
		gunModel[42] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 119
		gunModel[43] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 120
		gunModel[44] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 121
		gunModel[45] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 122
		gunModel[46] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 123
		gunModel[47] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 124
		gunModel[48] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 125
		gunModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 126
		gunModel[50] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 127
		gunModel[51] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 128
		gunModel[52] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 129
		gunModel[53] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 130
		gunModel[54] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 131
		gunModel[55] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 132
		gunModel[56] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 133
		gunModel[57] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 134

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Import Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 10, 32, 24, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -6F, 0F, -15F, -6F, 0F, 0F, 0F); // Box 71
		gunModel[1].setRotationPoint(19F, -16F, -12F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 22, 14, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[2].setRotationPoint(29F, -13F, -5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[3].setRotationPoint(29F, -13F, -6F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[4].setRotationPoint(33F, -4F, -6F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[5].setRotationPoint(34F, -8F, -5.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[6].setRotationPoint(34F, -11F, -5.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[7].setRotationPoint(34F, -10F, -5.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[8].setRotationPoint(40F, -10F, -5.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[9].setRotationPoint(29F, -12F, -5.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[10].setRotationPoint(29F, -10F, -5.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[11].setRotationPoint(29F, -8F, -5.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[12].setRotationPoint(29F, -6F, -5.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[13].setRotationPoint(35F, -6F, -6F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[14].setRotationPoint(39F, -6F, -6F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[15].setRotationPoint(43F, -6F, -6F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[16].setRotationPoint(36F, -14F, -4.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[17].setRotationPoint(25F, -14F, -4F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[18].setRotationPoint(25F, -14F, 2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		gunModel[19].setRotationPoint(29F, -13F, 5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[20].setRotationPoint(33F, -4F, 5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[21].setRotationPoint(34F, -8F, 4.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[22].setRotationPoint(34F, -11F, 4.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[23].setRotationPoint(34F, -10F, 4.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[24].setRotationPoint(40F, -10F, 4.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[25].setRotationPoint(29F, -12F, 4.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[26].setRotationPoint(29F, -10F, 4.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[27].setRotationPoint(29F, -8F, 4.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[28].setRotationPoint(29F, -6F, 4.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[29].setRotationPoint(35F, -6F, 4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[30].setRotationPoint(39F, -6F, 4F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[31].setRotationPoint(43F, -6F, 4F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 22, 10, 10, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F); // Box 102
		gunModel[32].setRotationPoint(51F, -11F, -5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 22, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[33].setRotationPoint(73F, -11F, -3F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 104
		gunModel[34].setRotationPoint(51F, -13F, -5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 22, 2, 10, 0F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F); // Box 105
		gunModel[35].setRotationPoint(51F, -1F, -5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 22, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[36].setRotationPoint(73F, -9F, -3F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 22, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 107
		gunModel[37].setRotationPoint(73F, -7F, -3F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[38].setRotationPoint(51F, -3F, -3F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		gunModel[39].setRotationPoint(51F, 1F, -3F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[40].setRotationPoint(51F, -1F, -3F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 26, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 118
		gunModel[41].setRotationPoint(25F, 1F, -5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[42].setRotationPoint(41F, -16F, -4.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[43].setRotationPoint(51F, -15.5F, -1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[44].setRotationPoint(51F, -14.5F, -2.5F);

		gunModel[45].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 122
		gunModel[45].setRotationPoint(57F, -14.5F, -2.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gunModel[46].setRotationPoint(51F, -14.5F, 1.5F);

		gunModel[47].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 124
		gunModel[47].setRotationPoint(57F, -14.5F, 1.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[48].setRotationPoint(65F, -15F, -0.5F);

		gunModel[49].addTrapezoid(0F, 0F, 0F, 6, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 126
		gunModel[49].setRotationPoint(71F, -15F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[50].setRotationPoint(49F, -16F, -15F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[51].setRotationPoint(49F, -21F, -15F);

		gunModel[52].addShapeBox(-2F, -5F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 129
		gunModel[52].setRotationPoint(51F, -21F, -9F);
		gunModel[52].rotateAngleZ = 0.78539816F;

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[53].setRotationPoint(49F, -16F, 5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[54].setRotationPoint(49F, -21F, 5F);

		gunModel[55].addShapeBox(-2F, -5F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[55].setRotationPoint(51F, -21F, 5F);
		gunModel[55].rotateAngleZ = 0.78539816F;

		gunModel[56].addShapeBox(-2F, -5F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 133
		gunModel[56].setRotationPoint(51F, -21F, -5F);
		gunModel[56].rotateAngleZ = 0.78539816F;

		gunModel[57].addShapeBox(-2F, 0F, 0F, 2, 12, 30, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 134
		gunModel[57].setRotationPoint(51F, 1F, -15F);
		gunModel[57].rotateAngleZ = -0.34906585F;


		ammoModel = new ModelRendererTurbo[66];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 135
		ammoModel[1] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 136
		ammoModel[2] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 137
		ammoModel[3] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 138
		ammoModel[4] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 139
		ammoModel[5] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 140
		ammoModel[6] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 141
		ammoModel[7] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 142
		ammoModel[8] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 143
		ammoModel[9] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 144
		ammoModel[10] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 145
		ammoModel[11] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 146
		ammoModel[12] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 147
		ammoModel[13] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 148
		ammoModel[14] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 149
		ammoModel[15] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 150
		ammoModel[16] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 151
		ammoModel[17] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 152
		ammoModel[18] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 153
		ammoModel[19] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 154
		ammoModel[20] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 155
		ammoModel[21] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 156
		ammoModel[22] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 157
		ammoModel[23] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 158
		ammoModel[24] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 159
		ammoModel[25] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 160
		ammoModel[26] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 161
		ammoModel[27] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 162
		ammoModel[28] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 163
		ammoModel[29] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 164
		ammoModel[30] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 165
		ammoModel[31] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 166
		ammoModel[32] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 167
		ammoModel[33] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 168
		ammoModel[34] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 169
		ammoModel[35] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 170
		ammoModel[36] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 171
		ammoModel[37] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 172
		ammoModel[38] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 173
		ammoModel[39] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 174
		ammoModel[40] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 175
		ammoModel[41] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 176
		ammoModel[42] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 177
		ammoModel[43] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 178
		ammoModel[44] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 179
		ammoModel[45] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 180
		ammoModel[46] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 181
		ammoModel[47] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 182
		ammoModel[48] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 183
		ammoModel[49] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 184
		ammoModel[50] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 185
		ammoModel[51] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 186
		ammoModel[52] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 187
		ammoModel[53] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 188
		ammoModel[54] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 189
		ammoModel[55] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 190
		ammoModel[56] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 191
		ammoModel[57] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 192
		ammoModel[58] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 193
		ammoModel[59] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 194
		ammoModel[60] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 195
		ammoModel[61] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 196
		ammoModel[62] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 197
		ammoModel[63] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 198
		ammoModel[64] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 199
		ammoModel[65] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 200

		ammoModel[0].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		ammoModel[0].setRotationPoint(28F, 3F, -2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		ammoModel[1].setRotationPoint(29F, 4F, -1.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		ammoModel[2].setRotationPoint(29F, 5F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		ammoModel[3].setRotationPoint(29F, 6F, -1.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F); // Box 139
		ammoModel[4].setRotationPoint(40F, 5F, -1.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F); // Box 140
		ammoModel[5].setRotationPoint(40F, 4F, -1.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F); // Box 141
		ammoModel[6].setRotationPoint(40F, 6F, -1.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		ammoModel[7].setRotationPoint(28F, 4F, -2F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		ammoModel[8].setRotationPoint(44F, 4F, -2F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		ammoModel[9].setRotationPoint(39F, 4F, -2F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		ammoModel[10].setRotationPoint(33F, 4F, -2F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		ammoModel[11].setRotationPoint(39F, 4F, 1F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		ammoModel[12].setRotationPoint(33F, 4F, 1F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		ammoModel[13].setRotationPoint(39F, 8F, 1F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		ammoModel[14].setRotationPoint(33F, 8F, 1F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		ammoModel[15].setRotationPoint(39F, 8F, -2F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		ammoModel[16].setRotationPoint(33F, 8F, -2F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		ammoModel[17].setRotationPoint(28F, 7F, -2F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		ammoModel[18].setRotationPoint(28F, 8F, -2F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		ammoModel[19].setRotationPoint(44F, 8F, -2F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		ammoModel[20].setRotationPoint(29F, 8F, -1.5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		ammoModel[21].setRotationPoint(29F, 9F, -1.5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 157
		ammoModel[22].setRotationPoint(29F, 10F, -1.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F); // Box 158
		ammoModel[23].setRotationPoint(40F, 8F, -1.5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F); // Box 159
		ammoModel[24].setRotationPoint(40F, 9F, -1.5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F); // Box 160
		ammoModel[25].setRotationPoint(40F, 10F, -1.5F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		ammoModel[26].setRotationPoint(39F, 12F, 1F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		ammoModel[27].setRotationPoint(33F, 12F, 1F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		ammoModel[28].setRotationPoint(39F, 12F, -2F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		ammoModel[29].setRotationPoint(33F, 12F, -2F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		ammoModel[30].setRotationPoint(28F, 11F, -2F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		ammoModel[31].setRotationPoint(28F, 12F, -2F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		ammoModel[32].setRotationPoint(44F, 12F, -2F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		ammoModel[33].setRotationPoint(29F, 12F, -1.5F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		ammoModel[34].setRotationPoint(29F, 13F, -1.5F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		ammoModel[35].setRotationPoint(29F, 14F, -1.5F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F); // Box 171
		ammoModel[36].setRotationPoint(40F, 12F, -1.5F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F); // Box 172
		ammoModel[37].setRotationPoint(40F, 13F, -1.5F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F); // Box 173
		ammoModel[38].setRotationPoint(40F, 14F, -1.5F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		ammoModel[39].setRotationPoint(39F, 16F, 1F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		ammoModel[40].setRotationPoint(33F, 16F, 1F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		ammoModel[41].setRotationPoint(39F, 16F, -2F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		ammoModel[42].setRotationPoint(33F, 16F, -2F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		ammoModel[43].setRotationPoint(28F, 15F, -2F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		ammoModel[44].setRotationPoint(28F, 16F, -2F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		ammoModel[45].setRotationPoint(44F, 16F, -2F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		ammoModel[46].setRotationPoint(29F, 16F, -1.5F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		ammoModel[47].setRotationPoint(29F, 17F, -1.5F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 183
		ammoModel[48].setRotationPoint(29F, 18F, -1.5F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F); // Box 184
		ammoModel[49].setRotationPoint(40F, 16F, -1.5F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F); // Box 185
		ammoModel[50].setRotationPoint(40F, 17F, -1.5F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F); // Box 186
		ammoModel[51].setRotationPoint(40F, 18F, -1.5F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		ammoModel[52].setRotationPoint(39F, 20F, 1F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		ammoModel[53].setRotationPoint(33F, 20F, 1F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		ammoModel[54].setRotationPoint(39F, 20F, -2F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		ammoModel[55].setRotationPoint(33F, 20F, -2F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		ammoModel[56].setRotationPoint(28F, 19F, -2F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		ammoModel[57].setRotationPoint(28F, 20F, -2F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		ammoModel[58].setRotationPoint(44F, 20F, -2F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		ammoModel[59].setRotationPoint(29F, 20F, -1.5F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		ammoModel[60].setRotationPoint(29F, 21F, -1.5F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 196
		ammoModel[61].setRotationPoint(29F, 22F, -1.5F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F); // Box 197
		ammoModel[62].setRotationPoint(40F, 20F, -1.5F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F); // Box 198
		ammoModel[63].setRotationPoint(40F, 21F, -1.5F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.3F, 0F, -1F, -1.3F, 0F, 0F, -1F); // Box 199
		ammoModel[64].setRotationPoint(40F, 22F, -1.5F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		ammoModel[65].setRotationPoint(28F, 23F, -2F);


		slideModel = new ModelRendererTurbo[7];
		slideModel[0] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 108
		slideModel[1] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 109
		slideModel[2] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 110
		slideModel[3] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 111
		slideModel[4] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 112
		slideModel[5] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 113
		slideModel[6] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 114

		slideModel[0].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		slideModel[0].setRotationPoint(95F, -8.5F, -1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		slideModel[1].setRotationPoint(95F, -9.5F, -1.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 110
		slideModel[2].setRotationPoint(95F, -7.5F, -1.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		slideModel[3].setRotationPoint(146F, -9F, -3F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		slideModel[4].setRotationPoint(146F, -9F, 1F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		slideModel[5].setRotationPoint(146F, -10F, -3F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 114
		slideModel[6].setRotationPoint(146F, -7F, -3F);



		gunSlideDistance = 0.6F;


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}