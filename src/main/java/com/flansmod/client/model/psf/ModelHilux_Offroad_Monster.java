//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.13
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelHilux_Offroad_Monster extends ModelVehicle
{
int textureX = 512;
int textureY = 512;

public ModelHilux_Offroad_Monster()
{
bodyModel = new ModelRendererTurbo[119];
bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 14
bodyModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 15
bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 18
bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 20
bodyModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 21
bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 23
bodyModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 24
bodyModel[11] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 25
bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
bodyModel[13] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 0
bodyModel[14] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 1
bodyModel[15] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 2
bodyModel[16] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 3
bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 5
bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 7
bodyModel[19] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 9
bodyModel[20] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 10
bodyModel[21] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 12
bodyModel[22] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 32
bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
bodyModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 34
bodyModel[25] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 35
bodyModel[26] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 36
bodyModel[27] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 37
bodyModel[28] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 38
bodyModel[29] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 39
bodyModel[30] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 40
bodyModel[31] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 41
bodyModel[32] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 42
bodyModel[33] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 44
bodyModel[34] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 45
bodyModel[35] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 52
bodyModel[36] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 53
bodyModel[37] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 59
bodyModel[38] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 60
bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
bodyModel[40] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 63
bodyModel[41] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 65
bodyModel[42] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 66
bodyModel[43] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 67
bodyModel[44] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 68
bodyModel[45] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 69
bodyModel[46] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 71
bodyModel[47] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 74
bodyModel[48] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 75
bodyModel[49] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 76
bodyModel[50] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 77
bodyModel[51] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 78
bodyModel[52] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 80
bodyModel[53] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 81
bodyModel[54] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 82
bodyModel[55] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 83
bodyModel[56] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 84
bodyModel[57] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 85
bodyModel[58] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 86
bodyModel[59] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 87
bodyModel[60] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 88
bodyModel[61] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 89
bodyModel[62] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 90
bodyModel[63] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 97
bodyModel[64] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 99
bodyModel[65] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 100
bodyModel[66] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 101
bodyModel[67] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 102
bodyModel[68] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 108
bodyModel[69] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 109
bodyModel[70] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 110
bodyModel[71] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 111
bodyModel[72] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 113
bodyModel[73] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 114
bodyModel[74] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 115
bodyModel[75] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 116
bodyModel[76] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 117
bodyModel[77] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 118
bodyModel[78] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 119
bodyModel[79] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 37
bodyModel[80] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 6
bodyModel[81] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 1
bodyModel[82] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 19
bodyModel[83] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 72
bodyModel[84] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 73
bodyModel[85] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 74
bodyModel[86] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 76
bodyModel[87] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 77
bodyModel[88] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 78
bodyModel[89] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 79
bodyModel[90] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 80
bodyModel[91] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 82
bodyModel[92] = new ModelRendererTurbo(this, 129, 329, textureX, textureY); // Box 83
bodyModel[93] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 84
bodyModel[94] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Box 85
bodyModel[95] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 86
bodyModel[96] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 87
bodyModel[97] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Box 88
bodyModel[98] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 89
bodyModel[99] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 90
bodyModel[100] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Box 91
bodyModel[101] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 92
bodyModel[102] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Box 93
bodyModel[103] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 94
bodyModel[104] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 95
bodyModel[105] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 96
bodyModel[106] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 97
bodyModel[107] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 98
bodyModel[108] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 99
bodyModel[109] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 100
bodyModel[110] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 101
bodyModel[111] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 0
bodyModel[112] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 1
bodyModel[113] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 2
bodyModel[114] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 3
bodyModel[115] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 4
bodyModel[116] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 8
bodyModel[117] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 9
bodyModel[118] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 10

bodyModel[0].addFlexBox(0F, 0F, 0F, 53, 8, 2, 0F, -3.00F, -3.00F, 0.00F, -0.40F, ModelRendererTurbo.MR_BOTTOM); // Box 10
bodyModel[0].setRotationPoint(-30F, -30F, 20.4F);

bodyModel[1].addBox(0F, 0F, 0F, 13, 2, 44, 0F); // Box 11
bodyModel[1].setRotationPoint(22F, -30F, -21F);

bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 7, 44, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 12
bodyModel[2].setRotationPoint(37F, -28F, -21F);

bodyModel[3].addFlexBox(0F, 0F, 0F, 53, 8, 2, 0F, -3.00F, -3.00F, -0.40F, 0.00F, ModelRendererTurbo.MR_BOTTOM); // Box 14
bodyModel[3].setRotationPoint(-30F, -30F, -20.6F);

bodyModel[4].addFlexBox(0F, 0F, 0F, 2, 8, 44, 0F, -3.00F, 3.00F, 0.00F, 0F, ModelRendererTurbo.MR_TOP); // Box 15
bodyModel[4].setRotationPoint(19F, -30F, -21F);

bodyModel[5].addFlexBox(0F, 0F, 0F, 2, 2, 2, 0F, 1.00F, -1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 18
bodyModel[5].setRotationPoint(34F, -30F, 21F);

bodyModel[6].addFlexBox(0F, 0F, 0F, 2, 2, 2, 0F, 1.00F, -1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 20
bodyModel[6].setRotationPoint(34F, -30F, -21F);

bodyModel[7].addBox(-2F, -7F, 0F, 2, 5, 40, 0F); // Box 21
bodyModel[7].setRotationPoint(43F, -26F, -19F);

bodyModel[8].addBox(-2F, -7F, 0F, 20, 5, 1, 0F); // Box 22
bodyModel[8].setRotationPoint(24F, -26F, -20F);

bodyModel[9].addFlexBox(-2F, -7F, 0F, 1, 5, 1, 0F, 0F, 0.00F, -1.00F, 0F, ModelRendererTurbo.MR_LEFT); // Box 23
bodyModel[9].setRotationPoint(44F, -26F, -20F);

bodyModel[10].addFlexBox(-2F, -7F, 0F, 1, 5, 1, 0F, 0F, 0.00F, 0.00F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 24
bodyModel[10].setRotationPoint(44F, -26F, 21F);

bodyModel[11].addBox(-2F, -7F, 0F, 20, 5, 1, 0F); // Box 25
bodyModel[11].setRotationPoint(24F, -26F, 21F);

bodyModel[12].addFlexBox(-2F, -7F, 0F, 4, 1, 42, 0F, -2.00F, 2.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_LEFT); // Box 28
bodyModel[12].setRotationPoint(40F, -29F, -20F);

bodyModel[13].addFlexBox(-2F, -7F, 0F, 5, 1, 42, 0F, -1.00F, 1.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 0
bodyModel[13].setRotationPoint(35F, -30F, -20F);

bodyModel[14].addFlexBox(-2F, -7F, 0F, 11, 1, 42, 0F, -1.00F, 1.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 1
bodyModel[14].setRotationPoint(24F, -31F, -20F);

bodyModel[15].addBox(-2F, -7F, 0F, 5, 1, 42, 0F); // Box 2
bodyModel[15].setRotationPoint(19F, -31F, -20F);

bodyModel[16].addFlexBox(-2F, -7F, 0F, 1, 1, 40, 0F, 0F, -1.00F, 0.00F, 0F, ModelRendererTurbo.MR_TOP); // Box 3
bodyModel[16].setRotationPoint(44F, -27F, -19F);

bodyModel[17].addShapeBox(-2F, -6F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
bodyModel[17].setRotationPoint(35F, -30F, -20F);

bodyModel[18].addShapeBox(-2F, -6F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
bodyModel[18].setRotationPoint(24F, -31F, 21F);

bodyModel[19].addShapeBox(-2F, -7F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
bodyModel[19].setRotationPoint(40F, -28F, 21F);

bodyModel[20].addFlexBox(0F, 0F, 0F, 2, 12, 2, 0F, 9.00F, -9.00F, 3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 10
bodyModel[20].setRotationPoint(16F, -50F, 20F);

bodyModel[21].addBox(-2F, -7F, 0F, 2, 4, 40, 0F); // Box 12
bodyModel[21].setRotationPoint(43.1F, -25F, -19F);

bodyModel[22].addFlexBox(0F, 0F, 0F, 78, 8, 2, 0F, 0F, 0.00F, 0.00F, -0.40F, ModelRendererTurbo.MR_TOP); // Box 32
bodyModel[22].setRotationPoint(-56F, -38F, 20.4F);

bodyModel[23].addFlexBox(0F, 0F, 0F, 2, 12, 1, 0F, 0F, 0.00F, 3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 33
bodyModel[23].setRotationPoint(-7F, -50F, 21F);

bodyModel[24].addFlexBox(0F, 0F, 0F, 4, 12, 1, 0F, -2.00F, 0.00F, 3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 34
bodyModel[24].setRotationPoint(-20F, -50F, 21F);

bodyModel[25].addFlexBox(0F, 0F, 0F, 2, 12, 2, 0F, 9.00F, -9.00F, -3.00F, 3.00F, ModelRendererTurbo.MR_TOP); // Box 35
bodyModel[25].setRotationPoint(16F, -50F, -20F);

bodyModel[26].addFlexBox(0F, 0F, 0F, 2, 12, 1, 0F, 0F, 0.00F, -3.00F, 3.00F, ModelRendererTurbo.MR_TOP); // Box 36
bodyModel[26].setRotationPoint(-7F, -50F, -20F);

bodyModel[27].addFlexBox(0F, 0F, 0F, 78, 8, 2, 0F, 0F, 0.00F, -0.60F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 37
bodyModel[27].setRotationPoint(-56F, -38F, -20.6F);

bodyModel[28].addFlexBox(0F, 0F, 0F, 4, 12, 1, 0F, -2.00F, 0.00F, -3.00F, 3.00F, ModelRendererTurbo.MR_TOP); // Box 38
bodyModel[28].setRotationPoint(-20F, -50F, -20F);

bodyModel[29].addFlexBox(0F, 0F, 0F, 2, 13, 2, 0F, -2.00F, 0.00F, -2.00F, 2.00F, ModelRendererTurbo.MR_TOP); // Box 39
bodyModel[29].setRotationPoint(-20F, -50F, -19F);

bodyModel[30].addFlexBox(0F, 0F, 0F, 2, 13, 2, 0F, -2.00F, 0.00F, 2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 40
bodyModel[30].setRotationPoint(-20F, -50F, 19F);

bodyModel[31].addFlexBox(0F, 0F, 0F, 27, 1, 36, 0F, 0.00F, -3.00F, -1.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 41
bodyModel[31].setRotationPoint(-18F, -51F, -17F);

bodyModel[32].addFlexBox(0F, 0F, 0F, 2, 8, 44, 0F, 3.00F, -3.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 42
bodyModel[32].setRotationPoint(-27F, -30F, -21F);

bodyModel[33].addBox(0F, 0F, 0F, 13, 2, 44, 0F); // Box 44
bodyModel[33].setRotationPoint(-42F, -30F, -21F);

bodyModel[34].addFlexBox(0F, 0F, 0F, 2, 7, 44, 0F, -3.00F, 3.00F, 0.00F, 0F, ModelRendererTurbo.MR_TOP); // Box 45
bodyModel[34].setRotationPoint(-45.5F, -30F, -21F);

bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 32, 0F); // Box 52
bodyModel[35].setRotationPoint(29.5F, -5F, -15F);

bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 32, 0F); // Box 53
bodyModel[36].setRotationPoint(-40F, -5.5F, -15F);

bodyModel[37].addFlexBox(0F, 0F, 0F, 14, 7, 2, 0F, 0F, -3.00F, -0.40F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 59
bodyModel[37].setRotationPoint(-56F, -30F, -20.6F);

bodyModel[38].addBox(0F, 0F, 0F, 46, 1, 40, 0F); // Box 60
bodyModel[38].setRotationPoint(-26F, -23F, -19F);

bodyModel[39].addFlexBox(0F, 0F, 41F, 14, 7, 2, 0F, 0.00F, -3.00F, 0.00F, -0.40F, ModelRendererTurbo.MR_BOTTOM); // Box 61
bodyModel[39].setRotationPoint(-56F, -30F, -20.6F);

bodyModel[40].addFlexBox(0F, 0F, 0F, 1, 12, 42, 0F, 1.00F, 2.00F, 0.00F, 0F, ModelRendererTurbo.MR_LEFT); // Box 63
bodyModel[40].setRotationPoint(-57F, -37F, -20F);

bodyModel[41].addBox(0F, 0F, 0F, 2, 15, 40, 0F); // Box 65
bodyModel[41].setRotationPoint(-19.9F, -38F, -19F);

bodyModel[42].addBox(0F, 0F, 0F, 11, 1, 40, 0F); // Box 66
bodyModel[42].setRotationPoint(-56F, -24F, -19F);

bodyModel[43].addBox(0F, 0F, 0F, 36, 1, 40, 0F); // Box 67
bodyModel[43].setRotationPoint(-56F, -30.1F, -19F);

bodyModel[44].addBox(0F, 0F, 0F, 4, 4, 13, 0F); // Box 68
bodyModel[44].setRotationPoint(-41F, -6.5F, -6F);

bodyModel[45].addBox(0F, 0F, 0F, 4, 4, 13, 0F); // Box 69
bodyModel[45].setRotationPoint(28.5F, -6F, -6F);

bodyModel[46].addBox(-2F, 0F, 0F, 2, 24, 2, 0F); // Box 71
bodyModel[46].setRotationPoint(-34.5F, -28.5F, -11.5F);
bodyModel[46].rotateAngleZ = -0.13962634F;

bodyModel[47].addBox(0F, 0F, 0F, 2, 24, 2, 0F); // Box 74
bodyModel[47].setRotationPoint(27.5F, -28.5F, -11.5F);
bodyModel[47].rotateAngleZ = 0.06981317F;

bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 75
bodyModel[48].setRotationPoint(-3F, -36F, 21.3F);

bodyModel[49].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 76
bodyModel[49].setRotationPoint(-3F, -36F, -20.4F);

bodyModel[50].addBox(0F, 0F, 0F, 50, 2, 1, 0F); // Box 77
bodyModel[50].setRotationPoint(-28F, -29F, 21.6F);

bodyModel[51].addBox(0F, 0F, 0F, 50, 2, 1, 0F); // Box 78
bodyModel[51].setRotationPoint(-28F, -29F, -20.8F);

bodyModel[52].addBox(0F, 0F, 0F, 2, 33, 2, 0F); // Box 80
bodyModel[52].setRotationPoint(-22.5F, -63F, 17.5F);

bodyModel[53].addBox(0F, 0F, 0F, 2, 33, 2, 0F); // Box 81
bodyModel[53].setRotationPoint(-22.5F, -63F, -17.5F);

bodyModel[54].addFlexBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.00F, 0.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 82
bodyModel[54].setRotationPoint(-22.5F, -65F, 17.5F);

bodyModel[55].addFlexBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.00F, -2.00F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 83
bodyModel[55].setRotationPoint(-22.5F, -65F, -17.5F);

bodyModel[56].addBox(0F, -1F, 0F, 2, 2, 33, 0F); // Box 84
bodyModel[56].setRotationPoint(-22.5F, -53F, -15.5F);

bodyModel[57].addFlexBox(0F, 0F, 0F, 28, 2, 2, 0F, -5.00F, 5.00F, 0.00F, 0F, ModelRendererTurbo.MR_RIGHT); // Box 85
bodyModel[57].setRotationPoint(-50.5F, -51F, 17.5F);

bodyModel[58].addFlexBox(0F, 0F, 0F, 2, 14, 2, 0F, -4.00F, 4.00F, 0.00F, 0F, ModelRendererTurbo.MR_TOP); // Box 86
bodyModel[58].setRotationPoint(-56.5F, -44F, 17.5F);

bodyModel[59].addFlexBox(0F, 0F, 0F, 2, 2, 2, 0F, -2.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 87
bodyModel[59].setRotationPoint(-52.5F, -46F, 17.5F);

bodyModel[60].addFlexBox(0F, 0F, 0F, 28, 2, 2, 0F, -5.00F, 5.00F, 0.00F, 0F, ModelRendererTurbo.MR_RIGHT); // Box 88
bodyModel[60].setRotationPoint(-50.5F, -51F, -17.5F);

bodyModel[61].addFlexBox(0F, 0F, 0F, 2, 2, 2, 0F, -2.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 89
bodyModel[61].setRotationPoint(-52.5F, -46F, -17.5F);

bodyModel[62].addFlexBox(0F, 0F, 0F, 2, 14, 2, 0F, -4.00F, 4.00F, 0.00F, 0F, ModelRendererTurbo.MR_TOP); // Box 90
bodyModel[62].setRotationPoint(-56.5F, -44F, -17.5F);

bodyModel[63].addFlexBox(0F, 0F, 0F, 2, 12, 1, 0F, -2.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 97
bodyModel[63].setRotationPoint(-20F, -50F, 0.5F);

bodyModel[64].addFlexBox(0F, 0F, 0F, 2, 12, 1, 0F, -2.00F, 0.00F, 1.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 99
bodyModel[64].setRotationPoint(-20F, -50F, 8.5F);

bodyModel[65].addFlexBox(0F, 0F, 0F, 2, 12, 1, 0F, -2.00F, 0.00F, -1.00F, 1.00F, ModelRendererTurbo.MR_TOP); // Box 100
bodyModel[65].setRotationPoint(-20F, -50F, -7.5F);

bodyModel[66].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 101
bodyModel[66].setRotationPoint(-57.1F, -35F, 20.2F);

bodyModel[67].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 102
bodyModel[67].setRotationPoint(-57.1F, -35F, -20.1F);

bodyModel[68].addFlexBox(0F, -1F, 0F, 1, 1, 2, 0F, 0.00F, 0.00F, 0.00F, 1.00F, ModelRendererTurbo.MR_TOP); // Box 108
bodyModel[68].setRotationPoint(16F, -37F, 22F);
bodyModel[68].rotateAngleX = 0.12217305F;

bodyModel[69].addFlexBox(0F, -1F, -2F, 1, 1, 2, 0F, 0.00F, 0.00F, 1.00F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 109
bodyModel[69].setRotationPoint(16F, -37F, -20F);
bodyModel[69].rotateAngleX = -0.10471976F;

bodyModel[70].addFlexBox(0F, -2F, 0F, 1, 3, 4, 0F, -1.00F, -1.00F, -1.00F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 110
bodyModel[70].setRotationPoint(16F, -38F, 24F);
bodyModel[70].rotateAngleX = 0.06981317F;
bodyModel[70].rotateAngleY = 0.17453293F;

bodyModel[71].addFlexBox(0F, -3F, -4F, 1, 3, 4, 0F, -1.00F, -1.00F, -1.00F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 111
bodyModel[71].setRotationPoint(16F, -37F, -22F);
bodyModel[71].rotateAngleX = -0.06981317F;
bodyModel[71].rotateAngleY = -0.17453293F;

bodyModel[72].addFlexBox(0F, 0F, 0F, 3, 1, 40, 0F, 2.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 113
bodyModel[72].setRotationPoint(14F, -38F, -19F);

bodyModel[73].addBox(0F, 0F, 0F, 9, 6, 40, 0F); // Box 114
bodyModel[73].setRotationPoint(12F, -37F, -19F);
bodyModel[73].rotateAngleZ = -0.12217305F;

bodyModel[74].addFlexBox(0F, 0F, 3F, 24, 8, 5, 0F, -3.00F, 0.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 115
bodyModel[74].setRotationPoint(-3F, -31F, -4.5F);

bodyModel[75].addBox(0F, 0F, 0F, 9, 5, 15, 0F); // Box 116
bodyModel[75].setRotationPoint(-5F, -28F, 4.5F);

bodyModel[76].addBox(0F, 0F, 0F, 11, 5, 15, 0F); // Box 117
bodyModel[76].setRotationPoint(-7F, -28F, -17.5F);

bodyModel[77].addFlexBox(0F, 0F, 0F, 3, 17, 15, 0F, -3.00F, 3.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 118
bodyModel[77].setRotationPoint(-10F, -40F, 4.5F);

bodyModel[78].addFlexBox(0F, 0F, 0F, 3, 17, 15, 0F, -3.00F, 3.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 119
bodyModel[78].setRotationPoint(-10F, -40F, -17.5F);

bodyModel[79].addBox(0F, 0F, -5F, 15, 8, 5, 0F); // Box 37
bodyModel[79].setRotationPoint(6F, -31F, 3.5F);
bodyModel[79].rotateAngleY = 0.55850536F;

bodyModel[80].addBox(-7F, -2F, 0F, 7, 2, 2, 0F); // Box 6
bodyModel[80].setRotationPoint(13F, -33F, 11F);
bodyModel[80].rotateAngleZ = -0.34906585F;

bodyModel[81].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Box 1
bodyModel[81].setRotationPoint(5F, -31F, 0.5F);
bodyModel[81].rotateAngleZ = 0.26179939F;

bodyModel[82].addBox(-2F, 0F, 0F, 2, 24, 2, 0F); // Box 19
bodyModel[82].setRotationPoint(-34.5F, -28.5F, 11.5F);
bodyModel[82].rotateAngleZ = -0.13962634F;

bodyModel[83].addBox(0F, 0F, 0F, 2, 24, 2, 0F); // Box 72
bodyModel[83].setRotationPoint(27.5F, -28.5F, 10.5F);
bodyModel[83].rotateAngleZ = 0.06981317F;

bodyModel[84].addBox(-26F, -2F, -2F, 26, 2, 2, 0F); // Box 73
bodyModel[84].setRotationPoint(30F, -3F, 12.5F);
bodyModel[84].rotateAngleY = 0.05235988F;
bodyModel[84].rotateAngleZ = -0.33161256F;

bodyModel[85].addShapeBox(0F, 0F, 0F, 42, 12, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -2F, -14F, 0F, -2F, -14F, 0F, -2F, -14F, 0F, -2F); // Box 74
bodyModel[85].setRotationPoint(-24F, -22F, -17F);

bodyModel[86].addBox(-26F, -2F, -2F, 26, 2, 2, 0F); // Box 76
bodyModel[86].setRotationPoint(30F, -3F, -9.5F);
bodyModel[86].rotateAngleY = -0.05235988F;
bodyModel[86].rotateAngleZ = -0.33161256F;

bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 77
bodyModel[87].setRotationPoint(44F, -28F, -21F);

bodyModel[88].addBox(0F, -2F, 0F, 28, 2, 2, 0F); // Box 78
bodyModel[88].setRotationPoint(-38F, -3.5F, -11.5F);
bodyModel[88].rotateAngleY = 0.05235988F;
bodyModel[88].rotateAngleZ = 0.26179939F;

bodyModel[89].addBox(0F, -2F, -2F, 28, 2, 2, 0F); // Box 79
bodyModel[89].setRotationPoint(-38F, -3.5F, 13.5F);
bodyModel[89].rotateAngleY = -0.05235988F;
bodyModel[89].rotateAngleZ = 0.26179939F;

bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
bodyModel[90].setRotationPoint(44F, -35F, 14F);

bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
bodyModel[91].setRotationPoint(44F, -35F, -14F);

bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 32, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
bodyModel[92].setRotationPoint(44F, -37F, -15F);

bodyModel[93].addShapeBox(0F, 0F, 0F, 39, 2, 2, 0F,-0.5F, 17F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 17F, -2.5F, -0.5F, -17F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -17F, -2.5F); // Box 84
bodyModel[93].setRotationPoint(5F, -37F, -15F);

bodyModel[94].addBox(0F, -1F, 0F, 2, 2, 33, 0F); // Box 85
bodyModel[94].setRotationPoint(3.5F, -53F, -15.5F);

bodyModel[95].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 86
bodyModel[95].setRotationPoint(-20.5F, -54F, -17.5F);

bodyModel[96].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 87
bodyModel[96].setRotationPoint(-20.5F, -54F, 17.5F);

bodyModel[97].addShapeBox(0F, 0F, 0F, 39, 2, 2, 0F,-0.5F, 17F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 17F, 2.5F, -0.5F, -17F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -17F, 2.5F); // Box 88
bodyModel[97].setRotationPoint(5F, -37F, 15F);

bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -4F, 0F, 8F, 4F, 0F, 0F, 0F); // Box 89
bodyModel[98].setRotationPoint(46F, -35F, -15F);

bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -8F, 4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 4F, 0F, 8F, -4F, 0F, 0F, 0F); // Box 90
bodyModel[99].setRotationPoint(46F, -35F, 15F);

bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F); // Box 91
bodyModel[100].setRotationPoint(51F, -27F, -10F);

bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 7, 22, 0F,5F, 0F, 0F, -5F, 0F, 3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
bodyModel[101].setRotationPoint(50.8F, -35F, -10F);

bodyModel[102].addBox(0F, -1F, 0F, 2, 2, 33, 0F); // Box 93
bodyModel[102].setRotationPoint(-22.5F, -64F, -15.5F);

bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 94
bodyModel[103].setRotationPoint(-8F, -22F, -20F);

bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 95
bodyModel[104].setRotationPoint(11F, -22F, -20F);

bodyModel[105].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 96
bodyModel[105].setRotationPoint(-5F, -16F, -21F);

bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 97
bodyModel[106].setRotationPoint(-5F, -20F, -20F);

bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 2F); // Box 98
bodyModel[107].setRotationPoint(11F, -22F, 21F);

bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 2F); // Box 99
bodyModel[108].setRotationPoint(-8F, -22F, 21F);

bodyModel[109].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 100
bodyModel[109].setRotationPoint(-5F, -20F, 21F);

bodyModel[110].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 101
bodyModel[110].setRotationPoint(-5F, -16F, 22F);

bodyModel[111].addShapeBox(-2F, -7F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
bodyModel[111].setRotationPoint(40F, -28F, -20F);

bodyModel[112].addShapeBox(0F, -1F, 0F, 2, 5, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 1
bodyModel[112].setRotationPoint(-20.5F, -65F, -14.5F);

bodyModel[113].addShapeBox(0F, -1F, 0F, 2, 5, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 2
bodyModel[113].setRotationPoint(-20.5F, -65F, 10.5F);

bodyModel[114].addShapeBox(0F, -1F, 0F, 2, 4, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 3
bodyModel[114].setRotationPoint(-20.5F, -65F, 2.5F);

bodyModel[115].addShapeBox(0F, -1F, 0F, 2, 4, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 4
bodyModel[115].setRotationPoint(-20.5F, -65F, -5.5F);

bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 8
bodyModel[116].setRotationPoint(-59F, -26F, -21F);

bodyModel[117].addShapeBox(-2F, -6F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
bodyModel[117].setRotationPoint(24F, -31F, -20F);

bodyModel[118].addShapeBox(-2F, -6F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
bodyModel[118].setRotationPoint(35F, -30F, 21F);


leftFrontWheelModel = new ModelRendererTurbo[16];
leftFrontWheelModel[0] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 38
leftFrontWheelModel[1] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 39
leftFrontWheelModel[2] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 40
leftFrontWheelModel[3] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 41
leftFrontWheelModel[4] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 42
leftFrontWheelModel[5] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 43
leftFrontWheelModel[6] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 44
leftFrontWheelModel[7] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 45
leftFrontWheelModel[8] = new ModelRendererTurbo(this, 369, 273, textureX, textureY); // Box 46
leftFrontWheelModel[9] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 47
leftFrontWheelModel[10] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 48
leftFrontWheelModel[11] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 49
leftFrontWheelModel[12] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 50
leftFrontWheelModel[13] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 51
leftFrontWheelModel[14] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 52
leftFrontWheelModel[15] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 53

leftFrontWheelModel[0].addShapeBox(-14.5F, -3.5F, -15F, 8, 7, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
leftFrontWheelModel[0].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[1].addShapeBox(-14.5F, -8.5F, -15F, 8, 5, 15, 0F,-2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
leftFrontWheelModel[1].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[2].addShapeBox(-12.5F, -12.5F, -15F, 7, 7, 15, 0F,0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 40
leftFrontWheelModel[2].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[3].addShapeBox(-8.5F, -14.5F, -15F, 5, 8, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F); // Box 41
leftFrontWheelModel[3].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[4].addShapeBox(-3.5F, -14.5F, -15F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 42
leftFrontWheelModel[4].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[5].addShapeBox(3.5F, -14.5F, -15F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F); // Box 43
leftFrontWheelModel[5].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[6].addShapeBox(5.5F, -12.5F, -15F, 7, 7, 15, 0F,-3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 44
leftFrontWheelModel[6].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[7].addShapeBox(6.5F, -8.5F, -15F, 8, 5, 15, 0F,1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 45
leftFrontWheelModel[7].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[8].addShapeBox(6.5F, -3.5F, -15F, 8, 7, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
leftFrontWheelModel[8].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[9].addShapeBox(6.5F, 3.5F, -15F, 8, 5, 15, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F); // Box 47
leftFrontWheelModel[9].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[10].addShapeBox(5.5F, 5.5F, -15F, 7, 7, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F); // Box 48
leftFrontWheelModel[10].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[11].addShapeBox(3.5F, 6.5F, -15F, 5, 8, 15, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
leftFrontWheelModel[11].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[12].addShapeBox(-3.5F, 6.5F, -15F, 7, 8, 15, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
leftFrontWheelModel[12].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[13].addShapeBox(-8.5F, 6.5F, -15F, 5, 8, 15, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 51
leftFrontWheelModel[13].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[14].addShapeBox(-12.5F, 5.5F, -15F, 7, 7, 15, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F); // Box 52
leftFrontWheelModel[14].setRotationPoint(31F, -4.5F, -14F);

leftFrontWheelModel[15].addShapeBox(-14.5F, 3.5F, -15F, 8, 5, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F); // Box 53
leftFrontWheelModel[15].setRotationPoint(31F, -4.5F, -14F);


rightFrontWheelModel = new ModelRendererTurbo[18];
rightFrontWheelModel[0] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 55
rightFrontWheelModel[1] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 56
rightFrontWheelModel[2] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 57
rightFrontWheelModel[3] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 58
rightFrontWheelModel[4] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 59
rightFrontWheelModel[5] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 60
rightFrontWheelModel[6] = new ModelRendererTurbo(this, 97, 305, textureX, textureY); // Box 61
rightFrontWheelModel[7] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 62
rightFrontWheelModel[8] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Box 63
rightFrontWheelModel[9] = new ModelRendererTurbo(this, 241, 305, textureX, textureY); // Box 64
rightFrontWheelModel[10] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 65
rightFrontWheelModel[11] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Box 66
rightFrontWheelModel[12] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 67
rightFrontWheelModel[13] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 68
rightFrontWheelModel[14] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 69
rightFrontWheelModel[15] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 70
rightFrontWheelModel[16] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 71
rightFrontWheelModel[17] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 5

rightFrontWheelModel[0].addShapeBox(6.5F, -8.5F, 0F, 8, 5, 15, 0F,1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 55
rightFrontWheelModel[0].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[1].addShapeBox(-3.5F, 6.5F, 0F, 7, 8, 15, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
rightFrontWheelModel[1].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[2].addShapeBox(3.5F, 6.5F, 0F, 5, 8, 15, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 57
rightFrontWheelModel[2].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[3].addShapeBox(5.5F, 5.5F, 0F, 7, 7, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F); // Box 58
rightFrontWheelModel[3].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[4].addShapeBox(6.5F, -3.5F, 0F, 8, 7, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 59
rightFrontWheelModel[4].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[5].addShapeBox(5.5F, -12.5F, 0F, 7, 7, 15, 0F,-3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 60
rightFrontWheelModel[5].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[6].addShapeBox(3.5F, -14.5F, 0F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F); // Box 61
rightFrontWheelModel[6].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[7].addShapeBox(-3.5F, -14.5F, 0F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 62
rightFrontWheelModel[7].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[8].addShapeBox(-8.5F, -14.5F, 0F, 5, 8, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F); // Box 63
rightFrontWheelModel[8].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[9].addShapeBox(-12.5F, -12.5F, 0F, 7, 7, 15, 0F,0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 64
rightFrontWheelModel[9].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[10].addShapeBox(-14.5F, -8.5F, 0F, 8, 5, 15, 0F,-2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 65
rightFrontWheelModel[10].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[11].addShapeBox(-14.5F, -3.5F, 0F, 8, 7, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 66
rightFrontWheelModel[11].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[12].addShapeBox(-14.5F, 3.5F, 0F, 8, 5, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F); // Box 67
rightFrontWheelModel[12].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[13].addShapeBox(-12.5F, 5.5F, 0F, 7, 7, 15, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F); // Box 68
rightFrontWheelModel[13].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[14].addShapeBox(-8.5F, 6.5F, 0F, 5, 8, 15, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 69
rightFrontWheelModel[14].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[15].addBox(-6.5F, -6.5F, 1F, 13, 13, 6, 0F); // Box 70
rightFrontWheelModel[15].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[16].addShapeBox(6.5F, 3.5F, 0F, 8, 5, 15, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F); // Box 71
rightFrontWheelModel[16].setRotationPoint(31F, -4.5F, 16F);

rightFrontWheelModel[17].addBox(-6.5F, -6.5F, -7F, 13, 13, 6, 0F); // Box 5
rightFrontWheelModel[17].setRotationPoint(31F, -4.5F, -14F);


leftBackWheelModel = new ModelRendererTurbo[33];
leftBackWheelModel[0] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 27
leftBackWheelModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 30
leftBackWheelModel[2] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 34
leftBackWheelModel[3] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 4
leftBackWheelModel[4] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 5
leftBackWheelModel[5] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 6
leftBackWheelModel[6] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 7
leftBackWheelModel[7] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 9
leftBackWheelModel[8] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 10
leftBackWheelModel[9] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 11
leftBackWheelModel[10] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 13
leftBackWheelModel[11] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 14
leftBackWheelModel[12] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 15
leftBackWheelModel[13] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 16
leftBackWheelModel[14] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 17
leftBackWheelModel[15] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 18
leftBackWheelModel[16] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 20
leftBackWheelModel[17] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 21
leftBackWheelModel[18] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 22
leftBackWheelModel[19] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 23
leftBackWheelModel[20] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 24
leftBackWheelModel[21] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 25
leftBackWheelModel[22] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 26
leftBackWheelModel[23] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 27
leftBackWheelModel[24] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 28
leftBackWheelModel[25] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 29
leftBackWheelModel[26] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 30
leftBackWheelModel[27] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 31
leftBackWheelModel[28] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 32
leftBackWheelModel[29] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 33
leftBackWheelModel[30] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 34
leftBackWheelModel[31] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 35
leftBackWheelModel[32] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 6

leftBackWheelModel[0].addShapeBox(-14.5F, -8.5F, 0F, 8, 5, 15, 0F,-2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 27
leftBackWheelModel[0].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[1].addShapeBox(-8.5F, 6.5F, 0F, 5, 8, 15, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 30
leftBackWheelModel[1].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[2].addShapeBox(6.5F, -3.5F, 0F, 8, 7, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 34
leftBackWheelModel[2].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[3].addShapeBox(5.5F, -12.5F, 0F, 7, 7, 15, 0F,-3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 4
leftBackWheelModel[3].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[4].addShapeBox(5.5F, 5.5F, 0F, 7, 7, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F); // Box 5
leftBackWheelModel[4].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[5].addShapeBox(-12.5F, 5.5F, 0F, 7, 7, 15, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F); // Box 6
leftBackWheelModel[5].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[6].addShapeBox(-3.5F, 6.5F, 0F, 7, 8, 15, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
leftBackWheelModel[6].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[7].addShapeBox(-3.5F, -14.5F, 0F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
leftBackWheelModel[7].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[8].addShapeBox(-14.5F, -3.5F, 0F, 8, 7, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
leftBackWheelModel[8].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[9].addShapeBox(6.5F, -8.5F, 0F, 8, 5, 15, 0F,1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 11
leftBackWheelModel[9].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[10].addShapeBox(-14.5F, 3.5F, 0F, 8, 5, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F); // Box 13
leftBackWheelModel[10].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[11].addShapeBox(6.5F, 3.5F, 0F, 8, 5, 15, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F); // Box 14
leftBackWheelModel[11].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[12].addShapeBox(-12.5F, -12.5F, 0F, 7, 7, 15, 0F,0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 15
leftBackWheelModel[12].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[13].addShapeBox(3.5F, 6.5F, 0F, 5, 8, 15, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 16
leftBackWheelModel[13].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[14].addShapeBox(-8.5F, -14.5F, 0F, 5, 8, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F); // Box 17
leftBackWheelModel[14].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[15].addShapeBox(3.5F, -14.5F, 0F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F); // Box 18
leftBackWheelModel[15].setRotationPoint(-39F, -4.5F, -29F);

leftBackWheelModel[16].addShapeBox(-8.5F, -14.5F, 0F, 5, 8, 15, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F); // Box 20
leftBackWheelModel[16].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[17].addShapeBox(-3.5F, -14.5F, 0F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
leftBackWheelModel[17].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[18].addShapeBox(3.5F, -14.5F, 0F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F); // Box 22
leftBackWheelModel[18].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[19].addShapeBox(5.5F, -12.5F, 0F, 7, 7, 15, 0F,-3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 23
leftBackWheelModel[19].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[20].addShapeBox(6.5F, -8.5F, 0F, 8, 5, 15, 0F,1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
leftBackWheelModel[20].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[21].addShapeBox(6.5F, -3.5F, 0F, 8, 7, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 25
leftBackWheelModel[21].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[22].addShapeBox(6.5F, 3.5F, 0F, 8, 5, 15, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F); // Box 26
leftBackWheelModel[22].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[23].addShapeBox(5.5F, 5.5F, 0F, 7, 7, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 0F, 0F); // Box 27
leftBackWheelModel[23].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[24].addShapeBox(3.5F, 6.5F, 0F, 5, 8, 15, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 28
leftBackWheelModel[24].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[25].addShapeBox(-3.5F, 6.5F, 0F, 7, 8, 15, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
leftBackWheelModel[25].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[26].addShapeBox(-8.5F, 6.5F, 0F, 5, 8, 15, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 30
leftBackWheelModel[26].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[27].addShapeBox(-12.5F, 5.5F, 0F, 7, 7, 15, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F); // Box 31
leftBackWheelModel[27].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[28].addShapeBox(-14.5F, 3.5F, 0F, 8, 5, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F); // Box 32
leftBackWheelModel[28].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[29].addShapeBox(-14.5F, -3.5F, 0F, 8, 7, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 33
leftBackWheelModel[29].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[30].addShapeBox(-14.5F, -8.5F, 0F, 8, 5, 15, 0F,-2F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 34
leftBackWheelModel[30].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[31].addShapeBox(-12.5F, -12.5F, 0F, 7, 7, 15, 0F,0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 35
leftBackWheelModel[31].setRotationPoint(-39F, -4.5F, 16F);

leftBackWheelModel[32].addBox(-6.5F, -6.5F, -7F, 13, 13, 6, 0F); // Box 6
leftBackWheelModel[32].setRotationPoint(-39F, -4.5F, -14F);


rightBackWheelModel = new ModelRendererTurbo[1];
rightBackWheelModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 7

rightBackWheelModel[0].addBox(-6.5F, -6.5F, 1F, 13, 13, 6, 0F); // Box 7
rightBackWheelModel[0].setRotationPoint(-39F, -4.5F, 16F);


steeringWheelModel = new ModelRendererTurbo[1];
steeringWheelModel[0] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 7

steeringWheelModel[0].addBox(-7F, -2F, -3F, 1, 6, 6, 0F); // Box 7
steeringWheelModel[0].setRotationPoint(13F, -35F, 12F);
steeringWheelModel[0].rotateAngleZ = -0.34906585F;



translateAll(0F, 0F, 0F);


flipAll();
}
}