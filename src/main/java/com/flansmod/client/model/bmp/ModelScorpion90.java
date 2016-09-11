//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelScorpion90 extends ModelVehicle
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelScorpion90()
	{
		bodyModel = new ModelRendererTurbo[76];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 95, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 145, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 145, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 175, textureX, textureY); // Import Box8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Import Box12
		bodyModel[9] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Import Box13
		bodyModel[10] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Import Box14
		bodyModel[11] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Import Box15
		bodyModel[12] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Import Box16
		bodyModel[13] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Box17
		bodyModel[14] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box18
		bodyModel[15] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Box19
		bodyModel[16] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Import Box21
		bodyModel[17] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Import Box22
		bodyModel[18] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Import Box23
		bodyModel[19] = new ModelRendererTurbo(this, 0, 224, textureX, textureY); // Import Box24
		bodyModel[20] = new ModelRendererTurbo(this, 0, 302, textureX, textureY); // Import Box25
		bodyModel[21] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Import Box26
		bodyModel[22] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box27
		bodyModel[23] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Import Box28
		bodyModel[24] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Import Box29
		bodyModel[25] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Import Box30
		bodyModel[26] = new ModelRendererTurbo(this, 0, 338, textureX, textureY); // Import Box31
		bodyModel[27] = new ModelRendererTurbo(this, 0, 338, textureX, textureY); // Import Box32
		bodyModel[28] = new ModelRendererTurbo(this, 0, 338, textureX, textureY); // Import Box33
		bodyModel[29] = new ModelRendererTurbo(this, 0, 346, textureX, textureY); // Import Box34
		bodyModel[30] = new ModelRendererTurbo(this, 0, 356, textureX, textureY); // Import Box35
		bodyModel[31] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Import Box36
		bodyModel[32] = new ModelRendererTurbo(this, 0, 368, textureX, textureY); // Import Box37
		bodyModel[33] = new ModelRendererTurbo(this, 0, 368, textureX, textureY); // Import Box38
		bodyModel[34] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box39
		bodyModel[35] = new ModelRendererTurbo(this, 0, 386, textureX, textureY); // Import Box40
		bodyModel[36] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Import Box41
		bodyModel[37] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box42
		bodyModel[38] = new ModelRendererTurbo(this, 0, 407, textureX, textureY); // Import Box43
		bodyModel[39] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Import Box44
		bodyModel[40] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Import Box45
		bodyModel[41] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Import Box46
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box47
		bodyModel[43] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Box48
		bodyModel[44] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Box49
		bodyModel[45] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Box50
		bodyModel[46] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Box51
		bodyModel[47] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Box52
		bodyModel[48] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Box53
		bodyModel[49] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Box54
		bodyModel[50] = new ModelRendererTurbo(this, 0, 466, textureX, textureY); // Import Box55
		bodyModel[51] = new ModelRendererTurbo(this, 0, 477, textureX, textureY); // Import Box56
		bodyModel[52] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Box57
		bodyModel[53] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Box58
		bodyModel[54] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Import Box60
		bodyModel[55] = new ModelRendererTurbo(this, 0, 501, textureX, textureY); // Import Box61
		bodyModel[56] = new ModelRendererTurbo(this, 0, 497, textureX, textureY); // Import Box63
		bodyModel[57] = new ModelRendererTurbo(this, 0, 508, textureX, textureY); // Import Box64
		bodyModel[58] = new ModelRendererTurbo(this, 0, 512, textureX, textureY); // Import Box65
		bodyModel[59] = new ModelRendererTurbo(this, 0, 516, textureX, textureY); // Import Box66
		bodyModel[60] = new ModelRendererTurbo(this, 0, 547, textureX, textureY); // Import Box67
		bodyModel[61] = new ModelRendererTurbo(this, 0, 577, textureX, textureY); // Import Box68
		bodyModel[62] = new ModelRendererTurbo(this, 0, 577, textureX, textureY); // Import Box69
		bodyModel[63] = new ModelRendererTurbo(this, 0, 593, textureX, textureY); // Import Box70
		bodyModel[64] = new ModelRendererTurbo(this, 0, 593, textureX, textureY); // Import Box71
		bodyModel[65] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Import Box72
		bodyModel[66] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Import Box73
		bodyModel[67] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import Box74
		bodyModel[68] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Import Box75
		bodyModel[69] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Import Box76
		bodyModel[70] = new ModelRendererTurbo(this, 0, 633, textureX, textureY); // Import Box77
		bodyModel[71] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import Box78
		bodyModel[72] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Import Box79
		bodyModel[73] = new ModelRendererTurbo(this, 0, 627, textureX, textureY); // Import Box80
		bodyModel[74] = new ModelRendererTurbo(this, 0, 633, textureX, textureY); // Import Box81
		bodyModel[75] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import Box248

		bodyModel[0].addBox(0F, 0F, 0F, 92, 1, 11, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-31F, -12F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 40, 10, 38, 0F,0F, 0F, -5F, -1.5F, -5F, -3F, -1.5F, -5F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(16F, -22F, -19F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box2
		bodyModel[2].setRotationPoint(59.2F, -12.2F, -23.1F);

		bodyModel[3].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Import Box3
		bodyModel[3].setRotationPoint(61.2F, -12.2F, -23.1F);
		bodyModel[3].rotateAngleZ = -1.30899694F;

		bodyModel[4].addBox(0F, 0F, 0F, 92, 1, 11, 0F); // Import Box4
		bodyModel[4].setRotationPoint(-31F, -12F, 12F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box5
		bodyModel[5].setRotationPoint(59.2F, -12.2F, 12.1F);

		bodyModel[6].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Import Box6
		bodyModel[6].setRotationPoint(61.2F, -12.2F, 12.1F);
		bodyModel[6].rotateAngleZ = -1.30899694F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 85, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box8
		bodyModel[7].setRotationPoint(-29F, -12F, -12F);

		bodyModel[8].addShapeBox(29F, -1.1F, 14F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[8].setRotationPoint(16F, -22F, -14F);
		bodyModel[8].rotateAngleZ = -0.12914564F;

		bodyModel[9].addShapeBox(29F, -1.1F, 26F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[9].setRotationPoint(16F, -22F, -14F);
		bodyModel[9].rotateAngleZ = -0.12914564F;

		bodyModel[10].addShapeBox(30F, -0.6F, 15F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[10].setRotationPoint(16F, -22F, -14F);
		bodyModel[10].rotateAngleZ = -0.12914564F;

		bodyModel[11].addShapeBox(32F, -0.6F, 15F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[11].setRotationPoint(16F, -22F, -14F);
		bodyModel[11].rotateAngleZ = -0.12914564F;

		bodyModel[12].addShapeBox(34F, -0.6F, 15F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[12].setRotationPoint(16F, -22F, -14F);
		bodyModel[12].rotateAngleZ = -0.12914564F;

		bodyModel[13].addShapeBox(28F, -0.1F, -13F, 9, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[13].setRotationPoint(16F, -22F, 0F);
		bodyModel[13].rotateAngleZ = -0.12914564F;

		bodyModel[14].addShapeBox(28F, -1.1F, -13F, 1, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[14].setRotationPoint(16F, -22F, 0F);
		bodyModel[14].rotateAngleZ = -0.12914564F;

		bodyModel[15].addShapeBox(36F, -1.1F, -13F, 1, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[15].setRotationPoint(16F, -22F, 0F);
		bodyModel[15].rotateAngleZ = -0.12914564F;

		bodyModel[16].addShapeBox(29F, -1.1F, -25F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[16].setRotationPoint(16F, -22F, 12F);
		bodyModel[16].rotateAngleZ = -0.12914564F;

		bodyModel[17].addShapeBox(30F, -0.6F, -14F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[17].setRotationPoint(16F, -22F, 3F);
		bodyModel[17].rotateAngleZ = -0.12914564F;

		bodyModel[18].addShapeBox(32F, -0.6F, -14F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[18].setRotationPoint(16F, -22F, 3F);
		bodyModel[18].rotateAngleZ = -0.12914564F;

		bodyModel[19].addShapeBox(34F, -0.6F, -14F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[19].setRotationPoint(16F, -22F, 3F);
		bodyModel[19].rotateAngleZ = -0.12914564F;

		bodyModel[20].addShapeBox(0F, -0.1F, -13F, 23, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[20].setRotationPoint(16F, -22F, 0F);
		bodyModel[20].rotateAngleZ = -0.12914564F;

		bodyModel[21].addShapeBox(0F, -1.1F, -13F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[21].setRotationPoint(16F, -22F, 0F);
		bodyModel[21].rotateAngleZ = -0.12914564F;

		bodyModel[22].addShapeBox(0F, -1.1F, -5F, 23, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[22].setRotationPoint(16F, -22F, 0F);
		bodyModel[22].rotateAngleZ = -0.12914564F;

		bodyModel[23].addShapeBox(11F, -1.1F, -12F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[23].setRotationPoint(16F, -22F, 0F);
		bodyModel[23].rotateAngleZ = -0.12914564F;

		bodyModel[24].addShapeBox(0F, -1.1F, -12F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[24].setRotationPoint(16F, -22F, 0F);
		bodyModel[24].rotateAngleZ = -0.12914564F;

		bodyModel[25].addShapeBox(21F, -1.1F, -12F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[25].setRotationPoint(16F, -22F, 0F);
		bodyModel[25].rotateAngleZ = -0.12914564F;

		bodyModel[26].addShapeBox(2F, -0.6F, -11F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[26].setRotationPoint(16F, -22F, 0F);
		bodyModel[26].rotateAngleZ = -0.12914564F;

		bodyModel[27].addShapeBox(2F, -0.6F, -9F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[27].setRotationPoint(16F, -22F, 0F);
		bodyModel[27].rotateAngleZ = -0.12914564F;

		bodyModel[28].addShapeBox(2F, -0.6F, -7F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[28].setRotationPoint(16F, -22F, 0F);
		bodyModel[28].rotateAngleZ = -0.12914564F;

		bodyModel[29].addShapeBox(6F, -0.6F, 5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[29].setRotationPoint(16F, -22F, 0F);
		bodyModel[29].rotateAngleZ = -0.12914564F;

		bodyModel[30].addShapeBox(6F, -0.6F, 3F, 8, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		bodyModel[30].setRotationPoint(16F, -22F, 0F);
		bodyModel[30].rotateAngleZ = -0.12914564F;

		bodyModel[31].addShapeBox(6F, -0.6F, 9F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box36
		bodyModel[31].setRotationPoint(16F, -22F, 0F);
		bodyModel[31].rotateAngleZ = -0.12914564F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[32].setRotationPoint(52F, -16F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[33].setRotationPoint(52F, -16F, 16F);

		bodyModel[34].addShapeBox(5F, 5F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[34].setRotationPoint(16F, -22F, -14F);
		bodyModel[34].rotateAngleX = -0.46364672F;

		bodyModel[35].addShapeBox(4F, 3.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[35].setRotationPoint(16F, -22F, -14F);
		bodyModel[35].rotateAngleX = -0.46364672F;

		bodyModel[36].addShapeBox(16F, 3.5F, -1F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[36].setRotationPoint(16F, -22F, -14F);
		bodyModel[36].rotateAngleX = -0.46364672F;

		bodyModel[37].addShapeBox(19F, 3.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[37].setRotationPoint(16F, -22F, -14F);
		bodyModel[37].rotateAngleX = -0.46364672F;

		bodyModel[38].addShapeBox(32F, 6.5F, -0.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		bodyModel[38].setRotationPoint(16F, -22F, -14F);
		bodyModel[38].rotateAngleX = -0.46364672F;

		bodyModel[39].addShapeBox(30F, 6.5F, -0.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[39].setRotationPoint(16F, -22F, -14F);
		bodyModel[39].rotateAngleX = -0.46364672F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 41, 10, 38, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyModel[40].setRotationPoint(-25F, -22F, -19F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 39, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		bodyModel[41].setRotationPoint(-24F, -20F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 39, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[42].setRotationPoint(-24F, -16F, -21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 39, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[43].setRotationPoint(-24F, -20F, -21F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 39, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		bodyModel[44].setRotationPoint(-24F, -21F, -21F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 39, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[45].setRotationPoint(-24F, -21F, -17.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[46].setRotationPoint(-22F, -18F, -21.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[47].setRotationPoint(11F, -18F, -21.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[48].setRotationPoint(-1F, -18F, -21.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[49].setRotationPoint(-12F, -18F, -21.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 39, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[50].setRotationPoint(-24F, -16F, 15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 39, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[51].setRotationPoint(-24F, -18F, 15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 39, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[52].setRotationPoint(-24F, -21F, 14F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 39, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box58
		bodyModel[53].setRotationPoint(-24F, -21F, 16F);

		bodyModel[54].addShapeBox(5F, 5F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[54].setRotationPoint(16F, -22F, 14F);
		bodyModel[54].rotateAngleX = 0.46364672F;

		bodyModel[55].addShapeBox(4F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyModel[55].setRotationPoint(16F, -22F, 14F);
		bodyModel[55].rotateAngleX = 0.46364672F;

		bodyModel[56].addShapeBox(5F, 7F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[56].setRotationPoint(16F, -22F, 14F);
		bodyModel[56].rotateAngleX = 0.46364672F;

		bodyModel[57].addShapeBox(18F, 7F, -1F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[57].setRotationPoint(16F, -22F, 14F);
		bodyModel[57].rotateAngleX = 0.46364672F;

		bodyModel[58].addShapeBox(28F, 8F, -1F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box65
		bodyModel[58].setRotationPoint(16F, -22F, 14F);
		bodyModel[58].rotateAngleX = 0.46364672F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 8, 22, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[59].setRotationPoint(-35F, -21F, -14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 85, 4, 24, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F); // Import Box67
		bodyModel[60].setRotationPoint(-29F, -2F, -12F);

		bodyModel[61].addShapeBox(0F, -1F, 0F, 10, 5, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[61].setRotationPoint(-35F, -21F, -14F);

		bodyModel[62].addShapeBox(0F, -1F, 0F, 10, 5, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[62].setRotationPoint(-35F, -21F, -1F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box70
		bodyModel[63].setRotationPoint(-31.1F, -12.2F, -23.1F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box71
		bodyModel[64].setRotationPoint(-31.1F, -12.2F, 12.1F);

		bodyModel[65].addBox(-7F, 0F, 0F, 7, 1, 11, 0F); // Import Box72
		bodyModel[65].setRotationPoint(-31.1F, -12.2F, -23.1F);
		bodyModel[65].rotateAngleZ = 1.30899694F;

		bodyModel[66].addBox(-7F, 0F, 0F, 7, 1, 11, 0F); // Import Box73
		bodyModel[66].setRotationPoint(-31.1F, -12.2F, 12.1F);
		bodyModel[66].rotateAngleZ = 1.30899694F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		bodyModel[67].setRotationPoint(55F, -15F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[68].setRotationPoint(55F, -16F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box76
		bodyModel[69].setRotationPoint(55F, -13F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box77
		bodyModel[70].setRotationPoint(55F, -9F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[71].setRotationPoint(55F, -15F, 5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[72].setRotationPoint(55F, -16F, 5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box80
		bodyModel[73].setRotationPoint(55F, -13F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box81
		bodyModel[74].setRotationPoint(55F, -9F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 24, 0F); // Import Box248
		bodyModel[75].setRotationPoint(56F, -12F, -12F);


		turretModel = new ModelRendererTurbo[63];
		turretModel[0] = new ModelRendererTurbo(this, 0, 646, textureX, textureY); // Import Box182
		turretModel[1] = new ModelRendererTurbo(this, 0, 671, textureX, textureY); // Import Box183
		turretModel[2] = new ModelRendererTurbo(this, 0, 695, textureX, textureY); // Import Box184
		turretModel[3] = new ModelRendererTurbo(this, 0, 721, textureX, textureY); // Import Box185
		turretModel[4] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Box186
		turretModel[5] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Box187
		turretModel[6] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Import Box188
		turretModel[7] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Box189
		turretModel[8] = new ModelRendererTurbo(this, 0, 845, textureX, textureY); // Import Box190
		turretModel[9] = new ModelRendererTurbo(this, 0, 870, textureX, textureY); // Import Box191
		turretModel[10] = new ModelRendererTurbo(this, 0, 895, textureX, textureY); // Import Box192
		turretModel[11] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import Box193
		turretModel[12] = new ModelRendererTurbo(this, 0, 945, textureX, textureY); // Import Box188
		turretModel[13] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Import Box189
		turretModel[14] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box190
		turretModel[15] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Import Box191
		turretModel[16] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Import Box192
		turretModel[17] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box193
		turretModel[18] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box194
		turretModel[19] = new ModelRendererTurbo(this, 0, 973, textureX, textureY); // Import Box195
		turretModel[20] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Box196
		turretModel[21] = new ModelRendererTurbo(this, 0, 989, textureX, textureY); // Import Box197
		turretModel[22] = new ModelRendererTurbo(this, 0, 955, textureX, textureY); // Import Box198
		turretModel[23] = new ModelRendererTurbo(this, 0, 945, textureX, textureY); // Import Box199
		turretModel[24] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box200
		turretModel[25] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Import Box201
		turretModel[26] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box202
		turretModel[27] = new ModelRendererTurbo(this, 0, 965, textureX, textureY); // Import Box203
		turretModel[28] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box204
		turretModel[29] = new ModelRendererTurbo(this, 0, 996, textureX, textureY); // Import Box205
		turretModel[30] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Import Box206
		turretModel[31] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Import Box207
		turretModel[32] = new ModelRendererTurbo(this, 0, 1004, textureX, textureY); // Import Box208
		turretModel[33] = new ModelRendererTurbo(this, 0, 1012, textureX, textureY); // Import Box209
		turretModel[34] = new ModelRendererTurbo(this, 0, 1012, textureX, textureY); // Import Box210
		turretModel[35] = new ModelRendererTurbo(this, 0, 1012, textureX, textureY); // Import Box211
		turretModel[36] = new ModelRendererTurbo(this, 0, 1012, textureX, textureY); // Import Box212
		turretModel[37] = new ModelRendererTurbo(this, 0, 1018, textureX, textureY); // Import Box213
		turretModel[38] = new ModelRendererTurbo(this, 0, 1007, textureX, textureY); // Import Box214
		turretModel[39] = new ModelRendererTurbo(this, 0, 1031, textureX, textureY); // Import Box215
		turretModel[40] = new ModelRendererTurbo(this, 0, 1059, textureX, textureY); // Import Box216
		turretModel[41] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import Box217
		turretModel[42] = new ModelRendererTurbo(this, 0, 1104, textureX, textureY); // Import Box218
		turretModel[43] = new ModelRendererTurbo(this, 0, 1117, textureX, textureY); // Import Box219
		turretModel[44] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box220
		turretModel[45] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box221
		turretModel[46] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box222
		turretModel[47] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box223
		turretModel[48] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box224
		turretModel[49] = new ModelRendererTurbo(this, 0, 1117, textureX, textureY); // Import Box225
		turretModel[50] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box226
		turretModel[51] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box227
		turretModel[52] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box228
		turretModel[53] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box229
		turretModel[54] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box230
		turretModel[55] = new ModelRendererTurbo(this, 0, 1124, textureX, textureY); // Import Box231
		turretModel[56] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Import Box232
		turretModel[57] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Import Box233
		turretModel[58] = new ModelRendererTurbo(this, 0, 1189, textureX, textureY); // Import Box234
		turretModel[59] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Box235
		turretModel[60] = new ModelRendererTurbo(this, 0, 1209, textureX, textureY); // Import Box236
		turretModel[61] = new ModelRendererTurbo(this, 0, 1209, textureX, textureY); // Import Box237
		turretModel[62] = new ModelRendererTurbo(this, 0, 1209, textureX, textureY); // Import Box238

		turretModel[0].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,-2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		turretModel[0].setRotationPoint(-9F, -31F, -19F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		turretModel[1].setRotationPoint(-9F, -26F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 13, 5, 19, 0F,-3F, 0F, -11F, 2F, 0F, -4F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		turretModel[2].setRotationPoint(-22F, -31F, -19F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 19, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -11F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box185
		turretModel[3].setRotationPoint(-22F, -26F, -19F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 8, 5, 19, 0F,2F, 0F, -4F, -6F, 0F, -7F, -6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		turretModel[4].setRotationPoint(5F, -31F, -19F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		turretModel[5].setRotationPoint(5F, -26F, -19F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 12, 5, 19, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, 0F); // Import Box188
		turretModel[6].setRotationPoint(1F, -31F, 0F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 19, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, -4F, 0F, -4F); // Import Box189
		turretModel[7].setRotationPoint(1F, -26F, 0F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 11, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F); // Import Box190
		turretModel[8].setRotationPoint(-10F, -31F, 0F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F); // Import Box191
		turretModel[9].setRotationPoint(-13F, -26F, 0F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 9, 5, 19, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, -3F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Import Box192
		turretModel[10].setRotationPoint(-22F, -31F, 0F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 9, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, -3F, 0F, -11F); // Import Box193
		turretModel[11].setRotationPoint(-22F, -26F, 0F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		turretModel[12].setRotationPoint(-10F, -32F, -11F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		turretModel[13].setRotationPoint(-10F, -32F, -14F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box190
		turretModel[14].setRotationPoint(-10F, -32F, -4F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		turretModel[15].setRotationPoint(-12F, -32.5F, -11F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		turretModel[16].setRotationPoint(-12F, -32.5F, -5F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		turretModel[17].setRotationPoint(-14F, -32F, -10F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box194
		turretModel[18].setRotationPoint(-14F, -32F, -4F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		turretModel[19].setRotationPoint(1F, -31.5F, -10F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		turretModel[20].setRotationPoint(1.5F, -34.5F, -9.5F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		turretModel[21].setRotationPoint(5F, -34F, -9F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		turretModel[22].setRotationPoint(-11F, -32F, 1F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		turretModel[23].setRotationPoint(-11F, -32F, 4F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box200
		turretModel[24].setRotationPoint(-11F, -32F, 11F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		turretModel[25].setRotationPoint(-13F, -32.5F, 10F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		turretModel[26].setRotationPoint(-15F, -32F, 5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		turretModel[27].setRotationPoint(-13F, -32.5F, 4F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		turretModel[28].setRotationPoint(-15F, -32F, 11F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		turretModel[29].setRotationPoint(0F, -31.5F, 6F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box206
		turretModel[30].setRotationPoint(0F, -31.5F, 9F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		turretModel[31].setRotationPoint(0F, -31.5F, 5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		turretModel[32].setRotationPoint(1F, -34.5F, 6F);

		turretModel[33].addShapeBox(2F, 0F, 4F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		turretModel[33].setRotationPoint(1F, -33F, 7F);
		turretModel[33].rotateAngleY = 0.78539816F;

		turretModel[34].addShapeBox(2F, 0F, -7F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		turretModel[34].setRotationPoint(1F, -33F, 7F);
		turretModel[34].rotateAngleY = -0.78539816F;

		turretModel[35].addShapeBox(2F, 0F, -7F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box211
		turretModel[35].setRotationPoint(-13F, -33F, 7F);
		turretModel[35].rotateAngleY = -3.92699082F;

		turretModel[36].addShapeBox(2F, 0F, 4F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		turretModel[36].setRotationPoint(-13F, -33F, 7F);
		turretModel[36].rotateAngleY = -2.35619449F;

		turretModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		turretModel[37].setRotationPoint(1F, -33F, -12F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 3, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box214
		turretModel[38].setRotationPoint(-22F, -31F, -8F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 7, 3, 24, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		turretModel[39].setRotationPoint(-29F, -31F, -12F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 7, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		turretModel[40].setRotationPoint(-29F, -28F, -12F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 14, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		turretModel[41].setRotationPoint(-9F, -31F, -20F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 14, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		turretModel[42].setRotationPoint(-11F, -31F, 17F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box219
		turretModel[43].setRotationPoint(7F, -29F, -14F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		turretModel[44].setRotationPoint(11F, -29F, -13.5F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		turretModel[45].setRotationPoint(11F, -29F, -11.5F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		turretModel[46].setRotationPoint(11F, -28F, -12.5F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box223
		turretModel[47].setRotationPoint(11F, -28F, -14F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box224
		turretModel[48].setRotationPoint(11F, -28F, -11F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box225
		turretModel[49].setRotationPoint(7F, -29F, 10F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		turretModel[50].setRotationPoint(11F, -29F, 12.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		turretModel[51].setRotationPoint(11F, -29F, 10.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box228
		turretModel[52].setRotationPoint(11F, -28F, 11.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box229
		turretModel[53].setRotationPoint(11F, -28F, 13F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box230
		turretModel[54].setRotationPoint(11F, -28F, 10F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 5, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box231
		turretModel[55].setRotationPoint(8F, -29.5F, -8F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		turretModel[56].setRotationPoint(13F, -30F, -8.5F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		turretModel[57].setRotationPoint(13F, -27F, -8.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		turretModel[58].setRotationPoint(13F, -29.5F, -8F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box235
		turretModel[59].setRotationPoint(18F, -29F, -7.5F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box236
		turretModel[60].setRotationPoint(21.5F, -28.5F, -7F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box237
		turretModel[61].setRotationPoint(21.5F, -27.5F, -7F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box238
		turretModel[62].setRotationPoint(21.5F, -26.5F, -7F);


		barrelModel = new ModelRendererTurbo[18];
		barrelModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box239
		barrelModel[1] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 1
		barrelModel[3] = new ModelRendererTurbo(this, 400, 30, textureX, textureY); // Box 2
		barrelModel[4] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Box 3
		barrelModel[5] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Box 4
		barrelModel[6] = new ModelRendererTurbo(this, 400, 60, textureX, textureY); // Box 5
		barrelModel[7] = new ModelRendererTurbo(this, 400, 75, textureX, textureY); // Box 6
		barrelModel[8] = new ModelRendererTurbo(this, 400, 75, textureX, textureY); // Box 7
		barrelModel[9] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 8
		barrelModel[10] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 9
		barrelModel[11] = new ModelRendererTurbo(this, 400, 90, textureX, textureY); // Box 10
		barrelModel[12] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Box 11
		barrelModel[13] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Box 12
		barrelModel[14] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Box 13
		barrelModel[15] = new ModelRendererTurbo(this, 400, 110, textureX, textureY); // Box 14
		barrelModel[16] = new ModelRendererTurbo(this, 400, 120, textureX, textureY); // Box 15
		barrelModel[17] = new ModelRendererTurbo(this, 400, 120, textureX, textureY); // Box 16

		barrelModel[0].addShapeBox(-2F, -2F, -3F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		barrelModel[0].setRotationPoint(17F, -27F, 0F);

		barrelModel[1].addShapeBox(-2F, -3F, -3F, 7, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[1].setRotationPoint(17F, -27F, 0F);

		barrelModel[2].addShapeBox(-2F, 2F, -3F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		barrelModel[2].setRotationPoint(17F, -27F, 0F);

		barrelModel[3].addShapeBox(5F, -2F, -3F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 2
		barrelModel[3].setRotationPoint(17F, -27F, 0F);

		barrelModel[4].addShapeBox(5F, -3F, -3F, 6, 1, 6, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 3
		barrelModel[4].setRotationPoint(17F, -27F, 0F);

		barrelModel[5].addShapeBox(5F, 2F, -3F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Box 4
		barrelModel[5].setRotationPoint(17F, -27F, 0F);

		barrelModel[6].addShapeBox(11F, -1F, -2F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		barrelModel[6].setRotationPoint(17F, -27F, 0F);

		barrelModel[7].addShapeBox(11F, 1F, -2F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[7].setRotationPoint(17F, -27F, 0F);

		barrelModel[8].addShapeBox(11F, -2F, -2F, 8, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		barrelModel[8].setRotationPoint(17F, -27F, 0F);

		barrelModel[9].addShapeBox(18F, -0.5F, -1.5F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		barrelModel[9].setRotationPoint(17F, -27F, 0F);

		barrelModel[10].addShapeBox(18F, -1.5F, -1.5F, 27, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		barrelModel[10].setRotationPoint(17F, -27F, 0F);

		barrelModel[11].addShapeBox(18F, 0.5F, -1.5F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		barrelModel[11].setRotationPoint(17F, -27F, 0F);

		barrelModel[12].addShapeBox(45F, -0.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 11
		barrelModel[12].setRotationPoint(17F, -27F, 0F);

		barrelModel[13].addShapeBox(45F, -1.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 12
		barrelModel[13].setRotationPoint(17F, -27F, 0F);

		barrelModel[14].addShapeBox(45F, 0.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F); // Box 13
		barrelModel[14].setRotationPoint(17F, -27F, 0F);

		barrelModel[15].addShapeBox(51F, -1F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[15].setRotationPoint(17F, -27F, 0F);

		barrelModel[16].addShapeBox(51F, -2F, -2F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[16].setRotationPoint(17F, -27F, 0F);

		barrelModel[17].addShapeBox(51F, 1F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 16
		barrelModel[17].setRotationPoint(17F, -27F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[37];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 1229, textureX, textureY); // Import Box82
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 1241, textureX, textureY); // Import Box84
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box85
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box86
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 1273, textureX, textureY); // Import Box87
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box88
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box89
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box90
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box91
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box92
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box93
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box94
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box95
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box97
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box98
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box99
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box100
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box101
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box102
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box103
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box104
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box105
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box106
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box107
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box108
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box109
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box110
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 1241, textureX, textureY); // Import Box111
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 1229, textureX, textureY); // Import Box112
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box113
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 1273, textureX, textureY); // Import Box114
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box115
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box116
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box117
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box118
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box119
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box120

		leftTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		leftTrackWheelModels[0].setRotationPoint(54F, -4F, 13F);

		leftTrackWheelModels[1].addShapeBox(-4.5F, -3.5F, 0F, 9, 2, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftTrackWheelModels[1].setRotationPoint(54F, -4F, 13F);

		leftTrackWheelModels[2].addShapeBox(-3.5F, -4.5F, 0F, 7, 1, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftTrackWheelModels[2].setRotationPoint(54F, -4F, 13F);

		leftTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box86
		leftTrackWheelModels[3].setRotationPoint(54F, -4F, 13F);

		leftTrackWheelModels[4].addShapeBox(-3.5F, 3.5F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box87
		leftTrackWheelModels[4].setRotationPoint(54F, -4F, 13F);

		leftTrackWheelModels[5].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		leftTrackWheelModels[5].setRotationPoint(54F, -4F, 13F);

		leftTrackWheelModels[6].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		leftTrackWheelModels[6].setRotationPoint(54F, -4F, 13F);
		leftTrackWheelModels[6].rotateAngleZ = 0.52359878F;

		leftTrackWheelModels[7].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		leftTrackWheelModels[7].setRotationPoint(54F, -4F, 13F);
		leftTrackWheelModels[7].rotateAngleZ = 1.04719755F;

		leftTrackWheelModels[8].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		leftTrackWheelModels[8].setRotationPoint(54F, -4F, 13F);
		leftTrackWheelModels[8].rotateAngleZ = 1.57079633F;

		leftTrackWheelModels[9].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		leftTrackWheelModels[9].setRotationPoint(54F, -4F, 13F);
		leftTrackWheelModels[9].rotateAngleZ = 2.0943951F;

		leftTrackWheelModels[10].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		leftTrackWheelModels[10].setRotationPoint(54F, -4F, 13F);
		leftTrackWheelModels[10].rotateAngleZ = 2.61799388F;

		leftTrackWheelModels[11].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		leftTrackWheelModels[11].setRotationPoint(42F, 2F, 12F);

		leftTrackWheelModels[12].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		leftTrackWheelModels[12].setRotationPoint(42F, 2F, 12F);

		leftTrackWheelModels[13].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box97
		leftTrackWheelModels[13].setRotationPoint(42F, 2F, 12F);

		leftTrackWheelModels[14].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		leftTrackWheelModels[14].setRotationPoint(28F, 2F, 12F);

		leftTrackWheelModels[15].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		leftTrackWheelModels[15].setRotationPoint(28F, 2F, 12F);

		leftTrackWheelModels[16].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box100
		leftTrackWheelModels[16].setRotationPoint(28F, 2F, 12F);

		leftTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		leftTrackWheelModels[17].setRotationPoint(14F, 2F, 12F);

		leftTrackWheelModels[18].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		leftTrackWheelModels[18].setRotationPoint(14F, 2F, 12F);

		leftTrackWheelModels[19].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box103
		leftTrackWheelModels[19].setRotationPoint(14F, 2F, 12F);

		leftTrackWheelModels[20].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		leftTrackWheelModels[20].setRotationPoint(0F, 2F, 12F);

		leftTrackWheelModels[21].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		leftTrackWheelModels[21].setRotationPoint(0F, 2F, 12F);

		leftTrackWheelModels[22].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box106
		leftTrackWheelModels[22].setRotationPoint(0F, 2F, 12F);

		leftTrackWheelModels[23].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		leftTrackWheelModels[23].setRotationPoint(-14F, 2F, 12F);

		leftTrackWheelModels[24].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		leftTrackWheelModels[24].setRotationPoint(-14F, 2F, 12F);

		leftTrackWheelModels[25].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box109
		leftTrackWheelModels[25].setRotationPoint(-14F, 2F, 12F);

		leftTrackWheelModels[26].addShapeBox(-3.5F, -4.5F, 0F, 7, 1, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		leftTrackWheelModels[26].setRotationPoint(-25F, -4F, 13F);

		leftTrackWheelModels[27].addShapeBox(-4.5F, -3.5F, 0F, 9, 2, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		leftTrackWheelModels[27].setRotationPoint(-25F, -4F, 13F);

		leftTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		leftTrackWheelModels[28].setRotationPoint(-25F, -4F, 13F);

		leftTrackWheelModels[29].addShapeBox(-4.5F, 1.5F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box113
		leftTrackWheelModels[29].setRotationPoint(-25F, -4F, 13F);

		leftTrackWheelModels[30].addShapeBox(-3.5F, 3.5F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box114
		leftTrackWheelModels[30].setRotationPoint(-25F, -4F, 13F);

		leftTrackWheelModels[31].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		leftTrackWheelModels[31].setRotationPoint(-25F, -4F, 13F);

		leftTrackWheelModels[32].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		leftTrackWheelModels[32].setRotationPoint(-25F, -4F, 13F);
		leftTrackWheelModels[32].rotateAngleZ = 0.52359878F;

		leftTrackWheelModels[33].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		leftTrackWheelModels[33].setRotationPoint(-25F, -4F, 13F);
		leftTrackWheelModels[33].rotateAngleZ = 1.04719755F;

		leftTrackWheelModels[34].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		leftTrackWheelModels[34].setRotationPoint(-25F, -4F, 13F);
		leftTrackWheelModels[34].rotateAngleZ = 1.57079633F;

		leftTrackWheelModels[35].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		leftTrackWheelModels[35].setRotationPoint(-25F, -4F, 13F);
		leftTrackWheelModels[35].rotateAngleZ = 2.0943951F;

		leftTrackWheelModels[36].addShapeBox(-5F, -0.5F, 1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		leftTrackWheelModels[36].setRotationPoint(-25F, -4F, 13F);
		leftTrackWheelModels[36].rotateAngleZ = 2.61799388F;


		rightTrackWheelModels = new ModelRendererTurbo[37];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 1229, textureX, textureY); // Import Box133
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 1241, textureX, textureY); // Import Box134
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box135
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box136
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 1273, textureX, textureY); // Import Box137
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box138
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box139
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box140
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box141
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box142
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box143
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box144
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box145
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box146
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box147
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box148
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box149
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box150
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box151
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box152
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box153
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box154
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box155
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box156
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box157
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 1322, textureX, textureY); // Import Box158
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 1252, textureX, textureY); // Import Box159
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 1241, textureX, textureY); // Import Box160
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 1229, textureX, textureY); // Import Box161
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box162
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 1273, textureX, textureY); // Import Box163
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box176
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box177
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box178
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box179
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box180
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box181

		rightTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		rightTrackWheelModels[0].setRotationPoint(54F, -4F, -21F);

		rightTrackWheelModels[1].addShapeBox(-4.5F, -3.5F, 0F, 9, 2, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		rightTrackWheelModels[1].setRotationPoint(54F, -4F, -21F);

		rightTrackWheelModels[2].addShapeBox(-3.5F, -4.5F, 0F, 7, 1, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		rightTrackWheelModels[2].setRotationPoint(54F, -4F, -21F);

		rightTrackWheelModels[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box136
		rightTrackWheelModels[3].setRotationPoint(54F, -4F, -21F);

		rightTrackWheelModels[4].addShapeBox(-3.5F, 3.5F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box137
		rightTrackWheelModels[4].setRotationPoint(54F, -4F, -21F);

		rightTrackWheelModels[5].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		rightTrackWheelModels[5].setRotationPoint(54F, -4F, -19F);

		rightTrackWheelModels[6].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		rightTrackWheelModels[6].setRotationPoint(54F, -4F, -19F);
		rightTrackWheelModels[6].rotateAngleZ = 0.52359878F;

		rightTrackWheelModels[7].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		rightTrackWheelModels[7].setRotationPoint(54F, -4F, -19F);
		rightTrackWheelModels[7].rotateAngleZ = 1.04719755F;

		rightTrackWheelModels[8].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		rightTrackWheelModels[8].setRotationPoint(54F, -4F, -19F);
		rightTrackWheelModels[8].rotateAngleZ = 1.57079633F;

		rightTrackWheelModels[9].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		rightTrackWheelModels[9].setRotationPoint(54F, -4F, -19F);
		rightTrackWheelModels[9].rotateAngleZ = 2.0943951F;

		rightTrackWheelModels[10].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		rightTrackWheelModels[10].setRotationPoint(54F, -4F, -19F);
		rightTrackWheelModels[10].rotateAngleZ = 2.61799388F;

		rightTrackWheelModels[11].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		rightTrackWheelModels[11].setRotationPoint(42F, 2F, -21F);

		rightTrackWheelModels[12].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		rightTrackWheelModels[12].setRotationPoint(42F, 2F, -21F);

		rightTrackWheelModels[13].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box146
		rightTrackWheelModels[13].setRotationPoint(42F, 2F, -21F);

		rightTrackWheelModels[14].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		rightTrackWheelModels[14].setRotationPoint(28F, 2F, -21F);

		rightTrackWheelModels[15].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		rightTrackWheelModels[15].setRotationPoint(28F, 2F, -21F);

		rightTrackWheelModels[16].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box149
		rightTrackWheelModels[16].setRotationPoint(28F, 2F, -21F);

		rightTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		rightTrackWheelModels[17].setRotationPoint(14F, 2F, -21F);

		rightTrackWheelModels[18].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		rightTrackWheelModels[18].setRotationPoint(14F, 2F, -21F);

		rightTrackWheelModels[19].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box152
		rightTrackWheelModels[19].setRotationPoint(14F, 2F, -21F);

		rightTrackWheelModels[20].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		rightTrackWheelModels[20].setRotationPoint(0F, 2F, -21F);

		rightTrackWheelModels[21].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		rightTrackWheelModels[21].setRotationPoint(0F, 2F, -21F);

		rightTrackWheelModels[22].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box155
		rightTrackWheelModels[22].setRotationPoint(0F, 2F, -21F);

		rightTrackWheelModels[23].addShapeBox(-6F, -6F, 0F, 12, 4, 9, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		rightTrackWheelModels[23].setRotationPoint(-14F, 2F, -21F);

		rightTrackWheelModels[24].addShapeBox(-6F, -2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		rightTrackWheelModels[24].setRotationPoint(-14F, 2F, -21F);

		rightTrackWheelModels[25].addShapeBox(-6F, 2F, 0F, 12, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box158
		rightTrackWheelModels[25].setRotationPoint(-14F, 2F, -21F);

		rightTrackWheelModels[26].addShapeBox(-3.5F, -4.5F, 0F, 7, 1, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		rightTrackWheelModels[26].setRotationPoint(-25F, -4F, -21F);

		rightTrackWheelModels[27].addShapeBox(-4.5F, -3.5F, 0F, 9, 2, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		rightTrackWheelModels[27].setRotationPoint(-25F, -4F, -21F);

		rightTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		rightTrackWheelModels[28].setRotationPoint(-25F, -4F, -21F);

		rightTrackWheelModels[29].addShapeBox(-4.5F, 1.5F, 0F, 9, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box162
		rightTrackWheelModels[29].setRotationPoint(-25F, -4F, -21F);

		rightTrackWheelModels[30].addShapeBox(-3.5F, 3.5F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box163
		rightTrackWheelModels[30].setRotationPoint(-25F, -4F, -21F);

		rightTrackWheelModels[31].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		rightTrackWheelModels[31].setRotationPoint(-25F, -4F, -19F);

		rightTrackWheelModels[32].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		rightTrackWheelModels[32].setRotationPoint(-25F, -4F, -19F);
		rightTrackWheelModels[32].rotateAngleZ = 0.52359878F;

		rightTrackWheelModels[33].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		rightTrackWheelModels[33].setRotationPoint(-25F, -4F, -19F);
		rightTrackWheelModels[33].rotateAngleZ = 1.04719755F;

		rightTrackWheelModels[34].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		rightTrackWheelModels[34].setRotationPoint(-25F, -4F, -19F);
		rightTrackWheelModels[34].rotateAngleZ = 1.57079633F;

		rightTrackWheelModels[35].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		rightTrackWheelModels[35].setRotationPoint(-25F, -4F, -19F);
		rightTrackWheelModels[35].rotateAngleZ = 2.0943951F;

		rightTrackWheelModels[36].addShapeBox(-5F, -0.5F, -1F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		rightTrackWheelModels[36].setRotationPoint(-25F, -4F, -19F);
		rightTrackWheelModels[36].rotateAngleZ = 2.61799388F;


		leftAnimTrackModel = new ModelRendererTurbo[3][];
		rightAnimTrackModel = new ModelRendererTurbo[3][];
		
		rightAnimTrackModel[0] = new ModelRendererTurbo[12];
		rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 0, 1337, textureX, textureY); // Import ImportBox164
		rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import ImportBox165
		rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 0, 1381, textureX, textureY); // Import ImportBox166
		rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Import ImportBox167
		rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Import ImportBox168
		rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 0, 1502, textureX, textureY); // Import ImportBox169
		rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 0, 1518, textureX, textureY); // Import ImportBox170
		rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 0, 1535, textureX, textureY); // Import ImportBox171
		rightAnimTrackModel[0][8] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Import ImportBox172
		rightAnimTrackModel[0][9] = new ModelRendererTurbo(this, 0, 1626, textureX, textureY); // Import ImportBox173
		rightAnimTrackModel[0][10] = new ModelRendererTurbo(this, 0, 1646, textureX, textureY); // Import ImportBox174
		rightAnimTrackModel[0][11] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import ImportBox175

		rightAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		rightAnimTrackModel[0][0].setRotationPoint(59F, -6F, -22F);

		rightAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox165
		rightAnimTrackModel[0][1].setRotationPoint(60F, -1F, -22F);
		rightAnimTrackModel[0][1].rotateAngleZ = -0.9424778F;

		rightAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 64, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		rightAnimTrackModel[0][2].setRotationPoint(46.2F, 9F, -22F);
		rightAnimTrackModel[0][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox167
		rightAnimTrackModel[0][3].setRotationPoint(-17.8F, 9F, -22F);
		rightAnimTrackModel[0][3].rotateAngleZ = -2.21656815F;

		rightAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox168
		rightAnimTrackModel[0][4].setRotationPoint(-31F, -0.9F, -22F);
		rightAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox169
		rightAnimTrackModel[0][5].setRotationPoint(-31F, -5.9F, -22F);
		rightAnimTrackModel[0][5].rotateAngleZ = -3.83972435F;

		rightAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox170
		rightAnimTrackModel[0][6].setRotationPoint(-27.8F, -9.7F, -22F);
		rightAnimTrackModel[0][6].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox171
		rightAnimTrackModel[0][7].setRotationPoint(-22.8F, -9.7F, -22F);
		rightAnimTrackModel[0][7].rotateAngleZ = -5.30580093F;

		rightAnimTrackModel[0][8].addShapeBox(-1F, 0F, 0F, 1, 61, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		rightAnimTrackModel[0][8].setRotationPoint(-16.8F, -5.4F, -22F);
		rightAnimTrackModel[0][8].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[0][9].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		rightAnimTrackModel[0][9].setRotationPoint(44.2F, -4.4F, -22F);
		rightAnimTrackModel[0][9].rotateAngleZ = -4.22369679F;

		rightAnimTrackModel[0][10].addShapeBox(-1F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		rightAnimTrackModel[0][10].setRotationPoint(52F, -9.65F, -22F);
		rightAnimTrackModel[0][10].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[0][11].addShapeBox(-1F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, 0F, 0F); // Import ImportBox175
		rightAnimTrackModel[0][11].setRotationPoint(56F, -9.65F, -22F);
		rightAnimTrackModel[0][11].rotateAngleZ = -5.44542727F;
		
		leftAnimTrackModel[0] = new ModelRendererTurbo[12];
		leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 0, 1337, textureX, textureY); // Import ImportBox121
		leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 0, 1353, textureX, textureY); // Import ImportBox122
		leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 0, 1381, textureX, textureY); // Import ImportBox123
		leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 0, 1457, textureX, textureY); // Import ImportBox124
		leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 0, 1485, textureX, textureY); // Import ImportBox125
		leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 0, 1502, textureX, textureY); // Import ImportBox126
		leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 0, 1518, textureX, textureY); // Import ImportBox127
		leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 0, 1535, textureX, textureY); // Import ImportBox128
		leftAnimTrackModel[0][8] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Import ImportBox129
		leftAnimTrackModel[0][9] = new ModelRendererTurbo(this, 0, 1626, textureX, textureY); // Import ImportBox130
		leftAnimTrackModel[0][10] = new ModelRendererTurbo(this, 0, 1646, textureX, textureY); // Import ImportBox131
		leftAnimTrackModel[0][11] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import ImportBox132

		leftAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		leftAnimTrackModel[0][0].setRotationPoint(59F, -6F, 12F);

		leftAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
		leftAnimTrackModel[0][1].setRotationPoint(60F, -1F, 12F);
		leftAnimTrackModel[0][1].rotateAngleZ = -0.9424778F;

		leftAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 64, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		leftAnimTrackModel[0][2].setRotationPoint(46.2F, 9F, 12F);
		leftAnimTrackModel[0][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox124
		leftAnimTrackModel[0][3].setRotationPoint(-17.8F, 9F, 12F);
		leftAnimTrackModel[0][3].rotateAngleZ = -2.21656815F;

		leftAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		leftAnimTrackModel[0][4].setRotationPoint(-31F, -0.9F, 12F);
		leftAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		leftAnimTrackModel[0][5].setRotationPoint(-31F, -5.9F, 12F);
		leftAnimTrackModel[0][5].rotateAngleZ = -3.83972435F;

		leftAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		leftAnimTrackModel[0][6].setRotationPoint(-27.8F, -9.7F, 12F);
		leftAnimTrackModel[0][6].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		leftAnimTrackModel[0][7].setRotationPoint(-22.8F, -9.7F, 12F);
		leftAnimTrackModel[0][7].rotateAngleZ = -5.30580093F;

		leftAnimTrackModel[0][8].addShapeBox(-1F, 0F, 0F, 1, 61, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		leftAnimTrackModel[0][8].setRotationPoint(-16.8F, -5.4F, 12F);
		leftAnimTrackModel[0][8].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[0][9].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		leftAnimTrackModel[0][9].setRotationPoint(44.2F, -4.4F, 12F);
		leftAnimTrackModel[0][9].rotateAngleZ = -4.22369679F;

		leftAnimTrackModel[0][10].addShapeBox(-1F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox131
		leftAnimTrackModel[0][10].setRotationPoint(52F, -9.65F, 12F);
		leftAnimTrackModel[0][10].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[0][11].addShapeBox(-1F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, 0F, 0F); // Import ImportBox132
		leftAnimTrackModel[0][11].setRotationPoint(56F, -9.65F, 12F);
		leftAnimTrackModel[0][11].rotateAngleZ = -5.44542727F;

		
		leftAnimTrackModel[1] = new ModelRendererTurbo[12];
		leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 30, 1337, textureX, textureY); // Import ImportBox121
		leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 30, 1353, textureX, textureY); // Import ImportBox122
		leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 30, 1381, textureX, textureY); // Import ImportBox123
		leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 30, 1457, textureX, textureY); // Import ImportBox124
		leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 30, 1485, textureX, textureY); // Import ImportBox125
		leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 30, 1502, textureX, textureY); // Import ImportBox126
		leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 30, 1518, textureX, textureY); // Import ImportBox127
		leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 30, 1535, textureX, textureY); // Import ImportBox128
		leftAnimTrackModel[1][8] = new ModelRendererTurbo(this, 30, 1554, textureX, textureY); // Import ImportBox129
		leftAnimTrackModel[1][9] = new ModelRendererTurbo(this, 30, 1626, textureX, textureY); // Import ImportBox130
		leftAnimTrackModel[1][10] = new ModelRendererTurbo(this, 30, 1646, textureX, textureY); // Import ImportBox131
		leftAnimTrackModel[1][11] = new ModelRendererTurbo(this, 30, 1662, textureX, textureY); // Import ImportBox132

		leftAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		leftAnimTrackModel[1][0].setRotationPoint(59F, -6F, 12F);

		leftAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
		leftAnimTrackModel[1][1].setRotationPoint(60F, -1F, 12F);
		leftAnimTrackModel[1][1].rotateAngleZ = -0.9424778F;

		leftAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 64, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		leftAnimTrackModel[1][2].setRotationPoint(46.2F, 9F, 12F);
		leftAnimTrackModel[1][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox124
		leftAnimTrackModel[1][3].setRotationPoint(-17.8F, 9F, 12F);
		leftAnimTrackModel[1][3].rotateAngleZ = -2.21656815F;

		leftAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		leftAnimTrackModel[1][4].setRotationPoint(-31F, -0.9F, 12F);
		leftAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		leftAnimTrackModel[1][5].setRotationPoint(-31F, -5.9F, 12F);
		leftAnimTrackModel[1][5].rotateAngleZ = -3.83972435F;

		leftAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		leftAnimTrackModel[1][6].setRotationPoint(-27.8F, -9.7F, 12F);
		leftAnimTrackModel[1][6].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		leftAnimTrackModel[1][7].setRotationPoint(-22.8F, -9.7F, 12F);
		leftAnimTrackModel[1][7].rotateAngleZ = -5.30580093F;

		leftAnimTrackModel[1][8].addShapeBox(-1F, 0F, 0F, 1, 61, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		leftAnimTrackModel[1][8].setRotationPoint(-16.8F, -5.4F, 12F);
		leftAnimTrackModel[1][8].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[1][9].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		leftAnimTrackModel[1][9].setRotationPoint(44.2F, -4.4F, 12F);
		leftAnimTrackModel[1][9].rotateAngleZ = -4.22369679F;

		leftAnimTrackModel[1][10].addShapeBox(-1F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox131
		leftAnimTrackModel[1][10].setRotationPoint(52F, -9.65F, 12F);
		leftAnimTrackModel[1][10].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[1][11].addShapeBox(-1F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, 0F, 0F); // Import ImportBox132
		leftAnimTrackModel[1][11].setRotationPoint(56F, -9.65F, 12F);
		leftAnimTrackModel[1][11].rotateAngleZ = -5.44542727F;


		rightAnimTrackModel[1] = new ModelRendererTurbo[12];
		rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 30, 1337, textureX, textureY); // Import ImportBox164
		rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 30, 1353, textureX, textureY); // Import ImportBox165
		rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 30, 1381, textureX, textureY); // Import ImportBox166
		rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 30, 1457, textureX, textureY); // Import ImportBox167
		rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 30, 1485, textureX, textureY); // Import ImportBox168
		rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 30, 1502, textureX, textureY); // Import ImportBox169
		rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 30, 1518, textureX, textureY); // Import ImportBox170
		rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 30, 1535, textureX, textureY); // Import ImportBox171
		rightAnimTrackModel[1][8] = new ModelRendererTurbo(this, 30, 1554, textureX, textureY); // Import ImportBox172
		rightAnimTrackModel[1][9] = new ModelRendererTurbo(this, 30, 1626, textureX, textureY); // Import ImportBox173
		rightAnimTrackModel[1][10] = new ModelRendererTurbo(this, 30, 1646, textureX, textureY); // Import ImportBox174
		rightAnimTrackModel[1][11] = new ModelRendererTurbo(this, 30, 1662, textureX, textureY); // Import ImportBox175

		rightAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		rightAnimTrackModel[1][0].setRotationPoint(59F, -6F, -22F);

		rightAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox165
		rightAnimTrackModel[1][1].setRotationPoint(60F, -1F, -22F);
		rightAnimTrackModel[1][1].rotateAngleZ = -0.9424778F;

		rightAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 64, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		rightAnimTrackModel[1][2].setRotationPoint(46.2F, 9F, -22F);
		rightAnimTrackModel[1][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox167
		rightAnimTrackModel[1][3].setRotationPoint(-17.8F, 9F, -22F);
		rightAnimTrackModel[1][3].rotateAngleZ = -2.21656815F;

		rightAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox168
		rightAnimTrackModel[1][4].setRotationPoint(-31F, -0.9F, -22F);
		rightAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox169
		rightAnimTrackModel[1][5].setRotationPoint(-31F, -5.9F, -22F);
		rightAnimTrackModel[1][5].rotateAngleZ = -3.83972435F;

		rightAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox170
		rightAnimTrackModel[1][6].setRotationPoint(-27.8F, -9.7F, -22F);
		rightAnimTrackModel[1][6].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox171
		rightAnimTrackModel[1][7].setRotationPoint(-22.8F, -9.7F, -22F);
		rightAnimTrackModel[1][7].rotateAngleZ = -5.30580093F;

		rightAnimTrackModel[1][8].addShapeBox(-1F, 0F, 0F, 1, 61, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		rightAnimTrackModel[1][8].setRotationPoint(-16.8F, -5.4F, -22F);
		rightAnimTrackModel[1][8].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[1][9].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		rightAnimTrackModel[1][9].setRotationPoint(44.2F, -4.4F, -22F);
		rightAnimTrackModel[1][9].rotateAngleZ = -4.22369679F;

		rightAnimTrackModel[1][10].addShapeBox(-1F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		rightAnimTrackModel[1][10].setRotationPoint(52F, -9.65F, -22F);
		rightAnimTrackModel[1][10].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[1][11].addShapeBox(-1F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, 0F, 0F); // Import ImportBox175
		rightAnimTrackModel[1][11].setRotationPoint(56F, -9.65F, -22F);
		rightAnimTrackModel[1][11].rotateAngleZ = -5.44542727F;

		leftAnimTrackModel[2] = new ModelRendererTurbo[12];
		leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 60, 1337, textureX, textureY); // Import ImportBox121
		leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 60, 1353, textureX, textureY); // Import ImportBox122
		leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 60, 1381, textureX, textureY); // Import ImportBox123
		leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 60, 1457, textureX, textureY); // Import ImportBox124
		leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 60, 1485, textureX, textureY); // Import ImportBox125
		leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 60, 1502, textureX, textureY); // Import ImportBox126
		leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 60, 1518, textureX, textureY); // Import ImportBox127
		leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 60, 1535, textureX, textureY); // Import ImportBox128
		leftAnimTrackModel[2][8] = new ModelRendererTurbo(this, 60, 1554, textureX, textureY); // Import ImportBox129
		leftAnimTrackModel[2][9] = new ModelRendererTurbo(this, 60, 1626, textureX, textureY); // Import ImportBox130
		leftAnimTrackModel[2][10] = new ModelRendererTurbo(this, 60, 1646, textureX, textureY); // Import ImportBox131
		leftAnimTrackModel[2][11] = new ModelRendererTurbo(this, 60, 1662, textureX, textureY); // Import ImportBox132

		leftAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox121
		leftAnimTrackModel[2][0].setRotationPoint(59F, -6F, 12F);

		leftAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox122
		leftAnimTrackModel[2][1].setRotationPoint(60F, -1F, 12F);
		leftAnimTrackModel[2][1].rotateAngleZ = -0.9424778F;

		leftAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 64, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox123
		leftAnimTrackModel[2][2].setRotationPoint(46.2F, 9F, 12F);
		leftAnimTrackModel[2][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox124
		leftAnimTrackModel[2][3].setRotationPoint(-17.8F, 9F, 12F);
		leftAnimTrackModel[2][3].rotateAngleZ = -2.21656815F;

		leftAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox125
		leftAnimTrackModel[2][4].setRotationPoint(-31F, -0.9F, 12F);
		leftAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox126
		leftAnimTrackModel[2][5].setRotationPoint(-31F, -5.9F, 12F);
		leftAnimTrackModel[2][5].rotateAngleZ = -3.83972435F;

		leftAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox127
		leftAnimTrackModel[2][6].setRotationPoint(-27.8F, -9.7F, 12F);
		leftAnimTrackModel[2][6].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		leftAnimTrackModel[2][7].setRotationPoint(-22.8F, -9.7F, 12F);
		leftAnimTrackModel[2][7].rotateAngleZ = -5.30580093F;

		leftAnimTrackModel[2][8].addShapeBox(-1F, 0F, 0F, 1, 61, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		leftAnimTrackModel[2][8].setRotationPoint(-16.8F, -5.4F, 12F);
		leftAnimTrackModel[2][8].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[2][9].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox130
		leftAnimTrackModel[2][9].setRotationPoint(44.2F, -4.4F, 12F);
		leftAnimTrackModel[2][9].rotateAngleZ = -4.22369679F;

		leftAnimTrackModel[2][10].addShapeBox(-1F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox131
		leftAnimTrackModel[2][10].setRotationPoint(52F, -9.65F, 12F);
		leftAnimTrackModel[2][10].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[2][11].addShapeBox(-1F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, 0F, 0F); // Import ImportBox132
		leftAnimTrackModel[2][11].setRotationPoint(56F, -9.65F, 12F);
		leftAnimTrackModel[2][11].rotateAngleZ = -5.44542727F;


		rightAnimTrackModel[2] = new ModelRendererTurbo[12];
		rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 60, 1337, textureX, textureY); // Import ImportBox164
		rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 60, 1353, textureX, textureY); // Import ImportBox165
		rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 60, 1381, textureX, textureY); // Import ImportBox166
		rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 60, 1457, textureX, textureY); // Import ImportBox167
		rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 60, 1485, textureX, textureY); // Import ImportBox168
		rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 60, 1502, textureX, textureY); // Import ImportBox169
		rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 60, 1518, textureX, textureY); // Import ImportBox170
		rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 60, 1535, textureX, textureY); // Import ImportBox171
		rightAnimTrackModel[2][8] = new ModelRendererTurbo(this, 60, 1554, textureX, textureY); // Import ImportBox172
		rightAnimTrackModel[2][9] = new ModelRendererTurbo(this, 60, 1626, textureX, textureY); // Import ImportBox173
		rightAnimTrackModel[2][10] = new ModelRendererTurbo(this, 60, 1646, textureX, textureY); // Import ImportBox174
		rightAnimTrackModel[2][11] = new ModelRendererTurbo(this, 60, 1662, textureX, textureY); // Import ImportBox175

		rightAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox164
		rightAnimTrackModel[2][0].setRotationPoint(59F, -6F, -22F);

		rightAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox165
		rightAnimTrackModel[2][1].setRotationPoint(60F, -1F, -22F);
		rightAnimTrackModel[2][1].rotateAngleZ = -0.9424778F;

		rightAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 64, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox166
		rightAnimTrackModel[2][2].setRotationPoint(46.2F, 9F, -22F);
		rightAnimTrackModel[2][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 17, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox167
		rightAnimTrackModel[2][3].setRotationPoint(-17.8F, 9F, -22F);
		rightAnimTrackModel[2][3].rotateAngleZ = -2.21656815F;

		rightAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox168
		rightAnimTrackModel[2][4].setRotationPoint(-31F, -0.9F, -22F);
		rightAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox169
		rightAnimTrackModel[2][5].setRotationPoint(-31F, -5.9F, -22F);
		rightAnimTrackModel[2][5].rotateAngleZ = -3.83972435F;

		rightAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox170
		rightAnimTrackModel[2][6].setRotationPoint(-27.8F, -9.7F, -22F);
		rightAnimTrackModel[2][6].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox171
		rightAnimTrackModel[2][7].setRotationPoint(-22.8F, -9.7F, -22F);
		rightAnimTrackModel[2][7].rotateAngleZ = -5.30580093F;

		rightAnimTrackModel[2][8].addShapeBox(-1F, 0F, 0F, 1, 61, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		rightAnimTrackModel[2][8].setRotationPoint(-16.8F, -5.4F, -22F);
		rightAnimTrackModel[2][8].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[2][9].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox173
		rightAnimTrackModel[2][9].setRotationPoint(44.2F, -4.4F, -22F);
		rightAnimTrackModel[2][9].rotateAngleZ = -4.22369679F;

		rightAnimTrackModel[2][10].addShapeBox(-1F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox174
		rightAnimTrackModel[2][10].setRotationPoint(52F, -9.65F, -22F);
		rightAnimTrackModel[2][10].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[2][11].addShapeBox(-1F, 0F, 0F, 1, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, 0F, 0F); // Import ImportBox175
		rightAnimTrackModel[2][11].setRotationPoint(56F, -9.65F, -22F);
		rightAnimTrackModel[2][11].rotateAngleZ = -5.44542727F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}