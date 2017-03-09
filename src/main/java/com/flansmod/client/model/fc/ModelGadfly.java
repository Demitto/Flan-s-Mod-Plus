//This File was created with the Minecraft-SMP Modelling Toolbox
// Copyright (C) 2012 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 1.4.6

// Model Checklist
//    Model: 
//    - Hitbox              [ ]
//    - Check Left/Right    [ ]  Left = + / Right = -
//    - Code Cleaned        [ ]  
//    - Coverted to Version [1.4.6]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGadfly extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;
	
	
	boolean VarGear = true;
	boolean VarDoor = true;
	boolean VarWing = true;
	
	public ModelGadfly()	
	{


		bodyModel = new ModelRendererTurbo[99];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 58, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 75, textureX, textureY); // Import Shape1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 114, textureX, textureY); // Import Shape1
		bodyModel[3] = new ModelRendererTurbo(this, 0, 131, textureX, textureY); // Import Shape1
		bodyModel[4] = new ModelRendererTurbo(this, 0, 155, textureX, textureY); // Import Shape1
		bodyModel[5] = new ModelRendererTurbo(this, 0, 161, textureX, textureY); // Import Shape1
		bodyModel[6] = new ModelRendererTurbo(this, 8, 161, textureX, textureY); // Import Shape1
		bodyModel[7] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Import Shape1
		bodyModel[8] = new ModelRendererTurbo(this, 0, 166, textureX, textureY); // Import Shape1
		bodyModel[9] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import Shape1
		bodyModel[10] = new ModelRendererTurbo(this, 0, 231, textureX, textureY); // Import Shape1
		bodyModel[11] = new ModelRendererTurbo(this, 0, 267, textureX, textureY); // Import Shape1
		bodyModel[12] = new ModelRendererTurbo(this, 0, 272, textureX, textureY); // Import Shape1
		bodyModel[13] = new ModelRendererTurbo(this, 0, 278, textureX, textureY); // Import Shape1
		bodyModel[14] = new ModelRendererTurbo(this, 0, 296, textureX, textureY); // Import Shape1
		bodyModel[15] = new ModelRendererTurbo(this, 0, 347, textureX, textureY); // Import Shape1
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Shape1
		bodyModel[17] = new ModelRendererTurbo(this, 0, 356, textureX, textureY); // Import Shape1
		bodyModel[18] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Import Shape1
		bodyModel[19] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Import Shape1
		bodyModel[20] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Import Shape1
		bodyModel[21] = new ModelRendererTurbo(this, 0, 397, textureX, textureY); // Import Shape1
		bodyModel[22] = new ModelRendererTurbo(this, 0, 417, textureX, textureY); // Import Shape1
		bodyModel[23] = new ModelRendererTurbo(this, 0, 437, textureX, textureY); // Import Shape1
		bodyModel[24] = new ModelRendererTurbo(this, 33, 76, textureX, textureY); // Import Shape1
		bodyModel[25] = new ModelRendererTurbo(this, 50, 100, textureX, textureY); // Import Shape2
		bodyModel[26] = new ModelRendererTurbo(this, 50, 109, textureX, textureY); // Import Shape2
		bodyModel[27] = new ModelRendererTurbo(this, 50, 113, textureX, textureY); // Import Shape2
		bodyModel[28] = new ModelRendererTurbo(this, 50, 117, textureX, textureY); // Import Shape2
		bodyModel[29] = new ModelRendererTurbo(this, 50, 120, textureX, textureY); // Import Shape2
		bodyModel[30] = new ModelRendererTurbo(this, 50, 124, textureX, textureY); // Import Shape2
		bodyModel[31] = new ModelRendererTurbo(this, 58, 124, textureX, textureY); // Import Shape2
		bodyModel[32] = new ModelRendererTurbo(this, 38, 123, textureX, textureY); // Import Shape2
		bodyModel[33] = new ModelRendererTurbo(this, 68, 125, textureX, textureY); // Import Shape2
		bodyModel[34] = new ModelRendererTurbo(this, 50, 140, textureX, textureY); // Import Shape2
		bodyModel[35] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[36] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[37] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[38] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[39] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[40] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[41] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Import Shape2
		bodyModel[42] = new ModelRendererTurbo(this, 50, 160, textureX, textureY); // Import Shape2
		bodyModel[43] = new ModelRendererTurbo(this, 50, 230, textureX, textureY); // Import Shape2
		bodyModel[44] = new ModelRendererTurbo(this, 50, 240, textureX, textureY); // Import Shape1
		bodyModel[45] = new ModelRendererTurbo(this, 50, 240, textureX, textureY); // Import Shape1
		bodyModel[46] = new ModelRendererTurbo(this, 50, 254, textureX, textureY); // Import Shape1
		bodyModel[47] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import Shape1
		bodyModel[48] = new ModelRendererTurbo(this, 50, 309, textureX, textureY); // Import Shape1
		bodyModel[49] = new ModelRendererTurbo(this, 78, 353, textureX, textureY); // Import Shape1
		bodyModel[50] = new ModelRendererTurbo(this, 60, 439, textureX, textureY); // Import Shape1
		bodyModel[51] = new ModelRendererTurbo(this, 103, 420, textureX, textureY); // Import Shape1
		bodyModel[52] = new ModelRendererTurbo(this, 60, 439, textureX, textureY); // Import Shape1
		bodyModel[53] = new ModelRendererTurbo(this, 103, 453, textureX, textureY); // Import Shape1
		bodyModel[54] = new ModelRendererTurbo(this, 103, 420, textureX, textureY); // Import Shape1
		bodyModel[55] = new ModelRendererTurbo(this, 103, 453, textureX, textureY); // Import Shape1
		bodyModel[56] = new ModelRendererTurbo(this, 100, 477, textureX, textureY); // Import Shape1
		bodyModel[57] = new ModelRendererTurbo(this, 103, 420, textureX, textureY); // Import Shape1
		bodyModel[58] = new ModelRendererTurbo(this, 103, 453, textureX, textureY); // Import Shape1
		bodyModel[59] = new ModelRendererTurbo(this, 150, 0, textureX, textureY); // Import Shape1
		bodyModel[60] = new ModelRendererTurbo(this, 103, 420, textureX, textureY); // Import Shape1
		bodyModel[61] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Shape1
		bodyModel[62] = new ModelRendererTurbo(this, 100, 477, textureX, textureY); // Import Shape1
		bodyModel[63] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Shape1
		bodyModel[64] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Shape1
		bodyModel[65] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Shape1
		bodyModel[66] = new ModelRendererTurbo(this, 100, 477, textureX, textureY); // Import Shape1
		bodyModel[67] = new ModelRendererTurbo(this, 100, 477, textureX, textureY); // Import Shape1
		bodyModel[68] = new ModelRendererTurbo(this, 103, 453, textureX, textureY); // Import Shape1
		bodyModel[69] = new ModelRendererTurbo(this, 150, 0, textureX, textureY); // Import Shape1
		bodyModel[70] = new ModelRendererTurbo(this, 150, 25, textureX, textureY); // Import Shape1
		bodyModel[71] = new ModelRendererTurbo(this, 150, 33, textureX, textureY); // Import Shape1
		bodyModel[72] = new ModelRendererTurbo(this, 150, 50, textureX, textureY); // Import Shape1
		bodyModel[73] = new ModelRendererTurbo(this, 150, 25, textureX, textureY); // Import Shape1
		bodyModel[74] = new ModelRendererTurbo(this, 150, 67, textureX, textureY); // Import Shape1-
		bodyModel[75] = new ModelRendererTurbo(this, 150, 105, textureX, textureY); // Import Shape1
		bodyModel[76] = new ModelRendererTurbo(this, 150, 105, textureX, textureY); // Import Shape1
		bodyModel[77] = new ModelRendererTurbo(this, 150, 120, textureX, textureY); // Import Shape1
		bodyModel[78] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Import Shape1
		bodyModel[79] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Import Shape1
		bodyModel[80] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Import Shape1
		bodyModel[81] = new ModelRendererTurbo(this, 150, 120, textureX, textureY); // Import Shape1
		bodyModel[82] = new ModelRendererTurbo(this, 150, 200, textureX, textureY); // Import Shape1
		bodyModel[83] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Shape1
		bodyModel[84] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Import Shape1
		bodyModel[85] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Shape1
		bodyModel[86] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Import Shape1
		bodyModel[87] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import Shape1
		bodyModel[88] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import Shape1
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Shape1
		bodyModel[90] = new ModelRendererTurbo(this, 251, 350, textureX, textureY); // Import Shape1
		bodyModel[91] = new ModelRendererTurbo(this, 251, 350, textureX, textureY); // Import Shape1
		bodyModel[92] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Import Shape1
		bodyModel[93] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Import Shape1
		bodyModel[94] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Import Shape1
		bodyModel[95] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Import Shape1
		bodyModel[96] = new ModelRendererTurbo(this, 0, 356, textureX, textureY); // Import Shape1
		bodyModel[97] = new ModelRendererTurbo(this, 0, 351, textureX, textureY); // Import Shape1
		bodyModel[98] = new ModelRendererTurbo(this, 250, 331, textureX, textureY); // Import Shape1

		bodyModel[0].addBox(0F, 0F, 0F, 16, 3, 12, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(-24F, 2F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 25, 12, 0F); // Import Shape1
		bodyModel[1].setRotationPoint(-11F, -23F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 5, 10, 0F); // Import Shape1
		bodyModel[2].setRotationPoint(-11.5F, -22F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 14, 8, 0F); // Import Shape1
		bodyModel[3].setRotationPoint(-11.5F, -16F, -4F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Import Shape1
		bodyModel[4].setRotationPoint(-19F, -6F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Import Shape1
		bodyModel[5].setRotationPoint(-21F, -6F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Shape1
		bodyModel[6].setRotationPoint(-21F, -5F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Shape1
		bodyModel[7].setRotationPoint(-22F, -6F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 14, 2, 10, 0F); // Import Shape1
		bodyModel[8].setRotationPoint(-23F, 1.5F, -5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 41, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Shape1
		bodyModel[9].setRotationPoint(-49F, 5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Shape1
		bodyModel[10].setRotationPoint(-40F, -2F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import Shape1
		bodyModel[11].setRotationPoint(-37F, -2F, -1F);
		bodyModel[11].rotateAngleZ = 0.59341195F;

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Import Shape1
		bodyModel[12].setRotationPoint(-32F, -7F, -1F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 6, 10, 0F); // Import Shape1
		bodyModel[13].setRotationPoint(-39.9F, -8F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 31, 18, 0F); // Import Shape1
		bodyModel[14].setRotationPoint(-8F, -24F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Import Shape1
		bodyModel[15].setRotationPoint(-49F, -3.9F, -8.9F);
		bodyModel[15].rotateAngleZ = 0.76794487F;

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 17, 0F); // Import Shape1
		bodyModel[16].setRotationPoint(-34.7F, -17.6F, -8.9F);
		bodyModel[16].rotateAngleZ = 0.3490658F;

		bodyModel[17].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // Import Shape1
		bodyModel[17].setRotationPoint(-15.9F, -24.4F, -8.1F);
		bodyModel[17].rotateAngleZ = -0.05235988F;

		bodyModel[18].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Import Shape1
		bodyModel[18].setRotationPoint(-49F, -3.9F, 7.9F);
		bodyModel[18].rotateAngleZ = 0.7679449F;

		bodyModel[19].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Import Shape1
		bodyModel[19].setRotationPoint(-34.7F, -17.6F, 7.9F);
		bodyModel[19].rotateAngleZ = 0.3490658F;

		bodyModel[20].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Import Shape1
		bodyModel[20].setRotationPoint(-15.9F, -24.4F, -8.9F);
		bodyModel[20].rotateAngleZ = -0.05235988F;

		bodyModel[21].addBox(0F, 0F, 0F, 20, 0, 18, 0F); // Import Shape1
		bodyModel[21].setRotationPoint(-34.7F, -17.7F, -9F);
		bodyModel[21].rotateAngleZ = 0.34906585F;

		bodyModel[22].addBox(0F, 0F, 0F, 20, 0, 18, 0F); // Import Shape1
		bodyModel[22].setRotationPoint(-49F, -4F, -9F);
		bodyModel[22].rotateAngleZ = 0.76794487F;

		bodyModel[23].addBox(0F, 0F, 0F, 9, 9, 18, 0F); // Import Shape1
		bodyModel[23].setRotationPoint(-49F, -4F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 29, 10, 12, 0F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 5F, 3F); // Import Shape1
		bodyModel[24].setRotationPoint(36F, -24F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 18, 4, 4, 0F); // Import Shape2
		bodyModel[25].setRotationPoint(-5F, -1F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Shape2
		bodyModel[26].setRotationPoint(12F, 0F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Shape2
		bodyModel[27].setRotationPoint(12F, 0F, 2F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Import Shape2
		bodyModel[28].setRotationPoint(12F, 3F, -1F);

		bodyModel[29].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Import Shape2
		bodyModel[29].setRotationPoint(12F, -2F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Import Shape2
		bodyModel[30].setRotationPoint(18F, -9F, -9F);
		bodyModel[30].rotateAngleX = 0.541052F;

		bodyModel[31].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Import Shape2
		bodyModel[31].setRotationPoint(19.9F, -9F, 9F);
		bodyModel[31].rotateAngleX = 0.541052F;
		bodyModel[31].rotateAngleY = 3.141593F;

		bodyModel[32].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Import Shape2
		bodyModel[32].setRotationPoint(12F, -9F, -9F);
		bodyModel[32].rotateAngleX = 0.541052F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Import Shape2
		bodyModel[33].setRotationPoint(14F, -9F, 9F);
		bodyModel[33].rotateAngleX = 0.541052F;
		bodyModel[33].rotateAngleY = 3.141593F;

		bodyModel[34].addBox(0F, 0F, 0F, 14, 3, 4, 0F); // Import Shape2
		bodyModel[34].setRotationPoint(25F, 1F, -2F);
		bodyModel[34].rotateAngleZ = 0.9773844F;

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[35].setRotationPoint(21F, 2F, -4F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[36].setRotationPoint(21F, -1F, -4F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[37].setRotationPoint(21F, -1F, -4F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[38].setRotationPoint(23F, -1F, -4F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[39].setRotationPoint(25F, -1F, -4F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[40].setRotationPoint(25F, 2F, -4F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Shape2
		bodyModel[41].setRotationPoint(23F, 2F, -4F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 6, 6, 0F); // Import Shape2
		bodyModel[42].setRotationPoint(20F, -2F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Import Shape2
		bodyModel[43].setRotationPoint(22F, -2F, -2F);
		bodyModel[43].rotateAngleZ = 1.291544F;

		bodyModel[44].addBox(0F, 0F, 0F, 20, 4, 7, 0F); // Import Shape1
		bodyModel[44].setRotationPoint(-5F, -27F, -8F);
		bodyModel[44].rotateAngleZ = -0.2792527F;

		bodyModel[45].addBox(0F, 0F, 0F, 20, 4, 7, 0F); // Import Shape1
		bodyModel[45].setRotationPoint(-5F, -27F, 1F);
		bodyModel[45].rotateAngleZ = -0.2792527F;

		bodyModel[46].addBox(0F, 0F, 0F, 20, 6, 36, 0F); // Import Shape1
		bodyModel[46].setRotationPoint(6F, -22F, -18F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Import Shape1
		bodyModel[47].setRotationPoint(3F, -16F, 7.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 7, 8, 34, 0F); // Import Shape1
		bodyModel[48].setRotationPoint(18F, -23F, -17F);

		bodyModel[49].addBox(0F, 0F, 0F, 8, 6, 50, 0F); // Import Shape1
		bodyModel[49].setRotationPoint(12F, -22F, -24F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 15, 10, 0F); // Import Shape1
		bodyModel[50].setRotationPoint(11F, -25F, 27F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 21, 10, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Shape1
		bodyModel[51].setRotationPoint(21F, -29F, -35F);

		bodyModel[52].addBox(0F, 0F, 0F, 10, 15, 10, 0F); // Import Shape1
		bodyModel[52].setRotationPoint(11F, -25F, -35F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 21, 1, 0F); // Import Shape1
		bodyModel[53].setRotationPoint(11F, -29F, -25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 21, 10, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Shape1
		bodyModel[54].setRotationPoint(21F, -29F, 27F);

		bodyModel[55].addBox(0F, 0F, 0F, 10, 21, 1, 0F); // Import Shape1
		bodyModel[55].setRotationPoint(11F, -29F, 37F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Shape1
		bodyModel[56].setRotationPoint(11F, -10F, -33F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 21, 10, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Shape1
		bodyModel[57].setRotationPoint(10F, -29F, 27F);

		bodyModel[58].addBox(0F, 0F, 0F, 10, 21, 1, 0F); // Import Shape1
		bodyModel[58].setRotationPoint(11F, -29F, -36F);

		bodyModel[59].addBox(0F, 0F, 0F, 10, 12, 3, 0F); // Import Shape1
		bodyModel[59].setRotationPoint(21F, -19F, -16F);
		bodyModel[59].rotateAngleX = -0.8901179F;
		bodyModel[59].rotateAngleY = 3.141593F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 21, 10, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Shape1
		bodyModel[60].setRotationPoint(10F, -29F, -35F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Shape1
		bodyModel[61].setRotationPoint(13F, -10F, 36F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Shape1
		bodyModel[62].setRotationPoint(11F, -10F, 29F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[63].setRotationPoint(13F, -10F, -35F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Shape1
		bodyModel[64].setRotationPoint(13F, -10F, -26F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[65].setRotationPoint(13F, -10F, 27F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[66].setRotationPoint(20F, -10F, -33F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[67].setRotationPoint(20F, -10F, 29F);

		bodyModel[68].addBox(0F, 0F, 0F, 10, 21, 1, 0F); // Import Shape1
		bodyModel[68].setRotationPoint(11F, -29F, 26F);

		bodyModel[69].addBox(0F, 0F, 0F, 10, 12, 3, 0F); // Import Shape1
		bodyModel[69].setRotationPoint(11F, -19F, 16F);
		bodyModel[69].rotateAngleX = -0.8901179F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[70].setRotationPoint(16F, -27F, 2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[71].setRotationPoint(28F, -27.5F, -5F);
		bodyModel[71].rotateAngleX = -0.01745329F;

		bodyModel[72].addBox(0F, 0F, 0F, 9, 4, 10, 0F); // Import Shape1
		bodyModel[72].setRotationPoint(7F, -24F, -5F);
		bodyModel[72].rotateAngleZ = 0.4014257F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[73].setRotationPoint(16F, -27F, -4F);

		bodyModel[74].addBox(0F, 0F, 0F, 42, 15, 18, 0F); // Import Shape1-
		bodyModel[74].setRotationPoint(-5F, -24F, -9F);

		bodyModel[75].addShapeBox(0F, -1F, 10F, 11, 4, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Shape1
		bodyModel[75].setRotationPoint(65F, -24F, -6F);
		bodyModel[75].rotateAngleX = -0.50614548F;
		bodyModel[75].rotateAngleY = 3.14159265F;

		bodyModel[76].addShapeBox(0F, -1F, 10F, 11, 4, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Shape1
		bodyModel[76].setRotationPoint(54F, -24F, 6F);
		bodyModel[76].rotateAngleX = -0.5061455F;

		bodyModel[77].addBox(0F, 0F, 0F, 11, 2, 21, 0F); // Import Shape1
		bodyModel[77].setRotationPoint(65F, -24F, -6F);
		bodyModel[77].rotateAngleX = -0.5061455F;
		bodyModel[77].rotateAngleY = 3.141593F;

		bodyModel[78].addBox(0F, -2F, 21F, 11, 6, 2, 0F); // Import Shape1
		bodyModel[78].setRotationPoint(65F, -24F, -6F);
		bodyModel[78].rotateAngleX = -0.5061455F;
		bodyModel[78].rotateAngleY = 3.141593F;

		bodyModel[79].addBox(0F, 0F, 0F, 11, 11, 2, 0F); // Import Shape1
		bodyModel[79].setRotationPoint(56.5F, -31F, -1F);
		bodyModel[79].rotateAngleZ = -0.715585F;

		bodyModel[80].addBox(0F, -2F, 21F, 11, 6, 2, 0F); // Import Shape1
		bodyModel[80].setRotationPoint(54F, -24F, 6F);
		bodyModel[80].rotateAngleX = -0.50614548F;

		bodyModel[81].addBox(0F, 0F, 0F, 11, 2, 21, 0F); // Import Shape1
		bodyModel[81].setRotationPoint(54F, -24F, 6F);
		bodyModel[81].rotateAngleX = -0.5061455F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 8, 34, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[82].setRotationPoint(7F, -23F, -17F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Shape1
		bodyModel[83].setRotationPoint(-3F, -15.8F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Shape1
		bodyModel[84].setRotationPoint(-3F, -14.2F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Shape1
		bodyModel[85].setRotationPoint(-3F, -14.2F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Shape1
		bodyModel[86].setRotationPoint(-3F, -15.8F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[87].setRotationPoint(-5F, -16F, 9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F); // Import Shape1
		bodyModel[88].setRotationPoint(-5F, -16F, -10.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Import Shape1
		bodyModel[89].setRotationPoint(3F, -16F, -10.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 33, 9, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[90].setRotationPoint(-40F, -4F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 33, 9, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[91].setRotationPoint(-40F, -4F, -9F);

		bodyModel[92].addBox(16F, 3F, 0F, 2, 18, 1, 0F); // Import Shape1
		bodyModel[92].setRotationPoint(-34.7F, -17.7F, -8.9F);
		bodyModel[92].rotateAngleZ = 0.3490658F;

		bodyModel[93].addBox(16F, 3F, 0F, 2, 18, 1, 0F); // Import Shape1
		bodyModel[93].setRotationPoint(-34.7F, -17.7F, 7.9F);
		bodyModel[93].rotateAngleZ = 0.3490658F;

		bodyModel[94].addBox(0F, 3F, 0F, 2, 14, 1, 0F); // Import Shape1
		bodyModel[94].setRotationPoint(-34.7F, -17.7F, 7.9F);
		bodyModel[94].rotateAngleZ = 0.3490658F;

		bodyModel[95].addBox(0F, 3F, 0F, 2, 14, 1, 0F); // Import Shape1
		bodyModel[95].setRotationPoint(-34.7F, -17.7F, -8.9F);
		bodyModel[95].rotateAngleZ = 0.3490658F;

		bodyModel[96].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Import Shape1
		bodyModel[96].setRotationPoint(-15.9F, -24.4F, 7.9F);
		bodyModel[96].rotateAngleZ = -0.05235988F;

		bodyModel[97].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Import Shape1
		bodyModel[97].setRotationPoint(-34.7F, -17.6F, -8.9F);
		bodyModel[97].rotateAngleZ = 0.34906585F;

		bodyModel[98].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(30, 0, 30, 0), new Coord2D(30, 16, 30, 16), new Coord2D(0, 16, 0, 16) }), 18, 30, 16, 80, 18, ModelRendererTurbo.MR_FRONT, new float[] {34 ,30 ,16}); // Import Shape1
		bodyModel[98].setRotationPoint(25F, 7F, 9F);


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Import Yawflap
		yawFlapModel[1] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import PitchFlap

		yawFlapModel[0].addBox(-4F, 0F, -6F, 8, 0, 12, 0F); // Import Yawflap
		yawFlapModel[0].setRotationPoint(-36F, 4.9F, 0F);

		yawFlapModel[1].addBox(0F, 0F, -0.5F, 3, 1, 1, 0F); // Import PitchFlap
		yawFlapModel[1].setRotationPoint(-31F, -7F, 0F);
		yawFlapModel[1].rotateAngleZ = 1.57079633F;
		
		flipAll();
		
	}
	
	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}