//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeviathanIITD extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeviathanIITD()
	{
		bodyModel = new ModelRendererTurbo[69];
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
		bodyModel[51] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import Box0
		bodyModel[52] = new ModelRendererTurbo(this, 600, 220, textureX, textureY); // Import Box1
		bodyModel[53] = new ModelRendererTurbo(this, 600, 275, textureX, textureY); // Import Box2
		bodyModel[54] = new ModelRendererTurbo(this, 600, 220, textureX, textureY); // Import Box3
		bodyModel[55] = new ModelRendererTurbo(this, 600, 275, textureX, textureY); // Import Box4
		bodyModel[56] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box5
		bodyModel[57] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box6
		bodyModel[58] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box7
		bodyModel[59] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box8
		bodyModel[60] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box9
		bodyModel[61] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import Box10
		bodyModel[62] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box11
		bodyModel[63] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box12
		bodyModel[64] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box13
		bodyModel[65] = new ModelRendererTurbo(this, 600, 350, textureX, textureY); // Import Box14
		bodyModel[66] = new ModelRendererTurbo(this, 600, 380, textureX, textureY); // Import Box15
		bodyModel[67] = new ModelRendererTurbo(this, 600, 430, textureX, textureY); // Import Box16
		bodyModel[68] = new ModelRendererTurbo(this, 600, 480, textureX, textureY); // Import Box17

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportImportLTBody1
		bodyModel[0].setRotationPoint(84F, -22F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody2
		bodyModel[1].setRotationPoint(84F, -22F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody3
		bodyModel[2].setRotationPoint(100F, -22F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, 0F,-48F, 0F, 0F,-48F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportImportLTBody4
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

		bodyModel[51].addShapeBox(0F, 0F, 0F, 36, 16, 80, 0F,-16F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F,-16F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box0
		bodyModel[51].setRotationPoint(-44F, -39F, -40F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 37, 16, 30, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box1
		bodyModel[52].setRotationPoint(-8F, -39F, -40F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 23, 16, 30, 0F,0F, 0F, -8F,-16F, 0F, -8F,-16F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box2
		bodyModel[53].setRotationPoint(29F, -39F, -40F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 37, 16, 30, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box3
		bodyModel[54].setRotationPoint(-8F, -39F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 23, 16, 30, 0F,0F, 0F, 0F,-16F, 0F, 0F,-16F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box4
		bodyModel[55].setRotationPoint(29F, -39F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 37, 4, 12, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box5
		bodyModel[56].setRotationPoint(-17F, -43F, 14F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box6
		bodyModel[57].setRotationPoint(-13F, -44F, 12.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box7
		bodyModel[58].setRotationPoint(-5F, -44F, 12.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box8
		bodyModel[59].setRotationPoint(3F, -44F, 12.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box9
		bodyModel[60].setRotationPoint(11F, -44F, 12.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 37, 4, 12, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box10
		bodyModel[61].setRotationPoint(-17F, -43F, -26F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box11
		bodyModel[62].setRotationPoint(-13F, -44F, -27.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box12
		bodyModel[63].setRotationPoint(-5F, -44F, -27.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box13
		bodyModel[64].setRotationPoint(3F, -44F, -27.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box14
		bodyModel[65].setRotationPoint(11F, -44F, -27.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 24, 20, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box15
		bodyModel[66].setRotationPoint(-28F, -47F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 25, 24, 20, 0F); // Import Box16
		bodyModel[67].setRotationPoint(-18F, -47F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 24, 20, 0F,0F, 0F, 0F,0F, -8F, -1F,0F, -8F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, -1F,0F, -8F, -1F,0F, 0F, 0F); // Import Box17
		bodyModel[68].setRotationPoint(7F, -47F, -10F);


		barrelModel = new ModelRendererTurbo[20];
		barrelModel[0] = new ModelRendererTurbo(this, 600, 530, textureX, textureY); // Import Box18
		barrelModel[1] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Import Box19
		barrelModel[2] = new ModelRendererTurbo(this, 600, 625, textureX, textureY); // Import Box20
		barrelModel[3] = new ModelRendererTurbo(this, 600, 660, textureX, textureY); // Import Box21
		barrelModel[4] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Import Box22
		barrelModel[5] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Import Box23
		barrelModel[6] = new ModelRendererTurbo(this, 600, 720, textureX, textureY); // Import Box24
		barrelModel[7] = new ModelRendererTurbo(this, 600, 720, textureX, textureY); // Import Box25
		barrelModel[8] = new ModelRendererTurbo(this, 600, 720, textureX, textureY); // Import Box26
		barrelModel[9] = new ModelRendererTurbo(this, 600, 720, textureX, textureY); // Import Box27
		barrelModel[10] = new ModelRendererTurbo(this, 600, 730, textureX, textureY); // Import Box28
		barrelModel[11] = new ModelRendererTurbo(this, 600, 760, textureX, textureY); // Import Box29
		barrelModel[12] = new ModelRendererTurbo(this, 600, 760, textureX, textureY); // Import Box30
		barrelModel[13] = new ModelRendererTurbo(this, 600, 760, textureX, textureY); // Import Box31
		barrelModel[14] = new ModelRendererTurbo(this, 600, 760, textureX, textureY); // Import Box32
		barrelModel[15] = new ModelRendererTurbo(this, 600, 775, textureX, textureY); // Import Box34
		barrelModel[16] = new ModelRendererTurbo(this, 600, 800, textureX, textureY); // Import Box35
		barrelModel[17] = new ModelRendererTurbo(this, 600, 800, textureX, textureY); // Import Box36
		barrelModel[18] = new ModelRendererTurbo(this, 600, 820, textureX, textureY); // Import Box37
		barrelModel[19] = new ModelRendererTurbo(this, 600, 820, textureX, textureY); // Import Box38

		barrelModel[0].addBox(0F, -10F, -10F, 29, 20, 20, 0F); // Import Box18
		barrelModel[0].setRotationPoint(7F, -35F, 0F);

		barrelModel[1].addShapeBox(29F, -10F, -10F, 16, 20, 20, 0F,0F, 0F, 0F,0F, -2F, -2F,0F, -2F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F,0F, -2F, -2F,0F, 0F, 0F); // Import Box19
		barrelModel[1].setRotationPoint(7F, -35F, 0F);

		barrelModel[2].addBox(45F, -8F, -8F, 20, 16, 16, 0F); // Import Box20
		barrelModel[2].setRotationPoint(7F, -35F, 0F);

		barrelModel[3].addShapeBox(65F, -8F, -8F, 20, 16, 16, 0F,0F, 0F, 0F,0F, -3F, -3F,0F, -3F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, -3F,0F, -3F, -3F,0F, 0F, 0F); // Import Box21
		barrelModel[3].setRotationPoint(7F, -35F, 0F);

		barrelModel[4].addBox(85F, -5F, -5F, 60, 2, 10, 0F); // Import Box22
		barrelModel[4].setRotationPoint(7F, -35F, 0F);

		barrelModel[5].addBox(85F, 3F, -5F, 60, 2, 10, 0F); // Import Box23
		barrelModel[5].setRotationPoint(7F, -35F, 0F);

		barrelModel[6].addBox(85F, -3F, -5F, 60, 2, 2, 0F); // Import Box24
		barrelModel[6].setRotationPoint(7F, -35F, 0F);

		barrelModel[7].addBox(85F, 1F, -5F, 60, 2, 2, 0F); // Import Box25
		barrelModel[7].setRotationPoint(7F, -35F, 0F);

		barrelModel[8].addBox(85F, 1F, 3F, 60, 2, 2, 0F); // Import Box26
		barrelModel[8].setRotationPoint(7F, -35F, 0F);

		barrelModel[9].addBox(85F, -3F, 3F, 60, 2, 2, 0F); // Import Box27
		barrelModel[9].setRotationPoint(7F, -35F, 0F);

		barrelModel[10].addShapeBox(145F, -5F, -5F, 6, 10, 10, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F); // Import Box28
		barrelModel[10].setRotationPoint(7F, -35F, 0F);

		barrelModel[11].addBox(151F, -6F, -6F, 12, 4, 4, 0F); // Import Box29
		barrelModel[11].setRotationPoint(7F, -35F, 0F);

		barrelModel[12].addBox(151F, -6F, 2F, 12, 4, 4, 0F); // Import Box30
		barrelModel[12].setRotationPoint(7F, -35F, 0F);

		barrelModel[13].addBox(151F, 2F, 2F, 12, 4, 4, 0F); // Import Box31
		barrelModel[13].setRotationPoint(7F, -35F, 0F);

		barrelModel[14].addBox(151F, 2F, -6F, 12, 4, 4, 0F); // Import Box32
		barrelModel[14].setRotationPoint(7F, -35F, 0F);

		barrelModel[15].addShapeBox(163F, -5F, -5F, 8, 10, 10, 0F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F,0F, 1F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 1F); // Import Box34
		barrelModel[15].setRotationPoint(7F, -35F, 0F);

		barrelModel[16].addBox(155F, -2F, 3F, 4, 4, 2, 0F); // Import Box35
		barrelModel[16].setRotationPoint(7F, -35F, 0F);

		barrelModel[17].addBox(155F, -2F, -5F, 4, 4, 2, 0F); // Import Box36
		barrelModel[17].setRotationPoint(7F, -35F, 0F);

		barrelModel[18].addBox(155F, -5F, -2F, 4, 2, 4, 0F); // Import Box37
		barrelModel[18].setRotationPoint(7F, -35F, 0F);

		barrelModel[19].addBox(155F, 3F, -2F, 4, 2, 4, 0F); // Import Box38
		barrelModel[19].setRotationPoint(7F, -35F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
