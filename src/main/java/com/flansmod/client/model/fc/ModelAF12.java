//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAF12 extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelAF12()	
	{


// Nose
		noseModel = new ModelRendererTurbo[13];
		noseModel[0] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // Noseupper
		noseModel[1] = new ModelRendererTurbo(this,  200,  345, textureX, textureY); // Noseconnect
		noseModel[2] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // Noselower
		noseModel[3] = new ModelRendererTurbo(this,  200,  440, textureX, textureY); // Noseleft
		noseModel[4] = new ModelRendererTurbo(this,  200,  440, textureX, textureY); // Noseright
		noseModel[5] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // NoseFL
		noseModel[6] = new ModelRendererTurbo(this,  200,  460, textureX, textureY); // NoseFR
		noseModel[7] = new ModelRendererTurbo(this,  250,  480, textureX, textureY); // NoseFT
		noseModel[8] = new ModelRendererTurbo(this,  300,  200, textureX, textureY); // NoseD1
		noseModel[9] = new ModelRendererTurbo(this,  300,  220, textureX, textureY); // NoseD2
		noseModel[10] = new ModelRendererTurbo(this,  300,  240, textureX, textureY); // NoseD3
		noseModel[11] = new ModelRendererTurbo(this,  300,  260, textureX, textureY); // NoseD4
		noseModel[12] = new ModelRendererTurbo(this,  300,  280, textureX, textureY); // NoseD5

		noseModel[0].addBox(0F, 0F, -2F, 49, 6, 17, 0F); // Noseupper
		noseModel[0].setRotationPoint(-84F, -25F, -6.5F);
		noseModel[0].rotateAngleZ = 0.122173F;

		noseModel[1].addBox(0F, 0F, -2F, 6, 21, 18, 0F); // Noseconnect
		noseModel[1].setRotationPoint(-36F, -31F, -7F);

		noseModel[2].addBox(0F, -6F, -2F, 49, 6, 17, 0F); // Noselower
		noseModel[2].setRotationPoint(-84F, -16F, -6.5F);
		noseModel[2].rotateAngleZ = -0.122173F;

		noseModel[3].addBox(0F, 0F, -2F, 40, 9, 1, 0F); // Noseleft
		noseModel[3].setRotationPoint(-75F, -25F, -6.6F);

		noseModel[4].addBox(0F, 0F, -2F, 40, 9, 1, 0F); // Noseright
		noseModel[4].setRotationPoint(-75F, -25F, 9.6F);

		noseModel[5].addBox(0F, 0F, -2F, 5, 9, 8, 0F); // NoseFL
		noseModel[5].setRotationPoint(-87F, -25F, -6.4F);

		noseModel[6].addBox(0F, 0F, -2F, 5, 9, 8, 0F); // NoseFR
		noseModel[6].setRotationPoint(-87F, -25F, 2.4F);

		noseModel[7].addBox(0F, 0F, 0F, 5, 9, 8, 0F); // NoseFT
		noseModel[7].setRotationPoint(-87.1F, -25.1F, -4F);

		noseModel[8].addBox(0F, 0F, -2F, 22, 6, 9, 0F); // NoseD1
		noseModel[8].setRotationPoint(-84F, -25F, -2.5F);
		noseModel[8].rotateAngleZ = 0.2617994F;

		noseModel[9].addBox(0F, 0F, -2F, 18, 6, 2, 0F); // NoseD2
		noseModel[9].setRotationPoint(-65F, -30F, -2F);
		noseModel[9].rotateAngleZ = 0.08726646F;

		noseModel[10].addBox(0F, 0F, -2F, 18, 6, 2, 0F); // NoseD3
		noseModel[10].setRotationPoint(-65F, -30F, 4F);
		noseModel[10].rotateAngleZ = 0.08726646F;

		noseModel[11].addBox(0F, 0F, -2F, 11, 6, 9, 0F); // NoseD4
		noseModel[11].setRotationPoint(-47F, -32F, -2.5F);
		noseModel[11].rotateAngleZ = -0.1047198F;

		noseModel[12].addBox(0F, 0F, -2F, 22, 6, 5, 0F); // NoseD5
		noseModel[12].setRotationPoint(-87F, -25F, -0.5F);
		noseModel[12].rotateAngleZ = 0.2268928F;



// Body
		bodyModel = new ModelRendererTurbo[57];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Cockpitshellbase
		bodyModel[1] = new ModelRendererTurbo(this,  0,  79, textureX, textureY); // CockpitshellLwall
		bodyModel[2] = new ModelRendererTurbo(this,  0,  103, textureX, textureY); // CockpitshellRwall
		bodyModel[3] = new ModelRendererTurbo(this,  0,  126, textureX, textureY); // Cockpitshellback
		bodyModel[4] = new ModelRendererTurbo(this,  0,  166, textureX, textureY); // Cockpitseatback
		bodyModel[5] = new ModelRendererTurbo(this,  0,  195, textureX, textureY); // Cockpitseathead
		bodyModel[6] = new ModelRendererTurbo(this,  0,  213, textureX, textureY); // Cockpitseatbutt
		bodyModel[7] = new ModelRendererTurbo(this,  0,  229, textureX, textureY); // CockpitseatbackD1
		bodyModel[8] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // CockpitseatbackD2
		bodyModel[9] = new ModelRendererTurbo(this,  0,  271, textureX, textureY); // Cockpitcolumnbase
		bodyModel[10] = new ModelRendererTurbo(this,  0,  294, textureX, textureY); // Cockpitcolumnback
		bodyModel[11] = new ModelRendererTurbo(this,  0,  322, textureX, textureY); // CockpitcolumnbackD1
		bodyModel[12] = new ModelRendererTurbo(this,  0,  344, textureX, textureY); // CockpitcolumnbackD2
		bodyModel[13] = new ModelRendererTurbo(this,  0,  365, textureX, textureY); // Cockpitcolumnsticklower
		bodyModel[14] = new ModelRendererTurbo(this,  9,  380, textureX, textureY); // CockpitcolumnsticklowerD1
		bodyModel[15] = new ModelRendererTurbo(this,  0,  388, textureX, textureY); // Cockpitcomputerbase
		bodyModel[16] = new ModelRendererTurbo(this,  10,  392, textureX, textureY); // Cockpitcomputerstickupper
		bodyModel[17] = new ModelRendererTurbo(this,  10,  392, textureX, textureY); // Cockpitcomputersticklower
		bodyModel[18] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Cockpitcomputerback
		bodyModel[19] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // CockpitcomputerscreenSHAPE
		bodyModel[20] = new ModelRendererTurbo(this,  0,  433, textureX, textureY); // CockpitshellLwallD1
		bodyModel[21] = new ModelRendererTurbo(this,  0,  441, textureX, textureY); // Cockpitshellfront
		bodyModel[22] = new ModelRendererTurbo(this,  0,  483, textureX, textureY); // CockpitshellLwallA1
		bodyModel[23] = new ModelRendererTurbo(this,  50,  464, textureX, textureY); // CockpitshellLwallA2
		bodyModel[24] = new ModelRendererTurbo(this,  12,  505, textureX, textureY); // CockpitshellLwallA3
		bodyModel[25] = new ModelRendererTurbo(this,  110,  484, textureX, textureY); // CockpitshellLwallA4
		bodyModel[26] = new ModelRendererTurbo(this,  123,  488, textureX, textureY); // CockpitshellLwallA5
		bodyModel[27] = new ModelRendererTurbo(this,  0,  483, textureX, textureY); // CockpitshellRwallA1
		bodyModel[28] = new ModelRendererTurbo(this,  50,  464, textureX, textureY); // CockpitshellRwallA2
		bodyModel[29] = new ModelRendererTurbo(this,  12,  505, textureX, textureY); // CockpitshellRwallA3
		bodyModel[30] = new ModelRendererTurbo(this,  110,  484, textureX, textureY); // CockpitshellRwallA4
		bodyModel[31] = new ModelRendererTurbo(this,  123,  488, textureX, textureY); // CockpitshellRwallA5
		bodyModel[32] = new ModelRendererTurbo(this,  100,  48, textureX, textureY); // CockpitcanopyR1
		bodyModel[33] = new ModelRendererTurbo(this,  100,  54, textureX, textureY); // CockpitcanopyR2
		bodyModel[34] = new ModelRendererTurbo(this,  100,  60, textureX, textureY); // CockpitcanopyR3
		bodyModel[35] = new ModelRendererTurbo(this,  100,  70, textureX, textureY); // CockpitcanopyR4
		bodyModel[36] = new ModelRendererTurbo(this,  100,  48, textureX, textureY); // CockpitcanopyL1
		bodyModel[37] = new ModelRendererTurbo(this,  100,  54, textureX, textureY); // CockpitcanopyL2
		bodyModel[38] = new ModelRendererTurbo(this,  100,  60, textureX, textureY); // CockpitcanopyL3
		bodyModel[39] = new ModelRendererTurbo(this,  100,  70, textureX, textureY); // CockpitcanopyL4
		bodyModel[40] = new ModelRendererTurbo(this,  100,  80, textureX, textureY); // CockpitcanopyM1
		bodyModel[41] = new ModelRendererTurbo(this,  100,  80, textureX, textureY); // CockpitcanopyM2
		bodyModel[42] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Cockpitconnect
		bodyModel[43] = new ModelRendererTurbo(this,  100,  144, textureX, textureY); // CockpitconnectD1
		bodyModel[44] = new ModelRendererTurbo(this,  100,  168, textureX, textureY); // CockpitconnectD2
		bodyModel[45] = new ModelRendererTurbo(this,  100,  176, textureX, textureY); // CockpitconnectD3
		bodyModel[46] = new ModelRendererTurbo(this,  51,  184, textureX, textureY); // BodyMain
		bodyModel[47] = new ModelRendererTurbo(this,  47,  230, textureX, textureY); // BodyLeftBlock
		bodyModel[48] = new ModelRendererTurbo(this,  47,  265, textureX, textureY); // BodyRightBlock
		bodyModel[49] = new ModelRendererTurbo(this,  47,  300, textureX, textureY); // BodyTopBlock
		bodyModel[50] = new ModelRendererTurbo(this,  100,  335, textureX, textureY); // BodyTopBlockconnect1
		bodyModel[51] = new ModelRendererTurbo(this,  100,  350, textureX, textureY); // BodyTopBlockconnect2
		bodyModel[52] = new ModelRendererTurbo(this,  100,  365, textureX, textureY); // BodyTopBlockconnect3
		bodyModel[53] = new ModelRendererTurbo(this,  100,  365, textureX, textureY); // BodyTopBlockconnect4
		bodyModel[54] = new ModelRendererTurbo(this,  100,  374, textureX, textureY); // BodyTopBlockconnect5
		bodyModel[55] = new ModelRendererTurbo(this,  100,  385, textureX, textureY); // BodyTopBlockA1SHAPE
		bodyModel[56] = new ModelRendererTurbo(this,  100,  411, textureX, textureY); // BodyTopBlockA2

		bodyModel[0].addBox(0F, 0F, 0F, 32, 1, 18, 0F); // Cockpitshellbase
		bodyModel[0].setRotationPoint(-29F, -11F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 32, 20, 1, 0F); // CockpitshellLwall
		bodyModel[1].setRotationPoint(-29F, -31F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 32, 20, 1, 0F); // CockpitshellRwall
		bodyModel[2].setRotationPoint(-29F, -31F, 8F);

		bodyModel[3].addBox(0F, 0F, -2F, 1, 20, 16, 0F); // Cockpitshellback
		bodyModel[3].setRotationPoint(2F, -31F, -6F);

		bodyModel[4].addBox(0F, 0F, -2F, 3, 15, 10, 0F); // Cockpitseatback
		bodyModel[4].setRotationPoint(-1F, -29F, -3F);
		bodyModel[4].rotateAngleZ = -0.1745329F;

		bodyModel[5].addBox(0F, 0F, 0F, 4, 6, 8, 0F); // Cockpitseathead
		bodyModel[5].setRotationPoint(-1.5F, -34F, -4F);

		bodyModel[6].addBox(0F, 0F, 0F, 12, 4, 10, 0F); // Cockpitseatbutt
		bodyModel[6].setRotationPoint(-14.5F, -15F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // CockpitseatbackD1
		bodyModel[7].setRotationPoint(0F, -18F, -8F);
		bodyModel[7].rotateAngleZ = -0.1745329F;

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // CockpitseatbackD2
		bodyModel[8].setRotationPoint(0F, -24F, -8F);
		bodyModel[8].rotateAngleZ = -0.1745329F;

		bodyModel[9].addBox(-4F, 0F, 0F, 3, 9, 10, 0F); // Cockpitcolumnbase
		bodyModel[9].setRotationPoint(-22F, -20F, -5F);
		bodyModel[9].rotateAngleZ = 0.3141593F;

		bodyModel[10].addBox(-4F, 0F, 0F, 1, 9, 16, 0F); // Cockpitcolumnback
		bodyModel[10].setRotationPoint(-23F, -20F, -8F);
		bodyModel[10].rotateAngleZ = 0.3141593F;

		bodyModel[11].addBox(-3F, 2F, 0F, 1, 2, 16, 0F); // CockpitcolumnbackD1
		bodyModel[11].setRotationPoint(-23F, -20F, -8F);
		bodyModel[11].rotateAngleZ = 0.3141593F;

		bodyModel[12].addBox(-3F, 5F, 0F, 1, 2, 16, 0F); // CockpitcolumnbackD2
		bodyModel[12].setRotationPoint(-23F, -20F, -8F);
		bodyModel[12].rotateAngleZ = 0.3141593F;

		bodyModel[13].addBox(-1F, 0F, 0F, 3, 9, 3, 0F); // Cockpitcolumnsticklower
		bodyModel[13].setRotationPoint(-22F, -20F, -1.5F);
		bodyModel[13].rotateAngleZ = -0.1919862F;

		bodyModel[14].addBox(0F, 1F, 0F, 2, 7, 2, 0F); // CockpitcolumnsticklowerD1
		bodyModel[14].setRotationPoint(-22F, -20F, -1F);
		bodyModel[14].rotateAngleZ = -0.05235988F;

		bodyModel[15].addBox(-1F, -4F, 0F, 2, 5, 1, 0F); // Cockpitcomputerbase
		bodyModel[15].setRotationPoint(-21F, -22F, -8F);

		bodyModel[16].addBox(-0.5F, -3F, 1F, 1, 1, 2, 0F); // Cockpitcomputerstickupper
		bodyModel[16].setRotationPoint(-21F, -22F, -8F);

		bodyModel[17].addBox(-0.5F, -1F, 1F, 1, 1, 2, 0F); // Cockpitcomputersticklower
		bodyModel[17].setRotationPoint(-21F, -22F, -8F);

		bodyModel[18].addBox(-1F, -4.5F, 1F, 1, 4, 4, 0F); // Cockpitcomputerback
		bodyModel[18].setRotationPoint(-21F, -21F, -6F);

		bodyModel[19].addShapeBox(0F, -10F, 0.5F, 1, 10, 10, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		bodyModel[19].setRotationPoint(-21F, -21F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 31, 4, 1, 0F); // CockpitshellLwallD1
		bodyModel[20].setRotationPoint(-29F, -25F, -8.466666F);

		bodyModel[21].addBox(0F, 0F, -2F, 1, 21, 18, 0F); // Cockpitshellfront
		bodyModel[21].setRotationPoint(-30F, -31F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 51, 15, 2, 0F); // CockpitshellLwallA1
		bodyModel[22].setRotationPoint(-26F, -28F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 13, 10, 2, 0F); // CockpitshellLwallA2
		bodyModel[23].setRotationPoint(-18F, -25F, -11.3F);

		bodyModel[24].addBox(0F, 0F, 0F, 19, 3, 2, 0F); // CockpitshellLwallA3
		bodyModel[24].setRotationPoint(-23F, -23F, -11.1F);

		bodyModel[25].addBox(-3F, 0F, 0F, 3, 15, 1, 0F); // CockpitshellLwallA4
		bodyModel[25].setRotationPoint(-26F, -28F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 29, 19, 1, 0F); // CockpitshellLwallA5
		bodyModel[26].setRotationPoint(-26F, -30F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 51, 15, 2, 0F); // CockpitshellRwallA1
		bodyModel[27].setRotationPoint(-26F, -28F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 13, 10, 2, 0F); // CockpitshellRwallA2
		bodyModel[28].setRotationPoint(-18F, -25F, 9.3F);

		bodyModel[29].addBox(0F, 0F, 0F, 19, 3, 2, 0F); // CockpitshellRwallA3
		bodyModel[29].setRotationPoint(-23F, -23F, 9.1F);

		bodyModel[30].addBox(-3F, 0F, 0F, 3, 15, 1, 0F); // CockpitshellRwallA4
		bodyModel[30].setRotationPoint(-26F, -28F, 9F);

		bodyModel[31].addBox(0F, 0F, 0F, 29, 19, 1, 0F); // CockpitshellRwallA5
		bodyModel[31].setRotationPoint(-26F, -30F, 9F);

		bodyModel[32].addBox(-24F, 0F, 0F, 24, 2, 1, 0F); // CockpitcanopyR1
		bodyModel[32].setRotationPoint(-8F, -42F, 7F);
		bodyModel[32].rotateAngleZ = 0.4712389F;

		bodyModel[33].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // CockpitcanopyR2
		bodyModel[33].setRotationPoint(-8F, -42F, 6.9F);

		bodyModel[34].addBox(0F, 0F, 0F, 28, 2, 1, 0F); // CockpitcanopyR3
		bodyModel[34].setRotationPoint(-8F, -42F, 7.1F);
		bodyModel[34].rotateAngleZ = -1.134464F;

		bodyModel[35].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // CockpitcanopyR4
		bodyModel[35].setRotationPoint(6F, -42F, 7F);
		bodyModel[35].rotateAngleZ = -0.6457718F;

		bodyModel[36].addBox(-24F, 0F, 0F, 24, 2, 1, 0F); // CockpitcanopyL1
		bodyModel[36].setRotationPoint(-8F, -42F, -8F);
		bodyModel[36].rotateAngleZ = 0.4712389F;

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // CockpitcanopyL2
		bodyModel[37].setRotationPoint(-8F, -42F, -7.9F);

		bodyModel[38].addBox(0F, 0F, 0F, 28, 2, 1, 0F); // CockpitcanopyL3
		bodyModel[38].setRotationPoint(-8F, -42F, -8.1F);
		bodyModel[38].rotateAngleZ = -1.134464F;

		bodyModel[39].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // CockpitcanopyL4
		bodyModel[39].setRotationPoint(6F, -42F, -8F);
		bodyModel[39].rotateAngleZ = -0.6457718F;

		bodyModel[40].addBox(0F, -0.1F, -14F, 2, 1, 14, 0F); // CockpitcanopyM1
		bodyModel[40].setRotationPoint(-8F, -42F, 6.9F);

		bodyModel[41].addBox(0F, -0.1F, -14F, 2, 1, 14, 0F); // CockpitcanopyM2
		bodyModel[41].setRotationPoint(4F, -42F, 6.9F);

		bodyModel[42].addBox(0F, 0F, -2F, 22, 21, 20, 0F); // Cockpitconnect
		bodyModel[42].setRotationPoint(3F, -31F, -8F);

		bodyModel[43].addBox(0F, 0F, -2F, 21, 7, 14, 0F); // CockpitconnectD1
		bodyModel[43].setRotationPoint(5F, -37.46667F, -5F);
		bodyModel[43].rotateAngleZ = -0.3839724F;

		bodyModel[44].addBox(0F, -1F, -2F, 21, 1, 4, 0F); // CockpitconnectD2
		bodyModel[44].setRotationPoint(5F, -37.46667F, -3F);
		bodyModel[44].rotateAngleZ = -0.3839724F;

		bodyModel[45].addBox(0F, -1F, -2F, 21, 1, 4, 0F); // CockpitconnectD3
		bodyModel[45].setRotationPoint(5F, -37.46667F, 3F);
		bodyModel[45].rotateAngleZ = -0.3839724F;

		bodyModel[46].addBox(0F, 0F, 0F, 40, 21, 22, 0F); // BodyMain
		bodyModel[46].setRotationPoint(25F, -31F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 40, 20, 11, 0F); // BodyLeftBlock
		bodyModel[47].setRotationPoint(25F, -31F, -22F);

		bodyModel[48].addBox(0F, 0F, 0F, 40, 20, 11, 0F); // BodyRightBlock
		bodyModel[48].setRotationPoint(25F, -31F, 11F);

		bodyModel[49].addBox(0F, 0F, 0F, 31, 3, 28, 0F); // BodyTopBlock
		bodyModel[49].setRotationPoint(34F, -34F, -14F);

		bodyModel[50].addBox(-8F, 0F, 0F, 8, 3, 8, 0F); // BodyTopBlockconnect1
		bodyModel[50].setRotationPoint(34F, -34F, -13.9F);
		bodyModel[50].rotateAngleZ = 0.418879F;

		bodyModel[51].addBox(-8F, 0F, 0F, 8, 3, 8, 0F); // BodyTopBlockconnect2
		bodyModel[51].setRotationPoint(34F, -34F, 5.9F);
		bodyModel[51].rotateAngleZ = 0.418879F;

		bodyModel[52].addBox(-19F, 0F, 0F, 19, 3, 2, 0F); // BodyTopBlockconnect3
		bodyModel[52].setRotationPoint(34F, -33.5F, 4F);

		bodyModel[53].addBox(-19F, 0F, 0F, 19, 3, 2, 0F); // BodyTopBlockconnect4
		bodyModel[53].setRotationPoint(34F, -33.5F, -6F);

		bodyModel[54].addBox(-19F, 0F, 0F, 19, 3, 4, 0F); // BodyTopBlockconnect5
		bodyModel[54].setRotationPoint(34F, -34F, -2F);
		bodyModel[54].rotateAngleZ = 0.1035562F;

		bodyModel[55].addBox(0F, 0F, 0F, 22, 2, 20, 0F); // BodyTopBlockA1SHAPE
		bodyModel[55].setRotationPoint(40F, -36F, -10F);

		bodyModel[56].addBox(0F, 0F, 0F, 20, 1, 8, 0F); // BodyTopBlockA2
		bodyModel[56].setRotationPoint(41F, -36.5F, -4F);



// Tail
		tailModel = new ModelRendererTurbo[20];
		tailModel[0] = new ModelRendererTurbo(this,  100,  425, textureX, textureY); // TailEngineL
		tailModel[1] = new ModelRendererTurbo(this,  100,  425, textureX, textureY); // TailEngineR
		tailModel[2] = new ModelRendererTurbo(this,  100,  40, textureX, textureY); // TailEngineM1
		tailModel[3] = new ModelRendererTurbo(this,  100,  40, textureX, textureY); // TailEngineM2
		tailModel[4] = new ModelRendererTurbo(this,  100,  40, textureX, textureY); // TailEngineM3
		tailModel[5] = new ModelRendererTurbo(this,  100,  40, textureX, textureY); // TailEngineM4
		tailModel[6] = new ModelRendererTurbo(this,  100,  40, textureX, textureY); // TailEngineM5
		tailModel[7] = new ModelRendererTurbo(this,  100,  460, textureX, textureY); // TailEngineRD1
		tailModel[8] = new ModelRendererTurbo(this,  100,  460, textureX, textureY); // TailEngineRD2
		tailModel[9] = new ModelRendererTurbo(this,  100,  468, textureX, textureY); // TailEngineRD3
		tailModel[10] = new ModelRendererTurbo(this,  100,  468, textureX, textureY); // TailEngineRD4
		tailModel[11] = new ModelRendererTurbo(this,  100,  468, textureX, textureY); // TailEngineRD5
		tailModel[12] = new ModelRendererTurbo(this,  156,  455, textureX, textureY); // TailEngineRD6
		tailModel[13] = new ModelRendererTurbo(this,  100,  460, textureX, textureY); // TailEngineLD1
		tailModel[14] = new ModelRendererTurbo(this,  100,  460, textureX, textureY); // TailEngineLD2
		tailModel[15] = new ModelRendererTurbo(this,  100,  468, textureX, textureY); // TailEngineLD3
		tailModel[16] = new ModelRendererTurbo(this,  100,  468, textureX, textureY); // TailEngineLD4
		tailModel[17] = new ModelRendererTurbo(this,  100,  468, textureX, textureY); // TailEngineLD5
		tailModel[18] = new ModelRendererTurbo(this,  156,  455, textureX, textureY); // TailEngineLD6
		tailModel[19] = new ModelRendererTurbo(this,  164,  39, textureX, textureY); // Tailconnect2SHAPE

		tailModel[0].addBox(0F, 0F, 0F, 15, 19, 12, 0F); // TailEngineL
		tailModel[0].setRotationPoint(65F, -32F, -13F);

		tailModel[1].addBox(0F, 0F, 0F, 15, 19, 12, 0F); // TailEngineR
		tailModel[1].setRotationPoint(65F, -32F, 1F);

		tailModel[2].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // TailEngineM1
		tailModel[2].setRotationPoint(65F, -31F, -1F);

		tailModel[3].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // TailEngineM2
		tailModel[3].setRotationPoint(65F, -27F, -1F);

		tailModel[4].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // TailEngineM3
		tailModel[4].setRotationPoint(65F, -23F, -1F);

		tailModel[5].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // TailEngineM4
		tailModel[5].setRotationPoint(65F, -19F, -1F);

		tailModel[6].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // TailEngineM5
		tailModel[6].setRotationPoint(65F, -15.5F, -1F);

		tailModel[7].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // TailEngineRD1
		tailModel[7].setRotationPoint(65F, -29F, 13F);

		tailModel[8].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // TailEngineRD2
		tailModel[8].setRotationPoint(65F, -19F, 13F);

		tailModel[9].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // TailEngineRD3
		tailModel[9].setRotationPoint(76F, -25F, 13F);

		tailModel[10].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // TailEngineRD4
		tailModel[10].setRotationPoint(68F, -25F, 13F);

		tailModel[11].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // TailEngineRD5
		tailModel[11].setRotationPoint(72F, -25F, 13F);

		tailModel[12].addBox(0F, 0F, 0F, 13, 21, 9, 0F); // TailEngineRD6
		tailModel[12].setRotationPoint(65F, -33F, 2F);

		tailModel[13].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // TailEngineLD1
		tailModel[13].setRotationPoint(65F, -29F, -14F);

		tailModel[14].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // TailEngineLD2
		tailModel[14].setRotationPoint(65F, -19F, -14F);

		tailModel[15].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // TailEngineLD3
		tailModel[15].setRotationPoint(76F, -25F, -14F);

		tailModel[16].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // TailEngineLD4
		tailModel[16].setRotationPoint(68F, -25F, -14F);

		tailModel[17].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // TailEngineLD5
		tailModel[17].setRotationPoint(72F, -25F, -14F);

		tailModel[18].addBox(0F, 0F, 0F, 13, 21, 9, 0F); // TailEngineLD6
		tailModel[18].setRotationPoint(65F, -33F, -11F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 6, 16, 38, 0F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F); //Test
		tailModel[19].setRotationPoint(65F, -29F, -19F);



// Left Wing
		leftWingModel = new ModelRendererTurbo[11];
		leftWingModel[0] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // RightWingBack
		leftWingModel[1] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // RightWingBack2
		leftWingModel[2] = new ModelRendererTurbo(this,  200,  120, textureX, textureY); // RightWingBack3
		leftWingModel[3] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // RightWingFront1
		leftWingModel[4] = new ModelRendererTurbo(this,  200,  160, textureX, textureY); // RightWingFront2
		leftWingModel[5] = new ModelRendererTurbo(this,  200,  180, textureX, textureY); // RightWingFront3
		leftWingModel[6] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // RightWingFront4
		leftWingModel[7] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // RightWingconnect
		leftWingModel[8] = new ModelRendererTurbo(this,  200,  260, textureX, textureY); // RightWingconnect2
		leftWingModel[9] = new ModelRendererTurbo(this,  200,  280, textureX, textureY); // RightWingconnect3
		leftWingModel[10] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // RightWingconnect4

		leftWingModel[0].addBox(-20F, 0F, 0F, 20, 3, 12, 0F); // RightWingBack
		leftWingModel[0].setRotationPoint(64F, -18F, 22F);
		leftWingModel[0].rotateAngleX = 3.141593F;
		leftWingModel[0].rotateAngleY = -1.047198F;

		leftWingModel[1].addBox(-40F, 0F, 8F, 20, 3, 4, 0F); // RightWingBack2
		leftWingModel[1].setRotationPoint(64F, -18F, 22F);
		leftWingModel[1].rotateAngleX = 3.141593F;
		leftWingModel[1].rotateAngleY = -1.047198F;

		leftWingModel[2].addBox(-90F, 0F, 0F, 50, 3, 12, 0F); // RightWingBack3
		leftWingModel[2].setRotationPoint(64F, -18F, 22F);
		leftWingModel[2].rotateAngleX = 3.141593F;
		leftWingModel[2].rotateAngleY = -1.047198F;

		leftWingModel[3].addBox(-85F, 0F, 31F, 91, 2, 12, 0F); // RightWingFront1
		leftWingModel[3].setRotationPoint(64F, -18.3F, 22F);
		leftWingModel[3].rotateAngleX = 3.141593F;
		leftWingModel[3].rotateAngleY = -1.396263F;

		leftWingModel[4].addBox(-56F, 0F, 21F, 62, 1, 12, 0F); // RightWingFront2
		leftWingModel[4].setRotationPoint(64F, -18.2F, 22F);
		leftWingModel[4].rotateAngleX = 3.141593F;
		leftWingModel[4].rotateAngleY = -1.396263F;

		leftWingModel[5].addBox(-56F, 0F, 21F, 62, 1, 12, 0F); // RightWingFront3
		leftWingModel[5].setRotationPoint(64F, -19.5F, 22F);
		leftWingModel[5].rotateAngleX = 3.141593F;
		leftWingModel[5].rotateAngleY = -1.396263F;

		leftWingModel[6].addBox(-28F, 0F, 9F, 21, 2, 9, 0F); // RightWingFront4
		leftWingModel[6].setRotationPoint(64F, -18.9F, 22F);
		leftWingModel[6].rotateAngleX = 3.141593F;
		leftWingModel[6].rotateAngleY = -1.047198F;

		leftWingModel[7].addBox(-24F, 0F, 0F, 27, 10, 11, 0F); // RightWingconnect
		leftWingModel[7].setRotationPoint(52F, -14.5F, 29F);
		leftWingModel[7].rotateAngleX = 3.141593F;
		leftWingModel[7].rotateAngleY = 0.1745329F;

		leftWingModel[8].addBox(-24F, 0F, 0F, 25, 5, 11, 0F); // RightWingconnect2
		leftWingModel[8].setRotationPoint(24F, -12.5F, 21F);
		leftWingModel[8].rotateAngleX = 3.141593F;
		leftWingModel[8].rotateAngleY = 0.541052F;

		leftWingModel[9].addBox(-24F, 0F, 0F, 25, 5, 11, 0F); // RightWingconnect3
		leftWingModel[9].setRotationPoint(24F, -24.5F, 21F);
		leftWingModel[9].rotateAngleX = 3.141593F;
		leftWingModel[9].rotateAngleY = 0.541052F;

		leftWingModel[10].addBox(-24F, 0F, 0F, 25, 6, 11, 0F); // RightWingconnect4
		leftWingModel[10].setRotationPoint(24F, -18F, 21F);
		leftWingModel[10].rotateAngleX = 3.141593F;
		leftWingModel[10].rotateAngleY = 0.8726646F;



// Right Wing
		rightWingModel = new ModelRendererTurbo[11];
		rightWingModel[0] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // LeftWingBack
		rightWingModel[1] = new ModelRendererTurbo(this,  200,  120, textureX, textureY); // LeftWingBack3
		rightWingModel[2] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // LeftWingBack2
		rightWingModel[3] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // LeftWingFront1
		rightWingModel[4] = new ModelRendererTurbo(this,  200,  160, textureX, textureY); // LeftWingFront2
		rightWingModel[5] = new ModelRendererTurbo(this,  200,  180, textureX, textureY); // LeftWingFront3
		rightWingModel[6] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // LeftWingFront4
		rightWingModel[7] = new ModelRendererTurbo(this,  200,  280, textureX, textureY); // LeftWingconnect3
		rightWingModel[8] = new ModelRendererTurbo(this,  200,  260, textureX, textureY); // LeftWingconnect2
		rightWingModel[9] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // LeftWingconnect4
		rightWingModel[10] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // LeftWingconnect

		rightWingModel[0].addBox(-20F, 0F, 0F, 20, 3, 12, 0F); // LeftWingBack
		rightWingModel[0].setRotationPoint(64F, -21F, -22F);
		rightWingModel[0].rotateAngleY = 1.047198F;

		rightWingModel[1].addBox(-90F, 0F, 0F, 50, 3, 12, 0F); // LeftWingBack3
		rightWingModel[1].setRotationPoint(64F, -21F, -22F);
		rightWingModel[1].rotateAngleY = 1.047198F;

		rightWingModel[2].addBox(-40F, 0F, 8F, 20, 3, 4, 0F); // LeftWingBack2
		rightWingModel[2].setRotationPoint(64F, -21F, -22F);
		rightWingModel[2].rotateAngleY = 1.047198F;

		rightWingModel[3].addBox(-85F, 0F, 31F, 91, 2, 12, 0F); // LeftWingFront1
		rightWingModel[3].setRotationPoint(64F, -20.5F, -22F);
		rightWingModel[3].rotateAngleY = 1.396263F;

		rightWingModel[4].addBox(-56F, 0F, 21F, 62, 1, 12, 0F); // LeftWingFront2
		rightWingModel[4].setRotationPoint(64F, -20.7F, -22F);
		rightWingModel[4].rotateAngleY = 1.396263F;

		rightWingModel[5].addBox(-56F, 0F, 21F, 62, 1, 12, 0F); // LeftWingFront3
		rightWingModel[5].setRotationPoint(64F, -19.2F, -22F);
		rightWingModel[5].rotateAngleY = 1.396263F;

		rightWingModel[6].addBox(-28F, 0F, 9F, 21, 2, 9, 0F); // LeftWingFront4
		rightWingModel[6].setRotationPoint(64F, -20.9F, -22F);
		rightWingModel[6].rotateAngleY = 1.047198F;

		rightWingModel[7].addBox(-24F, 0F, 0F, 25, 5, 11, 0F); // LeftWingconnect3
		rightWingModel[7].setRotationPoint(24F, -29.5F, -21F);
		rightWingModel[7].rotateAngleY = -0.541052F;

		rightWingModel[8].addBox(-24F, 0F, 0F, 25, 5, 11, 0F); // LeftWingconnect2
		rightWingModel[8].setRotationPoint(24F, -17.5F, -21F);
		rightWingModel[8].rotateAngleY = -0.541052F;

		rightWingModel[9].addBox(-24F, 0F, 0F, 25, 6, 11, 0F); // LeftWingconnect4
		rightWingModel[9].setRotationPoint(24F, -24F, -21F);
		rightWingModel[9].rotateAngleY = -0.8726646F;

		rightWingModel[10].addBox(-24F, 0F, 0F, 27, 10, 11, 0F); // LeftWingconnect
		rightWingModel[10].setRotationPoint(52F, -24.5F, -29F);
		rightWingModel[10].rotateAngleY = -0.1745329F;




// Pitch Flap Left
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  300,  60, textureX, textureY); // LeftFlapRight1SHAPE
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this,  300,  60, textureX, textureY); // LeftFlapRight2SHAPE

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, -10F, 17, 1, 10, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		pitchFlapLeftModel[0].setRotationPoint(71F, -27.5F, -14F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, -10F, 17, 1, 10, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		pitchFlapLeftModel[1].setRotationPoint(71F, -17.5F, -14F);



// Pitch Flap Right
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,  300,  60, textureX, textureY); // PitchFlapRight1SHAPE
		pitchFlapRightModel[1] = new ModelRendererTurbo(this,  300,  60, textureX, textureY); // PitchFlapRight2SHAPE

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); //Test
		pitchFlapRightModel[0].setRotationPoint(71F, -27.5F, 14F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); //Test
		pitchFlapRightModel[1].setRotationPoint(71F, -17.5F, 14F);



// Pitch Flap Left Wing
		pitchFlapLeftWingModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // LeftWingFlapcentre
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this,  300,  20, textureX, textureY); // LeftWingFlapForeSHAPE
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this,  300,  40, textureX, textureY); // LeftWingFlapaftSHAPE
		pitchFlapLeftWingModel[3] = new ModelRendererTurbo(this,  300,  80, textureX, textureY); // LeftWingFlapBack

		pitchFlapLeftWingModel[0].addBox(-6F, -1F, 2F, 12, 2, 16, 0F); // LeftWingFlapcentre
		pitchFlapLeftWingModel[0].setRotationPoint(-53F, -19F, 6.6F);


		pitchFlapLeftWingModel[1].addShapeBox(-18F, -1F, 2F, 12, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); //Test
		pitchFlapLeftWingModel[1].setRotationPoint(-53F, -19F, 6.6F);

		pitchFlapLeftWingModel[2].addShapeBox(6F, -1F, 2F, 12, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); //Test
		pitchFlapLeftWingModel[2].setRotationPoint(-53F, -19F, 6.6F);

		pitchFlapLeftWingModel[3].addBox(-7.3F, 0F, 16F, 8, 3, 20, 0F); // LeftWingFlapBack
		pitchFlapLeftWingModel[3].setRotationPoint(56F, -21F, -22F);
		pitchFlapLeftWingModel[3].rotateAngleY = 2.617994F;



// Pitch Flap Right Wing
		pitchFlapRightWingModel = new ModelRendererTurbo[4];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // RightWingFlapcentre
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this,  300,  20, textureX, textureY); // RightWingFlapForeSHAPE
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this,  300,  40, textureX, textureY); // RightWingFlapaftSHAPE
		pitchFlapRightWingModel[3] = new ModelRendererTurbo(this,  300,  80, textureX, textureY); // RightWingFlapBack

		pitchFlapRightWingModel[0].addBox(-6F, -1F, -18F, 12, 2, 16, 0F); // RightWingFlapcentre
		pitchFlapRightWingModel[0].setRotationPoint(-53F, -19F, -6.6F);

		pitchFlapRightWingModel[1].addShapeBox(-18F, -1F, -18F, 12, 2, 16, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		pitchFlapRightWingModel[1].setRotationPoint(-53F, -19F, -6.6F);

	pitchFlapRightWingModel[2].addShapeBox(6F, -1F, -18F, 12, 2, 16, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		pitchFlapRightWingModel[2].setRotationPoint(-53F, -19F, -6.6F);

		pitchFlapRightWingModel[3].addBox(-7.3F, -0.4F, 16F, 8, 3, 20, 0F); // RightWingFlapBack
		pitchFlapRightWingModel[3].setRotationPoint(56F, -18F, 22F);
		pitchFlapRightWingModel[3].rotateAngleX = 3.141593F;
		pitchFlapRightWingModel[3].rotateAngleY = -2.617994F;



// Body Wheel
		bodyWheelModel = new ModelRendererTurbo[9];
		bodyWheelModel[0] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // Bodywheel1
		bodyWheelModel[1] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // Bodywheel2
		bodyWheelModel[2] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // Bodywheel3
		bodyWheelModel[3] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // Bodywheel4
		bodyWheelModel[4] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // Bodywheel5
		bodyWheelModel[5] = new ModelRendererTurbo(this,  300,  440, textureX, textureY); // Bodywheel6
		bodyWheelModel[6] = new ModelRendererTurbo(this,  300,  480, textureX, textureY); // Bodywheel7
		bodyWheelModel[7] = new ModelRendererTurbo(this,  400,  0, textureX, textureY); // Bodywheel8
		bodyWheelModel[8] = new ModelRendererTurbo(this,  400,  20, textureX, textureY); // Bodywheel9

		bodyWheelModel[0].addBox(0F, -6F, 0F, 13, 4, 8, 0F); // Bodywheel1
		bodyWheelModel[0].setRotationPoint(-61F, 11F, -4F);

		bodyWheelModel[1].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // Bodywheel2
		bodyWheelModel[1].setRotationPoint(-62F, 14F, -5F);

		bodyWheelModel[2].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // Bodywheel3
		bodyWheelModel[2].setRotationPoint(-49F, 14F, -5F);

		bodyWheelModel[3].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // Bodywheel4
		bodyWheelModel[3].setRotationPoint(-53F, 14F, -5F);

		bodyWheelModel[4].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // Bodywheel5
		bodyWheelModel[4].setRotationPoint(-58F, 14F, -5F);

		bodyWheelModel[5].addBox(0F, -21F, -3F, 5, 20, 6, 0F); // Bodywheel6
		bodyWheelModel[5].setRotationPoint(-60F, 7F, 0F);
		bodyWheelModel[5].rotateAngleZ = -0.1745329F;

		bodyWheelModel[6].addBox(0F, -21F, -2F, 5, 20, 4, 0F); // Bodywheel7
		bodyWheelModel[6].setRotationPoint(-61F, 7F, 0F);
		bodyWheelModel[6].rotateAngleZ = -0.1745329F;

		bodyWheelModel[7].addBox(0F, -21F, -2F, 5, 5, 4, 0F); // Bodywheel8
		bodyWheelModel[7].setRotationPoint(-54F, 7F, 0F);
		bodyWheelModel[7].rotateAngleZ = -0.1745329F;

		bodyWheelModel[8].addBox(1F, -16F, -2F, 3, 15, 2, 0F); // Bodywheel9
		bodyWheelModel[8].setRotationPoint(-54F, 7F, 0F);
		bodyWheelModel[8].rotateAngleZ = -0.1745329F;



// Left Wing Wheel
		leftWingWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel[0] = new ModelRendererTurbo(this,  400,  40, textureX, textureY); // LWwheel1
		leftWingWheelModel[1] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // LWwheel2
		leftWingWheelModel[2] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // LWwheel3
		leftWingWheelModel[3] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // LWwheel4
		leftWingWheelModel[4] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // LWwheel5
		leftWingWheelModel[5] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // LWwheel6
		leftWingWheelModel[6] = new ModelRendererTurbo(this,  400,  100, textureX, textureY); // LWwheel7
		leftWingWheelModel[7] = new ModelRendererTurbo(this,  400,  120, textureX, textureY); // LWwheel8

		leftWingWheelModel[0].addBox(0F, -6F, 0F, 13, 4, 8, 0F); // LWwheel1
		leftWingWheelModel[0].setRotationPoint(35F, 11F, -19F);

		leftWingWheelModel[1].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // LWwheel2
		leftWingWheelModel[1].setRotationPoint(34F, 14F, -20F);

		leftWingWheelModel[2].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // LWwheel3
		leftWingWheelModel[2].setRotationPoint(47F, 14F, -20F);

		leftWingWheelModel[3].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // LWwheel4
		leftWingWheelModel[3].setRotationPoint(43F, 14F, -20F);

		leftWingWheelModel[4].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // LWwheel5
		leftWingWheelModel[4].setRotationPoint(38F, 14F, -20F);

		leftWingWheelModel[5].addBox(0F, -20F, 0F, 3, 22, 6, 0F); // LWwheel6
		leftWingWheelModel[5].setRotationPoint(38F, 6F, -18F);
		leftWingWheelModel[5].rotateAngleZ = 0.541052F;

		leftWingWheelModel[6].addBox(0F, -20F, 0F, 4, 5, 4, 0F); // LWwheel7
		leftWingWheelModel[6].setRotationPoint(40F, 6F, -17F);
		leftWingWheelModel[6].rotateAngleZ = -0.4537856F;

		leftWingWheelModel[7].addBox(1F, -15F, 0F, 2, 15, 2, 0F); // LWwheel8
		leftWingWheelModel[7].setRotationPoint(40F, 6F, -16F);
		leftWingWheelModel[7].rotateAngleZ = -0.4537856F;



// Right Wing Wheel
		rightWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel[0] = new ModelRendererTurbo(this,  400,  40, textureX, textureY); // RWwheel1
		rightWingWheelModel[1] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // RWwheel2
		rightWingWheelModel[2] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // RWwheel3
		rightWingWheelModel[3] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // RWwheel4
		rightWingWheelModel[4] = new ModelRendererTurbo(this,  300,  350, textureX, textureY); // RWwheel5
		rightWingWheelModel[5] = new ModelRendererTurbo(this,  400,  60, textureX, textureY); // RWwheel6
		rightWingWheelModel[6] = new ModelRendererTurbo(this,  400,  100, textureX, textureY); // RWwheel7
		rightWingWheelModel[7] = new ModelRendererTurbo(this,  400,  120, textureX, textureY); // RWwheel8

		rightWingWheelModel[0].addBox(0F, -6F, 0F, 13, 4, 8, 0F); // RWwheel1
		rightWingWheelModel[0].setRotationPoint(35F, 11F, 11F);

		rightWingWheelModel[1].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // RWwheel2
		rightWingWheelModel[1].setRotationPoint(34F, 14F, 10F);

		rightWingWheelModel[2].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // RWwheel3
		rightWingWheelModel[2].setRotationPoint(47F, 14F, 10F);

		rightWingWheelModel[3].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // RWwheel4
		rightWingWheelModel[3].setRotationPoint(43F, 14F, 10F);

		rightWingWheelModel[4].addBox(0F, -6F, 0F, 2, 2, 10, 0F); // RWwheel5
		rightWingWheelModel[4].setRotationPoint(38F, 14F, 10F);

		rightWingWheelModel[5].addBox(0F, -20F, 0F, 3, 22, 6, 0F); // RWwheel6
		rightWingWheelModel[5].setRotationPoint(38F, 6F, 12F);
		rightWingWheelModel[5].rotateAngleZ = 0.541052F;

		rightWingWheelModel[6].addBox(0F, -20F, 0F, 4, 5, 4, 0F); // RWwheel7
		rightWingWheelModel[6].setRotationPoint(40F, 6F, 13F);
		rightWingWheelModel[6].rotateAngleZ = -0.4537856F;

		rightWingWheelModel[7].addBox(1F, -15F, 0F, 2, 15, 2, 0F); // RWwheel8
		rightWingWheelModel[7].setRotationPoint(40F, 6F, 14F);
		rightWingWheelModel[7].rotateAngleZ = -0.4537856F;
	
		
// Propeller
		propellerModels = new ModelRendererTurbo[1][1];
        propellerModels[0][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
        propellerModels[0][0].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
        propellerModels[0][0].setRotationPoint(65F, -23F, -1F);
		
		
		flipAll();

	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}