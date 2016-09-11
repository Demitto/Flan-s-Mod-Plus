//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.4
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelChronos extends ModelMecha
{
	int textureX = 512;
	int textureY = 512;

	public ModelChronos()
	{
		headModel = new ModelRendererTurbo[66];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		headModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		headModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		headModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		headModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		headModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		headModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		headModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		headModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		headModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		headModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		headModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		headModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		headModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		headModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		headModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		headModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		headModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		headModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		headModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		headModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		headModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		headModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		headModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		headModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		headModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		headModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		headModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		headModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		headModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		headModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		headModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		headModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		headModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		headModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		headModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		headModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		headModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		headModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		headModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		headModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		headModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		headModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		headModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		headModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		headModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		headModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		headModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		headModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		headModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		headModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		headModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		headModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		headModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		headModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		headModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		headModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		headModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		headModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		headModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68

		headModel[0].addBox(0F, 0F, 0F, 10, 3, 14, 0F); // Box 0
		headModel[0].setRotationPoint(-7F, -38F, -7F);

		headModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(3F, -38F, -7F);

		headModel[2].addBox(0F, -11F, 0F, 3, 11, 14, 0F); // Box 4
		headModel[2].setRotationPoint(-7F, -38F, -7F);
		headModel[2].rotateAngleZ = 0.13962634F;

		headModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 5
		headModel[3].setRotationPoint(-7F, -38F, -7F);
		headModel[3].rotateAngleZ = 0.13962634F;

		headModel[4].addShapeBox(0F, -14F, 0F, 3, 3, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[4].setRotationPoint(-7F, -38F, -7F);
		headModel[4].rotateAngleZ = 0.13962634F;

		headModel[5].addShapeBox(2F, -20F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[5].setRotationPoint(-7F, -38F, -4F);
		headModel[5].rotateAngleZ = 0.13962634F;

		headModel[6].addShapeBox(1F, -20F, 0F, 1, 8, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		headModel[6].setRotationPoint(-7F, -38F, -4F);
		headModel[6].rotateAngleZ = 0.13962634F;

		headModel[7].addShapeBox(4F, -20F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 9
		headModel[7].setRotationPoint(-7F, -38F, -3F);
		headModel[7].rotateAngleZ = 0.13962634F;

		headModel[8].addShapeBox(4F, -16F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10
		headModel[8].setRotationPoint(-7F, -38F, -3F);
		headModel[8].rotateAngleZ = 0.13962634F;

		headModel[9].addShapeBox(3F, -11F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 11
		headModel[9].setRotationPoint(-7F, -39F, -5F);
		headModel[9].rotateAngleZ = 0.13962634F;

		headModel[10].addShapeBox(3F, -8F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 12
		headModel[10].setRotationPoint(-7F, -39F, -5F);
		headModel[10].rotateAngleZ = 0.13962634F;

		headModel[11].addShapeBox(3F, -5F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 13
		headModel[11].setRotationPoint(-7F, -38F, -5F);
		headModel[11].rotateAngleZ = 0.13962634F;

		headModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[12].setRotationPoint(-7F, -39F, -5F);

		headModel[13].addShapeBox(3F, -11F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 15
		headModel[13].setRotationPoint(-7F, -38F, -7F);
		headModel[13].rotateAngleZ = 0.13962634F;

		headModel[14].addShapeBox(3F, -11F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 16
		headModel[14].setRotationPoint(-7F, -38F, 5F);
		headModel[14].rotateAngleZ = 0.13962634F;

		headModel[15].addBox(0F, 0F, 0F, 3, 14, 12, 0F); // Box 17
		headModel[15].setRotationPoint(-10F, -49F, -6F);

		headModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 18
		headModel[16].setRotationPoint(-10F, -49F, -10F);

		headModel[17].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[17].setRotationPoint(-8F, -44F, -10F);

		headModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		headModel[18].setRotationPoint(8F, -44F, -7F);

		headModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		headModel[19].setRotationPoint(9F, -45F, -9F);

		headModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		headModel[20].setRotationPoint(9.5F, -50F, -8.5F);

		headModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[21].setRotationPoint(8.5F, -50F, -8.5F);

		headModel[22].addBox(0F, 0F, 0F, 28, 3, 14, 0F); // Box 24
		headModel[22].setRotationPoint(-10F, -35F, -7F);

		headModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		headModel[23].setRotationPoint(12F, -40F, -7F);

		headModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		headModel[24].setRotationPoint(13.5F, -39F, -6.5F);

		headModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		headModel[25].setRotationPoint(13.5F, -39F, -4.5F);

		headModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[26].setRotationPoint(13.5F, -39F, 3.5F);

		headModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[27].setRotationPoint(13.5F, -39F, 5.5F);

		headModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[28].setRotationPoint(12F, -40F, 3F);

		headModel[29].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		headModel[29].setRotationPoint(-10F, -49F, 6F);

		headModel[30].addShapeBox(0F, 0F, 0F, 20, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		headModel[30].setRotationPoint(-8F, -44F, 7F);

		headModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		headModel[31].setRotationPoint(9F, -45F, 7F);

		headModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		headModel[32].setRotationPoint(9.5F, -50F, 7.5F);

		headModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		headModel[33].setRotationPoint(8.5F, -50F, 7.5F);

		headModel[34].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 36
		headModel[34].setRotationPoint(14F, -43F, -2F);

		headModel[35].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 37
		headModel[35].setRotationPoint(14F, -46F, -2F);
		headModel[35].rotateAngleZ = 0.80285146F;

		headModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		headModel[36].setRotationPoint(14F, -46F, -3F);
		headModel[36].rotateAngleZ = 0.80285146F;

		headModel[37].addShapeBox(-1F, 0F, -1F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		headModel[37].setRotationPoint(14F, -46F, -3F);
		headModel[37].rotateAngleZ = 0.80285146F;

		headModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 40
		headModel[38].setRotationPoint(14F, -46F, 2F);
		headModel[38].rotateAngleZ = 0.80285146F;

		headModel[39].addShapeBox(-1F, 0F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		headModel[39].setRotationPoint(14F, -46F, 2F);
		headModel[39].rotateAngleZ = 0.80285146F;

		headModel[40].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 42
		headModel[40].setRotationPoint(14F, -46F, -2F);
		headModel[40].rotateAngleZ = 0.80285146F;

		headModel[41].addShapeBox(0F, -0.5F, 1F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 43
		headModel[41].setRotationPoint(14F, -46F, -2F);
		headModel[41].rotateAngleZ = 0.80285146F;

		headModel[42].addShapeBox(0F, -0.5F, 2F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 44
		headModel[42].setRotationPoint(14F, -46F, -2F);
		headModel[42].rotateAngleZ = 0.80285146F;

		headModel[43].addShapeBox(0F, -0.5F, 3F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 45
		headModel[43].setRotationPoint(14F, -46F, -2F);
		headModel[43].rotateAngleZ = 0.80285146F;

		headModel[44].addShapeBox(1F, -0.5F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 46
		headModel[44].setRotationPoint(14F, -46F, -2F);
		headModel[44].rotateAngleZ = 0.80285146F;

		headModel[45].addShapeBox(1F, -0.5F, 3F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 47
		headModel[45].setRotationPoint(14F, -46F, -2F);
		headModel[45].rotateAngleZ = 0.80285146F;

		headModel[46].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 48
		headModel[46].setRotationPoint(14F, -46F, -2F);
		headModel[46].rotateAngleZ = 0.80285146F;

		headModel[47].addShapeBox(2F, -0.5F, 3F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 49
		headModel[47].setRotationPoint(14F, -46F, -2F);
		headModel[47].rotateAngleZ = 0.80285146F;

		headModel[48].addShapeBox(1.5F, -0.5F, 1F, 20, 1, 20, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -18F, 0F, 0F, -18F); // Box 50
		headModel[48].setRotationPoint(14F, -46F, -2F);
		headModel[48].rotateAngleZ = 0.80285146F;

		headModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		headModel[49].setRotationPoint(15F, -48F, -1F);

		headModel[50].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 52
		headModel[50].setRotationPoint(18F, -48F, -1F);

		headModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		headModel[51].setRotationPoint(18F, -48F, -8F);

		headModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		headModel[52].setRotationPoint(18F, -54F, -8F);

		headModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		headModel[53].setRotationPoint(18F, -54F, 7F);

		headModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		headModel[54].setRotationPoint(18F, -48F, 1F);

		headModel[55].addShapeBox(0F, 0F, 0F, 0, 28, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, -14F, 0F, -14F, -14F); // Box 57
		headModel[55].setRotationPoint(18.5F, -62F, -7F);

		headModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		headModel[56].setRotationPoint(18F, -44F, -8F);

		headModel[57].addShapeBox(-0.5F, -2F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		headModel[57].setRotationPoint(18F, -44F, -7F);
		headModel[57].rotateAngleZ = -0.43633231F;

		headModel[58].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 60
		headModel[58].setRotationPoint(18F, -44F, -7F);
		headModel[58].rotateAngleZ = -0.43633231F;

		headModel[59].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
		headModel[59].setRotationPoint(18F, -44F, -6F);
		headModel[59].rotateAngleZ = -0.43633231F;

		headModel[60].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 63
		headModel[60].setRotationPoint(18F, -44F, -6F);
		headModel[60].rotateAngleZ = -0.43633231F;

		headModel[61].addShapeBox(-1F, -1F, 1F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		headModel[61].setRotationPoint(18F, -44F, 4F);
		headModel[61].rotateAngleZ = -0.43633231F;

		headModel[62].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 65
		headModel[62].setRotationPoint(18F, -44F, 5F);
		headModel[62].rotateAngleZ = -0.43633231F;

		headModel[63].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 66
		headModel[63].setRotationPoint(18F, -44F, 6F);
		headModel[63].rotateAngleZ = -0.43633231F;

		headModel[64].addShapeBox(-0.5F, -2F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		headModel[64].setRotationPoint(18F, -44F, 3F);
		headModel[64].rotateAngleZ = -0.43633231F;

		headModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		headModel[65].setRotationPoint(18F, -44F, 1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}