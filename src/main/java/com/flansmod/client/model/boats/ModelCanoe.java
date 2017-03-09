//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.01.2017 - 14:26:45
// Last changed on: 27.01.2017 - 14:26:45

package com.flansmod.client.model.boats; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCanoe extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCanoe() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[65];
		bodyModel[0] = new ModelRendererTurbo(this, 83, 119, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 50, 39, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 53, 34, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 3, 61, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 48, 61, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 103, 104, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 71, 113, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 109, 110, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 109, 114, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 71, 108, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 78, 103, textureX, textureY); // Box 155
		bodyModel[62] = new ModelRendererTurbo(this, 78, 103, textureX, textureY); // Box 156
		bodyModel[63] = new ModelRendererTurbo(this, 24, 34, textureX, textureY); // Box 157
		bodyModel[64] = new ModelRendererTurbo(this, 24, 34, textureX, textureY); // Box 158

		bodyModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 5F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 5F, 3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, 5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(0F, 1F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[4].setRotationPoint(0F, 1F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, -1F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, -2F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(0F, -1F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(0F, -2F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(15F, 5F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, 0F); // Box 10
		bodyModel[10].setRotationPoint(15F, 5F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 12
		bodyModel[11].setRotationPoint(15F, 1F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(15F, -1F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(15F, -2F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(15F, -2F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(15F, 5F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F); // Box 19
		bodyModel[16].setRotationPoint(15F, 1F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(15F, -1F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 21
		bodyModel[18].setRotationPoint(-27F, -2F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 22
		bodyModel[19].setRotationPoint(-27F, -1F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 23
		bodyModel[20].setRotationPoint(-27F, 1F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 24
		bodyModel[21].setRotationPoint(-27F, 5F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 25
		bodyModel[22].setRotationPoint(-27F, 5F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F); // Box 26
		bodyModel[23].setRotationPoint(-27F, 5F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 27
		bodyModel[24].setRotationPoint(-27F, 1F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 28
		bodyModel[25].setRotationPoint(-27F, -1F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 29
		bodyModel[26].setRotationPoint(-27F, -2F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(35F, -2F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(35F, -1F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F); // Box 33
		bodyModel[29].setRotationPoint(35F, 1F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(35F, 5F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(35F, -2F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(35F, -1F, 5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 37
		bodyModel[33].setRotationPoint(35F, 1F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -2F, 0F); // Box 38
		bodyModel[34].setRotationPoint(35F, 5F, 1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 39
		bodyModel[35].setRotationPoint(-31F, -2F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 40
		bodyModel[36].setRotationPoint(-31F, -1F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 41
		bodyModel[37].setRotationPoint(-31F, 1F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F); // Box 42
		bodyModel[38].setRotationPoint(-31F, 5F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 43
		bodyModel[39].setRotationPoint(-31F, 5F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 44
		bodyModel[40].setRotationPoint(-31F, 1F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 45
		bodyModel[41].setRotationPoint(-31F, -1F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 46
		bodyModel[42].setRotationPoint(-31F, -2F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(41F, -1F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(41F, -2F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(41F, -1F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(41F, -2F, 3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, -1F, 0F, 3F, 0F, 0F, 1F); // Box 52
		bodyModel[47].setRotationPoint(41F, 1F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -1F); // Box 53
		bodyModel[48].setRotationPoint(41F, 1F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F); // Box 54
		bodyModel[49].setRotationPoint(41F, 5F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 1F, 0F, 1F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(41F, 5F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 56
		bodyModel[51].setRotationPoint(35F, 5F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 57
		bodyModel[52].setRotationPoint(-37F, -2F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 58
		bodyModel[53].setRotationPoint(-37F, -2F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -4F); // Box 59
		bodyModel[54].setRotationPoint(-37F, 1F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 60
		bodyModel[55].setRotationPoint(-37F, -1F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 61
		bodyModel[56].setRotationPoint(-37F, -1F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 3F); // Box 62
		bodyModel[57].setRotationPoint(-37F, 1F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 63
		bodyModel[58].setRotationPoint(-35F, 5F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 1F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[59].setRotationPoint(-35F, 5F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 65
		bodyModel[60].setRotationPoint(-31F, 5F, -1F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 155
		bodyModel[61].setRotationPoint(0F, 1F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 156
		bodyModel[62].setRotationPoint(10F, 1F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 157
		bodyModel[63].setRotationPoint(-23F, 1F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 158
		bodyModel[64].setRotationPoint(27F, 1F, -6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}