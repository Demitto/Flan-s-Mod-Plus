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

public class ModelTank extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTank()	
	{


// Body
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // LTBody1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  136, textureX, textureY); // LTBody2
		bodyModel[2] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // LTBody3
		bodyModel[3] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // LTBody4
		bodyModel[4] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // LTBody5
		bodyModel[5] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // LTBody6
		bodyModel[6] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // LTBody7
		bodyModel[7] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // LTBody8
		bodyModel[8] = new ModelRendererTurbo(this,  0,  490, textureX, textureY); // LTrack9
		bodyModel[9] = new ModelRendererTurbo(this,  0,  600, textureX, textureY); // LTrack10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // LTBody11
		bodyModel[11] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // LTBody12
		bodyModel[12] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // LTrack13
		bodyModel[13] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // LTrack14
		bodyModel[14] = new ModelRendererTurbo(this,  0,  590, textureX, textureY); // LTrack15
		bodyModel[15] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // RTBody1
		bodyModel[16] = new ModelRendererTurbo(this,  0,  136, textureX, textureY); // RTBody2
		bodyModel[17] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // RTBody3
		bodyModel[18] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // RTBody4
		bodyModel[19] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // RTBody5
		bodyModel[20] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // RTBody6
		bodyModel[21] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // RTBody7
		bodyModel[22] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // RTBody8
		bodyModel[23] = new ModelRendererTurbo(this,  0,  490, textureX, textureY); // RTrack9
		bodyModel[24] = new ModelRendererTurbo(this,  0,  602, textureX, textureY); // RTrack10
		bodyModel[25] = new ModelRendererTurbo(this,  0,  530, textureX, textureY); // RTBody11
		bodyModel[26] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // RTBody12
		bodyModel[27] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // RTrack13
		bodyModel[28] = new ModelRendererTurbo(this,  0,  570, textureX, textureY); // RTrack14
		bodyModel[29] = new ModelRendererTurbo(this,  0,  590, textureX, textureY); // RTrack15
		bodyModel[30] = new ModelRendererTurbo(this,  0,  2, textureX, textureY); // Body1
		bodyModel[31] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // Body2
		bodyModel[32] = new ModelRendererTurbo(this,  200,  510, textureX, textureY); // Body3
		bodyModel[33] = new ModelRendererTurbo(this,  200,  510, textureX, textureY); // Body4
		bodyModel[34] = new ModelRendererTurbo(this,  200,  510, textureX, textureY); // Body5
		bodyModel[35] = new ModelRendererTurbo(this,  200,  510, textureX, textureY); // Body6
		bodyModel[36] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // LTrack1
		bodyModel[37] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // LTrack2
		bodyModel[38] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Rtrack1
		bodyModel[39] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Rtrack2


		bodyModel[0].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // LTBody1
		bodyModel[0].setRotationPoint(50F, -22F, 24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[1].setRotationPoint(50F, -22F, 40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[2].setRotationPoint(66F, -22F, 24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -8F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); //Test
		bodyModel[3].setRotationPoint(66F, -22F, 40F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -4F, 0F); //Test
		bodyModel[4].setRotationPoint(66F, -6F, 56F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); //Test
		bodyModel[5].setRotationPoint(50F, -6F, 56F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[6].setRotationPoint(50F, -22F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F, 0F, -16F, 0F, 0F, -16F, -8F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[7].setRotationPoint(66F, -22F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // LTrack9
		bodyModel[8].setRotationPoint(18F, -14F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, -8F, 0F, 0F, -8F, -16F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -16F); //Test
		bodyModel[9].setRotationPoint(34F, -14F, 40F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[10].setRotationPoint(50F, -6F, 16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F); //Test
		bodyModel[11].setRotationPoint(66F, -6F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // LTrack13
		bodyModel[12].setRotationPoint(18F, -18F, 24F);

		bodyModel[13].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // LTrack14
		bodyModel[13].setRotationPoint(18F, -18F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // LTrack15
		bodyModel[14].setRotationPoint(18F, -16F, 30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // RTBody1
		bodyModel[15].setRotationPoint(50F, -22F, -40F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[16].setRotationPoint(50F, -22F, -64F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 16, 16, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[17].setRotationPoint(66F, -22F, -40F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 16, 24, 0F, 0F, 0F, -24F, 0F, -16F, -8F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[18].setRotationPoint(66F, -22F, -64F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F); //Test
		bodyModel[19].setRotationPoint(66F, -6F, -64F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[20].setRotationPoint(50F, -6F, -64F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 16, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[21].setRotationPoint(50F, -22F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 48, 16, 8, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -8F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); //Test
		bodyModel[22].setRotationPoint(66F, -22F, -24F);

		bodyModel[23].addBox(0F, 0F, 0F, 32, 16, 16, 0F); // RTrack9
		bodyModel[23].setRotationPoint(18F, -14F, -40F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 16, 24, 0F, 0F, -8F, -16F, 0F, -8F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -16F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[24].setRotationPoint(34F, -14F, -64F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); //Test
		bodyModel[25].setRotationPoint(50F, -6F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, -4F, 0F); //Test

		bodyModel[26].setRotationPoint(66F, -6F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // RTrack13
		bodyModel[27].setRotationPoint(18F, -18F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 4, 4, 0F); // RTrack14
		bodyModel[28].setRotationPoint(18F, -18F, -40F);

		bodyModel[29].addBox(0F, 0F, 0F, 32, 2, 4, 0F); // RTrack15
		bodyModel[29].setRotationPoint(18F, -16F, -34F);

		bodyModel[30].addBox(0F, 0F, 0F, 96, 24, 80, 0F); // Body1
		bodyModel[30].setRotationPoint(-78F, -22F, -40F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 24, 80, 0F, 0F, -4F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F); //Test
		bodyModel[31].setRotationPoint(-94F, -22F, -40F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F, -8F, 8F, 0F, 0F, 8F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); //Test
		bodyModel[32].setRotationPoint(-78F, -14F, 40F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F); //Test
		bodyModel[33].setRotationPoint(-78F, -6F, 40F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F, -16F, 0F, 0F, -8F, 0F, 0F, 0F, 8F, 0F, -8F, 8F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[34].setRotationPoint(-78F, -14F, -63F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 70, 8, 23, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); //Test
		bodyModel[35].setRotationPoint(-78F, -6F, -63F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 80, 16, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); //Test
		bodyModel[36].setRotationPoint(50F, -6F, 24F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 80, 16, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); //Test
		bodyModel[37].setRotationPoint(-94F, -6F, 24F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 80, 16, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); //Test
		bodyModel[38].setRotationPoint(50F, -6F, -56F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 80, 16, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F); //Test
		bodyModel[39].setRotationPoint(-94F, -6F, -56F);



// Turret
		turretModel = new ModelRendererTurbo[8];
		turretModel[0] = new ModelRendererTurbo(this,  0,  650, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this,  0,  730, textureX, textureY); // Turret2
		turretModel[2] = new ModelRendererTurbo(this,  0,  765, textureX, textureY); // Turret3
		turretModel[3] = new ModelRendererTurbo(this,  100,  730, textureX, textureY); // Turret4
		turretModel[4] = new ModelRendererTurbo(this,  100,  765, textureX, textureY); // Turret5
		turretModel[5] = new ModelRendererTurbo(this,  0,  795, textureX, textureY); // Turret6
		turretModel[6] = new ModelRendererTurbo(this,  0,  870, textureX, textureY); // Turret7
		turretModel[7] = new ModelRendererTurbo(this,  120,  870, textureX, textureY); // Turret8

		turretModel[0].addBox(-3F, 0F, 0F, 48, 24, 48, 0F); // Turret1
		turretModel[0].setRotationPoint(-55F, -46F, -24F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 24, 16, 16, 0F, 0F, 0F, 0F, 0F, -16F, -16F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[1].setRotationPoint(-10F, -46F, -24F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[2].setRotationPoint(-10F, -30F, -24F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 24, 16, 16, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); //Test
		turretModel[3].setRotationPoint(-10F, -46F, 8F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 24, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); //Test
		turretModel[4].setRotationPoint(-10F, -30F, 8F);

		turretModel[5].addShapeBox(-3F, 0F, 0F, 10, 24, 48, 0F, 0F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); //Test
		turretModel[5].setRotationPoint(-65F, -46F, -24F);

		turretModel[6].addShapeBox(-3F, 0F, 0F, 48, 24, 8, 0F, -8F, -8F, 0F, -16F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		turretModel[6].setRotationPoint(-55F, -46F, -32F);

		turretModel[7].addShapeBox(-3F, 0F, 0F, 48, 24, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -8F, 0F, 0F); //Test
		turretModel[7].setRotationPoint(-55F, -46F, 24F);



// Barrel
		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this,  0,  910, textureX, textureY); // barrel1
		barrelModel[1] = new ModelRendererTurbo(this,  100,  920, textureX, textureY); // barrel2
		barrelModel[2] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // barrel2
		barrelModel[3] = new ModelRendererTurbo(this,  300,  920, textureX, textureY); // barrel3

		barrelModel[0].addShapeBox(0F, -12F, -8F, 32, 24, 16, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); //Test
		barrelModel[0].setRotationPoint(-10F, -34F, 0F);

		barrelModel[1].addBox(32F, -5F, -5F, 32, 10, 10, 0F); // barrel2
		barrelModel[1].setRotationPoint(-10F, -33F, 0F);

		barrelModel[2].addBox(64F, -4F, -4F, 32, 8, 8, 0F); // barrel2
		barrelModel[2].setRotationPoint(-10F, -33F, 0F);

		barrelModel[3].addBox(96F, -3F, -3F, 32, 6, 6, 0F); // barrel3
		barrelModel[3].setRotationPoint(-10F, -33F, 0F);

				flipAll();

		translateAll (34F, 0F,0F);

	}
}