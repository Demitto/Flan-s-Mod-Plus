//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeviathanIII extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeviathanIII()
	{
		bodyModel = new ModelRendererTurbo[71];
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
		bodyModel[35] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import ImportBox1
		bodyModel[36] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox2
		bodyModel[37] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox3
		bodyModel[38] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox4
		bodyModel[39] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox5
		bodyModel[40] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox6
		bodyModel[41] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox7
		bodyModel[42] = new ModelRendererTurbo(this, 600, 2, textureX, textureY); // Import ImportBox13
		bodyModel[43] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Box58
		bodyModel[44] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box59
		bodyModel[45] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box60
		bodyModel[46] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Box62
		bodyModel[47] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box63
		bodyModel[48] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box64
		bodyModel[49] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box65
		bodyModel[50] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box68
		bodyModel[51] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box69
		bodyModel[52] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Box70
		bodyModel[53] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box71
		bodyModel[54] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box72
		bodyModel[55] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Box73
		bodyModel[56] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box74
		bodyModel[57] = new ModelRendererTurbo(this, 0, 730, textureX, textureY); // Import Box75
		bodyModel[58] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box76
		bodyModel[59] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box77
		bodyModel[60] = new ModelRendererTurbo(this, 0, 760, textureX, textureY); // Import Box78
		bodyModel[61] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import Box79
		bodyModel[62] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import Box80
		bodyModel[63] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box81
		bodyModel[64] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box82
		bodyModel[65] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box83
		bodyModel[66] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box84
		bodyModel[67] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box85
		bodyModel[68] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box86
		bodyModel[69] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box87
		bodyModel[70] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import Box88

		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportImportLTBody1
		bodyModel[0].setRotationPoint(84F, -30F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody2
		bodyModel[1].setRotationPoint(84F, -30F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody3
		bodyModel[2].setRotationPoint(100F, -30F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportImportLTBody4
		bodyModel[3].setRotationPoint(100F, -30F, 40F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportImportLTBody5
		bodyModel[4].setRotationPoint(100F, -14F, 56F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportImportLTBody6
		bodyModel[5].setRotationPoint(84F, -14F, 56F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody7
		bodyModel[6].setRotationPoint(84F, -30F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody8
		bodyModel[7].setRotationPoint(100F, -30F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportImportLTrack9
		bodyModel[8].setRotationPoint(52F, -22F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,1F, 4F, 0F,1F, 4F, 0F,0F, -8F, 0F,0F, -8F, -16F,1F, 0F, 0F,1F, 0F, 0F,0F, -4F, 0F,0F, -4F, -16F); // Import ImportImportLTrack10
		bodyModel[9].setRotationPoint(68F, -22F, 40F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportLTBody11
		bodyModel[10].setRotationPoint(84F, -14F, 16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportImportLTBody12
		bodyModel[11].setRotationPoint(100F, -14F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportLTrack13
		bodyModel[12].setRotationPoint(52F, -26F, 24F);

		bodyModel[13].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportLTrack14
		bodyModel[13].setRotationPoint(52F, -26F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportImportLTrack15
		bodyModel[14].setRotationPoint(52F, -24F, 30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // Import ImportImportRTBody1
		bodyModel[15].setRotationPoint(84F, -30F, -40F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, 0F, -20F,0F, 0F, -20F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody2
		bodyModel[16].setRotationPoint(84F, -30F, -64F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody3
		bodyModel[17].setRotationPoint(100F, -30F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F,0F, 0F, -20F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody4
		bodyModel[18].setRotationPoint(100F, -30F, -64F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F,0F, 0F, 0F); // Import ImportImportRTBody5
		bodyModel[19].setRotationPoint(100F, -14F, -64F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody6
		bodyModel[20].setRotationPoint(84F, -14F, -64F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTBody7
		bodyModel[21].setRotationPoint(84F, -30F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F,0F, 0F, 0F,0F, -16F, 0F,0F, -16F, -8F,0F, -16F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Import ImportImportRTBody8
		bodyModel[22].setRotationPoint(100F, -30F, -24F);

		bodyModel[23].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // Import ImportImportRTrack9
		bodyModel[23].setRotationPoint(52F, -22F, -40F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F,0F, -8F, -16F,0F, -8F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, -4F, -16F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportRTrack10
		bodyModel[24].setRotationPoint(68F, -22F, -64F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F); // Import ImportImportRTBody11
		bodyModel[25].setRotationPoint(84F, -14F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, -8F,0F, -4F, 0F); // Import ImportImportRTBody12
		bodyModel[26].setRotationPoint(100F, -14F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportRTrack13
		bodyModel[27].setRotationPoint(52F, -26F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // Import ImportImportRTrack14
		bodyModel[28].setRotationPoint(52F, -26F, -40F);

		bodyModel[29].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // Import ImportImportRTrack15
		bodyModel[29].setRotationPoint(52F, -24F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 96, 24, 80, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBody1
		bodyModel[30].setRotationPoint(-44F, -30F, -40F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 8F, 0F,0F, 8F, 0F,-8F, 0F, 0F,-16F, 0F, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F); // Import ImportImportBody3
		bodyModel[31].setRotationPoint(-44F, -22F, 40F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,0F, 0F, 0F,16F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-16F, 0F, 0F); // Import ImportImportBody4
		bodyModel[32].setRotationPoint(-44F, -14F, 40F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 8F, 0F,-8F, 8F, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBody5
		bodyModel[33].setRotationPoint(-44F, -22F, -63F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F,-8F, 0F, 0F,8F, 0F, 0F,16F, 0F, 0F,0F, 0F, 0F,-16F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F); // Import ImportImportBody6
		bodyModel[34].setRotationPoint(-44F, -14F, -63F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 22, 25, 80, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -15F,0F, -10F, -15F,0F, 0F, 0F); // Import ImportBox1
		bodyModel[35].setRotationPoint(52F, -31F, -40F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox2
		bodyModel[36].setRotationPoint(-26F, -23F, 40F);

		bodyModel[37].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox3
		bodyModel[37].setRotationPoint(-12F, -23F, 40F);

		bodyModel[38].addShapeBox(0F, 0F, -1F, 12, 2, 23, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox4
		bodyModel[38].setRotationPoint(2F, -23F, 40F);

		bodyModel[39].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox5
		bodyModel[39].setRotationPoint(-12F, -23F, -63F);

		bodyModel[40].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox6
		bodyModel[40].setRotationPoint(-26F, -23F, -63F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 12, 2, 23, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 8F, 0F,0F, 8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBox7
		bodyModel[41].setRotationPoint(2F, -23F, -63F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 25, 80, 0F,0F, -4F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -16F,0F, -10F, -16F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -16F); // Import ImportBox13
		bodyModel[42].setRotationPoint(-61F, -31F, -40F);

		bodyModel[43].addBox(0F, 0F, 0F, 27, 20, 2, 0F); // Import Box58
		bodyModel[43].setRotationPoint(35F, -26F, 40F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F); // Import Box59
		bodyModel[44].setRotationPoint(30F, -26F, 40F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F); // Import Box60
		bodyModel[45].setRotationPoint(62F, -26F, 40F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 27, 20, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box62
		bodyModel[46].setRotationPoint(35F, -26F, 42F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F,0F, -5F, 0F,-2F, -7F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -5F, 0F,-2F, -7F, 0F,0F, -2F, 0F); // Import Box63
		bodyModel[47].setRotationPoint(62F, -26F, 42F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -2F, 0F,-2F, -7F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -2F, 0F,-2F, -7F, 0F); // Import Box64
		bodyModel[48].setRotationPoint(30F, -26F, 42F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F); // Import Box65
		bodyModel[49].setRotationPoint(35F, -23F, 44F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F); // Import Box68
		bodyModel[50].setRotationPoint(44.5F, -23F, 44F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F); // Import Box69
		bodyModel[51].setRotationPoint(54F, -23F, 44F);

		bodyModel[52].addBox(0F, 0F, 0F, 27, 20, 2, 0F); // Import Box70
		bodyModel[52].setRotationPoint(35F, -26F, -42F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F); // Import Box71
		bodyModel[53].setRotationPoint(62F, -26F, -42F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -2F, 0F,-2F, -7F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -2F, 0F,-2F, -7F, 0F,0F, -5F, 0F,0F, 0F, 0F); // Import Box72
		bodyModel[54].setRotationPoint(62F, -26F, -44F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 27, 20, 2, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box73
		bodyModel[55].setRotationPoint(35F, -26F, -44F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F); // Import Box74
		bodyModel[56].setRotationPoint(30F, -26F, -42F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 20, 2, 0F,-2F, -7F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -5F, 0F,-2F, -7F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -5F, 0F); // Import Box75
		bodyModel[57].setRotationPoint(30F, -26F, -44F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box76
		bodyModel[58].setRotationPoint(35F, -23F, -45F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box77
		bodyModel[59].setRotationPoint(44.5F, -23F, -45F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, -1F, 0F,-1F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box78
		bodyModel[60].setRotationPoint(54F, -23F, -45F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box79
		bodyModel[61].setRotationPoint(66F, -30F, -40F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box80
		bodyModel[62].setRotationPoint(66F, -30F, 24F);

		bodyModel[63].addShapeBox(0F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box81
		bodyModel[63].setRotationPoint(100F, -30F, -40F);
		bodyModel[63].rotateAngleZ = -0.33161256F;

		bodyModel[64].addShapeBox(13F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box82
		bodyModel[64].setRotationPoint(100F, -30F, -40F);
		bodyModel[64].rotateAngleZ = -0.33161256F;

		bodyModel[65].addShapeBox(26F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box83
		bodyModel[65].setRotationPoint(100F, -30F, -40F);
		bodyModel[65].rotateAngleZ = -0.33161256F;

		bodyModel[66].addShapeBox(38F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box84
		bodyModel[66].setRotationPoint(100F, -30F, -40F);
		bodyModel[66].rotateAngleZ = -0.33161256F;

		bodyModel[67].addShapeBox(0F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box85
		bodyModel[67].setRotationPoint(100F, -30F, 24F);
		bodyModel[67].rotateAngleZ = -0.33161256F;

		bodyModel[68].addShapeBox(13F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box86
		bodyModel[68].setRotationPoint(100F, -30F, 24F);
		bodyModel[68].rotateAngleZ = -0.33161256F;

		bodyModel[69].addShapeBox(26F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box87
		bodyModel[69].setRotationPoint(100F, -30F, 24F);
		bodyModel[69].rotateAngleZ = -0.33161256F;

		bodyModel[70].addShapeBox(38F, -1F, 2F, 12, 1, 12, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box88
		bodyModel[70].setRotationPoint(100F, -30F, 24F);
		bodyModel[70].rotateAngleZ = -0.33161256F;


		turretModel = new ModelRendererTurbo[32];
		turretModel[0] = new ModelRendererTurbo(this, 800, 702, textureX, textureY); // Import ImportImportBox20
		turretModel[1] = new ModelRendererTurbo(this, 800, 757, textureX, textureY); // Import ImportImportBox21
		turretModel[2] = new ModelRendererTurbo(this, 800, 757, textureX, textureY); // Import ImportImportBox22
		turretModel[3] = new ModelRendererTurbo(this, 800, 822, textureX, textureY); // Import ImportImportBox29
		turretModel[4] = new ModelRendererTurbo(this, 800, 852, textureX, textureY); // Import ImportImportBox30
		turretModel[5] = new ModelRendererTurbo(this, 800, 877, textureX, textureY); // Import ImportImportBox31
		turretModel[6] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Import ImportImportBox32
		turretModel[7] = new ModelRendererTurbo(this, 800, 902, textureX, textureY); // Import ImportImportBox33
		turretModel[8] = new ModelRendererTurbo(this, 800, 902, textureX, textureY); // Import ImportImportBox34
		turretModel[9] = new ModelRendererTurbo(this, 800, 912, textureX, textureY); // Import ImportImportBox35
		turretModel[10] = new ModelRendererTurbo(this, 800, 952, textureX, textureY); // Import ImportImportBox36
		turretModel[11] = new ModelRendererTurbo(this, 800, 952, textureX, textureY); // Import ImportImportBox37
		turretModel[12] = new ModelRendererTurbo(this, 800, 962, textureX, textureY); // Import ImportImportBox38
		turretModel[13] = new ModelRendererTurbo(this, 800, 962, textureX, textureY); // Import ImportImportBox39
		turretModel[14] = new ModelRendererTurbo(this, 800, 972, textureX, textureY); // Import ImportImportBox40
		turretModel[15] = new ModelRendererTurbo(this, 800, 1002, textureX, textureY); // Import ImportImportBox41
		turretModel[16] = new ModelRendererTurbo(this, 800, 912, textureX, textureY); // Import ImportImportBox42
		turretModel[17] = new ModelRendererTurbo(this, 800, 822, textureX, textureY); // Import ImportImportBox43
		turretModel[18] = new ModelRendererTurbo(this, 800, 852, textureX, textureY); // Import ImportImportBox44
		turretModel[19] = new ModelRendererTurbo(this, 800, 877, textureX, textureY); // Import ImportImportBox45
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportImportBox46
		turretModel[21] = new ModelRendererTurbo(this, 800, 1002, textureX, textureY); // Import ImportImportBox47
		turretModel[22] = new ModelRendererTurbo(this, 800, 972, textureX, textureY); // Import ImportImportBox48
		turretModel[23] = new ModelRendererTurbo(this, 0, 902, textureX, textureY); // Import ImportImportBox49
		turretModel[24] = new ModelRendererTurbo(this, 0, 902, textureX, textureY); // Import ImportImportBox50
		turretModel[25] = new ModelRendererTurbo(this, 800, 962, textureX, textureY); // Import ImportImportBox51
		turretModel[26] = new ModelRendererTurbo(this, 800, 952, textureX, textureY); // Import ImportImportBox52
		turretModel[27] = new ModelRendererTurbo(this, 800, 962, textureX, textureY); // Import ImportImportBox53
		turretModel[28] = new ModelRendererTurbo(this, 800, 952, textureX, textureY); // Import ImportImportBox54--
		turretModel[29] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import ImportImportBox55
		turretModel[30] = new ModelRendererTurbo(this, 1200, 2, textureX, textureY); // Import ImportImportBox56
		turretModel[31] = new ModelRendererTurbo(this, 1200, 2, textureX, textureY); // Import ImportImportBox57

		turretModel[0].addBox(0F, 0F, 0F, 40, 2, 48, 0F); // Import ImportImportBox20
		turretModel[0].setRotationPoint(-20F, -33F, -24F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 48, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Import ImportImportBox21
		turretModel[1].setRotationPoint(-24F, -33F, -24F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 48, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Import ImportImportBox22
		turretModel[2].setRotationPoint(20F, -33F, -24F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 72, 14, 10, 0F,0F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox29
		turretModel[3].setRotationPoint(-7F, -47F, -16F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 72, 14, 4, 0F,0F, 0F, 0F,-25F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox30
		turretModel[4].setRotationPoint(-7F, -47F, -20F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, -5F, 0F,-5F, -5F, 0F,-5F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox31
		turretModel[5].setRotationPoint(0F, -47F, -27F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox32
		turretModel[6].setRotationPoint(-20F, -47F, -27F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox33
		turretModel[7].setRotationPoint(13F, -37F, -21F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox34
		turretModel[8].setRotationPoint(7F, -41F, -21F);

		turretModel[9].addBox(0F, 0F, 0F, 13, 14, 20, 0F); // Import ImportImportBox35
		turretModel[9].setRotationPoint(-20F, -47F, -20F);

		turretModel[10].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportImportBox36
		turretModel[10].setRotationPoint(58F, -36F, -11F);

		turretModel[11].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportImportBox37
		turretModel[11].setRotationPoint(50F, -40F, -11F);

		turretModel[12].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportImportBox38
		turretModel[12].setRotationPoint(58F, -36.5F, -11.5F);

		turretModel[13].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportImportBox39
		turretModel[13].setRotationPoint(51F, -40.5F, -11.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F,0F, -5F, -7F,0F, -5F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 0F, -7F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox40
		turretModel[14].setRotationPoint(-27F, -47F, -27F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 7, 12, 10, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F); // Import ImportImportBox41
		turretModel[15].setRotationPoint(-27F, -47F, -20F);

		turretModel[16].addBox(0F, 0F, 0F, 13, 14, 20, 0F); // Import ImportImportBox42
		turretModel[16].setRotationPoint(-20F, -47F, 0F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 72, 14, 10, 0F,0F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox43
		turretModel[17].setRotationPoint(-7F, -47F, 6F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 72, 14, 4, 0F,0F, 0F, 0F,-20F, 0F, 0F,-25F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox44
		turretModel[18].setRotationPoint(-7F, -47F, 16F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,-5F, -5F, 0F,-5F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox45
		turretModel[19].setRotationPoint(0F, -47F, 20F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 20, 14, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox46
		turretModel[20].setRotationPoint(-20F, -47F, 20F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 7, 12, 10, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F,0F, 2F, 0F); // Import ImportImportBox47
		turretModel[21].setRotationPoint(-27F, -47F, 10F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 7, 14, 7, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, -7F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -7F); // Import ImportImportBox48
		turretModel[22].setRotationPoint(-27F, -47F, 20F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox49
		turretModel[23].setRotationPoint(7F, -41F, 20F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-6F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox50
		turretModel[24].setRotationPoint(13F, -37F, 20F);

		turretModel[25].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportImportBox51
		turretModel[25].setRotationPoint(51F, -40.5F, 9.5F);

		turretModel[26].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportImportBox52
		turretModel[26].setRotationPoint(50F, -40F, 10F);

		turretModel[27].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Import ImportImportBox53
		turretModel[27].setRotationPoint(58F, -36.5F, 9.5F);

		turretModel[28].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Import ImportImportBox54--
		turretModel[28].setRotationPoint(58F, -36F, 10F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 18, 14, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, 0F); // Import ImportImportBox55
		turretModel[29].setRotationPoint(-38F, -47F, -10F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,-5F, 0F, 0F,-15F, 0F, 0F,-15F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox56
		turretModel[30].setRotationPoint(-38F, -55F, -10F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,-5F, 0F, 0F,-15F, 0F, 0F,-15F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox57
		turretModel[31].setRotationPoint(-38F, -55F, 5F);


		barrelModel = new ModelRendererTurbo[40];
		barrelModel[0] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import ImportImportBox59
		barrelModel[1] = new ModelRendererTurbo(this, 600, 150, textureX, textureY); // Import ImportImportBox60
		barrelModel[2] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import ImportImportBox61
		barrelModel[3] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import ImportImportBox62
		barrelModel[4] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import ImportImportBox63
		barrelModel[5] = new ModelRendererTurbo(this, 600, 220, textureX, textureY); // Import ImportImportBox64
		barrelModel[6] = new ModelRendererTurbo(this, 600, 260, textureX, textureY); // Import ImportImportBox65
		barrelModel[7] = new ModelRendererTurbo(this, 600, 300, textureX, textureY); // Import ImportImportBox66
		barrelModel[8] = new ModelRendererTurbo(this, 600, 330, textureX, textureY); // Import ImportImportBox67
		barrelModel[9] = new ModelRendererTurbo(this, 600, 360, textureX, textureY); // Import ImportImportBox68
		barrelModel[10] = new ModelRendererTurbo(this, 600, 390, textureX, textureY); // Import ImportImportBox69
		barrelModel[11] = new ModelRendererTurbo(this, 600, 420, textureX, textureY); // Import ImportImportBox70
		barrelModel[12] = new ModelRendererTurbo(this, 600, 440, textureX, textureY); // Import ImportImportBox71
		barrelModel[13] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox72
		barrelModel[14] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox73
		barrelModel[15] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox74
		barrelModel[16] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox75
		barrelModel[17] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox76
		barrelModel[18] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox77
		barrelModel[19] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox78
		barrelModel[20] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox79
		barrelModel[21] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox80
		barrelModel[22] = new ModelRendererTurbo(this, 600, 460, textureX, textureY); // Import ImportImportBox81
		barrelModel[23] = new ModelRendererTurbo(this, 600, 480, textureX, textureY); // Import ImportImportBox82
		barrelModel[24] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Import ImportImportBox83
		barrelModel[25] = new ModelRendererTurbo(this, 600, 520, textureX, textureY); // Import ImportImportBox84
		barrelModel[26] = new ModelRendererTurbo(this, 600, 540, textureX, textureY); // Import ImportImportBox89
		barrelModel[27] = new ModelRendererTurbo(this, 600, 560, textureX, textureY); // Import ImportImportBox92
		barrelModel[28] = new ModelRendererTurbo(this, 600, 580, textureX, textureY); // Import ImportImportBox93
		barrelModel[29] = new ModelRendererTurbo(this, 600, 600, textureX, textureY); // Import ImportImportBox94
		barrelModel[30] = new ModelRendererTurbo(this, 600, 600, textureX, textureY); // Import ImportImportBox95
		barrelModel[31] = new ModelRendererTurbo(this, 600, 610, textureX, textureY); // Import ImportImportBox96
		barrelModel[32] = new ModelRendererTurbo(this, 600, 610, textureX, textureY); // Import ImportImportBox97
		barrelModel[33] = new ModelRendererTurbo(this, 600, 620, textureX, textureY); // Import ImportImportBox98
		barrelModel[34] = new ModelRendererTurbo(this, 600, 620, textureX, textureY); // Import ImportImportBox99
		barrelModel[35] = new ModelRendererTurbo(this, 600, 640, textureX, textureY); // Import ImportImportBox100
		barrelModel[36] = new ModelRendererTurbo(this, 600, 680, textureX, textureY); // Import ImportImportBox101
		barrelModel[37] = new ModelRendererTurbo(this, 600, 700, textureX, textureY); // Import ImportImportBox102
		barrelModel[38] = new ModelRendererTurbo(this, 600, 720, textureX, textureY); // Import ImportImportBox105
		barrelModel[39] = new ModelRendererTurbo(this, 600, 740, textureX, textureY); // Import ImportImportBox106

		barrelModel[0].addBox(0F, -7F, -6F, 20, 14, 12, 0F); // Import ImportImportBox59
		barrelModel[0].setRotationPoint(-7F, -40F, 0F);

		barrelModel[1].addShapeBox(20F, -7F, -6F, 5, 14, 12, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox60
		barrelModel[1].setRotationPoint(-7F, -40F, 0F);

		barrelModel[2].addBox(25F, -5F, -6F, 5, 12, 12, 0F); // Import ImportImportBox61
		barrelModel[2].setRotationPoint(-7F, -40F, 0F);

		barrelModel[3].addBox(32F, -5F, -6F, 5, 12, 12, 0F); // Import ImportImportBox62
		barrelModel[3].setRotationPoint(-7F, -40F, 0F);

		barrelModel[4].addBox(39F, -5F, -6F, 5, 12, 12, 0F); // Import ImportImportBox63
		barrelModel[4].setRotationPoint(-7F, -40F, 0F);

		barrelModel[5].addBox(30F, -4F, -5F, 19, 10, 10, 0F); // Import ImportImportBox64
		barrelModel[5].setRotationPoint(-7F, -40F, 0F);

		barrelModel[6].addShapeBox(49F, -4F, -5F, 10, 10, 10, 0F,0F, 0F, 0F,0F, 4F, -1F,0F, 4F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Import ImportImportBox65
		barrelModel[6].setRotationPoint(-7F, -40F, 0F);

		barrelModel[7].addBox(59F, -8F, -6F, 10, 14, 8, 0F); // Import ImportImportBox66
		barrelModel[7].setRotationPoint(-7F, -40F, 2F);

		barrelModel[8].addShapeBox(69F, -8F, -6F, 7, 14, 8, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox67
		barrelModel[8].setRotationPoint(-7F, -40F, 2F);

		barrelModel[9].addShapeBox(76F, -2F, -6F, 13, 8, 8, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import ImportImportBox68
		barrelModel[9].setRotationPoint(-7F, -40F, 2F);

		barrelModel[10].addBox(89F, -1F, -5F, 20, 6, 6, 0F); // Import ImportImportBox69
		barrelModel[10].setRotationPoint(-7F, -40F, 2F);

		barrelModel[11].addBox(109F, -1F, -5F, 20, 1, 6, 0F); // Import ImportImportBox70
		barrelModel[11].setRotationPoint(-7F, -40F, 2F);

		barrelModel[12].addBox(109F, 4F, -5F, 20, 1, 6, 0F); // Import ImportImportBox71
		barrelModel[12].setRotationPoint(-7F, -40F, 2F);

		barrelModel[13].addBox(111F, 0F, -5F, 2, 4, 1, 0F); // Import ImportImportBox72
		barrelModel[13].setRotationPoint(-7F, -40F, 2F);

		barrelModel[14].addBox(115F, 0F, -5F, 2, 4, 1, 0F); // Import ImportImportBox73
		barrelModel[14].setRotationPoint(-7F, -40F, 2F);

		barrelModel[15].addBox(119F, 0F, -5F, 2, 4, 1, 0F); // Import ImportImportBox74
		barrelModel[15].setRotationPoint(-7F, -40F, 2F);

		barrelModel[16].addBox(123F, 0F, -5F, 2, 4, 1, 0F); // Import ImportImportBox75
		barrelModel[16].setRotationPoint(-7F, -40F, 2F);

		barrelModel[17].addBox(127F, 0F, -6F, 2, 4, 1, 0F); // Import ImportImportBox76
		barrelModel[17].setRotationPoint(-7F, -40F, 3F);

		barrelModel[18].addBox(111F, 0F, 7F, 2, 4, 1, 0F); // Import ImportImportBox77
		barrelModel[18].setRotationPoint(-7F, -40F, -5F);

		barrelModel[19].addBox(115F, 0F, 7F, 2, 4, 1, 0F); // Import ImportImportBox78
		barrelModel[19].setRotationPoint(-7F, -40F, -5F);

		barrelModel[20].addBox(119F, 0F, 7F, 2, 4, 1, 0F); // Import ImportImportBox79
		barrelModel[20].setRotationPoint(-7F, -40F, -5F);

		barrelModel[21].addBox(123F, 0F, 7F, 2, 4, 1, 0F); // Import ImportImportBox80
		barrelModel[21].setRotationPoint(-7F, -40F, -5F);

		barrelModel[22].addBox(127F, 0F, 6F, 2, 4, 1, 0F); // Import ImportImportBox81
		barrelModel[22].setRotationPoint(-7F, -40F, -4F);

		barrelModel[23].addShapeBox(129F, -1F, -6F, 12, 6, 6, 0F,0F, 0F, 0F,0F, 0.5F, 0.5F,0F, 0.5F, 0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.5F, 0.5F,0F, 0.5F, 0.5F,0F, 0F, 0F); // Import ImportImportBox82
		barrelModel[23].setRotationPoint(-7F, -40F, 3F);

		barrelModel[24].addBox(141F, -1.5F, -5.5F, 8, 7, 7, 0F); // Import ImportImportBox83
		barrelModel[24].setRotationPoint(-7F, -40F, 2F);

		barrelModel[25].addShapeBox(149F, -1.5F, -5.5F, 8, 7, 7, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import ImportImportBox84
		barrelModel[25].setRotationPoint(-7F, -40F, 2F);

		barrelModel[26].addBox(-2F, -1F, 0F, 8, 2, 10, 0F); // Import ImportImportBox89
		barrelModel[26].setRotationPoint(-29F, -52F, -5F);

		barrelModel[27].addBox(-3F, -3F, 2F, 15, 6, 6, 0F); // Import ImportImportBox92
		barrelModel[27].setRotationPoint(-29F, -52F, -5F);

		barrelModel[28].addShapeBox(12F, -3F, 2F, 5, 6, 6, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Import ImportImportBox93
		barrelModel[28].setRotationPoint(-29F, -52F, -5F);

		barrelModel[29].addBox(17F, -2F, 4F, 5, 1, 2, 0F); // Import ImportImportBox94
		barrelModel[29].setRotationPoint(-29F, -52F, -5F);

		barrelModel[30].addBox(17F, 1F, 4F, 5, 1, 2, 0F); // Import ImportImportBox95
		barrelModel[30].setRotationPoint(-29F, -52F, -5F);

		barrelModel[31].addBox(22F, 1F, 3F, 2, 1, 4, 0F); // Import ImportImportBox96
		barrelModel[31].setRotationPoint(-29F, -52F, -5F);

		barrelModel[32].addBox(22F, -2F, 3F, 2, 1, 4, 0F); // Import ImportImportBox97
		barrelModel[32].setRotationPoint(-29F, -52F, -5F);

		barrelModel[33].addBox(22F, -1F, 3F, 2, 2, 1, 0F); // Import ImportImportBox98
		barrelModel[33].setRotationPoint(-29F, -52F, -5F);

		barrelModel[34].addBox(22F, -1F, 6F, 2, 2, 1, 0F); // Import ImportImportBox99
		barrelModel[34].setRotationPoint(-29F, -52F, -5F);

		barrelModel[35].addShapeBox(-7F, -3F, 2F, 4, 6, 6, 0F,0F, -2F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F,0F, -2F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -2F); // Import ImportImportBox100
		barrelModel[35].setRotationPoint(-29F, -52F, -5F);

		barrelModel[36].addShapeBox(72F, -5F, -5F, 30, 4, 6, 0F,0F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportImportBox101
		barrelModel[36].setRotationPoint(-7F, -40F, 2F);

		barrelModel[37].addShapeBox(17F, 7F, -5F, 87, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,-4F, 0F, -2F,-4F, 0F, -2F,0F, 0F, -2F); // Import ImportImportBox102
		barrelModel[37].setRotationPoint(-7F, -42F, 2F);

		barrelModel[38].addBox(99F, -4F, -5F, 10, 2, 2, 0F); // Import ImportImportBox105
		barrelModel[38].setRotationPoint(-7F, -40F, 4F);

		barrelModel[39].addBox(109F, -3.5F, -4.5F, 10, 1, 1, 0F); // Import ImportImportBox106
		barrelModel[39].setRotationPoint(-7F, -40F, 4F);


		leftTrackModel = new ModelRendererTurbo[29];
		leftTrackModel[0] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Import Box0
		leftTrackModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box1
		leftTrackModel[2] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box2
		leftTrackModel[3] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box3
		leftTrackModel[4] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box4
		leftTrackModel[5] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box5
		leftTrackModel[6] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box6
		leftTrackModel[7] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box7
		leftTrackModel[8] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box8
		leftTrackModel[9] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box9
		leftTrackModel[10] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box10
		leftTrackModel[11] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box11
		leftTrackModel[12] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box12
		leftTrackModel[13] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box13
		leftTrackModel[14] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box28
		leftTrackModel[15] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box29
		leftTrackModel[16] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box30
		leftTrackModel[17] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box31
		leftTrackModel[18] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box32
		leftTrackModel[19] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box33
		leftTrackModel[20] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box34
		leftTrackModel[21] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box35
		leftTrackModel[22] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box36
		leftTrackModel[23] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box37
		leftTrackModel[24] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box38
		leftTrackModel[25] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box39
		leftTrackModel[26] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box40
		leftTrackModel[27] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box41
		leftTrackModel[28] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box42

		leftTrackModel[0].addBox(0F, 0F, 0F, 63, 8, 32, 0F); // Import Box0
		leftTrackModel[0].setRotationPoint(85F, -14F, 24F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Import Box1
		leftTrackModel[1].setRotationPoint(85F, -6F, 24F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box2
		leftTrackModel[2].setRotationPoint(93F, 2F, 24F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box3
		leftTrackModel[3].setRotationPoint(93F, 2F, 48F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box4
		leftTrackModel[4].setRotationPoint(97F, 2F, 32.5F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box5
		leftTrackModel[5].setRotationPoint(102F, 2F, 32.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box6
		leftTrackModel[6].setRotationPoint(107F, 2F, 32.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box7
		leftTrackModel[7].setRotationPoint(123F, 2F, 32.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box8
		leftTrackModel[8].setRotationPoint(128F, 2F, 32.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box9
		leftTrackModel[9].setRotationPoint(133F, 2F, 32.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box10
		leftTrackModel[10].setRotationPoint(98F, -12F, 56F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box11
		leftTrackModel[11].setRotationPoint(106F, -12F, 56F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box12
		leftTrackModel[12].setRotationPoint(114F, -12F, 56F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box13
		leftTrackModel[13].setRotationPoint(122F, -12F, 56F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box28
		leftTrackModel[14].setRotationPoint(-34F, -12F, 56F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box29
		leftTrackModel[15].setRotationPoint(-26F, -12F, 56F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box30
		leftTrackModel[16].setRotationPoint(-18F, -12F, 56F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F); // Import Box31
		leftTrackModel[17].setRotationPoint(-10F, -12F, 56F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 63, 4, 32, 0F); // Import Box32
		leftTrackModel[18].setRotationPoint(-47F, -10F, 24F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Import Box33
		leftTrackModel[19].setRotationPoint(-47F, -6F, 24F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box34
		leftTrackModel[20].setRotationPoint(-39F, 2F, 48F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box35
		leftTrackModel[21].setRotationPoint(-39F, 2F, 24F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box36
		leftTrackModel[22].setRotationPoint(-9F, 2F, 32.5F);

		leftTrackModel[23].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box37
		leftTrackModel[23].setRotationPoint(-4F, 2F, 32.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box38
		leftTrackModel[24].setRotationPoint(1F, 2F, 32.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box39
		leftTrackModel[25].setRotationPoint(-35F, 2F, 32.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box40
		leftTrackModel[26].setRotationPoint(-25F, 2F, 32.5F);

		leftTrackModel[27].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box41
		leftTrackModel[27].setRotationPoint(-30F, 2F, 32.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 63, 4, 32, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box42
		leftTrackModel[28].setRotationPoint(-47F, -14F, 24F);


		rightTrackModel = new ModelRendererTurbo[29];
		rightTrackModel[0] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Import Box14
		rightTrackModel[1] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box15
		rightTrackModel[2] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box16
		rightTrackModel[3] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box17
		rightTrackModel[4] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box18
		rightTrackModel[5] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box19
		rightTrackModel[6] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box20
		rightTrackModel[7] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box21
		rightTrackModel[8] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box22
		rightTrackModel[9] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box23
		rightTrackModel[10] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box24
		rightTrackModel[11] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box25
		rightTrackModel[12] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box26
		rightTrackModel[13] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box27
		rightTrackModel[14] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box43
		rightTrackModel[15] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box44
		rightTrackModel[16] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box45
		rightTrackModel[17] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box46
		rightTrackModel[18] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Import Box47
		rightTrackModel[19] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box48
		rightTrackModel[20] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box49
		rightTrackModel[21] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box50
		rightTrackModel[22] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box51
		rightTrackModel[23] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Import Box52
		rightTrackModel[24] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box53
		rightTrackModel[25] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box54
		rightTrackModel[26] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box55
		rightTrackModel[27] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box56
		rightTrackModel[28] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box57

		rightTrackModel[0].addBox(0F, 0F, 0F, 63, 8, 32, 0F); // Import Box14
		rightTrackModel[0].setRotationPoint(85F, -14F, -56F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Import Box15
		rightTrackModel[1].setRotationPoint(85F, -6F, -56F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box16
		rightTrackModel[2].setRotationPoint(93F, 2F, -56F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box17
		rightTrackModel[3].setRotationPoint(93F, 2F, -32F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box18
		rightTrackModel[4].setRotationPoint(97F, 2F, -47.5F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box19
		rightTrackModel[5].setRotationPoint(102F, 2F, -47.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box20
		rightTrackModel[6].setRotationPoint(107F, 2F, -47.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box21
		rightTrackModel[7].setRotationPoint(123F, 2F, -47.5F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box22
		rightTrackModel[8].setRotationPoint(128F, 2F, -47.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box23
		rightTrackModel[9].setRotationPoint(133F, 2F, -47.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box24
		rightTrackModel[10].setRotationPoint(98F, -12F, -58F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box25
		rightTrackModel[11].setRotationPoint(106F, -12F, -58F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box26
		rightTrackModel[12].setRotationPoint(114F, -12F, -58F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box27
		rightTrackModel[13].setRotationPoint(122F, -12F, -58F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 63, 4, 32, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box43
		rightTrackModel[14].setRotationPoint(-47F, -14F, -56F);

		rightTrackModel[15].addBox(0F, 0F, 0F, 63, 4, 32, 0F); // Import Box44
		rightTrackModel[15].setRotationPoint(-47F, -10F, -56F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 63, 8, 32, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F); // Import Box45
		rightTrackModel[16].setRotationPoint(-47F, -6F, -56F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box46
		rightTrackModel[17].setRotationPoint(-39F, 2F, -56F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 47, 2, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box47
		rightTrackModel[18].setRotationPoint(-39F, 2F, -32F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box48
		rightTrackModel[19].setRotationPoint(1F, 2F, -47.5F);

		rightTrackModel[20].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box49
		rightTrackModel[20].setRotationPoint(-4F, 2F, -47.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box50
		rightTrackModel[21].setRotationPoint(-9F, 2F, -47.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box51
		rightTrackModel[22].setRotationPoint(-25F, 2F, -47.5F);

		rightTrackModel[23].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Import Box52
		rightTrackModel[23].setRotationPoint(-30F, 2F, -47.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box53
		rightTrackModel[24].setRotationPoint(-35F, 2F, -47.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box54
		rightTrackModel[25].setRotationPoint(-34F, -12F, -58F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box55
		rightTrackModel[26].setRotationPoint(-26F, -12F, -58F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box56
		rightTrackModel[27].setRotationPoint(-18F, -12F, -58F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box57
		rightTrackModel[28].setRotationPoint(-10F, -12F, -58F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
