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

public class ModelFalken extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;	
	
    public ModelFalken()
    {
    	//The y-size of the texture
		//Initializing Model
	
		bodyModel = new ModelRendererTurbo[28];
		bodyModel[0] = new ModelRendererTurbo(this,  169,  1, textureX, textureY); // CR.NoseFlatRight
		bodyModel[1] = new ModelRendererTurbo(this,  433,  1, textureX, textureY); // CR.NoseFlatLeft
		bodyModel[2] = new ModelRendererTurbo(this,  681,  1, textureX, textureY); // CR.CockpitFlatRight
		bodyModel[3] = new ModelRendererTurbo(this,  153,  17, textureX, textureY); // CR.CockpitFlatLeft
		bodyModel[4] = new ModelRendererTurbo(this,  353,  17, textureX, textureY); // CR.InnerWingRight
		bodyModel[5] = new ModelRendererTurbo(this,  529,  25, textureX, textureY); // CR.InnerWingLeft
		bodyModel[6] = new ModelRendererTurbo(this,  897,  1, textureX, textureY); // CR.RightCanardBase
		bodyModel[7] = new ModelRendererTurbo(this,  937,  1, textureX, textureY); // CR.LeftCanardBase
		bodyModel[8] = new ModelRendererTurbo(this,  697,  49, textureX, textureY); // CR.CentralFiller
		bodyModel[9] = new ModelRendererTurbo(this,  265,  57, textureX, textureY); // CR.CentralFillerFront
		bodyModel[10] = new ModelRendererTurbo(this,  929,  41, textureX, textureY); // CR.AirBrake
		bodyModel[11] = new ModelRendererTurbo(this,  73,  89, textureX, textureY); // CR.Cockpit?
		bodyModel[12] = new ModelRendererTurbo(this,  505,  65, textureX, textureY); // CR.Cockpit?Back
		bodyModel[13] = new ModelRendererTurbo(this,  1,  105, textureX, textureY); // CR.FrontofTLS
		bodyModel[14] = new ModelRendererTurbo(this,  137,  105, textureX, textureY); // CR.BehindTLS
		bodyModel[15] = new ModelRendererTurbo(this,  1,  137, textureX, textureY); // CR.CentralFillerAngle
		bodyModel[16] = new ModelRendererTurbo(this,  1,  25, textureX, textureY); // CR.RightThing
		bodyModel[17] = new ModelRendererTurbo(this,  449,  137, textureX, textureY); // CR.LeftThing
		bodyModel[18] = new ModelRendererTurbo(this,  569,  137, textureX, textureY); // CR.LeftTail
		bodyModel[19] = new ModelRendererTurbo(this,  633,  137, textureX, textureY); // CR.LeftTail
		bodyModel[20] = new ModelRendererTurbo(this,  681,  65, textureX, textureY); // CR.Underfuselagething
		bodyModel[21] = new ModelRendererTurbo(this,  265,  41, textureX, textureY); // CR.NoseFillerone
		bodyModel[22] = new ModelRendererTurbo(this,  233,  145, textureX, textureY); // CR.NoseFiller2
		bodyModel[23] = new ModelRendererTurbo(this,  449,  153, textureX, textureY); // CR.NoseFiller3
		bodyModel[24] = new ModelRendererTurbo(this,  921,  161, textureX, textureY); // CR.NoseFiller4
		bodyModel[25] = new ModelRendererTurbo(this,  361,  105, textureX, textureY); // CR.NoseFillerFinal
		bodyModel[26] = new ModelRendererTurbo(this,  201,  81, textureX, textureY); // CR.InnerThingRight
		bodyModel[27] = new ModelRendererTurbo(this,  697,  145, textureX, textureY); // CR.InnerThingLeft


		bodyModel[0].addBox(0F, 0F, 0F, 120, 3, 10, 0F); // CR.NoseFlatRight
		bodyModel[0].setRotationPoint(-258F, -24F, -5F);
		bodyModel[0].rotateAngleY = -0.02094395F;
		bodyModel[0].rotateAngleZ = 0.02181662F;

		bodyModel[1].addBox(0F, 0F, 0F, 120, 3, 10, 0F); // CR.NoseFlatLeft
		bodyModel[1].setRotationPoint(-258F, -24F, -5F);
		bodyModel[1].rotateAngleY = 0.02094395F;
		bodyModel[1].rotateAngleZ = 0.02181662F;

		bodyModel[2].addBox(0F, 0F, -7F, 100, 3, 14, 0F); // CR.CockpitFlatRight
		bodyModel[2].setRotationPoint(-139F, -27F, 0F);
		bodyModel[2].rotateAngleY = -0.1745329F;
		bodyModel[2].rotateAngleZ = 0.02617994F;

		bodyModel[3].addBox(0F, 0F, -7F, 100, 3, 14, 0F); // CR.CockpitFlatLeft
		bodyModel[3].setRotationPoint(-139F, -27F, 0F);
		bodyModel[3].rotateAngleY = 0.1745329F;
		bodyModel[3].rotateAngleZ = 0.02617994F;

		bodyModel[4].addBox(0F, 0F, 0F, 70, 1, 32, 0F); // CR.InnerWingRight
		bodyModel[4].setRotationPoint(-56F, -30F, -14F);
		bodyModel[4].rotateAngleY = -0.7330383F;

		bodyModel[5].addBox(0F, 0F, -32F, 70, 1, 32, 0F); // CR.InnerWingLeft
		bodyModel[5].setRotationPoint(-56F, -30F, 14F);
		bodyModel[5].rotateAngleY = 0.7330383F;

		bodyModel[6].addBox(0F, 0F, -3F, 12, 1, 6, 0F); // CR.RightCanardBase
		bodyModel[6].setRotationPoint(-70F, -30F, -18F);
		bodyModel[6].rotateAngleY = -0.1745329F;

		bodyModel[7].addBox(0F, 0F, -3F, 12, 1, 6, 0F); // CR.LeftCanardBase
		bodyModel[7].setRotationPoint(-70F, -30F, 18F);
		bodyModel[7].rotateAngleY = 0.1745329F;

		bodyModel[8].addBox(0F, 0F, 0F, 70, 1, 40, 0F); // CR.CentralFiller
		bodyModel[8].setRotationPoint(-52F, -30F, -20F);

		bodyModel[9].addBox(0F, 0F, 0F, 70, 1, 20, 0F); // CR.CentralFillerFront
		bodyModel[9].setRotationPoint(-108F, -27F, -10F);
		bodyModel[9].rotateAngleZ = 0.01745329F;

		bodyModel[10].addBox(0F, -0.5F, -8F, 18, 1, 16, 0F); // CR.AirBrake
		bodyModel[10].setRotationPoint(18F, -29.5F, 0F);

		bodyModel[11].addBox(0F, 0F, 0F, 180, 5, 10, 0F); // CR.Cockpit?
		bodyModel[11].setRotationPoint(-258F, -25F, -5F);
		bodyModel[11].rotateAngleZ = 0.1570796F;

		bodyModel[12].addBox(0F, 0F, 0F, 75, 14, 10, 0F); // CR.Cockpit?Back
		bodyModel[12].setRotationPoint(-80F, -53F, -5F);
		bodyModel[12].rotateAngleZ = -0.296706F;

		bodyModel[13].addBox(0F, 0F, 0F, 55, 19, 10, 0F); // CR.FrontofTLS
		bodyModel[13].setRotationPoint(-61F, -14F, -5F);
		bodyModel[13].rotateAngleZ = 2.879793F;

		bodyModel[14].addBox(0F, 0F, 0F, 49, 15, 10, 0F); // CR.BehindTLS
		bodyModel[14].setRotationPoint(-12F, -16.61333F, -5F);
		bodyModel[14].rotateAngleZ = -3.106686F;

		bodyModel[15].addBox(0F, 0F, 0F, 70, 1, 40, 0F); // CR.CentralFillerAngle
		bodyModel[15].setRotationPoint(-52F, -27F, -20F);
		bodyModel[15].rotateAngleZ = 0.03490658F;

		bodyModel[16].addBox(0F, 0F, -4F, 50, 1, 8, 0F); // CR.RightThing
		bodyModel[16].setRotationPoint(20F, -30F, -44F);

		bodyModel[17].addBox(0F, 0F, -4F, 50, 1, 8, 0F); // CR.LeftThing
		bodyModel[17].setRotationPoint(20F, -30F, 45F);

		bodyModel[18].addBox(0F, 0F, 0F, 28, 30, 1, 0F); // CR.LeftTail
		bodyModel[18].setRotationPoint(15F, -57F, -35F);
		bodyModel[18].rotateAngleX = -0.4363323F;

		bodyModel[19].addBox(0F, 0F, 0F, 28, 30, 1, 0F); // CR.LeftTail
		bodyModel[19].setRotationPoint(15F, -57F, 35F);
		bodyModel[19].rotateAngleX = 0.4363323F;

		bodyModel[20].addBox(0F, 0F, 0F, 9, 11, 8, 0F); // CR.Underfuselagething
		bodyModel[20].setRotationPoint(-14F, -28F, -4F);
		bodyModel[20].rotateAngleZ = 0.2082002F;

		bodyModel[21].addBox(0F, 0F, 0F, 19, 4, 10, 0F); // CR.NoseFillerone
		bodyModel[21].setRotationPoint(-228F, -26F, -5F);
		bodyModel[21].rotateAngleZ = 0.1570796F;

		bodyModel[22].addBox(0F, 0F, 0F, 33, 8, 10, 0F); // CR.NoseFiller2
		bodyModel[22].setRotationPoint(-210F, -31F, -5F);
		bodyModel[22].rotateAngleZ = 0.06981317F;

		bodyModel[23].addBox(0F, 0F, 0F, 41, 14, 10, 0F); // CR.NoseFiller3
		bodyModel[23].setRotationPoint(-178F, -37F, -5F);
		bodyModel[23].rotateAngleZ = 0.05235988F;

		bodyModel[24].addBox(0F, 0F, 0F, 37, 17, 10, 0F); // CR.NoseFiller4
		bodyModel[24].setRotationPoint(-137.5F, -43.5F, -5F);
		bodyModel[24].rotateAngleZ = 0.03490658F;

		bodyModel[25].addBox(0F, 0F, 0F, 20, 12, 10, 0F); // CR.NoseFillerFinal
		bodyModel[25].setRotationPoint(-100F, -48F, -5F);
		bodyModel[25].rotateAngleZ = 0.1047198F;

		bodyModel[26].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // CR.InnerThingRight
		bodyModel[26].setRotationPoint(0F, -30F, -24F);

		bodyModel[27].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // CR.InnerThingLeft
		bodyModel[27].setRotationPoint(0F, -30F, 21F);
		
		//Wheels
		bodyWheelModel = new ModelRendererTurbo[3];
		bodyWheelModel[0] = new ModelRendererTurbo(this,  481,  57, textureX, textureY); // LG.WheelCenterRight  481,  57,
		bodyWheelModel[1] = new ModelRendererTurbo(this,  481,  57, textureX, textureY); // LG.WheelCenterLeft
		bodyWheelModel[2] = new ModelRendererTurbo(this,  913,  9, textureX, textureY); // LG.RetractThing

		bodyWheelModel[0].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // LG.WheelCenterRight
		bodyWheelModel[0].setRotationPoint(-58F, 0F, -4F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // LG.WheelCenterLeft
		bodyWheelModel[1].setRotationPoint(-58F, 0F, 1F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // LG.RetractThing
		bodyWheelModel[2].setRotationPoint(-55F, -11F, -2F);
		
		//Nose
		noseModel = new ModelRendererTurbo[2];
		//Nose fuselage
		noseModel[0] = new ModelRendererTurbo(this, 800, 800, textureX, textureY);
		noseModel[0].addTrapezoid(-51F, -16F, -10F, 48, 18, 20, 0.0F, -3.0F, ModelRendererTurbo.MR_RIGHT);
		noseModel[0].setPosition(0F, 5F, 0F);
		//Propeller Centre
		noseModel[1] = new ModelRendererTurbo(this, 172, 12, textureX, textureY);
		noseModel[1].addBox(0F, -2F , 0F, 4, 4, 4, 0.0F);
		noseModel[1].setPosition(-55F, 0F, -2F);
		
		//Tail
		tailModel = new ModelRendererTurbo[14];
		tailModel[0] = new ModelRendererTurbo(this,  441,  97, textureX, textureY); // TL.EngineBodyRight
		tailModel[1] = new ModelRendererTurbo(this,  601,  97, textureX, textureY); // TL.EngineBodyLeft
		tailModel[2] = new ModelRendererTurbo(this,  905,  81, textureX, textureY); // TL.EngineBodyTopLeft
		tailModel[3] = new ModelRendererTurbo(this,  761,  97, textureX, textureY); // TL.EngineBodyTopRight
		tailModel[4] = new ModelRendererTurbo(this,  257,  105, textureX, textureY); // TL.EngineFrontTopAngleLeft
		tailModel[5] = new ModelRendererTurbo(this,  345,  129, textureX, textureY); // TL.EngineFrontTopAngleLeft
		tailModel[6] = new ModelRendererTurbo(this,  881,  49, textureX, textureY); // TL.RightInnerEngineAngle
		tailModel[7] = new ModelRendererTurbo(this,  881,  129, textureX, textureY); // TL.RightInnerEngineCover-Up
		tailModel[8] = new ModelRendererTurbo(this,  977,  129, textureX, textureY); // TL.LeftOuterEngineCover-Up
		tailModel[9] = new ModelRendererTurbo(this,  929,  129, textureX, textureY); // TL.LeftInnerEngineCover-Up
		tailModel[10] = new ModelRendererTurbo(this,  185,  137, textureX, textureY); // TL.RightOuterEngineCover-Up
		tailModel[11] = new ModelRendererTurbo(this,  57,  65, textureX, textureY); // TL.RightOuterEngineAngle
		tailModel[12] = new ModelRendererTurbo(this,  105,  65, textureX, textureY); // TL.LeftOuterEngineAngle
		tailModel[13] = new ModelRendererTurbo(this,  153,  65, textureX, textureY); // TL.LeftInnerEngineAngle

		tailModel[0].addBox(0F, 0F, -8F, 60, 18, 16, 0F); // TL.EngineBodyRight
		tailModel[0].setRotationPoint(-8F, -30F, -32F);

		tailModel[1].addBox(0F, 0F, -8F, 60, 18, 16, 0F); // TL.EngineBodyLeft
		tailModel[1].setRotationPoint(-8F, -30F, 32F);

		tailModel[2].addBox(0F, 0F, -8F, 40, 28, 16, 0F); // TL.EngineBodyTopLeft
		tailModel[2].setRotationPoint(19F, -40F, 32F);

		tailModel[3].addBox(0F, 0F, 0F, 40, 28, 16, 0F); // TL.EngineBodyTopRight
		tailModel[3].setRotationPoint(19F, -40F, -40F);

		tailModel[4].addBox(-2F, 0F, -8F, 34, 18, 16, 0F); // TL.EngineFrontTopAngleLeft
		tailModel[4].setRotationPoint(-11.5F, -30F, 32F);
		tailModel[4].rotateAngleZ = 0.3141593F;

		tailModel[5].addBox(-2F, 0F, -8F, 34, 18, 16, 0F); // TL.EngineFrontTopAngleLeft
		tailModel[5].setRotationPoint(-11.5F, -30F, -32F);
		tailModel[5].rotateAngleZ = 0.3141593F;

		tailModel[6].addBox(0F, 0F, 0F, 20, 20, 1, 0F); // TL.RightInnerEngineAngle
		tailModel[6].setRotationPoint(65F, -40F, -25F);
		tailModel[6].rotateAngleZ = -0.7853982F;

		tailModel[7].addBox(0F, 0F, 0F, 20, 28, 1, 0F); // TL.RightInnerEngineCover-Up
		tailModel[7].setRotationPoint(45F, -40F, -25F);

		tailModel[8].addBox(0F, 0F, 0F, 20, 28, 1, 0F); // TL.LeftOuterEngineCover-Up
		tailModel[8].setRotationPoint(45F, -40F, 40F);

		tailModel[9].addBox(0F, 0F, 0F, 20, 28, 1, 0F); // TL.LeftInnerEngineCover-Up
		tailModel[9].setRotationPoint(45F, -40F, 24F);

		tailModel[10].addBox(0F, 0F, 0F, 20, 28, 1, 0F); // TL.RightOuterEngineCover-Up
		tailModel[10].setRotationPoint(45F, -40F, -40F);

		tailModel[11].addBox(0F, 0F, 0F, 20, 20, 1, 0F); // TL.RightOuterEngineAngle
		tailModel[11].setRotationPoint(65F, -40F, -40F);
		tailModel[11].rotateAngleZ = -0.7853982F;

		tailModel[12].addBox(0F, 0F, 0F, 20, 20, 1, 0F); // TL.LeftOuterEngineAngle
		tailModel[12].setRotationPoint(65F, -40F, 40F);
		tailModel[12].rotateAngleZ = -0.7853982F;

		tailModel[13].addBox(0F, 0F, 0F, 20, 20, 1, 0F); // TL.LeftInnerEngineAngle
		tailModel[13].setRotationPoint(65F, -40F, 24F);
		tailModel[13].rotateAngleZ = -0.7853982F;
		
		//Tail wheel
		tailWheelModel = new ModelRendererTurbo[5];
		tailWheelModel[0] = new ModelRendererTurbo(this,  1009,  1, textureX, textureY); // LG.RightEngineHydraulic
		tailWheelModel[1] = new ModelRendererTurbo(this,  929,  9, textureX, textureY); // LG.LeftEngineHydraulic
		tailWheelModel[2] = new ModelRendererTurbo(this,  945,  9, textureX, textureY); // LG.CenterHydraulic
		tailWheelModel[3] = new ModelRendererTurbo(this,  481,  57, textureX, textureY); // LG.WheelRight
		tailWheelModel[4] = new ModelRendererTurbo(this,  481,  57, textureX, textureY); // LG.WheelLeft

		tailWheelModel[0].addBox(0F, 0F, -1F, 2, 18, 2, 0F); // LG.RightEngineHydraulic
		tailWheelModel[0].setRotationPoint(55F, -12F, -32F);

		tailWheelModel[1].addBox(0F, 0F, -1F, 2, 18, 2, 0F); // LG.LeftEngineHydraulic
		tailWheelModel[1].setRotationPoint(55F, -12F, 32F);

		tailWheelModel[2].addBox(0F, 0F, -1F, 2, 21, 2, 0F); // LG.CenterHydraulic
		tailWheelModel[2].setRotationPoint(-54F, -15F, 0F);

		tailWheelModel[3].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // LG.WheelRight
		tailWheelModel[3].setRotationPoint(51F, 0F, -36F);

		tailWheelModel[4].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // LG.WheelLeft
		tailWheelModel[4].setRotationPoint(51F, 0F, 33F);
		//Left wing
		leftWingModel = new ModelRendererTurbo[2];
		leftWingModel[0] = new ModelRendererTurbo(this,  1,  41, textureX, textureY); // LW.LeftWing
		leftWingModel[1] = new ModelRendererTurbo(this,  209,  169, textureX, textureY); // LW.LeftWingBack

		leftWingModel[0].addBox(0F, 0F, -8F, 100, 1, 16, 0F); // LW.LeftWing
		leftWingModel[0].setRotationPoint(-36F, -30F, 106F);
		leftWingModel[0].rotateAngleY = -0.8377581F;

		leftWingModel[1].addBox(0F, 0F, 0F, 100, 1, 16, 0F); // LW.LeftWingBack
		leftWingModel[1].setRotationPoint(-41F, -30F, 101F);
		leftWingModel[1].rotateAngleY = -0.6981317F;
		//Right wing
		rightWingModel = new ModelRendererTurbo[2];
		rightWingModel[0] = new ModelRendererTurbo(this,  705,  25, textureX, textureY); // RW.RightWing
		rightWingModel[1] = new ModelRendererTurbo(this,  681,  161, textureX, textureY); // RW.RightWingback

		rightWingModel[0].addBox(0F, 0F, -8F, 100, 1, 16, 0F); // RW.RightWing
		rightWingModel[0].setRotationPoint(-36F, -30F, -106F);
		rightWingModel[0].rotateAngleY = 0.8377581F;

		rightWingModel[1].addBox(0F, 0F, 0F, 100, 1, 16, 0F); // RW.RightWingback
		rightWingModel[1].setRotationPoint(-30F, -30F, -112F);
		rightWingModel[1].rotateAngleY = 0.6981317F;

		
        yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this,  985,  1, textureX, textureY); // YF.RightYawFlap
		yawFlapModel[1] = new ModelRendererTurbo(this,  529,  17, textureX, textureY); // YF.LeftYawFlap

		yawFlapModel[0].addBox(0F, 1F, -0.5F, 8, 28, 1, 0F); // YF.RightYawFlap
		yawFlapModel[0].setRotationPoint(43F, -57F, -34.5F);
		yawFlapModel[0].rotateAngleX = -0.4363323F;

		yawFlapModel[1].addBox(0F, 1F, -0.5F, 8, 28, 1, 0F); // YF.LeftYawFlap
		yawFlapModel[1].setRotationPoint(43F, -57F, 35.5F);
		yawFlapModel[1].rotateAngleX = 0.4363323F;
		
		pitchFlapLeftModel = new ModelRendererTurbo[4];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  929,  9, textureX, textureY); // LC.LeftCanardFront
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this,  425,  57, textureX, textureY); // LC.LeftCanardBack
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // LF.BottomThrustVector
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // LF.TopThrustVector

		pitchFlapLeftModel[0].addBox(-11F, 0F, 0F, 11, 1, 26, 0F); // LC.LeftCanardFront
		pitchFlapLeftModel[0].setRotationPoint(-66F, -30F, 21F);
		pitchFlapLeftModel[0].rotateAngleX = 0.4363323F;
		pitchFlapLeftModel[0].rotateAngleY = -0.3141593F;

		pitchFlapLeftModel[1].addBox(-5F, 0F, 0F, 11, 1, 26, 0F); // LC.LeftCanardBack
		pitchFlapLeftModel[1].setRotationPoint(-66F, -30F, 21F);
		pitchFlapLeftModel[1].rotateAngleX = 0.4014257F;
		pitchFlapLeftModel[1].rotateAngleY = -0.03490658F;
		pitchFlapLeftModel[1].rotateAngleZ = 0.08726646F;

		pitchFlapLeftModel[2].addBox(0F, -4F, -7F, 12, 4, 14, 0F); // LF.BottomThrustVector
		pitchFlapLeftModel[2].setRotationPoint(59F, -18F, 32F);
		pitchFlapLeftModel[2].rotateAngleZ = 0.6981317F;

		pitchFlapLeftModel[3].addBox(0F, 0F, -7F, 12, 4, 14, 0F); // LF.TopThrustVector
		pitchFlapLeftModel[3].setRotationPoint(59F, -33F, 32F);
		pitchFlapLeftModel[3].rotateAngleZ = -0.6981317F;
		
		pitchFlapRightModel = new ModelRendererTurbo[4];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,  209,  41, textureX, textureY); // RC.RightCanardFront
		pitchFlapRightModel[1] = new ModelRendererTurbo(this,  1,  65, textureX, textureY); // RC.RightCanardBack
		pitchFlapRightModel[2] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // RF.TopThrustVector
		pitchFlapRightModel[3] = new ModelRendererTurbo(this,  0,  800, textureX, textureY); // RF.BottomThrustVector

		pitchFlapRightModel[0].addBox(-12F, 0F, -25F, 11, 1, 26, 0F); // RC.RightCanardFront
		pitchFlapRightModel[0].setRotationPoint(-66F, -30F, -21F);
		pitchFlapRightModel[0].rotateAngleX = -0.4363323F;
		pitchFlapRightModel[0].rotateAngleY = 0.3141593F;

		pitchFlapRightModel[1].addBox(-6F, 0F, -26F, 11, 1, 26, 0F); // RC.RightCanardBack
		pitchFlapRightModel[1].setRotationPoint(-66F, -30F, -21F);
		pitchFlapRightModel[1].rotateAngleX = -0.4014257F;
		pitchFlapRightModel[1].rotateAngleY = 0.03490658F;
		pitchFlapRightModel[1].rotateAngleZ = 0.08726646F;

		pitchFlapRightModel[2].addBox(0F, 0F, -7F, 12, 4, 14, 0F); // RF.TopThrustVector
		pitchFlapRightModel[2].setRotationPoint(59F, -33F, -32F);
		pitchFlapRightModel[2].rotateAngleZ = -0.6981317F;

		pitchFlapRightModel[3].addBox(0F, -4F, -7F, 12, 4, 14, 0F); // RF.BottomThrustVector
		pitchFlapRightModel[3].setRotationPoint(59F, -18F, -32F);
		pitchFlapRightModel[3].rotateAngleZ = 0.6981317F;
		
		// Propeller
				propellerModels = new ModelRendererTurbo[1][1];
		        propellerModels[0][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
		        propellerModels[0][0].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
		        propellerModels[0][0].setRotationPoint(65F, -23F, -1F);

		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
		

    }
}		
 