//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBrutus extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelBrutus()
	{
		bodyModel = new ModelRendererTurbo[128];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Body1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Body2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 70, textureX, textureY); // Import Body3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Body4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Body5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import Body6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import Body7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Body8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Body9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import Body10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Body11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 395, textureX, textureY); // Import Body12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Body13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import Body14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import Body15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Body16
		bodyModel[16] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Body17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Import Body18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Body19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 395, textureX, textureY); // Import Body20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Body21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body22
		bodyModel[22] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body23
		bodyModel[23] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body24
		bodyModel[24] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body25
		bodyModel[25] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import Body26
		bodyModel[26] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Body27
		bodyModel[27] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Body28
		bodyModel[28] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body29
		bodyModel[29] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body30
		bodyModel[30] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body31
		bodyModel[31] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body32
		bodyModel[32] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Body33
		bodyModel[33] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Body34
		bodyModel[34] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Body35
		bodyModel[35] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body36
		bodyModel[36] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body37
		bodyModel[37] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body38
		bodyModel[38] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import Body39
		bodyModel[39] = new ModelRendererTurbo(this, 0, 495, textureX, textureY); // Import Body40
		bodyModel[40] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Body41
		bodyModel[41] = new ModelRendererTurbo(this, 0, 515, textureX, textureY); // Import Body42
		bodyModel[42] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body43
		bodyModel[43] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body44
		bodyModel[44] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body45
		bodyModel[45] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Body46
		bodyModel[46] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Body47
		bodyModel[47] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Body48
		bodyModel[48] = new ModelRendererTurbo(this, 0, 545, textureX, textureY); // Import Body49
		bodyModel[49] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import Body50
		bodyModel[50] = new ModelRendererTurbo(this, 0, 655, textureX, textureY); // Import Body51
		bodyModel[51] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Import Body52
		bodyModel[52] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Body53
		bodyModel[53] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Body54
		bodyModel[54] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Body55
		bodyModel[55] = new ModelRendererTurbo(this, 0, 750, textureX, textureY); // Import Body56
		bodyModel[56] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Body57
		bodyModel[57] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Body58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Body59
		bodyModel[59] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Body60
		bodyModel[60] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Body61
		bodyModel[61] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Body62
		bodyModel[62] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import Body63
		bodyModel[63] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Body64
		bodyModel[64] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Body65
		bodyModel[65] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import Body66
		bodyModel[66] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Body67
		bodyModel[67] = new ModelRendererTurbo(this, 0, 810, textureX, textureY); // Import Body68
		bodyModel[68] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Body69
		bodyModel[69] = new ModelRendererTurbo(this, 0, 875, textureX, textureY); // Import Body70
		bodyModel[70] = new ModelRendererTurbo(this, 0, 935, textureX, textureY); // Import Body72
		bodyModel[71] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Body73
		bodyModel[72] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Body74
		bodyModel[73] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Body75
		bodyModel[74] = new ModelRendererTurbo(this, 0, 875, textureX, textureY); // Import Body76
		bodyModel[75] = new ModelRendererTurbo(this, 0, 935, textureX, textureY); // Import Body78
		bodyModel[76] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Body79
		bodyModel[77] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import Body80
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1010, textureX, textureY); // Import Body81
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1070, textureX, textureY); // Import Body82
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import Body83
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import Body84
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import Body85
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1135, textureX, textureY); // Import Body86
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import Body87
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1145, textureX, textureY); // Import Body88
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body89
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body90
		bodyModel[88] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body91
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body92
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body93
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body94
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body95
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body96
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body97
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body98
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body99
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body100
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body101
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import Body102
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Import Body103
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body104
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body105
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body106
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body108
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Import Body109
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body110
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body111
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body112
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Body113
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import Body114
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body115
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body116
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body117
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body118
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1245, textureX, textureY); // Import Body119
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import Body120
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body121
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body122
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body123
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1235, textureX, textureY); // Import Body124
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1245, textureX, textureY); // Import Body125
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Body126
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import Body127
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import Body128
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Body129
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import Body130
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import Body131

		bodyModel[0].addBox(-14F, 0F, 0F, 28, 8, 84, 0F); // Import Body1
		bodyModel[0].setRotationPoint(-1F, -34F, -42F);

		bodyModel[1].addShapeBox(14F, 0F, 0F, 28, 8, 84, 0F,0F, 0F, 0F,0F, 0F, -28F,0F, 0F, -28F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -28F,0F, 0F, -28F,0F, 0F, 0F); // Import Body2
		bodyModel[1].setRotationPoint(-1F, -34F, -42F);

		bodyModel[2].addShapeBox(-42F, 0F, 0F, 28, 8, 84, 0F,0F, 0F, -28F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -28F,0F, 0F, -28F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -28F); // Import Body3
		bodyModel[2].setRotationPoint(-1F, -34F, -42F);

		bodyModel[3].addBox(-42F, 0F, 0F, 84, 20, 42, 0F); // Import Body4
		bodyModel[3].setRotationPoint(-1F, -26F, -21F);

		bodyModel[4].addBox(3F, 0F, 0F, 64, 11, 27, 0F); // Import Body5
		bodyModel[4].setRotationPoint(-1F, -26F, 21F);

		bodyModel[5].addBox(3F, 0F, 0F, 94, 16, 4, 0F); // Import Body6
		bodyModel[5].setRotationPoint(-1F, -15F, 44F);

		bodyModel[6].addBox(0F, 0F, 0F, 32, 5, 27, 0F); // Import Body7
		bodyModel[6].setRotationPoint(66F, -26F, 20.9F);
		bodyModel[6].rotateAngleZ = -0.34906585F;

		bodyModel[7].addBox(3F, 0F, 0F, 4, 5, 19, 0F); // Import Body8
		bodyModel[7].setRotationPoint(89F, -15F, 25F);

		bodyModel[8].addBox(0F, 5F, 0F, 19, 7, 1, 0F); // Import Body9
		bodyModel[8].setRotationPoint(66F, -26F, 46.9F);
		bodyModel[8].rotateAngleZ = -0.34906585F;

		bodyModel[9].addBox(3F, 0F, 0F, 94, 16, 4, 0F); // Import Body10
		bodyModel[9].setRotationPoint(-1F, -15F, 20.8F);

		bodyModel[10].addBox(0F, 5F, 0F, 19, 7, 1, 0F); // Import Body11
		bodyModel[10].setRotationPoint(66F, -26F, 20.9F);
		bodyModel[10].rotateAngleZ = -0.34906585F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 27, 27, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Import Body12
		bodyModel[11].setRotationPoint(-8F, -26F, 21F);

		bodyModel[12].addBox(3F, 0F, -27F, 64, 11, 27, 0F); // Import Body13
		bodyModel[12].setRotationPoint(-1F, -26F, -21F);

		bodyModel[13].addBox(3F, 0F, -4F, 94, 16, 4, 0F); // Import Body14
		bodyModel[13].setRotationPoint(-1F, -15F, -44F);

		bodyModel[14].addBox(0F, 0F, -27F, 32, 5, 27, 0F); // Import Body15
		bodyModel[14].setRotationPoint(66F, -26F, -20.9F);
		bodyModel[14].rotateAngleZ = -0.34906585F;

		bodyModel[15].addBox(3F, 0F, -19F, 4, 5, 19, 0F); // Import Body16
		bodyModel[15].setRotationPoint(89F, -15F, -25F);

		bodyModel[16].addBox(0F, 5F, -1F, 19, 7, 1, 0F); // Import Body17
		bodyModel[16].setRotationPoint(66F, -26F, -46.9F);
		bodyModel[16].rotateAngleZ = -0.34906585F;

		bodyModel[17].addBox(3F, 0F, -4F, 94, 16, 4, 0F); // Import Body18
		bodyModel[17].setRotationPoint(-1F, -15F, -20.8F);

		bodyModel[18].addBox(0F, 5F, -1F, 19, 7, 1, 0F); // Import Body19
		bodyModel[18].setRotationPoint(66F, -26F, -20.9F);
		bodyModel[18].rotateAngleZ = -0.34906585F;

		bodyModel[19].addShapeBox(0F, 0F, -27F, 10, 27, 27, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Import Body20
		bodyModel[19].setRotationPoint(-8F, -26F, -21F);

		bodyModel[20].addShapeBox(12F, -4F, 0F, 16, 4, 19, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body21
		bodyModel[20].setRotationPoint(66F, -26F, 24.9F);
		bodyModel[20].rotateAngleZ = -0.34906585F;

		bodyModel[21].addShapeBox(28F, -3F, 0F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body22
		bodyModel[21].setRotationPoint(66F, -26F, 24.9F);
		bodyModel[21].rotateAngleZ = -0.34906585F;

		bodyModel[22].addShapeBox(28F, -3F, 0F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body23
		bodyModel[22].setRotationPoint(66F, -26F, 40.9F);
		bodyModel[22].rotateAngleZ = -0.34906585F;

		bodyModel[23].addShapeBox(28F, -3F, 0F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body24
		bodyModel[23].setRotationPoint(66F, -26F, 35.9F);
		bodyModel[23].rotateAngleZ = -0.34906585F;

		bodyModel[24].addShapeBox(28F, -3F, 0F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body25
		bodyModel[24].setRotationPoint(66F, -26F, 29.9F);
		bodyModel[24].rotateAngleZ = -0.3490658F;

		bodyModel[25].addBox(14F, -5F, 0F, 4, 1, 13, 0F); // Import Body26
		bodyModel[25].setRotationPoint(66F, -26F, 27.9F);
		bodyModel[25].rotateAngleZ = -0.3490658F;

		bodyModel[26].addBox(12F, -4F, 0F, 8, 4, 6, 0F); // Import Body27
		bodyModel[26].setRotationPoint(59F, -20F, 25.9F);

		bodyModel[27].addBox(12F, -4F, 0F, 8, 4, 6, 0F); // Import Body28
		bodyModel[27].setRotationPoint(59F, -20F, 36.9F);

		bodyModel[28].addBox(11F, -5F, 0F, 9, 1, 1, 0F); // Import Body29
		bodyModel[28].setRotationPoint(59F, -20F, 25.9F);

		bodyModel[29].addBox(11F, -5F, 0F, 9, 1, 1, 0F); // Import Body30
		bodyModel[29].setRotationPoint(59F, -20F, 30.9F);

		bodyModel[30].addBox(11F, -5F, 0F, 9, 1, 1, 0F); // Import Body31
		bodyModel[30].setRotationPoint(59F, -20F, 36.9F);

		bodyModel[31].addBox(11F, -5F, 0F, 9, 1, 1, 0F); // Import Body32
		bodyModel[31].setRotationPoint(59F, -20F, 41.9F);

		bodyModel[32].addBox(18F, -5F, 0F, 6, 1, 4, 0F); // Import Body33
		bodyModel[32].setRotationPoint(66F, -26F, 27.9F);
		bodyModel[32].rotateAngleZ = -0.34906585F;

		bodyModel[33].addBox(18F, -5F, 0F, 6, 1, 4, 0F); // Import Body34
		bodyModel[33].setRotationPoint(66F, -26F, 36.9F);
		bodyModel[33].rotateAngleZ = -0.34906585F;

		bodyModel[34].addShapeBox(12F, -4F, -19F, 16, 4, 19, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body35
		bodyModel[34].setRotationPoint(66F, -26F, -24.9F);
		bodyModel[34].rotateAngleZ = -0.34906585F;

		bodyModel[35].addShapeBox(28F, -3F, -3F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body36
		bodyModel[35].setRotationPoint(66F, -26F, -24.9F);
		bodyModel[35].rotateAngleZ = -0.3490658F;

		bodyModel[36].addShapeBox(28F, -3F, -3F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body37
		bodyModel[36].setRotationPoint(66F, -26F, -40.9F);
		bodyModel[36].rotateAngleZ = -0.3490658F;

		bodyModel[37].addShapeBox(28F, -3F, -3F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body38
		bodyModel[37].setRotationPoint(66F, -26F, -35.9F);
		bodyModel[37].rotateAngleZ = -0.3490658F;

		bodyModel[38].addShapeBox(28F, -3F, -3F, 18, 3, 3, 0F,0F, 0F, -1F,0F, -2.5F, -1.2F,0F, -2.5F, -1.2F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Body39
		bodyModel[38].setRotationPoint(66F, -26F, -29.9F);
		bodyModel[38].rotateAngleZ = -0.3490658F;

		bodyModel[39].addBox(14F, -5F, -13F, 4, 1, 13, 0F); // Import Body40
		bodyModel[39].setRotationPoint(66F, -26F, -27.9F);
		bodyModel[39].rotateAngleZ = -0.3490658F;

		bodyModel[40].addBox(12F, -4F, -6F, 8, 4, 6, 0F); // Import Body41
		bodyModel[40].setRotationPoint(59F, -20F, -25.9F);

		bodyModel[41].addBox(12F, -4F, -6F, 8, 4, 6, 0F); // Import Body42
		bodyModel[41].setRotationPoint(59F, -20F, -36.9F);

		bodyModel[42].addBox(11F, -5F, -1F, 9, 1, 1, 0F); // Import Body43
		bodyModel[42].setRotationPoint(59F, -20F, -25.9F);

		bodyModel[43].addBox(11F, -5F, -1F, 9, 1, 1, 0F); // Import Body44
		bodyModel[43].setRotationPoint(59F, -20F, -30.9F);

		bodyModel[44].addBox(11F, -5F, -1F, 9, 1, 1, 0F); // Import Body45
		bodyModel[44].setRotationPoint(59F, -20F, -36.9F);

		bodyModel[45].addBox(11F, -5F, -1F, 9, 1, 1, 0F); // Import Body46
		bodyModel[45].setRotationPoint(59F, -20F, -41.9F);

		bodyModel[46].addBox(18F, -5F, -4F, 6, 1, 4, 0F); // Import Body47
		bodyModel[46].setRotationPoint(66F, -26F, -27.9F);
		bodyModel[46].rotateAngleZ = -0.34906585F;

		bodyModel[47].addBox(18F, -5F, -4F, 6, 1, 4, 0F); // Import Body48
		bodyModel[47].setRotationPoint(66F, -26F, -36.9F);
		bodyModel[47].rotateAngleZ = -0.34906585F;

		bodyModel[48].addBox(0F, 0F, 0F, 28, 8, 42, 0F); // Import Body49
		bodyModel[48].setRotationPoint(41F, -26F, -21F);
		bodyModel[48].rotateAngleZ = -0.43633231F;

		bodyModel[49].addBox(0F, 0F, 0F, 27, 8, 42, 0F); // Import Body50
		bodyModel[49].setRotationPoint(39.6F, -14F, -21F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 31, 5, 42, 0F,96.4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,96.4F, 0F, 0F,70F, 0F, 0F,-30F, 0F, 0F,-30F, 0F, 0F,70F, 0F, 0F); // Import Body51
		bodyModel[50].setRotationPoint(35.6F, -6F, -21F);

		bodyModel[51].addBox(4F, -1F, 0F, 22, 1, 32, 0F); // Import Body52
		bodyModel[51].setRotationPoint(41F, -26F, -16F);
		bodyModel[51].rotateAngleZ = -0.43633231F;

		bodyModel[52].addBox(5F, -1.5F, 1F, 3, 1, 3, 0F); // Import Body53
		bodyModel[52].setRotationPoint(41F, -26F, -16F);
		bodyModel[52].rotateAngleZ = -0.43633231F;

		bodyModel[53].addBox(5F, -1.5F, 1F, 3, 1, 3, 0F); // Import Body54
		bodyModel[53].setRotationPoint(41F, -26F, 11F);
		bodyModel[53].rotateAngleZ = -0.43633231F;

		bodyModel[54].addBox(22F, -1.5F, 1F, 3, 1, 3, 0F); // Import Body55
		bodyModel[54].setRotationPoint(41F, -26F, 11F);
		bodyModel[54].rotateAngleZ = -0.4363323F;

		bodyModel[55].addBox(22F, -1.5F, 1F, 3, 1, 3, 0F); // Import Body56
		bodyModel[55].setRotationPoint(41F, -26F, -16F);
		bodyModel[55].rotateAngleZ = -0.43633231F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Body57
		bodyModel[56].setRotationPoint(66.6F, -14F, -15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Body58
		bodyModel[57].setRotationPoint(66.6F, -14F, -21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Body59
		bodyModel[58].setRotationPoint(66.6F, -14F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, -3F, 3, 8, 3, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Body60
		bodyModel[59].setRotationPoint(66.6F, -14F, 21F);

		bodyModel[60].addShapeBox(0F, 0F, -3F, 3, 8, 3, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Body61
		bodyModel[60].setRotationPoint(66.6F, -14F, 15F);

		bodyModel[61].addShapeBox(0F, 0F, -3F, 3, 8, 3, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Body62
		bodyModel[61].setRotationPoint(66.6F, -14F, 9F);

		bodyModel[62].addBox(3F, -0.5F, 0F, 54, 1, 23, 0F); // Import Body63
		bodyModel[62].setRotationPoint(2F, -26F, 23F);

		bodyModel[63].addBox(3F, -1F, 0F, 2, 1, 5, 0F); // Import Body64
		bodyModel[63].setRotationPoint(53F, -26F, 24F);

		bodyModel[64].addBox(3F, -1F, 0F, 2, 1, 5, 0F); // Import Body65
		bodyModel[64].setRotationPoint(53F, -26F, 40F);

		bodyModel[65].addBox(3F, -0.5F, -23F, 54, 1, 23, 0F); // Import Body66
		bodyModel[65].setRotationPoint(2F, -26F, -23F);

		bodyModel[66].addBox(3F, -1F, -5F, 2, 1, 5, 0F); // Import Body67
		bodyModel[66].setRotationPoint(53F, -26F, -24F);

		bodyModel[67].addBox(3F, -1F, -5F, 2, 1, 5, 0F); // Import Body68
		bodyModel[67].setRotationPoint(53F, -26F, -40F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 21, 27, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F); // Import Body69
		bodyModel[68].setRotationPoint(-13F, -23F, 21F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 27, 27, 0F); // Import Body70
		bodyModel[69].setRotationPoint(-18F, -26F, 21F);

		bodyModel[70].addBox(0F, 0F, 0F, 49, 8, 27, 0F); // Import Body72
		bodyModel[70].setRotationPoint(-67F, -26F, 21F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 49, 19, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F); // Import Body73
		bodyModel[71].setRotationPoint(-67F, -18F, 21F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 49, 19, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F); // Import Body74
		bodyModel[72].setRotationPoint(-67F, -18F, 44F);

		bodyModel[73].addShapeBox(0F, 0F, -27F, 5, 21, 27, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 3F, 0F); // Import Body75
		bodyModel[73].setRotationPoint(-13F, -23F, -21F);

		bodyModel[74].addBox(0F, 0F, -27F, 5, 27, 27, 0F); // Import Body76
		bodyModel[74].setRotationPoint(-18F, -26F, -21F);

		bodyModel[75].addBox(0F, 0F, -27F, 49, 8, 27, 0F); // Import Body78
		bodyModel[75].setRotationPoint(-67F, -26F, -21F);

		bodyModel[76].addShapeBox(0F, 0F, -4F, 49, 19, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F); // Import Body79
		bodyModel[76].setRotationPoint(-67F, -18F, -21F);

		bodyModel[77].addShapeBox(0F, 0F, -4F, 49, 19, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-9F, 0F, 0F); // Import Body80
		bodyModel[77].setRotationPoint(-67F, -18F, -44F);

		bodyModel[78].addBox(0F, 0F, 0F, 23, 12, 42, 0F); // Import Body81
		bodyModel[78].setRotationPoint(-61F, -23F, -21F);
		bodyModel[78].rotateAngleZ = 0.17453293F;

		bodyModel[79].addBox(0F, 0F, 0F, 23, 17, 42, 0F); // Import Body82
		bodyModel[79].setRotationPoint(-61F, -23F, -21F);

		bodyModel[80].addBox(0F, -1F, 0F, 30, 1, 4, 0F); // Import Body83
		bodyModel[80].setRotationPoint(-61F, -23F, -21F);
		bodyModel[80].rotateAngleZ = 0.17453293F;

		bodyModel[81].addBox(0F, -1F, 0F, 30, 1, 4, 0F); // Import Body84
		bodyModel[81].setRotationPoint(-61F, -23F, 17F);
		bodyModel[81].rotateAngleZ = 0.17453293F;

		bodyModel[82].addBox(0F, -1F, 0F, 23, 1, 4, 0F); // Import Body85
		bodyModel[82].setRotationPoint(-61F, -23F, 3F);
		bodyModel[82].rotateAngleZ = 0.17453293F;

		bodyModel[83].addBox(0F, -1F, 0F, 23, 1, 4, 0F); // Import Body86
		bodyModel[83].setRotationPoint(-61F, -23F, -7F);
		bodyModel[83].rotateAngleZ = 0.1745329F;

		bodyModel[84].addBox(0F, -1F, 0F, 4, 1, 10, 0F); // Import Body87
		bodyModel[84].setRotationPoint(-61F, -23F, -17F);
		bodyModel[84].rotateAngleZ = 0.1745329F;

		bodyModel[85].addBox(0F, -1F, 0F, 4, 1, 10, 0F); // Import Body88
		bodyModel[85].setRotationPoint(-61F, -23F, 7F);
		bodyModel[85].rotateAngleZ = 0.1745329F;

		bodyModel[86].addBox(5F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body89
		bodyModel[86].setRotationPoint(-61F, -23F, -17F);
		bodyModel[86].rotateAngleZ = 0.1745329F;

		bodyModel[87].addBox(7F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body90
		bodyModel[87].setRotationPoint(-61F, -23F, -17F);
		bodyModel[87].rotateAngleZ = 0.1745329F;

		bodyModel[88].addBox(9F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body91
		bodyModel[88].setRotationPoint(-61F, -23F, -17F);
		bodyModel[88].rotateAngleZ = 0.1745329F;

		bodyModel[89].addBox(11F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body92
		bodyModel[89].setRotationPoint(-61F, -23F, -17F);
		bodyModel[89].rotateAngleZ = 0.1745329F;

		bodyModel[90].addBox(13F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body93
		bodyModel[90].setRotationPoint(-61F, -23F, -17F);
		bodyModel[90].rotateAngleZ = 0.1745329F;

		bodyModel[91].addBox(15F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body94
		bodyModel[91].setRotationPoint(-61F, -23F, -17F);
		bodyModel[91].rotateAngleZ = 0.1745329F;

		bodyModel[92].addBox(17F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body95
		bodyModel[92].setRotationPoint(-61F, -23F, -17F);
		bodyModel[92].rotateAngleZ = 0.1745329F;

		bodyModel[93].addBox(5F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body96
		bodyModel[93].setRotationPoint(-61F, -23F, 7F);
		bodyModel[93].rotateAngleZ = 0.1745329F;

		bodyModel[94].addBox(7F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body97
		bodyModel[94].setRotationPoint(-61F, -23F, 7F);
		bodyModel[94].rotateAngleZ = 0.1745329F;

		bodyModel[95].addBox(9F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body98
		bodyModel[95].setRotationPoint(-61F, -23F, 7F);
		bodyModel[95].rotateAngleZ = 0.1745329F;

		bodyModel[96].addBox(11F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body99
		bodyModel[96].setRotationPoint(-61F, -23F, 7F);
		bodyModel[96].rotateAngleZ = 0.1745329F;

		bodyModel[97].addBox(13F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body100
		bodyModel[97].setRotationPoint(-61F, -23F, 7F);
		bodyModel[97].rotateAngleZ = 0.1745329F;

		bodyModel[98].addBox(15F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body101
		bodyModel[98].setRotationPoint(-61F, -23F, 7F);
		bodyModel[98].rotateAngleZ = 0.1745329F;

		bodyModel[99].addBox(17F, -0.5F, 0F, 1, 1, 10, 0F); // Import Body102
		bodyModel[99].setRotationPoint(-61F, -23F, 7F);
		bodyModel[99].rotateAngleZ = 0.1745329F;

		bodyModel[100].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Import Body103
		bodyModel[100].setRotationPoint(-55F, -22F, 47.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body104
		bodyModel[101].setRotationPoint(-54F, -21F, 48F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body105
		bodyModel[102].setRotationPoint(-54F, -7F, 48F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body106
		bodyModel[103].setRotationPoint(-22F, -7F, 48F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body108
		bodyModel[104].setRotationPoint(-22F, -21F, 48F);

		bodyModel[105].addBox(0F, 0F, -1F, 37, 19, 1, 0F); // Import Body109
		bodyModel[105].setRotationPoint(-55F, -22F, -47.5F);

		bodyModel[106].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body110
		bodyModel[106].setRotationPoint(-54F, -21F, -48F);

		bodyModel[107].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body111
		bodyModel[107].setRotationPoint(-54F, -7F, -48F);

		bodyModel[108].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body112
		bodyModel[108].setRotationPoint(-22F, -7F, -48F);

		bodyModel[109].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body113
		bodyModel[109].setRotationPoint(-22F, -21F, -48F);

		bodyModel[110].addBox(0F, 0F, 0F, 55, 19, 1, 0F); // Import Body114
		bodyModel[110].setRotationPoint(3F, -22F, 47.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body115
		bodyModel[111].setRotationPoint(4F, -21F, 48F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body116
		bodyModel[112].setRotationPoint(4F, -7F, 48F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body117
		bodyModel[113].setRotationPoint(54F, -7F, 48F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Body118
		bodyModel[114].setRotationPoint(54F, -21F, 48F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F); // Import Body119
		bodyModel[115].setRotationPoint(58F, -22F, 47.5F);

		bodyModel[116].addBox(0F, 0F, -1F, 55, 19, 1, 0F); // Import Body120
		bodyModel[116].setRotationPoint(3F, -22F, -47.5F);

		bodyModel[117].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body121
		bodyModel[117].setRotationPoint(4F, -21F, -48F);

		bodyModel[118].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body122
		bodyModel[118].setRotationPoint(4F, -7F, -48F);

		bodyModel[119].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body123
		bodyModel[119].setRotationPoint(54F, -7F, -48F);

		bodyModel[120].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Import Body124
		bodyModel[120].setRotationPoint(54F, -21F, -48F);

		bodyModel[121].addShapeBox(0F, 0F, 3F, 16, 19, 1, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F); // Import Body125
		bodyModel[121].setRotationPoint(58F, -22F, -51.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 39, 1, 22, 0F); // Import Body126
		bodyModel[122].setRotationPoint(-62F, -27F, 23F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Body127
		bodyModel[123].setRotationPoint(-61F, -27.5F, 24F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Import Body128
		bodyModel[124].setRotationPoint(-61F, -27.5F, 40F);

		bodyModel[125].addBox(0F, 0F, -22F, 39, 1, 22, 0F); // Import Body129
		bodyModel[125].setRotationPoint(-62F, -27F, -23F);

		bodyModel[126].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Body130
		bodyModel[126].setRotationPoint(-61F, -27.5F, -24F);

		bodyModel[127].addBox(0F, 0F, -4F, 2, 1, 4, 0F); // Import Body131
		bodyModel[127].setRotationPoint(-61F, -27.5F, -40F);


		turretModel = new ModelRendererTurbo[59];
		turretModel[0] = new ModelRendererTurbo(this, 0, 1310, textureX, textureY); // Import Turret1
		turretModel[1] = new ModelRendererTurbo(this, 0, 1356, textureX, textureY); // Import Turret2
		turretModel[2] = new ModelRendererTurbo(this, 0, 1356, textureX, textureY); // Import Turret3
		turretModel[3] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Import Turret4
		turretModel[4] = new ModelRendererTurbo(this, 0, 1390, textureX, textureY); // Import Turret5
		turretModel[5] = new ModelRendererTurbo(this, 0, 1435, textureX, textureY); // Import Turret6
		turretModel[6] = new ModelRendererTurbo(this, 0, 1435, textureX, textureY); // Import Turret7
		turretModel[7] = new ModelRendererTurbo(this, 0, 1465, textureX, textureY); // Import Turret8
		turretModel[8] = new ModelRendererTurbo(this, 0, 1495, textureX, textureY); // Import Turret9
		turretModel[9] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Import Turret10
		turretModel[10] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Import Turret11
		turretModel[11] = new ModelRendererTurbo(this, 0, 1510, textureX, textureY); // Import Turret12
		turretModel[12] = new ModelRendererTurbo(this, 0, 1525, textureX, textureY); // Import Turret13
		turretModel[13] = new ModelRendererTurbo(this, 0, 1540, textureX, textureY); // Import Turret14
		turretModel[14] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Import Turret15
		turretModel[15] = new ModelRendererTurbo(this, 0, 1556, textureX, textureY); // Import Turret16
		turretModel[16] = new ModelRendererTurbo(this, 0, 1556, textureX, textureY); // Import Turret17
		turretModel[17] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Import Turret18
		turretModel[18] = new ModelRendererTurbo(this, 0, 1590, textureX, textureY); // Import Turret19
		turretModel[19] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Turret20
		turretModel[20] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Turret21
		turretModel[21] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Turret22
		turretModel[22] = new ModelRendererTurbo(this, 0, 1610, textureX, textureY); // Import Turret23
		turretModel[23] = new ModelRendererTurbo(this, 0, 1614, textureX, textureY); // Import Turret24
		turretModel[24] = new ModelRendererTurbo(this, 0, 1618, textureX, textureY); // Import Turret25
		turretModel[25] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Import Turret26
		turretModel[26] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Import Turret27
		turretModel[27] = new ModelRendererTurbo(this, 0, 1625, textureX, textureY); // Import Turret28
		turretModel[28] = new ModelRendererTurbo(this, 0, 1645, textureX, textureY); // Import Turret29
		turretModel[29] = new ModelRendererTurbo(this, 0, 1662, textureX, textureY); // Import Turret30
		turretModel[30] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import Turret31
		turretModel[31] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import Turret32
		turretModel[32] = new ModelRendererTurbo(this, 0, 1760, textureX, textureY); // Import Turret33
		turretModel[33] = new ModelRendererTurbo(this, 0, 1760, textureX, textureY); // Import Turret34
		turretModel[34] = new ModelRendererTurbo(this, 0, 1790, textureX, textureY); // Import Turret35
		turretModel[35] = new ModelRendererTurbo(this, 0, 1825, textureX, textureY); // Import Turret36
		turretModel[36] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Import Turret37
		turretModel[37] = new ModelRendererTurbo(this, 0, 1870, textureX, textureY); // Import Turret38
		turretModel[38] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Import Turret39
		turretModel[39] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Turret40
		turretModel[40] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Turret41
		turretModel[41] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Turret42
		turretModel[42] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Turret43
		turretModel[43] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Turret44
		turretModel[44] = new ModelRendererTurbo(this, 0, 1890, textureX, textureY); // Import Turret45
		turretModel[45] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Import Turret46
		turretModel[46] = new ModelRendererTurbo(this, 0, 1930, textureX, textureY); // Import Turret47
		turretModel[47] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Turret48
		turretModel[48] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Turret49
		turretModel[49] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Turret50
		turretModel[50] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Turret51
		turretModel[51] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Turret52
		turretModel[52] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Turret53
		turretModel[53] = new ModelRendererTurbo(this, 0, 1970, textureX, textureY); // Import Turret54
		turretModel[54] = new ModelRendererTurbo(this, 0, 1970, textureX, textureY); // Import Turret55
		turretModel[55] = new ModelRendererTurbo(this, 0, 1980, textureX, textureY); // Import Turret56
		turretModel[56] = new ModelRendererTurbo(this, 0, 1995, textureX, textureY); // Import Turret57
		turretModel[57] = new ModelRendererTurbo(this, 0, 2010, textureX, textureY); // Import Turret58
		turretModel[58] = new ModelRendererTurbo(this, 0, 2030, textureX, textureY); // Import Turret59

		turretModel[0].addBox(0F, 0F, 0F, 32, 24, 16, 0F); // Import Turret1
		turretModel[0].setRotationPoint(-18F, -58F, -8F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 55, 24, 4, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret2
		turretModel[1].setRotationPoint(-18F, -58F, -12F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 55, 24, 4, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret3
		turretModel[2].setRotationPoint(-18F, -58F, 8F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 36, 24, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret4
		turretModel[3].setRotationPoint(-18F, -58F, 12F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 36, 24, 12, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret5
		turretModel[4].setRotationPoint(-18F, -58F, -24F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 44, 16, 8, 0F,0F, -4F, 0F,-16F, -4F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret6
		turretModel[5].setRotationPoint(-18F, -50F, -32F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 44, 16, 8, 0F,0F, 0F, 0F,-8F, 0F, 0F,-16F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F); // Import Turret7
		turretModel[6].setRotationPoint(-18F, -50F, 24F);

		turretModel[7].addBox(0F, 0F, 0F, 16, 13, 9, 0F); // Import Turret8
		turretModel[7].setRotationPoint(18F, -50F, 13F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret9
		turretModel[8].setRotationPoint(19F, -54F, 15F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret10
		turretModel[9].setRotationPoint(20F, -53F, 14F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret11
		turretModel[10].setRotationPoint(24F, -53F, 14F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret12
		turretModel[11].setRotationPoint(28F, -53F, 14F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -1F,0F, -2F, -1F,0F, -2F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Turret13
		turretModel[12].setRotationPoint(31F, -54F, 15F);

		turretModel[13].addShapeBox(0F, -2F, 0F, 6, 2, 2, 0F,-1F, 0F, -0.5F,-1F, 0F, -0.5F,-1F, 0F, -0.5F,-1F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret14
		turretModel[13].setRotationPoint(22F, -54F, 16.5F);

		turretModel[14].addBox(0F, -4F, 0F, 4, 2, 1, 0F); // Import Turret15
		turretModel[14].setRotationPoint(23F, -54F, 17F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret16
		turretModel[15].setRotationPoint(34F, -50F, 13F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret17
		turretModel[16].setRotationPoint(34F, -50F, 20F);

		turretModel[17].addBox(0F, 0F, 0F, 5, 2, 9, 0F); // Import Turret18
		turretModel[17].setRotationPoint(34F, -39F, 13F);

		turretModel[18].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import Turret19
		turretModel[18].setRotationPoint(34F, -50F, 15F);

		turretModel[19].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Turret20
		turretModel[19].setRotationPoint(34F, -46F, 16F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret21
		turretModel[20].setRotationPoint(34F, -47F, 16F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Import Turret22
		turretModel[21].setRotationPoint(34F, -45F, 16F);

		turretModel[22].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Import Turret23
		turretModel[22].setRotationPoint(34F, -42F, 16F);

		turretModel[23].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Turret24
		turretModel[23].setRotationPoint(34F, -42F, 18F);

		turretModel[24].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Turret25
		turretModel[24].setRotationPoint(34F, -40F, 17F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret26
		turretModel[25].setRotationPoint(18F, -48F, 12F);

		turretModel[26].addBox(0F, 0F, 0F, 6, 2, 12, 0F); // Import Turret27
		turretModel[26].setRotationPoint(18F, -46F, 12F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Import Turret28
		turretModel[27].setRotationPoint(18F, -44F, 12F);

		turretModel[28].addBox(0F, 0F, 0F, 15, 2, 10, 0F); // Import Turret29
		turretModel[28].setRotationPoint(18F, -40F, 12.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 10, 24, 24, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret30
		turretModel[29].setRotationPoint(-28F, -58F, -12F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 10, 24, 12, 0F,-4F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, -6F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Turret31
		turretModel[30].setRotationPoint(-28F, -58F, -24F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 10, 24, 12, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, -8F, 0F,-4F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Import Turret32
		turretModel[31].setRotationPoint(-28F, -58F, 12F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 10, 16, 8, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,-8F, -4F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F); // Import Turret33
		turretModel[32].setRotationPoint(-28F, -50F, 24F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 10, 16, 8, 0F,-8F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Import Turret34
		turretModel[33].setRotationPoint(-28F, -50F, -32F);

		turretModel[34].addBox(0F, 0F, 0F, 13, 16, 16, 0F); // Import Turret35
		turretModel[34].setRotationPoint(-31F, -52F, -8F);

		turretModel[35].addBox(0F, 0F, 0F, 8, 2, 16, 0F); // Import Turret36
		turretModel[35].setRotationPoint(-39F, -52F, -8F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 8, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F); // Import Turret37
		turretModel[36].setRotationPoint(-39F, -50F, -8F);

		turretModel[37].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Turret38
		turretModel[37].setRotationPoint(-33F, -38F, -8F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 8, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F); // Import Turret39
		turretModel[38].setRotationPoint(-39F, -50F, 6F);

		turretModel[39].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import Turret40
		turretModel[39].setRotationPoint(-33F, -49F, -6F);

		turretModel[40].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import Turret41
		turretModel[40].setRotationPoint(-33F, -47F, -6F);

		turretModel[41].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import Turret42
		turretModel[41].setRotationPoint(-33F, -45F, -6F);

		turretModel[42].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import Turret43
		turretModel[42].setRotationPoint(-33F, -43F, -6F);

		turretModel[43].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import Turret44
		turretModel[43].setRotationPoint(-33F, -41F, -6F);

		turretModel[44].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Import Turret45
		turretModel[44].setRotationPoint(-33F, -39F, -6F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Import Turret46
		turretModel[45].setRotationPoint(-35F, -53F, -5F);

		turretModel[46].addBox(0F, 0F, 0F, 24, 6, 10, 0F); // Import Turret47
		turretModel[46].setRotationPoint(-14F, -64F, -5F);

		turretModel[47].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Turret48
		turretModel[47].setRotationPoint(-13F, -63F, -6F);

		turretModel[48].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Turret49
		turretModel[48].setRotationPoint(-9F, -63F, -6F);

		turretModel[49].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Turret50
		turretModel[49].setRotationPoint(-5F, -63F, -6F);

		turretModel[50].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Turret51
		turretModel[50].setRotationPoint(-1F, -63F, -6F);

		turretModel[51].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Turret52
		turretModel[51].setRotationPoint(3F, -63F, -6F);

		turretModel[52].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Turret53
		turretModel[52].setRotationPoint(7F, -63F, -6F);

		turretModel[53].addBox(0F, 0F, 0F, 26, 5, 2, 0F); // Import Turret54
		turretModel[53].setRotationPoint(-15F, -63F, -4F);

		turretModel[54].addBox(0F, 0F, 0F, 26, 5, 2, 0F); // Import Turret55
		turretModel[54].setRotationPoint(-15F, -63F, 2F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,2F, 0F, 0F); // Import Turret56
		turretModel[55].setRotationPoint(-11F, -68F, -2F);

		turretModel[56].addBox(0F, -8F, 0F, 4, 10, 2, 0F); // Import Turret57
		turretModel[56].setRotationPoint(-9F, -64F, -1F);
		turretModel[56].rotateAngleZ = 0.34906585F;

		turretModel[57].addBox(0F, -18F, 0F, 3, 10, 1, 0F); // Import Turret58
		turretModel[57].setRotationPoint(-8.5F, -64F, -0.5F);
		turretModel[57].rotateAngleZ = 0.3490658F;

		turretModel[58].addBox(0F, -20F, 0F, 4, 2, 2, 0F); // Import Turret59
		turretModel[58].setRotationPoint(-9F, -64F, -1F);
		turretModel[58].rotateAngleZ = 0.34906585F;


		barrelModel = new ModelRendererTurbo[56];
		barrelModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import Gun1
		barrelModel[1] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import Gun2
		barrelModel[2] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Import Gun3
		barrelModel[3] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Import Gun4
		barrelModel[4] = new ModelRendererTurbo(this, 300, 40, textureX, textureY); // Import Gun5
		barrelModel[5] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Import Gun6
		barrelModel[6] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Import Gun7
		barrelModel[7] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Import Gun8
		barrelModel[8] = new ModelRendererTurbo(this, 300, 110, textureX, textureY); // Import Gun9
		barrelModel[9] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Import Gun10
		barrelModel[10] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Import Gun11
		barrelModel[11] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Import Gun12
		barrelModel[12] = new ModelRendererTurbo(this, 300, 135, textureX, textureY); // Import Gun13
		barrelModel[13] = new ModelRendererTurbo(this, 300, 135, textureX, textureY); // Import Gun14
		barrelModel[14] = new ModelRendererTurbo(this, 300, 145, textureX, textureY); // Import Gun15
		barrelModel[15] = new ModelRendererTurbo(this, 300, 155, textureX, textureY); // Import Gun16
		barrelModel[16] = new ModelRendererTurbo(this, 300, 170, textureX, textureY); // Import Gun17
		barrelModel[17] = new ModelRendererTurbo(this, 300, 170, textureX, textureY); // Import Gun18
		barrelModel[18] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Import Gun19
		barrelModel[19] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Import Gun20
		barrelModel[20] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Import Gun21
		barrelModel[21] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Import Gun22
		barrelModel[22] = new ModelRendererTurbo(this, 300, 135, textureX, textureY); // Import Gun23
		barrelModel[23] = new ModelRendererTurbo(this, 300, 135, textureX, textureY); // Import Gun24
		barrelModel[24] = new ModelRendererTurbo(this, 300, 180, textureX, textureY); // Import Gun25
		barrelModel[25] = new ModelRendererTurbo(this, 300, 190, textureX, textureY); // Import Gun26
		barrelModel[26] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Import Gun27
		barrelModel[27] = new ModelRendererTurbo(this, 300, 240, textureX, textureY); // Import GunB1
		barrelModel[28] = new ModelRendererTurbo(this, 300, 215, textureX, textureY); // Import GunB2
		barrelModel[29] = new ModelRendererTurbo(this, 300, 215, textureX, textureY); // Import GunB3
		barrelModel[30] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Import GunB4
		barrelModel[31] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Import GunB5
		barrelModel[32] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Import GunB6
		barrelModel[33] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Import GunB7
		barrelModel[34] = new ModelRendererTurbo(this, 300, 300, textureX, textureY); // Import GunB8
		barrelModel[35] = new ModelRendererTurbo(this, 300, 300, textureX, textureY); // Import GunB9
		barrelModel[36] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Import GunB10
		barrelModel[37] = new ModelRendererTurbo(this, 300, 310, textureX, textureY); // Import GunB11
		barrelModel[38] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB12
		barrelModel[39] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB13
		barrelModel[40] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB14
		barrelModel[41] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB15
		barrelModel[42] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB16
		barrelModel[43] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB17
		barrelModel[44] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB18
		barrelModel[45] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Import GunB19
		barrelModel[46] = new ModelRendererTurbo(this, 300, 330, textureX, textureY); // Import GunB20
		barrelModel[47] = new ModelRendererTurbo(this, 300, 330, textureX, textureY); // Import GunB21
		barrelModel[48] = new ModelRendererTurbo(this, 300, 340, textureX, textureY); // Import GunB22
		barrelModel[49] = new ModelRendererTurbo(this, 300, 340, textureX, textureY); // Import GunB23
		barrelModel[50] = new ModelRendererTurbo(this, 300, 350, textureX, textureY); // Import GunB24
		barrelModel[51] = new ModelRendererTurbo(this, 300, 350, textureX, textureY); // Import GunB25
		barrelModel[52] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Import GunB26
		barrelModel[53] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Import GunB27
		barrelModel[54] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Import GunB28
		barrelModel[55] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Import GunB29

		barrelModel[0].addBox(-3F, -1F, 0F, 6, 2, 12, 0F); // Import Gun1
		barrelModel[0].setRotationPoint(21F, -45F, -24F);

		barrelModel[1].addShapeBox(-3F, -3F, 0F, 6, 2, 12, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun2
		barrelModel[1].setRotationPoint(21F, -45F, -24F);

		barrelModel[2].addShapeBox(-3F, 1F, 0F, 6, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Import Gun3
		barrelModel[2].setRotationPoint(21F, -45F, -24F);

		barrelModel[3].addBox(-3F, -5F, 2F, 8, 9, 8, 0F); // Import Gun4
		barrelModel[3].setRotationPoint(21F, -45F, -24F);

		barrelModel[4].addShapeBox(5F, -5F, 2F, 2, 9, 8, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -1F,0F, -2F, -1F,0F, 0F, 0F); // Import Gun5
		barrelModel[4].setRotationPoint(21F, -45F, -24F);

		barrelModel[5].addBox(7F, -4F, 3F, 4, 6, 6, 0F); // Import Gun6
		barrelModel[5].setRotationPoint(21F, -45F, -24F);

		barrelModel[6].addShapeBox(11F, -3F, 4F, 1, 4, 4, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Import Gun7
		barrelModel[6].setRotationPoint(21F, -45F, -24F);

		barrelModel[7].addBox(18F, -3F, 5F, 4, 1, 2, 0F); // Import Gun8
		barrelModel[7].setRotationPoint(21F, -45F, -24F);

		barrelModel[8].addBox(12F, -3F, 4F, 6, 4, 4, 0F); // Import Gun9
		barrelModel[8].setRotationPoint(21F, -45F, -24F);

		barrelModel[9].addBox(18F, 0F, 5F, 4, 1, 2, 0F); // Import Gun10
		barrelModel[9].setRotationPoint(21F, -45F, -24F);

		barrelModel[10].addBox(22F, 0F, 4F, 2, 1, 4, 0F); // Import Gun11
		barrelModel[10].setRotationPoint(21F, -45F, -24F);

		barrelModel[11].addBox(22F, -3F, 4F, 2, 1, 4, 0F); // Import Gun12
		barrelModel[11].setRotationPoint(21F, -45F, -24F);

		barrelModel[12].addBox(22F, -2F, 4F, 2, 2, 1, 0F); // Import Gun13
		barrelModel[12].setRotationPoint(21F, -45F, -24F);

		barrelModel[13].addBox(22F, -2F, 7F, 2, 2, 1, 0F); // Import Gun14
		barrelModel[13].setRotationPoint(21F, -45F, -24F);

		barrelModel[14].addBox(4F, -9F, 4F, 9, 4, 4, 0F); // Import Gun15
		barrelModel[14].setRotationPoint(21F, -45F, -24F);

		barrelModel[15].addShapeBox(-3F, -10F, 4F, 7, 5, 4, 0F,-2F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun16
		barrelModel[15].setRotationPoint(21F, -45F, -24F);

		barrelModel[16].addShapeBox(-3F, -9F, 2F, 7, 4, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun17
		barrelModel[16].setRotationPoint(21F, -45F, -24F);

		barrelModel[17].addShapeBox(-3F, -9F, 8F, 7, 4, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun18
		barrelModel[17].setRotationPoint(21F, -45F, -24F);

		barrelModel[18].addBox(13F, -9F, 5F, 4, 1, 2, 0F); // Import Gun19
		barrelModel[18].setRotationPoint(21F, -45F, -24F);

		barrelModel[19].addBox(13F, -6F, 5F, 4, 1, 2, 0F); // Import Gun20
		barrelModel[19].setRotationPoint(21F, -45F, -24F);

		barrelModel[20].addBox(17F, -6F, 4F, 2, 1, 4, 0F); // Import Gun21
		barrelModel[20].setRotationPoint(21F, -45F, -24F);

		barrelModel[21].addBox(17F, -9F, 4F, 2, 1, 4, 0F); // Import Gun22
		barrelModel[21].setRotationPoint(21F, -45F, -24F);

		barrelModel[22].addBox(17F, -8F, 4F, 2, 2, 1, 0F); // Import Gun23
		barrelModel[22].setRotationPoint(21F, -45F, -24F);

		barrelModel[23].addBox(17F, -8F, 7F, 2, 2, 1, 0F); // Import Gun24
		barrelModel[23].setRotationPoint(21F, -45F, -24F);

		barrelModel[24].addBox(-3F, 4F, 5F, 8, 3, 2, 0F); // Import Gun25
		barrelModel[24].setRotationPoint(21F, -45F, -24F);

		barrelModel[25].addBox(5F, 5F, 5F, 5, 2, 2, 0F); // Import Gun26
		barrelModel[25].setRotationPoint(21F, -45F, -24F);

		barrelModel[26].addShapeBox(10F, 1F, 5F, 6, 6, 2, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, -2F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, -2F, 0F); // Import Gun27
		barrelModel[26].setRotationPoint(21F, -45F, -24F);

		barrelModel[27].addBox(0F, -12F, -8F, 12, 24, 16, 0F); // Import GunB1
		barrelModel[27].setRotationPoint(14F, -46F, 0F);

		barrelModel[28].addBox(12F, -9F, -8F, 50, 4, 16, 0F); // Import GunB2
		barrelModel[28].setRotationPoint(14F, -46F, 0F);

		barrelModel[29].addBox(12F, 7F, -8F, 50, 4, 16, 0F); // Import GunB3
		barrelModel[29].setRotationPoint(14F, -46F, 0F);

		barrelModel[30].addBox(12F, -5F, -8F, 50, 4, 4, 0F); // Import GunB4
		barrelModel[30].setRotationPoint(14F, -46F, 0F);

		barrelModel[31].addBox(12F, -5F, 4F, 50, 4, 4, 0F); // Import GunB5
		barrelModel[31].setRotationPoint(14F, -46F, 0F);

		barrelModel[32].addBox(12F, 3F, 4F, 50, 4, 4, 0F); // Import GunB6
		barrelModel[32].setRotationPoint(14F, -46F, 0F);

		barrelModel[33].addBox(12F, 3F, -8F, 50, 4, 4, 0F); // Import GunB7
		barrelModel[33].setRotationPoint(14F, -46F, 0F);

		barrelModel[34].addBox(12F, -1F, -6F, 21, 4, 2, 0F); // Import GunB8
		barrelModel[34].setRotationPoint(14F, -46F, 0F);

		barrelModel[35].addBox(12F, -1F, 4F, 21, 4, 2, 0F); // Import GunB9
		barrelModel[35].setRotationPoint(14F, -46F, 0F);

		barrelModel[36].addBox(51F, -1F, 4F, 8, 4, 2, 0F); // Import GunB10
		barrelModel[36].setRotationPoint(14F, -46F, 0F);

		barrelModel[37].addBox(51F, -1F, -6F, 8, 4, 2, 0F); // Import GunB11
		barrelModel[37].setRotationPoint(14F, -46F, 0F);

		barrelModel[38].addBox(47F, -1F, -6F, 2, 4, 2, 0F); // Import GunB12
		barrelModel[38].setRotationPoint(14F, -46F, 0F);

		barrelModel[39].addBox(43F, -1F, -6F, 2, 4, 2, 0F); // Import GunB13
		barrelModel[39].setRotationPoint(14F, -46F, 0F);

		barrelModel[40].addBox(39F, -1F, -6F, 2, 4, 2, 0F); // Import GunB14
		barrelModel[40].setRotationPoint(14F, -46F, 0F);

		barrelModel[41].addBox(35F, -1F, -6F, 2, 4, 2, 0F); // Import GunB15
		barrelModel[41].setRotationPoint(14F, -46F, 0F);

		barrelModel[42].addBox(47F, -1F, 4F, 2, 4, 2, 0F); // Import GunB16
		barrelModel[42].setRotationPoint(14F, -46F, 0F);

		barrelModel[43].addBox(43F, -1F, 4F, 2, 4, 2, 0F); // Import GunB17
		barrelModel[43].setRotationPoint(14F, -46F, 0F);

		barrelModel[44].addBox(39F, -1F, 4F, 2, 4, 2, 0F); // Import GunB18
		barrelModel[44].setRotationPoint(14F, -46F, 0F);

		barrelModel[45].addBox(35F, -1F, 4F, 2, 4, 2, 0F); // Import GunB19
		barrelModel[45].setRotationPoint(14F, -46F, 0F);

		barrelModel[46].addShapeBox(53F, -11F, -8F, 9, 2, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import GunB20
		barrelModel[46].setRotationPoint(14F, -46F, 0F);

		barrelModel[47].addShapeBox(53F, -11F, 4F, 9, 2, 4, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import GunB21
		barrelModel[47].setRotationPoint(14F, -46F, 0F);

		barrelModel[48].addBox(12F, -12F, 4F, 25, 3, 4, 0F); // Import GunB22
		barrelModel[48].setRotationPoint(14F, -46F, 0F);

		barrelModel[49].addBox(12F, -12F, -8F, 25, 3, 4, 0F); // Import GunB23
		barrelModel[49].setRotationPoint(14F, -46F, 0F);

		barrelModel[50].addShapeBox(37F, -12F, -8F, 3, 3, 4, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,0F, 0F, 0F); // Import GunB24
		barrelModel[50].setRotationPoint(14F, -46F, 0F);

		barrelModel[51].addShapeBox(37F, -12F, 4F, 3, 3, 4, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,0F, 0F, 0F); // Import GunB25
		barrelModel[51].setRotationPoint(14F, -46F, 0F);

		barrelModel[52].addBox(15F, -11F, -4F, 3, 2, 8, 0F); // Import GunB26
		barrelModel[52].setRotationPoint(14F, -46F, 0F);

		barrelModel[53].addBox(21F, -11F, -4F, 3, 2, 8, 0F); // Import GunB27
		barrelModel[53].setRotationPoint(14F, -46F, 0F);

		barrelModel[54].addBox(27F, -11F, -4F, 3, 2, 8, 0F); // Import GunB28
		barrelModel[54].setRotationPoint(14F, -46F, 0F);

		barrelModel[55].addBox(33F, -11F, -4F, 3, 2, 8, 0F); // Import GunB29
		barrelModel[55].setRotationPoint(14F, -46F, 0F);


		leftTrackModel = new ModelRendererTurbo[28];
		leftTrackModel[0] = new ModelRendererTurbo(this, 300, 375, textureX, textureY); // Import leftTrack1
		leftTrackModel[1] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Import leftTrack2
		leftTrackModel[2] = new ModelRendererTurbo(this, 300, 430, textureX, textureY); // Import leftTrack3
		leftTrackModel[3] = new ModelRendererTurbo(this, 300, 465, textureX, textureY); // Import leftTrack4
		leftTrackModel[4] = new ModelRendererTurbo(this, 300, 490, textureX, textureY); // Import leftTrack5
		leftTrackModel[5] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // Import leftTrack6
		leftTrackModel[6] = new ModelRendererTurbo(this, 300, 545, textureX, textureY); // Import leftTrack7
		leftTrackModel[7] = new ModelRendererTurbo(this, 300, 570, textureX, textureY); // Import leftTrack8
		leftTrackModel[8] = new ModelRendererTurbo(this, 300, 605, textureX, textureY); // Import leftTrack9
		leftTrackModel[9] = new ModelRendererTurbo(this, 300, 640, textureX, textureY); // Import leftTrack10
		leftTrackModel[10] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import leftTrack11
		leftTrackModel[11] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import leftTrack12
		leftTrackModel[12] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import leftTrack13
		leftTrackModel[13] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import leftTrack14
		leftTrackModel[14] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import leftTrack15
		leftTrackModel[15] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import leftTrack16
		leftTrackModel[16] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import leftTrack17
		leftTrackModel[17] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import leftTrack172
		leftTrackModel[18] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import leftTrack18
		leftTrackModel[19] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import leftTrack19
		leftTrackModel[20] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import leftTrack20
		leftTrackModel[21] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import leftTrack21
		leftTrackModel[22] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import leftTrack22
		leftTrackModel[23] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import leftTrack23
		leftTrackModel[24] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import leftTrack24
		leftTrackModel[25] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import leftTrack27
		leftTrackModel[26] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Box 1
		leftTrackModel[27] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Box 0

		leftTrackModel[0].addBox(-18F, 0F, 0F, 18, 2, 19, 0F); // Import leftTrack1
		leftTrackModel[0].setRotationPoint(102F, -5F, 24.9F);
		leftTrackModel[0].rotateAngleZ = -0.52359878F;

		leftTrackModel[1].addBox(0F, 0F, 0F, 2, 8, 19, 0F); // Import leftTrack2
		leftTrackModel[1].setRotationPoint(100F, -5F, 25F);

		leftTrackModel[2].addBox(-2F, -10F, 0F, 2, 10, 19, 0F); // Import leftTrack3
		leftTrackModel[2].setRotationPoint(95F, 10F, 24.9F);
		leftTrackModel[2].rotateAngleZ = -0.78539816F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 83, 2, 19, 0F); // Import leftTrack4
		leftTrackModel[3].setRotationPoint(12F, 8F, 25F);

		leftTrackModel[4].addBox(-16F, -2F, 0F, 16, 2, 19, 0F); // Import leftTrack5
		leftTrackModel[4].setRotationPoint(12F, 10F, 24.9F);
		leftTrackModel[4].rotateAngleZ = -0.82030475F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 35, 2, 19, 0F); // Import leftTrack6
		leftTrackModel[5].setRotationPoint(-65F, 8F, 25F);

		leftTrackModel[6].addBox(0F, -2F, 0F, 24, 2, 19, 0F); // Import leftTrack7
		leftTrackModel[6].setRotationPoint(-30F, 10F, 24.9F);
		leftTrackModel[6].rotateAngleZ = 0.66322512F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 2, 11, 19, 0F); // Import leftTrack8
		leftTrackModel[7].setRotationPoint(-71F, -10F, 25F);

		leftTrackModel[8].addBox(0F, -10F, 0F, 2, 10, 19, 0F); // Import leftTrack9
		leftTrackModel[8].setRotationPoint(-71F, -10F, 24.9F);
		leftTrackModel[8].rotateAngleZ = -0.57595865F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 2, 11, 19, 0F); // Import leftTrack10
		leftTrackModel[9].setRotationPoint(-71F, 1F, 24.9F);
		leftTrackModel[9].rotateAngleZ = 0.61086524F;

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import leftTrack11
		leftTrackModel[10].setRotationPoint(80F, 3F, 28F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 15, 5, 13, 0F); // Import leftTrack12
		leftTrackModel[11].setRotationPoint(80F, -2F, 28F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import leftTrack13
		leftTrackModel[12].setRotationPoint(80F, -7F, 28F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import leftTrack14
		leftTrackModel[13].setRotationPoint(10F, 3F, 28F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 15, 5, 13, 0F); // Import leftTrack15
		leftTrackModel[14].setRotationPoint(10F, -2F, 28F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import leftTrack16
		leftTrackModel[15].setRotationPoint(10F, -7F, 28F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import leftTrack17
		leftTrackModel[16].setRotationPoint(35F, 3F, 28F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 15, 5, 13, 0F); // Import leftTrack172
		leftTrackModel[17].setRotationPoint(35F, -2F, 28F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import leftTrack18
		leftTrackModel[18].setRotationPoint(35F, -7F, 28F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import leftTrack19
		leftTrackModel[19].setRotationPoint(55F, 3F, 28F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 15, 5, 13, 0F); // Import leftTrack20
		leftTrackModel[20].setRotationPoint(55F, -2F, 28F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import leftTrack21
		leftTrackModel[21].setRotationPoint(-41F, 3F, 28F);

		leftTrackModel[22].addBox(0F, 0F, 0F, 15, 5, 13, 0F); // Import leftTrack22
		leftTrackModel[22].setRotationPoint(-41F, -2F, 28F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import leftTrack23
		leftTrackModel[23].setRotationPoint(-41F, -7F, 28F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import leftTrack24
		leftTrackModel[24].setRotationPoint(-66F, 3F, 28F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import leftTrack27
		leftTrackModel[25].setRotationPoint(-66F, -7F, 28F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		leftTrackModel[26].setRotationPoint(55F, -7F, 28F);

		leftTrackModel[27].addBox(0F, 0F, 0F, 15, 5, 13, 0F); // Box 0
		leftTrackModel[27].setRotationPoint(-66F, -2F, 28F);


		rightTrackModel = new ModelRendererTurbo[28];
		rightTrackModel[0] = new ModelRendererTurbo(this, 300, 375, textureX, textureY); // Import RightTrack1
		rightTrackModel[1] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Import RightTrack2
		rightTrackModel[2] = new ModelRendererTurbo(this, 300, 430, textureX, textureY); // Import RightTrack3
		rightTrackModel[3] = new ModelRendererTurbo(this, 300, 465, textureX, textureY); // Import RightTrack4
		rightTrackModel[4] = new ModelRendererTurbo(this, 300, 490, textureX, textureY); // Import RightTrack5
		rightTrackModel[5] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // Import RightTrack6
		rightTrackModel[6] = new ModelRendererTurbo(this, 300, 545, textureX, textureY); // Import RightTrack7
		rightTrackModel[7] = new ModelRendererTurbo(this, 300, 570, textureX, textureY); // Import RightTrack8
		rightTrackModel[8] = new ModelRendererTurbo(this, 300, 605, textureX, textureY); // Import RightTrack9
		rightTrackModel[9] = new ModelRendererTurbo(this, 300, 640, textureX, textureY); // Import RightTrack10
		rightTrackModel[10] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import RightTrack11
		rightTrackModel[11] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import RightTrack12
		rightTrackModel[12] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import RightTrack13
		rightTrackModel[13] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import RightTrack14
		rightTrackModel[14] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import RightTrack15
		rightTrackModel[15] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import RightTrack16
		rightTrackModel[16] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import RightTrack17
		rightTrackModel[17] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import RightTrack172
		rightTrackModel[18] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import RightTrack18
		rightTrackModel[19] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import RightTrack19
		rightTrackModel[20] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import RightTrack20
		rightTrackModel[21] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import RightTrack21
		rightTrackModel[22] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Import RightTrack22
		rightTrackModel[23] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import RightTrack23
		rightTrackModel[24] = new ModelRendererTurbo(this, 300, 680, textureX, textureY); // Import RightTrack24
		rightTrackModel[25] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Import RightTrack27
		rightTrackModel[26] = new ModelRendererTurbo(this, 300, 725, textureX, textureY); // Box 2
		rightTrackModel[27] = new ModelRendererTurbo(this, 300, 702, textureX, textureY); // Box 1

		rightTrackModel[0].addBox(-18F, 0F, -19F, 18, 2, 19, 0F); // Import RightTrack1
		rightTrackModel[0].setRotationPoint(102F, -5F, -24.9F);
		rightTrackModel[0].rotateAngleZ = -0.52359878F;

		rightTrackModel[1].addBox(0F, 0F, -19F, 2, 8, 19, 0F); // Import RightTrack2
		rightTrackModel[1].setRotationPoint(100F, -5F, -25F);

		rightTrackModel[2].addBox(-2F, -10F, -19F, 2, 10, 19, 0F); // Import RightTrack3
		rightTrackModel[2].setRotationPoint(95F, 10F, -24.9F);
		rightTrackModel[2].rotateAngleZ = -0.7853982F;

		rightTrackModel[3].addBox(0F, 0F, -19F, 83, 2, 19, 0F); // Import RightTrack4
		rightTrackModel[3].setRotationPoint(12F, 8F, -25F);

		rightTrackModel[4].addBox(-16F, -2F, -19F, 16, 2, 19, 0F); // Import RightTrack5
		rightTrackModel[4].setRotationPoint(12F, 10F, -24.9F);
		rightTrackModel[4].rotateAngleZ = -0.8203048F;

		rightTrackModel[5].addBox(0F, 0F, -19F, 35, 2, 19, 0F); // Import RightTrack6
		rightTrackModel[5].setRotationPoint(-65F, 8F, -25F);

		rightTrackModel[6].addBox(0F, -2F, -19F, 24, 2, 19, 0F); // Import RightTrack7
		rightTrackModel[6].setRotationPoint(-30F, 10F, -24.9F);
		rightTrackModel[6].rotateAngleZ = 0.6632251F;

		rightTrackModel[7].addBox(0F, 0F, -19F, 2, 11, 19, 0F); // Import RightTrack8
		rightTrackModel[7].setRotationPoint(-71F, -10F, -25F);

		rightTrackModel[8].addBox(0F, -10F, -19F, 2, 10, 19, 0F); // Import RightTrack9
		rightTrackModel[8].setRotationPoint(-71F, -10F, -24.9F);
		rightTrackModel[8].rotateAngleZ = -0.57595865F;

		rightTrackModel[9].addBox(0F, 0F, -19F, 2, 11, 19, 0F); // Import RightTrack10
		rightTrackModel[9].setRotationPoint(-71F, 1F, -24.9F);
		rightTrackModel[9].rotateAngleZ = 0.6108652F;

		rightTrackModel[10].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import RightTrack11
		rightTrackModel[10].setRotationPoint(80F, 3F, -28F);

		rightTrackModel[11].addBox(0F, 0F, -13F, 15, 5, 13, 0F); // Import RightTrack12
		rightTrackModel[11].setRotationPoint(80F, -2F, -28F);

		rightTrackModel[12].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack13
		rightTrackModel[12].setRotationPoint(80F, -7F, -28F);

		rightTrackModel[13].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import RightTrack14
		rightTrackModel[13].setRotationPoint(10F, 3F, -28F);

		rightTrackModel[14].addBox(0F, 0F, -13F, 15, 5, 13, 0F); // Import RightTrack15
		rightTrackModel[14].setRotationPoint(10F, -2F, -28F);

		rightTrackModel[15].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack16
		rightTrackModel[15].setRotationPoint(10F, -7F, -28F);

		rightTrackModel[16].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import RightTrack17
		rightTrackModel[16].setRotationPoint(35F, 3F, -28F);

		rightTrackModel[17].addBox(0F, 0F, -13F, 15, 5, 13, 0F); // Import RightTrack172
		rightTrackModel[17].setRotationPoint(35F, -2F, -28F);

		rightTrackModel[18].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack18
		rightTrackModel[18].setRotationPoint(35F, -7F, -28F);

		rightTrackModel[19].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import RightTrack19
		rightTrackModel[19].setRotationPoint(55F, 3F, -28F);

		rightTrackModel[20].addBox(0F, 0F, -13F, 15, 5, 13, 0F); // Import RightTrack20
		rightTrackModel[20].setRotationPoint(55F, -2F, -28F);

		rightTrackModel[21].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import RightTrack21
		rightTrackModel[21].setRotationPoint(-41F, 3F, -28F);

		rightTrackModel[22].addBox(0F, 0F, -13F, 15, 5, 13, 0F); // Import RightTrack22
		rightTrackModel[22].setRotationPoint(-41F, -2F, -28F);

		rightTrackModel[23].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack23
		rightTrackModel[23].setRotationPoint(-41F, -7F, -28F);

		rightTrackModel[24].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import RightTrack24
		rightTrackModel[24].setRotationPoint(-66F, 3F, -28F);

		rightTrackModel[25].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import RightTrack27
		rightTrackModel[25].setRotationPoint(-66F, -7F, -28F);

		rightTrackModel[26].addShapeBox(0F, 0F, -13F, 15, 5, 13, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 2
		rightTrackModel[26].setRotationPoint(55F, -7F, -28F);

		rightTrackModel[27].addBox(0F, 0F, -13F, 15, 5, 13, 0F); // Box 1
		rightTrackModel[27].setRotationPoint(-66F, -2F, -28F);



		// Passenger Gun 1
		ModelRendererTurbo[][] gun_0_Model = new ModelRendererTurbo[3][];

		gun_0_Model[0] = new ModelRendererTurbo[0];

		gun_0_Model[1] = new ModelRendererTurbo[0];

		gun_0_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Gun0", gun_0_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
