//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeviathanII extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeviathanII()
	{
		bodyModel = new ModelRendererTurbo[51];
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
		bodyModel[35] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportLTrack1
		bodyModel[36] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportLTrack2
		bodyModel[37] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportRtrack1
		bodyModel[38] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportRtrack2
		bodyModel[39] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box1
		bodyModel[40] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box2
		bodyModel[41] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box3
		bodyModel[42] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box4
		bodyModel[43] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box5
		bodyModel[44] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box6
		bodyModel[45] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box7
		bodyModel[46] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box9
		bodyModel[47] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box10
		bodyModel[48] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box11
		bodyModel[49] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box12
		bodyModel[50] = new ModelRendererTurbo(this, 600, 2, textureX, textureY); // Import Box13

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportLTBody1
		bodyModel[0].setRotationPoint(84F, -22F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody2
		bodyModel[1].setRotationPoint(84F, -22F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody3
		bodyModel[2].setRotationPoint(100F, -22F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportLTBody4
		bodyModel[3].setRotationPoint(100F, -22F, 40F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportLTBody5
		bodyModel[4].setRotationPoint(100F, -6F, 56F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportLTBody6
		bodyModel[5].setRotationPoint(84F, -6F, 56F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody7
		bodyModel[6].setRotationPoint(84F, -22F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody8
		bodyModel[7].setRotationPoint(100F, -22F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportLTrack9
		bodyModel[8].setRotationPoint(52F, -14F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,1F, 4F, 0F,1F, 4F, 0F,0F, -8F, 0F,0F, -8F, -16F,1F, 0F, 0F,1F, 0F, 0F,0F, -4F, 0F,0F, -4F, -16F); // Import ImportLTrack10
		bodyModel[9].setRotationPoint(68F, -14F, 40F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLTBody11
		bodyModel[10].setRotationPoint(84F, -6F, 16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportLTBody12
		bodyModel[11].setRotationPoint(100F, -6F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportLTrack13
		bodyModel[12].setRotationPoint(52F, -18F, 24F);

		bodyModel[13].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportLTrack14
		bodyModel[13].setRotationPoint(52F, -18F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportLTrack15
		bodyModel[14].setRotationPoint(52F, -16F, 30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportRTBody1
		bodyModel[15].setRotationPoint(84F, -22F, -40F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody2
		bodyModel[16].setRotationPoint(84F, -22F, -64F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody3
		bodyModel[17].setRotationPoint(100F, -22F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, -20F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody4
		bodyModel[18].setRotationPoint(100F, -22F, -64F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportRTBody5
		bodyModel[19].setRotationPoint(100F, -6F, -64F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody6
		bodyModel[20].setRotationPoint(84F, -6F, -64F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTBody7
		bodyModel[21].setRotationPoint(84F, -22F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportRTBody8
		bodyModel[22].setRotationPoint(100F, -22F, -24F);

		bodyModel[23].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportRTrack9
		bodyModel[23].setRotationPoint(52F, -14F, -40F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, -8F, -16F,0F, -8F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, -4F, -16F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRTrack10
		bodyModel[24].setRotationPoint(68F, -14F, -64F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportRTBody11
		bodyModel[25].setRotationPoint(84F, -6F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportRTBody12
		bodyModel[26].setRotationPoint(100F, -6F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportRTrack13
		bodyModel[27].setRotationPoint(52F, -18F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportRTrack14
		bodyModel[28].setRotationPoint(52F, -18F, -40F);

		bodyModel[29].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportRTrack15
		bodyModel[29].setRotationPoint(52F, -16F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 96, 24, 80, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody1
		bodyModel[30].setRotationPoint(-44F, -22F, -40F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 8F, 0F,0F, 8F, 0F,-8F, 0F, 0F,-16F, 0F, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F); // Import ImportBody3
		bodyModel[31].setRotationPoint(-44F, -14F, 40F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-16F, 0F, 0F); // Import ImportBody4
		bodyModel[32].setRotationPoint(-44F, -6F, 40F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 8F, 0F,-8F, 8F, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F); // Import ImportBody5
		bodyModel[33].setRotationPoint(-44F, -14F, -63F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F); // Import ImportBody6
		bodyModel[34].setRotationPoint(-44F, -6F, -63F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportLTrack1
		bodyModel[35].setRotationPoint(84F, -2F, 24F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportLTrack2
		bodyModel[36].setRotationPoint(-60F, -2F, 24F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportRtrack1
		bodyModel[37].setRotationPoint(84F, -2F, -56F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportRtrack2
		bodyModel[38].setRotationPoint(-60F, -2F, -56F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 22, 25, 80, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F); // Import Box1
		bodyModel[39].setRotationPoint(52F, -23F, -40F);

		bodyModel[40].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box2
		bodyModel[40].setRotationPoint(-26F, -15F, 40F);

		bodyModel[41].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box3
		bodyModel[41].setRotationPoint(-12F, -15F, 40F);

		bodyModel[42].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box4
		bodyModel[42].setRotationPoint(2F, -15F, 40F);

		bodyModel[43].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box5
		bodyModel[43].setRotationPoint(-12F, -15F, -63F);

		bodyModel[44].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box6
		bodyModel[44].setRotationPoint(-26F, -15F, -63F);

		bodyModel[45].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box7
		bodyModel[45].setRotationPoint(2F, -15F, -63F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box9
		bodyModel[46].setRotationPoint(84F, -6F, 24F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box10
		bodyModel[47].setRotationPoint(84F, -6F, -56F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box11
		bodyModel[48].setRotationPoint(-60F, -6F, 24F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box12
		bodyModel[49].setRotationPoint(-60F, -6F, -56F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 25, 80, 0F,0F, -4F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -16F,0F, -10F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -16F); // Import Box13
		bodyModel[50].setRotationPoint(-61F, -23F, -40F);


		turretModel = new ModelRendererTurbo[32];
		turretModel[0] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Box20
		turretModel[1] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Import Box21
		turretModel[2] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Import Box22
		turretModel[3] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Box29
		turretModel[4] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import Box30
		turretModel[5] = new ModelRendererTurbo(this, 0, 875, textureX, textureY); // Import Box31
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box32
		turretModel[7] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box33
		turretModel[8] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box34
		turretModel[9] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import Box35
		turretModel[10] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box36
		turretModel[11] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box37
		turretModel[12] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box38
		turretModel[13] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box39
		turretModel[14] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box40
		turretModel[15] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import Box41
		turretModel[16] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import Box42
		turretModel[17] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Box43
		turretModel[18] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import Box44
		turretModel[19] = new ModelRendererTurbo(this, 0, 875, textureX, textureY); // Import Box45
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box46
		turretModel[21] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import Box47
		turretModel[22] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box48
		turretModel[23] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box49
		turretModel[24] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import Box50
		turretModel[25] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box51
		turretModel[26] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box52
		turretModel[27] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box53
		turretModel[28] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import Box54--
		turretModel[29] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box55
		turretModel[30] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box56
		turretModel[31] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box57

		turretModel[0].addBox(0F, 0F, 0F, 40, 2, 48, 0F); // Import Box20
		turretModel[0].setRotationPoint(-20F, -25F, -24F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 48, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Import Box21
		turretModel[1].setRotationPoint(-24F, -25F, -24F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 48, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Import Box22
		turretModel[2].setRotationPoint(20F, -25F, -24F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 72, 14, 10, 0F,0F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box29
		turretModel[3].setRotationPoint(-7F, -39F, -16F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 72, 14, 4, 0F,0F, 0F, 0F,-25F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box30
		turretModel[4].setRotationPoint(-7F, -39F, -20F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, -5F, 0F,-5F, -5F, 0F,-5F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box31
		turretModel[5].setRotationPoint(0F, -39F, -27F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box32
		turretModel[6].setRotationPoint(-20F, -39F, -27F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box33
		turretModel[7].setRotationPoint(13F, -29F, -21F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box34
		turretModel[8].setRotationPoint(7F, -33F, -21F);

		turretModel[9].addBox(0F, 0F, 0F, 13, 14, 20, 0F); // Import Box35
		turretModel[9].setRotationPoint(-20F, -39F, -20F);

		turretModel[10].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import Box36
		turretModel[10].setRotationPoint(58F, -28F, -11F);

		turretModel[11].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import Box37
		turretModel[11].setRotationPoint(50F, -32F, -11F);

		turretModel[12].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import Box38
		turretModel[12].setRotationPoint(58F, -28.5F, -11.5F);

		turretModel[13].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import Box39
		turretModel[13].setRotationPoint(51F, -32.5F, -11.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F,0F, -5F, -7F,0F, -5F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 0F, -7F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box40
		turretModel[14].setRotationPoint(-27F, -39F, -27F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 7, 14, 10, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box41
		turretModel[15].setRotationPoint(-27F, -39F, -20F);

		turretModel[16].addBox(0F, 0F, 0F, 13, 14, 20, 0F); // Import Box42
		turretModel[16].setRotationPoint(-20F, -39F, 0F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 72, 14, 10, 0F,0F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box43
		turretModel[17].setRotationPoint(-7F, -39F, 6F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 72, 14, 4, 0F,0F, 0F, 0F,-20F, 0F, 0F,-25F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F); // Import Box44
		turretModel[18].setRotationPoint(-7F, -39F, 16F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,-5F, -5F, 0F,-5F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box45
		turretModel[19].setRotationPoint(0F, -39F, 20F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box46
		turretModel[20].setRotationPoint(-20F, -39F, 20F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 7, 14, 10, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box47
		turretModel[21].setRotationPoint(-27F, -39F, 10F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, -7F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -7F); // Import Box48
		turretModel[22].setRotationPoint(-27F, -39F, 20F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F); // Import Box49
		turretModel[23].setRotationPoint(7F, -33F, 20F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F); // Import Box50
		turretModel[24].setRotationPoint(13F, -29F, 20F);

		turretModel[25].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import Box51
		turretModel[25].setRotationPoint(51F, -32.5F, 9.5F);

		turretModel[26].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import Box52
		turretModel[26].setRotationPoint(50F, -32F, 10F);

		turretModel[27].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import Box53
		turretModel[27].setRotationPoint(58F, -28.5F, 9.5F);

		turretModel[28].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import Box54--
		turretModel[28].setRotationPoint(58F, -28F, 10F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 18, 14, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, 0F); // Import Box55
		turretModel[29].setRotationPoint(-38F, -39F, -10F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,-5F, 0F, 0F,-15F, 0F, 0F,-15F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box56
		turretModel[30].setRotationPoint(-38F, -47F, -10F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,-5F, 0F, 0F,-15F, 0F, 0F,-15F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box57
		turretModel[31].setRotationPoint(-38F, -47F, 5F);


		barrelModel = new ModelRendererTurbo[40];
		barrelModel[0] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import Box59
		barrelModel[1] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Import Box60
		barrelModel[2] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box61
		barrelModel[3] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box62
		barrelModel[4] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box63
		barrelModel[5] = new ModelRendererTurbo(this, 600, 220, textureX, textureY); // Import Box64
		barrelModel[6] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box65
		barrelModel[7] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box66
		barrelModel[8] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box67
		barrelModel[9] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Import Box68
		barrelModel[10] = new ModelRendererTurbo(this, 600, 390, textureX, textureY); // Import Box69
		barrelModel[11] = new ModelRendererTurbo(this, 600, 420, textureX, textureY); // Import Box70
		barrelModel[12] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Import Box71
		barrelModel[13] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box72
		barrelModel[14] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box73
		barrelModel[15] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box74
		barrelModel[16] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box75
		barrelModel[17] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box76
		barrelModel[18] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box77
		barrelModel[19] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box78
		barrelModel[20] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box79
		barrelModel[21] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box80
		barrelModel[22] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import Box81
		barrelModel[23] = new ModelRendererTurbo(this, 600, 480, textureX, textureY); // Import Box82
		barrelModel[24] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import Box83
		barrelModel[25] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Import Box84
		barrelModel[26] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Import Box89
		barrelModel[27] = new ModelRendererTurbo(this, 600, 560, textureX, textureY); // Import Box92
		barrelModel[28] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Import Box93
		barrelModel[29] = new ModelRendererTurbo(this, 600, 600, textureX, textureY); // Import Box94
		barrelModel[30] = new ModelRendererTurbo(this, 600, 600, textureX, textureY); // Import Box95
		barrelModel[31] = new ModelRendererTurbo(this, 600, 610, textureX, textureY); // Import Box96
		barrelModel[32] = new ModelRendererTurbo(this, 600, 610, textureX, textureY); // Import Box97
		barrelModel[33] = new ModelRendererTurbo(this, 600, 620, textureX, textureY); // Import Box98
		barrelModel[34] = new ModelRendererTurbo(this, 600, 620, textureX, textureY); // Import Box99
		barrelModel[35] = new ModelRendererTurbo(this, 600, 640, textureX, textureY); // Import Box100
		barrelModel[36] = new ModelRendererTurbo(this, 600, 680, textureX, textureY); // Import Box101
		barrelModel[37] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Import Box102
		barrelModel[38] = new ModelRendererTurbo(this, 600, 720, textureX, textureY); // Import Box105
		barrelModel[39] = new ModelRendererTurbo(this, 600, 740, textureX, textureY); // Import Box106

		barrelModel[0].addBox(0F, -7F, -6F, 20, 14, 12, 0F); // Import Box59
		barrelModel[0].setRotationPoint(-7F, -32F, 0F);

		barrelModel[1].addShapeBox(20F, -7F, -6F, 5, 14, 12, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box60
		barrelModel[1].setRotationPoint(-7F, -32F, 0F);

		barrelModel[2].addBox(25F, -5F, -6F, 5, 12, 12, 0F); // Import Box61
		barrelModel[2].setRotationPoint(-7F, -32F, 0F);

		barrelModel[3].addBox(32F, -5F, -6F, 5, 12, 12, 0F); // Import Box62
		barrelModel[3].setRotationPoint(-7F, -32F, 0F);

		barrelModel[4].addBox(39F, -5F, -6F, 5, 12, 12, 0F); // Import Box63
		barrelModel[4].setRotationPoint(-7F, -32F, 0F);

		barrelModel[5].addBox(30F, -4F, -5F, 19, 10, 10, 0F); // Import Box64
		barrelModel[5].setRotationPoint(-7F, -32F, 0F);

		barrelModel[6].addShapeBox(49F, -4F, -5F, 10, 10, 10, 0F,0F, 0F, 0F,0F, 4F, -1F,0F, 4F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box65
		barrelModel[6].setRotationPoint(-7F, -32F, 0F);

		barrelModel[7].addBox(59F, -8F, -6F, 10, 14, 8, 0F); // Import Box66
		barrelModel[7].setRotationPoint(-7F, -32F, 2F);

		barrelModel[8].addShapeBox(69F, -8F, -6F, 7, 14, 8, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box67
		barrelModel[8].setRotationPoint(-7F, -32F, 2F);

		barrelModel[9].addShapeBox(76F, -2F, -6F, 13, 8, 8, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box68
		barrelModel[9].setRotationPoint(-7F, -32F, 2F);

		barrelModel[10].addBox(89F, -1F, -5F, 20, 6, 6, 0F); // Import Box69
		barrelModel[10].setRotationPoint(-7F, -32F, 2F);

		barrelModel[11].addBox(109F, -1F, -5F, 20, 1, 6, 0F); // Import Box70
		barrelModel[11].setRotationPoint(-7F, -32F, 2F);

		barrelModel[12].addBox(109F, 4F, -5F, 20, 1, 6, 0F); // Import Box71
		barrelModel[12].setRotationPoint(-7F, -32F, 2F);

		barrelModel[13].addBox(111F, 0F, -5F, 2, 4, 1, 0F); // Import Box72
		barrelModel[13].setRotationPoint(-7F, -32F, 2F);

		barrelModel[14].addBox(115F, 0F, -5F, 2, 4, 1, 0F); // Import Box73
		barrelModel[14].setRotationPoint(-7F, -32F, 2F);

		barrelModel[15].addBox(119F, 0F, -5F, 2, 4, 1, 0F); // Import Box74
		barrelModel[15].setRotationPoint(-7F, -32F, 2F);

		barrelModel[16].addBox(123F, 0F, -5F, 2, 4, 1, 0F); // Import Box75
		barrelModel[16].setRotationPoint(-7F, -32F, 2F);

		barrelModel[17].addBox(127F, 0F, -6F, 2, 4, 1, 0F); // Import Box76
		barrelModel[17].setRotationPoint(-7F, -32F, 3F);

		barrelModel[18].addBox(111F, 0F, 7F, 2, 4, 1, 0F); // Import Box77
		barrelModel[18].setRotationPoint(-7F, -32F, -5F);

		barrelModel[19].addBox(115F, 0F, 7F, 2, 4, 1, 0F); // Import Box78
		barrelModel[19].setRotationPoint(-7F, -32F, -5F);

		barrelModel[20].addBox(119F, 0F, 7F, 2, 4, 1, 0F); // Import Box79
		barrelModel[20].setRotationPoint(-7F, -32F, -5F);

		barrelModel[21].addBox(123F, 0F, 7F, 2, 4, 1, 0F); // Import Box80
		barrelModel[21].setRotationPoint(-7F, -32F, -5F);

		barrelModel[22].addBox(127F, 0F, 6F, 2, 4, 1, 0F); // Import Box81
		barrelModel[22].setRotationPoint(-7F, -32F, -4F);

		barrelModel[23].addShapeBox(129F, -1F, -6F, 12, 6, 6, 0F,0F, 0F, 0F,0F, 0.5F, 0.5F,0F, 0.5F, 0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.5F, 0.5F,0F, 0.5F, 0.5F,0F, 0F, 0F); // Import Box82
		barrelModel[23].setRotationPoint(-7F, -32F, 3F);

		barrelModel[24].addBox(141F, -1.5F, -5.5F, 8, 7, 7, 0F); // Import Box83
		barrelModel[24].setRotationPoint(-7F, -32F, 2F);

		barrelModel[25].addShapeBox(149F, -1.5F, -5.5F, 8, 7, 7, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box84
		barrelModel[25].setRotationPoint(-7F, -32F, 2F);

		barrelModel[26].addBox(-2F, -1F, 0F, 8, 2, 10, 0F); // Import Box89
		barrelModel[26].setRotationPoint(-29F, -44F, -5F);

		barrelModel[27].addBox(-3F, -3F, 2F, 15, 6, 6, 0F); // Import Box92
		barrelModel[27].setRotationPoint(-29F, -44F, -5F);

		barrelModel[28].addShapeBox(12F, -3F, 2F, 5, 6, 6, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box93
		barrelModel[28].setRotationPoint(-29F, -44F, -5F);

		barrelModel[29].addBox(17F, -2F, 4F, 5, 1, 2, 0F); // Import Box94
		barrelModel[29].setRotationPoint(-29F, -44F, -5F);

		barrelModel[30].addBox(17F, 1F, 4F, 5, 1, 2, 0F); // Import Box95
		barrelModel[30].setRotationPoint(-29F, -44F, -5F);

		barrelModel[31].addBox(22F, 1F, 3F, 2, 1, 4, 0F); // Import Box96
		barrelModel[31].setRotationPoint(-29F, -44F, -5F);

		barrelModel[32].addBox(22F, -2F, 3F, 2, 1, 4, 0F); // Import Box97
		barrelModel[32].setRotationPoint(-29F, -44F, -5F);

		barrelModel[33].addBox(22F, -1F, 3F, 2, 2, 1, 0F); // Import Box98
		barrelModel[33].setRotationPoint(-29F, -44F, -5F);

		barrelModel[34].addBox(22F, -1F, 6F, 2, 2, 1, 0F); // Import Box99
		barrelModel[34].setRotationPoint(-29F, -44F, -5F);

		barrelModel[35].addShapeBox(-7F, -3F, 2F, 4, 6, 6, 0F,0F, -2F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F,0F, -2F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F); // Import Box100
		barrelModel[35].setRotationPoint(-29F, -44F, -5F);

		barrelModel[36].addShapeBox(72F, -5F, -5F, 30, 4, 6, 0F,0F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box101
		barrelModel[36].setRotationPoint(-7F, -32F, 2F);

		barrelModel[37].addShapeBox(17F, 7F, -5F, 87, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,-4F, 0F, -2F,-4F, 0F, -2F,0F, 0F, -2F); // Import Box102
		barrelModel[37].setRotationPoint(-7F, -34F, 2F);

		barrelModel[38].addBox(99F, -4F, -5F, 10, 2, 2, 0F); // Import Box105
		barrelModel[38].setRotationPoint(-7F, -32F, 4F);

		barrelModel[39].addBox(109F, -3.5F, -4.5F, 10, 1, 1, 0F); // Import Box106
		barrelModel[39].setRotationPoint(-7F, -32F, 4F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
