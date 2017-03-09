//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHarpy extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHarpy()	
	{


// Body
		bodyModel = new ModelRendererTurbo[102];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // COCockpit1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  70, textureX, textureY); // COCockpit2
		bodyModel[2] = new ModelRendererTurbo(this,  0,  92, textureX, textureY); // COCockpit3
		bodyModel[3] = new ModelRendererTurbo(this,  13,  140, textureX, textureY); // COCockpit4
		bodyModel[4] = new ModelRendererTurbo(this,  40,  92, textureX, textureY); // COCockpit5
		bodyModel[5] = new ModelRendererTurbo(this,  12,  170, textureX, textureY); // COCockpit6
		bodyModel[6] = new ModelRendererTurbo(this,  12,  170, textureX, textureY); // COCockpit7
		bodyModel[7] = new ModelRendererTurbo(this,  0,  195, textureX, textureY); // COCockpit8
		bodyModel[8] = new ModelRendererTurbo(this,  0,  239, textureX, textureY); // COCockpit9
		bodyModel[9] = new ModelRendererTurbo(this,  18,  239, textureX, textureY); // COCockpit10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // COCockpit11
		bodyModel[11] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // COCockpit12
		bodyModel[12] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // COCockpit13
		bodyModel[13] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // COCockpit14
		bodyModel[14] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // COCockpit15
		bodyModel[15] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // COCockpit16
		bodyModel[16] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // COCockpit17
		bodyModel[17] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // COCockpit18
		bodyModel[18] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // COCockpit19
		bodyModel[19] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // COCockpit20
		bodyModel[20] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // COCockpit21
		bodyModel[21] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // COCockpit22
		bodyModel[22] = new ModelRendererTurbo(this,  74,  195, textureX, textureY); // COCockpit23
		bodyModel[23] = new ModelRendererTurbo(this,  0,  34, textureX, textureY); // COCockpit24
		bodyModel[24] = new ModelRendererTurbo(this,  0,  416, textureX, textureY); // COBody1
		bodyModel[25] = new ModelRendererTurbo(this,  12,  500, textureX, textureY); // COBody2
		bodyModel[26] = new ModelRendererTurbo(this,  12,  500, textureX, textureY); // COBody3
		bodyModel[27] = new ModelRendererTurbo(this,  12,  540, textureX, textureY); // COBody4
		bodyModel[28] = new ModelRendererTurbo(this,  12,  540, textureX, textureY); // COBody5
		bodyModel[29] = new ModelRendererTurbo(this,  12,  560, textureX, textureY); // COBody6
		bodyModel[30] = new ModelRendererTurbo(this,  12,  560, textureX, textureY); // COBody7
		bodyModel[31] = new ModelRendererTurbo(this,  12,  570, textureX, textureY); // COBody8
		bodyModel[32] = new ModelRendererTurbo(this,  12,  570, textureX, textureY); // COBody9
		bodyModel[33] = new ModelRendererTurbo(this,  12,  590, textureX, textureY); // COBody10
		bodyModel[34] = new ModelRendererTurbo(this,  12,  590, textureX, textureY); // COBody11
		bodyModel[35] = new ModelRendererTurbo(this,  12,  560, textureX, textureY); // COBody12
		bodyModel[36] = new ModelRendererTurbo(this,  12,  560, textureX, textureY); // COBody13
		bodyModel[37] = new ModelRendererTurbo(this,  12,  570, textureX, textureY); // COBody14
		bodyModel[38] = new ModelRendererTurbo(this,  12,  570, textureX, textureY); // COBody15
		bodyModel[39] = new ModelRendererTurbo(this,  12,  590, textureX, textureY); // COBody16
		bodyModel[40] = new ModelRendererTurbo(this,  12,  590, textureX, textureY); // COBody17
		bodyModel[41] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // COBody18
		bodyModel[42] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // COBody19
		bodyModel[43] = new ModelRendererTurbo(this,  49,  384, textureX, textureY); // COBody20
		bodyModel[44] = new ModelRendererTurbo(this,  0,  715, textureX, textureY); // COLengine1
		bodyModel[45] = new ModelRendererTurbo(this,  0,  754, textureX, textureY); // COLengine2
		bodyModel[46] = new ModelRendererTurbo(this,  110,  733, textureX, textureY); // COLengine3
		bodyModel[47] = new ModelRendererTurbo(this,  160,  733, textureX, textureY); // COLengine4
		bodyModel[48] = new ModelRendererTurbo(this,  0,  790, textureX, textureY); // COLengine5
		bodyModel[49] = new ModelRendererTurbo(this,  110,  707, textureX, textureY); // COLengine6
		bodyModel[50] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // COLengine7
		bodyModel[51] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // COLengine8
		bodyModel[52] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine9
		bodyModel[53] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine10
		bodyModel[54] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine11
		bodyModel[55] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine12
		bodyModel[56] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine13
		bodyModel[57] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine14
		bodyModel[58] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine15
		bodyModel[59] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine16
		bodyModel[60] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine17
		bodyModel[61] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // COLengine18
		bodyModel[62] = new ModelRendererTurbo(this,  0,  840, textureX, textureY); // COLengine20
		bodyModel[63] = new ModelRendererTurbo(this,  0,  840, textureX, textureY); // COLengine21
		bodyModel[64] = new ModelRendererTurbo(this,  0,  865, textureX, textureY); // COLengine22
		bodyModel[65] = new ModelRendererTurbo(this,  0,  865, textureX, textureY); // COLengine23
		bodyModel[66] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // COLengine24
		bodyModel[67] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // COLengine25
		bodyModel[68] = new ModelRendererTurbo(this,  110,  840, textureX, textureY); // COLengine26
		bodyModel[69] = new ModelRendererTurbo(this,  110,  840, textureX, textureY); // COLengine27
		bodyModel[70] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // COLengine28
		bodyModel[71] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // COLengine29
		bodyModel[72] = new ModelRendererTurbo(this,  0,  715, textureX, textureY); // CORengine1
		bodyModel[73] = new ModelRendererTurbo(this,  0,  754, textureX, textureY); // CORengine2
		bodyModel[74] = new ModelRendererTurbo(this,  110,  733, textureX, textureY); // CORengine3
		bodyModel[75] = new ModelRendererTurbo(this,  160,  733, textureX, textureY); // CORengine4
		bodyModel[76] = new ModelRendererTurbo(this,  0,  790, textureX, textureY); // CORengine5
		bodyModel[77] = new ModelRendererTurbo(this,  110,  707, textureX, textureY); // CORengine6
		bodyModel[78] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // CORengine7
		bodyModel[79] = new ModelRendererTurbo(this,  0,  830, textureX, textureY); // CORengine8
		bodyModel[80] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine9
		bodyModel[81] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine10
		bodyModel[82] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine11
		bodyModel[83] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine12
		bodyModel[84] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine13
		bodyModel[85] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine14
		bodyModel[86] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine15
		bodyModel[87] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine16
		bodyModel[88] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine17
		bodyModel[89] = new ModelRendererTurbo(this,  140,  644, textureX, textureY); // CORengine18
		bodyModel[90] = new ModelRendererTurbo(this,  0,  840, textureX, textureY); // CORengine20
		bodyModel[91] = new ModelRendererTurbo(this,  0,  840, textureX, textureY); // CORengine21
		bodyModel[92] = new ModelRendererTurbo(this,  0,  865, textureX, textureY); // CORengine22
		bodyModel[93] = new ModelRendererTurbo(this,  0,  865, textureX, textureY); // CORengine23
		bodyModel[94] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // CORengine24
		bodyModel[95] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // CORengine25
		bodyModel[96] = new ModelRendererTurbo(this,  110,  840, textureX, textureY); // CORengine26
		bodyModel[97] = new ModelRendererTurbo(this,  110,  840, textureX, textureY); // CORengine27
		bodyModel[98] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // CORengine28
		bodyModel[99] = new ModelRendererTurbo(this,  110,  880, textureX, textureY); // CORengine29
		bodyModel[100] = new ModelRendererTurbo(this,  400,  840, textureX, textureY); // EngineBitL
		bodyModel[101] = new ModelRendererTurbo(this,  400,  840, textureX, textureY); // EngineBitR

		bodyModel[0].addBox(0F, 0F, 0F, 64, 2, 24, 0F); // COCockpit1
		bodyModel[0].setRotationPoint(-80F, -17F, -12F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 3, 16, 0F); // COCockpit2
		bodyModel[1].setRotationPoint(-57F, -20F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 20, 16, 0F); // COCockpit3
		bodyModel[2].setRotationPoint(-41F, -37F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 16, 10, 16, 0F); // COCockpit4
		bodyModel[3].setRotationPoint(-35F, -27F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 29, 16, 0F); // COCockpit5
		bodyModel[4].setRotationPoint(-19F, -46F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 64, 20, 2, 0F); // COCockpit6
		bodyModel[5].setRotationPoint(-80F, -37F, -12F);

		bodyModel[6].addBox(0F, 0F, 0F, 64, 20, 2, 0F); // COCockpit7
		bodyModel[6].setRotationPoint(-80F, -37F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 12, 20, 20, 0F); // COCockpit8
		bodyModel[7].setRotationPoint(-80F, -37F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // COCockpit9
		bodyModel[8].setRotationPoint(-67F, -27F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // COCockpit10
		bodyModel[9].setRotationPoint(-66F, -32F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 40, 24, 0F); // COCockpit11
		bodyModel[10].setRotationPoint(-16F, -55F, -12F);

		bodyModel[11].addBox(0F, 0F, 0F, 32, 3, 3, 0F); // COCockpit12
		bodyModel[11].setRotationPoint(-48F, -55F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 29, 18, 3, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); //Test
		bodyModel[12].setRotationPoint(-77F, -55F, -12F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // COCockpit14
		bodyModel[13].setRotationPoint(-48F, -52F, -12F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // COCockpit15
		bodyModel[14].setRotationPoint(-29F, -52F, -12F);

		bodyModel[15].addBox(0F, 0F, 0F, 32, 3, 3, 0F); // COCockpit16
		bodyModel[15].setRotationPoint(-48F, -55F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 29, 18, 3, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); //Test
		bodyModel[16].setRotationPoint(-77F, -55F, 9F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // COCockpit18
		bodyModel[17].setRotationPoint(-48F, -52F, 9F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 15, 3, 0F); // COCockpit19
		bodyModel[18].setRotationPoint(-29F, -52F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 3, 24, 0F); // COCockpit20
		bodyModel[19].setRotationPoint(-80F, -40F, -12F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 18, 0F); // COCockpit21
		bodyModel[20].setRotationPoint(-48F, -55F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 3, 18, 0F); // COCockpit22
		bodyModel[21].setRotationPoint(-29F, -55F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 24, 23, 24, 0F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F); //Test
		bodyModel[22].setRotationPoint(-104F, -38F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 35, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); //Test
		bodyModel[23].setRotationPoint(-48F, -15F, -12F);

		bodyModel[24].addBox(0F, 0F, 0F, 64, 49, 24, 0F); // COBody1
		bodyModel[24].setRotationPoint(-13F, -55F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 32, 20, 16, 0F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[25].setRotationPoint(-32F, -37F, -28F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 32, 20, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F); //Test
		bodyModel[26].setRotationPoint(-32F, -37F, 12F);

		bodyModel[27].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // COBody4
		bodyModel[27].setRotationPoint(-40F, -31F, -20F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // COBody5
		bodyModel[28].setRotationPoint(-40F, -31F, 12F);

		bodyModel[29].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // COBody6
		bodyModel[29].setRotationPoint(-48F, -31F, -18F);

		bodyModel[30].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // COBody7
		bodyModel[30].setRotationPoint(-48F, -25F, -18F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // COBody8
		bodyModel[31].setRotationPoint(-52F, -25F, -20F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // COBody9
		bodyModel[32].setRotationPoint(-52F, -31F, -20F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // COBody10
		bodyModel[33].setRotationPoint(-52F, -29F, -20F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // COBody11
		bodyModel[34].setRotationPoint(-52F, -29F, -14F);

		bodyModel[35].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // COBody12
		bodyModel[35].setRotationPoint(-48F, -31F, 14F);

		bodyModel[36].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // COBody13
		bodyModel[36].setRotationPoint(-48F, -25F, 14F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // COBody14
		bodyModel[37].setRotationPoint(-52F, -31F, 12F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // COBody15
		bodyModel[38].setRotationPoint(-52F, -25F, 12F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // COBody16
		bodyModel[39].setRotationPoint(-52F, -29F, 18F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // COBody17
		bodyModel[40].setRotationPoint(-52F, -29F, 12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 51, 49, 16, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[41].setRotationPoint(0F, -55F, -28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 51, 49, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); //Test
		bodyModel[42].setRotationPoint(0F, -55F, 12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 64, 24, 4, 0F, -32F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[43].setRotationPoint(-13F, -79F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 48, 32, 3, 0F); // COLengine1
		bodyModel[44].setRotationPoint(2F, -44F, -31F);

		bodyModel[45].addBox(0F, 0F, 0F, 48, 32, 3, 0F); // COLengine2
		bodyModel[45].setRotationPoint(2F, -44F, -54F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 32, 20, 0F); // COLengine3
		bodyModel[46].setRotationPoint(2F, -44F, -51F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 32, 20, 0F); // COLengine4
		bodyModel[47].setRotationPoint(47F, -44F, -51F);

		bodyModel[48].addBox(0F, 0F, 0F, 48, 3, 26, 0F); // COLengine5
		bodyModel[48].setRotationPoint(2F, -47F, -54F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 38, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 4F, 0F, 5F, 4F, 0F, 5F, 6F, 0F, 5F); //Test
		bodyModel[49].setRotationPoint(8F, -52F, -49F);

		bodyModel[50].addBox(0F, 0F, 0F, 38, 2, 2, 0F); // COLengine7
		bodyModel[50].setRotationPoint(8F, -54F, -49F);

		bodyModel[51].addBox(0F, 0F, 0F, 38, 2, 2, 0F); // COLengine8
		bodyModel[51].setRotationPoint(8F, -54F, -35F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine9
		bodyModel[52].setRotationPoint(8F, -54F, -47F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine10
		bodyModel[53].setRotationPoint(12F, -54F, -47F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine11
		bodyModel[54].setRotationPoint(16F, -54F, -47F);
		bodyModel[54].rotateAngleX = -0.01745329F;

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine12
		bodyModel[55].setRotationPoint(20F, -54F, -47F);
		bodyModel[55].rotateAngleX = -0.01745329F;

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine13
		bodyModel[56].setRotationPoint(24F, -54F, -47F);
		bodyModel[56].rotateAngleX = -0.01745329F;

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine14
		bodyModel[57].setRotationPoint(28F, -54F, -47F);
		bodyModel[57].rotateAngleX = -0.01745329F;

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine15
		bodyModel[58].setRotationPoint(32F, -54F, -47F);
		bodyModel[58].rotateAngleX = -0.01745329F;

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine16
		bodyModel[59].setRotationPoint(36F, -54F, -47F);
		bodyModel[59].rotateAngleX = -0.01745329F;

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine17
		bodyModel[60].setRotationPoint(40F, -54F, -47F);
		bodyModel[60].rotateAngleX = -0.01745329F;

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // COLengine18
		bodyModel[61].setRotationPoint(44F, -54F, -47F);
		bodyModel[61].rotateAngleX = -0.01745329F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 36, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); //Test
		bodyModel[62].setRotationPoint(8F, -12F, -37F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 36, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[63].setRotationPoint(8F, -12F, -54F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 10, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, -5F); //Test
		bodyModel[64].setRotationPoint(2F, -12F, -54F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 10, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -5F); //Test
		bodyModel[65].setRotationPoint(44F, -12F, -54F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // COLengine24
		bodyModel[66].setRotationPoint(0F, -30F, -51F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // COLengine25
		bodyModel[67].setRotationPoint(0F, -30F, -37F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 11, 20, 0F); // COLengine26
		bodyModel[68].setRotationPoint(0F, -41F, -51F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 11, 20, 0F); // COLengine27
		bodyModel[69].setRotationPoint(50F, -41F, -51F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // COLengine28
		bodyModel[70].setRotationPoint(50F, -30F, -37F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // COLengine29
		bodyModel[71].setRotationPoint(50F, -30F, -51F);

		bodyModel[72].addBox(0F, 0F, 0F, 48, 32, 3, 0F); // CORengine1
		bodyModel[72].setRotationPoint(2F, -44F, 51F);

		bodyModel[73].addBox(0F, 0F, 0F, 48, 32, 3, 0F); // CORengine2
		bodyModel[73].setRotationPoint(2F, -44F, 28F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 32, 20, 0F); // CORengine3
		bodyModel[74].setRotationPoint(2F, -44F, 31F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 32, 20, 0F); // CORengine4
		bodyModel[75].setRotationPoint(47F, -44F, 31F);

		bodyModel[76].addBox(0F, 0F, 0F, 48, 3, 26, 0F); // CORengine5
		bodyModel[76].setRotationPoint(2F, -47F, 28F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 38, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 4F, 0F, 5F, 4F, 0F, 5F, 6F, 0F, 5F); //Test
		bodyModel[77].setRotationPoint(8F, -52F, 33F);

		bodyModel[78].addBox(0F, 0F, 0F, 38, 2, 2, 0F); // CORengine7
		bodyModel[78].setRotationPoint(8F, -54F, 47F);

		bodyModel[79].addBox(0F, 0F, 0F, 38, 2, 2, 0F); // CORengine8
		bodyModel[79].setRotationPoint(8F, -54F, 33F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine9
		bodyModel[80].setRotationPoint(8F, -54F, 35F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine10
		bodyModel[81].setRotationPoint(12F, -54F, 35F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine11
		bodyModel[82].setRotationPoint(16F, -54F, 35F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine12
		bodyModel[83].setRotationPoint(20F, -54F, 35F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine13
		bodyModel[84].setRotationPoint(24F, -54F, 35F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine14
		bodyModel[85].setRotationPoint(28F, -54F, 35F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine15
		bodyModel[86].setRotationPoint(32F, -54F, 35F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine16
		bodyModel[87].setRotationPoint(36F, -54F, 35F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine17
		bodyModel[88].setRotationPoint(40F, -54F, 35F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // CORengine18
		bodyModel[89].setRotationPoint(44F, -54F, 35F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 36, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[90].setRotationPoint(8F, -12F, 28F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 36, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); //Test
		bodyModel[91].setRotationPoint(8F, -12F, 45F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 10, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, -5F); //Test
		bodyModel[92].setRotationPoint(2F, -12F, 28F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 10, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -5F); //Test
		bodyModel[93].setRotationPoint(44F, -12F, 28F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // CORengine24
		bodyModel[94].setRotationPoint(0F, -30F, 45F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // CORengine25
		bodyModel[95].setRotationPoint(0F, -30F, 31F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 11, 20, 0F); // CORengine26
		bodyModel[96].setRotationPoint(0F, -41F, 31F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 11, 20, 0F); // CORengine27
		bodyModel[97].setRotationPoint(50F, -41F, 31F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // CORengine28
		bodyModel[98].setRotationPoint(50F, -30F, 31F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // CORengine29
		bodyModel[99].setRotationPoint(50F, -30F, 45F);

		bodyModel[100].addBox(0F, 0F, 0F, 36, 2, 8, 0F); // EngineBitL
		bodyModel[100].setRotationPoint(8F, -12F, -45F);

		bodyModel[101].addBox(0F, 0F, 0F, 36, 2, 8, 0F); // EngineBitR
		bodyModel[101].setRotationPoint(8F, -12F, 37F);



// Tail
		tailModel = new ModelRendererTurbo[40];
		tailModel[0] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // TAconnect1
		tailModel[1] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // TAconnect2
		tailModel[2] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // TAconnect3
		tailModel[3] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // TAmain1
		tailModel[4] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // TAAUX1
		tailModel[5] = new ModelRendererTurbo(this,  200,  50, textureX, textureY); // TALA1
		tailModel[6] = new ModelRendererTurbo(this,  200,  65, textureX, textureY); // TALA2
		tailModel[7] = new ModelRendererTurbo(this,  200,  65, textureX, textureY); // TALA3
		tailModel[8] = new ModelRendererTurbo(this,  200,  75, textureX, textureY); // TALA4
		tailModel[9] = new ModelRendererTurbo(this,  200,  75, textureX, textureY); // TALA5
		tailModel[10] = new ModelRendererTurbo(this,  200,  85, textureX, textureY); // TALA6
		tailModel[11] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // TALA7
		tailModel[12] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // TALA8
		tailModel[13] = new ModelRendererTurbo(this,  200,  115, textureX, textureY); // TALA9
		tailModel[14] = new ModelRendererTurbo(this,  200,  115, textureX, textureY); // TALA10
		tailModel[15] = new ModelRendererTurbo(this,  200,  50, textureX, textureY); // TARA1
		tailModel[16] = new ModelRendererTurbo(this,  200,  65, textureX, textureY); // TARA2
		tailModel[17] = new ModelRendererTurbo(this,  200,  65, textureX, textureY); // TARA3
		tailModel[18] = new ModelRendererTurbo(this,  200,  75, textureX, textureY); // TARA4
		tailModel[19] = new ModelRendererTurbo(this,  200,  75, textureX, textureY); // TARA5
		tailModel[20] = new ModelRendererTurbo(this,  200,  85, textureX, textureY); // TARA6
		tailModel[21] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // TARA7
		tailModel[22] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // TARA8
		tailModel[23] = new ModelRendererTurbo(this,  200,  115, textureX, textureY); // TARA9
		tailModel[24] = new ModelRendererTurbo(this,  200,  115, textureX, textureY); // TARA10
		tailModel[25] = new ModelRendererTurbo(this,  200,  500, textureX, textureY); // TAmain2
		tailModel[26] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // TAmain3
		tailModel[27] = new ModelRendererTurbo(this,  200,  600, textureX, textureY); // TAmain4
		tailModel[28] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // TATF1
		tailModel[29] = new ModelRendererTurbo(this,  260,  370, textureX, textureY); // TAHATS
		tailModel[30] = new ModelRendererTurbo(this,  260,  370, textureX, textureY); // TATF3
		tailModel[31] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // TABF1
		tailModel[32] = new ModelRendererTurbo(this,  260,  370, textureX, textureY); // TABF2
		tailModel[33] = new ModelRendererTurbo(this,  260,  370, textureX, textureY); // TABF3
		tailModel[34] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // TALF1
		tailModel[35] = new ModelRendererTurbo(this,  260,  395, textureX, textureY); // TALF2
		tailModel[36] = new ModelRendererTurbo(this,  260,  395, textureX, textureY); // TALF3
		tailModel[37] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // TARF1
		tailModel[38] = new ModelRendererTurbo(this,  260,  395, textureX, textureY); // TARF2
		tailModel[39] = new ModelRendererTurbo(this,  260,  395, textureX, textureY); // TARF3

		tailModel[0].addShapeBox(0F, 0F, 0F, 16, 49, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -15F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, -15F, 0F, -6F, 0F); //Test
		tailModel[0].setRotationPoint(51F, -55F, 12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 16, 49, 16, 0F, 0F, -8F, 0F, 0F, -8F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -14F, -15F, 0F, -14F, 0F, 0F, 0F, 0F); //Test
		tailModel[1].setRotationPoint(51F, -55F, -28F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 16, 35, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F); //Test
		tailModel[2].setRotationPoint(51F, -55F, -12F);

		tailModel[3].addBox(0F, 0F, 0F, 32, 35, 24, 0F); // TAmain1
		tailModel[3].setRotationPoint(67F, -55F, -12F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 13, 15, 42, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); //Test
		tailModel[4].setRotationPoint(74F, -43F, -21F);

		tailModel[5].addBox(0F, 0F, 0F, 40, 2, 8, 0F); // TALA1
		tailModel[5].setRotationPoint(85F, -43F, -20.5F);
		tailModel[5].rotateAngleZ = 0.5235988F;

		tailModel[6].addBox(-1F, 2F, 0F, 41, 3, 2, 0F); // TALA2
		tailModel[6].setRotationPoint(85F, -43F, -20.5F);
		tailModel[6].rotateAngleZ = 0.5235988F;

		tailModel[7].addBox(-1F, 2F, 0F, 41, 3, 2, 0F); // TALA3
		tailModel[7].setRotationPoint(85F, -43F, -14.5F);
		tailModel[7].rotateAngleZ = 0.5235988F;

		tailModel[8].addShapeBox(29F, 5F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		tailModel[8].setRotationPoint(85F, -43F, -20.5F);
		tailModel[8].rotateAngleZ = 0.5235988F;

		tailModel[9].addShapeBox(29F, 5F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		tailModel[9].setRotationPoint(85F, -43F, -14.5F);
		tailModel[9].rotateAngleZ = 0.5235988F;

		tailModel[10].addBox(0F, 0F, 0F, 29, 2, 8, 0F); // TALA6
		tailModel[10].setRotationPoint(85F, -31F, -20.5F);
		tailModel[10].rotateAngleZ = -0.1570796F;

		tailModel[11].addBox(0F, -7F, 0F, 29, 7, 2, 0F); // TALA7
		tailModel[11].setRotationPoint(85F, -31F, -20.5F);
		tailModel[11].rotateAngleZ = -0.1570796F;

		tailModel[12].addBox(0F, -7F, 6F, 29, 7, 2, 0F); // TALA8
		tailModel[12].setRotationPoint(85F, -31F, -20.5F);
		tailModel[12].rotateAngleZ = -0.1570796F;

		tailModel[13].addShapeBox(17F, -10F, 6F, 12, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test	tailModel[13].setRotationPoint(85F, -31F, -20.5F);
		tailModel[13].rotateAngleZ = -0.1570796F;

		tailModel[14].addShapeBox(17F, -10F, 0F, 12, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[14].setRotationPoint(85F, -31F, -20.5F);
		tailModel[14].rotateAngleZ = -0.1570796F;

		tailModel[15].addBox(0F, 0F, 0F, 40, 2, 8, 0F); // TARA1
		tailModel[15].setRotationPoint(85F, -43F, 12.5F);
		tailModel[15].rotateAngleZ = 0.5235988F;

		tailModel[16].addBox(-1F, 2F, 0F, 41, 3, 2, 0F); // TARA2
		tailModel[16].setRotationPoint(85F, -43F, 12.5F);
		tailModel[16].rotateAngleZ = 0.5235988F;

		tailModel[17].addBox(-1F, 2F, 0F, 41, 3, 2, 0F); // TARA3
		tailModel[17].setRotationPoint(85F, -43F, 18.5F);
		tailModel[17].rotateAngleZ = 0.5235988F;

		tailModel[18].addShapeBox(29F, 5F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		tailModel[18].setRotationPoint(85F, -43F, 12.5F);
		tailModel[18].rotateAngleZ = 0.5235988F;

		tailModel[19].addShapeBox(29F, 5F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); //Test
		tailModel[19].setRotationPoint(85F, -43F, 18.5F);
		tailModel[19].rotateAngleZ = 0.5235988F;

		tailModel[20].addBox(0F, 0F, 0F, 29, 2, 8, 0F); // TARA6
		tailModel[20].setRotationPoint(85F, -31F, 12.5F);
		tailModel[20].rotateAngleZ = -0.1570796F;

		tailModel[21].addBox(0F, -7F, 0F, 29, 7, 2, 0F); // TARA7
		tailModel[21].setRotationPoint(85F, -31F, 12.5F);
		tailModel[21].rotateAngleZ = -0.1570796F;

		tailModel[22].addBox(0F, -7F, 6F, 29, 7, 2, 0F); // TARA8
		tailModel[22].setRotationPoint(85F, -31F, 12.5F);
		tailModel[22].rotateAngleZ = -0.1570796F;

		tailModel[23].addShapeBox(17F, -10F, 6F, 12, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[23].setRotationPoint(85F, -31F, 12.5F);
		tailModel[23].rotateAngleZ = -0.1570796F;

		tailModel[24].addShapeBox(17F, -10F, 0F, 12, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[24].setRotationPoint(85F, -31F, 12.5F);
		tailModel[24].rotateAngleZ = -0.1570796F;

		tailModel[25].addShapeBox(0F, 0F, 0F, 48, 20, 16, 0F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 14F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 4F); //Test
		tailModel[25].setRotationPoint(99F, -54F, -8F);

		tailModel[26].addBox(0F, 0F, 0F, 32, 20, 16, 0F); // TAmain3
		tailModel[26].setRotationPoint(147F, -54F, -8F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 8, 20, 16, 0F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, 0F); //Test
		tailModel[27].setRotationPoint(179F, -54F, -8F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 24, 32, 4, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[28].setRotationPoint(163F, -86F, -2F);

		tailModel[29].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // TAHATS
		tailModel[29].setRotationPoint(187F, -86F, -2F);

		tailModel[30].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // TATF3
		tailModel[30].setRotationPoint(187F, -62F, -2F);

		tailModel[31].addShapeBox(0F, 0F, -2F, 24, 32, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); //Test
		tailModel[31].setRotationPoint(163F, -34F, 0F);

		tailModel[32].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // TABF2
		tailModel[32].setRotationPoint(187F, -10F, -2F);

		tailModel[33].addBox(0F, 0F, 0F, 8, 8, 4, 0F); // TABF3
		tailModel[33].setRotationPoint(187F, -34F, -2F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 24, 4, 32, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		tailModel[34].setRotationPoint(163F, -46F, -40F);

		tailModel[35].addBox(0F, 0F, 0F, 8, 4, 8, 0F); // TALF2
		tailModel[35].setRotationPoint(187F, -46F, -40F);

		tailModel[36].addBox(0F, -2F, 0F, 8, 4, 8, 0F); // TALF3
		tailModel[36].setRotationPoint(187F, -44F, -16F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 24, 4, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); //Test
		tailModel[37].setRotationPoint(163F, -46F, 8F);

		tailModel[38].addBox(0F, 0F, 0F, 8, 4, 8, 0F); // TARF2
		tailModel[38].setRotationPoint(187F, -46F, 32F);

		tailModel[39].addBox(0F, 0F, 0F, 8, 4, 8, 0F); // TARF3
		tailModel[39].setRotationPoint(187F, -46F, 8F);



// Left Wing
		leftWingModel = new ModelRendererTurbo[11];
		leftWingModel[0] = new ModelRendererTurbo(this,  200,  649, textureX, textureY); // LWWing1
		leftWingModel[1] = new ModelRendererTurbo(this,  210,  750, textureX, textureY); // LWRP1
		leftWingModel[2] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP2
		leftWingModel[3] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP3
		leftWingModel[4] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP4
		leftWingModel[5] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP5
		leftWingModel[6] = new ModelRendererTurbo(this,  210,  750, textureX, textureY); // LWRP6
		leftWingModel[7] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP7
		leftWingModel[8] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP8
		leftWingModel[9] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP9
		leftWingModel[10] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // LWRP10

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 48, 2, 32, 0F, -14F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftWingModel[0].setRotationPoint(2F, -28F, -86F);


		leftWingModel[1].addBox(0F, 0F, 0F, 16, 14, 2, 0F); // LWRP1
		leftWingModel[1].setRotationPoint(16F, -26F, -65F);

		leftWingModel[2].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP2
		leftWingModel[2].setRotationPoint(12F, -22F, -63F);

		leftWingModel[3].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP3
		leftWingModel[3].setRotationPoint(12F, -22F, -69F);

		leftWingModel[4].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP4
		leftWingModel[4].setRotationPoint(12F, -16F, -63F);

		leftWingModel[5].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP5
		leftWingModel[5].setRotationPoint(12F, -16F, -69F);

		leftWingModel[6].addBox(0F, 0F, 0F, 16, 14, 2, 0F); // LWRP6
		leftWingModel[6].setRotationPoint(16F, -26F, -79F);

		leftWingModel[7].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP7
		leftWingModel[7].setRotationPoint(12F, -22F, -77F);

		leftWingModel[8].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP8
		leftWingModel[8].setRotationPoint(12F, -22F, -83F);

		leftWingModel[9].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP9
		leftWingModel[9].setRotationPoint(12F, -16F, -77F);

		leftWingModel[10].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // LWRP10
		leftWingModel[10].setRotationPoint(12F, -16F, -83F);


// Right Wing
		rightWingModel = new ModelRendererTurbo[11];
		rightWingModel[0] = new ModelRendererTurbo(this,  200,  649, textureX, textureY); // RWWing1
		rightWingModel[1] = new ModelRendererTurbo(this,  210,  750, textureX, textureY); // RWRP1
		rightWingModel[2] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP2
		rightWingModel[3] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP3
		rightWingModel[4] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP4
		rightWingModel[5] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP5
		rightWingModel[6] = new ModelRendererTurbo(this,  210,  750, textureX, textureY); // RWRP6
		rightWingModel[7] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP7
		rightWingModel[8] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP8
		rightWingModel[9] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP9
		rightWingModel[10] = new ModelRendererTurbo(this,  210,  780, textureX, textureY); // RWRP10

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 48, 2, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -14F, 0F, 0F); //Test
		rightWingModel[0].setRotationPoint(2F, -28F, 54F);

		rightWingModel[1].addBox(0F, 0F, 0F, 16, 14, 2, 0F); // RWRP1
		rightWingModel[1].setRotationPoint(16F, -26F, 63F);

		rightWingModel[2].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP2
		rightWingModel[2].setRotationPoint(12F, -22F, 59F);

		rightWingModel[3].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP3
		rightWingModel[3].setRotationPoint(12F, -22F, 65F);

		rightWingModel[4].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP4
		rightWingModel[4].setRotationPoint(12F, -16F, 59F);

		rightWingModel[5].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP5
		rightWingModel[5].setRotationPoint(12F, -16F, 65F);

		rightWingModel[6].addBox(0F, 0F, 0F, 16, 14, 2, 0F); // RWRP6
		rightWingModel[6].setRotationPoint(16F, -26F, 77F);

		rightWingModel[7].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP7
		rightWingModel[7].setRotationPoint(12F, -22F, 73F);

		rightWingModel[8].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP8
		rightWingModel[8].setRotationPoint(12F, -16F, 73F);

		rightWingModel[9].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP9
		rightWingModel[9].setRotationPoint(12F, -16F, 79F);

		rightWingModel[10].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // RWRP10
		rightWingModel[10].setRotationPoint(12F, -22F, 79F);


// Yaw Flap
		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this,  260,  800, textureX, textureY); // YF1
		yawFlapModel[1] = new ModelRendererTurbo(this,  260,  800, textureX, textureY); // YF2

		yawFlapModel[0].addBox(0F, -16F, -2F, 8, 16, 4, 0F); // YF1
		yawFlapModel[0].setRotationPoint(187F, -62F, 0F);

		yawFlapModel[1].addBox(0F, -16F, -2F, 8, 16, 4, 0F); // YF2
		yawFlapModel[1].setRotationPoint(187F, -10F, 0F);



// Pitch Flap Left
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  260,  830, textureX, textureY); // PFL1

		pitchFlapLeftModel[0].addBox(0F, -2F, 0F, 8, 4, 16, 0F); // PFL1
		pitchFlapLeftModel[0].setRotationPoint(187F, -44F, -32F);



// Pitch Flap Right
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,  260,  830, textureX, textureY); // PFR1

		pitchFlapRightModel[0].addBox(0F, -2F, 0F, 8, 4, 16, 0F); // PFR1
		pitchFlapRightModel[0].setRotationPoint(187F, -44F, 16F);



// Tail Wheel
		tailWheelModel = new ModelRendererTurbo[2];
		tailWheelModel[0] = new ModelRendererTurbo(this,  200,  900, textureX, textureY); // TAW1
		tailWheelModel[1] = new ModelRendererTurbo(this,  300,  950, textureX, textureY); // TAW2

		tailWheelModel[0].addBox(0F, 30F, -8F, 16, 8, 16, 0F); // TAW1
		tailWheelModel[0].setRotationPoint(88F, -15F, 0F);

		tailWheelModel[1].addShapeBox(-4F, -4F, -4F, 28, 34, 8, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, -20F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -20F, 1F, 0F); //Test
		tailWheelModel[1].setRotationPoint(76F, -16F, 0F);



// Left Wing Wheel
		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this,  200,  900, textureX, textureY); // LWW1
		leftWingWheelModel[1] = new ModelRendererTurbo(this,  200,  950, textureX, textureY); // LWW2

		leftWingWheelModel[0].addBox(0F, 30F, -31F, 16, 8, 16, 0F); // LWW1
		leftWingWheelModel[0].setRotationPoint(-16F, -15F, 0F);

		leftWingWheelModel[1].addShapeBox(0F, 22F, -27F, 8, 26, 26, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F); //Test
		leftWingWheelModel[1].setRotationPoint(-12F, -33F, 0F);



// Right Wing Wheel
		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this,  200,  900, textureX, textureY); // RWW1
		rightWingWheelModel[1] = new ModelRendererTurbo(this,  200,  950, textureX, textureY); // RWW2

		rightWingWheelModel[0].addBox(0F, 30F, 15F, 16, 8, 16, 0F); // RWW1
		rightWingWheelModel[0].setRotationPoint(-16F, -15F, 0F);

		rightWingWheelModel[1].addShapeBox(0F, 22F, 1F, 8, 26, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightWingWheelModel[1].setRotationPoint(-12F, -33F, 0F);



//Gun
                ModelRendererTurbo[][] turretModel = new ModelRendererTurbo[3][];
 
                turretModel[0] = new ModelRendererTurbo[3];
		turretModel[0][0] = new ModelRendererTurbo(this,  400,  34, textureX, textureY); // GunTurrret1
		turretModel[0][1] = new ModelRendererTurbo(this,  400,  100, textureX, textureY); // GunTurrret2
		turretModel[0][2] = new ModelRendererTurbo(this,  400,  100, textureX, textureY); // GunTurrret3
 
                turretModel[0][0].addShapeBox(-12F, 0F, -12F, 12, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F); //Test

			turretModel[0][1].addShapeBox(0F, 0F, -12F, 12, 9, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F); //Test


			turretModel[0][2].addShapeBox(0F, 0F, 4F, 12, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F); //Test
 
                for(ModelRendererTurbo gunPart : turretModel[0])
                        gunPart.setRotationPoint(-64F, -15F, 0F);

                turretModel[1] = new ModelRendererTurbo[0];
 
                registerGunModel("TURRET", turretModel);
 
 
                turretModel[2] = new ModelRendererTurbo[9];
		turretModel[2][0] = new ModelRendererTurbo(this,  400,  160, textureX, textureY); // GunBarrel4
		turretModel[2][1] = new ModelRendererTurbo(this,  400,  160, textureX, textureY); // GunBarrel5
		turretModel[2][2] = new ModelRendererTurbo(this,  400,  180, textureX, textureY); // GunBarrel6
		turretModel[2][3] = new ModelRendererTurbo(this,  400,  180, textureX, textureY); // GunBarrel7
		turretModel[2][4] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // GunBarrel8
		turretModel[2][5] = new ModelRendererTurbo(this,  400,  200, textureX, textureY); // GunBarrel9 
		turretModel[2][6] = new ModelRendererTurbo(this,  400,  120, textureX, textureY); // GunBarrel1
		turretModel[2][7] = new ModelRendererTurbo(this,  400,  140, textureX, textureY); // GunBarrel2
		turretModel[2][8] = new ModelRendererTurbo(this,  400,  120, textureX, textureY); // GunBarrel3

			turretModel[2][0].addBox(16F, 2F, -1F, 4, 1, 2, 0F); // GunBarrel4
 
			turretModel[2][1].addBox(16F, 5F, -1F, 4, 1, 2, 0F); // GunBarrel5 

			turretModel[2][2].addBox(20F, 5F, -2F, 2, 1, 4, 0F); // GunBarrel6 

			turretModel[2][3].addBox(20F, 2F, -2F, 2, 1, 4, 0F); // GunBarrel7 

			turretModel[2][4].addBox(20F, 3F, -2F, 2, 2, 1, 0F); // GunBarrel8
 
			turretModel[2][5].addBox(20F, 3F, 1F, 2, 2, 1, 0F); // GunBarrel9

			turretModel[2][6].addBox(0F, 0F, -4F, 6, 9, 8, 0F); // GunBarrel1


			turretModel[2][7].addBox(12F, 2F, -2F, 4, 4, 4, 0F); // GunBarrel2

			turretModel[2][8].addShapeBox(6F, 0F, -4F, 6, 9, 8, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); //Test
 
                for(ModelRendererTurbo gunPart : turretModel[2])
                        gunPart.setRotationPoint(-64F, -15F, 0F);
 

// Propeller
		propellerModels = new ModelRendererTurbo[1][1];
        propellerModels[0][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
        propellerModels[0][0].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
        propellerModels[0][0].setRotationPoint(65F, -23F, -1F);
		
		
		flipAll();

	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}
