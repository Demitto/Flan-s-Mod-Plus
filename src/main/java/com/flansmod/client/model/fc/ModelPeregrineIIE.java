//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPeregrineIIE extends ModelMecha //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelPeregrineIIE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[84];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import ImportCore1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 1080, textureX, textureY); // Import ImportCore2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import ImportCore3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportCore4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Import ImportCore5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import ImportCore6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 1460, textureX, textureY); // Import ImportCore7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import ImportCore8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import ImportCore9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Import ImportCore10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Import ImportCore11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportCore12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportCore13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportCore14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportCore15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Import ImportCore16
		bodyModel[16] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Import ImportCore17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import ImportCore18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Import ImportCore19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Import ImportCore20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import ImportCore21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import ImportCore22
		bodyModel[22] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import ImportLCore1
		bodyModel[23] = new ModelRendererTurbo(this, 0, 1080, textureX, textureY); // Import ImportLCore2
		bodyModel[24] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import ImportLCore3
		bodyModel[25] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportLCore4
		bodyModel[26] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Import ImportLCore5
		bodyModel[27] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import ImportLCore6
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1460, textureX, textureY); // Import ImportLCore7
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import ImportLCore8
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import ImportLCore9
		bodyModel[31] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Import ImportLCore10
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Import ImportLCore11
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportLCore12
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportLCore13
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportLCore14
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import ImportLCore15
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Import ImportLCore16
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Import ImportLCore17
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import ImportLCore18
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Import ImportLCore19
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Import ImportLCore20
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import ImportLCore21
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import ImportLCore22
		bodyModel[44] = new ModelRendererTurbo(this, 300, 1480, textureX, textureY); // Import Box178
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 70
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 73
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 74
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 75
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 76
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 77
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 78
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 80
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 244
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 245
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 246
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 247
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 248
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 249
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 250
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 251
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 252
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 253
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 254
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 255
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 256
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 257
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 258
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Box 259
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 260
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 261
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 262
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 263
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 264
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 265
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 266
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 267
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 268
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Box 269
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 270
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 271
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Box 272

		bodyModel[0].addShapeBox(-106F, 0F, 0F, 106, 44, 26, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportCore1
		bodyModel[0].setRotationPoint(58F, -236F, -57F);
		bodyModel[0].rotateAngleZ = -0.43633231F;

		bodyModel[1].addShapeBox(-132F, 0F, 0F, 26, 44, 36, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Import ImportCore2
		bodyModel[1].setRotationPoint(58F, -236F, -57F);
		bodyModel[1].rotateAngleZ = -0.4363323F;

		bodyModel[2].addShapeBox(-80F, -6F, 0F, 57, 6, 11, 0F, -20F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportCore3
		bodyModel[2].setRotationPoint(58F, -236F, -32F);
		bodyModel[2].rotateAngleZ = -0.43633231F;

		bodyModel[3].addShapeBox(-31F, 0F, 0F, 31, 38, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F); // Import ImportCore4
		bodyModel[3].setRotationPoint(-17.5F, -248F, -60F);

		bodyModel[4].addShapeBox(-31F, 0F, 0F, 31, 28, 40, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportCore5
		bodyModel[4].setRotationPoint(-17.5F, -276F, -60F);

		bodyModel[5].addShapeBox(-31F, 0F, 0F, 26, 45, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F); // Import ImportCore6
		bodyModel[5].setRotationPoint(-43.5F, -255F, -60F);

		bodyModel[6].addShapeBox(-31F, 0F, 0F, 26, 21, 40, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportCore7
		bodyModel[6].setRotationPoint(-43.5F, -276F, -60F);

		bodyModel[7].addBox(-106F, 0F, 0F, 106, 44, 10, 0F); // Import ImportCore8
		bodyModel[7].setRotationPoint(58F, -236F, -31F);
		bodyModel[7].rotateAngleZ = -0.4363323F;

		bodyModel[8].addBox(0F, 0F, 0F, 37, 10, 2, 0F); // Import ImportCore9
		bodyModel[8].setRotationPoint(-27.5F, -248F, -59F);

		bodyModel[9].addBox(0F, 0F, 0F, 37, 9, 2, 0F); // Import ImportCore10
		bodyModel[9].setRotationPoint(-40.5F, -234F, -59F);

		bodyModel[10].addBox(0F, 0F, 0F, 46, 9, 20, 0F); // Import ImportCore11
		bodyModel[10].setRotationPoint(-43.5F, -222F, -45F);

		bodyModel[11].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportCore12
		bodyModel[11].setRotationPoint(-4.5F, -213F, -43F);
		bodyModel[11].rotateAngleZ = -0.7853982F;

		bodyModel[12].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportCore13
		bodyModel[12].setRotationPoint(5F, -213F, -43F);
		bodyModel[12].rotateAngleZ = -0.7853982F;

		bodyModel[13].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportCore14
		bodyModel[13].setRotationPoint(14.5F, -213F, -43F);
		bodyModel[13].rotateAngleZ = -0.7853982F;

		bodyModel[14].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportCore15
		bodyModel[14].setRotationPoint(24F, -213F, -43F);
		bodyModel[14].rotateAngleZ = -0.7853982F;

		bodyModel[15].addTrapezoid(-25F, 0F, 0F, 25, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportCore16
		bodyModel[15].setRotationPoint(3F, -261F, -37F);
		bodyModel[15].rotateAngleZ = -1.04719755F;

		bodyModel[16].addTrapezoid(-30F, 0F, 0F, 30, 5, 7, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportCore17
		bodyModel[16].setRotationPoint(-24F, -274F, -47F);
		bodyModel[16].rotateAngleZ = -0.95993109F;

		bodyModel[17].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import ImportCore18
		bodyModel[17].setRotationPoint(-57.5F, -247F, -71F);

		bodyModel[18].addBox(0F, 0F, -19F, 29, 27, 19, 0F); // Import ImportCore19
		bodyModel[18].setRotationPoint(-60F, -238F, -60F);
		bodyModel[18].rotateAngleX = -0.6108652F;

		bodyModel[19].addBox(0F, -6F, -22F, 25, 20, 13, 0F); // Import ImportCore20
		bodyModel[19].setRotationPoint(-58F, -238F, -60F);
		bodyModel[19].rotateAngleX = -0.6108652F;

		bodyModel[20].addBox(0F, 27F, -19F, 29, 10, 19, 0F); // Import ImportCore21
		bodyModel[20].setRotationPoint(-60F, -238F, -60F);
		bodyModel[20].rotateAngleX = -0.6108652F;

		bodyModel[21].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import ImportCore22
		bodyModel[21].setRotationPoint(-57.5F, -231F, -97F);

		bodyModel[22].addShapeBox(-106F, 0F, 0F, 106, 44, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F); // Import ImportLCore1
		bodyModel[22].setRotationPoint(58F, -236F, 31F);
		bodyModel[22].rotateAngleZ = -0.43633231F;

		bodyModel[23].addShapeBox(-132F, 0F, 0F, 26, 44, 36, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Import ImportLCore2
		bodyModel[23].setRotationPoint(58F, -236F, 21F);
		bodyModel[23].rotateAngleZ = -0.4363323F;

		bodyModel[24].addShapeBox(-80F, -6F, 0F, 57, 6, 11, 0F, -20F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLCore3
		bodyModel[24].setRotationPoint(58F, -236F, 21F);
		bodyModel[24].rotateAngleZ = -0.4363323F;

		bodyModel[25].addShapeBox(-31F, 0F, 0F, 31, 38, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F); // Import ImportLCore4
		bodyModel[25].setRotationPoint(-17.5F, -248F, 20F);

		bodyModel[26].addShapeBox(-31F, 0F, 0F, 31, 28, 40, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLCore5
		bodyModel[26].setRotationPoint(-17.5F, -276F, 20F);

		bodyModel[27].addShapeBox(-31F, 0F, 0F, 26, 45, 40, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F); // Import ImportLCore6
		bodyModel[27].setRotationPoint(-43.5F, -255F, 20F);

		bodyModel[28].addShapeBox(-31F, 0F, 0F, 26, 21, 40, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLCore7
		bodyModel[28].setRotationPoint(-43.5F, -276F, 20F);

		bodyModel[29].addBox(-106F, 0F, 0F, 106, 44, 10, 0F); // Import ImportLCore8
		bodyModel[29].setRotationPoint(58F, -236F, 21F);
		bodyModel[29].rotateAngleZ = -0.43633231F;

		bodyModel[30].addBox(0F, 0F, 0F, 37, 10, 2, 0F); // Import ImportLCore9
		bodyModel[30].setRotationPoint(-27.5F, -248F, 57F);

		bodyModel[31].addBox(0F, 0F, 0F, 37, 9, 2, 0F); // Import ImportLCore10
		bodyModel[31].setRotationPoint(-40.5F, -234F, 57F);

		bodyModel[32].addBox(0F, 0F, 0F, 46, 9, 20, 0F); // Import ImportLCore11
		bodyModel[32].setRotationPoint(-43.5F, -222F, 25F);

		bodyModel[33].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportLCore12
		bodyModel[33].setRotationPoint(-4.5F, -213F, 26F);
		bodyModel[33].rotateAngleZ = -0.7853982F;

		bodyModel[34].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportLCore13
		bodyModel[34].setRotationPoint(5F, -213F, 26F);
		bodyModel[34].rotateAngleZ = -0.7853982F;

		bodyModel[35].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportLCore14
		bodyModel[35].setRotationPoint(14.5F, -213F, 26F);
		bodyModel[35].rotateAngleZ = -0.7853982F;

		bodyModel[36].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import ImportLCore15
		bodyModel[36].setRotationPoint(24F, -213F, 26F);
		bodyModel[36].rotateAngleZ = -0.7853982F;

		bodyModel[37].addTrapezoid(-25F, 0F, 0F, 25, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportLCore16
		bodyModel[37].setRotationPoint(3F, -261F, 32F);
		bodyModel[37].rotateAngleZ = -1.04719755F;

		bodyModel[38].addTrapezoid(-30F, 0F, 0F, 30, 5, 7, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Import ImportLCore17
		bodyModel[38].setRotationPoint(-24F, -274F, 40F);
		bodyModel[38].rotateAngleZ = -0.95993109F;

		bodyModel[39].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import ImportLCore18
		bodyModel[39].setRotationPoint(-57.5F, -247F, 60F);

		bodyModel[40].addBox(0F, 0F, 0F, 29, 27, 19, 0F); // Import ImportLCore19
		bodyModel[40].setRotationPoint(-60F, -238F, 60F);
		bodyModel[40].rotateAngleX = 0.61086524F;

		bodyModel[41].addBox(0F, -6F, 9F, 25, 20, 13, 0F); // Import ImportLCore20
		bodyModel[41].setRotationPoint(-58F, -238F, 60F);
		bodyModel[41].rotateAngleX = 0.61086524F;

		bodyModel[42].addBox(0F, 27F, 0F, 29, 10, 19, 0F); // Import ImportLCore21
		bodyModel[42].setRotationPoint(-60F, -238F, 60F);
		bodyModel[42].rotateAngleX = 0.6108652F;

		bodyModel[43].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import ImportLCore22
		bodyModel[43].setRotationPoint(-57.5F, -231F, 86F);

		bodyModel[44].addShapeBox(-38F, 10F, 0F, 380, 202, 0, 0F, 0F, 0F, 0F, -342F, 0F, -26F, -342F, 0F, 26F, 0F, 0F, 0F, 0F, -182F, 0F, -342F, -182F, -26F, -342F, -182F, 26F, 0F, -182F, 0F); // Import Box178
		bodyModel[44].setRotationPoint(58F, -236F, -57.1F);
		bodyModel[44].rotateAngleZ = -0.43633231F;

		bodyModel[45].addBox(0F, 2F, 1F, 1, 22, 17, 0F); // Box 70
		bodyModel[45].setRotationPoint(-31.5F, -238F, 60F);
		bodyModel[45].rotateAngleX = 0.61086524F;

		bodyModel[46].addShapeBox(0F, 2F, 1F, 1, 10, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 72
		bodyModel[46].setRotationPoint(-30.5F, -238F, 60F);
		bodyModel[46].rotateAngleX = 0.61086524F;

		bodyModel[47].addShapeBox(0F, 14F, 1F, 1, 10, 17, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[47].setRotationPoint(-30.5F, -238F, 60F);
		bodyModel[47].rotateAngleX = 0.61086524F;

		bodyModel[48].addShapeBox(0F, 3F, 1F, 1, 20, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 74
		bodyModel[48].setRotationPoint(-30.5F, -238F, 60F);
		bodyModel[48].rotateAngleX = 0.61086524F;

		bodyModel[49].addShapeBox(0F, 3F, 11F, 1, 20, 7, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[49].setRotationPoint(-30.5F, -238F, 60F);
		bodyModel[49].rotateAngleX = 0.61086524F;

		bodyModel[50].addShapeBox(0F, 3F, -8F, 1, 20, 7, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[50].setRotationPoint(-30.5F, -238F, -60F);
		bodyModel[50].rotateAngleX = -0.61086524F;

		bodyModel[51].addShapeBox(0F, 2F, -18F, 1, 10, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 77
		bodyModel[51].setRotationPoint(-30.5F, -238F, -60F);
		bodyModel[51].rotateAngleX = -0.61086524F;

		bodyModel[52].addShapeBox(0F, 3F, -18F, 1, 20, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 78
		bodyModel[52].setRotationPoint(-30.5F, -238F, -60F);
		bodyModel[52].rotateAngleX = -0.61086524F;

		bodyModel[53].addShapeBox(0F, 14F, -18F, 1, 10, 17, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[53].setRotationPoint(-30.5F, -238F, -60F);
		bodyModel[53].rotateAngleX = -0.61086524F;

		bodyModel[54].addBox(0F, 2F, -18F, 1, 22, 17, 0F); // Box 80
		bodyModel[54].setRotationPoint(-31.5F, -238F, -60F);
		bodyModel[54].rotateAngleX = -0.61086524F;

		bodyModel[55].addTrapezoid(0F, 1F, 0F, 1, 12, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 244
		bodyModel[55].setRotationPoint(58F, -236F, 22F);
		bodyModel[55].rotateAngleZ = -0.43633231F;

		bodyModel[56].addTrapezoid(0F, 31F, 0F, 1, 12, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 245
		bodyModel[56].setRotationPoint(58F, -236F, 22F);
		bodyModel[56].rotateAngleZ = -0.43633231F;

		bodyModel[57].addTrapezoid(0F, 15F, 0F, 1, 14, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 246
		bodyModel[57].setRotationPoint(58F, -236F, 22F);
		bodyModel[57].rotateAngleZ = -0.43633231F;

		bodyModel[58].addTrapezoid(0F, 15F, 5F, 1, 14, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 247
		bodyModel[58].setRotationPoint(58F, -236F, 22F);
		bodyModel[58].rotateAngleZ = -0.43633231F;

		bodyModel[59].addTrapezoid(-0.5F, 17F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 248
		bodyModel[59].setRotationPoint(58F, -236F, 22F);
		bodyModel[59].rotateAngleZ = -0.43633231F;

		bodyModel[60].addTrapezoid(-0.5F, 20F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 249
		bodyModel[60].setRotationPoint(58F, -236F, 22F);
		bodyModel[60].rotateAngleZ = -0.43633231F;

		bodyModel[61].addTrapezoid(-0.5F, 26F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 250
		bodyModel[61].setRotationPoint(58F, -236F, 22F);
		bodyModel[61].rotateAngleZ = -0.43633231F;

		bodyModel[62].addTrapezoid(-0.5F, 23F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 251
		bodyModel[62].setRotationPoint(58F, -236F, 22F);
		bodyModel[62].rotateAngleZ = -0.43633231F;

		bodyModel[63].addTrapezoid(0F, 1F, 0F, 1, 12, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 252
		bodyModel[63].setRotationPoint(58F, -236F, -30F);
		bodyModel[63].rotateAngleZ = -0.43633231F;

		bodyModel[64].addTrapezoid(0F, 15F, 0F, 1, 14, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 253
		bodyModel[64].setRotationPoint(58F, -236F, -30F);
		bodyModel[64].rotateAngleZ = -0.43633231F;

		bodyModel[65].addTrapezoid(0F, 15F, 5F, 1, 14, 3, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 254
		bodyModel[65].setRotationPoint(58F, -236F, -30F);
		bodyModel[65].rotateAngleZ = -0.43633231F;

		bodyModel[66].addTrapezoid(-0.5F, 17F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 255
		bodyModel[66].setRotationPoint(58F, -236F, -30F);
		bodyModel[66].rotateAngleZ = -0.43633231F;

		bodyModel[67].addTrapezoid(-0.5F, 20F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 256
		bodyModel[67].setRotationPoint(58F, -236F, -30F);
		bodyModel[67].rotateAngleZ = -0.43633231F;

		bodyModel[68].addTrapezoid(-0.5F, 23F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 257
		bodyModel[68].setRotationPoint(58F, -236F, -30F);
		bodyModel[68].rotateAngleZ = -0.43633231F;

		bodyModel[69].addTrapezoid(-0.5F, 26F, 3F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 258
		bodyModel[69].setRotationPoint(58F, -236F, -30F);
		bodyModel[69].rotateAngleZ = -0.43633231F;

		bodyModel[70].addTrapezoid(0F, 31F, 0F, 1, 12, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 259
		bodyModel[70].setRotationPoint(58F, -236F, -30F);
		bodyModel[70].rotateAngleZ = -0.43633231F;

		bodyModel[71].addBox(0F, 2F, 1F, 1, 22, 17, 0F); // Box 260
		bodyModel[71].setRotationPoint(-60.5F, -238F, 60F);
		bodyModel[71].rotateAngleX = 0.61086524F;

		bodyModel[72].addBox(0F, 2F, -18F, 1, 22, 17, 0F); // Box 261
		bodyModel[72].setRotationPoint(-60.5F, -238F, -60F);
		bodyModel[72].rotateAngleX = -0.61086524F;

		bodyModel[73].addShapeBox(0F, 3F, 11F, 1, 20, 7, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[73].setRotationPoint(-61.5F, -238F, 60F);
		bodyModel[73].rotateAngleX = 0.61086524F;

		bodyModel[74].addShapeBox(0F, 2F, 1F, 1, 10, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 263
		bodyModel[74].setRotationPoint(-61.5F, -238F, 60F);
		bodyModel[74].rotateAngleX = 0.61086524F;

		bodyModel[75].addShapeBox(0F, 3F, 1F, 1, 20, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 264
		bodyModel[75].setRotationPoint(-61.5F, -238F, 60F);
		bodyModel[75].rotateAngleX = 0.61086524F;

		bodyModel[76].addShapeBox(0F, 14F, 1F, 1, 10, 17, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[76].setRotationPoint(-61.5F, -238F, 60F);
		bodyModel[76].rotateAngleX = 0.61086524F;

		bodyModel[77].addShapeBox(0F, 2F, -18F, 1, 10, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 266
		bodyModel[77].setRotationPoint(-61.5F, -238F, -60F);
		bodyModel[77].rotateAngleX = -0.61086524F;

		bodyModel[78].addShapeBox(0F, 3F, -8F, 1, 20, 7, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[78].setRotationPoint(-61.5F, -238F, -60F);
		bodyModel[78].rotateAngleX = -0.61086524F;

		bodyModel[79].addShapeBox(0F, 14F, -18F, 1, 10, 17, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[79].setRotationPoint(-61.5F, -238F, -60F);
		bodyModel[79].rotateAngleX = -0.61086524F;

		bodyModel[80].addShapeBox(0F, 3F, -18F, 1, 20, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 269
		bodyModel[80].setRotationPoint(-61.5F, -238F, -60F);
		bodyModel[80].rotateAngleX = -0.61086524F;

		bodyModel[81].addTrapezoid(-25F, 0F, 0F, 25, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 270
		bodyModel[81].setRotationPoint(-9F, -265F, -37F);
		bodyModel[81].rotateAngleZ = -1.04719755F;

		bodyModel[82].addTrapezoid(-25F, 0F, 0F, 25, 5, 5, 0F, -2.00F, ModelRendererTurbo.MR_RIGHT); // Box 271
		bodyModel[82].setRotationPoint(-9F, -265F, 32F);
		bodyModel[82].rotateAngleZ = -1.04719755F;

		bodyModel[83].addTrapezoid(-78F, 2F, 0F, 53, 1, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 272
		bodyModel[83].setRotationPoint(-9F, -265F, 34F);
		bodyModel[83].rotateAngleZ = -1.04719755F;


		headModel = new ModelRendererTurbo[101];
		headModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import ImportHead1
		headModel[1] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import ImportHead2
		headModel[2] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import ImportHead3
		headModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import ImportHead4
		headModel[4] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import ImportHead6
		headModel[5] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportHead7
		headModel[6] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import ImportHead8
		headModel[7] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import ImportHead9
		headModel[8] = new ModelRendererTurbo(this, 50, 270, textureX, textureY); // Import ImportHead10
		headModel[9] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportHead11
		headModel[10] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Import ImportHead12
		headModel[11] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import ImportHead13
		headModel[12] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import ImportHead14
		headModel[13] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import ImportHead15
		headModel[14] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import ImportHead16
		headModel[15] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import ImportHead17
		headModel[16] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Import ImportHead18
		headModel[17] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import ImportHead19
		headModel[18] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import ImportHead20
		headModel[19] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Import ImportHead21
		headModel[20] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import ImportHead22
		headModel[21] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import ImportHead23
		headModel[22] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import ImportHead24
		headModel[23] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import ImportHead25
		headModel[24] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Import ImportHead26
		headModel[25] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import ImportHead27
		headModel[26] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import ImportHead28
		headModel[27] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import ImportHead29
		headModel[28] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 0
		headModel[29] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 1
		headModel[30] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 2
		headModel[31] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 3
		headModel[32] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 4
		headModel[33] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 5
		headModel[34] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 6
		headModel[35] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 7
		headModel[36] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 8
		headModel[37] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 9
		headModel[38] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 10
		headModel[39] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 12
		headModel[40] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 20
		headModel[41] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 21
		headModel[42] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 22
		headModel[43] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 23
		headModel[44] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 24
		headModel[45] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 25
		headModel[46] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 26
		headModel[47] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 27
		headModel[48] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 28
		headModel[49] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 29
		headModel[50] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 30
		headModel[51] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 31
		headModel[52] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 32
		headModel[53] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 33
		headModel[54] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 34
		headModel[55] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 35
		headModel[56] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 36
		headModel[57] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 37
		headModel[58] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 38
		headModel[59] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 40
		headModel[60] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 41
		headModel[61] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 42
		headModel[62] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 43
		headModel[63] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 44
		headModel[64] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 45
		headModel[65] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 46
		headModel[66] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 47
		headModel[67] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 66
		headModel[68] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 67
		headModel[69] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 68
		headModel[70] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Box 69
		headModel[71] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 273
		headModel[72] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 274
		headModel[73] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 275
		headModel[74] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 276
		headModel[75] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 277
		headModel[76] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 278
		headModel[77] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 295
		headModel[78] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 296
		headModel[79] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 297
		headModel[80] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 298
		headModel[81] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 299
		headModel[82] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 300
		headModel[83] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 301
		headModel[84] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 302
		headModel[85] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 303
		headModel[86] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 304
		headModel[87] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 305
		headModel[88] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 306
		headModel[89] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 307
		headModel[90] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 308
		headModel[91] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 309
		headModel[92] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 310
		headModel[93] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 311
		headModel[94] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 312
		headModel[95] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 313
		headModel[96] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 314
		headModel[97] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 315
		headModel[98] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 316
		headModel[99] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 317
		headModel[100] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Box 318

		headModel[0].addShapeBox(0F, 0F, 0F, 34, 4, 30, 0F, 0F, 0F, 2F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 2F); // Import ImportHead1
		headModel[0].setRotationPoint(31.5F, -238F, -15F);

		headModel[1].addShapeBox(0F, 0F, 0F, 33, 5, 2, 0F, 0F, 0F, 2F, 0F, -22F, -13F, 0F, -22F, 13F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 18F, -13F, 0F, 18F, 13F, 0F, 0F, -2F); // Import ImportHead2
		headModel[1].setRotationPoint(31.5F, -265F, -15F);

		headModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, -0.66F, -0.4F, 0F, -0.66F, -0.4F, 0F, 0F, 0F, 2F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.8F); // Import ImportHead3
		headModel[2].setRotationPoint(64.5F, -243F, -2F);

		headModel[3].addShapeBox(0F, 0F, 0F, 33, 5, 2, 0F, 0F, 0F, -2F, 0F, -22F, 13F, 0F, -22F, -13F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 18F, 13F, 0F, 18F, -13F, 0F, 0F, 2F); // Import ImportHead4
		headModel[3].setRotationPoint(31.5F, -265F, 13F);

		headModel[4].addShapeBox(0F, 0F, 0F, 33, 1, 26, 0F, 0F, 0F, 2F, 0F, -22F, -13F, 0F, -22F, -13F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 22F, -13F, 0F, 22F, -13F, 0F, 0F, 2F); // Import ImportHead6
		headModel[4].setRotationPoint(31.5F, -265F, -13F);

		headModel[5].addBox(0F, 0F, 0F, 12, 2, 30, 0F); // Import ImportHead7
		headModel[5].setRotationPoint(19.5F, -265F, -15F);

		headModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 30, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import ImportHead8
		headModel[6].setRotationPoint(19.5F, -238F, -15F);

		headModel[7].addBox(0F, 0F, 0F, 12, 25, 2, 0F); // Import ImportHead9
		headModel[7].setRotationPoint(19.5F, -263F, -17F);

		headModel[8].addBox(0F, 0F, 0F, 12, 25, 2, 0F); // Import ImportHead10
		headModel[8].setRotationPoint(19.5F, -263F, 15F);

		headModel[9].addBox(0F, 0F, 0F, 2, 31, 30, 0F); // Import ImportHead11
		headModel[9].setRotationPoint(17.5F, -265F, -15F);

		headModel[10].addShapeBox(0F, 0F, 0F, 34, 16, 30, 0F, 0F, 0F, 2F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 2F, 0F, 5F, -13F, -32F, 5F, -13F, -32F, 5F, -13F, 0F, 5F, -13F); // Import ImportHead12
		headModel[10].setRotationPoint(31.5F, -234F, -15F);

		headModel[11].addShapeBox(0F, 0F, 0F, 15, 36, 6, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 6F, 0F, 6F, 0F, 0F, 6F, 0F, -2F, 0F, 6F, -2F); // Import ImportHead13
		headModel[11].setRotationPoint(17.5F, -270F, -21F);

		headModel[12].addShapeBox(0F, 0F, 0F, 15, 36, 6, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 6F, -2F, 6F, 0F, -2F, 6F, 0F, 0F, 0F, 6F, 0F); // Import ImportHead14
		headModel[12].setRotationPoint(17.5F, -270F, 15F);

		headModel[13].addShapeBox(0F, 0F, 0F, 15, 5, 30, 0F, 0F, 0F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 2F); // Import ImportHead15
		headModel[13].setRotationPoint(17.5F, -270F, -15F);

		headModel[14].addBox(0F, 0F, 0F, 55, 36, 42, 0F); // Import ImportHead16
		headModel[14].setRotationPoint(-37.5F, -270F, -21F);

		headModel[15].addShapeBox(0F, 0F, 0F, 55, 6, 25, 0F, -5F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportHead17
		headModel[15].setRotationPoint(-37.5F, -276F, -12.5F);

		headModel[16].addBox(0F, 0F, 0F, 12, 16, 56, 0F); // Import ImportHead18
		headModel[16].setRotationPoint(19.5F, -234F, -28F);

		headModel[17].addShapeBox(0F, 0F, 0F, 10, 5, 56, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import ImportHead19
		headModel[17].setRotationPoint(19.5F, -205F, -28F);

		headModel[18].addShapeBox(0F, 0F, 0F, 6, 5, 56, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import ImportHead20
		headModel[18].setRotationPoint(19.5F, -200F, -28F);

		headModel[19].addShapeBox(0F, 0F, 0F, 12, 13, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import ImportHead21
		headModel[19].setRotationPoint(19.5F, -218F, -28F);

		headModel[20].addShapeBox(0F, 0F, 0F, 7, 7, 56, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import ImportHead22
		headModel[20].setRotationPoint(-28F, -195F, -28F);

		headModel[21].addBox(0F, 0F, 0F, 36, 7, 56, 0F); // Import ImportHead23
		headModel[21].setRotationPoint(-21F, -195F, -28F);

		headModel[22].addShapeBox(0F, 0F, 0F, 16, 36, 42, 0F, 0F, -25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F); // Import ImportHead24
		headModel[22].setRotationPoint(-53.5F, -270F, -21F);

		headModel[23].addBox(0F, 0F, 0F, 51, 20, 56, 0F); // Import ImportHead25
		headModel[23].setRotationPoint(-31.5F, -234F, -28F);

		headModel[24].addShapeBox(0F, 0F, 0F, 5, 20, 56, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Import ImportHead26
		headModel[24].setRotationPoint(-36.5F, -234F, -28F);

		headModel[25].addShapeBox(0F, 0F, 0F, 7, 7, 56, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import ImportHead27
		headModel[25].setRotationPoint(15F, -195F, -28F);

		headModel[26].addBox(0F, 0F, 0F, 46, 19, 56, 0F); // Import ImportHead28
		headModel[26].setRotationPoint(-26.5F, -214F, -28F);

		headModel[27].addShapeBox(0F, 0F, 0F, 5, 19, 56, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Import ImportHead29
		headModel[27].setRotationPoint(-31.5F, -214F, -28F);

		headModel[28].addShapeBox(0F, 0F, 0F, 55, 15, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[28].setRotationPoint(-32.5F, -267F, 37.5F);

		headModel[29].addShapeBox(0F, 0F, 0F, 55, 2, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[29].setRotationPoint(-32.5F, -269F, 37.5F);

		headModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		headModel[30].setRotationPoint(22.5F, -267F, 38.5F);

		headModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[31].setRotationPoint(22.5F, -267F, 50.5F);

		headModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		headModel[32].setRotationPoint(22.5F, -267F, 44.5F);

		headModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		headModel[33].setRotationPoint(22.5F, -263F, 44.5F);

		headModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[34].setRotationPoint(22.5F, -263F, 38.5F);

		headModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[35].setRotationPoint(22.5F, -263F, 50.5F);

		headModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		headModel[36].setRotationPoint(22.5F, -259F, 44.5F);

		headModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[37].setRotationPoint(22.5F, -259F, 38.5F);

		headModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		headModel[38].setRotationPoint(22.5F, -259F, 50.5F);

		headModel[39].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 12
		headModel[39].setRotationPoint(23.5F, -267F, 50.5F);

		headModel[40].addShapeBox(0F, 0F, 0F, 26, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[40].setRotationPoint(-24.5F, -271F, 42.5F);

		headModel[41].addShapeBox(0F, 0F, 0F, 26, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		headModel[41].setRotationPoint(-24.5F, -272F, 42.5F);

		headModel[42].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		headModel[42].setRotationPoint(1.5F, -271.5F, 44.5F);

		headModel[43].addShapeBox(0F, 0F, 0F, 26, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[43].setRotationPoint(-13.5F, -266F, 54.5F);

		headModel[44].addShapeBox(0F, 0F, 0F, 55, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		headModel[44].setRotationPoint(-32.5F, -262F, -47.5F);

		headModel[45].addTrapezoid(0F, 0F, 0F, 4, 10, 10, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 25
		headModel[45].setRotationPoint(22.5F, -262F, -47.5F);

		headModel[46].addTrapezoid(0F, 0F, 0F, 4, 8, 8, 0F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 26
		headModel[46].setRotationPoint(26.5F, -261F, -46.5F);

		headModel[47].addTrapezoid(0F, 0F, 0F, 2, 4, 4, 0F, -1.90F, ModelRendererTurbo.MR_LEFT); // Box 27
		headModel[47].setRotationPoint(30.5F, -259F, -44.5F);

		headModel[48].addShapeBox(0F, 0F, 0F, 55, 4, 3, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[48].setRotationPoint(-41.5F, -266F, -42.5F);

		headModel[49].addShapeBox(0F, 0F, 0F, 55, 4, 2, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[49].setRotationPoint(-41.5F, -264F, -45.5F);

		headModel[50].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[50].setRotationPoint(-6.5F, -265.5F, -41.5F);

		headModel[51].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		headModel[51].setRotationPoint(0.5F, -263.5F, -41.5F);

		headModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		headModel[52].setRotationPoint(-29.5F, -278F, -3F);

		headModel[53].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		headModel[53].setRotationPoint(-27.5F, -282F, -1F);

		headModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		headModel[54].setRotationPoint(-27.5F, -282F, -2F);

		headModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		headModel[55].setRotationPoint(-27.5F, -280F, -2F);

		headModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		headModel[56].setRotationPoint(-27.5F, -280F, 1F);

		headModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		headModel[57].setRotationPoint(-27.5F, -282F, 1F);

		headModel[58].addShapeBox(-106F, 0F, 0F, 12, 21, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		headModel[58].setRotationPoint(129F, -236F, 31F);

		headModel[59].addShapeBox(0F, 0F, 0F, 12, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F); // Box 40
		headModel[59].setRotationPoint(35F, -219F, 31F);

		headModel[60].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		headModel[60].setRotationPoint(35F, -221F, 37F);

		headModel[61].addShapeBox(0F, 0F, 0F, 12, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F); // Box 42
		headModel[61].setRotationPoint(35F, -236F, 31F);

		headModel[62].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		headModel[62].setRotationPoint(35F, -223F, 37F);

		headModel[63].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		headModel[63].setRotationPoint(35F, -225F, 37F);

		headModel[64].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		headModel[64].setRotationPoint(35F, -232F, 39F);

		headModel[65].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		headModel[65].setRotationPoint(35F, -230F, 39F);

		headModel[66].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 47
		headModel[66].setRotationPoint(35F, -228F, 39F);

		headModel[67].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		headModel[67].setRotationPoint(-8.5F, -258F, 57F);

		headModel[68].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		headModel[68].setRotationPoint(-30.5F, -260F, 57F);

		headModel[69].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		headModel[69].setRotationPoint(-8.5F, -258F, -59F);

		headModel[70].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		headModel[70].setRotationPoint(-30.5F, -260F, -59F);

		headModel[71].addShapeBox(0F, 0F, 0F, 16, 25, 4, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		headModel[71].setRotationPoint(-53.5F, -270F, -12.5F);

		headModel[72].addShapeBox(0F, 0F, 0F, 16, 25, 4, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		headModel[72].setRotationPoint(-53.5F, -270F, 8.5F);

		headModel[73].addTrapezoid(0F, 0F, 0F, 13, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 275
		headModel[73].setRotationPoint(24.5F, -263.5F, -41.5F);

		headModel[74].addTrapezoid(0F, 0F, 0F, 3, 1, 1, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 276
		headModel[74].setRotationPoint(17.5F, -265.5F, -41.5F);

		headModel[75].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 277
		headModel[75].setRotationPoint(25.5F, -266.5F, 51F);

		headModel[76].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 278
		headModel[76].setRotationPoint(26.5F, -266.5F, 51F);

		headModel[77].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 295
		headModel[77].setRotationPoint(25.5F, -266.5F, 45F);

		headModel[78].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 296
		headModel[78].setRotationPoint(23.5F, -267F, 44.5F);

		headModel[79].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 297
		headModel[79].setRotationPoint(26.5F, -266.5F, 45F);

		headModel[80].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 298
		headModel[80].setRotationPoint(25.5F, -266.5F, 39F);

		headModel[81].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 299
		headModel[81].setRotationPoint(23.5F, -267F, 38.5F);

		headModel[82].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 300
		headModel[82].setRotationPoint(26.5F, -266.5F, 39F);

		headModel[83].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 301
		headModel[83].setRotationPoint(25.5F, -262.5F, 39F);

		headModel[84].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 302
		headModel[84].setRotationPoint(23.5F, -263F, 38.5F);

		headModel[85].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 303
		headModel[85].setRotationPoint(26.5F, -262.5F, 39F);

		headModel[86].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 304
		headModel[86].setRotationPoint(23.5F, -263F, 44.5F);

		headModel[87].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 305
		headModel[87].setRotationPoint(25.5F, -262.5F, 45F);

		headModel[88].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 306
		headModel[88].setRotationPoint(26.5F, -262.5F, 45F);

		headModel[89].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 307
		headModel[89].setRotationPoint(23.5F, -263F, 50.5F);

		headModel[90].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 308
		headModel[90].setRotationPoint(25.5F, -262.5F, 51F);

		headModel[91].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 309
		headModel[91].setRotationPoint(26.5F, -262.5F, 51F);

		headModel[92].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 310
		headModel[92].setRotationPoint(25.5F, -258.5F, 39F);

		headModel[93].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 311
		headModel[93].setRotationPoint(23.5F, -259F, 38.5F);

		headModel[94].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 312
		headModel[94].setRotationPoint(26.5F, -258.5F, 39F);

		headModel[95].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 313
		headModel[95].setRotationPoint(23.5F, -259F, 44.5F);

		headModel[96].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 314
		headModel[96].setRotationPoint(25.5F, -258.5F, 45F);

		headModel[97].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 315
		headModel[97].setRotationPoint(26.5F, -258.5F, 45F);

		headModel[98].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 316
		headModel[98].setRotationPoint(23.5F, -259F, 50.5F);

		headModel[99].addTrapezoid(0F, 0F, 0F, 1, 2, 2, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 317
		headModel[99].setRotationPoint(25.5F, -258.5F, 51F);

		headModel[100].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_LEFT); // Box 318
		headModel[100].setRotationPoint(26.5F, -258.5F, 51F);


		hipsModel = new ModelRendererTurbo[4];
		hipsModel[0] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Import ImportHips1
		hipsModel[1] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Import ImportHips2
		hipsModel[2] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import ImportHips3
		hipsModel[3] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Import ImportHips4

		hipsModel[0].addBox(0F, 0F, 0F, 36, 5, 56, 0F); // Import ImportHips1
		hipsModel[0].setRotationPoint(-21F, -188F, -28F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 56, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import ImportHips2
		hipsModel[1].setRotationPoint(15F, -188F, -28F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 7, 5, 56, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import ImportHips3
		hipsModel[2].setRotationPoint(-28F, -188F, -28F);

		hipsModel[3].addShapeBox(0F, 0F, 0F, 50, 28, 12, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import ImportHips4
		hipsModel[3].setRotationPoint(-28F, -183F, -6F);


		leftArmModel = new ModelRendererTurbo[13];
		leftArmModel[0] = new ModelRendererTurbo(this, 400, 1000, textureX, textureY); // Import Arm1
		leftArmModel[1] = new ModelRendererTurbo(this, 460, 1000, textureX, textureY); // Import Arm2
		leftArmModel[2] = new ModelRendererTurbo(this, 400, 1050, textureX, textureY); // Import Arm3
		leftArmModel[3] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Import Arm4
		leftArmModel[4] = new ModelRendererTurbo(this, 400, 1150, textureX, textureY); // Import Arm5
		leftArmModel[5] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // Import Arm6
		leftArmModel[6] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // Import Arm7
		leftArmModel[7] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // Import Arm8
		leftArmModel[8] = new ModelRendererTurbo(this, 400, 1350, textureX, textureY); // Import Arm9
		leftArmModel[9] = new ModelRendererTurbo(this, 400, 1350, textureX, textureY); // Import Arm10
		leftArmModel[10] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Import Arm11
		leftArmModel[11] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // Import Arm12
		leftArmModel[12] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // Import Arm13

		leftArmModel[0].addBox(5F, -12.5F, 9.5F, 21, 20, 2, 0F); // Import Arm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.570796F;

		leftArmModel[1].addBox(5F, -12.5F, -11.5F, 21, 20, 2, 0F); // Import Arm2
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.570796F;

		leftArmModel[2].addBox(3F, -12.5F, -11.5F, 2, 20, 23, 0F); // Import Arm3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.570796F;

		leftArmModel[3].addBox(3F, -20.5F, -11.5F, 34, 8, 23, 0F); // Import Arm4
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.570796F;

		leftArmModel[4].addBox(-44F, -29.5F, -5F, 39, 16, 10, 0F); // Import Arm5
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -2.565634F;

		leftArmModel[5].addShapeBox(-36F, -39.5F, -5F, 39, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Import Arm6
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -2.565634F;

		leftArmModel[6].addBox(-74F, -20.5F, -2F, 30, 4, 4, 0F); // Import Arm7
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -2.565634F;

		leftArmModel[7].addBox(-59F, -27.5F, -2F, 15, 4, 4, 0F); // Import Arm8
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -2.565634F;

		leftArmModel[8].addBox(30F, -12.5F, -11.5F, 4, 20, 2, 0F); // Import Arm9
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.570796F;

		leftArmModel[9].addBox(30F, -12.5F, 9.5F, 4, 20, 2, 0F); // Import Arm10
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.570796F;

		leftArmModel[10].addShapeBox(18F, -26.5F, -4.5F, 34, 13, 9, 0F, 0F, 4F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Arm11
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.570796F;

		leftArmModel[11].addBox(52F, -16.5F, -1F, 10, 2, 2, 0F); // Import Arm12
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.570796F;

		leftArmModel[12].addBox(52F, -20.5F, -1F, 10, 2, 2, 0F); // Import Arm13
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.570796F;


		rightArmModel = new ModelRendererTurbo[13];
		rightArmModel[0] = new ModelRendererTurbo(this, 400, 1000, textureX, textureY); // Import Arm1
		rightArmModel[1] = new ModelRendererTurbo(this, 460, 1000, textureX, textureY); // Import Arm2
		rightArmModel[2] = new ModelRendererTurbo(this, 400, 1050, textureX, textureY); // Import Arm3
		rightArmModel[3] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Import Arm4
		rightArmModel[4] = new ModelRendererTurbo(this, 400, 1150, textureX, textureY); // Import Arm5
		rightArmModel[5] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // Import Arm6
		rightArmModel[6] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // Import Arm7
		rightArmModel[7] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // Import Arm8
		rightArmModel[8] = new ModelRendererTurbo(this, 400, 1350, textureX, textureY); // Import Arm9
		rightArmModel[9] = new ModelRendererTurbo(this, 400, 1350, textureX, textureY); // Import Arm10
		rightArmModel[10] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Import Arm11
		rightArmModel[11] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // Import Arm12
		rightArmModel[12] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // Import Arm13

		rightArmModel[0].addBox(5F, -12.5F, 9.5F, 21, 20, 2, 0F); // Import Arm1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.570796F;

		rightArmModel[1].addBox(5F, -12.5F, -11.5F, 21, 20, 2, 0F); // Import Arm2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.570796F;

		rightArmModel[2].addBox(3F, -12.5F, -11.5F, 2, 20, 23, 0F); // Import Arm3
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -1.570796F;

		rightArmModel[3].addBox(3F, -20.5F, -11.5F, 34, 8, 23, 0F); // Import Arm4
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -1.570796F;

		rightArmModel[4].addBox(-44F, -29.5F, -5F, 39, 16, 10, 0F); // Import Arm5
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -2.565634F;

		rightArmModel[5].addShapeBox(-36F, -39.5F, -5F, 39, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Import Arm6
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -2.565634F;

		rightArmModel[6].addBox(-74F, -20.5F, -2F, 30, 4, 4, 0F); // Import Arm7
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -2.565634F;

		rightArmModel[7].addBox(-59F, -27.5F, -2F, 15, 4, 4, 0F); // Import Arm8
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -2.565634F;

		rightArmModel[8].addBox(30F, -12.5F, -11.5F, 4, 20, 2, 0F); // Import Arm9
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -1.570796F;

		rightArmModel[9].addBox(30F, -12.5F, 9.5F, 4, 20, 2, 0F); // Import Arm10
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -1.570796F;

		rightArmModel[10].addShapeBox(18F, -26.5F, -4.5F, 34, 13, 9, 0F, 0F, 4F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Arm11
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -1.570796F;

		rightArmModel[11].addBox(52F, -16.5F, -1F, 10, 2, 2, 0F); // Import Arm12
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -1.570796F;

		rightArmModel[12].addBox(52F, -20.5F, -1F, 10, 2, 2, 0F); // Import Arm13
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -1.570796F;


		leftLegModel = new ModelRendererTurbo[31];
		leftLegModel[0] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import ImportLeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Import ImportLefttLeg2
		leftLegModel[2] = new ModelRendererTurbo(this, 200, 1100, textureX, textureY); // Import ImportLeftLeg3
		leftLegModel[3] = new ModelRendererTurbo(this, 200, 1150, textureX, textureY); // Import ImportLefttLeg4
		leftLegModel[4] = new ModelRendererTurbo(this, 200, 1205, textureX, textureY); // Import ImportLeftLeg5
		leftLegModel[5] = new ModelRendererTurbo(this, 200, 1250, textureX, textureY); // Import ImportLeftLeg6
		leftLegModel[6] = new ModelRendererTurbo(this, 200, 1300, textureX, textureY); // Import ImportLeftLeg7
		leftLegModel[7] = new ModelRendererTurbo(this, 200, 1350, textureX, textureY); // Import ImportLeftLeg8
		leftLegModel[8] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Import ImportLeftLeg9
		leftLegModel[9] = new ModelRendererTurbo(this, 200, 1450, textureX, textureY); // Import ImportLeftLeg10
		leftLegModel[10] = new ModelRendererTurbo(this, 200, 1600, textureX, textureY); // Import ImportLeftLeg11
		leftLegModel[11] = new ModelRendererTurbo(this, 200, 1650, textureX, textureY); // Import ImportLefttLeg12
		leftLegModel[12] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Import ImportLeftLeg13
		leftLegModel[13] = new ModelRendererTurbo(this, 200, 1750, textureX, textureY); // Import ImportLeftLeg14
		leftLegModel[14] = new ModelRendererTurbo(this, 200, 1800, textureX, textureY); // Import ImportLeftLeg15
		leftLegModel[15] = new ModelRendererTurbo(this, 200, 1850, textureX, textureY); // Import ImportLeftLeg16
		leftLegModel[16] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Import ImportLeftLeg17
		leftLegModel[17] = new ModelRendererTurbo(this, 200, 1950, textureX, textureY); // Import ImportLeftLeg18
		leftLegModel[18] = new ModelRendererTurbo(this, 200, 2000, textureX, textureY); // Import ImportLeftLeg19
		leftLegModel[19] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import ImportLeftLeg20
		leftLegModel[20] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import ImportLeftLeg21
		leftLegModel[21] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import ImportLeftLeg22
		leftLegModel[22] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import ImportLeftLeg23
		leftLegModel[23] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import ImportLeftLeg24
		leftLegModel[24] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftLeg25
		leftLegModel[25] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import ImportLeftLeg26
		leftLegModel[26] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import ImportLeftLeg27
		leftLegModel[27] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import ImportLeftLeg28
		leftLegModel[28] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import ImportLeftLeg29
		leftLegModel[29] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Box 81
		leftLegModel[30] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Box 82

		leftLegModel[0].addShapeBox(-8F, -8F, 0F, 16, 16, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 11F, 0F, 0F); // Import ImportLeftLeg1
		leftLegModel[0].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[0].rotateAngleZ = -1.047198F;

		leftLegModel[1].addBox(-8F, -27F, 14F, 37, 25, 18, 0F); // Import ImportLefttLeg2
		leftLegModel[1].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[1].rotateAngleZ = -1.04719755F;

		leftLegModel[2].addBox(-9F, -15F, 15F, 44, 30, 16, 0F); // Import ImportLeftLeg3
		leftLegModel[2].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[2].rotateAngleZ = -1.047198F;

		leftLegModel[3].addShapeBox(-19F, -15F, 15F, 10, 30, 16, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Import ImportLefttLeg4
		leftLegModel[3].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[3].rotateAngleZ = -1.047198F;

		leftLegModel[4].addShapeBox(-19F, -7F, 31F, 43, 15, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -30F, 0F, 0F); // Import ImportLeftLeg5
		leftLegModel[4].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[4].rotateAngleZ = -1.047198F;

		leftLegModel[5].addShapeBox(29F, -27F, 16F, 22, 12, 14, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg6
		leftLegModel[5].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[5].rotateAngleZ = -1.047198F;

		leftLegModel[6].addBox(-9F, 0F, 16F, 40, 19, 16, 0F); // Import ImportLeftLeg7
		leftLegModel[6].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[6].rotateAngleZ = -1.047198F;

		leftLegModel[7].addBox(-5F, 8F, 17F, 19, 12, 17, 0F); // Import ImportLeftLeg8
		leftLegModel[7].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[7].rotateAngleZ = -1.047198F;

		leftLegModel[8].addBox(35F, -14F, 26F, 18, 18, 14, 0F); // Import ImportLeftLeg9
		leftLegModel[8].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[8].rotateAngleZ = -1.047198F;

		leftLegModel[9].addShapeBox(35F, -15F, 15F, 17, 30, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg10
		leftLegModel[9].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[9].rotateAngleZ = -1.047198F;

		leftLegModel[10].addShapeBox(49F, -9F, 40F, 21, 21, 14, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg11
		leftLegModel[10].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[10].rotateAngleZ = -0.9075712F;

		leftLegModel[11].addBox(35F, 6F, 42F, 24, 25, 11, 0F); // Import ImportLefttLeg12
		leftLegModel[11].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[11].rotateAngleZ = -0.9075712F;

		leftLegModel[12].addBox(9F, 22F, 39F, 39, 20, 20, 0F); // Import ImportLeftLeg13
		leftLegModel[12].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[12].rotateAngleZ = -0.2617994F;

		leftLegModel[13].addBox(-32F, 27F, 41F, 37, 11, 16, 0F); // Import ImportLeftLeg14
		leftLegModel[13].setRotationPoint(-3F, -163F, 6F);

		leftLegModel[14].addBox(-32F, 38F, 43F, 37, 15, 9, 0F); // Import ImportLeftLeg15
		leftLegModel[14].setRotationPoint(-3F, -163F, 6F);

		leftLegModel[15].addBox(-8F, 41F, 40.5F, 17, 17, 17, 0F); // Import ImportLeftLeg16
		leftLegModel[15].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[15].rotateAngleZ = -0.6981317F;

		leftLegModel[16].addShapeBox(59F, 12F, 43F, 11, 19, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg17
		leftLegModel[16].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[16].rotateAngleZ = -0.9075712F;

		leftLegModel[17].addShapeBox(-8F, 41F, 39F, 25, 25, 20, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Import ImportLeftLeg18
		leftLegModel[17].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[17].rotateAngleZ = -0.9599311F;

		leftLegModel[18].addBox(17F, 41F, 39F, 33, 25, 20, 0F); // Import ImportLeftLeg19
		leftLegModel[18].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[18].rotateAngleZ = -0.9599311F;

		leftLegModel[19].addShapeBox(17F, 41F, 59F, 33, 25, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, -10F, -2F, 0F); // Import ImportLeftLeg20
		leftLegModel[19].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[19].rotateAngleZ = -0.9599311F;

		leftLegModel[20].addShapeBox(17F, 66F, 39F, 33, 11, 20, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Import ImportLeftLeg21
		leftLegModel[20].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[20].rotateAngleZ = -0.9599311F;

		leftLegModel[21].addBox(50F, 55F, 41F, 78, 12, 16, 0F); // Import ImportLeftLeg22
		leftLegModel[21].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[21].rotateAngleZ = -0.9599311F;

		leftLegModel[22].addShapeBox(50F, 41F, 39F, 56, 14, 20, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg23
		leftLegModel[22].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[22].rotateAngleZ = -0.9599311F;

		leftLegModel[23].addBox(53F, 8F, 40F, 28, 10, 18, 0F); // Import ImportLeftLeg24
		leftLegModel[23].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[23].rotateAngleZ = -1.44862328F;

		leftLegModel[24].addShapeBox(56F, 67F, 41F, 47, 9, 16, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg25
		leftLegModel[24].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[24].rotateAngleZ = -0.95993109F;

		leftLegModel[25].addShapeBox(-2F, 83F, 42F, 28, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg26
		leftLegModel[25].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[25].rotateAngleZ = -0.4712389F;

		leftLegModel[26].addShapeBox(106F, 44F, 39F, 34, 10, 20, 0F, 0F, 0F, -4F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import ImportLeftLeg27
		leftLegModel[26].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[26].rotateAngleZ = -0.9599311F;

		leftLegModel[27].addShapeBox(106F, 54F, 57F, 29, 12, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F); // Import ImportLeftLeg28
		leftLegModel[27].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[27].rotateAngleZ = -0.9599311F;

		leftLegModel[28].addShapeBox(106F, 54F, 30F, 29, 12, 11, 0F, 0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportLeftLeg29
		leftLegModel[28].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[28].rotateAngleZ = -0.9599311F;

		leftLegModel[29].addTrapezoid(-7F, -28F, 15F, 16, 1, 16, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 81
		leftLegModel[29].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[29].rotateAngleZ = -1.04719755F;

		leftLegModel[30].addTrapezoid(12F, -28F, 15F, 16, 1, 16, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 82
		leftLegModel[30].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[30].rotateAngleZ = -1.04719755F;


		rightLegModel = new ModelRendererTurbo[31];
		rightLegModel[0] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import ImportRightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Import ImportRightLeg2
		rightLegModel[2] = new ModelRendererTurbo(this, 200, 1100, textureX, textureY); // Import ImportRightLeg3
		rightLegModel[3] = new ModelRendererTurbo(this, 200, 1150, textureX, textureY); // Import ImportRightLeg4
		rightLegModel[4] = new ModelRendererTurbo(this, 200, 1205, textureX, textureY); // Import ImportRightLeg5
		rightLegModel[5] = new ModelRendererTurbo(this, 200, 1250, textureX, textureY); // Import ImportRightLeg6
		rightLegModel[6] = new ModelRendererTurbo(this, 200, 1300, textureX, textureY); // Import ImportRightLeg7
		rightLegModel[7] = new ModelRendererTurbo(this, 200, 1350, textureX, textureY); // Import ImportRightLeg8
		rightLegModel[8] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Import ImportRightLeg9
		rightLegModel[9] = new ModelRendererTurbo(this, 200, 1450, textureX, textureY); // Import ImportRightLeg10
		rightLegModel[10] = new ModelRendererTurbo(this, 200, 1600, textureX, textureY); // Import ImportRightLeg11
		rightLegModel[11] = new ModelRendererTurbo(this, 200, 1650, textureX, textureY); // Import ImportRightLeg12
		rightLegModel[12] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Import ImportRightLeg13
		rightLegModel[13] = new ModelRendererTurbo(this, 200, 1750, textureX, textureY); // Import ImportRightLeg14
		rightLegModel[14] = new ModelRendererTurbo(this, 200, 1800, textureX, textureY); // Import ImportRightLeg15
		rightLegModel[15] = new ModelRendererTurbo(this, 200, 1850, textureX, textureY); // Import ImportRightLeg16
		rightLegModel[16] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Import ImportRightLeg17
		rightLegModel[17] = new ModelRendererTurbo(this, 200, 1950, textureX, textureY); // Import ImportRightLeg18
		rightLegModel[18] = new ModelRendererTurbo(this, 200, 2000, textureX, textureY); // Import ImportRightLeg19
		rightLegModel[19] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import ImportRightLeg20
		rightLegModel[20] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import ImportRightLeg21
		rightLegModel[21] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import ImportRightLeg22
		rightLegModel[22] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import ImportRightLeg23
		rightLegModel[23] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import ImportRightLeg24
		rightLegModel[24] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightLeg25
		rightLegModel[25] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import ImportRightLeg26
		rightLegModel[26] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import ImportRightLeg27
		rightLegModel[27] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import ImportRightLeg28
		rightLegModel[28] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import ImportRightLeg29
		rightLegModel[29] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Box 83
		rightLegModel[30] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Box 84

		rightLegModel[0].addShapeBox(-8F, -8F, -15F, 16, 16, 15, 0F, 11F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg1
		rightLegModel[0].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[0].rotateAngleZ = -1.047198F;

		rightLegModel[1].addBox(-8F, -27F, -32F, 37, 25, 18, 0F); // Import ImportRightLeg2
		rightLegModel[1].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[1].rotateAngleZ = -1.047198F;

		rightLegModel[2].addBox(-9F, -15F, -31F, 44, 30, 16, 0F); // Import ImportRightLeg3
		rightLegModel[2].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[2].rotateAngleZ = -1.047198F;

		rightLegModel[3].addShapeBox(-19F, -15F, -31F, 10, 30, 16, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Import ImportRightLeg4
		rightLegModel[3].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[3].rotateAngleZ = -1.047198F;

		rightLegModel[4].addShapeBox(-19F, -7F, -39F, 43, 15, 8, 0F, -30F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg5
		rightLegModel[4].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[4].rotateAngleZ = -1.047198F;

		rightLegModel[5].addShapeBox(29F, -27F, -30F, 22, 12, 14, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg6
		rightLegModel[5].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[5].rotateAngleZ = -1.047198F;

		rightLegModel[6].addBox(-9F, 0F, -32F, 40, 19, 16, 0F); // Import ImportRightLeg7
		rightLegModel[6].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[6].rotateAngleZ = -1.047198F;

		rightLegModel[7].addBox(-5F, 8F, -34F, 19, 12, 17, 0F); // Import ImportRightLeg8
		rightLegModel[7].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[7].rotateAngleZ = -1.047198F;

		rightLegModel[8].addBox(35F, -14F, -40F, 18, 18, 14, 0F); // Import ImportRightLeg9
		rightLegModel[8].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[8].rotateAngleZ = -1.047198F;

		rightLegModel[9].addShapeBox(35F, -15F, -31F, 17, 30, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Import ImportRightLeg10
		rightLegModel[9].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[9].rotateAngleZ = -1.047198F;

		rightLegModel[10].addShapeBox(49F, -9F, -54F, 21, 21, 14, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg11
		rightLegModel[10].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[10].rotateAngleZ = -0.9075712F;

		rightLegModel[11].addBox(35F, 6F, -53F, 24, 25, 11, 0F); // Import ImportRightLeg12
		rightLegModel[11].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[11].rotateAngleZ = -0.9075712F;

		rightLegModel[12].addBox(9F, 22F, -59F, 39, 20, 20, 0F); // Import ImportRightLeg13
		rightLegModel[12].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[12].rotateAngleZ = -0.2617994F;

		rightLegModel[13].addBox(-32F, 27F, -57F, 37, 11, 16, 0F); // Import ImportRightLeg14
		rightLegModel[13].setRotationPoint(-3F, -163F, -6F);

		rightLegModel[14].addBox(-32F, 38F, -52F, 37, 15, 9, 0F); // Import ImportRightLeg15
		rightLegModel[14].setRotationPoint(-3F, -163F, -6F);

		rightLegModel[15].addBox(-8F, 41F, -57.5F, 17, 17, 17, 0F); // Import ImportRightLeg16
		rightLegModel[15].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[15].rotateAngleZ = -0.6981317F;

		rightLegModel[16].addShapeBox(59F, 12F, -52F, 11, 19, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F); // Import ImportRightLeg17
		rightLegModel[16].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[16].rotateAngleZ = -0.9075712F;

		rightLegModel[17].addShapeBox(-8F, 41F, -59F, 25, 25, 20, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Import ImportRightLeg18
		rightLegModel[17].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[17].rotateAngleZ = -0.9599311F;

		rightLegModel[18].addBox(17F, 41F, -59F, 33, 25, 20, 0F); // Import ImportRightLeg19
		rightLegModel[18].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[18].rotateAngleZ = -0.9599311F;

		rightLegModel[19].addShapeBox(17F, 41F, -70F, 33, 25, 11, 0F, -10F, -2F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg20
		rightLegModel[19].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[19].rotateAngleZ = -0.9599311F;

		rightLegModel[20].addShapeBox(17F, 66F, -59F, 33, 11, 20, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Import ImportRightLeg21
		rightLegModel[20].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[20].rotateAngleZ = -0.9599311F;

		rightLegModel[21].addBox(50F, 55F, -57F, 78, 12, 16, 0F); // Import ImportRightLeg22
		rightLegModel[21].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[21].rotateAngleZ = -0.9599311F;

		rightLegModel[22].addShapeBox(50F, 41F, -59F, 56, 14, 20, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg23
		rightLegModel[22].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[22].rotateAngleZ = -0.9599311F;

		rightLegModel[23].addBox(53F, 8F, -58F, 28, 10, 18, 0F); // Import ImportRightLeg24
		rightLegModel[23].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[23].rotateAngleZ = -1.448623F;

		rightLegModel[24].addShapeBox(56F, 67F, -57F, 47, 9, 16, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightLeg25
		rightLegModel[24].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[24].rotateAngleZ = -0.9599311F;

		rightLegModel[25].addShapeBox(-2F, 83F, -56F, 28, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportRightLeg26
		rightLegModel[25].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[25].rotateAngleZ = -0.4712389F;

		rightLegModel[26].addShapeBox(106F, 44F, -59F, 34, 10, 20, 0F, 0F, 0F, -4F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import ImportRightLeg27
		rightLegModel[26].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[26].rotateAngleZ = -0.9599311F;

		rightLegModel[27].addShapeBox(106F, 54F, -68F, 29, 12, 11, 0F, 0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportRightLeg28
		rightLegModel[27].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[27].rotateAngleZ = -0.9599311F;

		rightLegModel[28].addShapeBox(106F, 54F, -41F, 29, 12, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F); // Import ImportRightLeg29
		rightLegModel[28].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[28].rotateAngleZ = -0.9599311F;

		rightLegModel[29].addTrapezoid(-7F, -28F, -31F, 16, 1, 16, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 83
		rightLegModel[29].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[29].rotateAngleZ = -1.04719755F;

		rightLegModel[30].addTrapezoid(12F, -28F, -31F, 16, 1, 16, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 84
		rightLegModel[30].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[30].rotateAngleZ = -1.04719755F;


		leftFootModel = new ModelRendererTurbo[9];
		leftFootModel[0] = new ModelRendererTurbo(this, 400, 650, textureX, textureY); // Import ImportLeftFoot1
		leftFootModel[1] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Import ImportLeftFoot2
		leftFootModel[2] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import ImportLeftFoot3
		leftFootModel[3] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import ImportLeftFoot4
		leftFootModel[4] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import ImportLeftFoot5
		leftFootModel[5] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import ImportLeftFoot7
		leftFootModel[6] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import ImportLeftFoot8
		leftFootModel[7] = new ModelRendererTurbo(this, 400, 950, textureX, textureY); // Import ImportLeftFoot9
		leftFootModel[8] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import ImportLeftFoot6

		leftFootModel[0].addShapeBox(-5F, 122F, 40F, 12, 22, 18, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import ImportLeftFoot1
		leftFootModel[0].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[1].addShapeBox(7F, 117F, 40.5F, 20, 31, 17, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLeftFoot2
		leftFootModel[1].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[2].addBox(-3F, 148F, 38F, 30, 15, 22, 0F); // Import ImportLeftFoot3
		leftFootModel[2].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[3].addShapeBox(28F, 148F, 49F, 10, 15, 11, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import ImportLeftFoot4
		leftFootModel[3].setRotationPoint(-4F, -163F, 6F);

		leftFootModel[4].addShapeBox(27F, 148F, 38F, 10, 15, 11, 0F, 0F, 0F, 0F, 0F, -5F, 5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import ImportLeftFoot5
		leftFootModel[4].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[5].addShapeBox(37F, 153F, 54F, 10, 10, 11, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportLeftFoot7
		leftFootModel[5].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[6].addShapeBox(-18F, 148F, 38F, 15, 15, 22, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import ImportLeftFoot8
		leftFootModel[6].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[7].addShapeBox(-32F, 153F, 44F, 14, 10, 10, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportLeftFoot9
		leftFootModel[7].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[8].addShapeBox(37F, 153F, 33F, 10, 10, 11, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportLeftFoot6
		leftFootModel[8].setRotationPoint(-3F, -163F, 6F);


		rightFootModel = new ModelRendererTurbo[9];
		rightFootModel[0] = new ModelRendererTurbo(this, 400, 650, textureX, textureY); // Import ImportRightFoot1
		rightFootModel[1] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Import ImportRightFoot2
		rightFootModel[2] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import ImportRightFoot3
		rightFootModel[3] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import ImportRightFoot4
		rightFootModel[4] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import ImportRightFoot5
		rightFootModel[5] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import ImportRightFoot6
		rightFootModel[6] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import ImportRightFoot7
		rightFootModel[7] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import ImportRightFoot8
		rightFootModel[8] = new ModelRendererTurbo(this, 400, 950, textureX, textureY); // Import ImportRightFoot9

		rightFootModel[0].addShapeBox(-5F, 122F, -58F, 12, 22, 18, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import ImportRightFoot1
		rightFootModel[0].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[1].addShapeBox(7F, 117F, -57.5F, 20, 31, 17, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRightFoot2
		rightFootModel[1].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[2].addBox(-3F, 148F, -60F, 30, 15, 22, 0F); // Import ImportRightFoot3
		rightFootModel[2].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[3].addShapeBox(27F, 148F, -60F, 10, 15, 11, 0F, 0F, 0F, 0F, 0F, -5F, 5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import ImportRightFoot4
		rightFootModel[3].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[4].addShapeBox(27F, 148F, -49F, 10, 15, 11, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import ImportRightFoot5
		rightFootModel[4].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[5].addShapeBox(37F, 153F, -44F, 10, 10, 11, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportRightFoot6
		rightFootModel[5].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[6].addShapeBox(37F, 153F, -65F, 10, 10, 11, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportRightFoot7
		rightFootModel[6].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[7].addShapeBox(-18F, 148F, -60F, 15, 15, 22, 0F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import ImportRightFoot8
		rightFootModel[7].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[8].addShapeBox(-32F, 153F, -54F, 14, 10, 10, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportRightFoot9
		rightFootModel[8].setRotationPoint(-3F, -163F, -6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}