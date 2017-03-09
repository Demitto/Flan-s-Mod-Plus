//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelUH1Y extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelUH1Y()
	{
		bodyModel = new ModelRendererTurbo[84];
		bodyModel[0] = new ModelRendererTurbo(this, 305, 187, textureX, textureY); // Import CO.
		bodyModel[1] = new ModelRendererTurbo(this, 153, 187, textureX, textureY); // Import CO.
		bodyModel[2] = new ModelRendererTurbo(this, 0, 579, textureX, textureY); // Import CO.
		bodyModel[3] = new ModelRendererTurbo(this, 223, 141, textureX, textureY); // Import CO.
		bodyModel[4] = new ModelRendererTurbo(this, 50, 332, textureX, textureY); // Import CO.
		bodyModel[5] = new ModelRendererTurbo(this, 223, 141, textureX, textureY); // Import CO.
		bodyModel[6] = new ModelRendererTurbo(this, 172, 296, textureX, textureY); // Import CO.
		bodyModel[7] = new ModelRendererTurbo(this, 223, 125, textureX, textureY); // Import CO.
		bodyModel[8] = new ModelRendererTurbo(this, 375, 296, textureX, textureY); // Import CO.
		bodyModel[9] = new ModelRendererTurbo(this, 260, 296, textureX, textureY); // Import CO.
		bodyModel[10] = new ModelRendererTurbo(this, 260, 296, textureX, textureY); // Import CO.
		bodyModel[11] = new ModelRendererTurbo(this, 271, 296, textureX, textureY); // Import CO.
		bodyModel[12] = new ModelRendererTurbo(this, 11, 327, textureX, textureY); // Import CO.
		bodyModel[13] = new ModelRendererTurbo(this, 152, 328, textureX, textureY); // Import CO.
		bodyModel[14] = new ModelRendererTurbo(this, 21, 332, textureX, textureY); // Import CO.
		bodyModel[15] = new ModelRendererTurbo(this, 21, 296, textureX, textureY); // Import CO.
		bodyModel[16] = new ModelRendererTurbo(this, 11, 296, textureX, textureY); // Import CO.
		bodyModel[17] = new ModelRendererTurbo(this, 50, 296, textureX, textureY); // Import CO.
		bodyModel[18] = new ModelRendererTurbo(this, 152, 296, textureX, textureY); // Import CO.
		bodyModel[19] = new ModelRendererTurbo(this, 0, 327, textureX, textureY); // Import CO.
		bodyModel[20] = new ModelRendererTurbo(this, 0, 296, textureX, textureY); // Import CO.
		bodyModel[21] = new ModelRendererTurbo(this, 41, 580, textureX, textureY); // Import CO.
		bodyModel[22] = new ModelRendererTurbo(this, 0, 245, textureX, textureY); // Import CO.
		bodyModel[23] = new ModelRendererTurbo(this, 84, 580, textureX, textureY); // Import CO.
		bodyModel[24] = new ModelRendererTurbo(this, 291, 491, textureX, textureY); // Import CO.
		bodyModel[25] = new ModelRendererTurbo(this, 419, 315, textureX, textureY); // Import CO.
		bodyModel[26] = new ModelRendererTurbo(this, 223, 245, textureX, textureY); // Import CO.
		bodyModel[27] = new ModelRendererTurbo(this, 247, 187, textureX, textureY); // Import CO.
		bodyModel[28] = new ModelRendererTurbo(this, 0, 491, textureX, textureY); // Import CO.
		bodyModel[29] = new ModelRendererTurbo(this, 419, 296, textureX, textureY); // Import CO.
		bodyModel[30] = new ModelRendererTurbo(this, 87, 319, textureX, textureY); // Import CO.
		bodyModel[31] = new ModelRendererTurbo(this, 87, 319, textureX, textureY); // Import CO.
		bodyModel[32] = new ModelRendererTurbo(this, 69, 296, textureX, textureY); // Import CO.
		bodyModel[33] = new ModelRendererTurbo(this, 69, 296, textureX, textureY); // Import CO.
		bodyModel[34] = new ModelRendererTurbo(this, 193, 187, textureX, textureY); // Import CO.
		bodyModel[35] = new ModelRendererTurbo(this, 308, 187, textureX, textureY); // Import CO.
		bodyModel[36] = new ModelRendererTurbo(this, 223, 125, textureX, textureY); // Import CO.
		bodyModel[37] = new ModelRendererTurbo(this, 374, 125, textureX, textureY); // Import CO.
		bodyModel[38] = new ModelRendererTurbo(this, 370, 125, textureX, textureY); // Import CO.
		bodyModel[39] = new ModelRendererTurbo(this, 749, 514, textureX, textureY); // Import CO.
		bodyModel[40] = new ModelRendererTurbo(this, 460, 491, textureX, textureY); // Import CO.
		bodyModel[41] = new ModelRendererTurbo(this, 0, 481, textureX, textureY); // Import CO.
		bodyModel[42] = new ModelRendererTurbo(this, 575, 491, textureX, textureY); // Import CO.
		bodyModel[43] = new ModelRendererTurbo(this, 504, 491, textureX, textureY); // Import CO.
		bodyModel[44] = new ModelRendererTurbo(this, 630, 514, textureX, textureY); // Import CO.
		bodyModel[45] = new ModelRendererTurbo(this, 630, 491, textureX, textureY); // Import CO.
		bodyModel[46] = new ModelRendererTurbo(this, 749, 491, textureX, textureY); // Import CO.
		bodyModel[47] = new ModelRendererTurbo(this, 598, 491, textureX, textureY); // Import CO.
		bodyModel[48] = new ModelRendererTurbo(this, 370, 125, textureX, textureY); // Import CO.
		bodyModel[49] = new ModelRendererTurbo(this, 370, 125, textureX, textureY); // Import CO.
		bodyModel[50] = new ModelRendererTurbo(this, 112, 491, textureX, textureY); // Import CO.
		bodyModel[51] = new ModelRendererTurbo(this, 115, 187, textureX, textureY); // Import CO.
		bodyModel[52] = new ModelRendererTurbo(this, 305, 187, textureX, textureY); // Import CO.
		bodyModel[53] = new ModelRendererTurbo(this, 374, 491, textureX, textureY); // Import CO.
		bodyModel[54] = new ModelRendererTurbo(this, 0, 481, textureX, textureY); // Import CO.
		bodyModel[55] = new ModelRendererTurbo(this, 0, 481, textureX, textureY); // Import CO.
		bodyModel[56] = new ModelRendererTurbo(this, 0, 481, textureX, textureY); // Import CO.
		bodyModel[57] = new ModelRendererTurbo(this, 6, 480, textureX, textureY); // Import CO.
		bodyModel[58] = new ModelRendererTurbo(this, 16, 480, textureX, textureY); // Import CO.
		bodyModel[59] = new ModelRendererTurbo(this, 0, 404, textureX, textureY); // Import CO,
		bodyModel[60] = new ModelRendererTurbo(this, 0, 187, textureX, textureY); // Box 25
		bodyModel[61] = new ModelRendererTurbo(this, 282, 163, textureX, textureY); // Import CO.
		bodyModel[62] = new ModelRendererTurbo(this, 82, 125, textureX, textureY); // Import CO.
		bodyModel[63] = new ModelRendererTurbo(this, 82, 145, textureX, textureY); // Import CO.
		bodyModel[64] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import CO.
		bodyModel[65] = new ModelRendererTurbo(this, 333, 139, textureX, textureY); // Import CO.
		bodyModel[66] = new ModelRendererTurbo(this, 344, 125, textureX, textureY); // Import CO.
		bodyModel[67] = new ModelRendererTurbo(this, 283, 125, textureX, textureY); // Import CO.
		bodyModel[68] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Import CO.
		bodyModel[69] = new ModelRendererTurbo(this, 333, 139, textureX, textureY); // Import CO.
		bodyModel[70] = new ModelRendererTurbo(this, 333, 139, textureX, textureY); // Import CO.
		bodyModel[71] = new ModelRendererTurbo(this, 370, 125, textureX, textureY); // Import CO.
		bodyModel[72] = new ModelRendererTurbo(this, 282, 144, textureX, textureY); // Box 10
		bodyModel[73] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 11
		bodyModel[74] = new ModelRendererTurbo(this, 333, 139, textureX, textureY); // Box 12
		bodyModel[75] = new ModelRendererTurbo(this, 333, 139, textureX, textureY); // Box 13
		bodyModel[76] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 14
		bodyModel[77] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 15
		bodyModel[78] = new ModelRendererTurbo(this, 370, 125, textureX, textureY); // Box 34
		bodyModel[79] = new ModelRendererTurbo(this, 112, 491, textureX, textureY); // Box 35
		bodyModel[80] = new ModelRendererTurbo(this, 490, 125, textureX, textureY); // Box 4
		bodyModel[81] = new ModelRendererTurbo(this, 731, 274, textureX, textureY); // Box 5
		bodyModel[82] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Import CO.
		bodyModel[0].setRotationPoint(-54F, -10F, 19F);
		bodyModel[0].rotateAngleY = 0.41887902F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 15, 32, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import CO.
		bodyModel[1].setRotationPoint(-58F, -31F, 20F);
		bodyModel[1].rotateAngleY = 0F;
		bodyModel[1].rotateAngleZ = 0F;

		bodyModel[2].addBox(0F, 0F, 0F, 15, 32, 3, 0F); // Import CO.
		bodyModel[2].setRotationPoint(21F, -31F, -23F);
		bodyModel[2].rotateAngleY = 0.19198622F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // Import CO.
		bodyModel[3].setRotationPoint(-57F, -21F, 5F);
		bodyModel[3].rotateAngleZ = -0.06981317F;

		bodyModel[4].addBox(0F, 0F, 0F, 12, 3, 1, 0F); // Import CO.
		bodyModel[4].setRotationPoint(-40F, -29F, 22F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // Import CO.
		bodyModel[5].setRotationPoint(-57F, -21F, -17F);
		bodyModel[5].rotateAngleZ = -0.06981317F;

		bodyModel[6].addBox(0F, 0F, 0F, 30, 28, 12, 0F); // Import CO.
		bodyModel[6].setRotationPoint(-9F, -29F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 1, 12, 0F); // Import CO.
		bodyModel[7].setRotationPoint(-74F, -2F, -17F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 14, 37, 0F); // Import CO.
		bodyModel[8].setRotationPoint(-10F, -17F, -19F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Import CO.
		bodyModel[9].setRotationPoint(-9F, -29F, -19F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Import CO.
		bodyModel[10].setRotationPoint(-9F, -29F, 16F);

		bodyModel[11].addBox(0F, 0F, 0F, 12, 2, 37, 0F); // Import CO.
		bodyModel[11].setRotationPoint(-21F, -3F, -19F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 28, 1, 0F); // Import CO.
		bodyModel[12].setRotationPoint(-43F, -29F, 22F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 28, 1, 0F); // Import CO.
		bodyModel[13].setRotationPoint(18F, -29F, 22F);

		bodyModel[14].addBox(0F, 0F, 0F, 12, 13, 1, 0F); // Import CO.
		bodyModel[14].setRotationPoint(-40F, -14F, 22F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 13, 1, 0F); // Import CO.
		bodyModel[15].setRotationPoint(-40F, -14F, -23F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 28, 1, 0F); // Import CO.
		bodyModel[16].setRotationPoint(-43F, -29F, -23F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 3, 1, 0F); // Import CO.
		bodyModel[17].setRotationPoint(-40F, -29F, -23F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 28, 1, 0F); // Import CO.
		bodyModel[18].setRotationPoint(18F, -29F, -23F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 28, 1, 0F); // Import CO.
		bodyModel[19].setRotationPoint(-28F, -29F, 22F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 28, 1, 0F); // Import CO.
		bodyModel[20].setRotationPoint(-28F, -29F, -23F);

		bodyModel[21].addBox(0F, 0F, 0F, 15, 32, 3, 0F); // Import CO.
		bodyModel[21].setRotationPoint(20.5F, -31F, 20F);
		bodyModel[21].rotateAngleY = -0.20943951F;

		bodyModel[22].addBox(0F, 0F, 0F, 64, 2, 46, 0F); // Import CO.
		bodyModel[22].setRotationPoint(-43F, -1F, -23F);

		bodyModel[23].addBox(0F, 0F, 0F, 15, 32, 40, 0F); // Import CO.
		bodyModel[23].setRotationPoint(21F, -31F, -20F);

		bodyModel[24].addBox(0F, 0F, 0F, 12, 4, 27, 0F); // Import CO.
		bodyModel[24].setRotationPoint(37F, -39F, -14F);
		bodyModel[24].rotateAngleZ = -1.09955743F;

		bodyModel[25].addBox(0F, 0F, 0F, 28, 2, 14, 0F); // Import CO.
		bodyModel[25].setRotationPoint(-7F, -3F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 64, 2, 46, 0F); // Import CO.
		bodyModel[26].setRotationPoint(-43F, -31F, -23F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 26, 15, 0F); // Import CO.
		bodyModel[27].setRotationPoint(-56F, -27F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 31, 8, 24, 0F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import CO.
		bodyModel[28].setRotationPoint(-58F, -39F, -12F);

		bodyModel[29].addBox(0F, 0F, 0F, 28, 2, 14, 0F); // Import CO.
		bodyModel[29].setRotationPoint(-7F, -3F, -20F);

		bodyModel[30].addBox(0F, 0F, 0F, 16, 1, 14, 0F); // Import CO.
		bodyModel[30].setRotationPoint(-43F, -2F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 16, 1, 14, 0F); // Import CO.
		bodyModel[31].setRotationPoint(-43F, -2F, -18F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Import CO.
		bodyModel[32].setRotationPoint(-45F, -21F, 3F);
		bodyModel[32].rotateAngleZ = 0.06981317F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Import CO.
		bodyModel[33].setRotationPoint(-45F, -21F, -18F);
		bodyModel[33].rotateAngleZ = 0.06981317F;

		bodyModel[34].addBox(0F, 0F, 0F, 10, 26, 15, 0F); // Import CO.
		bodyModel[34].setRotationPoint(-56F, -27F, -20F);

		bodyModel[35].addBox(0F, 0F, 0F, 15, 4, 40, 0F); // Import CO.
		bodyModel[35].setRotationPoint(-58F, -31F, -20F);

		bodyModel[36].addBox(0F, 0F, 0F, 16, 1, 12, 0F); // Import CO.
		bodyModel[36].setRotationPoint(-74F, -2F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 8, 34, 0F); // Import CO.
		bodyModel[37].setRotationPoint(-77F, -14F, -17F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[38].setRotationPoint(-74F, -32F, -5.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 16, 11, 10, 0F); // Import CO.
		bodyModel[39].setRotationPoint(32F, -42F, -21F);
		bodyModel[39].rotateAngleY = -0.33161256F;

		bodyModel[40].addBox(0F, 0F, 0F, 6, 4, 14, 0F); // Import CO.
		bodyModel[40].setRotationPoint(7F, -53F, -7F);
		bodyModel[40].rotateAngleZ = -0.85521133F;

		bodyModel[41].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Import CO.
		bodyModel[41].setRotationPoint(-2F, -59F, -2F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import CO.
		bodyModel[42].setRotationPoint(14.5F, -54F, -2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 24, 10, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[43].setRotationPoint(7F, -49F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 47, 11, 10, 0F); // Import CO.
		bodyModel[44].setRotationPoint(-11F, -42F, -22F);

		bodyModel[45].addBox(0F, 0F, 0F, 47, 11, 10, 0F); // Import CO.
		bodyModel[45].setRotationPoint(-11F, -42F, 12F);

		bodyModel[46].addBox(0F, 0F, 0F, 16, 11, 10, 0F); // Import CO.
		bodyModel[46].setRotationPoint(36F, -42F, 12F);
		bodyModel[46].rotateAngleY = 0.33161256F;

		bodyModel[47].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Import CO.
		bodyModel[47].setRotationPoint(14F, -49F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[48].setRotationPoint(-76F, -26F, -0.5F);
		bodyModel[48].rotateAngleZ = 2.72271363F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[49].setRotationPoint(-74F, -32F, -0.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 64, 8, 24, 0F); // Import CO.
		bodyModel[50].setRotationPoint(-27F, -39F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 32, 3, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[51].setRotationPoint(-58F, -31F, -23F);

		bodyModel[52].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Import CO.
		bodyModel[52].setRotationPoint(-54F, -10F, -21F);
		bodyModel[52].rotateAngleY = -0.41887902F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 26, 14, 14, 0F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[53].setRotationPoint(-19F, -53F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Import CO.
		bodyModel[54].setRotationPoint(-2F, -59F, 1F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Import CO.
		bodyModel[55].setRotationPoint(1F, -59F, -2F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Import CO.
		bodyModel[56].setRotationPoint(1F, -59F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import CO.
		bodyModel[57].setRotationPoint(-1F, -59F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Import CO.
		bodyModel[58].setRotationPoint(-3F, -60F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 17, 32, 40, 0F, 0F, 0F, 0F, 0F, -7F, -12F, 0F, -7F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -12F, 0F, -5F, -12F, 0F, 0F, 0F); // Import CO,
		bodyModel[59].setRotationPoint(36F, -31F, -20F);

		bodyModel[60].addBox(0F, 0F, 0F, 15, 2, 40, 0F); // Box 25
		bodyModel[60].setRotationPoint(-58F, -1F, -20F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 1, 16, 0F); // Import CO.
		bodyModel[61].setRotationPoint(-66F, -31F, -8F);
		bodyModel[61].rotateAngleZ = 0.01745329F;

		bodyModel[62].addBox(0F, 0F, 0F, 19, 15, 2, 0F); // Import CO.
		bodyModel[62].setRotationPoint(-77F, -14F, -19F);
		bodyModel[62].rotateAngleY = -0.06981317F;

		bodyModel[63].addBox(0F, 0F, 0F, 20, 15, 2, 0F); // Import CO.
		bodyModel[63].setRotationPoint(-77.5F, -14F, 17F);
		bodyModel[63].rotateAngleY = 0.05235988F;

		bodyModel[64].addShapeBox(3F, 0F, 0F, 19, 2, 40, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import CO.
		bodyModel[64].setRotationPoint(-80F, -1F, -20F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[65].setRotationPoint(-76.87F, -13.5F, -19F);
		bodyModel[65].rotateAngleZ = 2.8099801F;

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Import CO.
		bodyModel[66].setRotationPoint(-75F, -28F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Import CO.
		bodyModel[67].setRotationPoint(-75F, -28F, -8F);
		bodyModel[67].rotateAngleZ = 0.4712389F;

		bodyModel[68].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import CO.
		bodyModel[68].setRotationPoint(-73F, -28F, -19F);
		bodyModel[68].rotateAngleY = -0.06981317F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Import CO.
		bodyModel[69].setRotationPoint(-72F, -27F, -19F);
		bodyModel[69].rotateAngleX = -0.01745329F;
		bodyModel[69].rotateAngleY = -0.06981317F;

		bodyModel[70].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Import CO.
		bodyModel[70].setRotationPoint(-79.87F, -12.5F, -0.5F);
		bodyModel[70].rotateAngleZ = 2.77507351F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO.
		bodyModel[71].setRotationPoint(-65F, -35F, -0.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[72].setRotationPoint(-71.5F, -29.8F, -8F);
		bodyModel[72].rotateAngleZ = 0.20943951F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 11
		bodyModel[73].setRotationPoint(-73F, -28F, -19F);
		bodyModel[73].rotateAngleY = 0.17453293F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[74].setRotationPoint(-76.87F, -13.5F, 18F);
		bodyModel[74].rotateAngleZ = 2.8099801F;

		bodyModel[75].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 13
		bodyModel[75].setRotationPoint(-72F, -27F, 18F);
		bodyModel[75].rotateAngleX = 0.01745329F;
		bodyModel[75].rotateAngleY = -0.06981317F;

		bodyModel[76].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 14
		bodyModel[76].setRotationPoint(-72.5F, -28F, 18F);
		bodyModel[76].rotateAngleY = 0.06981317F;

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 15
		bodyModel[77].setRotationPoint(-75F, -28F, 8F);
		bodyModel[77].rotateAngleY = -0.17453293F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 34
		bodyModel[78].setRotationPoint(-74F, -32F, 0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[79].setRotationPoint(-25F, -43F, -0.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 66, 226, 0F, 0F, -55F, -95.5F, 0F, -55F, -95.5F, 0F, -55F, -95.5F, 0F, -55F, -95.5F, 0F, 0F, -95.5F, 0F, 0F, -95.5F, 0F, 0F, -95.5F, 0F, 0F, -95.5F); // Box 4
		bodyModel[80].setRotationPoint(-104F, -62.5F, -113F);
		bodyModel[80].rotateAngleZ = 0.48869219F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 82, 7, 56, 0F, 0F, 0F, -24F, -65F, -5F, -24F, -65F, -5F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, -65F, 0F, -24F, -65F, 0F, -24F, 0F, 0F, -24F); // Box 5
		bodyModel[81].setRotationPoint(-76F, -7F, -28F);

		bodyModel[82].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 0
		bodyModel[82].setRotationPoint(-72F, -25.5F, -19F);
		bodyModel[82].rotateAngleY = -0.06981317F;

		bodyModel[83].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 1
		bodyModel[83].setRotationPoint(-71.5F, -25.5F, 18F);
		bodyModel[83].rotateAngleY = 0.06981317F;


		noseModel = new ModelRendererTurbo[16];
		noseModel[0] = new ModelRendererTurbo(this, 440, 77, textureX, textureY); // Import NO.
		noseModel[1] = new ModelRendererTurbo(this, 420, 85, textureX, textureY); // Import NO.
		noseModel[2] = new ModelRendererTurbo(this, 316, 77, textureX, textureY); // Import NO.
		noseModel[3] = new ModelRendererTurbo(this, 0, 77, textureX, textureY); // Import NO.
		noseModel[4] = new ModelRendererTurbo(this, 277, 77, textureX, textureY); // Box 0
		noseModel[5] = new ModelRendererTurbo(this, 370, 77, textureX, textureY); // Box 1
		noseModel[6] = new ModelRendererTurbo(this, 46, 77, textureX, textureY); // Box 2
		noseModel[7] = new ModelRendererTurbo(this, 159, 77, textureX, textureY); // Box 3
		noseModel[8] = new ModelRendererTurbo(this, 90, 77, textureX, textureY); // Box 4
		noseModel[9] = new ModelRendererTurbo(this, 201, 77, textureX, textureY); // Box 5
		noseModel[10] = new ModelRendererTurbo(this, 125, 77, textureX, textureY); // Box 6
		noseModel[11] = new ModelRendererTurbo(this, 239, 77, textureX, textureY); // Box 17
		noseModel[12] = new ModelRendererTurbo(this, 440, 77, textureX, textureY); // Box 26
		noseModel[13] = new ModelRendererTurbo(this, 420, 77, textureX, textureY); // Box 27
		noseModel[14] = new ModelRendererTurbo(this, 440, 94, textureX, textureY); // Box 2
		noseModel[15] = new ModelRendererTurbo(this, 417, 94, textureX, textureY); // Box 3

		noseModel[0].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import NO.
		noseModel[0].setRotationPoint(-90F, -13F, 11F);

		noseModel[1].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Import NO.
		noseModel[1].setRotationPoint(-92F, -9F, 8F);
		noseModel[1].rotateAngleY = 0.95993109F;

		noseModel[2].addBox(0F, 0F, 0F, 12, 6, 12, 0F); // Import NO.
		noseModel[2].setRotationPoint(-88F, -7F, -6F);

		noseModel[3].addBox(0F, 0F, 0F, 2, 8, 38, 0F); // Import NO.
		noseModel[3].setRotationPoint(-79F, -14F, -19F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 0
		noseModel[4].setRotationPoint(-94F, -6F, -6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1
		noseModel[5].setRotationPoint(-88F, -1F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 8, 8, 22, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		noseModel[6].setRotationPoint(-87F, -14F, -11F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		noseModel[7].setRotationPoint(-94F, -12F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		noseModel[8].setRotationPoint(-87F, -14F, -19F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 7, 6, 10, 0F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		noseModel[9].setRotationPoint(-94F, -12F, -16F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		noseModel[10].setRotationPoint(-87F, -14F, 11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 6, 10, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 17
		noseModel[11].setRotationPoint(-94F, -12F, 6F);

		noseModel[12].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 26
		noseModel[12].setRotationPoint(-90F, -13F, -12F);

		noseModel[13].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 27
		noseModel[13].setRotationPoint(-95F, -9F, -9F);
		noseModel[13].rotateAngleY = -0.95993109F;

		noseModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		noseModel[14].setRotationPoint(-91F, -1F, -3F);

		noseModel[15].addBox(0F, 0F, 0F, 4, 3, 6, 0F); // Box 3
		noseModel[15].setRotationPoint(-91F, -4F, -3F);


		tailModel = new ModelRendererTurbo[11];
		tailModel[0] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import TA.
		tailModel[1] = new ModelRendererTurbo(this, 292, 400, textureX, textureY); // Import TA.
		tailModel[2] = new ModelRendererTurbo(this, 292, 420, textureX, textureY); // Import TA.
		tailModel[3] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import TA.
		tailModel[4] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import TA.
		tailModel[5] = new ModelRendererTurbo(this, 420, 400, textureX, textureY); // Import TA,
		tailModel[6] = new ModelRendererTurbo(this, 119, 400, textureX, textureY); // Import TA,
		tailModel[7] = new ModelRendererTurbo(this, 447, 400, textureX, textureY); // Import TA,
		tailModel[8] = new ModelRendererTurbo(this, 461, 400, textureX, textureY); // Import TA,
		tailModel[9] = new ModelRendererTurbo(this, 253, 400, textureX, textureY); // Import TA,
		tailModel[10] = new ModelRendererTurbo(this, 119, 441, textureX, textureY); // Box 28

		tailModel[0].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Import TA.
		tailModel[0].setRotationPoint(62F, -7F, -0.5F);

		tailModel[1].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Import TA.
		tailModel[1].setRotationPoint(60F, -17F, 5F);
		tailModel[1].rotateAngleY = 0.2443461F;

		tailModel[2].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Import TA.
		tailModel[2].setRotationPoint(60F, -16F, -6F);
		tailModel[2].rotateAngleY = -0.40142573F;

		tailModel[3].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Import TA.
		tailModel[3].setRotationPoint(92F, -13F, -0.5F);

		tailModel[4].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Import TA.
		tailModel[4].setRotationPoint(61F, -4F, -1F);

		tailModel[5].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import TA,
		tailModel[5].setRotationPoint(131F, -26F, -0.5F);
		tailModel[5].rotateAngleZ = -0.08726646F;

		tailModel[6].addShapeBox(0F, 0F, 0F, 49, 22, 16, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, -10F, -3F, 0F, 0F, 0F); // Import TA,
		tailModel[6].setRotationPoint(53F, -26F, -8F);

		tailModel[7].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Import TA,
		tailModel[7].setRotationPoint(139F, -53F, -4F);
		tailModel[7].rotateAngleZ = -0.01745329F;

		tailModel[8].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import TA,
		tailModel[8].setRotationPoint(140.5F, -51.5F, -3F);
		tailModel[8].rotateAngleZ = -0.01745329F;

		tailModel[9].addShapeBox(0F, 0F, 0F, 17, 26, 1, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Import TA,
		tailModel[9].setRotationPoint(125F, -52F, -0.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 34, 14, 10, 0F, 0F, -2F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -12F, -4.5F, -1F, -12F, -4.5F, 0F, 0F, 0F); // Box 28
		tailModel[10].setRotationPoint(102F, -28F, -5F);


		bayModel = new ModelRendererTurbo[26];
		bayModel[0] = new ModelRendererTurbo(this, 149, 532, textureX, textureY); // Import CO.
		bayModel[1] = new ModelRendererTurbo(this, 0, 532, textureX, textureY); // Import CO.
		bayModel[2] = new ModelRendererTurbo(this, 83, 532, textureX, textureY); // Import CO.
		bayModel[3] = new ModelRendererTurbo(this, 94, 532, textureX, textureY); // Import CO.
		bayModel[4] = new ModelRendererTurbo(this, 117, 532, textureX, textureY); // Import CO.
		bayModel[5] = new ModelRendererTurbo(this, 83, 532, textureX, textureY); // Import CO.
		bayModel[6] = new ModelRendererTurbo(this, 94, 532, textureX, textureY); // Import CO.
		bayModel[7] = new ModelRendererTurbo(this, 117, 532, textureX, textureY); // Import CO.
		bayModel[8] = new ModelRendererTurbo(this, 149, 532, textureX, textureY); // Import CO.
		bayModel[9] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[10] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[11] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[12] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[13] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[14] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[15] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[16] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[17] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[18] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[19] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[20] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[21] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[22] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[23] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[24] = new ModelRendererTurbo(this, 0, 559, textureX, textureY); // Import BA.
		bayModel[25] = new ModelRendererTurbo(this, 0, 532, textureX, textureY); // Box 33

		bayModel[0].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Import CO.
		bayModel[0].setRotationPoint(1.5F, -13F, 34F);

		bayModel[1].addBox(0F, 0F, 0F, 29, 10, 10, 0F); // Import CO.
		bayModel[1].setRotationPoint(-7F, -4F, 23F);

		bayModel[2].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Import CO.
		bayModel[2].setRotationPoint(2F, -13F, 25F);

		bayModel[3].addBox(0F, 0F, 0F, 8, 5, 2, 0F); // Import CO.
		bayModel[3].setRotationPoint(-1F, -15F, 23F);

		bayModel[4].addBox(0F, 0F, 0F, 5, 5, 9, 0F); // Import CO.
		bayModel[4].setRotationPoint(0.5F, -14F, 25F);

		bayModel[5].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Import CO.
		bayModel[5].setRotationPoint(2F, -13F, -28F);

		bayModel[6].addBox(0F, 0F, 0F, 8, 5, 2, 0F); // Import CO.
		bayModel[6].setRotationPoint(-1F, -15F, -26F);

		bayModel[7].addBox(0F, 0F, 0F, 5, 5, 9, 0F); // Import CO.
		bayModel[7].setRotationPoint(0.5F, -14F, -35F);

		bayModel[8].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Import CO.
		bayModel[8].setRotationPoint(1.5F, -13F, -45F);

		bayModel[9].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import BA.
		bayModel[9].setRotationPoint(-57F, 6F, 27F);
		bayModel[9].rotateAngleZ = -0.27925268F;

		bayModel[10].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Import BA.
		bayModel[10].setRotationPoint(19F, 8F, -29F);
		bayModel[10].rotateAngleZ = 0.26179939F;

		bayModel[11].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Import BA.
		bayModel[11].setRotationPoint(19F, 8F, 27F);
		bayModel[11].rotateAngleZ = 0.26179939F;

		bayModel[12].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import BA.
		bayModel[12].setRotationPoint(-50F, 5F, 27F);

		bayModel[13].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import BA.
		bayModel[13].setRotationPoint(-57F, 6F, -29F);
		bayModel[13].rotateAngleZ = -0.27925268F;

		bayModel[14].addBox(0F, 0F, 0F, 70, 2, 2, 0F); // Import BA.
		bayModel[14].setRotationPoint(-50F, 8F, 27F);

		bayModel[15].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Import BA.
		bayModel[15].setRotationPoint(14F, 0F, 21F);
		bayModel[15].rotateAngleX = 0.59341195F;

		bayModel[16].addBox(0F, 0F, 0F, 70, 2, 2, 0F); // Import BA.
		bayModel[16].setRotationPoint(-50F, 8F, -29F);

		bayModel[17].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Import BA.
		bayModel[17].setRotationPoint(-60F, 4F, -29F);
		bayModel[17].rotateAngleZ = -0.54105207F;

		bayModel[18].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import BA.
		bayModel[18].setRotationPoint(-50F, 5F, -28F);

		bayModel[19].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Import BA.
		bayModel[19].setRotationPoint(14F, -1F, -23F);
		bayModel[19].rotateAngleX = -0.59341195F;

		bayModel[20].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Import BA.
		bayModel[20].setRotationPoint(-60F, 4F, 27F);
		bayModel[20].rotateAngleZ = -0.54105207F;

		bayModel[21].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import BA.
		bayModel[21].setRotationPoint(-60F, 4F, 27F);

		bayModel[22].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import BA.
		bayModel[22].setRotationPoint(-60F, 4F, -28F);

		bayModel[23].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Import BA.
		bayModel[23].setRotationPoint(-45F, -1F, -23F);
		bayModel[23].rotateAngleX = -0.59341195F;

		bayModel[24].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Import BA.
		bayModel[24].setRotationPoint(-45F, 0F, 21F);
		bayModel[24].rotateAngleX = 0.59341195F;

		bayModel[25].addBox(0F, 0F, 0F, 29, 10, 10, 0F); // Box 33
		bayModel[25].setRotationPoint(-7F, -4F, -33F);


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 172, 145, textureX, textureY); // Import CO.
		yawFlapModel[1] = new ModelRendererTurbo(this, 172, 145, textureX, textureY); // Import CO.

		yawFlapModel[0].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import CO.
		yawFlapModel[0].setRotationPoint(-77F, -1F, 11F);
		yawFlapModel[0].rotateAngleZ = 0.64577182F;

		yawFlapModel[1].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import CO.
		yawFlapModel[1].setRotationPoint(-77F, -1F, -11F);
		yawFlapModel[1].rotateAngleZ = 0.64577182F;


		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 312, 420, textureX, textureY); // Import TA,
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 371, 420, textureX, textureY); // Box 29

		pitchFlapLeftModel[0].addBox(0F, 0F, 0F, 10, 1, 17, 0F); // Import TA,
		pitchFlapLeftModel[0].setRotationPoint(100F, -23F, 1F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 29
		pitchFlapLeftModel[1].setRotationPoint(100F, -23F, 18F);


		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 312, 400, textureX, textureY); // Box 18
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 371, 400, textureX, textureY); // Box 31

		pitchFlapRightModel[0].addBox(0F, 0F, 0F, 10, 1, 15, 0F); // Box 18
		pitchFlapRightModel[0].setRotationPoint(100F, -23F, -18F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		pitchFlapRightModel[1].setRotationPoint(100F, -23F, -28F);


		bodyDoorOpenModel = new ModelRendererTurbo[10];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 183, 364, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 196, 364, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 210, 364, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 210, 381, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 91, 381, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 196, 381, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 183, 381, textureX, textureY); // Import CODO.
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 91, 364, textureX, textureY); // Import CODO.

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 43, 13, 1, 0F); // Import CODO.
		bodyDoorOpenModel[0].setRotationPoint(10F, -14F, -26F);
		bodyDoorOpenModel[0].rotateAngleY = 0.17453293F;

		bodyDoorOpenModel[1].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODO.
		bodyDoorOpenModel[1].setRotationPoint(10F, -25F, -26F);
		bodyDoorOpenModel[1].rotateAngleY = 0.17453293F;

		bodyDoorOpenModel[2].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODO.
		bodyDoorOpenModel[2].setRotationPoint(29F, -25F, -23F);
		bodyDoorOpenModel[2].rotateAngleY = 0.2443461F;

		bodyDoorOpenModel[3].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODO.
		bodyDoorOpenModel[3].setRotationPoint(48F, -25F, -19F);
		bodyDoorOpenModel[3].rotateAngleY = 0.15707963F;

		bodyDoorOpenModel[4].addBox(0F, 0F, 0F, 43, 13, 1, 0F); // Import CODO.
		bodyDoorOpenModel[4].setRotationPoint(10F, -14F, 24F);
		bodyDoorOpenModel[4].rotateAngleY = -0.17453293F;

		bodyDoorOpenModel[5].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODO.
		bodyDoorOpenModel[5].setRotationPoint(48F, -25F, 17F);
		bodyDoorOpenModel[5].rotateAngleY = -0.13962634F;

		bodyDoorOpenModel[6].addBox(0F, 0F, 0F, 43, 4, 1, 0F); // Import CODO.
		bodyDoorOpenModel[6].setRotationPoint(10F, -29F, 24F);
		bodyDoorOpenModel[6].rotateAngleY = -0.17453293F;

		bodyDoorOpenModel[7].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODO.
		bodyDoorOpenModel[7].setRotationPoint(29F, -25F, 21F);
		bodyDoorOpenModel[7].rotateAngleY = -0.17453293F;

		bodyDoorOpenModel[8].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODO.
		bodyDoorOpenModel[8].setRotationPoint(10F, -25F, 24F);
		bodyDoorOpenModel[8].rotateAngleY = -0.17453293F;

		bodyDoorOpenModel[9].addBox(0F, 0F, 0F, 43, 4, 1, 0F); // Import CODO.
		bodyDoorOpenModel[9].setRotationPoint(10F, -29F, -26F);
		bodyDoorOpenModel[9].rotateAngleY = 0.17453293F;


		bodyDoorCloseModel = new ModelRendererTurbo[10];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 183, 364, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 91, 364, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 210, 364, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 183, 381, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 91, 381, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 210, 381, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 196, 381, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 196, 364, textureX, textureY); // Import CODC.
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Import CODC.

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODC.
		bodyDoorCloseModel[0].setRotationPoint(-25F, -25F, -23.5F);

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 43, 13, 1, 0F); // Import CODC.
		bodyDoorCloseModel[1].setRotationPoint(-25F, -14F, 22.5F);

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 43, 4, 1, 0F); // Import CODC.
		bodyDoorCloseModel[2].setRotationPoint(-25F, -29F, -23.5F);

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODC.
		bodyDoorCloseModel[3].setRotationPoint(14F, -25F, -23.5F);

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODC.
		bodyDoorCloseModel[4].setRotationPoint(-25F, -25F, 22.5F);

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 43, 4, 1, 0F); // Import CODC.
		bodyDoorCloseModel[5].setRotationPoint(-25F, -29F, 22.5F);

		bodyDoorCloseModel[6].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODC.
		bodyDoorCloseModel[6].setRotationPoint(14F, -25F, 22.5F);
		bodyDoorCloseModel[6].rotateAngleY = 0.03490659F;

		bodyDoorCloseModel[7].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODC.
		bodyDoorCloseModel[7].setRotationPoint(-6F, -25F, 22.5F);

		bodyDoorCloseModel[8].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Import CODC.
		bodyDoorCloseModel[8].setRotationPoint(-5F, -25F, -23.5F);

		bodyDoorCloseModel[9].addBox(0F, 0F, 0F, 43, 13, 1, 0F); // Import CODC.
		bodyDoorCloseModel[9].setRotationPoint(-25F, -14F, -23.5F);





		heliMainRotorModels = new ModelRendererTurbo[1][3];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 16, 480, textureX, textureY); // Box 163
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 16, 480, textureX, textureY); // Box 164
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 16, 480, textureX, textureY); // Box 165

		heliMainRotorModels[0][0].addShapeBox(-3F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 88F, 0F, 0F, 88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 88F, 0F, 0F, 88F); // Box 163
		heliMainRotorModels[0][0].setRotationPoint(0F, -57F, 0F);

		heliMainRotorModels[0][1].addShapeBox(-3F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 88F, 0F, 0F, 88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 88F, 0F, 0F, 88F); // Box 164
		heliMainRotorModels[0][1].setRotationPoint(0F, -57F, 0F);
		heliMainRotorModels[0][1].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][2].addShapeBox(-3F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 88F, 0F, 0F, 88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 88F, 0F, 0F, 88F); // Box 165
		heliMainRotorModels[0][2].setRotationPoint(0F, -57F, 0F);
		heliMainRotorModels[0][2].rotateAngleY = -3.14159265F;

		heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F / 16F, 0F / 16F, 0F / 16F) };

		heliRotorSpeeds = new float[] { 100F };
		
		
		heliTailRotorModels = new ModelRendererTurbo[1][4];
		heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 447, 400, textureX, textureY); // Box 167
		heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 447, 400, textureX, textureY); // Box 168
		heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 447, 400, textureX, textureY); // Box 169
		heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 447, 400, textureX, textureY); // Box 170

		heliTailRotorModels[0][0].addShapeBox(-1F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 167
		heliTailRotorModels[0][0].setRotationPoint(141F, -51F, -3F);

		heliTailRotorModels[0][1].addShapeBox(-1F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 168
		heliTailRotorModels[0][1].setRotationPoint(141F, -51F, -3F);
		heliTailRotorModels[0][1].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][2].addShapeBox(-1F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 169
		heliTailRotorModels[0][2].setRotationPoint(141F, -51F, -3F);
		heliTailRotorModels[0][2].rotateAngleZ = 3.14159265F;

		heliTailRotorModels[0][3].addShapeBox(-1F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 170
		heliTailRotorModels[0][3].setRotationPoint(141F, -51F, -3F);
		heliTailRotorModels[0][3].rotateAngleZ = -1.57079633F;
		
		heliTailRotorOrigins = new Vector3f[] { new Vector3f(141F / 16F, 51F / 16F, -3F / 16F) }; 


		
		translateAll(0F, 0F, 0F);


		flipAll();
	}
}