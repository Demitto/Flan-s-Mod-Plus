//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRC8 extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRC8()	
	{


// Body
		bodyModel = new ModelRendererTurbo[72];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // BodyFront1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // BodyFront2
		bodyModel[2] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // BodyFront3
		bodyModel[3] = new ModelRendererTurbo(this,  25,  380, textureX, textureY); // BodyFront4
		bodyModel[4] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // BodyFront5
		bodyModel[5] = new ModelRendererTurbo(this,  30,  400, textureX, textureY); // BodyFront6
		bodyModel[6] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // BodyFront7
		bodyModel[7] = new ModelRendererTurbo(this,  25,  420, textureX, textureY); // BodyFront8
		bodyModel[8] = new ModelRendererTurbo(this,  50,  420, textureX, textureY); // BodyFront9
		bodyModel[9] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // BodyFront10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // BodyFront11
		bodyModel[11] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // BodyFront12
		bodyModel[12] = new ModelRendererTurbo(this,  0,  465, textureX, textureY); // BodyFront13
		bodyModel[13] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // BodyFront14
		bodyModel[14] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // BodyFront15
		bodyModel[15] = new ModelRendererTurbo(this,  0,  465, textureX, textureY); // BodyFront16
		bodyModel[16] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // BodyFront17
		bodyModel[17] = new ModelRendererTurbo(this,  0,  490, textureX, textureY); // BodyFront18
		bodyModel[18] = new ModelRendererTurbo(this,  0,  520, textureX, textureY); // BodyFront19
		bodyModel[19] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // BodyFront20
		bodyModel[20] = new ModelRendererTurbo(this,  0,  540, textureX, textureY); // BodyFront21
		bodyModel[21] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // BodyFront22
		bodyModel[22] = new ModelRendererTurbo(this,  0,  580, textureX, textureY); // BodyFront23
		bodyModel[23] = new ModelRendererTurbo(this,  0,  595, textureX, textureY); // BodyFront24
		bodyModel[24] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // BodyFront25
		bodyModel[25] = new ModelRendererTurbo(this,  0,  580, textureX, textureY); // BodyFront26
		bodyModel[26] = new ModelRendererTurbo(this,  0,  595, textureX, textureY); // BodyFront27
		bodyModel[27] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // BodyMid1
		bodyModel[28] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // BodyMid2
		bodyModel[29] = new ModelRendererTurbo(this,  0,  640, textureX, textureY); // BodyMid3
		bodyModel[30] = new ModelRendererTurbo(this,  0,  660, textureX, textureY); // BodyMid4
		bodyModel[31] = new ModelRendererTurbo(this,  0,  680, textureX, textureY); // BodyMid5
		bodyModel[32] = new ModelRendererTurbo(this,  0,  700, textureX, textureY); // BodyMid6
		bodyModel[33] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // BodyMid7
		bodyModel[34] = new ModelRendererTurbo(this,  0,  740, textureX, textureY); // BodyEngine1
		bodyModel[35] = new ModelRendererTurbo(this,  0,  740, textureX, textureY); // BodyEngine2
		bodyModel[36] = new ModelRendererTurbo(this,  0,  740, textureX, textureY); // BodyEngine3
		bodyModel[37] = new ModelRendererTurbo(this,  0,  760, textureX, textureY); // BodyEngine4
		bodyModel[38] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // BodyEngine5
		bodyModel[39] = new ModelRendererTurbo(this,  0,  780, textureX, textureY); // BodyEngine6
		bodyModel[40] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // BodyEngine7
		bodyModel[41] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // BodyEngine8
		bodyModel[42] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // BodyEngine9
		bodyModel[43] = new ModelRendererTurbo(this,  0,  820, textureX, textureY); // BodyEngine10
		bodyModel[44] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // BodyEngine11
		bodyModel[45] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // BodyEngine12
		bodyModel[46] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // BodyEngine13
		bodyModel[47] = new ModelRendererTurbo(this,  0,  860, textureX, textureY); // BodyBack1
		bodyModel[48] = new ModelRendererTurbo(this,  0,  880, textureX, textureY); // BodyBack2
		bodyModel[49] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // BodyBack3
		bodyModel[50] = new ModelRendererTurbo(this,  0,  860, textureX, textureY); // BodyBack4
		bodyModel[51] = new ModelRendererTurbo(this,  0,  880, textureX, textureY); // BodyBack5
		bodyModel[52] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // BodyBack6
		bodyModel[53] = new ModelRendererTurbo(this,  0,  920, textureX, textureY); // BodyBack7
		bodyModel[54] = new ModelRendererTurbo(this,  0,  940, textureX, textureY); // BodyBack8
		bodyModel[55] = new ModelRendererTurbo(this,  0,  960, textureX, textureY); // BodyBack10
		bodyModel[56] = new ModelRendererTurbo(this,  0,  980, textureX, textureY); // BodyBack11
		bodyModel[57] = new ModelRendererTurbo(this,  0,  980, textureX, textureY); // BodyBack12
		bodyModel[58] = new ModelRendererTurbo(this,  0,  1000, textureX, textureY); // BodyBack13
		bodyModel[59] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // SWheel1
		bodyModel[60] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // SWheel2
		bodyModel[61] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // SWheel3
		bodyModel[62] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // SWheel4
		bodyModel[63] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // SWheel5
		bodyModel[64] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // SWheel6
		bodyModel[65] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // SWheel7
		bodyModel[66] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // SWheel8
		bodyModel[67] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // SWheel9
		bodyModel[68] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SWheel10
		bodyModel[69] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // SWheel11
		bodyModel[70] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SWheel12
		bodyModel[71] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // SWheel13
		bodyModel[0].addShapeBox(-1F, -13F, -1F, 8, 4, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[0].setRotationPoint(14F, 2.5F, 0F);

		bodyModel[1].addShapeBox(-3F, -17F, -1F, 6, 4, 2, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[1].setRotationPoint(16F, 2.5F, 0F);

		bodyModel[2].addShapeBox(-3F, -17F, -5F, 8, 4, 4, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[2].setRotationPoint(16F, 2.5F, 0F);

		bodyModel[3].addShapeBox(-3F, -17F, 1F, 8, 4, 4, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[3].setRotationPoint(16F, 2.5F, 0F);

		bodyModel[4].addShapeBox(-1F, -13F, -5F, 8, 4, 4, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[4].setRotationPoint(14F, 2.5F, 0F);

		bodyModel[5].addShapeBox(-1F, -13F, 1F, 8, 4, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[5].setRotationPoint(14F, 2.5F, 0F);

		bodyModel[6].addShapeBox(-3F, -21F, -1F, 6, 4, 2, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[6].setRotationPoint(12F, 2.5F, 0F);

		bodyModel[7].addShapeBox(-3F, -21F, 1F, 6, 4, 2, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -3F, 0F, 1F); //Test
		bodyModel[7].setRotationPoint(12F, 2.5F, 0F);

		bodyModel[8].addShapeBox(-3F, -21F, -3F, 6, 4, 2, 0F, 2F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F); //Test
		bodyModel[8].setRotationPoint(12F, 2.5F, 0F);

		bodyModel[9].addShapeBox(-1F, -9F, 4F, 8, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[9].setRotationPoint(10F, 2.5F, 0F);

		bodyModel[10].addShapeBox(-1F, -9F, -5F, 8, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[10].setRotationPoint(10F, 2.5F, 0F);

		bodyModel[11].addShapeBox(3F, -15F, -5F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		bodyModel[11].setRotationPoint(6F, 2.5F, 0F);

		bodyModel[12].addBox(6F, -12F, 4F, 1, 1, 1, 0F); // BodyFront13
		bodyModel[12].setRotationPoint(6F, 1.5F, 0F);

		bodyModel[13].addBox(3F, -11F, -5F, 4, 3, 1, 0F); // BodyFront14
		bodyModel[13].setRotationPoint(6F, 1.5F, 0F);

		bodyModel[14].addShapeBox(3F, -15F, 4F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		bodyModel[14].setRotationPoint(6F, 2.5F, 0F);

		bodyModel[15].addBox(6F, -12F, -5F, 1, 1, 1, 0F); // BodyFront16
		bodyModel[15].setRotationPoint(6F, 1.5F, 0F);

		bodyModel[16].addBox(3F, -11F, 4F, 4, 3, 1, 0F); // BodyFront17
		bodyModel[16].setRotationPoint(6F, 1.5F, 0F);

		bodyModel[17].addBox(-1F, -13F, -3.5F, 8, 14, 7, 0F); // BodyFront18
		bodyModel[17].setRotationPoint(6F, 2.5F, 0F);

		bodyModel[18].addShapeBox(-1F, -14F, -3.5F, 8, 1, 7, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[18].setRotationPoint(6F, 2.5F, 0F);

		bodyModel[19].addShapeBox(3F, -9F, -5F, 2, 11, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[19].setRotationPoint(4F, 2.5F, 0F);

		bodyModel[20].addShapeBox(3F, -9F, 4F, 2, 11, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[20].setRotationPoint(4F, 2.5F, 0F);

		bodyModel[21].addShapeBox(-1F, -3F, 4F, 4, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F); //Test
		bodyModel[21].setRotationPoint(4F, 2.5F, 0F);

		bodyModel[22].addBox(-1F, -9F, 4F, 2, 6, 1, 0F); // BodyFront23
		bodyModel[22].setRotationPoint(4F, 2.5F, 0F);

		bodyModel[23].addShapeBox(1F, -11F, 4F, 6, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[23].setRotationPoint(2F, 1.5F, 0F);

		bodyModel[24].addShapeBox(-1F, -3F, -5F, 4, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F); //Test
		bodyModel[24].setRotationPoint(4F, 2.5F, 0F);

		bodyModel[25].addBox(-1F, -9F, -5F, 2, 6, 1, 0F); // BodyFront26
		bodyModel[25].setRotationPoint(4F, 2.5F, 0F);

		bodyModel[26].addShapeBox(1F, -11F, -5F, 6, 3, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[26].setRotationPoint(2F, 1.5F, 0F);

		bodyModel[27].addShapeBox(-6F, -17F, -2.5F, 7, 8, 5, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[27].setRotationPoint(6F, 2.5F, 0F);

		bodyModel[28].addShapeBox(-6F, -17F, -2.5F, 4, 8, 5, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[28].setRotationPoint(2F, 2.5F, 0F);

		bodyModel[29].addShapeBox(-7F, -17F, -2.5F, 7, 2, 5, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[29].setRotationPoint(-4F, 6.5F, 0F);

		bodyModel[30].addShapeBox(-10F, -19F, -2.5F, 3, 7, 5, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); //Test
		bodyModel[30].setRotationPoint(-4F, 5.5F, 0F);

		bodyModel[31].addShapeBox(-9F, 1F, -2F, 15, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		bodyModel[31].setRotationPoint(2F, 2.5F, 0F);

		bodyModel[32].addShapeBox(-10F, -19F, -2.5F, 11, 2, 5, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, -1F); //Test
		bodyModel[32].setRotationPoint(-15F, 4.5F, 0F);

		bodyModel[33].addBox(-7F, -15F, -2.5F, 7, 2, 5, 0F); // BodyMid7
		bodyModel[33].setRotationPoint(-4F, 6.5F, 0F);

		bodyModel[34].addBox(-5.013333F, -4F, -2.5F, 6, 2, 5, 0F); // BodyEngine1
		bodyModel[34].setRotationPoint(0F, 2.5F, 0F);

		bodyModel[35].addShapeBox(-5.013333F, -2F, -2.5F, 6, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test
		bodyModel[35].setRotationPoint(0F, 2.5F, 0F);

		bodyModel[36].addShapeBox(-5.013333F, -6F, -2.5F, 6, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[36].setRotationPoint(0F, 2.5F, 0F);

		bodyModel[37].addBox(-4.013333F, -9F, -1.5F, 17, 10, 3, 0F); // BodyEngine4
		bodyModel[37].setRotationPoint(-4F, 2.5F, 0F);

		bodyModel[38].addBox(-0.01333333F, -4F, -2F, 6, 1, 4, 0F); // BodyEngine5
		bodyModel[38].setRotationPoint(0F, 2.5F, 0F);
		bodyModel[38].rotateAngleZ = 0.2268928F;

		bodyModel[39].addBox(-0.01333333F, -2F, -2F, 6, 1, 4, 0F); // BodyEngine6
		bodyModel[39].setRotationPoint(0F, 2.5F, 0F);
		bodyModel[39].rotateAngleZ = 0.03490658F;

		bodyModel[40].addBox(-0.01333333F, -1F, -3F, 12, 2, 1, 0F); // BodyEngine7
		bodyModel[40].setRotationPoint(-17F, 2.5F, 0F);
		bodyModel[40].rotateAngleZ = 0.2792527F;

		bodyModel[41].addShapeBox(-0.01333333F, -3F, -3F, 12, 2, 1, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[41].setRotationPoint(-17F, 2.5F, 0F);
		bodyModel[41].rotateAngleZ = 0.2792527F;

		bodyModel[42].addShapeBox(-0.01333333F, 1F, -3F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F); //Test
		bodyModel[42].setRotationPoint(-17F, 2.5F, 0F);
		bodyModel[42].rotateAngleZ = 0.2792527F;

		bodyModel[43].addBox(-8.013333F, -3F, -2F, 2, 2, 4, 0F); // BodyEngine10
		bodyModel[43].setRotationPoint(0F, 2.5F, 0F);

		bodyModel[44].addBox(-0.01333333F, -1F, 2F, 12, 2, 1, 0F); // BodyEngine11
		bodyModel[44].setRotationPoint(-17F, 2.5F, 0F);
		bodyModel[44].rotateAngleZ = 0.2792527F;

		bodyModel[45].addShapeBox(-0.01333333F, -3F, 2F, 12, 2, 1, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[45].setRotationPoint(-17F, 2.5F, 0F);
		bodyModel[45].rotateAngleZ = 0.2792527F;

		bodyModel[46].addShapeBox(-0.01333333F, 1F, 2F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F); //Test
		bodyModel[46].setRotationPoint(-17F, 2.5F, 0F);
		bodyModel[46].rotateAngleZ = 0.2792527F;

		bodyModel[47].addBox(-3F, -1F, 3F, 16, 1, 1, 0F); // BodyBack1
		bodyModel[47].setRotationPoint(-5F, -5.5F, 0F);
		bodyModel[47].rotateAngleZ = 0.1745329F;

		bodyModel[48].addBox(0F, -1F, 2.9F, 7, 1, 1, 0F); // BodyBack2
		bodyModel[48].setRotationPoint(-5F, -5.5F, 0F);
		bodyModel[48].rotateAngleZ = -0.7853982F;

		bodyModel[49].addBox(6F, -9F, 3F, 1, 8, 1, 0F); // BodyBack3
		bodyModel[49].setRotationPoint(-5F, -5.5F, 0F);
		bodyModel[49].rotateAngleZ = -0.7853982F;

		bodyModel[50].addBox(-3F, -1F, -4F, 16, 1, 1, 0F); // BodyBack4
		bodyModel[50].setRotationPoint(-5F, -5.5F, 0F);
		bodyModel[50].rotateAngleZ = 0.1745329F;

		bodyModel[51].addBox(0F, -1F, -3.9F, 7, 1, 1, 0F); // BodyBack5
		bodyModel[51].setRotationPoint(-5F, -5.5F, 0F);
		bodyModel[51].rotateAngleZ = -0.7853982F;

		bodyModel[52].addBox(6F, -9F, -4F, 1, 8, 1, 0F); // BodyBack6
		bodyModel[52].setRotationPoint(-5F, -5.5F, 0F);
		bodyModel[52].rotateAngleZ = -0.7853982F;

		bodyModel[53].addBox(-8F, -15F, -1.5F, 11, 1, 3, 0F); // BodyBack7
		bodyModel[53].setRotationPoint(-15F, 4.5F, 0F);

		bodyModel[54].addShapeBox(-9F, -15F, -1.5F, 1, 4, 3, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); //Test
		bodyModel[54].setRotationPoint(-15F, 4.5F, 0F);


		bodyModel[55].addBox(-8F, -14.5F, -2F, 1, 1, 4, 0F); // BodyBack10
		bodyModel[55].setRotationPoint(-15F, 4.5F, 0F);

		bodyModel[56].addBox(-8F, -14.5F, 2F, 2, 1, 2, 0F); // BodyBack11
		bodyModel[56].setRotationPoint(-15F, 4.5F, 0F);

		bodyModel[57].addBox(-8F, -14.5F, -4F, 2, 1, 2, 0F); // BodyBack12
		bodyModel[57].setRotationPoint(-15F, 4.5F, 0F);

		bodyModel[58].addBox(-6.013333F, -9F, -2.5F, 7, 4, 5, 0F); // BodyBack13
		bodyModel[58].setRotationPoint(-8F, 2.5F, 0F);

		bodyModel[59].addBox(-2F, -8F, -2.5F, 5, 3, 5, 0F); // SWheel1
		bodyModel[59].setRotationPoint(17F, 2.5F, 0F);

		bodyModel[60].addBox(-8F, -8F, -2.5F, 6, 7, 5, 0F); // SWheel2
		bodyModel[60].setRotationPoint(17F, 2.5F, 0F);

		bodyModel[61].addBox(-0.5F, -17F, 2F, 1, 17, 1, 0F); // SWheel3
		bodyModel[61].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[61].rotateAngleZ = 0.3665192F;

		bodyModel[62].addBox(-0.5F, -17F, -3F, 1, 17, 1, 0F); // SWheel4
		bodyModel[62].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[62].rotateAngleZ = 0.3665192F;

		bodyModel[63].addBox(-1F, -10F, 1.5F, 2, 7, 2, 0F); // SWheel5
		bodyModel[63].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[63].rotateAngleZ = 0.3665192F;

		bodyModel[64].addBox(-1F, -10F, -3.5F, 2, 7, 2, 0F); // SWheel6
		bodyModel[64].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[64].rotateAngleZ = 0.3665192F;

		bodyModel[65].addBox(-7F, -15.5F, -3.5F, 2, 1, 7, 0F); // SWheel7
		bodyModel[65].setRotationPoint(17F, 2.5F, 0F);

		bodyModel[66].addBox(-6.5F, -17F, -2F, 1, 2, 1, 0F); // SWheel8
		bodyModel[66].setRotationPoint(17F, 2.5F, 0F);

		bodyModel[67].addBox(-6.5F, -17F, 1F, 1, 2, 1, 0F); // SWheel9
		bodyModel[67].setRotationPoint(17F, 2.5F, 0F);

		bodyModel[68].addBox(-6.5F, -16.5F, -0.5F, 1, 1, 2, 0F); // SWheel10
		bodyModel[68].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[68].rotateAngleY = -0.5235988F;

		bodyModel[69].addBox(-11.5F, -16.5F, -0.5F, 5, 1, 1, 0F); // SWheel11
		bodyModel[69].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[69].rotateAngleY = -0.5235988F;

		bodyModel[70].addBox(-6.5F, -16.5F, -1.5F, 1, 1, 2, 0F); // SWheel12
		bodyModel[70].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[70].rotateAngleY = 0.5235988F;

		bodyModel[71].addBox(-11.5F, -16.5F, -0.5F, 5, 1, 1, 0F); // SWheel13
		bodyModel[71].setRotationPoint(17F, 2.5F, 0F);
		bodyModel[71].rotateAngleY = 0.5235988F;



// Right Front Wheel
		rightFrontWheelModel = new ModelRendererTurbo[18];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this,  0,  37, textureX, textureY); // FWheel1
		rightFrontWheelModel[1] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // FWheel2
		rightFrontWheelModel[2] = new ModelRendererTurbo(this,  0,  69, textureX, textureY); // FWheel3
		rightFrontWheelModel[3] = new ModelRendererTurbo(this,  0,  84, textureX, textureY); // FWheel4
		rightFrontWheelModel[4] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // FWheel5
		rightFrontWheelModel[5] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // FWheel6
		rightFrontWheelModel[6] = new ModelRendererTurbo(this,  0,  135, textureX, textureY); // FWheel7
		rightFrontWheelModel[7] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // FWheel8
		rightFrontWheelModel[8] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // FWheel9
		rightFrontWheelModel[9] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // FWheel10

		rightFrontWheelModel[10] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // FWheel11
		rightFrontWheelModel[11] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // FWheel12
		rightFrontWheelModel[12] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // FWheel13
		rightFrontWheelModel[13] = new ModelRendererTurbo(this,  45,  508, textureX, textureY); // FWheel14
		rightFrontWheelModel[14] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // FWheel15
		rightFrontWheelModel[15] = new ModelRendererTurbo(this,  0,  195, textureX, textureY); // FWheelB1
		rightFrontWheelModel[16] = new ModelRendererTurbo(this,  0,  198, textureX, textureY); // FWheelB2
		rightFrontWheelModel[17] = new ModelRendererTurbo(this,  0,  201, textureX, textureY); // FWheelB3
		rightFrontWheelModel[0].addBox(-2.5F, 4.5F, -2F, 5, 3, 4, 0F); // FWheel1
		rightFrontWheelModel[0].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[1].addBox(-7.5F, -2.5F, -2F, 3, 5, 4, 0F); // FWheel2
		rightFrontWheelModel[1].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[2].addBox(-2.5F, -7.5F, -2F, 5, 3, 4, 0F); // FWheel3
		rightFrontWheelModel[2].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[3].addBox(4.5F, -2.5F, -2F, 3, 5, 4, 0F); // FWheel4
		rightFrontWheelModel[3].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[4].addShapeBox(2.5F, -7.5F, -2F, 5, 5, 4, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); //Test
		rightFrontWheelModel[4].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[5].addShapeBox(-7.5F, -7.5F, -2F, 5, 5, 4, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); //Test
		rightFrontWheelModel[5].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[6].addShapeBox(-7.5F, 2.5F, -2F, 5, 5, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, 0F); //Test
		rightFrontWheelModel[6].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[7].addShapeBox(2.5F, 2.5F, -2F, 5, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F); //Test
		rightFrontWheelModel[7].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[8].addBox(-1.5F, -0.5F, -2F, 3, 1, 4, 0F); // FWheel9
		rightFrontWheelModel[8].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[9].addShapeBox(-1.5F, -1.5F, -2F, 3, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightFrontWheelModel[9].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[10].addShapeBox(-1.5F, 0.5F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		rightFrontWheelModel[10].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[11].addBox(-0.5F, -4.5F, -0.5F, 1, 9, 1, 0F); // FWheel12
		rightFrontWheelModel[11].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[12].addBox(-0.5F, -5.5F, -0.5F, 1, 11, 1, 0F); // FWheel13
		rightFrontWheelModel[12].setRotationPoint(17F, 2.5F, 0F);
		rightFrontWheelModel[12].rotateAngleZ = -0.7853982F;

		rightFrontWheelModel[13].addBox(-4.5F, -0.5F, -0.5F, 9, 1, 1, 0F); // BWheel14
		rightFrontWheelModel[13].setRotationPoint(17F, 2.5F, 0F);
		rightFrontWheelModel[13].rotateAngleZ = -1.570796F;

		rightFrontWheelModel[14].addBox(-0.5F, -5.5F, -0.5F, 1, 11, 1, 0F); // FWheel15
		rightFrontWheelModel[14].setRotationPoint(17F, 2.5F, 0F);
		rightFrontWheelModel[14].rotateAngleZ = -2.356194F;

		rightFrontWheelModel[15].addBox(-3F, -1F, 0.8F, 6, 2, 0, 0F); // FWheelB1
		rightFrontWheelModel[15].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[16].addBox(-3F, -3F, 0.8F, 6, 2, 0, 0F); // FWheelB2
		rightFrontWheelModel[16].setRotationPoint(17F, 2.5F, 0F);

		rightFrontWheelModel[17].addBox(-3F, 1F, 0.8F, 6, 2, 0, 0F); // FWheelB3
		rightFrontWheelModel[17].setRotationPoint(17F, 2.5F, 0F);



// Right Back Wheel
		rightBackWheelModel = new ModelRendererTurbo[15];
		rightBackWheelModel[0] = new ModelRendererTurbo(this,  0,  37, textureX, textureY); // BWheel1
		rightBackWheelModel[1] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // BWheel2
		rightBackWheelModel[2] = new ModelRendererTurbo(this,  0,  69, textureX, textureY); // BWheel3
		rightBackWheelModel[3] = new ModelRendererTurbo(this,  0,  84, textureX, textureY); // BWheel4
		rightBackWheelModel[4] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // BWheel5
		rightBackWheelModel[5] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // BWheel6
		rightBackWheelModel[6] = new ModelRendererTurbo(this,  0,  135, textureX, textureY); // BWheel7
		rightBackWheelModel[7] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // BWheel8
		rightBackWheelModel[8] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // BWheel9
		rightBackWheelModel[9] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // BWheel10
		rightBackWheelModel[10] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // BWheel11
		rightBackWheelModel[11] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // BWheel12
		rightBackWheelModel[12] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // BWheel13
		rightBackWheelModel[13] = new ModelRendererTurbo(this,  45,  508, textureX, textureY); // BWheel14
		rightBackWheelModel[14] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // BWheel15

		rightBackWheelModel[0].addBox(-2.5F, 4.5F, -2F, 5, 3, 4, 0F); // BWheel1
		rightBackWheelModel[0].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[1].addBox(-7.5F, -2.5F, -2F, 3, 5, 4, 0F); // BWheel2
		rightBackWheelModel[1].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[2].addBox(-2.5F, -7.5F, -2F, 5, 3, 4, 0F); // BWheel3
		rightBackWheelModel[2].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[3].addBox(4.5F, -2.5F, -2F, 3, 5, 4, 0F); // BWheel4
		rightBackWheelModel[3].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[4].addShapeBox(2.5F, -7.5F, -2F, 5, 5, 4, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); //Test
		rightBackWheelModel[4].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[5].addShapeBox(-7.5F, -7.5F, -2F, 5, 5, 4, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); //Test
		rightBackWheelModel[5].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[6].addShapeBox(-7.5F, 2.5F, -2F, 5, 5, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, 0F); //Test
		rightBackWheelModel[6].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[7].addShapeBox(2.5F, 2.5F, -2F, 5, 5, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F); //Test
		rightBackWheelModel[7].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[8].addBox(-1.5F, -0.5F, -2F, 3, 1, 4, 0F); // BWheel9
		rightBackWheelModel[8].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[9].addShapeBox(-1.5F, -1.5F, -2F, 3, 1, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightBackWheelModel[9].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[10].addShapeBox(-1.5F, 0.5F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); //Test
		rightBackWheelModel[10].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[11].addBox(-0.5F, -4.5F, -0.5F, 1, 9, 1, 0F); // BWheel12
		rightBackWheelModel[11].setRotationPoint(-17F, 2.5F, 0F);

		rightBackWheelModel[12].addBox(-0.5F, -5.5F, -0.5F, 1, 11, 1, 0F); // BWheel13
		rightBackWheelModel[12].setRotationPoint(-17F, 2.5F, 0F);
		rightBackWheelModel[12].rotateAngleZ = -0.7853982F;

		rightBackWheelModel[13].addBox(-4.5F, -0.5F, -0.5F, 9, 1, 1, 0F); // BWheel14
		rightBackWheelModel[13].setRotationPoint(-17F, 2.5F, 0F);
		rightBackWheelModel[13].rotateAngleZ = -1.570796F;

		rightBackWheelModel[14].addBox(-0.5F, -5.5F, -0.5F, 1, 11, 1, 0F); // BWheel15
		rightBackWheelModel[14].setRotationPoint(-17F, 2.5F, 0F);
		rightBackWheelModel[14].rotateAngleZ = -2.356194F;



		flipAll();
	}
}