//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelL85 extends ModelGun
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelL85()	
	{


// Gun
		gunModel = new ModelRendererTurbo[95];
		gunModel[0] = new ModelRendererTurbo(this,  0,  49, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  74, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  99, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  140, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  385, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  455, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  510, textureX, textureY); // Body22
		gunModel[22] = new ModelRendererTurbo(this,  0,  535, textureX, textureY); // Body23
		gunModel[23] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Body24
		gunModel[24] = new ModelRendererTurbo(this,  0,  610, textureX, textureY); // Body26
		gunModel[25] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // Body27
		gunModel[26] = new ModelRendererTurbo(this,  0,  630, textureX, textureY); // Body28
		gunModel[27] = new ModelRendererTurbo(this,  0,  640, textureX, textureY); // Body29
		gunModel[28] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Body30
		gunModel[29] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Body31
		gunModel[30] = new ModelRendererTurbo(this,  0,  660, textureX, textureY); // Body32
		gunModel[31] = new ModelRendererTurbo(this,  0,  640, textureX, textureY); // Body33
		gunModel[32] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body34
		gunModel[33] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body35
		gunModel[34] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body36
		gunModel[35] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body37
		gunModel[36] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body38
		gunModel[37] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body39
		gunModel[38] = new ModelRendererTurbo(this,  0,  690, textureX, textureY); // Body40
		gunModel[39] = new ModelRendererTurbo(this,  0,  700, textureX, textureY); // Body41
		gunModel[40] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // Body42
		gunModel[41] = new ModelRendererTurbo(this,  0,  745, textureX, textureY); // Body43
		gunModel[42] = new ModelRendererTurbo(this,  0,  770, textureX, textureY); // Body44
		gunModel[43] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // Body45
		gunModel[44] = new ModelRendererTurbo(this,  0,  820, textureX, textureY); // Body46
		gunModel[45] = new ModelRendererTurbo(this,  0,  840, textureX, textureY); // Body47
		gunModel[46] = new ModelRendererTurbo(this,  0,  860, textureX, textureY); // Body48
		gunModel[47] = new ModelRendererTurbo(this,  0,  885, textureX, textureY); // Body49
		gunModel[48] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // Body50
		gunModel[49] = new ModelRendererTurbo(this,  0,  940, textureX, textureY); // Body51
		gunModel[50] = new ModelRendererTurbo(this,  0,  970, textureX, textureY); // Body52
		gunModel[51] = new ModelRendererTurbo(this,  0,  999, textureX, textureY); // Body53
		gunModel[52] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Body54
		gunModel[53] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body55
		gunModel[54] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body56
		gunModel[55] = new ModelRendererTurbo(this,  0,  670, textureX, textureY); // Body57
		gunModel[56] = new ModelRendererTurbo(this,  100,  130, textureX, textureY); // Body58
		gunModel[57] = new ModelRendererTurbo(this,  100,  220, textureX, textureY); // Body59
		gunModel[58] = new ModelRendererTurbo(this,  100,  260, textureX, textureY); // Body60
		gunModel[59] = new ModelRendererTurbo(this,  100,  290, textureX, textureY); // Body61
		gunModel[60] = new ModelRendererTurbo(this,  100,  360, textureX, textureY); // Body62
		gunModel[61] = new ModelRendererTurbo(this,  100,  390, textureX, textureY); // Body62
		gunModel[62] = new ModelRendererTurbo(this,  100,  410, textureX, textureY); // Body63
		gunModel[63] = new ModelRendererTurbo(this,  100,  460, textureX, textureY); // Body64
		gunModel[64] = new ModelRendererTurbo(this,  100,  460, textureX, textureY); // Body65
		gunModel[65] = new ModelRendererTurbo(this,  100,  480, textureX, textureY); // Body66
		gunModel[66] = new ModelRendererTurbo(this,  100,  480, textureX, textureY); // Body67
		gunModel[67] = new ModelRendererTurbo(this,  100,  480, textureX, textureY); // Body68
		gunModel[68] = new ModelRendererTurbo(this,  100,  480, textureX, textureY); // Body69
		gunModel[69] = new ModelRendererTurbo(this,  100,  480, textureX, textureY); // Body70
		gunModel[70] = new ModelRendererTurbo(this,  100,  480, textureX, textureY); // Body71
		gunModel[71] = new ModelRendererTurbo(this,  100,  500, textureX, textureY); // Body72
		gunModel[72] = new ModelRendererTurbo(this,  100,  530, textureX, textureY); // Body73
		gunModel[73] = new ModelRendererTurbo(this,  100,  560, textureX, textureY); // Body74
		gunModel[74] = new ModelRendererTurbo(this,  100,  560, textureX, textureY); // Body75
		gunModel[75] = new ModelRendererTurbo(this,  100,  560, textureX, textureY); // Body76
		gunModel[76] = new ModelRendererTurbo(this,  100,  590, textureX, textureY); // Body77
		gunModel[77] = new ModelRendererTurbo(this,  100,  620, textureX, textureY); // Body78
		gunModel[78] = new ModelRendererTurbo(this,  100,  650, textureX, textureY); // Body79
		gunModel[79] = new ModelRendererTurbo(this,  100,  680, textureX, textureY); // Body80
		gunModel[80] = new ModelRendererTurbo(this,  100,  800, textureX, textureY); // Body81
		gunModel[81] = new ModelRendererTurbo(this,  100,  830, textureX, textureY); // Body82
		gunModel[82] = new ModelRendererTurbo(this,  100,  860, textureX, textureY); // Body83
		gunModel[83] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // Body84
		gunModel[84] = new ModelRendererTurbo(this,  100,  1000, textureX, textureY); // Body85
		gunModel[85] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Body86
		gunModel[86] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // Body87
		gunModel[87] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // Body88
		gunModel[88] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // Body89
		gunModel[89] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // Body90
		gunModel[90] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // Body91
		gunModel[91] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // Body92
		gunModel[92] = new ModelRendererTurbo(this,  200,  50, textureX, textureY); // Body93
		gunModel[93] = new ModelRendererTurbo(this,  200,  50, textureX, textureY); // Body94
		gunModel[94] = new ModelRendererTurbo(this,  200,  50, textureX, textureY); // Body95
		gunModel[0].addBox(0F, -29F, 0F, 24, 7, 16, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(6F, -22F, 0F, 18, 7, 16, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(0F, -15F, -1F, 24, 24, 16, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[2].setRotationPoint(-4F, 0F, 1F);

		gunModel[3].addShapeBox(0F, 9F, -1F, 19, 7, 16, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); //Test
		gunModel[3].setRotationPoint(-4F, 0F, 1F);

		gunModel[4].addShapeBox(35F, -50F, 0F, 142, 22, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F); //Test
		gunModel[4].setRotationPoint(-142F, 15F, 1F);

		gunModel[5].addBox(0F, -29F, 0F, 7, 3, 16, 0F); // Body6
		gunModel[5].setRotationPoint(26F, 1.5F, 0F);

		gunModel[6].addBox(1F, -29F, 0F, 5, 2, 6, 0F); // Body7
		gunModel[6].setRotationPoint(26F, 4.5F, 5F);

		gunModel[7].addShapeBox(1F, -29F, 0F, 9, 9, 6, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		gunModel[7].setRotationPoint(26F, 6.5F, 5F);

		gunModel[8].addShapeBox(1F, -29F, 0F, 6, 6, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -2F, 0F); //Test
		gunModel[8].setRotationPoint(34F, 13.5F, 5F);

		gunModel[9].addBox(1F, -29F, 0F, 23, 2, 6, 0F); // Body10
		gunModel[9].setRotationPoint(11F, 17.5F, 5F);

		gunModel[10].addBox(5F, -29F, 0F, 2, 21, 6, 0F); // Body11
		gunModel[10].setRotationPoint(34F, -7.5F, 5F);

		gunModel[11].addBox(-16F, -35F, 0F, 50, 5, 16, 0F); // Body12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-18F, -35F, 0F, 2, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); //Test
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addBox(-21F, -35F, 0F, 3, 3, 16, 0F); // Body14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-23F, -35F, 0F, 2, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); //Test
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addBox(30F, -33F, -0.5F, 3, 1, 17, 0F); // Body16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(30F, -34F, -0.5F, 3, 1, 17, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(30F, -32F, -0.5F, 3, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addBox(-63F, -35F, 0F, 40, 5, 16, 0F); // Body19
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-64F, -35F, 0F, 1, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); //Test
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addBox(-68F, -35F, 0F, 4, 3, 16, 0F); // Body21
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(-71F, -35F, 0F, 3, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); //Test
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addBox(-93F, -35F, 0F, 22, 5, 16, 0F); // Body23
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(-48F, -35F, 0.5F, 25, 25, 15, 0F); // Body24
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addBox(-44F, -35F, 15.5F, 6, 4, 2, 0F); // Body26
		gunModel[24].setRotationPoint(7F, 9F, 0F);

		gunModel[25].addBox(-38F, -35F, 15.5F, 1, 4, 2, 0F); // Body27
		gunModel[25].setRotationPoint(7F, 9F, 0F);

		gunModel[26].addBox(-43F, -35F, 15.5F, 10, 3, 1, 0F); // Body28
		gunModel[26].setRotationPoint(-4F, 9.5F, 0F);

		gunModel[27].addBox(-35F, -38F, 15.5F, 10, 1, 1, 0F); // Body29
		gunModel[27].setRotationPoint(-4F, 9.5F, 0F);

		gunModel[28].addShapeBox(-25F, -38F, 15.5F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F); //Test
		gunModel[28].setRotationPoint(-4F, 9.5F, 0F);

		gunModel[29].addShapeBox(-25F, -37F, 15.5F, 3, 3, 1, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); //Test
		gunModel[29].setRotationPoint(-4F, 14.5F, 0F);

		gunModel[30].addBox(-23F, -38F, 15.5F, 1, 3, 1, 0F); // Body32
		gunModel[30].setRotationPoint(-4F, 12.5F, 0F);

		gunModel[31].addBox(-35F, -37F, 15.5F, 10, 1, 1, 0F); // Body33
		gunModel[31].setRotationPoint(-4F, 16.5F, 0F);

		gunModel[32].addBox(-21F, -28F, 0.5F, 3, 1, 15, 0F); // Body34
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(-21F, -29F, 0.5F, 3, 1, 15, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(-21F, -27F, 0.5F, 3, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addBox(-58F, -27F, 0.5F, 3, 1, 15, 0F); // Body37
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(-58F, -28F, 0.5F, 3, 1, 15, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(-58F, -26F, 0.5F, 3, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addBox(-93F, -37F, 15.5F, 1, 1, 1, 0F); // Body40
		gunModel[38].setRotationPoint(15F, 3F, 0F);

		gunModel[39].addBox(0F, -1F, 15F, 8, 3, 1, 0F); // Body41
		gunModel[39].setRotationPoint(-73F, -27F, 0F);
		gunModel[39].rotateAngleZ = -0.4153883F;

		gunModel[40].addBox(-47F, -35F, 0.5F, 82, 6, 15, 0F); // Body42
		gunModel[40].setRotationPoint(0F, -6F, 0F);

		gunModel[41].addShapeBox(-14F, -38F, 0F, 36, 3, 16, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addBox(-47F, -41F, 0.5F, 82, 4, 15, 0F); // Body44
		gunModel[42].setRotationPoint(0F, -6F, 0F);

		gunModel[43].addBox(26F, -41F, 0.5F, 9, 2, 15, 0F); // Body45
		gunModel[43].setRotationPoint(0F, -2F, 0F);

		gunModel[44].addBox(26F, -41F, 0.5F, 4, 2, 15, 0F); // Body46
		gunModel[44].setRotationPoint(-8F, -2F, 0F);

		gunModel[45].addBox(26F, -41F, 0.5F, 5, 2, 15, 0F); // Body47
		gunModel[45].setRotationPoint(-18F, -2F, 0F);

		gunModel[46].addBox(26F, -41F, 0.5F, 3, 2, 15, 0F); // Body48
		gunModel[46].setRotationPoint(-27F, -2F, 0F);

		gunModel[47].addBox(26F, -41F, 0.5F, 40, 2, 15, 0F); // Body49
		gunModel[47].setRotationPoint(-73F, -2F, 0F);

		gunModel[48].addBox(-47F, -41F, 1F, 60, 12, 14, 0F); // Body50
		gunModel[48].setRotationPoint(-60F, -6F, 0F);

		gunModel[49].addBox(-47F, -42F, 1.5F, 36, 12, 15, 0F); // Body51
		gunModel[49].setRotationPoint(-36F, -6F, 0F);

		gunModel[50].addBox(-47F, -42F, 1.5F, 4, 12, 15, 0F); // Body52
		gunModel[50].setRotationPoint(-40F, -6F, 0F);

		gunModel[51].addShapeBox(-47F, -42F, 1.5F, 7, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); //Test
		gunModel[51].setRotationPoint(-47F, -6F, 0F);

		gunModel[52].addShapeBox(-47F, -42F, 1.5F, 2, 8, 15, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); //Test
		gunModel[52].setRotationPoint(-49F, -6F, 0F);

		gunModel[53].addShapeBox(-58F, -26F, 0.5F, 3, 1, 15, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[53].setRotationPoint(-45F, -18F, 0F);

		gunModel[54].addBox(-58F, -25F, 0.5F, 3, 1, 15, 0F); // Body56
		gunModel[54].setRotationPoint(-45F, -18F, 0F);

		gunModel[55].addShapeBox(-58F, -24F, 0.5F, 3, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		gunModel[55].setRotationPoint(-45F, -18F, 0F);

		gunModel[56].addShapeBox(35F, -29F, 0.5F, 15, 10, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[56].setRotationPoint(-142F, 14F, 1F);

		gunModel[57].addShapeBox(35F, -35F, -0.5F, 6, 16, 15, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[57].setRotationPoint(-148F, 14F, 1F);

		gunModel[58].addBox(35F, -35F, -0.5F, 5, 12, 15, 0F); // Body60
		gunModel[58].setRotationPoint(-147F, 2F, 1F);

		gunModel[59].addShapeBox(31F, -49F, -0.5F, 9, 14, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		gunModel[59].setRotationPoint(-147F, 2F, 1F);

		gunModel[60].addBox(26F, -41F, 0F, 49, 3, 16, 0F); // Body62
		gunModel[60].setRotationPoint(9F, -3F, 0F);

		gunModel[61].addBox(26F, -41F, 4F, 39, 3, 8, 0F); // Body62
		gunModel[61].setRotationPoint(19F, -9F, 0F);

		gunModel[62].addShapeBox(26F, -41F, 4F, 10, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); //Test
		gunModel[62].setRotationPoint(9F, -9F, 0F);

		gunModel[63].addShapeBox(26F, -41F, 12F, 5, 6, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[63].setRotationPoint(53F, -9F, 0F);

		gunModel[64].addShapeBox(26F, -41F, 0F, 5, 6, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[64].setRotationPoint(53F, -9F, 0F);

		gunModel[65].addShapeBox(26F, -41F, 12F, 3, 6, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[65].setRotationPoint(43F, -9F, 0F);

		gunModel[66].addShapeBox(26F, -41F, 0F, 3, 6, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[66].setRotationPoint(43F, -9F, 0F);

		gunModel[67].addShapeBox(26F, -41F, 12F, 3, 6, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[67].setRotationPoint(33F, -9F, 0F);

		gunModel[68].addShapeBox(26F, -41F, 0F, 3, 6, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[68].setRotationPoint(33F, -9F, 0F);

		gunModel[69].addShapeBox(26F, -41F, 12F, 3, 6, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[69].setRotationPoint(23F, -9F, 0F);

		gunModel[70].addShapeBox(26F, -41F, 0F, 3, 6, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[70].setRotationPoint(23F, -9F, 0F);

		gunModel[71].addBox(26F, -41F, -1F, 49, 2, 18, 0F); // Body72
		gunModel[71].setRotationPoint(9F, 4F, 0F);

		gunModel[72].addShapeBox(26F, -41F, -1F, 6, 6, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[72].setRotationPoint(52F, 0F, 0F);

		gunModel[73].addShapeBox(26F, -41F, -1F, 2, 4, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[73].setRotationPoint(42F, 0F, 0F);

		gunModel[74].addShapeBox(26F, -41F, -1F, 2, 4, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[74].setRotationPoint(32F, 0F, 0F);

		gunModel[75].addShapeBox(26F, -41F, -1F, 2, 4, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[75].setRotationPoint(22F, 0F, 0F);

		gunModel[76].addShapeBox(26F, -41F, -1F, 5, 4, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[76].setRotationPoint(9F, 0F, 0F);

		gunModel[77].addShapeBox(26F, -35F, -2F, 10, 2, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[77].setRotationPoint(9F, 0F, 0F);

		gunModel[78].addBox(26F, -35F, -2F, 10, 4, 20, 0F); // Body79
		gunModel[78].setRotationPoint(9F, 2F, 0F);

		gunModel[79].addShapeBox(26F, -29F, -2F, 10, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[79].setRotationPoint(9F, 0F, 0F);

		gunModel[80].addShapeBox(26F, -35F, -2F, 67, 2, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[80].setRotationPoint(19F, 0F, 0F);

		gunModel[81].addBox(26F, -35F, -2F, 67, 4, 20, 0F); // Body82
		gunModel[81].setRotationPoint(19F, 2F, 0F);

		gunModel[82].addShapeBox(26F, -35F, -2F, 67, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		gunModel[82].setRotationPoint(19F, 6F, 0F);

		gunModel[83].addShapeBox(26F, -41F, -1F, 28, 6, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[83].setRotationPoint(58F, 0F, 0F);

		gunModel[84].addBox(26F, -41F, 0F, 6, 2, 16, 0F); // Body85
		gunModel[84].setRotationPoint(58F, -2F, 0F);

		gunModel[85].addShapeBox(26F, -41F, 2F, 16, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); //Test
		gunModel[85].setRotationPoint(70F, -3F, 0F);

		gunModel[86].addShapeBox(26F, -41F, 3.5F, 109, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[86].setRotationPoint(13F, 0F, 0F);

		gunModel[87].addBox(26F, -38F, 3.5F, 109, 3, 9, 0F); // Body88
		gunModel[87].setRotationPoint(13F, 0F, 0F);

		gunModel[88].addShapeBox(26F, -35F, 6.5F, 109, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		gunModel[88].setRotationPoint(13F, 0F, -3F);

		gunModel[89].addBox(26F, -38.5F, 2F, 3, 4, 12, 0F); // Body90
		gunModel[89].setRotationPoint(108F, 0F, 0F);

		gunModel[90].addShapeBox(26F, -42.5F, 2F, 3, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[90].setRotationPoint(108F, 0F, 0F);

		gunModel[91].addShapeBox(26F, -34.5F, 2F, 3, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[91].setRotationPoint(108F, 0F, 0F);

		gunModel[92].addShapeBox(26F, -42.5F, 2F, 17, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[92].setRotationPoint(122F, 0F, 0F);

		gunModel[93].addBox(26F, -38.5F, 2F, 17, 4, 12, 0F); // Body94
		gunModel[93].setRotationPoint(122F, 0F, 0F);

		gunModel[94].addShapeBox(26F, -34.5F, 2F, 17, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[94].setRotationPoint(122F, 0F, 0F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[34];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // Sight1
		defaultScopeModel[1] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // Sight2
		defaultScopeModel[2] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // Sight3
		defaultScopeModel[3] = new ModelRendererTurbo(this,  200,  342, textureX, textureY); // Sight4
		defaultScopeModel[4] = new ModelRendererTurbo(this,  200,  342, textureX, textureY); // Sight5
		defaultScopeModel[5] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Sight6
		defaultScopeModel[6] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Sight7
		defaultScopeModel[7] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // Sight8
		defaultScopeModel[8] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // Sight9
		defaultScopeModel[9] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // Sight10
		defaultScopeModel[10] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // Sight11
		defaultScopeModel[11] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Sight12
		defaultScopeModel[12] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // Sight13
		defaultScopeModel[13] = new ModelRendererTurbo(this,  200,  470, textureX, textureY); // Sight14
		defaultScopeModel[14] = new ModelRendererTurbo(this,  200,  470, textureX, textureY); // Sight15
		defaultScopeModel[15] = new ModelRendererTurbo(this,  200,  342, textureX, textureY); // Sight16
		defaultScopeModel[16] = new ModelRendererTurbo(this,  200,  342, textureX, textureY); // Sight17
		defaultScopeModel[17] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // Sight18
		defaultScopeModel[18] = new ModelRendererTurbo(this,  200,  590, textureX, textureY); // Sight19
		defaultScopeModel[19] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // Sight20
		defaultScopeModel[20] = new ModelRendererTurbo(this,  200,  630, textureX, textureY); // Sight21
		defaultScopeModel[21] = new ModelRendererTurbo(this,  200,  670, textureX, textureY); // Sight22
		defaultScopeModel[22] = new ModelRendererTurbo(this,  200,  670, textureX, textureY); // Sight23
		defaultScopeModel[23] = new ModelRendererTurbo(this,  200,  690, textureX, textureY); // Sight24
		defaultScopeModel[24] = new ModelRendererTurbo(this,  200,  690, textureX, textureY); // Sight25
		defaultScopeModel[25] = new ModelRendererTurbo(this,  200,  700, textureX, textureY); // Sight26
		defaultScopeModel[26] = new ModelRendererTurbo(this,  200,  720, textureX, textureY); // Sight27
		defaultScopeModel[27] = new ModelRendererTurbo(this,  200,  750, textureX, textureY); // Sight28
		defaultScopeModel[28] = new ModelRendererTurbo(this,  200,  770, textureX, textureY); // Sight29
		defaultScopeModel[29] = new ModelRendererTurbo(this,  200,  900, textureX, textureY); // Sight30
		defaultScopeModel[30] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // Sight31
		defaultScopeModel[31] = new ModelRendererTurbo(this,  200,  940, textureX, textureY); // Sight32
		defaultScopeModel[32] = new ModelRendererTurbo(this,  200,  940, textureX, textureY); // Sight33
		defaultScopeModel[33] = new ModelRendererTurbo(this,  200,  950, textureX, textureY); // Sight34
		defaultScopeModel[0].addBox(-47F, -41F, 1.5F, 47, 3, 13, 0F); // Sight1
		defaultScopeModel[0].setRotationPoint(13F, -9F, 0F);

		defaultScopeModel[1].addShapeBox(-47F, -41F, 1.5F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[1].setRotationPoint(13F, -18F, 0F);

		defaultScopeModel[2].addShapeBox(-47F, -41F, 12.5F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[2].setRotationPoint(13F, -18F, 0F);

		defaultScopeModel[3].addBox(-47F, -41F, 12.5F, 5, 5, 2, 0F); // Sight4
		defaultScopeModel[3].setRotationPoint(13F, -23F, 0F);

		defaultScopeModel[4].addBox(-47F, -41F, 1.5F, 5, 5, 2, 0F); // Sight5
		defaultScopeModel[4].setRotationPoint(13F, -23F, 0F);

		defaultScopeModel[5].addBox(-47F, -41F, 1.5F, 20, 3, 2, 0F); // Sight6
		defaultScopeModel[5].setRotationPoint(13F, -26F, 0F);

		defaultScopeModel[6].addBox(-47F, -41F, 12.5F, 20, 3, 2, 0F); // Sight7
		defaultScopeModel[6].setRotationPoint(13F, -26F, 0F);

		defaultScopeModel[7].addShapeBox(-47F, -41F, 12.5F, 9, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[7].setRotationPoint(13F, -29F, 0F);

		defaultScopeModel[8].addShapeBox(-47F, -41F, 1.5F, 9, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[8].setRotationPoint(13F, -29F, 0F);

		defaultScopeModel[9].addShapeBox(-47F, -41F, 12.5F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[9].setRotationPoint(18F, -23F, 0F);

		defaultScopeModel[10].addShapeBox(-47F, -41F, 1.5F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[10].setRotationPoint(18F, -23F, 0F);

		defaultScopeModel[11].addShapeBox(-47F, -41F, 12.5F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); //Test
		defaultScopeModel[11].setRotationPoint(33F, -26F, 0F);

		defaultScopeModel[12].addShapeBox(-47F, -41F, 1.5F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); //Test
		defaultScopeModel[12].setRotationPoint(33F, -26F, 0F);

		defaultScopeModel[13].addShapeBox(-47F, -41F, 12.5F, 5, 5, 2, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		defaultScopeModel[13].setRotationPoint(58F, -26F, 0F);

		defaultScopeModel[14].addShapeBox(-47F, -41F, 1.5F, 5, 5, 2, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		defaultScopeModel[14].setRotationPoint(58F, -26F, 0F);

		defaultScopeModel[15].addShapeBox(-47F, -41F, 12.5F, 5, 12, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[15].setRotationPoint(58F, -21F, 0F);

		defaultScopeModel[16].addShapeBox(-47F, -41F, 1.5F, 5, 12, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[16].setRotationPoint(58F, -21F, 0F);

		defaultScopeModel[17].addBox(-47F, -41F, 3.5F, 1, 16, 9, 0F); // Sight18
		defaultScopeModel[17].setRotationPoint(14F, -25F, 0F);

		defaultScopeModel[18].addBox(-47F, -41F, 3.5F, 43, 1, 9, 0F); // Sight19
		defaultScopeModel[18].setRotationPoint(15F, -25F, 0F);

		defaultScopeModel[19].addShapeBox(-47F, -41F, 3.5F, 4, 4, 9, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		defaultScopeModel[19].setRotationPoint(58F, -25F, 0F);

		defaultScopeModel[20].addShapeBox(-47F, -41F, 3.5F, 4, 12, 9, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[20].setRotationPoint(58F, -21F, 0F);

		defaultScopeModel[21].addBox(-47F, -41F, 5.5F, 1, 2, 1, 0F); // Sight22
		defaultScopeModel[21].setRotationPoint(14F, -27F, 0F);

		defaultScopeModel[22].addBox(-47F, -41F, 9.5F, 1, 2, 1, 0F); // Sight23
		defaultScopeModel[22].setRotationPoint(14F, -27F, 0F);

		defaultScopeModel[23].addShapeBox(-47F, -41F, 8.5F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[23].setRotationPoint(14F, -29F, 0F);

		defaultScopeModel[24].addShapeBox(-47F, -41F, 5.5F, 1, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); //Test
		defaultScopeModel[24].setRotationPoint(14F, -29F, 0F);

		defaultScopeModel[25].addBox(-47F, -43F, 7.5F, 1, 1, 1, 0F); // Sight26
		defaultScopeModel[25].setRotationPoint(14F, -27F, 0F);

		defaultScopeModel[26].addShapeBox(26F, -41F, 2F, 6, 8, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[26].setRotationPoint(58F, -10F, 0F);

		defaultScopeModel[27].addBox(26F, -41F, 5F, 6, 8, 6, 0F); // Sight28
		defaultScopeModel[27].setRotationPoint(58F, -18F, 0F);

		defaultScopeModel[28].addShapeBox(26F, -41F, 5F, 6, 2, 6, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[28].setRotationPoint(58F, -20F, 0F);

		defaultScopeModel[29].addBox(26F, -41F, 7.5F, 6, 4, 1, 0F); // Sight30
		defaultScopeModel[29].setRotationPoint(58F, -24F, 0F);

		defaultScopeModel[30].addBox(26F, -42F, 5.5F, 6, 1, 5, 0F); // Sight31
		defaultScopeModel[30].setRotationPoint(58F, -24F, 0F);

		defaultScopeModel[31].addBox(26F, -46F, 5.5F, 6, 4, 1, 0F); // Sight32
		defaultScopeModel[31].setRotationPoint(58F, -24F, 0F);

		defaultScopeModel[32].addBox(26F, -46F, 9.5F, 6, 4, 1, 0F); // Sight33
		defaultScopeModel[32].setRotationPoint(58F, -24F, 0F);

		defaultScopeModel[33].addBox(26F, -46F, 7.5F, 6, 3, 1, 0F); // Sight34
		defaultScopeModel[33].setRotationPoint(58F, -23F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // Ammo1
		ammoModel[1] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // Ammo2

		ammoModel[0].addBox(-47F, -35F, 1.5F, 23, 12, 13, 0F); // Ammo1
		ammoModel[0].setRotationPoint(0F, 25F, 0F);

		ammoModel[1].addShapeBox(-47F, -35F, 1.5F, 23, 25, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -6F, 0F, 0F); //Test
		ammoModel[1].setRotationPoint(0F, 37F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		translateAll (0F, 4F,-8F);

		flipAll();
	}
}