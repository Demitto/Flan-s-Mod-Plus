//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.02.2017 - 21:59:25
// Last changed on: 24.02.2017 - 21:59:25

package com.flansmod.client.model.psf; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelValkyriefancy extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelValkyriefancy() //Same as Filename
	{
		
		valkyrie = new ModelRendererTurbo[33][];

		valkyrie[0] = new ModelRendererTurbo[7];
		valkyrie[0][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		valkyrie[0][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 225
		valkyrie[0][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 226
		valkyrie[0][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		valkyrie[0][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		valkyrie[0][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		valkyrie[0][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230

		valkyrie[0][0].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 223
		valkyrie[0][0].setRotationPoint(-38F, 0F, -27F);

		valkyrie[0][1].addShapeBox(0F, 0F, 0F, 21, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 225
		valkyrie[0][1].setRotationPoint(-33F, 0F, -28F);

		valkyrie[0][2].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		valkyrie[0][2].setRotationPoint(-12F, 0F, -35F);

		valkyrie[0][3].addShapeBox(0F, 0F, 0F, 35, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		valkyrie[0][3].setRotationPoint(-35F, 0F, -13F);

		valkyrie[0][4].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F); // Box 228
		valkyrie[0][4].setRotationPoint(-38F, 0F, 14F);

		valkyrie[0][5].addShapeBox(0F, 0F, 0F, 21, 1, 15, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 229
		valkyrie[0][5].setRotationPoint(-33F, 0F, 13F);

		valkyrie[0][6].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		valkyrie[0][6].setRotationPoint(-12F, 0F, 13F);
		
		valkyrie[1] = new ModelRendererTurbo[26];
		valkyrie[1][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201
		valkyrie[1][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202
		valkyrie[1][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		valkyrie[1][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		valkyrie[1][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		valkyrie[1][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		valkyrie[1][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		valkyrie[1][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		valkyrie[1][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		valkyrie[1][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		valkyrie[1][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 214
		valkyrie[1][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 217
		valkyrie[1][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 218
		valkyrie[1][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 219
		valkyrie[1][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 221
		valkyrie[1][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		valkyrie[1][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 225
		valkyrie[1][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 226
		valkyrie[1][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		valkyrie[1][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		valkyrie[1][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		valkyrie[1][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		valkyrie[1][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		valkyrie[1][23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 246
		valkyrie[1][24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		valkyrie[1][25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30

		valkyrie[1][0].addShapeBox(0F, 0F, 0F, 22, 5, 18, 0F, 0F, 0F, -3F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 201
		valkyrie[1][0].setRotationPoint(-31F, -13F, -9F);

		valkyrie[1][1].addShapeBox(0F, 0F, 0F, 22, 4, 12, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F); // Box 202
		valkyrie[1][1].setRotationPoint(-31F, -17F, -6F);

		valkyrie[1][2].addShapeBox(0F, 0F, 0F, 22, 10, 22, 0F, 0F, 0F, -2F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -1F); // Box 203
		valkyrie[1][2].setRotationPoint(-31F, -8F, -11F);

		valkyrie[1][3].addShapeBox(0F, 0F, 0F, 31, 10, 14, 0F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -9F, -5F, -3.7741F, -11F, 10F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -11F); // Box 204
		valkyrie[1][3].setRotationPoint(-40F, -10F, -12F);

		valkyrie[1][4].addShapeBox(0F, 0F, 0F, 40, 10, 4, 0F, -1.05F, -4.5F, -3F, 0F, 0.5F, 0F, -9F, 0F, 0F, 0F, -4.5F, 0.5F, 8.76F, 0F, -3F, 0F, 0F, 0F, -9F, 0F, 0F, 10F, 0F, 0.5F); // Box 205
		valkyrie[1][4].setRotationPoint(-40F, -10F, -16F);

		valkyrie[1][5].addShapeBox(0F, 0F, 0F, 40, 6, 12, 0F, -15F, -4.5F, 4.5F, 0F, -1.95F, 0F, 0F, 0.5F, 0F, -1.05F, -4.5F, 3F, -12.2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.63F, 0F, 3F); // Box 207
		valkyrie[1][5].setRotationPoint(-40F, -10F, -28F);

		valkyrie[1][6].addShapeBox(0F, 0F, 0F, 28, 7, 10, 0F, -4F, -2.5F, -4F, 0F, -2F, 0F, 0F, 0.05F, 0F, -3F, -2.5F, -4.5F, 2F, 1F, -2F, 0F, 1F, 6F, 0F, -3F, 0F, -0.2F, -3F, -3F); // Box 208
		valkyrie[1][6].setRotationPoint(-28F, -8F, -38F);

		valkyrie[1][7].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 3.3F, -3F, -4F, 0F, -3F, -7F, 0F, -3F, -13F, 0F, -3F, -5F, 1F, -1F, -4.5F, 0F, -1F, -8F, 0F, -3F, 3F, -2.2F, -3F, 0F); // Box 209
		valkyrie[1][7].setRotationPoint(-30F, -3F, -36F);

		valkyrie[1][8].addShapeBox(0F, 0F, 0F, 40, 2, 16, 0F, -9F, 0F, 2.5F, 0F, 0F, -1F, 0F, 0F, -3F, 5.16F, 0F, 0F, -6.7F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 8.76F, 0F, 0F); // Box 211
		valkyrie[1][8].setRotationPoint(-40F, -2F, -29F);

		valkyrie[1][9].addShapeBox(0F, 0F, 0F, 31, 10, 14, 0F, -5F, -3.7741F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 3F, 0F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 10F, 0F, -0.5F); // Box 213
		valkyrie[1][9].setRotationPoint(-40F, -10F, -2F);

		valkyrie[1][10].addShapeBox(0F, 0F, 0F, 40, 10, 4, 0F, 0F, -4.5F, 0.5F, -9F, 0F, 0F, 0F, 0.5F, 0F, -1.05F, -4.5F, -3F, 10F, 0F, 0.5F, -9F, 0F, 0F, 0F, 0F, 0F, 8.76F, 0F, -3F); // Box 214
		valkyrie[1][10].setRotationPoint(-40F, -10F, 12F);

		valkyrie[1][11].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 0F, -3F, -5F, 0F, -3F, -13F, 0F, -3F, -7F, 3.3F, -3F, -4F, -2.2F, -3F, 0F, 0F, -3F, 3F, 0F, -1F, -8F, 1F, -1F, -4.5F); // Box 217
		valkyrie[1][11].setRotationPoint(-30F, -3F, 31F);

		valkyrie[1][12].addShapeBox(0F, 0F, 0F, 40, 2, 16, 0F, 5.16F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -9F, 0F, 2.5F, 8.76F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -6.7F, 0F, 3F); // Box 218
		valkyrie[1][12].setRotationPoint(-40F, -2F, 13F);

		valkyrie[1][13].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 219
		valkyrie[1][13].setRotationPoint(-11F, -4F, 16F);

		valkyrie[1][14].addShapeBox(0F, 0F, 0F, 30, 6, 10, 0F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, 0F, 0F, 6.55F, 0F, 0F, -27F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -25F, 0F, 0F); // Box 221
		valkyrie[1][14].setRotationPoint(-30F, 0F, -38F);

		valkyrie[1][15].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 223
		valkyrie[1][15].setRotationPoint(-55F, 0F, -27F);

		valkyrie[1][16].addShapeBox(0F, 0F, 0F, 21, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 225
		valkyrie[1][16].setRotationPoint(-50F, 0F, -28F);

		valkyrie[1][17].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		valkyrie[1][17].setRotationPoint(-29F, 0F, -35F);

		valkyrie[1][18].addShapeBox(0F, 0F, 0F, 35, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		valkyrie[1][18].setRotationPoint(-52F, 0F, -13F);

		valkyrie[1][19].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F); // Box 228
		valkyrie[1][19].setRotationPoint(-55F, 0F, 14F);

		valkyrie[1][20].addShapeBox(0F, 0F, 0F, 21, 1, 15, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 229
		valkyrie[1][20].setRotationPoint(-50F, 0F, 13F);

		valkyrie[1][21].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		valkyrie[1][21].setRotationPoint(-29F, 0F, 13F);

		valkyrie[1][22].addShapeBox(0F, 0F, 0F, 40, 6, 12, 0F, -1.05F, -4.5F, 3F, 0F, 0.5F, 0F, 0F, -1.95F, 0F, -15F, -4.5F, 4.5F, 1.63F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -12.2F, 0F, 3F); // Box 245
		valkyrie[1][22].setRotationPoint(-40F, -10F, 16F);

		valkyrie[1][23].addShapeBox(0F, 0F, 0F, 28, 7, 10, 0F, -3F, -2.5F, -4.5F, 0F, 0.05F, 0F, 0F, -2F, 0F, -4F, -2.5F, -4F, -0.2F, -3F, -3F, 0F, -3F, 0F, 0F, 1F, 6F, 2F, 1F, -2F); // Box 246
		valkyrie[1][23].setRotationPoint(-28F, -8F, 28F);

		valkyrie[1][24].addShapeBox(0F, 0F, 0F, 30, 6, 10, 0F, 6.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -2F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -27F, 0F, -6F); // Box 370
		valkyrie[1][24].setRotationPoint(-30F, 0F, 28F);

		valkyrie[1][25].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 30
		valkyrie[1][25].setRotationPoint(-11F, -4F, -28F);
		
		valkyrie[2] = new ModelRendererTurbo[201];
		valkyrie[2][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		valkyrie[2][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		valkyrie[2][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		valkyrie[2][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		valkyrie[2][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		valkyrie[2][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		valkyrie[2][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		valkyrie[2][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		valkyrie[2][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		valkyrie[2][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		valkyrie[2][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		valkyrie[2][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		valkyrie[2][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		valkyrie[2][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		valkyrie[2][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		valkyrie[2][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		valkyrie[2][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		valkyrie[2][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		valkyrie[2][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		valkyrie[2][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		valkyrie[2][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		valkyrie[2][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		valkyrie[2][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		valkyrie[2][23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		valkyrie[2][24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		valkyrie[2][25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		valkyrie[2][26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		valkyrie[2][27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		valkyrie[2][28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		valkyrie[2][29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		valkyrie[2][30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		valkyrie[2][31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		valkyrie[2][32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		valkyrie[2][33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		valkyrie[2][34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		valkyrie[2][35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		valkyrie[2][36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		valkyrie[2][37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		valkyrie[2][38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		valkyrie[2][39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		valkyrie[2][40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		valkyrie[2][41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		valkyrie[2][42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		valkyrie[2][43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		valkyrie[2][44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		valkyrie[2][45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		valkyrie[2][46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		valkyrie[2][47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		valkyrie[2][48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		valkyrie[2][49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		valkyrie[2][50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		valkyrie[2][51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		valkyrie[2][52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		valkyrie[2][53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		valkyrie[2][54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		valkyrie[2][55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		valkyrie[2][56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		valkyrie[2][57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		valkyrie[2][58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		valkyrie[2][59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		valkyrie[2][60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		valkyrie[2][61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		valkyrie[2][62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		valkyrie[2][63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		valkyrie[2][64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		valkyrie[2][65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		valkyrie[2][66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		valkyrie[2][67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		valkyrie[2][68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		valkyrie[2][69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		valkyrie[2][70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		valkyrie[2][71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		valkyrie[2][72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		valkyrie[2][73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		valkyrie[2][74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		valkyrie[2][75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		valkyrie[2][76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		valkyrie[2][77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		valkyrie[2][78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		valkyrie[2][79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		valkyrie[2][80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135
		valkyrie[2][81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		valkyrie[2][82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		valkyrie[2][83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		valkyrie[2][84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		valkyrie[2][85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		valkyrie[2][86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		valkyrie[2][87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		valkyrie[2][88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		valkyrie[2][89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		valkyrie[2][90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		valkyrie[2][91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		valkyrie[2][92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		valkyrie[2][93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		valkyrie[2][94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		valkyrie[2][95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		valkyrie[2][96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		valkyrie[2][97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		valkyrie[2][98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 153
		valkyrie[2][99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		valkyrie[2][100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		valkyrie[2][101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 156
		valkyrie[2][102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		valkyrie[2][103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 158
		valkyrie[2][104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		valkyrie[2][105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		valkyrie[2][106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		valkyrie[2][107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		valkyrie[2][108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		valkyrie[2][109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		valkyrie[2][110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 165
		valkyrie[2][111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		valkyrie[2][112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		valkyrie[2][113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		valkyrie[2][114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		valkyrie[2][115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		valkyrie[2][116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		valkyrie[2][117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		valkyrie[2][118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		valkyrie[2][119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		valkyrie[2][120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		valkyrie[2][121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		valkyrie[2][122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		valkyrie[2][123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		valkyrie[2][124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		valkyrie[2][125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		valkyrie[2][126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181
		valkyrie[2][127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		valkyrie[2][128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		valkyrie[2][129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		valkyrie[2][130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		valkyrie[2][131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		valkyrie[2][132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		valkyrie[2][133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		valkyrie[2][134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		valkyrie[2][135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		valkyrie[2][136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		valkyrie[2][137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		valkyrie[2][138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		valkyrie[2][139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		valkyrie[2][140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		valkyrie[2][141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		valkyrie[2][142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		valkyrie[2][143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		valkyrie[2][144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		valkyrie[2][145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200
		valkyrie[2][146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201
		valkyrie[2][147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202
		valkyrie[2][148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		valkyrie[2][149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		valkyrie[2][150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		valkyrie[2][151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		valkyrie[2][152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		valkyrie[2][153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		valkyrie[2][154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		valkyrie[2][155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		valkyrie[2][156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		valkyrie[2][157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		valkyrie[2][158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		valkyrie[2][159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 214
		valkyrie[2][160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 215
		valkyrie[2][161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 217
		valkyrie[2][162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 218
		valkyrie[2][163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 220
		valkyrie[2][164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 221
		valkyrie[2][165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 222
		valkyrie[2][166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		valkyrie[2][167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 225
		valkyrie[2][168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 226
		valkyrie[2][169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 227
		valkyrie[2][170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 228
		valkyrie[2][171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 229
		valkyrie[2][172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 230
		valkyrie[2][173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 231
		valkyrie[2][174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		valkyrie[2][175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		valkyrie[2][176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		valkyrie[2][177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		valkyrie[2][178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		valkyrie[2][179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		valkyrie[2][180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		valkyrie[2][181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		valkyrie[2][182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 241
		valkyrie[2][183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		valkyrie[2][184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		valkyrie[2][185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		valkyrie[2][186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 245
		valkyrie[2][187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 246
		valkyrie[2][188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		valkyrie[2][189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		valkyrie[2][190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		valkyrie[2][191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		valkyrie[2][192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		valkyrie[2][193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		valkyrie[2][194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		valkyrie[2][195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		valkyrie[2][196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		valkyrie[2][197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		valkyrie[2][198] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		valkyrie[2][199] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200
		valkyrie[2][200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201

		valkyrie[2][0].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F, 0F, 1F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, -1F, 0F, 1F, -3F, 0F, -2F, 0.5F, 0F, -1F, 0.5F, 0F, -2F, -2.7F, 0F, -3F, -4F); // Box 9
		valkyrie[2][0].setRotationPoint(-108F, 10F, 0.5F);

		valkyrie[2][1].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F, 0F, 1.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -3F, 0F, 1.5F, -4.5F, 0F, -4F, 0.5F, 0F, -2F, 0.5F, 0F, -3F, -4F, 0F, -4.5F, -5.5F); // Box 11
		valkyrie[2][1].setRotationPoint(-114F, 10F, 0.5F);

		valkyrie[2][2].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F, 0F, 1F, -3F, 0F, 1.5F, -1F, 0F, 1.5F, 0.5F, 0F, 1F, 0.5F, 0F, -3F, -4F, 0F, -2F, -2.7F, 0F, -1F, 0.5F, 0F, -2F, 0.5F); // Box 13
		valkyrie[2][2].setRotationPoint(-108F, 10F, -7.5F);

		valkyrie[2][3].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F, 0F, 1.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 1.5F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1.5F, 0F, -2F, -2.7F); // Box 14
		valkyrie[2][3].setRotationPoint(-99F, 10F, 0.5F);

		valkyrie[2][4].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F, 0F, 1.5F, -1F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 1.5F, 0.5F, 0F, -2F, -2.7F, 0F, -1.5F, -1.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 15
		valkyrie[2][4].setRotationPoint(-99F, 10F, -7.5F);

		valkyrie[2][5].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, -1.5F, -3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -3.5F, -0.5F, -1.5F); // Box 27
		valkyrie[2][5].setRotationPoint(-119F, 8.5F, 0F);

		valkyrie[2][6].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -1F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -3.5F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, -3F, -0.5F, 0F); // Box 28
		valkyrie[2][6].setRotationPoint(-119F, 8.5F, -3F);

		valkyrie[2][7].addShapeBox(0F, 0F, 0F, 20, 4, 10, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0.5F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -3F, 0F, -1.5F, -4F); // Box 35
		valkyrie[2][7].setRotationPoint(-88F, 10F, 0F);

		valkyrie[2][8].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 3F, 1.5F, 0F, 3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -3F, 0F, -2F, -3F); // Box 47
		valkyrie[2][8].setRotationPoint(-68F, 10F, 0F);

		valkyrie[2][9].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F, 0F, 1.5F, -4.5F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 1.5F, 0.5F, 0F, -4.5F, -5.5F, 0F, -3F, -4F, 0F, -2F, 0.5F, 0F, -4F, 0.5F); // Box 50
		valkyrie[2][9].setRotationPoint(-114F, 10F, -7.5F);

		valkyrie[2][10].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -2F, -0.5F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0.5F, -1.5F); // Box 51
		valkyrie[2][10].setRotationPoint(-119F, 5.5F, 0F);

		valkyrie[2][11].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, -1.5F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0.5F, 0F); // Box 52
		valkyrie[2][11].setRotationPoint(-119F, 5.5F, -3F);

		valkyrie[2][12].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, -0.25F, -2.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -2F); // Box 53
		valkyrie[2][12].setRotationPoint(-119F, 3.5F, 0F);

		valkyrie[2][13].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, -4F, -0.25F, -2.2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, -0.5F, 0F, -1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 54
		valkyrie[2][13].setRotationPoint(-119F, 3.5F, -3F);

		valkyrie[2][14].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F); // Box 55
		valkyrie[2][14].setRotationPoint(-114F, 5.5F, -3F);

		valkyrie[2][15].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, -2F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F); // Box 56
		valkyrie[2][15].setRotationPoint(-114F, 3.5F, -3F);

		valkyrie[2][16].addShapeBox(0F, 0F, 0F, 20, 4, 10, 0F, 0F, 2F, -2F, 0F, 3F, 0.5F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -1.5F, -4F, 0F, -1F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 57
		valkyrie[2][16].setRotationPoint(-88F, 10F, -10F);

		valkyrie[2][17].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F, 0F, 3F, 0.5F, 0F, 3F, 1.5F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		valkyrie[2][17].setRotationPoint(-68F, 10F, -10F);

		valkyrie[2][18].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F, 0F, 0F, -1.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, -0.5F, -0.5F); // Box 59
		valkyrie[2][18].setRotationPoint(-108F, 4.5F, -5F);

		valkyrie[2][19].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F, 0F, -0.5F, -2.5F, 0F, 1.7F, -2F, 0F, 1.7F, -2F, 0F, -0.5F, -2.5F, 0F, 0F, -0.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -0.5F); // Box 60
		valkyrie[2][19].setRotationPoint(-108F, 1.5F, -4F);

		valkyrie[2][20].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -0.5F); // Box 61
		valkyrie[2][20].setRotationPoint(-99F, 3.5F, -7F);

		valkyrie[2][21].addShapeBox(0F, 0F, 0F, 11, 4, 12, 0F, 0F, -0.3F, -4F, 0F, 2.5F, -4F, 0F, 2.5F, -4F, 0F, -0.3F, -4F, 0F, 0F, -0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -0.5F); // Box 62
		valkyrie[2][21].setRotationPoint(-99F, -0.5F, -6F);

		valkyrie[2][22].addShapeBox(0F, 0F, 0F, 20, 6, 16, 0F, 0F, 0F, -1F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 2.5F, 0F, -1.5F, 2.5F, 0F, -0.5F, 0F); // Box 63
		valkyrie[2][22].setRotationPoint(-88F, 2.5F, -8F);

		valkyrie[2][23].addShapeBox(0F, 0F, 0F, 20, 6, 14, 0F, 0F, -0.5F, -5F, 0F, 3.5F, -4.5F, 0F, 3.5F, -4.5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F); // Box 64
		valkyrie[2][23].setRotationPoint(-88F, -3.5F, -7F);

		valkyrie[2][24].addShapeBox(0F, 0F, 0F, 12, 6, 22, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F); // Box 65
		valkyrie[2][24].setRotationPoint(-68F, 0F, -11F);

		valkyrie[2][25].addShapeBox(0F, 0F, 0F, 12, 7, 16, 0F, 0F, 0F, -5.5F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 66
		valkyrie[2][25].setRotationPoint(-68F, -7F, -8F);

		valkyrie[2][26].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 67
		valkyrie[2][26].setRotationPoint(-78.5F, 10F, 4F);

		valkyrie[2][27].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 68
		valkyrie[2][27].setRotationPoint(-78.5F, 8.5F, 8F);

		valkyrie[2][28].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 69
		valkyrie[2][28].setRotationPoint(-68.5F, 9.5F, 4F);

		valkyrie[2][29].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, -1.5F, 0F, -1.5F, 0F); // Box 70
		valkyrie[2][29].setRotationPoint(-68.5F, 8.5F, 8F);

		valkyrie[2][30].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F); // Box 71
		valkyrie[2][30].setRotationPoint(-83.5F, 10F, 4F);

		valkyrie[2][31].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 0F, 1F, 3F, 0F, 1F, 0F, 0F, -1F, -1F, 3F, -1F, -4F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 4F, -2.5F, -5F); // Box 72
		valkyrie[2][31].setRotationPoint(-83.5F, 8.5F, 8F);

		valkyrie[2][32].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		valkyrie[2][32].setRotationPoint(-78.5F, 10F, -8F);

		valkyrie[2][33].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 74
		valkyrie[2][33].setRotationPoint(-78.5F, 8.5F, -11F);

		valkyrie[2][34].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F); // Box 75
		valkyrie[2][34].setRotationPoint(-68.5F, 9.5F, -8F);

		valkyrie[2][35].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -2F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 76
		valkyrie[2][35].setRotationPoint(-68.5F, 8.5F, -11F);

		valkyrie[2][36].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 77
		valkyrie[2][36].setRotationPoint(-83.5F, 10F, -8F);

		valkyrie[2][37].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, 3F, -1F, -4F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 3F, 4F, -2.5F, -5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F); // Box 78
		valkyrie[2][37].setRotationPoint(-83.5F, 8.5F, -11F);

		valkyrie[2][38].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F, 0F, 0F, -2F, 0F, -4F, -5.5F, 0F, -4F, -1.5F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7.5F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 79
		valkyrie[2][38].setRotationPoint(-56F, -9F, 0F);

		valkyrie[2][39].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 86
		valkyrie[2][39].setRotationPoint(-42F, -5F, -8F);

		valkyrie[2][40].addShapeBox(0F, 0F, 0F, 2, 9, 4, 0F, 0F, 0F, 0F, 0F, -2F, 1.8F, 0F, -2F, 1.8F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 5F); // Box 87
		valkyrie[2][40].setRotationPoint(-56F, -9F, -2F);

		valkyrie[2][41].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F, 0F, -8.5F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -8.5F, -2F, 0F, 0F, 3F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, -2F); // Box 89
		valkyrie[2][41].setRotationPoint(-23F, -13F, -7F);

		valkyrie[2][42].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 90
		valkyrie[2][42].setRotationPoint(-56F, 0F, 7.5F);

		valkyrie[2][43].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 94
		valkyrie[2][43].setRotationPoint(-56F, 7F, 10.5F);

		valkyrie[2][44].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -1F, 4F, 0F, -1F, 4F); // Box 98
		valkyrie[2][44].setRotationPoint(-56F, 7F, -11.5F);

		valkyrie[2][45].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 2.5F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -1F, -4.5F, 0F, -2F, 4F, 0F, -1F, 4F); // Box 99
		valkyrie[2][45].setRotationPoint(-52F, 7F, -11.5F);

		valkyrie[2][46].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F, 0F, 1F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, 1.5F, 0F, 1F, 2.5F, 0F, -1F, -4.5F, 0F, -2F, -4.5F, 0F, -3F, 4F, 0F, -2F, 4F); // Box 100
		valkyrie[2][46].setRotationPoint(-42F, 7F, -11.5F);

		valkyrie[2][47].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F, 0F, 3F, 0.5F, 0F, 5F, -0.5F, 0F, 5F, 8.5F, 0F, 3F, 9.5F, 0F, -2F, -4.5F, -4F, -4F, -4.5F, -4F, -4F, 4.5F, 0F, -2F, 4.5F); // Box 101
		valkyrie[2][47].setRotationPoint(-23F, 7F, -11.5F);

		valkyrie[2][48].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 103
		valkyrie[2][48].setRotationPoint(-56F, 0F, -8.5F);

		valkyrie[2][49].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F, 0F, 0F, 1F, 0F, 1F, 1.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 3.5F, 0F, -1F, -0.5F, 0F, 0F, -3F); // Box 104
		valkyrie[2][49].setRotationPoint(-52F, 0F, -8.5F);

		valkyrie[2][50].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 105
		valkyrie[2][50].setRotationPoint(-42F, -1F, -9F);

		valkyrie[2][51].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, 0F, 0F, 1F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 106
		valkyrie[2][51].setRotationPoint(-23F, -3F, -9F);

		valkyrie[2][52].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 107
		valkyrie[2][52].setRotationPoint(-56F, 12F, 0F);

		valkyrie[2][53].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 108
		valkyrie[2][53].setRotationPoint(-52F, 12F, 0F);

		valkyrie[2][54].addShapeBox(0F, 0F, 0F, 19, 2, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 109
		valkyrie[2][54].setRotationPoint(-42F, 11F, 0F);

		valkyrie[2][55].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 110
		valkyrie[2][55].setRotationPoint(-23F, 10F, 0F);

		valkyrie[2][56].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 111
		valkyrie[2][56].setRotationPoint(-56F, 12F, -7F);

		valkyrie[2][57].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 112
		valkyrie[2][57].setRotationPoint(-52F, 12F, -7F);

		valkyrie[2][58].addShapeBox(0F, 0F, 0F, 19, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 113
		valkyrie[2][58].setRotationPoint(-42F, 11F, -7F);

		valkyrie[2][59].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F); // Box 114
		valkyrie[2][59].setRotationPoint(-23F, 10F, -7F);

		valkyrie[2][60].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F, 0F, 0F, -5F, 0F, -4F, -1.5F, 0F, -4F, -5.5F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -7.5F, 0F, 0F, -7F); // Box 115
		valkyrie[2][60].setRotationPoint(-56F, -9F, -8F);

		valkyrie[2][61].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, -1F, 3F, 0F, -1F, -1F, 0F, 0F, -1.5F); // Box 116
		valkyrie[2][61].setRotationPoint(-52F, -5F, -7F);

		valkyrie[2][62].addShapeBox(0F, 2F, -0.5F, 3, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 117
		valkyrie[2][62].setRotationPoint(-54F, 10.5F, -6F);
		valkyrie[2][62].rotateAngleX = -0.76794487F;

		valkyrie[2][63].addShapeBox(0F, 1.5F, -0.5F, 3, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 118
		valkyrie[2][63].setRotationPoint(-46F, 10.5F, -6F);
		valkyrie[2][63].rotateAngleX = -0.76794487F;

		valkyrie[2][64].addShapeBox(0F, 1.5F, -0.5F, 3, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 119
		valkyrie[2][64].setRotationPoint(-46F, 10.5F, 6F);
		valkyrie[2][64].rotateAngleX = 0.76794487F;

		valkyrie[2][65].addShapeBox(0F, 2F, -0.5F, 3, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 120
		valkyrie[2][65].setRotationPoint(-54F, 10.5F, 6F);
		valkyrie[2][65].rotateAngleX = 0.76794487F;

		valkyrie[2][66].addShapeBox(0F, 0F, 0F, 11, 7, 11, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, -4F, 0F, 0F, -4F); // Box 121
		valkyrie[2][66].setRotationPoint(-11F, 2F, 0F);

		valkyrie[2][67].addShapeBox(0F, 0F, 0F, 11, 7, 11, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 122
		valkyrie[2][67].setRotationPoint(-11F, 2F, -11F);

		valkyrie[2][68].addShapeBox(0F, 0F, 0F, 7, 10, 22, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 123
		valkyrie[2][68].setRotationPoint(-7F, -8F, -11F);

		valkyrie[2][69].addShapeBox(0F, 0F, 0F, 7, 5, 18, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		valkyrie[2][69].setRotationPoint(-7F, -13F, -9F);

		valkyrie[2][70].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		valkyrie[2][70].setRotationPoint(-7F, -17F, -6F);

		valkyrie[2][71].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		valkyrie[2][71].setRotationPoint(-7F, -17F, -6F);

		valkyrie[2][72].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F); // Box 127
		valkyrie[2][72].setRotationPoint(-10F, -14F, -2F);

		valkyrie[2][73].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		valkyrie[2][73].setRotationPoint(-10F, -14F, -4F);

		valkyrie[2][74].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		valkyrie[2][74].setRotationPoint(-10F, -16F, -4F);

		valkyrie[2][75].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		valkyrie[2][75].setRotationPoint(-10F, -16F, -2F);

		valkyrie[2][76].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		valkyrie[2][76].setRotationPoint(-10F, -14F, 0F);

		valkyrie[2][77].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F); // Box 132
		valkyrie[2][77].setRotationPoint(-10F, -14F, 2F);

		valkyrie[2][78].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		valkyrie[2][78].setRotationPoint(-10F, -16F, 2F);

		valkyrie[2][79].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -0.66F, -0.66F, 0F, -0.66F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		valkyrie[2][79].setRotationPoint(-10F, -16F, 0F);

		valkyrie[2][80].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		valkyrie[2][80].setRotationPoint(-8.5F, -16.5F, -1.5F);

		valkyrie[2][81].addShapeBox(0F, 0F, 0F, 11, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		valkyrie[2][81].setRotationPoint(-18F, -12.5F, -1F);

		valkyrie[2][82].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 137
		valkyrie[2][82].setRotationPoint(-20F, -12.5F, -1F);

		valkyrie[2][83].addShapeBox(0F, 0F, 0F, 11, 16, 10, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		valkyrie[2][83].setRotationPoint(-16F, -10.5F, -5F);

		valkyrie[2][84].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 139
		valkyrie[2][84].setRotationPoint(-17F, -10.5F, -5F);

		valkyrie[2][85].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		valkyrie[2][85].setRotationPoint(-24F, -11F, -4F);

		valkyrie[2][86].addShapeBox(0F, 0F, 0F, 3, 16, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		valkyrie[2][86].setRotationPoint(-24F, -10F, -4F);

		valkyrie[2][87].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F, 2F); // Box 142
		valkyrie[2][87].setRotationPoint(-42F, -5F, 7F);

		valkyrie[2][88].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F, 0F, -8.5F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -8.5F, 2F, 0F, 0F, -2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 3F); // Box 143
		valkyrie[2][88].setRotationPoint(-23F, -13F, 6F);

		valkyrie[2][89].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 2.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -2F, 4F, 0F, -1F, -4.5F, 0F, 0F, -4.5F); // Box 144
		valkyrie[2][89].setRotationPoint(-52F, 7F, 10.5F);

		valkyrie[2][90].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F, 0F, 1F, 2.5F, 0F, 3F, 1.5F, 0F, 3F, 0.5F, 0F, 1F, 0.5F, 0F, -2F, 4F, 0F, -3F, 4F, 0F, -2F, -4.5F, 0F, -1F, -4.5F); // Box 145
		valkyrie[2][90].setRotationPoint(-42F, 7F, 10.5F);

		valkyrie[2][91].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 1.5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -1F, -0.5F, 0F, -1F, 3.5F, 0F, 0F, 3F); // Box 146
		valkyrie[2][91].setRotationPoint(-52F, 0F, 7.5F);

		valkyrie[2][92].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 3F, 0F, 0F, 3F); // Box 147
		valkyrie[2][92].setRotationPoint(-42F, -1F, 8F);

		valkyrie[2][93].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 3F); // Box 148
		valkyrie[2][93].setRotationPoint(-23F, -3F, 8F);

		valkyrie[2][94].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, 3F, 0F, 0F, 2.5F); // Box 149
		valkyrie[2][94].setRotationPoint(-52F, -5F, 6F);

		valkyrie[2][95].addTrapezoid(0F, 0F, 0F, 2, 12, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 150
		valkyrie[2][95].setRotationPoint(-26F, -8F, -4F);

		valkyrie[2][96].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 151
		valkyrie[2][96].setRotationPoint(-24F, -8F, -5F);

		valkyrie[2][97].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 152
		valkyrie[2][97].setRotationPoint(-24F, -8F, 4F);

		valkyrie[2][98].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		valkyrie[2][98].setRotationPoint(-24F, -15F, -3F);

		valkyrie[2][99].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 154
		valkyrie[2][99].setRotationPoint(-24F, -12F, -3F);

		valkyrie[2][100].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		valkyrie[2][100].setRotationPoint(-24F, -16F, -3F);

		valkyrie[2][101].addShapeBox(0F, 0F, 0F, 16, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 156
		valkyrie[2][101].setRotationPoint(-37F, 6F, -4F);

		valkyrie[2][102].addTrapezoid(0F, 0F, 0F, 4, 1, 3, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 157
		valkyrie[2][102].setRotationPoint(-37F, 5F, -3.5F);

		valkyrie[2][103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 158
		valkyrie[2][103].setRotationPoint(-38F, 5F, -3.5F);

		valkyrie[2][104].addTrapezoid(0F, 0F, 0F, 4, 1, 3, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 159
		valkyrie[2][104].setRotationPoint(-37F, 5F, 0.5F);

		valkyrie[2][105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 160
		valkyrie[2][105].setRotationPoint(-38F, 5F, 0.5F);

		valkyrie[2][106].addTrapezoid(0F, 0F, 0F, 9, 1, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 161
		valkyrie[2][106].setRotationPoint(-33F, 5F, -3.5F);

		valkyrie[2][107].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 162
		valkyrie[2][107].setRotationPoint(-38F, 4F, 4F);

		valkyrie[2][108].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 163
		valkyrie[2][108].setRotationPoint(-38F, 4F, -5F);

		valkyrie[2][109].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F); // Box 164
		valkyrie[2][109].setRotationPoint(-35F, -3.7F, -9F);

		valkyrie[2][110].addShapeBox(0F, -0.2F, 2F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 165
		valkyrie[2][110].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][110].rotateAngleX = -0.55850536F;
		valkyrie[2][110].rotateAngleY = -0.05235988F;

		valkyrie[2][111].addShapeBox(0F, -0.2F, 2.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 166
		valkyrie[2][111].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][111].rotateAngleX = -0.55850536F;
		valkyrie[2][111].rotateAngleY = -0.05235988F;

		valkyrie[2][112].addShapeBox(0F, -0.2F, 3F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 167
		valkyrie[2][112].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][112].rotateAngleX = -0.55850536F;
		valkyrie[2][112].rotateAngleY = -0.05235988F;

		valkyrie[2][113].addShapeBox(0.5F, -0.2F, 1.5F, 1, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 168
		valkyrie[2][113].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][113].rotateAngleX = -0.55850536F;
		valkyrie[2][113].rotateAngleY = -0.05235988F;

		valkyrie[2][114].addShapeBox(1.2F, -0.2F, 1.5F, 1, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 169
		valkyrie[2][114].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][114].rotateAngleX = -0.55850536F;
		valkyrie[2][114].rotateAngleY = -0.05235988F;

		valkyrie[2][115].addShapeBox(1.8F, -0.2F, 1.7F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 170
		valkyrie[2][115].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][115].rotateAngleX = -0.55850536F;
		valkyrie[2][115].rotateAngleY = -0.05235988F;

		valkyrie[2][116].addShapeBox(2.4F, -0.2F, 1.7F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 171
		valkyrie[2][116].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][116].rotateAngleX = -0.55850536F;
		valkyrie[2][116].rotateAngleY = -0.05235988F;

		valkyrie[2][117].addShapeBox(2.4F, -0.2F, 2.5F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 172
		valkyrie[2][117].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][117].rotateAngleX = -0.55850536F;
		valkyrie[2][117].rotateAngleY = -0.05235988F;

		valkyrie[2][118].addShapeBox(1.8F, -0.2F, 2.5F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 173
		valkyrie[2][118].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][118].rotateAngleX = -0.55850536F;
		valkyrie[2][118].rotateAngleY = -0.05235988F;

		valkyrie[2][119].addShapeBox(4F, -0.2F, 2F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		valkyrie[2][119].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][119].rotateAngleX = -0.55850536F;
		valkyrie[2][119].rotateAngleY = -0.05235988F;

		valkyrie[2][120].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		valkyrie[2][120].setRotationPoint(-35F, -3.7F, 6F);

		valkyrie[2][121].addShapeBox(2.5F, -0.2F, -3F, 1, 1, 1, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 176
		valkyrie[2][121].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][121].rotateAngleX = 0.55850536F;
		valkyrie[2][121].rotateAngleY = 0.05235988F;

		valkyrie[2][122].addShapeBox(2.5F, -0.2F, -3.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 177
		valkyrie[2][122].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][122].rotateAngleX = 0.55850536F;
		valkyrie[2][122].rotateAngleY = 0.05235988F;

		valkyrie[2][123].addShapeBox(2.5F, -0.2F, -4F, 1, 1, 1, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 178
		valkyrie[2][123].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][123].rotateAngleX = 0.55850536F;
		valkyrie[2][123].rotateAngleY = 0.05235988F;

		valkyrie[2][124].addShapeBox(3.5F, -0.2F, -3F, 3, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
		valkyrie[2][124].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][124].rotateAngleX = 0.55850536F;
		valkyrie[2][124].rotateAngleY = 0.05235988F;

		valkyrie[2][125].addShapeBox(3.5F, -0.2F, -4F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 180
		valkyrie[2][125].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][125].rotateAngleX = 0.55850536F;
		valkyrie[2][125].rotateAngleY = 0.05235988F;

		valkyrie[2][126].addShapeBox(4.5F, -0.2F, -4F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 181
		valkyrie[2][126].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][126].rotateAngleX = 0.55850536F;
		valkyrie[2][126].rotateAngleY = 0.05235988F;

		valkyrie[2][127].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, -0.5F, -1.8F, 0F, -0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 182
		valkyrie[2][127].setRotationPoint(-41F, -3.7F, -9F);

		valkyrie[2][128].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, -2F, 1.2F, 0F, -2F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1.8F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		valkyrie[2][128].setRotationPoint(-41F, -3.7F, 6F);

		valkyrie[2][129].addShapeBox(-2F, -0.2F, 2F, 2, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 184
		valkyrie[2][129].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][129].rotateAngleX = -0.55850536F;
		valkyrie[2][129].rotateAngleY = -0.13962634F;

		valkyrie[2][130].addShapeBox(-5F, -0.2F, 1.5F, 3, 1, 1, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 185
		valkyrie[2][130].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][130].rotateAngleX = -0.55850536F;
		valkyrie[2][130].rotateAngleY = -0.13962634F;

		valkyrie[2][131].addShapeBox(-4F, -0.2F, 2.5F, 2, 1, 1, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 186
		valkyrie[2][131].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][131].rotateAngleX = -0.55850536F;
		valkyrie[2][131].rotateAngleY = -0.13962634F;

		valkyrie[2][132].addShapeBox(-4.7F, -0.2F, 2.1F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 187
		valkyrie[2][132].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][132].rotateAngleX = -0.55850536F;
		valkyrie[2][132].rotateAngleY = -0.13962634F;

		valkyrie[2][133].addShapeBox(-4.7F, -0.2F, 2.6F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 188
		valkyrie[2][133].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][133].rotateAngleX = -0.55850536F;
		valkyrie[2][133].rotateAngleY = -0.13962634F;

		valkyrie[2][134].addShapeBox(-4.7F, -0.2F, 3.1F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 189
		valkyrie[2][134].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][134].rotateAngleX = -0.55850536F;
		valkyrie[2][134].rotateAngleY = -0.13962634F;

		valkyrie[2][135].addShapeBox(-5.7F, -0.2F, 3.1F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 190
		valkyrie[2][135].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][135].rotateAngleX = -0.55850536F;
		valkyrie[2][135].rotateAngleY = -0.13962634F;

		valkyrie[2][136].addShapeBox(-5.7F, -0.2F, 2.1F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 191
		valkyrie[2][136].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][136].rotateAngleX = -0.55850536F;
		valkyrie[2][136].rotateAngleY = -0.13962634F;

		valkyrie[2][137].addShapeBox(-5.7F, -0.2F, 2.6F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 192
		valkyrie[2][137].setRotationPoint(-35F, -4F, -9F);
		valkyrie[2][137].rotateAngleX = -0.55850536F;
		valkyrie[2][137].rotateAngleY = -0.13962634F;

		valkyrie[2][138].addShapeBox(-2F, -0.2F, -4F, 2, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 193
		valkyrie[2][138].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][138].rotateAngleX = 0.55850536F;
		valkyrie[2][138].rotateAngleY = 0.13962634F;

		valkyrie[2][139].addShapeBox(0F, -0.2F, -4F, 2, 1, 2, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 194
		valkyrie[2][139].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][139].rotateAngleX = 0.55850536F;
		valkyrie[2][139].rotateAngleY = 0.13962634F;

		valkyrie[2][140].addShapeBox(-0.5F, -0.2F, -4F, 1, 1, 2, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 195
		valkyrie[2][140].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][140].rotateAngleX = 0.55850536F;
		valkyrie[2][140].rotateAngleY = 0.13962634F;

		valkyrie[2][141].addShapeBox(-0.5F, -1.2F, -4F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 196
		valkyrie[2][141].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][141].rotateAngleX = 0.55850536F;
		valkyrie[2][141].rotateAngleY = 0.13962634F;

		valkyrie[2][142].addShapeBox(-0.5F, -1.2F, -3F, 1, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 197
		valkyrie[2][142].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][142].rotateAngleX = 0.55850536F;
		valkyrie[2][142].rotateAngleY = 0.13962634F;

		valkyrie[2][143].addShapeBox(-2.8F, -0.2F, -2.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 198
		valkyrie[2][143].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][143].rotateAngleX = 0.55850536F;
		valkyrie[2][143].rotateAngleY = 0.13962634F;

		valkyrie[2][144].addShapeBox(-2.8F, -0.2F, -3.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 199
		valkyrie[2][144].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][144].rotateAngleX = 0.55850536F;
		valkyrie[2][144].rotateAngleY = 0.13962634F;

		valkyrie[2][145].addShapeBox(-3.5F, -0.2F, -3.7F, 1, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 200
		valkyrie[2][145].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][145].rotateAngleX = 0.55850536F;
		valkyrie[2][145].rotateAngleY = 0.13962634F;

		valkyrie[2][146].addShapeBox(-4.2F, -0.2F, -3.7F, 1, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 201
		valkyrie[2][146].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][146].rotateAngleX = 0.55850536F;
		valkyrie[2][146].rotateAngleY = 0.13962634F;

		valkyrie[2][147].addShapeBox(-4.9F, -0.2F, -2.3F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 202
		valkyrie[2][147].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][147].rotateAngleX = 0.55850536F;
		valkyrie[2][147].rotateAngleY = 0.13962634F;

		valkyrie[2][148].addShapeBox(-4.9F, -0.2F, -2.9F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 203
		valkyrie[2][148].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][148].rotateAngleX = 0.55850536F;
		valkyrie[2][148].rotateAngleY = 0.13962634F;

		valkyrie[2][149].addShapeBox(-4.9F, -0.2F, -3.7F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 204
		valkyrie[2][149].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][149].rotateAngleX = 0.55850536F;
		valkyrie[2][149].rotateAngleY = 0.13962634F;

		valkyrie[2][150].addShapeBox(-6.5F, -0.1F, -3.5F, 2, 1, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 205
		valkyrie[2][150].setRotationPoint(-35F, -4F, 9F);
		valkyrie[2][150].rotateAngleX = 0.55850536F;
		valkyrie[2][150].rotateAngleY = 0.13962634F;

		valkyrie[2][151].addShapeBox(0F, 0F, 0F, 14, 15, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		valkyrie[2][151].setRotationPoint(-56F, -2.7F, -1.5F);

		valkyrie[2][152].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		valkyrie[2][152].setRotationPoint(-42F, -2.7F, -1.5F);

		valkyrie[2][153].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		valkyrie[2][153].setRotationPoint(-41F, -2.7F, -0.5F);
		valkyrie[2][153].rotateAngleZ = -0.45378561F;

		valkyrie[2][154].addShapeBox(0F, -1F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		valkyrie[2][154].setRotationPoint(-41F, -2.7F, -0.5F);
		valkyrie[2][154].rotateAngleZ = -0.45378561F;

		valkyrie[2][155].addShapeBox(1F, -2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		valkyrie[2][155].setRotationPoint(-41F, -2.7F, -0.5F);
		valkyrie[2][155].rotateAngleZ = -0.45378561F;

		valkyrie[2][156].addShapeBox(1F, -4F, 0F, 1, 2, 1, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		valkyrie[2][156].setRotationPoint(-41F, -2.7F, -0.5F);
		valkyrie[2][156].rotateAngleZ = -0.45378561F;

		valkyrie[2][157].addShapeBox(1F, -4F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 212
		valkyrie[2][157].setRotationPoint(-41F, -2.7F, -0.5F);
		valkyrie[2][157].rotateAngleZ = -0.45378561F;

		valkyrie[2][158].addShapeBox(0F, -0.5F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -1.1F, 0.5F, 0F, -1.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -1.1F, 0.5F, 0F, -1.1F, 0F, 0F, -0.2F); // Box 213
		valkyrie[2][158].setRotationPoint(-41F, -2.7F, -1.5F);
		valkyrie[2][158].rotateAngleZ = -0.66322512F;

		valkyrie[2][159].addShapeBox(0F, 0F, 0F, 13, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 214
		valkyrie[2][159].setRotationPoint(-55F, -6F, -4F);

		valkyrie[2][160].addShapeBox(0F, 0F, 0F, 13, 2, 8, 0F, 0F, -1F, -2F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		valkyrie[2][160].setRotationPoint(-55F, -8F, -4F);

		valkyrie[2][161].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 217
		valkyrie[2][161].setRotationPoint(-42.8F, -8.5F, -1F);

		valkyrie[2][162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 218
		valkyrie[2][162].setRotationPoint(-42.8F, -8.5F, -3.5F);

		valkyrie[2][163].addShapeBox(0F, 0.5F, 0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 220
		valkyrie[2][163].setRotationPoint(-42.3F, -9F, 2.5F);
		valkyrie[2][163].rotateAngleX = 0.43633231F;

		valkyrie[2][164].addShapeBox(0F, 0.5F, -1.5F, 1, 3, 1, 0F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 221
		valkyrie[2][164].setRotationPoint(-42.3F, -9F, -2.5F);
		valkyrie[2][164].rotateAngleX = -0.43633231F;

		valkyrie[2][165].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
		valkyrie[2][165].setRotationPoint(-55.5F, -5F, -6.5F);

		valkyrie[2][166].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		valkyrie[2][166].setRotationPoint(-55.5F, -5F, -4F);

		valkyrie[2][167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 225
		valkyrie[2][167].setRotationPoint(-41.5F, -5F, -6.5F);

		valkyrie[2][168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226
		valkyrie[2][168].setRotationPoint(-41.5F, -5F, -3F);

		valkyrie[2][169].addShapeBox(0.5F, 0F, 0F, 1, 2, 1, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 227
		valkyrie[2][169].setRotationPoint(-41.5F, -5F, -3F);

		valkyrie[2][170].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		valkyrie[2][170].setRotationPoint(-55.5F, -5F, 3.5F);

		valkyrie[2][171].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		valkyrie[2][171].setRotationPoint(-55.5F, -5F, 3F);

		valkyrie[2][172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 230
		valkyrie[2][172].setRotationPoint(-41.5F, -5F, 4.5F);

		valkyrie[2][173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 231
		valkyrie[2][173].setRotationPoint(-41.5F, -5F, 2F);

		valkyrie[2][174].addShapeBox(0.5F, 0F, 0F, 1, 2, 1, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 232
		valkyrie[2][174].setRotationPoint(-41.5F, -5F, 2F);

		valkyrie[2][175].addShapeBox(0F, -0.3F, -2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		valkyrie[2][175].setRotationPoint(-43.5F, -6F, -4F);
		valkyrie[2][175].rotateAngleX = 0.26179939F;

		valkyrie[2][176].addShapeBox(0F, -0.3F, 1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		valkyrie[2][176].setRotationPoint(-43.5F, -6F, 4F);
		valkyrie[2][176].rotateAngleX = -0.26179939F;

		valkyrie[2][177].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 3F, 0F, 0.2F, -3.5F, 0F, 0.2F, -3.5F, 0F, 0.2F, 3F, 0F, 0.2F); // Box 235
		valkyrie[2][177].setRotationPoint(-42.5F, -11.5F, -1F);

		valkyrie[2][178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		valkyrie[2][178].setRotationPoint(-45F, -9.5F, -2F);

		valkyrie[2][179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 237
		valkyrie[2][179].setRotationPoint(-45F, -9.5F, 1F);

		valkyrie[2][180].addShapeBox(0F, 0.5F, 0.5F, 1, 3, 1, 0F, 0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 239
		valkyrie[2][180].setRotationPoint(-42.3F, -9F, 2.5F);
		valkyrie[2][180].rotateAngleX = 0.43633231F;

		valkyrie[2][181].addShapeBox(0F, 0.5F, 0.8F, 1, 3, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 240
		valkyrie[2][181].setRotationPoint(-42.3F, -9F, 2.5F);
		valkyrie[2][181].rotateAngleX = 0.43633231F;

		valkyrie[2][182].addShapeBox(0F, 0.5F, -1.5F, 1, 3, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 241
		valkyrie[2][182].setRotationPoint(-42.3F, -9F, -2.5F);
		valkyrie[2][182].rotateAngleX = -0.43633231F;

		valkyrie[2][183].addShapeBox(0F, 0.5F, -1.8F, 1, 3, 1, 0F, 0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 242
		valkyrie[2][183].setRotationPoint(-42.3F, -9F, -2.5F);
		valkyrie[2][183].rotateAngleX = -0.43633231F;

		valkyrie[2][184].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		valkyrie[2][184].setRotationPoint(-42.8F, -8.5F, -2.5F);

		valkyrie[2][185].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 244
		valkyrie[2][185].setRotationPoint(-42.8F, -8.5F, 2.5F);

		valkyrie[2][186].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 245
		valkyrie[2][186].setRotationPoint(-42.8F, -8.5F, 1.5F);

		valkyrie[2][187].addShapeBox(0F, 0.5F, -1.5F, 1, 1, 2, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 246
		valkyrie[2][187].setRotationPoint(-43F, -9F, -2.5F);
		valkyrie[2][187].rotateAngleX = -0.43633231F;

		valkyrie[2][188].addShapeBox(0F, 2.5F, -1.5F, 1, 1, 2, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 247
		valkyrie[2][188].setRotationPoint(-43F, -9F, -2.5F);
		valkyrie[2][188].rotateAngleX = -0.43633231F;

		valkyrie[2][189].addShapeBox(0F, 2.5F, -0.5F, 1, 1, 2, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 250
		valkyrie[2][189].setRotationPoint(-43F, -9F, 2.5F);
		valkyrie[2][189].rotateAngleX = 0.43633231F;

		valkyrie[2][190].addShapeBox(0F, 0.5F, -0.5F, 1, 1, 2, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 251
		valkyrie[2][190].setRotationPoint(-43F, -9F, 2.5F);
		valkyrie[2][190].rotateAngleX = 0.43633231F;

		valkyrie[2][191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 191
		valkyrie[2][191].setRotationPoint(-41.7F, -5F, -6.5F);

		valkyrie[2][192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 192
		valkyrie[2][192].setRotationPoint(-41.7F, -4F, -6.5F);

		valkyrie[2][193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 193
		valkyrie[2][193].setRotationPoint(-41.7F, -4F, -5.5F);

		valkyrie[2][194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 194
		valkyrie[2][194].setRotationPoint(-41.7F, -5F, -5.5F);

		valkyrie[2][195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 196
		valkyrie[2][195].setRotationPoint(-41.7F, -5F, -3.5F);

		valkyrie[2][196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 197
		valkyrie[2][196].setRotationPoint(-41.7F, -5F, 2.5F);

		valkyrie[2][197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 198
		valkyrie[2][197].setRotationPoint(-41.7F, -5F, 4.5F);

		valkyrie[2][198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		valkyrie[2][198].setRotationPoint(-42.5F, -9F, -2F);

		valkyrie[2][199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		valkyrie[2][199].setRotationPoint(-42.5F, -9F, 1F);

		valkyrie[2][200].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 3F, 0F, 0.2F, -3.5F, 0F, 0.2F, -3.5F, 0F, 0.2F, 3F, 0F, 0.2F); // Box 201
		valkyrie[2][200].setRotationPoint(-41.5F, -11.5F, -1F);

		valkyrie[3] = new ModelRendererTurbo[18];
		valkyrie[3][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 296
		valkyrie[3][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 297
		valkyrie[3][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 298
		valkyrie[3][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 299
		valkyrie[3][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 300
		valkyrie[3][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 301
		valkyrie[3][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 302
		valkyrie[3][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 303
		valkyrie[3][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 304
		valkyrie[3][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 305
		valkyrie[3][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 321
		valkyrie[3][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 322
		valkyrie[3][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 323
		valkyrie[3][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 324
		valkyrie[3][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 326
		valkyrie[3][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 327
		valkyrie[3][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 328
		valkyrie[3][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 329

		valkyrie[3][0].addShapeBox(0F, 0F, 0F, 9, 20, 16, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		valkyrie[3][0].setRotationPoint(0F, -8F, -16F);

		valkyrie[3][1].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 297
		valkyrie[3][1].setRotationPoint(-4F, -8F, -16F);

		valkyrie[3][2].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -13.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 2F); // Box 298
		valkyrie[3][2].setRotationPoint(-31F, -8.5F, -16F);

		valkyrie[3][3].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 299
		valkyrie[3][3].setRotationPoint(-4F, -8F, -1F);

		valkyrie[3][4].addShapeBox(0F, 0F, 0F, 31, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F); // Box 300
		valkyrie[3][4].setRotationPoint(-35F, -8.5F, -1F);

		valkyrie[3][5].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F, 0F, 0F, -0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 3.5F, 0F, 0F); // Box 301
		valkyrie[3][5].setRotationPoint(-28F, -8.5F, -14F);

		valkyrie[3][6].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3.5F, 0F, 0F, 4F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.25F, -3.5F, 0F, 0F, 4F, -1.5F, 0F); // Box 302
		valkyrie[3][6].setRotationPoint(-31F, -8.5F, -13F);

		valkyrie[3][7].addShapeBox(0F, 0F, 0F, 6, 19, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		valkyrie[3][7].setRotationPoint(9F, -8F, -15.5F);

		valkyrie[3][8].addShapeBox(0F, 0F, 0F, 5, 19, 15, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 304
		valkyrie[3][8].setRotationPoint(15F, -8F, -15.5F);

		valkyrie[3][9].addShapeBox(0F, 0F, 0F, 3, 15, 15, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 305
		valkyrie[3][9].setRotationPoint(20F, -6F, -15.5F);

		valkyrie[3][10].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 321
		valkyrie[3][10].setRotationPoint(0F, -3.5F, -18F);

		valkyrie[3][11].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 322
		valkyrie[3][11].setRotationPoint(0F, 0.5F, -18F);

		valkyrie[3][12].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 323
		valkyrie[3][12].setRotationPoint(9F, -3.5F, -18F);

		valkyrie[3][13].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 324
		valkyrie[3][13].setRotationPoint(9F, 0.5F, -18F);

		valkyrie[3][14].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, -3F, -2F, -1.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 326
		valkyrie[3][14].setRotationPoint(0F, -3.5F, -21F);

		valkyrie[3][15].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, -2F, -1.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 327
		valkyrie[3][15].setRotationPoint(0F, 0.5F, -21F);

		valkyrie[3][16].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -3F, -2F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 328
		valkyrie[3][16].setRotationPoint(9F, 0.5F, -21F);

		valkyrie[3][17].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, -1F, -0.5F, -3F, -2F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 329
		valkyrie[3][17].setRotationPoint(9F, -3.5F, -21F);
		
		valkyrie[4] = new ModelRendererTurbo[6];
		valkyrie[4][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 330
		valkyrie[4][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 331
		valkyrie[4][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 332
		valkyrie[4][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 333
		valkyrie[4][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 335
		valkyrie[4][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 336

		valkyrie[4][0].addBox(0F, 0F, 0F, 13, 20, 16, 0F); // Box 330
		valkyrie[4][0].setRotationPoint(-6F, -10F, -8F);

		valkyrie[4][1].addShapeBox(0F, 0F, 0F, 10, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 331
		valkyrie[4][1].setRotationPoint(7F, 0F, -8F);

		valkyrie[4][2].addShapeBox(0F, 0F, 0F, 10, 10, 16, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		valkyrie[4][2].setRotationPoint(7F, -10F, -8F);

		valkyrie[4][3].addBox(0F, 0F, 0F, 19, 18, 12, 0F); // Box 333
		valkyrie[4][3].setRotationPoint(9F, -8.5F, -6F);

		valkyrie[4][4].addShapeBox(0F, 0F, 0F, 8, 18, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 335
		valkyrie[4][4].setRotationPoint(28F, -8.5F, -6F);

		valkyrie[4][5].addShapeBox(0F, 0F, 0F, 4, 14, 12, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 336
		valkyrie[4][5].setRotationPoint(36F, -6.5F, -6F);
		
		valkyrie[5] = new ModelRendererTurbo[23];
		valkyrie[5][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 339
		valkyrie[5][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 340
		valkyrie[5][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 341
		valkyrie[5][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 342
		valkyrie[5][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 343
		valkyrie[5][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 344
		valkyrie[5][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 345
		valkyrie[5][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 346
		valkyrie[5][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 347
		valkyrie[5][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 348
		valkyrie[5][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 349
		valkyrie[5][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 350
		valkyrie[5][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 351
		valkyrie[5][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 352
		valkyrie[5][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 353
		valkyrie[5][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 354
		valkyrie[5][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 355
		valkyrie[5][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 356
		valkyrie[5][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 358
		valkyrie[5][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 359
		valkyrie[5][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 360
		valkyrie[5][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 361
		valkyrie[5][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 407

		valkyrie[5][0].addShapeBox(0F, 0F, 0F, 14, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 339
		valkyrie[5][0].setRotationPoint(-10F, -2F, -8F);

		valkyrie[5][1].addShapeBox(0F, 0F, 0F, 47, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 340
		valkyrie[5][1].setRotationPoint(4F, -2F, -8F);

		valkyrie[5][2].addShapeBox(0F, 0F, 0F, 23, 9, 16, 0F, -4F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		valkyrie[5][2].setRotationPoint(-10F, -11F, -8F);

		valkyrie[5][3].addShapeBox(0F, 0F, 0F, 32, 12, 16, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		valkyrie[5][3].setRotationPoint(13F, -14F, -8F);

		valkyrie[5][4].addShapeBox(0F, 0F, 0F, 22, 16, 16, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 343
		valkyrie[5][4].setRotationPoint(51F, -2F, -8F);

		valkyrie[5][5].addShapeBox(0F, 0F, 0F, 30, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		valkyrie[5][5].setRotationPoint(45F, -14F, -8F);

		valkyrie[5][6].addShapeBox(0F, 0F, 0F, 3, 12, 16, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		valkyrie[5][6].setRotationPoint(75F, -14F, -8F);

		valkyrie[5][7].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 346
		valkyrie[5][7].setRotationPoint(78F, -13F, -8F);

		valkyrie[5][8].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 5F, 1F, 1F); // Box 347
		valkyrie[5][8].setRotationPoint(78F, -2F, -8F);

		valkyrie[5][9].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 5F, 1F, 0F); // Box 348
		valkyrie[5][9].setRotationPoint(78F, -2F, 6F);

		valkyrie[5][10].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		valkyrie[5][10].setRotationPoint(78F, -13F, 6F);

		valkyrie[5][11].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F, -5F, -5F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -2F, -8F, -1F, -6F, -3.5F, 0F, -6F, 0F, 0F, 2F, -8F, 0F); // Box 350
		valkyrie[5][11].setRotationPoint(-6F, -9F, -11F);

		valkyrie[5][12].addShapeBox(0F, 0F, 0F, 15, 20, 3, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, -6.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 6F, -3F, 0F); // Box 351
		valkyrie[5][12].setRotationPoint(13F, -10F, -11F);

		valkyrie[5][13].addShapeBox(0F, 0F, 0F, 23, 20, 3, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 352
		valkyrie[5][13].setRotationPoint(28F, -10F, -11F);

		valkyrie[5][14].addShapeBox(0F, 0F, 0F, 22, 20, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 353
		valkyrie[5][14].setRotationPoint(51F, -10F, -11F);

		valkyrie[5][15].addShapeBox(0F, 0F, 0F, 14, 20, 3, 0F, 0F, -2F, 0F, -2F, -6F, -1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, -2F, -8F, -1F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 354
		valkyrie[5][15].setRotationPoint(73F, -10F, -11F);

		valkyrie[5][16].addShapeBox(0F, 0F, 0F, 14, 20, 3, 0F, 0F, 1F, 0F, 0F, -4F, 0F, -2F, -6F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, -1F, 0F, -3.5F, 0F); // Box 355
		valkyrie[5][16].setRotationPoint(73F, -10F, 8F);

		valkyrie[5][17].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -5F, -1F, 2F, -8F, 0F, -6F, 0F, 0F, -6F, -3.5F, 0F, -2F, -8F, -1F); // Box 356
		valkyrie[5][17].setRotationPoint(-6F, -9F, 8F);

		valkyrie[5][18].addShapeBox(0F, 0F, 0F, 23, 20, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F); // Box 358
		valkyrie[5][18].setRotationPoint(28F, -10F, 8F);

		valkyrie[5][19].addShapeBox(0F, 0F, 0F, 22, 20, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F); // Box 359
		valkyrie[5][19].setRotationPoint(51F, -10F, 8F);

		valkyrie[5][20].addShapeBox(0F, -1F, -0.5F, 10, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Box 360
		valkyrie[5][20].setRotationPoint(29F, 9F, -8F);
		valkyrie[5][20].rotateAngleX = -0.85521133F;

		valkyrie[5][21].addShapeBox(0F, -1F, -0.5F, 32, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F, 0F); // Box 361
		valkyrie[5][21].setRotationPoint(39F, 9F, -8F);
		valkyrie[5][21].rotateAngleX = -0.85521133F;

		valkyrie[5][22].addShapeBox(0F, 0F, 0F, 15, 20, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 6F, -6.5F, 0F); // Box 407
		valkyrie[5][22].setRotationPoint(13F, -10F, 8F);
		
		valkyrie[6] = new ModelRendererTurbo[18];
		valkyrie[6][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		valkyrie[6][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		valkyrie[6][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		valkyrie[6][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		valkyrie[6][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		valkyrie[6][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		valkyrie[6][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		valkyrie[6][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		valkyrie[6][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		valkyrie[6][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		valkyrie[6][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		valkyrie[6][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		valkyrie[6][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		valkyrie[6][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		valkyrie[6][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		valkyrie[6][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		valkyrie[6][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		valkyrie[6][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35

		valkyrie[6][0].addShapeBox(0F, 0F, 0F, 9, 20, 16, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		valkyrie[6][0].setRotationPoint(0F, -8F, 0F);

		valkyrie[6][1].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F); // Box 19
		valkyrie[6][1].setRotationPoint(-4F, -8F, 15F);

		valkyrie[6][2].addShapeBox(0F, 0F, 0F, 27, 14, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -13.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, -2F); // Box 20
		valkyrie[6][2].setRotationPoint(-31F, -8.5F, 15F);

		valkyrie[6][3].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F); // Box 21
		valkyrie[6][3].setRotationPoint(-4F, -8F, 0F);

		valkyrie[6][4].addShapeBox(0F, 0F, 0F, 31, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F); // Box 22
		valkyrie[6][4].setRotationPoint(-35F, -8.5F, 0F);

		valkyrie[6][5].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.8F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.8F); // Box 23
		valkyrie[6][5].setRotationPoint(-28F, -8.5F, 1F);

		valkyrie[6][6].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, -1.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1.5F, 0F); // Box 24
		valkyrie[6][6].setRotationPoint(-31F, -8.5F, 1F);

		valkyrie[6][7].addShapeBox(0F, 0F, 0F, 6, 19, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		valkyrie[6][7].setRotationPoint(9F, -8F, 0.5F);

		valkyrie[6][8].addShapeBox(0F, 0F, 0F, 5, 19, 15, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 26
		valkyrie[6][8].setRotationPoint(15F, -8F, 0.5F);

		valkyrie[6][9].addShapeBox(0F, 0F, 0F, 3, 15, 15, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 27
		valkyrie[6][9].setRotationPoint(20F, -6F, 0.5F);

		valkyrie[6][10].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 28
		valkyrie[6][10].setRotationPoint(0F, -3.5F, 16F);

		valkyrie[6][11].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		valkyrie[6][11].setRotationPoint(0F, 0.5F, 16F);

		valkyrie[6][12].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 30
		valkyrie[6][12].setRotationPoint(9F, -3.5F, 16F);

		valkyrie[6][13].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		valkyrie[6][13].setRotationPoint(9F, 0.5F, 16F);

		valkyrie[6][14].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -3F, -2F, -1.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 32
		valkyrie[6][14].setRotationPoint(0F, -3.5F, 18F);

		valkyrie[6][15].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -3F, -2F, -1.5F); // Box 33
		valkyrie[6][15].setRotationPoint(0F, 0.5F, 18F);

		valkyrie[6][16].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -1.5F, 0F, -1F, -0.5F); // Box 34
		valkyrie[6][16].setRotationPoint(9F, 0.5F, 18F);

		valkyrie[6][17].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -1.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 35
		valkyrie[6][17].setRotationPoint(9F, -3.5F, 18F);
		
		valkyrie[7] = new ModelRendererTurbo[6];
		valkyrie[7][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 330
		valkyrie[7][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 331
		valkyrie[7][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 332
		valkyrie[7][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 333
		valkyrie[7][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 335
		valkyrie[7][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 336

		valkyrie[7][0].addBox(0F, 0F, 0F, 13, 20, 16, 0F); // Box 330
		valkyrie[7][0].setRotationPoint(-6F, -10F, -8F);

		valkyrie[7][1].addShapeBox(0F, 0F, 0F, 10, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 331
		valkyrie[7][1].setRotationPoint(7F, 0F, -8F);

		valkyrie[7][2].addShapeBox(0F, 0F, 0F, 10, 10, 16, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		valkyrie[7][2].setRotationPoint(7F, -10F, -8F);

		valkyrie[7][3].addBox(0F, 0F, 0F, 19, 18, 12, 0F); // Box 333
		valkyrie[7][3].setRotationPoint(9F, -8.5F, -6F);

		valkyrie[7][4].addShapeBox(0F, 0F, 0F, 8, 18, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 335
		valkyrie[7][4].setRotationPoint(28F, -8.5F, -6F);

		valkyrie[7][5].addShapeBox(0F, 0F, 0F, 4, 14, 12, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 336
		valkyrie[7][5].setRotationPoint(36F, -6.5F, -6F);
		
		valkyrie[8] = new ModelRendererTurbo[23];
		valkyrie[8][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		valkyrie[8][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		valkyrie[8][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		valkyrie[8][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		valkyrie[8][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		valkyrie[8][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		valkyrie[8][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		valkyrie[8][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		valkyrie[8][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		valkyrie[8][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		valkyrie[8][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		valkyrie[8][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		valkyrie[8][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		valkyrie[8][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		valkyrie[8][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		valkyrie[8][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		valkyrie[8][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		valkyrie[8][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		valkyrie[8][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		valkyrie[8][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		valkyrie[8][20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		valkyrie[8][21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		valkyrie[8][22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45

		valkyrie[8][0].addShapeBox(0F, 0F, 0F, 14, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 23
		valkyrie[8][0].setRotationPoint(-10F, -2F, -8F);

		valkyrie[8][1].addShapeBox(0F, 0F, 0F, 47, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 24
		valkyrie[8][1].setRotationPoint(4F, -2F, -8F);

		valkyrie[8][2].addShapeBox(0F, 0F, 0F, 23, 9, 16, 0F, -4F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		valkyrie[8][2].setRotationPoint(-10F, -11F, -8F);

		valkyrie[8][3].addShapeBox(0F, 0F, 0F, 32, 12, 16, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		valkyrie[8][3].setRotationPoint(13F, -14F, -8F);

		valkyrie[8][4].addShapeBox(0F, 0F, 0F, 22, 16, 16, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 27
		valkyrie[8][4].setRotationPoint(51F, -2F, -8F);

		valkyrie[8][5].addShapeBox(0F, 0F, 0F, 30, 12, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		valkyrie[8][5].setRotationPoint(45F, -14F, -8F);

		valkyrie[8][6].addShapeBox(0F, 0F, 0F, 3, 12, 16, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		valkyrie[8][6].setRotationPoint(75F, -14F, -8F);

		valkyrie[8][7].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		valkyrie[8][7].setRotationPoint(78F, -13F, 6F);

		valkyrie[8][8].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 5F, 1F, 0F); // Box 31
		valkyrie[8][8].setRotationPoint(78F, -2F, 6F);

		valkyrie[8][9].addShapeBox(0F, 0F, 0F, 13, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 5F, 1F, 1F); // Box 32
		valkyrie[8][9].setRotationPoint(78F, -2F, -8F);

		valkyrie[8][10].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 33
		valkyrie[8][10].setRotationPoint(78F, -13F, -8F);

		valkyrie[8][11].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -5F, -1F, 2F, -8F, 0F, -6F, 0F, 0F, -6F, -3.5F, 0F, -2F, -8F, -1F); // Box 34
		valkyrie[8][11].setRotationPoint(-6F, -9F, 8F);

		valkyrie[8][12].addShapeBox(0F, 0F, 0F, 15, 20, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 6F, -6.5F, 0F); // Box 35
		valkyrie[8][12].setRotationPoint(13F, -10F, 8F);

		valkyrie[8][13].addShapeBox(0F, 0F, 0F, 23, 20, 3, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F); // Box 36
		valkyrie[8][13].setRotationPoint(28F, -10F, 8F);

		valkyrie[8][14].addShapeBox(0F, 0F, 0F, 22, 20, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F); // Box 37
		valkyrie[8][14].setRotationPoint(51F, -10F, 8F);

		valkyrie[8][15].addShapeBox(0F, 0F, 0F, 14, 20, 3, 0F, 0F, 1F, 0F, 0F, -4F, 0F, -2F, -6F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, -1F, 0F, -3.5F, 0F); // Box 38
		valkyrie[8][15].setRotationPoint(73F, -10F, 8F);

		valkyrie[8][16].addShapeBox(0F, 0F, 0F, 14, 20, 3, 0F, 0F, -2F, 0F, -2F, -6F, -1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, -2F, -8F, -1F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 39
		valkyrie[8][16].setRotationPoint(73F, -10F, -11F);

		valkyrie[8][17].addShapeBox(0F, 0F, 0F, 19, 16, 3, 0F, -5F, -5F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -2F, -8F, -1F, -6F, -3.5F, 0F, -6F, 0F, 0F, 2F, -8F, 0F); // Box 40
		valkyrie[8][17].setRotationPoint(-6F, -9F, -11F);

		valkyrie[8][18].addShapeBox(0F, 0F, 0F, 23, 20, 3, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 41
		valkyrie[8][18].setRotationPoint(28F, -10F, -11F);

		valkyrie[8][19].addShapeBox(0F, 0F, 0F, 22, 20, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 42
		valkyrie[8][19].setRotationPoint(51F, -10F, -11F);

		valkyrie[8][20].addShapeBox(0F, -1F, 0.5F, 10, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F); // Box 43
		valkyrie[8][20].setRotationPoint(29F, 9F, 7F);
		valkyrie[8][20].rotateAngleX = 0.85521133F;

		valkyrie[8][21].addShapeBox(0F, -1F, 0.5F, 32, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F, 0F); // Box 44
		valkyrie[8][21].setRotationPoint(39F, 9F, 7F);
		valkyrie[8][21].rotateAngleX = 0.85521133F;

		valkyrie[8][22].addShapeBox(0F, 0F, 0F, 15, 20, 3, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, -6.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 6F, -3F, 0F); // Box 45
		valkyrie[8][22].setRotationPoint(13F, -10F, -11F);
		
		valkyrie[9] = new ModelRendererTurbo[20];
		valkyrie[9][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 232
		valkyrie[9][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 233
		valkyrie[9][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 234
		valkyrie[9][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 235
		valkyrie[9][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 237
		valkyrie[9][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 238
		valkyrie[9][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		valkyrie[9][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		valkyrie[9][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 241
		valkyrie[9][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 242
		valkyrie[9][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		valkyrie[9][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		valkyrie[9][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 248
		valkyrie[9][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 249
		valkyrie[9][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 250
		valkyrie[9][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 260
		valkyrie[9][16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 263
		valkyrie[9][17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 264
		valkyrie[9][18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 319
		valkyrie[9][19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 320

		valkyrie[9][0].addShapeBox(0F, 0F, 0F, 27, 2, 11, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 1.5F); // Box 232
		valkyrie[9][0].setRotationPoint(-9F, -13.5F, -5.5F);

		valkyrie[9][1].addShapeBox(0F, 0F, 0F, 27, 2, 8, 0F, 0F, 0F, -2F, 2F, -6F, -3F, 2F, -6F, -3F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 4F, -1.5F, 0F, 4F, -1.5F, 0F, 0F, 1.5F); // Box 233
		valkyrie[9][1].setRotationPoint(-9F, -15.5F, -4F);

		valkyrie[9][2].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		valkyrie[9][2].setRotationPoint(-5F, -17F, -0.5F);
		valkyrie[9][2].rotateAngleZ = -0.05235988F;

		valkyrie[9][3].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		valkyrie[9][3].setRotationPoint(7F, -15F, -0.5F);
		valkyrie[9][3].rotateAngleZ = -0.26179939F;

		valkyrie[9][4].addShapeBox(0F, 0F, 0F, 9, 7, 24, 0F, 0F, 0F, 0F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 237
		valkyrie[9][4].setRotationPoint(-9F, -11.5F, -12F);

		valkyrie[9][5].addShapeBox(0F, 0F, 0F, 23, 7, 24, 0F, 0F, 0.5F, 4F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0.5F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F); // Box 238
		valkyrie[9][5].setRotationPoint(0F, -11.5F, -12F);

		valkyrie[9][6].addShapeBox(0F, 0F, 0F, 23, 7, 22, 0F, 0F, -4F, 0F, 4F, -4.5F, -7F, 0F, -2.5F, 6F, 0F, 0.5F, 0F, 0F, 0F, 3F, 5F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 239
		valkyrie[9][6].setRotationPoint(0F, -11.5F, -38F);

		valkyrie[9][7].addShapeBox(0F, 0F, 0F, 23, 7, 22, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 6F, 4F, -4.5F, -7F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 5F, 0F, -3F, 0F, 0F, 3F); // Box 240
		valkyrie[9][7].setRotationPoint(0F, -11.5F, 16F);

		valkyrie[9][8].addShapeBox(0F, 0F, 0F, 16, 3, 21, 0F, -4F, -0.5F, 0F, -3F, -1F, -16F, -3F, -1F, 0F, 0F, 1.5F, 0F, -5F, 0F, 4F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		valkyrie[9][8].setRotationPoint(23F, -7.5F, -31F);

		valkyrie[9][9].addShapeBox(0F, 0F, 0F, 16, 3, 21, 0F, 0F, 1.5F, 0F, -3F, -1F, 0F, -3F, -1F, -16F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -5F, 0F, 4F); // Box 242
		valkyrie[9][9].setRotationPoint(23F, -7.5F, 10F);

		valkyrie[9][10].addShapeBox(0F, 0F, 0F, 16, 3, 20, 0F, 0F, 1.5F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		valkyrie[9][10].setRotationPoint(23F, -7.5F, -10F);

		valkyrie[9][11].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, -1F, -0.5F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 4F, 1F, 0F, 5F, 1F, 0F, 3F, -2F, 0F); // Box 247
		valkyrie[9][11].setRotationPoint(8F, -10.5F, -26F);

		valkyrie[9][12].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, -1F, -0.5F, 0F, 3F, -2F, 0F, 5F, 1F, 0F, 4F, 1F, 0F, 1F, -2F, 0F); // Box 248
		valkyrie[9][12].setRotationPoint(8F, -10.5F, -25F);

		valkyrie[9][13].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, -1F, -0.5F, 0F, 3F, -2F, 0F, 5F, 1F, 0F, 4F, 1F, 0F, 1F, -1F, 0F); // Box 249
		valkyrie[9][13].setRotationPoint(8F, -10.5F, 25F);

		valkyrie[9][14].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F, -1F, -0.5F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 4F, 1F, 0F, 5F, 1F, 0F, 3F, -2F, 0F); // Box 250
		valkyrie[9][14].setRotationPoint(8F, -10.5F, 24F);

		valkyrie[9][15].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 260
		valkyrie[9][15].setRotationPoint(23F, -1F, -37F);

		valkyrie[9][16].addShapeBox(0F, 0F, 0F, 23, 1, 74, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		valkyrie[9][16].setRotationPoint(0F, -1F, -37F);

		valkyrie[9][17].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 264
		valkyrie[9][17].setRotationPoint(23F, -1F, 15F);

		valkyrie[9][18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		valkyrie[9][18].setRotationPoint(36F, -6.5F, -9F);

		valkyrie[9][19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		valkyrie[9][19].setRotationPoint(36F, -6.5F, 7F);
		
		valkyrie[10] = new ModelRendererTurbo[8];
		valkyrie[10][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		valkyrie[10][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 252
		valkyrie[10][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 253
		valkyrie[10][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 254
		valkyrie[10][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 255
		valkyrie[10][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 316
		valkyrie[10][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 317
		valkyrie[10][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 318

		valkyrie[10][0].addBox(0F, 0F, 0F, 60, 2, 30, 0F); // Box 251
		valkyrie[10][0].setRotationPoint(1F, -1F, -15F);

		valkyrie[10][1].addShapeBox(0F, 0F, 0F, 21, 2, 30, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 252
		valkyrie[10][1].setRotationPoint(61F, -1F, -15F);

		valkyrie[10][2].addTrapezoid(0F, 0F, 0F, 4, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 253
		valkyrie[10][2].setRotationPoint(82F, -1F, -10F);

		valkyrie[10][3].addTrapezoid(0F, 0F, 0F, 4, 2, 2, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 254
		valkyrie[10][3].setRotationPoint(82F, -1F, 8F);

		valkyrie[10][4].addShapeBox(0F, 0F, 0F, 58, 8, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -16F, -0.5F, -5F); // Box 255
		valkyrie[10][4].setRotationPoint(3F, 1F, -15F);

		valkyrie[10][5].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 316
		valkyrie[10][5].setRotationPoint(-1F, -1F, -15F);

		valkyrie[10][6].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 317
		valkyrie[10][6].setRotationPoint(-1F, -1F, 9F);

		valkyrie[10][7].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 318
		valkyrie[10][7].setRotationPoint(-1F, -1F, -7F);

		valkyrie[11] = new ModelRendererTurbo[2];
		valkyrie[11][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 256
		valkyrie[11][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257

		valkyrie[11][0].addShapeBox(0F, -37F, -0.5F, 42, 38, 1, 0F, -55F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		valkyrie[11][0].setRotationPoint(0F, 0F, 0F);
		valkyrie[11][0].rotateAngleX = 0.40142573F;

		valkyrie[11][1].addShapeBox(44F, -37F, -0.5F, 23, 38, 1, 0F, -17F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -7F, -13F, 0F, -7F, -13F, 0F, 0F, 0F, 0F); // Box 257
		valkyrie[11][1].setRotationPoint(0F, 0F, 0F);
		valkyrie[11][1].rotateAngleX = 0.40142573F;
		
		valkyrie[12] = new ModelRendererTurbo[2];
		valkyrie[12][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 256
		valkyrie[12][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 257

		valkyrie[12][0].addShapeBox(0F, -37F, -0.5F, 42, 38, 1, 0F, -55F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		valkyrie[12][0].setRotationPoint(0F, 0F, 0F);
		valkyrie[12][0].rotateAngleX = -0.40142573F;

		valkyrie[12][1].addShapeBox(44F, -37F, -0.5F, 23, 38, 1, 0F, -17F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -7F, -13F, 0F, -7F, -13F, 0F, 0F, 0F, 0F); // Box 257
		valkyrie[12][1].setRotationPoint(0F, 0F, 0F);
		valkyrie[12][1].rotateAngleX = -0.40142573F;
		
		valkyrie[13] = new ModelRendererTurbo[7];
		valkyrie[13][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 377
		valkyrie[13][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 378
		valkyrie[13][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 379
		valkyrie[13][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 380
		valkyrie[13][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 381
		valkyrie[13][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 382
		valkyrie[13][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383

		valkyrie[13][0].addShapeBox(0F, -1F, -4F, 25, 2, 44, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 377
		valkyrie[13][0].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][0].rotateAngleY = 0.34906585F;

		valkyrie[13][1].addShapeBox(0F, -1F, -27F, 25, 2, 23, 0F, -1.896F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.896F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 378
		valkyrie[13][1].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][1].rotateAngleY = 0.34906585F;

		valkyrie[13][2].addShapeBox(-6F, -1F, -101F, 6, 2, 97, 0F, -8F, -0.5F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 379
		valkyrie[13][2].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][2].rotateAngleY = 0.34906585F;

		valkyrie[13][3].addShapeBox(2F, -1F, -109F, 13, 2, 8, 0F, -4F, -0.5F, -2F, 0F, -0.5F, 0F, -7F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, -2F, 0F, -0.5F, 0F, -7F, 0F, 0F, 0F, -0.5F, 0F); // Box 380
		valkyrie[13][3].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][3].rotateAngleY = 0.34906585F;

		valkyrie[13][4].addShapeBox(8F, -1F, -109F, 17, 2, 8, 0F, -7F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -7F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 381
		valkyrie[13][4].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][4].rotateAngleY = 0.34906585F;

		valkyrie[13][5].addShapeBox(8F, -1F, -101F, 17, 2, 66, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F, 5.44F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F, 5.44F, 0F, 0F); // Box 382
		valkyrie[13][5].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][5].rotateAngleY = 0.34906585F;

		valkyrie[13][6].addShapeBox(8F, -1F, -35F, 17, 2, 8, 0F, 5.44F, 0F, 0F, 9F, -0.5F, 0F, 1.5F, -0.5F, 0F, 6.1F, 0F, 0F, 5.44F, 0F, 0F, 9F, -0.5F, 0F, 1.5F, -0.5F, 0F, 6.1F, 0F, 0F); // Box 383
		valkyrie[13][6].setRotationPoint(-3F, 0F, -24F);
		valkyrie[13][6].rotateAngleY = 0.34906585F;
		
		valkyrie[14] = new ModelRendererTurbo[7];
		valkyrie[14][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 377
		valkyrie[14][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 378
		valkyrie[14][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 379
		valkyrie[14][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 380
		valkyrie[14][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 381
		valkyrie[14][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 382
		valkyrie[14][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383

		valkyrie[14][0].addShapeBox(0F, -1F, -4F, 25, 2, 44, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 377
		valkyrie[14][0].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][0].rotateAngleX = -3.14159265F;
		valkyrie[14][0].rotateAngleY = -0.34906585F;

		valkyrie[14][1].addShapeBox(0F, -1F, -27F, 25, 2, 23, 0F, -1.896F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.896F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 378
		valkyrie[14][1].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][1].rotateAngleX = -3.14159265F;
		valkyrie[14][1].rotateAngleY = -0.34906585F;

		valkyrie[14][2].addShapeBox(-6F, -1F, -101F, 6, 2, 97, 0F, -8F, -0.5F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 379
		valkyrie[14][2].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][2].rotateAngleX = -3.14159265F;
		valkyrie[14][2].rotateAngleY = -0.34906585F;

		valkyrie[14][3].addShapeBox(2F, -1F, -109F, 13, 2, 8, 0F, -4F, -0.5F, -2F, 0F, -0.5F, 0F, -7F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, -2F, 0F, -0.5F, 0F, -7F, 0F, 0F, 0F, -0.5F, 0F); // Box 380
		valkyrie[14][3].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][3].rotateAngleX = -3.14159265F;
		valkyrie[14][3].rotateAngleY = -0.34906585F;

		valkyrie[14][4].addShapeBox(8F, -1F, -109F, 17, 2, 8, 0F, -7F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -7F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 381
		valkyrie[14][4].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][4].rotateAngleX = -3.14159265F;
		valkyrie[14][4].rotateAngleY = -0.34906585F;

		valkyrie[14][5].addShapeBox(8F, -1F, -101F, 17, 2, 66, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F, 5.44F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F, 5.44F, 0F, 0F); // Box 382
		valkyrie[14][5].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][5].rotateAngleX = -3.14159265F;
		valkyrie[14][5].rotateAngleY = -0.34906585F;

		valkyrie[14][6].addShapeBox(8F, -1F, -35F, 17, 2, 8, 0F, 5.44F, 0F, 0F, 9F, -0.5F, 0F, 1.5F, -0.5F, 0F, 6.1F, 0F, 0F, 5.44F, 0F, 0F, 9F, -0.5F, 0F, 1.5F, -0.5F, 0F, 6.1F, 0F, 0F); // Box 383
		valkyrie[14][6].setRotationPoint(-3F, 0F, 24F);
		valkyrie[14][6].rotateAngleX = -3.14159265F;
		valkyrie[14][6].rotateAngleY = -0.34906585F;

		valkyrie[15] = new ModelRendererTurbo[2];
		valkyrie[15][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 337
		valkyrie[15][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 338

		valkyrie[15][0].addShapeBox(0F, 0F, 0F, 7, 9, 16, 0F, -7.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -7.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F); // Box 337
		valkyrie[15][0].setRotationPoint(-24F, -9F, -8F);

		valkyrie[15][1].addShapeBox(0F, 0F, 0F, 8, 9, 16, 0F, 1F, 0.5F, 0F, -7.5F, 0.5F, 0F, -7.5F, 0.5F, 0F, 1F, 0.5F, 0F, 2F, 1F, -0.5F, 7F, 0F, -2F, 7F, 0F, -2F, 2F, 1F, -0.5F); // Box 338
		valkyrie[15][1].setRotationPoint(-15F, -9F, -8F);
		
		valkyrie[16] = new ModelRendererTurbo[6];
		valkyrie[16][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 362
		valkyrie[16][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		valkyrie[16][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		valkyrie[16][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		valkyrie[16][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		valkyrie[16][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367

		valkyrie[16][0].addShapeBox(0F, 0F, 0F, 32, 1, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 1F, -1F, -0.7F, 1F, -1F, 0F, 0F, -1F); // Box 362
		valkyrie[16][0].setRotationPoint(-7F, -11F, -3.5F);

		valkyrie[16][1].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 363
		valkyrie[16][1].setRotationPoint(-7F, -10F, -3.5F);

		valkyrie[16][2].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F, -9F, 0F, -2.5F, -9F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 364
		valkyrie[16][2].setRotationPoint(-7F, -10F, 2.5F);

		valkyrie[16][3].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 365
		valkyrie[16][3].setRotationPoint(-7F, -9F, -0.5F);

		valkyrie[16][4].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 366
		valkyrie[16][4].setRotationPoint(-7F, -9F, 1.5F);

		valkyrie[16][5].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 367
		valkyrie[16][5].setRotationPoint(-7F, -9F, -2.5F);

		
		valkyrie[17] = new ModelRendererTurbo[9];
		valkyrie[17][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 368
		valkyrie[17][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		valkyrie[17][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		valkyrie[17][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		valkyrie[17][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		valkyrie[17][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373
		valkyrie[17][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 374
		valkyrie[17][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 375
		valkyrie[17][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 376

		valkyrie[17][0].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F,0F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F); // Box 368
		valkyrie[17][0].setRotationPoint(-7F, 0F, -3.5F);

		valkyrie[17][1].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F,0F, 0F, -2.5F, -9F, 0F, -2.5F, -9F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 369
		valkyrie[17][1].setRotationPoint(-7F, 0F, 2.5F);

		valkyrie[17][2].addShapeBox(0F, 0F, 0F, 32, 1, 7, 0F,0F, 0F, -1F, -0.7F, 1F, -1F, -0.7F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 370
		valkyrie[17][2].setRotationPoint(-7F, 10F, -3.5F);

		valkyrie[17][3].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F); // Box 371
		valkyrie[17][3].setRotationPoint(-7F, 8F, -0.5F);

		valkyrie[17][4].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F); // Box 372
		valkyrie[17][4].setRotationPoint(-7F, 8F, 1.5F);

		valkyrie[17][5].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F); // Box 373
		valkyrie[17][5].setRotationPoint(-7F, 8F, -2.5F);

		valkyrie[17][6].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F); // Box 374
		valkyrie[17][6].setRotationPoint(-12F, 2F, -3.5F);

		valkyrie[17][7].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, 0F, -1F, -0.7F, 1F, -1F, -0.7F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 375
		valkyrie[17][7].setRotationPoint(-12F, 12F, -3.5F);

		valkyrie[17][8].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, -2.5F, -9F, 0F, -2.5F, -9F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 376
		valkyrie[17][8].setRotationPoint(-12F, 2F, 2.5F);
		
		valkyrie[18] = new ModelRendererTurbo[2];
		valkyrie[18][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 337
		valkyrie[18][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 338

		valkyrie[18][0].addShapeBox(0F, 0F, 0F, 7, 9, 16, 0F, -7.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -7.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F); // Box 337
		valkyrie[18][0].setRotationPoint(-24F, -9F, -8F);

		valkyrie[18][1].addShapeBox(0F, 0F, 0F, 8, 9, 16, 0F, 1F, 0.5F, 0F, -7.5F, 0.5F, 0F, -7.5F, 0.5F, 0F, 1F, 0.5F, 0F, 2F, 1F, -0.5F, 7F, 0F, -2F, 7F, 0F, -2F, 2F, 1F, -0.5F); // Box 338
		valkyrie[18][1].setRotationPoint(-15F, -9F, -8F);
		
		valkyrie[19] = new ModelRendererTurbo[6];
		valkyrie[19][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 362
		valkyrie[19][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		valkyrie[19][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		valkyrie[19][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		valkyrie[19][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		valkyrie[19][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367

		valkyrie[19][0].addShapeBox(0F, 0F, 0F, 32, 1, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 1F, -1F, -0.7F, 1F, -1F, 0F, 0F, -1F); // Box 362
		valkyrie[19][0].setRotationPoint(-7F, -11F, -3.5F);

		valkyrie[19][1].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 363
		valkyrie[19][1].setRotationPoint(-7F, -10F, -3.5F);

		valkyrie[19][2].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F, -9F, 0F, -2.5F, -9F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 364
		valkyrie[19][2].setRotationPoint(-7F, -10F, 2.5F);

		valkyrie[19][3].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 365
		valkyrie[19][3].setRotationPoint(-7F, -9F, -0.5F);

		valkyrie[19][4].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 366
		valkyrie[19][4].setRotationPoint(-7F, -9F, 1.5F);

		valkyrie[19][5].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F); // Box 367
		valkyrie[19][5].setRotationPoint(-7F, -9F, -2.5F);

		valkyrie[20] = new ModelRendererTurbo[9];
		valkyrie[20][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 368
		valkyrie[20][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		valkyrie[20][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		valkyrie[20][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		valkyrie[20][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		valkyrie[20][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373
		valkyrie[20][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 374
		valkyrie[20][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 375
		valkyrie[20][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 376

		valkyrie[20][0].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F, 0F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F); // Box 368
		valkyrie[20][0].setRotationPoint(-7F, 0F, -3.5F);

		valkyrie[20][1].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F, 0F, 0F, -2.5F, -9F, 0F, -2.5F, -9F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 369
		valkyrie[20][1].setRotationPoint(-7F, 0F, 2.5F);

		valkyrie[20][2].addShapeBox(0F, 0F, 0F, 32, 1, 7, 0F, 0F, 0F, -1F, -0.7F, 1F, -1F, -0.7F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 370
		valkyrie[20][2].setRotationPoint(-7F, 10F, -3.5F);

		valkyrie[20][3].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F); // Box 371
		valkyrie[20][3].setRotationPoint(-7F, 8F, -0.5F);

		valkyrie[20][4].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F); // Box 372
		valkyrie[20][4].setRotationPoint(-7F, 8F, 1.5F);

		valkyrie[20][5].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 1F, 0F); // Box 373
		valkyrie[20][5].setRotationPoint(-7F, 8F, -2.5F);

		valkyrie[20][6].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F, 0F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F); // Box 374
		valkyrie[20][6].setRotationPoint(-12F, 2F, -3.5F);

		valkyrie[20][7].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F, 0F, 0F, -1F, -0.7F, 1F, -1F, -0.7F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 375
		valkyrie[20][7].setRotationPoint(-12F, 12F, -3.5F);

		valkyrie[20][8].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F, 0F, 0F, -2.5F, -9F, 0F, -2.5F, -9F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 376
		valkyrie[20][8].setRotationPoint(-12F, 2F, 2.5F);
		
		valkyrie[21] = new ModelRendererTurbo[16];
		valkyrie[21][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 268
		valkyrie[21][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 269
		valkyrie[21][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 270
		valkyrie[21][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 271
		valkyrie[21][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 272
		valkyrie[21][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 273
		valkyrie[21][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 274
		valkyrie[21][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 275
		valkyrie[21][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 276
		valkyrie[21][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 277
		valkyrie[21][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 278
		valkyrie[21][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 279
		valkyrie[21][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 280
		valkyrie[21][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 281
		valkyrie[21][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 413
		valkyrie[21][15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 414

		valkyrie[21][0].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 268
		valkyrie[21][0].setRotationPoint(-18F, 5.5F, -5F);

		valkyrie[21][1].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, -3F, -0.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 269
		valkyrie[21][1].setRotationPoint(-18F, 5.5F, -7F);

		valkyrie[21][2].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F); // Box 270
		valkyrie[21][2].setRotationPoint(-18F, 5.5F, 5F);

		valkyrie[21][3].addShapeBox(0F, 0F, 0F, 5, 11, 10, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 271
		valkyrie[21][3].setRotationPoint(-14F, 6F, -5F);

		valkyrie[21][4].addShapeBox(0F, 0F, 0F, 5, 11, 4, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5.5F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 272
		valkyrie[21][4].setRotationPoint(-14F, 6F, -9F);

		valkyrie[21][5].addShapeBox(0F, 0F, 0F, 5, 11, 4, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5.5F, -2F); // Box 273
		valkyrie[21][5].setRotationPoint(-14F, 6F, 5F);

		valkyrie[21][6].addShapeBox(0F, 0F, 0F, 10, 13, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 274
		valkyrie[21][6].setRotationPoint(-9F, 4F, -5F);

		valkyrie[21][7].addShapeBox(0F, 0F, 0F, 10, 13, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 275
		valkyrie[21][7].setRotationPoint(-9F, 4F, -9F);

		valkyrie[21][8].addShapeBox(0F, 0F, 0F, 10, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 276
		valkyrie[21][8].setRotationPoint(-9F, 4F, 5F);

		valkyrie[21][9].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Box 277
		valkyrie[21][9].setRotationPoint(1F, 10F, -5F);

		valkyrie[21][10].addShapeBox(0F, 0F, 0F, 10, 8, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -6F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Box 278
		valkyrie[21][10].setRotationPoint(1F, 10F, -9F);

		valkyrie[21][11].addShapeBox(0F, 0F, 0F, 10, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -4F, -6F, 0F, 0F, -3F, 0F); // Box 279
		valkyrie[21][11].setRotationPoint(1F, 10F, 5F);

		valkyrie[21][12].addShapeBox(0F, 0F, 0F, 9, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		valkyrie[21][12].setRotationPoint(1F, 4F, -7F);

		valkyrie[21][13].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		valkyrie[21][13].setRotationPoint(-5F, 0F, -3F);

		valkyrie[21][14].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		valkyrie[21][14].setRotationPoint(-5F, 0F, -5F);

		valkyrie[21][15].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 414
		valkyrie[21][15].setRotationPoint(-5F, 0F, 3F);
		
		valkyrie[22] = new ModelRendererTurbo[14];
		valkyrie[22][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 282
		valkyrie[22][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 283
		valkyrie[22][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 284
		valkyrie[22][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 285
		valkyrie[22][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 286
		valkyrie[22][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 287
		valkyrie[22][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 288
		valkyrie[22][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 289
		valkyrie[22][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 290
		valkyrie[22][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 291
		valkyrie[22][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 292
		valkyrie[22][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 293
		valkyrie[22][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 294
		valkyrie[22][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 295

		valkyrie[22][0].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		valkyrie[22][0].setRotationPoint(-6F, -6F, -12F);

		valkyrie[22][1].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		valkyrie[22][1].setRotationPoint(0F, -6F, -12F);

		valkyrie[22][2].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 284
		valkyrie[22][2].setRotationPoint(0F, 0F, -12F);

		valkyrie[22][3].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 285
		valkyrie[22][3].setRotationPoint(-6F, 0F, -12F);

		valkyrie[22][4].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 286
		valkyrie[22][4].setRotationPoint(-7F, -1.5F, -12F);

		valkyrie[22][5].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 287
		valkyrie[22][5].setRotationPoint(-9F, -1.5F, -12F);

		valkyrie[22][6].addShapeBox(0F, 0F, 0F, 23, 3, 3, 0F, 0F, -0.7F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.7F); // Box 288
		valkyrie[22][6].setRotationPoint(-32F, -1.5F, -12F);

		valkyrie[22][7].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		valkyrie[22][7].setRotationPoint(-6F, -6F, 9F);

		valkyrie[22][8].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		valkyrie[22][8].setRotationPoint(0F, -6F, 9F);

		valkyrie[22][9].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 291
		valkyrie[22][9].setRotationPoint(0F, 0F, 9F);

		valkyrie[22][10].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 292
		valkyrie[22][10].setRotationPoint(-6F, 0F, 9F);

		valkyrie[22][11].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		valkyrie[22][11].setRotationPoint(-7F, -1.5F, 9F);

		valkyrie[22][12].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 294
		valkyrie[22][12].setRotationPoint(-9F, -1.5F, 9F);

		valkyrie[22][13].addShapeBox(0F, 0F, 0F, 23, 3, 3, 0F, 0F, -0.7F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.7F); // Box 295
		valkyrie[22][13].setRotationPoint(-32F, -1.5F, 9F);

		valkyrie[23] = new ModelRendererTurbo[9];
		valkyrie[23][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		valkyrie[23][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		valkyrie[23][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		valkyrie[23][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		valkyrie[23][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367
		valkyrie[23][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		valkyrie[23][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		valkyrie[23][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		valkyrie[23][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373

		valkyrie[23][0].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 363
		valkyrie[23][0].setRotationPoint(-10F, 19F, -4.5F);

		valkyrie[23][1].addShapeBox(0F, 0F, 0F, 4, 18, 9, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 364
		valkyrie[23][1].setRotationPoint(-14F, 2F, -4.5F);

		valkyrie[23][2].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F); // Box 365
		valkyrie[23][2].setRotationPoint(-14F, 2F, 4.5F);

		valkyrie[23][3].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 366
		valkyrie[23][3].setRotationPoint(-14F, 2F, -6.5F);

		valkyrie[23][4].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 367
		valkyrie[23][4].setRotationPoint(6F, 19F, -4.5F);

		valkyrie[23][5].addShapeBox(0F, 0F, 0F, 16, 18, 2, 0F, 0F, 2F, 0F, 4F, 4F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 369
		valkyrie[23][5].setRotationPoint(-10F, 2F, 4.5F);

		valkyrie[23][6].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F, -4F, 4F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -3F, 2F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -6F, -2F, 0F, 0F, -1F, 0F); // Box 371
		valkyrie[23][6].setRotationPoint(6F, 2F, 4.5F);

		valkyrie[23][7].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F, -3F, 2F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, -4F, 4F, 0F, 0F, -1F, 0F, -6F, -2F, 0F, -4F, 0F, 0F, 0F, 1F, 0F); // Box 372
		valkyrie[23][7].setRotationPoint(6F, 2F, -6.5F);

		valkyrie[23][8].addShapeBox(0F, 0F, 0F, 16, 18, 2, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 4F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 373
		valkyrie[23][8].setRotationPoint(-10F, 2F, -6.5F);

		valkyrie[24] = new ModelRendererTurbo[2];
		valkyrie[24][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383
		valkyrie[24][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 384

		valkyrie[24][0].addBox(0F, 0F, 0F, 15, 17, 9, 0F); // Box 383
		valkyrie[24][0].setRotationPoint(-7F, -8.5F, -4.5F);

		valkyrie[24][1].addShapeBox(0F, 0F, 0F, 3, 17, 9, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 384
		valkyrie[24][1].setRotationPoint(8F, -8.5F, -4.5F);

		valkyrie[25] = new ModelRendererTurbo[12];
		valkyrie[25][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 385
		valkyrie[25][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 386
		valkyrie[25][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 387
		valkyrie[25][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 388
		valkyrie[25][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 389
		valkyrie[25][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 390
		valkyrie[25][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 391
		valkyrie[25][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 392
		valkyrie[25][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 393
		valkyrie[25][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 394
		valkyrie[25][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 395
		valkyrie[25][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 396

		valkyrie[25][0].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		valkyrie[25][0].setRotationPoint(0F, -6.5F, -3.5F);

		valkyrie[25][1].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 386
		valkyrie[25][1].setRotationPoint(0F, 5.5F, -3.5F);

		valkyrie[25][2].addShapeBox(0F, 0F, 0F, 24, 11, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		valkyrie[25][2].setRotationPoint(0F, -5.5F, -3.5F);

		valkyrie[25][3].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 388
		valkyrie[25][3].setRotationPoint(24F, -6.5F, -3.5F);

		valkyrie[25][4].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 389
		valkyrie[25][4].setRotationPoint(24F, 5.5F, -3.5F);

		valkyrie[25][5].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 390
		valkyrie[25][5].setRotationPoint(24F, -5.5F, -3.5F);

		valkyrie[25][6].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		valkyrie[25][6].setRotationPoint(26F, -7.5F, -3.5F);

		valkyrie[25][7].addShapeBox(0F, 0F, 0F, 8, 13, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		valkyrie[25][7].setRotationPoint(26F, -6.5F, -3.5F);

		valkyrie[25][8].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 393
		valkyrie[25][8].setRotationPoint(26F, 6.5F, -3.5F);

		valkyrie[25][9].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 394
		valkyrie[25][9].setRotationPoint(34F, -5.5F, -3.5F);

		valkyrie[25][10].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 395
		valkyrie[25][10].setRotationPoint(34F, -6.5F, -3.5F);

		valkyrie[25][11].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 396
		valkyrie[25][11].setRotationPoint(34F, 5.5F, -3.5F);

		valkyrie[26] = new ModelRendererTurbo[13];
		valkyrie[26][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 397
		valkyrie[26][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 398
		valkyrie[26][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 400
		valkyrie[26][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 401
		valkyrie[26][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 402
		valkyrie[26][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 403
		valkyrie[26][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 404
		valkyrie[26][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 405
		valkyrie[26][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 408
		valkyrie[26][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 409
		valkyrie[26][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 410
		valkyrie[26][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 411
		valkyrie[26][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 412

		valkyrie[26][0].addShapeBox(0F, 0F, 0F, 30, 1, 9, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 397
		valkyrie[26][0].setRotationPoint(-41F, 9F, -4.5F);

		valkyrie[26][1].addShapeBox(0F, 0F, 0F, 30, 8, 2, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 398
		valkyrie[26][1].setRotationPoint(-41F, 2F, -6.5F);

		valkyrie[26][2].addShapeBox(0F, 0F, 0F, 28, 2, 9, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 400
		valkyrie[26][2].setRotationPoint(-4F, 8F, -4.5F);

		valkyrie[26][3].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		valkyrie[26][3].setRotationPoint(-11F, 9F, -4.5F);

		valkyrie[26][4].addShapeBox(0F, 0F, 0F, 7, 20, 2, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		valkyrie[26][4].setRotationPoint(-11F, -10F, -6.5F);

		valkyrie[26][5].addShapeBox(0F, 0F, 0F, 7, 20, 2, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 403
		valkyrie[26][5].setRotationPoint(-11F, -10F, 4.5F);

		valkyrie[26][6].addShapeBox(0F, 0F, 0F, 28, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 404
		valkyrie[26][6].setRotationPoint(-4F, -10F, -4.5F);

		valkyrie[26][7].addShapeBox(0F, 0F, 0F, 28, 17, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 405
		valkyrie[26][7].setRotationPoint(-4F, -8F, -6.5F);

		valkyrie[26][8].addShapeBox(0F, 0F, 0F, 30, 8, 2, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 408
		valkyrie[26][8].setRotationPoint(-41F, 2F, 4.5F);

		valkyrie[26][9].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		valkyrie[26][9].setRotationPoint(24F, -10F, -4.5F);

		valkyrie[26][10].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -1F, -6F, 0F, 0F, -2F, 0F); // Box 410
		valkyrie[26][10].setRotationPoint(24F, -10F, 4.5F);

		valkyrie[26][11].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 411
		valkyrie[26][11].setRotationPoint(24F, -10F, -6.5F);

		valkyrie[26][12].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		valkyrie[26][12].setRotationPoint(24F, 4F, -4.5F);
		
		valkyrie[27] = new ModelRendererTurbo[15];
		valkyrie[27][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		valkyrie[27][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		valkyrie[27][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		valkyrie[27][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		valkyrie[27][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		valkyrie[27][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		valkyrie[27][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		valkyrie[27][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		valkyrie[27][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		valkyrie[27][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		valkyrie[27][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		valkyrie[27][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		valkyrie[27][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		valkyrie[27][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		valkyrie[27][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29

		valkyrie[27][0].addBox(-23F, 0F, 0F, 7, 9, 9, 0F); // Box 15
		valkyrie[27][0].setRotationPoint(23F, -4.5F, -4.5F);

		valkyrie[27][1].addShapeBox(-23F, 0F, 0F, 3, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16
		valkyrie[27][1].setRotationPoint(30F, -4.5F, -4.5F);

		valkyrie[27][2].addShapeBox(-23F, 0F, 0F, 4, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		valkyrie[27][2].setRotationPoint(33F, -4.5F, -2.5F);

		valkyrie[27][3].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 18
		valkyrie[27][3].setRotationPoint(37F, -4.5F, -2.5F);

		valkyrie[27][4].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 19
		valkyrie[27][4].setRotationPoint(41F, -4.5F, -2.5F);

		valkyrie[27][5].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0.2F, -0.2F, -0.5F, -2F, -0.2F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0.2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, 0F, 0F, -1F); // Box 20
		valkyrie[27][5].setRotationPoint(41F, 1.5F, -2.5F);

		valkyrie[27][6].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 21
		valkyrie[27][6].setRotationPoint(37F, 1.5F, -2.5F);

		valkyrie[27][7].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0.2F, 0.4F, -0.5F, -2F, 0.4F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0.2F, 0.4F, 0F, -2F, 0.4F, 0F, 0F, 0F, 0F, -1F); // Box 22
		valkyrie[27][7].setRotationPoint(41F, -1.75F, -2.5F);

		valkyrie[27][8].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 23
		valkyrie[27][8].setRotationPoint(37F, -1.75F, -2.5F);

		valkyrie[27][9].addShapeBox(-23F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 24
		valkyrie[27][9].setRotationPoint(36.5F, -6.5F, -1.5F);

		valkyrie[27][10].addShapeBox(-23F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 25
		valkyrie[27][10].setRotationPoint(40.5F, -6.5F, -1.5F);

		valkyrie[27][11].addShapeBox(-23F, 0F, 0F, 10, 2, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		valkyrie[27][11].setRotationPoint(26.5F, -6.5F, -1.5F);

		valkyrie[27][12].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 27
		valkyrie[27][12].setRotationPoint(34F, 4.5F, 1.5F);

		valkyrie[27][13].addShapeBox(-23F, 0F, 0F, 3, 3, 3, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.2F); // Box 28
		valkyrie[27][13].setRotationPoint(38F, 4.5F, 1.5F);

		valkyrie[27][14].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 29
		valkyrie[27][14].setRotationPoint(30F, 4.5F, 1.5F);

		
		valkyrie[28] = new ModelRendererTurbo[9];
		valkyrie[28][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		valkyrie[28][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		valkyrie[28][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		valkyrie[28][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		valkyrie[28][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367
		valkyrie[28][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		valkyrie[28][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		valkyrie[28][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		valkyrie[28][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373

		valkyrie[28][0].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 363
		valkyrie[28][0].setRotationPoint(-10F, 19F, -4.5F);

		valkyrie[28][1].addShapeBox(0F, 0F, 0F, 4, 18, 9, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 364
		valkyrie[28][1].setRotationPoint(-14F, 2F, -4.5F);

		valkyrie[28][2].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F); // Box 365
		valkyrie[28][2].setRotationPoint(-14F, 2F, 4.5F);

		valkyrie[28][3].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 366
		valkyrie[28][3].setRotationPoint(-14F, 2F, -6.5F);

		valkyrie[28][4].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 367
		valkyrie[28][4].setRotationPoint(6F, 19F, -4.5F);

		valkyrie[28][5].addShapeBox(0F, 0F, 0F, 16, 18, 2, 0F, 0F, 2F, 0F, 4F, 4F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 369
		valkyrie[28][5].setRotationPoint(-10F, 2F, 4.5F);

		valkyrie[28][6].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F, -4F, 4F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -3F, 2F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -6F, -2F, 0F, 0F, -1F, 0F); // Box 371
		valkyrie[28][6].setRotationPoint(6F, 2F, 4.5F);

		valkyrie[28][7].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F, -3F, 2F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, -4F, 4F, 0F, 0F, -1F, 0F, -6F, -2F, 0F, -4F, 0F, 0F, 0F, 1F, 0F); // Box 372
		valkyrie[28][7].setRotationPoint(6F, 2F, -6.5F);

		valkyrie[28][8].addShapeBox(0F, 0F, 0F, 16, 18, 2, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 4F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 373
		valkyrie[28][8].setRotationPoint(-10F, 2F, -6.5F);

		valkyrie[29] = new ModelRendererTurbo[2];
		valkyrie[29][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383
		valkyrie[29][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 384

		valkyrie[29][0].addBox(0F, 0F, 0F, 15, 17, 9, 0F); // Box 383
		valkyrie[29][0].setRotationPoint(-7F, -8.5F, -4.5F);

		valkyrie[29][1].addShapeBox(0F, 0F, 0F, 3, 17, 9, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 384
		valkyrie[29][1].setRotationPoint(8F, -8.5F, -4.5F);
		
		valkyrie[30] = new ModelRendererTurbo[12];
		valkyrie[30][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 385
		valkyrie[30][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 386
		valkyrie[30][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 387
		valkyrie[30][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 388
		valkyrie[30][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 389
		valkyrie[30][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 390
		valkyrie[30][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 391
		valkyrie[30][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 392
		valkyrie[30][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 393
		valkyrie[30][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 394
		valkyrie[30][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 395
		valkyrie[30][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 396

		valkyrie[30][0].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		valkyrie[30][0].setRotationPoint(0F, -6.5F, -3.5F);

		valkyrie[30][1].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 386
		valkyrie[30][1].setRotationPoint(0F, 5.5F, -3.5F);

		valkyrie[30][2].addShapeBox(0F, 0F, 0F, 24, 11, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		valkyrie[30][2].setRotationPoint(0F, -5.5F, -3.5F);

		valkyrie[30][3].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 388
		valkyrie[30][3].setRotationPoint(24F, -6.5F, -3.5F);

		valkyrie[30][4].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 389
		valkyrie[30][4].setRotationPoint(24F, 5.5F, -3.5F);

		valkyrie[30][5].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 390
		valkyrie[30][5].setRotationPoint(24F, -5.5F, -3.5F);

		valkyrie[30][6].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		valkyrie[30][6].setRotationPoint(26F, -7.5F, -3.5F);

		valkyrie[30][7].addShapeBox(0F, 0F, 0F, 8, 13, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		valkyrie[30][7].setRotationPoint(26F, -6.5F, -3.5F);

		valkyrie[30][8].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 393
		valkyrie[30][8].setRotationPoint(26F, 6.5F, -3.5F);

		valkyrie[30][9].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 394
		valkyrie[30][9].setRotationPoint(34F, -5.5F, -3.5F);

		valkyrie[30][10].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 395
		valkyrie[30][10].setRotationPoint(34F, -6.5F, -3.5F);

		valkyrie[30][11].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 396
		valkyrie[30][11].setRotationPoint(34F, 5.5F, -3.5F);

		valkyrie[31] = new ModelRendererTurbo[13];
		valkyrie[31][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 397
		valkyrie[31][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 398
		valkyrie[31][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 400
		valkyrie[31][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 401
		valkyrie[31][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 402
		valkyrie[31][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 403
		valkyrie[31][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 404
		valkyrie[31][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 405
		valkyrie[31][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 408
		valkyrie[31][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 409
		valkyrie[31][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 410
		valkyrie[31][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 411
		valkyrie[31][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 412

		valkyrie[31][0].addShapeBox(0F, 0F, 0F, 30, 1, 9, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 397
		valkyrie[31][0].setRotationPoint(-41F, 9F, -4.5F);

		valkyrie[31][1].addShapeBox(0F, 0F, 0F, 30, 8, 2, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 398
		valkyrie[31][1].setRotationPoint(-41F, 2F, -6.5F);

		valkyrie[31][2].addShapeBox(0F, 0F, 0F, 28, 2, 9, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 400
		valkyrie[31][2].setRotationPoint(-4F, 8F, -4.5F);

		valkyrie[31][3].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		valkyrie[31][3].setRotationPoint(-11F, 9F, -4.5F);

		valkyrie[31][4].addShapeBox(0F, 0F, 0F, 7, 20, 2, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		valkyrie[31][4].setRotationPoint(-11F, -10F, -6.5F);

		valkyrie[31][5].addShapeBox(0F, 0F, 0F, 7, 20, 2, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 403
		valkyrie[31][5].setRotationPoint(-11F, -10F, 4.5F);

		valkyrie[31][6].addShapeBox(0F, 0F, 0F, 28, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 404
		valkyrie[31][6].setRotationPoint(-4F, -10F, -4.5F);

		valkyrie[31][7].addShapeBox(0F, 0F, 0F, 28, 17, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 405
		valkyrie[31][7].setRotationPoint(-4F, -8F, -6.5F);

		valkyrie[31][8].addShapeBox(0F, 0F, 0F, 30, 8, 2, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 408
		valkyrie[31][8].setRotationPoint(-41F, 2F, 4.5F);

		valkyrie[31][9].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		valkyrie[31][9].setRotationPoint(24F, -10F, -4.5F);

		valkyrie[31][10].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -1F, -6F, 0F, 0F, -2F, 0F); // Box 410
		valkyrie[31][10].setRotationPoint(24F, -10F, 4.5F);

		valkyrie[31][11].addShapeBox(0F, 0F, 0F, 5, 21, 2, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 411
		valkyrie[31][11].setRotationPoint(24F, -10F, -6.5F);

		valkyrie[31][12].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		valkyrie[31][12].setRotationPoint(24F, 4F, -4.5F);

		valkyrie[32] = new ModelRendererTurbo[15];
		valkyrie[32][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 413
		valkyrie[32][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 414
		valkyrie[32][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 415
		valkyrie[32][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 416
		valkyrie[32][4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 417
		valkyrie[32][5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 418
		valkyrie[32][6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 419
		valkyrie[32][7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 420
		valkyrie[32][8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 421
		valkyrie[32][9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 422
		valkyrie[32][10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 423
		valkyrie[32][11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 424
		valkyrie[32][12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 425
		valkyrie[32][13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 426
		valkyrie[32][14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 427

		valkyrie[32][0].addBox(-23F, 0F, 0F, 7, 9, 9, 0F); // Box 413
		valkyrie[32][0].setRotationPoint(23F, -4.5F, -4.5F);

		valkyrie[32][1].addShapeBox(-23F, 0F, 0F, 3, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 414
		valkyrie[32][1].setRotationPoint(30F, -4.5F, -4.5F);

		valkyrie[32][2].addShapeBox(-23F, 0F, 0F, 4, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		valkyrie[32][2].setRotationPoint(33F, -4.5F, -0.5F);

		valkyrie[32][3].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F); // Box 416
		valkyrie[32][3].setRotationPoint(37F, -4.5F, -0.5F);

		valkyrie[32][4].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0.2F); // Box 417
		valkyrie[32][4].setRotationPoint(41F, -4.5F, -0.5F);

		valkyrie[32][5].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, -1F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -2F, 0F, -0.5F, 0.2F, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 0F, 0F, 0.2F); // Box 418
		valkyrie[32][5].setRotationPoint(41F, 1.5F, -0.5F);

		valkyrie[32][6].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 419
		valkyrie[32][6].setRotationPoint(37F, 1.5F, -0.5F);

		valkyrie[32][7].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, -1F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, -2F, 0F, -0.5F, 0.2F, 0F, 0F, -1F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0.2F); // Box 420
		valkyrie[32][7].setRotationPoint(41F, -1.75F, -0.5F);

		valkyrie[32][8].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 421
		valkyrie[32][8].setRotationPoint(37F, -1.75F, -0.5F);

		valkyrie[32][9].addShapeBox(-23F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F); // Box 422
		valkyrie[32][9].setRotationPoint(36.5F, -6.5F, -1.5F);

		valkyrie[32][10].addShapeBox(-23F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0.2F, 0F, -0.5F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, 0.2F); // Box 423
		valkyrie[32][10].setRotationPoint(40.5F, -6.5F, -1.5F);

		valkyrie[32][11].addShapeBox(-23F, 0F, 0F, 10, 2, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		valkyrie[32][11].setRotationPoint(26.5F, -6.5F, -1.5F);

		valkyrie[32][12].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 425
		valkyrie[32][12].setRotationPoint(34F, 4.5F, -4.5F);

		valkyrie[32][13].addShapeBox(-23F, 0F, 0F, 3, 3, 3, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 426
		valkyrie[32][13].setRotationPoint(38F, 4.5F, -4.5F);

		valkyrie[32][14].addShapeBox(-23F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 427
		valkyrie[32][14].setRotationPoint(30F, 4.5F, -4.5F);
		
		translateAll(0F, 0F, 0F);


		flipAll();
	}
}