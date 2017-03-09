//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeviathanIIAA extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeviathanIIAA()
	{
		bodyModel = new ModelRendererTurbo[51];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportImportLTBody1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Import ImportImportLTBody2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportImportLTBody3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import ImportImportLTBody4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportImportLTBody5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import ImportImportLTBody6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportImportLTBody7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportImportLTBody8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import ImportImportLTrack9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import ImportImportLTrack10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import ImportImportLTBody11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportImportLTBody12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportImportLTrack13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportImportLTrack14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import ImportImportLTrack15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportImportRTBody1
		bodyModel[16] = new ModelRendererTurbo(this, 0, 136, textureX, textureY); // Import ImportImportRTBody2
		bodyModel[17] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import ImportImportRTBody3
		bodyModel[18] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import ImportImportRTBody4
		bodyModel[19] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportImportRTBody5
		bodyModel[20] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import ImportImportRTBody6
		bodyModel[21] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportImportRTBody7
		bodyModel[22] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportImportRTBody8
		bodyModel[23] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import ImportImportRTrack9
		bodyModel[24] = new ModelRendererTurbo(this, 0, 602, textureX, textureY); // Import ImportImportRTrack10
		bodyModel[25] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import ImportImportRTBody11
		bodyModel[26] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportImportRTBody12
		bodyModel[27] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportImportRTrack13
		bodyModel[28] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportImportRTrack14
		bodyModel[29] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import ImportImportRTrack15
		bodyModel[30] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Import ImportImportBody1
		bodyModel[31] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportImportBody3
		bodyModel[32] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportImportBody4
		bodyModel[33] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportImportBody5
		bodyModel[34] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import ImportImportBody6
		bodyModel[35] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportImportLTrack1
		bodyModel[36] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportImportLTrack2
		bodyModel[37] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportImportRtrack1
		bodyModel[38] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import ImportImportRtrack2
		bodyModel[39] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import ImportBox1
		bodyModel[40] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox2
		bodyModel[41] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox3
		bodyModel[42] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox4
		bodyModel[43] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox5
		bodyModel[44] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox6
		bodyModel[45] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox7
		bodyModel[46] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import ImportBox9
		bodyModel[47] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import ImportBox10
		bodyModel[48] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import ImportBox11
		bodyModel[49] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import ImportBox12
		bodyModel[50] = new ModelRendererTurbo(this, 600, 2, textureX, textureY); // Import ImportBox13

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportImportLTBody1
		bodyModel[0].setRotationPoint(84F, -22F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody2
		bodyModel[1].setRotationPoint(84F, -22F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody3
		bodyModel[2].setRotationPoint(100F, -22F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportImportLTBody4
		bodyModel[3].setRotationPoint(100F, -22F, 40F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportImportLTBody5
		bodyModel[4].setRotationPoint(100F, -6F, 56F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportImportLTBody6
		bodyModel[5].setRotationPoint(84F, -6F, 56F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody7
		bodyModel[6].setRotationPoint(84F, -22F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody8
		bodyModel[7].setRotationPoint(100F, -22F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportImportLTrack9
		bodyModel[8].setRotationPoint(52F, -14F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,1F, 4F, 0F,1F, 4F, 0F,0F, -8F, 0F,0F, -8F, -16F,1F, 0F, 0F,1F, 0F, 0F,0F, -4F, 0F,0F, -4F, -16F); // Import ImportImportLTrack10
		bodyModel[9].setRotationPoint(68F, -14F, 40F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody11
		bodyModel[10].setRotationPoint(84F, -6F, 16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportImportLTBody12
		bodyModel[11].setRotationPoint(100F, -6F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportLTrack13
		bodyModel[12].setRotationPoint(52F, -18F, 24F);

		bodyModel[13].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportLTrack14
		bodyModel[13].setRotationPoint(52F, -18F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportImportLTrack15
		bodyModel[14].setRotationPoint(52F, -16F, 30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportImportRTBody1
		bodyModel[15].setRotationPoint(84F, -22F, -40F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody2
		bodyModel[16].setRotationPoint(84F, -22F, -64F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody3
		bodyModel[17].setRotationPoint(100F, -22F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, -20F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody4
		bodyModel[18].setRotationPoint(100F, -22F, -64F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportImportRTBody5
		bodyModel[19].setRotationPoint(100F, -6F, -64F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody6
		bodyModel[20].setRotationPoint(84F, -6F, -64F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody7
		bodyModel[21].setRotationPoint(84F, -22F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportImportRTBody8
		bodyModel[22].setRotationPoint(100F, -22F, -24F);

		bodyModel[23].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportImportRTrack9
		bodyModel[23].setRotationPoint(52F, -14F, -40F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, -8F, -16F,0F, -8F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, -4F, -16F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTrack10
		bodyModel[24].setRotationPoint(68F, -14F, -64F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportImportRTBody11
		bodyModel[25].setRotationPoint(84F, -6F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportImportRTBody12
		bodyModel[26].setRotationPoint(100F, -6F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportRTrack13
		bodyModel[27].setRotationPoint(52F, -18F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportRTrack14
		bodyModel[28].setRotationPoint(52F, -18F, -40F);

		bodyModel[29].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportImportRTrack15
		bodyModel[29].setRotationPoint(52F, -16F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 96, 24, 80, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBody1
		bodyModel[30].setRotationPoint(-44F, -22F, -40F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 8F, 0F,0F, 8F, 0F,-8F, 0F, 0F,-16F, 0F, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F); // Import ImportImportBody3
		bodyModel[31].setRotationPoint(-44F, -14F, 40F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-16F, 0F, 0F); // Import ImportImportBody4
		bodyModel[32].setRotationPoint(-44F, -6F, 40F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 8F, 0F,-8F, 8F, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBody5
		bodyModel[33].setRotationPoint(-44F, -14F, -63F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F); // Import ImportImportBody6
		bodyModel[34].setRotationPoint(-44F, -6F, -63F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportImportLTrack1
		bodyModel[35].setRotationPoint(84F, -2F, 24F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportImportLTrack2
		bodyModel[36].setRotationPoint(-60F, -2F, 24F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportImportRtrack1
		bodyModel[37].setRotationPoint(84F, -2F, -56F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 80, 12, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, 0F); // Import ImportImportRtrack2
		bodyModel[38].setRotationPoint(-60F, -2F, -56F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 22, 25, 80, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F); // Import ImportBox1
		bodyModel[39].setRotationPoint(52F, -23F, -40F);

		bodyModel[40].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox2
		bodyModel[40].setRotationPoint(-26F, -15F, 40F);

		bodyModel[41].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox3
		bodyModel[41].setRotationPoint(-12F, -15F, 40F);

		bodyModel[42].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox4
		bodyModel[42].setRotationPoint(2F, -15F, 40F);

		bodyModel[43].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox5
		bodyModel[43].setRotationPoint(-12F, -15F, -63F);

		bodyModel[44].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox6
		bodyModel[44].setRotationPoint(-26F, -15F, -63F);

		bodyModel[45].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox7
		bodyModel[45].setRotationPoint(2F, -15F, -63F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox9
		bodyModel[46].setRotationPoint(84F, -6F, 24F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox10
		bodyModel[47].setRotationPoint(84F, -6F, -56F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox11
		bodyModel[48].setRotationPoint(-60F, -6F, 24F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 80, 4, 32, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox12
		bodyModel[49].setRotationPoint(-60F, -6F, -56F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 25, 80, 0F,0F, -4F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -16F,0F, -10F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -16F); // Import ImportBox13
		bodyModel[50].setRotationPoint(-61F, -23F, -40F);


		turretModel = new ModelRendererTurbo[37];
		turretModel[0] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import ImportBox20
		turretModel[1] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Import ImportBox21
		turretModel[2] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Import ImportBox22
		turretModel[3] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import ImportBox29
		turretModel[4] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import ImportBox30
		turretModel[5] = new ModelRendererTurbo(this, 0, 875, textureX, textureY); // Import ImportBox31
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox32
		turretModel[7] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import ImportBox33
		turretModel[8] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import ImportBox34
		turretModel[9] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import ImportBox35
		turretModel[10] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportBox36
		turretModel[11] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportBox37
		turretModel[12] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import ImportBox38
		turretModel[13] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import ImportBox39
		turretModel[14] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import ImportBox40
		turretModel[15] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import ImportBox41
		turretModel[16] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import ImportBox42
		turretModel[17] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import ImportBox43
		turretModel[18] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Import ImportBox44
		turretModel[19] = new ModelRendererTurbo(this, 0, 875, textureX, textureY); // Import ImportBox45
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox46
		turretModel[21] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import ImportBox47
		turretModel[22] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import ImportBox48
		turretModel[23] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import ImportBox49
		turretModel[24] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import ImportBox50
		turretModel[25] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import ImportBox51
		turretModel[26] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportBox52
		turretModel[27] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import ImportBox53
		turretModel[28] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportBox54--
		turretModel[29] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import ImportBox55
		turretModel[30] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import Box1
		turretModel[31] = new ModelRendererTurbo(this, 600, 340, textureX, textureY); // Import Box110
		turretModel[32] = new ModelRendererTurbo(this, 600, 340, textureX, textureY); // Import Box111
		turretModel[33] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Import Box133
		turretModel[34] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Import Box134
		turretModel[35] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Import Box135
		turretModel[36] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Import Box136

		turretModel[0].addBox(0F, 0F, 0F, 40, 2, 48, 0F); // Import ImportBox20
		turretModel[0].setRotationPoint(-20F, -25F, -24F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 48, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Import ImportBox21
		turretModel[1].setRotationPoint(-24F, -25F, -24F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 48, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Import ImportBox22
		turretModel[2].setRotationPoint(20F, -25F, -24F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 72, 14, 10, 0F,0F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F); // Import ImportBox29
		turretModel[3].setRotationPoint(-7F, -39F, -16F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 72, 14, 4, 0F,0F, 0F, 0F,-25F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox30
		turretModel[4].setRotationPoint(-7F, -39F, -20F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, -5F, 0F,-5F, -5F, 0F,-5F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox31
		turretModel[5].setRotationPoint(0F, -39F, -27F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox32
		turretModel[6].setRotationPoint(-20F, -39F, -27F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox33
		turretModel[7].setRotationPoint(13F, -29F, -21F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox34
		turretModel[8].setRotationPoint(7F, -33F, -21F);

		turretModel[9].addBox(0F, 0F, 0F, 13, 14, 20, 0F); // Import ImportBox35
		turretModel[9].setRotationPoint(-20F, -39F, -20F);

		turretModel[10].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportBox36
		turretModel[10].setRotationPoint(58F, -28F, -11F);

		turretModel[11].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportBox37
		turretModel[11].setRotationPoint(50F, -32F, -11F);

		turretModel[12].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportBox38
		turretModel[12].setRotationPoint(58F, -28.5F, -11.5F);

		turretModel[13].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportBox39
		turretModel[13].setRotationPoint(51F, -32.5F, -11.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F,0F, -5F, -7F,0F, -5F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 0F, -7F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox40
		turretModel[14].setRotationPoint(-27F, -39F, -27F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 7, 14, 10, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, -5F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F); // Import ImportBox41
		turretModel[15].setRotationPoint(-27F, -39F, -20F);

		turretModel[16].addBox(0F, 0F, 0F, 13, 14, 20, 0F); // Import ImportBox42
		turretModel[16].setRotationPoint(-20F, -39F, 0F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 72, 14, 10, 0F,0F, 0F, -2F,-20F, 0F, -2F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox43
		turretModel[17].setRotationPoint(-7F, -39F, 6F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 72, 14, 4, 0F,0F, 0F, 0F,-20F, 0F, 0F,-25F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F); // Import ImportBox44
		turretModel[18].setRotationPoint(-7F, -39F, 16F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,-5F, -5F, 0F,-5F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox45
		turretModel[19].setRotationPoint(0F, -39F, 20F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox46
		turretModel[20].setRotationPoint(-20F, -39F, 20F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 7, 14, 10, 0F,0F, -5F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, -5F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox47
		turretModel[21].setRotationPoint(-27F, -39F, 10F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, -7F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -7F); // Import ImportBox48
		turretModel[22].setRotationPoint(-27F, -39F, 20F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F); // Import ImportBox49
		turretModel[23].setRotationPoint(7F, -33F, 20F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F); // Import ImportBox50
		turretModel[24].setRotationPoint(13F, -29F, 20F);

		turretModel[25].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportBox51
		turretModel[25].setRotationPoint(51F, -32.5F, 9.5F);

		turretModel[26].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportBox52
		turretModel[26].setRotationPoint(50F, -32F, 10F);

		turretModel[27].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportBox53
		turretModel[27].setRotationPoint(58F, -28.5F, 9.5F);

		turretModel[28].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportBox54--
		turretModel[28].setRotationPoint(58F, -28F, 10F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 18, 14, 20, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, -10F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, -10F, 2F); // Import ImportBox55
		turretModel[29].setRotationPoint(-38F, -39F, -10F);

		turretModel[30].addBox(0F, 0F, 0F, 40, 14, 16, 0F); // Import Box1
		turretModel[30].setRotationPoint(-7F, -39F, -8F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 35, 12, 4, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box110
		turretModel[31].setRotationPoint(-38F, -51F, -12F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 35, 12, 4, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box111
		turretModel[32].setRotationPoint(-38F, -51F, 8F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 35, 9, 2, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box133
		turretModel[33].setRotationPoint(-23F, -48F, -11F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 35, 9, 2, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box134
		turretModel[34].setRotationPoint(-23F, -48F, 9F);

		turretModel[35].addShapeBox(0F, 0F, 0.5F, 35, 4, 1, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box135
		turretModel[35].setRotationPoint(-8F, -43F, -11F);

		turretModel[36].addShapeBox(0F, 0F, 0.5F, 35, 4, 1, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box136
		turretModel[36].setRotationPoint(-8F, -43F, 9F);


		barrelModel = new ModelRendererTurbo[107];
		barrelModel[0] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import Box2
		barrelModel[1] = new ModelRendererTurbo(this, 600, 155, textureX, textureY); // Import Box3
		barrelModel[2] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box4
		barrelModel[3] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box5
		barrelModel[4] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box6
		barrelModel[5] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box7
		barrelModel[6] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box8
		barrelModel[7] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box9
		barrelModel[8] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box10
		barrelModel[9] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box11
		barrelModel[10] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box12
		barrelModel[11] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box13
		barrelModel[12] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box14
		barrelModel[13] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box15
		barrelModel[14] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box24
		barrelModel[15] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box25
		barrelModel[16] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box26
		barrelModel[17] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box27
		barrelModel[18] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box28
		barrelModel[19] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box29
		barrelModel[20] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box32
		barrelModel[21] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box33
		barrelModel[22] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box34
		barrelModel[23] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box35
		barrelModel[24] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box36
		barrelModel[25] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box37
		barrelModel[26] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box40
		barrelModel[27] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box41
		barrelModel[28] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box42
		barrelModel[29] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box43
		barrelModel[30] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box44
		barrelModel[31] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box45
		barrelModel[32] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box46
		barrelModel[33] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box47
		barrelModel[34] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box48
		barrelModel[35] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box49
		barrelModel[36] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box50
		barrelModel[37] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box51
		barrelModel[38] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box52
		barrelModel[39] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box54
		barrelModel[40] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box55
		barrelModel[41] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box56
		barrelModel[42] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box58
		barrelModel[43] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box59
		barrelModel[44] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box60
		barrelModel[45] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box61
		barrelModel[46] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box64
		barrelModel[47] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box65
		barrelModel[48] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box66
		barrelModel[49] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box67
		barrelModel[50] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box68
		barrelModel[51] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box69
		barrelModel[52] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box70
		barrelModel[53] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box71
		barrelModel[54] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box72
		barrelModel[55] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box73
		barrelModel[56] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box74
		barrelModel[57] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box75
		barrelModel[58] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box76
		barrelModel[59] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box78
		barrelModel[60] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box79
		barrelModel[61] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box80
		barrelModel[62] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box82
		barrelModel[63] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box83
		barrelModel[64] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box84
		barrelModel[65] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box85
		barrelModel[66] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box88
		barrelModel[67] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box89
		barrelModel[68] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box90
		barrelModel[69] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box91
		barrelModel[70] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box92
		barrelModel[71] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box93
		barrelModel[72] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box94
		barrelModel[73] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box95
		barrelModel[74] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box96
		barrelModel[75] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box97
		barrelModel[76] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box98
		barrelModel[77] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box99
		barrelModel[78] = new ModelRendererTurbo(this, 650, 250, textureX, textureY); // Import Box100
		barrelModel[79] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box102
		barrelModel[80] = new ModelRendererTurbo(this, 600, 270, textureX, textureY); // Import Box103
		barrelModel[81] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import Box104
		barrelModel[82] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box106
		barrelModel[83] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box107
		barrelModel[84] = new ModelRendererTurbo(this, 600, 230, textureX, textureY); // Import Box108
		barrelModel[85] = new ModelRendererTurbo(this, 600, 250, textureX, textureY); // Import Box109
		barrelModel[86] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Import Box112
		barrelModel[87] = new ModelRendererTurbo(this, 600, 480, textureX, textureY); // Import Box113
		barrelModel[88] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box115
		barrelModel[89] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box116
		barrelModel[90] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box117
		barrelModel[91] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box118
		barrelModel[92] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box119
		barrelModel[93] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box120
		barrelModel[94] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box121
		barrelModel[95] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box122
		barrelModel[96] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box123
		barrelModel[97] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box124
		barrelModel[98] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box125
		barrelModel[99] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box126
		barrelModel[100] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box127
		barrelModel[101] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box128
		barrelModel[102] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box129
		barrelModel[103] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box130
		barrelModel[104] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box131
		barrelModel[105] = new ModelRendererTurbo(this, 600, 280, textureX, textureY); // Import Box132
		barrelModel[106] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Import Box137

		barrelModel[0].addBox(0F, 0F, -8F, 12, 14, 16, 0F); // Import Box2
		barrelModel[0].setRotationPoint(33F, -39F, 0F);

		barrelModel[1].addShapeBox(12F, 0F, -7F, 2, 14, 14, 0F,0F, 0F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F); // Import Box3
		barrelModel[1].setRotationPoint(33F, -39F, 0F);

		barrelModel[2].addShapeBox(14F, 1F, -6F, 12, 5, 5, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Import Box4
		barrelModel[2].setRotationPoint(33F, -39F, 0F);

		barrelModel[3].addShapeBox(14F, 1F, 1F, 12, 5, 5, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Import Box5
		barrelModel[3].setRotationPoint(33F, -39F, 0F);

		barrelModel[4].addShapeBox(14F, 8F, 1F, 12, 5, 5, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Import Box6
		barrelModel[4].setRotationPoint(33F, -39F, 0F);

		barrelModel[5].addShapeBox(14F, 8F, -6F, 12, 5, 5, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Import Box7
		barrelModel[5].setRotationPoint(33F, -39F, 0F);

		barrelModel[6].addShapeBox(26F, 1F, -6F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box8
		barrelModel[6].setRotationPoint(33F, -39F, 0F);

		barrelModel[7].addShapeBox(26F, 5F, -6F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box9
		barrelModel[7].setRotationPoint(33F, -39F, 0F);

		barrelModel[8].addBox(28F, 5F, -5F, 3, 1, 3, 0F); // Import Box10
		barrelModel[8].setRotationPoint(33F, -39F, 0F);

		barrelModel[9].addBox(28F, 1F, -5F, 3, 1, 3, 0F); // Import Box11
		barrelModel[9].setRotationPoint(33F, -39F, 0F);

		barrelModel[10].addBox(31F, 1F, -6F, 3, 1, 5, 0F); // Import Box12
		barrelModel[10].setRotationPoint(33F, -39F, 0F);

		barrelModel[11].addBox(31F, 5F, -6F, 3, 1, 5, 0F); // Import Box13
		barrelModel[11].setRotationPoint(33F, -39F, 0F);

		barrelModel[12].addBox(31F, 2F, -6F, 3, 3, 1, 0F); // Import Box14
		barrelModel[12].setRotationPoint(33F, -39F, 0F);

		barrelModel[13].addBox(31F, 2F, -2F, 3, 3, 1, 0F); // Import Box15
		barrelModel[13].setRotationPoint(33F, -39F, 0F);

		barrelModel[14].addBox(34F, 1F, -5F, 5, 1, 3, 0F); // Import Box24
		barrelModel[14].setRotationPoint(33F, -39F, 0F);

		barrelModel[15].addBox(34F, 5F, -5F, 5, 1, 3, 0F); // Import Box25
		barrelModel[15].setRotationPoint(33F, -39F, 0F);

		barrelModel[16].addBox(39F, 5F, -6F, 3, 1, 5, 0F); // Import Box26
		barrelModel[16].setRotationPoint(33F, -39F, 0F);

		barrelModel[17].addBox(39F, 2F, -6F, 3, 3, 1, 0F); // Import Box27
		barrelModel[17].setRotationPoint(33F, -39F, 0F);

		barrelModel[18].addBox(39F, 2F, -2F, 3, 3, 1, 0F); // Import Box28
		barrelModel[18].setRotationPoint(33F, -39F, 0F);

		barrelModel[19].addBox(39F, 1F, -6F, 3, 1, 5, 0F); // Import Box29
		barrelModel[19].setRotationPoint(33F, -39F, 0F);

		barrelModel[20].addBox(42F, 1F, -5F, 5, 1, 3, 0F); // Import Box32
		barrelModel[20].setRotationPoint(33F, -39F, 0F);

		barrelModel[21].addBox(42F, 5F, -5F, 5, 1, 3, 0F); // Import Box33
		barrelModel[21].setRotationPoint(33F, -39F, 0F);

		barrelModel[22].addBox(47F, 5F, -6F, 3, 1, 5, 0F); // Import Box34
		barrelModel[22].setRotationPoint(33F, -39F, 0F);

		barrelModel[23].addBox(47F, 2F, -6F, 3, 3, 1, 0F); // Import Box35
		barrelModel[23].setRotationPoint(33F, -39F, 0F);

		barrelModel[24].addBox(47F, 2F, -2F, 3, 3, 1, 0F); // Import Box36
		barrelModel[24].setRotationPoint(33F, -39F, 0F);

		barrelModel[25].addBox(47F, 1F, -6F, 3, 1, 5, 0F); // Import Box37
		barrelModel[25].setRotationPoint(33F, -39F, 0F);

		barrelModel[26].addBox(42F, 1F, 2F, 5, 1, 3, 0F); // Import Box40
		barrelModel[26].setRotationPoint(33F, -39F, 0F);

		barrelModel[27].addBox(42F, 5F, 2F, 5, 1, 3, 0F); // Import Box41
		barrelModel[27].setRotationPoint(33F, -39F, 0F);

		barrelModel[28].addBox(47F, 5F, 1F, 3, 1, 5, 0F); // Import Box42
		barrelModel[28].setRotationPoint(33F, -39F, 0F);

		barrelModel[29].addBox(47F, 2F, 1F, 3, 3, 1, 0F); // Import Box43
		barrelModel[29].setRotationPoint(33F, -39F, 0F);

		barrelModel[30].addBox(47F, 2F, 5F, 3, 3, 1, 0F); // Import Box44
		barrelModel[30].setRotationPoint(33F, -39F, 0F);

		barrelModel[31].addBox(47F, 1F, 1F, 3, 1, 5, 0F); // Import Box45
		barrelModel[31].setRotationPoint(33F, -39F, 0F);

		barrelModel[32].addBox(39F, 2F, 5F, 3, 3, 1, 0F); // Import Box46
		barrelModel[32].setRotationPoint(33F, -39F, 0F);

		barrelModel[33].addBox(39F, 1F, 1F, 3, 1, 5, 0F); // Import Box47
		barrelModel[33].setRotationPoint(33F, -39F, 0F);

		barrelModel[34].addBox(39F, 2F, 1F, 3, 3, 1, 0F); // Import Box48
		barrelModel[34].setRotationPoint(33F, -39F, 0F);

		barrelModel[35].addBox(39F, 5F, 1F, 3, 1, 5, 0F); // Import Box49
		barrelModel[35].setRotationPoint(33F, -39F, 0F);

		barrelModel[36].addBox(34F, 1F, 2F, 5, 1, 3, 0F); // Import Box50
		barrelModel[36].setRotationPoint(33F, -39F, 0F);

		barrelModel[37].addBox(31F, 2F, 1F, 3, 3, 1, 0F); // Import Box51
		barrelModel[37].setRotationPoint(33F, -39F, 0F);

		barrelModel[38].addBox(34F, 5F, 2F, 5, 1, 3, 0F); // Import Box52
		barrelModel[38].setRotationPoint(33F, -39F, 0F);

		barrelModel[39].addBox(31F, 5F, 1F, 3, 1, 5, 0F); // Import Box54
		barrelModel[39].setRotationPoint(33F, -39F, 0F);

		barrelModel[40].addBox(31F, 2F, 5F, 3, 3, 1, 0F); // Import Box55
		barrelModel[40].setRotationPoint(33F, -39F, 0F);

		barrelModel[41].addBox(31F, 1F, 1F, 3, 1, 5, 0F); // Import Box56
		barrelModel[41].setRotationPoint(33F, -39F, 0F);

		barrelModel[42].addBox(28F, 1F, 2F, 3, 1, 3, 0F); // Import Box58
		barrelModel[42].setRotationPoint(33F, -39F, 0F);

		barrelModel[43].addShapeBox(26F, 1F, 1F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box59
		barrelModel[43].setRotationPoint(33F, -39F, 0F);

		barrelModel[44].addShapeBox(26F, 5F, 1F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box60
		barrelModel[44].setRotationPoint(33F, -39F, 0F);

		barrelModel[45].addBox(28F, 5F, 2F, 3, 1, 3, 0F); // Import Box61
		barrelModel[45].setRotationPoint(33F, -39F, 0F);

		barrelModel[46].addBox(42F, 8F, 2F, 5, 1, 3, 0F); // Import Box64
		barrelModel[46].setRotationPoint(33F, -39F, 0F);

		barrelModel[47].addBox(42F, 12F, 2F, 5, 1, 3, 0F); // Import Box65
		barrelModel[47].setRotationPoint(33F, -39F, 0F);

		barrelModel[48].addBox(47F, 12F, 1F, 3, 1, 5, 0F); // Import Box66
		barrelModel[48].setRotationPoint(33F, -39F, 0F);

		barrelModel[49].addBox(47F, 9F, 1F, 3, 3, 1, 0F); // Import Box67
		barrelModel[49].setRotationPoint(33F, -39F, 0F);

		barrelModel[50].addBox(47F, 9F, 5F, 3, 3, 1, 0F); // Import Box68
		barrelModel[50].setRotationPoint(33F, -39F, 0F);

		barrelModel[51].addBox(47F, 8F, 1F, 3, 1, 5, 0F); // Import Box69
		barrelModel[51].setRotationPoint(33F, -39F, 0F);

		barrelModel[52].addBox(39F, 9F, 5F, 3, 3, 1, 0F); // Import Box70
		barrelModel[52].setRotationPoint(33F, -39F, 0F);

		barrelModel[53].addBox(39F, 8F, 1F, 3, 1, 5, 0F); // Import Box71
		barrelModel[53].setRotationPoint(33F, -39F, 0F);

		barrelModel[54].addBox(39F, 9F, 1F, 3, 3, 1, 0F); // Import Box72
		barrelModel[54].setRotationPoint(33F, -39F, 0F);

		barrelModel[55].addBox(39F, 12F, 1F, 3, 1, 5, 0F); // Import Box73
		barrelModel[55].setRotationPoint(33F, -39F, 0F);

		barrelModel[56].addBox(34F, 8F, 2F, 5, 1, 3, 0F); // Import Box74
		barrelModel[56].setRotationPoint(33F, -39F, 0F);

		barrelModel[57].addBox(31F, 9F, 1F, 3, 3, 1, 0F); // Import Box75
		barrelModel[57].setRotationPoint(33F, -39F, 0F);

		barrelModel[58].addBox(34F, 12F, 2F, 5, 1, 3, 0F); // Import Box76
		barrelModel[58].setRotationPoint(33F, -39F, 0F);

		barrelModel[59].addBox(31F, 12F, 1F, 3, 1, 5, 0F); // Import Box78
		barrelModel[59].setRotationPoint(33F, -39F, 0F);

		barrelModel[60].addBox(31F, 9F, 5F, 3, 3, 1, 0F); // Import Box79
		barrelModel[60].setRotationPoint(33F, -39F, 0F);

		barrelModel[61].addBox(31F, 8F, 1F, 3, 1, 5, 0F); // Import Box80
		barrelModel[61].setRotationPoint(33F, -39F, 0F);

		barrelModel[62].addBox(28F, 8F, 2F, 3, 1, 3, 0F); // Import Box82
		barrelModel[62].setRotationPoint(33F, -39F, 0F);

		barrelModel[63].addShapeBox(26F, 8F, 1F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box83
		barrelModel[63].setRotationPoint(33F, -39F, 0F);

		barrelModel[64].addShapeBox(26F, 12F, 1F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box84
		barrelModel[64].setRotationPoint(33F, -39F, 0F);

		barrelModel[65].addBox(28F, 12F, 2F, 3, 1, 3, 0F); // Import Box85
		barrelModel[65].setRotationPoint(33F, -39F, 0F);

		barrelModel[66].addBox(42F, 8F, -5F, 5, 1, 3, 0F); // Import Box88
		barrelModel[66].setRotationPoint(33F, -39F, 0F);

		barrelModel[67].addBox(42F, 12F, -5F, 5, 1, 3, 0F); // Import Box89
		barrelModel[67].setRotationPoint(33F, -39F, 0F);

		barrelModel[68].addBox(47F, 12F, -6F, 3, 1, 5, 0F); // Import Box90
		barrelModel[68].setRotationPoint(33F, -39F, 0F);

		barrelModel[69].addBox(47F, 9F, -6F, 3, 3, 1, 0F); // Import Box91
		barrelModel[69].setRotationPoint(33F, -39F, 0F);

		barrelModel[70].addBox(47F, 9F, -2F, 3, 3, 1, 0F); // Import Box92
		barrelModel[70].setRotationPoint(33F, -39F, 0F);

		barrelModel[71].addBox(47F, 8F, -6F, 3, 1, 5, 0F); // Import Box93
		barrelModel[71].setRotationPoint(33F, -39F, 0F);

		barrelModel[72].addBox(39F, 9F, -2F, 3, 3, 1, 0F); // Import Box94
		barrelModel[72].setRotationPoint(33F, -39F, 0F);

		barrelModel[73].addBox(39F, 8F, -6F, 3, 1, 5, 0F); // Import Box95
		barrelModel[73].setRotationPoint(33F, -39F, 0F);

		barrelModel[74].addBox(39F, 9F, -6F, 3, 3, 1, 0F); // Import Box96
		barrelModel[74].setRotationPoint(33F, -39F, 0F);

		barrelModel[75].addBox(39F, 12F, -6F, 3, 1, 5, 0F); // Import Box97
		barrelModel[75].setRotationPoint(33F, -39F, 0F);

		barrelModel[76].addBox(34F, 8F, -5F, 5, 1, 3, 0F); // Import Box98
		barrelModel[76].setRotationPoint(33F, -39F, 0F);

		barrelModel[77].addBox(31F, 9F, -6F, 3, 3, 1, 0F); // Import Box99
		barrelModel[77].setRotationPoint(33F, -39F, 0F);

		barrelModel[78].addBox(34F, 12F, -5F, 5, 1, 3, 0F); // Import Box100
		barrelModel[78].setRotationPoint(33F, -39F, 0F);

		barrelModel[79].addBox(31F, 12F, -6F, 3, 1, 5, 0F); // Import Box102
		barrelModel[79].setRotationPoint(33F, -39F, 0F);

		barrelModel[80].addBox(31F, 9F, -2F, 3, 3, 1, 0F); // Import Box103
		barrelModel[80].setRotationPoint(33F, -39F, 0F);

		barrelModel[81].addBox(31F, 8F, -6F, 3, 1, 5, 0F); // Import Box104
		barrelModel[81].setRotationPoint(33F, -39F, 0F);

		barrelModel[82].addBox(28F, 8F, -5F, 3, 1, 3, 0F); // Import Box106
		barrelModel[82].setRotationPoint(33F, -39F, 0F);

		barrelModel[83].addShapeBox(26F, 8F, -6F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box107
		barrelModel[83].setRotationPoint(33F, -39F, 0F);

		barrelModel[84].addShapeBox(26F, 12F, -6F, 2, 1, 5, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import Box108
		barrelModel[84].setRotationPoint(33F, -39F, 0F);

		barrelModel[85].addBox(28F, 12F, -5F, 3, 1, 3, 0F); // Import Box109
		barrelModel[85].setRotationPoint(33F, -39F, 0F);

		barrelModel[86].addBox(-7F, -11F, -8F, 35, 16, 16, 0F); // Import Box112
		barrelModel[86].setRotationPoint(-23F, -44F, 0F);

		barrelModel[87].addShapeBox(-12F, -11F, -8F, 5, 16, 16, 0F,0F, -4F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -4F,0F, -4F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -4F); // Import Box113
		barrelModel[87].setRotationPoint(-23F, -44F, 0F);

		barrelModel[88].addBox(28F, -10F, -7F, 2, 4, 4, 0F); // Import Box115
		barrelModel[88].setRotationPoint(-23F, -44F, 0F);

		barrelModel[89].addBox(28F, -10F, -2F, 2, 4, 4, 0F); // Import Box116
		barrelModel[89].setRotationPoint(-23F, -44F, 0F);

		barrelModel[90].addBox(28F, -10F, 3F, 2, 4, 4, 0F); // Import Box117
		barrelModel[90].setRotationPoint(-23F, -44F, 0F);

		barrelModel[91].addBox(28F, -5F, 3F, 2, 4, 4, 0F); // Import Box118
		barrelModel[91].setRotationPoint(-23F, -44F, 0F);

		barrelModel[92].addBox(28F, -5F, -2F, 2, 4, 4, 0F); // Import Box119
		barrelModel[92].setRotationPoint(-23F, -44F, 0F);

		barrelModel[93].addBox(28F, -5F, -7F, 2, 4, 4, 0F); // Import Box120
		barrelModel[93].setRotationPoint(-23F, -44F, 0F);

		barrelModel[94].addBox(28F, 0F, 3F, 2, 4, 4, 0F); // Import Box121
		barrelModel[94].setRotationPoint(-23F, -44F, 0F);

		barrelModel[95].addBox(28F, 0F, -2F, 2, 4, 4, 0F); // Import Box122
		barrelModel[95].setRotationPoint(-23F, -44F, 0F);

		barrelModel[96].addBox(28F, 0F, -7F, 2, 4, 4, 0F); // Import Box123
		barrelModel[96].setRotationPoint(-23F, -44F, 0F);

		barrelModel[97].addShapeBox(30F, -10F, -7F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box124
		barrelModel[97].setRotationPoint(-23F, -44F, 0F);

		barrelModel[98].addShapeBox(30F, -10F, -2F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box125
		barrelModel[98].setRotationPoint(-23F, -44F, 0F);

		barrelModel[99].addShapeBox(30F, -10F, 3F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box126
		barrelModel[99].setRotationPoint(-23F, -44F, 0F);

		barrelModel[100].addShapeBox(30F, -5F, 3F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box127
		barrelModel[100].setRotationPoint(-23F, -44F, 0F);

		barrelModel[101].addShapeBox(30F, -5F, -2F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box128
		barrelModel[101].setRotationPoint(-23F, -44F, 0F);

		barrelModel[102].addShapeBox(30F, -5F, -7F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box129
		barrelModel[102].setRotationPoint(-23F, -44F, 0F);

		barrelModel[103].addShapeBox(30F, 0F, 3F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box130
		barrelModel[103].setRotationPoint(-23F, -44F, 0F);

		barrelModel[104].addShapeBox(30F, 0F, -2F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box131
		barrelModel[104].setRotationPoint(-23F, -44F, 0F);

		barrelModel[105].addShapeBox(30F, 0F, -7F, 2, 4, 4, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import Box132
		barrelModel[105].setRotationPoint(-23F, -44F, 0F);

		barrelModel[106].addShapeBox(-1F, -13F, -6F, 20, 2, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F); // Import Box137
		barrelModel[106].setRotationPoint(-23F, -44F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
