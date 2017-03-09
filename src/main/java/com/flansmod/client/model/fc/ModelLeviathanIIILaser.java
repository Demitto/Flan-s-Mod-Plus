//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeviathanIIILaser extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeviathanIIILaser()
	{
		bodyModel = new ModelRendererTurbo[71];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportLTBody1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Import ImportLTBody2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportLTBody3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import ImportLTBody4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportLTBody5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import ImportLTBody6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportLTBody7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportLTBody8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import ImportLTrack9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import ImportLTrack10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import ImportLTBody11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportLTBody12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportLTrack13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportLTrack14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import ImportLTrack15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportRTBody1
		bodyModel[16] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Import ImportRTBody2
		bodyModel[17] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportRTBody3
		bodyModel[18] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import ImportRTBody4
		bodyModel[19] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportRTBody5
		bodyModel[20] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import ImportRTBody6
		bodyModel[21] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportRTBody7
		bodyModel[22] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportRTBody8
		bodyModel[23] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import ImportRTrack9
		bodyModel[24] = new ModelRendererTurbo(this, 0, 602, textureX, textureY); // Import ImportRTrack10
		bodyModel[25] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import ImportRTBody11
		bodyModel[26] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportRTBody12
		bodyModel[27] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportRTrack13
		bodyModel[28] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportRTrack14
		bodyModel[29] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import ImportRTrack15
		bodyModel[30] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Import ImportBody1
		bodyModel[31] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportBody3
		bodyModel[32] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportBody4
		bodyModel[33] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportBody5
		bodyModel[34] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportBody6
		bodyModel[35] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box1
		bodyModel[36] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box2
		bodyModel[37] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box3
		bodyModel[38] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box4
		bodyModel[39] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box5
		bodyModel[40] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box6
		bodyModel[41] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box7
		bodyModel[42] = new ModelRendererTurbo(this, 600, 2, textureX, textureY); // Import Box13
		bodyModel[43] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 76
		bodyModel[59] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 77
		bodyModel[60] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 78
		bodyModel[61] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 81
		bodyModel[64] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 82
		bodyModel[65] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 83
		bodyModel[66] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 84
		bodyModel[67] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 85
		bodyModel[68] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 86
		bodyModel[69] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 88

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportLTBody1
		bodyModel[0].setRotationPoint(84F, -30F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody2
		bodyModel[1].setRotationPoint(84F, -30F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody3
		bodyModel[2].setRotationPoint(100F, -30F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportLTBody4
		bodyModel[3].setRotationPoint(100F, -30F, 40F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportLTBody5
		bodyModel[4].setRotationPoint(100F, -14F, 56F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportLTBody6
		bodyModel[5].setRotationPoint(84F, -14F, 56F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody7
		bodyModel[6].setRotationPoint(84F, -30F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody8
		bodyModel[7].setRotationPoint(100F, -30F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportLTrack9
		bodyModel[8].setRotationPoint(52F, -22F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,1F, 4F, 0F,1F, 4F, 0F,0F, -8F, 0F,0F, -8F, -16F,1F, 0F, 0F,1F, 0F, 0F,0F, -4F, 0F,0F, -4F, -16F); // Import ImportLTrack10
		bodyModel[9].setRotationPoint(68F, -22F, 40F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody11
		bodyModel[10].setRotationPoint(84F, -14F, 16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportLTBody12
		bodyModel[11].setRotationPoint(100F, -14F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportLTrack13
		bodyModel[12].setRotationPoint(52F, -26F, 24F);

		bodyModel[13].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportLTrack14
		bodyModel[13].setRotationPoint(52F, -26F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportLTrack15
		bodyModel[14].setRotationPoint(52F, -24F, 30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportRTBody1
		bodyModel[15].setRotationPoint(84F, -30F, -40F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody2
		bodyModel[16].setRotationPoint(84F, -30F, -64F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody3
		bodyModel[17].setRotationPoint(100F, -30F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, -20F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody4
		bodyModel[18].setRotationPoint(100F, -30F, -64F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportRTBody5
		bodyModel[19].setRotationPoint(100F, -14F, -64F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody6
		bodyModel[20].setRotationPoint(84F, -14F, -64F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody7
		bodyModel[21].setRotationPoint(84F, -30F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportRTBody8
		bodyModel[22].setRotationPoint(100F, -30F, -24F);

		bodyModel[23].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportRTrack9
		bodyModel[23].setRotationPoint(52F, -22F, -40F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, -8F, -16F,0F, -8F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, -4F, -16F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTrack10
		bodyModel[24].setRotationPoint(68F, -22F, -64F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportRTBody11
		bodyModel[25].setRotationPoint(84F, -14F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportRTBody12
		bodyModel[26].setRotationPoint(100F, -14F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportRTrack13
		bodyModel[27].setRotationPoint(52F, -26F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportRTrack14
		bodyModel[28].setRotationPoint(52F, -26F, -40F);

		bodyModel[29].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportRTrack15
		bodyModel[29].setRotationPoint(52F, -24F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 96, 24, 80, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody1
		bodyModel[30].setRotationPoint(-44F, -30F, -40F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 8F, 0F,0F, 8F, 0F,-8F, 0F, 0F,-16F, 0F, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F); // Import ImportBody3
		bodyModel[31].setRotationPoint(-44F, -22F, 40F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-16F, 0F, 0F); // Import ImportBody4
		bodyModel[32].setRotationPoint(-44F, -14F, 40F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 8F, 0F,-8F, 8F, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F); // Import ImportBody5
		bodyModel[33].setRotationPoint(-44F, -22F, -63F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F); // Import ImportBody6
		bodyModel[34].setRotationPoint(-44F, -14F, -63F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 22, 25, 80, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F); // Import Box1
		bodyModel[35].setRotationPoint(52F, -31F, -40F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box2
		bodyModel[36].setRotationPoint(-26F, -23F, 40F);

		bodyModel[37].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box3
		bodyModel[37].setRotationPoint(-12F, -23F, 40F);

		bodyModel[38].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box4
		bodyModel[38].setRotationPoint(2F, -23F, 40F);

		bodyModel[39].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box5
		bodyModel[39].setRotationPoint(-12F, -23F, -63F);

		bodyModel[40].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box6
		bodyModel[40].setRotationPoint(-26F, -23F, -63F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box7
		bodyModel[41].setRotationPoint(2F, -23F, -63F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 25, 80, 0F,0F, -4F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -16F,0F, -10F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -16F); // Import Box13
		bodyModel[42].setRotationPoint(-61F, -31F, -40F);

		bodyModel[43].addBox(0F, 0F, 0F, 27, 20, 2, 0F); // Box 58
		bodyModel[43].setRotationPoint(35F, -26F, 40F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F); // Box 59
		bodyModel[44].setRotationPoint(30F, -26F, 40F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F); // Box 60
		bodyModel[45].setRotationPoint(62F, -26F, 40F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 27, 20, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 62
		bodyModel[46].setRotationPoint(35F, -26F, 42F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F,0F, -5F, 0F,-2F, -7F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -5F, 0F,-2F, -7F, 0F,0F, -2F, 0F); // Box 63
		bodyModel[47].setRotationPoint(62F, -26F, 42F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -2F, 0F,-2F, -7F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -2F, 0F,-2F, -7F, 0F); // Box 64
		bodyModel[48].setRotationPoint(30F, -26F, 42F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F); // Box 65
		bodyModel[49].setRotationPoint(35F, -23F, 44F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F); // Box 68
		bodyModel[50].setRotationPoint(44.5F, -23F, 44F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F); // Box 69
		bodyModel[51].setRotationPoint(54F, -23F, 44F);

		bodyModel[52].addBox(0F, 0F, 0F, 27, 20, 2, 0F); // Box 70
		bodyModel[52].setRotationPoint(35F, -26F, -42F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F); // Box 71
		bodyModel[53].setRotationPoint(62F, -26F, -42F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -2F, 0F,-2F, -7F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -2F, 0F,-2F, -7F, 0F,0F, -5F, 0F,0F, 0F, 0F); // Box 72
		bodyModel[54].setRotationPoint(62F, -26F, -44F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 27, 20, 2, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 73
		bodyModel[55].setRotationPoint(35F, -26F, -44F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F); // Box 74
		bodyModel[56].setRotationPoint(30F, -26F, -42F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,-2F, -7F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -5F, 0F,-2F, -7F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -5F, 0F); // Box 75
		bodyModel[57].setRotationPoint(30F, -26F, -44F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 76
		bodyModel[58].setRotationPoint(35F, -23F, -45F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 77
		bodyModel[59].setRotationPoint(44.5F, -23F, -45F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 78
		bodyModel[60].setRotationPoint(54F, -23F, -45F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 79
		bodyModel[61].setRotationPoint(66F, -30F, -40F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 80
		bodyModel[62].setRotationPoint(66F, -30F, 24F);

		bodyModel[63].addShapeBox(0F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 81
		bodyModel[63].setRotationPoint(100F, -30F, -40F);
		bodyModel[63].rotateAngleZ = -0.33161256F;

		bodyModel[64].addShapeBox(13F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 82
		bodyModel[64].setRotationPoint(100F, -30F, -40F);
		bodyModel[64].rotateAngleZ = -0.33161256F;

		bodyModel[65].addShapeBox(26F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 83
		bodyModel[65].setRotationPoint(100F, -30F, -40F);
		bodyModel[65].rotateAngleZ = -0.33161256F;

		bodyModel[66].addShapeBox(38F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 84
		bodyModel[66].setRotationPoint(100F, -30F, -40F);
		bodyModel[66].rotateAngleZ = -0.33161256F;

		bodyModel[67].addShapeBox(0F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 85
		bodyModel[67].setRotationPoint(100F, -30F, 24F);
		bodyModel[67].rotateAngleZ = -0.33161256F;

		bodyModel[68].addShapeBox(13F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 86
		bodyModel[68].setRotationPoint(100F, -30F, 24F);
		bodyModel[68].rotateAngleZ = -0.33161256F;

		bodyModel[69].addShapeBox(26F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 87
		bodyModel[69].setRotationPoint(100F, -30F, 24F);
		bodyModel[69].rotateAngleZ = -0.33161256F;

		bodyModel[70].addShapeBox(38F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 88
		bodyModel[70].setRotationPoint(100F, -30F, 24F);
		bodyModel[70].rotateAngleZ = -0.33161256F;


		turretModel = new ModelRendererTurbo[58];
		turretModel[0] = new ModelRendererTurbo(this, 600, 115, textureX, textureY); // Box 1
		turretModel[1] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Box 2
		turretModel[2] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Box 3
		turretModel[3] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 4
		turretModel[4] = new ModelRendererTurbo(this, 600, 290, textureX, textureY); // Box 5
		turretModel[5] = new ModelRendererTurbo(this, 600, 325, textureX, textureY); // Box 6
		turretModel[6] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Box 8
		turretModel[7] = new ModelRendererTurbo(this, 600, 375, textureX, textureY); // Box 9
		turretModel[8] = new ModelRendererTurbo(this, 600, 445, textureX, textureY); // Box 10
		turretModel[9] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Box 11
		turretModel[10] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Box 12
		turretModel[11] = new ModelRendererTurbo(this, 600, 325, textureX, textureY); // Box 13
		turretModel[12] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Box 14
		turretModel[13] = new ModelRendererTurbo(this, 600, 445, textureX, textureY); // Box 15
		turretModel[14] = new ModelRendererTurbo(this, 600, 470, textureX, textureY); // Box 16
		turretModel[15] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 17
		turretModel[16] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Box 18
		turretModel[17] = new ModelRendererTurbo(this, 600, 570, textureX, textureY); // Box 19
		turretModel[18] = new ModelRendererTurbo(this, 600, 606, textureX, textureY); // Box 20
		turretModel[19] = new ModelRendererTurbo(this, 600, 650, textureX, textureY); // Box 21
		turretModel[20] = new ModelRendererTurbo(this, 600, 650, textureX, textureY); // Box 22
		turretModel[21] = new ModelRendererTurbo(this, 600, 670, textureX, textureY); // Box 23
		turretModel[22] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 24
		turretModel[23] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 25
		turretModel[24] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 26
		turretModel[25] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 27
		turretModel[26] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 28
		turretModel[27] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 29
		turretModel[28] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 30
		turretModel[29] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 31
		turretModel[30] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 32
		turretModel[31] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 33
		turretModel[32] = new ModelRendererTurbo(this, 600, 670, textureX, textureY); // Box 34
		turretModel[33] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 35
		turretModel[34] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 36
		turretModel[35] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 37
		turretModel[36] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 38
		turretModel[37] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 39
		turretModel[38] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 40
		turretModel[39] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 41
		turretModel[40] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 42
		turretModel[41] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Box 43
		turretModel[42] = new ModelRendererTurbo(this, 600, 690, textureX, textureY); // Box 44
		turretModel[43] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 45
		turretModel[44] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 46
		turretModel[45] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 47
		turretModel[46] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 48
		turretModel[47] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 49
		turretModel[48] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 50
		turretModel[49] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 51
		turretModel[50] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 53
		turretModel[51] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 54
		turretModel[52] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 55
		turretModel[53] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 56
		turretModel[54] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 57
		turretModel[55] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 58
		turretModel[56] = new ModelRendererTurbo(this, 600, 710, textureX, textureY); // Box 59
		turretModel[57] = new ModelRendererTurbo(this, 600, 725, textureX, textureY); // Box 60

		turretModel[0].addBox(0F, 0F, 0F, 40, 2, 60, 0F); // Box 1
		turretModel[0].setRotationPoint(-20F, -33F, -30F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 60, 0F,0F, 0F, -10F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F); // Box 2
		turretModel[1].setRotationPoint(-30F, -33F, -30F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 60, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 0F); // Box 3
		turretModel[2].setRotationPoint(20F, -33F, -30F);

		turretModel[3].addBox(0F, 0F, 0F, 50, 14, 17, 0F); // Box 4
		turretModel[3].setRotationPoint(-30F, -47F, -25F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 20, 14, 17, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		turretModel[4].setRotationPoint(20F, -47F, -25F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 20, 14, 5, 0F,0F, -4F, 0F,0F, -10F, -4F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F); // Box 6
		turretModel[5].setRotationPoint(20F, -47F, -30F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 50, 14, 5, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 8
		turretModel[6].setRotationPoint(-30F, -47F, -30F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 5, 14, 50, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		turretModel[7].setRotationPoint(-35F, -47F, -25F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, -4F, -5F,0F, -4F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 10
		turretModel[8].setRotationPoint(-35F, -47F, -30F);

		turretModel[9].addBox(0F, 0F, 0F, 50, 14, 17, 0F); // Box 11
		turretModel[9].setRotationPoint(-30F, -47F, 8F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 20, 14, 5, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 12
		turretModel[10].setRotationPoint(20F, -47F, 8F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 20, 14, 5, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, -4F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, 0F); // Box 13
		turretModel[11].setRotationPoint(20F, -47F, 25F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 50, 14, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		turretModel[12].setRotationPoint(-30F, -47F, 25F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 15
		turretModel[13].setRotationPoint(-35F, -47F, 25F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 16
		turretModel[14].setRotationPoint(20F, -47F, 18F);

		turretModel[15].addBox(0F, 0F, 0F, 20, 4, 5, 0F); // Box 17
		turretModel[15].setRotationPoint(20F, -37F, 13F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Box 18
		turretModel[16].setRotationPoint(20F, -46F, 13F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 10, 14, 16, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 19
		turretModel[17].setRotationPoint(-30F, -47F, -8F);

		turretModel[18].addBox(0F, 0F, 0F, 10, 18, 16, 0F); // Box 20
		turretModel[18].setRotationPoint(-20F, -51F, -8F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,-2F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 21
		turretModel[19].setRotationPoint(-19F, -39F, -40F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,-2F, 0F, 0F); // Box 22
		turretModel[20].setRotationPoint(-19F, -39F, 30F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 40, 2, 8, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		turretModel[21].setRotationPoint(-25F, -49F, 12F);

		turretModel[22].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 24
		turretModel[22].setRotationPoint(-19F, -50F, 13F);

		turretModel[23].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 25
		turretModel[23].setRotationPoint(-9F, -50F, 13F);

		turretModel[24].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 26
		turretModel[24].setRotationPoint(-17F, -49.5F, 13.5F);

		turretModel[25].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 27
		turretModel[25].setRotationPoint(-17F, -49.5F, 17.5F);

		turretModel[26].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 28
		turretModel[26].setRotationPoint(-17F, -49.5F, 15.5F);

		turretModel[27].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 29
		turretModel[27].setRotationPoint(-3F, -50F, 13F);

		turretModel[28].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 30
		turretModel[28].setRotationPoint(-1F, -49.5F, 13.5F);

		turretModel[29].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 31
		turretModel[29].setRotationPoint(-1F, -49.5F, 15.5F);

		turretModel[30].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 32
		turretModel[30].setRotationPoint(-1F, -49.5F, 17.5F);

		turretModel[31].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 33
		turretModel[31].setRotationPoint(7F, -50F, 13F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 40, 2, 8, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 34
		turretModel[32].setRotationPoint(-25F, -49F, -20F);

		turretModel[33].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 35
		turretModel[33].setRotationPoint(-3F, -50F, -19F);

		turretModel[34].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 36
		turretModel[34].setRotationPoint(-1F, -49.5F, -14.5F);

		turretModel[35].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 37
		turretModel[35].setRotationPoint(-1F, -49.5F, -16.5F);

		turretModel[36].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 38
		turretModel[36].setRotationPoint(-1F, -49.5F, -18.5F);

		turretModel[37].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 39
		turretModel[37].setRotationPoint(7F, -50F, -19F);

		turretModel[38].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 40
		turretModel[38].setRotationPoint(-9F, -50F, -19F);

		turretModel[39].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 41
		turretModel[39].setRotationPoint(-17F, -49.5F, -14.5F);

		turretModel[40].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 42
		turretModel[40].setRotationPoint(-17F, -49.5F, -16.5F);

		turretModel[41].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 43
		turretModel[41].setRotationPoint(-17F, -49.5F, -18.5F);

		turretModel[42].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 44
		turretModel[42].setRotationPoint(-19F, -50F, -19F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 45
		turretModel[43].setRotationPoint(-1F, -43F, -31F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 46
		turretModel[44].setRotationPoint(3F, -43F, -31F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 47
		turretModel[45].setRotationPoint(7F, -43F, -31F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 48
		turretModel[46].setRotationPoint(11F, -43F, -31F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 49
		turretModel[47].setRotationPoint(-21F, -43F, -31F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 50
		turretModel[48].setRotationPoint(-25F, -43F, -31F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 51
		turretModel[49].setRotationPoint(-29F, -43F, -31F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 53
		turretModel[50].setRotationPoint(-21F, -43F, 30F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 54
		turretModel[51].setRotationPoint(-25F, -43F, 30F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 55
		turretModel[52].setRotationPoint(-29F, -43F, 30F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 56
		turretModel[53].setRotationPoint(11F, -43F, 30F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 57
		turretModel[54].setRotationPoint(7F, -43F, 30F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 58
		turretModel[55].setRotationPoint(3F, -43F, 30F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 59
		turretModel[56].setRotationPoint(-1F, -43F, 30F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 6, 18, 16, 0F,0F, 0F, 0F,0F, -6F, -0.2F,0F, -6F, -0.2F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, -0.2F,0F, -6F, -0.2F,0F, 0F, 0F); // Box 60
		turretModel[57].setRotationPoint(-10F, -51F, -8F);


		barrelModel = new ModelRendererTurbo[28];
		barrelModel[0] = new ModelRendererTurbo(this, 600, 770, textureX, textureY); // Box 61
		barrelModel[1] = new ModelRendererTurbo(this, 600, 810, textureX, textureY); // Box 62
		barrelModel[2] = new ModelRendererTurbo(this, 600, 845, textureX, textureY); // Box 63
		barrelModel[3] = new ModelRendererTurbo(this, 600, 866, textureX, textureY); // Box 64
		barrelModel[4] = new ModelRendererTurbo(this, 600, 890, textureX, textureY); // Box 65
		barrelModel[5] = new ModelRendererTurbo(this, 600, 920, textureX, textureY); // Box 66
		barrelModel[6] = new ModelRendererTurbo(this, 600, 950, textureX, textureY); // Box 67
		barrelModel[7] = new ModelRendererTurbo(this, 600, 950, textureX, textureY); // Box 68
		barrelModel[8] = new ModelRendererTurbo(this, 600, 965, textureX, textureY); // Box 69
		barrelModel[9] = new ModelRendererTurbo(this, 600, 965, textureX, textureY); // Box 70
		barrelModel[10] = new ModelRendererTurbo(this, 600, 950, textureX, textureY); // Box 71
		barrelModel[11] = new ModelRendererTurbo(this, 600, 950, textureX, textureY); // Box 72
		barrelModel[12] = new ModelRendererTurbo(this, 600, 975, textureX, textureY); // Box 73
		barrelModel[13] = new ModelRendererTurbo(this, 600, 990, textureX, textureY); // Box 74
		barrelModel[14] = new ModelRendererTurbo(this, 600, 1000, textureX, textureY); // Box 75
		barrelModel[15] = new ModelRendererTurbo(this, 600, 1000, textureX, textureY); // Box 76
		barrelModel[16] = new ModelRendererTurbo(this, 800, 2, textureX, textureY); // Box 77
		barrelModel[17] = new ModelRendererTurbo(this, 800, 2, textureX, textureY); // Box 78
		barrelModel[18] = new ModelRendererTurbo(this, 800, 20, textureX, textureY); // Box 79
		barrelModel[19] = new ModelRendererTurbo(this, 800, 40, textureX, textureY); // Box 80
		barrelModel[20] = new ModelRendererTurbo(this, 800, 40, textureX, textureY); // Box 81
		barrelModel[21] = new ModelRendererTurbo(this, 800, 60, textureX, textureY); // Box 82
		barrelModel[22] = new ModelRendererTurbo(this, 800, 80, textureX, textureY); // Box 83
		barrelModel[23] = new ModelRendererTurbo(this, 800, 100, textureX, textureY); // Box 84
		barrelModel[24] = new ModelRendererTurbo(this, 800, 120, textureX, textureY); // Box 85
		barrelModel[25] = new ModelRendererTurbo(this, 800, 140, textureX, textureY); // Box 86
		barrelModel[26] = new ModelRendererTurbo(this, 800, 160, textureX, textureY); // Box 87
		barrelModel[27] = new ModelRendererTurbo(this, 800, 180, textureX, textureY); // Box 88

		barrelModel[0].addShapeBox(0F, -9F, 0F, 10, 18, 16, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 61
		barrelModel[0].setRotationPoint(-10F, -42F, -8F);

		barrelModel[1].addShapeBox(10F, -7F, 0F, 10, 16, 16, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Box 62
		barrelModel[1].setRotationPoint(-10F, -42F, -8F);

		barrelModel[2].addBox(20F, -6F, 1F, 33, 4, 14, 0F); // Box 63
		barrelModel[2].setRotationPoint(-10F, -42F, -8F);

		barrelModel[3].addShapeBox(53F, -6F, 1F, 16, 4, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F); // Box 64
		barrelModel[3].setRotationPoint(-10F, -42F, -8F);

		barrelModel[4].addBox(69F, -6F, 1F, 23, 12, 14, 0F); // Box 65
		barrelModel[4].setRotationPoint(-10F, -42F, -8F);

		barrelModel[5].addBox(20F, -3F, 2.5F, 49, 8, 11, 0F); // Box 66
		barrelModel[5].setRotationPoint(-10F, -42F, -8F);

		barrelModel[6].addShapeBox(39F, -2F, 2F, 3, 7, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 67
		barrelModel[6].setRotationPoint(-10F, -42F, -9F);

		barrelModel[7].addShapeBox(46F, -2F, 2F, 3, 7, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 68
		barrelModel[7].setRotationPoint(-10F, -42F, -9F);

		barrelModel[8].addShapeBox(51F, -2F, 3F, 16, 6, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Box 69
		barrelModel[8].setRotationPoint(-10F, -42F, -9F);

		barrelModel[9].addShapeBox(51F, -2F, 14F, 16, 6, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Box 70
		barrelModel[9].setRotationPoint(-10F, -42F, -9F);

		barrelModel[10].addShapeBox(46F, -2F, 14F, 3, 7, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 71
		barrelModel[10].setRotationPoint(-10F, -42F, -9F);

		barrelModel[11].addShapeBox(39F, -2F, 14F, 3, 7, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 72
		barrelModel[11].setRotationPoint(-10F, -42F, -9F);

		barrelModel[12].addShapeBox(20F, 5F, 4.5F, 49, 5, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 73
		barrelModel[12].setRotationPoint(-10F, -42F, -8F);

		barrelModel[13].addShapeBox(76F, 6F, 5F, 9, 3, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 74
		barrelModel[13].setRotationPoint(-10F, -42F, -8F);

		barrelModel[14].addShapeBox(73F, 6F, 5F, 3, 3, 6, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, -3F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, -3F, -2F); // Box 75
		barrelModel[14].setRotationPoint(-10F, -42F, -8F);

		barrelModel[15].addShapeBox(85F, 6F, 5F, 3, 3, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, -2F,0F, -3F, -2F,0F, -3F, -2F,0F, 0F, -2F); // Box 76
		barrelModel[15].setRotationPoint(-10F, -42F, -8F);

		barrelModel[16].addShapeBox(77F, 6F, 4F, 2, 4, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 77
		barrelModel[16].setRotationPoint(-10F, -42.5F, -8F);

		barrelModel[17].addShapeBox(82F, 6F, 4F, 2, 4, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Box 78
		barrelModel[17].setRotationPoint(-10F, -42.5F, -8F);

		barrelModel[18].addBox(92F, -6F, 1F, 6, 1, 14, 0F); // Box 79
		barrelModel[18].setRotationPoint(-10F, -42F, -8F);

		barrelModel[19].addShapeBox(92F, -6F, 1F, 6, 11, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 80
		barrelModel[19].setRotationPoint(-10F, -41F, -8F);

		barrelModel[20].addShapeBox(92F, -6F, 14F, 6, 11, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 81
		barrelModel[20].setRotationPoint(-10F, -41F, -8F);

		barrelModel[21].addShapeBox(92F, -5F, 1F, 2, 3, 9, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 82
		barrelModel[21].setRotationPoint(-10F, -41F, -5.5F);

		barrelModel[22].addBox(92F, -2F, 1F, 2, 3, 9, 0F); // Box 83
		barrelModel[22].setRotationPoint(-10F, -41F, -5.5F);

		barrelModel[23].addShapeBox(92F, 1F, 1F, 2, 3, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F); // Box 84
		barrelModel[23].setRotationPoint(-10F, -41F, -5.5F);

		barrelModel[24].addShapeBox(36F, -8F, 4F, 40, 2, 8, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 85
		barrelModel[24].setRotationPoint(-10F, -42F, -8F);

		barrelModel[25].addBox(0F, -2F, -1F, 13, 4, 4, 0F); // Box 86
		barrelModel[25].setRotationPoint(20F, -41.5F, 14.5F);

		barrelModel[26].addBox(13F, -1F, 0F, 13, 2, 2, 0F); // Box 87
		barrelModel[26].setRotationPoint(20F, -41.5F, 14.5F);

		barrelModel[27].addBox(24F, -0.5F, 0.5F, 13, 1, 1, 0F); // Box 88
		barrelModel[27].setRotationPoint(20F, -41.5F, 14.5F);


		leftTrackModel = new ModelRendererTurbo[29];
		leftTrackModel[0] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 0
		leftTrackModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 1
		leftTrackModel[2] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 2
		leftTrackModel[3] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 3
		leftTrackModel[4] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 4
		leftTrackModel[5] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 5
		leftTrackModel[6] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 6
		leftTrackModel[7] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 7
		leftTrackModel[8] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 8
		leftTrackModel[9] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 9
		leftTrackModel[10] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 10
		leftTrackModel[11] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 11
		leftTrackModel[12] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 12
		leftTrackModel[13] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 13
		leftTrackModel[14] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 28
		leftTrackModel[15] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 29
		leftTrackModel[16] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 30
		leftTrackModel[17] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 31
		leftTrackModel[18] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 32
		leftTrackModel[19] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 33
		leftTrackModel[20] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 34
		leftTrackModel[21] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 35
		leftTrackModel[22] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 36
		leftTrackModel[23] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 37
		leftTrackModel[24] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 38
		leftTrackModel[25] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 39
		leftTrackModel[26] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 40
		leftTrackModel[27] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 41
		leftTrackModel[28] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 42

		leftTrackModel[0].addBox(0F, 0F, 0F, 63, 8, 32, 0F); // Box 0
		leftTrackModel[0].setRotationPoint(85F, -14F, 24F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 1
		leftTrackModel[1].setRotationPoint(85F, -6F, 24F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 2
		leftTrackModel[2].setRotationPoint(93F, 2F, 24F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 3
		leftTrackModel[3].setRotationPoint(93F, 2F, 48F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 4
		leftTrackModel[4].setRotationPoint(97F, 2F, 32.5F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 5
		leftTrackModel[5].setRotationPoint(102F, 2F, 32.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 6
		leftTrackModel[6].setRotationPoint(107F, 2F, 32.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 7
		leftTrackModel[7].setRotationPoint(123F, 2F, 32.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 8
		leftTrackModel[8].setRotationPoint(128F, 2F, 32.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 9
		leftTrackModel[9].setRotationPoint(133F, 2F, 32.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 10
		leftTrackModel[10].setRotationPoint(98F, -12F, 56F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 11
		leftTrackModel[11].setRotationPoint(106F, -12F, 56F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 12
		leftTrackModel[12].setRotationPoint(114F, -12F, 56F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 13
		leftTrackModel[13].setRotationPoint(122F, -12F, 56F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 28
		leftTrackModel[14].setRotationPoint(-34F, -12F, 56F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 29
		leftTrackModel[15].setRotationPoint(-26F, -12F, 56F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 30
		leftTrackModel[16].setRotationPoint(-18F, -12F, 56F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Box 31
		leftTrackModel[17].setRotationPoint(-10F, -12F, 56F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 63, 4, 32, 0F); // Box 32
		leftTrackModel[18].setRotationPoint(-47F, -10F, 24F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 33
		leftTrackModel[19].setRotationPoint(-47F, -6F, 24F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 34
		leftTrackModel[20].setRotationPoint(-39F, 2F, 48F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 35
		leftTrackModel[21].setRotationPoint(-39F, 2F, 24F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 36
		leftTrackModel[22].setRotationPoint(-9F, 2F, 32.5F);

		leftTrackModel[23].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 37
		leftTrackModel[23].setRotationPoint(-4F, 2F, 32.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 38
		leftTrackModel[24].setRotationPoint(1F, 2F, 32.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 39
		leftTrackModel[25].setRotationPoint(-35F, 2F, 32.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 40
		leftTrackModel[26].setRotationPoint(-25F, 2F, 32.5F);

		leftTrackModel[27].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 41
		leftTrackModel[27].setRotationPoint(-30F, 2F, 32.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 63, 4, 32, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 42
		leftTrackModel[28].setRotationPoint(-47F, -14F, 24F);


		rightTrackModel = new ModelRendererTurbo[29];
		rightTrackModel[0] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 14
		rightTrackModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 15
		rightTrackModel[2] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 16
		rightTrackModel[3] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 17
		rightTrackModel[4] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 18
		rightTrackModel[5] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 19
		rightTrackModel[6] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 20
		rightTrackModel[7] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 21
		rightTrackModel[8] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 22
		rightTrackModel[9] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 23
		rightTrackModel[10] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 24
		rightTrackModel[11] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 25
		rightTrackModel[12] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 26
		rightTrackModel[13] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 27
		rightTrackModel[14] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 43
		rightTrackModel[15] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 44
		rightTrackModel[16] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Box 45
		rightTrackModel[17] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 46
		rightTrackModel[18] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 47
		rightTrackModel[19] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 48
		rightTrackModel[20] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 49
		rightTrackModel[21] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 50
		rightTrackModel[22] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 51
		rightTrackModel[23] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 52
		rightTrackModel[24] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 53
		rightTrackModel[25] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 54
		rightTrackModel[26] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 55
		rightTrackModel[27] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 56
		rightTrackModel[28] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 57

		rightTrackModel[0].addBox(0F, 0F, 0F, 63, 8, 32, 0F); // Box 14
		rightTrackModel[0].setRotationPoint(85F, -14F, -56F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 15
		rightTrackModel[1].setRotationPoint(85F, -6F, -56F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 16
		rightTrackModel[2].setRotationPoint(93F, 2F, -56F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 17
		rightTrackModel[3].setRotationPoint(93F, 2F, -32F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 18
		rightTrackModel[4].setRotationPoint(97F, 2F, -47.5F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 19
		rightTrackModel[5].setRotationPoint(102F, 2F, -47.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 20
		rightTrackModel[6].setRotationPoint(107F, 2F, -47.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 21
		rightTrackModel[7].setRotationPoint(123F, 2F, -47.5F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 22
		rightTrackModel[8].setRotationPoint(128F, 2F, -47.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 23
		rightTrackModel[9].setRotationPoint(133F, 2F, -47.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 24
		rightTrackModel[10].setRotationPoint(98F, -12F, -58F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 25
		rightTrackModel[11].setRotationPoint(106F, -12F, -58F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 26
		rightTrackModel[12].setRotationPoint(114F, -12F, -58F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 27
		rightTrackModel[13].setRotationPoint(122F, -12F, -58F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 63, 4, 32, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 43
		rightTrackModel[14].setRotationPoint(-47F, -14F, -56F);

		rightTrackModel[15].addBox(0F, 0F, 0F, 63, 4, 32, 0F); // Box 44
		rightTrackModel[15].setRotationPoint(-47F, -10F, -56F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Box 45
		rightTrackModel[16].setRotationPoint(-47F, -6F, -56F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 46
		rightTrackModel[17].setRotationPoint(-39F, 2F, -56F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 47
		rightTrackModel[18].setRotationPoint(-39F, 2F, -32F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 48
		rightTrackModel[19].setRotationPoint(1F, 2F, -47.5F);

		rightTrackModel[20].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 49
		rightTrackModel[20].setRotationPoint(-4F, 2F, -47.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 50
		rightTrackModel[21].setRotationPoint(-9F, 2F, -47.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Box 51
		rightTrackModel[22].setRotationPoint(-25F, 2F, -47.5F);

		rightTrackModel[23].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 52
		rightTrackModel[23].setRotationPoint(-30F, 2F, -47.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Box 53
		rightTrackModel[24].setRotationPoint(-35F, 2F, -47.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 54
		rightTrackModel[25].setRotationPoint(-34F, -12F, -58F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 55
		rightTrackModel[26].setRotationPoint(-26F, -12F, -58F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 56
		rightTrackModel[27].setRotationPoint(-18F, -12F, -58F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 57
		rightTrackModel[28].setRotationPoint(-10F, -12F, -58F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
