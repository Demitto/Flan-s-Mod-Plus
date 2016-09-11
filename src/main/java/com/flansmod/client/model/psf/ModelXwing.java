//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.2.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelXwing extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelXwing()	
	{


		bodyModel = new ModelRendererTurbo[43];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  105, textureX, textureY); // CockpitBase
		bodyModel[1] = new ModelRendererTurbo(this,  0,  129, textureX, textureY); // CockpitWallLeft
		bodyModel[2] = new ModelRendererTurbo(this,  0,  156, textureX, textureY); // CockpitWallRight
		bodyModel[3] = new ModelRendererTurbo(this,  0,  186, textureX, textureY); // CanopySideRight1
		bodyModel[4] = new ModelRendererTurbo(this,  0,  186, textureX, textureY); // CanopySideLeft1
		bodyModel[5] = new ModelRendererTurbo(this,  0,  193, textureX, textureY); // CanopySideLeft2
		bodyModel[6] = new ModelRendererTurbo(this,  0,  193, textureX, textureY); // CanopySideRight2
		bodyModel[7] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // CanopySideLeft3
		bodyModel[8] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // CanopySideRight3
		bodyModel[9] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // NoseCockpitConnect
		bodyModel[10] = new ModelRendererTurbo(this,  0,  256, textureX, textureY); // CanopySideLeft4
		bodyModel[11] = new ModelRendererTurbo(this,  0,  256, textureX, textureY); // CanopySideRight4
		bodyModel[12] = new ModelRendererTurbo(this,  0,  269, textureX, textureY); // CanopyTop2
		bodyModel[13] = new ModelRendererTurbo(this,  0,  292, textureX, textureY); // MainBodyCockpitConnect
		bodyModel[14] = new ModelRendererTurbo(this,  0,  336, textureX, textureY); // CockpitInterior1
		bodyModel[15] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // CockpitInterior2Left
		bodyModel[16] = new ModelRendererTurbo(this,  0,  403, textureX, textureY); // CockpitInterior2Right
		bodyModel[17] = new ModelRendererTurbo(this,  0,  427, textureX, textureY); // CockpitSeatArseprotector
		bodyModel[18] = new ModelRendererTurbo(this,  0,  449, textureX, textureY); // CockpitSeatBackHolder
		bodyModel[19] = new ModelRendererTurbo(this,  0,  485, textureX, textureY); // CockpitSeatHeadrest
		bodyModel[20] = new ModelRendererTurbo(this,  112,  102, textureX, textureY); // NoseBottom
		bodyModel[21] = new ModelRendererTurbo(this,  76,  129, textureX, textureY); // NoseTop
		bodyModel[22] = new ModelRendererTurbo(this,  75,  155, textureX, textureY); // NoseTopLeftBack
		bodyModel[23] = new ModelRendererTurbo(this,  76,  172, textureX, textureY); // NoseTopLeftFront
		bodyModel[24] = new ModelRendererTurbo(this,  57,  185, textureX, textureY); // NoseTopRightBack
		bodyModel[25] = new ModelRendererTurbo(this,  64,  203, textureX, textureY); // NoseTopRightFront
		bodyModel[26] = new ModelRendererTurbo(this,  66,  220, textureX, textureY); // NoseTipTopoldchapLeft
		bodyModel[27] = new ModelRendererTurbo(this,  64,  250, textureX, textureY); // NoseTipTopoldchapRight
		bodyModel[28] = new ModelRendererTurbo(this,  66,  271, textureX, textureY); // NoseTipTopMiddle
		bodyModel[29] = new ModelRendererTurbo(this,  118,  214, textureX, textureY); // MainBody
		bodyModel[30] = new ModelRendererTurbo(this,  91,  292, textureX, textureY); // DownSloperConnectCentre
		bodyModel[31] = new ModelRendererTurbo(this,  91,  316, textureX, textureY); // DownSloperConnectLeft
		bodyModel[32] = new ModelRendererTurbo(this,  147,  316, textureX, textureY); // DownSloperConnectRight
		bodyModel[33] = new ModelRendererTurbo(this,  20,  68, textureX, textureY); // BackEndBottom
		bodyModel[34] = new ModelRendererTurbo(this,  49,  51, textureX, textureY); // BackEndLeft
		bodyModel[35] = new ModelRendererTurbo(this,  60,  51, textureX, textureY); // BackEndRight
		bodyModel[36] = new ModelRendererTurbo(this,  186,  47, textureX, textureY); // BackEndthing
		bodyModel[37] = new ModelRendererTurbo(this,  213,  31, textureX, textureY); // TopDetail1
		bodyModel[38] = new ModelRendererTurbo(this,  216,  48, textureX, textureY); // TopDetail2
		bodyModel[39] = new ModelRendererTurbo(this,  190,  74, textureX, textureY); // TopLeft
		bodyModel[40] = new ModelRendererTurbo(this,  208,  86, textureX, textureY); // TopRight
		bodyModel[41] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TopFront
		bodyModel[42] = new ModelRendererTurbo(this,  26,  29, textureX, textureY); // BackEndTop


		bodyModel[0].addBox(0F, 0F, 0F, 35, 1, 18, 0F); // CockpitBase
		bodyModel[0].setRotationPoint(0F, -16F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 35, 22, 1, 0F); // CockpitWallLeft
		bodyModel[1].setRotationPoint(0F, -38F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 35, 22, 1, 0F); // CockpitWallRight
		bodyModel[2].setRotationPoint(0F, -38F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // CanopySideRight1
		bodyModel[3].setRotationPoint(0F, -38F, 7.9F);
		bodyModel[3].rotateAngleZ = 0.418879F;

		bodyModel[4].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // CanopySideLeft1
		bodyModel[4].setRotationPoint(0F, -38F, -8.9F);
		bodyModel[4].rotateAngleZ = 0.418879F;

		bodyModel[5].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // CanopySideLeft2
		bodyModel[5].setRotationPoint(23.7F, -48.5F, -8.9F);

		bodyModel[6].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // CanopySideRight2
		bodyModel[6].setRotationPoint(23.7F, -48.5F, 7.9F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // CanopySideLeft3
		bodyModel[7].setRotationPoint(36.7F, -48.5F, -8.9F);
		bodyModel[7].rotateAngleZ = -0.7853982F;

		bodyModel[8].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // CanopySideRight3
		bodyModel[8].setRotationPoint(36.7F, -48.5F, 7.9F);
		bodyModel[8].rotateAngleZ = -0.7853982F;

		bodyModel[9].addBox(0F, 0F, 0F, 12, 23, 18, 0F); // NoseCockpitConnect
		bodyModel[9].setRotationPoint(-12F, -38F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // CanopySideLeft4
		bodyModel[10].setRotationPoint(23.7F, -46.5F, -8.9F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // CanopySideRight4
		bodyModel[11].setRotationPoint(23.7F, -46.5F, 7.9F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 1, 17, 0F); // CanopyTop2
		bodyModel[12].setRotationPoint(23.7F, -48.5F, -8.9F);

		bodyModel[13].addBox(0F, 0F, 0F, 26, 23, 18, 0F); // MainBodyCockpitConnect
		bodyModel[13].setRotationPoint(35F, -38F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 9, 21, 16, 0F); // CockpitInterior1
		bodyModel[14].setRotationPoint(-8F, -35F, -8F);
		bodyModel[14].rotateAngleZ = 0.3490658F;

		bodyModel[15].addBox(0F, 0F, 0F, 14, 15, 4, 0F); // CockpitInterior2Left
		bodyModel[15].setRotationPoint(-1F, -35F, -8F);
		bodyModel[15].rotateAngleZ = -0.6108652F;

		bodyModel[16].addBox(0F, 0F, 0F, 14, 15, 4, 0F); // CockpitInterior2Right
		bodyModel[16].setRotationPoint(-1F, -35F, 4F);
		bodyModel[16].rotateAngleZ = -0.6108652F;

		bodyModel[17].addBox(0F, 0F, 0F, 14, 2, 14, 0F); // CockpitSeatArseprotector
		bodyModel[17].setRotationPoint(21F, -18F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 18, 14, 0F); // CockpitSeatBackHolder
		bodyModel[18].setRotationPoint(31F, -34F, -7F);
		bodyModel[18].rotateAngleZ = -0.06981317F;

		bodyModel[19].addBox(0F, 0F, 0F, 5, 5, 8, 0F); // CockpitSeatHeadrest
		bodyModel[19].setRotationPoint(30F, -38F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 111, 7, 18, 0F); // NoseBottom
		bodyModel[20].setRotationPoint(-122F, -29.5F, -9F);
		bodyModel[20].rotateAngleZ = -0.06806784F;

		bodyModel[21].addBox(0F, 0F, 0F, 109, 7, 16, 0F); // NoseTop
		bodyModel[21].setRotationPoint(-120F, -31F, -8F);
		bodyModel[21].rotateAngleZ = 0.06457718F;

		bodyModel[22].addBox(0F, 0F, 0F, 80, 12, 1, 0F); // NoseTopLeftBack
		bodyModel[22].setRotationPoint(-67F, -30.8F, 7.9F);
		bodyModel[22].rotateAngleZ = 0.03490658F;

		bodyModel[23].addBox(0F, 0F, 0F, 109, 7, 1, 0F); // NoseTopLeftFront
		bodyModel[23].setRotationPoint(-120F, -30F, -8.8F);
		bodyModel[23].rotateAngleX = 0.01745329F;
		bodyModel[23].rotateAngleZ = 0.05235988F;

		bodyModel[24].addBox(0F, 0F, 0F, 80, 12, 1, 0F); // NoseTopRightBack
		bodyModel[24].setRotationPoint(-67F, -30.8F, -8.9F);
		bodyModel[24].rotateAngleZ = 0.03490658F;

		bodyModel[25].addBox(0F, 0F, 0F, 109, 7, 1, 0F); // NoseTopRightFront
		bodyModel[25].setRotationPoint(-120F, -30F, 7.8F);
		bodyModel[25].rotateAngleZ = 0.05235988F;

		bodyModel[26].addBox(0F, 0F, 0F, 15, 9, 9, 0F); // NoseTipTopoldchapLeft
		bodyModel[26].setRotationPoint(-125.3F, -31.5F, -9.1F);
		bodyModel[26].rotateAngleZ = 0.05235988F;

		bodyModel[27].addBox(0F, 0F, 0F, 15, 9, 9, 0F); // NoseTipTopoldchapRight
		bodyModel[27].setRotationPoint(-125.3F, -31.5F, 0.1F);
		bodyModel[27].rotateAngleZ = 0.05235988F;

		bodyModel[28].addBox(0F, 0F, 0F, 15, 9, 10, 0F); // NoseTipTopMiddle
		bodyModel[28].setRotationPoint(-125.5F, -31F, -5F);
		bodyModel[28].rotateAngleZ = 0.05235988F;

		bodyModel[29].addBox(0F, 0F, 0F, 58, 31, 18, 0F); // MainBody
		bodyModel[29].setRotationPoint(61F, -38F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 19, 4, 16, 0F); // DownSloperConnectCentre
		bodyModel[30].setRotationPoint(45.8F, -18.9F, -8F);
		bodyModel[30].rotateAngleZ = -0.4537856F;

		bodyModel[31].addBox(0F, -4F, 0F, 19, 8, 8, 0F); // DownSloperConnectLeft
		bodyModel[31].setRotationPoint(46.5F, -19F, -8.9F);
		bodyModel[31].rotateAngleZ = -0.4537856F;

		bodyModel[32].addBox(0F, -4F, 0F, 19, 8, 8, 0F); // DownSloperConnectRight
		bodyModel[32].setRotationPoint(46.5F, -19F, 0.9F);
		bodyModel[32].rotateAngleZ = -0.4537856F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // BackEndBottom
		bodyModel[33].setRotationPoint(119F, -9F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 29, 2, 0F); // BackEndLeft
		bodyModel[34].setRotationPoint(119F, -38F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 29, 2, 0F); // BackEndRight
		bodyModel[35].setRotationPoint(119F, -38F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // BackEndthing
		bodyModel[36].setRotationPoint(119F, -34F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // TopDetail1
		bodyModel[37].setRotationPoint(94F, -39F, -6F);

		bodyModel[38].addBox(0F, 0F, 0F, 15, 1, 10, 0F); // TopDetail2
		bodyModel[38].setRotationPoint(73F, -39F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 52, 2, 2, 0F); // TopLeft
		bodyModel[39].setRotationPoint(66F, -40F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 52, 2, 2, 0F); // TopRight
		bodyModel[40].setRotationPoint(66F, -40F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 2, 18, 0F); // TopFront
		bodyModel[41].setRotationPoint(64F, -38F, -9F);
		bodyModel[41].rotateAngleZ = 0.7679449F;

		bodyModel[42].addBox(0F, 0F, 0F, 3, 2, 18, 0F); // BackEndTop
		bodyModel[42].setRotationPoint(118F, -40F, -9F);		

		leftWingModel = new ModelRendererTurbo[26];
		leftWingModel[0] = new ModelRendererTurbo(this,  233,  310, textureX, textureY); // BottomRightWingStraight
		leftWingModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // TopRightWingStraight
		leftWingModel[2] = new ModelRendererTurbo(this,  118,  264, textureX, textureY); // BottomRightWingEngineConnect
		leftWingModel[3] = new ModelRendererTurbo(this,  39,  384, textureX, textureY); // TopRightWingEngineConnect
		leftWingModel[4] = new ModelRendererTurbo(this,  134,  342, textureX, textureY); // BottomRightEngineIntake
		leftWingModel[5] = new ModelRendererTurbo(this,  163,  294, textureX, textureY); // BottomRightEngineExhaust
		leftWingModel[6] = new ModelRendererTurbo(this,  206,  466, textureX, textureY); // TopRightEngineIntake
		leftWingModel[7] = new ModelRendererTurbo(this,  186,  446, textureX, textureY); // TopRightEngineExhaust
		leftWingModel[8] = new ModelRendererTurbo(this,  362,  244, textureX, textureY); // TopRightWingEngineConnect2
		leftWingModel[9] = new ModelRendererTurbo(this,  271,  215, textureX, textureY); // BottomRightWingEngineConnect2
		leftWingModel[10] = new ModelRendererTurbo(this,  390,  0, textureX, textureY); // TopRightWingPewPewBigbit
		leftWingModel[11] = new ModelRendererTurbo(this,  195,  17, textureX, textureY); // TopRightWingPewPewLongbit
		leftWingModel[12] = new ModelRendererTurbo(this,  0,  40, textureX, textureY); // TopRightWingPewPewBackbit
		leftWingModel[13] = new ModelRendererTurbo(this,  202,  0, textureX, textureY); // TopRightWingPewPewThinbit
		leftWingModel[14] = new ModelRendererTurbo(this,  0,  57, textureX, textureY); // TopRightWingPewPewFBSmid
		leftWingModel[15] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // TopRightWingPewPewFBStop
		leftWingModel[16] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // TopRightWingPewPewFBSBottom
		leftWingModel[17] = new ModelRendererTurbo(this,  0,  71, textureX, textureY); // TopRightWingPewPewbuisnessend
		leftWingModel[18] = new ModelRendererTurbo(this,  390,  0, textureX, textureY); // BottomRightWingPewPewBigbit
		leftWingModel[19] = new ModelRendererTurbo(this,  195,  17, textureX, textureY); // BottomRightWingPewPewLongbit
		leftWingModel[20] = new ModelRendererTurbo(this,  0,  40, textureX, textureY); // BottomRightWingPewPewBackbit
		leftWingModel[21] = new ModelRendererTurbo(this,  202,  0, textureX, textureY); // BottomRightWingPewPewThinbit
		leftWingModel[22] = new ModelRendererTurbo(this,  0,  57, textureX, textureY); // BottomRightWingPewPewFBSmid
		leftWingModel[23] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // BottomRightWingPewPewFBStop
		leftWingModel[24] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // BottomRightWingPewPewFBSbottom
		leftWingModel[25] = new ModelRendererTurbo(this,  0,  71, textureX, textureY); // BottomRightWingPewPewbuisnessend

		leftWingModel[0].addBox(0F, 0F, 0F, 44, 2, 94, 0F); // BottomRightWingStraight
		leftWingModel[0].setRotationPoint(108F, -24F, -8F);
		leftWingModel[0].rotateAngleX = -0.296706F;
		leftWingModel[0].rotateAngleY = 3.141593F;
		leftWingModel[1].addBox(0F, 0F, 0F, 44, 2, 94, 0F); // TopRightWingStraight
		leftWingModel[1].setRotationPoint(108F, -29F, -8F);
		leftWingModel[1].rotateAngleX = 0.296706F;
		leftWingModel[1].rotateAngleY = 3.141593F;
		leftWingModel[2].addBox(0F, 2F, 5F, 35, 4, 23, 0F); // BottomRightWingEngineConnect
		leftWingModel[2].setRotationPoint(99F, -24F, -8F);
		leftWingModel[2].rotateAngleX = -0.296706F;
		leftWingModel[2].rotateAngleY = 3.141593F;
		leftWingModel[3].addBox(0F, -4F, 5F, 35, 4, 23, 0F); // TopRightWingEngineConnect
		leftWingModel[3].setRotationPoint(99F, -29F, -8F);
		leftWingModel[3].rotateAngleX = 0.296706F;
		leftWingModel[3].rotateAngleY = 3.141593F;
		leftWingModel[4].addBox(0F, 6F, 6F, 42, 16, 16, 0F); // BottomRightEngineIntake
		leftWingModel[4].setRotationPoint(99F, -24F, -8F);
		leftWingModel[4].rotateAngleX = -0.296706F;
		leftWingModel[4].rotateAngleY = 3.141593F;
		leftWingModel[5].addBox(0F, 13F, 8F, 31, 9, 9, 0F); // BottomRightEngineExhaust
		leftWingModel[5].setRotationPoint(130F, -24F, -8F);
		leftWingModel[5].rotateAngleX = -0.296706F;
		leftWingModel[5].rotateAngleY = 3.141593F;
		leftWingModel[6].addBox(0F, -20F, 5F, 42, 16, 16, 0F); // TopRightEngineIntake
		leftWingModel[6].setRotationPoint(99F, -29F, -8F);
		leftWingModel[6].rotateAngleX = 0.296706F;
		leftWingModel[6].rotateAngleY = 3.141593F;
		leftWingModel[7].addBox(0F, -20F, 8.5F, 31, 9, 9, 0F); // TopRightEngineExhaust
		leftWingModel[7].setRotationPoint(130F, -29F, -8F);
		leftWingModel[7].rotateAngleX = 0.296706F;
		leftWingModel[7].rotateAngleY = 3.141593F;
		leftWingModel[8].addBox(0F, -4F, 5F, 35, 4, 25, 0F); // TopRightWingEngineConnect2
		leftWingModel[8].setRotationPoint(63.9F, -37F, -41F);
		leftWingModel[9].addBox(0F, -4F, 5F, 35, 4, 24, 0F); // BottomRightWingEngineConnect2
		leftWingModel[9].setRotationPoint(63.9F, -10F, -41F);
		leftWingModel[10].addBox(0F, -8F, 86F, 44, 8, 8, 0F); // TopRightWingPewPewBigbit
		leftWingModel[10].setRotationPoint(108F, -29F, -8F);
		leftWingModel[10].rotateAngleX = 0.296706F;
		leftWingModel[10].rotateAngleY = 3.141593F;
		leftWingModel[11].addBox(0F, -7F, 87F, 94, 6, 6, 0F); // TopRightWingPewPewLongbit
		leftWingModel[11].setRotationPoint(115F, -29F, -8F);
		leftWingModel[11].rotateAngleX = 0.296706F;
		leftWingModel[11].rotateAngleY = 3.141593F;
		leftWingModel[12].addBox(0F, -8F, 86F, 3, 8, 8, 0F); // TopRightWingPewPewBackbit
		leftWingModel[12].setRotationPoint(118F, -29F, -8F);
		leftWingModel[12].rotateAngleX = 0.296706F;
		leftWingModel[12].rotateAngleY = 3.141593F;
		leftWingModel[13].addBox(0F, -6F, 88F, 36, 4, 4, 0F); // TopRightWingPewPewThinbit
		leftWingModel[13].setRotationPoint(21F, -29.2F, -7.9F);
		leftWingModel[13].rotateAngleX = 0.296706F;
		leftWingModel[13].rotateAngleY = 3.141593F;
		leftWingModel[14].addBox(0F, -8F, 88F, 2, 8, 4, 0F); // TopRightWingPewPewFBSmid
		leftWingModel[14].setRotationPoint(-15F, -29F, -8F);
		leftWingModel[14].rotateAngleX = 0.296706F;
		leftWingModel[14].rotateAngleY = 3.141593F;
		leftWingModel[15].addBox(0F, -8F, 88F, 5, 1, 4, 0F); // TopRightWingPewPewFBStop
		leftWingModel[15].setRotationPoint(-17F, -29F, -8F);
		leftWingModel[15].rotateAngleX = 0.296706F;
		leftWingModel[15].rotateAngleY = 3.141593F;
		leftWingModel[16].addBox(0F, -1.0F, 88F, 5, 1, 4, 0F); // TopRightWingPewPewFBSBottom
		leftWingModel[16].setRotationPoint(-17F, -29F, -8F);
		leftWingModel[16].rotateAngleX = 0.296706F;
		leftWingModel[16].rotateAngleY = 3.141593F;
		leftWingModel[17].addBox(0F, -5.0F, 89.3F, 15, 1, 1, 0F); // TopRightWingPewPewbuisnessend
		leftWingModel[17].setRotationPoint(-17F, -29F, -8F);
		leftWingModel[17].rotateAngleX = 0.296706F;
		leftWingModel[17].rotateAngleY = 3.141593F;
		leftWingModel[18].addBox(0F, 2F, 86F, 44, 8, 8, 0F); // BottomRightWingPewPewBigbit
		leftWingModel[18].setRotationPoint(108F, -24F, -8F);
		leftWingModel[18].rotateAngleX = -0.296706F;
		leftWingModel[18].rotateAngleY = 3.141593F;
		leftWingModel[19].addBox(0F, 2F, 87F, 94, 6, 6, 0F); // BottomRightWingPewPewLongbit
		leftWingModel[19].setRotationPoint(115F, -24F, -8F);
		leftWingModel[19].rotateAngleX = -0.296706F;
		leftWingModel[19].rotateAngleY = 3.141593F;
		leftWingModel[20].addBox(0F, 1F, 86F, 3, 8, 8, 0F); // BottomRightWingPewPewBackbit
		leftWingModel[20].setRotationPoint(118F, -24F, -8F);
		leftWingModel[20].rotateAngleX = -0.296706F;
		leftWingModel[20].rotateAngleY = 3.141593F;
		leftWingModel[21].addBox(0F, 3F, 88F, 36, 4, 4, 0F); // BottomRightWingPewPewThinbit
		leftWingModel[21].setRotationPoint(21F, -24F, -8F);
		leftWingModel[21].rotateAngleX = -0.296706F;
		leftWingModel[21].rotateAngleY = 3.141593F;
		leftWingModel[22].addBox(0F, 1F, 88F, 2, 8, 4, 0F); // BottomRightWingPewPewFBSmid
		leftWingModel[22].setRotationPoint(-15F, -24F, -8F);
		leftWingModel[22].rotateAngleX = -0.296706F;
		leftWingModel[22].rotateAngleY = 3.141593F;
		leftWingModel[23].addBox(0F, 1F, 88F, 5, 1, 4, 0F); // BottomRightWingPewPewFBStop
		leftWingModel[23].setRotationPoint(-17F, -24F, -8F);
		leftWingModel[23].rotateAngleX = -0.296706F;
		leftWingModel[23].rotateAngleY = 3.141593F;
		leftWingModel[24].addBox(0F, 8F, 88F, 5, 1, 4, 0F); // BottomRightWingPewPewFBSbottom
		leftWingModel[24].setRotationPoint(-17F, -24F, -8F);
		leftWingModel[24].rotateAngleX = -0.296706F;
		leftWingModel[24].rotateAngleY = 3.141593F;
		leftWingModel[25].addBox(0F, 4.5F, 89.3F, 15, 1, 1, 0F); // BottomRightWingPewPewbuisnessend
		leftWingModel[25].setRotationPoint(-17F, -24F, -8F);
		leftWingModel[25].rotateAngleX = -0.296706F;
		leftWingModel[25].rotateAngleY = 3.176499F;		
		

		rightWingModel = new ModelRendererTurbo[26];
		rightWingModel[0] = new ModelRendererTurbo(this,  0,  414, textureX, textureY); // TopLeftWingStraight
		rightWingModel[1] = new ModelRendererTurbo(this,  234,  407, textureX, textureY); // BottomLeftWingStraight
		rightWingModel[2] = new ModelRendererTurbo(this,  38,  355, textureX, textureY); // TopLeftWingEngineConnect
		rightWingModel[3] = new ModelRendererTurbo(this,  133,  376, textureX, textureY); // BottomLeftWingEngineConnect
		rightWingModel[4] = new ModelRendererTurbo(this,  204,  410, textureX, textureY); // TopLeftEngineIntake
		rightWingModel[5] = new ModelRendererTurbo(this,  244,  320, textureX, textureY); // TopLeftEngineExhaust
		rightWingModel[6] = new ModelRendererTurbo(this,  272,  254, textureX, textureY); // BottomLeftEngineExhaust
		rightWingModel[7] = new ModelRendererTurbo(this,  362,  277, textureX, textureY); // TopLeftWingEngineConnect2
		rightWingModel[8] = new ModelRendererTurbo(this,  391,  214, textureX, textureY); // BottomLeftWingEngineConnect2
		rightWingModel[9] = new ModelRendererTurbo(this,  285,  0, textureX, textureY); // TopLeftPewPewBigbit
		rightWingModel[10] = new ModelRendererTurbo(this,  202,  0, textureX, textureY); // TopLeftPewPewThinbit
		rightWingModel[11] = new ModelRendererTurbo(this,  0,  40, textureX, textureY); // TopLeftPewPewbackbit
		rightWingModel[12] = new ModelRendererTurbo(this,  195,  17, textureX, textureY); // TopLeftPewPewLongbit
		rightWingModel[13] = new ModelRendererTurbo(this,  0,  57, textureX, textureY); // TopLeftPewPewFBSmid
		rightWingModel[14] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // TopLeftPewPewFBStop
		rightWingModel[15] = new ModelRendererTurbo(this,  0,  71, textureX, textureY); // TopLeftPewPewbuisnessend
		rightWingModel[16] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // TopLeftPewPewFBSbottom
		rightWingModel[17] = new ModelRendererTurbo(this,  285,  0, textureX, textureY); // BottomLeftPewPewBigbit
		rightWingModel[18] = new ModelRendererTurbo(this,  195,  17, textureX, textureY); // BottomLeftPewPewLongbit
		rightWingModel[19] = new ModelRendererTurbo(this,  0,  40, textureX, textureY); // BottomLeftPewPewBackbit
		rightWingModel[20] = new ModelRendererTurbo(this,  202,  0, textureX, textureY); // BottomLeftPewPewThinbit
		rightWingModel[21] = new ModelRendererTurbo(this,  0,  57, textureX, textureY); // BottomLeftPewPewFBSmid
		rightWingModel[22] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // BottomLeftPewPewFBStop
		rightWingModel[23] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // BottomLeftPewPewFBSbottom
		rightWingModel[24] = new ModelRendererTurbo(this,  0,  71, textureX, textureY); // BottomLeftPewPewbuisnessend
		rightWingModel[25] = new ModelRendererTurbo(this,  244,  275, textureX, textureY); // BottomLeftEngineIntake


		rightWingModel[0].addBox(0F, 0F, 0F, 44, 2, 94, 0F); // TopLeftWingStraight
		rightWingModel[0].setRotationPoint(64F, -29F, 8F);
		rightWingModel[0].rotateAngleX = 0.296706F;

		rightWingModel[1].addBox(0F, 0F, 0F, 44, 2, 94, 0F); // BottomLeftWingStraight
		rightWingModel[1].setRotationPoint(64F, -24F, 8F);
		rightWingModel[1].rotateAngleX = -0.296706F;

		rightWingModel[2].addBox(0F, -4F, 5F, 35, 4, 23, 0F); // TopLeftWingEngineConnect
		rightWingModel[2].setRotationPoint(64F, -29F, 8F);
		rightWingModel[2].rotateAngleX = 0.296706F;

		rightWingModel[3].addBox(0F, 2F, 5F, 35, 4, 23, 0F); // BottomLeftWingEngineConnect
		rightWingModel[3].setRotationPoint(64F, -24F, 8F);
		rightWingModel[3].rotateAngleX = -0.296706F;

		rightWingModel[4].addBox(0F, -20F, 5F, 42, 16, 16, 0F); // TopLeftEngineIntake
		rightWingModel[4].setRotationPoint(57F, -29F, 8F);
		rightWingModel[4].rotateAngleX = 0.296706F;

		rightWingModel[5].addBox(0F, -20F, 9F, 31, 9, 9, 0F); // TopLeftEngineExhaust
		rightWingModel[5].setRotationPoint(99F, -29F, 8F);
		rightWingModel[5].rotateAngleX = 0.296706F;

		rightWingModel[6].addBox(0F, 13F, 9F, 31, 9, 9, 0F); // BottomLeftEngineExhaust
		rightWingModel[6].setRotationPoint(99F, -24F, 8F);
		rightWingModel[6].rotateAngleX = -0.296706F;

		rightWingModel[7].addBox(0F, -4F, 5F, 35, 4, 25, 0F); // TopLeftWingEngineConnect2
		rightWingModel[7].setRotationPoint(63.9F, -37F, 7F);

		rightWingModel[8].addBox(0F, -4F, 5F, 35, 4, 25, 0F); // BottomLeftWingEngineConnect2
		rightWingModel[8].setRotationPoint(63.9F, -10F, 7F);

		rightWingModel[9].addBox(0F, -8F, 86F, 44, 8, 8, 0F); // TopLeftPewPewBigbit
		rightWingModel[9].setRotationPoint(64F, -29F, 8F);
		rightWingModel[9].rotateAngleX = 0.296706F;

		rightWingModel[10].addBox(0F, -6F, 88F, 36, 4, 4, 0F); // TopLeftPewPewThinbit
		rightWingModel[10].setRotationPoint(-15F, -29F, 8F);
		rightWingModel[10].rotateAngleX = 0.296706F;

		rightWingModel[11].addBox(0F, -8F, 86F, 3, 8, 8, 0F); // TopLeftPewPewbackbit
		rightWingModel[11].setRotationPoint(115F, -29F, 8F);
		rightWingModel[11].rotateAngleX = 0.296706F;

		rightWingModel[12].addBox(0F, -7F, 87F, 94, 6, 6, 0F); // TopLeftPewPewLongbit
		rightWingModel[12].setRotationPoint(21F, -29F, 8F);
		rightWingModel[12].rotateAngleX = 0.296706F;

		rightWingModel[13].addBox(0F, -8F, 88F, 2, 8, 4, 0F); // TopLeftPewPewFBSmid
		rightWingModel[13].setRotationPoint(-17F, -29F, 8F);
		rightWingModel[13].rotateAngleX = 0.296706F;

		rightWingModel[14].addBox(0F, -8F, 88F, 5, 1, 4, 0F); // TopLeftPewPewFBStop
		rightWingModel[14].setRotationPoint(-22F, -29F, 8F);
		rightWingModel[14].rotateAngleX = 0.296706F;

		rightWingModel[15].addBox(-6F, -4.5F, 89.5F, 15, 1, 1, 0F); // TopLeftPewPewbuisnessend
		rightWingModel[15].setRotationPoint(-26F, -29F, 8F);
		rightWingModel[15].rotateAngleX = 0.296706F;

		rightWingModel[16].addBox(0F, -1F, 88F, 5, 1, 4, 0F); // TopLeftPewPewFBSbottom
		rightWingModel[16].setRotationPoint(-22F, -29F, 8F);
		rightWingModel[16].rotateAngleX = 0.296706F;

		rightWingModel[17].addBox(0F, 2F, 86F, 44, 8, 8, 0F); // BottomLeftPewPewBigbit
		rightWingModel[17].setRotationPoint(64F, -24F, 8F);
		rightWingModel[17].rotateAngleX = -0.296706F;

		rightWingModel[18].addBox(0F, 3F, 87F, 94, 6, 6, 0F); // BottomLeftPewPewLongbit
		rightWingModel[18].setRotationPoint(21F, -25F, 8F);
		rightWingModel[18].rotateAngleX = -0.296706F;

		rightWingModel[19].addBox(0F, 2F, 86F, 3, 8, 8, 0F); // BottomLeftPewPewBackbit
		rightWingModel[19].setRotationPoint(115F, -24F, 8F);
		rightWingModel[19].rotateAngleX = -0.296706F;

		rightWingModel[20].addBox(0F, 4F, 88F, 36, 4, 4, 0F); // BottomLeftPewPewThinbit
		rightWingModel[20].setRotationPoint(-15F, -25F, 8F);
		rightWingModel[20].rotateAngleX = -0.296706F;

		rightWingModel[21].addBox(0F, 2F, 88F, 2, 8, 4, 0F); // BottomLeftPewPewFBSmid
		rightWingModel[21].setRotationPoint(-17F, -25F, 8F);
		rightWingModel[21].rotateAngleX = -0.296706F;

		rightWingModel[22].addBox(0F, 2F, 88F, 5, 1, 4, 0F); // BottomLeftPewPewFBStop
		rightWingModel[22].setRotationPoint(-22F, -25F, 8F);
		rightWingModel[22].rotateAngleX = -0.296706F;

		rightWingModel[23].addBox(0F, 9F, 88F, 5, 1, 4, 0F); // BottomLeftPewPewFBSbottom
		rightWingModel[23].setRotationPoint(-22F, -25F, 8F);
		rightWingModel[23].rotateAngleX = -0.296706F;

		rightWingModel[24].addBox(0F, 5.5F, 89.5F, 15, 1, 1, 0F); // BottomLeftPewPewbuisnessend
		rightWingModel[24].setRotationPoint(-32F, -25F, 8F);
		rightWingModel[24].rotateAngleX = -0.296706F;

		rightWingModel[25].addBox(0F, 6F, 5F, 42, 16, 16, 0F); // BottomLeftEngineIntake
		rightWingModel[25].setRotationPoint(57F, -24F, 8F);
		rightWingModel[25].rotateAngleX = -0.296706F;		
		

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