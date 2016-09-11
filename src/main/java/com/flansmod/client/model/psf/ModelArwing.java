//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelArwing extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelArwing()
	{
		bodyModel = new ModelRendererTurbo[77];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 86, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 82, 134, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 99, 99, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 52, 169, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 162, 0, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 239, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 204, 401, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 161, 84, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 128, 40, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 213, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 213, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 158, 44, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 220, 44, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 181, 125, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 181, 140, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 181, 155, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 133, 84, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 106, 84, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 84, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 133, 84, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 106, 84, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 84, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 181, 155, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 181, 125, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 181, 140, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 200, 44, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 181, 155, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 181, 125, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 181, 140, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 200, 44, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 181, 155, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 181, 125, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 181, 140, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 311, 0, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 331, 0, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 331, 52, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 331, 75, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 311, 0, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 331, 26, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 365, 52, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 266, 39, textureX, textureY); // Box 1
		bodyModel[47] = new ModelRendererTurbo(this, 266, 51, textureX, textureY); // Box 3
		bodyModel[48] = new ModelRendererTurbo(this, 217, 83, textureX, textureY); // Box 5
		bodyModel[49] = new ModelRendererTurbo(this, 217, 83, textureX, textureY); // Box 6
		bodyModel[50] = new ModelRendererTurbo(this, 234, 82, textureX, textureY); // Box 7
		bodyModel[51] = new ModelRendererTurbo(this, 230, 139, textureX, textureY); // Box 8
		bodyModel[52] = new ModelRendererTurbo(this, 187, 176, textureX, textureY); // Box 9
		bodyModel[53] = new ModelRendererTurbo(this, 250, 195, textureX, textureY); // Box 10
		bodyModel[54] = new ModelRendererTurbo(this, 188, 230, textureX, textureY); // Box 11
		bodyModel[55] = new ModelRendererTurbo(this, 250, 264, textureX, textureY); // Box 12
		bodyModel[56] = new ModelRendererTurbo(this, 217, 83, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 217, 83, textureX, textureY); // Box 14
		bodyModel[58] = new ModelRendererTurbo(this, 234, 110, textureX, textureY); // Box 15
		bodyModel[59] = new ModelRendererTurbo(this, 187, 203, textureX, textureY); // Box 16
		bodyModel[60] = new ModelRendererTurbo(this, 230, 168, textureX, textureY); // Box 17
		bodyModel[61] = new ModelRendererTurbo(this, 250, 229, textureX, textureY); // Box 18
		bodyModel[62] = new ModelRendererTurbo(this, 188, 264, textureX, textureY); // Box 19
		bodyModel[63] = new ModelRendererTurbo(this, 250, 305, textureX, textureY); // Box 20
		bodyModel[64] = new ModelRendererTurbo(this, 0, 287, textureX, textureY); // Box 21
		bodyModel[65] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 22
		bodyModel[66] = new ModelRendererTurbo(this, 39, 287, textureX, textureY); // Box 23
		bodyModel[67] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Box 24
		bodyModel[68] = new ModelRendererTurbo(this, 43, 313, textureX, textureY); // Box 25
		bodyModel[69] = new ModelRendererTurbo(this, 81, 0, textureX, textureY); // Box 26
		bodyModel[70] = new ModelRendererTurbo(this, 0, 314, textureX, textureY); // Box 27
		bodyModel[71] = new ModelRendererTurbo(this, 0, 326, textureX, textureY); // Box 28
		bodyModel[72] = new ModelRendererTurbo(this, 39, 287, textureX, textureY); // Box 29
		bodyModel[73] = new ModelRendererTurbo(this, 0, 346, textureX, textureY); // Box 30
		bodyModel[74] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 31
		bodyModel[75] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Box 32
		bodyModel[76] = new ModelRendererTurbo(this, 105, 288, textureX, textureY); // Box 33

		bodyModel[0].addShapeBox(0F, 0F, 0F, 19, 24, 30, 0F, 0F, 0F, 0F, 0F, -4F, -10F, 0F, -4F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(15F, -53F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 15, 24, 30, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 5F); // Box 1
		bodyModel[1].setRotationPoint(0F, -53F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 14, 20, 0F, 0F, -14F, -5F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -14F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 2
		bodyModel[2].setRotationPoint(-40F, -67F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 14, 20, 0F, 0F, -5F, -5F, 0F, -14F, -5F, 0F, -14F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, -67F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 20, 29, 40, 0F); // Box 4
		bodyModel[4].setRotationPoint(-20F, -53F, -20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 29, 40, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, -3F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -15F); // Box 5
		bodyModel[5].setRotationPoint(-45F, -53F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 60, 26, 10, 0F, 0F, -14F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F); // Box 6
		bodyModel[6].setRotationPoint(-105F, -53F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 60, 25, 20, 0F, 0F, -14F, -20F, 25F, 0F, 0F, 0F, 0F, -5F, 0F, -14F, 0F, 0F, -10F, -20F, 25F, 4F, 0F, 0F, 1F, -5F, 0F, -10F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-105F, -53F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, -20F, 60, 25, 20, 0F, 0F, -14F, 0F, 0F, 0F, -5F, 25F, 0F, 0F, 0F, -14F, -20F, 0F, -10F, 0F, 0F, 1F, -5F, 25F, 4F, 0F, 0F, -10F, -20F); // Box 8
		bodyModel[8].setRotationPoint(-105F, -53F, 20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 7, 10, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(20F, -53F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 14, 20, 0F, 0F, -1F, -2.5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-15F, -67F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(15F, -53F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F); // Box 12
		bodyModel[12].setRotationPoint(0F, -41F, -30F);

		bodyModel[13].addShapeBox(0F, 0F, -14F, 10, 10, 14, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(0F, -41F, 30F);

		bodyModel[14].addBox(0F, 0F, 0F, 10, 15, 20, 0F); // Box 14
		bodyModel[14].setRotationPoint(24F, -49F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 15, 20, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(34F, -49F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 15, 5, 0F, 0F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -7F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(15F, -49F, -15F);

		bodyModel[17].addShapeBox(0F, 0F, -5F, 19, 15, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(15F, -49F, 15F);

		bodyModel[18].addBox(0F, 0F, 0F, 18, 6, 5, 0F); // Box 18
		bodyModel[18].setRotationPoint(-3F, -39F, -35F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-3F, -33F, -35F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-3F, -45F, -35F);

		bodyModel[21].addBox(0F, 0F, 0F, 17, 6, 6, 0F); // Box 21
		bodyModel[21].setRotationPoint(-8F, -47F, -30F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 22
		bodyModel[22].setRotationPoint(-18F, -45.5F, -28.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(9F, -47F, -30F);

		bodyModel[24].addBox(0F, 0F, -6F, 17, 6, 6, 0F); // Box 24
		bodyModel[24].setRotationPoint(-8F, -47F, 30F);

		bodyModel[25].addBox(0F, 0F, -3F, 10, 3, 3, 0F); // Box 25
		bodyModel[25].setRotationPoint(-18F, -45.5F, 28.5F);

		bodyModel[26].addShapeBox(0F, 0F, -6F, 7, 6, 6, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(9F, -47F, 30F);

		bodyModel[27].addShapeBox(0F, 0F, -5F, 18, 6, 5, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-3F, -45F, 35F);

		bodyModel[28].addBox(0F, 0F, -5F, 18, 6, 5, 0F); // Box 28
		bodyModel[28].setRotationPoint(-3F, -39F, 35F);

		bodyModel[29].addShapeBox(0F, 0F, -5F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-3F, -33F, 35F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 5, 14, 0F); // Box 30
		bodyModel[30].setRotationPoint(3.5F, -38.5F, -49F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-3F, -45F, -45F);

		bodyModel[32].addBox(0F, 0F, 0F, 18, 6, 5, 0F); // Box 32
		bodyModel[32].setRotationPoint(-3F, -39F, -45F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-3F, -33F, -45F);

		bodyModel[34].addBox(0F, 0F, -14F, 5, 5, 14, 0F); // Box 34
		bodyModel[34].setRotationPoint(3.5F, -38.5F, 49F);

		bodyModel[35].addShapeBox(0F, 0F, -5F, 18, 6, 5, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-3F, -45F, 45F);

		bodyModel[36].addBox(0F, 0F, -5F, 18, 6, 5, 0F); // Box 36
		bodyModel[36].setRotationPoint(-3F, -39F, 45F);

		bodyModel[37].addShapeBox(0F, 0F, -5F, 18, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-3F, -33F, 45F);

		bodyModel[38].addBox(-2F, -1F, -1.5F, 4, 14, 4, 0F); // Box 38
		bodyModel[38].setRotationPoint(6F, -34F, -38F);
		bodyModel[38].rotateAngleX = -0.05235988F;
		bodyModel[38].rotateAngleZ = -0.40142573F;

		bodyModel[39].addShapeBox(-13F, 10F, -7F, 16, 10, 15, 0F, 5F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -7.5F, -5F, 0F, -7.5F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, -7.5F); // Box 39
		bodyModel[39].setRotationPoint(1F, -34F, -38F);
		bodyModel[39].rotateAngleX = -0.05235988F;

		bodyModel[40].addShapeBox(-8F, 20F, -2F, 11, 17, 5, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -25F, -2F, -2.5F, 35F, 2F, -2F, 35F, 2F, -2F, -25F, -2F, -2.5F); // Box 40
		bodyModel[40].setRotationPoint(1F, -34F, -38F);
		bodyModel[40].rotateAngleX = -0.05235988F;

		bodyModel[41].addShapeBox(3F, 10F, -7F, 25, 10, 15, 0F, 0F, 0F, 0F, -17F, -2F, 0F, -17F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 10F, 19F, -7F, 10F, 19F, -7F, 0F, 0F, -5F); // Box 41
		bodyModel[41].setRotationPoint(1F, -34F, -38F);
		bodyModel[41].rotateAngleX = -0.05235988F;

		bodyModel[42].addBox(-2F, -1F, -2.5F, 4, 14, 4, 0F); // Box 43
		bodyModel[42].setRotationPoint(6F, -34F, 38F);
		bodyModel[42].rotateAngleX = 0.05235988F;
		bodyModel[42].rotateAngleZ = -0.40142573F;

		bodyModel[43].addShapeBox(-13F, 10F, -8F, 16, 10, 15, 0F, 5F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -7.5F, -5F, 0F, -7.5F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, -7.5F); // Box 44
		bodyModel[43].setRotationPoint(1F, -34F, 38F);
		bodyModel[43].rotateAngleX = 0.05235988F;

		bodyModel[44].addShapeBox(-8F, 20F, -3F, 11, 17, 5, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -25F, -2F, -2.5F, 35F, 2F, -2F, 35F, 2F, -2F, -25F, -2F, -2.5F); // Box 45
		bodyModel[44].setRotationPoint(1F, -34F, 38F);
		bodyModel[44].rotateAngleX = 0.05235988F;

		bodyModel[45].addShapeBox(3F, 10F, -8F, 25, 10, 15, 0F, 0F, 0F, 0F, -17F, -2F, 0F, -17F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 10F, 19F, -7F, 10F, 19F, -7F, 0F, 0F, -5F); // Box 46
		bodyModel[45].setRotationPoint(1F, -34F, 38F);
		bodyModel[45].rotateAngleX = 0.05235988F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F); // Box 1
		bodyModel[46].setRotationPoint(24F, -55F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 3
		bodyModel[47].setRotationPoint(22F, -34F, -2F);

		bodyModel[48].addBox(-2F, -16F, 2.5F, 4, 15, 4, 0F); // Box 5
		bodyModel[48].setRotationPoint(6F, -38F, 38F);
		bodyModel[48].rotateAngleX = 0.12217305F;
		bodyModel[48].rotateAngleZ = 0.45378561F;

		bodyModel[49].addBox(-2F, -16F, -7.5F, 4, 15, 4, 0F); // Box 6
		bodyModel[49].setRotationPoint(6F, -38F, 38F);
		bodyModel[49].rotateAngleX = -0.12217305F;
		bodyModel[49].rotateAngleZ = 0.45378561F;

		bodyModel[50].addShapeBox(-28F, -19F, -10.5F, 20, 6, 20, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -15F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -15F, 0F, -5F); // Box 7
		bodyModel[50].setRotationPoint(6F, -38F, 38F);

		bodyModel[51].addShapeBox(2F, -19F, -10.5F, 45, 6, 20, 0F, 0F, 0F, 0F, 0F, 25F, -9F, 0F, 25F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -30F, -9F, 0F, -30F, -9F, 0F, 0F, -2F); // Box 8
		bodyModel[51].setRotationPoint(6F, -38F, 38F);

		bodyModel[52].addShapeBox(-8F, -19F, -10.5F, 10, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[52].setRotationPoint(6F, -38F, 38F);

		bodyModel[53].addShapeBox(-28F, -32F, -10.5F, 20, 13, 20, 0F, -20F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -20F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 10
		bodyModel[53].setRotationPoint(6F, -38F, 38F);

		bodyModel[54].addShapeBox(-8F, -32F, -10.5F, 10, 13, 20, 0F, 0F, 0F, -9F, 0F, 6F, -9F, 0F, 6F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[54].setRotationPoint(6F, -38F, 38F);

		bodyModel[55].addShapeBox(2F, -38F, -10.5F, 45, 19, 20, 0F, 0F, 0F, -9F, 0F, 6F, -9F, 0F, 6F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -25F, -9F, 0F, -25F, -9F, 0F, 0F, 0F); // Box 12
		bodyModel[55].setRotationPoint(6F, -38F, 38F);

		bodyModel[56].addBox(-2F, -16F, -6.5F, 4, 15, 4, 0F); // Box 13
		bodyModel[56].setRotationPoint(6F, -38F, -38F);
		bodyModel[56].rotateAngleX = -0.12217305F;
		bodyModel[56].rotateAngleZ = 0.45378561F;

		bodyModel[57].addBox(-2F, -16F, 3.5F, 4, 15, 4, 0F); // Box 14
		bodyModel[57].setRotationPoint(6F, -38F, -38F);
		bodyModel[57].rotateAngleX = 0.12217305F;
		bodyModel[57].rotateAngleZ = 0.45378561F;

		bodyModel[58].addShapeBox(-28F, -19F, -9.5F, 20, 6, 20, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -15F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -15F, 0F, -5F); // Box 15
		bodyModel[58].setRotationPoint(6F, -38F, -38F);

		bodyModel[59].addShapeBox(-8F, -19F, -9.5F, 10, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		bodyModel[59].setRotationPoint(6F, -38F, -38F);

		bodyModel[60].addShapeBox(2F, -19F, -9.5F, 45, 6, 20, 0F, 0F, 0F, 0F, 0F, 25F, -9F, 0F, 25F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -30F, -9F, 0F, -30F, -9F, 0F, 0F, -2F); // Box 17
		bodyModel[60].setRotationPoint(6F, -38F, -38F);

		bodyModel[61].addShapeBox(-28F, -32F, -9.5F, 20, 13, 20, 0F, -20F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -20F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 18
		bodyModel[61].setRotationPoint(6F, -38F, -38F);

		bodyModel[62].addShapeBox(-8F, -32F, -9.5F, 10, 13, 20, 0F, 0F, 0F, -9F, 0F, 6F, -9F, 0F, 6F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[62].setRotationPoint(6F, -38F, -38F);

		bodyModel[63].addShapeBox(2F, -38F, -9.5F, 45, 19, 20, 0F, 0F, 0F, -9F, 0F, 6F, -9F, 0F, 6F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -25F, -9F, 0F, -25F, -9F, 0F, 0F, 0F); // Box 20
		bodyModel[63].setRotationPoint(6F, -38F, -38F);

		bodyModel[64].addShapeBox(-7F, -7F, -2F, 15, 7, 3, 0F, -3F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -3F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[64].setRotationPoint(6F, -36F, 50F);

		bodyModel[65].addShapeBox(-7F, 0F, -2F, 15, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -3F, -2F, -2F); // Box 22
		bodyModel[65].setRotationPoint(6F, -36F, 50F);

		bodyModel[66].addShapeBox(-2.5F, -2.5F, 0F, 5, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 23
		bodyModel[66].setRotationPoint(6F, -36F, 50F);

		bodyModel[67].addShapeBox(-8.5F, -1.5F, 2F, 21, 3, 40, 0F, -2F, -1F, 0F, -7F, 0F, 0F, 5F, -0.5F, 0F, -10F, -1F, 0F, -2F, -1F, 0F, -7F, 0F, 0F, 5F, -0.5F, 0F, -10F, -1F, 0F); // Box 24
		bodyModel[67].setRotationPoint(6F, -36F, 50F);
		bodyModel[67].rotateAngleX = -0.03490659F;

		bodyModel[68].addShapeBox(-0.5F, -1.5F, 42F, 38, 3, 80, 0F, -2F, -1F, 0F, -7F, 0F, 0F, -15F, -1F, 3F, -15F, -1F, 0F, -2F, -1F, 0F, -7F, 0F, 0F, -15F, -1F, 3F, -15F, -1F, 0F); // Box 25
		bodyModel[68].setRotationPoint(6F, -36F, 50F);
		bodyModel[68].rotateAngleX = -0.03490659F;

		bodyModel[69].addShapeBox(17.5F, -1.5F, 22F, 13, 3, 20, 0F, 6F, -0.5F, 0F, -19F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 6F, -0.5F, 0F, -19F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[69].setRotationPoint(6F, -36F, 50F);
		bodyModel[69].rotateAngleX = -0.03490659F;

		bodyModel[70].addShapeBox(-7F, -7F, -1F, 15, 7, 3, 0F, -3F, -2F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[70].setRotationPoint(6F, -36F, -50F);

		bodyModel[71].addShapeBox(-7F, 0F, -1F, 15, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, -2F, 0F); // Box 28
		bodyModel[71].setRotationPoint(6F, -36F, -50F);

		bodyModel[72].addShapeBox(-2.5F, -2.5F, -6F, 5, 5, 6, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[72].setRotationPoint(6F, -36F, -50F);

		bodyModel[73].addShapeBox(-8.5F, -1.5F, -42F, 21, 3, 40, 0F, -10F, -1F, 0F, 5F, -0.5F, 0F, -7F, 0F, 0F, -2F, -1F, 0F, -10F, -1F, 0F, 5F, -0.5F, 0F, -7F, 0F, 0F, -2F, -1F, 0F); // Box 30
		bodyModel[73].setRotationPoint(6F, -36F, -50F);
		bodyModel[73].rotateAngleX = 0.03490659F;

		bodyModel[74].addShapeBox(17.5F, -1.5F, -42F, 13, 3, 20, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -19F, -0.5F, 0F, 6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -19F, -0.5F, 0F, 6F, -0.5F, 0F); // Box 31
		bodyModel[74].setRotationPoint(6F, -36F, -50F);
		bodyModel[74].rotateAngleX = 0.03490659F;

		bodyModel[75].addShapeBox(-0.5F, -1.5F, -122F, 38, 3, 80, 0F, -15F, -1F, 0F, -15F, -1F, 3F, -7F, 0F, 0F, -2F, -1F, 0F, -15F, -1F, 0F, -15F, -1F, 3F, -7F, 0F, 0F, -2F, -1F, 0F); // Box 32
		bodyModel[75].setRotationPoint(6F, -36F, -50F);
		bodyModel[75].rotateAngleX = 0.03490659F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 24, 6, 10, 0F, 2F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 33
		bodyModel[76].setRotationPoint(-43F, -27F, -5F);


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 297, 39, textureX, textureY); // Box 2
		yawFlapModel[1] = new ModelRendererTurbo(this, 297, 51, textureX, textureY); // Box 4

		yawFlapModel[0].addShapeBox(0F, 0F, -2F, 9, 7, 4, 0F, 0F, 0F, -1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 2
		yawFlapModel[0].setRotationPoint(34F, -55F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -2F, 8, 7, 4, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, -1F); // Box 4
		yawFlapModel[1].setRotationPoint(32F, -34F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
