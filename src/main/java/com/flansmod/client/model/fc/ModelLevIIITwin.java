//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.10
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLevIIITwin extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLevIIITwin()
	{
		bodyModel = new ModelRendererTurbo[62];
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
		bodyModel[43] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 81
		bodyModel[44] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 82
		bodyModel[45] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 83
		bodyModel[46] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 84
		bodyModel[47] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Box 88
		bodyModel[51] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 129
		bodyModel[52] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 130
		bodyModel[53] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 133
		bodyModel[56] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 134
		bodyModel[57] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 135
		bodyModel[58] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 136
		bodyModel[59] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 137
		bodyModel[60] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 138
		bodyModel[61] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 139

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportLTBody1
		bodyModel[0].setRotationPoint(84F, -30F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLTBody2
		bodyModel[1].setRotationPoint(84F, -30F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLTBody3
		bodyModel[2].setRotationPoint(100F, -30F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -8F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Import ImportLTBody4
		bodyModel[3].setRotationPoint(100F, -30F, 40F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -4F, 0F); // Import ImportLTBody5
		bodyModel[4].setRotationPoint(100F, -14F, 56F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import ImportLTBody6
		bodyModel[5].setRotationPoint(84F, -14F, 56F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLTBody7
		bodyModel[6].setRotationPoint(84F, -30F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, -16F, 0F, 0F, -16F, -8F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLTBody8
		bodyModel[7].setRotationPoint(100F, -30F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportLTrack9
		bodyModel[8].setRotationPoint(52F, -22F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,1F, 4F, 0F, 1F, 4F, 0F, 0F, -8F, 0F, 0F, -8F, -16F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -16F); // Import ImportLTrack10
		bodyModel[9].setRotationPoint(68F, -22F, 40F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportLTBody11
		bodyModel[10].setRotationPoint(84F, -14F, 16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F); // Import ImportLTBody12
		bodyModel[11].setRotationPoint(100F, -14F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportLTrack13
		bodyModel[12].setRotationPoint(52F, -26F, 24F);

		bodyModel[13].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportLTrack14
		bodyModel[13].setRotationPoint(52F, -26F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportLTrack15
		bodyModel[14].setRotationPoint(52F, -24F, 30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportRTBody1
		bodyModel[15].setRotationPoint(84F, -30F, -40F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRTBody2
		bodyModel[16].setRotationPoint(84F, -30F, -64F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRTBody3
		bodyModel[17].setRotationPoint(100F, -30F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, -24F, 0F, -16F, -8F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRTBody4
		bodyModel[18].setRotationPoint(100F, -30F, -64F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F); // Import ImportRTBody5
		bodyModel[19].setRotationPoint(100F, -14F, -64F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRTBody6
		bodyModel[20].setRotationPoint(84F, -14F, -64F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRTBody7
		bodyModel[21].setRotationPoint(84F, -30F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -8F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Import ImportRTBody8
		bodyModel[22].setRotationPoint(100F, -30F, -24F);

		bodyModel[23].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportRTrack9
		bodyModel[23].setRotationPoint(52F, -22F, -40F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, -8F, -16F, 0F, -8F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -16F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportRTrack10
		bodyModel[24].setRotationPoint(68F, -22F, -64F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import ImportRTBody11
		bodyModel[25].setRotationPoint(84F, -14F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -4F, 0F); // Import ImportRTBody12
		bodyModel[26].setRotationPoint(100F, -14F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportRTrack13
		bodyModel[27].setRotationPoint(52F, -26F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportRTrack14
		bodyModel[28].setRotationPoint(52F, -26F, -40F);

		bodyModel[29].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportRTrack15
		bodyModel[29].setRotationPoint(52F, -24F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 96, 24, 80, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBody1
		bodyModel[30].setRotationPoint(-44F, -30F, -40F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 8F, 0F, 0F, 8F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Import ImportBody3
		bodyModel[31].setRotationPoint(-44F, -22F, 40F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,0F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F); // Import ImportBody4
		bodyModel[32].setRotationPoint(-44F, -14F, 40F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-16F, 0F, 0F, -8F, 0F, 0F, 0F, 8F, 0F, -8F, 8F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F); // Import ImportBody5
		bodyModel[33].setRotationPoint(-44F, -22F, -63F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 0F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import ImportBody6
		bodyModel[34].setRotationPoint(-44F, -14F, -63F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 22, 25, 80, 0F,0F, 0F, 0F, 0F, -10F, -15F, 0F, -10F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -15F, 0F, -10F, -15F, 0F, 0F, 0F); // Import Box1
		bodyModel[35].setRotationPoint(52F, -31F, -40F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[36].setRotationPoint(-26F, -23F, 40F);

		bodyModel[37].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[37].setRotationPoint(-12F, -23F, 40F);

		bodyModel[38].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[38].setRotationPoint(2F, -23F, 40F);

		bodyModel[39].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[39].setRotationPoint(-12F, -23F, -63F);

		bodyModel[40].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[40].setRotationPoint(-26F, -23F, -63F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[41].setRotationPoint(2F, -23F, -63F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 25, 80, 0F,0F, -4F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -16F, 0F, -10F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -16F); // Import Box13
		bodyModel[42].setRotationPoint(-61F, -31F, -40F);

		bodyModel[43].addShapeBox(0F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[43].setRotationPoint(100F, -30F, -40F);
		bodyModel[43].rotateAngleZ = -0.33161256F;

		bodyModel[44].addShapeBox(13F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[44].setRotationPoint(100F, -30F, -40F);
		bodyModel[44].rotateAngleZ = -0.33161256F;

		bodyModel[45].addShapeBox(26F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[45].setRotationPoint(100F, -30F, -40F);
		bodyModel[45].rotateAngleZ = -0.33161256F;

		bodyModel[46].addShapeBox(38F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[46].setRotationPoint(100F, -30F, -40F);
		bodyModel[46].rotateAngleZ = -0.33161256F;

		bodyModel[47].addShapeBox(0F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[47].setRotationPoint(100F, -30F, 24F);
		bodyModel[47].rotateAngleZ = -0.33161256F;

		bodyModel[48].addShapeBox(13F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[48].setRotationPoint(100F, -30F, 24F);
		bodyModel[48].rotateAngleZ = -0.33161256F;

		bodyModel[49].addShapeBox(26F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[49].setRotationPoint(100F, -30F, 24F);
		bodyModel[49].rotateAngleZ = -0.33161256F;

		bodyModel[50].addShapeBox(38F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[50].setRotationPoint(100F, -30F, 24F);
		bodyModel[50].rotateAngleZ = -0.33161256F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 44, 16, 60, 0F,-15F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, -15F, 0F, -10F, -10F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -5F); // Box 129
		bodyModel[51].setRotationPoint(-29F, -47F, -30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 16, 60, 0F,-10F, 0F, -20F, 15F, 0F, -10F, 15F, 0F, -10F, -10F, 0F, -20F, 0F, 0F, -20F, 10F, 0F, -5F, 10F, 0F, -5F, 0F, 0F, -20F); // Box 130
		bodyModel[52].setRotationPoint(-36F, -47F, -30F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 13, 16, 20, 0F,0F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -5F, 0F, 0F, -5F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -5F); // Box 131
		bodyModel[53].setRotationPoint(-39F, -47F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 16, 15, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[54].setRotationPoint(15F, -47F, -30F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[55].setRotationPoint(15F, -47F, 15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 16, 15, 0F,0F, 0F, -10F, 0F, -10F, -12F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[56].setRotationPoint(31F, -47F, -30F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 16, 15, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 135
		bodyModel[57].setRotationPoint(31F, -47F, 15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 21, 2, 12, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[58].setRotationPoint(-11F, -49F, -17F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 21, 2, 12, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[59].setRotationPoint(-11F, -49F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[60].setRotationPoint(15F, -47F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 16, 10, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[61].setRotationPoint(31F, -47F, -5F);


		barrelModel = new ModelRendererTurbo[28];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 140
		barrelModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 141
		barrelModel[2] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 142
		barrelModel[3] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 143
		barrelModel[4] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 144
		barrelModel[5] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 145
		barrelModel[6] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 146
		barrelModel[7] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 147
		barrelModel[8] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 148
		barrelModel[9] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 149
		barrelModel[10] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 150
		barrelModel[11] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 151
		barrelModel[12] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 152
		barrelModel[13] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 153
		barrelModel[14] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 154
		barrelModel[15] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 155
		barrelModel[16] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 156
		barrelModel[17] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 157
		barrelModel[18] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 158
		barrelModel[19] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 159
		barrelModel[20] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 160
		barrelModel[21] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 161
		barrelModel[22] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 162
		barrelModel[23] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 163
		barrelModel[24] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 164
		barrelModel[25] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 165
		barrelModel[26] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 166
		barrelModel[27] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 167

		barrelModel[0].addShapeBox(0F, -10F, -5F, 11, 18, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		barrelModel[0].setRotationPoint(15F, -39F, -10F);

		barrelModel[1].addShapeBox(11F, -10F, -5F, 11, 18, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		barrelModel[1].setRotationPoint(15F, -39F, -10F);

		barrelModel[2].addShapeBox(22F, -10F, -5F, 11, 18, 10, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 142
		barrelModel[2].setRotationPoint(15F, -39F, -10F);

		barrelModel[3].addShapeBox(33F, -3F, -4F, 22, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		barrelModel[3].setRotationPoint(15F, -39F, -10F);

		barrelModel[4].addShapeBox(35F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		barrelModel[4].setRotationPoint(15F, -39F, -10F);

		barrelModel[5].addShapeBox(39F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		barrelModel[5].setRotationPoint(15F, -39F, -10F);

		barrelModel[6].addShapeBox(43F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		barrelModel[6].setRotationPoint(15F, -39F, -10F);

		barrelModel[7].addShapeBox(47F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		barrelModel[7].setRotationPoint(15F, -39F, -10F);

		barrelModel[8].addShapeBox(51F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		barrelModel[8].setRotationPoint(15F, -39F, -10F);

		barrelModel[9].addShapeBox(55F, -4F, -5F, 16, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 149
		barrelModel[9].setRotationPoint(15F, -39F, -10F);

		barrelModel[10].addShapeBox(71F, -1F, -2F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		barrelModel[10].setRotationPoint(15F, -39F, -10F);

		barrelModel[11].addShapeBox(87F, -1F, -3F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		barrelModel[11].setRotationPoint(15F, -39F, -10F);

		barrelModel[12].addShapeBox(87F, -2F, -3F, 8, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		barrelModel[12].setRotationPoint(15F, -39F, -10F);

		barrelModel[13].addShapeBox(87F, 3F, -3F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 153
		barrelModel[13].setRotationPoint(15F, -39F, -10F);

		barrelModel[14].addShapeBox(0F, -10F, -5F, 11, 18, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		barrelModel[14].setRotationPoint(15F, -39F, 10F);

		barrelModel[15].addShapeBox(11F, -10F, -5F, 11, 18, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		barrelModel[15].setRotationPoint(15F, -39F, 10F);

		barrelModel[16].addShapeBox(22F, -10F, -5F, 11, 18, 10, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 156
		barrelModel[16].setRotationPoint(15F, -39F, 10F);

		barrelModel[17].addShapeBox(33F, -3F, -4F, 22, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		barrelModel[17].setRotationPoint(15F, -39F, 10F);

		barrelModel[18].addShapeBox(35F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		barrelModel[18].setRotationPoint(15F, -39F, 10F);

		barrelModel[19].addShapeBox(39F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		barrelModel[19].setRotationPoint(15F, -39F, 10F);

		barrelModel[20].addShapeBox(43F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		barrelModel[20].setRotationPoint(15F, -39F, 10F);

		barrelModel[21].addShapeBox(47F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		barrelModel[21].setRotationPoint(15F, -39F, 10F);

		barrelModel[22].addShapeBox(51F, -4F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		barrelModel[22].setRotationPoint(15F, -39F, 10F);

		barrelModel[23].addShapeBox(71F, -1F, -2F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		barrelModel[23].setRotationPoint(15F, -39F, 10F);

		barrelModel[24].addShapeBox(55F, -4F, -5F, 16, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 164
		barrelModel[24].setRotationPoint(15F, -39F, 10F);

		barrelModel[25].addShapeBox(87F, 3F, -3F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 165
		barrelModel[25].setRotationPoint(15F, -39F, 10F);

		barrelModel[26].addShapeBox(87F, -1F, -3F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		barrelModel[26].setRotationPoint(15F, -39F, 10F);

		barrelModel[27].addShapeBox(87F, -2F, -3F, 8, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		barrelModel[27].setRotationPoint(15F, -39F, 10F);


		backWheelModel = new ModelRendererTurbo[20];
		backWheelModel[0] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 58
		backWheelModel[1] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 59
		backWheelModel[2] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 60
		backWheelModel[3] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 62
		backWheelModel[4] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 63
		backWheelModel[5] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 64
		backWheelModel[6] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 65
		backWheelModel[7] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 68
		backWheelModel[8] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 69
		backWheelModel[9] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 70
		backWheelModel[10] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 71
		backWheelModel[11] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 72
		backWheelModel[12] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 73
		backWheelModel[13] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 74
		backWheelModel[14] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Box 75
		backWheelModel[15] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 76
		backWheelModel[16] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 77
		backWheelModel[17] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Box 78
		backWheelModel[18] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 79
		backWheelModel[19] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Box 80

		backWheelModel[0].addBox(0F, 0F, 0F, 27, 20, 2, 0F); // Box 58
		backWheelModel[0].setRotationPoint(35F, -26F, 40F);

		backWheelModel[1].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 59
		backWheelModel[1].setRotationPoint(30F, -26F, 40F);

		backWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 60
		backWheelModel[2].setRotationPoint(62F, -26F, 40F);

		backWheelModel[3].addShapeBox(0F, 0F, 0F, 27, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 62
		backWheelModel[3].setRotationPoint(35F, -26F, 42F);

		backWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F); // Box 63
		backWheelModel[4].setRotationPoint(62F, -26F, 42F);

		backWheelModel[5].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F); // Box 64
		backWheelModel[5].setRotationPoint(30F, -26F, 42F);

		backWheelModel[6].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 65
		backWheelModel[6].setRotationPoint(35F, -23F, 44F);

		backWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 68
		backWheelModel[7].setRotationPoint(44.5F, -23F, 44F);

		backWheelModel[8].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 69
		backWheelModel[8].setRotationPoint(54F, -23F, 44F);

		backWheelModel[9].addBox(0F, 0F, 0F, 27, 20, 2, 0F); // Box 70
		backWheelModel[9].setRotationPoint(35F, -26F, -42F);

		backWheelModel[10].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 71
		backWheelModel[10].setRotationPoint(62F, -26F, -42F);

		backWheelModel[11].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 72
		backWheelModel[11].setRotationPoint(62F, -26F, -44F);

		backWheelModel[12].addShapeBox(0F, 0F, 0F, 27, 20, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		backWheelModel[12].setRotationPoint(35F, -26F, -44F);

		backWheelModel[13].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 74
		backWheelModel[13].setRotationPoint(30F, -26F, -42F);

		backWheelModel[14].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,-2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 75
		backWheelModel[14].setRotationPoint(30F, -26F, -44F);

		backWheelModel[15].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		backWheelModel[15].setRotationPoint(35F, -23F, -45F);

		backWheelModel[16].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		backWheelModel[16].setRotationPoint(44.5F, -23F, -45F);

		backWheelModel[17].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		backWheelModel[17].setRotationPoint(54F, -23F, -45F);

		backWheelModel[18].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		backWheelModel[18].setRotationPoint(66F, -30F, -40F);

		backWheelModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		backWheelModel[19].setRotationPoint(66F, -30F, 24F);


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

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 1
		leftTrackModel[1].setRotationPoint(85F, -6F, 24F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 2
		leftTrackModel[2].setRotationPoint(93F, 2F, 24F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 3
		leftTrackModel[3].setRotationPoint(93F, 2F, 48F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 4
		leftTrackModel[4].setRotationPoint(97F, 2F, 32.5F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 5
		leftTrackModel[5].setRotationPoint(102F, 2F, 32.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 6
		leftTrackModel[6].setRotationPoint(107F, 2F, 32.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 7
		leftTrackModel[7].setRotationPoint(123F, 2F, 32.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 8
		leftTrackModel[8].setRotationPoint(128F, 2F, 32.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 9
		leftTrackModel[9].setRotationPoint(133F, 2F, 32.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 10
		leftTrackModel[10].setRotationPoint(98F, -12F, 56F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 11
		leftTrackModel[11].setRotationPoint(106F, -12F, 56F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 12
		leftTrackModel[12].setRotationPoint(114F, -12F, 56F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 13
		leftTrackModel[13].setRotationPoint(122F, -12F, 56F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		leftTrackModel[14].setRotationPoint(-34F, -12F, 56F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 29
		leftTrackModel[15].setRotationPoint(-26F, -12F, 56F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 30
		leftTrackModel[16].setRotationPoint(-18F, -12F, 56F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 31
		leftTrackModel[17].setRotationPoint(-10F, -12F, 56F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 63, 4, 32, 0F); // Box 32
		leftTrackModel[18].setRotationPoint(-47F, -10F, 24F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 33
		leftTrackModel[19].setRotationPoint(-47F, -6F, 24F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 34
		leftTrackModel[20].setRotationPoint(-39F, 2F, 48F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 35
		leftTrackModel[21].setRotationPoint(-39F, 2F, 24F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 36
		leftTrackModel[22].setRotationPoint(-9F, 2F, 32.5F);

		leftTrackModel[23].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 37
		leftTrackModel[23].setRotationPoint(-4F, 2F, 32.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 38
		leftTrackModel[24].setRotationPoint(1F, 2F, 32.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 39
		leftTrackModel[25].setRotationPoint(-35F, 2F, 32.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 40
		leftTrackModel[26].setRotationPoint(-25F, 2F, 32.5F);

		leftTrackModel[27].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 41
		leftTrackModel[27].setRotationPoint(-30F, 2F, 32.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 63, 4, 32, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
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

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 15
		rightTrackModel[1].setRotationPoint(85F, -6F, -56F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 16
		rightTrackModel[2].setRotationPoint(93F, 2F, -56F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 17
		rightTrackModel[3].setRotationPoint(93F, 2F, -32F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 18
		rightTrackModel[4].setRotationPoint(97F, 2F, -47.5F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 19
		rightTrackModel[5].setRotationPoint(102F, 2F, -47.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 20
		rightTrackModel[6].setRotationPoint(107F, 2F, -47.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 21
		rightTrackModel[7].setRotationPoint(123F, 2F, -47.5F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 22
		rightTrackModel[8].setRotationPoint(128F, 2F, -47.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 23
		rightTrackModel[9].setRotationPoint(133F, 2F, -47.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightTrackModel[10].setRotationPoint(98F, -12F, -58F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightTrackModel[11].setRotationPoint(106F, -12F, -58F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightTrackModel[12].setRotationPoint(114F, -12F, -58F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightTrackModel[13].setRotationPoint(122F, -12F, -58F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 63, 4, 32, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		rightTrackModel[14].setRotationPoint(-47F, -14F, -56F);

		rightTrackModel[15].addBox(0F, 0F, 0F, 63, 4, 32, 0F); // Box 44
		rightTrackModel[15].setRotationPoint(-47F, -10F, -56F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 45
		rightTrackModel[16].setRotationPoint(-47F, -6F, -56F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 46
		rightTrackModel[17].setRotationPoint(-39F, 2F, -56F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 47
		rightTrackModel[18].setRotationPoint(-39F, 2F, -32F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 48
		rightTrackModel[19].setRotationPoint(1F, 2F, -47.5F);

		rightTrackModel[20].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 49
		rightTrackModel[20].setRotationPoint(-4F, 2F, -47.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 50
		rightTrackModel[21].setRotationPoint(-9F, 2F, -47.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 51
		rightTrackModel[22].setRotationPoint(-25F, 2F, -47.5F);

		rightTrackModel[23].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 52
		rightTrackModel[23].setRotationPoint(-30F, 2F, -47.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 53
		rightTrackModel[24].setRotationPoint(-35F, 2F, -47.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackModel[25].setRotationPoint(-34F, -12F, -58F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackModel[26].setRotationPoint(-26F, -12F, -58F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackModel[27].setRotationPoint(-18F, -12F, -58F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightTrackModel[28].setRotationPoint(-10F, -12F, -58F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}